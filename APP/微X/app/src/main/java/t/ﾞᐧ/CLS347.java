// Decompiled by JEB v5.42.0.202606242140

package t.ﾞᐧ;

import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.LinearLayout.LayoutParams;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.RelativeLayout.LayoutParams;
import android.widget.RelativeLayout;
import android.widget.TextView;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import t.ʾᵢ.CLS15;
import t.ˆʿ.CLS43;
import t.ˆʿ.CLS46;
import t.ᵔʾ.CLS133;
import t.ⁱʾ.CLS145;

public final class CLS347 implements CLS145 {
    public interface CLS184 {
    }

    public CLS184 FLD1320;
    public LinearLayout FLD1321;
    public int FLD1322;
    public final RadioGroup FLD1323;
    public boolean FLD1324;
    public String FLD1325;
    public final WeakReference FLD1326;
    public View FLD1327;
    public final ArrayList FLD1328;
    public String FLD1329;
    public TextView FLD1330;
    public TextView FLD1331;

    public CLS347(Activity activity0) {
        this.FLD1322 = 0;
        this.FLD1324 = false;
        this.FLD1326 = new WeakReference(activity0);
        this.FLD1328 = new ArrayList();
        this.FLD1323 = new RadioGroup(activity0);
    }

    @Override  // t.ⁱʾ.CLS145
    public final String getText() {
        return this.FLD1331 == null ? this.FLD1329 : this.FLD1331.getText().toString();
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
            this.FLD1325 = s3;
            CLS43.MTH1429(this.FLD1330, s3);
        }
        this.FLD1329 = s2;
        CLS43.MTH1429(this.FLD1331, s2);
    }

    @Override  // t.ⁱʾ.CLS145
    public final View MTH2173() {
        int v1;
        int v;
        TextView textView1;
        if(this.FLD1321 == null) {
            Activity activity0 = (Activity)this.FLD1326.get();
            LinearLayout linearLayout0 = new LinearLayout(activity0);
            RelativeLayout relativeLayout0 = new RelativeLayout(activity0);
            relativeLayout0.setId(CLS43.MTH1438());
            RelativeLayout relativeLayout1 = new RelativeLayout(activity0);
            relativeLayout1.setId(CLS43.MTH1438());
            TextView textView0 = new TextView(activity0);
            this.FLD1331 = textView0;
            textView0.setTextSize(2, 17.0f);
            this.FLD1331.setId(CLS43.MTH1438());
            CLS43.MTH1429(this.FLD1331, this.FLD1329);
            this.FLD1331.setTextColor(CLS46.MTH1452());
            if(this.FLD1324) {
                textView1 = this.FLD1331;
                v = CLS43.MTH1439(3);
                v1 = CLS43.MTH1439(1);
            }
            else {
                textView1 = this.FLD1331;
                v = CLS43.MTH1439(10);
                v1 = CLS43.MTH1439(5);
            }
            textView1.setPadding(0, v, 0, v1);
            if(TextUtils.isEmpty(this.FLD1329)) {
                this.FLD1331.setVisibility(8);
            }
            RelativeLayout.LayoutParams relativeLayout$LayoutParams0 = new RelativeLayout.LayoutParams(-2, -2);
            relativeLayout$LayoutParams0.addRule(10, relativeLayout1.getId());
            relativeLayout$LayoutParams0.addRule(9, relativeLayout1.getId());
            relativeLayout1.addView(this.FLD1331, relativeLayout$LayoutParams0);
            TextView textView2 = new TextView(activity0);
            this.FLD1330 = textView2;
            textView2.setTextSize(2, 14.0f);
            this.FLD1330.setId(CLS43.MTH1438());
            CLS43.MTH1429(this.FLD1330, this.FLD1325);
            this.FLD1330.setTextColor(CLS46.MTH1457());
            RelativeLayout.LayoutParams relativeLayout$LayoutParams1 = new RelativeLayout.LayoutParams(-2, -2);
            relativeLayout$LayoutParams1.addRule(9, relativeLayout1.getId());
            relativeLayout$LayoutParams1.addRule(3, this.FLD1331.getId());
            this.FLD1330.setPadding(CLS43.MTH1439(5), 0, 0, 0);
            relativeLayout1.addView(this.FLD1330, relativeLayout$LayoutParams1);
            if(TextUtils.isEmpty(this.FLD1325)) {
                this.FLD1330.setVisibility(8);
            }
            RadioGroup radioGroup0 = this.FLD1323;
            radioGroup0.setOrientation(0);
            radioGroup0.setGravity(1);
            if(this.FLD1320 != null) {
                radioGroup0.setOnCheckedChangeListener(new CLS160(this));
            }
            RelativeLayout.LayoutParams relativeLayout$LayoutParams2 = new RelativeLayout.LayoutParams(-1, -2);
            relativeLayout$LayoutParams2.addRule(9, relativeLayout1.getId());
            relativeLayout$LayoutParams2.addRule(3, this.FLD1330.getId());
            if(TextUtils.isEmpty(this.FLD1329) && TextUtils.isEmpty(this.FLD1325)) {
                if(this.FLD1324) {
                    radioGroup0.setPadding(0, CLS43.MTH1439(3), 0, CLS43.MTH1439(1));
                }
                else {
                    radioGroup0.setPadding(0, CLS43.MTH1439(10), 0, CLS43.MTH1439(5));
                }
            }
            relativeLayout1.addView(radioGroup0, relativeLayout$LayoutParams2);
            RelativeLayout.LayoutParams relativeLayout$LayoutParams3 = new RelativeLayout.LayoutParams(-2, -2);
            relativeLayout$LayoutParams3.addRule(9, relativeLayout0.getId());
            relativeLayout$LayoutParams3.addRule(10, relativeLayout0.getId());
            relativeLayout0.addView(relativeLayout1, relativeLayout$LayoutParams3);
            linearLayout0.addView(relativeLayout0, new LinearLayout.LayoutParams(-1, -1));
            linearLayout0.setBackgroundColor(CLS46.MTH1446());
            linearLayout0.setVisibility(this.FLD1322);
            this.FLD1321 = linearLayout0;
        }
        return this.FLD1321;
    }

    @Override  // t.ⁱʾ.CLS145
    public final void MTH2174(View view0) {
        this.FLD1327 = view0;
        view0.setVisibility(this.FLD1322);
    }

    @Override  // t.ⁱʾ.CLS145
    public final void MTH2175(int v) {
        this.FLD1322 = v;
        LinearLayout linearLayout0 = this.FLD1321;
        if(linearLayout0 != null) {
            linearLayout0.setVisibility(v);
        }
        View view0 = this.FLD1327;
        if(view0 != null) {
            view0.setVisibility(v);
        }
    }

    @Override  // t.ⁱʾ.CLS145
    public final void MTH2176() {
        this.FLD1321.setBackgroundColor(CLS46.MTH1445());
    }

    public final void MTH2507(String s) {
        for(Object object0: this.FLD1328) {
            RadioButton radioButton0 = (RadioButton)object0;
            if(((String)radioButton0.getTag()).equals(s)) {
                radioButton0.setVisibility(8);
                return;
            }
            if(false) {
                break;
            }
        }
    }

    public final void MTH2508(String s) {
        String s1 = CLS133.MTH2099(s);
        RadioButton radioButton0 = new RadioButton(((Context)this.FLD1326.get()));
        radioButton0.setText(s1);
        radioButton0.setTag(s);
        radioButton0.setTextColor(CLS46.MTH1452());
        this.FLD1323.addView(radioButton0);
        this.FLD1328.add(radioButton0);
    }
}

