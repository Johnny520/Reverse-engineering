// Decompiled by JEB v5.42.0.202606242140

package b.ⁱᵔ;

import android.app.Activity;
import android.app.AlertDialog.Builder;
import android.app.AlertDialog;
import android.app.Dialog;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.text.Html;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.style.ForegroundColorSpan;
import android.util.DisplayMetrics;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.WindowManager.LayoutParams;
import android.view.WindowManager;
import android.widget.AutoCompleteTextView;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout.LayoutParams;
import android.widget.LinearLayout;
import android.widget.SearchView;
import android.widget.TextView;
import android.widget.Toolbar;
import b.ʻˑ.CLS11;
import b.ʻˑ.CLS16;
import b.ʻˑ.CLS17;
import b.ʻˑ.CLS18;
import b.ʻˑ.CLS563;
import b.ʻˑ.CLS7;
import b.ʻˑ.CLS8;
import b.ʾᵢ.CLS21;
import b.ʾᵢ.CLS27;
import b.ˊﾞ.CLS612;
import b.ˑٴ.CLS737;
import b.ˑٴ.CLS766;
import b.ˑٴ.CLS783;
import b.ᐧˉ.CLS1156;
import b.ᵔʾ.CLS1229;
import b.ᵔʾ.CLS1246;
import b.ⁱʾ.CLS341;
import b.ⁱʾ.CLS369;
import b.ⁱˉ.CLS370;
import b.ﾞˎ.CLS1617;
import b.ﾞˎ.CLS1622;
import b.ﾞˎ.CLS1624;
import b.ﾞˎ.CLS1635;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.concurrent.atomic.AtomicInteger;

public final class CLS523 {
    public static final AtomicInteger FLD5118;
    public static Dialog FLD5119;

    static {
        CLS523.FLD5118 = new AtomicInteger(1);
    }

    // 此方法包含解密的字符串
    public static void MTH7131(Activity activity0, String s, String s1, CLS16 ﾞˎ0) {
        CLS523.MTH7165(activity0, "", s, s1, 1, ﾞˎ0);
    }

    // 此方法包含解密的字符串
    public static int MTH7132(Activity activity0) {
        if(activity0 == null) {
            return 0;
        }
        WindowManager windowManager0 = (WindowManager)activity0.getSystemService("window");
        DisplayMetrics displayMetrics0 = new DisplayMetrics();
        windowManager0.getDefaultDisplay().getMetrics(displayMetrics0);
        return displayMetrics0.widthPixels;
    }

    public static CLS380 MTH7133(Activity activity0, String s, CLS379 ʼˎ$ᵔʾ0, CLS378 ʼˎ$ˆٴ0, CLS11 ᐧⁱ0) {
        CLS380 ʼˎ0 = new CLS380(activity0, s);
        ʼˎ0.FLD3518 = ʼˎ$ᵔʾ0;
        ʼˎ0.FLD3527 = ʼˎ$ˆٴ0;
        if(ᐧⁱ0 != null) {
            ʼˎ0.FLD3519 = new CLS1576(ᐧⁱ0, 1);
            ʼˎ0.FLD3517 = ᐧⁱ0;
        }
        ʼˎ0.show();
        return ʼˎ0;
    }

    public static void MTH7134(Activity activity0, String s, LinkedHashMap linkedHashMap0, CLS7 יᐧ0, BaseAdapter baseAdapter0) {
        try {
            if(CLS523.FLD5119 != null && CLS523.FLD5119.isShowing()) {
                CLS523.FLD5119.dismiss();
            }
        }
        catch(Throwable unused_ex) {
        }
        CLS523.FLD5119 = CLS523.MTH7162(false, activity0, s, ((CLS379)new CLS1246(activity0, baseAdapter0, יᐧ0, linkedHashMap0)), null, null);
    }

