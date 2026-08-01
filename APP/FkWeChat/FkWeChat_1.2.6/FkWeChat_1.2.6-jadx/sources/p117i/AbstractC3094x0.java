package p117i;

import java.util.List;
import p132j.AbstractC3492d;

/* JADX INFO: renamed from: i.x0 */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC3094x0 {

    /* JADX INFO: renamed from: a */
    public static final Object[] f8239a = new Object[0];

    /* JADX INFO: renamed from: b */
    public static final AbstractC3092w0 f8240b = new C3076o0(0);

    /* JADX INFO: renamed from: d */
    public static final void m11602d(List list, int i10) {
        int size = list.size();
        if (i10 < 0 || i10 >= size) {
            AbstractC3492d.m13017c("Index " + i10 + " is out of bounds. The list has " + size + " elements.");
        }
    }

    /* JADX INFO: renamed from: e */
    public static final void m11603e(List list, int i10, int i11) {
        int size = list.size();
        if (i10 > i11) {
            AbstractC3492d.m13015a("Indices are out of order. fromIndex (" + i10 + ") is greater than toIndex (" + i11 + ").");
        }
        if (i10 < 0) {
            AbstractC3492d.m13017c("fromIndex (" + i10 + ") is less than 0.");
        }
        if (i11 > size) {
            AbstractC3492d.m13017c("toIndex (" + i11 + ") is more than than the list size (" + size + ')');
        }
    }

    /* JADX INFO: renamed from: f */
    public static final AbstractC3092w0 m11604f() {
        AbstractC3092w0 abstractC3092w0 = f8240b;
        abstractC3092w0.getClass();
        return abstractC3092w0;
    }

    /* JADX INFO: renamed from: g */
    public static final C3076o0 m11605g(Object obj) {
        C3076o0 c3076o0 = new C3076o0(1);
        c3076o0.m11461n(obj);
        return c3076o0;
    }

    /* JADX INFO: renamed from: h */
    public static final C3076o0 m11606h(Object obj, Object obj2) {
        C3076o0 c3076o0 = new C3076o0(2);
        c3076o0.m11461n(obj);
        c3076o0.m11461n(obj2);
        return c3076o0;
    }
}
