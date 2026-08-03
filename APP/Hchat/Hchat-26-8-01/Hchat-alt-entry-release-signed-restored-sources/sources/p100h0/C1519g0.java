package p100h0;

import p057e1.C0807b;
import p068eh.AbstractC0921a;
import p321w.EnumC4599g0;

/* JADX INFO: renamed from: h0.g0 */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C1519g0 {

    /* JADX INFO: renamed from: a */
    public final EnumC4599g0 f5074a;

    /* JADX INFO: renamed from: b */
    public final long f5075b;

    /* JADX INFO: renamed from: c */
    public final EnumC1516f0 f5076c;

    /* JADX INFO: renamed from: d */
    public final boolean f5077d;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C1519g0(EnumC4599g0 enumC4599g0, long j3, EnumC1516f0 enumC1516f0, boolean z9) {
        this.f5074a = enumC4599g0;
        this.f5075b = j3;
        this.f5076c = enumC1516f0;
        this.f5077d = z9;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1519g0)) {
            return false;
        }
        C1519g0 c1519g0 = (C1519g0) obj;
        return this.f5074a == c1519g0.f5074a && C0807b.m2039b(this.f5075b, c1519g0.f5075b) && this.f5076c == c1519g0.f5076c && this.f5077d == c1519g0.f5077d;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return Boolean.hashCode(this.f5077d) + ((this.f5076c.hashCode() + AbstractC0921a.m2243f(this.f5074a.hashCode() * 31, 31, this.f5075b)) * 31);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return "SelectionHandleInfo(handle=" + this.f5074a + ", position=" + ((Object) C0807b.m2044g(this.f5075b)) + ", anchor=" + this.f5076c + ", visible=" + this.f5077d + ')';
    }
}
