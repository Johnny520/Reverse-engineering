package defpackage;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class iz2 {
    public final sd a;
    public final m13 b;
    public final boolean e;
    public final e70 g;
    public final xl0 h;
    public cj j;
    public d61 k;
    public final int c = Integer.MAX_VALUE;
    public final int d = 1;
    public final int f = 1;
    public final List i = be0.h;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public iz2(sd sdVar, m13 m13Var, boolean z, e70 e70Var, xl0 xl0Var, int i) {
        this.a = sdVar;
        this.b = m13Var;
        this.e = z;
        this.g = e70Var;
        this.h = xl0Var;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void a(d61 d61Var) {
        cj cjVar = this.j;
        if (cjVar == null || d61Var != this.k || cjVar.b()) {
            this.k = d61Var;
            cjVar = new cj(this.a, xe1.k0(this.b, d61Var), this.i, this.g, this.h);
        }
        this.j = cjVar;
    }
}
