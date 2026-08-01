// Decompiled by JEB v5.42.0.202606242140

package c.ـˉ;

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
import c.ʽـ.CLS49;
import c.ʾˆ.CLS56;
import c.ˈⁱ.CLS95;
import c.ˋﹳ.CLS107;
import c.ˋﹳ.CLS108;
import c.ˋﹳ.CLS109;
import c.ˋﹳ.CLS110;
import c.ˋﹳ.CLS111;
import c.ˋﹳ.CLS112;
import c.ˋﹳ.CLS625;
import c.ˑʼ.CLS126;
import c.יᴵ.CLS147;
import c.ٴˈ.CLS291;
import c.ٴˈ.CLS790;
import c.ٴˈ.CLS791;
import c.ٴˈ.CLS793;
import c.ٴˈ.CLS795;
import c.ٴˈ.CLS797;
import c.ٴˈ.CLS798;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.concurrent.atomic.AtomicInteger;

public class CLS258 {
    public static Dialog FLD1090;
    public static final AtomicInteger FLD1091;

    static {
        CLS258.FLD1091 = new AtomicInteger(1);
    }

    // 此方法包含解密的字符串
    public static void MTH3751(TextView textView0, String s) {
        if(textView0 == null) {
            return;
        }
        if(!CLS170.MTH3011(s, new String[]{"\uD8E3"}) || !CLS170.MTH3011(s, new String[]{"\uD8E3"})) {
            textView0.setText(s);
        }
        else {
            textView0.setText(Html.fromHtml(s));
        }
        if(!TextUtils.isEmpty(s) && textView0.getVisibility() != 0) {
            textView0.setVisibility(0);
        }
    }

    // 检测为 Lambda 实现
    public static void MTH3752(CLS111 ᴵⁱ0, DialogInterface dialogInterface0, int v) [...]

    // 检测为 Lambda 实现
    public static void MTH3753(CLS111 ᴵⁱ0, DialogInterface dialogInterface0, int v) [...]

    public static void MTH3755(boolean z, Activity activity0, String s, LinkedHashMap linkedHashMap0, boolean z1, CLS110 ٴⁱ0) {
        CLS258.MTH3763(z, activity0, s, linkedHashMap0, z1, ٴⁱ0, new CLS56(activity0, new ArrayList(linkedHashMap0.keySet())));
    }

    public static void MTH3756(CLS797 ٴˑ0, String s, int v, String s1, Object[] arr_object) {
        LinearLayout linearLayout0 = (LinearLayout)arr_object[1];
        ٴˑ0.MTH4301(s);
        ٴˑ0.MTH4306(v);
        if(!TextUtils.isEmpty(s1)) {
            ٴˑ0.MTH4305(s1);
        }
        CLS258.MTH3813(linearLayout0, ((CLS108)ٴˑ0), true);
    }

    public static void MTH3757(Button button0, int v) {
        if(button0 == null) {
            return;
        }
        try {
            button0.setTextColor(v);
        }
        catch(Throwable throwable0) {
            CLS204.MTH3257(throwable0);
        }
    }

    // 去混淆评级： 低(20)
    // 此方法包含解密的字符串
    public static AlertDialog MTH3758(Activity activity0, String s, CLS112 ᵔﹶ0) {
        return CLS258.MTH3799(activity0, s, ᵔﹶ0, null, "");
    }

    // 此方法包含解密的字符串
    // 检测为 Lambda 实现
    public static void MTH3759(Activity activity0, String s, View view0) [...]

    // 检测为 Lambda 实现
    public static void MTH3760(boolean z, CLS110 ٴⁱ0, ListAdapter listAdapter0, LinkedHashMap linkedHashMap0, AdapterView adapterView0, View view0, int v, long v1) [...]

    // 去混淆评级： 低(40)
    // 此方法包含解密的字符串
    public static void MTH3761(TextView textView0, boolean z) {
        textView0.setContentDescription(textView0.getText() + "\uD8E3" + "" + CLS95.MTH2000(CLS49.MTH1006((z ? 0xFFFFAB1C09FFCF7EL : 0xFFFFAB1209FFCF7EL))));
    }

