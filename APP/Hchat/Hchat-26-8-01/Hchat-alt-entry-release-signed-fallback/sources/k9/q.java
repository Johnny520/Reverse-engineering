package k9;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class q implements fg.a {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f7528g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ boolean f7529h;

    public /* synthetic */ q(int r1, boolean r2) {
            r0 = this;
            r0.f7528g = r1
            r0.f7529h = r2
            r0.<init>()
            return
    }

    @Override // fg.a
    public final java.lang.Object invoke() {
            r5 = this;
            int r0 = r5.f7528g
            sf.n r1 = sf.n.f12433a
            r2 = 0
            boolean r3 = r5.f7529h
            switch(r0) {
                case 0: goto L36;
                case 1: goto L13;
                default: goto La;
            }
        La:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r3)
            i0.j1 r0 = i0.r.u(r0)
            return r0
        L13:
            if (r3 == 0) goto L28
            java.lang.ref.WeakReference r0 = k9.r.f7536g
            java.lang.Object r0 = r0.get()
            android.app.Activity r0 = (android.app.Activity) r0
            if (r0 == 0) goto L22
            a7.a.l(r0)
        L22:
            k9.r r0 = k9.r.f7530a
            k9.r.e(r2)
            goto L35
        L28:
            android.os.Handler r0 = k9.r.f7531b
            h.Hchat.crash.e r2 = new h.Hchat.crash.e
            r3 = 3
            r2.<init>(r3)
            r3 = 180(0xb4, double:8.9E-322)
            r0.postDelayed(r2, r3)
        L35:
            return r1
        L36:
            k9.r r0 = k9.r.f7530a
            if (r3 != 0) goto L4b
            java.lang.ref.WeakReference r0 = k9.r.f7536g
            java.lang.Object r0 = r0.get()
            android.app.Activity r0 = (android.app.Activity) r0
            if (r0 == 0) goto L47
            a7.a.l(r0)
        L47:
            k9.r.e(r2)
            goto L6b
        L4b:
            q8.o r0 = h.Hchat.hooks.api.core.WeChatApis.currentActivity()
            if (r0 == 0) goto L58
            android.app.Activity r0 = r0.a()
            if (r0 == 0) goto L58
            goto L60
        L58:
            java.lang.ref.WeakReference r0 = k9.r.f7536g
            java.lang.Object r0 = r0.get()
            android.app.Activity r0 = (android.app.Activity) r0
        L60:
            if (r0 == 0) goto L6b
            k9.p r2 = new k9.p
            r3 = 0
            r2.<init>(r0, r3)
            k9.r.p(r2)
        L6b:
            return r1
    }
}
