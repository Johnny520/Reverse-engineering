package kotlinx.io;

import io.ktor.util.C4211;
import java.io.IOException;
import java.io.InputStream;
import kotlin.text.AbstractC5144;

/* JADX INFO: renamed from: kotlinx.io.飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C5476 implements InterfaceC5474 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final InputStream f15140;

    public C5476(InputStream inputStream) {
        inputStream.getClass();
        this.f15140 = inputStream;
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        this.f15140.close();
    }

    public final String toString() {
        return "RawSource(" + this.f15140 + ')';
    }

    @Override // kotlinx.io.InterfaceC5474
    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲苏世 */
    public final long mo10605(C5477 c5477, long j) {
        if (j == 0) {
            return 0L;
        }
        if (j < 0) {
            C4211.m8609("byteCount (", j, ") < 0");
            return 0L;
        }
        try {
            C5479 c5479M10612 = c5477.m10612(1);
            long j2 = this.f15140.read(c5479M10612.f15150, c5479M10612.f15148, (int) Math.min(j, r4.length - r5));
            int i = j2 == -1 ? 0 : (int) j2;
            if (i == 1) {
                c5479M10612.f15148 += i;
                c5477.f15142 += (long) i;
                return j2;
            }
            if (i < 0 || i > c5479M10612.m10638()) {
                throw new IllegalStateException(("Invalid number of bytes written: " + i + ". Should be in 0.." + c5479M10612.m10638()).toString());
            }
            if (i != 0) {
                c5479M10612.f15148 += i;
                c5477.f15142 += (long) i;
                return j2;
            }
            if (AbstractC5478.m10628(c5479M10612)) {
                c5477.m10609();
            }
            return j2;
        } catch (AssertionError e) {
            if (e.getCause() != null) {
                String message = e.getMessage();
                if (message != null ? AbstractC5144.m10176(message, "getsockname failed", false) : false) {
                    throw new IOException(e);
                }
            }
            throw e;
        }
    }
}
