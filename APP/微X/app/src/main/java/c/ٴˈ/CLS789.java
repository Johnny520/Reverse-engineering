// Decompiled by JEB v5.42.0.202606242140

package c.ٴˈ;

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
import c.ˋﹳ.CLS108;
import c.ـˉ.CLS172;
import c.ـˉ.CLS258;
import java.lang.ref.WeakReference;

public class CLS789 implements CLS108 {
    public String FLD1204;
    public View FLD1205;
    public boolean FLD1206;
    public final WeakReference FLD1207;
    public boolean FLD1208;
    public Switch FLD1209;
    public TextView FLD1210;
    public String FLD1211;
    public int FLD1212;
    public boolean FLD1213;
    public View FLD1214;
    public CompoundButton.OnCheckedChangeListener FLD1215;

    public CLS789(Activity activity0) {
        this.FLD1206 = false;
        this.FLD1212 = 0;
        this.FLD1213 = true;
        this.FLD1208 = false;
        this.FLD1207 = new WeakReference(activity0);
    }

    @Override  // c.ˋﹳ.CLS108
    public View MTH2282() {
        if(this.FLD1214 == null) {
            this.FLD1214 = this.MTH4200();
        }
        return this.FLD1214;
    }

    public void MTH4198(String s) {
        this.FLD1211 = s;
        CLS258.MTH3751(this.FLD1210, s);
    }

    @Override  // c.ˋﹳ.CLS108
    public void MTH2283(View view0) {
        this.FLD1205 = view0;
        view0.setVisibility(this.FLD1212);
    }

    public final View MTH4200() {
        int v1;
        int v;
        Switch switch1;
        Activity activity0 = (Activity)this.FLD1207.get();
        LinearLayout linearLayout0 = new LinearLayout(activity0);
        RelativeLayout relativeLayout0 = new RelativeLayout(activity0);
        relativeLayout0.setId(CLS258.MTH3807());
        RelativeLayout relativeLayout1 = new RelativeLayout(activity0);
        relativeLayout1.setId(CLS258.MTH3807());
        Switch switch0 = new Switch(activity0);
        this.FLD1209 = switch0;
        switch0.setTextSize(2, 17.0f);
        this.FLD1209.setId(CLS258.MTH3807());
        CLS258.MTH3751(this.FLD1209, this.FLD1204);
        this.FLD1209.setTextColor(CLS172.MTH3033());
        this.FLD1209.setChecked(this.FLD1206);
        this.FLD1209.setOnCheckedChangeListener(this.FLD1215);
        if(this.FLD1208) {
            switch1 = this.FLD1209;
            v = CLS258.MTH3770(3);
            v1 = 1;
        }
        else {
            switch1 = this.FLD1209;
            v = CLS258.MTH3770(10);
            v1 = 5;
        }
        switch1.setPadding(0, v, 0, CLS258.MTH3770(v1));
        this.FLD1209.setEnabled(this.FLD1213);
        RelativeLayout.LayoutParams relativeLayout$LayoutParams0 = new RelativeLayout.LayoutParams(-1, -2);
        relativeLayout$LayoutParams0.addRule(10, relativeLayout1.getId());
        relativeLayout$LayoutParams0.addRule(9, relativeLayout1.getId());
        relativeLayout1.addView(this.FLD1209, relativeLayout$LayoutParams0);
        TextView textView0 = new TextView(activity0);
        this.FLD1210 = textView0;
        textView0.setTextSize(2, 14.0f);
        this.FLD1210.setId(CLS258.MTH3807());
        CLS258.MTH3751(this.FLD1210, this.FLD1211);
        this.FLD1210.setTextColor(CLS172.MTH3036());
        RelativeLayout.LayoutParams relativeLayout$LayoutParams1 = new RelativeLayout.LayoutParams(-2, -2);
        relativeLayout$LayoutParams1.addRule(9, relativeLayout1.getId());
        relativeLayout$LayoutParams1.addRule(3, this.FLD1209.getId());
        relativeLayout1.addView(this.FLD1210, relativeLayout$LayoutParams1);
        if(TextUtils.isEmpty(this.FLD1211)) {
            this.FLD1210.setVisibility(8);
        }
        RelativeLayout.LayoutParams relativeLayout$LayoutParams2 = new RelativeLayout.LayoutParams(-2, -2);
        relativeLayout$LayoutParams2.addRule(9, relativeLayout0.getId());
        relativeLayout$LayoutParams2.addRule(10, relativeLayout0.getId());
        relativeLayout0.addView(relativeLayout1, relativeLayout$LayoutParams2);
        linearLayout0.addView(relativeLayout0, new LinearLayout.LayoutParams(-1, -1));
        linearLayout0.setBackgroundColor(CLS172.MTH3039());
        linearLayout0.setVisibility(this.FLD1212);
        return linearLayout0;
    }

    // 去混淆评级： 低(20)
    // 此方法包含解密的字符串
    public void MTH4201(String s) {
        new CLS284(s);
        this.FLD1204 = "";
        CLS258.MTH3751(this.FLD1209, "");
    }

    public void MTH4202(CompoundButton.OnCheckedChangeListener compoundButton$OnCheckedChangeListener0) {
        this.FLD1215 = compoundButton$OnCheckedChangeListener0;
        Switch switch0 = this.FLD1209;
        if(switch0 != null) {
            switch0.setOnCheckedChangeListener(compoundButton$OnCheckedChangeListener0);
        }
    }

    public void MTH4203(boolean z) {
        this.FLD1206 = z;
        Switch switch0 = this.FLD1209;
        if(switch0 != null) {
            switch0.setChecked(z);
        }
    }
}

