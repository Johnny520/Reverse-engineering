// Decompiled by JEB v5.42.0.202606242140

package c.ٴˈ;

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
import c.ˋﹳ.CLS108;
import c.ـˉ.CLS170;
import c.ـˉ.CLS172;
import c.ـˉ.CLS204;
import c.ـˉ.CLS258;
import java.lang.ref.WeakReference;

public class CLS797 implements CLS108 {
    public interface CLS289 {
        void MTH4292(String arg1);
    }

    public final WeakReference FLD1313;
    public String FLD1314;
    public TextView FLD1315;
    public int FLD1316;
    public final EditText FLD1317;
    public String FLD1318;
    public String FLD1319;
    public View FLD1320;
    public View FLD1321;
    public boolean FLD1322;
    public String FLD1323;
    public CLS289 FLD1324;
    public int FLD1325;
    public String FLD1326;
    public TextView FLD1327;
    public TextView FLD1328;

    public CLS797(Activity activity0) {
        this.FLD1325 = 0;
        this.FLD1322 = false;
        this.FLD1316 = 1;
        this.FLD1313 = new WeakReference(activity0);
        this.FLD1317 = new EditText(activity0);
    }

    @Override  // c.ˋﹳ.CLS108
    public View MTH2282() {
        if(this.FLD1321 == null) {
            this.FLD1321 = this.MTH4308();
        }
        return this.FLD1321;
    }

    public String MTH4299() {
        return this.FLD1317 == null ? this.FLD1326 : CLS170.MTH3006(this.FLD1317.getText()).trim();
    }

    @Override  // c.ˋﹳ.CLS108
    public void MTH2283(View view0) {
        this.FLD1320 = view0;
        view0.setVisibility(this.FLD1325);
    }

    // 去混淆评级： 低(32)
    // 此方法包含解密的字符串
    public void MTH4301(String s) {
        new CLS284(s);
        this.MTH4303("");
        this.FLD1318 = "";
        CLS258.MTH3751(this.FLD1327, "");
    }

    public void MTH4302(CLS289 ٴˑ$ʻᵢ0) {
        this.FLD1324 = ٴˑ$ʻᵢ0;
    }

    public void MTH4303(String s) {
        this.FLD1323 = s;
        CLS258.MTH3751(this.FLD1315, s);
    }

    public void MTH4305(String s) {
        this.FLD1326 = s;
        EditText editText0 = this.FLD1317;
        if(editText0 != null) {
            editText0.setText(s);
        }
    }

    public void MTH4306(int v) {
        this.FLD1316 = v;
        EditText editText0 = this.FLD1317;
        if(editText0 != null) {
            if(v == 1) {
                v = 0x20001;
            }
            editText0.setInputType(v);
        }
    }

    public void MTH4307(String s) {
        this.FLD1314 = s;
        CLS258.MTH3751(this.FLD1328, s);
    }

