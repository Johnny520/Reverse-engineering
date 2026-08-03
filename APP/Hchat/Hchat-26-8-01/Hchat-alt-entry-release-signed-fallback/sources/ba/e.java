package ba;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class e implements java.lang.Runnable {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f559g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ boolean f560h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f561i;

    public /* synthetic */ e(java.lang.Object r1, boolean r2, int r3) {
            r0 = this;
            r0.f559g = r3
            r0.f561i = r1
            r0.f560h = r2
            r0.<init>()
            return
    }

    @Override // java.lang.Runnable
    public final void run() {
            r2 = this;
            int r0 = r2.f559g
            switch(r0) {
                case 0: goto L23;
                case 1: goto L13;
                default: goto L5;
            }
        L5:
            java.lang.Object r0 = r2.f561i
            fg.l r0 = (fg.l) r0
            boolean r1 = r2.f560h
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
            r0.invoke(r1)
            return
        L13:
            java.lang.Object r0 = r2.f561i
            d9.e r0 = (d9.e) r0
            fg.l r0 = r0.f2095d
            boolean r1 = r2.f560h
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
            r0.invoke(r1)
            return
        L23:
            java.lang.Object r0 = r2.f561i
            ba.d r0 = (ba.d) r0
            wb.dj r0 = r0.f558c
            boolean r1 = r2.f560h
            if (r1 == 0) goto L30
            ba.b r1 = ba.b.f551g
            goto L32
        L30:
            ba.b r1 = ba.b.f553i
        L32:
            r0.invoke(r1)
            return
    }
}
