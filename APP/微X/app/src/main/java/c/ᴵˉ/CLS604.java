// Decompiled by JEB v5.42.0.202606242140

package c.ᴵˉ;

import android.app.Activity;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.View;
import android.widget.EditText;
import android.widget.LinearLayout.LayoutParams;
import android.widget.LinearLayout;
import android.widget.RelativeLayout.LayoutParams;
import android.widget.RelativeLayout;
import android.widget.TextView;
import c.ˏᵎ.CLS144;
import c.ˏᵎ.CLS185;
import c.ˏᵎ.CLS197;
import c.ˏᵎ.CLS226;
import c.ﹶˆ.CLS341;
import java.lang.ref.WeakReference;

public class CLS604 implements CLS341 {
    public interface CLS289 {
        void MTH3724(String arg1);
    }

    public CLS289 FLD1233;
    public View FLD1234;
    public String FLD1235;
    public TextView FLD1236;
    public String FLD1237;
    public TextView FLD1238;
    public String FLD1239;
    public TextView FLD1240;
    public String FLD1241;
    public int FLD1242;
    public String FLD1243;
    public boolean FLD1244;
    public final EditText FLD1245;
    public View FLD1246;
    public int FLD1247;
    public final WeakReference FLD1248;

    public CLS604(Activity activity0) {
        this.FLD1247 = 0;
        this.FLD1244 = false;
        this.FLD1242 = 1;
        this.FLD1248 = new WeakReference(activity0);
        this.FLD1245 = new EditText(activity0);
    }

    public void MTH3727(CLS289 ﾞʿ$ﾞⁱ0) {
        this.FLD1233 = ﾞʿ$ﾞⁱ0;
    }

    public String MTH3728() {
        return this.FLD1245 == null ? this.FLD1243 : CLS197.MTH2929(this.FLD1245.getText()).trim();
    }

