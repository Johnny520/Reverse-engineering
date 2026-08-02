package defpackage;

import java.lang.annotation.Annotation;
import java.lang.reflect.Type;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class jr0 extends w00 {
    public final ir0 a;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public jr0(ir0 ir0Var) {
        this.a = ir0Var;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.w00
    public final x00 a(Type type) {
        j63 j63Var = new j63(type);
        ir0 ir0Var = this.a;
        return new kr0(ir0Var, ir0Var.c(j63Var));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.w00
    public final x00 b(Type type, Annotation[] annotationArr, cj cjVar) {
        j63 j63Var = new j63(type);
        ir0 ir0Var = this.a;
        return new n4(ir0Var, ir0Var.c(j63Var));
    }
}
