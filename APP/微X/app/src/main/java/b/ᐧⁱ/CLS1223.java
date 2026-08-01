// Decompiled by JEB v5.42.0.202606242140

package b.ᐧⁱ;

import android.content.ContentValues;
import android.text.TextUtils;
import b.ʻˑ.CLS10;
import b.ʻˑ.CLS14;
import b.ʾᵢ.CLS27;
import b.ᵔʾ.CLS1255;
import b.ⁱᵔ.CLS423.CLS420;
import b.ⁱᵔ.CLS423;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONObject;

public final class CLS1223 implements CLS14 {
    public interface CLS278 {
    }

    public final String FLD2899;
    public String FLD2900;
    public final String FLD2901;
    public long FLD2902;

    public CLS1223(String s, String s1) {
        this.FLD2899 = s;
        this.FLD2901 = s1;
    }

    @Override  // b.ʻˑ.CLS14
    public final void MTH793(String s, String s1, String s2, String s3, CLS10 ᐧˉ0) {
        this.MTH4632(s, ᐧˉ0);
    }

    // 此方法包含解密的字符串
    public final void MTH4632(String s, CLS10 ᐧˉ0) {
        CLS1224 ﾞᐧ0 = new CLS1224(this, s, ᐧˉ0);
        if(!TextUtils.isEmpty(this.FLD2900) && System.currentTimeMillis() < this.FLD2902) {
            ﾞᐧ0.MTH4636(this.FLD2900);
            return;
        }
        CLS423 ˊⁱ0 = new CLS423(CLS27.MTH882("weixin_aibot_sign_url") + this.FLD2899);
        ˊⁱ0.MTH6076("userid", this.FLD2901);
        ˊⁱ0.FLD4078 = "POST";
        ˊⁱ0.FLD4085 = true;
        ˊⁱ0.MTH6078(((CLS420)new CLS1255(this, ﾞᐧ0, 5)));
    }

    // 此方法包含解密的字符串
    // This method was un-flattened
    public final ArrayList MTH4633(String s) {
        ArrayList arrayList0 = new ArrayList();
        try {
            JSONObject jSONObject0 = new JSONObject(s);
            String s1 = "";
            if(jSONObject0.has("answer")) {
                s1 = jSONObject0.getString("answer");
                if(!TextUtils.isEmpty(s1)) {
                    ContentValues contentValues0 = new ContentValues();
                    contentValues0.put("type", "text");
                    contentValues0.put("content", s1.trim());
                    arrayList0.add(contentValues0);
                }
            }
            if(jSONObject0.has("msg")) {
                JSONArray jSONArray0 = jSONObject0.getJSONArray("msg");
                for(int v = 0; v < jSONArray0.length(); ++v) {
                    JSONObject jSONObject1 = jSONArray0.getJSONObject(v);
                    switch(jSONObject1.optString("msg_type")) {
                        case "music": {
                            String s3 = jSONObject1.getString("pic_url");
                            String s4 = jSONObject1.getString("music_url");
                            String s5 = jSONObject1.getString("resp_title");
                            String s6 = jSONObject1.getString("singer_name");
                            String s7 = TextUtils.isEmpty(s6) ? "" : s6 + " - ";
                            ContentValues contentValues2 = new ContentValues();
                            contentValues2.put("type", "music");
                            contentValues2.put("description", s7 + jSONObject1.getString("song_name") + " [" + jSONObject1.getString("album_name") + "]");
                            contentValues2.put("url", s4);
                            contentValues2.put("title", s5);
                            if(!TextUtils.isEmpty(s3)) {
                                contentValues2.put("thumbUrl", s3);
                            }
                            arrayList0.add(contentValues2);
                            break;
                        }
                        case "text": {
                            String s2 = jSONObject1.getString("content");
                            if(!s1.equals(s2)) {
                                ContentValues contentValues1 = new ContentValues();
                                contentValues1.put("type", "text");
                                contentValues1.put("content", s2.trim());
                                arrayList0.add(contentValues1);
                            }
                        }
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

