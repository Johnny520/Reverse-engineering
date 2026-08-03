package Yue;

import Yue.AbstractC1448;

/* JADX INFO: renamed from: Yue.ۥ۟ۦۥۨ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC1448<N extends Yue.AbstractC1448<N>> {

    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public static final /* synthetic */ java.util.concurrent.atomic.AtomicReferenceFieldUpdater f4546 = null;

    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    public static final /* synthetic */ java.util.concurrent.atomic.AtomicReferenceFieldUpdater f4547 = null;

    @Yue.InterfaceC4418
    private volatile /* synthetic */ java.lang.Object _next;

    @Yue.InterfaceC4418
    private volatile /* synthetic */ java.lang.Object _prev;

    static {
            java.lang.String r0 = "_next"
            java.lang.Class<Yue.ۥ۟ۦۥۨ> r1 = Yue.AbstractC1448.class
            java.lang.Class<java.lang.Object> r2 = java.lang.Object.class
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(r1, r2, r0)
            Yue.AbstractC1448.f4546 = r0
            java.lang.String r0 = "_prev"
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(r1, r2, r0)
            Yue.AbstractC1448.f4547 = r0
            return
    }

    public AbstractC1448(@Yue.InterfaceC4543 N r2) {
            r1 = this;
            r1.<init>()
            r0 = 0
            r1._next = r0
            r1._prev = r2
            return
    }

    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public static final /* synthetic */ java.lang.Object m7105(Yue.AbstractC1448 r0) {
            java.lang.Object r0 = r0.m7109()
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    public final void m7106() {
            r2 = this;
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = Yue.AbstractC1448.f4547
            r1 = 0
            r0.lazySet(r2, r1)
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public final N m7107() {
            r2 = this;
            Yue.ۥ۟ۦۥۨ r0 = r2.m7110()
        L4:
            if (r0 == 0) goto L11
            boolean r1 = r0.mo7111()
            if (r1 == 0) goto L11
            java.lang.Object r0 = r0._prev
            Yue.ۥ۟ۦۥۨ r0 = (Yue.AbstractC1448) r0
            goto L4
        L11:
            return r0
    }

    @Yue.InterfaceC4543
    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public final N m7108() {
            r2 = this;
            java.lang.Object r0 = m7105(r2)
            Yue.ۥۢ۠ۦۢ r1 = Yue.C1447.m7101()
            if (r0 != r1) goto Lc
            r0 = 0
            return r0
        Lc:
            Yue.ۥ۟ۦۥۨ r0 = (Yue.AbstractC1448) r0
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public final java.lang.Object m7109() {
            r1 = this;
            java.lang.Object r0 = r1._next
            return r0
    }

    @Yue.InterfaceC4543
    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public final N m7110() {
            r1 = this;
            java.lang.Object r0 = r1._prev
            Yue.ۥ۟ۦۥۨ r0 = (Yue.AbstractC1448) r0
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public abstract boolean mo7111();

    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public final N m7112() {
            r2 = this;
            Yue.ۥ۟ۦۥۨ r0 = r2.m7108()
            Yue.C3329.m13903(r0)
        L7:
            boolean r1 = r0.mo7111()
            if (r1 == 0) goto L15
            Yue.ۥ۟ۦۥۨ r0 = r0.m7108()
            Yue.C3329.m13903(r0)
            goto L7
        L15:
            return r0
    }

    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public final boolean m7113() {
            r1 = this;
            Yue.ۥ۟ۦۥۨ r0 = r1.m7108()
            if (r0 != 0) goto L8
            r0 = 1
            goto L9
        L8:
            r0 = 0
        L9:
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
    public final boolean m7114() {
            r3 = this;
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = Yue.AbstractC1448.f4546
            r1 = 0
            Yue.ۥۢ۠ۦۢ r2 = Yue.C1447.m7101()
            boolean r0 = Yue.C0084.m471(r0, r3, r1, r2)
            return r0
    }

    @Yue.InterfaceC4543
    /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
    public final N m7115(@Yue.InterfaceC4418 Yue.InterfaceC2823 r3) {
            r2 = this;
            java.lang.Object r0 = m7105(r2)
            Yue.ۥۢ۠ۦۢ r1 = Yue.C1447.m7101()
            if (r0 == r1) goto Ld
            Yue.ۥ۟ۦۥۨ r0 = (Yue.AbstractC1448) r0
            return r0
        Ld:
            r3.invoke()
            Yue.ۥ۠ۦۧۤ r3 = new Yue.ۥ۠ۦۧۤ
            r3.<init>()
            throw r3
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۦ, reason: contains not printable characters */
    public final void m7116() {
            r2 = this;
        L0:
            Yue.ۥ۟ۦۥۨ r0 = r2.m7107()
            Yue.ۥ۟ۦۥۨ r1 = r2.m7112()
            r1._prev = r0
            if (r0 == 0) goto Le
            r0._next = r1
        Le:
            boolean r1 = r1.mo7111()
            if (r1 != 0) goto L0
            if (r0 == 0) goto L1c
            boolean r0 = r0.mo7111()
            if (r0 != 0) goto L0
        L1c:
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۧ, reason: contains not printable characters */
    public final boolean m7117(@Yue.InterfaceC4418 N r3) {
            r2 = this;
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = Yue.AbstractC1448.f4546
            r1 = 0
            boolean r3 = Yue.C0084.m471(r0, r2, r1, r3)
            return r3
    }
}
