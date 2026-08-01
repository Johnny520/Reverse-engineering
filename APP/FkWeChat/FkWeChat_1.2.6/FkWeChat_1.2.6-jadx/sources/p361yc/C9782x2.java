package p361yc;

import p024b9.C1058r0;
import p300uc.InterfaceC8647b;
import p345xc.InterfaceC9485c;
import p345xc.InterfaceC9486d;
import vc.AbstractC8920a;

/* JADX INFO: renamed from: yc.x2 */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
public final class C9782x2 extends AbstractC9744p2 implements InterfaceC8647b {

    /* JADX INFO: renamed from: c */
    public static final C9782x2 f33067c = new C9782x2();

    public C9782x2() {
        super(AbstractC8920a.m34223C(C1058r0.f3212a));
    }

    @Override // p361yc.AbstractC9666a
    /* JADX INFO: renamed from: B, reason: merged with bridge method [inline-methods] */
    public int mo37789k(short[] sArr) {
        sArr.getClass();
        return sArr.length;
    }

    @Override // p361yc.AbstractC9744p2
    /* JADX INFO: renamed from: C, reason: merged with bridge method [inline-methods] */
    public short[] mo37818x() {
        return new short[0];
    }

    @Override // p361yc.AbstractC9775w, p361yc.AbstractC9666a
    /* JADX INFO: renamed from: D, reason: merged with bridge method [inline-methods] */
    public void mo37792n(InterfaceC9485c interfaceC9485c, int i10, C9778w2 c9778w2, boolean z10) {
        interfaceC9485c.getClass();
        c9778w2.getClass();
        c9778w2.m38075e(interfaceC9485c.mo36950H(mo15953a(), i10));
    }

    @Override // p361yc.AbstractC9666a
    /* JADX INFO: renamed from: E, reason: merged with bridge method [inline-methods] */
    public C9778w2 mo37794q(short[] sArr) {
        sArr.getClass();
        return new C9778w2(sArr);
    }

    @Override // p361yc.AbstractC9744p2
    /* JADX INFO: renamed from: F, reason: merged with bridge method [inline-methods] */
    public void mo37812A(InterfaceC9486d interfaceC9486d, short[] sArr, int i10) {
        interfaceC9486d.getClass();
        sArr.getClass();
        for (int i11 = 0; i11 < i10; i11++) {
            interfaceC9486d.mo36973t(mo15953a(), i11, sArr[i11]);
        }
    }
}
