package p017b2;

import p024b9.AbstractC1043k;

/* JADX INFO: renamed from: b2.a */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class C0931a {

    /* JADX INFO: renamed from: b */
    public static final a f2894b = new a(null);

    /* JADX INFO: renamed from: c */
    public static final int f2895c = m3434d(1);

    /* JADX INFO: renamed from: d */
    public static final int f2896d = m3434d(2);

    /* JADX INFO: renamed from: a */
    public final int f2897a;

    public /* synthetic */ C0931a(int i10) {
        this.f2897a = i10;
    }

    /* JADX INFO: renamed from: c */
    public static final /* synthetic */ C0931a m3433c(int i10) {
        return new C0931a(i10);
    }

    /* JADX INFO: renamed from: e */
    public static boolean m3435e(int i10, Object obj) {
        return (obj instanceof C0931a) && i10 == ((C0931a) obj).m3439i();
    }

    /* JADX INFO: renamed from: f */
    public static final boolean m3436f(int i10, int i11) {
        return i10 == i11;
    }

    /* JADX INFO: renamed from: g */
    public static int m3437g(int i10) {
        return Integer.hashCode(i10);
    }

    /* JADX INFO: renamed from: h */
    public static String m3438h(int i10) {
        return m3436f(i10, f2895c) ? "Touch" : m3436f(i10, f2896d) ? "Keyboard" : "Error";
    }

    public boolean equals(Object obj) {
        return m3435e(this.f2897a, obj);
    }

    public int hashCode() {
        return m3437g(this.f2897a);
    }

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ int m3439i() {
        return this.f2897a;
    }

    public String toString() {
        return m3438h(this.f2897a);
    }

    /* JADX INFO: renamed from: b2.a$a */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class a {
        public /* synthetic */ a(AbstractC1043k abstractC1043k) {
            this();
        }

        /* JADX INFO: renamed from: a */
        public final int m3440a() {
            return C0931a.f2896d;
        }

        /* JADX INFO: renamed from: b */
        public final int m3441b() {
            return C0931a.f2895c;
        }

        public a() {
        }
    }

    /* JADX INFO: renamed from: d */
    public static int m3434d(int i10) {
        return i10;
    }
}
