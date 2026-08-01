// Decompiled by JEB v5.42.0.202606242140

package b.ᐧⁱ;

import android.content.ContentValues;
import android.text.TextUtils;
import b.ʻˑ.CLS10;
import b.ʻˑ.CLS14;
import b.ʾᵢ.CLS27;
import b.ᵔʾ.CLS1255;
import b.ⁱᵔ.CLS371;
import b.ⁱᵔ.CLS412;
import b.ⁱᵔ.CLS423.CLS420;
import b.ⁱᵔ.CLS423;
import b.ⁱᵔ.CLS426;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONObject;

public final class CLS1221 implements CLS14 {
    public final String FLD2895;
    public final String FLD2896;

    public CLS1221(String s, String s1) {
        this.FLD2895 = s;
        this.FLD2896 = s1;
    }

    // 此方法包含解密的字符串
    @Override  // b.ʻˑ.CLS14
    public final void MTH793(String s, String s1, String s2, String s3, CLS10 ᐧˉ0) {
        String s4 = this.FLD2895;
        if(!TextUtils.isEmpty(s4) && !TextUtils.isEmpty(s)) {
            CLS423 ˊⁱ0 = new CLS423(CLS27.MTH882("mlyurl"));
            ˊⁱ0.FLD4076 = CLS27.MTH895().MTH927(30000, "mly_connection_timeout");
            ˊⁱ0.FLD4072 = CLS27.MTH895().MTH927(30000, "mly_read_timeout");
            ˊⁱ0.FLD4078 = "POST";
            int v = 1;
            ˊⁱ0.FLD4085 = true;
            String s5 = CLS27.MTH882("useragent");
            ˊⁱ0.FLD4083.put("User-Agent", s5);
            ˊⁱ0.FLD4083.put("Connection", "Keep-Alive");
            ˊⁱ0.FLD4083.put("Cache-Control", "no-cache");
            ˊⁱ0.FLD4083.put("Pragma", "no-cache");
            ˊⁱ0.FLD4083.put("Accept", "application/json");
            ˊⁱ0.FLD4083.put("Content-Type", "application/json;charset=UTF-8");
            ˊⁱ0.MTH6077("Api-Key", s4);
            String s6 = this.FLD2896;
            if(!TextUtils.isEmpty(s6)) {
                ˊⁱ0.MTH6077("Api-Secret", s6);
            }
            JSONObject jSONObject0 = new JSONObject();
            try {
                jSONObject0.put("content", s);
                if(CLS426.MTH6126(s1)) {
                    v = 2;
                }
                jSONObject0.put("type", v);
                jSONObject0.put("from", s2);
                jSONObject0.put("fromName", s3);
                if(v == 2) {
                    jSONObject0.put("to", s1);
                    jSONObject0.put("toName", CLS371.FLD3470.MTH5316(s1));
                }
            }
            catch(Throwable throwable0) {
                CLS27.MTH893(throwable0);
            }
            ˊⁱ0.FLD4074 = jSONObject0;
            ˊⁱ0.MTH6078(((CLS420)new CLS1255(this, ᐧˉ0, 3)));
        }
    }

    // 此方法包含解密的字符串
    public final ArrayList MTH4626(String s) {
        ContentValues contentValues0;
        ArrayList arrayList0 = new ArrayList();
        try {
            JSONObject jSONObject0 = new JSONObject(s);
            if(!"00000".equals(jSONObject0.getString("code"))) {
                CLS412.MTH6011(("（" + CLS27.MTH889("mly_bot") + "）" + jSONObject0.getString("message")));
                return arrayList0;
            }
            String s1 = jSONObject0.optString("plugin");
            JSONArray jSONArray0 = jSONObject0.getJSONArray("data");
            int v = 0;
            while(v < jSONArray0.length()) {
                JSONObject jSONObject1 = jSONArray0.getJSONObject(v);
                String s2 = jSONObject1.getString("content");
                switch(jSONObject1.getInt("typed")) {
                    case 1: {
                        contentValues0 = new ContentValues();
                        contentValues0.put("plugin", s1);
                        contentValues0.put("type", "text");
                        contentValues0.put("content", s2.trim());
                        goto label_39;
                    }
                    case 2: {
                        contentValues0 = new ContentValues();
                        contentValues0.put("plugin", s1);
                        contentValues0.put("type", "image");
                        if(!s2.startsWith("http") && !"ultra".equalsIgnoreCase(s1)) {
                            s2 = CLS27.MTH882("mly_cloud_content_url") + s2;
                        }
                        contentValues0.put("url", s2);
                        goto label_39;
                    }
                    case 4: {
                        contentValues0 = new ContentValues();
                        contentValues0.put("plugin", s1);
                        if(s2.startsWith("http") || "ultra".equalsIgnoreCase(s1)) {
                            contentValues0.put("url", s2);
                        }
                        else {
                            contentValues0.put("url", CLS27.MTH882("mly_cloud_content_url") + s2);
                        }
                        contentValues0.put("type", (s2.endsWith(".mp4") ? "video" : "file"));
                        goto label_39;
                    }
                    case 3: 
                    case 9: {
                        contentValues0 = new ContentValues();
                        contentValues0.put("plugin", s1);
                        if(!s2.startsWith("http") && !"ultra".equalsIgnoreCase(s1)) {
                            s2 = CLS27.MTH882("mly_cloud_content_url") + s2;
                        }
                        contentValues0.put("url", s2);
                        contentValues0.put("type", "file");
                    label_39:
                        arrayList0.add(contentValues0);
                    }
                }
                ++v;
            }
        }
        catch(Throwable throwable0) {
            CLS27.MTH893(throwable0);
        }
        return arrayList0;
    }
}

