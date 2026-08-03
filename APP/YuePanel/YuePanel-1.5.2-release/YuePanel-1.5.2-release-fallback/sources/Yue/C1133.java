package Yue;

/* JADX INFO: renamed from: Yue.ۥ۟ۤۦۢ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
@Yue.InterfaceC5840({"SMAP\nCipherSource.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CipherSource.kt\nokio/CipherSource\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,120:1\n1#2:121\n*E\n"})
public final class C1133 implements Yue.InterfaceC5839 {

    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    @Yue.InterfaceC4418
    public final Yue.InterfaceC0849 f3372;

    /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
    @Yue.InterfaceC4418
    public final javax.crypto.Cipher f3373;

    /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
    public final int f3374;

    /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
    @Yue.InterfaceC4418
    public final Yue.C0843 f3375;

    /* JADX INFO: renamed from: ۥ۟۟۠ۧ, reason: contains not printable characters */
    public boolean f3376;

    /* JADX INFO: renamed from: ۥ۟۟۠ۨ, reason: contains not printable characters */
    public boolean f3377;

    public C1133(@Yue.InterfaceC4418 Yue.InterfaceC0849 r2, @Yue.InterfaceC4418 javax.crypto.Cipher r3) {
            r1 = this;
            java.lang.String r0 = "source"
            Yue.C3329.m13906(r2, r0)
            java.lang.String r0 = "cipher"
            Yue.C3329.m13906(r3, r0)
            r1.<init>()
            r1.f3372 = r2
            r1.f3373 = r3
            int r2 = r3.getBlockSize()
            r1.f3374 = r2
            Yue.ۥۣ۟ۢۨ r0 = new Yue.ۥۣ۟ۢۨ
            r0.<init>()
            r1.f3375 = r0
            if (r2 <= 0) goto L21
            return
        L21:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r0 = "Block cipher required "
            r2.append(r0)
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
            java.lang.String r2 = r2.toString()
            r3.<init>(r2)
            throw r3
    }

    @Override // Yue.InterfaceC5839, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws java.io.IOException {
            r1 = this;
            r0 = 1
            r1.f3377 = r0
            Yue.ۥۣۣ۟۠ r0 = r1.f3372
            r0.close()
            return
    }

    @Override // Yue.InterfaceC5839
    @Yue.InterfaceC4418
    /* JADX INFO: renamed from: ۥ */
    public Yue.C6250 mo4177() {
            r1 = this;
            Yue.ۥۣۣ۟۠ r0 = r1.f3372
            Yue.ۥۢۡۤۧ r0 = r0.mo4177()
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    public final void m5945() {
            r7 = this;
            javax.crypto.Cipher r0 = r7.f3373
            r1 = 0
            int r0 = r0.getOutputSize(r1)
            if (r0 != 0) goto La
            return
        La:
            Yue.ۥۣ۟ۢۨ r1 = r7.f3375
            Yue.ۥۡۧۨ r0 = r1.m4892(r0)
            javax.crypto.Cipher r1 = r7.f3373
            byte[] r2 = r0.f20490
            int r3 = r0.f20491
            int r1 = r1.doFinal(r2, r3)
            int r2 = r0.f20492
            int r2 = r2 + r1
            r0.f20492 = r2
            Yue.ۥۣ۟ۢۨ r2 = r7.f3375
            long r3 = r2.m4889()
            long r5 = (long) r1
            long r3 = r3 + r5
            r2.m4885(r3)
            int r1 = r0.f20491
            int r2 = r0.f20492
            if (r1 != r2) goto L3b
            Yue.ۥۣ۟ۢۨ r1 = r7.f3375
            Yue.ۥۡۧۨ r2 = r0.m20804()
            r1.f2378 = r2
            Yue.C5550.m20825(r0)
        L3b:
            return
    }

    @Yue.InterfaceC4418
    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public final javax.crypto.Cipher m5946() {
            r1 = this;
            javax.crypto.Cipher r0 = r1.f3373
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public final void m5947() {
            r4 = this;
        L0:
            Yue.ۥۣ۟ۢۨ r0 = r4.f3375
            long r0 = r0.m4889()
            r2 = 0
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 != 0) goto L23
            boolean r0 = r4.f3376
            if (r0 != 0) goto L23
            Yue.ۥۣۣ۟۠ r0 = r4.f3372
            boolean r0 = r0.mo4827()
            if (r0 == 0) goto L1f
            r0 = 1
            r4.f3376 = r0
            r4.m5945()
            goto L23
        L1f:
            r4.m5948()
            goto L0
        L23:
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public final void m5948() {
            r9 = this;
            Yue.ۥۣۣ۟۠ r0 = r9.f3372
            Yue.ۥۣ۟ۢۨ r0 = r0.mo4810()
            Yue.ۥۡۧۨ r0 = r0.f2378
            Yue.C3329.m13903(r0)
            int r1 = r0.f20492
            int r2 = r0.f20491
            int r1 = r1 - r2
            javax.crypto.Cipher r2 = r9.f3373
            int r2 = r2.getOutputSize(r1)
        L16:
            r3 = 8192(0x2000, float:1.148E-41)
            if (r2 <= r3) goto L40
            int r2 = r9.f3374
            if (r1 > r2) goto L38
            r0 = 1
            r9.f3376 = r0
            Yue.ۥۣ۟ۢۨ r0 = r9.f3375
            javax.crypto.Cipher r1 = r9.f3373
            Yue.ۥۣۣ۟۠ r2 = r9.f3372
            byte[] r2 = r2.mo4823()
            byte[] r1 = r1.doFinal(r2)
            java.lang.String r2 = "doFinal(...)"
            Yue.C3329.m13905(r1, r2)
            r0.m4896(r1)
            return
        L38:
            int r1 = r1 - r2
            javax.crypto.Cipher r2 = r9.f3373
            int r2 = r2.getOutputSize(r1)
            goto L16
        L40:
            Yue.ۥۣ۟ۢۨ r3 = r9.f3375
            Yue.ۥۡۧۨ r2 = r3.m4892(r2)
            javax.crypto.Cipher r3 = r9.f3373
            byte[] r4 = r0.f20490
            int r5 = r0.f20491
            byte[] r7 = r2.f20490
            int r8 = r2.f20491
            r6 = r1
            int r0 = r3.update(r4, r5, r6, r7, r8)
            Yue.ۥۣۣ۟۠ r3 = r9.f3372
            long r4 = (long) r1
            r3.skip(r4)
            int r1 = r2.f20492
            int r1 = r1 + r0
            r2.f20492 = r1
            Yue.ۥۣ۟ۢۨ r1 = r9.f3375
            long r3 = r1.m4889()
            long r5 = (long) r0
            long r3 = r3 + r5
            r1.m4885(r3)
            int r0 = r2.f20491
            int r1 = r2.f20492
            if (r0 != r1) goto L7c
            Yue.ۥۣ۟ۢۨ r0 = r9.f3375
            Yue.ۥۡۧۨ r1 = r2.m20804()
            r0.f2378 = r1
            Yue.C5550.m20825(r2)
        L7c:
            return
    }

    @Override // Yue.InterfaceC5839
    /* JADX INFO: renamed from: ۥ۟۟ۢۢ */
    public long mo4179(@Yue.InterfaceC4418 Yue.C0843 r5, long r6) throws java.io.IOException {
            r4 = this;
            java.lang.String r0 = "sink"
            Yue.C3329.m13906(r5, r0)
            r0 = 0
            int r2 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1))
            if (r2 < 0) goto L2a
            boolean r3 = r4.f3377
            r3 = r3 ^ 1
            if (r3 == 0) goto L1e
            if (r2 != 0) goto L14
            return r0
        L14:
            r4.m5947()
            Yue.ۥۣ۟ۢۨ r0 = r4.f3375
            long r5 = r0.mo4179(r5, r6)
            return r5
        L1e:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "closed"
            java.lang.String r6 = r6.toString()
            r5.<init>(r6)
            throw r5
        L2a:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r0 = "byteCount < 0: "
            r5.append(r0)
            r5.append(r6)
            java.lang.String r5 = r5.toString()
            java.lang.IllegalArgumentException r6 = new java.lang.IllegalArgumentException
            java.lang.String r5 = r5.toString()
            r6.<init>(r5)
            throw r6
    }
}
