package p001;

import de.robv.android.xposed.XposedHelpers;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: renamed from: ۟.b6 */
/* JADX INFO: loaded from: classes.dex */
public final class C0155b6 {
    /* JADX INFO: renamed from: ۥ */
    public static boolean m821() {
        try {
            StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
            C0237h4.m865(stackTrace);
            for (StackTraceElement stackTraceElement : stackTrace) {
                if (C0237h4.m864(stackTraceElement.getClassName(), "com.zfork.brutal.MundoXCallback")) {
                    return true;
                }
            }
        } catch (NoClassDefFoundError unused) {
        }
        return false;
    }

    /* JADX INFO: renamed from: ۥ۟ */
    public static boolean m822() {
        try {
            return C0373r3.m1200("com.storm.wind.xposed.BuildConfig") != null;
        } catch (NoClassDefFoundError unused) {
            return false;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static String m1012() {
        Pattern patternCompile = Pattern.compile("/cache/(.*?)/");
        C0237h4.m1089("compile(...)", patternCompile);
        String str = AbstractC0306m3.f959;
        Matcher matcher = patternCompile.matcher(str);
        C0237h4.m1089("matcher(...)", matcher);
        C0375r5 c0375r5 = !matcher.find(0) ? null : new C0375r5(matcher, str);
        if (c0375r5 == null) {
            return "";
        }
        if (c0375r5.f1062 == null) {
            c0375r5.f1062 = new C0362q5(c0375r5);
        }
        C0362q5 c0362q5 = c0375r5.f1062;
        C0237h4.m865(c0362q5);
        return (String) c0362q5.get(1);
    }

    /* JADX INFO: renamed from: ۥ۟۠, reason: contains not printable characters */
    public static String m1013() {
        String strM1012 = m1012();
        return strM1012.length() > 0 ? strM1012 : m822() ? "XPatch" : m821() ? "SPatch" : m1015() ? "FPA" : m1014() ? "应用转生" : m1016() ? "太极" : "xposed";
    }

    /* JADX INFO: renamed from: ۥ۟ۡ, reason: contains not printable characters */
    public static boolean m1014() {
        try {
            return XposedHelpers.findClass("com.bug.load.ProxyApplication", C0292l3.m1137()) != null;
        } catch (Throwable unused) {
            return false;
        }
    }

    /* JADX INFO: renamed from: ۥ۟ۢ, reason: contains not printable characters */
    public static boolean m1015() {
        try {
            return XposedHelpers.findClass("fun.fpa.Helper", C0292l3.m1137()) != null;
        } catch (Throwable unused) {
            return false;
        }
    }

    /* JADX INFO: renamed from: ۥۣ۟, reason: contains not printable characters */
    public static boolean m1016() {
        try {
            return XposedHelpers.findClass("me.weishu.exposed.ExposedApplication", C0292l3.m1137()) != null;
        } catch (Throwable unused) {
            return false;
        }
    }

    /* JADX INFO: renamed from: ۥ۟ۤ, reason: contains not printable characters */
    public static void m1017() {
        StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
        C0237h4.m865(stackTrace);
        for (StackTraceElement stackTraceElement : stackTrace) {
        }
    }
}
