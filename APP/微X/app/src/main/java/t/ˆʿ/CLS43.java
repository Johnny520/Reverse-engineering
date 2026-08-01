// Decompiled by JEB v5.42.0.202606242140

package t.ˆʿ;

import android.app.Activity;
import android.app.AlertDialog.Builder;
import android.app.AlertDialog;
import android.app.Dialog;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
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
import android.view.ViewGroup;
import android.view.WindowManager.LayoutParams;
import android.view.WindowManager;
import android.widget.AutoCompleteTextView;
import android.widget.ImageView;
import android.widget.LinearLayout.LayoutParams;
import android.widget.LinearLayout;
import android.widget.SearchView;
import android.widget.TextView;
import java.util.concurrent.atomic.AtomicInteger;
import t.ʾᵢ.CLS200;
import t.ᵔʾ.CLS123;
import t.ᵔʾ.CLS133;
import t.ᵔʾ.CLS135;
import t.ⁱʾ.CLS140;
import t.ⁱʾ.CLS141;
import t.ⁱʾ.CLS144;
import t.ⁱʾ.CLS145;
import t.ⁱʾ.CLS305;
import t.ﾞᐧ.CLS333;
import t.ﾞᐧ.CLS339;

public final class CLS43 {
    public static final AtomicInteger FLD493;
    public static Dialog FLD494;

    static {
        CLS43.FLD493 = new AtomicInteger(1);
    }

    public static int MTH1415(Activity activity0) {
        Rect rect0 = new Rect();
        activity0.getWindow().getDecorView().getWindowVisibleDisplayFrame(rect0);
        return rect0.top;
    }

    // 此方法包含解密的字符串
    public static void MTH1416(Activity activity0, CLS141 ʾᵢ0) {
        try {
            CLS43.MTH1425(activity0, CLS133.MTH2099("delete"), ((CLS144)new CLS275(activity0, CLS133.MTH2099("delete_confirmation"))), ʾᵢ0);
        }
        catch(Throwable throwable0) {
            CLS133.MTH2113(throwable0);
        }
    }

    // 此方法包含解密的字符串
    public static int MTH1417(Context context0) {
        if(context0 == null) {
            return 0;
        }
        WindowManager windowManager0 = (WindowManager)context0.getSystemService("window");
        DisplayMetrics displayMetrics0 = new DisplayMetrics();
        windowManager0.getDefaultDisplay().getMetrics(displayMetrics0);
        return displayMetrics0.widthPixels;
    }

    // 去混淆评级： 低(30)
    // 此方法包含解密的字符串
    public static int MTH1418() {
        Resources resources0 = Resources.getSystem();
        return resources0.getDimensionPixelSize(resources0.getIdentifier("status_bar_height", "dimen", "android"));
    }

    public static void MTH1419(LinearLayout linearLayout0, View view0) {
        if(linearLayout0 != null && view0 != null) {
            view0.setPadding(CLS43.MTH1439(11), 0, CLS43.MTH1439(10), 0);
            linearLayout0.addView(view0, new LinearLayout.LayoutParams(-1, -2));
        }
    }

    // 去混淆评级： 低(30)
    // 此方法包含解密的字符串
    public static boolean MTH1420() {
        return Build.VERSION.SDK_INT >= 21 ? true : CLS133.MTH2111("CompatToolbarClass") != null;
    }

    // 此方法包含解密的字符串
    public static void MTH1421(SearchView searchView0) {
        if(searchView0 == null) {
            return;
        }
        if(!CLS46.MTH1455()) {
            return;
        }
        ImageView imageView0 = (ImageView)searchView0.findViewById(searchView0.getContext().getResources().getIdentifier("android:id/search_mag_icon", null, null));
        if(imageView0 != null) {
            Drawable drawable0 = imageView0.getDrawable();
            if(drawable0 != null) {
                CLS41.MTH1401(drawable0, CLS46.MTH1452());
                imageView0.setImageDrawable(drawable0);
            }
        }
        AutoCompleteTextView autoCompleteTextView0 = (AutoCompleteTextView)searchView0.findViewById(searchView0.getContext().getResources().getIdentifier("android:id/search_src_text", null, null));
        autoCompleteTextView0.setHintTextColor(CLS46.MTH1457());
        autoCompleteTextView0.setTextColor(CLS46.MTH1452());
    }

