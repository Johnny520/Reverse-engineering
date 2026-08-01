package lc;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import p024b9.C1050n0;
import p097g8.AbstractC2543b;
import p193n3.AbstractC5489b;

/* JADX INFO: renamed from: lc.l */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
public final class C4746l {

    /* JADX INFO: renamed from: b */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f14065b = AtomicReferenceFieldUpdater.newUpdater(C4746l.class, Object.class, "lastScheduledTask$volatile");

    /* JADX INFO: renamed from: c */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f14066c = AtomicIntegerFieldUpdater.newUpdater(C4746l.class, "producerIndex$volatile");

    /* JADX INFO: renamed from: d */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f14067d = AtomicIntegerFieldUpdater.newUpdater(C4746l.class, "consumerIndex$volatile");

    /* JADX INFO: renamed from: e */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f14068e = AtomicIntegerFieldUpdater.newUpdater(C4746l.class, "blockingTasksInBuffer$volatile");

    /* JADX INFO: renamed from: a */
    public final AtomicReferenceArray f14069a = new AtomicReferenceArray(128);
    private volatile /* synthetic */ int blockingTasksInBuffer$volatile;
    private volatile /* synthetic */ int consumerIndex$volatile;
    private volatile /* synthetic */ Object lastScheduledTask$volatile;
    private volatile /* synthetic */ int producerIndex$volatile;

    /* JADX INFO: renamed from: a */
    public final AbstractRunnableC4742h m18985a(AbstractRunnableC4742h abstractRunnableC4742h, boolean z10) {
        if (z10) {
            return m18986b(abstractRunnableC4742h);
        }
        AbstractRunnableC4742h abstractRunnableC4742h2 = (AbstractRunnableC4742h) f14065b.getAndSet(this, abstractRunnableC4742h);
        if (abstractRunnableC4742h2 == null) {
            return null;
        }
        return m18986b(abstractRunnableC4742h2);
    }

    /* JADX INFO: renamed from: b */
    public final AbstractRunnableC4742h m18986b(AbstractRunnableC4742h abstractRunnableC4742h) {
        if (m18988e() == 127) {
            return abstractRunnableC4742h;
        }
        if (abstractRunnableC4742h.f14056r) {
            f14068e.incrementAndGet(this);
        }
        int i10 = f14066c.get(this) & 127;
        while (this.f14069a.get(i10) != null) {
            Thread.yield();
        }
        this.f14069a.lazySet(i10, abstractRunnableC4742h);
        f14066c.incrementAndGet(this);
        return null;
    }

    /* JADX INFO: renamed from: c */
    public final void m18987c(AbstractRunnableC4742h abstractRunnableC4742h) {
        if (abstractRunnableC4742h == null || !abstractRunnableC4742h.f14056r) {
            return;
        }
        f14068e.decrementAndGet(this);
    }

    /* JADX INFO: renamed from: e */
    public final int m18988e() {
        return f14066c.get(this) - f14067d.get(this);
    }

    /* JADX INFO: renamed from: i */
    public final int m18989i() {
        return f14065b.get(this) != null ? m18988e() + 1 : m18988e();
    }

    /* JADX INFO: renamed from: j */
    public final void m18990j(C4738d c4738d) {
        AbstractRunnableC4742h abstractRunnableC4742h = (AbstractRunnableC4742h) f14065b.getAndSet(this, null);
        if (abstractRunnableC4742h != null) {
            c4738d.m15235a(abstractRunnableC4742h);
        }
        while (m18994n(c4738d)) {
        }
    }

    /* JADX INFO: renamed from: k */
    public final AbstractRunnableC4742h m18991k() {
        AbstractRunnableC4742h abstractRunnableC4742h = (AbstractRunnableC4742h) f14065b.getAndSet(this, null);
        return abstractRunnableC4742h == null ? m18993m() : abstractRunnableC4742h;
    }

    /* JADX INFO: renamed from: l */
    public final AbstractRunnableC4742h m18992l() {
        return m18995o(true);
    }

    /* JADX INFO: renamed from: m */
    public final AbstractRunnableC4742h m18993m() {
        AbstractRunnableC4742h abstractRunnableC4742h;
        while (true) {
            int i10 = f14067d.get(this);
            if (i10 - f14066c.get(this) == 0) {
                return null;
            }
            int i11 = i10 & 127;
            if (f14067d.compareAndSet(this, i10, i10 + 1) && (abstractRunnableC4742h = (AbstractRunnableC4742h) this.f14069a.getAndSet(i11, null)) != null) {
                m18987c(abstractRunnableC4742h);
                return abstractRunnableC4742h;
            }
        }
    }

