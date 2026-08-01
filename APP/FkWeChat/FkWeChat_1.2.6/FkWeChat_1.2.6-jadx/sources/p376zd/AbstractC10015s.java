package p376zd;

import p172l8.InterfaceC4691e;

/* JADX INFO: renamed from: zd.s */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC10015s implements InterfaceC10020u0 {
    private final InterfaceC10020u0 delegate;

    public AbstractC10015s(InterfaceC10020u0 interfaceC10020u0) {
        interfaceC10020u0.getClass();
        this.delegate = interfaceC10020u0;
    }

    @InterfaceC4691e
    /* JADX INFO: renamed from: -deprecated_delegate, reason: not valid java name */
    public final InterfaceC10020u0 m39025deprecated_delegate() {
        return this.delegate;
    }

    @Override // p376zd.InterfaceC10020u0, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.delegate.close();
    }

    public final InterfaceC10020u0 delegate() {
        return this.delegate;
    }

    @Override // p376zd.InterfaceC10020u0, java.io.Flushable
    public void flush() {
        this.delegate.flush();
    }

    @Override // p376zd.InterfaceC10020u0
    public C10026x0 timeout() {
        return this.delegate.timeout();
    }

    public String toString() {
        return getClass().getSimpleName() + '(' + this.delegate + ')';
    }

    @Override // p376zd.InterfaceC10020u0
    public void write(C9995i c9995i, long j10) {
        c9995i.getClass();
        this.delegate.write(c9995i, j10);
    }
}
