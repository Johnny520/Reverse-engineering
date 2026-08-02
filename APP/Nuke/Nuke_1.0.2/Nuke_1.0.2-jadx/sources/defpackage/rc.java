package defpackage;

import com.dokar.quickjs.QuickJs;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class rc extends tw2 implements in0 {
    public final /* synthetic */ int l;
    public final /* synthetic */ Object m;
    public final /* synthetic */ Object n;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ rc(Object obj, Object obj2, t00 t00Var, int i) {
        super(1, t00Var);
        this.l = i;
        this.m = obj;
        this.n = obj2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.in0
    public final Object j(Object obj) {
        int i = this.l;
        a83 a83Var = a83.a;
        Object obj2 = this.n;
        Object obj3 = this.m;
        t00 t00Var = (t00) obj;
        switch (i) {
            case 0:
                new rc((sc) obj3, obj2, t00Var, 0).r(a83Var);
                return a83Var;
            default:
                return new rc((QuickJs) obj3, (byte[]) obj2, t00Var, 1).r(a83Var);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.rj
    public final Object r(Object obj) {
        int i = this.l;
        Object obj2 = this.n;
        Object obj3 = this.m;
        switch (i) {
            case 0:
                fg1.T(obj);
                sc scVar = (sc) obj3;
                sc.b(scVar);
                Object objA = sc.a(scVar, obj2);
                scVar.c.i.setValue(objA);
                scVar.e.setValue(objA);
                return a83.a;
            default:
                fg1.T(obj);
                QuickJs quickJs = (QuickJs) obj3;
                return quickJs.evaluateBytecode(quickJs.context, quickJs.globals, (byte[]) obj2);
        }
    }
}
