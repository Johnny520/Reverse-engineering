package p376zd;

import java.io.Closeable;

/* JADX INFO: renamed from: zd.w0 */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
public interface InterfaceC10024w0 extends Closeable {
    @Override // java.io.Closeable, java.lang.AutoCloseable
    void close();

    long read(C9995i c9995i, long j10);

    C10026x0 timeout();
}
