package p000a;

import java.util.Arrays;

/* JADX INFO: renamed from: a.i9 */
/* JADX INFO: loaded from: classes.dex */
public final class C0631i9 {
    /* JADX INFO: renamed from: a */
    public static boolean m1478a(Object obj, Object obj2) {
        return obj == null ? obj2 == null : obj.equals(obj2);
    }

    /* JADX INFO: renamed from: b */
    public static void m1479b(Object obj) {
        if (obj != null) {
            return;
        }
        NullPointerException nullPointerException = new NullPointerException();
        m1483f(nullPointerException, C0631i9.class.getName());
        throw nullPointerException;
    }

    /* JADX INFO: renamed from: c */
    public static void m1480c(Object obj, String str) {
        if (obj != null) {
            return;
        }
        NullPointerException nullPointerException = new NullPointerException(str);
        m1483f(nullPointerException, C0631i9.class.getName());
        throw nullPointerException;
    }

    /* JADX INFO: renamed from: d */
    public static void m1481d(Object obj, String str) {
        if (obj != null) {
            return;
        }
        NullPointerException nullPointerException = new NullPointerException(str.concat(" must not be null"));
        m1483f(nullPointerException, C0631i9.class.getName());
        throw nullPointerException;
    }

    /* JADX INFO: renamed from: e */
    public static void m1482e(Object obj, String str) {
        if (obj == null) {
            StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
            String name = C0631i9.class.getName();
            int i = 0;
            while (!stackTrace[i].getClassName().equals(name)) {
                i++;
            }
            while (stackTrace[i].getClassName().equals(name)) {
                i++;
            }
            StackTraceElement stackTraceElement = stackTrace[i];
            StringBuilder sbM2229i = C0944z.m2229i("Parameter specified as non-null is null: method ", stackTraceElement.getClassName(), ".", stackTraceElement.getMethodName(), ", parameter ");
            sbM2229i.append(str);
            NullPointerException nullPointerException = new NullPointerException(sbM2229i.toString());
            m1483f(nullPointerException, C0631i9.class.getName());
            throw nullPointerException;
        }
    }

    /* JADX INFO: renamed from: f */
    public static void m1483f(RuntimeException runtimeException, String str) {
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

    /* JADX INFO: renamed from: g */
    public static void m1484g(String str) {
        C0266Ob c0266Ob = new C0266Ob(C0944z.m2227g("lateinit property ", str, " has not been initialized"));
        m1483f(c0266Ob, C0631i9.class.getName());
        throw c0266Ob;
    }
}
