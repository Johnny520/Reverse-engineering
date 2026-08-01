package p000;

/* JADX INFO: renamed from: of */
/* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0549of {

    /* JADX INFO: renamed from: a */
    public final String f4544a;

    /* JADX INFO: renamed from: b */
    public final long f4545b;

    /* JADX INFO: renamed from: c */
    public final int f4546c;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public AbstractC0549of(String str, long j, int i) {
        this.f4544a = str;
        this.f4545b = j;
        this.f4546c = i;
        if (str.length() == 0) {
            C0921xc.m5131l("The name of a color space cannot be null and must contain at least 1 character");
            throw null;
        }
        if (i < -1 || i > 63) {
            C0921xc.m5131l("The id must be between -1 and 63");
            throw null;
        }
    }

    /* JADX INFO: renamed from: a */
    public abstract float mo253a(int i);

    /* JADX INFO: renamed from: b */
    public abstract float mo254b(int i);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: c */
    public boolean mo2741c() {
        return false;
    }

    /* JADX INFO: renamed from: d */
    public abstract long mo255d(float f, float f2, float f3);

    /* JADX INFO: renamed from: e */
    public abstract float mo256e(float f, float f2, float f3);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        AbstractC0549of abstractC0549of = (AbstractC0549of) obj;
        if (this.f4546c == abstractC0549of.f4546c && this.f4544a.equals(abstractC0549of.f4544a)) {
            return rd0.m3487p(this.f4545b, abstractC0549of.f4545b);
        }
        return false;
    }

    /* JADX INFO: renamed from: f */
    public abstract long mo257f(float f, float f2, float f3, float f4, AbstractC0549of abstractC0549of);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public int hashCode() {
        return AbstractC0748t1.m4146d(this.f4545b, this.f4544a.hashCode() * 31, 31) + this.f4546c;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f4544a);
        sb.append(" (id=");
        sb.append(this.f4546c);
        sb.append(", model=");
        long j = this.f4545b;
        sb.append((Object) (rd0.m3487p(j, 12884901888L) ? "Rgb" : rd0.m3487p(j, 12884901889L) ? "Xyz" : rd0.m3487p(j, 12884901890L) ? "Lab" : rd0.m3487p(j, 17179869187L) ? "Cmyk" : "Unknown"));
        sb.append(')');
        return sb.toString();
    }
}
