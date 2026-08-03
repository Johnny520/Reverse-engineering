package p144k;

import gg.AbstractC1416l;
import p068eh.AbstractC0921a;
import p085fg.InterfaceC1220a;
import p187n.C2857k;
import p267s1.C3906l0;
import p339x1.AbstractC5658x0;
import p356y0.AbstractC5852n;

/* JADX INFO: renamed from: k.z */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
final class C2228z extends AbstractC5658x0 {

    /* JADX INFO: renamed from: a */
    public final C2857k f7384a;

    /* JADX INFO: renamed from: b */
    public final InterfaceC1220a f7385b;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C2228z(InterfaceC1220a interfaceC1220a, C2857k c2857k) {
        this.f7384a = c2857k;
        this.f7385b = interfaceC1220a;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C2228z.class != obj.getClass()) {
            return false;
        }
        C2228z c2228z = (C2228z) obj;
        return AbstractC1416l.m3825a(this.f7384a, c2228z.f7384a) && this.f7385b == c2228z.f7385b;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p339x1.AbstractC5658x0
    /* JADX INFO: renamed from: f */
    public final AbstractC5852n mo740f() {
        return new C2157b0(this.f7385b, this.f7384a);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p339x1.AbstractC5658x0
    /* JADX INFO: renamed from: g */
    public final void mo741g(AbstractC5852n abstractC5852n) {
        C2157b0 c2157b0 = (C2157b0) abstractC5852n;
        c2157b0.getClass();
        boolean z9 = !c2157b0.f7190B;
        c2157b0.m5398z1(this.f7384a, null, false, true, null, null, this.f7385b);
        if (z9) {
            C3906l0 c3906l0 = c2157b0.f7194F;
            if (c3906l0 != null) {
                c3906l0.m8107m1();
            }
            c2157b0.m5373A1(false);
            c2157b0.m5373A1(true);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        C2857k c2857k = this.f7384a;
        return Boolean.hashCode(true) + ((this.f7385b.hashCode() + AbstractC0921a.m2245h(AbstractC0921a.m2245h((c2857k != null ? c2857k.hashCode() : 0) * 961, 31, false), 29791, true)) * 923521);
    }
}
