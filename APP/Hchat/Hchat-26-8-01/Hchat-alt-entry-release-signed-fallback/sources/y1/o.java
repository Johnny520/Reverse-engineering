package y1;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class o extends gg.m implements fg.l {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final y1.o f22018h = null;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final y1.o f22019i = null;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final y1.o f22020j = null;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final y1.o f22021k = null;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f22022g;

    static {
            y1.o r0 = new y1.o
            r1 = 1
            r2 = 0
            r0.<init>(r1, r2)
            y1.o.f22018h = r0
            y1.o r0 = new y1.o
            r2 = 1
            r0.<init>(r1, r2)
            y1.o.f22019i = r0
            y1.o r0 = new y1.o
            r2 = 2
            r0.<init>(r1, r2)
            y1.o.f22020j = r0
            y1.o r0 = new y1.o
            r2 = 3
            r0.<init>(r1, r2)
            y1.o.f22021k = r0
            return
    }

    public /* synthetic */ o(int r1, int r2) {
            r0 = this;
            r0.f22022g = r2
            r0.<init>(r1)
            return
    }

    @Override // fg.l
    public final java.lang.Object invoke(java.lang.Object r2) {
            r1 = this;
            int r0 = r1.f22022g
            switch(r0) {
                case 0: goto L38;
                case 1: goto L25;
                case 2: goto Le;
                default: goto L5;
            }
        L5:
            boolean r2 = y1.g0.f(r2)
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r2)
            return r2
        Le:
            s0.h r2 = (s0.h) r2
            i0.u r0 = y1.i0.f21965a
            r2.getClass()
            i0.r.v(r2, r0)
            i0.m2 r0 = y1.i0.f21966b
            java.lang.Object r2 = i0.r.v(r2, r0)
            android.content.Context r2 = (android.content.Context) r2
            android.content.res.Resources r2 = r2.getResources()
            return r2
        L25:
            f2.q r2 = (f2.q) r2
            f2.m r2 = r2.k()
            f2.x r0 = f2.u.A
            f.k0 r2 = r2.f3204g
            boolean r2 = r2.c(r0)
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r2)
            return r2
        L38:
            d1.b0 r2 = (d1.b0) r2
            java.lang.Boolean r2 = java.lang.Boolean.TRUE
            return r2
    }
}
