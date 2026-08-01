// Decompiled by JEB v5.42.0.202606242140

package b.ﾞˎ;

import android.app.Activity;
import android.text.TextUtils;
import android.view.View;
import b.ʻˑ.CLS18;
import b.ˈˈ.CLS67;
import b.ⁱᵔ.CLS522;
import java.lang.ref.WeakReference;

public final class CLS1619 implements CLS18 {
    public String FLD5207;
    public CLS555 FLD5208;
    public final WeakReference FLD5209;
    public int FLD5210;
    public String FLD5211;
    public String FLD5212;
    public CLS1626 FLD5213;
    public String FLD5214;
    public View FLD5215;

    public CLS1619(Activity activity0) {
        this.FLD5210 = 0;
        this.FLD5209 = new WeakReference(activity0);
    }

    @Override  // b.ʻˑ.CLS18
    public final String getText() {
        return this.FLD5213 == null ? this.FLD5212 : this.FLD5213.getText();
    }

    @Override  // b.ʻˑ.CLS18
    public final void MTH798(String s) {
        this.FLD5211 = s;
        CLS1626 ـﹳ0 = this.FLD5213;
        if(ـﹳ0 != null) {
            ـﹳ0.MTH798(s);
        }
    }

    @Override  // b.ʻˑ.CLS18
    public final void MTH799() {
        this.FLD5213.MTH799();
    }

    @Override  // b.ʻˑ.CLS18
    public final void MTH800(String s) {
        this.FLD5212 = s;
        CLS1626 ـﹳ0 = this.FLD5213;
        if(ـﹳ0 != null) {
            ـﹳ0.MTH800(s);
        }
    }

    @Override  // b.ʻˑ.CLS18
    public final void MTH801(int v) {
        this.FLD5210 = v;
        CLS1626 ـﹳ0 = this.FLD5213;
        if(ـﹳ0 != null) {
            ـﹳ0.MTH801(v);
        }
        View view0 = this.FLD5215;
        if(view0 != null) {
            view0.setVisibility(v);
        }
    }

    @Override  // b.ʻˑ.CLS18
    public final void MTH802(View view0) {
        this.FLD5215 = view0;
        view0.setVisibility(this.FLD5210);
    }

    @Override  // b.ʻˑ.CLS18
    public final View MTH803() {
        if(this.FLD5213 == null) {
            Activity activity0 = (Activity)this.FLD5209.get();
            CLS1626 ـﹳ0 = new CLS1626(activity0);
            ـﹳ0.MTH7324(new CLS67(this, activity0, ـﹳ0, 1));
            ـﹳ0.MTH800(this.FLD5212);
            ـﹳ0.MTH7325((TextUtils.isEmpty(this.FLD5207) ? this.FLD5214 : this.FLD5207));
            int v = CLS522.MTH7110((TextUtils.isEmpty(this.FLD5207) ? this.FLD5214 : this.FLD5207));
            ـﹳ0.FLD5302.setTextColor(v);
            ـﹳ0.MTH798(this.FLD5211);
            ـﹳ0.MTH801(this.FLD5210);
            this.FLD5213 = ـﹳ0;
        }
        return this.FLD5213.MTH803();
    }
}

