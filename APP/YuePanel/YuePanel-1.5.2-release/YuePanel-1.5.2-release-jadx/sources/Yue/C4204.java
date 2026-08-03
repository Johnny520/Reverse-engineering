package Yue;

import Yue.C7148;
import android.p000os.OutcomeReceiver;
import java.lang.Throwable;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: renamed from: Yue.ۥ۟ۧۤۧ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC7113(31)
public final class C4204<R, E extends Throwable> extends AtomicBoolean implements OutcomeReceiver {

    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    @InterfaceC6399
    public final InterfaceC4199<R> f8523;

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: Yue.ۥ۟ۧۤۢ<? super R> */
    /* JADX WARN: Multi-variable type inference failed */
    public C4204(@InterfaceC6399 InterfaceC4199<? super R> interfaceC4199) {
        super(false);
        this.f8523 = interfaceC4199;
    }

    public void onError(@InterfaceC6399 E e) {
        if (compareAndSet(false, true)) {
            InterfaceC4199<R> interfaceC4199 = this.f8523;
            C7148.C1189 c1189 = C7148.f21560;
            interfaceC4199.resumeWith(C7148.m3438(C7149.m3441(e)));
        }
    }

    public void onResult(R r) {
        if (compareAndSet(false, true)) {
            InterfaceC4199<R> interfaceC4199 = this.f8523;
            C7148.C1189 c1189 = C7148.f21560;
            interfaceC4199.resumeWith(C7148.m3438(r));
        }
    }

    @Override // java.util.concurrent.atomic.AtomicBoolean
    @InterfaceC6399
    public String toString() {
        return "ContinuationOutcomeReceiver(outcomeReceived = " + get() + ')';
    }
}
