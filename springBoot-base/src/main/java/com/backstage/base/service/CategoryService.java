package com.backstage.base.service;


import com.backstage.base.models.Category;

import java.util.List;

public interface CategoryService {
    List<Category> findAll();
    void delete(int id);
    void update(Category category);
    void add(Category category);
    Category findById(int id);
}
