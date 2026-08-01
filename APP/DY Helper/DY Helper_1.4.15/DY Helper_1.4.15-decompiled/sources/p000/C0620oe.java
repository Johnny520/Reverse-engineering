package p000;

/* JADX INFO: renamed from: oe */
/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class C0620oe extends p000.y12 implements p000.e80 {

    /* JADX INFO: renamed from: ι */
    public final /* synthetic */ int f8055;

    /* JADX INFO: renamed from: κ */
    public int f8056;

    /* JADX INFO: renamed from: λ */
    public /* synthetic */ java.lang.Object f8057;

    /* JADX INFO: renamed from: μ */
    public final /* synthetic */ java.lang.Object f8058;

    public /* synthetic */ C0620oe(java.lang.Object r1, java.lang.Object r2, p000.InterfaceC0631op r3, int r4) {
            r0 = this;
            r0.f8055 = r4
            r0.f8057 = r1
            r0.f8058 = r2
            r1 = 2
            r0.<init>(r1, r3)
            return
    }

    public /* synthetic */ C0620oe(java.lang.Object r1, p000.InterfaceC0631op r2, int r3) {
            r0 = this;
            r0.f8055 = r3
            r0.f8058 = r1
            r1 = 2
            r0.<init>(r1, r2)
            return
    }

    @Override // p000.e80
    public final java.lang.Object invoke(java.lang.Object r2, java.lang.Object r3) {
            r1 = this;
            int r0 = r1.f8055
            switch(r0) {
                case 0: goto L48;
                case 1: goto L37;
                case 2: goto L25;
                case 3: goto L16;
                default: goto L5;
            }
        L5:
            bq r2 = (p000.InterfaceC0086bq) r2
            op r3 = (p000.InterfaceC0631op) r3
            op r1 = r1.mo1119(r3, r2)
            oe r1 = (p000.C0620oe) r1
            s62 r2 = p000.s62.f9751
            java.lang.Object r1 = r1.mo11(r2)
            return r1
        L16:
            op r3 = (p000.InterfaceC0631op) r3
            op r1 = r1.mo1119(r3, r2)
            oe r1 = (p000.C0620oe) r1
            s62 r2 = p000.s62.f9751
            java.lang.Object r1 = r1.mo11(r2)
            return r1
        L25:
            bq r2 = (p000.InterfaceC0086bq) r2
            op r3 = (p000.InterfaceC0631op) r3
            op r1 = r1.mo1119(r3, r2)
            oe r1 = (p000.C0620oe) r1
            s62 r2 = p000.s62.f9751
            r1.mo11(r2)
            cq r1 = p000.EnumC0184cq.f2716
            return r1
        L37:
            g40 r2 = (p000.g40) r2
            op r3 = (p000.InterfaceC0631op) r3
            op r1 = r1.mo1119(r3, r2)
            oe r1 = (p000.C0620oe) r1
            s62 r2 = p000.s62.f9751
            java.lang.Object r1 = r1.mo11(r2)
            return r1
        L48:
            xi1 r2 = (p000.xi1) r2
            op r3 = (p000.InterfaceC0631op) r3
            op r1 = r1.mo1119(r3, r2)
            oe r1 = (p000.C0620oe) r1
            s62 r2 = p000.s62.f9751
            java.lang.Object r1 = r1.mo11(r2)
            return r1
    }

    @Override // p000.AbstractC0715q8
    /* JADX INFO: renamed from: η */
    public final p000.InterfaceC0631op mo1119(p000.InterfaceC0631op r3, java.lang.Object r4) {
            r2 = this;
            int r0 = r2.f8055
            switch(r0) {
                case 0: goto L3d;
                case 1: goto L30;
                case 2: goto L21;
                case 3: goto L14;
                default: goto L5;
            }
        L5:
            oe r4 = new oe
            java.lang.Object r0 = r2.f8057
            kl1 r0 = (p000.kl1) r0
            java.lang.Object r2 = r2.f8058
            android.view.View r2 = (android.view.View) r2
            r1 = 4
            r4.<init>(r0, r2, r3, r1)
            return r4
        L14:
            oe r0 = new oe
            java.lang.Object r2 = r2.f8058
            g40 r2 = (p000.g40) r2
            r1 = 3
            r0.<init>(r2, r3, r1)
            r0.f8057 = r4
            return r0
        L21:
            oe r4 = new oe
            java.lang.Object r0 = r2.f8057
            d02 r0 = (p000.d02) r0
            java.lang.Object r2 = r2.f8058
            z01 r2 = (p000.z01) r2
            r1 = 2
            r4.<init>(r0, r2, r3, r1)
            return r4
        L30:
            oe r0 = new oe
            java.lang.Object r2 = r2.f8058
            se r2 = (p000.C0795se) r2
            r1 = 1
            r0.<init>(r2, r3, r1)
            r0.f8057 = r4
            return r0
        L3d:
            oe r0 = new oe
            java.lang.Object r2 = r2.f8058
            se r2 = (p000.C0795se) r2
            r1 = 0
            r0.<init>(r2, r3, r1)
            r0.f8057 = r4
            return r0
    }

    @Override // p000.AbstractC0715q8
    /* JADX INFO: renamed from: κ */
    public final java.lang.Object mo11(java.lang.Object r10) {
            r9 = this;
            int r0 = r9.f8055
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            java.lang.Object r2 = r9.f8058
            r3 = 1
            s62 r4 = p000.s62.f9751
            cq r5 = p000.EnumC0184cq.f2716
            r6 = 0
            switch(r0) {
                case 0: goto Lc5;
                case 1: goto La3;
                case 2: goto L77;
                case 3: goto L57;
                default: goto Lf;
            }
        Lf:
            java.lang.Object r0 = r9.f8057
            kl1 r0 = (p000.kl1) r0
            android.view.View r2 = (android.view.View) r2
            int r7 = r9.f8056
            r8 = 2131296321(0x7f090041, float:1.8210555E38)
            if (r7 == 0) goto L29
            if (r7 != r3) goto L24
            p000.i81.m2649(r10)     // Catch: java.lang.Throwable -> L22
            goto L43
        L22:
            r9 = move-exception
            goto L4d
        L24:
            p000.C1080.m7279(r1)
            r4 = r6
            goto L4c
        L29:
            p000.i81.m2649(r10)
            r9.f8056 = r3     // Catch: java.lang.Throwable -> L22
            f02 r10 = r0.f6021     // Catch: java.lang.Throwable -> L22
            gl1 r1 = new gl1     // Catch: java.lang.Throwable -> L22
            r3 = 2
            r7 = 0
            r1.<init>(r3, r6, r7)     // Catch: java.lang.Throwable -> L22
            java.lang.Object r9 = p000.AbstractC0073bd.m885(r10, r1, r9)     // Catch: java.lang.Throwable -> L22
            if (r9 != r5) goto L3e
            goto L3f
        L3e:
            r9 = r4
        L3f:
            if (r9 != r5) goto L43
            r4 = r5
            goto L4c
        L43:
            un r9 = p000.dd2.m1721(r2)
            if (r9 != r0) goto L4c
            r2.setTag(r8, r6)
        L4c:
            return r4
        L4d:
            un r10 = p000.dd2.m1721(r2)
            if (r10 != r0) goto L56
            r2.setTag(r8, r6)
        L56:
            throw r9
        L57:
            int r0 = r9.f8056
            if (r0 == 0) goto L66
            if (r0 != r3) goto L61
            p000.i81.m2649(r10)
            goto L76
        L61:
            p000.C1080.m7279(r1)
            r4 = r6
            goto L76
        L66:
            p000.i81.m2649(r10)
            java.lang.Object r10 = r9.f8057
            g40 r2 = (p000.g40) r2
            r9.f8056 = r3
            java.lang.Object r9 = r2.mo1985(r10, r9)
            if (r9 != r5) goto L76
            r4 = r5
        L76:
            return r4
        L77:
            int r0 = r9.f8056
            if (r0 == 0) goto L86
            if (r0 == r3) goto L82
            p000.C1080.m7279(r1)
            r5 = r6
            goto L9c
        L82:
            p000.i81.m2649(r10)
            goto L9d
        L86:
            p000.i81.m2649(r10)
            java.lang.Object r10 = r9.f8057
            d02 r10 = (p000.d02) r10
            y01 r0 = new y01
            z01 r2 = (p000.z01) r2
            r0.<init>(r2)
            r9.f8056 = r3
            java.lang.Object r9 = r10.mo601(r0, r9)
            if (r9 != r5) goto L9d
        L9c:
            return r5
        L9d:
            pm r9 = new pm
            r9.<init>()
            throw r9
        La3:
            int r0 = r9.f8056
            if (r0 == 0) goto Lb2
            if (r0 != r3) goto Lad
            p000.i81.m2649(r10)
            goto Lc4
        Lad:
            p000.C1080.m7279(r1)
            r4 = r6
            goto Lc4
        Lb2:
            p000.i81.m2649(r10)
            java.lang.Object r10 = r9.f8057
            g40 r10 = (p000.g40) r10
            se r2 = (p000.C0795se) r2
            r9.f8056 = r3
            java.lang.Object r9 = r2.m5484(r10, r9)
            if (r9 != r5) goto Lc4
            r4 = r5
        Lc4:
            return r4
        Lc5:
            int r0 = r9.f8056
            if (r0 == 0) goto Ld4
            if (r0 != r3) goto Lcf
            p000.i81.m2649(r10)
            goto Lf4
        Lcf:
            p000.C1080.m7279(r1)
            r4 = r6
            goto Lf4
        Ld4:
            p000.i81.m2649(r10)
            java.lang.Object r10 = r9.f8057
            xi1 r10 = (p000.xi1) r10
            se r2 = (p000.C0795se) r2
            r9.f8056 = r3
            r2.getClass()
            rs1 r0 = new rs1
            r0.<init>(r10)
            pp r9 = (p000.AbstractC0695pp) r9
            java.lang.Object r9 = r2.m5484(r0, r9)
            if (r9 != r5) goto Lf0
            goto Lf1
        Lf0:
            r9 = r4
        Lf1:
            if (r9 != r5) goto Lf4
            r4 = r5
        Lf4:
            return r4
    }
}
