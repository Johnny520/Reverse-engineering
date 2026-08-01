package p361yc;

import p024b9.C1047m;
import p300uc.InterfaceC8647b;
import p345xc.InterfaceC9485c;
import p345xc.InterfaceC9486d;
import vc.AbstractC8920a;

/* JADX INFO: renamed from: yc.l0 */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
public final class C9722l0 extends AbstractC9744p2 implements InterfaceC8647b {

    /* JADX INFO: renamed from: c */
    public static final C9722l0 f32990c = new C9722l0();

    public C9722l0() {
        super(AbstractC8920a.m34258z(C1047m.f3206a));
    }

    @Override // p361yc.AbstractC9666a
    /* JADX INFO: renamed from: B, reason: merged with bridge method [inline-methods] */
    public int mo37789k(float[] fArr) {
        fArr.getClass();
        return fArr.length;
    }

    @Override // p361yc.AbstractC9744p2
    /* JADX INFO: renamed from: C, reason: merged with bridge method [inline-methods] */
    public float[] mo37818x() {
        return new float[0];
    }

    @Override // p361yc.AbstractC9775w, p361yc.AbstractC9666a
    /* JADX INFO: renamed from: D, reason: merged with bridge method [inline-methods] */
    public void mo37792n(InterfaceC9485c interfaceC9485c, int i10, C9717k0 c9717k0, boolean z10) {
        interfaceC9485c.getClass();
        c9717k0.getClass();
        c9717k0.m37951e(interfaceC9485c.mo36961u(mo15953a(), i10));
    }

    @Override // p361yc.AbstractC9666a
    /* JADX INFO: renamed from: E, reason: merged with bridge method [inline-methods] */
    public C9717k0 mo37794q(float[] fArr) {
        fArr.getClass();
        return new C9717k0(fArr);
    }

    @Override // p361yc.AbstractC9744p2
    /* JADX INFO: renamed from: F, reason: merged with bridge method [inline-methods] */
    public void mo37812A(InterfaceC9486d interfaceC9486d, float[] fArr, int i10) {
        interfaceC9486d.getClass();
        fArr.getClass();
        for (int i11 = 0; i11 < i10; i11++) {
            interfaceC9486d.mo36971n(mo15953a(), i11, fArr[i11]);
        }
    }
}
