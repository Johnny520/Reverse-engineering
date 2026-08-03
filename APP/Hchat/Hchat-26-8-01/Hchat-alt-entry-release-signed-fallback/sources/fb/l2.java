package fb;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class l2 implements fg.l {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f3628g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.io.File f3629h;

    public /* synthetic */ l2(java.io.File r1, int r2) {
            r0 = this;
            r0.f3628g = r2
            r0.f3629h = r1
            r0.<init>()
            return
    }

    @Override // fg.l
    public final java.lang.Object invoke(java.lang.Object r2) {
            r1 = this;
            int r0 = r1.f3628g
            java.io.File r2 = (java.io.File) r2
            switch(r0) {
                case 0: goto L38;
                case 1: goto L28;
                default: goto L7;
            }
        L7:
            r2.getClass()
            boolean r0 = r2.isFile()
            if (r0 == 0) goto L22
            java.io.File r2 = r2.getCanonicalFile()
            java.io.File r0 = r1.f3629h
            java.io.File r0 = r0.getCanonicalFile()
            boolean r2 = gg.l.a(r2, r0)
            if (r2 != 0) goto L22
            r2 = 1
            goto L23
        L22:
            r2 = 0
        L23:
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r2)
            return r2
        L28:
            r2.getClass()
            java.io.File r0 = r1.f3629h
            boolean r2 = r2.equals(r0)
        L31:
            r2 = r2 ^ 1
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r2)
            return r2
        L38:
            r2.getClass()
            java.io.File r0 = r1.f3629h
            boolean r2 = r2.equals(r0)
            goto L31
    }
}
