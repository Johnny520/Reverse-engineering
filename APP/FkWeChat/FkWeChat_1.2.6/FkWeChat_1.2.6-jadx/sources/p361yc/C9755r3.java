package p361yc;

import p172l8.C4694f0;
import p172l8.C4696g0;
import p300uc.InterfaceC8647b;
import p345xc.InterfaceC9485c;
import p345xc.InterfaceC9486d;
import vc.AbstractC8920a;

/* JADX INFO: renamed from: yc.r3 */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
public final class C9755r3 extends AbstractC9744p2 implements InterfaceC8647b {

    /* JADX INFO: renamed from: c */
    public static final C9755r3 f33025c = new C9755r3();

    public C9755r3() {
        super(AbstractC8920a.m34228H(C4694f0.f13904r));
    }

    @Override // p361yc.AbstractC9744p2
    /* JADX INFO: renamed from: A */
    public /* bridge */ /* synthetic */ void mo37812A(InterfaceC9486d interfaceC9486d, Object obj, int i10) {
        m38041F(interfaceC9486d, ((C4696g0) obj).m18777z(), i10);
    }

    /* JADX INFO: renamed from: B */
    public int m38037B(short[] sArr) {
        sArr.getClass();
        return C4696g0.m18769t(sArr);
    }

    /* JADX INFO: renamed from: C */
    public short[] m38038C() {
        return C4696g0.m18763c(0);
    }

    @Override // p361yc.AbstractC9775w, p361yc.AbstractC9666a
    /* JADX INFO: renamed from: D, reason: merged with bridge method [inline-methods] */
    public void mo37792n(InterfaceC9485c interfaceC9485c, int i10, C9750q3 c9750q3, boolean z10) {
        interfaceC9485c.getClass();
        c9750q3.getClass();
        c9750q3.m38022e(C4694f0.m18757c(interfaceC9485c.mo36957q(mo15953a(), i10).mo866E()));
    }

    /* JADX INFO: renamed from: E */
    public C9750q3 m38040E(short[] sArr) {
        sArr.getClass();
        return new C9750q3(sArr, null);
    }

    /* JADX INFO: renamed from: F */
    public void m38041F(InterfaceC9486d interfaceC9486d, short[] sArr, int i10) {
        interfaceC9486d.getClass();
        sArr.getClass();
        for (int i11 = 0; i11 < i10; i11++) {
            interfaceC9486d.mo36970l(mo15953a(), i11).mo642i(C4696g0.m18768r(sArr, i11));
        }
    }

    @Override // p361yc.AbstractC9666a
    /* JADX INFO: renamed from: k */
    public /* bridge */ /* synthetic */ int mo37789k(Object obj) {
        return m38037B(((C4696g0) obj).m18777z());
    }

    @Override // p361yc.AbstractC9666a
    /* JADX INFO: renamed from: q */
    public /* bridge */ /* synthetic */ Object mo37794q(Object obj) {
        return m38040E(((C4696g0) obj).m18777z());
    }

    @Override // p361yc.AbstractC9744p2
    /* JADX INFO: renamed from: x */
    public /* bridge */ /* synthetic */ Object mo37818x() {
        return C4696g0.m18762a(m38038C());
    }
}
