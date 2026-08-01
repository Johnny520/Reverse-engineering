package p215oc;

import java.io.IOException;
import java.io.InputStream;
import tc.C8218d;

/* JADX INFO: renamed from: oc.i */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
public class C5714i implements InterfaceC5718m {

    /* JADX INFO: renamed from: q */
    public final InputStream f18038q;

    public C5714i(InputStream inputStream) {
        inputStream.getClass();
        this.f18038q = inputStream;
    }

    @Override // p215oc.InterfaceC5718m
    /* JADX INFO: renamed from: N */
    public long mo23100N(C5708d c5708d, long j10) throws IOException {
        c5708d.getClass();
        if (j10 == 0) {
            return 0L;
        }
        if (j10 < 0) {
            C5702a.m23079a("byteCount (", j10, ") < 0");
            return 0L;
        }
        try {
            C8218d c8218d = C8218d.f27528a;
            C5721p c5721pM23097G = c5708d.m23097G(1);
            int i10 = 0;
            byte[] bArrM23142b = c5721pM23097G.m23142b(false);
            long j11 = this.f18038q.read(bArrM23142b, c5721pM23097G.m23144d(), (int) Math.min(j10, bArrM23142b.length - r5));
            if (j11 != -1) {
                i10 = (int) j11;
            }
            if (i10 == 1) {
                c5721pM23097G.m23137A(bArrM23142b, i10);
                c5721pM23097G.m23156p(c5721pM23097G.m23144d() + i10);
                c5708d.m23121t(c5708d.m23112k() + ((long) i10));
                return j11;
            }
            if (i10 < 0 || i10 > c5721pM23097G.m23148h()) {
                throw new IllegalStateException(("Invalid number of bytes written: " + i10 + ". Should be in 0.." + c5721pM23097G.m23148h()).toString());
            }
            if (i10 == 0) {
                if (AbstractC5723r.m23170b(c5721pM23097G)) {
                    c5708d.m23115n();
                }
                return j11;
            }
            c5721pM23097G.m23137A(bArrM23142b, i10);
            c5721pM23097G.m23156p(c5721pM23097G.m23144d() + i10);
            c5708d.m23121t(c5708d.m23112k() + ((long) i10));
            return j11;
        } catch (AssertionError e10) {
            if (AbstractC5715j.m23133b(e10)) {
                throw new IOException(e10);
            }
            throw e10;
        }
    }

    @Override // p215oc.InterfaceC5718m, java.lang.AutoCloseable, p215oc.InterfaceC5717l
    public void close() throws IOException {
        this.f18038q.close();
    }

    public String toString() {
        return "RawSource(" + this.f18038q + ')';
    }
}
