package defpackage;

import java.io.IOException;
import java.net.ProtocolException;
import java.util.TimeZone;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class ev0 extends cv0 {
    public long l;
    public boolean m;
    public final /* synthetic */ iv0 n;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ev0(iv0 iv0Var, yw0 yw0Var) {
        super(iv0Var, yw0Var);
        yw0Var.getClass();
        this.n = iv0Var;
        this.l = -1L;
        this.m = true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        boolean zF;
        if (this.j) {
            return;
        }
        if (this.m) {
            TimeZone timeZone = wg3.a;
            TimeUnit.MILLISECONDS.getClass();
            try {
                zF = wg3.f(this, 100);
            } catch (IOException unused) {
                zF = false;
            }
            if (!zF) {
                this.n.b.h();
                b(iv0.f);
            }
        }
        this.j = true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00bf, code lost:
    
        if (r16.m == false) goto L46;
     */
    @Override // defpackage.cv0, defpackage.ht2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final long n(fn fnVar, long j) throws IOException {
        byte bO;
        iv0 iv0Var = this.n;
        b5 b5Var = iv0Var.c;
        fnVar.getClass();
        if (this.j) {
            s.l("closed");
            return 0L;
        }
        if (this.m) {
            long j2 = this.l;
            if (j2 == 0 || j2 == -1) {
                if (j2 != -1) {
                    ((o52) b5Var.j).s(Long.MAX_VALUE);
                }
                try {
                    o52 o52Var = (o52) b5Var.j;
                    fn fnVar2 = o52Var.i;
                    o52Var.x(1L);
                    int i = 0;
                    while (true) {
                        int i2 = i + 1;
                        if (!o52Var.g(i2)) {
                            break;
                        }
                        bO = fnVar2.o(i);
                        if ((bO < 48 || bO > 57) && ((bO < 97 || bO > 102) && (bO < 65 || bO > 70))) {
                            break;
                        }
                        i = i2;
                    }
                    if (i == 0) {
                        xe1.j(16);
                        String string = Integer.toString(bO, 16);
                        string.getClass();
                        throw new NumberFormatException("Expected leading [0-9a-fA-F] character but was 0x".concat(string));
                    }
                    this.l = fnVar2.r();
                    String string2 = pv2.I0(((o52) b5Var.j).s(Long.MAX_VALUE)).toString();
                    if (this.l < 0 || (string2.length() > 0 && !wv2.d0(string2, ";", false))) {
                        throw new ProtocolException("expected chunk size and optional extensions but was \"" + this.l + string2 + '\"');
                    }
                    if (this.l == 0) {
                        this.m = false;
                        b(iv0Var.e.c());
                    }
                } catch (NumberFormatException e) {
                    throw new ProtocolException(e.getMessage());
                }
            }
            long jN = super.n(fnVar, Math.min(8192L, this.l));
            if (jN != -1) {
                this.l -= jN;
                return jN;
            }
            iv0Var.b.h();
            ProtocolException protocolException = new ProtocolException("unexpected end of stream");
            b(iv0.f);
            throw protocolException;
        }
        return -1L;
    }
}
