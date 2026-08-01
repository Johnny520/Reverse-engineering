// Decompiled by JEB v5.42.0.202606242140

package t.ﾞᐧ;

import android.app.Activity;
import android.text.TextUtils;
import android.view.View.OnClickListener;
import android.view.View;
import android.widget.LinearLayout.LayoutParams;
import android.widget.LinearLayout;
import android.widget.RelativeLayout.LayoutParams;
import android.widget.RelativeLayout;
import android.widget.TextView;
import java.lang.ref.WeakReference;
import t.ʾᵢ.CLS15;
import t.ˆʿ.CLS41;
import t.ˆʿ.CLS43;
import t.ˆʿ.CLS46;
import t.ⁱʾ.CLS145;

public final class CLS338 implements CLS145 {
    public TextView FLD1183;
    public View FLD1184;
    public final WeakReference FLD1185;
    public View FLD1186;
    public String FLD1187;
    public String FLD1188;
    public View.OnClickListener FLD1189;
    public TextView FLD1190;
    public int FLD1191;

    public CLS338(Activity activity0) {
        this.FLD1191 = 0;
        this.FLD1185 = new WeakReference(activity0);
    }

    @Override  // t.ⁱʾ.CLS145
    public final String getText() {
        return this.FLD1190 == null ? this.FLD1188 : this.FLD1190.getText().toString();
    }

    // 此方法包含解密的字符串
    @Override  // t.ⁱʾ.CLS145
    public final void MTH2172(String s) {
        String s1 = "";
        String s2 = "";
        String s3 = "";
        new String("");
        new String("");
        if(!TextUtils.isEmpty(s)) {
            if(s.contains("[[") && s.contains("]]")) {
                int v = s.indexOf("[[");
                int v1 = s.indexOf("]]");
                s1 = s.substring(v + 2, v1);
                s = CLS15.MTH1076(s, 0, v, new StringBuilder(), v1, 2);
            }
            String s4 = s;
            String s5 = "";
            if(s4.contains("{") && s4.contains("}")) {
                int v2 = s4.indexOf("{");
                int v3 = s4.indexOf("}");
                s5 = s4.substring(v2 + 1, v3);
                s4 = CLS15.MTH1076(s4, 0, v2, new StringBuilder(), v3, 1);
            }
            String s6 = "";
            if(s4.contains("((") && s4.contains("))")) {
                int v4 = s4.indexOf("((");
                int v5 = s4.indexOf("))");
                s6 = s4.substring(v4 + 2, v5);
                s4 = CLS15.MTH1076(s4, 0, v4, new StringBuilder(), v5, 2);
            }
            s5.trim();
            s6.trim();
            s3 = s1.trim();
            s2 = s4.trim();
        }
        if(!TextUtils.isEmpty(s3)) {
            this.FLD1187 = s3;
            CLS43.MTH1429(this.FLD1183, s3);
        }
        this.FLD1188 = s2;
        CLS43.MTH1429(this.FLD1190, s2);
    }

    @Override  // t.ⁱʾ.CLS145
    public final View MTH2173() {
        if(this.FLD1186 == null) {
            this.FLD1186 = this.MTH2401();
        }
        return this.FLD1186;
    }

    @Override  // t.ⁱʾ.CLS145
    public final void MTH2174(View view0) {
        this.FLD1184 = view0;
        view0.setVisibility(this.FLD1191);
    }

    @Override  // t.ⁱʾ.CLS145
    public final void MTH2175(int v) {
        this.FLD1191 = v;
        View view0 = this.FLD1186;
        if(view0 != null) {
            view0.setVisibility(v);
        }
        View view1 = this.FLD1184;
        if(view1 != null) {
            view1.setVisibility(v);
        }
    }

    @Override  // t.ⁱʾ.CLS145
    public final void MTH2176() {
        if(this.FLD1189 != null) {
            CLS43.MTH1437(this.FLD1186, CLS41.MTH1400(CLS46.MTH1445()));
            return;
        }
        this.FLD1186.setBackgroundColor(CLS46.MTH1445());
    }

    public final void MTH2400(View.OnClickListener view$OnClickListener0) {
        this.FLD1189 = view$OnClickListener0;
        View view0 = this.FLD1186;
        if(view0 != null) {
            view0.setOnClickListener(view$OnClickListener0);
            CLS43.MTH1437(this.FLD1186, CLS41.MTH1400(CLS46.MTH1446()));
        }
    }

    public final View MTH2401() {
        Activity activity0 = (Activity)this.FLD1185.get();
        LinearLayout linearLayout0 = new LinearLayout(activity0);
        linearLayout0.setGravity(0x30);
        linearLayout0.setOrientation(1);
        RelativeLayout relativeLayout0 = new RelativeLayout(activity0);
        relativeLayout0.setId(CLS43.MTH1438());
        RelativeLayout relativeLayout1 = new RelativeLayout(activity0);
        relativeLayout1.setId(CLS43.MTH1438());
        TextView textView0 = new TextView(activity0);
        this.FLD1190 = textView0;
        textView0.setTextSize(2, 17.0f);
        this.FLD1190.setId(CLS43.MTH1438());
        CLS43.MTH1429(this.FLD1190, this.FLD1188);
        this.FLD1190.setTextColor(CLS46.MTH1452());
        this.FLD1190.setGravity(1);
        this.FLD1190.setPadding(0, CLS43.MTH1439(10), 0, CLS43.MTH1439(5));
        RelativeLayout.LayoutParams relativeLayout$LayoutParams0 = new RelativeLayout.LayoutParams(-1, -2);
        relativeLayout$LayoutParams0.addRule(14, relativeLayout1.getId());
        relativeLayout1.addView(this.FLD1190, relativeLayout$LayoutParams0);
        TextView textView1 = new TextView(activity0);
        this.FLD1183 = textView1;
        textView1.setTextSize(2, 14.0f);
        this.FLD1183.setId(CLS43.MTH1438());
        CLS43.MTH1429(this.FLD1183, this.FLD1187);
        this.FLD1183.setGravity(1);
        this.FLD1183.setTextColor(CLS46.MTH1457());
        RelativeLayout.LayoutParams relativeLayout$LayoutParams1 = new RelativeLayout.LayoutParams(-1, -2);
        relativeLayout$LayoutParams1.addRule(14, relativeLayout1.getId());
        relativeLayout$LayoutParams1.addRule(3, this.FLD1190.getId());
        relativeLayout1.addView(this.FLD1183, relativeLayout$LayoutParams1);
        if(TextUtils.isEmpty(this.FLD1187)) {
            this.FLD1183.setVisibility(8);
        }
        RelativeLayout.LayoutParams relativeLayout$LayoutParams2 = new RelativeLayout.LayoutParams(-1, -2);
        relativeLayout$LayoutParams2.addRule(13, relativeLayout0.getId());
        relativeLayout0.addView(relativeLayout1, relativeLayout$LayoutParams2);
        linearLayout0.addView(relativeLayout0, new LinearLayout.LayoutParams(-1, -2));
        View.OnClickListener view$OnClickListener0 = this.FLD1189;
        if(view$OnClickListener0 == null) {
            linearLayout0.setBackgroundColor(CLS46.MTH1446());
        }
        else {
            linearLayout0.setOnClickListener(view$OnClickListener0);
            CLS43.MTH1437(linearLayout0, CLS41.MTH1400(CLS46.MTH1446()));
        }
        linearLayout0.setVisibility(this.FLD1191);
        linearLayout0.setActivated(true);
        return linearLayout0;
    }
}

