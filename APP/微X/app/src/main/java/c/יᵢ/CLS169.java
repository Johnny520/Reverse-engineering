// Decompiled by JEB v5.42.0.202606242140

package c.יᵢ;

import android.app.Activity;
import android.content.ContentValues;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.os.Build.VERSION;
import android.text.Html;
import android.text.TextUtils;
import android.util.Log;
import android.util.Pair;
import android.util.SparseArray;
import android.view.View;
import android.widget.AdapterView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import c.ʽـ.CLS49;
import c.ʾˆ.CLS59;
import c.ˈⁱ.CLS95;
import c.ˋʿ.CLS100;
import c.ˋʿ.CLS102;
import c.ˋˑ.CLS104;
import c.ˋﹳ.CLS107;
import c.ˋﹳ.CLS108;
import c.ˋﹳ.CLS109;
import c.ˋﹳ.CLS111;
import c.ˑʼ.CLS125;
import c.יᴵ.CLS144.CLS142;
import c.יᴵ.CLS144;
import c.יᴵ.CLS156;
import c.ـˉ.CLS170;
import c.ـˉ.CLS172;
import c.ـˉ.CLS197.CLS195;
import c.ـˉ.CLS197.CLS196;
import c.ـˉ.CLS197;
import c.ـˉ.CLS200;
import c.ـˉ.CLS204;
import c.ـˉ.CLS213;
import c.ـˉ.CLS224;
import c.ـˉ.CLS231;
import c.ـˉ.CLS232;
import c.ـˉ.CLS243;
import c.ـˉ.CLS246;
import c.ـˉ.CLS256;
import c.ـˉ.CLS257;
import c.ـˉ.CLS258;
import c.ـˉ.CLS259;
import c.ـˉ.CLS261;
import c.ـˉ.CLS262;
import c.ـˉ.CLS266;
import c.ٴˈ.CLS284;
import c.ٴˈ.CLS291;
import c.ٴˈ.CLS791.CLS286;
import c.ٴˈ.CLS791;
import c.ٴˈ.CLS796;
import c.ٴˈ.CLS798;
import c.ٴˑ.CLS299;
import java.io.File;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashSet;

public class CLS169 {
    public final CLS231 FLD813;
    public WeakReference FLD814;
    public final ArrayList FLD815;
    public boolean FLD816;
    public final CLS261 FLD817;
    public WeakReference FLD818;
    public int FLD819;
    public CLS197 FLD820;
    public static final CLS169 FLD821;
    public CLS59 FLD822;
    public WeakReference FLD823;
    public final CLS200 FLD824;
    public boolean FLD825;
    public boolean FLD826;
    public final ArrayList FLD827;
    public final CLS156 FLD828;

    static {
        CLS169.FLD821 = new CLS169();
    }

    public CLS169() {
        this.FLD819 = 0;
        this.FLD816 = false;
        this.FLD817 = CLS261.MTH3881();
        this.FLD813 = (CLS231)CLS144.MTH2583().MTH2605(CLS231.class);
        this.FLD824 = CLS200.MTH3224();
        this.FLD828 = CLS95.MTH2031();
        this.FLD815 = new ArrayList();
        this.FLD827 = new ArrayList();
    }

    // 去混淆评级： 低(20)
    // 此方法包含解密的字符串
    private void MTH2911() {
        this.FLD828.MTH2739("\uD8E3afe_mode");
        this.FLD828.MTH2739("\uD8E3afe_mode_cnt");
        CLS257.MTH3710();
    }

    // 此方法包含解密的字符串
    public final void MTH2913() {
        String s = this.FLD828.MTH2733("\uD8E3ast_update_check", "");
        if(!TextUtils.isEmpty(s)) {
            long v = System.currentTimeMillis() - Long.parseLong(s, 16);
            if(v < 300000L) {
                int v1 = ((int)(300000L - v)) / 1000;
                CLS224.MTH3482(this.MTH2987(), String.format("", ((int)(v1 / 60)), ((int)(v1 % 60))));
                return;
            }
        }
        CLS224.MTH3482(this.MTH2987(), "");
        this.FLD817.MTH3858(true);
    }

    // 此方法包含解密的字符串
    // 检测为 Lambda 实现
    private void MTH2915(DialogInterface dialogInterface0) [...]

    // 此方法包含解密的字符串
    public final String MTH2916() {
        if(!CLS224.MTH3441()) {
            long v = System.currentTimeMillis();
            if(this.FLD824.MTH3227(0)) {
                long v1 = this.FLD824.MTH3239(0);
                if(v1 > 0L && v1 >= v && v1 - v <= 86400000L) {
                    return String.format("", CLS259.MTH3821(v1));
                }
            }
            if(this.FLD824.MTH3227(4)) {
                long v2 = this.FLD824.MTH3239(4);
                if(v2 > 0L && v2 >= v && v2 - v <= 86400000L) {
                    return String.format("", CLS259.MTH3821(v2));
                }
            }
            if(this.FLD824.MTH3227(2)) {
                long v3 = this.FLD824.MTH3239(2);
                if(v3 > 0L && v3 >= v && v3 - v <= 86400000L) {
                    return String.format("", CLS259.MTH3821(v3));
                }
            }
            if(this.FLD824.MTH3227(101)) {
                long v4 = this.FLD824.MTH3239(101);
                if(v4 > 0L && v4 >= v && v4 - v <= 86400000L) {
                    return String.format("", CLS259.MTH3821(v4));
                }
            }
            if(this.FLD824.MTH3227(104)) {
                long v5 = this.FLD824.MTH3239(104);
                return v5 <= 0L || v5 < v || v5 - v > 86400000L ? "" : String.format("", CLS259.MTH3821(v5));
            }
        }
        return "";
    }

