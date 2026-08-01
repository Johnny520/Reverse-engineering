package p004a3;

import p024b9.AbstractC1043k;

/* JADX INFO: renamed from: a3.p */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class C0052p {

    /* JADX INFO: renamed from: b */
    public static final a f99b = new a(null);

    /* JADX INFO: renamed from: c */
    public static final int f100c = m171d(0);

    /* JADX INFO: renamed from: d */
    public static final int f101d = m171d(1);

    /* JADX INFO: renamed from: a */
    public final int f102a;

    public /* synthetic */ C0052p(int i10) {
        this.f102a = i10;
    }

    /* JADX INFO: renamed from: c */
    public static final /* synthetic */ C0052p m170c(int i10) {
        return new C0052p(i10);
    }

    /* JADX INFO: renamed from: e */
    public static boolean m172e(int i10, Object obj) {
        return (obj instanceof C0052p) && i10 == ((C0052p) obj).m176i();
    }

    /* JADX INFO: renamed from: f */
    public static final boolean m173f(int i10, int i11) {
        return i10 == i11;
    }

    /* JADX INFO: renamed from: g */
    public static int m174g(int i10) {
        return Integer.hashCode(i10);
    }

    /* JADX INFO: renamed from: h */
    public static String m175h(int i10) {
        return m173f(i10, f100c) ? "Normal" : m173f(i10, f101d) ? "Italic" : "Invalid";
    }

    public boolean equals(Object obj) {
        return m172e(this.f102a, obj);
    }

    public int hashCode() {
        return m174g(this.f102a);
    }

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ int m176i() {
        return this.f102a;
    }

    public String toString() {
        return m175h(this.f102a);
    }

    /* JADX INFO: renamed from: a3.p$a */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class a {
        public /* synthetic */ a(AbstractC1043k abstractC1043k) {
            this();
        }

        /* JADX INFO: renamed from: a */
        public final int m177a() {
            return C0052p.f101d;
        }

        /* JADX INFO: renamed from: b */
        public final int m178b() {
            return C0052p.f100c;
        }

        public a() {
        }
    }

    /* JADX INFO: renamed from: d */
    public static int m171d(int i10) {
        return i10;
    }
}
