package p020;

import java.io.IOException;
import java.io.InputStream;
import okio.internal.AbstractC6397;

/* JADX INFO: renamed from: 飘花落叶言世兰哲苏子楪.飘花落叶言子楪哲苏世兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C6937 implements InterfaceC6930 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final C6919 f17034;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final InputStream f17035;

    public C6937(InputStream inputStream, C6919 c6919) {
        this.f17035 = inputStream;
        this.f17034 = c6919;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.f17035.close();
    }

    public final String toString() {
        return "source(" + this.f17035 + ')';
    }

    @Override // p020.InterfaceC6930
    /* JADX INFO: renamed from: 飘花落叶言子世楪兰苏哲 */
    public final long mo11491(C6921 c6921, long j) throws IOException {
        c6921.getClass();
        try {
            this.f17034.mo12008();
            C6927 c6927M12023 = c6921.m12023(1);
            int i = this.f17035.read(c6927M12023.f17014, c6927M12023.f17012, (int) Math.min(8192L, 8192 - c6927M12023.f17012));
            if (i != -1) {
                c6927M12023.f17012 += i;
                long j2 = i;
                c6921.f16992 += j2;
                return j2;
            }
            if (c6927M12023.f17013 != c6927M12023.f17012) {
                return -1L;
            }
            c6921.f16993 = c6927M12023.m12059();
            AbstractC6931.m12064(c6927M12023);
            return -1L;
        } catch (AssertionError e) {
            if (AbstractC6397.m11488(e)) {
                throw new IOException(e);
            }
            throw e;
        }
    }

    @Override // p020.InterfaceC6930
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏 */
    public final C6919 mo11492() {
        return this.f17034;
    }
}
