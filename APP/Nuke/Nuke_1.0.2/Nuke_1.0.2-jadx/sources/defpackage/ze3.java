package defpackage;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class ze3 {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static int a(int i) {
        if (i == 1) {
            return 0;
        }
        if (i == 2) {
            return 1;
        }
        if (i == 4) {
            return 2;
        }
        if (i == 8) {
            return 3;
        }
        if (i == 16) {
            return 4;
        }
        if (i == 32) {
            return 5;
        }
        if (i == 64) {
            return 6;
        }
        if (i == 128) {
            return 7;
        }
        if (i == 256) {
            return 8;
        }
        if (i == 512) {
            return 9;
        }
        s.j(vi0.g("type needs to be >= FIRST and <= LAST, type=", i));
        return 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final Object b(hd2 hd2Var, boolean z, hd2 hd2Var2, mn0 mn0Var) throws Throwable {
        Object ovVar;
        Object objU;
        try {
            if (mn0Var instanceof rj) {
                xe1.f(2, mn0Var);
                ovVar = mn0Var.g(hd2Var2, hd2Var);
            } else {
                ovVar = gf1.d0(mn0Var, hd2Var2, hd2Var);
            }
        } catch (j90 e) {
            Throwable th = e.h;
            hd2Var.T(new ov(th, false));
            throw th;
        } catch (Throwable th2) {
            ovVar = new ov(th2, false);
        }
        k20 k20Var = k20.h;
        if (ovVar == k20Var || (objU = hd2Var.U(ovVar)) == eu.f) {
            return k20Var;
        }
        hd2Var.j0();
        if (!(objU instanceof ov)) {
            return eu.e0(objU);
        }
        if (!z) {
            Throwable th3 = ((ov) objU).a;
            if ((th3 instanceof p23) && ((p23) th3).h == hd2Var) {
                if (ovVar instanceof ov) {
                    throw ((ov) ovVar).a;
                }
                return ovVar;
            }
        }
        throw ((ov) objU).a;
    }
}
