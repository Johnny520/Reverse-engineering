package p000;

import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class rc1 {

    /* JADX INFO: renamed from: e */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f9504e = AtomicReferenceFieldUpdater.newUpdater(rc1.class, Object.class, "_next$volatile");

    /* JADX INFO: renamed from: f */
    public static final /* synthetic */ AtomicLongFieldUpdater f9505f = AtomicLongFieldUpdater.newUpdater(rc1.class, "_state$volatile");

    /* JADX INFO: renamed from: g */
    public static final hh1 f9506g = new hh1(19, "REMOVE_FROZEN");
    private volatile /* synthetic */ Object _next$volatile;
    private volatile /* synthetic */ long _state$volatile;

    /* JADX INFO: renamed from: a */
    public final int f9507a;

    /* JADX INFO: renamed from: b */
    public final boolean f9508b;

    /* JADX INFO: renamed from: c */
    public final int f9509c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ AtomicReferenceArray f9510d;

    public rc1(int i, boolean z) {
        this.f9507a = i;
        this.f9508b = z;
        int i2 = i - 1;
        this.f9509c = i2;
        this.f9510d = new AtomicReferenceArray(i);
        if (i2 > 1073741823) {
            C0676s.m4653l("Check failed.");
            throw null;
        }
        if ((i & i2) == 0) {
            return;
        }
        C0676s.m4653l("Check failed.");
        throw null;
    }

    /* JADX INFO: renamed from: a */
    public final int m4428a(Object obj) {
        while (true) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = f9505f;
            long j = atomicLongFieldUpdater.get(this);
            if ((3458764513820540928L & j) != 0) {
                return (2305843009213693952L & j) != 0 ? 2 : 1;
            }
            int i = (int) (1073741823 & j);
            int i2 = (int) ((1152921503533105152L & j) >> 30);
            int i3 = this.f9509c;
            if (((i2 + 2) & i3) == (i & i3)) {
                return 1;
            }
            boolean z = this.f9508b;
            AtomicReferenceArray atomicReferenceArray = this.f9510d;
            if (z || atomicReferenceArray.get(i2 & i3) == null) {
                rc1 rc1Var = this;
                if (f9505f.compareAndSet(rc1Var, j, ((-1152921503533105153L) & j) | (((long) ((i2 + 1) & 1073741823)) << 30))) {
                    atomicReferenceArray.set(i2 & i3, obj);
                    rc1 rc1VarM4430c = rc1Var;
                    while ((atomicLongFieldUpdater.get(rc1VarM4430c) & 1152921504606846976L) != 0) {
                        rc1VarM4430c = rc1VarM4430c.m4430c();
                        AtomicReferenceArray atomicReferenceArray2 = rc1VarM4430c.f9510d;
                        int i4 = rc1VarM4430c.f9509c & i2;
                        Object obj2 = atomicReferenceArray2.get(i4);
                        if ((obj2 instanceof qc1) && ((qc1) obj2).f8890a == i2) {
                            atomicReferenceArray2.set(i4, obj);
                        } else {
                            rc1VarM4430c = null;
                        }
                        if (rc1VarM4430c == null) {
                            return 0;
                        }
                    }
                    return 0;
                }
                this = rc1Var;
            } else {
                int i5 = this.f9507a;
                if (i5 < 1024 || ((i2 - i) & 1073741823) > (i5 >> 1)) {
                    return 1;
                }
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public final boolean m4429b() {
        while (true) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = f9505f;
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

    /* JADX INFO: renamed from: c */
    public final rc1 m4430c() {
        AtomicLongFieldUpdater atomicLongFieldUpdater;
        long j;
        rc1 rc1Var;
        while (true) {
            atomicLongFieldUpdater = f9505f;
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
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f9504e;
            rc1 rc1Var2 = (rc1) atomicReferenceFieldUpdater.get(rc1Var);
            if (rc1Var2 != null) {
                return rc1Var2;
            }
            rc1 rc1Var3 = new rc1(rc1Var.f9507a * 2, rc1Var.f9508b);
            int i = (int) (1073741823 & j);
            int i2 = (int) ((1152921503533105152L & j) >> 30);
            while (true) {
                int i3 = rc1Var.f9509c;
                int i4 = i & i3;
                if (i4 == (i3 & i2)) {
                    break;
                }
                Object qc1Var = rc1Var.f9510d.get(i4);
                if (qc1Var == null) {
                    qc1Var = new qc1(i);
                }
                rc1Var3.f9510d.set(rc1Var3.f9509c & i, qc1Var);
                i++;
            }
            atomicLongFieldUpdater.set(rc1Var3, (-1152921504606846977L) & j);
            while (!atomicReferenceFieldUpdater.compareAndSet(rc1Var, null, rc1Var3) && atomicReferenceFieldUpdater.get(rc1Var) == null) {
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0041, code lost:
    
        return null;
     */
    /* JADX INFO: renamed from: d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m4431d() {
        rc1 rc1VarM4430c = this;
        while (true) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = f9505f;
            long j = atomicLongFieldUpdater.get(rc1VarM4430c);
            if ((j & 1152921504606846976L) != 0) {
                return f9506g;
            }
            int i = (int) (j & 1073741823);
            int i2 = rc1VarM4430c.f9509c;
            int i3 = i & i2;
            if ((((int) ((1152921503533105152L & j) >> 30)) & i2) == i3) {
                break;
            }
            AtomicReferenceArray atomicReferenceArray = rc1VarM4430c.f9510d;
            Object obj = atomicReferenceArray.get(i3);
            boolean z = rc1VarM4430c.f9508b;
            if (obj == null) {
                if (z) {
                    break;
                }
            } else {
                if (obj instanceof qc1) {
                    break;
                }
                long j2 = (i + 1) & 1073741823;
                if (f9505f.compareAndSet(rc1VarM4430c, j, (j & (-1073741824)) | j2)) {
                    atomicReferenceArray.set(i3, null);
                    return obj;
                }
                rc1VarM4430c = this;
                if (z) {
                    while (true) {
                        long j3 = atomicLongFieldUpdater.get(rc1VarM4430c);
                        int i4 = (int) (j3 & 1073741823);
                        if ((j3 & 1152921504606846976L) != 0) {
                            rc1VarM4430c = rc1VarM4430c.m4430c();
                        } else {
                            rc1 rc1Var = rc1VarM4430c;
                            if (f9505f.compareAndSet(rc1Var, j3, (j3 & (-1073741824)) | j2)) {
                                rc1Var.f9510d.set(i4 & rc1Var.f9509c, null);
                                rc1VarM4430c = null;
                            } else {
                                rc1VarM4430c = rc1Var;
                            }
                        }
                        if (rc1VarM4430c == null) {
                            return obj;
                        }
                    }
                }
            }
        }
    }
}
