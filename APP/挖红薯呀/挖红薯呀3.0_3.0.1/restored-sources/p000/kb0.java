package p000;

import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import sun.misc.Unsafe;

/* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
/* JADX INFO: loaded from: classes.dex */
public final class kb0 {
    private volatile /* synthetic */ Object _next$volatile;
    private volatile /* synthetic */ long _state$volatile;

    /* JADX INFO: renamed from: a */
    public final int f3062a;

    /* JADX INFO: renamed from: b */
    public final boolean f3063b;

    /* JADX INFO: renamed from: c */
    public final int f3064c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ AtomicReferenceArray f3065d;

    /* JADX INFO: renamed from: e */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f3058e = AtomicReferenceFieldUpdater.newUpdater(kb0.class, Object.class, "_next$volatile");

    /* JADX INFO: renamed from: h */
    public static final /* synthetic */ long f3061h = uw0.f6315a.objectFieldOffset(kb0.class.getDeclaredField("_next$volatile"));

    /* JADX INFO: renamed from: f */
    public static final /* synthetic */ AtomicLongFieldUpdater f3059f = AtomicLongFieldUpdater.newUpdater(kb0.class, "_state$volatile");

    /* JADX INFO: renamed from: g */
    public static final C1014zr f3060g = new C1014zr("REMOVE_FROZEN", 1);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public kb0(int i, boolean z) {
        this.f3062a = i;
        this.f3063b = z;
        int i2 = i - 1;
        this.f3064c = i2;
        this.f3065d = new AtomicReferenceArray(i);
        if (i2 > 1073741823) {
            C0921xc.m5134o("Check failed.");
            throw null;
        }
        if ((i & i2) == 0) {
            return;
        }
        C0921xc.m5134o("Check failed.");
        throw null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public final int m1783a(Object obj) {
        while (true) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = f3059f;
            long j = atomicLongFieldUpdater.get(this);
            if ((3458764513820540928L & j) != 0) {
                return (2305843009213693952L & j) != 0 ? 2 : 1;
            }
            int i = (int) (1073741823 & j);
            int i2 = (int) ((1152921503533105152L & j) >> 30);
            int i3 = this.f3064c;
            if (((i2 + 2) & i3) == (i & i3)) {
                return 1;
            }
            boolean z = this.f3063b;
            AtomicReferenceArray atomicReferenceArray = this.f3065d;
            if (z || atomicReferenceArray.get(i2 & i3) == null) {
                kb0 kb0Var = this;
                if (f3059f.compareAndSet(kb0Var, j, ((-1152921503533105153L) & j) | (((long) ((i2 + 1) & 1073741823)) << 30))) {
                    atomicReferenceArray.set(i2 & i3, obj);
                    kb0 kb0VarM1786d = kb0Var;
                    while ((atomicLongFieldUpdater.get(kb0VarM1786d) & 1152921504606846976L) != 0) {
                        kb0VarM1786d = kb0VarM1786d.m1786d();
                        AtomicReferenceArray atomicReferenceArray2 = kb0VarM1786d.f3065d;
                        int i4 = kb0VarM1786d.f3064c & i2;
                        Object obj2 = atomicReferenceArray2.get(i4);
                        if ((obj2 instanceof jb0) && ((jb0) obj2).f2785a == i2) {
                            atomicReferenceArray2.set(i4, obj);
                        } else {
                            kb0VarM1786d = null;
                        }
                        if (kb0VarM1786d == null) {
                            return 0;
                        }
                    }
                    return 0;
                }
                this = kb0Var;
            } else {
                int i5 = this.f3062a;
                if (i5 < 1024 || ((i2 - i) & 1073741823) > (i5 >> 1)) {
                    return 1;
                }
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b */
    public final kb0 m1784b(long j) {
        kb0 kb0Var;
        while (true) {
            f3058e.getClass();
            Unsafe unsafe = uw0.f6315a;
            long j2 = f3061h;
            kb0 kb0Var2 = (kb0) unsafe.getObjectVolatile(this, j2);
            if (kb0Var2 != null) {
                return kb0Var2;
            }
            kb0 kb0Var3 = new kb0(this.f3062a * 2, this.f3063b);
            int i = (int) (1073741823 & j);
            int i2 = (int) ((1152921503533105152L & j) >> 30);
            while (true) {
                int i3 = this.f3064c;
                int i4 = i & i3;
                if (i4 == (i3 & i2)) {
                    break;
                }
                Object jb0Var = this.f3065d.get(i4);
                if (jb0Var == null) {
                    jb0Var = new jb0(i);
                }
                kb0Var3.f3065d.set(kb0Var3.f3064c & i, jb0Var);
                i++;
            }
            f3059f.set(kb0Var3, (-1152921504606846977L) & j);
            while (true) {
                Unsafe unsafe2 = uw0.f6315a;
                kb0Var = this;
                if (!unsafe2.compareAndSwapObject(kb0Var, f3061h, (Object) null, kb0Var3) && unsafe2.getObjectVolatile(kb0Var, j2) == null) {
                    this = kb0Var;
                }
            }
            this = kb0Var;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: c */
    public final boolean m1785c() {
        while (true) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = f3059f;
            long j = atomicLongFieldUpdater.get(this);
            if ((j & 2305843009213693952L) != 0) {
                return true;
            }
            if ((1152921504606846976L & j) != 0) {
                return false;
            }
            kb0 kb0Var = this;
            if (atomicLongFieldUpdater.compareAndSet(kb0Var, j, 2305843009213693952L | j)) {
                return true;
            }
            this = kb0Var;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: d */
    public final kb0 m1786d() {
        long j;
        kb0 kb0Var;
        while (true) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = f3059f;
            j = atomicLongFieldUpdater.get(this);
            if ((j & 1152921504606846976L) != 0) {
                kb0Var = this;
                break;
            }
            long j2 = 1152921504606846976L | j;
            kb0Var = this;
            if (atomicLongFieldUpdater.compareAndSet(kb0Var, j, j2)) {
                j = j2;
                break;
            }
            this = kb0Var;
        }
        return kb0Var.m1784b(j);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0041, code lost:
    
        return null;
     */
    /* JADX INFO: renamed from: e */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m1787e() {
        kb0 kb0VarM1786d = this;
        while (true) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = f3059f;
            long j = atomicLongFieldUpdater.get(kb0VarM1786d);
            if ((j & 1152921504606846976L) != 0) {
                return f3060g;
            }
            int i = (int) (j & 1073741823);
            int i2 = kb0VarM1786d.f3064c;
            int i3 = i & i2;
            if ((((int) ((1152921503533105152L & j) >> 30)) & i2) == i3) {
                break;
            }
            AtomicReferenceArray atomicReferenceArray = kb0VarM1786d.f3065d;
            Object obj = atomicReferenceArray.get(i3);
            boolean z = kb0VarM1786d.f3063b;
            if (obj == null) {
                if (z) {
                    break;
                }
            } else {
                if (obj instanceof jb0) {
                    break;
                }
                long j2 = (i + 1) & 1073741823;
                if (f3059f.compareAndSet(kb0VarM1786d, j, (j & (-1073741824)) | j2)) {
                    atomicReferenceArray.set(i3, null);
                    return obj;
                }
                kb0VarM1786d = this;
                if (z) {
                    while (true) {
                        long j3 = atomicLongFieldUpdater.get(kb0VarM1786d);
                        int i4 = (int) (j3 & 1073741823);
                        if ((j3 & 1152921504606846976L) != 0) {
                            kb0VarM1786d = kb0VarM1786d.m1786d();
                        } else {
                            kb0 kb0Var = kb0VarM1786d;
                            if (f3059f.compareAndSet(kb0Var, j3, (j3 & (-1073741824)) | j2)) {
                                kb0Var.f3065d.set(i4 & kb0Var.f3064c, null);
                                kb0VarM1786d = null;
                            } else {
                                kb0VarM1786d = kb0Var;
                            }
                        }
                        if (kb0VarM1786d == null) {
                            return obj;
                        }
                    }
                }
            }
        }
    }
}
