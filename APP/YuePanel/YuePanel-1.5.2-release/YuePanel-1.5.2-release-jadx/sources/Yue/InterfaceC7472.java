package Yue;

import java.io.Closeable;
import java.io.Flushable;
import java.io.IOException;

/* JADX INFO: renamed from: Yue.ۥۣۢ۟ۡ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public interface InterfaceC7472 extends Closeable, Flushable {
    @Override // java.io.Closeable, java.lang.AutoCloseable
    void close() throws IOException;

    void flush() throws IOException;

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ */
    C7827 mo516();

    /* JADX INFO: renamed from: ۥ۟۟۟ۦ */
    void mo9102(@InterfaceC6399 C3600 c3600, long j) throws IOException;
}
