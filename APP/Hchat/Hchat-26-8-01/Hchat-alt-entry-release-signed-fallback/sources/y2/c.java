package y2;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class c extends gg.m implements fg.l {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final y2.c f22194h = null;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final y2.c f22195i = null;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final y2.c f22196j = null;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final y2.c f22197k = null;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final y2.c f22198l = null;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final y2.c f22199m = null;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f22200g;

    static {
            y2.c r0 = new y2.c
            r1 = 1
            r2 = 0
            r0.<init>(r1, r2)
            y2.c.f22194h = r0
            y2.c r0 = new y2.c
            r2 = 1
            r0.<init>(r1, r2)
            y2.c.f22195i = r0
            y2.c r0 = new y2.c
            r2 = 2
            r0.<init>(r1, r2)
            y2.c.f22196j = r0
            y2.c r0 = new y2.c
            r2 = 3
            r0.<init>(r1, r2)
            y2.c.f22197k = r0
            y2.c r0 = new y2.c
            r2 = 4
            r0.<init>(r1, r2)
            y2.c.f22198l = r0
            y2.c r0 = new y2.c
            r2 = 5
            r0.<init>(r1, r2)
            y2.c.f22199m = r0
            return
    }

    public /* synthetic */ c(int r1, int r2) {
            r0 = this;
            r0.f22200g = r2
            r0.<init>(r1)
            return
    }

    @Override // fg.l
    public final java.lang.Object invoke(java.lang.Object r3) {
            r2 = this;
            int r0 = r2.f22200g
            sf.n r1 = sf.n.f12433a
            switch(r0) {
                case 0: goto L29;
                case 1: goto L23;
                case 2: goto L20;
                case 3: goto L16;
                case 4: goto L13;
                default: goto L7;
            }
        L7:
            y2.x r3 = (y2.x) r3
            boolean r0 = r3.isAttachedToWindow()
            if (r0 == 0) goto L12
            r3.r()
        L12:
            return r1
        L13:
            v1.a1 r3 = (v1.a1) r3
            return r1
        L16:
            f2.y r3 = (f2.y) r3
            mg.d[] r0 = f2.w.f3251a
            f2.x r0 = f2.u.f3245w
            r3.a(r0, r1)
            return r1
        L20:
            v1.a1 r3 = (v1.a1) r3
            return r1
        L23:
            java.lang.Number r3 = (java.lang.Number) r3
            r3.longValue()
            return r1
        L29:
            f2.y r3 = (f2.y) r3
            mg.d[] r0 = f2.w.f3251a
            f2.x r0 = f2.u.f3246x
            r3.a(r0, r1)
            return r1
    }
}
