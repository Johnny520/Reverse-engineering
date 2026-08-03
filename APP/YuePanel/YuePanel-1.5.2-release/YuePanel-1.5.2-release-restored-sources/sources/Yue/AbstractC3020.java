package Yue;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: Yue.ۥۣ۟۟, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC3020 extends AbstractC8410 {

    /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
    public boolean f4383;

    /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
    public boolean f4384;

    /* JADX INFO: renamed from: ۥ۟۟۠ۧ, reason: contains not printable characters */
    public ScheduledExecutorService f4385;

    /* JADX INFO: renamed from: ۥ۟۟۠ۨ, reason: contains not printable characters */
    public ScheduledFuture<?> f4386;

    /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
    public final InterfaceC5866 f4382 = C5867.m18162(AbstractC3020.class);

    /* JADX INFO: renamed from: ۥ۟۟ۡ, reason: contains not printable characters */
    public long f4387 = TimeUnit.SECONDS.toNanos(60);

    /* JADX INFO: renamed from: ۥ۟۟ۡ۟, reason: contains not printable characters */
    public boolean f4388 = false;

    /* JADX INFO: renamed from: ۥ۟۟ۡ۠, reason: contains not printable characters */
    public final Object f4389 = new Object();

    /* JADX INFO: renamed from: Yue.ۥۣ۟۟$ۥ */
    public class RunnableC0028 implements Runnable {

        /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
        public ArrayList<InterfaceC8409> f4390 = new ArrayList<>();

        public RunnableC0028() {
        }

        @Override // java.lang.Runnable
        public void run() {
            long jNanoTime;
            this.f4390.clear();
            try {
                this.f4390.addAll(AbstractC3020.this.mo5914());
                synchronized (AbstractC3020.this.f4389) {
                    jNanoTime = (long) (System.nanoTime() - (AbstractC3020.this.f4387 * 1.5d));
                }
                Iterator<InterfaceC8409> it = this.f4390.iterator();
                while (it.hasNext()) {
                    AbstractC3020.this.m5912(it.next(), jNanoTime);
                }
            } catch (Exception unused) {
            }
            this.f4390.clear();
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟ۢۥ, reason: contains not printable characters */
    public final void m5911() {
        ScheduledExecutorService scheduledExecutorService = this.f4385;
        if (scheduledExecutorService != null) {
            scheduledExecutorService.shutdownNow();
            this.f4385 = null;
        }
        ScheduledFuture<?> scheduledFuture = this.f4386;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(false);
            this.f4386 = null;
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟ۢۦ, reason: contains not printable characters */
    public final void m5912(InterfaceC8409 interfaceC8409, long j) {
        if (interfaceC8409 instanceof C8414) {
            C8414 c8414 = (C8414) interfaceC8409;
            if (c8414.m28101() < j) {
                this.f4382.mo14133("Closing connection due to no pong received: {}", c8414);
                c8414.mo28030(1006, "The connection was closed because the other endpoint did not respond with a pong in time. For more information check: https://github.com/TooTallNate/Java-WebSocket/wiki/Lost-connection-detection");
            } else if (c8414.isOpen()) {
                c8414.mo28020();
            } else {
                this.f4382.mo14133("Trying to ping a non open connection: {}", c8414);
            }
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟ۢۧ, reason: contains not printable characters */
    public int m5913() {
        int seconds;
        synchronized (this.f4389) {
            seconds = (int) TimeUnit.NANOSECONDS.toSeconds(this.f4387);
        }
        return seconds;
    }

    /* JADX INFO: renamed from: ۥ۟۟ۢۨ, reason: contains not printable characters */
    public abstract Collection<InterfaceC8409> mo5914();

    /* JADX INFO: renamed from: ۥۣ۟۟, reason: contains not printable characters */
    public boolean m5915() {
        return this.f4384;
    }

    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public boolean m5916() {
        return this.f4383;
    }

    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    public final void m5917() {
        m5911();
        this.f4385 = Executors.newSingleThreadScheduledExecutor(new ThreadFactoryC6346("connectionLostChecker"));
        RunnableC0028 runnableC0028 = new RunnableC0028();
        ScheduledExecutorService scheduledExecutorService = this.f4385;
        long j = this.f4387;
        this.f4386 = scheduledExecutorService.scheduleAtFixedRate(runnableC0028, j, j, TimeUnit.NANOSECONDS);
    }

    /* JADX INFO: renamed from: ۥۣ۟۟ۡ, reason: contains not printable characters */
    public void m5918(int i) {
        synchronized (this.f4389) {
            try {
                long nanos = TimeUnit.SECONDS.toNanos(i);
                this.f4387 = nanos;
                if (nanos <= 0) {
                    this.f4382.mo14160("Connection lost timer stopped");
                    m5911();
                    return;
                }
                if (this.f4388) {
                    this.f4382.mo14160("Connection lost timer restarted");
                    try {
                        for (InterfaceC8409 interfaceC8409 : new ArrayList(mo5914())) {
                            if (interfaceC8409 instanceof C8414) {
                                ((C8414) interfaceC8409).m28111();
                            }
                        }
                    } catch (Exception e) {
                        this.f4382.error("Exception during connection lost restart", e);
                    }
                    m5917();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: ۥۣ۟۟ۢ, reason: contains not printable characters */
    public void m5919(boolean z) {
        this.f4384 = z;
    }

    /* JADX INFO: renamed from: ۥۣۣ۟۟, reason: contains not printable characters */
    public void m5920(boolean z) {
        this.f4383 = z;
    }

    /* JADX INFO: renamed from: ۥۣ۟۟ۤ, reason: contains not printable characters */
    public void m5921() {
        synchronized (this.f4389) {
            try {
                if (this.f4387 <= 0) {
                    this.f4382.mo14160("Connection lost timer deactivated");
                    return;
                }
                this.f4382.mo14160("Connection lost timer started");
                this.f4388 = true;
                m5917();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: ۥۣ۟۟ۥ, reason: contains not printable characters */
    public void m5922() {
        synchronized (this.f4389) {
            try {
                if (this.f4385 != null || this.f4386 != null) {
                    this.f4388 = false;
                    this.f4382.mo14160("Connection lost timer stopped");
                    m5911();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
