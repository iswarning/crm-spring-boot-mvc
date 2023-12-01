package com.example.demo.utils;

import org.springframework.util.StringUtils;

public class MyUtils
{
  // check if string contain number
  public static Integer stringContainDigit(final String str) {                
    
    if(StringUtils.hasText(str))
    {
      for(char c : str.toCharArray()){
          if(Character.isDigit(c)){
              return 1;
          }
      }
      return 0;
    }
    
    return -1;
  }
}
