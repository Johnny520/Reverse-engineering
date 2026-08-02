package p000;

import java.lang.reflect.Array;
import nuke.module.wechat.p002ai.AIChatConfig;

/* JADX INFO: renamed from: t6 */
/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class C0723t6 extends w51 implements xm0 {

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ int f10578i;

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ Object f10579j;

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ Object f10580k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0723t6(int i, Object obj, Object obj2) {
        super(0);
        this.f10578i = i;
        this.f10579j = obj;
        this.f10580k = obj2;
    }

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
    @Override // p000.xm0
    /* JADX INFO: renamed from: a */
    public final Object mo6a() {
        qn2 qn2Var;
        r61 r61Var;
        int i = this.f10578i;
        a83 a83Var = a83.f116a;
        Object obj = this.f10580k;
        Object obj2 = this.f10579j;
        switch (i) {
            case 0:
                break;
            case 1:
                ViewOnAttachStateChangeListenerC0267h7 viewOnAttachStateChangeListenerC0267h7 = (ViewOnAttachStateChangeListenerC0267h7) obj;
                jl2 jl2Var = (jl2) obj2;
                el2 el2Var = jl2Var.f5102l;
                el2 el2Var2 = jl2Var.f5103m;
                Float f = jl2Var.f5100j;
                Float f2 = jl2Var.f5101k;
                float fFloatValue = (el2Var == null || f == null) ? 0.0f : ((Number) el2Var.f2497a.mo6a()).floatValue() - f.floatValue();
                float fFloatValue2 = (el2Var2 == null || f2 == null) ? 0.0f : ((Number) el2Var2.f2497a.mo6a()).floatValue() - f2.floatValue();
                if (fFloatValue != 0.0f || fFloatValue2 != 0.0f) {
                    int iM2110t = viewOnAttachStateChangeListenerC0267h7.m2110t(jl2Var.f5098h);
                    sn2 sn2Var = (sn2) viewOnAttachStateChangeListenerC0267h7.m2106l().m6022b(viewOnAttachStateChangeListenerC0267h7.f3871r);
                    if (sn2Var != null) {
                        try {
                            C0411l4 c0411l4 = viewOnAttachStateChangeListenerC0267h7.f3873t;
                            if (c0411l4 != null) {
                                c0411l4.f5914a.setBoundsInScreen(viewOnAttachStateChangeListenerC0267h7.m2098d(sn2Var));
                            }
                            break;
                        } catch (IllegalStateException unused) {
                        }
                    }
                    sn2 sn2Var2 = (sn2) viewOnAttachStateChangeListenerC0267h7.m2106l().m6022b(viewOnAttachStateChangeListenerC0267h7.f3872s);
                    if (sn2Var2 != null) {
                        try {
                            C0411l4 c0411l42 = viewOnAttachStateChangeListenerC0267h7.f3874u;
                            if (c0411l42 != null) {
                                c0411l42.f5914a.setBoundsInScreen(viewOnAttachStateChangeListenerC0267h7.m2098d(sn2Var2));
                            }
                            break;
                        } catch (IllegalStateException unused2) {
                        }
                    }
                    viewOnAttachStateChangeListenerC0267h7.f3864k.invalidate();
                    sn2 sn2Var3 = (sn2) viewOnAttachStateChangeListenerC0267h7.m2106l().m6022b(iM2110t);
                    if (sn2Var3 != null && (qn2Var = sn2Var3.f10248a) != null && (r61Var = qn2Var.f9049c) != null) {
                        if (el2Var != null) {
                            viewOnAttachStateChangeListenerC0267h7.f3876w.m6421h(iM2110t, el2Var);
                        }
                        if (el2Var2 != null) {
                            viewOnAttachStateChangeListenerC0267h7.f3877x.m6421h(iM2110t, el2Var2);
                        }
                        viewOnAttachStateChangeListenerC0267h7.m2109p(r61Var);
                    }
                }
                if (el2Var != null) {
                    jl2Var.f5100j = (Float) el2Var.f2497a.mo6a();
                }
                if (el2Var2 != null) {
                    jl2Var.f5101k = (Float) el2Var2.f2497a.mo6a();
                }
                break;
            case 2:
                xm0 xm0Var = (xm0) obj2;
                if (xm0Var == null || (r10 = (o62) xm0Var.mo6a()) == null) {
                    zn1 zn1Var = (zn1) obj;
                    if (!zn1Var.mo2843S0().f10770u) {
                        zn1Var = null;
                    }
                    if (zn1Var != null) {
                    }
                }
                break;
            case 3:
                ((C0587po) obj2).f8420x.mo5j((C0626qo) obj);
                break;
            case 4:
                ((o72) obj2).f7574i = p40.m3733p((nl0) obj, qz1.f9295a);
                break;
            case 5:
                ((o72) obj2).f7574i = ((pl0) obj).m3873O0();
                break;
            case AIChatConfig.DefaultContextRounds /* 6 */:
                ((us0) obj2).m5577d((th1) obj);
                break;
            case 7:
                String strSubstring = (String) obj2;
                int i2 = 0;
                while (wv2.m6005W(strSubstring, "[]", false)) {
                    i2++;
                    strSubstring = strSubstring.substring(0, strSubstring.length() - 2);
                }
                Class<?> clsLoadClass = (Class) m01.f6425b.get(strSubstring);
                if (clsLoadClass == null) {
                    clsLoadClass = ((ClassLoader) obj).loadClass(strSubstring);
                }
                clsLoadClass.getClass();
                for (int i3 = 0; i3 < i2; i3++) {
                    clsLoadClass = Array.newInstance(clsLoadClass, 0).getClass();
                }
                break;
            case 8:
                vn1 vn1Var = ((r61) obj2).f9372M;
                o72 o72Var = (o72) obj;
                if ((((th1) vn1Var.f12036g).f10760k & 8) != 0) {
                    for (th1 th1Var = (qx2) vn1Var.f12035f; th1Var != null; th1Var = th1Var.f10761l) {
                        if ((th1Var.f10759j & 8) != 0) {
                            ?? M4952m = th1Var;
                            ?? zk1Var = 0;
                            while (M4952m != 0) {
                                if (M4952m instanceof on2) {
                                    on2 on2Var = (on2) M4952m;
                                    if (on2Var.mo357n0()) {
                                        ln2 ln2Var = new ln2();
                                        o72Var.f7574i = ln2Var;
                                        ln2Var.f6224k = true;
                                    }
                                    if (on2Var.mo358o0()) {
                                        ((ln2) o72Var.f7574i).f6223j = true;
                                    }
                                    on2Var.mo232l0((zn2) o72Var.f7574i);
                                } else if ((M4952m.f10759j & 8) != 0 && (M4952m instanceof u60)) {
                                    th1 th1Var2 = ((u60) M4952m).f11116w;
                                    int i4 = 0;
                                    M4952m = M4952m;
                                    zk1Var = zk1Var;
                                    while (th1Var2 != null) {
                                        if ((th1Var2.f10759j & 8) != 0) {
                                            i4++;
                                            zk1Var = zk1Var;
                                            if (i4 == 1) {
                                                M4952m = th1Var2;
                                            } else {
                                                if (zk1Var == 0) {
                                                    zk1Var = new zk1(new th1[16]);
                                                }
                                                if (M4952m != 0) {
                                                    zk1Var.m6423b(M4952m);
                                                    M4952m = 0;
                                                }
                                                zk1Var.m6423b(th1Var2);
                                            }
                                        }
                                        th1Var2 = th1Var2.f10762m;
                                        M4952m = M4952m;
                                        zk1Var = zk1Var;
                                    }
                                    if (i4 == 1) {
                                    }
                                }
                                M4952m = sp0.m4952m(zk1Var);
                            }
                        }
                    }
                }
                break;
            case 9:
                ca2 ca2Var = zn1.f13961T;
                ((in0) obj2).mo5j(ca2Var);
                zn1 zn1Var2 = (zn1) obj;
                boolean zM5086l = t11.m5086l(zn1Var2.f13976K, ca2Var.f1274u);
                boolean z = zn1Var2.f13977L;
                boolean z2 = ca2Var.f1275v;
                boolean z3 = z != z2;
                if (!zM5086l || z3) {
                    zn1Var2.f13976K = ca2Var.f1274u;
                    zn1Var2.f13977L = z2;
                    if (zn1Var2.f13978M && (z3 || (z2 && !zM5086l))) {
                        zn1Var2.f13985v.m4348F();
                    }
                }
                zn1Var2.f13978M = true;
                ca2Var.f1260A = ca2Var.f1274u.mo248a(ca2Var.f1276w, ca2Var.f1278y, ca2Var.f1277x);
                break;
            default:
                ((ba1) obj2).mo506b((lg1) obj);
                break;
        }
        return a83Var;
    }
}
