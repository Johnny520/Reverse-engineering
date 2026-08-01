package p104h3;

import p024b9.AbstractC1043k;

/* JADX INFO: renamed from: h3.a */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class C2848a {

    /* JADX INFO: renamed from: b */
    public static final a f7410b = new a(null);

    /* JADX INFO: renamed from: c */
    public static final float f7411c = m10094c(0.5f);

    /* JADX INFO: renamed from: d */
    public static final float f7412d = m10094c(-0.5f);

    /* JADX INFO: renamed from: e */
    public static final float f7413e = m10094c(0.0f);

    /* JADX INFO: renamed from: f */
    public static final float f7414f = m10094c(Float.NaN);

    /* JADX INFO: renamed from: a */
    public final float f7415a;

    public /* synthetic */ C2848a(float f10) {
        this.f7415a = f10;
    }

    /* JADX INFO: renamed from: b */
    public static final /* synthetic */ C2848a m10093b(float f10) {
        return new C2848a(f10);
    }

    /* JADX INFO: renamed from: d */
    public static boolean m10095d(float f10, Object obj) {
        return (obj instanceof C2848a) && Float.compare(f10, ((C2848a) obj).m10099h()) == 0;
    }

    /* JADX INFO: renamed from: e */
    public static final boolean m10096e(float f10, float f11) {
        return Float.compare(f10, f11) == 0;
    }

    /* JADX INFO: renamed from: f */
    public static int m10097f(float f10) {
        return Float.hashCode(f10);
    }

    /* JADX INFO: renamed from: g */
    public static String m10098g(float f10) {
        return "BaselineShift(multiplier=" + f10 + ')';
    }

    public boolean equals(Object obj) {
        return m10095d(this.f7415a, obj);
    }

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ float m10099h() {
        return this.f7415a;
    }

    public int hashCode() {
        return m10097f(this.f7415a);
    }

    public String toString() {
        return m10098g(this.f7415a);
    }

    /* JADX INFO: renamed from: h3.a$a */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class a {
        public /* synthetic */ a(AbstractC1043k abstractC1043k) {
            this();
        }

        /* JADX INFO: renamed from: a */
        public final float m10100a() {
            return C2848a.f7413e;
        }

        public a() {
        }
    }

    /* JADX INFO: renamed from: c */
    public static float m10094c(float f10) {
        return f10;
    }
}
