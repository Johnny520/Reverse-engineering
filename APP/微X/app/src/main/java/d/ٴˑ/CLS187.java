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
import d.יʻ.CLS71;
import d.ⁱٴ.CLS125;
import java.lang.ref.WeakReference;

public final class CLS187 implements CLS125 {
    public View FLD513;
    public TextView FLD514;
    public String FLD515;
    public LinearLayout FLD516;
    public TextView FLD517;
    public final WeakReference FLD518;
    public View.OnClickListener FLD519;
    public String FLD520;
    public int FLD521;

    public CLS187(Activity activity0) {
        this.FLD521 = 0;
        this.FLD518 = new WeakReference(activity0);
    }

    @Override  // d.ⁱٴ.CLS125
    public final String getText() {
        return this.FLD517 == null ? this.FLD515 : this.FLD517.getText().toString();
    }

    @Override  // d.ⁱٴ.CLS125
    public final void MTH1177(int v) {
        this.FLD521 = v;
        LinearLayout linearLayout0 = this.FLD516;
        if(linearLayout0 != null) {
            linearLayout0.setVisibility(v);
        }
        View view0 = this.FLD513;
        if(view0 != null) {
            view0.setVisibility(v);
        }
    }

    @Override  // d.ⁱٴ.CLS125
    public final void MTH1178() {
        if(this.FLD519 != null) {
            CLS45.MTH657(this.FLD516, CLS5.MTH400(CLS43.MTH645()));
            return;
        }
        this.FLD516.setBackgroundColor(CLS43.MTH645());
    }

    public final void MTH991(View.OnClickListener view$OnClickListener0) {
        this.FLD519 = view$OnClickListener0;
        LinearLayout linearLayout0 = this.FLD516;
        if(linearLayout0 != null) {
            linearLayout0.setOnClickListener(view$OnClickListener0);
            CLS45.MTH657(this.FLD516, CLS5.MTH400(CLS43.MTH644()));
        }
    }

    @Override  // d.ⁱٴ.CLS125
    public final void MTH1179(String s) {
        this.FLD520 = s;
        CLS45.MTH658(this.FLD514, s);
    }

    @Override  // d.ⁱٴ.CLS125
    public final void MTH1180(View view0) {
        this.FLD513 = view0;
        view0.setVisibility(this.FLD521);
    }

    @Override  // d.ⁱٴ.CLS125
    public final void MTH1181(String s) {
        String s5;
        String s4;
        String s3;
        String s2;
        String s1 = "";
        if(TextUtils.isEmpty(s)) {
            s2 = "";
        }
        else {
            if(!s.contains("[[") || !s.contains("]]")) {
                s4 = s;
                s3 = "";
            }
            else {
                int v = s.indexOf("[[");
                int v1 = s.lastIndexOf("]]");
                s3 = s.substring(v + 2, v1);
                s4 = CLS71.MTH825(s, 0, v, new StringBuilder(), v1, 2);
            }
            if(!s4.contains("{") || !s4.contains("}")) {
                s5 = "";
            }
            else {
                int v2 = s4.indexOf("{");
                int v3 = s4.lastIndexOf("}");
                s5 = s4.substring(v2 + 1, v3);
                s4 = CLS71.MTH825(s4, 0, v2, new StringBuilder(), v3, 1);
            }
            if(s4.contains("((") && s4.contains("))")) {
                int v4 = s4.indexOf("((");
                int v5 = s4.lastIndexOf("))");
                s1 = s4.substring(v4 + 2, v5);
                s4 = CLS71.MTH825(s4, 0, v4, new StringBuilder(), v5, 2);
            }
            s2 = s4.trim();
            s5.trim();
            s1.trim();
            s1 = s3.trim();
        }
        if(!TextUtils.isEmpty(s1)) {
            this.MTH1179(s1);
        }
        this.FLD515 = s2;
        CLS45.MTH658(this.FLD517, s2);
    }

    @Override  // d.ⁱٴ.CLS125
    public final View MTH1182() {
        if(this.FLD516 == null) {
            Activity activity0 = (Activity)this.FLD518.get();
            LinearLayout linearLayout0 = new LinearLayout(activity0);
            linearLayout0.setGravity(0x30);
            linearLayout0.setOrientation(1);
            RelativeLayout relativeLayout0 = new RelativeLayout(activity0);
            relativeLayout0.setId(CLS45.MTH668());
            RelativeLayout relativeLayout1 = new RelativeLayout(activity0);
            relativeLayout1.setId(CLS45.MTH668());
            TextView textView0 = new TextView(activity0);
            this.FLD517 = textView0;
            textView0.setTextSize(2, 17.0f);
            this.FLD517.setId(CLS45.MTH668());
            CLS45.MTH658(this.FLD517, this.FLD515);
            this.FLD517.setTextColor(CLS43.MTH646());
            this.FLD517.setGravity(1);
            this.FLD517.setPadding(0, CLS45.MTH662(10), 0, CLS45.MTH662(5));
            RelativeLayout.LayoutParams relativeLayout$LayoutParams0 = new RelativeLayout.LayoutParams(-1, -2);
            relativeLayout$LayoutParams0.addRule(14, relativeLayout1.getId());
            relativeLayout1.addView(this.FLD517, relativeLayout$LayoutParams0);
            TextView textView1 = new TextView(activity0);
            this.FLD514 = textView1;
            textView1.setTextSize(2, 14.0f);
            this.FLD514.setId(CLS45.MTH668());
            CLS45.MTH658(this.FLD514, this.FLD520);
            this.FLD514.setGravity(1);
            this.FLD514.setTextColor(CLS43.MTH640());
            RelativeLayout.LayoutParams relativeLayout$LayoutParams1 = new RelativeLayout.LayoutParams(-1, -2);
            relativeLayout$LayoutParams1.addRule(14, relativeLayout1.getId());
            relativeLayout$LayoutParams1.addRule(3, this.FLD517.getId());
            relativeLayout1.addView(this.FLD514, relativeLayout$LayoutParams1);
            if(TextUtils.isEmpty(this.FLD520)) {
                this.FLD514.setVisibility(8);
            }
            RelativeLayout.LayoutParams relativeLayout$LayoutParams2 = new RelativeLayout.LayoutParams(-1, -2);
            relativeLayout$LayoutParams2.addRule(13, relativeLayout0.getId());
            relativeLayout0.addView(relativeLayout1, relativeLayout$LayoutParams2);
            linearLayout0.addView(relativeLayout0, new LinearLayout.LayoutParams(-1, -2));
            View.OnClickListener view$OnClickListener0 = this.FLD519;
            if(view$OnClickListener0 == null) {
                linearLayout0.setBackgroundColor(CLS43.MTH644());
            }
            else {
                linearLayout0.setOnClickListener(view$OnClickListener0);
                CLS45.MTH657(linearLayout0, CLS5.MTH400(CLS43.MTH644()));
            }
            linearLayout0.setVisibility(this.FLD521);
            linearLayout0.setActivated(true);
            this.FLD516 = linearLayout0;
        }
        return this.FLD516;
    }
}

