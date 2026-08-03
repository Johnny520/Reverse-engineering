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

    public C1683a(long r5, boolean r7, C0698Q9 r8, ILogger r9, Context r10) {
        C2438r1 r0 = new C2438r1(23);
        C1666I r1 = new C1666I();
        super("|ANR-WatchDog|");
        this.f6078h = 0;
        this.f6079i = new AtomicBoolean(false);
        this.f6074d = r0;
        this.f6076f = r5;
        this.f6075e = 500;
        this.f6071a = r7;
        this.f6072b = r8;
        this.f6077g = r9;
        this.f6073c = r1;
        this.f6080j = r10;
        this.f6081k = new RunnableC1631S1(this, r0);
        if (r5 < 1000) goto L6;
        return;
    L6:
        throw new IllegalArgumentException(String.format("ANRWatchDog: timeoutIntervalMillis has to be at least %d ms", new Object[]{1000L}));
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        this.f6081k.run();
    L4:
        if (isInterrupted() == true) goto L64;
        C1666I r0 = this.f6073c;
        ((Handler) r0.f5974a).post(this.f6081k);
        Thread.sleep(this.f6075e);     // Catch: InterruptedException -> L34
        this.f6074d.getClass();
        if ((SystemClock.uptimeMillis() - this.f6078h) <= this.f6076f) goto L4;
        if (this.f6071a == true) goto L16;
        if (Debug.isDebuggerConnected() == true) goto L15;
        if (Debug.waitingForDebugger() == false) goto L16;
    L15:
        this.f6077g.mo3680e(EnumC1657a2.DEBUG, "An ANR was detected but ignored because the debugger is connected.", new Object[0]);
        this.f6079i.set(true);
    L16:
        ActivityManager r02 = (ActivityManager) this.f6080j.getSystemService("activity");
        if (r02 == null) goto L29;
        List<ActivityManager.ProcessErrorStateInfo> r03 = r02.getProcessesInErrorState();     // Catch: Throwable -> L20
    L22:
        if (r03 == null) goto L4;
        Iterator<ActivityManager.ProcessErrorStateInfo> r04 = r03.iterator();
    L25:
        if (r04.hasNext() == false) goto L4;
        if (r04.next().condition != 2) goto L25;
    L20:
        th = move-exception;
        this.f6077g.mo3683r(EnumC1657a2.ERROR, "Error getting ActivityManager#getProcessesInErrorState.", th);
        r03 = null;
    L29:
        if (this.f6079i.compareAndSet(false, true) == false) goto L4;
        ApplicationNotResponding r3 = new ApplicationNotResponding("Application Not Responding for at least " + this.f6076f + " ms.", ((Handler) this.f6073c.f5974a).getLooper().getThread());
        C0698Q9 r05 = this.f6072b;
        Object r4 = r05.f2247b;
        SentryAndroidOptions r06 = (SentryAndroidOptions) r05.f2248c;
        C1683a r42 = AnrIntegration.f5936e;
        r06.getLogger().mo3680e(EnumC1657a2.INFO, "ANR triggered with message: %s", new Object[]{r3.getMessage()});
        boolean r43 = Boolean.TRUE.equals(C1662E.f5959e.f5963d);
        String r07 = "ANR for at least " + r06.getAnrTimeoutIntervalMillis() + " ms.";
        if (r43 == false) goto L33;
        r07 = AbstractC0213Ey.m420r("Background ", r07);
    L33:
        ApplicationNotResponding r1 = new ApplicationNotResponding(r07, r3.f5954a);
        C1961k r08 = new C1961k();
        r08.f6954a = "ANR";
        C1627R1 r09 = new C1627R1(new C1869a(r08, r1, r1.f5954a, true));
        r09.f5850u = EnumC1657a2.ERROR;
        AbstractC2066z1.m4233b().mo3723r(r09, AbstractC1856a.m4059e(new C1746t(r43)));
    L34:
        e = move-exception;
        Thread.currentThread().interrupt();     // Catch: SecurityException -> L38
        this.f6077g.mo3680e(EnumC1657a2.WARNING, "Interrupted: %s", new Object[]{e.getMessage()});
        return;
    L38:
        this.f6077g.mo3680e(EnumC1657a2.WARNING, "Failed to interrupt due to SecurityException: %s", new Object[]{e.getMessage()});
        return;
    }
}
