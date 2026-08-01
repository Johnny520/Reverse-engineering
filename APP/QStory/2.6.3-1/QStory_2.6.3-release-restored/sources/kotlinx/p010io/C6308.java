package kotlinx.p010io;

import io.ktor.util.C5043;
import java.io.IOException;
import java.io.InputStream;
import kotlin.text.AbstractC5976;

/* JADX INFO: renamed from: kotlinx.io.飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C6308 implements InterfaceC6306 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final InputStream f15485;

    public C6308(InputStream inputStream) {
        inputStream.getClass();
        this.f15485 = inputStream;
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        this.f15485.close();
    }

    public final String toString() {
        return "RawSource(" + this.f15485 + ')';
    }

    @Override // kotlinx.p010io.InterfaceC6306
    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲苏世 */
    public final long mo11164(C6309 c6309, long j) {
        if (j == 0) {
            return 0L;
        }
        if (j < 0) {
            C5043.m9168("byteCount (", j, ") < 0");
            return 0L;
        }
        try {
            C6311 c6311M11171 = c6309.m11171(1);
            long j2 = this.f15485.read(c6311M11171.f15495, c6311M11171.f15493, (int) Math.min(j, r4.length - r5));
            int i = j2 == -1 ? 0 : (int) j2;
            if (i == 1) {
                c6311M11171.f15493 += i;
                c6309.f15487 += (long) i;
                return j2;
            }
            if (i < 0 || i > c6311M11171.m11197()) {
                throw new IllegalStateException(("Invalid number of bytes written: " + i + ". Should be in 0.." + c6311M11171.m11197()).toString());
            }
            if (i != 0) {
                c6311M11171.f15493 += i;
                c6309.f15487 += (long) i;
                return j2;
            }
            if (AbstractC6310.m11187(c6311M11171)) {
                c6309.m11168();
            }
            return j2;
        } catch (AssertionError e) {
            if (e.getCause() != null) {
                String message = e.getMessage();
                if (message != null ? AbstractC5976.m10735(message, "getsockname failed", false) : false) {
                    throw new IOException(e);
                }
            }
            throw e;
        }
    }
}
