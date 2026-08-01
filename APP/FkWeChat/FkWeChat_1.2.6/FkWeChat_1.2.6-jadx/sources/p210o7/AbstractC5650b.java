package p210o7;

import p024b9.AbstractC1052o0;
import p034c7.InterfaceC1355b;
import p035c8.C1399a;
import p098g9.InterfaceC2549c;
import p098g9.InterfaceC2560n;
import p282t7.C8174a;

/* JADX INFO: renamed from: o7.b */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC5650b {

    /* JADX INFO: renamed from: a */
    public static final C8174a f17777a;

    /* JADX INFO: renamed from: b */
    public static final C8174a f17778b;

    static {
        InterfaceC2560n interfaceC2560nM3817l;
        InterfaceC2549c interfaceC2549cM3807b = AbstractC1052o0.m3807b(Long.class);
        InterfaceC2560n interfaceC2560nM3817l2 = null;
        try {
            interfaceC2560nM3817l = AbstractC1052o0.m3817l(Long.TYPE);
        } catch (Throwable unused) {
            interfaceC2560nM3817l = null;
        }
        f17777a = new C8174a("FormFieldLimit", new C1399a(interfaceC2549cM3807b, interfaceC2560nM3817l));
        InterfaceC2549c interfaceC2549cM3807b2 = AbstractC1052o0.m3807b(C5654f.class);
        try {
            interfaceC2560nM3817l2 = AbstractC1052o0.m3817l(C5654f.class);
        } catch (Throwable unused2) {
        }
        f17778b = new C8174a("DoubleReceivePreventionToken", new C1399a(interfaceC2549cM3807b2, interfaceC2560nM3817l2));
    }

    /* JADX INFO: renamed from: a */
    public static final C8174a m22850a() {
        return f17778b;
    }

    /* JADX INFO: renamed from: b */
    public static final long m22851b(InterfaceC1355b interfaceC1355b) {
        interfaceC1355b.getClass();
        Long l10 = (Long) interfaceC1355b.getAttributes().mo31832c(f17777a);
        return l10 != null ? l10.longValue() : AbstractC5649a.m22849a();
    }
}