    public static void MTH3763(boolean z, Activity activity0, String s, LinkedHashMap linkedHashMap0, boolean z1, CLS110 ٴⁱ0, ListAdapter listAdapter0) {
        CLS258.MTH3779();
        CLS258.FLD1090 = CLS258.MTH3767(z, activity0, s, ((CLS195)new CLS752(activity0, listAdapter0, z1, ٴⁱ0, linkedHashMap0)), null, null);
    }

    public static AlertDialog MTH3764(Activity activity0, String s, String s1, String s2, CLS111 ᴵⁱ0) {
        return CLS258.MTH3793(activity0, s, ((CLS112)new CLS786(activity0, s1, s2)), ᴵⁱ0);
    }

    public static void MTH3766(LinearLayout linearLayout0, View view0, int v) {
        if(linearLayout0 == null) {
            return;
        }
        view0.setPadding(0, 0, 0, v);
        linearLayout0.addView(view0, new LinearLayout.LayoutParams(-1, -2));
    }

    public static Dialog MTH3767(boolean z, Activity activity0, String s, CLS195 ˆˊ$ʻᵢ0, CLS196 ˆˊ$ˆٴ0, CLS111 ᴵⁱ0) {
        return CLS258.MTH3782(z, activity0, s, ˆˊ$ʻᵢ0, ˆˊ$ˆٴ0, ᴵⁱ0, null);
    }

    public static AlertDialog MTH3769(Activity activity0, String s, String s1, boolean z, boolean z1, CLS111 ᴵⁱ0) {
        return CLS258.MTH3793(activity0, s, ((CLS112)new CLS717(activity0, s1, z1)), ᴵⁱ0);
    }

    public static int MTH3770(int v) {
        return (int)(((float)v) * Resources.getSystem().getDisplayMetrics().density);
    }

    // 去混淆评级： 低(30)
    // 此方法包含解密的字符串
    public static boolean MTH3771() {
        return Build.VERSION.SDK_INT >= 21 || CLS147.MTH2641().MTH2626("\uD8E3ompatToolbarClass");
    }

    public static void MTH3772(DialogInterface dialogInterface0, int v) {
    }

    // 检测为 Lambda 实现
    public static void MTH3773(boolean z, DialogInterface dialogInterface0) [...]

    public static Menu MTH3774(Activity activity0, LinearLayout linearLayout0, String s) {
        if(Build.VERSION.SDK_INT >= 21) {
            try {
                Toolbar toolbar0 = new Toolbar(activity0);
                toolbar0.setLayoutParams(new Toolbar.LayoutParams(-1, -2));
                if(CLS172.MTH3035()) {
                    toolbar0.setPopupTheme(0x103024B);
                }
                else {
                    toolbar0.setPopupTheme(0x103024A);
                }
                toolbar0.setBackgroundColor(CLS172.MTH3034());
                if(!TextUtils.isEmpty(s)) {
                    toolbar0.setTitle(s);
                    toolbar0.setTitleTextColor(CLS172.MTH3028());
                }
                CLS258.MTH3794(toolbar0, CLS172.MTH3031());
                CLS258.MTH3776(linearLayout0, toolbar0);
                return toolbar0.getMenu();
            }
            catch(Throwable throwable0) {
                CLS204.MTH3257(throwable0);
            }
        }
        return CLS258.MTH3781(activity0, linearLayout0, s);
    }

    public static void MTH3775(LinearLayout linearLayout0, CLS108 ـᵎ0, int v, int v1, int v2, int v3) {
        LinearLayout.LayoutParams linearLayout$LayoutParams0 = new LinearLayout.LayoutParams(-1, -2);
        linearLayout$LayoutParams0.setMargins(0, CLS258.MTH3770(2), 0, CLS258.MTH3770(2));
        View view0 = ـᵎ0.MTH2282();
        view0.setPadding(v, v1, v2, v3);
        if(linearLayout0 == null) {
            return;
        }
        linearLayout0.addView(view0, linearLayout$LayoutParams0);
    }

