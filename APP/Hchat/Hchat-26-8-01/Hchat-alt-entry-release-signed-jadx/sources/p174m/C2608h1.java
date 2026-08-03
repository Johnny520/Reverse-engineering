package p174m;

import p057e1.C0807b;
import p068eh.AbstractC0921a;

/* JADX INFO: renamed from: m.h1 */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C2608h1 {

    /* JADX INFO: renamed from: a */
    public final long f8452a;

    /* JADX INFO: renamed from: b */
    public final long f8453b;

    /* JADX INFO: renamed from: c */
    public final boolean f8454c;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C2608h1(long j3, long j4, boolean z9) {
        this.f8452a = j3;
        this.f8453b = j4;
        this.f8454c = z9;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public final C2608h1 m6058a(C2608h1 c2608h1) {
        return new C2608h1(C0807b.m2042e(this.f8452a, c2608h1.f8452a), Math.max(this.f8453b, c2608h1.f8453b), this.f8454c);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2608h1)) {
            return false;
        }
        C2608h1 c2608h1 = (C2608h1) obj;
        return C0807b.m2039b(this.f8452a, c2608h1.f8452a) && this.f8453b == c2608h1.f8453b && this.f8454c == c2608h1.f8454c;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return Boolean.hashCode(this.f8454c) + AbstractC0921a.m2243f(Long.hashCode(this.f8452a) * 31, 31, this.f8453b);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return "MouseWheelScrollDelta(value=" + ((Object) C0807b.m2044g(this.f8452a)) + ", timeMillis=" + this.f8453b + ", shouldApplyImmediately=" + this.f8454c + ')';
    }
}
