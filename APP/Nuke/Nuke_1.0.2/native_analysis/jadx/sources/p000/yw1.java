package p000;

import java.io.IOException;
import java.lang.reflect.Method;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class yw1 extends op0 {

    /* JADX INFO: renamed from: h */
    public final Method f13650h;

    /* JADX INFO: renamed from: i */
    public final int f13651i;

    /* JADX INFO: renamed from: j */
    public final x00 f13652j;

    public yw1(Method method, int i, x00 x00Var) {
        this.f13650h = method;
        this.f13651i = i;
        this.f13652j = x00Var;
    }

    @Override // p000.op0
    /* JADX INFO: renamed from: j */
    public final void mo301j(r82 r82Var, Object obj) {
        int i = this.f13651i;
        Method method = this.f13650h;
        if (obj == null) {
            throw xe1.m6110a0(method, i, "Body parameter value must not be null.", new Object[0]);
        }
        try {
            r82Var.f9440k = (o82) this.f13652j.mo1846j(obj);
        } catch (IOException e) {
            throw xe1.m6112b0(method, e, i, "Unable to convert " + obj + " to RequestBody", new Object[0]);
        }
    }
}
