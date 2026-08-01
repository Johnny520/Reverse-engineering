// Decompiled by JEB v5.42.0.202606242140

package b.ᐧⁱ;

import android.content.ContentValues;
import android.text.TextUtils;
import b.ʻˑ.CLS10;
import b.ʻˑ.CLS14;
import b.ʾᵢ.CLS27;
import b.ᵔʾ.CLS1255;
import b.ⁱᵔ.CLS412;
import b.ⁱᵔ.CLS423.CLS420;
import b.ⁱᵔ.CLS423;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONObject;

public final class CLS1222 implements CLS14 {
    public final String FLD2897;
    public final String FLD2898;

    public CLS1222(String s, String s1) {
        this.FLD2897 = s;
        this.FLD2898 = s1;
    }

    // 此方法包含解密的字符串
    @Override  // b.ʻˑ.CLS14
    public final void MTH793(String s, String s1, String s2, String s3, CLS10 ᐧˉ0) {
        if(!TextUtils.isEmpty(s)) {
            String s4 = this.FLD2897;
            if(!TextUtils.isEmpty(s4)) {
                String s5 = this.FLD2898;
                if(!TextUtils.isEmpty(s5)) {
                    try {
                        CLS423 ˊⁱ0 = new CLS423(CLS27.MTH882("turingurl"));
                        ˊⁱ0.FLD4072 = CLS27.MTH895().MTH927(15000, "tuling_read_timeout");
                        ˊⁱ0.FLD4076 = CLS27.MTH895().MTH927(15000, "tuling_connection_timeout");
                        ˊⁱ0.FLD4078 = "POST";
                        ˊⁱ0.FLD4085 = true;
                        String s6 = CLS27.MTH882("useragent");
                        ˊⁱ0.FLD4083.put("User-Agent", s6);
                        ˊⁱ0.FLD4083.put("Connection", "Keep-Alive");
                        ˊⁱ0.FLD4083.put("Cache-Control", "no-cache");
                        ˊⁱ0.FLD4083.put("Pragma", "no-cache");
                        ˊⁱ0.FLD4083.put("x-adviewrtb-version", "2.1");
                        ˊⁱ0.FLD4083.put("Accept", "*/*");
                        ˊⁱ0.MTH6077("Content-Type", "application/json");
                        JSONObject jSONObject0 = new JSONObject();
                        jSONObject0.put("apiKey", s4);
                        jSONObject0.put("userId", s5);
                        JSONObject jSONObject1 = new JSONObject();
                        jSONObject1.put("text", s);
                        JSONObject jSONObject2 = new JSONObject();
                        jSONObject2.put("inputText", jSONObject1);
                        JSONObject jSONObject3 = new JSONObject();
                        jSONObject3.put("reqType", 0);
                        jSONObject3.put("perception", jSONObject2);
                        jSONObject3.put("userInfo", jSONObject0);
                        ˊⁱ0.FLD4074 = jSONObject3;
                        ˊⁱ0.MTH6078(((CLS420)new CLS1255(this, ᐧˉ0, 4)));
                    }
                    catch(Throwable throwable0) {
                        CLS27.MTH893(throwable0);
                    }
                }
            }
        }
    }

    // 此方法包含解密的字符串
    // This method was un-flattened
    public final ArrayList MTH4629(String s) {
        ContentValues contentValues0;
        ArrayList arrayList0 = new ArrayList();
        try {
            JSONObject jSONObject0 = new JSONObject(s);
            JSONObject jSONObject1 = jSONObject0.getJSONObject("intent");
            JSONArray jSONArray0 = jSONObject0.getJSONArray("results");
            int v = jSONObject1.getInt("code");
            if(v != 0) {
                JSONObject jSONObject2 = jSONArray0.getJSONObject(0).getJSONObject("values");
                CLS27.MTH906(jSONObject0.toString(4));
                CLS412.MTH6011((CLS27.MTH889("turing_robot_err") + "(" + v + ") " + jSONObject2.getString("text")));
                return arrayList0;
            }
            for(int v1 = 0; v1 < jSONArray0.length(); ++v1) {
                JSONObject jSONObject3 = jSONArray0.getJSONObject(v1);
                String s1 = jSONObject3.getString("resultType");
                JSONObject jSONObject4 = jSONObject3.getJSONObject("values");
                switch(s1) {
                    case "text": {
                        String s2 = jSONObject4.getString("text");
                        contentValues0 = new ContentValues();
                        contentValues0.put("type", "text");
                        contentValues0.put("content", s2.trim());
                        arrayList0.add(contentValues0);
                        break;
                    }
                    case "url": {
                        contentValues0 = new ContentValues();
                        contentValues0.put("type", "url");
                        contentValues0.put("url", jSONObject4.getString("url"));
                        arrayList0.add(contentValues0);
                    }
                }
            }
        }
        catch(Throwable throwable0) {
            CLS27.MTH893(throwable0);
        }
        return arrayList0;
    }
}

