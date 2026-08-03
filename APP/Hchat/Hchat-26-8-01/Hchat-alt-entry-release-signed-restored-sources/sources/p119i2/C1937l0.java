package p119i2;

import gg.AbstractC1416l;

/* JADX INFO: renamed from: i2.l0 */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C1937l0 {

    /* JADX INFO: renamed from: a */
    public final C1925f0 f6569a;

    /* JADX INFO: renamed from: b */
    public final C1925f0 f6570b;

    /* JADX INFO: renamed from: c */
    public final C1925f0 f6571c;

    /* JADX INFO: renamed from: d */
    public final C1925f0 f6572d;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C1937l0(C1925f0 c1925f0, C1925f0 c1925f02, C1925f0 c1925f03, C1925f0 c1925f04) {
        this.f6569a = c1925f0;
        this.f6570b = c1925f02;
        this.f6571c = c1925f03;
        this.f6572d = c1925f04;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof C1937l0)) {
            return false;
        }
        C1937l0 c1937l0 = (C1937l0) obj;
        return AbstractC1416l.m3825a(this.f6569a, c1937l0.f6569a) && AbstractC1416l.m3825a(this.f6570b, c1937l0.f6570b) && AbstractC1416l.m3825a(this.f6571c, c1937l0.f6571c) && AbstractC1416l.m3825a(this.f6572d, c1937l0.f6572d);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        C1925f0 c1925f0 = this.f6569a;
        int iHashCode = (c1925f0 != null ? c1925f0.hashCode() : 0) * 31;
        C1925f0 c1925f02 = this.f6570b;
        int iHashCode2 = (iHashCode + (c1925f02 != null ? c1925f02.hashCode() : 0)) * 31;
        C1925f0 c1925f03 = this.f6571c;
        int iHashCode3 = (iHashCode2 + (c1925f03 != null ? c1925f03.hashCode() : 0)) * 31;
        C1925f0 c1925f04 = this.f6572d;
        return iHashCode3 + (c1925f04 != null ? c1925f04.hashCode() : 0);
    }
}
