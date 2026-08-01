package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class a71 implements p000.a80 {

    /* JADX INFO: renamed from: ε */
    public final /* synthetic */ android.view.View f87;

    /* JADX INFO: renamed from: ζ */
    public final /* synthetic */ android.app.Activity f88;

    /* JADX INFO: renamed from: η */
    public final /* synthetic */ p000.um1 f89;

    /* JADX INFO: renamed from: θ */
    public final /* synthetic */ p000.um1 f90;

    /* JADX INFO: renamed from: ι */
    public final /* synthetic */ java.util.List f91;

    /* JADX INFO: renamed from: κ */
    public final /* synthetic */ boolean f92;

    public /* synthetic */ a71(android.view.View r1, android.app.Activity r2, p000.um1 r3, p000.um1 r4, java.util.List r5, boolean r6) {
            r0 = this;
            r0.<init>()
            r0.f87 = r1
            r0.f88 = r2
            r0.f89 = r3
            r0.f90 = r4
            r0.f91 = r5
            r0.f92 = r6
            return
    }

    @Override // p000.a80
    public final java.lang.Object invoke(java.lang.Object r10) {
            r9 = this;
            android.app.Activity r3 = r9.f88
            um1 r1 = r9.f89
            um1 r2 = r9.f90
            java.util.List r4 = r9.f91
            boolean r5 = r9.f92
            j71 r10 = (p000.j71) r10
            r10.getClass()
            boolean r0 = r10.f5350
            java.lang.String r6 = r10.f5344
            r7 = 0
            p70 r8 = r10.f5351     // Catch: java.lang.Throwable -> L27
            r8.invoke()     // Catch: java.lang.Throwable -> L27
            boolean r10 = r10.f5346     // Catch: java.lang.Throwable -> L27
            android.view.View r9 = r9.f87
            if (r10 == 0) goto L2a
            if (r0 != 0) goto L2a
            q71 r10 = p000.q71.f8896     // Catch: java.lang.Throwable -> L27
            p000.q71.m4794(r9)     // Catch: java.lang.Throwable -> L27
            goto L57
        L27:
            r0 = move-exception
            r9 = r0
            goto L3f
        L2a:
            if (r0 != 0) goto L57
            java.lang.String r10 = "书签"
            boolean r10 = p000.q02.m4654(r6, r10, r7)     // Catch: java.lang.Throwable -> L27
            if (r10 == 0) goto L57
            xg0 r0 = new xg0     // Catch: java.lang.Throwable -> L27
            r0.<init>(r1, r2, r3, r4, r5)     // Catch: java.lang.Throwable -> L27
            r1 = 120(0x78, double:5.93E-322)
            r9.postDelayed(r0, r1)     // Catch: java.lang.Throwable -> L27
            goto L57
        L3f:
            java.lang.String r10 = "操作面板执行失败: "
            java.lang.String r10 = r10.concat(r6)
            java.lang.String r0 = "DYHelper"
            p000.C0888ux.m5977(r0, r10, r9)
            java.lang.String r9 = "执行失败"
            java.lang.String r9 = r6.concat(r9)
            android.widget.Toast r9 = android.widget.Toast.makeText(r3, r9, r7)
            r9.show()
        L57:
            s62 r9 = p000.s62.f9751
            return r9
    }
}
