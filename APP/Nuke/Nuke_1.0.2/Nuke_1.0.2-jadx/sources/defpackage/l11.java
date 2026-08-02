package defpackage;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class l11 {
    public final int a;
    public final int b;
    public final b5 c;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public l11(int i, int i2, b5 b5Var) {
        this.a = i;
        this.b = i2;
        this.c = b5Var;
        if (i < 0) {
            nz0.a("startIndex should be >= 0");
        }
        if (i2 > 0) {
            return;
        }
        nz0.a("size should be > 0");
    }
}
