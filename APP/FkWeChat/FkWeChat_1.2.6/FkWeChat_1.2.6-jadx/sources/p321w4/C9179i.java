package p321w4;

/* JADX INFO: renamed from: w4.i */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class C9179i {

    /* JADX INFO: renamed from: a */
    public final C9180j f31298a;

    /* JADX INFO: renamed from: b */
    public final C9180j f31299b;

    /* JADX INFO: renamed from: c */
    public final C9180j f31300c;

    /* JADX INFO: renamed from: d */
    public final int f31301d;

    /* JADX INFO: renamed from: e */
    public final String f31302e;

    /* JADX INFO: renamed from: f */
    public C9179i f31303f;

    public C9179i(C9179i c9179i, C9180j c9180j, C9180j c9180j2) {
        this(c9180j, c9180j2, c9179i.f31300c, c9179i.f31301d, c9179i.f31302e);
        this.f31303f = c9179i.f31303f;
    }

    /* JADX INFO: renamed from: a */
    public static int m35658a(C9179i c9179i) {
        int i10 = 0;
        while (c9179i != null) {
            i10++;
            c9179i = c9179i.f31303f;
        }
        return i10;
    }

    /* JADX INFO: renamed from: b */
    public static int m35659b(C9179i c9179i) {
        return (m35658a(c9179i) * 8) + 2;
    }

    /* JADX INFO: renamed from: c */
    public static void m35660c(C9179i c9179i, C9172b c9172b) {
        c9172b.m35628j(m35658a(c9179i));
        while (c9179i != null) {
            c9172b.m35628j(c9179i.f31298a.f31306b).m35628j(c9179i.f31299b.f31306b).m35628j(c9179i.f31300c.f31306b).m35628j(c9179i.f31301d);
            c9179i = c9179i.f31303f;
        }
    }

    /* JADX INFO: renamed from: d */
    public static C9179i m35661d(C9179i c9179i, C9180j c9180j, C9180j c9180j2) {
        if (c9179i == null) {
            return null;
        }
        C9179i c9179iM35661d = m35661d(c9179i.f31303f, c9180j, c9180j2);
        c9179i.f31303f = c9179iM35661d;
        C9180j c9180j3 = c9179i.f31298a;
        int i10 = c9180j3.f31306b;
        C9180j c9180j4 = c9179i.f31299b;
        int i11 = c9180j4.f31306b;
        int i12 = c9180j.f31306b;
        int i13 = c9180j2 == null ? Integer.MAX_VALUE : c9180j2.f31306b;
        if (i12 >= i11 || i13 <= i10) {
            return c9179i;
        }
        if (i12 <= i10) {
            return i13 >= i11 ? c9179iM35661d : new C9179i(c9179i, c9180j2, c9180j4);
        }
        if (i13 >= i11) {
            return new C9179i(c9179i, c9180j3, c9180j);
        }
        c9179i.f31303f = new C9179i(c9179i, c9180j2, c9180j4);
        return new C9179i(c9179i, c9179i.f31298a, c9180j);
    }

    public C9179i(C9180j c9180j, C9180j c9180j2, C9180j c9180j3, int i10, String str) {
        this.f31298a = c9180j;
        this.f31299b = c9180j2;
        this.f31300c = c9180j3;
        this.f31301d = i10;
        this.f31302e = str;
    }
}
