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
import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.net.URI;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.concurrent.RejectedExecutionException;
import java.util.regex.Pattern;
import p000.C0698Q9;
import p000.C2438r1;
import p000.RunnableC2260n3;

/* JADX INFO: renamed from: io.sentry.F1 */
/* JADX INFO: loaded from: classes.dex */
public final class C1580F1 implements InterfaceC1826b0 {

    /* JADX INFO: renamed from: a */
    public boolean f5691a;

    /* JADX INFO: renamed from: b */
    public final C2046v2 f5692b;

    /* JADX INFO: renamed from: c */
    public final InterfaceC2012g f5693c;

    /* JADX INFO: renamed from: d */
    public final C1576E1 f5694d;

    /* JADX INFO: renamed from: e */
    public final InterfaceC1922a f5695e;

    public C1580F1(C2046v2 r8) {
        this.f5694d = new C1576E1();
        this.f5692b = r8;
        this.f5691a = true;
        InterfaceC1915k0 r0 = r8.getTransportFactory();
        if ((r0 instanceof C1646X0) == false) goto L5;
        r0 = new C1599K0();
        r8.setTransportFactory(r0);
    L5:
        C2064z r1 = r8.retrieveParsedDsn();
        String r2 = r8.getSentryClientName();
        URI r3 = r1.f7296c;
        String r32 = r3.resolve(r3.getPath() + "/envelope/").toString();
        String r4 = r1.f7295b;
        String r12 = r1.f7294a;
        StringBuilder r5 = new StringBuilder("Sentry sentry_version=7,sentry_client=");
        r5.append(r2);
        r5.append(",sentry_key=");
        r5.append(r4);
        if (r12 != null) goto L8;
    L10:
        String r13 = "";
    L11:
        r5.append(r13);
        String r14 = r5.toString();
        HashMap r42 = new HashMap();
        r42.put("User-Agent", r2);
        r42.put("X-Sentry-Auth", r14);
        this.f5693c = r0.mo3698k(r8, new C1901c(r32, r42));
        if (r8.getLogs().f6831a == false) goto L15;
        this.f5695e = new C1923b(r8, this);
        return;
    L15:
        this.f5695e = C1924c.f6816a;
        return;
    L8:
        if (r12.length() <= 0) goto L10;
        r13 = ",sentry_secret=".concat(r12);
        goto L11
    }

    /* JADX INFO: renamed from: o */
    public static ArrayList m3642o(C1586H r2) {
        ArrayList r0 = new ArrayList(r2.f5730b);
        C1654a r1 = r2.f5732d;
        if (r1 == null) goto L5;
        r0.add(r1);
    L5:
        C1654a r12 = r2.f5733e;
        if (r12 == null) goto L8;
        r0.add(r12);
    L8:
        C1654a r22 = r2.f5734f;
        if (r22 == null) goto L11;
        r0.add(r22);
    L11:
        return r0;
    }

    @Override // io.sentry.InterfaceC1826b0
    /* JADX INFO: renamed from: a */
    public final void mo3643a(boolean r8) {
        C2046v2 r0 = this.f5692b;
        r0.getLogger().mo3680e(EnumC1657a2.INFO, "Closing SentryClient.", new Object[0]);
        if (r8 == false) goto L21;
        long r1 = 0;
    L6:
        mo3644b(r1);     // Catch: IOException -> L8
        this.f5695e.mo4142a(r8);     // Catch: IOException -> L8
        this.f5693c.mo4159a(r8);     // Catch: IOException -> L8
    L10:
        Iterator<InterfaceC1566C> r82 = r0.getEventProcessors().iterator();
    L12:
        if (r82.hasNext() == false) goto L19;
        InterfaceC1566C r12 = r82.next();
        if ((r12 instanceof Closeable) == false) goto L12;
        ((Closeable) r12).close();     // Catch: IOException -> L17
    L17:
        e = move-exception;
        r0.getLogger().mo3680e(EnumC1657a2.WARNING, "Failed to close the event processor {}.", new Object[]{r12, e});
        goto L12
    L19:
        this.f5691a = false;
        return;
    L8:
        e = move-exception;
        r0.getLogger().mo3683r(EnumC1657a2.WARNING, "Failed to close the connection to the Sentry Server.", e);
        goto L10
    L21:
        r1 = r0.getShutdownTimeoutMillis();     // Catch: IOException -> L8
        goto L6
    }

    @Override // io.sentry.InterfaceC1826b0
    /* JADX INFO: renamed from: b */
    public final void mo3644b(long r2) {
        this.f5695e.mo4143b(r2);
        this.f5693c.mo4160b(r2);
    }

    @Override // io.sentry.InterfaceC1826b0
    /* JADX INFO: renamed from: c */
    public final C2021p mo3645c() {
        return this.f5693c.mo4161c();
    }

