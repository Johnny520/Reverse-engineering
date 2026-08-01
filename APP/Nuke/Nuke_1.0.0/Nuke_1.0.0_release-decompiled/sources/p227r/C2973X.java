package p227r;

import p011B4.AbstractC0231b;
import p204n0.C2683b;

/* JADX INFO: renamed from: r.X */
/* JADX INFO: loaded from: classes.dex */
public final class C2973X {

    /* JADX INFO: renamed from: a */
    public final long f9403a;

    /* JADX INFO: renamed from: b */
    public final long f9404b;

    /* JADX INFO: renamed from: c */
    public final boolean f9405c;

    public C2973X(long j5, long j6, boolean z5) {
        this.f9403a = j5;
        this.f9404b = j6;
        this.f9405c = z5;
    }

    /* JADX INFO: renamed from: a */
    public final C2973X m5171a(C2973X c2973x) {
        return new C2973X(C2683b.m4647e(this.f9403a, c2973x.f9403a), Math.max(this.f9404b, c2973x.f9404b), this.f9405c);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2973X)) {
            return false;
        }
        C2973X c2973x = (C2973X) obj;
        return C2683b.m4644b(this.f9403a, c2973x.f9403a) && this.f9404b == c2973x.f9404b && this.f9405c == c2973x.f9405c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f9405c) + AbstractC0231b.m392c(Long.hashCode(this.f9403a) * 31, 31, this.f9404b);
    }

    public final String toString() {
        return "MouseWheelScrollDelta(value=" + ((Object) C2683b.m4649g(this.f9403a)) + ", timeMillis=" + this.f9404b + ", shouldApplyImmediately=" + this.f9405c + ')';
    }
}
