package p361yc;

import p024b9.C1059s;
import p172l8.C4684a0;
import p300uc.InterfaceC8647b;
import p329wc.InterfaceC9218f;
import p345xc.InterfaceC9487e;
import p345xc.InterfaceC9488f;
import vc.AbstractC8920a;

/* JADX INFO: renamed from: yc.m3 */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
public final class C9730m3 implements InterfaceC8647b {

    /* JADX INFO: renamed from: a */
    public static final C9730m3 f33000a = new C9730m3();

    /* JADX INFO: renamed from: b */
    public static final InterfaceC9218f f33001b = AbstractC9762t0.m38055a("kotlin.UInt", AbstractC8920a.m34221A(C1059s.f3213a));

    @Override // p300uc.InterfaceC8647b, p300uc.InterfaceC8662p, p300uc.InterfaceC8645a
    /* JADX INFO: renamed from: a */
    public InterfaceC9218f mo15953a() {
        return f33001b;
    }

    @Override // p300uc.InterfaceC8662p
    /* JADX INFO: renamed from: b */
    public /* bridge */ /* synthetic */ void mo15954b(InterfaceC9488f interfaceC9488f, Object obj) {
        m37978h(interfaceC9488f, ((C4684a0) obj).m18707j());
    }

    @Override // p300uc.InterfaceC8645a
    /* JADX INFO: renamed from: d */
    public /* bridge */ /* synthetic */ Object mo15956d(InterfaceC9487e interfaceC9487e) {
        return C4684a0.m18702a(m37977g(interfaceC9487e));
    }

    /* JADX INFO: renamed from: g */
    public int m37977g(InterfaceC9487e interfaceC9487e) {
        interfaceC9487e.getClass();
        return C4684a0.m18703c(interfaceC9487e.mo659B(mo15953a()).mo867i());
    }

    /* JADX INFO: renamed from: h */
    public void m37978h(InterfaceC9488f interfaceC9488f, int i10) {
        interfaceC9488f.getClass();
        interfaceC9488f.mo645m(mo15953a()).mo650z(i10);
    }
}
