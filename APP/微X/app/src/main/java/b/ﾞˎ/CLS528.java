// Decompiled by JEB v5.42.0.202606242140

package b.ﾞˎ;

import android.text.TextUtils;
import b.ᐧˉ.CLS182;

public final class CLS528 {
    public String FLD5165;
    public String FLD5166;
    public String FLD5167;
    public String FLD5168;

    // 此方法包含解密的字符串
    public CLS528() {
        this.FLD5165 = "";
        this.FLD5167 = "";
        this.FLD5166 = "";
        this.FLD5168 = "";
    }

    // 此方法包含解密的字符串
    public CLS528(String s) {
        String s1 = "";
        super();
        this.FLD5165 = "";
        this.FLD5167 = "";
        this.FLD5166 = "";
        this.FLD5168 = "";
        if(TextUtils.isEmpty(s)) {
            return;
        }
        if(s.contains("[[") && s.contains("]]")) {
            int v = s.indexOf("[[");
            int v1 = s.lastIndexOf("]]");
            s1 = s.substring(v + 2, v1);
            s = CLS182.MTH3495(s, 0, v, new StringBuilder(), v1, 2);
        }
        String s2 = s;
        String s3 = "";
        if(s2.contains("{") && s2.contains("}")) {
            int v2 = s2.indexOf("{");
            int v3 = s2.lastIndexOf("}");
            s3 = s2.substring(v2 + 1, v3);
            s2 = CLS182.MTH3495(s2, 0, v2, new StringBuilder(), v3, 1);
        }
        String s4 = "";
        if(s2.contains("((") && s2.contains("))")) {
            int v4 = s2.indexOf("((");
            int v5 = s2.lastIndexOf("))");
            s4 = s2.substring(v4 + 2, v5);
            s2 = CLS182.MTH3495(s2, 0, v4, new StringBuilder(), v5, 2);
        }
        this.FLD5165 = s2.trim();
        this.FLD5166 = s3.trim();
        this.FLD5167 = s1.trim();
        this.FLD5168 = s4.trim();
    }

    // 此方法包含解密的字符串
    @Override
    public final String toString() [...] // 潜在的解密器
}

