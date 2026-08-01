package p117i;

/* JADX INFO: renamed from: i.l */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class C3069l {

    /* JADX INFO: renamed from: a */
    public final long f8148a;

    public /* synthetic */ C3069l(long j10) {
        this.f8148a = j10;
    }

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ C3069l m11390a(long j10) {
        return new C3069l(j10);
    }

    /* JADX INFO: renamed from: b */
    public static long m11391b(int i10, int i11) {
        return m11392c((((long) i11) & 4294967295L) | (((long) i10) << 32));
    }

    /* JADX INFO: renamed from: d */
    public static boolean m11393d(long j10, Object obj) {
        return (obj instanceof C3069l) && j10 == ((C3069l) obj).m11398i();
    }

    /* JADX INFO: renamed from: e */
    public static final int m11394e(long j10) {
        return (int) (j10 >> 32);
    }

    /* JADX INFO: renamed from: f */
    public static final int m11395f(long j10) {
        return (int) (j10 & 4294967295L);
    }

    /* JADX INFO: renamed from: g */
    public static int m11396g(long j10) {
        return Long.hashCode(j10);
    }

    /* JADX INFO: renamed from: h */
    public static String m11397h(long j10) {
        return "(" + m11394e(j10) + ", " + m11395f(j10) + ')';
    }

    public boolean equals(Object obj) {
        return m11393d(this.f8148a, obj);
    }

    public int hashCode() {
        return m11396g(this.f8148a);
    }

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ long m11398i() {
        return this.f8148a;
    }

    public String toString() {
        return m11397h(this.f8148a);
    }

    /* JADX INFO: renamed from: c */
    public static long m11392c(long j10) {
        return j10;
    }
}