    @Override // io.sentry.InterfaceC1826b0
    /* JADX INFO: renamed from: d */
    public final void mo3646d(C1581F2 r5, C1586H r6) {
        AbstractC1856a.m4048D("Session is required.", r5);
        String r0 = r5.f5708m;
        C2046v2 r1 = this.f5692b;
        if (r0 != null) goto L5;
    L13:
        r1.getLogger().mo3680e(EnumC1657a2.WARNING, "Sessions can't be captured without setting a release.", new Object[0]);
        return;
    L5:
        if (r0.isEmpty() == true) goto L13;
        InterfaceC1866e0 r02 = r1.getSerializer();     // Catch: IOException -> L10
        C1968r r2 = r1.getSdkVersion();     // Catch: IOException -> L10
        AbstractC1856a.m4048D("Serializer is required.", r02);     // Catch: IOException -> L10
        mo3649g(new C1901c(null, r2, C1620P1.m3730d(r02, r5)), r6);
        return;
    L10:
        e = move-exception;
        r1.getLogger().mo3683r(EnumC1657a2.ERROR, "Failed to capture session.", e);
    }

    @Override // io.sentry.InterfaceC1826b0
    /* JADX INFO: renamed from: e */
    public final boolean mo3647e() {
        return this.f5693c.mo4162e();
    }

    @Override // io.sentry.InterfaceC1826b0
    /* JADX INFO: renamed from: f */
    public final C1970t mo3648f(C2059x2 r10, InterfaceC1645X r11, C1586H r12) {
        if (m3661t(r10, r12) == false) goto L30;
        C1964n r0 = r10.f5607d;
        C1953c r1 = r10.f5605b;
        if (r0 != null) goto L8;
        r10.f5607d = r11.mo3762a();
    L8:
        if (r10.f5612i != null) goto L11;
        r10.f5612i = r11.mo3751A();
    L11:
        if (r10.f5608e != null) goto L13;
        r10.f5608e = new HashMap(new HashMap(r11.mo3761K()));
    L19:
        Iterator r02 = new C1953c(r11.mo3773q()).f6889a.entrySet().iterator();
    L21:
        if (r02.hasNext() == false) goto L25;
        Map.Entry r2 = (Map.Entry) r02.next();
        if (r1.mo4119a(r2.getKey()) == true) goto L21;
        r1.mo4128j((String) r2.getKey(), r2.getValue());
        goto L21
    L25:
        InterfaceC1876g0 r03 = r11.mo3776t();
        if (r1.mo4126h() != null) goto L30;
        if (r03 != null) goto L29;
        r1.mo4138t(C1621P2.m3735b(r11.mo3755E()));
        goto L30
    L29:
        r1.mo4138t(r03.mo3627m());
        goto L30
    L13:
        Iterator r04 = r11.mo3761K().entrySet().iterator();
    L15:
        if (r04.hasNext() == false) goto L19;
        Map.Entry r22 = (Map.Entry) r04.next();
        if (r10.f5608e.containsKey(r22.getKey()) == true) goto L15;
        r10.f5608e.put((String) r22.getKey(), (String) r22.getValue());
    L30:
        C2046v2 r05 = this.f5692b;
        r05.getLogger().mo3680e(EnumC1657a2.DEBUG, "Capturing session replay: %s", new Object[]{r10.f5604a});
        C1970t r13 = C1970t.f7011b;
        C1970t r23 = r10.f5604a;
        if (r23 == null) goto L33;
        r13 = r23;
    L33:
        Iterator<InterfaceC1566C> r24 = r05.getEventProcessors().iterator();
    L35:
        if (r24.hasNext() == false) goto L43;
        InterfaceC1566C r3 = r24.next();
        r10 = r3.mo3604d(r10, r12);     // Catch: Throwable -> L39
    L41:
        if (r10 != null) goto L35;
        r05.getLogger().mo3680e(EnumC1657a2.DEBUG, "Replay event was dropped by a processor: %s", new Object[]{r3.getClass().getName()});
        r05.getClientReportRecorder().mo4041b(EnumC1853d.EVENT_PROCESSOR, EnumC1929n.Replay);
    L39:
        th = move-exception;
        r05.getLogger().mo3682n(EnumC1657a2.ERROR, th, "An exception occurred while processing replay event by processor: %s", new Object[]{r3.getClass().getName()});
    L43:
        if (r10 == null) goto L45;
        r05.getBeforeSendReplay();
    L45:
        if (r10 != null) goto L56;
        return C1970t.f7011b;
    L56:
        C1613N2 r112 = m3657p(r11, r12, r10, null);     // Catch: IOException -> L51
        boolean r25 = InterfaceC1884b.class.isInstance(AbstractC1856a.m4072s(r12));     // Catch: IOException -> L51
        C1901c r102 = m3656n(r10, r12.f5735g, r112, r25);     // Catch: IOException -> L51
        r12.m3666a();     // Catch: IOException -> L51
        this.f5693c.mo4163j(r102, r12);     // Catch: IOException -> L51
        return r13;
    L51:
        e = move-exception;
        r05.getLogger().mo3682n(EnumC1657a2.WARNING, e, "Capturing event %s failed.", new Object[]{r13});
        return C1970t.f7011b;
    }

