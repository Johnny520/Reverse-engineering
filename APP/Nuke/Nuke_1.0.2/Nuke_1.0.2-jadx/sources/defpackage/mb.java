package defpackage;

import android.os.Handler;
import android.os.Looper;
import android.view.ActionMode;
import android.view.View;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class mb extends tw2 implements in0 {
    public final /* synthetic */ int l;
    public int m;
    public final /* synthetic */ Object n;
    public final /* synthetic */ Object o;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ mb(Object obj, Object obj2, t00 t00Var, int i) {
        super(1, t00Var);
        this.l = i;
        this.n = obj;
        this.o = obj2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.in0
    public final Object j(Object obj) {
        int i = this.l;
        a83 a83Var = a83.a;
        Object obj2 = this.o;
        Object obj3 = this.n;
        t00 t00Var = (t00) obj;
        switch (i) {
            case 0:
                return new mb((nb) obj3, (ry2) obj2, t00Var, 0).r(a83Var);
            case 1:
                return new mb((gk) obj3, (fk) obj2, t00Var, 1).r(a83Var);
            case 2:
                new mb((vn1) obj3, (bg2) obj2, t00Var, 2).r(a83Var);
                return a83Var;
            case 3:
                return new mb((vn1) obj3, (zj2) obj2, t00Var, 3).r(a83Var);
            case 4:
                return new mb((vn1) obj3, (jd2) obj2, t00Var, 4).r(a83Var);
            case 5:
                return new mb((vn1) obj3, (xf2) obj2, t00Var, 5).r(a83Var);
            default:
                return new mb((vn1) obj3, (xk2) obj2, t00Var, 6).r(a83Var);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.rj
    public final Object r(Object obj) {
        Handler handler;
        jb jbVar;
        int i = this.l;
        a83 a83Var = a83.a;
        Object obj2 = this.o;
        k20 k20Var = k20.h;
        Object obj3 = this.n;
        switch (i) {
            case 0:
                nb nbVar = (nb) obj3;
                ts2 ts2Var = nbVar.e;
                View view = nbVar.a;
                int i2 = this.m;
                int i3 = 3;
                try {
                    if (i2 == 0) {
                        fg1.T(obj);
                        kb kbVar = new kb();
                        ry2 ry2Var = (ry2) obj2;
                        int i4 = 0;
                        jb jbVar2 = new jb(kbVar, new hb(nbVar, ry2Var, 0), new hb(nbVar, ry2Var, 1), view);
                        in0 in0Var = nbVar.b;
                        if (in0Var != null && (jbVar = (jb) in0Var.j(jbVar2)) != null) {
                            jbVar2 = jbVar;
                        }
                        Looper looperMyLooper = Looper.myLooper();
                        Handler handler2 = view.getHandler();
                        if (looperMyLooper != (handler2 != null ? handler2.getLooper() : null)) {
                            lb lbVar = nbVar.i;
                            if (lbVar == null) {
                                lbVar = new lb(nbVar, jbVar2, kbVar, i4);
                                nbVar.i = lbVar;
                            }
                            view.post(lbVar);
                        } else {
                            ActionMode actionModeStartActionMode = view.startActionMode(new yj0(jbVar2), 1);
                            if (actionModeStartActionMode == null) {
                                return a83Var;
                            }
                            nbVar.h = actionModeStartActionMode;
                        }
                        this.m = 1;
                        Object objW = kbVar.a.w(this);
                        if (objW != k20Var) {
                            objW = a83Var;
                        }
                        if (objW == k20Var) {
                            return k20Var;
                        }
                    } else {
                        if (i2 != 1) {
                            s.l("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        fg1.T(obj);
                    }
                    if (Looper.myLooper() != (handler != null ? handler.getLooper() : null)) {
                        Runnable m2Var = nbVar.j;
                        if (m2Var == null) {
                            m2Var = new m2(i3, nbVar);
                            nbVar.j = m2Var;
                        }
                        view.post(m2Var);
                    } else {
                        ActionMode actionMode = nbVar.h;
                        if (actionMode != null) {
                            actionMode.finish();
                        }
                    }
                    lb lbVar2 = nbVar.i;
                    if (lbVar2 != null) {
                        view.removeCallbacks(lbVar2);
                    }
                    nbVar.h = null;
                    return a83Var;
                } finally {
                    ts2Var.a();
                    Looper looperMyLooper2 = Looper.myLooper();
                    handler = view.getHandler();
                    if (looperMyLooper2 != (handler != null ? handler.getLooper() : null)) {
                        Runnable m2Var2 = nbVar.j;
                        if (m2Var2 == null) {
                            m2Var2 = new m2(i3, nbVar);
                            nbVar.j = m2Var2;
                        }
                        view.post(m2Var2);
                    } else {
                        ActionMode actionMode2 = nbVar.h;
                        if (actionMode2 != null) {
                            actionMode2.finish();
                        }
                    }
                    lb lbVar3 = nbVar.i;
                    if (lbVar3 != null) {
                        view.removeCallbacks(lbVar3);
                    }
                    nbVar.h = null;
                }
            case 1:
                fk fkVar = (fk) obj2;
                nx1 nx1Var = ((gk) obj3).c;
                int i5 = this.m;
                try {
                    if (i5 == 0) {
                        fg1.T(obj);
                        nx1Var.setValue(fkVar);
                        this.m = 1;
                        Object objW2 = fkVar.b.w(this);
                        if (objW2 != k20Var) {
                            objW2 = a83Var;
                        }
                        if (objW2 == k20Var) {
                            return k20Var;
                        }
                    } else {
                        if (i5 != 1) {
                            s.l("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        fg1.T(obj);
                    }
                    return a83Var;
                } finally {
                    nx1Var.setValue(null);
                }
            case 2:
                int i6 = this.m;
                if (i6 != 0) {
                    if (i6 == 1) {
                        fg1.T(obj);
                        return obj;
                    }
                    s.l("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                fg1.T(obj);
                vn1 vn1Var = (vn1) obj3;
                hi2 hi2Var = ((df2) vn1Var.d).g;
                th2 th2Var = ((u22) vn1Var.b).a;
                String str = th2Var.c;
                String str2 = th2Var.d;
                str.getClass();
                str2.getClass();
                this.m = 1;
                hi2Var.i();
                throw null;
            case 3:
                int i7 = this.m;
                if (i7 != 0) {
                    if (i7 == 1) {
                        fg1.T(obj);
                        return obj;
                    }
                    s.l("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                fg1.T(obj);
                vn1 vn1Var2 = (vn1) obj3;
                hi2 hi2Var2 = ((df2) vn1Var2.d).g;
                th2 th2Var2 = ((u22) vn1Var2.b).a;
                String str3 = th2Var2.c;
                String str4 = th2Var2.d;
                str3.getClass();
                str4.getClass();
                this.m = 1;
                Object objJ = hi2Var2.j((zj2) obj2);
                return objJ == k20Var ? k20Var : objJ;
            case 4:
                int i8 = this.m;
                if (i8 != 0) {
                    if (i8 == 1) {
                        fg1.T(obj);
                        return a83Var;
                    }
                    s.l("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                fg1.T(obj);
                vn1 vn1Var3 = (vn1) obj3;
                bl2 bl2Var = ((df2) vn1Var3.d).f;
                th2 th2Var3 = ((u22) vn1Var3.b).a;
                this.m = 1;
                return bl2Var.m(new yk2(th2Var3.c, th2Var3.d), (jd2) obj2, this) == k20Var ? k20Var : a83Var;
            case 5:
                int i9 = this.m;
                if (i9 != 0) {
                    if (i9 == 1) {
                        fg1.T(obj);
                        return obj;
                    }
                    s.l("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                fg1.T(obj);
                vn1 vn1Var4 = (vn1) obj3;
                bl2 bl2Var2 = ((df2) vn1Var4.d).f;
                th2 th2Var4 = ((u22) vn1Var4.b).a;
                this.m = 1;
                Object objF = bl2Var2.f(new yk2(th2Var4.c, th2Var4.d), (xf2) obj2, this);
                return objF == k20Var ? k20Var : objF;
            default:
                int i10 = this.m;
                if (i10 != 0) {
                    if (i10 == 1) {
                        fg1.T(obj);
                        return a83Var;
                    }
                    s.l("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                fg1.T(obj);
                vn1 vn1Var5 = (vn1) obj3;
                bl2 bl2Var3 = ((df2) vn1Var5.d).f;
                th2 th2Var5 = ((u22) vn1Var5.b).a;
                this.m = 1;
                return bl2Var3.e(new yk2(th2Var5.c, th2Var5.d), (xk2) obj2, this) == k20Var ? k20Var : a83Var;
        }
    }
}
