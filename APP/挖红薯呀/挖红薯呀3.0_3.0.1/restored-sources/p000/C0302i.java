package p000;

import java.util.concurrent.CancellationException;

/* JADX INFO: renamed from: i */
/* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
/* JADX INFO: loaded from: classes.dex */
public final class C0302i extends m51 implements InterfaceC0904ww {

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ int f2381h;

    /* JADX INFO: renamed from: i */
    public int f2382i;

    /* JADX INFO: renamed from: j */
    public Object f2383j;

    /* JADX INFO: renamed from: k */
    public Object f2384k;

    /* JADX INFO: renamed from: l */
    public final /* synthetic */ Object f2385l;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0302i(Object obj, Object obj2, Object obj3, InterfaceC0322ik interfaceC0322ik, int i) {
        super(2, interfaceC0322ik);
        this.f2381h = i;
        this.f2383j = obj;
        this.f2384k = obj2;
        this.f2385l = obj3;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.AbstractC0955y9
    /* JADX INFO: renamed from: g */
    public final InterfaceC0322ik mo15g(Object obj, InterfaceC0322ik interfaceC0322ik) {
        int i = this.f2381h;
        Object obj2 = this.f2385l;
        switch (i) {
            case 0:
                return new C0302i((xg0) this.f2383j, (is0) this.f2384k, (InterfaceC0622po) obj2, interfaceC0322ik, 0);
            case 1:
                C0302i c0302i = new C0302i((b91) this.f2384k, (oh0) obj2, interfaceC0322ik, 1);
                c0302i.f2383j = obj;
                return c0302i;
            case 2:
                return new C0302i((C0277hb) this.f2383j, (qj0) this.f2384k, (C0458m3) obj2, interfaceC0322ik, 2);
            case 3:
                C0302i c0302i2 = new C0302i((InterfaceC0331iu) this.f2384k, (AbstractC0547od) obj2, interfaceC0322ik, 3);
                c0302i2.f2383j = obj;
                return c0302i2;
            case 4:
                C0302i c0302i3 = new C0302i((C0517nm) this.f2384k, (InterfaceC0904ww) obj2, interfaceC0322ik, 4);
                c0302i3.f2383j = obj;
                return c0302i3;
            case 5:
                return new C0302i((C0517nm) this.f2383j, (vh0) this.f2384k, (InterfaceC0904ww) obj2, interfaceC0322ik, 5);
            case 6:
                return new C0302i((xg0) this.f2383j, (f30) this.f2384k, (InterfaceC0622po) obj2, interfaceC0322ik, 6);
            case 7:
                return new C0302i((C0834vb) obj2, interfaceC0322ik);
            case 8:
                C0302i c0302i4 = new C0302i((nt0) this.f2384k, (C0715s6) obj2, interfaceC0322ik, 8);
                c0302i4.f2383j = obj;
                return c0302i4;
            case 9:
                C0302i c0302i5 = new C0302i((C0364jq) this.f2384k, (lz0) obj2, interfaceC0322ik, 9);
                c0302i5.f2383j = obj;
                return c0302i5;
            case 10:
                C0302i c0302i6 = new C0302i((lz0) this.f2384k, (InterfaceC0904ww) obj2, interfaceC0322ik, 10);
                c0302i6.f2383j = obj;
                return c0302i6;
            case 11:
                C0302i c0302i7 = new C0302i((InterfaceC0904ww) this.f2384k, (oh0) obj2, interfaceC0322ik, 11);
                c0302i7.f2383j = obj;
                return c0302i7;
            default:
                C0302i c0302i8 = new C0302i((c40) this.f2384k, (InterfaceC0904ww) obj2, interfaceC0322ik, 12);
                c0302i8.f2383j = obj;
                return c0302i8;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.InterfaceC0904ww
    public final Object invoke(Object obj, Object obj2) {
        int i = this.f2381h;
        na1 na1Var = na1.f4229a;
        switch (i) {
        }
        return ((C0302i) mo15g((InterfaceC0966yk) obj, (InterfaceC0322ik) obj2)).mo16m(na1Var);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:81:0x0177 */
    /* JADX DEBUG: Finally have unexpected throw blocks count: 2, expect 1 */
    /* JADX DEBUG: Multi-variable search result rejected for r5v12, resolved type: vb */
    /* JADX DEBUG: Multi-variable search result rejected for r5v13, resolved type: java.lang.Object */
    /* JADX DEBUG: Multi-variable search result rejected for r5v14, resolved type: vb */
    /* JADX DEBUG: Multi-variable search result rejected for r5v18, resolved type: vb */
    /* JADX DEBUG: Multi-variable search result rejected for r5v19, resolved type: vb */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0049, code lost:
    
        if (r15.invoke(r1, r14) == r0) goto L16;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:191:0x0388  */
    /* JADX WARN: Removed duplicated region for block: B:195:0x0394  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x0397  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x014f  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0159 A[Catch: all -> 0x012c, TryCatch #2 {all -> 0x012c, blocks: (B:60:0x0128, B:70:0x0151, B:72:0x0159, B:73:0x0166, B:80:0x0176, B:67:0x0143, B:82:0x0179, B:85:0x017f, B:86:0x0180, B:66:0x013d, B:74:0x0167, B:76:0x016d), top: B:226:0x011c, inners: #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0181  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:68:0x014d -> B:70:0x0151). Please report as a decompilation issue!!! */
    @Override // p000.AbstractC0955y9
    /* JADX INFO: renamed from: m */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object mo16m(Object obj) {
        Object objM4990t;
        C0834vb c0834vb;
        C0797ub c0797ub;
        boolean z;
        InterfaceC0966yk interfaceC0966yk;
        int i = 4;
        int i2 = 0;
        boolean z2 = false;
        boolean z3 = false;
        switch (this.f2381h) {
            case 0:
                EnumC1007zk enumC1007zk = EnumC1007zk.f7916d;
                int i3 = this.f2382i;
                if (i3 == 0) {
                    w60.m4891M(obj);
                    xg0 xg0Var = (xg0) this.f2383j;
                    is0 is0Var = (is0) this.f2384k;
                    this.f2382i = 1;
                    if (xg0Var.m5135b(is0Var, this) == enumC1007zk) {
                        return enumC1007zk;
                    }
                } else {
                    if (i3 != 1) {
                        C0921xc.m5134o("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    w60.m4891M(obj);
                }
                InterfaceC0622po interfaceC0622po = (InterfaceC0622po) this.f2385l;
                if (interfaceC0622po != null) {
                    interfaceC0622po.mo623a();
                }
                return na1.f4229a;
            case 1:
                b91 b91Var = (b91) this.f2384k;
                EnumC1007zk enumC1007zk2 = EnumC1007zk.f7916d;
                int i4 = this.f2382i;
                if (i4 == 0) {
                    w60.m4891M(obj);
                    ps0 ps0Var = (ps0) this.f2383j;
                    C0910x1 c0910x1 = new C0910x1(23, new a31(new C0310i7(0, b91Var), null));
                    C0345j7 c0345j7 = new C0345j7(ps0Var, b91Var, (oh0) this.f2385l, 0);
                    this.f2382i = 1;
                    if (c0910x1.mo609b(c0345j7, this) == enumC1007zk2) {
                        return enumC1007zk2;
                    }
                } else {
                    if (i4 != 1) {
                        C0921xc.m5134o("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    w60.m4891M(obj);
                }
                return na1.f4229a;
            case 2:
                na1 na1Var = na1.f4229a;
                C0277hb c0277hb = (C0277hb) this.f2383j;
                EnumC1007zk enumC1007zk3 = EnumC1007zk.f7916d;
                int i5 = this.f2382i;
                if (i5 == 0) {
                    w60.m4891M(obj);
                    C0095ck c0095ck = c0277hb.f2186r;
                    C0203fb c0203fb = new C0203fb(c0277hb, (qj0) this.f2384k, (C0458m3) this.f2385l);
                    this.f2382i = 1;
                    c0095ck.getClass();
                    st0 st0Var = (st0) c0203fb.invoke();
                    if (st0Var == null || C0095ck.m546x0(c0095ck, st0Var, 0L, 0L, 3)) {
                        objM4990t = na1Var;
                        if (objM4990t == enumC1007zk3) {
                            return enumC1007zk3;
                        }
                    } else {
                        C0884wc c0884wc = new C0884wc(1, rd0.m3497z(this));
                        c0884wc.m4992v();
                        C0965yj c0965yj = new C0965yj(c0203fb, c0884wc);
                        C0166eb c0166eb = c0095ck.f836w;
                        sh0 sh0Var = c0166eb.f1367a;
                        st0 st0Var2 = (st0) c0203fb.invoke();
                        if (st0Var2 == null) {
                            c0884wc.mo541i(na1Var);
                        } else {
                            c0884wc.m4994y(new C0073c(i, c0166eb, c0965yj));
                            z20 z20VarM4893O = w60.m4893O(0, sh0Var.f5770f);
                            int i6 = z20VarM4893O.f7248d;
                            int i7 = z20VarM4893O.f7249e;
                            if (i6 <= i7) {
                                while (true) {
                                    st0 st0Var3 = (st0) ((C0965yj) sh0Var.f5768d[i7]).f7650a.invoke();
                                    if (st0Var3 != null) {
                                        st0 st0VarM4103c = st0Var2.m4103c(st0Var3);
                                        if (st0VarM4103c.equals(st0Var2)) {
                                            sh0Var.m4071a(i7 + 1, c0965yj);
                                        } else if (!st0VarM4103c.equals(st0Var3)) {
                                            CancellationException cancellationException = new CancellationException("bringIntoView call interrupted by a newer, non-overlapping call");
                                            int i8 = sh0Var.f5770f - 1;
                                            if (i8 <= i7) {
                                                while (true) {
                                                    ((C0965yj) sh0Var.f5768d[i7]).f7651b.mo543k(cancellationException);
                                                    if (i8 != i7) {
                                                        i8++;
                                                    }
                                                }
                                            }
                                        }
                                    }
                                    if (i7 != i6) {
                                        i7--;
                                    }
                                }
                                sh0Var.m4071a(0, c0965yj);
                                if (!c0095ck.f839z) {
                                    c0095ck.m549y0(0L);
                                }
                            } else {
                                sh0Var.m4071a(0, c0965yj);
                                if (!c0095ck.f839z) {
                                }
                            }
                        }
                        objM4990t = c0884wc.m4990t();
                        if (objM4990t != enumC1007zk3) {
                        }
                        if (objM4990t == enumC1007zk3) {
                        }
                    }
                } else {
                    if (i5 != 1) {
                        C0921xc.m5134o("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    w60.m4891M(obj);
                }
                return na1Var;
            case 3:
                na1 na1Var2 = na1.f4229a;
                EnumC1007zk enumC1007zk4 = EnumC1007zk.f7916d;
                int i9 = this.f2382i;
                if (i9 == 0) {
                    w60.m4891M(obj);
                    InterfaceC0966yk interfaceC0966yk2 = (InterfaceC0966yk) this.f2383j;
                    InterfaceC0331iu interfaceC0331iu = (InterfaceC0331iu) this.f2384k;
                    AbstractC0547od abstractC0547od = (AbstractC0547od) this.f2385l;
                    InterfaceC0618pk interfaceC0618pk = abstractC0547od.f4517d;
                    int i10 = abstractC0547od.f4518e;
                    if (i10 == -3) {
                        i10 = -2;
                    }
                    EnumC0758tb enumC0758tb = abstractC0547od.f4519f;
                    EnumC0059bl enumC0059bl = EnumC0059bl.f540f;
                    InterfaceC0904ww c0508nd = new C0508nd(abstractC0547od, z2 ? 1 : 0, i2);
                    C0834vb c0834vbM2765e = o30.m2765e(i10, 4, enumC0758tb);
                    InterfaceC0618pk interfaceC0618pkM1540p = AbstractC0307i4.m1540p(interfaceC0966yk2.mo1328f(), interfaceC0618pk, true);
                    C0436lm c0436lm = AbstractC0326io.f2592a;
                    if (interfaceC0618pkM1540p != c0436lm && interfaceC0618pkM1540p.mo64l(C0496n2.f4163w) == null) {
                        interfaceC0618pkM1540p = interfaceC0618pkM1540p.mo63h(c0436lm);
                    }
                    qs0 qs0Var = new qs0(interfaceC0618pkM1540p, c0834vbM2765e);
                    qs0Var.m3990l0(enumC0059bl, qs0Var, c0508nd);
                    this.f2382i = 1;
                    Object objM4059x = s91.m4059x(interfaceC0331iu, qs0Var, true, this);
                    if (objM4059x != enumC1007zk4) {
                        objM4059x = na1Var2;
                    }
                    if (objM4059x == enumC1007zk4) {
                        return enumC1007zk4;
                    }
                } else {
                    if (i9 != 1) {
                        C0921xc.m5134o("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    w60.m4891M(obj);
                }
                return na1Var2;
            case 4:
                gp0 gp0Var = ((C0517nm) this.f2384k).f4294d;
                EnumC1007zk enumC1007zk5 = EnumC1007zk.f7916d;
                int i11 = this.f2382i;
                try {
                    if (i11 == 0) {
                        w60.m4891M(obj);
                        ny0 ny0Var = (ny0) this.f2383j;
                        gp0Var.setValue(Boolean.TRUE);
                        InterfaceC0904ww interfaceC0904ww = (InterfaceC0904ww) this.f2385l;
                        this.f2382i = 1;
                        if (interfaceC0904ww.invoke(ny0Var, this) == enumC1007zk5) {
                            return enumC1007zk5;
                        }
                    } else {
                        if (i11 != 1) {
                            C0921xc.m5134o("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        w60.m4891M(obj);
                    }
                    gp0Var.setValue(Boolean.FALSE);
                    return na1.f4229a;
                } catch (Throwable th) {
                    gp0Var.setValue(Boolean.FALSE);
                    throw th;
                }
            case 5:
                EnumC1007zk enumC1007zk6 = EnumC1007zk.f7916d;
                int i12 = this.f2382i;
                if (i12 == 0) {
                    w60.m4891M(obj);
                    C0517nm c0517nm = (C0517nm) this.f2383j;
                    ai0 ai0Var = c0517nm.f4293c;
                    C0479mm c0479mm = c0517nm.f4292b;
                    vh0 vh0Var = (vh0) this.f2384k;
                    C0302i c0302i = new C0302i(c0517nm, (InterfaceC0904ww) this.f2385l, z3 ? 1 : 0, i);
                    this.f2382i = 1;
                    ai0Var.getClass();
                    if (p30.m3013w(new zh0(vh0Var, ai0Var, c0302i, c0479mm, null), this) == enumC1007zk6) {
                        return enumC1007zk6;
                    }
                } else {
                    if (i12 != 1) {
                        C0921xc.m5134o("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    w60.m4891M(obj);
                }
                return na1.f4229a;
            case 6:
                EnumC1007zk enumC1007zk7 = EnumC1007zk.f7916d;
                int i13 = this.f2382i;
                if (i13 == 0) {
                    w60.m4891M(obj);
                    xg0 xg0Var2 = (xg0) this.f2383j;
                    f30 f30Var = (f30) this.f2384k;
                    this.f2382i = 1;
                    if (xg0Var2.m5135b(f30Var, this) == enumC1007zk7) {
                        return enumC1007zk7;
                    }
                } else {
                    if (i13 != 1) {
                        C0921xc.m5134o("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    w60.m4891M(obj);
                }
                InterfaceC0622po interfaceC0622po2 = (InterfaceC0622po) this.f2385l;
                if (interfaceC0622po2 != null) {
                    interfaceC0622po2.mo623a();
                }
                return na1.f4229a;
            case 7:
                EnumC1007zk enumC1007zk8 = EnumC1007zk.f7916d;
                int i14 = this.f2382i;
                try {
                    if (i14 == 0) {
                        w60.m4891M(obj);
                        c0834vb = (C0834vb) this.f2385l;
                        c0797ub = new C0797ub(c0834vb);
                        this.f2383j = c0834vb;
                        this.f2384k = c0797ub;
                        this.f2382i = 1;
                        obj = c0797ub.m4292b(this);
                        c0834vb = c0834vb;
                        if (obj == enumC1007zk8) {
                        }
                        if (((Boolean) obj).booleanValue()) {
                        }
                    } else {
                        if (i14 != 1) {
                            C0921xc.m5134o("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        c0797ub = (C0797ub) this.f2384k;
                        InterfaceC0470md interfaceC0470md = (InterfaceC0470md) this.f2383j;
                        w60.m4891M(obj);
                        c0834vb = interfaceC0470md;
                        if (((Boolean) obj).booleanValue()) {
                            AbstractC0705rx.f5567b.set(false);
                            synchronized (t21.f5893c) {
                                kh0 kh0Var = t21.f5900j.f4268h;
                                z = kh0Var != null && kh0Var.m1897h();
                            }
                            if (z) {
                                t21.m4163a();
                            }
                            this.f2383j = c0834vb;
                            this.f2384k = c0797ub;
                            this.f2382i = 1;
                            obj = c0797ub.m4292b(this);
                            c0834vb = c0834vb;
                            if (obj == enumC1007zk8) {
                                return enumC1007zk8;
                            }
                            if (((Boolean) obj).booleanValue()) {
                                c0834vb.mo2492a(null);
                                return na1.f4229a;
                            }
                        }
                    }
                } catch (Throwable th2) {
                    try {
                        throw th2;
                    } catch (Throwable th3) {
                        CancellationException cancellationException2 = th2 instanceof CancellationException ? th2 : null;
                        if (cancellationException2 == null) {
                            cancellationException2 = new CancellationException("Channel was consumed, consumer had failed");
                            cancellationException2.initCause(th2);
                        }
                        c0834vb.mo2492a(cancellationException2);
                        throw th3;
                    }
                }
                break;
            case 8:
                EnumC1007zk enumC1007zk9 = EnumC1007zk.f7916d;
                int i15 = this.f2382i;
                if (i15 != 0) {
                    if (i15 == 1) {
                        w60.m4891M(obj);
                        return na1.f4229a;
                    }
                    C0921xc.m5134o("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                w60.m4891M(obj);
                InterfaceC0966yk interfaceC0966yk3 = (InterfaceC0966yk) this.f2383j;
                nt0 nt0Var = (nt0) this.f2384k;
                C0715s6 c0715s6 = (C0715s6) this.f2385l;
                this.f2382i = 1;
                nt0Var.mo353a(interfaceC0966yk3, c0715s6, this);
                return enumC1007zk9;
            case 9:
                EnumC1007zk enumC1007zk10 = EnumC1007zk.f7916d;
                int i16 = this.f2382i;
                if (i16 == 0) {
                    w60.m4891M(obj);
                    jz0 jz0Var = (jz0) this.f2383j;
                    C0364jq c0364jq = (C0364jq) this.f2384k;
                    C0073c c0073c = new C0073c(19, jz0Var, (lz0) this.f2385l);
                    this.f2382i = 1;
                    if (c0364jq.invoke(c0073c, this) == enumC1007zk10) {
                        return enumC1007zk10;
                    }
                } else {
                    if (i16 != 1) {
                        C0921xc.m5134o("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    w60.m4891M(obj);
                }
                return na1.f4229a;
            case 10:
                EnumC1007zk enumC1007zk11 = EnumC1007zk.f7916d;
                int i17 = this.f2382i;
                if (i17 == 0) {
                    w60.m4891M(obj);
                    ny0 ny0Var2 = (ny0) this.f2383j;
                    lz0 lz0Var = (lz0) this.f2384k;
                    lz0Var.f3631k = ny0Var2;
                    InterfaceC0904ww interfaceC0904ww2 = (InterfaceC0904ww) this.f2385l;
                    jz0 jz0Var2 = lz0Var.f3632l;
                    this.f2382i = 1;
                    if (interfaceC0904ww2.invoke(jz0Var2, this) == enumC1007zk11) {
                        return enumC1007zk11;
                    }
                } else {
                    if (i17 != 1) {
                        C0921xc.m5134o("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    w60.m4891M(obj);
                }
                return na1.f4229a;
            case 11:
                EnumC1007zk enumC1007zk12 = EnumC1007zk.f7916d;
                int i18 = this.f2382i;
                if (i18 == 0) {
                    w60.m4891M(obj);
                    InterfaceC0966yk interfaceC0966yk4 = (InterfaceC0966yk) this.f2383j;
                    InterfaceC0904ww interfaceC0904ww3 = (InterfaceC0904ww) this.f2384k;
                    ps0 ps0Var2 = new ps0((oh0) this.f2385l, interfaceC0966yk4.mo1328f());
                    this.f2382i = 1;
                    if (interfaceC0904ww3.invoke(ps0Var2, this) == enumC1007zk12) {
                        return enumC1007zk12;
                    }
                } else {
                    if (i18 != 1) {
                        C0921xc.m5134o("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    w60.m4891M(obj);
                }
                return na1.f4229a;
            default:
                EnumC1007zk enumC1007zk13 = EnumC1007zk.f7916d;
                int i19 = this.f2382i;
                if (i19 == 0) {
                    w60.m4891M(obj);
                    interfaceC0966yk = (InterfaceC0966yk) this.f2383j;
                    c40 c40Var = (c40) this.f2384k;
                    this.f2383j = interfaceC0966yk;
                    this.f2382i = 1;
                    if (c40Var.mo483v(this) != enumC1007zk13) {
                    }
                    return enumC1007zk13;
                }
                if (i19 != 1) {
                    if (i19 == 2) {
                        w60.m4891M(obj);
                        return na1.f4229a;
                    }
                    C0921xc.m5134o("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                interfaceC0966yk = (InterfaceC0966yk) this.f2383j;
                w60.m4891M(obj);
                InterfaceC0904ww interfaceC0904ww4 = (InterfaceC0904ww) this.f2385l;
                this.f2383j = null;
                this.f2382i = 2;
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0302i(Object obj, Object obj2, InterfaceC0322ik interfaceC0322ik, int i) {
        super(2, interfaceC0322ik);
        this.f2381h = i;
        this.f2384k = obj;
        this.f2385l = obj2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0302i(C0834vb c0834vb, InterfaceC0322ik interfaceC0322ik) {
        super(2, interfaceC0322ik);
        this.f2381h = 7;
        this.f2385l = c0834vb;
    }
}
