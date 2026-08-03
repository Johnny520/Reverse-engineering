package h;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class k0 extends gg.m implements fg.l {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ boolean f4709g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ fg.a f4710h;

    public k0(boolean r1, fg.a r2) {
            r0 = this;
            r0.f4709g = r1
            r0.f4710h = r2
            r1 = 1
            r0.<init>(r1)
            return
    }

    @Override // fg.l
    public final java.lang.Object invoke(java.lang.Object r2) {
            r1 = this;
            f1.d0 r2 = (f1.d0) r2
            boolean r0 = r1.f4709g
            if (r0 != 0) goto L16
            fg.a r0 = r1.f4710h
            java.lang.Object r0 = r0.invoke()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L16
            r0 = 1
            goto L17
        L16:
            r0 = 0
        L17:
            r2.r(r0)
            sf.n r2 = sf.n.f12433a
            return r2
    }
}
