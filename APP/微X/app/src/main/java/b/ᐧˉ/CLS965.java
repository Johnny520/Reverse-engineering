// Decompiled by JEB v5.42.0.202606242140

package b.ᐧˉ;

import android.app.Activity;
import android.content.ContentValues;
import b.ʻˑ.CLS11;
import b.ʾᵢ.CLS27;
import b.ˈˈ.CLS91;
import b.ⁱʾ.CLS359;
import b.ⁱᵔ.CLS412;
import b.ⁱᵔ.CLS523;
import org.json.JSONArray;
import org.json.JSONObject;

public final class CLS965 implements CLS11 {
    public final CLS359 FLD1876;
    public final Activity FLD1877;
    public final int FLD1878;
    public final CLS210 FLD1879;

    public CLS965(CLS210 ˋʼ0, CLS359 ⁱˉ0, int v, Activity activity0) {
        this.FLD1879 = ˋʼ0;
        this.FLD1876 = ⁱˉ0;
        this.FLD1878 = v;
        this.FLD1877 = activity0;
        super();
    }

    @Override  // b.ʻˑ.CLS11
    public final void MTH789() {
    }

    // 此方法包含解密的字符串
    @Override  // b.ʻˑ.CLS11
    public final void MTH790() {
        public final class CLS964 implements CLS11 {
            public final CLS91 FLD1874;
            public final CLS965 FLD1875;

            public CLS964(CLS91 ᵔʾ0) {
                this.FLD1874 = ᵔʾ0;
                super();
            }

            @Override  // b.ʻˑ.CLS11
            public final void MTH789() {
            }

            @Override  // b.ʻˑ.CLS11
            public final void MTH790() {
                CLS210.MTH3746(CLS965.this.FLD1879, this.FLD1874);
            }
        }

        try {
            CLS359 ⁱˉ0 = this.FLD1876;
            CLS210 ˋʼ0 = this.FLD1879;
            if(ˋʼ0.FLD2018 != null) {
                ˋʼ0.FLD2013.put("meta", ˋʼ0.FLD2018);
            }
            JSONArray jSONArray0 = new JSONArray();
            int v = 0;
            ˋʼ0.FLD2005 = false;
            for(int v1 = 0; v1 < ⁱˉ0.getCount(); ++v1) {
                JSONObject jSONObject0 = CLS412.MTH6010(((ContentValues)ⁱˉ0.getItem(v1)));
                jSONObject0.put("checked", ⁱˉ0.MTH5240(v1));
                if(!ˋʼ0.FLD2005 && ⁱˉ0.MTH5240(v1)) {
                    ˋʼ0.FLD2005 = true;
                }
                jSONArray0.put(jSONObject0);
            }
            ˋʼ0.FLD2013.put("response", jSONArray0);
            int v2 = this.FLD1878;
            if(v2 == -1) {
                if(jSONArray0.length() == 0) {
                    return;
                }
                String s = ˋʼ0.FLD2013.toString();
                String s1 = ˋʼ0.FLD1998;
                if(ˋʼ0.FLD2005) {
                    v = 1;
                }
                CLS210.MTH3747(ˋʼ0, new CLS91(v, "", s, s1));
                return;
            }
            CLS91 ᵔʾ0 = (CLS91)ˋʼ0.FLD2010.get(v2);
            if(ⁱˉ0.getCount() == 0) {
                CLS964 ˆﹳ$ˆٴ0 = new CLS964(this, ᵔʾ0);
                CLS523.MTH7142(this.FLD1877, ((CLS11)ˆﹳ$ˆٴ0));
                return;
            }
            CLS210.MTH3748(ˋʼ0, ᵔʾ0);
        }
        catch(Throwable throwable0) {
            CLS27.MTH893(throwable0);
        }
    }
}

