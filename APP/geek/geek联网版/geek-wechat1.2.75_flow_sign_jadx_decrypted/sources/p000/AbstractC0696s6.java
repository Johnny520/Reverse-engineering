package p000;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: renamed from: s6 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0696s6 extends AbstractC0464lx {

    /* JADX INFO: renamed from: a */
    public static final AtomicReferenceFieldUpdater f4211a = AtomicReferenceFieldUpdater.newUpdater(AbstractC0696s6.class, Object.class, "_consensus");
    private volatile Object _consensus = AbstractC0493mp.f3163a;

    @Override // p000.AbstractC0464lx
    /* JADX INFO: renamed from: a */
    public final Object mo1780a(Object obj) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f4211a;
        Object obj2 = atomicReferenceFieldUpdater.get(this);
        C0431l0 c0431l0 = AbstractC0493mp.f3163a;
        if (obj2 == c0431l0) {
            C0431l0 c0431l0Mo2307c = mo2307c(obj);
            obj2 = atomicReferenceFieldUpdater.get(this);
            if (obj2 == c0431l0) {
                while (true) {
                    if (atomicReferenceFieldUpdater.compareAndSet(this, c0431l0, c0431l0Mo2307c)) {
                        obj2 = c0431l0Mo2307c;
                        break;
                    }
                    if (atomicReferenceFieldUpdater.get(this) != c0431l0) {
                        obj2 = atomicReferenceFieldUpdater.get(this);
                        break;
                    }
                }
            }
        }
        mo2306b(obj, obj2);
        return obj2;
    }

    /* JADX INFO: renamed from: b */
    public abstract void mo2306b(Object obj, Object obj2);

    /* JADX INFO: renamed from: c */
    public abstract C0431l0 mo2307c(Object obj);
}
