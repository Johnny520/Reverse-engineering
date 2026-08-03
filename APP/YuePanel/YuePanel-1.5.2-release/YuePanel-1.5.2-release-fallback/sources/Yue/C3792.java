package Yue;

/* JADX INFO: renamed from: Yue.ۥ۠ۨ۠ۧ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public class C3792<E> {

    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public static final /* synthetic */ java.util.concurrent.atomic.AtomicReferenceFieldUpdater f12009 = null;

    @Yue.InterfaceC4418
    private volatile /* synthetic */ java.lang.Object _cur;

    static {
            java.lang.Class<java.lang.Object> r0 = java.lang.Object.class
            java.lang.String r1 = "_cur"
            java.lang.Class<Yue.ۥ۠ۨ۠ۧ> r2 = Yue.C3792.class
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(r2, r0, r1)
            Yue.C3792.f12009 = r0
            return
    }

    public C3792(boolean r3) {
            r2 = this;
            r2.<init>()
            Yue.ۥ۠ۨ۠ۨ r0 = new Yue.ۥ۠ۨ۠ۨ
            r1 = 8
            r0.<init>(r1, r3)
            r2._cur = r0
            return
    }

    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public final boolean m15195(@Yue.InterfaceC4418 E r4) {
            r3 = this;
        L0:
            java.lang.Object r0 = r3._cur
            Yue.ۥ۠ۨ۠ۨ r0 = (Yue.C3793) r0
            int r1 = r0.m15202(r4)
            r2 = 1
            if (r1 == 0) goto L1d
            if (r1 == r2) goto L13
            r0 = 2
            if (r1 == r0) goto L11
            goto L0
        L11:
            r4 = 0
            return r4
        L13:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r1 = Yue.C3792.f12009
            Yue.ۥ۠ۨ۠ۨ r2 = r0.m15212()
            Yue.C0084.m471(r1, r3, r0, r2)
            goto L0
        L1d:
            return r2
    }

    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    public final void m15196() {
            r3 = this;
        L0:
            java.lang.Object r0 = r3._cur
            Yue.ۥ۠ۨ۠ۨ r0 = (Yue.C3793) r0
            boolean r1 = r0.m15205()
            if (r1 == 0) goto Lb
            return
        Lb:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r1 = Yue.C3792.f12009
            Yue.ۥ۠ۨ۠ۨ r2 = r0.m15212()
            Yue.C0084.m471(r1, r3, r0, r2)
            goto L0
    }

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public final int m15197() {
            r1 = this;
            java.lang.Object r0 = r1._cur
            Yue.ۥ۠ۨ۠ۨ r0 = (Yue.C3793) r0
            int r0 = r0.m15207()
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public final boolean m15198() {
            r1 = this;
            java.lang.Object r0 = r1._cur
            Yue.ۥ۠ۨ۠ۨ r0 = (Yue.C3793) r0
            boolean r0 = r0.m15208()
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public final boolean m15199() {
            r1 = this;
            java.lang.Object r0 = r1._cur
            Yue.ۥ۠ۨ۠ۨ r0 = (Yue.C3793) r0
            boolean r0 = r0.m15209()
            return r0
    }

    @Yue.InterfaceC4418
    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public final <R> java.util.List<R> m15200(@Yue.InterfaceC4418 Yue.InterfaceC2825<? super E, ? extends R> r2) {
            r1 = this;
            java.lang.Object r0 = r1._cur
            Yue.ۥ۠ۨ۠ۨ r0 = (Yue.C3793) r0
            java.util.List r2 = r0.m15210(r2)
            return r2
    }

    @Yue.InterfaceC4543
    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public final E m15201() {
            r3 = this;
        L0:
            java.lang.Object r0 = r3._cur
            Yue.ۥ۠ۨ۠ۨ r0 = (Yue.C3793) r0
            java.lang.Object r1 = r0.m15213()
            Yue.ۥۢ۠ۦۢ r2 = Yue.C3793.f12025
            if (r1 == r2) goto Ld
            return r1
        Ld:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r1 = Yue.C3792.f12009
            Yue.ۥ۠ۨ۠ۨ r2 = r0.m15212()
            Yue.C0084.m471(r1, r3, r0, r2)
            goto L0
    }
}
