package p034c7;

import p024b9.AbstractC1052o0;
import p035c8.C1399a;
import p098g9.InterfaceC2549c;
import p098g9.InterfaceC2560n;
import p282t7.C8174a;

/* JADX INFO: renamed from: c7.i0 */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1370i0 {

    /* JADX INFO: renamed from: a */
    public static final C8174a f4062a;

    static {
        InterfaceC2560n interfaceC2560nM3817l;
        InterfaceC2549c interfaceC2549cM3807b = AbstractC1052o0.m3807b(C1399a.class);
        try {
            interfaceC2560nM3817l = AbstractC1052o0.m3817l(C1399a.class);
        } catch (Throwable unused) {
            interfaceC2560nM3817l = null;
        }
        f4062a = new C8174a("ReceiveType", new C1399a(interfaceC2549cM3807b, interfaceC2560nM3817l));
    }

    /* JADX INFO: renamed from: a */
    public static final C1399a m5403a(InterfaceC1355b interfaceC1355b) {
        interfaceC1355b.getClass();
        return (C1399a) interfaceC1355b.getAttributes().mo31834e(f4062a);
    }

    /* JADX INFO: renamed from: b */
    public static final boolean m5404b(InterfaceC1355b interfaceC1355b) {
        interfaceC1355b.getClass();
        return interfaceC1355b.mo5371k().mo12262d();
    }

    /* JADX INFO: renamed from: c */
    public static final void m5405c(InterfaceC1355b interfaceC1355b, C1399a c1399a) {
        interfaceC1355b.getClass();
        c1399a.getClass();
        interfaceC1355b.getAttributes().mo31833d(f4062a, c1399a);
    }
}
