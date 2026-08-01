// Decompiled by JEB v5.42.0.202606242140

package b.ﾞˎ;

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
import b.ʻˑ.CLS18;
import b.ᐧˉ.CLS182;
import b.ᵔʾ.CLS292;
import b.ⁱᵔ.CLS502;
import b.ⁱᵔ.CLS522;
import b.ⁱᵔ.CLS523;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collection;

public final class CLS1620 implements CLS18 {
    public int FLD5216;
    public LinearLayout FLD5217;
    public TextView FLD5218;
    public final CLS534 FLD5219;
    public boolean FLD5220;
    public String FLD5221;
    public String FLD5222;
    public View FLD5223;
    public final WeakReference FLD5224;
    public String FLD5225;
    public TextView FLD5226;
    public TextView FLD5227;

    public CLS1620(Activity activity0) {
        this.FLD5216 = 0;
        this.FLD5224 = new WeakReference(activity0);
        this.FLD5219 = new CLS534(activity0);
    }

    @Override  // b.ʻˑ.CLS18
    public final String getText() {
        return this.FLD5227 == null ? this.FLD5222 : CLS502.MTH6936(this.FLD5227.getText());
    }

    public final void MTH7246(String s) {
        this.FLD5219.MTH7228(s);
    }

    public final void MTH7247(Collection collection0) {
        CLS534 ˈˈ0 = this.FLD5219;
        ˈˈ0.getClass();
        if(collection0 != null && !collection0.isEmpty()) {
            ˈˈ0.FLD5195.clear();
            ˈˈ0.FLD5195.addAll(collection0);
            ˈˈ0.FLD5196.notifyDataSetChanged();
        }
    }

    public final void MTH7248(CLS533 ˈˈ$ᵔʾ0) {
        CLS542 ᐧⁱ0 = new CLS542(this.FLD5219, ˈˈ$ᵔʾ0);
        this.FLD5219.FLD5193.setOnItemSelectedListener(ᐧⁱ0);
    }

    @Override  // b.ʻˑ.CLS18
    public final void MTH798(String s) {
        this.FLD5225 = s;
        CLS523.MTH7155(this.FLD5226, s);
    }

