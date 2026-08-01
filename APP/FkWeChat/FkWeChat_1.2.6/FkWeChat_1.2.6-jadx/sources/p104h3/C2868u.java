package p104h3;

import p024b9.AbstractC1043k;
import p024b9.AbstractC1061t;

/* JADX INFO: renamed from: h3.u */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class C2868u {

    /* JADX INFO: renamed from: c */
    public static final a f7506c;

    /* JADX INFO: renamed from: d */
    public static final C2868u f7507d;

    /* JADX INFO: renamed from: e */
    public static final C2868u f7508e;

    /* JADX INFO: renamed from: a */
    public final int f7509a;

    /* JADX INFO: renamed from: b */
    public final boolean f7510b;

    static {
        AbstractC1043k abstractC1043k = null;
        f7506c = new a(abstractC1043k);
        b.a aVar = b.f7511b;
        f7507d = new C2868u(aVar.m10294a(), false, abstractC1043k);
        f7508e = new C2868u(aVar.m10295b(), true, abstractC1043k);
    }

    public C2868u(int i10, boolean z10) {
        this.f7509a = i10;
        this.f7510b = z10;
    }

    /* JADX INFO: renamed from: b */
    public final int m10281b() {
        return this.f7509a;
    }

    /* JADX INFO: renamed from: c */
    public final boolean m10282c() {
        return this.f7510b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2868u)) {
            return false;
        }
        C2868u c2868u = (C2868u) obj;
        return b.m10290g(this.f7509a, c2868u.f7509a) && this.f7510b == c2868u.f7510b;
    }

    public int hashCode() {
        return (b.m10291h(this.f7509a) * 31) + Boolean.hashCode(this.f7510b);
    }

    public String toString() {
        return AbstractC1061t.m3842c(this, f7507d) ? "TextMotion.Static" : AbstractC1061t.m3842c(this, f7508e) ? "TextMotion.Animated" : "Invalid";
    }

    /* JADX INFO: renamed from: h3.u$b */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class b {

        /* JADX INFO: renamed from: b */
        public static final a f7511b = new a(null);

        /* JADX INFO: renamed from: c */
        public static final int f7512c = m10288e(1);

        /* JADX INFO: renamed from: d */
        public static final int f7513d = m10288e(2);

        /* JADX INFO: renamed from: e */
        public static final int f7514e = m10288e(3);

        /* JADX INFO: renamed from: a */
        public final int f7515a;

        public /* synthetic */ b(int i10) {
            this.f7515a = i10;
        }

        /* JADX INFO: renamed from: d */
        public static final /* synthetic */ b m10287d(int i10) {
            return new b(i10);
        }

        /* JADX INFO: renamed from: f */
        public static boolean m10289f(int i10, Object obj) {
            return (obj instanceof b) && i10 == ((b) obj).m10293j();
        }

        /* JADX INFO: renamed from: g */
        public static final boolean m10290g(int i10, int i11) {
            return i10 == i11;
        }

        /* JADX INFO: renamed from: h */
        public static int m10291h(int i10) {
            return Integer.hashCode(i10);
        }

        /* JADX INFO: renamed from: i */
        public static String m10292i(int i10) {
            return m10290g(i10, f7512c) ? "Linearity.Linear" : m10290g(i10, f7513d) ? "Linearity.FontHinting" : m10290g(i10, f7514e) ? "Linearity.None" : "Invalid";
        }

        public boolean equals(Object obj) {
            return m10289f(this.f7515a, obj);
        }

        public int hashCode() {
            return m10291h(this.f7515a);
        }

        /* JADX INFO: renamed from: j */
        public final /* synthetic */ int m10293j() {
            return this.f7515a;
        }

        public String toString() {
            return m10292i(this.f7515a);
        }

        /* JADX INFO: renamed from: h3.u$b$a */
        /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
        public static final class a {
            public /* synthetic */ a(AbstractC1043k abstractC1043k) {
                this();
            }

            /* JADX INFO: renamed from: a */
            public final int m10294a() {
                return b.f7513d;
            }

            /* JADX INFO: renamed from: b */
            public final int m10295b() {
                return b.f7512c;
            }

            /* JADX INFO: renamed from: c */
            public final int m10296c() {
                return b.f7514e;
            }

            public a() {
            }
        }

        /* JADX INFO: renamed from: e */
        public static int m10288e(int i10) {
            return i10;
        }
    }

    /* JADX INFO: renamed from: h3.u$a */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class a {
        public /* synthetic */ a(AbstractC1043k abstractC1043k) {
            this();
        }

        /* JADX INFO: renamed from: a */
        public final C2868u m10283a() {
            return C2868u.f7507d;
        }

        public a() {
        }
    }

    public /* synthetic */ C2868u(int i10, boolean z10, AbstractC1043k abstractC1043k) {
        this(i10, z10);
    }
}