    @Override // io.sentry.InterfaceC1826b0
    /* JADX INFO: renamed from: g */
    public final C1970t mo3649g(C1901c r3, C1586H r4) {
        r4.m3666a();     // Catch: IOException -> L4
        return m3660s(r3, r4);
    L4:
        e = move-exception;
        this.f5692b.getLogger().mo3683r(EnumC1657a2.ERROR, "Failed to capture envelope.", e);
        return C1970t.f7011b;
    }

    @Override // io.sentry.InterfaceC1826b0
    /* JADX INFO: renamed from: h */
    public final C1970t mo3650h(C1867e1 r7) {
        AbstractC1856a.m4048D("profileChunk is required.", r7);
        C2046v2 r0 = this.f5692b;
        r0.getLogger().mo3680e(EnumC1657a2.DEBUG, "Capturing profile chunk: %s", new Object[]{r7.f6693c});
        C1970t r1 = r7.f6693c;
        C1954d r2 = C1954d.m4153a(r7.f6691a, r0);
        if (r2 == null) goto L12;
        r7.f6691a = r2;
    L12:
        return m3660s(new C1901c(new C1596J1(r1, r0.getSdkVersion(), null), Collections.singletonList(C1620P1.m3729c(r7, r0.getSerializer()))), null);
    L9:
        e = move-exception;
        r0.getLogger().mo3682n(EnumC1657a2.WARNING, e, "Capturing profile chunk %s failed.", new Object[]{r1});
        return C1970t.f7011b;
    }

    @Override // io.sentry.InterfaceC1826b0
    /* JADX INFO: renamed from: i */
    public final C1970t mo3651i(C1944A r11, C1613N2 r12, InterfaceC1645X r13, C1586H r14, C1881h1 r15) {
        if (r14 != null) goto L5;
        r14 = new C1586H();
    L5:
        if (m3661t(r11, r14) == false) goto L7;
        r14.f5730b.addAll(r13.mo3770n());
    L7:
        C2046v2 r1 = this.f5692b;
        r1.getLogger().mo3680e(EnumC1657a2.DEBUG, "Capturing transaction: %s", new Object[]{r11.f5604a});
        List<C1578F> r0 = r1.getIgnoredTransactions();
        String r2 = r11.f6839p;
        if (r2 == null) goto L31;
        if (r0 == null) goto L31;
        if (r0.isEmpty() == true) goto L31;
        Iterator<C1578F> r4 = r0.iterator();
    L16:
        if (r4.hasNext() == false) goto L20;
        if (r4.next().f5689a.equalsIgnoreCase(r2) == false) goto L16;
    L29:
        r1.getLogger().mo3680e(EnumC1657a2.DEBUG, "Transaction was dropped as transaction name %s is ignored", new Object[]{r11.f6839p});
        InterfaceC1855f r122 = r1.getClientReportRecorder();
        EnumC1853d r132 = EnumC1853d.EVENT_PROCESSOR;
        r122.mo4041b(r132, EnumC1929n.Transaction);
        r1.getClientReportRecorder().mo4042c(r132, EnumC1929n.Span, r11.f6842s.size() + 1);
        return C1970t.f7011b;
    L20:
        Iterator<C1578F> r02 = r0.iterator();
    L22:
        if (r02.hasNext() == false) goto L31;
        Pattern r42 = r02.next().f5690b;     // Catch: Throwable -> L78
        if (r42 != null) goto L27;
        boolean r43 = false;
    L28:
        if (r43 == false) goto L22;
    L27:
        r43 = r42.matcher(r2).matches();     // Catch: Throwable -> L78
    L31:
        C1970t r03 = C1970t.f7011b;
        C1970t r22 = r11.f5604a;
        if (r22 != null) goto L36;
        r22 = r03;
    L36:
        if (m3661t(r11, r14) == false) goto L40;
        m3653k(r11, r13);
        r11 = m3659r(r11, r14, r13.mo3757G());
        if (r11 != null) goto L40;
        r1.getLogger().mo3680e(EnumC1657a2.DEBUG, "Transaction was dropped by applyScope", new Object[0]);
    L40:
        if (r11 == null) goto L42;
        r11 = m3659r(r11, r14, r1.getEventProcessors());
    L42:
        C1944A r5 = r11;
        if (r5 != null) goto L46;
        r1.getLogger().mo3680e(EnumC1657a2.DEBUG, "Transaction was dropped by Event processors.", new Object[0]);
        return r03;
    L46:
        ArrayList r112 = r5.f6842s;
        int r133 = r112.size();
        r1.getBeforeSendTransaction();
        int r113 = r112.size();
        if (r113 >= r133) goto L87;
        int r134 = r133 - r113;
        r1.getLogger().mo3680e(EnumC1657a2.DEBUG, "%d spans were dropped by beforeSendTransaction.", new Object[]{Integer.valueOf(r134)});
        r1.getClientReportRecorder().mo4042c(EnumC1853d.BEFORE_SEND, EnumC1929n.Span, r134);
    L87:
        ArrayList r114 = m3642o(r14);     // Catch: Throwable -> L72 IOException -> L74
        ArrayList r6 = new ArrayList();     // Catch: Throwable -> L72 IOException -> L74
        Iterator r115 = r114.iterator();     // Catch: Throwable -> L72 IOException -> L74
    L85:
        if (r115.hasNext() == false) goto L83;
        ((C1654a) r115.next()).getClass();     // Catch: C1870b -> L54 IOException -> L57
    L54:
        e = e;
    L69:
        Throwable r116 = e;
    L76:
        r1.getLogger().mo3682n(EnumC1657a2.WARNING, r116, "Capturing transaction %s failed.", new Object[]{r22});
        return C1970t.f7011b;
    L57:
        e = e;
        goto L69
    L83:
        C1901c r117 = m3654l(r5, r6, null, r12, r15);     // Catch: C1870b -> L64 IOException -> L66
        r14.m3666a();     // Catch: C1870b -> L64 IOException -> L66
        if (r117 == null) goto L99;
    L100:
        return m3660s(r117, r14);
    L99:
        return r22;
    L64:
        e = e;
    L65:
        r116 = e;
    L66:
        e = e;
        goto L65
    L68:
        e = e;
    L70:
        e = e;
    L72:
        e = e;
        goto L65
    }

