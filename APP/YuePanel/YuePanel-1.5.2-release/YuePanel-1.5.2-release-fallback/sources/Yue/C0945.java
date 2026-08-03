package Yue;

/* JADX INFO: renamed from: Yue.ۥۣ۟ۨۨ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public final class C0945 extends Yue.C1417 {

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static final /* synthetic */ java.util.concurrent.atomic.AtomicIntegerFieldUpdater f2713 = null;

    @Yue.InterfaceC4418
    private volatile /* synthetic */ int _resumed;

    static {
            java.lang.Class<Yue.ۥۣ۟ۨۨ> r0 = Yue.C0945.class
            java.lang.String r1 = "_resumed"
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r0 = java.util.concurrent.atomic.AtomicIntegerFieldUpdater.newUpdater(r0, r1)
            Yue.C0945.f2713 = r0
            return
    }

    public C0945(@Yue.InterfaceC4418 Yue.InterfaceC1598<?> r3, @Yue.InterfaceC4543 java.lang.Throwable r4, boolean r5) {
            r2 = this;
            if (r4 != 0) goto L1d
            java.util.concurrent.CancellationException r4 = new java.util.concurrent.CancellationException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Continuation "
            r0.append(r1)
            r0.append(r3)
            java.lang.String r3 = " was cancelled normally"
            r0.append(r3)
            java.lang.String r3 = r0.toString()
            r4.<init>(r3)
        L1d:
            r2.<init>(r4, r5)
            r3 = 0
            r2._resumed = r3
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public final boolean m5368() {
            r3 = this;
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r0 = Yue.C0945.f2713
            r1 = 0
            r2 = 1
            boolean r0 = r0.compareAndSet(r3, r1, r2)
            return r0
    }
}
