package p190k3;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import p117X2.AbstractC1665j;

/* JADX INFO: renamed from: k3.b */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2454b {

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f7924a = AtomicReferenceFieldUpdater.newUpdater(AbstractC2454b.class, Object.class, "_next$volatile");

    /* JADX INFO: renamed from: b */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f7925b = AtomicReferenceFieldUpdater.newUpdater(AbstractC2454b.class, Object.class, "_prev$volatile");
    private volatile /* synthetic */ Object _next$volatile;
    private volatile /* synthetic */ Object _prev$volatile;

    public AbstractC2454b(AbstractC2470r abstractC2470r) {
        this._prev$volatile = abstractC2470r;
    }

    /* JADX INFO: renamed from: a */
    public final void m4385a() {
        f7925b.set(this, null);
    }

    /* JADX INFO: renamed from: b */
    public final AbstractC2454b m4386b() {
        Object obj = f7924a.get(this);
        if (obj == AbstractC2453a.f7917a) {
            return null;
        }
        return (AbstractC2454b) obj;
    }

    /* JADX INFO: renamed from: c */
    public abstract boolean mo4387c();

    /* JADX INFO: renamed from: d */
    public final void m4388d() {
        AbstractC2454b abstractC2454bM4386b;
        if (m4386b() == null) {
            return;
        }
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f7925b;
            AbstractC2454b abstractC2454b = (AbstractC2454b) atomicReferenceFieldUpdater.get(this);
            while (abstractC2454b != null && abstractC2454b.mo4387c()) {
                abstractC2454b = (AbstractC2454b) atomicReferenceFieldUpdater.get(abstractC2454b);
            }
            AbstractC2454b abstractC2454bM4386b2 = m4386b();
            AbstractC1665j.m2982b(abstractC2454bM4386b2);
            while (abstractC2454bM4386b2.mo4387c() && (abstractC2454bM4386b = abstractC2454bM4386b2.m4386b()) != null) {
                abstractC2454bM4386b2 = abstractC2454bM4386b;
            }
            while (true) {
                Object obj = atomicReferenceFieldUpdater.get(abstractC2454bM4386b2);
                AbstractC2454b abstractC2454b2 = ((AbstractC2454b) obj) == null ? null : abstractC2454b;
                while (!atomicReferenceFieldUpdater.compareAndSet(abstractC2454bM4386b2, obj, abstractC2454b2)) {
                    if (atomicReferenceFieldUpdater.get(abstractC2454bM4386b2) != obj) {
                        break;
                    }
                }
            }
            if (abstractC2454b != null) {
                f7924a.set(abstractC2454b, abstractC2454bM4386b2);
            }
            if (!abstractC2454bM4386b2.mo4387c() || abstractC2454bM4386b2.m4386b() == null) {
                if (abstractC2454b == null || !abstractC2454b.mo4387c()) {
                    return;
                }
            }
        }
    }
}
