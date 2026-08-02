package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.atomic.AtomicLong;
import me.dartcv.nuke.R;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class yr {
    public static final AtomicLong a = new AtomicLong();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final void a(String str, px pxVar, int i) {
        go0 go0Var = (go0) pxVar;
        go0Var.X(1523821451);
        int i2 = (go0Var.f(str) ? 4 : 2) | i;
        if (go0Var.O(i2 & 1, (i2 & 3) != 2)) {
            eu.a(str, fg1.G(rh1.a, 0.0f, 0.0f, 0.0f, 8.0f, 7), new m13(((lp1) go0Var.j(ur1.a)).f, rg3.D(13), im0.k, 0L, 0, rg3.D(18), null, null, 16646136), 2, false, 2, 0, go0Var, (i2 & 14) | 1597488, 936);
        } else {
            go0Var.R();
        }
        b62 b62VarR = go0Var.r();
        if (b62VarR != null) {
            b62VarR.d = new n0(str, i, 8);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final void b(String str, String str2, boolean z, in0 in0Var, px pxVar, int i) {
        go0 go0Var = (go0) pxVar;
        go0Var.X(2071487839);
        int i2 = i | (go0Var.f(str) ? 4 : 2) | (go0Var.f(str2) ? 32 : 16) | (go0Var.g(z) ? 256 : 128) | (go0Var.h(in0Var) ? 2048 : 1024);
        if (go0Var.O(i2 & 1, (i2 & 1171) != 1170)) {
            kw kwVarI0 = xe1.i0(-1150593406, new sr(i, in0Var, z), go0Var);
            int i3 = ((i2 & 7168) == 2048 ? 1 : 0) | ((i2 & 896) == 256 ? 1 : 0);
            Object objL = go0Var.L();
            if (i3 != 0 || objL == nx.a) {
                objL = new qh(2, in0Var, z);
                go0Var.f0(objL);
            }
            sp0.g(str, null, str2, null, null, kwVarI0, false, (xm0) objL, null, go0Var, (i2 & 14) | 196608 | ((i2 << 3) & 896), 346);
        } else {
            go0Var.R();
        }
        b62 b62VarR = go0Var.r();
        if (b62VarR != null) {
            b62VarR.d = new nf(str, str2, z, in0Var, i);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final void c(final zq zqVar, final int i, final boolean z, final boolean z2, final xm0 xm0Var, final xm0 xm0Var2, final xm0 xm0Var3, final in0 in0Var, px pxVar, final int i2) {
        int i3;
        xm0 xm0Var4;
        int i4;
        int i5;
        int i6;
        go0 go0Var = (go0) pxVar;
        go0Var.X(-1404878651);
        if ((i2 & 6) == 0) {
            i3 = ((i2 & 8) == 0 ? go0Var.f(zqVar) : go0Var.h(zqVar) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= go0Var.d(i) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= go0Var.g(z) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i3 |= go0Var.g(z2) ? 2048 : 1024;
        }
        if ((i2 & 24576) == 0) {
            xm0Var4 = xm0Var;
            i3 |= go0Var.h(xm0Var4) ? 16384 : 8192;
        } else {
            xm0Var4 = xm0Var;
        }
        if ((i2 & 196608) == 0) {
            i3 |= go0Var.h(xm0Var2) ? 131072 : 65536;
        }
        if ((1572864 & i2) == 0) {
            i3 |= go0Var.h(xm0Var3) ? 1048576 : 524288;
        }
        if ((12582912 & i2) == 0) {
            i3 |= go0Var.h(in0Var) ? 8388608 : 4194304;
        }
        if (go0Var.O(i3 & 1, (4793491 & i3) != 4793490)) {
            int iOrdinal = zqVar.d.ordinal();
            if (iOrdinal == 0) {
                i4 = R.string.chat_auto_reply_match_contains;
            } else if (iOrdinal == 1) {
                i4 = R.string.chat_auto_reply_match_exact;
            } else {
                if (iOrdinal != 2) {
                    c80.s();
                    return;
                }
                i4 = R.string.chat_auto_reply_match_regex;
            }
            String strP = rg3.P(i4, go0Var);
            int iOrdinal2 = zqVar.i.ordinal();
            if (iOrdinal2 == 0) {
                i5 = R.string.chat_auto_reply_type_text;
            } else if (iOrdinal2 == 1) {
                i5 = R.string.chat_auto_reply_type_image;
            } else {
                if (iOrdinal2 != 2) {
                    c80.s();
                    return;
                }
                i5 = R.string.chat_auto_reply_type_voice;
            }
            String strP2 = rg3.P(i5, go0Var);
            av avVarA = yu.a(tp0.c, sn.u, go0Var, 0);
            int iHashCode = Long.hashCode(go0Var.T);
            yy1 yy1VarL = go0Var.l();
            uh1 uh1VarM = tl.M(go0Var, rh1.a);
            hx.c.getClass();
            jy jyVar = gx.b;
            go0Var.Z();
            if (go0Var.S) {
                go0Var.k(jyVar);
            } else {
                go0Var.i0();
            }
            yf3.c(go0Var, gx.e, avVarA);
            yf3.c(go0Var, gx.d, yy1VarL);
            yf3.c(go0Var, gx.f, Integer.valueOf(iHashCode));
            yf3.b(go0Var, gx.g);
            yf3.c(go0Var, gx.c, uh1VarM);
            String strQ = rg3.Q(R.string.chat_auto_reply_task_position, new Object[]{Integer.valueOf(i + 1), zqVar.b}, go0Var);
            List list = zqVar.e;
            if (list == null || !list.isEmpty()) {
                Iterator it = list.iterator();
                i6 = 0;
                while (it.hasNext()) {
                    if (!pv2.s0((String) it.next()) && (i6 = i6 + 1) < 0) {
                        eu.Z();
                        throw null;
                    }
                }
            } else {
                i6 = 0;
            }
            sp0.g(strQ, null, rg3.Q(R.string.chat_auto_reply_task_summary, new Object[]{strP, Integer.valueOf(i6), strP2}, go0Var), null, null, xe1.i0(1982639282, new af(zqVar, in0Var), go0Var), false, xm0Var4, null, go0Var, ((i3 << 9) & 29360128) | 196608, 346);
            go0Var = go0Var;
            uh1 uh1VarG = fg1.G(te.e, 14.0f, 0.0f, 14.0f, 8.0f, 2);
            ob2 ob2VarA = nb2.a(new xf(8.0f, new s(1)), sn.s, go0Var, 6);
            int iHashCode2 = Long.hashCode(go0Var.T);
            yy1 yy1VarL2 = go0Var.l();
            uh1 uh1VarM2 = tl.M(go0Var, uh1VarG);
            hx.c.getClass();
            jy jyVar2 = gx.b;
            go0Var.Z();
            if (go0Var.S) {
                go0Var.k(jyVar2);
            } else {
                go0Var.i0();
            }
            yf3.c(go0Var, gx.e, ob2VarA);
            yf3.c(go0Var, gx.d, yy1VarL2);
            yf3.c(go0Var, gx.f, Integer.valueOf(iHashCode2));
            yf3.b(go0Var, gx.g);
            yf3.c(go0Var, gx.c, uh1VarM2);
            se.r(rg3.P(R.string.chat_auto_reply_move_up, go0Var), xm0Var2, null, z, 0, go0Var, ((i3 >> 12) & 112) | ((i3 << 3) & 7168), 52);
            se.r(rg3.P(R.string.chat_auto_reply_move_down, go0Var), xm0Var3, null, z2, 0, go0Var, ((i3 >> 15) & 112) | (i3 & 7168), 52);
            go0Var.p(true);
            go0Var.p(true);
        } else {
            go0Var.R();
        }
        b62 b62VarR = go0Var.r();
        if (b62VarR != null) {
            b62VarR.d = new mn0() { // from class: qr
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                @Override // defpackage.mn0
                public final Object g(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    yr.c(zqVar, i, z, z2, xm0Var, xm0Var2, xm0Var3, in0Var, (px) obj, pp0.N(i2 | 1));
                    return a83.a;
                }
            };
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0135  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x014c  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0168  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x018c A[ORIG_RETURN, RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void d(final cr crVar, final xm0 xm0Var, final in0 in0Var, px pxVar, final int i) {
        int i2;
        b62 b62VarR;
        mn0 mn0Var;
        boolean z;
        Object objL;
        boolean zF;
        Object objL2;
        boolean zF2;
        Object objL3;
        go0 go0Var = (go0) pxVar;
        go0Var.X(-846333232);
        int i3 = 2;
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? go0Var.f(crVar) : go0Var.h(crVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= go0Var.h(xm0Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= go0Var.h(in0Var) ? 256 : 128;
        }
        int i4 = 0;
        if (go0Var.O(i2 & 1, (i2 & 147) != 146)) {
            boolean z2 = (i2 & 14) == 4 || ((i2 & 8) != 0 && go0Var.f(crVar));
            Object objL4 = go0Var.L();
            eb ebVar = nx.a;
            if (z2 || objL4 == ebVar) {
                objL4 = op0.u(crVar.a);
                go0Var.f0(objL4);
            }
            xk1 xk1Var = (xk1) objL4;
            Object objL5 = go0Var.L();
            if (objL5 == ebVar) {
                objL5 = op0.u(null);
                go0Var.f0(objL5);
            }
            xk1 xk1Var2 = (xk1) objL5;
            String strP = rg3.P(R.string.chat_auto_reply_default_task_name, go0Var);
            zq zqVar = (zq) xk1Var2.getValue();
            if (zqVar != null) {
                go0Var.W(-1654831290);
                List list = (List) xk1Var.getValue();
                if (list == null || !list.isEmpty()) {
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        if (t11.l(((zq) it.next()).a, zqVar.a)) {
                            z = false;
                            break;
                        }
                    }
                    z = true;
                    objL = go0Var.L();
                    if (objL == ebVar) {
                        objL = new f0(xk1Var2, 17);
                        go0Var.f0(objL);
                    }
                    xm0 xm0Var2 = (xm0) objL;
                    zF = go0Var.f(xk1Var) | go0Var.h(zqVar);
                    objL2 = go0Var.L();
                    if (!zF || objL2 == ebVar) {
                        objL2 = new s1(xk1Var, zqVar, xk1Var2);
                        go0Var.f0(objL2);
                    }
                    xm0 xm0Var3 = (xm0) objL2;
                    zF2 = go0Var.f(xk1Var);
                    objL3 = go0Var.L();
                    if (!zF2 || objL3 == ebVar) {
                        objL3 = new i0(xk1Var, xk1Var2, 3);
                        go0Var.f0(objL3);
                    }
                    e(zqVar, z, xm0Var2, xm0Var3, (in0) objL3, go0Var, 384);
                    go0Var.p(false);
                    b62VarR = go0Var.r();
                    if (b62VarR != null) {
                        return;
                    }
                    final int i5 = 0;
                    mn0Var = new mn0() { // from class: rr
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                        @Override // defpackage.mn0
                        public final Object g(Object obj, Object obj2) {
                            int i6 = i5;
                            a83 a83Var = a83.a;
                            int i7 = i;
                            in0 in0Var2 = in0Var;
                            xm0 xm0Var4 = xm0Var;
                            cr crVar2 = crVar;
                            px pxVar2 = (px) obj;
                            ((Integer) obj2).getClass();
                            switch (i6) {
                                case 0:
                                    yr.d(crVar2, xm0Var4, in0Var2, pxVar2, pp0.N(i7 | 1));
                                    break;
                                default:
                                    yr.d(crVar2, xm0Var4, in0Var2, pxVar2, pp0.N(i7 | 1));
                                    break;
                            }
                            return a83Var;
                        }
                    };
                } else {
                    z = true;
                    objL = go0Var.L();
                    if (objL == ebVar) {
                    }
                    xm0 xm0Var22 = (xm0) objL;
                    zF = go0Var.f(xk1Var) | go0Var.h(zqVar);
                    objL2 = go0Var.L();
                    if (!zF) {
                        objL2 = new s1(xk1Var, zqVar, xk1Var2);
                        go0Var.f0(objL2);
                        xm0 xm0Var32 = (xm0) objL2;
                        zF2 = go0Var.f(xk1Var);
                        objL3 = go0Var.L();
                        if (!zF2) {
                            objL3 = new i0(xk1Var, xk1Var2, 3);
                            go0Var.f0(objL3);
                            e(zqVar, z, xm0Var22, xm0Var32, (in0) objL3, go0Var, 384);
                            go0Var.p(false);
                            b62VarR = go0Var.r();
                            if (b62VarR != null) {
                            }
                        }
                    }
                }
                b62VarR.d = mn0Var;
            }
            go0Var.W(-1654831291);
            go0Var.p(false);
            qp0.d(true, xm0Var, null, rg3.P(R.string.chat_auto_reply_config_title, go0Var), null, xe1.i0(244085523, new ih(xm0Var, in0Var, xk1Var, i3), go0Var), xe1.i0(-1644292868, new tr(strP, xk1Var, xk1Var2, i4), go0Var), go0Var, (i2 & 112) | 1769478, 20);
            go0Var = go0Var;
        } else {
            go0Var.R();
        }
        b62VarR = go0Var.r();
        if (b62VarR != null) {
            final int i6 = 1;
            mn0Var = new mn0() { // from class: rr
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                @Override // defpackage.mn0
                public final Object g(Object obj, Object obj2) {
                    int i62 = i6;
                    a83 a83Var = a83.a;
                    int i7 = i;
                    in0 in0Var2 = in0Var;
                    xm0 xm0Var4 = xm0Var;
                    cr crVar2 = crVar;
                    px pxVar2 = (px) obj;
                    ((Integer) obj2).getClass();
                    switch (i62) {
                        case 0:
                            yr.d(crVar2, xm0Var4, in0Var2, pxVar2, pp0.N(i7 | 1));
                            break;
                        default:
                            yr.d(crVar2, xm0Var4, in0Var2, pxVar2, pp0.N(i7 | 1));
                            break;
                    }
                    return a83Var;
                }
            };
            b62VarR.d = mn0Var;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:243:0x0278 */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:156:0x02a4  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x02ea  */
    /* JADX WARN: Removed duplicated region for block: B:203:0x034d  */
    /* JADX WARN: Removed duplicated region for block: B:206:0x035b  */
    /* JADX WARN: Removed duplicated region for block: B:221:0x03cd  */
    /* JADX WARN: Type inference failed for: r29v0, types: [java.lang.Iterable, java.util.Collection, java.util.List] */
    /* JADX WARN: Type inference failed for: r2v31, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r2v32 */
    /* JADX WARN: Type inference failed for: r2v57 */
    /* JADX WARN: Type inference failed for: r8v6, types: [java.lang.String] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void e(final zq zqVar, final boolean z, final xm0 xm0Var, final xm0 xm0Var2, final in0 in0Var, px pxVar, final int i) {
        b62 b62VarR;
        mn0 mn0Var;
        xk1 xk1Var;
        Object objU;
        ?? arrayList;
        Collection collectionO;
        Integer num;
        final boolean z2;
        boolean z3;
        Object x92Var;
        go0 go0Var = (go0) pxVar;
        go0Var.X(-1743486316);
        int i2 = (go0Var.h(in0Var) ? 16384 : 8192) | i | (go0Var.f(zqVar) ? 4 : 2) | (go0Var.g(z) ? 32 : 16) | (go0Var.h(xm0Var2) ? 2048 : 1024);
        if (go0Var.O(i2 & 1, (i2 & 9363) != 9362)) {
            int i3 = i2 & 14;
            boolean z4 = i3 == 4;
            Object objL = go0Var.L();
            eb ebVar = nx.a;
            if (z4 || objL == ebVar) {
                objL = op0.u(zqVar.b);
                go0Var.f0(objL);
            }
            final xk1 xk1Var2 = (xk1) objL;
            boolean z5 = i3 == 4;
            Object objL2 = go0Var.L();
            if (z5 || objL2 == ebVar) {
                objL2 = op0.u(Boolean.valueOf(zqVar.c));
                go0Var.f0(objL2);
            }
            final xk1 xk1Var3 = (xk1) objL2;
            boolean z6 = i3 == 4;
            Object objL3 = go0Var.L();
            if (z6 || objL3 == ebVar) {
                objL3 = op0.u(zqVar.d);
                go0Var.f0(objL3);
            }
            final xk1 xk1Var4 = (xk1) objL3;
            boolean z7 = i3 == 4;
            Object objL4 = go0Var.L();
            if (z7 || objL4 == ebVar) {
                objL4 = op0.u(du.u0(zqVar.e, "\n", null, null, null, 62));
                go0Var.f0(objL4);
            }
            final xk1 xk1Var5 = (xk1) objL4;
            boolean z8 = i3 == 4;
            Object objL5 = go0Var.L();
            if (z8 || objL5 == ebVar) {
                objL5 = op0.u(Boolean.valueOf(zqVar.f));
                go0Var.f0(objL5);
            }
            final xk1 xk1Var6 = (xk1) objL5;
            boolean z9 = i3 == 4;
            Object objL6 = go0Var.L();
            if (z9 || objL6 == ebVar) {
                objL6 = op0.u(zqVar.g);
                go0Var.f0(objL6);
            }
            final xk1 xk1Var7 = (xk1) objL6;
            boolean z10 = i3 == 4;
            Object objL7 = go0Var.L();
            if (z10 || objL7 == ebVar) {
                objL7 = op0.u(zqVar.h);
                go0Var.f0(objL7);
            }
            final xk1 xk1Var8 = (xk1) objL7;
            boolean z11 = i3 == 4;
            Object objL8 = go0Var.L();
            if (z11 || objL8 == ebVar) {
                objL8 = op0.u(zqVar.i);
                go0Var.f0(objL8);
            }
            xk1 xk1Var9 = (xk1) objL8;
            boolean z12 = i3 == 4;
            Object objL9 = go0Var.L();
            if (z12 || objL9 == ebVar) {
                objL9 = op0.u(zqVar.j);
                go0Var.f0(objL9);
            }
            final xk1 xk1Var10 = (xk1) objL9;
            boolean z13 = i3 == 4;
            Object objL10 = go0Var.L();
            if (z13 || objL10 == ebVar) {
                objL10 = op0.u(String.valueOf(zqVar.k));
                go0Var.f0(objL10);
            }
            final xk1 xk1Var11 = (xk1) objL10;
            boolean z14 = i3 == 4;
            Object objL11 = go0Var.L();
            if (z14 || objL11 == ebVar) {
                xk1Var = xk1Var9;
                objU = op0.u(String.valueOf(zqVar.l));
                go0Var.f0(objU);
            } else {
                objU = objL11;
                xk1Var = xk1Var9;
            }
            final xk1 xk1Var12 = (xk1) objU;
            boolean z15 = i3 == 4;
            Object objL12 = go0Var.L();
            if (z15 || objL12 == ebVar) {
                objL12 = op0.u(String.valueOf(zqVar.m));
                go0Var.f0(objL12);
            }
            final xk1 xk1Var13 = (xk1) objL12;
            boolean z16 = i3 == 4;
            Object objL13 = go0Var.L();
            if (z16 || objL13 == ebVar) {
                objL13 = op0.u(Boolean.valueOf(zqVar.n));
                go0Var.f0(objL13);
            }
            final xk1 xk1Var14 = (xk1) objL13;
            Object objL14 = go0Var.L();
            if (objL14 == ebVar) {
                objL14 = op0.u(Boolean.FALSE);
                go0Var.f0(objL14);
            }
            final xk1 xk1Var15 = (xk1) objL14;
            Object objL15 = go0Var.L();
            if (objL15 == ebVar) {
                objL15 = op0.u(Boolean.FALSE);
                go0Var.f0(objL15);
            }
            final xk1 xk1Var16 = (xk1) objL15;
            String str = (String) xk1Var5.getValue();
            str.getClass();
            final xk1 xk1Var17 = xk1Var;
            ng ngVar = new ng(3, str);
            Object objL16 = go0Var.L();
            if (objL16 == ebVar) {
                objL16 = wr.o;
                go0Var.f0(objL16);
            }
            in0 in0Var2 = (in0) ((yn0) objL16);
            in0Var2.getClass();
            bj0 bj0Var = new bj0(ngVar, in0Var2, 1);
            Object objL17 = go0Var.L();
            if (objL17 == ebVar) {
                objL17 = xr.o;
                go0Var.f0(objL17);
            }
            in0 in0Var3 = (in0) ((yn0) objL17);
            in0Var3.getClass();
            ja0 ja0Var = new ja0(new aj0(new bj0(bj0Var, in0Var3, 0)), new eq1(21));
            if (ja0Var.hasNext()) {
                Object next = ja0Var.next();
                if (ja0Var.hasNext()) {
                    arrayList = new ArrayList();
                    arrayList.add(next);
                    while (ja0Var.hasNext()) {
                        arrayList.add(ja0Var.next());
                    }
                    Integer numE0 = wv2.e0((String) xk1Var11.getValue());
                    final Long lF0 = wv2.f0((String) xk1Var12.getValue());
                    final Long lF02 = wv2.f0((String) xk1Var13.getValue());
                    final ?? r29 = arrayList;
                    Object obj = null;
                    if (((gr) xk1Var4.getValue()) != gr.k) {
                        Set setQ = ((Boolean) xk1Var6.getValue()).booleanValue() ? t11.Q(p72.IGNORE_CASE) : fe0.h;
                        Iterator it = r29.iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                num = numE0;
                                break;
                            }
                            Object next2 = it.next();
                            num = numE0;
                            try {
                                x92Var = new o72((String) next2, setQ);
                            } catch (Throwable th) {
                                x92Var = new x92(th);
                            }
                            if (x92Var instanceof x92) {
                                obj = next2;
                                break;
                            }
                            numE0 = num;
                        }
                        obj = (String) obj;
                    } else {
                        num = numE0;
                    }
                    if (!pv2.s0((String) xk1Var2.getValue()) || r29.isEmpty() || obj != null || pv2.s0((String) xk1Var10.getValue()) || lF0 == null) {
                        z2 = false;
                        if (((Boolean) xk1Var15.getValue()).booleanValue()) {
                            go0Var.W(-1158748893);
                            String strP = rg3.P(((er) xk1Var7.getValue()) == er.j ? R.string.chat_auto_reply_select_whitelist_title : R.string.chat_auto_reply_select_blacklist_title, go0Var);
                            Set set = (Set) xk1Var8.getValue();
                            Object objL18 = go0Var.L();
                            if (objL18 == ebVar) {
                                objL18 = new f0(xk1Var15, 21);
                                go0Var.f0(objL18);
                            }
                            xm0 xm0Var3 = (xm0) objL18;
                            boolean zF = go0Var.f(xk1Var8);
                            Object objL19 = go0Var.L();
                            if (zF || objL19 == ebVar) {
                                objL19 = new i0(xk1Var8, xk1Var15, 2);
                                go0Var.f0(objL19);
                            }
                            se.u(strP, set, false, xm0Var3, (in0) objL19, go0Var, 3456);
                            go0Var.p(false);
                            b62VarR = go0Var.r();
                            if (b62VarR == null) {
                                return;
                            }
                            final int i4 = 0;
                            mn0Var = new mn0(zqVar, z, xm0Var, xm0Var2, in0Var, i, i4) { // from class: kr
                                public final /* synthetic */ int h;
                                public final /* synthetic */ zq i;
                                public final /* synthetic */ boolean j;
                                public final /* synthetic */ xm0 k;
                                public final /* synthetic */ xm0 l;
                                public final /* synthetic */ in0 m;

                                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                                {
                                    this.h = i4;
                                }

                                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                                @Override // defpackage.mn0
                                public final Object g(Object obj2, Object obj3) {
                                    int i5 = this.h;
                                    a83 a83Var = a83.a;
                                    switch (i5) {
                                        case 0:
                                            ((Integer) obj3).getClass();
                                            int iN = pp0.N(385);
                                            yr.e(this.i, this.j, this.k, this.l, this.m, (px) obj2, iN);
                                            break;
                                        case 1:
                                            ((Integer) obj3).getClass();
                                            int iN2 = pp0.N(385);
                                            yr.e(this.i, this.j, this.k, this.l, this.m, (px) obj2, iN2);
                                            break;
                                        default:
                                            ((Integer) obj3).getClass();
                                            int iN3 = pp0.N(385);
                                            yr.e(this.i, this.j, this.k, this.l, this.m, (px) obj2, iN3);
                                            break;
                                    }
                                    return a83Var;
                                }
                            };
                        } else {
                            go0Var.W(-1158123282);
                            go0Var.p(false);
                            if (((Boolean) xk1Var16.getValue()).booleanValue()) {
                                go0Var.W(-1158074302);
                                String strP2 = rg3.P(R.string.chat_auto_reply_delete_task_title, go0Var);
                                String strQ = rg3.Q(R.string.chat_auto_reply_delete_task_message, new Object[]{(String) xk1Var2.getValue()}, go0Var);
                                String strP3 = rg3.P(R.string.chat_auto_reply_delete_task, go0Var);
                                String strP4 = rg3.P(R.string.home_settings_cancel, go0Var);
                                Object objL20 = go0Var.L();
                                if (objL20 == ebVar) {
                                    objL20 = new f0(xk1Var16, 18);
                                    go0Var.f0(objL20);
                                }
                                qp0.c((xm0) objL20, strP2, strQ, strP3, xm0Var2, null, strP4, null, go0Var, (57344 & (i2 << 3)) | 6, 160);
                                go0Var.p(false);
                                b62VarR = go0Var.r();
                                if (b62VarR == null) {
                                    return;
                                }
                                final int i5 = 1;
                                mn0Var = new mn0(zqVar, z, xm0Var, xm0Var2, in0Var, i, i5) { // from class: kr
                                    public final /* synthetic */ int h;
                                    public final /* synthetic */ zq i;
                                    public final /* synthetic */ boolean j;
                                    public final /* synthetic */ xm0 k;
                                    public final /* synthetic */ xm0 l;
                                    public final /* synthetic */ in0 m;

                                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                                    {
                                        this.h = i5;
                                    }

                                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                                    @Override // defpackage.mn0
                                    public final Object g(Object obj2, Object obj3) {
                                        int i52 = this.h;
                                        a83 a83Var = a83.a;
                                        switch (i52) {
                                            case 0:
                                                ((Integer) obj3).getClass();
                                                int iN = pp0.N(385);
                                                yr.e(this.i, this.j, this.k, this.l, this.m, (px) obj2, iN);
                                                break;
                                            case 1:
                                                ((Integer) obj3).getClass();
                                                int iN2 = pp0.N(385);
                                                yr.e(this.i, this.j, this.k, this.l, this.m, (px) obj2, iN2);
                                                break;
                                            default:
                                                ((Integer) obj3).getClass();
                                                int iN3 = pp0.N(385);
                                                yr.e(this.i, this.j, this.k, this.l, this.m, (px) obj2, iN3);
                                                break;
                                        }
                                        return a83Var;
                                    }
                                };
                            } else {
                                go0Var.W(-1157601490);
                                go0Var.p(false);
                                final String strP5 = rg3.P(R.string.chat_auto_reply_match_contains, go0Var);
                                final String strP6 = rg3.P(R.string.chat_auto_reply_match_exact, go0Var);
                                final String strP7 = rg3.P(R.string.chat_auto_reply_match_regex, go0Var);
                                final String strP8 = rg3.P(R.string.chat_auto_reply_list_blacklist, go0Var);
                                final String strP9 = rg3.P(R.string.chat_auto_reply_list_whitelist, go0Var);
                                final String strP10 = rg3.P(R.string.chat_auto_reply_type_text, go0Var);
                                final String strP11 = rg3.P(R.string.chat_auto_reply_type_image, go0Var);
                                final String strP12 = rg3.P(R.string.chat_auto_reply_type_voice, go0Var);
                                String strP13 = rg3.P(z ? R.string.chat_auto_reply_add_task : R.string.chat_auto_reply_edit_task, go0Var);
                                final Integer num2 = num;
                                kw kwVarI0 = xe1.i0(594128471, new nn0() { // from class: lr
                                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                                    @Override // defpackage.nn0
                                    public final Object e(Object obj2, Object obj3, Object obj4) {
                                        pb2 pb2Var = (pb2) obj2;
                                        px pxVar2 = (px) obj3;
                                        int iIntValue = ((Integer) obj4).intValue();
                                        pb2Var.getClass();
                                        if ((iIntValue & 6) == 0) {
                                            iIntValue |= ((go0) pxVar2).f(pb2Var) ? 4 : 2;
                                        }
                                        go0 go0Var2 = (go0) pxVar2;
                                        if (go0Var2.O(iIntValue & 1, (iIntValue & 19) != 18)) {
                                            se.r(rg3.P(R.string.home_settings_cancel, go0Var2), xm0Var, pb2.a(pb2Var), false, 0, go0Var2, 0, 56);
                                            String strP14 = rg3.P(R.string.home_settings_save, go0Var2);
                                            uh1 uh1VarA = pb2.a(pb2Var);
                                            final Long l = lF0;
                                            boolean zF2 = go0Var2.f(l);
                                            final Long l2 = lF02;
                                            boolean zF3 = zF2 | go0Var2.f(l2);
                                            final in0 in0Var4 = in0Var;
                                            boolean zF4 = zF3 | go0Var2.f(in0Var4);
                                            final zq zqVar2 = zqVar;
                                            boolean zH = zF4 | go0Var2.h(zqVar2);
                                            final xk1 xk1Var18 = xk1Var2;
                                            boolean zF5 = zH | go0Var2.f(xk1Var18);
                                            final xk1 xk1Var19 = xk1Var3;
                                            boolean zF6 = zF5 | go0Var2.f(xk1Var19);
                                            final xk1 xk1Var20 = xk1Var4;
                                            boolean zF7 = zF6 | go0Var2.f(xk1Var20);
                                            final List list = r29;
                                            boolean zH2 = zF7 | go0Var2.h(list);
                                            final xk1 xk1Var21 = xk1Var6;
                                            boolean zF8 = zH2 | go0Var2.f(xk1Var21);
                                            final xk1 xk1Var22 = xk1Var7;
                                            boolean zF9 = zF8 | go0Var2.f(xk1Var22);
                                            final xk1 xk1Var23 = xk1Var8;
                                            boolean zF10 = zF9 | go0Var2.f(xk1Var23);
                                            final xk1 xk1Var24 = xk1Var17;
                                            boolean zF11 = zF10 | go0Var2.f(xk1Var24);
                                            final xk1 xk1Var25 = xk1Var10;
                                            boolean zF12 = zF11 | go0Var2.f(xk1Var25);
                                            final Integer num3 = num2;
                                            boolean zF13 = zF12 | go0Var2.f(num3);
                                            final xk1 xk1Var26 = xk1Var14;
                                            boolean zF14 = zF13 | go0Var2.f(xk1Var26);
                                            Object objL21 = go0Var2.L();
                                            if (zF14 || objL21 == nx.a) {
                                                xm0 xm0Var4 = new xm0() { // from class: nr
                                                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                                                    @Override // defpackage.xm0
                                                    public final Object a() {
                                                        Long l3 = l;
                                                        a83 a83Var = a83.a;
                                                        if (l3 != null) {
                                                            long jLongValue = l3.longValue();
                                                            Long l4 = l2;
                                                            if (l4 != null) {
                                                                long jLongValue2 = l4.longValue();
                                                                String string = pv2.I0((String) xk1Var18.getValue()).toString();
                                                                boolean zBooleanValue = ((Boolean) xk1Var19.getValue()).booleanValue();
                                                                gr grVar = (gr) xk1Var20.getValue();
                                                                boolean zBooleanValue2 = ((Boolean) xk1Var21.getValue()).booleanValue();
                                                                er erVar = (er) xk1Var22.getValue();
                                                                Set set2 = (Set) xk1Var23.getValue();
                                                                ir irVar = (ir) xk1Var24.getValue();
                                                                String string2 = pv2.I0((String) xk1Var25.getValue()).toString();
                                                                Integer num4 = num3;
                                                                in0Var4.j(zq.a(zqVar2, string, zBooleanValue, grVar, list, zBooleanValue2, erVar, set2, irVar, string2, num4 != null ? num4.intValue() : 1000, jLongValue, jLongValue2, ((Boolean) xk1Var26.getValue()).booleanValue(), 1));
                                                            }
                                                        }
                                                        return a83Var;
                                                    }
                                                };
                                                go0Var2.f0(xm0Var4);
                                                objL21 = xm0Var4;
                                            }
                                            se.q(strP14, (xm0) objL21, uh1VarA, z2, 0, go0Var2, 0, 48);
                                        } else {
                                            go0Var2.R();
                                        }
                                        return a83.a;
                                    }
                                }, go0Var);
                                final ?? r8 = obj;
                                qp0.d(true, xm0Var, null, strP13, null, kwVarI0, xe1.i0(-1917666624, new nn0() { // from class: mr
                                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                                    @Override // defpackage.nn0
                                    public final Object e(Object obj2, Object obj3, Object obj4) {
                                        float f;
                                        int i6;
                                        int i7;
                                        int i8;
                                        px pxVar2 = (px) obj3;
                                        int iIntValue = ((Integer) obj4).intValue();
                                        ((bv) obj2).getClass();
                                        final int i9 = 1;
                                        go0 go0Var2 = (go0) pxVar2;
                                        if (go0Var2.O(iIntValue & 1, (iIntValue & 17) != 16)) {
                                            rh1 rh1Var = rh1.a;
                                            uh1 uh1VarB0 = gf1.b0(te.P(rh1Var, 0.0f, 540.0f, 1), gf1.P(go0Var2));
                                            av avVarA = yu.a(tp0.c, sn.u, go0Var2, 0);
                                            int iHashCode = Long.hashCode(go0Var2.T);
                                            yy1 yy1VarL = go0Var2.l();
                                            uh1 uh1VarM = tl.M(go0Var2, uh1VarB0);
                                            hx.c.getClass();
                                            jy jyVar = gx.b;
                                            go0Var2.Z();
                                            if (go0Var2.S) {
                                                go0Var2.k(jyVar);
                                            } else {
                                                go0Var2.i0();
                                            }
                                            yf3.c(go0Var2, gx.e, avVarA);
                                            yf3.c(go0Var2, gx.d, yy1VarL);
                                            yf3.c(go0Var2, gx.f, Integer.valueOf(iHashCode));
                                            yf3.b(go0Var2, gx.g);
                                            yf3.c(go0Var2, gx.c, uh1VarM);
                                            yr.a(rg3.P(R.string.chat_auto_reply_task_name, go0Var2), go0Var2, 0);
                                            xk1 xk1Var18 = xk1Var2;
                                            String str2 = (String) xk1Var18.getValue();
                                            boolean zF2 = go0Var2.f(xk1Var18);
                                            Object objL21 = go0Var2.L();
                                            eb ebVar2 = nx.a;
                                            if (zF2 || objL21 == ebVar2) {
                                                objL21 = new h0(xk1Var18, 26);
                                                go0Var2.f0(objL21);
                                            }
                                            tp0.b(str2, (in0) objL21, null, rg3.P(R.string.chat_auto_reply_task_name_hint, go0Var2), null, null, false, 0, 0, false, false, null, null, null, go0Var2, 0, 0, 16372);
                                            String strF = vi0.f(rh1Var, 12.0f, go0Var2, R.string.chat_auto_reply_task_enabled, go0Var2);
                                            String strP14 = rg3.P(R.string.chat_auto_reply_task_enabled_description, go0Var2);
                                            xk1 xk1Var19 = xk1Var3;
                                            boolean zBooleanValue = ((Boolean) xk1Var19.getValue()).booleanValue();
                                            boolean zF3 = go0Var2.f(xk1Var19);
                                            Object objL22 = go0Var2.L();
                                            if (zF3 || objL22 == ebVar2) {
                                                objL22 = new pr(xk1Var19, 2);
                                                go0Var2.f0(objL22);
                                            }
                                            yr.b(strF, strP14, zBooleanValue, (in0) objL22, go0Var2, 0);
                                            String strF2 = vi0.f(rh1Var, 8.0f, go0Var2, R.string.chat_auto_reply_match_mode, go0Var2);
                                            String strP15 = rg3.P(R.string.chat_auto_reply_match_mode_description, go0Var2);
                                            yf0 yf0Var = gr.m;
                                            xk1 xk1Var20 = xk1Var4;
                                            gr grVar = (gr) xk1Var20.getValue();
                                            boolean zF4 = go0Var2.f(xk1Var20);
                                            Object objL23 = go0Var2.L();
                                            if (zF4 || objL23 == ebVar2) {
                                                objL23 = new pr(xk1Var20, 3);
                                                go0Var2.f0(objL23);
                                            }
                                            in0 in0Var4 = (in0) objL23;
                                            final String str3 = strP5;
                                            boolean zF5 = go0Var2.f(str3);
                                            final String str4 = strP6;
                                            boolean zF6 = zF5 | go0Var2.f(str4);
                                            final String str5 = strP7;
                                            boolean zF7 = zF6 | go0Var2.f(str5);
                                            Object objL24 = go0Var2.L();
                                            if (zF7 || objL24 == ebVar2) {
                                                objL24 = new in0() { // from class: or
                                                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                                                    @Override // defpackage.in0
                                                    public final Object j(Object obj5) {
                                                        int i10 = i9;
                                                        String str6 = str5;
                                                        String str7 = str4;
                                                        String str8 = str3;
                                                        switch (i10) {
                                                            case 0:
                                                                ir irVar = (ir) obj5;
                                                                irVar.getClass();
                                                                int iOrdinal = irVar.ordinal();
                                                                if (iOrdinal != 0) {
                                                                    if (iOrdinal != 1) {
                                                                        if (iOrdinal != 2) {
                                                                            c80.s();
                                                                        }
                                                                    }
                                                                }
                                                                break;
                                                            default:
                                                                gr grVar2 = (gr) obj5;
                                                                grVar2.getClass();
                                                                int iOrdinal2 = grVar2.ordinal();
                                                                if (iOrdinal2 != 0) {
                                                                    if (iOrdinal2 != 1) {
                                                                        if (iOrdinal2 != 2) {
                                                                            c80.s();
                                                                        }
                                                                    }
                                                                }
                                                                break;
                                                        }
                                                        return str8;
                                                    }
                                                };
                                                go0Var2.f0(objL24);
                                            }
                                            eu.m(strF2, yf0Var, grVar, in0Var4, null, strP15, (in0) objL24, false, go0Var2, 0);
                                            yr.a(vi0.f(rh1Var, 12.0f, go0Var2, R.string.chat_auto_reply_keywords, go0Var2), go0Var2, 0);
                                            xk1 xk1Var21 = xk1Var5;
                                            String str6 = (String) xk1Var21.getValue();
                                            boolean zF8 = go0Var2.f(xk1Var21);
                                            Object objL25 = go0Var2.L();
                                            if (zF8 || objL25 == ebVar2) {
                                                objL25 = new pr(xk1Var21, 4);
                                                go0Var2.f0(objL25);
                                            }
                                            tp0.b(str6, (in0) objL25, null, rg3.P(R.string.chat_auto_reply_keywords_hint, go0Var2), null, null, false, 3, 6, false, false, null, null, null, go0Var2, 114819072, 0, 15924);
                                            eu.a(rg3.P(((gr) xk1Var20.getValue()) == gr.k ? R.string.chat_auto_reply_regex_description : R.string.chat_auto_reply_keywords_description, go0Var2), fg1.G(rh1Var, 0.0f, 6.0f, 0.0f, 0.0f, 13), yr.h(go0Var2), 0, false, 0, 0, go0Var2, 48, 1016);
                                            String str7 = r8;
                                            if (str7 != null) {
                                                go0Var2.W(-1483247251);
                                                f = 6.0f;
                                                eu.a(rg3.Q(R.string.chat_auto_reply_regex_invalid, new Object[]{str7}, go0Var2), fg1.G(rh1Var, 0.0f, 6.0f, 0.0f, 0.0f, 13), new m13(((lp1) go0Var2.j(ur1.a)).g, rg3.D(12), im0.k, 0L, 0, rg3.D(17), null, null, 16646136), 0, false, 0, 0, go0Var2, 48, 1016);
                                                go0Var2.p(false);
                                            } else {
                                                f = 6.0f;
                                                go0Var2.W(-1482803796);
                                                go0Var2.p(false);
                                            }
                                            String strF3 = vi0.f(rh1Var, 8.0f, go0Var2, R.string.chat_auto_reply_ignore_case, go0Var2);
                                            String strP16 = rg3.P(R.string.chat_auto_reply_ignore_case_description, go0Var2);
                                            xk1 xk1Var22 = xk1Var6;
                                            boolean zBooleanValue2 = ((Boolean) xk1Var22.getValue()).booleanValue();
                                            boolean zF9 = go0Var2.f(xk1Var22);
                                            Object objL26 = go0Var2.L();
                                            if (zF9 || objL26 == ebVar2) {
                                                objL26 = new pr(xk1Var22, 5);
                                                go0Var2.f0(objL26);
                                            }
                                            yr.b(strF3, strP16, zBooleanValue2, (in0) objL26, go0Var2, 0);
                                            String strF4 = vi0.f(rh1Var, 8.0f, go0Var2, R.string.chat_auto_reply_list_mode, go0Var2);
                                            xk1 xk1Var23 = xk1Var7;
                                            er erVar = (er) xk1Var23.getValue();
                                            er erVar2 = er.j;
                                            String strP17 = rg3.P(erVar == erVar2 ? R.string.chat_auto_reply_whitelist_description : R.string.chat_auto_reply_blacklist_description, go0Var2);
                                            yf0 yf0Var2 = er.l;
                                            er erVar3 = (er) xk1Var23.getValue();
                                            boolean zF10 = go0Var2.f(xk1Var23);
                                            Object objL27 = go0Var2.L();
                                            if (zF10 || objL27 == ebVar2) {
                                                objL27 = new pr(xk1Var23, 6);
                                                go0Var2.f0(objL27);
                                            }
                                            in0 in0Var5 = (in0) objL27;
                                            String str8 = strP8;
                                            boolean zF11 = go0Var2.f(str8);
                                            String str9 = strP9;
                                            boolean zF12 = zF11 | go0Var2.f(str9);
                                            Object objL28 = go0Var2.L();
                                            if (zF12 || objL28 == ebVar2) {
                                                objL28 = new g0(4, str8, str9);
                                                go0Var2.f0(objL28);
                                            }
                                            eu.m(strF4, yf0Var2, erVar3, in0Var5, null, strP17, (in0) objL28, false, go0Var2, 0);
                                            String strP18 = rg3.P(((er) xk1Var23.getValue()) == erVar2 ? R.string.chat_auto_reply_configure_whitelist : R.string.chat_auto_reply_configure_blacklist, go0Var2);
                                            String strQ2 = rg3.Q(R.string.chat_auto_reply_selected_count, new Object[]{Integer.valueOf(((Set) xk1Var8.getValue()).size())}, go0Var2);
                                            Object objL29 = go0Var2.L();
                                            if (objL29 == ebVar2) {
                                                objL29 = new f0(xk1Var15, 20);
                                                go0Var2.f0(objL29);
                                            }
                                            qp0.h(strP18, (xm0) objL29, null, strQ2, null, null, null, false, null, go0Var2, 48, 500);
                                            String strF5 = vi0.f(rh1Var, 8.0f, go0Var2, R.string.chat_auto_reply_reply_type, go0Var2);
                                            String strP19 = rg3.P(R.string.chat_auto_reply_reply_type_description, go0Var2);
                                            yf0 yf0Var3 = ir.l;
                                            xk1 xk1Var24 = xk1Var17;
                                            ir irVar = (ir) xk1Var24.getValue();
                                            boolean zF13 = go0Var2.f(xk1Var24);
                                            Object objL30 = go0Var2.L();
                                            if (zF13 || objL30 == ebVar2) {
                                                objL30 = new pr(xk1Var24, 7);
                                                go0Var2.f0(objL30);
                                            }
                                            in0 in0Var6 = (in0) objL30;
                                            final String str10 = strP10;
                                            boolean zF14 = go0Var2.f(str10);
                                            final String str11 = strP11;
                                            boolean zF15 = zF14 | go0Var2.f(str11);
                                            final String str12 = strP12;
                                            boolean zF16 = zF15 | go0Var2.f(str12);
                                            Object objL31 = go0Var2.L();
                                            if (zF16 || objL31 == ebVar2) {
                                                final int i10 = 0;
                                                objL31 = new in0() { // from class: or
                                                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                                                    @Override // defpackage.in0
                                                    public final Object j(Object obj5) {
                                                        int i102 = i10;
                                                        String str62 = str12;
                                                        String str72 = str11;
                                                        String str82 = str10;
                                                        switch (i102) {
                                                            case 0:
                                                                ir irVar2 = (ir) obj5;
                                                                irVar2.getClass();
                                                                int iOrdinal = irVar2.ordinal();
                                                                if (iOrdinal != 0) {
                                                                    if (iOrdinal != 1) {
                                                                        if (iOrdinal != 2) {
                                                                            c80.s();
                                                                        }
                                                                    }
                                                                }
                                                                break;
                                                            default:
                                                                gr grVar2 = (gr) obj5;
                                                                grVar2.getClass();
                                                                int iOrdinal2 = grVar2.ordinal();
                                                                if (iOrdinal2 != 0) {
                                                                    if (iOrdinal2 != 1) {
                                                                        if (iOrdinal2 != 2) {
                                                                            c80.s();
                                                                        }
                                                                    }
                                                                }
                                                                break;
                                                        }
                                                        return str82;
                                                    }
                                                };
                                                go0Var2.f0(objL31);
                                            }
                                            eu.m(strF5, yf0Var3, irVar, in0Var6, null, strP19, (in0) objL31, false, go0Var2, 0);
                                            rp0.O(go0Var2, te.O(rh1Var, 12.0f));
                                            ir irVar2 = (ir) xk1Var24.getValue();
                                            ir irVar3 = ir.i;
                                            yr.a(rg3.P(irVar2 == irVar3 ? R.string.chat_auto_reply_reply_content : R.string.chat_auto_reply_media_path, go0Var2), go0Var2, 0);
                                            xk1 xk1Var25 = xk1Var10;
                                            String str13 = (String) xk1Var25.getValue();
                                            boolean zF17 = go0Var2.f(xk1Var25);
                                            Object objL32 = go0Var2.L();
                                            if (zF17 || objL32 == ebVar2) {
                                                objL32 = new h0(xk1Var25, 27);
                                                go0Var2.f0(objL32);
                                            }
                                            in0 in0Var7 = (in0) objL32;
                                            int iOrdinal = ((ir) xk1Var24.getValue()).ordinal();
                                            if (iOrdinal == 0) {
                                                i6 = 2;
                                                i7 = R.string.chat_auto_reply_reply_content_hint;
                                            } else if (iOrdinal != 1) {
                                                i6 = 2;
                                                if (iOrdinal != 2) {
                                                    c80.s();
                                                    return null;
                                                }
                                                i7 = R.string.chat_auto_reply_voice_path_hint;
                                            } else {
                                                i6 = 2;
                                                i7 = R.string.chat_auto_reply_image_path_hint;
                                            }
                                            tp0.b(str13, in0Var7, null, rg3.P(i7, go0Var2), null, null, ((ir) xk1Var24.getValue()) != irVar3, ((ir) xk1Var24.getValue()) == irVar3 ? i6 : 1, ((ir) xk1Var24.getValue()) == irVar3 ? 5 : 1, false, false, null, null, null, go0Var2, 0, 0, 15924);
                                            go0 go0Var3 = go0Var2;
                                            if (((ir) xk1Var24.getValue()) == ir.j) {
                                                go0Var3.W(-1479120872);
                                                eu.a(rg3.P(R.string.chat_auto_reply_voice_silk_notice, go0Var3), fg1.G(rh1Var, 0.0f, f, 0.0f, 0.0f, 13), yr.h(go0Var3), 0, false, 0, 0, go0Var3, 48, 1016);
                                                yr.a(vi0.f(rh1Var, 12.0f, go0Var3, R.string.chat_auto_reply_voice_duration, go0Var3), go0Var3, 0);
                                                xk1 xk1Var26 = xk1Var11;
                                                String str14 = (String) xk1Var26.getValue();
                                                boolean zF18 = go0Var3.f(xk1Var26);
                                                Object objL33 = go0Var3.L();
                                                if (zF18 || objL33 == ebVar2) {
                                                    objL33 = new h0(xk1Var26, 28);
                                                    go0Var3.f0(objL33);
                                                }
                                                tp0.b(str14, (in0) objL33, null, rg3.P(R.string.chat_auto_reply_voice_duration_hint, go0Var3), null, null, false, 0, 0, false, false, null, new m51(3, 123), null, go0Var3, 0, 384, 12276);
                                                go0Var3 = go0Var3;
                                                i8 = 0;
                                                go0Var3.p(false);
                                            } else {
                                                i8 = 0;
                                                go0Var3.W(-1478363604);
                                                go0Var3.p(false);
                                            }
                                            yr.a(vi0.f(rh1Var, 12.0f, go0Var3, R.string.chat_auto_reply_delay, go0Var3), go0Var3, i8);
                                            xk1 xk1Var27 = xk1Var12;
                                            String str15 = (String) xk1Var27.getValue();
                                            boolean zF19 = go0Var3.f(xk1Var27);
                                            Object objL34 = go0Var3.L();
                                            if (zF19 || objL34 == ebVar2) {
                                                objL34 = new h0(xk1Var27, 29);
                                                go0Var3.f0(objL34);
                                            }
                                            go0 go0Var4 = go0Var3;
                                            tp0.b(str15, (in0) objL34, null, rg3.P(R.string.chat_auto_reply_delay_hint, go0Var3), null, null, false, 0, 0, false, false, null, new m51(3, 123), null, go0Var4, 0, 384, 12276);
                                            yr.a(vi0.f(rh1Var, 12.0f, go0Var4, R.string.chat_auto_reply_cooldown, go0Var4), go0Var4, 0);
                                            xk1 xk1Var28 = xk1Var13;
                                            String str16 = (String) xk1Var28.getValue();
                                            boolean zF20 = go0Var4.f(xk1Var28);
                                            Object objL35 = go0Var4.L();
                                            if (zF20 || objL35 == ebVar2) {
                                                objL35 = new pr(xk1Var28, 0);
                                                go0Var4.f0(objL35);
                                            }
                                            tp0.b(str16, (in0) objL35, null, rg3.P(R.string.chat_auto_reply_cooldown_hint, go0Var4), null, null, false, 0, 0, false, false, null, new m51(3, 123), null, go0Var4, 0, 384, 12276);
                                            go0 go0Var5 = go0Var4;
                                            eu.a(rg3.P(R.string.chat_auto_reply_cooldown_description, go0Var5), fg1.G(rh1Var, 0.0f, f, 0.0f, 0.0f, 13), yr.h(go0Var5), 0, false, 0, 0, go0Var5, 48, 1016);
                                            String strF6 = vi0.f(rh1Var, 8.0f, go0Var5, R.string.chat_auto_reply_stop_after_match, go0Var5);
                                            String strP20 = rg3.P(R.string.chat_auto_reply_stop_after_match_description, go0Var5);
                                            xk1 xk1Var29 = xk1Var14;
                                            boolean zBooleanValue3 = ((Boolean) xk1Var29.getValue()).booleanValue();
                                            boolean zF21 = go0Var5.f(xk1Var29);
                                            Object objL36 = go0Var5.L();
                                            if (zF21 || objL36 == ebVar2) {
                                                objL36 = new pr(xk1Var29, 1);
                                                go0Var5.f0(objL36);
                                            }
                                            yr.b(strF6, strP20, zBooleanValue3, (in0) objL36, go0Var5, 0);
                                            if (z) {
                                                go0Var5.W(-1476470868);
                                                go0Var5.p(false);
                                            } else {
                                                go0Var5.W(-1476788959);
                                                rp0.O(go0Var5, te.O(rh1Var, 14.0f));
                                                String strP21 = rg3.P(R.string.chat_auto_reply_delete_task, go0Var5);
                                                Object objL37 = go0Var5.L();
                                                if (objL37 == ebVar2) {
                                                    objL37 = new f0(xk1Var16, 19);
                                                    go0Var5.f0(objL37);
                                                }
                                                se.r(strP21, (xm0) objL37, te.e, false, 0, go0Var5, 432, 56);
                                                go0Var5 = go0Var5;
                                                go0Var5.p(false);
                                            }
                                            go0Var5.p(true);
                                        } else {
                                            go0Var2.R();
                                        }
                                        return a83.a;
                                    }
                                }, go0Var), go0Var, 1769526, 20);
                                go0Var = go0Var;
                            }
                        }
                    } else {
                        long jLongValue = lF0.longValue();
                        if (0 <= jLongValue && jLongValue < 60001 && lF02 != null) {
                            long jLongValue2 = lF02.longValue();
                            if (0 <= jLongValue2 && jLongValue2 < 86400001) {
                                if (((ir) xk1Var17.getValue()) == ir.j) {
                                    if (num != null) {
                                        int iIntValue = num.intValue();
                                        z3 = true;
                                        if (1 > iIntValue || iIntValue >= 60001) {
                                        }
                                        if (((Boolean) xk1Var15.getValue()).booleanValue()) {
                                        }
                                    }
                                    z2 = false;
                                    if (((Boolean) xk1Var15.getValue()).booleanValue()) {
                                    }
                                } else {
                                    z3 = true;
                                }
                                z2 = z3;
                                if (((Boolean) xk1Var15.getValue()).booleanValue()) {
                                }
                            }
                        }
                    }
                    b62VarR.d = mn0Var;
                }
                collectionO = eu.O(next);
            } else {
                collectionO = be0.h;
            }
            arrayList = collectionO;
            Integer numE02 = wv2.e0((String) xk1Var11.getValue());
            final Long lF03 = wv2.f0((String) xk1Var12.getValue());
            final Long lF022 = wv2.f0((String) xk1Var13.getValue());
            final List r292 = arrayList;
            Object obj2 = null;
            if (((gr) xk1Var4.getValue()) != gr.k) {
            }
            if (pv2.s0((String) xk1Var2.getValue())) {
                z2 = false;
                if (((Boolean) xk1Var15.getValue()).booleanValue()) {
                }
            }
            b62VarR.d = mn0Var;
        }
        go0Var.R();
        b62VarR = go0Var.r();
        if (b62VarR != null) {
            final int i6 = 2;
            mn0Var = new mn0(zqVar, z, xm0Var, xm0Var2, in0Var, i, i6) { // from class: kr
                public final /* synthetic */ int h;
                public final /* synthetic */ zq i;
                public final /* synthetic */ boolean j;
                public final /* synthetic */ xm0 k;
                public final /* synthetic */ xm0 l;
                public final /* synthetic */ in0 m;

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                {
                    this.h = i6;
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                @Override // defpackage.mn0
                public final Object g(Object obj22, Object obj3) {
                    int i52 = this.h;
                    a83 a83Var = a83.a;
                    switch (i52) {
                        case 0:
                            ((Integer) obj3).getClass();
                            int iN = pp0.N(385);
                            yr.e(this.i, this.j, this.k, this.l, this.m, (px) obj22, iN);
                            break;
                        case 1:
                            ((Integer) obj3).getClass();
                            int iN2 = pp0.N(385);
                            yr.e(this.i, this.j, this.k, this.l, this.m, (px) obj22, iN2);
                            break;
                        default:
                            ((Integer) obj3).getClass();
                            int iN3 = pp0.N(385);
                            yr.e(this.i, this.j, this.k, this.l, this.m, (px) obj22, iN3);
                            break;
                    }
                    return a83Var;
                }
            };
            b62VarR.d = mn0Var;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final String f() {
        long jCurrentTimeMillis = System.currentTimeMillis();
        xe1.j(36);
        String string = Long.toString(jCurrentTimeMillis, 36);
        string.getClass();
        long jIncrementAndGet = a.incrementAndGet();
        xe1.j(36);
        String string2 = Long.toString(jIncrementAndGet, 36);
        string2.getClass();
        return string + "-" + string2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final List g(List list, int i, int i2) {
        if (i < 0 || i >= list.size() || i2 < 0 || i2 >= list.size() || i == i2) {
            return list;
        }
        ArrayList arrayList = new ArrayList(list);
        Object obj = arrayList.get(i);
        arrayList.set(i, arrayList.get(i2));
        arrayList.set(i2, obj);
        return arrayList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final m13 h(go0 go0Var) {
        return new m13(((lp1) go0Var.j(ur1.a)).f, rg3.D(12), null, 0L, 0, rg3.D(17), null, null, 16646140);
    }
}
