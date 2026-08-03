package p158l;

import p068eh.AbstractC0921a;
import p071f1.C1034w;

/* JADX INFO: renamed from: l.d */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C2413d {

    /* JADX INFO: renamed from: a */
    public final long f7888a;

    /* JADX INFO: renamed from: b */
    public final long f7889b;

    /* JADX INFO: renamed from: c */
    public final long f7890c;

    /* JADX INFO: renamed from: d */
    public final long f7891d;

    /* JADX INFO: renamed from: e */
    public final long f7892e;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C2413d(long j3, long j4, long j5, long j10, long j11) {
        this.f7888a = j3;
        this.f7889b = j4;
        this.f7890c = j5;
        this.f7891d = j10;
        this.f7892e = j11;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof C2413d)) {
            return false;
        }
        C2413d c2413d = (C2413d) obj;
        return C1034w.m2635c(this.f7888a, c2413d.f7888a) && C1034w.m2635c(this.f7889b, c2413d.f7889b) && C1034w.m2635c(this.f7890c, c2413d.f7890c) && C1034w.m2635c(this.f7891d, c2413d.f7891d) && C1034w.m2635c(this.f7892e, c2413d.f7892e);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        int i9 = C1034w.f3264h;
        return Long.hashCode(this.f7892e) + AbstractC0921a.m2243f(AbstractC0921a.m2243f(AbstractC0921a.m2243f(Long.hashCode(this.f7888a) * 31, 31, this.f7889b), 31, this.f7890c), 31, this.f7891d);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return "ContextMenuColors(backgroundColor=" + ((Object) C1034w.m2641i(this.f7888a)) + ", textColor=" + ((Object) C1034w.m2641i(this.f7889b)) + ", iconColor=" + ((Object) C1034w.m2641i(this.f7890c)) + ", disabledTextColor=" + ((Object) C1034w.m2641i(this.f7891d)) + ", disabledIconColor=" + ((Object) C1034w.m2641i(this.f7892e)) + ')';
    }
}
