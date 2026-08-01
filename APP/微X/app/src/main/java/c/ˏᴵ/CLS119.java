// Decompiled by JEB v5.42.0.202606242140

package c.ˏᴵ;

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
import c.ʾˎ.CLS41;
import c.ˆﾞ.CLS51;
import c.ˉˆ.CLS59;
import c.ˉˆ.CLS70.CLS69;
import c.ˉˆ.CLS70;
import c.ˊﹶ.CLS98;
import c.ˎﹳ.CLS107;
import c.ˏי.CLS111;
import c.ˏי.CLS112;
import c.ˏᵎ.CLS137.CLS135;
import c.ˏᵎ.CLS137.CLS136;
import c.ˏᵎ.CLS137;
import c.ˏᵎ.CLS138;
import c.ˏᵎ.CLS139;
import c.ˏᵎ.CLS144;
import c.ˏᵎ.CLS161;
import c.ˏᵎ.CLS170;
import c.ˏᵎ.CLS176;
import c.ˏᵎ.CLS179;
import c.ˏᵎ.CLS180;
import c.ˏᵎ.CLS184;
import c.ˏᵎ.CLS185;
import c.ˏᵎ.CLS186;
import c.ˏᵎ.CLS191;
import c.ˏᵎ.CLS194;
import c.ˏᵎ.CLS197;
import c.ˏᵎ.CLS205;
import c.ˏᵎ.CLS209;
import c.ˏᵎ.CLS226;
import c.יⁱ.CLS257;
import c.ᴵˉ.CLS283;
import c.ᴵˉ.CLS284;
import c.ᴵˉ.CLS594.CLS282;
import c.ᴵˉ.CLS594;
import c.ᴵˉ.CLS600;
import c.ᴵˉ.CLS601;
import c.ﹶˆ.CLS341;
import c.ﹶˆ.CLS343;
import c.ﹶˆ.CLS345;
import c.ﹶˆ.CLS346;
import c.ﾞʿ.CLS367;
import java.io.File;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashSet;

public class CLS119 {
    public final CLS191 FLD476;
    public CLS137 FLD477;
    public WeakReference FLD478;
    public final ArrayList FLD479;
    public WeakReference FLD480;
    public final CLS59 FLD481;
    public WeakReference FLD482;
    public final ArrayList FLD483;
    public int FLD484;
    public boolean FLD485;
    public boolean FLD486;
    public CLS51 FLD487;
    public final CLS170 FLD488;
    public static final CLS119 FLD489;
    public boolean FLD490;
    public final CLS139 FLD491;

    static {
        CLS119.FLD489 = new CLS119();
    }

    public CLS119() {
        this.FLD484 = 0;
        this.FLD485 = false;
        this.FLD488 = CLS170.MTH2460();
        this.FLD491 = (CLS139)CLS70.MTH1131().MTH1147(CLS139.class);
        this.FLD476 = CLS191.MTH2830();
        this.FLD481 = CLS98.MTH1297();
        this.FLD479 = new ArrayList();
        this.FLD483 = new ArrayList();
    }

    // 此方法包含解密的字符串
    public final String MTH1767() {
        if(!CLS184.MTH2693()) {
            long v = System.currentTimeMillis();
            if(this.FLD476.MTH2833(0)) {
                long v1 = this.FLD476.MTH2846(0);
                if(v1 > 0L && v1 >= v && v1 - v <= 86400000L) {
                    return String.format("", CLS205.MTH2972(v1));
                }
            }
            if(this.FLD476.MTH2833(4)) {
                long v2 = this.FLD476.MTH2846(4);
                if(v2 > 0L && v2 >= v && v2 - v <= 86400000L) {
                    return String.format("", CLS205.MTH2972(v2));
                }
            }
            if(this.FLD476.MTH2833(2)) {
                long v3 = this.FLD476.MTH2846(2);
                if(v3 > 0L && v3 >= v && v3 - v <= 86400000L) {
                    return String.format("", CLS205.MTH2972(v3));
                }
            }
            if(this.FLD476.MTH2833(101)) {
                long v4 = this.FLD476.MTH2846(101);
                if(v4 > 0L && v4 >= v && v4 - v <= 86400000L) {
                    return String.format("", CLS205.MTH2972(v4));
                }
            }
            if(this.FLD476.MTH2833(104)) {
                long v5 = this.FLD476.MTH2846(104);
                return v5 <= 0L || v5 < v || v5 - v > 86400000L ? "" : String.format("", CLS205.MTH2972(v5));
            }
        }
        return "";
    }

    public void MTH1768() {
        this.MTH1777();
        this.MTH1812();
    }

