package p319w2;

import p024b9.AbstractC1043k;

/* JADX INFO: renamed from: w2.e0 */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC9059e0 {

    /* JADX INFO: renamed from: a */
    public static final a f31078a = new a(null);

    /* JADX INFO: renamed from: b */
    public static final int f31079b = m35202h(1);

    /* JADX INFO: renamed from: c */
    public static final int f31080c = m35202h(2);

    /* JADX INFO: renamed from: d */
    public static final int f31081d = m35202h(3);

    /* JADX INFO: renamed from: e */
    public static final int f31082e = m35202h(4);

    /* JADX INFO: renamed from: f */
    public static final int f31083f = m35202h(5);

    /* JADX INFO: renamed from: g */
    public static final int f31084g = m35202h(6);

    /* JADX INFO: renamed from: h */
    public static final int f31085h = m35202h(7);

    /* JADX INFO: renamed from: i */
    public static final boolean m35203i(int i10, int i11) {
        return i10 == i11;
    }

    /* JADX INFO: renamed from: j */
    public static int m35204j(int i10) {
        return Integer.hashCode(i10);
    }

    /* JADX INFO: renamed from: k */
    public static String m35205k(int i10) {
        return m35203i(i10, f31079b) ? "AboveBaseline" : m35203i(i10, f31080c) ? "Top" : m35203i(i10, f31081d) ? "Bottom" : m35203i(i10, f31082e) ? "Center" : m35203i(i10, f31083f) ? "TextTop" : m35203i(i10, f31084g) ? "TextBottom" : m35203i(i10, f31085h) ? "TextCenter" : "Invalid";
    }

    /* JADX INFO: renamed from: w2.e0$a */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class a {
        public /* synthetic */ a(AbstractC1043k abstractC1043k) {
            this();
        }

        /* JADX INFO: renamed from: a */
        public final int m35206a() {
            return AbstractC9059e0.f31079b;
        }

        /* JADX INFO: renamed from: b */
        public final int m35207b() {
            return AbstractC9059e0.f31081d;
        }

        /* JADX INFO: renamed from: c */
        public final int m35208c() {
            return AbstractC9059e0.f31082e;
        }

        /* JADX INFO: renamed from: d */
        public final int m35209d() {
            return AbstractC9059e0.f31084g;
        }

        /* JADX INFO: renamed from: e */
        public final int m35210e() {
            return AbstractC9059e0.f31085h;
        }

        /* JADX INFO: renamed from: f */
        public final int m35211f() {
            return AbstractC9059e0.f31083f;
        }

        /* JADX INFO: renamed from: g */
        public final int m35212g() {
            return AbstractC9059e0.f31080c;
        }

        public a() {
        }
    }

    /* JADX INFO: renamed from: h */
    public static int m35202h(int i10) {
        return i10;
    }
}
