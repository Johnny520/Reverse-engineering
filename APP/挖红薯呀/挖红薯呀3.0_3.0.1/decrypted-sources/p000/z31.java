package p000;

import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
/* JADX INFO: loaded from: classes.dex */
public final class z31 extends AbstractC0451m0 implements InterfaceC0296hu, InterfaceC0334ix, x31, InterfaceC0331iu {

    /* JADX INFO: renamed from: i */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f7787i = AtomicReferenceFieldUpdater.newUpdater(z31.class, Object.class, "_state$volatile");

    /* JADX INFO: renamed from: j */
    public static final /* synthetic */ long f7788j = uw0.f6315a.objectFieldOffset(z31.class.getDeclaredField("_state$volatile"));
    private volatile /* synthetic */ Object _state$volatile;

    /* JADX INFO: renamed from: h */
    public int f7789h;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public z31(Object obj) {
        this._state$volatile = obj;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Duplicate block (B:62:0x00f3) to fix multi-entry loop: BACK_EDGE: B:62:0x00f3 -> B:31:0x0079 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:16:0x0038 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:66:0x0022 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:69:? */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:70:0x0079 */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0093, code lost:
    
        if (r13.equals(r15) == false) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x0079, code lost:
    
        if (r15 != r2) goto L31;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Path cross not found for [B:39:0x008f, B:41:0x0095], limit reached: 70 */
    /* JADX WARN: Path cross not found for [B:41:0x0095, B:39:0x008f], limit reached: 70 */
    /* JADX WARN: Path cross not found for [B:41:0x0095, B:49:0x00b0], limit reached: 70 */
    /* JADX WARN: Path cross not found for [B:61:0x00f2, B:62:0x00f3], limit reached: 70 */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0081 A[Catch: all -> 0x0038, TryCatch #0 {all -> 0x0038, blocks: (B:14:0x0034, B:31:0x0079, B:33:0x0081, B:36:0x0088, B:37:0x008c, B:39:0x008f, B:49:0x00b0, B:52:0x00c0, B:53:0x00dc, B:59:0x00ec, B:56:0x00e3, B:58:0x00e9, B:41:0x0095, B:45:0x009c, B:21:0x004b), top: B:66:0x0022 }] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x008f A[Catch: all -> 0x0038, TryCatch #0 {all -> 0x0038, blocks: (B:14:0x0034, B:31:0x0079, B:33:0x0081, B:36:0x0088, B:37:0x008c, B:39:0x008f, B:49:0x00b0, B:52:0x00c0, B:53:0x00dc, B:59:0x00ec, B:56:0x00e3, B:58:0x00e9, B:41:0x0095, B:45:0x009c, B:21:0x004b), top: B:66:0x0022 }] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00c0 A[Catch: all -> 0x0038, TryCatch #0 {all -> 0x0038, blocks: (B:14:0x0034, B:31:0x0079, B:33:0x0081, B:36:0x0088, B:37:0x008c, B:39:0x008f, B:49:0x00b0, B:52:0x00c0, B:53:0x00dc, B:59:0x00ec, B:56:0x00e3, B:58:0x00e9, B:41:0x0095, B:45:0x009c, B:21:0x004b), top: B:66:0x0022 }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r1v0, types: [int] */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v10, types: [a41] */
    /* JADX WARN: Type inference failed for: r1v13 */
    /* JADX WARN: Type inference failed for: r1v14 */
    /* JADX WARN: Type inference failed for: r1v15 */
    /* JADX WARN: Type inference failed for: r1v16 */
    /* JADX WARN: Type inference failed for: r1v2, types: [n0] */
    /* JADX WARN: Type inference failed for: r1v3 */
    /* JADX WARN: Type inference failed for: r1v4 */
    /* JADX WARN: Type inference failed for: r1v5 */
    /* JADX WARN: Type inference failed for: r1v6, types: [a41] */
    /* JADX WARN: Type inference failed for: r1v7, types: [a41] */
    /* JADX WARN: Type inference failed for: r1v8, types: [a41] */
    /* JADX WARN: Type inference failed for: r8v1, types: [m0] */
    /* JADX WARN: Type inference failed for: r8v10 */
    /* JADX WARN: Type inference failed for: r8v2 */
    /* JADX WARN: Type inference failed for: r8v3 */
    /* JADX WARN: Type inference failed for: r8v4, types: [z31] */
    /* JADX WARN: Type inference failed for: r8v5, types: [java.lang.Object, z31] */
    /* JADX WARN: Type inference failed for: r8v7, types: [z31] */
    /* JADX WARN: Type inference failed for: r8v8 */
    /* JADX WARN: Type inference failed for: r8v9 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:51:0x00bf -> B:31:0x0079). Please report as a decompilation issue!!! */
    @Override // p000.InterfaceC0296hu
    /* JADX INFO: renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object mo609b(InterfaceC0331iu interfaceC0331iu, InterfaceC0322ik interfaceC0322ik) throws Throwable {
        y31 y31Var;
        ?? r8;
        InterfaceC0331iu interfaceC0331iu2;
        c40 c40Var;
        Object obj;
        Object andSet;
        Object obj2;
        if (interfaceC0322ik instanceof y31) {
            y31Var = (y31) interfaceC0322ik;
            int i = y31Var.f7518n;
            if ((i & Integer.MIN_VALUE) != 0) {
                y31Var.f7518n = i - Integer.MIN_VALUE;
            } else {
                y31Var = new y31(this, interfaceC0322ik);
            }
        }
        Object obj3 = y31Var.f7516l;
        ?? r1 = y31Var.f7518n;
        EnumC1007zk enumC1007zk = EnumC1007zk.f7916d;
        try {
            if (r1 == 0) {
                w60.m4891M(obj3);
                r1 = (a41) m2099a();
            } else if (r1 == 1) {
                r1 = y31Var.f7513i;
                interfaceC0331iu = y31Var.f7512h;
                this = y31Var.f7511g;
                try {
                    w60.m4891M(obj3);
                    r1 = r1;
                } catch (Throwable th) {
                    r8 = this;
                    th = th;
                    r8.m2100g(r1);
                    throw th;
                }
            } else if (r1 == 2) {
                obj = y31Var.f7515k;
                c40Var = y31Var.f7514j;
                a41 a41Var = y31Var.f7513i;
                interfaceC0331iu2 = y31Var.f7512h;
                z31 z31Var = y31Var.f7511g;
                w60.m4891M(obj3);
                r1 = a41Var;
                r8 = z31Var;
                AtomicReference atomicReference = r1.f55a;
                C1014zr c1014zr = pf1.f4844j;
                andSet = atomicReference.getAndSet(c1014zr);
                andSet.getClass();
                if (andSet == pf1.f4845k) {
                }
                Object obj4 = f7787i.get(r8);
                if (c40Var != null) {
                }
                if (obj != null) {
                }
                if (obj4 != o30.f4442l) {
                }
                y31Var.f7511g = r8;
                y31Var.f7512h = interfaceC0331iu2;
                y31Var.f7513i = r1;
                y31Var.f7514j = c40Var;
                y31Var.f7515k = obj4;
                y31Var.f7518n = 2;
                if (interfaceC0331iu2.mo827f(obj2, y31Var) != enumC1007zk) {
                }
            } else {
                if (r1 != 3) {
                    C0921xc.m5134o("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                obj = y31Var.f7515k;
                c40Var = y31Var.f7514j;
                r1 = y31Var.f7513i;
                interfaceC0331iu2 = y31Var.f7512h;
                r8 = y31Var.f7511g;
                w60.m4891M(obj3);
                Object obj42 = f7787i.get(r8);
                if (c40Var != null && !c40Var.mo479b()) {
                    throw c40Var.mo481o();
                }
                if (obj != null) {
                    r1 = r1;
                    r8 = r8;
                }
                obj2 = obj42 != o30.f4442l ? null : obj42;
                y31Var.f7511g = r8;
                y31Var.f7512h = interfaceC0331iu2;
                y31Var.f7513i = r1;
                y31Var.f7514j = c40Var;
                y31Var.f7515k = obj42;
                y31Var.f7518n = 2;
                if (interfaceC0331iu2.mo827f(obj2, y31Var) != enumC1007zk) {
                    return enumC1007zk;
                }
                obj = obj42;
                r1 = r1;
                r8 = r8;
                AtomicReference atomicReference2 = r1.f55a;
                C1014zr c1014zr2 = pf1.f4844j;
                andSet = atomicReference2.getAndSet(c1014zr2);
                andSet.getClass();
                if (andSet == pf1.f4845k) {
                    y31Var.f7511g = r8;
                    y31Var.f7512h = interfaceC0331iu2;
                    y31Var.f7513i = r1;
                    y31Var.f7514j = c40Var;
                    y31Var.f7515k = obj;
                    y31Var.f7518n = 3;
                    na1 na1Var = na1.f4229a;
                    C0884wc c0884wc = new C0884wc(1, rd0.m3497z(y31Var));
                    c0884wc.m4992v();
                    AtomicReference atomicReference3 = r1.f55a;
                    while (true) {
                        if (atomicReference3.compareAndSet(c1014zr2, c0884wc)) {
                            break;
                        }
                        if (atomicReference3.get() != c1014zr2) {
                            c0884wc.mo541i(na1Var);
                            break;
                        }
                    }
                    Object objM4990t = c0884wc.m4990t();
                    if (objM4990t == enumC1007zk) {
                    }
                    if (objM4990t != enumC1007zk) {
                    }
                    return enumC1007zk;
                }
                Object obj422 = f7787i.get(r8);
                if (c40Var != null) {
                    throw c40Var.mo481o();
                }
                if (obj != null) {
                }
                if (obj422 != o30.f4442l) {
                }
                y31Var.f7511g = r8;
                y31Var.f7512h = interfaceC0331iu2;
                y31Var.f7513i = r1;
                y31Var.f7514j = c40Var;
                y31Var.f7515k = obj422;
                y31Var.f7518n = 2;
                if (interfaceC0331iu2.mo827f(obj2, y31Var) != enumC1007zk) {
                }
            }
            r8 = this;
            interfaceC0331iu2 = interfaceC0331iu;
            c40Var = (c40) y31Var.mo540e().mo64l(C0496n2.f4129I);
            obj = null;
            Object obj4222 = f7787i.get(r8);
            if (c40Var != null) {
            }
            if (obj != null) {
            }
            if (obj4222 != o30.f4442l) {
            }
            y31Var.f7511g = r8;
            y31Var.f7512h = interfaceC0331iu2;
            y31Var.f7513i = r1;
            y31Var.f7514j = c40Var;
            y31Var.f7515k = obj4222;
            y31Var.f7518n = 2;
            if (interfaceC0331iu2.mo827f(obj2, y31Var) != enumC1007zk) {
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.InterfaceC0334ix
    /* JADX INFO: renamed from: c */
    public final InterfaceC0296hu mo981c(InterfaceC0618pk interfaceC0618pk, int i, EnumC0758tb enumC0758tb) {
        return ((((i < 0 || i >= 2) && i != -2) || enumC0758tb != EnumC0758tb.f5969e) && !((i == 0 || i == -3) && enumC0758tb == EnumC0758tb.f5968d)) ? new C0611pd(this, interfaceC0618pk, i, enumC0758tb) : this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.AbstractC0451m0
    /* JADX INFO: renamed from: d */
    public final AbstractC0494n0 mo982d() {
        return new a41();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.AbstractC0451m0
    /* JADX INFO: renamed from: e */
    public final AbstractC0494n0[] mo983e() {
        return new a41[2];
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.InterfaceC0331iu
    /* JADX INFO: renamed from: f */
    public final Object mo827f(Object obj, InterfaceC0322ik interfaceC0322ik) {
        m5412i(obj);
        return na1.f4229a;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.x31
    public final Object getValue() {
        C1014zr c1014zr = o30.f4442l;
        f7787i.getClass();
        Object objectVolatile = uw0.f6315a.getObjectVolatile(this, f7788j);
        if (objectVolatile == c1014zr) {
            return null;
        }
        return objectVolatile;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: i */
    public final void m5412i(Object obj) {
        if (obj == null) {
            obj = o30.f4442l;
        }
        m5413j(null, obj);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: j */
    public final boolean m5413j(Object obj, Object obj2) {
        int i;
        AbstractC0494n0[] abstractC0494n0Arr;
        C1014zr c1014zr;
        synchronized (this) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f7787i;
            Object obj3 = atomicReferenceFieldUpdater.get(this);
            if (obj != null && !p30.m3002l(obj3, obj)) {
                return false;
            }
            if (p30.m3002l(obj3, obj2)) {
                return true;
            }
            atomicReferenceFieldUpdater.set(this, obj2);
            int i2 = this.f7789h;
            if ((i2 & 1) != 0) {
                this.f7789h = i2 + 2;
                return true;
            }
            int i3 = i2 + 1;
            this.f7789h = i3;
            AbstractC0494n0[] abstractC0494n0Arr2 = this.f3636d;
            while (true) {
                a41[] a41VarArr = (a41[]) abstractC0494n0Arr2;
                if (a41VarArr != null) {
                    for (a41 a41Var : a41VarArr) {
                        if (a41Var != null) {
                            AtomicReference atomicReference = a41Var.f55a;
                            while (true) {
                                Object obj4 = atomicReference.get();
                                if (obj4 != null && obj4 != (c1014zr = pf1.f4845k)) {
                                    C1014zr c1014zr2 = pf1.f4844j;
                                    if (obj4 != c1014zr2) {
                                        while (!atomicReference.compareAndSet(obj4, c1014zr2)) {
                                            if (atomicReference.get() != obj4) {
                                                break;
                                            }
                                        }
                                        ((C0884wc) obj4).mo541i(na1.f4229a);
                                        break;
                                    }
                                    while (!atomicReference.compareAndSet(obj4, c1014zr)) {
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
                    i = this.f7789h;
                    if (i == i3) {
                        this.f7789h = i3 + 1;
                        return true;
                    }
                    abstractC0494n0Arr = this.f3636d;
                }
                abstractC0494n0Arr2 = abstractC0494n0Arr;
                i3 = i;
            }
        }
    }
}
