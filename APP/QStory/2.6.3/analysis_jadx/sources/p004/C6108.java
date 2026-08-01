package p004;

import java.io.IOException;
import java.io.InputStream;
import okio.internal.AbstractC5567;

/* JADX INFO: renamed from: 飘花落叶言世兰哲苏子楪.飘花落叶言子楪哲苏世兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C6108 implements InterfaceC6101 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final C6090 f16689;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final InputStream f16690;

    public C6108(InputStream inputStream, C6090 c6090) {
        this.f16690 = inputStream;
        this.f16689 = c6090;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.f16690.close();
    }

    public final String toString() {
        return "source(" + this.f16690 + ')';
    }

    @Override // p004.InterfaceC6101
    /* JADX INFO: renamed from: 飘花落叶言子世楪兰苏哲 */
    public final long mo10932(C6092 c6092, long j) throws IOException {
        c6092.getClass();
        try {
            this.f16689.mo11449();
            C6098 c6098M11464 = c6092.m11464(1);
            int i = this.f16690.read(c6098M11464.f16669, c6098M11464.f16667, (int) Math.min(8192L, 8192 - c6098M11464.f16667));
            if (i != -1) {
                c6098M11464.f16667 += i;
                long j2 = i;
                c6092.f16647 += j2;
                return j2;
            }
            if (c6098M11464.f16668 != c6098M11464.f16667) {
                return -1L;
            }
            c6092.f16648 = c6098M11464.m11500();
            AbstractC6102.m11505(c6098M11464);
            return -1L;
        } catch (AssertionError e) {
            if (AbstractC5567.m10929(e)) {
                throw new IOException(e);
            }
            throw e;
        }
    }

    @Override // p004.InterfaceC6101
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏 */
    public final C6090 mo10933() {
        return this.f16689;
    }
}
