package p264s0;

import p024b9.AbstractC1043k;

/* JADX INFO: renamed from: s0.x4 */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class C7006x4 {

    /* JADX INFO: renamed from: b */
    public static final a f23232b = new a(null);

    /* JADX INFO: renamed from: c */
    public static final int f23233c = m27641d(0);

    /* JADX INFO: renamed from: d */
    public static final int f23234d = m27641d(1);

    /* JADX INFO: renamed from: a */
    public final int f23235a;

    public /* synthetic */ C7006x4(int i10) {
        this.f23235a = i10;
    }

    /* JADX INFO: renamed from: c */
    public static final /* synthetic */ C7006x4 m27640c(int i10) {
        return new C7006x4(i10);
    }

    /* JADX INFO: renamed from: e */
    public static boolean m27642e(int i10, Object obj) {
        return (obj instanceof C7006x4) && i10 == ((C7006x4) obj).m27646i();
    }

    /* JADX INFO: renamed from: f */
    public static final boolean m27643f(int i10, int i11) {
        return i10 == i11;
    }

    /* JADX INFO: renamed from: g */
    public static int m27644g(int i10) {
        return Integer.hashCode(i10);
    }

    /* JADX INFO: renamed from: h */
    public static String m27645h(int i10) {
        return m27643f(i10, f23233c) ? "Picker" : m27643f(i10, f23234d) ? "Input" : "Unknown";
    }

    public boolean equals(Object obj) {
        return m27642e(this.f23235a, obj);
    }

    public int hashCode() {
        return m27644g(this.f23235a);
    }

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ int m27646i() {
        return this.f23235a;
    }

    public String toString() {
        return m27645h(this.f23235a);
    }

    /* JADX INFO: renamed from: s0.x4$a */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class a {
        public /* synthetic */ a(AbstractC1043k abstractC1043k) {
            this();
        }

        /* JADX INFO: renamed from: a */
        public final int m27647a() {
            return C7006x4.f23234d;
        }

        /* JADX INFO: renamed from: b */
        public final int m27648b() {
            return C7006x4.f23233c;
        }

        public a() {
        }
    }

    /* JADX INFO: renamed from: d */
    public static int m27641d(int i10) {
        return i10;
    }
}
