package Yue;

import java.io.IOException;
import net.bytebuddy.implementation.MethodDelegation;

/* JADX INFO: renamed from: Yue.ۥ۠ۢۧ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC5067 implements InterfaceC7472 {

    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    @InterfaceC6399
    public final InterfaceC7472 f12023;

    public AbstractC5067(@InterfaceC6399 InterfaceC7472 interfaceC7472) {
        C5499.m17103(interfaceC7472, MethodDelegation.ImplementationDelegate.FIELD_NAME_PREFIX);
        this.f12023 = interfaceC7472;
    }

    @Override // Yue.InterfaceC7472, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.f12023.close();
    }

    @Override // Yue.InterfaceC7472, java.io.Flushable
    public void flush() throws IOException {
        this.f12023.flush();
    }

    @InterfaceC6399
    public String toString() {
        return getClass().getSimpleName() + '(' + this.f12023 + ')';
    }

    @Override // Yue.InterfaceC7472
    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ */
    public C7827 mo516() {
        return this.f12023.mo516();
    }

    @InterfaceC6399
    @InterfaceC4372(level = EnumC0393.f8971, message = "moved to val", replaceWith = @InterfaceC7097(expression = MethodDelegation.ImplementationDelegate.FIELD_NAME_PREFIX, imports = {}))
    @InterfaceC5572(name = "-deprecated_delegate")
    /* JADX INFO: renamed from: ۥ۟ */
    public final InterfaceC7472 m1891() {
        return this.f12023;
    }

    @InterfaceC6399
    @InterfaceC5572(name = MethodDelegation.ImplementationDelegate.FIELD_NAME_PREFIX)
    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public final InterfaceC7472 m15615() {
        return this.f12023;
    }

    @Override // Yue.InterfaceC7472
    /* JADX INFO: renamed from: ۥ۟۟۟ۦ */
    public void mo9102(@InterfaceC6399 C3600 c3600, long j) throws IOException {
        C5499.m17103(c3600, "source");
        this.f12023.mo9102(c3600, j);
    }
}
