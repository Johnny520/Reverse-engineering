package p000;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: renamed from: dp */
/* JADX INFO: loaded from: classes.dex */
public class C1334dp {

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f4808a = AtomicReferenceFieldUpdater.newUpdater(C1334dp.class, Object.class, "_cur$volatile");
    private volatile /* synthetic */ Object _cur$volatile = new C1422fp(8, false);

    /* JADX INFO: renamed from: a */
    public final boolean m2583a(Runnable runnable) {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f4808a;
            C1422fp c1422fp = (C1422fp) atomicReferenceFieldUpdater.get(this);
            int iM2732a = c1422fp.m2732a(runnable);
            if (iM2732a == 0) {
                return true;
            }
            if (iM2732a == 1) {
                C1422fp c1422fpM2734c = c1422fp.m2734c();
                while (!atomicReferenceFieldUpdater.compareAndSet(this, c1422fp, c1422fpM2734c) && atomicReferenceFieldUpdater.get(this) == c1422fp) {
                }
            } else if (iM2732a == 2) {
                return false;
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m2584b() {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f4808a;
            C1422fp c1422fp = (C1422fp) atomicReferenceFieldUpdater.get(this);
            if (c1422fp.m2733b()) {
                return;
            }
            C1422fp c1422fpM2734c = c1422fp.m2734c();
            while (!atomicReferenceFieldUpdater.compareAndSet(this, c1422fp, c1422fpM2734c) && atomicReferenceFieldUpdater.get(this) == c1422fp) {
            }
        }
    }

    /* JADX INFO: renamed from: c */
    public final int m2585c() {
        C1422fp c1422fp = (C1422fp) f4808a.get(this);
        c1422fp.getClass();
        long j = C1422fp.f5016f.get(c1422fp);
        return (((int) ((j & 1152921503533105152L) >> 30)) - ((int) (1073741823 & j))) & 1073741823;
    }

    /* JADX INFO: renamed from: d */
    public final Object m2586d() {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f4808a;
            C1422fp c1422fp = (C1422fp) atomicReferenceFieldUpdater.get(this);
            Object objM2735d = c1422fp.m2735d();
            if (objM2735d != C1422fp.f5017g) {
                return objM2735d;
            }
            C1422fp c1422fpM2734c = c1422fp.m2734c();
            while (!atomicReferenceFieldUpdater.compareAndSet(this, c1422fp, c1422fpM2734c) && atomicReferenceFieldUpdater.get(this) == c1422fp) {
            }
        }
    }
}
