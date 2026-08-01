package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class at1 implements java.lang.Runnable {

    /* JADX INFO: renamed from: ε */
    public final /* synthetic */ int f1303;

    /* JADX INFO: renamed from: ζ */
    public final /* synthetic */ p000.bt1 f1304;

    /* JADX INFO: renamed from: η */
    public final /* synthetic */ android.content.Intent f1305;

    public /* synthetic */ at1(p000.bt1 r1, android.content.Intent r2, int r3) {
            r0 = this;
            r0.f1303 = r3
            r0.f1304 = r1
            r0.f1305 = r2
            r0.<init>()
            return
    }

    @Override // java.lang.Runnable
    public final void run() {
            r4 = this;
            int r0 = r4.f1303
            switch(r0) {
                case 0: goto L2c;
                default: goto L5;
            }
        L5:
            bt1 r0 = r4.f1304
            android.content.Intent r4 = r4.f1305
            r1 = 1004(0x3ec, float:1.407E-42)
            r0.startActivityForResult(r4, r1)     // Catch: java.lang.Throwable -> Lf
            goto L2b
        Lf:
            r4 = move-exception
            e80 r0 = r0.f1837
            if (r0 == 0) goto L2b
            java.lang.Boolean r1 = java.lang.Boolean.FALSE
            java.lang.String r4 = r4.getMessage()
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "导入失败: "
            r2.<init>(r3)
            r2.append(r4)
            java.lang.String r4 = r2.toString()
            r0.invoke(r1, r4)
        L2b:
            return
        L2c:
            bt1 r0 = r4.f1304
            android.content.Intent r4 = r4.f1305
            r1 = 1003(0x3eb, float:1.406E-42)
            r0.startActivityForResult(r4, r1)     // Catch: java.lang.Throwable -> L36
            goto L52
        L36:
            r4 = move-exception
            e80 r0 = r0.f1837
            if (r0 == 0) goto L52
            java.lang.Boolean r1 = java.lang.Boolean.FALSE
            java.lang.String r4 = r4.getMessage()
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "导出失败: "
            r2.<init>(r3)
            r2.append(r4)
            java.lang.String r4 = r2.toString()
            r0.invoke(r1, r4)
        L52:
            return
    }
}