    public static void MTH3776(LinearLayout linearLayout0, View view0) {
        CLS258.MTH3766(linearLayout0, view0, 0);
    }

    public static void MTH3778(LinearLayout linearLayout0, View view0, boolean z) {
        LinearLayout.LayoutParams linearLayout$LayoutParams0;
        if(linearLayout0 != null && view0 != null) {
            if(z) {
                linearLayout$LayoutParams0 = new LinearLayout.LayoutParams(-1, -2);
                linearLayout$LayoutParams0.setMargins(0, CLS258.MTH3770(2), 0, CLS258.MTH3770(2));
                view0.setPadding(CLS258.MTH3770(11), 0, CLS258.MTH3770(10), CLS258.MTH3770(10));
            }
            else {
                view0.setPadding(CLS258.MTH3770(11), 0, CLS258.MTH3770(10), 0);
                linearLayout$LayoutParams0 = new LinearLayout.LayoutParams(-1, -2);
            }
            linearLayout0.addView(view0, linearLayout$LayoutParams0);
        }
    }

    public static void MTH3779() {
        try {
            if(CLS258.FLD1090 != null && CLS258.FLD1090.isShowing()) {
                CLS258.FLD1090.dismiss();
            }
        }
        catch(Throwable unused_ex) {
        }
    }

    // 此方法包含解密的字符串
    public static void MTH3780(SearchView searchView0) {
        if(searchView0 == null) {
            return;
        }
        if(!CLS172.MTH3035()) {
            return;
        }
        ImageView imageView0 = (ImageView)searchView0.findViewById(searchView0.getContext().getResources().getIdentifier("\uD8E3ndroid:id/search_mag_icon", null, null));
        if(imageView0 != null) {
            Drawable drawable0 = imageView0.getDrawable();
            if(drawable0 != null) {
                CLS264.MTH4115(drawable0, CLS172.MTH3033());
                imageView0.setImageDrawable(drawable0);
            }
        }
        AutoCompleteTextView autoCompleteTextView0 = (AutoCompleteTextView)searchView0.findViewById(searchView0.getContext().getResources().getIdentifier("\uD8E3ndroid:id/search_src_text", null, null));
        autoCompleteTextView0.setHintTextColor(CLS172.MTH3036());
        autoCompleteTextView0.setTextColor(CLS172.MTH3033());
    }

    // 此方法包含解密的字符串
    public static Menu MTH3781(Activity activity0, LinearLayout linearLayout0, String s) {
        try {
            if(!CLS147.MTH2641().MTH2626("\uD8E3ompatToolbarClass")) {
                return null;
            }
            CLS126 ˋˑ0 = new CLS126(activity0);
            ˋˑ0.MTH2435(CLS172.MTH3034());
            if(!TextUtils.isEmpty(s)) {
                ˋˑ0.MTH2434(s);
                ˋˑ0.MTH2433(CLS172.MTH3028());
            }
            Drawable drawable0 = ˋˑ0.MTH2432();
            if(drawable0 != null) {
                Drawable drawable1 = drawable0.mutate();
                CLS264.MTH4115(drawable0, CLS172.MTH3031());
                ˋˑ0.MTH2430(drawable1);
            }
            ˋˑ0.MTH2431(linearLayout0);
            return ˋˑ0.MTH2429();
        }
        catch(Throwable throwable0) {
            CLS204.MTH3257(throwable0);
            return null;
        }
    }

    public static Dialog MTH3782(boolean z, Activity activity0, String s, CLS195 ˆˊ$ʻᵢ0, CLS196 ˆˊ$ˆٴ0, CLS111 ᴵⁱ0, String s1) {
        return z ? CLS258.MTH3790(activity0, s, ˆˊ$ʻᵢ0, ˆˊ$ˆٴ0, ᴵⁱ0, s1) : CLS258.MTH3799(activity0, s, ((CLS112)new CLS730(activity0, ˆˊ$ˆٴ0, ˆˊ$ʻᵢ0)), ᴵⁱ0, s1);
    }

