package p144k;

import android.view.View;
import gg.AbstractC1416l;
import p068eh.AbstractC0921a;
import p072f2.C1061x;
import p100h0.C1520g1;
import p100h0.C1523h1;
import p293u2.C4236f;
import p293u2.InterfaceC4233c;
import p339x1.AbstractC5618k;
import p339x1.AbstractC5658x0;
import p356y0.AbstractC5852n;

/* JADX INFO: renamed from: k.z0 */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C2229z0 extends AbstractC5658x0 {

    /* JADX INFO: renamed from: a */
    public final C1520g1 f7386a;

    /* JADX INFO: renamed from: b */
    public final C1523h1 f7387b;

    /* JADX INFO: renamed from: c */
    public final InterfaceC2197o1 f7388c;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C2229z0(C1520g1 c1520g1, C1523h1 c1523h1, InterfaceC2197o1 interfaceC2197o1) {
        this.f7386a = c1520g1;
        this.f7387b = c1523h1;
        this.f7388c = interfaceC2197o1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        return this == obj;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p339x1.AbstractC5658x0
    /* JADX INFO: renamed from: f */
    public final AbstractC5852n mo740f() {
        return new C2158b1(this.f7386a, this.f7387b, this.f7388c);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p339x1.AbstractC5658x0
    /* JADX INFO: renamed from: g */
    public final void mo741g(AbstractC5852n abstractC5852n) {
        C2158b1 c2158b1 = (C2158b1) abstractC5852n;
        c2158b1.getClass();
        InterfaceC2197o1 interfaceC2197o1 = c2158b1.f7150w;
        View view = c2158b1.f7151x;
        InterfaceC4233c interfaceC4233c = c2158b1.f7152y;
        c2158b1.f7148u = this.f7386a;
        c2158b1.f7149v = this.f7387b;
        InterfaceC2197o1 interfaceC2197o12 = this.f7388c;
        c2158b1.f7150w = interfaceC2197o12;
        View viewM10169y = AbstractC5618k.m10169y(c2158b1);
        InterfaceC4233c interfaceC4233c2 = AbstractC5618k.m10167w(c2158b1).f22771E;
        if (c2158b1.f7153z != null) {
            C1061x c1061x = AbstractC2161c1.f7163a;
            if (((!Float.isNaN(Float.NaN) || !Float.isNaN(Float.NaN)) && !interfaceC2197o12.mo5448a()) || !C4236f.m8520b(Float.NaN, Float.NaN) || !C4236f.m8520b(Float.NaN, Float.NaN) || !interfaceC2197o12.equals(interfaceC2197o1) || !viewM10169y.equals(view) || !AbstractC1416l.m3825a(interfaceC4233c2, interfaceC4233c)) {
                c2158b1.m5385l1();
            }
        }
        c2158b1.m5386m1();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return this.f7388c.hashCode() + ((this.f7387b.hashCode() + AbstractC0921a.m2245h(AbstractC0921a.m2241d(Float.NaN, AbstractC0921a.m2241d(Float.NaN, AbstractC0921a.m2243f(AbstractC0921a.m2245h(AbstractC0921a.m2241d(Float.NaN, this.f7386a.hashCode() * 961, 31), 31, true), 31, 9205357640488583168L), 31), 31), 31, true)) * 31);
    }
}
