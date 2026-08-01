// Decompiled by JEB v5.42.0.202606242140

package d.ٴˑ;

import android.app.Activity;
import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;
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

public final class CLS190 implements CLS125 {
    public interface CLS97 {
        void MTH1016(String arg1);
    }

    public int FLD549;
    public String FLD550;
    public String FLD551;
    public View FLD552;
    public String FLD553;
    public String FLD554;
    public final WeakReference FLD555;
    public LinearLayout FLD556;
    public TextView FLD557;
    public int FLD558;
    public boolean FLD559;
    public final EditText FLD560;
    public TextView FLD561;
    public CLS97 FLD562;
    public TextView FLD563;

    public CLS190(Activity activity0) {
        this.FLD558 = 0;
        this.FLD559 = false;
        this.FLD549 = 1;
        this.FLD555 = new WeakReference(activity0);
        this.FLD560 = new EditText(activity0);
    }

    @Override  // d.ⁱٴ.CLS125
    public final String getText() {
        return this.FLD563 == null ? this.FLD551 : this.FLD563.getText().toString();
    }

    public final void MTH1019(int v) {
        this.FLD549 = v;
        EditText editText0 = this.FLD560;
        if(editText0 != null) {
            if(v == 1) {
                v = 0x20001;
            }
            editText0.setInputType(v);
        }
    }

    public final void MTH1020(String s) {
        this.FLD554 = s;
        EditText editText0 = this.FLD560;
        if(editText0 != null) {
            editText0.setText(s);
        }
    }

    @Override  // d.ⁱٴ.CLS125
    public final void MTH1177(int v) {
        this.FLD558 = v;
        LinearLayout linearLayout0 = this.FLD556;
        if(linearLayout0 != null) {
            linearLayout0.setVisibility(v);
        }
        View view0 = this.FLD552;
        if(view0 != null) {
            view0.setVisibility(v);
        }
    }

    @Override  // d.ⁱٴ.CLS125
    public final void MTH1178() {
        this.FLD556.setBackgroundColor(CLS43.MTH645());
    }

    public final String MTH1023() {
        return this.FLD560 == null ? this.FLD554 : this.FLD560.getText().toString().trim();
    }

    @Override  // d.ⁱٴ.CLS125
    public final void MTH1179(String s) {
        this.FLD553 = s;
        CLS45.MTH658(this.FLD561, s);
    }

