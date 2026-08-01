package p104h3;

import p024b9.AbstractC1043k;

/* JADX INFO: renamed from: h3.v */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2869v {

    /* JADX INFO: renamed from: a */
    public static final a f7516a = new a(null);

    /* JADX INFO: renamed from: b */
    public static final int f7517b = m10302f(1);

    /* JADX INFO: renamed from: c */
    public static final int f7518c = m10302f(2);

    /* JADX INFO: renamed from: d */
    public static final int f7519d = m10302f(3);

    /* JADX INFO: renamed from: e */
    public static final int f7520e = m10302f(4);

    /* JADX INFO: renamed from: f */
    public static final int f7521f = m10302f(5);

    /* JADX INFO: renamed from: g */
    public static final boolean m10303g(int i10, int i11) {
        return i10 == i11;
    }

    /* JADX INFO: renamed from: h */
    public static int m10304h(int i10) {
        return Integer.hashCode(i10);
    }

    /* JADX INFO: renamed from: i */
    public static String m10305i(int i10) {
        return m10303g(i10, f7517b) ? "Clip" : m10303g(i10, f7518c) ? "Ellipsis" : m10303g(i10, f7521f) ? "MiddleEllipsis" : m10303g(i10, f7519d) ? "Visible" : m10303g(i10, f7520e) ? "StartEllipsis" : "Invalid";
    }

    /* JADX INFO: renamed from: h3.v$a */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class a {
        public /* synthetic */ a(AbstractC1043k abstractC1043k) {
            this();
        }

        /* JADX INFO: renamed from: a */
        public final int m10306a() {
            return AbstractC2869v.f7517b;
        }

        /* JADX INFO: renamed from: b */
        public final int m10307b() {
            return AbstractC2869v.f7518c;
        }

        /* JADX INFO: renamed from: c */
        public final int m10308c() {
            return AbstractC2869v.f7521f;
        }

        /* JADX INFO: renamed from: d */
        public final int m10309d() {
            return AbstractC2869v.f7520e;
        }

        /* JADX INFO: renamed from: e */
        public final int m10310e() {
            return AbstractC2869v.f7519d;
        }

        public a() {
        }
    }

    /* JADX INFO: renamed from: f */
    public static int m10302f(int i10) {
        return i10;
    }
}
