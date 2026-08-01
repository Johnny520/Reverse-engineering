package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class lg0 implements java.io.Closeable {

    /* JADX INFO: renamed from: κ */
    public static final java.util.logging.Logger f6617 = null;

    /* JADX INFO: renamed from: ε */
    public final p000.InterfaceC1053zc f6618;

    /* JADX INFO: renamed from: ζ */
    public final p000.C0793sc f6619;

    /* JADX INFO: renamed from: η */
    public int f6620;

    /* JADX INFO: renamed from: θ */
    public boolean f6621;

    /* JADX INFO: renamed from: ι */
    public final p000.mf0 f6622;

    static {
            java.lang.Class<vf0> r0 = p000.vf0.class
            java.lang.String r0 = r0.getName()
            java.util.logging.Logger r0 = java.util.logging.Logger.getLogger(r0)
            p000.lg0.f6617 = r0
            return
    }

    public lg0(p000.qk1 r2) {
            r1 = this;
            r2.getClass()
            r1.<init>()
            r1.f6618 = r2
            sc r2 = new sc
            r2.<init>()
            r1.f6619 = r2
            r0 = 16384(0x4000, float:2.2959E-41)
            r1.f6620 = r0
            mf0 r0 = new mf0
            r0.<init>(r2)
            r1.f6622 = r0
            return
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
            r1 = this;
            monitor-enter(r1)
            r0 = 1
            r1.f6621 = r0     // Catch: java.lang.Throwable -> Lb
            zc r0 = r1.f6618     // Catch: java.lang.Throwable -> Lb
            r0.close()     // Catch: java.lang.Throwable -> Lb
            monitor-exit(r1)
            return
        Lb:
            r0 = move-exception
            monitor-exit(r1)
            throw r0
    }

    public final void flush() {
            r2 = this;
            monitor-enter(r2)
            boolean r0 = r2.f6621     // Catch: java.lang.Throwable -> Lc
            if (r0 != 0) goto Le
            zc r0 = r2.f6618     // Catch: java.lang.Throwable -> Lc
            r0.flush()     // Catch: java.lang.Throwable -> Lc
            monitor-exit(r2)
            return
        Lc:
            r0 = move-exception
            goto L16
        Le:
            java.io.IOException r0 = new java.io.IOException     // Catch: java.lang.Throwable -> Lc
            java.lang.String r1 = "closed"
            r0.<init>(r1)     // Catch: java.lang.Throwable -> Lc
            throw r0     // Catch: java.lang.Throwable -> Lc
        L16:
            monitor-exit(r2)
            throw r0
    }

    /* JADX INFO: renamed from: δ */
    public final void m3557(p000.xs1 r6) {
            r5 = this;
            r6.getClass()
            monitor-enter(r5)
            boolean r0 = r5.f6621     // Catch: java.lang.Throwable -> L69
            if (r0 != 0) goto L76
            int r0 = r5.f6620     // Catch: java.lang.Throwable -> L69
            int r1 = r6.f12278     // Catch: java.lang.Throwable -> L69
            r2 = r1 & 32
            if (r2 == 0) goto L15
            int[] r0 = r6.f12279     // Catch: java.lang.Throwable -> L69
            r2 = 5
            r0 = r0[r2]     // Catch: java.lang.Throwable -> L69
        L15:
            r5.f6620 = r0     // Catch: java.lang.Throwable -> L69
            r0 = r1 & 2
            r2 = -1
            r3 = 1
            if (r0 == 0) goto L22
            int[] r0 = r6.f12279     // Catch: java.lang.Throwable -> L69
            r0 = r0[r3]     // Catch: java.lang.Throwable -> L69
            goto L23
        L22:
            r0 = r2
        L23:
            r4 = 0
            if (r0 == r2) goto L6b
            mf0 r0 = r5.f6622     // Catch: java.lang.Throwable -> L69
            r1 = r1 & 2
            if (r1 == 0) goto L30
            int[] r6 = r6.f12279     // Catch: java.lang.Throwable -> L69
            r2 = r6[r3]     // Catch: java.lang.Throwable -> L69
        L30:
            r0.getClass()     // Catch: java.lang.Throwable -> L69
            r6 = 16384(0x4000, float:2.2959E-41)
            int r6 = java.lang.Math.min(r2, r6)     // Catch: java.lang.Throwable -> L69
            int r1 = r0.f7111     // Catch: java.lang.Throwable -> L69
            if (r1 != r6) goto L3e
            goto L6b
        L3e:
            if (r6 >= r1) goto L48
            int r1 = r0.f7109     // Catch: java.lang.Throwable -> L69
            int r1 = java.lang.Math.min(r1, r6)     // Catch: java.lang.Throwable -> L69
            r0.f7109 = r1     // Catch: java.lang.Throwable -> L69
        L48:
            r0.f7110 = r3     // Catch: java.lang.Throwable -> L69
            r0.f7111 = r6     // Catch: java.lang.Throwable -> L69
            int r1 = r0.f7115     // Catch: java.lang.Throwable -> L69
            if (r6 >= r1) goto L6b
            if (r6 != 0) goto L64
            tc0[] r6 = r0.f7112     // Catch: java.lang.Throwable -> L69
            int r1 = r6.length     // Catch: java.lang.Throwable -> L69
            r2 = 0
            p000.AbstractC0312g7.m2244(r4, r1, r2, r6)     // Catch: java.lang.Throwable -> L69
            tc0[] r6 = r0.f7112     // Catch: java.lang.Throwable -> L69
            int r6 = r6.length     // Catch: java.lang.Throwable -> L69
            int r6 = r6 - r3
            r0.f7113 = r6     // Catch: java.lang.Throwable -> L69
            r0.f7114 = r4     // Catch: java.lang.Throwable -> L69
            r0.f7115 = r4     // Catch: java.lang.Throwable -> L69
            goto L6b
        L64:
            int r1 = r1 - r6
            r0.m3817(r1)     // Catch: java.lang.Throwable -> L69
            goto L6b
        L69:
            r6 = move-exception
            goto L7e
        L6b:
            r6 = 4
            r5.m3559(r4, r4, r6, r3)     // Catch: java.lang.Throwable -> L69
            zc r6 = r5.f6618     // Catch: java.lang.Throwable -> L69
            r6.flush()     // Catch: java.lang.Throwable -> L69
            monitor-exit(r5)
            return
        L76:
            java.io.IOException r6 = new java.io.IOException     // Catch: java.lang.Throwable -> L69
            java.lang.String r0 = "closed"
            r6.<init>(r0)     // Catch: java.lang.Throwable -> L69
            throw r6     // Catch: java.lang.Throwable -> L69
        L7e:
            monitor-exit(r5)
            throw r6
    }

    /* JADX INFO: renamed from: η */
    public final void m3558(boolean r3, int r4, p000.C0793sc r5, int r6) {
            r2 = this;
            monitor-enter(r2)
            boolean r0 = r2.f6621     // Catch: java.lang.Throwable -> L1e
            if (r0 != 0) goto L16
            r0 = 0
            r2.m3559(r4, r6, r0, r3)     // Catch: java.lang.Throwable -> L1e
            if (r6 <= 0) goto L14
            zc r3 = r2.f6618     // Catch: java.lang.Throwable -> L1e
            r5.getClass()     // Catch: java.lang.Throwable -> L1e
            long r0 = (long) r6     // Catch: java.lang.Throwable -> L1e
            r3.mo2507(r0, r5)     // Catch: java.lang.Throwable -> L1e
        L14:
            monitor-exit(r2)
            return
        L16:
            java.io.IOException r3 = new java.io.IOException     // Catch: java.lang.Throwable -> L1e
            java.lang.String r4 = "closed"
            r3.<init>(r4)     // Catch: java.lang.Throwable -> L1e
            throw r3     // Catch: java.lang.Throwable -> L1e
        L1e:
            r3 = move-exception
            monitor-exit(r2)
            throw r3
    }

    /* JADX INFO: renamed from: θ */
    public final void m3559(int r3, int r4, int r5, int r6) {
            r2 = this;
            r0 = 8
            if (r5 == r0) goto L16
            java.util.logging.Level r0 = java.util.logging.Level.FINE
            java.util.logging.Logger r1 = p000.lg0.f6617
            boolean r0 = r1.isLoggable(r0)
            if (r0 == 0) goto L16
            r0 = 0
            java.lang.String r0 = p000.vf0.m6215(r0, r3, r4, r5, r6)
            r1.fine(r0)
        L16:
            int r0 = r2.f6620
            if (r4 > r0) goto L55
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r0 & r3
            if (r0 != 0) goto L4b
            byte[] r0 = p000.sd2.f9867
            zc r2 = r2.f6618
            r2.getClass()
            int r0 = r4 >>> 16
            r0 = r0 & 255(0xff, float:3.57E-43)
            r2.writeByte(r0)
            int r0 = r4 >>> 8
            r0 = r0 & 255(0xff, float:3.57E-43)
            r2.writeByte(r0)
            r4 = r4 & 255(0xff, float:3.57E-43)
            r2.writeByte(r4)
            r4 = r5 & 255(0xff, float:3.57E-43)
            r2.writeByte(r4)
            r4 = r6 & 255(0xff, float:3.57E-43)
            r2.writeByte(r4)
            r4 = 2147483647(0x7fffffff, float:NaN)
            r3 = r3 & r4
            r2.writeInt(r3)
            return
        L4b:
            java.lang.String r2 = "reserved bit set: "
            java.lang.String r2 = p000.a12.m17(r2, r3)
            p000.C1080.m7266(r2)
            return
        L55:
            int r2 = r2.f6620
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r5 = "FRAME_SIZE_ERROR length > "
            r3.<init>(r5)
            r3.append(r2)
            java.lang.String r2 = ": "
            r3.append(r2)
            r3.append(r4)
            java.lang.String r2 = r3.toString()
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
            java.lang.String r2 = r2.toString()
            r3.<init>(r2)
            throw r3
    }

    /* JADX INFO: renamed from: κ */
    public final void m3560(int r4, p000.EnumC0816sz r5, byte[] r6) {
            r3 = this;
            monitor-enter(r3)
            boolean r0 = r3.f6621     // Catch: java.lang.Throwable -> L2e
            if (r0 != 0) goto L38
            int r0 = r5.f10094     // Catch: java.lang.Throwable -> L2e
            r1 = -1
            if (r0 == r1) goto L30
            int r0 = r6.length     // Catch: java.lang.Throwable -> L2e
            int r0 = r0 + 8
            r1 = 7
            r2 = 0
            r3.m3559(r2, r0, r1, r2)     // Catch: java.lang.Throwable -> L2e
            zc r0 = r3.f6618     // Catch: java.lang.Throwable -> L2e
            r0.writeInt(r4)     // Catch: java.lang.Throwable -> L2e
            zc r4 = r3.f6618     // Catch: java.lang.Throwable -> L2e
            int r5 = r5.f10094     // Catch: java.lang.Throwable -> L2e
            r4.writeInt(r5)     // Catch: java.lang.Throwable -> L2e
            int r4 = r6.length     // Catch: java.lang.Throwable -> L2e
            if (r4 != 0) goto L22
            goto L27
        L22:
            zc r4 = r3.f6618     // Catch: java.lang.Throwable -> L2e
            r4.write(r6)     // Catch: java.lang.Throwable -> L2e
        L27:
            zc r4 = r3.f6618     // Catch: java.lang.Throwable -> L2e
            r4.flush()     // Catch: java.lang.Throwable -> L2e
            monitor-exit(r3)
            return
        L2e:
            r4 = move-exception
            goto L40
        L30:
            java.lang.String r4 = "errorCode.httpCode == -1"
            java.lang.IllegalArgumentException r5 = new java.lang.IllegalArgumentException     // Catch: java.lang.Throwable -> L2e
            r5.<init>(r4)     // Catch: java.lang.Throwable -> L2e
            throw r5     // Catch: java.lang.Throwable -> L2e
        L38:
            java.io.IOException r4 = new java.io.IOException     // Catch: java.lang.Throwable -> L2e
            java.lang.String r5 = "closed"
            r4.<init>(r5)     // Catch: java.lang.Throwable -> L2e
            throw r4     // Catch: java.lang.Throwable -> L2e
        L40:
            monitor-exit(r3)
            throw r4
    }

    /* JADX INFO: renamed from: λ */
    public final void m3561(boolean r9, int r10, java.util.ArrayList r11) {
            r8 = this;
            monitor-enter(r8)
            boolean r0 = r8.f6621     // Catch: java.lang.Throwable -> L56
            if (r0 != 0) goto L58
            mf0 r0 = r8.f6622     // Catch: java.lang.Throwable -> L56
            r0.m3820(r11)     // Catch: java.lang.Throwable -> L56
            sc r11 = r8.f6619     // Catch: java.lang.Throwable -> L56
            long r0 = r11.f9828     // Catch: java.lang.Throwable -> L56
            int r11 = r8.f6620     // Catch: java.lang.Throwable -> L56
            long r2 = (long) r11     // Catch: java.lang.Throwable -> L56
            long r2 = java.lang.Math.min(r2, r0)     // Catch: java.lang.Throwable -> L56
            int r11 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            r4 = 0
            r5 = 4
            if (r11 != 0) goto L1d
            r6 = r5
            goto L1e
        L1d:
            r6 = r4
        L1e:
            if (r9 == 0) goto L22
            r6 = r6 | 1
        L22:
            int r9 = (int) r2     // Catch: java.lang.Throwable -> L56
            r7 = 1
            r8.m3559(r10, r9, r7, r6)     // Catch: java.lang.Throwable -> L56
            zc r9 = r8.f6618     // Catch: java.lang.Throwable -> L56
            sc r6 = r8.f6619     // Catch: java.lang.Throwable -> L56
            r9.mo2507(r2, r6)     // Catch: java.lang.Throwable -> L56
            if (r11 <= 0) goto L54
            long r0 = r0 - r2
        L31:
            r2 = 0
            int r9 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r9 <= 0) goto L54
            int r9 = r8.f6620     // Catch: java.lang.Throwable -> L56
            long r6 = (long) r9     // Catch: java.lang.Throwable -> L56
            long r6 = java.lang.Math.min(r6, r0)     // Catch: java.lang.Throwable -> L56
            long r0 = r0 - r6
            int r9 = (int) r6     // Catch: java.lang.Throwable -> L56
            int r11 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r11 != 0) goto L46
            r11 = r5
            goto L47
        L46:
            r11 = r4
        L47:
            r2 = 9
            r8.m3559(r10, r9, r2, r11)     // Catch: java.lang.Throwable -> L56
            zc r9 = r8.f6618     // Catch: java.lang.Throwable -> L56
            sc r11 = r8.f6619     // Catch: java.lang.Throwable -> L56
            r9.mo2507(r6, r11)     // Catch: java.lang.Throwable -> L56
            goto L31
        L54:
            monitor-exit(r8)
            return
        L56:
            r9 = move-exception
            goto L60
        L58:
            java.io.IOException r9 = new java.io.IOException     // Catch: java.lang.Throwable -> L56
            java.lang.String r10 = "closed"
            r9.<init>(r10)     // Catch: java.lang.Throwable -> L56
            throw r9     // Catch: java.lang.Throwable -> L56
        L60:
            monitor-exit(r8)
            throw r9
    }

    /* JADX INFO: renamed from: ξ */
    public final void m3562(int r4, int r5, boolean r6) {
            r3 = this;
            monitor-enter(r3)
            boolean r0 = r3.f6621     // Catch: java.lang.Throwable -> L1d
            if (r0 != 0) goto L1f
            r0 = 8
            r1 = 6
            r2 = 0
            r3.m3559(r2, r0, r1, r6)     // Catch: java.lang.Throwable -> L1d
            zc r6 = r3.f6618     // Catch: java.lang.Throwable -> L1d
            r6.writeInt(r4)     // Catch: java.lang.Throwable -> L1d
            zc r4 = r3.f6618     // Catch: java.lang.Throwable -> L1d
            r4.writeInt(r5)     // Catch: java.lang.Throwable -> L1d
            zc r4 = r3.f6618     // Catch: java.lang.Throwable -> L1d
            r4.flush()     // Catch: java.lang.Throwable -> L1d
            monitor-exit(r3)
            return
        L1d:
            r4 = move-exception
            goto L27
        L1f:
            java.io.IOException r4 = new java.io.IOException     // Catch: java.lang.Throwable -> L1d
            java.lang.String r5 = "closed"
            r4.<init>(r5)     // Catch: java.lang.Throwable -> L1d
            throw r4     // Catch: java.lang.Throwable -> L1d
        L27:
            monitor-exit(r3)
            throw r4
    }

    /* JADX INFO: renamed from: ρ */
    public final void m3563(int r4, p000.EnumC0816sz r5) {
            r3 = this;
            monitor-enter(r3)
            boolean r0 = r3.f6621     // Catch: java.lang.Throwable -> L1e
            if (r0 != 0) goto L28
            int r0 = r5.f10094     // Catch: java.lang.Throwable -> L1e
            r1 = -1
            if (r0 == r1) goto L20
            r0 = 3
            r1 = 0
            r2 = 4
            r3.m3559(r4, r2, r0, r1)     // Catch: java.lang.Throwable -> L1e
            zc r4 = r3.f6618     // Catch: java.lang.Throwable -> L1e
            int r5 = r5.f10094     // Catch: java.lang.Throwable -> L1e
            r4.writeInt(r5)     // Catch: java.lang.Throwable -> L1e
            zc r4 = r3.f6618     // Catch: java.lang.Throwable -> L1e
            r4.flush()     // Catch: java.lang.Throwable -> L1e
            monitor-exit(r3)
            return
        L1e:
            r4 = move-exception
            goto L30
        L20:
            java.lang.String r4 = "Failed requirement."
            java.lang.IllegalArgumentException r5 = new java.lang.IllegalArgumentException     // Catch: java.lang.Throwable -> L1e
            r5.<init>(r4)     // Catch: java.lang.Throwable -> L1e
            throw r5     // Catch: java.lang.Throwable -> L1e
        L28:
            java.io.IOException r4 = new java.io.IOException     // Catch: java.lang.Throwable -> L1e
            java.lang.String r5 = "closed"
            r4.<init>(r5)     // Catch: java.lang.Throwable -> L1e
            throw r4     // Catch: java.lang.Throwable -> L1e
        L30:
            monitor-exit(r3)
            throw r4
    }

    /* JADX INFO: renamed from: σ */
    public final void m3564(int r5, long r6) {
            r4 = this;
            java.lang.String r0 = "windowSizeIncrement == 0 || windowSizeIncrement > 0x7fffffffL: "
            monitor-enter(r4)
            boolean r1 = r4.f6621     // Catch: java.lang.Throwable -> L28
            if (r1 != 0) goto L52
            r1 = 0
            int r1 = (r6 > r1 ? 1 : (r6 == r1 ? 0 : -1))
            if (r1 == 0) goto L3c
            r1 = 2147483647(0x7fffffff, double:1.060997895E-314)
            int r1 = (r6 > r1 ? 1 : (r6 == r1 ? 0 : -1))
            if (r1 > 0) goto L3c
            java.util.logging.Logger r0 = p000.lg0.f6617     // Catch: java.lang.Throwable -> L28
            java.util.logging.Level r1 = java.util.logging.Level.FINE     // Catch: java.lang.Throwable -> L28
            boolean r1 = r0.isLoggable(r1)     // Catch: java.lang.Throwable -> L28
            r2 = 4
            r3 = 0
            if (r1 == 0) goto L2a
            java.lang.String r1 = p000.vf0.m6216(r3, r5, r2, r6)     // Catch: java.lang.Throwable -> L28
            r0.fine(r1)     // Catch: java.lang.Throwable -> L28
            goto L2a
        L28:
            r5 = move-exception
            goto L5a
        L2a:
            r0 = 8
            r4.m3559(r5, r2, r0, r3)     // Catch: java.lang.Throwable -> L28
            zc r5 = r4.f6618     // Catch: java.lang.Throwable -> L28
            int r6 = (int) r6     // Catch: java.lang.Throwable -> L28
            r5.writeInt(r6)     // Catch: java.lang.Throwable -> L28
            zc r5 = r4.f6618     // Catch: java.lang.Throwable -> L28
            r5.flush()     // Catch: java.lang.Throwable -> L28
            monitor-exit(r4)
            return
        L3c:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L28
            r5.<init>(r0)     // Catch: java.lang.Throwable -> L28
            r5.append(r6)     // Catch: java.lang.Throwable -> L28
            java.lang.String r5 = r5.toString()     // Catch: java.lang.Throwable -> L28
            java.lang.IllegalArgumentException r6 = new java.lang.IllegalArgumentException     // Catch: java.lang.Throwable -> L28
            java.lang.String r5 = r5.toString()     // Catch: java.lang.Throwable -> L28
            r6.<init>(r5)     // Catch: java.lang.Throwable -> L28
            throw r6     // Catch: java.lang.Throwable -> L28
        L52:
            java.io.IOException r5 = new java.io.IOException     // Catch: java.lang.Throwable -> L28
            java.lang.String r6 = "closed"
            r5.<init>(r6)     // Catch: java.lang.Throwable -> L28
            throw r5     // Catch: java.lang.Throwable -> L28
        L5a:
            monitor-exit(r4)
            throw r5
    }
}
