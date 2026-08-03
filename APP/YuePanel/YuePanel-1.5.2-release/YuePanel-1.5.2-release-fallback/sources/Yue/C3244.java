package Yue;

/* JADX INFO: renamed from: Yue.ۥ۠ۥۡۨ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
@Yue.InterfaceC5840({"SMAP\nInflaterSource.kt\nKotlin\n*S Kotlin\n*F\n+ 1 InflaterSource.kt\nokio/InflaterSource\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 Util.kt\nokio/-SegmentedByteString\n*L\n1#1,147:1\n1#2:148\n86#3:149\n*S KotlinDebug\n*F\n+ 1 InflaterSource.kt\nokio/InflaterSource\n*L\n73#1:149\n*E\n"})
public final class C3244 implements Yue.InterfaceC5839 {

    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    @Yue.InterfaceC4418
    public final Yue.InterfaceC0849 f10605;

    /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
    @Yue.InterfaceC4418
    public final java.util.zip.Inflater f10606;

    /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
    public int f10607;

    /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
    public boolean f10608;

    public C3244(@Yue.InterfaceC4418 Yue.InterfaceC0849 r2, @Yue.InterfaceC4418 java.util.zip.Inflater r3) {
            r1 = this;
            java.lang.String r0 = "source"
            Yue.C3329.m13906(r2, r0)
            java.lang.String r0 = "inflater"
            Yue.C3329.m13906(r3, r0)
            r1.<init>()
            r1.f10605 = r2
            r1.f10606 = r3
            return
    }

    public C3244(@Yue.InterfaceC4418 Yue.InterfaceC5839 r2, @Yue.InterfaceC4418 java.util.zip.Inflater r3) {
            r1 = this;
            java.lang.String r0 = "source"
            Yue.C3329.m13906(r2, r0)
            java.lang.String r0 = "inflater"
            Yue.C3329.m13906(r3, r0)
            Yue.ۥۣۣ۟۠ r2 = Yue.C4603.m18380(r2)
            r1.<init>(r2, r3)
            return
    }

    @Override // Yue.InterfaceC5839, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws java.io.IOException {
            r1 = this;
            boolean r0 = r1.f10608
            if (r0 == 0) goto L5
            return
        L5:
            java.util.zip.Inflater r0 = r1.f10606
            r0.end()
            r0 = 1
            r1.f10608 = r0
            Yue.ۥۣۣ۟۠ r0 = r1.f10605
            r0.close()
            return
    }

    @Override // Yue.InterfaceC5839
    @Yue.InterfaceC4418
    /* JADX INFO: renamed from: ۥ */
    public Yue.C6250 mo4177() {
            r1 = this;
            Yue.ۥۣۣ۟۠ r0 = r1.f10605
            Yue.ۥۢۡۤۧ r0 = r0.mo4177()
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    public final long m13670(@Yue.InterfaceC4418 Yue.C0843 r6, long r7) throws java.io.IOException {
            r5 = this;
            java.lang.String r0 = "sink"
            Yue.C3329.m13906(r6, r0)
            r0 = 0
            int r2 = (r7 > r0 ? 1 : (r7 == r0 ? 0 : -1))
            if (r2 < 0) goto L67
            boolean r3 = r5.f10608
            r4 = 1
            r3 = r3 ^ r4
            if (r3 == 0) goto L5b
            if (r2 != 0) goto L14
            return r0
        L14:
            Yue.ۥۡۧۨ r2 = r6.m4892(r4)     // Catch: java.util.zip.DataFormatException -> L43
            int r3 = r2.f20492     // Catch: java.util.zip.DataFormatException -> L43
            int r3 = 8192 - r3
            long r3 = (long) r3     // Catch: java.util.zip.DataFormatException -> L43
            long r7 = java.lang.Math.min(r7, r3)     // Catch: java.util.zip.DataFormatException -> L43
            int r7 = (int) r7     // Catch: java.util.zip.DataFormatException -> L43
            r5.m13671()     // Catch: java.util.zip.DataFormatException -> L43
            java.util.zip.Inflater r8 = r5.f10606     // Catch: java.util.zip.DataFormatException -> L43
            byte[] r3 = r2.f20490     // Catch: java.util.zip.DataFormatException -> L43
            int r4 = r2.f20492     // Catch: java.util.zip.DataFormatException -> L43
            int r7 = r8.inflate(r3, r4, r7)     // Catch: java.util.zip.DataFormatException -> L43
            r5.m13672()     // Catch: java.util.zip.DataFormatException -> L43
            if (r7 <= 0) goto L45
            int r8 = r2.f20492     // Catch: java.util.zip.DataFormatException -> L43
            int r8 = r8 + r7
            r2.f20492 = r8     // Catch: java.util.zip.DataFormatException -> L43
            long r0 = r6.m4889()     // Catch: java.util.zip.DataFormatException -> L43
            long r7 = (long) r7     // Catch: java.util.zip.DataFormatException -> L43
            long r0 = r0 + r7
            r6.m4885(r0)     // Catch: java.util.zip.DataFormatException -> L43
            return r7
        L43:
            r6 = move-exception
            goto L55
        L45:
            int r7 = r2.f20491     // Catch: java.util.zip.DataFormatException -> L43
            int r8 = r2.f20492     // Catch: java.util.zip.DataFormatException -> L43
            if (r7 != r8) goto L54
            Yue.ۥۡۧۨ r7 = r2.m20804()     // Catch: java.util.zip.DataFormatException -> L43
            r6.f2378 = r7     // Catch: java.util.zip.DataFormatException -> L43
            Yue.C5550.m20825(r2)     // Catch: java.util.zip.DataFormatException -> L43
        L54:
            return r0
        L55:
            java.io.IOException r7 = new java.io.IOException
            r7.<init>(r6)
            throw r7
        L5b:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "closed"
            java.lang.String r7 = r7.toString()
            r6.<init>(r7)
            throw r6
        L67:
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r0 = "byteCount < 0: "
            r6.append(r0)
            r6.append(r7)
            java.lang.String r6 = r6.toString()
            java.lang.IllegalArgumentException r7 = new java.lang.IllegalArgumentException
            java.lang.String r6 = r6.toString()
            r7.<init>(r6)
            throw r7
    }

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public final boolean m13671() throws java.io.IOException {
            r5 = this;
            java.util.zip.Inflater r0 = r5.f10606
            boolean r0 = r0.needsInput()
            r1 = 0
            if (r0 != 0) goto La
            return r1
        La:
            Yue.ۥۣۣ۟۠ r0 = r5.f10605
            boolean r0 = r0.mo4827()
            if (r0 == 0) goto L14
            r0 = 1
            return r0
        L14:
            Yue.ۥۣۣ۟۠ r0 = r5.f10605
            Yue.ۥۣ۟ۢۨ r0 = r0.mo4810()
            Yue.ۥۡۧۨ r0 = r0.f2378
            Yue.C3329.m13903(r0)
            int r2 = r0.f20492
            int r3 = r0.f20491
            int r2 = r2 - r3
            r5.f10607 = r2
            java.util.zip.Inflater r4 = r5.f10606
            byte[] r0 = r0.f20490
            r4.setInput(r0, r3, r2)
            return r1
    }

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public final void m13672() {
            r4 = this;
            int r0 = r4.f10607
            if (r0 != 0) goto L5
            return
        L5:
            java.util.zip.Inflater r1 = r4.f10606
            int r1 = r1.getRemaining()
            int r0 = r0 - r1
            int r1 = r4.f10607
            int r1 = r1 - r0
            r4.f10607 = r1
            Yue.ۥۣۣ۟۠ r1 = r4.f10605
            long r2 = (long) r0
            r1.skip(r2)
            return
    }

    @Override // Yue.InterfaceC5839
    /* JADX INFO: renamed from: ۥ۟۟ۢۢ */
    public long mo4179(@Yue.InterfaceC4418 Yue.C0843 r5, long r6) throws java.io.IOException {
            r4 = this;
            java.lang.String r0 = "sink"
            Yue.C3329.m13906(r5, r0)
        L5:
            long r0 = r4.m13670(r5, r6)
            r2 = 0
            int r2 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r2 <= 0) goto L10
            return r0
        L10:
            java.util.zip.Inflater r0 = r4.f10606
            boolean r0 = r0.finished()
            if (r0 != 0) goto L32
            java.util.zip.Inflater r0 = r4.f10606
            boolean r0 = r0.needsDictionary()
            if (r0 == 0) goto L21
            goto L32
        L21:
            Yue.ۥۣۣ۟۠ r0 = r4.f10605
            boolean r0 = r0.mo4827()
            if (r0 != 0) goto L2a
            goto L5
        L2a:
            java.io.EOFException r5 = new java.io.EOFException
            java.lang.String r6 = "source exhausted prematurely"
            r5.<init>(r6)
            throw r5
        L32:
            r5 = -1
            return r5
    }
}
