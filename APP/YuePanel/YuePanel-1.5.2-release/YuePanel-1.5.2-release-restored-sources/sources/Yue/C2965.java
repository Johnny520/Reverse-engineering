package Yue;

import java.util.concurrent.CancellationException;

/* JADX INFO: renamed from: Yue.ۥ۟۟۠ۡ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public final class C2965 extends CancellationException {

    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    @InterfaceC6399
    @InterfaceC5568
    public final transient InterfaceC4892<?> f4280;

    public C2965(@InterfaceC6399 InterfaceC4892<?> interfaceC4892) {
        super("Flow was aborted, no more elements needed");
        this.f4280 = interfaceC4892;
    }

    @Override // java.lang.Throwable
    @InterfaceC6399
    public Throwable fillInStackTrace() {
        setStackTrace(new StackTraceElement[0]);
        return this;
    }
}
