package sg;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public enum a extends java.lang.Enum {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final sg.a f12436g = null;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final sg.a f12437h = null;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final sg.a f12438i = null;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final /* synthetic */ sg.a[] f12439j = null;

    static {
            sg.a r0 = new sg.a
            java.lang.String r1 = "SUSPEND"
            r2 = 0
            r0.<init>(r1, r2)
            sg.a.f12436g = r0
            sg.a r1 = new sg.a
            java.lang.String r2 = "DROP_OLDEST"
            r3 = 1
            r1.<init>(r2, r3)
            sg.a.f12437h = r1
            sg.a r2 = new sg.a
            java.lang.String r3 = "DROP_LATEST"
            r4 = 2
            r2.<init>(r3, r4)
            sg.a.f12438i = r2
            sg.a[] r0 = new sg.a[]{r0, r1, r2}
            sg.a.f12439j = r0
            return
    }

    public static sg.a valueOf(java.lang.String r1) {
            java.lang.Class<sg.a> r0 = sg.a.class
            java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
            sg.a r1 = (sg.a) r1
            return r1
    }

    public static sg.a[] values() {
            sg.a[] r0 = sg.a.f12439j
            java.lang.Object r0 = r0.clone()
            sg.a[] r0 = (sg.a[]) r0
            return r0
    }
}
