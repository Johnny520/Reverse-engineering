package Yue;

/* JADX INFO: renamed from: Yue.ۥ۟ۤۦۡ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
@Yue.InterfaceC5840({"SMAP\nCipherSink.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CipherSink.kt\nokio/CipherSink\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 Util.kt\nokio/-SegmentedByteString\n*L\n1#1,148:1\n1#2:149\n86#3:150\n*S KotlinDebug\n*F\n+ 1 CipherSink.kt\nokio/CipherSink\n*L\n47#1:150\n*E\n"})
public final class C1132 implements Yue.InterfaceC5794 {

    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    @Yue.InterfaceC4418
    public final Yue.InterfaceC0848 f3368;

    /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
    @Yue.InterfaceC4418
    public final javax.crypto.Cipher f3369;

    /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
    public final int f3370;

    /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
    public boolean f3371;

    public C1132(@Yue.InterfaceC4418 Yue.InterfaceC0848 r2, @Yue.InterfaceC4418 javax.crypto.Cipher r3) {
            r1 = this;
            java.lang.String r0 = "sink"
            Yue.C3329.m13906(r2, r0)
            java.lang.String r0 = "cipher"
            Yue.C3329.m13906(r3, r0)
            r1.<init>()
            r1.f3368 = r2
            r1.f3369 = r3
            int r2 = r3.getBlockSize()
            r1.f3370 = r2
            if (r2 <= 0) goto L1a
            return
        L1a:
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

    @Override // Yue.InterfaceC5794, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws java.io.IOException {
            r2 = this;
            boolean r0 = r2.f3371
            if (r0 == 0) goto L5
            return
        L5:
            r0 = 1
            r2.f3371 = r0
            java.lang.Throwable r0 = r2.m5942()
            Yue.ۥۣۣ۟۟ r1 = r2.f3368     // Catch: java.lang.Throwable -> L12
            r1.close()     // Catch: java.lang.Throwable -> L12
            goto L16
        L12:
            r1 = move-exception
            if (r0 != 0) goto L16
            r0 = r1
        L16:
            if (r0 != 0) goto L19
            return
        L19:
            throw r0
    }

    @Override // Yue.InterfaceC5794, java.io.Flushable
    public void flush() {
            r1 = this;
            Yue.ۥۣۣ۟۟ r0 = r1.f3368
            r0.flush()
            return
    }

    @Override // Yue.InterfaceC5794
    @Yue.InterfaceC4418
    /* JADX INFO: renamed from: ۥ */
    public Yue.C6250 mo4174() {
            r1 = this;
            Yue.ۥۣۣ۟۟ r0 = r1.f3368
            Yue.ۥۢۡۤۧ r0 = r0.mo4174()
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    public final java.lang.Throwable m5942() {
            r8 = this;
            javax.crypto.Cipher r0 = r8.f3369
            r1 = 0
            int r0 = r0.getOutputSize(r1)
            r1 = 0
            if (r0 != 0) goto Lb
            return r1
        Lb:
            r2 = 8192(0x2000, float:1.148E-41)
            if (r0 <= r2) goto L22
            Yue.ۥۣۣ۟۟ r0 = r8.f3368     // Catch: java.lang.Throwable -> L20
            javax.crypto.Cipher r2 = r8.f3369     // Catch: java.lang.Throwable -> L20
            byte[] r2 = r2.doFinal()     // Catch: java.lang.Throwable -> L20
            java.lang.String r3 = "doFinal(...)"
            Yue.C3329.m13905(r2, r3)     // Catch: java.lang.Throwable -> L20
            r0.write(r2)     // Catch: java.lang.Throwable -> L20
            return r1
        L20:
            r0 = move-exception
            return r0
        L22:
            Yue.ۥۣۣ۟۟ r2 = r8.f3368
            Yue.ۥۣ۟ۢۨ r2 = r2.mo4810()
            Yue.ۥۡۧۨ r0 = r2.m4892(r0)
            javax.crypto.Cipher r3 = r8.f3369     // Catch: java.lang.Throwable -> L45
            byte[] r4 = r0.f20490     // Catch: java.lang.Throwable -> L45
            int r5 = r0.f20492     // Catch: java.lang.Throwable -> L45
            int r3 = r3.doFinal(r4, r5)     // Catch: java.lang.Throwable -> L45
            int r4 = r0.f20492     // Catch: java.lang.Throwable -> L45
            int r4 = r4 + r3
            r0.f20492 = r4     // Catch: java.lang.Throwable -> L45
            long r4 = r2.m4889()     // Catch: java.lang.Throwable -> L45
            long r6 = (long) r3     // Catch: java.lang.Throwable -> L45
            long r4 = r4 + r6
            r2.m4885(r4)     // Catch: java.lang.Throwable -> L45
            goto L46
        L45:
            r1 = move-exception
        L46:
            int r3 = r0.f20491
            int r4 = r0.f20492
            if (r3 != r4) goto L55
            Yue.ۥۡۧۨ r3 = r0.m20804()
            r2.f2378 = r3
            Yue.C5550.m20825(r0)
        L55:
            return r1
    }

    @Yue.InterfaceC4418
    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public final javax.crypto.Cipher m5943() {
            r1 = this;
            javax.crypto.Cipher r0 = r1.f3369
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public final int m5944(Yue.C0843 r11, long r12) {
            r10 = this;
            Yue.ۥۡۧۨ r0 = r11.f2378
            Yue.C3329.m13903(r0)
            int r1 = r0.f20492
            int r2 = r0.f20491
            int r1 = r1 - r2
            long r1 = (long) r1
            long r1 = java.lang.Math.min(r12, r1)
            int r1 = (int) r1
            Yue.ۥۣۣ۟۟ r2 = r10.f3368
            Yue.ۥۣ۟ۢۨ r2 = r2.mo4810()
            javax.crypto.Cipher r3 = r10.f3369
            int r3 = r3.getOutputSize(r1)
        L1c:
            r4 = 8192(0x2000, float:1.148E-41)
            if (r3 <= r4) goto L42
            int r3 = r10.f3370
            if (r1 > r3) goto L3a
            Yue.ۥۣۣ۟۟ r0 = r10.f3368
            javax.crypto.Cipher r1 = r10.f3369
            byte[] r11 = r11.mo4866(r12)
            byte[] r11 = r1.update(r11)
            java.lang.String r1 = "update(...)"
            Yue.C3329.m13905(r11, r1)
            r0.write(r11)
            int r11 = (int) r12
            return r11
        L3a:
            int r1 = r1 - r3
            javax.crypto.Cipher r3 = r10.f3369
            int r3 = r3.getOutputSize(r1)
            goto L1c
        L42:
            Yue.ۥۡۧۨ r12 = r2.m4892(r3)
            javax.crypto.Cipher r4 = r10.f3369
            byte[] r5 = r0.f20490
            int r6 = r0.f20491
            byte[] r8 = r12.f20490
            int r9 = r12.f20492
            r7 = r1
            int r13 = r4.update(r5, r6, r7, r8, r9)
            int r3 = r12.f20492
            int r3 = r3 + r13
            r12.f20492 = r3
            long r3 = r2.m4889()
            long r5 = (long) r13
            long r3 = r3 + r5
            r2.m4885(r3)
            int r13 = r12.f20491
            int r3 = r12.f20492
            if (r13 != r3) goto L72
            Yue.ۥۡۧۨ r13 = r12.m20804()
            r2.f2378 = r13
            Yue.C5550.m20825(r12)
        L72:
            Yue.ۥۣۣ۟۟ r12 = r10.f3368
            r12.mo4837()
            long r12 = r11.m4889()
            long r2 = (long) r1
            long r12 = r12 - r2
            r11.m4885(r12)
            int r12 = r0.f20491
            int r12 = r12 + r1
            r0.f20491 = r12
            int r13 = r0.f20492
            if (r12 != r13) goto L92
            Yue.ۥۡۧۨ r12 = r0.m20804()
            r11.f2378 = r12
            Yue.C5550.m20825(r0)
        L92:
            return r1
    }

    @Override // Yue.InterfaceC5794
    /* JADX INFO: renamed from: ۥ۟۟۟ۦ */
    public void mo4176(@Yue.InterfaceC4418 Yue.C0843 r8, long r9) throws java.io.IOException {
            r7 = this;
            java.lang.String r0 = "source"
            Yue.C3329.m13906(r8, r0)
            long r1 = r8.m4889()
            r3 = 0
            r5 = r9
            Yue.C0018.m264(r1, r3, r5)
            boolean r0 = r7.f3371
            r0 = r0 ^ 1
            if (r0 == 0) goto L23
        L15:
            r0 = 0
            int r0 = (r9 > r0 ? 1 : (r9 == r0 ? 0 : -1))
            if (r0 <= 0) goto L22
            int r0 = r7.m5944(r8, r9)
            long r0 = (long) r0
            long r9 = r9 - r0
            goto L15
        L22:
            return
        L23:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "closed"
            java.lang.String r9 = r9.toString()
            r8.<init>(r9)
            throw r8
    }
}
