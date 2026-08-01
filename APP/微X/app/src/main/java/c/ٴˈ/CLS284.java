// Decompiled by JEB v5.42.0.202606242140

package c.ٴˈ;

import android.text.TextUtils;
import c.ـˉ.CLS204;

public class CLS284 {
    public String FLD1235;
    public String FLD1236;
    public String FLD1237;
    public String FLD1238;

    // 此方法包含解密的字符串
    public CLS284() {
        this.FLD1236 = "";
        this.FLD1235 = "";
        this.FLD1237 = "";
        this.FLD1238 = "";
    }

    // 此方法包含解密的字符串
    public CLS284(String s) {
        String s1 = "";
        super();
        this.FLD1236 = "";
        this.FLD1235 = "";
        this.FLD1237 = "";
        this.FLD1238 = "";
        if(TextUtils.isEmpty(s)) {
            return;
        }
        if(s.contains("\uD8E3[") && s.contains("\uD8E3]")) {
            int v = s.indexOf("\uD8E3[");
            int v1 = s.lastIndexOf("\uD8E3]");
            String s2 = s.substring(v + 2, v1);
            s = s.substring(0, v) + s.substring(v1 + 2);
            s1 = s2;
        }
        String s3 = "";
        if(s.contains("\uD8E3") && s.contains("\uD8E3")) {
            int v2 = s.indexOf("\uD8E3");
            int v3 = s.lastIndexOf("\uD8E3");
            String s4 = s.substring(v2 + 1, v3);
            s = s.substring(0, v2) + s.substring(v3 + 1);
            s3 = s4;
        }
        String s5 = "";
        if(s.contains("\uD8E3(") && s.contains("\uD8E3)")) {
            int v4 = s.indexOf("\uD8E3(");
            int v5 = s.lastIndexOf("\uD8E3)");
            String s6 = s.substring(v4 + 2, v5);
            s = s.substring(0, v4) + s.substring(v5 + 2);
            s5 = s6;
        }
        this.FLD1236 = s.trim();
        this.FLD1237 = s3.trim();
        this.FLD1235 = s1.trim();
        this.FLD1238 = s5.trim();
    }

    // 此方法包含解密的字符串
    @Override
    public String toString() [...] // 潜在的解密器

    public String MTH4223() [...] // 潜在的解密器

    public void MTH4224(String s) {
        this.FLD1235 = s;
    }

    public String MTH4225() [...] // 潜在的解密器

    public void MTH4226(String s) {
        this.FLD1236 = s;
    }

    // 此方法包含解密的字符串
    public String MTH4227(String s) {
        try {
            int v = s.indexOf("\uD8E3/font></b>");
            String s1 = s.substring(s.indexOf("\uD8E3font"), v);
            return s.substring(0, s.indexOf("\uD8E3b><font color=")) + s1.substring(s1.indexOf("\uD8E3") + 1) + s.substring(v + 11);
        }
        catch(Throwable throwable0) {
            CLS204.MTH3257(throwable0);
            return s;
        }
    }

    public String MTH4228() [...] // 潜在的解密器

    // 此方法包含解密的字符串
    public void MTH4229(String s) {
        this.MTH4230(s, "\uD8E3FFC300");
    }

    // 去混淆评级： 低(30)
    // 此方法包含解密的字符串
    public void MTH4230(String s, String s1) {
        this.FLD1235 = this.FLD1235.replaceAll(s, "\uD8E3b><font color=\'" + s1 + "\uD8E3>" + s + "\uD8E3/font></b>");
    }

    public void MTH4231(String s) {
        this.FLD1238 = s;
    }

    public String MTH4232() [...] // 潜在的解密器
}

