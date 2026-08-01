// Decompiled by JEB v5.42.0.202606242140

package d.ٴˑ;

import android.app.Activity;
import android.view.View;
import android.widget.LinearLayout.LayoutParams;
import android.widget.LinearLayout;
import d.ˑʽ.CLS10;
import d.ˑʽ.CLS43;
import d.ˑʽ.CLS45;
import d.יʻ.CLS69;
import d.ᐧˈ.CLS199;
import d.ⁱٴ.CLS125;
import java.lang.ref.WeakReference;

public final class CLS180 implements CLS125 {
    public interface CLS79 {
    }

    public CLS10 FLD382;
    public boolean FLD383;
    public boolean FLD384;
    public String FLD385;
    public CLS125 FLD386;
    public View FLD387;
    public View FLD388;
    public final WeakReference FLD389;
    public CLS79 FLD390;
    public String FLD391;
    public int FLD392;

    // 此方法包含解密的字符串
    public CLS180(Activity activity0) {
        this.FLD392 = 0;
        this.FLD384 = true;
        this.FLD383 = false;
        this.FLD389 = new WeakReference(activity0);
        this.FLD384 = CLS69.MTH801().MTH748("settings_next_new_dialog", true);
        this.FLD383 = CLS69.MTH801().MTH748("settings_next_always_expand", false);
    }

    @Override  // d.ⁱٴ.CLS125
    public final String getText() {
        return this.FLD386 == null ? this.FLD385 : this.FLD386.getText();
    }

    @Override  // d.ⁱٴ.CLS125
    public final void MTH1177(int v) {
        this.FLD392 = v;
        CLS125 ⁱٴ0 = this.FLD386;
        if(ⁱٴ0 != null) {
            ⁱٴ0.MTH1177(v);
        }
        View view0 = this.FLD387;
        if(view0 != null) {
            view0.setVisibility(v);
        }
    }

    @Override  // d.ⁱٴ.CLS125
    public final void MTH1178() {
        this.FLD388.setBackgroundColor(CLS43.MTH645());
    }

    @Override  // d.ⁱٴ.CLS125
    public final void MTH1179(String s) {
        this.FLD391 = s;
        CLS125 ⁱٴ0 = this.FLD386;
        if(ⁱٴ0 != null) {
            ⁱٴ0.MTH1179(s);
        }
    }

    @Override  // d.ⁱٴ.CLS125
    public final void MTH1180(View view0) {
        this.FLD387 = view0;
        view0.setVisibility(this.FLD392);
    }

    @Override  // d.ⁱٴ.CLS125
    public final void MTH1181(String s) {
        this.FLD385 = s;
        CLS125 ⁱٴ0 = this.FLD386;
        if(ⁱٴ0 != null) {
            ⁱٴ0.MTH1181(s);
        }
    }

    @Override  // d.ⁱٴ.CLS125
    public final View MTH1182() {
        View view0;
        if(this.FLD388 == null) {
            Activity activity0 = (Activity)this.FLD389.get();
            if(this.FLD384) {
                CLS188 ᴵʾ0 = new CLS188(activity0);
                ᴵʾ0.MTH1000(new CLS95(((CLS125)this), activity0, ᴵʾ0, 1));
                ᴵʾ0.MTH1181(this.FLD385);
                ᴵʾ0.MTH1179(this.FLD391);
                ᴵʾ0.MTH1177(this.FLD392);
                this.FLD386 = ᴵʾ0;
                view0 = ᴵʾ0.MTH1182();
            }
            else if(this.FLD383) {
                LinearLayout linearLayout0 = new LinearLayout(activity0);
                linearLayout0.setGravity(0x30);
                linearLayout0.setOrientation(1);
                CLS79 ʿﾞ$ᐧי0 = this.FLD390;
                if(ʿﾞ$ᐧי0 != null) {
                    ((CLS199)ʿﾞ$ᐧי0).MTH1073(linearLayout0);
                }
                CLS183 ˆᵔ0 = new CLS183(activity0);
                ˆᵔ0.FLD419.add(linearLayout0);
                ˆᵔ0.MTH1181(this.FLD385);
                ˆᵔ0.MTH1179(this.FLD391);
                ˆᵔ0.MTH1177(this.FLD392);
                this.FLD386 = ˆᵔ0;
                view0 = ˆᵔ0.MTH1182();
            }
            else {
                LinearLayout linearLayout1 = new LinearLayout(activity0);
                linearLayout1.setGravity(0x30);
                linearLayout1.setOrientation(1);
                LinearLayout linearLayout2 = new LinearLayout(activity0);
                linearLayout2.setGravity(0x30);
                linearLayout2.setOrientation(1);
                CLS188 ᴵʾ1 = new CLS188(activity0);
                ᴵʾ1.MTH1181(this.FLD385);
                ᴵʾ1.MTH1179(this.FLD391);
                if(ᴵʾ1.FLD531) {
                    ᴵʾ1.FLD533.setRotation(90.0f);
                }
                ᴵʾ1.MTH1000(new CLS95(((CLS125)this), linearLayout2, ᴵʾ1, 2));
                View view1 = ᴵʾ1.MTH1182();
                view1.setPadding(CLS45.MTH662(11), 0, CLS45.MTH662(10), CLS45.MTH662(10));
                linearLayout1.addView(view1, new LinearLayout.LayoutParams(-1, -1));
                CLS79 ʿﾞ$ᐧי1 = this.FLD390;
                if(ʿﾞ$ᐧי1 != null) {
                    ((CLS199)ʿﾞ$ᐧי1).MTH1073(linearLayout2);
                }
                linearLayout1.addView(linearLayout2, new LinearLayout.LayoutParams(-1, -1));
                linearLayout2.setVisibility(8);
                linearLayout1.setVisibility(this.FLD392);
                this.FLD386 = ᴵʾ1;
                view0 = linearLayout1;
            }
            this.FLD388 = view0;
        }
        return this.FLD388;
    }
}

