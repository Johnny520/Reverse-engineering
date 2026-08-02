package p000;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class ym2 extends w92 implements mn0 {

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ int f13518j = 1;

    /* JADX INFO: renamed from: k */
    public int f13519k;

    /* JADX INFO: renamed from: l */
    public /* synthetic */ Object f13520l;

    /* JADX INFO: renamed from: m */
    public Object f13521m;

    /* JADX INFO: renamed from: n */
    public Object f13522n;

    /* JADX INFO: renamed from: o */
    public final /* synthetic */ Object f13523o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ym2(C0158e9 c0158e9, er2 er2Var, kz2 kz2Var, t00 t00Var) {
        super(2, t00Var);
        this.f13521m = c0158e9;
        this.f13522n = er2Var;
        this.f13523o = kz2Var;
    }

    @Override // p000.mn0
    /* JADX INFO: renamed from: g */
    public final Object mo12g(Object obj, Object obj2) {
        int i = this.f13518j;
        a83 a83Var = a83.f116a;
        yw2 yw2Var = (yw2) obj;
        t00 t00Var = (t00) obj2;
        switch (i) {
        }
        return ((ym2) mo13p(t00Var, yw2Var)).mo7r(a83Var);
    }

    @Override // p000.AbstractC0658rj
    /* JADX INFO: renamed from: p */
    public final t00 mo13p(t00 t00Var, Object obj) {
        int i = this.f13518j;
        Object obj2 = this.f13523o;
        switch (i) {
            case 0:
                ym2 ym2Var = new ym2((C0158e9) this.f13521m, (er2) this.f13522n, (kz2) obj2, t00Var);
                ym2Var.f13520l = obj;
                return ym2Var;
            default:
                ym2 ym2Var2 = new ym2((aw2) obj2, t00Var);
                ym2Var2.f13520l = obj;
                return ym2Var2;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:233:0x01be, code lost:
    
        continue;
     */
    /* JADX WARN: Path cross not found for [B:29:0x00b6, B:24:0x0095], limit reached: 239 */
    /* JADX WARN: Path cross not found for [B:32:0x00bb, B:35:0x00c1], limit reached: 239 */
    /* JADX WARN: Path cross not found for [B:60:0x012e, B:55:0x0118], limit reached: 239 */
    /* JADX WARN: Removed duplicated region for block: B:142:0x0251  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x0276  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x027c  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x0302  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x033c  */
    /* JADX WARN: Removed duplicated region for block: B:195:0x033e  */
    /* JADX WARN: Removed duplicated region for block: B:206:0x0270 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:210:0x010d A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x014c  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:138:0x0243 -> B:140:0x0246). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:38:0x00d2 -> B:40:0x00d6). Please report as a decompilation issue!!! */
    @Override // p000.AbstractC0658rj
    /* JADX INFO: renamed from: r */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object mo7r(Object obj) {
        yw2 yw2Var;
        Object objM3718b;
        boolean zM1062a;
        yw2 yw2Var2;
        Object objM304a;
        boolean z;
        yw2 yw2Var3;
        i12 i12Var;
        o12 o12Var;
        Object objM6363a;
        int size;
        int i;
        i12 i12Var2;
        Object obj2;
        o12 o12Var2;
        o12 o12Var3;
        yw2 yw2Var4;
        int i2;
        i12 i12Var3;
        Object objM6363a2;
        int size2;
        int i3;
        Object obj3;
        o12 o12Var4;
        int i4 = this.f13518j;
        k20 k20Var = k20.f5323h;
        a83 a83Var = a83.f116a;
        Object obj4 = this.f13523o;
        switch (i4) {
            case 0:
                C0158e9 c0158e9 = (C0158e9) this.f13521m;
                int i5 = this.f13519k;
                if (i5 != 0) {
                    if (i5 == 1) {
                        yw2Var = (yw2) this.f13520l;
                        fg1.m1627T(obj);
                        objM3718b = obj;
                    } else if (i5 == 2 || i5 == 3 || i5 == 4) {
                        fg1.m1627T(obj);
                    } else {
                        C0676s.m4653l("call to 'resume' before 'invoke' with coroutine");
                    }
                    break;
                } else {
                    fg1.m1627T(obj);
                    yw2Var = (yw2) this.f13520l;
                    this.f13520l = yw2Var;
                    this.f13519k = 1;
                    objM3718b = p40.m3718b(yw2Var, this);
                    if (objM3718b == k20Var) {
                    }
                }
                h12 h12Var = (h12) objM3718b;
                za3 za3Var = (za3) c0158e9.f2353j;
                o12 o12Var5 = (o12) c0158e9.f2354k;
                o12 o12Var6 = (o12) h12Var.f3776a.get(0);
                if (o12Var5 == null || o12Var6.f7421b - o12Var5.f7421b >= za3Var.mo3033b()) {
                    c0158e9.f2352i = 1;
                    c0158e9.f2354k = o12Var6;
                    zM1062a = dn2.m1062a(h12Var);
                    if (!zM1062a && (h12Var.f3779d & 33) != 0) {
                        List list = h12Var.f3776a;
                        int size3 = list.size();
                        for (int i6 = 0; i6 < size3; i6++) {
                            if (((o12) list.get(i6)).m3464b()) {
                                if (!zM1062a) {
                                }
                            }
                        }
                        er2 er2Var = (er2) this.f13522n;
                        this.f13520l = null;
                        this.f13519k = 2;
                        if (p40.m3705O(yw2Var, er2Var, c0158e9, h12Var, this) == k20Var) {
                        }
                    } else if (!zM1062a) {
                        int i7 = c0158e9.f2352i;
                        kz2 kz2Var = (kz2) obj4;
                        if (i7 == 1) {
                            this.f13520l = null;
                            this.f13519k = 3;
                            if (p40.m3715Z(yw2Var, kz2Var, h12Var, this) == k20Var) {
                            }
                        } else {
                            this.f13520l = null;
                            this.f13519k = 4;
                            if (p40.m3725g(yw2Var, kz2Var, h12Var, i7, this) == k20Var) {
                            }
                        }
                    }
                } else {
                    if (rs1.m4610c(rs1.m4611d(o12Var5.f7422c, o12Var6.f7422c)) < yb0.m6246f(za3Var, o12Var5.f7428i)) {
                        c0158e9.f2352i++;
                    }
                    c0158e9.f2354k = o12Var6;
                    zM1062a = dn2.m1062a(h12Var);
                    if (!zM1062a) {
                        if (!zM1062a) {
                        }
                    }
                }
                break;
            default:
                aw2 aw2Var = (aw2) obj4;
                int i8 = this.f13519k;
                i12 i12Var4 = i12.f4216h;
                if (i8 != 0) {
                    if (i8 == 1) {
                        yw2Var2 = (yw2) this.f13520l;
                        fg1.m1627T(obj);
                        objM304a = obj;
                    } else if (i8 == 2) {
                        i12Var = (i12) this.f13522n;
                        o12Var = (o12) this.f13521m;
                        yw2Var3 = (yw2) this.f13520l;
                        fg1.m1627T(obj);
                        objM6363a = obj;
                        h12 h12Var2 = (h12) objM6363a;
                        List list2 = h12Var2.f3776a;
                        size = list2.size();
                        i = 0;
                        while (true) {
                            if (i >= size) {
                                obj2 = list2.get(i);
                                o12 o12Var7 = (o12) obj2;
                                if (o12Var7.m3464b()) {
                                    i2 = i;
                                    i12Var2 = i12Var4;
                                } else {
                                    i12Var2 = i12Var4;
                                    i2 = i;
                                    if (!up0.m5553s(o12Var7.f7420a, o12Var.f7420a) || !o12Var7.f7423d) {
                                    }
                                }
                                i = i2 + 1;
                                i12Var4 = i12Var2;
                            } else {
                                i12Var2 = i12Var4;
                                obj2 = null;
                            }
                        }
                        o12Var2 = (o12) obj2;
                        if (o12Var2 == null || o12Var2.f7421b - o12Var.f7421b >= yw2Var3.m6365e().mo3034c() || h12Var2.f3778c == 2) {
                            o12Var2 = null;
                        } else if (rs1.m4610c(rs1.m4611d(o12Var2.f7422c, o12Var.f7422c)) <= yw2Var3.m6365e().mo6407e()) {
                            i12Var4 = i12Var2;
                            this.f13520l = yw2Var3;
                            this.f13521m = o12Var;
                            this.f13522n = i12Var;
                            this.f13519k = 2;
                            objM6363a = yw2Var3.m6363a(i12Var, this);
                            if (objM6363a == k20Var) {
                            }
                            h12 h12Var22 = (h12) objM6363a;
                            List list22 = h12Var22.f3776a;
                            size = list22.size();
                            i = 0;
                            while (true) {
                                if (i >= size) {
                                }
                                i = i2 + 1;
                                i12Var4 = i12Var2;
                            }
                            o12Var2 = (o12) obj2;
                            if (o12Var2 == null) {
                                if (rs1.m4610c(rs1.m4611d(o12Var2.f7422c, o12Var.f7422c)) <= yw2Var3.m6365e().mo6407e()) {
                                }
                            }
                            o12Var2 = null;
                        }
                        if (o12Var2 != null) {
                            if (!aw2Var.f422y) {
                                th1 th1VarM4952m = aw2Var.f10757h;
                                zk1 zk1Var = null;
                                while (true) {
                                    if (th1VarM4952m == null) {
                                        if (!aw2Var.f10757h.f10770u) {
                                            kz0.m2764b("visitChildren called on an unattached node");
                                        }
                                        zk1 zk1Var2 = new zk1(new th1[16]);
                                        th1 th1Var = aw2Var.f10757h;
                                        th1 th1Var2 = th1Var.f10762m;
                                        if (th1Var2 == null) {
                                            sp0.m4948k(zk1Var2, th1Var);
                                        } else {
                                            zk1Var2.m6423b(th1Var2);
                                        }
                                        while (true) {
                                            int i9 = zk1Var2.f13936j;
                                            if (i9 != 0) {
                                                th1 th1VarM4952m2 = (th1) zk1Var2.m6432k(i9 - 1);
                                                if ((th1VarM4952m2.f10760k & 1024) == 0) {
                                                    sp0.m4948k(zk1Var2, th1VarM4952m2);
                                                } else {
                                                    while (true) {
                                                        if (th1VarM4952m2 == null) {
                                                        }
                                                        if ((th1VarM4952m2.f10759j & 1024) != 0) {
                                                            zk1 zk1Var3 = null;
                                                            while (th1VarM4952m2 != null) {
                                                                if (th1VarM4952m2 instanceof pl0) {
                                                                    ((pl0) th1VarM4952m2).m3878T0(7);
                                                                } else {
                                                                    if ((th1VarM4952m2.f10759j & 1024) != 0 && (th1VarM4952m2 instanceof u60)) {
                                                                        int i10 = 0;
                                                                        for (th1 th1Var3 = ((u60) th1VarM4952m2).f11116w; th1Var3 != null; th1Var3 = th1Var3.f10762m) {
                                                                            if ((th1Var3.f10759j & 1024) != 0) {
                                                                                i10++;
                                                                                if (i10 == 1) {
                                                                                    th1VarM4952m2 = th1Var3;
                                                                                } else {
                                                                                    if (zk1Var3 == null) {
                                                                                        zk1Var3 = new zk1(new th1[16]);
                                                                                    }
                                                                                    if (th1VarM4952m2 != null) {
                                                                                        zk1Var3.m6423b(th1VarM4952m2);
                                                                                        th1VarM4952m2 = null;
                                                                                    }
                                                                                    zk1Var3.m6423b(th1Var3);
                                                                                }
                                                                            }
                                                                        }
                                                                        if (i10 == 1) {
                                                                        }
                                                                    }
                                                                    th1VarM4952m2 = sp0.m4952m(zk1Var3);
                                                                }
                                                            }
                                                        } else {
                                                            th1VarM4952m2 = th1VarM4952m2.f10762m;
                                                        }
                                                    }
                                                }
                                                break;
                                            }
                                        }
                                    } else if (th1VarM4952m instanceof pl0) {
                                        ((pl0) th1VarM4952m).m3878T0(7);
                                    } else {
                                        if ((th1VarM4952m.f10759j & 1024) != 0 && (th1VarM4952m instanceof u60)) {
                                            int i11 = 0;
                                            for (th1 th1Var4 = ((u60) th1VarM4952m).f11116w; th1Var4 != null; th1Var4 = th1Var4.f10762m) {
                                                if ((th1Var4.f10759j & 1024) != 0) {
                                                    i11++;
                                                    if (i11 == 1) {
                                                        th1VarM4952m = th1Var4;
                                                    } else {
                                                        if (zk1Var == null) {
                                                            zk1Var = new zk1(new th1[16]);
                                                        }
                                                        if (th1VarM4952m != null) {
                                                            zk1Var.m6423b(th1VarM4952m);
                                                            th1VarM4952m = null;
                                                        }
                                                        zk1Var.m6423b(th1Var4);
                                                    }
                                                }
                                            }
                                            if (i11 == 1) {
                                            }
                                        }
                                        th1VarM4952m = sp0.m4952m(zk1Var);
                                    }
                                }
                            }
                            aw2Var.f421x.mo6a();
                            o12Var2.m3463a();
                            o12Var3 = o12Var;
                            yw2Var4 = yw2Var3;
                            this.f13520l = yw2Var4;
                            this.f13521m = o12Var3;
                            this.f13522n = null;
                            this.f13519k = 3;
                            i12Var3 = i12Var2;
                            objM6363a2 = yw2Var4.m6363a(i12Var3, this);
                            if (objM6363a2 == k20Var) {
                            }
                            List list3 = ((h12) objM6363a2).f3776a;
                            size2 = list3.size();
                            i3 = 0;
                            while (true) {
                                if (i3 < size2) {
                                }
                                i3++;
                            }
                            o12Var4 = (o12) obj3;
                            if (o12Var4 != null) {
                            }
                        }
                    } else if (i8 == 3) {
                        o12Var3 = (o12) this.f13521m;
                        yw2Var4 = (yw2) this.f13520l;
                        fg1.m1627T(obj);
                        objM6363a2 = obj;
                        i12Var3 = i12Var4;
                        List list32 = ((h12) objM6363a2).f3776a;
                        size2 = list32.size();
                        i3 = 0;
                        while (true) {
                            if (i3 < size2) {
                                obj3 = list32.get(i3);
                                o12 o12Var8 = (o12) obj3;
                                if (o12Var8.m3464b() || !up0.m5553s(o12Var8.f7420a, o12Var3.f7420a) || !o12Var8.f7423d) {
                                    i3++;
                                }
                            } else {
                                obj3 = null;
                            }
                        }
                        o12Var4 = (o12) obj3;
                        if (o12Var4 != null) {
                            o12Var4.m3463a();
                            i12Var2 = i12Var3;
                            this.f13520l = yw2Var4;
                            this.f13521m = o12Var3;
                            this.f13522n = null;
                            this.f13519k = 3;
                            i12Var3 = i12Var2;
                            objM6363a2 = yw2Var4.m6363a(i12Var3, this);
                            if (objM6363a2 == k20Var) {
                            }
                            List list322 = ((h12) objM6363a2).f3776a;
                            size2 = list322.size();
                            i3 = 0;
                            while (true) {
                                if (i3 < size2) {
                                }
                                i3++;
                            }
                            o12Var4 = (o12) obj3;
                            if (o12Var4 != null) {
                            }
                        }
                    } else {
                        C0676s.m4653l("call to 'resume' before 'invoke' with coroutine");
                    }
                    break;
                } else {
                    fg1.m1627T(obj);
                    yw2Var2 = (yw2) this.f13520l;
                    this.f13520l = yw2Var2;
                    this.f13519k = 1;
                    objM304a = ay2.m304a(yw2Var2, true, i12Var4, this);
                    if (objM304a == k20Var) {
                    }
                }
                o12 o12Var9 = (o12) objM304a;
                int i12 = o12Var9.f7428i;
                long j = o12Var9.f7422c;
                if (i12 == 3 || i12 == 4) {
                    int i13 = (int) (j >> 32);
                    if (Float.intBitsToFloat(i13) >= 0.0f && Float.intBitsToFloat(i13) < ((int) (yw2Var2.f13658m.f14130E >> 32))) {
                        int i14 = (int) (j & 4294967295L);
                        if (Float.intBitsToFloat(i14) >= 0.0f && Float.intBitsToFloat(i14) < ((int) (4294967295L & yw2Var2.f13658m.f14130E))) {
                            z = true;
                        }
                        yw2Var3 = yw2Var2;
                        i12Var = (!aw2Var.f422y || z) ? i12Var4 : i12.f4217i;
                        o12Var = o12Var9;
                        this.f13520l = yw2Var3;
                        this.f13521m = o12Var;
                        this.f13522n = i12Var;
                        this.f13519k = 2;
                        objM6363a = yw2Var3.m6363a(i12Var, this);
                        if (objM6363a == k20Var) {
                        }
                        h12 h12Var222 = (h12) objM6363a;
                        List list222 = h12Var222.f3776a;
                        size = list222.size();
                        i = 0;
                        while (true) {
                            if (i >= size) {
                            }
                            i = i2 + 1;
                            i12Var4 = i12Var2;
                        }
                        o12Var2 = (o12) obj2;
                        if (o12Var2 == null) {
                        }
                        o12Var2 = null;
                        if (o12Var2 != null) {
                        }
                    }
                    z = false;
                    yw2Var3 = yw2Var2;
                    i12Var = (!aw2Var.f422y || z) ? i12Var4 : i12.f4217i;
                    o12Var = o12Var9;
                    this.f13520l = yw2Var3;
                    this.f13521m = o12Var;
                    this.f13522n = i12Var;
                    this.f13519k = 2;
                    objM6363a = yw2Var3.m6363a(i12Var, this);
                    if (objM6363a == k20Var) {
                    }
                    h12 h12Var2222 = (h12) objM6363a;
                    List list2222 = h12Var2222.f3776a;
                    size = list2222.size();
                    i = 0;
                    while (true) {
                        if (i >= size) {
                        }
                        i = i2 + 1;
                        i12Var4 = i12Var2;
                    }
                    o12Var2 = (o12) obj2;
                    if (o12Var2 == null) {
                    }
                    o12Var2 = null;
                    if (o12Var2 != null) {
                    }
                }
                break;
        }
        return a83Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ym2(aw2 aw2Var, t00 t00Var) {
        super(2, t00Var);
        this.f13523o = aw2Var;
    }
}
