package p000;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class ze3 {
    /* JADX INFO: renamed from: a */
    public static int m6409a(int i) {
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
        C0676s.m4651j(vi0.m5688g("type needs to be >= FIRST and <= LAST, type=", i));
        return 0;
    }

    /* JADX INFO: renamed from: b */
    public static final Object m6410b(hd2 hd2Var, boolean z, hd2 hd2Var2, mn0 mn0Var) throws Throwable {
        Object c0557ov;
        Object objM4318U;
        try {
            if (mn0Var instanceof AbstractC0658rj) {
                xe1.m6119f(2, mn0Var);
                c0557ov = mn0Var.mo12g(hd2Var2, hd2Var);
            } else {
                c0557ov = gf1.m1886d0(mn0Var, hd2Var2, hd2Var);
            }
        } catch (j90 e) {
            Throwable th = e.f4923h;
            hd2Var.m4317T(new C0557ov(th, false));
            throw th;
        } catch (Throwable th2) {
            c0557ov = new C0557ov(th2, false);
        }
        k20 k20Var = k20.f5323h;
        if (c0557ov == k20Var || (objM4318U = hd2Var.m4318U(c0557ov)) == AbstractC0179eu.f2632f) {
            return k20Var;
        }
        hd2Var.mo2145j0();
        if (!(objM4318U instanceof C0557ov)) {
            return AbstractC0179eu.m1455e0(objM4318U);
        }
        if (!z) {
            Throwable th3 = ((C0557ov) objM4318U).f7856a;
            if ((th3 instanceof p23) && ((p23) th3).f7954h == hd2Var) {
                if (c0557ov instanceof C0557ov) {
                    throw ((C0557ov) c0557ov).f7856a;
                }
                return c0557ov;
            }
        }
        throw ((C0557ov) objM4318U).f7856a;
    }
}
