package p264s0;

import p024b9.AbstractC1043k;
import p265s1.C7128q1;

/* JADX INFO: renamed from: s0.c6 */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class C6678c6 {

    /* JADX INFO: renamed from: a */
    public final long f20990a;

    /* JADX INFO: renamed from: b */
    public final long f20991b;

    /* JADX INFO: renamed from: c */
    public final long f20992c;

    /* JADX INFO: renamed from: d */
    public final long f20993d;

    /* JADX INFO: renamed from: e */
    public final long f20994e;

    /* JADX INFO: renamed from: f */
    public final long f20995f;

    public C6678c6(long j10, long j11, long j12, long j13, long j14, long j15) {
        this.f20990a = j10;
        this.f20991b = j11;
        this.f20992c = j12;
        this.f20993d = j13;
        this.f20994e = j14;
        this.f20995f = j15;
    }

    /* JADX INFO: renamed from: a */
    public final long m26464a(boolean z10) {
        return z10 ? this.f20991b : this.f20994e;
    }

    /* JADX INFO: renamed from: b */
    public final long m26465b(boolean z10) {
        return z10 ? this.f20990a : this.f20993d;
    }

    /* JADX INFO: renamed from: c */
    public final long m26466c(boolean z10) {
        return z10 ? this.f20992c : this.f20995f;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof C6678c6)) {
            return false;
        }
        C6678c6 c6678c6 = (C6678c6) obj;
        return C7128q1.m28131q(this.f20990a, c6678c6.f20990a) && C7128q1.m28131q(this.f20991b, c6678c6.f20991b) && C7128q1.m28131q(this.f20992c, c6678c6.f20992c) && C7128q1.m28131q(this.f20993d, c6678c6.f20993d) && C7128q1.m28131q(this.f20994e, c6678c6.f20994e) && C7128q1.m28131q(this.f20995f, c6678c6.f20995f);
    }

    public int hashCode() {
        return (((((((((C7128q1.m28137w(this.f20990a) * 31) + C7128q1.m28137w(this.f20991b)) * 31) + C7128q1.m28137w(this.f20992c)) * 31) + C7128q1.m28137w(this.f20993d)) * 31) + C7128q1.m28137w(this.f20994e)) * 31) + C7128q1.m28137w(this.f20995f);
    }

    public /* synthetic */ C6678c6(long j10, long j11, long j12, long j13, long j14, long j15, AbstractC1043k abstractC1043k) {
        this(j10, j11, j12, j13, j14, j15);
    }
}
