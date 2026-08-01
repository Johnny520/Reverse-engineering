package ec;

import p172l8.C4700i0;

/* JADX INFO: renamed from: ec.y1 */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
public class C2206y1 extends C2118c2 implements InterfaceC2208z {

    /* JADX INFO: renamed from: s */
    public final boolean f6033s;

    public C2206y1(InterfaceC2198w1 interfaceC2198w1) {
        super(true);
        m7703y0(interfaceC2198w1);
        this.f6033s = m7941g1();
    }

    /* JADX INFO: renamed from: g1 */
    public final boolean m7941g1() {
        C2118c2 c2118c2M7631v;
        InterfaceC2184t interfaceC2184tM7698o0 = m7698o0();
        C2188u c2188u = interfaceC2184tM7698o0 instanceof C2188u ? (C2188u) interfaceC2184tM7698o0 : null;
        if (c2188u != null && (c2118c2M7631v = c2188u.m7631v()) != null) {
            while (!c2118c2M7631v.mo7691i0()) {
                InterfaceC2184t interfaceC2184tM7698o02 = c2118c2M7631v.m7698o0();
                C2188u c2188u2 = interfaceC2184tM7698o02 instanceof C2188u ? (C2188u) interfaceC2184tM7698o02 : null;
                if (c2188u2 == null || (c2118c2M7631v = c2188u2.m7631v()) == null) {
                }
            }
            return true;
        }
        return false;
    }

    @Override // ec.C2118c2
    /* JADX INFO: renamed from: i0 */
    public boolean mo7691i0() {
        return this.f6033s;
    }

    @Override // ec.InterfaceC2208z
    /* JADX INFO: renamed from: j */
    public boolean mo7942j(Throwable th) {
        return m7655I0(new C2111b0(th, false, 2, null));
    }

    @Override // ec.C2118c2
    /* JADX INFO: renamed from: k0 */
    public boolean mo7692k0() {
        return true;
    }

    @Override // ec.InterfaceC2208z
    /* JADX INFO: renamed from: r0 */
    public boolean mo7943r0() {
        return m7655I0(C4700i0.f13910a);
    }
}
