package defpackage;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class h62 extends tw2 implements nn0 {
    public List l;
    public List m;
    public List n;
    public sk1 o;
    public sk1 p;
    public sk1 q;
    public Set r;
    public sk1 s;
    public int t;
    public /* synthetic */ xb u;
    public final /* synthetic */ i62 v;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h62(i62 i62Var, t00 t00Var) {
        super(3, t00Var);
        this.v = i62Var;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00fd  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void t(i62 i62Var, List list, List list2, List list3, sk1 sk1Var, sk1 sk1Var2, sk1 sk1Var3, sk1 sk1Var4) {
        char c;
        long j;
        long j2;
        synchronized (i62Var.c) {
            try {
                list.clear();
                list2.clear();
                int size = list3.size();
                for (int i = 0; i < size; i++) {
                    fy fyVar = (fy) list3.get(i);
                    fyVar.a();
                    i62Var.L(fyVar);
                }
                list3.clear();
                Object[] objArr = sk1Var.b;
                long[] jArr = sk1Var.a;
                int length = jArr.length - 2;
                if (length >= 0) {
                    int i2 = 0;
                    j = 255;
                    while (true) {
                        long j3 = jArr[i2];
                        c = 7;
                        j2 = -9187201950435737472L;
                        if ((((~j3) << 7) & j3 & (-9187201950435737472L)) != -9187201950435737472L) {
                            int i3 = 8 - ((~(i2 - length)) >>> 31);
                            for (int i4 = 0; i4 < i3; i4++) {
                                if ((j3 & 255) < 128) {
                                    fy fyVar2 = (fy) objArr[(i2 << 3) + i4];
                                    fyVar2.a();
                                    i62Var.L(fyVar2);
                                }
                                j3 >>= 8;
                            }
                            if (i3 != 8) {
                                break;
                            } else if (i2 == length) {
                                break;
                            } else {
                                i2++;
                            }
                        }
                    }
                } else {
                    c = 7;
                    j = 255;
                    j2 = -9187201950435737472L;
                }
                sk1Var.b();
                Object[] objArr2 = sk1Var2.b;
                long[] jArr2 = sk1Var2.a;
                int length2 = jArr2.length - 2;
                if (length2 >= 0) {
                    int i5 = 0;
                    while (true) {
                        long j4 = jArr2[i5];
                        if ((((~j4) << c) & j4 & j2) != j2) {
                            int i6 = 8 - ((~(i5 - length2)) >>> 31);
                            for (int i7 = 0; i7 < i6; i7++) {
                                if ((j4 & j) < 128) {
                                    ((fy) objArr2[(i5 << 3) + i7]).g();
                                }
                                j4 >>= 8;
                            }
                            if (i6 != 8) {
                                break;
                            } else if (i5 == length2) {
                                break;
                            } else {
                                i5++;
                            }
                        }
                    }
                }
                sk1Var2.b();
                sk1Var3.b();
                Object[] objArr3 = sk1Var4.b;
                long[] jArr3 = sk1Var4.a;
                int length3 = jArr3.length - 2;
                if (length3 >= 0) {
                    int i8 = 0;
                    while (true) {
                        long j5 = jArr3[i8];
                        if ((((~j5) << c) & j5 & j2) != j2) {
                            int i9 = 8 - ((~(i8 - length3)) >>> 31);
                            for (int i10 = 0; i10 < i9; i10++) {
                                if ((j5 & j) < 128) {
                                    fy fyVar3 = (fy) objArr3[(i8 << 3) + i10];
                                    fyVar3.a();
                                    i62Var.L(fyVar3);
                                }
                                j5 >>= 8;
                            }
                            if (i9 != 8) {
                                break;
                            } else if (i8 == length3) {
                                break;
                            } else {
                                i8++;
                            }
                        }
                    }
                }
                sk1Var4.b();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final void u(List list, i62 i62Var) {
        list.clear();
        synchronized (i62Var.c) {
            try {
                ArrayList arrayList = i62Var.k;
                int size = arrayList.size();
                for (int i = 0; i < size; i++) {
                    list.add((ui1) arrayList.get(i));
                }
                i62Var.k.clear();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.nn0
    public final Object e(Object obj, Object obj2, Object obj3) {
        h62 h62Var = new h62(this.v, (t00) obj3);
        h62Var.u = (xb) obj2;
        h62Var.r(a83.a);
        return k20.h;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0098 A[DONT_GENERATE] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x01d9  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0131 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:43:0x0124 -> B:44:0x012c). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:62:0x01d9 -> B:12:0x0093). Please report as a decompilation issue!!! */
    @Override // defpackage.rj
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object r(Object obj) {
        xb xbVar;
        sk1 sk1Var;
        sk1 sk1Var2;
        List list;
        Set set;
        List list2;
        sk1 sk1Var3;
        List list3;
        sk1 sk1Var4;
        List list4;
        sk1 sk1Var5;
        List list5;
        sk1 sk1Var6;
        i62 i62Var;
        Object objT;
        mp mpVar;
        k20 k20Var;
        xb xbVar2;
        lk1 lk1Var;
        k20 k20Var2 = k20.h;
        int i = this.t;
        int i2 = 2;
        int i3 = 1;
        if (i == 0) {
            fg1.T(obj);
            xbVar = this.u;
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            ArrayList arrayList3 = new ArrayList();
            sk1 sk1Var7 = fd2.a;
            sk1Var = new sk1();
            sk1 sk1Var8 = new sk1();
            sk1 sk1Var9 = new sk1();
            gd2 gd2Var = new gd2(sk1Var9);
            sk1Var2 = new sk1();
            list = arrayList;
            set = gd2Var;
            list2 = arrayList2;
            sk1Var3 = sk1Var9;
            list3 = arrayList3;
            sk1Var4 = sk1Var8;
            synchronized (this.v.c) {
            }
        } else {
            if (i != 1) {
                if (i != 2) {
                    s.l("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                sk1 sk1Var10 = this.s;
                set = this.r;
                sk1Var3 = this.q;
                sk1Var4 = this.p;
                sk1Var = this.o;
                list3 = this.n;
                list2 = this.m;
                list = this.l;
                xb xbVar3 = this.u;
                fg1.T(obj);
                sk1Var2 = sk1Var10;
                xbVar = xbVar3;
                i62 i62Var2 = this.v;
                synchronized (i62Var2.c) {
                    try {
                        if (i62Var2.l.j()) {
                            lk1 lk1VarB = rj1.b(i62Var2.l);
                            i62Var2.l.a();
                            sz0 sz0Var = i62Var2.m;
                            ((rk1) sz0Var.i).a();
                            ((rk1) sz0Var.j).a();
                            i62Var2.o.a();
                            lk1Var = new lk1(lk1VarB.b);
                            Object[] objArr = lk1VarB.a;
                            int i4 = lk1VarB.b;
                            k20Var = k20Var2;
                            int i5 = 0;
                            while (i5 < i4) {
                                int i6 = i5;
                                ui1 ui1Var = (ui1) objArr[i5];
                                lk1Var.a(new ow1(ui1Var, i62Var2.n.g(ui1Var)));
                                i5 = i6 + 1;
                                xbVar = xbVar;
                                objArr = objArr;
                            }
                            xbVar2 = xbVar;
                            i62Var2.n.a();
                        } else {
                            k20Var = k20Var2;
                            xbVar2 = xbVar;
                            lk1Var = js1.b;
                            lk1Var.getClass();
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                Object[] objArr2 = lk1Var.a;
                int i7 = lk1Var.b;
                for (int i8 = 0; i8 < i7; i8++) {
                    ow1 ow1Var = (ow1) objArr2[i8];
                }
                b5 b5Var = this.v.b;
                ((xg) b5Var.i).set(0);
                ((cj) b5Var.j).g(new vi1(18));
                k20Var2 = k20Var;
                xbVar = xbVar2;
                i2 = 2;
                i3 = 1;
                synchronized (this.v.c) {
                }
                i62 i62Var3 = this.v;
                this.u = xbVar;
                this.l = list;
                this.m = list2;
                this.n = list3;
                this.o = sk1Var;
                this.p = sk1Var4;
                this.q = sk1Var3;
                this.r = set;
                this.s = sk1Var2;
                this.t = i3;
                if (i62Var3.C()) {
                    objT = a83.a;
                } else {
                    mp mpVar2 = new mp(i3, gf1.z(this));
                    mpVar2.u();
                    synchronized (i62Var3.c) {
                        if (i62Var3.C()) {
                            mpVar = mpVar2;
                        } else {
                            i62Var3.r = mpVar2;
                            mpVar = null;
                        }
                    }
                    if (mpVar != null) {
                        mpVar.h(a83.a);
                    }
                    objT = mpVar2.t();
                    if (objT != k20.h) {
                        objT = a83.a;
                    }
                }
                if (objT != k20Var2) {
                    List list6 = list;
                    sk1Var5 = sk1Var;
                    sk1Var6 = sk1Var2;
                    list4 = list3;
                    list5 = list6;
                    Set set2 = set;
                    sk1 sk1Var11 = sk1Var4;
                    sk1 sk1Var12 = sk1Var3;
                    i62Var = this.v;
                    ju2 ju2Var = i62.z;
                    if (i62Var.K()) {
                        List list7 = list4;
                        sk1Var2 = sk1Var6;
                        sk1Var = sk1Var5;
                        list = list5;
                        list3 = list7;
                        sk1Var3 = sk1Var12;
                        sk1Var4 = sk1Var11;
                        set = set2;
                        synchronized (this.v.c) {
                        }
                    } else {
                        of ofVar = new of(this.v, sk1Var12, sk1Var6, list5, list2, sk1Var5, list4, sk1Var11, set2);
                        this.u = xbVar;
                        this.l = list5;
                        this.m = list2;
                        this.n = list4;
                        this.o = sk1Var5;
                        this.p = sk1Var11;
                        this.q = sk1Var12;
                        this.r = set2;
                        this.s = sk1Var6;
                        this.t = i2;
                        if (xbVar.a(ofVar, this) != k20Var2) {
                            List list8 = list4;
                            sk1Var2 = sk1Var6;
                            sk1Var = sk1Var5;
                            list = list5;
                            list3 = list8;
                            sk1Var3 = sk1Var12;
                            sk1Var4 = sk1Var11;
                            set = set2;
                            i62 i62Var22 = this.v;
                            synchronized (i62Var22.c) {
                            }
                        }
                    }
                }
                return k20Var2;
            }
            sk1 sk1Var13 = this.s;
            set = this.r;
            sk1Var3 = this.q;
            sk1Var4 = this.p;
            sk1 sk1Var14 = this.o;
            List list9 = this.n;
            list2 = this.m;
            List list10 = this.l;
            xb xbVar4 = this.u;
            fg1.T(obj);
            sk1Var6 = sk1Var13;
            xbVar = xbVar4;
            list4 = list9;
            list5 = list10;
            sk1Var5 = sk1Var14;
            Set set22 = set;
            sk1 sk1Var112 = sk1Var4;
            sk1 sk1Var122 = sk1Var3;
            i62Var = this.v;
            ju2 ju2Var2 = i62.z;
            if (i62Var.K()) {
            }
        }
    }
}
