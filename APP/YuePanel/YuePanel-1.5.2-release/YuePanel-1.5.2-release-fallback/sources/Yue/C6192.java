package Yue;

/* JADX INFO: renamed from: Yue.ۥۢۡۢۥ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public final class C6192 implements Yue.InterfaceC2825<java.lang.Throwable, Yue.C6593> {

    /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
    public static final /* synthetic */ java.util.concurrent.atomic.AtomicIntegerFieldUpdater f22172 = null;

    @Yue.InterfaceC4418
    private volatile /* synthetic */ int _state;

    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    @Yue.InterfaceC4418
    public final Yue.InterfaceC3383 f22173;

    /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
    public final java.lang.Thread f22174;

    /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
    @Yue.InterfaceC4543
    public Yue.InterfaceC1892 f22175;

    static {
            java.lang.Class<Yue.ۥۢۡۢۥ> r0 = Yue.C6192.class
            java.lang.String r1 = "_state"
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r0 = java.util.concurrent.atomic.AtomicIntegerFieldUpdater.newUpdater(r0, r1)
            Yue.C6192.f22172 = r0
            return
    }

    public C6192(@Yue.InterfaceC4418 Yue.InterfaceC3383 r1) {
            r0 = this;
            r0.<init>()
            r0.f22173 = r1
            r1 = 0
            r0._state = r1
            java.lang.Thread r1 = java.lang.Thread.currentThread()
            r0.f22174 = r1
            return
    }

    @Override // Yue.InterfaceC2825
    public /* bridge */ /* synthetic */ Yue.C6593 invoke(java.lang.Throwable r1) {
            r0 = this;
            java.lang.Throwable r1 = (java.lang.Throwable) r1
            r0.m23169(r1)
            Yue.ۥۣۢ۠ۤ r1 = Yue.C6593.f23016
            return r1
    }

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public final void m23167() {
            r3 = this;
        L0:
            int r0 = r3._state
            if (r0 == 0) goto L17
            r1 = 2
            if (r0 == r1) goto L0
            r1 = 3
            if (r0 != r1) goto Le
            java.lang.Thread.interrupted()
            return
        Le:
            r3.m23168(r0)
            Yue.ۥ۠ۦۧۤ r0 = new Yue.ۥ۠ۦۧۤ
            r0.<init>()
            throw r0
        L17:
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r1 = Yue.C6192.f22172
            r2 = 1
            boolean r0 = r1.compareAndSet(r3, r0, r2)
            if (r0 == 0) goto L0
            Yue.ۥۣۣ۠۟ r0 = r3.f22175
            if (r0 == 0) goto L27
            r0.mo352()
        L27:
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public final java.lang.Void m23168(int r4) {
            r3 = this;
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Illegal state "
            r1.append(r2)
            r1.append(r4)
            java.lang.String r4 = r1.toString()
            java.lang.String r4 = r4.toString()
            r0.<init>(r4)
            throw r0
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public void m23169(@Yue.InterfaceC4543 java.lang.Throwable r4) {
            r3 = this;
        L0:
            int r4 = r3._state
            r0 = 3
            r1 = 2
            if (r4 == 0) goto L18
            r2 = 1
            if (r4 == r2) goto L17
            if (r4 == r1) goto L17
            if (r4 != r0) goto Le
            goto L17
        Le:
            r3.m23168(r4)
            Yue.ۥ۠ۦۧۤ r4 = new Yue.ۥ۠ۦۧۤ
            r4.<init>()
            throw r4
        L17:
            return
        L18:
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r2 = Yue.C6192.f22172
            boolean r4 = r2.compareAndSet(r3, r4, r1)
            if (r4 == 0) goto L0
            java.lang.Thread r4 = r3.f22174
            r4.interrupt()
            r3._state = r0
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public final void m23170() {
            r3 = this;
            Yue.ۥ۠ۦ۟ۡ r0 = r3.f22173
            r1 = 1
            Yue.ۥۣۣ۠۟ r0 = r0.mo13983(r1, r1, r3)
            r3.f22175 = r0
        L9:
            int r0 = r3._state
            if (r0 == 0) goto L1e
            r1 = 2
            if (r0 == r1) goto L1d
            r1 = 3
            if (r0 != r1) goto L14
            goto L1d
        L14:
            r3.m23168(r0)
            Yue.ۥ۠ۦۧۤ r0 = new Yue.ۥ۠ۦۧۤ
            r0.<init>()
            throw r0
        L1d:
            return
        L1e:
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r1 = Yue.C6192.f22172
            r2 = 0
            boolean r0 = r1.compareAndSet(r3, r0, r2)
            if (r0 == 0) goto L9
            return
    }
}
