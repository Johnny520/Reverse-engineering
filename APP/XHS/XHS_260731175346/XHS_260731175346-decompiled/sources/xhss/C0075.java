package xhss;

/* JADX INFO: renamed from: xhss.ᛱᛸᛵᛱ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-684deb5fba33a691397d1324861b0a91cfdff049bb058f400176b68a1f4afccc */
/* JADX INFO: loaded from: classes.dex */
public final class C0075 implements xhss.InterfaceC1135 {

    /* JADX INFO: renamed from: ᛱᛱᛲᲇ, reason: contains not printable characters */
    public final xhss.InterfaceC0102 f407;

    /* JADX INFO: renamed from: ᛳᲁᲇᛸ, reason: contains not printable characters */
    public final xhss.C0338 f408;

    /* JADX INFO: renamed from: ᲇᛴᲇᛵ, reason: contains not printable characters */
    public boolean f409;

    public C0075(xhss.InterfaceC0102 r1) {
            r0 = this;
            r0.<init>()
            r0.f407 = r1
            xhss.ᛴᛲᛴᛶ r1 = new xhss.ᛴᛲᛴᛶ
            r1.<init>()
            r0.f408 = r1
            return
    }

    @Override // xhss.InterfaceC0102, java.io.Closeable, java.lang.AutoCloseable, java.nio.channels.Channel
    public final void close() {
            r6 = this;
            xhss.ᛱᲁᛷᲁ r0 = r6.f407
            boolean r1 = r6.f409
            if (r1 != 0) goto L26
            xhss.ᛴᛲᛴᛶ r1 = r6.f408     // Catch: java.lang.Throwable -> L14
            long r2 = r1.f1261     // Catch: java.lang.Throwable -> L14
            r4 = 0
            int r4 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r4 <= 0) goto L16
            r0.mo228(r2, r1)     // Catch: java.lang.Throwable -> L14
            goto L16
        L14:
            r1 = move-exception
            goto L17
        L16:
            r1 = 0
        L17:
            r0.close()     // Catch: java.lang.Throwable -> L1b
            goto L1f
        L1b:
            r0 = move-exception
            if (r1 != 0) goto L1f
            r1 = r0
        L1f:
            r0 = 1
            r6.f409 = r0
            if (r1 != 0) goto L25
            goto L26
        L25:
            throw r1
        L26:
            return
    }

    @Override // xhss.InterfaceC0102, java.io.Flushable
    public final void flush() {
            r5 = this;
            boolean r0 = r5.f409
            if (r0 != 0) goto L17
            xhss.ᛴᛲᛴᛶ r0 = r5.f408
            long r1 = r0.f1261
            r3 = 0
            int r3 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            xhss.ᛱᲁᛷᲁ r5 = r5.f407
            if (r3 <= 0) goto L13
            r5.mo228(r1, r0)
        L13:
            r5.flush()
            return
        L17:
            java.lang.String r5 = "closed"
            xhss.C0532.m950(r5)
            return
    }

    @Override // java.nio.channels.Channel
    public final boolean isOpen() {
            r0 = this;
            boolean r0 = r0.f409
            r0 = r0 ^ 1
            return r0
    }

    public final java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "buffer("
            r0.<init>(r1)
            xhss.ᛱᲁᛷᲁ r2 = r2.f407
            r0.append(r2)
            r2 = 41
            r0.append(r2)
            java.lang.String r2 = r0.toString()
            return r2
    }

    @Override // java.nio.channels.WritableByteChannel
    public final int write(java.nio.ByteBuffer r2) {
            r1 = this;
            boolean r0 = r1.f409
            if (r0 != 0) goto Le
            xhss.ᛴᛲᛴᛶ r0 = r1.f408
            int r2 = r0.write(r2)
            r1.m226()
            return r2
        Le:
            java.lang.String r1 = "closed"
            xhss.C0532.m950(r1)
            r1 = 0
            return r1
    }

    /* JADX INFO: renamed from: ᛱᛱᛲᲇ, reason: contains not printable characters */
    public final xhss.InterfaceC1135 m226() {
            r8 = this;
            boolean r0 = r8.f409
            if (r0 != 0) goto L2d
            xhss.ᛴᛲᛴᛶ r0 = r8.f408
            long r1 = r0.f1261
            r3 = 0
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 != 0) goto L10
            r1 = r3
            goto L23
        L10:
            xhss.ᛲᛳᲁᛳ r5 = r0.f1260
            xhss.ᛲᛳᲁᛳ r5 = r5.f623
            int r6 = r5.f620
            r7 = 8192(0x2000, float:1.148E-41)
            if (r6 >= r7) goto L23
            boolean r7 = r5.f621
            if (r7 == 0) goto L23
            int r5 = r5.f619
            int r6 = r6 - r5
            long r5 = (long) r6
            long r1 = r1 - r5
        L23:
            int r3 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r3 <= 0) goto L2c
            xhss.ᛱᲁᛷᲁ r3 = r8.f407
            r3.mo228(r1, r0)
        L2c:
            return r8
        L2d:
            java.lang.String r8 = "closed"
            xhss.C0532.m950(r8)
            r8 = 0
            return r8
    }

    /* JADX INFO: renamed from: ᛳᲁᲇᛸ, reason: contains not printable characters */
    public final xhss.InterfaceC1135 m227(int r2) {
            r1 = this;
            boolean r0 = r1.f409
            if (r0 != 0) goto Ld
            xhss.ᛴᛲᛴᛶ r0 = r1.f408
            r0.m701(r2)
            r1.m226()
            return r1
        Ld:
            java.lang.String r1 = "closed"
            xhss.C0532.m950(r1)
            r1 = 0
            return r1
    }

    @Override // xhss.InterfaceC0102
    /* JADX INFO: renamed from: ᛷᛴᛷᛱ, reason: contains not printable characters */
    public final void mo228(long r2, xhss.C0338 r4) {
            r1 = this;
            boolean r0 = r1.f409
            if (r0 != 0) goto Ld
            xhss.ᛴᛲᛴᛶ r0 = r1.f408
            r0.mo228(r2, r4)
            r1.m226()
            return
        Ld:
            java.lang.String r1 = "closed"
            xhss.C0532.m950(r1)
            return
    }

    @Override // xhss.InterfaceC0102
    /* JADX INFO: renamed from: ᛷᛵᛵᲈ, reason: contains not printable characters */
    public final xhss.C0213 mo229() {
            r0 = this;
            xhss.ᛱᲁᛷᲁ r0 = r0.f407
            xhss.ᛲᲁᲈᛲ r0 = r0.mo229()
            return r0
    }

    @Override // xhss.InterfaceC1135
    /* JADX INFO: renamed from: ᛸᛷᲈᲈ, reason: contains not printable characters */
    public final xhss.InterfaceC1135 mo230(java.lang.String r2) {
            r1 = this;
            boolean r0 = r1.f409
            if (r0 != 0) goto Ld
            xhss.ᛴᛲᛴᛶ r0 = r1.f408
            r0.m686(r2)
            r1.m226()
            return r1
        Ld:
            java.lang.String r1 = "closed"
            xhss.C0532.m950(r1)
            r1 = 0
            return r1
    }

    /* JADX INFO: renamed from: ᲇᛴᲇᛵ, reason: contains not printable characters */
    public final xhss.InterfaceC1135 m231(int r2) {
            r1 = this;
            boolean r0 = r1.f409
            if (r0 != 0) goto Ld
            xhss.ᛴᛲᛴᛶ r0 = r1.f408
            r0.m685(r2)
            r1.m226()
            return r1
        Ld:
            java.lang.String r1 = "closed"
            xhss.C0532.m950(r1)
            r1 = 0
            return r1
    }
}
