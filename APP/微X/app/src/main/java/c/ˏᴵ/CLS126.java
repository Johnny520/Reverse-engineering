// Decompiled by JEB v5.42.0.202606242140

package c.ˏᴵ;

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
import c.ʾˎ.CLS41;
import c.ˆﾞ.CLS51;
import c.ˉˆ.CLS59;
import c.ˉˆ.CLS70;
import c.ˊﹶ.CLS97;
import c.ˊﹶ.CLS98;
import c.ˎﹳ.CLS107;
import c.ˏי.CLS111;
import c.ˏי.CLS112;
import c.ˏᵎ.CLS138;
import c.ˏᵎ.CLS139;
import c.ˏᵎ.CLS144;
import c.ˏᵎ.CLS170;
import c.ˏᵎ.CLS176;
import c.ˏᵎ.CLS179;
import c.ˏᵎ.CLS180;
import c.ˏᵎ.CLS184;
import c.ˏᵎ.CLS185;
import c.ˏᵎ.CLS191;
import c.ˏᵎ.CLS194;
import c.ˏᵎ.CLS197;
import c.ˏᵎ.CLS226;
import c.ᴵˉ.CLS283;
import c.ᴵˉ.CLS594.CLS282;
import c.ᴵˉ.CLS594;
import c.ᴵˉ.CLS595;
import c.ᴵˉ.CLS600;
import c.ᴵˉ.CLS601;
import c.ᴵˉ.CLS604.CLS289;
import c.ᴵˉ.CLS604;
import c.ﹶˆ.CLS341;
import c.ﹶˆ.CLS342;
import c.ﹶˆ.CLS343;
import c.ﹶˆ.CLS345;
import java.io.File;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashSet;

public class CLS126 {
    public final CLS191 FLD538;
    public WeakReference FLD539;
    public boolean FLD540;
    public final ArrayList FLD541;
    public static final CLS126 FLD542;
    public final CLS59 FLD543;
    public WeakReference FLD544;
    public boolean FLD545;
    public CLS51 FLD546;
    public WeakReference FLD547;
    public final CLS170 FLD548;
    public AlertDialog FLD549;
    public final CLS139 FLD550;

    static {
        CLS126.FLD542 = new CLS126();
    }

    public CLS126() {
        this.FLD540 = false;
        this.FLD548 = CLS170.MTH2460();
        this.FLD550 = (CLS139)CLS70.MTH1131().MTH1147(CLS139.class);
        this.FLD538 = CLS191.MTH2830();
        this.FLD543 = CLS98.MTH1297();
        this.FLD541 = new ArrayList();
    }

    // 去混淆评级： 低(40)
    // 此方法包含解密的字符串
    public static void MTH1921(Activity activity0) {
        CLS194.MTH2881().MTH2902("donation", "settings.config", new Object[]{"config_toolbar_settings", CLS98.MTH1305(), activity0, Boolean.FALSE, Boolean.FALSE, ""});
    }

    public void MTH1922() {
        this.MTH1949();
        this.MTH1928();
    }

    // 此方法包含解密的字符串
    // 检测为 Lambda 实现
    private void MTH1923(Activity activity0, View view0) [...]

    // 此方法包含解密的字符串
    private void MTH1924(Activity activity0) {
        try {
            Intent intent0 = new Intent();
            intent0.setFlags(0x10000000);
            intent0.setClassName(this.FLD550.MTH2128(), "com.android.x.MainActivity");
            activity0.startActivity(intent0);
        }
        catch(Throwable throwable0) {
            CLS185.MTH2708(throwable0);
        }
    }

    // 去混淆评级： 低(20)
    // 此方法包含解密的字符串
    public static void MTH1927(Activity activity0) {
        CLS194.MTH2881().MTH2902("donation", "showUpdateDialog", new Object[]{activity0, CLS98.MTH1316(), Boolean.FALSE});
    }

