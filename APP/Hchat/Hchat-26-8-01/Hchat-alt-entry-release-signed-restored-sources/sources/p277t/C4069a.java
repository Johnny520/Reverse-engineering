package p277t;

import gg.AbstractC1416l;
import p339x1.AbstractC5658x0;
import p356y0.AbstractC5852n;

/* JADX INFO: renamed from: t.a */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
final class C4069a extends AbstractC5658x0 {

    /* JADX INFO: renamed from: a */
    public final C4071c f13493a;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C4069a(C4071c c4071c) {
        this.f13493a = c4071c;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C4069a) {
            return AbstractC1416l.m3825a(this.f13493a, ((C4069a) obj).f13493a);
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p339x1.AbstractC5658x0
    /* JADX INFO: renamed from: f */
    public final AbstractC5852n mo740f() {
        C4073e c4073e = new C4073e();
        c4073e.f13502u = this.f13493a;
        return c4073e;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p339x1.AbstractC5658x0
    /* JADX INFO: renamed from: g */
    public final void mo741g(AbstractC5852n abstractC5852n) {
        C4073e c4073e = (C4073e) abstractC5852n;
        C4071c c4071c = c4073e.f13502u;
        if (c4071c != null) {
            c4071c.f13501a.m5064j(c4073e);
        }
        C4071c c4071c2 = this.f13493a;
        if (c4071c2 != null) {
            c4071c2.f13501a.m5056b(c4073e);
        }
        c4073e.f13502u = c4071c2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return this.f13493a.hashCode();
    }
}
