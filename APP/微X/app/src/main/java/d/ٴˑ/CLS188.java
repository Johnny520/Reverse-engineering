// Decompiled by JEB v5.42.0.202606242140

package d.ٴˑ;

import android.app.Activity;
import android.text.TextUtils;
import android.view.View.OnClickListener;
import android.view.View;
import android.widget.LinearLayout.LayoutParams;
import android.widget.LinearLayout;
import android.widget.RelativeLayout.LayoutParams;
import android.widget.RelativeLayout;
import android.widget.TextView;
import d.ˑʽ.CLS43;
import d.ˑʽ.CLS45;
import d.ˑʽ.CLS5;
import d.יʻ.CLS69;
import d.יʻ.CLS71;
import d.ⁱٴ.CLS125;
import java.lang.ref.WeakReference;

public final class CLS188 implements CLS125 {
    public View FLD522;
    public boolean FLD523;
    public LinearLayout FLD524;
    public View.OnClickListener FLD525;
    public int FLD526;
    public String FLD527;
    public final TextView FLD528;
    public final WeakReference FLD529;
    public String FLD530;
    public boolean FLD531;
    public final TextView FLD532;
    public final CLS94 FLD533;
    public final TextView FLD534;
    public String FLD535;

    public CLS188(Activity activity0) {
        this.FLD531 = true;
        this.FLD526 = 0;
        this.FLD523 = false;
        this.FLD529 = new WeakReference(activity0);
        TextView textView0 = new TextView(activity0);
        this.FLD532 = textView0;
        textView0.setTextColor(CLS43.MTH646());
        TextView textView1 = new TextView(activity0);
        this.FLD534 = textView1;
        textView1.setTextColor(CLS43.MTH641());
        TextView textView2 = new TextView(activity0);
        this.FLD528 = textView2;
        textView2.setTextColor(CLS43.MTH640());
        this.FLD533 = new CLS94(activity0);
        if(CLS69.MTH801().MTH748("preftext_disable_arrow", false)) {
            this.FLD531 = false;
        }
    }

    @Override  // d.ⁱٴ.CLS125
    public final String getText() {
        return this.FLD532 == null ? this.FLD535 : this.FLD532.getText().toString();
    }

    @Override  // d.ⁱٴ.CLS125
    public final void MTH1177(int v) {
        this.FLD526 = v;
        LinearLayout linearLayout0 = this.FLD524;
        if(linearLayout0 != null) {
            linearLayout0.setVisibility(v);
        }
        View view0 = this.FLD522;
        if(view0 != null) {
            view0.setVisibility(v);
        }
    }

    @Override  // d.ⁱٴ.CLS125
    public final void MTH1178() {
        if(this.FLD525 != null) {
            CLS45.MTH657(this.FLD524, CLS5.MTH400(CLS43.MTH645()));
            return;
        }
        this.FLD524.setBackgroundColor(CLS43.MTH645());
    }

    public final void MTH1000(View.OnClickListener view$OnClickListener0) {
        this.FLD525 = view$OnClickListener0;
        LinearLayout linearLayout0 = this.FLD524;
        if(linearLayout0 != null) {
            linearLayout0.setOnClickListener(view$OnClickListener0);
            CLS45.MTH657(this.FLD524, CLS5.MTH400(CLS43.MTH644()));
        }
    }

    @Override  // d.ⁱٴ.CLS125
    public final void MTH1179(String s) {
        this.FLD530 = s;
        CLS45.MTH658(this.FLD528, s);
    }

    @Override  // d.ⁱٴ.CLS125
    public final void MTH1180(View view0) {
        this.FLD522 = view0;
        view0.setVisibility(this.FLD526);
    }

    @Override  // d.ⁱٴ.CLS125
    public final void MTH1181(String s) {
        String s6;
        String s5;
        String s4;
        String s3;
        String s2;
        String s1 = "";
        if(TextUtils.isEmpty(s)) {
            s2 = "";
            s3 = "";
        }
        else {
            if(!s.contains("[[") || !s.contains("]]")) {
                s5 = s;
                s4 = "";
            }
            else {
                int v = s.indexOf("[[");
                int v1 = s.lastIndexOf("]]");
                s4 = s.substring(v + 2, v1);
                s5 = CLS71.MTH825(s, 0, v, new StringBuilder(), v1, 2);
            }
            if(!s5.contains("{") || !s5.contains("}")) {
                s6 = "";
            }
            else {
                int v2 = s5.indexOf("{");
                int v3 = s5.lastIndexOf("}");
                s6 = s5.substring(v2 + 1, v3);
                s5 = CLS71.MTH825(s5, 0, v2, new StringBuilder(), v3, 1);
            }
            if(s5.contains("((") && s5.contains("))")) {
                int v4 = s5.indexOf("((");
                int v5 = s5.lastIndexOf("))");
                s1 = s5.substring(v4 + 2, v5);
                s5 = CLS71.MTH825(s5, 0, v4, new StringBuilder(), v5, 2);
            }
            s3 = s5.trim();
            s2 = s6.trim();
            s1.getClass();
            s1 = s4.trim();
        }
        if(!TextUtils.isEmpty(s1)) {
            this.MTH1179(s1);
        }
        if(!TextUtils.isEmpty(s2)) {
            this.FLD527 = s2;
            CLS45.MTH658(this.FLD534, s2);
        }
        this.FLD535 = s3;
        CLS45.MTH658(this.FLD532, s3);
    }

