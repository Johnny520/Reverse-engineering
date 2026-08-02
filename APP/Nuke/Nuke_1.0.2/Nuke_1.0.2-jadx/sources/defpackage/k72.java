package defpackage;

import java.lang.reflect.Field;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class k72 extends j72 {
    public final gs1 b;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public k72(gs1 gs1Var, l72 l72Var) {
        super(l72Var);
        this.b = gs1Var;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.j72
    public final Object d() {
        return this.b.a();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.j72
    public final void f(Object obj, l41 l41Var, i72 i72Var) throws IllegalAccessException {
        Field field = i72Var.b;
        Object objB = i72Var.f.b(l41Var);
        if (objB == null && i72Var.g) {
            return;
        }
        if (i72Var.h) {
            throw new t31("Cannot set value of 'static final' ".concat(h72.d(field, false)));
        }
        field.set(obj, objB);
    }

    @Override // defpackage.j72
    public final Object e(Object obj) {
        return obj;
    }
}
