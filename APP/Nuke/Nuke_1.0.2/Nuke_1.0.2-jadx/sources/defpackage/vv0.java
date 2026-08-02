package defpackage;

import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.TimeZone;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class vv0 implements ht2 {
    public final long h;
    public boolean i;
    public final fn j = new fn();
    public final fn k = new fn();
    public boolean l;
    public final /* synthetic */ xv0 m;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public vv0(xv0 xv0Var, long j, boolean z) {
        this.m = xv0Var;
        this.h = j;
        this.i = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.ht2
    public final o23 a() {
        return this.m.q;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        long j;
        xv0 xv0Var = this.m;
        synchronized (xv0Var) {
            this.l = true;
            fn fnVar = this.k;
            j = fnVar.i;
            fnVar.g();
            xv0Var.notifyAll();
        }
        if (j > 0) {
            xv0 xv0Var2 = this.m;
            TimeZone timeZone = wg3.a;
            xv0Var2.i.h(j);
        }
        this.m.a();
    }

    /* JADX DEBUG: Another duplicated slice has different insns count: {[GOTO]}, finally: {[GOTO, IGET, INVOKE, IF] complete} */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00bc A[Catch: all -> 0x0025, DONT_GENERATE, TRY_ENTER, TRY_LEAVE, TryCatch #1 {, blocks: (B:5:0x0008, B:7:0x0015, B:13:0x001f, B:47:0x00bc, B:61:0x00e2, B:62:0x00e7, B:17:0x0028, B:19:0x002e, B:21:0x0032, B:23:0x0036, B:27:0x0047, B:29:0x004b, B:31:0x0055, B:33:0x0072, B:35:0x0083, B:38:0x009a, B:41:0x00a4, B:43:0x00aa, B:44:0x00b6, B:58:0x00d8, B:59:0x00df), top: B:66:0x0008, inners: #0 }] */
    @Override // defpackage.ht2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final long n(fn fnVar, long j) throws Throwable {
        boolean z;
        Throwable av2Var;
        long j2;
        long jN;
        fnVar.getClass();
        do {
            xv0 xv0Var = this.m;
            synchronized (xv0Var) {
                xv0Var.i.getClass();
                uv0 uv0Var = xv0Var.p;
                z = true;
                boolean z2 = uv0Var.j || uv0Var.h;
                if (z2) {
                    xv0Var.q.h();
                }
                try {
                    if (xv0Var.f() == null || this.i) {
                        av2Var = null;
                    } else {
                        av2Var = xv0Var.t;
                        if (av2Var == null) {
                            cg0 cg0VarF = xv0Var.f();
                            cg0VarF.getClass();
                            av2Var = new av2(cg0VarF);
                        }
                    }
                    if (this.l) {
                        throw new IOException("stream closed");
                    }
                    fn fnVar2 = this.k;
                    long j3 = fnVar2.i;
                    if (j3 > 0) {
                        jN = fnVar2.n(fnVar, Math.min(8192L, j3));
                        sd3.b(xv0Var.j, jN, 0L, 2);
                        long jA = xv0Var.j.a();
                        if (av2Var == null) {
                            j2 = -1;
                            if (jA >= xv0Var.i.x.a() / 2) {
                                xv0Var.i.o(jA, xv0Var.h);
                                sd3.b(xv0Var.j, 0L, jA, 1);
                            }
                        } else {
                            j2 = -1;
                        }
                    } else {
                        j2 = -1;
                        if (this.i || av2Var != null) {
                            jN = -1;
                        } else {
                            try {
                                xv0Var.wait();
                                jN = -1;
                            } catch (InterruptedException unused) {
                                Thread.currentThread().interrupt();
                                throw new InterruptedIOException();
                            }
                        }
                    }
                    z = false;
                } finally {
                    if (z2) {
                        xv0Var.q.l();
                    }
                }
            }
            this.m.i.w.getClass();
        } while (z);
        if (jN != j2) {
            return jN;
        }
        if (av2Var == null) {
            return j2;
        }
        throw av2Var;
    }
}
