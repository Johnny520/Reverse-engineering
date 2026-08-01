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
import t.ᵔʾ.CLS133;
import t.ⁱʾ.CLS145;

public final class CLS337 implements CLS145 {
    public boolean FLD1165;
    public String FLD1166;
    public View.OnClickListener FLD1167;
    public final TextView FLD1168;
    public LinearLayout FLD1169;
    public final WeakReference FLD1170;
    public View FLD1171;
    public final TextView FLD1172;
    public int FLD1173;
    public final TextView FLD1174;
    public final CLS163 FLD1175;
    public String FLD1176;
    public String FLD1177;

    // 此方法包含解密的字符串
    public CLS337(Activity activity0) {
        this.FLD1165 = true;
        this.FLD1173 = 0;
        this.FLD1170 = new WeakReference(activity0);
        TextView textView0 = new TextView(activity0);
        this.FLD1168 = textView0;
        textView0.setTextColor(CLS46.MTH1452());
        TextView textView1 = new TextView(activity0);
        this.FLD1172 = textView1;
        textView1.setTextColor(CLS46.MTH1444());
        TextView textView2 = new TextView(activity0);
        this.FLD1174 = textView2;
        textView2.setTextColor(CLS46.MTH1457());
        this.FLD1175 = new CLS163(activity0);
        if(CLS133.MTH2103().MTH2131("preftext_disable_arrow", false)) {
            this.FLD1165 = false;
        }
    }

    @Override  // t.ⁱʾ.CLS145
    public final String getText() {
        return this.FLD1168 == null ? this.FLD1177 : this.FLD1168.getText().toString();
    }

    public final void MTH2381(String s) {
        this.FLD1166 = s;
        CLS43.MTH1429(this.FLD1172, s);
    }

    // 此方法包含解密的字符串
    @Override  // t.ⁱʾ.CLS145
    public final void MTH2172(String s) {
        String s1 = "";
        String s2 = "";
        String s3 = "";
        String s4 = "";
        new String("");
        if(!TextUtils.isEmpty(s)) {
            if(s.contains("[[") && s.contains("]]")) {
                int v = s.indexOf("[[");
                int v1 = s.indexOf("]]");
                s1 = s.substring(v + 2, v1);
                s = CLS15.MTH1076(s, 0, v, new StringBuilder(), v1, 2);
            }
            String s5 = s;
            String s6 = "";
            if(s5.contains("{") && s5.contains("}")) {
                int v2 = s5.indexOf("{");
                int v3 = s5.indexOf("}");
                s6 = s5.substring(v2 + 1, v3);
                s5 = CLS15.MTH1076(s5, 0, v2, new StringBuilder(), v3, 1);
            }
            String s7 = "";
            if(s5.contains("((") && s5.contains("))")) {
                int v4 = s5.indexOf("((");
                int v5 = s5.indexOf("))");
                s7 = s5.substring(v4 + 2, v5);
                s5 = CLS15.MTH1076(s5, 0, v4, new StringBuilder(), v5, 2);
            }
            s7.trim();
            s3 = s1.trim();
            s2 = s5.trim();
            s4 = s6.trim();
        }
        if(!TextUtils.isEmpty(s3)) {
            this.MTH2388(s3);
        }
        if(!TextUtils.isEmpty(s4)) {
            this.MTH2381(s4);
        }
        this.FLD1177 = s2;
        CLS43.MTH1429(this.FLD1168, s2);
    }

