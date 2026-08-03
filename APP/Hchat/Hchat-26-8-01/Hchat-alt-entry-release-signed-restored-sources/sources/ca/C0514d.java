package ca;

import p068eh.AbstractC0921a;

/* JADX INFO: renamed from: ca.d */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C0514d {

    /* JADX INFO: renamed from: a */
    public final int f1568a;

    /* JADX INFO: renamed from: b */
    public final int f1569b;

    /* JADX INFO: renamed from: c */
    public final int f1570c;

    /* JADX INFO: renamed from: d */
    public final long f1571d;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C0514d(int i9, int i10, long j3, int i11) {
        this.f1568a = i9;
        this.f1569b = i10;
        this.f1570c = i11;
        this.f1571d = j3;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0514d)) {
            return false;
        }
        C0514d c0514d = (C0514d) obj;
        return this.f1568a == c0514d.f1568a && this.f1569b == c0514d.f1569b && this.f1570c == c0514d.f1570c && this.f1571d == c0514d.f1571d;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return Long.hashCode(this.f1571d) + AbstractC0921a.m2242e(this.f1570c, AbstractC0921a.m2242e(this.f1569b, Integer.hashCode(this.f1568a) * 31, 31), 31);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        StringBuilder sbM2256s = AbstractC0921a.m2256s(this.f1568a, this.f1569b, "ChatLivePhotoVideoMetadata(durationMillis=", ", width=", ", height=");
        sbM2256s.append(this.f1570c);
        sbM2256s.append(", sizeBytes=");
        sbM2256s.append(this.f1571d);
        sbM2256s.append(")");
        return sbM2256s.toString();
    }
}
