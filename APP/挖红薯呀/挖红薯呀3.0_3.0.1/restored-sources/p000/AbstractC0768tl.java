package p000;

/* JADX INFO: renamed from: tl */
/* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0768tl {

    /* JADX INFO: renamed from: a */
    public static final InterfaceC0657qm f6011a;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static {
        String property;
        InterfaceC0657qm interfaceC0657qm;
        int i = a61.f60a;
        try {
            property = System.getProperty("kotlinx.coroutines.main.delay");
        } catch (SecurityException unused) {
            property = null;
        }
        if (property != null ? Boolean.parseBoolean(property) : false) {
            C0436lm c0436lm = AbstractC0326io.f2592a;
            C0300hy c0300hy = ad0.f110a;
            C0300hy c0300hy2 = c0300hy.f2375i;
            interfaceC0657qm = c0300hy;
            if (c0300hy == null) {
                interfaceC0657qm = RunnableC0730sl.f5778o;
            }
        } else {
            interfaceC0657qm = RunnableC0730sl.f5778o;
        }
        f6011a = interfaceC0657qm;
    }
}