    public final View MTH3729() {
        public class CLS288 implements TextWatcher {
            public final CLS604 FLD1232;

            @Override  // android.text.TextWatcher
            public void afterTextChanged(Editable editable0) {
                try {
                    CLS604.this.FLD1233.MTH3724(CLS197.MTH2929(editable0));
                }
                catch(Throwable throwable0) {
                    CLS185.MTH2708(throwable0);
                }
            }

            @Override  // android.text.TextWatcher
            public void beforeTextChanged(CharSequence charSequence0, int v, int v1, int v2) {
            }

            @Override  // android.text.TextWatcher
            public void onTextChanged(CharSequence charSequence0, int v, int v1, int v2) {
            }
        }

        int v3;
        int v2;
        TextView textView4;
        int v1;
        int v;
        TextView textView1;
        Activity activity0 = (Activity)this.FLD1248.get();
        LinearLayout linearLayout0 = new LinearLayout(activity0);
        RelativeLayout relativeLayout0 = new RelativeLayout(activity0);
        relativeLayout0.setId(CLS144.MTH2162());
        RelativeLayout relativeLayout1 = new RelativeLayout(activity0);
        relativeLayout1.setId(CLS144.MTH2162());
        TextView textView0 = new TextView(activity0);
        this.FLD1240 = textView0;
        textView0.setTextSize(2, 17.0f);
        this.FLD1240.setId(CLS144.MTH2162());
        CLS144.MTH2197(this.FLD1240, this.FLD1239);
        this.FLD1240.setTextColor(CLS226.MTH3099());
        if(this.FLD1244) {
            textView1 = this.FLD1240;
            v = CLS144.MTH2175(3);
            v1 = CLS144.MTH2175(1);
        }
        else {
            textView1 = this.FLD1240;
            v = CLS144.MTH2175(10);
            v1 = CLS144.MTH2175(5);
        }
        textView1.setPadding(0, v, 0, v1);
        RelativeLayout.LayoutParams relativeLayout$LayoutParams0 = new RelativeLayout.LayoutParams(-2, -2);
        relativeLayout$LayoutParams0.addRule(10, relativeLayout1.getId());
        relativeLayout$LayoutParams0.addRule(9, relativeLayout1.getId());
        relativeLayout1.addView(this.FLD1240, relativeLayout$LayoutParams0);
        TextView textView2 = new TextView(activity0);
        this.FLD1238 = textView2;
        textView2.setTextSize(2, 14.0f);
        this.FLD1238.setId(CLS144.MTH2162());
        CLS144.MTH2197(this.FLD1238, this.FLD1235);
        this.FLD1238.setTextColor(CLS226.MTH3098());
        RelativeLayout.LayoutParams relativeLayout$LayoutParams1 = new RelativeLayout.LayoutParams(-2, -2);
        relativeLayout$LayoutParams1.addRule(9, relativeLayout1.getId());
        relativeLayout$LayoutParams1.addRule(3, this.FLD1240.getId());
        this.FLD1238.setPadding(CLS144.MTH2175(5), 0, 0, 0);
        relativeLayout1.addView(this.FLD1238, relativeLayout$LayoutParams1);
        if(TextUtils.isEmpty(this.FLD1235)) {
            this.FLD1238.setVisibility(8);
        }
        TextView textView3 = new TextView(activity0);
        this.FLD1236 = textView3;
        textView3.setTextSize(2, 16.0f);
        this.FLD1236.setId(CLS144.MTH2162());
        CLS144.MTH2197(this.FLD1236, this.FLD1237);
        this.FLD1236.setTextColor(CLS226.MTH3110());
        if(this.FLD1244) {
            textView4 = this.FLD1236;
            v2 = CLS144.MTH2175(3);
            v3 = CLS144.MTH2175(2);
        }
        else {
            textView4 = this.FLD1236;
            v2 = CLS144.MTH2175(10);
            v3 = CLS144.MTH2175(5);
        }
        textView4.setPadding(0, v2, 0, v3);
        RelativeLayout.LayoutParams relativeLayout$LayoutParams2 = new RelativeLayout.LayoutParams(-2, -2);
        relativeLayout$LayoutParams2.addRule(10, relativeLayout1.getId());
        relativeLayout$LayoutParams2.addRule(11, relativeLayout1.getId());
        relativeLayout1.addView(this.FLD1236, relativeLayout$LayoutParams2);
        if(TextUtils.isEmpty(this.FLD1239) && TextUtils.isEmpty(this.FLD1237)) {
            this.FLD1240.setVisibility(8);
            this.FLD1236.setVisibility(8);
        }
        if(this.FLD1242 == 1) {
            this.FLD1242 = 0x20001;
        }
        this.FLD1245.setInputType(this.FLD1242);
        if(!TextUtils.isEmpty(this.FLD1241)) {
            this.FLD1245.setHint(this.FLD1241);
        }
        this.FLD1245.setText(this.FLD1243);
        if(this.FLD1233 != null) {
            CLS288 ﾞʿ$ⁱˋ0 = new CLS288(this);
            this.FLD1245.addTextChangedListener(ﾞʿ$ⁱˋ0);
        }
        RelativeLayout.LayoutParams relativeLayout$LayoutParams3 = new RelativeLayout.LayoutParams(-1, -2);
        relativeLayout$LayoutParams3.addRule(9, relativeLayout1.getId());
        relativeLayout$LayoutParams3.addRule(3, this.FLD1238.getId());
        if(this.FLD1244) {
            int v4 = CLS144.MTH2175(6);
            int v5 = CLS144.MTH2175(2);
            int v6 = CLS144.MTH2175(6);
            this.FLD1245.setPadding(v4, v5, v6, 0);
        }
        else {
            int v7 = CLS144.MTH2175(6);
            int v8 = CLS144.MTH2175(5);
            int v9 = CLS144.MTH2175(6);
            this.FLD1245.setPadding(v7, v8, v9, 0);
        }
        int v10 = CLS226.MTH3099();
        this.FLD1245.setTextColor(v10);
        int v11 = CLS226.MTH3098();
        this.FLD1245.setHintTextColor(v11);
        relativeLayout1.addView(this.FLD1245, relativeLayout$LayoutParams3);
        RelativeLayout.LayoutParams relativeLayout$LayoutParams4 = new RelativeLayout.LayoutParams(-2, -2);
        relativeLayout$LayoutParams4.addRule(9, relativeLayout0.getId());
        relativeLayout$LayoutParams4.addRule(10, relativeLayout0.getId());
        relativeLayout0.addView(relativeLayout1, relativeLayout$LayoutParams4);
        linearLayout0.addView(relativeLayout0, new LinearLayout.LayoutParams(-1, -1));
        linearLayout0.setBackgroundColor(CLS226.MTH3105());
        linearLayout0.setVisibility(this.FLD1247);
        return linearLayout0;
    }

    // 去混淆评级： 低(32)
    // 此方法包含解密的字符串
    public void MTH3730(String s) {
        new CLS284(s);
        this.MTH3733("");
        this.FLD1239 = "";
        CLS144.MTH2197(this.FLD1240, "");
    }

    public void MTH3731(String s) {
        this.FLD1235 = s;
        CLS144.MTH2197(this.FLD1238, s);
    }

    public void MTH3732(int v) {
        this.FLD1242 = v;
        EditText editText0 = this.FLD1245;
        if(editText0 != null) {
            if(v == 1) {
                v = 0x20001;
            }
            editText0.setInputType(v);
        }
    }

    public void MTH3733(String s) {
        this.FLD1237 = s;
        CLS144.MTH2197(this.FLD1236, s);
    }

    @Override  // c.ﹶˆ.CLS341
    public void MTH4822(View view0) {
        this.FLD1234 = view0;
        view0.setVisibility(this.FLD1247);
    }

    public void MTH3735(String s) {
        this.FLD1243 = s;
        EditText editText0 = this.FLD1245;
        if(editText0 != null) {
            editText0.setText(s);
        }
    }

    @Override  // c.ﹶˆ.CLS341
    public View MTH4823() {
        if(this.FLD1246 == null) {
            this.FLD1246 = this.MTH3729();
        }
        return this.FLD1246;
    }
}

