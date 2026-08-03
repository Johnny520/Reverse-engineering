package p071f1;

import p057e1.C0807b;
import p068eh.AbstractC0921a;

/* JADX INFO: renamed from: f1.q0 */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C1024q0 {

    /* JADX INFO: renamed from: d */
    public static final C1024q0 f3233d = new C1024q0(0.0f, AbstractC0996c0.m2508d(4278190080L), 0);

    /* JADX INFO: renamed from: a */
    public final long f3234a;

    /* JADX INFO: renamed from: b */
    public final long f3235b;

    /* JADX INFO: renamed from: c */
    public final float f3236c;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C1024q0(float f3, long j3, long j4) {
        this.f3234a = j3;
        this.f3235b = j4;
        this.f3236c = f3;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1024q0)) {
            return false;
        }
        C1024q0 c1024q0 = (C1024q0) obj;
        return C1034w.m2635c(this.f3234a, c1024q0.f3234a) && C0807b.m2039b(this.f3235b, c1024q0.f3235b) && this.f3236c == c1024q0.f3236c;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        int i9 = C1034w.f3264h;
        return Float.hashCode(this.f3236c) + AbstractC0921a.m2243f(Long.hashCode(this.f3234a) * 31, 31, this.f3235b);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Shadow(color=");
        sb2.append((Object) C1034w.m2641i(this.f3234a));
        sb2.append(", offset=");
        sb2.append((Object) C0807b.m2044g(this.f3235b));
        sb2.append(", blurRadius=");
        return AbstractC0921a.m2252o(sb2, this.f3236c, ')');
    }
}
