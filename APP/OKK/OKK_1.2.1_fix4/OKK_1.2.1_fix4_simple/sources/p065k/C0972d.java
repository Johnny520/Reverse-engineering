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

    public C0972d(AtomicReferenceFieldUpdater r1, AtomicReferenceFieldUpdater r2, AtomicReferenceFieldUpdater r3, AtomicReferenceFieldUpdater r4, AtomicReferenceFieldUpdater r5) {
        this.f3445b = r1;
        this.f3446c = r2;
        this.f3447d = r3;
        this.f3448e = r4;
        this.f3449f = r5;
    }

    @Override // p056f0.AbstractC0805P
    /* JADX INFO: renamed from: O */
    public final void mo2061O(C0974f r2, C0974f r3) {
        this.f3446c.lazySet(r2, r3);
    }

    @Override // p056f0.AbstractC0805P
    /* JADX INFO: renamed from: P */
    public final void mo2062P(C0974f r2, Thread r3) {
        this.f3445b.lazySet(r2, r3);
    }

    @Override // p056f0.AbstractC0805P
    /* JADX INFO: renamed from: c */
    public final boolean mo2067c(AbstractFutureC0975g r4, C0971c r5) {
        C0971c r02 = C0971c.f3443b;
    L3:
        AtomicReferenceFieldUpdater r1 = this.f3448e;
        if (r1.compareAndSet(r4, r5, r02) == true) goto L5;
        if (r1.get(r4) == r5) goto L3;
        return false;
    L5:
        return true;
    }

    @Override // p056f0.AbstractC0805P
    /* JADX INFO: renamed from: d */
    public final boolean mo2068d(AbstractFutureC0975g r3, Object r4, Object r5) {
    L2:
        AtomicReferenceFieldUpdater r02 = this.f3449f;
        if (r02.compareAndSet(r3, r4, r5) == true) goto L4;
        if (r02.get(r3) == r4) goto L2;
        return false;
    L4:
        return true;
    }

    @Override // p056f0.AbstractC0805P
    /* JADX INFO: renamed from: e */
    public final boolean mo2069e(AbstractFutureC0975g r3, C0974f r4, C0974f r5) {
    L2:
        AtomicReferenceFieldUpdater r02 = this.f3447d;
        if (r02.compareAndSet(r3, r4, r5) == true) goto L4;
        if (r02.get(r3) == r4) goto L2;
        return false;
    L4:
        return true;
    }
}
