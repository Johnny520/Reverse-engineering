package p361yc;

import p024b9.C1058r0;
import p172l8.C4694f0;
import p300uc.InterfaceC8647b;
import p329wc.InterfaceC9218f;
import p345xc.InterfaceC9487e;
import p345xc.InterfaceC9488f;
import vc.AbstractC8920a;

/* JADX INFO: renamed from: yc.s3 */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
public final class C9760s3 implements InterfaceC8647b {

    /* JADX INFO: renamed from: a */
    public static final C9760s3 f33031a = new C9760s3();

    /* JADX INFO: renamed from: b */
    public static final InterfaceC9218f f33032b = AbstractC9762t0.m38055a("kotlin.UShort", AbstractC8920a.m34223C(C1058r0.f3212a));

    @Override // p300uc.InterfaceC8647b, p300uc.InterfaceC8662p, p300uc.InterfaceC8645a
    /* JADX INFO: renamed from: a */
    public InterfaceC9218f mo15953a() {
        return f33032b;
    }

    @Override // p300uc.InterfaceC8662p
    /* JADX INFO: renamed from: b */
    public /* bridge */ /* synthetic */ void mo15954b(InterfaceC9488f interfaceC9488f, Object obj) {
        m38052h(interfaceC9488f, ((C4694f0) obj).m18761j());
    }

    @Override // p300uc.InterfaceC8645a
    /* JADX INFO: renamed from: d */
    public /* bridge */ /* synthetic */ Object mo15956d(InterfaceC9487e interfaceC9487e) {
        return C4694f0.m18756a(m38051g(interfaceC9487e));
    }

    /* JADX INFO: renamed from: g */
    public short m38051g(InterfaceC9487e interfaceC9487e) {
        interfaceC9487e.getClass();
        return C4694f0.m18757c(interfaceC9487e.mo659B(mo15953a()).mo866E());
    }

    /* JADX INFO: renamed from: h */
    public void m38052h(InterfaceC9488f interfaceC9488f, short s10) {
        interfaceC9488f.getClass();
        interfaceC9488f.mo645m(mo15953a()).mo642i(s10);
    }
}
