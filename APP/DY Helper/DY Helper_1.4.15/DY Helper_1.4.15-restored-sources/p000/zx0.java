package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class zx0 implements p000.a80 {

    /* JADX INFO: renamed from: ε */
    public final /* synthetic */ int f13345;

    /* JADX INFO: renamed from: ζ */
    public final /* synthetic */ android.app.Activity f13346;

    /* JADX INFO: renamed from: η */
    public final /* synthetic */ p000.C0276f8 f13347;

    public /* synthetic */ zx0(android.app.Activity r1, p000.C0276f8 r2, int r3) {
            r0 = this;
            r0.f13345 = r3
            r0.f13346 = r1
            r0.f13347 = r2
            r0.<init>()
            return
    }

    @Override // p000.a80
    public final java.lang.Object invoke(java.lang.Object r6) {
            r5 = this;
            int r0 = r5.f13345
            switch(r0) {
                case 0: goto L13;
                default: goto L5;
            }
        L5:
            java.lang.String r6 = (java.lang.String) r6
            qy0 r0 = p000.qy0.f9157
            android.app.Activity r1 = r5.f13346
            f8 r5 = r5.f13347
            r0.m5026(r1, r5, r6)
            s62 r5 = p000.s62.f9751
            return r5
        L13:
            java.util.List r6 = (java.util.List) r6
            r6.getClass()
            qy0 r0 = p000.qy0.f9157
            android.app.Activity r1 = r5.f13346
            r1.getClass()
            iu r2 = p000.AbstractC1021yh.m6915(r1)
            java.lang.String r3 = r2.f5186
            if (r3 == 0) goto L3b
            boolean r3 = p000.q02.m4671(r3)
            if (r3 == 0) goto L2e
            goto L3b
        L2e:
            boolean r2 = r2.m2799()
            if (r2 != 0) goto L3b
            java.lang.String r2 = "DYHelper"
            java.lang.String r3 = "[DOWNLOAD-STORAGE] 当前空间无可用 SAF 授权，改用 MediaStore"
            p000.C0888ux.m5975(r2, r3)
        L3b:
            boolean r2 = r6.isEmpty()
            if (r2 == 0) goto L47
            java.lang.String r5 = "没有选择任何内容"
            p000.qy0.m4991(r1, r5)
            goto La5
        L47:
            java.lang.String r2 = "dat"
            f8 r5 = r5.f13347
            java.lang.String r2 = p000.qy0.m4966(r1, r5, r2)
            java.lang.String r2 = p000.q02.m4692(r2)
            java.lang.Object r3 = p000.AbstractC0984xh.m6638(r6)
            zy0 r3 = (p000.zy0) r3
            az0 r3 = r3.f13351
            int r3 = r3.ordinal()
            if (r3 == 0) goto L78
            r4 = 1
            if (r3 == r4) goto L75
            r4 = 2
            if (r3 == r4) goto L72
            r4 = 3
            if (r3 != r4) goto L6d
            jy0 r3 = p000.jy0.f5663
            goto L7a
        L6d:
            p000.C1080.m7272()
            r5 = 0
            goto La7
        L72:
            jy0 r3 = p000.jy0.f5662
            goto L7a
        L75:
            jy0 r3 = p000.jy0.f5660
            goto L7a
        L78:
            jy0 r3 = p000.jy0.f5661
        L7a:
            fv r0 = p000.qy0.m5014(r0, r1, r5, r3, r2)
            java.lang.String r2 = "download_confirm_filename"
            r3 = 0
            boolean r2 = p000.qy0.m5009(r1, r2, r3)
            if (r2 != 0) goto L8c
            r0 = 0
            p000.qy0.m4955(r1, r5, r6, r0)
            goto La5
        L8c:
            int r2 = r6.size()
            java.lang.String r3 = "将保存 "
            java.lang.String r4 = " 项资源，文件名会按资源类型和页码自动追加后缀。"
            java.lang.String r2 = p000.AbstractC0602nx.m4127(r3, r2, r4)
            java.lang.String r0 = r0.f4140
            m3 r3 = new m3
            r4 = 4
            r3.<init>(r1, r5, r6, r4)
            java.lang.String r5 = "确认已选资源文件名"
            p000.qy0.m4980(r1, r5, r2, r0, r3)
        La5:
            java.lang.Boolean r5 = java.lang.Boolean.TRUE
        La7:
            return r5
    }
}
