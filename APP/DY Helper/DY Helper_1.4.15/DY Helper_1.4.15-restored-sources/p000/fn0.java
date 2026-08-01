package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class fn0 implements java.lang.Runnable {

    /* JADX INFO: renamed from: ε */
    public final /* synthetic */ int f4026;

    /* JADX INFO: renamed from: ζ */
    public final /* synthetic */ p000.p70 f4027;

    /* JADX INFO: renamed from: η */
    public final /* synthetic */ android.app.Activity f4028;

    public /* synthetic */ fn0(int r1, p000.p70 r2, android.app.Activity r3) {
            r0 = this;
            r0.f4026 = r1
            r0.f4027 = r2
            r0.f4028 = r3
            r0.<init>()
            return
    }

    @Override // java.lang.Runnable
    public final void run() {
            r5 = this;
            int r0 = r5.f4026
            switch(r0) {
                case 0: goto L2b;
                default: goto L5;
            }
        L5:
            p70 r0 = r5.f4027
            android.app.Activity r5 = r5.f4028
            java.util.concurrent.atomic.AtomicBoolean r1 = p000.wg1.f11716
            r2 = 0
            r0.invoke()     // Catch: java.lang.Throwable -> L13
        Lf:
            r1.set(r2)
            goto L25
        L13:
            r0 = move-exception
            java.lang.String r3 = "rc62a71041a7416a5"
            java.lang.String r4 = "火星发送测试异常"
            p000.C0888ux.m5977(r3, r4, r0)     // Catch: java.lang.Throwable -> L26
            tx0 r3 = new tx0     // Catch: java.lang.Throwable -> L26
            r4 = 4
            r3.<init>(r5, r0, r4)     // Catch: java.lang.Throwable -> L26
            r5.runOnUiThread(r3)     // Catch: java.lang.Throwable -> L26
            goto Lf
        L25:
            return
        L26:
            r5 = move-exception
            r1.set(r2)
            throw r5
        L2b:
            p70 r0 = r5.f4027
            java.lang.Object r0 = r0.invoke()     // Catch: java.lang.Throwable -> L32
            goto L39
        L32:
            r0 = move-exception
            eo1 r1 = new eo1
            r1.<init>(r0)
            r0 = r1
        L39:
            java.lang.Throwable r0 = p000.fo1.m2190(r0)
            if (r0 == 0) goto L54
            java.lang.String r1 = "DYHelper"
            java.lang.String r2 = "分享面板快捷操作执行失败"
            p000.C0888ux.m5977(r1, r2, r0)
            android.app.Activity r5 = r5.f4028
            if (r5 == 0) goto L54
            java.lang.String r0 = "操作执行失败"
            r1 = 0
            android.widget.Toast r5 = android.widget.Toast.makeText(r5, r0, r1)
            r5.show()
        L54:
            return
    }
}
