package io.sentry.android.core;

import android.app.ActivityManager;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Bundle;
import android.os.LocaleList;
import android.os.StatFs;
import android.os.SystemClock;
import android.util.DisplayMetrics;
import io.sentry.C1981r;
import io.sentry.C2046v2;
import io.sentry.EnumC1657a2;
import io.sentry.ILogger;
import io.sentry.android.core.internal.util.C1717e;
import io.sentry.android.core.internal.util.C1721i;
import io.sentry.config.AbstractC1856a;
import io.sentry.protocol.C1956f;
import io.sentry.protocol.C1963m;
import io.sentry.protocol.EnumC1955e;
import io.sentry.util.C2029a;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collections;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;
import p000.C1037Y5;

/* JADX INFO: renamed from: io.sentry.android.core.M */
/* JADX INFO: loaded from: classes.dex */
public final class C1670M {

    /* JADX INFO: renamed from: i */
    public static volatile C1670M f5980i;

    /* JADX INFO: renamed from: j */
    public static final C2029a f5981j = null;

    /* JADX INFO: renamed from: a */
    public final Context f5982a;

    /* JADX INFO: renamed from: b */
    public final SentryAndroidOptions f5983b;

    /* JADX INFO: renamed from: c */
    public final C1666I f5984c;

    /* JADX INFO: renamed from: d */
    public final Boolean f5985d;

    /* JADX INFO: renamed from: e */
    public final C1037Y5 f5986e;

    /* JADX INFO: renamed from: f */
    public final C1037Y5 f5987f;

    /* JADX INFO: renamed from: g */
    public final C1963m f5988g;

    /* JADX INFO: renamed from: h */
    public final Long f5989h;

