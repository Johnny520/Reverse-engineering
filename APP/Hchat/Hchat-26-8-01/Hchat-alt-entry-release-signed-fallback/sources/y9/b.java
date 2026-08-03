package y9;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class b extends gg.j implements fg.p {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f22328n;

    public /* synthetic */ b(int r1, java.lang.Object r2, java.lang.Class r3, java.lang.String r4, java.lang.String r5, int r6, int r7, int r8) {
            r0 = this;
            r0.f22328n = r8
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            return
    }

    @Override // fg.p
    public final java.lang.Object invoke(java.lang.Object r2, java.lang.Object r3) {
            r1 = this;
            int r0 = r1.f22328n
            switch(r0) {
                case 0: goto L38;
                case 1: goto L27;
                case 2: goto L16;
                default: goto L5;
            }
        L5:
            java.lang.String r2 = (java.lang.String) r2
            java.lang.Throwable r3 = (java.lang.Throwable) r3
            r2.getClass()
            java.lang.Object r0 = r1.f4549h
            z8.e r0 = (z8.e) r0
            r0.e(r2, r3)
            sf.n r2 = sf.n.f12433a
            return r2
        L16:
            java.lang.String r2 = (java.lang.String) r2
            java.lang.Throwable r3 = (java.lang.Throwable) r3
            r2.getClass()
            java.lang.Object r0 = r1.f4549h
            z8.a r0 = (z8.a) r0
            r0.e(r2, r3)
            sf.n r2 = sf.n.f12433a
            return r2
        L27:
            java.lang.String r2 = (java.lang.String) r2
            java.lang.Throwable r3 = (java.lang.Throwable) r3
            r2.getClass()
            java.lang.Object r0 = r1.f4549h
            ya.h r0 = (ya.h) r0
            r0.e(r2, r3)
            sf.n r2 = sf.n.f12433a
            return r2
        L38:
            java.lang.String r2 = (java.lang.String) r2
            java.lang.Throwable r3 = (java.lang.Throwable) r3
            r2.getClass()
            java.lang.Object r0 = r1.f4549h
            y9.c r0 = (y9.c) r0
            r0.e(r2, r3)
            sf.n r2 = sf.n.f12433a
            return r2
    }
}
