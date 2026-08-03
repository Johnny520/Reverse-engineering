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
                if (C0237h4.m864(stackTraceElement.getClassName(), C0341oa.m915(new byte[]{39, -46, -6, 100, -40, -102, 43, -49, -4, 100, -64, -114, 49, -55, -10, 38, -116, -79, 49, -45, -13, 37, -6, -65, 37, -47, -5, 40, -61, -97, 47}, new byte[]{68, -67, -105, 74, -94, -4}))) {
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
            return C0373r3.m1200(C0341oa.m915(new byte[]{-71, -20, 43, 74, -68, 80, -75, -15, 43, 74, -72, 77, -76, -25, 104, 28, -65, 75, -87, -26, 34, 74, -115, 81, -77, -17, 34, 39, -96, 74, -68, -22, 33}, new byte[]{-38, -125, 70, 100, -49, 36})) != null;
        } catch (NoClassDefFoundError unused) {
            return false;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static String m1012() {
        Pattern patternCompile = Pattern.compile(C0341oa.m915(new byte[]{71, -64, -7, 96, -37, 111, 71, -117, -74, 41, -116, 35, 71}, new byte[]{104, -93, -104, 3, -77, 10}));
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
        return strM1012.length() > 0 ? strM1012 : m822() ? C0341oa.m915(new byte[]{-46, -5, 96, 45, 110, 69}, new byte[]{-118, -85, 1, 89, 13, 45}) : m821() ? C0341oa.m915(new byte[]{-72, -113, 12, 38, -96, -42}, new byte[]{-21, -33, 109, 82, -61, -66}) : m1015() ? C0341oa.m915(new byte[]{20, -71, 26}, new byte[]{82, -23, 91, 4, 106, -36}) : m1014() ? C0341oa.m915(new byte[]{-103, -77, -38, 22, -99, -115, -108, -76, -30, 22, -99, -70}, new byte[]{124, 9, 78, -15, 9, 37}) : m1016() ? C0341oa.m915(new byte[]{-53, -38, -38, -12, 25, 117}, new byte[]{46, 126, 112, 18, -121, -12}) : C0341oa.m915(new byte[]{-40, 85, -39, -16, -94, 31}, new byte[]{-96, 37, -74, -125, -57, 123});
    }

    /* JADX INFO: renamed from: ۥ۟ۡ, reason: contains not printable characters */
    public static boolean m1014() {
        try {
            return XposedHelpers.findClass(C0341oa.m915(new byte[]{125, -19, -62, -26, -73, -34, 121, -84, -61, -89, -76, -49, 48, -46, -35, -89, -83, -46, 95, -14, -33, -92, -68, -56, 127, -10, -58, -89, -69}, new byte[]{30, -126, -81, -56, -43, -85}), C0292l3.m1137()) != null;
        } catch (Throwable unused) {
            return false;
        }
    }

    /* JADX INFO: renamed from: ۥ۟ۢ, reason: contains not printable characters */
    public static boolean m1015() {
        try {
            return XposedHelpers.findClass(C0341oa.m915(new byte[]{79, -75, 33, 114, 71, -101, 72, -18, 7, 57, 77, -101, 76, -78}, new byte[]{41, -64, 79, 92, 33, -21}), C0292l3.m1137()) != null;
        } catch (Throwable unused) {
            return false;
        }
    }

    /* JADX INFO: renamed from: ۥۣ۟, reason: contains not printable characters */
    public static boolean m1016() {
        try {
            return XposedHelpers.findClass(C0341oa.m915(new byte[]{74, 107, -102, -59, -28, 104, 84, 102, -63, -100, -28, 121, 87, 97, -57, -41, -27, 47, 98, 118, -60, -35, -14, 100, 67, 79, -60, -62, -19, 104, 68, 111, -64, -37, -18, 111}, new byte[]{39, 14, -76, -78, -127, 1}), C0292l3.m1137()) != null;
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
