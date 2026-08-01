// Decompiled by JEB v5.42.0.202606242140

package b.ⁱᵔ;

import android.app.Activity;
import android.app.Dialog;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.Menu;
import android.view.View;
import android.view.Window;
import android.view.WindowManager.LayoutParams;
import android.widget.LinearLayout.LayoutParams;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import android.widget.Toolbar.LayoutParams;
import android.widget.Toolbar;
import b.ʻˑ.CLS11;
import b.ʻˑ.CLS3;
import b.ʾᵢ.CLS21;
import b.ʾᵢ.CLS27;
import b.ʾᵢ.CLS30;
import b.יﹳ.CLS164;
import b.יﹳ.CLS166;
import b.ᐧˉ.CLS182;
import b.ﾞˎ.CLS525;
import b.ﾞᐧ.CLS559;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;

public final class CLS380 extends Dialog {
    public interface CLS378 {
        void MTH5452(CLS525 arg1);
    }

    public interface CLS379 {
        void MTH5453(LinearLayout arg1);
    }

    public CLS11 FLD3517;
    public CLS379 FLD3518;
    public CLS3 FLD3519;
    public final String FLD3520;
    public String FLD3521;
    public CLS559 FLD3522;
    public LinearLayout FLD3523;
    public final WeakReference FLD3524;
    public Toolbar FLD3525;
    public CLS379 FLD3526;
    public CLS378 FLD3527;

    // 此方法包含解密的字符串
    public CLS380(Activity activity0, String s) {
        String s1 = "";
        super(activity0, 0x1030011);
        String s2 = "";
        new String("");
        new String("");
        new String("");
        if(!TextUtils.isEmpty(s)) {
            if(s.contains("[[") && s.contains("]]")) {
                int v = s.indexOf("[[");
                int v1 = s.lastIndexOf("]]");
                s1 = s.substring(v + 2, v1);
                s = CLS182.MTH3495(s, 0, v, new StringBuilder(), v1, 2);
            }
            String s3 = s;
            String s4 = "";
            if(s3.contains("{") && s3.contains("}")) {
                int v2 = s3.indexOf("{");
                int v3 = s3.lastIndexOf("}");
                s4 = s3.substring(v2 + 1, v3);
                s3 = CLS182.MTH3495(s3, 0, v2, new StringBuilder(), v3, 1);
            }
            String s5 = "";
            if(s3.contains("((") && s3.contains("))")) {
                int v4 = s3.indexOf("((");
                int v5 = s3.lastIndexOf("))");
                s5 = s3.substring(v4 + 2, v5);
                s3 = CLS182.MTH3495(s3, 0, v4, new StringBuilder(), v5, 2);
            }
            s4.trim();
            s1.trim();
            s5.trim();
            s2 = s3.trim();
        }
        this.FLD3520 = s2;
        this.FLD3524 = new WeakReference(activity0);
    }

    @Override  // android.app.Dialog
    public final void dismiss() {
        super.dismiss();
        this.hide();
    }

    @Override  // android.app.Dialog
    public final void onCreate(Bundle bundle0) {
        super.onCreate(bundle0);
        Window window0 = this.getWindow();
        window0.getDecorView().setPadding(0, 0, 0, 0);
        int v = Build.VERSION.SDK_INT;
        if(v >= 16) {
            CLS30.MTH957(window0.getDecorView());
        }
        WindowManager.LayoutParams windowManager$LayoutParams0 = window0.getAttributes();
        windowManager$LayoutParams0.flags &= 0xFFFFFBFF;
        window0.setAttributes(windowManager$LayoutParams0);
        if(!CLS412.MTH6002()) {
            window0.setFlags(0x2000, 0x2000);
        }
        if(v >= 21) {
            window0.clearFlags(0x4000000);
            window0.addFlags(0x80000000);
            window0.setStatusBarColor(CLS380.MTH5459());
        }
    }

    @Override  // android.app.Dialog
    public final void show() {
        try {
            this.MTH5458();
        }
        catch(Throwable throwable0) {
            CLS27.MTH893(throwable0);
        }
    }

