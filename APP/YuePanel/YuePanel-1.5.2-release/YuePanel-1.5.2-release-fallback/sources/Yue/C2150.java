package Yue;

/* JADX INFO: renamed from: Yue.ۥ۠۠ۨۤ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
@Yue.InterfaceC2303
public final class C2150 extends java.io.OutputStream {

    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    @Yue.InterfaceC4418
    public final java.io.OutputStream f6740;

    /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
    @Yue.InterfaceC4418
    public final Yue.C0724 f6741;

    /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
    public boolean f6742;

    /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
    public int f6743;

    /* JADX INFO: renamed from: ۥ۟۟۠ۧ, reason: contains not printable characters */
    @Yue.InterfaceC4418
    public final byte[] f6744;

    /* JADX INFO: renamed from: ۥ۟۟۠ۨ, reason: contains not printable characters */
    @Yue.InterfaceC4418
    public final byte[] f6745;

    /* JADX INFO: renamed from: ۥ۟۟ۡ, reason: contains not printable characters */
    public int f6746;

    public C2150(@Yue.InterfaceC4418 java.io.OutputStream r2, @Yue.InterfaceC4418 Yue.C0724 r3) {
            r1 = this;
            java.lang.String r0 = "output"
            Yue.C3329.m13906(r2, r0)
            java.lang.String r0 = "base64"
            Yue.C3329.m13906(r3, r0)
            r1.<init>()
            r1.f6740 = r2
            r1.f6741 = r3
            boolean r2 = r3.m4511()
            if (r2 == 0) goto L1a
            r2 = 76
            goto L1b
        L1a:
            r2 = -1
        L1b:
            r1.f6743 = r2
            r2 = 1024(0x400, float:1.435E-42)
            byte[] r2 = new byte[r2]
            r1.f6744 = r2
            r2 = 3
            byte[] r2 = new byte[r2]
            r1.f6745 = r2
            return
    }

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
            r1 = this;
            boolean r0 = r1.f6742
            if (r0 != 0) goto L13
            r0 = 1
            r1.f6742 = r0
            int r0 = r1.f6746
            if (r0 == 0) goto Le
            r1.m10088()
        Le:
            java.io.OutputStream r0 = r1.f6740
            r0.close()
        L13:
            return
    }

    @Override // java.io.OutputStream, java.io.Flushable
    public void flush() {
            r1 = this;
            r1.m10086()
            java.io.OutputStream r0 = r1.f6740
            r0.flush()
            return
    }

    @Override // java.io.OutputStream
    public void write(int r4) {
            r3 = this;
            r3.m10086()
            byte[] r0 = r3.f6745
            int r1 = r3.f6746
            int r2 = r1 + 1
            r3.f6746 = r2
            byte r4 = (byte) r4
            r0[r1] = r4
            r4 = 3
            if (r2 != r4) goto L14
            r3.m10088()
        L14:
            return
    }

    @Override // java.io.OutputStream
    public void write(@Yue.InterfaceC4418 byte[] r5, int r6, int r7) {
            r4 = this;
            java.lang.String r0 = "source"
            Yue.C3329.m13906(r5, r0)
            r4.m10086()
            if (r6 < 0) goto L6d
            if (r7 < 0) goto L6d
            int r0 = r6 + r7
            int r1 = r5.length
            if (r0 > r1) goto L6d
            if (r7 != 0) goto L14
            return
        L14:
            int r7 = r4.f6746
            java.lang.String r1 = "Check failed."
            r2 = 3
            if (r7 >= r2) goto L63
            if (r7 == 0) goto L27
            int r7 = r4.m10087(r5, r6, r0)
            int r6 = r6 + r7
            int r7 = r4.f6746
            if (r7 == 0) goto L27
            return
        L27:
            int r7 = r6 + 3
            if (r7 > r0) goto L59
            Yue.ۥ۟ۢۥ r7 = r4.f6741
            boolean r7 = r7.m4511()
            if (r7 == 0) goto L36
            int r7 = r4.f6743
            goto L39
        L36:
            byte[] r7 = r4.f6744
            int r7 = r7.length
        L39:
            int r7 = r7 / 4
            int r3 = r0 - r6
            int r3 = r3 / r2
            int r7 = java.lang.Math.min(r7, r3)
            int r3 = r7 * 3
            int r3 = r3 + r6
            int r6 = r4.m10089(r5, r6, r3)
            int r7 = r7 * 4
            if (r6 != r7) goto L4f
            r6 = r3
            goto L27
        L4f:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = r1.toString()
            r5.<init>(r6)
            throw r5
        L59:
            byte[] r7 = r4.f6745
            r1 = 0
            Yue.C0586.m2170(r5, r7, r1, r6, r0)
            int r0 = r0 - r6
            r4.f6746 = r0
            return
        L63:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = r1.toString()
            r5.<init>(r6)
            throw r5
        L6d:
            java.lang.IndexOutOfBoundsException r0 = new java.lang.IndexOutOfBoundsException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "offset: "
            r1.append(r2)
            r1.append(r6)
            java.lang.String r6 = ", length: "
            r1.append(r6)
            r1.append(r7)
            java.lang.String r6 = ", source size: "
            r1.append(r6)
            int r5 = r5.length
            r1.append(r5)
            java.lang.String r5 = r1.toString()
            r0.<init>(r5)
            throw r0
    }

    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    public final void m10086() {
            r2 = this;
            boolean r0 = r2.f6742
            if (r0 != 0) goto L5
            return
        L5:
            java.io.IOException r0 = new java.io.IOException
            java.lang.String r1 = "The output stream is closed."
            r0.<init>(r1)
            throw r0
    }

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public final int m10087(byte[] r5, int r6, int r7) {
            r4 = this;
            int r0 = r4.f6746
            r1 = 3
            int r0 = 3 - r0
            int r7 = r7 - r6
            int r7 = java.lang.Math.min(r0, r7)
            byte[] r0 = r4.f6745
            int r2 = r4.f6746
            int r3 = r6 + r7
            Yue.C0586.m2170(r5, r0, r2, r6, r3)
            int r5 = r4.f6746
            int r5 = r5 + r7
            r4.f6746 = r5
            if (r5 != r1) goto L1d
            r4.m10088()
        L1d:
            return r7
    }

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public final void m10088() {
            r3 = this;
            byte[] r0 = r3.f6745
            int r1 = r3.f6746
            r2 = 0
            int r0 = r3.m10089(r0, r2, r1)
            r1 = 4
            if (r0 != r1) goto Lf
            r3.f6746 = r2
            return
        Lf:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "Check failed."
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public final int m10089(byte[] r7, int r8, int r9) {
            r6 = this;
            Yue.ۥ۟ۢۥ r0 = r6.f6741
            byte[] r2 = r6.f6744
            r3 = 0
            r1 = r7
            r4 = r8
            r5 = r9
            int r7 = r0.m4504(r1, r2, r3, r4, r5)
            int r8 = r6.f6743
            if (r8 != 0) goto L2e
            java.io.OutputStream r8 = r6.f6740
            Yue.ۥ۟ۢۥ$ۥ r9 = Yue.C0724.f1995
            byte[] r9 = r9.m4515()
            r8.write(r9)
            r8 = 76
            r6.f6743 = r8
            if (r7 > r8) goto L22
            goto L2e
        L22:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "Check failed."
            java.lang.String r8 = r8.toString()
            r7.<init>(r8)
            throw r7
        L2e:
            java.io.OutputStream r8 = r6.f6740
            byte[] r9 = r6.f6744
            r0 = 0
            r8.write(r9, r0, r7)
            int r8 = r6.f6743
            int r8 = r8 - r7
            r6.f6743 = r8
            return r7
    }
}