    public static void MTH1422(Activity activity0, String s, String s1, String s2, int v, CLS140 ʻˑ0) {
        public final class CLS279 implements CLS141 {
            public final CLS339 FLD491;
            public final CLS140 FLD492;

            public CLS279(CLS339 יﹳ0, CLS140 ʻˑ0) {
                this.FLD492 = ʻˑ0;
                super();
            }

            @Override  // t.ⁱʾ.CLS141
            public final void MTH2165() {
            }

            @Override  // t.ⁱʾ.CLS141
            public final void MTH2166() {
                try {
                    String s = this.FLD491.MTH2416();
                    CLS140 ʻˑ0 = this.FLD492;
                    if(ʻˑ0 != null) {
                        ʻˑ0.MTH2164(s);
                    }
                }
                catch(Throwable throwable0) {
                    CLS133.MTH2113(throwable0);
                }
            }
        }

        CLS339 יﹳ0 = new CLS339(activity0);
        AlertDialog alertDialog0 = CLS43.MTH1425(activity0, s, ((CLS144)new CLS274(יﹳ0, s1, v, s2)), ((CLS141)new CLS279(יﹳ0, ʻˑ0)));
        if(alertDialog0 != null) {
            alertDialog0.getWindow().setSoftInputMode(5);
        }
    }

    public static void MTH1423(LinearLayout linearLayout0, CLS145 ٴـ0, boolean z) {
        if(z) {
            if(ٴـ0 instanceof CLS333 && !((CLS333)ٴـ0).FLD1120) {
                CLS43.MTH1428(linearLayout0, ((CLS145)(((CLS333)ٴـ0))), CLS43.MTH1439(10));
                return;
            }
            CLS43.MTH1434(linearLayout0, ٴـ0, CLS43.MTH1439(11), CLS43.MTH1439(10), CLS43.MTH1439(10));
            return;
        }
        LinearLayout.LayoutParams linearLayout$LayoutParams0 = new LinearLayout.LayoutParams(-1, -2);
        View view0 = ٴـ0.MTH2173();
        view0.setPadding(CLS43.MTH1439(11), 0, CLS43.MTH1439(10), CLS43.MTH1439(10));
        if(linearLayout0 == null) {
            return;
        }
        linearLayout0.addView(view0, linearLayout$LayoutParams0);
    }

    // 此方法包含解密的字符串
    public static void MTH1424(MenuItem menuItem0, int v, int v1) {
        try {
            if(menuItem0 instanceof TextView) {
                ((TextView)menuItem0).setTextColor(v);
                ((TextView)menuItem0).setBackgroundColor(v1);
                return;
            }
            CharSequence charSequence0 = menuItem0.getTitle();
            SpannableString spannableString0 = new SpannableString((TextUtils.isEmpty(charSequence0) ? "" : charSequence0.toString()));
            spannableString0.setSpan(new ForegroundColorSpan(v), 0, spannableString0.length(), 0);
            menuItem0.setTitle(spannableString0);
        }
        catch(Throwable throwable0) {
            CLS133.MTH2113(throwable0);
        }
    }

    // 去混淆评级： 低(20)
    // 此方法包含解密的字符串
    public static AlertDialog MTH1425(Activity activity0, String s, CLS144 ˊﾞ0, CLS141 ʾᵢ0) {
        return CLS43.MTH1433(activity0, s, ˊﾞ0, ʾᵢ0, "");
    }

    public static CLS55 MTH1426(Activity activity0, String s, CLS54 ⁱˉ$ᵔʾ0, CLS53 ⁱˉ$ˆٴ0, CLS141 ʾᵢ0) {
        CLS55 ⁱˉ0 = new CLS55(activity0, s);
        ⁱˉ0.FLD522 = ⁱˉ$ᵔʾ0;
        ⁱˉ0.FLD523 = ⁱˉ$ˆٴ0;
        if(ʾᵢ0 != null) {
            ⁱˉ0.FLD515 = new CLS277(ʾᵢ0, 1);
            ⁱˉ0.FLD513 = ʾᵢ0;
            ⁱˉ0.FLD517 = null;
        }
        ⁱˉ0.show();
        return ⁱˉ0;
    }

    public static void MTH1427(View view0, ColorDrawable colorDrawable0) {
        if(view0 instanceof ViewGroup) {
            CLS43.MTH1437(((ViewGroup)view0), colorDrawable0);
            for(int v = 0; v < ((ViewGroup)view0).getChildCount(); ++v) {
                CLS43.MTH1436(((ViewGroup)view0).getChildAt(v), colorDrawable0);
            }
            return;
        }
        CLS43.MTH1437(view0, colorDrawable0);
    }

