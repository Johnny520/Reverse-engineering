package Yue;

/* JADX INFO: renamed from: Yue.ۥ۟ۦۣ۠, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public final class C1415 {

    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    @Yue.InterfaceC3417
    @Yue.InterfaceC4543
    public final java.lang.Object f4513;

    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    @Yue.InterfaceC3417
    @Yue.InterfaceC4543
    public final Yue.AbstractC0928 f4514;

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    @Yue.InterfaceC3417
    @Yue.InterfaceC4543
    public final Yue.InterfaceC2825<java.lang.Throwable, Yue.C6593> f4515;

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    @Yue.InterfaceC3417
    @Yue.InterfaceC4543
    public final java.lang.Object f4516;

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    @Yue.InterfaceC3417
    @Yue.InterfaceC4543
    public final java.lang.Throwable f4517;

    public C1415(@Yue.InterfaceC4543 java.lang.Object r1, @Yue.InterfaceC4543 Yue.AbstractC0928 r2, @Yue.InterfaceC4543 Yue.InterfaceC2825<? super java.lang.Throwable, Yue.C6593> r3, @Yue.InterfaceC4543 java.lang.Object r4, @Yue.InterfaceC4543 java.lang.Throwable r5) {
            r0 = this;
            r0.<init>()
            r0.f4513 = r1
            r0.f4514 = r2
            r0.f4515 = r3
            r0.f4516 = r4
            r0.f4517 = r5
            return
    }

    public /* synthetic */ C1415(java.lang.Object r8, Yue.AbstractC0928 r9, Yue.InterfaceC2825 r10, java.lang.Object r11, java.lang.Throwable r12, int r13, Yue.C1769 r14) {
            r7 = this;
            r14 = r13 & 2
            r0 = 0
            if (r14 == 0) goto L7
            r3 = r0
            goto L8
        L7:
            r3 = r9
        L8:
            r9 = r13 & 4
            if (r9 == 0) goto Le
            r4 = r0
            goto Lf
        Le:
            r4 = r10
        Lf:
            r9 = r13 & 8
            if (r9 == 0) goto L15
            r5 = r0
            goto L16
        L15:
            r5 = r11
        L16:
            r9 = r13 & 16
            if (r9 == 0) goto L1c
            r6 = r0
            goto L1d
        L1c:
            r6 = r12
        L1d:
            r1 = r7
            r2 = r8
            r1.<init>(r2, r3, r4, r5, r6)
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public static /* synthetic */ Yue.C1415 m7032(Yue.C1415 r3, java.lang.Object r4, Yue.AbstractC0928 r5, Yue.InterfaceC2825 r6, java.lang.Object r7, java.lang.Throwable r8, int r9, java.lang.Object r10) {
            r10 = r9 & 1
            if (r10 == 0) goto L6
            java.lang.Object r4 = r3.f4513
        L6:
            r10 = r9 & 2
            if (r10 == 0) goto Lc
            Yue.ۥۣ۟ۧۦ r5 = r3.f4514
        Lc:
            r10 = r5
            r5 = r9 & 4
            if (r5 == 0) goto L13
            Yue.ۥۣ۠ۡ۟<java.lang.Throwable, Yue.ۥۣۢ۠ۤ> r6 = r3.f4515
        L13:
            r0 = r6
            r5 = r9 & 8
            if (r5 == 0) goto L1a
            java.lang.Object r7 = r3.f4516
        L1a:
            r1 = r7
            r5 = r9 & 16
            if (r5 == 0) goto L21
            java.lang.Throwable r8 = r3.f4517
        L21:
            r2 = r8
            r5 = r3
            r6 = r4
            r7 = r10
            r8 = r0
            r9 = r1
            r10 = r2
            Yue.ۥ۟ۦۣ۠ r3 = r5.m7038(r6, r7, r8, r9, r10)
            return r3
    }

    public boolean equals(@Yue.InterfaceC4543 java.lang.Object r5) {
            r4 = this;
            r0 = 1
            if (r4 != r5) goto L4
            return r0
        L4:
            boolean r1 = r5 instanceof Yue.C1415
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            Yue.ۥ۟ۦۣ۠ r5 = (Yue.C1415) r5
            java.lang.Object r1 = r4.f4513
            java.lang.Object r3 = r5.f4513
            boolean r1 = Yue.C3329.m13897(r1, r3)
            if (r1 != 0) goto L17
            return r2
        L17:
            Yue.ۥۣ۟ۧۦ r1 = r4.f4514
            Yue.ۥۣ۟ۧۦ r3 = r5.f4514
            boolean r1 = Yue.C3329.m13897(r1, r3)
            if (r1 != 0) goto L22
            return r2
        L22:
            Yue.ۥۣ۠ۡ۟<java.lang.Throwable, Yue.ۥۣۢ۠ۤ> r1 = r4.f4515
            Yue.ۥۣ۠ۡ۟<java.lang.Throwable, Yue.ۥۣۢ۠ۤ> r3 = r5.f4515
            boolean r1 = Yue.C3329.m13897(r1, r3)
            if (r1 != 0) goto L2d
            return r2
        L2d:
            java.lang.Object r1 = r4.f4516
            java.lang.Object r3 = r5.f4516
            boolean r1 = Yue.C3329.m13897(r1, r3)
            if (r1 != 0) goto L38
            return r2
        L38:
            java.lang.Throwable r1 = r4.f4517
            java.lang.Throwable r5 = r5.f4517
            boolean r5 = Yue.C3329.m13897(r1, r5)
            if (r5 != 0) goto L43
            return r2
        L43:
            return r0
    }

    public int hashCode() {
            r3 = this;
            java.lang.Object r0 = r3.f4513
            r1 = 0
            if (r0 != 0) goto L7
            r0 = r1
            goto Lb
        L7:
            int r0 = r0.hashCode()
        Lb:
            int r0 = r0 * 31
            Yue.ۥۣ۟ۧۦ r2 = r3.f4514
            if (r2 != 0) goto L13
            r2 = r1
            goto L17
        L13:
            int r2 = r2.hashCode()
        L17:
            int r0 = r0 + r2
            int r0 = r0 * 31
            Yue.ۥۣ۠ۡ۟<java.lang.Throwable, Yue.ۥۣۢ۠ۤ> r2 = r3.f4515
            if (r2 != 0) goto L20
            r2 = r1
            goto L24
        L20:
            int r2 = r2.hashCode()
        L24:
            int r0 = r0 + r2
            int r0 = r0 * 31
            java.lang.Object r2 = r3.f4516
            if (r2 != 0) goto L2d
            r2 = r1
            goto L31
        L2d:
            int r2 = r2.hashCode()
        L31:
            int r0 = r0 + r2
            int r0 = r0 * 31
            java.lang.Throwable r2 = r3.f4517
            if (r2 != 0) goto L39
            goto L3d
        L39:
            int r1 = r2.hashCode()
        L3d:
            int r0 = r0 + r1
            return r0
    }

    @Yue.InterfaceC4418
    public java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "CompletedContinuation(result="
            r0.append(r1)
            java.lang.Object r1 = r2.f4513
            r0.append(r1)
            java.lang.String r1 = ", cancelHandler="
            r0.append(r1)
            Yue.ۥۣ۟ۧۦ r1 = r2.f4514
            r0.append(r1)
            java.lang.String r1 = ", onCancellation="
            r0.append(r1)
            Yue.ۥۣ۠ۡ۟<java.lang.Throwable, Yue.ۥۣۢ۠ۤ> r1 = r2.f4515
            r0.append(r1)
            java.lang.String r1 = ", idempotentResume="
            r0.append(r1)
            java.lang.Object r1 = r2.f4516
            r0.append(r1)
            java.lang.String r1 = ", cancelCause="
            r0.append(r1)
            java.lang.Throwable r1 = r2.f4517
            r0.append(r1)
            r1 = 41
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }

    @Yue.InterfaceC4543
    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public final java.lang.Object m7033() {
            r1 = this;
            java.lang.Object r0 = r1.f4513
            return r0
    }

    @Yue.InterfaceC4543
    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    public final Yue.AbstractC0928 m7034() {
            r1 = this;
            Yue.ۥۣ۟ۧۦ r0 = r1.f4514
            return r0
    }

    @Yue.InterfaceC4543
    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public final Yue.InterfaceC2825<java.lang.Throwable, Yue.C6593> m7035() {
            r1 = this;
            Yue.ۥۣ۠ۡ۟<java.lang.Throwable, Yue.ۥۣۢ۠ۤ> r0 = r1.f4515
            return r0
    }

    @Yue.InterfaceC4543
    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public final java.lang.Object m7036() {
            r1 = this;
            java.lang.Object r0 = r1.f4516
            return r0
    }

    @Yue.InterfaceC4543
    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public final java.lang.Throwable m7037() {
            r1 = this;
            java.lang.Throwable r0 = r1.f4517
            return r0
    }

    @Yue.InterfaceC4418
    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public final Yue.C1415 m7038(@Yue.InterfaceC4543 java.lang.Object r8, @Yue.InterfaceC4543 Yue.AbstractC0928 r9, @Yue.InterfaceC4543 Yue.InterfaceC2825<? super java.lang.Throwable, Yue.C6593> r10, @Yue.InterfaceC4543 java.lang.Object r11, @Yue.InterfaceC4543 java.lang.Throwable r12) {
            r7 = this;
            Yue.ۥ۟ۦۣ۠ r6 = new Yue.ۥ۟ۦۣ۠
            r0 = r6
            r1 = r8
            r2 = r9
            r3 = r10
            r4 = r11
            r5 = r12
            r0.<init>(r1, r2, r3, r4, r5)
            return r6
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public final boolean m7039() {
            r1 = this;
            java.lang.Throwable r0 = r1.f4517
            if (r0 == 0) goto L6
            r0 = 1
            goto L7
        L6:
            r0 = 0
        L7:
            return r0
    }

    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public final void m7040(@Yue.InterfaceC4418 Yue.C0934<?> r2, @Yue.InterfaceC4418 java.lang.Throwable r3) {
            r1 = this;
            Yue.ۥۣ۟ۧۦ r0 = r1.f4514
            if (r0 == 0) goto L7
            r2.m5320(r0, r3)
        L7:
            Yue.ۥۣ۠ۡ۟<java.lang.Throwable, Yue.ۥۣۢ۠ۤ> r0 = r1.f4515
            if (r0 == 0) goto Le
            r2.m5323(r0, r3)
        Le:
            return
    }
}
