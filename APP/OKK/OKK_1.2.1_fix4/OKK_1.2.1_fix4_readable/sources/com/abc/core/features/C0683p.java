package com.abc.core.features;

/* JADX INFO: renamed from: c0.p */
/* JADX INFO: loaded from: classes.dex */
public final class C0683p {

    /* JADX INFO: renamed from: a */
    public static volatile long f2141a;

    /* JADX INFO: renamed from: b */
    public static volatile C0686q f2142b = new C0686q(true, true, false, "{name}撤回了一条消息", true, true, true, false, true, true);

    /* JADX INFO: renamed from: a */
    public static C0686q m1753a() {
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (jCurrentTimeMillis - f2141a < 5000) {
            return f2142b;
        }
        f2141a = jCurrentTimeMillis;
        ConfigStore configStore = ConfigStore.f2048a;
        f2142b = new C0686q(ConfigStore.m1661c("anti_revoke", true), ConfigStore.m1661c("revoke_notice_enabled", true), ConfigStore.m1661c("anti_revoke_keep_self", false), ConfigStore.m1662d("anti_revoke_notice_text", "{name}撤回了一条消息"), ConfigStore.m1661c("media_protect_enabled", true), ConfigStore.m1661c("anti_moments_delete", true), ConfigStore.m1661c("swipe_quote", true), false, ConfigStore.m1661c("bubble_enabled", true), ConfigStore.m1661c("settings_entry_enabled", true));
        return f2142b;
    }
}
