package p000;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: renamed from: wr */
/* JADX INFO: loaded from: classes.dex */
public class C0866wr {

    /* JADX INFO: renamed from: a */
    public static final AtomicReferenceFieldUpdater f5014a = AtomicReferenceFieldUpdater.newUpdater(C0866wr.class, Object.class, "_cur");
    private volatile Object _cur = new C0940yr(8, false);

    /* JADX INFO: renamed from: a */
    public final boolean m2595a(Runnable runnable) {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f5014a;
            C0940yr c0940yr = (C0940yr) atomicReferenceFieldUpdater.get(this);
            int iM2738a = c0940yr.m2738a(runnable);
            if (iM2738a == 0) {
                return true;
            }
            if (iM2738a == 1) {
                C0940yr c0940yrM2740c = c0940yr.m2740c();
                while (!atomicReferenceFieldUpdater.compareAndSet(this, c0940yr, c0940yrM2740c) && atomicReferenceFieldUpdater.get(this) == c0940yr) {
                }
            } else if (iM2738a == 2) {
                return false;
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m2596b() {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f5014a;
            C0940yr c0940yr = (C0940yr) atomicReferenceFieldUpdater.get(this);
            if (c0940yr.m2739b()) {
                return;
            }
            C0940yr c0940yrM2740c = c0940yr.m2740c();
            while (!atomicReferenceFieldUpdater.compareAndSet(this, c0940yr, c0940yrM2740c) && atomicReferenceFieldUpdater.get(this) == c0940yr) {
            }
        }
    }

    /* JADX INFO: renamed from: c */
    public final int m2597c() {
        C0940yr c0940yr = (C0940yr) f5014a.get(this);
        c0940yr.getClass();
        long j = C0940yr.f5396f.get(c0940yr);
        return (((int) ((j & 1152921503533105152L) >> 30)) - ((int) (1073741823 & j))) & 1073741823;
    }

    /* JADX INFO: renamed from: d */
    public final Object m2598d() {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f5014a;
            C0940yr c0940yr = (C0940yr) atomicReferenceFieldUpdater.get(this);
            Object objM2741d = c0940yr.m2741d();
            if (objM2741d != C0940yr.f5397g) {
                return objM2741d;
            }
            C0940yr c0940yrM2740c = c0940yr.m2740c();
            while (!atomicReferenceFieldUpdater.compareAndSet(this, c0940yr, c0940yrM2740c) && atomicReferenceFieldUpdater.get(this) == c0940yr) {
            }
        }
    }
}
