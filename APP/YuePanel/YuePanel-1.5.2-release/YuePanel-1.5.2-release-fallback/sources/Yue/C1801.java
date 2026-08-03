package Yue;

/* JADX INFO: renamed from: Yue.ۥ۟ۨۧۨ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
@Yue.InterfaceC5840({"SMAP\nDeflaterSink.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DeflaterSink.kt\nokio/DeflaterSink\n+ 2 Util.kt\nokio/-SegmentedByteString\n*L\n1#1,163:1\n86#2:164\n*S KotlinDebug\n*F\n+ 1 DeflaterSink.kt\nokio/DeflaterSink\n*L\n58#1:164\n*E\n"})
public final class C1801 implements Yue.InterfaceC5794 {

    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    @Yue.InterfaceC4418
    public final Yue.InterfaceC0848 f5531;

    /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
    @Yue.InterfaceC4418
    public final java.util.zip.Deflater f5532;

    /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
    public boolean f5533;

    public C1801(@Yue.InterfaceC4418 Yue.InterfaceC0848 r2, @Yue.InterfaceC4418 java.util.zip.Deflater r3) {
            r1 = this;
            java.lang.String r0 = "sink"
            Yue.C3329.m13906(r2, r0)
            java.lang.String r0 = "deflater"
            Yue.C3329.m13906(r3, r0)
            r1.<init>()
            r1.f5531 = r2
            r1.f5532 = r3
            return
    }

    public C1801(@Yue.InterfaceC4418 Yue.InterfaceC5794 r2, @Yue.InterfaceC4418 java.util.zip.Deflater r3) {
            r1 = this;
            java.lang.String r0 = "sink"
            Yue.C3329.m13906(r2, r0)
            java.lang.String r0 = "deflater"
            Yue.C3329.m13906(r3, r0)
            Yue.ۥۣۣ۟۟ r2 = Yue.C4603.m18379(r2)
            r1.<init>(r2, r3)
            return
    }

    @Override // Yue.InterfaceC5794, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws java.io.IOException {
            r2 = this;
            boolean r0 = r2.f5533
            if (r0 == 0) goto L5
            return
        L5:
            r2.m8484()     // Catch: java.lang.Throwable -> La
            r0 = 0
            goto Lb
        La:
            r0 = move-exception
        Lb:
            java.util.zip.Deflater r1 = r2.f5532     // Catch: java.lang.Throwable -> L11
            r1.end()     // Catch: java.lang.Throwable -> L11
            goto L15
        L11:
            r1 = move-exception
            if (r0 != 0) goto L15
            r0 = r1
        L15:
            Yue.ۥۣۣ۟۟ r1 = r2.f5531     // Catch: java.lang.Throwable -> L1b
            r1.close()     // Catch: java.lang.Throwable -> L1b
            goto L1f
        L1b:
            r1 = move-exception
            if (r0 != 0) goto L1f
            r0 = r1
        L1f:
            r1 = 1
            r2.f5533 = r1
            if (r0 != 0) goto L25
            return
        L25:
            throw r0
    }

    @Override // Yue.InterfaceC5794, java.io.Flushable
    public void flush() throws java.io.IOException {
            r1 = this;
            r0 = 1
            r1.m8483(r0)
            Yue.ۥۣۣ۟۟ r0 = r1.f5531
            r0.flush()
            return
    }

    @Yue.InterfaceC4418
    public java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "DeflaterSink("
            r0.append(r1)
            Yue.ۥۣۣ۟۟ r1 = r2.f5531
            r0.append(r1)
            r1 = 41
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }

    @Override // Yue.InterfaceC5794
    @Yue.InterfaceC4418
    /* JADX INFO: renamed from: ۥ */
    public Yue.C6250 mo4174() {
            r1 = this;
            Yue.ۥۣۣ۟۟ r0 = r1.f5531
            Yue.ۥۢۡۤۧ r0 = r0.mo4174()
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    public final void m8483(boolean r8) {
            r7 = this;
            Yue.ۥۣۣ۟۟ r0 = r7.f5531
            Yue.ۥۣ۟ۢۨ r0 = r0.mo4810()
        L6:
            r1 = 1
            Yue.ۥۡۧۨ r1 = r0.m4892(r1)
            if (r8 == 0) goto L1d
            java.util.zip.Deflater r2 = r7.f5532     // Catch: java.lang.NullPointerException -> L1b
            byte[] r3 = r1.f20490     // Catch: java.lang.NullPointerException -> L1b
            int r4 = r1.f20492     // Catch: java.lang.NullPointerException -> L1b
            int r5 = 8192 - r4
            r6 = 2
            int r2 = r2.deflate(r3, r4, r5, r6)     // Catch: java.lang.NullPointerException -> L1b
            goto L29
        L1b:
            r8 = move-exception
            goto L57
        L1d:
            java.util.zip.Deflater r2 = r7.f5532     // Catch: java.lang.NullPointerException -> L1b
            byte[] r3 = r1.f20490     // Catch: java.lang.NullPointerException -> L1b
            int r4 = r1.f20492     // Catch: java.lang.NullPointerException -> L1b
            int r5 = 8192 - r4
            int r2 = r2.deflate(r3, r4, r5)     // Catch: java.lang.NullPointerException -> L1b
        L29:
            if (r2 <= 0) goto L3f
            int r3 = r1.f20492
            int r3 = r3 + r2
            r1.f20492 = r3
            long r3 = r0.m4889()
            long r1 = (long) r2
            long r3 = r3 + r1
            r0.m4885(r3)
            Yue.ۥۣۣ۟۟ r1 = r7.f5531
            r1.mo4837()
            goto L6
        L3f:
            java.util.zip.Deflater r2 = r7.f5532
            boolean r2 = r2.needsInput()
            if (r2 == 0) goto L6
            int r8 = r1.f20491
            int r2 = r1.f20492
            if (r8 != r2) goto L56
            Yue.ۥۡۧۨ r8 = r1.m20804()
            r0.f2378 = r8
            Yue.C5550.m20825(r1)
        L56:
            return
        L57:
            java.io.IOException r0 = new java.io.IOException
            java.lang.String r1 = "Deflater already closed"
            r0.<init>(r1, r8)
            throw r0
    }

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public final void m8484() {
            r1 = this;
            java.util.zip.Deflater r0 = r1.f5532
            r0.finish()
            r0 = 0
            r1.m8483(r0)
            return
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
        Lf:
            r0 = 0
            int r0 = (r9 > r0 ? 1 : (r9 == r0 ? 0 : -1))
            if (r0 <= 0) goto L4f
            Yue.ۥۡۧۨ r0 = r8.f2378
            Yue.C3329.m13903(r0)
            int r1 = r0.f20492
            int r2 = r0.f20491
            int r1 = r1 - r2
            long r1 = (long) r1
            long r1 = java.lang.Math.min(r9, r1)
            int r1 = (int) r1
            java.util.zip.Deflater r2 = r7.f5532
            byte[] r3 = r0.f20490
            int r4 = r0.f20491
            r2.setInput(r3, r4, r1)
            r2 = 0
            r7.m8483(r2)
            long r2 = r8.m4889()
            long r4 = (long) r1
            long r2 = r2 - r4
            r8.m4885(r2)
            int r2 = r0.f20491
            int r2 = r2 + r1
            r0.f20491 = r2
            int r1 = r0.f20492
            if (r2 != r1) goto L4d
            Yue.ۥۡۧۨ r1 = r0.m20804()
            r8.f2378 = r1
            Yue.C5550.m20825(r0)
        L4d:
            long r9 = r9 - r4
            goto Lf
        L4f:
            return
    }
}
