// Decompiled by JEB v5.42.0.202606242140

package d.ٴˑ;

import android.text.TextUtils;
import d.יʻ.CLS71;

public final class CLS99 {
    public String FLD570;
    public String FLD571;
    public final String FLD572;
    public final String FLD573;

    public CLS99() {
        this.FLD571 = "";
        this.FLD570 = "";
        this.FLD573 = "";
        this.FLD572 = "";
    }

    public CLS99(String s) {
        String s4;
        String s3;
        String s2;
        String s1 = "";
        this.FLD571 = "";
        this.FLD570 = "";
        this.FLD573 = "";
        this.FLD572 = "";
        if(TextUtils.isEmpty(s)) {
            return;
        }
        if(!s.contains("[[") || !s.contains("]]")) {
            s3 = s;
            s2 = "";
        }
        else {
            int v = s.indexOf("[[");
            int v1 = s.lastIndexOf("]]");
            s2 = s.substring(v + 2, v1);
            s3 = CLS71.MTH825(s, 0, v, new StringBuilder(), v1, 2);
        }
        if(!s3.contains("{") || !s3.contains("}")) {
            s4 = "";
        }
        else {
            int v2 = s3.indexOf("{");
            int v3 = s3.lastIndexOf("}");
            s4 = s3.substring(v2 + 1, v3);
            s3 = CLS71.MTH825(s3, 0, v2, new StringBuilder(), v3, 1);
        }
        if(s3.contains("((") && s3.contains("))")) {
            int v4 = s3.indexOf("((");
            int v5 = s3.lastIndexOf("))");
            s1 = s3.substring(v4 + 2, v5);
            s3 = CLS71.MTH825(s3, 0, v4, new StringBuilder(), v5, 2);
        }
        this.FLD571 = s3.trim();
        this.FLD573 = s4.trim();
        this.FLD570 = s2.trim();
        this.FLD572 = s1.trim();
    }

    @Override
    public final String toString() [...] // 潜在的解密器
}

