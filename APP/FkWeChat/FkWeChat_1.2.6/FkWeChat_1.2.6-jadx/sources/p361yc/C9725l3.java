package p361yc;

import p172l8.C4684a0;
import p172l8.C4686b0;
import p300uc.InterfaceC8647b;
import p345xc.InterfaceC9485c;
import p345xc.InterfaceC9486d;
import vc.AbstractC8920a;

/* JADX INFO: renamed from: yc.l3 */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
public final class C9725l3 extends AbstractC9744p2 implements InterfaceC8647b {

    /* JADX INFO: renamed from: c */
    public static final C9725l3 f32991c = new C9725l3();

    public C9725l3() {
        super(AbstractC8920a.m34226F(C4684a0.f13888r));
    }

    @Override // p361yc.AbstractC9744p2
    /* JADX INFO: renamed from: A */
    public /* bridge */ /* synthetic */ void mo37812A(InterfaceC9486d interfaceC9486d, Object obj, int i10) {
        m37974F(interfaceC9486d, ((C4686b0) obj).m18725z(), i10);
    }

    /* JADX INFO: renamed from: B */
    public int m37970B(int[] iArr) {
        iArr.getClass();
        return C4686b0.m18717t(iArr);
    }

    /* JADX INFO: renamed from: C */
    public int[] m37971C() {
        return C4686b0.m18711c(0);
    }

    @Override // p361yc.AbstractC9775w, p361yc.AbstractC9666a
    /* JADX INFO: renamed from: D, reason: merged with bridge method [inline-methods] */
    public void mo37792n(InterfaceC9485c interfaceC9485c, int i10, C9720k3 c9720k3, boolean z10) {
        interfaceC9485c.getClass();
        c9720k3.getClass();
        c9720k3.m37957e(C4684a0.m18703c(interfaceC9485c.mo36957q(mo15953a(), i10).mo867i()));
    }

    /* JADX INFO: renamed from: E */
    public C9720k3 m37973E(int[] iArr) {
        iArr.getClass();
        return new C9720k3(iArr, null);
    }

    /* JADX INFO: renamed from: F */
    public void m37974F(InterfaceC9486d interfaceC9486d, int[] iArr, int i10) {
        interfaceC9486d.getClass();
        iArr.getClass();
        for (int i11 = 0; i11 < i10; i11++) {
            interfaceC9486d.mo36970l(mo15953a(), i11).mo650z(C4686b0.m18716r(iArr, i11));
        }
    }

    @Override // p361yc.AbstractC9666a
    /* JADX INFO: renamed from: k */
    public /* bridge */ /* synthetic */ int mo37789k(Object obj) {
        return m37970B(((C4686b0) obj).m18725z());
    }

    @Override // p361yc.AbstractC9666a
    /* JADX INFO: renamed from: q */
    public /* bridge */ /* synthetic */ Object mo37794q(Object obj) {
        return m37973E(((C4686b0) obj).m18725z());
    }

    @Override // p361yc.AbstractC9744p2
    /* JADX INFO: renamed from: x */
    public /* bridge */ /* synthetic */ Object mo37818x() {
        return C4686b0.m18710a(m37971C());
    }
}
