package Yue;

import java.util.Arrays;
import net.bytebuddy.pool.TypePool;

/* JADX INFO: renamed from: Yue.ۥ۠ۥۧ۠, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public class C5499 {

    /* JADX INFO: renamed from: Yue.ۥ۠ۥۧ۠$ۥ */
    @InterfaceC7470(version = "1.4")
    public static class C0779 {
    }

    @InterfaceC7470(version = "1.1")
    /* JADX INFO: renamed from: ۥ */
    public static boolean m2255(double d, Double d2) {
        return d2 != null && d == d2.doubleValue();
    }

    @InterfaceC7470(version = "1.1")
    /* JADX INFO: renamed from: ۥ۟ */
    public static boolean m2256(float f, Float f2) {
        return f2 != null && f == f2.floatValue();
    }

    @InterfaceC7470(version = "1.1")
    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static boolean m17090(Double d, double d2) {
        return d != null && d.doubleValue() == d2;
    }

    @InterfaceC7470(version = "1.1")
    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public static boolean m17091(Double d, Double d2) {
        if (d == null) {
            if (d2 != null) {
                return false;
            }
        } else if (d2 == null || d.doubleValue() != d2.doubleValue()) {
            return false;
        }
        return true;
    }

    @InterfaceC7470(version = "1.1")
    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public static boolean m17092(Float f, float f2) {
        return f != null && f.floatValue() == f2;
    }

    @InterfaceC7470(version = "1.1")
    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public static boolean m17093(Float f, Float f2) {
        if (f == null) {
            if (f2 != null) {
                return false;
            }
        } else if (f2 == null || f.floatValue() != f2.floatValue()) {
            return false;
        }
        return true;
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public static boolean m17094(Object obj, Object obj2) {
        return obj == null ? obj2 == null : obj.equals(obj2);
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public static void m17095(Object obj, String str) {
        if (obj != null) {
            return;
        }
        throw ((IllegalStateException) m17114(new IllegalStateException(str + " must not be null")));
    }

    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public static void m17096(Object obj, String str) {
        if (obj == null) {
            throw ((IllegalStateException) m17114(new IllegalStateException(str)));
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
    public static void m17097(Object obj, String str, String str2) {
        if (obj != null) {
            return;
        }
        throw ((IllegalStateException) m17114(new IllegalStateException("Field specified as non-null is null: " + str + "." + str2)));
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
    public static void m17098(String str) throws ClassNotFoundException {
        String strReplace = str.replace('/', TypePool.Default.LazyTypeDescription.GenericTypeToken.INNER_CLASS_PATH);
        try {
            Class.forName(strReplace);
        } catch (ClassNotFoundException e) {
            throw ((ClassNotFoundException) m17114(new ClassNotFoundException("Class " + strReplace + " is not found. Please update the Kotlin runtime to the latest version", e)));
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۦ, reason: contains not printable characters */
    public static void m17099(String str, String str2) throws ClassNotFoundException {
        String strReplace = str.replace('/', TypePool.Default.LazyTypeDescription.GenericTypeToken.INNER_CLASS_PATH);
        try {
            Class.forName(strReplace);
        } catch (ClassNotFoundException e) {
            throw ((ClassNotFoundException) m17114(new ClassNotFoundException("Class " + strReplace + " is not found: this code requires the Kotlin runtime of version at least " + str2, e)));
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۧ, reason: contains not printable characters */
    public static void m17100(Object obj) {
        if (obj == null) {
            m17123();
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۨ, reason: contains not printable characters */
    public static void m17101(Object obj, String str) {
        if (obj == null) {
            m17124(str);
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟۠, reason: contains not printable characters */
    public static void m17102(Object obj, String str) {
        if (obj != null) {
            return;
        }
        throw ((NullPointerException) m17114(new NullPointerException(str + " must not be null")));
    }

    /* JADX INFO: renamed from: ۥ۟۟۠۟, reason: contains not printable characters */
    public static void m17103(Object obj, String str) {
        if (obj == null) {
            m17128(str);
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟۠۠, reason: contains not printable characters */
    public static void m17104(Object obj, String str) {
        if (obj == null) {
            m17127(str);
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۡ, reason: contains not printable characters */
    public static void m17105(Object obj, String str) {
        if (obj == null) {
            throw ((IllegalStateException) m17114(new IllegalStateException(str)));
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۢ, reason: contains not printable characters */
    public static void m17106(Object obj, String str, String str2) {
        if (obj != null) {
            return;
        }
        throw ((IllegalStateException) m17114(new IllegalStateException("Method specified as non-null returned null: " + str + "." + str2)));
    }

    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    public static int m17107(int i, int i2) {
        if (i < i2) {
            return -1;
        }
        return i == i2 ? 0 : 1;
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
    public static int m17108(long j, long j2) {
        if (j < j2) {
            return -1;
        }
        return j == j2 ? 0 : 1;
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
    public static String m17109(String str) {
        StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
        String name = C5499.class.getName();
        int i = 0;
        while (!stackTrace[i].getClassName().equals(name)) {
            i++;
        }
        while (stackTrace[i].getClassName().equals(name)) {
            i++;
        }
        StackTraceElement stackTraceElement = stackTrace[i];
        return "Parameter specified as non-null is null: method " + stackTraceElement.getClassName() + "." + stackTraceElement.getMethodName() + ", parameter " + str;
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
    public static void m17110() {
        m17129();
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۧ, reason: contains not printable characters */
    public static void m17111(String str) {
        m17130(str);
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۨ, reason: contains not printable characters */
    public static void m17112(int i, String str) {
        m17129();
    }

    /* JADX INFO: renamed from: ۥ۟۟ۡ, reason: contains not printable characters */
    public static void m17113(int i, String str, String str2) {
        m17130(str2);
    }

    /* JADX INFO: renamed from: ۥ۟۟ۡ۟, reason: contains not printable characters */
    public static <T extends Throwable> T m17114(T t) {
        return (T) m17115(t, C5499.class.getName());
    }

    /* JADX INFO: renamed from: ۥ۟۟ۡ۠, reason: contains not printable characters */
    public static <T extends Throwable> T m17115(T t, String str) {
        StackTraceElement[] stackTrace = t.getStackTrace();
        int length = stackTrace.length;
        int i = -1;
        for (int i2 = 0; i2 < length; i2++) {
            if (str.equals(stackTrace[i2].getClassName())) {
                i = i2;
            }
        }
        t.setStackTrace((StackTraceElement[]) Arrays.copyOfRange(stackTrace, i + 1, length));
        return t;
    }

    /* JADX INFO: renamed from: ۥ۟۟ۡۡ, reason: contains not printable characters */
    public static String m17116(String str, Object obj) {
        return str + obj;
    }

    /* JADX INFO: renamed from: ۥ۟۟ۡۢ, reason: contains not printable characters */
    public static void m17117() {
        throw ((AssertionError) m17114(new AssertionError()));
    }

    /* JADX INFO: renamed from: ۥۣ۟۟ۡ, reason: contains not printable characters */
    public static void m17118(String str) {
        throw ((AssertionError) m17114(new AssertionError(str)));
    }

    /* JADX INFO: renamed from: ۥ۟۟ۡۤ, reason: contains not printable characters */
    public static void m17119() {
        throw ((IllegalArgumentException) m17114(new IllegalArgumentException()));
    }

    /* JADX INFO: renamed from: ۥ۟۟ۡۥ, reason: contains not printable characters */
    public static void m17120(String str) {
        throw ((IllegalArgumentException) m17114(new IllegalArgumentException(str)));
    }

    /* JADX INFO: renamed from: ۥ۟۟ۡۦ, reason: contains not printable characters */
    public static void m17121() {
        throw ((IllegalStateException) m17114(new IllegalStateException()));
    }

    /* JADX INFO: renamed from: ۥ۟۟ۡۧ, reason: contains not printable characters */
    public static void m17122(String str) {
        throw ((IllegalStateException) m17114(new IllegalStateException(str)));
    }

    @InterfaceC7470(version = "1.4")
    /* JADX INFO: renamed from: ۥ۟۟ۡۨ, reason: contains not printable characters */
    public static void m17123() {
        throw ((NullPointerException) m17114(new NullPointerException()));
    }

    @InterfaceC7470(version = "1.4")
    /* JADX INFO: renamed from: ۥ۟۟ۢ, reason: contains not printable characters */
    public static void m17124(String str) {
        throw ((NullPointerException) m17114(new NullPointerException(str)));
    }

    /* JADX INFO: renamed from: ۥ۟۟ۢ۟, reason: contains not printable characters */
    public static void m17125() {
        throw ((C5668) m17114(new C5668()));
    }

    /* JADX INFO: renamed from: ۥ۟۟ۢ۠, reason: contains not printable characters */
    public static void m17126(String str) {
        throw ((C5668) m17114(new C5668(str)));
    }

    /* JADX INFO: renamed from: ۥ۟۟ۢۡ, reason: contains not printable characters */
    public static void m17127(String str) {
        throw ((IllegalArgumentException) m17114(new IllegalArgumentException(m17109(str))));
    }

    /* JADX INFO: renamed from: ۥ۟۟ۢۢ, reason: contains not printable characters */
    public static void m17128(String str) {
        throw ((NullPointerException) m17114(new NullPointerException(m17109(str))));
    }

    /* JADX INFO: renamed from: ۥۣ۟۟ۢ, reason: contains not printable characters */
    public static void m17129() {
        m17130("This function has a reified type parameter and thus can only be inlined at compilation time, not called directly.");
    }

    /* JADX INFO: renamed from: ۥ۟۟ۢۤ, reason: contains not printable characters */
    public static void m17130(String str) {
        throw new UnsupportedOperationException(str);
    }

    /* JADX INFO: renamed from: ۥ۟۟ۢۥ, reason: contains not printable characters */
    public static void m17131(String str) {
        throw ((C8105) m17114(new C8105(str)));
    }

    /* JADX INFO: renamed from: ۥ۟۟ۢۦ, reason: contains not printable characters */
    public static void m17132(String str) {
        m17131("lateinit property " + str + " has not been initialized");
    }
}
