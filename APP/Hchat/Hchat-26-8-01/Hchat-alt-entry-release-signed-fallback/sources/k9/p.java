package k9;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class p implements fg.a {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f7526g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ android.app.Activity f7527h;

    public /* synthetic */ p(android.app.Activity r1, int r2) {
            r0 = this;
            r0.f7526g = r2
            r0.f7527h = r1
            r0.<init>()
            return
    }

    @Override // fg.a
    public final java.lang.Object invoke() {
            r2 = this;
            int r0 = r2.f7526g
            switch(r0) {
                case 0: goto L1a;
                default: goto L5;
            }
        L5:
            android.app.Activity r0 = r2.f7527h
            java.lang.ref.WeakReference r1 = k9.r.f7536g
            java.lang.Object r1 = r1.get()
            if (r1 != r0) goto L17
            a7.a.l(r0)
            k9.r r1 = k9.r.f7530a
            k9.r.e(r0)
        L17:
            sf.n r0 = sf.n.f12433a
            return r0
        L1a:
            android.app.Activity r0 = r2.f7527h
            k9.r r1 = k9.r.f7530a
            boolean r1 = k9.r.f7534e
            if (r1 == 0) goto L43
            boolean r1 = k9.r.f7533d
            if (r1 == 0) goto L43
            boolean r1 = k9.r.q(r0)
            if (r1 != 0) goto L2d
            goto L43
        L2d:
            java.lang.ref.WeakReference r1 = k9.r.f7536g
            java.lang.Object r1 = r1.get()
            android.app.Activity r1 = (android.app.Activity) r1
            if (r1 == 0) goto L3f
            if (r1 == r0) goto L3f
            a7.a.l(r1)
            k9.r.e(r1)
        L3f:
            k9.r.c(r0)
            goto L62
        L43:
            java.lang.ref.WeakReference r1 = k9.r.f7536g
            java.lang.Object r1 = r1.get()
            if (r1 != r0) goto L51
            boolean r0 = k9.r.q(r0)
            if (r0 != 0) goto L62
        L51:
            java.lang.ref.WeakReference r0 = k9.r.f7536g
            java.lang.Object r0 = r0.get()
            android.app.Activity r0 = (android.app.Activity) r0
            if (r0 == 0) goto L5e
            a7.a.l(r0)
        L5e:
            r0 = 0
            k9.r.e(r0)
        L62:
            sf.n r0 = sf.n.f12433a
            return r0
    }
}
