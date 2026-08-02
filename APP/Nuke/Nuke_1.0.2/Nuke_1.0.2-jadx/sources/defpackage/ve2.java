package defpackage;

import java.util.concurrent.CancellationException;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class ve2 implements ug {
    public final /* synthetic */ int a;
    public final /* synthetic */ jw0 b;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ ve2(jw0 jw0Var, int i) {
        this.a = i;
        this.b = jw0Var;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:32:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0024  */
    @Override // defpackage.ug
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(Object[] objArr, t00 t00Var) {
        ue2 ue2Var;
        we2 we2Var;
        int i = this.a;
        jw0 jw0Var = this.b;
        k20 k20Var = k20.h;
        switch (i) {
            case 0:
                if (t00Var instanceof ue2) {
                    ue2Var = (ue2) t00Var;
                    int i2 = ue2Var.m;
                    if ((i2 & Integer.MIN_VALUE) != 0) {
                        ue2Var.m = i2 - Integer.MIN_VALUE;
                    } else {
                        ue2Var = new ue2(this, (u00) t00Var);
                    }
                }
                Object objF = ue2Var.k;
                int i3 = ue2Var.m;
                try {
                    if (i3 == 0) {
                        fg1.T(objF);
                        sp0.a0(2, objArr);
                        String strG0 = sp0.g0("url", objArr[0]);
                        Object obj = objArr[1];
                        ue2Var.m = 1;
                        objF = jw0Var.f(strG0, obj, ue2Var);
                        if (objF == k20Var) {
                            return k20Var;
                        }
                    } else {
                        if (i3 != 1) {
                            s.l("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        fg1.T(objF);
                    }
                    return eu.v(objF);
                } catch (CancellationException e) {
                    throw e;
                } catch (Throwable th) {
                    return eu.u(th);
                }
            default:
                if (t00Var instanceof we2) {
                    we2Var = (we2) t00Var;
                    int i4 = we2Var.m;
                    if ((i4 & Integer.MIN_VALUE) != 0) {
                        we2Var.m = i4 - Integer.MIN_VALUE;
                    } else {
                        we2Var = new we2(this, (u00) t00Var);
                    }
                }
                Object objD = we2Var.k;
                int i5 = we2Var.m;
                try {
                    if (i5 == 0) {
                        fg1.T(objD);
                        sp0.a0(3, objArr);
                        String strG02 = sp0.g0("url", objArr[0]);
                        hg2 hg2VarY = i51.y("destination", objArr[1]);
                        Object obj2 = objArr[2];
                        we2Var.m = 1;
                        objD = jw0Var.d(strG02, hg2VarY, obj2, we2Var);
                        if (objD == k20Var) {
                            return k20Var;
                        }
                    } else {
                        if (i5 != 1) {
                            s.l("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        fg1.T(objD);
                    }
                    return eu.v(objD);
                } catch (CancellationException e2) {
                    throw e2;
                } catch (Throwable th2) {
                    return eu.u(th2);
                }
        }
    }
}
