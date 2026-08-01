package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class h52 implements p000.p70 {

    /* JADX INFO: renamed from: ε */
    public final /* synthetic */ int f4579;

    /* JADX INFO: renamed from: ζ */
    public final /* synthetic */ java.lang.Object f4580;

    /* JADX INFO: renamed from: η */
    public final /* synthetic */ int f4581;

    /* JADX INFO: renamed from: θ */
    public final /* synthetic */ int f4582;

    public /* synthetic */ h52(java.lang.Object r1, int r2, int r3, int r4) {
            r0 = this;
            r0.f4579 = r4
            r0.f4580 = r1
            r0.f4581 = r2
            r0.f4582 = r3
            r0.<init>()
            return
    }

    @Override // p000.p70
    public final java.lang.Object invoke() {
            r8 = this;
            int r0 = r8.f4579
            java.lang.String r1 = "跳过隐藏顶栏页异常: "
            java.lang.String r2 = " -> "
            java.lang.String r3 = "跳过隐藏顶栏页: "
            s62 r4 = p000.s62.f9751
            int r5 = r8.f4582
            int r6 = r8.f4581
            java.lang.Object r8 = r8.f4580
            switch(r0) {
                case 0: goto L51;
                case 1: goto L23;
                default: goto L13;
            }
        L13:
            dg0 r8 = (p000.dg0) r8
            lg0 r0 = r8.f3129     // Catch: java.io.IOException -> L1c
            r1 = 1
            r0.m3562(r6, r5, r1)     // Catch: java.io.IOException -> L1c
            goto L22
        L1c:
            r0 = move-exception
            sz r1 = p000.EnumC0816sz.f10088
            r8.m1738(r1, r1, r0)
        L22:
            return r4
        L23:
            java.lang.String r0 = "ra3f49bce40b36580"
            l52 r7 = p000.l52.f6428     // Catch: java.lang.Throwable -> L31
            int r7 = p000.l52.m3510(r8)     // Catch: java.lang.Throwable -> L31
            if (r7 == r6) goto L33
            p000.l52.m3519(r6, r8)     // Catch: java.lang.Throwable -> L31
            goto L33
        L31:
            r8 = move-exception
            goto L49
        L33:
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L31
            r8.<init>(r3)     // Catch: java.lang.Throwable -> L31
            r8.append(r5)     // Catch: java.lang.Throwable -> L31
            r8.append(r2)     // Catch: java.lang.Throwable -> L31
            r8.append(r6)     // Catch: java.lang.Throwable -> L31
            java.lang.String r8 = r8.toString()     // Catch: java.lang.Throwable -> L31
            p000.C0888ux.m5975(r0, r8)     // Catch: java.lang.Throwable -> L31
            goto L50
        L49:
            java.lang.String r2 = r8.getMessage()
            p000.AbstractC0602nx.m4145(r1, r2, r0, r8)
        L50:
            return r4
        L51:
            java.lang.String r0 = "r14983b95b84acb5"
            m52 r7 = p000.m52.f6942     // Catch: java.lang.Throwable -> L5f
            int r7 = p000.m52.m3741(r8)     // Catch: java.lang.Throwable -> L5f
            if (r7 == r6) goto L61
            p000.m52.m3750(r6, r8)     // Catch: java.lang.Throwable -> L5f
            goto L61
        L5f:
            r8 = move-exception
            goto L77
        L61:
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L5f
            r8.<init>(r3)     // Catch: java.lang.Throwable -> L5f
            r8.append(r5)     // Catch: java.lang.Throwable -> L5f
            r8.append(r2)     // Catch: java.lang.Throwable -> L5f
            r8.append(r6)     // Catch: java.lang.Throwable -> L5f
            java.lang.String r8 = r8.toString()     // Catch: java.lang.Throwable -> L5f
            p000.C0888ux.m5975(r0, r8)     // Catch: java.lang.Throwable -> L5f
            goto L7e
        L77:
            java.lang.String r2 = r8.getMessage()
            p000.AbstractC0602nx.m4145(r1, r2, r0, r8)
        L7e:
            return r4
    }
}
