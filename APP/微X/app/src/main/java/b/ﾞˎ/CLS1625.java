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
import android.widget.TextView;
import b.ʻˑ.CLS18;
import b.ᐧˉ.CLS182;
import b.ⁱᵔ.CLS502;
import b.ⁱᵔ.CLS518;
import b.ⁱᵔ.CLS522;
import b.ⁱᵔ.CLS523;
import java.lang.ref.WeakReference;

public final class CLS1625 implements CLS18 {
    public View FLD5285;
    public TextView FLD5286;
    public boolean FLD5287;
    public final WeakReference FLD5288;
    public LinearLayout FLD5289;
    public String FLD5290;
    public String FLD5291;
    public View.OnClickListener FLD5292;
    public TextView FLD5293;
    public int FLD5294;

    public CLS1625(Activity activity0) {
        this.FLD5294 = 0;
        this.FLD5287 = true;
        this.FLD5288 = new WeakReference(activity0);
    }

    @Override  // b.ʻˑ.CLS18
    public final String getText() {
        return this.FLD5293 == null ? this.FLD5291 : CLS502.MTH6936(this.FLD5293.getText());
    }

    @Override  // b.ʻˑ.CLS18
    public final void MTH798(String s) {
        this.FLD5290 = s;
        CLS523.MTH7155(this.FLD5286, s);
    }

    @Override  // b.ʻˑ.CLS18
    public final void MTH799() {
        if(this.FLD5292 != null) {
            CLS523.MTH7152(this.FLD5289, CLS518.MTH7062(CLS522.MTH7112()));
            return;
        }
        this.FLD5289.setBackgroundColor(CLS522.MTH7112());
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
            s5.trim();
            s6.trim();
            s3 = s1.trim();
            s2 = s4.trim();
        }
        if(!TextUtils.isEmpty(s3)) {
            this.MTH798(s3);
        }
        this.FLD5291 = s2;
        CLS523.MTH7155(this.FLD5293, s2);
    }

    @Override  // b.ʻˑ.CLS18
    public final void MTH801(int v) {
        this.FLD5294 = v;
        LinearLayout linearLayout0 = this.FLD5289;
        if(linearLayout0 != null) {
            linearLayout0.setVisibility(v);
        }
        View view0 = this.FLD5285;
        if(view0 != null) {
            view0.setVisibility(v);
        }
    }

    @Override  // b.ʻˑ.CLS18
    public final void MTH802(View view0) {
        this.FLD5285 = view0;
        view0.setVisibility(this.FLD5294);
    }

    public final void MTH7320(View.OnClickListener view$OnClickListener0) {
        this.FLD5292 = view$OnClickListener0;
        LinearLayout linearLayout0 = this.FLD5289;
        if(linearLayout0 != null) {
            linearLayout0.setOnClickListener(view$OnClickListener0);
            CLS523.MTH7152(this.FLD5289, CLS518.MTH7062(CLS522.MTH7118()));
        }
    }

    @Override  // b.ʻˑ.CLS18
    public final View MTH803() {
        if(this.FLD5289 == null) {
            Activity activity0 = (Activity)this.FLD5288.get();
            LinearLayout linearLayout0 = new LinearLayout(activity0);
            linearLayout0.setGravity(0x30);
            linearLayout0.setOrientation(1);
            RelativeLayout relativeLayout0 = new RelativeLayout(activity0);
            relativeLayout0.setId(CLS523.MTH7138());
            RelativeLayout relativeLayout1 = new RelativeLayout(activity0);
            relativeLayout1.setId(CLS523.MTH7138());
            TextView textView0 = new TextView(activity0);
            this.FLD5293 = textView0;
            textView0.setTextSize(2, 17.0f);
            this.FLD5293.setId(CLS523.MTH7138());
            CLS523.MTH7155(this.FLD5293, this.FLD5291);
            this.FLD5293.setTextColor(CLS522.MTH7109());
            this.FLD5293.setGravity(1);
            this.FLD5293.setPadding(0, CLS523.MTH7137(10), 0, CLS523.MTH7137(5));
            RelativeLayout.LayoutParams relativeLayout$LayoutParams0 = new RelativeLayout.LayoutParams(-1, -2);
            relativeLayout$LayoutParams0.addRule(14, relativeLayout1.getId());
            relativeLayout1.addView(this.FLD5293, relativeLayout$LayoutParams0);
            TextView textView1 = new TextView(activity0);
            this.FLD5286 = textView1;
            textView1.setTextSize(2, 14.0f);
            this.FLD5286.setId(CLS523.MTH7138());
            CLS523.MTH7155(this.FLD5286, this.FLD5290);
            this.FLD5286.setGravity(1);
            this.FLD5286.setTextColor(CLS522.MTH7116());
            RelativeLayout.LayoutParams relativeLayout$LayoutParams1 = new RelativeLayout.LayoutParams(-1, -2);
            relativeLayout$LayoutParams1.addRule(14, relativeLayout1.getId());
            relativeLayout$LayoutParams1.addRule(3, this.FLD5293.getId());
            relativeLayout1.addView(this.FLD5286, relativeLayout$LayoutParams1);
            if(TextUtils.isEmpty(this.FLD5290)) {
                this.FLD5286.setVisibility(8);
            }
            RelativeLayout.LayoutParams relativeLayout$LayoutParams2 = new RelativeLayout.LayoutParams(-1, -2);
            relativeLayout$LayoutParams2.addRule(13, relativeLayout0.getId());
            relativeLayout0.addView(relativeLayout1, relativeLayout$LayoutParams2);
            linearLayout0.addView(relativeLayout0, new LinearLayout.LayoutParams(-1, -2));
            View.OnClickListener view$OnClickListener0 = this.FLD5292;
            if(view$OnClickListener0 == null) {
                linearLayout0.setBackgroundColor(CLS522.MTH7118());
            }
            else {
                linearLayout0.setOnClickListener(view$OnClickListener0);
                CLS523.MTH7152(linearLayout0, CLS518.MTH7062(CLS522.MTH7118()));
            }
            linearLayout0.setVisibility(this.FLD5294);
            linearLayout0.setActivated(this.FLD5287);
            this.FLD5289 = linearLayout0;
        }
        return this.FLD5289;
    }
}

