package p000;

/* JADX INFO: renamed from: n3 */
/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class C0572n3 extends p000.y12 implements p000.a80 {

    /* JADX INFO: renamed from: ι */
    public p000.C0970x3 f7366;

    /* JADX INFO: renamed from: κ */
    public p000.qm1 f7367;

    /* JADX INFO: renamed from: λ */
    public int f7368;

    /* JADX INFO: renamed from: μ */
    public final /* synthetic */ p000.C0609o3 f7369;

    /* JADX INFO: renamed from: ν */
    public final /* synthetic */ java.lang.Object f7370;

    /* JADX INFO: renamed from: ξ */
    public final /* synthetic */ p000.s22 f7371;

    /* JADX INFO: renamed from: ο */
    public final /* synthetic */ long f7372;

    public C0572n3(p000.C0609o3 r1, java.lang.Object r2, p000.s22 r3, long r4, p000.InterfaceC0631op r6) {
            r0 = this;
            r0.f7369 = r1
            r0.f7370 = r2
            r0.f7371 = r3
            r0.f7372 = r4
            r1 = 1
            r0.<init>(r1, r6)
            return
    }

    @Override // p000.a80
    public final java.lang.Object invoke(java.lang.Object r8) {
            r7 = this;
            r6 = r8
            op r6 = (p000.InterfaceC0631op) r6
            n3 r0 = new n3
            s22 r3 = r7.f7371
            long r4 = r7.f7372
            o3 r1 = r7.f7369
            java.lang.Object r2 = r7.f7370
            r0.<init>(r1, r2, r3, r4, r6)
            s62 r7 = p000.s62.f9751
            java.lang.Object r7 = r0.mo11(r7)
            return r7
    }

    @Override // p000.AbstractC0715q8
    /* JADX INFO: renamed from: κ */
    public final java.lang.Object mo11(java.lang.Object r19) {
            r18 = this;
            r5 = r18
            s22 r1 = r5.f7371
            int r0 = r5.f7368
            r6 = -9223372036854775808
            r2 = 1
            o3 r8 = r5.f7369
            if (r0 == 0) goto L21
            if (r0 != r2) goto L1a
            qm1 r0 = r5.f7367
            x3 r1 = r5.f7366
            p000.i81.m2649(r19)     // Catch: java.util.concurrent.CancellationException -> L17
            goto L80
        L17:
            r0 = move-exception
            goto La1
        L1a:
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            p000.C1080.m7279(r0)
            r0 = 0
            return r0
        L21:
            p000.i81.m2649(r19)
            x3 r0 = r8.f7915     // Catch: java.util.concurrent.CancellationException -> L17
            g62 r3 = r8.f7913     // Catch: java.util.concurrent.CancellationException -> L17
            a80 r3 = r3.f4262     // Catch: java.util.concurrent.CancellationException -> L17
            java.lang.Object r4 = r5.f7370     // Catch: java.util.concurrent.CancellationException -> L17
            java.lang.Object r3 = r3.invoke(r4)     // Catch: java.util.concurrent.CancellationException -> L17
            c4 r3 = (p000.AbstractC0100c4) r3     // Catch: java.util.concurrent.CancellationException -> L17
            r0.f12021 = r3     // Catch: java.util.concurrent.CancellationException -> L17
            java.lang.Object r0 = r1.f9693     // Catch: java.util.concurrent.CancellationException -> L17
            x91 r3 = r8.f7917     // Catch: java.util.concurrent.CancellationException -> L17
            r3.setValue(r0)     // Catch: java.util.concurrent.CancellationException -> L17
            x91 r0 = r8.f7916     // Catch: java.util.concurrent.CancellationException -> L17
            java.lang.Boolean r3 = java.lang.Boolean.TRUE     // Catch: java.util.concurrent.CancellationException -> L17
            r0.setValue(r3)     // Catch: java.util.concurrent.CancellationException -> L17
            x3 r0 = r8.f7915     // Catch: java.util.concurrent.CancellationException -> L17
            x91 r3 = r0.f12020     // Catch: java.util.concurrent.CancellationException -> L17
            java.lang.Object r11 = r3.getValue()     // Catch: java.util.concurrent.CancellationException -> L17
            c4 r3 = r0.f12021     // Catch: java.util.concurrent.CancellationException -> L17
            c4 r12 = p000.AbstractC1021yh.m6891(r3)     // Catch: java.util.concurrent.CancellationException -> L17
            long r13 = r0.f12022     // Catch: java.util.concurrent.CancellationException -> L17
            boolean r3 = r0.f12024     // Catch: java.util.concurrent.CancellationException -> L17
            x3 r9 = new x3     // Catch: java.util.concurrent.CancellationException -> L17
            g62 r10 = r0.f12019     // Catch: java.util.concurrent.CancellationException -> L17
            r15 = -9223372036854775808
            r17 = r3
            r9.<init>(r10, r11, r12, r13, r15, r17)     // Catch: java.util.concurrent.CancellationException -> L17
            r0 = r9
            qm1 r9 = new qm1     // Catch: java.util.concurrent.CancellationException -> L17
            r9.<init>()     // Catch: java.util.concurrent.CancellationException -> L17
            long r3 = r5.f7372     // Catch: java.util.concurrent.CancellationException -> L17
            r10 = r3
            m3 r4 = new m3     // Catch: java.util.concurrent.CancellationException -> L17
            r3 = 0
            r4.<init>(r8, r0, r9, r3)     // Catch: java.util.concurrent.CancellationException -> L17
            r5.f7366 = r0     // Catch: java.util.concurrent.CancellationException -> L17
            r5.f7367 = r9     // Catch: java.util.concurrent.CancellationException -> L17
            r5.f7368 = r2     // Catch: java.util.concurrent.CancellationException -> L17
            r2 = r10
            java.lang.Object r1 = p000.j81.m2895(r0, r1, r2, r4, r5)     // Catch: java.util.concurrent.CancellationException -> L17
            cq r2 = p000.EnumC0184cq.f2716
            if (r1 != r2) goto L7e
            return r2
        L7e:
            r1 = r0
            r0 = r9
        L80:
            boolean r0 = r0.f9050     // Catch: java.util.concurrent.CancellationException -> L17
            if (r0 == 0) goto L87
            u3 r0 = p000.EnumC0858u3.f10576     // Catch: java.util.concurrent.CancellationException -> L17
            goto L89
        L87:
            u3 r0 = p000.EnumC0858u3.f10577     // Catch: java.util.concurrent.CancellationException -> L17
        L89:
            x3 r2 = r8.f7915     // Catch: java.util.concurrent.CancellationException -> L17
            c4 r3 = r2.f12021     // Catch: java.util.concurrent.CancellationException -> L17
            r3.mo30()     // Catch: java.util.concurrent.CancellationException -> L17
            r2.f12022 = r6     // Catch: java.util.concurrent.CancellationException -> L17
            x91 r2 = r8.f7916     // Catch: java.util.concurrent.CancellationException -> L17
            java.lang.Boolean r3 = java.lang.Boolean.FALSE     // Catch: java.util.concurrent.CancellationException -> L17
            r2.setValue(r3)     // Catch: java.util.concurrent.CancellationException -> L17
            n5 r2 = new n5     // Catch: java.util.concurrent.CancellationException -> L17
            r3 = 2
            r4 = 0
            r2.<init>(r3, r1, r0, r4)     // Catch: java.util.concurrent.CancellationException -> L17
            return r2
        La1:
            x3 r1 = r8.f7915
            c4 r2 = r1.f12021
            r2.mo30()
            r1.f12022 = r6
            x91 r1 = r8.f7916
            java.lang.Boolean r2 = java.lang.Boolean.FALSE
            r1.setValue(r2)
            throw r0
    }
}
