package p104h3;

import p024b9.AbstractC1043k;

/* JADX INFO: renamed from: h3.j */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class C2857j {

    /* JADX INFO: renamed from: b */
    public static final a f7471b = new a(null);

    /* JADX INFO: renamed from: c */
    public static final int f7472c = m10219i(1);

    /* JADX INFO: renamed from: d */
    public static final int f7473d = m10219i(2);

    /* JADX INFO: renamed from: e */
    public static final int f7474e = m10219i(3);

    /* JADX INFO: renamed from: f */
    public static final int f7475f = m10219i(4);

    /* JADX INFO: renamed from: g */
    public static final int f7476g = m10219i(5);

    /* JADX INFO: renamed from: h */
    public static final int f7477h = m10219i(6);

    /* JADX INFO: renamed from: i */
    public static final int f7478i = m10219i(0);

    /* JADX INFO: renamed from: a */
    public final int f7479a;

    public /* synthetic */ C2857j(int i10) {
        this.f7479a = i10;
    }

    /* JADX INFO: renamed from: h */
    public static final /* synthetic */ C2857j m10218h(int i10) {
        return new C2857j(i10);
    }

    /* JADX INFO: renamed from: j */
    public static boolean m10220j(int i10, Object obj) {
        return (obj instanceof C2857j) && i10 == ((C2857j) obj).m10224n();
    }

    /* JADX INFO: renamed from: k */
    public static final boolean m10221k(int i10, int i11) {
        return i10 == i11;
    }

    /* JADX INFO: renamed from: l */
    public static int m10222l(int i10) {
        return Integer.hashCode(i10);
    }

    /* JADX INFO: renamed from: m */
    public static String m10223m(int i10) {
        return m10221k(i10, f7472c) ? "Left" : m10221k(i10, f7473d) ? "Right" : m10221k(i10, f7474e) ? "Center" : m10221k(i10, f7475f) ? "Justify" : m10221k(i10, f7476g) ? "Start" : m10221k(i10, f7477h) ? "End" : m10221k(i10, f7478i) ? "Unspecified" : "Invalid";
    }

    public boolean equals(Object obj) {
        return m10220j(this.f7479a, obj);
    }

    public int hashCode() {
        return m10222l(this.f7479a);
    }

    /* JADX INFO: renamed from: n */
    public final /* synthetic */ int m10224n() {
        return this.f7479a;
    }

    public String toString() {
        return m10223m(this.f7479a);
    }

    /* JADX INFO: renamed from: h3.j$a */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class a {
        public /* synthetic */ a(AbstractC1043k abstractC1043k) {
            this();
        }

        /* JADX INFO: renamed from: a */
        public final int m10225a() {
            return C2857j.f7474e;
        }

        /* JADX INFO: renamed from: b */
        public final int m10226b() {
            return C2857j.f7477h;
        }

        /* JADX INFO: renamed from: c */
        public final int m10227c() {
            return C2857j.f7475f;
        }

        /* JADX INFO: renamed from: d */
        public final int m10228d() {
            return C2857j.f7472c;
        }

        /* JADX INFO: renamed from: e */
        public final int m10229e() {
            return C2857j.f7473d;
        }

        /* JADX INFO: renamed from: f */
        public final int m10230f() {
            return C2857j.f7476g;
        }

        /* JADX INFO: renamed from: g */
        public final int m10231g() {
            return C2857j.f7478i;
        }

        public a() {
        }
    }

    /* JADX INFO: renamed from: i */
    public static int m10219i(int i10) {
        return i10;
    }
}
