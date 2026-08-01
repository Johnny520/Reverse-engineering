package p000;

/* JADX INFO: renamed from: m3 */
/* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
/* JADX INFO: loaded from: classes.dex */
public final class C0458m3 extends c50 implements InterfaceC0298hw {

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ int f3795d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ Object f3796e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ Object f3797f;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0458m3(int i, Object obj, Object obj2) {
        super(0);
        this.f3795d = i;
        this.f3796e = obj;
        this.f3797f = obj2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:132:0x00cc */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:136:0x0069 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:138:0x0069 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:141:0x00c6 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:51:0x00bd */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v16 */
    /* JADX WARN: Type inference failed for: r0v17, types: [oe0] */
    /* JADX WARN: Type inference failed for: r0v19 */
    /* JADX WARN: Type inference failed for: r0v20, types: [oe0] */
    /* JADX WARN: Type inference failed for: r0v21, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v22 */
    /* JADX WARN: Type inference failed for: r0v23 */
    /* JADX WARN: Type inference failed for: r0v24 */
    /* JADX WARN: Type inference failed for: r0v25 */
    /* JADX WARN: Type inference failed for: r0v27 */
    /* JADX WARN: Type inference failed for: r0v28 */
    /* JADX WARN: Type inference failed for: r6v10 */
    /* JADX WARN: Type inference failed for: r6v11 */
    /* JADX WARN: Type inference failed for: r6v12, types: [sh0] */
    /* JADX WARN: Type inference failed for: r6v13 */
    /* JADX WARN: Type inference failed for: r6v14 */
    /* JADX WARN: Type inference failed for: r6v15, types: [sh0] */
    /* JADX WARN: Type inference failed for: r6v18 */
    /* JADX WARN: Type inference failed for: r6v19 */
    /* JADX WARN: Type inference failed for: r6v20 */
    /* JADX WARN: Type inference failed for: r6v21 */
    /* JADX WARN: Type inference failed for: r6v9 */
    /* JADX WARN: Type inference failed for: r7v18 */
    @Override // p000.InterfaceC0298hw
    public final Object invoke() {
        xz0 xz0Var;
        b60 b60Var;
        int i = this.f3795d;
        na1 na1Var = na1.f4229a;
        Object obj = this.f3797f;
        Object obj2 = this.f3796e;
        switch (i) {
            case 0:
                break;
            case 1:
                break;
            case 2:
                ViewOnAttachStateChangeListenerC0078c4 viewOnAttachStateChangeListenerC0078c4 = (ViewOnAttachStateChangeListenerC0078c4) obj;
                my0 my0Var = (my0) obj2;
                hy0 hy0Var = my0Var.f4080h;
                hy0 hy0Var2 = my0Var.f4081i;
                Float f = my0Var.f4078f;
                Float f2 = my0Var.f4079g;
                float fFloatValue = (hy0Var == null || f == null) ? 0.0f : ((Number) hy0Var.f2376a.invoke()).floatValue() - f.floatValue();
                float fFloatValue2 = (hy0Var2 == null || f2 == null) ? 0.0f : ((Number) hy0Var2.f2376a.invoke()).floatValue() - f2.floatValue();
                if (fFloatValue != 0.0f || fFloatValue2 != 0.0f) {
                    int iM471s = viewOnAttachStateChangeListenerC0078c4.m471s(my0Var.f4076d);
                    zz0 zz0Var = (zz0) viewOnAttachStateChangeListenerC0078c4.m467k().m4248b(viewOnAttachStateChangeListenerC0078c4.f677o);
                    if (zz0Var != null) {
                        try {
                            C0156e1 c0156e1 = viewOnAttachStateChangeListenerC0078c4.f679q;
                            if (c0156e1 != null) {
                                c0156e1.f1256a.setBoundsInScreen(viewOnAttachStateChangeListenerC0078c4.m459c(zz0Var));
                            }
                            break;
                        } catch (IllegalStateException unused) {
                        }
                    }
                    zz0 zz0Var2 = (zz0) viewOnAttachStateChangeListenerC0078c4.m467k().m4248b(viewOnAttachStateChangeListenerC0078c4.f678p);
                    if (zz0Var2 != null) {
                        try {
                            C0156e1 c0156e12 = viewOnAttachStateChangeListenerC0078c4.f680r;
                            if (c0156e12 != null) {
                                c0156e12.f1256a.setBoundsInScreen(viewOnAttachStateChangeListenerC0078c4.m459c(zz0Var2));
                            }
                            break;
                        } catch (IllegalStateException unused2) {
                        }
                    }
                    viewOnAttachStateChangeListenerC0078c4.f669g.invalidate();
                    zz0 zz0Var3 = (zz0) viewOnAttachStateChangeListenerC0078c4.m467k().m4248b(iM471s);
                    if (zz0Var3 != null && (xz0Var = zz0Var3.f8062a) != null && (b60Var = xz0Var.f7470c) != null) {
                        if (hy0Var != null) {
                            viewOnAttachStateChangeListenerC0078c4.f682t.m4330i(iM471s, hy0Var);
                        }
                        if (hy0Var2 != null) {
                            viewOnAttachStateChangeListenerC0078c4.f683u.m4330i(iM471s, hy0Var2);
                        }
                        viewOnAttachStateChangeListenerC0078c4.m470o(b60Var);
                    }
                }
                if (hy0Var != null) {
                    my0Var.f4078f = (Float) hy0Var.f2376a.invoke();
                }
                if (hy0Var2 != null) {
                    my0Var.f4079g = (Float) hy0Var2.f2376a.invoke();
                }
                break;
            case 3:
                InterfaceC0298hw interfaceC0298hw = (InterfaceC0298hw) obj2;
                if (interfaceC0298hw == null || (r10 = (st0) interfaceC0298hw.invoke()) == null) {
                    qj0 qj0Var = (qj0) obj;
                    if (!qj0Var.mo436G0().f4542q) {
                        qj0Var = null;
                    }
                    if (qj0Var != null) {
                    }
                }
                break;
            case 4:
                ((C0469mc) obj2).f3913t.invoke((C0507nc) obj);
                break;
            case 5:
                ((zt0) obj2).f7995d = ((C0149dv) obj).m733y0();
                break;
            case 6:
                ((C0491my) obj2).m2610d((oe0) obj);
                break;
            case 7:
                mj0 mj0Var = ((b60) obj2).f395I;
                zt0 zt0Var = (zt0) obj;
                if ((mj0Var.f3998f.f4532g & 8) != 0) {
                    for (oe0 oe0Var = mj0Var.f3997e; oe0Var != null; oe0Var = oe0Var.f4533h) {
                        if ((oe0Var.f4531f & 8) != 0) {
                            ?? M3050f = oe0Var;
                            ?? sh0Var = 0;
                            while (M3050f != 0) {
                                if (M3050f instanceof vz0) {
                                    vz0 vz0Var = (vz0) M3050f;
                                    if (vz0Var.mo2021V()) {
                                        sz0 sz0Var = new sz0();
                                        zt0Var.f7995d = sz0Var;
                                        sz0Var.f5880g = true;
                                    }
                                    if (vz0Var.mo2022X()) {
                                        ((sz0) zt0Var.f7995d).f5879f = true;
                                    }
                                    vz0Var.mo757S((f01) zt0Var.f7995d);
                                } else if ((M3050f.f4531f & 8) != 0 && (M3050f instanceof AbstractC0731sm)) {
                                    oe0 oe0Var2 = ((AbstractC0731sm) M3050f).f5782s;
                                    int i2 = 0;
                                    M3050f = M3050f;
                                    sh0Var = sh0Var;
                                    while (oe0Var2 != null) {
                                        if ((oe0Var2.f4531f & 8) != 0) {
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
                    }
                }
                break;
            default:
                gv0 gv0Var = qj0.f5161P;
                ((InterfaceC0742sw) obj2).invoke(gv0Var);
                qj0 qj0Var2 = (qj0) obj;
                x01 x01Var = qj0Var2.f5171G;
                x01 x01Var2 = gv0Var.f2072m;
                boolean z = x01Var != x01Var2;
                boolean z2 = qj0Var2.f5172H;
                boolean z3 = gv0Var.f2073n;
                boolean z4 = z2 != z3;
                if (z || z4) {
                    qj0Var2.f5171G = x01Var2;
                    qj0Var2.f5172H = z3;
                    if (qj0Var2.f5173I && (z4 || (z3 && z))) {
                        qj0Var2.f5180r.m270F();
                    }
                }
                qj0Var2.f5173I = true;
                gv0Var.f2078s = gv0Var.f2072m.mo737a(gv0Var.f2074o, gv0Var.f2076q, gv0Var.f2075p);
                break;
        }
        return na1Var;
    }
}
