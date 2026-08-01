// Decompiled by JEB v5.42.0.202606242140

package d.ٴˑ;

import android.app.Activity;
import android.text.TextUtils;
import android.view.View;
import d.ˑʽ.CLS43;
import d.ˑʽ.CLS45;
import d.ⁱٴ.CLS125;
import java.lang.ref.WeakReference;

public final class CLS185 implements CLS125 {
    public CLS86 FLD482;
    public String FLD483;
    public String FLD484;
    public int FLD485;
    public String FLD486;
    public final WeakReference FLD487;
    public CLS188 FLD488;
    public String FLD489;
    public View FLD490;

    public CLS185(Activity activity0) {
        this.FLD485 = 0;
        this.FLD487 = new WeakReference(activity0);
    }

    @Override  // d.ⁱٴ.CLS125
    public final String getText() {
        return this.FLD488 == null ? this.FLD484 : this.FLD488.getText();
    }

    @Override  // d.ⁱٴ.CLS125
    public final void MTH1177(int v) {
        this.FLD485 = v;
        CLS188 ᴵʾ0 = this.FLD488;
        if(ᴵʾ0 != null) {
            ᴵʾ0.MTH1177(v);
        }
        View view0 = this.FLD490;
        if(view0 != null) {
            view0.setVisibility(v);
        }
    }

    @Override  // d.ⁱٴ.CLS125
    public final void MTH1178() {
        this.FLD488.MTH1178();
    }

    @Override  // d.ⁱٴ.CLS125
    public final void MTH1179(String s) {
        this.FLD489 = s;
        CLS188 ᴵʾ0 = this.FLD488;
        if(ᴵʾ0 != null) {
            ᴵʾ0.MTH1179(s);
        }
    }

    @Override  // d.ⁱٴ.CLS125
    public final void MTH1180(View view0) {
        this.FLD490 = view0;
        view0.setVisibility(this.FLD485);
    }

    @Override  // d.ⁱٴ.CLS125
    public final void MTH1181(String s) {
        this.FLD484 = s;
        CLS188 ᴵʾ0 = this.FLD488;
        if(ᴵʾ0 != null) {
            ᴵʾ0.MTH1181(s);
        }
    }

    @Override  // d.ⁱٴ.CLS125
    public final View MTH1182() {
        if(this.FLD488 == null) {
            Activity activity0 = (Activity)this.FLD487.get();
            CLS188 ᴵʾ0 = new CLS188(activity0);
            ᴵʾ0.MTH1000(new CLS95(((CLS125)this), activity0, ᴵʾ0, 0));
            ᴵʾ0.MTH1181(this.FLD484);
            String s = TextUtils.isEmpty(this.FLD483) ? this.FLD486 : this.FLD483;
            ᴵʾ0.FLD527 = s;
            CLS45.MTH658(ᴵʾ0.FLD534, s);
            String s1 = TextUtils.isEmpty(this.FLD483) ? this.FLD486 : this.FLD483;
            ᴵʾ0.FLD534.setTextColor(CLS43.MTH643(s1));
            ᴵʾ0.MTH1179(this.FLD489);
            ᴵʾ0.MTH1177(this.FLD485);
            this.FLD488 = ᴵʾ0;
        }
        return this.FLD488.MTH1182();
    }
}

