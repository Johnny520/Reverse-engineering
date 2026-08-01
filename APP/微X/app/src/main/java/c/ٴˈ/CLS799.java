// Decompiled by JEB v5.42.0.202606242140

package c.ٴˈ;

import android.app.Activity;
import android.text.TextUtils;
import android.view.View;
import android.widget.LinearLayout.LayoutParams;
import android.widget.LinearLayout;
import android.widget.TextView;
import c.ˋﹳ.CLS108;
import c.ـˉ.CLS172;
import c.ـˉ.CLS204;
import c.ـˉ.CLS258;
import java.lang.ref.WeakReference;
import java.util.ArrayList;

public class CLS799 implements CLS108 {
    public final WeakReference FLD1339;
    public View FLD1340;
    public final ArrayList FLD1341;
    public String FLD1342;
    public TextView FLD1343;
    public TextView FLD1344;
    public int FLD1345;
    public String FLD1346;

    public CLS799(Activity activity0) {
        this.FLD1345 = 0;
        this.FLD1339 = new WeakReference(activity0);
        this.FLD1341 = new ArrayList();
    }

    @Override  // c.ˋﹳ.CLS108
    public View MTH2282() {
        if(this.FLD1340 == null) {
            this.FLD1340 = this.MTH4325();
        }
        return this.FLD1340;
    }

    public void MTH4320(String s) {
        this.FLD1346 = s;
        CLS258.MTH3751(this.FLD1344, s);
    }

    @Override  // c.ˋﹳ.CLS108
    public void MTH2283(View view0) {
    }

    public CLS799 MTH4322(Object object0) {
        this.FLD1341.add(object0);
        return this;
    }

    public void MTH4323(int v) {
        this.FLD1345 = v;
        View view0 = this.FLD1340;
        if(view0 != null) {
            view0.setVisibility(v);
        }
    }

    // 去混淆评级： 低(20)
    // 此方法包含解密的字符串
    public void MTH4324(String s) {
        new CLS284(s);
        this.FLD1342 = "";
        CLS258.MTH3751(this.FLD1343, "");
    }

    public final View MTH4325() {
        View view0;
        Activity activity0 = (Activity)this.FLD1339.get();
        LinearLayout linearLayout0 = new LinearLayout(activity0);
        linearLayout0.setGravity(0x30);
        linearLayout0.setOrientation(1);
        TextView textView0 = new TextView(activity0);
        this.FLD1343 = textView0;
        CLS258.MTH3751(textView0, this.FLD1342);
        this.FLD1343.setTextSize(2, 14.0f);
        this.FLD1343.setTextColor(CLS172.MTH3029());
        LinearLayout.LayoutParams linearLayout$LayoutParams0 = new LinearLayout.LayoutParams(-1, -2);
        linearLayout$LayoutParams0.setMargins(CLS258.MTH3770(4), 0, 0, 0);
        linearLayout0.addView(this.FLD1343, linearLayout$LayoutParams0);
        if(TextUtils.isEmpty(this.FLD1342)) {
            this.FLD1343.setVisibility(8);
        }
        TextView textView1 = new TextView(activity0);
        this.FLD1344 = textView1;
        CLS258.MTH3751(textView1, this.FLD1346);
        this.FLD1344.setTextSize(2, 12.0f);
        this.FLD1344.setBackgroundColor(CLS172.MTH3039());
        this.FLD1344.setTextColor(CLS172.MTH3036());
        LinearLayout.LayoutParams linearLayout$LayoutParams1 = new LinearLayout.LayoutParams(-1, -2);
        this.FLD1344.setPadding(CLS258.MTH3770(10), 0, 0, 0);
        linearLayout0.addView(this.FLD1344, linearLayout$LayoutParams1);
        if(TextUtils.isEmpty(this.FLD1346)) {
            this.FLD1344.setVisibility(8);
        }
        LinearLayout.LayoutParams linearLayout$LayoutParams2 = new LinearLayout.LayoutParams(-1, -2);
        for(Object object0: this.FLD1341) {
            try {
                if(object0 instanceof CLS108) {
                    view0 = ((CLS108)object0).MTH2282();
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
                CLS204.MTH3257(throwable0);
            }
        }
        linearLayout0.setVisibility(this.FLD1345);
        return linearLayout0;
    }
}

