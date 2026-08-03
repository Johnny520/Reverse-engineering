package Yue;

import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* JADX INFO: renamed from: Yue.ۥ۠ۧ۠ۡ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public final class ExecutorC5700 extends AbstractC4746 implements InterfaceC7726, Executor {

    /* JADX INFO: renamed from: ۥ۟۟ۡ, reason: contains not printable characters */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f14033 = AtomicIntegerFieldUpdater.newUpdater(ExecutorC5700.class, "inFlightTasks");

    /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
    @InterfaceC6399
    public final C4763 f14034;

    /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
    public final int f14035;

    /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
    @InterfaceC6489
    public final String f14036;

    /* JADX INFO: renamed from: ۥ۟۟۠ۧ, reason: contains not printable characters */
    public final int f14037;

    /* JADX INFO: renamed from: ۥ۟۟۠ۨ, reason: contains not printable characters */
    @InterfaceC6399
    public final ConcurrentLinkedQueue<Runnable> f14038 = new ConcurrentLinkedQueue<>();

    @InterfaceC6399
    private volatile /* synthetic */ int inFlightTasks = 0;

    public ExecutorC5700(@InterfaceC6399 C4763 c4763, int i, @InterfaceC6489 String str, int i2) {
        this.f14034 = c4763;
        this.f14035 = i;
        this.f14036 = str;
        this.f14037 = i2;
    }

    @Override // Yue.AbstractC4746, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        throw new IllegalStateException("Close cannot be invoked on LimitingBlockingDispatcher".toString());
    }

    @Override // Yue.AbstractC4232
    public void dispatch(@InterfaceC6399 InterfaceC4225 interfaceC4225, @InterfaceC6399 Runnable runnable) {
        m17605(runnable, false);
    }

    @Override // Yue.AbstractC4232
    public void dispatchYield(@InterfaceC6399 InterfaceC4225 interfaceC4225, @InterfaceC6399 Runnable runnable) {
        m17605(runnable, true);
    }

    @Override // java.util.concurrent.Executor
    public void execute(@InterfaceC6399 Runnable runnable) {
        m17605(runnable, false);
    }

    @Override // Yue.AbstractC4232
    @InterfaceC6399
    public String toString() {
        String str = this.f14036;
        if (str != null) {
            return str;
        }
        return super.toString() + "[dispatcher = " + this.f14034 + ']';
    }

    @Override // Yue.InterfaceC7726
    /* JADX INFO: renamed from: ۥ۟۟ۡۧ, reason: contains not printable characters */
    public void mo17603() {
        Runnable runnablePoll = this.f14038.poll();
        if (runnablePoll != null) {
            this.f14034.m14430(runnablePoll, this, true);
            return;
        }
        f14033.decrementAndGet(this);
        Runnable runnablePoll2 = this.f14038.poll();
        if (runnablePoll2 == null) {
            return;
        }
        m17605(runnablePoll2, true);
    }

    @Override // Yue.InterfaceC7726
    /* JADX INFO: renamed from: ۥۣ۟۟ۤ, reason: contains not printable characters */
    public int mo17604() {
        return this.f14037;
    }

    @Override // Yue.AbstractC4746
    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۟ۧ۟ */
    public Executor mo12605() {
        return this;
    }

    /* JADX INFO: renamed from: ۥ۟۟ۧ۠, reason: contains not printable characters */
    public final void m17605(Runnable runnable, boolean z) {
        do {
            AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f14033;
            if (atomicIntegerFieldUpdater.incrementAndGet(this) <= this.f14035) {
                this.f14034.m14430(runnable, this, z);
                return;
            }
            this.f14038.add(runnable);
            if (atomicIntegerFieldUpdater.decrementAndGet(this) >= this.f14035) {
                return;
            } else {
                runnable = this.f14038.poll();
            }
        } while (runnable != null);
    }
}
