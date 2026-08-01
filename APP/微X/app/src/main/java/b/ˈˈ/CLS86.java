// Decompiled by JEB v5.42.0.202606242140

package b.ˈˈ;

import android.text.TextUtils;
import b.ʾᵢ.CLS27;
import b.ⁱᵔ.CLS502;
import java.util.HashSet;
import org.json.JSONObject;

public final class CLS86 {
    public final HashSet FLD343;
    public int FLD344;
    public String FLD345;
    public String FLD346;
    public int FLD347;
    public String FLD348;
    public String FLD349;

    // 此方法包含解密的字符串
    public CLS86(int v, int v1, String s, String s1, String s2) {
        this(v, v1, s, s1, s2, "");
    }

    public CLS86(int v, int v1, String s, String s1, String s2, String s3) {
        this.FLD346 = s;
        this.FLD345 = s1;
        this.FLD347 = v;
        this.FLD344 = v1;
        this.FLD349 = s2;
        this.FLD343 = new HashSet();
        this.FLD348 = s3;
        this.MTH1702();
    }

    // 此方法包含解密的字符串
    public CLS86(JSONObject jSONObject0) {
        this.FLD343 = new HashSet();
        try {
            this.FLD346 = jSONObject0.getString("u");
            if(jSONObject0.has("m")) {
                this.FLD345 = jSONObject0.getString("m");
            }
            this.FLD347 = jSONObject0.getInt("b");
            this.FLD344 = jSONObject0.getInt("e");
            if(jSONObject0.has("x")) {
                this.FLD349 = jSONObject0.getString("x");
            }
            if(jSONObject0.has("t")) {
                this.FLD348 = jSONObject0.getString("t");
            }
        }
        catch(Throwable throwable0) {
            CLS27.MTH893(throwable0);
        }
        this.MTH1702();
    }

    @Override
    public final String toString() {
        return this.MTH1703().toString();
    }

    // 此方法包含解密的字符串
    public final String MTH1699() {
        if(TextUtils.isEmpty(this.FLD348)) {
            return "";
        }
        try {
            return new JSONObject(this.FLD348).optString("x");
        }
        catch(Throwable throwable0) {
            CLS27.MTH893(throwable0);
            return "";
        }
    }

    public final boolean MTH1700(int v) {
        return this.FLD343.contains(v);
    }

    // 此方法包含解密的字符串
    public final void MTH1701(String s) {
        try {
            if(s == null) {
                s = "";
            }
            JSONObject jSONObject0 = new JSONObject();
            if(!TextUtils.isEmpty(this.FLD348)) {
                jSONObject0 = new JSONObject(this.FLD348);
            }
            jSONObject0.put("x", s);
            this.FLD348 = jSONObject0.toString();
        }
        catch(Throwable throwable0) {
            CLS27.MTH893(throwable0);
        }
    }

    public final void MTH1702() {
        if(TextUtils.isEmpty(this.FLD349)) {
            return;
        }
        String[] arr_s = CLS502.MTH6941(this.FLD349);
        HashSet hashSet0 = this.FLD343;
        hashSet0.clear();
        for(int v = 0; v < arr_s.length; ++v) {
            hashSet0.add(Integer.parseInt(arr_s[v]));
        }
    }

    // 此方法包含解密的字符串
    public final JSONObject MTH1703() {
        JSONObject jSONObject0 = new JSONObject();
        try {
            jSONObject0.put("u", this.FLD346);
            jSONObject0.put("m", this.FLD345);
            jSONObject0.put("b", this.FLD347);
            jSONObject0.put("e", this.FLD344);
            jSONObject0.put("x", this.FLD349);
            jSONObject0.put("t", this.FLD348);
        }
        catch(Throwable throwable0) {
            CLS27.MTH893(throwable0);
        }
        return jSONObject0;
    }
}

