package h.Hchat.crash;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class e implements java.lang.Runnable {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f4579g;

    public /* synthetic */ e(int r1) {
            r0 = this;
            r0.f4579g = r1
            r0.<init>()
            return
    }

    private final void a() {
            r0 = this;
            return
    }

    @Override // java.lang.Runnable
    public final void run() {
            r7 = this;
            int r0 = r7.f4579g
            r1 = 0
            switch(r0) {
                case 0: goto L121;
                case 1: goto L116;
                case 2: goto L108;
                case 3: goto Lde;
                case 4: goto Ldd;
                case 5: goto L92;
                case 6: goto L5f;
                case 7: goto L51;
                default: goto L6;
            }
        L6:
            f.f0 r0 = y1.t.W0
            monitor-enter(r0)
            int r2 = android.os.Build.VERSION.SDK_INT     // Catch: java.lang.Throwable -> L36
            java.lang.Object[] r3 = r0.f2803a
            int r4 = r0.f2804b
            r5 = 30
            if (r2 >= r5) goto L3b
        L13:
            if (r1 >= r4) goto L4d
            r2 = r3[r1]     // Catch: java.lang.Throwable -> L36
            y1.t r2 = (y1.t) r2     // Catch: java.lang.Throwable -> L36
            boolean r5 = r2.getShowLayoutBounds()     // Catch: java.lang.Throwable -> L36
            java.lang.Class r6 = y1.t.T0     // Catch: java.lang.Throwable -> L36
            boolean r6 = y1.g0.n()     // Catch: java.lang.Throwable -> L36
            r2.setShowLayoutBounds(r6)     // Catch: java.lang.Throwable -> L36
            boolean r6 = r2.getShowLayoutBounds()     // Catch: java.lang.Throwable -> L36
            if (r5 == r6) goto L38
            y1.j r5 = new y1.j     // Catch: java.lang.Throwable -> L36
            r6 = 2
            r5.<init>(r2, r6)     // Catch: java.lang.Throwable -> L36
            r2.post(r5)     // Catch: java.lang.Throwable -> L36
            goto L38
        L36:
            r1 = move-exception
            goto L4f
        L38:
            int r1 = r1 + 1
            goto L13
        L3b:
            if (r1 >= r4) goto L4d
            r2 = r3[r1]     // Catch: java.lang.Throwable -> L36
            y1.t r2 = (y1.t) r2     // Catch: java.lang.Throwable -> L36
            y1.j r5 = new y1.j     // Catch: java.lang.Throwable -> L36
            r6 = 3
            r5.<init>(r2, r6)     // Catch: java.lang.Throwable -> L36
            r2.post(r5)     // Catch: java.lang.Throwable -> L36
            int r1 = r1 + 1
            goto L3b
        L4d:
            monitor-exit(r0)
            return
        L4f:
            monitor-exit(r0)
            throw r1
        L51:
            java.lang.String r0 = "cmd deviceidle whitelist +com.tencent.mm"
            boolean r0 = w9.a.e(r0)
            if (r0 != 0) goto L5e
            java.lang.String r0 = "[Hchat:KeepAlive] Root Doze 白名单执行失败"
            fb.v0.m(r0)
        L5e:
            return
        L5f:
            java.lang.String r0 = "cmd appops set com.tencent.mm RUN_ANY_IN_BACKGROUND allow"
            java.lang.String r1 = "cmd appops set com.tencent.mm RUN_IN_BACKGROUND allow"
            java.lang.String r2 = "cmd appops set com.tencent.mm WAKE_LOCK allow"
            java.lang.String r3 = "cmd appops set com.tencent.mm START_FOREGROUND allow"
            java.lang.String[] r0 = new java.lang.String[]{r0, r1, r2, r3}
            java.util.List r0 = a.a.y0(r0)
            boolean r1 = r0.isEmpty()
            if (r1 == 0) goto L76
            goto L91
        L76:
            java.util.Iterator r0 = r0.iterator()
        L7a:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L91
            java.lang.Object r1 = r0.next()
            java.lang.String r1 = (java.lang.String) r1
            boolean r1 = w9.a.e(r1)
            if (r1 != 0) goto L7a
            java.lang.String r0 = "[Hchat:KeepAlive] Root AppOps 放行执行不完整"
            fb.v0.m(r0)
        L91:
            return
        L92:
            java.net.URL r0 = new java.net.URL     // Catch: java.lang.Throwable -> Lbb
            java.lang.String r2 = "https://connectivitycheck.gstatic.com/generate_204"
            r0.<init>(r2)     // Catch: java.lang.Throwable -> Lbb
            java.net.URLConnection r0 = r0.openConnection()     // Catch: java.lang.Throwable -> Lbb
            r0.getClass()     // Catch: java.lang.Throwable -> Lbb
            java.net.HttpURLConnection r0 = (java.net.HttpURLConnection) r0     // Catch: java.lang.Throwable -> Lbb
            r2 = 3000(0xbb8, float:4.204E-42)
            r0.setConnectTimeout(r2)     // Catch: java.lang.Throwable -> Lbb
            r0.setReadTimeout(r2)     // Catch: java.lang.Throwable -> Lbb
            r0.setUseCaches(r1)     // Catch: java.lang.Throwable -> Lbb
            java.lang.String r1 = "GET"
            r0.setRequestMethod(r1)     // Catch: java.lang.Throwable -> Lbb
            r0.getResponseCode()     // Catch: java.lang.Throwable -> Lbb
            r0.disconnect()     // Catch: java.lang.Throwable -> Lbb
            sf.n r0 = sf.n.f12433a     // Catch: java.lang.Throwable -> Lbb
            goto Lc2
        Lbb:
            r0 = move-exception
            sf.f r1 = new sf.f
            r1.<init>(r0)
            r0 = r1
        Lc2:
            java.lang.Throwable r0 = sf.g.b(r0)
            if (r0 == 0) goto Ldd
            java.lang.String r0 = r0.getMessage()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "[Hchat:KeepAlive] 网络心跳失败: "
            r1.<init>(r2)
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            fb.v0.m(r0)
        Ldd:
            return
        Lde:
            boolean r0 = k9.r.f7534e
            if (r0 == 0) goto L107
            boolean r0 = k9.r.f7533d
            if (r0 == 0) goto L107
            boolean r0 = k9.r.f7535f
            if (r0 == 0) goto Leb
            goto L107
        Leb:
            q8.o r0 = h.Hchat.hooks.api.core.WeChatApis.currentActivity()
            if (r0 == 0) goto L107
            android.app.Activity r0 = r0.a()
            if (r0 == 0) goto L107
            k9.r r2 = k9.r.f7530a
            boolean r2 = k9.r.q(r0)
            if (r2 == 0) goto L107
            k9.p r2 = new k9.p
            r2.<init>(r0, r1)
            k9.r.p(r2)
        L107:
            return
        L108:
            java.lang.ref.WeakReference r0 = k9.r.f7537h
            java.lang.Object r0 = r0.get()
            android.view.View r0 = (android.view.View) r0
            if (r0 == 0) goto L115
            r0.bringToFront()
        L115:
            return
        L116:
            hb.l r0 = hb.m.f5433a
            hb.m.c(r1)     // Catch: java.lang.Throwable -> L11b
        L11b:
            java.util.concurrent.atomic.AtomicBoolean r0 = hb.m.f5435c
            r0.set(r1)
            return
        L121:
            h.Hchat.crash.g r0 = h.Hchat.crash.g.f4581a
            h.Hchat.crash.g.d()
            h.Hchat.crash.g.e()
            return
    }
}
