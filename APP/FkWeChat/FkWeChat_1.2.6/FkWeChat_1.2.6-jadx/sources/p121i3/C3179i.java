package p121i3;

import p024b9.AbstractC1043k;

/* JADX INFO: renamed from: i3.i */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class C3179i implements Comparable {

    /* JADX INFO: renamed from: r */
    public static final a f8458r = new a(null);

    /* JADX INFO: renamed from: s */
    public static final float f8459s = m12003k(0.0f);

    /* JADX INFO: renamed from: t */
    public static final float f8460t = m12003k(Float.POSITIVE_INFINITY);

    /* JADX INFO: renamed from: u */
    public static final float f8461u = m12003k(Float.NaN);

    /* JADX INFO: renamed from: q */
    public final float f8462q;

    public /* synthetic */ C3179i(float f10) {
        this.f8462q = f10;
    }

    /* JADX INFO: renamed from: h */
    public static final /* synthetic */ C3179i m12001h(float f10) {
        return new C3179i(f10);
    }

    /* JADX INFO: renamed from: j */
    public static int m12002j(float f10, float f11) {
        if (!C3172b.f8449b) {
            return Float.compare(f10, f11);
        }
        if (Float.isNaN(f10) || Float.isNaN(f11)) {
            return 0;
        }
        return Float.compare(f10, f11);
    }

    /* JADX INFO: renamed from: l */
    public static boolean m12004l(float f10, Object obj) {
        return (obj instanceof C3179i) && Float.compare(f10, ((C3179i) obj).m12009r()) == 0;
    }

    /* JADX INFO: renamed from: m */
    public static final boolean m12005m(float f10, float f11) {
        return Float.compare(f10, f11) == 0;
    }

    /* JADX INFO: renamed from: n */
    public static int m12006n(float f10) {
        return Float.hashCode(f10);
    }

    /* JADX INFO: renamed from: p */
    public static String m12007p(float f10) {
        if (Float.isNaN(f10)) {
            return "Dp.Unspecified";
        }
        return f10 + ".dp";
    }

    @Override // java.lang.Comparable
    public /* bridge */ /* synthetic */ int compareTo(Object obj) {
        return m12008i(((C3179i) obj).m12009r());
    }

    public boolean equals(Object obj) {
        return m12004l(this.f8462q, obj);
    }

    public int hashCode() {
        return m12006n(this.f8462q);
    }

    /* JADX INFO: renamed from: i */
    public int m12008i(float f10) {
        return m12002j(this.f8462q, f10);
    }

    /* JADX INFO: renamed from: r */
    public final /* synthetic */ float m12009r() {
        return this.f8462q;
    }

    public String toString() {
        return m12007p(this.f8462q);
    }

    /* JADX INFO: renamed from: i3.i$a */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class a {
        public /* synthetic */ a(AbstractC1043k abstractC1043k) {
            this();
        }

        /* JADX INFO: renamed from: a */
        public final float m12010a() {
            return C3179i.f8459s;
        }

        /* JADX INFO: renamed from: b */
        public final float m12011b() {
            return C3179i.f8460t;
        }

        /* JADX INFO: renamed from: c */
        public final float m12012c() {
            return C3179i.f8461u;
        }

        public a() {
        }
    }

    /* JADX INFO: renamed from: k */
    public static float m12003k(float f10) {
        return f10;
    }
}
