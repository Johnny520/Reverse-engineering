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
import android.widget.Switch;
import android.widget.TextView;
import b.ʻˑ.CLS18;
import b.ᐧˉ.CLS182;
import b.ᵔʾ.CLS292;
import b.ⁱᵔ.CLS502;
import b.ⁱᵔ.CLS522;
import b.ⁱᵔ.CLS523;
import java.lang.ref.WeakReference;

public final class CLS1635 implements CLS18 {
    public boolean FLD5426;
    public Switch FLD5427;
    public TextView FLD5428;
    public final WeakReference FLD5429;
    public View FLD5430;
    public boolean FLD5431;
    public String FLD5432;
    public String FLD5433;
    public CompoundButton.OnCheckedChangeListener FLD5434;
    public int FLD5435;
    public LinearLayout FLD5436;

    public CLS1635(Activity activity0) {
        this.FLD5431 = false;
        this.FLD5435 = 0;
        this.FLD5426 = false;
        this.FLD5429 = new WeakReference(activity0);
    }

    @Override  // b.ʻˑ.CLS18
    public final String getText() {
        return this.FLD5427 == null ? this.FLD5433 : CLS502.MTH6936(this.FLD5427.getText());
    }

    public final void MTH7437(boolean z) {
        this.FLD5431 = z;
        Switch switch0 = this.FLD5427;
        if(switch0 != null) {
            switch0.setChecked(z);
        }
    }

    public final void MTH7438(CompoundButton.OnCheckedChangeListener compoundButton$OnCheckedChangeListener0) {
        this.FLD5434 = compoundButton$OnCheckedChangeListener0;
        Switch switch0 = this.FLD5427;
        if(switch0 != null) {
            switch0.setOnCheckedChangeListener(compoundButton$OnCheckedChangeListener0);
        }
    }

    @Override  // b.ʻˑ.CLS18
    public final void MTH798(String s) {
        this.FLD5432 = s;
        CLS523.MTH7155(this.FLD5428, s);
    }

    @Override  // b.ʻˑ.CLS18
    public final void MTH799() {
        this.FLD5436.setBackgroundColor(CLS522.MTH7112());
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
        this.FLD5433 = s2;
        CLS523.MTH7155(this.FLD5427, s2);
    }

    @Override  // b.ʻˑ.CLS18
    public final void MTH801(int v) {
        this.FLD5435 = v;
        LinearLayout linearLayout0 = this.FLD5436;
        if(linearLayout0 != null) {
            linearLayout0.setVisibility(v);
        }
        View view0 = this.FLD5430;
        if(view0 != null) {
            view0.setVisibility(v);
        }
    }

    @Override  // b.ʻˑ.CLS18
    public final void MTH802(View view0) {
        this.FLD5430 = view0;
        view0.setVisibility(this.FLD5435);
    }

    public final boolean MTH7444() {
        return this.FLD5427 == null ? this.FLD5431 : this.FLD5427.isChecked();
    }

    @Override  // b.ʻˑ.CLS18
    public final View MTH803() {
        int v1;
        int v;
        Switch switch1;
        if(this.FLD5436 == null) {
            Activity activity0 = (Activity)this.FLD5429.get();
            LinearLayout linearLayout0 = new LinearLayout(activity0);
            RelativeLayout relativeLayout0 = new RelativeLayout(activity0);
            relativeLayout0.setId(CLS523.MTH7138());
            RelativeLayout relativeLayout1 = new RelativeLayout(activity0);
            relativeLayout1.setId(CLS523.MTH7138());
            Switch switch0 = new Switch(activity0);
            this.FLD5427 = switch0;
            switch0.setTextSize(2, 17.0f);
            this.FLD5427.setId(CLS523.MTH7138());
            CLS523.MTH7155(this.FLD5427, this.FLD5433);
            this.FLD5427.setTextColor(CLS522.MTH7109());
            this.FLD5427.setChecked(this.FLD5431);
            this.FLD5427.setOnCheckedChangeListener(this.FLD5434);
            if(this.FLD5426) {
                switch1 = this.FLD5427;
                v = CLS523.MTH7137(3);
                v1 = CLS523.MTH7137(1);
            }
            else {
                switch1 = this.FLD5427;
                v = CLS523.MTH7137(10);
                v1 = CLS523.MTH7137(5);
            }
            switch1.setPadding(0, v, 0, v1);
            this.FLD5427.setEnabled(true);
            RelativeLayout.LayoutParams relativeLayout$LayoutParams0 = new RelativeLayout.LayoutParams(-1, -2);
            CLS292.MTH4773(relativeLayout1, relativeLayout$LayoutParams0, 10, 9);
            relativeLayout1.addView(this.FLD5427, relativeLayout$LayoutParams0);
            TextView textView0 = new TextView(activity0);
            this.FLD5428 = textView0;
            textView0.setTextSize(2, 14.0f);
            this.FLD5428.setId(CLS523.MTH7138());
            CLS523.MTH7155(this.FLD5428, this.FLD5432);
            this.FLD5428.setTextColor(CLS522.MTH7116());
            RelativeLayout.LayoutParams relativeLayout$LayoutParams1 = new RelativeLayout.LayoutParams(-2, -2);
            relativeLayout$LayoutParams1.addRule(9, relativeLayout1.getId());
            relativeLayout$LayoutParams1.addRule(3, this.FLD5427.getId());
            relativeLayout1.addView(this.FLD5428, relativeLayout$LayoutParams1);
            if(TextUtils.isEmpty(this.FLD5432)) {
                this.FLD5428.setVisibility(8);
            }
            RelativeLayout.LayoutParams relativeLayout$LayoutParams2 = new RelativeLayout.LayoutParams(-2, -2);
            CLS292.MTH4773(relativeLayout0, relativeLayout$LayoutParams2, 9, 10);
            relativeLayout0.addView(relativeLayout1, relativeLayout$LayoutParams2);
            linearLayout0.addView(relativeLayout0, new LinearLayout.LayoutParams(-1, -1));
            linearLayout0.setBackgroundColor(CLS522.MTH7118());
            linearLayout0.setVisibility(this.FLD5435);
            this.FLD5436 = linearLayout0;
        }
        return this.FLD5436;
    }
}

