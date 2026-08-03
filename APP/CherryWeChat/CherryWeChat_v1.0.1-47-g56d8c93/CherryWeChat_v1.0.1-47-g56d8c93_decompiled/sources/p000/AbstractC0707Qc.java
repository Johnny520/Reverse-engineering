package p000;

/* JADX INFO: renamed from: Qc */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0707Qc {

    /* JADX INFO: renamed from: a */
    public static final InterfaceC2413qd f2273a;

    static {
        String property;
        InterfaceC2413qd interfaceC2413qd;
        int i = AbstractC1356eA.f4858a;
        try {
            property = System.getProperty("kotlinx.coroutines.main.delay");
        } catch (SecurityException unused) {
            property = null;
        }
        if (property != null ? Boolean.parseBoolean(property) : false) {
            C1498hd c1498hd = AbstractC1499he.f5282a;
            C2283nk c2283nk = AbstractC1106Zp.f3500a;
            C2283nk c2283nk2 = c2283nk.f8019d;
            interfaceC2413qd = c2283nk;
            if (c2283nk == null) {
                interfaceC2413qd = RunnableC0664Pc.f2120h;
            }
        } else {
            interfaceC2413qd = RunnableC0664Pc.f2120h;
        }
        f2273a = interfaceC2413qd;
    }
}
