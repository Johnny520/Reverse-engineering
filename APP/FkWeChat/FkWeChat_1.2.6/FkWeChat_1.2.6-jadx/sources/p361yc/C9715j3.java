package p361yc;

import p024b9.C1031e;
import p172l8.C4718y;
import p300uc.InterfaceC8647b;
import p329wc.InterfaceC9218f;
import p345xc.InterfaceC9487e;
import p345xc.InterfaceC9488f;
import vc.AbstractC8920a;

/* JADX INFO: renamed from: yc.j3 */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
public final class C9715j3 implements InterfaceC8647b {

    /* JADX INFO: renamed from: a */
    public static final C9715j3 f32977a = new C9715j3();

    /* JADX INFO: renamed from: b */
    public static final InterfaceC9218f f32978b = AbstractC9762t0.m38055a("kotlin.UByte", AbstractC8920a.m34255w(C1031e.f3187a));

    @Override // p300uc.InterfaceC8647b, p300uc.InterfaceC8662p, p300uc.InterfaceC8645a
    /* JADX INFO: renamed from: a */
    public InterfaceC9218f mo15953a() {
        return f32978b;
    }

    @Override // p300uc.InterfaceC8662p
    /* JADX INFO: renamed from: b */
    public /* bridge */ /* synthetic */ void mo15954b(InterfaceC9488f interfaceC9488f, Object obj) {
        m37945h(interfaceC9488f, ((C4718y) obj).m18822k());
    }

    @Override // p300uc.InterfaceC8645a
    /* JADX INFO: renamed from: d */
    public /* bridge */ /* synthetic */ Object mo15956d(InterfaceC9487e interfaceC9487e) {
        return C4718y.m18816a(m37944g(interfaceC9487e));
    }

    /* JADX INFO: renamed from: g */
    public byte m37944g(InterfaceC9487e interfaceC9487e) {
        interfaceC9487e.getClass();
        return C4718y.m18817c(interfaceC9487e.mo659B(mo15953a()).mo869z());
    }

    /* JADX INFO: renamed from: h */
    public void m37945h(InterfaceC9488f interfaceC9488f, byte b10) {
        interfaceC9488f.getClass();
        interfaceC9488f.mo645m(mo15953a()).mo643j(b10);
    }
}
