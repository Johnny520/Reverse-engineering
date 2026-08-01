package xhss;

/* JADX INFO: renamed from: xhss.ᲀᲈᲈ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-684deb5fba33a691397d1324861b0a91cfdff049bb058f400176b68a1f4afccc */
/* JADX INFO: loaded from: classes.dex */
public final class C0920 extends java.io.InputStream {

    /* JADX INFO: renamed from: ᛱᛱᛲᲇ, reason: contains not printable characters */
    public final /* synthetic */ int f2965;

    /* JADX INFO: renamed from: ᛳᲁᲇᛸ, reason: contains not printable characters */
    public final /* synthetic */ xhss.InterfaceC0870 f2966;

    public /* synthetic */ C0920(xhss.InterfaceC0870 r1, int r2) {
            r0 = this;
            r0.f2965 = r2
            r0.f2966 = r1
            r0.<init>()
            return
    }

    /* JADX INFO: renamed from: ᛱᛱᛲᲇ, reason: contains not printable characters */
    private final void m1513() {
            r0 = this;
            return
    }

    @Override // java.io.InputStream
    public final int available() {
            r5 = this;
            int r0 = r5.f2965
            r1 = 2147483647(0x7fffffff, double:1.060997895E-314)
            xhss.ᲀᛶᛷᛳ r5 = r5.f2966
            switch(r0) {
                case 0: goto L21;
                default: goto La;
            }
        La:
            xhss.ᲁᛸᛵᛳ r5 = (xhss.C0976) r5
            boolean r0 = r5.f3179
            if (r0 != 0) goto L1a
            xhss.ᛴᛲᛴᛶ r5 = r5.f3178
            long r3 = r5.f1261
            long r0 = java.lang.Math.min(r3, r1)
            int r5 = (int) r0
            goto L20
        L1a:
            java.lang.String r5 = "closed"
            xhss.C0532.m947(r5)
            r5 = 0
        L20:
            return r5
        L21:
            xhss.ᛴᛲᛴᛶ r5 = (xhss.C0338) r5
            long r3 = r5.f1261
            long r0 = java.lang.Math.min(r3, r1)
            int r5 = (int) r0
            return r5
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
            r1 = this;
            int r0 = r1.f2965
            switch(r0) {
                case 0: goto Lc;
                default: goto L5;
            }
        L5:
            xhss.ᲀᛶᛷᛳ r1 = r1.f2966
            xhss.ᲁᛸᛵᛳ r1 = (xhss.C0976) r1
            r1.close()
        Lc:
            return
    }

