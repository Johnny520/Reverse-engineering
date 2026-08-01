// Decompiled by JEB v5.42.0.202606242140

package c.ٴˈ;

import android.app.Activity;
import android.view.View.OnClickListener;
import android.view.View;
import android.widget.LinearLayout.LayoutParams;
import android.widget.LinearLayout;
import c.ˋﹳ.CLS108;
import c.ـˉ.CLS197.CLS195;
import c.ـˉ.CLS197;
import c.ـˉ.CLS258;
import java.lang.ref.WeakReference;

public class CLS793 implements CLS108 {
    public String FLD1260;
    public int FLD1261;
    public final WeakReference FLD1262;
    public View.OnClickListener FLD1263;
    public View FLD1264;
    public CLS197 FLD1265;
    public String FLD1266;
    public boolean FLD1267;
    public boolean FLD1268;
    public View FLD1269;
    public CLS108 FLD1270;

    @Override  // c.ˋﹳ.CLS108
    public View MTH2282() {
        if(this.FLD1264 == null) {
            this.FLD1264 = this.MTH4264();
        }
        return this.FLD1264;
    }

    @Override  // c.ˋﹳ.CLS108
    public void MTH2283(View view0) {
        this.FLD1269 = view0;
        view0.setVisibility(this.FLD1261);
    }

    // 检测为 Lambda 实现
    private void MTH4258(LinearLayout linearLayout0, CLS795 יᴵ0, View view0) [...]

    private void MTH4259(LinearLayout linearLayout0) {
    }

    // 检测为 Lambda 实现
    private void MTH4260(Activity activity0, CLS795 יᴵ0, View view0) [...]

    public static void MTH4261(CLS793 ˑʼ0, LinearLayout linearLayout0) {
    }

    public boolean MTH4262() {
        return this.FLD1268;
    }

    public boolean MTH4263() {
        return this.FLD1267;
    }

    public final View MTH4264() {
        Activity activity0 = (Activity)this.FLD1262.get();
        if(this.FLD1267) {
            CLS795 יᴵ0 = new CLS795(activity0);
            יᴵ0.MTH4280((View view0) -> {
                if(this.FLD1265 == null) {
                    CLS197 ˆˊ0 = new CLS197(activity0, this.FLD1260);
                    this.FLD1265 = ˆˊ0;
                    ˆˊ0.MTH3189(((CLS195)new CLS792(this)));
                }
                if(this.FLD1265 != null && !this.FLD1265.isShowing()) {
                    this.FLD1265.show();
                }
                View.OnClickListener view$OnClickListener0 = this.FLD1263;
                if(view$OnClickListener0 != null) {
                    view$OnClickListener0.onClick(יᴵ0.MTH2282());
                }
            });
            יᴵ0.MTH4277(this.FLD1260);
            יᴵ0.MTH4281(this.FLD1266);
            יᴵ0.MTH4275(this.FLD1261);
            this.FLD1270 = יᴵ0;
            return יᴵ0.MTH2282();
        }
        if(this.FLD1268) {
            LinearLayout linearLayout0 = new LinearLayout(activity0);
            linearLayout0.setGravity(0x30);
            linearLayout0.setOrientation(1);
            CLS799 ᴵⁱ0 = new CLS799(activity0);
            ᴵⁱ0.MTH4322(linearLayout0);
            ᴵⁱ0.MTH4324(this.FLD1260);
            ᴵⁱ0.MTH4320(this.FLD1266);
            ᴵⁱ0.MTH4323(this.FLD1261);
            this.FLD1270 = ᴵⁱ0;
            return ᴵⁱ0.MTH2282();
        }
        LinearLayout linearLayout1 = new LinearLayout(activity0);
        linearLayout1.setGravity(0x30);
        linearLayout1.setOrientation(1);
        LinearLayout linearLayout2 = new LinearLayout(activity0);
        linearLayout2.setGravity(0x30);
        linearLayout2.setOrientation(1);
        CLS795 יᴵ1 = new CLS795(activity0);
        יᴵ1.MTH4277(this.FLD1260);
        יᴵ1.MTH4281(this.FLD1266);
        יᴵ1.MTH4273();
        יᴵ1.MTH4280((View view0) -> {
            if(linearLayout2.getVisibility() == 0) {
                linearLayout2.setVisibility(8);
                יᴵ1.MTH4273();
                return;
            }
            View.OnClickListener view$OnClickListener0 = this.FLD1263;
            if(view$OnClickListener0 != null) {
                view$OnClickListener0.onClick(יᴵ1.MTH2282());
            }
            linearLayout2.setVisibility(0);
            יᴵ1.MTH4282();
        });
        View view0 = יᴵ1.MTH2282();
        view0.setPadding(CLS258.MTH3770(11), 0, CLS258.MTH3770(10), CLS258.MTH3770(10));
        linearLayout1.addView(view0, new LinearLayout.LayoutParams(-1, -1));
        linearLayout1.addView(linearLayout2, new LinearLayout.LayoutParams(-1, -1));
        linearLayout2.setVisibility(8);
        linearLayout1.setVisibility(this.FLD1261);
        this.FLD1270 = יᴵ1;
        return linearLayout1;
    }
}

