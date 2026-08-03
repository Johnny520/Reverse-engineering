package Yue;

import java.util.List;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: renamed from: Yue.ۥ۠ۨ۠ۧ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public class C5857<E> {

    /* JADX INFO: renamed from: ۥ */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f1736 = AtomicReferenceFieldUpdater.newUpdater(C5857.class, Object.class, "_cur");

    @InterfaceC6399
    private volatile /* synthetic */ Object _cur;

    public C5857(boolean z) {
        this._cur = new C5858(8, z);
    }

    /* JADX INFO: renamed from: ۥ */
    public final boolean m2521(@InterfaceC6399 E e) {
        while (true) {
            C5858 c5858 = (C5858) this._cur;
            int iM2523 = c5858.m2523(e);
            if (iM2523 == 0) {
                return true;
            }
            if (iM2523 == 1) {
                C3008.m74(f1736, this, c5858, c5858.m18141());
            } else if (iM2523 == 2) {
                return false;
            }
        }
    }

    /* JADX INFO: renamed from: ۥ۟ */
    public final void m2522() {
        while (true) {
            C5858 c5858 = (C5858) this._cur;
            if (c5858.m18134()) {
                return;
            } else {
                C3008.m74(f1736, this, c5858, c5858.m18141());
            }
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public final int m18128() {
        return ((C5858) this._cur).m18136();
    }

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public final boolean m18129() {
        return ((C5858) this._cur).m18137();
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public final boolean m18130() {
        return ((C5858) this._cur).m18138();
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public final <R> List<R> m18131(@InterfaceC6399 InterfaceC5124<? super E, ? extends R> interfaceC5124) {
        return ((C5858) this._cur).m18139(interfaceC5124);
    }

    @InterfaceC6489
    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public final E m18132() {
        while (true) {
            C5858 c5858 = (C5858) this._cur;
            E e = (E) c5858.m18142();
            if (e != C5858.f14526) {
                return e;
            }
            C3008.m74(f1736, this, c5858, c5858.m18141());
        }
    }
}