    @Override  // d.ⁱٴ.CLS125
    public final View MTH1182() {
        int v1;
        int v;
        if(this.FLD524 == null) {
            Activity activity0 = (Activity)this.FLD529.get();
            LinearLayout linearLayout0 = new LinearLayout(activity0);
            RelativeLayout relativeLayout0 = new RelativeLayout(activity0);
            relativeLayout0.setId(CLS45.MTH668());
            RelativeLayout relativeLayout1 = new RelativeLayout(activity0);
            relativeLayout1.setId(CLS45.MTH668());
            TextView textView0 = this.FLD532;
            textView0.setTextSize(2, 17.0f);
            textView0.setId(CLS45.MTH668());
            CLS45.MTH658(textView0, this.FLD535);
            if(this.FLD523) {
                v = CLS45.MTH662(3);
                v1 = CLS45.MTH662(1);
            }
            else {
                v = CLS45.MTH662(10);
                v1 = CLS45.MTH662(5);
            }
            textView0.setPadding(0, v, 0, v1);
            RelativeLayout.LayoutParams relativeLayout$LayoutParams0 = new RelativeLayout.LayoutParams(-2, -2);
            relativeLayout$LayoutParams0.addRule(10, relativeLayout1.getId());
            relativeLayout$LayoutParams0.addRule(9, relativeLayout1.getId());
            relativeLayout1.addView(textView0, relativeLayout$LayoutParams0);
            TextView textView1 = this.FLD528;
            textView1.setTextSize(2, 14.0f);
            textView1.setId(CLS45.MTH668());
            CLS45.MTH658(textView1, this.FLD530);
            RelativeLayout.LayoutParams relativeLayout$LayoutParams1 = new RelativeLayout.LayoutParams(-2, -2);
            relativeLayout$LayoutParams1.addRule(9, relativeLayout1.getId());
            relativeLayout$LayoutParams1.addRule(3, textView0.getId());
            textView1.setPadding(CLS45.MTH662(5), 0, 0, 0);
            relativeLayout1.addView(textView1, relativeLayout$LayoutParams1);
            if(TextUtils.isEmpty(this.FLD530)) {
                textView1.setVisibility(8);
            }
            TextView textView2 = this.FLD534;
            textView2.setTextSize(2, 16.0f);
            textView2.setId(CLS45.MTH668());
            CLS45.MTH658(textView2, this.FLD527);
            if(this.FLD523) {
                textView2.setPadding(0, CLS45.MTH662(3), 0, CLS45.MTH662(2));
            }
            else {
                textView2.setPadding(0, CLS45.MTH662(10), 0, CLS45.MTH662(5));
            }
            RelativeLayout.LayoutParams relativeLayout$LayoutParams2 = new RelativeLayout.LayoutParams(-2, -2);
            relativeLayout$LayoutParams2.addRule(10, relativeLayout1.getId());
            relativeLayout$LayoutParams2.addRule(11, relativeLayout1.getId());
            relativeLayout1.addView(textView2, relativeLayout$LayoutParams2);
            if(TextUtils.isEmpty(this.FLD535) && TextUtils.isEmpty(this.FLD527)) {
                textView0.setVisibility(8);
                textView2.setVisibility(8);
            }
            RelativeLayout.LayoutParams relativeLayout$LayoutParams3 = new RelativeLayout.LayoutParams(-2, -2);
            relativeLayout$LayoutParams3.addRule(9, relativeLayout0.getId());
            relativeLayout$LayoutParams3.addRule(10, relativeLayout0.getId());
            relativeLayout1.setPadding(0, 0, CLS45.MTH662(15), 0);
            int v2 = CLS45.MTH668();
            CLS94 ᐧי0 = this.FLD533;
            ᐧי0.setId(v2);
            ᐧי0.setColor(CLS43.MTH641());
            RelativeLayout.LayoutParams relativeLayout$LayoutParams4 = new RelativeLayout.LayoutParams(CLS45.MTH662(18), CLS45.MTH662(18));
            relativeLayout$LayoutParams4.addRule(11, relativeLayout0.getId());
            relativeLayout$LayoutParams4.addRule(13, relativeLayout0.getId());
            relativeLayout$LayoutParams4.setMargins(0, 0, CLS45.MTH662(10), 0);
            if(this.FLD531) {
                relativeLayout$LayoutParams3.setMargins(0, 0, CLS45.MTH662(20), 0);
                relativeLayout0.addView(relativeLayout1, relativeLayout$LayoutParams3);
                relativeLayout0.addView(ᐧי0, relativeLayout$LayoutParams4);
            }
            else {
                relativeLayout0.addView(relativeLayout1, relativeLayout$LayoutParams3);
            }
            linearLayout0.addView(relativeLayout0, new LinearLayout.LayoutParams(-1, -1));
            View.OnClickListener view$OnClickListener0 = this.FLD525;
            if(view$OnClickListener0 == null) {
                linearLayout0.setBackgroundColor(CLS43.MTH644());
            }
            else {
                linearLayout0.setOnClickListener(view$OnClickListener0);
                CLS45.MTH657(linearLayout0, CLS5.MTH400(CLS43.MTH644()));
            }
            linearLayout0.setVisibility(this.FLD526);
            this.FLD524 = linearLayout0;
        }
        return this.FLD524;
    }
}

