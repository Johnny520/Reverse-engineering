package defpackage;

import java.lang.reflect.Array;
import nuke.module.wechat.ai.AIChatConfig;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class t6 extends w51 implements xm0 {
    public final /* synthetic */ int i;
    public final /* synthetic */ Object j;
    public final /* synthetic */ Object k;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ t6(int i, Object obj, Object obj2) {
        super(0);
        this.i = i;
        this.j = obj;
        this.k = obj2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:141:0x00d9 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:145:0x0076 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:147:0x0076 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:150:0x00d3 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:49:0x00ca */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v22 */
    /* JADX WARN: Type inference failed for: r0v23, types: [th1] */
    /* JADX WARN: Type inference failed for: r0v25 */
    /* JADX WARN: Type inference failed for: r0v26, types: [th1] */
    /* JADX WARN: Type inference failed for: r0v27, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v28 */
    /* JADX WARN: Type inference failed for: r0v29 */
    /* JADX WARN: Type inference failed for: r0v30 */
    /* JADX WARN: Type inference failed for: r0v31 */
    /* JADX WARN: Type inference failed for: r0v33 */
    /* JADX WARN: Type inference failed for: r0v34 */
    /* JADX WARN: Type inference failed for: r6v10 */
    /* JADX WARN: Type inference failed for: r6v11 */
    /* JADX WARN: Type inference failed for: r6v12, types: [zk1] */
    /* JADX WARN: Type inference failed for: r6v13 */
    /* JADX WARN: Type inference failed for: r6v14 */
    /* JADX WARN: Type inference failed for: r6v15, types: [zk1] */
    /* JADX WARN: Type inference failed for: r6v18 */
    /* JADX WARN: Type inference failed for: r6v19 */
    /* JADX WARN: Type inference failed for: r6v20 */
    /* JADX WARN: Type inference failed for: r6v21 */
    /* JADX WARN: Type inference failed for: r6v9 */
    /* JADX WARN: Type inference failed for: r7v18 */
    @Override // defpackage.xm0
    public final Object a() {
        qn2 qn2Var;
        r61 r61Var;
        int i = this.i;
        a83 a83Var = a83.a;
        Object obj = this.k;
        Object obj2 = this.j;
        switch (i) {
            case 0:
                break;
            case 1:
                h7 h7Var = (h7) obj;
                jl2 jl2Var = (jl2) obj2;
                el2 el2Var = jl2Var.l;
                el2 el2Var2 = jl2Var.m;
                Float f = jl2Var.j;
                Float f2 = jl2Var.k;
                float fFloatValue = (el2Var == null || f == null) ? 0.0f : ((Number) el2Var.a.a()).floatValue() - f.floatValue();
                float fFloatValue2 = (el2Var2 == null || f2 == null) ? 0.0f : ((Number) el2Var2.a.a()).floatValue() - f2.floatValue();
                if (fFloatValue != 0.0f || fFloatValue2 != 0.0f) {
                    int iT = h7Var.t(jl2Var.h);
                    sn2 sn2Var = (sn2) h7Var.l().b(h7Var.r);
                    if (sn2Var != null) {
                        try {
                            l4 l4Var = h7Var.t;
                            if (l4Var != null) {
                                l4Var.a.setBoundsInScreen(h7Var.d(sn2Var));
                            }
                            break;
                        } catch (IllegalStateException unused) {
                        }
                    }
                    sn2 sn2Var2 = (sn2) h7Var.l().b(h7Var.s);
                    if (sn2Var2 != null) {
                        try {
                            l4 l4Var2 = h7Var.u;
                            if (l4Var2 != null) {
                                l4Var2.a.setBoundsInScreen(h7Var.d(sn2Var2));
                            }
                            break;
                        } catch (IllegalStateException unused2) {
                        }
                    }
                    h7Var.k.invalidate();
                    sn2 sn2Var3 = (sn2) h7Var.l().b(iT);
                    if (sn2Var3 != null && (qn2Var = sn2Var3.a) != null && (r61Var = qn2Var.c) != null) {
                        if (el2Var != null) {
                            h7Var.w.h(iT, el2Var);
                        }
                        if (el2Var2 != null) {
                            h7Var.x.h(iT, el2Var2);
                        }
                        h7Var.p(r61Var);
                    }
                }
                if (el2Var != null) {
                    jl2Var.j = (Float) el2Var.a.a();
                }
                if (el2Var2 != null) {
                    jl2Var.k = (Float) el2Var2.a.a();
                }
                break;
            case 2:
                xm0 xm0Var = (xm0) obj2;
                if (xm0Var == null || (r10 = (o62) xm0Var.a()) == null) {
                    zn1 zn1Var = (zn1) obj;
                    if (!zn1Var.S0().u) {
                        zn1Var = null;
                    }
                    if (zn1Var != null) {
                    }
                }
                break;
            case 3:
                ((po) obj2).x.j((qo) obj);
                break;
            case 4:
                ((o72) obj2).i = p40.p((nl0) obj, qz1.a);
                break;
            case 5:
                ((o72) obj2).i = ((pl0) obj).O0();
                break;
            case AIChatConfig.DefaultContextRounds /* 6 */:
                ((us0) obj2).d((th1) obj);
                break;
            case 7:
                String strSubstring = (String) obj2;
                int i2 = 0;
                while (wv2.W(strSubstring, "[]", false)) {
                    i2++;
                    strSubstring = strSubstring.substring(0, strSubstring.length() - 2);
                }
                Class<?> clsLoadClass = (Class) m01.b.get(strSubstring);
                if (clsLoadClass == null) {
                    clsLoadClass = ((ClassLoader) obj).loadClass(strSubstring);
                }
                clsLoadClass.getClass();
                for (int i3 = 0; i3 < i2; i3++) {
                    clsLoadClass = Array.newInstance(clsLoadClass, 0).getClass();
                }
                break;
            case 8:
                vn1 vn1Var = ((r61) obj2).M;
                o72 o72Var = (o72) obj;
                if ((((th1) vn1Var.g).k & 8) != 0) {
                    for (th1 th1Var = (qx2) vn1Var.f; th1Var != null; th1Var = th1Var.l) {
                        if ((th1Var.j & 8) != 0) {
                            ?? M = th1Var;
                            ?? zk1Var = 0;
                            while (M != 0) {
                                if (M instanceof on2) {
                                    on2 on2Var = (on2) M;
                                    if (on2Var.n0()) {
                                        ln2 ln2Var = new ln2();
                                        o72Var.i = ln2Var;
                                        ln2Var.k = true;
                                    }
                                    if (on2Var.o0()) {
                                        ((ln2) o72Var.i).j = true;
                                    }
                                    on2Var.l0((zn2) o72Var.i);
                                } else if ((M.j & 8) != 0 && (M instanceof u60)) {
                                    th1 th1Var2 = ((u60) M).w;
                                    int i4 = 0;
                                    M = M;
                                    zk1Var = zk1Var;
                                    while (th1Var2 != null) {
                                        if ((th1Var2.j & 8) != 0) {
                                            i4++;
                                            zk1Var = zk1Var;
                                            if (i4 == 1) {
                                                M = th1Var2;
                                            } else {
                                                if (zk1Var == 0) {
                                                    zk1Var = new zk1(new th1[16]);
                                                }
                                                if (M != 0) {
                                                    zk1Var.b(M);
                                                    M = 0;
                                                }
                                                zk1Var.b(th1Var2);
                                            }
                                        }
                                        th1Var2 = th1Var2.m;
                                        M = M;
                                        zk1Var = zk1Var;
                                    }
                                    if (i4 == 1) {
                                    }
                                }
                                M = sp0.m(zk1Var);
                            }
                        }
                    }
                }
                break;
            case 9:
                ca2 ca2Var = zn1.T;
                ((in0) obj2).j(ca2Var);
                zn1 zn1Var2 = (zn1) obj;
                boolean zL = t11.l(zn1Var2.K, ca2Var.u);
                boolean z = zn1Var2.L;
                boolean z2 = ca2Var.v;
                boolean z3 = z != z2;
                if (!zL || z3) {
                    zn1Var2.K = ca2Var.u;
                    zn1Var2.L = z2;
                    if (zn1Var2.M && (z3 || (z2 && !zL))) {
                        zn1Var2.v.F();
                    }
                }
                zn1Var2.M = true;
                ca2Var.A = ca2Var.u.a(ca2Var.w, ca2Var.y, ca2Var.x);
                break;
            default:
                ((ba1) obj2).b((lg1) obj);
                break;
        }
        return a83Var;
    }
}
