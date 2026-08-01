package p316w;

/* JADX INFO: renamed from: w.c */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class C8937c {

    /* JADX INFO: renamed from: a */
    public final long f29593a;

    public /* synthetic */ C8937c(long j10) {
        this.f29593a = j10;
    }

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ C8937c m34315a(long j10) {
        return new C8937c(j10);
    }

    /* JADX INFO: renamed from: c */
    public static boolean m34317c(long j10, Object obj) {
        return (obj instanceof C8937c) && j10 == ((C8937c) obj).m34321g();
    }

    /* JADX INFO: renamed from: d */
    public static final int m34318d(long j10) {
        return (int) j10;
    }

    /* JADX INFO: renamed from: e */
    public static int m34319e(long j10) {
        return Long.hashCode(j10);
    }

    /* JADX INFO: renamed from: f */
    public static String m34320f(long j10) {
        return "GridItemSpan(packedValue=" + j10 + ')';
    }

    public boolean equals(Object obj) {
        return m34317c(this.f29593a, obj);
    }

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ long m34321g() {
        return this.f29593a;
    }

    public int hashCode() {
        return m34319e(this.f29593a);
    }

    public String toString() {
        return m34320f(this.f29593a);
    }

    /* JADX INFO: renamed from: b */
    public static long m34316b(long j10) {
        return j10;
    }
}
