package p000;

import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class ju2 extends AbstractC0484n3 implements zj0, hu2, vk1 {

    /* JADX INFO: renamed from: m */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f5227m = AtomicReferenceFieldUpdater.newUpdater(ju2.class, Object.class, "_state$volatile");
    private volatile /* synthetic */ Object _state$volatile;

    /* JADX INFO: renamed from: l */
    public int f5228l;

    public ju2(Object obj) {
        this._state$volatile = obj;
    }

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
    @Override // p000.zj0
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object mo1660a(ak0 ak0Var, t00 t00Var) {
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
            int i = iu2Var.f4795r;
            if ((i & Integer.MIN_VALUE) != 0) {
                iu2Var.f4795r = i - Integer.MIN_VALUE;
            } else {
                iu2Var = new iu2(this, t00Var);
            }
        }
        Object obj4 = iu2Var.f4793p;
        int i2 = iu2Var.f4795r;
        k20 k20Var = k20.f5323h;
        try {
            if (i2 == 0) {
                fg1.m1627T(obj4);
                ku2Var = (ku2) m3229b();
            } else if (i2 == 1) {
                ku2Var = iu2Var.f4789l;
                ak0Var = iu2Var.f4788k;
                fg1.m1627T(obj4);
            } else if (i2 == 2) {
                obj = iu2Var.f4792o;
                k21Var = iu2Var.f4790m;
                ku2Var = iu2Var.f4789l;
                ak0Var2 = iu2Var.f4788k;
                fg1.m1627T(obj4);
                AtomicReference atomicReference = ku2Var.f5820a;
                hh1 hh1Var = pp0.f8440i;
                andSet = atomicReference.getAndSet(hh1Var);
                andSet.getClass();
                if (andSet == pp0.f8441j) {
                }
                obj2 = f5227m.get(this);
                if (k21Var != null) {
                }
                if (obj != null) {
                }
                if (obj2 != up0.f11397e) {
                }
                iu2Var.f4788k = ak0Var2;
                iu2Var.f4789l = ku2Var;
                iu2Var.f4790m = k21Var;
                iu2Var.f4791n = null;
                iu2Var.f4792o = obj2;
                iu2Var.f4795r = 2;
                if (ak0Var2.mo181m(obj3, iu2Var) != k20Var) {
                }
            } else {
                if (i2 != 3) {
                    C0676s.m4653l("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                obj = iu2Var.f4791n;
                k21Var = iu2Var.f4790m;
                ku2Var = iu2Var.f4789l;
                ak0Var2 = iu2Var.f4788k;
                fg1.m1627T(obj4);
                obj2 = f5227m.get(this);
                if (k21Var != null && !k21Var.mo1703b()) {
                    throw k21Var.mo1706q();
                }
                if (obj != null || !obj.equals(obj2)) {
                    obj3 = obj2 != up0.f11397e ? null : obj2;
                    iu2Var.f4788k = ak0Var2;
                    iu2Var.f4789l = ku2Var;
                    iu2Var.f4790m = k21Var;
                    iu2Var.f4791n = null;
                    iu2Var.f4792o = obj2;
                    iu2Var.f4795r = 2;
                    if (ak0Var2.mo181m(obj3, iu2Var) != k20Var) {
                        return k20Var;
                    }
                    obj = obj2;
                }
                AtomicReference atomicReference2 = ku2Var.f5820a;
                hh1 hh1Var2 = pp0.f8440i;
                andSet = atomicReference2.getAndSet(hh1Var2);
                andSet.getClass();
                if (andSet == pp0.f8441j) {
                    iu2Var.f4788k = ak0Var2;
                    iu2Var.f4789l = ku2Var;
                    iu2Var.f4790m = k21Var;
                    iu2Var.f4791n = obj;
                    iu2Var.f4792o = null;
                    iu2Var.f4795r = 3;
                    a83 a83Var = a83.f116a;
                    C0469mp c0469mp = new C0469mp(1, gf1.m1908z(iu2Var));
                    c0469mp.m3151u();
                    AtomicReference atomicReference3 = ku2Var.f5820a;
                    while (true) {
                        if (atomicReference3.compareAndSet(hh1Var2, c0469mp)) {
                            break;
                        }
                        if (atomicReference3.get() != hh1Var2) {
                            c0469mp.mo2509h(a83Var);
                            break;
                        }
                    }
                    Object objM3150t = c0469mp.m3150t();
                    if (objM3150t == k20Var) {
                    }
                    if (objM3150t != k20Var) {
                    }
                    return k20Var;
                }
                obj2 = f5227m.get(this);
                if (k21Var != null) {
                    throw k21Var.mo1706q();
                }
                if (obj != null) {
                }
                if (obj2 != up0.f11397e) {
                }
                iu2Var.f4788k = ak0Var2;
                iu2Var.f4789l = ku2Var;
                iu2Var.f4790m = k21Var;
                iu2Var.f4791n = null;
                iu2Var.f4792o = obj2;
                iu2Var.f4795r = 2;
                if (ak0Var2.mo181m(obj3, iu2Var) != k20Var) {
                }
            }
            a20 a20Var = iu2Var.f11029i;
            a20Var.getClass();
            ak0Var2 = ak0Var;
            k21Var = (k21) a20Var.mo15o(C0700sn.f10207K);
            obj = null;
            obj2 = f5227m.get(this);
            if (k21Var != null) {
            }
            if (obj != null) {
            }
            if (obj2 != up0.f11397e) {
            }
            iu2Var.f4788k = ak0Var2;
            iu2Var.f4789l = ku2Var;
            iu2Var.f4790m = k21Var;
            iu2Var.f4791n = null;
            iu2Var.f4792o = obj2;
            iu2Var.f4795r = 2;
            if (ak0Var2.mo181m(obj3, iu2Var) != k20Var) {
            }
        } catch (Throwable th) {
            m3230e(ku2Var);
            throw th;
        }
    }

    @Override // p000.AbstractC0484n3
    /* JADX INFO: renamed from: c */
    public final AbstractC0527o3 mo2573c() {
        return new ku2();
    }

    @Override // p000.AbstractC0484n3
    /* JADX INFO: renamed from: d */
    public final AbstractC0527o3[] mo2574d() {
        return new ku2[2];
    }

    /* JADX INFO: renamed from: g */
    public final void m2575g(Object obj) {
        if (obj == null) {
            obj = up0.f11397e;
        }
        m2576h(null, obj);
    }

    @Override // p000.hu2
    public final Object getValue() {
        hh1 hh1Var = up0.f11397e;
        Object obj = f5227m.get(this);
        if (obj == hh1Var) {
            return null;
        }
        return obj;
    }

    /* JADX INFO: renamed from: h */
    public final boolean m2576h(Object obj, Object obj2) {
        int i;
        AbstractC0527o3[] abstractC0527o3Arr;
        hh1 hh1Var;
        synchronized (this) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f5227m;
            Object obj3 = atomicReferenceFieldUpdater.get(this);
            if (obj != null && !t11.m5086l(obj3, obj)) {
                return false;
            }
            if (t11.m5086l(obj3, obj2)) {
                return true;
            }
            atomicReferenceFieldUpdater.set(this, obj2);
            int i2 = this.f5228l;
            if ((i2 & 1) != 0) {
                this.f5228l = i2 + 2;
                return true;
            }
            int i3 = i2 + 1;
            this.f5228l = i3;
            AbstractC0527o3[] abstractC0527o3Arr2 = this.f6973h;
            while (true) {
                ku2[] ku2VarArr = (ku2[]) abstractC0527o3Arr2;
                if (ku2VarArr != null) {
                    for (ku2 ku2Var : ku2VarArr) {
                        if (ku2Var != null) {
                            AtomicReference atomicReference = ku2Var.f5820a;
                            while (true) {
                                Object obj4 = atomicReference.get();
                                if (obj4 != null && obj4 != (hh1Var = pp0.f8441j)) {
                                    hh1 hh1Var2 = pp0.f8440i;
                                    if (obj4 != hh1Var2) {
                                        while (!atomicReference.compareAndSet(obj4, hh1Var2)) {
                                            if (atomicReference.get() != obj4) {
                                                break;
                                            }
                                        }
                                        ((C0469mp) obj4).mo2509h(a83.f116a);
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
                    i = this.f5228l;
                    if (i == i3) {
                        this.f5228l = i3 + 1;
                        return true;
                    }
                    abstractC0527o3Arr = this.f6973h;
                }
                abstractC0527o3Arr2 = abstractC0527o3Arr;
                i3 = i;
            }
        }
    }

    @Override // p000.ak0
    /* JADX INFO: renamed from: m */
    public final Object mo181m(Object obj, t00 t00Var) {
        m2575g(obj);
        return a83.f116a;
    }
}
