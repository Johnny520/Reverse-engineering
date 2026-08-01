// Decompiled by JEB v5.42.0.202606242140

package d.ˑʽ;

import android.app.Activity;
import android.app.AlertDialog.Builder;
import android.app.AlertDialog;
import android.app.Dialog;
import android.content.res.Resources;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.text.Html;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.style.ForegroundColorSpan;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.WindowManager.LayoutParams;
import android.widget.AutoCompleteTextView;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout.LayoutParams;
import android.widget.LinearLayout;
import android.widget.SearchView;
import android.widget.TextView;
import d.יʻ.CLS62;
import d.יʻ.CLS69;
import d.ٴˑ.CLS180;
import d.ٴˑ.CLS190;
import d.ᐧˈ.CLS205;
import d.ᐧˏ.CLS108;
import d.ⁱٴ.CLS120;
import d.ⁱٴ.CLS122;
import d.ⁱٴ.CLS124;
import d.ⁱٴ.CLS125;
import d.ⁱٴ.CLS126;
import d.ⁱٴ.CLS211;
import java.util.LinkedHashMap;
import java.util.concurrent.atomic.AtomicInteger;

public final class CLS45 {
    public static Dialog FLD231;
    public static final AtomicInteger FLD232;

    static {
        CLS45.FLD232 = new AtomicInteger(1);
    }

