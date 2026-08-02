package p000;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: renamed from: oy */
/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0560oy {

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f7873a = AtomicReferenceFieldUpdater.newUpdater(AbstractC0560oy.class, Object.class, "_next$volatile");

    /* JADX INFO: renamed from: b */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f7874b = AtomicReferenceFieldUpdater.newUpdater(AbstractC0560oy.class, Object.class, "_prev$volatile");
    private volatile /* synthetic */ Object _next$volatile;
    private volatile /* synthetic */ Object _prev$volatile;

    public AbstractC0560oy(lm2 lm2Var) {
        this._prev$volatile = lm2Var;
    }

    /* JADX INFO: renamed from: b */
    public final void m3666b() {
        f7874b.set(this, null);
    }

    /* JADX INFO: renamed from: c */
    public final AbstractC0560oy m3667c() {
        Object obj = f7873a.get(this);
        if (obj == xe1.f12996e) {
            return null;
        }
        return (AbstractC0560oy) obj;
    }

    /* JADX INFO: renamed from: d */
    public abstract boolean mo2943d();

    /* JADX INFO: renamed from: e */
    public final void m3668e() {
        AbstractC0560oy abstractC0560oyM3667c;
        if (m3667c() == null) {
            return;
        }
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f7874b;
            AbstractC0560oy abstractC0560oy = (AbstractC0560oy) atomicReferenceFieldUpdater.get(this);
            while (abstractC0560oy != null && abstractC0560oy.mo2943d()) {
                abstractC0560oy = (AbstractC0560oy) atomicReferenceFieldUpdater.get(abstractC0560oy);
            }
            AbstractC0560oy abstractC0560oyM3667c2 = m3667c();
            abstractC0560oyM3667c2.getClass();
            while (abstractC0560oyM3667c2.mo2943d() && (abstractC0560oyM3667c = abstractC0560oyM3667c2.m3667c()) != null) {
                abstractC0560oyM3667c2 = abstractC0560oyM3667c;
            }
            while (true) {
                Object obj = atomicReferenceFieldUpdater.get(abstractC0560oyM3667c2);
                AbstractC0560oy abstractC0560oy2 = ((AbstractC0560oy) obj) == null ? null : abstractC0560oy;
                while (!atomicReferenceFieldUpdater.compareAndSet(abstractC0560oyM3667c2, obj, abstractC0560oy2)) {
                    if (atomicReferenceFieldUpdater.get(abstractC0560oyM3667c2) != obj) {
                        break;
                    }
                }
            }
            if (abstractC0560oy != null) {
                f7873a.set(abstractC0560oy, abstractC0560oyM3667c2);
            }
            if (!abstractC0560oyM3667c2.mo2943d() || abstractC0560oyM3667c2.m3667c() == null) {
                if (abstractC0560oy == null || !abstractC0560oy.mo2943d()) {
                    return;
                }
            }
        }
    }
}
