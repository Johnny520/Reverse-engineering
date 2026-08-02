package p000;

import java.lang.reflect.Method;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class bx1 extends op0 {

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ int f1064h;

    /* JADX INFO: renamed from: i */
    public final Method f1065i;

    /* JADX INFO: renamed from: j */
    public final int f1066j;

    public /* synthetic */ bx1(Method method, int i, int i2) {
        this.f1064h = i2;
        this.f1065i = method;
        this.f1066j = i;
    }

    @Override // p000.op0
    /* JADX INFO: renamed from: j */
    public final void mo301j(r82 r82Var, Object obj) {
        int i = this.f1064h;
        int i2 = this.f1066j;
        Method method = this.f1065i;
        switch (i) {
            case 0:
                js0 js0Var = (js0) obj;
                if (js0Var == null) {
                    throw xe1.m6110a0(method, i2, "Headers parameter must not be null.", new Object[0]);
                }
                ye0 ye0Var = r82Var.f9435f;
                ye0Var.getClass();
                int size = js0Var.size();
                for (int i3 = 0; i3 < size; i3++) {
                    n93.m3260a(ye0Var, js0Var.m2558b(i3), js0Var.m2560d(i3));
                }
                return;
            default:
                if (obj == null) {
                    throw xe1.m6110a0(method, i2, "@Url parameter is null.", new Object[0]);
                }
                r82Var.f9432c = obj.toString();
                return;
        }
    }
}
