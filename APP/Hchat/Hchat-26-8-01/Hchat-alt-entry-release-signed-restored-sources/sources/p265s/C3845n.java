package p265s;

import gg.AbstractC1416l;
import p068eh.AbstractC0921a;
import p174m.C2581c;
import p174m.EnumC2640p1;
import p251r.C3622g;
import p339x1.AbstractC5658x0;
import p356y0.AbstractC5852n;

/* JADX INFO: renamed from: s.n */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
final class C3845n extends AbstractC5658x0 {

    /* JADX INFO: renamed from: a */
    public final C3622g f12584a;

    /* JADX INFO: renamed from: b */
    public final C2581c f12585b;

    /* JADX INFO: renamed from: c */
    public final EnumC2640p1 f12586c;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C3845n(C3622g c3622g, C2581c c2581c, EnumC2640p1 enumC2640p1) {
        this.f12584a = c3622g;
        this.f12585b = c2581c;
        this.f12586c = enumC2640p1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3845n)) {
            return false;
        }
        C3845n c3845n = (C3845n) obj;
        return AbstractC1416l.m3825a(this.f12584a, c3845n.f12584a) && AbstractC1416l.m3825a(this.f12585b, c3845n.f12585b) && this.f12586c == c3845n.f12586c;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p339x1.AbstractC5658x0
    /* JADX INFO: renamed from: f */
    public final AbstractC5852n mo740f() {
        C3853r c3853r = new C3853r();
        c3853r.f12617u = this.f12584a;
        c3853r.f12618v = this.f12585b;
        c3853r.f12619w = this.f12586c;
        return c3853r;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p339x1.AbstractC5658x0
    /* JADX INFO: renamed from: g */
    public final void mo741g(AbstractC5852n abstractC5852n) {
        C3853r c3853r = (C3853r) abstractC5852n;
        c3853r.f12617u = this.f12584a;
        c3853r.f12618v = this.f12585b;
        c3853r.f12619w = this.f12586c;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return this.f12586c.hashCode() + AbstractC0921a.m2245h((this.f12585b.hashCode() + (this.f12584a.hashCode() * 31)) * 31, 31, false);
    }
}
