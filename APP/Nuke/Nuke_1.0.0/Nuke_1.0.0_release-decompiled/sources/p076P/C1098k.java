package p076P;

import p011B4.AbstractC0231b;
import p211o0.C2762u;

/* JADX INFO: renamed from: P.k */
/* JADX INFO: loaded from: classes.dex */
public final class C1098k {

    /* JADX INFO: renamed from: a */
    public final long f3538a;

    /* JADX INFO: renamed from: b */
    public final long f3539b;

    /* JADX INFO: renamed from: c */
    public final long f3540c;

    /* JADX INFO: renamed from: d */
    public final long f3541d;

    public C1098k(long j5, long j6, long j7, long j8) {
        this.f3538a = j5;
        this.f3539b = j6;
        this.f3540c = j7;
        this.f3541d = j8;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof C1098k)) {
            return false;
        }
        C1098k c1098k = (C1098k) obj;
        return C2762u.m4921c(this.f3538a, c1098k.f3538a) && C2762u.m4921c(this.f3539b, c1098k.f3539b) && C2762u.m4921c(this.f3540c, c1098k.f3540c) && C2762u.m4921c(this.f3541d, c1098k.f3541d);
    }

    public final int hashCode() {
        int i5 = C2762u.f8763h;
        return Long.hashCode(this.f3541d) + AbstractC0231b.m392c(AbstractC0231b.m392c(Long.hashCode(this.f3538a) * 31, 31, this.f3539b), 31, this.f3540c);
    }
}