    public static void MTH3783(LinearLayout linearLayout0, CLS108 ـᵎ0) {
        CLS258.MTH3776(linearLayout0, ـᵎ0.MTH2282());
    }

    public static void MTH3784(Activity activity0, String s, boolean z, Object[] arr_object) {
        LinearLayout linearLayout0 = (LinearLayout)arr_object[1];
        CLS795 יᴵ0 = new CLS795(activity0);
        יᴵ0.MTH4277(s);
        יᴵ0.MTH4279(false);
        CLS258.MTH3813(linearLayout0, ((CLS108)יᴵ0), true);
        if(z) {
            יᴵ0.MTH4280((View view0) -> // 此方法包含解密的字符串
            {
                CLS224.MTH3458(activity0, s);
                CLS224.MTH3482(activity0, "");
            });
        }
    }

    public static void MTH3785(View view0, Drawable drawable0) {
        if(view0 != null && drawable0 != null) {
            if(Build.VERSION.SDK_INT >= 16) {
                view0.setBackground(drawable0);
                return;
            }
            view0.setBackgroundDrawable(drawable0);
        }
    }

    public static AlertDialog MTH3788(Activity activity0, String s, String s1, boolean z, CLS111 ᴵⁱ0) {
        return CLS258.MTH3769(activity0, s, s1, z, false, ᴵⁱ0);
    }

    public static void MTH3789(LinearLayout linearLayout0, CLS108 ـᵎ0) {
        CLS258.MTH3791(linearLayout0, ـᵎ0, 0);
    }

    public static CLS197 MTH3790(Activity activity0, String s, CLS195 ˆˊ$ʻᵢ0, CLS196 ˆˊ$ˆٴ0, CLS111 ᴵⁱ0, String s1) {
        CLS197 ˆˊ0 = new CLS197(activity0, s);
        ˆˊ0.MTH3204(ˆˊ$ʻᵢ0);
        ˆˊ0.MTH3208(ˆˊ$ˆٴ0);
        if(ᴵⁱ0 != null) {
            ˆˊ0.MTH3190(((CLS107)new CLS719(ᴵⁱ0)));
            ˆˊ0.MTH3201(ᴵⁱ0);
            ˆˊ0.MTH3199(s1);
        }
        ˆˊ0.show();
        return ˆˊ0;
    }

    public static void MTH3791(LinearLayout linearLayout0, CLS108 ـᵎ0, int v) {
        LinearLayout.LayoutParams linearLayout$LayoutParams0 = new LinearLayout.LayoutParams(-1, -2);
        linearLayout$LayoutParams0.setMargins(0, CLS258.MTH3770(2), 0, CLS258.MTH3770(2));
        CLS258.MTH3795(linearLayout0, ـᵎ0, v, linearLayout$LayoutParams0);
    }

    // 去混淆评级： 低(20)
    // 此方法包含解密的字符串
    public static AlertDialog MTH3793(Activity activity0, String s, CLS112 ᵔﹶ0, CLS111 ᴵⁱ0) {
        return CLS258.MTH3799(activity0, s, ᵔﹶ0, ᴵⁱ0, "");
    }

    public static void MTH3794(Toolbar toolbar0, int v) {
        try {
            if(Build.VERSION.SDK_INT < 23) {
                return;
            }
            Drawable drawable0 = toolbar0.getOverflowIcon();
            if(drawable0 == null) {
                return;
            }
            Drawable drawable1 = drawable0.mutate();
            CLS264.MTH4115(drawable0, v);
            toolbar0.setOverflowIcon(drawable1);
        }
        catch(Throwable throwable0) {
            CLS204.MTH3257(throwable0);
        }
    }

