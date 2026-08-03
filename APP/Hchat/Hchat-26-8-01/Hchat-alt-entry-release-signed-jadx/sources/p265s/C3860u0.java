package p265s;

import p085fg.InterfaceC1220a;
import p174m.EnumC2640p1;
import p251r.C3641z;

/* JADX INFO: renamed from: s.u0 */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C3860u0 implements InterfaceC1220a {

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ int f12651g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ C3864w0 f12652h;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ C3860u0(C3864w0 c3864w0, int i9) {
        this.f12651g = i9;
        this.f12652h = c3864w0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p085fg.InterfaceC1220a
    public final Object invoke() {
        switch (this.f12651g) {
            case 0:
                C3641z c3641z = this.f12652h.f12660v.f11680b;
                return Float.valueOf((c3641z.m7621h() * 500) + c3641z.m7622i());
            case 1:
                C3641z c3641z2 = this.f12652h.f12660v.f11680b;
                int iM7621h = c3641z2.m7621h();
                int iM7622i = c3641z2.m7622i();
                return Float.valueOf(c3641z2.mo5461d() ? (iM7621h * 500) + iM7622i + 100 : (iM7621h * 500) + iM7622i);
            default:
                C3864w0 c3864w0 = this.f12652h;
                C3641z c3641z3 = c3864w0.f12660v.f11680b;
                int iM7611b = (int) (c3641z3.m7623j().f11750o == EnumC2640p1.f8622g ? c3641z3.m7623j().m7611b() & 4294967295L : c3641z3.m7623j().m7611b() >> 32);
                C3641z c3641z4 = c3864w0.f12660v.f11680b;
                return Float.valueOf(iM7611b - ((-c3641z4.m7623j().f11747l) + c3641z4.m7623j().f11751p));
        }
    }
}
