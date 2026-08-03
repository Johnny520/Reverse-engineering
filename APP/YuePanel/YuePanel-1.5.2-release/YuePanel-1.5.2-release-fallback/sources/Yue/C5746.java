package Yue;

/* JADX INFO: renamed from: Yue.ۥۡۨۨۢ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public final class C5746 {

    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    @Yue.InterfaceC4418
    @Yue.InterfaceC3417
    public static final Yue.C6075 f21188 = null;

    static {
            Yue.ۥۢ۠ۦۢ r0 = new Yue.ۥۢ۠ۦۢ
            java.lang.String r1 = "NO_VALUE"
            r0.<init>(r1)
            Yue.C5746.f21188 = r0
            return
    }

    @Yue.InterfaceC4418
    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public static final <T> Yue.InterfaceC4319<T> m21471(int r1, int r2, @Yue.InterfaceC4418 Yue.EnumC0847 r3) {
            if (r1 < 0) goto L4f
            if (r2 < 0) goto L34
            if (r1 > 0) goto L28
            if (r2 > 0) goto L28
            Yue.ۥۣۣ۟ r0 = Yue.EnumC0847.f2389
            if (r3 != r0) goto Ld
            goto L28
        Ld:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "replay or extraBufferCapacity must be positive with non-default onBufferOverflow strategy "
            r1.append(r2)
            r1.append(r3)
            java.lang.String r1 = r1.toString()
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r1 = r1.toString()
            r2.<init>(r1)
            throw r2
        L28:
            int r2 = r2 + r1
            if (r2 >= 0) goto L2e
            r2 = 2147483647(0x7fffffff, float:NaN)
        L2e:
            Yue.ۥۡۨۨۡ r0 = new Yue.ۥۡۨۨۡ
            r0.<init>(r1, r2, r3)
            return r0
        L34:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r3 = "extraBufferCapacity cannot be negative, but was "
            r1.append(r3)
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r1 = r1.toString()
            r2.<init>(r1)
            throw r2
        L4f:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "replay cannot be negative, but was "
            r2.append(r3)
            r2.append(r1)
            java.lang.String r1 = r2.toString()
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r1 = r1.toString()
            r2.<init>(r1)
            throw r2
    }

    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    public static /* synthetic */ Yue.InterfaceC4319 m21472(int r1, int r2, Yue.EnumC0847 r3, int r4, java.lang.Object r5) {
            r5 = r4 & 1
            r0 = 0
            if (r5 == 0) goto L6
            r1 = r0
        L6:
            r5 = r4 & 2
            if (r5 == 0) goto Lb
            r2 = r0
        Lb:
            r4 = r4 & 4
            if (r4 == 0) goto L11
            Yue.ۥۣۣ۟ r3 = Yue.EnumC0847.f2389
        L11:
            Yue.ۥۡۡۧۥ r1 = m21471(r1, r2, r3)
            return r1
    }

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static final /* synthetic */ java.lang.Object m21473(java.lang.Object[] r0, long r1) {
            java.lang.Object r0 = m21476(r0, r1)
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public static final /* synthetic */ void m21474(java.lang.Object[] r0, long r1, java.lang.Object r3) {
            m21478(r0, r1, r3)
            return
    }

    @Yue.InterfaceC4418
    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public static final <T> Yue.InterfaceC2464<T> m21475(@Yue.InterfaceC4418 Yue.InterfaceC5741<? extends T> r1, @Yue.InterfaceC4418 Yue.InterfaceC1632 r2, int r3, @Yue.InterfaceC4418 Yue.EnumC0847 r4) {
            if (r3 == 0) goto L5
            r0 = -3
            if (r3 != r0) goto La
        L5:
            Yue.ۥۣۣ۟ r0 = Yue.EnumC0847.f2389
            if (r4 != r0) goto La
            return r1
        La:
            Yue.ۥ۟ۤۡۥ r0 = new Yue.ۥ۟ۤۡۥ
            r0.<init>(r1, r2, r3, r4)
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public static final java.lang.Object m21476(java.lang.Object[] r0, long r1) {
            int r1 = (int) r1
            int r2 = r0.length
            int r2 = r2 + (-1)
            r1 = r1 & r2
            r0 = r0[r1]
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public static /* synthetic */ void m21477() {
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public static final void m21478(java.lang.Object[] r0, long r1, java.lang.Object r3) {
            int r1 = (int) r1
            int r2 = r0.length
            int r2 = r2 + (-1)
            r1 = r1 & r2
            r0[r1] = r3
            return
    }
}
