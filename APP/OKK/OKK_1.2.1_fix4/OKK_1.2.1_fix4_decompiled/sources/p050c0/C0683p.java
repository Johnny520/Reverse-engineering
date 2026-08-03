package p050c0;

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
        C0661h1 c0661h1 = C0661h1.f2048a;
        f2142b = new C0686q(C0661h1.m1661c("anti_revoke", true), C0661h1.m1661c("revoke_notice_enabled", true), C0661h1.m1661c("anti_revoke_keep_self", false), C0661h1.m1662d("anti_revoke_notice_text", "{name}撤回了一条消息"), C0661h1.m1661c("media_protect_enabled", true), C0661h1.m1661c("anti_moments_delete", true), C0661h1.m1661c("swipe_quote", true), false, C0661h1.m1661c("bubble_enabled", true), C0661h1.m1661c("settings_entry_enabled", true));
        return f2142b;
    }
}
