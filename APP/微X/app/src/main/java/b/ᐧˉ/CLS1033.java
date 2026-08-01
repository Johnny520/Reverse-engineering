// Decompiled by JEB v5.42.0.202606242140

package b.ᐧˉ;

import android.app.Activity;
import android.content.ContentValues;
import android.text.TextUtils;
import b.ʻˑ.CLS11;
import b.ʾᵢ.CLS27;
import b.ʾᵢ.CLS34;
import b.ˆʿ.CLS44;
import b.ˈˈ.CLS91;
import b.ⁱʾ.CLS356;
import b.ⁱʾ.CLS359;
import b.ⁱᵔ.CLS412;
import b.ⁱᵔ.CLS502;
import b.ⁱᵔ.CLS523;
import b.ﾞˎ.CLS1621;
import b.ﾞˎ.CLS1635;
import org.json.JSONArray;
import org.json.JSONObject;

public final class CLS1033 implements CLS11 {
    public final CLS1635 FLD2142;
    public final CLS91 FLD2143;
    public final CLS1621 FLD2144;
    public final CLS1635 FLD2145;
    public final CLS359 FLD2146;
    public final CLS244 FLD2147;
    public final Activity FLD2148;

    public CLS1033(CLS244 ᴵʻ0, CLS1635 ﾞᵎ0, CLS1635 ﾞᵎ1, CLS1621 ˎᵢ0, CLS359 ⁱˉ0, CLS91 ᵔʾ0, Activity activity0) {
        this.FLD2147 = ᴵʻ0;
        this.FLD2142 = ﾞᵎ0;
        this.FLD2145 = ﾞᵎ1;
        this.FLD2144 = ˎᵢ0;
        this.FLD2146 = ⁱˉ0;
        this.FLD2143 = ᵔʾ0;
        this.FLD2148 = activity0;
        super();
    }

    @Override  // b.ʻˑ.CLS11
    public final void MTH789() {
    }

    // 此方法包含解密的字符串
    @Override  // b.ʻˑ.CLS11
    public final void MTH790() {
        public final class CLS1032 implements CLS11 {
            public final CLS1033 FLD2141;

            @Override  // b.ʻˑ.CLS11
            public final void MTH789() {
            }

            @Override  // b.ʻˑ.CLS11
            public final void MTH790() {
                CLS244.MTH4268(CLS1033.this.FLD2147, CLS1033.this.FLD2143);
            }
        }

        CLS359 ⁱˉ0 = this.FLD2146;
        CLS244 ᴵʻ0 = this.FLD2147;
        String s = ᴵʻ0.FLD2555.MTH7285();
        ᴵʻ0.FLD2535 = s;
        if(TextUtils.isEmpty(s)) {
            return;
        }
        if(this.FLD2142.MTH7444() && !CLS502.MTH6927(ᴵʻ0.FLD2535)) {
            StringBuilder stringBuilder0 = new StringBuilder();
            stringBuilder0.append("^");
            ᴵʻ0.FLD2535 = CLS34.MTH1074(stringBuilder0, ᴵʻ0.FLD2535, 4100671974210851637L);
        }
        try {
            if(ᴵʻ0.FLD2551 == null) {
                ᴵʻ0.FLD2551 = new JSONObject();
            }
            ᴵʻ0.FLD2551.put("keyword_cooldown", this.FLD2145.MTH7444());
            ᴵʻ0.FLD2551.put("keyword_cooldown_time", this.FLD2144.FLD5241);
            ᴵʻ0.FLD2553.put("meta", ᴵʻ0.FLD2551);
            JSONArray jSONArray0 = new JSONArray();
            ᴵʻ0.FLD2548 = false;
            for(int v = 0; v < ⁱˉ0.getCount(); ++v) {
                JSONObject jSONObject0 = CLS412.MTH6010(((ContentValues)ⁱˉ0.getItem(v)));
                jSONObject0.put("checked", ⁱˉ0.MTH5240(v));
                if(!ᴵʻ0.FLD2548 && ⁱˉ0.MTH5240(v)) {
                    ᴵʻ0.FLD2548 = true;
                }
                jSONArray0.put(jSONObject0);
            }
            ᴵʻ0.FLD2553.put("response", jSONArray0);
            CLS91 ᵔʾ0 = this.FLD2143;
            if(ᵔʾ0 != null) {
                if(TextUtils.isEmpty(ᴵʻ0.FLD2535)) {
                    CLS1032 ˎﾞ$ˆٴ0 = new CLS1032(this);
                    CLS523.MTH7142(this.FLD2148, ((CLS11)ˎﾞ$ˆٴ0));
                    return;
                }
                CLS244.MTH4267(ᴵʻ0, ᵔʾ0);
                return;
            }
            if(jSONArray0.length() == 0) {
                return;
            }
            CLS91 ᵔʾ1 = new CLS91(((int)ᴵʻ0.FLD2548), ᴵʻ0.FLD2535, ᴵʻ0.FLD2553.toString(), ᴵʻ0.FLD2542);
            ᴵʻ0.FLD2545.add(ᵔʾ1);
            CLS44 ˆٴ0 = ᴵʻ0.FLD2536;
            if(ˆٴ0 != null) {
                ˆٴ0.MTH1182(ᵔʾ1);
            }
            CLS356 ⁱʾ0 = ᴵʻ0.FLD2543;
            if(ⁱʾ0 != null) {
                ⁱʾ0.notifyDataSetChanged();
            }
        }
        catch(Throwable throwable0) {
            CLS27.MTH893(throwable0);
        }
    }
}

