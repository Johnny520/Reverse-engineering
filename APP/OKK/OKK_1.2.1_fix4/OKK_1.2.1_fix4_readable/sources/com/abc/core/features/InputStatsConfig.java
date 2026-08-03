package com.abc.core.features;

/* JADX INFO: renamed from: c0.F0 */
/* JADX INFO: loaded from: classes.dex */
public final class InputStatsConfig {

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
        ConfigStore configStore = ConfigStore.f2048a;
        f1763b = new C0598J0(ConfigStore.m1662d("input_stats_template", "今日已发${totalMsg}条"), ConfigStore.m1661c("input_stats_enabled", true), ConfigStore.m1661c("input_stats_count_send", true));
        return f1763b;
    }
}
