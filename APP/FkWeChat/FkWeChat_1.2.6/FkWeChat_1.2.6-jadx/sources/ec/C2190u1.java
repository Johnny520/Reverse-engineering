package ec;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import p010a9.InterfaceC0184l;

/* JADX INFO: renamed from: ec.u1 */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
public final class C2190u1 extends AbstractC2113b2 {

    /* JADX INFO: renamed from: v */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f6017v = AtomicIntegerFieldUpdater.newUpdater(C2190u1.class, "_invoked$volatile");
    private volatile /* synthetic */ int _invoked$volatile;

    /* JADX INFO: renamed from: u */
    public final InterfaceC0184l f6018u;

    public C2190u1(InterfaceC0184l interfaceC0184l) {
        this.f6018u = interfaceC0184l;
    }

    @Override // ec.AbstractC2113b2
    /* JADX INFO: renamed from: w */
    public boolean mo7632w() {
        return true;
    }

    @Override // ec.AbstractC2113b2
    /* JADX INFO: renamed from: x */
    public void mo7633x(Throwable th) {
        if (f6017v.compareAndSet(this, 0, 1)) {
            this.f6018u.mo27m(th);
        }
    }
}
