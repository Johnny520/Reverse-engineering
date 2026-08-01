package p264s0;

import p024b9.AbstractC1043k;
import p265s1.C7128q1;

/* JADX INFO: renamed from: s0.g5 */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class C6741g5 {

    /* JADX INFO: renamed from: a */
    public final long f21353a;

    /* JADX INFO: renamed from: b */
    public final long f21354b;

    /* JADX INFO: renamed from: c */
    public final long f21355c;

    /* JADX INFO: renamed from: d */
    public final long f21356d;

    public C6741g5(long j10, long j11, long j12, long j13) {
        this.f21353a = j10;
        this.f21354b = j11;
        this.f21355c = j12;
        this.f21356d = j13;
    }

    /* JADX INFO: renamed from: d */
    public static /* synthetic */ C6741g5 m26707d(C6741g5 c6741g5, long j10, long j11, long j12, long j13, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            j10 = c6741g5.f21353a;
        }
        long j14 = j10;
        if ((i10 & 2) != 0) {
            j11 = c6741g5.f21354b;
        }
        long j15 = j11;
        if ((i10 & 4) != 0) {
            j12 = c6741g5.f21355c;
        }
        return c6741g5.m26710c(j14, j15, j12, (i10 & 8) != 0 ? c6741g5.f21356d : j13);
    }

    /* JADX INFO: renamed from: a */
    public final long m26708a(boolean z10) {
        return z10 ? this.f21353a : this.f21355c;
    }

    /* JADX INFO: renamed from: b */
    public final long m26709b(boolean z10) {
        return z10 ? this.f21354b : this.f21356d;
    }

    /* JADX INFO: renamed from: c */
    public final C6741g5 m26710c(long j10, long j11, long j12, long j13) {
        return new C6741g5(j10 != 16 ? j10 : this.f21353a, j11 != 16 ? j11 : this.f21354b, j12 != 16 ? j12 : this.f21355c, j13 != 16 ? j13 : this.f21356d, null);
    }

    /* JADX INFO: renamed from: e */
    public final long m26711e() {
        return this.f21354b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof C6741g5)) {
            return false;
        }
        C6741g5 c6741g5 = (C6741g5) obj;
        return C7128q1.m28131q(this.f21353a, c6741g5.f21353a) && C7128q1.m28131q(this.f21354b, c6741g5.f21354b) && C7128q1.m28131q(this.f21355c, c6741g5.f21355c) && C7128q1.m28131q(this.f21356d, c6741g5.f21356d);
    }

    public int hashCode() {
        return (((((C7128q1.m28137w(this.f21353a) * 31) + C7128q1.m28137w(this.f21354b)) * 31) + C7128q1.m28137w(this.f21355c)) * 31) + C7128q1.m28137w(this.f21356d);
    }

    public /* synthetic */ C6741g5(long j10, long j11, long j12, long j13, AbstractC1043k abstractC1043k) {
        this(j10, j11, j12, j13);
    }
}
