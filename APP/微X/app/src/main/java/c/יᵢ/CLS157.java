// Decompiled by JEB v5.42.0.202606242140

package c.יᵢ;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.ContentValues;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Build.VERSION;
import android.text.Html;
import android.text.TextUtils;
import android.util.Log;
import android.view.Menu;
import android.view.View;
import android.widget.AdapterView;
import android.widget.CompoundButton;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import c.ʽـ.CLS49;
import c.ʾˆ.CLS59;
import c.ˈⁱ.CLS93;
import c.ˈⁱ.CLS95;
import c.ˋʿ.CLS100;
import c.ˋʿ.CLS102;
import c.ˋˑ.CLS104;
import c.ˋﹳ.CLS107;
import c.ˋﹳ.CLS108;
import c.ˋﹳ.CLS111;
import c.ˋﹳ.CLS112;
import c.יᴵ.CLS144;
import c.יᴵ.CLS156;
import c.ـˉ.CLS170;
import c.ـˉ.CLS172;
import c.ـˉ.CLS200;
import c.ـˉ.CLS204;
import c.ـˉ.CLS213;
import c.ـˉ.CLS224;
import c.ـˉ.CLS231;
import c.ـˉ.CLS232;
import c.ـˉ.CLS246;
import c.ـˉ.CLS257;
import c.ـˉ.CLS258;
import c.ـˉ.CLS261;
import c.ـˉ.CLS262;
import c.ٴˈ.CLS291;
import c.ٴˈ.CLS789;
import c.ٴˈ.CLS791.CLS286;
import c.ٴˈ.CLS791;
import c.ٴˈ.CLS796;
import c.ٴˈ.CLS797.CLS289;
import c.ٴˈ.CLS797;
import c.ٴˈ.CLS798;
import java.io.File;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashSet;

public class CLS157 {
    public final CLS231 FLD742;
    public boolean FLD743;
    public final ArrayList FLD744;
    public final CLS261 FLD745;
    public WeakReference FLD746;
    public WeakReference FLD747;
    public WeakReference FLD748;
    public static final CLS157 FLD749;
    public final CLS200 FLD750;
    public AlertDialog FLD751;
    public CLS59 FLD752;
    public boolean FLD753;
    public final CLS156 FLD754;

    static {
        CLS157.FLD749 = new CLS157();
    }

    public CLS157() {
        this.FLD743 = false;
        this.FLD745 = CLS261.MTH3881();
        this.FLD742 = (CLS231)CLS144.MTH2583().MTH2605(CLS231.class);
        this.FLD750 = CLS200.MTH3224();
        this.FLD754 = CLS95.MTH2031();
        this.FLD744 = new ArrayList();
    }

    public static void MTH2773() {
        if(CLS224.MTH3461(CLS93.MTH1973())) {
            CLS224.MTH3445(CLS93.MTH1973());
        }
        CLS257.MTH3710();
    }

    // 检测为 Lambda 实现
    private void MTH2774(String s) [...]

    public void MTH2776() {
        this.MTH2813();
        this.MTH2778();
    }

    public final void MTH2777(String s) {
        CLS204.MTH3252(s);
        this.FLD744.add(s);
    }

    // 去混淆评级： 低(33)
    // 此方法包含解密的字符串
    public final void MTH2778() {
        if(!this.FLD753) {
            return;
        }
        ArrayList arrayList0 = new ArrayList();
        if(!CLS224.MTH3441() && (!this.FLD742.MTH3524("\uD8E3egistration") && !CLS258.MTH3771())) {
            arrayList0.add("\uD8E3(\uD8E3echat_xposed\uD8E3)");
        }
        arrayList0.add("\uD8E3(\uD8E3eset\uD8E3)");
        arrayList0.add("\uD8E3(\uD8E3estart\uD8E3)");
        arrayList0.add("\uD8E3(\uD8E3heck_update\uD8E3)");
        CLS59 ᴵⁱ0 = this.FLD752;
        if(ᴵⁱ0 != null) {
            ᴵⁱ0.MTH1082(arrayList0);
        }
    }

    // 检测为 Lambda 实现
    private void MTH2783(DialogInterface dialogInterface0) [...]

    // 此方法包含解密的字符串
    private void MTH2784(Activity activity0) {
        CLS224.MTH3482(activity0, "");
        this.FLD745.MTH3853();
    }

