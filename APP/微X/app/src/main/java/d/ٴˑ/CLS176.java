// Decompiled by JEB v5.42.0.202606242140

package d.ٴˑ;

import android.app.Activity;
import android.text.TextUtils;
import android.view.View;
import android.widget.LinearLayout.LayoutParams;
import android.widget.LinearLayout;
import android.widget.RelativeLayout.LayoutParams;
import android.widget.RelativeLayout;
import android.widget.TextView;
import d.ˑʽ.CLS43;
import d.ˑʽ.CLS45;
import d.יʻ.CLS71;
import d.ⁱٴ.CLS125;
import java.lang.ref.WeakReference;
import java.util.ArrayList;

public final class CLS176 implements CLS125 {
    public LinearLayout FLD344;
    public String FLD345;
    public String FLD346;
    public final WeakReference FLD347;
    public TextView FLD348;
    public View FLD349;
    public String FLD350;
    public final ArrayList FLD351;
    public TextView FLD352;
    public TextView FLD353;
    public int FLD354;

    public CLS176(Activity activity0) {
        this.FLD354 = 0;
        this.FLD347 = new WeakReference(activity0);
        this.FLD351 = new ArrayList();
    }

    @Override  // d.ⁱٴ.CLS125
    public final String getText() {
        return this.FLD348 == null ? this.FLD346 : this.FLD348.getText().toString();
    }

    @Override  // d.ⁱٴ.CLS125
    public final void MTH1177(int v) {
        this.FLD354 = v;
        LinearLayout linearLayout0 = this.FLD344;
        if(linearLayout0 != null) {
            linearLayout0.setVisibility(v);
        }
        View view0 = this.FLD349;
        if(view0 != null) {
            view0.setVisibility(v);
        }
    }

    @Override  // d.ⁱٴ.CLS125
    public final void MTH1178() {
        this.FLD344.setBackgroundColor(CLS43.MTH645());
    }

    @Override  // d.ⁱٴ.CLS125
    public final void MTH1179(String s) {
        this.FLD345 = s;
        CLS45.MTH658(this.FLD353, s);
    }

    @Override  // d.ⁱٴ.CLS125
    public final void MTH1180(View view0) {
        this.FLD349 = view0;
        view0.setVisibility(this.FLD354);
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
        if(TextUtils.isEmpty(s2)) {
            this.FLD350 = s2;
            CLS45.MTH658(this.FLD352, s2);
        }
        this.FLD346 = s3;
        CLS45.MTH658(this.FLD348, s3);
    }

    @Override  // d.ⁱٴ.CLS125
    public final View MTH1182() {
        if(this.FLD344 == null) {
            Activity activity0 = (Activity)this.FLD347.get();
            LinearLayout linearLayout0 = new LinearLayout(activity0);
            RelativeLayout relativeLayout0 = new RelativeLayout(activity0);
            relativeLayout0.setId(CLS45.MTH668());
            RelativeLayout relativeLayout1 = new RelativeLayout(activity0);
            relativeLayout1.setId(CLS45.MTH668());
            TextView textView0 = new TextView(activity0);
            this.FLD348 = textView0;
            textView0.setTextSize(2, 17.0f);
            this.FLD348.setId(CLS45.MTH668());
            CLS45.MTH658(this.FLD348, this.FLD346);
            this.FLD348.setTextColor(CLS43.MTH646());
            this.FLD348.setPadding(0, CLS45.MTH662(10), 0, CLS45.MTH662(5));
            RelativeLayout.LayoutParams relativeLayout$LayoutParams0 = new RelativeLayout.LayoutParams(-2, -2);
            relativeLayout$LayoutParams0.addRule(10, relativeLayout1.getId());
            relativeLayout$LayoutParams0.addRule(9, relativeLayout1.getId());
            relativeLayout1.addView(this.FLD348, relativeLayout$LayoutParams0);
            TextView textView1 = new TextView(activity0);
            this.FLD353 = textView1;
            textView1.setTextSize(2, 14.0f);
            this.FLD353.setId(CLS45.MTH668());
            CLS45.MTH658(this.FLD353, this.FLD345);
            this.FLD353.setTextColor(CLS43.MTH640());
            RelativeLayout.LayoutParams relativeLayout$LayoutParams1 = new RelativeLayout.LayoutParams(-2, -2);
            relativeLayout$LayoutParams1.addRule(9, relativeLayout1.getId());
            relativeLayout$LayoutParams1.addRule(3, this.FLD348.getId());
            this.FLD353.setPadding(CLS45.MTH662(5), 0, 0, 0);
            relativeLayout1.addView(this.FLD353, relativeLayout$LayoutParams1);
            if(TextUtils.isEmpty(this.FLD345)) {
                this.FLD353.setVisibility(8);
            }
            TextView textView2 = new TextView(activity0);
            this.FLD352 = textView2;
            textView2.setTextSize(2, 16.0f);
            this.FLD352.setId(CLS45.MTH668());
            CLS45.MTH658(this.FLD352, this.FLD350);
            this.FLD352.setTextColor(CLS43.MTH641());
            this.FLD352.setPadding(0, CLS45.MTH662(10), 0, CLS45.MTH662(5));
            RelativeLayout.LayoutParams relativeLayout$LayoutParams2 = new RelativeLayout.LayoutParams(-2, -2);
            relativeLayout$LayoutParams2.addRule(10, relativeLayout1.getId());
            relativeLayout$LayoutParams2.addRule(11, relativeLayout1.getId());
            relativeLayout1.addView(this.FLD352, relativeLayout$LayoutParams2);
            if(TextUtils.isEmpty(this.FLD346) && TextUtils.isEmpty(this.FLD350)) {
                this.FLD348.setVisibility(8);
                this.FLD352.setVisibility(8);
            }
            RelativeLayout.LayoutParams relativeLayout$LayoutParams3 = new RelativeLayout.LayoutParams(-1, -2);
            relativeLayout$LayoutParams3.addRule(9, relativeLayout1.getId());
            relativeLayout$LayoutParams3.addRule(3, this.FLD353.getId());
            LinearLayout linearLayout1 = new LinearLayout(activity0);
            linearLayout1.setGravity(0x30);
            linearLayout1.setOrientation(1);
            linearLayout1.setPadding(0, CLS45.MTH662(5), 0, 0);
            LinearLayout.LayoutParams linearLayout$LayoutParams0 = new LinearLayout.LayoutParams(-1, -2);
            for(Object object0: this.FLD351) {
                View view0 = (View)object0;
                if(view0 != null) {
                    view0.setPadding(0, 0, 0, CLS45.MTH662(3));
                    linearLayout1.addView(view0, linearLayout$LayoutParams0);
                }
            }
            relativeLayout1.addView(linearLayout1, relativeLayout$LayoutParams3);
            RelativeLayout.LayoutParams relativeLayout$LayoutParams4 = new RelativeLayout.LayoutParams(-2, -2);
            relativeLayout$LayoutParams4.addRule(9, relativeLayout0.getId());
            relativeLayout$LayoutParams4.addRule(10, relativeLayout0.getId());
            relativeLayout0.addView(relativeLayout1, relativeLayout$LayoutParams4);
            linearLayout0.addView(relativeLayout0, new LinearLayout.LayoutParams(-1, -1));
            linearLayout0.setBackgroundColor(CLS43.MTH644());
            linearLayout0.setVisibility(this.FLD354);
            this.FLD344 = linearLayout0;
        }
        return this.FLD344;
    }
}

