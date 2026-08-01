package p264s0;

import p024b9.AbstractC1043k;
import p265s1.C7128q1;

/* JADX INFO: renamed from: s0.l0 */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class C6816l0 {

    /* JADX INFO: renamed from: a */
    public final long f21871a;

    /* JADX INFO: renamed from: b */
    public final long f21872b;

    /* JADX INFO: renamed from: c */
    public final long f21873c;

    /* JADX INFO: renamed from: d */
    public final long f21874d;

    public C6816l0(long j10, long j11, long j12, long j13) {
        this.f21871a = j10;
        this.f21872b = j11;
        this.f21873c = j12;
        this.f21874d = j13;
    }

    /* JADX INFO: renamed from: a */
    public final long m27015a(boolean z10) {
        return z10 ? this.f21871a : this.f21873c;
    }

    /* JADX INFO: renamed from: b */
    public final long m27016b(boolean z10) {
        return z10 ? this.f21872b : this.f21874d;
    }

    /* JADX INFO: renamed from: c */
    public final C6816l0 m27017c(long j10, long j11, long j12, long j13) {
        return new C6816l0(j10 != 16 ? j10 : this.f21871a, j11 != 16 ? j11 : this.f21872b, j12 != 16 ? j12 : this.f21873c, j13 != 16 ? j13 : this.f21874d, null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof C6816l0)) {
            return false;
        }
        C6816l0 c6816l0 = (C6816l0) obj;
        return C7128q1.m28131q(this.f21871a, c6816l0.f21871a) && C7128q1.m28131q(this.f21872b, c6816l0.f21872b) && C7128q1.m28131q(this.f21873c, c6816l0.f21873c) && C7128q1.m28131q(this.f21874d, c6816l0.f21874d);
    }

    public int hashCode() {
        return (((((C7128q1.m28137w(this.f21871a) * 31) + C7128q1.m28137w(this.f21872b)) * 31) + C7128q1.m28137w(this.f21873c)) * 31) + C7128q1.m28137w(this.f21874d);
    }

    public /* synthetic */ C6816l0(long j10, long j11, long j12, long j13, AbstractC1043k abstractC1043k) {
        this(j10, j11, j12, j13);
    }
}
