package defpackage;

import android.content.Context;
import java.util.Set;
import me.dartcv.nuke.R;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class vh implements xm0 {
    public final /* synthetic */ int h = 0;
    public final /* synthetic */ xk1 i;
    public final /* synthetic */ xk1 j;
    public final /* synthetic */ xk1 k;
    public final /* synthetic */ xk1 l;
    public final /* synthetic */ xk1 m;
    public final /* synthetic */ Object n;
    public final /* synthetic */ Object o;
    public final /* synthetic */ Object p;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ vh(kf2 kf2Var, Context context, xk1 xk1Var, j20 j20Var, xk1 xk1Var2, xk1 xk1Var3, xk1 xk1Var4, xk1 xk1Var5) {
        this.n = kf2Var;
        this.o = context;
        this.i = xk1Var;
        this.p = j20Var;
        this.j = xk1Var2;
        this.k = xk1Var3;
        this.l = xk1Var4;
        this.m = xk1Var5;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.xm0
    public final Object a() {
        Object x92Var;
        int i = this.h;
        a83 a83Var = a83.a;
        xk1 xk1Var = this.j;
        Object obj = this.p;
        xk1 xk1Var2 = this.i;
        Object obj2 = this.o;
        Object obj3 = this.n;
        switch (i) {
            case 0:
                Long l = (Long) obj3;
                in0 in0Var = (in0) obj2;
                xk1 xk1Var3 = (xk1) obj;
                if (l != null) {
                    in0Var.j(new ch(l.longValue(), ((Number) xk1Var2.getValue()).intValue(), ((Boolean) xk1Var.getValue()).booleanValue(), (Set) this.k.getValue(), (Set) this.l.getValue(), new fh(pv2.I0((String) xk1Var3.getValue()).toString(), ((Boolean) this.m.getValue()).booleanValue())));
                }
                break;
            default:
                kf2 kf2Var = (kf2) obj3;
                Context context = (Context) obj2;
                j20 j20Var = (j20) obj;
                try {
                    x92Var = rg3.J(kf2Var, (String) xk1Var2.getValue(), context);
                } catch (Throwable th) {
                    x92Var = new x92(th);
                }
                boolean z = x92Var instanceof x92;
                xk1 xk1Var4 = this.l;
                if (!z) {
                    j31 j31Var = (j31) x92Var;
                    String str = (String) xk1Var.getValue();
                    if (str != null) {
                        p7.A(j20Var, null, new ok2(str, kf2Var, j31Var, this.k, xk1Var4, this.m, context, null), 3);
                    }
                }
                Throwable thA = y92.a(x92Var);
                if (thA != null) {
                    String message = thA.getMessage();
                    if (message == null) {
                        message = context.getString(R.string.script_settings_invalid_input);
                        message.getClass();
                    }
                    xk1Var4.setValue(message);
                }
                break;
        }
        return a83Var;
    }

    public /* synthetic */ vh(Long l, in0 in0Var, xk1 xk1Var, xk1 xk1Var2, xk1 xk1Var3, xk1 xk1Var4, xk1 xk1Var5, xk1 xk1Var6) {
        this.n = l;
        this.o = in0Var;
        this.i = xk1Var;
        this.j = xk1Var2;
        this.k = xk1Var3;
        this.l = xk1Var4;
        this.m = xk1Var5;
        this.p = xk1Var6;
    }
}
