package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class yb1 implements java.lang.Runnable {

    /* JADX INFO: renamed from: ε */
    public final /* synthetic */ int f12549;

    /* JADX INFO: renamed from: ζ */
    public final /* synthetic */ android.app.Activity f12550;

    /* JADX INFO: renamed from: η */
    public final /* synthetic */ long f12551;

    /* JADX INFO: renamed from: θ */
    public final /* synthetic */ java.io.Serializable f12552;

    /* JADX INFO: renamed from: ι */
    public final /* synthetic */ java.lang.Object f12553;

    /* JADX INFO: renamed from: κ */
    public final /* synthetic */ p000.m80 f12554;

    public /* synthetic */ yb1(long r2, android.app.Activity r4, p000.EnumC0619od r5, p000.mb1 r6, p000.mb1 r7) {
            r1 = this;
            r0 = 0
            r1.f12549 = r0
            r1.<init>()
            r1.f12551 = r2
            r1.f12550 = r4
            r1.f12552 = r5
            r1.f12553 = r6
            r1.f12554 = r7
            return
    }

    public /* synthetic */ yb1(p000.qm1 r2, android.app.Activity r3, android.app.AlertDialog r4, long r5, p000.p70 r7) {
            r1 = this;
            r0 = 1
            r1.f12549 = r0
            r1.<init>()
            r1.f12552 = r2
            r1.f12550 = r3
            r1.f12553 = r4
            r1.f12551 = r5
            r1.f12554 = r7
            return
    }

    @Override // java.lang.Runnable
    public final void run() {
            r18 = this;
            r0 = r18
            int r1 = r0.f12549
            m80 r2 = r0.f12554
            java.lang.Object r3 = r0.f12553
            android.app.Activity r4 = r0.f12550
            java.io.Serializable r5 = r0.f12552
            switch(r1) {
                case 0: goto L39;
                default: goto Lf;
            }
        Lf:
            qm1 r5 = (p000.qm1) r5
            android.app.AlertDialog r3 = (android.app.AlertDialog) r3
            p70 r2 = (p000.p70) r2
            boolean r1 = r5.f9050
            if (r1 == 0) goto L1a
            goto L38
        L1a:
            boolean r1 = r4.isFinishing()
            if (r1 == 0) goto L21
            goto L38
        L21:
            boolean r1 = r3.isShowing()
            if (r1 != 0) goto L28
            goto L38
        L28:
            java.util.concurrent.atomic.AtomicLong r1 = p000.bv1.f1870
            long r3 = r1.get()
            long r0 = r0.f12551
            int r0 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r0 == 0) goto L35
            goto L38
        L35:
            r2.invoke()
        L38:
            return
        L39:
            long r6 = r0.f12551
            r9 = r5
            od r9 = (p000.EnumC0619od) r9
            mb1 r3 = (p000.mb1) r3
            mb1 r2 = (p000.mb1) r2
            java.util.concurrent.atomic.AtomicBoolean r0 = p000.jc1.f5424
            java.lang.ClassLoader r8 = p000.dd1.m1717(r4)     // Catch: java.lang.Throwable -> L58
            ac1 r14 = new ac1     // Catch: java.lang.Throwable -> L58
            r14.<init>(r6, r4, r3)     // Catch: java.lang.Throwable -> L58
            r15 = 56
            r10 = 0
            r11 = 0
            r12 = 0
            r13 = 0
            dc1 r0 = p000.jc1.m2934(r8, r9, r10, r11, r12, r13, r14, r15)     // Catch: java.lang.Throwable -> L58
            goto L5f
        L58:
            r0 = move-exception
            eo1 r1 = new eo1
            r1.<init>(r0)
            r0 = r1
        L5f:
            java.lang.Throwable r1 = p000.fo1.m2190(r0)
            java.lang.String r3 = "r7ce9b41b1577bc7d"
            if (r1 != 0) goto L68
            goto L82
        L68:
            java.lang.String r0 = "营地后台任务线程异常"
            p000.C0888ux.m5977(r3, r0, r1)
            dc1 r8 = new dc1
            java.util.concurrent.atomic.AtomicBoolean r0 = p000.jc1.f5425
            boolean r16 = r0.get()
            r17 = 316(0x13c, float:4.43E-43)
            r9 = 0
            r10 = 0
            r11 = 0
            r12 = 0
            r13 = 0
            r14 = 0
            r15 = 1
            r8.<init>(r9, r10, r11, r12, r13, r14, r15, r16, r17)
            r0 = r8
        L82:
            r9 = r0
            dc1 r9 = (p000.dc1) r9
            a r0 = p000.jc1.f5426
            r0.m0(r6, r9)
            zb1 r5 = new zb1     // Catch: java.lang.Throwable -> L97
            r10 = 1
            r8 = r2
            r5.<init>(r6, r8, r9, r10)     // Catch: java.lang.Throwable -> L97
            r4.runOnUiThread(r5)     // Catch: java.lang.Throwable -> L97
            s62 r0 = p000.s62.f9751     // Catch: java.lang.Throwable -> L97
            goto L9e
        L97:
            r0 = move-exception
            eo1 r1 = new eo1
            r1.<init>(r0)
            r0 = r1
        L9e:
            java.lang.Throwable r0 = p000.fo1.m2190(r0)
            if (r0 == 0) goto La9
            java.lang.String r1 = "营地后台任务结果回调失败"
            p000.C0888ux.m5977(r3, r1, r0)
        La9:
            return
    }
}
