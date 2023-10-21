package com.leo.stockresearch.Service;


import com.leo.stockresearch.model.Company;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class CompanyService {

    private static final String API_URL = "https://financialmodelingprep.com/api/v3/quote-order/AAPL?apikey=MDwsSVxFgZcoWpUnEWm9r0OznA53aOlR";

    public Company getCompanyData() {
        RestTemplate restTemplate = new RestTemplate();
        Company[] companies = restTemplate.getForObject(API_URL, Company[].class);
        return companies[0]; // Assuming the API returns a single company for the provided endpoint
    }

    public boolean isBelowIntrinsicValue(Company company) {
        double intrinsicValue = company.getEps() * company.getPe();
        return company.getCurrentPrice() < intrinsicValue;
    }
}