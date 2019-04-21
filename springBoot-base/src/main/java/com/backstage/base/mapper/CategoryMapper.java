package com.backstage.base.mapper;


import com.backstage.base.models.Category;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Mapper
public interface CategoryMapper {
    List<Category> findAll();

    void delete(int id);

    void update(Category category);

    void add(Category category);

    Category findById(int id);
}