package fb;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public enum u2 extends java.lang.Enum {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final fb.u2 f3819g = null;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final fb.u2 f3820h = null;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final fb.u2 f3821i = null;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final /* synthetic */ fb.u2[] f3822j = null;

    static {
            fb.u2 r0 = new fb.u2
            java.lang.String r1 = "CANCEL"
            r2 = 0
            r0.<init>(r1, r2)
            fb.u2.f3819g = r0
            fb.u2 r1 = new fb.u2
            java.lang.String r2 = "APPROVE_ONCE"
            r3 = 1
            r1.<init>(r2, r3)
            fb.u2.f3820h = r1
            fb.u2 r2 = new fb.u2
            java.lang.String r3 = "ALWAYS_ALLOW"
            r4 = 2
            r2.<init>(r3, r4)
            fb.u2.f3821i = r2
            fb.u2[] r0 = new fb.u2[]{r0, r1, r2}
            fb.u2.f3822j = r0
            return
    }

    public static fb.u2 valueOf(java.lang.String r1) {
            java.lang.Class<fb.u2> r0 = fb.u2.class
            java.lang.Enum r1 = j8.b.g(r0, r1)
            fb.u2 r1 = (fb.u2) r1
            return r1
    }

    public static fb.u2[] values() {
            fb.u2[] r0 = fb.u2.f3822j
            java.lang.Object r0 = r0.clone()
            fb.u2[] r0 = (fb.u2[]) r0
            return r0
    }
}
