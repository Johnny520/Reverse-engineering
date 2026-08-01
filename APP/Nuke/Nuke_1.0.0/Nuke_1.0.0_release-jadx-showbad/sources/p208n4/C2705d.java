package p208n4;

import java.io.OutputStream;
import p117X2.AbstractC1665j;

/* JADX INFO: renamed from: n4.d */
/* JADX INFO: loaded from: classes.dex */
public final class C2705d extends OutputStream {

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ C2706e f8627d;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C2705d(C2706e c2706e) {
        this.f8627d = c2706e;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return this.f8627d + ".outputStream()";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.io.OutputStream
    public final void write(int i5) {
        this.f8627d.m4705G(i5);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    @Override // java.io.OutputStream
    public final void write(byte[] bArr, int i5, int i6) {
        AbstractC1665j.m2985e(bArr, "data");
        this.f8627d.write(bArr, i5, i6);
    }

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }

    @Override // java.io.OutputStream, java.io.Flushable
    public final void flush() {
    }
}