    public static CLS380 MTH7135(Activity activity0, String s, CLS379 ʼˎ$ᵔʾ0, CLS378 ʼˎ$ˆٴ0, CLS11 ᐧⁱ0, String s1) {
        CLS380 ʼˎ0 = new CLS380(activity0, s);
        ʼˎ0.FLD3526 = ʼˎ$ᵔʾ0;
        ʼˎ0.FLD3527 = ʼˎ$ˆٴ0;
        if(ᐧⁱ0 != null) {
            ʼˎ0.FLD3519 = new CLS1576(ᐧⁱ0, 0);
            ʼˎ0.FLD3517 = ᐧⁱ0;
            ʼˎ0.FLD3521 = s1;
        }
        ʼˎ0.show();
        return ʼˎ0;
    }

    public static Dialog MTH7136(boolean z, Activity activity0, String s, String s1, LinkedHashMap linkedHashMap0, boolean z1, CLS7 יᐧ0, CLS7 יᐧ1, CLS378 ʼˎ$ˆٴ0, boolean z2) {
        CLS369 ﾞᵎ0 = new CLS369(activity0, new ArrayList(linkedHashMap0.keySet()));
        Dialog[] arr_dialog = {null};
        Dialog dialog0 = CLS523.MTH7162(z, activity0, s, ((CLS379)new CLS1474(activity0, s1, ﾞᵎ0, z2, z1, arr_dialog, יᐧ0, linkedHashMap0, יᐧ1)), ((CLS378)new CLS1229(27, ʼˎ$ˆٴ0)), null);
        arr_dialog[0] = dialog0;
        return dialog0;
    }

    public static int MTH7137(int v) {
        return (int)(((float)v) * Resources.getSystem().getDisplayMetrics().density);
    }

    public static int MTH7138() {
        int v;
        if(Build.VERSION.SDK_INT >= 17) {
            return View.generateViewId();
        }
        do {
            v = CLS523.FLD5118.get();
        }
        while(!CLS523.FLD5118.compareAndSet(v, (v + 1 <= 0xFFFFFF ? v + 1 : 1)));
        return v;
    }

    public static void MTH7139(LinearLayout linearLayout0, View view0, int v) {
        if(linearLayout0 == null) {
            return;
        }
        view0.setPadding(0, 0, 0, v);
        linearLayout0.addView(view0, new LinearLayout.LayoutParams(-1, -2));
    }

    // 去混淆评级： 低(30)
    // 此方法包含解密的字符串
    public static boolean MTH7140() {
        return Build.VERSION.SDK_INT >= 21 ? true : CLS27.MTH894("CompatToolbarClass") != null;
    }

    // 此方法包含解密的字符串
    public static void MTH7141(SearchView searchView0) {
        if(searchView0 == null) {
            return;
        }
        if(!CLS522.MTH7114()) {
            return;
        }
        ImageView imageView0 = (ImageView)searchView0.findViewById(searchView0.getContext().getResources().getIdentifier("android:id/search_mag_icon", null, null));
        if(imageView0 != null) {
            Drawable drawable0 = imageView0.getDrawable();
            if(drawable0 != null) {
                CLS518.MTH7071(drawable0, CLS522.MTH7109());
                imageView0.setImageDrawable(drawable0);
            }
        }
        AutoCompleteTextView autoCompleteTextView0 = (AutoCompleteTextView)searchView0.findViewById(searchView0.getContext().getResources().getIdentifier("android:id/search_src_text", null, null));
        autoCompleteTextView0.setHintTextColor(CLS522.MTH7116());
        autoCompleteTextView0.setTextColor(CLS522.MTH7109());
    }

    // 此方法包含解密的字符串
    public static void MTH7142(Activity activity0, CLS11 ᐧⁱ0) {
        try {
            CLS523.MTH7160(activity0, CLS27.MTH889("delete"), ((CLS17)new CLS783(activity0, CLS27.MTH889("delete_confirmation"), false)), ᐧⁱ0);
        }
        catch(Throwable throwable0) {
            CLS27.MTH893(throwable0);
        }
    }

    public static void MTH7143(Activity activity0, String s, CLS379 ʼˎ$ᵔʾ0, CLS378 ʼˎ$ˆٴ0) {
        CLS523.MTH7135(activity0, s, ʼˎ$ᵔʾ0, ʼˎ$ˆٴ0, null, null);
    }

