package b0;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class a implements fg.l {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f341g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ b0.h f342h;

    public /* synthetic */ a(b0.h r1, int r2) {
            r0 = this;
            r0.f341g = r2
            r0.f342h = r1
            r0.<init>()
            return
    }

    @Override // fg.l
    public final java.lang.Object invoke(java.lang.Object r4) {
            r3 = this;
            int r0 = r3.f341g
            switch(r0) {
                case 0: goto L2d;
                case 1: goto L21;
                case 2: goto L15;
                default: goto L5;
            }
        L5:
            i0.a0 r4 = (i0.a0) r4
            b0.h r4 = r3.f342h
            w0.s r0 = r4.f371e
            r0.d()
            b0.m r0 = new b0.m
            r1 = 0
            r0.<init>(r4, r1)
            return r0
        L15:
            b0.h r4 = r3.f342h
            android.view.ActionMode r4 = r4.f374h
            if (r4 == 0) goto L1e
            r4.invalidateContentRect()
        L1e:
            sf.n r4 = sf.n.f12433a
            return r4
        L21:
            b0.h r4 = r3.f342h
            android.view.ActionMode r4 = r4.f374h
            if (r4 == 0) goto L2a
            r4.invalidate()
        L2a:
            sf.n r4 = sf.n.f12433a
            return r4
        L2d:
            fg.a r4 = (fg.a) r4
            b0.h r0 = r3.f342h
            android.view.View r0 = r0.f367a
            android.os.Handler r1 = r0.getHandler()
            if (r1 == 0) goto L3e
            android.os.Looper r1 = r1.getLooper()
            goto L3f
        L3e:
            r1 = 0
        L3f:
            android.os.Looper r2 = android.os.Looper.myLooper()
            if (r1 != r2) goto L49
            r4.invoke()
            goto L58
        L49:
            android.os.Handler r0 = r0.getHandler()
            if (r0 == 0) goto L58
            b0.c r1 = new b0.c
            r2 = 0
            r1.<init>(r4, r2)
            r0.post(r1)
        L58:
            sf.n r4 = sf.n.f12433a
            return r4
    }
}
