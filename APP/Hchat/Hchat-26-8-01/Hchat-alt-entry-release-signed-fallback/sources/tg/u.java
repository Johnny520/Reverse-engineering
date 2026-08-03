package tg;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public enum u extends java.lang.Enum {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final tg.u f13250g = null;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final tg.u f13251h = null;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final tg.u f13252i = null;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final /* synthetic */ tg.u[] f13253j = null;

    static {
            tg.u r0 = new tg.u
            java.lang.String r1 = "START"
            r2 = 0
            r0.<init>(r1, r2)
            tg.u.f13250g = r0
            tg.u r1 = new tg.u
            java.lang.String r2 = "STOP"
            r3 = 1
            r1.<init>(r2, r3)
            tg.u.f13251h = r1
            tg.u r2 = new tg.u
            java.lang.String r3 = "STOP_AND_RESET_REPLAY_CACHE"
            r4 = 2
            r2.<init>(r3, r4)
            tg.u.f13252i = r2
            tg.u[] r0 = new tg.u[]{r0, r1, r2}
            tg.u.f13253j = r0
            return
    }

    public static tg.u valueOf(java.lang.String r1) {
            java.lang.Class<tg.u> r0 = tg.u.class
            java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
            tg.u r1 = (tg.u) r1
            return r1
    }

    public static tg.u[] values() {
            tg.u[] r0 = tg.u.f13253j
            java.lang.Object r0 = r0.clone()
            tg.u[] r0 = (tg.u[]) r0
            return r0
    }
}
