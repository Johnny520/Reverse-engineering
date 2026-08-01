package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class o21 extends p000.y12 implements p000.e80 {

    /* JADX INFO: renamed from: ι */
    public final /* synthetic */ int f7874;

    /* JADX INFO: renamed from: κ */
    public int f7875;

    /* JADX INFO: renamed from: λ */
    public java.lang.Object f7876;

    /* JADX INFO: renamed from: μ */
    public java.lang.Object f7877;

    /* JADX INFO: renamed from: ν */
    public /* synthetic */ java.lang.Object f7878;

    /* JADX INFO: renamed from: ξ */
    public java.lang.Object f7879;

    /* JADX INFO: renamed from: ο */
    public final /* synthetic */ java.lang.Object f7880;

    /* JADX INFO: renamed from: π */
    public final /* synthetic */ java.lang.Object f7881;

    /* JADX INFO: renamed from: ρ */
    public final /* synthetic */ java.lang.Object f7882;

    public o21(android.content.ContentResolver r2, android.net.Uri r3, p000.C0733qq r4, p000.C0942wc r5, android.content.Context r6, p000.InterfaceC0631op r7) {
            r1 = this;
            r0 = 1
            r1.f7874 = r0
            r1.f7878 = r2
            r1.f7879 = r3
            r1.f7880 = r4
            r1.f7881 = r5
            r1.f7882 = r6
            r2 = 2
            r1.<init>(r2, r7)
            return
    }

    public o21(p000.m21 r2, p000.p21 r3, p000.C0572n3 r4, p000.InterfaceC0631op r5) {
            r1 = this;
            r0 = 0
            r1.f7874 = r0
            r1.f7881 = r2
            r1.f7880 = r3
            r1.f7882 = r4
            r2 = 2
            r1.<init>(r2, r5)
            return
    }

    @Override // p000.e80
    public final java.lang.Object invoke(java.lang.Object r2, java.lang.Object r3) {
            r1 = this;
            int r0 = r1.f7874
            switch(r0) {
                case 0: goto L16;
                default: goto L5;
            }
        L5:
            g40 r2 = (p000.g40) r2
            op r3 = (p000.InterfaceC0631op) r3
            op r1 = r1.mo1119(r3, r2)
            o21 r1 = (p000.o21) r1
            s62 r2 = p000.s62.f9751
            java.lang.Object r1 = r1.mo11(r2)
            return r1
        L16:
            bq r2 = (p000.InterfaceC0086bq) r2
            op r3 = (p000.InterfaceC0631op) r3
            op r1 = r1.mo1119(r3, r2)
            o21 r1 = (p000.o21) r1
            s62 r2 = p000.s62.f9751
            java.lang.Object r1 = r1.mo11(r2)
            return r1
    }

    @Override // p000.AbstractC0715q8
    /* JADX INFO: renamed from: η */
    public final p000.InterfaceC0631op mo1119(p000.InterfaceC0631op r9, java.lang.Object r10) {
            r8 = this;
            int r0 = r8.f7874
            switch(r0) {
                case 0: goto L27;
                default: goto L5;
            }
        L5:
            o21 r1 = new o21
            java.lang.Object r0 = r8.f7878
            r2 = r0
            android.content.ContentResolver r2 = (android.content.ContentResolver) r2
            java.lang.Object r0 = r8.f7879
            r3 = r0
            android.net.Uri r3 = (android.net.Uri) r3
            java.lang.Object r0 = r8.f7880
            r4 = r0
            qq r4 = (p000.C0733qq) r4
            java.lang.Object r0 = r8.f7881
            r5 = r0
            wc r5 = (p000.C0942wc) r5
            java.lang.Object r8 = r8.f7882
            r6 = r8
            android.content.Context r6 = (android.content.Context) r6
            r7 = r9
            r1.<init>(r2, r3, r4, r5, r6, r7)
            r1.f7876 = r10
            return r1
        L27:
            r7 = r9
            o21 r9 = new o21
            java.lang.Object r0 = r8.f7881
            m21 r0 = (p000.m21) r0
            java.lang.Object r1 = r8.f7880
            p21 r1 = (p000.p21) r1
            java.lang.Object r8 = r8.f7882
            n3 r8 = (p000.C0572n3) r8
            r9.<init>(r0, r1, r8, r7)
            r9.f7878 = r10
            return r9
    }

    @Override // p000.AbstractC0715q8
    /* JADX INFO: renamed from: κ */
    public final java.lang.Object mo11(java.lang.Object r14) {
            r13 = this;
            int r0 = r13.f7874
            s62 r1 = p000.s62.f9751
            java.lang.Object r2 = r13.f7882
            java.lang.Object r3 = r13.f7881
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            cq r5 = p000.EnumC0184cq.f2716
            java.lang.Object r6 = r13.f7880
            r7 = 1
            r8 = 0
            r9 = 2
            switch(r0) {
                case 0: goto La2;
                default: goto L14;
            }
        L14:
            qq r6 = (p000.C0733qq) r6
            java.lang.Object r0 = r13.f7878
            android.content.ContentResolver r0 = (android.content.ContentResolver) r0
            int r10 = r13.f7875
            if (r10 == 0) goto L44
            if (r10 == r7) goto L38
            if (r10 != r9) goto L33
            java.lang.Object r3 = r13.f7877
            vc r3 = (p000.C0904vc) r3
            java.lang.Object r4 = r13.f7876
            g40 r4 = (p000.g40) r4
            p000.i81.m2649(r14)     // Catch: java.lang.Throwable -> L30
        L2d:
            r14 = r4
            r4 = r3
            goto L5a
        L30:
            r13 = move-exception
            goto L9e
        L33:
            p000.C1080.m7279(r4)
            r1 = r8
            goto L9d
        L38:
            java.lang.Object r3 = r13.f7877
            vc r3 = (p000.C0904vc) r3
            java.lang.Object r4 = r13.f7876
            g40 r4 = (p000.g40) r4
            p000.i81.m2649(r14)     // Catch: java.lang.Throwable -> L30
            goto L6b
        L44:
            p000.i81.m2649(r14)
            java.lang.Object r14 = r13.f7876
            g40 r14 = (p000.g40) r14
            java.lang.Object r4 = r13.f7879
            android.net.Uri r4 = (android.net.Uri) r4
            r8 = 0
            r0.registerContentObserver(r4, r8, r6)
            wc r3 = (p000.C0942wc) r3     // Catch: java.lang.Throwable -> L30
            vc r4 = new vc     // Catch: java.lang.Throwable -> L30
            r4.<init>(r3)     // Catch: java.lang.Throwable -> L30
        L5a:
            r13.f7876 = r14     // Catch: java.lang.Throwable -> L30
            r13.f7877 = r4     // Catch: java.lang.Throwable -> L30
            r13.f7875 = r7     // Catch: java.lang.Throwable -> L30
            java.lang.Object r3 = r4.m6166(r13)     // Catch: java.lang.Throwable -> L30
            if (r3 != r5) goto L67
            goto L98
        L67:
            r12 = r4
            r4 = r14
            r14 = r3
            r3 = r12
        L6b:
            java.lang.Boolean r14 = (java.lang.Boolean) r14     // Catch: java.lang.Throwable -> L30
            boolean r14 = r14.booleanValue()     // Catch: java.lang.Throwable -> L30
            if (r14 == 0) goto L9a
            r3.m6167()     // Catch: java.lang.Throwable -> L30
            r14 = r2
            android.content.Context r14 = (android.content.Context) r14     // Catch: java.lang.Throwable -> L30
            b21 r8 = p000.dd2.f3101     // Catch: java.lang.Throwable -> L30
            android.content.ContentResolver r14 = r14.getContentResolver()     // Catch: java.lang.Throwable -> L30
            java.lang.String r8 = "animator_duration_scale"
            r10 = 1065353216(0x3f800000, float:1.0)
            float r14 = android.provider.Settings.Global.getFloat(r14, r8, r10)     // Catch: java.lang.Throwable -> L30
            java.lang.Float r8 = new java.lang.Float     // Catch: java.lang.Throwable -> L30
            r8.<init>(r14)     // Catch: java.lang.Throwable -> L30
            r13.f7876 = r4     // Catch: java.lang.Throwable -> L30
            r13.f7877 = r3     // Catch: java.lang.Throwable -> L30
            r13.f7875 = r9     // Catch: java.lang.Throwable -> L30
            java.lang.Object r14 = r4.mo1985(r8, r13)     // Catch: java.lang.Throwable -> L30
            if (r14 != r5) goto L2d
        L98:
            r1 = r5
            goto L9d
        L9a:
            r0.unregisterContentObserver(r6)
        L9d:
            return r1
        L9e:
            r0.unregisterContentObserver(r6)
            throw r13
        La2:
            p21 r6 = (p000.p21) r6
            int r0 = r13.f7875
            if (r0 == 0) goto Lde
            if (r0 == r7) goto Lc6
            if (r0 != r9) goto Lc0
            java.lang.Object r0 = r13.f7876
            p21 r0 = (p000.p21) r0
            java.lang.Object r1 = r13.f7877
            r21 r1 = (p000.r21) r1
            java.lang.Object r13 = r13.f7878
            n21 r13 = (p000.n21) r13
            p000.i81.m2649(r14)     // Catch: java.lang.Throwable -> Lbd
            goto L19c
        Lbd:
            r14 = move-exception
            goto L1b5
        Lc0:
            p000.C1080.m7279(r4)
            r5 = r8
            goto L1af
        Lc6:
            java.lang.Object r0 = r13.f7879
            r6 = r0
            p21 r6 = (p000.p21) r6
            java.lang.Object r0 = r13.f7876
            a80 r0 = (p000.a80) r0
            java.lang.Object r1 = r13.f7877
            r21 r1 = (p000.r21) r1
            java.lang.Object r2 = r13.f7878
            n21 r2 = (p000.n21) r2
            p000.i81.m2649(r14)
            r10 = r0
            r0 = r2
            goto L189
        Lde:
            p000.i81.m2649(r14)
            java.lang.Object r14 = r13.f7878
            bq r14 = (p000.InterfaceC0086bq) r14
            n21 r0 = new n21
            m21 r3 = (p000.m21) r3
            up r14 = r14.mo993()
            xn0 r4 = p000.xn0.f12226
            sp r14 = r14.mo1785(r4)
            r14.getClass()
            fo0 r14 = (p000.fo0) r14
            r0.<init>(r3, r14)
            java.util.concurrent.atomic.AtomicReference r14 = r6.f8397
        Lfd:
            java.lang.Object r3 = r14.get()
            n21 r3 = (p000.n21) r3
            if (r3 == 0) goto L118
            m21 r4 = r0.f7362
            m21 r10 = r3.f7362
            int r4 = r4.compareTo(r10)
            if (r4 < 0) goto L110
            goto L118
        L110:
            java.util.concurrent.CancellationException r13 = new java.util.concurrent.CancellationException
            java.lang.String r14 = "Current mutation had a higher priority"
            r13.<init>(r14)
            throw r13
        L118:
            boolean r4 = r14.compareAndSet(r3, r0)
            if (r4 == 0) goto L1c9
            if (r3 == 0) goto L12c
            fo0 r14 = r3.f7363
            nf r3 = new nf
            java.lang.String r4 = "Mutation interrupted"
            r3.<init>(r4, r9)
            r14.mo2180(r3)
        L12c:
            r21 r4 = r6.f8398
            r10 = r2
            n3 r10 = (p000.C0572n3) r10
            r13.f7878 = r0
            r13.f7877 = r4
            r13.f7876 = r10
            r13.f7879 = r6
            r13.f7875 = r7
            r4.getClass()
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r11 = p000.r21.f9237
        L140:
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r14 = p000.ns1.f7731
            int r2 = r14.get(r4)
            if (r2 <= r7) goto L157
        L148:
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r14 = p000.ns1.f7731
            int r2 = r14.get(r4)
            if (r2 <= r7) goto L140
            boolean r14 = r14.compareAndSet(r4, r2, r7)
            if (r14 == 0) goto L148
            goto L140
        L157:
            if (r2 > 0) goto L17a
            op r14 = p000.AbstractC0978xb.m6563(r13)
            ae r14 = p000.AbstractC0978xb.m6559(r14)
            q21 r2 = new q21     // Catch: java.lang.Throwable -> L175
            r2.<init>(r4, r14)     // Catch: java.lang.Throwable -> L175
            r4.m4094(r2)     // Catch: java.lang.Throwable -> L175
            java.lang.Object r14 = r14.m86()
            if (r14 != r5) goto L170
            goto L171
        L170:
            r14 = r1
        L171:
            if (r14 != r5) goto L185
            r1 = r14
            goto L185
        L175:
            r13 = move-exception
            r14.m66()
            throw r13
        L17a:
            int r3 = r2 + (-1)
            boolean r14 = r14.compareAndSet(r4, r2, r3)
            if (r14 == 0) goto L140
            r11.set(r4, r8)
        L185:
            if (r1 != r5) goto L188
            goto L1af
        L188:
            r1 = r4
        L189:
            r13.f7878 = r0     // Catch: java.lang.Throwable -> L1b2
            r13.f7877 = r1     // Catch: java.lang.Throwable -> L1b2
            r13.f7876 = r6     // Catch: java.lang.Throwable -> L1b2
            r13.f7879 = r8     // Catch: java.lang.Throwable -> L1b2
            r13.f7875 = r9     // Catch: java.lang.Throwable -> L1b2
            java.lang.Object r14 = r10.invoke(r13)     // Catch: java.lang.Throwable -> L1b2
            if (r14 != r5) goto L19a
            goto L1af
        L19a:
            r13 = r0
            r0 = r6
        L19c:
            java.util.concurrent.atomic.AtomicReference r0 = r0.f8397     // Catch: java.lang.Throwable -> L1b0
        L19e:
            boolean r2 = r0.compareAndSet(r13, r8)     // Catch: java.lang.Throwable -> L1b0
            if (r2 == 0) goto L1a5
            goto L1ab
        L1a5:
            java.lang.Object r2 = r0.get()     // Catch: java.lang.Throwable -> L1b0
            if (r2 == r13) goto L19e
        L1ab:
            r1.m5054(r8)
            r5 = r14
        L1af:
            return r5
        L1b0:
            r13 = move-exception
            goto L1c5
        L1b2:
            r14 = move-exception
            r13 = r0
            r0 = r6
        L1b5:
            java.util.concurrent.atomic.AtomicReference r0 = r0.f8397     // Catch: java.lang.Throwable -> L1b0
        L1b7:
            boolean r2 = r0.compareAndSet(r13, r8)     // Catch: java.lang.Throwable -> L1b0
            if (r2 != 0) goto L1c4
            java.lang.Object r2 = r0.get()     // Catch: java.lang.Throwable -> L1b0
            if (r2 != r13) goto L1c4
            goto L1b7
        L1c4:
            throw r14     // Catch: java.lang.Throwable -> L1b0
        L1c5:
            r1.m5054(r8)
            throw r13
        L1c9:
            java.lang.Object r4 = r14.get()
            if (r4 == r3) goto L118
            goto Lfd
    }
}
