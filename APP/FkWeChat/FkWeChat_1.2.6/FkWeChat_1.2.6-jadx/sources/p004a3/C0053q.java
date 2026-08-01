package p004a3;

import okhttp3.internal.http2.Settings;
import p024b9.AbstractC1043k;

/* JADX INFO: renamed from: a3.q */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class C0053q {

    /* JADX INFO: renamed from: b */
    public static final a f103b = new a(null);

    /* JADX INFO: renamed from: c */
    public static final int f104c = m184f(0);

    /* JADX INFO: renamed from: d */
    public static final int f105d = m184f(1);

    /* JADX INFO: renamed from: e */
    public static final int f106e = m184f(2);

    /* JADX INFO: renamed from: f */
    public static final int f107f = m184f(Settings.DEFAULT_INITIAL_WINDOW_SIZE);

    /* JADX INFO: renamed from: a */
    public final int f108a;

    public /* synthetic */ C0053q(int i10) {
        this.f108a = i10;
    }

    /* JADX INFO: renamed from: e */
    public static final /* synthetic */ C0053q m183e(int i10) {
        return new C0053q(i10);
    }

    /* JADX INFO: renamed from: g */
    public static boolean m185g(int i10, Object obj) {
        return (obj instanceof C0053q) && i10 == ((C0053q) obj).m189k();
    }

    /* JADX INFO: renamed from: h */
    public static final boolean m186h(int i10, int i11) {
        return i10 == i11;
    }

    /* JADX INFO: renamed from: i */
    public static int m187i(int i10) {
        return Integer.hashCode(i10);
    }

    /* JADX INFO: renamed from: j */
    public static String m188j(int i10) {
        return m186h(i10, f104c) ? "None" : m186h(i10, f105d) ? "Weight" : m186h(i10, f106e) ? "Style" : m186h(i10, f107f) ? "All" : "Invalid";
    }

    public boolean equals(Object obj) {
        return m185g(this.f108a, obj);
    }

    public int hashCode() {
        return m187i(this.f108a);
    }

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ int m189k() {
        return this.f108a;
    }

    public String toString() {
        return m188j(this.f108a);
    }

    /* JADX INFO: renamed from: a3.q$a */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class a {
        public /* synthetic */ a(AbstractC1043k abstractC1043k) {
            this();
        }

        /* JADX INFO: renamed from: a */
        public final int m190a() {
            return C0053q.f107f;
        }

        /* JADX INFO: renamed from: b */
        public final int m191b() {
            return C0053q.f104c;
        }

        /* JADX INFO: renamed from: c */
        public final int m192c() {
            return C0053q.f106e;
        }

        /* JADX INFO: renamed from: d */
        public final int m193d() {
            return C0053q.f105d;
        }

        public a() {
        }
    }

    /* JADX INFO: renamed from: f */
    public static int m184f(int i10) {
        return i10;
    }
}
