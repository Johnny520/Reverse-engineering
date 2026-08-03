package p089g1;

import p068eh.AbstractC0921a;
import p136j8.C2104o;

/* JADX INFO: renamed from: g1.c */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1274c {

    /* JADX INFO: renamed from: a */
    public final String f4231a;

    /* JADX INFO: renamed from: b */
    public final long f4232b;

    /* JADX INFO: renamed from: c */
    public final int f4233c;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public AbstractC1274c(int i9, String str, long j3) {
        this.f4231a = str;
        this.f4232b = j3;
        this.f4233c = i9;
        if (str.length() == 0) {
            C2104o.m5294t("The name of a color space cannot be null and must contain at least 1 character");
            throw null;
        }
        if (i9 < -1 || i9 > 63) {
            C2104o.m5294t("The id must be between -1 and 63");
            throw null;
        }
    }

    /* JADX INFO: renamed from: a */
    public abstract float mo3404a(int i9);

    /* JADX INFO: renamed from: b */
    public abstract float mo3405b(int i9);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: c */
    public boolean mo3406c() {
        return false;
    }

    /* JADX INFO: renamed from: d */
    public abstract long mo3407d(float f3, float f10, float f11);

    /* JADX INFO: renamed from: e */
    public abstract float mo3408e(float f3, float f10, float f11);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        AbstractC1274c abstractC1274c = (AbstractC1274c) obj;
        if (this.f4233c == abstractC1274c.f4233c && this.f4231a.equals(abstractC1274c.f4231a)) {
            return AbstractC1273b.m3403a(this.f4232b, abstractC1274c.f4232b);
        }
        return false;
    }

    /* JADX INFO: renamed from: f */
    public abstract long mo3409f(float f3, float f10, float f11, float f12, AbstractC1274c abstractC1274c);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public int hashCode() {
        int iHashCode = this.f4231a.hashCode() * 31;
        int i9 = AbstractC1273b.f4230e;
        return AbstractC0921a.m2243f(iHashCode, 31, this.f4232b) + this.f4233c;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f4231a);
        sb2.append(" (id=");
        sb2.append(this.f4233c);
        sb2.append(", model=");
        long j3 = AbstractC1273b.f4226a;
        long j4 = this.f4232b;
        sb2.append((Object) (AbstractC1273b.m3403a(j4, j3) ? "Rgb" : AbstractC1273b.m3403a(j4, AbstractC1273b.f4227b) ? "Xyz" : AbstractC1273b.m3403a(j4, AbstractC1273b.f4228c) ? "Lab" : AbstractC1273b.m3403a(j4, AbstractC1273b.f4229d) ? "Cmyk" : "Unknown"));
        sb2.append(')');
        return sb2.toString();
    }
}
