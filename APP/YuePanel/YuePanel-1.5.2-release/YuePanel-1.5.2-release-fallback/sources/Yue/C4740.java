package Yue;

/* JADX INFO: renamed from: Yue.ۥۡۤ۟ۦ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
@Yue.InterfaceC5840({"SMAP\nPeekSource.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PeekSource.kt\nokio/PeekSource\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,74:1\n1#2:75\n*E\n"})
public final class C4740 implements Yue.InterfaceC5839 {

    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    @Yue.InterfaceC4418
    public final Yue.InterfaceC0849 f15039;

    /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
    @Yue.InterfaceC4418
    public final Yue.C0843 f15040;

    /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
    @Yue.InterfaceC4543
    public Yue.C5546 f15041;

    /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
    public int f15042;

    /* JADX INFO: renamed from: ۥ۟۟۠ۧ, reason: contains not printable characters */
    public boolean f15043;

    /* JADX INFO: renamed from: ۥ۟۟۠ۨ, reason: contains not printable characters */
    public long f15044;

    public C4740(@Yue.InterfaceC4418 Yue.InterfaceC0849 r2) {
            r1 = this;
            java.lang.String r0 = "upstream"
            Yue.C3329.m13906(r2, r0)
            r1.<init>()
            r1.f15039 = r2
            Yue.ۥۣ۟ۢۨ r2 = r2.mo4810()
            r1.f15040 = r2
            Yue.ۥۡۧۨ r2 = r2.f2378
            r1.f15041 = r2
            if (r2 == 0) goto L19
            int r2 = r2.f20491
            goto L1a
        L19:
            r2 = -1
        L1a:
            r1.f15042 = r2
            return
    }

    @Override // Yue.InterfaceC5839, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
            r1 = this;
            r0 = 1
            r1.f15043 = r0
            return
    }

    @Override // Yue.InterfaceC5839
    @Yue.InterfaceC4418
    /* JADX INFO: renamed from: ۥ */
    public Yue.C6250 mo4177() {
            r1 = this;
            Yue.ۥۣۣ۟۠ r0 = r1.f15039
            Yue.ۥۢۡۤۧ r0 = r0.mo4177()
            return r0
    }

    @Override // Yue.InterfaceC5839
    /* JADX INFO: renamed from: ۥ۟۟ۢۢ */
    public long mo4179(@Yue.InterfaceC4418 Yue.C0843 r9, long r10) {
            r8 = this;
            java.lang.String r0 = "sink"
            Yue.C3329.m13906(r9, r0)
            r0 = 0
            int r2 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1))
            if (r2 < 0) goto L7f
            boolean r3 = r8.f15043
            r3 = r3 ^ 1
            if (r3 == 0) goto L73
            Yue.ۥۡۧۨ r3 = r8.f15041
            if (r3 == 0) goto L31
            Yue.ۥۣ۟ۢۨ r4 = r8.f15040
            Yue.ۥۡۧۨ r4 = r4.f2378
            if (r3 != r4) goto L25
            int r3 = r8.f15042
            Yue.C3329.m13903(r4)
            int r4 = r4.f20491
            if (r3 != r4) goto L25
            goto L31
        L25:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "Peek source is invalid because upstream source was used"
            java.lang.String r10 = r10.toString()
            r9.<init>(r10)
            throw r9
        L31:
            if (r2 != 0) goto L34
            return r0
        L34:
            Yue.ۥۣۣ۟۠ r0 = r8.f15039
            long r1 = r8.f15044
            r3 = 1
            long r1 = r1 + r3
            boolean r0 = r0.mo4856(r1)
            if (r0 != 0) goto L44
            r9 = -1
            return r9
        L44:
            Yue.ۥۡۧۨ r0 = r8.f15041
            if (r0 != 0) goto L57
            Yue.ۥۣ۟ۢۨ r0 = r8.f15040
            Yue.ۥۡۧۨ r0 = r0.f2378
            if (r0 == 0) goto L57
            r8.f15041 = r0
            Yue.C3329.m13903(r0)
            int r0 = r0.f20491
            r8.f15042 = r0
        L57:
            Yue.ۥۣ۟ۢۨ r0 = r8.f15040
            long r0 = r0.m4889()
            long r2 = r8.f15044
            long r0 = r0 - r2
            long r10 = java.lang.Math.min(r10, r0)
            Yue.ۥۣ۟ۢۨ r2 = r8.f15040
            long r4 = r8.f15044
            r3 = r9
            r6 = r10
            r2.m4825(r3, r4, r6)
            long r0 = r8.f15044
            long r0 = r0 + r10
            r8.f15044 = r0
            return r10
        L73:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "closed"
            java.lang.String r10 = r10.toString()
            r9.<init>(r10)
            throw r9
        L7f:
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            java.lang.String r0 = "byteCount < 0: "
            r9.append(r0)
            r9.append(r10)
            java.lang.String r9 = r9.toString()
            java.lang.IllegalArgumentException r10 = new java.lang.IllegalArgumentException
            java.lang.String r9 = r9.toString()
            r10.<init>(r9)
            throw r10
    }
}