    // 此方法包含解密的字符串
    public static void MTH7144(Activity activity0, CLS8 ـˏ0, String s, ArrayList arrayList0) {
        CLS523.MTH7146(activity0, CLS27.MTH889("select"), arrayList0, ـˏ0, s);
    }

    public static AlertDialog MTH7145(Activity activity0, String s, CLS17 ﾞٴ0, CLS11 ᐧⁱ0) {
        return CLS523.MTH7160(activity0, s, ((CLS17)new CLS1487(activity0, ﾞٴ0, 0)), ᐧⁱ0);
    }

    public static void MTH7146(Activity activity0, String s, ArrayList arrayList0, CLS8 ـˏ0, String s1) {
        public final class CLS1611 implements CLS11 {
            public final CLS8 FLD5111;
            public final CLS341 FLD5112;

            public CLS1611(CLS8 ـˏ0, CLS341 ـﹳ0) {
                this.FLD5112 = ـﹳ0;
                super();
            }

            @Override  // b.ʻˑ.CLS11
            public final void MTH789() {
                CLS8 ـˏ0 = this.FLD5111;
                if(ـˏ0 != null) {
                    ـˏ0.MTH785();
                }
            }

            @Override  // b.ʻˑ.CLS11
            public final void MTH790() {
                CLS8 ـˏ0 = this.FLD5111;
                if(ـˏ0 != null) {
                    try {
                        ـˏ0.MTH786(this.FLD5112.MTH5150());
                    }
                    catch(Throwable throwable0) {
                        CLS27.MTH893(throwable0);
                    }
                }
            }
        }

        if(arrayList0.isEmpty()) {
            return;
        }
        CLS1624 יﹳ0 = new CLS1624(activity0);
        CLS341 ـﹳ0 = new CLS341(activity0, arrayList0, יﹳ0.FLD5272);
        CLS523.MTH7160(activity0, s, ((CLS17)new CLS766(יﹳ0, ـﹳ0, activity0, s1, arrayList0, 6)), ((CLS11)new CLS1611(ـˏ0, ـﹳ0)));
    }

    public static void MTH7147(LinearLayout linearLayout0, CLS18 ﾞᐧ0, boolean z) {
        if(z) {
            if(ﾞᐧ0 instanceof CLS1617 && !((CLS1617)ﾞᐧ0).FLD5151) {
                CLS523.MTH7154(linearLayout0, ((CLS18)(((CLS1617)ﾞᐧ0))), CLS523.MTH7137(10));
                return;
            }
            CLS523.MTH7161(linearLayout0, ﾞᐧ0, CLS523.MTH7137(11), CLS523.MTH7137(10), CLS523.MTH7137(10));
            return;
        }
        LinearLayout.LayoutParams linearLayout$LayoutParams0 = new LinearLayout.LayoutParams(-1, -2);
        View view0 = ﾞᐧ0.MTH803();
        view0.setPadding(CLS523.MTH7137(11), 0, CLS523.MTH7137(10), CLS523.MTH7137(10));
        if(linearLayout0 == null) {
            return;
        }
        linearLayout0.addView(view0, linearLayout$LayoutParams0);
    }

    public static void MTH7148(Activity activity0, String s, String s1, String s2, String s3, String s4, CLS16 ﾞˎ0) {
        CLS1622 ˑٴ0 = new CLS1622(activity0);
        CLS1622 ˑٴ1 = new CLS1622(activity0);
        CLS523.MTH7160(activity0, s, ((CLS17)new CLS1529(ˑٴ0, s1, s2, ˑٴ1, s3, s4, activity0)), ((CLS11)new CLS1502(ˑٴ0, ˑٴ1, ﾞˎ0)));
    }

    public static void MTH7149(MenuItem menuItem0, int v, int v1) {
        try {
            if(menuItem0 instanceof TextView) {
                ((TextView)menuItem0).setTextColor(v);
                ((TextView)menuItem0).setBackgroundColor(v1);
                return;
            }
            SpannableString spannableString0 = new SpannableString(CLS502.MTH6936(menuItem0.getTitle()));
            spannableString0.setSpan(new ForegroundColorSpan(v), 0, spannableString0.length(), 0);
            menuItem0.setTitle(spannableString0);
        }
        catch(Throwable throwable0) {
            CLS27.MTH893(throwable0);
        }
    }

