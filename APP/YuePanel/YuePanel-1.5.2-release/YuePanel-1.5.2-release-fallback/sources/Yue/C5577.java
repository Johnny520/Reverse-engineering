package Yue;

/* JADX INFO: renamed from: Yue.ۥۡۨ۟ۤ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public final class C5577 implements Yue.InterfaceC5576 {

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static final /* synthetic */ java.util.concurrent.atomic.AtomicReferenceFieldUpdater f20550 = null;

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public static final /* synthetic */ java.util.concurrent.atomic.AtomicLongFieldUpdater f20551 = null;

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public static final /* synthetic */ java.util.concurrent.atomic.AtomicReferenceFieldUpdater f20552 = null;

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public static final /* synthetic */ java.util.concurrent.atomic.AtomicLongFieldUpdater f20553 = null;

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public static final /* synthetic */ java.util.concurrent.atomic.AtomicIntegerFieldUpdater f20554 = null;

    @Yue.InterfaceC4418
    volatile /* synthetic */ int _availablePermits;

    @Yue.InterfaceC4418
    private volatile /* synthetic */ long deqIdx;

    @Yue.InterfaceC4418
    private volatile /* synthetic */ long enqIdx;

    @Yue.InterfaceC4418
    private volatile /* synthetic */ java.lang.Object head;

    @Yue.InterfaceC4418
    private volatile /* synthetic */ java.lang.Object tail;

    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public final int f20555;

    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    @Yue.InterfaceC4418
    public final Yue.InterfaceC2825<java.lang.Throwable, Yue.C6593> f20556;

    /* JADX INFO: renamed from: Yue.ۥۡۨ۟ۤ$ۥ, reason: contains not printable characters */
    public static final class C5578 extends Yue.AbstractC3560 implements Yue.InterfaceC2825<java.lang.Throwable, Yue.C6593> {

        /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
        public final /* synthetic */ Yue.C5577 f20557;

        public C5578(Yue.C5577 r1) {
                r0 = this;
                r0.f20557 = r1
                r1 = 1
                r0.<init>(r1)
                return
        }

        @Override // Yue.InterfaceC2825
        public /* bridge */ /* synthetic */ Yue.C6593 invoke(java.lang.Throwable r1) {
                r0 = this;
                java.lang.Throwable r1 = (java.lang.Throwable) r1
                r0.m20896(r1)
                Yue.ۥۣۢ۠ۤ r1 = Yue.C6593.f23016
                return r1
        }

        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public final void m20896(@Yue.InterfaceC4418 java.lang.Throwable r1) {
                r0 = this;
                Yue.ۥۡۨ۟ۤ r1 = r0.f20557
                r1.release()
                return
        }
    }

    static {
            java.lang.String r0 = "head"
            java.lang.Class<Yue.ۥۡۨ۟ۤ> r1 = Yue.C5577.class
            java.lang.Class<java.lang.Object> r2 = java.lang.Object.class
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(r1, r2, r0)
            Yue.C5577.f20550 = r0
            java.lang.String r0 = "deqIdx"
            java.util.concurrent.atomic.AtomicLongFieldUpdater r0 = java.util.concurrent.atomic.AtomicLongFieldUpdater.newUpdater(r1, r0)
            Yue.C5577.f20551 = r0
            java.lang.String r0 = "tail"
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(r1, r2, r0)
            Yue.C5577.f20552 = r0
            java.lang.String r0 = "enqIdx"
            java.util.concurrent.atomic.AtomicLongFieldUpdater r0 = java.util.concurrent.atomic.AtomicLongFieldUpdater.newUpdater(r1, r0)
            Yue.C5577.f20553 = r0
            java.lang.String r0 = "_availablePermits"
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r0 = java.util.concurrent.atomic.AtomicIntegerFieldUpdater.newUpdater(r1, r0)
            Yue.C5577.f20554 = r0
            return
    }

    public C5577(int r6, int r7) {
            r5 = this;
            r5.<init>()
            r5.f20555 = r6
            r0 = 0
            r5.deqIdx = r0
            r5.enqIdx = r0
            if (r6 <= 0) goto L42
            if (r7 < 0) goto L27
            if (r7 > r6) goto L27
            Yue.ۥۡۨ۟ۦ r2 = new Yue.ۥۡۨ۟ۦ
            r3 = 0
            r4 = 2
            r2.<init>(r0, r3, r4)
            r5.head = r2
            r5.tail = r2
            int r6 = r6 - r7
            r5._availablePermits = r6
            Yue.ۥۡۨ۟ۤ$ۥ r6 = new Yue.ۥۡۨ۟ۤ$ۥ
            r6.<init>(r5)
            r5.f20556 = r6
            return
        L27:
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.String r0 = "The number of acquired permits should be in 0.."
            r7.append(r0)
            r7.append(r6)
            java.lang.String r6 = r7.toString()
            java.lang.IllegalArgumentException r7 = new java.lang.IllegalArgumentException
            java.lang.String r6 = r6.toString()
            r7.<init>(r6)
            throw r7
        L42:
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.String r0 = "Semaphore should have at least 1 permit, but had "
            r7.append(r0)
            r7.append(r6)
            java.lang.String r6 = r7.toString()
            java.lang.IllegalArgumentException r7 = new java.lang.IllegalArgumentException
            java.lang.String r6 = r6.toString()
            r7.<init>(r6)
            throw r7
    }

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public static final /* synthetic */ java.lang.Object m20889(Yue.C5577 r0, Yue.InterfaceC1598 r1) {
            java.lang.Object r0 = r0.m20892(r1)
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public static final /* synthetic */ boolean m20890(Yue.C5577 r0, Yue.InterfaceC0932 r1) {
            boolean r0 = r0.m20893(r1)
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public static final /* synthetic */ Yue.InterfaceC2825 m20891(Yue.C5577 r0) {
            Yue.ۥۣ۠ۡ۟<java.lang.Throwable, Yue.ۥۣۢ۠ۤ> r0 = r0.f20556
            return r0
    }

    @Override // Yue.InterfaceC5576
    public void release() {
            r3 = this;
        L0:
            int r0 = r3._availablePermits
            int r1 = r3.f20555
            if (r0 >= r1) goto L1a
            int r1 = r0 + 1
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r2 = Yue.C5577.f20554
            boolean r1 = r2.compareAndSet(r3, r0, r1)
            if (r1 == 0) goto L0
            if (r0 < 0) goto L13
            return
        L13:
            boolean r0 = r3.m20895()
            if (r0 == 0) goto L0
            return
        L1a:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "The number of released permits cannot be greater than "
            r0.append(r1)
            int r1 = r3.f20555
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = r0.toString()
            r1.<init>(r0)
            throw r1
    }

    @Override // Yue.InterfaceC5576
    /* JADX INFO: renamed from: ۥ */
    public int mo20886() {
            r2 = this;
            int r0 = r2._availablePermits
            r1 = 0
            int r0 = java.lang.Math.max(r0, r1)
            return r0
    }

    @Override // Yue.InterfaceC5576
    @Yue.InterfaceC4543
    /* JADX INFO: renamed from: ۥ۟ */
    public java.lang.Object mo20887(@Yue.InterfaceC4418 Yue.InterfaceC1598<? super Yue.C6593> r2) {
            r1 = this;
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r0 = Yue.C5577.f20554
            int r0 = r0.getAndDecrement(r1)
            if (r0 <= 0) goto Lb
            Yue.ۥۣۢ۠ۤ r2 = Yue.C6593.f23016
            return r2
        Lb:
            java.lang.Object r2 = r1.m20892(r2)
            java.lang.Object r0 = Yue.C3341.m13947()
            if (r2 != r0) goto L16
            return r2
        L16:
            Yue.ۥۣۢ۠ۤ r2 = Yue.C6593.f23016
            return r2
    }

    @Override // Yue.InterfaceC5576
    /* JADX INFO: renamed from: ۥ۟۟ */
    public boolean mo20888() {
            r3 = this;
        L0:
            int r0 = r3._availablePermits
            if (r0 > 0) goto L6
            r0 = 0
            return r0
        L6:
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r1 = Yue.C5577.f20554
            int r2 = r0 + (-1)
            boolean r0 = r1.compareAndSet(r3, r0, r2)
            if (r0 == 0) goto L0
            r0 = 1
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public final java.lang.Object m20892(Yue.InterfaceC1598<? super Yue.C6593> r4) {
            r3 = this;
            Yue.ۥ۟ۧۤۢ r0 = Yue.C3332.m13940(r4)
            Yue.ۥۣ۟ۨ۠ r0 = Yue.C0936.m5346(r0)
        L8:
            boolean r1 = m20890(r3, r0)
            if (r1 != 0) goto L1f
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r1 = Yue.C5577.f20554
            int r1 = r1.getAndDecrement(r3)
            if (r1 <= 0) goto L8
            Yue.ۥۣۢ۠ۤ r1 = Yue.C6593.f23016
            Yue.ۥۣ۠ۡ۟ r2 = m20891(r3)
            r0.mo5301(r1, r2)
        L1f:
            java.lang.Object r0 = r0.m5329()
            java.lang.Object r1 = Yue.C3341.m13947()
            if (r0 != r1) goto L2c
            Yue.C1757.m8349(r4)
        L2c:
            java.lang.Object r4 = Yue.C3341.m13947()
            if (r0 != r4) goto L33
            return r0
        L33:
            Yue.ۥۣۢ۠ۤ r4 = Yue.C6593.f23016
            return r4
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public final boolean m20893(Yue.InterfaceC0932<? super Yue.C6593> r13) {
            r12 = this;
            java.lang.Object r0 = r12.tail
            Yue.ۥۡۨ۟ۦ r0 = (Yue.C5581) r0
            java.util.concurrent.atomic.AtomicLongFieldUpdater r1 = Yue.C5577.f20553
            long r1 = r1.getAndIncrement(r12)
            int r3 = Yue.C5579.m20904()
            long r3 = (long) r3
            long r3 = r1 / r3
        L11:
            r5 = r0
        L12:
            long r6 = r5.m20811()
            int r6 = (r6 > r3 ? 1 : (r6 == r3 ? 0 : -1))
            if (r6 < 0) goto L26
            boolean r6 = r5.mo7111()
            if (r6 == 0) goto L21
            goto L26
        L21:
            java.lang.Object r5 = Yue.C5549.m20816(r5)
            goto L38
        L26:
            java.lang.Object r6 = Yue.AbstractC1448.m7105(r5)
            Yue.ۥۢ۠ۦۢ r7 = Yue.C1447.m7101()
            if (r6 != r7) goto Lb0
            Yue.ۥۢ۠ۦۢ r5 = Yue.C1447.m7101()
            java.lang.Object r5 = Yue.C5549.m20816(r5)
        L38:
            boolean r6 = Yue.C5549.m20822(r5)
            if (r6 != 0) goto L76
            Yue.ۥۡۧۨ۟ r6 = Yue.C5549.m20820(r5)
        L42:
            java.lang.Object r7 = r12.tail
            Yue.ۥۡۧۨ۟ r7 = (Yue.AbstractC5548) r7
            long r8 = r7.m20811()
            long r10 = r6.m20811()
            int r8 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r8 < 0) goto L53
            goto L76
        L53:
            boolean r8 = r6.m20814()
            if (r8 != 0) goto L5a
            goto L11
        L5a:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r8 = Yue.C5577.f20552
            boolean r8 = Yue.C0084.m471(r8, r12, r7, r6)
            if (r8 == 0) goto L6c
            boolean r0 = r7.m20810()
            if (r0 == 0) goto L76
            r7.m7116()
            goto L76
        L6c:
            boolean r7 = r6.m20810()
            if (r7 == 0) goto L42
            r6.m7116()
            goto L42
        L76:
            Yue.ۥۡۧۨ۟ r0 = Yue.C5549.m20820(r5)
            Yue.ۥۡۨ۟ۦ r0 = (Yue.C5581) r0
            int r3 = Yue.C5579.m20904()
            long r3 = (long) r3
            long r1 = r1 % r3
            int r1 = (int) r1
            java.util.concurrent.atomic.AtomicReferenceArray r2 = r0.f20568
            r3 = 0
            boolean r2 = Yue.C1449.m7118(r2, r1, r3, r13)
            r3 = 1
            if (r2 == 0) goto L96
            Yue.ۥۣ۟ۧۨ r2 = new Yue.ۥۣ۟ۧۨ
            r2.<init>(r0, r1)
            r13.mo5308(r2)
            return r3
        L96:
            Yue.ۥۢ۠ۦۢ r2 = Yue.C5579.m20903()
            Yue.ۥۢ۠ۦۢ r4 = Yue.C5579.m20905()
            java.util.concurrent.atomic.AtomicReferenceArray r0 = r0.f20568
            boolean r0 = Yue.C1449.m7118(r0, r1, r2, r4)
            if (r0 == 0) goto Lae
            Yue.ۥۣۢ۠ۤ r0 = Yue.C6593.f23016
            Yue.ۥۣ۠ۡ۟<java.lang.Throwable, Yue.ۥۣۢ۠ۤ> r1 = r12.f20556
            r13.mo5301(r0, r1)
            return r3
        Lae:
            r13 = 0
            return r13
        Lb0:
            Yue.ۥ۟ۦۥۨ r6 = (Yue.AbstractC1448) r6
            Yue.ۥۡۧۨ۟ r6 = (Yue.AbstractC5548) r6
            if (r6 == 0) goto Lb9
        Lb6:
            r5 = r6
            goto L12
        Lb9:
            long r6 = r5.m20811()
            r8 = 1
            long r6 = r6 + r8
            r8 = r5
            Yue.ۥۡۨ۟ۦ r8 = (Yue.C5581) r8
            Yue.ۥۡۨ۟ۦ r6 = Yue.C5579.m20899(r6, r8)
            boolean r7 = r5.m7117(r6)
            if (r7 == 0) goto L12
            boolean r7 = r5.mo7111()
            if (r7 == 0) goto Lb6
            r5.m7116()
            goto Lb6
    }

    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public final boolean m20894(Yue.InterfaceC0932<? super Yue.C6593> r4) {
            r3 = this;
            Yue.ۥۣۢ۠ۤ r0 = Yue.C6593.f23016
            r1 = 0
            Yue.ۥۣ۠ۡ۟<java.lang.Throwable, Yue.ۥۣۢ۠ۤ> r2 = r3.f20556
            java.lang.Object r0 = r4.mo5306(r0, r1, r2)
            if (r0 != 0) goto Ld
            r4 = 0
            return r4
        Ld:
            r4.mo5309(r0)
            r4 = 1
            return r4
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
    public final boolean m20895() {
            r12 = this;
            java.lang.Object r0 = r12.head
            Yue.ۥۡۨ۟ۦ r0 = (Yue.C5581) r0
            java.util.concurrent.atomic.AtomicLongFieldUpdater r1 = Yue.C5577.f20551
            long r1 = r1.getAndIncrement(r12)
            int r3 = Yue.C5579.m20904()
            long r3 = (long) r3
            long r3 = r1 / r3
        L11:
            r5 = r0
        L12:
            long r6 = r5.m20811()
            int r6 = (r6 > r3 ? 1 : (r6 == r3 ? 0 : -1))
            if (r6 < 0) goto L26
            boolean r6 = r5.mo7111()
            if (r6 == 0) goto L21
            goto L26
        L21:
            java.lang.Object r5 = Yue.C5549.m20816(r5)
            goto L38
        L26:
            java.lang.Object r6 = Yue.AbstractC1448.m7105(r5)
            Yue.ۥۢ۠ۦۢ r7 = Yue.C1447.m7101()
            if (r6 != r7) goto Ld1
            Yue.ۥۢ۠ۦۢ r5 = Yue.C1447.m7101()
            java.lang.Object r5 = Yue.C5549.m20816(r5)
        L38:
            boolean r6 = Yue.C5549.m20822(r5)
            if (r6 != 0) goto L76
            Yue.ۥۡۧۨ۟ r6 = Yue.C5549.m20820(r5)
        L42:
            java.lang.Object r7 = r12.head
            Yue.ۥۡۧۨ۟ r7 = (Yue.AbstractC5548) r7
            long r8 = r7.m20811()
            long r10 = r6.m20811()
            int r8 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r8 < 0) goto L53
            goto L76
        L53:
            boolean r8 = r6.m20814()
            if (r8 != 0) goto L5a
            goto L11
        L5a:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r8 = Yue.C5577.f20550
            boolean r8 = Yue.C0084.m471(r8, r12, r7, r6)
            if (r8 == 0) goto L6c
            boolean r0 = r7.m20810()
            if (r0 == 0) goto L76
            r7.m7116()
            goto L76
        L6c:
            boolean r7 = r6.m20810()
            if (r7 == 0) goto L42
            r6.m7116()
            goto L42
        L76:
            Yue.ۥۡۧۨ۟ r0 = Yue.C5549.m20820(r5)
            Yue.ۥۡۨ۟ۦ r0 = (Yue.C5581) r0
            r0.m7106()
            long r5 = r0.m20811()
            int r3 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            r4 = 0
            if (r3 <= 0) goto L89
            return r4
        L89:
            int r3 = Yue.C5579.m20904()
            long r5 = (long) r3
            long r1 = r1 % r5
            int r1 = (int) r1
            Yue.ۥۢ۠ۦۢ r2 = Yue.C5579.m20903()
            java.util.concurrent.atomic.AtomicReferenceArray r3 = r0.f20568
            java.lang.Object r2 = r3.getAndSet(r1, r2)
            if (r2 != 0) goto Lc3
            int r2 = Yue.C5579.m20902()
        La0:
            r3 = 1
            if (r4 >= r2) goto Lb3
            java.util.concurrent.atomic.AtomicReferenceArray r5 = r0.f20568
            java.lang.Object r5 = r5.get(r1)
            Yue.ۥۢ۠ۦۢ r6 = Yue.C5579.m20905()
            if (r5 != r6) goto Lb0
            return r3
        Lb0:
            int r4 = r4 + 1
            goto La0
        Lb3:
            Yue.ۥۢ۠ۦۢ r2 = Yue.C5579.m20903()
            Yue.ۥۢ۠ۦۢ r4 = Yue.C5579.m20900()
            java.util.concurrent.atomic.AtomicReferenceArray r0 = r0.f20568
            boolean r0 = Yue.C1449.m7118(r0, r1, r2, r4)
            r0 = r0 ^ r3
            return r0
        Lc3:
            Yue.ۥۢ۠ۦۢ r0 = Yue.C5579.m20901()
            if (r2 != r0) goto Lca
            return r4
        Lca:
            Yue.ۥۣ۟ۨ۟ r2 = (Yue.InterfaceC0932) r2
            boolean r0 = r12.m20894(r2)
            return r0
        Ld1:
            Yue.ۥ۟ۦۥۨ r6 = (Yue.AbstractC1448) r6
            Yue.ۥۡۧۨ۟ r6 = (Yue.AbstractC5548) r6
            if (r6 == 0) goto Lda
        Ld7:
            r5 = r6
            goto L12
        Lda:
            long r6 = r5.m20811()
            r8 = 1
            long r6 = r6 + r8
            r8 = r5
            Yue.ۥۡۨ۟ۦ r8 = (Yue.C5581) r8
            Yue.ۥۡۨ۟ۦ r6 = Yue.C5579.m20899(r6, r8)
            boolean r7 = r5.m7117(r6)
            if (r7 == 0) goto L12
            boolean r7 = r5.mo7111()
            if (r7 == 0) goto Ld7
            r5.m7116()
            goto Ld7
    }
}
