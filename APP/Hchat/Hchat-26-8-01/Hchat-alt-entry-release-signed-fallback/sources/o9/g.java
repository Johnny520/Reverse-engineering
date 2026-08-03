package o9;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class g implements fg.a {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f9631g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ fg.l f9632h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ java.util.ArrayList f9633i;

    public /* synthetic */ g(fg.l r2, java.util.ArrayList r3) {
            r1 = this;
            r0 = 1
            r1.f9631g = r0
            r1.<init>()
            r1.f9632h = r2
            r1.f9633i = r3
            return
    }

    public /* synthetic */ g(java.util.ArrayList r1, o9.p r2, fg.l r3) {
            r0 = this;
            r2 = 0
            r0.f9631g = r2
            r0.<init>()
            r0.f9633i = r1
            r0.f9632h = r3
            return
    }

    @Override // fg.a
    public final java.lang.Object invoke() {
            r3 = this;
            int r0 = r3.f9631g
            switch(r0) {
                case 0: goto Lf;
                default: goto L5;
            }
        L5:
            fg.l r0 = r3.f9632h
            java.util.ArrayList r1 = r3.f9633i
            r0.invoke(r1)
            sf.n r0 = sf.n.f12433a
            return r0
        Lf:
            fg.l r0 = r3.f9632h
            java.util.ArrayList r1 = r3.f9633i
            java.util.Iterator r1 = r1.iterator()
        L17:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L2d
            java.lang.Object r2 = r1.next()
            java.lang.String r2 = (java.lang.String) r2
            java.lang.Object r2 = r0.invoke(r2)     // Catch: java.lang.Throwable -> L17
            java.lang.Boolean r2 = (java.lang.Boolean) r2     // Catch: java.lang.Throwable -> L17
            r2.getClass()     // Catch: java.lang.Throwable -> L17
            goto L17
        L2d:
            sf.n r0 = sf.n.f12433a
            return r0
    }
}
