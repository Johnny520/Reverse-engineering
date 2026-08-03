package Yue;

import java.io.EOFException;
import java.io.IOException;
import net.bytebuddy.implementation.MethodDelegation;

/* JADX INFO: renamed from: Yue.ۥ۠ۡۧ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public class C4794 extends AbstractC5067 {

    /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
    @InterfaceC6399
    public final InterfaceC5124<IOException, C8107> f10724;

    /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
    public boolean f10725;

    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: Yue.ۥۣ۠ۡ۟<? super java.io.IOException, Yue.ۥۣۢ۠ۤ> */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C4794(@InterfaceC6399 InterfaceC7472 interfaceC7472, @InterfaceC6399 InterfaceC5124<? super IOException, C8107> interfaceC5124) {
        super(interfaceC7472);
        C5499.m17103(interfaceC7472, MethodDelegation.ImplementationDelegate.FIELD_NAME_PREFIX);
        C5499.m17103(interfaceC5124, "onException");
        this.f10724 = interfaceC5124;
    }

    @Override // Yue.AbstractC5067, Yue.InterfaceC7472, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        if (this.f10725) {
            return;
        }
        try {
            super.close();
        } catch (IOException e) {
            this.f10725 = true;
            this.f10724.invoke(e);
        }
    }

    @Override // Yue.AbstractC5067, Yue.InterfaceC7472, java.io.Flushable
    public void flush() {
        if (this.f10725) {
            return;
        }
        try {
            super.flush();
        } catch (IOException e) {
            this.f10725 = true;
            this.f10724.invoke(e);
        }
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public final InterfaceC5124<IOException, C8107> m14476() {
        return this.f10724;
    }

    @Override // Yue.AbstractC5067, Yue.InterfaceC7472
    /* JADX INFO: renamed from: ۥ۟۟۟ۦ */
    public void mo9102(@InterfaceC6399 C3600 c3600, long j) throws EOFException {
        C5499.m17103(c3600, "source");
        if (this.f10725) {
            c3600.skip(j);
            return;
        }
        try {
            super.mo9102(c3600, j);
        } catch (IOException e) {
            this.f10725 = true;
            this.f10724.invoke(e);
        }
    }
}
