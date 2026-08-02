package defpackage;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class n53 implements r43 {
    public final /* synthetic */ Class h;
    public final /* synthetic */ Class i;
    public final /* synthetic */ q43 j;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public n53(Class cls, Class cls2, q43 q43Var) {
        this.h = cls;
        this.i = cls2;
        this.j = q43Var;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.r43
    public final q43 a(ir0 ir0Var, j63 j63Var) {
        Class cls = j63Var.a;
        if (cls == this.h || cls == this.i) {
            return this.j;
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return "Factory[type=" + this.i.getName() + "+" + this.h.getName() + ",adapter=" + this.j + "]";
    }
}
