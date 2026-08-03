package io.sentry.android.core;

import android.app.ActivityManager;
import android.content.Context;
import android.os.Debug;
import android.os.Handler;
import android.os.SystemClock;
import io.sentry.AbstractC2066z1;
import io.sentry.C1627R1;
import io.sentry.EnumC1657a2;
import io.sentry.ILogger;
import io.sentry.RunnableC1631S1;
import io.sentry.config.AbstractC1856a;
import io.sentry.exception.C1869a;
import io.sentry.protocol.C1961k;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import p000.AbstractC0213Ey;
import p000.C0698Q9;
import p000.C2438r1;

/* JADX INFO: renamed from: io.sentry.android.core.a */
/* JADX INFO: loaded from: classes.dex */
public final class C1683a extends Thread {

    /* JADX INFO: renamed from: a */
    public final boolean f6071a;

    /* JADX INFO: renamed from: b */
    public final C0698Q9 f6072b;

    /* JADX INFO: renamed from: c */
    public final C1666I f6073c;

    /* JADX INFO: renamed from: d */
    public final C2438r1 f6074d;

    /* JADX INFO: renamed from: e */
    public final long f6075e;

    /* JADX INFO: renamed from: f */
    public final long f6076f;

    /* JADX INFO: renamed from: g */
    public final ILogger f6077g;

    /* JADX INFO: renamed from: h */
    public volatile long f6078h;

    /* JADX INFO: renamed from: i */
    public final AtomicBoolean f6079i;

    /* JADX INFO: renamed from: j */
    public final Context f6080j;

    /* JADX INFO: renamed from: k */
    public final RunnableC1631S1 f6081k;

    public C1683a(long j, boolean z, C0698Q9 c0698q9, ILogger iLogger, Context context) {
        C2438r1 c2438r1 = new C2438r1(23);
        C1666I c1666i = new C1666I();
        super("|ANR-WatchDog|");
        this.f6078h = 0L;
        this.f6079i = new AtomicBoolean(false);
        this.f6074d = c2438r1;
        this.f6076f = j;
        this.f6075e = 500L;
        this.f6071a = z;
        this.f6072b = c0698q9;
        this.f6077g = iLogger;
        this.f6073c = c1666i;
        this.f6080j = context;
        this.f6081k = new RunnableC1631S1(this, c2438r1);
        if (j < 1000) {
            throw new IllegalArgumentException(String.format("ANRWatchDog: timeoutIntervalMillis has to be at least %d ms", 1000L));
        }
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() throws IOException {
        List<ActivityManager.ProcessErrorStateInfo> processesInErrorState;
        this.f6081k.run();
        while (!isInterrupted()) {
            ((Handler) this.f6073c.f5974a).post(this.f6081k);
            try {
                Thread.sleep(this.f6075e);
                this.f6074d.getClass();
                if (SystemClock.uptimeMillis() - this.f6078h > this.f6076f) {
                    if (this.f6071a || !(Debug.isDebuggerConnected() || Debug.waitingForDebugger())) {
                        ActivityManager activityManager = (ActivityManager) this.f6080j.getSystemService("activity");
                        if (activityManager != null) {
                            try {
                                processesInErrorState = activityManager.getProcessesInErrorState();
                            } catch (Throwable th) {
                                this.f6077g.mo3683r(EnumC1657a2.ERROR, "Error getting ActivityManager#getProcessesInErrorState.", th);
                                processesInErrorState = null;
                            }
                            if (processesInErrorState != null) {
                                Iterator<ActivityManager.ProcessErrorStateInfo> it = processesInErrorState.iterator();
                                while (it.hasNext()) {
                                    if (it.next().condition == 2) {
                                    }
                                }
                            }
                        }
                        if (this.f6079i.compareAndSet(false, true)) {
                            ApplicationNotResponding applicationNotResponding = new ApplicationNotResponding("Application Not Responding for at least " + this.f6076f + " ms.", ((Handler) this.f6073c.f5974a).getLooper().getThread());
                            C0698Q9 c0698q9 = this.f6072b;
                            Object obj = c0698q9.f2247b;
                            SentryAndroidOptions sentryAndroidOptions = (SentryAndroidOptions) c0698q9.f2248c;
                            C1683a c1683a = AnrIntegration.f5936e;
                            sentryAndroidOptions.getLogger().mo3680e(EnumC1657a2.INFO, "ANR triggered with message: %s", applicationNotResponding.getMessage());
                            boolean zEquals = Boolean.TRUE.equals(C1662E.f5959e.f5963d);
                            String strM420r = "ANR for at least " + sentryAndroidOptions.getAnrTimeoutIntervalMillis() + " ms.";
                            if (zEquals) {
                                strM420r = AbstractC0213Ey.m420r("Background ", strM420r);
                            }
                            ApplicationNotResponding applicationNotResponding2 = new ApplicationNotResponding(strM420r, applicationNotResponding.f5954a);
                            C1961k c1961k = new C1961k();
                            c1961k.f6954a = "ANR";
                            C1627R1 c1627r1 = new C1627R1(new C1869a(c1961k, applicationNotResponding2, applicationNotResponding2.f5954a, true));
                            c1627r1.f5850u = EnumC1657a2.ERROR;
                            AbstractC2066z1.m4233b().mo3723r(c1627r1, AbstractC1856a.m4059e(new C1746t(zEquals)));
                        }
                    } else {
                        this.f6077g.mo3680e(EnumC1657a2.DEBUG, "An ANR was detected but ignored because the debugger is connected.", new Object[0]);
                        this.f6079i.set(true);
                    }
                }
            } catch (InterruptedException e) {
                try {
                    Thread.currentThread().interrupt();
                    this.f6077g.mo3680e(EnumC1657a2.WARNING, "Interrupted: %s", e.getMessage());
                    return;
                } catch (SecurityException unused) {
                    this.f6077g.mo3680e(EnumC1657a2.WARNING, "Failed to interrupt due to SecurityException: %s", e.getMessage());
                    return;
                }
            }
        }
    }
}
