// Decompiled by JEB v5.42.0.202606242140

package t.ﾞᐧ;

import android.app.Activity;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.View;
import android.widget.EditText;
import android.widget.LinearLayout.LayoutParams;
import android.widget.LinearLayout;
import android.widget.RelativeLayout.LayoutParams;
import android.widget.RelativeLayout;
import android.widget.TextView;
import java.lang.ref.WeakReference;
import t.ʾᵢ.CLS15;
import t.ˆʿ.CLS43;
import t.ˆʿ.CLS46;
import t.ᵔʾ.CLS133;
import t.ⁱʾ.CLS145;

public final class CLS339 implements CLS145 {
    public interface CLS170 {
        void MTH2406(String arg1);
    }

    public boolean FLD1193;
    public String FLD1194;
    public View FLD1195;
    public final EditText FLD1196;
    public String FLD1197;
    public View FLD1198;
    public TextView FLD1199;
    public String FLD1200;
    public CLS170 FLD1201;
    public String FLD1202;
    public final WeakReference FLD1203;
    public TextView FLD1204;
    public int FLD1205;
    public int FLD1206;
    public TextView FLD1207;

    public CLS339(Activity activity0) {
        this.FLD1206 = 0;
        this.FLD1193 = false;
        this.FLD1205 = 1;
        this.FLD1203 = new WeakReference(activity0);
        this.FLD1196 = new EditText(activity0);
    }

    @Override  // t.ⁱʾ.CLS145
    public final String getText() {
        return this.FLD1207 == null ? this.FLD1197 : this.FLD1207.getText().toString();
    }

    public final void MTH2409(String s) {
        this.FLD1194 = s;
        EditText editText0 = this.FLD1196;
        if(editText0 != null) {
            editText0.setText(s);
        }
    }