    @Override  // t.ⁱʾ.CLS145
    public final View MTH2173() {
        if(this.FLD1169 == null) {
            Activity activity0 = (Activity)this.FLD1170.get();
            LinearLayout linearLayout0 = new LinearLayout(activity0);
            RelativeLayout relativeLayout0 = new RelativeLayout(activity0);
            relativeLayout0.setId(CLS43.MTH1438());
            RelativeLayout relativeLayout1 = new RelativeLayout(activity0);
            relativeLayout1.setId(CLS43.MTH1438());
            TextView textView0 = this.FLD1168;
            textView0.setTextSize(2, 17.0f);
            textView0.setId(CLS43.MTH1438());
            CLS43.MTH1429(textView0, this.FLD1177);
            textView0.setPadding(0, CLS43.MTH1439(10), 0, CLS43.MTH1439(5));
            RelativeLayout.LayoutParams relativeLayout$LayoutParams0 = new RelativeLayout.LayoutParams(-2, -2);
            relativeLayout$LayoutParams0.addRule(10, relativeLayout1.getId());
            relativeLayout$LayoutParams0.addRule(9, relativeLayout1.getId());
            relativeLayout1.addView(textView0, relativeLayout$LayoutParams0);
            TextView textView1 = this.FLD1174;
            textView1.setTextSize(2, 14.0f);
            textView1.setId(CLS43.MTH1438());
            CLS43.MTH1429(textView1, this.FLD1176);
            RelativeLayout.LayoutParams relativeLayout$LayoutParams1 = new RelativeLayout.LayoutParams(-2, -2);
            relativeLayout$LayoutParams1.addRule(9, relativeLayout1.getId());
            relativeLayout$LayoutParams1.addRule(3, textView0.getId());
            textView1.setPadding(CLS43.MTH1439(5), 0, 0, 0);
            relativeLayout1.addView(textView1, relativeLayout$LayoutParams1);
            if(TextUtils.isEmpty(this.FLD1176)) {
                textView1.setVisibility(8);
            }
            TextView textView2 = this.FLD1172;
            textView2.setTextSize(2, 16.0f);
            textView2.setId(CLS43.MTH1438());
            CLS43.MTH1429(textView2, this.FLD1166);
            textView2.setPadding(0, CLS43.MTH1439(10), 0, CLS43.MTH1439(5));
            RelativeLayout.LayoutParams relativeLayout$LayoutParams2 = new RelativeLayout.LayoutParams(-2, -2);
            relativeLayout$LayoutParams2.addRule(10, relativeLayout1.getId());
            relativeLayout$LayoutParams2.addRule(11, relativeLayout1.getId());
            relativeLayout1.addView(textView2, relativeLayout$LayoutParams2);
            if(TextUtils.isEmpty(this.FLD1177) && TextUtils.isEmpty(this.FLD1166)) {
                textView0.setVisibility(8);
                textView2.setVisibility(8);
            }
            RelativeLayout.LayoutParams relativeLayout$LayoutParams3 = new RelativeLayout.LayoutParams(-2, -2);
            relativeLayout$LayoutParams3.addRule(9, relativeLayout0.getId());
            relativeLayout$LayoutParams3.addRule(10, relativeLayout0.getId());
            relativeLayout1.setPadding(0, 0, CLS43.MTH1439(15), 0);
            int v = CLS43.MTH1438();
            CLS163 ˆٴ0 = this.FLD1175;
            ˆٴ0.setId(v);
            ˆٴ0.setColor(CLS46.MTH1444());
            RelativeLayout.LayoutParams relativeLayout$LayoutParams4 = new RelativeLayout.LayoutParams(CLS43.MTH1439(18), CLS43.MTH1439(18));
            relativeLayout$LayoutParams4.addRule(11, relativeLayout0.getId());
            relativeLayout$LayoutParams4.addRule(13, relativeLayout0.getId());
            relativeLayout$LayoutParams4.setMargins(0, 0, CLS43.MTH1439(10), 0);
            if(this.FLD1165) {
                relativeLayout$LayoutParams3.setMargins(0, 0, CLS43.MTH1439(20), 0);
                relativeLayout0.addView(relativeLayout1, relativeLayout$LayoutParams3);
                relativeLayout0.addView(ˆٴ0, relativeLayout$LayoutParams4);
            }
            else {
                relativeLayout0.addView(relativeLayout1, relativeLayout$LayoutParams3);
            }
            linearLayout0.addView(relativeLayout0, new LinearLayout.LayoutParams(-1, -1));
            View.OnClickListener view$OnClickListener0 = this.FLD1167;
            if(view$OnClickListener0 == null) {
                linearLayout0.setBackgroundColor(CLS46.MTH1446());
            }
            else {
                linearLayout0.setOnClickListener(view$OnClickListener0);
                CLS43.MTH1437(linearLayout0, CLS41.MTH1400(CLS46.MTH1446()));
            }
            linearLayout0.setVisibility(this.FLD1173);
            this.FLD1169 = linearLayout0;
        }
        return this.FLD1169;
    }

    @Override  // t.ⁱʾ.CLS145
    public final void MTH2174(View view0) {
        this.FLD1171 = view0;
        view0.setVisibility(this.FLD1173);
    }

    @Override  // t.ⁱʾ.CLS145
    public final void MTH2175(int v) {
        this.FLD1173 = v;
        LinearLayout linearLayout0 = this.FLD1169;
        if(linearLayout0 != null) {
            linearLayout0.setVisibility(v);
        }
        View view0 = this.FLD1171;
        if(view0 != null) {
            view0.setVisibility(v);
        }
    }

    @Override  // t.ⁱʾ.CLS145
    public final void MTH2176() {
        if(this.FLD1167 != null) {
            CLS43.MTH1437(this.FLD1169, CLS41.MTH1400(CLS46.MTH1445()));
            return;
        }
        this.FLD1169.setBackgroundColor(CLS46.MTH1445());
    }

    public final void MTH2387(View.OnClickListener view$OnClickListener0) {
        this.FLD1167 = view$OnClickListener0;
        LinearLayout linearLayout0 = this.FLD1169;
        if(linearLayout0 != null) {
            linearLayout0.setOnClickListener(view$OnClickListener0);
            CLS43.MTH1437(this.FLD1169, CLS41.MTH1400(CLS46.MTH1446()));
        }
    }

    public final void MTH2388(String s) {
        this.FLD1176 = s;
        CLS43.MTH1429(this.FLD1174, s);
    }
}

