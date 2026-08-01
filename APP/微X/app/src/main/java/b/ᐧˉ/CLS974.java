// Decompiled by JEB v5.42.0.202606242140

package b.ᐧˉ;

import android.content.ContentValues;
import android.text.TextUtils;
import b.ʻˑ.CLS16;
import b.ʾᵢ.CLS27;
import b.ﾞˎ.CLS528;
import org.json.JSONObject;

public final class CLS974 implements CLS16 {
    public final int FLD1920;
    public final CLS528 FLD1921;
    public final String FLD1922;
    public final ContentValues FLD1923;

    public CLS974(String s, CLS528 ʽי0, ContentValues contentValues0, int v) {
        this.FLD1920 = v;
        this.FLD1922 = s;
        this.FLD1921 = ʽי0;
        this.FLD1923 = contentValues0;
        super();
    }

    // 此方法包含解密的字符串
    @Override  // b.ʻˑ.CLS16
    public final void MTH795(String s) {
        ContentValues contentValues0 = this.FLD1923;
        CLS528 ʽי0 = this.FLD1921;
        String s1 = this.FLD1922;
        switch(this.FLD1920) {
            case 0: {
                try {
                    JSONObject jSONObject1 = new JSONObject();
                    if(!TextUtils.isEmpty(s1)) {
                        jSONObject1 = new JSONObject(s1);
                    }
                    jSONObject1.put("reason", s);
                    ʽי0.FLD5167 = jSONObject1.toString();
                    contentValues0.put("msg", "");
                }
                catch(Throwable throwable1) {
                    CLS27.MTH893(throwable1);
                }
                return;
            }
            case 1: {
                try {
                    JSONObject jSONObject2 = new JSONObject();
                    if(!TextUtils.isEmpty(s1)) {
                        jSONObject2 = new JSONObject(s1);
                    }
                    jSONObject2.put("reason", s);
                    ʽי0.FLD5167 = jSONObject2.toString();
                    contentValues0.put("msg", "");
                }
                catch(Throwable throwable2) {
                    CLS27.MTH893(throwable2);
                }
                return;
            }
            default: {
                try {
                    JSONObject jSONObject0 = new JSONObject();
                    if(!TextUtils.isEmpty(s1)) {
                        jSONObject0 = new JSONObject(s1);
                    }
                    jSONObject0.put("reason", s);
                    ʽי0.FLD5167 = jSONObject0.toString();
                    contentValues0.put("msg", "");
                }
                catch(Throwable throwable0) {
                    CLS27.MTH893(throwable0);
                }
            }
        }
    }
}

