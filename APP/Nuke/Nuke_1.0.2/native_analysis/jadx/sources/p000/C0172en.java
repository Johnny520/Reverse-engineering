package p000;

import java.io.OutputStream;

/* JADX INFO: renamed from: en */
/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class C0172en extends OutputStream {

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ C0209fn f2515h;

    public C0172en(C0209fn c0209fn) {
        this.f2515h = c0209fn;
    }

    public final String toString() {
        return this.f2515h + ".outputStream()";
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr, int i, int i2) {
        bArr.getClass();
        this.f2515h.write(bArr, i, i2);
    }

    @Override // java.io.OutputStream
    public final void write(int i) {
        this.f2515h.m1670E(i);
    }

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }

    @Override // java.io.OutputStream, java.io.Flushable
    public final void flush() {
    }
}
