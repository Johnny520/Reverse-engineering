package p;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public enum y extends java.lang.Enum {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final p.y f10036g = null;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final p.y f10037h = null;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final p.y f10038i = null;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final /* synthetic */ p.y[] f10039j = null;

    static {
            p.y r0 = new p.y
            java.lang.String r1 = "Vertical"
            r2 = 0
            r0.<init>(r1, r2)
            p.y.f10036g = r0
            p.y r1 = new p.y
            java.lang.String r2 = "Horizontal"
            r3 = 1
            r1.<init>(r2, r3)
            p.y.f10037h = r1
            p.y r2 = new p.y
            java.lang.String r3 = "Both"
            r4 = 2
            r2.<init>(r3, r4)
            p.y.f10038i = r2
            p.y[] r0 = new p.y[]{r0, r1, r2}
            p.y.f10039j = r0
            return
    }

    public static p.y valueOf(java.lang.String r1) {
            java.lang.Class<p.y> r0 = p.y.class
            java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
            p.y r1 = (p.y) r1
            return r1
    }

    public static p.y[] values() {
            p.y[] r0 = p.y.f10039j
            java.lang.Object r0 = r0.clone()
            p.y[] r0 = (p.y[]) r0
            return r0
    }
}