    public static void MTH3795(LinearLayout linearLayout0, CLS108 ـᵎ0, int v, LinearLayout.LayoutParams linearLayout$LayoutParams0) {
        View view0 = ـᵎ0.MTH2282();
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

    // 此方法包含解密的字符串
    public static AlertDialog MTH3797(Activity activity0, String s, CLS112 ᵔﹶ0, CLS111 ᴵⁱ0, String s1) {
        CLS209 ˋʿ0;
        AlertDialog alertDialog0;
        AlertDialog.Builder alertDialog$Builder0;
        try {
            boolean z = false;
            if(!CLS172.MTH3035()) {
                if(!CLS95.MTH2031().MTH2725("\uD8E3orce_light_alertdialog", false)) {
                    alertDialog$Builder0 = new AlertDialog.Builder(activity0);
                }
                else if(Build.VERSION.SDK_INT >= 22) {
                    alertDialog$Builder0 = new AlertDialog.Builder(activity0, 0x10302D2);
                }
                else {
                    alertDialog$Builder0 = new AlertDialog.Builder(activity0, 5);
                }
            }
            else if(!CLS95.MTH2031().MTH2725("\uD8E3orce_dark_alertdialog", false)) {
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
            Menu menu0 = CLS258.MTH3774(activity0, linearLayout0, "");
            LinearLayout linearLayout1 = new LinearLayout(activity0);
            linearLayout1.setGravity(0x30);
            linearLayout1.setOrientation(1);
            linearLayout1.setFocusableInTouchMode(true);
            linearLayout1.setLayoutParams(linearLayout$LayoutParams0);
            linearLayout1.setBackgroundColor(CLS172.MTH3038());
            if(ᵔﹶ0 != null) {
                try {
                    ᵔﹶ0.MTH2288(new Object[]{menu0, linearLayout1});
                }
                catch(Throwable throwable1) {
                    CLS204.MTH3257(throwable1);
                }
            }
            if(!CLS258.MTH3771() || menu0 == null) {
                alertDialog$Builder0.setView(linearLayout1).setTitle("");
            }
            else {
                linearLayout0.addView(linearLayout1);
                alertDialog$Builder0.setView(linearLayout0);
            }
            if(ᴵⁱ0 == null) {
                alertDialog0 = alertDialog$Builder0.setPositiveButton("", new CLS230()).create();
                if(CLS172.MTH3035()) {
                    ˋʿ0 = (DialogInterface dialogInterface0) -> CLS258.MTH3757(((AlertDialog)dialogInterface0).getButton(-1), CLS172.MTH3033());
                    alertDialog0.setOnShowListener(ˋʿ0);
                    return alertDialog0;
                }
            }
            else {
                alertDialog$Builder0.setPositiveButton(0x1040013, (DialogInterface dialogInterface0, int v) -> try {
                    ᴵⁱ0.MTH2286();
                }
                catch(Throwable throwable0) {
                    CLS204.MTH3257(throwable0);
                }).setNegativeButton(0x1040009, (DialogInterface dialogInterface0, int v) -> try {
                    ᴵⁱ0.MTH2287();
                }
                catch(Throwable throwable0) {
                    CLS204.MTH3257(throwable0);
                });
                if(!TextUtils.isEmpty(s1) && ᴵⁱ0 instanceof CLS625) {
                    z = true;
                    alertDialog$Builder0.setNeutralButton(s1, (DialogInterface dialogInterface0, int v) -> try {
                        ((CLS625)ᴵⁱ0).MTH2280();
                    }
                    catch(Throwable throwable0) {
                        CLS204.MTH3257(throwable0);
                    });
                }
                alertDialog0 = alertDialog$Builder0.create();
                if(CLS172.MTH3035()) {
                    ˋʿ0 = (DialogInterface dialogInterface0) -> {
                        CLS258.MTH3757(((AlertDialog)dialogInterface0).getButton(-1), CLS172.MTH3033());
                        CLS258.MTH3757(((AlertDialog)dialogInterface0).getButton(-2), CLS172.MTH3033());
                        if(z) {
                            CLS258.MTH3757(((AlertDialog)dialogInterface0).getButton(-3), CLS172.MTH3033());
                        }
                    };
                    alertDialog0.setOnShowListener(ˋʿ0);
                    return alertDialog0;
                }
            }
            return alertDialog0;
        }
        catch(Throwable throwable0) {
            CLS204.MTH3257(throwable0);
            return null;
        }
    }

    // 此方法包含解密的字符串
    public static AlertDialog MTH3799(Activity activity0, String s, CLS112 ᵔﹶ0, CLS111 ᴵⁱ0, String s1) {
        AlertDialog alertDialog0 = CLS258.MTH3797(activity0, s, ᵔﹶ0, ᴵⁱ0, s1);
        if(alertDialog0 != null) {
            alertDialog0.show();
            int v = CLS95.MTH2031().MTH2741("\uD8E3x_custom_dialog_width", 0);
            if(v != 0) {
                WindowManager.LayoutParams windowManager$LayoutParams0 = new WindowManager.LayoutParams();
                windowManager$LayoutParams0.copyFrom(alertDialog0.getWindow().getAttributes());
                windowManager$LayoutParams0.width = CLS258.MTH3770(v);
                alertDialog0.getWindow().setAttributes(windowManager$LayoutParams0);
            }
        }
        return alertDialog0;
    }

    // 检测为 Lambda 实现
    public static void MTH3800(DialogInterface dialogInterface0) [...]

    public static void MTH3801(Activity activity0, String s, String s1, Object[] arr_object) {
        LinearLayout linearLayout0 = (LinearLayout)arr_object[1];
        CLS790 ʿˊ0 = new CLS790(activity0);
        ʿˊ0.MTH4208(s);
        ʿˊ0.MTH4210(s1);
        ʿˊ0.MTH4209(linearLayout0, true);
    }

    public static AlertDialog MTH3803(Activity activity0, String s, String s1, CLS111 ᴵⁱ0) {
        return CLS258.MTH3788(activity0, s, s1, true, ᴵⁱ0);
    }

    // 此方法包含解密的字符串
    public static void MTH3804(Activity activity0, CLS111 ᴵⁱ0) {
        try {
            CLS258.MTH3803(activity0, "", "", ᴵⁱ0);
        }
        catch(Throwable throwable0) {
            CLS204.MTH3257(throwable0);
        }
    }

    public static void MTH3805(Activity activity0, String s, String s1, String s2, int v, CLS109 ٴˑ0) {
        public class CLS766 implements CLS111 {
            public final CLS109 FLD1088;
            public final CLS797 FLD1089;

            public CLS766(CLS797 ٴˑ0, CLS109 ٴˑ1) {
                this.FLD1088 = ٴˑ1;
                super();
            }

            @Override  // c.ˋﹳ.CLS111
            public void MTH2286() {
                try {
                    String s = this.FLD1089.MTH4299();
                    CLS109 ٴˑ0 = this.FLD1088;
                    if(ٴˑ0 != null) {
                        ٴˑ0.MTH2284(s);
                    }
                }
                catch(Throwable throwable0) {
                    CLS204.MTH3257(throwable0);
                }
            }

            @Override  // c.ˋﹳ.CLS111
            public void MTH2287() {
            }
        }

        CLS797 ٴˑ1 = new CLS797(activity0);
        AlertDialog alertDialog0 = CLS258.MTH3793(activity0, s, ((CLS112)new CLS732(ٴˑ1, s1, v, s2)), ((CLS111)new CLS766(ٴˑ1, ٴˑ0)));
        if(alertDialog0 != null) {
            alertDialog0.getWindow().setSoftInputMode(5);
        }
    }

    public static int MTH3807() {
        int v;
        if(Build.VERSION.SDK_INT >= 17) {
            return View.generateViewId();
        }
        do {
            v = CLS258.FLD1091.get();
        }
        while(!CLS258.FLD1091.compareAndSet(v, (v + 1 <= 0xFFFFFF ? v + 1 : 1)));
        return v;
    }

    public static void MTH3808(DialogInterface dialogInterface0, int v) {
    }

    // 检测为 Lambda 实现
    public static void MTH3809(CLS111 ᴵⁱ0, DialogInterface dialogInterface0, int v) [...]

    public static void MTH3810(Object object0, int v, int v1) {
        try {
            if(object0 instanceof TextView) {
                ((TextView)object0).setTextColor(v);
                ((TextView)object0).setBackgroundColor(v1);
                return;
            }
            SpannableString spannableString0 = new SpannableString(CLS170.MTH3006(((MenuItem)object0).getTitle()));
            spannableString0.setSpan(new ForegroundColorSpan(v), 0, spannableString0.length(), 0);
            ((MenuItem)object0).setTitle(spannableString0);
        }
        catch(Throwable throwable0) {
            CLS204.MTH3257(throwable0);
        }
    }

    public static void MTH3811(Activity activity0, CLS196 ˆˊ$ˆٴ0, CLS195 ˆˊ$ʻᵢ0, Object[] arr_object) {
        Menu menu0 = (Menu)arr_object[0];
        LinearLayout linearLayout0 = (LinearLayout)arr_object[1];
        CLS291 ᵔﹶ0 = new CLS291(activity0, linearLayout0, menu0);
        if(ˆˊ$ˆٴ0 != null) {
            ˆˊ$ˆٴ0.MTH3177(ᵔﹶ0);
            ᵔﹶ0.MTH4328();
        }
        if(ˆˊ$ʻᵢ0 != null) {
            ˆˊ$ʻᵢ0.MTH3176(linearLayout0);
        }
    }

    public static void MTH3812(Activity activity0, ListAdapter listAdapter0, boolean z, CLS110 ٴⁱ0, LinkedHashMap linkedHashMap0, LinearLayout linearLayout0) {
        CLS791 ˋᵎ0 = new CLS791(activity0);
        ˋᵎ0.MTH4246(listAdapter0);
        ˋᵎ0.MTH4244((AdapterView adapterView0, View view0, int v, long v1) -> {
            if(z) {
                try {
                    CLS258.FLD1090.dismiss();
                }
                catch(Throwable unused_ex) {
                }
            }
            if(ٴⁱ0 != null) {
                try {
                    ٴⁱ0.MTH2285(linkedHashMap0.get(((String)listAdapter0.getItem(v))));
                }
                catch(Throwable throwable0) {
                    CLS204.MTH3257(throwable0);
                }
            }
        });
        CLS798 ٴⁱ1 = new CLS798(activity0);
        ٴⁱ1.MTH4313(ˋᵎ0);
        CLS258.MTH3791(linearLayout0, ((CLS108)ٴⁱ1), CLS258.MTH3770(3));
    }

    public static void MTH3813(LinearLayout linearLayout0, CLS108 ـᵎ0, boolean z) {
        if(z) {
            if(ـᵎ0 instanceof CLS793) {
                if(((CLS793)ـᵎ0).MTH4263()) {
                    CLS258.MTH3775(linearLayout0, ـᵎ0, CLS258.MTH3770(11), 0, CLS258.MTH3770(10), CLS258.MTH3770(10));
                    return;
                }
                CLS258.MTH3791(linearLayout0, ((CLS108)(((CLS793)ـᵎ0))), CLS258.MTH3770(10));
                return;
            }
            CLS258.MTH3775(linearLayout0, ـᵎ0, CLS258.MTH3770(11), 0, CLS258.MTH3770(10), CLS258.MTH3770(10));
            return;
        }
        LinearLayout.LayoutParams linearLayout$LayoutParams0 = new LinearLayout.LayoutParams(-1, -2);
        View view0 = ـᵎ0.MTH2282();
        view0.setPadding(CLS258.MTH3770(11), 0, CLS258.MTH3770(10), CLS258.MTH3770(10));
        if(linearLayout0 == null) {
            return;
        }
        linearLayout0.addView(view0, linearLayout$LayoutParams0);
    }
}

