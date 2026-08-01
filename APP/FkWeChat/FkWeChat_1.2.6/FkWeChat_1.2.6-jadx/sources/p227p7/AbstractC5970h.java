package p227p7;

import p024b9.AbstractC1052o0;
import p035c8.C1399a;
import p098g9.InterfaceC2549c;
import p098g9.InterfaceC2560n;
import p282t7.C8174a;

/* JADX INFO: renamed from: p7.h */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC5970h {

    /* JADX INFO: renamed from: a */
    public static final C8174a f18905a;

    static {
        InterfaceC2560n interfaceC2560nM3817l;
        InterfaceC2549c interfaceC2549cM3807b = AbstractC1052o0.m3807b(C1399a.class);
        try {
            interfaceC2560nM3817l = AbstractC1052o0.m3817l(C1399a.class);
        } catch (Throwable unused) {
            interfaceC2560nM3817l = null;
        }
        f18905a = new C8174a("ResponseTypeAttributeKey", new C1399a(interfaceC2549cM3807b, interfaceC2560nM3817l));
    }

    /* JADX INFO: renamed from: a */
    public static final C1399a m23967a(InterfaceC5963a interfaceC5963a) {
        interfaceC5963a.getClass();
        return (C1399a) interfaceC5963a.mo12263e().getAttributes().mo31832c(f18905a);
    }

    /* JADX INFO: renamed from: b */
    public static final void m23968b(InterfaceC5963a interfaceC5963a, C1399a c1399a) {
        interfaceC5963a.getClass();
        if (c1399a != null) {
            interfaceC5963a.mo12263e().getAttributes().mo31833d(f18905a, c1399a);
        } else {
            interfaceC5963a.mo12263e().getAttributes().mo31830a(f18905a);
        }
    }
}
