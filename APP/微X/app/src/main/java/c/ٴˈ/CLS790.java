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
import android.widget.TextView;
import c.ˋﹳ.CLS108;
import c.ـˉ.CLS172;
import c.ـˉ.CLS258;
import c.ـˉ.CLS264;
import java.lang.ref.WeakReference;

public class CLS790 implements CLS108 {
    public String FLD1216;
    public View FLD1217;
    public final WeakReference FLD1218;
    public boolean FLD1219;
    public View FLD1220;
    public String FLD1221;
    public TextView FLD1222;
    public TextView FLD1223;
    public int FLD1224;
    public View.OnClickListener FLD1225;

    public CLS790(Activity activity0) {
        this.FLD1224 = 0;
        this.FLD1219 = true;
        this.FLD1218 = new WeakReference(activity0);
    }

    @Override  // c.ˋﹳ.CLS108
    public View MTH2282() {
        if(this.FLD1217 == null) {
            this.FLD1217 = this.MTH4213();
        }
        return this.FLD1217;
    }

    public void MTH4206() {
        this.FLD1217.setEnabled(false);
    }

    @Override  // c.ˋﹳ.CLS108
    public void MTH2283(View view0) {
        this.FLD1220 = view0;
        view0.setVisibility(this.FLD1224);
    }

    // 去混淆评级： 低(20)
    // 此方法包含解密的字符串
    public void MTH4208(String s) {
        new CLS284(s);
        this.FLD1216 = "";
        CLS258.MTH3751(this.FLD1222, "");
    }

    public void MTH4209(LinearLayout linearLayout0, boolean z) {
        CLS258.MTH3813(linearLayout0, ((CLS108)this), z);
    }

    public void MTH4210(String s) {
        this.FLD1221 = s;
        CLS258.MTH3751(this.FLD1223, s);
    }

    public void MTH4211(View.OnClickListener view$OnClickListener0) {
        this.FLD1225 = view$OnClickListener0;
        View view0 = this.FLD1217;
        if(view0 != null) {
            view0.setOnClickListener(view$OnClickListener0);
            CLS258.MTH3785(this.FLD1217, CLS264.MTH4104(CLS172.MTH3039()));
        }
    }

    public void MTH4212() {
        this.FLD1217.setEnabled(true);
    }

    public final View MTH4213() {
        Activity activity0 = (Activity)this.FLD1218.get();
        LinearLayout linearLayout0 = new LinearLayout(activity0);
        linearLayout0.setGravity(0x30);
        linearLayout0.setOrientation(1);
        RelativeLayout relativeLayout0 = new RelativeLayout(activity0);
        relativeLayout0.setId(CLS258.MTH3807());
        RelativeLayout relativeLayout1 = new RelativeLayout(activity0);
        relativeLayout1.setId(CLS258.MTH3807());
        TextView textView0 = new TextView(activity0);
        this.FLD1222 = textView0;
        textView0.setTextSize(2, 17.0f);
        this.FLD1222.setId(CLS258.MTH3807());
        CLS258.MTH3751(this.FLD1222, this.FLD1216);
        this.FLD1222.setTextColor(CLS172.MTH3033());
        this.FLD1222.setGravity(1);
        this.FLD1222.setPadding(0, CLS258.MTH3770(10), 0, CLS258.MTH3770(5));
        RelativeLayout.LayoutParams relativeLayout$LayoutParams0 = new RelativeLayout.LayoutParams(-1, -2);
        relativeLayout$LayoutParams0.addRule(14, relativeLayout1.getId());
        relativeLayout1.addView(this.FLD1222, relativeLayout$LayoutParams0);
        TextView textView1 = new TextView(activity0);
        this.FLD1223 = textView1;
        textView1.setTextSize(2, 14.0f);
        this.FLD1223.setId(CLS258.MTH3807());
        CLS258.MTH3751(this.FLD1223, this.FLD1221);
        this.FLD1223.setGravity(1);
        this.FLD1223.setTextColor(CLS172.MTH3036());
        RelativeLayout.LayoutParams relativeLayout$LayoutParams1 = new RelativeLayout.LayoutParams(-1, -2);
        relativeLayout$LayoutParams1.addRule(14, relativeLayout1.getId());
        relativeLayout$LayoutParams1.addRule(3, this.FLD1222.getId());
        relativeLayout1.addView(this.FLD1223, relativeLayout$LayoutParams1);
        if(TextUtils.isEmpty(this.FLD1221)) {
            this.FLD1223.setVisibility(8);
        }
        RelativeLayout.LayoutParams relativeLayout$LayoutParams2 = new RelativeLayout.LayoutParams(-1, -2);
        relativeLayout$LayoutParams2.addRule(13, relativeLayout0.getId());
        relativeLayout0.addView(relativeLayout1, relativeLayout$LayoutParams2);
        linearLayout0.addView(relativeLayout0, new LinearLayout.LayoutParams(-1, -2));
        View.OnClickListener view$OnClickListener0 = this.FLD1225;
        if(view$OnClickListener0 == null) {
            linearLayout0.setBackgroundColor(CLS172.MTH3039());
        }
        else {
            linearLayout0.setOnClickListener(view$OnClickListener0);
            CLS258.MTH3785(linearLayout0, CLS264.MTH4104(CLS172.MTH3039()));
        }
        linearLayout0.setVisibility(this.FLD1224);
        linearLayout0.setActivated(this.FLD1219);
        return linearLayout0;
    }
}

