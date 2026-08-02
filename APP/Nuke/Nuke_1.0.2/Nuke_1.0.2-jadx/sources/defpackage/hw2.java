package defpackage;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class hw2 {
    public final sz0 a;
    public f71 b;
    public final gw2 c = new gw2(this, 2);
    public final gw2 d = new gw2(this, 0);
    public final gw2 e = new gw2(this, 1);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public hw2(sz0 sz0Var) {
        this.a = sz0Var;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final f71 a() {
        f71 f71Var = this.b;
        if (f71Var != null) {
            return f71Var;
        }
        s.j("SubcomposeLayoutState is not attached to SubcomposeLayout");
        return null;
    }
}
