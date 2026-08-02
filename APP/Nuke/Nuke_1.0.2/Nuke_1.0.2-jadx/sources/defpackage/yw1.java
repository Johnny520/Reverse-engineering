package defpackage;

import java.io.IOException;
import java.lang.reflect.Method;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class yw1 extends op0 {
    public final Method h;
    public final int i;
    public final x00 j;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public yw1(Method method, int i, x00 x00Var) {
        this.h = method;
        this.i = i;
        this.j = x00Var;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.op0
    public final void j(r82 r82Var, Object obj) {
        int i = this.i;
        Method method = this.h;
        if (obj == null) {
            throw xe1.a0(method, i, "Body parameter value must not be null.", new Object[0]);
        }
        try {
            r82Var.k = (o82) this.j.j(obj);
        } catch (IOException e) {
            throw xe1.b0(method, e, i, "Unable to convert " + obj + " to RequestBody", new Object[0]);
        }
    }
}
