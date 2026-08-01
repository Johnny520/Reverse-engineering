// Decompiled by JEB v5.42.0.202606242140

package t.ﾞᐧ;

import android.app.Activity;
import android.view.View;
import android.widget.LinearLayout.LayoutParams;
import android.widget.LinearLayout;
import java.lang.ref.WeakReference;
import t.ˆʿ.CLS43;
import t.ˆʿ.CLS46;
import t.ˆʿ.CLS55;
import t.ᵔʾ.CLS133;
import t.ⁱʾ.CLS145;

public final class CLS333 implements CLS145 {
    public interface CLS161 {
        void MTH2332(LinearLayout arg1);
    }

    public CLS55 FLD1112;
    public final boolean FLD1113;
    public View FLD1114;
    public final WeakReference FLD1115;
    public int FLD1116;
    public CLS161 FLD1117;
    public String FLD1118;
    public CLS145 FLD1119;
    public final boolean FLD1120;
    public View FLD1121;

    // 此方法包含解密的字符串
    public CLS333(Activity activity0) {
        this.FLD1116 = 0;
        this.FLD1120 = true;
        this.FLD1113 = false;
        this.FLD1115 = new WeakReference(activity0);
        this.FLD1120 = CLS133.MTH2103().MTH2131("settings_next_new_dialog", true);
        this.FLD1113 = CLS133.MTH2103().MTH2131("settings_next_always_expand", false);
    }

    @Override  // t.ⁱʾ.CLS145
    public final String getText() {
        return this.FLD1119 == null ? this.FLD1118 : this.FLD1119.getText();
    }

    @Override  // t.ⁱʾ.CLS145
    public final void MTH2172(String s) {
        this.FLD1118 = s;
        CLS145 ٴـ0 = this.FLD1119;
        if(ٴـ0 != null) {
            ٴـ0.MTH2172(s);
        }
    }

    @Override  // t.ⁱʾ.CLS145
    public final View MTH2173() {
        View view0;
        if(this.FLD1114 == null) {
            Activity activity0 = (Activity)this.FLD1115.get();
            if(this.FLD1120) {
                CLS337 ˎᵢ0 = new CLS337(activity0);
                ˎᵢ0.MTH2387(new CLS157(this, activity0, ˎᵢ0, 1));
                ˎᵢ0.MTH2172(this.FLD1118);
                ˎᵢ0.MTH2388(null);
                ˎᵢ0.MTH2175(this.FLD1116);
                this.FLD1119 = ˎᵢ0;
                view0 = ˎᵢ0.MTH2173();
            }
            else if(this.FLD1113) {
                LinearLayout linearLayout0 = new LinearLayout(activity0);
                linearLayout0.setGravity(0x30);
                linearLayout0.setOrientation(1);
                CLS161 ʽﹶ$ˆٴ0 = this.FLD1117;
                if(ʽﹶ$ˆٴ0 != null) {
                    ʽﹶ$ˆٴ0.MTH2332(linearLayout0);
                }
                CLS342 ⁱʽ0 = new CLS342(activity0);
                ⁱʽ0.FLD1283.add(linearLayout0);
                ⁱʽ0.MTH2172(this.FLD1118);
                ⁱʽ0.FLD1287 = null;
                CLS43.MTH1429(ⁱʽ0.FLD1282, null);
                ⁱʽ0.MTH2175(this.FLD1116);
                this.FLD1119 = ⁱʽ0;
                view0 = ⁱʽ0.MTH2173();
            }
            else {
                LinearLayout linearLayout1 = new LinearLayout(activity0);
                linearLayout1.setGravity(0x30);
                linearLayout1.setOrientation(1);
                LinearLayout linearLayout2 = new LinearLayout(activity0);
                linearLayout2.setGravity(0x30);
                linearLayout2.setOrientation(1);
                CLS337 ˎᵢ1 = new CLS337(activity0);
                ˎᵢ1.MTH2172(this.FLD1118);
                ˎᵢ1.MTH2388(null);
                if(ˎᵢ1.FLD1165) {
                    ˎᵢ1.FLD1175.setRotation(90.0f);
                }
                ˎᵢ1.MTH2387(new CLS157(this, linearLayout2, ˎᵢ1, 2));
                View view1 = ˎᵢ1.MTH2173();
                view1.setPadding(CLS43.MTH1439(11), 0, CLS43.MTH1439(10), CLS43.MTH1439(10));
                linearLayout1.addView(view1, new LinearLayout.LayoutParams(-1, -1));
                CLS161 ʽﹶ$ˆٴ1 = this.FLD1117;
                if(ʽﹶ$ˆٴ1 != null) {
                    ʽﹶ$ˆٴ1.MTH2332(linearLayout2);
                }
                linearLayout1.addView(linearLayout2, new LinearLayout.LayoutParams(-1, -1));
                linearLayout2.setVisibility(8);
                linearLayout1.setVisibility(this.FLD1116);
                this.FLD1119 = ˎᵢ1;
                view0 = linearLayout1;
            }
            this.FLD1114 = view0;
        }
        return this.FLD1114;
    }

    @Override  // t.ⁱʾ.CLS145
    public final void MTH2174(View view0) {
        this.FLD1121 = view0;
        view0.setVisibility(this.FLD1116);
    }

    @Override  // t.ⁱʾ.CLS145
    public final void MTH2175(int v) {
        this.FLD1116 = v;
        CLS145 ٴـ0 = this.FLD1119;
        if(ٴـ0 != null) {
            ٴـ0.MTH2175(v);
        }
        View view0 = this.FLD1121;
        if(view0 != null) {
            view0.setVisibility(v);
        }
    }

    @Override  // t.ⁱʾ.CLS145
    public final void MTH2176() {
        this.FLD1114.setBackgroundColor(CLS46.MTH1445());
    }
}

