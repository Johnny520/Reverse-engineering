package p000;

import java.lang.annotation.Annotation;
import java.lang.reflect.Type;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class jr0 extends w00 {

    /* JADX INFO: renamed from: a */
    public final ir0 f5176a;

    public jr0(ir0 ir0Var) {
        this.f5176a = ir0Var;
    }

    @Override // p000.w00
    /* JADX INFO: renamed from: a */
    public final x00 mo2549a(Type type) {
        j63 j63Var = new j63(type);
        ir0 ir0Var = this.f5176a;
        return new kr0(ir0Var, ir0Var.m2386c(j63Var));
    }

    @Override // p000.w00
    /* JADX INFO: renamed from: b */
    public final x00 mo2550b(Type type, Annotation[] annotationArr, C0093cj c0093cj) {
        j63 j63Var = new j63(type);
        ir0 ir0Var = this.f5176a;
        return new C0485n4(ir0Var, ir0Var.m2386c(j63Var));
    }
}
