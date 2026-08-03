package com.tendcloud.tenddata;

import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ServiceInfo;
import android.nfc.NfcAdapter;
import android.nfc.NfcManager;
import android.nfc.cardemulation.CardEmulation;
import android.os.Build;
import android.os.Bundle;
import android.os.Environment;
import android.os.StatFs;
import android.provider.Settings;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileFilter;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.TimeZone;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.json.JSONArray;
import org.json.JSONObject;
import p001.C0167c4;

/* JADX INFO: renamed from: com.tendcloud.tenddata.k */
/* JADX INFO: loaded from: classes.dex */
public class C0118k {

    /* JADX INFO: renamed from: a */
    public static final String f540a = "/sys/devices/system/cpu/cpu0/cpufreq/cpuinfo_max_freq";

    /* JADX INFO: renamed from: b */
    public static final String f541b = "/sys/devices/system/cpu/cpu0/cpufreq/cpuinfo_min_freq";

    /* JADX INFO: renamed from: c */
    public static final String f542c = "/sys/devices/system/cpu/cpu0/cpufreq/scaling_cur_freq";

    /* JADX INFO: renamed from: d */
    private static final int f543d = 3600000;

    /* JADX INFO: renamed from: i */
    private static int[] f548i;

    /* JADX INFO: renamed from: e */
    private static final Pattern f544e = Pattern.compile("([0-9]+)");

    /* JADX INFO: renamed from: f */
    private static final Pattern f545f = Pattern.compile("\\s*([0-9]+)");

    /* JADX INFO: renamed from: g */
    private static List<PackageInfo> f546g = new ArrayList();

    /* JADX INFO: renamed from: h */
    private static boolean f547h = false;

    /* JADX INFO: renamed from: j */
    private static final FileFilter f549j = new FileFilter() { // from class: com.tendcloud.tenddata.k.1
        @Override // java.io.FileFilter
        public boolean accept(File file) {
            if (file != null) {
                try {
                    String name = file.getName();
                    if (name != null && name.startsWith("cpu")) {
                        for (int i = 3; i < name.length(); i++) {
                            if (name.charAt(i) < '0' || name.charAt(i) > '9') {
                                return false;
                            }
                        }
                        return true;
                    }
                } catch (Throwable unused) {
                }
            }
            return false;
        }
    };

