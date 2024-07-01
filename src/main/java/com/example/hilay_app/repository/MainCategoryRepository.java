package com.example.hilay_app.repository;

import com.example.hilay_app.entity.MainCategory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MainCategoryRepository extends JpaRepository<MainCategory,Long> {

    MainCategory findByMainCategoryName(String name);

}
