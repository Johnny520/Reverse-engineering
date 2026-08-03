package io.sentry;

import io.sentry.android.core.C1672O;
import io.sentry.android.core.C1747u;
import io.sentry.clientreport.EnumC1853d;
import io.sentry.clientreport.InterfaceC1855f;
import io.sentry.config.AbstractC1856a;
import io.sentry.exception.C1870b;
import io.sentry.hints.AbstractC1885c;
import io.sentry.hints.InterfaceC1884b;
import io.sentry.hints.InterfaceC1886d;
import io.sentry.hints.InterfaceC1893k;
import io.sentry.internal.debugmeta.C1901c;
import io.sentry.logger.C1923b;
import io.sentry.logger.C1924c;
import io.sentry.logger.InterfaceC1922a;
import io.sentry.protocol.C1944A;
import io.sentry.protocol.C1953c;
import io.sentry.protocol.C1954d;
import io.sentry.protocol.C1962l;
import io.sentry.protocol.C1964n;
import io.sentry.protocol.C1968r;
import io.sentry.protocol.C1970t;
import io.sentry.transport.C2021p;
import io.sentry.transport.InterfaceC2012g;
import io.sentry.util.AbstractC2036h;
import io.sentry.util.C2035g;
import java.io.BufferedWriter;
import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.net.URI;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.concurrent.Callable;
import java.util.concurrent.RejectedExecutionException;
import java.util.regex.Pattern;
import p000.C0698Q9;
import p000.C2438r1;
import p000.RunnableC2260n3;

/* JADX INFO: renamed from: io.sentry.F1 */
/* JADX INFO: loaded from: classes.dex */
public final class C1580F1 implements InterfaceC1826b0 {

    /* JADX INFO: renamed from: b */
    public final C2046v2 f5692b;

    /* JADX INFO: renamed from: c */
    public final InterfaceC2012g f5693c;

    /* JADX INFO: renamed from: e */
    public final InterfaceC1922a f5695e;

    /* JADX INFO: renamed from: d */
    public final C1576E1 f5694d = new C1576E1();

    /* JADX INFO: renamed from: a */
    public boolean f5691a = true;

    public C1580F1(C2046v2 c2046v2) {
        this.f5692b = c2046v2;
        InterfaceC1915k0 transportFactory = c2046v2.getTransportFactory();
        if (transportFactory instanceof C1646X0) {
            transportFactory = new C1599K0();
            c2046v2.setTransportFactory(transportFactory);
        }
        C2064z c2064zRetrieveParsedDsn = c2046v2.retrieveParsedDsn();
        String sentryClientName = c2046v2.getSentryClientName();
        URI uri = c2064zRetrieveParsedDsn.f7296c;
        String string = uri.resolve(uri.getPath() + "/envelope/").toString();
        String str = c2064zRetrieveParsedDsn.f7295b;
        String str2 = c2064zRetrieveParsedDsn.f7294a;
        StringBuilder sb = new StringBuilder("Sentry sentry_version=7,sentry_client=");
        sb.append(sentryClientName);
        sb.append(",sentry_key=");
        sb.append(str);
        sb.append((str2 == null || str2.length() <= 0) ? "" : ",sentry_secret=".concat(str2));
        String string2 = sb.toString();
        HashMap map = new HashMap();
        map.put("User-Agent", sentryClientName);
        map.put("X-Sentry-Auth", string2);
        this.f5693c = transportFactory.mo3698k(c2046v2, new C1901c(string, map));
        if (c2046v2.getLogs().f6831a) {
            this.f5695e = new C1923b(c2046v2, this);
        } else {
            this.f5695e = C1924c.f6816a;
        }
    }

    /* JADX INFO: renamed from: o */
    public static ArrayList m3642o(C1586H c1586h) {
        ArrayList arrayList = new ArrayList(c1586h.f5730b);
        C1654a c1654a = c1586h.f5732d;
        if (c1654a != null) {
            arrayList.add(c1654a);
        }
        C1654a c1654a2 = c1586h.f5733e;
        if (c1654a2 != null) {
            arrayList.add(c1654a2);
        }
        C1654a c1654a3 = c1586h.f5734f;
        if (c1654a3 != null) {
            arrayList.add(c1654a3);
        }
        return arrayList;
    }

    @Override // io.sentry.InterfaceC1826b0
    /* JADX INFO: renamed from: a */
    public final void mo3643a(boolean z) {
        long shutdownTimeoutMillis;
        C2046v2 c2046v2 = this.f5692b;
        c2046v2.getLogger().mo3680e(EnumC1657a2.INFO, "Closing SentryClient.", new Object[0]);
        if (z) {
            shutdownTimeoutMillis = 0;
        } else {
            try {
                shutdownTimeoutMillis = c2046v2.getShutdownTimeoutMillis();
            } catch (IOException e) {
                c2046v2.getLogger().mo3683r(EnumC1657a2.WARNING, "Failed to close the connection to the Sentry Server.", e);
            }
        }
        mo3644b(shutdownTimeoutMillis);
        this.f5695e.mo4142a(z);
        this.f5693c.mo4159a(z);
        for (InterfaceC1566C interfaceC1566C : c2046v2.getEventProcessors()) {
            if (interfaceC1566C instanceof Closeable) {
                try {
                    ((Closeable) interfaceC1566C).close();
                } catch (IOException e2) {
                    c2046v2.getLogger().mo3680e(EnumC1657a2.WARNING, "Failed to close the event processor {}.", interfaceC1566C, e2);
                }
            }
        }
        this.f5691a = false;
    }