    @Override // io.sentry.InterfaceC1826b0
    public final boolean isEnabled() {
        return this.f5691a;
    }

    @Override // io.sentry.InterfaceC1826b0
    /* JADX INFO: renamed from: j */
    public final C1970t mo3652j(C1627R1 r13, InterfaceC1645X r14, C1586H r15) {
        if (m3661t(r13, r15) == false) goto L6;
        if (r14 == null) goto L6;
        r15.f5730b.addAll(r14.mo3770n());
    L6:
        C2046v2 r1 = this.f5692b;
        ILogger r0 = r1.getLogger();
        EnumC1657a2 r2 = EnumC1657a2.DEBUG;
        r0.mo3680e(r2, "Capturing event: %s", new Object[]{r13.f5604a});
        Throwable r02 = r13.m3605a();
        if (r02 != null) goto L9;
    L12:
        List<C1578F> r03 = r1.getIgnoredErrors();
        if (r03 == null) goto L48;
        if (r03.isEmpty() == true) goto L48;
        HashSet r3 = new HashSet();
        C1962l r4 = r13.f5846q;
        if (r4 == null) goto L25;
        String r5 = r4.f6966b;
        if (r5 == null) goto L22;
        r3.add(r5);
    L22:
        String r42 = r4.f6965a;
        if (r42 == null) goto L25;
        r3.add(r42);
    L25:
        Throwable r43 = r13.m3605a();
        if (r43 == null) goto L28;
        r3.add(r43.toString());
    L28:
        Iterator<C1578F> r44 = r03.iterator();
    L30:
        if (r44.hasNext() == false) goto L34;
        if (r3.contains(r44.next().f5689a) == false) goto L30;
    L45:
        r1.getLogger().mo3680e(EnumC1657a2.DEBUG, "Event was dropped as it matched a string/pattern in ignoredErrors", new Object[]{r13.f5846q});
        r1.getClientReportRecorder().mo4041b(EnumC1853d.EVENT_PROCESSOR, EnumC1929n.Error);
        return C1970t.f7011b;
    L34:
        Iterator<C1578F> r04 = r03.iterator();
    L36:
        if (r04.hasNext() == false) goto L48;
        C1578F r45 = r04.next();
        Iterator r52 = r3.iterator();
    L39:
        if (r52.hasNext() == false) goto L36;
        String r6 = (String) r52.next();
        Pattern r7 = r45.f5690b;
        if (r7 != null) goto L43;
        boolean r62 = false;
    L44:
        if (r62 == false) goto L39;
    L43:
        r62 = r7.matcher(r6).matches();
    L48:
        if (m3661t(r13, r15) == false) goto L72;
        if (r14 == null) goto L69;
        m3653k(r13, r14);
        String r05 = r13.f5851v;
        C1953c r46 = r13.f5605b;
        if (r05 != null) goto L54;
        r13.f5851v = r14.mo3759I();
    L54:
        if (r13.f5852w != null) goto L61;
        List r06 = r14.mo3780x();
        if (r06 == null) goto L58;
        ArrayList r53 = new ArrayList(r06);
    L59:
        r13.f5852w = r53;
        goto L61
    L58:
        r53 = null;
    L61:
        if (r14.mo3753C() == null) goto L63;
        r13.f5850u = r14.mo3753C();
    L63:
        InterfaceC1876g0 r07 = r14.mo3776t();
        if (r46.mo4126h() != null) goto L68;
        if (r07 != null) goto L67;
        r46.mo4138t(C1621P2.m3735b(r14.mo3755E()));
        goto L68
    L67:
        r46.mo4138t(r07.mo3627m());
    L68:
        r13 = m3658q(r13, r15, r14.mo3757G());
    L69:
        if (r13 != null) goto L72;
        r1.getLogger().mo3680e(EnumC1657a2.DEBUG, "Event was dropped by applyScope", new Object[0]);
        return C1970t.f7011b;
    L72:
        C1627R1 r132 = m3658q(r13, r15, r1.getEventProcessors());
        if (r132 == null) goto L75;
        r1.getBeforeSend();
    L75:
        if (r132 == null) goto L77;
        if (r14 == null) goto L80;
        C1581F2 r08 = r14.mo3756F(new C2438r1(20));
    L81:
        boolean r47 = true;
        if (r08 == null) goto L91;
        if (r08.f5702g == EnumC1577E2.f5688Ok) goto L86;
        boolean r54 = true;
    L87:
        if (r54 == false) goto L91;
        C1581F2 r9 = null;
    L98:
        if (r1.getSampleRate() != null) goto L100;
        C2035g r55 = null;
    L102:
        if (r1.getSampleRate() == null) goto L108;
        if (r55 == null) goto L108;
        if (r1.getSampleRate().doubleValue() >= r55.m4179c()) goto L108;
        r1.getLogger().mo3680e(EnumC1657a2.DEBUG, "Event %s was dropped due to sampling decision.", new Object[]{r132.f5604a});
        r1.getClientReportRecorder().mo4041b(EnumC1853d.SAMPLE_RATE, EnumC1929n.Error);
        C1627R1 r72 = null;
    L109:
        if (r9 != null) goto L111;
    L110:
        boolean r133 = false;
    L123:
        if (r72 != null) goto L127;
        if (r133 == true) goto L127;
        r1.getLogger().mo3680e(EnumC1657a2.DEBUG, "Not sending session update for dropped event as it did not cause the session health to change.", new Object[0]);
        return C1970t.f7011b;
    L127:
        C1970t r134 = C1970t.f7011b;
        if (r72 == null) goto L132;
        C1970t r09 = r72.f5604a;
        if (r09 == null) goto L132;
        r134 = r09;
    L132:
        boolean r010 = InterfaceC1884b.class.isInstance(AbstractC1856a.m4072s(r15));
        if (InterfaceC1886d.class.isInstance(AbstractC1856a.m4072s(r15)) == true) goto L135;
    L137:
        boolean r56 = false;
    L138:
        if (r72 == null) goto L153;
        if (r010 == true) goto L153;
        if (r56 == true) goto L153;
        if (r72.m3739d() == false) goto L144;
    L148:
        InterfaceC1916k1 r011 = r1.getReplayController();
        if (r72.m3738c() != null) goto L152;
        r47 = false;
    L152:
        r011.mo3694f(Boolean.valueOf(r47));
        goto L153
    L144:
        if (r72.m3738c() == null) goto L146;
        boolean r012 = true;
    L147:
        if (r012 == false) goto L153;
    L146:
        r012 = false;
    L153:
        if (r72 != null) goto L186;
        String r013 = null;
    L156:
        C1613N2 r10 = m3657p(r14, r15, r72, r013);     // Catch: Throwable -> L160 IOException -> L162
        if (r72 == null) goto L164;
        ArrayList r8 = m3642o(r15);     // Catch: Throwable -> L160 IOException -> L162
    L184:
        C1901c r014 = m3654l(r72, r8, r9, r10, null);     // Catch: C1870b -> L170 IOException -> L172
        r15.m3666a();     // Catch: C1870b -> L170 IOException -> L172
        if (r014 == null) goto L174;
        r134 = m3660s(r014, r15);     // Catch: C1870b -> L170 IOException -> L172
    L174:
        if (r14 == null) goto L183;
        InterfaceC1895i0 r142 = r14.mo3763d();
        if (r142 == null) goto L183;
        if (InterfaceC1893k.class.isInstance(AbstractC1856a.m4072s(r15)) == false) goto L183;
        Object r015 = AbstractC1856a.m4072s(r15);
        if ((r015 instanceof AbstractC1885c) == false) goto L182;
        ((AbstractC1885c) r015).mo3741g(r142.mo3621g());
        r142.mo3622h(EnumC1605L2.ABORTED, false, r15);
        goto L183
    L182:
        r142.mo3622h(EnumC1605L2.ABORTED, false, null);
    L183:
        return r134;
    L170:
        e = e;
    L173:
        r1.getLogger().mo3682n(EnumC1657a2.WARNING, e, "Capturing event %s failed.", new Object[]{r134});
        r134 = C1970t.f7011b;
    L172:
        e = e;
    L160:
        e = e;
        goto L173
    L164:
        r8 = null;
        goto L184
    L186:
        r013 = r72.f5851v;     // Catch: Throwable -> L160 IOException -> L162
        goto L156
    L135:
        if (C1672O.class.isInstance(AbstractC1856a.m4072s(r15)) == true) goto L137;
        r56 = true;
        goto L138
    L111:
        if (r08 != null) goto L113;
    L112:
        r133 = true;
        goto L123
    L113:
        EnumC1577E2 r135 = r9.f5702g;
        EnumC1577E2 r57 = EnumC1577E2.Crashed;
        if (r135 != r57) goto L119;
        if (r08.f5702g != r57) goto L112;
    L119:
        if (r9.f5698c.get() <= 0) goto L110;
        if (r08.f5698c.get() > 0) goto L110;
    L108:
        r72 = r132;
        goto L109
    L100:
        r55 = AbstractC2036h.m4180a();
        goto L102
    L86:
        r54 = false;
    L91:
        if (AbstractC1856a.m4050F(r15) == false) goto L95;
        if (r14 == null) goto L94;
        C1581F2 r58 = r14.mo3756F(new C1572D1(this, r132, r15));
    L96:
        r9 = r58;
        goto L98
    L94:
        r1.getLogger().mo3680e(EnumC1657a2.INFO, "Scope is null on client.captureEvent", new Object[0]);
    L95:
        r58 = null;
        goto L96
    L80:
        r08 = null;
        goto L81
    L77:
        return C1970t.f7011b;
    L9:
        if (r1.getIgnoredExceptionsForType().contains(r02.getClass()) == false) goto L12;
        r1.getLogger().mo3680e(r2, "Event was dropped as the exception %s is ignored", new Object[]{r02.getClass()});
        r1.getClientReportRecorder().mo4041b(EnumC1853d.EVENT_PROCESSOR, EnumC1929n.Error);
        return C1970t.f7011b;
    }

