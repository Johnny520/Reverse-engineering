package p000;

import java.util.concurrent.CancellationException;

/* JADX INFO: renamed from: jq */
/* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
/* JADX INFO: loaded from: classes.dex */
public final class C0364jq extends m51 implements InterfaceC0904ww {

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ int f2925h = 1;

    /* JADX INFO: renamed from: i */
    public zt0 f2926i;

    /* JADX INFO: renamed from: j */
    public zt0 f2927j;

    /* JADX INFO: renamed from: k */
    public int f2928k;

    /* JADX INFO: renamed from: l */
    public /* synthetic */ Object f2929l;

    /* JADX INFO: renamed from: m */
    public final /* synthetic */ dz0 f2930m;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0364jq(zt0 zt0Var, dz0 dz0Var, InterfaceC0322ik interfaceC0322ik) {
        super(2, interfaceC0322ik);
        this.f2927j = zt0Var;
        this.f2930m = dz0Var;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.AbstractC0955y9
    /* JADX INFO: renamed from: g */
    public final InterfaceC0322ik mo15g(Object obj, InterfaceC0322ik interfaceC0322ik) {
        int i = this.f2925h;
        dz0 dz0Var = this.f2930m;
        switch (i) {
            case 0:
                C0364jq c0364jq = new C0364jq(this.f2927j, dz0Var, interfaceC0322ik);
                c0364jq.f2929l = obj;
                return c0364jq;
            default:
                C0364jq c0364jq2 = new C0364jq(dz0Var, interfaceC0322ik);
                c0364jq2.f2929l = obj;
                return c0364jq2;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.InterfaceC0904ww
    public final Object invoke(Object obj, Object obj2) {
        int i = this.f2925h;
        na1 na1Var = na1.f4229a;
        switch (i) {
            case 0:
                return ((C0364jq) mo15g((InterfaceC0742sw) obj, (InterfaceC0322ik) obj2)).mo16m(na1Var);
            default:
                return ((C0364jq) mo15g((InterfaceC0966yk) obj, (InterfaceC0322ik) obj2)).mo16m(na1Var);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Can't wrap try/catch for region: R(8:35|36|(1:39)|(0)|15|90|42|(2:48|(2:50|(0)))(2:44|(1:46))) */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00d7, code lost:
    
        r0 = r7;
     */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00c7 A[Catch: CancellationException -> 0x00d7, TryCatch #2 {CancellationException -> 0x00d7, blocks: (B:42:0x00c1, B:44:0x00c7, B:48:0x00d9, B:50:0x00dd), top: B:90:0x00c1 }] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00d9 A[Catch: CancellationException -> 0x00d7, TryCatch #2 {CancellationException -> 0x00d7, blocks: (B:42:0x00c1, B:44:0x00c7, B:48:0x00d9, B:50:0x00dd), top: B:90:0x00c1 }] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0120  */
    /* JADX WARN: Removed duplicated region for block: B:98:? A[ADDED_TO_REGION, REMOVE, RETURN, SYNTHETIC] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:31:0x0089 -> B:20:0x005e). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:45:0x00d4 -> B:20:0x005e). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:49:0x00db -> B:20:0x005e). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:51:0x00e8 -> B:20:0x005e). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:54:0x00f6 -> B:12:0x002f). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:79:0x0142 -> B:80:0x0143). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:81:0x0146 -> B:82:0x0148). Please report as a decompilation issue!!! */
    @Override // p000.AbstractC0955y9
    /* JADX INFO: renamed from: m */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object mo16m(Object obj) throws Throwable {
        InterfaceC0742sw interfaceC0742sw;
        Object obj2;
        InterfaceC0966yk interfaceC0966yk;
        zt0 zt0Var;
        zt0 zt0Var2;
        zt0 zt0Var3;
        InterfaceC0966yk interfaceC0966yk2;
        InterfaceC0966yk interfaceC0966yk3;
        Object obj3;
        Object objM2095f;
        AbstractC0137dq abstractC0137dq;
        Object obj4;
        int i = this.f2925h;
        EnumC1007zk enumC1007zk = EnumC1007zk.f7916d;
        dz0 dz0Var = this.f2930m;
        na1 na1Var = na1.f4229a;
        InterfaceC0322ik interfaceC0322ik = null;
        switch (i) {
            case 0:
                zt0 zt0Var4 = this.f2927j;
                int i2 = this.f2928k;
                if (i2 != 0) {
                    if (i2 == 1) {
                        zt0 zt0Var5 = this.f2926i;
                        interfaceC0742sw = (InterfaceC0742sw) this.f2929l;
                        w60.m4891M(obj);
                        AbstractC0137dq abstractC0137dq2 = (AbstractC0137dq) obj;
                        zt0Var5.f7995d = abstractC0137dq2;
                        obj2 = zt0Var4.f7995d;
                        if (!(obj2 instanceof C0101cq) || (obj2 instanceof C1012zp)) {
                            break;
                        } else {
                            C0027aq c0027aq = obj2 instanceof C0027aq ? (C0027aq) obj2 : null;
                            if (c0027aq != null) {
                                interfaceC0742sw.invoke(c0027aq);
                            }
                            C0834vb c0834vb = dz0Var.f1242x;
                            if (c0834vb == null) {
                                zt0Var5 = zt0Var4;
                                abstractC0137dq2 = null;
                                zt0Var5.f7995d = abstractC0137dq2;
                                obj2 = zt0Var4.f7995d;
                                if (!(obj2 instanceof C0101cq)) {
                                }
                                break;
                            } else {
                                this.f2929l = interfaceC0742sw;
                                this.f2926i = zt0Var4;
                                this.f2928k = 1;
                                obj = C0834vb.m4440D(c0834vb, this);
                                if (obj != enumC1007zk) {
                                    zt0Var5 = zt0Var4;
                                    AbstractC0137dq abstractC0137dq22 = (AbstractC0137dq) obj;
                                    zt0Var5.f7995d = abstractC0137dq22;
                                    obj2 = zt0Var4.f7995d;
                                    if (!(obj2 instanceof C0101cq)) {
                                    }
                                    break;
                                }
                            }
                        }
                    } else {
                        C0921xc.m5134o("call to 'resume' before 'invoke' with coroutine");
                        break;
                    }
                } else {
                    w60.m4891M(obj);
                    interfaceC0742sw = (InterfaceC0742sw) this.f2929l;
                    obj2 = zt0Var4.f7995d;
                    if (!(obj2 instanceof C0101cq)) {
                    }
                    break;
                }
                break;
            default:
                switch (this.f2928k) {
                    case 0:
                        w60.m4891M(obj);
                        interfaceC0966yk = (InterfaceC0966yk) this.f2929l;
                        if (p30.m2975K(interfaceC0966yk)) {
                            zt0Var = new zt0();
                            C0834vb c0834vb2 = dz0Var.f1242x;
                            if (c0834vb2 != null) {
                                this.f2929l = interfaceC0966yk;
                                this.f2926i = zt0Var;
                                this.f2927j = zt0Var;
                                this.f2928k = 1;
                                obj = C0834vb.m4440D(c0834vb2, this);
                                if (obj != enumC1007zk) {
                                    zt0Var2 = zt0Var;
                                    abstractC0137dq = (AbstractC0137dq) obj;
                                    zt0Var.f7995d = abstractC0137dq;
                                    obj4 = zt0Var2.f7995d;
                                    if (obj4 instanceof C0064bq) {
                                        this.f2929l = interfaceC0966yk;
                                        this.f2926i = zt0Var2;
                                        this.f2927j = null;
                                        this.f2928k = 2;
                                        if (dz0.m742A0(dz0Var, (C0064bq) obj4, this) != enumC1007zk) {
                                            zt0Var3 = zt0Var2;
                                            interfaceC0966yk2 = interfaceC0966yk;
                                            C0364jq c0364jq = new C0364jq(zt0Var3, dz0Var, null);
                                            this.f2929l = interfaceC0966yk2;
                                            this.f2926i = zt0Var3;
                                            this.f2928k = 3;
                                            lz0 lz0Var = dz0Var.f1231Q;
                                            objM2095f = lz0Var.m2095f(vh0.f6719e, new C0302i(c0364jq, lz0Var, interfaceC0322ik, 9), this);
                                            if (objM2095f != enumC1007zk) {
                                                objM2095f = na1Var;
                                            }
                                            if (objM2095f == enumC1007zk) {
                                            }
                                            interfaceC0966yk = interfaceC0966yk2;
                                            obj3 = zt0Var3.f7995d;
                                            if (obj3 instanceof C0101cq) {
                                                this.f2929l = interfaceC0966yk;
                                                this.f2926i = null;
                                                this.f2928k = 4;
                                                if (dz0.m743B0(dz0Var, (C0101cq) obj3, this) == enumC1007zk) {
                                                }
                                                break;
                                            } else if (obj3 instanceof C1012zp) {
                                                this.f2929l = interfaceC0966yk;
                                                this.f2926i = null;
                                                this.f2928k = 5;
                                                if (dz0.m745z0(dz0Var, this) == enumC1007zk) {
                                                }
                                            }
                                        }
                                    }
                                    if (p30.m2975K(interfaceC0966yk)) {
                                        break;
                                    }
                                }
                            } else {
                                zt0Var2 = zt0Var;
                                abstractC0137dq = null;
                                zt0Var.f7995d = abstractC0137dq;
                                obj4 = zt0Var2.f7995d;
                                if (obj4 instanceof C0064bq) {
                                }
                                if (p30.m2975K(interfaceC0966yk)) {
                                }
                            }
                        }
                        break;
                    case 1:
                        zt0Var = this.f2927j;
                        zt0Var2 = this.f2926i;
                        interfaceC0966yk = (InterfaceC0966yk) this.f2929l;
                        w60.m4891M(obj);
                        abstractC0137dq = (AbstractC0137dq) obj;
                        zt0Var.f7995d = abstractC0137dq;
                        obj4 = zt0Var2.f7995d;
                        if (obj4 instanceof C0064bq) {
                        }
                        if (p30.m2975K(interfaceC0966yk)) {
                        }
                        break;
                    case 2:
                        zt0Var3 = this.f2926i;
                        interfaceC0966yk2 = (InterfaceC0966yk) this.f2929l;
                        w60.m4891M(obj);
                        C0364jq c0364jq2 = new C0364jq(zt0Var3, dz0Var, null);
                        this.f2929l = interfaceC0966yk2;
                        this.f2926i = zt0Var3;
                        this.f2928k = 3;
                        lz0 lz0Var2 = dz0Var.f1231Q;
                        objM2095f = lz0Var2.m2095f(vh0.f6719e, new C0302i(c0364jq2, lz0Var2, interfaceC0322ik, 9), this);
                        if (objM2095f != enumC1007zk) {
                        }
                        if (objM2095f == enumC1007zk) {
                        }
                        interfaceC0966yk = interfaceC0966yk2;
                        obj3 = zt0Var3.f7995d;
                        if (obj3 instanceof C0101cq) {
                        }
                        if (p30.m2975K(interfaceC0966yk)) {
                        }
                        break;
                    case 3:
                        zt0Var3 = this.f2926i;
                        interfaceC0966yk2 = (InterfaceC0966yk) this.f2929l;
                        try {
                            w60.m4891M(obj);
                        } catch (CancellationException unused) {
                            interfaceC0966yk3 = interfaceC0966yk2;
                            this.f2929l = interfaceC0966yk3;
                            this.f2926i = null;
                            this.f2928k = 6;
                            if (dz0.m745z0(dz0Var, this) == enumC1007zk) {
                            }
                            interfaceC0966yk = interfaceC0966yk3;
                            if (p30.m2975K(interfaceC0966yk)) {
                            }
                        }
                        interfaceC0966yk = interfaceC0966yk2;
                        obj3 = zt0Var3.f7995d;
                        if (obj3 instanceof C0101cq) {
                        }
                        if (p30.m2975K(interfaceC0966yk)) {
                        }
                        break;
                    case 4:
                        interfaceC0966yk3 = (InterfaceC0966yk) this.f2929l;
                        try {
                            w60.m4891M(obj);
                        } catch (CancellationException unused2) {
                            this.f2929l = interfaceC0966yk3;
                            this.f2926i = null;
                            this.f2928k = 6;
                            if (dz0.m745z0(dz0Var, this) == enumC1007zk) {
                                return enumC1007zk;
                            }
                        }
                        interfaceC0966yk = interfaceC0966yk3;
                        if (p30.m2975K(interfaceC0966yk)) {
                        }
                        break;
                    case 5:
                        interfaceC0966yk3 = (InterfaceC0966yk) this.f2929l;
                        w60.m4891M(obj);
                        interfaceC0966yk = interfaceC0966yk3;
                        if (p30.m2975K(interfaceC0966yk)) {
                        }
                        break;
                    case 6:
                        interfaceC0966yk3 = (InterfaceC0966yk) this.f2929l;
                        w60.m4891M(obj);
                        interfaceC0966yk = interfaceC0966yk3;
                        if (p30.m2975K(interfaceC0966yk)) {
                        }
                        break;
                    default:
                        C0921xc.m5134o("call to 'resume' before 'invoke' with coroutine");
                        break;
                }
                break;
        }
        return na1Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0364jq(dz0 dz0Var, InterfaceC0322ik interfaceC0322ik) {
        super(2, interfaceC0322ik);
        this.f2930m = dz0Var;
    }
}
