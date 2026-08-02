package p000;

import java.io.IOException;
import java.net.ProtocolException;
import java.util.TimeZone;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class fv0 extends cv0 {

    /* JADX INFO: renamed from: l */
    public long f3148l;

    /* JADX INFO: renamed from: m */
    public final /* synthetic */ iv0 f3149m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fv0(iv0 iv0Var, yw0 yw0Var, long j) {
        super(iv0Var, yw0Var);
        yw0Var.getClass();
        this.f3149m = iv0Var;
        this.f3148l = j;
        if (j == 0) {
            m890b(js0.f5193i);
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        boolean zM5893f;
        if (this.f1744j) {
            return;
        }
        if (this.f3148l != 0) {
            TimeZone timeZone = wg3.f12507a;
            TimeUnit.MILLISECONDS.getClass();
            try {
                zM5893f = wg3.m5893f(this, 100);
            } catch (IOException unused) {
                zM5893f = false;
            }
            if (!zM5893f) {
                this.f3149m.f4800b.mo4628h();
                m890b(iv0.f4798f);
            }
        }
        this.f1744j = true;
    }

    @Override // p000.cv0, p000.ht2
    /* JADX INFO: renamed from: n */
    public final long mo891n(C0209fn c0209fn, long j) throws IOException {
        c0209fn.getClass();
        if (this.f1744j) {
            C0676s.m4653l("closed");
            return 0L;
        }
        long j2 = this.f3148l;
        if (j2 == 0) {
            return -1L;
        }
        long jMo891n = super.mo891n(c0209fn, Math.min(j2, 8192L));
        if (jMo891n == -1) {
            this.f3149m.f4800b.mo4628h();
            ProtocolException protocolException = new ProtocolException("unexpected end of stream");
            m890b(iv0.f4798f);
            throw protocolException;
        }
        long j3 = this.f3148l - jMo891n;
        this.f3148l = j3;
        if (j3 == 0) {
            m890b(js0.f5193i);
        }
        return jMo891n;
    }
}
