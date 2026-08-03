package p305uh;

import gg.AbstractC1416l;
import p068eh.AbstractC0921a;
import p293u2.C4236f;

/* JADX INFO: renamed from: uh.b */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C4353b {

    /* JADX INFO: renamed from: a */
    public final float f14542a;

    /* JADX INFO: renamed from: b */
    public final float f14543b;

    /* JADX INFO: renamed from: c */
    public final C4352a f14544c;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static {
        new C4353b(C4352a.f14530g);
        new C4353b(C4352a.f14531h);
        new C4353b(C4352a.f14532i);
        new C4353b(C4352a.f14533j);
        new C4353b(C4352a.f14534k);
        new C4353b(C4352a.f14535l);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C4353b(float f3, float f10, C4352a c4352a) {
        c4352a.getClass();
        this.f14542a = f3;
        this.f14543b = f10;
        this.f14544c = c4352a;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public static C4353b m8798a(C4353b c4353b, float f3, C4352a c4352a, int i9) {
        float f10 = c4353b.f14542a;
        if ((i9 & 2) != 0) {
            f3 = c4353b.f14543b;
        }
        if ((i9 & 4) != 0) {
            c4352a = c4353b.f14544c;
        }
        c4353b.getClass();
        c4352a.getClass();
        return new C4353b(f10, f3, c4352a);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4353b)) {
            return false;
        }
        C4353b c4353b = (C4353b) obj;
        return C4236f.m8520b(this.f14542a, c4353b.f14542a) && Float.compare(this.f14543b, c4353b.f14543b) == 0 && AbstractC1416l.m3825a(this.f14544c, c4353b.f14544c);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return this.f14544c.hashCode() + AbstractC0921a.m2241d(this.f14543b, Float.hashCode(this.f14542a) * 31, 31);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return "Highlight(width=" + C4236f.m8521c(this.f14542a) + ", alpha=" + this.f14543b + ", style=" + this.f14544c + ")";
    }

    public C4353b(C4352a c4352a) {
        this((float) 0.8d, 1.0f, c4352a);
    }
}
