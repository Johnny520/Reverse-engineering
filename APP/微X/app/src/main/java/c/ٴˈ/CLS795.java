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
import c.ˈⁱ.CLS95;
import c.ˋﹳ.CLS108;
import c.ـˉ.CLS172;
import c.ـˉ.CLS258;
import c.ـˉ.CLS264;
import java.lang.ref.WeakReference;

public class CLS795 implements CLS108 {
    public final TextView FLD1284;
    public int FLD1285;
    public final WeakReference FLD1286;
    public final TextView FLD1287;
    public View FLD1288;
    public View FLD1289;
    public View.OnClickListener FLD1290;
    public boolean FLD1291;
    public boolean FLD1292;
    public final TextView FLD1293;
    public String FLD1294;
    public String FLD1295;
    public String FLD1296;
    public final CLS283 FLD1297;

    // 此方法包含解密的字符串
    public CLS795(Activity activity0) {
        this.FLD1291 = true;
        this.FLD1285 = 0;
        this.FLD1292 = false;
        this.FLD1286 = new WeakReference(activity0);
        TextView textView0 = new TextView(activity0);
        this.FLD1287 = textView0;
        textView0.setTextColor(CLS172.MTH3033());
        TextView textView1 = new TextView(activity0);
        this.FLD1293 = textView1;
        textView1.setTextColor(CLS172.MTH3037());
        TextView textView2 = new TextView(activity0);
        this.FLD1284 = textView2;
        textView2.setTextColor(CLS172.MTH3036());
        this.FLD1297 = new CLS283(activity0);
        if(CLS95.MTH2031().MTH2725("\uD8E3reftext_disable_arrow", false)) {
            this.FLD1291 = false;
        }
    }

    @Override  // c.ˋﹳ.CLS108
    public View MTH2282() {
        if(this.FLD1288 == null) {
            this.FLD1288 = this.MTH4278();
        }
        return this.FLD1288;
    }

    public void MTH4273() {
        if(this.FLD1291) {
            this.FLD1297.setRotation(90.0f);
        }
    }

    @Override  // c.ˋﹳ.CLS108
    public void MTH2283(View view0) {
        this.FLD1289 = view0;
        view0.setVisibility(this.FLD1285);
    }

    public void MTH4275(int v) {
        this.FLD1285 = v;
        View view0 = this.FLD1288;
        if(view0 != null) {
            view0.setVisibility(v);
        }
        View view1 = this.FLD1289;
        if(view1 != null) {
            view1.setVisibility(v);
        }
    }

    public void MTH4276(String s) {
        this.FLD1295 = s;
        CLS258.MTH3751(this.FLD1293, s);
    }

    // 去混淆评级： 低(40)
    // 此方法包含解密的字符串
    public void MTH4277(String s) {
        new CLS284(s);
        this.FLD1296 = "";
        CLS258.MTH3751(this.FLD1287, "");
    }

