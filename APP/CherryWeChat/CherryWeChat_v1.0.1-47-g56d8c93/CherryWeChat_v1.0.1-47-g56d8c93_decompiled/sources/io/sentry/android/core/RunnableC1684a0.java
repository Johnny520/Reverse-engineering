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

    public /* synthetic */ RunnableC1684a0(SystemEventsBreadcrumbsIntegration systemEventsBreadcrumbsIntegration, InterfaceC1651Z interfaceC1651Z, SentryAndroidOptions sentryAndroidOptions) {
        this.f6082a = 4;
        this.f6083b = systemEventsBreadcrumbsIntegration;
        this.f6085d = interfaceC1651Z;
        this.f6084c = sentryAndroidOptions;
    }

    /* JADX WARN: Finally extract failed */
    @Override // java.lang.Runnable
    public final void run() {
        C1981r c1981rM4173a;
        switch (this.f6082a) {
            case 0:
                SendCachedEnvelopeIntegration sendCachedEnvelopeIntegration = (SendCachedEnvelopeIntegration) this.f6083b;
                SentryAndroidOptions sentryAndroidOptions = (SentryAndroidOptions) this.f6084c;
                InterfaceC1651Z interfaceC1651Z = (InterfaceC1651Z) this.f6085d;
                try {
                    if (sendCachedEnvelopeIntegration.f6020i.get()) {
                        sentryAndroidOptions.getLogger().mo3680e(EnumC1657a2.INFO, "SendCachedEnvelopeIntegration, not trying to send after closing.", new Object[0]);
                        return;
                    }
                    if (!sendCachedEnvelopeIntegration.f6019h.getAndSet(true)) {
                        InterfaceC1614O connectionStatusProvider = sentryAndroidOptions.getConnectionStatusProvider();
                        sendCachedEnvelopeIntegration.f6015d = connectionStatusProvider;
                        connectionStatusProvider.mo3685h(sendCachedEnvelopeIntegration);
                        sendCachedEnvelopeIntegration.f6018g = sendCachedEnvelopeIntegration.f6012a.m4226a(interfaceC1651Z, sentryAndroidOptions);
                    }
                    InterfaceC1614O interfaceC1614O = sendCachedEnvelopeIntegration.f6015d;
                    if (interfaceC1614O != null && interfaceC1614O.mo3684g() == EnumC1606M.DISCONNECTED) {
                        sentryAndroidOptions.getLogger().mo3680e(EnumC1657a2.INFO, "SendCachedEnvelopeIntegration, no connection.", new Object[0]);
                        return;
                    }
                    C2021p c2021pMo3709c = interfaceC1651Z.mo3709c();
                    if (c2021pMo3709c != null && c2021pMo3709c.m4170f(EnumC1929n.All)) {
                        sentryAndroidOptions.getLogger().mo3680e(EnumC1657a2.INFO, "SendCachedEnvelopeIntegration, rate limiting active.", new Object[0]);
                        return;
                    }
                    C1542id c1542id = sendCachedEnvelopeIntegration.f6018g;
                    if (c1542id == null) {
                        sentryAndroidOptions.getLogger().mo3680e(EnumC1657a2.ERROR, "SendCachedEnvelopeIntegration factory is null.", new Object[0]);
                        return;
                    } else {
                        c1542id.m2956a();
                        return;
                    }
                } catch (Throwable th) {
                    sentryAndroidOptions.getLogger().mo3683r(EnumC1657a2.ERROR, "Failed trying to send cached events.", th);
                    return;
                }
            case 1:
                C0252Fu c0252Fu = (C0252Fu) this.f6083b;
                Runnable runnable = (Runnable) this.f6084c;
                String str = (String) this.f6085d;
                c0252Fu.getClass();
                try {
                    runnable.run();
                    return;
                } catch (Throwable unused) {
                    if (str != null) {
                        ((SentryAndroidOptions) c0252Fu.f820b).getLogger().mo3680e(EnumC1657a2.WARNING, "Failed to execute ".concat(str), new Object[0]);
                        return;
                    }
                    return;
                }
            case 2:
                C1696g c1696g = (C1696g) this.f6083b;
                C2046v2 c2046v2 = (C2046v2) this.f6084c;
                InterfaceC1651Z interfaceC1651Z2 = (InterfaceC1651Z) this.f6085d;
                ArrayList<C1863d1> arrayList = c1696g.f6132m;
                if (c1696g.f6135p.get()) {
                    return;
                }
                ArrayList arrayList2 = new ArrayList(arrayList.size());
                C1981r c1981rM4173a2 = c1696g.f6142w.m4173a();
                try {
                    for (C1863d1 c1863d1 : arrayList) {
                        arrayList2.add(new C1867e1(c1863d1.f6682a, c1863d1.f6683b, c1863d1.f6685d, c1863d1.f6684c, Double.valueOf(c1863d1.f6686e), c2046v2));
                    }
                    arrayList.clear();
                    c1981rM4173a2.close();
                    Iterator it = arrayList2.iterator();
                    while (it.hasNext()) {
                        interfaceC1651Z2.mo3714h((C1867e1) it.next());
                    }
                    return;
                } catch (Throwable th2) {
                }
            case 3:
                EnvelopeFileObserverIntegration envelopeFileObserverIntegration = (EnvelopeFileObserverIntegration) this.f6083b;
                C2046v2 c2046v22 = (C2046v2) this.f6084c;
                String str2 = (String) this.f6085d;
                c1981rM4173a = envelopeFileObserverIntegration.f5967d.m4173a();
                try {
                    if (!envelopeFileObserverIntegration.f5966c) {
                        envelopeFileObserverIntegration.m3814d(c2046v22, str2);
                        break;
                    }
                    c1981rM4173a.close();
                    return;
                } finally {
                    try {
                        c1981rM4173a.close();
                        throw th;
                    } catch (Throwable th3) {
                        th.addSuppressed(th3);
                    }
                }
            default:
                SystemEventsBreadcrumbsIntegration systemEventsBreadcrumbsIntegration = (SystemEventsBreadcrumbsIntegration) this.f6083b;
                InterfaceC1651Z interfaceC1651Z3 = (InterfaceC1651Z) this.f6085d;
                SentryAndroidOptions sentryAndroidOptions2 = (SentryAndroidOptions) this.f6084c;
                c1981rM4173a = systemEventsBreadcrumbsIntegration.f6036k.m4173a();
                try {
                    if (!systemEventsBreadcrumbsIntegration.f6031f && !systemEventsBreadcrumbsIntegration.f6032g && systemEventsBreadcrumbsIntegration.f6027b == null) {
                        systemEventsBreadcrumbsIntegration.f6027b = new C1699h0(systemEventsBreadcrumbsIntegration, interfaceC1651Z3, sentryAndroidOptions2);
                        if (systemEventsBreadcrumbsIntegration.f6033h == null) {
                            systemEventsBreadcrumbsIntegration.f6033h = new IntentFilter();
                            for (String str3 : systemEventsBreadcrumbsIntegration.f6030e) {
                                systemEventsBreadcrumbsIntegration.f6033h.addAction(str3);
                            }
                        }
                        if (systemEventsBreadcrumbsIntegration.f6034i == null) {
                            systemEventsBreadcrumbsIntegration.f6034i = new HandlerThread("SystemEventsReceiver", 10);
                            systemEventsBreadcrumbsIntegration.f6034i.start();
                        }
                        try {
                            Handler handler = new Handler(systemEventsBreadcrumbsIntegration.f6034i.getLooper());
                            Context context = systemEventsBreadcrumbsIntegration.f6026a;
                            C1699h0 c1699h0 = systemEventsBreadcrumbsIntegration.f6027b;
                            IntentFilter intentFilter = systemEventsBreadcrumbsIntegration.f6033h;
                            AbstractC1856a.m4048D("The ILogger object is required.", sentryAndroidOptions2.getLogger());
                            if (Build.VERSION.SDK_INT >= 33) {
                                context.registerReceiver(c1699h0, intentFilter, null, handler, 4);
                            } else {
                                context.registerReceiver(c1699h0, intentFilter, null, handler);
                            }
                            if (!systemEventsBreadcrumbsIntegration.f6035j.getAndSet(true)) {
                                sentryAndroidOptions2.getLogger().mo3680e(EnumC1657a2.DEBUG, "SystemEventsBreadcrumbsIntegration installed.", new Object[0]);
                                AbstractC1856a.m4055a("SystemEventsBreadcrumbs");
                            }
                        } catch (Throwable th4) {
                            sentryAndroidOptions2.setEnableSystemEventBreadcrumbs(false);
                            sentryAndroidOptions2.getLogger().mo3683r(EnumC1657a2.ERROR, "Failed to initialize SystemEventsBreadcrumbsIntegration.", th4);
                        }
                        break;
                    }
                    c1981rM4173a.close();
                    return;
                } finally {
                }
        }
    }

    public /* synthetic */ RunnableC1684a0(Object obj, Object obj2, Object obj3, int i) {
        this.f6082a = i;
        this.f6083b = obj;
        this.f6084c = obj2;
        this.f6085d = obj3;
    }
}
