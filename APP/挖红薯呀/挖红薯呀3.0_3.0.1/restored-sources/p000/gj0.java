package p000;

/* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
/* JADX INFO: loaded from: classes.dex */
public final class gj0 extends oe0 implements h91, aj0 {

    /* JADX INFO: renamed from: r */
    public aj0 f2001r;

    /* JADX INFO: renamed from: s */
    public C0948y2 f2002s;

    /* JADX INFO: renamed from: t */
    public gj0 f2003t;

    /* JADX INFO: renamed from: u */
    public final String f2004u;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public gj0(aj0 aj0Var, C0948y2 c0948y2) {
        this.f2001r = aj0Var;
        this.f2002s = c0948y2 == null ? new C0948y2() : c0948y2;
        this.f2004u = "androidx.compose.ui.input.nestedscroll.NestedScrollNode";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:38:0x0082 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:72:0x0091 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:74:0x003a */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:76:0x003a */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:79:0x008b */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [gj0] */
    /* JADX WARN: Type inference failed for: r3v10, types: [oe0] */
    /* JADX WARN: Type inference failed for: r3v11, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v12 */
    /* JADX WARN: Type inference failed for: r3v13 */
    /* JADX WARN: Type inference failed for: r3v14 */
    /* JADX WARN: Type inference failed for: r3v15 */
    /* JADX WARN: Type inference failed for: r3v16 */
    /* JADX WARN: Type inference failed for: r3v17 */
    /* JADX WARN: Type inference failed for: r3v6 */
    /* JADX WARN: Type inference failed for: r3v7, types: [oe0] */
    /* JADX WARN: Type inference failed for: r3v9 */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v3, types: [sh0] */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r5v6, types: [sh0] */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* JADX WARN: Type inference failed for: r5v9 */
    /* JADX WARN: Type inference failed for: r8v7 */
    @Override // p000.aj0
    /* JADX INFO: renamed from: A */
    public final long mo176A(int i, long j, long j2) {
        mj0 mj0Var;
        long jMo176A = this.f2001r.mo176A(i, j, j2);
        boolean z = this.f4542q;
        h91 h91Var = null;
        if (z && z) {
            if (!this.f4529d.f4542q) {
                w10.m4824b("visitAncestors called on an unattached node");
            }
            oe0 oe0Var = this.f4529d.f4533h;
            b60 b60VarM3039Q = pf1.m3039Q(this);
            loop0: while (true) {
                if (b60VarM3039Q == null) {
                    break;
                }
                if ((b60VarM3039Q.f395I.f3998f.f4532g & 262144) != 0) {
                    while (oe0Var != null) {
                        if ((oe0Var.f4531f & 262144) != 0) {
                            ?? M3050f = oe0Var;
                            ?? sh0Var = 0;
                            while (M3050f != 0) {
                                if (M3050f instanceof h91) {
                                    h91 h91Var2 = (h91) M3050f;
                                    if (p30.m3002l(mo1247k(), h91Var2.mo1247k()) && gj0.class == h91Var2.getClass()) {
                                        h91Var = h91Var2;
                                        break loop0;
                                    }
                                } else if ((M3050f.f4531f & 262144) != 0 && (M3050f instanceof AbstractC0731sm)) {
                                    oe0 oe0Var2 = ((AbstractC0731sm) M3050f).f5782s;
                                    int i2 = 0;
                                    M3050f = M3050f;
                                    sh0Var = sh0Var;
                                    while (oe0Var2 != null) {
                                        if ((oe0Var2.f4531f & 262144) != 0) {
                                            i2++;
                                            sh0Var = sh0Var;
                                            if (i2 == 1) {
                                                M3050f = oe0Var2;
                                            } else {
                                                if (sh0Var == 0) {
                                                    sh0Var = new sh0(new oe0[16]);
                                                }
                                                if (M3050f != 0) {
                                                    sh0Var.m4072b(M3050f);
                                                    M3050f = 0;
                                                }
                                                sh0Var.m4072b(oe0Var2);
                                            }
                                        }
                                        oe0Var2 = oe0Var2.f4534i;
                                        M3050f = M3050f;
                                        sh0Var = sh0Var;
                                    }
                                    if (i2 == 1) {
                                    }
                                }
                                M3050f = pf1.m3050f(sh0Var);
                            }
                        }
                        oe0Var = oe0Var.f4533h;
                    }
                }
                b60VarM3039Q = b60VarM3039Q.m315v();
                oe0Var = (b60VarM3039Q == null || (mj0Var = b60VarM3039Q.f395I) == null) ? null : mj0Var.f3997e;
            }
            h91Var = (gj0) h91Var;
        }
        ?? r0 = h91Var;
        return ok0.m2934e(jMo176A, r0 != 0 ? r0.mo176A(i, ok0.m2934e(j, jMo176A), ok0.m2933d(j2, jMo176A)) : 0L);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:51:0x00b6 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:90:0x00c5 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:93:0x006f */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:95:0x006f */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:98:0x00bf */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x00ea, code lost:
    
        if (r15 == r5) goto L74;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r6v10, types: [oe0] */
    /* JADX WARN: Type inference failed for: r6v11, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v12 */
    /* JADX WARN: Type inference failed for: r6v13 */
    /* JADX WARN: Type inference failed for: r6v14 */
    /* JADX WARN: Type inference failed for: r6v15 */
    /* JADX WARN: Type inference failed for: r6v16 */
    /* JADX WARN: Type inference failed for: r6v17 */
    /* JADX WARN: Type inference failed for: r6v6 */
    /* JADX WARN: Type inference failed for: r6v7, types: [oe0] */
    /* JADX WARN: Type inference failed for: r6v9 */
    /* JADX WARN: Type inference failed for: r8v0 */
    /* JADX WARN: Type inference failed for: r8v1 */
    /* JADX WARN: Type inference failed for: r8v10 */
    /* JADX WARN: Type inference failed for: r8v11 */
    /* JADX WARN: Type inference failed for: r8v2 */
    /* JADX WARN: Type inference failed for: r8v3, types: [sh0] */
    /* JADX WARN: Type inference failed for: r8v4 */
    /* JADX WARN: Type inference failed for: r8v5 */
    /* JADX WARN: Type inference failed for: r8v6, types: [sh0] */
    /* JADX WARN: Type inference failed for: r8v8 */
    /* JADX WARN: Type inference failed for: r8v9 */
    /* JADX WARN: Type inference failed for: r9v7 */
    @Override // p000.aj0
    /* JADX INFO: renamed from: O */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object mo177O(long j, InterfaceC0322ik interfaceC0322ik) {
        fj0 fj0Var;
        long j2;
        mj0 mj0Var;
        long j3;
        if (interfaceC0322ik instanceof fj0) {
            fj0Var = (fj0) interfaceC0322ik;
            int i = fj0Var.f1744j;
            if ((i & Integer.MIN_VALUE) != 0) {
                fj0Var.f1744j = i - Integer.MIN_VALUE;
            } else {
                fj0Var = new fj0(this, (AbstractC0358jk) interfaceC0322ik);
            }
        }
        Object objMo177O = fj0Var.f1742h;
        int i2 = fj0Var.f1744j;
        gj0 gj0Var = null;
        h91 h91Var = null;
        gj0Var = null;
        EnumC1007zk enumC1007zk = EnumC1007zk.f7916d;
        if (i2 == 0) {
            w60.m4891M(objMo177O);
            boolean z = this.f4542q;
            if (z && z) {
                if (!this.f4529d.f4542q) {
                    w10.m4824b("visitAncestors called on an unattached node");
                }
                oe0 oe0Var = this.f4529d.f4533h;
                b60 b60VarM3039Q = pf1.m3039Q(this);
                loop0: while (true) {
                    if (b60VarM3039Q == null) {
                        break;
                    }
                    if ((b60VarM3039Q.f395I.f3998f.f4532g & 262144) != 0) {
                        while (oe0Var != null) {
                            if ((oe0Var.f4531f & 262144) != 0) {
                                ?? M3050f = oe0Var;
                                ?? sh0Var = 0;
                                while (M3050f != 0) {
                                    if (M3050f instanceof h91) {
                                        h91 h91Var2 = (h91) M3050f;
                                        if (p30.m3002l(mo1247k(), h91Var2.mo1247k()) && gj0.class == h91Var2.getClass()) {
                                            h91Var = h91Var2;
                                            break loop0;
                                        }
                                    } else if ((M3050f.f4531f & 262144) != 0 && (M3050f instanceof AbstractC0731sm)) {
                                        oe0 oe0Var2 = ((AbstractC0731sm) M3050f).f5782s;
                                        int i3 = 0;
                                        M3050f = M3050f;
                                        sh0Var = sh0Var;
                                        while (oe0Var2 != null) {
                                            if ((oe0Var2.f4531f & 262144) != 0) {
                                                i3++;
                                                sh0Var = sh0Var;
                                                if (i3 == 1) {
                                                    M3050f = oe0Var2;
                                                } else {
                                                    if (sh0Var == 0) {
                                                        sh0Var = new sh0(new oe0[16]);
                                                    }
                                                    if (M3050f != 0) {
                                                        sh0Var.m4072b(M3050f);
                                                        M3050f = 0;
                                                    }
                                                    sh0Var.m4072b(oe0Var2);
                                                }
                                            }
                                            oe0Var2 = oe0Var2.f4534i;
                                            M3050f = M3050f;
                                            sh0Var = sh0Var;
                                        }
                                        if (i3 == 1) {
                                        }
                                    }
                                    M3050f = pf1.m3050f(sh0Var);
                                }
                            }
                            oe0Var = oe0Var.f4533h;
                        }
                    }
                    b60VarM3039Q = b60VarM3039Q.m315v();
                    oe0Var = (b60VarM3039Q == null || (mj0Var = b60VarM3039Q.f395I) == null) ? null : mj0Var.f3997e;
                }
                gj0Var = (gj0) h91Var;
            }
            if (gj0Var == null) {
                j2 = 0;
                aj0 aj0Var = this.f2001r;
                long jM3438d = rb1.m3438d(j, j2);
                fj0Var.f1741g = j2;
                fj0Var.f1744j = 2;
                objMo177O = aj0Var.mo177O(jM3438d, fj0Var);
                if (objMo177O != enumC1007zk) {
                    j3 = j2;
                    return new rb1(rb1.m3439e(j3, ((rb1) objMo177O).f5348a));
                }
                return enumC1007zk;
            }
            fj0Var.f1741g = j;
            fj0Var.f1744j = 1;
            objMo177O = gj0Var.mo177O(j, fj0Var);
        } else {
            if (i2 != 1) {
                if (i2 != 2) {
                    C0921xc.m5134o("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                j3 = fj0Var.f1741g;
                w60.m4891M(objMo177O);
                return new rb1(rb1.m3439e(j3, ((rb1) objMo177O).f5348a));
            }
            j = fj0Var.f1741g;
            w60.m4891M(objMo177O);
        }
        j2 = ((rb1) objMo177O).f5348a;
        aj0 aj0Var2 = this.f2001r;
        long jM3438d2 = rb1.m3438d(j, j2);
        fj0Var.f1741g = j2;
        fj0Var.f1744j = 2;
        objMo177O = aj0Var2.mo177O(jM3438d2, fj0Var);
        if (objMo177O != enumC1007zk) {
        }
        return enumC1007zk;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:59:0x00e8 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:95:0x00fb */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:99:0x00f3 */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0018  */
    /* JADX WARN: Type inference failed for: r10v6 */
    /* JADX WARN: Type inference failed for: r10v7, types: [sh0] */
    /* JADX WARN: Type inference failed for: r10v9 */
    /* JADX WARN: Type inference failed for: r14v10 */
    /* JADX WARN: Type inference failed for: r14v11 */
    /* JADX WARN: Type inference failed for: r14v12 */
    /* JADX WARN: Type inference failed for: r14v13 */
    /* JADX WARN: Type inference failed for: r14v14, types: [oe0] */
    /* JADX WARN: Type inference failed for: r14v16 */
    /* JADX WARN: Type inference failed for: r14v17 */
    /* JADX WARN: Type inference failed for: r14v18 */
    /* JADX WARN: Type inference failed for: r14v6 */
    /* JADX WARN: Type inference failed for: r14v7, types: [oe0] */
    /* JADX WARN: Type inference failed for: r14v8, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r14v9 */
    /* JADX WARN: Type inference failed for: r16v0 */
    /* JADX WARN: Type inference failed for: r16v1 */
    /* JADX WARN: Type inference failed for: r16v10 */
    /* JADX WARN: Type inference failed for: r16v11 */
    /* JADX WARN: Type inference failed for: r16v2 */
    /* JADX WARN: Type inference failed for: r16v3 */
    /* JADX WARN: Type inference failed for: r16v4 */
    /* JADX WARN: Type inference failed for: r16v5 */
    /* JADX WARN: Type inference failed for: r16v6, types: [sh0] */
    /* JADX WARN: Type inference failed for: r16v7 */
    /* JADX WARN: Type inference failed for: r16v8 */
    /* JADX WARN: Type inference failed for: r16v9 */
    /* JADX WARN: Type inference failed for: r9v17 */
    @Override // p000.aj0
    /* JADX INFO: renamed from: R */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object mo178R(long j, long j2, InterfaceC0322ik interfaceC0322ik) {
        ej0 ej0Var;
        long j3;
        long j4;
        long j5;
        gj0 gj0Var;
        long j6;
        long j7;
        h91 h91Var;
        mj0 mj0Var;
        int i;
        ?? r16;
        ?? M3050f;
        int i2;
        if (interfaceC0322ik instanceof ej0) {
            ej0Var = (ej0) interfaceC0322ik;
            int i3 = ej0Var.f1476k;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                ej0Var.f1476k = i3 - Integer.MIN_VALUE;
            } else {
                ej0Var = new ej0(this, (AbstractC0358jk) interfaceC0322ik);
            }
        }
        ej0 ej0Var2 = ej0Var;
        Object objMo178R = ej0Var2.f1474i;
        int i4 = ej0Var2.f1476k;
        Object obj = null;
        int i5 = 1;
        EnumC1007zk enumC1007zk = EnumC1007zk.f7916d;
        if (i4 == 0) {
            w60.m4891M(objMo178R);
            aj0 aj0Var = this.f2001r;
            ej0Var2.f1472g = j;
            ej0Var2.f1473h = j2;
            ej0Var2.f1476k = 1;
            objMo178R = aj0Var.mo178R(j, j2, ej0Var2);
            if (objMo178R != enumC1007zk) {
                j3 = j;
                j4 = j2;
            }
            return enumC1007zk;
        }
        if (i4 != 1) {
            if (i4 != 2) {
                C0921xc.m5134o("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            j7 = ej0Var2.f1472g;
            w60.m4891M(objMo178R);
            j6 = ((rb1) objMo178R).f5348a;
            j5 = j7;
            return new rb1(rb1.m3439e(j5, j6));
        }
        j4 = ej0Var2.f1473h;
        j3 = ej0Var2.f1472g;
        w60.m4891M(objMo178R);
        j5 = ((rb1) objMo178R).f5348a;
        boolean z = this.f4542q;
        if (!z) {
            gj0Var = this.f2003t;
        } else if (z && z) {
            if (!this.f4529d.f4542q) {
                w10.m4824b("visitAncestors called on an unattached node");
            }
            oe0 oe0Var = this.f4529d.f4533h;
            b60 b60VarM3039Q = pf1.m3039Q(this);
            loop0: while (true) {
                if (b60VarM3039Q == null) {
                    h91Var = null;
                    break;
                }
                int i6 = 262144;
                if ((b60VarM3039Q.f395I.f3998f.f4532g & 262144) != 0) {
                    while (oe0Var != null) {
                        if ((oe0Var.f4531f & i6) != 0) {
                            ?? r14 = oe0Var;
                            ?? r162 = obj;
                            while (r14 != 0) {
                                if (r14 instanceof h91) {
                                    h91 h91Var2 = (h91) r14;
                                    i = i6;
                                    if (p30.m3002l(mo1247k(), h91Var2.mo1247k()) && gj0.class == h91Var2.getClass()) {
                                        h91Var = h91Var2;
                                        break loop0;
                                    }
                                } else {
                                    i = i6;
                                    if ((r14.f4531f & i) != 0 && (r14 instanceof AbstractC0731sm)) {
                                        oe0 oe0Var2 = ((AbstractC0731sm) r14).f5782s;
                                        int i7 = 0;
                                        M3050f = r14;
                                        r16 = r162;
                                        while (oe0Var2 != null) {
                                            if ((oe0Var2.f4531f & i) != 0) {
                                                i7++;
                                                if (i7 == i5) {
                                                    M3050f = oe0Var2;
                                                } else {
                                                    ?? sh0Var = r16 == 0 ? new sh0(new oe0[16]) : r16;
                                                    if (M3050f != 0) {
                                                        sh0Var.m4072b(M3050f);
                                                        M3050f = 0;
                                                    }
                                                    sh0Var.m4072b(oe0Var2);
                                                    r16 = sh0Var;
                                                }
                                            }
                                            oe0Var2 = oe0Var2.f4534i;
                                            i5 = 1;
                                            M3050f = M3050f;
                                            r16 = r16;
                                        }
                                        i2 = i5;
                                        r16 = r16;
                                        if (i7 == i2) {
                                        }
                                        i6 = i;
                                        i5 = i2;
                                        r14 = M3050f;
                                        r162 = r16;
                                    }
                                    M3050f = pf1.m3050f(r16);
                                    i6 = i;
                                    i5 = i2;
                                    r14 = M3050f;
                                    r162 = r16;
                                }
                                i2 = i5;
                                r16 = r162;
                                M3050f = pf1.m3050f(r16);
                                i6 = i;
                                i5 = i2;
                                r14 = M3050f;
                                r162 = r16;
                            }
                        }
                        oe0Var = oe0Var.f4533h;
                        i6 = i6;
                        i5 = i5;
                        obj = null;
                    }
                }
                int i8 = i5;
                b60VarM3039Q = b60VarM3039Q.m315v();
                oe0Var = (b60VarM3039Q == null || (mj0Var = b60VarM3039Q.f395I) == null) ? null : mj0Var.f3997e;
                i5 = i8;
                obj = null;
            }
            gj0Var = (gj0) h91Var;
        } else {
            gj0Var = null;
        }
        if (gj0Var == null) {
            j6 = 0;
            return new rb1(rb1.m3439e(j5, j6));
        }
        long jM3439e = rb1.m3439e(j3, j5);
        long jM3438d = rb1.m3438d(j4, j5);
        ej0Var2.f1472g = j5;
        ej0Var2.f1476k = 2;
        objMo178R = gj0Var.mo178R(jM3439e, jM3438d, ej0Var2);
        if (objMo178R != enumC1007zk) {
            j7 = j5;
            j6 = ((rb1) objMo178R).f5348a;
            j5 = j7;
            return new rb1(rb1.m3439e(j5, j6));
        }
        return enumC1007zk;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:38:0x0078 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:71:0x0087 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:73:0x0030 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:75:0x0030 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:78:0x0081 */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v10, types: [oe0] */
    /* JADX WARN: Type inference failed for: r3v11, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v12 */
    /* JADX WARN: Type inference failed for: r3v13 */
    /* JADX WARN: Type inference failed for: r3v14 */
    /* JADX WARN: Type inference failed for: r3v15 */
    /* JADX WARN: Type inference failed for: r3v16 */
    /* JADX WARN: Type inference failed for: r3v17 */
    /* JADX WARN: Type inference failed for: r3v6 */
    /* JADX WARN: Type inference failed for: r3v7, types: [oe0] */
    /* JADX WARN: Type inference failed for: r3v9 */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v3, types: [sh0] */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r5v6, types: [sh0] */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* JADX WARN: Type inference failed for: r5v9 */
    /* JADX WARN: Type inference failed for: r6v7 */
    @Override // p000.aj0
    /* JADX INFO: renamed from: b0 */
    public final long mo179b0(int i, long j) {
        mj0 mj0Var;
        boolean z = this.f4542q;
        gj0 gj0Var = null;
        h91 h91Var = null;
        gj0Var = null;
        if (z && z) {
            if (!this.f4529d.f4542q) {
                w10.m4824b("visitAncestors called on an unattached node");
            }
            oe0 oe0Var = this.f4529d.f4533h;
            b60 b60VarM3039Q = pf1.m3039Q(this);
            loop0: while (true) {
                if (b60VarM3039Q == null) {
                    break;
                }
                if ((b60VarM3039Q.f395I.f3998f.f4532g & 262144) != 0) {
                    while (oe0Var != null) {
                        if ((oe0Var.f4531f & 262144) != 0) {
                            ?? M3050f = oe0Var;
                            ?? sh0Var = 0;
                            while (M3050f != 0) {
                                if (M3050f instanceof h91) {
                                    h91 h91Var2 = (h91) M3050f;
                                    if (p30.m3002l(mo1247k(), h91Var2.mo1247k()) && gj0.class == h91Var2.getClass()) {
                                        h91Var = h91Var2;
                                        break loop0;
                                    }
                                } else if ((M3050f.f4531f & 262144) != 0 && (M3050f instanceof AbstractC0731sm)) {
                                    oe0 oe0Var2 = ((AbstractC0731sm) M3050f).f5782s;
                                    int i2 = 0;
                                    M3050f = M3050f;
                                    sh0Var = sh0Var;
                                    while (oe0Var2 != null) {
                                        if ((oe0Var2.f4531f & 262144) != 0) {
                                            i2++;
                                            sh0Var = sh0Var;
                                            if (i2 == 1) {
                                                M3050f = oe0Var2;
                                            } else {
                                                if (sh0Var == 0) {
                                                    sh0Var = new sh0(new oe0[16]);
                                                }
                                                if (M3050f != 0) {
                                                    sh0Var.m4072b(M3050f);
                                                    M3050f = 0;
                                                }
                                                sh0Var.m4072b(oe0Var2);
                                            }
                                        }
                                        oe0Var2 = oe0Var2.f4534i;
                                        M3050f = M3050f;
                                        sh0Var = sh0Var;
                                    }
                                    if (i2 == 1) {
                                    }
                                }
                                M3050f = pf1.m3050f(sh0Var);
                            }
                        }
                        oe0Var = oe0Var.f4533h;
                    }
                }
                b60VarM3039Q = b60VarM3039Q.m315v();
                oe0Var = (b60VarM3039Q == null || (mj0Var = b60VarM3039Q.f395I) == null) ? null : mj0Var.f3997e;
            }
            gj0Var = (gj0) h91Var;
        }
        long jMo179b0 = gj0Var != null ? gj0Var.mo179b0(i, j) : 0L;
        return ok0.m2934e(jMo179b0, this.f2001r.mo179b0(i, ok0.m2933d(j, jMo179b0)));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.h91
    /* JADX INFO: renamed from: k */
    public final Object mo1247k() {
        return this.f2004u;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.oe0
    /* JADX INFO: renamed from: o0 */
    public final void mo656o0() {
        C0948y2 c0948y2 = this.f2002s;
        c0948y2.f7491d = this;
        c0948y2.f7492e = null;
        this.f2003t = null;
        c0948y2.f7493f = new C0310i7(7, this);
        c0948y2.f7494g = m2879k0();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:23:0x0064 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:38:0x008e */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:71:0x0038 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:73:0x0038 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:76:0x0097 */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v14 */
    /* JADX WARN: Type inference failed for: r6v15, types: [oe0] */
    /* JADX WARN: Type inference failed for: r6v16, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v17 */
    /* JADX WARN: Type inference failed for: r6v18 */
    /* JADX WARN: Type inference failed for: r6v19 */
    /* JADX WARN: Type inference failed for: r6v20 */
    /* JADX WARN: Type inference failed for: r6v21 */
    /* JADX WARN: Type inference failed for: r6v22 */
    /* JADX WARN: Type inference failed for: r6v6 */
    /* JADX WARN: Type inference failed for: r6v7, types: [oe0] */
    /* JADX WARN: Type inference failed for: r8v0 */
    /* JADX WARN: Type inference failed for: r8v1 */
    /* JADX WARN: Type inference failed for: r8v10 */
    /* JADX WARN: Type inference failed for: r8v11 */
    /* JADX WARN: Type inference failed for: r8v2 */
    /* JADX WARN: Type inference failed for: r8v3, types: [sh0] */
    /* JADX WARN: Type inference failed for: r8v4 */
    /* JADX WARN: Type inference failed for: r8v5 */
    /* JADX WARN: Type inference failed for: r8v6, types: [sh0] */
    /* JADX WARN: Type inference failed for: r8v8 */
    /* JADX WARN: Type inference failed for: r8v9 */
    /* JADX WARN: Type inference failed for: r9v7 */
    @Override // p000.oe0
    /* JADX INFO: renamed from: p0 */
    public final void mo657p0() {
        mj0 mj0Var;
        zt0 zt0Var = new zt0();
        C0536o3 c0536o3 = new C0536o3(1, zt0Var);
        gj0 gj0Var = this;
        if (!gj0Var.f4529d.f4542q) {
            w10.m4824b("visitAncestors called on an unattached node");
        }
        oe0 oe0Var = gj0Var.f4529d.f4533h;
        b60 b60VarM3039Q = pf1.m3039Q(this);
        loop0: while (b60VarM3039Q != null) {
            if ((b60VarM3039Q.f395I.f3998f.f4532g & 262144) != 0) {
                while (oe0Var != null) {
                    if ((oe0Var.f4531f & 262144) != 0) {
                        ?? M3050f = oe0Var;
                        ?? sh0Var = 0;
                        while (M3050f != 0) {
                            if (M3050f instanceof h91) {
                                h91 h91Var = (h91) M3050f;
                                if (!((p30.m3002l(mo1247k(), h91Var.mo1247k()) && getClass() == h91Var.getClass()) ? ((Boolean) c0536o3.invoke(h91Var)).booleanValue() : true)) {
                                    break loop0;
                                }
                            } else if ((M3050f.f4531f & 262144) != 0 && (M3050f instanceof AbstractC0731sm)) {
                                oe0 oe0Var2 = ((AbstractC0731sm) M3050f).f5782s;
                                int i = 0;
                                M3050f = M3050f;
                                sh0Var = sh0Var;
                                while (oe0Var2 != null) {
                                    if ((oe0Var2.f4531f & 262144) != 0) {
                                        i++;
                                        sh0Var = sh0Var;
                                        if (i == 1) {
                                            M3050f = oe0Var2;
                                        } else {
                                            if (sh0Var == 0) {
                                                sh0Var = new sh0(new oe0[16]);
                                            }
                                            if (M3050f != 0) {
                                                sh0Var.m4072b(M3050f);
                                                M3050f = 0;
                                            }
                                            sh0Var.m4072b(oe0Var2);
                                        }
                                    }
                                    oe0Var2 = oe0Var2.f4534i;
                                    M3050f = M3050f;
                                    sh0Var = sh0Var;
                                }
                                if (i == 1) {
                                }
                            }
                            M3050f = pf1.m3050f(sh0Var);
                        }
                    }
                    oe0Var = oe0Var.f4533h;
                }
            }
            b60VarM3039Q = b60VarM3039Q.m315v();
            oe0Var = (b60VarM3039Q == null || (mj0Var = b60VarM3039Q.f395I) == null) ? null : mj0Var.f3997e;
        }
        gj0 gj0Var2 = (gj0) ((h91) zt0Var.f7995d);
        this.f2003t = gj0Var2;
        C0948y2 c0948y2 = this.f2002s;
        c0948y2.f7492e = gj0Var2;
        if (((gj0) c0948y2.f7491d) == this) {
            c0948y2.f7491d = null;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:36:0x0075 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:78:0x0084 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:80:0x002f */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:82:0x002f */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:85:0x007e */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v12, types: [oe0] */
    /* JADX WARN: Type inference failed for: r4v14 */
    /* JADX WARN: Type inference failed for: r4v15, types: [oe0] */
    /* JADX WARN: Type inference failed for: r4v16, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v17 */
    /* JADX WARN: Type inference failed for: r4v18 */
    /* JADX WARN: Type inference failed for: r4v19 */
    /* JADX WARN: Type inference failed for: r4v20 */
    /* JADX WARN: Type inference failed for: r4v21 */
    /* JADX WARN: Type inference failed for: r4v22 */
    /* JADX WARN: Type inference failed for: r6v0 */
    /* JADX WARN: Type inference failed for: r6v1 */
    /* JADX WARN: Type inference failed for: r6v10 */
    /* JADX WARN: Type inference failed for: r6v11 */
    /* JADX WARN: Type inference failed for: r6v2 */
    /* JADX WARN: Type inference failed for: r6v3, types: [sh0] */
    /* JADX WARN: Type inference failed for: r6v4 */
    /* JADX WARN: Type inference failed for: r6v5 */
    /* JADX WARN: Type inference failed for: r6v6, types: [sh0] */
    /* JADX WARN: Type inference failed for: r6v8 */
    /* JADX WARN: Type inference failed for: r6v9 */
    /* JADX WARN: Type inference failed for: r7v7 */
    /* JADX INFO: renamed from: w0 */
    public final InterfaceC0966yk m1248w0() {
        gj0 gj0Var;
        h91 h91Var;
        mj0 mj0Var;
        if (this.f4542q) {
            if (!this.f4529d.f4542q) {
                w10.m4824b("visitAncestors called on an unattached node");
            }
            oe0 oe0Var = this.f4529d.f4533h;
            b60 b60VarM3039Q = pf1.m3039Q(this);
            loop0: while (true) {
                if (b60VarM3039Q == null) {
                    h91Var = null;
                    break;
                }
                if ((b60VarM3039Q.f395I.f3998f.f4532g & 262144) != 0) {
                    while (oe0Var != null) {
                        if ((oe0Var.f4531f & 262144) != 0) {
                            ?? M3050f = oe0Var;
                            ?? sh0Var = 0;
                            while (M3050f != 0) {
                                if (M3050f instanceof h91) {
                                    h91Var = (h91) M3050f;
                                    if (p30.m3002l(mo1247k(), h91Var.mo1247k()) && gj0.class == h91Var.getClass()) {
                                        break loop0;
                                    }
                                } else if ((M3050f.f4531f & 262144) != 0 && (M3050f instanceof AbstractC0731sm)) {
                                    oe0 oe0Var2 = ((AbstractC0731sm) M3050f).f5782s;
                                    int i = 0;
                                    M3050f = M3050f;
                                    sh0Var = sh0Var;
                                    while (oe0Var2 != null) {
                                        if ((oe0Var2.f4531f & 262144) != 0) {
                                            i++;
                                            sh0Var = sh0Var;
                                            if (i == 1) {
                                                M3050f = oe0Var2;
                                            } else {
                                                if (sh0Var == 0) {
                                                    sh0Var = new sh0(new oe0[16]);
                                                }
                                                if (M3050f != 0) {
                                                    sh0Var.m4072b(M3050f);
                                                    M3050f = 0;
                                                }
                                                sh0Var.m4072b(oe0Var2);
                                            }
                                        }
                                        oe0Var2 = oe0Var2.f4534i;
                                        M3050f = M3050f;
                                        sh0Var = sh0Var;
                                    }
                                    if (i == 1) {
                                    }
                                }
                                M3050f = pf1.m3050f(sh0Var);
                            }
                        }
                        oe0Var = oe0Var.f4533h;
                    }
                }
                b60VarM3039Q = b60VarM3039Q.m315v();
                oe0Var = (b60VarM3039Q == null || (mj0Var = b60VarM3039Q.f395I) == null) ? null : mj0Var.f3997e;
            }
            gj0Var = (gj0) h91Var;
        } else {
            gj0Var = null;
        }
        InterfaceC0966yk interfaceC0966ykM1248w0 = gj0Var != null ? gj0Var.m1248w0() : null;
        if (interfaceC0966ykM1248w0 != null && p30.m2975K(interfaceC0966ykM1248w0)) {
            return interfaceC0966ykM1248w0;
        }
        InterfaceC0966yk interfaceC0966yk = (InterfaceC0966yk) this.f2002s.f7494g;
        if (interfaceC0966yk != null) {
            return interfaceC0966yk;
        }
        C0921xc.m5134o("in order to access nested coroutine scope you need to attach dispatcher to the `Modifier.nestedScroll` first.");
        return null;
    }
}
