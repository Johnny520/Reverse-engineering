package defpackage;

import java.io.File;
import java.io.IOException;
import java.net.SocketException;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class f90 {
    public boolean a;
    public final Object b;
    public Object c;
    public Object d;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public f90() {
        this.b = new Object();
        this.c = new ArrayList();
        this.d = new ArrayList();
        this.a = true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static IOException b(f90 f90Var, boolean z, IOException iOException, int i) {
        boolean z2 = (i & 4) == 0;
        boolean z3 = (i & 8) == 0;
        if (iOException != null) {
            f90Var.g(iOException);
        }
        if (z3) {
            kg0 kg0Var = ((s52) f90Var.b).k;
            if (iOException != null) {
                kg0Var.getClass();
            } else {
                kg0Var.getClass();
            }
        }
        if (z2) {
            kg0 kg0Var2 = ((s52) f90Var.b).k;
            if (iOException != null) {
                kg0Var2.getClass();
            } else {
                kg0Var2.getClass();
            }
        }
        return ((s52) f90Var.b).k(f90Var, z3 && !z, z2 && !z, z2 && z, z3 && z, iOException);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void a() {
        h90.b((h90) this.d, this, false);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public t52 c() {
        wg0 wg0VarG = ((xg0) this.d).g();
        t52 t52Var = wg0VarG instanceof t52 ? (t52) wg0VarG : null;
        if (t52Var != null) {
            return t52Var;
        }
        s.l("no connection for CONNECT tunnels");
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public File d() {
        File fileB;
        synchronized (((h90) this.d)) {
            try {
                g90 g90Var = (g90) this.b;
                if (g90Var.f != this) {
                    throw new IllegalStateException();
                }
                if (!g90Var.e) {
                    ((boolean[]) this.c)[0] = true;
                }
                fileB = g90Var.b(0);
                ((h90) this.d).h.mkdirs();
            } catch (Throwable th) {
                throw th;
            }
        }
        return fileB;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public w52 e(r92 r92Var) throws IOException {
        f90 f90Var;
        String strA;
        long jH;
        try {
            strA = r92Var.m.a("Content-Type");
            if (strA == null) {
                strA = null;
            }
            jH = ((xg0) this.d).h(r92Var);
            f90Var = this;
        } catch (IOException e) {
            e = e;
            f90Var = this;
        }
        try {
            return new w52(strA, jH, new o52(new vg0(f90Var, ((xg0) this.d).a(r92Var), jH, false)));
        } catch (IOException e2) {
            e = e2;
            IOException iOException = e;
            ((s52) f90Var.b).k.getClass();
            f90Var.g(iOException);
            throw iOException;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public p92 f(boolean z) throws IOException {
        try {
            p92 p92VarJ = ((xg0) this.d).j(z);
            if (p92VarJ == null) {
                return p92VarJ;
            }
            p92VarJ.n = this;
            return p92VarJ;
        } catch (IOException e) {
            ((s52) this.b).k.getClass();
            g(e);
            throw e;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void g(IOException iOException) {
        this.a = true;
        ((xg0) this.d).g().b((s52) this.b, iOException);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public sz0 h() throws SocketException {
        s52 s52Var = (s52) this.b;
        if (s52Var.q) {
            s.l("Check failed.");
            return null;
        }
        s52Var.q = true;
        s52Var.l.i();
        synchronized (s52Var) {
            if (s52Var.y == null) {
                throw new IllegalStateException("Check failed.");
            }
            if (s52Var.u || s52Var.v) {
                throw new IllegalStateException("Check failed.");
            }
            if (s52Var.s) {
                throw new IllegalStateException("Check failed.");
            }
            if (!s52Var.t) {
                throw new IllegalStateException("Check failed.");
            }
            s52Var.t = false;
            s52Var.u = true;
            s52Var.v = true;
        }
        wg0 wg0VarG = ((xg0) this.d).g();
        wg0VarG.getClass();
        t52 t52Var = (t52) wg0VarG;
        t52Var.e.setSoTimeout(0);
        t52Var.h();
        return new sz0(this);
    }

    public f90(s52 s52Var, yg0 yg0Var, xg0 xg0Var) {
        yg0Var.getClass();
        this.b = s52Var;
        this.c = yg0Var;
        this.d = xg0Var;
    }

    public f90(af0 af0Var, br2 br2Var) {
        this.d = new dr2(this);
        this.c = af0Var;
        this.b = br2Var;
    }

    public f90(z71 z71Var, hw2 hw2Var, q22 q22Var) {
        this.b = z71Var;
        this.c = hw2Var;
        this.d = q22Var;
        this.a = true;
    }

    public f90(h90 h90Var, g90 g90Var) {
        this.d = h90Var;
        this.b = g90Var;
        this.c = g90Var.e ? null : new boolean[h90Var.n];
    }
}
