package p104h3;

import p024b9.AbstractC1043k;
import p030c3.AbstractC1314a;

/* JADX INFO: renamed from: h3.h */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class C2855h {

    /* JADX INFO: renamed from: d */
    public static final b f7445d;

    /* JADX INFO: renamed from: e */
    public static final C2855h f7446e;

    /* JADX INFO: renamed from: a */
    public final float f7447a;

    /* JADX INFO: renamed from: b */
    public final int f7448b;

    /* JADX INFO: renamed from: c */
    public final int f7449c;

    static {
        AbstractC1043k abstractC1043k = null;
        f7445d = new b(abstractC1043k);
        f7446e = new C2855h(a.f7450b.m10182b(), d.f7461b.m10208a(), c.f7456b.m10194a(), abstractC1043k);
    }

    public C2855h(float f10, int i10) {
        this(f10, i10, c.f7456b.m10194a(), null);
    }

    /* JADX INFO: renamed from: b */
    public final float m10169b() {
        return this.f7447a;
    }

    /* JADX INFO: renamed from: c */
    public final int m10170c() {
        return this.f7449c;
    }

    /* JADX INFO: renamed from: d */
    public final int m10171d() {
        return this.f7448b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2855h)) {
            return false;
        }
        C2855h c2855h = (C2855h) obj;
        return a.m10177f(this.f7447a, c2855h.f7447a) && d.m10202f(this.f7448b, c2855h.f7448b) && c.m10190g(this.f7449c, c2855h.f7449c);
    }

    public int hashCode() {
        return (((a.m10178g(this.f7447a) * 31) + d.m10203g(this.f7448b)) * 31) + c.m10191h(this.f7449c);
    }

    public String toString() {
        return "LineHeightStyle(alignment=" + ((Object) a.m10179h(this.f7447a)) + ", trim=" + ((Object) d.m10206j(this.f7448b)) + ",mode=" + ((Object) c.m10192i(this.f7449c)) + ')';
    }

    /* JADX INFO: renamed from: h3.h$a */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class a {

        /* JADX INFO: renamed from: b */
        public static final C10089a f7450b = new C10089a(null);

        /* JADX INFO: renamed from: c */
        public static final float f7451c = m10175d(0.0f);

        /* JADX INFO: renamed from: d */
        public static final float f7452d = m10175d(0.5f);

        /* JADX INFO: renamed from: e */
        public static final float f7453e = m10175d(-1.0f);

        /* JADX INFO: renamed from: f */
        public static final float f7454f = m10175d(1.0f);

        /* JADX INFO: renamed from: a */
        public final float f7455a;

        public /* synthetic */ a(float f10) {
            this.f7455a = f10;
        }

        /* JADX INFO: renamed from: c */
        public static final /* synthetic */ a m10174c(float f10) {
            return new a(f10);
        }

        /* JADX INFO: renamed from: d */
        public static float m10175d(float f10) {
            if (!((0.0f <= f10 && f10 <= 1.0f) || f10 == -1.0f)) {
                AbstractC1314a.m5293c("topRatio should be in [0..1] range or -1");
            }
            return f10;
        }

        /* JADX INFO: renamed from: e */
        public static boolean m10176e(float f10, Object obj) {
            return (obj instanceof a) && Float.compare(f10, ((a) obj).m10180i()) == 0;
        }

        /* JADX INFO: renamed from: f */
        public static final boolean m10177f(float f10, float f11) {
            return Float.compare(f10, f11) == 0;
        }

        /* JADX INFO: renamed from: g */
        public static int m10178g(float f10) {
            return Float.hashCode(f10);
        }

        /* JADX INFO: renamed from: h */
        public static String m10179h(float f10) {
            if (f10 == f7451c) {
                return "LineHeightStyle.Alignment.Top";
            }
            if (f10 == f7452d) {
                return "LineHeightStyle.Alignment.Center";
            }
            if (f10 == f7453e) {
                return "LineHeightStyle.Alignment.Proportional";
            }
            if (f10 == f7454f) {
                return "LineHeightStyle.Alignment.Bottom";
            }
            return "LineHeightStyle.Alignment(topPercentage = " + f10 + ')';
        }

        public boolean equals(Object obj) {
            return m10176e(this.f7455a, obj);
        }

        public int hashCode() {
            return m10178g(this.f7455a);
        }

        /* JADX INFO: renamed from: i */
        public final /* synthetic */ float m10180i() {
            return this.f7455a;
        }

        public String toString() {
            return m10179h(this.f7455a);
        }

        /* JADX INFO: renamed from: h3.h$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
        public static final class C10089a {
            public /* synthetic */ C10089a(AbstractC1043k abstractC1043k) {
                this();
            }

            /* JADX INFO: renamed from: a */
            public final float m10181a() {
                return a.f7452d;
            }

            /* JADX INFO: renamed from: b */
            public final float m10182b() {
                return a.f7453e;
            }

            public C10089a() {
            }
        }
    }

    /* JADX INFO: renamed from: h3.h$c */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class c {

        /* JADX INFO: renamed from: b */
        public static final a f7456b = new a(null);

        /* JADX INFO: renamed from: c */
        public static final int f7457c = m10188e(0);

        /* JADX INFO: renamed from: d */
        public static final int f7458d = m10188e(1);

        /* JADX INFO: renamed from: e */
        public static final int f7459e = m10188e(2);

        /* JADX INFO: renamed from: a */
        public final int f7460a;

        public /* synthetic */ c(int i10) {
            this.f7460a = i10;
        }

        /* JADX INFO: renamed from: d */
        public static final /* synthetic */ c m10187d(int i10) {
            return new c(i10);
        }

        /* JADX INFO: renamed from: f */
        public static boolean m10189f(int i10, Object obj) {
            return (obj instanceof c) && i10 == ((c) obj).m10193j();
        }

        /* JADX INFO: renamed from: g */
        public static final boolean m10190g(int i10, int i11) {
            return i10 == i11;
        }

        /* JADX INFO: renamed from: h */
        public static int m10191h(int i10) {
            return Integer.hashCode(i10);
        }

        /* JADX INFO: renamed from: i */
        public static String m10192i(int i10) {
            return m10190g(i10, f7457c) ? "LineHeightStyle.Mode.Fixed" : m10190g(i10, f7458d) ? "LineHeightStyle.Mode.Minimum" : m10190g(i10, f7459e) ? "LineHeightStyle.Mode.Tight" : "Invalid";
        }

        public boolean equals(Object obj) {
            return m10189f(this.f7460a, obj);
        }

        public int hashCode() {
            return m10191h(this.f7460a);
        }

        /* JADX INFO: renamed from: j */
        public final /* synthetic */ int m10193j() {
            return this.f7460a;
        }

        public String toString() {
            return m10192i(this.f7460a);
        }

        /* JADX INFO: renamed from: h3.h$c$a */
        /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
        public static final class a {
            public /* synthetic */ a(AbstractC1043k abstractC1043k) {
                this();
            }

            /* JADX INFO: renamed from: a */
            public final int m10194a() {
                return c.f7457c;
            }

            /* JADX INFO: renamed from: b */
            public final int m10195b() {
                return c.f7458d;
            }

            /* JADX INFO: renamed from: c */
            public final int m10196c() {
                return c.f7459e;
            }

            public a() {
            }
        }

        /* JADX INFO: renamed from: e */
        public static int m10188e(int i10) {
            return i10;
        }
    }

    /* JADX INFO: renamed from: h3.h$d */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class d {

        /* JADX INFO: renamed from: b */
        public static final a f7461b = new a(null);

        /* JADX INFO: renamed from: c */
        public static final int f7462c = m10200d(1);

        /* JADX INFO: renamed from: d */
        public static final int f7463d = m10200d(16);

        /* JADX INFO: renamed from: e */
        public static final int f7464e = m10200d(17);

        /* JADX INFO: renamed from: f */
        public static final int f7465f = m10200d(0);

        /* JADX INFO: renamed from: a */
        public final int f7466a;

        public /* synthetic */ d(int i10) {
            this.f7466a = i10;
        }

        /* JADX INFO: renamed from: c */
        public static final /* synthetic */ d m10199c(int i10) {
            return new d(i10);
        }

        /* JADX INFO: renamed from: e */
        public static boolean m10201e(int i10, Object obj) {
            return (obj instanceof d) && i10 == ((d) obj).m10207k();
        }

        /* JADX INFO: renamed from: f */
        public static final boolean m10202f(int i10, int i11) {
            return i10 == i11;
        }

        /* JADX INFO: renamed from: g */
        public static int m10203g(int i10) {
            return Integer.hashCode(i10);
        }

        /* JADX INFO: renamed from: h */
        public static final boolean m10204h(int i10) {
            return (i10 & 1) > 0;
        }

        /* JADX INFO: renamed from: i */
        public static final boolean m10205i(int i10) {
            return (i10 & 16) > 0;
        }

        /* JADX INFO: renamed from: j */
        public static String m10206j(int i10) {
            return i10 == f7462c ? "LineHeightStyle.Trim.FirstLineTop" : i10 == f7463d ? "LineHeightStyle.Trim.LastLineBottom" : i10 == f7464e ? "LineHeightStyle.Trim.Both" : i10 == f7465f ? "LineHeightStyle.Trim.None" : "Invalid";
        }

        public boolean equals(Object obj) {
            return m10201e(this.f7466a, obj);
        }

        public int hashCode() {
            return m10203g(this.f7466a);
        }

        /* JADX INFO: renamed from: k */
        public final /* synthetic */ int m10207k() {
            return this.f7466a;
        }

        public String toString() {
            return m10206j(this.f7466a);
        }

        /* JADX INFO: renamed from: h3.h$d$a */
        /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
        public static final class a {
            public /* synthetic */ a(AbstractC1043k abstractC1043k) {
                this();
            }

            /* JADX INFO: renamed from: a */
            public final int m10208a() {
                return d.f7464e;
            }

            /* JADX INFO: renamed from: b */
            public final int m10209b() {
                return d.f7465f;
            }

            public a() {
            }
        }

        /* JADX INFO: renamed from: d */
        public static int m10200d(int i10) {
            return i10;
        }
    }

    /* JADX INFO: renamed from: h3.h$b */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class b {
        public /* synthetic */ b(AbstractC1043k abstractC1043k) {
            this();
        }

        /* JADX INFO: renamed from: a */
        public final C2855h m10183a() {
            return C2855h.f7446e;
        }

        public b() {
        }
    }

    public /* synthetic */ C2855h(float f10, int i10, AbstractC1043k abstractC1043k) {
        this(f10, i10);
    }

    public C2855h(float f10, int i10, int i11) {
        this.f7447a = f10;
        this.f7448b = i10;
        this.f7449c = i11;
    }

    public /* synthetic */ C2855h(float f10, int i10, int i11, AbstractC1043k abstractC1043k) {
        this(f10, i10, i11);
    }
}
