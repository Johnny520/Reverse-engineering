package Yue;

/* JADX INFO: renamed from: Yue.ۥۡۨۡۨ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public final class C5608 {

    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public static final /* synthetic */ java.util.concurrent.atomic.AtomicLongFieldUpdater f20715 = null;

    @Yue.InterfaceC4418
    private volatile /* synthetic */ long number;

    static {
            java.lang.Class<Yue.ۥۡۨۡۨ> r0 = Yue.C5608.class
            java.lang.String r1 = "number"
            java.util.concurrent.atomic.AtomicLongFieldUpdater r0 = java.util.concurrent.atomic.AtomicLongFieldUpdater.newUpdater(r0, r1)
            Yue.C5608.f20715 = r0
            return
    }

    public C5608() {
            r2 = this;
            r2.<init>()
            r0 = 1
            r2.number = r0
            return
    }

    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public final long m20972() {
            r2 = this;
            java.util.concurrent.atomic.AtomicLongFieldUpdater r0 = Yue.C5608.f20715
            long r0 = r0.incrementAndGet(r2)
            return r0
    }
}
