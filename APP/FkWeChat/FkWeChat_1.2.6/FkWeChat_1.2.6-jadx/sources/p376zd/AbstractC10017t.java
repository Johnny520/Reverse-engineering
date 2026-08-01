package p376zd;

import p172l8.InterfaceC4691e;

/* JADX INFO: renamed from: zd.t */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC10017t implements InterfaceC10024w0 {
    private final InterfaceC10024w0 delegate;

    public AbstractC10017t(InterfaceC10024w0 interfaceC10024w0) {
        interfaceC10024w0.getClass();
        this.delegate = interfaceC10024w0;
    }

    @InterfaceC4691e
    /* JADX INFO: renamed from: -deprecated_delegate, reason: not valid java name */
    public final InterfaceC10024w0 m39026deprecated_delegate() {
        return this.delegate;
    }

    @Override // p376zd.InterfaceC10024w0, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.delegate.close();
    }

    public final InterfaceC10024w0 delegate() {
        return this.delegate;
    }

    @Override // p376zd.InterfaceC10024w0
    public long read(C9995i c9995i, long j10) {
        c9995i.getClass();
        return this.delegate.read(c9995i, j10);
    }

    @Override // p376zd.InterfaceC10024w0
    public C10026x0 timeout() {
        return this.delegate.timeout();
    }

    public String toString() {
        return getClass().getSimpleName() + '(' + this.delegate + ')';
    }
}
