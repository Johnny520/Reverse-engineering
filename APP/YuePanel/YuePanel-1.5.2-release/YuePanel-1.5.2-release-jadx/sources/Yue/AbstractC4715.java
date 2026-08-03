package Yue;

import Yue.InterfaceC4364;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: renamed from: Yue.ۥ۠ۡۡۡ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC4715 extends AbstractC4718 implements InterfaceC4364 {

    /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f10080 = AtomicReferenceFieldUpdater.newUpdater(AbstractC4715.class, Object.class, "_queue");

    /* JADX INFO: renamed from: ۥ۟۟۠ۧ, reason: contains not printable characters */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f10081 = AtomicReferenceFieldUpdater.newUpdater(AbstractC4715.class, Object.class, "_delayed");

    @InterfaceC6399
    private volatile /* synthetic */ Object _queue = null;

    @InterfaceC6399
    private volatile /* synthetic */ Object _delayed = null;

    @InterfaceC6399
    private volatile /* synthetic */ int _isCompleted = 0;

    /* JADX INFO: renamed from: Yue.ۥ۠ۡۡۡ$ۥ */
    public final class C0472 extends AbstractRunnableC4716 {

        /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
        @InterfaceC6399
        public final InterfaceC3665<C8107> f10082;

        /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: Yue.ۥۣ۟ۨ۟<? super Yue.ۥۣۢ۠ۤ> */
        /* JADX WARN: Multi-variable type inference failed */
        public C0472(long j, @InterfaceC6399 InterfaceC3665<? super C8107> interfaceC3665) {
            super(j);
            this.f10082 = interfaceC3665;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f10082.mo10016(AbstractC4715.this, C8107.f3222);
        }

        @Override // Yue.AbstractC4715.AbstractRunnableC4716
        @InterfaceC6399
        public String toString() {
            return super.toString() + this.f10082;
        }
    }

    /* JADX INFO: renamed from: Yue.ۥ۠ۡۡۡ$ۥ۟ */
    public static final class C0473 extends AbstractRunnableC4716 {

        /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
        @InterfaceC6399
        public final Runnable f10084;

        public C0473(long j, @InterfaceC6399 Runnable runnable) {
            super(j);
            this.f10084 = runnable;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f10084.run();
        }

        @Override // Yue.AbstractC4715.AbstractRunnableC4716
        @InterfaceC6399
        public String toString() {
            return super.toString() + this.f10084;
        }
    }

    /* JADX INFO: renamed from: Yue.ۥ۠ۡۡۡ$ۥ۟۟, reason: contains not printable characters */
    public static abstract class AbstractRunnableC4716 implements Runnable, Comparable<AbstractRunnableC4716>, InterfaceC4433, InterfaceC7785 {

        @InterfaceC6489
        private volatile Object _heap;

        /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
        @InterfaceC5568
        public long f10085;

        /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
        public int f10086 = -1;

        public AbstractRunnableC4716(long j) {
            this.f10085 = j;
        }

        @Override // Yue.InterfaceC7785
        public int getIndex() {
            return this.f10086;
        }

        @InterfaceC6399
        public String toString() {
            return "Delayed[nanos=" + this.f10085 + ']';
        }

        @Override // Yue.InterfaceC7785
        /* JADX INFO: renamed from: ۥ */
        public void mo1627(@InterfaceC6489 C7784<?> c7784) {
            if (this._heap == C4720.f1072) {
                throw new IllegalArgumentException("Failed requirement.".toString());
            }
            this._heap = c7784;
        }

        @Override // Yue.InterfaceC7785
        @InterfaceC6489
        /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
        public C7784<?> mo14102() {
            Object obj = this._heap;
            if (obj instanceof C7784) {
                return (C7784) obj;
            }
            return null;
        }

        @Override // Yue.InterfaceC7785
        /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
        public void mo14103(int i) {
            this.f10086 = i;
        }

        /* JADX DEBUG: Method merged with bridge method: compareTo(Ljava/lang/Object;)I */
        @Override // java.lang.Comparable
        /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters and merged with bridge method [inline-methods] */
        public int compareTo(@InterfaceC6399 AbstractRunnableC4716 abstractRunnableC4716) {
            long j = this.f10085 - abstractRunnableC4716.f10085;
            if (j > 0) {
                return 1;
            }
            return j < 0 ? -1 : 0;
        }

        /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
        public final synchronized int m14105(long j, @InterfaceC6399 C4717 c4717, @InterfaceC6399 AbstractC4715 abstractC4715) {
            if (this._heap == C4720.f1072) {
                return 2;
            }
            synchronized (c4717) {
                try {
                    AbstractRunnableC4716 abstractRunnableC4716M24730 = c4717.m24730();
                    if (abstractC4715.m14090()) {
                        return 1;
                    }
                    if (abstractRunnableC4716M24730 == null) {
                        c4717.f1071 = j;
                    } else {
                        long j2 = abstractRunnableC4716M24730.f10085;
                        if (j2 - j < 0) {
                            j = j2;
                        }
                        if (j - c4717.f1071 > 0) {
                            c4717.f1071 = j;
                        }
                    }
                    long j3 = this.f10085;
                    long j4 = c4717.f1071;
                    if (j3 - j4 < 0) {
                        this.f10085 = j4;
                    }
                    c4717.m3883(this);
                    return 0;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
        public final boolean m14106(long j) {
            return j - this.f10085 >= 0;
        }

        @Override // Yue.InterfaceC4433
        /* JADX INFO: renamed from: ۥ۟۟ۡۥ */
        public final synchronized void mo5757() {
            try {
                Object obj = this._heap;
                if (obj == C4720.f1072) {
                    return;
                }
                C4717 c4717 = obj instanceof C4717 ? (C4717) obj : null;
                if (c4717 != null) {
                    c4717.m24735(this);
                }
                this._heap = C4720.f1072;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: Yue.ۥ۠ۡۡۡ$ۥ۟۟۟, reason: contains not printable characters */
    public static final class C4717 extends C7784<AbstractRunnableC4716> {

        /* JADX INFO: renamed from: ۥ۟ */
        @InterfaceC5568
        public long f1071;

        public C4717(long j) {
            this.f1071 = j;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Type inference failed for: r0v0, types: [boolean, int] */
    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public final boolean m14090() {
        return this._isCompleted;
    }

    @Override // Yue.AbstractC4232
    public final void dispatch(@InterfaceC6399 InterfaceC4225 interfaceC4225, @InterfaceC6399 Runnable runnable) {
        mo12589(runnable);
    }

    @Override // Yue.AbstractC4714
    public void shutdown() {
        C7779.f3076.m24722();
        m14100(true);
        m14092();
        while (mo14087() <= 0) {
        }
        m14095();
    }

    @Override // Yue.InterfaceC4364
    @InterfaceC4372(level = EnumC0393.f8971, message = "Deprecated without replacement as an internal method never intended for public use")
    @InterfaceC6489
    /* JADX INFO: renamed from: ۥ۟۟ۡ۠ */
    public Object mo12617(long j, @InterfaceC6399 InterfaceC4199<? super C8107> interfaceC4199) {
        return InterfaceC4364.C0387.m1320(this, j, interfaceC4199);
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥۣ۟۟ */
    public InterfaceC4433 mo12587(long j, @InterfaceC6399 Runnable runnable, @InterfaceC6399 InterfaceC4225 interfaceC4225) {
        return InterfaceC4364.C0387.m1321(this, j, runnable, interfaceC4225);
    }

    @Override // Yue.InterfaceC4364
    /* JADX INFO: renamed from: ۥ۟۟ۤۥ */
    public void mo12618(long j, @InterfaceC6399 InterfaceC3665<? super C8107> interfaceC3665) {
        long jM14110 = C4720.m14110(j);
        if (jM14110 < 4611686018427387903L) {
            AbstractC3018 abstractC3018M84 = C3019.m84();
            long jM82 = abstractC3018M84 != null ? abstractC3018M84.m82() : System.nanoTime();
            C0472 c0472 = new C0472(jM14110 + jM82, interfaceC3665);
            m14097(jM82, c0472);
            C3668.m735(interfaceC3665, c0472);
        }
    }

    @Override // Yue.AbstractC4714
    /* JADX INFO: renamed from: ۥۣ۟۟ۧ */
    public long mo14082() {
        AbstractRunnableC4716 abstractRunnableC4716M24733;
        if (super.mo14082() == 0) {
            return 0L;
        }
        Object obj = this._queue;
        if (obj != null) {
            if (!(obj instanceof C5858)) {
                return obj == C4720.f10092 ? Long.MAX_VALUE : 0L;
            }
            if (!((C5858) obj).m18138()) {
                return 0L;
            }
        }
        C4717 c4717 = (C4717) this._delayed;
        if (c4717 == null || (abstractRunnableC4716M24733 = c4717.m24733()) == null) {
            return Long.MAX_VALUE;
        }
        long j = abstractRunnableC4716M24733.f10085;
        AbstractC3018 abstractC3018M84 = C3019.m84();
        return C7007.m21662(j - (abstractC3018M84 != null ? abstractC3018M84.m82() : System.nanoTime()), 0L);
    }

    @Override // Yue.AbstractC4714
    /* JADX INFO: renamed from: ۥ۟۟ۧۦ */
    public boolean mo14084() {
        if (!m14086()) {
            return false;
        }
        C4717 c4717 = (C4717) this._delayed;
        if (c4717 != null && !c4717.m24732()) {
            return false;
        }
        Object obj = this._queue;
        if (obj != null) {
            if (obj instanceof C5858) {
                return ((C5858) obj).m18138();
            }
            if (obj != C4720.f10092) {
                return false;
            }
        }
        return true;
    }

    @Override // Yue.AbstractC4714
    /* JADX INFO: renamed from: ۥ۟۟ۨ */
    public long mo14087() {
        AbstractRunnableC4716 abstractRunnableC4716M24736;
        if (m14088()) {
            return 0L;
        }
        C4717 c4717 = (C4717) this._delayed;
        if (c4717 != null && !c4717.m24732()) {
            AbstractC3018 abstractC3018M84 = C3019.m84();
            long jM82 = abstractC3018M84 != null ? abstractC3018M84.m82() : System.nanoTime();
            do {
                synchronized (c4717) {
                    try {
                        AbstractRunnableC4716 abstractRunnableC4716M24730 = c4717.m24730();
                        if (abstractRunnableC4716M24730 != null) {
                            AbstractRunnableC4716 abstractRunnableC4716 = abstractRunnableC4716M24730;
                            abstractRunnableC4716M24736 = abstractRunnableC4716.m14106(jM82) ? m14094(abstractRunnableC4716) : false ? c4717.m24736(0) : null;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            } while (abstractRunnableC4716M24736 != null);
        }
        Runnable runnableM14093 = m14093();
        if (runnableM14093 == null) {
            return mo14082();
        }
        runnableM14093.run();
        return 0L;
    }

    /* JADX INFO: renamed from: ۥ۟۟ۨۥ, reason: contains not printable characters */
    public final void m14092() {
        while (true) {
            Object obj = this._queue;
            if (obj == null) {
                if (C3008.m74(f10080, this, null, C4720.f10092)) {
                    return;
                }
            } else if (obj instanceof C5858) {
                ((C5858) obj).m18134();
                return;
            } else {
                if (obj == C4720.f10092) {
                    return;
                }
                C5858 c5858 = new C5858(8, true);
                c5858.m2523((Runnable) obj);
                if (C3008.m74(f10080, this, obj, c5858)) {
                    return;
                }
            }
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟ۨۦ, reason: contains not printable characters */
    public final Runnable m14093() {
        while (true) {
            Object obj = this._queue;
            if (obj == null) {
                return null;
            }
            if (obj instanceof C5858) {
                C5858 c5858 = (C5858) obj;
                Object objM18142 = c5858.m18142();
                if (objM18142 != C5858.f14526) {
                    return (Runnable) objM18142;
                }
                C3008.m74(f10080, this, obj, c5858.m18141());
            } else {
                if (obj == C4720.f10092) {
                    return null;
                }
                if (C3008.m74(f10080, this, obj, null)) {
                    return (Runnable) obj;
                }
            }
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟ۨۧ */
    public void mo12589(@InterfaceC6399 Runnable runnable) {
        if (m14094(runnable)) {
            m14107();
        } else {
            RunnableC4337.f8898.mo12589(runnable);
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟ۨۨ, reason: contains not printable characters */
    public final boolean m14094(Runnable runnable) {
        while (true) {
            Object obj = this._queue;
            if (m14090()) {
                return false;
            }
            if (obj == null) {
                if (C3008.m74(f10080, this, null, runnable)) {
                    return true;
                }
            } else if (obj instanceof C5858) {
                C5858 c5858 = (C5858) obj;
                int iM2523 = c5858.m2523(runnable);
                if (iM2523 == 0) {
                    return true;
                }
                if (iM2523 == 1) {
                    C3008.m74(f10080, this, obj, c5858.m18141());
                } else if (iM2523 == 2) {
                    return false;
                }
            } else {
                if (obj == C4720.f10092) {
                    return false;
                }
                C5858 c58582 = new C5858(8, true);
                c58582.m2523((Runnable) obj);
                c58582.m2523(runnable);
                if (C3008.m74(f10080, this, obj, c58582)) {
                    return true;
                }
            }
        }
    }

    /* JADX INFO: renamed from: ۥ۟۠, reason: contains not printable characters */
    public final void m14095() {
        AbstractRunnableC4716 abstractRunnableC4716M24738;
        AbstractC3018 abstractC3018M84 = C3019.m84();
        long jM82 = abstractC3018M84 != null ? abstractC3018M84.m82() : System.nanoTime();
        while (true) {
            C4717 c4717 = (C4717) this._delayed;
            if (c4717 == null || (abstractRunnableC4716M24738 = c4717.m24738()) == null) {
                return;
            } else {
                mo12588(jM82, abstractRunnableC4716M24738);
            }
        }
    }

    /* JADX INFO: renamed from: ۥ۟۠۟, reason: contains not printable characters */
    public final void m14096() {
        this._queue = null;
        this._delayed = null;
    }

    /* JADX INFO: renamed from: ۥ۟۠۟۟, reason: contains not printable characters */
    public final void m14097(long j, @InterfaceC6399 AbstractRunnableC4716 abstractRunnableC4716) {
        int iM14098 = m14098(j, abstractRunnableC4716);
        if (iM14098 == 0) {
            if (m14101(abstractRunnableC4716)) {
                m14107();
            }
        } else if (iM14098 == 1) {
            mo12588(j, abstractRunnableC4716);
        } else if (iM14098 != 2) {
            throw new IllegalStateException("unexpected result".toString());
        }
    }

    /* JADX INFO: renamed from: ۥ۟۠۟۠, reason: contains not printable characters */
    public final int m14098(long j, AbstractRunnableC4716 abstractRunnableC4716) {
        if (m14090()) {
            return 1;
        }
        C4717 c4717 = (C4717) this._delayed;
        if (c4717 == null) {
            C3008.m74(f10081, this, null, new C4717(j));
            Object obj = this._delayed;
            C5499.m17100(obj);
            c4717 = (C4717) obj;
        }
        return abstractRunnableC4716.m14105(j, c4717, this);
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۠۟ۡ, reason: contains not printable characters */
    public final InterfaceC4433 m14099(long j, @InterfaceC6399 Runnable runnable) {
        long jM14110 = C4720.m14110(j);
        if (jM14110 >= 4611686018427387903L) {
            return C6389.f16164;
        }
        AbstractC3018 abstractC3018M84 = C3019.m84();
        long jM82 = abstractC3018M84 != null ? abstractC3018M84.m82() : System.nanoTime();
        C0473 c0473 = new C0473(jM14110 + jM82, runnable);
        m14097(jM82, c0473);
        return c0473;
    }

    /* JADX INFO: renamed from: ۥ۟۠۟ۢ, reason: contains not printable characters */
    public final void m14100(boolean z) {
        this._isCompleted = z ? 1 : 0;
    }

    /* JADX INFO: renamed from: ۥۣ۟۠۟, reason: contains not printable characters */
    public final boolean m14101(AbstractRunnableC4716 abstractRunnableC4716) {
        C4717 c4717 = (C4717) this._delayed;
        return (c4717 != null ? c4717.m24733() : null) == abstractRunnableC4716;
    }
}
