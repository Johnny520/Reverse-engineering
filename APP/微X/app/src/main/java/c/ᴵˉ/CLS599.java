// Decompiled by JEB v5.42.0.202606242140

package c.ᴵˉ;

import android.app.Activity;
import android.view.View.OnClickListener;
import android.view.View;
import android.widget.LinearLayout.LayoutParams;
import android.widget.LinearLayout;
import c.ˏᵎ.CLS137.CLS136;
import c.ˏᵎ.CLS137;
import c.ˏᵎ.CLS144;
import c.ﹶˆ.CLS341;
import java.lang.ref.WeakReference;

public class CLS599 implements CLS341 {
    public String FLD1176;
    public View FLD1177;
    public int FLD1178;
    public CLS341 FLD1179;
    public View.OnClickListener FLD1180;
    public View FLD1181;
    public boolean FLD1182;
    public CLS137 FLD1183;
    public final WeakReference FLD1184;
    public boolean FLD1185;
    public String FLD1186;

    public static void MTH3680(CLS599 יⁱ0, LinearLayout linearLayout0) {
    }

    private void MTH3681(LinearLayout linearLayout0) {
    }

    // 检测为 Lambda 实现
    private void MTH3684(LinearLayout linearLayout0, CLS597 ˉˆ0, View view0) [...]

    public final View MTH3685() {
        Activity activity0 = (Activity)this.FLD1184.get();
        if(this.FLD1185) {
            CLS597 ˉˆ0 = new CLS597(activity0);
            ˉˆ0.MTH3642((View view0) -> {
                if(this.FLD1183 == null) {
                    CLS137 ʼﾞ0 = new CLS137(activity0, this.FLD1186);
                    this.FLD1183 = ʼﾞ0;
                    ʼﾞ0.MTH2042(((CLS136)new CLS603(this)));
                }
                if(this.FLD1183 != null && !this.FLD1183.isShowing()) {
                    this.FLD1183.show();
                }
                View.OnClickListener view$OnClickListener0 = this.FLD1180;
                if(view$OnClickListener0 != null) {
                    view$OnClickListener0.onClick(ˉˆ0.MTH4823());
                }
            });
            ˉˆ0.MTH3643(this.FLD1186);
            ˉˆ0.MTH3641(this.FLD1176);
            ˉˆ0.MTH3640(this.FLD1178);
            this.FLD1179 = ˉˆ0;
            return ˉˆ0.MTH4823();
        }
        if(this.FLD1182) {
            LinearLayout linearLayout0 = new LinearLayout(activity0);
            linearLayout0.setGravity(0x30);
            linearLayout0.setOrientation(1);
            CLS598 ˋʼ0 = new CLS598(activity0);
            ˋʼ0.MTH3671(linearLayout0);
            ˋʼ0.MTH3674(this.FLD1186);
            ˋʼ0.MTH3672(this.FLD1176);
            ˋʼ0.MTH3676(this.FLD1178);
            this.FLD1179 = ˋʼ0;
            return ˋʼ0.MTH4823();
        }
        LinearLayout linearLayout1 = new LinearLayout(activity0);
        linearLayout1.setGravity(0x30);
        linearLayout1.setOrientation(1);
        LinearLayout linearLayout2 = new LinearLayout(activity0);
        linearLayout2.setGravity(0x30);
        linearLayout2.setOrientation(1);
        CLS597 ˉˆ1 = new CLS597(activity0);
        ˉˆ1.MTH3643(this.FLD1186);
        ˉˆ1.MTH3641(this.FLD1176);
        ˉˆ1.MTH3638();
        ˉˆ1.MTH3642((View view0) -> {
            if(linearLayout2.getVisibility() == 0) {
                linearLayout2.setVisibility(8);
                ˉˆ1.MTH3638();
                return;
            }
            View.OnClickListener view$OnClickListener0 = this.FLD1180;
            if(view$OnClickListener0 != null) {
                view$OnClickListener0.onClick(ˉˆ1.MTH4823());
            }
            linearLayout2.setVisibility(0);
            ˉˆ1.MTH3639();
        });
        View view0 = ˉˆ1.MTH4823();
        view0.setPadding(CLS144.MTH2175(11), 0, CLS144.MTH2175(10), CLS144.MTH2175(10));
        linearLayout1.addView(view0, new LinearLayout.LayoutParams(-1, -1));
        linearLayout1.addView(linearLayout2, new LinearLayout.LayoutParams(-1, -1));
        linearLayout2.setVisibility(8);
        linearLayout1.setVisibility(this.FLD1178);
        this.FLD1179 = ˉˆ1;
        return linearLayout1;
    }

    public boolean MTH3686() {
        return this.FLD1185;
    }

    // 检测为 Lambda 实现
    private void MTH3687(Activity activity0, CLS597 ˉˆ0, View view0) [...]

    @Override  // c.ﹶˆ.CLS341
    public void MTH4822(View view0) {
        this.FLD1181 = view0;
        view0.setVisibility(this.FLD1178);
    }

    public boolean MTH3689() {
        return this.FLD1182;
    }

    @Override  // c.ﹶˆ.CLS341
    public View MTH4823() {
        if(this.FLD1177 == null) {
            this.FLD1177 = this.MTH3685();
        }
        return this.FLD1177;
    }
}

