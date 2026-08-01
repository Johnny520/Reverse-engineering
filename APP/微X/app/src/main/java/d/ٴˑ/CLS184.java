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
import android.widget.SeekBar;
import android.widget.TextView;
import d.ˑʽ.CLS43;
import d.ˑʽ.CLS45;
import d.יʻ.CLS71;
import d.ⁱٴ.CLS125;
import java.lang.ref.WeakReference;

public final class CLS184 implements CLS125 {
    public View.OnClickListener FLD449;
    public LinearLayout FLD450;
    public String FLD451;
    public boolean FLD452;
    public String FLD453;
    public final WeakReference FLD454;
    public TextView FLD455;
    public View FLD456;
    public String FLD457;
    public final SeekBar FLD458;
    public TextView FLD459;
    public TextView FLD460;
    public int FLD461;

    public CLS184(Activity activity0) {
        this.FLD461 = 0;
        this.FLD452 = false;
        this.FLD454 = new WeakReference(activity0);
        this.FLD458 = new SeekBar(activity0);
    }

    @Override  // d.ⁱٴ.CLS125
    public final String getText() {
        return this.FLD455 == null ? this.FLD453 : this.FLD455.getText().toString();
    }

    @Override  // d.ⁱٴ.CLS125
    public final void MTH1177(int v) {
        this.FLD461 = v;
        LinearLayout linearLayout0 = this.FLD450;
        if(linearLayout0 != null) {
            linearLayout0.setVisibility(v);
        }
        View view0 = this.FLD456;
        if(view0 != null) {
            view0.setVisibility(v);
        }
    }

    @Override  // d.ⁱٴ.CLS125
    public final void MTH1178() {
        this.FLD450.setBackgroundColor(CLS43.MTH645());
    }

    public final void MTH944(String s) {
        this.FLD457 = s;
        CLS45.MTH658(this.FLD459, s);
    }

    @Override  // d.ⁱٴ.CLS125
    public final void MTH1179(String s) {
        this.FLD451 = s;
        CLS45.MTH658(this.FLD460, s);
    }

