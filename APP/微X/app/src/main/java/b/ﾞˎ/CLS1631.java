// Decompiled by JEB v5.42.0.202606242140

package b.ﾞˎ;

import android.app.Activity;
import android.text.TextUtils;
import android.view.View;
import android.widget.CompoundButton.OnCheckedChangeListener;
import android.widget.LinearLayout.LayoutParams;
import android.widget.LinearLayout;
import android.widget.RelativeLayout.LayoutParams;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.ToggleButton;
import b.ʻˑ.CLS18;
import b.ᐧˉ.CLS182;
import b.ᵔʾ.CLS292;
import b.ⁱᵔ.CLS502;
import b.ⁱᵔ.CLS522;
import b.ⁱᵔ.CLS523;
import java.lang.ref.WeakReference;

public final class CLS1631 implements CLS18 {
    public View FLD5380;
    public ToggleButton FLD5381;
    public TextView FLD5382;
    public final WeakReference FLD5383;
    public boolean FLD5384;
    public String FLD5385;
    public String FLD5386;
    public CompoundButton.OnCheckedChangeListener FLD5387;
    public int FLD5388;
    public LinearLayout FLD5389;

    public CLS1631(Activity activity0) {
        this.FLD5384 = false;
        this.FLD5388 = 0;
        this.FLD5383 = new WeakReference(activity0);
    }

    @Override  // b.ʻˑ.CLS18
    public final String getText() {
        return this.FLD5381 == null ? this.FLD5386 : CLS502.MTH6936(this.FLD5381.getText());
    }

    @Override  // b.ʻˑ.CLS18
    public final void MTH798(String s) {
        this.FLD5385 = s;
        CLS523.MTH7155(this.FLD5382, s);
    }

    @Override  // b.ʻˑ.CLS18
    public final void MTH799() {
        this.FLD5389.setBackgroundColor(CLS522.MTH7112());
    }

    // 此方法包含解密的字符串
    @Override  // b.ʻˑ.CLS18
    public final void MTH800(String s) {
        String s1 = "";
        String s2 = "";
        String s3 = "";
        new String("");
        new String("");
        if(!TextUtils.isEmpty(s)) {
            if(s.contains("[[") && s.contains("]]")) {
                int v = s.indexOf("[[");
                int v1 = s.lastIndexOf("]]");
                s1 = s.substring(v + 2, v1);
                s = CLS182.MTH3495(s, 0, v, new StringBuilder(), v1, 2);
            }
            String s4 = s;
            String s5 = "";
            if(s4.contains("{") && s4.contains("}")) {
                int v2 = s4.indexOf("{");
                int v3 = s4.lastIndexOf("}");
                s5 = s4.substring(v2 + 1, v3);
                s4 = CLS182.MTH3495(s4, 0, v2, new StringBuilder(), v3, 1);
            }
            String s6 = "";
            if(s4.contains("((") && s4.contains("))")) {
                int v4 = s4.indexOf("((");
                int v5 = s4.lastIndexOf("))");
                s6 = s4.substring(v4 + 2, v5);
                s4 = CLS182.MTH3495(s4, 0, v4, new StringBuilder(), v5, 2);
            }
            s5.getClass();
            s6.getClass();
            s3 = s1.trim();
            s2 = s4.trim();
        }
        if(!TextUtils.isEmpty(s3)) {
            this.MTH798(s3);
        }
        this.FLD5386 = s2;
        CLS523.MTH7155(this.FLD5381, s2);
    }

    @Override  // b.ʻˑ.CLS18
    public final void MTH801(int v) {
        this.FLD5388 = v;
        ToggleButton toggleButton0 = this.FLD5381;
        if(toggleButton0 != null) {
            toggleButton0.setVisibility(v);
        }
        View view0 = this.FLD5380;
        if(view0 != null) {
            view0.setVisibility(v);
        }
    }

    @Override  // b.ʻˑ.CLS18
    public final void MTH802(View view0) {
        this.FLD5380 = view0;
        view0.setVisibility(this.FLD5388);
    }

    @Override  // b.ʻˑ.CLS18
    public final View MTH803() {
        if(this.FLD5389 == null) {
            Activity activity0 = (Activity)this.FLD5383.get();
            LinearLayout linearLayout0 = new LinearLayout(activity0);
            RelativeLayout relativeLayout0 = new RelativeLayout(activity0);
            relativeLayout0.setId(CLS523.MTH7138());
            RelativeLayout relativeLayout1 = new RelativeLayout(activity0);
            relativeLayout1.setId(CLS523.MTH7138());
            ToggleButton toggleButton0 = new ToggleButton(activity0);
            this.FLD5381 = toggleButton0;
            toggleButton0.setTextSize(2, 17.0f);
            this.FLD5381.setId(CLS523.MTH7138());
            CLS523.MTH7155(this.FLD5381, this.FLD5386);
            this.FLD5381.setTextColor(CLS522.MTH7109());
            this.FLD5381.setChecked(this.FLD5384);
            this.FLD5381.setOnCheckedChangeListener(this.FLD5387);
            this.FLD5381.setPadding(0, CLS523.MTH7137(10), 0, CLS523.MTH7137(5));
            this.FLD5381.setEnabled(true);
            RelativeLayout.LayoutParams relativeLayout$LayoutParams0 = new RelativeLayout.LayoutParams(-1, -2);
            CLS292.MTH4773(relativeLayout1, relativeLayout$LayoutParams0, 10, 9);
            relativeLayout1.addView(this.FLD5381, relativeLayout$LayoutParams0);
            TextView textView0 = new TextView(activity0);
            this.FLD5382 = textView0;
            textView0.setTextSize(2, 14.0f);
            this.FLD5382.setId(CLS523.MTH7138());
            CLS523.MTH7155(this.FLD5382, this.FLD5385);
            this.FLD5382.setTextColor(CLS522.MTH7116());
            RelativeLayout.LayoutParams relativeLayout$LayoutParams1 = new RelativeLayout.LayoutParams(-2, -2);
            relativeLayout$LayoutParams1.addRule(9, relativeLayout1.getId());
            relativeLayout$LayoutParams1.addRule(3, this.FLD5381.getId());
            relativeLayout1.addView(this.FLD5382, relativeLayout$LayoutParams1);
            if(TextUtils.isEmpty(this.FLD5385)) {
                this.FLD5382.setVisibility(8);
            }
            RelativeLayout.LayoutParams relativeLayout$LayoutParams2 = new RelativeLayout.LayoutParams(-2, -2);
            CLS292.MTH4773(relativeLayout0, relativeLayout$LayoutParams2, 9, 10);
            relativeLayout0.addView(relativeLayout1, relativeLayout$LayoutParams2);
            linearLayout0.addView(relativeLayout0, new LinearLayout.LayoutParams(-1, -1));
            linearLayout0.setBackgroundColor(CLS522.MTH7118());
            linearLayout0.setVisibility(this.FLD5388);
            this.FLD5389 = linearLayout0;
        }
        return this.FLD5389;
    }
}

