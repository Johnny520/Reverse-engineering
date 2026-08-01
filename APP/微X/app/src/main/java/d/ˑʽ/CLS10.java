// Decompiled by JEB v5.42.0.202606242140

package d.ˑʽ;

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
import d.ˎˏ.CLS2;
import d.ˎˏ.CLS4;
import d.יʻ.CLS62;
import d.יʻ.CLS69;
import d.יʻ.CLS71;
import d.ٴˑ.CLS91;
import d.ٴˑ.CLS98;
import d.ᐧˏ.CLS108;
import d.ⁱٴ.CLS123;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;

public final class CLS10 extends Dialog {
    public interface CLS8 {
        void MTH415(LinearLayout arg1);
    }

    public interface CLS9 {
        void MTH416(CLS91 arg1);
    }

    public CLS123 FLD43;
    public CLS8 FLD44;
    public final WeakReference FLD45;
    public CLS98 FLD46;
    public CLS8 FLD47;
    public boolean FLD48;
    public final String FLD49;
    public Toolbar FLD50;
    public LinearLayout FLD51;
    public CLS9 FLD52;

    public CLS10(Activity activity0, String s) {
        super(activity0, 0x1030011);
        String s4;
        String s3;
        String s2;
        this.FLD48 = false;
        String s1 = "";
        if(!TextUtils.isEmpty(s)) {
            if(!s.contains("[[") || !s.contains("]]")) {
                s3 = s;
                s2 = "";
            }
            else {
                int v = s.indexOf("[[");
                int v1 = s.lastIndexOf("]]");
                s2 = s.substring(v + 2, v1);
                s3 = CLS71.MTH825(s, 0, v, new StringBuilder(), v1, 2);
            }
            if(!s3.contains("{") || !s3.contains("}")) {
                s4 = "";
            }
            else {
                int v2 = s3.indexOf("{");
                int v3 = s3.lastIndexOf("}");
                s4 = s3.substring(v2 + 1, v3);
                s3 = CLS71.MTH825(s3, 0, v2, new StringBuilder(), v3, 1);
            }
            if(s3.contains("((") && s3.contains("))")) {
                int v4 = s3.indexOf("((");
                int v5 = s3.lastIndexOf("))");
                s1 = s3.substring(v4 + 2, v5);
                s3 = CLS71.MTH825(s3, 0, v4, new StringBuilder(), v5, 2);
            }
            s4.trim();
            s2.trim();
            s1.trim();
            s1 = s3.trim();
        }
        this.FLD49 = s1;
        this.FLD45 = new WeakReference(activity0);
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
            CLS49.MTH679(window0.getDecorView());
        }
        WindowManager.LayoutParams windowManager$LayoutParams0 = window0.getAttributes();
        windowManager$LayoutParams0.flags &= 0xFFFFFBFF;
        window0.setAttributes(windowManager$LayoutParams0);
        if(!this.FLD48) {
            window0.setFlags(0x2000, 0x2000);
        }
        if(v >= 21) {
            window0.clearFlags(0x4000000);
            window0.addFlags(0x80000000);
            window0.setStatusBarColor(CLS10.MTH421());
        }
    }

    @Override  // android.app.Dialog
    public final void show() {
        try {
            this.MTH422();
        }
        catch(Throwable throwable0) {
            CLS69.MTH797(throwable0);
        }
    }

    // 此方法包含解密的字符串
    public static int MTH421() {
        String s = CLS62.FLD317.MTH756("getThemeString", new Object[]{"ActionBarColor"});
        if(!TextUtils.isEmpty(s)) {
            return CLS43.MTH643(s);
        }
        if(CLS43.MTH639()) {
            return Color.parseColor("#232323");
        }
        String s1 = "EDEDED";
        String s2 = CLS69.MTH806("toolbar_color");
        if(!TextUtils.isEmpty(s2)) {
            s1 = s2;
        }
        return CLS43.MTH643(CLS69.MTH801().MTH740("toolbar_color", s1));
    }

    // 此方法包含解密的字符串
    public final void MTH422() {
        Menu menu1;
        TextView textView0;
        if(this.isShowing() && this.getWindow().getDecorView().getVisibility() == 0) {
            return;
        }
        if(this.FLD51 == null) {
            WeakReference weakReference0 = this.FLD45;
            Activity activity0 = (Activity)weakReference0.get();
            LinearLayout linearLayout0 = new LinearLayout(activity0);
            LinearLayout.LayoutParams linearLayout$LayoutParams0 = new LinearLayout.LayoutParams(-1, -2);
            linearLayout0.setGravity(0x30);
            linearLayout0.setOrientation(1);
            linearLayout0.setFocusableInTouchMode(true);
            linearLayout0.setLayoutParams(linearLayout$LayoutParams0);
            String s = this.FLD49;
            Menu menu0 = null;
            if(Build.VERSION.SDK_INT >= 21) {
                try {
                    this.FLD50 = new Toolbar(((Activity)weakReference0.get()));
                    Toolbar.LayoutParams toolbar$LayoutParams0 = new Toolbar.LayoutParams(-1, -2);
                    this.FLD50.setLayoutParams(toolbar$LayoutParams0);
                    if(CLS43.MTH639()) {
                        this.FLD50.setPopupTheme(0x103024B);
                    }
                    else {
                        this.FLD50.setPopupTheme(0x103024A);
                    }
                    this.FLD50.setBackgroundColor(CLS10.MTH421());
                    if(!TextUtils.isEmpty(s)) {
                        this.FLD50.setTitle(s);
                        this.FLD50.setTitleTextColor(CLS43.MTH642());
                        Toolbar toolbar0 = this.FLD50;
                        try {
                            Field field0 = toolbar0.getClass().getDeclaredField("mTitleTextView");
                            field0.setAccessible(true);
                            textView0 = (TextView)field0.get(toolbar0);
                        }
                        catch(Throwable throwable1) {
                            CLS69.MTH797(throwable1);
                            textView0 = null;
                        }
                        if(textView0 != null) {
                            textView0.setGravity(17);
                            textView0.setTextAlignment(4);
                        }
                    }
                    Toolbar toolbar1 = this.FLD50;
                    int v = CLS43.MTH639() ? CLS43.MTH642() : CLS43.MTH643(CLS69.MTH801().MTH740("toolbar_overflowicon_color", "000000"));
                    try {
                        if(Build.VERSION.SDK_INT >= 23) {
                            Drawable drawable0 = toolbar1.getOverflowIcon();
                            if(drawable0 != null) {
                                Drawable drawable1 = drawable0.mutate();
                                CLS5.MTH394(drawable0, v);
                                toolbar1.setOverflowIcon(drawable1);
                            }
                        }
                    }
                    catch(Throwable throwable2) {
                        CLS69.MTH797(throwable2);
                    }
                    CLS45.MTH665(linearLayout0, this.FLD50);
                    menu1 = this.FLD50.getMenu();
                }
                catch(Throwable throwable0) {
                    CLS69.MTH797(throwable0);
                    goto label_52;
                }
            }
            else {
            label_52:
                if(CLS69.MTH811("CompatToolbarClass") != null) {
                    try {
                        CLS98 ﹶᐧ0 = new CLS98(((Activity)weakReference0.get()));
                        this.FLD46 = ﹶᐧ0;
                        int v1 = CLS10.MTH421();
                        Object object0 = ﹶᐧ0.FLD569;
                        if(object0 != null) {
                            CLS4.MTH389(object0, "setBackgroundColor", new Object[]{v1});
                        }
                        if(!TextUtils.isEmpty(s)) {
                            Object object1 = this.FLD46.FLD569;
                            if(object1 != null) {
                                CLS4.MTH389(object1, "setTitle", new Object[]{s});
                            }
                            CLS98 ﹶᐧ1 = this.FLD46;
                            int v2 = CLS43.MTH642();
                            Object object2 = ﹶᐧ1.FLD569;
                            if(object2 != null) {
                                try {
                                    TextView textView1 = (TextView)CLS2.MTH378(object2);
                                    if(textView1 != null) {
                                        textView1.setTextColor(v2);
                                    }
                                }
                                catch(Throwable throwable4) {
                                    CLS69.MTH797(throwable4);
                                }
                            }
                        }
                        Object object3 = this.FLD46.FLD569;
                        if(object3 != null) {
                            CLS45.MTH665(linearLayout0, ((View)object3));
                        }
                        Object object4 = this.FLD46.FLD569;
                        if(object4 != null) {
                            menu0 = (Menu)CLS4.MTH389(object4, "getMenu", new Object[0]);
                        }
                    }
                    catch(Throwable throwable3) {
                        CLS69.MTH797(throwable3);
                    }
                }
                menu1 = menu0;
            }
            CLS91 ٴˆ0 = new CLS91(activity0, linearLayout0, menu1);
            CLS9 ʻﹶ$ᐧי0 = this.FLD52;
            if(ʻﹶ$ᐧי0 != null) {
                try {
                    ʻﹶ$ᐧי0.MTH416(ٴˆ0);
                }
                catch(Throwable throwable5) {
                    CLS69.MTH797(throwable5);
                }
            }
            ٴˆ0.MTH971();
            LinearLayout linearLayout1 = new LinearLayout(activity0);
            linearLayout1.setGravity(0x30);
            linearLayout1.setOrientation(1);
            linearLayout1.setFocusableInTouchMode(true);
            linearLayout1.setLayoutParams(linearLayout$LayoutParams0);
            if(CLS45.MTH663()) {
                linearLayout0.addView(linearLayout1);
            }
            CLS8 ʻﹶ$יʻ0 = this.FLD47;
            if(ʻﹶ$יʻ0 != null) {
                try {
                    ʻﹶ$יʻ0.MTH415(linearLayout1);
                }
                catch(Throwable throwable6) {
                    CLS69.MTH797(throwable6);
                }
            }
            if(this.FLD44 != null) {
                try {
                    LinearLayout.LayoutParams linearLayout$LayoutParams1 = new LinearLayout.LayoutParams(-1, -1);
                    ScrollView scrollView0 = new ScrollView(((Activity)weakReference0.get()));
                    LinearLayout linearLayout2 = new LinearLayout(((Activity)weakReference0.get()));
                    linearLayout2.setOrientation(1);
                    linearLayout2.setLayoutParams(linearLayout$LayoutParams1);
                    try {
                        this.FLD44.MTH415(linearLayout2);
                    }
                    catch(Throwable throwable8) {
                        CLS69.MTH797(throwable8);
                    }
                    scrollView0.addView(linearLayout2, new LinearLayout.LayoutParams(-1, -2));
                    linearLayout1.addView(scrollView0, new LinearLayout.LayoutParams(-1, -2));
                }
                catch(Throwable throwable7) {
                    CLS69.MTH797(throwable7);
                }
            }
            CLS45.MTH657(linearLayout0, new ColorDrawable(Color.parseColor(CLS108.MTH1103((CLS43.MTH639() ? 0xFFFF5B7B2DFB3E45L : -180924725903803L)))));
            if(this.FLD43 != null) {
                this.setOnDismissListener(new CLS54(this));
            }
            if(!CLS45.MTH663()) {
                this.setTitle(s);
                linearLayout0 = linearLayout1;
            }
            this.FLD51 = linearLayout0;
            this.setContentView(linearLayout0);
        }
        super.show();
    }
}