    // 去混淆评级： 低(20)
    // 此方法包含解密的字符串
    public static AlertDialog MTH7150(Activity activity0, String s, CLS17 ﾞٴ0) {
        return CLS523.MTH7151(activity0, s, ﾞٴ0, null, "");
    }

    // 此方法包含解密的字符串
    public static AlertDialog MTH7151(Activity activity0, String s, CLS17 ﾞٴ0, CLS11 ᐧⁱ0, String s1) {
        AlertDialog alertDialog0;
        AlertDialog.Builder alertDialog$Builder0;
        try {
            String s2 = "";
            String s3 = "";
            new String("");
            new String("");
            new String("");
            boolean z = true;
            if(!TextUtils.isEmpty(s)) {
                if(s.contains("[[") && s.contains("]]")) {
                    int v = s.indexOf("[[");
                    int v1 = s.lastIndexOf("]]");
                    String s4 = s.substring(v + 2, v1);
                    s = s.substring(0, v) + s.substring(v1 + 2);
                    s2 = s4;
                }
                String s5 = "";
                if(s.contains("{") && s.contains("}")) {
                    int v2 = s.indexOf("{");
                    int v3 = s.lastIndexOf("}");
                    String s6 = s.substring(v2 + 1, v3);
                    s = s.substring(0, v2) + s.substring(v3 + 1);
                    s5 = s6;
                }
                String s7 = "";
                if(s.contains("((") && s.contains("))")) {
                    int v4 = s.indexOf("((");
                    int v5 = s.lastIndexOf("))");
                    String s8 = s.substring(v4 + 2, v5);
                    s = s.substring(0, v4) + s.substring(v5 + 2);
                    s7 = s8;
                }
                s5.getClass();
                s2.getClass();
                s7.getClass();
                s3 = s.trim();
            }
            if(!CLS522.MTH7114()) {
                if(!CLS27.MTH895().MTH938("force_light_alertdialog", false)) {
                    alertDialog$Builder0 = new AlertDialog.Builder(activity0);
                }
                else if(Build.VERSION.SDK_INT >= 22) {
                    alertDialog$Builder0 = new AlertDialog.Builder(activity0, 0x10302D2);
                }
                else {
                    alertDialog$Builder0 = new AlertDialog.Builder(activity0, 5);
                }
            }
            else if(!CLS27.MTH895().MTH938("force_dark_alertdialog", false)) {
                alertDialog$Builder0 = new AlertDialog.Builder(activity0);
            }
            else if(Build.VERSION.SDK_INT >= 22) {
                alertDialog$Builder0 = new AlertDialog.Builder(activity0, 0x10302D1);
            }
            else {
                alertDialog$Builder0 = new AlertDialog.Builder(activity0, 4);
            }
            LinearLayout linearLayout0 = new LinearLayout(activity0);
            LinearLayout.LayoutParams linearLayout$LayoutParams0 = new LinearLayout.LayoutParams(-1, -1);
            linearLayout0.setGravity(0x30);
            linearLayout0.setOrientation(1);
            linearLayout0.setFocusableInTouchMode(true);
            linearLayout0.setLayoutParams(linearLayout$LayoutParams0);
            Menu menu0 = CLS523.MTH7167(activity0, linearLayout0, s3);
            LinearLayout linearLayout1 = new LinearLayout(activity0);
            linearLayout1.setGravity(0x30);
            linearLayout1.setOrientation(1);
            linearLayout1.setFocusableInTouchMode(true);
            linearLayout1.setLayoutParams(linearLayout$LayoutParams0);
            linearLayout1.setBackgroundColor(CLS522.MTH7108());
            try {
                ﾞٴ0.MTH796(new Object[]{menu0, linearLayout1});
            }
            catch(Throwable throwable1) {
                CLS27.MTH893(throwable1);
            }
            if(!CLS523.MTH7140() || menu0 == null) {
                alertDialog$Builder0.setView(linearLayout1).setTitle(s3);
            }
            else {
                linearLayout0.addView(linearLayout1);
                alertDialog$Builder0.setView(linearLayout0);
            }
            if(ᐧⁱ0 == null) {
                alertDialog0 = alertDialog$Builder0.setPositiveButton(CLS27.MTH889("back"), new CLS458(0)).create();
                if(CLS522.MTH7114()) {
                    alertDialog0.setOnShowListener(new CLS520());
                }
            }
            else {
                alertDialog$Builder0.setPositiveButton(0x1040013, new CLS419(ᐧⁱ0, 0)).setNegativeButton(0x1040009, new CLS419(ᐧⁱ0, 1));
                if(!TextUtils.isEmpty(s1) && ᐧⁱ0 instanceof CLS563) {
                    alertDialog$Builder0.setNeutralButton(s1, new CLS419(ᐧⁱ0, 2));
                }
                else {
                    z = false;
                }
                alertDialog0 = alertDialog$Builder0.create();
                if(CLS522.MTH7114()) {
                    alertDialog0.setOnShowListener(new CLS384(z));
                }
            }
        }
        catch(Throwable throwable0) {
            CLS27.MTH893(throwable0);
            alertDialog0 = null;
        }
        if(alertDialog0 != null) {
            alertDialog0.show();
            int v6 = CLS27.MTH895().MTH927(0, "wx_custom_dialog_width");
            if(v6 != 0) {
                WindowManager.LayoutParams windowManager$LayoutParams0 = new WindowManager.LayoutParams();
                windowManager$LayoutParams0.copyFrom(alertDialog0.getWindow().getAttributes());
                windowManager$LayoutParams0.width = CLS523.MTH7137(v6);
                alertDialog0.getWindow().setAttributes(windowManager$LayoutParams0);
            }
        }
        return alertDialog0;
    }