    /* JADX INFO: renamed from: k */
    public final void m3653k(AbstractC1568C1 r5, InterfaceC1645X r6) {
        if (r6 != null) goto L4;
        return;
    L4:
        if (r5.f5607d != null) goto L7;
        r5.f5607d = r6.mo3762a();
    L7:
        if (r5.f5612i != null) goto L10;
        r5.f5612i = r6.mo3751A();
    L10:
        if (r5.f5608e != null) goto L12;
        r5.f5608e = new HashMap(new HashMap(r6.mo3761K()));
    L19:
        if (r5.f5616m != null) goto L21;
        r5.f5616m = new ArrayList(new ArrayList(r6.mo3782z()));
    L27:
        if (r5.f5618o != null) goto L29;
        r5.f5618o = new HashMap(new HashMap(r6.getExtras()));
    L35:
        C1953c r52 = r5.f5605b;
        Iterator r62 = new C1953c(r6.mo3773q()).f6889a.entrySet().iterator();
    L37:
        if (r62.hasNext() == false) goto L57;
        Map.Entry r0 = (Map.Entry) r62.next();
        if (r52.mo4119a(r0.getKey()) == true) goto L37;
        r52.mo4128j((String) r0.getKey(), r0.getValue());
        goto L37
    L57:
        return;
    L29:
        Iterator r02 = r6.getExtras().entrySet().iterator();
    L31:
        if (r02.hasNext() == false) goto L35;
        Map.Entry r1 = (Map.Entry) r02.next();
        if (r5.f5618o.containsKey(r1.getKey()) == true) goto L31;
        r5.f5618o.put((String) r1.getKey(), r1.getValue());
        goto L31
    L21:
        Queue r03 = r6.mo3782z();
        List r12 = r5.f5616m;
        if (r12 == null) goto L27;
        if (r03.isEmpty() == true) goto L27;
        r12.addAll(r03);
        Collections.sort(r12, this.f5694d);
        goto L27
    L12:
        Iterator r04 = r6.mo3761K().entrySet().iterator();
    L14:
        if (r04.hasNext() == false) goto L19;
        Map.Entry r13 = (Map.Entry) r04.next();
        if (r5.f5608e.containsKey(r13.getKey()) == true) goto L14;
        r5.f5608e.put((String) r13.getKey(), (String) r13.getValue());
        goto L14
    }

