package p121i3;

import p024b9.AbstractC1043k;

/* JADX INFO: renamed from: i3.o */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class C3185o {

    /* JADX INFO: renamed from: b */
    public static final a f8471b = new a(null);

    /* JADX INFO: renamed from: c */
    public static final long f8472c = m12044d(0);

    /* JADX INFO: renamed from: d */
    public static final long f8473d = m12044d(9223372034707292159L);

    /* JADX INFO: renamed from: a */
    public final long f8474a;

    public /* synthetic */ C3185o(long j10) {
        this.f8474a = j10;
    }

    /* JADX INFO: renamed from: c */
    public static final /* synthetic */ C3185o m12043c(long j10) {
        return new C3185o(j10);
    }

    /* JADX INFO: renamed from: e */
    public static final long m12045e(long j10, int i10, int i11) {
        return m12044d((((long) i10) << 32) | (((long) i11) & 4294967295L));
    }

    /* JADX INFO: renamed from: f */
    public static /* synthetic */ long m12046f(long j10, int i10, int i11, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i10 = (int) (j10 >> 32);
        }
        if ((i12 & 2) != 0) {
            i11 = (int) (4294967295L & j10);
        }
        return m12045e(j10, i10, i11);
    }

    /* JADX INFO: renamed from: g */
    public static boolean m12047g(long j10, Object obj) {
        return (obj instanceof C3185o) && j10 == ((C3185o) obj).m12056p();
    }

    /* JADX INFO: renamed from: h */
    public static final boolean m12048h(long j10, long j11) {
        return j10 == j11;
    }

    /* JADX INFO: renamed from: i */
    public static final int m12049i(long j10) {
        return (int) (j10 >> 32);
    }

    /* JADX INFO: renamed from: j */
    public static final int m12050j(long j10) {
        return (int) (j10 & 4294967295L);
    }

    /* JADX INFO: renamed from: k */
    public static int m12051k(long j10) {
        return Long.hashCode(j10);
    }

    /* JADX INFO: renamed from: l */
    public static final long m12052l(long j10, long j11) {
        return m12044d((((long) (((int) (j10 >> 32)) - ((int) (j11 >> 32)))) << 32) | (((long) (((int) (j10 & 4294967295L)) - ((int) (j11 & 4294967295L)))) & 4294967295L));
    }

    /* JADX INFO: renamed from: m */
    public static final long m12053m(long j10, long j11) {
        return m12044d((((long) (((int) (j10 >> 32)) + ((int) (j11 >> 32)))) << 32) | (((long) (((int) (j10 & 4294967295L)) + ((int) (j11 & 4294967295L)))) & 4294967295L));
    }

    /* JADX INFO: renamed from: n */
    public static String m12054n(long j10) {
        return "(" + m12049i(j10) + ", " + m12050j(j10) + ')';
    }

    /* JADX INFO: renamed from: o */
    public static final long m12055o(long j10) {
        int i10 = -((int) (j10 >> 32));
        return m12044d((((long) (-((int) (j10 & 4294967295L)))) & 4294967295L) | (((long) i10) << 32));
    }

    public boolean equals(Object obj) {
        return m12047g(this.f8474a, obj);
    }

    public int hashCode() {
        return m12051k(this.f8474a);
    }

    /* JADX INFO: renamed from: p */
    public final /* synthetic */ long m12056p() {
        return this.f8474a;
    }

    public String toString() {
        return m12054n(this.f8474a);
    }

    /* JADX INFO: renamed from: i3.o$a */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class a {
        public /* synthetic */ a(AbstractC1043k abstractC1043k) {
            this();
        }

        /* JADX INFO: renamed from: a */
        public final long m12057a() {
            return C3185o.f8473d;
        }

        /* JADX INFO: renamed from: b */
        public final long m12058b() {
            return C3185o.f8472c;
        }

        public a() {
        }
    }

    /* JADX INFO: renamed from: d */
    public static long m12044d(long j10) {
        return j10;
    }
}
