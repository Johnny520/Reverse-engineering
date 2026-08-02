package p000;

import java.lang.reflect.Field;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class k72 extends j72 {

    /* JADX INFO: renamed from: b */
    public final gs1 f5377b;

    public k72(gs1 gs1Var, l72 l72Var) {
        super(l72Var);
        this.f5377b = gs1Var;
    }

    @Override // p000.j72
    /* JADX INFO: renamed from: d */
    public final Object mo2467d() {
        return this.f5377b.mo2023a();
    }

    @Override // p000.j72
    /* JADX INFO: renamed from: f */
    public final void mo2469f(Object obj, l41 l41Var, i72 i72Var) throws IllegalAccessException {
        Field field = i72Var.f4472b;
        Object objMo97b = i72Var.f4476f.mo97b(l41Var);
        if (objMo97b == null && i72Var.f4477g) {
            return;
        }
        if (i72Var.f4478h) {
            throw new t31("Cannot set value of 'static final' ".concat(h72.m2119d(field, false)));
        }
        field.set(obj, objMo97b);
    }

    @Override // p000.j72
    /* JADX INFO: renamed from: e */
    public final Object mo2468e(Object obj) {
        return obj;
    }
}
