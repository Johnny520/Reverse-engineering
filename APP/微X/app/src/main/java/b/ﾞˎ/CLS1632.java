// Decompiled by JEB v5.42.0.202606242140

package b.ﾞˎ;

import android.app.Activity;
import android.graphics.Color;
import android.text.TextUtils;
import android.view.View;
import android.widget.LinearLayout.LayoutParams;
import android.widget.LinearLayout;
import android.widget.TextView;
import b.ʻˑ.CLS18;
import b.ʾᵢ.CLS27;
import b.ᐧˉ.CLS182;
import b.ⁱˉ.CLS370;
import b.ⁱᵔ.CLS502;
import b.ⁱᵔ.CLS522;
import b.ⁱᵔ.CLS523;
import java.lang.ref.WeakReference;
import java.util.ArrayList;

public final class CLS1632 implements CLS18 {
    public TextView FLD5390;
    public final ArrayList FLD5391;
    public LinearLayout FLD5392;
    public String FLD5393;
    public final WeakReference FLD5394;
    public String FLD5395;
    public TextView FLD5396;
    public int FLD5397;

    public CLS1632(Activity activity0) {
        this.FLD5397 = 0;
        this.FLD5394 = new WeakReference(activity0);
        this.FLD5391 = new ArrayList();
    }

    @Override  // b.ʻˑ.CLS18
    public final String getText() {
        return this.FLD5396 == null ? this.FLD5393 : CLS502.MTH6936(this.FLD5396.getText());
    }

    @Override  // b.ʻˑ.CLS18
    public final void MTH798(String s) {
        this.FLD5395 = s;
        CLS523.MTH7155(this.FLD5390, s);
    }

    @Override  // b.ʻˑ.CLS18
    public final void MTH799() {
        this.FLD5392.setBackgroundColor(CLS522.MTH7112());
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
        this.FLD5393 = s2;
        CLS523.MTH7155(this.FLD5396, s2);
    }

    @Override  // b.ʻˑ.CLS18
    public final void MTH801(int v) {
        this.FLD5397 = v;
        LinearLayout linearLayout0 = this.FLD5392;
        if(linearLayout0 != null) {
            linearLayout0.setVisibility(v);
        }
    }

    @Override  // b.ʻˑ.CLS18
    public final void MTH802(View view0) {
    }

    @Override  // b.ʻˑ.CLS18
    public final View MTH803() {
        View view0;
        if(this.FLD5392 == null) {
            Activity activity0 = (Activity)this.FLD5394.get();
            LinearLayout linearLayout0 = new LinearLayout(activity0);
            linearLayout0.setGravity(0x30);
            linearLayout0.setOrientation(1);
            TextView textView0 = new TextView(activity0);
            this.FLD5396 = textView0;
            CLS523.MTH7155(textView0, this.FLD5393);
            this.FLD5396.setTextSize(2, 14.0f);
            this.FLD5396.setTextColor(Color.parseColor(CLS370.MTH5289((CLS522.MTH7114() ? 0x38EA890E2B3CD335L : 4101241138981950261L))));
            LinearLayout.LayoutParams linearLayout$LayoutParams0 = new LinearLayout.LayoutParams(-1, -2);
            linearLayout$LayoutParams0.setMargins(CLS523.MTH7137(4), 0, 0, 0);
            linearLayout0.addView(this.FLD5396, linearLayout$LayoutParams0);
            if(TextUtils.isEmpty(this.FLD5393)) {
                this.FLD5396.setVisibility(8);
            }
            TextView textView1 = new TextView(activity0);
            this.FLD5390 = textView1;
            CLS523.MTH7155(textView1, this.FLD5395);
            this.FLD5390.setTextSize(2, 12.0f);
            this.FLD5390.setBackgroundColor(CLS522.MTH7118());
            this.FLD5390.setTextColor(CLS522.MTH7116());
            LinearLayout.LayoutParams linearLayout$LayoutParams1 = new LinearLayout.LayoutParams(-1, -2);
            this.FLD5390.setPadding(CLS523.MTH7137(10), 0, 0, 0);
            linearLayout0.addView(this.FLD5390, linearLayout$LayoutParams1);
            if(TextUtils.isEmpty(this.FLD5395)) {
                this.FLD5390.setVisibility(8);
            }
            LinearLayout.LayoutParams linearLayout$LayoutParams2 = new LinearLayout.LayoutParams(-1, -2);
            for(Object object0: this.FLD5391) {
                try {
                    if(object0 instanceof CLS18) {
                        view0 = ((CLS18)object0).MTH803();
                    }
                    else {
                        view0 = object0 instanceof View ? ((View)object0) : null;
                    }
                    if(view0 == null) {
                        continue;
                    }
                    linearLayout0.addView(view0, linearLayout$LayoutParams2);
                }
                catch(Throwable throwable0) {
                    CLS27.MTH893(throwable0);
                }
            }
            linearLayout0.setVisibility(this.FLD5397);
            this.FLD5392 = linearLayout0;
        }
        return this.FLD5392;
    }
}

