package p000;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class n53 implements r43 {

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ Class f7013h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ Class f7014i;

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ q43 f7015j;

    public n53(Class cls, Class cls2, q43 q43Var) {
        this.f7013h = cls;
        this.f7014i = cls2;
        this.f7015j = q43Var;
    }

    @Override // p000.r43
    /* JADX INFO: renamed from: a */
    public final q43 mo162a(ir0 ir0Var, j63 j63Var) {
        Class cls = j63Var.f4904a;
        if (cls == this.f7013h || cls == this.f7014i) {
            return this.f7015j;
        }
        return null;
    }

    public final String toString() {
        return "Factory[type=" + this.f7014i.getName() + "+" + this.f7013h.getName() + ",adapter=" + this.f7015j + "]";
    }
}