    @Override // io.sentry.InterfaceC1826b0
    /* JADX INFO: renamed from: b */
    public final void mo3644b(long j) {
        this.f5695e.mo4143b(j);
        this.f5693c.mo4160b(j);
    }

    @Override // io.sentry.InterfaceC1826b0
    /* JADX INFO: renamed from: c */
    public final C2021p mo3645c() {
        return this.f5693c.mo4161c();
    }

    @Override // io.sentry.InterfaceC1826b0
    /* JADX INFO: renamed from: d */
    public final void mo3646d(C1581F2 c1581f2, C1586H c1586h) {
        AbstractC1856a.m4048D("Session is required.", c1581f2);
        String str = c1581f2.f5708m;
        C2046v2 c2046v2 = this.f5692b;
        if (str == null || str.isEmpty()) {
            c2046v2.getLogger().mo3680e(EnumC1657a2.WARNING, "Sessions can't be captured without setting a release.", new Object[0]);
            return;
        }
        try {
            InterfaceC1866e0 serializer = c2046v2.getSerializer();
            C1968r sdkVersion = c2046v2.getSdkVersion();
            AbstractC1856a.m4048D("Serializer is required.", serializer);
            mo3649g(new C1901c((C1970t) null, sdkVersion, C1620P1.m3730d(serializer, c1581f2)), c1586h);
        } catch (IOException e) {
            c2046v2.getLogger().mo3683r(EnumC1657a2.ERROR, "Failed to capture session.", e);
        }
    }

    @Override // io.sentry.InterfaceC1826b0
    /* JADX INFO: renamed from: e */
    public final boolean mo3647e() {
        return this.f5693c.mo4162e();
    }

