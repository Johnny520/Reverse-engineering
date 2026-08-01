// Decompiled by JEB v5.42.0.202606242140

package b.ᐧˉ;

import android.content.ContentValues;
import android.text.TextUtils;
import b.ʻˑ.CLS12;
import b.ʾᵢ.CLS27;
import b.ˈˈ.CLS69;
import b.ﾞˎ.CLS528;
import org.json.JSONObject;

public final class CLS1028 implements CLS12 {
    public final int FLD2126;
    public final ContentValues FLD2127;
    public final String FLD2128;
    public final CLS69 FLD2129;
    public final CLS528 FLD2130;

    public CLS1028(CLS69 ʾᵢ0, String s, CLS528 ʽי0, ContentValues contentValues0, int v) {
        this.FLD2126 = v;
        this.FLD2129 = ʾᵢ0;
        this.FLD2128 = s;
        this.FLD2130 = ʽי0;
        this.FLD2127 = contentValues0;
        super();
    }

    // 此方法包含解密的字符串
    @Override  // b.ʻˑ.CLS12
    public final void MTH791(Object object0) {
        CLS69 ʾᵢ0 = this.FLD2129;
        ContentValues contentValues0 = this.FLD2127;
        CLS528 ʽי0 = this.FLD2130;
        String s = this.FLD2128;
        if(this.FLD2126 == 0) {
            int v = (int)(((Integer)ʾᵢ0.MTH1565(((String)object0))));
            try {
                JSONObject jSONObject0 = new JSONObject();
                if(!TextUtils.isEmpty(s)) {
                    jSONObject0 = new JSONObject(s);
                }
                jSONObject0.put("orderType", v);
                ʽי0.FLD5167 = jSONObject0.toString();
                contentValues0.put("msg", "");
            }
            catch(Throwable throwable0) {
                CLS27.MTH893(throwable0);
            }
            return;
        }
        int v1 = (int)(((Integer)ʾᵢ0.MTH1565(((String)object0))));
        try {
            JSONObject jSONObject1 = new JSONObject();
            if(!TextUtils.isEmpty(s)) {
                jSONObject1 = new JSONObject(s);
            }
            jSONObject1.put("orderType", v1);
            ʽי0.FLD5167 = jSONObject1.toString();
            contentValues0.put("msg", "");
        }
        catch(Throwable throwable1) {
            CLS27.MTH893(throwable1);
        }
    }
}

