// Decompiled by JEB v5.42.0.202606242140

package b.ﾞˎ;

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
import b.ʻˑ.CLS18;
import b.ᐧˉ.CLS182;
import b.ᵔʾ.CLS292;
import b.ⁱᵔ.CLS502;
import b.ⁱᵔ.CLS522;
import b.ⁱᵔ.CLS523;
import java.lang.ref.WeakReference;

public final class CLS1628 implements CLS18 {
    public String FLD5312;
    public String FLD5313;
    public String FLD5314;
    public final SeekBar FLD5315;
    public LinearLayout FLD5316;
    public TextView FLD5317;
    public View.OnClickListener FLD5318;
    public TextView FLD5319;
    public boolean FLD5320;
    public final WeakReference FLD5321;
    public TextView FLD5322;
    public View FLD5323;
    public int FLD5324;

    public CLS1628(Activity activity0) {
        this.FLD5324 = 0;
        this.FLD5320 = false;
        this.FLD5321 = new WeakReference(activity0);
        this.FLD5315 = new SeekBar(activity0);
    }

    @Override  // b.ʻˑ.CLS18
    public final String getText() {
        return this.FLD5317 == null ? this.FLD5313 : CLS502.MTH6936(this.FLD5317.getText());
    }

    @Override  // b.ʻˑ.CLS18
    public final void MTH798(String s) {
        this.FLD5314 = s;
        CLS523.MTH7155(this.FLD5319, s);
    }