    @Override  // b.ʻˑ.CLS18
    public final void MTH799() {
        this.FLD5217.setBackgroundColor(CLS522.MTH7112());
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
            this.FLD5221 = s4;
            CLS523.MTH7155(this.FLD5218, s4);
        }
        this.FLD5222 = s2;
        CLS523.MTH7155(this.FLD5227, s2);
    }

    @Override  // b.ʻˑ.CLS18
    public final void MTH801(int v) {
        this.FLD5216 = v;
        LinearLayout linearLayout0 = this.FLD5217;
        if(linearLayout0 != null) {
            linearLayout0.setVisibility(v);
        }
        View view0 = this.FLD5223;
        if(view0 != null) {
            view0.setVisibility(v);
        }
    }

    @Override  // b.ʻˑ.CLS18
    public final void MTH802(View view0) {
        this.FLD5223 = view0;
        view0.setVisibility(this.FLD5216);
    }

    public final void MTH7254(String s) {
        CLS534 ˈˈ0 = this.FLD5219;
        if(ˈˈ0 != null) {
            ArrayList arrayList0 = ˈˈ0.FLD5195;
            if(!arrayList0.contains(s)) {
                arrayList0.add(s);
                ˈˈ0.MTH7227(arrayList0.size() - 1);
            }
        }
    }

    @Override  // b.ʻˑ.CLS18
    public final View MTH803() {
        int v3;
        int v2;
        TextView textView4;
        int v1;
        int v;
        TextView textView1;
        if(this.FLD5217 == null) {
            Activity activity0 = (Activity)this.FLD5224.get();
            LinearLayout linearLayout0 = new LinearLayout(activity0);
            RelativeLayout relativeLayout0 = new RelativeLayout(activity0);
            relativeLayout0.setId(CLS523.MTH7138());
            RelativeLayout relativeLayout1 = new RelativeLayout(activity0);
            relativeLayout1.setId(CLS523.MTH7138());
            TextView textView0 = new TextView(activity0);
            this.FLD5227 = textView0;
            textView0.setTextSize(2, 17.0f);
            this.FLD5227.setId(CLS523.MTH7138());
            CLS523.MTH7155(this.FLD5227, this.FLD5222);
            this.FLD5227.setTextColor(CLS522.MTH7109());
            if(this.FLD5220) {
                textView1 = this.FLD5227;
                v = CLS523.MTH7137(3);
                v1 = CLS523.MTH7137(1);
            }
            else {
                textView1 = this.FLD5227;
                v = CLS523.MTH7137(10);
                v1 = CLS523.MTH7137(5);
            }
            textView1.setPadding(0, v, 0, v1);
            RelativeLayout.LayoutParams relativeLayout$LayoutParams0 = new RelativeLayout.LayoutParams(-2, -2);
            CLS292.MTH4773(relativeLayout1, relativeLayout$LayoutParams0, 10, 9);
            relativeLayout1.addView(this.FLD5227, relativeLayout$LayoutParams0);
            TextView textView2 = new TextView(activity0);
            this.FLD5226 = textView2;
            textView2.setTextSize(2, 14.0f);
            this.FLD5226.setId(CLS523.MTH7138());
            CLS523.MTH7155(this.FLD5226, this.FLD5225);
            this.FLD5226.setTextColor(CLS522.MTH7116());
            RelativeLayout.LayoutParams relativeLayout$LayoutParams1 = new RelativeLayout.LayoutParams(-2, -2);
            relativeLayout$LayoutParams1.addRule(9, relativeLayout1.getId());
            relativeLayout$LayoutParams1.addRule(3, this.FLD5227.getId());
            this.FLD5226.setPadding(CLS523.MTH7137(5), 0, 0, 0);
            relativeLayout1.addView(this.FLD5226, relativeLayout$LayoutParams1);
            if(TextUtils.isEmpty(this.FLD5225)) {
                this.FLD5226.setVisibility(8);
            }
            TextView textView3 = new TextView(activity0);
            this.FLD5218 = textView3;
            textView3.setTextSize(2, 16.0f);
            this.FLD5218.setId(CLS523.MTH7138());
            CLS523.MTH7155(this.FLD5218, this.FLD5221);
            this.FLD5218.setTextColor(CLS522.MTH7117());
            if(this.FLD5220) {
                textView4 = this.FLD5218;
                v2 = CLS523.MTH7137(3);
                v3 = CLS523.MTH7137(2);
            }
            else {
                textView4 = this.FLD5218;
                v2 = CLS523.MTH7137(10);
                v3 = CLS523.MTH7137(5);
            }
            textView4.setPadding(0, v2, 0, v3);
            RelativeLayout.LayoutParams relativeLayout$LayoutParams2 = new RelativeLayout.LayoutParams(-2, -2);
            CLS292.MTH4773(relativeLayout1, relativeLayout$LayoutParams2, 10, 11);
            relativeLayout1.addView(this.FLD5218, relativeLayout$LayoutParams2);
            if(TextUtils.isEmpty(this.FLD5222) && TextUtils.isEmpty(this.FLD5221)) {
                this.FLD5227.setVisibility(8);
                this.FLD5218.setVisibility(8);
            }
            boolean z = CLS522.MTH7114();
            CLS534 ˈˈ0 = this.FLD5219;
            if(z) {
                Drawable drawable0 = ˈˈ0.FLD5193.getBackground().getConstantState().newDrawable();
                drawable0.setColorFilter(CLS522.MTH7109(), PorterDuff.Mode.SRC_ATOP);
                CLS523.MTH7152(ˈˈ0.FLD5193, drawable0);
            }
            RelativeLayout.LayoutParams relativeLayout$LayoutParams3 = new RelativeLayout.LayoutParams(-1, -2);
            relativeLayout$LayoutParams3.addRule(9, relativeLayout1.getId());
            relativeLayout$LayoutParams3.addRule(3, this.FLD5226.getId());
            int v4 = CLS523.MTH7137(6);
            int v5 = CLS523.MTH7137(6);
            ˈˈ0.FLD5193.setPadding(v4, 0, v5, 0);
            relativeLayout1.addView(ˈˈ0.FLD5193, relativeLayout$LayoutParams3);
            RelativeLayout.LayoutParams relativeLayout$LayoutParams4 = new RelativeLayout.LayoutParams(-2, -2);
            CLS292.MTH4773(relativeLayout0, relativeLayout$LayoutParams4, 9, 10);
            relativeLayout1.setPadding(0, 0, (this.FLD5220 ? CLS523.MTH7137(2) : CLS523.MTH7137(15)), 0);
            relativeLayout0.addView(relativeLayout1, relativeLayout$LayoutParams4);
            linearLayout0.addView(relativeLayout0, new LinearLayout.LayoutParams(-1, -1));
            linearLayout0.setBackgroundColor(CLS522.MTH7118());
            linearLayout0.setVisibility(this.FLD5216);
            this.FLD5217 = linearLayout0;
        }
        return this.FLD5217;
    }
}

