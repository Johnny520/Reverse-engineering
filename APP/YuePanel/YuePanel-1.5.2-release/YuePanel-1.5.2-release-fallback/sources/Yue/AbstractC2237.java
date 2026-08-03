package Yue;

/* JADX INFO: renamed from: Yue.ۥ۠ۡۡ۠, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC2237 extends Yue.AbstractC1643 {

    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    public long f6910;

    /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
    public boolean f6911;

    /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
    @Yue.InterfaceC4543
    public Yue.C0575<Yue.AbstractC1874<?>> f6912;

    public AbstractC2237() {
            r0 = this;
            r0.<init>()
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟ۧ۠, reason: contains not printable characters */
    public static /* synthetic */ void m10251(Yue.AbstractC2237 r0, boolean r1, int r2, java.lang.Object r3) {
            if (r3 != 0) goto Lb
            r2 = r2 & 1
            if (r2 == 0) goto L7
            r1 = 0
        L7:
            r0.m10254(r1)
            return
        Lb:
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            java.lang.String r1 = "Super calls with default arguments not supported in this target, function: decrementUseCount"
            r0.<init>(r1)
            throw r0
    }

    /* JADX INFO: renamed from: ۥ۟۟ۧۥ, reason: contains not printable characters */
    public static /* synthetic */ void m10252(Yue.AbstractC2237 r0, boolean r1, int r2, java.lang.Object r3) {
            if (r3 != 0) goto Lb
            r2 = r2 & 1
            if (r2 == 0) goto L7
            r1 = 0
        L7:
            r0.m10258(r1)
            return
        Lb:
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            java.lang.String r1 = "Super calls with default arguments not supported in this target, function: incrementUseCount"
            r0.<init>(r1)
            throw r0
    }

    @Override // Yue.AbstractC1643
    @Yue.InterfaceC4418
    public final Yue.AbstractC1643 limitedParallelism(int r1) {
            r0 = this;
            Yue.C3590.m14525(r1)
            return r0
    }

    public void shutdown() {
            r0 = this;
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public final boolean m10253() {
            r4 = this;
            long r0 = r4.f6910
            r2 = 0
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 <= 0) goto La
            r0 = 1
            goto Lb
        La:
            r0 = 0
        Lb:
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟ۧ۟, reason: contains not printable characters */
    public final void m10254(boolean r5) {
            r4 = this;
            long r0 = r4.f6910
            long r2 = r4.m10255(r5)
            long r0 = r0 - r2
            r4.f6910 = r0
            r2 = 0
            int r5 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r5 <= 0) goto L10
            return
        L10:
            boolean r5 = r4.f6911
            if (r5 == 0) goto L17
            r4.shutdown()
        L17:
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟ۧۡ, reason: contains not printable characters */
    public final long m10255(boolean r3) {
            r2 = this;
            if (r3 == 0) goto L8
            r0 = 4294967296(0x100000000, double:2.121995791E-314)
            goto La
        L8:
            r0 = 1
        La:
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟ۧۢ, reason: contains not printable characters */
    public final void m10256(@Yue.InterfaceC4418 Yue.AbstractC1874<?> r2) {
            r1 = this;
            Yue.ۥ۟ۡۨۢ<Yue.ۥ۠۟ۢۢ<?>> r0 = r1.f6912
            if (r0 != 0) goto Lb
            Yue.ۥ۟ۡۨۢ r0 = new Yue.ۥ۟ۡۨۢ
            r0.<init>()
            r1.f6912 = r0
        Lb:
            r0.m2048(r2)
            return
    }

    /* JADX INFO: renamed from: ۥۣ۟۟ۧ, reason: contains not printable characters */
    public long mo10257() {
            r3 = this;
            Yue.ۥ۟ۡۨۢ<Yue.ۥ۠۟ۢۢ<?>> r0 = r3.f6912
            r1 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            if (r0 != 0) goto La
            return r1
        La:
            boolean r0 = r0.m2051()
            if (r0 == 0) goto L11
            goto L13
        L11:
            r1 = 0
        L13:
            return r1
    }

    /* JADX INFO: renamed from: ۥ۟۟ۧۤ, reason: contains not printable characters */
    public final void m10258(boolean r5) {
            r4 = this;
            long r0 = r4.f6910
            long r2 = r4.m10255(r5)
            long r0 = r0 + r2
            r4.f6910 = r0
            if (r5 != 0) goto Le
            r5 = 1
            r4.f6911 = r5
        Le:
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟ۧۦ, reason: contains not printable characters */
    public boolean mo10259() {
            r1 = this;
            boolean r0 = r1.m10261()
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟ۧۧ, reason: contains not printable characters */
    public final boolean m10260() {
            r5 = this;
            long r0 = r5.f6910
            r2 = 1
            long r3 = r5.m10255(r2)
            int r0 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r0 < 0) goto Lc
            goto Ld
        Lc:
            r2 = 0
        Ld:
            return r2
    }

    /* JADX INFO: renamed from: ۥ۟۟ۧۨ, reason: contains not printable characters */
    public final boolean m10261() {
            r1 = this;
            Yue.ۥ۟ۡۨۢ<Yue.ۥ۠۟ۢۢ<?>> r0 = r1.f6912
            if (r0 == 0) goto L9
            boolean r0 = r0.m2051()
            goto La
        L9:
            r0 = 1
        La:
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟ۨ, reason: contains not printable characters */
    public long mo10262() {
            r2 = this;
            boolean r0 = r2.m10263()
            if (r0 != 0) goto Lc
            r0 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            return r0
        Lc:
            r0 = 0
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟ۨ۟, reason: contains not printable characters */
    public final boolean m10263() {
            r2 = this;
            Yue.ۥ۟ۡۨۢ<Yue.ۥ۠۟ۢۢ<?>> r0 = r2.f6912
            r1 = 0
            if (r0 != 0) goto L6
            return r1
        L6:
            java.lang.Object r0 = r0.m2052()
            Yue.ۥ۠۟ۢۢ r0 = (Yue.AbstractC1874) r0
            if (r0 != 0) goto Lf
            return r1
        Lf:
            r0.run()
            r0 = 1
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟ۨ۠, reason: contains not printable characters */
    public boolean m10264() {
            r1 = this;
            r0 = 0
            return r0
    }
}
