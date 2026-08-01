package p361yc;

import p024b9.C1045l;
import p300uc.InterfaceC8647b;
import p345xc.InterfaceC9485c;
import p345xc.InterfaceC9486d;
import vc.AbstractC8920a;

/* JADX INFO: renamed from: yc.b0 */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
public final class C9672b0 extends AbstractC9744p2 implements InterfaceC8647b {

    /* JADX INFO: renamed from: c */
    public static final C9672b0 f32905c = new C9672b0();

    public C9672b0() {
        super(AbstractC8920a.m34257y(C1045l.f3204a));
    }

    @Override // p361yc.AbstractC9666a
    /* JADX INFO: renamed from: B, reason: merged with bridge method [inline-methods] */
    public int mo37789k(double[] dArr) {
        dArr.getClass();
        return dArr.length;
    }

    @Override // p361yc.AbstractC9744p2
    /* JADX INFO: renamed from: C, reason: merged with bridge method [inline-methods] */
    public double[] mo37818x() {
        return new double[0];
    }

    @Override // p361yc.AbstractC9775w, p361yc.AbstractC9666a
    /* JADX INFO: renamed from: D, reason: merged with bridge method [inline-methods] */
    public void mo37792n(InterfaceC9485c interfaceC9485c, int i10, C9667a0 c9667a0, boolean z10) {
        interfaceC9485c.getClass();
        c9667a0.getClass();
        c9667a0.m37799e(interfaceC9485c.mo36956o(mo15953a(), i10));
    }

    @Override // p361yc.AbstractC9666a
    /* JADX INFO: renamed from: E, reason: merged with bridge method [inline-methods] */
    public C9667a0 mo37794q(double[] dArr) {
        dArr.getClass();
        return new C9667a0(dArr);
    }

    @Override // p361yc.AbstractC9744p2
    /* JADX INFO: renamed from: F, reason: merged with bridge method [inline-methods] */
    public void mo37812A(InterfaceC9486d interfaceC9486d, double[] dArr, int i10) {
        interfaceC9486d.getClass();
        dArr.getClass();
        for (int i11 = 0; i11 < i10; i11++) {
            interfaceC9486d.mo36976x(mo15953a(), i11, dArr[i11]);
        }
    }
}
