package y2;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class j extends gg.m implements fg.l {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f22231g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ y2.x f22232h;

    public /* synthetic */ j(y2.x r1, int r2) {
            r0 = this;
            r0.f22231g = r2
            r0.f22232h = r1
            r1 = 1
            r0.<init>(r1)
            return
    }

    @Override // fg.l
    public final java.lang.Object invoke(java.lang.Object r4) {
            r3 = this;
            int r0 = r3.f22231g
            switch(r0) {
                case 0: goto L46;
                case 1: goto L32;
                default: goto L5;
            }
        L5:
            fg.a r4 = (fg.a) r4
            y2.x r0 = r3.f22232h
            android.os.Handler r1 = r0.getHandler()
            if (r1 == 0) goto L14
            android.os.Looper r1 = r1.getLooper()
            goto L15
        L14:
            r1 = 0
        L15:
            android.os.Looper r2 = android.os.Looper.myLooper()
            if (r1 != r2) goto L1f
            r4.invoke()
            goto L2f
        L1f:
            android.os.Handler r0 = r0.getHandler()
            if (r0 == 0) goto L2f
            b0.c r1 = new b0.c
            r2 = 8
            r1.<init>(r4, r2)
            r0.post(r1)
        L2f:
            sf.n r4 = sf.n.f12433a
            return r4
        L32:
            u2.l r4 = (u2.l) r4
            long r0 = r4.f13353a
            u2.l r4 = new u2.l
            r4.<init>(r0)
            y2.x r0 = r3.f22232h
            r0.m187setPopupContentSizefhxjrPA(r4)
            r0.r()
            sf.n r4 = sf.n.f12433a
            return r4
        L46:
            v1.t r4 = (v1.t) r4
            v1.t r4 = r4.b0()
            r4.getClass()
            y2.x r0 = r3.f22232h
            r0.q(r4)
            sf.n r4 = sf.n.f12433a
            return r4
    }
}