    public final View MTH4308() {
        public class CLS290 implements TextWatcher {
            public final CLS797 FLD1312;

            @Override  // android.text.TextWatcher
            public void afterTextChanged(Editable editable0) {
                try {
                    CLS797.this.FLD1324.MTH4292(CLS170.MTH3006(editable0));
                }
                catch(Throwable throwable0) {
                    CLS204.MTH3257(throwable0);
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
        Activity activity0 = (Activity)this.FLD1313.get();
        LinearLayout linearLayout0 = new LinearLayout(activity0);
        RelativeLayout relativeLayout0 = new RelativeLayout(activity0);
        relativeLayout0.setId(CLS258.MTH3807());
        RelativeLayout relativeLayout1 = new RelativeLayout(activity0);
        relativeLayout1.setId(CLS258.MTH3807());
        TextView textView0 = new TextView(activity0);
        this.FLD1327 = textView0;
        textView0.setTextSize(2, 17.0f);
        this.FLD1327.setId(CLS258.MTH3807());
        CLS258.MTH3751(this.FLD1327, this.FLD1318);
        this.FLD1327.setTextColor(CLS172.MTH3033());
        if(this.FLD1322) {
            textView1 = this.FLD1327;
            v = CLS258.MTH3770(3);
            v1 = CLS258.MTH3770(1);
        }
        else {
            textView1 = this.FLD1327;
            v = CLS258.MTH3770(10);
            v1 = CLS258.MTH3770(5);
        }
        textView1.setPadding(0, v, 0, v1);
        RelativeLayout.LayoutParams relativeLayout$LayoutParams0 = new RelativeLayout.LayoutParams(-2, -2);
        relativeLayout$LayoutParams0.addRule(10, relativeLayout1.getId());
        relativeLayout$LayoutParams0.addRule(9, relativeLayout1.getId());
        relativeLayout1.addView(this.FLD1327, relativeLayout$LayoutParams0);
        TextView textView2 = new TextView(activity0);
        this.FLD1328 = textView2;
        textView2.setTextSize(2, 14.0f);
        this.FLD1328.setId(CLS258.MTH3807());
        CLS258.MTH3751(this.FLD1328, this.FLD1314);
        this.FLD1328.setTextColor(CLS172.MTH3036());
        RelativeLayout.LayoutParams relativeLayout$LayoutParams1 = new RelativeLayout.LayoutParams(-2, -2);
        relativeLayout$LayoutParams1.addRule(9, relativeLayout1.getId());
        relativeLayout$LayoutParams1.addRule(3, this.FLD1327.getId());
        this.FLD1328.setPadding(CLS258.MTH3770(5), 0, 0, 0);
        relativeLayout1.addView(this.FLD1328, relativeLayout$LayoutParams1);
        if(TextUtils.isEmpty(this.FLD1314)) {
            this.FLD1328.setVisibility(8);
        }
        TextView textView3 = new TextView(activity0);
        this.FLD1315 = textView3;
        textView3.setTextSize(2, 16.0f);
        this.FLD1315.setId(CLS258.MTH3807());
        CLS258.MTH3751(this.FLD1315, this.FLD1323);
        this.FLD1315.setTextColor(CLS172.MTH3037());
        if(this.FLD1322) {
            textView4 = this.FLD1315;
            v2 = CLS258.MTH3770(3);
            v3 = CLS258.MTH3770(2);
        }
        else {
            textView4 = this.FLD1315;
            v2 = CLS258.MTH3770(10);
            v3 = CLS258.MTH3770(5);
        }
        textView4.setPadding(0, v2, 0, v3);
        RelativeLayout.LayoutParams relativeLayout$LayoutParams2 = new RelativeLayout.LayoutParams(-2, -2);
        relativeLayout$LayoutParams2.addRule(10, relativeLayout1.getId());
        relativeLayout$LayoutParams2.addRule(11, relativeLayout1.getId());
        relativeLayout1.addView(this.FLD1315, relativeLayout$LayoutParams2);
        if(TextUtils.isEmpty(this.FLD1318) && TextUtils.isEmpty(this.FLD1323)) {
            this.FLD1327.setVisibility(8);
            this.FLD1315.setVisibility(8);
        }
        if(this.FLD1316 == 1) {
            this.FLD1316 = 0x20001;
        }
        this.FLD1317.setInputType(this.FLD1316);
        if(!TextUtils.isEmpty(this.FLD1319)) {
            this.FLD1317.setHint(this.FLD1319);
        }
        this.FLD1317.setText(this.FLD1326);
        if(this.FLD1324 != null) {
            CLS290 ٴˑ$ˆٴ0 = new CLS290(this);
            this.FLD1317.addTextChangedListener(ٴˑ$ˆٴ0);
        }
        RelativeLayout.LayoutParams relativeLayout$LayoutParams3 = new RelativeLayout.LayoutParams(-1, -2);
        relativeLayout$LayoutParams3.addRule(9, relativeLayout1.getId());
        relativeLayout$LayoutParams3.addRule(3, this.FLD1328.getId());
        if(this.FLD1322) {
            int v4 = CLS258.MTH3770(6);
            int v5 = CLS258.MTH3770(2);
            int v6 = CLS258.MTH3770(6);
            this.FLD1317.setPadding(v4, v5, v6, 0);
        }
        else {
            int v7 = CLS258.MTH3770(6);
            int v8 = CLS258.MTH3770(5);
            int v9 = CLS258.MTH3770(6);
            this.FLD1317.setPadding(v7, v8, v9, 0);
        }
        int v10 = CLS172.MTH3033();
        this.FLD1317.setTextColor(v10);
        int v11 = CLS172.MTH3036();
        this.FLD1317.setHintTextColor(v11);
        relativeLayout1.addView(this.FLD1317, relativeLayout$LayoutParams3);
        RelativeLayout.LayoutParams relativeLayout$LayoutParams4 = new RelativeLayout.LayoutParams(-2, -2);
        relativeLayout$LayoutParams4.addRule(9, relativeLayout0.getId());
        relativeLayout$LayoutParams4.addRule(10, relativeLayout0.getId());
        relativeLayout0.addView(relativeLayout1, relativeLayout$LayoutParams4);
        linearLayout0.addView(relativeLayout0, new LinearLayout.LayoutParams(-1, -1));
        linearLayout0.setBackgroundColor(CLS172.MTH3039());
        linearLayout0.setVisibility(this.FLD1325);
        return linearLayout0;
    }
}

