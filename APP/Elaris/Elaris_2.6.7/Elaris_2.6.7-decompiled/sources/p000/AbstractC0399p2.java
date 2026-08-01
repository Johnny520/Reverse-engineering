package p000;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/* JADX INFO: renamed from: p2 */
/* JADX INFO: compiled from: r8-map-id-cb25a2bafef54619fff8cdac9d36ff56d89ce0d5459e21e33664152f938f1f39 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0399p2 {

    /* JADX INFO: renamed from: a */
    public static final ThreadLocal f694a = new ThreadLocal();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public static String m778a(long j, String str) {
        String strM779b = m779b(str);
        try {
            ThreadLocal threadLocal = f694a;
            C0356o2 c0356o2 = (C0356o2) threadLocal.get();
            if (c0356o2 == null || !strM779b.equals(c0356o2.f628a)) {
                c0356o2 = new C0356o2(strM779b, new SimpleDateFormat(strM779b, Locale.US));
                threadLocal.set(c0356o2);
            }
            return c0356o2.f629b.format(new Date(j));
        } catch (Throwable unused) {
            return new SimpleDateFormat("ah:mm", Locale.US).format(new Date(j));
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b */
    public static String m779b(String str) {
        String strTrim = str == null ? "" : str.trim();
        String strTrim2 = strTrim != null ? strTrim.trim() : "";
        if (strTrim2.length() == 0 || strTrim2.length() > 64) {
            return "ah:mm";
        }
        try {
            new SimpleDateFormat(strTrim2, Locale.US);
            return strTrim;
        } catch (IllegalArgumentException unused) {
            return "ah:mm";
        }
    }
}
