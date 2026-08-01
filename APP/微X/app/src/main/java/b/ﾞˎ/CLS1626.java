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
import b.ʾᵢ.CLS27;
import b.ᐧˉ.CLS182;
import b.ᵔʾ.CLS292;
import b.ⁱᵔ.CLS502;
import b.ⁱᵔ.CLS518;
import b.ⁱᵔ.CLS522;
import b.ⁱᵔ.CLS523;
import java.lang.ref.WeakReference;

public final class CLS1626 implements CLS18 {
    public boolean FLD5295;
    public String FLD5296;
    public View.OnClickListener FLD5297;
    public final TextView FLD5298;
    public LinearLayout FLD5299;
    public final WeakReference FLD5300;
    public boolean FLD5301;
    public final TextView FLD5302;
    public int FLD5303;
    public final TextView FLD5304;
    public final CLS531 FLD5305;
    public View FLD5306;
    public String FLD5307;
    public String FLD5308;

    // 此方法包含解密的字符串
    public CLS1626(Activity activity0) {
        this.FLD5295 = true;
        this.FLD5303 = 0;
        this.FLD5301 = false;
        this.FLD5300 = new WeakReference(activity0);
        TextView textView0 = new TextView(activity0);
        this.FLD5298 = textView0;
        textView0.setTextColor(CLS522.MTH7109());
        TextView textView1 = new TextView(activity0);
        this.FLD5302 = textView1;
        textView1.setTextColor(CLS522.MTH7117());
        TextView textView2 = new TextView(activity0);
        this.FLD5304 = textView2;
        textView2.setTextColor(CLS522.MTH7116());
        this.FLD5305 = new CLS531(activity0);
        if(CLS27.MTH895().MTH938("preftext_disable_arrow", false)) {
            this.FLD5295 = false;
        }
    }

    @Override  // b.ʻˑ.CLS18
    public final String getText() {
        return this.FLD5298 == null ? this.FLD5308 : CLS502.MTH6936(this.FLD5298.getText());
    }

    public final void MTH7324(View.OnClickListener view$OnClickListener0) {
        this.FLD5297 = view$OnClickListener0;
        LinearLayout linearLayout0 = this.FLD5299;
        if(linearLayout0 != null) {
            linearLayout0.setOnClickListener(view$OnClickListener0);
            CLS523.MTH7152(this.FLD5299, CLS518.MTH7062(CLS522.MTH7118()));
        }
    }

    public final void MTH7325(String s) {
        this.FLD5296 = s;
        CLS523.MTH7155(this.FLD5302, s);
    }

    @Override  // b.ʻˑ.CLS18
    public final void MTH798(String s) {
        this.FLD5307 = s;
        CLS523.MTH7155(this.FLD5304, s);
    }

    @Override  // b.ʻˑ.CLS18
    public final void MTH799() {
        if(this.FLD5297 != null) {
            CLS523.MTH7152(this.FLD5299, CLS518.MTH7062(CLS522.MTH7112()));
            return;
        }
        this.FLD5299.setBackgroundColor(CLS522.MTH7112());
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
        if(!TextUtils.isEmpty(s4)) {
            this.MTH7325(s4);
        }
        this.FLD5308 = s2;
        CLS523.MTH7155(this.FLD5298, s2);
    }

    @Override  // b.ʻˑ.CLS18
    public final void MTH801(int v) {
        this.FLD5303 = v;
        LinearLayout linearLayout0 = this.FLD5299;
        if(linearLayout0 != null) {
            linearLayout0.setVisibility(v);
        }
        View view0 = this.FLD5306;
        if(view0 != null) {
            view0.setVisibility(v);
        }
    }

    @Override  // b.ʻˑ.CLS18
    public final void MTH802(View view0) {
        this.FLD5306 = view0;
        view0.setVisibility(this.FLD5303);
    }

    public final void MTH7331() {
        this.FLD5295 = false;
    }

