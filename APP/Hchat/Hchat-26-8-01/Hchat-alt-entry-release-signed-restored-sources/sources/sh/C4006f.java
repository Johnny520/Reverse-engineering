package sh;

import p025bc.AbstractC0255e;
import p071f1.C1034w;

/* JADX INFO: renamed from: sh.f */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C4006f {

    /* JADX INFO: renamed from: a */
    public final long f13118a;

    /* JADX INFO: renamed from: b */
    public final long f13119b;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C4006f(long j3, long j4) {
        this.f13118a = j3;
        this.f13119b = j4;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4006f)) {
            return false;
        }
        C4006f c4006f = (C4006f) obj;
        return C1034w.m2635c(this.f13118a, c4006f.f13118a) && C1034w.m2635c(this.f13119b, c4006f.f13119b);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        int i9 = C1034w.f3264h;
        return Long.hashCode(this.f13119b) + (Long.hashCode(this.f13118a) * 31);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return AbstractC0255e.m1022k("CardColors(color=", C1034w.m2641i(this.f13118a), ", contentColor=", C1034w.m2641i(this.f13119b), ")");
    }
}
