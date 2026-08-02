package defpackage;

import java.io.IOException;
import java.net.ProtocolException;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class ug0 implements fr2 {
    public final fr2 h;
    public final long i;
    public final boolean j;
    public boolean k;
    public long l;
    public boolean m;
    public boolean n;
    public final /* synthetic */ f90 o;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public ug0(f90 f90Var, fr2 fr2Var, long j, boolean z) {
        fr2Var.getClass();
        this.o = f90Var;
        this.h = fr2Var;
        this.i = j;
        this.j = z;
        this.m = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.fr2
    public final o23 a() {
        return this.h.a();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void b() {
        this.h.close();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final IOException c(IOException iOException) {
        if (this.k) {
            return iOException;
        }
        this.k = true;
        return f90.b(this.o, this.j, iOException, 4);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.fr2, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        if (this.n) {
            return;
        }
        this.n = true;
        long j = this.i;
        if (j != -1 && this.l != j) {
            throw new ProtocolException("unexpected end of stream");
        }
        try {
            b();
            c(null);
        } catch (IOException e) {
            IOException iOExceptionC = c(e);
            iOExceptionC.getClass();
            throw iOExceptionC;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.fr2
    public final void d(fn fnVar, long j) throws IOException {
        if (this.n) {
            s.l("closed");
            return;
        }
        long j2 = this.i;
        if (j2 != -1 && this.l + j > j2) {
            throw new ProtocolException("expected " + this.i + " bytes but received " + (this.l + j));
        }
        try {
            if (this.m) {
                this.m = false;
                ((s52) this.o.b).k.getClass();
            }
            this.h.d(fnVar, j);
            this.l += j;
        } catch (IOException e) {
            IOException iOExceptionC = c(e);
            iOExceptionC.getClass();
            throw iOExceptionC;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void e() {
        this.h.flush();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.fr2, java.io.Flushable
    public final void flush() throws IOException {
        try {
            e();
        } catch (IOException e) {
            IOException iOExceptionC = c(e);
            iOExceptionC.getClass();
            throw iOExceptionC;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return ug0.class.getSimpleName() + '(' + this.h + ')';
    }
}
