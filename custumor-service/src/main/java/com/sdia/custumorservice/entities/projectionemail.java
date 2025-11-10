package com.sdia.custumorservice.entities;

import org.springframework.data.rest.core.config.Projection;

@Projection(name="email",types=custumor.class)
public interface projectionemail {

    String getEmail();

}




