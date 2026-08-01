package p000;

import java.util.concurrent.atomic.AtomicLongFieldUpdater;

/* JADX INFO: loaded from: classes.dex */
public abstract class v10 extends AbstractC0450lj {

    /* JADX INFO: renamed from: c */
    public ExecutorC0519ne f4786c;

    @Override // p000.AbstractC0408ke
    /* JADX INFO: renamed from: d */
    public final void mo1598d(InterfaceC0258ge interfaceC0258ge, Runnable runnable) {
        ExecutorC0519ne executorC0519ne = this.f4786c;
        AtomicLongFieldUpdater atomicLongFieldUpdater = ExecutorC0519ne.f3399h;
        executorC0519ne.m1941b(runnable, x50.f5102g);
    }
}
