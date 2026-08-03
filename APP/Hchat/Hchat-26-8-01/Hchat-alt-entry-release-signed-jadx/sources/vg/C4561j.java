package vg;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: renamed from: vg.j */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public class C4561j {

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f15040a = AtomicReferenceFieldUpdater.newUpdater(C4561j.class, Object.class, "_cur$volatile");
    private volatile /* synthetic */ Object _cur$volatile = new C4563l(8, false);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public final boolean m9003a(Runnable runnable) {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f15040a;
            C4563l c4563l = (C4563l) atomicReferenceFieldUpdater.get(this);
            int iM9007a = c4563l.m9007a(runnable);
            if (iM9007a == 0) {
                return true;
            }
            if (iM9007a == 1) {
                C4563l c4563lM9009c = c4563l.m9009c();
                while (!atomicReferenceFieldUpdater.compareAndSet(this, c4563l, c4563lM9009c) && atomicReferenceFieldUpdater.get(this) == c4563l) {
                }
            } else if (iM9007a == 2) {
                return false;
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b */
    public final void m9004b() {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f15040a;
            C4563l c4563l = (C4563l) atomicReferenceFieldUpdater.get(this);
            if (c4563l.m9008b()) {
                return;
            }
            C4563l c4563lM9009c = c4563l.m9009c();
            while (!atomicReferenceFieldUpdater.compareAndSet(this, c4563l, c4563lM9009c) && atomicReferenceFieldUpdater.get(this) == c4563l) {
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: c */
    public final int m9005c() {
        C4563l c4563l = (C4563l) f15040a.get(this);
        c4563l.getClass();
        long j3 = C4563l.f15043f.get(c4563l);
        return (((int) ((j3 & 1152921503533105152L) >> 30)) - ((int) (1073741823 & j3))) & 1073741823;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: d */
    public final Object m9006d() {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f15040a;
            C4563l c4563l = (C4563l) atomicReferenceFieldUpdater.get(this);
            Object objM9010d = c4563l.m9010d();
            if (objM9010d != C4563l.f15044g) {
                return objM9010d;
            }
            C4563l c4563lM9009c = c4563l.m9009c();
            while (!atomicReferenceFieldUpdater.compareAndSet(this, c4563l, c4563lM9009c) && atomicReferenceFieldUpdater.get(this) == c4563l) {
            }
        }
    }
}
