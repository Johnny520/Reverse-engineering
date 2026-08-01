package p024b9;

import java.util.Collections;
import okhttp3.internal.url._UrlKt;
import p098g9.InterfaceC2549c;
import p098g9.InterfaceC2551e;
import p098g9.InterfaceC2552f;
import p098g9.InterfaceC2554h;
import p098g9.InterfaceC2555i;
import p098g9.InterfaceC2558l;
import p098g9.InterfaceC2559m;
import p098g9.InterfaceC2560n;
import p142j9.C3664c3;

/* JADX INFO: renamed from: b9.o0 */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1052o0 {

    /* JADX INFO: renamed from: a */
    public static final C1054p0 f3209a;

    /* JADX INFO: renamed from: b */
    public static final InterfaceC2549c[] f3210b;

    static {
        C1054p0 c1054p0 = null;
        try {
            c1054p0 = (C1054p0) C3664c3.class.newInstance();
        } catch (ClassCastException | ClassNotFoundException | IllegalAccessException | InstantiationException unused) {
        }
        if (c1054p0 == null) {
            c1054p0 = new C1054p0();
        }
        f3209a = c1054p0;
        f3210b = new InterfaceC2549c[0];
    }

    /* JADX INFO: renamed from: a */
    public static InterfaceC2552f m3806a(AbstractC1053p abstractC1053p) {
        return f3209a.mo3822a(abstractC1053p);
    }

    /* JADX INFO: renamed from: b */
    public static InterfaceC2549c m3807b(Class cls) {
        return f3209a.mo3823b(cls);
    }

    /* JADX INFO: renamed from: c */
    public static InterfaceC2551e m3808c(Class cls) {
        return f3209a.mo3824c(cls, _UrlKt.FRAGMENT_ENCODE_SET);
    }

    /* JADX INFO: renamed from: d */
    public static InterfaceC2554h m3809d(AbstractC1071y abstractC1071y) {
        return f3209a.mo3825d(abstractC1071y);
    }

    /* JADX INFO: renamed from: e */
    public static InterfaceC2555i m3810e(AbstractC1024a0 abstractC1024a0) {
        return f3209a.mo3826e(abstractC1024a0);
    }

    /* JADX INFO: renamed from: f */
    public static InterfaceC2560n m3811f(InterfaceC2560n interfaceC2560n) {
        return f3209a.mo3827f(interfaceC2560n);
    }

    /* JADX INFO: renamed from: g */
    public static InterfaceC2560n m3812g(Class cls) {
        return f3209a.mo3832k(m3807b(cls), Collections.EMPTY_LIST, true);
    }

    /* JADX INFO: renamed from: h */
    public static InterfaceC2558l m3813h(AbstractC1032e0 abstractC1032e0) {
        return f3209a.mo3828g(abstractC1032e0);
    }

    /* JADX INFO: renamed from: i */
    public static InterfaceC2559m m3814i(AbstractC1036g0 abstractC1036g0) {
        return f3209a.mo3829h(abstractC1036g0);
    }

    /* JADX INFO: renamed from: j */
    public static String m3815j(InterfaceC1051o interfaceC1051o) {
        return f3209a.mo3830i(interfaceC1051o);
    }

    /* JADX INFO: renamed from: k */
    public static String m3816k(AbstractC1067w abstractC1067w) {
        return f3209a.mo3831j(abstractC1067w);
    }

    /* JADX INFO: renamed from: l */
    public static InterfaceC2560n m3817l(Class cls) {
        return f3209a.mo3832k(m3807b(cls), Collections.EMPTY_LIST, false);
    }
}
