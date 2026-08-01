package p015b0;

import p024b9.AbstractC1043k;

/* JADX INFO: renamed from: b0.z2 */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class C0901z2 {

    /* JADX INFO: renamed from: b */
    public static final a f2846b = new a(null);

    /* JADX INFO: renamed from: c */
    public static final int f2847c = m3306c(0);

    /* JADX INFO: renamed from: a */
    public final int f2848a;

    public /* synthetic */ C0901z2(int i10) {
        this.f2848a = i10;
    }

    /* JADX INFO: renamed from: b */
    public static final /* synthetic */ C0901z2 m3305b(int i10) {
        return new C0901z2(i10);
    }

    /* JADX INFO: renamed from: d */
    public static int m3307d(boolean z10, boolean z11, boolean z12, boolean z13, boolean z14) {
        return m3306c((z10 ? 1 : 0) | (z11 ? 2 : 0) | (z12 ? 4 : 0) | (z13 ? 8 : 0) | (z14 ? 16 : 0));
    }

    /* JADX INFO: renamed from: e */
    public static boolean m3308e(int i10, Object obj) {
        return (obj instanceof C0901z2) && i10 == ((C0901z2) obj).m3316m();
    }

    /* JADX INFO: renamed from: f */
    public static final boolean m3309f(int i10) {
        return (i10 & 16) == 16;
    }

    /* JADX INFO: renamed from: g */
    public static final boolean m3310g(int i10) {
        return (i10 & 1) == 1;
    }

    /* JADX INFO: renamed from: h */
    public static final boolean m3311h(int i10) {
        return (i10 & 4) == 4;
    }

    /* JADX INFO: renamed from: i */
    public static final boolean m3312i(int i10) {
        return (i10 & 2) == 2;
    }

    /* JADX INFO: renamed from: j */
    public static final boolean m3313j(int i10) {
        return (i10 & 8) == 8;
    }

    /* JADX INFO: renamed from: k */
    public static int m3314k(int i10) {
        return Integer.hashCode(i10);
    }

    /* JADX INFO: renamed from: l */
    public static String m3315l(int i10) {
        return "MenuItemsAvailability(value=" + i10 + ')';
    }

    public boolean equals(Object obj) {
        return m3308e(this.f2848a, obj);
    }

    public int hashCode() {
        return m3314k(this.f2848a);
    }

    /* JADX INFO: renamed from: m */
    public final /* synthetic */ int m3316m() {
        return this.f2848a;
    }

    public String toString() {
        return m3315l(this.f2848a);
    }

    /* JADX INFO: renamed from: b0.z2$a */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class a {
        public /* synthetic */ a(AbstractC1043k abstractC1043k) {
            this();
        }

        /* JADX INFO: renamed from: a */
        public final int m3317a() {
            return C0901z2.f2847c;
        }

        public a() {
        }
    }

    /* JADX INFO: renamed from: c */
    public static int m3306c(int i10) {
        return i10;
    }
}
