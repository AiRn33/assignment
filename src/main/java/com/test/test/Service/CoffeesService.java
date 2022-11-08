package com.test.test.Service;

import com.test.test.mapper.CoffeesMapper;
import com.test.test.vo.CoffeesVo;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class CoffeesService {

    private final CoffeesMapper mapper;

    public List<CoffeesVo> getCoffeesList(){

        List<CoffeesVo> coffees = mapper.getCoffeesList();

        if(coffees.isEmpty()){
            coffees.add(new CoffeesVo("커피가 존재하지 않습니다"));
        }
        return coffees;
    }

    public CoffeesVo getCoffees(int id) {

        return Optional.ofNullable(mapper.getCoffee(id)).orElse(new CoffeesVo("해당 커피 데이터가없습니다"));
    }

    public int postCoffee(String name){

        return mapper.postCoffee(name);
    }

    public int updateCoffee(String name,int language_id){

        return mapper.updateCoffee(name,language_id);
    }

    public int deleteCoffee(int language_id) {

        return mapper.deleteCoffee(language_id);
    }

    public List<CoffeesVo> getCoffeesListXml(){
        List<CoffeesVo> coffees = mapper.getCoffeesListXml();

        if(coffees.isEmpty()){
            coffees.add(new CoffeesVo("커피가 존재하지 않습니다"));
        }
        return coffees;
    }

    public CoffeesVo getCoffeeXml(int language_id){

        return mapper.getCoffeeXml(language_id);
    }

    public int postCoffeeXml(String name){

        return mapper.postCoffeeXml(name);
    }


    public int updateCoffeeXml(String name, int language_id) {

        return mapper.updateCoffeeXml(name, language_id);
    }

    public int deleteCoffeeXml(int language_id) {

        return mapper.deleteCoffeeXml(language_id);
    }
}
