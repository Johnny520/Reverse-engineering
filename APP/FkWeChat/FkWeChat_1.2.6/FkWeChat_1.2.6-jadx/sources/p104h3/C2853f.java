package p104h3;

import p024b9.AbstractC1043k;

/* JADX INFO: renamed from: h3.f */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class C2853f {

    /* JADX INFO: renamed from: b */
    public static final a f7424b = new a(null);

    /* JADX INFO: renamed from: c */
    public static final int f7425c;

    /* JADX INFO: renamed from: d */
    public static final int f7426d;

    /* JADX INFO: renamed from: e */
    public static final int f7427e;

    /* JADX INFO: renamed from: f */
    public static final int f7428f;

    /* JADX INFO: renamed from: a */
    public final int f7429a;

    static {
        b.a aVar = b.f7430a;
        int iM10141c = aVar.m10141c();
        c.a aVar2 = c.f7435a;
        int iM10151c = aVar2.m10151c();
        d.a aVar3 = d.f7441a;
        f7425c = m10122d(AbstractC2854g.m10164e(iM10141c, iM10151c, aVar3.m10158a()));
        f7426d = m10122d(AbstractC2854g.m10164e(aVar.m10139a(), aVar2.m10150b(), aVar3.m10159b()));
        f7427e = m10122d(AbstractC2854g.m10164e(aVar.m10140b(), aVar2.m10152d(), aVar3.m10158a()));
        f7428f = m10122d(0);
    }

    public /* synthetic */ C2853f(int i10) {
        this.f7429a = i10;
    }

    /* JADX INFO: renamed from: c */
    public static final /* synthetic */ C2853f m10121c(int i10) {
        return new C2853f(i10);
    }

    /* JADX INFO: renamed from: e */
    public static boolean m10123e(int i10, Object obj) {
        return (obj instanceof C2853f) && i10 == ((C2853f) obj).m10130l();
    }

    /* JADX INFO: renamed from: f */
    public static final boolean m10124f(int i10, int i11) {
        return i10 == i11;
    }

    /* JADX INFO: renamed from: g */
    public static final int m10125g(int i10) {
        return b.m10136d(AbstractC2854g.m10165f(i10));
    }

    /* JADX INFO: renamed from: h */
    public static final int m10126h(int i10) {
        return c.m10146e(AbstractC2854g.m10166g(i10));
    }

    /* JADX INFO: renamed from: i */
    public static final int m10127i(int i10) {
        return d.m10155c(AbstractC2854g.m10167h(i10));
    }

    /* JADX INFO: renamed from: j */
    public static int m10128j(int i10) {
        return Integer.hashCode(i10);
    }

    /* JADX INFO: renamed from: k */
    public static String m10129k(int i10) {
        return "LineBreak(strategy=" + ((Object) b.m10138f(m10125g(i10))) + ", strictness=" + ((Object) c.m10148g(m10126h(i10))) + ", wordBreak=" + ((Object) d.m10157e(m10127i(i10))) + ')';
    }

    public boolean equals(Object obj) {
        return m10123e(this.f7429a, obj);
    }

    public int hashCode() {
        return m10128j(this.f7429a);
    }

    /* JADX INFO: renamed from: l */
    public final /* synthetic */ int m10130l() {
        return this.f7429a;
    }

    public String toString() {
        return m10129k(this.f7429a);
    }

    /* JADX INFO: renamed from: h3.f$b */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class b {

        /* JADX INFO: renamed from: a */
        public static final a f7430a = new a(null);

        /* JADX INFO: renamed from: b */
        public static final int f7431b = m10136d(1);

        /* JADX INFO: renamed from: c */
        public static final int f7432c = m10136d(2);

        /* JADX INFO: renamed from: d */
        public static final int f7433d = m10136d(3);

        /* JADX INFO: renamed from: e */
        public static final int f7434e = m10136d(0);

        /* JADX INFO: renamed from: e */
        public static final boolean m10137e(int i10, int i11) {
            return i10 == i11;
        }

        /* JADX INFO: renamed from: f */
        public static String m10138f(int i10) {
            return m10137e(i10, f7431b) ? "Strategy.Simple" : m10137e(i10, f7432c) ? "Strategy.HighQuality" : m10137e(i10, f7433d) ? "Strategy.Balanced" : m10137e(i10, f7434e) ? "Strategy.Unspecified" : "Invalid";
        }

        /* JADX INFO: renamed from: h3.f$b$a */
        /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
        public static final class a {
            public /* synthetic */ a(AbstractC1043k abstractC1043k) {
                this();
            }

            /* JADX INFO: renamed from: a */
            public final int m10139a() {
                return b.f7433d;
            }

            /* JADX INFO: renamed from: b */
            public final int m10140b() {
                return b.f7432c;
            }

            /* JADX INFO: renamed from: c */
            public final int m10141c() {
                return b.f7431b;
            }

            public a() {
            }
        }

        /* JADX INFO: renamed from: d */
        public static int m10136d(int i10) {
            return i10;
        }
    }

    /* JADX INFO: renamed from: h3.f$c */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class c {

        /* JADX INFO: renamed from: a */
        public static final a f7435a = new a(null);

        /* JADX INFO: renamed from: b */
        public static final int f7436b = m10146e(1);

        /* JADX INFO: renamed from: c */
        public static final int f7437c = m10146e(2);

        /* JADX INFO: renamed from: d */
        public static final int f7438d = m10146e(3);

        /* JADX INFO: renamed from: e */
        public static final int f7439e = m10146e(4);

        /* JADX INFO: renamed from: f */
        public static final int f7440f = m10146e(0);

        /* JADX INFO: renamed from: f */
        public static final boolean m10147f(int i10, int i11) {
            return i10 == i11;
        }

        /* JADX INFO: renamed from: g */
        public static String m10148g(int i10) {
            return m10147f(i10, f7436b) ? "Strictness.None" : m10147f(i10, f7437c) ? "Strictness.Loose" : m10147f(i10, f7438d) ? "Strictness.Normal" : m10147f(i10, f7439e) ? "Strictness.Strict" : m10147f(i10, f7440f) ? "Strictness.Unspecified" : "Invalid";
        }

        /* JADX INFO: renamed from: h3.f$c$a */
        /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
        public static final class a {
            public /* synthetic */ a(AbstractC1043k abstractC1043k) {
                this();
            }

            /* JADX INFO: renamed from: a */
            public final int m10149a() {
                return c.f7436b;
            }

            /* JADX INFO: renamed from: b */
            public final int m10150b() {
                return c.f7437c;
            }

            /* JADX INFO: renamed from: c */
            public final int m10151c() {
                return c.f7438d;
            }

            /* JADX INFO: renamed from: d */
            public final int m10152d() {
                return c.f7439e;
            }

            public a() {
            }
        }

        /* JADX INFO: renamed from: e */
        public static int m10146e(int i10) {
            return i10;
        }
    }

    /* JADX INFO: renamed from: h3.f$d */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class d {

        /* JADX INFO: renamed from: a */
        public static final a f7441a = new a(null);

        /* JADX INFO: renamed from: b */
        public static final int f7442b = m10155c(1);

        /* JADX INFO: renamed from: c */
        public static final int f7443c = m10155c(2);

        /* JADX INFO: renamed from: d */
        public static final int f7444d = m10155c(0);

        /* JADX INFO: renamed from: d */
        public static final boolean m10156d(int i10, int i11) {
            return i10 == i11;
        }

        /* JADX INFO: renamed from: e */
        public static String m10157e(int i10) {
            return m10156d(i10, f7442b) ? "WordBreak.None" : m10156d(i10, f7443c) ? "WordBreak.Phrase" : m10156d(i10, f7444d) ? "WordBreak.Unspecified" : "Invalid";
        }

        /* JADX INFO: renamed from: h3.f$d$a */
        /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
        public static final class a {
            public /* synthetic */ a(AbstractC1043k abstractC1043k) {
                this();
            }

            /* JADX INFO: renamed from: a */
            public final int m10158a() {
                return d.f7442b;
            }

            /* JADX INFO: renamed from: b */
            public final int m10159b() {
                return d.f7443c;
            }

            public a() {
            }
        }

        /* JADX INFO: renamed from: c */
        public static int m10155c(int i10) {
            return i10;
        }
    }

    /* JADX INFO: renamed from: h3.f$a */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class a {
        public /* synthetic */ a(AbstractC1043k abstractC1043k) {
            this();
        }

        /* JADX INFO: renamed from: a */
        public final int m10131a() {
            return C2853f.f7425c;
        }

        /* JADX INFO: renamed from: b */
        public final int m10132b() {
            return C2853f.f7428f;
        }

        public a() {
        }
    }

    /* JADX INFO: renamed from: d */
    public static int m10122d(int i10) {
        return i10;
    }
}
