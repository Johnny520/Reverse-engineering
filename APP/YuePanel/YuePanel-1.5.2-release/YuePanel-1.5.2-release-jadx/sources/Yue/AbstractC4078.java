package Yue;

import Yue.AbstractC4078;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: renamed from: Yue.ۥ۟ۦۥۨ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC4078<N extends AbstractC4078<N>> {

    /* JADX INFO: renamed from: ۥ */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f653 = AtomicReferenceFieldUpdater.newUpdater(AbstractC4078.class, Object.class, "_next");

    /* JADX INFO: renamed from: ۥ۟ */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f654 = AtomicReferenceFieldUpdater.newUpdater(AbstractC4078.class, Object.class, "_prev");

    @InterfaceC6399
    private volatile /* synthetic */ Object _next = null;

    @InterfaceC6399
    private volatile /* synthetic */ Object _prev;

    public AbstractC4078(@InterfaceC6489 N n) {
        this._prev = n;
    }

    /* JADX INFO: renamed from: ۥ۟ */
    public final void m1035() {
        f654.lazySet(this, null);
    }

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public final N m11515() {
        N n = (N) m11518();
        while (n != null && n.mo11519()) {
            n = (N) n._prev;
        }
        return n;
    }

    /* JADX DEBUG: Class process forced to load method for inline: Yue.ۥ۟ۦۥۧ.ۥ():Yue.ۥۢ۠ۦۢ */
    @InterfaceC6489
    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public final N m11516() {
        Object objM11517 = m11517();
        if (objM11517 == C4077.f652) {
            return null;
        }
        return (N) objM11517;
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public final Object m11517() {
        return this._next;
    }

    @InterfaceC6489
    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public final N m11518() {
        return (N) this._prev;
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public abstract boolean mo11519();

    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public final N m11520() {
        N n = (N) m11516();
        C5499.m17100(n);
        while (n.mo11519()) {
            n = (N) n.m11516();
            C5499.m17100(n);
        }
        return n;
    }

    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public final boolean m11521() {
        return m11516() == null;
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
    public final boolean m11522() {
        return C3008.m74(f653, this, null, C4077.f652);
    }

    @InterfaceC6489
    /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
    public final N m11523(@InterfaceC6399 InterfaceC5122 interfaceC5122) {
        Object objM11517 = m11517();
        if (objM11517 != C4077.f652) {
            return (N) objM11517;
        }
        interfaceC5122.invoke();
        throw new C5667();
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۦ, reason: contains not printable characters */
    public final void m11524() {
        while (true) {
            AbstractC4078 abstractC4078M11515 = m11515();
            AbstractC4078 abstractC4078M11520 = m11520();
            abstractC4078M11520._prev = abstractC4078M11515;
            if (abstractC4078M11515 != null) {
                abstractC4078M11515._next = abstractC4078M11520;
            }
            if (!abstractC4078M11520.mo11519() && (abstractC4078M11515 == null || !abstractC4078M11515.mo11519())) {
                return;
            }
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۧ, reason: contains not printable characters */
    public final boolean m11525(@InterfaceC6399 N n) {
        return C3008.m74(f653, this, null, n);
    }
}
