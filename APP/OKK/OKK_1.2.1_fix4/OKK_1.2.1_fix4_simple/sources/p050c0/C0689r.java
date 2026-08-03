package p050c0;

/* JADX INFO: renamed from: c0.r */
/* JADX INFO: loaded from: classes.dex */
public final class C0689r {

    /* JADX INFO: renamed from: a */
    public static volatile long f2179a;

    /* JADX INFO: renamed from: b */
    public static volatile C0707x f2180b;

    static {
        f2180b = new C0707x(false, true, true, false, true);
    }

    /* JADX INFO: renamed from: a */
    public static C0707x m1785a() {
        long r02 = System.currentTimeMillis();
        if ((r02 - f2179a) < 3000) goto L7;
        f2179a = r02;
        C0661h1 r1 = C0661h1.f2048a;
        f2180b = new C0707x(C0661h1.m1661c("auto_login_win_enabled", false), C0661h1.m1661c("auto_login_win_sync_msg", true), C0661h1.m1661c("auto_login_win_show_device", true), C0661h1.m1661c("auto_login_win_auto_device", false), C0661h1.m1661c("auto_login_win_auto_click", true));
        return f2180b;
    L7:
        return f2180b;
    }
}
