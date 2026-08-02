package defpackage;

import nuke.module.wechat.ai.AIChatConfig;
import nuke.ui.HomeActivity;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class f0 implements xm0 {
    public final /* synthetic */ int h;
    public final /* synthetic */ xk1 i;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ f0(xk1 xk1Var, int i) {
        this.h = i;
        this.i = xk1Var;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.xm0
    public final Object a() {
        int i = this.h;
        fe0 fe0Var = fe0.h;
        a83 a83Var = a83.a;
        xk1 xk1Var = this.i;
        switch (i) {
            case 0:
                xk1Var.setValue(Boolean.FALSE);
                return a83Var;
            case 1:
                xk1Var.setValue(Boolean.TRUE);
                return a83Var;
            case 2:
                xk1Var.setValue(Boolean.TRUE);
                return a83Var;
            case 3:
                xk1Var.setValue(Boolean.FALSE);
                return a83Var;
            case 4:
                xk1Var.setValue(null);
                return a83Var;
            case 5:
                c61 c61Var = (c61) xk1Var.getValue();
                if (c61Var != null) {
                    return c61Var;
                }
                nz0.d("Required value was null.");
                s.b();
                return null;
            case AIChatConfig.DefaultContextRounds /* 6 */:
                xk1Var.setValue(Boolean.FALSE);
                return a83Var;
            case 7:
                xk1Var.setValue(Boolean.FALSE);
                return a83Var;
            case 8:
                xk1Var.setValue(Boolean.TRUE);
                return a83Var;
            case 9:
                xk1Var.setValue(Boolean.FALSE);
                return a83Var;
            case 10:
                xk1Var.setValue(Boolean.FALSE);
                return a83Var;
            case 11:
                xk1Var.setValue(Boolean.TRUE);
                return a83Var;
            case 12:
                xk1Var.setValue(fe0Var);
                return a83Var;
            case 13:
                xk1Var.setValue(Boolean.FALSE);
                return a83Var;
            case 14:
                xk1Var.setValue(fe0Var);
                return a83Var;
            case 15:
                xk1Var.setValue(Boolean.TRUE);
                return a83Var;
            case 16:
                c61 c61Var2 = (c61) xk1Var.getValue();
                if (c61Var2 != null) {
                    return c61Var2;
                }
                nz0.d("Required value was null.");
                s.b();
                return null;
            case 17:
                xk1Var.setValue(null);
                return a83Var;
            case 18:
                xk1Var.setValue(Boolean.FALSE);
                return a83Var;
            case 19:
                xk1Var.setValue(Boolean.TRUE);
                return a83Var;
            case AIChatConfig.MaxContextRounds /* 20 */:
                xk1Var.setValue(Boolean.TRUE);
                return a83Var;
            case 21:
                xk1Var.setValue(Boolean.FALSE);
                return a83Var;
            case 22:
                Boolean bool = (Boolean) xk1Var.getValue();
                bool.booleanValue();
                return bool;
            case 23:
                return HomeActivity.onCreate$lambda$0$17$0$0$5$0(xk1Var);
            case 24:
                xk1Var.setValue(Boolean.FALSE);
                return a83Var;
            case 25:
                xk1Var.setValue("");
                return a83Var;
            case 26:
                xk1Var.setValue(null);
                return a83Var;
            case 27:
                return (t81) ((xm0) xk1Var.getValue()).a();
            case 28:
                return new s81((in0) xk1Var.getValue());
            default:
                xk1Var.setValue(Boolean.valueOf(!((Boolean) xk1Var.getValue()).booleanValue()));
                return a83Var;
        }
    }
}