    // 此方法包含解密的字符串
    public static AlertDialog MTH652(Activity activity0, String s, CLS124 ᵎʻ0, CLS126 ⁱﾞ0, String s1) {
        AlertDialog alertDialog0;
        AlertDialog.Builder alertDialog$Builder0;
        String s4;
        String s3;
        try {
            String s2 = "";
            boolean z = true;
            if(!TextUtils.isEmpty(s)) {
                if(!s.contains("[[") || !s.contains("]]")) {
                    s3 = "";
                }
                else {
                    int v = s.indexOf("[[");
                    int v1 = s.lastIndexOf("]]");
                    s3 = s.substring(v + 2, v1);
                    s = s.substring(0, v) + s.substring(v1 + 2);
                }
                if(!s.contains("{") || !s.contains("}")) {
                    s4 = "";
                }
                else {
                    int v2 = s.indexOf("{");
                    int v3 = s.lastIndexOf("}");
                    s4 = s.substring(v2 + 1, v3);
                    s = s.substring(0, v2) + s.substring(v3 + 1);
                }
                if(s.contains("((") && s.contains("))")) {
                    int v4 = s.indexOf("((");
                    int v5 = s.lastIndexOf("))");
                    String s5 = s.substring(v4 + 2, v5);
                    s = s.substring(0, v4) + s.substring(v5 + 2);
                    s2 = s5;
                }
                s4.getClass();
                s3.getClass();
                s2.getClass();
                s2 = s.trim();
            }
            if(!CLS43.MTH639()) {
                if(!CLS69.MTH801().MTH748("force_light_alertdialog", false)) {
                    alertDialog$Builder0 = new AlertDialog.Builder(activity0);
                }
                else if(Build.VERSION.SDK_INT >= 22) {
                    alertDialog$Builder0 = new AlertDialog.Builder(activity0, 0x10302D2);
                }
                else {
                    alertDialog$Builder0 = new AlertDialog.Builder(activity0, 5);
                }
            }
            else if(!CLS69.MTH801().MTH748("force_dark_alertdialog", false)) {
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
            Menu menu0 = (Menu)CLS62.FLD317.MTH761("getToolbar", new Object[]{activity0, linearLayout0, s2});
            LinearLayout linearLayout1 = new LinearLayout(activity0);
            linearLayout1.setGravity(0x30);
            linearLayout1.setOrientation(1);
            linearLayout1.setFocusableInTouchMode(true);
            linearLayout1.setLayoutParams(linearLayout$LayoutParams0);
            linearLayout1.setBackgroundColor(Color.parseColor(CLS108.MTH1103((CLS43.MTH639() ? 0xFFFF5B7B2DFB3E45L : -180924725903803L))));
            try {
                ᵎʻ0.MTH1175(new Object[]{menu0, linearLayout1});
            }
            catch(Throwable throwable1) {
                CLS69.MTH797(throwable1);
            }
            if(!CLS45.MTH663() || menu0 == null) {
                alertDialog$Builder0.setView(linearLayout1).setTitle(s2);
            }
            else {
                linearLayout0.addView(linearLayout1);
                alertDialog$Builder0.setView(linearLayout0);
            }
            if(ⁱﾞ0 == null) {
                alertDialog0 = alertDialog$Builder0.setPositiveButton(CLS69.MTH795("back"), new CLS39()).create();
                if(CLS43.MTH639()) {
                    alertDialog0.setOnShowListener(new CLS26());
                }
            }
            else {
                alertDialog$Builder0.setPositiveButton(0x1040013, new CLS11(ⁱﾞ0, 0)).setNegativeButton(0x1040009, new CLS11(ⁱﾞ0, 1));
                if(!TextUtils.isEmpty(s1) && ⁱﾞ0 instanceof CLS211) {
                    alertDialog$Builder0.setNeutralButton(s1, new CLS11(ⁱﾞ0, 2));
                }
                else {
                    z = false;
                }
                alertDialog0 = alertDialog$Builder0.create();
                if(CLS43.MTH639()) {
                    alertDialog0.setOnShowListener(new CLS6(z));
                }
            }
        }
        catch(Throwable throwable0) {
            CLS69.MTH797(throwable0);
            alertDialog0 = null;
        }
        if(alertDialog0 != null) {
            alertDialog0.show();
            int v6 = CLS69.MTH801().MTH745("wx_custom_dialog_width", 0);
            if(v6 != 0) {
                WindowManager.LayoutParams windowManager$LayoutParams0 = new WindowManager.LayoutParams();
                windowManager$LayoutParams0.copyFrom(alertDialog0.getWindow().getAttributes());
                windowManager$LayoutParams0.width = CLS45.MTH662(v6);
                alertDialog0.getWindow().setAttributes(windowManager$LayoutParams0);
            }
        }
        return alertDialog0;
    }

    // 去混淆评级： 低(20)
    // 此方法包含解密的字符串
    public static AlertDialog MTH653(Activity activity0, String s, CLS124 ᵎʻ0, CLS126 ⁱﾞ0) {
        return CLS45.MTH652(activity0, s, ᵎʻ0, ⁱﾞ0, "");
    }

    public static void MTH654(MenuItem menuItem0, int v, int v1) {
        try {
            if(menuItem0 instanceof TextView) {
                ((TextView)menuItem0).setTextColor(v);
                ((TextView)menuItem0).setBackgroundColor(v1);
                return;
            }
            SpannableString spannableString0 = new SpannableString(menuItem0.getTitle().toString());
            spannableString0.setSpan(new ForegroundColorSpan(v), 0, spannableString0.length(), 0);
            menuItem0.setTitle(spannableString0);
        }
        catch(Throwable throwable0) {
            CLS69.MTH797(throwable0);
        }
    }

    public static void MTH655(Activity activity0, String s, String s1, String s2, int v, CLS122 ᐧˈ0) {
        public final class CLS161 implements CLS126 {
            public final CLS122 FLD229;
            public final CLS190 FLD230;

            public CLS161(CLS190 ᵎᐧ0, CLS122 ᐧˈ0) {
                this.FLD229 = ᐧˈ0;
                super();
            }

            @Override  // d.ⁱٴ.CLS126
            public final void MTH1183() {
                try {
                    String s = this.FLD230.MTH1023();
                    CLS122 ᐧˈ0 = this.FLD229;
                    if(ᐧˈ0 != null) {
                        ᐧˈ0.MTH1173(s);
                    }
                }
                catch(Throwable throwable0) {
                    CLS69.MTH797(throwable0);
                }
            }

            @Override  // d.ⁱٴ.CLS126
            public final void MTH1184() {
            }
        }

        CLS190 ᵎᐧ0 = new CLS190(activity0);
        AlertDialog alertDialog0 = CLS45.MTH653(activity0, s, ((CLS124)new CLS166(ᵎᐧ0, s1, v, s2)), ((CLS126)new CLS161(ᵎᐧ0, ᐧˈ0)));
        if(alertDialog0 != null) {
            alertDialog0.getWindow().setSoftInputMode(5);
        }
    }

    public static void MTH656(boolean z, Activity activity0, String s, LinkedHashMap linkedHashMap0, boolean z1, CLS120 ˑʽ0, BaseAdapter baseAdapter0) {
        try {
            if(CLS45.FLD231 != null && CLS45.FLD231.isShowing()) {
                CLS45.FLD231.dismiss();
            }
        }
        catch(Throwable unused_ex) {
        }
        CLS146 ˉᵢ0 = new CLS146(activity0, baseAdapter0, z1, ˑʽ0, linkedHashMap0);
        CLS10 ʻﹶ0 = z ? CLS45.MTH661(activity0, s, ((CLS8)ˉᵢ0), null, null) : CLS45.MTH652(activity0, s, ((CLS124)new CLS205(activity0, null, ˉᵢ0, 1)), null, null);
        CLS45.FLD231 = ʻﹶ0;
    }

    public static void MTH657(View view0, Drawable drawable0) {
        if(view0 != null) {
            if(Build.VERSION.SDK_INT >= 16) {
                view0.setBackground(drawable0);
                return;
            }
            view0.setBackgroundDrawable(drawable0);
        }
    }

    // 此方法包含解密的字符串
    public static void MTH658(TextView textView0, String s) {
        if(textView0 == null) {
            return;
        }
        if(TextUtils.isEmpty(s) || !s.contains("<") || !s.contains(">")) {
            textView0.setText(s);
        }
        else {
            textView0.setText(Html.fromHtml(s));
        }
        if(!TextUtils.isEmpty(s) && textView0.getVisibility() != 0) {
            textView0.setVisibility(0);
        }
    }

    public static void MTH659(boolean z, CLS125[] arr_ⁱٴ) {
        if(z) {
            for(int v = 0; v < arr_ⁱٴ.length; ++v) {
                CLS125 ⁱٴ0 = arr_ⁱٴ[v];
                if(ⁱٴ0 != null) {
                    ⁱٴ0.MTH1177(8);
                }
            }
            return;
        }
        for(int v1 = 0; v1 < arr_ⁱٴ.length; ++v1) {
            CLS125 ⁱٴ1 = arr_ⁱٴ[v1];
            if(ⁱٴ1 != null) {
                ⁱٴ1.MTH1177(0);
            }
        }
    }

    public static void MTH660(LinearLayout linearLayout0, CLS125 ⁱٴ0) {
        if(ⁱٴ0 instanceof CLS180 && !((CLS180)ⁱٴ0).FLD384) {
            CLS45.MTH667(linearLayout0, ((CLS125)(((CLS180)ⁱٴ0))), CLS45.MTH662(10));
            return;
        }
        CLS45.MTH666(linearLayout0, ⁱٴ0, CLS45.MTH662(11), CLS45.MTH662(10), CLS45.MTH662(10));
    }

    public static CLS10 MTH661(Activity activity0, String s, CLS8 ʻﹶ$יʻ0, CLS9 ʻﹶ$ᐧי0, CLS126 ⁱﾞ0) {
        CLS10 ʻﹶ0 = new CLS10(activity0, s);
        ʻﹶ0.FLD47 = ʻﹶ$יʻ0;
        ʻﹶ0.FLD52 = ʻﹶ$ᐧי0;
        CLS46.FLD233.FLD234.add(ʻﹶ0);
        ʻﹶ0.FLD43 = new CLS150(ʻﹶ0, ⁱﾞ0, 0);
        ʻﹶ0.show();
        return ʻﹶ0;
    }

    public static int MTH662(int v) {
        return (int)(((float)v) * Resources.getSystem().getDisplayMetrics().density);
    }

    // 去混淆评级： 低(30)
    // 此方法包含解密的字符串
    public static boolean MTH663() {
        return Build.VERSION.SDK_INT >= 21 ? true : CLS69.MTH811("CompatToolbarClass") != null;
    }

    // 此方法包含解密的字符串
    public static void MTH664(SearchView searchView0) {
        if(searchView0 == null) {
            return;
        }
        if(!CLS43.MTH639()) {
            return;
        }
        ImageView imageView0 = (ImageView)searchView0.findViewById(searchView0.getContext().getResources().getIdentifier("android:id/search_mag_icon", null, null));
        if(imageView0 != null) {
            Drawable drawable0 = imageView0.getDrawable();
            if(drawable0 != null) {
                CLS5.MTH394(drawable0, CLS43.MTH646());
                imageView0.setImageDrawable(drawable0);
            }
        }
        AutoCompleteTextView autoCompleteTextView0 = (AutoCompleteTextView)searchView0.findViewById(searchView0.getContext().getResources().getIdentifier("android:id/search_src_text", null, null));
        autoCompleteTextView0.setHintTextColor(CLS43.MTH640());
        autoCompleteTextView0.setTextColor(CLS43.MTH646());
    }

    public static void MTH665(LinearLayout linearLayout0, View view0) {
        if(linearLayout0 != null) {
            view0.setPadding(0, 0, 0, 0);
            linearLayout0.addView(view0, new LinearLayout.LayoutParams(-1, -2));
        }
    }

    public static void MTH666(LinearLayout linearLayout0, CLS125 ⁱٴ0, int v, int v1, int v2) {
        LinearLayout.LayoutParams linearLayout$LayoutParams0 = new LinearLayout.LayoutParams(-1, -2);
        linearLayout$LayoutParams0.setMargins(0, CLS45.MTH662(2), 0, CLS45.MTH662(2));
        View view0 = ⁱٴ0.MTH1182();
        view0.setPadding(v, 0, v1, v2);
        if(linearLayout0 == null) {
            return;
        }
        linearLayout0.addView(view0, linearLayout$LayoutParams0);
    }

    public static void MTH667(LinearLayout linearLayout0, CLS125 ⁱٴ0, int v) {
        LinearLayout.LayoutParams linearLayout$LayoutParams0 = new LinearLayout.LayoutParams(-1, -2);
        linearLayout$LayoutParams0.setMargins(0, CLS45.MTH662(2), 0, CLS45.MTH662(2));
        View view0 = ⁱٴ0.MTH1182();
        if(v != 0) {
            view0.setPadding(0, 0, 0, v);
        }
        if(linearLayout0 != null) {
            linearLayout0.addView(view0, linearLayout$LayoutParams0);
        }
    }

    public static int MTH668() {
        int v;
        if(Build.VERSION.SDK_INT >= 17) {
            return View.generateViewId();
        }
        do {
            v = CLS45.FLD232.get();
        }
        while(!CLS45.FLD232.compareAndSet(v, (v + 1 <= 0xFFFFFF ? v + 1 : 1)));
        return v;
    }
}

