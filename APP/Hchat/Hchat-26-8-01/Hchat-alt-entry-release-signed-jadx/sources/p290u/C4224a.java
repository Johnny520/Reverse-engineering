package p290u;

import gg.AbstractC1416l;
import p068eh.AbstractC0921a;
import p072f2.C1046i;
import p085fg.InterfaceC1231l;
import p187n.C2857k;
import p339x1.AbstractC5618k;
import p339x1.AbstractC5658x0;
import p356y0.AbstractC5852n;

/* JADX INFO: renamed from: u.a */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
final class C4224a extends AbstractC5658x0 {

    /* JADX INFO: renamed from: a */
    public final boolean f13891a;

    /* JADX INFO: renamed from: b */
    public final C2857k f13892b;

    /* JADX INFO: renamed from: c */
    public final boolean f13893c;

    /* JADX INFO: renamed from: d */
    public final C1046i f13894d;

    /* JADX INFO: renamed from: e */
    public final InterfaceC1231l f13895e;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C4224a(C1046i c1046i, InterfaceC1231l interfaceC1231l, C2857k c2857k, boolean z9, boolean z10) {
        this.f13891a = z9;
        this.f13892b = c2857k;
        this.f13893c = z10;
        this.f13894d = c1046i;
        this.f13895e = interfaceC1231l;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C4224a.class != obj.getClass()) {
            return false;
        }
        C4224a c4224a = (C4224a) obj;
        return this.f13891a == c4224a.f13891a && AbstractC1416l.m3825a(this.f13892b, c4224a.f13892b) && this.f13893c == c4224a.f13893c && this.f13894d.equals(c4224a.f13894d) && this.f13895e == c4224a.f13895e;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p339x1.AbstractC5658x0
    /* JADX INFO: renamed from: f */
    public final AbstractC5852n mo740f() {
        return new C4227d(this.f13894d, this.f13895e, this.f13892b, this.f13891a, this.f13893c);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p339x1.AbstractC5658x0
    /* JADX INFO: renamed from: g */
    public final void mo741g(AbstractC5852n abstractC5852n) {
        C4227d c4227d = (C4227d) abstractC5852n;
        boolean z9 = c4227d.f13899T;
        boolean z10 = this.f13891a;
        if (z9 != z10) {
            c4227d.f13899T = z10;
            AbstractC5618k.m10158n(c4227d);
        }
        c4227d.f13900U = this.f13895e;
        c4227d.m5398z1(this.f13892b, null, true, this.f13893c, null, this.f13894d, c4227d.f13901V);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        int iHashCode = Boolean.hashCode(this.f13891a) * 31;
        C2857k c2857k = this.f13892b;
        return this.f13895e.hashCode() + AbstractC0921a.m2242e(this.f13894d.f3287a, AbstractC0921a.m2245h(AbstractC0921a.m2245h((iHashCode + (c2857k != null ? c2857k.hashCode() : 0)) * 961, 31, true), 31, this.f13893c), 31);
    }
}
