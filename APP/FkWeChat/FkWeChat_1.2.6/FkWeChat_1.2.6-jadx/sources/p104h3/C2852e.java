package p104h3;

import p024b9.AbstractC1043k;

/* JADX INFO: renamed from: h3.e */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class C2852e {

    /* JADX INFO: renamed from: b */
    public static final a f7419b = new a(null);

    /* JADX INFO: renamed from: c */
    public static final int f7420c = m10110e(1);

    /* JADX INFO: renamed from: d */
    public static final int f7421d = m10110e(2);

    /* JADX INFO: renamed from: e */
    public static final int f7422e = m10110e(0);

    /* JADX INFO: renamed from: a */
    public final int f7423a;

    public /* synthetic */ C2852e(int i10) {
        this.f7423a = i10;
    }

    /* JADX INFO: renamed from: d */
    public static final /* synthetic */ C2852e m10109d(int i10) {
        return new C2852e(i10);
    }

    /* JADX INFO: renamed from: f */
    public static boolean m10111f(int i10, Object obj) {
        return (obj instanceof C2852e) && i10 == ((C2852e) obj).m10115j();
    }

    /* JADX INFO: renamed from: g */
    public static final boolean m10112g(int i10, int i11) {
        return i10 == i11;
    }

    /* JADX INFO: renamed from: h */
    public static int m10113h(int i10) {
        return Integer.hashCode(i10);
    }

    /* JADX INFO: renamed from: i */
    public static String m10114i(int i10) {
        return m10112g(i10, f7420c) ? "Hyphens.None" : m10112g(i10, f7421d) ? "Hyphens.Auto" : m10112g(i10, f7422e) ? "Hyphens.Unspecified" : "Invalid";
    }

    public boolean equals(Object obj) {
        return m10111f(this.f7423a, obj);
    }

    public int hashCode() {
        return m10113h(this.f7423a);
    }

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ int m10115j() {
        return this.f7423a;
    }

    public String toString() {
        return m10114i(this.f7423a);
    }

    /* JADX INFO: renamed from: h3.e$a */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class a {
        public /* synthetic */ a(AbstractC1043k abstractC1043k) {
            this();
        }

        /* JADX INFO: renamed from: a */
        public final int m10116a() {
            return C2852e.f7421d;
        }

        /* JADX INFO: renamed from: b */
        public final int m10117b() {
            return C2852e.f7420c;
        }

        /* JADX INFO: renamed from: c */
        public final int m10118c() {
            return C2852e.f7422e;
        }

        public a() {
        }
    }

    /* JADX INFO: renamed from: e */
    public static int m10110e(int i10) {
        return i10;
    }
}
