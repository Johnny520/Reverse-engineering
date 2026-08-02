package defpackage;

import java.lang.reflect.Method;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class bx1 extends op0 {
    public final /* synthetic */ int h;
    public final Method i;
    public final int j;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ bx1(Method method, int i, int i2) {
        this.h = i2;
        this.i = method;
        this.j = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.op0
    public final void j(r82 r82Var, Object obj) {
        int i = this.h;
        int i2 = this.j;
        Method method = this.i;
        switch (i) {
            case 0:
                js0 js0Var = (js0) obj;
                if (js0Var == null) {
                    throw xe1.a0(method, i2, "Headers parameter must not be null.", new Object[0]);
                }
                ye0 ye0Var = r82Var.f;
                ye0Var.getClass();
                int size = js0Var.size();
                for (int i3 = 0; i3 < size; i3++) {
                    n93.a(ye0Var, js0Var.b(i3), js0Var.d(i3));
                }
                return;
            default:
                if (obj == null) {
                    throw xe1.a0(method, i2, "@Url parameter is null.", new Object[0]);
                }
                r82Var.c = obj.toString();
                return;
        }
    }
}
