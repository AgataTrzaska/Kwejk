package com.akademiakodu.kwejk.data;

import com.akademiakodu.kwejk.model.Gif;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;

@Component//tworzy bina, czyli obiekt ktory bedziemy wstrzykiwac w inna klase
public class GifRepository {

public final static List<Gif> ALL_GIFS= Arrays.asList(
        new Gif("infinite-andrew", "USERNAME", true, 1),
        new Gif("cowboy-coder", "USERNAME", false, 2),
        new Gif("compiler-bot", "USERNAME", true, 1),
        new Gif("book-dominos", "USERNAME", false, 3),
        new Gif("ben-and-mike", "USERNAME", true, 1),
        new Gif("android-explosion", "USERNAME", true, 1)
);

  public static List<Gif> getAllGifs(){
      return ALL_GIFS;
        }}