    // 去混淆评级： 低(33)
    // 此方法包含解密的字符串
    public final void MTH1928() {
        if(!this.FLD545) {
            return;
        }
        ArrayList arrayList0 = new ArrayList();
        if(!CLS184.MTH2693() && (!this.FLD550.MTH2121("registration") && !CLS144.MTH2183())) {
            arrayList0.add("((wechat_xposed))");
        }
        arrayList0.add("((reset))");
        arrayList0.add("((restart))");
        arrayList0.add("((check_update))");
        CLS51 ˋʼ0 = this.FLD546;
        if(ˋʼ0 != null) {
            ˋʼ0.MTH933(arrayList0);
        }
    }

    // 去混淆评级： 低(20)
    // 此方法包含解密的字符串
    public static void MTH1933(CLS604 ﾞʿ0, Activity activity0, String s) {
        if(!TextUtils.isEmpty(s) && s.startsWith("d ")) {
            String[] arr_s = s.split(" ");
            if(arr_s.length <= 2) {
                return;
            }
            ﾞʿ0.MTH3735("");
            CLS170.MTH2460().MTH2474(true);
            switch(arr_s[1]) {
                case "core": {
                    CLS194.MTH2881().MTH2893("core", "downloadCore", new Object[0]);
                    break;
                }
                case "lib": {
                    CLS194.MTH2881().MTH2893("core", "downloadLib", new Object[0]);
                    break;
                }
                default: {
                    CLS194.MTH2881().MTH2893("core", "downloadFeaturePack", new Object[]{arr_s[1]});
                }
            }
            CLS184.MTH2702(activity0, "download " + arr_s[1]);
        }
    }

    // 检测为 Lambda 实现
    private void MTH1936(DialogInterface dialogInterface0) [...]

    public static CLS126 MTH1938() {
        return CLS126.FLD542;
    }

    // 去混淆评级： 低(20)
    // 此方法包含解密的字符串
    // 检测为 Lambda 实现
    private void MTH1939(CompoundButton compoundButton0, boolean z) [...]

    // 去混淆评级： 低(40)
    // 此方法包含解密的字符串
    public final String MTH1940(String s, String s1) [...] // 潜在的解密器

    // 去混淆评级： 低(20)
    // 此方法包含解密的字符串
    public final Activity MTH1941() {
        return (Activity)CLS194.MTH2881().MTH2878("getCurrentActivity", new Object[0]);
    }

    // 此方法包含解密的字符串
    private void MTH1942(Activity activity0) {
        CLS184.MTH2702(activity0, "");
        this.FLD548.MTH2406();
    }

    // 此方法包含解密的字符串
    public final void MTH1943(Activity activity0) {
        if(this.FLD540) {
            return;
        }
        CLS185.MTH2711("build settings dialog error");
        CLS138.MTH2086(activity0, TextUtils.join("\r", this.FLD541));
    }

    // 检测为 Lambda 实现
    private void MTH1944(DialogInterface dialogInterface0) [...]

    // 去混淆评级： 中等(60)
    // 此方法包含解密的字符串
    private void MTH1945(Activity activity0) {
        CLS144.MTH2184(activity0, "", "", "", ((CLS343)new CLS473(this)));
    }

    // 去混淆评级： 高(400)
    // 此方法包含解密的字符串
    // 检测为 Lambda 实现
    private void MTH1946(CLS594 ʾᐧ0, Activity activity0, AdapterView adapterView0, View view0, int v, long v1) [...]

    // 此方法包含解密的字符串
    public final boolean MTH1947() {
        if(!this.FLD543.MTH994("autoupdate_enable", false)) {
            return false;
        }
        int v = this.FLD550.MTH2129();
        ContentValues contentValues0 = this.FLD548.MTH2447();
        if(contentValues0 != null) {
            return v == -1 ? CLS184.MTH2696(this.FLD550.MTH2107(), contentValues0.getAsString("versionName")) == 1 : (contentValues0.containsKey("versionCode") ? ((int)contentValues0.getAsInteger("versionCode")) : 0) > v;
        }
        return false;
    }

