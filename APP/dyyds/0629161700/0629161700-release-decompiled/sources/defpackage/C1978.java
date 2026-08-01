package defpackage;

/* JADX INFO: renamed from: ᲇᛱᛶᲀ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
public final class C1978 extends java.io.InputStream {

    /* JADX INFO: renamed from: ᛷᛲᲇᲈ, reason: contains not printable characters */
    public final /* synthetic */ defpackage.InterfaceC1810 f8566;

    /* JADX INFO: renamed from: ᛷᛸᛵᲇ, reason: contains not printable characters */
    public final /* synthetic */ int f8567;

    public /* synthetic */ C1978(defpackage.InterfaceC1810 r1, int r2) {
            r0 = this;
            r0.f8567 = r2
            r0.f8566 = r1
            r0.<init>()
            return
    }

    /* JADX INFO: renamed from: ᛷᲁᛳᛳ, reason: contains not printable characters */
    private final void m3392() {
            r0 = this;
            return
    }

    @Override // java.io.InputStream
    public final int available() {
            r5 = this;
            int r0 = r5.f8567
            r1 = 2147483647(0x7fffffff, double:1.060997895E-314)
            ᲁᛲᛴᛳ r5 = r5.f8566
            switch(r0) {
                case 0: goto L21;
                default: goto La;
            }
        La:
            ᲈᛵᲈᛵ r5 = (defpackage.C2252) r5
            boolean r0 = r5.f9577
            if (r0 != 0) goto L1a
            ᛸᲁᛵ r5 = r5.f9578
            long r3 = r5.f6928
            long r0 = java.lang.Math.min(r3, r1)
            int r5 = (int) r0
            goto L20
        L1a:
            java.lang.String r5 = "closed"
            defpackage.C2264.m3682(r5)
            r5 = 0
        L20:
            return r5
        L21:
            ᛸᲁᛵ r5 = (defpackage.C1569) r5
            long r3 = r5.f6928
            long r0 = java.lang.Math.min(r3, r1)
            int r5 = (int) r0
            return r5
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
            r1 = this;
            int r0 = r1.f8567
            switch(r0) {
                case 0: goto Lc;
                default: goto L5;
            }
        L5:
            ᲁᛲᛴᛳ r1 = r1.f8566
            ᲈᛵᲈᛵ r1 = (defpackage.C2252) r1
            r1.close()
        Lc:
            return
    }

    @Override // java.io.InputStream
    public final int read() {
            r6 = this;
            int r0 = r6.f8567
            r1 = -1
            r2 = 0
            ᲁᛲᛴᛳ r6 = r6.f8566
            switch(r0) {
                case 0: goto L35;
                default: goto La;
            }
        La:
            ᲈᛵᲈᛵ r6 = (defpackage.C2252) r6
            ᛸᲁᛵ r0 = r6.f9578
            boolean r4 = r6.f9577
            if (r4 != 0) goto L2e
            long r4 = r0.f6928
            int r2 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r2 != 0) goto L27
            ᲈᛱᲇᛳ r6 = r6.f9579
            r2 = 8192(0x2000, double:4.0474E-320)
            long r2 = r6.mo782(r2, r0)
            r4 = -1
            int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r6 != 0) goto L27
            goto L34
        L27:
            byte r6 = r0.m2831()
            r1 = r6 & 255(0xff, float:3.57E-43)
            goto L34
        L2e:
            java.lang.String r6 = "closed"
            defpackage.C2264.m3682(r6)
            r1 = 0
        L34:
            return r1
        L35:
            ᛸᲁᛵ r6 = (defpackage.C1569) r6
            long r4 = r6.f6928
            int r0 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r0 <= 0) goto L43
            byte r6 = r6.m2831()
            r1 = r6 & 255(0xff, float:3.57E-43)
        L43:
            return r1
    }

    @Override // java.io.InputStream
    public final int read(byte[] r9, int r10, int r11) {
            r8 = this;
            int r0 = r8.f8567
            ᲁᛲᛴᛳ r8 = r8.f8566
            switch(r0) {
                case 0: goto L3a;
                default: goto L7;
            }
        L7:
            ᲈᛵᲈᛵ r8 = (defpackage.C2252) r8
            ᛸᲁᛵ r0 = r8.f9578
            boolean r1 = r8.f9577
            if (r1 != 0) goto L33
            int r1 = r9.length
            long r2 = (long) r1
            long r4 = (long) r10
            long r6 = (long) r11
            defpackage.AbstractC1171.m2271(r2, r4, r6)
            long r1 = r0.f6928
            r3 = 0
            int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r1 != 0) goto L2e
            ᲈᛱᲇᛳ r8 = r8.f9579
            r1 = 8192(0x2000, double:4.0474E-320)
            long r1 = r8.mo782(r1, r0)
            r3 = -1
            int r8 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r8 != 0) goto L2e
            r8 = -1
            goto L39
        L2e:
            int r8 = r0.read(r9, r10, r11)
            goto L39
        L33:
            java.lang.String r8 = "closed"
            defpackage.C2264.m3682(r8)
            r8 = 0
        L39:
            return r8
        L3a:
            ᛸᲁᛵ r8 = (defpackage.C1569) r8
            int r8 = r8.read(r9, r10, r11)
            return r8
    }

    public final java.lang.String toString() {
            r2 = this;
            int r0 = r2.f8567
            java.lang.String r1 = ".inputStream()"
            ᲁᛲᛴᛳ r2 = r2.f8566
            switch(r0) {
                case 0: goto L1b;
                default: goto L9;
            }
        L9:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            ᲈᛵᲈᛵ r2 = (defpackage.C2252) r2
            r0.append(r2)
            r0.append(r1)
            java.lang.String r2 = r0.toString()
            return r2
        L1b:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            ᛸᲁᛵ r2 = (defpackage.C1569) r2
            r0.append(r2)
            r0.append(r1)
            java.lang.String r2 = r0.toString()
            return r2
    }

    @Override // java.io.InputStream
    public long transferTo(java.io.OutputStream r15) {
            r14 = this;
            int r0 = r14.f8567
            switch(r0) {
                case 1: goto La;
                default: goto L5;
            }
        L5:
            long r14 = super.transferTo(r15)
            return r14
        La:
            ᲁᛲᛴᛳ r14 = r14.f8566
            ᲈᛵᲈᛵ r14 = (defpackage.C2252) r14
            ᛸᲁᛵ r0 = r14.f9578
            boolean r1 = r14.f9577
            r2 = 0
            if (r1 != 0) goto L6a
            r4 = r2
        L17:
            long r6 = r0.f6928
            int r1 = (r6 > r2 ? 1 : (r6 == r2 ? 0 : -1))
            if (r1 != 0) goto L2e
            ᲈᛱᲇᛳ r1 = r14.f9579
            r6 = 8192(0x2000, double:4.0474E-320)
            long r6 = r1.mo782(r6, r0)
            r8 = -1
            int r1 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r1 == 0) goto L2c
            goto L2e
        L2c:
            r2 = r4
            goto L6f
        L2e:
            long r6 = r0.f6928
            long r4 = r4 + r6
            r8 = 0
            r10 = r6
            defpackage.AbstractC1171.m2271(r6, r8, r10)
            ᲁᲇᛶᛶ r1 = r0.f6929
        L39:
            int r8 = (r6 > r2 ? 1 : (r6 == r2 ? 0 : -1))
            if (r8 <= 0) goto L17
            int r8 = r1.f8466
            int r9 = r1.f8468
            int r8 = r8 - r9
            long r8 = (long) r8
            long r8 = java.lang.Math.min(r6, r8)
            int r8 = (int) r8
            byte[] r9 = r1.f8467
            int r10 = r1.f8468
            r15.write(r9, r10, r8)
            int r9 = r1.f8468
            int r9 = r9 + r8
            r1.f8468 = r9
            long r10 = r0.f6928
            long r12 = (long) r8
            long r10 = r10 - r12
            r0.f6928 = r10
            long r6 = r6 - r12
            int r8 = r1.f8466
            if (r9 != r8) goto L39
            ᲁᲇᛶᛶ r8 = r1.m3361()
            r0.f6929 = r8
            defpackage.AbstractC1590.m2869(r1)
            r1 = r8
            goto L39
        L6a:
            java.lang.String r14 = "closed"
            defpackage.C2264.m3682(r14)
        L6f:
            return r2
    }
}
