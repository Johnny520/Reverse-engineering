// Decompiled by JEB v5.42.0.202606242140

package b.ᐧˉ;

import android.app.Activity;
import android.text.TextUtils;
import b.ʻˑ.CLS11;
import b.ʾᵢ.CLS27;
import b.ʾᵢ.CLS34;
import b.ˆʿ.CLS44;
import b.ˈˈ.CLS91;
import b.ⁱʾ.CLS356;
import b.ⁱᵔ.CLS502;
import b.ⁱᵔ.CLS523;
import b.ﾞˎ.CLS1621;
import b.ﾞˎ.CLS1635;
import org.json.JSONObject;

public final class CLS1158 implements CLS11 {
    public final CLS1635 FLD2651;
    public final Activity FLD2652;
    public final CLS1621 FLD2653;
    public final CLS1635 FLD2654;
    public final CLS91 FLD2655;
    public final CLS244 FLD2656;

    public CLS1158(CLS244 ᴵʻ0, CLS1635 ﾞᵎ0, CLS1635 ﾞᵎ1, CLS1621 ˎᵢ0, CLS91 ᵔʾ0, Activity activity0) {
        this.FLD2656 = ᴵʻ0;
        this.FLD2651 = ﾞᵎ0;
        this.FLD2654 = ﾞᵎ1;
        this.FLD2653 = ˎᵢ0;
        this.FLD2655 = ᵔʾ0;
        this.FLD2652 = activity0;
        super();
    }

    @Override  // b.ʻˑ.CLS11
    public final void MTH789() {
        CLS244 ᴵʻ0 = this.FLD2656;
        if(!TextUtils.isEmpty(ᴵʻ0.FLD2554)) {
            ᴵʻ0.FLD2550.MTH1252(ᴵʻ0.FLD2554);
        }
    }

    // 此方法包含解密的字符串
    @Override  // b.ʻˑ.CLS11
    public final void MTH790() {
        public final class CLS1157 implements CLS11 {
            public final CLS1158 FLD2650;

            @Override  // b.ʻˑ.CLS11
            public final void MTH789() {
            }

            @Override  // b.ʻˑ.CLS11
            public final void MTH790() {
                CLS244.MTH4268(CLS1158.this.FLD2656, CLS1158.this.FLD2655);
            }
        }

        CLS244 ᴵʻ0 = this.FLD2656;
        ᴵʻ0.FLD2535 = ᴵʻ0.FLD2555.MTH7285();
        ᴵʻ0.FLD2539 = ᴵʻ0.FLD2540.MTH7285();
        if(!TextUtils.isEmpty(ᴵʻ0.FLD2535) && !TextUtils.isEmpty(ᴵʻ0.FLD2539)) {
            if(this.FLD2651.MTH7444() && !CLS502.MTH6927(ᴵʻ0.FLD2535)) {
                StringBuilder stringBuilder0 = new StringBuilder();
                stringBuilder0.append("^");
                ᴵʻ0.FLD2535 = CLS34.MTH1074(stringBuilder0, ᴵʻ0.FLD2535, 4100673580528620341L);
            }
            ᴵʻ0.FLD2548 = ᴵʻ0.FLD2549.MTH7444();
            try {
                if(ᴵʻ0.FLD2551 == null) {
                    ᴵʻ0.FLD2551 = new JSONObject();
                }
                ᴵʻ0.FLD2551.put("keyword_cooldown", this.FLD2654.MTH7444());
                ᴵʻ0.FLD2551.put("keyword_cooldown_time", this.FLD2653.FLD5241);
            }
            catch(Throwable throwable0) {
                CLS27.MTH893(throwable0);
            }
            CLS91 ᵔʾ0 = this.FLD2655;
            if(ᵔʾ0 == null) {
                if(TextUtils.isEmpty(ᴵʻ0.FLD2539)) {
                    return;
                }
                CLS91 ᵔʾ1 = new CLS91(((int)ᴵʻ0.FLD2548), ᴵʻ0.FLD2535, ᴵʻ0.FLD2539, ᴵʻ0.FLD2542);
                ᵔʾ1.MTH1740(ᴵʻ0.FLD2551);
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
            else {
                if(TextUtils.isEmpty(ᴵʻ0.FLD2535)) {
                    CLS1157 ᵔⁱ$ˆٴ0 = new CLS1157(this);
                    CLS523.MTH7142(this.FLD2652, ((CLS11)ᵔⁱ$ˆٴ0));
                    return;
                }
                CLS244.MTH4267(ᴵʻ0, ᵔʾ0);
            }
        }
    }
}

