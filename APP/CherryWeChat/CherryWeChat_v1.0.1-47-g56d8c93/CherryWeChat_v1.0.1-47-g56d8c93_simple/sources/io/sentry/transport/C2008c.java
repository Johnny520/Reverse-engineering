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
    public C2008c(C2046v2 r8, C2021p r9, InterfaceC2013h r10, C1901c r11) {
        int r1 = r8.getMaxQueueSize();
        final InterfaceC1839d r0 = r8.getEnvelopeDiskCache();
        final ILogger r4 = r8.getLogger();
        InterfaceC1592I1 r5 = r8.getDateProvider();
        ?? r3 = new RejectedExecutionHandlerC2006a(r0, r4);
        C2019n r02 = new C2019n(r1, new ThreadFactoryC1594J(4), r3, r4, r5);
        C2010e r12 = new C2010e(r8, r11, r9);
        this.f7187g = null;
        this.f7181a = r02;
        InterfaceC1839d r112 = r8.getEnvelopeDiskCache();
        AbstractC1856a.m4048D("envelopeCache is required", r112);
        this.f7182b = r112;
        this.f7183c = r8;
        this.f7184d = r9;
        AbstractC1856a.m4048D("transportGate is required", r10);
        this.f7185e = r10;
        this.f7186f = r12;
    }

    @Override // io.sentry.transport.InterfaceC2012g
    /* JADX INFO: renamed from: a */
    public final void mo4159a(boolean r7) {
        this.f7184d.close();
        this.f7181a.shutdown();
        this.f7183c.getLogger().mo3680e(EnumC1657a2.DEBUG, "Shutting down", new Object[0]);
        if (r7 == true) goto L14;
        long r1 = this.f7183c.getFlushTimeoutMillis();     // Catch: InterruptedException -> L10
        if (this.f7181a.awaitTermination(r1, TimeUnit.MILLISECONDS) == true) goto L15;
        this.f7183c.getLogger().mo3680e(EnumC1657a2.WARNING, "Failed to shutdown the async connection async sender  within " + r1 + " ms. Trying to force it now.", new Object[0]);     // Catch: InterruptedException -> L10
        this.f7181a.shutdownNow();     // Catch: InterruptedException -> L10
        if (this.f7187g == null) goto L16;
        this.f7181a.getRejectedExecutionHandler().rejectedExecution(this.f7187g, this.f7181a);     // Catch: InterruptedException -> L10
        return;
    L16:
        return;
    L15:
        return;
    L10:
        this.f7183c.getLogger().mo3680e(EnumC1657a2.DEBUG, "Thread interrupted while closing the connection.", new Object[0]);
        Thread.currentThread().interrupt();
        return;
    }

    @Override // io.sentry.transport.InterfaceC2012g
    /* JADX INFO: renamed from: b */
    public final void mo4160b(long r4) {
        C2019n r0 = this.f7181a;
        r0.getClass();
        C1563B0 r1 = r0.f7203e;     // Catch: InterruptedException -> L5
        TimeUnit r2 = TimeUnit.MILLISECONDS;     // Catch: InterruptedException -> L5
        r1.getClass();     // Catch: InterruptedException -> L5
        ((C2022q) r1.f5600a).tryAcquireSharedNanos(1, r2.toNanos(r4));     // Catch: InterruptedException -> L5
        return;
    L5:
        e = move-exception;
        r0.f7201c.mo3683r(EnumC1657a2.ERROR, "Failed to wait till idle", e);
        Thread.currentThread().interrupt();
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
        C2021p r0 = this.f7184d;
        r0.getClass();
        r0.f7204a.getClass();
        Date r1 = new Date(System.currentTimeMillis());
        ConcurrentHashMap r02 = r0.f7206c;
        Iterator r2 = r02.keySet().iterator();
    L4:
        if (r2.hasNext() == false) goto L10;
        Date r3 = (Date) r02.get((EnumC1929n) r2.next());
        if (r3 == null) goto L4;
        if (r1.after(r3) == true) goto L4;
        boolean r03 = true;
    L11:
        C2019n r12 = this.f7181a;
        AbstractC1588H1 r22 = r12.f7200b;
        if (r22 != null) goto L15;
    L13:
        boolean r13 = false;
    L17:
        if (r03 == true) goto L20;
        if (r13 == true) goto L20;
        return true;
    L20:
        return false;
    L15:
        if (r12.f7202d.mo3603a().mo3670b(r22) >= 2000000000) goto L13;
        r13 = true;
        goto L17
    L10:
        r03 = false;
        goto L11
    }

    @Override // io.sentry.transport.InterfaceC2012g
    /* JADX INFO: renamed from: j */
    public final void mo4163j(C1901c r19, C1586H r20) {
        Iterable r3 = (Iterable) r19.f6782c;
        boolean r4 = AbstractC1856a.m4075v(r20, InterfaceC1886d.class);
        C2046v2 r6 = this.f7183c;
        InterfaceC1839d r7 = this.f7182b;
        if (r4 == false) goto L5;
        r6.getLogger().mo3680e(EnumC1657a2.DEBUG, "Captured Envelope is already cached", new Object[0]);
        InterfaceC1839d r42 = C2014i.f7194a;
        boolean r9 = true;
    L6:
        C2021p r10 = this.f7184d;
        C2046v2 r11 = r10.f7205b;
        Iterator r12 = r3.iterator();
        ArrayList r14 = null;
    L8:
        if (r12.hasNext() == false) goto L69;
        C1620P1 r15 = (C1620P1) r12.next();
        String r5 = r15.f5822a.f5834e.getItemType();
        r5.getClass();
        byte r17 = -1;
        switch(r5.hashCode()) {
            case -1963501277: goto L49;
            case -1639516637: goto L45;
            case -729715625: goto L41;
            case -309425751: goto L37;
            case -191501435: goto L33;
            case 107332: goto L29;
            case 96891546: goto L25;
            case 1536888764: goto L21;
            case 1984987798: goto L17;
            case 2141246174: goto L13;
            default: goto L52;
        };
    L52:
        switch(r17) {
            case 0: goto L63;
            case 1: goto L62;
            case 2: goto L61;
            case 3: goto L60;
            case 4: goto L59;
            case 5: goto L58;
            case 6: goto L57;
            case 7: goto L56;
            case 8: goto L55;
            case 9: goto L54;
            default: goto L53;
        };
    L53:
        EnumC1929n r52 = EnumC1929n.Unknown;
    L65:
        if (r10.m4170f(r52) == false) goto L8;
        if (r14 != null) goto L68;
        r14 = new ArrayList();
    L68:
        r14.add(r15);
        r11.getClientReportRecorder().mo4043f(EnumC1853d.RATELIMIT_BACKOFF, r15);
        goto L8
    L54:
        r52 = EnumC1929n.Transaction;
        goto L65
    L55:
        r52 = EnumC1929n.Session;
        goto L65
    L56:
        r52 = EnumC1929n.Monitor;
        goto L65
    L57:
        r52 = EnumC1929n.Error;
        goto L65
    L58:
        r52 = EnumC1929n.LogItem;
        goto L65
    L59:
        r52 = EnumC1929n.Feedback;
        goto L65
    L60:
        r52 = EnumC1929n.Profile;
        goto L65
    L61:
        r52 = EnumC1929n.ProfileChunkUi;
        goto L65
    L62:
        r52 = EnumC1929n.Replay;
        goto L65
    L63:
        r52 = EnumC1929n.Attachment;
        goto L65
    L13:
        if (r5.equals("transaction") == false) goto L52;
        r17 = 9;
        goto L52
    L17:
        if (r5.equals("session") == false) goto L52;
        r17 = 8;
        goto L52
    L21:
        if (r5.equals("check_in") == false) goto L52;
        r17 = 7;
        goto L52
    L25:
        if (r5.equals("event") == false) goto L52;
        r17 = 6;
        goto L52
    L29:
        if (r5.equals("log") == false) goto L52;
        r17 = 5;
        goto L52
    L33:
        if (r5.equals("feedback") == false) goto L52;
        r17 = 4;
        goto L52
    L37:
        if (r5.equals("profile") == false) goto L52;
        r17 = 3;
        goto L52
    L41:
        if (r5.equals("profile_chunk") == false) goto L52;
        r17 = 2;
        goto L52
    L45:
        if (r5.equals("replay_video") == false) goto L52;
        r17 = 1;
        goto L52
    L49:
        if (r5.equals("attachment") == false) goto L52;
        r17 = 0;
        goto L52
    L69:
        if (r14 == null) goto L92;
        r11.getLogger().mo3680e(EnumC1657a2.WARNING, "%d envelope items will be dropped due rate limiting.", new Object[]{Integer.valueOf(r14.size())});
        ArrayList r53 = new ArrayList();
        Iterator r32 = r3.iterator();
    L72:
        if (r32.hasNext() == false) goto L77;
        C1620P1 r102 = (C1620P1) r32.next();
        if (r14.contains(r102) == true) goto L72;
        r53.add(r102);
        goto L72
    L77:
        if (r53.isEmpty() == false) goto L91;
        r11.getLogger().mo3680e(EnumC1657a2.WARNING, "Envelope discarded due all items rate limited.", new Object[0]);
        Object r33 = AbstractC1856a.m4072s(r20);
        if (InterfaceC1892j.class.isInstance(AbstractC1856a.m4072s(r20)) == false) goto L82;
        if (r33 == null) goto L82;
        ((InterfaceC1892j) r33).mo3847b(false);
    L82:
        Object r34 = AbstractC1856a.m4072s(r20);
        if (InterfaceC1889g.class.isInstance(AbstractC1856a.m4072s(r20)) == false) goto L86;
        if (r34 == null) goto L86;
        ((InterfaceC1889g) r34).mo3850e(false);
    L86:
        Object r35 = AbstractC1856a.m4072s(r20);
        if (AbstractC1885c.class.isInstance(AbstractC1856a.m4072s(r20)) == false) goto L90;
        if (r35 == null) goto L90;
        ((AbstractC1885c) r35).f6761a.countDown();
        r11.getLogger().mo3680e(EnumC1657a2.DEBUG, "Disk flush envelope fired due to rate limit", new Object[0]);
    L90:
        C1901c r13 = null;
    L93:
        if (r13 != null) goto L98;
        if (r9 == false) goto L121;
        r7.mo4011p(r19);
        return;
    L121:
        return;
    L98:
        if (C1628R2.class.isInstance(AbstractC1856a.m4072s(r20)) == false) goto L100;
        r13 = r6.getClientReportRecorder().mo4044g(r13);
    L100:
        Future r1 = this.f7181a.submit(new RunnableC2007b(this, r13, r20, r42));
        if (r1 != null) goto L103;
    L106:
        Object r16 = AbstractC1856a.m4072s(r20);
        if (C2043v.class.isInstance(AbstractC1856a.m4072s(r20)) == false) goto L122;
        if (r16 == null) goto L123;
        C2043v r18 = (C2043v) r16;
        r18.f7238g.add(r18.f7237f);
        r6.getLogger().mo3680e(EnumC1657a2.DEBUG, "Envelope enqueued", new Object[0]);
        return;
    L123:
        return;
    L122:
        return;
    L103:
        if (r1.isCancelled() == false) goto L106;
        r6.getClientReportRecorder().mo4040a(EnumC1853d.QUEUE_OVERFLOW, r13);
        return;
    L91:
        r13 = new C1901c((C1596J1) r19.f6781b, r53);
        goto L93
    L92:
        r13 = r19;
        goto L93
    L5:
        r42 = r7;
        r9 = false;
        goto L6
    }
}
