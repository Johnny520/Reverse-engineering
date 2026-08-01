// Decompiled by JEB v5.42.0.202606242140

package c.ᴵˉ;

import android.text.TextUtils;
import c.ˏᵎ.CLS185;

public class CLS284 {
    public String FLD1161;
    public String FLD1162;
    public String FLD1163;
    public String FLD1164;

    // 此方法包含解密的字符串
    public CLS284() {
        this.FLD1163 = "";
        this.FLD1164 = "";
        this.FLD1161 = "";
        this.FLD1162 = "";
    }

    // 此方法包含解密的字符串
    public CLS284(String s) {
        String s1 = "";
        super();
        this.FLD1163 = "";
        this.FLD1164 = "";
        this.FLD1161 = "";
        this.FLD1162 = "";
        if(TextUtils.isEmpty(s)) {
            return;
        }
        if(s.contains("[[") && s.contains("]]")) {
            int v = s.indexOf("[[");
            int v1 = s.lastIndexOf("]]");
            String s2 = s.substring(v + 2, v1);
            s = s.substring(0, v) + s.substring(v1 + 2);
            s1 = s2;
        }
        String s3 = "";
        if(s.contains("{") && s.contains("}")) {
            int v2 = s.indexOf("{");
            int v3 = s.lastIndexOf("}");
            String s4 = s.substring(v2 + 1, v3);
            s = s.substring(0, v2) + s.substring(v3 + 1);
            s3 = s4;
        }
        String s5 = "";
        if(s.contains("((") && s.contains("))")) {
            int v4 = s.indexOf("((");
            int v5 = s.lastIndexOf("))");
            String s6 = s.substring(v4 + 2, v5);
            s = s.substring(0, v4) + s.substring(v5 + 2);
            s5 = s6;
        }
        this.FLD1163 = s.trim();
        this.FLD1161 = s3.trim();
        this.FLD1164 = s1.trim();
        this.FLD1162 = s5.trim();
    }

    // 此方法包含解密的字符串
    @Override
    public String toString() [...] // 潜在的解密器

    public String MTH3660() [...] // 潜在的解密器

    public void MTH3661(String s) {
        this.FLD1163 = s;
    }

    public void MTH3662(String s) {
        this.FLD1164 = s;
    }

    public String MTH3663() [...] // 潜在的解密器

    public void MTH3664(String s) {
        this.FLD1162 = s;
    }

    // 去混淆评级： 低(30)
    // 此方法包含解密的字符串
    public void MTH3665(String s, String s1) {
        this.FLD1164 = this.FLD1164.replaceAll(s, "<b><font color=\'" + s1 + "\'>" + s + "</font></b>");
    }

    // 此方法包含解密的字符串
    public String MTH3666(String s) {
        try {
            int v = s.indexOf("</font></b>");
            String s1 = s.substring(s.indexOf("<font"), v);
            return s.substring(0, s.indexOf("<b><font color=")) + s1.substring(s1.indexOf(">") + 1) + s.substring(v + 11);
        }
        catch(Throwable throwable0) {
            CLS185.MTH2708(throwable0);
            return s;
        }
    }

    public String MTH3667() [...] // 潜在的解密器

    // 此方法包含解密的字符串
    public void MTH3668(String s) {
        this.MTH3665(s, "#FFC300");
    }

    public String MTH3669() [...] // 潜在的解密器
}

