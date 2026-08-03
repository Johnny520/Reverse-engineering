package sh;

import p025bc.AbstractC0255e;
import p071f1.C1034w;

/* JADX INFO: renamed from: sh.a */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C3986a {

    /* JADX INFO: renamed from: a */
    public final long f13026a;

    /* JADX INFO: renamed from: b */
    public final long f13027b;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C3986a(long j3, long j4) {
        this.f13026a = j3;
        this.f13027b = j4;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3986a)) {
            return false;
        }
        C3986a c3986a = (C3986a) obj;
        return C1034w.m2635c(this.f13026a, c3986a.f13026a) && C1034w.m2635c(this.f13027b, c3986a.f13027b);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        int i9 = C1034w.f3264h;
        return Long.hashCode(this.f13027b) + (Long.hashCode(this.f13026a) * 31);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return AbstractC0255e.m1022k("BasicComponentColors(color=", C1034w.m2641i(this.f13026a), ", disabledColor=", C1034w.m2641i(this.f13027b), ")");
    }
}
