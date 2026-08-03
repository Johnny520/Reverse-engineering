package Yue;

import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* JADX INFO: renamed from: Yue.ۥۣ۟ۨۨ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public final class C3675 extends C4050 {

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f6499 = AtomicIntegerFieldUpdater.newUpdater(C3675.class, "_resumed");

    @InterfaceC6399
    private volatile /* synthetic */ int _resumed;

    public C3675(@InterfaceC6399 InterfaceC4199<?> interfaceC4199, @InterfaceC6489 Throwable th, boolean z) {
        if (th == null) {
            th = new CancellationException("Continuation " + interfaceC4199 + " was cancelled normally");
        }
        super(th, z);
        this._resumed = 0;
    }

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public final boolean m10069() {
        return f6499.compareAndSet(this, 0, 1);
    }
}
