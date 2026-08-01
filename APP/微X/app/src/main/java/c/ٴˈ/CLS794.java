// Decompiled by JEB v5.42.0.202606242140

package c.ٴˈ;

import android.app.Activity;
import android.text.TextUtils;
import android.view.View.OnClickListener;
import android.view.View;
import android.widget.LinearLayout.LayoutParams;
import android.widget.LinearLayout;
import android.widget.RelativeLayout.LayoutParams;
import android.widget.RelativeLayout;
import android.widget.SeekBar;
import android.widget.TextView;
import c.ˋﹳ.CLS108;
import c.ـˉ.CLS172;
import c.ـˉ.CLS258;
import java.lang.ref.WeakReference;

public class CLS794 implements CLS108 {
    public final WeakReference FLD1271;
    public boolean FLD1272;
    public TextView FLD1273;
    public final SeekBar FLD1274;
    public View FLD1275;
    public String FLD1276;
    public String FLD1277;
    public View.OnClickListener FLD1278;
    public TextView FLD1279;
    public View FLD1280;
    public String FLD1281;
    public int FLD1282;
    public TextView FLD1283;

    public CLS794(Activity activity0) {
        this.FLD1282 = 0;
        this.FLD1272 = false;
        this.FLD1271 = new WeakReference(activity0);
        this.FLD1274 = new SeekBar(activity0);
    }

    @Override  // c.ˋﹳ.CLS108
    public View MTH2282() {
        if(this.FLD1275 == null) {
            this.FLD1275 = this.MTH4269();
        }
        return this.FLD1275;
    }

    @Override  // c.ˋﹳ.CLS108
    public void MTH2283(View view0) {
        this.FLD1280 = view0;
        view0.setVisibility(this.FLD1282);
    }

    public final View MTH4269() {
        int v1;
        int v;
        Activity activity0 = (Activity)this.FLD1271.get();
        LinearLayout linearLayout0 = new LinearLayout(activity0);
        RelativeLayout relativeLayout0 = new RelativeLayout(activity0);
        relativeLayout0.setId(CLS258.MTH3807());
        RelativeLayout relativeLayout1 = new RelativeLayout(activity0);
        relativeLayout1.setId(CLS258.MTH3807());
        TextView textView0 = new TextView(activity0);
        this.FLD1273 = textView0;
        textView0.setTextSize(2, 17.0f);
        this.FLD1273.setId(CLS258.MTH3807());
        CLS258.MTH3751(this.FLD1273, this.FLD1281);
        this.FLD1273.setTextColor(CLS172.MTH3033());
        if(this.FLD1272) {
            this.FLD1273.setPadding(0, CLS258.MTH3770(1), 0, 0);
        }
        else {
            this.FLD1273.setPadding(0, CLS258.MTH3770(10), 0, CLS258.MTH3770(5));
        }
        RelativeLayout.LayoutParams relativeLayout$LayoutParams0 = new RelativeLayout.LayoutParams(-2, -2);
        relativeLayout$LayoutParams0.addRule(10, relativeLayout1.getId());
        relativeLayout$LayoutParams0.addRule(9, relativeLayout1.getId());
        relativeLayout1.addView(this.FLD1273, relativeLayout$LayoutParams0);
        TextView textView1 = new TextView(activity0);
        this.FLD1279 = textView1;
        textView1.setTextSize(2, 14.0f);
        this.FLD1279.setId(CLS258.MTH3807());
        CLS258.MTH3751(this.FLD1279, this.FLD1276);
        this.FLD1279.setTextColor(CLS172.MTH3036());
        RelativeLayout.LayoutParams relativeLayout$LayoutParams1 = new RelativeLayout.LayoutParams(-2, -2);
        relativeLayout$LayoutParams1.addRule(9, relativeLayout1.getId());
        relativeLayout$LayoutParams1.addRule(3, this.FLD1273.getId());
        this.FLD1279.setPadding(CLS258.MTH3770(5), 0, 0, 0);
        relativeLayout1.addView(this.FLD1279, relativeLayout$LayoutParams1);
        if(TextUtils.isEmpty(this.FLD1276)) {
            this.FLD1279.setVisibility(8);
        }
        TextView textView2 = new TextView(activity0);
        this.FLD1283 = textView2;
        textView2.setTextSize(2, 16.0f);
        this.FLD1283.setId(CLS258.MTH3807());
        CLS258.MTH3751(this.FLD1283, this.FLD1277);
        this.FLD1283.setTextColor(CLS172.MTH3037());
        if(this.FLD1272) {
            this.FLD1283.setPadding(0, CLS258.MTH3770(1), 0, 0);
        }
        else {
            this.FLD1283.setPadding(0, CLS258.MTH3770(10), 0, CLS258.MTH3770(5));
        }
        View.OnClickListener view$OnClickListener0 = this.FLD1278;
        if(view$OnClickListener0 != null) {
            this.FLD1283.setOnClickListener(view$OnClickListener0);
        }
        RelativeLayout.LayoutParams relativeLayout$LayoutParams2 = new RelativeLayout.LayoutParams(-2, -2);
        relativeLayout$LayoutParams2.addRule(10, relativeLayout1.getId());
        relativeLayout$LayoutParams2.addRule(11, relativeLayout1.getId());
        relativeLayout1.addView(this.FLD1283, relativeLayout$LayoutParams2);
        if(TextUtils.isEmpty(this.FLD1281) && TextUtils.isEmpty(this.FLD1277)) {
            this.FLD1273.setVisibility(8);
            this.FLD1283.setVisibility(8);
            if(!this.FLD1272) {
                v = CLS258.MTH3770(10);
                v1 = CLS258.MTH3770(5);
                this.FLD1274.setPadding(0, v, 0, v1);
            }
        }
        else if(!this.FLD1272) {
            v = CLS258.MTH3770(5);
            v1 = CLS258.MTH3770(3);
            this.FLD1274.setPadding(0, v, 0, v1);
        }
        RelativeLayout.LayoutParams relativeLayout$LayoutParams3 = new RelativeLayout.LayoutParams(-1, -2);
        relativeLayout$LayoutParams3.addRule(9, relativeLayout1.getId());
        relativeLayout$LayoutParams3.addRule(3, this.FLD1279.getId());
        int v2 = CLS258.MTH3807();
        this.FLD1274.setId(v2);
        relativeLayout1.addView(this.FLD1274, relativeLayout$LayoutParams3);
        RelativeLayout.LayoutParams relativeLayout$LayoutParams4 = new RelativeLayout.LayoutParams(-2, -2);
        relativeLayout$LayoutParams4.addRule(9, relativeLayout0.getId());
        relativeLayout$LayoutParams4.addRule(10, relativeLayout0.getId());
        relativeLayout0.addView(relativeLayout1, relativeLayout$LayoutParams4);
        linearLayout0.addView(relativeLayout0, new LinearLayout.LayoutParams(-1, -1));
        linearLayout0.setBackgroundColor(CLS172.MTH3039());
        linearLayout0.setVisibility(this.FLD1282);
        return linearLayout0;
    }

    public SeekBar MTH4270() {
        return this.FLD1274;
    }
}

