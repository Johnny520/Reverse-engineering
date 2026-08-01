package p121i3;

import com.alibaba.fastjson2.JSONWriter;
import p024b9.AbstractC1043k;
import p121i3.C3195y;

/* JADX INFO: renamed from: i3.w */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class C3193w {

    /* JADX INFO: renamed from: b */
    public static final a f8489b = new a(null);

    /* JADX INFO: renamed from: c */
    public static final C3195y[] f8490c;

    /* JADX INFO: renamed from: d */
    public static final long f8491d;

    /* JADX INFO: renamed from: a */
    public final long f8492a;

    static {
        C3195y.a aVar = C3195y.f8493b;
        f8490c = new C3195y[]{C3195y.m12120d(aVar.m12129c()), C3195y.m12120d(aVar.m12128b()), C3195y.m12120d(aVar.m12127a())};
        f8491d = AbstractC3194x.m12116h(0L, Float.NaN);
    }

    public /* synthetic */ C3193w(long j10) {
        this.f8492a = j10;
    }

    /* JADX INFO: renamed from: b */
    public static final /* synthetic */ C3193w m12097b(long j10) {
        return new C3193w(j10);
    }

    /* JADX INFO: renamed from: d */
    public static boolean m12099d(long j10, Object obj) {
        return (obj instanceof C3193w) && j10 == ((C3193w) obj).m12107l();
    }

    /* JADX INFO: renamed from: e */
    public static final boolean m12100e(long j10, long j11) {
        return j10 == j11;
    }

    /* JADX INFO: renamed from: f */
    public static final long m12101f(long j10) {
        return j10 & 1095216660480L;
    }

    /* JADX INFO: renamed from: g */
    public static final long m12102g(long j10) {
        return f8490c[(int) (m12101f(j10) >>> 32)].m12126j();
    }

    /* JADX INFO: renamed from: h */
    public static final float m12103h(long j10) {
        return Float.intBitsToFloat((int) (j10 & 4294967295L));
    }

    /* JADX INFO: renamed from: i */
    public static int m12104i(long j10) {
        return Long.hashCode(j10);
    }

    /* JADX INFO: renamed from: j */
    public static final boolean m12105j(long j10) {
        return m12101f(j10) == JSONWriter.MASK_IGNORE_NON_FIELD_GETTER;
    }

    /* JADX INFO: renamed from: k */
    public static String m12106k(long j10) {
        long jM12102g = m12102g(j10);
        C3195y.a aVar = C3195y.f8493b;
        if (C3195y.m12123g(jM12102g, aVar.m12129c())) {
            return "Unspecified";
        }
        if (C3195y.m12123g(jM12102g, aVar.m12128b())) {
            return m12103h(j10) + ".sp";
        }
        if (!C3195y.m12123g(jM12102g, aVar.m12127a())) {
            return "Invalid";
        }
        return m12103h(j10) + ".em";
    }

    public boolean equals(Object obj) {
        return m12099d(this.f8492a, obj);
    }

    public int hashCode() {
        return m12104i(this.f8492a);
    }

    /* JADX INFO: renamed from: l */
    public final /* synthetic */ long m12107l() {
        return this.f8492a;
    }

    public String toString() {
        return m12106k(this.f8492a);
    }

    /* JADX INFO: renamed from: i3.w$a */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class a {
        public /* synthetic */ a(AbstractC1043k abstractC1043k) {
            this();
        }

        /* JADX INFO: renamed from: a */
        public final long m12108a() {
            return C3193w.f8491d;
        }

        public a() {
        }
    }

    /* JADX INFO: renamed from: c */
    public static long m12098c(long j10) {
        return j10;
    }
}
