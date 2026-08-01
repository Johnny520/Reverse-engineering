// Decompiled by JEB v5.42.0.202606242140

package b.ﾞˎ;

import android.app.Activity;
import android.text.TextUtils;
import android.view.View;
import android.widget.LinearLayout.LayoutParams;
import android.widget.LinearLayout;
import android.widget.RelativeLayout.LayoutParams;
import android.widget.RelativeLayout;
import android.widget.TextView;
import b.ʻˑ.CLS18;
import b.ᐧˉ.CLS182;
import b.ᵔʾ.CLS292;
import b.ⁱᵔ.CLS502;
import b.ⁱᵔ.CLS522;
import b.ⁱᵔ.CLS523;
import java.lang.ref.WeakReference;
import java.util.ArrayList;

public final class CLS1618 implements CLS18 {
    public String FLD5169;
    public String FLD5170;
    public String FLD5171;
    public final ArrayList FLD5172;
    public LinearLayout FLD5173;
    public TextView FLD5174;
    public TextView FLD5175;
    public boolean FLD5176;
    public final WeakReference FLD5177;
    public TextView FLD5178;
    public View FLD5179;
    public int FLD5180;

    public CLS1618(Activity activity0) {
        this.FLD5180 = 0;
        this.FLD5177 = new WeakReference(activity0);
        this.FLD5172 = new ArrayList();
    }

    @Override  // b.ʻˑ.CLS18
    public final String getText() {
        return this.FLD5174 == null ? this.FLD5170 : CLS502.MTH6936(this.FLD5174.getText());
    }

    @Override  // b.ʻˑ.CLS18
    public final void MTH798(String s) {
        this.FLD5171 = s;
        CLS523.MTH7155(this.FLD5175, s);
    }

    @Override  // b.ʻˑ.CLS18
    public final void MTH799() {
        this.FLD5173.setBackgroundColor(CLS522.MTH7112());
    }

    // 此方法包含解密的字符串
    @Override  // b.ʻˑ.CLS18
    public final void MTH800(String s) {
        String s1 = "";
        String s2 = "";
        String s3 = "";
        String s4 = "";
        new String("");
        if(!TextUtils.isEmpty(s)) {
            if(s.contains("[[") && s.contains("]]")) {
                int v = s.indexOf("[[");
                int v1 = s.lastIndexOf("]]");
                s1 = s.substring(v + 2, v1);
                s = CLS182.MTH3495(s, 0, v, new StringBuilder(), v1, 2);
            }
            String s5 = s;
            String s6 = "";
            if(s5.contains("{") && s5.contains("}")) {
                int v2 = s5.indexOf("{");
                int v3 = s5.lastIndexOf("}");
                s6 = s5.substring(v2 + 1, v3);
                s5 = CLS182.MTH3495(s5, 0, v2, new StringBuilder(), v3, 1);
            }
            String s7 = "";
            if(s5.contains("((") && s5.contains("))")) {
                int v4 = s5.indexOf("((");
                int v5 = s5.lastIndexOf("))");
                s7 = s5.substring(v4 + 2, v5);
                s5 = CLS182.MTH3495(s5, 0, v4, new StringBuilder(), v5, 2);
            }
            s7.getClass();
            s3 = s1.trim();
            s2 = s5.trim();
            s4 = s6.trim();
        }
        if(!TextUtils.isEmpty(s3)) {
            this.MTH798(s3);
        }
        if(TextUtils.isEmpty(s4)) {
            this.FLD5169 = s4;
            CLS523.MTH7155(this.FLD5178, s4);
        }
        this.FLD5170 = s2;
        CLS523.MTH7155(this.FLD5174, s2);
    }

    @Override  // b.ʻˑ.CLS18
    public final void MTH801(int v) {
        this.FLD5180 = v;
        LinearLayout linearLayout0 = this.FLD5173;
        if(linearLayout0 != null) {
            linearLayout0.setVisibility(v);
        }
        View view0 = this.FLD5179;
        if(view0 != null) {
            view0.setVisibility(v);
        }
    }

    @Override  // b.ʻˑ.CLS18
    public final void MTH802(View view0) {
        this.FLD5179 = view0;
        view0.setVisibility(this.FLD5180);
    }

