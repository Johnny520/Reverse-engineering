package p116hf;

import p376zd.C9987e;

/* JADX INFO: renamed from: hf.r */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC3035r {
    /* JADX INFO: renamed from: a */
    public static boolean m11211a(String str) {
        String strM11212b = m11212b(str);
        if (strM11212b == null) {
            return false;
        }
        return strM11212b.equalsIgnoreCase("true");
    }

    /* JADX INFO: renamed from: b */
    public static String m11212b(String str) {
        if (str != null) {
            try {
                return System.getProperty(str);
            } catch (SecurityException unused) {
                return null;
            }
        }
        C9987e.m38645a("null input");
        return null;
    }
}
