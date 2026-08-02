package p000;

import android.os.Handler;
import android.os.Looper;
import android.view.ActionMode;
import android.view.View;

/* JADX INFO: renamed from: mb */
/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class C0455mb extends tw2 implements in0 {

    /* JADX INFO: renamed from: l */
    public final /* synthetic */ int f6537l;

    /* JADX INFO: renamed from: m */
    public int f6538m;

    /* JADX INFO: renamed from: n */
    public final /* synthetic */ Object f6539n;

    /* JADX INFO: renamed from: o */
    public final /* synthetic */ Object f6540o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0455mb(Object obj, Object obj2, t00 t00Var, int i) {
        super(1, t00Var);
        this.f6537l = i;
        this.f6539n = obj;
        this.f6540o = obj2;
    }

    @Override // p000.in0
    /* JADX INFO: renamed from: j */
    public final Object mo5j(Object obj) {
        int i = this.f6537l;
        a83 a83Var = a83.f116a;
        Object obj2 = this.f6540o;
        Object obj3 = this.f6539n;
        t00 t00Var = (t00) obj;
        switch (i) {
            case 0:
                return new C0455mb((C0492nb) obj3, (ry2) obj2, t00Var, 0).mo7r(a83Var);
            case 1:
                return new C0455mb((C0243gk) obj3, (C0206fk) obj2, t00Var, 1).mo7r(a83Var);
            case 2:
                new C0455mb((vn1) obj3, (bg2) obj2, t00Var, 2).mo7r(a83Var);
                return a83Var;
            case 3:
                return new C0455mb((vn1) obj3, (zj2) obj2, t00Var, 3).mo7r(a83Var);
            case 4:
                return new C0455mb((vn1) obj3, (jd2) obj2, t00Var, 4).mo7r(a83Var);
            case 5:
                return new C0455mb((vn1) obj3, (xf2) obj2, t00Var, 5).mo7r(a83Var);
            default:
                return new C0455mb((vn1) obj3, (xk2) obj2, t00Var, 6).mo7r(a83Var);
        }
    }

    @Override // p000.AbstractC0658rj
    /* JADX INFO: renamed from: r */
    public final Object mo7r(Object obj) {
        Handler handler;
        C0344jb c0344jb;
        int i = this.f6537l;
        a83 a83Var = a83.f116a;
        Object obj2 = this.f6540o;
        k20 k20Var = k20.f5323h;
        Object obj3 = this.f6539n;
        switch (i) {
            case 0:
                C0492nb c0492nb = (C0492nb) obj3;
                ts2 ts2Var = c0492nb.f7095e;
                View view = c0492nb.f7091a;
                int i2 = this.f6538m;
                int i3 = 3;
                try {
                    if (i2 == 0) {
                        fg1.m1627T(obj);
                        C0381kb c0381kb = new C0381kb();
                        ry2 ry2Var = (ry2) obj2;
                        int i4 = 0;
                        C0344jb c0344jb2 = new C0344jb(c0381kb, new C0271hb(c0492nb, ry2Var, 0), new C0271hb(c0492nb, ry2Var, 1), view);
                        in0 in0Var = c0492nb.f7092b;
                        if (in0Var != null && (c0344jb = (C0344jb) in0Var.mo5j(c0344jb2)) != null) {
                            c0344jb2 = c0344jb;
                        }
                        Looper looperMyLooper = Looper.myLooper();
                        Handler handler2 = view.getHandler();
                        if (looperMyLooper != (handler2 != null ? handler2.getLooper() : null)) {
                            RunnableC0418lb runnableC0418lb = c0492nb.f7099i;
                            if (runnableC0418lb == null) {
                                runnableC0418lb = new RunnableC0418lb(c0492nb, c0344jb2, c0381kb, i4);
                                c0492nb.f7099i = runnableC0418lb;
                            }
                            view.post(runnableC0418lb);
                        } else {
                            ActionMode actionModeStartActionMode = view.startActionMode(new yj0(c0344jb2), 1);
                            if (actionModeStartActionMode == null) {
                                return a83Var;
                            }
                            c0492nb.f7098h = actionModeStartActionMode;
                        }
                        this.f6538m = 1;
                        Object objMo1714w = c0381kb.f5433a.mo1714w(this);
                        if (objMo1714w != k20Var) {
                            objMo1714w = a83Var;
                        }
                        if (objMo1714w == k20Var) {
                            return k20Var;
                        }
                    } else {
                        if (i2 != 1) {
                            C0676s.m4653l("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        fg1.m1627T(obj);
                    }
                    if (Looper.myLooper() != (handler != null ? handler.getLooper() : null)) {
                        Runnable runnableC0446m2 = c0492nb.f7100j;
                        if (runnableC0446m2 == null) {
                            runnableC0446m2 = new RunnableC0446m2(i3, c0492nb);
                            c0492nb.f7100j = runnableC0446m2;
                        }
                        view.post(runnableC0446m2);
                    } else {
                        ActionMode actionMode = c0492nb.f7098h;
                        if (actionMode != null) {
                            actionMode.finish();
                        }
                    }
                    RunnableC0418lb runnableC0418lb2 = c0492nb.f7099i;
                    if (runnableC0418lb2 != null) {
                        view.removeCallbacks(runnableC0418lb2);
                    }
                    c0492nb.f7098h = null;
                    return a83Var;
                } finally {
                    ts2Var.m5434a();
                    Looper looperMyLooper2 = Looper.myLooper();
                    handler = view.getHandler();
                    if (looperMyLooper2 != (handler != null ? handler.getLooper() : null)) {
                        Runnable runnableC0446m22 = c0492nb.f7100j;
                        if (runnableC0446m22 == null) {
                            runnableC0446m22 = new RunnableC0446m2(i3, c0492nb);
                            c0492nb.f7100j = runnableC0446m22;
                        }
                        view.post(runnableC0446m22);
                    } else {
                        ActionMode actionMode2 = c0492nb.f7098h;
                        if (actionMode2 != null) {
                            actionMode2.finish();
                        }
                    }
                    RunnableC0418lb runnableC0418lb3 = c0492nb.f7099i;
                    if (runnableC0418lb3 != null) {
                        view.removeCallbacks(runnableC0418lb3);
                    }
                    c0492nb.f7098h = null;
                }
            case 1:
                C0206fk c0206fk = (C0206fk) obj2;
                nx1 nx1Var = ((C0243gk) obj3).f3547c;
                int i5 = this.f6538m;
                try {
                    if (i5 == 0) {
                        fg1.m1627T(obj);
                        nx1Var.setValue(c0206fk);
                        this.f6538m = 1;
                        Object objMo1714w2 = c0206fk.f3023b.mo1714w(this);
                        if (objMo1714w2 != k20Var) {
                            objMo1714w2 = a83Var;
                        }
                        if (objMo1714w2 == k20Var) {
                            return k20Var;
                        }
                    } else {
                        if (i5 != 1) {
                            C0676s.m4653l("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        fg1.m1627T(obj);
                    }
                    return a83Var;
                } finally {
                    nx1Var.setValue(null);
                }
            case 2:
                int i6 = this.f6538m;
                if (i6 != 0) {
                    if (i6 == 1) {
                        fg1.m1627T(obj);
                        return obj;
                    }
                    C0676s.m4653l("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                fg1.m1627T(obj);
                vn1 vn1Var = (vn1) obj3;
                hi2 hi2Var = ((df2) vn1Var.f12033d).f2029g;
                th2 th2Var = ((u22) vn1Var.f12031b).f11075a;
                String str = th2Var.f10774c;
                String str2 = th2Var.f10775d;
                str.getClass();
                str2.getClass();
                this.f6538m = 1;
                hi2Var.mo2195i();
                throw null;
            case 3:
                int i7 = this.f6538m;
                if (i7 != 0) {
                    if (i7 == 1) {
                        fg1.m1627T(obj);
                        return obj;
                    }
                    C0676s.m4653l("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                fg1.m1627T(obj);
                vn1 vn1Var2 = (vn1) obj3;
                hi2 hi2Var2 = ((df2) vn1Var2.f12033d).f2029g;
                th2 th2Var2 = ((u22) vn1Var2.f12031b).f11075a;
                String str3 = th2Var2.f10774c;
                String str4 = th2Var2.f10775d;
                str3.getClass();
                str4.getClass();
                this.f6538m = 1;
                Object objMo2196j = hi2Var2.mo2196j((zj2) obj2);
                return objMo2196j == k20Var ? k20Var : objMo2196j;
            case 4:
                int i8 = this.f6538m;
                if (i8 != 0) {
                    if (i8 == 1) {
                        fg1.m1627T(obj);
                        return a83Var;
                    }
                    C0676s.m4653l("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                fg1.m1627T(obj);
                vn1 vn1Var3 = (vn1) obj3;
                bl2 bl2Var = ((df2) vn1Var3.f12033d).f2028f;
                th2 th2Var3 = ((u22) vn1Var3.f12031b).f11075a;
                this.f6538m = 1;
                return bl2Var.mo268m(new yk2(th2Var3.f10774c, th2Var3.f10775d), (jd2) obj2, this) == k20Var ? k20Var : a83Var;
            case 5:
                int i9 = this.f6538m;
                if (i9 != 0) {
                    if (i9 == 1) {
                        fg1.m1627T(obj);
                        return obj;
                    }
                    C0676s.m4653l("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                fg1.m1627T(obj);
                vn1 vn1Var4 = (vn1) obj3;
                bl2 bl2Var2 = ((df2) vn1Var4.f12033d).f2028f;
                th2 th2Var4 = ((u22) vn1Var4.f12031b).f11075a;
                this.f6538m = 1;
                Object objMo267f = bl2Var2.mo267f(new yk2(th2Var4.f10774c, th2Var4.f10775d), (xf2) obj2, this);
                return objMo267f == k20Var ? k20Var : objMo267f;
            default:
                int i10 = this.f6538m;
                if (i10 != 0) {
                    if (i10 == 1) {
                        fg1.m1627T(obj);
                        return a83Var;
                    }
                    C0676s.m4653l("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                fg1.m1627T(obj);
                vn1 vn1Var5 = (vn1) obj3;
                bl2 bl2Var3 = ((df2) vn1Var5.f12033d).f2028f;
                th2 th2Var5 = ((u22) vn1Var5.f12031b).f11075a;
                this.f6538m = 1;
                return bl2Var3.mo266e(new yk2(th2Var5.f10774c, th2Var5.f10775d), (xk2) obj2, this) == k20Var ? k20Var : a83Var;
        }
    }
}
