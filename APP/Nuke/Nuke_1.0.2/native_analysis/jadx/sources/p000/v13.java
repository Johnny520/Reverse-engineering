package p000;

import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class v13 extends w92 implements mn0 {

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ int f11602j;

    /* JADX INFO: renamed from: k */
    public Object f11603k;

    /* JADX INFO: renamed from: l */
    public int f11604l;

    /* JADX INFO: renamed from: m */
    public /* synthetic */ Object f11605m;

    /* JADX INFO: renamed from: n */
    public final /* synthetic */ Object f11606n;

    /* JADX INFO: renamed from: o */
    public final /* synthetic */ Object f11607o;

    /* JADX INFO: renamed from: p */
    public final /* synthetic */ Object f11608p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v13(j20 j20Var, x22 x22Var, nn0 nn0Var, j10 j10Var, t00 t00Var) {
        super(2, t00Var);
        this.f11602j = 2;
        this.f11603k = j20Var;
        this.f11606n = x22Var;
        this.f11607o = nn0Var;
        this.f11608p = j10Var;
    }

    @Override // p000.mn0
    /* JADX INFO: renamed from: g */
    public final Object mo12g(Object obj, Object obj2) {
        int i = this.f11602j;
        a83 a83Var = a83.f116a;
        yw2 yw2Var = (yw2) obj;
        t00 t00Var = (t00) obj2;
        switch (i) {
        }
        return ((v13) mo13p(t00Var, yw2Var)).mo7r(a83Var);
    }

    @Override // p000.AbstractC0658rj
    /* JADX INFO: renamed from: p */
    public final t00 mo13p(t00 t00Var, Object obj) {
        int i = this.f11602j;
        Object obj2 = this.f11608p;
        Object obj3 = this.f11607o;
        Object obj4 = this.f11606n;
        switch (i) {
            case 0:
                v13 v13Var = new v13((xk1) obj4, (xk1) obj3, (xk1) obj2, t00Var, 0);
                v13Var.f11605m = obj;
                return v13Var;
            case 1:
                v13 v13Var2 = new v13((xk1) obj4, (xk1) obj3, (xk1) obj2, t00Var, 1);
                v13Var2.f11605m = obj;
                return v13Var2;
            default:
                v13 v13Var3 = new v13((j20) this.f11603k, (x22) obj4, (nn0) obj3, (j10) obj2, t00Var);
                v13Var3.f11605m = obj;
                return v13Var3;
        }
    }

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
    @Override // p000.AbstractC0658rj
    /* JADX INFO: renamed from: r */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object mo7r(Object obj) {
        int i;
        Object objM305b;
        o12 o12Var;
        Object objM6363a;
        Object next;
        Object objM305b2;
        o12 o12Var2;
        Object objM6363a2;
        yw2 yw2Var;
        Object next2;
        int i2 = this.f11602j;
        i12 i12Var = i12.f4217i;
        int i3 = 2;
        a83 a83Var = a83.f116a;
        Object obj2 = this.f11608p;
        Object obj3 = this.f11607o;
        Object obj4 = this.f11606n;
        k20 k20Var = k20.f5323h;
        switch (i2) {
            case 0:
                xk1 xk1Var = (xk1) obj2;
                xk1 xk1Var2 = (xk1) obj3;
                xk1 xk1Var3 = (xk1) obj4;
                yw2 yw2Var2 = (yw2) this.f11605m;
                int i4 = this.f11604l;
                if (i4 == 0) {
                    fg1.m1627T(obj);
                    this.f11605m = yw2Var2;
                    this.f11604l = 1;
                    i = 2;
                    objM305b = ay2.m305b(yw2Var2, this, 2);
                } else if (i4 == 1) {
                    fg1.m1627T(obj);
                    objM305b = obj;
                    i = 2;
                } else {
                    if (i4 != 2) {
                        C0676s.m4653l("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    o12Var = (o12) this.f11603k;
                    fg1.m1627T(obj);
                    objM6363a = obj;
                    Iterator it = ((h12) objM6363a).f3776a.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            next = it.next();
                            if (up0.m5553s(((o12) next).f7420a, o12Var.f7420a)) {
                            }
                        } else {
                            next = null;
                        }
                    }
                    o12 o12Var3 = (o12) next;
                    if (o12Var3 == null) {
                        return a83Var;
                    }
                    gf1.m1894l(xk1Var3, xk1Var2, xk1Var, o12Var3.f7422c);
                    o12Var3.m3463a();
                    if (!o12Var3.f7423d) {
                        return a83Var;
                    }
                    i = 2;
                    this.f11605m = yw2Var2;
                    this.f11603k = o12Var;
                    this.f11604l = i;
                    objM6363a = yw2Var2.m6363a(i12Var, this);
                }
                o12Var = (o12) objM305b;
                o12Var.m3463a();
                gf1.m1894l(xk1Var3, xk1Var2, xk1Var, o12Var.f7422c);
                this.f11605m = yw2Var2;
                this.f11603k = o12Var;
                this.f11604l = i;
                objM6363a = yw2Var2.m6363a(i12Var, this);
                break;
            case 1:
                xk1 xk1Var4 = (xk1) obj2;
                xk1 xk1Var5 = (xk1) obj3;
                xk1 xk1Var6 = (xk1) obj4;
                yw2 yw2Var3 = (yw2) this.f11605m;
                int i5 = this.f11604l;
                if (i5 == 0) {
                    fg1.m1627T(obj);
                    this.f11605m = yw2Var3;
                    this.f11604l = 1;
                    objM305b2 = ay2.m305b(yw2Var3, this, 2);
                } else if (i5 == 1) {
                    fg1.m1627T(obj);
                    objM305b2 = obj;
                } else {
                    if (i5 != 2) {
                        C0676s.m4653l("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    o12Var2 = (o12) this.f11603k;
                    fg1.m1627T(obj);
                    objM6363a2 = obj;
                    Iterator it2 = ((h12) objM6363a2).f3776a.iterator();
                    while (true) {
                        if (it2.hasNext()) {
                            next2 = it2.next();
                            yw2Var = yw2Var3;
                            if (!up0.m5553s(((o12) next2).f7420a, o12Var2.f7420a)) {
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
                    gf1.m1895m(xk1Var6, xk1Var5, xk1Var4, o12Var4.f7422c);
                    o12Var4.m3463a();
                    if (!o12Var4.f7423d) {
                        return a83Var;
                    }
                    yw2Var3 = yw2Var;
                    i3 = 2;
                    this.f11605m = yw2Var3;
                    this.f11603k = o12Var2;
                    this.f11604l = i3;
                    objM6363a2 = yw2Var3.m6363a(i12Var, this);
                }
                o12Var2 = (o12) objM305b2;
                o12Var2.m3463a();
                gf1.m1895m(xk1Var6, xk1Var5, xk1Var4, o12Var2.f7422c);
                this.f11605m = yw2Var3;
                this.f11603k = o12Var2;
                this.f11604l = i3;
                objM6363a2 = yw2Var3.m6363a(i12Var, this);
                break;
            default:
                int i6 = this.f11604l;
                if (i6 == 0) {
                    fg1.m1627T(obj);
                    this.f11604l = 1;
                    return ay2.m309f((yw2) this.f11605m, (j20) this.f11603k, (x22) obj4, (nn0) obj3, (j10) obj2, this) == k20Var ? k20Var : a83Var;
                }
                if (i6 == 1) {
                    fg1.m1627T(obj);
                    return a83Var;
                }
                C0676s.m4653l("call to 'resume' before 'invoke' with coroutine");
                return null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ v13(xk1 xk1Var, xk1 xk1Var2, xk1 xk1Var3, t00 t00Var, int i) {
        super(2, t00Var);
        this.f11602j = i;
        this.f11606n = xk1Var;
        this.f11607o = xk1Var2;
        this.f11608p = xk1Var3;
    }
}
