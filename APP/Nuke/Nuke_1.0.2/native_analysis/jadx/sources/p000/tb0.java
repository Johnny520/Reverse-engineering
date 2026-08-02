package p000;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class tb0 extends w92 implements mn0 {

    /* JADX INFO: renamed from: j */
    public h12 f10659j;

    /* JADX INFO: renamed from: k */
    public int f10660k;

    /* JADX INFO: renamed from: l */
    public int f10661l;

    /* JADX INFO: renamed from: m */
    public /* synthetic */ Object f10662m;

    /* JADX INFO: renamed from: n */
    public final /* synthetic */ y62 f10663n;

    /* JADX INFO: renamed from: o */
    public final /* synthetic */ o72 f10664o;

    /* JADX INFO: renamed from: p */
    public final /* synthetic */ o72 f10665p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tb0(y62 y62Var, o72 o72Var, o72 o72Var2, t00 t00Var) {
        super(2, t00Var);
        this.f10663n = y62Var;
        this.f10664o = o72Var;
        this.f10665p = o72Var2;
    }

    @Override // p000.mn0
    /* JADX INFO: renamed from: g */
    public final Object mo12g(Object obj, Object obj2) {
        return ((tb0) mo13p((t00) obj2, (yw2) obj)).mo7r(a83.f116a);
    }

    @Override // p000.AbstractC0658rj
    /* JADX INFO: renamed from: p */
    public final t00 mo13p(t00 t00Var, Object obj) {
        tb0 tb0Var = new tb0(this.f10663n, this.f10664o, this.f10665p, t00Var);
        tb0Var.f10662m = obj;
        return tb0Var;
    }

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
    @Override // p000.AbstractC0658rj
    /* JADX INFO: renamed from: r */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object mo7r(Object obj) {
        yw2 yw2Var;
        int i;
        Object objM6363a;
        h12 h12Var;
        int size;
        int i2;
        int size2;
        int i3;
        Object objM6363a2;
        Object obj2;
        Object obj3;
        int i4 = this.f10661l;
        h12 h12Var2 = null;
        int i5 = 2;
        int i6 = 1;
        k20 k20Var = k20.f5323h;
        if (i4 == 0) {
            fg1.m1627T(obj);
            yw2Var = (yw2) this.f10662m;
            i = 0;
            if (i != 0) {
            }
        } else {
            if (i4 == 1) {
                i = this.f10660k;
                yw2Var = (yw2) this.f10662m;
                fg1.m1627T(obj);
                objM6363a = obj;
                h12Var = (h12) objM6363a;
                List list = h12Var.f3776a;
                size = list.size();
                i2 = 0;
                while (true) {
                    if (i2 >= size) {
                    }
                    i2++;
                }
                List list2 = h12Var.f3776a;
                size2 = list2.size();
                while (i3 < size2) {
                }
                if (h12Var.f3778c != i5) {
                }
                this.f10662m = yw2Var;
                this.f10659j = h12Var;
                this.f10660k = i;
                this.f10661l = i5;
                objM6363a2 = yw2Var.m6363a(i12.f4218j, this);
                if (objM6363a2 != k20Var) {
                }
                return k20Var;
            }
            if (i4 != 2) {
                C0676s.m4653l("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            i = this.f10660k;
            h12 h12Var3 = this.f10659j;
            yw2 yw2Var2 = (yw2) this.f10662m;
            fg1.m1627T(obj);
            int i7 = 1;
            objM6363a2 = obj;
            List list3 = ((h12) objM6363a2).f3776a;
            int size3 = list3.size();
            int i8 = 0;
            while (true) {
                if (i8 >= size3) {
                    break;
                }
                if (((o12) list3.get(i8)).m3464b()) {
                    i = i7;
                    break;
                }
                i8++;
            }
            o72 o72Var = this.f10664o;
            boolean zM6245e = yb0.m6245e(h12Var3, ((o12) o72Var.f7574i).f7420a);
            List list4 = h12Var3.f3776a;
            o72 o72Var2 = this.f10665p;
            if (!zM6245e) {
                int size4 = list4.size();
                int i9 = 0;
                while (true) {
                    if (i9 >= size4) {
                        obj3 = h12Var2;
                        break;
                    }
                    obj3 = list4.get(i9);
                    if (((o12) obj3).f7423d) {
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
                        return a83.f116a;
                    }
                    this.f10662m = yw2Var;
                    this.f10659j = h12Var2;
                    this.f10660k = i;
                    this.f10661l = i6;
                    objM6363a = yw2Var.m6363a(i12.f4217i, this);
                    if (objM6363a != k20Var) {
                        h12Var = (h12) objM6363a;
                        List list5 = h12Var.f3776a;
                        size = list5.size();
                        i2 = 0;
                        while (true) {
                            if (i2 >= size) {
                                i = i6;
                                break;
                            }
                            if (!tp0.m5369q((o12) list5.get(i2))) {
                                break;
                            }
                            i2++;
                        }
                        List list22 = h12Var.f3776a;
                        size2 = list22.size();
                        for (i3 = 0; i3 < size2; i3++) {
                            o12 o12Var2 = (o12) list22.get(i3);
                            if (o12Var2.m3464b() || tp0.m5375z(o12Var2, yw2Var.f13658m.f14130E, yw2Var.m6364c())) {
                                break;
                            }
                        }
                        if (h12Var.f3778c != i5) {
                            i7 = 1;
                            this.f10663n.f13324h = true;
                            i = 1;
                        } else {
                            i7 = 1;
                        }
                        this.f10662m = yw2Var;
                        this.f10659j = h12Var;
                        this.f10660k = i;
                        this.f10661l = i5;
                        objM6363a2 = yw2Var.m6363a(i12.f4218j, this);
                        if (objM6363a2 != k20Var) {
                            yw2Var2 = yw2Var;
                            h12Var3 = h12Var;
                            List list32 = ((h12) objM6363a2).f3776a;
                            int size32 = list32.size();
                            int i82 = 0;
                            while (true) {
                                if (i82 >= size32) {
                                }
                                i82++;
                            }
                            o72 o72Var3 = this.f10664o;
                            boolean zM6245e2 = yb0.m6245e(h12Var3, ((o12) o72Var3.f7574i).f7420a);
                            List list42 = h12Var3.f3776a;
                            o72 o72Var22 = this.f10665p;
                            if (!zM6245e2) {
                                int size5 = list42.size();
                                int i10 = 0;
                                while (true) {
                                    if (i10 >= size5) {
                                        obj2 = null;
                                        break;
                                    }
                                    obj2 = list42.get(i10);
                                    if (up0.m5553s(((o12) obj2).f7420a, ((o12) o72Var3.f7574i).f7420a)) {
                                        break;
                                    }
                                    i10++;
                                }
                                o72Var22.f7574i = obj2;
                            }
                        }
                    }
                    return k20Var;
                }
                o72Var3.f7574i = o12Var;
                o72Var22.f7574i = o12Var;
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
