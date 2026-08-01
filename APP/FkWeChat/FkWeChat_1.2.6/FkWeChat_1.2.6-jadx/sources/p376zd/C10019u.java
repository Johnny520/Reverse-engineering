package p376zd;

import java.io.InterruptedIOException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;

/* JADX INFO: renamed from: zd.u */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
public class C10019u extends C10026x0 {

    /* JADX INFO: renamed from: a */
    public C10026x0 f33630a;

    public C10019u(C10026x0 c10026x0) {
        c10026x0.getClass();
        this.f33630a = c10026x0;
    }

    /* JADX INFO: renamed from: a */
    public final C10026x0 m38837a() {
        return this.f33630a;
    }

    @Override // p376zd.C10026x0
    public void awaitSignal(Condition condition) throws InterruptedIOException {
        condition.getClass();
        this.f33630a.awaitSignal(condition);
    }

    /* JADX INFO: renamed from: b */
    public final C10019u m38838b(C10026x0 c10026x0) {
        c10026x0.getClass();
        this.f33630a = c10026x0;
        return this;
    }

    @Override // p376zd.C10026x0
    public C10026x0 clearDeadline() {
        return this.f33630a.clearDeadline();
    }

    @Override // p376zd.C10026x0
    public C10026x0 clearTimeout() {
        return this.f33630a.clearTimeout();
    }

    @Override // p376zd.C10026x0
    public long deadlineNanoTime() {
        return this.f33630a.deadlineNanoTime();
    }

    @Override // p376zd.C10026x0
    public boolean hasDeadline() {
        return this.f33630a.hasDeadline();
    }

    @Override // p376zd.C10026x0
    public void throwIfReached() throws InterruptedIOException {
        this.f33630a.throwIfReached();
    }

    @Override // p376zd.C10026x0
    public C10026x0 timeout(long j10, TimeUnit timeUnit) {
        timeUnit.getClass();
        return this.f33630a.timeout(j10, timeUnit);
    }

    @Override // p376zd.C10026x0
    public long timeoutNanos() {
        return this.f33630a.timeoutNanos();
    }

    @Override // p376zd.C10026x0
    public void waitUntilNotified(Object obj) throws InterruptedIOException {
        obj.getClass();
        this.f33630a.waitUntilNotified(obj);
    }

    @Override // p376zd.C10026x0
    public C10026x0 deadlineNanoTime(long j10) {
        return this.f33630a.deadlineNanoTime(j10);
    }
}
