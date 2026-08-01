package ec;

import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import p228p8.InterfaceC5976f;

/* JADX INFO: renamed from: ec.r */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
public final class C2176r extends C2111b0 {

    /* JADX INFO: renamed from: c */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f6006c = AtomicIntegerFieldUpdater.newUpdater(C2176r.class, "_resumed$volatile");
    private volatile /* synthetic */ int _resumed$volatile;

    public C2176r(InterfaceC5976f interfaceC5976f, Throwable th, boolean z10) {
        if (th == null) {
            th = new CancellationException("Continuation " + interfaceC5976f + " was cancelled normally");
        }
        super(th, z10);
    }

    /* JADX INFO: renamed from: e */
    public final boolean m7894e() {
        return f6006c.compareAndSet(this, 0, 1);
    }
}
