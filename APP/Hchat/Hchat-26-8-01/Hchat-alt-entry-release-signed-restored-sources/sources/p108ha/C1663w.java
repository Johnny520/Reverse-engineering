package p108ha;

import gg.AbstractC1416l;

/* JADX INFO: renamed from: ha.w */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C1663w {

    /* JADX INFO: renamed from: a */
    public final int f5471a;

    /* JADX INFO: renamed from: b */
    public final Integer f5472b;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C1663w(Integer num, int i9) {
        this.f5471a = i9;
        this.f5472b = num;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1663w)) {
            return false;
        }
        C1663w c1663w = (C1663w) obj;
        return this.f5471a == c1663w.f5471a && AbstractC1416l.m3825a(this.f5472b, c1663w.f5472b);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        int iHashCode = Integer.hashCode(this.f5471a) * 31;
        Integer num = this.f5472b;
        return iHashCode + (num == null ? 0 : num.hashCode());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return "HiddenViewState(visibility=" + this.f5471a + ", height=" + this.f5472b + ")";
    }
}
