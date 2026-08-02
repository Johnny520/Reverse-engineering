package defpackage;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class bo0 {
    public final /* synthetic */ int a = 0;
    public int b;
    public int c;
    public int d;
    public Object e;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public bo0(int i, int i2, int i3, y03 y03Var) {
        this.b = i;
        this.c = i2;
        this.d = i3;
        this.e = y03Var;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public sm2 a(int i) {
        return new sm2(ci0.L((y03) this.e, i), i, 1L);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public int b() {
        return this.d - this.c;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public int c(int i) {
        return ((kv1) this.e).o[this.c + i];
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public Object d(int i) {
        return ((kv1) this.e).q[this.d + i];
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public String toString() {
        switch (this.a) {
            case 0:
                return "";
            case 1:
            default:
                return super.toString();
            case 2:
                StringBuilder sb = new StringBuilder("SelectionInfo(id=1, range=(");
                int i = this.b;
                sb.append(i);
                sb.append('-');
                y03 y03Var = (y03) this.e;
                sb.append(ci0.L(y03Var, i));
                sb.append(',');
                int i2 = this.c;
                sb.append(i2);
                sb.append('-');
                sb.append(ci0.L(y03Var, i2));
                sb.append("), prevOffset=");
                return vi0.m(sb, this.d, ')');
        }
    }

    public bo0(kv1 kv1Var) {
        this.e = kv1Var;
    }

    public /* synthetic */ bo0() {
    }
}