    public static void MTH7152(View view0, Drawable drawable0) {
        if(view0 != null && drawable0 != null) {
            if(Build.VERSION.SDK_INT >= 16) {
                view0.setBackground(drawable0);
                return;
            }
            view0.setBackgroundDrawable(drawable0);
        }
    }

    public static void MTH7153(Activity activity0, String s, CLS379 ʼˎ$ᵔʾ0, CLS11 ᐧⁱ0) {
        CLS523.MTH7135(activity0, s, ʼˎ$ᵔʾ0, null, ᐧⁱ0, null);
    }

    public static void MTH7154(LinearLayout linearLayout0, CLS18 ﾞᐧ0, int v) {
        LinearLayout.LayoutParams linearLayout$LayoutParams0 = new LinearLayout.LayoutParams(-1, -2);
        linearLayout$LayoutParams0.setMargins(0, CLS523.MTH7137(2), 0, CLS523.MTH7137(2));
        View view0 = ﾞᐧ0.MTH803();
        if(v != 0) {
            view0.setPadding(0, 0, 0, v);
        }
        if(linearLayout0 != null) {
            linearLayout0.addView(view0, linearLayout$LayoutParams0);
        }
    }

    // 此方法包含解密的字符串
    public static void MTH7155(TextView textView0, String s) {
        if(textView0 == null) {
            return;
        }
        if(!CLS502.MTH6934(s, new String[]{"<"}) || !CLS502.MTH6934(s, new String[]{">"})) {
            textView0.setText(s);
        }
        else {
            textView0.setText(Html.fromHtml(s));
        }
        if(!TextUtils.isEmpty(s) && textView0.getVisibility() != 0) {
            textView0.setVisibility(0);
        }
    }

    public static Dialog MTH7156(boolean z, Activity activity0, String s, CLS379 ʼˎ$ᵔʾ0, CLS378 ʼˎ$ˆٴ0, CLS11 ᐧⁱ0, String s1) {
        return z ? CLS523.MTH7135(activity0, s, ʼˎ$ᵔʾ0, ʼˎ$ˆٴ0, ᐧⁱ0, s1) : CLS523.MTH7151(activity0, s, ((CLS17)new CLS1579(activity0, ʼˎ$ˆٴ0, ʼˎ$ᵔʾ0, 0)), ᐧⁱ0, s1);
    }

