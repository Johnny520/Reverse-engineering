package p222p;

import gg.AbstractC1416l;
import p068eh.AbstractC0921a;

/* JADX INFO: renamed from: p.c1 */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C3207c1 {

    /* JADX INFO: renamed from: a */
    public float f10243a = 0.0f;

    /* JADX INFO: renamed from: b */
    public boolean f10244b = true;

    /* JADX INFO: renamed from: c */
    public C3267x f10245c = null;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3207c1)) {
            return false;
        }
        C3207c1 c3207c1 = (C3207c1) obj;
        return Float.compare(this.f10243a, c3207c1.f10243a) == 0 && this.f10244b == c3207c1.f10244b && AbstractC1416l.m3825a(this.f10245c, c3207c1.f10245c);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        int iM2245h = AbstractC0921a.m2245h(Float.hashCode(this.f10243a) * 31, 31, this.f10244b);
        C3267x c3267x = this.f10245c;
        return (iM2245h + (c3267x == null ? 0 : c3267x.hashCode())) * 31;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return "RowColumnParentData(weight=" + this.f10243a + ", fill=" + this.f10244b + ", crossAxisAlignment=" + this.f10245c + ", flowLayoutData=null)";
    }
}
