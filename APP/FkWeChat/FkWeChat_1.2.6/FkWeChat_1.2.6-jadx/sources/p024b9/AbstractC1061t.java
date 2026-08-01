package p024b9;

import java.util.Arrays;
import p172l8.C4698h0;

/* JADX INFO: renamed from: b9.t */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1061t {

    /* JADX INFO: renamed from: b9.t$a */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static class a {
    }

    /* JADX INFO: renamed from: a */
    public static boolean m3840a(float f10, Float f11) {
        return f11 != null && f10 == f11.floatValue();
    }

    /* JADX INFO: renamed from: b */
    public static boolean m3841b(Float f10, float f11) {
        return f10 != null && f10.floatValue() == f11;
    }

    /* JADX INFO: renamed from: c */
    public static boolean m3842c(Object obj, Object obj2) {
        return obj == null ? obj2 == null : obj.equals(obj2);
    }

    /* JADX INFO: renamed from: d */
    public static int m3843d(int i10, int i11) {
        if (i10 < i11) {
            return -1;
        }
        return i10 == i11 ? 0 : 1;
    }

    /* JADX INFO: renamed from: e */
    public static int m3844e(long j10, long j11) {
        if (j10 < j11) {
            return -1;
        }
        return j10 == j11 ? 0 : 1;
    }

    /* JADX INFO: renamed from: f */
    public static void m3845f(int i10, String str) {
        m3848i();
    }

    /* JADX INFO: renamed from: g */
    public static Throwable m3846g(Throwable th) {
        return m3847h(th, AbstractC1061t.class.getName());
    }

    /* JADX INFO: renamed from: h */
    public static Throwable m3847h(Throwable th, String str) {
        StackTraceElement[] stackTrace = th.getStackTrace();
        int length = stackTrace.length;
        int i10 = -1;
        for (int i11 = 0; i11 < length; i11++) {
            if (str.equals(stackTrace[i11].getClassName())) {
                i10 = i11;
            }
        }
        th.setStackTrace((StackTraceElement[]) Arrays.copyOfRange(stackTrace, i10 + 1, length));
        return th;
    }

    /* JADX INFO: renamed from: i */
    public static void m3848i() {
        m3849j("This function has a reified type parameter and thus can only be inlined at compilation time, not called directly.");
    }

    /* JADX INFO: renamed from: j */
    public static void m3849j(String str) {
        throw new UnsupportedOperationException(str);
    }

    /* JADX INFO: renamed from: k */
    public static void m3850k(String str) {
        throw ((C4698h0) m3846g(new C4698h0(str)));
    }

    /* JADX INFO: renamed from: l */
    public static void m3851l(String str) {
        m3850k("lateinit property " + str + " has not been initialized");
    }
}
