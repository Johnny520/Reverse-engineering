package p000;

import java.io.InterruptedIOException;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class o23 {

    /* JADX INFO: renamed from: d */
    public static final n23 f7455d = new n23();

    /* JADX INFO: renamed from: a */
    public boolean f7456a;

    /* JADX INFO: renamed from: b */
    public long f7457b;

    /* JADX INFO: renamed from: c */
    public long f7458c;

    /* JADX INFO: renamed from: a */
    public o23 mo3473a() {
        this.f7456a = false;
        return this;
    }

    /* JADX INFO: renamed from: b */
    public o23 mo3474b() {
        this.f7458c = 0L;
        return this;
    }

    /* JADX INFO: renamed from: c */
    public long mo3475c() {
        if (this.f7456a) {
            return this.f7457b;
        }
        C0676s.m4653l("No deadline");
        return 0L;
    }

    /* JADX INFO: renamed from: d */
    public o23 mo3226d(long j) {
        this.f7456a = true;
        this.f7457b = j;
        return this;
    }

    /* JADX INFO: renamed from: e */
    public boolean mo3476e() {
        return this.f7456a;
    }

    /* JADX INFO: renamed from: f */
    public void mo3227f() throws InterruptedIOException {
        if (Thread.currentThread().isInterrupted()) {
            throw new InterruptedIOException("interrupted");
        }
        if (this.f7456a && this.f7457b - System.nanoTime() <= 0) {
            throw new InterruptedIOException("deadline reached");
        }
    }

    /* JADX INFO: renamed from: g */
    public o23 mo3228g(long j) {
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        timeUnit.getClass();
        if (j >= 0) {
            this.f7458c = timeUnit.toNanos(j);
            return this;
        }
        C0676s.m4647f("timeout < 0: ", j);
        return null;
    }
}
