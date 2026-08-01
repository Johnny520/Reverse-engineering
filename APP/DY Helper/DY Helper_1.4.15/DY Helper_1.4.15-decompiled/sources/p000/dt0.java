package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class dt0 implements p000.e80 {

    /* JADX INFO: renamed from: ε */
    public final /* synthetic */ int f3278;

    /* JADX INFO: renamed from: ζ */
    public final /* synthetic */ p000.gt0 f3279;

    public /* synthetic */ dt0(p000.gt0 r1, int r2) {
            r0 = this;
            r0.f3278 = r2
            r0.f3279 = r1
            r0.<init>()
            return
    }

    @Override // p000.e80
    public final java.lang.Object invoke(java.lang.Object r12, java.lang.Object r13) {
            r11 = this;
            int r0 = r11.f3278
            s62 r1 = p000.s62.f9751
            switch(r0) {
                case 0: goto L7c;
                default: goto L7;
            }
        L7:
            v80 r12 = (p000.v80) r12
            java.lang.Integer r13 = (java.lang.Integer) r13
            int r13 = r13.intValue()
            r0 = r13 & 3
            r2 = 2
            r3 = 1
            if (r0 == r2) goto L17
            r0 = r3
            goto L18
        L17:
            r0 = 0
        L18:
            r13 = r13 & r3
            boolean r13 = r12.m6075(r13, r0)
            if (r13 == 0) goto L78
            gt0 r4 = r11.f3279
            x91 r11 = r4.f4453
            java.lang.Object r11 = r11.getValue()
            ps0 r11 = (p000.ps0) r11
            boolean r13 = r12.m6092(r4)
            java.lang.Object r0 = r12.m6073()
            i2 r10 = p000.C0730qn.f9051
            if (r13 != 0) goto L37
            if (r0 != r10) goto L4a
        L37:
            ng r2 = new ng
            r8 = 0
            r9 = 26
            r3 = 1
            java.lang.Class<gt0> r5 = p000.gt0.class
            java.lang.String r6 = "handleTabClick"
            java.lang.String r7 = "handleTabClick(Ljava/lang/String;)V"
            r2.<init>(r3, r4, r5, r6, r7, r8, r9)
            r12.m6115(r2)
            r0 = r2
        L4a:
            ko0 r0 = (p000.ko0) r0
            a80 r0 = (p000.a80) r0
            boolean r13 = r12.m6092(r4)
            java.lang.Object r2 = r12.m6073()
            if (r13 != 0) goto L5a
            if (r2 != r10) goto L6c
        L5a:
            ng r2 = new ng
            r8 = 0
            r9 = 27
            r3 = 1
            java.lang.Class<gt0> r5 = p000.gt0.class
            java.lang.String r6 = "handleTabLongClick"
            java.lang.String r7 = "handleTabLongClick(Ljava/lang/String;)V"
            r2.<init>(r3, r4, r5, r6, r7, r8, r9)
            r12.m6115(r2)
        L6c:
            ko0 r2 = (p000.ko0) r2
            a80 r2 = (p000.a80) r2
            ps0 r13 = p000.ps0.f8686
            r13 = 8
            p000.jx0.m3036(r11, r0, r2, r12, r13)
            goto L7b
        L78:
            r12.m6078()
        L7b:
            return r1
        L7c:
            java.lang.String r12 = (java.lang.String) r12
            java.lang.Throwable r13 = (java.lang.Throwable) r13
            r12.getClass()
            r13.getClass()
            java.lang.String r0 = "backdrop:"
            java.lang.String r12 = r0.concat(r12)
            java.lang.String r0 = "捕获宿主底栏背景失败，将继续使用降级材质"
            gt0 r11 = r11.f3279
            r11.m2320(r12, r0, r13)
            return r1
    }
}