    // 此方法包含解密的字符串
    public final void MTH5458() {
        Menu menu1;
        TextView textView0;
        if(this.isShowing() && this.getWindow().getDecorView().getVisibility() == 0) {
            return;
        }
        if(this.FLD3523 == null) {
            WeakReference weakReference0 = this.FLD3524;
            Activity activity0 = (Activity)weakReference0.get();
            LinearLayout linearLayout0 = new LinearLayout(activity0);
            LinearLayout.LayoutParams linearLayout$LayoutParams0 = new LinearLayout.LayoutParams(-1, -2);
            linearLayout0.setGravity(0x30);
            linearLayout0.setOrientation(1);
            linearLayout0.setFocusableInTouchMode(true);
            linearLayout0.setLayoutParams(linearLayout$LayoutParams0);
            Menu menu0 = null;
            String s = this.FLD3520;
            if(Build.VERSION.SDK_INT >= 21) {
                try {
                    this.FLD3525 = new Toolbar(((Activity)weakReference0.get()));
                    Toolbar.LayoutParams toolbar$LayoutParams0 = new Toolbar.LayoutParams(-1, -2);
                    this.FLD3525.setLayoutParams(toolbar$LayoutParams0);
                    if(CLS522.MTH7114()) {
                        this.FLD3525.setPopupTheme(0x103024B);
                    }
                    else {
                        this.FLD3525.setPopupTheme(0x103024A);
                    }
                    this.FLD3525.setBackgroundColor(CLS380.MTH5459());
                    if(!TextUtils.isEmpty(s)) {
                        this.FLD3525.setTitle(s);
                        this.FLD3525.setTitleTextColor(CLS522.MTH7111());
                        Toolbar toolbar0 = this.FLD3525;
                        try {
                            Field field0 = toolbar0.getClass().getDeclaredField("mTitleTextView");
                            field0.setAccessible(true);
                            textView0 = (TextView)field0.get(toolbar0);
                        }
                        catch(Throwable throwable1) {
                            CLS27.MTH893(throwable1);
                            textView0 = null;
                        }
                        if(textView0 != null) {
                            textView0.setGravity(17);
                            textView0.setTextAlignment(4);
                        }
                    }
                    CLS523.MTH7168(this.FLD3525, CLS522.MTH7107());
                    CLS523.MTH7139(linearLayout0, this.FLD3525, 0);
                    menu1 = this.FLD3525.getMenu();
                }
                catch(Throwable throwable0) {
                    CLS27.MTH893(throwable0);
                    goto label_42;
                }
            }
            else {
            label_42:
                if(CLS27.MTH894("CompatToolbarClass") != null) {
                    try {
                        CLS559 ᵔʾ0 = new CLS559(((Activity)weakReference0.get()));
                        this.FLD3522 = ᵔʾ0;
                        int v = CLS380.MTH5459();
                        Object object0 = ᵔʾ0.FLD5459;
                        if(object0 != null) {
                            CLS166.MTH3195(object0, "setBackgroundColor", new Object[]{v});
                        }
                        if(!TextUtils.isEmpty(s)) {
                            this.FLD3522.MTH7484(s);
                            CLS559 ᵔʾ1 = this.FLD3522;
                            int v1 = CLS522.MTH7111();
                            Object object1 = ᵔʾ1.FLD5459;
                            if(object1 != null) {
                                try {
                                    TextView textView1 = (TextView)CLS164.MTH3175(object1, TextView.class);
                                    if(textView1 != null) {
                                        textView1.setTextColor(v1);
                                    }
                                }
                                catch(Throwable throwable3) {
                                    CLS27.MTH893(throwable3);
                                }
                            }
                        }
                        Object object2 = this.FLD3522.FLD5459;
                        if(object2 != null) {
                            CLS523.MTH7139(linearLayout0, ((View)object2), 0);
                        }
                        Object object3 = this.FLD3522.FLD5459;
                        if(object3 != null) {
                            menu0 = (Menu)CLS166.MTH3195(object3, "getMenu", new Object[0]);
                        }
                    }
                    catch(Throwable throwable2) {
                        CLS27.MTH893(throwable2);
                    }
                }
                menu1 = menu0;
            }
            CLS525 ʻˑ0 = new CLS525(activity0, linearLayout0, menu1);
            CLS378 ʼˎ$ˆٴ0 = this.FLD3527;
            if(ʼˎ$ˆٴ0 != null) {
                try {
                    ʼˎ$ˆٴ0.MTH5452(ʻˑ0);
                }
                catch(Throwable throwable4) {
                    CLS27.MTH893(throwable4);
                }
            }
            ʻˑ0.MTH7188();
            if(this.FLD3517 != null) {
                if(!TextUtils.isEmpty(this.FLD3521)) {
                    menu1.add(this.FLD3521).setOnMenuItemClickListener(new CLS386(this, 0)).setShowAsAction(2);
                }
                menu1.add(CLS27.MTH889("dialog_cancel")).setOnMenuItemClickListener(new CLS386(this, 1)).setShowAsAction(2);
                menu1.add(CLS27.MTH889("dialog_confirm")).setOnMenuItemClickListener(new CLS386(this, 2)).setShowAsAction(2);
            }
            LinearLayout linearLayout1 = new LinearLayout(activity0);
            linearLayout1.setGravity(0x30);
            linearLayout1.setOrientation(1);
            linearLayout1.setFocusableInTouchMode(true);
            linearLayout1.setLayoutParams(linearLayout$LayoutParams0);
            if(CLS523.MTH7140()) {
                linearLayout0.addView(linearLayout1);
            }
            CLS379 ʼˎ$ᵔʾ0 = this.FLD3526;
            if(ʼˎ$ᵔʾ0 != null) {
                try {
                    ʼˎ$ᵔʾ0.MTH5453(linearLayout1);
                }
                catch(Throwable throwable5) {
                    CLS27.MTH893(throwable5);
                }
            }
            if(this.FLD3518 != null) {
                try {
                    LinearLayout.LayoutParams linearLayout$LayoutParams1 = new LinearLayout.LayoutParams(-1, -1);
                    ScrollView scrollView0 = new ScrollView(((Activity)weakReference0.get()));
                    LinearLayout linearLayout2 = new LinearLayout(((Activity)weakReference0.get()));
                    linearLayout2.setOrientation(1);
                    linearLayout2.setLayoutParams(linearLayout$LayoutParams1);
                    try {
                        this.FLD3518.MTH5453(linearLayout2);
                    }
                    catch(Throwable throwable7) {
                        CLS27.MTH893(throwable7);
                    }
                    scrollView0.addView(linearLayout2, new LinearLayout.LayoutParams(-1, -2));
                    linearLayout1.addView(scrollView0, new LinearLayout.LayoutParams(-1, -2));
                }
                catch(Throwable throwable6) {
                    CLS27.MTH893(throwable6);
                }
            }
            CLS523.MTH7152(linearLayout0, new ColorDrawable(CLS522.MTH7108()));
            if(this.FLD3519 != null) {
                this.setOnDismissListener(new CLS492(this));
            }
            if(!CLS523.MTH7140()) {
                this.setTitle(s);
                linearLayout0 = linearLayout1;
            }
            this.FLD3523 = linearLayout0;
            this.setContentView(linearLayout0);
        }
        super.show();
    }

    // 此方法包含解密的字符串
    public static int MTH5459() {
        String s = CLS21.FLD76.MTH826("getThemeString", new Object[]{"ActionBarColor"});
        if(!TextUtils.isEmpty(s)) {
            return CLS522.MTH7110(s);
        }
        if(CLS522.MTH7114()) {
            return Color.parseColor("#232323");
        }
        String s1 = "EDEDED";
        String s2 = CLS27.MTH882("toolbar_color");
        if(!TextUtils.isEmpty(s2)) {
            s1 = s2;
        }
        return CLS522.MTH7115("toolbar_color", s1);
    }
}