    @Override  // d.ⁱٴ.CLS125
    public final void MTH1180(View view0) {
        this.FLD552 = view0;
        view0.setVisibility(this.FLD558);
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
            this.FLD550 = s2;
            CLS45.MTH658(this.FLD557, s2);
        }
        this.FLD551 = s3;
        CLS45.MTH658(this.FLD563, s3);
    }

    @Override  // d.ⁱٴ.CLS125
    public final View MTH1182() {
        int v3;
        int v2;
        TextView textView4;
        int v1;
        int v;
        TextView textView1;
        if(this.FLD556 == null) {
            Activity activity0 = (Activity)this.FLD555.get();
            LinearLayout linearLayout0 = new LinearLayout(activity0);
            RelativeLayout relativeLayout0 = new RelativeLayout(activity0);
            relativeLayout0.setId(CLS45.MTH668());
            RelativeLayout relativeLayout1 = new RelativeLayout(activity0);
            relativeLayout1.setId(CLS45.MTH668());
            TextView textView0 = new TextView(activity0);
            this.FLD563 = textView0;
            textView0.setTextSize(2, 17.0f);
            this.FLD563.setId(CLS45.MTH668());
            CLS45.MTH658(this.FLD563, this.FLD551);
            this.FLD563.setTextColor(CLS43.MTH646());
            if(this.FLD559) {
                textView1 = this.FLD563;
                v = CLS45.MTH662(3);
                v1 = CLS45.MTH662(1);
            }
            else {
                textView1 = this.FLD563;
                v = CLS45.MTH662(10);
                v1 = CLS45.MTH662(5);
            }
            textView1.setPadding(0, v, 0, v1);
            RelativeLayout.LayoutParams relativeLayout$LayoutParams0 = new RelativeLayout.LayoutParams(-2, -2);
            relativeLayout$LayoutParams0.addRule(10, relativeLayout1.getId());
            relativeLayout$LayoutParams0.addRule(9, relativeLayout1.getId());
            relativeLayout1.addView(this.FLD563, relativeLayout$LayoutParams0);
            TextView textView2 = new TextView(activity0);
            this.FLD561 = textView2;
            textView2.setTextSize(2, 14.0f);
            this.FLD561.setId(CLS45.MTH668());
            CLS45.MTH658(this.FLD561, this.FLD553);
            this.FLD561.setTextColor(CLS43.MTH640());
            RelativeLayout.LayoutParams relativeLayout$LayoutParams1 = new RelativeLayout.LayoutParams(-2, -2);
            relativeLayout$LayoutParams1.addRule(9, relativeLayout1.getId());
            relativeLayout$LayoutParams1.addRule(3, this.FLD563.getId());
            this.FLD561.setPadding(CLS45.MTH662(5), 0, 0, 0);
            relativeLayout1.addView(this.FLD561, relativeLayout$LayoutParams1);
            if(TextUtils.isEmpty(this.FLD553)) {
                this.FLD561.setVisibility(8);
            }
            TextView textView3 = new TextView(activity0);
            this.FLD557 = textView3;
            textView3.setTextSize(2, 16.0f);
            this.FLD557.setId(CLS45.MTH668());
            CLS45.MTH658(this.FLD557, this.FLD550);
            this.FLD557.setTextColor(CLS43.MTH641());
            if(this.FLD559) {
                textView4 = this.FLD557;
                v2 = CLS45.MTH662(3);
                v3 = CLS45.MTH662(2);
            }
            else {
                textView4 = this.FLD557;
                v2 = CLS45.MTH662(10);
                v3 = CLS45.MTH662(5);
            }
            textView4.setPadding(0, v2, 0, v3);
            RelativeLayout.LayoutParams relativeLayout$LayoutParams2 = new RelativeLayout.LayoutParams(-2, -2);
            relativeLayout$LayoutParams2.addRule(10, relativeLayout1.getId());
            relativeLayout$LayoutParams2.addRule(11, relativeLayout1.getId());
            relativeLayout1.addView(this.FLD557, relativeLayout$LayoutParams2);
            if(TextUtils.isEmpty(this.FLD551) && TextUtils.isEmpty(this.FLD550)) {
                this.FLD563.setVisibility(8);
                this.FLD557.setVisibility(8);
            }
            if(this.FLD549 == 1) {
                this.FLD549 = 0x20001;
            }
            EditText editText0 = this.FLD560;
            editText0.setInputType(this.FLD549);
            if(!TextUtils.isEmpty(null)) {
                editText0.setHint(null);
            }
            editText0.setText(this.FLD554);
            if(this.FLD562 != null) {
                editText0.addTextChangedListener(new CLS77(this));
            }
            RelativeLayout.LayoutParams relativeLayout$LayoutParams3 = new RelativeLayout.LayoutParams(-1, -2);
            relativeLayout$LayoutParams3.addRule(9, relativeLayout1.getId());
            relativeLayout$LayoutParams3.addRule(3, this.FLD561.getId());
            if(this.FLD559) {
                editText0.setPadding(CLS45.MTH662(6), CLS45.MTH662(2), CLS45.MTH662(6), 0);
            }
            else {
                editText0.setPadding(CLS45.MTH662(6), CLS45.MTH662(5), CLS45.MTH662(6), 0);
            }
            editText0.setTextColor(CLS43.MTH646());
            editText0.setHintTextColor(CLS43.MTH640());
            relativeLayout1.addView(editText0, relativeLayout$LayoutParams3);
            RelativeLayout.LayoutParams relativeLayout$LayoutParams4 = new RelativeLayout.LayoutParams(-2, -2);
            relativeLayout$LayoutParams4.addRule(9, relativeLayout0.getId());
            relativeLayout$LayoutParams4.addRule(10, relativeLayout0.getId());
            relativeLayout0.addView(relativeLayout1, relativeLayout$LayoutParams4);
            linearLayout0.addView(relativeLayout0, new LinearLayout.LayoutParams(-1, -1));
            linearLayout0.setBackgroundColor(CLS43.MTH644());
            linearLayout0.setVisibility(this.FLD558);
            this.FLD556 = linearLayout0;
        }
        return this.FLD556;
    }
}

