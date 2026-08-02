package p000;

import de.robv.android.xposed.XC_MethodHook;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class kg3 extends XC_MethodHook {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ AbstractC0812vj f5527a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ in0 f5528b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ in0 f5529c;

    public kg3(AbstractC0812vj abstractC0812vj, in0 in0Var, in0 in0Var2) {
        this.f5527a = abstractC0812vj;
        this.f5528b = in0Var;
        this.f5529c = in0Var2;
    }

    public final void afterHookedMethod(XC_MethodHook.MethodHookParam methodHookParam) {
        methodHookParam.getClass();
        AbstractC0812vj abstractC0812vj = this.f5527a;
        if (abstractC0812vj == null || st0.m5001b(abstractC0812vj)) {
            try {
                in0 in0Var = this.f5529c;
                if (in0Var != null) {
                    in0Var.mo5j(new jg3(methodHookParam));
                }
            } catch (Throwable th) {
                if (abstractC0812vj != null) {
                    pp1 pp1Var = pp1.f8445a;
                    pp1.m3936h(abstractC0812vj, "after_callback", th, "After hook callback failed");
                }
                throw th;
            }
        }
    }

    public final void beforeHookedMethod(XC_MethodHook.MethodHookParam methodHookParam) {
        methodHookParam.getClass();
        AbstractC0812vj abstractC0812vj = this.f5527a;
        if (abstractC0812vj == null || st0.m5001b(abstractC0812vj)) {
            try {
                in0 in0Var = this.f5528b;
                if (in0Var != null) {
                    in0Var.mo5j(new jg3(methodHookParam));
                }
            } catch (Throwable th) {
                if (abstractC0812vj != null) {
                    pp1 pp1Var = pp1.f8445a;
                    pp1.m3936h(abstractC0812vj, "before_callback", th, "Before hook callback failed");
                }
                throw th;
            }
        }
    }
}
