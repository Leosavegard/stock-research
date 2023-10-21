package com.leo.stockresearch.Controller;

import com.leo.stockresearch.Service.CompanyService;
import com.leo.stockresearch.model.Company;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/companies")
public class CompanyController {

    @Autowired
    private CompanyService companyService;

    @GetMapping("/belowIntrinsicValue")
    public ResponseEntity<Company> getCompanyBelowIntrinsicValue() {
        Company company = companyService.getCompanyData();
        if (companyService.isBelowIntrinsicValue(company)) {
            return ResponseEntity.ok(company);
        } else {
            return ResponseEntity.noContent().build();
        }
    }
}
