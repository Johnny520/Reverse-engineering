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
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collections;
import java.util.Date;
import java.util.Locale;
import p000.C1037Y5;

/* JADX INFO: renamed from: io.sentry.android.core.M */
/* JADX INFO: loaded from: classes.dex */
public final class C1670M {

    /* JADX INFO: renamed from: i */
    public static volatile C1670M f5980i;

    /* JADX INFO: renamed from: j */
    public static final C2029a f5981j = new C2029a();

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

    /* JADX WARN: Code restructure failed: missing block: B:38:0x00c1, code lost:
    
        r6 = "su";
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00c9, code lost:
    
        r6 = r9.f6244f.exec(new java.lang.String[]{"/system/xbin/which", "su"});
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00cf, code lost:
    
        r10 = new java.io.BufferedReader(new java.io.InputStreamReader(r6.getInputStream(), io.sentry.android.core.internal.util.C1721i.f6238g));
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00e3, code lost:
    
        if (r10.readLine() == null) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00e5, code lost:
    
        r0 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00e7, code lost:
    
        r0 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00e8, code lost:
    
        r10.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00eb, code lost:
    
        r6.destroy();
        r6 = r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00ef, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x00f1, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x00fc, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x00fd, code lost:
    
        r6 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x00ff, code lost:
    
        r6 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x0101, code lost:
    
        r13.mo3683r(io.sentry.EnumC1657a2.DEBUG, "Error when trying to check if SU exists.", r0);
        r6 = r6;
        r6 = r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x010e, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0110, code lost:
    
        r13.mo3680e(io.sentry.EnumC1657a2.DEBUG, "SU isn't found on this Device.", new java.lang.Object[0]);
        r6 = r6;
        r6 = r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x0119, code lost:
    
        if (r6 != null) goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x011c, code lost:
    
        r0 = false;
        r6 = r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x011d, code lost:
    
        if (r0 != false) goto L84;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x011f, code lost:
    
        io.sentry.config.AbstractC1856a.m4048D("The ILogger object is required.", r13);
        r0 = r9.f6239a.getPackageManager();
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x012a, code lost:
    
        if (r0 != null) goto L71;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x012c, code lost:
    
        r6 = r9.f6243e;
        r9 = r6.length;
        r10 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x0132, code lost:
    
        r11 = r6[r10];
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x0136, code lost:
    
        if (android.os.Build.VERSION.SDK_INT >= 33) goto L76;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x0138, code lost:
    
        r0.getPackageInfo(r11, android.content.pm.PackageManager.PackageInfoFlags.of(0));
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x0140, code lost:
    
        r0.getPackageInfo(r11, 0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x0143, code lost:
    
        r0 = true;
        r6 = r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x0145, code lost:
    
        r10 = r10 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x0148, code lost:
    
        r0 = false;
        r6 = r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x0149, code lost:
    
        if (r0 != false) goto L84;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x014c, code lost:
    
        r0 = false;
        r6 = r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x0156, code lost:
    
        if (r6 != 0) goto L87;
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x0158, code lost:
    
        r6.destroy();
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x015b, code lost:
    
        throw r0;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:102:0x0195  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x01a1  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x01aa  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x01b8  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x01cc  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x01d9  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x01e2  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x010a A[DONT_GENERATE, PHI: r6
  0x010a: PHI (r6v11 java.lang.Process) = (r6v38 java.lang.Process), (r6v39 java.lang.Process) binds: [B:60:0x0108, B:65:0x0119] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:69:0x011f  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x014c  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x014e A[EDGE_INSN: B:144:0x014e->B:84:0x014e BREAK  A[LOOP:0: B:29:0x009f->B:37:0x00be], PHI: r6
  0x014e: PHI (r6v24 ??) = (r6v14 ??), (r6v16 ??), (r6v6 java.lang.String), (r6v2 java.lang.String) binds: [B:68:0x011d, B:81:0x0149, B:144:0x014e, B:26:0x0097] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0176 A[ADDED_TO_REGION] */
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
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public C1670M(Context context, SentryAndroidOptions sentryAndroidOptions) {
        String str;
        C1037Y5 c1037y5;
        C1037Y5 c1037y52;
        Bundle bundle;
        PackageInfo packageInfoM3825c;
        PackageManager packageManager;
        this.f5982a = context;
        this.f5983b = sentryAndroidOptions;
        this.f5984c = new C1666I(sentryAndroidOptions.getLogger());
        C1717e.f6225c.m3903a();
        C1963m c1963m = new C1963m();
        c1963m.f6969a = "Android";
        c1963m.f6970b = Build.VERSION.RELEASE;
        c1963m.f6972d = Build.DISPLAY;
        ILogger logger = sentryAndroidOptions.getLogger();
        String property = System.getProperty("os.version");
        File file = new File("/proc/version");
        String str2 = property;
        if (file.canRead()) {
            try {
                BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
                try {
                    String line = bufferedReader.readLine();
                    bufferedReader.close();
                    str2 = line;
                } finally {
                }
            } catch (IOException e) {
                logger.mo3683r(EnumC1657a2.ERROR, "Exception while attempting to read kernel information", e);
                str2 = property;
            }
        }
        if (str2 != 0) {
            c1963m.f6973e = str2;
        }
        boolean z = false;
        if (sentryAndroidOptions.isEnableRootCheck()) {
            C1721i c1721i = new C1721i(this.f5982a, this.f5984c, sentryAndroidOptions.getLogger());
            c1721i.f6240b.getClass();
            String str3 = Build.TAGS;
            if (str3 == null || !str3.contains("test-keys")) {
                String[] strArr = c1721i.f6242d;
                int length = strArr.length;
                int i = 0;
                str2 = str2;
                while (true) {
                    ILogger iLogger = c1721i.f6241c;
                    if (i >= length) {
                        break;
                    }
                    String str4 = strArr[i];
                    try {
                    } catch (RuntimeException e2) {
                        str2 = "Error when trying to check if root file %s exists.";
                        iLogger.mo3682n(EnumC1657a2.ERROR, e2, "Error when trying to check if root file %s exists.", str4);
                    }
                    if (new File(str4).exists()) {
                        break;
                    }
                    i++;
                    str2 = str2;
                }
            } else {
                boolean z2 = true;
                Process process = str2;
                c1963m.f6974f = Boolean.valueOf(z2);
            }
        }
        this.f5988g = c1963m;
        this.f5985d = this.f5984c.m3834b();
        ILogger logger2 = sentryAndroidOptions.getLogger();
        try {
            packageInfoM3825c = AbstractC1665H.m3825c(context, this.f5984c);
            packageManager = context.getPackageManager();
        } catch (IllegalArgumentException unused) {
            str = null;
        }
        if (packageInfoM3825c == null || packageManager == null) {
            c1037y5 = null;
        } else {
            str = packageInfoM3825c.packageName;
            try {
                String installerPackageName = packageManager.getInstallerPackageName(str);
                c1037y5 = new C1037Y5(installerPackageName == null, installerPackageName);
            } catch (IllegalArgumentException unused2) {
                logger2.mo3680e(EnumC1657a2.DEBUG, "%s package isn't installed.", str);
                c1037y5 = null;
            }
        }
        this.f5986e = c1037y5;
        C1666I c1666i = this.f5984c;
        c1666i.getClass();
        ApplicationInfo applicationInfo = Build.VERSION.SDK_INT >= 33 ? (ApplicationInfo) AbstractC1665H.f5971d.m97b(context) : (ApplicationInfo) AbstractC1665H.f5972e.m97b(context);
        PackageInfo packageInfoM3825c2 = AbstractC1665H.m3825c(context, c1666i);
        if (packageInfoM3825c2 != null) {
            ?? r0 = packageInfoM3825c2.splitNames;
            if (applicationInfo != null && (bundle = applicationInfo.metaData) != null) {
                z = bundle.getBoolean("com.android.vending.splits.required");
            }
            c1037y52 = new C1037Y5(z, (Serializable) r0);
        } else {
            c1037y52 = null;
        }
        this.f5987f = c1037y52;
        ActivityManager.MemoryInfo memoryInfoM3824b = AbstractC1665H.m3824b(context, sentryAndroidOptions.getLogger());
        if (memoryInfoM3824b != null) {
            this.f5989h = Long.valueOf(memoryInfoM3824b.totalMem);
        } else {
            this.f5989h = null;
        }
    }

