// Decompiled by JEB v5.42.0.202606242140

package c.ˏᵎ;

import android.app.Activity;
import android.app.AlertDialog.Builder;
import android.app.AlertDialog;
import android.app.Dialog;
import android.content.DialogInterface;
import android.content.res.Resources;
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
import android.widget.AdapterView;
import android.widget.AutoCompleteTextView;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout.LayoutParams;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.SearchView;
import android.widget.TextView;
import android.widget.Toolbar.LayoutParams;
import android.widget.Toolbar;
import c.ʾˎ.CLS41;
import c.ˆﾞ.CLS54;
import c.ˉˆ.CLS64;
import c.ˊﹶ.CLS98;
import c.יⁱ.CLS256;
import c.ᴵˉ.CLS283;
import c.ᴵˉ.CLS594;
import c.ᴵˉ.CLS596;
import c.ᴵˉ.CLS597;
import c.ᴵˉ.CLS599;
import c.ᴵˉ.CLS601;
import c.ᴵˉ.CLS604;
import c.ﹶˆ.CLS341;
import c.ﹶˆ.CLS342;
import c.ﹶˆ.CLS343;
import c.ﹶˆ.CLS344;
import c.ﹶˆ.CLS345;
import c.ﹶˆ.CLS346;
import c.ﹶˆ.CLS816;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.concurrent.atomic.AtomicInteger;

public class CLS144 {
    public static final AtomicInteger FLD616;
    public static Dialog FLD617;

    static {
        CLS144.FLD616 = new AtomicInteger(1);
    }

