package Yue;

import java.io.EOFException;

/* JADX INFO: renamed from: Yue.ۥ۟ۢۧۥ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public final class C3539 implements InterfaceC7472 {
    @Override // Yue.InterfaceC7472, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
    }

    @Override // Yue.InterfaceC7472, java.io.Flushable
    public void flush() {
    }

    @Override // Yue.InterfaceC7472
    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ */
    public C7827 mo516() {
        return C7827.f23434;
    }

    @Override // Yue.InterfaceC7472
    /* JADX INFO: renamed from: ۥ۟۟۟ۦ */
    public void mo9102(@InterfaceC6399 C3600 c3600, long j) throws EOFException {
        C5499.m17103(c3600, "source");
        c3600.skip(j);
    }
}
