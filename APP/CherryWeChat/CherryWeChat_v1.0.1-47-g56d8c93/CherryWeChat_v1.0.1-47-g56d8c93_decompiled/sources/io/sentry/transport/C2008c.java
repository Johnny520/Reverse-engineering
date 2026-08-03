package io.sentry.transport;

import io.sentry.AbstractC1588H1;
import io.sentry.C1563B0;
import io.sentry.C1586H;
import io.sentry.C1596J1;
import io.sentry.C1620P1;
import io.sentry.C1628R2;
import io.sentry.C2043v;
import io.sentry.C2046v2;
import io.sentry.EnumC1657a2;
import io.sentry.EnumC1929n;
import io.sentry.ILogger;
import io.sentry.InterfaceC1592I1;
import io.sentry.ThreadFactoryC1594J;
import io.sentry.cache.InterfaceC1839d;
import io.sentry.clientreport.EnumC1853d;
import io.sentry.config.AbstractC1856a;
import io.sentry.hints.AbstractC1885c;
import io.sentry.hints.InterfaceC1886d;
import io.sentry.hints.InterfaceC1889g;
import io.sentry.hints.InterfaceC1892j;
import io.sentry.internal.debugmeta.C1901c;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Future;
import java.util.concurrent.RejectedExecutionHandler;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: io.sentry.transport.c */
/* JADX INFO: loaded from: classes.dex */
public final class C2008c implements InterfaceC2012g {

    /* JADX INFO: renamed from: a */
    public final C2019n f7181a;

    /* JADX INFO: renamed from: b */
    public final InterfaceC1839d f7182b;

    /* JADX INFO: renamed from: c */
    public final C2046v2 f7183c;

    /* JADX INFO: renamed from: d */
    public final C2021p f7184d;

    /* JADX INFO: renamed from: e */
    public final InterfaceC2013h f7185e;

    /* JADX INFO: renamed from: f */
    public final C2010e f7186f;

    /* JADX INFO: renamed from: g */
    public volatile RunnableC2007b f7187g;

    /* JADX WARN: Type inference failed for: r3v0, types: [io.sentry.transport.a] */
    public C2008c(C2046v2 c2046v2, C2021p c2021p, InterfaceC2013h interfaceC2013h, C1901c c1901c) {
        int maxQueueSize = c2046v2.getMaxQueueSize();
        final InterfaceC1839d envelopeDiskCache = c2046v2.getEnvelopeDiskCache();
        final ILogger logger = c2046v2.getLogger();
        InterfaceC1592I1 dateProvider = c2046v2.getDateProvider();
        C2019n c2019n = new C2019n(maxQueueSize, new ThreadFactoryC1594J(4), new RejectedExecutionHandler() { // from class: io.sentry.transport.a
            @Override // java.util.concurrent.RejectedExecutionHandler
            public final void rejectedExecution(Runnable runnable, ThreadPoolExecutor threadPoolExecutor) {
                if (runnable instanceof RunnableC2007b) {
                    RunnableC2007b runnableC2007b = (RunnableC2007b) runnable;
                    C1586H c1586h = runnableC2007b.f7177b;
                    if (!AbstractC1856a.m4075v(c1586h, InterfaceC1886d.class)) {
                        envelopeDiskCache.mo3868i(runnableC2007b.f7176a, c1586h);
                    }
                    Object objM4072s = AbstractC1856a.m4072s(c1586h);
                    if (InterfaceC1892j.class.isInstance(AbstractC1856a.m4072s(c1586h)) && objM4072s != null) {
                        ((InterfaceC1892j) objM4072s).mo3847b(false);
                    }
                    Object objM4072s2 = AbstractC1856a.m4072s(c1586h);
                    if (InterfaceC1889g.class.isInstance(AbstractC1856a.m4072s(c1586h)) && objM4072s2 != null) {
                        ((InterfaceC1889g) objM4072s2).mo3850e(true);
                    }
                    logger.mo3680e(EnumC1657a2.WARNING, "Envelope rejected", new Object[0]);
                }
            }
        }, logger, dateProvider);
        C2010e c2010e = new C2010e(c2046v2, c1901c, c2021p);
        this.f7187g = null;
        this.f7181a = c2019n;
        InterfaceC1839d envelopeDiskCache2 = c2046v2.getEnvelopeDiskCache();
        AbstractC1856a.m4048D("envelopeCache is required", envelopeDiskCache2);
        this.f7182b = envelopeDiskCache2;
        this.f7183c = c2046v2;
        this.f7184d = c2021p;
        AbstractC1856a.m4048D("transportGate is required", interfaceC2013h);
        this.f7185e = interfaceC2013h;
        this.f7186f = c2010e;
    }