    public static void MTH7157(boolean z, CLS18[] arr_ﾞᐧ) {
        if(z) {
            for(int v = 0; v < arr_ﾞᐧ.length; ++v) {
                CLS18 ﾞᐧ0 = arr_ﾞᐧ[v];
                if(ﾞᐧ0 != null) {
                    ﾞᐧ0.MTH801(8);
                }
            }
            return;
        }
        for(int v1 = 0; v1 < arr_ﾞᐧ.length; ++v1) {
            CLS18 ﾞᐧ1 = arr_ﾞᐧ[v1];
            if(ﾞᐧ1 != null) {
                ﾞᐧ1.MTH801(0);
            }
        }
    }

    public static void MTH7158(LinearLayout linearLayout0, View view0, boolean z) {
        LinearLayout.LayoutParams linearLayout$LayoutParams0;
        if(linearLayout0 != null && view0 != null) {
            if(z) {
                linearLayout$LayoutParams0 = new LinearLayout.LayoutParams(-1, -2);
                linearLayout$LayoutParams0.setMargins(0, CLS523.MTH7137(2), 0, CLS523.MTH7137(2));
                view0.setPadding(CLS523.MTH7137(11), 0, CLS523.MTH7137(10), CLS523.MTH7137(10));
            }
            else {
                view0.setPadding(CLS523.MTH7137(11), 0, CLS523.MTH7137(10), 0);
                linearLayout$LayoutParams0 = new LinearLayout.LayoutParams(-1, -2);
            }
            linearLayout0.addView(view0, linearLayout$LayoutParams0);
        }
    }

    public static void MTH7159(Activity activity0, String s, LinkedHashMap linkedHashMap0, CLS7 יᐧ0) {
        CLS523.MTH7134(activity0, s, linkedHashMap0, יᐧ0, new CLS369(activity0, new ArrayList(linkedHashMap0.keySet())));
    }

    // 去混淆评级： 低(20)
    // 此方法包含解密的字符串
    public static AlertDialog MTH7160(Activity activity0, String s, CLS17 ﾞٴ0, CLS11 ᐧⁱ0) {
        return CLS523.MTH7151(activity0, s, ﾞٴ0, ᐧⁱ0, "");
    }

    public static void MTH7161(LinearLayout linearLayout0, CLS18 ﾞᐧ0, int v, int v1, int v2) {
        LinearLayout.LayoutParams linearLayout$LayoutParams0 = new LinearLayout.LayoutParams(-1, -2);
        linearLayout$LayoutParams0.setMargins(0, CLS523.MTH7137(2), 0, CLS523.MTH7137(2));
        View view0 = ﾞᐧ0.MTH803();
        view0.setPadding(v, 0, v1, v2);
        if(linearLayout0 == null) {
            return;
        }
        linearLayout0.addView(view0, linearLayout$LayoutParams0);
    }

    public static Dialog MTH7162(boolean z, Activity activity0, String s, CLS379 ʼˎ$ᵔʾ0, CLS378 ʼˎ$ˆٴ0, CLS11 ᐧⁱ0) {
        return CLS523.MTH7156(z, activity0, s, ʼˎ$ᵔʾ0, ʼˎ$ˆٴ0, ᐧⁱ0, null);
    }

    public static void MTH7163(boolean z, Activity activity0, String s, ArrayList arrayList0, CLS7 יᐧ0) {
        Dialog[] arr_dialog = {null};
        arr_dialog[0] = CLS523.MTH7162(z, activity0, s, ((CLS379)new CLS612(activity0, arrayList0, arr_dialog, יᐧ0, 15)), null, null);
    }

