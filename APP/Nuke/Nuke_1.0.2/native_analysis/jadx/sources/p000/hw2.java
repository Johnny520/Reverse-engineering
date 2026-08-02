package p000;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class hw2 {

    /* JADX INFO: renamed from: a */
    public final sz0 f4161a;

    /* JADX INFO: renamed from: b */
    public f71 f4162b;

    /* JADX INFO: renamed from: c */
    public final gw2 f4163c = new gw2(this, 2);

    /* JADX INFO: renamed from: d */
    public final gw2 f4164d = new gw2(this, 0);

    /* JADX INFO: renamed from: e */
    public final gw2 f4165e = new gw2(this, 1);

    public hw2(sz0 sz0Var) {
        this.f4161a = sz0Var;
    }

    /* JADX INFO: renamed from: a */
    public final f71 m2233a() {
        f71 f71Var = this.f4162b;
        if (f71Var != null) {
            return f71Var;
        }
        C0676s.m4651j("SubcomposeLayoutState is not attached to SubcomposeLayout");
        return null;
    }
}