    /* JADX INFO: renamed from: n */
    public final boolean m18994n(C4738d c4738d) {
        AbstractRunnableC4742h abstractRunnableC4742hM18993m = m18993m();
        if (abstractRunnableC4742hM18993m == null) {
            return false;
        }
        c4738d.m15235a(abstractRunnableC4742hM18993m);
        return true;
    }

    /* JADX INFO: renamed from: o */
    public final AbstractRunnableC4742h m18995o(boolean z10) {
        AbstractRunnableC4742h abstractRunnableC4742h;
        do {
            abstractRunnableC4742h = (AbstractRunnableC4742h) f14065b.get(this);
            if (abstractRunnableC4742h == null || abstractRunnableC4742h.f14056r != z10) {
                int i10 = f14067d.get(this);
                int i11 = f14066c.get(this);
                while (i10 != i11) {
                    if (z10 && f14068e.get(this) == 0) {
                        return null;
                    }
                    i11--;
                    AbstractRunnableC4742h abstractRunnableC4742hM18997q = m18997q(i11, z10);
                    if (abstractRunnableC4742hM18997q != null) {
                        return abstractRunnableC4742hM18997q;
                    }
                }
                return null;
            }
        } while (!AbstractC5489b.m22334a(f14065b, this, abstractRunnableC4742h, null));
        return abstractRunnableC4742h;
    }

    /* JADX INFO: renamed from: p */
    public final AbstractRunnableC4742h m18996p(int i10) {
        int i11 = f14067d.get(this);
        int i12 = f14066c.get(this);
        boolean z10 = i10 == 1;
        while (i11 != i12) {
            if (z10 && f14068e.get(this) == 0) {
                return null;
            }
            int i13 = i11 + 1;
            AbstractRunnableC4742h abstractRunnableC4742hM18997q = m18997q(i11, z10);
            if (abstractRunnableC4742hM18997q != null) {
                return abstractRunnableC4742hM18997q;
            }
            i11 = i13;
        }
        return null;
    }

    /* JADX INFO: renamed from: q */
    public final AbstractRunnableC4742h m18997q(int i10, boolean z10) {
        int i11 = i10 & 127;
        AbstractRunnableC4742h abstractRunnableC4742h = (AbstractRunnableC4742h) this.f14069a.get(i11);
        if (abstractRunnableC4742h == null || abstractRunnableC4742h.f14056r != z10 || !AbstractC2543b.m9063a(this.f14069a, i11, abstractRunnableC4742h, null)) {
            return null;
        }
        if (z10) {
            f14068e.decrementAndGet(this);
        }
        return abstractRunnableC4742h;
    }

    /* JADX INFO: renamed from: r */
    public final long m18998r(int i10, C1050n0 c1050n0) {
        AbstractRunnableC4742h abstractRunnableC4742hM18993m = i10 == 3 ? m18993m() : m18996p(i10);
        if (abstractRunnableC4742hM18993m == null) {
            return m18999s(i10, c1050n0);
        }
        c1050n0.f3208q = abstractRunnableC4742hM18993m;
        return -1L;
    }

    /* JADX INFO: renamed from: s */
    public final long m18999s(int i10, C1050n0 c1050n0) {
        AbstractRunnableC4742h abstractRunnableC4742h;
        do {
            abstractRunnableC4742h = (AbstractRunnableC4742h) f14065b.get(this);
            if (abstractRunnableC4742h == null) {
                return -2L;
            }
            if (((abstractRunnableC4742h.f14056r ? 1 : 2) & i10) == 0) {
                return -2L;
            }
            long jMo18975a = AbstractC4744j.f14063f.mo18975a() - abstractRunnableC4742h.f14055q;
            long j10 = AbstractC4744j.f14059b;
            if (jMo18975a < j10) {
                return j10 - jMo18975a;
            }
        } while (!AbstractC5489b.m22334a(f14065b, this, abstractRunnableC4742h, null));
        c1050n0.f3208q = abstractRunnableC4742h;
        return -1L;
    }
}
