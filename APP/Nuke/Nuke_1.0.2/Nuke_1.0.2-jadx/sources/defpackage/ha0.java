package defpackage;

import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class ha0 implements ak0 {
    public final /* synthetic */ int h;
    public final /* synthetic */ Object i;
    public final /* synthetic */ Object j;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public ha0(ia0 ia0Var, o72 o72Var, ak0 ak0Var) {
        this.h = 0;
        this.i = o72Var;
        this.j = ak0Var;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:116:0x022d  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x01de  */
    @Override // defpackage.ak0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m(Object obj, t00 t00Var) {
        ga0 ga0Var;
        jk0 jk0Var;
        Object obj2 = obj;
        int i = this.h;
        t00 t00Var2 = null;
        k20 k20Var = k20.h;
        Object obj3 = this.j;
        Object obj4 = this.i;
        a83 a83Var = a83.a;
        switch (i) {
            case 0:
                o72 o72Var = (o72) obj4;
                if (t00Var instanceof ga0) {
                    ga0Var = (ga0) t00Var;
                    int i2 = ga0Var.m;
                    if ((i2 & Integer.MIN_VALUE) != 0) {
                        ga0Var.m = i2 - Integer.MIN_VALUE;
                    } else {
                        ga0Var = new ga0(this, t00Var);
                    }
                }
                Object obj5 = ga0Var.k;
                int i3 = ga0Var.m;
                if (i3 == 0) {
                    fg1.T(obj5);
                    Object obj6 = o72Var.i;
                    if (obj6 == up0.e || !t11.l(obj6, obj2)) {
                        o72Var.i = obj2;
                        ga0Var.m = 1;
                        if (((ak0) obj3).m(obj2, ga0Var) == k20Var) {
                            return k20Var;
                        }
                    }
                } else {
                    if (i3 != 1) {
                        s.l("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    fg1.T(obj5);
                }
                return a83Var;
            case 1:
                if (t00Var instanceof jk0) {
                    jk0Var = (jk0) t00Var;
                    int i4 = jk0Var.l;
                    if ((i4 & Integer.MIN_VALUE) != 0) {
                        jk0Var.l = i4 - Integer.MIN_VALUE;
                    } else {
                        jk0Var = new jk0(this, t00Var);
                    }
                }
                Object objG = jk0Var.k;
                int i5 = jk0Var.l;
                if (i5 == 0) {
                    fg1.T(objG);
                    jk0Var.n = obj2;
                    jk0Var.l = 1;
                    objG = ((mn0) obj3).g(obj2, jk0Var);
                    if (objG == k20Var) {
                        return k20Var;
                    }
                } else {
                    if (i5 != 1) {
                        s.l("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    obj2 = jk0Var.n;
                    fg1.T(objG);
                }
                if (!((Boolean) objG).booleanValue()) {
                    return a83Var;
                }
                ((o72) obj4).i = obj2;
                throw new o1(this);
            case 2:
                j11 j11Var = (j11) obj2;
                ArrayList arrayList = (ArrayList) obj4;
                if (j11Var instanceof z22) {
                    arrayList.add(j11Var);
                } else if (j11Var instanceof a32) {
                    arrayList.remove(((a32) j11Var).a);
                } else if (j11Var instanceof y22) {
                    arrayList.remove(((y22) j11Var).a);
                }
                ((xk1) obj3).setValue(Boolean.valueOf(!arrayList.isEmpty()));
                return a83Var;
            case 3:
                j11 j11Var2 = (j11) obj2;
                ua uaVar = (ua) obj4;
                if (!(j11Var2 instanceof b32)) {
                    j20 j20Var = (j20) obj3;
                    os osVar = uaVar.A;
                    float f = 0.0f;
                    if (osVar == null) {
                        boolean z = uaVar.w;
                        w60 w60Var = uaVar.z;
                        osVar = new os();
                        osVar.a = z;
                        osVar.b = w60Var;
                        osVar.c = new sc(Float.valueOf(0.0f), rg3.n, Float.valueOf(0.01f), 8);
                        osVar.d = new ArrayList();
                        ci0.M(uaVar);
                        uaVar.A = osVar;
                    }
                    ArrayList arrayList2 = (ArrayList) osVar.d;
                    if (j11Var2 instanceof xu0) {
                        arrayList2.add(j11Var2);
                    } else if (j11Var2 instanceof yu0) {
                        arrayList2.remove(((yu0) j11Var2).a);
                    } else if (j11Var2 instanceof tk0) {
                        arrayList2.add(j11Var2);
                    } else if (j11Var2 instanceof uk0) {
                        arrayList2.remove(((uk0) j11Var2).a);
                    } else if (j11Var2 instanceof fc0) {
                        arrayList2.add(j11Var2);
                    } else if (j11Var2 instanceof gc0) {
                        arrayList2.remove(((gc0) j11Var2).a);
                    } else if (j11Var2 instanceof ec0) {
                        arrayList2.remove(((ec0) j11Var2).a);
                    }
                    j11 j11Var3 = (j11) du.w0(arrayList2);
                    if (!t11.l((j11) osVar.e, j11Var3)) {
                        if (j11Var3 != null) {
                            ((w60) osVar.b).a();
                            boolean z2 = j11Var3 instanceof xu0;
                            if (z2) {
                                f = 0.08f;
                            } else if (j11Var3 instanceof tk0) {
                                f = 0.1f;
                            } else if (j11Var3 instanceof fc0) {
                                f = 0.16f;
                            }
                            m43 m43Var = ta2.a;
                            if (!z2 && ((j11Var3 instanceof tk0) || (j11Var3 instanceof fc0))) {
                                m43Var = new m43(45, hd0.b);
                            }
                            p7.A(j20Var, null, new lu2(osVar, f, m43Var, null), 3);
                        } else {
                            j11 j11Var4 = (j11) osVar.e;
                            m43 m43Var2 = ta2.a;
                            if (!(j11Var4 instanceof xu0) && !(j11Var4 instanceof tk0) && (j11Var4 instanceof fc0)) {
                                m43Var2 = new m43(150, hd0.b);
                            }
                            p7.A(j20Var, null, new a2(osVar, m43Var2, t00Var2, 26), 3);
                        }
                        osVar.e = j11Var3;
                    }
                } else if (uaVar.D) {
                    uaVar.M0((b32) j11Var2);
                } else {
                    uaVar.E.a(j11Var2);
                }
                return a83Var;
            default:
                long j = ((rs1) obj2).a;
                sc scVar = (sc) obj4;
                if ((((rs1) scVar.d()).a & 9223372034707292159L) == 9205357640488583168L || (j & 9223372034707292159L) == 9205357640488583168L || Float.intBitsToFloat((int) (((rs1) scVar.d()).a & 4294967295L)) == Float.intBitsToFloat((int) (j & 4294967295L))) {
                    Object objE = scVar.e(t00Var, new rs1(j));
                    return objE == k20Var ? objE : a83Var;
                }
                p7.A((j20) obj3, null, new gc(scVar, j, null, 2), 3);
                return a83Var;
        }
    }

    public /* synthetic */ ha0(int i, Object obj, Object obj2) {
        this.h = i;
        this.i = obj;
        this.j = obj2;
    }

    public ha0(mn0 mn0Var, o72 o72Var) {
        this.h = 1;
        this.j = mn0Var;
        this.i = o72Var;
    }
}
