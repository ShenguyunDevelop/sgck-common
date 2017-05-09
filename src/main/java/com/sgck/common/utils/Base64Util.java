package com.sgck.common.utils;

import java.io.UnsupportedEncodingException;

import sun.misc.BASE64Decoder;
import sun.misc.BASE64Encoder;

public class Base64Util {

	public static final String   BASE64_SG_CHARS   =  "fckD3V74jteRWu2+5i6slzLmFTYASygIOvh0KBX/rEJnwNbaG1pCqUZQ8M9dPoxH=";
	public static final String   BASE64_CHARS   =  "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/=";
	
	
	public static String getSgBase64Encode(String str){
		
 		String re = "";
		for (int i=0;i<str.length();i++){
			
			int   index = BASE64_CHARS.indexOf(  str.charAt(i));
			String chStr = BASE64_SG_CHARS.substring(index, index + 1);
			re += chStr;
		}
		return re;
	}
	
	// 加密  
    public static String getBase64(String str) {  
        byte[] b = null;  
        String s = null;  
        try {  
            b = str.getBytes("utf-8");  
        } catch (UnsupportedEncodingException e) {  
            e.printStackTrace();  
        }  
        if (b != null) {  
            s = new BASE64Encoder().encode(b);  
        }  
        return s;  
    }  
  
    // 解密  
    public static String getFromBase64(String s) {  
        byte[] b = null;  
        String result = null;  
        if (s != null) {  
            BASE64Decoder decoder = new BASE64Decoder();  
            try {  
                b = decoder.decodeBuffer(s);  
                result = new String(b, "utf-8");  
            } catch (Exception e) {  
                e.printStackTrace();  
            }  
        }  
        return result;  
    }  
}