    static {
        f5981j = new C2029a();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v20, types: [java.io.Serializable, java.lang.String[]] */
    /* JADX WARN: Type inference failed for: r6v14 */
    /* JADX WARN: Type inference failed for: r6v15 */
    /* JADX WARN: Type inference failed for: r6v16 */
    /* JADX WARN: Type inference failed for: r6v17, types: [java.lang.String[]] */
    /* JADX WARN: Type inference failed for: r6v21 */
    /* JADX WARN: Type inference failed for: r6v23 */
    /* JADX WARN: Type inference failed for: r6v24 */
    /* JADX WARN: Type inference failed for: r6v27 */
    /* JADX WARN: Type inference failed for: r6v28 */
    /* JADX WARN: Type inference failed for: r6v31 */
    /* JADX WARN: Type inference failed for: r6v32 */
    /* JADX WARN: Type inference failed for: r6v33 */
    /* JADX WARN: Type inference failed for: r6v34 */
    /* JADX WARN: Type inference failed for: r6v7, types: [java.lang.String] */
    public C1670M(Context r17, SentryAndroidOptions r18) {
        this.f5982a = r17;
        this.f5983b = r18;
        this.f5984c = new C1666I(r18.getLogger());
        C1717e.f6225c.m3903a();
        C1963m r4 = new C1963m();
        r4.f6969a = "Android";
        r4.f6970b = Build.VERSION.RELEASE;
        r4.f6972d = Build.DISPLAY;
        ILogger r5 = r18.getLogger();
        String r6 = System.getProperty("os.version");
        File r0 = new File("/proc/version");
        String r62 = r6;
        if (r0.canRead() == true) goto L123;
    L19:
        if (r62 == 0) goto L21;
        r4.f6973e = r62;
    L21:
        boolean r7 = false;
        if (r18.isEnableRootCheck() == false) goto L89;
        C1721i r9 = new C1721i(this.f5982a, this.f5984c, r18.getLogger());
        r9.f6240b.getClass();
        String r02 = Build.TAGS;
        if (r02 != null) goto L26;
    L28:
        String[] r10 = r9.f6242d;
        int r11 = r10.length;
        int r12 = 0;
        r62 = r62;
    L29:
        ILogger r13 = r9.f6241c;
        if (r12 >= r11) goto L38;
        String r14 = r10[r12];
        if (new File(r14).exists() == false) goto L37;
    L84:
        boolean r03 = true;
        Process r63 = r62;
    L85:
        r4.f6974f = Boolean.valueOf(r03);
    L62:
        th = move-exception;
        if (r63 == 0) goto L88;
        r63.destroy();
    L88:
        throw th;
    L37:
        r12 = r12 + 1;
        r62 = r62;
    L35:
        e = move-exception;
        r62 = "Error when trying to check if root file %s exists.";
        r13.mo3682n(EnumC1657a2.ERROR, e, "Error when trying to check if root file %s exists.", new Object[]{r14});
        goto L37
    L38:
        r63 = "su";
        Process r64 = r9.f6244f.exec(new String[]{"/system/xbin/which", "su"});     // Catch: Throwable -> L56 IOException -> L58
        BufferedReader r102 = new BufferedReader(new InputStreamReader(r64.getInputStream(), C1721i.f6238g));     // Catch: Throwable -> L47 IOException -> L121
        if (r102.readLine() == null) goto L44;
        boolean r04 = true;
    L45:
        r102.close();     // Catch: Throwable -> L47 IOException -> L121
        r64.destroy();
        r62 = r64;
    L68:
        if (r04 == true) goto L84;
        AbstractC1856a.m4048D("The ILogger object is required.", r13);
        PackageManager r05 = r9.f6239a.getPackageManager();
        if (r05 == null) goto L80;
        r62 = r9.f6243e;
        int r92 = r62.length;
        int r103 = 0;
    L72:
        if (r103 >= r92) goto L80;
        String r112 = r62[r103];
    L79:
        r103 = r103 + 1;
        goto L72
    L75:
        if (Build.VERSION.SDK_INT < 33) goto L77;
        AbstractC1664G.m3822f(r05, r112, AbstractC1664G.m3820d());     // Catch: PackageManager.NameNotFoundException -> L79
    L78:
        boolean r06 = true;
        r62 = r62;
    L81:
        if (r06 == true) goto L84;
        r03 = false;
        r63 = r62;
        goto L85
    L77:
        r05.getPackageInfo(r112, 0);     // Catch: PackageManager.NameNotFoundException -> L79
    L80:
        r06 = false;
        r62 = r62;
        goto L81
    L44:
        r04 = false;
    L49:
        th = move-exception;
        r102.close();     // Catch: Throwable -> L53
        throw th;     // Catch: Throwable -> L47 IOException -> L121
    L53:
        th = move-exception;
        th.addSuppressed(th);     // Catch: Throwable -> L47 IOException -> L121
        throw th;     // Catch: Throwable -> L47 IOException -> L121
    L47:
        th = th;
    L59:
        r13.mo3683r(EnumC1657a2.DEBUG, "Error when trying to check if SU exists.", th);     // Catch: Throwable -> L62
        Process r65 = r64;
        Process r66 = r64;
        if (r64 == null) goto L67;
    L61:
        r66.destroy();
        r65 = r66;
    L67:
        r04 = false;
        r62 = r65;
    L64:
        r13.mo3680e(EnumC1657a2.DEBUG, "SU isn't found on this Device.", new Object[0]);     // Catch: Throwable -> L62
        r65 = r64;
        r66 = r64;
        if (r64 == null) goto L67;
    L58:
        r64 = null;
    L56:
        th = th;
        r64 = null;
        goto L59
    L26:
        if (r02.contains("test-keys") == false) goto L28;
    L89:
        this.f5988g = r4;
        this.f5985d = this.f5984c.m3834b();
        ILogger r07 = r18.getLogger();
        PackageInfo r42 = AbstractC1665H.m3825c(r17, this.f5984c);     // Catch: IllegalArgumentException -> L100
        PackageManager r67 = r17.getPackageManager();     // Catch: IllegalArgumentException -> L100
        if (r42 == null) goto L102;
        if (r67 == null) goto L102;
        String r43 = r42.packageName;     // Catch: IllegalArgumentException -> L100
        String r68 = r67.getInstallerPackageName(r43);     // Catch: IllegalArgumentException -> L122
        if (r68 != null) goto L97;
        boolean r104 = true;
    L98:
        C1037Y5 r93 = new C1037Y5(r104, r68);     // Catch: IllegalArgumentException -> L122
    L103:
        this.f5986e = r93;
        C1666I r08 = this.f5984c;
        r08.getClass();
        if (Build.VERSION.SDK_INT < 33) goto L106;
        ApplicationInfo r44 = (ApplicationInfo) AbstractC1665H.f5971d.m97b(r17);
    L107:
        PackageInfo r09 = AbstractC1665H.m3825c(r17, r08);
        if (r09 == null) goto L115;
        ?? r010 = r09.splitNames;
        if (r44 == null) goto L114;
        Bundle r45 = r44.metaData;
        if (r45 == null) goto L114;
        r7 = r45.getBoolean("com.android.vending.splits.required");
    L114:
        C1037Y5 r46 = new C1037Y5(r7, r010);
    L116:
        this.f5987f = r46;
        ActivityManager.MemoryInfo r011 = AbstractC1665H.m3824b(r17, r18.getLogger());
        if (r011 == null) goto L119;
        this.f5989h = Long.valueOf(r011.totalMem);
        return;
    L119:
        this.f5989h = null;
        return;
    L115:
        r46 = null;
        goto L116
    L106:
        r44 = (ApplicationInfo) AbstractC1665H.f5972e.m97b(r17);
        goto L107
    L97:
        r104 = false;
    L101:
        r07.mo3680e(EnumC1657a2.DEBUG, "%s package isn't installed.", new Object[]{r43});
    L102:
        r93 = null;
    L100:
        r43 = null;
        goto L101
    L123:
        BufferedReader r72 = new BufferedReader(new FileReader(r0));     // Catch: IOException -> L9
        String r012 = r72.readLine();     // Catch: Throwable -> L11
        r72.close();     // Catch: IOException -> L9
        r62 = r012;
        goto L19
    L11:
        th = move-exception;
        r72.close();     // Catch: Throwable -> L15
    L149:
        throw th;     // Catch: IOException -> L9
    L15:
        th = move-exception;
        th.addSuppressed(th);     // Catch: IOException -> L9
        throw th;     // Catch: IOException -> L9
    L9:
        e = move-exception;
        r5.mo3683r(EnumC1657a2.ERROR, "Exception while attempting to read kernel information", e);
        r62 = r6;
        goto L19
    }

    /* JADX INFO: renamed from: b */
    public static Float m3841b(Intent r4, C2046v2 r5) {
        int r1 = r4.getIntExtra("level", -1);     // Catch: Throwable -> L9
        int r42 = r4.getIntExtra("scale", -1);     // Catch: Throwable -> L9
        if (r1 == (-1)) goto L11;
        if (r42 == (-1)) goto L11;
        return Float.valueOf((r1 / r42) * 100.0f);
    L11:
        return null;
    L9:
        th = move-exception;
        r5.getLogger().mo3683r(EnumC1657a2.ERROR, "Error getting device battery level.", th);
        return null;
    }

    /* JADX INFO: renamed from: c */
    public static C1670M m3842c(Context r3, SentryAndroidOptions r4) {
        if (f5980i != null) goto L21;
        C1981r r0 = f5981j.m4173a();
    L12:
        th = move-exception;
        r0.close();     // Catch: Throwable -> L17
    L19:
        throw th;
    L17:
        th = move-exception;
        th.addSuppressed(th);
        goto L19
    L6:
        if (f5980i != null) goto L14;
        Context r2 = r3.getApplicationContext();     // Catch: Throwable -> L12
        if (r2 == null) goto L10;
        r3 = r2;
    L10:
        f5980i = new C1670M(r3, r4);     // Catch: Throwable -> L12
    L14:
        r0.close();
    L21:
        return f5980i;
    }

    /* JADX INFO: renamed from: d */
    public static Boolean m3843d(Intent r2, C2046v2 r3) {
        int r22 = r2.getIntExtra("plugged", -1);     // Catch: Throwable -> L10
        boolean r0 = true;
        if (r22 != 1) goto L5;
    L8:
        return Boolean.valueOf(r0);
    L5:
        if (r22 == 2) goto L8;
        r0 = false;
    L10:
        th = move-exception;
        r3.getLogger().mo3683r(EnumC1657a2.ERROR, "Error getting device charging state.", th);
        return null;
    }

    /* JADX INFO: renamed from: a */
    public final C1956f m3844a(boolean r15, boolean r16) {
        Context r1 = this.f5982a;
        C1956f r7 = new C1956f();
        r7.f6904b = Build.MANUFACTURER;
        r7.f6905c = Build.BRAND;
        SentryAndroidOptions r8 = this.f5983b;
        r7.f6906d = AbstractC1665H.m3823a(r8.getLogger());
        r7.f6907e = Build.MODEL;
        r7.f6908f = Build.ID;
        r7.f6909g = Build.SUPPORTED_ABIS;
        this.f5984c.getClass();
        if (Build.VERSION.SDK_INT < 31) goto L5;
        r7.f6901H = AbstractC1668K.m3839a() + " " + AbstractC1668K.m3840b();
    L5:
        Long r2 = null;
        int r0 = r1.getResources().getConfiguration().orientation;     // Catch: Throwable -> L20
        if (r0 == 1) goto L12;
        if (r0 == 2) goto L10;
        EnumC1955e r4 = null;
    L14:
        if (r4 == null) goto L147;
    L23:
        r7.f6913k = r4;
        Boolean r02 = this.f5985d;
        if (r02 == null) goto L26;
        r7.f6914l = r02;
    L26:
        ILogger r42 = r8.getLogger();
        DisplayMetrics r03 = r1.getResources().getDisplayMetrics();     // Catch: Throwable -> L29
    L31:
        if (r03 == null) goto L141;
        r7.f6923u = Integer.valueOf(r03.widthPixels);
        r7.f6924v = Integer.valueOf(r03.heightPixels);
        r7.f6925w = Float.valueOf(r03.density);
        r7.f6926x = Integer.valueOf(r03.densityDpi);
    L141:
        Date r04 = AbstractC1856a.m4068n(System.currentTimeMillis() - SystemClock.elapsedRealtime());     // Catch: IllegalArgumentException -> L35
    L37:
        r7.f6927y = r04;
        LocaleList r05 = r1.getResources().getConfiguration().getLocales();
        if (r05.isEmpty() == true) goto L40;
        TimeZone r06 = Calendar.getInstance(r05.get(0)).getTimeZone();
    L41:
        r7.f6928z = r06;
        if (r7.f6894A == null) goto L153;
    L48:
        Locale r07 = Locale.getDefault();
        if (r7.f6895B != null) goto L51;
        r7.f6895B = r07.toString();
    L51:
        ArrayList r08 = C1717e.f6225c.m3903a();
        if (r08.isEmpty() == true) goto L54;
        r7.f6899F = Double.valueOf(((Integer) Collections.max(r08)).doubleValue());
        r7.f6898E = Integer.valueOf(r08.size());
    L54:
        r7.f6915m = this.f5989h;
        if (r15 == true) goto L57;
    L133:
        return r7;
    L57:
        if (r8.isCollectAdditionalContext() == false) goto L133;
        IntentFilter r3 = new IntentFilter("android.intent.action.BATTERY_CHANGED");
        if (Build.VERSION.SDK_INT < 33) goto L61;
        Intent r152 = r1.registerReceiver(null, r3, null, null, 4);
    L62:
        if (r152 == null) goto L72;
        r7.f6910h = m3841b(r152, r8);
        r7.f6911i = m3843d(r152, r8);
        int r153 = r152.getIntExtra("temperature", -1);     // Catch: Throwable -> L68
        if (r153 == (-1)) goto L70;
        Float r154 = Float.valueOf(r153 / 10.0f);     // Catch: Throwable -> L68
    L71:
        r7.f6897D = r154;
    L70:
        r154 = null;
    L68:
        th = move-exception;
        r8.getLogger().mo3683r(EnumC1657a2.ERROR, "Error getting battery temperature.", th);
    L72:
        int r155 = AbstractC1669L.f5979a[r8.getConnectionStatusProvider().mo3684g().ordinal()];
        if (r155 == 1) goto L77;
        if (r155 == 2) goto L76;
        Boolean r156 = null;
    L78:
        r7.f6912j = r156;
        ActivityManager.MemoryInfo r157 = AbstractC1665H.m3824b(r1, r8.getLogger());
        if (r157 == null) goto L82;
        if (r16 == false) goto L82;
        r7.f6916n = Long.valueOf(r157.availMem);
        r7.f6918p = Boolean.valueOf(r157.lowMemory);
    L82:
        File r158 = r1.getExternalFilesDir(null);
        if (r158 == null) goto L134;
        StatFs r32 = new StatFs(r158.getPath());
        Long r09 = Long.valueOf(r32.getBlockCountLong() * r32.getBlockSizeLong());     // Catch: Throwable -> L87
    L89:
        r7.f6919q = r09;
        Long r010 = Long.valueOf(r32.getAvailableBlocksLong() * r32.getBlockSizeLong());     // Catch: Throwable -> L92
    L94:
        r7.f6920r = r010;
    L92:
        th = move-exception;
        r8.getLogger().mo3683r(EnumC1657a2.ERROR, "Error getting unused internal storage amount.", th);
        r010 = null;
    L87:
        th = move-exception;
        r8.getLogger().mo3683r(EnumC1657a2.ERROR, "Error getting total internal storage amount.", th);
        r09 = null;
    L134:
        File[] r011 = r1.getExternalFilesDirs(null);     // Catch: Throwable -> L117
        if (r011 == null) goto L112;
        if (r158 == null) goto L99;
        String r159 = r158.getAbsolutePath();     // Catch: Throwable -> L117
    L100:
        int r12 = r011.length;     // Catch: Throwable -> L117
        int r33 = 0;
    L101:
        if (r33 >= r12) goto L113;
        File r43 = r011[r33];     // Catch: Throwable -> L117
        if (r43 == null) goto L111;
        if (r159 == null) goto L114;
        if (r159.isEmpty() == true) goto L114;
        if (r43.getAbsolutePath().contains(r159) == true) goto L111;
    L114:
        if (r43 == null) goto L118;
        StatFs r1510 = new StatFs(r43.getPath());     // Catch: Throwable -> L117
    L119:
        if (r1510 == null) goto L131;
        Long r012 = Long.valueOf(r1510.getBlockCountLong() * r1510.getBlockSizeLong());     // Catch: Throwable -> L122
    L124:
        r7.f6921s = r012;
        r2 = Long.valueOf(r1510.getAvailableBlocksLong() * r1510.getBlockSizeLong());     // Catch: Throwable -> L127
    L129:
        r7.f6922t = r2;
    L127:
        th = move-exception;
        r8.getLogger().mo3683r(EnumC1657a2.ERROR, "Error getting unused external storage amount.", th);
    L122:
        th = move-exception;
        r8.getLogger().mo3683r(EnumC1657a2.ERROR, "Error getting total external storage amount.", th);
        r012 = null;
    L131:
        if (r7.f6896C != null) goto L133;
        r7.f6896C = r8.getConnectionStatusProvider().mo3686k();
    L118:
        r1510 = null;
    L111:
        r33 = r33 + 1;     // Catch: Throwable -> L117
    L113:
        r43 = null;
        goto L114
    L99:
        r159 = null;
        goto L100
    L112:
        r8.getLogger().mo3680e(EnumC1657a2.INFO, "Not possible to read getExternalFilesDirs", new Object[0]);     // Catch: Throwable -> L117
    L117:
        r8.getLogger().mo3680e(EnumC1657a2.INFO, "Not possible to read external files directory", new Object[0]);
        goto L118
    L76:
        r156 = Boolean.TRUE;
        goto L78
    L77:
        r156 = Boolean.FALSE;
        goto L78
    L61:
        r152 = r1.registerReceiver(null, r3, null, null);
        goto L62
    L153:
        String r013 = AbstractC1675S.m3851a(r1);     // Catch: Throwable -> L45
    L47:
        r7.f6894A = r013;
    L45:
        th = move-exception;
        r8.getLogger().mo3683r(EnumC1657a2.ERROR, "Error getting installationId.", th);
        r013 = null;
        goto L47
    L40:
        r06 = Calendar.getInstance().getTimeZone();
    L35:
        e = move-exception;
        r8.getLogger().mo3682n(EnumC1657a2.ERROR, e, "Error getting the device's boot time.", new Object[0]);
        r04 = null;
    L29:
        th = move-exception;
        r42.mo3683r(EnumC1657a2.ERROR, "Error getting DisplayMetrics.", th);
        r03 = null;
        goto L31
    L147:
        r8.getLogger().mo3680e(EnumC1657a2.INFO, "No device orientation available (ORIENTATION_SQUARE|ORIENTATION_UNDEFINED)", new Object[0]);     // Catch: Throwable -> L17
        r4 = null;
    L17:
        th = th;
    L22:
        r8.getLogger().mo3683r(EnumC1657a2.ERROR, "Error getting device orientation.", th);
        goto L23
    L10:
        EnumC1955e r014 = EnumC1955e.LANDSCAPE;     // Catch: Throwable -> L20
    L11:
        r4 = r014;
        goto L14
    L12:
        r014 = EnumC1955e.PORTRAIT;     // Catch: Throwable -> L20
    L20:
        th = th;
        r4 = null;
        goto L22
    }
}
