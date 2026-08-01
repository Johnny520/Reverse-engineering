package p361yc;

import p172l8.C4688c0;
import p172l8.C4690d0;
import p300uc.InterfaceC8647b;
import p345xc.InterfaceC9485c;
import p345xc.InterfaceC9486d;
import vc.AbstractC8920a;

/* JADX INFO: renamed from: yc.o3 */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
public final class C9740o3 extends AbstractC9744p2 implements InterfaceC8647b {

    /* JADX INFO: renamed from: c */
    public static final C9740o3 f33009c = new C9740o3();

    public C9740o3() {
        super(AbstractC8920a.m34227G(C4688c0.f13894r));
    }

    @Override // p361yc.AbstractC9744p2
    /* JADX INFO: renamed from: A */
    public /* bridge */ /* synthetic */ void mo37812A(InterfaceC9486d interfaceC9486d, Object obj, int i10) {
        m37995F(interfaceC9486d, ((C4690d0) obj).m18751z(), i10);
    }

    /* JADX INFO: renamed from: B */
    public int m37991B(long[] jArr) {
        jArr.getClass();
        return C4690d0.m18743t(jArr);
    }

    /* JADX INFO: renamed from: C */
    public long[] m37992C() {
        return C4690d0.m18737c(0);
    }

    @Override // p361yc.AbstractC9775w, p361yc.AbstractC9666a
    /* JADX INFO: renamed from: D, reason: merged with bridge method [inline-methods] */
    public void mo37792n(InterfaceC9485c interfaceC9485c, int i10, C9735n3 c9735n3, boolean z10) {
        interfaceC9485c.getClass();
        c9735n3.getClass();
        c9735n3.m37986e(C4688c0.m18729c(interfaceC9485c.mo36957q(mo15953a(), i10).mo868n()));
    }

    /* JADX INFO: renamed from: E */
    public C9735n3 m37994E(long[] jArr) {
        jArr.getClass();
        return new C9735n3(jArr, null);
    }

    /* JADX INFO: renamed from: F */
    public void m37995F(InterfaceC9486d interfaceC9486d, long[] jArr, int i10) {
        interfaceC9486d.getClass();
        jArr.getClass();
        for (int i11 = 0; i11 < i10; i11++) {
            interfaceC9486d.mo36970l(mo15953a(), i11).mo630A(C4690d0.m18742r(jArr, i11));
        }
    }

    @Override // p361yc.AbstractC9666a
    /* JADX INFO: renamed from: k */
    public /* bridge */ /* synthetic */ int mo37789k(Object obj) {
        return m37991B(((C4690d0) obj).m18751z());
    }

    @Override // p361yc.AbstractC9666a
    /* JADX INFO: renamed from: q */
    public /* bridge */ /* synthetic */ Object mo37794q(Object obj) {
        return m37994E(((C4690d0) obj).m18751z());
    }

    @Override // p361yc.AbstractC9744p2
    /* JADX INFO: renamed from: x */
    public /* bridge */ /* synthetic */ Object mo37818x() {
        return C4690d0.m18736a(m37992C());
    }
}
