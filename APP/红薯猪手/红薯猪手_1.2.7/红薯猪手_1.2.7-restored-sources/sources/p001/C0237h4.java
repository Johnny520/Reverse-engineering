package p001;

import java.util.Arrays;

/* JADX INFO: renamed from: ۟.h4 */
/* JADX INFO: loaded from: classes.dex */
public final class C0237h4 {
    /* JADX INFO: renamed from: ۥ */
    public static boolean m864(Object obj, Object obj2) {
        return obj == null ? obj2 == null : obj.equals(obj2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: ۥ۟ */
    public static void m865(Object obj) {
        if (obj != null) {
            return;
        }
        NullPointerException nullPointerException = new NullPointerException();
        m1091(C0237h4.class.getName(), nullPointerException);
        throw nullPointerException;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static void m1088(String str, Object obj) {
        if (obj != null) {
            return;
        }
        NullPointerException nullPointerException = new NullPointerException(str);
        m1091(C0237h4.class.getName(), nullPointerException);
        throw nullPointerException;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: ۥ۟۠, reason: contains not printable characters */
    public static void m1089(String str, Object obj) {
        if (obj != null) {
            return;
        }
        NullPointerException nullPointerException = new NullPointerException(str + " must not be null");
        m1091(C0237h4.class.getName(), nullPointerException);
        throw nullPointerException;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: ۥ۟ۡ, reason: contains not printable characters */
    public static void m1090(String str, Object obj) {
        if (obj == null) {
            StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
            String name = C0237h4.class.getName();
            int i = 0;
            while (!stackTrace[i].getClassName().equals(name)) {
                i++;
            }
            while (stackTrace[i].getClassName().equals(name)) {
                i++;
            }
            StackTraceElement stackTraceElement = stackTrace[i];
            NullPointerException nullPointerException = new NullPointerException("Parameter specified as non-null is null: method " + stackTraceElement.getClassName() + "." + stackTraceElement.getMethodName() + ", parameter " + str);
            m1091(C0237h4.class.getName(), nullPointerException);
            throw nullPointerException;
        }
    }

    /* JADX INFO: renamed from: ۥ۟ۢ, reason: contains not printable characters */
    public static void m1091(String str, RuntimeException runtimeException) {
        StackTraceElement[] stackTrace = runtimeException.getStackTrace();
        int length = stackTrace.length;
        int i = -1;
        for (int i2 = 0; i2 < length; i2++) {
            if (str.equals(stackTrace[i2].getClassName())) {
                i = i2;
            }
        }
        runtimeException.setStackTrace((StackTraceElement[]) Arrays.copyOfRange(stackTrace, i + 1, length));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: ۥۣ۟, reason: contains not printable characters */
    public static void m1092(String str) {
        C0420ub c0420ub = new C0420ub("lateinit property " + str + " has not been initialized");
        m1091(C0237h4.class.getName(), c0420ub);
        throw c0420ub;
    }
}
