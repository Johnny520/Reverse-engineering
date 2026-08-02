package defpackage;

import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class kw implements mn0, nn0, on0, pn0, qn0, rn0, sn0, tn0, ym0, zm0, bn0, cn0, dn0, en0, fn0, gn0, hn0, jn0, kn0 {
    public final int h;
    public final boolean i;
    public un0 j;
    public b62 k;
    public ArrayList l;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public kw(int i, boolean z, un0 un0Var) {
        this.h = i;
        this.i = z;
        this.j = un0Var;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.sn0
    public final /* bridge */ /* synthetic */ Object b(Object obj, Boolean bool, Object obj2, Object obj3, Object obj4, go0 go0Var, Integer num) {
        return i(obj, bool, obj2, obj3, obj4, go0Var, num.intValue());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final Object d(int i, px pxVar) {
        go0 go0Var = (go0) pxVar;
        go0Var.X(this.h);
        m(go0Var);
        int iG = i | (go0Var.f(this) ? xe1.g(2, 0) : xe1.g(1, 0));
        un0 un0Var = this.j;
        xe1.f(2, un0Var);
        Object objG = ((mn0) un0Var).g(go0Var, Integer.valueOf(iG));
        b62 b62VarR = go0Var.r();
        if (b62VarR != null) {
            b62VarR.d = new jw(2, this, kw.class, "invoke", "invoke(Landroidx/compose/runtime/Composer;I)Ljava/lang/Object;", 8, 0);
        }
        return objG;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.nn0
    public final /* bridge */ /* synthetic */ Object e(Object obj, Object obj2, Object obj3) {
        return h(obj, (px) obj2, ((Number) obj3).intValue());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final Object f(fk fkVar, Object obj, Object obj2, px pxVar, int i) {
        go0 go0Var = (go0) pxVar;
        go0Var.X(this.h);
        m(go0Var);
        int iG = go0Var.f(this) ? xe1.g(2, 3) : xe1.g(1, 3);
        un0 un0Var = this.j;
        xe1.f(5, un0Var);
        Object objK = ((pn0) un0Var).k(fkVar, obj, obj2, go0Var, Integer.valueOf(iG | i));
        b62 b62VarR = go0Var.r();
        if (b62VarR != null) {
            b62VarR.d = new hw(this, fkVar, obj, obj2, i);
        }
        return objK;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.mn0
    public final /* bridge */ /* synthetic */ Object g(Object obj, Object obj2) {
        return d(((Number) obj2).intValue(), (px) obj);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final Object h(Object obj, px pxVar, int i) {
        go0 go0Var = (go0) pxVar;
        go0Var.X(this.h);
        m(go0Var);
        int i2 = 1;
        int iG = go0Var.f(this) ? xe1.g(2, 1) : xe1.g(1, 1);
        un0 un0Var = this.j;
        xe1.f(3, un0Var);
        Object objE = ((nn0) un0Var).e(obj, go0Var, Integer.valueOf(iG | i));
        b62 b62VarR = go0Var.r();
        if (b62VarR != null) {
            b62VarR.d = new up(i, i2, this, obj);
        }
        return objE;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final Object i(Object obj, Boolean bool, Object obj2, Object obj3, Object obj4, px pxVar, int i) {
        go0 go0Var = (go0) pxVar;
        go0Var.X(this.h);
        m(go0Var);
        int iG = go0Var.f(this) ? xe1.g(2, 6) : xe1.g(1, 6);
        un0 un0Var = this.j;
        xe1.f(8, un0Var);
        Object objB = ((sn0) un0Var).b(obj, bool, obj2, obj3, obj4, go0Var, Integer.valueOf(i | iG));
        b62 b62VarR = go0Var.r();
        if (b62VarR != null) {
            b62VarR.d = new iw(this, obj, bool, obj2, obj3, obj4, i);
        }
        return objB;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.pn0
    public final /* bridge */ /* synthetic */ Object k(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        return f((fk) obj, obj2, obj3, (px) obj4, ((Number) obj5).intValue());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final Object l(Object obj, Object obj2, px pxVar, int i) {
        go0 go0Var = (go0) pxVar;
        go0Var.X(this.h);
        m(go0Var);
        int iG = go0Var.f(this) ? xe1.g(2, 2) : xe1.g(1, 2);
        un0 un0Var = this.j;
        xe1.f(4, un0Var);
        Object objO = ((on0) un0Var).o(obj, obj2, go0Var, Integer.valueOf(iG | i));
        b62 b62VarR = go0Var.r();
        if (b62VarR != null) {
            b62VarR.d = new va(this, obj, obj2, i);
        }
        return objO;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void m(px pxVar) {
        b62 b62VarX;
        if (!this.i || (b62VarX = ((go0) pxVar).x()) == null) {
            return;
        }
        b62VarX.b |= 1;
        b62 b62Var = this.k;
        if (b62Var == null || !b62Var.a() || b62Var == b62VarX || t11.l(b62Var.c, b62VarX.c)) {
            this.k = b62VarX;
            return;
        }
        ArrayList arrayList = this.l;
        if (arrayList == null) {
            ArrayList arrayList2 = new ArrayList();
            this.l = arrayList2;
            arrayList2.add(b62VarX);
            return;
        }
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            b62 b62Var2 = (b62) arrayList.get(i);
            if (b62Var2 == null || !b62Var2.a() || b62Var2 == b62VarX || t11.l(b62Var2.c, b62VarX.c)) {
                arrayList.set(i, b62VarX);
                return;
            }
        }
        arrayList.add(b62VarX);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.on0
    public final /* bridge */ /* synthetic */ Object o(Object obj, Object obj2, Object obj3, Object obj4) {
        return l(obj, obj2, (px) obj3, ((Number) obj4).intValue());
    }
}
