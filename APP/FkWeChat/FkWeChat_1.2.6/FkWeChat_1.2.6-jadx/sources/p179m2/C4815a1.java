package p179m2;

import p024b9.AbstractC1043k;

/* JADX INFO: renamed from: m2.a1 */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class C4815a1 {

    /* JADX INFO: renamed from: b */
    public static final a f14338b = new a(null);

    /* JADX INFO: renamed from: c */
    public static final int f14339c = m19276c(0);

    /* JADX INFO: renamed from: d */
    public static final int f14340d = m19276c(1);

    /* JADX INFO: renamed from: a */
    public final int f14341a;

    public /* synthetic */ C4815a1(int i10) {
        this.f14341a = i10;
    }

    /* JADX INFO: renamed from: b */
    public static final /* synthetic */ C4815a1 m19275b(int i10) {
        return new C4815a1(i10);
    }

    /* JADX INFO: renamed from: d */
    public static boolean m19277d(int i10, Object obj) {
        return (obj instanceof C4815a1) && i10 == ((C4815a1) obj).m19280g();
    }

    /* JADX INFO: renamed from: e */
    public static int m19278e(int i10) {
        return Integer.hashCode(i10);
    }

    /* JADX INFO: renamed from: f */
    public static String m19279f(int i10) {
        return "AutoClearFocusBehavior(value=" + i10 + ')';
    }

    public boolean equals(Object obj) {
        return m19277d(this.f14341a, obj);
    }

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ int m19280g() {
        return this.f14341a;
    }

    public int hashCode() {
        return m19278e(this.f14341a);
    }

    public String toString() {
        return m19279f(this.f14341a);
    }

    /* JADX INFO: renamed from: m2.a1$a */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class a {
        public /* synthetic */ a(AbstractC1043k abstractC1043k) {
            this();
        }

        /* JADX INFO: renamed from: a */
        public final int m19281a() {
            return C4815a1.f14340d;
        }

        /* JADX INFO: renamed from: b */
        public final int m19282b() {
            return m19281a();
        }

        public a() {
        }
    }

    /* JADX INFO: renamed from: c */
    public static int m19276c(int i10) {
        return i10;
    }
}
