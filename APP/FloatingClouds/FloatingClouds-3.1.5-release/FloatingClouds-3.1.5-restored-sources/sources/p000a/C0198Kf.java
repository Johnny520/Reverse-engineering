package p000a;

import java.util.List;

/* JADX INFO: renamed from: a.Kf */
/* JADX INFO: loaded from: classes.dex */
public final class C0198Kf {
    /* JADX INFO: renamed from: a */
    public static void m548a(Object obj) {
        if (obj != null) {
            if (obj instanceof InterfaceC0280P7) {
                if ((obj instanceof InterfaceC0298Q7 ? ((InterfaceC0298Q7) obj).mo145b() : obj instanceof InterfaceC0819s7 ? 0 : obj instanceof InterfaceC0064D7 ? 1 : obj instanceof InterfaceC0136H7 ? 2 : obj instanceof InterfaceC0154I7 ? 3 : obj instanceof InterfaceC0172J7 ? 4 : obj instanceof InterfaceC0190K7 ? 5 : obj instanceof InterfaceC0208L7 ? 6 : obj instanceof InterfaceC0226M7 ? 7 : obj instanceof InterfaceC0244N7 ? 8 : obj instanceof InterfaceC0262O7 ? 9 : obj instanceof InterfaceC0838t7 ? 10 : obj instanceof InterfaceC0857u7 ? 11 : obj instanceof InterfaceC0876v7 ? 12 : obj instanceof InterfaceC0895w7 ? 13 : obj instanceof InterfaceC0914x7 ? 14 : obj instanceof InterfaceC0933y7 ? 15 : obj instanceof InterfaceC0952z7 ? 16 : obj instanceof InterfaceC0008A7 ? 17 : obj instanceof InterfaceC0027B7 ? 18 : obj instanceof InterfaceC0046C7 ? 19 : obj instanceof InterfaceC0082E7 ? 20 : obj instanceof InterfaceC0100F7 ? 21 : obj instanceof InterfaceC0118G7 ? 22 : -1) == 2) {
                    return;
                }
            }
            m550c(obj, "kotlin.jvm.functions.Function2");
            throw null;
        }
    }

    /* JADX INFO: renamed from: b */
    public static boolean m549b(Object obj) {
        if (obj instanceof List) {
            return !(obj instanceof InterfaceC0783q9) || (obj instanceof InterfaceC0802r9);
        }
        return false;
    }

    /* JADX INFO: renamed from: c */
    public static void m550c(Object obj, String str) {
        ClassCastException classCastException = new ClassCastException((obj == null ? "null" : obj.getClass().getName()) + " cannot be cast to " + str);
        C0631i9.m1483f(classCastException, C0198Kf.class.getName());
        throw classCastException;
    }
}
