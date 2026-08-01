package p000;

/* JADX INFO: renamed from: ds */
/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0222ds implements p000.a80 {

    /* JADX INFO: renamed from: ε */
    public final /* synthetic */ int f3247;

    /* JADX INFO: renamed from: ζ */
    public final /* synthetic */ int f3248;

    /* JADX INFO: renamed from: η */
    public final /* synthetic */ java.lang.Object f3249;

    /* JADX INFO: renamed from: θ */
    public final /* synthetic */ java.lang.Object f3250;

    /* JADX INFO: renamed from: ι */
    public final /* synthetic */ java.lang.Object f3251;

    public /* synthetic */ C0222ds(p000.C0296fs r2, p000.zm0 r3, p000.u11 r4, int r5) {
            r1 = this;
            r0 = 0
            r1.f3247 = r0
            r1.<init>()
            r1.f3249 = r2
            r1.f3250 = r3
            r1.f3251 = r4
            r1.f3248 = r5
            return
    }

    public /* synthetic */ C0222ds(p000.ch1[] r2, p000.gp1 r3, int r4, int[] r5) {
            r1 = this;
            r0 = 1
            r1.f3247 = r0
            r1.<init>()
            r1.f3249 = r2
            r1.f3250 = r3
            r1.f3248 = r4
            r1.f3251 = r5
            return
    }

    @Override // p000.a80
    public final java.lang.Object invoke(java.lang.Object r12) {
            r11 = this;
            int r0 = r11.f3247
            switch(r0) {
                case 0: goto L43;
                default: goto L5;
            }
        L5:
            java.lang.Object r0 = r11.f3249
            ch1[] r0 = (p000.ch1[]) r0
            java.lang.Object r1 = r11.f3250
            gp1 r1 = (p000.gp1) r1
            java.lang.Object r2 = r11.f3251
            int[] r2 = (int[]) r2
            bh1 r12 = (p000.bh1) r12
            int r3 = r0.length
            r4 = 0
            r5 = r4
        L16:
            if (r4 >= r3) goto L40
            r6 = r0[r4]
            int r7 = r5 + 1
            r6.getClass()
            r6.mo1183()
            z9 r8 = r1.f4428
            int r9 = r6.f2116
            int r10 = r11.f3248
            int r10 = r10 - r9
            float r9 = (float) r10
            r10 = 1073741824(0x40000000, float:2.0)
            float r9 = r9 / r10
            r10 = 1
            float r10 = (float) r10
            float r8 = r8.f13013
            float r10 = r10 + r8
            float r10 = r10 * r9
            int r8 = java.lang.Math.round(r10)
            r5 = r2[r5]
            p000.bh1.m958(r12, r6, r5, r8)
            int r4 = r4 + 1
            r5 = r7
            goto L16
        L40:
            s62 r11 = p000.s62.f9751
            return r11
        L43:
            java.lang.Object r0 = r11.f3249
            fs r0 = (p000.C0296fs) r0
            java.lang.Object r1 = r11.f3250
            zm0 r1 = (p000.zm0) r1
            java.lang.Object r2 = r11.f3251
            u11 r2 = (p000.u11) r2
            if (r12 == r0) goto L72
            boolean r0 = r12 instanceof p000.i02
            if (r0 == 0) goto L6f
            int r0 = r1.f13169
            int r11 = r11.f3248
            int r0 = r0 - r11
            int r11 = r2.m5776(r12)
            if (r11 < 0) goto L65
            int[] r1 = r2.f10557
            r11 = r1[r11]
            goto L68
        L65:
            r11 = 2147483647(0x7fffffff, float:NaN)
        L68:
            int r11 = java.lang.Math.min(r0, r11)
            r2.m5779(r11, r12)
        L6f:
            s62 r11 = p000.s62.f9751
            goto L78
        L72:
            java.lang.String r11 = "A derived state calculation cannot read itself"
            p000.C1080.m7279(r11)
            r11 = 0
        L78:
            return r11
    }
}
