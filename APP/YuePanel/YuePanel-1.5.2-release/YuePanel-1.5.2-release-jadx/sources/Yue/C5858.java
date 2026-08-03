package Yue;

import Yue.C2954;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: renamed from: Yue.ۥ۠ۨ۠ۨ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public final class C5858<E> {

    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public static final int f14514 = 8;

    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public static final int f14515 = 30;

    /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
    public static final int f14516 = 1073741823;

    /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
    public static final int f14517 = 0;

    /* JADX INFO: renamed from: ۥ۟۟۟ۦ, reason: contains not printable characters */
    public static final long f14518 = 1073741823;

    /* JADX INFO: renamed from: ۥ۟۟۟ۧ, reason: contains not printable characters */
    public static final int f14519 = 30;

    /* JADX INFO: renamed from: ۥ۟۟۟ۨ, reason: contains not printable characters */
    public static final long f14520 = 1152921503533105152L;

    /* JADX INFO: renamed from: ۥ۟۟۠, reason: contains not printable characters */
    public static final int f14521 = 60;

    /* JADX INFO: renamed from: ۥ۟۟۠۟, reason: contains not printable characters */
    public static final long f14522 = 1152921504606846976L;

    /* JADX INFO: renamed from: ۥ۟۟۠۠, reason: contains not printable characters */
    public static final int f14523 = 61;

    /* JADX INFO: renamed from: ۥ۟۟۠ۡ, reason: contains not printable characters */
    public static final long f14524 = 2305843009213693952L;

    /* JADX INFO: renamed from: ۥ۟۟۠ۢ, reason: contains not printable characters */
    public static final int f14525 = 1024;

    /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
    public static final int f14527 = 0;

    /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
    public static final int f14528 = 1;

    /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
    public static final int f14529 = 2;

    @InterfaceC6399
    private volatile /* synthetic */ Object _next = null;

    @InterfaceC6399
    private volatile /* synthetic */ long _state = 0;

    /* JADX INFO: renamed from: ۥ */
    public final int f1737;

    /* JADX INFO: renamed from: ۥ۟ */
    public final boolean f1738;

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public final int f14530;

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    @InterfaceC6399
    public /* synthetic */ AtomicReferenceArray f14531;

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    @InterfaceC6399
    public static final C0884 f14511 = new C0884(null);

    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    @InterfaceC6399
    @InterfaceC5568
    public static final C7694 f14526 = new C7694("REMOVE_FROZEN");

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f14512 = AtomicReferenceFieldUpdater.newUpdater(C5858.class, Object.class, "_next");

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public static final /* synthetic */ AtomicLongFieldUpdater f14513 = AtomicLongFieldUpdater.newUpdater(C5858.class, "_state");

    /* JADX INFO: renamed from: Yue.ۥ۠ۨ۠ۨ$ۥ */
    public static final class C0884 {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] (LINE:1) call: Yue.ۥ۠ۨ۠ۨ.ۥ.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public /* synthetic */ C0884(C4335 c4335) {
            this();
        }

        /* JADX INFO: renamed from: ۥ */
        public final int m2525(long j) {
            return (j & C5858.f14524) != 0 ? 2 : 1;
        }

        /* JADX INFO: renamed from: ۥ۟ */
        public final long m2526(long j, int i) {
            return m18146(j, C5858.f14518) | ((long) i);
        }

        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public final long m18144(long j, int i) {
            return m18146(j, C5858.f14520) | (((long) i) << 30);
        }

        /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
        public final <T> T m18145(long j, @InterfaceC6399 InterfaceC5138<? super Integer, ? super Integer, ? extends T> interfaceC5138) {
            return interfaceC5138.invoke(Integer.valueOf((int) (C5858.f14518 & j)), Integer.valueOf((int) ((j & C5858.f14520) >> 30)));
        }

        /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
        public final long m18146(long j, long j2) {
            return j & (~j2);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        public C0884() {
        }
    }

    /* JADX INFO: renamed from: Yue.ۥ۠ۨ۠ۨ$ۥ۟ */
    public static final class C0885 {

        /* JADX INFO: renamed from: ۥ */
        @InterfaceC5568
        public final int f1739;

        public C0885(int i) {
            this.f1739 = i;
        }
    }

    public C5858(int i, boolean z) {
        this.f1737 = i;
        this.f1738 = z;
        int i2 = i - 1;
        this.f14530 = i2;
        this.f14531 = new AtomicReferenceArray(i);
        if (i2 > 1073741823) {
            throw new IllegalStateException("Check failed.".toString());
        }
        if ((i & i2) != 0) {
            throw new IllegalStateException("Check failed.".toString());
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x004a, code lost:
    
        return 1;
     */
    /* JADX INFO: renamed from: ۥ */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int m2523(@InterfaceC6399 E e) {
        while (true) {
            long j = this._state;
            if ((3458764513820540928L & j) != 0) {
                return f14511.m2525(j);
            }
            int i = (int) (f14518 & j);
            int i2 = (int) ((f14520 & j) >> 30);
            int i3 = this.f14530;
            if (((i2 + 2) & i3) == (i & i3)) {
                return 1;
            }
            if (!this.f1738 && this.f14531.get(i2 & i3) != null) {
                int i4 = this.f1737;
                if (i4 < 1024 || ((i2 - i) & f14516) > (i4 >> 1)) {
                    break;
                }
            } else if (f14513.compareAndSet(this, j, f14511.m18144(j, (i2 + 1) & f14516))) {
                this.f14531.set(i2 & i3, e);
                C5858<E> c5858M18135 = this;
                while ((c5858M18135._state & f14522) != 0 && (c5858M18135 = c5858M18135.m18141().m18135(i2, e)) != null) {
                }
                return 0;
            }
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r4v3, resolved type: java.util.concurrent.atomic.AtomicReferenceArray */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: ۥ۟ */
    public final C5858<E> m2524(long j) {
        C5858<E> c5858 = new C5858<>(this.f1737 * 2, this.f1738);
        int i = (int) (f14518 & j);
        int i2 = (int) ((f14520 & j) >> 30);
        while (true) {
            int i3 = this.f14530;
            if ((i & i3) == (i2 & i3)) {
                c5858._state = f14511.m18146(j, f14522);
                return c5858;
            }
            Object c0885 = this.f14531.get(i3 & i);
            if (c0885 == null) {
                c0885 = new C0885(i);
            }
            c5858.f14531.set(c5858.f14530 & i, c0885);
            i++;
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public final C5858<E> m18133(long j) {
        while (true) {
            C5858<E> c5858 = (C5858) this._next;
            if (c5858 != null) {
                return c5858;
            }
            C3008.m74(f14512, this, null, m2524(j));
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public final boolean m18134() {
        long j;
        do {
            j = this._state;
            if ((j & f14524) != 0) {
                return true;
            }
            if ((f14522 & j) != 0) {
                return false;
            }
        } while (!f14513.compareAndSet(this, j, j | f14524));
        return true;
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public final C5858<E> m18135(int i, E e) {
        Object obj = this.f14531.get(this.f14530 & i);
        if (!(obj instanceof C0885) || ((C0885) obj).f1739 != i) {
            return null;
        }
        this.f14531.set(i & this.f14530, e);
        return this;
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public final int m18136() {
        long j = this._state;
        return (((int) ((j & f14520) >> 30)) - ((int) (f14518 & j))) & f14516;
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public final boolean m18137() {
        return (this._state & f14524) != 0;
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public final boolean m18138() {
        long j = this._state;
        return ((int) (f14518 & j)) == ((int) ((j & f14520) >> 30));
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public final <R> List<R> m18139(@InterfaceC6399 InterfaceC5124<? super E, ? extends R> interfaceC5124) {
        ArrayList arrayList = new ArrayList(this.f1737);
        long j = this._state;
        int i = (int) (f14518 & j);
        int i2 = (int) ((j & f14520) >> 30);
        while (true) {
            int i3 = this.f14530;
            if ((i & i3) == (i2 & i3)) {
                return arrayList;
            }
            C2954.C0002 c0002 = (Object) this.f14531.get(i3 & i);
            if (c0002 != null && !(c0002 instanceof C0885)) {
                arrayList.add(interfaceC5124.invoke(c0002));
            }
            i++;
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
    public final long m18140() {
        long j;
        long j2;
        do {
            j = this._state;
            if ((j & f14522) != 0) {
                return j;
            }
            j2 = j | f14522;
        } while (!f14513.compareAndSet(this, j, j2));
        return j2;
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
    public final C5858<E> m18141() {
        return m18133(m18140());
    }

    @InterfaceC6489
    /* JADX INFO: renamed from: ۥ۟۟۟ۦ, reason: contains not printable characters */
    public final Object m18142() {
        while (true) {
            long j = this._state;
            if ((f14522 & j) != 0) {
                return f14526;
            }
            int i = (int) (f14518 & j);
            int i2 = (int) ((f14520 & j) >> 30);
            int i3 = this.f14530;
            if ((i2 & i3) == (i & i3)) {
                return null;
            }
            Object obj = this.f14531.get(i3 & i);
            if (obj == null) {
                if (this.f1738) {
                    return null;
                }
            } else {
                if (obj instanceof C0885) {
                    return null;
                }
                int i4 = (i + 1) & f14516;
                if (f14513.compareAndSet(this, j, f14511.m2526(j, i4))) {
                    this.f14531.set(this.f14530 & i, null);
                    return obj;
                }
                if (this.f1738) {
                    C5858<E> c5858M18143 = this;
                    do {
                        c5858M18143 = c5858M18143.m18143(i, i4);
                    } while (c5858M18143 != null);
                    return obj;
                }
            }
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۧ, reason: contains not printable characters */
    public final C5858<E> m18143(int i, int i2) {
        long j;
        int i3;
        do {
            j = this._state;
            i3 = (int) (f14518 & j);
            if ((f14522 & j) != 0) {
                return m18141();
            }
        } while (!f14513.compareAndSet(this, j, f14511.m2526(j, i2)));
        this.f14531.set(i3 & this.f14530, null);
        return null;
    }
}
