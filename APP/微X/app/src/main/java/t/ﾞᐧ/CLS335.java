// Decompiled by JEB v5.42.0.202606242140

package t.ﾞᐧ;

import android.app.Activity;
import android.graphics.PorterDuff.Mode;
import android.graphics.drawable.Drawable;
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

public final class CLS335 implements CLS145 {
    public int FLD1136;
    public LinearLayout FLD1137;
    public TextView FLD1138;
    public final CLS177 FLD1139;
    public View FLD1140;
    public String FLD1141;
    public String FLD1142;
    public final WeakReference FLD1143;
    public String FLD1144;
    public TextView FLD1145;
    public TextView FLD1146;

    public CLS335(Activity activity0) {
        this.FLD1136 = 0;
        this.FLD1143 = new WeakReference(activity0);
        this.FLD1139 = new CLS177(activity0);
    }

    @Override  // t.ⁱʾ.CLS145
    public final String getText() {
        return this.FLD1146 == null ? this.FLD1142 : this.FLD1146.getText().toString();
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
            this.FLD1144 = s3;
            CLS43.MTH1429(this.FLD1145, s3);
        }
        if(TextUtils.isEmpty(s4)) {
            this.FLD1141 = s4;
            CLS43.MTH1429(this.FLD1138, s4);
        }
        this.FLD1142 = s2;
        CLS43.MTH1429(this.FLD1146, s2);
    }

    @Override  // t.ⁱʾ.CLS145
    public final View MTH2173() {
        if(this.FLD1137 == null) {
            Activity activity0 = (Activity)this.FLD1143.get();
            LinearLayout linearLayout0 = new LinearLayout(activity0);
            RelativeLayout relativeLayout0 = new RelativeLayout(activity0);
            relativeLayout0.setId(CLS43.MTH1438());
            RelativeLayout relativeLayout1 = new RelativeLayout(activity0);
            relativeLayout1.setId(CLS43.MTH1438());
            TextView textView0 = new TextView(activity0);
            this.FLD1146 = textView0;
            textView0.setTextSize(2, 17.0f);
            this.FLD1146.setId(CLS43.MTH1438());
            CLS43.MTH1429(this.FLD1146, this.FLD1142);
            this.FLD1146.setTextColor(CLS46.MTH1452());
            this.FLD1146.setPadding(0, CLS43.MTH1439(10), 0, CLS43.MTH1439(5));
            RelativeLayout.LayoutParams relativeLayout$LayoutParams0 = new RelativeLayout.LayoutParams(-2, -2);
            relativeLayout$LayoutParams0.addRule(10, relativeLayout1.getId());
            relativeLayout$LayoutParams0.addRule(9, relativeLayout1.getId());
            relativeLayout1.addView(this.FLD1146, relativeLayout$LayoutParams0);
            TextView textView1 = new TextView(activity0);
            this.FLD1145 = textView1;
            textView1.setTextSize(2, 14.0f);
            this.FLD1145.setId(CLS43.MTH1438());
            CLS43.MTH1429(this.FLD1145, this.FLD1144);
            this.FLD1145.setTextColor(CLS46.MTH1457());
            RelativeLayout.LayoutParams relativeLayout$LayoutParams1 = new RelativeLayout.LayoutParams(-2, -2);
            relativeLayout$LayoutParams1.addRule(9, relativeLayout1.getId());
            relativeLayout$LayoutParams1.addRule(3, this.FLD1146.getId());
            this.FLD1145.setPadding(CLS43.MTH1439(5), 0, 0, 0);
            relativeLayout1.addView(this.FLD1145, relativeLayout$LayoutParams1);
            if(TextUtils.isEmpty(this.FLD1144)) {
                this.FLD1145.setVisibility(8);
            }
            TextView textView2 = new TextView(activity0);
            this.FLD1138 = textView2;
            textView2.setTextSize(2, 16.0f);
            this.FLD1138.setId(CLS43.MTH1438());
            CLS43.MTH1429(this.FLD1138, this.FLD1141);
            this.FLD1138.setTextColor(CLS46.MTH1444());
            this.FLD1138.setPadding(0, CLS43.MTH1439(10), 0, CLS43.MTH1439(5));
            RelativeLayout.LayoutParams relativeLayout$LayoutParams2 = new RelativeLayout.LayoutParams(-2, -2);
            relativeLayout$LayoutParams2.addRule(10, relativeLayout1.getId());
            relativeLayout$LayoutParams2.addRule(11, relativeLayout1.getId());
            relativeLayout1.addView(this.FLD1138, relativeLayout$LayoutParams2);
            if(TextUtils.isEmpty(this.FLD1142) && TextUtils.isEmpty(this.FLD1141)) {
                this.FLD1146.setVisibility(8);
                this.FLD1138.setVisibility(8);
            }
            boolean z = CLS46.MTH1455();
            CLS177 ᐧˉ0 = this.FLD1139;
            if(z) {
                Drawable drawable0 = ᐧˉ0.FLD1257.getBackground().getConstantState().newDrawable();
                drawable0.setColorFilter(CLS46.MTH1452(), PorterDuff.Mode.SRC_ATOP);
                CLS43.MTH1437(ᐧˉ0.FLD1257, drawable0);
            }
            RelativeLayout.LayoutParams relativeLayout$LayoutParams3 = new RelativeLayout.LayoutParams(-1, -2);
            relativeLayout$LayoutParams3.addRule(9, relativeLayout1.getId());
            relativeLayout$LayoutParams3.addRule(3, this.FLD1145.getId());
            int v = CLS43.MTH1439(6);
            int v1 = CLS43.MTH1439(6);
            ᐧˉ0.FLD1257.setPadding(v, 0, v1, 0);
            relativeLayout1.addView(ᐧˉ0.FLD1257, relativeLayout$LayoutParams3);
            RelativeLayout.LayoutParams relativeLayout$LayoutParams4 = new RelativeLayout.LayoutParams(-2, -2);
            relativeLayout$LayoutParams4.addRule(9, relativeLayout0.getId());
            relativeLayout$LayoutParams4.addRule(10, relativeLayout0.getId());
            relativeLayout1.setPadding(0, 0, CLS43.MTH1439(15), 0);
            relativeLayout0.addView(relativeLayout1, relativeLayout$LayoutParams4);
            linearLayout0.addView(relativeLayout0, new LinearLayout.LayoutParams(-1, -1));
            linearLayout0.setBackgroundColor(CLS46.MTH1446());
            linearLayout0.setVisibility(this.FLD1136);
            this.FLD1137 = linearLayout0;
        }
        return this.FLD1137;
    }

    @Override  // t.ⁱʾ.CLS145
    public final void MTH2174(View view0) {
        this.FLD1140 = view0;
        view0.setVisibility(this.FLD1136);
    }

    @Override  // t.ⁱʾ.CLS145
    public final void MTH2175(int v) {
        this.FLD1136 = v;
        LinearLayout linearLayout0 = this.FLD1137;
        if(linearLayout0 != null) {
            linearLayout0.setVisibility(v);
        }
        View view0 = this.FLD1140;
        if(view0 != null) {
            view0.setVisibility(v);
        }
    }

    @Override  // t.ⁱʾ.CLS145
    public final void MTH2176() {
        this.FLD1137.setBackgroundColor(CLS46.MTH1445());
    }

    public final void MTH2364(ArrayList arrayList0) {
        CLS177 ᐧˉ0 = this.FLD1139;
        ᐧˉ0.getClass();
        if(!arrayList0.isEmpty()) {
            ᐧˉ0.FLD1259.clear();
            ᐧˉ0.FLD1259.addAll(arrayList0);
            ᐧˉ0.FLD1260.notifyDataSetChanged();
        }
    }

    public final void MTH2365(String s) {
        CLS177 ᐧˉ0 = this.FLD1139;
        if(ᐧˉ0 != null) {
            ArrayList arrayList0 = ᐧˉ0.FLD1259;
            if(!arrayList0.contains(s)) {
                arrayList0.add(s);
                ᐧˉ0.MTH2444(arrayList0.size() - 1);
            }
        }
    }
}