    // 此方法包含解密的字符串
    public static AlertDialog MTH2153(Activity activity0, String s, CLS342 ˉˎ0, CLS343 ˋʼ0, String s1) {
        CLS172 ˏי0;
        AlertDialog alertDialog0;
        AlertDialog.Builder alertDialog$Builder0;
        try {
            boolean z = false;
            if(!CLS226.MTH3102()) {
                if(!CLS98.MTH1297().MTH994("force_light_alertdialog", false)) {
                    alertDialog$Builder0 = new AlertDialog.Builder(activity0);
                }
                else if(Build.VERSION.SDK_INT >= 22) {
                    alertDialog$Builder0 = new AlertDialog.Builder(activity0, 0x10302D2);
                }
                else {
                    alertDialog$Builder0 = new AlertDialog.Builder(activity0, 5);
                }
            }
            else if(!CLS98.MTH1297().MTH994("force_dark_alertdialog", false)) {
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
            Menu menu0 = CLS144.MTH2171(activity0, linearLayout0, "");
            LinearLayout linearLayout1 = new LinearLayout(activity0);
            linearLayout1.setGravity(0x30);
            linearLayout1.setOrientation(1);
            linearLayout1.setFocusableInTouchMode(true);
            linearLayout1.setLayoutParams(linearLayout$LayoutParams0);
            linearLayout1.setBackgroundColor(CLS226.MTH3107());
            if(ˉˎ0 != null) {
                try {
                    ˉˎ0.MTH4825(new Object[]{menu0, linearLayout1});
                }
                catch(Throwable throwable1) {
                    CLS185.MTH2708(throwable1);
                }
            }
            if(!CLS144.MTH2183() || menu0 == null) {
                alertDialog$Builder0.setView(linearLayout1).setTitle("");
            }
            else {
                linearLayout0.addView(linearLayout1);
                alertDialog$Builder0.setView(linearLayout0);
            }
            if(ˋʼ0 == null) {
                alertDialog0 = alertDialog$Builder0.setPositiveButton("", new CLS174()).create();
                if(CLS226.MTH3102()) {
                    ˏי0 = (DialogInterface dialogInterface0) -> CLS144.MTH2182(((AlertDialog)dialogInterface0).getButton(-1), CLS226.MTH3099());
                    alertDialog0.setOnShowListener(ˏי0);
                    return alertDialog0;
                }
            }
            else {
                alertDialog$Builder0.setPositiveButton(0x1040013, (DialogInterface dialogInterface0, int v) -> try {
                    ˋʼ0.MTH4827();
                }
                catch(Throwable throwable0) {
                    CLS185.MTH2708(throwable0);
                }).setNegativeButton(0x1040009, (DialogInterface dialogInterface0, int v) -> try {
                    ˋʼ0.MTH4826();
                }
                catch(Throwable throwable0) {
                    CLS185.MTH2708(throwable0);
                });
                if(!TextUtils.isEmpty(s1) && ˋʼ0 instanceof CLS816) {
                    z = true;
                    alertDialog$Builder0.setNeutralButton(s1, (DialogInterface dialogInterface0, int v) -> try {
                        ((CLS816)ˋʼ0).MTH4824();
                    }
                    catch(Throwable throwable0) {
                        CLS185.MTH2708(throwable0);
                    });
                }
                alertDialog0 = alertDialog$Builder0.create();
                if(CLS226.MTH3102()) {
                    ˏי0 = (DialogInterface dialogInterface0) -> {
                        CLS144.MTH2182(((AlertDialog)dialogInterface0).getButton(-1), CLS226.MTH3099());
                        CLS144.MTH2182(((AlertDialog)dialogInterface0).getButton(-2), CLS226.MTH3099());
                        if(z) {
                            CLS144.MTH2182(((AlertDialog)dialogInterface0).getButton(-3), CLS226.MTH3099());
                        }
                    };
                    alertDialog0.setOnShowListener(ˏי0);
                    return alertDialog0;
                }
            }
            return alertDialog0;
        }
        catch(Throwable throwable0) {
            CLS185.MTH2708(throwable0);
            return null;
        }
    }

    public static void MTH2154(CLS604 ﾞʿ0, String s, int v, String s1, Object[] arr_object) {
        LinearLayout linearLayout0 = (LinearLayout)arr_object[1];
        ﾞʿ0.MTH3730(s);
        ﾞʿ0.MTH3732(v);
        if(!TextUtils.isEmpty(s1)) {
            ﾞʿ0.MTH3735(s1);
        }
        CLS144.MTH2191(linearLayout0, ((CLS341)ﾞʿ0), true);
    }

    public static void MTH2155(DialogInterface dialogInterface0, int v) {
    }

    public static void MTH2156(Toolbar toolbar0, int v) {
        try {
            if(Build.VERSION.SDK_INT < 23) {
                return;
            }
            Drawable drawable0 = toolbar0.getOverflowIcon();
            if(drawable0 == null) {
                return;
            }
            Drawable drawable1 = drawable0.mutate();
            CLS169.MTH2328(drawable0, v);
            toolbar0.setOverflowIcon(drawable1);
        }
        catch(Throwable throwable0) {
            CLS185.MTH2708(throwable0);
        }
    }

    public static CLS137 MTH2157(Activity activity0, String s, CLS136 ʼﾞ$ﾞⁱ0, CLS135 ʼﾞ$ⁱˋ0, CLS343 ˋʼ0, String s1) {
        CLS137 ʼﾞ0 = new CLS137(activity0, s);
        ʼﾞ0.MTH2034(ʼﾞ$ﾞⁱ0);
        ʼﾞ0.MTH2050(ʼﾞ$ⁱˋ0);
        if(ˋʼ0 != null) {
            ʼﾞ0.MTH2046(((CLS345)new CLS518(ˋʼ0)));
            ʼﾞ0.MTH2035(ˋʼ0);
            ʼﾞ0.MTH2048(s1);
        }
        ʼﾞ0.show();
        return ʼﾞ0;
    }

    public static Dialog MTH2158(boolean z, Activity activity0, String s, CLS136 ʼﾞ$ﾞⁱ0, CLS135 ʼﾞ$ⁱˋ0, CLS343 ˋʼ0) {
        return CLS144.MTH2206(z, activity0, s, ʼﾞ$ﾞⁱ0, ʼﾞ$ⁱˋ0, ˋʼ0, null);
    }

    // 去混淆评级： 低(40)
    // 此方法包含解密的字符串
    public static void MTH2160(TextView textView0, boolean z) {
        textView0.setContentDescription(textView0.getText() + "\n" + "" + CLS98.MTH1302(CLS41.MTH858((z ? 0xFFFF639029CA8378L : -171944019590280L))));
    }

    public static int MTH2162() {
        int v;
        if(Build.VERSION.SDK_INT >= 17) {
            return View.generateViewId();
        }
        do {
            v = CLS144.FLD616.get();
        }
        while(!CLS144.FLD616.compareAndSet(v, (v + 1 <= 0xFFFFFF ? v + 1 : 1)));
        return v;
    }

    // 检测为 Lambda 实现
    public static void MTH2163(boolean z, CLS344 ᵔʼ0, ListAdapter listAdapter0, LinkedHashMap linkedHashMap0, AdapterView adapterView0, View view0, int v, long v1) [...]

    public static AlertDialog MTH2165(Activity activity0, String s, String s1, CLS343 ˋʼ0) {
        return CLS144.MTH2205(activity0, s, s1, true, ˋʼ0);
    }

    // 此方法包含解密的字符串
    public static void MTH2167(Activity activity0, CLS343 ˋʼ0) {
        try {
            CLS144.MTH2165(activity0, "", "", ˋʼ0);
        }
        catch(Throwable throwable0) {
            CLS185.MTH2708(throwable0);
        }
    }

    // 去混淆评级： 低(20)
    // 此方法包含解密的字符串
    public static AlertDialog MTH2169(Activity activity0, String s, CLS342 ˉˎ0) {
        return CLS144.MTH2213(activity0, s, ˉˎ0, null, "");
    }

    public static Menu MTH2171(Activity activity0, LinearLayout linearLayout0, String s) {
        if(Build.VERSION.SDK_INT >= 21) {
            try {
                Toolbar toolbar0 = new Toolbar(activity0);
                toolbar0.setLayoutParams(new Toolbar.LayoutParams(-1, -2));
                if(CLS226.MTH3102()) {
                    toolbar0.setPopupTheme(0x103024B);
                }
                else {
                    toolbar0.setPopupTheme(0x103024A);
                }
                toolbar0.setBackgroundColor(CLS226.MTH3108());
                if(!TextUtils.isEmpty(s)) {
                    toolbar0.setTitle(s);
                    toolbar0.setTitleTextColor(CLS226.MTH3100());
                }
                CLS144.MTH2156(toolbar0, CLS226.MTH3104());
                CLS144.MTH2176(linearLayout0, toolbar0);
                return toolbar0.getMenu();
            }
            catch(Throwable throwable0) {
                CLS185.MTH2708(throwable0);
            }
        }
        return CLS144.MTH2211(activity0, linearLayout0, s);
    }

    public static void MTH2172(Activity activity0, String s, String s1, String s2, int v, CLS346 ﾞʿ0) {
        public class CLS498 implements CLS343 {
            public final CLS604 FLD614;
            public final CLS346 FLD615;

            public CLS498(CLS604 ﾞʿ0, CLS346 ﾞʿ1) {
                this.FLD615 = ﾞʿ1;
                super();
            }

            @Override  // c.ﹶˆ.CLS343
            public void MTH4826() {
            }

            @Override  // c.ﹶˆ.CLS343
            public void MTH4827() {
                try {
                    String s = this.FLD614.MTH3728();
                    CLS346 ﾞʿ0 = this.FLD615;
                    if(ﾞʿ0 != null) {
                        ﾞʿ0.MTH4830(s);
                    }
                }
                catch(Throwable throwable0) {
                    CLS185.MTH2708(throwable0);
                }
            }
        }

        CLS604 ﾞʿ1 = new CLS604(activity0);
        AlertDialog alertDialog0 = CLS144.MTH2214(activity0, s, ((CLS342)new CLS567(ﾞʿ1, s1, v, s2)), ((CLS343)new CLS498(ﾞʿ1, ﾞʿ0)));
        if(alertDialog0 != null) {
            alertDialog0.getWindow().setSoftInputMode(5);
        }
    }

    public static void MTH2173(DialogInterface dialogInterface0, int v) {
    }

    public static int MTH2175(int v) {
        return (int)(((float)v) * Resources.getSystem().getDisplayMetrics().density);
    }

    public static void MTH2176(LinearLayout linearLayout0, View view0) {
        CLS144.MTH2196(linearLayout0, view0, 0);
    }

    public static void MTH2177(LinearLayout linearLayout0, CLS341 ʾʻ0, int v, int v1, int v2, int v3) {
        LinearLayout.LayoutParams linearLayout$LayoutParams0 = new LinearLayout.LayoutParams(-1, -2);
        linearLayout$LayoutParams0.setMargins(0, CLS144.MTH2175(2), 0, CLS144.MTH2175(2));
        View view0 = ʾʻ0.MTH4823();
        view0.setPadding(v, v1, v2, v3);
        if(linearLayout0 == null) {
            return;
        }
        linearLayout0.addView(view0, linearLayout$LayoutParams0);
    }

    // 检测为 Lambda 实现
    public static void MTH2178(DialogInterface dialogInterface0) [...]

    public static void MTH2179(LinearLayout linearLayout0, CLS341 ʾʻ0) {
        CLS144.MTH2180(linearLayout0, ʾʻ0, 0);
    }

    public static void MTH2180(LinearLayout linearLayout0, CLS341 ʾʻ0, int v) {
        LinearLayout.LayoutParams linearLayout$LayoutParams0 = new LinearLayout.LayoutParams(-1, -2);
        linearLayout$LayoutParams0.setMargins(0, CLS144.MTH2175(2), 0, CLS144.MTH2175(2));
        CLS144.MTH2194(linearLayout0, ʾʻ0, v, linearLayout$LayoutParams0);
    }

    public static void MTH2181(Object object0, int v, int v1) {
        try {
            if(object0 instanceof TextView) {
                ((TextView)object0).setTextColor(v);
                ((TextView)object0).setBackgroundColor(v1);
                return;
            }
            SpannableString spannableString0 = new SpannableString(CLS197.MTH2929(((MenuItem)object0).getTitle()));
            spannableString0.setSpan(new ForegroundColorSpan(v), 0, spannableString0.length(), 0);
            ((MenuItem)object0).setTitle(spannableString0);
        }
        catch(Throwable throwable0) {
            CLS185.MTH2708(throwable0);
        }
    }

    public static void MTH2182(Button button0, int v) {
        if(button0 == null) {
            return;
        }
        try {
            button0.setTextColor(v);
        }
        catch(Throwable throwable0) {
            CLS185.MTH2708(throwable0);
        }
    }

    // 去混淆评级： 低(30)
    // 此方法包含解密的字符串
    public static boolean MTH2183() {
        return Build.VERSION.SDK_INT >= 21 || CLS64.MTH1072().MTH1063("CompatToolbarClass");
    }

    public static AlertDialog MTH2184(Activity activity0, String s, String s1, String s2, CLS343 ˋʼ0) {
        return CLS144.MTH2214(activity0, s, ((CLS342)new CLS543(activity0, s1, s2)), ˋʼ0);
    }

    public static void MTH2185(View view0, Drawable drawable0) {
        if(view0 != null && drawable0 != null) {
            if(Build.VERSION.SDK_INT >= 16) {
                view0.setBackground(drawable0);
                return;
            }
            view0.setBackgroundDrawable(drawable0);
        }
    }

    public static void MTH2186(LinearLayout linearLayout0, CLS341 ʾʻ0) {
        CLS144.MTH2176(linearLayout0, ʾʻ0.MTH4823());
    }

    public static void MTH2187() {
        try {
            if(CLS144.FLD617 != null && CLS144.FLD617.isShowing()) {
                CLS144.FLD617.dismiss();
            }
        }
        catch(Throwable unused_ex) {
        }
    }

    // 检测为 Lambda 实现
    public static void MTH2188(boolean z, DialogInterface dialogInterface0) [...]

    // 此方法包含解密的字符串
    public static void MTH2189(SearchView searchView0) {
        if(searchView0 == null) {
            return;
        }
        if(!CLS226.MTH3102()) {
            return;
        }
        ImageView imageView0 = (ImageView)searchView0.findViewById(searchView0.getContext().getResources().getIdentifier("android:id/search_mag_icon", null, null));
        if(imageView0 != null) {
            Drawable drawable0 = imageView0.getDrawable();
            if(drawable0 != null) {
                CLS169.MTH2328(drawable0, CLS226.MTH3099());
                imageView0.setImageDrawable(drawable0);
            }
        }
        AutoCompleteTextView autoCompleteTextView0 = (AutoCompleteTextView)searchView0.findViewById(searchView0.getContext().getResources().getIdentifier("android:id/search_src_text", null, null));
        autoCompleteTextView0.setHintTextColor(CLS226.MTH3098());
        autoCompleteTextView0.setTextColor(CLS226.MTH3099());
    }

    // 检测为 Lambda 实现
    public static void MTH2190(CLS343 ˋʼ0, DialogInterface dialogInterface0, int v) [...]

    public static void MTH2191(LinearLayout linearLayout0, CLS341 ʾʻ0, boolean z) {
        if(z) {
            if(ʾʻ0 instanceof CLS599) {
                if(((CLS599)ʾʻ0).MTH3686()) {
                    CLS144.MTH2177(linearLayout0, ʾʻ0, CLS144.MTH2175(11), 0, CLS144.MTH2175(10), CLS144.MTH2175(10));
                    return;
                }
                CLS144.MTH2180(linearLayout0, ((CLS341)(((CLS599)ʾʻ0))), CLS144.MTH2175(10));
                return;
            }
            CLS144.MTH2177(linearLayout0, ʾʻ0, CLS144.MTH2175(11), 0, CLS144.MTH2175(10), CLS144.MTH2175(10));
            return;
        }
        LinearLayout.LayoutParams linearLayout$LayoutParams0 = new LinearLayout.LayoutParams(-1, -2);
        View view0 = ʾʻ0.MTH4823();
        view0.setPadding(CLS144.MTH2175(11), 0, CLS144.MTH2175(10), CLS144.MTH2175(10));
        if(linearLayout0 == null) {
            return;
        }
        linearLayout0.addView(view0, linearLayout$LayoutParams0);
    }

    // 此方法包含解密的字符串
    // 检测为 Lambda 实现
    public static void MTH2192(Activity activity0, String s, View view0) [...]

    public static void MTH2193(Activity activity0, ListAdapter listAdapter0, boolean z, CLS344 ᵔʼ0, LinkedHashMap linkedHashMap0, LinearLayout linearLayout0) {
        CLS594 ʾᐧ0 = new CLS594(activity0);
        ʾᐧ0.MTH3613(listAdapter0);
        ʾᐧ0.MTH3610((AdapterView adapterView0, View view0, int v, long v1) -> {
            if(z) {
                try {
                    CLS144.FLD617.dismiss();
                }
                catch(Throwable unused_ex) {
                }
            }
            if(ᵔʼ0 != null) {
                try {
                    ᵔʼ0.MTH4828(linkedHashMap0.get(((String)listAdapter0.getItem(v))));
                }
                catch(Throwable throwable0) {
                    CLS185.MTH2708(throwable0);
                }
            }
        });
        CLS601 ᵔʼ1 = new CLS601(activity0);
        ᵔʼ1.MTH3701(ʾᐧ0);
        CLS144.MTH2180(linearLayout0, ((CLS341)ᵔʼ1), CLS144.MTH2175(3));
    }

    public static void MTH2194(LinearLayout linearLayout0, CLS341 ʾʻ0, int v, LinearLayout.LayoutParams linearLayout$LayoutParams0) {
        View view0 = ʾʻ0.MTH4823();
        if(v != 0) {
            view0.setPadding(0, 0, 0, v);
        }
        if(linearLayout0 == null) {
            return;
        }
        if(linearLayout$LayoutParams0 != null) {
            linearLayout0.addView(view0, linearLayout$LayoutParams0);
            return;
        }
        linearLayout0.addView(view0, new LinearLayout.LayoutParams(-1, -2));
    }

    // 检测为 Lambda 实现
    public static void MTH2195(CLS343 ˋʼ0, DialogInterface dialogInterface0, int v) [...]

    public static void MTH2196(LinearLayout linearLayout0, View view0, int v) {
        if(linearLayout0 == null) {
            return;
        }
        view0.setPadding(0, 0, 0, v);
        linearLayout0.addView(view0, new LinearLayout.LayoutParams(-1, -2));
    }

    // 此方法包含解密的字符串
    public static void MTH2197(TextView textView0, String s) {
        if(textView0 == null) {
            return;
        }
        if(!CLS197.MTH2926(s, new String[]{"<"}) || !CLS197.MTH2926(s, new String[]{">"})) {
            textView0.setText(s);
        }
        else {
            textView0.setText(Html.fromHtml(s));
        }
        if(!TextUtils.isEmpty(s) && textView0.getVisibility() != 0) {
            textView0.setVisibility(0);
        }
    }

    public static void MTH2198(Activity activity0, String s, boolean z, Object[] arr_object) {
        LinearLayout linearLayout0 = (LinearLayout)arr_object[1];
        CLS597 ˉˆ0 = new CLS597(activity0);
        ˉˆ0.MTH3643(s);
        ˉˆ0.MTH3645(false);
        CLS144.MTH2191(linearLayout0, ((CLS341)ˉˆ0), true);
        if(z) {
            ˉˆ0.MTH3642((View view0) -> // 此方法包含解密的字符串
            {
                CLS184.MTH2667(activity0, s);
                CLS184.MTH2702(activity0, "");
            });
        }
    }

    public static void MTH2199(boolean z, Activity activity0, String s, LinkedHashMap linkedHashMap0, boolean z1, CLS344 ᵔʼ0, ListAdapter listAdapter0) {
        CLS144.MTH2187();
        CLS144.FLD617 = CLS144.MTH2158(z, activity0, s, ((CLS136)new CLS482(activity0, listAdapter0, z1, ᵔʼ0, linkedHashMap0)), null, null);
    }

    public static AlertDialog MTH2201(Activity activity0, String s, String s1, boolean z, boolean z1, CLS343 ˋʼ0) {
        return CLS144.MTH2214(activity0, s, ((CLS342)new CLS550(activity0, s1, z1)), ˋʼ0);
    }

    public static void MTH2203(boolean z, Activity activity0, String s, LinkedHashMap linkedHashMap0, boolean z1, CLS344 ᵔʼ0) {
        CLS144.MTH2199(z, activity0, s, linkedHashMap0, z1, ᵔʼ0, new CLS54(activity0, new ArrayList(linkedHashMap0.keySet())));
    }

    public static void MTH2204(Activity activity0, String s, String s1, Object[] arr_object) {
        LinearLayout linearLayout0 = (LinearLayout)arr_object[1];
        CLS596 ˈᴵ0 = new CLS596(activity0);
        ˈᴵ0.MTH3627(s);
        ˈᴵ0.MTH3633(s1);
        ˈᴵ0.MTH3626(linearLayout0, true);
    }

    public static AlertDialog MTH2205(Activity activity0, String s, String s1, boolean z, CLS343 ˋʼ0) {
        return CLS144.MTH2201(activity0, s, s1, z, false, ˋʼ0);
    }

    public static Dialog MTH2206(boolean z, Activity activity0, String s, CLS136 ʼﾞ$ﾞⁱ0, CLS135 ʼﾞ$ⁱˋ0, CLS343 ˋʼ0, String s1) {
        return z ? CLS144.MTH2157(activity0, s, ʼﾞ$ﾞⁱ0, ʼﾞ$ⁱˋ0, ˋʼ0, s1) : CLS144.MTH2213(activity0, s, ((CLS342)new CLS534(activity0, ʼﾞ$ⁱˋ0, ʼﾞ$ﾞⁱ0)), ˋʼ0, s1);
    }

    // 检测为 Lambda 实现
    public static void MTH2208(CLS343 ˋʼ0, DialogInterface dialogInterface0, int v) [...]

    public static void MTH2209(LinearLayout linearLayout0, View view0, boolean z) {
        LinearLayout.LayoutParams linearLayout$LayoutParams0;
        if(linearLayout0 != null && view0 != null) {
            if(z) {
                linearLayout$LayoutParams0 = new LinearLayout.LayoutParams(-1, -2);
                linearLayout$LayoutParams0.setMargins(0, CLS144.MTH2175(2), 0, CLS144.MTH2175(2));
                view0.setPadding(CLS144.MTH2175(11), 0, CLS144.MTH2175(10), CLS144.MTH2175(10));
            }
            else {
                view0.setPadding(CLS144.MTH2175(11), 0, CLS144.MTH2175(10), 0);
                linearLayout$LayoutParams0 = new LinearLayout.LayoutParams(-1, -2);
            }
            linearLayout0.addView(view0, linearLayout$LayoutParams0);
        }
    }

    public static void MTH2210(Activity activity0, CLS135 ʼﾞ$ⁱˋ0, CLS136 ʼﾞ$ﾞⁱ0, Object[] arr_object) {
        Menu menu0 = (Menu)arr_object[0];
        LinearLayout linearLayout0 = (LinearLayout)arr_object[1];
        CLS283 ˉˎ0 = new CLS283(activity0, linearLayout0, menu0);
        if(ʼﾞ$ⁱˋ0 != null) {
            ʼﾞ$ⁱˋ0.MTH2027(ˉˎ0);
            ˉˎ0.MTH3650();
        }
        if(ʼﾞ$ﾞⁱ0 != null) {
            ʼﾞ$ﾞⁱ0.MTH2028(linearLayout0);
        }
    }

    // 此方法包含解密的字符串
    public static Menu MTH2211(Activity activity0, LinearLayout linearLayout0, String s) {
        try {
            if(!CLS64.MTH1072().MTH1063("CompatToolbarClass")) {
                return null;
            }
            CLS256 ˎﹳ0 = new CLS256(activity0);
            ˎﹳ0.MTH3362(CLS226.MTH3108());
            if(!TextUtils.isEmpty(s)) {
                ˎﹳ0.MTH3363(s);
                ˎﹳ0.MTH3365(CLS226.MTH3100());
            }
            Drawable drawable0 = ˎﹳ0.MTH3360();
            if(drawable0 != null) {
                Drawable drawable1 = drawable0.mutate();
                CLS169.MTH2328(drawable0, CLS226.MTH3104());
                ˎﹳ0.MTH3361(drawable1);
            }
            ˎﹳ0.MTH3364(linearLayout0);
            return ˎﹳ0.MTH3366();
        }
        catch(Throwable throwable0) {
            CLS185.MTH2708(throwable0);
            return null;
        }
    }

    // 此方法包含解密的字符串
    public static AlertDialog MTH2213(Activity activity0, String s, CLS342 ˉˎ0, CLS343 ˋʼ0, String s1) {
        AlertDialog alertDialog0 = CLS144.MTH2153(activity0, s, ˉˎ0, ˋʼ0, s1);
        if(alertDialog0 != null) {
            alertDialog0.show();
            int v = CLS98.MTH1297().MTH1007("wx_custom_dialog_width", 0);
            if(v != 0) {
                WindowManager.LayoutParams windowManager$LayoutParams0 = new WindowManager.LayoutParams();
                windowManager$LayoutParams0.copyFrom(alertDialog0.getWindow().getAttributes());
                windowManager$LayoutParams0.width = CLS144.MTH2175(v);
                alertDialog0.getWindow().setAttributes(windowManager$LayoutParams0);
            }
        }
        return alertDialog0;
    }

    // 去混淆评级： 低(20)
    // 此方法包含解密的字符串
    public static AlertDialog MTH2214(Activity activity0, String s, CLS342 ˉˎ0, CLS343 ˋʼ0) {
        return CLS144.MTH2213(activity0, s, ˉˎ0, ˋʼ0, "");
    }
}

