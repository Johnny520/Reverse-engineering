package p100h0;

import p071f1.C1034w;

/* JADX INFO: renamed from: h0.k1 */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C1532k1 {

    /* JADX INFO: renamed from: a */
    public final long f5111a;

    /* JADX INFO: renamed from: b */
    public final long f5112b;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C1532k1(long j3, long j4) {
        this.f5111a = j3;
        this.f5112b = j4;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1532k1)) {
            return false;
        }
        C1532k1 c1532k1 = (C1532k1) obj;
        return C1034w.m2635c(this.f5111a, c1532k1.f5111a) && C1034w.m2635c(this.f5112b, c1532k1.f5112b);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        int i9 = C1034w.f3264h;
        return Long.hashCode(this.f5112b) + (Long.hashCode(this.f5111a) * 31);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return "SelectionColors(selectionHandleColor=" + ((Object) C1034w.m2641i(this.f5111a)) + ", selectionBackgroundColor=" + ((Object) C1034w.m2641i(this.f5112b)) + ')';
    }
}
