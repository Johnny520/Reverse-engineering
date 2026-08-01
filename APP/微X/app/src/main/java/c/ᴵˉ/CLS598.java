// Decompiled by JEB v5.42.0.202606242140

package c.ᴵˉ;

import android.app.Activity;
import android.text.TextUtils;
import android.view.View;
import android.widget.LinearLayout.LayoutParams;
import android.widget.LinearLayout;
import android.widget.TextView;
import c.ˏᵎ.CLS144;
import c.ˏᵎ.CLS185;
import c.ˏᵎ.CLS226;
import c.ﹶˆ.CLS341;
import java.lang.ref.WeakReference;
import java.util.ArrayList;

public class CLS598 implements CLS341 {
    public String FLD1165;
    public View FLD1166;
    public String FLD1167;
    public int FLD1168;
    public TextView FLD1169;
    public final ArrayList FLD1170;
    public TextView FLD1171;
    public final WeakReference FLD1172;

    public CLS598(Activity activity0) {
        this.FLD1168 = 0;
        this.FLD1172 = new WeakReference(activity0);
        this.FLD1170 = new ArrayList();
    }

    public CLS598 MTH3671(Object object0) {
        this.FLD1170.add(object0);
        return this;
    }

    public void MTH3672(String s) {
        this.FLD1167 = s;
        CLS144.MTH2197(this.FLD1169, s);
    }

    public final View MTH3673() {
        View view0;
        Activity activity0 = (Activity)this.FLD1172.get();
        LinearLayout linearLayout0 = new LinearLayout(activity0);
        linearLayout0.setGravity(0x30);
        linearLayout0.setOrientation(1);
        TextView textView0 = new TextView(activity0);
        this.FLD1171 = textView0;
        CLS144.MTH2197(textView0, this.FLD1165);
        this.FLD1171.setTextSize(2, 14.0f);
        this.FLD1171.setTextColor(CLS226.MTH3101());
        LinearLayout.LayoutParams linearLayout$LayoutParams0 = new LinearLayout.LayoutParams(-1, -2);
        linearLayout$LayoutParams0.setMargins(CLS144.MTH2175(4), 0, 0, 0);
        linearLayout0.addView(this.FLD1171, linearLayout$LayoutParams0);
        if(TextUtils.isEmpty(this.FLD1165)) {
            this.FLD1171.setVisibility(8);
        }
        TextView textView1 = new TextView(activity0);
        this.FLD1169 = textView1;
        CLS144.MTH2197(textView1, this.FLD1167);
        this.FLD1169.setTextSize(2, 12.0f);
        this.FLD1169.setBackgroundColor(CLS226.MTH3105());
        this.FLD1169.setTextColor(CLS226.MTH3098());
        LinearLayout.LayoutParams linearLayout$LayoutParams1 = new LinearLayout.LayoutParams(-1, -2);
        this.FLD1169.setPadding(CLS144.MTH2175(10), 0, 0, 0);
        linearLayout0.addView(this.FLD1169, linearLayout$LayoutParams1);
        if(TextUtils.isEmpty(this.FLD1167)) {
            this.FLD1169.setVisibility(8);
        }
        LinearLayout.LayoutParams linearLayout$LayoutParams2 = new LinearLayout.LayoutParams(-1, -2);
        for(Object object0: this.FLD1170) {
            try {
                if(object0 instanceof CLS341) {
                    view0 = ((CLS341)object0).MTH4823();
                }
                else {
                    view0 = object0 instanceof View ? ((View)object0) : null;
                }
                if(view0 == null) {
                    continue;
                }
                linearLayout0.addView(view0, linearLayout$LayoutParams2);
            }
            catch(Throwable throwable0) {
                CLS185.MTH2708(throwable0);
            }
        }
        linearLayout0.setVisibility(this.FLD1168);
        return linearLayout0;
    }

    // 去混淆评级： 低(20)
    // 此方法包含解密的字符串
    public void MTH3674(String s) {
        new CLS284(s);
        this.FLD1165 = "";
        CLS144.MTH2197(this.FLD1171, "");
    }

    @Override  // c.ﹶˆ.CLS341
    public void MTH4822(View view0) {
    }

    public void MTH3676(int v) {
        this.FLD1168 = v;
        View view0 = this.FLD1166;
        if(view0 != null) {
            view0.setVisibility(v);
        }
    }

    @Override  // c.ﹶˆ.CLS341
    public View MTH4823() {
        if(this.FLD1166 == null) {
            this.FLD1166 = this.MTH3673();
        }
        return this.FLD1166;
    }
}

