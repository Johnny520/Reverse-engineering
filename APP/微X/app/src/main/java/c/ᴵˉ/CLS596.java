// Decompiled by JEB v5.42.0.202606242140

package c.ᴵˉ;

import android.app.Activity;
import android.text.TextUtils;
import android.view.View.OnClickListener;
import android.view.View;
import android.widget.LinearLayout.LayoutParams;
import android.widget.LinearLayout;
import android.widget.RelativeLayout.LayoutParams;
import android.widget.RelativeLayout;
import android.widget.TextView;
import c.ˏᵎ.CLS144;
import c.ˏᵎ.CLS169;
import c.ˏᵎ.CLS226;
import c.ﹶˆ.CLS341;
import java.lang.ref.WeakReference;

public class CLS596 implements CLS341 {
    public String FLD1132;
    public boolean FLD1133;
    public View FLD1134;
    public View.OnClickListener FLD1135;
    public int FLD1136;
    public TextView FLD1137;
    public View FLD1138;
    public final WeakReference FLD1139;
    public TextView FLD1140;
    public String FLD1141;

    public CLS596(Activity activity0) {
        this.FLD1136 = 0;
        this.FLD1133 = true;
        this.FLD1139 = new WeakReference(activity0);
    }

    public void MTH3626(LinearLayout linearLayout0, boolean z) {
        CLS144.MTH2191(linearLayout0, ((CLS341)this), z);
    }

    // 去混淆评级： 低(20)
    // 此方法包含解密的字符串
    public void MTH3627(String s) {
        new CLS284(s);
        this.FLD1141 = "";
        CLS144.MTH2197(this.FLD1140, "");
    }

    public void MTH3628() {
        this.FLD1134.setEnabled(false);
    }

    public final View MTH3629() {
        Activity activity0 = (Activity)this.FLD1139.get();
        LinearLayout linearLayout0 = new LinearLayout(activity0);
        linearLayout0.setGravity(0x30);
        linearLayout0.setOrientation(1);
        RelativeLayout relativeLayout0 = new RelativeLayout(activity0);
        relativeLayout0.setId(CLS144.MTH2162());
        RelativeLayout relativeLayout1 = new RelativeLayout(activity0);
        relativeLayout1.setId(CLS144.MTH2162());
        TextView textView0 = new TextView(activity0);
        this.FLD1140 = textView0;
        textView0.setTextSize(2, 17.0f);
        this.FLD1140.setId(CLS144.MTH2162());
        CLS144.MTH2197(this.FLD1140, this.FLD1141);
        this.FLD1140.setTextColor(CLS226.MTH3099());
        this.FLD1140.setGravity(1);
        this.FLD1140.setPadding(0, CLS144.MTH2175(10), 0, CLS144.MTH2175(5));
        RelativeLayout.LayoutParams relativeLayout$LayoutParams0 = new RelativeLayout.LayoutParams(-1, -2);
        relativeLayout$LayoutParams0.addRule(14, relativeLayout1.getId());
        relativeLayout1.addView(this.FLD1140, relativeLayout$LayoutParams0);
        TextView textView1 = new TextView(activity0);
        this.FLD1137 = textView1;
        textView1.setTextSize(2, 14.0f);
        this.FLD1137.setId(CLS144.MTH2162());
        CLS144.MTH2197(this.FLD1137, this.FLD1132);
        this.FLD1137.setGravity(1);
        this.FLD1137.setTextColor(CLS226.MTH3098());
        RelativeLayout.LayoutParams relativeLayout$LayoutParams1 = new RelativeLayout.LayoutParams(-1, -2);
        relativeLayout$LayoutParams1.addRule(14, relativeLayout1.getId());
        relativeLayout$LayoutParams1.addRule(3, this.FLD1140.getId());
        relativeLayout1.addView(this.FLD1137, relativeLayout$LayoutParams1);
        if(TextUtils.isEmpty(this.FLD1132)) {
            this.FLD1137.setVisibility(8);
        }
        RelativeLayout.LayoutParams relativeLayout$LayoutParams2 = new RelativeLayout.LayoutParams(-1, -2);
        relativeLayout$LayoutParams2.addRule(13, relativeLayout0.getId());
        relativeLayout0.addView(relativeLayout1, relativeLayout$LayoutParams2);
        linearLayout0.addView(relativeLayout0, new LinearLayout.LayoutParams(-1, -2));
        View.OnClickListener view$OnClickListener0 = this.FLD1135;
        if(view$OnClickListener0 == null) {
            linearLayout0.setBackgroundColor(CLS226.MTH3105());
        }
        else {
            linearLayout0.setOnClickListener(view$OnClickListener0);
            CLS144.MTH2185(linearLayout0, CLS169.MTH2335(CLS226.MTH3105()));
        }
        linearLayout0.setVisibility(this.FLD1136);
        linearLayout0.setActivated(this.FLD1133);
        return linearLayout0;
    }

    public void MTH3630() {
        this.FLD1134.setEnabled(true);
    }

    public void MTH3631(View.OnClickListener view$OnClickListener0) {
        this.FLD1135 = view$OnClickListener0;
        View view0 = this.FLD1134;
        if(view0 != null) {
            view0.setOnClickListener(view$OnClickListener0);
            CLS144.MTH2185(this.FLD1134, CLS169.MTH2335(CLS226.MTH3105()));
        }
    }

    @Override  // c.ﹶˆ.CLS341
    public void MTH4822(View view0) {
        this.FLD1138 = view0;
        view0.setVisibility(this.FLD1136);
    }

    public void MTH3633(String s) {
        this.FLD1132 = s;
        CLS144.MTH2197(this.FLD1137, s);
    }

    @Override  // c.ﹶˆ.CLS341
    public View MTH4823() {
        if(this.FLD1134 == null) {
            this.FLD1134 = this.MTH3629();
        }
        return this.FLD1134;
    }
}

