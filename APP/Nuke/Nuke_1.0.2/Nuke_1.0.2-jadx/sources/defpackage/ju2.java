package defpackage;

import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class ju2 extends n3 implements zj0, hu2, vk1 {
    public static final /* synthetic */ AtomicReferenceFieldUpdater m = AtomicReferenceFieldUpdater.newUpdater(ju2.class, Object.class, "_state$volatile");
    private volatile /* synthetic */ Object _state$volatile;
    public int l;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public ju2(Object obj) {
        this._state$volatile = obj;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Duplicate block (B:59:0x00e7) to fix multi-entry loop: BACK_EDGE: B:59:0x00e7 -> B:28:0x006d */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x006d, code lost:
    
        if (r15 != r2) goto L28;
     */
    /* JADX WARN: Path cross not found for [B:36:0x0083, B:38:0x0089], limit reached: 65 */
    /* JADX WARN: Path cross not found for [B:38:0x0089, B:36:0x0083], limit reached: 65 */
    /* JADX WARN: Path cross not found for [B:38:0x0089, B:46:0x00a4], limit reached: 65 */
    /* JADX WARN: Path cross not found for [B:58:0x00e6, B:59:0x00e7], limit reached: 65 */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0075 A[Catch: all -> 0x0036, TryCatch #0 {all -> 0x0036, blocks: (B:14:0x0032, B:28:0x006d, B:30:0x0075, B:33:0x007c, B:34:0x0080, B:36:0x0083, B:46:0x00a4, B:49:0x00b4, B:50:0x00d0, B:56:0x00e0, B:53:0x00d7, B:55:0x00dd, B:38:0x0089, B:42:0x0090, B:21:0x0047, B:24:0x004f, B:27:0x005d), top: B:63:0x0022 }] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0083 A[Catch: all -> 0x0036, TryCatch #0 {all -> 0x0036, blocks: (B:14:0x0032, B:28:0x006d, B:30:0x0075, B:33:0x007c, B:34:0x0080, B:36:0x0083, B:46:0x00a4, B:49:0x00b4, B:50:0x00d0, B:56:0x00e0, B:53:0x00d7, B:55:0x00dd, B:38:0x0089, B:42:0x0090, B:21:0x0047, B:24:0x004f, B:27:0x005d), top: B:63:0x0022 }] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00b4 A[Catch: all -> 0x0036, TryCatch #0 {all -> 0x0036, blocks: (B:14:0x0032, B:28:0x006d, B:30:0x0075, B:33:0x007c, B:34:0x0080, B:36:0x0083, B:46:0x00a4, B:49:0x00b4, B:50:0x00d0, B:56:0x00e0, B:53:0x00d7, B:55:0x00dd, B:38:0x0089, B:42:0x0090, B:21:0x0047, B:24:0x004f, B:27:0x005d), top: B:63:0x0022 }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:48:0x00b3 -> B:28:0x006d). Please report as a decompilation issue!!! */
    @Override // defpackage.zj0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(ak0 ak0Var, t00 t00Var) {
        iu2 iu2Var;
        ku2 ku2Var;
        ak0 ak0Var2;
        k21 k21Var;
        Object obj;
        Object andSet;
        Object obj2;
        Object obj3;
        if (t00Var instanceof iu2) {
            iu2Var = (iu2) t00Var;
            int i = iu2Var.r;
            if ((i & Integer.MIN_VALUE) != 0) {
                iu2Var.r = i - Integer.MIN_VALUE;
            } else {
                iu2Var = new iu2(this, t00Var);
            }
        }
        Object obj4 = iu2Var.p;
        int i2 = iu2Var.r;
        k20 k20Var = k20.h;
        try {
            if (i2 == 0) {
                fg1.T(obj4);
                ku2Var = (ku2) b();
            } else if (i2 == 1) {
                ku2Var = iu2Var.l;
                ak0Var = iu2Var.k;
                fg1.T(obj4);
            } else if (i2 == 2) {
                obj = iu2Var.o;
                k21Var = iu2Var.m;
                ku2Var = iu2Var.l;
                ak0Var2 = iu2Var.k;
                fg1.T(obj4);
                AtomicReference atomicReference = ku2Var.a;
                hh1 hh1Var = pp0.i;
                andSet = atomicReference.getAndSet(hh1Var);
                andSet.getClass();
                if (andSet == pp0.j) {
                }
                obj2 = m.get(this);
                if (k21Var != null) {
                }
                if (obj != null) {
                }
                if (obj2 != up0.e) {
                }
                iu2Var.k = ak0Var2;
                iu2Var.l = ku2Var;
                iu2Var.m = k21Var;
                iu2Var.n = null;
                iu2Var.o = obj2;
                iu2Var.r = 2;
                if (ak0Var2.m(obj3, iu2Var) != k20Var) {
                }
            } else {
                if (i2 != 3) {
                    s.l("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                obj = iu2Var.n;
                k21Var = iu2Var.m;
                ku2Var = iu2Var.l;
                ak0Var2 = iu2Var.k;
                fg1.T(obj4);
                obj2 = m.get(this);
                if (k21Var != null && !k21Var.b()) {
                    throw k21Var.q();
                }
                if (obj != null || !obj.equals(obj2)) {
                    obj3 = obj2 != up0.e ? null : obj2;
                    iu2Var.k = ak0Var2;
                    iu2Var.l = ku2Var;
                    iu2Var.m = k21Var;
                    iu2Var.n = null;
                    iu2Var.o = obj2;
                    iu2Var.r = 2;
                    if (ak0Var2.m(obj3, iu2Var) != k20Var) {
                        return k20Var;
                    }
                    obj = obj2;
                }
                AtomicReference atomicReference2 = ku2Var.a;
                hh1 hh1Var2 = pp0.i;
                andSet = atomicReference2.getAndSet(hh1Var2);
                andSet.getClass();
                if (andSet == pp0.j) {
                    iu2Var.k = ak0Var2;
                    iu2Var.l = ku2Var;
                    iu2Var.m = k21Var;
                    iu2Var.n = obj;
                    iu2Var.o = null;
                    iu2Var.r = 3;
                    a83 a83Var = a83.a;
                    mp mpVar = new mp(1, gf1.z(iu2Var));
                    mpVar.u();
                    AtomicReference atomicReference3 = ku2Var.a;
                    while (true) {
                        if (atomicReference3.compareAndSet(hh1Var2, mpVar)) {
                            break;
                        }
                        if (atomicReference3.get() != hh1Var2) {
                            mpVar.h(a83Var);
                            break;
                        }
                    }
                    Object objT = mpVar.t();
                    if (objT == k20Var) {
                    }
                    if (objT != k20Var) {
                    }
                    return k20Var;
                }
                obj2 = m.get(this);
                if (k21Var != null) {
                    throw k21Var.q();
                }
                if (obj != null) {
                }
                if (obj2 != up0.e) {
                }
                iu2Var.k = ak0Var2;
                iu2Var.l = ku2Var;
                iu2Var.m = k21Var;
                iu2Var.n = null;
                iu2Var.o = obj2;
                iu2Var.r = 2;
                if (ak0Var2.m(obj3, iu2Var) != k20Var) {
                }
            }
            a20 a20Var = iu2Var.i;
            a20Var.getClass();
            ak0Var2 = ak0Var;
            k21Var = (k21) a20Var.o(sn.K);
            obj = null;
            obj2 = m.get(this);
            if (k21Var != null) {
            }
            if (obj != null) {
            }
            if (obj2 != up0.e) {
            }
            iu2Var.k = ak0Var2;
            iu2Var.l = ku2Var;
            iu2Var.m = k21Var;
            iu2Var.n = null;
            iu2Var.o = obj2;
            iu2Var.r = 2;
            if (ak0Var2.m(obj3, iu2Var) != k20Var) {
            }
        } catch (Throwable th) {
            e(ku2Var);
            throw th;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.n3
    public final o3 c() {
        return new ku2();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.n3
    public final o3[] d() {
        return new ku2[2];
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void g(Object obj) {
        if (obj == null) {
            obj = up0.e;
        }
        h(null, obj);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.hu2
    public final Object getValue() {
        hh1 hh1Var = up0.e;
        Object obj = m.get(this);
        if (obj == hh1Var) {
            return null;
        }
        return obj;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean h(Object obj, Object obj2) {
        int i;
        o3[] o3VarArr;
        hh1 hh1Var;
        synchronized (this) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = m;
            Object obj3 = atomicReferenceFieldUpdater.get(this);
            if (obj != null && !t11.l(obj3, obj)) {
                return false;
            }
            if (t11.l(obj3, obj2)) {
                return true;
            }
            atomicReferenceFieldUpdater.set(this, obj2);
            int i2 = this.l;
            if ((i2 & 1) != 0) {
                this.l = i2 + 2;
                return true;
            }
            int i3 = i2 + 1;
            this.l = i3;
            o3[] o3VarArr2 = this.h;
            while (true) {
                ku2[] ku2VarArr = (ku2[]) o3VarArr2;
                if (ku2VarArr != null) {
                    for (ku2 ku2Var : ku2VarArr) {
                        if (ku2Var != null) {
                            AtomicReference atomicReference = ku2Var.a;
                            while (true) {
                                Object obj4 = atomicReference.get();
                                if (obj4 != null && obj4 != (hh1Var = pp0.j)) {
                                    hh1 hh1Var2 = pp0.i;
                                    if (obj4 != hh1Var2) {
                                        while (!atomicReference.compareAndSet(obj4, hh1Var2)) {
                                            if (atomicReference.get() != obj4) {
                                                break;
                                            }
                                        }
                                        ((mp) obj4).h(a83.a);
                                        break;
                                    }
                                    while (!atomicReference.compareAndSet(obj4, hh1Var)) {
                                        if (atomicReference.get() != obj4) {
                                            break;
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                synchronized (this) {
                    i = this.l;
                    if (i == i3) {
                        this.l = i3 + 1;
                        return true;
                    }
                    o3VarArr = this.h;
                }
                o3VarArr2 = o3VarArr;
                i3 = i;
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.ak0
    public final Object m(Object obj, t00 t00Var) {
        g(obj);
        return a83.a;
    }
}
