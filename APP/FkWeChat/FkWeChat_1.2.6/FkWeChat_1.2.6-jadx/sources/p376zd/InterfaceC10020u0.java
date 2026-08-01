package p376zd;

import java.io.Closeable;
import java.io.Flushable;

/* JADX INFO: renamed from: zd.u0 */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
public interface InterfaceC10020u0 extends Closeable, Flushable {
    @Override // java.io.Closeable, java.lang.AutoCloseable
    void close();

    void flush();

    C10026x0 timeout();

    void write(C9995i c9995i, long j10);
}
