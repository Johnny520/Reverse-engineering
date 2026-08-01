package p000;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: renamed from: as */
/* JADX INFO: loaded from: classes.dex */
public class C0042as {

    /* JADX INFO: renamed from: a */
    public static final AtomicReferenceFieldUpdater f630a = AtomicReferenceFieldUpdater.newUpdater(C0042as.class, Object.class, "_cur");
    private volatile Object _cur = new C0125cs(8, false);

    /* JADX INFO: renamed from: a */
    public final boolean m470a(Runnable runnable) {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f630a;
            C0125cs c0125cs = (C0125cs) atomicReferenceFieldUpdater.get(this);
            int iM779a = c0125cs.m779a(runnable);
            if (iM779a == 0) {
                return true;
            }
            if (iM779a == 1) {
                C0125cs c0125csM781c = c0125cs.m781c();
                while (!atomicReferenceFieldUpdater.compareAndSet(this, c0125cs, c0125csM781c) && atomicReferenceFieldUpdater.get(this) == c0125cs) {
                }
            } else if (iM779a == 2) {
                return false;
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m471b() {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f630a;
            C0125cs c0125cs = (C0125cs) atomicReferenceFieldUpdater.get(this);
            if (c0125cs.m780b()) {
                return;
            }
            C0125cs c0125csM781c = c0125cs.m781c();
            while (!atomicReferenceFieldUpdater.compareAndSet(this, c0125cs, c0125csM781c) && atomicReferenceFieldUpdater.get(this) == c0125cs) {
            }
        }
    }

    /* JADX INFO: renamed from: c */
    public final int m472c() {
        C0125cs c0125cs = (C0125cs) f630a.get(this);
        c0125cs.getClass();
        long j = C0125cs.f1253f.get(c0125cs);
        return (((int) ((j & 1152921503533105152L) >> 30)) - ((int) (1073741823 & j))) & 1073741823;
    }

    /* JADX INFO: renamed from: d */
    public final Object m473d() {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f630a;
            C0125cs c0125cs = (C0125cs) atomicReferenceFieldUpdater.get(this);
            Object objM782d = c0125cs.m782d();
            if (objM782d != C0125cs.f1254g) {
                return objM782d;
            }
            C0125cs c0125csM781c = c0125cs.m781c();
            while (!atomicReferenceFieldUpdater.compareAndSet(this, c0125cs, c0125csM781c) && atomicReferenceFieldUpdater.get(this) == c0125cs) {
            }
        }
    }
}
