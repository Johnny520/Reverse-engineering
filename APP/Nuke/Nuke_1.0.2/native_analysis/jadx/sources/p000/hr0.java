package p000;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public class hr0 extends ep2 {

    /* JADX INFO: renamed from: a */
    public q43 f4119a = null;

    @Override // p000.q43
    /* JADX INFO: renamed from: b */
    public final Object mo97b(l41 l41Var) {
        q43 q43Var = this.f4119a;
        if (q43Var != null) {
            return q43Var.mo97b(l41Var);
        }
        C0676s.m4653l("Adapter for type with cyclic dependency has been used before dependency has been resolved");
        return null;
    }

    @Override // p000.q43
    /* JADX INFO: renamed from: c */
    public final void mo98c(o41 o41Var, Object obj) {
        q43 q43Var = this.f4119a;
        if (q43Var != null) {
            q43Var.mo98c(o41Var, obj);
        } else {
            C0676s.m4653l("Adapter for type with cyclic dependency has been used before dependency has been resolved");
        }
    }

    @Override // p000.ep2
    /* JADX INFO: renamed from: d */
    public final q43 mo1410d() {
        q43 q43Var = this.f4119a;
        if (q43Var != null) {
            return q43Var;
        }
        C0676s.m4653l("Adapter for type with cyclic dependency has been used before dependency has been resolved");
        return null;
    }
}
