// Decompiled by JEB v5.42.0.202606242140

package t.ˆʿ;

import android.app.Activity;
import android.app.Dialog;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
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
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import t.ʻˑ.CLS1;
import t.ʻˑ.CLS3;
import t.ʾᵢ.CLS15;
import t.ᵔʾ.CLS123;
import t.ᵔʾ.CLS133;
import t.ⁱʾ.CLS141;
import t.ⁱʾ.CLS143;
import t.ﾞᐧ.CLS159;
import t.ﾞᐧ.CLS168;

public final class CLS55 extends Dialog {
    public interface CLS53 {
        void MTH1476(CLS168 arg1);
    }

    public interface CLS54 {
        void MTH1477(LinearLayout arg1);
    }

    public CLS141 FLD513;
    public CLS54 FLD514;
    public CLS143 FLD515;
    public final String FLD516;
    public String FLD517;
    public CLS159 FLD518;
    public LinearLayout FLD519;
    public final WeakReference FLD520;
    public Toolbar FLD521;
    public CLS54 FLD522;
    public CLS53 FLD523;

    // 此方法包含解密的字符串
    public CLS55(Activity activity0, String s) {
        String s1 = "";
        super(activity0, 0x1030011);
        String s2 = "";
        new String("");
        new String("");
        new String("");
        if(!TextUtils.isEmpty(s)) {
            if(s.contains("[[") && s.contains("]]")) {
                int v = s.indexOf("[[");
                int v1 = s.indexOf("]]");
                s1 = s.substring(v + 2, v1);
                s = CLS15.MTH1076(s, 0, v, new StringBuilder(), v1, 2);
            }
            String s3 = s;
            String s4 = "";
            if(s3.contains("{") && s3.contains("}")) {
                int v2 = s3.indexOf("{");
                int v3 = s3.indexOf("}");
                s4 = s3.substring(v2 + 1, v3);
                s3 = CLS15.MTH1076(s3, 0, v2, new StringBuilder(), v3, 1);
            }
            String s5 = "";
            if(s3.contains("((") && s3.contains("))")) {
                int v4 = s3.indexOf("((");
                int v5 = s3.indexOf("))");
                s5 = s3.substring(v4 + 2, v5);
                s3 = CLS15.MTH1076(s3, 0, v4, new StringBuilder(), v5, 2);
            }
            s4.trim();
            s1.trim();
            s5.trim();
            s2 = s3.trim();
        }
        this.FLD516 = s2;
        this.FLD520 = new WeakReference(activity0);
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
            CLS35.MTH1373(window0.getDecorView());
        }
        WindowManager.LayoutParams windowManager$LayoutParams0 = window0.getAttributes();
        windowManager$LayoutParams0.flags &= 0xFFFFFBFF;
        window0.setAttributes(windowManager$LayoutParams0);
        if(!CLS28.MTH1318()) {
            window0.setFlags(0x2000, 0x2000);
        }
        if(v >= 21) {
            window0.clearFlags(0x4000000);
            window0.addFlags(0x80000000);
            window0.setStatusBarColor(CLS55.MTH1483());
        }
    }

    @Override  // android.app.Dialog
    public final void show() {
        try {
            this.MTH1482();
        }
        catch(Throwable throwable0) {
            CLS133.MTH2113(throwable0);
        }
    }

    // 此方法包含解密的字符串
    public final void MTH1482() {
        Menu menu1;
        TextView textView0;
        if(this.isShowing() && this.getWindow().getDecorView().getVisibility() == 0) {
            return;
        }
        if(this.FLD519 == null) {
            WeakReference weakReference0 = this.FLD520;
            Activity activity0 = (Activity)weakReference0.get();
            LinearLayout linearLayout0 = new LinearLayout(activity0);
            LinearLayout.LayoutParams linearLayout$LayoutParams0 = new LinearLayout.LayoutParams(-1, -2);
            linearLayout0.setGravity(0x30);
            linearLayout0.setOrientation(1);
            linearLayout0.setFocusableInTouchMode(true);
            linearLayout0.setLayoutParams(linearLayout$LayoutParams0);
            String s = this.FLD516;
            Menu menu0 = null;
            if(Build.VERSION.SDK_INT >= 21) {
                try {
                    this.FLD521 = new Toolbar(((Activity)weakReference0.get()));
                    Toolbar.LayoutParams toolbar$LayoutParams0 = new Toolbar.LayoutParams(-1, -2);
                    this.FLD521.setLayoutParams(toolbar$LayoutParams0);
                    if(CLS46.MTH1455()) {
                        this.FLD521.setPopupTheme(0x103024B);
                    }
                    else {
                        this.FLD521.setPopupTheme(0x103024A);
                    }
                    this.FLD521.setBackgroundColor(CLS55.MTH1483());
                    if(!TextUtils.isEmpty(s)) {
                        this.FLD521.setTitle(s);
                        this.FLD521.setTitleTextColor(CLS46.MTH1450());
                        Toolbar toolbar0 = this.FLD521;
                        try {
                            Field field0 = toolbar0.getClass().getDeclaredField("mTitleTextView");
                            field0.setAccessible(true);
                            textView0 = (TextView)field0.get(toolbar0);
                        }
                        catch(Throwable throwable1) {
                            CLS133.MTH2113(throwable1);
                            textView0 = null;
                        }
                        if(textView0 != null) {
                            textView0.setGravity(17);
                            textView0.setTextAlignment(4);
                        }
                    }
                    Toolbar toolbar1 = this.FLD521;
                    int v = CLS46.MTH1455() ? CLS46.MTH1450() : CLS46.MTH1447(CLS133.MTH2103().MTH2134("toolbar_overflowicon_color", "000000"));
                    try {
                        if(Build.VERSION.SDK_INT >= 23) {
                            Drawable drawable0 = toolbar1.getOverflowIcon();
                            if(drawable0 != null) {
                                Drawable drawable1 = drawable0.mutate();
                                CLS41.MTH1401(drawable0, v);
                                toolbar1.setOverflowIcon(drawable1);
                            }
                        }
                    }
                    catch(Throwable throwable2) {
                        CLS133.MTH2113(throwable2);
                    }
                    CLS43.MTH1432(linearLayout0, this.FLD521);
                    menu1 = this.FLD521.getMenu();
                }
                catch(Throwable throwable0) {
                    CLS133.MTH2113(throwable0);
                    goto label_52;
                }
            }
            else {
            label_52:
                if(CLS133.MTH2111("CompatToolbarClass") != null) {
                    try {
                        CLS159 ʼˎ0 = new CLS159(((Activity)weakReference0.get()));
                        this.FLD518 = ʼˎ0;
                        int v1 = CLS55.MTH1483();
                        Object object0 = ʼˎ0.FLD1110;
                        if(object0 != null) {
                            CLS3.MTH991(object0, "setBackgroundColor", new Object[]{v1});
                        }
                        if(!TextUtils.isEmpty(s)) {
                            Object object1 = this.FLD518.FLD1110;
                            if(object1 != null) {
                                CLS3.MTH991(object1, "setTitle", new Object[]{s});
                            }
                            CLS159 ʼˎ1 = this.FLD518;
                            int v2 = CLS46.MTH1450();
                            Object object2 = ʼˎ1.FLD1110;
                            if(object2 != null) {
                                try {
                                    TextView textView1 = (TextView)CLS1.MTH980(object2, TextView.class);
                                    if(textView1 != null) {
                                        textView1.setTextColor(v2);
                                    }
                                }
                                catch(Throwable throwable4) {
                                    CLS133.MTH2113(throwable4);
                                }
                            }
                        }
                        Object object3 = this.FLD518.FLD1110;
                        if(object3 != null) {
                            CLS43.MTH1432(linearLayout0, ((View)object3));
                        }
                        Object object4 = this.FLD518.FLD1110;
                        if(object4 != null) {
                            menu0 = (Menu)CLS3.MTH991(object4, "getMenu", new Object[0]);
                        }
                    }
                    catch(Throwable throwable3) {
                        CLS133.MTH2113(throwable3);
                    }
                }
                menu1 = menu0;
            }
            CLS168 ˑٴ0 = new CLS168(activity0, linearLayout0, menu1);
            CLS53 ⁱˉ$ˆٴ0 = this.FLD523;
            if(ⁱˉ$ˆٴ0 != null) {
                try {
                    ⁱˉ$ˆٴ0.MTH1476(ˑٴ0);
                }
                catch(Throwable throwable5) {
                    CLS133.MTH2113(throwable5);
                }
            }
            ˑٴ0.MTH2392();
            if(this.FLD513 != null) {
                if(!TextUtils.isEmpty(this.FLD517)) {
                    menu1.add(this.FLD517).setOnMenuItemClickListener(new CLS51(this, 0)).setShowAsAction(2);
                }
                menu1.add(CLS133.MTH2099("dialog_cancel")).setOnMenuItemClickListener(new CLS51(this, 1)).setShowAsAction(2);
                menu1.add(CLS133.MTH2099("dialog_confirm")).setOnMenuItemClickListener(new CLS51(this, 2)).setShowAsAction(2);
            }
            LinearLayout linearLayout1 = new LinearLayout(activity0);
            linearLayout1.setGravity(0x30);
            linearLayout1.setOrientation(1);
            linearLayout1.setFocusableInTouchMode(true);
            linearLayout1.setLayoutParams(linearLayout$LayoutParams0);
            if(CLS43.MTH1420()) {
                linearLayout0.addView(linearLayout1);
            }
            CLS54 ⁱˉ$ᵔʾ0 = this.FLD522;
            if(ⁱˉ$ᵔʾ0 != null) {
                try {
                    ⁱˉ$ᵔʾ0.MTH1477(linearLayout1);
                }
                catch(Throwable throwable6) {
                    CLS133.MTH2113(throwable6);
                }
            }
            if(this.FLD514 != null) {
                try {
                    LinearLayout.LayoutParams linearLayout$LayoutParams1 = new LinearLayout.LayoutParams(-1, -1);
                    ScrollView scrollView0 = new ScrollView(((Activity)weakReference0.get()));
                    LinearLayout linearLayout2 = new LinearLayout(((Activity)weakReference0.get()));
                    linearLayout2.setOrientation(1);
                    linearLayout2.setLayoutParams(linearLayout$LayoutParams1);
                    try {
                        this.FLD514.MTH1477(linearLayout2);
                    }
                    catch(Throwable throwable8) {
                        CLS133.MTH2113(throwable8);
                    }
                    scrollView0.addView(linearLayout2, new LinearLayout.LayoutParams(-1, -2));
                    linearLayout1.addView(scrollView0, new LinearLayout.LayoutParams(-1, -2));
                }
                catch(Throwable throwable7) {
                    CLS133.MTH2113(throwable7);
                }
            }
            CLS43.MTH1437(linearLayout0, new ColorDrawable(CLS46.MTH1448()));
            if(this.FLD515 != null) {
                this.setOnDismissListener(new CLS39(this));
            }
            if(!CLS43.MTH1420()) {
                this.setTitle(s);
                linearLayout0 = linearLayout1;
            }
            this.FLD519 = linearLayout0;
            this.setContentView(linearLayout0);
        }
        super.show();
    }

    // 此方法包含解密的字符串
    public static int MTH1483() {
        String s = CLS123.FLD912.MTH2005("getThemeString", new Object[]{"ActionBarColor"});
        if(!TextUtils.isEmpty(s)) {
            return CLS46.MTH1447(s);
        }
        if(CLS46.MTH1455()) {
            return Color.parseColor("#232323");
        }
        String s1 = "EDEDED";
        String s2 = CLS133.MTH2116("toolbar_color");
        if(!TextUtils.isEmpty(s2)) {
            s1 = s2;
        }
        return CLS46.MTH1447(CLS133.MTH2103().MTH2134("toolbar_color", s1));
    }
}

