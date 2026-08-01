package defpackage;

/* JADX INFO: renamed from: ᛶᛳᛵᛸ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
public final class C1037 implements defpackage.InterfaceC0172 {

    /* JADX INFO: renamed from: ᛵᛱᛵᛲ, reason: contains not printable characters */
    public boolean f4610;

    /* JADX INFO: renamed from: ᛷᛲᲇᲈ, reason: contains not printable characters */
    public final defpackage.C1569 f4611;

    /* JADX INFO: renamed from: ᛷᛸᛵᲇ, reason: contains not printable characters */
    public final defpackage.InterfaceC2085 f4612;

    public C1037(defpackage.InterfaceC2085 r1) {
            r0 = this;
            r0.<init>()
            r0.f4612 = r1
            ᛸᲁᛵ r1 = new ᛸᲁᛵ
            r1.<init>()
            r0.f4611 = r1
            return
    }

    @Override // defpackage.InterfaceC2085, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
            r6 = this;
            ᲇᛷᛲᲁ r0 = r6.f4612
            boolean r1 = r6.f4610
            if (r1 != 0) goto L26
            ᛸᲁᛵ r1 = r6.f4611     // Catch: java.lang.Throwable -> L14
            long r2 = r1.f6928     // Catch: java.lang.Throwable -> L14
            r4 = 0
            int r4 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r4 <= 0) goto L16
            r0.mo484(r2, r1)     // Catch: java.lang.Throwable -> L14
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
            r6.f4610 = r0
            if (r1 != 0) goto L25
            goto L26
        L25:
            throw r1
        L26:
            return
    }

    @Override // defpackage.InterfaceC2085, java.io.Flushable
    public final void flush() {
            r5 = this;
            boolean r0 = r5.f4610
            if (r0 != 0) goto L17
            ᛸᲁᛵ r0 = r5.f4611
            long r1 = r0.f6928
            r3 = 0
            int r3 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            ᲇᛷᛲᲁ r5 = r5.f4612
            if (r3 <= 0) goto L13
            r5.mo484(r1, r0)
        L13:
            r5.flush()
            return
        L17:
            java.lang.String r5 = "closed"
            defpackage.C2264.m3676(r5)
            return
    }

    @Override // java.nio.channels.Channel
    public final boolean isOpen() {
            r0 = this;
            boolean r0 = r0.f4610
            r0 = r0 ^ 1
            return r0
    }

    public final java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "buffer("
            r0.<init>(r1)
            ᲇᛷᛲᲁ r2 = r2.f4612
            r0.append(r2)
            r2 = 41
            r0.append(r2)
            java.lang.String r2 = r0.toString()
            return r2
    }

    @Override // java.nio.channels.WritableByteChannel
    public final int write(java.nio.ByteBuffer r2) {
            r1 = this;
            boolean r0 = r1.f4610
            if (r0 != 0) goto Le
            ᛸᲁᛵ r0 = r1.f4611
            int r2 = r0.write(r2)
            r1.m1998()
            return r2
        Le:
            java.lang.String r1 = "closed"
            defpackage.C2264.m3676(r1)
            r1 = 0
            return r1
    }

    /* JADX INFO: renamed from: ᛲᛲᛵ, reason: contains not printable characters */
    public final defpackage.InterfaceC0172 m1996(int r2) {
            r1 = this;
            boolean r0 = r1.f4610
            if (r0 != 0) goto Ld
            ᛸᲁᛵ r0 = r1.f4611
            r0.m2830(r2)
            r1.m1998()
            return r1
        Ld:
            java.lang.String r1 = "closed"
            defpackage.C2264.m3676(r1)
            r1 = 0
            return r1
    }

    /* JADX INFO: renamed from: ᛲᛴᲇᛳ, reason: contains not printable characters */
    public final defpackage.InterfaceC0172 m1997(int r2) {
            r1 = this;
            boolean r0 = r1.f4610
            if (r0 != 0) goto Ld
            ᛸᲁᛵ r0 = r1.f4611
            r0.m2855(r2)
            r1.m1998()
            return r1
        Ld:
            java.lang.String r1 = "closed"
            defpackage.C2264.m3676(r1)
            r1 = 0
            return r1
    }

    @Override // defpackage.InterfaceC2085
    /* JADX INFO: renamed from: ᛴᛸᲈᲈ */
    public final void mo484(long r2, defpackage.C1569 r4) {
            r1 = this;
            boolean r0 = r1.f4610
            if (r0 != 0) goto Ld
            ᛸᲁᛵ r0 = r1.f4611
            r0.mo484(r2, r4)
            r1.m1998()
            return
        Ld:
            java.lang.String r1 = "closed"
            defpackage.C2264.m3676(r1)
            return
    }

    @Override // defpackage.InterfaceC2085
    /* JADX INFO: renamed from: ᛷᛲᲇᲈ */
    public final defpackage.C1077 mo485() {
            r0 = this;
            ᲇᛷᛲᲁ r0 = r0.f4612
            ᛶᛵᛸᛱ r0 = r0.mo485()
            return r0
    }

    /* JADX INFO: renamed from: ᛷᲁᛳᛳ, reason: contains not printable characters */
    public final defpackage.InterfaceC0172 m1998() {
            r8 = this;
            boolean r0 = r8.f4610
            if (r0 != 0) goto L2d
            ᛸᲁᛵ r0 = r8.f4611
            long r1 = r0.f6928
            r3 = 0
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 != 0) goto L10
            r1 = r3
            goto L23
        L10:
            ᲁᲇᛶᛶ r5 = r0.f6929
            ᲁᲇᛶᛶ r5 = r5.f8470
            int r6 = r5.f8466
            r7 = 8192(0x2000, float:1.148E-41)
            if (r6 >= r7) goto L23
            boolean r7 = r5.f8464
            if (r7 == 0) goto L23
            int r5 = r5.f8468
            int r6 = r6 - r5
            long r5 = (long) r6
            long r1 = r1 - r5
        L23:
            int r3 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r3 <= 0) goto L2c
            ᲇᛷᛲᲁ r3 = r8.f4612
            r3.mo484(r1, r0)
        L2c:
            return r8
        L2d:
            java.lang.String r8 = "closed"
            defpackage.C2264.m3676(r8)
            r8 = 0
            return r8
    }

    @Override // defpackage.InterfaceC0172
    /* JADX INFO: renamed from: ᲇᛳᛴᲈ */
    public final defpackage.InterfaceC0172 mo706(java.lang.String r2) {
            r1 = this;
            boolean r0 = r1.f4610
            if (r0 != 0) goto Ld
            ᛸᲁᛵ r0 = r1.f4611
            r0.m2838(r2)
            r1.m1998()
            return r1
        Ld:
            java.lang.String r1 = "closed"
            defpackage.C2264.m3676(r1)
            r1 = 0
            return r1
    }

    /* JADX INFO: renamed from: ᲈᲈᛸᲁ, reason: contains not printable characters */
    public final defpackage.InterfaceC0172 m1999(defpackage.C1128 r2) {
            r1 = this;
            boolean r0 = r1.f4610
            if (r0 != 0) goto Ld
            ᛸᲁᛵ r0 = r1.f4611
            r0.m2849(r2)
            r1.m1998()
            return r1
        Ld:
            java.lang.String r1 = "closed"
            defpackage.C2264.m3676(r1)
            r1 = 0
            return r1
    }
}
