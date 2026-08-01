// Decompiled by JEB v5.42.0.202606242140

package c.ٴˈ;

import android.app.Activity;
import android.text.TextUtils;
import android.view.View;
import android.widget.LinearLayout.LayoutParams;
import android.widget.LinearLayout;
import android.widget.RelativeLayout.LayoutParams;
import android.widget.RelativeLayout;
import android.widget.TextView;
import c.ˋﹳ.CLS108;
import c.ـˉ.CLS172;
import c.ـˉ.CLS258;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CLS796 implements CLS108 {
    public final WeakReference FLD1300;
    public boolean FLD1301;
    public TextView FLD1302;
    public final ArrayList FLD1303;
    public View FLD1304;
    public String FLD1305;
    public String FLD1306;
    public TextView FLD1307;
    public View FLD1308;
    public String FLD1309;
    public int FLD1310;
    public TextView FLD1311;

    public CLS796(Activity activity0) {
        this.FLD1310 = 0;
        this.FLD1300 = new WeakReference(activity0);
        this.FLD1303 = new ArrayList();
    }

    @Override  // c.ˋﹳ.CLS108
    public View MTH2282() {
        if(this.FLD1304 == null) {
            this.FLD1304 = this.MTH4287();
        }
        return this.FLD1304;
    }

    public final View MTH4287() {
        LinearLayout.LayoutParams linearLayout$LayoutParams0;
        Activity activity0 = (Activity)this.FLD1300.get();
        LinearLayout linearLayout0 = new LinearLayout(activity0);
        RelativeLayout relativeLayout0 = new RelativeLayout(activity0);
        relativeLayout0.setId(CLS258.MTH3807());
        RelativeLayout relativeLayout1 = new RelativeLayout(activity0);
        relativeLayout1.setId(CLS258.MTH3807());
        TextView textView0 = new TextView(activity0);
        this.FLD1302 = textView0;
        textView0.setTextSize(2, 17.0f);
        this.FLD1302.setId(CLS258.MTH3807());
        CLS258.MTH3751(this.FLD1302, this.FLD1309);
        this.FLD1302.setTextColor(CLS172.MTH3033());
        this.FLD1302.setPadding(0, CLS258.MTH3770(10), 0, CLS258.MTH3770(5));
        RelativeLayout.LayoutParams relativeLayout$LayoutParams0 = new RelativeLayout.LayoutParams(-2, -2);
        relativeLayout$LayoutParams0.addRule(10, relativeLayout1.getId());
        relativeLayout$LayoutParams0.addRule(9, relativeLayout1.getId());
        relativeLayout1.addView(this.FLD1302, relativeLayout$LayoutParams0);
        TextView textView1 = new TextView(activity0);
        this.FLD1307 = textView1;
        textView1.setTextSize(2, 14.0f);
        this.FLD1307.setId(CLS258.MTH3807());
        CLS258.MTH3751(this.FLD1307, this.FLD1305);
        this.FLD1307.setTextColor(CLS172.MTH3036());
        RelativeLayout.LayoutParams relativeLayout$LayoutParams1 = new RelativeLayout.LayoutParams(-2, -2);
        relativeLayout$LayoutParams1.addRule(9, relativeLayout1.getId());
        relativeLayout$LayoutParams1.addRule(3, this.FLD1302.getId());
        this.FLD1307.setPadding(CLS258.MTH3770(5), 0, 0, 0);
        relativeLayout1.addView(this.FLD1307, relativeLayout$LayoutParams1);
        if(TextUtils.isEmpty(this.FLD1305)) {
            this.FLD1307.setVisibility(8);
        }
        TextView textView2 = new TextView(activity0);
        this.FLD1311 = textView2;
        textView2.setTextSize(2, 16.0f);
        this.FLD1311.setId(CLS258.MTH3807());
        CLS258.MTH3751(this.FLD1311, this.FLD1306);
        this.FLD1311.setTextColor(CLS172.MTH3037());
        this.FLD1311.setPadding(0, CLS258.MTH3770(10), 0, CLS258.MTH3770(5));
        RelativeLayout.LayoutParams relativeLayout$LayoutParams2 = new RelativeLayout.LayoutParams(-2, -2);
        relativeLayout$LayoutParams2.addRule(10, relativeLayout1.getId());
        relativeLayout$LayoutParams2.addRule(11, relativeLayout1.getId());
        relativeLayout1.addView(this.FLD1311, relativeLayout$LayoutParams2);
        if(TextUtils.isEmpty(this.FLD1309) && TextUtils.isEmpty(this.FLD1306)) {
            this.FLD1302.setVisibility(8);
            this.FLD1311.setVisibility(8);
        }
        RelativeLayout.LayoutParams relativeLayout$LayoutParams3 = new RelativeLayout.LayoutParams(-1, -2);
        relativeLayout$LayoutParams3.addRule(9, relativeLayout1.getId());
        relativeLayout$LayoutParams3.addRule(3, this.FLD1307.getId());
        LinearLayout linearLayout1 = new LinearLayout(activity0);
        if(this.FLD1301) {
            linearLayout1.setGravity(17);
        }
        else {
            linearLayout1.setGravity(0x30);
        }
        linearLayout1.setOrientation(1);
        linearLayout1.setPadding(0, CLS258.MTH3770(5), 0, 0);
        if(this.FLD1301) {
            linearLayout$LayoutParams0 = new LinearLayout.LayoutParams(-2, -2);
            linearLayout$LayoutParams0.gravity = 17;
        }
        else {
            linearLayout$LayoutParams0 = new LinearLayout.LayoutParams(-1, -2);
        }
        for(Object object0: this.FLD1303) {
            View view0 = (View)object0;
            if(view0 != null) {
                view0.setPadding(0, 0, 0, CLS258.MTH3770(3));
                linearLayout1.addView(view0, linearLayout$LayoutParams0);
            }
        }
        relativeLayout1.addView(linearLayout1, relativeLayout$LayoutParams3);
        RelativeLayout.LayoutParams relativeLayout$LayoutParams4 = new RelativeLayout.LayoutParams(-2, -2);
        relativeLayout$LayoutParams4.addRule(9, relativeLayout0.getId());
        relativeLayout$LayoutParams4.addRule(10, relativeLayout0.getId());
        relativeLayout0.addView(relativeLayout1, relativeLayout$LayoutParams4);
        linearLayout0.addView(relativeLayout0, new LinearLayout.LayoutParams(-1, -1));
        linearLayout0.setBackgroundColor(CLS172.MTH3039());
        linearLayout0.setVisibility(this.FLD1310);
        return linearLayout0;
    }

    @Override  // c.ˋﹳ.CLS108
    public void MTH2283(View view0) {
        this.FLD1308 = view0;
        view0.setVisibility(this.FLD1310);
    }

    public void MTH4289(View view0) {
        this.FLD1303.add(view0);
    }

    public void MTH4290() {
        this.FLD1301 = true;
    }

    public void MTH4291(View[] arr_view) {
        List list0 = Arrays.asList(arr_view);
        this.FLD1303.addAll(list0);
    }
}

