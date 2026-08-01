package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class d22 implements p000.InterfaceC1031yr, p000.InterfaceC0631op {

    /* JADX INFO: renamed from: ε */
    public final /* synthetic */ p000.e22 f2862;

    /* JADX INFO: renamed from: ζ */
    public final p000.C0015ae f2863;

    /* JADX INFO: renamed from: η */
    public p000.C0015ae f2864;

    /* JADX INFO: renamed from: θ */
    public p000.wh1 f2865;

    /* JADX INFO: renamed from: ι */
    public final p000.C0377hz f2866;

    /* JADX INFO: renamed from: κ */
    public final /* synthetic */ p000.e22 f2867;

    public d22(p000.e22 r1, p000.C0015ae r2) {
            r0 = this;
            r0.<init>()
            r0.f2867 = r1
            r0.f2862 = r1
            r0.f2863 = r2
            wh1 r1 = p000.wh1.f11721
            r0.f2865 = r1
            hz r1 = p000.C0377hz.f4846
            r0.f2866 = r1
            return
    }

    @Override // p000.InterfaceC1031yr
    /* JADX INFO: renamed from: Θ */
    public final float mo581(long r1) {
            r0 = this;
            e22 r0 = r0.f2862
            float r0 = r0.mo581(r1)
            return r0
    }

    @Override // p000.InterfaceC1031yr
    /* JADX INFO: renamed from: Ξ */
    public final int mo583(float r1) {
            r0 = this;
            e22 r0 = r0.f2862
            int r0 = r0.mo583(r1)
            return r0
    }

    @Override // p000.InterfaceC1031yr
    /* JADX INFO: renamed from: Ψ */
    public final long mo584(long r1) {
            r0 = this;
            e22 r0 = r0.f2862
            long r0 = r0.mo584(r1)
            return r0
    }

    @Override // p000.InterfaceC1031yr
    /* JADX INFO: renamed from: β */
    public final float mo586() {
            r0 = this;
            e22 r0 = r0.f2862
            float r0 = r0.mo586()
            return r0
    }

    @Override // p000.InterfaceC0631op
    /* JADX INFO: renamed from: γ */
    public final p000.InterfaceC0880up mo72() {
            r0 = this;
            hz r0 = r0.f2866
            return r0
    }

    /* JADX INFO: renamed from: δ */
    public final java.lang.Object m1638(p000.wh1 r3, p000.AbstractC0715q8 r4) {
            r2 = this;
            ae r0 = new ae
            op r4 = p000.AbstractC0978xb.m6563(r4)
            r1 = 1
            r0.<init>(r1, r4)
            r0.m87()
            r2.f2865 = r3
            r2.f2864 = r0
            java.lang.Object r2 = r0.m86()
            return r2
    }

    @Override // p000.InterfaceC0631op
    /* JADX INFO: renamed from: ζ */
    public final void mo75(java.lang.Object r3) {
            r2 = this;
            e22 r0 = r2.f2867
            k21 r1 = r0.f3380
            monitor-enter(r1)
            k21 r0 = r0.f3389     // Catch: java.lang.Throwable -> L11
            r0.m3135(r2)     // Catch: java.lang.Throwable -> L11
            monitor-exit(r1)
            ae r2 = r2.f2863
            r2.mo75(r3)
            return
        L11:
            r2 = move-exception
            monitor-exit(r1)
            throw r2
    }

    @Override // p000.InterfaceC1031yr
    /* JADX INFO: renamed from: θ */
    public final float mo590() {
            r0 = this;
            e22 r0 = r0.f2862
            float r0 = r0.mo590()
            return r0
    }

    /* JADX INFO: renamed from: λ */
    public final java.lang.Object m1639(long r7, p000.e80 r9, p000.AbstractC0695pp r10) {
            r6 = this;
            boolean r0 = r10 instanceof p000.b22
            if (r0 == 0) goto L13
            r0 = r10
            b22 r0 = (p000.b22) r0
            int r1 = r0.f1436
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f1436 = r1
            goto L18
        L13:
            b22 r0 = new b22
            r0.<init>(r6, r10)
        L18:
            java.lang.Object r10 = r0.f1434
            int r1 = r0.f1436
            r2 = 1
            if (r1 == 0) goto L30
            if (r1 != r2) goto L29
            xz1 r6 = r0.f1433
            p000.i81.m2649(r10)     // Catch: java.lang.Throwable -> L27
            goto L69
        L27:
            r7 = move-exception
            goto L73
        L29:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            p000.C1080.m7279(r6)
            r6 = 0
            return r6
        L30:
            p000.i81.m2649(r10)
            r3 = 0
            int r10 = (r7 > r3 ? 1 : (r7 == r3 ? 0 : -1))
            if (r10 > 0) goto L4a
            ae r10 = r6.f2864
            if (r10 == 0) goto L4a
            xh1 r1 = new xh1
            r1.<init>(r7)
            eo1 r3 = new eo1
            r3.<init>(r1)
            r10.mo75(r3)
        L4a:
            e22 r10 = r6.f2867
            bq r10 = r10.m4648()
            c22 r1 = new c22
            r3 = 0
            r1.<init>(r7, r6, r3)
            r7 = 3
            xz1 r7 = p000.ln0.m3610(r10, r3, r1, r7)
            r0.f1433 = r7     // Catch: java.lang.Throwable -> L6f
            r0.f1436 = r2     // Catch: java.lang.Throwable -> L6f
            java.lang.Object r10 = r9.invoke(r6, r0)     // Catch: java.lang.Throwable -> L6f
            cq r6 = p000.EnumC0184cq.f2716
            if (r10 != r6) goto L68
            return r6
        L68:
            r6 = r7
        L69:
            wd r7 = p000.C0943wd.f11684
            r6.mo2180(r7)
            return r10
        L6f:
            r6 = move-exception
            r5 = r7
            r7 = r6
            r6 = r5
        L73:
            wd r8 = p000.C0943wd.f11684
            r6.mo2180(r8)
            throw r7
    }

    @Override // p000.InterfaceC1031yr
    /* JADX INFO: renamed from: σ */
    public final long mo592(float r1) {
            r0 = this;
            e22 r0 = r0.f2862
            long r0 = r0.mo592(r1)
            return r0
    }

    @Override // p000.InterfaceC1031yr
    /* JADX INFO: renamed from: τ */
    public final long mo593(long r1) {
            r0 = this;
            e22 r0 = r0.f2862
            long r0 = r0.mo593(r1)
            return r0
    }

    @Override // p000.InterfaceC1031yr
    /* JADX INFO: renamed from: υ */
    public final float mo594(float r1) {
            r0 = this;
            e22 r0 = r0.f2862
            float r0 = r0.mo586()
            float r0 = r0 * r1
            return r0
    }

    @Override // p000.InterfaceC1031yr
    /* JADX INFO: renamed from: д */
    public final float mo595(long r1) {
            r0 = this;
            e22 r0 = r0.f2862
            float r0 = r0.mo595(r1)
            return r0
    }

    @Override // p000.InterfaceC1031yr
    /* JADX INFO: renamed from: к */
    public final long mo596(float r1) {
            r0 = this;
            e22 r0 = r0.f2862
            long r0 = r0.mo596(r1)
            return r0
    }

    @Override // p000.InterfaceC1031yr
    /* JADX INFO: renamed from: п */
    public final float mo597(int r1) {
            r0 = this;
            e22 r0 = r0.f2862
            float r0 = r0.mo597(r1)
            return r0
    }

    @Override // p000.InterfaceC1031yr
    /* JADX INFO: renamed from: с */
    public final float mo598(float r1) {
            r0 = this;
            e22 r0 = r0.f2862
            float r0 = r0.mo586()
            float r1 = r1 / r0
            return r1
    }
}
