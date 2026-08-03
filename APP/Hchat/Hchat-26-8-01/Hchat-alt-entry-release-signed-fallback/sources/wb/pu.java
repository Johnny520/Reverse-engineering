package wb;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class pu implements fg.a {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f18544g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ fg.a f18545h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ android.app.Activity f18546i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ fg.l f18547j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ int f18548k;

    public /* synthetic */ pu(fg.a r1, android.app.Activity r2, fg.l r3, int r4, int r5) {
            r0 = this;
            r0.f18544g = r5
            r0.f18545h = r1
            r0.f18546i = r2
            r0.f18547j = r3
            r0.f18548k = r4
            r0.<init>()
            return
    }

    @Override // fg.a
    public final java.lang.Object invoke() {
            r4 = this;
            int r0 = r4.f18544g
            switch(r0) {
                case 0: goto L2e;
                default: goto L5;
            }
        L5:
            fg.a r0 = r4.f18545h
            r0.invoke()
            wb.wg r0 = new wb.wg
            r1 = 9
            int r2 = r4.f18548k
            fg.l r3 = r4.f18547j
            r0.<init>(r2, r1, r3)
            android.app.Activity r1 = r4.f18546i
            android.view.Window r2 = r1.getWindow()
            if (r2 == 0) goto L2b
            android.view.View r2 = r2.getDecorView()
            if (r2 == 0) goto L2b
            wb.vu r3 = new wb.vu
            r3.<init>(r1, r0)
            r2.postOnAnimation(r3)
        L2b:
            sf.n r0 = sf.n.f12433a
            return r0
        L2e:
            fg.a r0 = r4.f18545h
            r0.invoke()
            wb.wg r0 = new wb.wg
            r1 = 8
            int r2 = r4.f18548k
            fg.l r3 = r4.f18547j
            r0.<init>(r2, r1, r3)
            android.app.Activity r1 = r4.f18546i
            android.view.Window r2 = r1.getWindow()
            if (r2 == 0) goto L54
            android.view.View r2 = r2.getDecorView()
            if (r2 == 0) goto L54
            wb.vu r3 = new wb.vu
            r3.<init>(r1, r0)
            r2.postOnAnimation(r3)
        L54:
            sf.n r0 = sf.n.f12433a
            return r0
    }
}
