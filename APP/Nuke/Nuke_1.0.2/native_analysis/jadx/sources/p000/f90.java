package p000;

import java.io.File;
import java.io.IOException;
import java.net.SocketException;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class f90 {

    /* JADX INFO: renamed from: a */
    public boolean f2862a;

    /* JADX INFO: renamed from: b */
    public final Object f2863b;

    /* JADX INFO: renamed from: c */
    public Object f2864c;

    /* JADX INFO: renamed from: d */
    public Object f2865d;

    public f90() {
        this.f2863b = new Object();
        this.f2864c = new ArrayList();
        this.f2865d = new ArrayList();
        this.f2862a = true;
    }

    /* JADX INFO: renamed from: b */
    public static IOException m1587b(f90 f90Var, boolean z, IOException iOException, int i) {
        boolean z2 = (i & 4) == 0;
        boolean z3 = (i & 8) == 0;
        if (iOException != null) {
            f90Var.m1593g(iOException);
        }
        if (z3) {
            kg0 kg0Var = ((s52) f90Var.f2863b).f9916k;
            if (iOException != null) {
                kg0Var.getClass();
            } else {
                kg0Var.getClass();
            }
        }
        if (z2) {
            kg0 kg0Var2 = ((s52) f90Var.f2863b).f9916k;
            if (iOException != null) {
                kg0Var2.getClass();
            } else {
                kg0Var2.getClass();
            }
        }
        return ((s52) f90Var.f2863b).m4735k(f90Var, z3 && !z, z2 && !z, z2 && z, z3 && z, iOException);
    }

    /* JADX INFO: renamed from: a */
    public void m1588a() {
        h90.m2124b((h90) this.f2865d, this, false);
    }

    /* JADX INFO: renamed from: c */
    public t52 m1589c() {
        wg0 wg0VarMo2402g = ((xg0) this.f2865d).mo2402g();
        t52 t52Var = wg0VarMo2402g instanceof t52 ? (t52) wg0VarMo2402g : null;
        if (t52Var != null) {
            return t52Var;
        }
        C0676s.m4653l("no connection for CONNECT tunnels");
        return null;
    }

    /* JADX INFO: renamed from: d */
    public File m1590d() {
        File fileM1813b;
        synchronized (((h90) this.f2865d)) {
            try {
                g90 g90Var = (g90) this.f2863b;
                if (g90Var.f3363f != this) {
                    throw new IllegalStateException();
                }
                if (!g90Var.f3362e) {
                    ((boolean[]) this.f2864c)[0] = true;
                }
                fileM1813b = g90Var.m1813b(0);
                ((h90) this.f2865d).f3908h.mkdirs();
            } catch (Throwable th) {
                throw th;
            }
        }
        return fileM1813b;
    }

    /* JADX INFO: renamed from: e */
    public w52 m1591e(r92 r92Var) throws IOException {
        f90 f90Var;
        String strM2557a;
        long jMo2403h;
        try {
            strM2557a = r92Var.f9461m.m2557a("Content-Type");
            if (strM2557a == null) {
                strM2557a = null;
            }
            jMo2403h = ((xg0) this.f2865d).mo2403h(r92Var);
            f90Var = this;
        } catch (IOException e) {
            e = e;
            f90Var = this;
        }
        try {
            return new w52(strM2557a, jMo2403h, new o52(new vg0(f90Var, ((xg0) this.f2865d).mo2396a(r92Var), jMo2403h, false)));
        } catch (IOException e2) {
            e = e2;
            IOException iOException = e;
            ((s52) f90Var.f2863b).f9916k.getClass();
            f90Var.m1593g(iOException);
            throw iOException;
        }
    }

    /* JADX INFO: renamed from: f */
    public p92 m1592f(boolean z) throws IOException {
        try {
            p92 p92VarMo2405j = ((xg0) this.f2865d).mo2405j(z);
            if (p92VarMo2405j == null) {
                return p92VarMo2405j;
            }
            p92VarMo2405j.f8057n = this;
            return p92VarMo2405j;
        } catch (IOException e) {
            ((s52) this.f2863b).f9916k.getClass();
            m1593g(e);
            throw e;
        }
    }

    /* JADX INFO: renamed from: g */
    public void m1593g(IOException iOException) {
        this.f2862a = true;
        ((xg0) this.f2865d).mo2402g().mo4626b((s52) this.f2863b, iOException);
    }

    /* JADX INFO: renamed from: h */
    public sz0 m1594h() throws SocketException {
        s52 s52Var = (s52) this.f2863b;
        if (s52Var.f9922q) {
            C0676s.m4653l("Check failed.");
            return null;
        }
        s52Var.f9922q = true;
        s52Var.f9917l.m5887i();
        synchronized (s52Var) {
            if (s52Var.f9930y == null) {
                throw new IllegalStateException("Check failed.");
            }
            if (s52Var.f9926u || s52Var.f9927v) {
                throw new IllegalStateException("Check failed.");
            }
            if (s52Var.f9924s) {
                throw new IllegalStateException("Check failed.");
            }
            if (!s52Var.f9925t) {
                throw new IllegalStateException("Check failed.");
            }
            s52Var.f9925t = false;
            s52Var.f9926u = true;
            s52Var.f9927v = true;
        }
        wg0 wg0VarMo2402g = ((xg0) this.f2865d).mo2402g();
        wg0VarMo2402g.getClass();
        t52 t52Var = (t52) wg0VarMo2402g;
        t52Var.f10565e.setSoTimeout(0);
        t52Var.mo4628h();
        return new sz0(this);
    }

    public f90(s52 s52Var, yg0 yg0Var, xg0 xg0Var) {
        yg0Var.getClass();
        this.f2863b = s52Var;
        this.f2864c = yg0Var;
        this.f2865d = xg0Var;
    }

    public f90(af0 af0Var, br2 br2Var) {
        this.f2865d = new dr2(this);
        this.f2864c = af0Var;
        this.f2863b = br2Var;
    }

    public f90(z71 z71Var, hw2 hw2Var, q22 q22Var) {
        this.f2863b = z71Var;
        this.f2864c = hw2Var;
        this.f2865d = q22Var;
        this.f2862a = true;
    }

    public f90(h90 h90Var, g90 g90Var) {
        this.f2865d = h90Var;
        this.f2863b = g90Var;
        this.f2864c = g90Var.f3362e ? null : new boolean[h90Var.f3914n];
    }
}