    @Override  // d.ⁱٴ.CLS125
    public final void MTH1180(View view0) {
        this.FLD456 = view0;
        view0.setVisibility(this.FLD461);
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
            s1.trim();
            s1 = s4.trim();
        }
        if(!TextUtils.isEmpty(s1)) {
            this.MTH1179(s1);
        }
        if(TextUtils.isEmpty(s2)) {
            this.MTH944(s2);
        }
        this.FLD453 = s3;
        CLS45.MTH658(this.FLD455, s3);
    }

    @Override  // d.ⁱٴ.CLS125
    public final View MTH1182() {
        if(this.FLD450 == null) {
            Activity activity0 = (Activity)this.FLD454.get();
            LinearLayout linearLayout0 = new LinearLayout(activity0);
            RelativeLayout relativeLayout0 = new RelativeLayout(activity0);
            relativeLayout0.setId(CLS45.MTH668());
            RelativeLayout relativeLayout1 = new RelativeLayout(activity0);
            relativeLayout1.setId(CLS45.MTH668());
            TextView textView0 = new TextView(activity0);
            this.FLD455 = textView0;
            textView0.setTextSize(2, 17.0f);
            this.FLD455.setId(CLS45.MTH668());
            CLS45.MTH658(this.FLD455, this.FLD453);
            this.FLD455.setTextColor(CLS43.MTH646());
            if(this.FLD452) {
                this.FLD455.setPadding(0, CLS45.MTH662(1), 0, 0);
            }
            else {
                this.FLD455.setPadding(0, CLS45.MTH662(10), 0, CLS45.MTH662(5));
            }
            RelativeLayout.LayoutParams relativeLayout$LayoutParams0 = new RelativeLayout.LayoutParams(-2, -2);
            relativeLayout$LayoutParams0.addRule(10, relativeLayout1.getId());
            relativeLayout$LayoutParams0.addRule(9, relativeLayout1.getId());
            relativeLayout1.addView(this.FLD455, relativeLayout$LayoutParams0);
            TextView textView1 = new TextView(activity0);
            this.FLD460 = textView1;
            textView1.setTextSize(2, 14.0f);
            this.FLD460.setId(CLS45.MTH668());
            CLS45.MTH658(this.FLD460, this.FLD451);
            this.FLD460.setTextColor(CLS43.MTH640());
            RelativeLayout.LayoutParams relativeLayout$LayoutParams1 = new RelativeLayout.LayoutParams(-2, -2);
            relativeLayout$LayoutParams1.addRule(9, relativeLayout1.getId());
            relativeLayout$LayoutParams1.addRule(3, this.FLD455.getId());
            this.FLD460.setPadding(CLS45.MTH662(5), 0, 0, 0);
            relativeLayout1.addView(this.FLD460, relativeLayout$LayoutParams1);
            if(TextUtils.isEmpty(this.FLD451)) {
                this.FLD460.setVisibility(8);
            }
            TextView textView2 = new TextView(activity0);
            this.FLD459 = textView2;
            textView2.setTextSize(2, 16.0f);
            this.FLD459.setId(CLS45.MTH668());
            CLS45.MTH658(this.FLD459, this.FLD457);
            this.FLD459.setTextColor(CLS43.MTH641());
            if(this.FLD452) {
                this.FLD459.setPadding(0, CLS45.MTH662(1), 0, 0);
            }
            else {
                this.FLD459.setPadding(0, CLS45.MTH662(10), 0, CLS45.MTH662(5));
            }
            View.OnClickListener view$OnClickListener0 = this.FLD449;
            if(view$OnClickListener0 != null) {
                this.FLD459.setOnClickListener(view$OnClickListener0);
            }
            RelativeLayout.LayoutParams relativeLayout$LayoutParams2 = new RelativeLayout.LayoutParams(-2, -2);
            relativeLayout$LayoutParams2.addRule(10, relativeLayout1.getId());
            relativeLayout$LayoutParams2.addRule(11, relativeLayout1.getId());
            relativeLayout1.addView(this.FLD459, relativeLayout$LayoutParams2);
            boolean z = TextUtils.isEmpty(this.FLD453);
            SeekBar seekBar0 = this.FLD458;
            if(z && TextUtils.isEmpty(this.FLD457)) {
                this.FLD455.setVisibility(8);
                this.FLD459.setVisibility(8);
                if(!this.FLD452) {
                    seekBar0.setPadding(0, CLS45.MTH662(10), 0, CLS45.MTH662(5));
                }
            }
            else if(!this.FLD452) {
                seekBar0.setPadding(0, CLS45.MTH662(5), 0, CLS45.MTH662(3));
            }
            RelativeLayout.LayoutParams relativeLayout$LayoutParams3 = new RelativeLayout.LayoutParams(-1, -2);
            relativeLayout$LayoutParams3.addRule(9, relativeLayout1.getId());
            relativeLayout$LayoutParams3.addRule(3, this.FLD460.getId());
            seekBar0.setId(CLS45.MTH668());
            relativeLayout1.addView(seekBar0, relativeLayout$LayoutParams3);
            RelativeLayout.LayoutParams relativeLayout$LayoutParams4 = new RelativeLayout.LayoutParams(-2, -2);
            relativeLayout$LayoutParams4.addRule(9, relativeLayout0.getId());
            relativeLayout$LayoutParams4.addRule(10, relativeLayout0.getId());
            relativeLayout0.addView(relativeLayout1, relativeLayout$LayoutParams4);
            linearLayout0.addView(relativeLayout0, new LinearLayout.LayoutParams(-1, -1));
            linearLayout0.setBackgroundColor(CLS43.MTH644());
            linearLayout0.setVisibility(this.FLD461);
            this.FLD450 = linearLayout0;
        }
        return this.FLD450;
    }
}

