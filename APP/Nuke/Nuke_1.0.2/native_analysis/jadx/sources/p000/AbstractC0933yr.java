package p000;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.atomic.AtomicLong;
import me.dartcv.nuke.R;

/* JADX INFO: renamed from: yr */
/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0933yr {

    /* JADX INFO: renamed from: a */
    public static final AtomicLong f13595a = new AtomicLong();

    /* JADX INFO: renamed from: a */
    public static final void m6312a(String str, InterfaceC0596px interfaceC0596px, int i) {
        go0 go0Var = (go0) interfaceC0596px;
        go0Var.m1967X(1523821451);
        int i2 = (go0Var.m1980f(str) ? 4 : 2) | i;
        if (go0Var.m1958O(i2 & 1, (i2 & 3) != 2)) {
            AbstractC0179eu.m1446a(str, fg1.m1615G(rh1.f9587a, 0.0f, 0.0f, 0.0f, 8.0f, 7), new m13(((lp1) go0Var.m1988j(ur1.f11452a)).f6238f, rg3.m4450D(13), im0.f4681k, 0L, 0, rg3.m4450D(18), null, null, 16646136), 2, false, 2, 0, go0Var, (i2 & 14) | 1597488, 936);
        } else {
            go0Var.m1961R();
        }
        b62 b62VarM1996r = go0Var.m1996r();
        if (b62VarM1996r != null) {
            b62VarM1996r.f616d = new C0481n0(str, i, 8);
        }
    }

    /* JADX INFO: renamed from: b */
    public static final void m6313b(String str, String str2, boolean z, in0 in0Var, InterfaceC0596px interfaceC0596px, int i) {
        go0 go0Var = (go0) interfaceC0596px;
        go0Var.m1967X(2071487839);
        int i2 = i | (go0Var.m1980f(str) ? 4 : 2) | (go0Var.m1980f(str2) ? 32 : 16) | (go0Var.m1982g(z) ? 256 : 128) | (go0Var.m1984h(in0Var) ? 2048 : 1024);
        if (go0Var.m1958O(i2 & 1, (i2 & 1171) != 1170)) {
            C0402kw c0402kwM6126i0 = xe1.m6126i0(-1150593406, new C0704sr(i, in0Var, z), go0Var);
            int i3 = ((i2 & 7168) == 2048 ? 1 : 0) | ((i2 & 896) == 256 ? 1 : 0);
            Object objM1956L = go0Var.m1956L();
            if (i3 != 0 || objM1956L == C0520nx.f7360a) {
                objM1956L = new C0619qh(2, in0Var, z);
                go0Var.m1981f0(objM1956L);
            }
            sp0.m4940g(str, null, str2, null, null, c0402kwM6126i0, false, (xm0) objM1956L, null, go0Var, (i2 & 14) | 196608 | ((i2 << 3) & 896), 346);
        } else {
            go0Var.m1961R();
        }
        b62 b62VarM1996r = go0Var.m1996r();
        if (b62VarM1996r != null) {
            b62VarM1996r.f616d = new C0496nf(str, str2, z, in0Var, i);
        }
    }

    /* JADX INFO: renamed from: c */
    public static final void m6314c(final C0971zq c0971zq, final int i, final boolean z, final boolean z2, final xm0 xm0Var, final xm0 xm0Var2, final xm0 xm0Var3, final in0 in0Var, InterfaceC0596px interfaceC0596px, final int i2) {
        int i3;
        xm0 xm0Var4;
        int i4;
        int i5;
        int i6;
        go0 go0Var = (go0) interfaceC0596px;
        go0Var.m1967X(-1404878651);
        if ((i2 & 6) == 0) {
            i3 = ((i2 & 8) == 0 ? go0Var.m1980f(c0971zq) : go0Var.m1984h(c0971zq) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= go0Var.m1976d(i) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= go0Var.m1982g(z) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i3 |= go0Var.m1982g(z2) ? 2048 : 1024;
        }
        if ((i2 & 24576) == 0) {
            xm0Var4 = xm0Var;
            i3 |= go0Var.m1984h(xm0Var4) ? 16384 : 8192;
        } else {
            xm0Var4 = xm0Var;
        }
        if ((i2 & 196608) == 0) {
            i3 |= go0Var.m1984h(xm0Var2) ? 131072 : 65536;
        }
        if ((1572864 & i2) == 0) {
            i3 |= go0Var.m1984h(xm0Var3) ? 1048576 : 524288;
        }
        if ((12582912 & i2) == 0) {
            i3 |= go0Var.m1984h(in0Var) ? 8388608 : 4194304;
        }
        if (go0Var.m1958O(i3 & 1, (4793491 & i3) != 4793490)) {
            int iOrdinal = c0971zq.f14025d.ordinal();
            if (iOrdinal == 0) {
                i4 = R.string.chat_auto_reply_match_contains;
            } else if (iOrdinal == 1) {
                i4 = R.string.chat_auto_reply_match_exact;
            } else {
                if (iOrdinal != 2) {
                    c80.m675s();
                    return;
                }
                i4 = R.string.chat_auto_reply_match_regex;
            }
            String strM4462P = rg3.m4462P(i4, go0Var);
            int iOrdinal2 = c0971zq.f14030i.ordinal();
            if (iOrdinal2 == 0) {
                i5 = R.string.chat_auto_reply_type_text;
            } else if (iOrdinal2 == 1) {
                i5 = R.string.chat_auto_reply_type_image;
            } else {
                if (iOrdinal2 != 2) {
                    c80.m675s();
                    return;
                }
                i5 = R.string.chat_auto_reply_type_voice;
            }
            String strM4462P2 = rg3.m4462P(i5, go0Var);
            C0032av c0032avM6346a = AbstractC0938yu.m6346a(tp0.f10876c, C0700sn.f10233u, go0Var, 0);
            int iHashCode = Long.hashCode(go0Var.f3614T);
            yy1 yy1VarM1990l = go0Var.m1990l();
            uh1 uh1VarM5285M = AbstractC0738tl.m5285M(go0Var, rh1.f9587a);
            InterfaceC0293hx.f4166c.getClass();
            C0367jy c0367jy = C0256gx.f3727b;
            go0Var.m1969Z();
            if (go0Var.f3613S) {
                go0Var.m1989k(c0367jy);
            } else {
                go0Var.m1987i0();
            }
            yf3.m6268c(go0Var, C0256gx.f3730e, c0032avM6346a);
            yf3.m6268c(go0Var, C0256gx.f3729d, yy1VarM1990l);
            yf3.m6268c(go0Var, C0256gx.f3731f, Integer.valueOf(iHashCode));
            yf3.m6267b(go0Var, C0256gx.f3732g);
            yf3.m6268c(go0Var, C0256gx.f3728c, uh1VarM5285M);
            String strM4463Q = rg3.m4463Q(R.string.chat_auto_reply_task_position, new Object[]{Integer.valueOf(i + 1), c0971zq.f14023b}, go0Var);
            List list = c0971zq.f14026e;
            if (list == null || !list.isEmpty()) {
                Iterator it = list.iterator();
                i6 = 0;
                while (it.hasNext()) {
                    if (!pv2.m4006s0((String) it.next()) && (i6 = i6 + 1) < 0) {
                        AbstractC0179eu.m1445Z();
                        throw null;
                    }
                }
            } else {
                i6 = 0;
            }
            sp0.m4940g(strM4463Q, null, rg3.m4463Q(R.string.chat_auto_reply_task_summary, new Object[]{strM4462P, Integer.valueOf(i6), strM4462P2}, go0Var), null, null, xe1.m6126i0(1982639282, new C0016af(c0971zq, in0Var), go0Var), false, xm0Var4, null, go0Var, ((i3 << 9) & 29360128) | 196608, 346);
            go0Var = go0Var;
            uh1 uh1VarM1615G = fg1.m1615G(AbstractC0731te.f10693e, 14.0f, 0.0f, 14.0f, 8.0f, 2);
            ob2 ob2VarM3265a = nb2.m3265a(new C0884xf(8.0f, new C0676s(1)), C0700sn.f10231s, go0Var, 6);
            int iHashCode2 = Long.hashCode(go0Var.f3614T);
            yy1 yy1VarM1990l2 = go0Var.m1990l();
            uh1 uh1VarM5285M2 = AbstractC0738tl.m5285M(go0Var, uh1VarM1615G);
            InterfaceC0293hx.f4166c.getClass();
            C0367jy c0367jy2 = C0256gx.f3727b;
            go0Var.m1969Z();
            if (go0Var.f3613S) {
                go0Var.m1989k(c0367jy2);
            } else {
                go0Var.m1987i0();
            }
            yf3.m6268c(go0Var, C0256gx.f3730e, ob2VarM3265a);
            yf3.m6268c(go0Var, C0256gx.f3729d, yy1VarM1990l2);
            yf3.m6268c(go0Var, C0256gx.f3731f, Integer.valueOf(iHashCode2));
            yf3.m6267b(go0Var, C0256gx.f3732g);
            yf3.m6268c(go0Var, C0256gx.f3728c, uh1VarM5285M2);
            AbstractC0691se.m4847r(rg3.m4462P(R.string.chat_auto_reply_move_up, go0Var), xm0Var2, null, z, 0, go0Var, ((i3 >> 12) & 112) | ((i3 << 3) & 7168), 52);
            AbstractC0691se.m4847r(rg3.m4462P(R.string.chat_auto_reply_move_down, go0Var), xm0Var3, null, z2, 0, go0Var, ((i3 >> 15) & 112) | (i3 & 7168), 52);
            go0Var.m1994p(true);
            go0Var.m1994p(true);
        } else {
            go0Var.m1961R();
        }
        b62 b62VarM1996r = go0Var.m1996r();
        if (b62VarM1996r != null) {
            b62VarM1996r.f616d = new mn0() { // from class: qr
                @Override // p000.mn0
                /* JADX INFO: renamed from: g */
                public final Object mo12g(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    AbstractC0933yr.m6314c(c0971zq, i, z, z2, xm0Var, xm0Var2, xm0Var3, in0Var, (InterfaceC0596px) obj, pp0.m3902N(i2 | 1));
                    return a83.f116a;
                }
            };
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:65:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0135  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x014c  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0168  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x018c A[ORIG_RETURN, RETURN] */
    /* JADX INFO: renamed from: d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m6315d(final C0103cr c0103cr, final xm0 xm0Var, final in0 in0Var, InterfaceC0596px interfaceC0596px, final int i) {
        int i2;
        b62 b62VarM1996r;
        mn0 mn0Var;
        boolean z;
        Object objM1956L;
        boolean zM1980f;
        Object objM1956L2;
        boolean zM1980f2;
        Object objM1956L3;
        go0 go0Var = (go0) interfaceC0596px;
        go0Var.m1967X(-846333232);
        int i3 = 2;
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? go0Var.m1980f(c0103cr) : go0Var.m1984h(c0103cr) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= go0Var.m1984h(xm0Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= go0Var.m1984h(in0Var) ? 256 : 128;
        }
        int i4 = 0;
        if (go0Var.m1958O(i2 & 1, (i2 & 147) != 146)) {
            boolean z2 = (i2 & 14) == 4 || ((i2 & 8) != 0 && go0Var.m1980f(c0103cr));
            Object objM1956L4 = go0Var.m1956L();
            C0160eb c0160eb = C0520nx.f7360a;
            if (z2 || objM1956L4 == c0160eb) {
                objM1956L4 = op0.m3598u(c0103cr.f1692a);
                go0Var.m1981f0(objM1956L4);
            }
            xk1 xk1Var = (xk1) objM1956L4;
            Object objM1956L5 = go0Var.m1956L();
            if (objM1956L5 == c0160eb) {
                objM1956L5 = op0.m3598u(null);
                go0Var.m1981f0(objM1956L5);
            }
            xk1 xk1Var2 = (xk1) objM1956L5;
            String strM4462P = rg3.m4462P(R.string.chat_auto_reply_default_task_name, go0Var);
            C0971zq c0971zq = (C0971zq) xk1Var2.getValue();
            if (c0971zq != null) {
                go0Var.m1966W(-1654831290);
                List list = (List) xk1Var.getValue();
                if (list == null || !list.isEmpty()) {
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        if (t11.m5086l(((C0971zq) it.next()).f14022a, c0971zq.f14022a)) {
                            z = false;
                            break;
                        }
                    }
                    z = true;
                    objM1956L = go0Var.m1956L();
                    if (objM1956L == c0160eb) {
                        objM1956L = new C0186f0(xk1Var2, 17);
                        go0Var.m1981f0(objM1956L);
                    }
                    xm0 xm0Var2 = (xm0) objM1956L;
                    zM1980f = go0Var.m1980f(xk1Var) | go0Var.m1984h(c0971zq);
                    objM1956L2 = go0Var.m1956L();
                    if (!zM1980f || objM1956L2 == c0160eb) {
                        objM1956L2 = new C0678s1(xk1Var, c0971zq, xk1Var2);
                        go0Var.m1981f0(objM1956L2);
                    }
                    xm0 xm0Var3 = (xm0) objM1956L2;
                    zM1980f2 = go0Var.m1980f(xk1Var);
                    objM1956L3 = go0Var.m1956L();
                    if (!zM1980f2 || objM1956L3 == c0160eb) {
                        objM1956L3 = new C0297i0(xk1Var, xk1Var2, 3);
                        go0Var.m1981f0(objM1956L3);
                    }
                    m6316e(c0971zq, z, xm0Var2, xm0Var3, (in0) objM1956L3, go0Var, 384);
                    go0Var.m1994p(false);
                    b62VarM1996r = go0Var.m1996r();
                    if (b62VarM1996r != null) {
                        return;
                    }
                    final int i5 = 0;
                    mn0Var = new mn0() { // from class: rr
                        @Override // p000.mn0
                        /* JADX INFO: renamed from: g */
                        public final Object mo12g(Object obj, Object obj2) {
                            int i6 = i5;
                            a83 a83Var = a83.f116a;
                            int i7 = i;
                            in0 in0Var2 = in0Var;
                            xm0 xm0Var4 = xm0Var;
                            C0103cr c0103cr2 = c0103cr;
                            InterfaceC0596px interfaceC0596px2 = (InterfaceC0596px) obj;
                            ((Integer) obj2).getClass();
                            switch (i6) {
                                case 0:
                                    AbstractC0933yr.m6315d(c0103cr2, xm0Var4, in0Var2, interfaceC0596px2, pp0.m3902N(i7 | 1));
                                    break;
                                default:
                                    AbstractC0933yr.m6315d(c0103cr2, xm0Var4, in0Var2, interfaceC0596px2, pp0.m3902N(i7 | 1));
                                    break;
                            }
                            return a83Var;
                        }
                    };
                } else {
                    z = true;
                    objM1956L = go0Var.m1956L();
                    if (objM1956L == c0160eb) {
                    }
                    xm0 xm0Var22 = (xm0) objM1956L;
                    zM1980f = go0Var.m1980f(xk1Var) | go0Var.m1984h(c0971zq);
                    objM1956L2 = go0Var.m1956L();
                    if (!zM1980f) {
                        objM1956L2 = new C0678s1(xk1Var, c0971zq, xk1Var2);
                        go0Var.m1981f0(objM1956L2);
                        xm0 xm0Var32 = (xm0) objM1956L2;
                        zM1980f2 = go0Var.m1980f(xk1Var);
                        objM1956L3 = go0Var.m1956L();
                        if (!zM1980f2) {
                            objM1956L3 = new C0297i0(xk1Var, xk1Var2, 3);
                            go0Var.m1981f0(objM1956L3);
                            m6316e(c0971zq, z, xm0Var22, xm0Var32, (in0) objM1956L3, go0Var, 384);
                            go0Var.m1994p(false);
                            b62VarM1996r = go0Var.m1996r();
                            if (b62VarM1996r != null) {
                            }
                        }
                    }
                }
                b62VarM1996r.f616d = mn0Var;
            }
            go0Var.m1966W(-1654831291);
            go0Var.m1994p(false);
            qp0.m4249d(true, xm0Var, null, rg3.m4462P(R.string.chat_auto_reply_config_title, go0Var), null, xe1.m6126i0(244085523, new C0313ih(xm0Var, in0Var, xk1Var, i3), go0Var), xe1.m6126i0(-1644292868, new C0746tr(strM4462P, xk1Var, xk1Var2, i4), go0Var), go0Var, (i2 & 112) | 1769478, 20);
            go0Var = go0Var;
        } else {
            go0Var.m1961R();
        }
        b62VarM1996r = go0Var.m1996r();
        if (b62VarM1996r != null) {
            final int i6 = 1;
            mn0Var = new mn0() { // from class: rr
                @Override // p000.mn0
                /* JADX INFO: renamed from: g */
                public final Object mo12g(Object obj, Object obj2) {
                    int i62 = i6;
                    a83 a83Var = a83.f116a;
                    int i7 = i;
                    in0 in0Var2 = in0Var;
                    xm0 xm0Var4 = xm0Var;
                    C0103cr c0103cr2 = c0103cr;
                    InterfaceC0596px interfaceC0596px2 = (InterfaceC0596px) obj;
                    ((Integer) obj2).getClass();
                    switch (i62) {
                        case 0:
                            AbstractC0933yr.m6315d(c0103cr2, xm0Var4, in0Var2, interfaceC0596px2, pp0.m3902N(i7 | 1));
                            break;
                        default:
                            AbstractC0933yr.m6315d(c0103cr2, xm0Var4, in0Var2, interfaceC0596px2, pp0.m3902N(i7 | 1));
                            break;
                    }
                    return a83Var;
                }
            };
            b62VarM1996r.f616d = mn0Var;
        }
    }

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
    /* JADX INFO: renamed from: e */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m6316e(final C0971zq c0971zq, final boolean z, final xm0 xm0Var, final xm0 xm0Var2, final in0 in0Var, InterfaceC0596px interfaceC0596px, final int i) {
        b62 b62VarM1996r;
        mn0 mn0Var;
        xk1 xk1Var;
        Object objM3598u;
        ?? arrayList;
        Collection collectionM1434O;
        Integer num;
        final boolean z2;
        boolean z3;
        Object x92Var;
        go0 go0Var = (go0) interfaceC0596px;
        go0Var.m1967X(-1743486316);
        int i2 = (go0Var.m1984h(in0Var) ? 16384 : 8192) | i | (go0Var.m1980f(c0971zq) ? 4 : 2) | (go0Var.m1982g(z) ? 32 : 16) | (go0Var.m1984h(xm0Var2) ? 2048 : 1024);
        if (go0Var.m1958O(i2 & 1, (i2 & 9363) != 9362)) {
            int i3 = i2 & 14;
            boolean z4 = i3 == 4;
            Object objM1956L = go0Var.m1956L();
            C0160eb c0160eb = C0520nx.f7360a;
            if (z4 || objM1956L == c0160eb) {
                objM1956L = op0.m3598u(c0971zq.f14023b);
                go0Var.m1981f0(objM1956L);
            }
            final xk1 xk1Var2 = (xk1) objM1956L;
            boolean z5 = i3 == 4;
            Object objM1956L2 = go0Var.m1956L();
            if (z5 || objM1956L2 == c0160eb) {
                objM1956L2 = op0.m3598u(Boolean.valueOf(c0971zq.f14024c));
                go0Var.m1981f0(objM1956L2);
            }
            final xk1 xk1Var3 = (xk1) objM1956L2;
            boolean z6 = i3 == 4;
            Object objM1956L3 = go0Var.m1956L();
            if (z6 || objM1956L3 == c0160eb) {
                objM1956L3 = op0.m3598u(c0971zq.f14025d);
                go0Var.m1981f0(objM1956L3);
            }
            final xk1 xk1Var4 = (xk1) objM1956L3;
            boolean z7 = i3 == 4;
            Object objM1956L4 = go0Var.m1956L();
            if (z7 || objM1956L4 == c0160eb) {
                objM1956L4 = op0.m3598u(AbstractC0142du.m1165u0(c0971zq.f14026e, "\n", null, null, null, 62));
                go0Var.m1981f0(objM1956L4);
            }
            final xk1 xk1Var5 = (xk1) objM1956L4;
            boolean z8 = i3 == 4;
            Object objM1956L5 = go0Var.m1956L();
            if (z8 || objM1956L5 == c0160eb) {
                objM1956L5 = op0.m3598u(Boolean.valueOf(c0971zq.f14027f));
                go0Var.m1981f0(objM1956L5);
            }
            final xk1 xk1Var6 = (xk1) objM1956L5;
            boolean z9 = i3 == 4;
            Object objM1956L6 = go0Var.m1956L();
            if (z9 || objM1956L6 == c0160eb) {
                objM1956L6 = op0.m3598u(c0971zq.f14028g);
                go0Var.m1981f0(objM1956L6);
            }
            final xk1 xk1Var7 = (xk1) objM1956L6;
            boolean z10 = i3 == 4;
            Object objM1956L7 = go0Var.m1956L();
            if (z10 || objM1956L7 == c0160eb) {
                objM1956L7 = op0.m3598u(c0971zq.f14029h);
                go0Var.m1981f0(objM1956L7);
            }
            final xk1 xk1Var8 = (xk1) objM1956L7;
            boolean z11 = i3 == 4;
            Object objM1956L8 = go0Var.m1956L();
            if (z11 || objM1956L8 == c0160eb) {
                objM1956L8 = op0.m3598u(c0971zq.f14030i);
                go0Var.m1981f0(objM1956L8);
            }
            xk1 xk1Var9 = (xk1) objM1956L8;
            boolean z12 = i3 == 4;
            Object objM1956L9 = go0Var.m1956L();
            if (z12 || objM1956L9 == c0160eb) {
                objM1956L9 = op0.m3598u(c0971zq.f14031j);
                go0Var.m1981f0(objM1956L9);
            }
            final xk1 xk1Var10 = (xk1) objM1956L9;
            boolean z13 = i3 == 4;
            Object objM1956L10 = go0Var.m1956L();
            if (z13 || objM1956L10 == c0160eb) {
                objM1956L10 = op0.m3598u(String.valueOf(c0971zq.f14032k));
                go0Var.m1981f0(objM1956L10);
            }
            final xk1 xk1Var11 = (xk1) objM1956L10;
            boolean z14 = i3 == 4;
            Object objM1956L11 = go0Var.m1956L();
            if (z14 || objM1956L11 == c0160eb) {
                xk1Var = xk1Var9;
                objM3598u = op0.m3598u(String.valueOf(c0971zq.f14033l));
                go0Var.m1981f0(objM3598u);
            } else {
                objM3598u = objM1956L11;
                xk1Var = xk1Var9;
            }
            final xk1 xk1Var12 = (xk1) objM3598u;
            boolean z15 = i3 == 4;
            Object objM1956L12 = go0Var.m1956L();
            if (z15 || objM1956L12 == c0160eb) {
                objM1956L12 = op0.m3598u(String.valueOf(c0971zq.f14034m));
                go0Var.m1981f0(objM1956L12);
            }
            final xk1 xk1Var13 = (xk1) objM1956L12;
            boolean z16 = i3 == 4;
            Object objM1956L13 = go0Var.m1956L();
            if (z16 || objM1956L13 == c0160eb) {
                objM1956L13 = op0.m3598u(Boolean.valueOf(c0971zq.f14035n));
                go0Var.m1981f0(objM1956L13);
            }
            final xk1 xk1Var14 = (xk1) objM1956L13;
            Object objM1956L14 = go0Var.m1956L();
            if (objM1956L14 == c0160eb) {
                objM1956L14 = op0.m3598u(Boolean.FALSE);
                go0Var.m1981f0(objM1956L14);
            }
            final xk1 xk1Var15 = (xk1) objM1956L14;
            Object objM1956L15 = go0Var.m1956L();
            if (objM1956L15 == c0160eb) {
                objM1956L15 = op0.m3598u(Boolean.FALSE);
                go0Var.m1981f0(objM1956L15);
            }
            final xk1 xk1Var16 = (xk1) objM1956L15;
            String str = (String) xk1Var5.getValue();
            str.getClass();
            final xk1 xk1Var17 = xk1Var;
            C0497ng c0497ng = new C0497ng(3, str);
            Object objM1956L16 = go0Var.m1956L();
            if (objM1956L16 == c0160eb) {
                objM1956L16 = C0857wr.f12619o;
                go0Var.m1981f0(objM1956L16);
            }
            in0 in0Var2 = (in0) ((yn0) objM1956L16);
            in0Var2.getClass();
            bj0 bj0Var = new bj0(c0497ng, in0Var2, 1);
            Object objM1956L17 = go0Var.m1956L();
            if (objM1956L17 == c0160eb) {
                objM1956L17 = C0896xr.f13141o;
                go0Var.m1981f0(objM1956L17);
            }
            in0 in0Var3 = (in0) ((yn0) objM1956L17);
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
                    Integer numM6013e0 = wv2.m6013e0((String) xk1Var11.getValue());
                    final Long lM6014f0 = wv2.m6014f0((String) xk1Var12.getValue());
                    final Long lM6014f02 = wv2.m6014f0((String) xk1Var13.getValue());
                    final ?? r29 = arrayList;
                    Object obj = null;
                    if (((EnumC0250gr) xk1Var4.getValue()) != EnumC0250gr.f3672k) {
                        Set setM5065Q = ((Boolean) xk1Var6.getValue()).booleanValue() ? t11.m5065Q(p72.IGNORE_CASE) : fe0.f2918h;
                        Iterator it = r29.iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                num = numM6013e0;
                                break;
                            }
                            Object next2 = it.next();
                            num = numM6013e0;
                            try {
                                x92Var = new o72((String) next2, setM5065Q);
                            } catch (Throwable th) {
                                x92Var = new x92(th);
                            }
                            if (x92Var instanceof x92) {
                                obj = next2;
                                break;
                            }
                            numM6013e0 = num;
                        }
                        obj = (String) obj;
                    } else {
                        num = numM6013e0;
                    }
                    if (!pv2.m4006s0((String) xk1Var2.getValue()) || r29.isEmpty() || obj != null || pv2.m4006s0((String) xk1Var10.getValue()) || lM6014f0 == null) {
                        z2 = false;
                        if (((Boolean) xk1Var15.getValue()).booleanValue()) {
                            go0Var.m1966W(-1158748893);
                            String strM4462P = rg3.m4462P(((EnumC0176er) xk1Var7.getValue()) == EnumC0176er.f2564j ? R.string.chat_auto_reply_select_whitelist_title : R.string.chat_auto_reply_select_blacklist_title, go0Var);
                            Set set = (Set) xk1Var8.getValue();
                            Object objM1956L18 = go0Var.m1956L();
                            if (objM1956L18 == c0160eb) {
                                objM1956L18 = new C0186f0(xk1Var15, 21);
                                go0Var.m1981f0(objM1956L18);
                            }
                            xm0 xm0Var3 = (xm0) objM1956L18;
                            boolean zM1980f = go0Var.m1980f(xk1Var8);
                            Object objM1956L19 = go0Var.m1956L();
                            if (zM1980f || objM1956L19 == c0160eb) {
                                objM1956L19 = new C0297i0(xk1Var8, xk1Var15, 2);
                                go0Var.m1981f0(objM1956L19);
                            }
                            AbstractC0691se.m4850u(strM4462P, set, false, xm0Var3, (in0) objM1956L19, go0Var, 3456);
                            go0Var.m1994p(false);
                            b62VarM1996r = go0Var.m1996r();
                            if (b62VarM1996r == null) {
                                return;
                            }
                            final int i4 = 0;
                            mn0Var = new mn0(c0971zq, z, xm0Var, xm0Var2, in0Var, i, i4) { // from class: kr

                                /* JADX INFO: renamed from: h */
                                public final /* synthetic */ int f5725h;

                                /* JADX INFO: renamed from: i */
                                public final /* synthetic */ C0971zq f5726i;

                                /* JADX INFO: renamed from: j */
                                public final /* synthetic */ boolean f5727j;

                                /* JADX INFO: renamed from: k */
                                public final /* synthetic */ xm0 f5728k;

                                /* JADX INFO: renamed from: l */
                                public final /* synthetic */ xm0 f5729l;

                                /* JADX INFO: renamed from: m */
                                public final /* synthetic */ in0 f5730m;

                                {
                                    this.f5725h = i4;
                                }

                                @Override // p000.mn0
                                /* JADX INFO: renamed from: g */
                                public final Object mo12g(Object obj2, Object obj3) {
                                    int i5 = this.f5725h;
                                    a83 a83Var = a83.f116a;
                                    switch (i5) {
                                        case 0:
                                            ((Integer) obj3).getClass();
                                            int iM3902N = pp0.m3902N(385);
                                            AbstractC0933yr.m6316e(this.f5726i, this.f5727j, this.f5728k, this.f5729l, this.f5730m, (InterfaceC0596px) obj2, iM3902N);
                                            break;
                                        case 1:
                                            ((Integer) obj3).getClass();
                                            int iM3902N2 = pp0.m3902N(385);
                                            AbstractC0933yr.m6316e(this.f5726i, this.f5727j, this.f5728k, this.f5729l, this.f5730m, (InterfaceC0596px) obj2, iM3902N2);
                                            break;
                                        default:
                                            ((Integer) obj3).getClass();
                                            int iM3902N3 = pp0.m3902N(385);
                                            AbstractC0933yr.m6316e(this.f5726i, this.f5727j, this.f5728k, this.f5729l, this.f5730m, (InterfaceC0596px) obj2, iM3902N3);
                                            break;
                                    }
                                    return a83Var;
                                }
                            };
                        } else {
                            go0Var.m1966W(-1158123282);
                            go0Var.m1994p(false);
                            if (((Boolean) xk1Var16.getValue()).booleanValue()) {
                                go0Var.m1966W(-1158074302);
                                String strM4462P2 = rg3.m4462P(R.string.chat_auto_reply_delete_task_title, go0Var);
                                String strM4463Q = rg3.m4463Q(R.string.chat_auto_reply_delete_task_message, new Object[]{(String) xk1Var2.getValue()}, go0Var);
                                String strM4462P3 = rg3.m4462P(R.string.chat_auto_reply_delete_task, go0Var);
                                String strM4462P4 = rg3.m4462P(R.string.home_settings_cancel, go0Var);
                                Object objM1956L20 = go0Var.m1956L();
                                if (objM1956L20 == c0160eb) {
                                    objM1956L20 = new C0186f0(xk1Var16, 18);
                                    go0Var.m1981f0(objM1956L20);
                                }
                                qp0.m4248c((xm0) objM1956L20, strM4462P2, strM4463Q, strM4462P3, xm0Var2, null, strM4462P4, null, go0Var, (57344 & (i2 << 3)) | 6, 160);
                                go0Var.m1994p(false);
                                b62VarM1996r = go0Var.m1996r();
                                if (b62VarM1996r == null) {
                                    return;
                                }
                                final int i5 = 1;
                                mn0Var = new mn0(c0971zq, z, xm0Var, xm0Var2, in0Var, i, i5) { // from class: kr

                                    /* JADX INFO: renamed from: h */
                                    public final /* synthetic */ int f5725h;

                                    /* JADX INFO: renamed from: i */
                                    public final /* synthetic */ C0971zq f5726i;

                                    /* JADX INFO: renamed from: j */
                                    public final /* synthetic */ boolean f5727j;

                                    /* JADX INFO: renamed from: k */
                                    public final /* synthetic */ xm0 f5728k;

                                    /* JADX INFO: renamed from: l */
                                    public final /* synthetic */ xm0 f5729l;

                                    /* JADX INFO: renamed from: m */
                                    public final /* synthetic */ in0 f5730m;

                                    {
                                        this.f5725h = i5;
                                    }

                                    @Override // p000.mn0
                                    /* JADX INFO: renamed from: g */
                                    public final Object mo12g(Object obj2, Object obj3) {
                                        int i52 = this.f5725h;
                                        a83 a83Var = a83.f116a;
                                        switch (i52) {
                                            case 0:
                                                ((Integer) obj3).getClass();
                                                int iM3902N = pp0.m3902N(385);
                                                AbstractC0933yr.m6316e(this.f5726i, this.f5727j, this.f5728k, this.f5729l, this.f5730m, (InterfaceC0596px) obj2, iM3902N);
                                                break;
                                            case 1:
                                                ((Integer) obj3).getClass();
                                                int iM3902N2 = pp0.m3902N(385);
                                                AbstractC0933yr.m6316e(this.f5726i, this.f5727j, this.f5728k, this.f5729l, this.f5730m, (InterfaceC0596px) obj2, iM3902N2);
                                                break;
                                            default:
                                                ((Integer) obj3).getClass();
                                                int iM3902N3 = pp0.m3902N(385);
                                                AbstractC0933yr.m6316e(this.f5726i, this.f5727j, this.f5728k, this.f5729l, this.f5730m, (InterfaceC0596px) obj2, iM3902N3);
                                                break;
                                        }
                                        return a83Var;
                                    }
                                };
                            } else {
                                go0Var.m1966W(-1157601490);
                                go0Var.m1994p(false);
                                final String strM4462P5 = rg3.m4462P(R.string.chat_auto_reply_match_contains, go0Var);
                                final String strM4462P6 = rg3.m4462P(R.string.chat_auto_reply_match_exact, go0Var);
                                final String strM4462P7 = rg3.m4462P(R.string.chat_auto_reply_match_regex, go0Var);
                                final String strM4462P8 = rg3.m4462P(R.string.chat_auto_reply_list_blacklist, go0Var);
                                final String strM4462P9 = rg3.m4462P(R.string.chat_auto_reply_list_whitelist, go0Var);
                                final String strM4462P10 = rg3.m4462P(R.string.chat_auto_reply_type_text, go0Var);
                                final String strM4462P11 = rg3.m4462P(R.string.chat_auto_reply_type_image, go0Var);
                                final String strM4462P12 = rg3.m4462P(R.string.chat_auto_reply_type_voice, go0Var);
                                String strM4462P13 = rg3.m4462P(z ? R.string.chat_auto_reply_add_task : R.string.chat_auto_reply_edit_task, go0Var);
                                final Integer num2 = num;
                                C0402kw c0402kwM6126i0 = xe1.m6126i0(594128471, new nn0() { // from class: lr
                                    @Override // p000.nn0
                                    /* JADX INFO: renamed from: e */
                                    public final Object mo489e(Object obj2, Object obj3, Object obj4) {
                                        pb2 pb2Var = (pb2) obj2;
                                        InterfaceC0596px interfaceC0596px2 = (InterfaceC0596px) obj3;
                                        int iIntValue = ((Integer) obj4).intValue();
                                        pb2Var.getClass();
                                        if ((iIntValue & 6) == 0) {
                                            iIntValue |= ((go0) interfaceC0596px2).m1980f(pb2Var) ? 4 : 2;
                                        }
                                        go0 go0Var2 = (go0) interfaceC0596px2;
                                        if (go0Var2.m1958O(iIntValue & 1, (iIntValue & 19) != 18)) {
                                            AbstractC0691se.m4847r(rg3.m4462P(R.string.home_settings_cancel, go0Var2), xm0Var, pb2.m3843a(pb2Var), false, 0, go0Var2, 0, 56);
                                            String strM4462P14 = rg3.m4462P(R.string.home_settings_save, go0Var2);
                                            uh1 uh1VarM3843a = pb2.m3843a(pb2Var);
                                            final Long l = lM6014f0;
                                            boolean zM1980f2 = go0Var2.m1980f(l);
                                            final Long l2 = lM6014f02;
                                            boolean zM1980f3 = zM1980f2 | go0Var2.m1980f(l2);
                                            final in0 in0Var4 = in0Var;
                                            boolean zM1980f4 = zM1980f3 | go0Var2.m1980f(in0Var4);
                                            final C0971zq c0971zq2 = c0971zq;
                                            boolean zM1984h = zM1980f4 | go0Var2.m1984h(c0971zq2);
                                            final xk1 xk1Var18 = xk1Var2;
                                            boolean zM1980f5 = zM1984h | go0Var2.m1980f(xk1Var18);
                                            final xk1 xk1Var19 = xk1Var3;
                                            boolean zM1980f6 = zM1980f5 | go0Var2.m1980f(xk1Var19);
                                            final xk1 xk1Var20 = xk1Var4;
                                            boolean zM1980f7 = zM1980f6 | go0Var2.m1980f(xk1Var20);
                                            final List list = r29;
                                            boolean zM1984h2 = zM1980f7 | go0Var2.m1984h(list);
                                            final xk1 xk1Var21 = xk1Var6;
                                            boolean zM1980f8 = zM1984h2 | go0Var2.m1980f(xk1Var21);
                                            final xk1 xk1Var22 = xk1Var7;
                                            boolean zM1980f9 = zM1980f8 | go0Var2.m1980f(xk1Var22);
                                            final xk1 xk1Var23 = xk1Var8;
                                            boolean zM1980f10 = zM1980f9 | go0Var2.m1980f(xk1Var23);
                                            final xk1 xk1Var24 = xk1Var17;
                                            boolean zM1980f11 = zM1980f10 | go0Var2.m1980f(xk1Var24);
                                            final xk1 xk1Var25 = xk1Var10;
                                            boolean zM1980f12 = zM1980f11 | go0Var2.m1980f(xk1Var25);
                                            final Integer num3 = num2;
                                            boolean zM1980f13 = zM1980f12 | go0Var2.m1980f(num3);
                                            final xk1 xk1Var26 = xk1Var14;
                                            boolean zM1980f14 = zM1980f13 | go0Var2.m1980f(xk1Var26);
                                            Object objM1956L21 = go0Var2.m1956L();
                                            if (zM1980f14 || objM1956L21 == C0520nx.f7360a) {
                                                xm0 xm0Var4 = new xm0() { // from class: nr
                                                    @Override // p000.xm0
                                                    /* JADX INFO: renamed from: a */
                                                    public final Object mo6a() {
                                                        Long l3 = l;
                                                        a83 a83Var = a83.f116a;
                                                        if (l3 != null) {
                                                            long jLongValue = l3.longValue();
                                                            Long l4 = l2;
                                                            if (l4 != null) {
                                                                long jLongValue2 = l4.longValue();
                                                                String string = pv2.m3993I0((String) xk1Var18.getValue()).toString();
                                                                boolean zBooleanValue = ((Boolean) xk1Var19.getValue()).booleanValue();
                                                                EnumC0250gr enumC0250gr = (EnumC0250gr) xk1Var20.getValue();
                                                                boolean zBooleanValue2 = ((Boolean) xk1Var21.getValue()).booleanValue();
                                                                EnumC0176er enumC0176er = (EnumC0176er) xk1Var22.getValue();
                                                                Set set2 = (Set) xk1Var23.getValue();
                                                                EnumC0323ir enumC0323ir = (EnumC0323ir) xk1Var24.getValue();
                                                                String string2 = pv2.m3993I0((String) xk1Var25.getValue()).toString();
                                                                Integer num4 = num3;
                                                                in0Var4.mo5j(C0971zq.m6480a(c0971zq2, string, zBooleanValue, enumC0250gr, list, zBooleanValue2, enumC0176er, set2, enumC0323ir, string2, num4 != null ? num4.intValue() : 1000, jLongValue, jLongValue2, ((Boolean) xk1Var26.getValue()).booleanValue(), 1));
                                                            }
                                                        }
                                                        return a83Var;
                                                    }
                                                };
                                                go0Var2.m1981f0(xm0Var4);
                                                objM1956L21 = xm0Var4;
                                            }
                                            AbstractC0691se.m4846q(strM4462P14, (xm0) objM1956L21, uh1VarM3843a, z2, 0, go0Var2, 0, 48);
                                        } else {
                                            go0Var2.m1961R();
                                        }
                                        return a83.f116a;
                                    }
                                }, go0Var);
                                final ?? r8 = obj;
                                qp0.m4249d(true, xm0Var, null, strM4462P13, null, c0402kwM6126i0, xe1.m6126i0(-1917666624, new nn0() { // from class: mr
                                    @Override // p000.nn0
                                    /* JADX INFO: renamed from: e */
                                    public final Object mo489e(Object obj2, Object obj3, Object obj4) {
                                        float f;
                                        int i6;
                                        int i7;
                                        int i8;
                                        InterfaceC0596px interfaceC0596px2 = (InterfaceC0596px) obj3;
                                        int iIntValue = ((Integer) obj4).intValue();
                                        ((C0069bv) obj2).getClass();
                                        final int i9 = 1;
                                        go0 go0Var2 = (go0) interfaceC0596px2;
                                        if (go0Var2.m1958O(iIntValue & 1, (iIntValue & 17) != 16)) {
                                            rh1 rh1Var = rh1.f9587a;
                                            uh1 uh1VarM1882b0 = gf1.m1882b0(AbstractC0731te.m5187P(rh1Var, 0.0f, 540.0f, 1), gf1.m1868P(go0Var2));
                                            C0032av c0032avM6346a = AbstractC0938yu.m6346a(tp0.f10876c, C0700sn.f10233u, go0Var2, 0);
                                            int iHashCode = Long.hashCode(go0Var2.f3614T);
                                            yy1 yy1VarM1990l = go0Var2.m1990l();
                                            uh1 uh1VarM5285M = AbstractC0738tl.m5285M(go0Var2, uh1VarM1882b0);
                                            InterfaceC0293hx.f4166c.getClass();
                                            C0367jy c0367jy = C0256gx.f3727b;
                                            go0Var2.m1969Z();
                                            if (go0Var2.f3613S) {
                                                go0Var2.m1989k(c0367jy);
                                            } else {
                                                go0Var2.m1987i0();
                                            }
                                            yf3.m6268c(go0Var2, C0256gx.f3730e, c0032avM6346a);
                                            yf3.m6268c(go0Var2, C0256gx.f3729d, yy1VarM1990l);
                                            yf3.m6268c(go0Var2, C0256gx.f3731f, Integer.valueOf(iHashCode));
                                            yf3.m6267b(go0Var2, C0256gx.f3732g);
                                            yf3.m6268c(go0Var2, C0256gx.f3728c, uh1VarM5285M);
                                            AbstractC0933yr.m6312a(rg3.m4462P(R.string.chat_auto_reply_task_name, go0Var2), go0Var2, 0);
                                            xk1 xk1Var18 = xk1Var2;
                                            String str2 = (String) xk1Var18.getValue();
                                            boolean zM1980f2 = go0Var2.m1980f(xk1Var18);
                                            Object objM1956L21 = go0Var2.m1956L();
                                            C0160eb c0160eb2 = C0520nx.f7360a;
                                            if (zM1980f2 || objM1956L21 == c0160eb2) {
                                                objM1956L21 = new C0260h0(xk1Var18, 26);
                                                go0Var2.m1981f0(objM1956L21);
                                            }
                                            tp0.m5357b(str2, (in0) objM1956L21, null, rg3.m4462P(R.string.chat_auto_reply_task_name_hint, go0Var2), null, null, false, 0, 0, false, false, null, null, null, go0Var2, 0, 0, 16372);
                                            String strM5687f = vi0.m5687f(rh1Var, 12.0f, go0Var2, R.string.chat_auto_reply_task_enabled, go0Var2);
                                            String strM4462P14 = rg3.m4462P(R.string.chat_auto_reply_task_enabled_description, go0Var2);
                                            xk1 xk1Var19 = xk1Var3;
                                            boolean zBooleanValue = ((Boolean) xk1Var19.getValue()).booleanValue();
                                            boolean zM1980f3 = go0Var2.m1980f(xk1Var19);
                                            Object objM1956L22 = go0Var2.m1956L();
                                            if (zM1980f3 || objM1956L22 == c0160eb2) {
                                                objM1956L22 = new C0590pr(xk1Var19, 2);
                                                go0Var2.m1981f0(objM1956L22);
                                            }
                                            AbstractC0933yr.m6313b(strM5687f, strM4462P14, zBooleanValue, (in0) objM1956L22, go0Var2, 0);
                                            String strM5687f2 = vi0.m5687f(rh1Var, 8.0f, go0Var2, R.string.chat_auto_reply_match_mode, go0Var2);
                                            String strM4462P15 = rg3.m4462P(R.string.chat_auto_reply_match_mode_description, go0Var2);
                                            yf0 yf0Var = EnumC0250gr.f3674m;
                                            xk1 xk1Var20 = xk1Var4;
                                            EnumC0250gr enumC0250gr = (EnumC0250gr) xk1Var20.getValue();
                                            boolean zM1980f4 = go0Var2.m1980f(xk1Var20);
                                            Object objM1956L23 = go0Var2.m1956L();
                                            if (zM1980f4 || objM1956L23 == c0160eb2) {
                                                objM1956L23 = new C0590pr(xk1Var20, 3);
                                                go0Var2.m1981f0(objM1956L23);
                                            }
                                            in0 in0Var4 = (in0) objM1956L23;
                                            final String str3 = strM4462P5;
                                            boolean zM1980f5 = go0Var2.m1980f(str3);
                                            final String str4 = strM4462P6;
                                            boolean zM1980f6 = zM1980f5 | go0Var2.m1980f(str4);
                                            final String str5 = strM4462P7;
                                            boolean zM1980f7 = zM1980f6 | go0Var2.m1980f(str5);
                                            Object objM1956L24 = go0Var2.m1956L();
                                            if (zM1980f7 || objM1956L24 == c0160eb2) {
                                                objM1956L24 = new in0() { // from class: or
                                                    @Override // p000.in0
                                                    /* JADX INFO: renamed from: j */
                                                    public final Object mo5j(Object obj5) {
                                                        int i10 = i9;
                                                        String str6 = str5;
                                                        String str7 = str4;
                                                        String str8 = str3;
                                                        switch (i10) {
                                                            case 0:
                                                                EnumC0323ir enumC0323ir = (EnumC0323ir) obj5;
                                                                enumC0323ir.getClass();
                                                                int iOrdinal = enumC0323ir.ordinal();
                                                                if (iOrdinal != 0) {
                                                                    if (iOrdinal != 1) {
                                                                        if (iOrdinal != 2) {
                                                                            c80.m675s();
                                                                        }
                                                                    }
                                                                }
                                                                break;
                                                            default:
                                                                EnumC0250gr enumC0250gr2 = (EnumC0250gr) obj5;
                                                                enumC0250gr2.getClass();
                                                                int iOrdinal2 = enumC0250gr2.ordinal();
                                                                if (iOrdinal2 != 0) {
                                                                    if (iOrdinal2 != 1) {
                                                                        if (iOrdinal2 != 2) {
                                                                            c80.m675s();
                                                                        }
                                                                    }
                                                                }
                                                                break;
                                                        }
                                                        return str8;
                                                    }
                                                };
                                                go0Var2.m1981f0(objM1956L24);
                                            }
                                            AbstractC0179eu.m1463m(strM5687f2, yf0Var, enumC0250gr, in0Var4, null, strM4462P15, (in0) objM1956L24, false, go0Var2, 0);
                                            AbstractC0933yr.m6312a(vi0.m5687f(rh1Var, 12.0f, go0Var2, R.string.chat_auto_reply_keywords, go0Var2), go0Var2, 0);
                                            xk1 xk1Var21 = xk1Var5;
                                            String str6 = (String) xk1Var21.getValue();
                                            boolean zM1980f8 = go0Var2.m1980f(xk1Var21);
                                            Object objM1956L25 = go0Var2.m1956L();
                                            if (zM1980f8 || objM1956L25 == c0160eb2) {
                                                objM1956L25 = new C0590pr(xk1Var21, 4);
                                                go0Var2.m1981f0(objM1956L25);
                                            }
                                            tp0.m5357b(str6, (in0) objM1956L25, null, rg3.m4462P(R.string.chat_auto_reply_keywords_hint, go0Var2), null, null, false, 3, 6, false, false, null, null, null, go0Var2, 114819072, 0, 15924);
                                            AbstractC0179eu.m1446a(rg3.m4462P(((EnumC0250gr) xk1Var20.getValue()) == EnumC0250gr.f3672k ? R.string.chat_auto_reply_regex_description : R.string.chat_auto_reply_keywords_description, go0Var2), fg1.m1615G(rh1Var, 0.0f, 6.0f, 0.0f, 0.0f, 13), AbstractC0933yr.m6319h(go0Var2), 0, false, 0, 0, go0Var2, 48, 1016);
                                            String str7 = r8;
                                            if (str7 != null) {
                                                go0Var2.m1966W(-1483247251);
                                                f = 6.0f;
                                                AbstractC0179eu.m1446a(rg3.m4463Q(R.string.chat_auto_reply_regex_invalid, new Object[]{str7}, go0Var2), fg1.m1615G(rh1Var, 0.0f, 6.0f, 0.0f, 0.0f, 13), new m13(((lp1) go0Var2.m1988j(ur1.f11452a)).f6239g, rg3.m4450D(12), im0.f4681k, 0L, 0, rg3.m4450D(17), null, null, 16646136), 0, false, 0, 0, go0Var2, 48, 1016);
                                                go0Var2.m1994p(false);
                                            } else {
                                                f = 6.0f;
                                                go0Var2.m1966W(-1482803796);
                                                go0Var2.m1994p(false);
                                            }
                                            String strM5687f3 = vi0.m5687f(rh1Var, 8.0f, go0Var2, R.string.chat_auto_reply_ignore_case, go0Var2);
                                            String strM4462P16 = rg3.m4462P(R.string.chat_auto_reply_ignore_case_description, go0Var2);
                                            xk1 xk1Var22 = xk1Var6;
                                            boolean zBooleanValue2 = ((Boolean) xk1Var22.getValue()).booleanValue();
                                            boolean zM1980f9 = go0Var2.m1980f(xk1Var22);
                                            Object objM1956L26 = go0Var2.m1956L();
                                            if (zM1980f9 || objM1956L26 == c0160eb2) {
                                                objM1956L26 = new C0590pr(xk1Var22, 5);
                                                go0Var2.m1981f0(objM1956L26);
                                            }
                                            AbstractC0933yr.m6313b(strM5687f3, strM4462P16, zBooleanValue2, (in0) objM1956L26, go0Var2, 0);
                                            String strM5687f4 = vi0.m5687f(rh1Var, 8.0f, go0Var2, R.string.chat_auto_reply_list_mode, go0Var2);
                                            xk1 xk1Var23 = xk1Var7;
                                            EnumC0176er enumC0176er = (EnumC0176er) xk1Var23.getValue();
                                            EnumC0176er enumC0176er2 = EnumC0176er.f2564j;
                                            String strM4462P17 = rg3.m4462P(enumC0176er == enumC0176er2 ? R.string.chat_auto_reply_whitelist_description : R.string.chat_auto_reply_blacklist_description, go0Var2);
                                            yf0 yf0Var2 = EnumC0176er.f2566l;
                                            EnumC0176er enumC0176er3 = (EnumC0176er) xk1Var23.getValue();
                                            boolean zM1980f10 = go0Var2.m1980f(xk1Var23);
                                            Object objM1956L27 = go0Var2.m1956L();
                                            if (zM1980f10 || objM1956L27 == c0160eb2) {
                                                objM1956L27 = new C0590pr(xk1Var23, 6);
                                                go0Var2.m1981f0(objM1956L27);
                                            }
                                            in0 in0Var5 = (in0) objM1956L27;
                                            String str8 = strM4462P8;
                                            boolean zM1980f11 = go0Var2.m1980f(str8);
                                            String str9 = strM4462P9;
                                            boolean zM1980f12 = zM1980f11 | go0Var2.m1980f(str9);
                                            Object objM1956L28 = go0Var2.m1956L();
                                            if (zM1980f12 || objM1956L28 == c0160eb2) {
                                                objM1956L28 = new C0223g0(4, str8, str9);
                                                go0Var2.m1981f0(objM1956L28);
                                            }
                                            AbstractC0179eu.m1463m(strM5687f4, yf0Var2, enumC0176er3, in0Var5, null, strM4462P17, (in0) objM1956L28, false, go0Var2, 0);
                                            String strM4462P18 = rg3.m4462P(((EnumC0176er) xk1Var23.getValue()) == enumC0176er2 ? R.string.chat_auto_reply_configure_whitelist : R.string.chat_auto_reply_configure_blacklist, go0Var2);
                                            String strM4463Q2 = rg3.m4463Q(R.string.chat_auto_reply_selected_count, new Object[]{Integer.valueOf(((Set) xk1Var8.getValue()).size())}, go0Var2);
                                            Object objM1956L29 = go0Var2.m1956L();
                                            if (objM1956L29 == c0160eb2) {
                                                objM1956L29 = new C0186f0(xk1Var15, 20);
                                                go0Var2.m1981f0(objM1956L29);
                                            }
                                            qp0.m4253h(strM4462P18, (xm0) objM1956L29, null, strM4463Q2, null, null, null, false, null, go0Var2, 48, 500);
                                            String strM5687f5 = vi0.m5687f(rh1Var, 8.0f, go0Var2, R.string.chat_auto_reply_reply_type, go0Var2);
                                            String strM4462P19 = rg3.m4462P(R.string.chat_auto_reply_reply_type_description, go0Var2);
                                            yf0 yf0Var3 = EnumC0323ir.f4754l;
                                            xk1 xk1Var24 = xk1Var17;
                                            EnumC0323ir enumC0323ir = (EnumC0323ir) xk1Var24.getValue();
                                            boolean zM1980f13 = go0Var2.m1980f(xk1Var24);
                                            Object objM1956L30 = go0Var2.m1956L();
                                            if (zM1980f13 || objM1956L30 == c0160eb2) {
                                                objM1956L30 = new C0590pr(xk1Var24, 7);
                                                go0Var2.m1981f0(objM1956L30);
                                            }
                                            in0 in0Var6 = (in0) objM1956L30;
                                            final String str10 = strM4462P10;
                                            boolean zM1980f14 = go0Var2.m1980f(str10);
                                            final String str11 = strM4462P11;
                                            boolean zM1980f15 = zM1980f14 | go0Var2.m1980f(str11);
                                            final String str12 = strM4462P12;
                                            boolean zM1980f16 = zM1980f15 | go0Var2.m1980f(str12);
                                            Object objM1956L31 = go0Var2.m1956L();
                                            if (zM1980f16 || objM1956L31 == c0160eb2) {
                                                final int i10 = 0;
                                                objM1956L31 = new in0() { // from class: or
                                                    @Override // p000.in0
                                                    /* JADX INFO: renamed from: j */
                                                    public final Object mo5j(Object obj5) {
                                                        int i102 = i10;
                                                        String str62 = str12;
                                                        String str72 = str11;
                                                        String str82 = str10;
                                                        switch (i102) {
                                                            case 0:
                                                                EnumC0323ir enumC0323ir2 = (EnumC0323ir) obj5;
                                                                enumC0323ir2.getClass();
                                                                int iOrdinal = enumC0323ir2.ordinal();
                                                                if (iOrdinal != 0) {
                                                                    if (iOrdinal != 1) {
                                                                        if (iOrdinal != 2) {
                                                                            c80.m675s();
                                                                        }
                                                                    }
                                                                }
                                                                break;
                                                            default:
                                                                EnumC0250gr enumC0250gr2 = (EnumC0250gr) obj5;
                                                                enumC0250gr2.getClass();
                                                                int iOrdinal2 = enumC0250gr2.ordinal();
                                                                if (iOrdinal2 != 0) {
                                                                    if (iOrdinal2 != 1) {
                                                                        if (iOrdinal2 != 2) {
                                                                            c80.m675s();
                                                                        }
                                                                    }
                                                                }
                                                                break;
                                                        }
                                                        return str82;
                                                    }
                                                };
                                                go0Var2.m1981f0(objM1956L31);
                                            }
                                            AbstractC0179eu.m1463m(strM5687f5, yf0Var3, enumC0323ir, in0Var6, null, strM4462P19, (in0) objM1956L31, false, go0Var2, 0);
                                            rp0.m4529O(go0Var2, AbstractC0731te.m5186O(rh1Var, 12.0f));
                                            EnumC0323ir enumC0323ir2 = (EnumC0323ir) xk1Var24.getValue();
                                            EnumC0323ir enumC0323ir3 = EnumC0323ir.f4751i;
                                            AbstractC0933yr.m6312a(rg3.m4462P(enumC0323ir2 == enumC0323ir3 ? R.string.chat_auto_reply_reply_content : R.string.chat_auto_reply_media_path, go0Var2), go0Var2, 0);
                                            xk1 xk1Var25 = xk1Var10;
                                            String str13 = (String) xk1Var25.getValue();
                                            boolean zM1980f17 = go0Var2.m1980f(xk1Var25);
                                            Object objM1956L32 = go0Var2.m1956L();
                                            if (zM1980f17 || objM1956L32 == c0160eb2) {
                                                objM1956L32 = new C0260h0(xk1Var25, 27);
                                                go0Var2.m1981f0(objM1956L32);
                                            }
                                            in0 in0Var7 = (in0) objM1956L32;
                                            int iOrdinal = ((EnumC0323ir) xk1Var24.getValue()).ordinal();
                                            if (iOrdinal == 0) {
                                                i6 = 2;
                                                i7 = R.string.chat_auto_reply_reply_content_hint;
                                            } else if (iOrdinal != 1) {
                                                i6 = 2;
                                                if (iOrdinal != 2) {
                                                    c80.m675s();
                                                    return null;
                                                }
                                                i7 = R.string.chat_auto_reply_voice_path_hint;
                                            } else {
                                                i6 = 2;
                                                i7 = R.string.chat_auto_reply_image_path_hint;
                                            }
                                            tp0.m5357b(str13, in0Var7, null, rg3.m4462P(i7, go0Var2), null, null, ((EnumC0323ir) xk1Var24.getValue()) != enumC0323ir3, ((EnumC0323ir) xk1Var24.getValue()) == enumC0323ir3 ? i6 : 1, ((EnumC0323ir) xk1Var24.getValue()) == enumC0323ir3 ? 5 : 1, false, false, null, null, null, go0Var2, 0, 0, 15924);
                                            go0 go0Var3 = go0Var2;
                                            if (((EnumC0323ir) xk1Var24.getValue()) == EnumC0323ir.f4752j) {
                                                go0Var3.m1966W(-1479120872);
                                                AbstractC0179eu.m1446a(rg3.m4462P(R.string.chat_auto_reply_voice_silk_notice, go0Var3), fg1.m1615G(rh1Var, 0.0f, f, 0.0f, 0.0f, 13), AbstractC0933yr.m6319h(go0Var3), 0, false, 0, 0, go0Var3, 48, 1016);
                                                AbstractC0933yr.m6312a(vi0.m5687f(rh1Var, 12.0f, go0Var3, R.string.chat_auto_reply_voice_duration, go0Var3), go0Var3, 0);
                                                xk1 xk1Var26 = xk1Var11;
                                                String str14 = (String) xk1Var26.getValue();
                                                boolean zM1980f18 = go0Var3.m1980f(xk1Var26);
                                                Object objM1956L33 = go0Var3.m1956L();
                                                if (zM1980f18 || objM1956L33 == c0160eb2) {
                                                    objM1956L33 = new C0260h0(xk1Var26, 28);
                                                    go0Var3.m1981f0(objM1956L33);
                                                }
                                                tp0.m5357b(str14, (in0) objM1956L33, null, rg3.m4462P(R.string.chat_auto_reply_voice_duration_hint, go0Var3), null, null, false, 0, 0, false, false, null, new m51(3, 123), null, go0Var3, 0, 384, 12276);
                                                go0Var3 = go0Var3;
                                                i8 = 0;
                                                go0Var3.m1994p(false);
                                            } else {
                                                i8 = 0;
                                                go0Var3.m1966W(-1478363604);
                                                go0Var3.m1994p(false);
                                            }
                                            AbstractC0933yr.m6312a(vi0.m5687f(rh1Var, 12.0f, go0Var3, R.string.chat_auto_reply_delay, go0Var3), go0Var3, i8);
                                            xk1 xk1Var27 = xk1Var12;
                                            String str15 = (String) xk1Var27.getValue();
                                            boolean zM1980f19 = go0Var3.m1980f(xk1Var27);
                                            Object objM1956L34 = go0Var3.m1956L();
                                            if (zM1980f19 || objM1956L34 == c0160eb2) {
                                                objM1956L34 = new C0260h0(xk1Var27, 29);
                                                go0Var3.m1981f0(objM1956L34);
                                            }
                                            go0 go0Var4 = go0Var3;
                                            tp0.m5357b(str15, (in0) objM1956L34, null, rg3.m4462P(R.string.chat_auto_reply_delay_hint, go0Var3), null, null, false, 0, 0, false, false, null, new m51(3, 123), null, go0Var4, 0, 384, 12276);
                                            AbstractC0933yr.m6312a(vi0.m5687f(rh1Var, 12.0f, go0Var4, R.string.chat_auto_reply_cooldown, go0Var4), go0Var4, 0);
                                            xk1 xk1Var28 = xk1Var13;
                                            String str16 = (String) xk1Var28.getValue();
                                            boolean zM1980f20 = go0Var4.m1980f(xk1Var28);
                                            Object objM1956L35 = go0Var4.m1956L();
                                            if (zM1980f20 || objM1956L35 == c0160eb2) {
                                                objM1956L35 = new C0590pr(xk1Var28, 0);
                                                go0Var4.m1981f0(objM1956L35);
                                            }
                                            tp0.m5357b(str16, (in0) objM1956L35, null, rg3.m4462P(R.string.chat_auto_reply_cooldown_hint, go0Var4), null, null, false, 0, 0, false, false, null, new m51(3, 123), null, go0Var4, 0, 384, 12276);
                                            go0 go0Var5 = go0Var4;
                                            AbstractC0179eu.m1446a(rg3.m4462P(R.string.chat_auto_reply_cooldown_description, go0Var5), fg1.m1615G(rh1Var, 0.0f, f, 0.0f, 0.0f, 13), AbstractC0933yr.m6319h(go0Var5), 0, false, 0, 0, go0Var5, 48, 1016);
                                            String strM5687f6 = vi0.m5687f(rh1Var, 8.0f, go0Var5, R.string.chat_auto_reply_stop_after_match, go0Var5);
                                            String strM4462P20 = rg3.m4462P(R.string.chat_auto_reply_stop_after_match_description, go0Var5);
                                            xk1 xk1Var29 = xk1Var14;
                                            boolean zBooleanValue3 = ((Boolean) xk1Var29.getValue()).booleanValue();
                                            boolean zM1980f21 = go0Var5.m1980f(xk1Var29);
                                            Object objM1956L36 = go0Var5.m1956L();
                                            if (zM1980f21 || objM1956L36 == c0160eb2) {
                                                objM1956L36 = new C0590pr(xk1Var29, 1);
                                                go0Var5.m1981f0(objM1956L36);
                                            }
                                            AbstractC0933yr.m6313b(strM5687f6, strM4462P20, zBooleanValue3, (in0) objM1956L36, go0Var5, 0);
                                            if (z) {
                                                go0Var5.m1966W(-1476470868);
                                                go0Var5.m1994p(false);
                                            } else {
                                                go0Var5.m1966W(-1476788959);
                                                rp0.m4529O(go0Var5, AbstractC0731te.m5186O(rh1Var, 14.0f));
                                                String strM4462P21 = rg3.m4462P(R.string.chat_auto_reply_delete_task, go0Var5);
                                                Object objM1956L37 = go0Var5.m1956L();
                                                if (objM1956L37 == c0160eb2) {
                                                    objM1956L37 = new C0186f0(xk1Var16, 19);
                                                    go0Var5.m1981f0(objM1956L37);
                                                }
                                                AbstractC0691se.m4847r(strM4462P21, (xm0) objM1956L37, AbstractC0731te.f10693e, false, 0, go0Var5, 432, 56);
                                                go0Var5 = go0Var5;
                                                go0Var5.m1994p(false);
                                            }
                                            go0Var5.m1994p(true);
                                        } else {
                                            go0Var2.m1961R();
                                        }
                                        return a83.f116a;
                                    }
                                }, go0Var), go0Var, 1769526, 20);
                                go0Var = go0Var;
                            }
                        }
                    } else {
                        long jLongValue = lM6014f0.longValue();
                        if (0 <= jLongValue && jLongValue < 60001 && lM6014f02 != null) {
                            long jLongValue2 = lM6014f02.longValue();
                            if (0 <= jLongValue2 && jLongValue2 < 86400001) {
                                if (((EnumC0323ir) xk1Var17.getValue()) == EnumC0323ir.f4752j) {
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
                    b62VarM1996r.f616d = mn0Var;
                }
                collectionM1434O = AbstractC0179eu.m1434O(next);
            } else {
                collectionM1434O = be0.f819h;
            }
            arrayList = collectionM1434O;
            Integer numM6013e02 = wv2.m6013e0((String) xk1Var11.getValue());
            final Long lM6014f03 = wv2.m6014f0((String) xk1Var12.getValue());
            final Long lM6014f022 = wv2.m6014f0((String) xk1Var13.getValue());
            final List r292 = arrayList;
            Object obj2 = null;
            if (((EnumC0250gr) xk1Var4.getValue()) != EnumC0250gr.f3672k) {
            }
            if (pv2.m4006s0((String) xk1Var2.getValue())) {
                z2 = false;
                if (((Boolean) xk1Var15.getValue()).booleanValue()) {
                }
            }
            b62VarM1996r.f616d = mn0Var;
        }
        go0Var.m1961R();
        b62VarM1996r = go0Var.m1996r();
        if (b62VarM1996r != null) {
            final int i6 = 2;
            mn0Var = new mn0(c0971zq, z, xm0Var, xm0Var2, in0Var, i, i6) { // from class: kr

                /* JADX INFO: renamed from: h */
                public final /* synthetic */ int f5725h;

                /* JADX INFO: renamed from: i */
                public final /* synthetic */ C0971zq f5726i;

                /* JADX INFO: renamed from: j */
                public final /* synthetic */ boolean f5727j;

                /* JADX INFO: renamed from: k */
                public final /* synthetic */ xm0 f5728k;

                /* JADX INFO: renamed from: l */
                public final /* synthetic */ xm0 f5729l;

                /* JADX INFO: renamed from: m */
                public final /* synthetic */ in0 f5730m;

                {
                    this.f5725h = i6;
                }

                @Override // p000.mn0
                /* JADX INFO: renamed from: g */
                public final Object mo12g(Object obj22, Object obj3) {
                    int i52 = this.f5725h;
                    a83 a83Var = a83.f116a;
                    switch (i52) {
                        case 0:
                            ((Integer) obj3).getClass();
                            int iM3902N = pp0.m3902N(385);
                            AbstractC0933yr.m6316e(this.f5726i, this.f5727j, this.f5728k, this.f5729l, this.f5730m, (InterfaceC0596px) obj22, iM3902N);
                            break;
                        case 1:
                            ((Integer) obj3).getClass();
                            int iM3902N2 = pp0.m3902N(385);
                            AbstractC0933yr.m6316e(this.f5726i, this.f5727j, this.f5728k, this.f5729l, this.f5730m, (InterfaceC0596px) obj22, iM3902N2);
                            break;
                        default:
                            ((Integer) obj3).getClass();
                            int iM3902N3 = pp0.m3902N(385);
                            AbstractC0933yr.m6316e(this.f5726i, this.f5727j, this.f5728k, this.f5729l, this.f5730m, (InterfaceC0596px) obj22, iM3902N3);
                            break;
                    }
                    return a83Var;
                }
            };
            b62VarM1996r.f616d = mn0Var;
        }
    }

    /* JADX INFO: renamed from: f */
    public static final String m6317f() {
        long jCurrentTimeMillis = System.currentTimeMillis();
        xe1.m6127j(36);
        String string = Long.toString(jCurrentTimeMillis, 36);
        string.getClass();
        long jIncrementAndGet = f13595a.incrementAndGet();
        xe1.m6127j(36);
        String string2 = Long.toString(jIncrementAndGet, 36);
        string2.getClass();
        return string + "-" + string2;
    }

    /* JADX INFO: renamed from: g */
    public static final List m6318g(List list, int i, int i2) {
        if (i < 0 || i >= list.size() || i2 < 0 || i2 >= list.size() || i == i2) {
            return list;
        }
        ArrayList arrayList = new ArrayList(list);
        Object obj = arrayList.get(i);
        arrayList.set(i, arrayList.get(i2));
        arrayList.set(i2, obj);
        return arrayList;
    }

    /* JADX INFO: renamed from: h */
    public static final m13 m6319h(go0 go0Var) {
        return new m13(((lp1) go0Var.m1988j(ur1.f11452a)).f6238f, rg3.m4450D(12), null, 0L, 0, rg3.m4450D(17), null, null, 16646140);
    }
}
