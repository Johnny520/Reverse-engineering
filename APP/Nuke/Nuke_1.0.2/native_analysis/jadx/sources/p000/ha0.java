package p000;

import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class ha0 implements ak0 {

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ int f3930h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ Object f3931i;

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ Object f3932j;

    public ha0(ia0 ia0Var, o72 o72Var, ak0 ak0Var) {
        this.f3930h = 0;
        this.f3931i = o72Var;
        this.f3932j = ak0Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:116:0x022d  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x01de  */
    @Override // p000.ak0
    /* JADX INFO: renamed from: m */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object mo181m(Object obj, t00 t00Var) {
        ga0 ga0Var;
        jk0 jk0Var;
        Object obj2 = obj;
        int i = this.f3930h;
        t00 t00Var2 = null;
        k20 k20Var = k20.f5323h;
        Object obj3 = this.f3932j;
        Object obj4 = this.f3931i;
        a83 a83Var = a83.f116a;
        switch (i) {
            case 0:
                o72 o72Var = (o72) obj4;
                if (t00Var instanceof ga0) {
                    ga0Var = (ga0) t00Var;
                    int i2 = ga0Var.f3377m;
                    if ((i2 & Integer.MIN_VALUE) != 0) {
                        ga0Var.f3377m = i2 - Integer.MIN_VALUE;
                    } else {
                        ga0Var = new ga0(this, t00Var);
                    }
                }
                Object obj5 = ga0Var.f3375k;
                int i3 = ga0Var.f3377m;
                if (i3 == 0) {
                    fg1.m1627T(obj5);
                    Object obj6 = o72Var.f7574i;
                    if (obj6 == up0.f11397e || !t11.m5086l(obj6, obj2)) {
                        o72Var.f7574i = obj2;
                        ga0Var.f3377m = 1;
                        if (((ak0) obj3).mo181m(obj2, ga0Var) == k20Var) {
                            return k20Var;
                        }
                    }
                } else {
                    if (i3 != 1) {
                        C0676s.m4653l("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    fg1.m1627T(obj5);
                }
                return a83Var;
            case 1:
                if (t00Var instanceof jk0) {
                    jk0Var = (jk0) t00Var;
                    int i4 = jk0Var.f5080l;
                    if ((i4 & Integer.MIN_VALUE) != 0) {
                        jk0Var.f5080l = i4 - Integer.MIN_VALUE;
                    } else {
                        jk0Var = new jk0(this, t00Var);
                    }
                }
                Object objMo12g = jk0Var.f5079k;
                int i5 = jk0Var.f5080l;
                if (i5 == 0) {
                    fg1.m1627T(objMo12g);
                    jk0Var.f5082n = obj2;
                    jk0Var.f5080l = 1;
                    objMo12g = ((mn0) obj3).mo12g(obj2, jk0Var);
                    if (objMo12g == k20Var) {
                        return k20Var;
                    }
                } else {
                    if (i5 != 1) {
                        C0676s.m4653l("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    obj2 = jk0Var.f5082n;
                    fg1.m1627T(objMo12g);
                }
                if (!((Boolean) objMo12g).booleanValue()) {
                    return a83Var;
                }
                ((o72) obj4).f7574i = obj2;
                throw new C0525o1(this);
            case 2:
                j11 j11Var = (j11) obj2;
                ArrayList arrayList = (ArrayList) obj4;
                if (j11Var instanceof z22) {
                    arrayList.add(j11Var);
                } else if (j11Var instanceof a32) {
                    arrayList.remove(((a32) j11Var).f44a);
                } else if (j11Var instanceof y22) {
                    arrayList.remove(((y22) j11Var).f13284a);
                }
                ((xk1) obj3).setValue(Boolean.valueOf(!arrayList.isEmpty()));
                return a83Var;
            case 3:
                j11 j11Var2 = (j11) obj2;
                C0766ua c0766ua = (C0766ua) obj4;
                if (!(j11Var2 instanceof b32)) {
                    j20 j20Var = (j20) obj3;
                    C0554os c0554os = c0766ua.f11178A;
                    float f = 0.0f;
                    if (c0554os == null) {
                        boolean z = c0766ua.f11186w;
                        w60 w60Var = c0766ua.f11189z;
                        c0554os = new C0554os();
                        c0554os.f7820a = z;
                        c0554os.f7821b = w60Var;
                        c0554os.f7822c = new C0689sc(Float.valueOf(0.0f), rg3.f9572n, Float.valueOf(0.01f), 8);
                        c0554os.f7823d = new ArrayList();
                        ci0.m788M(c0766ua);
                        c0766ua.f11178A = c0554os;
                    }
                    ArrayList arrayList2 = (ArrayList) c0554os.f7823d;
                    if (j11Var2 instanceof xu0) {
                        arrayList2.add(j11Var2);
                    } else if (j11Var2 instanceof yu0) {
                        arrayList2.remove(((yu0) j11Var2).f13619a);
                    } else if (j11Var2 instanceof tk0) {
                        arrayList2.add(j11Var2);
                    } else if (j11Var2 instanceof uk0) {
                        arrayList2.remove(((uk0) j11Var2).f11339a);
                    } else if (j11Var2 instanceof fc0) {
                        arrayList2.add(j11Var2);
                    } else if (j11Var2 instanceof gc0) {
                        arrayList2.remove(((gc0) j11Var2).f3396a);
                    } else if (j11Var2 instanceof ec0) {
                        arrayList2.remove(((ec0) j11Var2).f2388a);
                    }
                    j11 j11Var3 = (j11) AbstractC0142du.m1167w0(arrayList2);
                    if (!t11.m5086l((j11) c0554os.f7824e, j11Var3)) {
                        if (j11Var3 != null) {
                            ((w60) c0554os.f7821b).mo6a();
                            boolean z2 = j11Var3 instanceof xu0;
                            if (z2) {
                                f = 0.08f;
                            } else if (j11Var3 instanceof tk0) {
                                f = 0.1f;
                            } else if (j11Var3 instanceof fc0) {
                                f = 0.16f;
                            }
                            m43 m43Var = ta2.f10657a;
                            if (!z2 && ((j11Var3 instanceof tk0) || (j11Var3 instanceof fc0))) {
                                m43Var = new m43(45, hd0.f3956b);
                            }
                            AbstractC0570p7.m3745A(j20Var, null, new lu2(c0554os, f, m43Var, null), 3);
                        } else {
                            j11 j11Var4 = (j11) c0554os.f7824e;
                            m43 m43Var2 = ta2.f10657a;
                            if (!(j11Var4 instanceof xu0) && !(j11Var4 instanceof tk0) && (j11Var4 instanceof fc0)) {
                                m43Var2 = new m43(150, hd0.f3956b);
                            }
                            AbstractC0570p7.m3745A(j20Var, null, new C0003a2(c0554os, m43Var2, t00Var2, 26), 3);
                        }
                        c0554os.f7824e = j11Var3;
                    }
                } else if (c0766ua.f11181D) {
                    c0766ua.m5477M0((b32) j11Var2);
                } else {
                    c0766ua.f11182E.m2925a(j11Var2);
                }
                return a83Var;
            default:
                long j = ((rs1) obj2).f9744a;
                C0689sc c0689sc = (C0689sc) obj4;
                if ((((rs1) c0689sc.m4788d()).f9744a & 9223372034707292159L) == 9205357640488583168L || (j & 9223372034707292159L) == 9205357640488583168L || Float.intBitsToFloat((int) (((rs1) c0689sc.m4788d()).f9744a & 4294967295L)) == Float.intBitsToFloat((int) (j & 4294967295L))) {
                    Object objM4789e = c0689sc.m4789e(t00Var, new rs1(j));
                    return objM4789e == k20Var ? objM4789e : a83Var;
                }
                AbstractC0570p7.m3745A((j20) obj3, null, new C0235gc(c0689sc, j, null, 2), 3);
                return a83Var;
        }
    }

    public /* synthetic */ ha0(int i, Object obj, Object obj2) {
        this.f3930h = i;
        this.f3931i = obj;
        this.f3932j = obj2;
    }

    public ha0(mn0 mn0Var, o72 o72Var) {
        this.f3930h = 1;
        this.f3932j = mn0Var;
        this.f3931i = o72Var;
    }
}
