package p000;

import java.util.concurrent.atomic.AtomicLongFieldUpdater;

/* JADX INFO: renamed from: lx */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2210lx extends AbstractC2760yg {

    /* JADX INFO: renamed from: b */
    public ExecutorC1365ec f7697b;

    @Override // p000.AbstractC1217bc
    /* JADX INFO: renamed from: t */
    public final void mo1781t(InterfaceC1137ac interfaceC1137ac, Runnable runnable) {
        ExecutorC1365ec executorC1365ec = this.f7697b;
        AtomicLongFieldUpdater atomicLongFieldUpdater = ExecutorC1365ec.f4879h;
        executorC1365ec.m2656f(runnable, false);
    }
}
