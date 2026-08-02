package defpackage;

import java.io.IOException;
import java.net.ProtocolException;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class vg0 extends sm0 {
    public final long i;
    public final boolean j;
    public long k;
    public boolean l;
    public boolean m;
    public boolean n;
    public final /* synthetic */ f90 o;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vg0(f90 f90Var, ht2 ht2Var, long j, boolean z) {
        super(ht2Var);
        ht2Var.getClass();
        this.o = f90Var;
        this.i = j;
        this.j = z;
        this.l = true;
        if (j == 0) {
            b(null);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final IOException b(IOException iOException) {
        if (this.m) {
            return iOException;
        }
        this.m = true;
        if (iOException == null && this.l) {
            this.l = false;
            ((s52) this.o.b).k.getClass();
        }
        return f90.b(this.o, this.j, iOException, 8);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.sm0, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        if (this.n) {
            return;
        }
        this.n = true;
        try {
            super.close();
            b(null);
        } catch (IOException e) {
            IOException iOExceptionB = b(e);
            iOExceptionB.getClass();
            throw iOExceptionB;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.ht2
    public final long n(fn fnVar, long j) throws IOException {
        fnVar.getClass();
        if (this.n) {
            s.l("closed");
            return 0L;
        }
        try {
            long jN = this.h.n(fnVar, 8192L);
            if (this.l) {
                this.l = false;
                ((s52) this.o.b).k.getClass();
            }
            if (jN == -1) {
                b(null);
                return -1L;
            }
            long j2 = this.k + jN;
            long j3 = this.i;
            if (j3 != -1 && j2 > j3) {
                throw new ProtocolException("expected " + this.i + " bytes but received " + j2);
            }
            this.k = j2;
            if (((xg0) this.o.d).d()) {
                b(null);
            }
            return jN;
        } catch (IOException e) {
            IOException iOExceptionB = b(e);
            iOExceptionB.getClass();
            throw iOExceptionB;
        }
    }
}
