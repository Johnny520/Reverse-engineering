package p190k3;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: renamed from: k3.k */
/* JADX INFO: loaded from: classes.dex */
public class C2463k {

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f7945a = AtomicReferenceFieldUpdater.newUpdater(C2463k.class, Object.class, "_cur$volatile");
    private volatile /* synthetic */ Object _cur$volatile = new C2465m(8, false);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public final boolean m4394a(Runnable runnable) {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f7945a;
            C2465m c2465m = (C2465m) atomicReferenceFieldUpdater.get(this);
            int iM4398a = c2465m.m4398a(runnable);
            if (iM4398a == 0) {
                return true;
            }
            if (iM4398a == 1) {
                C2465m c2465mM4400c = c2465m.m4400c();
                while (!atomicReferenceFieldUpdater.compareAndSet(this, c2465m, c2465mM4400c) && atomicReferenceFieldUpdater.get(this) == c2465m) {
                }
            } else if (iM4398a == 2) {
                return false;
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b */
    public final void m4395b() {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f7945a;
            C2465m c2465m = (C2465m) atomicReferenceFieldUpdater.get(this);
            if (c2465m.m4399b()) {
                return;
            }
            C2465m c2465mM4400c = c2465m.m4400c();
            while (!atomicReferenceFieldUpdater.compareAndSet(this, c2465m, c2465mM4400c) && atomicReferenceFieldUpdater.get(this) == c2465m) {
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: c */
    public final int m4396c() {
        C2465m c2465m = (C2465m) f7945a.get(this);
        c2465m.getClass();
        long j5 = C2465m.f7948f.get(c2465m);
        return (((int) ((j5 & 1152921503533105152L) >> 30)) - ((int) (1073741823 & j5))) & 1073741823;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: d */
    public final Object m4397d() {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f7945a;
            C2465m c2465m = (C2465m) atomicReferenceFieldUpdater.get(this);
            Object objM4401d = c2465m.m4401d();
            if (objM4401d != C2465m.f7949g) {
                return objM4401d;
            }
            C2465m c2465mM4400c = c2465m.m4400c();
            while (!atomicReferenceFieldUpdater.compareAndSet(this, c2465m, c2465mM4400c) && atomicReferenceFieldUpdater.get(this) == c2465m) {
            }
        }
    }
}
