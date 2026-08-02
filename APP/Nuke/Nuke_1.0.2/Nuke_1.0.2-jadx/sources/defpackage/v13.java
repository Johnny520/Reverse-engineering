package defpackage;

import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class v13 extends w92 implements mn0 {
    public final /* synthetic */ int j;
    public Object k;
    public int l;
    public /* synthetic */ Object m;
    public final /* synthetic */ Object n;
    public final /* synthetic */ Object o;
    public final /* synthetic */ Object p;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v13(j20 j20Var, x22 x22Var, nn0 nn0Var, j10 j10Var, t00 t00Var) {
        super(2, t00Var);
        this.j = 2;
        this.k = j20Var;
        this.n = x22Var;
        this.o = nn0Var;
        this.p = j10Var;
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
        return ((v13) p(t00Var, yw2Var)).r(a83Var);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.rj
    public final t00 p(t00 t00Var, Object obj) {
        int i = this.j;
        Object obj2 = this.p;
        Object obj3 = this.o;
        Object obj4 = this.n;
        switch (i) {
            case 0:
                v13 v13Var = new v13((xk1) obj4, (xk1) obj3, (xk1) obj2, t00Var, 0);
                v13Var.m = obj;
                return v13Var;
            case 1:
                v13 v13Var2 = new v13((xk1) obj4, (xk1) obj3, (xk1) obj2, t00Var, 1);
                v13Var2.m = obj;
                return v13Var2;
            default:
                v13 v13Var3 = new v13((j20) this.k, (x22) obj4, (nn0) obj3, (j10) obj2, t00Var);
                v13Var3.m = obj;
                return v13Var3;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x007d, code lost:
    
        if (r4 == r9) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0094, code lost:
    
        if (r7 != r9) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x010d, code lost:
    
        if (r2 == r9) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x0124, code lost:
    
        if (r8 != r9) goto L57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:?, code lost:
    
        return r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:?, code lost:
    
        return r9;
     */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:25:0x0094 -> B:27:0x0098). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:55:0x0124 -> B:57:0x0128). Please report as a decompilation issue!!! */
    @Override // defpackage.rj
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object r(Object obj) {
        int i;
        Object objB;
        o12 o12Var;
        Object objA;
        Object next;
        Object objB2;
        o12 o12Var2;
        Object objA2;
        yw2 yw2Var;
        Object next2;
        int i2 = this.j;
        i12 i12Var = i12.i;
        int i3 = 2;
        a83 a83Var = a83.a;
        Object obj2 = this.p;
        Object obj3 = this.o;
        Object obj4 = this.n;
        k20 k20Var = k20.h;
        switch (i2) {
            case 0:
                xk1 xk1Var = (xk1) obj2;
                xk1 xk1Var2 = (xk1) obj3;
                xk1 xk1Var3 = (xk1) obj4;
                yw2 yw2Var2 = (yw2) this.m;
                int i4 = this.l;
                if (i4 == 0) {
                    fg1.T(obj);
                    this.m = yw2Var2;
                    this.l = 1;
                    i = 2;
                    objB = ay2.b(yw2Var2, this, 2);
                } else if (i4 == 1) {
                    fg1.T(obj);
                    objB = obj;
                    i = 2;
                } else {
                    if (i4 != 2) {
                        s.l("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    o12Var = (o12) this.k;
                    fg1.T(obj);
                    objA = obj;
                    Iterator it = ((h12) objA).a.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            next = it.next();
                            if (up0.s(((o12) next).a, o12Var.a)) {
                            }
                        } else {
                            next = null;
                        }
                    }
                    o12 o12Var3 = (o12) next;
                    if (o12Var3 == null) {
                        return a83Var;
                    }
                    gf1.l(xk1Var3, xk1Var2, xk1Var, o12Var3.c);
                    o12Var3.a();
                    if (!o12Var3.d) {
                        return a83Var;
                    }
                    i = 2;
                    this.m = yw2Var2;
                    this.k = o12Var;
                    this.l = i;
                    objA = yw2Var2.a(i12Var, this);
                }
                o12Var = (o12) objB;
                o12Var.a();
                gf1.l(xk1Var3, xk1Var2, xk1Var, o12Var.c);
                this.m = yw2Var2;
                this.k = o12Var;
                this.l = i;
                objA = yw2Var2.a(i12Var, this);
                break;
            case 1:
                xk1 xk1Var4 = (xk1) obj2;
                xk1 xk1Var5 = (xk1) obj3;
                xk1 xk1Var6 = (xk1) obj4;
                yw2 yw2Var3 = (yw2) this.m;
                int i5 = this.l;
                if (i5 == 0) {
                    fg1.T(obj);
                    this.m = yw2Var3;
                    this.l = 1;
                    objB2 = ay2.b(yw2Var3, this, 2);
                } else if (i5 == 1) {
                    fg1.T(obj);
                    objB2 = obj;
                } else {
                    if (i5 != 2) {
                        s.l("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    o12Var2 = (o12) this.k;
                    fg1.T(obj);
                    objA2 = obj;
                    Iterator it2 = ((h12) objA2).a.iterator();
                    while (true) {
                        if (it2.hasNext()) {
                            next2 = it2.next();
                            yw2Var = yw2Var3;
                            if (!up0.s(((o12) next2).a, o12Var2.a)) {
                                yw2Var3 = yw2Var;
                            }
                        } else {
                            yw2Var = yw2Var3;
                            next2 = null;
                        }
                    }
                    o12 o12Var4 = (o12) next2;
                    if (o12Var4 == null) {
                        return a83Var;
                    }
                    gf1.m(xk1Var6, xk1Var5, xk1Var4, o12Var4.c);
                    o12Var4.a();
                    if (!o12Var4.d) {
                        return a83Var;
                    }
                    yw2Var3 = yw2Var;
                    i3 = 2;
                    this.m = yw2Var3;
                    this.k = o12Var2;
                    this.l = i3;
                    objA2 = yw2Var3.a(i12Var, this);
                }
                o12Var2 = (o12) objB2;
                o12Var2.a();
                gf1.m(xk1Var6, xk1Var5, xk1Var4, o12Var2.c);
                this.m = yw2Var3;
                this.k = o12Var2;
                this.l = i3;
                objA2 = yw2Var3.a(i12Var, this);
                break;
            default:
                int i6 = this.l;
                if (i6 == 0) {
                    fg1.T(obj);
                    this.l = 1;
                    return ay2.f((yw2) this.m, (j20) this.k, (x22) obj4, (nn0) obj3, (j10) obj2, this) == k20Var ? k20Var : a83Var;
                }
                if (i6 == 1) {
                    fg1.T(obj);
                    return a83Var;
                }
                s.l("call to 'resume' before 'invoke' with coroutine");
                return null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ v13(xk1 xk1Var, xk1 xk1Var2, xk1 xk1Var3, t00 t00Var, int i) {
        super(2, t00Var);
        this.j = i;
        this.n = xk1Var;
        this.o = xk1Var2;
        this.p = xk1Var3;
    }
}