    @Override  // b.ʻˑ.CLS18
    public final void MTH799() {
        this.FLD5316.setBackgroundColor(CLS522.MTH7112());
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
            s7.trim();
            s3 = s1.trim();
            s2 = s5.trim();
            s4 = s6.trim();
        }
        if(!TextUtils.isEmpty(s3)) {
            this.MTH798(s3);
        }
        if(TextUtils.isEmpty(s4)) {
            this.MTH7345(s4);
        }
        this.FLD5313 = s2;
        CLS523.MTH7155(this.FLD5317, s2);
    }

    @Override  // b.ʻˑ.CLS18
    public final void MTH801(int v) {
        this.FLD5324 = v;
        LinearLayout linearLayout0 = this.FLD5316;
        if(linearLayout0 != null) {
            linearLayout0.setVisibility(v);
        }
        View view0 = this.FLD5323;
        if(view0 != null) {
            view0.setVisibility(v);
        }
    }

    @Override  // b.ʻˑ.CLS18
    public final void MTH802(View view0) {
        this.FLD5323 = view0;
        view0.setVisibility(this.FLD5324);
    }

    public final void MTH7345(String s) {
        this.FLD5312 = s;
        CLS523.MTH7155(this.FLD5322, s);
    }

    @Override  // b.ʻˑ.CLS18
    public final View MTH803() {
        if(this.FLD5316 == null) {
            Activity activity0 = (Activity)this.FLD5321.get();
            LinearLayout linearLayout0 = new LinearLayout(activity0);
            RelativeLayout relativeLayout0 = new RelativeLayout(activity0);
            relativeLayout0.setId(CLS523.MTH7138());
            RelativeLayout relativeLayout1 = new RelativeLayout(activity0);
            relativeLayout1.setId(CLS523.MTH7138());
            TextView textView0 = new TextView(activity0);
            this.FLD5317 = textView0;
            textView0.setTextSize(2, 17.0f);
            this.FLD5317.setId(CLS523.MTH7138());
            CLS523.MTH7155(this.FLD5317, this.FLD5313);
            this.FLD5317.setTextColor(CLS522.MTH7109());
            if(this.FLD5320) {
                this.FLD5317.setPadding(0, CLS523.MTH7137(1), 0, 0);
            }
            else {
                this.FLD5317.setPadding(0, CLS523.MTH7137(10), 0, CLS523.MTH7137(5));
            }
            RelativeLayout.LayoutParams relativeLayout$LayoutParams0 = new RelativeLayout.LayoutParams(-2, -2);
            CLS292.MTH4773(relativeLayout1, relativeLayout$LayoutParams0, 10, 9);
            relativeLayout1.addView(this.FLD5317, relativeLayout$LayoutParams0);
            TextView textView1 = new TextView(activity0);
            this.FLD5319 = textView1;
            textView1.setTextSize(2, 14.0f);
            this.FLD5319.setId(CLS523.MTH7138());
            CLS523.MTH7155(this.FLD5319, this.FLD5314);
            this.FLD5319.setTextColor(CLS522.MTH7116());
            RelativeLayout.LayoutParams relativeLayout$LayoutParams1 = new RelativeLayout.LayoutParams(-2, -2);
            relativeLayout$LayoutParams1.addRule(9, relativeLayout1.getId());
            relativeLayout$LayoutParams1.addRule(3, this.FLD5317.getId());
            this.FLD5319.setPadding(CLS523.MTH7137(5), 0, 0, 0);
            relativeLayout1.addView(this.FLD5319, relativeLayout$LayoutParams1);
            if(TextUtils.isEmpty(this.FLD5314)) {
                this.FLD5319.setVisibility(8);
            }
            TextView textView2 = new TextView(activity0);
            this.FLD5322 = textView2;
            textView2.setTextSize(2, 16.0f);
            this.FLD5322.setId(CLS523.MTH7138());
            CLS523.MTH7155(this.FLD5322, this.FLD5312);
            this.FLD5322.setTextColor(CLS522.MTH7117());
            if(this.FLD5320) {
                this.FLD5322.setPadding(0, CLS523.MTH7137(1), 0, 0);
            }
            else {
                this.FLD5322.setPadding(0, CLS523.MTH7137(10), 0, CLS523.MTH7137(5));
            }
            View.OnClickListener view$OnClickListener0 = this.FLD5318;
            if(view$OnClickListener0 != null) {
                this.FLD5322.setOnClickListener(view$OnClickListener0);
            }
            RelativeLayout.LayoutParams relativeLayout$LayoutParams2 = new RelativeLayout.LayoutParams(-2, -2);
            CLS292.MTH4773(relativeLayout1, relativeLayout$LayoutParams2, 10, 11);
            relativeLayout1.addView(this.FLD5322, relativeLayout$LayoutParams2);
            boolean z = TextUtils.isEmpty(this.FLD5313);
            SeekBar seekBar0 = this.FLD5315;
            if(z && TextUtils.isEmpty(this.FLD5312)) {
                this.FLD5317.setVisibility(8);
                this.FLD5322.setVisibility(8);
                if(!this.FLD5320) {
                    seekBar0.setPadding(0, CLS523.MTH7137(10), 0, CLS523.MTH7137(5));
                }
            }
            else if(!this.FLD5320) {
                seekBar0.setPadding(0, CLS523.MTH7137(5), 0, CLS523.MTH7137(3));
            }
            RelativeLayout.LayoutParams relativeLayout$LayoutParams3 = new RelativeLayout.LayoutParams(-1, -2);
            relativeLayout$LayoutParams3.addRule(9, relativeLayout1.getId());
            relativeLayout$LayoutParams3.addRule(3, this.FLD5319.getId());
            seekBar0.setId(CLS523.MTH7138());
            relativeLayout1.addView(seekBar0, relativeLayout$LayoutParams3);
            RelativeLayout.LayoutParams relativeLayout$LayoutParams4 = new RelativeLayout.LayoutParams(-2, -2);
            CLS292.MTH4773(relativeLayout0, relativeLayout$LayoutParams4, 9, 10);
            relativeLayout0.addView(relativeLayout1, relativeLayout$LayoutParams4);
            linearLayout0.addView(relativeLayout0, new LinearLayout.LayoutParams(-1, -1));
            linearLayout0.setBackgroundColor(CLS522.MTH7118());
            linearLayout0.setVisibility(this.FLD5324);
            this.FLD5316 = linearLayout0;
        }
        return this.FLD5316;
    }
}