    // 去混淆评级： 中等(60)
    // 此方法包含解密的字符串
    private void MTH2786(Activity activity0) {
        CLS258.MTH3764(activity0, "", "", "", ((CLS111)new CLS657(this)));
    }

    // 此方法包含解密的字符串
    public static void MTH2787(CLS797 ٴˑ0, Activity activity0, String s) {
        if(!TextUtils.isEmpty(s) && s.startsWith("\uD8E3 ")) {
            String[] arr_s = s.split("\uD8E3");
            if(arr_s.length <= 2) {
                return;
            }
            ٴˑ0.MTH4305("");
            CLS261.MTH3881().MTH3898(true);
            String s1 = arr_s[1];
            switch(s1.hashCode()) {
                case 107141: {
                    if(s1.equals("\uD8E3ib")) {
                        CLS213.MTH3304().MTH3330("\uD8E3ore", "\uD8E3ownloadLib", new Object[0]);
                    }
                    else {
                        CLS213.MTH3304().MTH3330("\uD8E3ore", "\uD8E3ownloadFeaturePack", new Object[]{arr_s[1]});
                    }
                    break;
                }
                case 0x2EAF9F: {
                    if(s1.equals("\uD8E3ore")) {
                        CLS213.MTH3304().MTH3330("\uD8E3ore", "\uD8E3ownloadCore", new Object[0]);
                    }
                    else {
                        CLS213.MTH3304().MTH3330("\uD8E3ore", "\uD8E3ownloadFeaturePack", new Object[]{arr_s[1]});
                    }
                    break;
                }
                default: {
                    CLS213.MTH3304().MTH3330("\uD8E3ore", "\uD8E3ownloadFeaturePack", new Object[]{arr_s[1]});
                }
            }
            CLS224.MTH3482(activity0, "\uD8E3ownload " + arr_s[1]);
        }
    }

    public static CLS157 MTH2788() {
        return CLS157.FLD749;
    }

    // 此方法包含解密的字符串
    public final void MTH2791(Activity activity0) {
        public class CLS656 implements CLS111 {
            public final CLS157 FLD740;

            @Override  // c.ˋﹳ.CLS111
            public void MTH2286() {
                try {
                    CLS95.MTH2023();
                    CLS257.MTH3710();
                }
                catch(Throwable throwable0) {
                    CLS204.MTH3257(throwable0);
                }
            }

            @Override  // c.ˋﹳ.CLS111
            public void MTH2287() {
            }
        }


        public class CLS657 implements CLS111 {
            public final CLS157 FLD741;

            @Override  // c.ˋﹳ.CLS111
            public void MTH2286() {
                try {
                    CLS95.MTH2023();
                    CLS257.MTH3710();
                }
                catch(Throwable throwable0) {
                    CLS204.MTH3257(throwable0);
                }
            }

            @Override  // c.ˋﹳ.CLS111
            public void MTH2287() {
            }
        }

        try {
            this.FLD745.MTH3932();
            try {
                if(this.FLD751 != null && this.FLD751.isShowing()) {
                    this.FLD751.dismiss();
                }
                this.FLD743 = false;
            }
            catch(Throwable throwable1) {
                this.MTH2795(throwable1);
            }
            if(activity0 == null || activity0.isFinishing()) {
                this.MTH2777("\uD8E3uild settings activity error");
                return;
            }
            this.FLD753 = true;
            AlertDialog alertDialog0 = CLS258.MTH3758(activity0, "", ((CLS112)new CLS685(this, activity0)));
            this.FLD751 = alertDialog0;
            if(alertDialog0 != null) {
                alertDialog0.setOnCancelListener((DialogInterface dialogInterface0) -> if(this.FLD753) {
                    this.FLD753 = false;
                });
                this.FLD751.setOnDismissListener((DialogInterface dialogInterface0) -> if(this.FLD753) {
                    this.FLD753 = false;
                });
            }
        }
        catch(Throwable throwable0) {
            this.MTH2795(throwable0);
        }
    }

    // 检测为 Lambda 实现
    private void MTH2792(DialogInterface dialogInterface0) [...]