    /* JADX INFO: renamed from: b */
    public static Float m3841b(Intent intent, C2046v2 c2046v2) {
        try {
            int intExtra = intent.getIntExtra("level", -1);
            int intExtra2 = intent.getIntExtra("scale", -1);
            if (intExtra != -1 && intExtra2 != -1) {
                return Float.valueOf((intExtra / intExtra2) * 100.0f);
            }
            return null;
        } catch (Throwable th) {
            c2046v2.getLogger().mo3683r(EnumC1657a2.ERROR, "Error getting device battery level.", th);
            return null;
        }
    }

    /* JADX INFO: renamed from: c */
    public static C1670M m3842c(Context context, SentryAndroidOptions sentryAndroidOptions) {
        if (f5980i == null) {
            C1981r c1981rM4173a = f5981j.m4173a();
            try {
                if (f5980i == null) {
                    Context applicationContext = context.getApplicationContext();
                    if (applicationContext != null) {
                        context = applicationContext;
                    }
                    f5980i = new C1670M(context, sentryAndroidOptions);
                }
                c1981rM4173a.close();
            } catch (Throwable th) {
                try {
                    c1981rM4173a.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }
        return f5980i;
    }

    /* JADX INFO: renamed from: d */
    public static Boolean m3843d(Intent intent, C2046v2 c2046v2) {
        try {
            int intExtra = intent.getIntExtra("plugged", -1);
            boolean z = true;
            if (intExtra != 1 && intExtra != 2) {
                z = false;
            }
            return Boolean.valueOf(z);
        } catch (Throwable th) {
            c2046v2.getLogger().mo3683r(EnumC1657a2.ERROR, "Error getting device charging state.", th);
            return null;
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(28:0|2|(1:4)|5|136|6|(1:(21:9|(3:147|15|16)|23|(1:25)|26|137|27|(1:32)|141|33|37|(1:39)(1:40)|41|(3:153|43|47)|48|(1:50)|51|(1:53)|54|(17:58|(1:60)(1:61)|(5:63|139|64|(1:66)(1:70)|71)|72|(1:(1:75)(1:76))(1:77)|78|(1:81)|82|(7:84|149|85|89|143|90|94)|134|95|(4:(1:98)(1:99)|100|(3:102|(1:(1:160)(2:156|158))(2:104|159)|111)|155)(1:112)|113|(1:115)(1:118)|(6:151|120|124|145|125|129)|130|(1:132))|133)(1:10))(1:12)|11|(0)|23|(0)|26|137|27|(0)|141|33|37|(0)(0)|41|(0)|48|(0)|51|(0)|54|(18:56|58|(0)(0)|(0)|72|(0)(0)|78|(1:81)|82|(0)|134|95|(0)(0)|113|(0)(0)|(0)|130|(0))|133) */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00a3, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00a4, code lost:
    
        r4.mo3683r(io.sentry.EnumC1657a2.ERROR, "Error getting DisplayMetrics.", r0);
        r0 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00dc, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00dd, code lost:
    
        r8.getLogger().mo3682n(io.sentry.EnumC1657a2.ERROR, r0, "Error getting the device's boot time.", new java.lang.Object[0]);
        r0 = null;
     */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0267 A[Catch: all -> 0x0281, TryCatch #0 {all -> 0x0281, blocks: (B:95:0x023a, B:98:0x0242, B:100:0x0248, B:102:0x024c, B:111:0x0264, B:106:0x0253, B:109:0x025a, B:115:0x0277, B:112:0x0267), top: B:134:0x023a }] */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0277 A[Catch: all -> 0x0281, TRY_LEAVE, TryCatch #0 {all -> 0x0281, blocks: (B:95:0x023a, B:98:0x0242, B:100:0x0248, B:102:0x024c, B:111:0x0264, B:106:0x0253, B:109:0x025a, B:115:0x0277, B:112:0x0267), top: B:134:0x023a }] */
    /* JADX WARN: Removed duplicated region for block: B:118:0x028e  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x02cf  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x006e A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:151:0x0291 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:153:0x011a A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x010c  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0136  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0148  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x017c  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0184  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x018a  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x01ca  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x01d1  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x01f7  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0240  */
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final C1956f m3844a(boolean z, boolean z2) {
        EnumC1955e enumC1955e;
        Boolean bool;
        DisplayMetrics displayMetrics;
        String strM3851a;
        ArrayList arrayListM3903a;
        Intent intentRegisterReceiver;
        ActivityManager.MemoryInfo memoryInfoM3824b;
        File externalFilesDir;
        StatFs statFs;
        Long lValueOf;
        File[] externalFilesDirs;
        File file;
        Long lValueOf2;
        Long lValueOf3;
        int intExtra;
        int i;
        EnumC1955e enumC1955e2;
        Context context = this.f5982a;
        C1956f c1956f = new C1956f();
        c1956f.f6904b = Build.MANUFACTURER;
        c1956f.f6905c = Build.BRAND;
        SentryAndroidOptions sentryAndroidOptions = this.f5983b;
        c1956f.f6906d = AbstractC1665H.m3823a(sentryAndroidOptions.getLogger());
        c1956f.f6907e = Build.MODEL;
        c1956f.f6908f = Build.ID;
        c1956f.f6909g = Build.SUPPORTED_ABIS;
        this.f5984c.getClass();
        if (Build.VERSION.SDK_INT >= 31) {
            c1956f.f6901H = Build.SOC_MANUFACTURER + " " + Build.SOC_MODEL;
        }
        Long lValueOf4 = null;
        try {
            i = context.getResources().getConfiguration().orientation;
        } catch (Throwable th) {
            th = th;
            enumC1955e = null;
        }
        if (i == 1) {
            enumC1955e2 = EnumC1955e.PORTRAIT;
        } else {
            if (i != 2) {
                enumC1955e = null;
                if (enumC1955e == null) {
                    try {
                        sentryAndroidOptions.getLogger().mo3680e(EnumC1657a2.INFO, "No device orientation available (ORIENTATION_SQUARE|ORIENTATION_UNDEFINED)", new Object[0]);
                        enumC1955e = null;
                    } catch (Throwable th2) {
                        th = th2;
                        sentryAndroidOptions.getLogger().mo3683r(EnumC1657a2.ERROR, "Error getting device orientation.", th);
                    }
                }
                c1956f.f6913k = enumC1955e;
                bool = this.f5985d;
                if (bool != null) {
                    c1956f.f6914l = bool;
                }
                ILogger logger = sentryAndroidOptions.getLogger();
                displayMetrics = context.getResources().getDisplayMetrics();
                if (displayMetrics != null) {
                    c1956f.f6923u = Integer.valueOf(displayMetrics.widthPixels);
                    c1956f.f6924v = Integer.valueOf(displayMetrics.heightPixels);
                    c1956f.f6925w = Float.valueOf(displayMetrics.density);
                    c1956f.f6926x = Integer.valueOf(displayMetrics.densityDpi);
                }
                Date dateM4068n = AbstractC1856a.m4068n(System.currentTimeMillis() - SystemClock.elapsedRealtime());
                c1956f.f6927y = dateM4068n;
                LocaleList locales = context.getResources().getConfiguration().getLocales();
                c1956f.f6928z = locales.isEmpty() ? Calendar.getInstance(locales.get(0)).getTimeZone() : Calendar.getInstance().getTimeZone();
                if (c1956f.f6894A == null) {
                    try {
                        strM3851a = AbstractC1675S.m3851a(context);
                    } catch (Throwable th3) {
                        sentryAndroidOptions.getLogger().mo3683r(EnumC1657a2.ERROR, "Error getting installationId.", th3);
                        strM3851a = null;
                    }
                    c1956f.f6894A = strM3851a;
                }
                Locale locale = Locale.getDefault();
                if (c1956f.f6895B == null) {
                    c1956f.f6895B = locale.toString();
                }
                arrayListM3903a = C1717e.f6225c.m3903a();
                if (!arrayListM3903a.isEmpty()) {
                    c1956f.f6899F = Double.valueOf(((Integer) Collections.max(arrayListM3903a)).doubleValue());
                    c1956f.f6898E = Integer.valueOf(arrayListM3903a.size());
                }
                c1956f.f6915m = this.f5989h;
                if (z && sentryAndroidOptions.isCollectAdditionalContext()) {
                    IntentFilter intentFilter = new IntentFilter("android.intent.action.BATTERY_CHANGED");
                    intentRegisterReceiver = Build.VERSION.SDK_INT < 33 ? context.registerReceiver(null, intentFilter, null, null, 4) : context.registerReceiver(null, intentFilter, null, null);
                    if (intentRegisterReceiver != null) {
                        c1956f.f6910h = m3841b(intentRegisterReceiver, sentryAndroidOptions);
                        c1956f.f6911i = m3843d(intentRegisterReceiver, sentryAndroidOptions);
                        try {
                            intExtra = intentRegisterReceiver.getIntExtra("temperature", -1);
                        } catch (Throwable th4) {
                            sentryAndroidOptions.getLogger().mo3683r(EnumC1657a2.ERROR, "Error getting battery temperature.", th4);
                        }
                        Float fValueOf = intExtra != -1 ? Float.valueOf(intExtra / 10.0f) : null;
                        c1956f.f6897D = fValueOf;
                    }
                    int i2 = AbstractC1669L.f5979a[sentryAndroidOptions.getConnectionStatusProvider().mo3684g().ordinal()];
                    c1956f.f6912j = i2 == 1 ? i2 != 2 ? null : Boolean.TRUE : Boolean.FALSE;
                    memoryInfoM3824b = AbstractC1665H.m3824b(context, sentryAndroidOptions.getLogger());
                    if (memoryInfoM3824b != null && z2) {
                        c1956f.f6916n = Long.valueOf(memoryInfoM3824b.availMem);
                        c1956f.f6918p = Boolean.valueOf(memoryInfoM3824b.lowMemory);
                    }
                    externalFilesDir = context.getExternalFilesDir(null);
                    if (externalFilesDir != null) {
                        StatFs statFs2 = new StatFs(externalFilesDir.getPath());
                        try {
                            lValueOf2 = Long.valueOf(statFs2.getBlockCountLong() * statFs2.getBlockSizeLong());
                        } catch (Throwable th5) {
                            sentryAndroidOptions.getLogger().mo3683r(EnumC1657a2.ERROR, "Error getting total internal storage amount.", th5);
                            lValueOf2 = null;
                        }
                        c1956f.f6919q = lValueOf2;
                        try {
                            lValueOf3 = Long.valueOf(statFs2.getAvailableBlocksLong() * statFs2.getBlockSizeLong());
                        } catch (Throwable th6) {
                            sentryAndroidOptions.getLogger().mo3683r(EnumC1657a2.ERROR, "Error getting unused internal storage amount.", th6);
                            lValueOf3 = null;
                        }
                        c1956f.f6920r = lValueOf3;
                    }
                    try {
                        externalFilesDirs = context.getExternalFilesDirs(null);
                        if (externalFilesDirs == null) {
                            String absolutePath = externalFilesDir != null ? externalFilesDir.getAbsolutePath() : null;
                            int length = externalFilesDirs.length;
                            for (int i3 = 0; i3 < length; i3++) {
                                file = externalFilesDirs[i3];
                                if (file != null) {
                                    if (absolutePath == null || absolutePath.isEmpty() || !file.getAbsolutePath().contains(absolutePath)) {
                                        break;
                                    }
                                }
                            }
                        } else {
                            sentryAndroidOptions.getLogger().mo3680e(EnumC1657a2.INFO, "Not possible to read getExternalFilesDirs", new Object[0]);
                        }
                        file = null;
                    } catch (Throwable unused) {
                        sentryAndroidOptions.getLogger().mo3680e(EnumC1657a2.INFO, "Not possible to read external files directory", new Object[0]);
                    }
                    statFs = file == null ? new StatFs(file.getPath()) : null;
                    if (statFs != null) {
                        try {
                            lValueOf = Long.valueOf(statFs.getBlockCountLong() * statFs.getBlockSizeLong());
                        } catch (Throwable th7) {
                            sentryAndroidOptions.getLogger().mo3683r(EnumC1657a2.ERROR, "Error getting total external storage amount.", th7);
                            lValueOf = null;
                        }
                        c1956f.f6921s = lValueOf;
                        try {
                            lValueOf4 = Long.valueOf(statFs.getAvailableBlocksLong() * statFs.getBlockSizeLong());
                        } catch (Throwable th8) {
                            sentryAndroidOptions.getLogger().mo3683r(EnumC1657a2.ERROR, "Error getting unused external storage amount.", th8);
                        }
                        c1956f.f6922t = lValueOf4;
                    }
                    if (c1956f.f6896C == null) {
                        c1956f.f6896C = sentryAndroidOptions.getConnectionStatusProvider().mo3686k();
                    }
                }
                return c1956f;
            }
            enumC1955e2 = EnumC1955e.LANDSCAPE;
        }
        enumC1955e = enumC1955e2;
        if (enumC1955e == null) {
        }
        c1956f.f6913k = enumC1955e;
        bool = this.f5985d;
        if (bool != null) {
        }
        ILogger logger2 = sentryAndroidOptions.getLogger();
        displayMetrics = context.getResources().getDisplayMetrics();
        if (displayMetrics != null) {
        }
        Date dateM4068n2 = AbstractC1856a.m4068n(System.currentTimeMillis() - SystemClock.elapsedRealtime());
        c1956f.f6927y = dateM4068n2;
        LocaleList locales2 = context.getResources().getConfiguration().getLocales();
        c1956f.f6928z = locales2.isEmpty() ? Calendar.getInstance(locales2.get(0)).getTimeZone() : Calendar.getInstance().getTimeZone();
        if (c1956f.f6894A == null) {
        }
        Locale locale2 = Locale.getDefault();
        if (c1956f.f6895B == null) {
        }
        arrayListM3903a = C1717e.f6225c.m3903a();
        if (!arrayListM3903a.isEmpty()) {
        }
        c1956f.f6915m = this.f5989h;
        if (z) {
            IntentFilter intentFilter2 = new IntentFilter("android.intent.action.BATTERY_CHANGED");
            if (Build.VERSION.SDK_INT < 33) {
            }
            if (intentRegisterReceiver != null) {
            }
            int i22 = AbstractC1669L.f5979a[sentryAndroidOptions.getConnectionStatusProvider().mo3684g().ordinal()];
            c1956f.f6912j = i22 == 1 ? i22 != 2 ? null : Boolean.TRUE : Boolean.FALSE;
            memoryInfoM3824b = AbstractC1665H.m3824b(context, sentryAndroidOptions.getLogger());
            if (memoryInfoM3824b != null) {
                c1956f.f6916n = Long.valueOf(memoryInfoM3824b.availMem);
                c1956f.f6918p = Boolean.valueOf(memoryInfoM3824b.lowMemory);
            }
            externalFilesDir = context.getExternalFilesDir(null);
            if (externalFilesDir != null) {
            }
            externalFilesDirs = context.getExternalFilesDirs(null);
            if (externalFilesDirs == null) {
            }
            file = null;
            if (file == null) {
            }
            if (statFs != null) {
            }
            if (c1956f.f6896C == null) {
            }
        }
        return c1956f;
    }
}
