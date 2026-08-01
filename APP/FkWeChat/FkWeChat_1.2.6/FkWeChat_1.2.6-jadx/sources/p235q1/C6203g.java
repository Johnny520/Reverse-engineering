package p235q1;

import p024b9.AbstractC1043k;

/* JADX INFO: renamed from: q1.g */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class C6203g {

    /* JADX INFO: renamed from: b */
    public static final a f19254b = new a(null);

    /* JADX INFO: renamed from: c */
    public static final int f19255c = m24372j(1);

    /* JADX INFO: renamed from: d */
    public static final int f19256d = m24372j(2);

    /* JADX INFO: renamed from: e */
    public static final int f19257e = m24372j(3);

    /* JADX INFO: renamed from: f */
    public static final int f19258f = m24372j(4);

    /* JADX INFO: renamed from: g */
    public static final int f19259g = m24372j(5);

    /* JADX INFO: renamed from: h */
    public static final int f19260h = m24372j(6);

    /* JADX INFO: renamed from: i */
    public static final int f19261i = m24372j(7);

    /* JADX INFO: renamed from: j */
    public static final int f19262j = m24372j(8);

    /* JADX INFO: renamed from: a */
    public final int f19263a;

    public /* synthetic */ C6203g(int i10) {
        this.f19263a = i10;
    }

    /* JADX INFO: renamed from: i */
    public static final /* synthetic */ C6203g m24371i(int i10) {
        return new C6203g(i10);
    }

    /* JADX INFO: renamed from: k */
    public static boolean m24373k(int i10, Object obj) {
        return (obj instanceof C6203g) && i10 == ((C6203g) obj).m24377o();
    }

    /* JADX INFO: renamed from: l */
    public static final boolean m24374l(int i10, int i11) {
        return i10 == i11;
    }

    /* JADX INFO: renamed from: m */
    public static int m24375m(int i10) {
        return Integer.hashCode(i10);
    }

    /* JADX INFO: renamed from: n */
    public static String m24376n(int i10) {
        return m24374l(i10, f19255c) ? "Next" : m24374l(i10, f19256d) ? "Previous" : m24374l(i10, f19257e) ? "Left" : m24374l(i10, f19258f) ? "Right" : m24374l(i10, f19259g) ? "Up" : m24374l(i10, f19260h) ? "Down" : m24374l(i10, f19261i) ? "Enter" : m24374l(i10, f19262j) ? "Exit" : "Invalid FocusDirection";
    }

    public boolean equals(Object obj) {
        return m24373k(this.f19263a, obj);
    }

    public int hashCode() {
        return m24375m(this.f19263a);
    }

    /* JADX INFO: renamed from: o */
    public final /* synthetic */ int m24377o() {
        return this.f19263a;
    }

    public String toString() {
        return m24376n(this.f19263a);
    }

    /* JADX INFO: renamed from: q1.g$a */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class a {
        public /* synthetic */ a(AbstractC1043k abstractC1043k) {
            this();
        }

        /* JADX INFO: renamed from: a */
        public final int m24378a() {
            return C6203g.f19260h;
        }

        /* JADX INFO: renamed from: b */
        public final int m24379b() {
            return C6203g.f19261i;
        }

        /* JADX INFO: renamed from: c */
        public final int m24380c() {
            return C6203g.f19262j;
        }

        /* JADX INFO: renamed from: d */
        public final int m24381d() {
            return C6203g.f19257e;
        }

        /* JADX INFO: renamed from: e */
        public final int m24382e() {
            return C6203g.f19255c;
        }

        /* JADX INFO: renamed from: f */
        public final int m24383f() {
            return C6203g.f19256d;
        }

        /* JADX INFO: renamed from: g */
        public final int m24384g() {
            return C6203g.f19258f;
        }

        /* JADX INFO: renamed from: h */
        public final int m24385h() {
            return C6203g.f19259g;
        }

        public a() {
        }
    }

    /* JADX INFO: renamed from: j */
    public static int m24372j(int i10) {
        return i10;
    }
}
