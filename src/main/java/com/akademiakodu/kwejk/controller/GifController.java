package com.akademiakodu.kwejk.controller;

import com.akademiakodu.kwejk.data.GifRepository;
import com.akademiakodu.kwejk.model.Gif;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller//bez niego bedziemy 404 ciągle otrzymywać
public class GifController {

    @Autowired
    GifRepository gifRepository;

    @RequestMapping("/")
    public String listGifs(ModelMap modelMap){
        //1 wyciąganie gifow
        List<Gif> gifs =gifRepository.getAllGifs();
        // 2 przekazanie gifa do view
        modelMap.put("gifs", gifs);
        return "home";
    }
}
