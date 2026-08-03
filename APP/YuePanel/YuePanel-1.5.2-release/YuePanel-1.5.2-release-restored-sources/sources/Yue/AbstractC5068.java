package Yue;

import java.io.IOException;
import net.bytebuddy.implementation.MethodDelegation;

/* JADX INFO: renamed from: Yue.ۥ۠ۢۧ۟, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC5068 implements InterfaceC7506 {

    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    @InterfaceC6399
    public final InterfaceC7506 f12024;

    public AbstractC5068(@InterfaceC6399 InterfaceC7506 interfaceC7506) {
        C5499.m17103(interfaceC7506, MethodDelegation.ImplementationDelegate.FIELD_NAME_PREFIX);
        this.f12024 = interfaceC7506;
    }

    @Override // Yue.InterfaceC7506, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.f12024.close();
    }

    @InterfaceC6399
    public String toString() {
        return getClass().getSimpleName() + '(' + this.f12024 + ')';
    }

    @Override // Yue.InterfaceC7506
    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ */
    public C7827 mo518() {
        return this.f12024.mo518();
    }

    @InterfaceC6399
    @InterfaceC4372(level = EnumC0393.f8971, message = "moved to val", replaceWith = @InterfaceC7097(expression = MethodDelegation.ImplementationDelegate.FIELD_NAME_PREFIX, imports = {}))
    @InterfaceC5572(name = "-deprecated_delegate")
    /* JADX INFO: renamed from: ۥ۟ */
    public final InterfaceC7506 m1892() {
        return this.f12024;
    }

    @InterfaceC6399
    @InterfaceC5572(name = MethodDelegation.ImplementationDelegate.FIELD_NAME_PREFIX)
    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public final InterfaceC7506 m15616() {
        return this.f12024;
    }

    @Override // Yue.InterfaceC7506
    /* JADX INFO: renamed from: ۥ۟۟ۢۢ */
    public long mo9103(@InterfaceC6399 C3600 c3600, long j) throws IOException {
        C5499.m17103(c3600, "sink");
        return this.f12024.mo9103(c3600, j);
    }
}