    // 此方法包含解密的字符串
    public final void MTH1769(Activity activity0) {
        public class CLS441 implements CLS343 {
            public final CLS119 FLD470;

            @Override  // c.ﹶˆ.CLS343
            public void MTH4826() {
            }

            // 此方法包含解密的字符串
            @Override  // c.ﹶˆ.CLS343
            public void MTH4827() {
                try {
                    CLS98.MTH1276();
                    CLS119.this.FLD481.MTH986("safe_mode");
                    CLS119.this.FLD481.MTH986("safe_mode_cnt");
                    CLS180.MTH2650();
                }
                catch(Throwable throwable0) {
                    CLS185.MTH2708(throwable0);
                }
            }
        }


        public class CLS443 implements CLS343 {
            public final CLS119 FLD473;

            @Override  // c.ﹶˆ.CLS343
            public void MTH4826() {
            }

            @Override  // c.ﹶˆ.CLS343
            public void MTH4827() {
                CLS119.this.FLD481.MTH992();
                CLS176.MTH2578(CLS186.MTH2742());
            }
        }


        public class CLS444 implements CLS343 {
            public final Activity FLD474;
            public final CLS119 FLD475;

            public CLS444(Activity activity0) {
                this.FLD474 = activity0;
                super();
            }

            @Override  // c.ﹶˆ.CLS343
            public void MTH4826() {
            }

            // 去混淆评级： 低(30)
            // 此方法包含解密的字符串
            @Override  // c.ﹶˆ.CLS343
            public void MTH4827() {
                CLS209.MTH2984(this.FLD474, "");
            }
        }

        try {
            this.FLD488.MTH2457();
            try {
                CLS137 ʼﾞ0 = this.FLD477;
                if(ʼﾞ0 != null) {
                    if(ʼﾞ0.isShowing()) {
                        this.FLD477.dismiss();
                    }
                    this.FLD477 = null;
                    this.FLD485 = false;
                }
            }
            catch(Throwable throwable1) {
                this.MTH1839(throwable1);
            }
            if(activity0 != null && !activity0.isFinishing()) {
                if(TextUtils.isEmpty(CLS98.MTH1305()) || "+NO_ID+".equals(CLS98.MTH1305())) {
                    this.MTH1779("account name not available");
                }
                this.FLD490 = true;
                String s = CLS179.MTH2611();
                this.FLD484 = 0;
                CLS137 ʼﾞ1 = new CLS137(activity0, s);
                this.FLD477 = ʼﾞ1;
                ʼﾞ1.MTH2050(((CLS135)new CLS445(this, activity0)));
                this.FLD477.MTH2034(((CLS136)new CLS480(this, activity0)));
                this.FLD477.show();
                this.FLD477.setOnCancelListener((DialogInterface dialogInterface0) -> // 此方法包含解密的字符串
                if(this.FLD490) {
                    try {
                        this.FLD490 = false;
                        CLS194.MTH2881().MTH2869("onsettingschange", new Object[0]);
                    }
                    catch(Throwable throwable0) {
                        CLS185.MTH2708(throwable0);
                    }
                });
                this.FLD477.setOnDismissListener((DialogInterface dialogInterface0) -> // 此方法包含解密的字符串
                if(this.FLD490) {
                    try {
                        this.FLD490 = false;
                        CLS194.MTH2881().MTH2869("onsettingschange", new Object[0]);
                    }
                    catch(Throwable throwable0) {
                        CLS185.MTH2708(throwable0);
                    }
                });
                return;
            }
            this.MTH1779("build settings activity error");
        }
        catch(Throwable throwable0) {
            this.MTH1839(throwable0);
            this.MTH1797(activity0);
        }
    }

    // 去混淆评级： 高(250)
    // 此方法包含解密的字符串
    // 检测为 Lambda 实现
    private void MTH1771(CLS594 ʾᐧ0, Activity activity0, AdapterView adapterView0, View view0, int v, long v1) [...]

    // 此方法包含解密的字符串
    // 检测为 Lambda 实现
    private void MTH1772(Activity activity0, View view0) [...]

    // 去混淆评级： 低(20)
    // 此方法包含解密的字符串
    public static void MTH1774(Activity activity0) {
        CLS194.MTH2881().MTH2902("donation", "showManageLicensesDialog", new Object[]{activity0});
    }

