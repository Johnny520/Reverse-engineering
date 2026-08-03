package io.sentry;

import io.sentry.android.core.C1695f0;
import io.sentry.android.core.SentryAndroidOptions;
import io.sentry.config.AbstractC1856a;
import io.sentry.protocol.C1970t;
import io.sentry.util.C2029a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Timer;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.atomic.AtomicBoolean;
import p000.RunnableC2260n3;

/* JADX INFO: renamed from: io.sentry.q */
/* JADX INFO: loaded from: classes.dex */
public final class C1977q implements InterfaceC1925m {

    /* JADX INFO: renamed from: d */
    public final ArrayList f7073d;

    /* JADX INFO: renamed from: e */
    public final ArrayList f7074e;

    /* JADX INFO: renamed from: f */
    public final boolean f7075f;

    /* JADX INFO: renamed from: g */
    public final C2046v2 f7076g;

    /* JADX INFO: renamed from: a */
    public final C2029a f7070a = new C2029a();

    /* JADX INFO: renamed from: b */
    public volatile Timer f7071b = null;

    /* JADX INFO: renamed from: c */
    public final ConcurrentHashMap f7072c = new ConcurrentHashMap();

    /* JADX INFO: renamed from: h */
    public final AtomicBoolean f7077h = new AtomicBoolean(false);

    /* JADX INFO: renamed from: i */
    public long f7078i = 0;

    public C1977q(SentryAndroidOptions sentryAndroidOptions) {
        boolean z = false;
        AbstractC1856a.m4048D("The options object is required.", sentryAndroidOptions);
        this.f7076g = sentryAndroidOptions;
        this.f7073d = new ArrayList();
        this.f7074e = new ArrayList();
        for (InterfaceC1636U interfaceC1636U : sentryAndroidOptions.getPerformanceCollectors()) {
            if (interfaceC1636U instanceof InterfaceC1642W) {
                this.f7073d.add((InterfaceC1642W) interfaceC1636U);
            }
            if (interfaceC1636U instanceof InterfaceC1639V) {
                this.f7074e.add((InterfaceC1639V) interfaceC1636U);
            }
        }
        if (this.f7073d.isEmpty() && this.f7074e.isEmpty()) {
            z = true;
        }
        this.f7075f = z;
    }

    @Override // io.sentry.InterfaceC1925m
    /* JADX INFO: renamed from: a */
    public final void mo3674a(C1585G2 c1585g2) {
        Iterator it = this.f7074e.iterator();
        while (it.hasNext()) {
            ((C1695f0) ((InterfaceC1639V) it.next())).m3873f(c1585g2);
        }
    }

    @Override // io.sentry.InterfaceC1925m
    /* JADX INFO: renamed from: b */
    public final void mo3675b(C1573D2 c1573d2) {
        C1970t c1970t = c1573d2.f5628a;
        boolean z = this.f7075f;
        C2046v2 c2046v2 = this.f7076g;
        if (z) {
            c2046v2.getLogger().mo3680e(EnumC1657a2.INFO, "No collector found. Performance stats will not be captured during transactions.", new Object[0]);
            return;
        }
        Iterator it = this.f7074e.iterator();
        while (it.hasNext()) {
            ((C1695f0) ((InterfaceC1639V) it.next())).m3873f(c1573d2);
        }
        String string = c1970t.toString();
        ConcurrentHashMap concurrentHashMap = this.f7072c;
        if (!concurrentHashMap.containsKey(string)) {
            concurrentHashMap.put(c1970t.toString(), new ArrayList());
            try {
                c2046v2.getExecutorService().mo3703q(new RunnableC2260n3(19, this, c1573d2), 30000L);
            } catch (RejectedExecutionException e) {
                c2046v2.getLogger().mo3683r(EnumC1657a2.ERROR, "Failed to call the executor. Performance collector will not be automatically finished. Did you call Sentry.close()?", e);
            }
        }
        mo3676c(c1970t.toString());
    }

    @Override // io.sentry.InterfaceC1925m
    /* JADX INFO: renamed from: c */
    public final void mo3676c(String str) {
        if (this.f7075f) {
            this.f7076g.getLogger().mo3680e(EnumC1657a2.INFO, "No collector found. Performance stats will not be captured during transactions.", new Object[0]);
            return;
        }
        if (!this.f7072c.containsKey(str)) {
            this.f7072c.put(str, new ArrayList());
        }
        if (this.f7077h.getAndSet(true)) {
            return;
        }
        C1981r c1981rM4173a = this.f7070a.m4173a();
        try {
            if (this.f7071b == null) {
                this.f7071b = new Timer(true);
            }
            this.f7071b.schedule(new C1938p(this, 0), 0L);
            this.f7071b.scheduleAtFixedRate(new C1938p(this, 1), 100L, 100L);
            c1981rM4173a.close();
        } finally {
        }
    }

    @Override // io.sentry.InterfaceC1925m
    public final void close() {
        this.f7076g.getLogger().mo3680e(EnumC1657a2.DEBUG, "stop collecting all performance info for transactions", new Object[0]);
        this.f7072c.clear();
        Iterator it = this.f7074e.iterator();
        while (it.hasNext()) {
            ((C1695f0) ((InterfaceC1639V) it.next())).m3871d();
        }
        if (this.f7077h.getAndSet(false)) {
            C1981r c1981rM4173a = this.f7070a.m4173a();
            try {
                if (this.f7071b != null) {
                    this.f7071b.cancel();
                    this.f7071b = null;
                }
                c1981rM4173a.close();
            } catch (Throwable th) {
                try {
                    c1981rM4173a.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }
    }

    @Override // io.sentry.InterfaceC1925m
    /* JADX INFO: renamed from: d */
    public final void mo3677d(C1585G2 c1585g2) throws Throwable {
        Iterator it = this.f7074e.iterator();
        while (it.hasNext()) {
            ((C1695f0) ((InterfaceC1639V) it.next())).m3872e(c1585g2);
        }
    }

    @Override // io.sentry.InterfaceC1925m
    /* JADX INFO: renamed from: e */
    public final List mo3678e(InterfaceC1895i0 interfaceC1895i0) {
        this.f7076g.getLogger().mo3680e(EnumC1657a2.DEBUG, "stop collecting performance info for transactions %s (%s)", interfaceC1895i0.getName(), interfaceC1895i0.mo3627m().f5738a.toString());
        Iterator it = this.f7074e.iterator();
        while (it.hasNext()) {
            ((C1695f0) ((InterfaceC1639V) it.next())).m3872e(interfaceC1895i0);
        }
        return mo3679f(interfaceC1895i0.mo3621g().toString());
    }

    @Override // io.sentry.InterfaceC1925m
    /* JADX INFO: renamed from: f */
    public final List mo3679f(String str) {
        ConcurrentHashMap concurrentHashMap = this.f7072c;
        List list = (List) concurrentHashMap.remove(str);
        if (concurrentHashMap.isEmpty()) {
            close();
        }
        return list;
    }
}
