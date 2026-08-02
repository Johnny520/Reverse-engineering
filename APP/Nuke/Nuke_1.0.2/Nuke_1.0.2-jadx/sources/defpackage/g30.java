package defpackage;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class g30 extends i30 {
    public static final g30[] i = new g30[511];
    public static final g30 j;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static {
        j(-1);
        j = j(0);
        j(1);
        j(2);
        j(3);
        j(4);
        j(5);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static g30 j(int i2) {
        g30[] g30VarArr = i;
        int length = (Integer.MAX_VALUE & i2) % g30VarArr.length;
        g30 g30Var = g30VarArr[length];
        if (g30Var != null && g30Var.h == i2) {
            return g30Var;
        }
        g30 g30Var2 = new g30(i2);
        g30VarArr[length] = g30Var2;
        return g30Var2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.w53
    public final o43 a() {
        return o43.s;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.t23
    public final String b() {
        return Integer.toString(this.h);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.dz
    public final String f() {
        return "int";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        StringBuilder sb = new StringBuilder("int{0x");
        int i2 = this.h;
        sb.append(pp0.K(i2));
        sb.append(" / ");
        sb.append(i2);
        sb.append('}');
        return sb.toString();
    }
}
