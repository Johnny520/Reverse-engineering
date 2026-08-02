package defpackage;

import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class rc1 {
    public static final /* synthetic */ AtomicReferenceFieldUpdater e = AtomicReferenceFieldUpdater.newUpdater(rc1.class, Object.class, "_next$volatile");
    public static final /* synthetic */ AtomicLongFieldUpdater f = AtomicLongFieldUpdater.newUpdater(rc1.class, "_state$volatile");
    public static final hh1 g = new hh1(19, "REMOVE_FROZEN");
    private volatile /* synthetic */ Object _next$volatile;
    private volatile /* synthetic */ long _state$volatile;
    public final int a;
    public final boolean b;
    public final int c;
    public final /* synthetic */ AtomicReferenceArray d;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public rc1(int i, boolean z) {
        this.a = i;
        this.b = z;
        int i2 = i - 1;
        this.c = i2;
        this.d = new AtomicReferenceArray(i);
        if (i2 > 1073741823) {
            s.l("Check failed.");
            throw null;
        }
        if ((i & i2) == 0) {
            return;
        }
        s.l("Check failed.");
        throw null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int a(Object obj) {
        while (true) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = f;
            long j = atomicLongFieldUpdater.get(this);
            if ((3458764513820540928L & j) != 0) {
                return (2305843009213693952L & j) != 0 ? 2 : 1;
            }
            int i = (int) (1073741823 & j);
            int i2 = (int) ((1152921503533105152L & j) >> 30);
            int i3 = this.c;
            if (((i2 + 2) & i3) == (i & i3)) {
                return 1;
            }
            boolean z = this.b;
            AtomicReferenceArray atomicReferenceArray = this.d;
            if (z || atomicReferenceArray.get(i2 & i3) == null) {
                rc1 rc1Var = this;
                if (f.compareAndSet(rc1Var, j, ((-1152921503533105153L) & j) | (((long) ((i2 + 1) & 1073741823)) << 30))) {
                    atomicReferenceArray.set(i2 & i3, obj);
                    rc1 rc1VarC = rc1Var;
                    while ((atomicLongFieldUpdater.get(rc1VarC) & 1152921504606846976L) != 0) {
                        rc1VarC = rc1VarC.c();
                        AtomicReferenceArray atomicReferenceArray2 = rc1VarC.d;
                        int i4 = rc1VarC.c & i2;
                        Object obj2 = atomicReferenceArray2.get(i4);
                        if ((obj2 instanceof qc1) && ((qc1) obj2).a == i2) {
                            atomicReferenceArray2.set(i4, obj);
                        } else {
                            rc1VarC = null;
                        }
                        if (rc1VarC == null) {
                            return 0;
                        }
                    }
                    return 0;
                }
                this = rc1Var;
            } else {
                int i5 = this.a;
                if (i5 < 1024 || ((i2 - i) & 1073741823) > (i5 >> 1)) {
                    return 1;
                }
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean b() {
        while (true) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = f;
            long j = atomicLongFieldUpdater.get(this);
            if ((j & 2305843009213693952L) != 0) {
                return true;
            }
            if ((1152921504606846976L & j) != 0) {
                return false;
            }
            rc1 rc1Var = this;
            if (atomicLongFieldUpdater.compareAndSet(rc1Var, j, 2305843009213693952L | j)) {
                return true;
            }
            this = rc1Var;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final rc1 c() {
        AtomicLongFieldUpdater atomicLongFieldUpdater;
        long j;
        rc1 rc1Var;
        while (true) {
            atomicLongFieldUpdater = f;
            j = atomicLongFieldUpdater.get(this);
            if ((j & 1152921504606846976L) != 0) {
                rc1Var = this;
                break;
            }
            long j2 = 1152921504606846976L | j;
            rc1Var = this;
            if (atomicLongFieldUpdater.compareAndSet(rc1Var, j, j2)) {
                j = j2;
                break;
            }
            this = rc1Var;
        }
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = e;
            rc1 rc1Var2 = (rc1) atomicReferenceFieldUpdater.get(rc1Var);
            if (rc1Var2 != null) {
                return rc1Var2;
            }
            rc1 rc1Var3 = new rc1(rc1Var.a * 2, rc1Var.b);
            int i = (int) (1073741823 & j);
            int i2 = (int) ((1152921503533105152L & j) >> 30);
            while (true) {
                int i3 = rc1Var.c;
                int i4 = i & i3;
                if (i4 == (i3 & i2)) {
                    break;
                }
                Object qc1Var = rc1Var.d.get(i4);
                if (qc1Var == null) {
                    qc1Var = new qc1(i);
                }
                rc1Var3.d.set(rc1Var3.c & i, qc1Var);
                i++;
            }
            atomicLongFieldUpdater.set(rc1Var3, (-1152921504606846977L) & j);
            while (!atomicReferenceFieldUpdater.compareAndSet(rc1Var, null, rc1Var3) && atomicReferenceFieldUpdater.get(rc1Var) == null) {
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0041, code lost:
    
        return null;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object d() {
        rc1 rc1VarC = this;
        while (true) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = f;
            long j = atomicLongFieldUpdater.get(rc1VarC);
            if ((j & 1152921504606846976L) != 0) {
                return g;
            }
            int i = (int) (j & 1073741823);
            int i2 = rc1VarC.c;
            int i3 = i & i2;
            if ((((int) ((1152921503533105152L & j) >> 30)) & i2) == i3) {
                break;
            }
            AtomicReferenceArray atomicReferenceArray = rc1VarC.d;
            Object obj = atomicReferenceArray.get(i3);
            boolean z = rc1VarC.b;
            if (obj == null) {
                if (z) {
                    break;
                }
            } else {
                if (obj instanceof qc1) {
                    break;
                }
                long j2 = (i + 1) & 1073741823;
                if (f.compareAndSet(rc1VarC, j, (j & (-1073741824)) | j2)) {
                    atomicReferenceArray.set(i3, null);
                    return obj;
                }
                rc1VarC = this;
                if (z) {
                    while (true) {
                        long j3 = atomicLongFieldUpdater.get(rc1VarC);
                        int i4 = (int) (j3 & 1073741823);
                        if ((j3 & 1152921504606846976L) != 0) {
                            rc1VarC = rc1VarC.c();
                        } else {
                            rc1 rc1Var = rc1VarC;
                            if (f.compareAndSet(rc1Var, j3, (j3 & (-1073741824)) | j2)) {
                                rc1Var.d.set(i4 & rc1Var.c, null);
                                rc1VarC = null;
                            } else {
                                rc1VarC = rc1Var;
                            }
                        }
                        if (rc1VarC == null) {
                            return obj;
                        }
                    }
                }
            }
        }
    }
}
