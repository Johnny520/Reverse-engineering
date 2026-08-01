package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class g50 implements p000.f50 {

    /* JADX INFO: renamed from: α */
    public final p000.xn0 f4251;

    /* JADX INFO: renamed from: β */
    public final p000.C0344h2 f4252;

    /* JADX INFO: renamed from: γ */
    public final p000.cw1 f4253;

    /* JADX INFO: renamed from: δ */
    public final p000.k50 f4254;

    /* JADX INFO: renamed from: ε */
    public final p000.rk0 f4255;

    public g50(p000.xn0 r6, p000.C0344h2 r7) {
            r5 = this;
            cw1 r0 = p000.h50.f4575
            k50 r1 = new k50
            cw1 r2 = p000.h50.f4575
            r1.<init>()
            j50 r2 = p000.k50.f5758
            nc0 r3 = p000.AbstractC0487kt.f6112
            r2.getClass()
            up r2 = p000.pd2.m4462(r2, r3)
            hz r3 = p000.C0377hz.f4846
            up r2 = r2.mo1784(r3)
            o12 r3 = new o12
            r4 = 0
            r3.<init>(r4)
            up r2 = r2.mo1784(r3)
            p000.AbstractC1021yh.m6873(r2)
            rk0 r2 = new rk0
            r3 = 9
            r2.<init>(r3)
            r5.<init>()
            r5.f4251 = r6
            r5.f4252 = r7
            r5.f4253 = r0
            r5.f4254 = r1
            r5.f4255 = r2
            θ r6 = new θ
            r7 = 15
            r6.<init>(r7, r5)
            return
    }

    /* JADX INFO: renamed from: α */
    public final p000.n62 m2230(p000.m62 r5) {
            r4 = this;
            cw1 r0 = r4.f4253
            wa r1 = new wa
            r2 = 15
            r1.<init>(r4, r2, r5)
            java.lang.Object r4 = r0.f2789
            zz1 r4 = (p000.zz1) r4
            monitor-enter(r4)
            java.lang.Object r2 = r0.f2790     // Catch: java.lang.Throwable -> L2b
            kw0 r2 = (p000.kw0) r2     // Catch: java.lang.Throwable -> L2b
            java.lang.Object r2 = r2.m3421(r5)     // Catch: java.lang.Throwable -> L2b
            n62 r2 = (p000.n62) r2     // Catch: java.lang.Throwable -> L2b
            if (r2 == 0) goto L2d
            boolean r3 = r2.f7444     // Catch: java.lang.Throwable -> L2b
            if (r3 == 0) goto L20
            monitor-exit(r4)
            return r2
        L20:
            java.lang.Object r2 = r0.f2790     // Catch: java.lang.Throwable -> L2b
            kw0 r2 = (p000.kw0) r2     // Catch: java.lang.Throwable -> L2b
            java.lang.Object r2 = r2.m3423(r5)     // Catch: java.lang.Throwable -> L2b
            n62 r2 = (p000.n62) r2     // Catch: java.lang.Throwable -> L2b
            goto L2d
        L2b:
            r5 = move-exception
            goto L65
        L2d:
            monitor-exit(r4)
            qh1 r4 = new qh1     // Catch: java.lang.Exception -> L5c
            r2 = 10
            r4.<init>(r0, r2, r5)     // Catch: java.lang.Exception -> L5c
            java.lang.Object r4 = r1.invoke(r4)     // Catch: java.lang.Exception -> L5c
            n62 r4 = (p000.n62) r4     // Catch: java.lang.Exception -> L5c
            java.lang.Object r1 = r0.f2789
            zz1 r1 = (p000.zz1) r1
            monitor-enter(r1)
            java.lang.Object r2 = r0.f2790     // Catch: java.lang.Throwable -> L56
            kw0 r2 = (p000.kw0) r2     // Catch: java.lang.Throwable -> L56
            java.lang.Object r2 = r2.m3421(r5)     // Catch: java.lang.Throwable -> L56
            if (r2 != 0) goto L58
            boolean r2 = r4.f7444     // Catch: java.lang.Throwable -> L56
            if (r2 == 0) goto L58
            java.lang.Object r0 = r0.f2790     // Catch: java.lang.Throwable -> L56
            kw0 r0 = (p000.kw0) r0     // Catch: java.lang.Throwable -> L56
            r0.m3422(r5, r4)     // Catch: java.lang.Throwable -> L56
            goto L58
        L56:
            r4 = move-exception
            goto L5a
        L58:
            monitor-exit(r1)
            return r4
        L5a:
            monitor-exit(r1)
            throw r4
        L5c:
            r4 = move-exception
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "Could not load font"
            r5.<init>(r0, r4)
            throw r5
        L65:
            monitor-exit(r4)
            throw r5
    }

    /* JADX INFO: renamed from: β */
    public final p000.n62 m2231(p000.C0087br r7, p000.d60 r8, int r9, int r10) {
            r6 = this;
            m62 r0 = new m62
            h2 r1 = r6.f4252
            r1.getClass()
            int r1 = r1.f4534
            if (r1 == 0) goto L22
            r2 = 2147483647(0x7fffffff, float:NaN)
            if (r1 != r2) goto L11
            goto L22
        L11:
            int r8 = r8.f2924
            int r8 = r8 + r1
            r1 = 1
            r2 = 1000(0x3e8, float:1.401E-42)
            int r8 = p000.j81.m2906(r8, r1, r2)
            d60 r1 = new d60
            r1.<init>(r8)
            r2 = r1
            goto L23
        L22:
            r2 = r8
        L23:
            xn0 r8 = r6.f4251
            r8.getClass()
            r5 = 0
            r1 = r7
            r3 = r9
            r4 = r10
            r0.<init>(r1, r2, r3, r4, r5)
            n62 r6 = r6.m2230(r0)
            return r6
    }
}
