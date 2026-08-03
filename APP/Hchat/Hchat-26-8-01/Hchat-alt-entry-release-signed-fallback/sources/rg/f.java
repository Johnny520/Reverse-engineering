package rg;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class f implements java.lang.Runnable {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f11961g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f11962h;

    public /* synthetic */ f(java.lang.Object r1, int r2) {
            r0 = this;
            r0.f11961g = r2
            r0.f11962h = r1
            r0.<init>()
            return
    }

    @Override // java.lang.Runnable
    public final void run() {
            r7 = this;
            int r0 = r7.f11961g
            switch(r0) {
                case 0: goto L96;
                case 1: goto L2b;
                default: goto L5;
            }
        L5:
            java.lang.Object r0 = r7.f11962h
            r1 = r0
            y1.t r1 = (y1.t) r1
            r1.removeCallbacks(r7)
            android.view.MotionEvent r2 = r1.C0
            if (r2 == 0) goto L2a
            int r0 = r2.getActionMasked()
            r3 = 10
            if (r0 == r3) goto L2a
            r3 = 1
            if (r0 == r3) goto L2a
            r3 = 7
            if (r0 == r3) goto L24
            r4 = 9
            if (r0 == r4) goto L24
            r3 = 2
        L24:
            long r4 = r1.D0
            r6 = 0
            r1.L(r2, r3, r4, r6)
        L2a:
            return
        L2b:
            java.lang.Object r0 = r7.f11962h
            r1 = r0
            h.Hchat.hooks.items.keepalive.WeChatKeepAliveService r1 = (h.Hchat.hooks.items.keepalive.WeChatKeepAliveService) r1
            boolean r0 = r1.f4607h
            if (r0 != 0) goto L35
            goto L71
        L35:
            android.content.Context r0 = r1.getApplicationContext()
            if (r0 == 0) goto L3c
            goto L3d
        L3c:
            r0 = r1
        L3d:
            boolean r2 = w9.a.c()     // Catch: java.lang.Throwable -> L5b
            if (r2 == 0) goto L44
            goto L71
        L44:
            android.content.pm.PackageManager r2 = r0.getPackageManager()     // Catch: java.lang.Throwable -> L5b
            java.lang.String r3 = "com.tencent.mm"
            android.content.Intent r2 = r2.getLaunchIntentForPackage(r3)     // Catch: java.lang.Throwable -> L5b
            if (r2 == 0) goto L71
            r3 = 268435456(0x10000000, float:2.524355E-29)
            r2.addFlags(r3)     // Catch: java.lang.Throwable -> L5b
            r0.startActivity(r2)     // Catch: java.lang.Throwable -> L5b
            sf.n r0 = sf.n.f12433a     // Catch: java.lang.Throwable -> L5b
            goto L62
        L5b:
            r0 = move-exception
            sf.f r2 = new sf.f
            r2.<init>(r0)
            r0 = r2
        L62:
            java.lang.Throwable r0 = sf.g.b(r0)
            if (r0 == 0) goto L71
            java.lang.String r2 = r0.getMessage()
            java.lang.String r3 = "[Hchat:KeepAlive] 看门狗拉起微信失败: "
            eh.a.x(r3, r2, r0)
        L71:
            boolean r0 = r1.f4608i
            if (r0 != 0) goto L76
            goto L8d
        L76:
            java.lang.Thread r0 = new java.lang.Thread
            h.Hchat.crash.e r2 = new h.Hchat.crash.e
            r3 = 5
            r2.<init>(r3)
            r0.<init>(r2)
            java.lang.String r2 = "Hchat-KeepAlive-Heartbeat"
            r0.setName(r2)
            r2 = 1
            r0.setDaemon(r2)
            r0.start()
        L8d:
            android.os.Handler r0 = r1.f4606g
            r1 = 60000(0xea60, double:2.9644E-319)
            r0.postDelayed(r7, r1)
            return
        L96:
            java.lang.Object r0 = r7.f11962h
            qg.g r0 = (qg.g) r0
            rg.g.a(r0)
            return
    }
}
