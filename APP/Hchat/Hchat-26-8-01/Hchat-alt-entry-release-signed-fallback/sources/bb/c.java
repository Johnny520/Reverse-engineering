package bb;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class c implements fg.l {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f642g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ bb.e f643h;

    public /* synthetic */ c(bb.e r1, int r2) {
            r0 = this;
            r0.f642g = r2
            r0.f643h = r1
            r0.<init>()
            return
    }

    @Override // fg.l
    public final java.lang.Object invoke(java.lang.Object r2) {
            r1 = this;
            int r0 = r1.f642g
            java.lang.String r2 = (java.lang.String) r2
            switch(r0) {
                case 0: goto L16;
                default: goto L7;
            }
        L7:
            r2.getClass()
            bb.e r0 = r1.f643h
            bb.g r0 = r0.f647e
            if (r0 == 0) goto L13
            r0.a(r2)
        L13:
            sf.n r2 = sf.n.f12433a
            return r2
        L16:
            r2.getClass()
            bb.e r0 = r1.f643h
            bb.g r0 = r0.f647e
            if (r0 == 0) goto L22
            r0.a(r2)
        L22:
            sf.n r2 = sf.n.f12433a
            return r2
    }
}