    @Override // java.io.InputStream
    public final int read() {
            r6 = this;
            int r0 = r6.f2965
            r1 = -1
            r2 = 0
            xhss.ᲀᛶᛷᛳ r6 = r6.f2966
            switch(r0) {
                case 0: goto L35;
                default: goto La;
            }
        La:
            xhss.ᲁᛸᛵᛳ r6 = (xhss.C0976) r6
            xhss.ᛴᛲᛴᛶ r0 = r6.f3178
            boolean r4 = r6.f3179
            if (r4 != 0) goto L2e
            long r4 = r0.f1261
            int r2 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r2 != 0) goto L27
            xhss.ᲇᲁᲀᲇ r6 = r6.f3177
            r2 = 8192(0x2000, double:4.0474E-320)
            long r2 = r6.mo235(r2, r0)
            r4 = -1
            int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r6 != 0) goto L27
            goto L34
        L27:
            byte r6 = r0.m703()
            r1 = r6 & 255(0xff, float:3.57E-43)
            goto L34
        L2e:
            java.lang.String r6 = "closed"
            xhss.C0532.m947(r6)
            r1 = 0
        L34:
            return r1
        L35:
            xhss.ᛴᛲᛴᛶ r6 = (xhss.C0338) r6
            long r4 = r6.f1261
            int r0 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r0 <= 0) goto L43
            byte r6 = r6.m703()
            r1 = r6 & 255(0xff, float:3.57E-43)
        L43:
            return r1
    }

    @Override // java.io.InputStream
    public final int read(byte[] r9, int r10, int r11) {
            r8 = this;
            int r0 = r8.f2965
            xhss.ᲀᛶᛷᛳ r8 = r8.f2966
            switch(r0) {
                case 0: goto L3a;
                default: goto L7;
            }
        L7:
            xhss.ᲁᛸᛵᛳ r8 = (xhss.C0976) r8
            xhss.ᛴᛲᛴᛶ r0 = r8.f3178
            boolean r1 = r8.f3179
            if (r1 != 0) goto L33
            int r1 = r9.length
            long r2 = (long) r1
            long r4 = (long) r10
            long r6 = (long) r11
            xhss.AbstractC0694.m1210(r2, r4, r6)
            long r1 = r0.f1261
            r3 = 0
            int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r1 != 0) goto L2e
            xhss.ᲇᲁᲀᲇ r8 = r8.f3177
            r1 = 8192(0x2000, double:4.0474E-320)
            long r1 = r8.mo235(r1, r0)
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
            xhss.C0532.m947(r8)
            r8 = 0
        L39:
            return r8
        L3a:
            xhss.ᛴᛲᛴᛶ r8 = (xhss.C0338) r8
            int r8 = r8.read(r9, r10, r11)
            return r8
    }

    public final java.lang.String toString() {
            r2 = this;
            int r0 = r2.f2965
            java.lang.String r1 = ".inputStream()"
            xhss.ᲀᛶᛷᛳ r2 = r2.f2966
            switch(r0) {
                case 0: goto L1b;
                default: goto L9;
            }
        L9:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            xhss.ᲁᛸᛵᛳ r2 = (xhss.C0976) r2
            r0.append(r2)
            r0.append(r1)
            java.lang.String r2 = r0.toString()
            return r2
        L1b:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            xhss.ᛴᛲᛴᛶ r2 = (xhss.C0338) r2
            r0.append(r2)
            r0.append(r1)
            java.lang.String r2 = r0.toString()
            return r2
    }

    @Override // java.io.InputStream
    public long transferTo(java.io.OutputStream r15) {
            r14 = this;
            int r0 = r14.f2965
            switch(r0) {
                case 1: goto La;
                default: goto L5;
            }
        L5:
            long r14 = super.transferTo(r15)
            return r14
        La:
            xhss.ᲀᛶᛷᛳ r14 = r14.f2966
            xhss.ᲁᛸᛵᛳ r14 = (xhss.C0976) r14
            xhss.ᛴᛲᛴᛶ r0 = r14.f3178
            boolean r1 = r14.f3179
            r2 = 0
            if (r1 != 0) goto L6a
            r4 = r2
        L17:
            long r6 = r0.f1261
            int r1 = (r6 > r2 ? 1 : (r6 == r2 ? 0 : -1))
            if (r1 != 0) goto L2e
            xhss.ᲇᲁᲀᲇ r1 = r14.f3177
            r6 = 8192(0x2000, double:4.0474E-320)
            long r6 = r1.mo235(r6, r0)
            r8 = -1
            int r1 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r1 == 0) goto L2c
            goto L2e
        L2c:
            r2 = r4
            goto L6f
        L2e:
            long r6 = r0.f1261
            long r4 = r4 + r6
            r8 = 0
            r10 = r6
            xhss.AbstractC0694.m1210(r6, r8, r10)
            xhss.ᛲᛳᲁᛳ r1 = r0.f1260
        L39:
            int r8 = (r6 > r2 ? 1 : (r6 == r2 ? 0 : -1))
            if (r8 <= 0) goto L17
            int r8 = r1.f620
            int r9 = r1.f619
            int r8 = r8 - r9
            long r8 = (long) r8
            long r8 = java.lang.Math.min(r6, r8)
            int r8 = (int) r8
            byte[] r9 = r1.f622
            int r10 = r1.f619
            r15.write(r9, r10, r8)
            int r9 = r1.f619
            int r9 = r9 + r8
            r1.f619 = r9
            long r10 = r0.f1261
            long r12 = (long) r8
            long r10 = r10 - r12
            r0.f1261 = r10
            long r6 = r6 - r12
            int r8 = r1.f620
            if (r9 != r8) goto L39
            xhss.ᛲᛳᲁᛳ r8 = r1.m391()
            r0.f1260 = r8
            xhss.AbstractC0185.m445(r1)
            r1 = r8
            goto L39
        L6a:
            java.lang.String r14 = "closed"
            xhss.C0532.m947(r14)
        L6f:
            return r2
    }
}