    // 去混淆评级： 低(25)
    // 此方法包含解密的字符串
    public void MTH1777() {
        StringBuilder stringBuilder4;
        StringBuilder stringBuilder2;
        String s5;
        long v;
        StringBuilder stringBuilder0;
        if(!this.FLD490) {
            return;
        }
        this.FLD486 = false;
        String s = this.FLD491.MTH2107();
        String s1 = CLS179.MTH2612();
        if(!CLS184.MTH2693()) {
            if(CLS191.MTH2830().MTH2828("tag_vip")) {
                s1 = s1 + "";
            }
            if(CLS191.MTH2830().MTH2828("tag_pro")) {
                s1 = s1 + "";
            }
        }
        boolean z = this.FLD481.MTH994("donate_priority_warning", false);
        String s2 = CLS98.MTH1297().MTH1015("web_notice", "");
        if(TextUtils.isEmpty(s2)) {
            s2 = CLS179.MTH2617();
        }
        if(!TextUtils.isEmpty(s2)) {
            if(CLS111.MTH1565()) {
                s1 = s1 + " <br>" + s2;
            }
            if(!z) {
                s1 = s1 + " <br>" + s2;
            }
        }
        if(this.FLD481.MTH994("autoupdate_enable", false)) {
            ContentValues contentValues0 = this.FLD488.MTH2447();
            if(contentValues0 != null) {
                String s3 = contentValues0.containsKey("versionName") ? contentValues0.getAsString("versionName") : "0.0";
                if(this.MTH1817()) {
                    if(s3.equals(s) || !TextUtils.isEmpty(CLS161.MTH2281()) && !this.FLD491.MTH2107().equals(CLS161.MTH2281())) {
                        s5 = "<b><font color=\'#30DAEB\'></font></b><br>";
                    }
                    else {
                        String s4 = "<b><font color=\'#30DAEB\'>" + String.format("", s3) + "</font></b><br>";
                        if(this.FLD488.MTH2395()) {
                            stringBuilder0 = new StringBuilder();
                            stringBuilder0.append(s4);
                            stringBuilder0.append("");
                            v = 0xFFFF34B629CA8378L;
                        }
                        else {
                            stringBuilder0 = new StringBuilder();
                            stringBuilder0.append(s4);
                            stringBuilder0.append("<b><font color=\'#FA58F4\'>");
                            stringBuilder0.append("");
                            v = 0xFFFF348529CA8378L;
                        }
                        stringBuilder0.append(CLS41.MTH858(v));
                        s5 = stringBuilder0.toString();
                    }
                    s1 = s5 + s1;
                }
            }
        }
        String s6 = this.FLD488.MTH2449();
        try {
            if(this.FLD488.MTH2506()) {
                s1 = "<b><font color=\'green\'></font></b><br>" + s1;
            }
            else if(!CLS184.MTH2683()) {
                CLS184.MTH2677();
                s1 = s1 + "<br><b><font color=\'#b636ed\'>" + String.format("", this.FLD491.MTH2122());
                if(this.FLD491.MTH2106()) {
                    s1 = s1 + " (play) ";
                }
                if(z) {
                    s1 = s1 + "";
                }
                s1 = s1 + "</font></b><br>";
            }
            else {
                if(this.FLD488.MTH2527() && !this.FLD488.MTH2485() && this.FLD488.MTH2541()) {
                    s1 = "<b><font color=\'red\'>" + "" + "</font></b><br>" + s1;
                }
                else if(this.FLD488.MTH2519()) {
                    s1 = "<b><font color=\'#FACC2E\'>" + "" + "</font></b><br>" + s1;
                }
                String s7 = "";
                int v1 = CLS112.MTH1614();
                if(!this.FLD488.MTH2527() && v1 > 2) {
                    if(CLS176.MTH2570(this.FLD488.MTH2503())) {
                        s7 = "<br>";
                    }
                    String s8 = s7 + this.FLD491.MTH2122() + "_" + this.FLD491.MTH2120() + " (" + CLS184.MTH2665() + ")[" + this.FLD491.MTH2116() + "]";
                    if(this.FLD491.MTH2106()) {
                        s8 = s8 + "{PLAY}";
                    }
                    s1 = "<b><font color=\'#30DAEB\'>" + s8 + "</font></b><br>" + s1;
                }
            }
            if(this.FLD488.MTH2543() && !this.FLD488.MTH2359()) {
                s1 = "<b><font color=\'green\'>" + CLS98.MTH1302((this.FLD488.MTH2417() ? "modules_reloaded" : "updated")) + "</font></b><br>" + s1;
            }
            if(this.FLD488.MTH2485()) {
                s1 = "<b><font color=\'green\'></font></b><br>" + s1;
            }
            if(this.FLD488.MTH2413()) {
                s1 = "<b><font color=\'red\'></font></b><br>" + s1;
            }
            if(this.FLD488.MTH2522()) {
                s1 = "<b><font color=\'#f9ce57\'></font></b><br>" + s1;
            }
            if(this.FLD488.MTH2400()) {
                s1 = "<b><font color=\'green\'></font></b><br>" + s1;
            }
            if(this.FLD488.MTH2403()) {
                s1 = "<b><font color=\'red\'></font></b><br>" + s1;
            }
            String s9 = "";
            if(this.FLD488.MTH2438() != 0) {
                if(this.FLD488.MTH2428()) {
                    stringBuilder2 = new StringBuilder();
                    stringBuilder2.append("");
                    stringBuilder2.append(" ");
                    stringBuilder2.append(CLS98.MTH1305());
                    goto label_109;
                }
                else if(this.FLD488.MTH2438() == 811) {
                    stringBuilder2 = new StringBuilder();
                    stringBuilder2.append("");
                    stringBuilder2.append(" ");
                    stringBuilder2.append("");
                    goto label_109;
                }
                else if(this.FLD488.MTH2438() != 501) {
                    stringBuilder2 = new StringBuilder();
                    stringBuilder2.append("");
                    stringBuilder2.append(" ");
                    stringBuilder2.append("");
                label_109:
                    s9 = stringBuilder2.toString();
                }
                s1 = "<b><font color=\'red\'>" + String.format("Disabled error code: %05X", ((int)(0xFFFFF & this.FLD488.MTH2438()))) + s9 + "</font></b><br>" + s1;
                int v2 = this.FLD488.MTH2438();
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
                        if(!this.FLD476.MTH2828("emulator_allowed")) {
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
                if(!CLS184.MTH2693() && this.FLD488.MTH2438() == 501 && this.FLD488.MTH2368() && !this.FLD488.MTH2374()) {
                    this.FLD488.MTH2375(false);
                }
            }
            else if(this.FLD488.MTH2397() != 0) {
                s1 = "<b><font color=\'red\'>" + String.format("Conflict error code: %05X", ((int)(0xFFFFF & this.FLD488.MTH2397()))) + "</font></b><br>" + s1;
            }
            if(this.FLD488.MTH2526()) {
                HashSet hashSet0 = new HashSet();
                for(Object object0: this.FLD488.MTH2446()) {
                    hashSet0.add(CLS180.MTH2639(((String)object0)) + "(" + ((String)object0) + ")");
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
            if(this.FLD488.MTH2372() && this.FLD488.MTH2438() == 807 && this.FLD476.MTH2828("emulator_allowed")) {
                s1 = "<b><font color=\'green\'></font></b><br>" + s1;
            }
            if(!TextUtils.isEmpty(s6)) {
                s6 = CLS197.MTH2932(s6);
            }
            if(this.FLD488.MTH2534()) {
                s1 = "<b><font color=\'red\'></font></b><br>" + s1;
            }
            if(this.FLD488.MTH2492()) {
                s1 = "<b><font color=\'red\'></font></b><br>" + s1;
            }
            String s10 = this.MTH1767();
            if(!TextUtils.isEmpty(s10)) {
                s1 = "<b><font color=\'#30DAEB\'>" + s10 + "</font></b><br>" + s1;
            }
            CLS184.MTH2693();
            if(this.FLD488.MTH2532()) {
                s1 = "<b><font color=\'green\'></font></b><br>" + s1;
            }
            if(!CLS184.MTH2693() && CLS170.MTH2460().MTH2368() && (!this.FLD476.MTH2828("max_df") && this.FLD488.MTH2374()) && !this.FLD476.MTH2828("grouplic_unlocked")) {
                s1 = "<b><font color=\'red\'></font></b><br>" + s1;
            }
        }
        catch(Throwable throwable0) {
            CLS185.MTH2708(throwable0);
        }
        ProgressBar progressBar0 = (ProgressBar)this.FLD482.get();
        if(progressBar0 != null) {
            if(this.FLD491.MTH2117("showUpdateProgress") || z || !this.FLD488.MTH2467() || this.FLD488.MTH2469() == 0 || this.FLD488.MTH2469() == this.FLD488.MTH2433()) {
                progressBar0.setVisibility(8);
            }
            else {
                int v3 = Math.round(((float)this.FLD488.MTH2433()) / ((float)this.FLD488.MTH2469()) * 100.0f);
                if(Build.VERSION.SDK_INT >= 24) {
                    progressBar0.setProgress(v3, true);
                }
                else {
                    progressBar0.setProgress(v3);
                }
                progressBar0.setVisibility(0);
            }
        }
        TextView textView0 = (TextView)this.FLD478.get();
        if(textView0 != null) {
            if(TextUtils.isEmpty(s1)) {
                textView0.setVisibility(8);
            }
            else {
                textView0.setVisibility(0);
                textView0.setText(Html.fromHtml(s1));
            }
        }
        TextView textView1 = (TextView)this.FLD480.get();
        if(textView1 != null) {
            if(!TextUtils.isEmpty(s6)) {
                textView1.setVisibility(0);
                textView1.setText(Html.fromHtml(CLS197.MTH2932(s6)));
                return;
            }
            textView1.setVisibility(8);
        }
    }

    public static CLS119 MTH1778() {
        return CLS119.FLD489;
    }

    public final void MTH1779(String s) {
        CLS185.MTH2711(s);
        this.FLD483.add(s);
    }

    // 去混淆评级： 低(40)
    // 此方法包含解密的字符串
    public static void MTH1781(Activity activity0) {
        CLS194.MTH2881().MTH2908("donation", "settings.config", new Object[]{"configure_about_settings", CLS98.MTH1305(), activity0, Boolean.FALSE, Boolean.FALSE, ""});
    }

    // 去混淆评级： 低(20)
    // 此方法包含解密的字符串
    public static void MTH1782(Activity activity0) {
        CLS194.MTH2881().MTH2902("donation", "showUpdateDialog", new Object[]{activity0, CLS98.MTH1316(), Boolean.FALSE});
    }

    // 去混淆评级： 低(35)
    // 此方法包含解密的字符串
    public static void MTH1784(Activity activity0) {
        if(CLS170.MTH2460().MTH2372()) {
            return;
        }
        File file0 = new File(CLS186.MTH2752(), "_" + CLS98.MTH1305() + "_settings.json");
        if(!CLS176.MTH2570(file0)) {
            file0 = new File(activity0.getCacheDir(), "_" + CLS98.MTH1305() + "_settings.json");
        }
        File file1 = new File(CLS186.MTH2752(), "_" + CLS98.MTH1305() + "_update_settings.json");
        if(!CLS176.MTH2570(file0) && !CLS176.MTH2570(file1)) {
            CLS194.MTH2881().MTH2891("importSettings", new Object[0]);
            return;
        }
        CLS257 ﾞⁱ0 = new CLS257(activity0, "");
        if(CLS176.MTH2570(file0)) {
            ﾞⁱ0.MTH3377(String.format("", CLS205.MTH2977(file0.lastModified())), "importSettings_auto", ((CLS345)new CLS460()));
        }
        if(CLS176.MTH2570(file1)) {
            ﾞⁱ0.MTH3377(String.format("", CLS205.MTH2977(file1.lastModified())), "importSettings_auto2", ((CLS345)new CLS461()));
        }
        ﾞⁱ0.MTH3382("importSettings_select", ((CLS345)new CLS458())).MTH3380();
    }

    // 去混淆评级： 中等(60)
    // 此方法包含解密的字符串
    private void MTH1786(Activity activity0) {
        CLS144.MTH2184(activity0, "", "", "", ((CLS343)new CLS441(this)));
    }

    // 此方法包含解密的字符串
    private void MTH1789(Activity activity0, LinearLayout linearLayout0) {
        TextView textView2;
        TextView textView1;
        ProgressBar progressBar0;
        TextView textView0 = null;
        try {
            progressBar0 = null;
            progressBar0 = new ProgressBar(activity0, null, 0x1010078);
            progressBar0.setIndeterminate(false);
            progressBar0.setPadding(CLS144.MTH2175(5), CLS144.MTH2175(3), CLS144.MTH2175(5), CLS144.MTH2175(10));
            progressBar0.setMax(100);
            this.FLD482 = new WeakReference(progressBar0);
            goto label_10;
        }
        catch(Throwable throwable0) {
            try {
                this.MTH1839(throwable0);
                try {
                label_10:
                    textView1 = null;
                    textView1 = new TextView(activity0);
                    textView1.setFocusable(true);
                    textView1.setFocusableInTouchMode(true);
                    textView1.setTextColor(CLS226.MTH3099());
                    textView1.setPadding(0, 0, 0, CLS144.MTH2175(10));
                    textView1.setOnClickListener((View view0) -> // 此方法包含解密的字符串
                    try {
                        if(this.FLD488.MTH2543() && !this.FLD488.MTH2359() || this.FLD488.MTH2400() || this.FLD488.MTH2532()) {
                            this.FLD481.MTH986("safe_mode");
                            this.FLD481.MTH986("safe_mode_cnt");
                            CLS180.MTH2650();
                            return;
                        }
                        if(this.MTH1817()) {
                            if(this.FLD488.MTH2395()) {
                                CLS180.MTH2619(activity0, new File(activity0.getCacheDir(), "WeXposed.apk"));
                                return;
                            }
                            this.FLD488.MTH2351();
                            return;
                        }
                        if(this.FLD486) {
                            CLS194.MTH2881().MTH2902("donation", "wx_donate", new Object[]{CLS98.MTH1305(), activity0});
                            return;
                        }
                        if(this.FLD488.MTH2413()) {
                            if(!this.FLD488.MTH2517(300000L)) {
                                return;
                            }
                            this.FLD488.MTH2375(true);
                            return;
                        }
                        int v = this.FLD484 + 1;
                        this.FLD484 = v;
                        if(v >= 4) {
                            view0.setVisibility(8);
                        }
                    }
                    catch(Throwable throwable0) {
                        CLS185.MTH2708(throwable0);
                    });
                    this.FLD478 = new WeakReference(textView1);
                }
                catch(Throwable throwable2) {
                    this.MTH1839(throwable2);
                }
                try {
                    textView2 = new TextView(activity0);
                }
                catch(Throwable throwable3) {
                    goto label_31;
                }
                try {
                    textView2.setTextColor(CLS226.MTH3099());
                    textView2.setPadding(0, 0, 0, CLS144.MTH2175(10));
                    this.FLD480 = new WeakReference(textView2);
                    goto label_33;
                }
                catch(Throwable throwable3) {
                    textView0 = textView2;
                }
            label_31:
                this.MTH1839(throwable3);
                textView2 = textView0;
                try {
                label_33:
                    this.MTH1777();
                }
                catch(Throwable throwable4) {
                    this.MTH1839(throwable4);
                }
                CLS600 ᴵˉ0 = new CLS600(activity0);
                ᴵˉ0.MTH3694(new View[]{progressBar0, textView1, textView2});
                CLS594 ʾᐧ0 = new CLS594(activity0);
                this.FLD487 = new CLS51(activity0);
                ʾᐧ0.MTH3615(CLS144.MTH2175(1));
                ʾᐧ0.MTH3608(((CLS282)(String s) -> this.FLD487.getFilter().filter(s)));
                if(!this.FLD481.MTH994("disable_settings_search", false)) {
                    ʾᐧ0.MTH3612();
                }
                try {
                    this.MTH1812();
                }
                catch(Throwable throwable5) {
                    this.MTH1839(throwable5);
                }
                ʾᐧ0.MTH3610((AdapterView adapterView0, View view0, int v, long v1) -> // 去混淆评级： 高(250)
                // 此方法包含解密的字符串
                new CLS284(((String)ʾᐧ0.MTH3605().getItemAtPosition(v))));
                ʾᐧ0.MTH3613(this.FLD487);
                CLS601 ᵔʼ0 = new CLS601(activity0);
                ᵔʼ0.MTH3703(new Object[]{ᴵˉ0, ʾᐧ0});
                CLS144.MTH2179(linearLayout0, ((CLS341)ᵔʼ0));
                this.FLD485 = true;
                return;
            }
            catch(Throwable throwable1) {
            }
        }
        this.MTH1839(throwable1);
    }

    // 此方法包含解密的字符串
    public void MTH1792(Activity activity0, Intent intent0) {
        Uri uri0 = intent0.getData();
        if(uri0 == null) {
            return;
        }
        if(Build.VERSION.SDK_INT >= 19) {
            try {
                activity0.getContentResolver().takePersistableUriPermission(uri0, 3);
                String s = CLS98.MTH1297().MTH1015("module_dir_uri", "");
                if(!TextUtils.isEmpty(s) && !s.equals(uri0.toString())) {
                    CLS70.MTH1131().MTH1139(((CLS69)() -> // 此方法包含解密的字符串
                    {
                        CLS367 ʾʻ0 = CLS186.MTH2747(activity0, 1);
                        CLS98.MTH1297().MTH984("module_dir_uri", uri0.toString());
                        CLS186.MTH2728(ʾʻ0, CLS186.MTH2747(activity0, 1));
                    }));
                    return;
                }
                CLS98.MTH1297().MTH984("module_dir_uri", uri0.toString());
                this.MTH1812();
                HashSet hashSet0 = new HashSet();
                hashSet0.add("BACKUP");
                hashSet0.add("Assets");
                CLS70.MTH1131().MTH1139(((CLS69)() -> {
                    CLS367 ʾʻ0 = CLS186.MTH2747(activity0, 1);
                    CLS186.MTH2755(CLS186.MTH2762(activity0, 1), ʾʻ0, hashSet0, false);
                    CLS186.MTH2755(CLS186.MTH2743(activity0, 1), ʾʻ0, hashSet0, false);
                    CLS186.MTH2755(CLS186.MTH2732(activity0, 1), ʾʻ0, hashSet0, false);
                    CLS186.MTH2755(CLS186.MTH2715(activity0, 1), ʾʻ0, hashSet0, false);
                }));
            }
            catch(Throwable throwable0) {
                CLS185.MTH2708(throwable0);
            }
        }
    }

    // 去混淆评级： 低(40)
    // 此方法包含解密的字符串
    public static void MTH1794(Activity activity0) {
        CLS194.MTH2881().MTH2902("donation", "settings.config", new Object[]{"config_toolbar_settings", CLS98.MTH1305(), activity0, Boolean.FALSE, Boolean.FALSE, ""});
    }

    // 此方法包含解密的字符串
    public final void MTH1797(Activity activity0) {
        if(this.FLD485) {
            return;
        }
        this.MTH1779("build settings dialog error");
        CLS138.MTH2086(activity0, TextUtils.join("\r", this.FLD483));
    }

    public static void MTH1799(CLS119 ʻᵔ0, Activity activity0) {
        ʻᵔ0.MTH1802(activity0);
    }

    // 检测为 Lambda 实现
    public static void MTH1800(Activity activity0, HashSet hashSet0) [...]

    // 去混淆评级： 低(40)
    // 此方法包含解密的字符串
    public static void MTH1801(Activity activity0) {
        CLS144.MTH2172(activity0, "", "", "", 1, ((CLS346)new CLS468()));
    }

    // 去混淆评级： 低(38)
    // 此方法包含解密的字符串
    private void MTH1802(Activity activity0) {
        if(CLS111.MTH1565() && false) {
            CLS144.MTH2184(activity0, "", "", null, ((CLS343)new CLS444(this, activity0)));
            return;
        }
        CLS209.MTH2984(activity0, "");
    }

    // 此方法包含解密的字符串
    private void MTH1803(Activity activity0) {
        CLS184.MTH2702(activity0, "");
        this.FLD488.MTH2406();
    }

    // 此方法包含解密的字符串
    public void MTH1804(Activity activity0) {
        public class CLS442 implements CLS343 {
            public final Activity FLD471;
            public final CLS119 FLD472;

            public CLS442(Activity activity0) {
                this.FLD471 = activity0;
                super();
            }

            @Override  // c.ﹶˆ.CLS343
            public void MTH4826() {
            }

            @Override  // c.ﹶˆ.CLS343
            public void MTH4827() {
                CLS119.this.MTH1769(this.FLD471);
            }
        }

        if(!CLS170.MTH2460().MTH2490() && CLS170.MTH2460().MTH2512()) {
            this.FLD483.clear();
            if(!CLS98.MTH1297().MTH994("disclaimer_disable", false)) {
                CLS138.MTH2088(activity0, ((CLS343)new CLS442(this, activity0)));
                return;
            }
            this.MTH1769(activity0);
        }
    }

    // 此方法包含解密的字符串
    public static void MTH1806() {
        CLS194.MTH2881().MTH2891("importSettings", new Object[0]);
    }

    // 此方法包含解密的字符串
    public static void MTH1807() {
        CLS194.MTH2881().MTH2891("importSettingsAutoBackup", new Object[0]);
    }

    public void MTH1809() {
        CLS137 ʼﾞ0 = this.FLD477;
        if(ʼﾞ0 == null) {
            return;
        }
        ʼﾞ0.MTH2044();
    }

    // 去混淆评级： 低(20)
    // 此方法包含解密的字符串
    public final void MTH1812() {
        String s1;
        if(!this.FLD490) {
            return;
        }
        ArrayList arrayList0 = new ArrayList();
        if(!CLS184.MTH2693() && (!this.FLD491.MTH2121("registration") && !CLS144.MTH2183())) {
            arrayList0.add(this.MTH1814("", "wechat_xposed"));
        }
        String s = "";
        if(!CLS184.MTH2693() && (CLS179.MTH2614() || this.FLD488.MTH2354())) {
            s = CLS98.MTH1302(CLS41.MTH858(-220013293567112L));
        }
        else if(CLS191.MTH2830().MTH2841() && CLS111.MTH1580()) {
            s = CLS98.MTH1302(CLS41.MTH858(-220082013043848L));
        }
        if(!this.FLD488.MTH2372() || this.FLD488.MTH2438() != 807 || (this.FLD476.MTH2828("emulator_allowed") || !CLS107.MTH1479().MTH1457("donation"))) {
            SparseArray sparseArray0 = new SparseArray();
            int v = 0;
            for(Object object0: CLS194.MTH2881().MTH2882("settings.options", new Object[0])) {
                Pair pair0 = (Pair)object0;
                if(((String)pair0.second).contains("#")) {
                    sparseArray0.put(Integer.parseInt(((String)pair0.second).substring(((String)pair0.second).lastIndexOf("#") + 1)), pair0);
                }
                else {
                    ++v;
                    sparseArray0.put(v, pair0);
                }
            }
            if(!CLS184.MTH2693() && (!this.FLD491.MTH2117("donate") && CLS107.MTH1479().MTH1457("donation"))) {
                if(CLS180.MTH2640() && this.FLD476.MTH2828("emulator_allowed")) {
                    arrayList0.add(this.MTH1816("", s, CLS41.MTH858(-221722690550920L)));
                }
                else if(!this.FLD488.MTH2372()) {
                    if(CLS111.MTH1586()) {
                        s1 = this.MTH1814("", CLS41.MTH858(0xFFFF362F29CA8378L));
                    }
                    else if(!this.FLD476.MTH2842() && !this.FLD476.MTH2828("remove_notice")) {
                        if(CLS111.MTH1565()) {
                            s = "";
                        }
                        s1 = this.MTH1816("", s, CLS41.MTH858(0xFFFF36BA29CA8378L));
                    }
                    else if(CLS184.MTH2679(0, 5) == 0) {
                        if(CLS111.MTH1565()) {
                            s = "";
                        }
                        s1 = this.MTH1816("", s, CLS41.MTH858(-221099920293000L));
                    }
                    else {
                        s1 = this.MTH1814("", CLS41.MTH858(-221160049835144L));
                    }
                    arrayList0.add(s1);
                }
            }
            if(Build.VERSION.SDK_INT >= 19 && !CLS180.MTH2643(this.MTH1838(), CLS98.MTH1297().MTH1015("module_dir_uri", ""))) {
                arrayList0.add(this.MTH1814("", "req_moduledir_permission"));
            }
            if(this.FLD488.MTH2454()) {
                arrayList0.add(this.MTH1814("", "check_update"));
            }
            if(!CLS111.MTH1586()) {
                for(int v1 = 0; v1 < sparseArray0.size(); ++v1) {
                    Pair pair1 = (Pair)sparseArray0.valueAt(v1);
                    String s2 = (String)pair1.second;
                    if(s2.contains("#")) {
                        s2 = ((String)pair1.second).substring(0, ((String)pair1.second).lastIndexOf("#"));
                    }
                    arrayList0.add(this.MTH1814(((String)pair1.first), s2));
                }
            }
            if(!CLS184.MTH2693() && (!this.FLD491.MTH2117("about") && CLS107.MTH1479().MTH1457("donation"))) {
                arrayList0.add(this.MTH1814("", "configure_about_settings"));
            }
        }
        else {
            arrayList0.add(this.MTH1816("", s, "config_donate_key_emulator"));
        }
        if(!this.FLD481.MTH994("disable_settings_search", false)) {
            CLS70.MTH1131().MTH1139(((CLS69)() -> // 此方法包含解密的字符串
            try {
                ArrayList arrayList0 = CLS194.MTH2881().MTH2882("settings.keywords", new Object[]{CLS98.MTH1305(), this.MTH1838()});
                ArrayList arrayList1 = new ArrayList();
                for(Object object0: arrayList0) {
                    arrayList1.addAll(((ArrayList)object0));
                }
                this.FLD479.clear();
                for(Object object1: arrayList1) {
                    String s = ((ContentValues)object1).getAsString("title");
                    String s1 = ((ContentValues)object1).getAsString("keywords");
                    String s2 = ((ContentValues)object1).getAsString("tag");
                    if(!TextUtils.isEmpty(s1)) {
                        new CLS284(s1);
                        String s3 = this.MTH1814(s + "[[" + "" + "]]", s2 + "@");
                        this.FLD479.add(s3);
                    }
                }
            }
            catch(Throwable throwable0) {
                CLS185.MTH2708(throwable0);
            }));
        }
        CLS51 ˋʼ0 = this.FLD487;
        if(ˋʼ0 != null) {
            ˋʼ0.MTH933(arrayList0);
            this.FLD487.MTH931(this.FLD479);
        }
    }

    // 此方法包含解密的字符串
    public static void MTH1813(String s) {
        ArrayList arrayList0 = new ArrayList();
        arrayList0.add(s);
        CLS194.MTH2881().MTH2902("donation", "activateKey", new Object[]{arrayList0, "a"});
    }

    public final String MTH1814(String s, String s1) {
        return this.MTH1816(s, null, s1);
    }

    // 此方法包含解密的字符串
    public final String MTH1816(String s, String s1, String s2) {
        CLS284 ˊﹶ0 = new CLS284();
        ˊﹶ0.MTH3661(s);
        ˊﹶ0.MTH3664(s2);
        ˊﹶ0.MTH3662(s1);
        return "";
    }

    // 此方法包含解密的字符串
    public final boolean MTH1817() {
        if(!this.FLD481.MTH994("autoupdate_enable", false)) {
            return false;
        }
        int v = this.FLD491.MTH2129();
        ContentValues contentValues0 = this.FLD488.MTH2447();
        if(contentValues0 != null) {
            return v == -1 ? CLS184.MTH2696(this.FLD491.MTH2107(), contentValues0.getAsString("versionName")) == 1 : (contentValues0.containsKey("versionCode") ? ((int)contentValues0.getAsInteger("versionCode")) : 0) > v;
        }
        return false;
    }

    private void MTH1820(Activity activity0) {
        CLS144.MTH2167(activity0, ((CLS343)new CLS443(this)));
    }

    // 去混淆评级： 低(20)
    // 此方法包含解密的字符串
    private void MTH1822() {
        this.FLD481.MTH986("safe_mode");
        this.FLD481.MTH986("safe_mode_cnt");
        CLS180.MTH2650();
    }

    public void MTH1823() {
        CLS137 ʼﾞ0 = this.FLD477;
        if(ʼﾞ0 == null) {
            return;
        }
        ʼﾞ0.MTH2053();
    }

    // 此方法包含解密的字符串
    // 检测为 Lambda 实现
    private void MTH1824(DialogInterface dialogInterface0) [...]

    // 此方法包含解密的字符串
    // 检测为 Lambda 实现
    private void MTH1826() [...]

    // 此方法包含解密的字符串
    public static void MTH1827() {
        if(CLS170.MTH2460().MTH2372()) {
            return;
        }
        CLS194.MTH2881().MTH2891("exportSettings", new Object[0]);
    }

    // 此方法包含解密的字符串
    public static void MTH1828() {
        CLS194.MTH2881().MTH2891("importSettingsUpdateBackup", new Object[0]);
    }

    // 此方法包含解密的字符串
    // 检测为 Lambda 实现
    private void MTH1830(DialogInterface dialogInterface0) [...]

    // 此方法包含解密的字符串
    private void MTH1831(Activity activity0) {
        try {
            Intent intent0 = new Intent();
            intent0.setFlags(0x10000000);
            intent0.setClassName(this.FLD491.MTH2128(), "com.android.x.MainActivity");
            activity0.startActivity(intent0);
        }
        catch(Throwable throwable0) {
            CLS185.MTH2708(throwable0);
        }
    }

    // 去混淆评级： 低(30)
    // 此方法包含解密的字符串
    private void MTH1832(Activity activity0, CLS283 ˉˎ0) {
        CLS481 ﾞʿ0;
        String s;
        if(!CLS184.MTH2693() && !this.FLD491.MTH2121("registration")) {
            ˉˎ0.MTH3648("module_settings", ((CLS345)new CLS446(this, activity0)));
        }
        ˉˎ0.MTH3648("import_settings", ((CLS345)new CLS476(activity0))).MTH3648("export_settings", ((CLS345)new CLS455())).MTH3648("clear_settings", ((CLS345)new CLS450(this, activity0)));
        if(CLS107.MTH1479().MTH1457("donation") || CLS184.MTH2693() && CLS107.MTH1479().MTH1457("xv")) {
            ˉˎ0.MTH3648("toolbar_settings", ((CLS345)new CLS452(activity0)));
        }
        ˉˎ0.MTH3648("check_update", ((CLS345)new CLS457(this)));
        if(!CLS184.MTH2693()) {
            ˉˎ0.MTH3648("show_update_log", ((CLS345)new CLS472(activity0))).MTH3648("download_latest_apk", ((CLS345)new CLS478(this, activity0)));
            if(this.FLD488.MTH2368()) {
                if(this.FLD476.MTH2828("grouplic_unlocked")) {
                    ˉˎ0.MTH3648("manage_group_licenses", ((CLS345)new CLS470(activity0)));
                }
                ˉˎ0.MTH3648("keycard", ((CLS345)new CLS453(activity0)));
            }
        }
        ˉˎ0.MTH3648("restart_wechat", ((CLS345)new CLS451(this))).MTH3648("reset_module", ((CLS345)new CLS456(this, activity0)));
        if(!CLS184.MTH2693() && CLS107.MTH1479().MTH1457("donation") && !this.FLD488.MTH2429()) {
            if(CLS111.MTH1586()) {
                s = "donate_sub_integrated";
                ﾞʿ0 = new CLS481(activity0);
                ˉˎ0.MTH3648(s, ((CLS345)ﾞʿ0));
                return;
            }
            if(!this.FLD491.MTH2117("donate")) {
                ˉˎ0.MTH3648("donate", ((CLS345)new CLS475(activity0)));
            }
            if(!this.FLD491.MTH2117("about")) {
                s = "configure_about_settings";
                ﾞʿ0 = new CLS448(activity0);
                ˉˎ0.MTH3648(s, ((CLS345)ﾞʿ0));
            }
        }
    }

    // 此方法包含解密的字符串
    // 检测为 Lambda 实现
    public static void MTH1833(Activity activity0, Uri uri0) [...]

    // 检测为 Lambda 实现
    private void MTH1834(String s) [...]

    // 此方法包含解密的字符串
    public final void MTH1836() {
        String s = this.FLD481.MTH1015("last_update_check", "");
        if(!TextUtils.isEmpty(s)) {
            long v = System.currentTimeMillis() - Long.parseLong(s, 16);
            if(v < 300000L) {
                int v1 = ((int)(300000L - v)) / 1000;
                CLS184.MTH2702(this.MTH1838(), String.format("", ((int)(v1 / 60)), ((int)(v1 % 60))));
                return;
            }
        }
        CLS184.MTH2702(this.MTH1838(), "");
        this.FLD488.MTH2375(true);
    }

    // 去混淆评级： 低(20)
    // 此方法包含解密的字符串
    public final Activity MTH1838() {
        return (Activity)CLS194.MTH2881().MTH2878("getCurrentActivity", new Object[0]);
    }

    public final void MTH1839(Throwable throwable0) {
        CLS185.MTH2708(throwable0);
        String s = Log.getStackTraceString(throwable0);
        this.FLD483.add(s);
    }

    // 去混淆评级： 低(20)
    // 此方法包含解密的字符串
    public static void MTH1842(Activity activity0) {
        CLS194.MTH2881().MTH2902("donation", "showDonationDialog", new Object[]{activity0});
    }

    // 去混淆评级： 低(20)
    // 此方法包含解密的字符串
    public static void MTH1843(Activity activity0) {
        CLS194.MTH2881().MTH2902("donation", "showSubscribeIntegratedModeDialog", new Object[]{activity0});
    }
}

