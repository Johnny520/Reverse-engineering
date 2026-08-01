package p376zd;

import java.io.EOFException;

/* JADX INFO: renamed from: zd.d */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
public final class C9984d implements InterfaceC10020u0 {
    @Override // p376zd.InterfaceC10020u0
    public C10026x0 timeout() {
        return C10026x0.NONE;
    }

    @Override // p376zd.InterfaceC10020u0
    public void write(C9995i c9995i, long j10) throws EOFException {
        c9995i.getClass();
        c9995i.skip(j10);
    }

    @Override // p376zd.InterfaceC10020u0, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
    }

    @Override // p376zd.InterfaceC10020u0, java.io.Flushable
    public void flush() {
    }
}
