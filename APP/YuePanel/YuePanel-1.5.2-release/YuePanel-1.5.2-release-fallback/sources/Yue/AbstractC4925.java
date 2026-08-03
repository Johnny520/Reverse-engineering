package Yue;

/* JADX INFO: renamed from: Yue.ۥۡۥ۠ۢ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC4925<T> {

    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public final int f15710;

    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    public int f15711;

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    @Yue.InterfaceC4418
    public final T[] f15712;

    public AbstractC4925(int r1) {
            r0 = this;
            r0.<init>()
            r0.f15710 = r1
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r0.f15712 = r1
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public static /* synthetic */ void m19282() {
            return
    }

    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public final void m19283(@Yue.InterfaceC4418 T r4) {
            r3 = this;
            java.lang.String r0 = "spreadArgument"
            Yue.C3329.m13906(r4, r0)
            T[] r0 = r3.f15712
            int r1 = r3.f15711
            int r2 = r1 + 1
            r3.f15711 = r2
            r0[r1] = r4
            return
    }

    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    public final int m19284() {
            r1 = this;
            int r0 = r1.f15711
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟ */
    public abstract int mo4739(@Yue.InterfaceC4418 T r1);

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public final void m19285(int r1) {
            r0 = this;
            r0.f15711 = r1
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public final int m19286() {
            r5 = this;
            Yue.ۥ۠ۥۣۨ r0 = new Yue.ۥ۠ۥۣۨ
            int r1 = r5.f15710
            r2 = 1
            int r1 = r1 - r2
            r3 = 0
            r0.<init>(r3, r1)
            Yue.ۥ۠ۥۣۥ r0 = r0.m13740()
        Le:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L26
            int r1 = r0.mo2006()
            T[] r4 = r5.f15712
            r1 = r4[r1]
            if (r1 == 0) goto L23
            int r1 = r5.mo4739(r1)
            goto L24
        L23:
            r1 = r2
        L24:
            int r3 = r3 + r1
            goto Le
        L26:
            return r3
    }

    @Yue.InterfaceC4418
    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public final T m19287(@Yue.InterfaceC4418 T r8, @Yue.InterfaceC4418 T r9) {
            r7 = this;
            java.lang.String r0 = "values"
            Yue.C3329.m13906(r8, r0)
            java.lang.String r0 = "result"
            Yue.C3329.m13906(r9, r0)
            Yue.ۥ۠ۥۣۨ r0 = new Yue.ۥ۠ۥۣۨ
            int r1 = r7.f15710
            int r1 = r1 + (-1)
            r2 = 0
            r0.<init>(r2, r1)
            Yue.ۥ۠ۥۣۥ r0 = r0.m13740()
            r1 = r2
            r3 = r1
        L1a:
            boolean r4 = r0.hasNext()
            if (r4 == 0) goto L3d
            int r4 = r0.mo2006()
            T[] r5 = r7.f15712
            r5 = r5[r4]
            if (r5 == 0) goto L1a
            if (r1 >= r4) goto L32
            int r6 = r4 - r1
            java.lang.System.arraycopy(r8, r1, r9, r3, r6)
            int r3 = r3 + r6
        L32:
            int r1 = r7.mo4739(r5)
            java.lang.System.arraycopy(r5, r2, r9, r3, r1)
            int r3 = r3 + r1
            int r1 = r4 + 1
            goto L1a
        L3d:
            int r0 = r7.f15710
            if (r1 >= r0) goto L45
            int r0 = r0 - r1
            java.lang.System.arraycopy(r8, r1, r9, r3, r0)
        L45:
            return r9
    }
}
