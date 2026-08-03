package Yue;

/* JADX INFO: renamed from: Yue.ۥ۟ۢ۠, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
@Yue.InterfaceC3324
public abstract class AbstractC0641<T> extends Yue.AbstractC4632 {

    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public static final /* synthetic */ java.util.concurrent.atomic.AtomicReferenceFieldUpdater f1627 = null;

    @Yue.InterfaceC4418
    private volatile /* synthetic */ java.lang.Object _consensus;

    static {
            java.lang.Class<java.lang.Object> r0 = java.lang.Object.class
            java.lang.String r1 = "_consensus"
            java.lang.Class<Yue.ۥ۟ۢ۠> r2 = Yue.AbstractC0641.class
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(r2, r0, r1)
            Yue.AbstractC0641.f1627 = r0
            return
    }

    public AbstractC0641() {
            r1 = this;
            r1.<init>()
            java.lang.Object r0 = Yue.C0640.f1625
            r1._consensus = r0
            return
    }

    @Override // Yue.AbstractC4632
    @Yue.InterfaceC4418
    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public Yue.AbstractC0641<?> mo4202() {
            r0 = this;
            return r0
    }

    @Override // Yue.AbstractC4632
    @Yue.InterfaceC4543
    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public final java.lang.Object mo4203(@Yue.InterfaceC4543 java.lang.Object r3) {
            r2 = this;
            java.lang.Object r0 = r2._consensus
            java.lang.Object r1 = Yue.C0640.f1625
            if (r0 != r1) goto Le
            java.lang.Object r0 = r2.mo357(r3)
            java.lang.Object r0 = r2.m4205(r0)
        Le:
            r2.mo4204(r3, r0)
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public abstract void mo4204(T r1, @Yue.InterfaceC4543 java.lang.Object r2);

    @Yue.InterfaceC4543
    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public final java.lang.Object m4205(@Yue.InterfaceC4543 java.lang.Object r3) {
            r2 = this;
            java.lang.Object r0 = r2._consensus
            java.lang.Object r1 = Yue.C0640.f1625
            if (r0 == r1) goto L7
            return r0
        L7:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = Yue.AbstractC0641.f1627
            boolean r0 = Yue.C0084.m471(r0, r2, r1, r3)
            if (r0 == 0) goto L10
            return r3
        L10:
            java.lang.Object r3 = r2._consensus
            return r3
    }

    @Yue.InterfaceC4543
    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public final java.lang.Object m4206() {
            r1 = this;
            java.lang.Object r0 = r1._consensus
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public long mo4207() {
            r2 = this;
            r0 = 0
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public final boolean m4208() {
            r2 = this;
            java.lang.Object r0 = r2._consensus
            java.lang.Object r1 = Yue.C0640.f1625
            if (r0 == r1) goto L8
            r0 = 1
            goto L9
        L8:
            r0 = 0
        L9:
            return r0
    }

    @Yue.InterfaceC4543
    /* JADX INFO: renamed from: ۥۣ۟۟۟ */
    public abstract java.lang.Object mo357(T r1);
}
