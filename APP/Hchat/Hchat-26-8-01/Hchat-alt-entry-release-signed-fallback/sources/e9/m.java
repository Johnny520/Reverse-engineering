package e9;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class m implements fg.l {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final e9.m f2444h = null;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final e9.m f2445i = null;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final e9.m f2446j = null;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f2447g;

    static {
            e9.m r0 = new e9.m
            r1 = 0
            r0.<init>(r1)
            e9.m.f2444h = r0
            e9.m r0 = new e9.m
            r1 = 1
            r0.<init>(r1)
            e9.m.f2445i = r0
            e9.m r0 = new e9.m
            r1 = 2
            r0.<init>(r1)
            e9.m.f2446j = r0
            return
    }

    public /* synthetic */ m(int r1) {
            r0 = this;
            r0.f2447g = r1
            r0.<init>()
            return
    }

    @Override // fg.l
    public final java.lang.Object invoke(java.lang.Object r2) {
            r1 = this;
            int r0 = r1.f2447g
            switch(r0) {
                case 0: goto L13;
                case 1: goto Lc;
                default: goto L5;
            }
        L5:
            boolean r2 = r2 instanceof java.lang.Long
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r2)
            return r2
        Lc:
            boolean r2 = r2 instanceof java.lang.String
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r2)
            return r2
        L13:
            boolean r2 = r2 instanceof java.lang.String
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r2)
            return r2
    }
}
