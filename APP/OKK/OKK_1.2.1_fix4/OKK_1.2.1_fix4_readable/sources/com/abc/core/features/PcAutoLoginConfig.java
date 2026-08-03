package com.abc.core.features;

/* JADX INFO: renamed from: c0.r */
/* JADX INFO: loaded from: classes.dex */
public final class PcAutoLoginConfig {

    /* JADX INFO: renamed from: a */
    public static volatile long f2179a;

    /* JADX INFO: renamed from: b */
    public static volatile C0707x f2180b = new C0707x(false, true, true, false, true);

    /* JADX INFO: renamed from: a */
    public static C0707x m1785a() {
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (jCurrentTimeMillis - f2179a < 3000) {
            return f2180b;
        }
        f2179a = jCurrentTimeMillis;
        ConfigStore configStore = ConfigStore.f2048a;
        f2180b = new C0707x(ConfigStore.m1661c("auto_login_win_enabled", false), ConfigStore.m1661c("auto_login_win_sync_msg", true), ConfigStore.m1661c("auto_login_win_show_device", true), ConfigStore.m1661c("auto_login_win_auto_device", false), ConfigStore.m1661c("auto_login_win_auto_click", true));
        return f2180b;
    }
}