    // 此方法包含解密的字符串
    private void MTH2793(Activity activity0, Object[] arr_object) {
        Throwable throwable3;
        ProgressBar progressBar0;
        try {
            Menu menu0 = (Menu)arr_object[0];
            LinearLayout linearLayout0 = (LinearLayout)arr_object[1];
            try {
                CLS291 ᵔﹶ0 = new CLS291(activity0, linearLayout0, menu0);
                if(!CLS224.MTH3441() && !this.FLD742.MTH3524("\uD8E3egistration")) {
                    ᵔﹶ0.MTH4331("\uD8E3odule_settings", ((CLS107)new CLS696(this, activity0)));
                }
                if(CLS104.MTH2238().MTH2217("\uD8E3onation")) {
                    ᵔﹶ0.MTH4331("\uD8E3oolbar_settings", ((CLS107)new CLS660(activity0)));
                }
                ᵔﹶ0.MTH4331("\uD8E3heck_update", ((CLS107)new CLS661(this)));
                if(!CLS224.MTH3441()) {
                    ᵔﹶ0.MTH4331("\uD8E3how_update_log", ((CLS107)new CLS671(activity0))).MTH4331("\uD8E3ownload_latest_apk", ((CLS107)new CLS694(this, activity0)));
                }
                ᵔﹶ0.MTH4331("\uD8E3estart_wechat", ((CLS107)new CLS659())).MTH4331("\uD8E3eset_module", ((CLS107)new CLS693(this, activity0)));
                ᵔﹶ0.MTH4328();
            }
            catch(Throwable throwable1) {
                this.MTH2795(throwable1);
            }
            try {
                progressBar0 = new ProgressBar(activity0, null, 0x1010078);
            }
            catch(Throwable throwable2) {
                progressBar0 = null;
                throwable3 = throwable2;
                goto label_27;
            }
            try {
                progressBar0.setIndeterminate(false);
                progressBar0.setPadding(CLS258.MTH3770(5), CLS258.MTH3770(3), CLS258.MTH3770(5), CLS258.MTH3770(10));
                progressBar0.setMax(100);
                this.FLD747 = new WeakReference(progressBar0);
                goto label_28;
            }
            catch(Throwable throwable3) {
            }
        label_27:
            this.MTH2795(throwable3);
        label_28:
            TextView textView0 = new TextView(activity0);
            this.FLD748 = new WeakReference(textView0);
            textView0.setFocusable(true);
            textView0.setFocusableInTouchMode(true);
            textView0.setTextColor(CLS172.MTH3033());
            textView0.setPadding(0, 0, 0, CLS258.MTH3770(10));
            textView0.setOnClickListener((View view0) -> // 此方法包含解密的字符串
            try {
                if(this.FLD745.MTH3975() && !this.FLD745.MTH3872() || this.FLD745.MTH3985() || this.FLD745.MTH3849()) {
                    CLS257.MTH3710();
                    return;
                }
                if(this.MTH2814()) {
                    if(this.FLD745.MTH4024()) {
                        CLS257.MTH3736(activity0, new File(activity0.getCacheDir(), "\uD8E3eXposed.apk"));
                        return;
                    }
                    this.FLD745.MTH3963();
                    return;
                }
                if(this.FLD745.MTH3870()) {
                    if(!this.FLD745.MTH3953(300000L)) {
                        return;
                    }
                    this.FLD745.MTH3858(true);
                }
            }
            catch(Throwable throwable0) {
                CLS204.MTH3257(throwable0);
            });
            TextView textView1 = new TextView(activity0);
            this.FLD746 = new WeakReference(textView1);
            textView1.setTextColor(CLS172.MTH3033());
            textView1.setPadding(0, 0, 0, CLS258.MTH3770(10));
            this.MTH2813();
            CLS796 ٴˈ0 = new CLS796(activity0);
            ٴˈ0.MTH4291(new View[]{progressBar0, textView0, textView1});
            CLS789 ʾˆ0 = new CLS789(activity0);
            ʾˆ0.MTH4201("");
            ʾˆ0.MTH4203(this.FLD754.MTH2725("\uD8E3isable_safemode", false));
            ʾˆ0.MTH4202((CompoundButton compoundButton0, boolean z) -> // 去混淆评级： 低(20)
            // 此方法包含解密的字符串
            this.FLD754.MTH2749("\uD8E3isable_safemode", Boolean.valueOf(z)));
            CLS258.MTH3813(linearLayout0, ((CLS108)ʾˆ0), true);
            CLS791 ˋᵎ0 = new CLS791(activity0);
            ˋᵎ0.MTH4249(CLS258.MTH3770(1));
            ˋᵎ0.MTH4247(((CLS286)(String s) -> this.FLD752.getFilter().filter(s)));
            this.FLD752 = new CLS59(activity0);
            this.MTH2778();
            ˋᵎ0.MTH4244((AdapterView adapterView0, View view0, int v, long v1) -> // 去混淆评级： 高(400)
            // 此方法包含解密的字符串
            {
            });
            ˋᵎ0.MTH4246(this.FLD752);
            CLS798 ٴⁱ0 = new CLS798(activity0);
            ٴⁱ0.MTH4317(new Object[]{ٴˈ0, ˋᵎ0});
            CLS258.MTH3789(linearLayout0, ((CLS108)ٴⁱ0));
            CLS797 ٴˑ0 = new CLS797(activity0);
            ٴˑ0.MTH4302(((CLS289)new CLS674(ٴˑ0, activity0)));
            CLS258.MTH3813(linearLayout0, ((CLS108)ٴˑ0), true);
            this.FLD743 = true;
        }
        catch(Throwable throwable0) {
            this.MTH2795(throwable0);
        }
    }