    public final void MTH1948(String s) {
        CLS185.MTH2711(s);
        this.FLD541.add(s);
    }

    // 去混淆评级： 低(23)
    // 此方法包含解密的字符串
    public void MTH1949() {
        String s10;
        StringBuilder stringBuilder4;
        StringBuilder stringBuilder2;
        String s4;
        long v;
        StringBuilder stringBuilder0;
        if(!this.FLD545) {
            return;
        }
        Activity activity0 = this.MTH1941();
        if(activity0 == null) {
            return;
        }
        String s = this.FLD550.MTH2107();
        String s1 = CLS179.MTH2612();
        boolean z = this.FLD543.MTH994("donate_priority_warning", false);
        if(CLS111.MTH1565()) {
            s1 = s1 + " <br><b>" + "" + "</b>";
        }
        if(this.FLD543.MTH994("autoupdate_enable", false)) {
            ContentValues contentValues0 = this.FLD548.MTH2447();
            if(contentValues0 != null) {
                String s2 = contentValues0.containsKey("versionName") ? contentValues0.getAsString("versionName") : "0.0";
                if(this.MTH1947()) {
                    if(s2.equals(s) || !TextUtils.isEmpty(this.FLD550.MTH2107()) && !this.FLD550.MTH2107().equals(s)) {
                        s4 = "<b><font color=\'#30DAEB\'></font></b><br>";
                    }
                    else {
                        String s3 = "<b><font color=\'#30DAEB\'>" + String.format("", s2) + "</font></b><br>";
                        if(this.FLD548.MTH2395()) {
                            stringBuilder0 = new StringBuilder();
                            stringBuilder0.append(s3);
                            stringBuilder0.append("");
                            v = -242458792656008L;
                        }
                        else {
                            stringBuilder0 = new StringBuilder();
                            stringBuilder0.append(s3);
                            stringBuilder0.append("<b><font color=\'#FA58F4\'>");
                            stringBuilder0.append("");
                            v = 0xFFFF233329CA8378L;
                        }
                        stringBuilder0.append(CLS41.MTH858(v));
                        s4 = stringBuilder0.toString();
                    }
                    s1 = s4 + s1;
                }
            }
        }
        String s5 = this.FLD548.MTH2449();
        try {
            if(this.FLD548.MTH2506()) {
                s1 = "<b><font color=\'green\'></font></b><br>" + s1;
            }
            else if(!CLS184.MTH2683()) {
                CLS184.MTH2677();
                s1 = s1 + "<br><b><font color=\'#b636ed\'>" + String.format("", this.FLD550.MTH2122());
                if(this.FLD550.MTH2105(activity0)) {
                    s1 = s1 + " (play) ";
                }
                if(z) {
                    s1 = s1 + "";
                }
                s1 = s1 + "</font></b><br>";
            }
            else {
                if(this.FLD548.MTH2527() && !this.FLD548.MTH2485()) {
                    s1 = "<b><font color=\'red\'>" + "" + "</font></b><br>" + s1;
                }
                else if(this.FLD548.MTH2519()) {
                    s1 = "<b><font color=\'#FACC2E\'>" + "" + "</font></b><br>" + s1;
                }
                String s6 = "";
                int v1 = CLS112.MTH1614();
                if(!this.FLD548.MTH2527() && v1 > 2) {
                    if(CLS176.MTH2570(this.FLD548.MTH2503())) {
                        s6 = "<br>";
                    }
                    String s7 = s6 + this.FLD550.MTH2122() + "_" + this.FLD550.MTH2120() + " (" + CLS184.MTH2662(activity0) + ")[" + this.FLD550.MTH2116() + "]";
                    if(this.FLD550.MTH2105(activity0)) {
                        s7 = s7 + "{PLAY}";
                    }
                    s1 = "<b><font color=\'#30DAEB\'>" + s7 + "</font></b><br>" + s1;
                }
            }
            if(this.FLD548.MTH2543() && !this.FLD548.MTH2359()) {
                s1 = "<b><font color=\'green\'>" + CLS98.MTH1302((this.FLD548.MTH2417() ? "modules_reloaded" : "updated")) + "</font></b><br>" + s1;
            }
            if(this.FLD548.MTH2485()) {
                s1 = "<b><font color=\'green\'></font></b><br>" + s1;
            }
            if(this.FLD548.MTH2413()) {
                s1 = "<b><font color=\'red\'></font></b><br>" + s1;
            }
            if(this.FLD548.MTH2522()) {
                s1 = "<b><font color=\'#f9ce57\'></font></b><br>" + s1;
            }
            if(this.FLD548.MTH2400()) {
                s1 = "<b><font color=\'green\'></font></b><br>" + s1;
            }
            if(this.FLD548.MTH2403()) {
                s1 = "<b><font color=\'red\'></font></b><br>" + s1;
            }
            String s8 = "";
            if(this.FLD548.MTH2438() != 0) {
                if(this.FLD548.MTH2428()) {
                    stringBuilder2 = new StringBuilder();
                    stringBuilder2.append("");
                    stringBuilder2.append(" ");
                    stringBuilder2.append(CLS98.MTH1305());
                    goto label_100;
                }
                else if(this.FLD548.MTH2438() == 811) {
                    stringBuilder2 = new StringBuilder();
                    stringBuilder2.append("");
                    stringBuilder2.append(" ");
                    stringBuilder2.append("");
                    goto label_100;
                }
                else if(this.FLD548.MTH2438() != 501) {
                    stringBuilder2 = new StringBuilder();
                    stringBuilder2.append("");
                    stringBuilder2.append(" ");
                    stringBuilder2.append("");
                label_100:
                    s8 = stringBuilder2.toString();
                }
                s1 = "<b><font color=\'red\'>" + String.format("Disabled error code: %05X", ((int)(0xFFFFF & this.FLD548.MTH2438()))) + s8 + "</font></b><br>" + s1;
                int v2 = this.FLD548.MTH2438();
                switch(v2) {
                    case 502: {
                        s1 = "<b><font color=\'red\'>" + "" + "</font></b><br>" + s1;
                        break;
                    }
                    case 505: {
                        s1 = "<b><font color=\'red\'>" + "" + "</font></b><br>" + s1;
                        break;
                    }
                    case 501: 
                    case 510: {
                        s1 = "<b><font color=\'red\'>" + "" + "</font></b><br>" + s1;
                        break;
                    }
                    case 807: {
                        if(!this.FLD538.MTH2828("emulator_allowed")) {
                            s1 = "<b><font color=\'red\'>" + "" + "</font></b><br>" + s1;
                        }
                        break;
                    }
                    default: {
                        if(v2 == 700 || v2 == 701 || v2 == 702 || v2 == 703) {
                            s1 = "<b><font color=\'red\'>" + "" + "</font></b><br>" + s1;
                            break;
                        }
                    }
                }
                if(!CLS184.MTH2693() && this.FLD548.MTH2438() == 501 && this.FLD548.MTH2368() && !this.FLD548.MTH2374()) {
                    this.FLD548.MTH2375(false);
                }
            }
            else if(this.FLD548.MTH2397() != 0) {
                s1 = "<b><font color=\'red\'>" + String.format("Conflict error code: %05X", ((int)(0xFFFFF & this.FLD548.MTH2397()))) + "</font></b><br>" + s1;
            }
            if(this.FLD548.MTH2526()) {
                HashSet hashSet0 = new HashSet();
                for(Object object0: this.FLD548.MTH2446()) {
                    hashSet0.add(CLS180.MTH2651(activity0, ((String)object0)) + "(" + ((String)object0) + ")");
                }
                if(hashSet0.isEmpty()) {
                    stringBuilder4 = new StringBuilder();
                    stringBuilder4.append("<b><font color=\'green\'>");
                    stringBuilder4.append("");
                    stringBuilder4.append("</font></b><br>");
                }
                else {
                    stringBuilder4 = new StringBuilder();
                    stringBuilder4.append("<b><font color=\'red\'>");
                    stringBuilder4.append(String.format("", TextUtils.join(",", hashSet0)));
                    stringBuilder4.append("</font></b><br>");
                }
                stringBuilder4.append(s1);
                s1 = stringBuilder4.toString();
            }
            if(this.FLD548.MTH2372() && this.FLD548.MTH2438() == 807 && this.FLD538.MTH2828("emulator_allowed")) {
                s1 = "<b><font color=\'green\'></font></b><br>" + s1;
            }
            if(!TextUtils.isEmpty(s5)) {
                s5 = CLS197.MTH2932(s5);
            }
            if(this.FLD548.MTH2534()) {
                s1 = "<b><font color=\'red\'></font></b><br>" + s1;
            }
            if(this.FLD548.MTH2492()) {
                s1 = "<b><font color=\'red\'></font></b><br>" + s1;
            }
            if(this.FLD548.MTH2532()) {
                s1 = "<b><font color=\'green\'></font></b><br>" + s1;
            }
            String s9 = "<br>";
            if(CLS98.MTH1297().MTH994("hookFail", false)) {
                if(CLS111.MTH1571()) {
                    s9 = "<br><br>";
                }
                s1 = "<br><b><font color=\'red\'>(" + CLS111.MTH1582() + ")</font></b><br>" + s9 + s1;
            }
            s10 = "<b><font color=\'red\'></font></b><br>" + s1;
        }
        catch(Throwable throwable0) {
            CLS185.MTH2708(throwable0);
            s10 = s1;
        }
        ProgressBar progressBar0 = (ProgressBar)this.FLD539.get();
        if(progressBar0 != null) {
            if(this.FLD550.MTH2117("showUpdateProgress") || z || !this.FLD548.MTH2467() || this.FLD548.MTH2469() == 0 || this.FLD548.MTH2469() == this.FLD548.MTH2433()) {
                progressBar0.setVisibility(8);
            }
            else {
                int v3 = Math.round(((float)this.FLD548.MTH2433()) / ((float)this.FLD548.MTH2469()) * 100.0f);
                if(Build.VERSION.SDK_INT >= 24) {
                    progressBar0.setProgress(v3, true);
                }
                else {
                    progressBar0.setProgress(v3);
                }
                progressBar0.setVisibility(0);
            }
        }
        TextView textView0 = (TextView)this.FLD547.get();
        if(textView0 != null) {
            if(TextUtils.isEmpty(s10)) {
                textView0.setVisibility(8);
            }
            else {
                textView0.setVisibility(0);
                textView0.setText(Html.fromHtml(s10));
            }
        }
        TextView textView1 = (TextView)this.FLD544.get();
        if(textView1 != null) {
            if(!TextUtils.isEmpty(s5)) {
                textView1.setVisibility(0);
                textView1.setText(Html.fromHtml(CLS197.MTH2932(s5)));
                return;
            }
            textView1.setVisibility(8);
        }
    }

