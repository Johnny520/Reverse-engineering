// Decompiled by JEB v5.42.0.202606242140

package b.ᐧˉ;

import android.content.ContentValues;
import b.ʻˑ.CLS12;
import b.ʾᵢ.CLS27;
import org.json.JSONObject;

public final class CLS936 implements CLS12 {
    public final int FLD1755;
    public final JSONObject FLD1756;

    public CLS936(JSONObject jSONObject0, int v) {
        this.FLD1755 = v;
        this.FLD1756 = jSONObject0;
        super();
    }

    // 此方法包含解密的字符串
    @Override  // b.ʻˑ.CLS12
    public final void MTH791(Object object0) {
        JSONObject jSONObject0 = this.FLD1756;
        switch(this.FLD1755) {
            case 0: {
                Integer integer4 = ((ContentValues)object0).getAsInteger("startH");
                Integer integer5 = ((ContentValues)object0).getAsInteger("startM");
                try {
                    jSONObject0.put("not_disturb_start", integer4 + ":" + integer5);
                }
                catch(Throwable throwable1) {
                    CLS27.MTH893(throwable1);
                }
                return;
            }
            case 1: {
                Integer integer6 = ((ContentValues)object0).getAsInteger("endH");
                Integer integer7 = ((ContentValues)object0).getAsInteger("endM");
                try {
                    jSONObject0.put("not_disturb_end", integer6 + ":" + integer7);
                }
                catch(Throwable throwable2) {
                    CLS27.MTH893(throwable2);
                }
                return;
            }
            default: {
                Integer integer0 = ((ContentValues)object0).getAsInteger("startH");
                Integer integer1 = ((ContentValues)object0).getAsInteger("startM");
                Integer integer2 = ((ContentValues)object0).getAsInteger("endH");
                Integer integer3 = ((ContentValues)object0).getAsInteger("endM");
                try {
                    jSONObject0.put("rp_timeframe", integer0 + ":" + integer1 + ";" + integer2 + ":" + integer3);
                }
                catch(Throwable throwable0) {
                    CLS27.MTH893(throwable0);
                }
            }
        }
    }
}

