package com.backstage.api.controller;

import com.backstage.base.models.Category;
import com.backstage.base.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/")
public class MainController {
    @Autowired
    CategoryService categoryService;

    //获取
    @GetMapping("/category")
    public List<Category> list() {
        List<Category> categories = categoryService.findAll();
        return categories;
    }

    //获取
    @GetMapping("/category/{id}")
    public Category getCategory(@PathVariable("id") int id) {
        Category category = categoryService.findById(id);
        return category;
    }

    //删除
    @DeleteMapping("/category/{id}")
    public String deleteCategory(@PathVariable("id") int id) {
        categoryService.delete(id);
        return "true";
    }

    //添加
    @PutMapping("/category")
    public String addCategory(Category category) {
        categoryService.add(category);
        return "true";
    }

    //修改
    @PostMapping("/category/{id}")
    public String updateCategory(@PathVariable("id") int id, Category category) {
        Category category1 = categoryService.findById(id);
        category1.setName(category.getName());
        categoryService.update(category1);
        return "true";
    }
}