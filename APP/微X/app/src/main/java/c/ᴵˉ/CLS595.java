// Decompiled by JEB v5.42.0.202606242140

package c.ᴵˉ;

import android.app.Activity;
import android.text.TextUtils;
import android.view.View;
import android.widget.CompoundButton.OnCheckedChangeListener;
import android.widget.LinearLayout.LayoutParams;
import android.widget.LinearLayout;
import android.widget.RelativeLayout.LayoutParams;
import android.widget.RelativeLayout;
import android.widget.Switch;
import android.widget.TextView;
import c.ˏᵎ.CLS144;
import c.ˏᵎ.CLS226;
import c.ﹶˆ.CLS341;
import java.lang.ref.WeakReference;

public class CLS595 implements CLS341 {
    public String FLD1120;
    public Switch FLD1121;
    public View FLD1122;
    public boolean FLD1123;
    public CompoundButton.OnCheckedChangeListener FLD1124;
    public boolean FLD1125;
    public View FLD1126;
    public boolean FLD1127;
    public TextView FLD1128;
    public final WeakReference FLD1129;
    public int FLD1130;
    public String FLD1131;

    public CLS595(Activity activity0) {
        this.FLD1123 = false;
        this.FLD1130 = 0;
        this.FLD1127 = true;
        this.FLD1125 = false;
        this.FLD1129 = new WeakReference(activity0);
    }

    public final View MTH3618() {
        int v1;
        int v;
        Switch switch1;
        Activity activity0 = (Activity)this.FLD1129.get();
        LinearLayout linearLayout0 = new LinearLayout(activity0);
        RelativeLayout relativeLayout0 = new RelativeLayout(activity0);
        relativeLayout0.setId(CLS144.MTH2162());
        RelativeLayout relativeLayout1 = new RelativeLayout(activity0);
        relativeLayout1.setId(CLS144.MTH2162());
        Switch switch0 = new Switch(activity0);
        this.FLD1121 = switch0;
        switch0.setTextSize(2, 17.0f);
        this.FLD1121.setId(CLS144.MTH2162());
        CLS144.MTH2197(this.FLD1121, this.FLD1131);
        this.FLD1121.setTextColor(CLS226.MTH3099());
        this.FLD1121.setChecked(this.FLD1123);
        this.FLD1121.setOnCheckedChangeListener(this.FLD1124);
        if(this.FLD1125) {
            switch1 = this.FLD1121;
            v = CLS144.MTH2175(3);
            v1 = 1;
        }
        else {
            switch1 = this.FLD1121;
            v = CLS144.MTH2175(10);
            v1 = 5;
        }
        switch1.setPadding(0, v, 0, CLS144.MTH2175(v1));
        this.FLD1121.setEnabled(this.FLD1127);
        RelativeLayout.LayoutParams relativeLayout$LayoutParams0 = new RelativeLayout.LayoutParams(-1, -2);
        relativeLayout$LayoutParams0.addRule(10, relativeLayout1.getId());
        relativeLayout$LayoutParams0.addRule(9, relativeLayout1.getId());
        relativeLayout1.addView(this.FLD1121, relativeLayout$LayoutParams0);
        TextView textView0 = new TextView(activity0);
        this.FLD1128 = textView0;
        textView0.setTextSize(2, 14.0f);
        this.FLD1128.setId(CLS144.MTH2162());
        CLS144.MTH2197(this.FLD1128, this.FLD1120);
        this.FLD1128.setTextColor(CLS226.MTH3098());
        RelativeLayout.LayoutParams relativeLayout$LayoutParams1 = new RelativeLayout.LayoutParams(-2, -2);
        relativeLayout$LayoutParams1.addRule(9, relativeLayout1.getId());
        relativeLayout$LayoutParams1.addRule(3, this.FLD1121.getId());
        relativeLayout1.addView(this.FLD1128, relativeLayout$LayoutParams1);
        if(TextUtils.isEmpty(this.FLD1120)) {
            this.FLD1128.setVisibility(8);
        }
        RelativeLayout.LayoutParams relativeLayout$LayoutParams2 = new RelativeLayout.LayoutParams(-2, -2);
        relativeLayout$LayoutParams2.addRule(9, relativeLayout0.getId());
        relativeLayout$LayoutParams2.addRule(10, relativeLayout0.getId());
        relativeLayout0.addView(relativeLayout1, relativeLayout$LayoutParams2);
        linearLayout0.addView(relativeLayout0, new LinearLayout.LayoutParams(-1, -1));
        linearLayout0.setBackgroundColor(CLS226.MTH3105());
        linearLayout0.setVisibility(this.FLD1130);
        return linearLayout0;
    }

    public void MTH3619(String s) {
        this.FLD1120 = s;
        CLS144.MTH2197(this.FLD1128, s);
    }

    public void MTH3620(boolean z) {
        this.FLD1123 = z;
        Switch switch0 = this.FLD1121;
        if(switch0 != null) {
            switch0.setChecked(z);
        }
    }

    public void MTH3621(CompoundButton.OnCheckedChangeListener compoundButton$OnCheckedChangeListener0) {
        this.FLD1124 = compoundButton$OnCheckedChangeListener0;
        Switch switch0 = this.FLD1121;
        if(switch0 != null) {
            switch0.setOnCheckedChangeListener(compoundButton$OnCheckedChangeListener0);
        }
    }

    @Override  // c.ﹶˆ.CLS341
    public void MTH4822(View view0) {
        this.FLD1122 = view0;
        view0.setVisibility(this.FLD1130);
    }

    // 去混淆评级： 低(20)
    // 此方法包含解密的字符串
    public void MTH3623(String s) {
        new CLS284(s);
        this.FLD1131 = "";
        CLS144.MTH2197(this.FLD1121, "");
    }

    @Override  // c.ﹶˆ.CLS341
    public View MTH4823() {
        if(this.FLD1126 == null) {
            this.FLD1126 = this.MTH3618();
        }
        return this.FLD1126;
    }
}

