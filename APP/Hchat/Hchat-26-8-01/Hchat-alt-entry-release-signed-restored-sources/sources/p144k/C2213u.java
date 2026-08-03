package p144k;

import gg.AbstractC1416l;
import p068eh.AbstractC0921a;
import p072f2.C1046i;
import p085fg.InterfaceC1220a;
import p187n.C2857k;
import p339x1.AbstractC5658x0;
import p356y0.AbstractC5852n;

/* JADX INFO: renamed from: k.u */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
final class C2213u extends AbstractC5658x0 {

    /* JADX INFO: renamed from: a */
    public final C2857k f7331a;

    /* JADX INFO: renamed from: b */
    public final InterfaceC2226y0 f7332b;

    /* JADX INFO: renamed from: c */
    public final boolean f7333c;

    /* JADX INFO: renamed from: d */
    public final boolean f7334d;

    /* JADX INFO: renamed from: e */
    public final String f7335e;

    /* JADX INFO: renamed from: f */
    public final C1046i f7336f;

    /* JADX INFO: renamed from: g */
    public final InterfaceC1220a f7337g;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C2213u(C2857k c2857k, InterfaceC2226y0 interfaceC2226y0, boolean z9, boolean z10, String str, C1046i c1046i, InterfaceC1220a interfaceC1220a) {
        this.f7331a = c2857k;
        this.f7332b = interfaceC2226y0;
        this.f7333c = z9;
        this.f7334d = z10;
        this.f7335e = str;
        this.f7336f = c1046i;
        this.f7337g = interfaceC1220a;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C2213u.class != obj.getClass()) {
            return false;
        }
        C2213u c2213u = (C2213u) obj;
        return AbstractC1416l.m3825a(this.f7331a, c2213u.f7331a) && AbstractC1416l.m3825a(this.f7332b, c2213u.f7332b) && this.f7333c == c2213u.f7333c && this.f7334d == c2213u.f7334d && AbstractC1416l.m3825a(this.f7335e, c2213u.f7335e) && AbstractC1416l.m3825a(this.f7336f, c2213u.f7336f) && this.f7337g == c2213u.f7337g;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p339x1.AbstractC5658x0
    /* JADX INFO: renamed from: f */
    public final AbstractC5852n mo740f() {
        return new C2219w(this.f7331a, this.f7332b, this.f7333c, this.f7334d, this.f7335e, this.f7336f, this.f7337g);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p339x1.AbstractC5658x0
    /* JADX INFO: renamed from: g */
    public final void mo741g(AbstractC5852n abstractC5852n) {
        ((C2219w) abstractC5852n).m5398z1(this.f7331a, this.f7332b, this.f7333c, this.f7334d, this.f7335e, this.f7336f, this.f7337g);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        C2857k c2857k = this.f7331a;
        int iHashCode = (c2857k != null ? c2857k.hashCode() : 0) * 31;
        InterfaceC2226y0 interfaceC2226y0 = this.f7332b;
        int iM2245h = AbstractC0921a.m2245h(AbstractC0921a.m2245h((iHashCode + (interfaceC2226y0 != null ? interfaceC2226y0.hashCode() : 0)) * 31, 31, this.f7333c), 31, this.f7334d);
        String str = this.f7335e;
        int iHashCode2 = (iM2245h + (str != null ? str.hashCode() : 0)) * 31;
        C1046i c1046i = this.f7336f;
        return this.f7337g.hashCode() + ((iHashCode2 + (c1046i != null ? Integer.hashCode(c1046i.f3287a) : 0)) * 31);
    }
}
