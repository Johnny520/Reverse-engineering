package p000;

import java.io.IOException;
import java.io.OutputStreamWriter;
import java.nio.charset.StandardCharsets;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class kr0 implements x00 {

    /* JADX INFO: renamed from: j */
    public static final vf1 f5731j;

    /* JADX INFO: renamed from: h */
    public final ir0 f5732h;

    /* JADX INFO: renamed from: i */
    public final q43 f5733i;

    static {
        o72 o72Var = vf1.f11926d;
        f5731j = AbstractC0731te.m5175C("application/json; charset=UTF-8");
    }

    public kr0(ir0 ir0Var, q43 q43Var) {
        this.f5732h = ir0Var;
        this.f5733i = q43Var;
    }

    @Override // p000.x00
    /* JADX INFO: renamed from: j */
    public final Object mo1846j(Object obj) throws IOException {
        C0209fn c0209fn = new C0209fn();
        o41 o41VarM2387d = this.f5732h.m2387d(new OutputStreamWriter(new C0172en(c0209fn), StandardCharsets.UTF_8));
        this.f5733i.mo98c(o41VarM2387d, obj);
        o41VarM2387d.close();
        C0505no c0505noMo1678f = c0209fn.mo1678f(c0209fn.f3068i);
        int i = o82.f7582a;
        c0505noMo1678f.getClass();
        return new m82(f5731j, c0505noMo1678f);
    }
}
