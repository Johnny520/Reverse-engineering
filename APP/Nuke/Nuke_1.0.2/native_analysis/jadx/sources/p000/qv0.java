package p000;

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

    /* JADX INFO: renamed from: G */
    public static final xp2 f9179G;

    /* JADX INFO: renamed from: A */
    public long f9180A;

    /* JADX INFO: renamed from: B */
    public long f9181B;

    /* JADX INFO: renamed from: C */
    public final C0043b5 f9182C;

    /* JADX INFO: renamed from: D */
    public final yv0 f9183D;

    /* JADX INFO: renamed from: E */
    public final C0867x0 f9184E;

    /* JADX INFO: renamed from: F */
    public final LinkedHashSet f9185F;

    /* JADX INFO: renamed from: h */
    public final ov0 f9186h;

    /* JADX INFO: renamed from: i */
    public final LinkedHashMap f9187i = new LinkedHashMap();

    /* JADX INFO: renamed from: j */
    public final String f9188j;

    /* JADX INFO: renamed from: k */
    public int f9189k;

    /* JADX INFO: renamed from: l */
    public int f9190l;

    /* JADX INFO: renamed from: m */
    public boolean f9191m;

    /* JADX INFO: renamed from: n */
    public final iy2 f9192n;

    /* JADX INFO: renamed from: o */
    public final hy2 f9193o;

    /* JADX INFO: renamed from: p */
    public final hy2 f9194p;

    /* JADX INFO: renamed from: q */
    public final hy2 f9195q;

    /* JADX INFO: renamed from: r */
    public final gd3 f9196r;

    /* JADX INFO: renamed from: s */
    public long f9197s;

    /* JADX INFO: renamed from: t */
    public long f9198t;

    /* JADX INFO: renamed from: u */
    public long f9199u;

    /* JADX INFO: renamed from: v */
    public long f9200v;

    /* JADX INFO: renamed from: w */
    public final bk0 f9201w;

    /* JADX INFO: renamed from: x */
    public final xp2 f9202x;

    /* JADX INFO: renamed from: y */
    public xp2 f9203y;

    /* JADX INFO: renamed from: z */
    public final sd3 f9204z;

    static {
        xp2 xp2Var = new xp2();
        xp2Var.m6171b(4, 65535);
        xp2Var.m6171b(5, 16384);
        f9179G = xp2Var;
    }

    public qv0(C0093cj c0093cj) {
        this.f9186h = (ov0) c0093cj.f1582d;
        String str = (String) c0093cj.f1581c;
        if (str == null) {
            t11.m5067S("connectionName");
            throw null;
        }
        this.f9188j = str;
        this.f9190l = 3;
        iy2 iy2Var = (iy2) c0093cj.f1579a;
        this.f9192n = iy2Var;
        this.f9193o = iy2Var.m2421d();
        this.f9194p = iy2Var.m2421d();
        this.f9195q = iy2Var.m2421d();
        this.f9196r = gd3.f3417D;
        this.f9201w = (bk0) c0093cj.f1583e;
        xp2 xp2Var = new xp2();
        xp2Var.m6171b(4, 16777216);
        this.f9202x = xp2Var;
        this.f9203y = f9179G;
        this.f9204z = new sd3(0);
        this.f9181B = r0.m6170a();
        C0043b5 c0043b5 = (C0043b5) c0093cj.f1580b;
        if (c0043b5 == null) {
            t11.m5067S("socket");
            throw null;
        }
        this.f9182C = c0043b5;
        this.f9183D = new yv0((n52) c0043b5.f564k);
        this.f9184E = new C0867x0(this, new tv0((o52) c0043b5.f563j));
        this.f9185F = new LinkedHashSet();
    }

    /* JADX INFO: renamed from: b */
    public final void m4281b(cg0 cg0Var, cg0 cg0Var2, IOException iOException) {
        int i;
        Object[] array;
        TimeZone timeZone = wg3.f12507a;
        try {
            m4284g(cg0Var);
        } catch (IOException unused) {
        }
        synchronized (this) {
            if (this.f9187i.isEmpty()) {
                array = null;
            } else {
                array = this.f9187i.values().toArray(new xv0[0]);
                this.f9187i.clear();
            }
        }
        xv0[] xv0VarArr = (xv0[]) array;
        if (xv0VarArr != null) {
            for (xv0 xv0Var : xv0VarArr) {
                try {
                    xv0Var.m6184c(cg0Var2, iOException);
                } catch (IOException unused2) {
                }
            }
        }
        try {
            this.f9183D.close();
        } catch (IOException unused3) {
        }
        try {
            ((Socket) ((kj1) this.f9182C.f562i).f5594i).close();
        } catch (IOException unused4) {
        }
        this.f9193o.m2238e();
        this.f9194p.m2238e();
        this.f9195q.m2238e();
    }

    /* JADX INFO: renamed from: c */
    public final xv0 m4282c(int i) {
        xv0 xv0Var;
        synchronized (this) {
            xv0Var = (xv0) this.f9187i.get(Integer.valueOf(i));
        }
        return xv0Var;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        m4281b(cg0.NO_ERROR, cg0.CANCEL, null);
    }

    /* JADX INFO: renamed from: e */
    public final xv0 m4283e(int i) {
        xv0 xv0Var;
        synchronized (this) {
            xv0Var = (xv0) this.f9187i.remove(Integer.valueOf(i));
            notifyAll();
        }
        return xv0Var;
    }

    public final void flush() {
        this.f9183D.flush();
    }

    /* JADX INFO: renamed from: g */
    public final void m4284g(cg0 cg0Var) {
        synchronized (this.f9183D) {
            synchronized (this) {
                if (this.f9191m) {
                    return;
                }
                this.f9191m = true;
                this.f9183D.m6350g(this.f9189k, cg0Var, ug3.f11300a);
            }
        }
    }

    /* JADX INFO: renamed from: h */
    public final void m4285h(long j) {
        synchronized (this) {
            try {
                sd3.m4810b(this.f9204z, j, 0L, 2);
                long jM4811a = this.f9204z.m4811a();
                if (jM4811a >= this.f9202x.m6170a() / 2) {
                    m4288o(jM4811a, 0);
                    sd3.m4810b(this.f9204z, 0L, jM4811a, 1);
                }
                bk0 bk0Var = this.f9201w;
                sd3 sd3Var = this.f9204z;
                bk0Var.getClass();
                sd3Var.getClass();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0035, code lost:
    
        r2 = java.lang.Math.min((int) java.lang.Math.min(r12, r6 - r4), r8.f9183D.f13629j);
        r6 = r2;
        r8.f9180A += r6;
     */
    /* JADX INFO: renamed from: j */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m4286j(int i, boolean z, C0209fn c0209fn, long j) {
        int iMin;
        long j2;
        if (j == 0) {
            this.f9183D.m6348c(z, i, c0209fn, 0);
            return;
        }
        while (j > 0) {
            synchronized (this) {
                while (true) {
                    try {
                        try {
                            long j3 = this.f9180A;
                            long j4 = this.f9181B;
                            if (j3 < j4) {
                                break;
                            } else {
                                if (!this.f9187i.containsKey(Integer.valueOf(i))) {
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
            this.f9183D.m6348c(z && j == 0, i, c0209fn, iMin);
        }
    }

    /* JADX INFO: renamed from: k */
    public final void m4287k(int i, cg0 cg0Var) {
        hy2.m2234b(this.f9193o, this.f9188j + '[' + i + "] writeSynReset", new vf0(this, i, cg0Var));
    }

    /* JADX INFO: renamed from: o */
    public final void m4288o(final long j, final int i) {
        hy2.m2234b(this.f9193o, this.f9188j + '[' + i + "] windowUpdate", new xm0() { // from class: kv0
            @Override // p000.xm0
            /* JADX INFO: renamed from: a */
            public final Object mo6a() {
                qv0 qv0Var = this.f5822h;
                int i2 = i;
                try {
                    qv0Var.f9183D.m6354o(j, i2);
                } catch (IOException e) {
                    cg0 cg0Var = cg0.PROTOCOL_ERROR;
                    qv0Var.m4281b(cg0Var, cg0Var, e);
                }
                return a83.f116a;
            }
        });
    }
}
