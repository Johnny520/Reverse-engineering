package p000;

/* JADX INFO: renamed from: ae */
/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class C0015ae extends p000.AbstractC0444jt implements p000.InterfaceC1017yd, p000.InterfaceC0220dq, p000.jb2 {

    /* JADX INFO: renamed from: κ */
    public static final /* synthetic */ java.util.concurrent.atomic.AtomicIntegerFieldUpdater f193 = null;

    /* JADX INFO: renamed from: λ */
    public static final /* synthetic */ java.util.concurrent.atomic.AtomicReferenceFieldUpdater f194 = null;

    /* JADX INFO: renamed from: μ */
    public static final /* synthetic */ java.util.concurrent.atomic.AtomicReferenceFieldUpdater f195 = null;
    private volatile /* synthetic */ int _decisionAndIndex$volatile;
    private volatile /* synthetic */ java.lang.Object _parentHandle$volatile;
    private volatile /* synthetic */ java.lang.Object _state$volatile;

    /* JADX INFO: renamed from: θ */
    public final p000.InterfaceC0631op f196;

    /* JADX INFO: renamed from: ι */
    public final p000.InterfaceC0880up f197;

    static {
            java.lang.String r0 = "_decisionAndIndex$volatile"
            java.lang.Class<ae> r1 = p000.C0015ae.class
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r0 = java.util.concurrent.atomic.AtomicIntegerFieldUpdater.newUpdater(r1, r0)
            p000.C0015ae.f193 = r0
            java.lang.String r0 = "_state$volatile"
            java.lang.Class<java.lang.Object> r2 = java.lang.Object.class
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(r1, r2, r0)
            p000.C0015ae.f194 = r0
            java.lang.String r0 = "_parentHandle$volatile"
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(r1, r2, r0)
            p000.C0015ae.f195 = r0
            return
    }

    public C0015ae(int r1, p000.InterfaceC0631op r2) {
            r0 = this;
            r0.<init>(r1)
            r0.f196 = r2
            up r1 = r2.mo72()
            r0.f197 = r1
            r1 = 536870911(0x1fffffff, float:1.0842021E-19)
            r0._decisionAndIndex$volatile = r1
            ｙ r1 = p000.C1155.f13523
            r0._state$volatile = r1
            return
    }

    /* JADX INFO: renamed from: Α */
    public static void m64(p000.w31 r3, java.lang.Object r4) {
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "It's prohibited to register multiple handlers, tried to register "
            r1.<init>(r2)
            r1.append(r3)
            java.lang.String r3 = ", already has "
            r1.append(r3)
            r1.append(r4)
            java.lang.String r3 = r1.toString()
            java.lang.String r3 = r3.toString()
            r0.<init>(r3)
            throw r0
    }

    /* JADX INFO: renamed from: Ζ */
    public static java.lang.Object m65(p000.w31 r6, java.lang.Object r7, int r8, p000.f80 r9) {
            boolean r0 = r7 instanceof p000.C0628om
            if (r0 == 0) goto L5
            return r7
        L5:
            r0 = 1
            if (r8 == r0) goto Ld
            r0 = 2
            if (r8 != r0) goto Lc
            goto Ld
        Lc:
            return r7
        Ld:
            if (r9 != 0) goto L14
            boolean r8 = r6 instanceof p000.C0868ud
            if (r8 != 0) goto L14
            return r7
        L14:
            mm r0 = new mm
            boolean r8 = r6 instanceof p000.C0868ud
            if (r8 == 0) goto L1e
            ud r6 = (p000.C0868ud) r6
        L1c:
            r2 = r6
            goto L20
        L1e:
            r6 = 0
            goto L1c
        L20:
            r4 = 0
            r5 = 16
            r1 = r7
            r3 = r9
            r0.<init>(r1, r2, r3, r4, r5)
            return r0
    }

    public final java.lang.String toString() {
            r3 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "CancellableContinuation("
            r0.<init>(r1)
            op r1 = r3.f196
            java.lang.String r1 = p000.AbstractC1021yh.m6918(r1)
            r0.append(r1)
            java.lang.String r1 = "){"
            r0.append(r1)
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r1 = p000.C0015ae.f194
            java.lang.Object r1 = r1.get(r3)
            boolean r2 = r1 instanceof p000.w31
            if (r2 == 0) goto L22
            java.lang.String r1 = "Active"
            goto L2b
        L22:
            boolean r1 = r1 instanceof p000.C0110ce
            if (r1 == 0) goto L29
            java.lang.String r1 = "Cancelled"
            goto L2b
        L29:
            java.lang.String r1 = "Completed"
        L2b:
            r0.append(r1)
            java.lang.String r1 = "}@"
            r0.append(r1)
            java.lang.String r3 = p000.AbstractC1021yh.m6855(r3)
            r0.append(r3)
            java.lang.String r3 = r0.toString()
            return r3
    }

    /* JADX INFO: renamed from: Β */
    public final void m66() {
            r5 = this;
            op r0 = r5.f196
            boolean r1 = r0 instanceof p000.C0334gt
            r2 = 0
            if (r1 == 0) goto La
            gt r0 = (p000.C0334gt) r0
            goto Lb
        La:
            r0 = r2
        Lb:
            if (r0 == 0) goto L4e
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r1 = p000.C0334gt.f4444
        Lf:
            java.lang.Object r3 = r1.get(r0)
            uy r4 = p000.jx0.f5622
            if (r3 != r4) goto L25
        L17:
            boolean r3 = r1.compareAndSet(r0, r4, r5)
            if (r3 == 0) goto L1e
            goto L32
        L1e:
            java.lang.Object r3 = r1.get(r0)
            if (r3 == r4) goto L17
            goto Lf
        L25:
            boolean r4 = r3 instanceof java.lang.Throwable
            if (r4 == 0) goto L49
        L29:
            boolean r4 = r1.compareAndSet(r0, r3, r2)
            if (r4 == 0) goto L3c
            r2 = r3
            java.lang.Throwable r2 = (java.lang.Throwable) r2
        L32:
            if (r2 != 0) goto L35
            goto L4e
        L35:
            r5.m84()
            r5.m83(r2)
            return
        L3c:
            java.lang.Object r4 = r1.get(r0)
            if (r4 != r3) goto L43
            goto L29
        L43:
            java.lang.String r5 = "Failed requirement."
            p000.C1080.m7275(r5)
            return
        L49:
            java.lang.String r5 = "Inconsistent state "
            p000.C1080.m7278(r3, r5)
        L4e:
            return
    }

    /* JADX INFO: renamed from: Γ */
    public final void m67(java.lang.Object r2, p000.f80 r3) {
            r1 = this;
            int r0 = r1.f5573
            r1.m68(r2, r0, r3)
            return
    }

    /* JADX INFO: renamed from: Δ */
    public final void m68(java.lang.Object r5, int r6, p000.f80 r7) {
            r4 = this;
        L0:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = p000.C0015ae.f194
            java.lang.Object r1 = r0.get(r4)
            boolean r2 = r1 instanceof p000.w31
            if (r2 == 0) goto L2b
            r2 = r1
            w31 r2 = (p000.w31) r2
            java.lang.Object r2 = m65(r2, r5, r6, r7)
        L11:
            boolean r3 = r0.compareAndSet(r4, r1, r2)
            if (r3 == 0) goto L24
            boolean r5 = r4.m92()
            if (r5 != 0) goto L20
            r4.m84()
        L20:
            r4.m85(r6)
            return
        L24:
            java.lang.Object r3 = r0.get(r4)
            if (r3 == r1) goto L11
            goto L0
        L2b:
            boolean r6 = r1 instanceof p000.C0110ce
            if (r6 == 0) goto L43
            ce r1 = (p000.C0110ce) r1
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r6 = p000.C0110ce.f2077
            r0 = 0
            r2 = 1
            boolean r6 = r6.compareAndSet(r1, r0, r2)
            if (r6 == 0) goto L43
            if (r7 == 0) goto L42
            java.lang.Throwable r6 = r1.f8149
            r4.m81(r7, r6, r5)
        L42:
            return
        L43:
            java.lang.String r4 = "Already resumed, but proposed with update "
            p000.C1080.m7278(r5, r4)
            return
    }

    /* JADX INFO: renamed from: Ε */
    public final void m69(kotlinx.coroutines.AbstractC0479 r4) {
            r3 = this;
            op r0 = r3.f196
            boolean r1 = r0 instanceof p000.C0334gt
            r2 = 0
            if (r1 == 0) goto La
            gt r0 = (p000.C0334gt) r0
            goto Lb
        La:
            r0 = r2
        Lb:
            if (r0 == 0) goto L10
            kotlinx.coroutines.α r0 = r0.f4445
            goto L11
        L10:
            r0 = r2
        L11:
            if (r0 != r4) goto L15
            r4 = 4
            goto L17
        L15:
            int r4 = r3.f5573
        L17:
            s62 r0 = p000.s62.f9751
            r3.m68(r0, r4, r2)
            return
    }

    @Override // p000.jb2
    /* JADX INFO: renamed from: α */
    public final void mo70(p000.sr1 r5, int r6) {
            r4 = this;
        L0:
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r0 = p000.C0015ae.f193
            int r1 = r0.get(r4)
            r2 = 536870911(0x1fffffff, float:1.0842021E-19)
            r3 = r1 & r2
            if (r3 != r2) goto L1c
            int r2 = r1 >> 29
            int r2 = r2 << 29
            int r2 = r2 + r6
            boolean r0 = r0.compareAndSet(r4, r1, r2)
            if (r0 == 0) goto L0
            r4.m91(r5)
            return
        L1c:
            java.lang.String r4 = "invokeOnCancellation should be called at most once"
            p000.C1080.m7279(r4)
            return
    }

    @Override // p000.InterfaceC0220dq
    /* JADX INFO: renamed from: β */
    public final p000.InterfaceC0220dq mo71() {
            r1 = this;
            op r1 = r1.f196
            boolean r0 = r1 instanceof p000.InterfaceC0220dq
            if (r0 == 0) goto L9
            dq r1 = (p000.InterfaceC0220dq) r1
            return r1
        L9:
            r1 = 0
            return r1
    }

    @Override // p000.InterfaceC0631op
    /* JADX INFO: renamed from: γ */
    public final p000.InterfaceC0880up mo72() {
            r0 = this;
            up r0 = r0.f197
            return r0
    }

    @Override // p000.AbstractC0444jt
    /* JADX INFO: renamed from: δ */
    public final void mo73(java.util.concurrent.CancellationException r8) {
            r7 = this;
        L0:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = p000.C0015ae.f194
            java.lang.Object r2 = r0.get(r7)
            boolean r1 = r2 instanceof p000.w31
            if (r1 != 0) goto L5f
            boolean r1 = r2 instanceof p000.C0628om
            if (r1 == 0) goto Lf
            goto L56
        Lf:
            boolean r1 = r2 instanceof p000.C0554mm
            if (r1 == 0) goto L46
            r1 = r2
            mm r1 = (p000.C0554mm) r1
            java.lang.Throwable r3 = r1.f7208
            if (r3 != 0) goto L40
            r3 = 0
            r4 = 15
            mm r3 = p000.C0554mm.m3871(r1, r3, r8, r4)
        L21:
            boolean r4 = r0.compareAndSet(r7, r2, r3)
            if (r4 == 0) goto L38
            ud r0 = r1.f7205
            if (r0 == 0) goto L2e
            r7.m80(r0, r8)
        L2e:
            f80 r0 = r1.f7206
            if (r0 == 0) goto L56
            java.lang.Object r1 = r1.f7204
            r7.m81(r0, r8, r1)
            return
        L38:
            java.lang.Object r4 = r0.get(r7)
            if (r4 == r2) goto L21
            r5 = r8
            goto L5d
        L40:
            java.lang.String r7 = "Must be called at most once"
            p000.C1080.m7279(r7)
            return
        L46:
            mm r1 = new mm
            r4 = 0
            r6 = 14
            r3 = 0
            r5 = r8
            r1.<init>(r2, r3, r4, r5, r6)
        L50:
            boolean r8 = r0.compareAndSet(r7, r2, r1)
            if (r8 == 0) goto L57
        L56:
            return
        L57:
            java.lang.Object r8 = r0.get(r7)
            if (r8 == r2) goto L50
        L5d:
            r8 = r5
            goto L0
        L5f:
            java.lang.String r7 = "Not completed"
            p000.C1080.m7279(r7)
            return
    }

    @Override // p000.AbstractC0444jt
    /* JADX INFO: renamed from: ε */
    public final p000.InterfaceC0631op mo74() {
            r0 = this;
            op r0 = r0.f196
            return r0
    }

    @Override // p000.InterfaceC0631op
    /* JADX INFO: renamed from: ζ */
    public final void mo75(java.lang.Object r3) {
            r2 = this;
            java.lang.Throwable r0 = p000.fo1.m2190(r3)
            if (r0 != 0) goto L7
            goto Ld
        L7:
            om r3 = new om
            r1 = 0
            r3.<init>(r0, r1)
        Ld:
            int r0 = r2.f5573
            r1 = 0
            r2.m68(r3, r0, r1)
            return
    }

    @Override // p000.AbstractC0444jt
    /* JADX INFO: renamed from: η */
    public final java.lang.Throwable mo76(java.lang.Object r1) {
            r0 = this;
            java.lang.Throwable r0 = super.mo76(r1)
            if (r0 == 0) goto L7
            return r0
        L7:
            r0 = 0
            return r0
    }

    @Override // p000.AbstractC0444jt
    /* JADX INFO: renamed from: θ */
    public final java.lang.Object mo77(java.lang.Object r1) {
            r0 = this;
            boolean r0 = r1 instanceof p000.C0554mm
            if (r0 == 0) goto L9
            mm r1 = (p000.C0554mm) r1
            java.lang.Object r0 = r1.f7204
            return r0
        L9:
            return r1
    }

    @Override // p000.InterfaceC1017yd
    /* JADX INFO: renamed from: ι */
    public final p000.C0889uy mo78(java.lang.Object r6, p000.f80 r7) {
            r5 = this;
            uy r0 = p000.h62.f4588
        L2:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r1 = p000.C0015ae.f194
            java.lang.Object r2 = r1.get(r5)
            boolean r3 = r2 instanceof p000.w31
            if (r3 == 0) goto L2c
            r3 = r2
            w31 r3 = (p000.w31) r3
            int r4 = r5.f5573
            java.lang.Object r3 = m65(r3, r6, r4, r7)
        L15:
            boolean r4 = r1.compareAndSet(r5, r2, r3)
            if (r4 == 0) goto L25
            boolean r6 = r5.m92()
            if (r6 != 0) goto L24
            r5.m84()
        L24:
            return r0
        L25:
            java.lang.Object r4 = r1.get(r5)
            if (r4 == r2) goto L15
            goto L2
        L2c:
            r5 = 0
            return r5
    }

    @Override // p000.AbstractC0444jt
    /* JADX INFO: renamed from: λ */
    public final java.lang.Object mo79() {
            r1 = this;
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = p000.C0015ae.f194
            java.lang.Object r1 = r0.get(r1)
            return r1
    }

    /* JADX INFO: renamed from: μ */
    public final void m80(p000.C0868ud r3, java.lang.Throwable r4) {
            r2 = this;
            int r0 = r3.f10699     // Catch: java.lang.Throwable -> L15
            switch(r0) {
                case 0: goto Ld;
                default: goto L5;
            }     // Catch: java.lang.Throwable -> L15
        L5:
            java.lang.Object r3 = r3.f10700     // Catch: java.lang.Throwable -> L15
            vt r3 = (p000.InterfaceC0922vt) r3     // Catch: java.lang.Throwable -> L15
            r3.mo1276()     // Catch: java.lang.Throwable -> L15
            goto L14
        Ld:
            java.lang.Object r3 = r3.f10700     // Catch: java.lang.Throwable -> L15
            a80 r3 = (p000.a80) r3     // Catch: java.lang.Throwable -> L15
            r3.invoke(r4)     // Catch: java.lang.Throwable -> L15
        L14:
            return
        L15:
            r3 = move-exception
            pm r4 = new pm
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Exception in invokeOnCancellation handler for "
            r0.<init>(r1)
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            r4.<init>(r0, r3)
            up r2 = r2.f197
            p000.AbstractC0073bd.m890(r2, r4)
            return
    }

    /* JADX INFO: renamed from: ν */
    public final void m81(p000.f80 r3, java.lang.Throwable r4, java.lang.Object r5) {
            r2 = this;
            up r0 = r2.f197
            r3.mo10(r4, r5, r0)     // Catch: java.lang.Throwable -> L6
            return
        L6:
            r3 = move-exception
            pm r4 = new pm
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            java.lang.String r1 = "Exception in resume onCancellation handler for "
            r5.<init>(r1)
            r5.append(r2)
            java.lang.String r2 = r5.toString()
            r4.<init>(r2, r3)
            p000.AbstractC0073bd.m890(r0, r4)
            return
    }

    /* JADX INFO: renamed from: ξ */
    public final void m82(p000.sr1 r4, java.lang.Throwable r5) {
            r3 = this;
            up r5 = r3.f197
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r0 = p000.C0015ae.f193
            int r0 = r0.get(r3)
            r1 = 536870911(0x1fffffff, float:1.0842021E-19)
            r0 = r0 & r1
            if (r0 == r1) goto L2a
            r4.mo4589(r0, r5)     // Catch: java.lang.Throwable -> L12
            return
        L12:
            r4 = move-exception
            pm r0 = new pm
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Exception in invokeOnCancellation handler for "
            r1.<init>(r2)
            r1.append(r3)
            java.lang.String r3 = r1.toString()
            r0.<init>(r3, r4)
            p000.AbstractC0073bd.m890(r5, r0)
            return
        L2a:
            java.lang.String r3 = "The index for Segment.onCancellation(..) is broken"
            p000.C1080.m7279(r3)
            return
    }

    /* JADX INFO: renamed from: ο */
    public final boolean m83(java.lang.Throwable r7) {
            r6 = this;
        L0:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = p000.C0015ae.f194
            java.lang.Object r1 = r0.get(r6)
            boolean r2 = r1 instanceof p000.w31
            r3 = 0
            if (r2 != 0) goto Lc
            return r3
        Lc:
            ce r2 = new ce
            boolean r4 = r1 instanceof p000.C0868ud
            r5 = 1
            if (r4 != 0) goto L17
            boolean r4 = r1 instanceof p000.sr1
            if (r4 == 0) goto L18
        L17:
            r3 = r5
        L18:
            r2.<init>(r6, r7, r3)
        L1b:
            boolean r3 = r0.compareAndSet(r6, r1, r2)
            if (r3 == 0) goto L46
            r0 = r1
            w31 r0 = (p000.w31) r0
            boolean r2 = r0 instanceof p000.C0868ud
            if (r2 == 0) goto L2e
            ud r1 = (p000.C0868ud) r1
            r6.m80(r1, r7)
            goto L37
        L2e:
            boolean r0 = r0 instanceof p000.sr1
            if (r0 == 0) goto L37
            sr1 r1 = (p000.sr1) r1
            r6.m82(r1, r7)
        L37:
            boolean r7 = r6.m92()
            if (r7 != 0) goto L40
            r6.m84()
        L40:
            int r7 = r6.f5573
            r6.m85(r7)
            return r5
        L46:
            java.lang.Object r3 = r0.get(r6)
            if (r3 == r1) goto L1b
            goto L0
    }

    /* JADX INFO: renamed from: π */
    public final void m84() {
            r2 = this;
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = p000.C0015ae.f195
            java.lang.Object r1 = r0.get(r2)
            vt r1 = (p000.InterfaceC0922vt) r1
            if (r1 != 0) goto Lb
            return
        Lb:
            r1.mo1276()
            u31 r1 = p000.u31.f10580
            r0.set(r2, r1)
            return
    }

    /* JADX INFO: renamed from: ρ */
    public final void m85(int r7) {
            r6 = this;
        L0:
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r0 = p000.C0015ae.f193
            int r1 = r0.get(r6)
            int r2 = r1 >> 29
            if (r2 == 0) goto L7a
            r0 = 1
            if (r2 != r0) goto L74
            r1 = 4
            r2 = 0
            if (r7 != r1) goto L13
            r1 = r0
            goto L14
        L13:
            r1 = r2
        L14:
            op r3 = r6.f196
            if (r1 != 0) goto L70
            boolean r4 = r3 instanceof p000.C0334gt
            if (r4 == 0) goto L70
            r4 = 2
            if (r7 == r0) goto L24
            if (r7 != r4) goto L22
            goto L24
        L22:
            r7 = r2
            goto L25
        L24:
            r7 = r0
        L25:
            int r5 = r6.f5573
            if (r5 == r0) goto L2b
            if (r5 != r4) goto L2c
        L2b:
            r2 = r0
        L2c:
            if (r7 != r2) goto L70
            r7 = r3
            gt r7 = (p000.C0334gt) r7
            kotlinx.coroutines.α r1 = r7.f4445
            pp r7 = r7.f4446
            up r7 = r7.mo72()
            boolean r2 = r1.mo3392(r7)
            if (r2 == 0) goto L43
            r1.mo1950(r7, r6)
            return
        L43:
            tz r7 = p000.d42.m1648()
            long r1 = r7.f10513
            r4 = 4294967296(0x100000000, double:2.121995791E-314)
            int r1 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
            if (r1 < 0) goto L56
            r7.m5765(r6)
            return
        L56:
            r7.m5766(r0)
            p000.AbstractC0782s1.m5345(r6, r3, r0)     // Catch: java.lang.Throwable -> L66
        L5c:
            boolean r1 = r7.m5767()     // Catch: java.lang.Throwable -> L66
            if (r1 != 0) goto L5c
        L62:
            r7.m5764(r0)
            goto L87
        L66:
            r1 = move-exception
            r6.m2987(r1)     // Catch: java.lang.Throwable -> L6b
            goto L62
        L6b:
            r6 = move-exception
            r7.m5764(r0)
            throw r6
        L70:
            p000.AbstractC0782s1.m5345(r6, r3, r1)
            return
        L74:
            java.lang.String r6 = "Already resumed"
            p000.C1080.m7279(r6)
            return
        L7a:
            r2 = 536870911(0x1fffffff, float:1.0842021E-19)
            r2 = r2 & r1
            r3 = 1073741824(0x40000000, float:2.0)
            int r3 = r3 + r2
            boolean r0 = r0.compareAndSet(r6, r1, r3)
            if (r0 == 0) goto L0
        L87:
            return
    }

    /* JADX INFO: renamed from: σ */
    public final java.lang.Object m86() {
            r5 = this;
            boolean r0 = r5.m92()
        L4:
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r1 = p000.C0015ae.f193
            int r2 = r1.get(r5)
            int r3 = r2 >> 29
            if (r3 == 0) goto L53
            r1 = 2
            if (r3 != r1) goto L4c
            if (r0 == 0) goto L16
            r5.m66()
        L16:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = p000.C0015ae.f194
            java.lang.Object r0 = r0.get(r5)
            boolean r2 = r0 instanceof p000.C0628om
            if (r2 != 0) goto L47
            int r2 = r5.f5573
            r3 = 1
            if (r2 == r3) goto L27
            if (r2 != r1) goto L42
        L27:
            up r1 = r5.f197
            xn0 r2 = p000.xn0.f12226
            sp r1 = r1.mo1785(r2)
            fo0 r1 = (p000.fo0) r1
            if (r1 == 0) goto L42
            boolean r2 = r1.m2169()
            if (r2 == 0) goto L3a
            goto L42
        L3a:
            java.util.concurrent.CancellationException r0 = r1.m2159()
            r5.mo73(r0)
            throw r0
        L42:
            java.lang.Object r5 = r5.mo77(r0)
            return r5
        L47:
            om r0 = (p000.C0628om) r0
            java.lang.Throwable r5 = r0.f8149
            throw r5
        L4c:
            java.lang.String r5 = "Already suspended"
            p000.C1080.m7279(r5)
            r5 = 0
            return r5
        L53:
            r3 = 536870911(0x1fffffff, float:1.0842021E-19)
            r3 = r3 & r2
            r4 = 536870912(0x20000000, float:1.0842022E-19)
            int r4 = r4 + r3
            boolean r1 = r1.compareAndSet(r5, r2, r4)
            if (r1 == 0) goto L4
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r1 = p000.C0015ae.f195
            java.lang.Object r1 = r1.get(r5)
            vt r1 = (p000.InterfaceC0922vt) r1
            if (r1 != 0) goto L6d
            r5.m88()
        L6d:
            if (r0 == 0) goto L72
            r5.m66()
        L72:
            cq r5 = p000.EnumC0184cq.f2716
            return r5
    }

    /* JADX INFO: renamed from: τ */
    public final void m87() {
            r2 = this;
            vt r0 = r2.m88()
            if (r0 != 0) goto L7
            goto L1b
        L7:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r1 = p000.C0015ae.f194
            java.lang.Object r1 = r1.get(r2)
            boolean r1 = r1 instanceof p000.w31
            if (r1 != 0) goto L1b
            r0.mo1276()
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = p000.C0015ae.f195
            u31 r1 = p000.u31.f10580
            r0.set(r2, r1)
        L1b:
            return
    }

    /* JADX INFO: renamed from: υ */
    public final p000.InterfaceC0922vt m88() {
            r4 = this;
            up r0 = r4.f197
            xn0 r1 = p000.xn0.f12226
            sp r0 = r0.mo1785(r1)
            fo0 r0 = (p000.fo0) r0
            r1 = 0
            if (r0 != 0) goto Le
            return r1
        Le:
            of r2 = new of
            r3 = 0
            r2.<init>(r3, r4)
            r3 = 1
            vt r0 = p000.AbstractC1021yh.m6866(r0, r3, r2)
        L19:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r2 = p000.C0015ae.f195
            boolean r3 = r2.compareAndSet(r4, r1, r0)
            if (r3 == 0) goto L22
            goto L28
        L22:
            java.lang.Object r2 = r2.get(r4)
            if (r2 == 0) goto L19
        L28:
            return r0
    }

    /* JADX INFO: renamed from: φ */
    public final void m89(p000.a80 r3) {
            r2 = this;
            ud r0 = new ud
            r1 = 0
            r0.<init>(r1, r3)
            r2.m91(r0)
            return
    }

    @Override // p000.InterfaceC1017yd
    /* JADX INFO: renamed from: χ */
    public final void mo90(java.lang.Object r1) {
            r0 = this;
            int r1 = r0.f5573
            r0.m85(r1)
            return
    }

    /* JADX INFO: renamed from: ψ */
    public final void m91(p000.w31 r8) {
            r7 = this;
        L0:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = p000.C0015ae.f194
            java.lang.Object r2 = r0.get(r7)
            boolean r1 = r2 instanceof p000.C1155
            if (r1 == 0) goto L19
        La:
            boolean r1 = r0.compareAndSet(r7, r2, r8)
            if (r1 == 0) goto L12
            goto L97
        L12:
            java.lang.Object r1 = r0.get(r7)
            if (r1 == r2) goto La
            goto L0
        L19:
            boolean r1 = r2 instanceof p000.C0868ud
            r3 = 0
            if (r1 != 0) goto La0
            boolean r1 = r2 instanceof p000.sr1
            if (r1 != 0) goto La0
            boolean r1 = r2 instanceof p000.C0628om
            if (r1 == 0) goto L4d
            r0 = r2
            om r0 = (p000.C0628om) r0
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r1 = p000.C0628om.f8148
            r4 = 0
            r5 = 1
            boolean r1 = r1.compareAndSet(r0, r4, r5)
            if (r1 == 0) goto L49
            boolean r1 = r2 instanceof p000.C0110ce
            if (r1 == 0) goto L97
            java.lang.Throwable r0 = r0.f8149
            boolean r1 = r8 instanceof p000.C0868ud
            if (r1 == 0) goto L43
            ud r8 = (p000.C0868ud) r8
            r7.m80(r8, r0)
            return
        L43:
            sr1 r8 = (p000.sr1) r8
            r7.m82(r8, r0)
            return
        L49:
            m64(r8, r2)
            throw r3
        L4d:
            boolean r1 = r2 instanceof p000.C0554mm
            if (r1 == 0) goto L80
            r1 = r2
            mm r1 = (p000.C0554mm) r1
            ud r4 = r1.f7205
            if (r4 != 0) goto L7c
            boolean r4 = r8 instanceof p000.sr1
            if (r4 == 0) goto L5d
            goto L97
        L5d:
            r4 = r8
            ud r4 = (p000.C0868ud) r4
            java.lang.Throwable r5 = r1.f7208
            if (r5 == 0) goto L68
            r7.m80(r4, r5)
            return
        L68:
            r5 = 29
            mm r1 = p000.C0554mm.m3871(r1, r4, r3, r5)
        L6e:
            boolean r3 = r0.compareAndSet(r7, r2, r1)
            if (r3 == 0) goto L75
            goto L97
        L75:
            java.lang.Object r3 = r0.get(r7)
            if (r3 == r2) goto L6e
            goto L0
        L7c:
            m64(r8, r2)
            throw r3
        L80:
            boolean r1 = r8 instanceof p000.sr1
            if (r1 == 0) goto L85
            goto L97
        L85:
            r3 = r8
            ud r3 = (p000.C0868ud) r3
            mm r1 = new mm
            r5 = 0
            r6 = 28
            r4 = 0
            r1.<init>(r2, r3, r4, r5, r6)
        L91:
            boolean r3 = r0.compareAndSet(r7, r2, r1)
            if (r3 == 0) goto L98
        L97:
            return
        L98:
            java.lang.Object r3 = r0.get(r7)
            if (r3 == r2) goto L91
            goto L0
        La0:
            m64(r8, r2)
            throw r3
    }

    /* JADX INFO: renamed from: ω */
    public final boolean m92() {
            r2 = this;
            int r0 = r2.f5573
            r1 = 2
            if (r0 != r1) goto L13
            op r2 = r2.f196
            gt r2 = (p000.C0334gt) r2
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = p000.C0334gt.f4444
            java.lang.Object r2 = r0.get(r2)
            if (r2 == 0) goto L13
            r2 = 1
            return r2
        L13:
            r2 = 0
            return r2
    }
}
