package com.example.lotterysystem.dao.dataobject;

import lombok.Data;

/**
 * @author: yibo
 */
@Data
public class Encrypt {
    private String value;
    public Encrypt() {}
    public Encrypt(String value) {
        this.value = value;
    }
}
