package defpackage;

import java.io.InterruptedIOException;
import java.util.TimeZone;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class uv0 implements fr2 {
    public final boolean h;
    public final fn i = new fn();
    public boolean j;
    public final /* synthetic */ xv0 k;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public uv0(xv0 xv0Var, boolean z) {
        this.k = xv0Var;
        this.h = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.fr2
    public final o23 a() {
        return this.k.r;
    }

    /* JADX DEBUG: Another duplicated slice has different insns count: {[]}, finally: {[IGET, INVOKE, IGET, INVOKE] complete} */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Incorrect finally slice size: {[IGET, INVOKE, IGET, INVOKE, INVOKE, IGET, IGET, ARITH, IGET, IGET, INVOKE, IGET, ARITH, IPUT] complete}, expected: {[IGET, INVOKE, IGET, INVOKE] complete} */
    /* JADX WARN: Finally extract failed */
    public final void b(boolean z) {
        long jMin;
        boolean z2;
        xv0 xv0Var = this.k;
        synchronized (xv0Var) {
            xv0Var.r.h();
            while (xv0Var.k >= xv0Var.l && !this.h && !this.j && xv0Var.f() == null) {
                try {
                    try {
                        xv0Var.wait();
                    } catch (InterruptedException unused) {
                        Thread.currentThread().interrupt();
                        throw new InterruptedIOException();
                    }
                } catch (Throwable th) {
                    xv0Var.r.l();
                    throw th;
                }
            }
            xv0Var.r.l();
            xv0Var.b();
            jMin = Math.min(xv0Var.l - xv0Var.k, this.i.i);
            xv0Var.k += jMin;
            z2 = z && jMin == this.i.i;
        }
        this.k.r.h();
        try {
            xv0 xv0Var2 = this.k;
            xv0Var2.i.j(xv0Var2.h, z2, this.i, jMin);
        } finally {
            this.k.r.l();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.fr2, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        xv0 xv0Var = this.k;
        TimeZone timeZone = wg3.a;
        synchronized (xv0Var) {
            if (this.j) {
                return;
            }
            boolean z = xv0Var.f() == null;
            xv0 xv0Var2 = this.k;
            if (!xv0Var2.p.h) {
                if (this.i.i > 0) {
                    while (this.i.i > 0) {
                        b(true);
                    }
                } else if (z) {
                    xv0Var2.i.j(xv0Var2.h, true, null, 0L);
                }
            }
            xv0 xv0Var3 = this.k;
            synchronized (xv0Var3) {
                this.j = true;
                xv0Var3.notifyAll();
            }
            this.k.i.flush();
            this.k.a();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.fr2
    public final void d(fn fnVar, long j) {
        TimeZone timeZone = wg3.a;
        fn fnVar2 = this.i;
        fnVar2.d(fnVar, j);
        while (fnVar2.i >= 16384) {
            b(false);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.fr2, java.io.Flushable
    public final void flush() {
        xv0 xv0Var = this.k;
        TimeZone timeZone = wg3.a;
        synchronized (xv0Var) {
            xv0Var.b();
        }
        while (this.i.i > 0) {
            b(false);
            this.k.i.flush();
        }
    }
}
