package defpackage;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class ym2 extends w92 implements mn0 {
    public final /* synthetic */ int j = 1;
    public int k;
    public /* synthetic */ Object l;
    public Object m;
    public Object n;
    public final /* synthetic */ Object o;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ym2(e9 e9Var, er2 er2Var, kz2 kz2Var, t00 t00Var) {
        super(2, t00Var);
        this.m = e9Var;
        this.n = er2Var;
        this.o = kz2Var;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.mn0
    public final Object g(Object obj, Object obj2) {
        int i = this.j;
        a83 a83Var = a83.a;
        yw2 yw2Var = (yw2) obj;
        t00 t00Var = (t00) obj2;
        switch (i) {
        }
        return ((ym2) p(t00Var, yw2Var)).r(a83Var);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.rj
    public final t00 p(t00 t00Var, Object obj) {
        int i = this.j;
        Object obj2 = this.o;
        switch (i) {
            case 0:
                ym2 ym2Var = new ym2((e9) this.m, (er2) this.n, (kz2) obj2, t00Var);
                ym2Var.l = obj;
                return ym2Var;
            default:
                ym2 ym2Var2 = new ym2((aw2) obj2, t00Var);
                ym2Var2.l = obj;
                return ym2Var2;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
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
    @Override // defpackage.rj
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object r(Object obj) {
        yw2 yw2Var;
        Object objB;
        boolean zA;
        yw2 yw2Var2;
        Object objA;
        boolean z;
        yw2 yw2Var3;
        i12 i12Var;
        o12 o12Var;
        Object objA2;
        int size;
        int i;
        i12 i12Var2;
        Object obj2;
        o12 o12Var2;
        o12 o12Var3;
        yw2 yw2Var4;
        int i2;
        i12 i12Var3;
        Object objA3;
        int size2;
        int i3;
        Object obj3;
        o12 o12Var4;
        int i4 = this.j;
        k20 k20Var = k20.h;
        a83 a83Var = a83.a;
        Object obj4 = this.o;
        switch (i4) {
            case 0:
                e9 e9Var = (e9) this.m;
                int i5 = this.k;
                if (i5 != 0) {
                    if (i5 == 1) {
                        yw2Var = (yw2) this.l;
                        fg1.T(obj);
                        objB = obj;
                    } else if (i5 == 2 || i5 == 3 || i5 == 4) {
                        fg1.T(obj);
                    } else {
                        s.l("call to 'resume' before 'invoke' with coroutine");
                    }
                    break;
                } else {
                    fg1.T(obj);
                    yw2Var = (yw2) this.l;
                    this.l = yw2Var;
                    this.k = 1;
                    objB = p40.b(yw2Var, this);
                    if (objB == k20Var) {
                    }
                }
                h12 h12Var = (h12) objB;
                za3 za3Var = (za3) e9Var.j;
                o12 o12Var5 = (o12) e9Var.k;
                o12 o12Var6 = (o12) h12Var.a.get(0);
                if (o12Var5 == null || o12Var6.b - o12Var5.b >= za3Var.b()) {
                    e9Var.i = 1;
                    e9Var.k = o12Var6;
                    zA = dn2.a(h12Var);
                    if (!zA && (h12Var.d & 33) != 0) {
                        List list = h12Var.a;
                        int size3 = list.size();
                        for (int i6 = 0; i6 < size3; i6++) {
                            if (((o12) list.get(i6)).b()) {
                                if (!zA) {
                                }
                            }
                        }
                        er2 er2Var = (er2) this.n;
                        this.l = null;
                        this.k = 2;
                        if (p40.O(yw2Var, er2Var, e9Var, h12Var, this) == k20Var) {
                        }
                    } else if (!zA) {
                        int i7 = e9Var.i;
                        kz2 kz2Var = (kz2) obj4;
                        if (i7 == 1) {
                            this.l = null;
                            this.k = 3;
                            if (p40.Z(yw2Var, kz2Var, h12Var, this) == k20Var) {
                            }
                        } else {
                            this.l = null;
                            this.k = 4;
                            if (p40.g(yw2Var, kz2Var, h12Var, i7, this) == k20Var) {
                            }
                        }
                    }
                } else {
                    if (rs1.c(rs1.d(o12Var5.c, o12Var6.c)) < yb0.f(za3Var, o12Var5.i)) {
                        e9Var.i++;
                    }
                    e9Var.k = o12Var6;
                    zA = dn2.a(h12Var);
                    if (!zA) {
                        if (!zA) {
                        }
                    }
                }
                break;
            default:
                aw2 aw2Var = (aw2) obj4;
                int i8 = this.k;
                i12 i12Var4 = i12.h;
                if (i8 != 0) {
                    if (i8 == 1) {
                        yw2Var2 = (yw2) this.l;
                        fg1.T(obj);
                        objA = obj;
                    } else if (i8 == 2) {
                        i12Var = (i12) this.n;
                        o12Var = (o12) this.m;
                        yw2Var3 = (yw2) this.l;
                        fg1.T(obj);
                        objA2 = obj;
                        h12 h12Var2 = (h12) objA2;
                        List list2 = h12Var2.a;
                        size = list2.size();
                        i = 0;
                        while (true) {
                            if (i >= size) {
                                obj2 = list2.get(i);
                                o12 o12Var7 = (o12) obj2;
                                if (o12Var7.b()) {
                                    i2 = i;
                                    i12Var2 = i12Var4;
                                } else {
                                    i12Var2 = i12Var4;
                                    i2 = i;
                                    if (!up0.s(o12Var7.a, o12Var.a) || !o12Var7.d) {
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
                        if (o12Var2 == null || o12Var2.b - o12Var.b >= yw2Var3.e().c() || h12Var2.c == 2) {
                            o12Var2 = null;
                        } else if (rs1.c(rs1.d(o12Var2.c, o12Var.c)) <= yw2Var3.e().e()) {
                            i12Var4 = i12Var2;
                            this.l = yw2Var3;
                            this.m = o12Var;
                            this.n = i12Var;
                            this.k = 2;
                            objA2 = yw2Var3.a(i12Var, this);
                            if (objA2 == k20Var) {
                            }
                            h12 h12Var22 = (h12) objA2;
                            List list22 = h12Var22.a;
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
                                if (rs1.c(rs1.d(o12Var2.c, o12Var.c)) <= yw2Var3.e().e()) {
                                }
                            }
                            o12Var2 = null;
                        }
                        if (o12Var2 != null) {
                            if (!aw2Var.y) {
                                th1 th1VarM = aw2Var.h;
                                zk1 zk1Var = null;
                                while (true) {
                                    if (th1VarM == null) {
                                        if (!aw2Var.h.u) {
                                            kz0.b("visitChildren called on an unattached node");
                                        }
                                        zk1 zk1Var2 = new zk1(new th1[16]);
                                        th1 th1Var = aw2Var.h;
                                        th1 th1Var2 = th1Var.m;
                                        if (th1Var2 == null) {
                                            sp0.k(zk1Var2, th1Var);
                                        } else {
                                            zk1Var2.b(th1Var2);
                                        }
                                        while (true) {
                                            int i9 = zk1Var2.j;
                                            if (i9 != 0) {
                                                th1 th1VarM2 = (th1) zk1Var2.k(i9 - 1);
                                                if ((th1VarM2.k & 1024) == 0) {
                                                    sp0.k(zk1Var2, th1VarM2);
                                                } else {
                                                    while (true) {
                                                        if (th1VarM2 == null) {
                                                        }
                                                        if ((th1VarM2.j & 1024) != 0) {
                                                            zk1 zk1Var3 = null;
                                                            while (th1VarM2 != null) {
                                                                if (th1VarM2 instanceof pl0) {
                                                                    ((pl0) th1VarM2).T0(7);
                                                                } else {
                                                                    if ((th1VarM2.j & 1024) != 0 && (th1VarM2 instanceof u60)) {
                                                                        int i10 = 0;
                                                                        for (th1 th1Var3 = ((u60) th1VarM2).w; th1Var3 != null; th1Var3 = th1Var3.m) {
                                                                            if ((th1Var3.j & 1024) != 0) {
                                                                                i10++;
                                                                                if (i10 == 1) {
                                                                                    th1VarM2 = th1Var3;
                                                                                } else {
                                                                                    if (zk1Var3 == null) {
                                                                                        zk1Var3 = new zk1(new th1[16]);
                                                                                    }
                                                                                    if (th1VarM2 != null) {
                                                                                        zk1Var3.b(th1VarM2);
                                                                                        th1VarM2 = null;
                                                                                    }
                                                                                    zk1Var3.b(th1Var3);
                                                                                }
                                                                            }
                                                                        }
                                                                        if (i10 == 1) {
                                                                        }
                                                                    }
                                                                    th1VarM2 = sp0.m(zk1Var3);
                                                                }
                                                            }
                                                        } else {
                                                            th1VarM2 = th1VarM2.m;
                                                        }
                                                    }
                                                }
                                                break;
                                            }
                                        }
                                    } else if (th1VarM instanceof pl0) {
                                        ((pl0) th1VarM).T0(7);
                                    } else {
                                        if ((th1VarM.j & 1024) != 0 && (th1VarM instanceof u60)) {
                                            int i11 = 0;
                                            for (th1 th1Var4 = ((u60) th1VarM).w; th1Var4 != null; th1Var4 = th1Var4.m) {
                                                if ((th1Var4.j & 1024) != 0) {
                                                    i11++;
                                                    if (i11 == 1) {
                                                        th1VarM = th1Var4;
                                                    } else {
                                                        if (zk1Var == null) {
                                                            zk1Var = new zk1(new th1[16]);
                                                        }
                                                        if (th1VarM != null) {
                                                            zk1Var.b(th1VarM);
                                                            th1VarM = null;
                                                        }
                                                        zk1Var.b(th1Var4);
                                                    }
                                                }
                                            }
                                            if (i11 == 1) {
                                            }
                                        }
                                        th1VarM = sp0.m(zk1Var);
                                    }
                                }
                            }
                            aw2Var.x.a();
                            o12Var2.a();
                            o12Var3 = o12Var;
                            yw2Var4 = yw2Var3;
                            this.l = yw2Var4;
                            this.m = o12Var3;
                            this.n = null;
                            this.k = 3;
                            i12Var3 = i12Var2;
                            objA3 = yw2Var4.a(i12Var3, this);
                            if (objA3 == k20Var) {
                            }
                            List list3 = ((h12) objA3).a;
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
                        o12Var3 = (o12) this.m;
                        yw2Var4 = (yw2) this.l;
                        fg1.T(obj);
                        objA3 = obj;
                        i12Var3 = i12Var4;
                        List list32 = ((h12) objA3).a;
                        size2 = list32.size();
                        i3 = 0;
                        while (true) {
                            if (i3 < size2) {
                                obj3 = list32.get(i3);
                                o12 o12Var8 = (o12) obj3;
                                if (o12Var8.b() || !up0.s(o12Var8.a, o12Var3.a) || !o12Var8.d) {
                                    i3++;
                                }
                            } else {
                                obj3 = null;
                            }
                        }
                        o12Var4 = (o12) obj3;
                        if (o12Var4 != null) {
                            o12Var4.a();
                            i12Var2 = i12Var3;
                            this.l = yw2Var4;
                            this.m = o12Var3;
                            this.n = null;
                            this.k = 3;
                            i12Var3 = i12Var2;
                            objA3 = yw2Var4.a(i12Var3, this);
                            if (objA3 == k20Var) {
                            }
                            List list322 = ((h12) objA3).a;
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
                        s.l("call to 'resume' before 'invoke' with coroutine");
                    }
                    break;
                } else {
                    fg1.T(obj);
                    yw2Var2 = (yw2) this.l;
                    this.l = yw2Var2;
                    this.k = 1;
                    objA = ay2.a(yw2Var2, true, i12Var4, this);
                    if (objA == k20Var) {
                    }
                }
                o12 o12Var9 = (o12) objA;
                int i12 = o12Var9.i;
                long j = o12Var9.c;
                if (i12 == 3 || i12 == 4) {
                    int i13 = (int) (j >> 32);
                    if (Float.intBitsToFloat(i13) >= 0.0f && Float.intBitsToFloat(i13) < ((int) (yw2Var2.m.E >> 32))) {
                        int i14 = (int) (j & 4294967295L);
                        if (Float.intBitsToFloat(i14) >= 0.0f && Float.intBitsToFloat(i14) < ((int) (4294967295L & yw2Var2.m.E))) {
                            z = true;
                        }
                        yw2Var3 = yw2Var2;
                        i12Var = (!aw2Var.y || z) ? i12Var4 : i12.i;
                        o12Var = o12Var9;
                        this.l = yw2Var3;
                        this.m = o12Var;
                        this.n = i12Var;
                        this.k = 2;
                        objA2 = yw2Var3.a(i12Var, this);
                        if (objA2 == k20Var) {
                        }
                        h12 h12Var222 = (h12) objA2;
                        List list222 = h12Var222.a;
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
                    i12Var = (!aw2Var.y || z) ? i12Var4 : i12.i;
                    o12Var = o12Var9;
                    this.l = yw2Var3;
                    this.m = o12Var;
                    this.n = i12Var;
                    this.k = 2;
                    objA2 = yw2Var3.a(i12Var, this);
                    if (objA2 == k20Var) {
                    }
                    h12 h12Var2222 = (h12) objA2;
                    List list2222 = h12Var2222.a;
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
        this.o = aw2Var;
    }
}
