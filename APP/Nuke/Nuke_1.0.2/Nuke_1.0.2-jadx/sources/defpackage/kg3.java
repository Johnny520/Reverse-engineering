package defpackage;

import de.robv.android.xposed.XC_MethodHook;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class kg3 extends XC_MethodHook {
    public final /* synthetic */ vj a;
    public final /* synthetic */ in0 b;
    public final /* synthetic */ in0 c;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public kg3(vj vjVar, in0 in0Var, in0 in0Var2) {
        this.a = vjVar;
        this.b = in0Var;
        this.c = in0Var2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void afterHookedMethod(XC_MethodHook.MethodHookParam methodHookParam) {
        methodHookParam.getClass();
        vj vjVar = this.a;
        if (vjVar == null || st0.b(vjVar)) {
            try {
                in0 in0Var = this.c;
                if (in0Var != null) {
                    in0Var.j(new jg3(methodHookParam));
                }
            } catch (Throwable th) {
                if (vjVar != null) {
                    pp1 pp1Var = pp1.a;
                    pp1.h(vjVar, "after_callback", th, "After hook callback failed");
                }
                throw th;
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void beforeHookedMethod(XC_MethodHook.MethodHookParam methodHookParam) {
        methodHookParam.getClass();
        vj vjVar = this.a;
        if (vjVar == null || st0.b(vjVar)) {
            try {
                in0 in0Var = this.b;
                if (in0Var != null) {
                    in0Var.j(new jg3(methodHookParam));
                }
            } catch (Throwable th) {
                if (vjVar != null) {
                    pp1 pp1Var = pp1.a;
                    pp1.h(vjVar, "before_callback", th, "Before hook callback failed");
                }
                throw th;
            }
        }
    }
}
