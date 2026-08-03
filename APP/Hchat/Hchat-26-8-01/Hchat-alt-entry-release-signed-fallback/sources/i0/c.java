package i0;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class c implements fg.l {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f5852g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public java.lang.Object f5853h;

    public /* synthetic */ c() {
            r1 = this;
            r0 = 1
            r1.f5852g = r0
            r1.<init>()
            return
    }

    public /* synthetic */ c(java.lang.Object r1, int r2) {
            r0 = this;
            r0.f5852g = r2
            r0.f5853h = r1
            r0.<init>()
            return
    }

    @Override // fg.l
    public final java.lang.Object invoke(java.lang.Object r3) {
            r2 = this;
            int r0 = r2.f5852g
            switch(r0) {
                case 0: goto L3d;
                case 1: goto L2c;
                case 2: goto L14;
                default: goto L5;
            }
        L5:
            java.lang.Number r3 = (java.lang.Number) r3
            int r3 = r3.intValue()
            java.lang.Object r0 = r2.f5853h
            java.util.ArrayList r0 = (java.util.ArrayList) r0
            r0.get(r3)
            r3 = 0
            return r3
        L14:
            f1.i0 r3 = (f1.i0) r3
            float[] r3 = r3.f3066a
            java.lang.Object r0 = r2.f5853h
            v1.t r0 = (v1.t) r0
            boolean r1 = r0.C()
            if (r1 == 0) goto L29
            v1.t r1 = v1.w.h(r0)
            r1.g0(r0, r3)
        L29:
            sf.n r3 = sf.n.f12433a
            return r3
        L2c:
            java.lang.Boolean r3 = (java.lang.Boolean) r3
            boolean r3 = r3.booleanValue()
            java.lang.Object r0 = r2.f5853h
            s1.a0 r0 = (s1.a0) r0
            if (r0 == 0) goto L3a
            r0.f12205c = r3
        L3a:
            sf.n r3 = sf.n.f12433a
            return r3
        L3d:
            java.lang.Throwable r3 = (java.lang.Throwable) r3
            java.lang.Object r3 = r2.f5853h
            i0.f r3 = (i0.f) r3
            r3.cancel()
            sf.n r3 = sf.n.f12433a
            return r3
    }
}