    @Override  // b.ʻˑ.CLS18
    public final View MTH803() {
        LinearLayout.LayoutParams linearLayout$LayoutParams0;
        if(this.FLD5173 == null) {
            Activity activity0 = (Activity)this.FLD5177.get();
            LinearLayout linearLayout0 = new LinearLayout(activity0);
            RelativeLayout relativeLayout0 = new RelativeLayout(activity0);
            relativeLayout0.setId(CLS523.MTH7138());
            RelativeLayout relativeLayout1 = new RelativeLayout(activity0);
            relativeLayout1.setId(CLS523.MTH7138());
            TextView textView0 = new TextView(activity0);
            this.FLD5174 = textView0;
            textView0.setTextSize(2, 17.0f);
            this.FLD5174.setId(CLS523.MTH7138());
            CLS523.MTH7155(this.FLD5174, this.FLD5170);
            this.FLD5174.setTextColor(CLS522.MTH7109());
            this.FLD5174.setPadding(0, CLS523.MTH7137(10), 0, CLS523.MTH7137(5));
            RelativeLayout.LayoutParams relativeLayout$LayoutParams0 = new RelativeLayout.LayoutParams(-2, -2);
            CLS292.MTH4773(relativeLayout1, relativeLayout$LayoutParams0, 10, 9);
            relativeLayout1.addView(this.FLD5174, relativeLayout$LayoutParams0);
            TextView textView1 = new TextView(activity0);
            this.FLD5175 = textView1;
            textView1.setTextSize(2, 14.0f);
            this.FLD5175.setId(CLS523.MTH7138());
            CLS523.MTH7155(this.FLD5175, this.FLD5171);
            this.FLD5175.setTextColor(CLS522.MTH7116());
            RelativeLayout.LayoutParams relativeLayout$LayoutParams1 = new RelativeLayout.LayoutParams(-2, -2);
            relativeLayout$LayoutParams1.addRule(9, relativeLayout1.getId());
            relativeLayout$LayoutParams1.addRule(3, this.FLD5174.getId());
            this.FLD5175.setPadding(CLS523.MTH7137(5), 0, 0, 0);
            relativeLayout1.addView(this.FLD5175, relativeLayout$LayoutParams1);
            if(TextUtils.isEmpty(this.FLD5171)) {
                this.FLD5175.setVisibility(8);
            }
            TextView textView2 = new TextView(activity0);
            this.FLD5178 = textView2;
            textView2.setTextSize(2, 16.0f);
            this.FLD5178.setId(CLS523.MTH7138());
            CLS523.MTH7155(this.FLD5178, this.FLD5169);
            this.FLD5178.setTextColor(CLS522.MTH7117());
            this.FLD5178.setPadding(0, CLS523.MTH7137(10), 0, CLS523.MTH7137(5));
            RelativeLayout.LayoutParams relativeLayout$LayoutParams2 = new RelativeLayout.LayoutParams(-2, -2);
            CLS292.MTH4773(relativeLayout1, relativeLayout$LayoutParams2, 10, 11);
            relativeLayout1.addView(this.FLD5178, relativeLayout$LayoutParams2);
            if(TextUtils.isEmpty(this.FLD5170) && TextUtils.isEmpty(this.FLD5169)) {
                this.FLD5174.setVisibility(8);
                this.FLD5178.setVisibility(8);
            }
            RelativeLayout.LayoutParams relativeLayout$LayoutParams3 = new RelativeLayout.LayoutParams(-1, -2);
            relativeLayout$LayoutParams3.addRule(9, relativeLayout1.getId());
            relativeLayout$LayoutParams3.addRule(3, this.FLD5175.getId());
            LinearLayout linearLayout1 = new LinearLayout(activity0);
            if(this.FLD5176) {
                linearLayout1.setGravity(17);
            }
            else {
                linearLayout1.setGravity(0x30);
            }
            linearLayout1.setOrientation(1);
            linearLayout1.setPadding(0, CLS523.MTH7137(5), 0, 0);
            if(this.FLD5176) {
                linearLayout$LayoutParams0 = new LinearLayout.LayoutParams(-2, -2);
                linearLayout$LayoutParams0.gravity = 17;
            }
            else {
                linearLayout$LayoutParams0 = new LinearLayout.LayoutParams(-1, -2);
            }
            for(Object object0: this.FLD5172) {
                View view0 = (View)object0;
                if(view0 != null) {
                    view0.setPadding(0, 0, 0, CLS523.MTH7137(3));
                    linearLayout1.addView(view0, linearLayout$LayoutParams0);
                }
            }
            relativeLayout1.addView(linearLayout1, relativeLayout$LayoutParams3);
            RelativeLayout.LayoutParams relativeLayout$LayoutParams4 = new RelativeLayout.LayoutParams(-2, -2);
            CLS292.MTH4773(relativeLayout0, relativeLayout$LayoutParams4, 9, 10);
            relativeLayout0.addView(relativeLayout1, relativeLayout$LayoutParams4);
            linearLayout0.addView(relativeLayout0, new LinearLayout.LayoutParams(-1, -1));
            linearLayout0.setBackgroundColor(CLS522.MTH7118());
            linearLayout0.setVisibility(this.FLD5180);
            this.FLD5173 = linearLayout0;
        }
        return this.FLD5173;
    }
}

