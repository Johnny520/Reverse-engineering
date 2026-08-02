package defpackage;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class p92 {
    public k82 a;
    public c42 b;
    public String d;
    public yr0 e;
    public ys2 h;
    public r92 i;
    public r92 j;
    public r92 k;
    public long l;
    public long m;
    public f90 n;
    public int c = -1;
    public u92 g = u92.i;
    public e33 o = e33.g;
    public ye0 f = new ye0(1);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static void b(String str, r92 r92Var) {
        if (r92Var != null) {
            if (r92Var.p != null) {
                s.c(str.concat(".networkResponse != null"));
            } else if (r92Var.q != null) {
                s.c(str.concat(".cacheResponse != null"));
            } else {
                if (r92Var.r == null) {
                    return;
                }
                s.c(str.concat(".priorResponse != null"));
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final r92 a() {
        int i = this.c;
        if (i < 0) {
            c80.k("code < 0: ", this.c);
            return null;
        }
        k82 k82Var = this.a;
        if (k82Var == null) {
            s.l("request == null");
            return null;
        }
        c42 c42Var = this.b;
        if (c42Var == null) {
            s.l("protocol == null");
            return null;
        }
        String str = this.d;
        if (str != null) {
            return new r92(k82Var, c42Var, str, i, this.e, this.f.b(), this.g, this.h, this.i, this.j, this.k, this.l, this.m, this.n, this.o);
        }
        s.l("message == null");
        return null;
    }
}
