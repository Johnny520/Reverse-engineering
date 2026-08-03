package Yue;

import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CancellationException;
import java.util.concurrent.locks.ReentrantLock;

/* JADX INFO: renamed from: Yue.ۥ۟ۡۦۨ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public final class C3379<E> extends AbstractC3009<E> implements InterfaceC3592<E> {

    @InterfaceC6399
    private volatile /* synthetic */ long _head;

    @InterfaceC6399
    private volatile /* synthetic */ int _size;

    @InterfaceC6399
    private volatile /* synthetic */ long _tail;

    /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
    public final int f5418;

    /* JADX INFO: renamed from: ۥ۟۟۠ۧ, reason: contains not printable characters */
    @InterfaceC6399
    public final ReentrantLock f5419;

    /* JADX INFO: renamed from: ۥ۟۟۠ۨ, reason: contains not printable characters */
    @InterfaceC6399
    public final Object[] f5420;

    /* JADX INFO: renamed from: ۥ۟۟ۡ, reason: contains not printable characters */
    @InterfaceC6399
    public final List<C0125<E>> f5421;

    /* JADX INFO: renamed from: Yue.ۥ۟ۡۦۨ$ۥ */
    public static final class C0125<E> extends AbstractC2968<E> implements InterfaceC7042<E> {

        @InterfaceC6399
        private volatile /* synthetic */ long _subHead;

        /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
        @InterfaceC6399
        public final C3379<E> f5422;

        /* JADX INFO: renamed from: ۥ۟۟۠ۧ, reason: contains not printable characters */
        @InterfaceC6399
        public final ReentrantLock f5423;

        public C0125(@InterfaceC6399 C3379<E> c3379) {
            super(null);
            this.f5422 = c3379;
            this.f5423 = new ReentrantLock();
            this._subHead = 0L;
        }

        @Override // Yue.AbstractC3009, Yue.InterfaceC7317
        /* JADX INFO: renamed from: ۥ۟۟ۡۤ */
        public boolean mo5860(@InterfaceC6489 Throwable th) {
            boolean zMo5860 = super.mo5860(th);
            if (zMo5860) {
                C3379.m6937(this.f5422, null, this, 1, null);
                ReentrantLock reentrantLock = this.f5423;
                reentrantLock.lock();
                try {
                    m6956(this.f5422.m6947());
                    C8107 c8107 = C8107.f3222;
                } finally {
                    reentrantLock.unlock();
                }
            }
            return zMo5860;
        }

        @Override // Yue.AbstractC3009
        /* JADX INFO: renamed from: ۥ۟۟ۡۦ */
        public boolean mo5861() {
            throw new IllegalStateException("Should not be used".toString());
        }

        @Override // Yue.AbstractC3009
        /* JADX INFO: renamed from: ۥ۟۟ۡۧ */
        public boolean mo5862() {
            throw new IllegalStateException("Should not be used".toString());
        }

        @Override // Yue.AbstractC2968
        /* JADX INFO: renamed from: ۥۣ۟۟ۨ */
        public boolean mo5734() {
            return false;
        }

        @Override // Yue.AbstractC2968
        /* JADX INFO: renamed from: ۥ۟۟ۤ */
        public boolean mo5735() {
            return m6953() >= this.f5422.m6947();
        }

        @Override // Yue.AbstractC2968
        @InterfaceC6489
        /* JADX INFO: renamed from: ۥ۟۟ۤۤ */
        public Object mo5741() {
            boolean z;
            ReentrantLock reentrantLock = this.f5423;
            reentrantLock.lock();
            try {
                Object objM6955 = m6955();
                if ((objM6955 instanceof C3850) || objM6955 == C2978.f4312) {
                    z = false;
                } else {
                    m6956(m6953() + 1);
                    z = true;
                }
                reentrantLock.unlock();
                C3850 c3850 = objM6955 instanceof C3850 ? (C3850) objM6955 : null;
                if (c3850 != null) {
                    mo5860(c3850.f7349);
                }
                if (m6952() ? true : z) {
                    C3379.m6937(this.f5422, null, null, 3, null);
                }
                return objM6955;
            } catch (Throwable th) {
                reentrantLock.unlock();
                throw th;
            }
        }

        @Override // Yue.AbstractC2968
        @InterfaceC6489
        /* JADX INFO: renamed from: ۥ۟۟ۤۥ */
        public Object mo5742(@InterfaceC6399 InterfaceC7289<?> interfaceC7289) {
            ReentrantLock reentrantLock = this.f5423;
            reentrantLock.lock();
            try {
                Object objM6955 = m6955();
                boolean z = false;
                if (!(objM6955 instanceof C3850) && objM6955 != C2978.f4312) {
                    if (interfaceC7289.mo22760()) {
                        m6956(m6953() + 1);
                        z = true;
                    } else {
                        objM6955 = C7291.m22775();
                    }
                }
                reentrantLock.unlock();
                C3850 c3850 = objM6955 instanceof C3850 ? (C3850) objM6955 : null;
                if (c3850 != null) {
                    mo5860(c3850.f7349);
                }
                if (m6952() ? true : z) {
                    C3379.m6937(this.f5422, null, null, 3, null);
                }
                return objM6955;
            } catch (Throwable th) {
                reentrantLock.unlock();
                throw th;
            }
        }

        /* JADX DEBUG: Multi-variable search result rejected for r3v2, resolved type: Yue.ۥۡۦۡ۠ */
        /* JADX WARN: Code restructure failed: missing block: B:12:0x0022, code lost:
        
            r2 = (Yue.C3850) r1;
         */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX INFO: renamed from: ۥ۟۟ۥ۟, reason: contains not printable characters */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final boolean m6952() {
            C3850 c3850;
            boolean z = false;
            while (true) {
                c3850 = null;
                if (!m6954() || !this.f5423.tryLock()) {
                    break;
                }
                try {
                    Object objM6955 = m6955();
                    if (objM6955 != C2978.f4312) {
                        if (objM6955 instanceof C3850) {
                            break;
                        }
                        InterfaceC7046<E> interfaceC7046Mo5727 = mo5727();
                        if (interfaceC7046Mo5727 != 0 && !(interfaceC7046Mo5727 instanceof C3850)) {
                            if (interfaceC7046Mo5727.mo5752(objM6955, null) != null) {
                                m6956(m6953() + 1);
                                this.f5423.unlock();
                                interfaceC7046Mo5727.mo5753(objM6955);
                                z = true;
                            }
                        }
                    }
                } finally {
                    this.f5423.unlock();
                }
            }
            if (c3850 != null) {
                mo5860(c3850.f7349);
            }
            return z;
        }

        /* JADX INFO: renamed from: ۥ۟۟ۥ۠, reason: contains not printable characters */
        public final long m6953() {
            return this._subHead;
        }

        /* JADX INFO: renamed from: ۥ۟۟ۥۡ, reason: contains not printable characters */
        public final boolean m6954() {
            if (m5850() != null) {
                return false;
            }
            return (mo5735() && this.f5422.m5850() == null) ? false : true;
        }

        /* JADX INFO: renamed from: ۥ۟۟ۥۢ, reason: contains not printable characters */
        public final Object m6955() {
            long jM6953 = m6953();
            C3850<?> c3850M5850 = this.f5422.m5850();
            if (jM6953 < this.f5422.m6947()) {
                Object objM6944 = this.f5422.m6944(jM6953);
                C3850<?> c3850M58502 = m5850();
                return c3850M58502 != null ? c3850M58502 : objM6944;
            }
            if (c3850M5850 != null) {
                return c3850M5850;
            }
            C3850<?> c3850M58503 = m5850();
            return c3850M58503 == null ? C2978.f4312 : c3850M58503;
        }

        /* JADX INFO: renamed from: ۥ۟۟ۥۣ, reason: contains not printable characters */
        public final void m6956(long j) {
            this._subHead = j;
        }
    }

    public C3379(int i) {
        super(null);
        this.f5418 = i;
        if (i < 1) {
            throw new IllegalArgumentException(("ArrayBroadcastChannel capacity must be at least 1, but " + i + " was specified").toString());
        }
        this.f5419 = new ReentrantLock();
        this.f5420 = new Object[i];
        this._head = 0L;
        this._tail = 0L;
        this._size = 0;
        this.f5421 = C4076.m11511();
    }

    /* JADX INFO: renamed from: ۥۣ۟۟ۦ, reason: contains not printable characters */
    private final int m6935() {
        return this._size;
    }

    /* JADX INFO: renamed from: ۥۣ۟۟ۧ, reason: contains not printable characters */
    public static /* synthetic */ void m6936() {
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: Yue.ۥ۟ۡۦۨ */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: ۥ۟۟ۤۢ, reason: contains not printable characters */
    public static /* synthetic */ void m6937(C3379 c3379, C0125 c0125, C0125 c01252, int i, Object obj) {
        if ((i & 1) != 0) {
            c0125 = null;
        }
        if ((i & 2) != 0) {
            c01252 = null;
        }
        c3379.m6951(c0125, c01252);
    }

    @Override // Yue.InterfaceC3592
    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public void mo6939(@InterfaceC6489 CancellationException cancellationException) {
        mo6938(cancellationException);
    }

    @Override // Yue.AbstractC3009
    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۟۠ۡ */
    public String mo5849() {
        return "(buffer:capacity=" + this.f5420.length + ",size=" + m6935() + ')';
    }

    @Override // Yue.AbstractC3009, Yue.InterfaceC7317
    /* JADX INFO: renamed from: ۥ۟۟ۡۤ */
    public boolean mo5860(@InterfaceC6489 Throwable th) {
        if (!super.mo5860(th)) {
            return false;
        }
        m6942();
        return true;
    }

    @Override // Yue.InterfaceC3592
    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۟ۡۥ, reason: contains not printable characters */
    public InterfaceC7042<E> mo6940() {
        C0125 c0125 = new C0125(this);
        m6937(this, c0125, null, 2, null);
        return c0125;
    }

    @Override // Yue.AbstractC3009
    /* JADX INFO: renamed from: ۥ۟۟ۡۦ */
    public boolean mo5861() {
        return false;
    }

    @Override // Yue.AbstractC3009
    /* JADX INFO: renamed from: ۥ۟۟ۡۧ */
    public boolean mo5862() {
        return m6935() >= this.f5418;
    }

    @Override // Yue.AbstractC3009
    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۟ۢ۟ */
    public Object mo5865(E e) {
        ReentrantLock reentrantLock = this.f5419;
        reentrantLock.lock();
        try {
            C3850<?> c3850M5851 = m5851();
            if (c3850M5851 != null) {
                return c3850M5851;
            }
            int iM6935 = m6935();
            if (iM6935 >= this.f5418) {
                return C2978.f4311;
            }
            long jM6947 = m6947();
            this.f5420[(int) (jM6947 % ((long) this.f5418))] = e;
            m6949(iM6935 + 1);
            m6950(jM6947 + 1);
            C8107 c8107 = C8107.f3222;
            reentrantLock.unlock();
            m6942();
            return C2978.f4310;
        } finally {
            reentrantLock.unlock();
        }
    }

    @Override // Yue.AbstractC3009
    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۟ۢۢ */
    public Object mo5868(E e, @InterfaceC6399 InterfaceC7289<?> interfaceC7289) {
        ReentrantLock reentrantLock = this.f5419;
        reentrantLock.lock();
        try {
            C3850<?> c3850M5851 = m5851();
            if (c3850M5851 != null) {
                return c3850M5851;
            }
            int iM6935 = m6935();
            if (iM6935 >= this.f5418) {
                return C2978.f4311;
            }
            if (!interfaceC7289.mo22760()) {
                return C7291.m22775();
            }
            long jM6947 = m6947();
            this.f5420[(int) (jM6947 % ((long) this.f5418))] = e;
            m6949(iM6935 + 1);
            m6950(jM6947 + 1);
            C8107 c8107 = C8107.f3222;
            reentrantLock.unlock();
            m6942();
            return C2978.f4310;
        } finally {
            reentrantLock.unlock();
        }
    }

    /* JADX DEBUG: Method merged with bridge method: ۥ۟۟(Ljava/lang/Throwable;)Z */
    @Override // Yue.InterfaceC3592
    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters and merged with bridge method [inline-methods] */
    public final boolean mo6938(Throwable th) {
        boolean zMo5860 = mo5860(th);
        Iterator<C0125<E>> it = this.f5421.iterator();
        while (it.hasNext()) {
            it.next().mo5717(th);
        }
        return zMo5860;
    }

    /* JADX INFO: renamed from: ۥۣ۟۟ۡ, reason: contains not printable characters */
    public final void m6942() {
        boolean z;
        Iterator<C0125<E>> it = this.f5421.iterator();
        boolean z2 = false;
        loop0: while (true) {
            z = z2;
            while (it.hasNext()) {
                if (it.next().m6952()) {
                    break;
                } else {
                    z = true;
                }
            }
            z2 = true;
        }
        if (z2 || !z) {
            m6937(this, null, null, 3, null);
        }
    }

    /* JADX INFO: renamed from: ۥۣ۟۟ۢ, reason: contains not printable characters */
    public final long m6943() {
        Iterator<C0125<E>> it = this.f5421.iterator();
        long jM21669 = Long.MAX_VALUE;
        while (it.hasNext()) {
            jM21669 = C7007.m21669(jM21669, it.next().m6953());
        }
        return jM21669;
    }

    /* JADX INFO: renamed from: ۥۣۣ۟۟, reason: contains not printable characters */
    public final E m6944(long j) {
        return (E) this.f5420[(int) (j % ((long) this.f5418))];
    }

    /* JADX INFO: renamed from: ۥۣ۟۟ۤ, reason: contains not printable characters */
    public final int m6945() {
        return this.f5418;
    }

    /* JADX INFO: renamed from: ۥۣ۟۟ۥ, reason: contains not printable characters */
    public final long m6946() {
        return this._head;
    }

    /* JADX INFO: renamed from: ۥۣ۟۟ۨ, reason: contains not printable characters */
    public final long m6947() {
        return this._tail;
    }

    /* JADX INFO: renamed from: ۥ۟۟ۤ, reason: contains not printable characters */
    public final void m6948(long j) {
        this._head = j;
    }

    /* JADX INFO: renamed from: ۥ۟۟ۤ۟, reason: contains not printable characters */
    public final void m6949(int i) {
        this._size = i;
    }

    /* JADX INFO: renamed from: ۥ۟۟ۤ۠, reason: contains not printable characters */
    public final void m6950(long j) {
        this._tail = j;
    }

    /* JADX INFO: renamed from: ۥ۟۟ۤۡ, reason: contains not printable characters */
    public final void m6951(C0125<E> c0125, C0125<E> c01252) {
        AbstractC7312 abstractC7312M5873;
        while (true) {
            ReentrantLock reentrantLock = this.f5419;
            reentrantLock.lock();
            if (c0125 != null) {
                try {
                    c0125.m6956(m6947());
                    boolean zIsEmpty = this.f5421.isEmpty();
                    this.f5421.add(c0125);
                    if (!zIsEmpty) {
                        return;
                    }
                } finally {
                    reentrantLock.unlock();
                }
            }
            if (c01252 != null) {
                this.f5421.remove(c01252);
                if (m6946() != c01252.m6953()) {
                    return;
                }
            }
            long jM6943 = m6943();
            long jM6947 = m6947();
            long jM6946 = m6946();
            long jM21669 = C7007.m21669(jM6943, jM6947);
            if (jM21669 <= jM6946) {
                return;
            }
            int iM6935 = m6935();
            while (jM6946 < jM21669) {
                Object[] objArr = this.f5420;
                int i = this.f5418;
                objArr[(int) (jM6946 % ((long) i))] = null;
                boolean z = iM6935 >= i;
                jM6946++;
                m6948(jM6946);
                int i2 = iM6935 - 1;
                m6949(i2);
                if (z) {
                    do {
                        abstractC7312M5873 = m5873();
                        if (abstractC7312M5873 != null && !(abstractC7312M5873 instanceof C3850)) {
                            C5499.m17100(abstractC7312M5873);
                        }
                    } while (abstractC7312M5873.mo5877(null) == null);
                    this.f5420[(int) (jM6947 % ((long) this.f5418))] = abstractC7312M5873.mo5875();
                    m6949(iM6935);
                    m6950(jM6947 + 1);
                    C8107 c8107 = C8107.f3222;
                    reentrantLock.unlock();
                    abstractC7312M5873.mo5874();
                    m6942();
                    c0125 = null;
                    c01252 = null;
                }
                iM6935 = i2;
            }
            return;
        }
    }
}
