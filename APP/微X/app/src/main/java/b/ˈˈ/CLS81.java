// Decompiled by JEB v5.42.0.202606242140

package b.ˈˈ;

import android.text.TextUtils;
import b.ʾᵢ.CLS25;
import b.ʾᵢ.CLS27;
import b.ʾᵢ.CLS31;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

public final class CLS81 {
    public int FLD305;
    public final ArrayList FLD306;
    public String FLD307;
    public long FLD308;
    public final HashSet FLD309;
    public String FLD310;
    public int FLD311;
    public int FLD312;

    // 此方法包含解密的字符串
    public CLS81(long v) {
        this(v, "");
    }

    // 此方法包含解密的字符串
    public CLS81(long v, String s) {
        this.FLD306 = new ArrayList();
        this.FLD309 = new HashSet();
        this.FLD305 = 60;
        this.FLD308 = v;
        this.FLD310 = "sf_" + v;
        this.FLD307 = s;
        this.FLD312 = 0;
    }

    // 此方法包含解密的字符串
    public CLS81(JSONObject jSONObject0) {
        ArrayList arrayList0 = new ArrayList();
        this.FLD306 = arrayList0;
        this.FLD309 = new HashSet();
        this.FLD312 = 0;
        this.FLD305 = 60;
        try {
            arrayList0.clear();
            this.FLD307 = jSONObject0.getString("title");
            this.FLD310 = jSONObject0.getString("filename");
            this.FLD311 = jSONObject0.getInt("length");
            this.FLD312 = jSONObject0.getInt("status");
            this.FLD308 = (long)jSONObject0.getInt("code");
            if(jSONObject0.has("durations")) {
                JSONArray jSONArray0 = jSONObject0.getJSONArray("durations");
                for(int v = 0; v < jSONArray0.length(); ++v) {
                    arrayList0.add(jSONArray0.getInt(v));
                }
            }
            else {
                arrayList0.add(this.FLD311);
            }
            if(jSONObject0.has("segment")) {
                this.FLD305 = jSONObject0.getInt("segment");
            }
            if(jSONObject0.has("tags")) {
                List list0 = Arrays.asList(jSONObject0.optString("tags", "").split(";"));
                this.FLD309.addAll(list0);
            }
        }
        catch(Throwable throwable0) {
            CLS27.MTH893(throwable0);
        }
    }

    public final long MTH1663() {
        return this.FLD308;
    }

    // 此方法包含解密的字符串
    public final JSONObject MTH1664() {
        try {
            HashSet hashSet0 = this.FLD309;
            ArrayList arrayList0 = this.FLD306;
            JSONObject jSONObject0 = new JSONObject();
            jSONObject0.put("title", this.FLD307);
            jSONObject0.put("filename", this.FLD310);
            jSONObject0.put("length", this.FLD311);
            jSONObject0.put("status", this.FLD312);
            jSONObject0.put("code", this.FLD308);
            JSONArray jSONArray0 = new JSONArray();
            for(int v = 0; v < arrayList0.size(); ++v) {
                jSONArray0.put(arrayList0.get(v));
            }
            jSONObject0.put("durations", jSONArray0);
            jSONObject0.put("segment", this.FLD305);
            if(!hashSet0.isEmpty()) {
                jSONObject0.put("tags", TextUtils.join(";", hashSet0));
            }
            return jSONObject0;
        }
        catch(Throwable throwable0) {
            CLS27.MTH893(throwable0);
            return null;
        }
    }

    // 此方法包含解密的字符串
    public final String MTH1665() {
        switch(this.FLD312) {
            case 0: {
                return CLS27.MTH889("transcoding");
            }
            case 2: {
                return CLS27.MTH889("failed");
            }
            case 1: 
            case 3: {
                return CLS27.MTH889("ready");
            }
            default: {
                return CLS27.MTH889("not_ready");
            }
        }
    }

    public final int MTH1666() {
        int v = this.FLD311;
        if(v != 0) {
            return v;
        }
        ArrayList arrayList0 = this.FLD306;
        int v1 = 0;
        if(!arrayList0.isEmpty()) {
            for(Object object0: arrayList0) {
                v1 += (int)(((Integer)object0));
            }
        }
        return v1 * 1000;
    }

    public final String MTH1667() {
        return this.FLD307;
    }

    // 去混淆评级： 低(20)
    // 此方法包含解密的字符串
    public final void MTH1668() {
        CLS31.MTH1010(CLS25.MTH865(3, CLS31.MTH979(this.FLD310, "json"), "application/json"), this.MTH1664().toString());
    }
}

