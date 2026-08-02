package defpackage;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class fk1 extends se1 implements r41 {
    public final ez1 k;
    public Object l;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public fk1(ez1 ez1Var, Object obj, Object obj2) {
        super(0, obj, obj2);
        this.k = ez1Var;
        this.l = obj2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.se1, java.util.Map.Entry
    public final Object getValue() {
        return this.l;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.se1, java.util.Map.Entry
    public final Object setValue(Object obj) {
        Object obj2 = this.l;
        this.l = obj;
        cz1 cz1Var = (cz1) this.k.i;
        bz1 bz1Var = cz1Var.k;
        Object obj3 = this.i;
        if (!bz1Var.containsKey(obj3)) {
            return obj2;
        }
        boolean z = cz1Var.j;
        if (!z) {
            bz1Var.put(obj3, obj);
        } else {
            if (!z) {
                um2.b();
                return null;
            }
            i43 i43Var = cz1Var.h[cz1Var.i];
            Object obj4 = i43Var.h[i43Var.j];
            bz1Var.put(obj3, obj);
            cz1Var.c(obj4 != null ? obj4.hashCode() : 0, bz1Var.j, obj4, 0);
        }
        cz1Var.n = bz1Var.l;
        return obj2;
    }
}
