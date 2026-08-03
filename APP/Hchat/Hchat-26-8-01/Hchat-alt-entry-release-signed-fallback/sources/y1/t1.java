package y1;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class t1 extends gg.m implements fg.a {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final y1.t1 f22121h = null;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final y1.t1 f22122i = null;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f22123g;

    static {
            y1.t1 r0 = new y1.t1
            r1 = 0
            r2 = 0
            r0.<init>(r1, r2)
            y1.t1.f22121h = r0
            y1.t1 r0 = new y1.t1
            r2 = 1
            r0.<init>(r1, r2)
            y1.t1.f22122i = r0
            return
    }

    public /* synthetic */ t1(int r1, int r2) {
            r0 = this;
            r0.f22123g = r2
            r0.<init>(r1)
            return
    }

    @Override // fg.a
    public final /* bridge */ /* synthetic */ java.lang.Object invoke() {
            r1 = this;
            int r0 = r1.f22123g
            switch(r0) {
                case 0: goto L7;
                default: goto L5;
            }
        L5:
            r0 = 0
            return r0
        L7:
            java.lang.Boolean r0 = java.lang.Boolean.FALSE
            return r0
    }
}
