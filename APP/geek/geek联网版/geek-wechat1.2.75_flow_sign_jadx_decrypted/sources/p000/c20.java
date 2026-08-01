package p000;

import java.util.concurrent.atomic.AtomicLongFieldUpdater;

/* JADX INFO: loaded from: classes.dex */
public abstract class c20 extends AbstractC0524nj {

    /* JADX INFO: renamed from: c */
    public ExecutorC0556oe f811c;

    @Override // p000.AbstractC0445le
    /* JADX INFO: renamed from: d */
    public final void mo584d(InterfaceC0295he interfaceC0295he, Runnable runnable) {
        ExecutorC0556oe executorC0556oe = this.f811c;
        AtomicLongFieldUpdater atomicLongFieldUpdater = ExecutorC0556oe.f3439h;
        executorC0556oe.m2027b(runnable, d60.f1324g);
    }
}
