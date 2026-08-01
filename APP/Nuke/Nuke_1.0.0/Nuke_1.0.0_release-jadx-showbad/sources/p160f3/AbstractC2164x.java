package p160f3;

import p166g3.C2187d;
import p190k3.AbstractC2466n;
import p190k3.AbstractC2472t;
import p201m3.C2608e;

/* JADX INFO: renamed from: f3.x */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2164x {

    /* JADX INFO: renamed from: a */
    public static final InterfaceC2165y f7122a;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static {
        String property;
        InterfaceC2165y interfaceC2165y;
        int i5 = AbstractC2472t.f7960a;
        try {
            property = System.getProperty("kotlinx.coroutines.main.delay");
        } catch (SecurityException unused) {
            property = null;
        }
        if (property != null ? Boolean.parseBoolean(property) : false) {
            C2608e c2608e = AbstractC2100C.f7029a;
            C2187d c2187d = AbstractC2466n.f7954a;
            C2187d c2187d2 = c2187d.f7153i;
            interfaceC2165y = c2187d;
            if (c2187d == null) {
                interfaceC2165y = RunnableC2163w.f7120m;
            }
        } else {
            interfaceC2165y = RunnableC2163w.f7120m;
        }
        f7122a = interfaceC2165y;
    }
}