    // 此方法包含解密的字符串
    public static void MTH7164(Activity activity0, CLS16 ﾞˎ0) {
        public final class CLS1612 implements CLS11 {
            public final CLS1622 FLD5113;
            public final CLS16 FLD5114;
            public final CLS1635 FLD5115;

            public CLS1612(CLS1622 ˑٴ0, CLS1635 ﾞᵎ0, CLS16 ﾞˎ0) {
                this.FLD5115 = ﾞᵎ0;
                this.FLD5114 = ﾞˎ0;
                super();
            }

            @Override  // b.ʻˑ.CLS11
            public final void MTH789() {
            }

            // 此方法包含解密的字符串
            @Override  // b.ʻˑ.CLS11
            public final void MTH790() {
                try {
                    String s = this.FLD5113.MTH7285();
                    if(TextUtils.isEmpty(s)) {
                        return;
                    }
                    if(this.FLD5115.MTH7444()) {
                        s = "^" + s + "$";
                    }
                    CLS16 ﾞˎ0 = this.FLD5114;
                    if(ﾞˎ0 != null) {
                        ﾞˎ0.MTH795(s.trim());
                    }
                }
                catch(Throwable throwable0) {
                    CLS27.MTH893(throwable0);
                }
            }
        }

        CLS1622 ˑٴ0 = new CLS1622(activity0);
        CLS1635 ﾞᵎ0 = new CLS1635(activity0);
        ﾞᵎ0.MTH800(CLS27.MTH889("exact_match"));
        CLS523.MTH7160(activity0, CLS27.MTH889("add_keyword"), ((CLS17)new CLS1156(ﾞᵎ0, ˑٴ0, 15)), ((CLS11)new CLS1612(ˑٴ0, ﾞᵎ0, ﾞˎ0)));
    }

    public static void MTH7165(Activity activity0, String s, String s1, String s2, int v, CLS16 ﾞˎ0) {
        public final class CLS1613 implements CLS11 {
            public final CLS1622 FLD5116;
            public final CLS16 FLD5117;

            public CLS1613(CLS1622 ˑٴ0, CLS16 ﾞˎ0) {
                this.FLD5117 = ﾞˎ0;
                super();
            }

            @Override  // b.ʻˑ.CLS11
            public final void MTH789() {
            }

            @Override  // b.ʻˑ.CLS11
            public final void MTH790() {
                try {
                    String s = this.FLD5116.MTH7285();
                    CLS16 ﾞˎ0 = this.FLD5117;
                    if(ﾞˎ0 != null) {
                        ﾞˎ0.MTH795(s);
                    }
                }
                catch(Throwable throwable0) {
                    CLS27.MTH893(throwable0);
                }
            }
        }

        CLS1622 ˑٴ0 = new CLS1622(activity0);
        AlertDialog alertDialog0 = CLS523.MTH7160(activity0, s, ((CLS17)new CLS737(ˑٴ0, s1, v, s2)), ((CLS11)new CLS1613(ˑٴ0, ﾞˎ0)));
        if(alertDialog0 != null) {
            alertDialog0.getWindow().setSoftInputMode(5);
        }
    }

    // 去混淆评级： 低(30)
    // 此方法包含解密的字符串
    public static void MTH7166(TextView textView0, boolean z) {
        textView0.setContentDescription(textView0.getText() + "\n" + CLS27.MTH889("status") + CLS27.MTH889(CLS370.MTH5289((z ? 4101224736501846837L : 0x38EA7A352B3CD335L))));
    }

    // 去混淆评级： 低(20)
    // 此方法包含解密的字符串
    public static Menu MTH7167(Activity activity0, LinearLayout linearLayout0, String s) {
        return (Menu)CLS21.FLD76.MTH836("getToolbar", new Object[]{activity0, linearLayout0, s});
    }

    public static void MTH7168(Toolbar toolbar0, int v) {
        try {
            if(Build.VERSION.SDK_INT < 23) {
                return;
            }
            Drawable drawable0 = toolbar0.getOverflowIcon();
            if(drawable0 == null) {
                return;
            }
            Drawable drawable1 = drawable0.mutate();
            CLS518.MTH7071(drawable0, v);
            toolbar0.setOverflowIcon(drawable1);
        }
        catch(Throwable throwable0) {
            CLS27.MTH893(throwable0);
        }
    }

    public static void MTH7169(Activity activity0, String s, CLS379 ʼˎ$ᵔʾ0) {
        CLS523.MTH7135(activity0, s, ʼˎ$ᵔʾ0, null, null, null);
    }
}

