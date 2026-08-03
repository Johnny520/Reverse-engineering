package Yue;

import java.io.PrintStream;

/* JADX INFO: renamed from: Yue.ۥۣۢۥ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public final class C8157 {

    /* JADX INFO: renamed from: ۥ */
    public static C1446 f3263;

    /* JADX INFO: renamed from: ۥ۟ */
    public static boolean f3264;

    /* JADX INFO: renamed from: Yue.ۥۣۢۥ$ۥ۟ */
    public static final class C1446 extends SecurityManager {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public C1446() {
        }

        @Override // java.lang.SecurityManager
        public Class<?>[] getClassContext() {
            return super.getClassContext();
        }
    }

    /* JADX INFO: renamed from: ۥ */
    public static Class<?> m4182() {
        int i;
        C1446 c1446M4183 = m4183();
        if (c1446M4183 == null) {
            return null;
        }
        Class<?>[] classContext = c1446M4183.getClassContext();
        String name = C8157.class.getName();
        int i2 = 0;
        while (i2 < classContext.length && !name.equals(classContext[i2].getName())) {
            i2++;
        }
        if (i2 >= classContext.length || (i = i2 + 2) >= classContext.length) {
            throw new IllegalStateException("Failed to find org.slf4j.helpers.Util or its caller in the stack; this should not happen");
        }
        return classContext[i];
    }

    /* JADX INFO: renamed from: ۥ۟ */
    public static C1446 m4183() {
        C1446 c1446 = f3263;
        if (c1446 != null) {
            return c1446;
        }
        if (f3264) {
            return null;
        }
        C1446 c1446M26829 = m26829();
        f3263 = c1446M26829;
        f3264 = true;
        return c1446M26829;
    }

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static final void m26827(String str) {
        System.err.println("SLF4J: " + str);
    }

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public static final void m26828(String str, Throwable th) {
        PrintStream printStream = System.err;
        printStream.println(str);
        printStream.println("Reported exception:");
        th.printStackTrace();
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public static C1446 m26829() {
        try {
            return new C1446();
        } catch (SecurityException unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public static boolean m26830(String str) {
        String strM26831 = m26831(str);
        if (strM26831 == null) {
            return false;
        }
        return strM26831.equalsIgnoreCase("true");
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public static String m26831(String str) {
        if (str == null) {
            throw new IllegalArgumentException("null input");
        }
        try {
            return System.getProperty(str);
        } catch (SecurityException unused) {
            return null;
        }
    }
}
