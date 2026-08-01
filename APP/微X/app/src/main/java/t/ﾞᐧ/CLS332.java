// Decompiled by JEB v5.42.0.202606242140

package t.ﾞᐧ;

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
import java.lang.ref.WeakReference;
import t.ʾᵢ.CLS15;
import t.ˆʿ.CLS43;
import t.ˆʿ.CLS46;
import t.ⁱʾ.CLS145;

public final class CLS332 implements CLS145 {
    public View FLD1100;
    public Switch FLD1101;
    public TextView FLD1102;
    public final WeakReference FLD1103;
    public boolean FLD1104;
    public String FLD1105;
    public String FLD1106;
    public CompoundButton.OnCheckedChangeListener FLD1107;
    public int FLD1108;
    public LinearLayout FLD1109;

    public CLS332(Activity activity0) {
        this.FLD1104 = false;
        this.FLD1108 = 0;
        this.FLD1103 = new WeakReference(activity0);
    }

    @Override  // t.ⁱʾ.CLS145
    public final String getText() {
        return this.FLD1101 == null ? this.FLD1106 : this.FLD1101.getText().toString();
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
            this.FLD1105 = s3;
            CLS43.MTH1429(this.FLD1102, s3);
        }
        this.FLD1106 = s2;
        CLS43.MTH1429(this.FLD1101, s2);
    }

    @Override  // t.ⁱʾ.CLS145
    public final View MTH2173() {
        if(this.FLD1109 == null) {
            Activity activity0 = (Activity)this.FLD1103.get();
            LinearLayout linearLayout0 = new LinearLayout(activity0);
            RelativeLayout relativeLayout0 = new RelativeLayout(activity0);
            relativeLayout0.setId(CLS43.MTH1438());
            RelativeLayout relativeLayout1 = new RelativeLayout(activity0);
            relativeLayout1.setId(CLS43.MTH1438());
            Switch switch0 = new Switch(activity0);
            this.FLD1101 = switch0;
            switch0.setTextSize(2, 17.0f);
            this.FLD1101.setId(CLS43.MTH1438());
            CLS43.MTH1429(this.FLD1101, this.FLD1106);
            this.FLD1101.setTextColor(CLS46.MTH1452());
            this.FLD1101.setChecked(this.FLD1104);
            this.FLD1101.setOnCheckedChangeListener(this.FLD1107);
            this.FLD1101.setPadding(0, CLS43.MTH1439(10), 0, CLS43.MTH1439(5));
            this.FLD1101.setEnabled(true);
            RelativeLayout.LayoutParams relativeLayout$LayoutParams0 = new RelativeLayout.LayoutParams(-1, -2);
            relativeLayout$LayoutParams0.addRule(10, relativeLayout1.getId());
            relativeLayout$LayoutParams0.addRule(9, relativeLayout1.getId());
            relativeLayout1.addView(this.FLD1101, relativeLayout$LayoutParams0);
            TextView textView0 = new TextView(activity0);
            this.FLD1102 = textView0;
            textView0.setTextSize(2, 14.0f);
            this.FLD1102.setId(CLS43.MTH1438());
            CLS43.MTH1429(this.FLD1102, this.FLD1105);
            this.FLD1102.setTextColor(CLS46.MTH1457());
            RelativeLayout.LayoutParams relativeLayout$LayoutParams1 = new RelativeLayout.LayoutParams(-2, -2);
            relativeLayout$LayoutParams1.addRule(9, relativeLayout1.getId());
            relativeLayout$LayoutParams1.addRule(3, this.FLD1101.getId());
            relativeLayout1.addView(this.FLD1102, relativeLayout$LayoutParams1);
            if(TextUtils.isEmpty(this.FLD1105)) {
                this.FLD1102.setVisibility(8);
            }
            RelativeLayout.LayoutParams relativeLayout$LayoutParams2 = new RelativeLayout.LayoutParams(-2, -2);
            relativeLayout$LayoutParams2.addRule(9, relativeLayout0.getId());
            relativeLayout$LayoutParams2.addRule(10, relativeLayout0.getId());
            relativeLayout0.addView(relativeLayout1, relativeLayout$LayoutParams2);
            linearLayout0.addView(relativeLayout0, new LinearLayout.LayoutParams(-1, -1));
            linearLayout0.setBackgroundColor(CLS46.MTH1446());
            linearLayout0.setVisibility(this.FLD1108);
            this.FLD1109 = linearLayout0;
        }
        return this.FLD1109;
    }

    @Override  // t.ⁱʾ.CLS145
    public final void MTH2174(View view0) {
        this.FLD1100 = view0;
        view0.setVisibility(this.FLD1108);
    }

    @Override  // t.ⁱʾ.CLS145
    public final void MTH2175(int v) {
        this.FLD1108 = v;
        LinearLayout linearLayout0 = this.FLD1109;
        if(linearLayout0 != null) {
            linearLayout0.setVisibility(v);
        }
        View view0 = this.FLD1100;
        if(view0 != null) {
            view0.setVisibility(v);
        }
    }

    @Override  // t.ⁱʾ.CLS145
    public final void MTH2176() {
        this.FLD1109.setBackgroundColor(CLS46.MTH1445());
    }

    public final void MTH2327(CompoundButton.OnCheckedChangeListener compoundButton$OnCheckedChangeListener0) {
        this.FLD1107 = compoundButton$OnCheckedChangeListener0;
        Switch switch0 = this.FLD1101;
        if(switch0 != null) {
            switch0.setOnCheckedChangeListener(compoundButton$OnCheckedChangeListener0);
        }
    }

    public final void MTH2328(boolean z) {
        this.FLD1104 = z;
        Switch switch0 = this.FLD1101;
        if(switch0 != null) {
            switch0.setChecked(z);
        }
    }
}