    @Override // io.sentry.transport.InterfaceC2012g
    /* JADX INFO: renamed from: a */
    public final void mo4159a(boolean z) {
        this.f7184d.close();
        this.f7181a.shutdown();
        this.f7183c.getLogger().mo3680e(EnumC1657a2.DEBUG, "Shutting down", new Object[0]);
        if (z) {
            return;
        }
        try {
            long flushTimeoutMillis = this.f7183c.getFlushTimeoutMillis();
            if (this.f7181a.awaitTermination(flushTimeoutMillis, TimeUnit.MILLISECONDS)) {
                return;
            }
            this.f7183c.getLogger().mo3680e(EnumC1657a2.WARNING, "Failed to shutdown the async connection async sender  within " + flushTimeoutMillis + " ms. Trying to force it now.", new Object[0]);
            this.f7181a.shutdownNow();
            if (this.f7187g != null) {
                this.f7181a.getRejectedExecutionHandler().rejectedExecution(this.f7187g, this.f7181a);
            }
        } catch (InterruptedException unused) {
            this.f7183c.getLogger().mo3680e(EnumC1657a2.DEBUG, "Thread interrupted while closing the connection.", new Object[0]);
            Thread.currentThread().interrupt();
        }
    }

    @Override // io.sentry.transport.InterfaceC2012g
    /* JADX INFO: renamed from: b */
    public final void mo4160b(long j) {
        C2019n c2019n = this.f7181a;
        c2019n.getClass();
        try {
            C1563B0 c1563b0 = c2019n.f7203e;
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            c1563b0.getClass();
            ((C2022q) c1563b0.f5600a).tryAcquireSharedNanos(1, timeUnit.toNanos(j));
        } catch (InterruptedException e) {
            c2019n.f7201c.mo3683r(EnumC1657a2.ERROR, "Failed to wait till idle", e);
            Thread.currentThread().interrupt();
        }
    }

    @Override // io.sentry.transport.InterfaceC2012g
    /* JADX INFO: renamed from: c */
    public final C2021p mo4161c() {
        return this.f7184d;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        mo4159a(false);
    }

    @Override // io.sentry.transport.InterfaceC2012g
    /* JADX INFO: renamed from: e */
    public final boolean mo4162e() {
        boolean z;
        C2021p c2021p = this.f7184d;
        c2021p.getClass();
        c2021p.f7204a.getClass();
        Date date = new Date(System.currentTimeMillis());
        ConcurrentHashMap concurrentHashMap = c2021p.f7206c;
        Iterator it = concurrentHashMap.keySet().iterator();
        while (true) {
            if (!it.hasNext()) {
                z = false;
                break;
            }
            Date date2 = (Date) concurrentHashMap.get((EnumC1929n) it.next());
            if (date2 != null && !date.after(date2)) {
                z = true;
                break;
            }
        }
        C2019n c2019n = this.f7181a;
        AbstractC1588H1 abstractC1588H1 = c2019n.f7200b;
        return (z || (abstractC1588H1 != null && (c2019n.f7202d.mo3603a().mo3670b(abstractC1588H1) > 2000000000L ? 1 : (c2019n.f7202d.mo3603a().mo3670b(abstractC1588H1) == 2000000000L ? 0 : -1)) < 0)) ? false : true;
    }

