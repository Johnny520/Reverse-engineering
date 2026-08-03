package y1;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class p extends gg.m implements fg.l {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f22045g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ y1.t f22046h;

    public /* synthetic */ p(y1.t r1, int r2) {
            r0 = this;
            r0.f22045g = r2
            r0.f22046h = r1
            r1 = 1
            r0.<init>(r1)
            return
    }

    @Override // fg.l
    public final java.lang.Object invoke(java.lang.Object r4) {
            r3 = this;
            int r0 = r3.f22045g
            switch(r0) {
                case 0: goto L42;
                case 1: goto L13;
                default: goto L5;
            }
        L5:
            qg.t r4 = (qg.t) r4
            y1.k0 r0 = new y1.k0
            y1.t r1 = r3.f22046h
            n2.t r2 = r1.getTextInputService()
            r0.<init>(r1, r2, r4)
            return r0
        L13:
            fg.a r4 = (fg.a) r4
            y1.t r0 = r3.f22046h
            r0.getUncaughtExceptionHandler$ui()
            android.os.Handler r1 = r0.getHandler()
            if (r1 == 0) goto L25
            android.os.Looper r1 = r1.getLooper()
            goto L26
        L25:
            r1 = 0
        L26:
            android.os.Looper r2 = android.os.Looper.myLooper()
            if (r1 != r2) goto L30
            r4.invoke()
            goto L3f
        L30:
            android.os.Handler r0 = r0.getHandler()
            if (r0 == 0) goto L3f
            b0.c r1 = new b0.c
            r2 = 7
            r1.<init>(r4, r2)
            r0.post(r1)
        L3f:
            sf.n r4 = sf.n.f12433a
            return r4
        L42:
            d1.f r4 = (d1.f) r4
            int r4 = r4.f1920a
            y1.t r0 = r3.f22046h
            d1.l r0 = r0.getFocusOwner()
            r1 = 0
            d1.p r0 = (d1.p) r0
            r0.g(r4, r1)
            sf.n r4 = sf.n.f12433a
            return r4
    }
}
