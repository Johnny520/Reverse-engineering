package p314vb;

import p314vb.C8895b;

/* JADX INFO: renamed from: vb.x */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC8917x {
    /* JADX INFO: renamed from: a */
    public static final long m34212a(long j10) {
        return j10 < 0 ? C8895b.f29484r.m34130d() : C8895b.f29484r.m34128b();
    }

    /* JADX INFO: renamed from: b */
    public static final long m34213b(long j10, long j11, EnumC8900g enumC8900g) {
        long j12 = j10 - j11;
        if (((j12 ^ j10) & (~(j12 ^ j11))) >= 0) {
            return AbstractC8899f.m34138C(j12, enumC8900g);
        }
        EnumC8900g enumC8900g2 = EnumC8900g.f29495t;
        if (enumC8900g.compareTo(enumC8900g2) >= 0) {
            return C8895b.m34105S(m34212a(j12));
        }
        long jM34167a = AbstractC8901h.m34167a(1L, enumC8900g2, enumC8900g);
        long j13 = (j10 / jM34167a) - (j11 / jM34167a);
        long j14 = (j10 % jM34167a) - (j11 % jM34167a);
        C8895b.a aVar = C8895b.f29484r;
        return C8895b.m34101O(AbstractC8899f.m34138C(j13, enumC8900g2), AbstractC8899f.m34138C(j14, enumC8900g));
    }

    /* JADX INFO: renamed from: c */
    public static final long m34214c(long j10, long j11, EnumC8900g enumC8900g) {
        enumC8900g.getClass();
        return ((j11 - 1) | 1) == Long.MAX_VALUE ? j10 == j11 ? C8895b.f29484r.m34131e() : C8895b.m34105S(m34212a(j11)) : (1 | (j10 - 1)) == Long.MAX_VALUE ? m34212a(j10) : m34213b(j10, j11, enumC8900g);
    }
}