    public final void MTH2410(int v) {
        this.FLD1205 = v;
        EditText editText0 = this.FLD1196;
        if(editText0 != null) {
            if(v == 1) {
                v = 0x20001;
            }
            editText0.setInputType(v);
        }
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
            this.FLD1202 = s3;
            CLS43.MTH1429(this.FLD1204, s3);
        }
        if(TextUtils.isEmpty(s4)) {
            this.FLD1200 = s4;
            CLS43.MTH1429(this.FLD1199, s4);
        }
        this.FLD1197 = s2;
        CLS43.MTH1429(this.FLD1207, s2);
    }

    @Override  // t.ⁱʾ.CLS145
    public final View MTH2173() {
        if(this.FLD1198 == null) {
            this.FLD1198 = this.MTH2417();
        }
        return this.FLD1198;
    }

    @Override  // t.ⁱʾ.CLS145
    public final void MTH2174(View view0) {
        this.FLD1195 = view0;
        view0.setVisibility(this.FLD1206);
    }

    @Override  // t.ⁱʾ.CLS145
    public final void MTH2175(int v) {
        this.FLD1206 = v;
        View view0 = this.FLD1198;
        if(view0 != null) {
            view0.setVisibility(v);
        }
        View view1 = this.FLD1195;
        if(view1 != null) {
            view1.setVisibility(v);
        }
    }

    @Override  // t.ⁱʾ.CLS145
    public final void MTH2176() {
        this.FLD1198.setBackgroundColor(CLS46.MTH1445());
    }

    public final String MTH2416() {
        return this.FLD1196 == null ? this.FLD1194 : this.FLD1196.getText().toString().trim();
    }

    public final View MTH2417() {
        public final class CLS169 implements TextWatcher {
            public final CLS339 FLD1192;

            @Override  // android.text.TextWatcher
            public final void afterTextChanged(Editable editable0) {
                try {
                    CLS339.this.FLD1201.MTH2406(editable0.toString());
                }
                catch(Throwable throwable0) {
                    CLS133.MTH2113(throwable0);
                }
            }

            @Override  // android.text.TextWatcher
            public final void beforeTextChanged(CharSequence charSequence0, int v, int v1, int v2) {
            }

            @Override  // android.text.TextWatcher
            public final void onTextChanged(CharSequence charSequence0, int v, int v1, int v2) {
            }
        }

        int v3;
        int v2;
        TextView textView4;
        int v1;
        int v;
        TextView textView1;
        Activity activity0 = (Activity)this.FLD1203.get();
        LinearLayout linearLayout0 = new LinearLayout(activity0);
        RelativeLayout relativeLayout0 = new RelativeLayout(activity0);
        relativeLayout0.setId(CLS43.MTH1438());
        RelativeLayout relativeLayout1 = new RelativeLayout(activity0);
        relativeLayout1.setId(CLS43.MTH1438());
        TextView textView0 = new TextView(activity0);
        this.FLD1207 = textView0;
        textView0.setTextSize(2, 17.0f);
        this.FLD1207.setId(CLS43.MTH1438());
        CLS43.MTH1429(this.FLD1207, this.FLD1197);
        this.FLD1207.setTextColor(CLS46.MTH1452());
        if(this.FLD1193) {
            textView1 = this.FLD1207;
            v = CLS43.MTH1439(3);
            v1 = CLS43.MTH1439(1);
        }
        else {
            textView1 = this.FLD1207;
            v = CLS43.MTH1439(10);
            v1 = CLS43.MTH1439(5);
        }
        textView1.setPadding(0, v, 0, v1);
        RelativeLayout.LayoutParams relativeLayout$LayoutParams0 = new RelativeLayout.LayoutParams(-2, -2);
        relativeLayout$LayoutParams0.addRule(10, relativeLayout1.getId());
        relativeLayout$LayoutParams0.addRule(9, relativeLayout1.getId());
        relativeLayout1.addView(this.FLD1207, relativeLayout$LayoutParams0);
        TextView textView2 = new TextView(activity0);
        this.FLD1204 = textView2;
        textView2.setTextSize(2, 14.0f);
        this.FLD1204.setId(CLS43.MTH1438());
        CLS43.MTH1429(this.FLD1204, this.FLD1202);
        this.FLD1204.setTextColor(CLS46.MTH1457());
        RelativeLayout.LayoutParams relativeLayout$LayoutParams1 = new RelativeLayout.LayoutParams(-2, -2);
        relativeLayout$LayoutParams1.addRule(9, relativeLayout1.getId());
        relativeLayout$LayoutParams1.addRule(3, this.FLD1207.getId());
        this.FLD1204.setPadding(CLS43.MTH1439(5), 0, 0, 0);
        relativeLayout1.addView(this.FLD1204, relativeLayout$LayoutParams1);
        if(TextUtils.isEmpty(this.FLD1202)) {
            this.FLD1204.setVisibility(8);
        }
        TextView textView3 = new TextView(activity0);
        this.FLD1199 = textView3;
        textView3.setTextSize(2, 16.0f);
        this.FLD1199.setId(CLS43.MTH1438());
        CLS43.MTH1429(this.FLD1199, this.FLD1200);
        this.FLD1199.setTextColor(CLS46.MTH1444());
        if(this.FLD1193) {
            textView4 = this.FLD1199;
            v2 = CLS43.MTH1439(3);
            v3 = CLS43.MTH1439(2);
        }
        else {
            textView4 = this.FLD1199;
            v2 = CLS43.MTH1439(10);
            v3 = CLS43.MTH1439(5);
        }
        textView4.setPadding(0, v2, 0, v3);
        RelativeLayout.LayoutParams relativeLayout$LayoutParams2 = new RelativeLayout.LayoutParams(-2, -2);
        relativeLayout$LayoutParams2.addRule(10, relativeLayout1.getId());
        relativeLayout$LayoutParams2.addRule(11, relativeLayout1.getId());
        relativeLayout1.addView(this.FLD1199, relativeLayout$LayoutParams2);
        if(TextUtils.isEmpty(this.FLD1197) && TextUtils.isEmpty(this.FLD1200)) {
            this.FLD1207.setVisibility(8);
            this.FLD1199.setVisibility(8);
        }
        if(this.FLD1205 == 1) {
            this.FLD1205 = 0x20001;
        }
        EditText editText0 = this.FLD1196;
        editText0.setInputType(this.FLD1205);
        if(!TextUtils.isEmpty(null)) {
            editText0.setHint(null);
        }
        editText0.setText(this.FLD1194);
        if(this.FLD1201 != null) {
            editText0.addTextChangedListener(new CLS169(this));
        }
        RelativeLayout.LayoutParams relativeLayout$LayoutParams3 = new RelativeLayout.LayoutParams(-1, -2);
        relativeLayout$LayoutParams3.addRule(9, relativeLayout1.getId());
        relativeLayout$LayoutParams3.addRule(3, this.FLD1204.getId());
        if(this.FLD1193) {
            editText0.setPadding(CLS43.MTH1439(6), CLS43.MTH1439(2), CLS43.MTH1439(6), 0);
        }
        else {
            editText0.setPadding(CLS43.MTH1439(6), CLS43.MTH1439(5), CLS43.MTH1439(6), 0);
        }
        editText0.setTextColor(CLS46.MTH1452());
        editText0.setHintTextColor(CLS46.MTH1457());
        relativeLayout1.addView(editText0, relativeLayout$LayoutParams3);
        RelativeLayout.LayoutParams relativeLayout$LayoutParams4 = new RelativeLayout.LayoutParams(-2, -2);
        relativeLayout$LayoutParams4.addRule(9, relativeLayout0.getId());
        relativeLayout$LayoutParams4.addRule(10, relativeLayout0.getId());
        relativeLayout0.addView(relativeLayout1, relativeLayout$LayoutParams4);
        linearLayout0.addView(relativeLayout0, new LinearLayout.LayoutParams(-1, -1));
        linearLayout0.setBackgroundColor(CLS46.MTH1446());
        linearLayout0.setVisibility(this.FLD1206);
        return linearLayout0;
    }
}

