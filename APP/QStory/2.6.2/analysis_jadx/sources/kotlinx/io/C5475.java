package kotlinx.io;

import io.ktor.util.C4210;
import java.io.IOException;
import java.io.InputStream;
import kotlin.text.AbstractC5143;

/* JADX INFO: renamed from: kotlinx.io.飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final class C5475 implements InterfaceC5473 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final InputStream f15140;

    public C5475(InputStream inputStream) {
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

    @Override // kotlinx.io.InterfaceC5473
    /* JADX INFO: renamed from: 飘花落叶言子世楪哲苏兰 */
    public final long mo10598(C5476 c5476, long j) {
        if (j == 0) {
            return 0L;
        }
        if (j < 0) {
            C4210.m8619("byteCount (", j, ") < 0");
            return 0L;
        }
        try {
            C5478 c5478M10608 = c5476.m10608(1);
            long j2 = this.f15140.read(c5478M10608.f15150, c5478M10608.f15148, (int) Math.min(j, r4.length - r5));
            int i = j2 == -1 ? 0 : (int) j2;
            if (i == 1) {
                c5478M10608.f15148 += i;
                c5476.f15142 += (long) i;
                return j2;
            }
            if (i < 0 || i > c5478M10608.m10634()) {
                throw new IllegalStateException(("Invalid number of bytes written: " + i + ". Should be in 0.." + c5478M10608.m10634()).toString());
            }
            if (i != 0) {
                c5478M10608.f15148 += i;
                c5476.f15142 += (long) i;
                return j2;
            }
            if (AbstractC5477.m10624(c5478M10608)) {
                c5476.m10605();
            }
            return j2;
        } catch (AssertionError e) {
            if (e.getCause() != null) {
                String message = e.getMessage();
                if (message != null ? AbstractC5143.m10171(message, "getsockname failed", false) : false) {
                    throw new IOException(e);
                }
            }
            throw e;
        }
    }
}
