package p277t2;

import p024b9.AbstractC1043k;

/* JADX INFO: renamed from: t2.h */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class C8073h {

    /* JADX INFO: renamed from: b */
    public static final a f26955b = new a(null);

    /* JADX INFO: renamed from: c */
    public static final int f26956c = m31161d(0);

    /* JADX INFO: renamed from: d */
    public static final int f26957d = m31161d(1);

    /* JADX INFO: renamed from: a */
    public final int f26958a;

    public /* synthetic */ C8073h(int i10) {
        this.f26958a = i10;
    }

    /* JADX INFO: renamed from: c */
    public static final /* synthetic */ C8073h m31160c(int i10) {
        return new C8073h(i10);
    }

    /* JADX INFO: renamed from: e */
    public static boolean m31162e(int i10, Object obj) {
        return (obj instanceof C8073h) && i10 == ((C8073h) obj).m31166i();
    }

    /* JADX INFO: renamed from: f */
    public static final boolean m31163f(int i10, int i11) {
        return i10 == i11;
    }

    /* JADX INFO: renamed from: g */
    public static int m31164g(int i10) {
        return Integer.hashCode(i10);
    }

    /* JADX INFO: renamed from: h */
    public static String m31165h(int i10) {
        return m31163f(i10, f26956c) ? "Polite" : m31163f(i10, f26957d) ? "Assertive" : "Unknown";
    }

    public boolean equals(Object obj) {
        return m31162e(this.f26958a, obj);
    }

    public int hashCode() {
        return m31164g(this.f26958a);
    }

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ int m31166i() {
        return this.f26958a;
    }

    public String toString() {
        return m31165h(this.f26958a);
    }

    /* JADX INFO: renamed from: t2.h$a */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class a {
        public /* synthetic */ a(AbstractC1043k abstractC1043k) {
            this();
        }

        /* JADX INFO: renamed from: a */
        public final int m31167a() {
            return C8073h.f26957d;
        }

        /* JADX INFO: renamed from: b */
        public final int m31168b() {
            return C8073h.f26956c;
        }

        public a() {
        }
    }

    /* JADX INFO: renamed from: d */
    public static int m31161d(int i10) {
        return i10;
    }
}