    // 此方法包含解密的字符串
    public final void MTH2794(Activity activity0) {
        if(this.FLD743) {
            return;
        }
        CLS204.MTH3252("\uD8E3uild settings dialog error");
        CLS232.MTH3540(activity0, TextUtils.join("\uD8E3", this.FLD744));
    }

    public final void MTH2795(Throwable throwable0) {
        CLS204.MTH3257(throwable0);
        String s = Log.getStackTraceString(throwable0);
        this.FLD744.add(s);
    }

    // 去混淆评级： 低(40)
    // 此方法包含解密的字符串
    public final String MTH2798(String s, String s1) [...] // 潜在的解密器

    // 去混淆评级： 低(20)
    // 此方法包含解密的字符串
    public final Activity MTH2799() {
        return (Activity)CLS213.MTH3304().MTH3316("\uD8E3etCurrentActivity", new Object[0]);
    }

    // 此方法包含解密的字符串
    private void MTH2801(Activity activity0) {
        try {
            Intent intent0 = new Intent();
            intent0.setFlags(0x10000000);
            intent0.setClassName(this.FLD742.MTH3519(), "\uD8E3om.android.x.MainActivity");
            activity0.startActivity(intent0);
        }
        catch(Throwable throwable0) {
            CLS204.MTH3257(throwable0);
        }
    }

    // 此方法包含解密的字符串
    public final void MTH2802() {
        String s = this.FLD754.MTH2733("\uD8E3ast_update_check", "");
        if(!TextUtils.isEmpty(s)) {
            long v = System.currentTimeMillis() - Long.parseLong(s, 16);
            if(v < 300000L) {
                int v1 = ((int)(300000L - v)) / 1000;
                CLS224.MTH3482(this.MTH2799(), String.format("", ((int)(v1 / 60)), ((int)(v1 % 60))));
                return;
            }
        }
        CLS224.MTH3482(this.MTH2799(), "");
        this.FLD745.MTH3858(true);
    }

    // 去混淆评级： 低(40)
    // 此方法包含解密的字符串
    public static void MTH2804(Activity activity0) {
        CLS213.MTH3304().MTH3301("\uD8E3onation", "\uD8E3ettings.config", new Object[]{"\uD8E3onfig_toolbar_settings", CLS95.MTH2014(), activity0, Boolean.FALSE, Boolean.FALSE, ""});
    }

    // 去混淆评级： 低(20)
    // 此方法包含解密的字符串
    // 检测为 Lambda 实现
    private void MTH2806(CompoundButton compoundButton0, boolean z) [...]

    // 去混淆评级： 低(20)
    // 此方法包含解密的字符串
    public static void MTH2809(Activity activity0) {
        CLS213.MTH3304().MTH3301("\uD8E3onation", "\uD8E3howUpdateDialog", new Object[]{activity0, CLS95.MTH1995(), Boolean.FALSE});
    }

    // 此方法包含解密的字符串
    // 检测为 Lambda 实现
    private void MTH2810(Activity activity0, View view0) [...]

    // 去混淆评级： 高(400)
    // 此方法包含解密的字符串
    // 检测为 Lambda 实现
    private void MTH2811(CLS791 ˋᵎ0, Activity activity0, AdapterView adapterView0, View view0, int v, long v1) [...]

