package p065k;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import p056f0.AbstractC0805P;

/* JADX INFO: renamed from: k.d */
/* JADX INFO: loaded from: classes.dex */
public final class C0972d extends AbstractC0805P {

    /* JADX INFO: renamed from: b */
    public final AtomicReferenceFieldUpdater f3445b;

    /* JADX INFO: renamed from: c */
    public final AtomicReferenceFieldUpdater f3446c;

    /* JADX INFO: renamed from: d */
    public final AtomicReferenceFieldUpdater f3447d;

    /* JADX INFO: renamed from: e */
    public final AtomicReferenceFieldUpdater f3448e;

    /* JADX INFO: renamed from: f */
    public final AtomicReferenceFieldUpdater f3449f;

    public C0972d(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater3, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater4, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater5) {
        this.f3445b = atomicReferenceFieldUpdater;
        this.f3446c = atomicReferenceFieldUpdater2;
        this.f3447d = atomicReferenceFieldUpdater3;
        this.f3448e = atomicReferenceFieldUpdater4;
        this.f3449f = atomicReferenceFieldUpdater5;
    }

    @Override // p056f0.AbstractC0805P
    /* JADX INFO: renamed from: O */
    public final void mo2061O(C0974f c0974f, C0974f c0974f2) {
        this.f3446c.lazySet(c0974f, c0974f2);
    }

    @Override // p056f0.AbstractC0805P
    /* JADX INFO: renamed from: P */
    public final void mo2062P(C0974f c0974f, Thread thread) {
        this.f3445b.lazySet(c0974f, thread);
    }

    @Override // p056f0.AbstractC0805P
    /* JADX INFO: renamed from: c */
    public final boolean mo2067c(AbstractFutureC0975g abstractFutureC0975g, C0971c c0971c) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        C0971c c0971c2 = C0971c.f3443b;
        do {
            atomicReferenceFieldUpdater = this.f3448e;
            if (atomicReferenceFieldUpdater.compareAndSet(abstractFutureC0975g, c0971c, c0971c2)) {
                return true;
            }
        } while (atomicReferenceFieldUpdater.get(abstractFutureC0975g) == c0971c);
        return false;
    }

    @Override // p056f0.AbstractC0805P
    /* JADX INFO: renamed from: d */
    public final boolean mo2068d(AbstractFutureC0975g abstractFutureC0975g, Object obj, Object obj2) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        do {
            atomicReferenceFieldUpdater = this.f3449f;
            if (atomicReferenceFieldUpdater.compareAndSet(abstractFutureC0975g, obj, obj2)) {
                return true;
            }
        } while (atomicReferenceFieldUpdater.get(abstractFutureC0975g) == obj);
        return false;
    }

    @Override // p056f0.AbstractC0805P
    /* JADX INFO: renamed from: e */
    public final boolean mo2069e(AbstractFutureC0975g abstractFutureC0975g, C0974f c0974f, C0974f c0974f2) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        do {
            atomicReferenceFieldUpdater = this.f3447d;
            if (atomicReferenceFieldUpdater.compareAndSet(abstractFutureC0975g, c0974f, c0974f2)) {
                return true;
            }
        } while (atomicReferenceFieldUpdater.get(abstractFutureC0975g) == c0974f);
        return false;
    }
}
