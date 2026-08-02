package p000;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class io1 {

    /* JADX INFO: renamed from: a */
    public final im2 f4711a;

    /* JADX INFO: renamed from: b */
    public final mn0 f4712b;

    /* JADX INFO: renamed from: c */
    public e70 f4713c;

    /* JADX INFO: renamed from: d */
    public boolean f4714d;

    /* JADX INFO: renamed from: e */
    public final sz0 f4715e = new sz0(13);

    public io1(im2 im2Var, mn0 mn0Var, e70 e70Var) {
        this.f4711a = im2Var;
        this.f4712b = mn0Var;
        this.f4713c = e70Var;
    }

    /* JADX INFO: renamed from: a */
    public static void m2381a(h12 h12Var) {
        List list = h12Var.f3776a;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            ((o12) list.get(i)).m3463a();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX INFO: renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m2382b(mn0 mn0Var, u00 u00Var) throws Throwable {
        ho1 ho1Var;
        if (u00Var instanceof ho1) {
            ho1Var = (ho1) u00Var;
            int i = ho1Var.f4095m;
            if ((i & Integer.MIN_VALUE) != 0) {
                ho1Var.f4095m = i - Integer.MIN_VALUE;
            } else {
                ho1Var = new ho1(this, u00Var);
            }
        }
        Object obj = ho1Var.f4093k;
        int i2 = ho1Var.f4095m;
        t00 t00Var = null;
        if (i2 == 0) {
            fg1.m1627T(obj);
            this.f4714d = true;
            C0003a2 c0003a2 = new C0003a2(this, mn0Var, t00Var, 17);
            ho1Var.f4095m = 1;
            lw2 lw2Var = new lw2(ho1Var, ho1Var.mo2508f());
            Object objM6410b = ze3.m6410b(lw2Var, true, lw2Var, c0003a2);
            k20 k20Var = k20.f5323h;
            if (objM6410b == k20Var) {
                return k20Var;
            }
        } else {
            if (i2 != 1) {
                C0676s.m4653l("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            fg1.m1627T(obj);
        }
        this.f4714d = false;
        return a83.f116a;
    }
}
