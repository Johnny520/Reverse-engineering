package p000;

/* JADX INFO: renamed from: ne */
/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class C0583ne extends p000.y12 implements p000.e80 {

    /* JADX INFO: renamed from: ι */
    public final /* synthetic */ int f7575;

    /* JADX INFO: renamed from: κ */
    public int f7576;

    /* JADX INFO: renamed from: λ */
    public java.lang.Object f7577;

    /* JADX INFO: renamed from: μ */
    public java.lang.Object f7578;

    /* JADX INFO: renamed from: ν */
    public final /* synthetic */ java.lang.Object f7579;

    public /* synthetic */ C0583ne(java.lang.Object r1, java.lang.Object r2, p000.InterfaceC0631op r3, int r4) {
            r0 = this;
            r0.f7575 = r4
            r0.f7578 = r1
            r0.f7579 = r2
            r1 = 2
            r0.<init>(r1, r3)
            return
    }

    public C0583ne(p000.C0942wc r2, p000.InterfaceC0631op r3) {
            r1 = this;
            r0 = 1
            r1.f7575 = r0
            r1.f7579 = r2
            r2 = 2
            r1.<init>(r2, r3)
            return
    }

    @Override // p000.e80
    public final java.lang.Object invoke(java.lang.Object r2, java.lang.Object r3) {
            r1 = this;
            int r0 = r1.f7575
            bq r2 = (p000.InterfaceC0086bq) r2
            op r3 = (p000.InterfaceC0631op) r3
            switch(r0) {
                case 0: goto L23;
                case 1: goto L16;
                default: goto L9;
            }
        L9:
            op r1 = r1.mo1119(r3, r2)
            ne r1 = (p000.C0583ne) r1
            s62 r2 = p000.s62.f9751
            java.lang.Object r1 = r1.mo11(r2)
            return r1
        L16:
            op r1 = r1.mo1119(r3, r2)
            ne r1 = (p000.C0583ne) r1
            s62 r2 = p000.s62.f9751
            java.lang.Object r1 = r1.mo11(r2)
            return r1
        L23:
            op r1 = r1.mo1119(r3, r2)
            ne r1 = (p000.C0583ne) r1
            s62 r2 = p000.s62.f9751
            java.lang.Object r1 = r1.mo11(r2)
            return r1
    }

    @Override // p000.AbstractC0715q8
    /* JADX INFO: renamed from: η */
    public final p000.InterfaceC0631op mo1119(p000.InterfaceC0631op r4, java.lang.Object r5) {
            r3 = this;
            int r0 = r3.f7575
            switch(r0) {
                case 0: goto L20;
                case 1: goto L16;
                default: goto L5;
            }
        L5:
            ne r0 = new ne
            java.lang.Object r1 = r3.f7578
            jl1 r1 = (p000.jl1) r1
            java.lang.Object r3 = r3.f7579
            k3 r3 = (p000.C0455k3) r3
            r2 = 2
            r0.<init>(r1, r3, r4, r2)
            r0.f7577 = r5
            return r0
        L16:
            ne r5 = new ne
            java.lang.Object r3 = r3.f7579
            wc r3 = (p000.C0942wc) r3
            r5.<init>(r3, r4)
            return r5
        L20:
            ne r0 = new ne
            java.lang.Object r1 = r3.f7578
            g40 r1 = (p000.g40) r1
            java.lang.Object r3 = r3.f7579
            se r3 = (p000.C0795se) r3
            r2 = 0
            r0.<init>(r1, r3, r4, r2)
            r0.f7577 = r5
            return r0
    }

    @Override // p000.AbstractC0715q8
    /* JADX INFO: renamed from: κ */
    public final java.lang.Object mo11(java.lang.Object r13) {
            r12 = this;
            int r0 = r12.f7575
            switch(r0) {
                case 0: goto Lb7;
                case 1: goto L30;
                default: goto L5;
            }
        L5:
            cq r0 = p000.EnumC0184cq.f2716
            int r1 = r12.f7576
            r2 = 1
            if (r1 == 0) goto L1b
            if (r1 != r2) goto L14
            p000.i81.m2649(r13)
            s62 r0 = p000.s62.f9751
            goto L2f
        L14:
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            p000.C1080.m7279(r12)
            r0 = 0
            goto L2f
        L1b:
            p000.i81.m2649(r13)
            java.lang.Object r13 = r12.f7577
            bq r13 = (p000.InterfaceC0086bq) r13
            java.lang.Object r1 = r12.f7578
            jl1 r1 = (p000.jl1) r1
            java.lang.Object r3 = r12.f7579
            k3 r3 = (p000.C0455k3) r3
            r12.f7576 = r2
            r1.mo10(r13, r3, r12)
        L2f:
            return r0
        L30:
            cq r0 = p000.EnumC0184cq.f2716
            int r1 = r12.f7576
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L4f
            if (r1 != r3) goto L48
            java.lang.Object r1 = r12.f7578
            vc r1 = (p000.C0904vc) r1
            java.lang.Object r4 = r12.f7577
            me r4 = (p000.InterfaceC0546me) r4
            p000.i81.m2649(r13)     // Catch: java.lang.Throwable -> L46
            goto L6a
        L46:
            r12 = move-exception
            goto L9e
        L48:
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            p000.C1080.m7279(r12)
            r0 = 0
            goto L9d
        L4f:
            p000.i81.m2649(r13)
            java.lang.Object r13 = r12.f7579
            r4 = r13
            wc r4 = (p000.C0942wc) r4
            vc r13 = new vc     // Catch: java.lang.Throwable -> L46
            r13.<init>(r4)     // Catch: java.lang.Throwable -> L46
            r1 = r13
        L5d:
            r12.f7577 = r4     // Catch: java.lang.Throwable -> L46
            r12.f7578 = r1     // Catch: java.lang.Throwable -> L46
            r12.f7576 = r3     // Catch: java.lang.Throwable -> L46
            java.lang.Object r13 = r1.m6166(r12)     // Catch: java.lang.Throwable -> L46
            if (r13 != r0) goto L6a
            goto L9d
        L6a:
            java.lang.Boolean r13 = (java.lang.Boolean) r13     // Catch: java.lang.Throwable -> L46
            boolean r13 = r13.booleanValue()     // Catch: java.lang.Throwable -> L46
            if (r13 == 0) goto L98
            java.lang.Object r13 = r1.m6167()     // Catch: java.lang.Throwable -> L46
            s62 r13 = (p000.s62) r13     // Catch: java.lang.Throwable -> L46
            java.util.concurrent.atomic.AtomicBoolean r13 = p000.ta0.f10263     // Catch: java.lang.Throwable -> L46
            r5 = 0
            r13.set(r5)     // Catch: java.lang.Throwable -> L46
            java.lang.Object r13 = p000.ax1.f1362     // Catch: java.lang.Throwable -> L46
            monitor-enter(r13)     // Catch: java.lang.Throwable -> L46
            sa0 r6 = p000.ax1.f1369     // Catch: java.lang.Throwable -> L95
            c21 r6 = r6.f3730     // Catch: java.lang.Throwable -> L95
            if (r6 == 0) goto L8e
            boolean r6 = r6.m1114()     // Catch: java.lang.Throwable -> L95
            if (r6 != r3) goto L8e
            r5 = r3
        L8e:
            monitor-exit(r13)     // Catch: java.lang.Throwable -> L46
            if (r5 == 0) goto L5d
            p000.ax1.m619()     // Catch: java.lang.Throwable -> L46
            goto L5d
        L95:
            r12 = move-exception
            monitor-exit(r13)     // Catch: java.lang.Throwable -> L46
            throw r12     // Catch: java.lang.Throwable -> L46
        L98:
            r4.mo2180(r2)
            s62 r0 = p000.s62.f9751
        L9d:
            return r0
        L9e:
            throw r12     // Catch: java.lang.Throwable -> L9f
        L9f:
            r13 = move-exception
            boolean r0 = r12 instanceof java.util.concurrent.CancellationException
            if (r0 == 0) goto La7
            r2 = r12
            java.util.concurrent.CancellationException r2 = (java.util.concurrent.CancellationException) r2
        La7:
            if (r2 != 0) goto Lb3
            java.lang.String r0 = "Channel was consumed, consumer had failed"
            java.util.concurrent.CancellationException r2 = new java.util.concurrent.CancellationException
            r2.<init>(r0)
            r2.initCause(r12)
        Lb3:
            r4.mo2180(r2)
            throw r13
        Lb7:
            s62 r0 = p000.s62.f9751
            cq r1 = p000.EnumC0184cq.f2716
            int r2 = r12.f7576
            r3 = 1
            if (r2 == 0) goto Lcd
            if (r2 != r3) goto Lc6
            p000.i81.m2649(r13)
            goto L121
        Lc6:
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            p000.C1080.m7279(r12)
            r0 = 0
            goto L121
        Lcd:
            p000.i81.m2649(r13)
            java.lang.Object r13 = r12.f7577
            bq r13 = (p000.InterfaceC0086bq) r13
            java.lang.Object r2 = r12.f7578
            g40 r2 = (p000.g40) r2
            java.lang.Object r4 = r12.f7579
            se r4 = (p000.C0795se) r4
            up r5 = r4.f9868
            int r6 = r4.f9869
            r7 = -3
            if (r6 != r7) goto Le4
            r6 = -2
        Le4:
            uc r7 = r4.f9870
            eq r8 = p000.EnumC0257eq.f3633
            oe r9 = new oe
            r10 = 0
            r11 = 0
            r9.<init>(r4, r11, r10)
            r4 = 4
            wc r4 = p000.ln0.m3619(r6, r7, r4)
            up r13 = r13.mo993()
            up r13 = p000.AbstractC0782s1.m5333(r13, r5, r3)
            jr r5 = p000.AbstractC0524lt.f6767
            if (r13 == r5) goto L10c
            x r6 = p000.C0966x.f11916
            sp r6 = r13.mo1785(r6)
            if (r6 != 0) goto L10c
            up r13 = r13.mo1784(r5)
        L10c:
            xi1 r5 = new xi1
            r5.<init>(r13, r4)
            r5.m7284(r8, r5, r9)
            r12.f7576 = r3
            java.lang.Object r12 = p000.AbstractC1021yh.m6895(r2, r5, r3, r12)
            if (r12 != r1) goto L11d
            goto L11e
        L11d:
            r12 = r0
        L11e:
            if (r12 != r1) goto L121
            r0 = r1
        L121:
            return r0
    }
}
