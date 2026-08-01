// Decompiled by JEB v5.42.0.202606242140

package b.ᵔʾ;

import android.text.TextUtils;
import b.ʾᵢ.CLS27;
import b.ʾᵢ.CLS40;
import b.ˆʿ.CLS44;
import b.ⁱᵔ.CLS412;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

public final class CLS304 {
    public static final class CLS303 {
        public boolean FLD3159;
        public String FLD3160;
        public int FLD3161;
        public final HashSet FLD3162;
        public int FLD3163;
        public final HashMap FLD3164;
        public final long FLD3165;
        public boolean FLD3166;
        public String FLD3167;
        public int FLD3168;

        public CLS303() {
            this.FLD3162 = new HashSet();
            this.FLD3165 = System.currentTimeMillis() / 1000L;
            this.FLD3164 = new HashMap();
            this.FLD3166 = false;
            this.FLD3163 = 0;
            this.FLD3168 = 0;
            this.FLD3161 = 0;
            this.FLD3159 = false;
            this.FLD3167 = Long.toHexString(System.currentTimeMillis());
        }

        // 此方法包含解密的字符串
        public final void MTH4902(JSONObject jSONObject0) {
            try {
                String s = jSONObject0.optString("talkers");
                this.FLD3162.clear();
                List list0 = Arrays.asList(s.split(","));
                this.FLD3162.addAll(list0);
                this.FLD3167 = jSONObject0.getString("id");
                this.FLD3160 = jSONObject0.optString("name");
                this.FLD3166 = jSONObject0.optBoolean("rand");
                this.FLD3168 = jSONObject0.optInt("min");
                this.FLD3163 = jSONObject0.optInt("max");
                this.FLD3159 = jSONObject0.optBoolean("enable");
                if(jSONObject0.has("t2")) {
                    JSONObject jSONObject1 = jSONObject0.getJSONObject("t2");
                    Iterator iterator0 = jSONObject1.keys();
                    while(iterator0.hasNext()) {
                        Object object0 = iterator0.next();
                        Long long0 = jSONObject1.getLong(((String)object0));
                        this.FLD3164.put(((String)object0), long0);
                    }
                }
            }
            catch(Throwable throwable0) {
                CLS27.MTH893(throwable0);
            }
        }

        // 去混淆评级： 低(20)
        // 此方法包含解密的字符串
        public final String MTH4903() {
            return this.FLD3168 + "," + this.FLD3163;
        }

        public final int MTH4904() {
            if(this.FLD3166) {
                if(this.FLD3161 == 0) {
                    this.FLD3161 = CLS412.MTH6015(this.FLD3168, this.FLD3163);
                }
                return this.FLD3161;
            }
            return this.FLD3168;
        }

        // 此方法包含解密的字符串
        public final JSONObject MTH4905() {
            JSONObject jSONObject0 = new JSONObject();
            try {
                jSONObject0.put("talkers", TextUtils.join(",", this.FLD3162));
                jSONObject0.put("rand", this.FLD3166);
                jSONObject0.put("id", this.FLD3167);
                jSONObject0.put("name", this.FLD3160);
                jSONObject0.put("min", this.FLD3168);
                jSONObject0.put("max", this.FLD3163);
                jSONObject0.put("enable", this.FLD3159);
                JSONObject jSONObject1 = new JSONObject();
                for(Object object0: this.FLD3162) {
                    String s = (String)object0;
                    HashMap hashMap0 = this.FLD3164;
                    if(hashMap0.containsKey(s)) {
                        jSONObject1.put(s, hashMap0.get(s));
                    }
                    else {
                        jSONObject1.put(s, this.FLD3165);
                    }
                }
                jSONObject0.put("t2", jSONObject1);
            }
            catch(Throwable throwable0) {
                CLS27.MTH893(throwable0);
            }
            return jSONObject0;
        }
    }

    public final ArrayList FLD3169;
    public boolean FLD3170;
    public CLS44 FLD3171;
    public static final CLS304 FLD3172;

    static {
        CLS304.FLD3172 = new CLS304();
    }

    public CLS304() {
        this.FLD3169 = new ArrayList();
        this.FLD3170 = false;
    }

    // 此方法包含解密的字符串
    public final void MTH4908(CLS303 ᵔʾ$ˆٴ0) {
        if(this.FLD3171 == null) {
            this.FLD3171 = (CLS44)CLS40.FLD157.MTH1118(CLS44.class);
        }
        this.FLD3171.MTH1180("ad_response_" + ᵔʾ$ˆٴ0.FLD3167);
    }

    // 此方法包含解密的字符串
    public final void MTH4909() {
        JSONArray jSONArray0 = new JSONArray();
        for(Object object0: this.FLD3169) {
            CLS303 ᵔʾ$ˆٴ0 = (CLS303)object0;
            try {
                jSONArray0.put(ᵔʾ$ˆٴ0.MTH4905());
            }
            catch(Throwable throwable0) {
                CLS27.MTH893(throwable0);
            }
        }
        CLS27.MTH895().MTH922(jSONArray0, "ads_rules_list");
    }

    // 此方法包含解密的字符串
    public final void MTH4910() {
        if(this.FLD3170) {
            return;
        }
        this.FLD3170 = true;
        ArrayList arrayList0 = this.FLD3169;
        arrayList0.clear();
        JSONArray jSONArray0 = CLS27.MTH895().MTH937("ads_rules_list", new JSONArray());
        for(int v = 0; v < jSONArray0.length(); ++v) {
            try {
                JSONObject jSONObject0 = jSONArray0.getJSONObject(v);
                CLS303 ᵔʾ$ˆٴ0 = new CLS303();
                ᵔʾ$ˆٴ0.MTH4902(jSONObject0);
                arrayList0.add(ᵔʾ$ˆٴ0);
            }
            catch(Throwable throwable0) {
                CLS27.MTH893(throwable0);
            }
        }
    }
}