    /* JADX INFO: renamed from: l */
    public final C1901c m3654l(AbstractC1568C1 r21, ArrayList r22, C1581F2 r23, C1613N2 r24, C1881h1 r25) {
        ArrayList r6 = new ArrayList();
        C2046v2 r9 = this.f5692b;
        if (r21 == null) goto L5;
        InterfaceC1866e0 r2 = r9.getSerializer();
        Charset r3 = C1620P1.f5821d;
        AbstractC1856a.m4048D("ISerializer is required.", r2);
        C1901c r32 = new C1901c(new CallableC1600K1(1, r2, r21));
        r6.add(new C1620P1(new C1624Q1(EnumC1653Z1.resolve(r21), new CallableC1604L1(2, r32), "application/json", null, null), new CallableC1604L1(3, r32)));
        C1970t r11 = r21.f5604a;
    L6:
        if (r23 == null) goto L8;
        r6.add(C1620P1.m3730d(r9.getSerializer(), r23));
    L8:
        if (r25 == null) goto L12;
        long r26 = r9.getMaxTraceFileSize();
        InterfaceC1866e0 r5 = r9.getSerializer();
        Charset r0 = C1620P1.f5821d;
        File r1 = r25.f6735a;
        C1901c r12 = new C1901c(new CallableC1616O1(r1, r26, r25, r5));
        r6.add(new C1620P1(new C1624Q1(EnumC1653Z1.Profile, new CallableC1604L1(0, r12), "application-json", r1.getName(), null), new CallableC1604L1(1, r12)));
        if (r11 != null) goto L12;
        r11 = new C1970t(r25.f6757w);
    L12:
        if (r22 == null) goto L18;
        Iterator r02 = r22.iterator();
    L15:
        if (r02.hasNext() == false) goto L18;
        C1654a r13 = (C1654a) r02.next();
        InterfaceC1866e0 r16 = r9.getSerializer();
        ILogger r17 = r9.getLogger();
        long r14 = r9.getMaxAttachmentSize();
        Charset r15 = C1620P1.f5821d;
        C1901c r18 = new C1901c(new CallableC1616O1(r13, r14, r16, r17));
        r6.add(new C1620P1(new C1624Q1(EnumC1653Z1.Attachment, new CallableC1604L1(14, r18), r13.f5903e, r13.f5902d, r13.f5904f), new CallableC1604L1(15, r18)));
    L18:
        if (r6.isEmpty() == false) goto L20;
        return null;
    L20:
        return new C1901c(new C1596J1(r11, r9.getSdkVersion(), r24), r6);
    L5:
        r11 = null;
        goto L6
    }

