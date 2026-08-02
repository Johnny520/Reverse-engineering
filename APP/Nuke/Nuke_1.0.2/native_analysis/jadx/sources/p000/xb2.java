package p000;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class xb2 implements t00, l20 {

    /* JADX INFO: renamed from: i */
    public static final AtomicReferenceFieldUpdater f12955i = AtomicReferenceFieldUpdater.newUpdater(xb2.class, Object.class, "result");

    /* JADX INFO: renamed from: h */
    public final t00 f12956h;
    private volatile Object result;

    public xb2(t00 t00Var) {
        k20 k20Var = k20.f5323h;
        this.f12956h = t00Var;
        this.result = k20Var;
    }

    @Override // p000.l20
    /* JADX INFO: renamed from: d */
    public final l20 mo2144d() {
        t00 t00Var = this.f12956h;
        if (t00Var instanceof l20) {
            return (l20) t00Var;
        }
        return null;
    }

    @Override // p000.t00
    /* JADX INFO: renamed from: f */
    public final a20 mo2508f() {
        return this.f12956h.mo2508f();
    }

    @Override // p000.t00
    /* JADX INFO: renamed from: h */
    public final void mo2509h(Object obj) {
        while (true) {
            Object obj2 = this.result;
            k20 k20Var = k20.f5324i;
            if (obj2 == k20Var) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f12955i;
                while (!atomicReferenceFieldUpdater.compareAndSet(this, k20Var, obj)) {
                    if (atomicReferenceFieldUpdater.get(this) != k20Var) {
                        break;
                    }
                }
                return;
            }
            k20 k20Var2 = k20.f5323h;
            if (obj2 != k20Var2) {
                C0676s.m4653l("Already resumed");
                return;
            }
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = f12955i;
            k20 k20Var3 = k20.f5325j;
            while (!atomicReferenceFieldUpdater2.compareAndSet(this, k20Var2, k20Var3)) {
                if (atomicReferenceFieldUpdater2.get(this) != k20Var2) {
                    break;
                }
            }
            this.f12956h.mo2509h(obj);
            return;
        }
    }

    public final String toString() {
        return "SafeContinuation for " + this.f12956h;
    }
}
