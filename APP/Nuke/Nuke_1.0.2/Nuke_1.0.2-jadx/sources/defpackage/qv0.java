package defpackage;

import java.io.Closeable;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.Socket;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.TimeZone;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class qv0 implements Closeable {
    public static final xp2 G;
    public long A;
    public long B;
    public final b5 C;
    public final yv0 D;
    public final x0 E;
    public final LinkedHashSet F;
    public final ov0 h;
    public final LinkedHashMap i = new LinkedHashMap();
    public final String j;
    public int k;
    public int l;
    public boolean m;
    public final iy2 n;
    public final hy2 o;
    public final hy2 p;
    public final hy2 q;
    public final gd3 r;
    public long s;
    public long t;
    public long u;
    public long v;
    public final bk0 w;
    public final xp2 x;
    public xp2 y;
    public final sd3 z;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static {
        xp2 xp2Var = new xp2();
        xp2Var.b(4, 65535);
        xp2Var.b(5, 16384);
        G = xp2Var;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public qv0(cj cjVar) {
        this.h = (ov0) cjVar.d;
        String str = (String) cjVar.c;
        if (str == null) {
            t11.S("connectionName");
            throw null;
        }
        this.j = str;
        this.l = 3;
        iy2 iy2Var = (iy2) cjVar.a;
        this.n = iy2Var;
        this.o = iy2Var.d();
        this.p = iy2Var.d();
        this.q = iy2Var.d();
        this.r = gd3.D;
        this.w = (bk0) cjVar.e;
        xp2 xp2Var = new xp2();
        xp2Var.b(4, 16777216);
        this.x = xp2Var;
        this.y = G;
        this.z = new sd3(0);
        this.B = r0.a();
        b5 b5Var = (b5) cjVar.b;
        if (b5Var == null) {
            t11.S("socket");
            throw null;
        }
        this.C = b5Var;
        this.D = new yv0((n52) b5Var.k);
        this.E = new x0(this, new tv0((o52) b5Var.j));
        this.F = new LinkedHashSet();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void b(cg0 cg0Var, cg0 cg0Var2, IOException iOException) {
        int i;
        Object[] array;
        TimeZone timeZone = wg3.a;
        try {
            g(cg0Var);
        } catch (IOException unused) {
        }
        synchronized (this) {
            if (this.i.isEmpty()) {
                array = null;
            } else {
                array = this.i.values().toArray(new xv0[0]);
                this.i.clear();
            }
        }
        xv0[] xv0VarArr = (xv0[]) array;
        if (xv0VarArr != null) {
            for (xv0 xv0Var : xv0VarArr) {
                try {
                    xv0Var.c(cg0Var2, iOException);
                } catch (IOException unused2) {
                }
            }
        }
        try {
            this.D.close();
        } catch (IOException unused3) {
        }
        try {
            ((Socket) ((kj1) this.C.i).i).close();
        } catch (IOException unused4) {
        }
        this.o.e();
        this.p.e();
        this.q.e();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final xv0 c(int i) {
        xv0 xv0Var;
        synchronized (this) {
            xv0Var = (xv0) this.i.get(Integer.valueOf(i));
        }
        return xv0Var;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        b(cg0.NO_ERROR, cg0.CANCEL, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final xv0 e(int i) {
        xv0 xv0Var;
        synchronized (this) {
            xv0Var = (xv0) this.i.remove(Integer.valueOf(i));
            notifyAll();
        }
        return xv0Var;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void flush() {
        this.D.flush();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void g(cg0 cg0Var) {
        synchronized (this.D) {
            synchronized (this) {
                if (this.m) {
                    return;
                }
                this.m = true;
                this.D.g(this.k, cg0Var, ug3.a);
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void h(long j) {
        synchronized (this) {
            try {
                sd3.b(this.z, j, 0L, 2);
                long jA = this.z.a();
                if (jA >= this.x.a() / 2) {
                    o(jA, 0);
                    sd3.b(this.z, 0L, jA, 1);
                }
                bk0 bk0Var = this.w;
                sd3 sd3Var = this.z;
                bk0Var.getClass();
                sd3Var.getClass();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0035, code lost:
    
        r2 = java.lang.Math.min((int) java.lang.Math.min(r12, r6 - r4), r8.D.j);
        r6 = r2;
        r8.A += r6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void j(int i, boolean z, fn fnVar, long j) {
        int iMin;
        long j2;
        if (j == 0) {
            this.D.c(z, i, fnVar, 0);
            return;
        }
        while (j > 0) {
            synchronized (this) {
                while (true) {
                    try {
                        try {
                            long j3 = this.A;
                            long j4 = this.B;
                            if (j3 < j4) {
                                break;
                            } else {
                                if (!this.i.containsKey(Integer.valueOf(i))) {
                                    throw new IOException("stream closed");
                                }
                                wait();
                            }
                        } catch (InterruptedException unused) {
                            Thread.currentThread().interrupt();
                            throw new InterruptedIOException();
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
            j -= j2;
            this.D.c(z && j == 0, i, fnVar, iMin);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void k(int i, cg0 cg0Var) {
        hy2.b(this.o, this.j + '[' + i + "] writeSynReset", new vf0(this, i, cg0Var));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void o(final long j, final int i) {
        hy2.b(this.o, this.j + '[' + i + "] windowUpdate", new xm0() { // from class: kv0
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            @Override // defpackage.xm0
            public final Object a() {
                qv0 qv0Var = this.h;
                int i2 = i;
                try {
                    qv0Var.D.o(j, i2);
                } catch (IOException e) {
                    cg0 cg0Var = cg0.PROTOCOL_ERROR;
                    qv0Var.b(cg0Var, cg0Var, e);
                }
                return a83.a;
            }
        });
    }
}