    @Override  // b.ʻˑ.CLS18
    public final View MTH803() {
        int v3;
        int v2;
        int v1;
        int v;
        if(this.FLD5299 == null) {
            Activity activity0 = (Activity)this.FLD5300.get();
            LinearLayout linearLayout0 = new LinearLayout(activity0);
            RelativeLayout relativeLayout0 = new RelativeLayout(activity0);
            relativeLayout0.setId(CLS523.MTH7138());
            RelativeLayout relativeLayout1 = new RelativeLayout(activity0);
            relativeLayout1.setId(CLS523.MTH7138());
            TextView textView0 = this.FLD5298;
            textView0.setTextSize(2, 17.0f);
            textView0.setId(CLS523.MTH7138());
            CLS523.MTH7155(textView0, this.FLD5308);
            if(this.FLD5301) {
                v = CLS523.MTH7137(3);
                v1 = CLS523.MTH7137(1);
            }
            else {
                v = CLS523.MTH7137(10);
                v1 = CLS523.MTH7137(5);
            }
            textView0.setPadding(0, v, 0, v1);
            RelativeLayout.LayoutParams relativeLayout$LayoutParams0 = new RelativeLayout.LayoutParams(-2, -2);
            CLS292.MTH4773(relativeLayout1, relativeLayout$LayoutParams0, 10, 9);
            relativeLayout1.addView(textView0, relativeLayout$LayoutParams0);
            TextView textView1 = this.FLD5304;
            textView1.setTextSize(2, 14.0f);
            textView1.setId(CLS523.MTH7138());
            CLS523.MTH7155(textView1, this.FLD5307);
            RelativeLayout.LayoutParams relativeLayout$LayoutParams1 = new RelativeLayout.LayoutParams(-2, -2);
            relativeLayout$LayoutParams1.addRule(9, relativeLayout1.getId());
            relativeLayout$LayoutParams1.addRule(3, textView0.getId());
            textView1.setPadding(CLS523.MTH7137(5), 0, 0, 0);
            relativeLayout1.addView(textView1, relativeLayout$LayoutParams1);
            if(TextUtils.isEmpty(this.FLD5307)) {
                textView1.setVisibility(8);
            }
            TextView textView2 = this.FLD5302;
            textView2.setTextSize(2, 16.0f);
            textView2.setId(CLS523.MTH7138());
            CLS523.MTH7155(textView2, this.FLD5296);
            if(this.FLD5301) {
                v2 = CLS523.MTH7137(3);
                v3 = CLS523.MTH7137(2);
            }
            else {
                v2 = CLS523.MTH7137(10);
                v3 = CLS523.MTH7137(5);
            }
            textView2.setPadding(0, v2, 0, v3);
            RelativeLayout.LayoutParams relativeLayout$LayoutParams2 = new RelativeLayout.LayoutParams(-2, -2);
            CLS292.MTH4773(relativeLayout1, relativeLayout$LayoutParams2, 10, 11);
            relativeLayout1.addView(textView2, relativeLayout$LayoutParams2);
            if(TextUtils.isEmpty(this.FLD5308) && TextUtils.isEmpty(this.FLD5296)) {
                textView0.setVisibility(8);
                textView2.setVisibility(8);
            }
            RelativeLayout.LayoutParams relativeLayout$LayoutParams3 = new RelativeLayout.LayoutParams(-2, -2);
            relativeLayout$LayoutParams3.addRule(9, relativeLayout0.getId());
            relativeLayout$LayoutParams3.addRule(10, relativeLayout0.getId());
            relativeLayout1.setPadding(0, 0, CLS523.MTH7137(15), 0);
            int v4 = CLS523.MTH7138();
            CLS531 ˆٴ0 = this.FLD5305;
            ˆٴ0.setId(v4);
            ˆٴ0.setColor(CLS522.MTH7117());
            RelativeLayout.LayoutParams relativeLayout$LayoutParams4 = new RelativeLayout.LayoutParams(CLS523.MTH7137(18), CLS523.MTH7137(18));
            relativeLayout$LayoutParams4.addRule(11, relativeLayout0.getId());
            relativeLayout$LayoutParams4.addRule(13, relativeLayout0.getId());
            relativeLayout$LayoutParams4.setMargins(0, 0, CLS523.MTH7137(10), 0);
            if(this.FLD5295) {
                relativeLayout$LayoutParams3.setMargins(0, 0, CLS523.MTH7137(20), 0);
                relativeLayout0.addView(relativeLayout1, relativeLayout$LayoutParams3);
                relativeLayout0.addView(ˆٴ0, relativeLayout$LayoutParams4);
            }
            else {
                relativeLayout0.addView(relativeLayout1, relativeLayout$LayoutParams3);
            }
            linearLayout0.addView(relativeLayout0, new LinearLayout.LayoutParams(-1, -1));
            View.OnClickListener view$OnClickListener0 = this.FLD5297;
            if(view$OnClickListener0 == null) {
                linearLayout0.setBackgroundColor(CLS522.MTH7118());
            }
            else {
                linearLayout0.setOnClickListener(view$OnClickListener0);
                CLS523.MTH7152(linearLayout0, CLS518.MTH7062(CLS522.MTH7118()));
            }
            linearLayout0.setVisibility(this.FLD5303);
            this.FLD5299 = linearLayout0;
        }
        return this.FLD5299;
    }
}

