package p000;

import java.io.IOException;
import java.net.ProtocolException;
import java.util.TimeZone;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class ev0 extends cv0 {

    /* JADX INFO: renamed from: l */
    public long f2651l;

    /* JADX INFO: renamed from: m */
    public boolean f2652m;

    /* JADX INFO: renamed from: n */
    public final /* synthetic */ iv0 f2653n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ev0(iv0 iv0Var, yw0 yw0Var) {
        super(iv0Var, yw0Var);
        yw0Var.getClass();
        this.f2653n = iv0Var;
        this.f2651l = -1L;
        this.f2652m = true;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        boolean zM5893f;
        if (this.f1744j) {
            return;
        }
        if (this.f2652m) {
            TimeZone timeZone = wg3.f12507a;
            TimeUnit.MILLISECONDS.getClass();
            try {
                zM5893f = wg3.m5893f(this, 100);
            } catch (IOException unused) {
                zM5893f = false;
            }
            if (!zM5893f) {
                this.f2653n.f4800b.mo4628h();
                m890b(iv0.f4798f);
            }
        }
        this.f1744j = true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:45:0x00bf, code lost:
    
        if (r16.f2652m == false) goto L46;
     */
    @Override // p000.cv0, p000.ht2
    /* JADX INFO: renamed from: n */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final long mo891n(C0209fn c0209fn, long j) throws IOException {
        byte bM1686o;
        iv0 iv0Var = this.f2653n;
        C0043b5 c0043b5 = iv0Var.f4801c;
        c0209fn.getClass();
        if (this.f1744j) {
            C0676s.m4653l("closed");
            return 0L;
        }
        if (this.f2652m) {
            long j2 = this.f2651l;
            if (j2 == 0 || j2 == -1) {
                if (j2 != -1) {
                    ((o52) c0043b5.f563j).mo1690s(Long.MAX_VALUE);
                }
                try {
                    o52 o52Var = (o52) c0043b5.f563j;
                    C0209fn c0209fn2 = o52Var.f7530i;
                    o52Var.mo1695x(1L);
                    int i = 0;
                    while (true) {
                        int i2 = i + 1;
                        if (!o52Var.m3512g(i2)) {
                            break;
                        }
                        bM1686o = c0209fn2.m1686o(i);
                        if ((bM1686o < 48 || bM1686o > 57) && ((bM1686o < 97 || bM1686o > 102) && (bM1686o < 65 || bM1686o > 70))) {
                            break;
                        }
                        i = i2;
                    }
                    if (i == 0) {
                        xe1.m6127j(16);
                        String string = Integer.toString(bM1686o, 16);
                        string.getClass();
                        throw new NumberFormatException("Expected leading [0-9a-fA-F] character but was 0x".concat(string));
                    }
                    this.f2651l = c0209fn2.m1689r();
                    String string2 = pv2.m3993I0(((o52) c0043b5.f563j).mo1690s(Long.MAX_VALUE)).toString();
                    if (this.f2651l < 0 || (string2.length() > 0 && !wv2.m6012d0(string2, ";", false))) {
                        throw new ProtocolException("expected chunk size and optional extensions but was \"" + this.f2651l + string2 + '\"');
                    }
                    if (this.f2651l == 0) {
                        this.f2652m = false;
                        m890b(iv0Var.f4803e.m3190c());
                    }
                } catch (NumberFormatException e) {
                    throw new ProtocolException(e.getMessage());
                }
            }
            long jMo891n = super.mo891n(c0209fn, Math.min(8192L, this.f2651l));
            if (jMo891n != -1) {
                this.f2651l -= jMo891n;
                return jMo891n;
            }
            iv0Var.f4800b.mo4628h();
            ProtocolException protocolException = new ProtocolException("unexpected end of stream");
            m890b(iv0.f4798f);
            throw protocolException;
        }
        return -1L;
    }
}
