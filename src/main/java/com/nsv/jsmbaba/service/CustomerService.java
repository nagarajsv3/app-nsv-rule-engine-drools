package com.nsv.jsmbaba.service;

import com.nsv.jsmbaba.domain.Customer;
import org.kie.api.KieServices;
import org.kie.api.runtime.KieContainer;
import org.kie.api.runtime.KieSession;
import org.springframework.stereotype.Service;

@Service
public class CustomerService {

    public Customer executecerules(Customer customer) {
        KieContainer kieContainer = getMeAKieContainer();
        KieSession kieSession = kieContainer.newKieSession("ksession-ce-rules");
        kieSession.insert(customer);
        kieSession.fireAllRules();
        kieSession.dispose();
        return customer;
    }

    private KieContainer getMeAKieContainer() {
        KieServices ks = KieServices.Factory.get();
        KieContainer kContainer = ks.getKieClasspathContainer();
        return kContainer;
    }
}
