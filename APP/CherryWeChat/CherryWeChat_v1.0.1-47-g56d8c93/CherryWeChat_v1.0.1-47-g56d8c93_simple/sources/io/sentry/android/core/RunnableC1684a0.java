package io.sentry.android.core;

import android.content.Context;
import android.content.IntentFilter;
import android.os.Build;
import android.os.Handler;
import android.os.HandlerThread;
import io.sentry.C1863d1;
import io.sentry.C1867e1;
import io.sentry.C1981r;
import io.sentry.C2046v2;
import io.sentry.EnumC1606M;
import io.sentry.EnumC1657a2;
import io.sentry.EnumC1929n;
import io.sentry.InterfaceC1614O;
import io.sentry.InterfaceC1651Z;
import io.sentry.config.AbstractC1856a;
import io.sentry.transport.C2021p;
import java.util.ArrayList;
import java.util.Iterator;
import p000.C0252Fu;
import p000.C1542id;

/* JADX INFO: renamed from: io.sentry.android.core.a0 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RunnableC1684a0 implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f6082a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f6083b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Object f6084c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ Object f6085d;

    public /* synthetic */ RunnableC1684a0(SystemEventsBreadcrumbsIntegration r2, InterfaceC1651Z r3, SentryAndroidOptions r4) {
        this.f6082a = 4;
        this.f6083b = r2;
        this.f6085d = r3;
        this.f6084c = r4;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch(this.f6082a) {
            case 0: goto L80;
            case 1: goto L74;
            case 2: goto L53;
            case 3: goto L39;
            default: goto L4;
        };
    L4:
        SystemEventsBreadcrumbsIntegration r0 = (SystemEventsBreadcrumbsIntegration) this.f6083b;
        InterfaceC1651Z r1 = (InterfaceC1651Z) this.f6085d;
        SentryAndroidOptions r2 = (SentryAndroidOptions) this.f6084c;
        C1981r r3 = r0.f6036k.m4173a();
    L17:
        th = move-exception;
        r3.close();     // Catch: Throwable -> L36
        throw th;
    L36:
        th = move-exception;
        th.addSuppressed(th);
        throw th;
    L6:
        if (r0.f6031f == false) goto L8;
    L32:
        r3.close();
        return;
    L8:
        if (r0.f6032g == true) goto L32;
        if (r0.f6027b != null) goto L32;
        r0.f6027b = new C1699h0(r0, r1, r2);     // Catch: Throwable -> L17
        if (r0.f6033h != null) goto L20;
        r0.f6033h = new IntentFilter();     // Catch: Throwable -> L17
        String[] r12 = r0.f6030e;     // Catch: Throwable -> L17
        int r5 = r12.length;     // Catch: Throwable -> L17
        int r6 = 0;
    L15:
        if (r6 >= r5) goto L20;
        r0.f6033h.addAction(r12[r6]);     // Catch: Throwable -> L17
        r6 = r6 + 1;     // Catch: Throwable -> L17
    L20:
        if (r0.f6034i != null) goto L109;
        r0.f6034i = new HandlerThread("SystemEventsReceiver", 10);     // Catch: Throwable -> L17
        r0.f6034i.start();     // Catch: Throwable -> L17
    L109:
        Handler r9 = new Handler(r0.f6034i.getLooper());     // Catch: Throwable -> L30
        Context r52 = r0.f6026a;     // Catch: Throwable -> L30
        C1699h0 r62 = r0.f6027b;     // Catch: Throwable -> L30
        IntentFilter r7 = r0.f6033h;     // Catch: Throwable -> L30
        AbstractC1856a.m4048D("The ILogger object is required.", r2.getLogger());     // Catch: Throwable -> L30
        if (Build.VERSION.SDK_INT < 33) goto L25;
        r52.registerReceiver(r62, r7, null, r9, 4);     // Catch: Throwable -> L30
    L27:
        if (r0.f6035j.getAndSet(true) == true) goto L32;
        r2.getLogger().mo3680e(EnumC1657a2.DEBUG, "SystemEventsBreadcrumbsIntegration installed.", new Object[0]);     // Catch: Throwable -> L30
        AbstractC1856a.m4055a("SystemEventsBreadcrumbs");     // Catch: Throwable -> L30
    L25:
        r52.registerReceiver(r62, r7, null, r9);     // Catch: Throwable -> L30
    L30:
        th = move-exception;
        r2.setEnableSystemEventBreadcrumbs(false);     // Catch: Throwable -> L17
        r2.getLogger().mo3683r(EnumC1657a2.ERROR, "Failed to initialize SystemEventsBreadcrumbsIntegration.", th);     // Catch: Throwable -> L17
        goto L32
    L39:
        EnvelopeFileObserverIntegration r02 = (EnvelopeFileObserverIntegration) this.f6083b;
        C2046v2 r13 = (C2046v2) this.f6084c;
        String r22 = (String) this.f6085d;
        C1981r r32 = r02.f5967d.m4173a();
    L44:
        th = move-exception;
        r32.close();     // Catch: Throwable -> L50
        throw th;
    L50:
        th = move-exception;
        th.addSuppressed(th);
        throw th;
    L41:
        if (r02.f5966c == true) goto L46;
        r02.m3814d(r13, r22);     // Catch: Throwable -> L44
    L46:
        r32.close();
        return;
    L53:
        C1696g r03 = (C1696g) this.f6083b;
        C2046v2 r8 = (C2046v2) this.f6084c;
        InterfaceC1651Z r14 = (InterfaceC1651Z) this.f6085d;
        ArrayList r92 = r03.f6132m;
        if (r03.f6135p.get() == true) goto L68;
        ArrayList r10 = new ArrayList(r92.size());
        C1981r r11 = r03.f6142w.m4173a();
        Iterator r04 = r92.iterator();     // Catch: Throwable -> L61
    L59:
        if (r04.hasNext() == false) goto L63;
        C1863d1 r23 = (C1863d1) r04.next();     // Catch: Throwable -> L61
        r10.add(new C1867e1(r23.f6682a, r23.f6683b, r23.f6685d, r23.f6684c, Double.valueOf(r23.f6686e), r8));     // Catch: Throwable -> L61
        goto L59
    L63:
        r92.clear();     // Catch: Throwable -> L61
        r11.close();
        Iterator r05 = r10.iterator();
    L66:
        if (r05.hasNext() == false) goto L128;
        r14.mo3714h((C1867e1) r05.next());
        goto L66
    L128:
        return;
    L61:
        th = move-exception;
        r11.close();     // Catch: Throwable -> L71
        throw th;
    L71:
        th = move-exception;
        th.addSuppressed(th);
        throw th;
    L68:
        return;
    L74:
        C0252Fu r06 = (C0252Fu) this.f6083b;
        Runnable r15 = (Runnable) this.f6084c;
        String r24 = (String) this.f6085d;
        r06.getClass();
        r15.run();     // Catch: Throwable -> L77
        return;
    L77:
        if (r24 == null) goto L130;
        ((SentryAndroidOptions) r06.f820b).getLogger().mo3680e(EnumC1657a2.WARNING, "Failed to execute ".concat(r24), new Object[0]);
        return;
    L130:
        return;
    L80:
        SendCachedEnvelopeIntegration r07 = (SendCachedEnvelopeIntegration) this.f6083b;
        SentryAndroidOptions r16 = (SentryAndroidOptions) this.f6084c;
        InterfaceC1651Z r25 = (InterfaceC1651Z) this.f6085d;
    L84:
        th = move-exception;
        r16.getLogger().mo3683r(EnumC1657a2.ERROR, "Failed trying to send cached events.", th);
        return;
    L82:
        if (r07.f6020i.get() == false) goto L87;
        r16.getLogger().mo3680e(EnumC1657a2.INFO, "SendCachedEnvelopeIntegration, not trying to send after closing.", new Object[0]);     // Catch: Throwable -> L84
        return;
    L87:
        if (r07.f6019h.getAndSet(true) == true) goto L89;
        InterfaceC1614O r33 = r16.getConnectionStatusProvider();     // Catch: Throwable -> L84
        r07.f6015d = r33;     // Catch: Throwable -> L84
        r33.mo3685h(r07);     // Catch: Throwable -> L84
        r07.f6018g = r07.f6012a.m4226a(r25, r16);     // Catch: Throwable -> L84
    L89:
        InterfaceC1614O r34 = r07.f6015d;     // Catch: Throwable -> L84
        if (r34 != null) goto L92;
    L94:
        C2021p r26 = r25.mo3709c();     // Catch: Throwable -> L84
        if (r26 != null) goto L97;
    L99:
        C1542id r08 = r07.f6018g;     // Catch: Throwable -> L84
        if (r08 != null) goto L102;
        r16.getLogger().mo3680e(EnumC1657a2.ERROR, "SendCachedEnvelopeIntegration factory is null.", new Object[0]);     // Catch: Throwable -> L84
        return;
    L102:
        r08.m2956a();     // Catch: Throwable -> L84
        return;
    L97:
        if (r26.m4170f(EnumC1929n.All) == false) goto L99;
        r16.getLogger().mo3680e(EnumC1657a2.INFO, "SendCachedEnvelopeIntegration, rate limiting active.", new Object[0]);     // Catch: Throwable -> L84
        return;
    L92:
        if (r34.mo3684g() != EnumC1606M.DISCONNECTED) goto L94;
        r16.getLogger().mo3680e(EnumC1657a2.INFO, "SendCachedEnvelopeIntegration, no connection.", new Object[0]);     // Catch: Throwable -> L84
    }

    public /* synthetic */ RunnableC1684a0(Object r1, Object r2, Object r3, int r4) {
        this.f6082a = r4;
        this.f6083b = r1;
        this.f6084c = r2;
        this.f6085d = r3;
    }
}
