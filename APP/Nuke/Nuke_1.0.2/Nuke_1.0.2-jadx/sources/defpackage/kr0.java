package defpackage;

import java.io.IOException;
import java.io.OutputStreamWriter;
import java.nio.charset.StandardCharsets;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class kr0 implements x00 {
    public static final vf1 j;
    public final ir0 h;
    public final q43 i;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static {
        o72 o72Var = vf1.d;
        j = te.C("application/json; charset=UTF-8");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public kr0(ir0 ir0Var, q43 q43Var) {
        this.h = ir0Var;
        this.i = q43Var;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.x00
    public final Object j(Object obj) throws IOException {
        fn fnVar = new fn();
        o41 o41VarD = this.h.d(new OutputStreamWriter(new en(fnVar), StandardCharsets.UTF_8));
        this.i.c(o41VarD, obj);
        o41VarD.close();
        no noVarF = fnVar.f(fnVar.i);
        int i = o82.a;
        noVarF.getClass();
        return new m82(j, noVarF);
    }
}
