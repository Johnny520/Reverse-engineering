package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class b72 extends p000.m01 {

    /* JADX INFO: renamed from: α */
    public final /* synthetic */ int f1553;

    /* JADX INFO: renamed from: β */
    public final /* synthetic */ p000.fe0 f1554;

    public /* synthetic */ b72(p000.fe0 r1, int r2) {
            r0 = this;
            r0.f1553 = r2
            r0.f1554 = r1
            r0.<init>()
            return
    }

    @Override // p000.m01
    public final void beforeHookedMethod(p000.k01 r4) {
            r3 = this;
            int r0 = r3.f1553
            r4.getClass()
            switch(r0) {
                case 0: goto L64;
                default: goto L8;
            }
        L8:
            java.lang.Object[] r0 = r4.f5692
            be0 r1 = p000.be0.f1670
            boolean r1 = r1.m939()
            if (r1 != 0) goto L13
            goto L63
        L13:
            fe0 r3 = r3.f1554
            java.lang.Class r3 = r3.f3911
            java.lang.Object r4 = r4.f5691
            boolean r3 = r3.isInstance(r4)
            if (r3 != 0) goto L20
            goto L63
        L20:
            r0.getClass()     // Catch: java.lang.Throwable -> L4b
            r3 = 1
            java.lang.Object r4 = p000.AbstractC0312g7.m2253(r3, r0)     // Catch: java.lang.Throwable -> L4b
            boolean r1 = r4 instanceof java.util.List     // Catch: java.lang.Throwable -> L4b
            if (r1 == 0) goto L2f
            java.util.List r4 = (java.util.List) r4     // Catch: java.lang.Throwable -> L4b
            goto L30
        L2f:
            r4 = 0
        L30:
            if (r4 != 0) goto L33
            goto L63
        L33:
            java.util.ArrayList r1 = p000.vd0.m6180(r4)     // Catch: java.lang.Throwable -> L4b
            int r2 = r1.size()     // Catch: java.lang.Throwable -> L4b
            int r4 = r4.size()     // Catch: java.lang.Throwable -> L4b
            if (r2 >= r4) goto L48
            java.util.ArrayList r4 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L4b
            r4.<init>(r1)     // Catch: java.lang.Throwable -> L4b
            r0[r3] = r4     // Catch: java.lang.Throwable -> L4b
        L48:
            s62 r3 = p000.s62.f9751     // Catch: java.lang.Throwable -> L4b
            goto L52
        L4b:
            r3 = move-exception
            eo1 r4 = new eo1
            r4.<init>(r3)
            r3 = r4
        L52:
            java.lang.Throwable r3 = p000.fo1.m2190(r3)
            if (r3 == 0) goto L63
            java.lang.String r3 = r3.getMessage()
            java.lang.String r4 = "search suggestion callback failed: "
            java.lang.String r0 = "r3912affb67f40e11"
            p000.AbstractC0602nx.m4143(r4, r3, r0)
        L63:
            return
        L64:
            java.lang.Object[] r0 = r4.f5692
            be0 r1 = p000.be0.f1670
            boolean r1 = r1.m939()
            if (r1 != 0) goto L6f
            goto Lbf
        L6f:
            fe0 r3 = r3.f1554
            java.lang.Class r3 = r3.f3911
            java.lang.Object r4 = r4.f5691
            boolean r3 = r3.isInstance(r4)
            if (r3 != 0) goto L7c
            goto Lbf
        L7c:
            r0.getClass()     // Catch: java.lang.Throwable -> La7
            r3 = 0
            java.lang.Object r4 = p000.AbstractC0312g7.m2253(r3, r0)     // Catch: java.lang.Throwable -> La7
            boolean r1 = r4 instanceof java.util.List     // Catch: java.lang.Throwable -> La7
            if (r1 == 0) goto L8b
            java.util.List r4 = (java.util.List) r4     // Catch: java.lang.Throwable -> La7
            goto L8c
        L8b:
            r4 = 0
        L8c:
            if (r4 != 0) goto L8f
            goto Lbf
        L8f:
            java.util.ArrayList r1 = p000.vd0.m6180(r4)     // Catch: java.lang.Throwable -> La7
            int r2 = r1.size()     // Catch: java.lang.Throwable -> La7
            int r4 = r4.size()     // Catch: java.lang.Throwable -> La7
            if (r2 >= r4) goto La4
            java.util.ArrayList r4 = new java.util.ArrayList     // Catch: java.lang.Throwable -> La7
            r4.<init>(r1)     // Catch: java.lang.Throwable -> La7
            r0[r3] = r4     // Catch: java.lang.Throwable -> La7
        La4:
            s62 r3 = p000.s62.f9751     // Catch: java.lang.Throwable -> La7
            goto Lae
        La7:
            r3 = move-exception
            eo1 r4 = new eo1
            r4.<init>(r3)
            r3 = r4
        Lae:
            java.lang.Throwable r3 = p000.fo1.m2190(r3)
            if (r3 == 0) goto Lbf
            java.lang.String r3 = r3.getMessage()
            java.lang.String r4 = "feed search callback failed: "
            java.lang.String r0 = "r3912affb67f40e11"
            p000.AbstractC0602nx.m4143(r4, r3, r0)
        Lbf:
            return
    }
}
