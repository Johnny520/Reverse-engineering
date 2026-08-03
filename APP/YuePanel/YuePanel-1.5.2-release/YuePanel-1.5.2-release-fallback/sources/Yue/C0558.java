package Yue;

/* JADX INFO: renamed from: Yue.ۥ۟ۡۧ۟, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public class C0558<E> extends Yue.AbstractC0028<E> {

    @Yue.InterfaceC4418
    private volatile /* synthetic */ int size;

    /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
    public final int f1453;

    /* JADX INFO: renamed from: ۥ۟۟۠ۧ, reason: contains not printable characters */
    @Yue.InterfaceC4418
    public final Yue.EnumC0847 f1454;

    /* JADX INFO: renamed from: ۥ۟۟۠ۨ, reason: contains not printable characters */
    @Yue.InterfaceC4418
    public final java.util.concurrent.locks.ReentrantLock f1455;

    /* JADX INFO: renamed from: ۥ۟۟ۡ, reason: contains not printable characters */
    @Yue.InterfaceC4418
    public java.lang.Object[] f1456;

    /* JADX INFO: renamed from: ۥ۟۟ۡ۟, reason: contains not printable characters */
    public int f1457;

    /* JADX INFO: renamed from: Yue.ۥ۟ۡۧ۟$ۥ, reason: contains not printable characters */
    public /* synthetic */ class C0559 {

        /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
        public static final /* synthetic */ int[] f1458 = null;

        static {
                Yue.ۥۣۣ۟[] r0 = Yue.EnumC0847.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                Yue.ۥۣۣ۟ r1 = Yue.EnumC0847.f2389
                int r1 = r1.ordinal()
                r2 = 1
                r0[r1] = r2
                Yue.ۥۣۣ۟ r1 = Yue.EnumC0847.f2391
                int r1 = r1.ordinal()
                r2 = 2
                r0[r1] = r2
                Yue.ۥۣۣ۟ r1 = Yue.EnumC0847.f2390
                int r1 = r1.ordinal()
                r2 = 3
                r0[r1] = r2
                Yue.C0558.C0559.f1458 = r0
                return
        }
    }

    public C0558(int r7, @Yue.InterfaceC4418 Yue.EnumC0847 r8, @Yue.InterfaceC4543 Yue.InterfaceC2825<? super E, Yue.C6593> r9) {
            r6 = this;
            r6.<init>(r9)
            r6.f1453 = r7
            r6.f1454 = r8
            r8 = 1
            if (r7 < r8) goto L29
            java.util.concurrent.locks.ReentrantLock r8 = new java.util.concurrent.locks.ReentrantLock
            r8.<init>()
            r6.f1455 = r8
            r8 = 8
            int r7 = java.lang.Math.min(r7, r8)
            java.lang.Object[] r7 = new java.lang.Object[r7]
            Yue.ۥۢ۠ۦۢ r1 = Yue.C0040.f94
            r4 = 6
            r5 = 0
            r2 = 0
            r3 = 0
            r0 = r7
            Yue.C0586.m2248(r0, r1, r2, r3, r4, r5)
            r6.f1456 = r7
            r7 = 0
            r6.size = r7
            return
        L29:
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            java.lang.String r9 = "ArrayChannel capacity must be at least 1, but "
            r8.append(r9)
            r8.append(r7)
            java.lang.String r7 = " was specified"
            r8.append(r7)
            java.lang.String r7 = r8.toString()
            java.lang.IllegalArgumentException r8 = new java.lang.IllegalArgumentException
            java.lang.String r7 = r7.toString()
            r8.<init>(r7)
            throw r8
    }

    @Override // Yue.AbstractC0028, Yue.InterfaceC5242
    public boolean isEmpty() {
            r2 = this;
            java.util.concurrent.locks.ReentrantLock r0 = r2.f1455
            r0.lock()
            boolean r1 = r2.m329()     // Catch: java.lang.Throwable -> Ld
            r0.unlock()
            return r1
        Ld:
            r1 = move-exception
            r0.unlock()
            throw r1
    }

    @Override // Yue.AbstractC0028, Yue.InterfaceC5242
    /* JADX INFO: renamed from: ۥ۟۟۟ۤ */
    public boolean mo313() {
            r2 = this;
            java.util.concurrent.locks.ReentrantLock r0 = r2.f1455
            r0.lock()
            boolean r1 = super.mo313()     // Catch: java.lang.Throwable -> Ld
            r0.unlock()
            return r1
        Ld:
            r1 = move-exception
            r0.unlock()
            throw r1
    }

    @Override // Yue.AbstractC0085
    @Yue.InterfaceC4543
    /* JADX INFO: renamed from: ۥ۟۟۠۠ */
    public java.lang.Object mo480(@Yue.InterfaceC4418 Yue.AbstractC5593 r2) {
            r1 = this;
            java.util.concurrent.locks.ReentrantLock r0 = r1.f1455
            r0.lock()
            java.lang.Object r2 = super.mo480(r2)     // Catch: java.lang.Throwable -> Ld
            r0.unlock()
            return r2
        Ld:
            r2 = move-exception
            r0.unlock()
            throw r2
    }

    @Override // Yue.AbstractC0085
    @Yue.InterfaceC4418
    /* JADX INFO: renamed from: ۥ۟۟۠ۡ */
    public java.lang.String mo481() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "(buffer:capacity="
            r0.append(r1)
            int r1 = r2.f1453
            r0.append(r1)
            java.lang.String r1 = ",size="
            r0.append(r1)
            int r1 = r2.size
            r0.append(r1)
            r1 = 41
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }

    @Override // Yue.AbstractC0085
    /* JADX INFO: renamed from: ۥ۟۟ۡۦ */
    public final boolean mo493() {
            r1 = this;
            r0 = 0
            return r0
    }

    @Override // Yue.AbstractC0085
    /* JADX INFO: renamed from: ۥ۟۟ۡۧ */
    public final boolean mo494() {
            r2 = this;
            int r0 = r2.size
            int r1 = r2.f1453
            if (r0 != r1) goto Le
            Yue.ۥۣۣ۟ r0 = r2.f1454
            Yue.ۥۣۣ۟ r1 = Yue.EnumC0847.f2389
            if (r0 != r1) goto Le
            r0 = 1
            goto Lf
        Le:
            r0 = 0
        Lf:
            return r0
    }

    @Override // Yue.AbstractC0085
    @Yue.InterfaceC4418
    /* JADX INFO: renamed from: ۥ۟۟ۢ۟ */
    public java.lang.Object mo497(E r5) {
            r4 = this;
            java.util.concurrent.locks.ReentrantLock r0 = r4.f1455
            r0.lock()
            int r1 = r4.size     // Catch: java.lang.Throwable -> L2e
            Yue.ۥ۟ۥ r2 = r4.m483()     // Catch: java.lang.Throwable -> L2e
            if (r2 == 0) goto L11
            r0.unlock()
            return r2
        L11:
            Yue.ۥۢ۠ۦۢ r2 = r4.m1982(r1)     // Catch: java.lang.Throwable -> L2e
            if (r2 == 0) goto L1b
            r0.unlock()
            return r2
        L1b:
            if (r1 != 0) goto L49
        L1d:
            Yue.ۥۡۦۡۢ r2 = r4.mo320()     // Catch: java.lang.Throwable -> L2e
            if (r2 != 0) goto L24
            goto L49
        L24:
            boolean r3 = r2 instanceof Yue.C1174     // Catch: java.lang.Throwable -> L2e
            if (r3 == 0) goto L30
            r4.size = r1     // Catch: java.lang.Throwable -> L2e
            r0.unlock()
            return r2
        L2e:
            r5 = move-exception
            goto L52
        L30:
            Yue.C3329.m13903(r2)     // Catch: java.lang.Throwable -> L2e
            r3 = 0
            Yue.ۥۢ۠ۦۢ r3 = r2.mo347(r5, r3)     // Catch: java.lang.Throwable -> L2e
            if (r3 == 0) goto L1d
            r4.size = r1     // Catch: java.lang.Throwable -> L2e
            Yue.ۥۣۢ۠ۤ r1 = Yue.C6593.f23016     // Catch: java.lang.Throwable -> L2e
            r0.unlock()
            r2.mo348(r5)
            java.lang.Object r5 = r2.mo6116()
            return r5
        L49:
            r4.m1980(r1, r5)     // Catch: java.lang.Throwable -> L2e
            Yue.ۥۢ۠ۦۢ r5 = Yue.C0040.f95     // Catch: java.lang.Throwable -> L2e
            r0.unlock()
            return r5
        L52:
            r0.unlock()
            throw r5
    }

    @Override // Yue.AbstractC0085
    @Yue.InterfaceC4418
    /* JADX INFO: renamed from: ۥ۟۟ۢۢ */
    public java.lang.Object mo500(E r5, @Yue.InterfaceC4418 Yue.InterfaceC5564<?> r6) {
            r4 = this;
            java.util.concurrent.locks.ReentrantLock r0 = r4.f1455
            r0.lock()
            int r1 = r4.size     // Catch: java.lang.Throwable -> L3f
            Yue.ۥ۟ۥ r2 = r4.m483()     // Catch: java.lang.Throwable -> L3f
            if (r2 == 0) goto L11
            r0.unlock()
            return r2
        L11:
            Yue.ۥۢ۠ۦۢ r2 = r4.m1982(r1)     // Catch: java.lang.Throwable -> L3f
            if (r2 == 0) goto L1b
            r0.unlock()
            return r2
        L1b:
            if (r1 != 0) goto L75
        L1d:
            Yue.ۥ۟۟ۢۢ$ۥ۟۟۟ r2 = r4.m479(r5)     // Catch: java.lang.Throwable -> L3f
            java.lang.Object r3 = r6.mo20843(r2)     // Catch: java.lang.Throwable -> L3f
            if (r3 != 0) goto L41
            r4.size = r1     // Catch: java.lang.Throwable -> L3f
            java.lang.Object r6 = r2.m15192()     // Catch: java.lang.Throwable -> L3f
            Yue.ۥۣۢ۠ۤ r1 = Yue.C6593.f23016     // Catch: java.lang.Throwable -> L3f
            r0.unlock()
            Yue.C3329.m13903(r6)
            Yue.ۥۡۦۡۢ r6 = (Yue.InterfaceC5247) r6
            r6.mo348(r5)
            java.lang.Object r5 = r6.mo6116()
            return r5
        L3f:
            r5 = move-exception
            goto L8e
        L41:
            Yue.ۥۢ۠ۦۢ r2 = Yue.C0040.f96     // Catch: java.lang.Throwable -> L3f
            if (r3 == r2) goto L75
            java.lang.Object r2 = Yue.C0640.f1626     // Catch: java.lang.Throwable -> L3f
            if (r3 == r2) goto L1d
            java.lang.Object r5 = Yue.C5566.m20861()     // Catch: java.lang.Throwable -> L3f
            if (r3 == r5) goto L6f
            boolean r5 = r3 instanceof Yue.C1174     // Catch: java.lang.Throwable -> L3f
            if (r5 == 0) goto L54
            goto L6f
        L54:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L3f
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L3f
            r6.<init>()     // Catch: java.lang.Throwable -> L3f
            java.lang.String r1 = "performAtomicTrySelect(describeTryOffer) returned "
            r6.append(r1)     // Catch: java.lang.Throwable -> L3f
            r6.append(r3)     // Catch: java.lang.Throwable -> L3f
            java.lang.String r6 = r6.toString()     // Catch: java.lang.Throwable -> L3f
            java.lang.String r6 = r6.toString()     // Catch: java.lang.Throwable -> L3f
            r5.<init>(r6)     // Catch: java.lang.Throwable -> L3f
            throw r5     // Catch: java.lang.Throwable -> L3f
        L6f:
            r4.size = r1     // Catch: java.lang.Throwable -> L3f
            r0.unlock()
            return r3
        L75:
            boolean r6 = r6.mo20844()     // Catch: java.lang.Throwable -> L3f
            if (r6 != 0) goto L85
            r4.size = r1     // Catch: java.lang.Throwable -> L3f
            java.lang.Object r5 = Yue.C5566.m20861()     // Catch: java.lang.Throwable -> L3f
            r0.unlock()
            return r5
        L85:
            r4.m1980(r1, r5)     // Catch: java.lang.Throwable -> L3f
            Yue.ۥۢ۠ۦۢ r5 = Yue.C0040.f95     // Catch: java.lang.Throwable -> L3f
            r0.unlock()
            return r5
        L8e:
            r0.unlock()
            throw r5
    }

    @Override // Yue.AbstractC0028
    /* JADX INFO: renamed from: ۥۣ۟۟ۥ */
    public boolean mo324(@Yue.InterfaceC4418 Yue.AbstractC5241<? super E> r2) {
            r1 = this;
            java.util.concurrent.locks.ReentrantLock r0 = r1.f1455
            r0.lock()
            boolean r2 = super.mo324(r2)     // Catch: java.lang.Throwable -> Ld
            r0.unlock()
            return r2
        Ld:
            r2 = move-exception
            r0.unlock()
            throw r2
    }

    @Override // Yue.AbstractC0028
    /* JADX INFO: renamed from: ۥۣ۟۟ۨ */
    public final boolean mo327() {
            r1 = this;
            r0 = 0
            return r0
    }

    @Override // Yue.AbstractC0028
    /* JADX INFO: renamed from: ۥ۟۟ۤ */
    public final boolean mo328() {
            r1 = this;
            int r0 = r1.size
            if (r0 != 0) goto L6
            r0 = 1
            goto L7
        L6:
            r0 = 0
        L7:
            return r0
    }

    @Override // Yue.AbstractC0028
    /* JADX INFO: renamed from: ۥ۟۟ۤ۠ */
    public void mo330(boolean r10) {
            r9 = this;
            Yue.ۥۣ۠ۡ۟<E, Yue.ۥۣۢ۠ۤ> r0 = r9.f165
            java.util.concurrent.locks.ReentrantLock r1 = r9.f1455
            r1.lock()
            int r2 = r9.size     // Catch: java.lang.Throwable -> L1f
            r3 = 0
            r4 = 0
            r5 = r3
        Lc:
            if (r5 >= r2) goto L32
            java.lang.Object[] r6 = r9.f1456     // Catch: java.lang.Throwable -> L1f
            int r7 = r9.f1457     // Catch: java.lang.Throwable -> L1f
            r6 = r6[r7]     // Catch: java.lang.Throwable -> L1f
            if (r0 == 0) goto L21
            Yue.ۥۢ۠ۦۢ r7 = Yue.C0040.f94     // Catch: java.lang.Throwable -> L1f
            if (r6 == r7) goto L21
            Yue.ۥۣۢ۟ۨ r4 = Yue.C4622.m18434(r0, r6, r4)     // Catch: java.lang.Throwable -> L1f
            goto L21
        L1f:
            r10 = move-exception
            goto L40
        L21:
            java.lang.Object[] r6 = r9.f1456     // Catch: java.lang.Throwable -> L1f
            int r7 = r9.f1457     // Catch: java.lang.Throwable -> L1f
            Yue.ۥۢ۠ۦۢ r8 = Yue.C0040.f94     // Catch: java.lang.Throwable -> L1f
            r6[r7] = r8     // Catch: java.lang.Throwable -> L1f
            int r7 = r7 + 1
            int r6 = r6.length     // Catch: java.lang.Throwable -> L1f
            int r7 = r7 % r6
            r9.f1457 = r7     // Catch: java.lang.Throwable -> L1f
            int r5 = r5 + 1
            goto Lc
        L32:
            r9.size = r3     // Catch: java.lang.Throwable -> L1f
            Yue.ۥۣۢ۠ۤ r0 = Yue.C6593.f23016     // Catch: java.lang.Throwable -> L1f
            r1.unlock()
            super.mo330(r10)
            if (r4 != 0) goto L3f
            return
        L3f:
            throw r4
        L40:
            r1.unlock()
            throw r10
    }

    @Override // Yue.AbstractC0028
    @Yue.InterfaceC4543
    /* JADX INFO: renamed from: ۥ۟۟ۤۤ */
    public java.lang.Object mo334() {
            r9 = this;
            java.util.concurrent.locks.ReentrantLock r0 = r9.f1455
            r0.lock()
            int r1 = r9.size     // Catch: java.lang.Throwable -> L12
            if (r1 != 0) goto L18
            Yue.ۥ۟ۥ r1 = r9.m483()     // Catch: java.lang.Throwable -> L12
            if (r1 != 0) goto L14
            Yue.ۥۢ۠ۦۢ r1 = Yue.C0040.f97     // Catch: java.lang.Throwable -> L12
            goto L14
        L12:
            r1 = move-exception
            goto L75
        L14:
            r0.unlock()
            return r1
        L18:
            java.lang.Object[] r2 = r9.f1456     // Catch: java.lang.Throwable -> L12
            int r3 = r9.f1457     // Catch: java.lang.Throwable -> L12
            r4 = r2[r3]     // Catch: java.lang.Throwable -> L12
            r5 = 0
            r2[r3] = r5     // Catch: java.lang.Throwable -> L12
            int r2 = r1 + (-1)
            r9.size = r2     // Catch: java.lang.Throwable -> L12
            Yue.ۥۢ۠ۦۢ r2 = Yue.C0040.f97     // Catch: java.lang.Throwable -> L12
            int r3 = r9.f1453     // Catch: java.lang.Throwable -> L12
            r6 = 1
            r7 = 0
            if (r1 != r3) goto L4b
            r3 = r5
        L2e:
            Yue.ۥۡۨ۠ۦ r8 = r9.m505()     // Catch: java.lang.Throwable -> L12
            if (r8 != 0) goto L36
            r5 = r3
            goto L4b
        L36:
            Yue.C3329.m13903(r8)     // Catch: java.lang.Throwable -> L12
            Yue.ۥۢ۠ۦۢ r3 = r8.mo509(r5)     // Catch: java.lang.Throwable -> L12
            if (r3 == 0) goto L46
            java.lang.Object r2 = r8.mo507()     // Catch: java.lang.Throwable -> L12
            r7 = r6
            r5 = r8
            goto L4b
        L46:
            r8.mo510()     // Catch: java.lang.Throwable -> L12
            r3 = r8
            goto L2e
        L4b:
            Yue.ۥۢ۠ۦۢ r3 = Yue.C0040.f97     // Catch: java.lang.Throwable -> L12
            if (r2 == r3) goto L5e
            boolean r3 = r2 instanceof Yue.C1174     // Catch: java.lang.Throwable -> L12
            if (r3 != 0) goto L5e
            r9.size = r1     // Catch: java.lang.Throwable -> L12
            java.lang.Object[] r3 = r9.f1456     // Catch: java.lang.Throwable -> L12
            int r8 = r9.f1457     // Catch: java.lang.Throwable -> L12
            int r8 = r8 + r1
            int r1 = r3.length     // Catch: java.lang.Throwable -> L12
            int r8 = r8 % r1
            r3[r8] = r2     // Catch: java.lang.Throwable -> L12
        L5e:
            int r1 = r9.f1457     // Catch: java.lang.Throwable -> L12
            int r1 = r1 + r6
            java.lang.Object[] r2 = r9.f1456     // Catch: java.lang.Throwable -> L12
            int r2 = r2.length     // Catch: java.lang.Throwable -> L12
            int r1 = r1 % r2
            r9.f1457 = r1     // Catch: java.lang.Throwable -> L12
            Yue.ۥۣۢ۠ۤ r1 = Yue.C6593.f23016     // Catch: java.lang.Throwable -> L12
            r0.unlock()
            if (r7 == 0) goto L74
            Yue.C3329.m13903(r5)
            r5.mo506()
        L74:
            return r4
        L75:
            r0.unlock()
            throw r1
    }

    @Override // Yue.AbstractC0028
    @Yue.InterfaceC4543
    /* JADX INFO: renamed from: ۥ۟۟ۤۥ */
    public java.lang.Object mo335(@Yue.InterfaceC4418 Yue.InterfaceC5564<?> r9) {
            r8 = this;
            java.util.concurrent.locks.ReentrantLock r0 = r8.f1455
            r0.lock()
            int r1 = r8.size     // Catch: java.lang.Throwable -> L12
            if (r1 != 0) goto L19
            Yue.ۥ۟ۥ r9 = r8.m483()     // Catch: java.lang.Throwable -> L12
            if (r9 != 0) goto L15
            Yue.ۥۢ۠ۦۢ r9 = Yue.C0040.f97     // Catch: java.lang.Throwable -> L12
            goto L15
        L12:
            r9 = move-exception
            goto Lc8
        L15:
            r0.unlock()
            return r9
        L19:
            java.lang.Object[] r2 = r8.f1456     // Catch: java.lang.Throwable -> L12
            int r3 = r8.f1457     // Catch: java.lang.Throwable -> L12
            r4 = r2[r3]     // Catch: java.lang.Throwable -> L12
            r5 = 0
            r2[r3] = r5     // Catch: java.lang.Throwable -> L12
            int r2 = r1 + (-1)
            r8.size = r2     // Catch: java.lang.Throwable -> L12
            Yue.ۥۢ۠ۦۢ r2 = Yue.C0040.f97     // Catch: java.lang.Throwable -> L12
            int r3 = r8.f1453     // Catch: java.lang.Throwable -> L12
            r6 = 1
            if (r1 != r3) goto L84
        L2d:
            Yue.ۥ۟۟۠ۤ$ۥ۟۟۟ۡ r3 = r8.m322()     // Catch: java.lang.Throwable -> L12
            java.lang.Object r7 = r9.mo20843(r3)     // Catch: java.lang.Throwable -> L12
            if (r7 != 0) goto L47
            java.lang.Object r5 = r3.m15192()     // Catch: java.lang.Throwable -> L12
            Yue.C3329.m13903(r5)     // Catch: java.lang.Throwable -> L12
            r2 = r5
            Yue.ۥۡۨ۠ۦ r2 = (Yue.AbstractC5593) r2     // Catch: java.lang.Throwable -> L12
            java.lang.Object r2 = r2.mo507()     // Catch: java.lang.Throwable -> L12
            r3 = r6
            goto L85
        L47:
            Yue.ۥۢ۠ۦۢ r3 = Yue.C0040.f97     // Catch: java.lang.Throwable -> L12
            if (r7 == r3) goto L84
            java.lang.Object r3 = Yue.C0640.f1626     // Catch: java.lang.Throwable -> L12
            if (r7 == r3) goto L2d
            java.lang.Object r2 = Yue.C5566.m20861()     // Catch: java.lang.Throwable -> L12
            if (r7 != r2) goto L61
            r8.size = r1     // Catch: java.lang.Throwable -> L12
            java.lang.Object[] r9 = r8.f1456     // Catch: java.lang.Throwable -> L12
            int r1 = r8.f1457     // Catch: java.lang.Throwable -> L12
            r9[r1] = r4     // Catch: java.lang.Throwable -> L12
            r0.unlock()
            return r7
        L61:
            boolean r2 = r7 instanceof Yue.C1174     // Catch: java.lang.Throwable -> L12
            if (r2 == 0) goto L69
            r3 = r6
            r2 = r7
            r5 = r2
            goto L85
        L69:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L12
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L12
            r1.<init>()     // Catch: java.lang.Throwable -> L12
            java.lang.String r2 = "performAtomicTrySelect(describeTryOffer) returned "
            r1.append(r2)     // Catch: java.lang.Throwable -> L12
            r1.append(r7)     // Catch: java.lang.Throwable -> L12
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Throwable -> L12
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Throwable -> L12
            r9.<init>(r1)     // Catch: java.lang.Throwable -> L12
            throw r9     // Catch: java.lang.Throwable -> L12
        L84:
            r3 = 0
        L85:
            Yue.ۥۢ۠ۦۢ r7 = Yue.C0040.f97     // Catch: java.lang.Throwable -> L12
            if (r2 == r7) goto L99
            boolean r7 = r2 instanceof Yue.C1174     // Catch: java.lang.Throwable -> L12
            if (r7 != 0) goto L99
            r8.size = r1     // Catch: java.lang.Throwable -> L12
            java.lang.Object[] r9 = r8.f1456     // Catch: java.lang.Throwable -> L12
            int r7 = r8.f1457     // Catch: java.lang.Throwable -> L12
            int r7 = r7 + r1
            int r1 = r9.length     // Catch: java.lang.Throwable -> L12
            int r7 = r7 % r1
            r9[r7] = r2     // Catch: java.lang.Throwable -> L12
            goto Laf
        L99:
            boolean r9 = r9.mo20844()     // Catch: java.lang.Throwable -> L12
            if (r9 != 0) goto Laf
            r8.size = r1     // Catch: java.lang.Throwable -> L12
            java.lang.Object[] r9 = r8.f1456     // Catch: java.lang.Throwable -> L12
            int r1 = r8.f1457     // Catch: java.lang.Throwable -> L12
            r9[r1] = r4     // Catch: java.lang.Throwable -> L12
            java.lang.Object r9 = Yue.C5566.m20861()     // Catch: java.lang.Throwable -> L12
            r0.unlock()
            return r9
        Laf:
            int r9 = r8.f1457     // Catch: java.lang.Throwable -> L12
            int r9 = r9 + r6
            java.lang.Object[] r1 = r8.f1456     // Catch: java.lang.Throwable -> L12
            int r1 = r1.length     // Catch: java.lang.Throwable -> L12
            int r9 = r9 % r1
            r8.f1457 = r9     // Catch: java.lang.Throwable -> L12
            Yue.ۥۣۢ۠ۤ r9 = Yue.C6593.f23016     // Catch: java.lang.Throwable -> L12
            r0.unlock()
            if (r3 == 0) goto Lc7
            Yue.C3329.m13903(r5)
            Yue.ۥۡۨ۠ۦ r5 = (Yue.AbstractC5593) r5
            r5.mo506()
        Lc7:
            return r4
        Lc8:
            r0.unlock()
            throw r9
    }

    /* JADX INFO: renamed from: ۥ۟۟ۥ۟, reason: contains not printable characters */
    public final void m1980(int r5, E r6) {
            r4 = this;
            int r0 = r4.f1453
            if (r5 >= r0) goto L11
            r4.m1981(r5)
            java.lang.Object[] r0 = r4.f1456
            int r1 = r4.f1457
            int r1 = r1 + r5
            int r5 = r0.length
            int r1 = r1 % r5
            r0[r1] = r6
            goto L26
        L11:
            java.lang.Object[] r0 = r4.f1456
            int r1 = r4.f1457
            int r2 = r0.length
            int r2 = r1 % r2
            r3 = 0
            r0[r2] = r3
            int r5 = r5 + r1
            int r2 = r0.length
            int r5 = r5 % r2
            r0[r5] = r6
            int r1 = r1 + 1
            int r5 = r0.length
            int r1 = r1 % r5
            r4.f1457 = r1
        L26:
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟ۥ۠, reason: contains not printable characters */
    public final void m1981(int r8) {
            r7 = this;
            java.lang.Object[] r0 = r7.f1456
            int r1 = r0.length
            if (r8 < r1) goto L2b
            int r0 = r0.length
            int r0 = r0 * 2
            int r1 = r7.f1453
            int r0 = java.lang.Math.min(r0, r1)
            java.lang.Object[] r1 = new java.lang.Object[r0]
            r2 = 0
            r3 = r2
        L12:
            if (r3 >= r8) goto L22
            java.lang.Object[] r4 = r7.f1456
            int r5 = r7.f1457
            int r5 = r5 + r3
            int r6 = r4.length
            int r5 = r5 % r6
            r4 = r4[r5]
            r1[r3] = r4
            int r3 = r3 + 1
            goto L12
        L22:
            Yue.ۥۢ۠ۦۢ r3 = Yue.C0040.f94
            Yue.C0586.m2239(r1, r3, r8, r0)
            r7.f1456 = r1
            r7.f1457 = r2
        L2b:
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟ۥۡ, reason: contains not printable characters */
    public final Yue.C6075 m1982(int r4) {
            r3 = this;
            int r0 = r3.f1453
            r1 = 0
            r2 = 1
            if (r4 >= r0) goto La
            int r4 = r4 + r2
            r3.size = r4
            return r1
        La:
            Yue.ۥۣۣ۟ r4 = r3.f1454
            int[] r0 = Yue.C0558.C0559.f1458
            int r4 = r4.ordinal()
            r4 = r0[r4]
            if (r4 == r2) goto L26
            r0 = 2
            if (r4 == r0) goto L23
            r0 = 3
            if (r4 != r0) goto L1d
            goto L28
        L1d:
            Yue.ۥۣۣۡۢ r4 = new Yue.ۥۣۣۡۢ
            r4.<init>()
            throw r4
        L23:
            Yue.ۥۢ۠ۦۢ r1 = Yue.C0040.f95
            goto L28
        L26:
            Yue.ۥۢ۠ۦۢ r1 = Yue.C0040.f96
        L28:
            return r1
    }
}
