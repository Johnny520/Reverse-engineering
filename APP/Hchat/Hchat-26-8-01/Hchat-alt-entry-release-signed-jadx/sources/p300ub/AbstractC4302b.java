package p300ub;

import ac.C0061n;
import ac.SharedPreferencesC0062o;
import android.content.Context;
import android.content.SharedPreferences;
import java.io.File;
import java.util.concurrent.ConcurrentHashMap;
import p080fb.AbstractC1184v0;
import p332wb.AbstractC4855en;

/* JADX INFO: renamed from: ub.b */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC4302b {

    /* JADX INFO: renamed from: a */
    public static final ConcurrentHashMap f14346a = new ConcurrentHashMap();

    /* JADX INFO: renamed from: b */
    public static final String[] f14347b = {".kva", ".kvb", ".kvc"};

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public static SharedPreferencesC0062o m8638a(Context context, String str) {
        SharedPreferencesC0062o sharedPreferencesC0062o;
        C0061n c0061n = new C0061n(m8641d(context).getAbsolutePath(), str);
        String str2 = c0061n.f186a + c0061n.f187b;
        ConcurrentHashMap concurrentHashMap = C0061n.f185c;
        SharedPreferencesC0062o sharedPreferencesC0062o2 = (SharedPreferencesC0062o) concurrentHashMap.get(str2);
        if (sharedPreferencesC0062o2 != null) {
            return sharedPreferencesC0062o2;
        }
        synchronized (C0061n.class) {
            try {
                sharedPreferencesC0062o = (SharedPreferencesC0062o) concurrentHashMap.get(str2);
                if (sharedPreferencesC0062o == null) {
                    sharedPreferencesC0062o = new SharedPreferencesC0062o(c0061n.f186a, c0061n.f187b, null, 0);
                    concurrentHashMap.put(str2, sharedPreferencesC0062o);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return sharedPreferencesC0062o;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b */
    public static boolean m8639b(File file) {
        for (String str : f14347b) {
            if (new File(file, AbstractC4855en.m9263g("Hchat_global_config", str)).isFile()) {
                return true;
            }
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: c */
    public static final SharedPreferences m8640c(Context context, String str) {
        context.getClass();
        str.getClass();
        Context applicationContext = context.getApplicationContext();
        if (applicationContext != null) {
            context = applicationContext;
        }
        String strM9264h = AbstractC4855en.m9264h(context.getPackageName(), ":", str);
        ConcurrentHashMap concurrentHashMap = f14346a;
        SharedPreferences sharedPreferences = (SharedPreferences) concurrentHashMap.get(strM9264h);
        if (sharedPreferences != null) {
            return sharedPreferences;
        }
        SharedPreferencesC0062o sharedPreferencesC0062oM8638a = m8638a(context, str);
        SharedPreferences sharedPreferences2 = (SharedPreferences) concurrentHashMap.putIfAbsent(strM9264h, sharedPreferencesC0062oM8638a);
        return sharedPreferences2 != null ? sharedPreferences2 : sharedPreferencesC0062oM8638a;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: d */
    public static final File m8641d(Context context) {
        File filesDir;
        context.getClass();
        try {
            filesDir = context.getDataDir();
        } catch (Throwable unused) {
            filesDir = context.getFilesDir();
        }
        File file = new File(filesDir, "Hchat");
        if (!file.isDirectory() && !file.mkdirs()) {
            AbstractC1184v0.m3203m("[Hchat:Storage] 创建目录失败: " + file.getAbsolutePath());
        }
        return file;
    }
}
