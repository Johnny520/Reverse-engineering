package p000;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.os.Build;
import com.p001mr.elaris.Prefs;
import com.p001mr.elaris.xposedcompat.XposedBridge;
import java.io.File;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.nio.charset.StandardCharsets;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONObject;

/* JADX INFO: renamed from: l3 */
/* JADX INFO: compiled from: r8-map-id-cb25a2bafef54619fff8cdac9d36ff56d89ce0d5459e21e33664152f938f1f39 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0309l3 {

    /* JADX INFO: renamed from: a */
    public static final AtomicBoolean f511a = new AtomicBoolean(false);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0031 A[PHI: r9 r11
  0x0031: PHI (r9v1 long) = (r9v0 long), (r9v7 long), (r9v7 long), (r9v7 long), (r9v7 long) binds: [B:12:0x002f, B:11:0x002d, B:90:0x0031, B:6:0x0023, B:8:0x0027] A[DONT_GENERATE, DONT_INLINE]
  0x0031: PHI (r11v1 long) = (r11v0 long), (r11v16 long), (r11v18 long), (r11v18 long), (r11v18 long) binds: [B:12:0x002f, B:11:0x002d, B:90:0x0031, B:6:0x0023, B:8:0x0027] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void m745a(Context context, String str) {
        long jMax;
        long jMax2;
        String str2;
        long jMax3;
        C0277j3 c0277j3;
        int i;
        C0277j3 c0277j32;
        ApplicationInfo applicationInfo;
        try {
            PackageInfo packageInfo = context.getPackageManager().getPackageInfo(Prefs.PACKAGE_NAME, 0);
            jMax = Math.max(0L, packageInfo.firstInstallTime);
            try {
                jMax2 = Math.max(0L, packageInfo.lastUpdateTime);
                try {
                    applicationInfo = packageInfo.applicationInfo;
                } catch (Throwable unused) {
                }
            } catch (Throwable unused2) {
                jMax2 = 0;
            }
        } catch (Throwable unused3) {
            jMax = 0;
            jMax2 = 0;
        }
        if (applicationInfo != null) {
            str2 = applicationInfo.sourceDir;
            if (str2 == null) {
                str2 = "";
            }
        }
        long j = jMax2;
        long j2 = jMax;
        if (str2.length() == 0) {
            try {
                ApplicationInfo applicationInfo2 = context.getPackageManager().getApplicationInfo(Prefs.PACKAGE_NAME, 0);
                if (applicationInfo2 != null) {
                    String str3 = applicationInfo2.sourceDir;
                    str2 = str3 == null ? "" : str3;
                }
            } catch (Throwable unused4) {
            }
        }
        try {
            ApplicationInfo moduleApplicationInfo = XposedBridge.getModuleApplicationInfo();
            if (moduleApplicationInfo != null) {
                String str4 = moduleApplicationInfo.sourceDir;
                str2 = str4 != null ? str4 : "";
            }
        } catch (Throwable unused5) {
        }
        if (str2.length() > 0) {
            try {
                jMax3 = Math.max(0L, new File(str2).lastModified());
            } catch (Throwable unused6) {
                jMax3 = 0;
            }
        } else {
            jMax3 = 0;
        }
        String strConcat = "1220:".concat("2.6.7");
        C0293k3 c0293k3 = new C0293k3(strConcat, j2, j, jMax3);
        long jCurrentTimeMillis = System.currentTimeMillis();
        String strM751g = m751g(jCurrentTimeMillis);
        SharedPreferences sharedPreferences = context.getSharedPreferences("elaris_analytics", 0);
        synchronized (AbstractC0309l3.class) {
            try {
                String string = sharedPreferences.getString("install_id", "");
                if (string == null || string.length() < 16) {
                    string = UUID.randomUUID().toString();
                }
                long j3 = sharedPreferences.getLong("first_seen_at", jCurrentTimeMillis);
                if (strConcat.equals(sharedPreferences.getString("reported_module_revision", ""))) {
                    c0277j3 = null;
                    i = 16;
                } else {
                    long j4 = sharedPreferences.getLong("report_total", 0L) + 1;
                    int i2 = strM751g.equals(sharedPreferences.getString("launch_day", "")) ? 1 + sharedPreferences.getInt("launch_day_count", 0) : 1;
                    sharedPreferences.edit().putString("install_id", string).putLong("first_seen_at", j3).putString("launch_day", strM751g).putInt("launch_day_count", i2).putLong("last_attempt_at", jCurrentTimeMillis).apply();
                    i = 16;
                    c0277j3 = new C0277j3(string, j3, jCurrentTimeMillis, j4, strM751g, i2);
                }
            } finally {
            }
        }
        try {
            if (c0277j3 == null) {
                long jCurrentTimeMillis2 = System.currentTimeMillis();
                String strM751g2 = m751g(jCurrentTimeMillis2);
                SharedPreferences sharedPreferences2 = context.getSharedPreferences("elaris_analytics", 0);
                synchronized (AbstractC0309l3.class) {
                    try {
                        String string2 = sharedPreferences2.getString("install_id", "");
                        if (string2 == null || string2.length() < i || strM751g2.equals(sharedPreferences2.getString("active_attempt_day", ""))) {
                            c0277j32 = null;
                        } else {
                            long j5 = sharedPreferences2.getLong("first_seen_at", jCurrentTimeMillis2);
                            long jMax4 = Math.max(0L, sharedPreferences2.getLong("report_total", 0L));
                            sharedPreferences2.edit().putString("active_attempt_day", strM751g2).putLong("last_active_attempt_at", jCurrentTimeMillis2).apply();
                            c0277j32 = new C0277j3(string2, j5, jCurrentTimeMillis2, jMax4, strM751g2, 1);
                        }
                    } finally {
                    }
                }
                if (c0277j32 == null || !m750f("https://1327845120-5m4s7nykmv.ap-guangzhou.tencentscf.com/api/analytics/active", m746b(context, str, c0277j32, c0293k3, "active"))) {
                } else {
                    context.getSharedPreferences("elaris_analytics", 0).edit().putString("active_success_day", c0277j32.f457e).putLong("last_active_success_at", System.currentTimeMillis()).apply();
                }
            } else if (!m750f("https://1327845120-5m4s7nykmv.ap-guangzhou.tencentscf.com/api/analytics/launch", m746b(context, str, c0277j3, c0293k3, "launch"))) {
            } else {
                context.getSharedPreferences("elaris_analytics", 0).edit().putString("reported_module_revision", strConcat).putLong("report_total", c0277j3.f456d).putString("active_attempt_day", c0277j3.f457e).putString("active_success_day", c0277j3.f457e).putLong("last_success_at", System.currentTimeMillis()).apply();
            }
        } catch (Throwable unused7) {
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b */
    public static JSONObject m746b(Context context, String str, C0277j3 c0277j3, C0293k3 c0293k3, String str2) {
        JSONObject jSONObject = new JSONObject();
        try {
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("versionName", "2.6.7");
            jSONObject2.put("versionCode", 1220);
            jSONObject2.put("revision", c0293k3.f487a);
            jSONObject2.put("firstInstallAt", c0293k3.f488b);
            jSONObject2.put("lastUpdateAt", c0293k3.f489c);
            jSONObject2.put("sourceModifiedAt", c0293k3.f490d);
            JSONObject jSONObject3 = new JSONObject();
            jSONObject3.put("packageName", "com.tencent.mobileqq");
            String str3 = "";
            if (str == null) {
                str = "";
            }
            jSONObject3.put("processName", str);
            try {
                try {
                    PackageInfo packageInfo = context.getPackageManager().getPackageInfo("com.tencent.mobileqq", 0);
                    String str4 = packageInfo.versionName;
                    if (str4 == null) {
                        str4 = "";
                    }
                    jSONObject3.put("versionName", str4);
                    jSONObject3.put("versionCode", packageInfo.getLongVersionCode());
                } catch (Throwable unused) {
                    jSONObject3.put("versionName", "unknown");
                    jSONObject3.put("versionCode", 0L);
                }
            } catch (Throwable unused2) {
            }
            JSONObject jSONObject4 = new JSONObject();
            jSONObject4.put("sdk", Build.VERSION.SDK_INT);
            String str5 = Build.VERSION.RELEASE;
            if (str5 != null) {
                str3 = str5;
            }
            jSONObject4.put("release", str3);
            JSONObject jSONObject5 = new JSONObject();
            jSONObject5.put("total", c0277j3.f456d);
            jSONObject5.put("day", c0277j3.f457e);
            jSONObject5.put("dayCount", c0277j3.f458f);
            jSONObject5.put("firstSeenAt", c0277j3.f454b);
            JSONObject jSONObjectM748d = m748d();
            jSONObject.put("schema", 2);
            jSONObject.put("event", str2);
            jSONObject.put("installId", c0277j3.f453a);
            jSONObject.put("reportedAt", c0277j3.f455c);
            jSONObject.put("module", jSONObject2);
            jSONObject.put("qq", jSONObject3);
            jSONObject.put("android", jSONObject4);
            jSONObject.put("framework", jSONObjectM748d);
            jSONObject.put("xposed", jSONObjectM748d.optString("name", "Unknown"));
            jSONObject.put("launch", jSONObject5);
        } catch (Throwable unused3) {
        }
        return jSONObject;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: c */
    public static String m747c(String str, String str2) {
        String lowerCase = (str + " " + str2).toLowerCase(Locale.US);
        return (lowerCase.contains("lspatch") || m749e("org.lsposed.lspatch.loader.LSPApplication") || m749e("org.lsposed.lspatch.loader.LSPModule") || m749e("org.lsposed.lspatch.loader.LSPatchClassLoader") || m749e("org.lsposed.lspatch.loader.LSPatchModuleLoader")) ? "LSPatch" : (lowerCase.contains("npatch") || lowerCase.contains("nitsuya") || m749e("io.github.nitsuya.npatch.NPatch") || m749e("org.lsposed.npatch.loader.NPatchModuleLoader")) ? "NPatch" : (lowerCase.contains("fpa") || lowerCase.contains("fankes.fpa") || m749e("com.fankes.fpa.core.FPA") || m749e("com.fankes.fpa.hook.FPAHook")) ? "FPA" : (lowerCase.contains("lsposed") || lowerCase.contains("lspd") || m749e("org.lsposed.lspd.core.Main") || m749e("org.lsposed.lspd.nativebridge.HookBridge") || m749e("org.lsposed.lspd.service.ILSPApplicationService")) ? "LSPosed" : "Unknown";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: d */
    public static JSONObject m748d() {
        JSONObject jSONObject = new JSONObject();
        try {
            try {
                String frameworkName = XposedBridge.getFrameworkName();
                String str = "";
                if (frameworkName == null) {
                    frameworkName = "";
                }
                String frameworkVersion = XposedBridge.getFrameworkVersion();
                if (frameworkVersion == null) {
                    frameworkVersion = "";
                }
                String frameworkClassName = XposedBridge.getFrameworkClassName();
                if (frameworkClassName != null) {
                    str = frameworkClassName;
                }
                int xposedVersion = XposedBridge.getXposedVersion();
                jSONObject.put("name", m747c(frameworkName, str));
                jSONObject.put("api", xposedVersion);
                jSONObject.put("frameworkName", frameworkName);
                jSONObject.put("frameworkVersion", frameworkVersion);
                jSONObject.put("source", str);
                return jSONObject;
            } catch (Throwable unused) {
                return jSONObject;
            }
        } catch (Throwable unused2) {
            jSONObject.put("name", "Unknown");
            jSONObject.put("api", XposedBridge.XPOSED_BRIDGE_VERSION);
            return jSONObject;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: e */
    public static boolean m749e(String str) {
        ClassLoader[] classLoaderArr = {AbstractC0309l3.class.getClassLoader(), Thread.currentThread().getContextClassLoader(), ClassLoader.getSystemClassLoader()};
        for (int i = 0; i < 3; i++) {
            ClassLoader classLoader = classLoaderArr[i];
            if (classLoader != null) {
                try {
                    Class.forName(str, false, classLoader);
                    return true;
                } catch (Throwable unused) {
                    continue;
                }
            }
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: f */
    public static boolean m750f(String str, JSONObject jSONObject) {
        boolean z = false;
        HttpURLConnection httpURLConnection = null;
        try {
            byte[] bytes = jSONObject.toString().getBytes(StandardCharsets.UTF_8);
            HttpURLConnection httpURLConnection2 = (HttpURLConnection) new URL(str).openConnection();
            try {
                httpURLConnection2.setConnectTimeout(1500);
                httpURLConnection2.setReadTimeout(1500);
                httpURLConnection2.setRequestMethod("POST");
                httpURLConnection2.setDoOutput(true);
                httpURLConnection2.setRequestProperty("Content-Type", "application/json; charset=utf-8");
                httpURLConnection2.setRequestProperty("Accept", "application/json");
                httpURLConnection2.setFixedLengthStreamingMode(bytes.length);
                OutputStream outputStream = httpURLConnection2.getOutputStream();
                try {
                    outputStream.write(bytes);
                    outputStream.close();
                    int responseCode = httpURLConnection2.getResponseCode();
                    if (responseCode >= 200 && responseCode < 300) {
                        z = true;
                    }
                    httpURLConnection2.disconnect();
                    return z;
                } catch (Throwable th) {
                    outputStream.close();
                    throw th;
                }
            } catch (Throwable unused) {
                httpURLConnection = httpURLConnection2;
                if (httpURLConnection != null) {
                    httpURLConnection.disconnect();
                }
                return false;
            }
        } catch (Throwable unused2) {
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: g */
    public static String m751g(long j) {
        try {
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd", Locale.US);
            simpleDateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
            return simpleDateFormat.format(new Date(j));
        } catch (Throwable unused) {
            return "";
        }
    }
}
