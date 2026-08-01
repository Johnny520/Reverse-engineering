package p361yc;

import p172l8.C4718y;
import p172l8.C4719z;
import p300uc.InterfaceC8647b;
import p345xc.InterfaceC9485c;
import p345xc.InterfaceC9486d;
import vc.AbstractC8920a;

/* JADX INFO: renamed from: yc.i3 */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
public final class C9710i3 extends AbstractC9744p2 implements InterfaceC8647b {

    /* JADX INFO: renamed from: c */
    public static final C9710i3 f32960c = new C9710i3();

    public C9710i3() {
        super(AbstractC8920a.m34225E(C4718y.f13942r));
    }

    @Override // p361yc.AbstractC9744p2
    /* JADX INFO: renamed from: A */
    public /* bridge */ /* synthetic */ void mo37812A(InterfaceC9486d interfaceC9486d, Object obj, int i10) {
        m37928F(interfaceC9486d, ((C4719z) obj).m18838z(), i10);
    }

    /* JADX INFO: renamed from: B */
    public int m37924B(byte[] bArr) {
        bArr.getClass();
        return C4719z.m18830t(bArr);
    }

    /* JADX INFO: renamed from: C */
    public byte[] m37925C() {
        return C4719z.m18824c(0);
    }

    @Override // p361yc.AbstractC9775w, p361yc.AbstractC9666a
    /* JADX INFO: renamed from: D, reason: merged with bridge method [inline-methods] */
    public void mo37792n(InterfaceC9485c interfaceC9485c, int i10, C9705h3 c9705h3, boolean z10) {
        interfaceC9485c.getClass();
        c9705h3.getClass();
        c9705h3.m37914e(C4718y.m18817c(interfaceC9485c.mo36957q(mo15953a(), i10).mo869z()));
    }

    /* JADX INFO: renamed from: E */
    public C9705h3 m37927E(byte[] bArr) {
        bArr.getClass();
        return new C9705h3(bArr, null);
    }

    /* JADX INFO: renamed from: F */
    public void m37928F(InterfaceC9486d interfaceC9486d, byte[] bArr, int i10) {
        interfaceC9486d.getClass();
        bArr.getClass();
        for (int i11 = 0; i11 < i10; i11++) {
            interfaceC9486d.mo36970l(mo15953a(), i11).mo643j(C4719z.m18829r(bArr, i11));
        }
    }

    @Override // p361yc.AbstractC9666a
    /* JADX INFO: renamed from: k */
    public /* bridge */ /* synthetic */ int mo37789k(Object obj) {
        return m37924B(((C4719z) obj).m18838z());
    }

    @Override // p361yc.AbstractC9666a
    /* JADX INFO: renamed from: q */
    public /* bridge */ /* synthetic */ Object mo37794q(Object obj) {
        return m37927E(((C4719z) obj).m18838z());
    }

    @Override // p361yc.AbstractC9744p2
    /* JADX INFO: renamed from: x */
    public /* bridge */ /* synthetic */ Object mo37818x() {
        return C4719z.m18823a(m37925C());
    }
}
