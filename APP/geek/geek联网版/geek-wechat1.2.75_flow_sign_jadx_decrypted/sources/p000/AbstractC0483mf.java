package p000;

/* JADX INFO: renamed from: mf */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0483mf {

    /* JADX INFO: renamed from: a */
    public static final InterfaceC0223fg f3131a;

    static {
        String property;
        InterfaceC0223fg interfaceC0223fg;
        int i = y50.f5358a;
        try {
            property = System.getProperty("kotlinx.coroutines.main.delay");
        } catch (SecurityException unused) {
            property = null;
        }
        if (property != null ? Boolean.parseBoolean(property) : false) {
            C0928yf c0928yf = AbstractC0929yg.f5430a;
            C0529no c0529no = AbstractC0607ps.f3752a;
            C0529no c0529no2 = c0529no.f3326e;
            interfaceC0223fg = c0529no;
            if (c0529no == null) {
                interfaceC0223fg = RunnableC0446lf.f2999i;
            }
        } else {
            interfaceC0223fg = RunnableC0446lf.f2999i;
        }
        f3131a = interfaceC0223fg;
    }
}
