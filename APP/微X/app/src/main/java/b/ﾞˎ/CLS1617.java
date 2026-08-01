// Decompiled by JEB v5.42.0.202606242140

package b.ﾞˎ;

import android.app.Activity;
import android.view.View.OnClickListener;
import android.view.View;
import android.widget.LinearLayout.LayoutParams;
import android.widget.LinearLayout;
import b.ʻˑ.CLS18;
import b.ʾᵢ.CLS27;
import b.ˈˈ.CLS67;
import b.ᐧˉ.CLS1037;
import b.ⁱᵔ.CLS380;
import b.ⁱᵔ.CLS522;
import b.ⁱᵔ.CLS523;
import java.lang.ref.WeakReference;

public final class CLS1617 implements CLS18 {
    public interface CLS526 {
        void MTH7191(LinearLayout arg1);
    }

    public View FLD5150;
    public boolean FLD5151;
    public boolean FLD5152;
    public final WeakReference FLD5153;
    public CLS380 FLD5154;
    public CLS18 FLD5155;
    public String FLD5156;
    public View.OnClickListener FLD5157;
    public String FLD5158;
    public CLS526 FLD5159;
    public View FLD5160;
    public int FLD5161;

    // 此方法包含解密的字符串
    public CLS1617(Activity activity0) {
        this.FLD5161 = 0;
        this.FLD5151 = true;
        this.FLD5152 = false;
        this.FLD5153 = new WeakReference(activity0);
        this.FLD5151 = CLS27.MTH895().MTH938("settings_next_new_dialog", true);
        this.FLD5152 = CLS27.MTH895().MTH938("settings_next_always_expand", false);
    }

    @Override  // b.ʻˑ.CLS18
    public final String getText() {
        return this.FLD5155 == null ? this.FLD5158 : this.FLD5155.getText();
    }

    public final void MTH7194(CLS1037 ˏٴ0) {
        this.FLD5159 = ˏٴ0;
    }

    @Override  // b.ʻˑ.CLS18
    public final void MTH798(String s) {
        this.FLD5156 = s;
        CLS18 ﾞᐧ0 = this.FLD5155;
        if(ﾞᐧ0 != null) {
            ﾞᐧ0.MTH798(s);
        }
    }

    @Override  // b.ʻˑ.CLS18
    public final void MTH799() {
        this.FLD5150.setBackgroundColor(CLS522.MTH7112());
    }

    @Override  // b.ʻˑ.CLS18
    public final void MTH800(String s) {
        this.FLD5158 = s;
        CLS18 ﾞᐧ0 = this.FLD5155;
        if(ﾞᐧ0 != null) {
            ﾞᐧ0.MTH800(s);
        }
    }

    @Override  // b.ʻˑ.CLS18
    public final void MTH801(int v) {
        this.FLD5161 = v;
        CLS18 ﾞᐧ0 = this.FLD5155;
        if(ﾞᐧ0 != null) {
            ﾞᐧ0.MTH801(v);
        }
        View view0 = this.FLD5160;
        if(view0 != null) {
            view0.setVisibility(v);
        }
    }

    @Override  // b.ʻˑ.CLS18
    public final void MTH802(View view0) {
        this.FLD5160 = view0;
        view0.setVisibility(this.FLD5161);
    }

    public final void MTH7200(boolean z) {
        if(z) {
            this.FLD5151 = false;
            this.FLD5152 = true;
        }
    }

    @Override  // b.ʻˑ.CLS18
    public final View MTH803() {
        View view0;
        if(this.FLD5150 == null) {
            Activity activity0 = (Activity)this.FLD5153.get();
            if(this.FLD5151) {
                CLS1626 ـﹳ0 = new CLS1626(activity0);
                ـﹳ0.MTH7324(new CLS67(this, activity0, ـﹳ0, 2));
                ـﹳ0.MTH800(this.FLD5158);
                ـﹳ0.MTH798(this.FLD5156);
                ـﹳ0.MTH801(this.FLD5161);
                this.FLD5155 = ـﹳ0;
                view0 = ـﹳ0.MTH803();
            }
            else if(this.FLD5152) {
                LinearLayout linearLayout0 = new LinearLayout(activity0);
                linearLayout0.setGravity(0x30);
                linearLayout0.setOrientation(1);
                CLS526 ʻᵎ$ˆٴ0 = this.FLD5159;
                if(ʻᵎ$ˆٴ0 != null) {
                    ʻᵎ$ˆٴ0.MTH7191(linearLayout0);
                }
                CLS1632 ﾞˎ0 = new CLS1632(activity0);
                ﾞˎ0.FLD5391.add(linearLayout0);
                ﾞˎ0.MTH800(this.FLD5158);
                ﾞˎ0.MTH798(this.FLD5156);
                ﾞˎ0.MTH801(this.FLD5161);
                this.FLD5155 = ﾞˎ0;
                view0 = ﾞˎ0.MTH803();
            }
            else {
                LinearLayout linearLayout1 = new LinearLayout(activity0);
                linearLayout1.setGravity(0x30);
                linearLayout1.setOrientation(1);
                LinearLayout linearLayout2 = new LinearLayout(activity0);
                linearLayout2.setGravity(0x30);
                linearLayout2.setOrientation(1);
                CLS1626 ـﹳ1 = new CLS1626(activity0);
                ـﹳ1.MTH800(this.FLD5158);
                ـﹳ1.MTH798(this.FLD5156);
                if(ـﹳ1.FLD5295) {
                    ـﹳ1.FLD5305.setRotation(90.0f);
                }
                ـﹳ1.MTH7324(new CLS67(this, linearLayout2, ـﹳ1, 3));
                View view1 = ـﹳ1.MTH803();
                view1.setPadding(CLS523.MTH7137(11), 0, CLS523.MTH7137(10), CLS523.MTH7137(10));
                linearLayout1.addView(view1, new LinearLayout.LayoutParams(-1, -1));
                CLS526 ʻᵎ$ˆٴ1 = this.FLD5159;
                if(ʻᵎ$ˆٴ1 != null) {
                    ʻᵎ$ˆٴ1.MTH7191(linearLayout2);
                }
                linearLayout1.addView(linearLayout2, new LinearLayout.LayoutParams(-1, -1));
                linearLayout2.setVisibility(8);
                linearLayout1.setVisibility(this.FLD5161);
                this.FLD5155 = ـﹳ1;
                view0 = linearLayout1;
            }
            this.FLD5150 = view0;
        }
        return this.FLD5150;
    }
}

