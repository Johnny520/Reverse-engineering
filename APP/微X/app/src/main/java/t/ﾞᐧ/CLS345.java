// Decompiled by JEB v5.42.0.202606242140

package t.ﾞᐧ;

import android.app.Activity;
import android.text.TextUtils;
import android.view.View;
import java.lang.ref.WeakReference;
import t.ˆʿ.CLS46;
import t.ⁱʾ.CLS145;

public final class CLS345 implements CLS145 {
    public String FLD1302;
    public CLS171 FLD1303;
    public final WeakReference FLD1304;
    public View FLD1305;
    public CLS337 FLD1306;
    public String FLD1307;
    public int FLD1308;
    public boolean FLD1309;
    public String FLD1310;

    public CLS345(Activity activity0) {
        this.FLD1308 = 0;
        this.FLD1309 = false;
        this.FLD1304 = new WeakReference(activity0);
    }

    @Override  // t.ⁱʾ.CLS145
    public final String getText() {
        return this.FLD1306 == null ? this.FLD1307 : this.FLD1306.getText();
    }

    @Override  // t.ⁱʾ.CLS145
    public final void MTH2172(String s) {
        this.FLD1307 = s;
        CLS337 ˎᵢ0 = this.FLD1306;
        if(ˎᵢ0 != null) {
            ˎᵢ0.MTH2172(s);
        }
    }

    @Override  // t.ⁱʾ.CLS145
    public final View MTH2173() {
        if(this.FLD1306 == null) {
            Activity activity0 = (Activity)this.FLD1304.get();
            CLS337 ˎᵢ0 = new CLS337(activity0);
            ˎᵢ0.MTH2387(new CLS157(this, activity0, ˎᵢ0, 0));
            ˎᵢ0.MTH2172(this.FLD1307);
            ˎᵢ0.MTH2381((TextUtils.isEmpty(this.FLD1302) ? this.FLD1310 : this.FLD1302));
            int v = CLS46.MTH1447((TextUtils.isEmpty(this.FLD1302) ? this.FLD1310 : this.FLD1302));
            ˎᵢ0.FLD1172.setTextColor(v);
            ˎᵢ0.MTH2388(null);
            ˎᵢ0.MTH2175(this.FLD1308);
            this.FLD1306 = ˎᵢ0;
        }
        return this.FLD1306.MTH2173();
    }

    @Override  // t.ⁱʾ.CLS145
    public final void MTH2174(View view0) {
        this.FLD1305 = view0;
        view0.setVisibility(this.FLD1308);
    }

    @Override  // t.ⁱʾ.CLS145
    public final void MTH2175(int v) {
        this.FLD1308 = v;
        CLS337 ˎᵢ0 = this.FLD1306;
        if(ˎᵢ0 != null) {
            ˎᵢ0.MTH2175(v);
        }
        View view0 = this.FLD1305;
        if(view0 != null) {
            view0.setVisibility(v);
        }
    }

    @Override  // t.ⁱʾ.CLS145
    public final void MTH2176() {
        this.FLD1306.MTH2176();
    }

    public final void MTH2493(String s) {
        this.FLD1302 = s;
        CLS337 ˎᵢ0 = this.FLD1306;
        if(ˎᵢ0 != null) {
            ˎᵢ0.MTH2381(s);
            this.FLD1306.FLD1172.setTextColor(CLS46.MTH1447(s));
        }
    }
}

