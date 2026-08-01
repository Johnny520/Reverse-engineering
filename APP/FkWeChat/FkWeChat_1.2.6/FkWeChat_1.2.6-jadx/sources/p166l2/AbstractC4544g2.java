package p166l2;

import p024b9.AbstractC1043k;
import p121i3.EnumC3191u;

/* JADX INFO: renamed from: l2.g2 */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC4544g2 {

    /* JADX INFO: renamed from: a */
    public static final a f13326a = new a(null);

    /* JADX INFO: renamed from: b */
    public static final long f13327b = AbstractC4548h2.m17815c(0, 0, 0, 0, 14, null);

    /* JADX INFO: renamed from: b */
    public static final int m17794b(long j10, EnumC3191u enumC3191u) {
        return (!m17801i(j10) || enumC3191u == EnumC3191u.f8484q) ? m17799g(j10) : m17798f(j10);
    }

    /* JADX INFO: renamed from: c */
    public static final int m17795c(long j10, EnumC3191u enumC3191u) {
        return (!m17801i(j10) || enumC3191u == EnumC3191u.f8484q) ? m17798f(j10) : m17799g(j10);
    }

    /* JADX INFO: renamed from: e */
    public static final int m17797e(long j10) {
        return f13326a.m17806e(j10, 3);
    }

    /* JADX INFO: renamed from: f */
    public static final int m17798f(long j10) {
        return f13326a.m17806e(j10, 2);
    }

    /* JADX INFO: renamed from: g */
    public static final int m17799g(long j10) {
        return f13326a.m17806e(j10, 0);
    }

    /* JADX INFO: renamed from: h */
    public static final int m17800h(long j10) {
        return f13326a.m17806e(j10, 1);
    }

    /* JADX INFO: renamed from: i */
    public static final boolean m17801i(long j10) {
        return (j10 & Long.MIN_VALUE) != 0;
    }

    /* JADX INFO: renamed from: l2.g2$a */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class a {
        public /* synthetic */ a(AbstractC1043k abstractC1043k) {
            this();
        }

        /* JADX INFO: renamed from: b */
        public final long m17803b() {
            return AbstractC4544g2.f13327b;
        }

        /* JADX INFO: renamed from: c */
        public final long m17804c(int i10, int i11, int i12, int i13, boolean z10) {
            return m17805d(i11, 1) | m17805d(i10, 0) | m17805d(i12, 2) | m17805d(i13, 3) | (z10 ? Long.MIN_VALUE : 0L);
        }

        /* JADX INFO: renamed from: d */
        public final long m17805d(int i10, int i11) {
            return ((long) (i10 & 32767)) << (i11 * 15);
        }

        /* JADX INFO: renamed from: e */
        public final int m17806e(long j10, int i10) {
            return ((int) (j10 >> (i10 * 15))) & 32767;
        }

        public a() {
        }
    }

    /* JADX INFO: renamed from: d */
    public static long m17796d(long j10) {
        return j10;
    }
}
