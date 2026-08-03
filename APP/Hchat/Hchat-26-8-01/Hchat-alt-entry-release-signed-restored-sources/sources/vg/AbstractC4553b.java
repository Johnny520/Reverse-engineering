package vg;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: renamed from: vg.b */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC4553b {

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f15020a = AtomicReferenceFieldUpdater.newUpdater(AbstractC4553b.class, Object.class, "_next$volatile");

    /* JADX INFO: renamed from: b */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f15021b = AtomicReferenceFieldUpdater.newUpdater(AbstractC4553b.class, Object.class, "_prev$volatile");
    private volatile /* synthetic */ Object _next$volatile;
    private volatile /* synthetic */ Object _prev$volatile;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public AbstractC4553b(AbstractC4568q abstractC4568q) {
        this._prev$volatile = abstractC4568q;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public final void m8994a() {
        f15021b.set(this, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b */
    public final AbstractC4553b m8995b() {
        Object obj = f15020a.get(this);
        if (obj == AbstractC4552a.f15013a) {
            return null;
        }
        return (AbstractC4553b) obj;
    }

    /* JADX INFO: renamed from: c */
    public abstract boolean mo8996c();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: d */
    public final void m8997d() {
        AbstractC4553b abstractC4553bM8995b;
        if (m8995b() == null) {
            return;
        }
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f15021b;
            AbstractC4553b abstractC4553b = (AbstractC4553b) atomicReferenceFieldUpdater.get(this);
            while (abstractC4553b != null && abstractC4553b.mo8996c()) {
                abstractC4553b = (AbstractC4553b) atomicReferenceFieldUpdater.get(abstractC4553b);
            }
            AbstractC4553b abstractC4553bM8995b2 = m8995b();
            abstractC4553bM8995b2.getClass();
            while (abstractC4553bM8995b2.mo8996c() && (abstractC4553bM8995b = abstractC4553bM8995b2.m8995b()) != null) {
                abstractC4553bM8995b2 = abstractC4553bM8995b;
            }
            while (true) {
                Object obj = atomicReferenceFieldUpdater.get(abstractC4553bM8995b2);
                AbstractC4553b abstractC4553b2 = ((AbstractC4553b) obj) == null ? null : abstractC4553b;
                while (!atomicReferenceFieldUpdater.compareAndSet(abstractC4553bM8995b2, obj, abstractC4553b2)) {
                    if (atomicReferenceFieldUpdater.get(abstractC4553bM8995b2) != obj) {
                        break;
                    }
                }
            }
            if (abstractC4553b != null) {
                f15020a.set(abstractC4553b, abstractC4553bM8995b2);
            }
            if (!abstractC4553bM8995b2.mo8996c() || abstractC4553bM8995b2.m8995b() == null) {
                if (abstractC4553b == null || !abstractC4553b.mo8996c()) {
                    return;
                }
            }
        }
    }
}
