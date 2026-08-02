package p000;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class l53 implements r43 {

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ int f5941h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ Class f5942i;

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ q43 f5943j;

    public /* synthetic */ l53(Class cls, q43 q43Var, int i) {
        this.f5941h = i;
        this.f5942i = cls;
        this.f5943j = q43Var;
    }

    @Override // p000.r43
    /* JADX INFO: renamed from: a */
    public final q43 mo162a(ir0 ir0Var, j63 j63Var) {
        int i = this.f5941h;
        Class cls = this.f5942i;
        switch (i) {
            case 0:
                if (j63Var.f4904a == cls) {
                    return this.f5943j;
                }
                return null;
            default:
                Class<?> cls2 = j63Var.f4904a;
                if (cls.isAssignableFrom(cls2)) {
                    return new C0068bu(this, cls2);
                }
                return null;
        }
    }

    public final String toString() {
        int i = this.f5941h;
        q43 q43Var = this.f5943j;
        Class cls = this.f5942i;
        switch (i) {
            case 0:
                return "Factory[type=" + cls.getName() + ",adapter=" + q43Var + "]";
            default:
                return "Factory[typeHierarchy=" + cls.getName() + ",adapter=" + q43Var + "]";
        }
    }
}
