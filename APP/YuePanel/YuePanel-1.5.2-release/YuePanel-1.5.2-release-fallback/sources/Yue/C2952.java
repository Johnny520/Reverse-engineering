package Yue;

/* JADX INFO: renamed from: Yue.ۥ۠ۤ۠۟, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
@Yue.InterfaceC5840({"SMAP\nGzipSink.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GzipSink.kt\nokio/GzipSink\n+ 2 RealBufferedSink.kt\nokio/RealBufferedSink\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 Util.kt\nokio/-SegmentedByteString\n*L\n1#1,153:1\n51#2:154\n1#3:155\n86#4:156\n*S KotlinDebug\n*F\n+ 1 GzipSink.kt\nokio/GzipSink\n*L\n63#1:154\n131#1:156\n*E\n"})
public final class C2952 implements Yue.InterfaceC5794 {

    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    @Yue.InterfaceC4418
    public final Yue.C5211 f9569;

    /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
    @Yue.InterfaceC4418
    public final java.util.zip.Deflater f9570;

    /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
    @Yue.InterfaceC4418
    public final Yue.C1801 f9571;

    /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
    public boolean f9572;

    /* JADX INFO: renamed from: ۥ۟۟۠ۧ, reason: contains not printable characters */
    @Yue.InterfaceC4418
    public final java.util.zip.CRC32 f9573;

    public C2952(@Yue.InterfaceC4418 Yue.InterfaceC5794 r4) {
            r3 = this;
            java.lang.String r0 = "sink"
            Yue.C3329.m13906(r4, r0)
            r3.<init>()
            Yue.ۥۡۦ۠ۢ r0 = new Yue.ۥۡۦ۠ۢ
            r0.<init>(r4)
            r3.f9569 = r0
            java.util.zip.Deflater r4 = new java.util.zip.Deflater
            r1 = -1
            r2 = 1
            r4.<init>(r1, r2)
            r3.f9570 = r4
            Yue.ۥ۟ۨۧۨ r1 = new Yue.ۥ۟ۨۧۨ
            r1.<init>(r0, r4)
            r3.f9571 = r1
            java.util.zip.CRC32 r4 = new java.util.zip.CRC32
            r4.<init>()
            r3.f9573 = r4
            Yue.ۥۣ۟ۢۨ r4 = r0.f19557
            r0 = 8075(0x1f8b, float:1.1315E-41)
            r4.m4905(r0)
            r0 = 8
            r4.m4898(r0)
            r0 = 0
            r4.m4898(r0)
            r4.m4901(r0)
            r4.m4898(r0)
            r4.m4898(r0)
            return
    }

    @Override // Yue.InterfaceC5794, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws java.io.IOException {
            r2 = this;
            boolean r0 = r2.f9572
            if (r0 == 0) goto L5
            return
        L5:
            Yue.ۥ۟ۨۧۨ r0 = r2.f9571     // Catch: java.lang.Throwable -> Lf
            r0.m8484()     // Catch: java.lang.Throwable -> Lf
            r2.m12568()     // Catch: java.lang.Throwable -> Lf
            r0 = 0
            goto L10
        Lf:
            r0 = move-exception
        L10:
            java.util.zip.Deflater r1 = r2.f9570     // Catch: java.lang.Throwable -> L16
            r1.end()     // Catch: java.lang.Throwable -> L16
            goto L1a
        L16:
            r1 = move-exception
            if (r0 != 0) goto L1a
            r0 = r1
        L1a:
            Yue.ۥۡۦ۠ۢ r1 = r2.f9569     // Catch: java.lang.Throwable -> L20
            r1.close()     // Catch: java.lang.Throwable -> L20
            goto L24
        L20:
            r1 = move-exception
            if (r0 != 0) goto L24
            r0 = r1
        L24:
            r1 = 1
            r2.f9572 = r1
            if (r0 != 0) goto L2a
            return
        L2a:
            throw r0
    }

    @Override // Yue.InterfaceC5794, java.io.Flushable
    public void flush() throws java.io.IOException {
            r1 = this;
            Yue.ۥ۟ۨۧۨ r0 = r1.f9571
            r0.flush()
            return
    }

    @Override // Yue.InterfaceC5794
    @Yue.InterfaceC4418
    /* JADX INFO: renamed from: ۥ */
    public Yue.C6250 mo4174() {
            r1 = this;
            Yue.ۥۡۦ۠ۢ r0 = r1.f9569
            Yue.ۥۢۡۤۧ r0 = r0.mo4174()
            return r0
    }

    @Yue.InterfaceC4418
    @Yue.InterfaceC1816(level = Yue.EnumC1819.f5581, message = "moved to val", replaceWith = @Yue.InterfaceC5313(expression = "deflater", imports = {}))
    @Yue.InterfaceC3421(name = "-deprecated_deflater")
    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    public final java.util.zip.Deflater m12565() {
            r1 = this;
            java.util.zip.Deflater r0 = r1.f9570
            return r0
    }

    @Yue.InterfaceC4418
    @Yue.InterfaceC3421(name = "deflater")
    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public final java.util.zip.Deflater m12566() {
            r1 = this;
            java.util.zip.Deflater r0 = r1.f9570
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public final void m12567(Yue.C0843 r5, long r6) {
            r4 = this;
            Yue.ۥۡۧۨ r5 = r5.f2378
            Yue.C3329.m13903(r5)
        L5:
            r0 = 0
            int r0 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1))
            if (r0 <= 0) goto L27
            int r0 = r5.f20492
            int r1 = r5.f20491
            int r0 = r0 - r1
            long r0 = (long) r0
            long r0 = java.lang.Math.min(r6, r0)
            int r0 = (int) r0
            java.util.zip.CRC32 r1 = r4.f9573
            byte[] r2 = r5.f20490
            int r3 = r5.f20491
            r1.update(r2, r3, r0)
            long r0 = (long) r0
            long r6 = r6 - r0
            Yue.ۥۡۧۨ r5 = r5.f20495
            Yue.C3329.m13903(r5)
            goto L5
        L27:
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public final void m12568() {
            r3 = this;
            Yue.ۥۡۦ۠ۢ r0 = r3.f9569
            java.util.zip.CRC32 r1 = r3.f9573
            long r1 = r1.getValue()
            int r1 = (int) r1
            r0.mo4826(r1)
            Yue.ۥۡۦ۠ۢ r0 = r3.f9569
            java.util.zip.Deflater r1 = r3.f9570
            long r1 = r1.getBytesRead()
            int r1 = (int) r1
            r0.mo4826(r1)
            return
    }

    @Override // Yue.InterfaceC5794
    /* JADX INFO: renamed from: ۥ۟۟۟ۦ */
    public void mo4176(@Yue.InterfaceC4418 Yue.C0843 r3, long r4) throws java.io.IOException {
            r2 = this;
            java.lang.String r0 = "source"
            Yue.C3329.m13906(r3, r0)
            r0 = 0
            int r0 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r0 < 0) goto L17
            if (r0 != 0) goto Le
            return
        Le:
            r2.m12567(r3, r4)
            Yue.ۥ۟ۨۧۨ r0 = r2.f9571
            r0.mo4176(r3, r4)
            return
        L17:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r0 = "byteCount < 0: "
            r3.append(r0)
            r3.append(r4)
            java.lang.String r3 = r3.toString()
            java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
            java.lang.String r3 = r3.toString()
            r4.<init>(r3)
            throw r4
    }
}
