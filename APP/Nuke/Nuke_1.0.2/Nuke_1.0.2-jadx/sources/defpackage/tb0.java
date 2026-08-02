package defpackage;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class tb0 extends w92 implements mn0 {
    public h12 j;
    public int k;
    public int l;
    public /* synthetic */ Object m;
    public final /* synthetic */ y62 n;
    public final /* synthetic */ o72 o;
    public final /* synthetic */ o72 p;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tb0(y62 y62Var, o72 o72Var, o72 o72Var2, t00 t00Var) {
        super(2, t00Var);
        this.n = y62Var;
        this.o = o72Var;
        this.p = o72Var2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.mn0
    public final Object g(Object obj, Object obj2) {
        return ((tb0) p((t00) obj2, (yw2) obj)).r(a83.a);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.rj
    public final t00 p(t00 t00Var, Object obj) {
        tb0 tb0Var = new tb0(this.n, this.o, this.p, t00Var);
        tb0Var.m = obj;
        return tb0Var;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0091, code lost:
    
        r1 = 1;
     */
    /* JADX WARN: Removed duplicated region for block: B:12:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0131  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00ce A[EDGE_INSN: B:69:0x00ce->B:45:0x00ce BREAK  A[LOOP:0: B:40:0x00bb->B:44:0x00cb], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0068 A[SYNTHETIC] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:38:0x00af -> B:39:0x00b2). Please report as a decompilation issue!!! */
    @Override // defpackage.rj
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object r(Object obj) {
        yw2 yw2Var;
        int i;
        Object objA;
        h12 h12Var;
        int size;
        int i2;
        int size2;
        int i3;
        Object objA2;
        Object obj2;
        Object obj3;
        int i4 = this.l;
        h12 h12Var2 = null;
        int i5 = 2;
        int i6 = 1;
        k20 k20Var = k20.h;
        if (i4 == 0) {
            fg1.T(obj);
            yw2Var = (yw2) this.m;
            i = 0;
            if (i != 0) {
            }
        } else {
            if (i4 == 1) {
                i = this.k;
                yw2Var = (yw2) this.m;
                fg1.T(obj);
                objA = obj;
                h12Var = (h12) objA;
                List list = h12Var.a;
                size = list.size();
                i2 = 0;
                while (true) {
                    if (i2 >= size) {
                    }
                    i2++;
                }
                List list2 = h12Var.a;
                size2 = list2.size();
                while (i3 < size2) {
                }
                if (h12Var.c != i5) {
                }
                this.m = yw2Var;
                this.j = h12Var;
                this.k = i;
                this.l = i5;
                objA2 = yw2Var.a(i12.j, this);
                if (objA2 != k20Var) {
                }
                return k20Var;
            }
            if (i4 != 2) {
                s.l("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            i = this.k;
            h12 h12Var3 = this.j;
            yw2 yw2Var2 = (yw2) this.m;
            fg1.T(obj);
            int i7 = 1;
            objA2 = obj;
            List list3 = ((h12) objA2).a;
            int size3 = list3.size();
            int i8 = 0;
            while (true) {
                if (i8 >= size3) {
                    break;
                }
                if (((o12) list3.get(i8)).b()) {
                    i = i7;
                    break;
                }
                i8++;
            }
            o72 o72Var = this.o;
            boolean zE = yb0.e(h12Var3, ((o12) o72Var.i).a);
            List list4 = h12Var3.a;
            o72 o72Var2 = this.p;
            if (!zE) {
                int size4 = list4.size();
                int i9 = 0;
                while (true) {
                    if (i9 >= size4) {
                        obj3 = h12Var2;
                        break;
                    }
                    obj3 = list4.get(i9);
                    if (((o12) obj3).d) {
                        break;
                    }
                    i9++;
                }
                o12 o12Var = (o12) obj3;
                if (o12Var == null) {
                    i = i7;
                    i6 = i;
                    yw2Var = yw2Var2;
                    if (i != 0) {
                        return a83.a;
                    }
                    this.m = yw2Var;
                    this.j = h12Var2;
                    this.k = i;
                    this.l = i6;
                    objA = yw2Var.a(i12.i, this);
                    if (objA != k20Var) {
                        h12Var = (h12) objA;
                        List list5 = h12Var.a;
                        size = list5.size();
                        i2 = 0;
                        while (true) {
                            if (i2 >= size) {
                                i = i6;
                                break;
                            }
                            if (!tp0.q((o12) list5.get(i2))) {
                                break;
                            }
                            i2++;
                        }
                        List list22 = h12Var.a;
                        size2 = list22.size();
                        for (i3 = 0; i3 < size2; i3++) {
                            o12 o12Var2 = (o12) list22.get(i3);
                            if (o12Var2.b() || tp0.z(o12Var2, yw2Var.m.E, yw2Var.c())) {
                                break;
                            }
                        }
                        if (h12Var.c != i5) {
                            i7 = 1;
                            this.n.h = true;
                            i = 1;
                        } else {
                            i7 = 1;
                        }
                        this.m = yw2Var;
                        this.j = h12Var;
                        this.k = i;
                        this.l = i5;
                        objA2 = yw2Var.a(i12.j, this);
                        if (objA2 != k20Var) {
                            yw2Var2 = yw2Var;
                            h12Var3 = h12Var;
                            List list32 = ((h12) objA2).a;
                            int size32 = list32.size();
                            int i82 = 0;
                            while (true) {
                                if (i82 >= size32) {
                                }
                                i82++;
                            }
                            o72 o72Var3 = this.o;
                            boolean zE2 = yb0.e(h12Var3, ((o12) o72Var3.i).a);
                            List list42 = h12Var3.a;
                            o72 o72Var22 = this.p;
                            if (!zE2) {
                                int size5 = list42.size();
                                int i10 = 0;
                                while (true) {
                                    if (i10 >= size5) {
                                        obj2 = null;
                                        break;
                                    }
                                    obj2 = list42.get(i10);
                                    if (up0.s(((o12) obj2).a, ((o12) o72Var3.i).a)) {
                                        break;
                                    }
                                    i10++;
                                }
                                o72Var22.i = obj2;
                            }
                        }
                    }
                    return k20Var;
                }
                o72Var3.i = o12Var;
                o72Var22.i = o12Var;
            }
            yw2Var = yw2Var2;
            h12Var2 = null;
            i5 = 2;
            i6 = 1;
            if (i != 0) {
            }
        }
    }
}
