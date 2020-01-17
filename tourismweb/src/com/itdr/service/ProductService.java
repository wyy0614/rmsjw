package com.itdr.service;

import com.itdr.common.ResponseCode;

public interface ProductService {

    ResponseCode getAllProduct();

    ResponseCode toType(String id);

    ResponseCode fuzzySearch(String key);
}
