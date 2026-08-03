package p024b9;

import p068eh.AbstractC0921a;

/* JADX INFO: renamed from: b9.d */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C0218d {

    /* JADX INFO: renamed from: a */
    public final long f532a;

    /* JADX INFO: renamed from: b */
    public final String f533b;

    /* JADX INFO: renamed from: c */
    public final int f534c;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C0218d(int i9, String str, long j3) {
        this.f532a = j3;
        this.f533b = str;
        this.f534c = i9;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0218d)) {
            return false;
        }
        C0218d c0218d = (C0218d) obj;
        return this.f532a == c0218d.f532a && this.f533b.equals(c0218d.f533b) && this.f534c == c0218d.f534c;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return Integer.hashCode(this.f534c) + AbstractC0921a.m2244g(Long.hashCode(this.f532a) * 31, 31, this.f533b);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return "BoundTime(createTime=" + this.f532a + ", nativeText=" + this.f533b + ", nativeVisibility=" + this.f534c + ")";
    }
}
