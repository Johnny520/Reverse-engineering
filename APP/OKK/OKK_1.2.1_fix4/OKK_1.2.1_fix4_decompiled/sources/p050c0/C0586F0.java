package p050c0;

/* JADX INFO: renamed from: c0.F0 */
/* JADX INFO: loaded from: classes.dex */
public final class C0586F0 {

    /* JADX INFO: renamed from: a */
    public static volatile long f1762a;

    /* JADX INFO: renamed from: b */
    public static volatile C0598J0 f1763b = new C0598J0();

    /* JADX INFO: renamed from: a */
    public static C0598J0 m1413a() {
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (jCurrentTimeMillis - f1762a < 5000) {
            return f1763b;
        }
        f1762a = jCurrentTimeMillis;
        C0661h1 c0661h1 = C0661h1.f2048a;
        f1763b = new C0598J0(C0661h1.m1662d("input_stats_template", "今日已发${totalMsg}条"), C0661h1.m1661c("input_stats_enabled", true), C0661h1.m1661c("input_stats_count_send", true));
        return f1763b;
    }
}
