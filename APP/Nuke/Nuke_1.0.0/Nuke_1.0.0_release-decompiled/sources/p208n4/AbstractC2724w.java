package p208n4;

import java.io.InterruptedIOException;
import java.util.concurrent.TimeUnit;
import p117X2.AbstractC1665j;

/* JADX INFO: renamed from: n4.w */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2724w {

    /* JADX INFO: renamed from: d */
    public static final C2723v f8665d = new C2723v();

    /* JADX INFO: renamed from: a */
    public boolean f8666a;

    /* JADX INFO: renamed from: b */
    public long f8667b;

    /* JADX INFO: renamed from: c */
    public long f8668c;

    /* JADX INFO: renamed from: a */
    public AbstractC2724w mo4743a() {
        this.f8666a = false;
        return this;
    }

    /* JADX INFO: renamed from: b */
    public AbstractC2724w mo4744b() {
        this.f8668c = 0L;
        return this;
    }

    /* JADX INFO: renamed from: c */
    public long mo4745c() {
        if (this.f8666a) {
            return this.f8667b;
        }
        throw new IllegalStateException("No deadline");
    }

    /* JADX INFO: renamed from: d */
    public AbstractC2724w mo4746d(long j5) {
        this.f8666a = true;
        this.f8667b = j5;
        return this;
    }

    /* JADX INFO: renamed from: e */
    public boolean mo4747e() {
        return this.f8666a;
    }

    /* JADX INFO: renamed from: f */
    public void mo4748f() throws InterruptedIOException {
        if (Thread.currentThread().isInterrupted()) {
            throw new InterruptedIOException("interrupted");
        }
        if (this.f8666a && this.f8667b - System.nanoTime() <= 0) {
            throw new InterruptedIOException("deadline reached");
        }
    }

    /* JADX INFO: renamed from: g */
    public AbstractC2724w mo4749g(long j5) {
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        AbstractC1665j.m2985e(timeUnit, "unit");
        if (j5 >= 0) {
            this.f8668c = timeUnit.toNanos(j5);
            return this;
        }
        throw new IllegalArgumentException(("timeout < 0: " + j5).toString());
    }
}
