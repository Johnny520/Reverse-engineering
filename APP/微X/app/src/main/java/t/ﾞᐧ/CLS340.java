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
import android.widget.SeekBar;
import android.widget.TextView;
import java.lang.ref.WeakReference;
import t.ʾᵢ.CLS15;
import t.ˆʿ.CLS43;
import t.ˆʿ.CLS46;
import t.ⁱʾ.CLS145;

public final class CLS340 implements CLS145 {
    public String FLD1224;
    public String FLD1225;
    public String FLD1226;
    public final SeekBar FLD1227;
    public LinearLayout FLD1228;
    public TextView FLD1229;
    public View.OnClickListener FLD1230;
    public TextView FLD1231;
    public boolean FLD1232;
    public final WeakReference FLD1233;
    public TextView FLD1234;
    public View FLD1235;
    public int FLD1236;

    public CLS340(Activity activity0) {
        this.FLD1236 = 0;
        this.FLD1232 = false;
        this.FLD1233 = new WeakReference(activity0);
        this.FLD1227 = new SeekBar(activity0);
    }

    @Override  // t.ⁱʾ.CLS145
    public final String getText() {
        return this.FLD1229 == null ? this.FLD1225 : this.FLD1229.getText().toString();
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
            this.FLD1226 = s3;
            CLS43.MTH1429(this.FLD1231, s3);
        }
        if(TextUtils.isEmpty(s4)) {
            this.MTH2429(s4);
        }
        this.FLD1225 = s2;
        CLS43.MTH1429(this.FLD1229, s2);
    }

    @Override  // t.ⁱʾ.CLS145
    public final View MTH2173() {
        if(this.FLD1228 == null) {
            Activity activity0 = (Activity)this.FLD1233.get();
            LinearLayout linearLayout0 = new LinearLayout(activity0);
            RelativeLayout relativeLayout0 = new RelativeLayout(activity0);
            relativeLayout0.setId(CLS43.MTH1438());
            RelativeLayout relativeLayout1 = new RelativeLayout(activity0);
            relativeLayout1.setId(CLS43.MTH1438());
            TextView textView0 = new TextView(activity0);
            this.FLD1229 = textView0;
            textView0.setTextSize(2, 17.0f);
            this.FLD1229.setId(CLS43.MTH1438());
            CLS43.MTH1429(this.FLD1229, this.FLD1225);
            this.FLD1229.setTextColor(CLS46.MTH1452());
            if(this.FLD1232) {
                this.FLD1229.setPadding(0, CLS43.MTH1439(1), 0, 0);
            }
            else {
                this.FLD1229.setPadding(0, CLS43.MTH1439(10), 0, CLS43.MTH1439(5));
            }
            RelativeLayout.LayoutParams relativeLayout$LayoutParams0 = new RelativeLayout.LayoutParams(-2, -2);
            relativeLayout$LayoutParams0.addRule(10, relativeLayout1.getId());
            relativeLayout$LayoutParams0.addRule(9, relativeLayout1.getId());
            relativeLayout1.addView(this.FLD1229, relativeLayout$LayoutParams0);
            TextView textView1 = new TextView(activity0);
            this.FLD1231 = textView1;
            textView1.setTextSize(2, 14.0f);
            this.FLD1231.setId(CLS43.MTH1438());
            CLS43.MTH1429(this.FLD1231, this.FLD1226);
            this.FLD1231.setTextColor(CLS46.MTH1457());
            RelativeLayout.LayoutParams relativeLayout$LayoutParams1 = new RelativeLayout.LayoutParams(-2, -2);
            relativeLayout$LayoutParams1.addRule(9, relativeLayout1.getId());
            relativeLayout$LayoutParams1.addRule(3, this.FLD1229.getId());
            this.FLD1231.setPadding(CLS43.MTH1439(5), 0, 0, 0);
            relativeLayout1.addView(this.FLD1231, relativeLayout$LayoutParams1);
            if(TextUtils.isEmpty(this.FLD1226)) {
                this.FLD1231.setVisibility(8);
            }
            TextView textView2 = new TextView(activity0);
            this.FLD1234 = textView2;
            textView2.setTextSize(2, 16.0f);
            this.FLD1234.setId(CLS43.MTH1438());
            CLS43.MTH1429(this.FLD1234, this.FLD1224);
            this.FLD1234.setTextColor(CLS46.MTH1444());
            if(this.FLD1232) {
                this.FLD1234.setPadding(0, CLS43.MTH1439(1), 0, 0);
            }
            else {
                this.FLD1234.setPadding(0, CLS43.MTH1439(10), 0, CLS43.MTH1439(5));
            }
            View.OnClickListener view$OnClickListener0 = this.FLD1230;
            if(view$OnClickListener0 != null) {
                this.FLD1234.setOnClickListener(view$OnClickListener0);
            }
            RelativeLayout.LayoutParams relativeLayout$LayoutParams2 = new RelativeLayout.LayoutParams(-2, -2);
            relativeLayout$LayoutParams2.addRule(10, relativeLayout1.getId());
            relativeLayout$LayoutParams2.addRule(11, relativeLayout1.getId());
            relativeLayout1.addView(this.FLD1234, relativeLayout$LayoutParams2);
            boolean z = TextUtils.isEmpty(this.FLD1225);
            SeekBar seekBar0 = this.FLD1227;
            if(z && TextUtils.isEmpty(this.FLD1224)) {
                this.FLD1229.setVisibility(8);
                this.FLD1234.setVisibility(8);
                if(!this.FLD1232) {
                    seekBar0.setPadding(0, CLS43.MTH1439(10), 0, CLS43.MTH1439(5));
                }
            }
            else if(!this.FLD1232) {
                seekBar0.setPadding(0, CLS43.MTH1439(5), 0, CLS43.MTH1439(3));
            }
            RelativeLayout.LayoutParams relativeLayout$LayoutParams3 = new RelativeLayout.LayoutParams(-1, -2);
            relativeLayout$LayoutParams3.addRule(9, relativeLayout1.getId());
            relativeLayout$LayoutParams3.addRule(3, this.FLD1231.getId());
            seekBar0.setId(CLS43.MTH1438());
            relativeLayout1.addView(seekBar0, relativeLayout$LayoutParams3);
            RelativeLayout.LayoutParams relativeLayout$LayoutParams4 = new RelativeLayout.LayoutParams(-2, -2);
            relativeLayout$LayoutParams4.addRule(9, relativeLayout0.getId());
            relativeLayout$LayoutParams4.addRule(10, relativeLayout0.getId());
            relativeLayout0.addView(relativeLayout1, relativeLayout$LayoutParams4);
            linearLayout0.addView(relativeLayout0, new LinearLayout.LayoutParams(-1, -1));
            linearLayout0.setBackgroundColor(CLS46.MTH1446());
            linearLayout0.setVisibility(this.FLD1236);
            this.FLD1228 = linearLayout0;
        }
        return this.FLD1228;
    }

    @Override  // t.ⁱʾ.CLS145
    public final void MTH2174(View view0) {
        this.FLD1235 = view0;
        view0.setVisibility(this.FLD1236);
    }

    @Override  // t.ⁱʾ.CLS145
    public final void MTH2175(int v) {
        this.FLD1236 = v;
        LinearLayout linearLayout0 = this.FLD1228;
        if(linearLayout0 != null) {
            linearLayout0.setVisibility(v);
        }
        View view0 = this.FLD1235;
        if(view0 != null) {
            view0.setVisibility(v);
        }
    }

    @Override  // t.ⁱʾ.CLS145
    public final void MTH2176() {
        this.FLD1228.setBackgroundColor(CLS46.MTH1445());
    }

    public final void MTH2429(String s) {
        this.FLD1224 = s;
        CLS43.MTH1429(this.FLD1234, s);
    }
}