    public static void MTH1428(LinearLayout linearLayout0, CLS145 ٴـ0, int v) {
        LinearLayout.LayoutParams linearLayout$LayoutParams0 = new LinearLayout.LayoutParams(-1, -2);
        linearLayout$LayoutParams0.setMargins(0, CLS43.MTH1439(2), 0, CLS43.MTH1439(2));
        View view0 = ٴـ0.MTH2173();
        if(v != 0) {
            view0.setPadding(0, 0, 0, v);
        }
        if(linearLayout0 != null) {
            linearLayout0.addView(view0, linearLayout$LayoutParams0);
        }
    }

    // 此方法包含解密的字符串
    public static void MTH1429(TextView textView0, String s) {
        if(textView0 == null) {
            return;
        }
        if(!CLS33.MTH1345(s, new String[]{"<"}) || !CLS33.MTH1345(s, new String[]{">"})) {
            textView0.setText(s);
        }
        else {
            textView0.setText(Html.fromHtml(s));
        }
        if(!TextUtils.isEmpty(s) && textView0.getVisibility() != 0) {
            textView0.setVisibility(0);
        }
    }

    // 此方法包含解密的字符串
    public static void MTH1430(Activity activity0, String s, String s1, int v, CLS140 ʻˑ0) {
        CLS43.MTH1422(activity0, "", s, s1, v, ʻˑ0);
    }

    public static void MTH1431(boolean z, CLS145[] arr_ٴـ) {
        if(z) {
            for(int v = 0; v < arr_ٴـ.length; ++v) {
                CLS145 ٴـ0 = arr_ٴـ[v];
                if(ٴـ0 != null) {
                    ٴـ0.MTH2175(8);
                }
            }
            return;
        }
        for(int v1 = 0; v1 < arr_ٴـ.length; ++v1) {
            CLS145 ٴـ1 = arr_ٴـ[v1];
            if(ٴـ1 != null) {
                ٴـ1.MTH2175(0);
            }
        }
    }

    public static void MTH1432(LinearLayout linearLayout0, View view0) {
        if(linearLayout0 != null) {
            view0.setPadding(0, 0, 0, 0);
            linearLayout0.addView(view0, new LinearLayout.LayoutParams(-1, -2));
        }
    }

