// Decompiled by JEB v5.42.0.202606242140

package t.ˊﾞ;

import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import org.json.JSONObject;
import t.ˆʿ.CLS41;
import t.ᵔʾ.CLS133;
import t.ᵔʾ.CLS137.CLS136;
import t.ᵔʾ.CLS137;
import t.ᵔʾ.CLS304;
import t.ⁱʾ.CLS146;

public final class CLS292 implements CLS136 {
    public final CLS102 FLD791;
    public final Context FLD792;
    public final int FLD793;
    public final String FLD794;
    public final int FLD795;
    public final CLS146 FLD796;

    public CLS292(CLS102 יﹳ0, String s, int v, int v1, Context context0, CLS146 ᵔʾ0) {
        this.FLD791 = יﹳ0;
        this.FLD794 = s;
        this.FLD793 = v;
        this.FLD795 = v1;
        this.FLD792 = context0;
        this.FLD796 = ᵔʾ0;
    }

    // 此方法包含解密的字符串
    @Override  // t.ᵔʾ.CLS137$CLS136
    public final void run() {
        int v = this.FLD793;
        int v1 = this.FLD795;
        Context context0 = this.FLD792;
        CLS146 ᵔʾ0 = this.FLD796;
        CLS102 יﹳ0 = this.FLD791;
        יﹳ0.getClass();
        try {
            JSONObject jSONObject0 = יﹳ0.MTH1824(this.FLD794);
            if(jSONObject0 != null) {
                Uri uri0 = יﹳ0.MTH1803(jSONObject0.optString("p", ""));
                if(uri0 != null) {
                    Bitmap bitmap0 = CLS41.MTH1399(context0, jSONObject0, CLS41.MTH1396(uri0, v, v1));
                    if(bitmap0 != null) {
                        CLS304 ﾞᐧ0 = new CLS304(ᵔʾ0, bitmap0, 8);
                        CLS137.FLD972.MTH2145(((CLS136)ﾞᐧ0));
                    }
                }
            }
        }
        catch(Throwable throwable0) {
            CLS133.MTH2113(throwable0);
        }
    }
}

