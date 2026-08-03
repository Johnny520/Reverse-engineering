package p072f2;

import p222p.AbstractC3199a;

/* JADX INFO: renamed from: f2.d */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C1041d {

    /* JADX INFO: renamed from: a */
    public final int f3274a;

    /* JADX INFO: renamed from: b */
    public final int f3275b;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C1041d(int i9, int i10) {
        this.f3274a = i9;
        this.f3275b = i10;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1041d)) {
            return false;
        }
        C1041d c1041d = (C1041d) obj;
        return this.f3274a == c1041d.f3274a && this.f3275b == c1041d.f3275b;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return Integer.hashCode(this.f3275b) + (Integer.hashCode(this.f3274a) * 31);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("CollectionInfo(rowCount=");
        sb2.append(this.f3274a);
        sb2.append(", columnCount=");
        return AbstractC3199a.m6841n(sb2, this.f3275b, ')');
    }
}