    // 此方法包含解密的字符串
    public final void MTH1950() {
        String s = this.FLD543.MTH1015("last_update_check", "");
        if(!TextUtils.isEmpty(s)) {
            long v = System.currentTimeMillis() - Long.parseLong(s, 16);
            if(v < 300000L) {
                int v1 = ((int)(300000L - v)) / 1000;
                CLS184.MTH2702(this.MTH1941(), String.format("", ((int)(v1 / 60)), ((int)(v1 % 60))));
                return;
            }
        }
        CLS184.MTH2702(this.MTH1941(), "");
        this.FLD548.MTH2375(true);
    }

    public static void MTH1951() {
        if(CLS184.MTH2703(CLS97.MTH1263())) {
            CLS184.MTH2690(CLS97.MTH1263());
        }
        CLS180.MTH2650();
    }

    public final void MTH1953(Throwable throwable0) {
        CLS185.MTH2708(throwable0);
        String s = Log.getStackTraceString(throwable0);
        this.FLD541.add(s);
    }

    // 检测为 Lambda 实现
    private void MTH1957(String s) [...]

    // 此方法包含解密的字符串
    public final void MTH1958(Activity activity0) {
        public class CLS473 implements CLS343 {
            public final CLS126 FLD536;

            @Override  // c.ﹶˆ.CLS343
            public void MTH4826() {
            }

            @Override  // c.ﹶˆ.CLS343
            public void MTH4827() {
                try {
                    CLS98.MTH1276();
                    CLS180.MTH2650();
                }
                catch(Throwable throwable0) {
                    CLS185.MTH2708(throwable0);
                }
            }
        }


        public class CLS474 implements CLS343 {
            public final CLS126 FLD537;

            @Override  // c.ﹶˆ.CLS343
            public void MTH4826() {
            }

            @Override  // c.ﹶˆ.CLS343
            public void MTH4827() {
                try {
                    CLS98.MTH1276();
                    CLS180.MTH2650();
                }
                catch(Throwable throwable0) {
                    CLS185.MTH2708(throwable0);
                }
            }
        }

        try {
            this.FLD548.MTH2457();
            try {
                if(this.FLD549 != null && this.FLD549.isShowing()) {
                    this.FLD549.dismiss();
                }
                this.FLD540 = false;
            }
            catch(Throwable throwable1) {
                this.MTH1953(throwable1);
            }
            if(activity0 == null || activity0.isFinishing()) {
                this.MTH1948("build settings activity error");
                return;
            }
            this.FLD545 = true;
            AlertDialog alertDialog0 = CLS144.MTH2169(activity0, "", ((CLS342)new CLS459(this, activity0)));
            this.FLD549 = alertDialog0;
            if(alertDialog0 != null) {
                alertDialog0.setOnCancelListener((DialogInterface dialogInterface0) -> if(this.FLD545) {
                    this.FLD545 = false;
                });
                this.FLD549.setOnDismissListener((DialogInterface dialogInterface0) -> if(this.FLD545) {
                    this.FLD545 = false;
                });
            }
        }
        catch(Throwable throwable0) {
            this.MTH1953(throwable0);
        }
    }

