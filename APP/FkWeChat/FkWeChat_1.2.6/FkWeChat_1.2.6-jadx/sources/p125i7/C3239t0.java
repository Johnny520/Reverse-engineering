package p125i7;

import java.util.concurrent.atomic.AtomicBoolean;
import p010a9.InterfaceC0173a;

/* JADX INFO: renamed from: i7.t0 */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class C3239t0 extends Thread {

    /* JADX INFO: renamed from: q */
    public final InterfaceC0173a f8737q;

    /* JADX INFO: renamed from: r */
    public final AtomicBoolean f8738r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3239t0(InterfaceC0173a interfaceC0173a) {
        super("KtorShutdownHook");
        interfaceC0173a.getClass();
        this.f8737q = interfaceC0173a;
        this.f8738r = new AtomicBoolean(true);
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public void run() {
        if (this.f8738r.compareAndSet(true, false)) {
            this.f8737q.invoke();
        }
    }
}
