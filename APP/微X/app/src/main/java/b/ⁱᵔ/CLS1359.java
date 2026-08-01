// Decompiled by JEB v5.42.0.202606242140

package b.ⁱᵔ;

import android.text.TextUtils;
import b.ʻˑ.CLS11;
import b.ʾᵢ.CLS27;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONObject;

public final class CLS1359 implements CLS11 {
    public final ArrayList FLD3791;

    public CLS1359(ArrayList arrayList0) {
        this.FLD3791 = arrayList0;
        super();
    }

    @Override  // b.ʻˑ.CLS11
    public final void MTH789() {
    }

    // 此方法包含解密的字符串
    @Override  // b.ʻˑ.CLS11
    public final void MTH790() {
        JSONArray jSONArray0 = new JSONArray();
        for(Object object0: this.FLD3791) {
            String s = (String)object0;
            try {
                String s1 = "";
                new String("");
                String s2 = "";
                String s3 = "";
                String s4 = "";
                if(!TextUtils.isEmpty(s)) {
                    if(s.contains("[[") && s.contains("]]")) {
                        int v = s.indexOf("[[");
                        int v1 = s.lastIndexOf("]]");
                        String s5 = s.substring(v + 2, v1);
                        s = s.substring(0, v) + s.substring(v1 + 2);
                        s1 = s5;
                    }
                    String s6 = "";
                    if(s.contains("{") && s.contains("}")) {
                        int v2 = s.indexOf("{");
                        int v3 = s.lastIndexOf("}");
                        String s7 = s.substring(v2 + 1, v3);
                        s = s.substring(0, v2) + s.substring(v3 + 1);
                        s6 = s7;
                    }
                    String s8 = "";
                    if(s.contains("((") && s.contains("))")) {
                        int v4 = s.indexOf("((");
                        int v5 = s.lastIndexOf("))");
                        String s9 = s.substring(v4 + 2, v5);
                        s = s.substring(0, v4) + s.substring(v5 + 2);
                        s8 = s9;
                    }
                    s.trim();
                    s3 = s6.trim();
                    s2 = s1.trim();
                    s4 = s8.trim();
                }
                JSONObject jSONObject0 = new JSONObject();
                jSONObject0.put("name", s4);
                jSONObject0.put("label", s3);
                jSONObject0.put("cls", s2);
                jSONArray0.put(jSONObject0);
            }
            catch(Throwable throwable0) {
                CLS27.MTH893(throwable0);
            }
        }
        CLS27.MTH895().MTH922(jSONArray0, "actionbar_items");
    }
}

