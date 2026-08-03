package Yue;

import Yue.C7148;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.function.Consumer;

/* JADX INFO: renamed from: Yue.ۥۣ۟ۧۤ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC7113(24)
public final class C4200<T> extends AtomicBoolean implements Consumer<T> {

    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    @InterfaceC6399
    public final InterfaceC4199<T> f8518;

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: Yue.ۥ۟ۧۤۢ<? super T> */
    /* JADX WARN: Multi-variable type inference failed */
    public C4200(@InterfaceC6399 InterfaceC4199<? super T> interfaceC4199) {
        super(false);
        this.f8518 = interfaceC4199;
    }

    @Override // java.util.function.Consumer
    public void accept(T t) {
        if (compareAndSet(false, true)) {
            InterfaceC4199<T> interfaceC4199 = this.f8518;
            C7148.C1189 c1189 = C7148.f21560;
            interfaceC4199.resumeWith(C7148.m3438(t));
        }
    }

    @Override // java.util.concurrent.atomic.AtomicBoolean
    @InterfaceC6399
    public String toString() {
        return "ContinuationConsumer(resultAccepted = " + get() + ')';
    }
}
