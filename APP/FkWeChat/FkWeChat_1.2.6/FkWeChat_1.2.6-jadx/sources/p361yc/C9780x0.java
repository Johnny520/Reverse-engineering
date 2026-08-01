package p361yc;

import p300uc.InterfaceC8647b;
import p329wc.AbstractC9217e;
import p329wc.InterfaceC9218f;
import p345xc.InterfaceC9487e;
import p345xc.InterfaceC9488f;

/* JADX INFO: renamed from: yc.x0 */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
public final class C9780x0 implements InterfaceC8647b {

    /* JADX INFO: renamed from: a */
    public static final C9780x0 f33064a = new C9780x0();

    /* JADX INFO: renamed from: b */
    public static final InterfaceC9218f f33065b = new C9749q2("kotlin.Int", AbstractC9217e.f.f31461a);

    @Override // p300uc.InterfaceC8647b, p300uc.InterfaceC8662p, p300uc.InterfaceC8645a
    /* JADX INFO: renamed from: a */
    public InterfaceC9218f mo15953a() {
        return f33065b;
    }

    @Override // p300uc.InterfaceC8662p
    /* JADX INFO: renamed from: b */
    public /* bridge */ /* synthetic */ void mo15954b(InterfaceC9488f interfaceC9488f, Object obj) {
        m38080h(interfaceC9488f, ((Number) obj).intValue());
    }

    @Override // p300uc.InterfaceC8645a
    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public Integer mo15956d(InterfaceC9487e interfaceC9487e) {
        interfaceC9487e.getClass();
        return Integer.valueOf(interfaceC9487e.mo867i());
    }

    /* JADX INFO: renamed from: h */
    public void m38080h(InterfaceC9488f interfaceC9488f, int i10) {
        interfaceC9488f.getClass();
        interfaceC9488f.mo650z(i10);
    }
}
