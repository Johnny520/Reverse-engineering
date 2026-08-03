package p050c0;

/* JADX INFO: renamed from: c0.F0 */
/* JADX INFO: loaded from: classes.dex */
public final class C0586F0 {

    /* JADX INFO: renamed from: a */
    public static volatile long f1762a;

    /* JADX INFO: renamed from: b */
    public static volatile C0598J0 f1763b;

    static {
        f1763b = new C0598J0();
    }

    /* JADX INFO: renamed from: a */
    public static C0598J0 m1413a() {
        long r02 = System.currentTimeMillis();
        if ((r02 - f1762a) < 5000) goto L7;
        f1762a = r02;
        C0661h1 r1 = C0661h1.f2048a;
        boolean r12 = C0661h1.m1661c("input_stats_enabled", true);
        boolean r2 = C0661h1.m1661c("input_stats_count_send", true);
        f1763b = new C0598J0(C0661h1.m1662d("input_stats_template", "今日已发${totalMsg}条"), r12, r2);
        return f1763b;
    L7:
        return f1763b;
    }
}
