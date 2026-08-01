package p020;

import java.io.OutputStream;

/* JADX INFO: renamed from: 飘花落叶言世兰哲苏子楪.飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C6922 extends OutputStream {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ C6921 f16994;

    public C6922(C6921 c6921) {
        this.f16994 = c6921;
    }

    public final String toString() {
        return this.f16994 + ".outputStream()";
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr, int i, int i2) {
        bArr.getClass();
        this.f16994.write(bArr, i, i2);
    }

    @Override // java.io.OutputStream
    public final void write(int i) {
        this.f16994.m12029(i);
    }

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }

    @Override // java.io.OutputStream, java.io.Flushable
    public final void flush() {
    }
}
