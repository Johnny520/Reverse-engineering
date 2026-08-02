package defpackage;

import java.util.concurrent.CancellationException;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class ye2 implements ug {
    public static final ye2 a = new ye2();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // defpackage.ug
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(Object[] objArr, t00 t00Var) {
        xe2 xe2Var;
        if (t00Var instanceof xe2) {
            xe2Var = (xe2) t00Var;
            int i = xe2Var.m;
            if ((i & Integer.MIN_VALUE) != 0) {
                xe2Var.m = i - Integer.MIN_VALUE;
            } else {
                xe2Var = new xe2(this, (u00) t00Var);
            }
        }
        Object obj = xe2Var.k;
        int i2 = xe2Var.m;
        try {
            if (i2 == 0) {
                fg1.T(obj);
                sp0.a0(1, objArr);
                long jD0 = sp0.d0(objArr[0], "delayMs", 0L, Long.MAX_VALUE);
                xe2Var.m = 1;
                Object objF = eu.F(jD0, xe2Var);
                k20 k20Var = k20.h;
                if (objF == k20Var) {
                    return k20Var;
                }
            } else {
                if (i2 != 1) {
                    s.l("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                fg1.T(obj);
            }
            return eu.v(a83.a);
        } catch (CancellationException e) {
            throw e;
        } catch (Throwable th) {
            return eu.u(th);
        }
    }
}
