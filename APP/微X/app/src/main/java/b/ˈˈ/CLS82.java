// Decompiled by JEB v5.42.0.202606242140

package b.ˈˈ;

import android.text.TextUtils;
import b.ʾᵢ.CLS25;
import b.ʾᵢ.CLS27;
import b.ʾᵢ.CLS31;
import b.ⁱᵔ.CLS502;
import java.util.ArrayList;
import java.util.HashSet;
import org.json.JSONArray;
import org.json.JSONObject;

public final class CLS82 {
    public final ArrayList FLD313;
    public String FLD314;
    public JSONObject FLD315;
    public final HashSet FLD316;
    public String FLD317;

    public CLS82() {
        this.FLD314 = CLS82.MTH1676();
        this.FLD315 = new JSONObject();
        this.FLD313 = new ArrayList();
        this.FLD316 = new HashSet();
    }

    // 此方法包含解密的字符串
    public CLS82(JSONObject jSONObject0) {
        try {
            String s = jSONObject0.optString("id");
            this.FLD314 = s;
            if(TextUtils.isEmpty(s)) {
                this.FLD314 = CLS82.MTH1676();
            }
            this.FLD317 = jSONObject0.optString("desc");
            this.FLD315 = jSONObject0.getJSONObject("metadata");
            JSONArray jSONArray0 = jSONObject0.getJSONArray("files");
            ArrayList arrayList0 = this.FLD313;
            arrayList0.clear();
            for(int v1 = 0; v1 < jSONArray0.length(); ++v1) {
                arrayList0.add(jSONArray0.getJSONObject(v1));
            }
            JSONArray jSONArray1 = jSONObject0.getJSONArray("tags");
            HashSet hashSet0 = this.FLD316;
            hashSet0.clear();
            for(int v = 0; v < jSONArray1.length(); ++v) {
                hashSet0.add(jSONArray1.getString(v));
            }
        }
        catch(Throwable throwable0) {
            CLS27.MTH893(throwable0);
        }
    }

    // 此方法包含解密的字符串
    public final JSONObject MTH1671() {
        try {
            JSONObject jSONObject0 = new JSONObject();
            jSONObject0.put("id", this.FLD314);
            jSONObject0.put("desc", this.FLD317);
            JSONArray jSONArray0 = new JSONArray();
            for(Object object0: this.FLD313) {
                jSONArray0.put(((JSONObject)object0));
            }
            jSONObject0.put("files", jSONArray0);
            jSONObject0.put("metadata", this.FLD315);
            JSONArray jSONArray1 = new JSONArray();
            for(Object object1: this.FLD316) {
                jSONArray1.put(((String)object1));
            }
            jSONObject0.put("tags", jSONArray1);
            return jSONObject0;
        }
        catch(Throwable throwable0) {
            CLS27.MTH893(throwable0);
            return null;
        }
    }

    // 去混淆评级： 低(20)
    // 此方法包含解密的字符串
    public final void MTH1672() {
        CLS31.MTH1010(CLS25.MTH865(11, CLS31.MTH979(this.FLD314, "json"), "application/json"), this.MTH1671().toString());
    }

    // 此方法包含解密的字符串
    public final void MTH1673(int v, String s) {
        try {
            JSONObject jSONObject0 = new JSONObject();
            jSONObject0.put("file", s);
            jSONObject0.put("length", v);
            this.FLD313.add(jSONObject0);
        }
        catch(Throwable throwable0) {
            CLS27.MTH893(throwable0);
        }
    }

    // 此方法包含解密的字符串
    public final String MTH1674(int v) {
        try {
            return ((JSONObject)this.FLD313.get(v)).getString("file");
        }
        catch(Throwable throwable0) {
            CLS27.MTH893(throwable0);
            return "";
        }
    }

    // 此方法包含解密的字符串
    public final int MTH1675() {
        try {
            return this.FLD315.optInt("delay", -1);
        }
        catch(Throwable throwable0) {
            CLS27.MTH893(throwable0);
            return -1;
        }
    }

    public static String MTH1676() {
        return CLS502.MTH6925((CLS27.MTH904() + Long.toHexString(System.currentTimeMillis())));
    }

    public final String MTH1677() {
        return this.FLD317;
    }

    public final int MTH1678() {
        return this.FLD313.size();
    }

    // 此方法包含解密的字符串
    public final int MTH1679(int v) {
        try {
            return ((JSONObject)this.FLD313.get(v)).getInt("length");
        }
        catch(Throwable throwable0) {
            CLS27.MTH893(throwable0);
            return 0;
        }
    }
}

