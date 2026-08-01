// Decompiled by JEB v5.42.0.202606242140

package t.ﾞᐧ;

import android.app.Activity;
import android.text.TextUtils;
import android.view.View;
import android.widget.LinearLayout.LayoutParams;
import android.widget.LinearLayout;
import android.widget.RelativeLayout.LayoutParams;
import android.widget.RelativeLayout;
import android.widget.TextView;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import t.ʾᵢ.CLS15;
import t.ˆʿ.CLS43;
import t.ˆʿ.CLS46;
import t.ⁱʾ.CLS145;

public final class CLS341 implements CLS145 {
    public String FLD1269;
    public String FLD1270;
    public String FLD1271;
    public final ArrayList FLD1272;
    public LinearLayout FLD1273;
    public TextView FLD1274;
    public boolean FLD1275;
    public TextView FLD1276;
    public boolean FLD1277;
    public final WeakReference FLD1278;
    public TextView FLD1279;
    public View FLD1280;
    public int FLD1281;

    public CLS341(Activity activity0) {
        this.FLD1281 = 0;
        this.FLD1278 = new WeakReference(activity0);
        this.FLD1272 = new ArrayList();
    }

    @Override  // t.ⁱʾ.CLS145
    public final String getText() {
        return this.FLD1274 == null ? this.FLD1270 : this.FLD1274.getText().toString();
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
            this.FLD1271 = s3;
            CLS43.MTH1429(this.FLD1276, s3);
        }
        if(TextUtils.isEmpty(s4)) {
            this.FLD1269 = s4;
            CLS43.MTH1429(this.FLD1279, s4);
        }
        this.FLD1270 = s2;
        CLS43.MTH1429(this.FLD1274, s2);
    }

    @Override  // t.ⁱʾ.CLS145
    public final View MTH2173() {
        LinearLayout.LayoutParams linearLayout$LayoutParams0;
        if(this.FLD1273 == null) {
            Activity activity0 = (Activity)this.FLD1278.get();
            LinearLayout linearLayout0 = new LinearLayout(activity0);
            RelativeLayout relativeLayout0 = new RelativeLayout(activity0);
            relativeLayout0.setId(CLS43.MTH1438());
            RelativeLayout relativeLayout1 = new RelativeLayout(activity0);
            relativeLayout1.setId(CLS43.MTH1438());
            TextView textView0 = new TextView(activity0);
            this.FLD1274 = textView0;
            textView0.setTextSize(2, 17.0f);
            this.FLD1274.setId(CLS43.MTH1438());
            CLS43.MTH1429(this.FLD1274, this.FLD1270);
            this.FLD1274.setTextColor(CLS46.MTH1452());
            this.FLD1274.setPadding(0, CLS43.MTH1439(10), 0, CLS43.MTH1439(5));
            RelativeLayout.LayoutParams relativeLayout$LayoutParams0 = new RelativeLayout.LayoutParams(-2, -2);
            relativeLayout$LayoutParams0.addRule(10, relativeLayout1.getId());
            relativeLayout$LayoutParams0.addRule(9, relativeLayout1.getId());
            relativeLayout1.addView(this.FLD1274, relativeLayout$LayoutParams0);
            TextView textView1 = new TextView(activity0);
            this.FLD1276 = textView1;
            textView1.setTextSize(2, 14.0f);
            this.FLD1276.setId(CLS43.MTH1438());
            CLS43.MTH1429(this.FLD1276, this.FLD1271);
            this.FLD1276.setTextColor(CLS46.MTH1457());
            RelativeLayout.LayoutParams relativeLayout$LayoutParams1 = new RelativeLayout.LayoutParams(-2, -2);
            relativeLayout$LayoutParams1.addRule(9, relativeLayout1.getId());
            relativeLayout$LayoutParams1.addRule(3, this.FLD1274.getId());
            this.FLD1276.setPadding(CLS43.MTH1439(5), 0, 0, 0);
            relativeLayout1.addView(this.FLD1276, relativeLayout$LayoutParams1);
            if(TextUtils.isEmpty(this.FLD1271)) {
                this.FLD1276.setVisibility(8);
            }
            TextView textView2 = new TextView(activity0);
            this.FLD1279 = textView2;
            textView2.setTextSize(2, 16.0f);
            this.FLD1279.setId(CLS43.MTH1438());
            CLS43.MTH1429(this.FLD1279, this.FLD1269);
            this.FLD1279.setTextColor(CLS46.MTH1444());
            this.FLD1279.setPadding(0, CLS43.MTH1439(10), 0, CLS43.MTH1439(5));
            RelativeLayout.LayoutParams relativeLayout$LayoutParams2 = new RelativeLayout.LayoutParams(-2, -2);
            relativeLayout$LayoutParams2.addRule(10, relativeLayout1.getId());
            relativeLayout$LayoutParams2.addRule(11, relativeLayout1.getId());
            relativeLayout1.addView(this.FLD1279, relativeLayout$LayoutParams2);
            if(TextUtils.isEmpty(this.FLD1270) && TextUtils.isEmpty(this.FLD1269)) {
                this.FLD1274.setVisibility(8);
                this.FLD1279.setVisibility(8);
            }
            RelativeLayout.LayoutParams relativeLayout$LayoutParams3 = new RelativeLayout.LayoutParams(-1, -2);
            relativeLayout$LayoutParams3.addRule(9, relativeLayout1.getId());
            relativeLayout$LayoutParams3.addRule(3, this.FLD1276.getId());
            LinearLayout linearLayout1 = new LinearLayout(activity0);
            if(this.FLD1277) {
                linearLayout1.setGravity(17);
            }
            else {
                linearLayout1.setGravity(0x30);
            }
            linearLayout1.setOrientation(1);
            linearLayout1.setPadding(0, CLS43.MTH1439(5), 0, 0);
            if(this.FLD1277) {
                linearLayout$LayoutParams0 = new LinearLayout.LayoutParams(-2, -2);
                linearLayout$LayoutParams0.gravity = 17;
            }
            else {
                linearLayout$LayoutParams0 = new LinearLayout.LayoutParams(-1, -2);
            }
            for(Object object0: this.FLD1272) {
                View view0 = (View)object0;
                if(view0 != null) {
                    view0.setPadding(0, 0, 0, CLS43.MTH1439(3));
                    linearLayout1.addView(view0, linearLayout$LayoutParams0);
                }
            }
            relativeLayout1.addView(linearLayout1, relativeLayout$LayoutParams3);
            RelativeLayout.LayoutParams relativeLayout$LayoutParams4 = new RelativeLayout.LayoutParams(-2, -2);
            relativeLayout$LayoutParams4.addRule(9, relativeLayout0.getId());
            relativeLayout$LayoutParams4.addRule(10, relativeLayout0.getId());
            relativeLayout0.addView(relativeLayout1, relativeLayout$LayoutParams4);
            linearLayout0.addView(relativeLayout0, new LinearLayout.LayoutParams(-1, -1));
            if(!this.FLD1275) {
                linearLayout0.setBackgroundColor(CLS46.MTH1446());
            }
            linearLayout0.setVisibility(this.FLD1281);
            this.FLD1273 = linearLayout0;
        }
        return this.FLD1273;
    }

    @Override  // t.ⁱʾ.CLS145
    public final void MTH2174(View view0) {
        this.FLD1280 = view0;
        view0.setVisibility(this.FLD1281);
    }

    @Override  // t.ⁱʾ.CLS145
    public final void MTH2175(int v) {
        this.FLD1281 = v;
        LinearLayout linearLayout0 = this.FLD1273;
        if(linearLayout0 != null) {
            linearLayout0.setVisibility(v);
        }
        View view0 = this.FLD1280;
        if(view0 != null) {
            view0.setVisibility(v);
        }
    }

    @Override  // t.ⁱʾ.CLS145
    public final void MTH2176() {
        this.FLD1273.setBackgroundColor(CLS46.MTH1445());
    }
}

