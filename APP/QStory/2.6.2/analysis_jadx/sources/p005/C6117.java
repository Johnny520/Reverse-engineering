package p005;

import java.io.IOException;
import java.io.InputStream;
import okio.internal.AbstractC5566;

/* JADX INFO: renamed from: 飘花落叶言世兰哲苏楪子.飘花落叶言子楪哲苏世兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final class C6117 implements InterfaceC6110 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final C6099 f16699;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final InputStream f16700;

    public C6117(InputStream inputStream, C6099 c6099) {
        this.f16700 = inputStream;
        this.f16699 = c6099;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.f16700.close();
    }

    public final String toString() {
        return "source(" + this.f16700 + ')';
    }

    @Override // p005.InterfaceC6110
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏 */
    public final C6099 mo10875() {
        return this.f16699;
    }

    @Override // p005.InterfaceC6110
    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世 */
    public final long mo10876(C6101 c6101, long j) throws IOException {
        c6101.getClass();
        try {
            this.f16699.mo11456();
            C6107 c6107M11469 = c6101.m11469(1);
            int i = this.f16700.read(c6107M11469.f16679, c6107M11469.f16677, (int) Math.min(8192L, 8192 - c6107M11469.f16677));
            if (i != -1) {
                c6107M11469.f16677 += i;
                long j2 = i;
                c6101.f16657 += j2;
                return j2;
            }
            if (c6107M11469.f16678 != c6107M11469.f16677) {
                return -1L;
            }
            c6101.f16658 = c6107M11469.m11507();
            AbstractC6111.m11512(c6107M11469);
            return -1L;
        } catch (AssertionError e) {
            if (AbstractC5566.m10872(e)) {
                throw new IOException(e);
            }
            throw e;
        }
    }
}
