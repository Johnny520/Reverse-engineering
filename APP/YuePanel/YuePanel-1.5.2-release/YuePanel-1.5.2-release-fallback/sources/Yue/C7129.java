package Yue;

/* JADX INFO: renamed from: Yue.ۥۢۦ۟ۦ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public final class C7129 {

    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    public static final /* synthetic */ java.util.concurrent.atomic.AtomicReferenceFieldUpdater f24652 = null;

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static final /* synthetic */ java.util.concurrent.atomic.AtomicIntegerFieldUpdater f24653 = null;

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public static final /* synthetic */ java.util.concurrent.atomic.AtomicIntegerFieldUpdater f24654 = null;

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public static final /* synthetic */ java.util.concurrent.atomic.AtomicIntegerFieldUpdater f24655 = null;

    @Yue.InterfaceC4418
    private volatile /* synthetic */ int blockingTasksInBuffer;

    @Yue.InterfaceC4418
    private volatile /* synthetic */ int consumerIndex;

    @Yue.InterfaceC4418
    private volatile /* synthetic */ java.lang.Object lastScheduledTask;

    @Yue.InterfaceC4418
    private volatile /* synthetic */ int producerIndex;

    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    @Yue.InterfaceC4418
    public final java.util.concurrent.atomic.AtomicReferenceArray<Yue.AbstractRunnableC6112> f24656;

    static {
            java.lang.Class<java.lang.Object> r0 = java.lang.Object.class
            java.lang.String r1 = "lastScheduledTask"
            java.lang.Class<Yue.ۥۢۦ۟ۦ> r2 = Yue.C7129.class
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(r2, r0, r1)
            Yue.C7129.f24652 = r0
            java.lang.String r0 = "producerIndex"
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r0 = java.util.concurrent.atomic.AtomicIntegerFieldUpdater.newUpdater(r2, r0)
            Yue.C7129.f24653 = r0
            java.lang.String r0 = "consumerIndex"
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r0 = java.util.concurrent.atomic.AtomicIntegerFieldUpdater.newUpdater(r2, r0)
            Yue.C7129.f24654 = r0
            java.lang.String r0 = "blockingTasksInBuffer"
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r0 = java.util.concurrent.atomic.AtomicIntegerFieldUpdater.newUpdater(r2, r0)
            Yue.C7129.f24655 = r0
            return
    }

    public C7129() {
            r2 = this;
            r2.<init>()
            java.util.concurrent.atomic.AtomicReferenceArray r0 = new java.util.concurrent.atomic.AtomicReferenceArray
            r1 = 128(0x80, float:1.8E-43)
            r0.<init>(r1)
            r2.f24656 = r0
            r0 = 0
            r2.lastScheduledTask = r0
            r0 = 0
            r2.producerIndex = r0
            r2.consumerIndex = r0
            r2.blockingTasksInBuffer = r0
            return
    }

    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    public static /* synthetic */ Yue.AbstractRunnableC6112 m27448(Yue.C7129 r0, Yue.AbstractRunnableC6112 r1, boolean r2, int r3, java.lang.Object r4) {
            r3 = r3 & 2
            if (r3 == 0) goto L5
            r2 = 0
        L5:
            Yue.ۥۢ۠ۨۧ r0 = r0.m27449(r1, r2)
            return r0
    }

    @Yue.InterfaceC4543
    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public final Yue.AbstractRunnableC6112 m27449(@Yue.InterfaceC4418 Yue.AbstractRunnableC6112 r1, boolean r2) {
            r0 = this;
            if (r2 == 0) goto L7
            Yue.ۥۢ۠ۨۧ r1 = r0.m27450(r1)
            return r1
        L7:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r2 = Yue.C7129.f24652
            java.lang.Object r1 = r2.getAndSet(r0, r1)
            Yue.ۥۢ۠ۨۧ r1 = (Yue.AbstractRunnableC6112) r1
            if (r1 != 0) goto L13
            r1 = 0
            return r1
        L13:
            Yue.ۥۢ۠ۨۧ r1 = r0.m27450(r1)
            return r1
    }

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public final Yue.AbstractRunnableC6112 m27450(Yue.AbstractRunnableC6112 r3) {
            r2 = this;
            Yue.ۥۢ۠ۨۨ r0 = r3.f22060
            int r0 = r0.mo14527()
            r1 = 1
            if (r0 != r1) goto Le
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r0 = Yue.C7129.f24655
            r0.incrementAndGet(r2)
        Le:
            int r0 = r2.m27452()
            r1 = 127(0x7f, float:1.78E-43)
            if (r0 != r1) goto L17
            return r3
        L17:
            int r0 = r2.producerIndex
            r0 = r0 & r1
        L1a:
            java.util.concurrent.atomic.AtomicReferenceArray<Yue.ۥۢ۠ۨۧ> r1 = r2.f24656
            java.lang.Object r1 = r1.get(r0)
            if (r1 == 0) goto L26
            java.lang.Thread.yield()
            goto L1a
        L26:
            java.util.concurrent.atomic.AtomicReferenceArray<Yue.ۥۢ۠ۨۧ> r1 = r2.f24656
            r1.lazySet(r0, r3)
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r3 = Yue.C7129.f24653
            r3.incrementAndGet(r2)
            r3 = 0
            return r3
    }

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public final void m27451(Yue.AbstractRunnableC6112 r2) {
            r1 = this;
            if (r2 == 0) goto L10
            Yue.ۥۢ۠ۨۨ r2 = r2.f22060
            int r2 = r2.mo14527()
            r0 = 1
            if (r2 != r0) goto L10
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r2 = Yue.C7129.f24655
            r2.decrementAndGet(r1)
        L10:
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public final int m27452() {
            r2 = this;
            int r0 = r2.producerIndex
            int r1 = r2.consumerIndex
            int r0 = r0 - r1
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public final int m27453() {
            r1 = this;
            java.lang.Object r0 = r1.lastScheduledTask
            if (r0 == 0) goto Lb
            int r0 = r1.m27452()
            int r0 = r0 + 1
            goto Lf
        Lb:
            int r0 = r1.m27452()
        Lf:
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public final void m27454(@Yue.InterfaceC4418 Yue.C2885 r3) {
            r2 = this;
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = Yue.C7129.f24652
            r1 = 0
            java.lang.Object r0 = r0.getAndSet(r2, r1)
            Yue.ۥۢ۠ۨۧ r0 = (Yue.AbstractRunnableC6112) r0
            if (r0 == 0) goto Le
            r3.m15195(r0)
        Le:
            boolean r0 = r2.m27457(r3)
            if (r0 != 0) goto Le
            return
    }

    @Yue.InterfaceC4543
    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public final Yue.AbstractRunnableC6112 m27455() {
            r2 = this;
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = Yue.C7129.f24652
            r1 = 0
            java.lang.Object r0 = r0.getAndSet(r2, r1)
            Yue.ۥۢ۠ۨۧ r0 = (Yue.AbstractRunnableC6112) r0
            if (r0 != 0) goto Lf
            Yue.ۥۢ۠ۨۧ r0 = r2.m27456()
        Lf:
            return r0
    }

    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public final Yue.AbstractRunnableC6112 m27456() {
            r5 = this;
        L0:
            int r0 = r5.consumerIndex
            int r1 = r5.producerIndex
            int r1 = r0 - r1
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            r1 = r0 & 127(0x7f, float:1.78E-43)
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r3 = Yue.C7129.f24654
            int r4 = r0 + 1
            boolean r0 = r3.compareAndSet(r5, r0, r4)
            if (r0 == 0) goto L0
            java.util.concurrent.atomic.AtomicReferenceArray<Yue.ۥۢ۠ۨۧ> r0 = r5.f24656
            java.lang.Object r0 = r0.getAndSet(r1, r2)
            Yue.ۥۢ۠ۨۧ r0 = (Yue.AbstractRunnableC6112) r0
            if (r0 != 0) goto L21
            goto L0
        L21:
            r5.m27451(r0)
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
    public final boolean m27457(Yue.C2885 r2) {
            r1 = this;
            Yue.ۥۢ۠ۨۧ r0 = r1.m27456()
            if (r0 != 0) goto L8
            r2 = 0
            return r2
        L8:
            r2.m15195(r0)
            r2 = 1
            return r2
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
    public final long m27458(@Yue.InterfaceC4418 Yue.C7129 r8) {
            r7 = this;
            int r0 = r8.consumerIndex
            int r1 = r8.producerIndex
            java.util.concurrent.atomic.AtomicReferenceArray<Yue.ۥۢ۠ۨۧ> r2 = r8.f24656
        L6:
            r3 = 1
            if (r0 == r1) goto L36
            r4 = r0 & 127(0x7f, float:1.78E-43)
            int r5 = r8.blockingTasksInBuffer
            if (r5 == 0) goto L36
            java.lang.Object r5 = r2.get(r4)
            Yue.ۥۢ۠ۨۧ r5 = (Yue.AbstractRunnableC6112) r5
            if (r5 == 0) goto L33
            Yue.ۥۢ۠ۨۨ r6 = r5.f22060
            int r6 = r6.mo14527()
            if (r6 != r3) goto L33
            r3 = 0
            boolean r4 = Yue.C1449.m7118(r2, r4, r5, r3)
            if (r4 == 0) goto L33
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r0 = Yue.C7129.f24655
            r0.decrementAndGet(r8)
            r8 = 0
            r0 = 2
            m27448(r7, r5, r8, r0, r3)
            r0 = -1
            return r0
        L33:
            int r0 = r0 + 1
            goto L6
        L36:
            long r0 = r7.m27460(r8, r3)
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۦ, reason: contains not printable characters */
    public final long m27459(@Yue.InterfaceC4418 Yue.C7129 r4) {
            r3 = this;
            Yue.ۥۢ۠ۨۧ r0 = r4.m27456()
            r1 = 0
            if (r0 == 0) goto Lf
            r4 = 2
            r2 = 0
            m27448(r3, r0, r1, r4, r2)
            r0 = -1
            return r0
        Lf:
            long r0 = r3.m27460(r4, r1)
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۧ, reason: contains not printable characters */
    public final long m27460(Yue.C7129 r7, boolean r8) {
            r6 = this;
        L0:
            java.lang.Object r0 = r7.lastScheduledTask
            Yue.ۥۢ۠ۨۧ r0 = (Yue.AbstractRunnableC6112) r0
            r1 = -2
            if (r0 != 0) goto L9
            return r1
        L9:
            if (r8 == 0) goto L16
            Yue.ۥۢ۠ۨۨ r3 = r0.f22060
            int r3 = r3.mo14527()
            r4 = 1
            if (r3 != r4) goto L15
            goto L16
        L15:
            return r1
        L16:
            Yue.ۥۡۧۤۨ r1 = Yue.C6129.f22092
            long r1 = r1.mo17204()
            long r3 = r0.f22059
            long r1 = r1 - r3
            long r3 = Yue.C6129.f22088
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 >= 0) goto L27
            long r3 = r3 - r1
            return r3
        L27:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r1 = Yue.C7129.f24652
            r2 = 0
            boolean r1 = Yue.C0084.m471(r1, r7, r0, r2)
            if (r1 == 0) goto L0
            r7 = 0
            r8 = 2
            m27448(r6, r0, r7, r8, r2)
            r7 = -1
            return r7
    }
}
