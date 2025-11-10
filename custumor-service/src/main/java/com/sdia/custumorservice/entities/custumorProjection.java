package com.sdia.custumorservice.entities;

import org.springframework.data.rest.core.config.Projection;

@Projection(name ="all",types= custumor.class)
public interface custumorProjection {
    String getName();
    String getEmail();

}
