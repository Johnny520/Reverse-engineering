package Yue;

import Yue.C7148;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: renamed from: Yue.ۥ۟ۧۤۨ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC4205 extends AtomicBoolean implements Runnable {

    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    @InterfaceC6399
    public final InterfaceC4199<C8107> f8524;

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: Yue.ۥ۟ۧۤۢ<? super Yue.ۥۣۢ۠ۤ> */
    /* JADX WARN: Multi-variable type inference failed */
    public RunnableC4205(@InterfaceC6399 InterfaceC4199<? super C8107> interfaceC4199) {
        super(false);
        this.f8524 = interfaceC4199;
    }

    @Override // java.lang.Runnable
    public void run() {
        if (compareAndSet(false, true)) {
            InterfaceC4199<C8107> interfaceC4199 = this.f8524;
            C7148.C1189 c1189 = C7148.f21560;
            interfaceC4199.resumeWith(C7148.m3438(C8107.f3222));
        }
    }

    @Override // java.util.concurrent.atomic.AtomicBoolean
    @InterfaceC6399
    public String toString() {
        return "ContinuationRunnable(ran = " + get() + ')';
    }
}