    @Override // io.sentry.transport.InterfaceC2012g
    /* JADX INFO: renamed from: j */
    public final void mo4163j(C1901c c1901c, C1586H c1586h) {
        InterfaceC1839d interfaceC1839d;
        boolean z;
        C1901c c1901cMo4044g;
        EnumC1929n enumC1929n;
        Iterable<C1620P1> iterable = (Iterable) c1901c.f6782c;
        boolean zM4075v = AbstractC1856a.m4075v(c1586h, InterfaceC1886d.class);
        C2046v2 c2046v2 = this.f7183c;
        InterfaceC1839d interfaceC1839d2 = this.f7182b;
        if (zM4075v) {
            c2046v2.getLogger().mo3680e(EnumC1657a2.DEBUG, "Captured Envelope is already cached", new Object[0]);
            interfaceC1839d = C2014i.f7194a;
            z = true;
        } else {
            interfaceC1839d = interfaceC1839d2;
            z = false;
        }
        C2021p c2021p = this.f7184d;
        C2046v2 c2046v22 = c2021p.f7205b;
        ArrayList arrayList = null;
        for (C1620P1 c1620p1 : iterable) {
            String itemType = c1620p1.f5822a.f5834e.getItemType();
            itemType.getClass();
            switch (itemType) {
                case "attachment":
                    enumC1929n = EnumC1929n.Attachment;
                    break;
                case "replay_video":
                    enumC1929n = EnumC1929n.Replay;
                    break;
                case "profile_chunk":
                    enumC1929n = EnumC1929n.ProfileChunkUi;
                    break;
                case "profile":
                    enumC1929n = EnumC1929n.Profile;
                    break;
                case "feedback":
                    enumC1929n = EnumC1929n.Feedback;
                    break;
                case "log":
                    enumC1929n = EnumC1929n.LogItem;
                    break;
                case "event":
                    enumC1929n = EnumC1929n.Error;
                    break;
                case "check_in":
                    enumC1929n = EnumC1929n.Monitor;
                    break;
                case "session":
                    enumC1929n = EnumC1929n.Session;
                    break;
                case "transaction":
                    enumC1929n = EnumC1929n.Transaction;
                    break;
                default:
                    enumC1929n = EnumC1929n.Unknown;
                    break;
            }
            if (c2021p.m4170f(enumC1929n)) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(c1620p1);
                c2046v22.getClientReportRecorder().mo4043f(EnumC1853d.RATELIMIT_BACKOFF, c1620p1);
            }
        }
        if (arrayList != null) {
            c2046v22.getLogger().mo3680e(EnumC1657a2.WARNING, "%d envelope items will be dropped due rate limiting.", Integer.valueOf(arrayList.size()));
            ArrayList arrayList2 = new ArrayList();
            for (C1620P1 c1620p12 : iterable) {
                if (!arrayList.contains(c1620p12)) {
                    arrayList2.add(c1620p12);
                }
            }
            if (arrayList2.isEmpty()) {
                c2046v22.getLogger().mo3680e(EnumC1657a2.WARNING, "Envelope discarded due all items rate limited.", new Object[0]);
                Object objM4072s = AbstractC1856a.m4072s(c1586h);
                if (InterfaceC1892j.class.isInstance(AbstractC1856a.m4072s(c1586h)) && objM4072s != null) {
                    ((InterfaceC1892j) objM4072s).mo3847b(false);
                }
                Object objM4072s2 = AbstractC1856a.m4072s(c1586h);
                if (InterfaceC1889g.class.isInstance(AbstractC1856a.m4072s(c1586h)) && objM4072s2 != null) {
                    ((InterfaceC1889g) objM4072s2).mo3850e(false);
                }
                Object objM4072s3 = AbstractC1856a.m4072s(c1586h);
                if (AbstractC1885c.class.isInstance(AbstractC1856a.m4072s(c1586h)) && objM4072s3 != null) {
                    ((AbstractC1885c) objM4072s3).f6761a.countDown();
                    c2046v22.getLogger().mo3680e(EnumC1657a2.DEBUG, "Disk flush envelope fired due to rate limit", new Object[0]);
                }
                c1901cMo4044g = null;
            } else {
                c1901cMo4044g = new C1901c((C1596J1) c1901c.f6781b, arrayList2);
            }
        } else {
            c1901cMo4044g = c1901c;
        }
        if (c1901cMo4044g == null) {
            if (z) {
                interfaceC1839d2.mo4011p(c1901c);
                return;
            }
            return;
        }
        if (C1628R2.class.isInstance(AbstractC1856a.m4072s(c1586h))) {
            c1901cMo4044g = c2046v2.getClientReportRecorder().mo4044g(c1901cMo4044g);
        }
        Future futureSubmit = this.f7181a.submit(new RunnableC2007b(this, c1901cMo4044g, c1586h, interfaceC1839d));
        if (futureSubmit != null && futureSubmit.isCancelled()) {
            c2046v2.getClientReportRecorder().mo4040a(EnumC1853d.QUEUE_OVERFLOW, c1901cMo4044g);
            return;
        }
        Object objM4072s4 = AbstractC1856a.m4072s(c1586h);
        if (!C2043v.class.isInstance(AbstractC1856a.m4072s(c1586h)) || objM4072s4 == null) {
            return;
        }
        C2043v c2043v = (C2043v) objM4072s4;
        c2043v.f7238g.add(c2043v.f7237f);
        c2046v2.getLogger().mo3680e(EnumC1657a2.DEBUG, "Envelope enqueued", new Object[0]);
    }
}