    /* JADX INFO: renamed from: m */
    public final C1901c m3655m(C1864d2 r15) {
        ArrayList r0 = new ArrayList();
        C2046v2 r1 = this.f5692b;
        InterfaceC1866e0 r2 = r1.getSerializer();
        Charset r3 = C1620P1.f5821d;
        AbstractC1856a.m4048D("ISerializer is required.", r2);
        C1901c r32 = new C1901c(new CallableC1600K1(3, r2, r15));
        r0.add(new C1620P1(new C1624Q1(EnumC1653Z1.Log, new CallableC1604L1(6, r32), "application/vnd.sentry.items.log+json", null, null, null, Integer.valueOf(((List) r15.f6688b).size())), new CallableC1604L1(8, r32)));
        return new C1901c(new C1596J1(null, r1.getSdkVersion(), null), r0);
    }

    /* JADX INFO: renamed from: n */
    public final C1901c m3656n(final C2059x2 r18, final C1927m1 r19, C1613N2 r20, final boolean r21) {
        ArrayList r7 = new ArrayList();
        C2046v2 r9 = this.f5692b;
        final InterfaceC1866e0 r1 = r9.getSerializer();
        final ILogger r5 = r9.getLogger();
        Charset r0 = C1620P1.f5821d;
        final File r4 = r18.f7280p;
        C1901c r10 = new C1901c(new CallableC1608M1(r1, r18, r19, r4, r5, r21));
        r7.add(new C1620P1(new C1624Q1(EnumC1653Z1.ReplayVideo, new CallableC1604L1(9, r10), null, null, null), new CallableC1604L1(10, r10)));
        return new C1901c(new C1596J1(r18.f5604a, r9.getSessionReplay().f7315k, r20), r7);
    }

    /* JADX INFO: renamed from: p */
    public final C1613N2 m3657p(InterfaceC1645X r5, C1586H r6, AbstractC1568C1 r7, String r8) {
        boolean r62 = InterfaceC1884b.class.isInstance(AbstractC1856a.m4072s(r6));
        C2046v2 r0 = this.f5692b;
        if (r62 == false) goto L22;
        if (r7 == null) goto L29;
        r0.getLogger();
        C1832c r52 = new C1832c();
        C1953c r63 = r7.f5605b;
        C1589H2 r2 = r63.mo4126h();
        if (r2 == null) goto L8;
        String r22 = r2.f5738a.toString();
    L9:
        r52.m3996b("sentry-trace_id", r22);
        r52.m3996b("sentry-public_key", r0.retrieveParsedDsn().f7295b);
        r52.m3996b("sentry-release", r7.f5609f);
        r52.m3996b("sentry-environment", r7.f5610g);
        r52.m3996b("sentry-transaction", r8);
        if (r52.f6622e == false) goto L12;
        r52.f6620c = null;
    L12:
        r52.m3996b("sentry-sampled", null);
        if (r52.f6622e == false) goto L15;
        r52.f6621d = null;
    L15:
        Object r82 = r63.mo4121c("replay_id");
        if (r82 != null) goto L18;
    L20:
        r52.f6622e = false;
        return r52.m3998d();
    L18:
        if (r82.toString().equals(C1970t.f7011b.toString()) == true) goto L20;
        r52.m3996b("sentry-replay_id", r82.toString());
        r63.f6889a.remove("replay_id");
        goto L20
    L8:
        r22 = null;
    L29:
        return null;
    L22:
        if (r5 == null) goto L29;
        InterfaceC1895i0 r64 = r5.mo3763d();
        if (r64 == null) goto L28;
        return r64.mo3616b();
    L28:
        return ((C1832c) r5.mo3774r(new C0698Q9(12, r5, r0)).f6807d).m3998d();
    }