    // 此方法包含解密的字符串
    public static AlertDialog MTH1433(Activity activity0, String s, CLS144 ˊﾞ0, CLS141 ʾᵢ0, String s1) {
        AlertDialog alertDialog0;
        AlertDialog.Builder alertDialog$Builder0;
        int v = 0;
        try {
            String s2 = "";
            String s3 = "";
            new String("");
            new String("");
            new String("");
            boolean z = true;
            if(!TextUtils.isEmpty(s)) {
                if(s.contains("[[") && s.contains("]]")) {
                    int v1 = s.indexOf("[[");
                    int v2 = s.indexOf("]]");
                    String s4 = s.substring(v1 + 2, v2);
                    s = s.substring(0, v1) + s.substring(v2 + 2);
                    s2 = s4;
                }
                String s5 = "";
                if(s.contains("{") && s.contains("}")) {
                    int v3 = s.indexOf("{");
                    int v4 = s.indexOf("}");
                    String s6 = s.substring(v3 + 1, v4);
                    s = s.substring(0, v3) + s.substring(v4 + 1);
                    s5 = s6;
                }
                String s7 = "";
                if(s.contains("((") && s.contains("))")) {
                    int v5 = s.indexOf("((");
                    int v6 = s.indexOf("))");
                    String s8 = s.substring(v5 + 2, v6);
                    s = s.substring(0, v5) + s.substring(v6 + 2);
                    s7 = s8;
                }
                s5.getClass();
                s2.getClass();
                s7.getClass();
                s3 = s.trim();
            }
            if(!CLS46.MTH1455()) {
                if(!CLS133.MTH2103().MTH2131("force_light_alertdialog", false)) {
                    alertDialog$Builder0 = new AlertDialog.Builder(activity0);
                }
                else if(Build.VERSION.SDK_INT >= 22) {
                    alertDialog$Builder0 = new AlertDialog.Builder(activity0, 0x10302D2);
                }
                else {
                    alertDialog$Builder0 = new AlertDialog.Builder(activity0, 5);
                }
            }
            else if(!CLS133.MTH2103().MTH2131("force_dark_alertdialog", false)) {
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
            Menu menu0 = (Menu)CLS123.FLD912.MTH2003("getToolbar", new Object[]{activity0, linearLayout0, s3});
            LinearLayout linearLayout1 = new LinearLayout(activity0);
            linearLayout1.setGravity(0x30);
            linearLayout1.setOrientation(1);
            linearLayout1.setFocusableInTouchMode(true);
            linearLayout1.setLayoutParams(linearLayout$LayoutParams0);
            linearLayout1.setBackgroundColor(CLS46.MTH1448());
            try {
                ˊﾞ0.MTH2170(new Object[]{menu0, linearLayout1});
            }
            catch(Throwable throwable1) {
                CLS133.MTH2113(throwable1);
            }
            if(!CLS43.MTH1420() || menu0 == null) {
                alertDialog$Builder0.setView(linearLayout1).setTitle(s3);
            }
            else {
                linearLayout0.addView(linearLayout1);
                alertDialog$Builder0.setView(linearLayout0);
            }
            if(ʾᵢ0 == null) {
                alertDialog0 = alertDialog$Builder0.setPositiveButton(CLS133.MTH2099("back"), new CLS40()).create();
                if(CLS46.MTH1455()) {
                    alertDialog0.setOnShowListener(new CLS58());
                }
            }
            else {
                alertDialog$Builder0.setPositiveButton(0x1040013, new CLS30(ʾᵢ0, 0)).setNegativeButton(0x1040009, new CLS30(ʾᵢ0, 1));
                if(!TextUtils.isEmpty(s1) && ʾᵢ0 instanceof CLS305) {
                    alertDialog$Builder0.setNeutralButton(s1, new CLS30(ʾᵢ0, 2));
                }
                else {
                    z = false;
                }
                alertDialog0 = alertDialog$Builder0.create();
                if(CLS46.MTH1455()) {
                    alertDialog0.setOnShowListener(new CLS45(z));
                }
            }
        }
        catch(Throwable throwable0) {
            CLS133.MTH2113(throwable0);
            alertDialog0 = null;
        }
        if(alertDialog0 != null) {
            alertDialog0.show();
            CLS135 ⁱˉ0 = CLS133.MTH2103();
            ⁱˉ0.getClass();
            try {
                Object object0 = ⁱˉ0.MTH2132(0, "wx_custom_dialog_width");
                if(object0 != null) {
                    v = (int)(((Integer)object0));
                }
            }
            catch(Throwable throwable2) {
                CLS133.MTH2113(throwable2);
            }
            if(v != 0) {
                WindowManager.LayoutParams windowManager$LayoutParams0 = new WindowManager.LayoutParams();
                windowManager$LayoutParams0.copyFrom(alertDialog0.getWindow().getAttributes());
                windowManager$LayoutParams0.width = CLS43.MTH1439(v);
                alertDialog0.getWindow().setAttributes(windowManager$LayoutParams0);
            }
        }
        return alertDialog0;
    }

    public static void MTH1434(LinearLayout linearLayout0, CLS145 ٴـ0, int v, int v1, int v2) {
        LinearLayout.LayoutParams linearLayout$LayoutParams0 = new LinearLayout.LayoutParams(-1, -2);
        linearLayout$LayoutParams0.setMargins(0, CLS43.MTH1439(2), 0, CLS43.MTH1439(2));
        View view0 = ٴـ0.MTH2173();
        view0.setPadding(v, 0, v1, v2);
        if(linearLayout0 == null) {
            return;
        }
        linearLayout0.addView(view0, linearLayout$LayoutParams0);
    }

    public static void MTH1435(Activity activity0, String s, CLS200 ˊﾞ0) {
        CLS55 ⁱˉ0 = new CLS55(activity0, s);
        ⁱˉ0.FLD514 = ˊﾞ0;
        ⁱˉ0.FLD523 = null;
        ⁱˉ0.show();
    }

    public static void MTH1436(View view0, ColorDrawable colorDrawable0) {
        CLS43.MTH1437(view0, colorDrawable0);
        if(view0 instanceof ViewGroup) {
            for(int v = 0; v < ((ViewGroup)view0).getChildCount(); ++v) {
                CLS43.MTH1436(((ViewGroup)view0).getChildAt(v), colorDrawable0);
            }
        }
    }

    public static void MTH1437(View view0, Drawable drawable0) {
        if(view0 != null && drawable0 != null) {
            if(Build.VERSION.SDK_INT >= 16) {
                view0.setBackground(drawable0);
                return;
            }
            view0.setBackgroundDrawable(drawable0);
        }
    }

    public static int MTH1438() {
        int v;
        if(Build.VERSION.SDK_INT >= 17) {
            return View.generateViewId();
        }
        do {
            v = CLS43.FLD493.get();
        }
        while(!CLS43.FLD493.compareAndSet(v, (v + 1 <= 0xFFFFFF ? v + 1 : 1)));
        return v;
    }

    public static int MTH1439(int v) {
        return (int)(((float)v) * Resources.getSystem().getDisplayMetrics().density);
    }
}

