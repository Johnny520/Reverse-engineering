package x9;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public enum c extends java.lang.Enum {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final x9.c f21397o = null;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final x9.c f21398p = null;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final x9.c f21399q = null;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final /* synthetic */ x9.c[] f21400r = null;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final java.lang.String f21401g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final java.lang.String f21402h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final java.lang.String f21403i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final java.lang.String f21404j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final java.lang.String f21405k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final java.lang.String f21406l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final java.lang.String f21407m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final java.lang.String f21408n;

    static {
            x9.c r0 = new x9.c
            java.lang.String r9 = "关键词通知 %sender%"
            java.lang.String r10 = "收到关注消息"
            java.lang.String r1 = "KEYWORD"
            r2 = 0
            java.lang.String r3 = "keyword_notify_keyword_title"
            java.lang.String r4 = "keyword_notify_keyword_content"
            java.lang.String r5 = "keyword_notify_keyword_toast"
            java.lang.String r6 = "keyword_notify_keyword_sound"
            java.lang.String r7 = "keyword_notify_keyword_vibrate"
            java.lang.String r8 = "keyword_notify_keyword_ringtone"
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
            x9.c.f21397o = r0
            x9.c r1 = new x9.c
            java.lang.String r10 = "有人@我 %sender%"
            java.lang.String r11 = "有人 @ 你"
            java.lang.String r2 = "AT_ME"
            r3 = 1
            java.lang.String r4 = "keyword_notify_at_me_title"
            java.lang.String r5 = "keyword_notify_at_me_content"
            java.lang.String r6 = "keyword_notify_at_me_toast"
            java.lang.String r7 = "keyword_notify_at_me_sound"
            java.lang.String r8 = "keyword_notify_at_me_vibrate"
            java.lang.String r9 = "keyword_notify_at_me_ringtone"
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
            x9.c.f21398p = r1
            x9.c r2 = new x9.c
            java.lang.String r11 = "%keyword% %sender%"
            java.lang.String r12 = "%keyword%"
            java.lang.String r3 = "AT_ALL"
            r4 = 2
            java.lang.String r5 = "keyword_notify_at_all_title"
            java.lang.String r6 = "keyword_notify_at_all_content"
            java.lang.String r7 = "keyword_notify_at_all_toast"
            java.lang.String r8 = "keyword_notify_at_all_sound"
            java.lang.String r9 = "keyword_notify_at_all_vibrate"
            java.lang.String r10 = "keyword_notify_at_all_ringtone"
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12)
            x9.c.f21399q = r2
            x9.c[] r0 = new x9.c[]{r0, r1, r2}
            x9.c.f21400r = r0
            return
    }

    c(java.lang.String r1, int r2, java.lang.String r3, java.lang.String r4, java.lang.String r5, java.lang.String r6, java.lang.String r7, java.lang.String r8, java.lang.String r9, java.lang.String r10) {
            r0 = this;
            r0.<init>(r1, r2)
            r0.f21401g = r3
            r0.f21402h = r4
            r0.f21403i = r5
            r0.f21404j = r6
            r0.f21405k = r7
            r0.f21406l = r8
            r0.f21407m = r9
            r0.f21408n = r10
            return
    }

    public static x9.c valueOf(java.lang.String r1) {
            java.lang.Class<x9.c> r0 = x9.c.class
            java.lang.Enum r1 = j8.b.g(r0, r1)
            x9.c r1 = (x9.c) r1
            return r1
    }

    public static x9.c[] values() {
            x9.c[] r0 = x9.c.f21400r
            java.lang.Object r0 = r0.clone()
            x9.c[] r0 = (x9.c[]) r0
            return r0
    }
}
