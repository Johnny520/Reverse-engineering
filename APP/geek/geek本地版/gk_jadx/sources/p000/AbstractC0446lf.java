package p000;

/* JADX INFO: renamed from: lf */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0446lf {

    /* JADX INFO: renamed from: a */
    public static final InterfaceC0186eg f3047a;

    static {
        String property;
        InterfaceC0186eg interfaceC0186eg;
        int i = r50.f4212a;
        try {
            property = System.getProperty("kotlinx.coroutines.main.delay");
        } catch (SecurityException unused) {
            property = null;
        }
        if (property != null ? Boolean.parseBoolean(property) : false) {
            C0891xf c0891xf = AbstractC0855wg.f4964a;
            C0381jo c0381jo = AbstractC0459ls.f3102a;
            C0381jo c0381jo2 = c0381jo.f2653e;
            interfaceC0186eg = c0381jo;
            if (c0381jo == null) {
                interfaceC0186eg = RunnableC0409kf.f2886i;
            }
        } else {
            interfaceC0186eg = RunnableC0409kf.f2886i;
        }
        f3047a = interfaceC0186eg;
    }
}
