package p361yc;

import p010a9.InterfaceC0184l;
import p010a9.InterfaceC0188p;

/* JADX INFO: renamed from: yc.o */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC9736o {

    /* JADX INFO: renamed from: a */
    public static final boolean f33006a;

    static {
        boolean z10;
        try {
            Class.forName("java.lang.ClassValue");
            z10 = true;
        } catch (Throwable unused) {
            z10 = false;
        }
        f33006a = z10;
    }

    /* JADX INFO: renamed from: a */
    public static final InterfaceC9774v2 m37988a(InterfaceC0184l interfaceC0184l) {
        interfaceC0184l.getClass();
        return f33006a ? new C9761t(interfaceC0184l) : new C9783y(interfaceC0184l);
    }

    /* JADX INFO: renamed from: b */
    public static final InterfaceC9679c2 m37989b(InterfaceC0188p interfaceC0188p) {
        interfaceC0188p.getClass();
        return f33006a ? new C9766u(interfaceC0188p) : new C9787z(interfaceC0188p);
    }
}
