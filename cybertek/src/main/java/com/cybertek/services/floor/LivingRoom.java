package com.cybertek.services.floor;

import com.cybertek.interfaces.floorTypes.Floor;
import org.springframework.beans.factory.annotation.Value;

import java.math.BigDecimal;

public class LivingRoom implements Floor {

    @Value("${width}")
    private BigDecimal width;

    @Value("${length}")
    private BigDecimal length;

    @Override
    public BigDecimal getArea() {
        return width.multiply(length);
    }
}
