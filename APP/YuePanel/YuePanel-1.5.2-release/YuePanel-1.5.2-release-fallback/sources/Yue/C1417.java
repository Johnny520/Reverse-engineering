package Yue;

/* JADX INFO: renamed from: Yue.ۥ۟ۦۣۢ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public class C1417 {

    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    public static final /* synthetic */ java.util.concurrent.atomic.AtomicIntegerFieldUpdater f4519 = null;

    @Yue.InterfaceC4418
    private volatile /* synthetic */ int _handled;

    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    @Yue.InterfaceC4418
    @Yue.InterfaceC3417
    public final java.lang.Throwable f4520;

    static {
            java.lang.Class<Yue.ۥ۟ۦۣۢ> r0 = Yue.C1417.class
            java.lang.String r1 = "_handled"
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r0 = java.util.concurrent.atomic.AtomicIntegerFieldUpdater.newUpdater(r0, r1)
            Yue.C1417.f4519 = r0
            return
    }

    public C1417(@Yue.InterfaceC4418 java.lang.Throwable r1, boolean r2) {
            r0 = this;
            r0.<init>()
            r0.f4520 = r1
            r0._handled = r2
            return
    }

    public /* synthetic */ C1417(java.lang.Throwable r1, boolean r2, int r3, Yue.C1769 r4) {
            r0 = this;
            r3 = r3 & 2
            if (r3 == 0) goto L5
            r2 = 0
        L5:
            r0.<init>(r1, r2)
            return
    }

    @Yue.InterfaceC4418
    public java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = Yue.C1758.m8350(r2)
            r0.append(r1)
            r1 = 91
            r0.append(r1)
            java.lang.Throwable r1 = r2.f4520
            r0.append(r1)
            r1 = 93
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }

    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public final boolean m7041() {
            r1 = this;
            int r0 = r1._handled
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    public final boolean m7042() {
            r3 = this;
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r0 = Yue.C1417.f4519
            r1 = 0
            r2 = 1
            boolean r0 = r0.compareAndSet(r3, r1, r2)
            return r0
    }
}
