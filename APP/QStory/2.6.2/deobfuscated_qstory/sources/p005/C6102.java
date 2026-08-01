package p005;

import java.io.OutputStream;

/* JADX INFO: renamed from: 飘花落叶言世兰哲苏楪子.飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final class C6102 extends OutputStream {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ C6101 f16659;

    public C6102(C6101 c6101) {
        this.f16659 = c6101;
    }

    public final String toString() {
        return this.f16659 + ".outputStream()";
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr, int i, int i2) {
        bArr.getClass();
        this.f16659.write(bArr, i, i2);
    }

    @Override // java.io.OutputStream
    public final void write(int i) {
        this.f16659.m11474(i);
    }

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }

    @Override // java.io.OutputStream, java.io.Flushable
    public final void flush() {
    }
}
