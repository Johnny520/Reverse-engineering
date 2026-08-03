package Yue;

/* JADX INFO: renamed from: Yue.ۥ۠ۡۤۡ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
@Yue.InterfaceC4986
public class C2301 extends Yue.AbstractC2277 {

    /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
    public final int f7567;

    /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
    public final int f7568;

    /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
    public final long f7569;

    /* JADX INFO: renamed from: ۥ۟۟۠ۧ, reason: contains not printable characters */
    @Yue.InterfaceC4418
    public final java.lang.String f7570;

    /* JADX INFO: renamed from: ۥ۟۟۠ۨ, reason: contains not printable characters */
    @Yue.InterfaceC4418
    public Yue.ExecutorC1656 f7571;

    @Yue.InterfaceC1816(level = Yue.EnumC1819.f5582, message = "Binary compatibility for Ktor 1.0-beta")
    public /* synthetic */ C2301(int r9, int r10) {
            r8 = this;
            long r3 = Yue.C6129.f22091
            r6 = 8
            r7 = 0
            r5 = 0
            r0 = r8
            r1 = r9
            r2 = r10
            r0.<init>(r1, r2, r3, r5, r6, r7)
            return
    }

    public /* synthetic */ C2301(int r1, int r2, int r3, Yue.C1769 r4) {
            r0 = this;
            r4 = r3 & 1
            if (r4 == 0) goto L6
            int r1 = Yue.C6129.f22089
        L6:
            r3 = r3 & 2
            if (r3 == 0) goto Lc
            int r2 = Yue.C6129.f22090
        Lc:
            r0.<init>(r1, r2)
            return
    }

    public C2301(int r1, int r2, long r3, @Yue.InterfaceC4418 java.lang.String r5) {
            r0 = this;
            r0.<init>()
            r0.f7567 = r1
            r0.f7568 = r2
            r0.f7569 = r3
            r0.f7570 = r5
            Yue.ۥۣ۟ۧۧ r1 = r0.m10658()
            r0.f7571 = r1
            return
    }

    public /* synthetic */ C2301(int r7, int r8, long r9, java.lang.String r11, int r12, Yue.C1769 r13) {
            r6 = this;
            r12 = r12 & 8
            if (r12 == 0) goto L6
            java.lang.String r11 = "CoroutineScheduler"
        L6:
            r5 = r11
            r0 = r6
            r1 = r7
            r2 = r8
            r3 = r9
            r0.<init>(r1, r2, r3, r5)
            return
    }

    public C2301(int r7, int r8, @Yue.InterfaceC4418 java.lang.String r9) {
            r6 = this;
            long r3 = Yue.C6129.f22091
            r0 = r6
            r1 = r7
            r2 = r8
            r5 = r9
            r0.<init>(r1, r2, r3, r5)
            return
    }

    public /* synthetic */ C2301(int r1, int r2, java.lang.String r3, int r4, Yue.C1769 r5) {
            r0 = this;
            r5 = r4 & 1
            if (r5 == 0) goto L6
            int r1 = Yue.C6129.f22089
        L6:
            r5 = r4 & 2
            if (r5 == 0) goto Lc
            int r2 = Yue.C6129.f22090
        Lc:
            r4 = r4 & 4
            if (r4 == 0) goto L12
            java.lang.String r3 = "DefaultDispatcher"
        L12:
            r0.<init>(r1, r2, r3)
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟ۧۡ, reason: contains not printable characters */
    public static /* synthetic */ Yue.AbstractC1643 m10656(Yue.C2301 r0, int r1, int r2, java.lang.Object r3) {
            if (r3 != 0) goto Ld
            r2 = r2 & 1
            if (r2 == 0) goto L8
            r1 = 16
        L8:
            Yue.ۥ۟ۧۦۨ r0 = r0.m10657(r1)
            return r0
        Ld:
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            java.lang.String r1 = "Super calls with default arguments not supported in this target, function: blocking"
            r0.<init>(r1)
            throw r0
    }

    @Override // Yue.AbstractC2277, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
            r1 = this;
            Yue.ۥۣ۟ۧۧ r0 = r1.f7571
            r0.close()
            return
    }

    @Override // Yue.AbstractC1643
    public void dispatch(@Yue.InterfaceC4418 Yue.InterfaceC1632 r7, @Yue.InterfaceC4418 java.lang.Runnable r8) {
            r6 = this;
            Yue.ۥۣ۟ۧۧ r0 = r6.f7571     // Catch: java.util.concurrent.RejectedExecutionException -> Lb
            r4 = 6
            r5 = 0
            r2 = 0
            r3 = 0
            r1 = r8
            Yue.ExecutorC1656.m7947(r0, r1, r2, r3, r4, r5)     // Catch: java.util.concurrent.RejectedExecutionException -> Lb
            goto L10
        Lb:
            Yue.ۥ۟ۨۥۤ r0 = Yue.RunnableC1771.f5485
            r0.dispatch(r7, r8)
        L10:
            return
    }

    @Override // Yue.AbstractC1643
    public void dispatchYield(@Yue.InterfaceC4418 Yue.InterfaceC1632 r7, @Yue.InterfaceC4418 java.lang.Runnable r8) {
            r6 = this;
            Yue.ۥۣ۟ۧۧ r0 = r6.f7571     // Catch: java.util.concurrent.RejectedExecutionException -> Lb
            r4 = 2
            r5 = 0
            r2 = 0
            r3 = 1
            r1 = r8
            Yue.ExecutorC1656.m7947(r0, r1, r2, r3, r4, r5)     // Catch: java.util.concurrent.RejectedExecutionException -> Lb
            goto L10
        Lb:
            Yue.ۥ۟ۨۥۤ r0 = Yue.RunnableC1771.f5485
            r0.dispatchYield(r7, r8)
        L10:
            return
    }

    @Override // Yue.AbstractC1643
    @Yue.InterfaceC4418
    public java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = super.toString()
            r0.append(r1)
            java.lang.String r1 = "[scheduler = "
            r0.append(r1)
            Yue.ۥۣ۟ۧۧ r1 = r2.f7571
            r0.append(r1)
            r1 = 93
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }

    @Override // Yue.AbstractC2277
    @Yue.InterfaceC4418
    /* JADX INFO: renamed from: ۥ۟۟ۧ۟ */
    public java.util.concurrent.Executor mo8460() {
            r1 = this;
            Yue.ۥۣ۟ۧۧ r0 = r1.f7571
            return r0
    }

    @Yue.InterfaceC4418
    /* JADX INFO: renamed from: ۥ۟۟ۧ۠, reason: contains not printable characters */
    public final Yue.AbstractC1643 m10657(int r4) {
            r3 = this;
            if (r4 <= 0) goto La
            Yue.ۥ۠ۧ۠ۡ r0 = new Yue.ۥ۠ۧ۠ۡ
            r1 = 0
            r2 = 1
            r0.<init>(r3, r4, r1, r2)
            return r0
        La:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Expected positive parallelism level, but have "
            r0.append(r1)
            r0.append(r4)
            java.lang.String r4 = r0.toString()
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r4 = r4.toString()
            r0.<init>(r4)
            throw r0
    }

    /* JADX INFO: renamed from: ۥ۟۟ۧۢ, reason: contains not printable characters */
    public final Yue.ExecutorC1656 m10658() {
            r7 = this;
            Yue.ۥۣ۟ۧۧ r6 = new Yue.ۥۣ۟ۧۧ
            int r1 = r7.f7567
            int r2 = r7.f7568
            long r3 = r7.f7569
            java.lang.String r5 = r7.f7570
            r0 = r6
            r0.<init>(r1, r2, r3, r5)
            return r6
    }

    /* JADX INFO: renamed from: ۥۣ۟۟ۧ, reason: contains not printable characters */
    public final void m10659(@Yue.InterfaceC4418 java.lang.Runnable r2, @Yue.InterfaceC4418 Yue.InterfaceC6113 r3, boolean r4) {
            r1 = this;
            Yue.ۥۣ۟ۧۧ r0 = r1.f7571     // Catch: java.util.concurrent.RejectedExecutionException -> L6
            r0.m7958(r2, r3, r4)     // Catch: java.util.concurrent.RejectedExecutionException -> L6
            goto L11
        L6:
            Yue.ۥ۟ۨۥۤ r4 = Yue.RunnableC1771.f5485
            Yue.ۥۣ۟ۧۧ r0 = r1.f7571
            Yue.ۥۢ۠ۨۧ r2 = r0.m7953(r2, r3)
            r4.mo8440(r2)
        L11:
            return
    }

    @Yue.InterfaceC4418
    /* JADX INFO: renamed from: ۥ۟۟ۧۤ, reason: contains not printable characters */
    public final Yue.AbstractC1643 m10660(int r4) {
            r3 = this;
            if (r4 <= 0) goto L33
            int r0 = r3.f7567
            if (r4 > r0) goto Le
            Yue.ۥ۠ۧ۠ۡ r0 = new Yue.ۥ۠ۧ۠ۡ
            r1 = 0
            r2 = 0
            r0.<init>(r3, r4, r1, r2)
            return r0
        Le:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Expected parallelism level lesser than core pool size ("
            r0.append(r1)
            int r1 = r3.f7567
            r0.append(r1)
            java.lang.String r1 = "), but have "
            r0.append(r1)
            r0.append(r4)
            java.lang.String r4 = r0.toString()
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r4 = r4.toString()
            r0.<init>(r4)
            throw r0
        L33:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Expected positive parallelism level, but have "
            r0.append(r1)
            r0.append(r4)
            java.lang.String r4 = r0.toString()
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r4 = r4.toString()
            r0.<init>(r4)
            throw r0
    }
}
