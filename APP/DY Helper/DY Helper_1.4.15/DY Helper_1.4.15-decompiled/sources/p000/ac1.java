package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ac1 implements p000.a80 {

    /* JADX INFO: renamed from: ε */
    public final /* synthetic */ long f185;

    /* JADX INFO: renamed from: ζ */
    public final /* synthetic */ android.app.Activity f186;

    /* JADX INFO: renamed from: η */
    public final /* synthetic */ p000.mb1 f187;

    public /* synthetic */ ac1(long r1, android.app.Activity r3, p000.mb1 r4) {
            r0 = this;
            r0.<init>()
            r0.f185 = r1
            r0.f186 = r3
            r0.f187 = r4
            return
    }

    @Override // p000.a80
    public final java.lang.Object invoke(java.lang.Object r10) {
            r9 = this;
            long r1 = r9.f185
            android.app.Activity r6 = r9.f186
            mb1 r3 = r9.f187
            r4 = r10
            gc1 r4 = (p000.gc1) r4
            r4.getClass()
            a r9 = p000.jc1.f5426
            monitor-enter(r9)
            java.lang.Object r10 = r9.f1     // Catch: java.lang.Throwable -> L31
            ｚ r10 = (p000.C1156) r10     // Catch: java.lang.Throwable -> L31
            boolean r10 = r10.f13525     // Catch: java.lang.Throwable -> L31
            if (r10 == 0) goto L34
            java.lang.Object r10 = r9.f1     // Catch: java.lang.Throwable -> L31
            ｚ r10 = (p000.C1156) r10     // Catch: java.lang.Throwable -> L31
            long r7 = r10.f13524     // Catch: java.lang.Throwable -> L31
            int r10 = (r7 > r1 ? 1 : (r7 == r1 ? 0 : -1))
            if (r10 == 0) goto L22
            goto L34
        L22:
            java.lang.Object r10 = r9.f1     // Catch: java.lang.Throwable -> L31
            ｚ r10 = (p000.C1156) r10     // Catch: java.lang.Throwable -> L31
            r0 = 0
            r5 = 11
            ｚ r10 = p000.C1156.m7363(r10, r4, r0, r5)     // Catch: java.lang.Throwable -> L31
            r9.f1 = r10     // Catch: java.lang.Throwable -> L31
            monitor-exit(r9)
            goto L35
        L31:
            r0 = move-exception
            r10 = r0
            goto L41
        L34:
            monitor-exit(r9)
        L35:
            zb1 r0 = new zb1
            r5 = 2
            r0.<init>(r1, r3, r4, r5)
            r6.runOnUiThread(r0)
            s62 r9 = p000.s62.f9751
            return r9
        L41:
            monitor-exit(r9)     // Catch: java.lang.Throwable -> L31
            throw r10
    }
}
