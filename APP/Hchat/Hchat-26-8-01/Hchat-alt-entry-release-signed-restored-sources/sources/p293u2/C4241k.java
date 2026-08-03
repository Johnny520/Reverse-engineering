package p293u2;

import p068eh.AbstractC0921a;
import p222p.AbstractC3199a;

/* JADX INFO: renamed from: u2.k */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C4241k {

    /* JADX INFO: renamed from: e */
    public static final C4241k f13913e = new C4241k(0, 0, 0, 0);

    /* JADX INFO: renamed from: a */
    public final int f13914a;

    /* JADX INFO: renamed from: b */
    public final int f13915b;

    /* JADX INFO: renamed from: c */
    public final int f13916c;

    /* JADX INFO: renamed from: d */
    public final int f13917d;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C4241k(int i9, int i10, int i11, int i12) {
        this.f13914a = i9;
        this.f13915b = i10;
        this.f13916c = i11;
        this.f13917d = i12;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public final int m8532a() {
        return this.f13917d - this.f13915b;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b */
    public final long m8533b() {
        return (((long) this.f13914a) << 32) | (((long) this.f13915b) & 4294967295L);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4241k)) {
            return false;
        }
        C4241k c4241k = (C4241k) obj;
        return this.f13914a == c4241k.f13914a && this.f13915b == c4241k.f13915b && this.f13916c == c4241k.f13916c && this.f13917d == c4241k.f13917d;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return Integer.hashCode(this.f13917d) + AbstractC0921a.m2242e(this.f13916c, AbstractC0921a.m2242e(this.f13915b, Integer.hashCode(this.f13914a) * 31, 31), 31);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("IntRect.fromLTRB(");
        sb2.append(this.f13914a);
        sb2.append(", ");
        sb2.append(this.f13915b);
        sb2.append(", ");
        sb2.append(this.f13916c);
        sb2.append(", ");
        return AbstractC3199a.m6841n(sb2, this.f13917d, ')');
    }
}
