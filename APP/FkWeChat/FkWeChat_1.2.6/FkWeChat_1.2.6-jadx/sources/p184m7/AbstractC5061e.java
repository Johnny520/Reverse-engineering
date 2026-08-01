package p184m7;

import p024b9.AbstractC1052o0;
import p035c8.C1399a;
import p055e.AbstractC1960a;
import p098g9.InterfaceC2549c;
import p098g9.InterfaceC2560n;
import p210o7.InterfaceC5652d;
import p281t6.InterfaceC8155k0;
import p282t7.C8174a;

/* JADX INFO: renamed from: m7.e */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC5061e {

    /* JADX INFO: renamed from: a */
    public static final C8174a f15369a;

    static {
        InterfaceC2560n interfaceC2560nM3817l;
        InterfaceC2549c interfaceC2549cM3807b = AbstractC1052o0.m3807b(AbstractC5060d.class);
        try {
            interfaceC2560nM3817l = AbstractC1052o0.m3817l(AbstractC5060d.class);
        } catch (Throwable unused) {
            interfaceC2560nM3817l = null;
        }
        f15369a = new C8174a("MutableOriginConnectionPointKey", new C1399a(interfaceC2549cM3807b, interfaceC2560nM3817l));
    }

    /* JADX INFO: renamed from: a */
    public static final InterfaceC8155k0 m20474a(InterfaceC5652d interfaceC5652d) {
        interfaceC5652d.getClass();
        AbstractC1960a.m7104a(interfaceC5652d.mo12243e().getAttributes().mo31832c(f15369a));
        return interfaceC5652d.mo7350h();
    }
}
