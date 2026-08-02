package defpackage;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class io1 {
    public final im2 a;
    public final mn0 b;
    public e70 c;
    public boolean d;
    public final sz0 e = new sz0(13);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public io1(im2 im2Var, mn0 mn0Var, e70 e70Var) {
        this.a = im2Var;
        this.b = mn0Var;
        this.c = e70Var;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static void a(h12 h12Var) {
        List list = h12Var.a;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            ((o12) list.get(i)).a();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(mn0 mn0Var, u00 u00Var) throws Throwable {
        ho1 ho1Var;
        if (u00Var instanceof ho1) {
            ho1Var = (ho1) u00Var;
            int i = ho1Var.m;
            if ((i & Integer.MIN_VALUE) != 0) {
                ho1Var.m = i - Integer.MIN_VALUE;
            } else {
                ho1Var = new ho1(this, u00Var);
            }
        }
        Object obj = ho1Var.k;
        int i2 = ho1Var.m;
        t00 t00Var = null;
        if (i2 == 0) {
            fg1.T(obj);
            this.d = true;
            a2 a2Var = new a2(this, mn0Var, t00Var, 17);
            ho1Var.m = 1;
            lw2 lw2Var = new lw2(ho1Var, ho1Var.f());
            Object objB = ze3.b(lw2Var, true, lw2Var, a2Var);
            k20 k20Var = k20.h;
            if (objB == k20Var) {
                return k20Var;
            }
        } else {
            if (i2 != 1) {
                s.l("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            fg1.T(obj);
        }
        this.d = false;
        return a83.a;
    }
}
