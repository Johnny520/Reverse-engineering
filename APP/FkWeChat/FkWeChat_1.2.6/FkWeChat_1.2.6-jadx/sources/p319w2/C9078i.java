package p319w2;

import p024b9.AbstractC1043k;

/* JADX INFO: renamed from: w2.i */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class C9078i {

    /* JADX INFO: renamed from: b */
    public static final a f31130b = new a(null);

    /* JADX INFO: renamed from: c */
    public static final int f31131c = m35287e(0);

    /* JADX INFO: renamed from: d */
    public static final int f31132d = m35287e(1);

    /* JADX INFO: renamed from: e */
    public static final int f31133e = m35287e(2);

    /* JADX INFO: renamed from: a */
    public final int f31134a;

    public /* synthetic */ C9078i(int i10) {
        this.f31134a = i10;
    }

    /* JADX INFO: renamed from: d */
    public static final /* synthetic */ C9078i m35286d(int i10) {
        return new C9078i(i10);
    }

    /* JADX INFO: renamed from: f */
    public static boolean m35288f(int i10, Object obj) {
        return (obj instanceof C9078i) && i10 == ((C9078i) obj).m35292j();
    }

    /* JADX INFO: renamed from: g */
    public static final boolean m35289g(int i10, int i11) {
        return i10 == i11;
    }

    /* JADX INFO: renamed from: h */
    public static int m35290h(int i10) {
        return Integer.hashCode(i10);
    }

    /* JADX INFO: renamed from: i */
    public static String m35291i(int i10) {
        if (i10 == f31131c) {
            return "EmojiSupportMatch.Default";
        }
        if (i10 == f31132d) {
            return "EmojiSupportMatch.None";
        }
        if (i10 == f31133e) {
            return "EmojiSupportMatch.All";
        }
        return "Invalid(value=" + i10 + ')';
    }

    public boolean equals(Object obj) {
        return m35288f(this.f31134a, obj);
    }

    public int hashCode() {
        return m35290h(this.f31134a);
    }

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ int m35292j() {
        return this.f31134a;
    }

    public String toString() {
        return m35291i(this.f31134a);
    }

    /* JADX INFO: renamed from: w2.i$a */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class a {
        public /* synthetic */ a(AbstractC1043k abstractC1043k) {
            this();
        }

        /* JADX INFO: renamed from: a */
        public final int m35293a() {
            return C9078i.f31133e;
        }

        /* JADX INFO: renamed from: b */
        public final int m35294b() {
            return C9078i.f31131c;
        }

        /* JADX INFO: renamed from: c */
        public final int m35295c() {
            return C9078i.f31132d;
        }

        public a() {
        }
    }

    /* JADX INFO: renamed from: e */
    public static int m35287e(int i10) {
        return i10;
    }
}