    public void MTH1959(Activity activity0) {
        this.MTH1958(activity0);
        this.MTH1943(activity0);
    }

    // 此方法包含解密的字符串
    private void MTH1960(Activity activity0, Object[] arr_object) {
        Throwable throwable3;
        ProgressBar progressBar0;
        try {
            Menu menu0 = (Menu)arr_object[0];
            LinearLayout linearLayout0 = (LinearLayout)arr_object[1];
            try {
                CLS283 ˉˎ0 = new CLS283(activity0, linearLayout0, menu0);
                if(!CLS184.MTH2693() && !this.FLD550.MTH2121("registration")) {
                    ˉˎ0.MTH3648("module_settings", ((CLS345)new CLS469(this, activity0)));
                }
                if(CLS107.MTH1479().MTH1457("donation")) {
                    ˉˎ0.MTH3648("toolbar_settings", ((CLS345)new CLS463(activity0)));
                }
                ˉˎ0.MTH3648("check_update", ((CLS345)new CLS447(this)));
                if(!CLS184.MTH2693()) {
                    ˉˎ0.MTH3648("show_update_log", ((CLS345)new CLS466(activity0))).MTH3648("download_latest_apk", ((CLS345)new CLS462(this, activity0)));
                }
                ˉˎ0.MTH3648("restart_wechat", ((CLS345)new CLS477())).MTH3648("reset_module", ((CLS345)new CLS467(this, activity0)));
                ˉˎ0.MTH3650();
            }
            catch(Throwable throwable1) {
                this.MTH1953(throwable1);
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
                progressBar0.setPadding(CLS144.MTH2175(5), CLS144.MTH2175(3), CLS144.MTH2175(5), CLS144.MTH2175(10));
                progressBar0.setMax(100);
                this.FLD539 = new WeakReference(progressBar0);
                goto label_28;
            }
            catch(Throwable throwable3) {
            }
        label_27:
            this.MTH1953(throwable3);
        label_28:
            TextView textView0 = new TextView(activity0);
            this.FLD547 = new WeakReference(textView0);
            textView0.setFocusable(true);
            textView0.setFocusableInTouchMode(true);
            textView0.setTextColor(CLS226.MTH3099());
            textView0.setPadding(0, 0, 0, CLS144.MTH2175(10));
            textView0.setOnClickListener((View view0) -> // 此方法包含解密的字符串
            try {
                if(this.FLD548.MTH2543() && !this.FLD548.MTH2359() || this.FLD548.MTH2400() || this.FLD548.MTH2532()) {
                    CLS180.MTH2650();
                    return;
                }
                if(this.MTH1947()) {
                    if(this.FLD548.MTH2395()) {
                        CLS180.MTH2619(activity0, new File(activity0.getCacheDir(), "WeXposed.apk"));
                        return;
                    }
                    this.FLD548.MTH2351();
                    return;
                }
                if(this.FLD548.MTH2413()) {
                    if(!this.FLD548.MTH2517(300000L)) {
                        return;
                    }
                    this.FLD548.MTH2375(true);
                }
            }
            catch(Throwable throwable0) {
                CLS185.MTH2708(throwable0);
            });
            TextView textView1 = new TextView(activity0);
            this.FLD544 = new WeakReference(textView1);
            textView1.setTextColor(CLS226.MTH3099());
            textView1.setPadding(0, 0, 0, CLS144.MTH2175(10));
            this.MTH1949();
            CLS600 ᴵˉ0 = new CLS600(activity0);
            ᴵˉ0.MTH3694(new View[]{progressBar0, textView0, textView1});
            CLS595 ˆﾞ0 = new CLS595(activity0);
            ˆﾞ0.MTH3623("");
            ˆﾞ0.MTH3620(this.FLD543.MTH994("disable_safemode", false));
            ˆﾞ0.MTH3621((CompoundButton compoundButton0, boolean z) -> // 去混淆评级： 低(20)
            // 此方法包含解密的字符串
            this.FLD543.MTH984("disable_safemode", Boolean.valueOf(z)));
            CLS144.MTH2191(linearLayout0, ((CLS341)ˆﾞ0), true);
            CLS594 ʾᐧ0 = new CLS594(activity0);
            ʾᐧ0.MTH3615(CLS144.MTH2175(1));
            ʾᐧ0.MTH3608(((CLS282)(String s) -> this.FLD546.getFilter().filter(s)));
            this.FLD546 = new CLS51(activity0);
            this.MTH1928();
            ʾᐧ0.MTH3610((AdapterView adapterView0, View view0, int v, long v1) -> // 去混淆评级： 高(400)
            // 此方法包含解密的字符串
            {
            });
            ʾᐧ0.MTH3613(this.FLD546);
            CLS601 ᵔʼ0 = new CLS601(activity0);
            ᵔʼ0.MTH3703(new Object[]{ᴵˉ0, ʾᐧ0});
            CLS144.MTH2179(linearLayout0, ((CLS341)ᵔʼ0));
            CLS604 ﾞʿ0 = new CLS604(activity0);
            ﾞʿ0.MTH3727(((CLS289)new CLS464(ﾞʿ0, activity0)));
            CLS144.MTH2191(linearLayout0, ((CLS341)ﾞʿ0), true);
            this.FLD540 = true;
        }
        catch(Throwable throwable0) {
            this.MTH1953(throwable0);
        }
    }
}

