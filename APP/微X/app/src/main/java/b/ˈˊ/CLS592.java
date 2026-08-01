// Decompiled by JEB v5.42.0.202606242140

package b.ˈˊ;

import android.app.Activity;
import b.ʾᵢ.CLS27;
import b.ˆٴ.CLS66;
import b.ⁱᵔ.CLS396;
import b.ⁱᵔ.CLS404;
import org.json.JSONObject;

public final class CLS592 extends CLS99 {
    public boolean FLD438;
    public int FLD439;

    public CLS592() {
        this.FLD501 = 17;
        this.FLD497 = true;
        this.FLD500 = true;
        this.FLD495 = true;
        this.FLD438 = true;
    }

    @Override  // b.ˈˊ.CLS99
    public final boolean MTH1929() {
        return false;
    }

    @Override  // b.ˈˊ.CLS99
    public final void MTH1930(Activity activity0) {
    }

    @Override  // b.ˈˊ.CLS99
    public final boolean MTH1931() {
        return false;
    }

    // 此方法包含解密的字符串
    @Override  // b.ˈˊ.CLS99
    public final JSONObject MTH1933() {
        JSONObject jSONObject0 = ((CLS99)this).super.MTH1933();
        try {
            jSONObject0.put("localId", this.FLD439);
            jSONObject0.put("deleteFlag", this.FLD438);
        }
        catch(Throwable throwable0) {
            CLS27.MTH893(throwable0);
        }
        return jSONObject0;
    }

    // 去混淆评级： 低(20)
    // 此方法包含解密的字符串
    @Override  // b.ˈˊ.CLS99
    public final String MTH1934() {
        return CLS27.MTH889("auto_clean_moment_task");
    }

    // 此方法包含解密的字符串
    @Override  // b.ˈˊ.CLS99
    public final void MTH1935(JSONObject jSONObject0) {
        ((CLS99)this).super.MTH1935(jSONObject0);
        try {
            this.FLD438 = jSONObject0.getBoolean("deleteFlag");
            this.FLD439 = jSONObject0.getInt("localId");
        }
        catch(Throwable throwable0) {
            CLS27.MTH893(throwable0);
        }
    }

    @Override  // b.ˈˊ.CLS99
    public final void MTH1936() {
        long v = CLS396.FLD3775.MTH5754(((long)this.FLD439));
        if(v == 0L) {
            return;
        }
        if(this.FLD438) {
            CLS66.MTH1459(v);
        }
        else {
            CLS66.MTH1481(v);
        }
        if(CLS404.MTH5901()) {
            return;
        }
        CLS66.MTH1373();
    }

    @Override  // b.ˈˊ.CLS99
    public final void MTH1938(Activity activity0) {
    }
}

