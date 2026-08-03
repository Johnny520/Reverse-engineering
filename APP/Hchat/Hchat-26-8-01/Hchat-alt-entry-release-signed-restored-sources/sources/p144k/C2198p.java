package p144k;

import gg.AbstractC1416l;
import p071f1.C0993b;
import p071f1.C1003g;
import p071f1.C1009j;
import p101h1.C1565b;

/* JADX INFO: renamed from: k.p */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C2198p {

    /* JADX INFO: renamed from: a */
    public C1003g f7287a = null;

    /* JADX INFO: renamed from: b */
    public C0993b f7288b = null;

    /* JADX INFO: renamed from: c */
    public C1565b f7289c = null;

    /* JADX INFO: renamed from: d */
    public C1009j f7290d = null;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2198p)) {
            return false;
        }
        C2198p c2198p = (C2198p) obj;
        return AbstractC1416l.m3825a(this.f7287a, c2198p.f7287a) && AbstractC1416l.m3825a(this.f7288b, c2198p.f7288b) && AbstractC1416l.m3825a(this.f7289c, c2198p.f7289c) && AbstractC1416l.m3825a(this.f7290d, c2198p.f7290d);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        C1003g c1003g = this.f7287a;
        int iHashCode = (c1003g == null ? 0 : c1003g.hashCode()) * 31;
        C0993b c0993b = this.f7288b;
        int iHashCode2 = (iHashCode + (c0993b == null ? 0 : c0993b.hashCode())) * 31;
        C1565b c1565b = this.f7289c;
        int iHashCode3 = (iHashCode2 + (c1565b == null ? 0 : c1565b.hashCode())) * 31;
        C1009j c1009j = this.f7290d;
        return iHashCode3 + (c1009j != null ? c1009j.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return "BorderCache(imageBitmap=" + this.f7287a + ", canvas=" + this.f7288b + ", canvasDrawScope=" + this.f7289c + ", borderPath=" + this.f7290d + ')';
    }
}