    public final View MTH4278() {
        int v7;
        int v6;
        TextView textView1;
        int v2;
        int v1;
        TextView textView0;
        Activity activity0 = (Activity)this.FLD1286.get();
        LinearLayout linearLayout0 = new LinearLayout(activity0);
        RelativeLayout relativeLayout0 = new RelativeLayout(activity0);
        relativeLayout0.setId(CLS258.MTH3807());
        RelativeLayout relativeLayout1 = new RelativeLayout(activity0);
        relativeLayout1.setId(CLS258.MTH3807());
        this.FLD1287.setTextSize(2, 17.0f);
        int v = CLS258.MTH3807();
        this.FLD1287.setId(v);
        CLS258.MTH3751(this.FLD1287, this.FLD1296);
        if(this.FLD1292) {
            textView0 = this.FLD1287;
            v1 = CLS258.MTH3770(3);
            v2 = CLS258.MTH3770(1);
        }
        else {
            textView0 = this.FLD1287;
            v1 = CLS258.MTH3770(10);
            v2 = CLS258.MTH3770(5);
        }
        textView0.setPadding(0, v1, 0, v2);
        RelativeLayout.LayoutParams relativeLayout$LayoutParams0 = new RelativeLayout.LayoutParams(-2, -2);
        relativeLayout$LayoutParams0.addRule(10, relativeLayout1.getId());
        relativeLayout$LayoutParams0.addRule(9, relativeLayout1.getId());
        relativeLayout1.addView(this.FLD1287, relativeLayout$LayoutParams0);
        this.FLD1284.setTextSize(2, 14.0f);
        int v3 = CLS258.MTH3807();
        this.FLD1284.setId(v3);
        CLS258.MTH3751(this.FLD1284, this.FLD1294);
        RelativeLayout.LayoutParams relativeLayout$LayoutParams1 = new RelativeLayout.LayoutParams(-2, -2);
        relativeLayout$LayoutParams1.addRule(9, relativeLayout1.getId());
        relativeLayout$LayoutParams1.addRule(3, this.FLD1287.getId());
        int v4 = CLS258.MTH3770(5);
        this.FLD1284.setPadding(v4, 0, 0, 0);
        relativeLayout1.addView(this.FLD1284, relativeLayout$LayoutParams1);
        if(TextUtils.isEmpty(this.FLD1294)) {
            this.FLD1284.setVisibility(8);
        }
        this.FLD1293.setTextSize(2, 16.0f);
        int v5 = CLS258.MTH3807();
        this.FLD1293.setId(v5);
        CLS258.MTH3751(this.FLD1293, this.FLD1295);
        if(this.FLD1292) {
            textView1 = this.FLD1293;
            v6 = CLS258.MTH3770(3);
            v7 = CLS258.MTH3770(2);
        }
        else {
            textView1 = this.FLD1293;
            v6 = CLS258.MTH3770(10);
            v7 = CLS258.MTH3770(5);
        }
        textView1.setPadding(0, v6, 0, v7);
        RelativeLayout.LayoutParams relativeLayout$LayoutParams2 = new RelativeLayout.LayoutParams(-2, -2);
        relativeLayout$LayoutParams2.addRule(10, relativeLayout1.getId());
        relativeLayout$LayoutParams2.addRule(11, relativeLayout1.getId());
        relativeLayout1.addView(this.FLD1293, relativeLayout$LayoutParams2);
        if(TextUtils.isEmpty(this.FLD1296) && TextUtils.isEmpty(this.FLD1295)) {
            this.FLD1287.setVisibility(8);
            this.FLD1293.setVisibility(8);
        }
        RelativeLayout.LayoutParams relativeLayout$LayoutParams3 = new RelativeLayout.LayoutParams(-2, -2);
        relativeLayout$LayoutParams3.addRule(9, relativeLayout0.getId());
        relativeLayout$LayoutParams3.addRule(10, relativeLayout0.getId());
        relativeLayout1.setPadding(0, 0, CLS258.MTH3770(15), 0);
        int v8 = CLS258.MTH3807();
        this.FLD1297.setId(v8);
        int v9 = CLS172.MTH3037();
        this.FLD1297.setColor(v9);
        RelativeLayout.LayoutParams relativeLayout$LayoutParams4 = new RelativeLayout.LayoutParams(CLS258.MTH3770(18), CLS258.MTH3770(18));
        relativeLayout$LayoutParams4.addRule(11, relativeLayout0.getId());
        relativeLayout$LayoutParams4.addRule(13, relativeLayout0.getId());
        relativeLayout$LayoutParams4.setMargins(0, 0, CLS258.MTH3770(10), 0);
        if(this.FLD1291) {
            relativeLayout$LayoutParams3.setMargins(0, 0, CLS258.MTH3770(20), 0);
            relativeLayout0.addView(relativeLayout1, relativeLayout$LayoutParams3);
            relativeLayout0.addView(this.FLD1297, relativeLayout$LayoutParams4);
        }
        else {
            relativeLayout0.addView(relativeLayout1, relativeLayout$LayoutParams3);
        }
        linearLayout0.addView(relativeLayout0, new LinearLayout.LayoutParams(-1, -1));
        View.OnClickListener view$OnClickListener0 = this.FLD1290;
        if(view$OnClickListener0 == null) {
            linearLayout0.setBackgroundColor(CLS172.MTH3039());
        }
        else {
            linearLayout0.setOnClickListener(view$OnClickListener0);
            CLS258.MTH3785(linearLayout0, CLS264.MTH4104(CLS172.MTH3039()));
        }
        linearLayout0.setVisibility(this.FLD1285);
        return linearLayout0;
    }

    public void MTH4279(boolean z) {
        this.FLD1291 = z;
    }

    public void MTH4280(View.OnClickListener view$OnClickListener0) {
        this.FLD1290 = view$OnClickListener0;
        View view0 = this.FLD1288;
        if(view0 != null) {
            view0.setOnClickListener(view$OnClickListener0);
            CLS258.MTH3785(this.FLD1288, CLS264.MTH4104(CLS172.MTH3039()));
        }
    }

    public void MTH4281(String s) {
        this.FLD1294 = s;
        CLS258.MTH3751(this.FLD1284, s);
    }

    public void MTH4282() {
        if(this.FLD1291) {
            this.FLD1297.setRotation(-90.0f);
        }
    }
}

