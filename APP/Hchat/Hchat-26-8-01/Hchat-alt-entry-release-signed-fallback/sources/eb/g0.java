package eb;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class g0 implements java.lang.Runnable {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f2548g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f2549h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f2550i;

    public /* synthetic */ g0(java.lang.String r2, java.lang.String r3) {
            r1 = this;
            r0 = 0
            r1.f2548g = r0
            r1.<init>()
            r1.f2549h = r2
            r1.f2550i = r3
            return
    }

    public /* synthetic */ g0(o9.p r1, java.lang.String r2, java.lang.String r3) {
            r0 = this;
            r1 = 1
            r0.f2548g = r1
            r0.<init>()
            r0.f2549h = r2
            r0.f2550i = r3
            return
    }

    @Override // java.lang.Runnable
    public final void run() {
            r5 = this;
            int r0 = r5.f2548g
            switch(r0) {
                case 0: goto L15;
                default: goto L5;
            }
        L5:
            java.lang.String r0 = r5.f2549h
            java.lang.String r1 = r5.f2550i
            j8.p r2 = h.Hchat.hooks.api.core.WeChatApis.media()     // Catch: java.lang.Throwable -> L14
            if (r2 == 0) goto L14
            j8.y r2 = r2.f6816b     // Catch: java.lang.Throwable -> L14
            r2.t(r0, r1)     // Catch: java.lang.Throwable -> L14
        L14:
            return
        L15:
            java.lang.String r0 = r5.f2549h
            java.lang.String r1 = r5.f2550i
            q8.m r2 = h.Hchat.hooks.api.core.WeChatApis.chatPage()
            r3 = 0
            if (r2 == 0) goto L25
            java.lang.String r2 = r2.a()
            goto L26
        L25:
            r2 = r3
        L26:
            if (r2 != 0) goto L2a
            java.lang.String r2 = ""
        L2a:
            boolean r0 = r2.equals(r0)
            if (r0 != 0) goto L31
            goto L6b
        L31:
            java.lang.ref.WeakReference r0 = eb.m0.f2596j
            java.lang.Object r0 = r0.get()
            if (r0 == 0) goto L6b
            eb.m0 r2 = eb.m0.f2587a
            java.lang.Object r2 = eb.m0.d(r0)
            if (r2 == 0) goto L6b
            boolean r4 = r2 instanceof android.view.View
            if (r4 == 0) goto L49
            r4 = r2
            android.view.View r4 = (android.view.View) r4
            goto L4a
        L49:
            r4 = r3
        L4a:
            if (r4 == 0) goto L4d
            goto L57
        L4d:
            boolean r4 = r0 instanceof android.view.View
            if (r4 == 0) goto L54
            r3 = r0
            android.view.View r3 = (android.view.View) r3
        L54:
            if (r3 == 0) goto L6b
            r4 = r3
        L57:
            boolean r3 = r4.isAttachedToWindow()
            if (r3 == 0) goto L6b
            java.lang.String r0 = eb.m0.i(r0)
            int r0 = r0.length()
            if (r0 <= 0) goto L68
            goto L6b
        L68:
            eb.m0.l(r2, r1)
        L6b:
            return
    }
}
