package com.test.test.mapper;

import com.test.test.vo.CoffeesVo;
import org.apache.ibatis.annotations.*;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface CoffeesMapper {

    // XMl 관련 매핑 설정
    List<CoffeesVo> getCoffeesListXml();
    CoffeesVo getCoffeeXml(@Param("language_id") int language_id);
    int postCoffeeXml(@Param("name")String name);
    int updateCoffeeXml(String arg0, int arg1);
    int deleteCoffeeXml(@Param("language_id") int language_id);


    // 어노테이션 관련 매핑 설정
    @Select("SELECT * FROM language")
    List<CoffeesVo> getCoffeesList();

    @Select("SELECT * FROM language where language_id = #{language_id}")
    CoffeesVo getCoffee(@Param("language_id") int language_id);

    @Insert("insert into language(name) values (#{name})")
    int postCoffee(@Param("name")String name);

    @Update("UPDATE language SET name=#{arg0} where language_id=#{arg1}")
    int updateCoffee(String arg0, int arg1);

    @Delete("delete from language where language_id=#{language_id}")
    int deleteCoffee(@Param("language_id") int language_id);

}