    @Override // io.sentry.InterfaceC1826b0
    /* JADX INFO: renamed from: f */
    public final C1970t mo3648f(C2059x2 c2059x2, InterfaceC1645X interfaceC1645X, C1586H c1586h) {
        if (m3661t(c2059x2, c1586h)) {
            C1964n c1964n = c2059x2.f5607d;
            C1953c c1953c = c2059x2.f5605b;
            if (c1964n == null) {
                c2059x2.f5607d = interfaceC1645X.mo3762a();
            }
            if (c2059x2.f5612i == null) {
                c2059x2.f5612i = interfaceC1645X.mo3751A();
            }
            if (c2059x2.f5608e == null) {
                c2059x2.f5608e = new HashMap(new HashMap(interfaceC1645X.mo3761K()));
            } else {
                for (Map.Entry entry : interfaceC1645X.mo3761K().entrySet()) {
                    if (!c2059x2.f5608e.containsKey(entry.getKey())) {
                        c2059x2.f5608e.put((String) entry.getKey(), (String) entry.getValue());
                    }
                }
            }
            for (Map.Entry entry2 : new C1953c(interfaceC1645X.mo3773q()).f6889a.entrySet()) {
                if (!c1953c.mo4119a(entry2.getKey())) {
                    c1953c.mo4128j((String) entry2.getKey(), entry2.getValue());
                }
            }
            InterfaceC1876g0 interfaceC1876g0Mo3776t = interfaceC1645X.mo3776t();
            if (c1953c.mo4126h() == null) {
                if (interfaceC1876g0Mo3776t == null) {
                    c1953c.mo4138t(C1621P2.m3735b(interfaceC1645X.mo3755E()));
                } else {
                    c1953c.mo4138t(interfaceC1876g0Mo3776t.mo3627m());
                }
            }
        }
        C2046v2 c2046v2 = this.f5692b;
        c2046v2.getLogger().mo3680e(EnumC1657a2.DEBUG, "Capturing session replay: %s", c2059x2.f5604a);
        C1970t c1970t = C1970t.f7011b;
        C1970t c1970t2 = c2059x2.f5604a;
        if (c1970t2 != null) {
            c1970t = c1970t2;
        }
        Iterator<InterfaceC1566C> it = c2046v2.getEventProcessors().iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            InterfaceC1566C next = it.next();
            try {
                c2059x2 = next.mo3604d(c2059x2, c1586h);
            } catch (Throwable th) {
                c2046v2.getLogger().mo3682n(EnumC1657a2.ERROR, th, "An exception occurred while processing replay event by processor: %s", next.getClass().getName());
            }
            if (c2059x2 == null) {
                c2046v2.getLogger().mo3680e(EnumC1657a2.DEBUG, "Replay event was dropped by a processor: %s", next.getClass().getName());
                c2046v2.getClientReportRecorder().mo4041b(EnumC1853d.EVENT_PROCESSOR, EnumC1929n.Replay);
                break;
            }
        }
        if (c2059x2 != null) {
            c2046v2.getBeforeSendReplay();
        }
        if (c2059x2 == null) {
            return C1970t.f7011b;
        }
        try {
            C1901c c1901cM3656n = m3656n(c2059x2, c1586h.f5735g, m3657p(interfaceC1645X, c1586h, c2059x2, null), InterfaceC1884b.class.isInstance(AbstractC1856a.m4072s(c1586h)));
            c1586h.m3666a();
            this.f5693c.mo4163j(c1901cM3656n, c1586h);
            return c1970t;
        } catch (IOException e) {
            c2046v2.getLogger().mo3682n(EnumC1657a2.WARNING, e, "Capturing event %s failed.", c1970t);
            return C1970t.f7011b;
        }
    }

    @Override // io.sentry.InterfaceC1826b0
    /* JADX INFO: renamed from: g */
    public final C1970t mo3649g(C1901c c1901c, C1586H c1586h) {
        try {
            c1586h.m3666a();
            return m3660s(c1901c, c1586h);
        } catch (IOException e) {
            this.f5692b.getLogger().mo3683r(EnumC1657a2.ERROR, "Failed to capture envelope.", e);
            return C1970t.f7011b;
        }
    }

    @Override // io.sentry.InterfaceC1826b0
    /* JADX INFO: renamed from: h */
    public final C1970t mo3650h(C1867e1 c1867e1) {
        AbstractC1856a.m4048D("profileChunk is required.", c1867e1);
        C2046v2 c2046v2 = this.f5692b;
        c2046v2.getLogger().mo3680e(EnumC1657a2.DEBUG, "Capturing profile chunk: %s", c1867e1.f6693c);
        C1970t c1970t = c1867e1.f6693c;
        C1954d c1954dM4153a = C1954d.m4153a(c1867e1.f6691a, c2046v2);
        if (c1954dM4153a != null) {
            c1867e1.f6691a = c1954dM4153a;
        }
        try {
            return m3660s(new C1901c(new C1596J1(c1970t, c2046v2.getSdkVersion(), null), Collections.singletonList(C1620P1.m3729c(c1867e1, c2046v2.getSerializer()))), null);
        } catch (C1870b | IOException e) {
            c2046v2.getLogger().mo3682n(EnumC1657a2.WARNING, e, "Capturing profile chunk %s failed.", c1970t);
            return C1970t.f7011b;
        }
    }

    @Override // io.sentry.InterfaceC1826b0
    /* JADX INFO: renamed from: i */
    public final C1970t mo3651i(C1944A c1944a, C1613N2 c1613n2, InterfaceC1645X interfaceC1645X, C1586H c1586h, C1881h1 c1881h1) {
        Throwable th;
        Pattern pattern;
        if (c1586h == null) {
            c1586h = new C1586H();
        }
        if (m3661t(c1944a, c1586h)) {
            c1586h.f5730b.addAll(interfaceC1645X.mo3770n());
        }
        C2046v2 c2046v2 = this.f5692b;
        c2046v2.getLogger().mo3680e(EnumC1657a2.DEBUG, "Capturing transaction: %s", c1944a.f5604a);
        List<C1578F> ignoredTransactions = c2046v2.getIgnoredTransactions();
        String str = c1944a.f6839p;
        if (str != null && ignoredTransactions != null && !ignoredTransactions.isEmpty()) {
            Iterator<C1578F> it = ignoredTransactions.iterator();
            while (true) {
                if (!it.hasNext()) {
                    Iterator<C1578F> it2 = ignoredTransactions.iterator();
                    while (it2.hasNext()) {
                        try {
                            pattern = it2.next().f5690b;
                        } catch (Throwable unused) {
                        }
                        if (pattern == null ? false : pattern.matcher(str).matches()) {
                        }
                    }
                } else if (it.next().f5689a.equalsIgnoreCase(str)) {
                    break;
                }
            }
            c2046v2.getLogger().mo3680e(EnumC1657a2.DEBUG, "Transaction was dropped as transaction name %s is ignored", c1944a.f6839p);
            InterfaceC1855f clientReportRecorder = c2046v2.getClientReportRecorder();
            EnumC1853d enumC1853d = EnumC1853d.EVENT_PROCESSOR;
            clientReportRecorder.mo4041b(enumC1853d, EnumC1929n.Transaction);
            c2046v2.getClientReportRecorder().mo4042c(enumC1853d, EnumC1929n.Span, c1944a.f6842s.size() + 1);
            return C1970t.f7011b;
        }
        C1970t c1970t = C1970t.f7011b;
        C1970t c1970t2 = c1944a.f5604a;
        if (c1970t2 == null) {
            c1970t2 = c1970t;
        }
        if (m3661t(c1944a, c1586h)) {
            m3653k(c1944a, interfaceC1645X);
            c1944a = m3659r(c1944a, c1586h, interfaceC1645X.mo3757G());
            if (c1944a == null) {
                c2046v2.getLogger().mo3680e(EnumC1657a2.DEBUG, "Transaction was dropped by applyScope", new Object[0]);
            }
        }
        if (c1944a != null) {
            c1944a = m3659r(c1944a, c1586h, c2046v2.getEventProcessors());
        }
        C1944A c1944a2 = c1944a;
        if (c1944a2 == null) {
            c2046v2.getLogger().mo3680e(EnumC1657a2.DEBUG, "Transaction was dropped by Event processors.", new Object[0]);
            return c1970t;
        }
        ArrayList arrayList = c1944a2.f6842s;
        int size = arrayList.size();
        c2046v2.getBeforeSendTransaction();
        int size2 = arrayList.size();
        if (size2 < size) {
            int i = size - size2;
            c2046v2.getLogger().mo3680e(EnumC1657a2.DEBUG, "%d spans were dropped by beforeSendTransaction.", Integer.valueOf(i));
            c2046v2.getClientReportRecorder().mo4042c(EnumC1853d.BEFORE_SEND, EnumC1929n.Span, i);
        }
        try {
            ArrayList arrayListM3642o = m3642o(c1586h);
            ArrayList arrayList2 = new ArrayList();
            Iterator it3 = arrayListM3642o.iterator();
            while (it3.hasNext()) {
                try {
                    try {
                        ((C1654a) it3.next()).getClass();
                    } catch (C1870b e) {
                        e = e;
                        th = e;
                        c2046v2.getLogger().mo3682n(EnumC1657a2.WARNING, th, "Capturing transaction %s failed.", c1970t2);
                        return C1970t.f7011b;
                    } catch (IOException e2) {
                        e = e2;
                        th = e;
                        c2046v2.getLogger().mo3682n(EnumC1657a2.WARNING, th, "Capturing transaction %s failed.", c1970t2);
                        return C1970t.f7011b;
                    }
                } catch (C1870b e3) {
                    e = e3;
                } catch (IOException e4) {
                    e = e4;
                }
            }
            try {
                C1901c c1901cM3654l = m3654l(c1944a2, arrayList2, null, c1613n2, c1881h1);
                c1586h.m3666a();
                return c1901cM3654l != null ? m3660s(c1901cM3654l, c1586h) : c1970t2;
            } catch (C1870b e5) {
                e = e5;
                th = e;
                c2046v2.getLogger().mo3682n(EnumC1657a2.WARNING, th, "Capturing transaction %s failed.", c1970t2);
                return C1970t.f7011b;
            } catch (IOException e6) {
                e = e6;
                th = e;
                c2046v2.getLogger().mo3682n(EnumC1657a2.WARNING, th, "Capturing transaction %s failed.", c1970t2);
                return C1970t.f7011b;
            }
        } catch (C1870b | IOException e7) {
            e = e7;
        }
    }

    @Override // io.sentry.InterfaceC1826b0
    public final boolean isEnabled() {
        return this.f5691a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:45:0x00d3, code lost:
    
        r1.getLogger().mo3680e(io.sentry.EnumC1657a2.DEBUG, "Event was dropped as it matched a string/pattern in ignoredErrors", r13.f5846q);
        r1.getClientReportRecorder().mo4041b(io.sentry.clientreport.EnumC1853d.EVENT_PROCESSOR, io.sentry.EnumC1929n.Error);
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00f1, code lost:
    
        return io.sentry.protocol.C1970t.f7011b;
     */
    /* JADX WARN: Removed duplicated region for block: B:110:0x01fb  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x0276  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x02e1  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x02f0  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0194  */
    @Override // io.sentry.InterfaceC1826b0
    /* JADX INFO: renamed from: j */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final C1970t mo3652j(C1627R1 c1627r1, InterfaceC1645X interfaceC1645X, C1586H c1586h) {
        C1581F2 c1581f2Mo3756F;
        C1581F2 c1581f2;
        C1627R1 c1627r12;
        boolean z;
        String str;
        InterfaceC1895i0 interfaceC1895i0Mo3763d;
        Object objM4072s;
        C1970t c1970t;
        if (m3661t(c1627r1, c1586h) && interfaceC1645X != null) {
            c1586h.f5730b.addAll(interfaceC1645X.mo3770n());
        }
        C2046v2 c2046v2 = this.f5692b;
        ILogger logger = c2046v2.getLogger();
        EnumC1657a2 enumC1657a2 = EnumC1657a2.DEBUG;
        logger.mo3680e(enumC1657a2, "Capturing event: %s", c1627r1.f5604a);
        Throwable thM3605a = c1627r1.m3605a();
        if (thM3605a != null && c2046v2.getIgnoredExceptionsForType().contains(thM3605a.getClass())) {
            c2046v2.getLogger().mo3680e(enumC1657a2, "Event was dropped as the exception %s is ignored", thM3605a.getClass());
            c2046v2.getClientReportRecorder().mo4041b(EnumC1853d.EVENT_PROCESSOR, EnumC1929n.Error);
            return C1970t.f7011b;
        }
        List<C1578F> ignoredErrors = c2046v2.getIgnoredErrors();
        if (ignoredErrors != null && !ignoredErrors.isEmpty()) {
            HashSet<String> hashSet = new HashSet();
            C1962l c1962l = c1627r1.f5846q;
            if (c1962l != null) {
                String str2 = c1962l.f6966b;
                if (str2 != null) {
                    hashSet.add(str2);
                }
                String str3 = c1962l.f6965a;
                if (str3 != null) {
                    hashSet.add(str3);
                }
            }
            Throwable thM3605a2 = c1627r1.m3605a();
            if (thM3605a2 != null) {
                hashSet.add(thM3605a2.toString());
            }
            Iterator<C1578F> it = ignoredErrors.iterator();
            while (true) {
                if (it.hasNext()) {
                    if (hashSet.contains(it.next().f5689a)) {
                        break;
                    }
                } else {
                    for (C1578F c1578f : ignoredErrors) {
                        for (String str4 : hashSet) {
                            Pattern pattern = c1578f.f5690b;
                            if (pattern == null ? false : pattern.matcher(str4).matches()) {
                            }
                        }
                    }
                }
            }
        }
        if (m3661t(c1627r1, c1586h)) {
            if (interfaceC1645X != null) {
                m3653k(c1627r1, interfaceC1645X);
                String str5 = c1627r1.f5851v;
                C1953c c1953c = c1627r1.f5605b;
                if (str5 == null) {
                    c1627r1.f5851v = interfaceC1645X.mo3759I();
                }
                if (c1627r1.f5852w == null) {
                    List listMo3780x = interfaceC1645X.mo3780x();
                    c1627r1.f5852w = listMo3780x != null ? new ArrayList(listMo3780x) : null;
                }
                if (interfaceC1645X.mo3753C() != null) {
                    c1627r1.f5850u = interfaceC1645X.mo3753C();
                }
                InterfaceC1876g0 interfaceC1876g0Mo3776t = interfaceC1645X.mo3776t();
                if (c1953c.mo4126h() == null) {
                    if (interfaceC1876g0Mo3776t == null) {
                        c1953c.mo4138t(C1621P2.m3735b(interfaceC1645X.mo3755E()));
                    } else {
                        c1953c.mo4138t(interfaceC1876g0Mo3776t.mo3627m());
                    }
                }
                c1627r1 = m3658q(c1627r1, c1586h, interfaceC1645X.mo3757G());
            }
            if (c1627r1 == null) {
                c2046v2.getLogger().mo3680e(EnumC1657a2.DEBUG, "Event was dropped by applyScope", new Object[0]);
                return C1970t.f7011b;
            }
        }
        C1627R1 c1627r1M3658q = m3658q(c1627r1, c1586h, c2046v2.getEventProcessors());
        if (c1627r1M3658q != null) {
            c2046v2.getBeforeSend();
        }
        if (c1627r1M3658q == null) {
            return C1970t.f7011b;
        }
        C1581F2 c1581f2Mo3756F2 = interfaceC1645X != null ? interfaceC1645X.mo3756F(new C2438r1(20)) : null;
        if (c1581f2Mo3756F2 != null) {
            if (c1581f2Mo3756F2.f5702g != EnumC1577E2.Ok) {
                c1581f2 = null;
            }
        } else if (!AbstractC1856a.m4050F(c1586h)) {
            c1581f2Mo3756F = null;
            c1581f2 = c1581f2Mo3756F;
        } else if (interfaceC1645X != null) {
            c1581f2Mo3756F = interfaceC1645X.mo3756F(new C1572D1(this, c1627r1M3658q, c1586h));
            c1581f2 = c1581f2Mo3756F;
        } else {
            c2046v2.getLogger().mo3680e(EnumC1657a2.INFO, "Scope is null on client.captureEvent", new Object[0]);
            c1581f2Mo3756F = null;
            c1581f2 = c1581f2Mo3756F;
        }
        C2035g c2035gM4180a = c2046v2.getSampleRate() == null ? null : AbstractC2036h.m4180a();
        if (c2046v2.getSampleRate() == null || c2035gM4180a == null || c2046v2.getSampleRate().doubleValue() >= c2035gM4180a.m4179c()) {
            c1627r12 = c1627r1M3658q;
        } else {
            c2046v2.getLogger().mo3680e(EnumC1657a2.DEBUG, "Event %s was dropped due to sampling decision.", c1627r1M3658q.f5604a);
            c2046v2.getClientReportRecorder().mo4041b(EnumC1853d.SAMPLE_RATE, EnumC1929n.Error);
            c1627r12 = null;
        }
        if (c1581f2 != null) {
            if (c1581f2Mo3756F2 != null) {
                EnumC1577E2 enumC1577E2 = c1581f2.f5702g;
                EnumC1577E2 enumC1577E22 = EnumC1577E2.Crashed;
                z = (enumC1577E2 == enumC1577E22 && c1581f2Mo3756F2.f5702g != enumC1577E22) || (c1581f2.f5698c.get() > 0 && c1581f2Mo3756F2.f5698c.get() <= 0);
            }
        }
        if (c1627r12 == null && !z) {
            c2046v2.getLogger().mo3680e(EnumC1657a2.DEBUG, "Not sending session update for dropped event as it did not cause the session health to change.", new Object[0]);
            return C1970t.f7011b;
        }
        C1970t c1970tM3660s = C1970t.f7011b;
        if (c1627r12 != null && (c1970t = c1627r12.f5604a) != null) {
            c1970tM3660s = c1970t;
        }
        boolean zIsInstance = InterfaceC1884b.class.isInstance(AbstractC1856a.m4072s(c1586h));
        boolean z2 = InterfaceC1886d.class.isInstance(AbstractC1856a.m4072s(c1586h)) && !C1672O.class.isInstance(AbstractC1856a.m4072s(c1586h));
        if (c1627r12 != null && !zIsInstance && !z2) {
            if (c1627r12.m3739d()) {
                c2046v2.getReplayController().mo3694f(Boolean.valueOf(c1627r12.m3738c() != null));
            } else if (c1627r12.m3738c() != null) {
            }
        }
        if (c1627r12 != null) {
            try {
                str = c1627r12.f5851v;
            } catch (C1870b | IOException e) {
                e = e;
                c2046v2.getLogger().mo3682n(EnumC1657a2.WARNING, e, "Capturing event %s failed.", c1970tM3660s);
                c1970tM3660s = C1970t.f7011b;
                if (interfaceC1645X != null) {
                    objM4072s = AbstractC1856a.m4072s(c1586h);
                    if (objM4072s instanceof AbstractC1885c) {
                    }
                }
                return c1970tM3660s;
            }
        } else {
            str = null;
        }
        try {
            C1901c c1901cM3654l = m3654l(c1627r12, c1627r12 != null ? m3642o(c1586h) : null, c1581f2, m3657p(interfaceC1645X, c1586h, c1627r12, str), null);
            c1586h.m3666a();
            if (c1901cM3654l != null) {
                c1970tM3660s = m3660s(c1901cM3654l, c1586h);
            }
        } catch (C1870b e2) {
            e = e2;
            c2046v2.getLogger().mo3682n(EnumC1657a2.WARNING, e, "Capturing event %s failed.", c1970tM3660s);
            c1970tM3660s = C1970t.f7011b;
        } catch (IOException e3) {
            e = e3;
            c2046v2.getLogger().mo3682n(EnumC1657a2.WARNING, e, "Capturing event %s failed.", c1970tM3660s);
            c1970tM3660s = C1970t.f7011b;
        }
        if (interfaceC1645X != null && (interfaceC1895i0Mo3763d = interfaceC1645X.mo3763d()) != null && InterfaceC1893k.class.isInstance(AbstractC1856a.m4072s(c1586h))) {
            objM4072s = AbstractC1856a.m4072s(c1586h);
            if (objM4072s instanceof AbstractC1885c) {
                interfaceC1895i0Mo3763d.mo3622h(EnumC1605L2.ABORTED, false, null);
            } else {
                ((AbstractC1885c) objM4072s).mo3741g(interfaceC1895i0Mo3763d.mo3621g());
                interfaceC1895i0Mo3763d.mo3622h(EnumC1605L2.ABORTED, false, c1586h);
            }
        }
        return c1970tM3660s;
    }

    /* JADX INFO: renamed from: k */
    public final void m3653k(AbstractC1568C1 abstractC1568C1, InterfaceC1645X interfaceC1645X) {
        if (interfaceC1645X != null) {
            if (abstractC1568C1.f5607d == null) {
                abstractC1568C1.f5607d = interfaceC1645X.mo3762a();
            }
            if (abstractC1568C1.f5612i == null) {
                abstractC1568C1.f5612i = interfaceC1645X.mo3751A();
            }
            if (abstractC1568C1.f5608e == null) {
                abstractC1568C1.f5608e = new HashMap(new HashMap(interfaceC1645X.mo3761K()));
            } else {
                for (Map.Entry entry : interfaceC1645X.mo3761K().entrySet()) {
                    if (!abstractC1568C1.f5608e.containsKey(entry.getKey())) {
                        abstractC1568C1.f5608e.put((String) entry.getKey(), (String) entry.getValue());
                    }
                }
            }
            if (abstractC1568C1.f5616m == null) {
                abstractC1568C1.f5616m = new ArrayList(new ArrayList(interfaceC1645X.mo3782z()));
            } else {
                Queue queueMo3782z = interfaceC1645X.mo3782z();
                List list = abstractC1568C1.f5616m;
                if (list != null && !queueMo3782z.isEmpty()) {
                    list.addAll(queueMo3782z);
                    Collections.sort(list, this.f5694d);
                }
            }
            if (abstractC1568C1.f5618o == null) {
                abstractC1568C1.f5618o = new HashMap(new HashMap(interfaceC1645X.getExtras()));
            } else {
                for (Map.Entry entry2 : interfaceC1645X.getExtras().entrySet()) {
                    if (!abstractC1568C1.f5618o.containsKey(entry2.getKey())) {
                        abstractC1568C1.f5618o.put((String) entry2.getKey(), entry2.getValue());
                    }
                }
            }
            C1953c c1953c = abstractC1568C1.f5605b;
            for (Map.Entry entry3 : new C1953c(interfaceC1645X.mo3773q()).f6889a.entrySet()) {
                if (!c1953c.mo4119a(entry3.getKey())) {
                    c1953c.mo4128j((String) entry3.getKey(), entry3.getValue());
                }
            }
        }
    }

    /* JADX INFO: renamed from: l */
    public final C1901c m3654l(AbstractC1568C1 abstractC1568C1, ArrayList arrayList, C1581F2 c1581f2, C1613N2 c1613n2, C1881h1 c1881h1) {
        C1970t c1970t;
        ArrayList arrayList2 = new ArrayList();
        C2046v2 c2046v2 = this.f5692b;
        if (abstractC1568C1 != null) {
            InterfaceC1866e0 serializer = c2046v2.getSerializer();
            Charset charset = C1620P1.f5821d;
            AbstractC1856a.m4048D("ISerializer is required.", serializer);
            C1901c c1901c = new C1901c(new CallableC1600K1(1, serializer, abstractC1568C1));
            arrayList2.add(new C1620P1(new C1624Q1(EnumC1653Z1.resolve(abstractC1568C1), new CallableC1604L1(2, c1901c), "application/json", null, null), new CallableC1604L1(3, c1901c)));
            c1970t = abstractC1568C1.f5604a;
        } else {
            c1970t = null;
        }
        if (c1581f2 != null) {
            arrayList2.add(C1620P1.m3730d(c2046v2.getSerializer(), c1581f2));
        }
        if (c1881h1 != null) {
            long maxTraceFileSize = c2046v2.getMaxTraceFileSize();
            InterfaceC1866e0 serializer2 = c2046v2.getSerializer();
            Charset charset2 = C1620P1.f5821d;
            File file = c1881h1.f6735a;
            C1901c c1901c2 = new C1901c(new CallableC1616O1(file, maxTraceFileSize, c1881h1, serializer2));
            arrayList2.add(new C1620P1(new C1624Q1(EnumC1653Z1.Profile, new CallableC1604L1(0, c1901c2), "application-json", file.getName(), null), new CallableC1604L1(1, c1901c2)));
            if (c1970t == null) {
                c1970t = new C1970t(c1881h1.f6757w);
            }
        }
        if (arrayList != null) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                C1654a c1654a = (C1654a) it.next();
                InterfaceC1866e0 serializer3 = c2046v2.getSerializer();
                ILogger logger = c2046v2.getLogger();
                long maxAttachmentSize = c2046v2.getMaxAttachmentSize();
                Charset charset3 = C1620P1.f5821d;
                C1901c c1901c3 = new C1901c(new CallableC1616O1(c1654a, maxAttachmentSize, serializer3, logger));
                arrayList2.add(new C1620P1(new C1624Q1(EnumC1653Z1.Attachment, new CallableC1604L1(14, c1901c3), c1654a.f5903e, c1654a.f5902d, c1654a.f5904f), new CallableC1604L1(15, c1901c3)));
            }
        }
        if (arrayList2.isEmpty()) {
            return null;
        }
        return new C1901c(new C1596J1(c1970t, c2046v2.getSdkVersion(), c1613n2), arrayList2);
    }

    /* JADX INFO: renamed from: m */
    public final C1901c m3655m(C1864d2 c1864d2) {
        ArrayList arrayList = new ArrayList();
        C2046v2 c2046v2 = this.f5692b;
        InterfaceC1866e0 serializer = c2046v2.getSerializer();
        Charset charset = C1620P1.f5821d;
        AbstractC1856a.m4048D("ISerializer is required.", serializer);
        C1901c c1901c = new C1901c(new CallableC1600K1(3, serializer, c1864d2));
        arrayList.add(new C1620P1(new C1624Q1(EnumC1653Z1.Log, new CallableC1604L1(6, c1901c), "application/vnd.sentry.items.log+json", (String) null, (String) null, (String) null, Integer.valueOf(((List) c1864d2.f6688b).size())), new CallableC1604L1(8, c1901c)));
        return new C1901c(new C1596J1(null, c2046v2.getSdkVersion(), null), arrayList);
    }

    /* JADX INFO: renamed from: n */
    public final C1901c m3656n(final C2059x2 c2059x2, final C1927m1 c1927m1, C1613N2 c1613n2, final boolean z) {
        ArrayList arrayList = new ArrayList();
        C2046v2 c2046v2 = this.f5692b;
        final InterfaceC1866e0 serializer = c2046v2.getSerializer();
        final ILogger logger = c2046v2.getLogger();
        Charset charset = C1620P1.f5821d;
        final File file = c2059x2.f7280p;
        C1901c c1901c = new C1901c(new Callable() { // from class: io.sentry.M1
            @Override // java.util.concurrent.Callable
            public final Object call() {
                InterfaceC1866e0 interfaceC1866e0 = serializer;
                C2059x2 c2059x22 = c2059x2;
                File file2 = file;
                ILogger iLogger = logger;
                boolean z2 = z;
                try {
                    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                    try {
                        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(byteArrayOutputStream, C1620P1.f5821d));
                        try {
                            LinkedHashMap linkedHashMap = new LinkedHashMap();
                            interfaceC1866e0.mo3610d(c2059x22, bufferedWriter);
                            linkedHashMap.put(EnumC1653Z1.ReplayEvent.getItemType(), byteArrayOutputStream.toByteArray());
                            byteArrayOutputStream.reset();
                            C1927m1 c1927m12 = c1927m1;
                            if (c1927m12 != null) {
                                interfaceC1866e0.mo3610d(c1927m12, bufferedWriter);
                                linkedHashMap.put(EnumC1653Z1.ReplayRecording.getItemType(), byteArrayOutputStream.toByteArray());
                                byteArrayOutputStream.reset();
                            }
                            if (file2 != null && file2.exists()) {
                                byte[] bArrM4046B = AbstractC1856a.m4046B(file2.getPath(), 10485760L);
                                if (bArrM4046B.length > 0) {
                                    linkedHashMap.put(EnumC1653Z1.ReplayVideo.getItemType(), bArrM4046B);
                                }
                            }
                            byte[] bArrM3731h = C1620P1.m3731h(linkedHashMap);
                            bufferedWriter.close();
                            byteArrayOutputStream.close();
                            if (file2 != null) {
                                if (z2) {
                                    return bArrM3731h;
                                }
                            }
                            return bArrM3731h;
                        } finally {
                        }
                    } finally {
                    }
                } catch (Throwable th) {
                    try {
                        iLogger.mo3683r(EnumC1657a2.ERROR, "Could not serialize replay recording", th);
                        if (file2 == null) {
                            return null;
                        }
                        if (z2) {
                            AbstractC1856a.m4060f(file2.getParentFile());
                            return null;
                        }
                        file2.delete();
                        return null;
                    } finally {
                        if (file2 != null) {
                            if (z2) {
                                AbstractC1856a.m4060f(file2.getParentFile());
                            } else {
                                file2.delete();
                            }
                        }
                    }
                }
            }
        });
        arrayList.add(new C1620P1(new C1624Q1(EnumC1653Z1.ReplayVideo, new CallableC1604L1(9, c1901c), null, null, null), new CallableC1604L1(10, c1901c)));
        return new C1901c(new C1596J1(c2059x2.f5604a, c2046v2.getSessionReplay().f7315k, c1613n2), arrayList);
    }

    /* JADX INFO: renamed from: p */
    public final C1613N2 m3657p(InterfaceC1645X interfaceC1645X, C1586H c1586h, AbstractC1568C1 abstractC1568C1, String str) {
        boolean zIsInstance = InterfaceC1884b.class.isInstance(AbstractC1856a.m4072s(c1586h));
        C2046v2 c2046v2 = this.f5692b;
        if (zIsInstance) {
            if (abstractC1568C1 != null) {
                c2046v2.getLogger();
                C1832c c1832c = new C1832c();
                C1953c c1953c = abstractC1568C1.f5605b;
                C1589H2 c1589h2Mo4126h = c1953c.mo4126h();
                c1832c.m3996b("sentry-trace_id", c1589h2Mo4126h != null ? c1589h2Mo4126h.f5738a.toString() : null);
                c1832c.m3996b("sentry-public_key", c2046v2.retrieveParsedDsn().f7295b);
                c1832c.m3996b("sentry-release", abstractC1568C1.f5609f);
                c1832c.m3996b("sentry-environment", abstractC1568C1.f5610g);
                c1832c.m3996b("sentry-transaction", str);
                if (c1832c.f6622e) {
                    c1832c.f6620c = null;
                }
                c1832c.m3996b("sentry-sampled", null);
                if (c1832c.f6622e) {
                    c1832c.f6621d = null;
                }
                Object objMo4121c = c1953c.mo4121c("replay_id");
                if (objMo4121c != null && !objMo4121c.toString().equals(C1970t.f7011b.toString())) {
                    c1832c.m3996b("sentry-replay_id", objMo4121c.toString());
                    c1953c.f6889a.remove("replay_id");
                }
                c1832c.f6622e = false;
                return c1832c.m3998d();
            }
        } else if (interfaceC1645X != null) {
            InterfaceC1895i0 interfaceC1895i0Mo3763d = interfaceC1645X.mo3763d();
            return interfaceC1895i0Mo3763d != null ? interfaceC1895i0Mo3763d.mo3616b() : ((C1832c) interfaceC1645X.mo3774r(new C0698Q9(12, interfaceC1645X, c2046v2)).f6807d).m3998d();
        }
        return null;
    }

    /* JADX INFO: renamed from: q */
    public final C1627R1 m3658q(C1627R1 c1627r1, C1586H c1586h, List list) {
        C2046v2 c2046v2 = this.f5692b;
        Iterator it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            InterfaceC1566C interfaceC1566C = (InterfaceC1566C) it.next();
            try {
                boolean z = interfaceC1566C instanceof C1747u;
                boolean zIsInstance = InterfaceC1884b.class.isInstance(AbstractC1856a.m4072s(c1586h));
                if (zIsInstance && z) {
                    ((C1747u) interfaceC1566C).mo3585i(c1627r1, c1586h);
                } else if (!zIsInstance && !z) {
                    c1627r1 = interfaceC1566C.mo3585i(c1627r1, c1586h);
                }
            } catch (Throwable th) {
                c2046v2.getLogger().mo3682n(EnumC1657a2.ERROR, th, "An exception occurred while processing event by processor: %s", interfaceC1566C.getClass().getName());
            }
            if (c1627r1 == null) {
                c2046v2.getLogger().mo3680e(EnumC1657a2.DEBUG, "Event was dropped by a processor: %s", interfaceC1566C.getClass().getName());
                c2046v2.getClientReportRecorder().mo4041b(EnumC1853d.EVENT_PROCESSOR, EnumC1929n.Error);
                break;
            }
        }
        return c1627r1;
    }

    /* JADX INFO: renamed from: r */
    public final C1944A m3659r(C1944A c1944a, C1586H c1586h, List list) {
        C2046v2 c2046v2 = this.f5692b;
        Iterator it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            InterfaceC1566C interfaceC1566C = (InterfaceC1566C) it.next();
            int size = c1944a.f6842s.size();
            try {
                c1944a = interfaceC1566C.mo3584f(c1944a, c1586h);
            } catch (Throwable th) {
                c2046v2.getLogger().mo3682n(EnumC1657a2.ERROR, th, "An exception occurred while processing transaction by processor: %s", interfaceC1566C.getClass().getName());
            }
            int size2 = c1944a == null ? 0 : c1944a.f6842s.size();
            if (c1944a == null) {
                c2046v2.getLogger().mo3680e(EnumC1657a2.DEBUG, "Transaction was dropped by a processor: %s", interfaceC1566C.getClass().getName());
                InterfaceC1855f clientReportRecorder = c2046v2.getClientReportRecorder();
                EnumC1853d enumC1853d = EnumC1853d.EVENT_PROCESSOR;
                clientReportRecorder.mo4041b(enumC1853d, EnumC1929n.Transaction);
                c2046v2.getClientReportRecorder().mo4042c(enumC1853d, EnumC1929n.Span, size + 1);
                break;
            }
            if (size2 < size) {
                int i = size - size2;
                c2046v2.getLogger().mo3680e(EnumC1657a2.DEBUG, "%d spans were dropped by a processor: %s", Integer.valueOf(i), interfaceC1566C.getClass().getName());
                c2046v2.getClientReportRecorder().mo4042c(EnumC1853d.EVENT_PROCESSOR, EnumC1929n.Span, i);
            }
        }
        return c1944a;
    }

    /* JADX INFO: renamed from: s */
    public final C1970t m3660s(C1901c c1901c, C1586H c1586h) {
        C2046v2 c2046v2 = this.f5692b;
        InterfaceC1917k2 beforeEnvelopeCallback = c2046v2.getBeforeEnvelopeCallback();
        if (beforeEnvelopeCallback != null) {
            try {
                SpotlightIntegration spotlightIntegration = (SpotlightIntegration) beforeEnvelopeCallback;
                try {
                    spotlightIntegration.f5868c.submit(new RunnableC2260n3(21, spotlightIntegration, c1901c));
                } catch (RejectedExecutionException e) {
                    spotlightIntegration.f5867b.mo3683r(EnumC1657a2.WARNING, "Spotlight envelope submission rejected.", e);
                }
            } catch (Throwable th) {
                c2046v2.getLogger().mo3683r(EnumC1657a2.ERROR, "The BeforeEnvelope callback threw an exception.", th);
            }
        }
        C1650Y1.m3790d().m3793c(c2046v2.getLogger());
        InterfaceC2012g interfaceC2012g = this.f5693c;
        if (c1586h == null) {
            interfaceC2012g.getClass();
            interfaceC2012g.mo4163j(c1901c, new C1586H());
        } else {
            interfaceC2012g.mo4163j(c1901c, c1586h);
        }
        C1970t c1970t = ((C1596J1) c1901c.f6781b).f5755a;
        return c1970t != null ? c1970t : C1970t.f7011b;
    }

    /* JADX INFO: renamed from: t */
    public final boolean m3661t(AbstractC1568C1 abstractC1568C1, C1586H c1586h) {
        if (AbstractC1856a.m4050F(c1586h)) {
            return true;
        }
        this.f5692b.getLogger().mo3680e(EnumC1657a2.DEBUG, "Event was cached so not applying scope: %s", abstractC1568C1.f5604a);
        return false;
    }
}
