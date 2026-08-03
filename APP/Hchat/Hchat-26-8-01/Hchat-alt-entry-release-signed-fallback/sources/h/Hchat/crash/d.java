package h.Hchat.crash;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class d implements java.lang.Runnable {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f4577g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ android.app.Activity f4578h;

    public /* synthetic */ d(android.app.Activity r2) {
            r1 = this;
            r0 = 0
            r1.f4577g = r0
            r1.<init>()
            r1.f4578h = r2
            return
    }

    public /* synthetic */ d(ba.f r1, android.app.Activity r2) {
            r0 = this;
            r1 = 1
            r0.f4577g = r1
            r0.<init>()
            r0.f4578h = r2
            return
    }

    @Override // java.lang.Runnable
    public final void run() {
            r8 = this;
            int r0 = r8.f4577g
            r1 = 0
            r2 = 0
            switch(r0) {
                case 0: goto Ld;
                default: goto L7;
            }
        L7:
            android.app.Activity r0 = r8.f4578h
            a7.a.S(r0, r2, r1)
            return
        Ld:
            android.app.Activity r0 = r8.f4578h
            h.Hchat.crash.g r3 = h.Hchat.crash.g.f4581a
            boolean r3 = h.Hchat.crash.g.f4589i
            if (r3 != 0) goto L1c
            java.util.concurrent.atomic.AtomicBoolean r0 = h.Hchat.crash.g.f4586f
            r0.set(r1)
            goto Lc9
        L1c:
            java.lang.ref.WeakReference r3 = h.Hchat.crash.g.f4592l
            java.lang.Object r3 = r3.get()
            if (r3 != r0) goto La8
            boolean r3 = r0.isFinishing()
            if (r3 != 0) goto La8
            boolean r3 = r0.isDestroyed()
            if (r3 == 0) goto L32
            goto La8
        L32:
            java.io.File r3 = h.Hchat.crash.g.f4599s
            java.lang.String r4 = "pendingReportFile"
            if (r3 == 0) goto La4
            java.lang.String r3 = h.Hchat.crash.g.j(r3)
            if (r3 == 0) goto L93
            boolean r5 = og.m.t0(r3)
            if (r5 == 0) goto L45
            goto L93
        L45:
            int r2 = r3.length()
            r4 = 32768(0x8000, float:4.5918E-41)
            if (r2 > r4) goto L50
            r2 = r3
            goto L5a
        L50:
            java.lang.String r2 = og.m.P0(r4, r3)
            java.lang.String r4 = "\n\n[日志较长，界面仅展示部分内容；点击日志或复制按钮仍会复制完整内容]"
            java.lang.String r2 = r2.concat(r4)
        L5a:
            java.util.concurrent.atomic.AtomicBoolean r4 = new java.util.concurrent.atomic.AtomicBoolean
            r5 = 1
            r4.<init>(r5)
            aa.c r6 = new aa.c
            r7 = 9
            r6.<init>(r4, r7, r3)
            wb.su r7 = new wb.su
            r7.<init>(r0, r3, r2)
            s0.d r2 = new s0.d
            r3 = 2037942914(0x79788a82, float:8.065618E34)
            r2.<init>(r3, r7, r5)
            wb.kv r2 = wb.y2.P1(r0, r6, r2)
            boolean r3 = r2.a()
            if (r3 == 0) goto L8a
            h.Hchat.crash.g.f4593m = r2
            java.lang.ref.WeakReference r1 = new java.lang.ref.WeakReference
            r1.<init>(r0)
            h.Hchat.crash.g.f4594n = r1
            h.Hchat.crash.g.f4595o = r4
            goto Lc9
        L8a:
            r4.set(r1)
            java.util.concurrent.atomic.AtomicBoolean r0 = h.Hchat.crash.g.f4586f
            r0.set(r1)
            goto Lc9
        L93:
            java.io.File r0 = h.Hchat.crash.g.f4599s
            if (r0 == 0) goto La0
            r0.delete()
            java.util.concurrent.atomic.AtomicBoolean r0 = h.Hchat.crash.g.f4586f
            r0.set(r1)
            goto Lc9
        La0:
            gg.l.g(r4)
            throw r2
        La4:
            gg.l.g(r4)
            throw r2
        La8:
            java.util.concurrent.atomic.AtomicBoolean r0 = h.Hchat.crash.g.f4586f
            r0.set(r1)
            java.lang.ref.WeakReference r0 = h.Hchat.crash.g.f4592l
            java.lang.Object r0 = r0.get()
            android.app.Activity r0 = (android.app.Activity) r0
            if (r0 == 0) goto Lc9
            boolean r1 = r0.isFinishing()
            if (r1 != 0) goto Lc4
            boolean r1 = r0.isDestroyed()
            if (r1 != 0) goto Lc4
            r2 = r0
        Lc4:
            if (r2 == 0) goto Lc9
            h.Hchat.crash.g.k(r2)
        Lc9:
            return
    }
}
