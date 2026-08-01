package p000;

/* JADX INFO: renamed from: uv */
/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0886uv implements p000.a80 {

    /* JADX INFO: renamed from: ε */
    public final /* synthetic */ int f10961;

    /* JADX INFO: renamed from: ζ */
    public final /* synthetic */ int f10962;

    /* JADX INFO: renamed from: η */
    public final /* synthetic */ java.lang.Object f10963;

    public /* synthetic */ C0886uv(int r1, int r2, java.lang.Object r3) {
            r0 = this;
            r0.f10961 = r2
            r0.f10963 = r3
            r0.f10962 = r1
            r0.<init>()
            return
    }

    public /* synthetic */ C0886uv(int r2, java.util.Collection r3) {
            r1 = this;
            r0 = 2
            r1.f10961 = r0
            r1.<init>()
            r1.f10962 = r2
            r1.f10963 = r3
            return
    }

    @Override // p000.a80
    public final java.lang.Object invoke(java.lang.Object r20) {
            r19 = this;
            r0 = r19
            int r1 = r0.f10961
            switch(r1) {
                case 0: goto L41;
                case 1: goto L1a;
                default: goto L7;
            }
        L7:
            java.lang.Object r1 = r0.f10963
            java.util.Collection r1 = (java.util.Collection) r1
            r2 = r20
            java.util.List r2 = (java.util.List) r2
            int r0 = r0.f10962
            boolean r0 = r2.addAll(r0, r1)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            return r0
        L1a:
            java.lang.Object r1 = r0.f10963
            d81 r1 = (p000.d81) r1
            r2 = r20
            java.lang.String r2 = (java.lang.String) r2
            r2.getClass()
            int r0 = r0.f10962
            if (r0 < 0) goto L3e
            java.util.List r3 = r1.f2957
            int r3 = r3.size()
            if (r0 >= r3) goto L3e
            java.util.List r3 = r1.f2957
            r3.set(r0, r2)
            java.util.List r0 = r1.f2957
            p000.e81.m1886(r0)
            r1.m1673()
        L3e:
            s62 r0 = p000.s62.f9751
            return r0
        L41:
            java.lang.Object r1 = r0.f10963
            aw r1 = (p000.C0055aw) r1
            r2 = r20
            cw r2 = (p000.InterfaceC0190cw) r2
            r2.getClass()
            ep0 r3 = r1.f1341
            yv r4 = r1.f1332
            x91 r5 = r1.f1339
            java.lang.Object r5 = r5.getValue()
            mp0 r5 = (p000.mp0) r5
            a80 r1 = r1.f1344
            r3.getClass()
            r4.getClass()
            if (r5 != 0) goto L64
            goto L154
        L64:
            x91 r6 = r3.f3625
            java.lang.Object r6 = r6.getValue()
            mp0 r6 = (p000.mp0) r6
            if (r6 != 0) goto L70
            goto L154
        L70:
            r7 = 0
            long r5 = r6.mo2332(r5, r7)     // Catch: java.lang.Exception -> L77
            goto L83
        L77:
            long r9 = r5.mo2335(r7)
            long r5 = r6.mo2335(r7)
            long r5 = p000.o41.m4204(r9, r5)
        L83:
            long r9 = r4.f12820
            m6 r11 = r2.mo579()
            long r12 = r11.m3758()
            de r14 = r11.m3787()
            r14.mo1729()
            java.lang.Object r14 = r11.f6967     // Catch: java.lang.Throwable -> Ldd
            n r14 = (p000.C0568n) r14     // Catch: java.lang.Throwable -> Ldd
            r20 = 1065353216(0x3f800000, float:1.0)
            if (r1 == 0) goto Ldf
            r16 = 0
            tn0 r15 = r3.m1948()     // Catch: java.lang.Throwable -> Ldd
            java.lang.Object r7 = r14.f7336     // Catch: java.lang.Throwable -> Ldd
            m6 r7 = (p000.C0538m6) r7     // Catch: java.lang.Throwable -> Ldd
            r17 = 9205357640488583168(0x7fc000007fc00000, double:2.247117487993712E307)
            int r8 = (r9 > r17 ? 1 : (r9 == r17 ? 0 : -1))
            if (r8 == 0) goto Lb0
            goto Lb4
        Lb0:
            long r9 = r7.m3758()     // Catch: java.lang.Throwable -> Ldd
        Lb4:
            r15.f10415 = r9     // Catch: java.lang.Throwable -> Ldd
            float r7 = r4.mo586()     // Catch: java.lang.Throwable -> Ldd
            r15.f10416 = r7     // Catch: java.lang.Throwable -> Ldd
            float r4 = r4.mo590()     // Catch: java.lang.Throwable -> Ldd
            r15.f10417 = r4     // Catch: java.lang.Throwable -> Ldd
            r1.invoke(r15)     // Catch: java.lang.Throwable -> Ldd
            float r1 = r15.f10418     // Catch: java.lang.Throwable -> Ldd
            float r4 = r15.f10419     // Catch: java.lang.Throwable -> Ldd
            int r7 = (r1 > r16 ? 1 : (r1 == r16 ? 0 : -1))
            if (r7 != 0) goto Lce
            goto Le1
        Lce:
            int r7 = (r4 > r16 ? 1 : (r4 == r16 ? 0 : -1))
            if (r7 != 0) goto Ld3
            goto Le1
        Ld3:
            float r15 = r20 / r1
            float r1 = r20 / r4
            r7 = 0
            r14.m3923(r15, r1, r7)     // Catch: java.lang.Throwable -> Ldd
            goto Le1
        Ldd:
            r0 = move-exception
            goto L157
        Ldf:
            r16 = 0
        Le1:
            r1 = 1
            int r0 = r0.f10962
            r7 = 4294967295(0xffffffff, double:2.1219957905E-314)
            r4 = 32
            if (r0 <= r1) goto L12c
            float r0 = (float) r0
            float r15 = r20 / r0
            long r9 = r5 >> r4
            int r1 = (int) r9
            float r1 = java.lang.Float.intBitsToFloat(r1)     // Catch: java.lang.Throwable -> Ldd
            float r1 = r1 * r15
            long r4 = r5 & r7
            int r4 = (int) r4     // Catch: java.lang.Throwable -> Ldd
            float r4 = java.lang.Float.intBitsToFloat(r4)     // Catch: java.lang.Throwable -> Ldd
            float r4 = r4 * r15
            r5 = 1056964608(0x3f000000, float:0.5)
            float r6 = r1 * r5
            double r6 = (double) r6     // Catch: java.lang.Throwable -> Ldd
            double r6 = java.lang.Math.rint(r6)     // Catch: java.lang.Throwable -> Ldd
            float r6 = (float) r6     // Catch: java.lang.Throwable -> Ldd
            int r6 = (int) r6     // Catch: java.lang.Throwable -> Ldd
            float r6 = (float) r6     // Catch: java.lang.Throwable -> Ldd
            r7 = 1073741824(0x40000000, float:2.0)
            float r6 = r6 * r7
            float r5 = r5 * r4
            double r8 = (double) r5     // Catch: java.lang.Throwable -> Ldd
            double r8 = java.lang.Math.rint(r8)     // Catch: java.lang.Throwable -> Ldd
            float r5 = (float) r8     // Catch: java.lang.Throwable -> Ldd
            int r5 = (int) r5     // Catch: java.lang.Throwable -> Ldd
            float r5 = (float) r5     // Catch: java.lang.Throwable -> Ldd
            float r5 = r5 * r7
            float r1 = r1 - r6
            float r1 = r1 * r0
            r3.f3626 = r1     // Catch: java.lang.Throwable -> Ldd
            float r4 = r4 - r5
            float r4 = r4 * r0
            r3.f3627 = r4     // Catch: java.lang.Throwable -> Ldd
            float r0 = -r6
            float r1 = -r5
            r14.m3925(r0, r1)     // Catch: java.lang.Throwable -> Ldd
            r7 = 0
            r14.m3923(r15, r15, r7)     // Catch: java.lang.Throwable -> Ldd
            goto L145
        L12c:
            r0 = r16
            r3.f3626 = r0     // Catch: java.lang.Throwable -> Ldd
            r3.f3627 = r0     // Catch: java.lang.Throwable -> Ldd
            long r0 = r5 >> r4
            int r0 = (int) r0     // Catch: java.lang.Throwable -> Ldd
            float r0 = java.lang.Float.intBitsToFloat(r0)     // Catch: java.lang.Throwable -> Ldd
            float r0 = -r0
            long r4 = r5 & r7
            int r1 = (int) r4     // Catch: java.lang.Throwable -> Ldd
            float r1 = java.lang.Float.intBitsToFloat(r1)     // Catch: java.lang.Throwable -> Ldd
            float r1 = -r1
            r14.m3925(r0, r1)     // Catch: java.lang.Throwable -> Ldd
        L145:
            wa0 r0 = r3.f3623     // Catch: java.lang.Throwable -> Ldd
            p000.ln0.m3638(r2, r0)     // Catch: java.lang.Throwable -> Ldd
            de r0 = r11.m3787()
            r0.mo1727()
            r11.m3771(r12)
        L154:
            s62 r0 = p000.s62.f9751
            return r0
        L157:
            de r1 = r11.m3787()
            r1.mo1727()
            r11.m3771(r12)
            throw r0
    }
}
