package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class en0 implements java.lang.Runnable {

    /* JADX INFO: renamed from: ε */
    public final /* synthetic */ int f3600;

    /* JADX INFO: renamed from: ζ */
    public final /* synthetic */ int f3601;

    /* JADX INFO: renamed from: η */
    public final /* synthetic */ java.lang.Object f3602;

    public /* synthetic */ en0(int r1, int r2, java.lang.Object r3) {
            r0 = this;
            r0.f3600 = r2
            r0.f3602 = r3
            r0.f3601 = r1
            r0.<init>()
            return
    }

    @Override // java.lang.Runnable
    public final void run() {
            r4 = this;
            int r0 = r4.f3600
            int r1 = r4.f3601
            java.lang.Object r4 = r4.f3602
            switch(r0) {
                case 0: goto L53;
                case 1: goto L26;
                default: goto L9;
            }
        L9:
            e80 r4 = (p000.e80) r4
            java.lang.Integer r0 = java.lang.Integer.valueOf(r1)
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "转码中 "
            r2.<init>(r3)
            r2.append(r1)
            java.lang.String r1 = "%"
            r2.append(r1)
            java.lang.String r1 = r2.toString()
            r4.invoke(r0, r1)
            return
        L26:
            android.app.Activity r4 = (android.app.Activity) r4
            boolean r0 = r4.isFinishing()
            if (r0 != 0) goto L52
            boolean r0 = r4.isDestroyed()
            if (r0 == 0) goto L35
            goto L52
        L35:
            ht0 r0 = p000.ht0.f4800
            java.lang.ClassLoader r0 = r4.getClassLoader()
            r0.getClass()
            p000.ht0.m2536(r0)
            int r0 = p000.ht0.m2537(r4)
            if (r0 != 0) goto L52
            boolean r0 = p000.ht0.m2531()
            if (r0 == 0) goto L52
            int r1 = r1 + 1
            p000.ht0.m2538(r4, r1)
        L52:
            return
        L53:
            android.app.Dialog r4 = (android.app.Dialog) r4
            java.lang.String r0 = "DYHelper:  第 "
            boolean r2 = r4.isShowing()     // Catch: java.lang.Throwable -> L83
            if (r2 != 0) goto L5e
            goto L8d
        L5e:
            android.os.Handler r2 = p000.in0.f5135     // Catch: java.lang.Throwable -> L83
            boolean r2 = p000.in0.m2775(r4)     // Catch: java.lang.Throwable -> L83
            if (r2 == 0) goto L7d
            int r1 = r1 + 1
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L83
            r4.<init>(r0)     // Catch: java.lang.Throwable -> L83
            r4.append(r1)     // Catch: java.lang.Throwable -> L83
            java.lang.String r0 = " 次轮询注入成功"
            r4.append(r0)     // Catch: java.lang.Throwable -> L83
            java.lang.String r4 = r4.toString()     // Catch: java.lang.Throwable -> L83
            p000.C0888ux.m5985(r4)     // Catch: java.lang.Throwable -> L83
            goto L8d
        L7d:
            int r1 = r1 + 1
            p000.in0.m2771(r4, r1)     // Catch: java.lang.Throwable -> L83
            goto L8d
        L83:
            r4 = move-exception
            java.lang.String r4 = r4.getMessage()
            java.lang.String r0 = "DYHelper: 注入下载按钮失败: "
            p000.AbstractC0602nx.m4142(r0, r4)
        L8d:
            return
    }
}
