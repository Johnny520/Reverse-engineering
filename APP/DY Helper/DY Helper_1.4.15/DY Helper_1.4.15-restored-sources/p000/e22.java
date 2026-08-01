package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class e22 extends p000.q01 implements p000.di1, p000.ei1, p000.InterfaceC1031yr {

    /* JADX INFO: renamed from: Α */
    public final p000.k21 f3380;

    /* JADX INFO: renamed from: Β */
    public final p000.k21 f3381;

    /* JADX INFO: renamed from: Γ */
    public p000.vh1 f3382;

    /* JADX INFO: renamed from: Δ */
    public long f3383;

    /* JADX INFO: renamed from: τ */
    public java.lang.Object f3384;

    /* JADX INFO: renamed from: υ */
    public java.lang.Object f3385;

    /* JADX INFO: renamed from: φ */
    public androidx.compose.p001ui.input.pointer.PointerInputEventHandler f3386;

    /* JADX INFO: renamed from: χ */
    public p000.xz1 f3387;

    /* JADX INFO: renamed from: ψ */
    public p000.vh1 f3388;

    /* JADX INFO: renamed from: ω */
    public final p000.k21 f3389;

    public e22(java.lang.Object r1, java.lang.Object r2, androidx.compose.p001ui.input.pointer.PointerInputEventHandler r3) {
            r0 = this;
            r0.<init>()
            r0.f3384 = r1
            r0.f3385 = r2
            r0.f3386 = r3
            vh1 r1 = p000.a22.f53
            r0.f3388 = r1
            k21 r1 = new k21
            r2 = 16
            d22[] r3 = new p000.d22[r2]
            r1.<init>(r3)
            r0.f3389 = r1
            r0.f3380 = r1
            k21 r1 = new k21
            d22[] r2 = new p000.d22[r2]
            r1.<init>(r2)
            r0.f3381 = r1
            r1 = 0
            r0.f3383 = r1
            return
    }

    @Override // p000.di1
    /* JADX INFO: renamed from: Α */
    public final void mo1747(p000.vh1 r3, p000.wh1 r4, long r5) {
            r2 = this;
            r2.f3383 = r5
            wh1 r5 = p000.wh1.f11720
            if (r4 != r5) goto L8
            r2.f3388 = r3
        L8:
            xz1 r5 = r2.f3387
            r6 = 0
            if (r5 != 0) goto L1e
            bq r5 = r2.m4648()
            gd2 r0 = new gd2
            r1 = 2
            r0.<init>(r2, r6, r1)
            r1 = 1
            xz1 r5 = p000.ln0.m3610(r5, r6, r0, r1)
            r2.f3387 = r5
        L1e:
            r2.m1836(r3, r4)
            java.lang.Object r4 = r3.f11293
            int r5 = r4.size()
            r0 = 0
        L28:
            if (r0 >= r5) goto L3a
            java.lang.Object r1 = r4.get(r0)
            ai1 r1 = (p000.ai1) r1
            boolean r1 = p000.j81.m2902(r1)
            if (r1 != 0) goto L37
            goto L3b
        L37:
            int r0 = r0 + 1
            goto L28
        L3a:
            r3 = r6
        L3b:
            r2.f3382 = r3
            return
    }

    @Override // p000.di1
    /* JADX INFO: renamed from: Χ */
    public final void mo1749() {
            r0 = this;
            r0.m1837()
            return
    }

    @Override // p000.InterfaceC1031yr
    /* JADX INFO: renamed from: β */
    public final float mo586() {
            r0 = this;
            yp0 r0 = p000.h62.m2445(r0)
            yr r0 = r0.f12726
            float r0 = r0.mo586()
            return r0
    }

    @Override // p000.InterfaceC0882ur
    /* JADX INFO: renamed from: ζ */
    public final void mo1835() {
            r0 = this;
            r0.m1837()
            return
    }

    @Override // p000.InterfaceC1031yr
    /* JADX INFO: renamed from: θ */
    public final float mo590() {
            r0 = this;
            yp0 r0 = p000.h62.m2445(r0)
            yr r0 = r0.f12726
            float r0 = r0.mo590()
            return r0
    }

    /* JADX INFO: renamed from: В */
    public final void m1836(p000.vh1 r7, p000.wh1 r8) {
            r6 = this;
            k21 r0 = r6.f3380
            monitor-enter(r0)
            k21 r1 = r6.f3381     // Catch: java.lang.Throwable -> L6c
            k21 r2 = r6.f3389     // Catch: java.lang.Throwable -> L6c
            int r3 = r1.f5718     // Catch: java.lang.Throwable -> L6c
            r1.m3128(r3, r2)     // Catch: java.lang.Throwable -> L6c
            monitor-exit(r0)
            int r0 = r8.ordinal()     // Catch: java.lang.Throwable -> L21
            r1 = 0
            if (r0 == 0) goto L43
            r2 = 1
            if (r0 == r2) goto L23
            r2 = 2
            if (r0 != r2) goto L1b
            goto L43
        L1b:
            pm r7 = new pm     // Catch: java.lang.Throwable -> L21
            r7.<init>()     // Catch: java.lang.Throwable -> L21
            throw r7     // Catch: java.lang.Throwable -> L21
        L21:
            r7 = move-exception
            goto L66
        L23:
            k21 r0 = r6.f3381     // Catch: java.lang.Throwable -> L21
            int r3 = r0.f5718     // Catch: java.lang.Throwable -> L21
            int r3 = r3 - r2
            java.lang.Object[] r0 = r0.f5716     // Catch: java.lang.Throwable -> L21
            int r2 = r0.length     // Catch: java.lang.Throwable -> L21
            if (r3 >= r2) goto L60
        L2d:
            if (r3 < 0) goto L60
            r2 = r0[r3]     // Catch: java.lang.Throwable -> L21
            d22 r2 = (p000.d22) r2     // Catch: java.lang.Throwable -> L21
            wh1 r4 = r2.f2865     // Catch: java.lang.Throwable -> L21
            if (r8 != r4) goto L40
            ae r4 = r2.f2864     // Catch: java.lang.Throwable -> L21
            if (r4 == 0) goto L40
            r2.f2864 = r1     // Catch: java.lang.Throwable -> L21
            r4.mo75(r7)     // Catch: java.lang.Throwable -> L21
        L40:
            int r3 = r3 + (-1)
            goto L2d
        L43:
            k21 r0 = r6.f3381     // Catch: java.lang.Throwable -> L21
            java.lang.Object[] r2 = r0.f5716     // Catch: java.lang.Throwable -> L21
            int r0 = r0.f5718     // Catch: java.lang.Throwable -> L21
            r3 = 0
        L4a:
            if (r3 >= r0) goto L60
            r4 = r2[r3]     // Catch: java.lang.Throwable -> L21
            d22 r4 = (p000.d22) r4     // Catch: java.lang.Throwable -> L21
            wh1 r5 = r4.f2865     // Catch: java.lang.Throwable -> L21
            if (r8 != r5) goto L5d
            ae r5 = r4.f2864     // Catch: java.lang.Throwable -> L21
            if (r5 == 0) goto L5d
            r4.f2864 = r1     // Catch: java.lang.Throwable -> L21
            r5.mo75(r7)     // Catch: java.lang.Throwable -> L21
        L5d:
            int r3 = r3 + 1
            goto L4a
        L60:
            k21 r6 = r6.f3381
            r6.m3132()
            return
        L66:
            k21 r6 = r6.f3381
            r6.m3132()
            throw r7
        L6c:
            r6 = move-exception
            monitor-exit(r0)
            throw r6
    }

    /* JADX INFO: renamed from: Г */
    public final void m1837() {
            r3 = this;
            xz1 r0 = r3.f3387
            if (r0 == 0) goto L11
            u01 r1 = new u01
            java.lang.String r2 = "Pointer input was reset"
            r1.<init>(r2)
            r0.mo2184(r1)
            r0 = 0
            r3.f3387 = r0
        L11:
            return
    }

    @Override // p000.di1
    /* JADX INFO: renamed from: ж */
    public final void mo1750() {
            r27 = this;
            r0 = r27
            vh1 r1 = r0.f3382
            if (r1 != 0) goto L7
            goto L74
        L7:
            java.lang.Object r1 = r1.f11293
            int r2 = r1.size()
            r3 = 0
            r4 = r3
        Lf:
            if (r4 >= r2) goto L74
            java.lang.Object r5 = r1.get(r4)
            ai1 r5 = (p000.ai1) r5
            boolean r5 = r5.f262
            if (r5 == 0) goto L71
            java.util.ArrayList r2 = new java.util.ArrayList
            int r4 = r1.size()
            r2.<init>(r4)
            int r4 = r1.size()
        L28:
            if (r3 >= r4) goto L57
            java.lang.Object r5 = r1.get(r3)
            ai1 r5 = (p000.ai1) r5
            long r7 = r5.f259
            long r11 = r5.f261
            long r9 = r5.f260
            float r14 = r5.f263
            boolean r6 = r5.f262
            int r5 = r5.f267
            r19 = r6
            ai1 r6 = new ai1
            r24 = 1065353216(0x3f800000, float:1.0)
            r25 = 0
            r13 = 0
            r22 = 0
            r15 = r9
            r17 = r11
            r20 = r19
            r21 = r5
            r6.<init>(r7, r9, r11, r13, r14, r15, r17, r19, r20, r21, r22, r24, r25)
            r2.add(r6)
            int r3 = r3 + 1
            goto L28
        L57:
            vh1 r1 = new vh1
            r3 = 0
            r1.<init>(r2, r3)
            r0.f3388 = r1
            wh1 r2 = p000.wh1.f11720
            r0.m1836(r1, r2)
            wh1 r2 = p000.wh1.f11721
            r0.m1836(r1, r2)
            wh1 r2 = p000.wh1.f11722
            r0.m1836(r1, r2)
            r0.f3382 = r3
            return
        L71:
            int r4 = r4 + 1
            goto Lf
        L74:
            return
    }

    @Override // p000.q01
    /* JADX INFO: renamed from: ш */
    public final void mo614() {
            r0 = this;
            r0.m1837()
            return
    }
}
