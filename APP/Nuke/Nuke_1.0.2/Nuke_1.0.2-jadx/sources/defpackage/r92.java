package defpackage;

import java.io.Closeable;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class r92 implements Closeable {
    public final k82 h;
    public final c42 i;
    public final String j;
    public final int k;
    public final yr0 l;
    public final js0 m;
    public final u92 n;
    public final ys2 o;
    public final r92 p;
    public final r92 q;
    public final r92 r;
    public final long s;
    public final long t;
    public final f90 u;
    public final e33 v;
    public final boolean w;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public r92(k82 k82Var, c42 c42Var, String str, int i, yr0 yr0Var, js0 js0Var, u92 u92Var, ys2 ys2Var, r92 r92Var, r92 r92Var2, r92 r92Var3, long j, long j2, f90 f90Var, e33 e33Var) {
        k82Var.getClass();
        c42Var.getClass();
        str.getClass();
        u92Var.getClass();
        e33Var.getClass();
        this.h = k82Var;
        this.i = c42Var;
        this.j = str;
        this.k = i;
        this.l = yr0Var;
        this.m = js0Var;
        this.n = u92Var;
        this.o = ys2Var;
        this.p = r92Var;
        this.q = r92Var2;
        this.r = r92Var3;
        this.s = j;
        this.t = j2;
        this.u = f90Var;
        this.v = e33Var;
        boolean z = false;
        if (200 <= i && i < 300) {
            z = true;
        }
        this.w = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final p92 b() {
        p92 p92Var = new p92();
        p92Var.c = -1;
        p92Var.g = u92.i;
        p92Var.o = e33.g;
        p92Var.a = this.h;
        p92Var.b = this.i;
        p92Var.c = this.k;
        p92Var.d = this.j;
        p92Var.e = this.l;
        p92Var.f = this.m.c();
        p92Var.g = this.n;
        p92Var.h = this.o;
        p92Var.i = this.p;
        p92Var.j = this.q;
        p92Var.k = this.r;
        p92Var.l = this.s;
        p92Var.m = this.t;
        p92Var.n = this.u;
        p92Var.o = this.v;
        return p92Var;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.n.close();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return "Response{protocol=" + this.i + ", code=" + this.k + ", message=" + this.j + ", url=" + this.h.a + '}';
    }
}
