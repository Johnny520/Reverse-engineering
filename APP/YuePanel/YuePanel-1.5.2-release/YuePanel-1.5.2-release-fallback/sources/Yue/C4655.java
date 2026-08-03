package Yue;

/* JADX INFO: renamed from: Yue.ۥۣۡۥ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
@Yue.InterfaceC5840({"SMAP\nJvmOkio.kt\nKotlin\n*S Kotlin\n*F\n+ 1 JvmOkio.kt\nokio/OutputStreamSink\n+ 2 Util.kt\nokio/-SegmentedByteString\n*L\n1#1,239:1\n86#2:240\n*S KotlinDebug\n*F\n+ 1 JvmOkio.kt\nokio/OutputStreamSink\n*L\n55#1:240\n*E\n"})
public final class C4655 implements Yue.InterfaceC5794 {

    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    @Yue.InterfaceC4418
    public final java.io.OutputStream f14831;

    /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
    @Yue.InterfaceC4418
    public final Yue.C6250 f14832;

    public C4655(@Yue.InterfaceC4418 java.io.OutputStream r2, @Yue.InterfaceC4418 Yue.C6250 r3) {
            r1 = this;
            java.lang.String r0 = "out"
            Yue.C3329.m13906(r2, r0)
            java.lang.String r0 = "timeout"
            Yue.C3329.m13906(r3, r0)
            r1.<init>()
            r1.f14831 = r2
            r1.f14832 = r3
            return
    }

    @Override // Yue.InterfaceC5794, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
            r1 = this;
            java.io.OutputStream r0 = r1.f14831
            r0.close()
            return
    }

    @Override // Yue.InterfaceC5794, java.io.Flushable
    public void flush() {
            r1 = this;
            java.io.OutputStream r0 = r1.f14831
            r0.flush()
            return
    }

    @Yue.InterfaceC4418
    public java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "sink("
            r0.append(r1)
            java.io.OutputStream r1 = r2.f14831
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
            Yue.ۥۢۡۤۧ r0 = r1.f14832
            return r0
    }

    @Override // Yue.InterfaceC5794
    /* JADX INFO: renamed from: ۥ۟۟۟ۦ */
    public void mo4176(@Yue.InterfaceC4418 Yue.C0843 r8, long r9) {
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
            if (r0 <= 0) goto L52
            Yue.ۥۢۡۤۧ r0 = r7.f14832
            r0.mo12062()
            Yue.ۥۡۧۨ r0 = r8.f2378
            Yue.C3329.m13903(r0)
            int r1 = r0.f20492
            int r2 = r0.f20491
            int r1 = r1 - r2
            long r1 = (long) r1
            long r1 = java.lang.Math.min(r9, r1)
            int r1 = (int) r1
            java.io.OutputStream r2 = r7.f14831
            byte[] r3 = r0.f20490
            int r4 = r0.f20491
            r2.write(r3, r4, r1)
            int r2 = r0.f20491
            int r2 = r2 + r1
            r0.f20491 = r2
            long r1 = (long) r1
            long r9 = r9 - r1
            long r3 = r8.m4889()
            long r3 = r3 - r1
            r8.m4885(r3)
            int r1 = r0.f20491
            int r2 = r0.f20492
            if (r1 != r2) goto Lf
            Yue.ۥۡۧۨ r1 = r0.m20804()
            r8.f2378 = r1
            Yue.C5550.m20825(r0)
            goto Lf
        L52:
            return
    }
}
