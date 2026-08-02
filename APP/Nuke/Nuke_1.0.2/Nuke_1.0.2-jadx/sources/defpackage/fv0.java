package defpackage;

import java.io.IOException;
import java.net.ProtocolException;
import java.util.TimeZone;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class fv0 extends cv0 {
    public long l;
    public final /* synthetic */ iv0 m;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fv0(iv0 iv0Var, yw0 yw0Var, long j) {
        super(iv0Var, yw0Var);
        yw0Var.getClass();
        this.m = iv0Var;
        this.l = j;
        if (j == 0) {
            b(js0.i);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        boolean zF;
        if (this.j) {
            return;
        }
        if (this.l != 0) {
            TimeZone timeZone = wg3.a;
            TimeUnit.MILLISECONDS.getClass();
            try {
                zF = wg3.f(this, 100);
            } catch (IOException unused) {
                zF = false;
            }
            if (!zF) {
                this.m.b.h();
                b(iv0.f);
            }
        }
        this.j = true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.cv0, defpackage.ht2
    public final long n(fn fnVar, long j) throws IOException {
        fnVar.getClass();
        if (this.j) {
            s.l("closed");
            return 0L;
        }
        long j2 = this.l;
        if (j2 == 0) {
            return -1L;
        }
        long jN = super.n(fnVar, Math.min(j2, 8192L));
        if (jN == -1) {
            this.m.b.h();
            ProtocolException protocolException = new ProtocolException("unexpected end of stream");
            b(iv0.f);
            throw protocolException;
        }
        long j3 = this.l - jN;
        this.l = j3;
        if (j3 == 0) {
            b(js0.i);
        }
        return jN;
    }
}