    /* JADX INFO: renamed from: q */
    public final C1627R1 m3658q(C1627R1 r8, C1586H r9, List r10) {
        C2046v2 r0 = this.f5692b;
        Iterator r102 = r10.iterator();
    L4:
        if (r102.hasNext() == false) goto L18;
        InterfaceC1566C r1 = (InterfaceC1566C) r102.next();
        boolean r2 = r1 instanceof C1747u;     // Catch: Throwable -> L14
        boolean r3 = InterfaceC1884b.class.isInstance(AbstractC1856a.m4072s(r9));     // Catch: Throwable -> L14
        if (r3 == false) goto L10;
        if (r2 == false) goto L10;
        ((C1747u) r1).mo3585i(r8, r9);     // Catch: Throwable -> L14
    L16:
        if (r8 != null) goto L4;
        r0.getLogger().mo3680e(EnumC1657a2.DEBUG, "Event was dropped by a processor: %s", new Object[]{r1.getClass().getName()});
        r0.getClientReportRecorder().mo4041b(EnumC1853d.EVENT_PROCESSOR, EnumC1929n.Error);
    L10:
        if (r3 == true) goto L16;
        if (r2 == true) goto L16;
        r8 = r1.mo3585i(r8, r9);     // Catch: Throwable -> L14
    L14:
        th = move-exception;
        r0.getLogger().mo3682n(EnumC1657a2.ERROR, th, "An exception occurred while processing event by processor: %s", new Object[]{r1.getClass().getName()});
    L18:
        return r8;
    }

    /* JADX INFO: renamed from: r */
    public final C1944A m3659r(C1944A r9, C1586H r10, List r11) {
        C2046v2 r0 = this.f5692b;
        Iterator r112 = r11.iterator();
    L4:
        if (r112.hasNext() == false) goto L17;
        InterfaceC1566C r1 = (InterfaceC1566C) r112.next();
        int r2 = r9.f6842s.size();
        r9 = r1.mo3584f(r9, r10);     // Catch: Throwable -> L8
    L10:
        if (r9 != null) goto L12;
        int r3 = 0;
    L13:
        if (r9 == null) goto L14;
        if (r3 >= r2) goto L4;
        int r22 = r2 - r3;
        r0.getLogger().mo3680e(EnumC1657a2.DEBUG, "%d spans were dropped by a processor: %s", new Object[]{Integer.valueOf(r22), r1.getClass().getName()});
        r0.getClientReportRecorder().mo4042c(EnumC1853d.EVENT_PROCESSOR, EnumC1929n.Span, r22);
        goto L4
    L14:
        r0.getLogger().mo3680e(EnumC1657a2.DEBUG, "Transaction was dropped by a processor: %s", new Object[]{r1.getClass().getName()});
        InterfaceC1855f r102 = r0.getClientReportRecorder();
        EnumC1853d r113 = EnumC1853d.EVENT_PROCESSOR;
        r102.mo4041b(r113, EnumC1929n.Transaction);
        r0.getClientReportRecorder().mo4042c(r113, EnumC1929n.Span, r2 + 1);
        goto L17
    L12:
        r3 = r9.f6842s.size();
    L8:
        th = move-exception;
        r0.getLogger().mo3682n(EnumC1657a2.ERROR, th, "An exception occurred while processing transaction by processor: %s", new Object[]{r1.getClass().getName()});
    L17:
        return r9;
    }

    /* JADX INFO: renamed from: s */
    public final C1970t m3660s(C1901c r6, C1586H r7) {
        C2046v2 r0 = this.f5692b;
        InterfaceC1917k2 r1 = r0.getBeforeEnvelopeCallback();
        if (r1 != null) goto L22;
    L12:
        C1650Y1.m3790d().m3793c(r0.getLogger());
        InterfaceC2012g r02 = this.f5693c;
        if (r7 != null) goto L15;
        r02.getClass();
        r02.mo4163j(r6, new C1586H());
    L16:
        C1970t r62 = ((C1596J1) r6.f6781b).f5755a;
        if (r62 == null) goto L20;
        return r62;
    L20:
        return C1970t.f7011b;
    L15:
        r02.mo4163j(r6, r7);
        goto L16
    L22:
        SpotlightIntegration r12 = (SpotlightIntegration) r1;     // Catch: Throwable -> L10
        r12.f5868c.submit(new RunnableC2260n3(21, r12, r6));     // Catch: RejectedExecutionException -> L7 Throwable -> L10
    L21:
        goto L12
    L7:
        e = move-exception;
        r12.f5867b.mo3683r(EnumC1657a2.WARNING, "Spotlight envelope submission rejected.", e);     // Catch: Throwable -> L10
    L10:
        th = move-exception;
        r0.getLogger().mo3683r(EnumC1657a2.ERROR, "The BeforeEnvelope callback threw an exception.", th);
        goto L12
    }

    /* JADX INFO: renamed from: t */
    public final boolean m3661t(AbstractC1568C1 r3, C1586H r4) {
        if (AbstractC1856a.m4050F(r4) == false) goto L6;
        return true;
    L6:
        this.f5692b.getLogger().mo3680e(EnumC1657a2.DEBUG, "Event was cached so not applying scope: %s", new Object[]{r3.f5604a});
        return false;
    }
}
