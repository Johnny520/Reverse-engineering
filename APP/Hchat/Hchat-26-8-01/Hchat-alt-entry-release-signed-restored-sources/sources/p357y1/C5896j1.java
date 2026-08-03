package p357y1;

import p293u2.C4242l;

/* JADX INFO: renamed from: y1.j1 */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C5896j1 {

    /* JADX INFO: renamed from: c */
    public static final C5896j1 f23959c = new C5896j1(0, 0);

    /* JADX INFO: renamed from: a */
    public final long f23960a;

    /* JADX INFO: renamed from: b */
    public final long f23961b;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C5896j1(long j3, long j4) {
        this.f23960a = j3;
        this.f23961b = j4;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C5896j1) {
            C5896j1 c5896j1 = (C5896j1) obj;
            return C4242l.m8534a(this.f23960a, c5896j1.f23960a) && this.f23961b == c5896j1.f23961b;
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return Long.hashCode(this.f23961b) + (Long.hashCode(this.f23960a) * 31);
    }
}
