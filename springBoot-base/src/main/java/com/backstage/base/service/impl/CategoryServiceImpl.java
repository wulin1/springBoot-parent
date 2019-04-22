package com.backstage.base.service.impl;

import com.backstage.base.mapper.CategoryMapper;
import com.backstage.base.models.Category;
import com.backstage.base.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class CategoryServiceImpl implements CategoryService {
    @Autowired
    CategoryMapper categoryMapper;

    public List<Category> findAll() {
        return categoryMapper.findAll();
    }
    public void delete(int id) {
        categoryMapper.delete(id);
    }
    public void update(Category category) {
        categoryMapper.update(category);
    }
    public void add(Category category) {
        categoryMapper.add(category);
    }
    public Category findById(int id) {
        return categoryMapper.findById(id);
    }
}
