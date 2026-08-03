package p210o8;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.os.Build;
import android.text.TextUtils;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.lang.reflect.Field;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import okhttp3.HttpUrl;
import p167l8.C2534i;

/* JADX INFO: renamed from: o8.k */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C3087k {

    /* JADX INFO: renamed from: d */
    public static final Pattern f9974d = Pattern.compile("(?:patch\\.client\\.ver|clientVersion|CLIENT_VERSION)\\s*[=:]\\s*(0x[0-9a-fA-F]+|\\d+)");

    /* JADX INFO: renamed from: e */
    public static final Pattern f9975e = Pattern.compile("(?:NEW_TINKER_ID|TINKER_ID)\\s*[=:]\\s*([^,}\\s]+)");

    /* JADX INFO: renamed from: f */
    public static final Pattern f9976f = Pattern.compile("intent_patch_(?:new|old)_version\\s*[=:]\\s*([^,}\\s]+)");

    /* JADX INFO: renamed from: a */
    public final Context f9977a;

    /* JADX INFO: renamed from: b */
    public final ClassLoader f9978b;

    /* JADX INFO: renamed from: c */
    public volatile C2534i f9979c;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C3087k(Context context, ClassLoader classLoader) {
        this.f9977a = context;
        this.f9978b = classLoader;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Duplicate block (B:17:0x004c) to fix multi-entry loop: BACK_EDGE: B:17:0x004c -> B:79:0x004e */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0070  */
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static C2534i m6557a(Context context, ClassLoader classLoader) {
        String str;
        long longVersionCode;
        String strTrim;
        String str2;
        File[] fileArrListFiles;
        File[] fileArr;
        ApplicationInfo applicationInfo;
        String str3 = HttpUrl.FRAGMENT_ENCODE_SET;
        if (context == null) {
            Integer.toHexString(String.valueOf(classLoader).hashCode());
            return new C2534i(HttpUrl.FRAGMENT_ENCODE_SET, HttpUrl.FRAGMENT_ENCODE_SET, HttpUrl.FRAGMENT_ENCODE_SET, HttpUrl.FRAGMENT_ENCODE_SET, 0L, 0L, HttpUrl.FRAGMENT_ENCODE_SET, HttpUrl.FRAGMENT_ENCODE_SET);
        }
        String packageName = context.getPackageName();
        try {
            PackageInfo packageInfo = context.getPackageManager().getPackageInfo(packageName, 0);
            str = packageInfo.versionName;
            if (str == null) {
                str = HttpUrl.FRAGMENT_ENCODE_SET;
            }
            try {
                longVersionCode = Build.VERSION.SDK_INT >= 28 ? packageInfo.getLongVersionCode() : packageInfo.versionCode;
            } catch (Throwable unused) {
                longVersionCode = 0;
            }
        } catch (Throwable unused2) {
            str = HttpUrl.FRAGMENT_ENCODE_SET;
            longVersionCode = 0;
        }
        try {
            applicationInfo = context.getApplicationInfo();
        } catch (Throwable unused3) {
        }
        long jLastModified = (applicationInfo == null || TextUtils.isEmpty(applicationInfo.sourceDir)) ? 0L : new File(applicationInfo.sourceDir).lastModified();
        String strValueOf = String.valueOf(classLoader);
        if (classLoader == null) {
            strTrim = HttpUrl.FRAGMENT_ENCODE_SET;
        } else {
            try {
                Class<?> cls = Class.forName("com.tencent.mm.boot.BuildConfig", false, classLoader);
                String strM6558c = m6558c(m6560e(cls, "CLIENT_VERSION_ARM64"), m6560e(cls, "CLIENT_VERSION"), m6560e(cls, "CLIENT_VERSION_INT"), m6560e(cls, "CLIENTVERSION"));
                if (strM6558c != null) {
                    strTrim = strM6558c.trim();
                }
            } catch (Throwable unused4) {
            }
        }
        String strM6558c2 = m6558c(strTrim, m6559d(f9974d, strValueOf), m6561f(context, "patch.client.ver"), m6561f(context, "client.ver"));
        String strM6558c3 = m6558c(m6559d(f9975e, strValueOf), m6561f(context, "NEW_TINKER_ID"), m6561f(context, "TINKER_ID"));
        String strM6559d = m6559d(f9976f, strValueOf);
        try {
            fileArrListFiles = new File(context.getFilesDir().getParentFile(), "tinker").listFiles();
        } catch (Throwable unused5) {
        }
        if (fileArrListFiles == null) {
            str2 = HttpUrl.FRAGMENT_ENCODE_SET;
        } else {
            int length = fileArrListFiles.length;
            str2 = HttpUrl.FRAGMENT_ENCODE_SET;
            int i9 = 0;
            long j3 = 0;
            while (i9 < length) {
                File file = fileArrListFiles[i9];
                if (file == null || !file.isDirectory()) {
                    fileArr = fileArrListFiles;
                } else {
                    fileArr = fileArrListFiles;
                    String name = file.getName();
                    if (!TextUtils.isEmpty(name) && name.startsWith("patch-")) {
                        long jLastModified2 = file.lastModified();
                        if (jLastModified2 >= j3) {
                            str2 = name;
                            j3 = jLastModified2;
                        }
                    }
                }
                i9++;
                fileArrListFiles = fileArr;
            }
        }
        String strM6558c4 = m6558c(strM6559d, str2);
        String hexString = Integer.toHexString(String.valueOf(classLoader).hashCode());
        StringBuilder sb2 = new StringBuilder();
        sb2.append(packageName != null ? packageName : HttpUrl.FRAGMENT_ENCODE_SET);
        sb2.append('|');
        sb2.append(str);
        sb2.append('|');
        sb2.append(longVersionCode);
        sb2.append('|');
        sb2.append(strM6558c2 != null ? strM6558c2 : HttpUrl.FRAGMENT_ENCODE_SET);
        sb2.append('|');
        sb2.append(strM6558c3 != null ? strM6558c3 : HttpUrl.FRAGMENT_ENCODE_SET);
        sb2.append('|');
        sb2.append(strM6558c4 != null ? strM6558c4 : HttpUrl.FRAGMENT_ENCODE_SET);
        sb2.append('|');
        sb2.append(jLastModified);
        sb2.append('|');
        if (hexString != null) {
            str3 = hexString;
        }
        sb2.append(str3);
        return new C2534i(packageName, str, strM6558c2, strM6558c3, longVersionCode, jLastModified, strM6558c4, sb2.toString());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: c */
    public static String m6558c(String... strArr) {
        for (String str : strArr) {
            if (!TextUtils.isEmpty(str)) {
                return str;
            }
        }
        return HttpUrl.FRAGMENT_ENCODE_SET;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: d */
    public static String m6559d(Pattern pattern, String str) {
        if (pattern == null || TextUtils.isEmpty(str)) {
            return HttpUrl.FRAGMENT_ENCODE_SET;
        }
        try {
            Matcher matcher = pattern.matcher(str);
            return matcher.find() ? matcher.group(1) : HttpUrl.FRAGMENT_ENCODE_SET;
        } catch (Throwable unused) {
            return HttpUrl.FRAGMENT_ENCODE_SET;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: e */
    public static String m6560e(Class cls, String str) {
        if (cls == null || TextUtils.isEmpty(str)) {
            return HttpUrl.FRAGMENT_ENCODE_SET;
        }
        try {
            Field declaredField = cls.getDeclaredField(str);
            declaredField.setAccessible(true);
            Object obj = declaredField.get(null);
            return obj != null ? String.valueOf(obj) : HttpUrl.FRAGMENT_ENCODE_SET;
        } catch (Throwable unused) {
            return HttpUrl.FRAGMENT_ENCODE_SET;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: f */
    public static String m6561f(Context context, String str) {
        if (context == null || TextUtils.isEmpty(str)) {
            return HttpUrl.FRAGMENT_ENCODE_SET;
        }
        try {
            String strM6562g = m6562g(new File(context.getFilesDir().getParentFile(), "tinker"), str);
            return strM6562g != null ? strM6562g : HttpUrl.FRAGMENT_ENCODE_SET;
        } catch (Throwable unused) {
            return HttpUrl.FRAGMENT_ENCODE_SET;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: g */
    public static String m6562g(File file, String str) {
        File[] fileArrListFiles;
        String strTrim;
        int i9;
        if (file.exists() && (fileArrListFiles = file.listFiles()) != null) {
            for (File file2 : fileArrListFiles) {
                if (file2 != null) {
                    if (file2.isDirectory()) {
                        String strM6562g = m6562g(file2, str);
                        if (!TextUtils.isEmpty(strM6562g)) {
                            return strM6562g;
                        }
                    } else {
                        String name = file2.getName();
                        if (!TextUtils.isEmpty(name) && (name.endsWith(".meta") || name.endsWith(".txt") || name.endsWith(".properties"))) {
                            BufferedReader bufferedReader = null;
                            try {
                                BufferedReader bufferedReader2 = new BufferedReader(new FileReader(file2));
                                while (true) {
                                    try {
                                        String line = bufferedReader2.readLine();
                                        if (line != null) {
                                            int iIndexOf = line.indexOf(str);
                                            if (iIndexOf >= 0) {
                                                int iIndexOf2 = line.indexOf(61, str.length() + iIndexOf);
                                                if (iIndexOf2 < 0) {
                                                    iIndexOf2 = line.indexOf(58, iIndexOf + str.length());
                                                }
                                                if (iIndexOf2 >= 0 && (i9 = iIndexOf2 + 1) < line.length()) {
                                                    strTrim = line.substring(i9).trim();
                                                    try {
                                                        bufferedReader2.close();
                                                        break;
                                                    } catch (Throwable unused) {
                                                    }
                                                }
                                            }
                                        } else {
                                            try {
                                                bufferedReader2.close();
                                                break;
                                            } catch (Throwable unused2) {
                                            }
                                        }
                                    } catch (Throwable unused3) {
                                        bufferedReader = bufferedReader2;
                                        if (bufferedReader != null) {
                                            bufferedReader.close();
                                        }
                                    }
                                }
                            } catch (Throwable unused4) {
                            }
                            strTrim = HttpUrl.FRAGMENT_ENCODE_SET;
                            if (!TextUtils.isEmpty(strTrim)) {
                                return strTrim;
                            }
                        }
                    }
                }
            }
        }
        return HttpUrl.FRAGMENT_ENCODE_SET;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b */
    public final C2534i m6563b() {
        C2534i c2534i = this.f9979c;
        C2534i c2534iM6557a = m6557a(this.f9977a, this.f9978b);
        if (c2534i == null) {
            this.f9979c = c2534iM6557a;
            return c2534iM6557a;
        }
        if (!TextUtils.isEmpty(c2534i.f8199e) && !TextUtils.isEmpty(c2534i.f8198d) && c2534i.f8195a > 0 && TextUtils.equals(c2534i.f8202h, c2534iM6557a.f8202h) && TextUtils.equals(c2534i.f8199e, c2534iM6557a.f8199e) && TextUtils.equals(c2534i.f8200f, c2534iM6557a.f8200f) && TextUtils.equals(c2534i.f8201g, c2534iM6557a.f8201g)) {
            return c2534i;
        }
        this.f9979c = c2534iM6557a;
        return c2534iM6557a;
    }
}
