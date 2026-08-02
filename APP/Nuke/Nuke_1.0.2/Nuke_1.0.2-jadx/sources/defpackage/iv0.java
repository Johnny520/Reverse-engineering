package defpackage;

import java.io.EOFException;
import java.io.IOException;
import java.net.Proxy;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class iv0 implements xg0 {
    public static final js0 f;
    public final et1 a;
    public final wg0 b;
    public final b5 c;
    public int d;
    public final ms0 e;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static {
        js0 js0Var = js0.i;
        f = ci0.P("OkHttp-Response-Body", "Truncated");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public iv0(et1 et1Var, wg0 wg0Var, b5 b5Var) {
        b5Var.getClass();
        this.a = et1Var;
        this.b = wg0Var;
        this.c = b5Var;
        o52 o52Var = (o52) b5Var.j;
        o52Var.getClass();
        ms0 ms0Var = new ms0();
        ms0Var.b = o52Var;
        ms0Var.a = 262144L;
        this.e = ms0Var;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.xg0
    public final ht2 a(r92 r92Var) {
        k82 k82Var = r92Var.h;
        if (!sw0.a(r92Var)) {
            return k(k82Var.a, 0L);
        }
        String strA = r92Var.m.a("Transfer-Encoding");
        if (strA == null) {
            strA = null;
        }
        if ("chunked".equalsIgnoreCase(strA)) {
            yw0 yw0Var = k82Var.a;
            if (this.d == 4) {
                this.d = 5;
                return new ev0(this, yw0Var);
            }
            c80.k("state: ", this.d);
            return null;
        }
        long jE = wg3.e(r92Var);
        if (jE != -1) {
            return k(k82Var.a, jE);
        }
        yw0 yw0Var2 = k82Var.a;
        if (this.d != 4) {
            c80.k("state: ", this.d);
            return null;
        }
        this.d = 5;
        this.b.h();
        yw0Var2.getClass();
        return new hv0(this, yw0Var2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.xg0
    public final void b(k82 k82Var) {
        Proxy.Type type = this.b.f().b.type();
        type.getClass();
        StringBuilder sb = new StringBuilder();
        sb.append(k82Var.b);
        sb.append(' ');
        yw0 yw0Var = k82Var.a;
        if (t11.l(yw0Var.a, "https") || type != Proxy.Type.HTTP) {
            String strB = yw0Var.b();
            String strD = yw0Var.d();
            if (strD != null) {
                strB = strB + '?' + strD;
            }
            sb.append(strB);
        } else {
            sb.append(yw0Var);
        }
        sb.append(" HTTP/1.1");
        l(k82Var.c, sb.toString());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.xg0
    public final void c() {
        ((n52) this.c.k).flush();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.xg0
    public final void cancel() {
        this.b.cancel();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.xg0
    public final boolean d() {
        return this.d == 6;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.xg0
    public final void e() {
        ((n52) this.c.k).flush();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.xg0
    public final ys2 f() {
        return this.c;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.xg0
    public final wg0 g() {
        return this.b;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.xg0
    public final long h(r92 r92Var) {
        if (!sw0.a(r92Var)) {
            return 0L;
        }
        String strA = r92Var.m.a("Transfer-Encoding");
        if (strA == null) {
            strA = null;
        }
        if ("chunked".equalsIgnoreCase(strA)) {
            return -1L;
        }
        return wg3.e(r92Var);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.xg0
    public final fr2 i(k82 k82Var, long j) {
        if ("chunked".equalsIgnoreCase(k82Var.c.a("Transfer-Encoding"))) {
            if (this.d == 1) {
                this.d = 2;
                return new dv0(this);
            }
            c80.k("state: ", this.d);
            return null;
        }
        if (j == -1) {
            s.l("Cannot stream a request body without chunked encoding or a known content length!");
            return null;
        }
        if (this.d == 1) {
            this.d = 2;
            return new gv0(this);
        }
        c80.k("state: ", this.d);
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.xg0
    public final p92 j(boolean z) {
        ms0 ms0Var = this.e;
        int i = this.d;
        if (i != 0 && i != 1 && i != 2 && i != 3) {
            c80.k("state: ", this.d);
            return null;
        }
        try {
            String strS = ((on) ms0Var.b).s(ms0Var.a);
            ms0Var.a -= (long) strS.length();
            e9 e9VarF = t11.F(strS);
            int i2 = e9VarF.i;
            p92 p92Var = new p92();
            p92Var.b = (c42) e9VarF.j;
            p92Var.c = i2;
            p92Var.d = (String) e9VarF.k;
            p92Var.f = ms0Var.c().c();
            if (z && i2 == 100) {
                return null;
            }
            if (i2 == 100) {
                this.d = 3;
                return p92Var;
            }
            if (102 > i2 || i2 >= 200) {
                this.d = 4;
                return p92Var;
            }
            this.d = 3;
            return p92Var;
        } catch (EOFException e) {
            throw new IOException("unexpected end of stream on ".concat(this.b.f().a.i.g()), e);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final fv0 k(yw0 yw0Var, long j) {
        if (this.d == 4) {
            this.d = 5;
            return new fv0(this, yw0Var, j);
        }
        c80.k("state: ", this.d);
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void l(js0 js0Var, String str) {
        js0Var.getClass();
        if (this.d != 0) {
            c80.k("state: ", this.d);
            return;
        }
        b5 b5Var = this.c;
        n52 n52Var = (n52) b5Var.k;
        n52Var.y(str);
        n52Var.y("\r\n");
        int size = js0Var.size();
        int i = 0;
        while (true) {
            n52 n52Var2 = (n52) b5Var.k;
            if (i >= size) {
                n52Var2.y("\r\n");
                this.d = 1;
                return;
            } else {
                n52Var2.y(js0Var.b(i));
                n52Var2.y(": ");
                n52Var2.y(js0Var.d(i));
                n52Var2.y("\r\n");
                i++;
            }
        }
    }
}
