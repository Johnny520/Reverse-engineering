package defpackage;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class l53 implements r43 {
    public final /* synthetic */ int h;
    public final /* synthetic */ Class i;
    public final /* synthetic */ q43 j;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ l53(Class cls, q43 q43Var, int i) {
        this.h = i;
        this.i = cls;
        this.j = q43Var;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.r43
    public final q43 a(ir0 ir0Var, j63 j63Var) {
        int i = this.h;
        Class cls = this.i;
        switch (i) {
            case 0:
                if (j63Var.a == cls) {
                    return this.j;
                }
                return null;
            default:
                Class<?> cls2 = j63Var.a;
                if (cls.isAssignableFrom(cls2)) {
                    return new bu(this, cls2);
                }
                return null;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        int i = this.h;
        q43 q43Var = this.j;
        Class cls = this.i;
        switch (i) {
            case 0:
                return "Factory[type=" + cls.getName() + ",adapter=" + q43Var + "]";
            default:
                return "Factory[typeHierarchy=" + cls.getName() + ",adapter=" + q43Var + "]";
        }
    }
}
