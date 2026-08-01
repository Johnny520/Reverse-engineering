package p172l8;

import p024b9.AbstractC1043k;

/* JADX INFO: renamed from: l8.c0 */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class C4688c0 implements Comparable {

    /* JADX INFO: renamed from: r */
    public static final a f13894r = new a(null);

    /* JADX INFO: renamed from: q */
    public final long f13895q;

    public /* synthetic */ C4688c0(long j10) {
        this.f13895q = j10;
    }

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ C4688c0 m18728a(long j10) {
        return new C4688c0(j10);
    }

    /* JADX INFO: renamed from: g */
    public static boolean m18730g(long j10, Object obj) {
        return (obj instanceof C4688c0) && j10 == ((C4688c0) obj).m18734k();
    }

    /* JADX INFO: renamed from: h */
    public static final boolean m18731h(long j10, long j11) {
        return j10 == j11;
    }

    /* JADX INFO: renamed from: i */
    public static int m18732i(long j10) {
        return Long.hashCode(j10);
    }

    /* JADX INFO: renamed from: j */
    public static String m18733j(long j10) {
        return AbstractC4704k0.m18786d(j10, 10);
    }

    @Override // java.lang.Comparable
    public /* bridge */ /* synthetic */ int compareTo(Object obj) {
        return AbstractC4704k0.m18784b(m18734k(), ((C4688c0) obj).m18734k());
    }

    public boolean equals(Object obj) {
        return m18730g(this.f13895q, obj);
    }

    public int hashCode() {
        return m18732i(this.f13895q);
    }

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ long m18734k() {
        return this.f13895q;
    }

    public String toString() {
        return m18733j(this.f13895q);
    }

    /* JADX INFO: renamed from: l8.c0$a */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class a {
        public /* synthetic */ a(AbstractC1043k abstractC1043k) {
            this();
        }

        public a() {
        }
    }

    /* JADX INFO: renamed from: c */
    public static long m18729c(long j10) {
        return j10;
    }
}
