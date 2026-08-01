package p314vb;

import p314vb.C8919z;

/* JADX INFO: renamed from: vb.y */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
public final class C8918y {

    /* JADX INFO: renamed from: a */
    public static final C8918y f29529a = new C8918y();

    /* JADX INFO: renamed from: b */
    public static final long f29530b = System.nanoTime();

    /* JADX INFO: renamed from: a */
    public final long m34215a(long j10, long j11) {
        return AbstractC8917x.m34214c(j10, j11, EnumC8900g.f29493r);
    }

    /* JADX INFO: renamed from: b */
    public long m34216b() {
        return C8919z.a.m34219a(m34217c());
    }

    /* JADX INFO: renamed from: c */
    public final long m34217c() {
        return System.nanoTime() - f29530b;
    }

    public String toString() {
        return "TimeSource(System.nanoTime())";
    }
}
