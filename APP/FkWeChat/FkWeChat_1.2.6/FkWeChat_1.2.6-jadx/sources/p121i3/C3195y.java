package p121i3;

import com.alibaba.fastjson2.JSONWriter;
import p024b9.AbstractC1043k;

/* JADX INFO: renamed from: i3.y */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class C3195y {

    /* JADX INFO: renamed from: b */
    public static final a f8493b = new a(null);

    /* JADX INFO: renamed from: c */
    public static final long f8494c = m12121e(0);

    /* JADX INFO: renamed from: d */
    public static final long f8495d = m12121e(JSONWriter.MASK_IGNORE_NON_FIELD_GETTER);

    /* JADX INFO: renamed from: e */
    public static final long f8496e = m12121e(8589934592L);

    /* JADX INFO: renamed from: a */
    public final long f8497a;

    public /* synthetic */ C3195y(long j10) {
        this.f8497a = j10;
    }

    /* JADX INFO: renamed from: d */
    public static final /* synthetic */ C3195y m12120d(long j10) {
        return new C3195y(j10);
    }

    /* JADX INFO: renamed from: f */
    public static boolean m12122f(long j10, Object obj) {
        return (obj instanceof C3195y) && j10 == ((C3195y) obj).m12126j();
    }

    /* JADX INFO: renamed from: g */
    public static final boolean m12123g(long j10, long j11) {
        return j10 == j11;
    }

    /* JADX INFO: renamed from: h */
    public static int m12124h(long j10) {
        return Long.hashCode(j10);
    }

    /* JADX INFO: renamed from: i */
    public static String m12125i(long j10) {
        return m12123g(j10, f8494c) ? "Unspecified" : m12123g(j10, f8495d) ? "Sp" : m12123g(j10, f8496e) ? "Em" : "Invalid";
    }

    public boolean equals(Object obj) {
        return m12122f(this.f8497a, obj);
    }

    public int hashCode() {
        return m12124h(this.f8497a);
    }

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ long m12126j() {
        return this.f8497a;
    }

    public String toString() {
        return m12125i(this.f8497a);
    }

    /* JADX INFO: renamed from: i3.y$a */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class a {
        public /* synthetic */ a(AbstractC1043k abstractC1043k) {
            this();
        }

        /* JADX INFO: renamed from: a */
        public final long m12127a() {
            return C3195y.f8496e;
        }

        /* JADX INFO: renamed from: b */
        public final long m12128b() {
            return C3195y.f8495d;
        }

        /* JADX INFO: renamed from: c */
        public final long m12129c() {
            return C3195y.f8494c;
        }

        public a() {
        }
    }

    /* JADX INFO: renamed from: e */
    public static long m12121e(long j10) {
        return j10;
    }
}
