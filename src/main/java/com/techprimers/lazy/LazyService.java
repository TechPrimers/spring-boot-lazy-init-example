package com.techprimers.lazy;

import org.springframework.stereotype.Service;

//@Lazy
@Service
public class LazyService {

    public LazyService() {
        System.out.println("Lazy Service:: Constructor loaded");
    }

    public String hello() {
        return "Kubernetes en Google Cloud";
    }
}
