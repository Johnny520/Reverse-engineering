// Decompiled by JEB v5.42.0.202606242140

package d.ٴˑ;

import android.app.Activity;
import android.text.TextUtils;
import android.view.View;
import android.widget.CompoundButton.OnCheckedChangeListener;
import android.widget.LinearLayout.LayoutParams;
import android.widget.LinearLayout;
import android.widget.RelativeLayout.LayoutParams;
import android.widget.RelativeLayout;
import android.widget.Switch;
import android.widget.TextView;
import d.ˑʽ.CLS43;
import d.ˑʽ.CLS45;
import d.יʻ.CLS71;
import d.ⁱٴ.CLS125;
import java.lang.ref.WeakReference;

public final class CLS177 implements CLS125 {
    public TextView FLD358;
    public Switch FLD359;
    public String FLD360;
    public boolean FLD361;
    public int FLD362;
    public View FLD363;
    public final WeakReference FLD364;
    public CompoundButton.OnCheckedChangeListener FLD365;
    public String FLD366;
    public LinearLayout FLD367;

    public CLS177(Activity activity0) {
        this.FLD361 = false;
        this.FLD362 = 0;
        this.FLD364 = new WeakReference(activity0);
    }

    @Override  // d.ⁱٴ.CLS125
    public final String getText() {
        return this.FLD359 == null ? this.FLD360 : this.FLD359.getText().toString();
    }

    public final void MTH851(CompoundButton.OnCheckedChangeListener compoundButton$OnCheckedChangeListener0) {
        this.FLD365 = compoundButton$OnCheckedChangeListener0;
        Switch switch0 = this.FLD359;
        if(switch0 != null) {
            switch0.setOnCheckedChangeListener(compoundButton$OnCheckedChangeListener0);
        }
    }

    @Override  // d.ⁱٴ.CLS125
    public final void MTH1177(int v) {
        this.FLD362 = v;
        LinearLayout linearLayout0 = this.FLD367;
        if(linearLayout0 != null) {
            linearLayout0.setVisibility(v);
        }
        View view0 = this.FLD363;
        if(view0 != null) {
            view0.setVisibility(v);
        }
    }

    @Override  // d.ⁱٴ.CLS125
    public final void MTH1178() {
        this.FLD367.setBackgroundColor(CLS43.MTH645());
    }

    public final void MTH854(boolean z) {
        this.FLD361 = z;
        Switch switch0 = this.FLD359;
        if(switch0 != null) {
            switch0.setChecked(z);
        }
    }

    @Override  // d.ⁱٴ.CLS125
    public final void MTH1179(String s) {
        this.FLD366 = s;
        CLS45.MTH658(this.FLD358, s);
    }

    @Override  // d.ⁱٴ.CLS125
    public final void MTH1180(View view0) {
        this.FLD363 = view0;
        view0.setVisibility(this.FLD362);
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
        this.FLD360 = s2;
        CLS45.MTH658(this.FLD359, s2);
    }

    @Override  // d.ⁱٴ.CLS125
    public final View MTH1182() {
        if(this.FLD367 == null) {
            Activity activity0 = (Activity)this.FLD364.get();
            LinearLayout linearLayout0 = new LinearLayout(activity0);
            RelativeLayout relativeLayout0 = new RelativeLayout(activity0);
            relativeLayout0.setId(CLS45.MTH668());
            RelativeLayout relativeLayout1 = new RelativeLayout(activity0);
            relativeLayout1.setId(CLS45.MTH668());
            Switch switch0 = new Switch(activity0);
            this.FLD359 = switch0;
            switch0.setTextSize(2, 17.0f);
            this.FLD359.setId(CLS45.MTH668());
            CLS45.MTH658(this.FLD359, this.FLD360);
            this.FLD359.setTextColor(CLS43.MTH646());
            this.FLD359.setChecked(this.FLD361);
            this.FLD359.setOnCheckedChangeListener(this.FLD365);
            this.FLD359.setPadding(0, CLS45.MTH662(10), 0, CLS45.MTH662(5));
            this.FLD359.setEnabled(true);
            RelativeLayout.LayoutParams relativeLayout$LayoutParams0 = new RelativeLayout.LayoutParams(-1, -2);
            relativeLayout$LayoutParams0.addRule(10, relativeLayout1.getId());
            relativeLayout$LayoutParams0.addRule(9, relativeLayout1.getId());
            relativeLayout1.addView(this.FLD359, relativeLayout$LayoutParams0);
            TextView textView0 = new TextView(activity0);
            this.FLD358 = textView0;
            textView0.setTextSize(2, 14.0f);
            this.FLD358.setId(CLS45.MTH668());
            CLS45.MTH658(this.FLD358, this.FLD366);
            this.FLD358.setTextColor(CLS43.MTH640());
            RelativeLayout.LayoutParams relativeLayout$LayoutParams1 = new RelativeLayout.LayoutParams(-2, -2);
            relativeLayout$LayoutParams1.addRule(9, relativeLayout1.getId());
            relativeLayout$LayoutParams1.addRule(3, this.FLD359.getId());
            relativeLayout1.addView(this.FLD358, relativeLayout$LayoutParams1);
            if(TextUtils.isEmpty(this.FLD366)) {
                this.FLD358.setVisibility(8);
            }
            RelativeLayout.LayoutParams relativeLayout$LayoutParams2 = new RelativeLayout.LayoutParams(-2, -2);
            relativeLayout$LayoutParams2.addRule(9, relativeLayout0.getId());
            relativeLayout$LayoutParams2.addRule(10, relativeLayout0.getId());
            relativeLayout0.addView(relativeLayout1, relativeLayout$LayoutParams2);
            linearLayout0.addView(relativeLayout0, new LinearLayout.LayoutParams(-1, -1));
            linearLayout0.setBackgroundColor(CLS43.MTH644());
            linearLayout0.setVisibility(this.FLD362);
            this.FLD367 = linearLayout0;
        }
        return this.FLD367;
    }
}

