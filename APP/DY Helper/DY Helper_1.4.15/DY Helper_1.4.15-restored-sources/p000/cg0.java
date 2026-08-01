package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class cg0 implements p000.p70 {

    /* JADX INFO: renamed from: ε */
    public final p000.gg0 f2105;

    /* JADX INFO: renamed from: ζ */
    public final /* synthetic */ p000.dg0 f2106;

    public cg0(p000.dg0 r1, p000.gg0 r2) {
            r0 = this;
            r0.<init>()
            r0.f2106 = r1
            r0.f2105 = r2
            return
    }

    @Override // p000.p70
    public final java.lang.Object invoke() {
            r5 = this;
            dg0 r0 = r5.f2106
            gg0 r1 = r5.f2105
            sz r2 = p000.EnumC0816sz.f10089
            r3 = 1
            r4 = 0
            boolean r3 = r1.m2306(r3, r5)     // Catch: java.io.IOException -> L28 java.lang.Throwable -> L36
            if (r3 == 0) goto L2c
        Le:
            r3 = 0
            boolean r3 = r1.m2306(r3, r5)     // Catch: java.lang.Throwable -> L25 java.io.IOException -> L28
            if (r3 != 0) goto Le
            sz r5 = p000.EnumC0816sz.f10087     // Catch: java.lang.Throwable -> L25 java.io.IOException -> L28
            sz r2 = p000.EnumC0816sz.f10092     // Catch: java.lang.Throwable -> L20 java.io.IOException -> L22
            r0.m1738(r5, r2, r4)
        L1c:
            p000.sd2.m5472(r1)
            goto L3e
        L20:
            r3 = move-exception
            goto L41
        L22:
            r3 = move-exception
            r4 = r3
            goto L38
        L25:
            r3 = move-exception
        L26:
            r5 = r2
            goto L41
        L28:
            r5 = move-exception
            r4 = r5
            r5 = r2
            goto L38
        L2c:
            java.io.IOException r5 = new java.io.IOException     // Catch: java.io.IOException -> L28 java.lang.Throwable -> L36
            java.lang.String r3 = "Required SETTINGS preface not received"
            r5.<init>(r3)     // Catch: java.io.IOException -> L28 java.lang.Throwable -> L36
            throw r5     // Catch: java.io.IOException -> L28 java.lang.Throwable -> L36
        L34:
            r3 = r5
            goto L26
        L36:
            r5 = move-exception
            goto L34
        L38:
            sz r5 = p000.EnumC0816sz.f10088     // Catch: java.lang.Throwable -> L20
            r0.m1738(r5, r5, r4)
            goto L1c
        L3e:
            s62 r5 = p000.s62.f9751
            return r5
        L41:
            r0.m1738(r5, r2, r4)
            p000.sd2.m5472(r1)
            throw r3
    }
}
