package p000;

/* JADX INFO: renamed from: eg */
/* JADX INFO: loaded from: classes.dex */
public final class C1369eg {

    /* JADX INFO: renamed from: b */
    public static final C1369eg f4898b = new C1369eg(new C2220m6(23));

    /* JADX INFO: renamed from: c */
    public static final C1369eg f4899c = new C1369eg(new C2220m6(27));

    /* JADX INFO: renamed from: a */
    public final C1326dg f4900a;

    static {
        new C1369eg(new C2220m6(29));
        new C1369eg(new C2220m6(28));
        new C1369eg(new C2220m6(24));
        new C1369eg(new C2220m6(26));
        new C1369eg(new C2220m6(25));
    }

    public C1369eg(C2220m6 c2220m6) {
        if (AbstractC1489hB.m2848a()) {
            this.f4900a = new C1326dg(c2220m6, 2);
        } else if ("The Android Project".equals(System.getProperty("java.vendor"))) {
            this.f4900a = new C1326dg(c2220m6, 0);
        } else {
            this.f4900a = new C1326dg(c2220m6, 1);
        }
    }
}