    /* JADX INFO: renamed from: k */
    private static BroadcastReceiver f550k = new BroadcastReceiver() { // from class: com.tendcloud.tenddata.k.2
        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
        }
    };

    /* JADX INFO: renamed from: com.tendcloud.tenddata.k$a */
    public static class a {
        public static final int HCE_ENABLED = 3;
        public static final int NFC_ENABLED = 2;
        public static final int NOT_ENALBED = 1;
        public static final int UNKNOWN = 0;
    }

    /* JADX INFO: renamed from: a */
    public static int m585a(String str) {
        BufferedReader bufferedReader;
        FileReader fileReader;
        String line;
        int i = -1;
        if (TextUtils.isEmpty(str)) {
            return -1;
        }
        FileReader fileReader2 = null;
        try {
            fileReader = new FileReader(str);
            try {
                bufferedReader = new BufferedReader(fileReader);
            } catch (Throwable unused) {
                bufferedReader = null;
            }
            try {
                line = bufferedReader.readLine();
            } catch (Throwable unused2) {
                fileReader2 = fileReader;
                if (fileReader2 != null) {
                    try {
                        fileReader2.close();
                    } catch (Throwable unused3) {
                    }
                }
                if (bufferedReader != null) {
                }
                return i;
            }
        } catch (Throwable unused4) {
            bufferedReader = null;
        }
        if (line.length() > 104857600) {
            throw new RuntimeException("Input stream more than 100 MB size limit");
        }
        i = Integer.parseInt(line.trim());
        try {
            fileReader.close();
        } catch (Throwable unused5) {
        }
        try {
            bufferedReader.close();
        } catch (Throwable unused6) {
        }
        return i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public static String m586a() {
        StringBuilder sbM1039 = C0167c4.m1039(C0020ab.f135j);
        sbM1039.append(Build.VERSION.RELEASE);
        return sbM1039.toString();
    }

    /* JADX INFO: renamed from: a */
    private static String m587a(String str, String str2) {
        try {
            Class<?> cls = Class.forName("android.os.SystemProperties");
            String str3 = (String) cls.getDeclaredMethod("get", String.class).invoke(cls, str);
            return TextUtils.isEmpty(str3) ? str2 : str3;
        } catch (Throwable unused) {
            return str2;
        }
    }

    /* JADX INFO: renamed from: a */
    private static List<PackageInfo> m588a(Context context, int i) {
        Process processExec;
        BufferedReader bufferedReader;
        ArrayList arrayList = new ArrayList();
        if (!C0020ab.f110T.isAppListEnabled() || C0020ab.f109S) {
            return arrayList;
        }
        try {
            return m601d(context);
        } catch (Throwable unused) {
            BufferedReader bufferedReader2 = null;
            PackageManager packageManager = context.getPackageManager();
            try {
                try {
                    processExec = Runtime.getRuntime().exec("pm list packages");
                    bufferedReader = new BufferedReader(new InputStreamReader(processExec.getInputStream()));
                } catch (Throwable unused2) {
                }
            } catch (Throwable unused3) {
            }
            while (true) {
                try {
                    String line = bufferedReader.readLine();
                    if (line == null) {
                        break;
                    }
                    arrayList.add(packageManager.getPackageInfo(line.substring(line.indexOf(58) + 1), i));
                } catch (Throwable unused4) {
                    bufferedReader2 = bufferedReader;
                    if (bufferedReader2 != null) {
                        bufferedReader2.close();
                    }
                    return arrayList;
                }
                return arrayList;
            }
            processExec.waitFor();
            bufferedReader.close();
            return arrayList;
        }
    }

    /* JADX INFO: renamed from: a */
    public static JSONObject m589a(Context context, JSONObject jSONObject) {
        try {
            DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
            if (displayMetrics != null) {
                int i = displayMetrics.widthPixels;
                int i2 = displayMetrics.heightPixels;
                jSONObject.put("pixel", Math.min(i, i2) + "*" + Math.max(i, i2) + "*" + displayMetrics.densityDpi);
                jSONObject.put("densityDpi", displayMetrics.densityDpi);
            }
        } catch (Throwable unused) {
        }
        return jSONObject;
    }

    /* JADX INFO: renamed from: a */
    public static boolean m590a(Context context) {
        try {
            if (C0131y.m754a(17)) {
                return Settings.Global.getInt(context.getContentResolver(), "adb_enabled", 0) > 0;
            }
            return false;
        } catch (Throwable unused) {
            return false;
        }
    }

    /* JADX INFO: renamed from: a */
    private static int[] m591a(int[] iArr) {
        try {
            StatFs statFs = new StatFs(Environment.getDataDirectory().getAbsolutePath());
            iArr[0] = (statFs.getBlockCount() * (statFs.getBlockSize() / 512)) / 2;
            iArr[1] = (statFs.getAvailableBlocks() * (statFs.getBlockSize() / 512)) / 2;
        } catch (Throwable unused) {
        }
        try {
            StatFs statFs2 = new StatFs(Environment.getExternalStorageDirectory().getAbsolutePath());
            iArr[2] = (statFs2.getBlockCount() * (statFs2.getBlockSize() / 512)) / 2;
            iArr[3] = (statFs2.getAvailableBlocks() * (statFs2.getBlockSize() / 512)) / 2;
        } catch (Throwable unused2) {
        }
        return iArr;
    }

    /* JADX INFO: renamed from: b */
    private static int m592b(String str) {
        try {
            Matcher matcher = f544e.matcher(str);
            return Integer.parseInt(matcher.find() ? matcher.toMatchResult().group(0) : "");
        } catch (Exception unused) {
            return 0;
        }
    }

    /* JADX INFO: renamed from: b */
    private static String m593b(String str, String str2) {
        try {
            String lowerCase = str.toLowerCase();
            if (!lowerCase.startsWith("unknown") && !lowerCase.startsWith("alps") && !lowerCase.startsWith("android") && !lowerCase.startsWith("sprd") && !lowerCase.startsWith("spreadtrum") && !lowerCase.startsWith("rockchip") && !lowerCase.startsWith("wondermedia") && !lowerCase.startsWith("mtk") && !lowerCase.startsWith("mt65") && !lowerCase.startsWith("nvidia") && !lowerCase.startsWith("brcm") && !lowerCase.startsWith("marvell")) {
                if (!str2.toLowerCase().contains(lowerCase)) {
                    return str;
                }
            }
        } catch (Throwable unused) {
        }
        return null;
    }

    /* JADX INFO: renamed from: b */
    public static JSONObject m594b(Context context) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("nfcStatus", m597c(context));
            jSONObject.put("appsRegistedHCE", m632t(context));
            jSONObject.put("ssMode", m634u(context));
            return jSONObject;
        } catch (Throwable unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: b */
    public static JSONObject m595b(Context context, JSONObject jSONObject) {
        try {
            jSONObject.put("brightness", m630s(context));
        } catch (Throwable unused) {
        }
        return jSONObject;
    }

    /* JADX INFO: renamed from: b */
    public static boolean m596b() {
        try {
            Class<?> cls = Class.forName("com.huawei.system.BuildEx");
            Object objInvoke = cls.getMethod("getOsBrand", new Class[0]).invoke(cls, new Object[0]);
            if (objInvoke == null) {
                return false;
            }
            return "harmony".equalsIgnoreCase(objInvoke.toString());
        } catch (Throwable th) {
            C0115h.iForInternal("SA.HasHarmonyOS", th.getMessage());
            return false;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0039  */
    /* JADX INFO: renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static int m597c(Context context) {
        NfcAdapter defaultAdapter;
        int i;
        if (context == null) {
            return 0;
        }
        try {
            if (!C0131y.m754a(10) || (defaultAdapter = ((NfcManager) context.getSystemService("nfc")).getDefaultAdapter()) == null) {
                return 0;
            }
            if (!defaultAdapter.isEnabled()) {
                i = 1;
            } else if (C0131y.m754a(19)) {
                i = context.getPackageManager().hasSystemFeature("android.hardware.nfc.hce") ? 3 : 2;
            }
            return i;
        } catch (Throwable unused) {
            return 0;
        }
    }

    /* JADX INFO: renamed from: c */
    public static String m598c() {
        return m587a("hw_sc.build.platform.version", (String) null);
    }

    /* JADX DEBUG: Throwable added to exception handler: 'IOException', keep only Throwable */
    /* JADX INFO: renamed from: c */
    private static String m599c(String str) throws IOException {
        StringBuffer stringBuffer = new StringBuffer();
        try {
            FileReader fileReader = new FileReader(str);
            char[] cArr = new char[1024];
            BufferedReader bufferedReader = new BufferedReader(fileReader, 1024);
            while (true) {
                int i = bufferedReader.read(cArr, 0, 1024);
                if (-1 == i) {
                    break;
                }
                stringBuffer.append(new String(cArr, 0, i));
            }
            bufferedReader.close();
            fileReader.close();
        } catch (Throwable unused) {
        }
        return stringBuffer.toString();
    }

    /* JADX INFO: renamed from: d */
    public static String m600d() {
        InputStream inputStream;
        BufferedReader bufferedReader;
        Process processExec;
        try {
            processExec = Runtime.getRuntime().exec("uname -r");
            inputStream = processExec.waitFor() == 0 ? processExec.getInputStream() : processExec.getErrorStream();
            try {
                bufferedReader = new BufferedReader(new InputStreamReader(inputStream), 512);
            } catch (Throwable unused) {
                bufferedReader = null;
            }
        } catch (Throwable unused2) {
            inputStream = null;
            bufferedReader = null;
        }
        try {
            String line = bufferedReader.readLine();
            inputStream.close();
            bufferedReader.close();
            processExec.destroy();
            try {
                inputStream.close();
            } catch (Throwable unused3) {
            }
            try {
                bufferedReader.close();
            } catch (Throwable unused4) {
            }
            return line;
        } catch (Throwable unused5) {
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (Throwable unused6) {
                }
            }
            if (bufferedReader != null) {
                try {
                    bufferedReader.close();
                } catch (Throwable unused7) {
                }
            }
            return null;
        }
    }

    /* JADX INFO: renamed from: d */
    public static synchronized List<PackageInfo> m601d(Context context) {
        if (!C0020ab.f110T.isAppListEnabled()) {
            return null;
        }
        if (C0020ab.f109S) {
            return null;
        }
        if (f547h) {
            return f546g;
        }
        if (C0131y.m754a(30) && C0131y.m756a(context, 30) && !C0131y.m773c(context, "android.permission.QUERY_ALL_PACKAGES")) {
            f547h = true;
            return f546g;
        }
        try {
            f546g = context.getPackageManager().getInstalledPackages(5);
            f547h = true;
        } catch (Throwable unused) {
        }
        return f546g;
    }

    /* JADX INFO: renamed from: e */
    public static String m602e() {
        try {
            return Build.ID;
        } catch (Throwable unused) {
            return "";
        }
    }

    /* JADX INFO: renamed from: e */
    public static String m603e(Context context) {
        try {
            DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
            if (displayMetrics == null) {
                return "";
            }
            int i = displayMetrics.widthPixels;
            int i2 = displayMetrics.heightPixels;
            return Math.min(i, i2) + "*" + Math.max(i, i2) + "*" + displayMetrics.densityDpi;
        } catch (Throwable unused) {
            return "";
        }
    }

    /* JADX INFO: renamed from: f */
    public static int m604f(Context context) {
        if (context == null) {
            try {
                context = C0020ab.f132g;
                if (context == null) {
                    return 0;
                }
            } catch (Throwable unused) {
                return 0;
            }
        }
        Intent intentRegisterReceiver = context.registerReceiver(f550k, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
        int i = intentRegisterReceiver != null ? intentRegisterReceiver.getExtras().getInt("level", 0) : 0;
        context.unregisterReceiver(f550k);
        return i;
    }

    /* JADX INFO: renamed from: f */
    public static String m605f() {
        return Build.MANUFACTURER.trim();
    }

    /* JADX INFO: renamed from: g */
    public static int m606g(Context context) {
        if (context == null) {
            try {
                context = C0020ab.f132g;
                if (context == null) {
                    return 0;
                }
            } catch (Throwable unused) {
                return 0;
            }
        }
        Intent intentRegisterReceiver = context.registerReceiver(f550k, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
        int intExtra = intentRegisterReceiver != null ? intentRegisterReceiver.getIntExtra("status", 0) : 0;
        context.unregisterReceiver(f550k);
        return intExtra;
    }

    /* JADX INFO: renamed from: g */
    public static String m607g() {
        return Build.BRAND.trim();
    }

    /* JADX INFO: renamed from: h */
    public static String m608h() {
        return Build.MODEL.trim();
    }

    /* JADX INFO: renamed from: h */
    public static JSONObject m609h(Context context) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("mobile", m623o(context));
            jSONObject.put("wifi", m615k(context));
            jSONObject.put("gps", m613j(context));
            jSONObject.put("telephone", m621n(context));
            jSONObject.put("nfc", m619m(context));
            jSONObject.put("bluetooth", m617l(context));
            jSONObject.put("otg", m611i(context));
            return jSONObject;
        } catch (Throwable unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: i */
    public static int m610i() {
        return TimeZone.getDefault().getRawOffset() / f543d;
    }

    /* JADX INFO: renamed from: i */
    public static boolean m611i(Context context) {
        if (context == null && (context = C0020ab.f132g) == null) {
            return false;
        }
        try {
            PackageManager packageManager = context.getPackageManager();
            if (packageManager != null) {
                return packageManager.hasSystemFeature("android.hardware.usb.host");
            }
            return false;
        } catch (Throwable unused) {
            return false;
        }
    }

    /* JADX INFO: renamed from: j */
    public static String m612j() {
        try {
            String strTrim = Build.MODEL.trim();
            String strM593b = m593b(Build.MANUFACTURER.trim(), strTrim);
            if (TextUtils.isEmpty(strM593b)) {
                strM593b = m593b(Build.BRAND.trim(), strTrim);
            }
            if (strM593b == null) {
                strM593b = "";
            }
            return strM593b + ":" + strTrim;
        } catch (Throwable unused) {
            return "";
        }
    }

    /* JADX INFO: renamed from: j */
    public static boolean m613j(Context context) {
        if (context == null && (context = C0020ab.f132g) == null) {
            return false;
        }
        try {
            PackageManager packageManager = context.getPackageManager();
            if (packageManager != null) {
                return packageManager.hasSystemFeature("android.hardware.location.gps");
            }
            return false;
        } catch (Throwable unused) {
            return false;
        }
    }

    /* JADX INFO: renamed from: k */
    public static String m614k() {
        try {
            return C0131y.m754a(14) ? Build.getRadioVersion() : "unknown";
        } catch (Throwable unused) {
            return "unknown";
        }
    }

    /* JADX INFO: renamed from: k */
    public static boolean m615k(Context context) {
        if (context == null && (context = C0020ab.f132g) == null) {
            return false;
        }
        try {
            PackageManager packageManager = context.getPackageManager();
            if (packageManager != null) {
                return packageManager.hasSystemFeature("android.hardware.wifi");
            }
            return false;
        } catch (Throwable unused) {
            return false;
        }
    }

    /* JADX INFO: renamed from: l */
    public static int m616l() {
        return Build.VERSION.SDK_INT;
    }

    /* JADX INFO: renamed from: l */
    public static boolean m617l(Context context) {
        if (context == null && (context = C0020ab.f132g) == null) {
            return false;
        }
        try {
            PackageManager packageManager = context.getPackageManager();
            if (packageManager != null) {
                return packageManager.hasSystemFeature("android.hardware.bluetooth");
            }
            return false;
        } catch (Throwable unused) {
            return false;
        }
    }

    /* JADX INFO: renamed from: m */
    public static String m618m() {
        return Build.VERSION.RELEASE;
    }

    /* JADX INFO: renamed from: m */
    public static boolean m619m(Context context) {
        if (context == null && (context = C0020ab.f132g) == null) {
            return false;
        }
        try {
            PackageManager packageManager = context.getPackageManager();
            if (packageManager != null) {
                return packageManager.hasSystemFeature("android.hardware.nfc");
            }
            return false;
        } catch (Throwable unused) {
            return false;
        }
    }

    /* JADX INFO: renamed from: n */
    public static String m620n() {
        return Locale.getDefault().getLanguage();
    }

    /* JADX INFO: renamed from: n */
    public static boolean m621n(Context context) {
        if (context == null && (context = C0020ab.f132g) == null) {
            return false;
        }
        try {
            TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService("phone");
            if (telephonyManager != null) {
                return telephonyManager.getPhoneType() != 0;
            }
            return false;
        } catch (Throwable unused) {
            return false;
        }
    }

    /* JADX INFO: renamed from: o */
    public static String m622o() {
        return Locale.getDefault().getCountry();
    }

    /* JADX INFO: renamed from: o */
    public static boolean m623o(Context context) {
        if (context == null && (context = C0020ab.f132g) == null) {
            return false;
        }
        try {
            return context.getPackageManager().hasSystemFeature("android.hardware.telephony");
        } catch (Throwable unused) {
            return false;
        }
    }

    /* JADX INFO: renamed from: p */
    public static int m624p(Context context) {
        if (context == null) {
            try {
                context = C0020ab.f132g;
                if (context == null) {
                    return -1;
                }
            } catch (Throwable unused) {
            }
        }
        DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
        if (displayMetrics != null) {
            return displayMetrics.widthPixels;
        }
        return -1;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0058 A[Catch: all -> 0x0090, TryCatch #0 {all -> 0x0090, blocks: (B:6:0x0013, B:15:0x003c, B:19:0x004b, B:21:0x0058, B:23:0x005f, B:25:0x0068, B:27:0x0078, B:28:0x0082, B:29:0x0085, B:30:0x0088, B:17:0x0044), top: B:35:0x0013 }] */
    /* JADX INFO: renamed from: p */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static String[] m625p() {
        FileReader fileReader;
        BufferedReader bufferedReader;
        boolean z;
        String line;
        String[] strArr = new String[4];
        for (int i = 0; i < 4; i++) {
            strArr[i] = "";
        }
        ArrayList arrayList = new ArrayList();
        try {
            fileReader = new FileReader("/proc/cpuinfo");
            bufferedReader = new BufferedReader(fileReader, 1024);
        } catch (Throwable unused) {
        }
        do {
            try {
                try {
                    line = bufferedReader.readLine();
                } catch (IOException unused2) {
                }
            } catch (Throwable unused3) {
                bufferedReader.close();
                fileReader.close();
            }
            if (line == null) {
                try {
                    bufferedReader.close();
                    fileReader.close();
                } catch (IOException unused4) {
                }
                z = true;
                String[] strArr2 = {"Processor\\s*:\\s*(.*)", "CPU\\s*variant\\s*:\\s*0x(.*)", "Hardware\\s*:\\s*(.*)"};
                if (z) {
                    int size = arrayList.size();
                    for (int i2 = 0; i2 < 3; i2++) {
                        Pattern patternCompile = Pattern.compile(strArr2[i2]);
                        for (int i3 = 0; i3 < size; i3++) {
                            Matcher matcher = patternCompile.matcher((String) arrayList.get(i3));
                            if (matcher.find()) {
                                strArr[i2] = matcher.toMatchResult().group(1);
                            }
                        }
                    }
                }
                strArr[3] = m599c(f540a);
                return strArr;
            }
            arrayList.add(line);
            z = false;
            String[] strArr22 = {"Processor\\s*:\\s*(.*)", "CPU\\s*variant\\s*:\\s*0x(.*)", "Hardware\\s*:\\s*(.*)"};
            if (z) {
            }
            strArr[3] = m599c(f540a);
            return strArr;
        } while (arrayList.size() <= 104857600);
        throw new RuntimeException("List size more than 104857600 limit");
    }

    /* JADX INFO: renamed from: q */
    public static int m626q(Context context) {
        if (context == null) {
            try {
                context = C0020ab.f132g;
                if (context == null) {
                    return -1;
                }
            } catch (Throwable unused) {
            }
        }
        DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
        if (displayMetrics != null) {
            return displayMetrics.heightPixels;
        }
        return -1;
    }

    /* JADX INFO: renamed from: q */
    public static JSONObject m627q() {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("name", m625p()[2]);
            jSONObject.put("coreNum", m628r());
            jSONObject.put("maxFreq", m585a(f540a));
            jSONObject.put("minFreq", m585a(f541b));
            jSONObject.put("curFreq", m585a(f542c));
            return jSONObject;
        } catch (Throwable unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: r */
    public static int m628r() {
        try {
            File[] fileArrListFiles = new File("/sys/devices/system/cpu/").listFiles(f549j);
            if (fileArrListFiles != null) {
                return fileArrListFiles.length;
            }
            return 1;
        } catch (Throwable unused) {
            return 1;
        }
    }

    /* JADX INFO: renamed from: r */
    public static int m629r(Context context) {
        if (context == null) {
            try {
                context = C0020ab.f132g;
                if (context == null) {
                    return -1;
                }
            } catch (Throwable unused) {
            }
        }
        DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
        if (displayMetrics != null) {
            return displayMetrics.densityDpi;
        }
        return -1;
    }

    /* JADX INFO: renamed from: s */
    public static int m630s(Context context) {
        if (context == null && (context = C0020ab.f132g) == null) {
            return -1;
        }
        try {
            return Settings.System.getInt(context.getContentResolver(), "screen_brightness");
        } catch (Throwable unused) {
            return -1;
        }
    }

    /* JADX INFO: renamed from: s */
    public static int[] m631s() {
        int[] iArr = {0, 0};
        try {
            if ("mounted".equals(Environment.getExternalStorageState())) {
                StatFs statFs = new StatFs(Environment.getExternalStorageDirectory().getPath());
                int blockSize = statFs.getBlockSize();
                int blockCount = statFs.getBlockCount();
                int availableBlocks = statFs.getAvailableBlocks();
                iArr[0] = (blockCount * (blockSize / 512)) / 2;
                iArr[1] = (availableBlocks * (blockSize / 512)) / 2;
            }
        } catch (Throwable unused) {
        }
        return iArr;
    }

    /* JADX INFO: renamed from: t */
    private static JSONArray m632t(Context context) {
        ServiceInfo[] serviceInfoArr;
        Bundle bundle;
        if (!C0131y.m754a(19)) {
            return null;
        }
        try {
            JSONArray jSONArray = new JSONArray();
            List<PackageInfo> listM588a = m588a(context, 4);
            if (listM588a != null) {
                for (PackageInfo packageInfo : listM588a) {
                    if (packageInfo != null && (serviceInfoArr = packageInfo.services) != null) {
                        int length = serviceInfoArr.length;
                        int i = 0;
                        while (true) {
                            if (i < length) {
                                ServiceInfo serviceInfo = serviceInfoArr[i];
                                try {
                                    bundle = context.getPackageManager().getServiceInfo(new ComponentName(serviceInfo.packageName, serviceInfo.name), 128).metaData;
                                } catch (Throwable unused) {
                                }
                                if (bundle != null && bundle.containsKey("android.nfc.cardemulation.host_apdu_service")) {
                                    jSONArray.put(packageInfo.packageName);
                                    break;
                                }
                                i++;
                            }
                        }
                    }
                }
            }
            return jSONArray;
        } catch (Throwable unused2) {
            return null;
        }
    }

    /* JADX DEBUG: Throwable added to exception handler: 'IOException', keep only Throwable */
    /* JADX INFO: renamed from: t */
    public static int[] m633t() throws IOException {
        int[] iArr = {0, 0};
        int[] iArr2 = new int[4];
        for (int i = 0; i < 4; i++) {
            iArr2[i] = 0;
        }
        try {
            FileReader fileReader = new FileReader("/proc/meminfo");
            BufferedReader bufferedReader = new BufferedReader(fileReader, 1024);
            for (int i2 = 0; i2 < 4; i2++) {
                try {
                    String line = bufferedReader.readLine();
                    if (line.length() > 104857600) {
                        throw new RuntimeException("Input stream more than 100 MB size limit");
                    }
                    iArr2[i2] = m592b(line);
                } catch (IOException unused) {
                } catch (Throwable th) {
                    try {
                        bufferedReader.close();
                        fileReader.close();
                    } catch (IOException unused2) {
                    }
                    throw th;
                }
            }
            iArr[0] = iArr2[0];
            iArr[1] = iArr2[1] + iArr2[2] + iArr2[3];
            bufferedReader.close();
            fileReader.close();
        } catch (Throwable unused3) {
        }
        return iArr;
    }

    /* JADX INFO: renamed from: u */
    private static int m634u(Context context) {
        NfcAdapter defaultAdapter;
        try {
            if (!C0131y.m754a(19) || (defaultAdapter = ((NfcManager) context.getSystemService("nfc")).getDefaultAdapter()) == null) {
                return -1;
            }
            return CardEmulation.getInstance(defaultAdapter).getSelectionModeForCategory("payment");
        } catch (Throwable unused) {
            return -1;
        }
    }

    /* JADX INFO: renamed from: u */
    public static int[] m635u() {
        int[] iArr = new int[4];
        int[] iArr2 = f548i;
        if (iArr2 == null || iArr2.length <= 0) {
            f548i = m591a(iArr);
        }
        return f548i;
    }

    /* JADX INFO: renamed from: v */
    public static int m636v() {
        try {
            Matcher matcher = f545f.matcher(m599c("/sys/class/power_supply/battery/full_bat"));
            if (matcher.find()) {
                return Integer.parseInt(matcher.toMatchResult().group(0));
            }
            return 0;
        } catch (Exception unused) {
            return 0;
        }
    }
}
