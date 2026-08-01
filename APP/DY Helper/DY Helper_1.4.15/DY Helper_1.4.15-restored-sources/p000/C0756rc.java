package p000;

/* JADX INFO: renamed from: rc */
/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class C0756rc extends java.io.InputStream {

    /* JADX INFO: renamed from: ε */
    public final /* synthetic */ int f9330;

    /* JADX INFO: renamed from: ζ */
    public final /* synthetic */ p000.InterfaceC0014ad f9331;

    public /* synthetic */ C0756rc(p000.InterfaceC0014ad r1, int r2) {
            r0 = this;
            r0.f9330 = r2
            r0.f9331 = r1
            r0.<init>()
            return
    }

    /* JADX INFO: renamed from: δ */
    private final void m5077() {
            r0 = this;
            return
    }

    @Override // java.io.InputStream
    public final int available() {
            r4 = this;
            int r0 = r4.f9330
            switch(r0) {
                case 0: goto L22;
                default: goto L5;
            }
        L5:
            ad r4 = r4.f9331
            rk1 r4 = (p000.rk1) r4
            boolean r0 = r4.f9397
            if (r0 != 0) goto L1b
            sc r4 = r4.f9396
            long r0 = r4.f9828
            r4 = 2147483647(0x7fffffff, float:NaN)
            long r2 = (long) r4
            long r0 = java.lang.Math.min(r0, r2)
            int r4 = (int) r0
            goto L21
        L1b:
            java.lang.String r4 = "closed"
            p000.C1080.m7281(r4)
            r4 = 0
        L21:
            return r4
        L22:
            ad r4 = r4.f9331
            sc r4 = (p000.C0793sc) r4
            long r0 = r4.f9828
            r4 = 2147483647(0x7fffffff, float:NaN)
            long r2 = (long) r4
            long r0 = java.lang.Math.min(r0, r2)
            int r4 = (int) r0
            return r4
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
            r1 = this;
            int r0 = r1.f9330
            switch(r0) {
                case 0: goto Lc;
                default: goto L5;
            }
        L5:
            ad r1 = r1.f9331
            rk1 r1 = (p000.rk1) r1
            r1.close()
        Lc:
            return
    }

    @Override // java.io.InputStream
    public final int read() {
            r5 = this;
            int r0 = r5.f9330
            switch(r0) {
                case 0: goto L35;
                default: goto L5;
            }
        L5:
            ad r5 = r5.f9331
            rk1 r5 = (p000.rk1) r5
            sc r0 = r5.f9396
            boolean r1 = r5.f9397
            if (r1 != 0) goto L2e
            long r1 = r0.f9828
            r3 = 0
            int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r1 != 0) goto L27
            rx1 r5 = r5.f9395
            r1 = 8192(0x2000, double:4.0474E-320)
            long r1 = r5.mo2106(r1, r0)
            r3 = -1
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 != 0) goto L27
            r5 = -1
            goto L34
        L27:
            byte r5 = r0.readByte()
            r5 = r5 & 255(0xff, float:3.57E-43)
            goto L34
        L2e:
            java.lang.String r5 = "closed"
            p000.C1080.m7281(r5)
            r5 = 0
        L34:
            return r5
        L35:
            ad r5 = r5.f9331
            sc r5 = (p000.C0793sc) r5
            long r0 = r5.f9828
            r2 = 0
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 <= 0) goto L48
            byte r5 = r5.readByte()
            r5 = r5 & 255(0xff, float:3.57E-43)
            goto L49
        L48:
            r5 = -1
        L49:
            return r5
    }

    @Override // java.io.InputStream
    public final int read(byte[] r9, int r10, int r11) {
            r8 = this;
            int r0 = r8.f9330
            r9.getClass()
            switch(r0) {
                case 0: goto L3d;
                default: goto L8;
            }
        L8:
            ad r8 = r8.f9331
            rk1 r8 = (p000.rk1) r8
            sc r0 = r8.f9396
            boolean r1 = r8.f9397
            if (r1 != 0) goto L36
            int r1 = r9.length
            long r2 = (long) r1
            long r4 = (long) r10
            long r6 = (long) r11
            p000.ln0.m3629(r2, r4, r6)
            long r1 = r0.f9828
            r3 = 0
            int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r1 != 0) goto L31
            rx1 r8 = r8.f9395
            r1 = 8192(0x2000, double:4.0474E-320)
            long r1 = r8.mo2106(r1, r0)
            r3 = -1
            int r8 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r8 != 0) goto L31
            r8 = -1
            goto L3c
        L31:
            int r8 = r0.read(r9, r10, r11)
            goto L3c
        L36:
            java.lang.String r8 = "closed"
            p000.C1080.m7281(r8)
            r8 = 0
        L3c:
            return r8
        L3d:
            ad r8 = r8.f9331
            sc r8 = (p000.C0793sc) r8
            int r8 = r8.read(r9, r10, r11)
            return r8
    }

    public final java.lang.String toString() {
            r1 = this;
            int r0 = r1.f9330
            switch(r0) {
                case 0: goto L1b;
                default: goto L5;
            }
        L5:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            ad r1 = r1.f9331
            rk1 r1 = (p000.rk1) r1
            r0.append(r1)
            java.lang.String r1 = ".inputStream()"
            r0.append(r1)
            java.lang.String r1 = r0.toString()
            return r1
        L1b:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            ad r1 = r1.f9331
            sc r1 = (p000.C0793sc) r1
            r0.append(r1)
            java.lang.String r1 = ".inputStream()"
            r0.append(r1)
            java.lang.String r1 = r0.toString()
            return r1
    }

    @Override // java.io.InputStream
    public long transferTo(java.io.OutputStream r15) {
            r14 = this;
            int r0 = r14.f9330
            switch(r0) {
                case 1: goto La;
                default: goto L5;
            }
        L5:
            long r14 = super.transferTo(r15)
            return r14
        La:
            r15.getClass()
            ad r14 = r14.f9331
            rk1 r14 = (p000.rk1) r14
            sc r0 = r14.f9396
            boolean r1 = r14.f9397
            if (r1 != 0) goto L6d
            r1 = 0
            r3 = r1
        L1a:
            long r5 = r0.f9828
            int r5 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r5 != 0) goto L2e
            rx1 r5 = r14.f9395
            r6 = 8192(0x2000, double:4.0474E-320)
            long r5 = r5.mo2106(r6, r0)
            r7 = -1
            int r5 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r5 == 0) goto L74
        L2e:
            long r6 = r0.f9828
            long r3 = r3 + r6
            r8 = 0
            r10 = r6
            p000.ln0.m3629(r6, r8, r10)
            rr1 r5 = r0.f9827
        L39:
            int r8 = (r6 > r1 ? 1 : (r6 == r1 ? 0 : -1))
            if (r8 <= 0) goto L1a
            r5.getClass()
            int r8 = r5.f9473
            int r9 = r5.f9472
            int r8 = r8 - r9
            long r8 = (long) r8
            long r8 = java.lang.Math.min(r6, r8)
            int r8 = (int) r8
            byte[] r9 = r5.f9471
            int r10 = r5.f9472
            r15.write(r9, r10, r8)
            int r9 = r5.f9472
            int r9 = r9 + r8
            r5.f9472 = r9
            long r10 = r0.f9828
            long r12 = (long) r8
            long r10 = r10 - r12
            r0.f9828 = r10
            long r6 = r6 - r12
            int r8 = r5.f9473
            if (r9 != r8) goto L39
            rr1 r8 = r5.m5123()
            r0.f9827 = r8
            p000.tr1.m5737(r5)
            r5 = r8
            goto L39
        L6d:
            java.lang.String r14 = "closed"
            p000.C1080.m7281(r14)
            r3 = 0
        L74:
            return r3
    }
}
