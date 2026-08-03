package Yue;

import Yue.C7148;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: renamed from: Yue.ۥ۟۠ۥۥ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public final class C3217<T> extends AtomicBoolean implements InterfaceC4144<T> {

    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    @InterfaceC6399
    public final InterfaceC4199<T> f4949;

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: Yue.ۥ۟ۧۤۢ<? super T> */
    /* JADX WARN: Multi-variable type inference failed */
    public C3217(@InterfaceC6399 InterfaceC4199<? super T> interfaceC4199) {
        super(false);
        this.f4949 = interfaceC4199;
    }

    @Override // Yue.InterfaceC4144
    public void accept(T t) {
        if (compareAndSet(false, true)) {
            InterfaceC4199<T> interfaceC4199 = this.f4949;
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
