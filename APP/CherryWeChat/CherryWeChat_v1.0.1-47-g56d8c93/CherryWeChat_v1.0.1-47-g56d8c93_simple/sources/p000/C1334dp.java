package p000;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: renamed from: dp */
/* JADX INFO: loaded from: classes.dex */
public class C1334dp {

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f4808a = null;
    private volatile /* synthetic */ Object _cur$volatile;

    static {
        f4808a = AtomicReferenceFieldUpdater.newUpdater(C1334dp.class, Object.class, "_cur$volatile");
    }

    public C1334dp() {
        this._cur$volatile = new C1422fp(8, false);
    }

    /* JADX INFO: renamed from: a */
    public final boolean m2583a(Runnable r5) {
    L2:
        AtomicReferenceFieldUpdater r0 = f4808a;
        C1422fp r1 = (C1422fp) r0.get(this);
        int r2 = r1.m2732a(r5);
        if (r2 == 0) goto L17;
        if (r2 != 1) goto L6;
        C1422fp r22 = r1.m2734c();
    L12:
        if (r0.compareAndSet(this, r1, r22) == true) goto L2;
        if (r0.get(this) == r1) goto L12;
    L6:
        if (r2 != 2) goto L2;
        return false;
    L17:
        return true;
    }

    /* JADX INFO: renamed from: b */
    public final void m2584b() {
    L2:
        AtomicReferenceFieldUpdater r0 = f4808a;
        C1422fp r1 = (C1422fp) r0.get(this);
        if (r1.m2733b() == true) goto L4;
        C1422fp r2 = r1.m2734c();
    L7:
        if (r0.compareAndSet(this, r1, r2) == true) goto L2;
        if (r0.get(this) == r1) goto L7;
    }

    /* JADX INFO: renamed from: c */
    public final int m2585c() {
        C1422fp r0 = (C1422fp) f4808a.get(this);
        r0.getClass();
        long r02 = C1422fp.f5016f.get(r0);
        int r2 = (int) (1073741823 & r02);
        return (((int) ((r02 & 1152921503533105152L) >> 30)) - r2) & 1073741823;
    }

    /* JADX INFO: renamed from: d */
    public final Object m2586d() {
    L2:
        AtomicReferenceFieldUpdater r0 = f4808a;
        C1422fp r1 = (C1422fp) r0.get(this);
        Object r2 = r1.m2735d();
        if (r2 != C1422fp.f5017g) goto L4;
        C1422fp r22 = r1.m2734c();
    L7:
        if (r0.compareAndSet(this, r1, r22) == true) goto L2;
        if (r0.get(this) == r1) goto L7;
    L4:
        return r2;
    }
}
