package p144k;

import gg.AbstractC1416l;
import p068eh.AbstractC0921a;
import p174m.C2638p;
import p174m.EnumC2640p1;
import p174m.InterfaceC2613i2;
import p187n.C2857k;
import p339x1.AbstractC5658x0;
import p356y0.AbstractC5852n;

/* JADX INFO: renamed from: k.x1 */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
final class C2224x1 extends AbstractC5658x0 {

    /* JADX INFO: renamed from: a */
    public final InterfaceC2613i2 f7364a;

    /* JADX INFO: renamed from: b */
    public final EnumC2640p1 f7365b;

    /* JADX INFO: renamed from: c */
    public final boolean f7366c;

    /* JADX INFO: renamed from: d */
    public final C2638p f7367d;

    /* JADX INFO: renamed from: e */
    public final C2857k f7368e;

    /* JADX INFO: renamed from: f */
    public final boolean f7369f;

    /* JADX INFO: renamed from: g */
    public final InterfaceC2185k1 f7370g;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C2224x1(InterfaceC2185k1 interfaceC2185k1, C2638p c2638p, EnumC2640p1 enumC2640p1, InterfaceC2613i2 interfaceC2613i2, C2857k c2857k, boolean z9, boolean z10) {
        this.f7364a = interfaceC2613i2;
        this.f7365b = enumC2640p1;
        this.f7366c = z9;
        this.f7367d = c2638p;
        this.f7368e = c2857k;
        this.f7369f = z10;
        this.f7370g = interfaceC2185k1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C2224x1.class != obj.getClass()) {
            return false;
        }
        C2224x1 c2224x1 = (C2224x1) obj;
        return AbstractC1416l.m3825a(this.f7364a, c2224x1.f7364a) && this.f7365b == c2224x1.f7365b && this.f7366c == c2224x1.f7366c && AbstractC1416l.m3825a(this.f7367d, c2224x1.f7367d) && AbstractC1416l.m3825a(this.f7368e, c2224x1.f7368e) && this.f7369f == c2224x1.f7369f && AbstractC1416l.m3825a(this.f7370g, c2224x1.f7370g);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p339x1.AbstractC5658x0
    /* JADX INFO: renamed from: f */
    public final AbstractC5852n mo740f() {
        C2227y1 c2227y1 = new C2227y1();
        c2227y1.f7380w = this.f7364a;
        c2227y1.f7381x = this.f7365b;
        c2227y1.f7382y = this.f7366c;
        c2227y1.f7383z = this.f7367d;
        c2227y1.f7372A = this.f7368e;
        c2227y1.f7373B = this.f7369f;
        c2227y1.f7374C = this.f7370g;
        return c2227y1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p339x1.AbstractC5658x0
    /* JADX INFO: renamed from: g */
    public final void mo741g(AbstractC5852n abstractC5852n) {
        ((C2227y1) abstractC5852n).m5466p1(this.f7370g, this.f7367d, this.f7365b, this.f7364a, this.f7368e, this.f7369f, this.f7366c);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        int iM2245h = AbstractC0921a.m2245h(AbstractC0921a.m2245h((this.f7365b.hashCode() + (this.f7364a.hashCode() * 31)) * 31, 31, this.f7366c), 31, false);
        C2638p c2638p = this.f7367d;
        int iHashCode = (iM2245h + (c2638p != null ? c2638p.hashCode() : 0)) * 31;
        C2857k c2857k = this.f7368e;
        int iM2245h2 = AbstractC0921a.m2245h((iHashCode + (c2857k != null ? c2857k.hashCode() : 0)) * 961, 31, this.f7369f);
        InterfaceC2185k1 interfaceC2185k1 = this.f7370g;
        return iM2245h2 + (interfaceC2185k1 != null ? interfaceC2185k1.hashCode() : 0);
    }
}
