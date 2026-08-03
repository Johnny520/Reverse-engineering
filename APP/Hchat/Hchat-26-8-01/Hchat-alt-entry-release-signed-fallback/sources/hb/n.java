package hb;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class n implements java.lang.Runnable {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f5436g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ hb.r f5437h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ hb.q f5438i;

    public /* synthetic */ n(hb.r r1, hb.q r2, int r3) {
            r0 = this;
            r0.f5436g = r3
            r0.f5437h = r1
            r0.f5438i = r2
            r0.<init>()
            return
    }

    @Override // java.lang.Runnable
    public final void run() {
            r3 = this;
            int r0 = r3.f5436g
            switch(r0) {
                case 0: goto L22;
                case 1: goto Ld;
                default: goto L5;
            }
        L5:
            hb.r r0 = r3.f5437h
            hb.q r1 = r3.f5438i
            r0.s(r1)
            return
        Ld:
            hb.r r0 = r3.f5437h
            java.lang.Object r1 = r0.f5458e
            java.util.ArrayDeque r1 = (java.util.ArrayDeque) r1
            hb.q r2 = r3.f5438i
            r1.addLast(r2)
            java.lang.Object r1 = r0.f5459f
            hb.q r1 = (hb.q) r1
            if (r1 != 0) goto L21
            r0.u()
        L21:
            return
        L22:
            hb.r r0 = r3.f5437h
            hb.q r1 = r3.f5438i
            r0.s(r1)
            return
    }
}
