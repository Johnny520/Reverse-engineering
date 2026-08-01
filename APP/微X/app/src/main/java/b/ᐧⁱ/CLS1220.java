// Decompiled by JEB v5.42.0.202606242140

package b.ᐧⁱ;

import android.text.TextUtils;
import b.ʻˑ.CLS10;
import b.ʻˑ.CLS14;
import b.ʾᵢ.CLS27;
import b.ˊﾞ.CLS612;
import b.ⁱᵔ.CLS423.CLS420;
import b.ⁱᵔ.CLS423;
import b.ⁱᵔ.CLS502;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashMap;
import org.json.JSONArray;
import org.json.JSONObject;

public final class CLS1220 implements CLS14 {
    public final HashMap FLD2892;
    public String FLD2893;
    public final String FLD2894;

    public CLS1220(String s) {
        this.FLD2892 = new HashMap();
        this.FLD2893 = "";
        this.FLD2894 = s;
    }

    // 此方法包含解密的字符串
    @Override  // b.ʻˑ.CLS14
    public final void MTH793(String s, String s1, String s2, String s3, CLS10 ᐧˉ0) {
        if(TextUtils.isEmpty(s)) {
            return;
        }
        String s4 = CLS27.MTH882("openai_chatgpt_api_url");
        String s5 = "";
        String s6 = CLS27.MTH895().MTH925("openai_alt_api", "");
        if(!TextUtils.isEmpty(s6)) {
            s4 = s6;
        }
        CLS423 ˊⁱ0 = new CLS423(s4);
        ˊⁱ0.FLD4072 = CLS27.MTH895().MTH927(30000, "openai_read_timeout");
        ˊⁱ0.FLD4076 = CLS27.MTH895().MTH927(30000, "openai_connection_timeout");
        ˊⁱ0.FLD4078 = "POST";
        ˊⁱ0.FLD4085 = true;
        if(CLS27.MTH895().MTH938("openai_use_proxy", false)) {
            if("http".equals(CLS27.MTH895().MTH925("openai_proxy_type", "http"))) {
                String s7 = CLS27.MTH895().MTH925("openai_proxy_http", "");
                if(!TextUtils.isEmpty(s7) && CLS502.MTH6934(s7, new String[]{":"})) {
                    String[] arr_s = s7.split(":");
                    String s8 = arr_s[0];
                    int v1 = Integer.parseInt(arr_s[1]);
                    ˊⁱ0.FLD4081 = s8;
                    ˊⁱ0.FLD4079 = v1;
                }
            }
            else {
                String s9 = CLS27.MTH895().MTH925("openai_proxy_socks", "");
                if(!TextUtils.isEmpty(s9) && CLS502.MTH6934(s9, new String[]{":"})) {
                    String[] arr_s1 = s9.split(":");
                    String s10 = arr_s1[0];
                    int v2 = Integer.parseInt(arr_s1[1]);
                    ˊⁱ0.FLD4084 = s10;
                    ˊⁱ0.FLD4077 = v2;
                }
            }
        }
        try {
            JSONObject jSONObject0 = new JSONObject();
            JSONArray jSONArray0 = new JSONArray();
            String s11 = CLS27.MTH895().MTH925(this.FLD2893 + "openai_system_msg", "");
            if(!TextUtils.isEmpty(s11)) {
                JSONObject jSONObject1 = new JSONObject();
                jSONObject1.put("role", "system");
                jSONObject1.put("content", s11);
                jSONArray0.put(jSONObject1);
            }
            try {
                if(CLS27.MTH895().MTH927(0, this.FLD2893 + "openai_history_msg") > 0) {
                    HashMap hashMap0 = this.FLD2892;
                    if(hashMap0.containsKey(s1)) {
                        Object[] arr_object = ((ArrayDeque)hashMap0.get(s1)).toArray();
                        for(int v = 0; v < arr_object.length; ++v) {
                            for(Object object0: ((ArrayList)arr_object[v])) {
                                jSONArray0.put(((JSONObject)object0));
                            }
                        }
                    }
                }
            }
            catch(Throwable throwable1) {
                CLS27.MTH893(throwable1);
            }
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("role", "user");
            jSONObject2.put("content", s);
            if(!TextUtils.isEmpty(s1)) {
                jSONObject2.put("name", CLS502.MTH6925(s1));
            }
            jSONArray0.put(jSONObject2);
            jSONObject0.put("model", CLS27.MTH895().MTH925(this.FLD2893 + "openai_model", "gpt-3.5-turbo"));
            jSONObject0.put("messages", jSONArray0);
            s5 = jSONObject0.toString();
        }
        catch(Throwable throwable0) {
            CLS27.MTH893(throwable0);
        }
        ˊⁱ0.MTH6077("Content-Type", "application/json");
        String s12 = this.FLD2894;
        if(!TextUtils.isEmpty(s12)) {
            ˊⁱ0.MTH6077("Authorization", "Bearer " + s12);
        }
        ˊⁱ0.FLD4073 = s5;
        ˊⁱ0.MTH6078(((CLS420)new CLS612(this, s1, s, ᐧˉ0, 3)));
    }

    public final void MTH4623(String s, String s1, String s2) {
        HashMap hashMap0;
        try {
            String s3 = TextUtils.isEmpty(s) ? "" : s + "_";
            int v = CLS27.MTH895().MTH927(0, s3 + "openai_history_msg");
            if(v == 0) {
                return;
            }
            hashMap0 = this.FLD2892;
            if(hashMap0.containsKey(s)) {
                goto label_6;
            }
            goto label_21;
        }
        catch(Throwable throwable0) {
            goto label_39;
        }
        try {
        label_6:
            ArrayDeque arrayDeque0 = (ArrayDeque)hashMap0.get(s);
            ArrayList arrayList0 = new ArrayList();
            JSONObject jSONObject0 = new JSONObject();
            jSONObject0.put("role", "user");
            jSONObject0.put("content", s1);
            jSONObject0.put("name", CLS502.MTH6925(s));
            JSONObject jSONObject1 = new JSONObject();
            jSONObject1.put("role", "assistant");
            jSONObject1.put("content", s2);
            arrayList0.add(jSONObject0);
            arrayList0.add(jSONObject1);
            arrayDeque0.addLast(arrayList0);
            if(arrayDeque0.size() > v) {
                arrayDeque0.pollFirst();
                return;
            label_21:
                ArrayDeque arrayDeque1 = new ArrayDeque();
                ArrayList arrayList1 = new ArrayList();
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("role", "user");
                jSONObject2.put("content", s1);
                jSONObject2.put("name", CLS502.MTH6925(s));
                JSONObject jSONObject3 = new JSONObject();
                jSONObject3.put("role", "assistant");
                jSONObject3.put("content", s2);
                arrayList1.add(jSONObject2);
                arrayList1.add(jSONObject3);
                arrayDeque1.addLast(arrayList1);
                hashMap0.put(s, arrayDeque1);
                return;
            }
            return;
        }
        catch(Throwable throwable1) {
            try {
            label_36:
                CLS27.MTH893(throwable1);
                return;
            }
            catch(Throwable throwable0) {
            }
        }
    label_39:
        CLS27.MTH893(throwable0);
        try {
        }
        catch(Throwable throwable1) {
            goto label_36;
        }
    }
}