    // 去混淆评级： 低(25)
    // 此方法包含解密的字符串
    public void MTH2917() {
        StringBuilder stringBuilder4;
        StringBuilder stringBuilder2;
        String s5;
        long v;
        StringBuilder stringBuilder0;
        if(!this.FLD825) {
            return;
        }
        this.FLD826 = false;
        String s = this.FLD813.MTH3516();
        String s1 = CLS246.MTH3662();
        if(!CLS224.MTH3441()) {
            if(CLS200.MTH3224().MTH3230("\uD8E3ag_vip")) {
                s1 = s1 + "";
            }
            if(CLS200.MTH3224().MTH3230("\uD8E3ag_pro")) {
                s1 = s1 + "";
            }
        }
        boolean z = this.FLD828.MTH2725("\uD8E3onate_priority_warning", false);
        String s2 = CLS95.MTH2031().MTH2733("\uD8E3eb_notice", "");
        if(TextUtils.isEmpty(s2)) {
            s2 = CLS246.MTH3655();
        }
        if(!TextUtils.isEmpty(s2)) {
            if(CLS102.MTH2161()) {
                s1 = s1 + "\uD8E3<br>" + s2;
            }
            if(!z) {
                s1 = s1 + "\uD8E3<br>" + s2;
            }
        }
        if(this.FLD828.MTH2725("\uD8E3utoupdate_enable", false)) {
            ContentValues contentValues0 = this.FLD817.MTH3891();
            if(contentValues0 != null) {
                String s3 = contentValues0.containsKey("\uD8E3ersionName") ? contentValues0.getAsString("\uD8E3ersionName") : "\uD8E3.0";
                if(this.MTH2988()) {
                    if(s3.equals(s) || !TextUtils.isEmpty(CLS256.MTH3706()) && !this.FLD813.MTH3516().equals(CLS256.MTH3706())) {
                        s5 = "\uD8E3b><font color=\'#30DAEB\'>\uD8E3/font></b><br>";
                    }
                    else {
                        String s4 = "\uD8E3b><font color=\'#30DAEB\'>" + String.format("", s3) + "\uD8E3/font></b><br>";
                        if(this.FLD817.MTH4024()) {
                            stringBuilder0 = new StringBuilder();
                            stringBuilder0.append(s4);
                            stringBuilder0.append("");
                            v = 0xFFFFFC3A09FFCF7EL;
                        }
                        else {
                            stringBuilder0 = new StringBuilder();
                            stringBuilder0.append(s4);
                            stringBuilder0.append("\uD8E3b><font color=\'#FA58F4\'>");
                            stringBuilder0.append("");
                            v = 0xFFFFFC0909FFCF7EL;
                        }
                        stringBuilder0.append(CLS49.MTH1006(v));
                        s5 = stringBuilder0.toString();
                    }
                    s1 = s5 + s1;
                }
            }
        }
        String s6 = this.FLD817.MTH3855();
        try {
            if(this.FLD817.MTH3834()) {
                s1 = "\uD8E3b><font color=\'green\'>\uD8E3/font></b><br>" + s1;
            }
            else if(!CLS224.MTH3452()) {
                CLS224.MTH3451();
                s1 = s1 + "\uD8E3br><b><font color=\'#b636ed\'>" + String.format("", this.FLD813.MTH3518());
                if(this.FLD813.MTH3517()) {
                    s1 = s1 + "\uD8E3(play) ";
                }
                if(z) {
                    s1 = s1 + "";
                }
                s1 = s1 + "\uD8E3/font></b><br>";
            }
            else {
                if(this.FLD817.MTH4002() && !this.FLD817.MTH4025() && this.FLD817.MTH4010()) {
                    s1 = "\uD8E3b><font color=\'red\'>" + "" + "\uD8E3/font></b><br>" + s1;
                }
                else if(this.FLD817.MTH4006()) {
                    s1 = "\uD8E3b><font color=\'#FACC2E\'>" + "" + "\uD8E3/font></b><br>" + s1;
                }
                String s7 = "";
                int v1 = CLS100.MTH2122();
                if(!this.FLD817.MTH4002() && v1 > 2) {
                    if(CLS262.MTH4050(this.FLD817.MTH3978())) {
                        s7 = "\uD8E3br>";
                    }
                    String s8 = s7 + this.FLD813.MTH3518() + "\uD8E3" + this.FLD813.MTH3511() + "\uD8E3(" + CLS224.MTH3470() + "\uD8E3[" + this.FLD813.MTH3508() + "\uD8E3";
                    if(this.FLD813.MTH3517()) {
                        s8 = s8 + "\uD8E3PLAY}";
                    }
                    s1 = "\uD8E3b><font color=\'#30DAEB\'>" + s8 + "\uD8E3/font></b><br>" + s1;
                }
            }
            if(this.FLD817.MTH3975() && !this.FLD817.MTH3872()) {
                s1 = "\uD8E3b><font color=\'green\'>" + CLS95.MTH2000((this.FLD817.MTH4011() ? "\uD8E3odules_reloaded" : "\uD8E3pdated")) + "\uD8E3/font></b><br>" + s1;
            }
            if(this.FLD817.MTH4025()) {
                s1 = "\uD8E3b><font color=\'green\'>\uD8E3/font></b><br>" + s1;
            }
            if(this.FLD817.MTH3870()) {
                s1 = "\uD8E3b><font color=\'red\'>\uD8E3/font></b><br>" + s1;
            }
            if(this.FLD817.MTH4008()) {
                s1 = "\uD8E3b><font color=\'#f9ce57\'>\uD8E3/font></b><br>" + s1;
            }
            if(this.FLD817.MTH3985()) {
                s1 = "\uD8E3b><font color=\'green\'>\uD8E3/font></b><br>" + s1;
            }
            if(this.FLD817.MTH3964()) {
                s1 = "\uD8E3b><font color=\'red\'>\uD8E3/font></b><br>" + s1;
            }
            String s9 = "";
            if(this.FLD817.MTH4017() != 0) {
                if(this.FLD817.MTH3993()) {
                    stringBuilder2 = new StringBuilder();
                    stringBuilder2.append("");
                    stringBuilder2.append("\uD8E3");
                    stringBuilder2.append(CLS95.MTH2014());
                    goto label_109;
                }
                else if(this.FLD817.MTH4017() == 811) {
                    stringBuilder2 = new StringBuilder();
                    stringBuilder2.append("");
                    stringBuilder2.append("\uD8E3");
                    stringBuilder2.append("");
                    goto label_109;
                }
                else if(this.FLD817.MTH4017() != 501) {
                    stringBuilder2 = new StringBuilder();
                    stringBuilder2.append("");
                    stringBuilder2.append("\uD8E3");
                    stringBuilder2.append("");
                label_109:
                    s9 = stringBuilder2.toString();
                }
                s1 = "\uD8E3b><font color=\'red\'>" + String.format("\uD8E3isabled error code: %05X", ((int)(0xFFFFF & this.FLD817.MTH4017()))) + s9 + "\uD8E3/font></b><br>" + s1;
                int v2 = this.FLD817.MTH4017();
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
                        if(!this.FLD824.MTH3230("\uD8E3mulator_allowed")) {
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
                if(!CLS224.MTH3441() && this.FLD817.MTH4017() == 501 && this.FLD817.MTH3951() && !this.FLD817.MTH3885()) {
                    this.FLD817.MTH3858(false);
                }
            }
            else if(this.FLD817.MTH3859() != 0) {
                s1 = "\uD8E3b><font color=\'red\'>" + String.format("\uD8E3onflict error code: %05X", ((int)(0xFFFFF & this.FLD817.MTH3859()))) + "\uD8E3/font></b><br>" + s1;
            }
            if(this.FLD817.MTH4012()) {
                HashSet hashSet0 = new HashSet();
                for(Object object0: this.FLD817.MTH3940()) {
                    hashSet0.add(CLS257.MTH3727(((String)object0)) + "\uD8E3" + ((String)object0) + "\uD8E3");
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
            if(this.FLD817.MTH4020() && this.FLD817.MTH4017() == 807 && this.FLD824.MTH3230("\uD8E3mulator_allowed")) {
                s1 = "\uD8E3b><font color=\'green\'>\uD8E3/font></b><br>" + s1;
            }
            if(!TextUtils.isEmpty(s6)) {
                s6 = CLS170.MTH3002(s6);
            }
            if(this.FLD817.MTH3971()) {
                s1 = "\uD8E3b><font color=\'red\'>\uD8E3/font></b><br>" + s1;
            }
            if(this.FLD817.MTH3854()) {
                s1 = "\uD8E3b><font color=\'red\'>\uD8E3/font></b><br>" + s1;
            }
            String s10 = this.MTH2916();
            if(!TextUtils.isEmpty(s10)) {
                s1 = "\uD8E3b><font color=\'#30DAEB\'>" + s10 + "\uD8E3/font></b><br>" + s1;
            }
            CLS224.MTH3441();
            if(this.FLD817.MTH3849()) {
                s1 = "\uD8E3b><font color=\'green\'>\uD8E3/font></b><br>" + s1;
            }
            if(!CLS224.MTH3441() && CLS261.MTH3881().MTH3951() && (!this.FLD824.MTH3230("\uD8E3ax_df") && this.FLD817.MTH3885()) && !this.FLD824.MTH3230("\uD8E3rouplic_unlocked")) {
                s1 = "\uD8E3b><font color=\'red\'>\uD8E3/font></b><br>" + s1;
            }
        }
        catch(Throwable throwable0) {
            CLS204.MTH3257(throwable0);
        }
        ProgressBar progressBar0 = (ProgressBar)this.FLD818.get();
        if(progressBar0 != null) {
            if(this.FLD813.MTH3507("\uD8E3howUpdateProgress") || z || !this.FLD817.MTH3860() || this.FLD817.MTH3979() == 0 || this.FLD817.MTH3979() == this.FLD817.MTH4021()) {
                progressBar0.setVisibility(8);
            }
            else {
                int v3 = Math.round(((float)this.FLD817.MTH4021()) / ((float)this.FLD817.MTH3979()) * 100.0f);
                if(Build.VERSION.SDK_INT >= 24) {
                    progressBar0.setProgress(v3, true);
                }
                else {
                    progressBar0.setProgress(v3);
                }
                progressBar0.setVisibility(0);
            }
        }
        TextView textView0 = (TextView)this.FLD814.get();
        if(textView0 != null) {
            if(TextUtils.isEmpty(s1)) {
                textView0.setVisibility(8);
            }
            else {
                textView0.setVisibility(0);
                textView0.setText(Html.fromHtml(s1));
            }
        }
        TextView textView1 = (TextView)this.FLD823.get();
        if(textView1 != null) {
            if(!TextUtils.isEmpty(s6)) {
                textView1.setVisibility(0);
                textView1.setText(Html.fromHtml(CLS170.MTH3002(s6)));
                return;
            }
            textView1.setVisibility(8);
        }
    }

    public void MTH2918() {
        this.MTH2917();
        this.MTH2975();
    }

    // 去混淆评级： 低(38)
    // 此方法包含解密的字符串
    private void MTH2919(Activity activity0) {
        if(CLS102.MTH2161() && false) {
            CLS258.MTH3764(activity0, "", "", null, ((CLS111)new CLS689(this, activity0)));
            return;
        }
        CLS266.MTH4133(activity0, "");
    }

    // 去混淆评级： 中等(60)
    // 此方法包含解密的字符串
    private void MTH2920(Activity activity0) {
        CLS258.MTH3764(activity0, "", "", "", ((CLS111)new CLS691(this)));
    }

    // 此方法包含解密的字符串
    public final String MTH2921(String s, String s1, String s2) {
        CLS284 ˈⁱ0 = new CLS284();
        ˈⁱ0.MTH4226(s);
        ˈⁱ0.MTH4231(s2);
        ˈⁱ0.MTH4224(s1);
        return "";
    }

    public static CLS169 MTH2922() {
        return CLS169.FLD821;
    }

    // 去混淆评级： 低(20)
    // 此方法包含解密的字符串
    public static void MTH2923(Activity activity0) {
        CLS213.MTH3304().MTH3301("\uD8E3onation", "\uD8E3howManageLicensesDialog", new Object[]{activity0});
    }

    // 去混淆评级： 低(20)
    // 此方法包含解密的字符串
    public static void MTH2924(Activity activity0) {
        CLS213.MTH3304().MTH3301("\uD8E3onation", "\uD8E3howUpdateDialog", new Object[]{activity0, CLS95.MTH1995(), Boolean.FALSE});
    }

    // 此方法包含解密的字符串
    // 检测为 Lambda 实现
    private void MTH2926(DialogInterface dialogInterface0) [...]

    // 此方法包含解密的字符串
    public static void MTH2927() {
        CLS213.MTH3304().MTH3311("\uD8E3mportSettings", new Object[0]);
    }

    // 此方法包含解密的字符串
    // 检测为 Lambda 实现
    public static void MTH2929(Activity activity0, Uri uri0) [...]

    // 此方法包含解密的字符串
    // 检测为 Lambda 实现
    private void MTH2931(Activity activity0, View view0) [...]

    // 此方法包含解密的字符串
    public static void MTH2933() {
        CLS213.MTH3304().MTH3311("\uD8E3mportSettingsUpdateBackup", new Object[0]);
    }

    public void MTH2935() {
        CLS197 ˆˊ0 = this.FLD820;
        if(ˆˊ0 == null) {
            return;
        }
        ˆˊ0.MTH3206();
    }

    // 此方法包含解密的字符串
    public void MTH2938(Activity activity0) {
        public class CLS692 implements CLS111 {
            public final CLS169 FLD811;
            public final Activity FLD812;

            public CLS692(Activity activity0) {
                this.FLD812 = activity0;
                super();
            }

            @Override  // c.ˋﹳ.CLS111
            public void MTH2286() {
                CLS169.this.MTH2982(this.FLD812);
            }

            @Override  // c.ˋﹳ.CLS111
            public void MTH2287() {
            }
        }

        if(!CLS261.MTH3881().MTH3990() && CLS261.MTH3881().MTH3969()) {
            this.FLD827.clear();
            if(!CLS95.MTH2031().MTH2725("\uD8E3isclaimer_disable", false)) {
                CLS232.MTH3547(activity0, ((CLS111)new CLS692(this, activity0)));
                return;
            }
            this.MTH2982(activity0);
        }
    }

    // 此方法包含解密的字符串
    public static void MTH2940() {
        if(CLS261.MTH3881().MTH4020()) {
            return;
        }
        CLS213.MTH3304().MTH3311("\uD8E3xportSettings", new Object[0]);
    }

    // 此方法包含解密的字符串
    public static void MTH2947(String s) {
        ArrayList arrayList0 = new ArrayList();
        arrayList0.add(s);
        CLS213.MTH3304().MTH3301("\uD8E3onation", "\uD8E3ctivateKey", new Object[]{arrayList0, "\uD8E3"});
    }

    private void MTH2948(Activity activity0) {
        CLS258.MTH3804(activity0, ((CLS111)new CLS690(this)));
    }

    // 检测为 Lambda 实现
    private void MTH2950(String s) [...]

    public final void MTH2951(Throwable throwable0) {
        CLS204.MTH3257(throwable0);
        String s = Log.getStackTraceString(throwable0);
        this.FLD827.add(s);
    }

    public void MTH2953() {
        CLS197 ˆˊ0 = this.FLD820;
        if(ˆˊ0 == null) {
            return;
        }
        ˆˊ0.MTH3205();
    }

    // 此方法包含解密的字符串
    public static void MTH2954() {
        CLS213.MTH3304().MTH3311("\uD8E3mportSettingsAutoBackup", new Object[0]);
    }

    // 此方法包含解密的字符串
    private void MTH2956(Activity activity0) {
        CLS224.MTH3482(activity0, "");
        this.FLD817.MTH3853();
    }

    // 去混淆评级： 低(30)
    // 此方法包含解密的字符串
    private void MTH2958(Activity activity0, CLS291 ᵔﹶ0) {
        CLS682 ٴˑ0;
        String s;
        if(!CLS224.MTH3441() && !this.FLD813.MTH3524("\uD8E3egistration")) {
            ᵔﹶ0.MTH4331("\uD8E3odule_settings", ((CLS107)new CLS679(this, activity0)));
        }
        ᵔﹶ0.MTH4331("\uD8E3mport_settings", ((CLS107)new CLS675(activity0))).MTH4331("\uD8E3xport_settings", ((CLS107)new CLS665())).MTH4331("\uD8E3lear_settings", ((CLS107)new CLS662(this, activity0)));
        if(CLS104.MTH2238().MTH2217("\uD8E3onation") || CLS224.MTH3441() && CLS104.MTH2238().MTH2217("\uD8E3v")) {
            ᵔﹶ0.MTH4331("\uD8E3oolbar_settings", ((CLS107)new CLS676(activity0)));
        }
        ᵔﹶ0.MTH4331("\uD8E3heck_update", ((CLS107)new CLS668(this)));
        if(!CLS224.MTH3441()) {
            ᵔﹶ0.MTH4331("\uD8E3how_update_log", ((CLS107)new CLS664(activity0))).MTH4331("\uD8E3ownload_latest_apk", ((CLS107)new CLS670(this, activity0)));
            if(this.FLD817.MTH3951()) {
                if(this.FLD824.MTH3230("\uD8E3rouplic_unlocked")) {
                    ᵔﹶ0.MTH4331("\uD8E3anage_group_licenses", ((CLS107)new CLS681(activity0)));
                }
                ᵔﹶ0.MTH4331("\uD8E3eycard", ((CLS107)new CLS687(activity0)));
            }
        }
        ᵔﹶ0.MTH4331("\uD8E3estart_wechat", ((CLS107)new CLS663(this))).MTH4331("\uD8E3eset_module", ((CLS107)new CLS686(this, activity0)));
        if(!CLS224.MTH3441() && CLS104.MTH2238().MTH2217("\uD8E3onation") && !this.FLD817.MTH3894()) {
            if(CLS102.MTH2163()) {
                s = "\uD8E3onate_sub_integrated";
                ٴˑ0 = new CLS682(activity0);
                ᵔﹶ0.MTH4331(s, ((CLS107)ٴˑ0));
                return;
            }
            if(!this.FLD813.MTH3507("\uD8E3onate")) {
                ᵔﹶ0.MTH4331("\uD8E3onate", ((CLS107)new CLS684(activity0)));
            }
            if(!this.FLD813.MTH3507("\uD8E3bout")) {
                s = "\uD8E3onfigure_about_settings";
                ٴˑ0 = new CLS669(activity0);
                ᵔﹶ0.MTH4331(s, ((CLS107)ٴˑ0));
            }
        }
    }

    // 去混淆评级： 高(250)
    // 此方法包含解密的字符串
    // 检测为 Lambda 实现
    private void MTH2960(CLS791 ˋᵎ0, Activity activity0, AdapterView adapterView0, View view0, int v, long v1) [...]

    public static void MTH2961(CLS169 ⁱʽ0, Activity activity0) {
        ⁱʽ0.MTH2919(activity0);
    }

    public final void MTH2962(String s) {
        CLS204.MTH3252(s);
        this.FLD827.add(s);
    }

    // 去混淆评级： 低(20)
    // 此方法包含解密的字符串
    public static void MTH2964(Activity activity0) {
        CLS213.MTH3304().MTH3301("\uD8E3onation", "\uD8E3howSubscribeIntegratedModeDialog", new Object[]{activity0});
    }

    // 去混淆评级： 低(20)
    // 此方法包含解密的字符串
    public static void MTH2970(Activity activity0) {
        CLS213.MTH3304().MTH3301("\uD8E3onation", "\uD8E3howDonationDialog", new Object[]{activity0});
    }

    // 此方法包含解密的字符串
    public final void MTH2971(Activity activity0) {
        if(this.FLD816) {
            return;
        }
        this.MTH2962("\uD8E3uild settings dialog error");
        CLS232.MTH3540(activity0, TextUtils.join("\uD8E3", this.FLD827));
    }

    // 此方法包含解密的字符串
    private void MTH2972(Activity activity0) {
        try {
            Intent intent0 = new Intent();
            intent0.setFlags(0x10000000);
            intent0.setClassName(this.FLD813.MTH3519(), "\uD8E3om.android.x.MainActivity");
            activity0.startActivity(intent0);
        }
        catch(Throwable throwable0) {
            CLS204.MTH3257(throwable0);
        }
    }

    // 此方法包含解密的字符串
    // 检测为 Lambda 实现
    private void MTH2973() [...]

    // 去混淆评级： 低(20)
    // 此方法包含解密的字符串
    public final void MTH2975() {
        String s1;
        if(!this.FLD825) {
            return;
        }
        ArrayList arrayList0 = new ArrayList();
        if(!CLS224.MTH3441() && (!this.FLD813.MTH3524("\uD8E3egistration") && !CLS258.MTH3771())) {
            arrayList0.add(this.MTH2983("", "\uD8E3echat_xposed"));
        }
        String s = "";
        if(!CLS224.MTH3441() && (CLS246.MTH3660() || this.FLD817.MTH3996())) {
            s = CLS95.MTH2000(CLS49.MTH1006(0xFFFFFF6A09FFCF7EL));
        }
        else if(CLS200.MTH3224().MTH3225() && CLS102.MTH2153()) {
            s = CLS95.MTH2000(CLS49.MTH1006(0xFFFFFF5A09FFCF7EL));
        }
        if(!this.FLD817.MTH4020() || this.FLD817.MTH4017() != 807 || (this.FLD824.MTH3230("\uD8E3mulator_allowed") || !CLS104.MTH2238().MTH2217("\uD8E3onation"))) {
            SparseArray sparseArray0 = new SparseArray();
            int v = 0;
            for(Object object0: CLS213.MTH3304().MTH3326("\uD8E3ettings.options", new Object[0])) {
                Pair pair0 = (Pair)object0;
                if(((String)pair0.second).contains("\uD8E3")) {
                    sparseArray0.put(Integer.parseInt(((String)pair0.second).substring(((String)pair0.second).lastIndexOf("\uD8E3") + 1)), pair0);
                }
                else {
                    ++v;
                    sparseArray0.put(v, pair0);
                }
            }
            if(!CLS224.MTH3441() && (!this.FLD813.MTH3507("\uD8E3onate") && CLS104.MTH2238().MTH2217("\uD8E3onation"))) {
                if(CLS257.MTH3725() && this.FLD824.MTH3230("\uD8E3mulator_allowed")) {
                    arrayList0.add(this.MTH2921("", s, CLS49.MTH1006(0xFFFFFED409FFCF7EL)));
                }
                else if(!this.FLD817.MTH4020()) {
                    if(CLS102.MTH2163()) {
                        s1 = this.MTH2983("", CLS49.MTH1006(0xFFFFFEA309FFCF7EL));
                    }
                    else if(!this.FLD824.MTH3240() && !this.FLD824.MTH3230("\uD8E3emove_notice")) {
                        if(CLS102.MTH2161()) {
                            s = "";
                        }
                        s1 = this.MTH2921("", s, CLS49.MTH1006(0xFFFFFE3609FFCF7EL));
                    }
                    else if(CLS224.MTH3456(0, 5) == 0) {
                        if(CLS102.MTH2161()) {
                            s = "";
                        }
                        s1 = this.MTH2921("", s, CLS49.MTH1006(0xFFFFFE6509FFCF7EL));
                    }
                    else {
                        s1 = this.MTH2983("", CLS49.MTH1006(0xFFFFFE5709FFCF7EL));
                    }
                    arrayList0.add(s1);
                }
            }
            if(Build.VERSION.SDK_INT >= 19 && !CLS257.MTH3744(this.MTH2987(), CLS95.MTH2031().MTH2733("\uD8E3odule_dir_uri", ""))) {
                arrayList0.add(this.MTH2983("", "\uD8E3eq_moduledir_permission"));
            }
            if(this.FLD817.MTH3917()) {
                arrayList0.add(this.MTH2983("", "\uD8E3heck_update"));
            }
            if(!CLS102.MTH2163()) {
                for(int v1 = 0; v1 < sparseArray0.size(); ++v1) {
                    Pair pair1 = (Pair)sparseArray0.valueAt(v1);
                    String s2 = (String)pair1.second;
                    if(s2.contains("\uD8E3")) {
                        s2 = ((String)pair1.second).substring(0, ((String)pair1.second).lastIndexOf("\uD8E3"));
                    }
                    arrayList0.add(this.MTH2983(((String)pair1.first), s2));
                }
            }
            if(!CLS224.MTH3441() && (!this.FLD813.MTH3507("\uD8E3bout") && CLS104.MTH2238().MTH2217("\uD8E3onation"))) {
                arrayList0.add(this.MTH2983("", "\uD8E3onfigure_about_settings"));
            }
        }
        else {
            arrayList0.add(this.MTH2921("", s, "\uD8E3onfig_donate_key_emulator"));
        }
        if(!this.FLD828.MTH2725("\uD8E3isable_settings_search", false)) {
            CLS144.MTH2583().MTH2589(((CLS142)() -> // 此方法包含解密的字符串
            try {
                ArrayList arrayList0 = CLS213.MTH3304().MTH3326("\uD8E3ettings.keywords", new Object[]{CLS95.MTH2014(), this.MTH2987()});
                ArrayList arrayList1 = new ArrayList();
                for(Object object0: arrayList0) {
                    arrayList1.addAll(((ArrayList)object0));
                }
                this.FLD815.clear();
                for(Object object1: arrayList1) {
                    String s = ((ContentValues)object1).getAsString("\uD8E3itle");
                    String s1 = ((ContentValues)object1).getAsString("\uD8E3eywords");
                    String s2 = ((ContentValues)object1).getAsString("\uD8E3ag");
                    if(!TextUtils.isEmpty(s1)) {
                        new CLS284(s1);
                        String s3 = this.MTH2983(s + "\uD8E3[" + "" + "\uD8E3]", s2 + "\uD8E3");
                        this.FLD815.add(s3);
                    }
                }
            }
            catch(Throwable throwable0) {
                CLS204.MTH3257(throwable0);
            }));
        }
        CLS59 ᴵⁱ0 = this.FLD822;
        if(ᴵⁱ0 != null) {
            ᴵⁱ0.MTH1082(arrayList0);
            this.FLD822.MTH1083(this.FLD815);
        }
    }

    // 去混淆评级： 低(40)
    // 此方法包含解密的字符串
    public static void MTH2976(Activity activity0) {
        CLS213.MTH3304().MTH3295("\uD8E3onation", "\uD8E3ettings.config", new Object[]{"\uD8E3onfigure_about_settings", CLS95.MTH2014(), activity0, Boolean.FALSE, Boolean.FALSE, ""});
    }

    // 去混淆评级： 低(40)
    // 此方法包含解密的字符串
    public static void MTH2977(Activity activity0) {
        CLS213.MTH3304().MTH3301("\uD8E3onation", "\uD8E3ettings.config", new Object[]{"\uD8E3onfig_toolbar_settings", CLS95.MTH2014(), activity0, Boolean.FALSE, Boolean.FALSE, ""});
    }

    // 去混淆评级： 低(33)
    // 此方法包含解密的字符串
    public static void MTH2978(Activity activity0) {
        if(CLS261.MTH3881().MTH4020()) {
            return;
        }
        File file0 = new File(CLS243.MTH3630(), "" + "\uD8E3" + CLS95.MTH2014() + "\uD8E3settings.json");
        if(!CLS262.MTH4050(file0)) {
            file0 = new File(activity0.getCacheDir(), "\uD8E3" + CLS95.MTH2014() + "\uD8E3settings.json");
        }
        File file1 = new File(CLS243.MTH3630(), "\uD8E3" + CLS95.MTH2014() + "\uD8E3update_settings.json");
        if(!CLS262.MTH4050(file0) && !CLS262.MTH4050(file1)) {
            CLS213.MTH3304().MTH3311("\uD8E3mportSettings", new Object[0]);
            return;
        }
        CLS125 ʻᵢ0 = new CLS125(activity0, "");
        if(CLS262.MTH4050(file0)) {
            ʻᵢ0.MTH2417(String.format("", CLS259.MTH3820(file0.lastModified())), "\uD8E3mportSettings_auto", ((CLS107)new CLS677()));
        }
        if(CLS262.MTH4050(file1)) {
            ʻᵢ0.MTH2417(String.format("", CLS259.MTH3820(file1.lastModified())), "\uD8E3mportSettings_auto2", ((CLS107)new CLS678()));
        }
        ʻᵢ0.MTH2414("\uD8E3mportSettings_select", ((CLS107)new CLS667())).MTH2418();
    }

    // 此方法包含解密的字符串
    private void MTH2979(Activity activity0, LinearLayout linearLayout0) {
        TextView textView2;
        TextView textView1;
        ProgressBar progressBar0;
        TextView textView0 = null;
        try {
            progressBar0 = null;
            progressBar0 = new ProgressBar(activity0, null, 0x1010078);
            progressBar0.setIndeterminate(false);
            progressBar0.setPadding(CLS258.MTH3770(5), CLS258.MTH3770(3), CLS258.MTH3770(5), CLS258.MTH3770(10));
            progressBar0.setMax(100);
            this.FLD818 = new WeakReference(progressBar0);
            goto label_10;
        }
        catch(Throwable throwable0) {
            try {
                this.MTH2951(throwable0);
                try {
                label_10:
                    textView1 = null;
                    textView1 = new TextView(activity0);
                    textView1.setFocusable(true);
                    textView1.setFocusableInTouchMode(true);
                    textView1.setTextColor(CLS172.MTH3033());
                    textView1.setPadding(0, 0, 0, CLS258.MTH3770(10));
                    textView1.setOnClickListener((View view0) -> // 此方法包含解密的字符串
                    try {
                        if(this.FLD817.MTH3975() && !this.FLD817.MTH3872() || this.FLD817.MTH3985() || this.FLD817.MTH3849()) {
                            this.FLD828.MTH2739("\uD8E3afe_mode");
                            this.FLD828.MTH2739("\uD8E3afe_mode_cnt");
                            CLS257.MTH3710();
                            return;
                        }
                        if(this.MTH2988()) {
                            if(this.FLD817.MTH4024()) {
                                CLS257.MTH3736(activity0, new File(activity0.getCacheDir(), "\uD8E3eXposed.apk"));
                                return;
                            }
                            this.FLD817.MTH3963();
                            return;
                        }
                        if(this.FLD826) {
                            CLS213.MTH3304().MTH3301("\uD8E3onation", "\uD8E3x_donate", new Object[]{CLS95.MTH2014(), activity0});
                            return;
                        }
                        if(this.FLD817.MTH3870()) {
                            if(!this.FLD817.MTH3953(300000L)) {
                                return;
                            }
                            this.FLD817.MTH3858(true);
                            return;
                        }
                        int v = this.FLD819 + 1;
                        this.FLD819 = v;
                        if(v >= 4) {
                            view0.setVisibility(8);
                        }
                    }
                    catch(Throwable throwable0) {
                        CLS204.MTH3257(throwable0);
                    });
                    this.FLD814 = new WeakReference(textView1);
                }
                catch(Throwable throwable2) {
                    this.MTH2951(throwable2);
                }
                try {
                    textView2 = new TextView(activity0);
                }
                catch(Throwable throwable3) {
                    goto label_31;
                }
                try {
                    textView2.setTextColor(CLS172.MTH3033());
                    textView2.setPadding(0, 0, 0, CLS258.MTH3770(10));
                    this.FLD823 = new WeakReference(textView2);
                    goto label_33;
                }
                catch(Throwable throwable3) {
                    textView0 = textView2;
                }
            label_31:
                this.MTH2951(throwable3);
                textView2 = textView0;
                try {
                label_33:
                    this.MTH2917();
                }
                catch(Throwable throwable4) {
                    this.MTH2951(throwable4);
                }
                CLS796 ٴˈ0 = new CLS796(activity0);
                ٴˈ0.MTH4291(new View[]{progressBar0, textView1, textView2});
                CLS791 ˋᵎ0 = new CLS791(activity0);
                this.FLD822 = new CLS59(activity0);
                ˋᵎ0.MTH4249(CLS258.MTH3770(1));
                ˋᵎ0.MTH4247(((CLS286)(String s) -> this.FLD822.getFilter().filter(s)));
                if(!this.FLD828.MTH2725("\uD8E3isable_settings_search", false)) {
                    ˋᵎ0.MTH4250();
                }
                try {
                    this.MTH2975();
                }
                catch(Throwable throwable5) {
                    this.MTH2951(throwable5);
                }
                ˋᵎ0.MTH4244((AdapterView adapterView0, View view0, int v, long v1) -> // 去混淆评级： 高(250)
                // 此方法包含解密的字符串
                new CLS284(((String)ˋᵎ0.MTH4245().getItemAtPosition(v))));
                ˋᵎ0.MTH4246(this.FLD822);
                CLS798 ٴⁱ0 = new CLS798(activity0);
                ٴⁱ0.MTH4317(new Object[]{ٴˈ0, ˋᵎ0});
                CLS258.MTH3789(linearLayout0, ((CLS108)ٴⁱ0));
                this.FLD816 = true;
                return;
            }
            catch(Throwable throwable1) {
            }
        }
        this.MTH2951(throwable1);
    }

    // 此方法包含解密的字符串
    public final void MTH2982(Activity activity0) {
        public class CLS689 implements CLS111 {
            public final CLS169 FLD807;
            public final Activity FLD808;

            public CLS689(Activity activity0) {
                this.FLD808 = activity0;
                super();
            }

            // 去混淆评级： 低(30)
            // 此方法包含解密的字符串
            @Override  // c.ˋﹳ.CLS111
            public void MTH2286() {
                CLS266.MTH4133(this.FLD808, "");
            }

            @Override  // c.ˋﹳ.CLS111
            public void MTH2287() {
            }
        }


        public class CLS690 implements CLS111 {
            public final CLS169 FLD809;

            @Override  // c.ˋﹳ.CLS111
            public void MTH2286() {
                CLS169.this.FLD828.MTH2747();
                CLS262.MTH4067(CLS243.MTH3612());
            }

            @Override  // c.ˋﹳ.CLS111
            public void MTH2287() {
            }
        }


        public class CLS691 implements CLS111 {
            public final CLS169 FLD810;

            // 此方法包含解密的字符串
            @Override  // c.ˋﹳ.CLS111
            public void MTH2286() {
                try {
                    CLS95.MTH2023();
                    CLS169.this.FLD828.MTH2739("\uD8E3afe_mode");
                    CLS169.this.FLD828.MTH2739("\uD8E3afe_mode_cnt");
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
            this.FLD817.MTH3932();
            try {
                CLS197 ˆˊ0 = this.FLD820;
                if(ˆˊ0 != null) {
                    if(ˆˊ0.isShowing()) {
                        this.FLD820.dismiss();
                    }
                    this.FLD820 = null;
                    this.FLD816 = false;
                }
            }
            catch(Throwable throwable1) {
                this.MTH2951(throwable1);
            }
            if(activity0 != null && !activity0.isFinishing()) {
                if(TextUtils.isEmpty(CLS95.MTH2014()) || "\uD8E3NO_ID+".equals(CLS95.MTH2014())) {
                    this.MTH2962("\uD8E3ccount name not available");
                }
                this.FLD825 = true;
                String s = CLS246.MTH3656();
                this.FLD819 = 0;
                CLS197 ˆˊ1 = new CLS197(activity0, s);
                this.FLD820 = ˆˊ1;
                ˆˊ1.MTH3208(((CLS196)new CLS680(this, activity0)));
                this.FLD820.MTH3204(((CLS195)new CLS672(this, activity0)));
                this.FLD820.show();
                this.FLD820.setOnCancelListener((DialogInterface dialogInterface0) -> // 此方法包含解密的字符串
                if(this.FLD825) {
                    try {
                        this.FLD825 = false;
                        CLS213.MTH3304().MTH3323("\uD8E3nsettingschange", new Object[0]);
                    }
                    catch(Throwable throwable0) {
                        CLS204.MTH3257(throwable0);
                    }
                });
                this.FLD820.setOnDismissListener((DialogInterface dialogInterface0) -> // 此方法包含解密的字符串
                if(this.FLD825) {
                    try {
                        this.FLD825 = false;
                        CLS213.MTH3304().MTH3323("\uD8E3nsettingschange", new Object[0]);
                    }
                    catch(Throwable throwable0) {
                        CLS204.MTH3257(throwable0);
                    }
                });
                return;
            }
            this.MTH2962("\uD8E3uild settings activity error");
        }
        catch(Throwable throwable0) {
            this.MTH2951(throwable0);
            this.MTH2971(activity0);
        }
    }

    public final String MTH2983(String s, String s1) {
        return this.MTH2921(s, null, s1);
    }

    // 去混淆评级： 低(40)
    // 此方法包含解密的字符串
    public static void MTH2984(Activity activity0) {
        CLS258.MTH3805(activity0, "", "", "", 1, ((CLS109)new CLS697()));
    }

    // 检测为 Lambda 实现
    public static void MTH2985(Activity activity0, HashSet hashSet0) [...]

    // 此方法包含解密的字符串
    public void MTH2986(Activity activity0, Intent intent0) {
        Uri uri0 = intent0.getData();
        if(uri0 == null) {
            return;
        }
        if(Build.VERSION.SDK_INT >= 19) {
            try {
                activity0.getContentResolver().takePersistableUriPermission(uri0, 3);
                String s = CLS95.MTH2031().MTH2733("\uD8E3odule_dir_uri", "");
                if(!TextUtils.isEmpty(s) && !s.equals(uri0.toString())) {
                    CLS144.MTH2583().MTH2589(((CLS142)() -> // 此方法包含解密的字符串
                    {
                        CLS299 ـᵎ0 = CLS243.MTH3632(activity0, 1);
                        CLS95.MTH2031().MTH2749("\uD8E3odule_dir_uri", uri0.toString());
                        CLS243.MTH3604(ـᵎ0, CLS243.MTH3632(activity0, 1));
                    }));
                    return;
                }
                CLS95.MTH2031().MTH2749("\uD8E3odule_dir_uri", uri0.toString());
                this.MTH2975();
                HashSet hashSet0 = new HashSet();
                hashSet0.add("\uD8E3ACKUP");
                hashSet0.add("\uD8E3ssets");
                CLS144.MTH2583().MTH2589(((CLS142)() -> {
                    CLS299 ـᵎ0 = CLS243.MTH3632(activity0, 1);
                    CLS243.MTH3641(CLS243.MTH3637(activity0, 1), ـᵎ0, hashSet0, false);
                    CLS243.MTH3641(CLS243.MTH3618(activity0, 1), ـᵎ0, hashSet0, false);
                    CLS243.MTH3641(CLS243.MTH3625(activity0, 1), ـᵎ0, hashSet0, false);
                    CLS243.MTH3641(CLS243.MTH3649(activity0, 1), ـᵎ0, hashSet0, false);
                }));
            }
            catch(Throwable throwable0) {
                CLS204.MTH3257(throwable0);
            }
        }
    }

    // 去混淆评级： 低(20)
    // 此方法包含解密的字符串
    public final Activity MTH2987() {
        return (Activity)CLS213.MTH3304().MTH3316("\uD8E3etCurrentActivity", new Object[0]);
    }

    // 此方法包含解密的字符串
    public final boolean MTH2988() {
        if(!this.FLD828.MTH2725("\uD8E3utoupdate_enable", false)) {
            return false;
        }
        int v = this.FLD813.MTH3500();
        ContentValues contentValues0 = this.FLD817.MTH3891();
        if(contentValues0 != null) {
            return v == -1 ? CLS224.MTH3474(this.FLD813.MTH3516(), contentValues0.getAsString("\uD8E3ersionName")) == 1 : (contentValues0.containsKey("\uD8E3ersionCode") ? ((int)contentValues0.getAsInteger("\uD8E3ersionCode")) : 0) > v;
        }
        return false;
    }
}