    public void MTH2812(Activity activity0) {
        this.MTH2791(activity0);
        this.MTH2794(activity0);
    }

    // 去混淆评级： 低(23)
    // 此方法包含解密的字符串
    public void MTH2813() {
        String s10;
        StringBuilder stringBuilder4;
        StringBuilder stringBuilder2;
        String s4;
        long v;
        StringBuilder stringBuilder0;
        if(!this.FLD753) {
            return;
        }
        Activity activity0 = this.MTH2799();
        if(activity0 == null) {
            return;
        }
        String s = this.FLD742.MTH3516();
        String s1 = CLS246.MTH3662();
        boolean z = this.FLD754.MTH2725("\uD8E3onate_priority_warning", false);
        if(CLS102.MTH2161()) {
            s1 = s1 + "\uD8E3<br><b>" + "" + "\uD8E3/b>";
        }
        if(this.FLD754.MTH2725("\uD8E3utoupdate_enable", false)) {
            ContentValues contentValues0 = this.FLD745.MTH3891();
            if(contentValues0 != null) {
                String s2 = contentValues0.containsKey("\uD8E3ersionName") ? contentValues0.getAsString("\uD8E3ersionName") : "\uD8E3.0";
                if(this.MTH2814()) {
                    if(s2.equals(s) || !TextUtils.isEmpty(this.FLD742.MTH3516()) && !this.FLD742.MTH3516().equals(s)) {
                        s4 = "\uD8E3b><font color=\'#30DAEB\'>\uD8E3/font></b><br>";
                    }
                    else {
                        String s3 = "\uD8E3b><font color=\'#30DAEB\'>" + String.format("", s2) + "\uD8E3/font></b><br>";
                        if(this.FLD745.MTH4024()) {
                            stringBuilder0 = new StringBuilder();
                            stringBuilder0.append(s3);
                            stringBuilder0.append("");
                            v = 0xFFFFEBF009FFCF7EL;
                        }
                        else {
                            stringBuilder0 = new StringBuilder();
                            stringBuilder0.append(s3);
                            stringBuilder0.append("\uD8E3b><font color=\'#FA58F4\'>");
                            stringBuilder0.append("");
                            v = 0xFFFFEBBF09FFCF7EL;
                        }
                        stringBuilder0.append(CLS49.MTH1006(v));
                        s4 = stringBuilder0.toString();
                    }
                    s1 = s4 + s1;
                }
            }
        }
        String s5 = this.FLD745.MTH3855();
        try {
            if(this.FLD745.MTH3834()) {
                s1 = "\uD8E3b><font color=\'green\'>\uD8E3/font></b><br>" + s1;
            }
            else if(!CLS224.MTH3452()) {
                CLS224.MTH3451();
                s1 = s1 + "\uD8E3br><b><font color=\'#b636ed\'>" + String.format("", this.FLD742.MTH3518());
                if(this.FLD742.MTH3520(activity0)) {
                    s1 = s1 + "\uD8E3(play) ";
                }
                if(z) {
                    s1 = s1 + "";
                }
                s1 = s1 + "\uD8E3/font></b><br>";
            }
            else {
                if(this.FLD745.MTH4002() && !this.FLD745.MTH4025()) {
                    s1 = "\uD8E3b><font color=\'red\'>" + "" + "\uD8E3/font></b><br>" + s1;
                }
                else if(this.FLD745.MTH4006()) {
                    s1 = "\uD8E3b><font color=\'#FACC2E\'>" + "" + "\uD8E3/font></b><br>" + s1;
                }
                String s6 = "";
                int v1 = CLS100.MTH2122();
                if(!this.FLD745.MTH4002() && v1 > 2) {
                    if(CLS262.MTH4050(this.FLD745.MTH3978())) {
                        s6 = "\uD8E3br>";
                    }
                    String s7 = s6 + this.FLD742.MTH3518() + "\uD8E3" + this.FLD742.MTH3511() + "\uD8E3(" + CLS224.MTH3473(activity0) + "\uD8E3[" + this.FLD742.MTH3508() + "\uD8E3";
                    if(this.FLD742.MTH3520(activity0)) {
                        s7 = s7 + "\uD8E3PLAY}";
                    }
                    s1 = "\uD8E3b><font color=\'#30DAEB\'>" + s7 + "\uD8E3/font></b><br>" + s1;
                }
            }
            if(this.FLD745.MTH3975() && !this.FLD745.MTH3872()) {
                s1 = "\uD8E3b><font color=\'green\'>" + CLS95.MTH2000((this.FLD745.MTH4011() ? "\uD8E3odules_reloaded" : "\uD8E3pdated")) + "\uD8E3/font></b><br>" + s1;
            }
            if(this.FLD745.MTH4025()) {
                s1 = "\uD8E3b><font color=\'green\'>\uD8E3/font></b><br>" + s1;
            }
            if(this.FLD745.MTH3870()) {
                s1 = "\uD8E3b><font color=\'red\'>\uD8E3/font></b><br>" + s1;
            }
            if(this.FLD745.MTH4008()) {
                s1 = "\uD8E3b><font color=\'#f9ce57\'>\uD8E3/font></b><br>" + s1;
            }
            if(this.FLD745.MTH3985()) {
                s1 = "\uD8E3b><font color=\'green\'>\uD8E3/font></b><br>" + s1;
            }
            if(this.FLD745.MTH3964()) {
                s1 = "\uD8E3b><font color=\'red\'>\uD8E3/font></b><br>" + s1;
            }
            String s8 = "";
            if(this.FLD745.MTH4017() != 0) {
                if(this.FLD745.MTH3993()) {
                    stringBuilder2 = new StringBuilder();
                    stringBuilder2.append("");
                    stringBuilder2.append("\uD8E3");
                    stringBuilder2.append(CLS95.MTH2014());
                    goto label_100;
                }
                else if(this.FLD745.MTH4017() == 811) {
                    stringBuilder2 = new StringBuilder();
                    stringBuilder2.append("");
                    stringBuilder2.append("\uD8E3");
                    stringBuilder2.append("");
                    goto label_100;
                }
                else if(this.FLD745.MTH4017() != 501) {
                    stringBuilder2 = new StringBuilder();
                    stringBuilder2.append("");
                    stringBuilder2.append("\uD8E3");
                    stringBuilder2.append("");
                label_100:
                    s8 = stringBuilder2.toString();
                }
                s1 = "\uD8E3b><font color=\'red\'>" + String.format("\uD8E3isabled error code: %05X", ((int)(0xFFFFF & this.FLD745.MTH4017()))) + s8 + "\uD8E3/font></b><br>" + s1;
                int v2 = this.FLD745.MTH4017();
                switch(v2) {
                    case 502: {
                        s1 = "\uD8E3b><font color=\'red\'>" + "" + "\uD8E3/font></b><br>" + s1;
                        break;
                    }
                    case 505: {
                        s1 = "\uD8E3b><font color=\'red\'>" + "" + "\uD8E3/font></b><br>" + s1;
                        break;
                    }
                    case 501: 
                    case 510: {
                        s1 = "\uD8E3b><font color=\'red\'>" + "" + "\uD8E3/font></b><br>" + s1;
                        break;
                    }
                    case 807: {
                        if(!this.FLD750.MTH3230("\uD8E3mulator_allowed")) {
                            s1 = "\uD8E3b><font color=\'red\'>" + "" + "\uD8E3/font></b><br>" + s1;
                        }
                        break;
                    }
                    default: {
                        if(v2 == 700 || v2 == 701 || v2 == 702 || v2 == 703) {
                            s1 = "\uD8E3b><font color=\'red\'>" + "" + "\uD8E3/font></b><br>" + s1;
                            break;
                        }
                    }
                }
                if(!CLS224.MTH3441() && this.FLD745.MTH4017() == 501 && this.FLD745.MTH3951() && !this.FLD745.MTH3885()) {
                    this.FLD745.MTH3858(false);
                }
            }
            else if(this.FLD745.MTH3859() != 0) {
                s1 = "\uD8E3b><font color=\'red\'>" + String.format("\uD8E3onflict error code: %05X", ((int)(0xFFFFF & this.FLD745.MTH3859()))) + "\uD8E3/font></b><br>" + s1;
            }
            if(this.FLD745.MTH4012()) {
                HashSet hashSet0 = new HashSet();
                for(Object object0: this.FLD745.MTH3940()) {
                    hashSet0.add(CLS257.MTH3724(activity0, ((String)object0)) + "\uD8E3" + ((String)object0) + "\uD8E3");
                }
                if(hashSet0.isEmpty()) {
                    stringBuilder4 = new StringBuilder();
                    stringBuilder4.append("\uD8E3b><font color=\'green\'>");
                    stringBuilder4.append("");
                    stringBuilder4.append("\uD8E3/font></b><br>");
                }
                else {
                    stringBuilder4 = new StringBuilder();
                    stringBuilder4.append("\uD8E3b><font color=\'red\'>");
                    stringBuilder4.append(String.format("", TextUtils.join("\uD8E3", hashSet0)));
                    stringBuilder4.append("\uD8E3/font></b><br>");
                }
                stringBuilder4.append(s1);
                s1 = stringBuilder4.toString();
            }
            if(this.FLD745.MTH4020() && this.FLD745.MTH4017() == 807 && this.FLD750.MTH3230("\uD8E3mulator_allowed")) {
                s1 = "\uD8E3b><font color=\'green\'>\uD8E3/font></b><br>" + s1;
            }
            if(!TextUtils.isEmpty(s5)) {
                s5 = CLS170.MTH3002(s5);
            }
            if(this.FLD745.MTH3971()) {
                s1 = "\uD8E3b><font color=\'red\'>\uD8E3/font></b><br>" + s1;
            }
            if(this.FLD745.MTH3854()) {
                s1 = "\uD8E3b><font color=\'red\'>\uD8E3/font></b><br>" + s1;
            }
            if(this.FLD745.MTH3849()) {
                s1 = "\uD8E3b><font color=\'green\'>\uD8E3/font></b><br>" + s1;
            }
            String s9 = "\uD8E3br>";
            if(CLS95.MTH2031().MTH2725("\uD8E3ookFail", false)) {
                if(CLS102.MTH2166()) {
                    s9 = "\uD8E3br><br>";
                }
                s1 = "\uD8E3br><b><font color=\'red\'>\uD8E3" + CLS102.MTH2177() + "\uD8E3</font></b><br>" + s9 + s1;
            }
            s10 = "\uD8E3b><font color=\'red\'>\uD8E3/font></b><br>" + s1;
        }
        catch(Throwable throwable0) {
            CLS204.MTH3257(throwable0);
            s10 = s1;
        }
        ProgressBar progressBar0 = (ProgressBar)this.FLD747.get();
        if(progressBar0 != null) {
            if(this.FLD742.MTH3507("\uD8E3howUpdateProgress") || z || !this.FLD745.MTH3860() || this.FLD745.MTH3979() == 0 || this.FLD745.MTH3979() == this.FLD745.MTH4021()) {
                progressBar0.setVisibility(8);
            }
            else {
                int v3 = Math.round(((float)this.FLD745.MTH4021()) / ((float)this.FLD745.MTH3979()) * 100.0f);
                if(Build.VERSION.SDK_INT >= 24) {
                    progressBar0.setProgress(v3, true);
                }
                else {
                    progressBar0.setProgress(v3);
                }
                progressBar0.setVisibility(0);
            }
        }
        TextView textView0 = (TextView)this.FLD748.get();
        if(textView0 != null) {
            if(TextUtils.isEmpty(s10)) {
                textView0.setVisibility(8);
            }
            else {
                textView0.setVisibility(0);
                textView0.setText(Html.fromHtml(s10));
            }
        }
        TextView textView1 = (TextView)this.FLD746.get();
        if(textView1 != null) {
            if(!TextUtils.isEmpty(s5)) {
                textView1.setVisibility(0);
                textView1.setText(Html.fromHtml(CLS170.MTH3002(s5)));
                return;
            }
            textView1.setVisibility(8);
        }
    }

    // 此方法包含解密的字符串
    public final boolean MTH2814() {
        if(!this.FLD754.MTH2725("\uD8E3utoupdate_enable", false)) {
            return false;
        }
        int v = this.FLD742.MTH3500();
        ContentValues contentValues0 = this.FLD745.MTH3891();
        if(contentValues0 != null) {
            return v == -1 ? CLS224.MTH3474(this.FLD742.MTH3516(), contentValues0.getAsString("\uD8E3ersionName")) == 1 : (contentValues0.containsKey("\uD8E3ersionCode") ? ((int)contentValues0.getAsInteger("\uD8E3ersionCode")) : 0) > v;
        }
        return false;
    }
}

