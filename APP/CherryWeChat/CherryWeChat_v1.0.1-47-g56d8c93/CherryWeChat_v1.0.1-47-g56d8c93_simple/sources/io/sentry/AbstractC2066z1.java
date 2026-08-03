package io.sentry;

import com.youth.banner.BuildConfig;
import io.sentry.android.core.SentryAndroidOptions;
import io.sentry.backpressure.C1831c;
import io.sentry.backpressure.RunnableC1829a;
import io.sentry.cache.C1838c;
import io.sentry.cache.InterfaceC1839d;
import io.sentry.config.AbstractC1856a;
import io.sentry.config.C1857b;
import io.sentry.config.C1858c;
import io.sentry.config.C1860e;
import io.sentry.hints.C1891i;
import io.sentry.internal.debugmeta.C1900b;
import io.sentry.internal.debugmeta.C1901c;
import io.sentry.internal.modules.C1906c;
import io.sentry.internal.modules.C1908e;
import io.sentry.internal.modules.C1909f;
import io.sentry.internal.modules.InterfaceC1904a;
import io.sentry.transport.C2014i;
import io.sentry.util.AbstractC2034f;
import io.sentry.util.AbstractC2037i;
import io.sentry.util.C2029a;
import io.sentry.util.thread.C2041b;
import io.sentry.util.thread.C2042c;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Properties;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.RejectedExecutionException;
import p000.C0698Q9;
import p000.RunnableC0562N2;

/* JADX INFO: renamed from: io.sentry.z1 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2066z1 {

    /* JADX INFO: renamed from: a */
    public static volatile InterfaceC1655a0 f7298a;

    /* JADX INFO: renamed from: b */
    public static volatile InterfaceC1651Z f7299b;

    /* JADX INFO: renamed from: c */
    public static final C1979q1 f7300c = null;

    /* JADX INFO: renamed from: d */
    public static volatile boolean f7301d;

    /* JADX INFO: renamed from: e */
    public static final Charset f7302e = null;

    /* JADX INFO: renamed from: f */
    public static final long f7303f = 0;

    /* JADX INFO: renamed from: g */
    public static final C2029a f7304g = null;

    static {
        f7298a = C1623Q0.f5829a;
        f7299b = C1615O0.f5812b;
        f7300c = new C1979q1(C2046v2.empty());
        f7301d = false;
        f7302e = Charset.forName("UTF-8");
        f7303f = System.currentTimeMillis();
        f7304g = new C2029a();
    }

    /* JADX INFO: renamed from: a */
    public static void m4232a() {
        C1981r r0 = f7304g.m4173a();
        InterfaceC1651Z r1 = m4233b();     // Catch: Throwable -> L6
        f7299b = C1615O0.f5812b;     // Catch: Throwable -> L6
        f7298a.close();     // Catch: Throwable -> L6
        r1.mo3707a(false);     // Catch: Throwable -> L6
        r0.close();
        return;
    L6:
        th = move-exception;
        r0.close();     // Catch: Throwable -> L9
    L11:
        throw th;
    L9:
        th = move-exception;
        th.addSuppressed(th);
        goto L11
    }

    /* JADX INFO: renamed from: b */
    public static InterfaceC1651Z m4233b() {
        if (f7301d == true) goto L5;
        InterfaceC1651Z r0 = f7298a.get();
        if (r0 != null) goto L9;
    L12:
        InterfaceC1651Z r02 = f7299b.mo3722q("getCurrentScopes");
        f7298a.mo3736a(r02);
        return r02;
    L9:
        if (r0.mo3724n() == true) goto L12;
        return r0;
    L5:
        return f7299b;
    }

    /* JADX WARN: Type inference failed for: r3v8, types: [java.lang.Object, java.util.Collection] */
    /* JADX INFO: renamed from: c */
    public static void m4234c(C1599K0 r8, C0698Q9 r9) {
        C2046v2 r82 = (C2046v2) SentryAndroidOptions.class.getDeclaredConstructor(null).newInstance(null);
        r9.m1428f(r82);     // Catch: Throwable -> L5
    L7:
        C1981r r1 = f7304g.m4173a();
    L15:
        th = move-exception;
        r1.close();     // Catch: Throwable -> L80
    L82:
        throw th;
    L80:
        th = move-exception;
        th.addSuppressed(th);
        goto L82
    L9:
        if (r82.getClass().getName().equals("io.sentry.android.core.SentryAndroidOptions") == true) goto L18;
        if (AbstractC2034f.f7219a == false) goto L18;
        throw new IllegalArgumentException("You are running Android. Please, use SentryAndroid.init. ".concat(r82.getClass().getName()));     // Catch: Throwable -> L15
    L18:
        if (m4237f(r82) == true) goto L20;
    L19:
        r1.close();
        return;
    L20:
        Boolean r92 = r82.isGlobalHubMode();     // Catch: Throwable -> L15
        int r2 = 1;
        if (r92 == null) goto L23;
        boolean r93 = r92.booleanValue();     // Catch: Throwable -> L15
    L24:
        r82.getLogger().mo3680e(EnumC1657a2.INFO, "GlobalHubMode: '%s'", new Object[]{String.valueOf(r93)});     // Catch: Throwable -> L15
        f7301d = r93;     // Catch: Throwable -> L15
        if ((r82.getFatalLogger() instanceof C1611N0) == false) goto L27;
        r82.setFatalLogger(new C1599K0());     // Catch: Throwable -> L15
    L27:
        C1979q1 r94 = f7300c;     // Catch: Throwable -> L15
        int r4 = 0;
        if (AbstractC1856a.m4051G(r94.f7089k, r82, m4233b().isEnabled()) == true) goto L30;
        r82.getLogger().mo3680e(EnumC1657a2.WARNING, "This init call has been ignored due to priority being too low.", new Object[0]);     // Catch: Throwable -> L15
        goto L19
    L30:
        if (m4233b().isEnabled() == false) goto L32;
        r82.getLogger().mo3680e(EnumC1657a2.WARNING, "Sentry has been already initialized. Previous configuration will be overwritten.", new Object[0]);     // Catch: Throwable -> L15
    L32:
        m4233b().mo3707a(true);     // Catch: Throwable -> L15
        r94.f7089k = r82;     // Catch: Throwable -> L15
        ?? r3 = r94.f7085g;     // Catch: Throwable -> L15
        r94.f7085g = C1979q1.m4154b(r82.getMaxBreadcrumbs());     // Catch: Throwable -> L15
        Iterator r32 = r3.iterator();     // Catch: Throwable -> L15
    L34:
        if (r32.hasNext() == false) goto L36;
        r94.mo3764f((C1871f) r32.next(), null);     // Catch: Throwable -> L15
        goto L34
    L36:
        f7299b = new C2045v1(new C1979q1(r82), new C1979q1(r82), r94);     // Catch: Throwable -> L15
        if (r82.isDebug() == true) goto L39;
    L41:
        m4236e(r82);     // Catch: Throwable -> L15
        f7298a.mo3736a(f7299b);     // Catch: Throwable -> L15
        m4235d(r82);     // Catch: Throwable -> L15
        r94.f7098t = new C1580F1(r82);     // Catch: Throwable -> L15
        if (r82.getExecutorService().isClosed() == false) goto L83;
        r82.setExecutorService(new C1638U1(r82));     // Catch: Throwable -> L15
        r82.getExecutorService().mo3700m();     // Catch: Throwable -> L15
    L83:
        r82.getExecutorService().submit(new RunnableC2062y1(r82, r4));     // Catch: Throwable -> L15 RejectedExecutionException -> L46
    L93:
        r82.getExecutorService().submit(new RunnableC1587H0(r4, r82));     // Catch: Throwable -> L50
    L52:
        Iterator<InterfaceC1935o0> r95 = r82.getIntegrations().iterator();     // Catch: Throwable -> L15
    L54:
        if (r95.hasNext() == false) goto L98;
        InterfaceC1935o0 r0 = r95.next();     // Catch: Throwable -> L15
        r0.mo3742p(r82);     // Catch: Throwable -> L58
    L58:
        th = move-exception;
        r82.getLogger().mo3683r(EnumC1657a2.WARNING, "Failed to register the integration " + r0.getClass().getName(), th);     // Catch: Throwable -> L15
        goto L54
    L98:
        r82.getExecutorService().submit(new RunnableC2062y1(r82, 2));     // Catch: Throwable -> L63
    L91:
        r82.getExecutorService().submit(new RunnableC1834c1(r82));     // Catch: Throwable -> L67
    L85:
        r82.getExecutorService().submit(new RunnableC2062y1(r82, r2));     // Catch: Throwable -> L72
    L74:
        ILogger r96 = r82.getLogger();     // Catch: Throwable -> L15
        EnumC1657a2 r02 = EnumC1657a2.DEBUG;     // Catch: Throwable -> L15
        r96.mo3680e(r02, "Using openTelemetryMode %s", new Object[]{r82.getOpenTelemetryMode()});     // Catch: Throwable -> L15
        r82.getLogger().mo3680e(r02, "Using span factory %s", new Object[]{r82.getSpanFactory().getClass().getName()});     // Catch: Throwable -> L15
        r82.getLogger().mo3680e(r02, "Using scopes storage %s", new Object[]{f7298a.getClass().getName()});     // Catch: Throwable -> L15
        goto L19
    L72:
        th = move-exception;
        r82.getLogger().mo3683r(EnumC1657a2.ERROR, "Failed to call the executor. App start profiling config will not be changed. Did you call Sentry.close()?", th);     // Catch: Throwable -> L15
    L67:
        th = move-exception;
        r82.getLogger().mo3683r(EnumC1657a2.DEBUG, "Failed to finalize previous session.", th);     // Catch: Throwable -> L15
        goto L85
    L63:
        th = move-exception;
        r82.getLogger().mo3683r(EnumC1657a2.DEBUG, "Failed to notify options observers.", th);     // Catch: Throwable -> L15
        goto L91
    L50:
        th = move-exception;
        r82.getLogger().mo3683r(EnumC1657a2.DEBUG, "Failed to move previous session.", th);     // Catch: Throwable -> L15
    L46:
        e = move-exception;
        r82.getLogger().mo3683r(EnumC1657a2.DEBUG, "Failed to call the executor. Lazy fields will not be loaded. Did you call Sentry.close()?", e);     // Catch: Throwable -> L15
        goto L93
    L39:
        if ((r82.getLogger() instanceof C1611N0) == false) goto L41;
        r82.setLogger(new C1599K0());     // Catch: Throwable -> L15
        goto L41
    L23:
        r93 = true;
    L5:
        th = move-exception;
        r82.getLogger().mo3683r(EnumC1657a2.ERROR, "Error in the 'OptionsConfiguration.configure' callback.", th);
        goto L7
    }

    /* JADX INFO: renamed from: d */
    public static void m4235d(C2046v2 r8) {
        ILogger r0 = r8.getLogger();
        EnumC1657a2 r1 = EnumC1657a2.INFO;
        r0.mo3680e(r1, "Initializing SDK with DSN: '%s'", new Object[]{r8.getDsn()});
        String r2 = r8.getOutboxPath();
        if (r2 == null) goto L5;
        new File(r2).mkdirs();
    L6:
        String r02 = r8.getCacheDirPath();
        if (r02 == null) goto L15;
        new File(r02).mkdirs();
        if ((r8.getEnvelopeDiskCache() instanceof C2014i) == false) goto L15;
        Charset r03 = C1838c.f6633i;
        String r04 = r8.getCacheDirPath();
        int r12 = r8.getMaxCacheItems();
        if (r04 != null) goto L13;
        r8.getLogger().mo3680e(EnumC1657a2.WARNING, "cacheDirPath is null, returning NoOpEnvelopeCache", new Object[0]);
        InterfaceC1839d r05 = C2014i.f7194a;
    L14:
        r8.setEnvelopeDiskCache(r05);
        goto L15
    L13:
        r05 = new C1838c(r8, r04, r12);
    L15:
        String r06 = r8.getProfilingTracesDirPath();
        if (r8.isProfilingEnabled() == false) goto L18;
    L19:
        if (r06 == null) goto L25;
        File r13 = new File(r06);
        r13.mkdirs();
        r8.getExecutorService().submit(new RunnableC0562N2(29, r13));     // Catch: RejectedExecutionException -> L23
    L23:
        e = move-exception;
        r8.getLogger().mo3683r(EnumC1657a2.ERROR, "Failed to call the executor. Old profiles will not be deleted. Did you call Sentry.close()?", e);
    L25:
        InterfaceC1904a r07 = r8.getModulesLoader();
        if (r8.isSendModules() == true) goto L29;
        r8.setModulesLoader(C1908e.f6796a);
    L32:
        if ((r8.getDebugMetaLoader() instanceof C1900b) == false) goto L34;
        r8.setDebugMetaLoader(new C1901c(r8.getLogger()));
    L34:
        List r08 = r8.getDebugMetaLoader().mo4098d();
        if (r08 == null) goto L64;
        if (r8.getBundleIds().isEmpty() == false) goto L47;
        Iterator r14 = r08.iterator();
    L40:
        if (r14.hasNext() == false) goto L47;
        String r22 = ((Properties) r14.next()).getProperty("io.sentry.bundle-ids");
        r8.getLogger().mo3680e(EnumC1657a2.DEBUG, "Bundle IDs found: %s", new Object[]{r22});
        if (r22 == null) goto L40;
        String[] r23 = r22.split(",", -1);
        int r4 = r23.length;
        int r5 = 0;
    L44:
        if (r5 >= r4) goto L40;
        r8.addBundleId(r23[r5]);
        r5 = r5 + 1;
    L47:
        if (r8.getProguardUuid() != null) goto L54;
        Iterator r15 = r08.iterator();
    L50:
        if (r15.hasNext() == false) goto L54;
        String r24 = ((Properties) r15.next()).getProperty("io.sentry.ProguardUuids");
        if (r24 == null) goto L50;
        r8.getLogger().mo3680e(EnumC1657a2.DEBUG, "Proguard UUID found: %s", new Object[]{r24});
        r8.setProguardUuid(r24);
    L54:
        Iterator r09 = r08.iterator();
    L56:
        if (r09.hasNext() == false) goto L64;
        Properties r16 = (Properties) r09.next();
        String r25 = r16.getProperty("io.sentry.build-tool");
        if (r25 == null) goto L56;
        String r010 = r16.getProperty("io.sentry.build-tool-version");
        if (r010 != null) goto L62;
        r010 = "unknown";
    L62:
        r8.getLogger().mo3680e(EnumC1657a2.DEBUG, "Build tool found: %s, version %s", new Object[]{r25, r010});
        C1650Y1.m3790d().m3792b(r25, r010);
    L64:
        if ((r8.getThreadChecker() instanceof C2041b) == false) goto L67;
        r8.setThreadChecker(C2042c.f7231b);
    L67:
        if (r8.getPerformanceCollectors().isEmpty() == false) goto L70;
        r8.addPerformanceCollector(new C1939p0());
    L70:
        if (r8.isEnableBackpressureHandling() == true) goto L72;
        return;
    L72:
        if (AbstractC2034f.f7219a == false) goto L74;
        return;
    L74:
        if ((r8.getBackpressureMonitor() instanceof C1831c) == false) goto L76;
        r8.setBackpressureMonitor(new RunnableC1829a(r8));
    L76:
        r8.getBackpressureMonitor().start();
        return;
    L29:
        if ((r07 instanceof C1908e) == false) goto L32;
        r8.setModulesLoader(new C1909f(Arrays.asList(new InterfaceC1904a[]{new C1906c(r8.getLogger()), new C1909f(r8.getLogger())}), r8.getLogger()));
        goto L32
    L18:
        if (r8.isContinuousProfilingEnabled() == false) goto L25;
    L5:
        r0.mo3680e(r1, "No outbox dir path is defined in options.", new Object[0]);
        goto L6
    }

    /* JADX INFO: renamed from: e */
    public static void m4236e(C2046v2 r6) {
        C1611N0 r0 = C1611N0.f5797a;
        boolean r1 = AbstractC2034f.f7219a;
        if (r1 == true) goto L16;
        EnumC1882h2 r2 = r6.getOpenTelemetryMode();
        if (EnumC1882h2.AUTO.equals(r2) == false) goto L16;
        if (C1891i.m4095e("io.sentry.opentelemetry.agent.AgentMarker", r0) == false) goto L11;
        r6.getLogger().mo3680e(EnumC1657a2.DEBUG, "openTelemetryMode has been inferred from AUTO to AGENT", new Object[0]);
        r6.setOpenTelemetryMode(EnumC1882h2.AGENT);
        goto L16
    L11:
        if (C1891i.m4095e("io.sentry.opentelemetry.agent.AgentlessMarker", r0) == false) goto L14;
        r6.getLogger().mo3680e(EnumC1657a2.DEBUG, "openTelemetryMode has been inferred from AUTO to AGENTLESS", new Object[0]);
        r6.setOpenTelemetryMode(EnumC1882h2.AGENTLESS);
        goto L16
    L14:
        if (C1891i.m4095e("io.sentry.opentelemetry.agent.AgentlessSpringMarker", r0) == false) goto L16;
        r6.getLogger().mo3680e(EnumC1657a2.DEBUG, "openTelemetryMode has been inferred from AUTO to AGENTLESS_SPRING", new Object[0]);
        r6.setOpenTelemetryMode(EnumC1882h2.AGENTLESS_SPRING);
    L16:
        EnumC1882h2 r22 = EnumC1882h2.OFF;
        if (r22 != r6.getOpenTelemetryMode()) goto L19;
        r6.setSpanFactory(new C1640V0(1));
    L19:
        f7298a.close();
        if (r22 != r6.getOpenTelemetryMode()) goto L22;
        f7298a = new C1998s();
    L37:
        if (AbstractC2034f.f7219a == true) goto L53;
        EnumC1882h2 r02 = r6.getOpenTelemetryMode();
        if (EnumC1882h2.OFF.equals(r02) == false) goto L41;
        List r03 = Collections.EMPTY_LIST;
    L49:
        Iterator r04 = r03.iterator();
    L51:
        if (r04.hasNext() == false) goto L58;
        r6.addIgnoredSpanOrigin((String) r04.next());
        goto L51
    L58:
        return;
    L41:
        ConcurrentHashMap r12 = AbstractC2037i.f7225a;
        ArrayList r13 = new ArrayList();
        EnumC1882h2 r23 = EnumC1882h2.AGENT;
        if (r23 != r02) goto L44;
    L45:
        r13.add("auto.http.spring_jakarta.webmvc");
        r13.add("auto.http.spring.webmvc");
        r13.add("auto.http.spring7.webmvc");
        r13.add("auto.spring_jakarta.webflux");
        r13.add("auto.spring.webflux");
        r13.add("auto.spring7.webflux");
        r13.add("auto.db.jdbc");
        r13.add("auto.http.spring_jakarta.webclient");
        r13.add("auto.http.spring.webclient");
        r13.add("auto.http.spring7.webclient");
        r13.add("auto.http.spring_jakarta.restclient");
        r13.add("auto.http.spring.restclient");
        r13.add("auto.http.spring7.restclient");
        r13.add("auto.http.spring_jakarta.resttemplate");
        r13.add("auto.http.spring.resttemplate");
        r13.add("auto.http.spring7.resttemplate");
        r13.add("auto.http.openfeign");
        r13.add("auto.http.ktor-client");
    L46:
        if (r23 != r02) goto L48;
        r13.add("auto.graphql.graphql");
        r13.add("auto.graphql.graphql22");
    L48:
        r03 = r13;
        goto L49
    L44:
        if (EnumC1882h2.AGENTLESS_SPRING != r02) goto L46;
    L53:
        return;
    L22:
        if (r1 == false) goto L24;
    L34:
        InterfaceC1655a0 r05 = new C1998s();
    L35:
        f7298a = r05;
        goto L37
    L24:
        if (C1891i.m4095e("io.sentry.opentelemetry.OtelContextScopesStorage", r0) == false) goto L34;
        Class r06 = C1891i.m4096h("io.sentry.opentelemetry.OtelContextScopesStorage", r0);
        if (r06 == null) goto L34;
        Object r07 = r06.getDeclaredConstructor(null).newInstance(null);     // Catch: Throwable -> L54
        if (r07 == null) goto L34;
        if ((r07 instanceof InterfaceC1655a0) == false) goto L34;
        r05 = (InterfaceC1655a0) r07;     // Catch: Throwable -> L54
        goto L35
    }

    /* JADX INFO: renamed from: f */
    public static boolean m4237f(C2046v2 r9) {
        if (r9.isEnableExternalConfiguration() == false) goto L132;
        String r0 = "sentry.properties";
        C1599K0 r1 = new C1599K0();
        ArrayList r2 = new ArrayList();
        r2.add(new C1860e("sentry.", System.getProperties()));
        r2.add(new C1858c());
        String r3 = System.getProperty("sentry.properties.file");
        if (r3 == null) goto L9;
        Properties r32 = new C1901c(r3, r1, 10, false).m4105o();
        if (r32 == null) goto L9;
        r2.add(new C1860e(r32));
    L9:
        String r33 = System.getenv("SENTRY_PROPERTIES_FILE");
        if (r33 == null) goto L14;
        Properties r34 = new C1901c(r33, r1, 10, false).m4105o();
        if (r34 == null) goto L14;
        r2.add(new C1860e(r34));
    L14:
        List r4 = null;
        InputStream r35 = AbstractC1856a.m4058d(AbstractC1856a.class.getClassLoader()).getResourceAsStream("sentry.properties");     // Catch: IOException -> L22
        if (r35 != null) goto L156;
        if (r35 == null) goto L39;
        r35.close();     // Catch: IOException -> L22
    L39:
        Properties r6 = null;
    L41:
        if (r6 == null) goto L43;
        r2.add(new C1860e(r6));
    L43:
        Properties r02 = new C1901c(r0, r1, 10, false).m4105o();
        if (r02 == null) goto L46;
        r2.add(new C1860e(r02));
    L46:
        C1857b r03 = new C1857b(r2);
        ILogger r12 = r9.getLogger();
        C1574E r22 = new C1574E();
        r22.f5658a = r03.getProperty("dsn");
        r22.f5659b = r03.getProperty("environment");
        r22.f5660c = r03.getProperty(BuildConfig.BUILD_TYPE);
        r22.f5661d = r03.getProperty("dist");
        r22.f5662e = r03.getProperty("servername");
        r22.f5663f = r03.m4083b("uncaught.handler.enabled");
        r22.f5679v = r03.m4083b("uncaught.handler.print-stacktrace");
        String r36 = r03.getProperty("traces-sample-rate");
        if (r36 != null) goto L150;
    L50:
        Double r37 = null;
    L51:
        r22.f5666i = r37;
        String r38 = r03.getProperty("profiles-sample-rate");
        if (r38 != null) goto L148;
    L55:
        Double r39 = null;
    L56:
        r22.f5667j = r39;
        r22.f5664g = r03.m4083b("debug");
        r22.f5665h = r03.m4083b("enable-deduplication");
        r22.f5680w = r03.m4083b("send-client-reports");
        r22.f5655J = r03.m4083b("force-init");
        String r310 = r03.getProperty("max-request-body-size");
        if (r310 == null) goto L59;
        r22.f5668k = EnumC2005t2.valueOf(r310.toUpperCase(Locale.ROOT));
    L59:
        Iterator r311 = ((ConcurrentHashMap) r03.mo4081a()).entrySet().iterator();
    L61:
        if (r311.hasNext() == false) goto L63;
        Map.Entry r5 = (Map.Entry) r311.next();
        r22.f5669l.put((String) r5.getKey(), (String) r5.getValue());
        goto L61
    L63:
        String r312 = r03.getProperty("proxy.host");
        String r52 = r03.getProperty("proxy.user");
        String r62 = r03.getProperty("proxy.pass");
        String r7 = r03.getProperty("proxy.port");
        if (r7 != null) goto L67;
        r7 = "80";
    L67:
        if (r312 == null) goto L69;
        C2001s2 r8 = new C2001s2();
        r8.f7168a = r312;
        r8.f7169b = r7;
        r8.f7170c = r52;
        r8.f7171d = r62;
        r22.f5670m = r8;
    L69:
        Iterator r313 = r03.m4085d("in-app-includes").iterator();
    L71:
        if (r313.hasNext() == false) goto L73;
        r22.f5672o.add((String) r313.next());
        goto L71
    L73:
        Iterator r314 = r03.m4085d("in-app-excludes").iterator();
    L75:
        if (r314.hasNext() == false) goto L78;
        r22.f5671n.add((String) r314.next());
        goto L75
    L78:
        if (r03.getProperty("trace-propagation-targets") == null) goto L80;
        List r315 = r03.m4085d("trace-propagation-targets");
    L81:
        if (r315 == null) goto L83;
    L85:
        if (r315 == null) goto L95;
        Iterator r316 = r315.iterator();
    L88:
        if (r316.hasNext() == false) goto L95;
        String r53 = (String) r316.next();
        if (r22.f5673p != null) goto L93;
        r22.f5673p = new CopyOnWriteArrayList();
    L93:
        if (r53.isEmpty() == true) goto L88;
        r22.f5673p.add(r53);
    L95:
        Iterator r317 = r03.m4085d("context-tags").iterator();
    L97:
        if (r317.hasNext() == false) goto L99;
        r22.f5674q.add((String) r317.next());
        goto L97
    L99:
        r22.f5675r = r03.getProperty("proguard-uuid");
        Iterator r318 = r03.m4085d("bundle-ids").iterator();
    L101:
        if (r318.hasNext() == false) goto L103;
        r22.f5681x.add((String) r318.next());
        goto L101
    L103:
        r22.f5676s = r03.m4084c("idle-timeout");
        String r319 = r03.getProperty("ignored-errors");
        if (r319 == null) goto L106;
        List r320 = Arrays.asList(r319.split(","));
    L107:
        r22.f5678u = r320;
        r22.f5682y = r03.m4083b("enabled");
        r22.f5683z = r03.m4083b("enable-pretty-serialization-output");
        r22.f5651F = r03.m4083b("send-modules");
        r22.f5652G = r03.m4083b("send-default-pii");
        String r321 = r03.getProperty("ignored-checkins");
        if (r321 == null) goto L110;
        List r322 = Arrays.asList(r321.split(","));
    L111:
        r22.f5649D = r322;
        String r323 = r03.getProperty("ignored-transactions");
        if (r323 == null) goto L114;
        r4 = Arrays.asList(r323.split(","));
    L114:
        r22.f5650E = r4;
        r22.f5653H = r03.m4083b("enable-backpressure-handling");
        r22.f5654I = r03.m4083b("global-hub-mode");
        r22.f5656K = r03.m4083b("capture-open-telemetry-events");
        r22.f5647B = r03.m4083b("logs.enabled");
        Iterator r324 = r03.m4085d("ignored-exceptions-for-type").iterator();
    L116:
        if (r324.hasNext() == false) goto L124;
        String r42 = (String) r324.next();
        Class<?> r54 = Class.forName(r42);     // Catch: ClassNotFoundException -> L123
        if (Throwable.class.isAssignableFrom(r54) == true) goto L120;
        r12.mo3680e(EnumC1657a2.WARNING, "Skipping setting %s as ignored-exception-for-type. Reason: %s does not extend Throwable", new Object[]{r42, r42});     // Catch: ClassNotFoundException -> L123
        goto L116
    L120:
        r22.f5677t.add(r54);     // Catch: ClassNotFoundException -> L123
    L123:
        r12.mo3680e(EnumC1657a2.WARNING, "Skipping setting %s as ignored-exception-for-type. Reason: %s class is not found", new Object[]{r42, r42});
        goto L116
    L124:
        Long r13 = r03.m4084c("cron.default-checkin-margin");
        Long r325 = r03.m4084c("cron.default-max-runtime");
        String r43 = r03.getProperty("cron.default-timezone");
        Long r55 = r03.m4084c("cron.default-failure-issue-threshold");
        Long r63 = r03.m4084c("cron.default-recovery-threshold");
        if (r13 != null) goto L130;
        if (r325 != null) goto L130;
        if (r43 != null) goto L130;
        if (r55 != null) goto L130;
        if (r63 != null) goto L130;
    L131:
        r22.f5646A = r03.m4083b("enable-spotlight");
        r22.f5648C = r03.getProperty("spotlight-connection-url");
        r9.merge(r22);
    L130:
        C1937o2 r72 = new C1937o2();
        r72.f6823a = r13;
        r72.f6824b = r325;
        r72.f6825c = r43;
        r72.f6826d = r55;
        r72.f6827e = r63;
        r22.f5657L = r72;
        goto L131
    L110:
        r322 = null;
        goto L111
    L106:
        r320 = null;
        goto L107
    L83:
        if (r03.getProperty("tracing-origins") == null) goto L85;
        r315 = r03.m4085d("tracing-origins");
        goto L85
    L80:
        r315 = null;
        goto L81
    L148:
        r39 = Double.valueOf(r38);     // Catch: NumberFormatException -> L145
    L150:
        r37 = Double.valueOf(r36);     // Catch: NumberFormatException -> L146
    L156:
        BufferedInputStream r56 = new BufferedInputStream(r35);     // Catch: Throwable -> L24
        r6 = new Properties();     // Catch: Throwable -> L26
        r6.load(r56);     // Catch: Throwable -> L26
        r56.close();     // Catch: Throwable -> L24
        r35.close();     // Catch: IOException -> L22
        goto L41
    L26:
        th = move-exception;
        r56.close();     // Catch: Throwable -> L29
    L31:
        throw th;     // Catch: Throwable -> L24
    L29:
        th = move-exception;
        th.addSuppressed(th);     // Catch: Throwable -> L24
    L24:
        th = move-exception;
        r35.close();     // Catch: Throwable -> L34
    L36:
        throw th;     // Catch: IOException -> L22
    L34:
        th = move-exception;
        th.addSuppressed(th);     // Catch: IOException -> L22
    L22:
        e = move-exception;
        r1.mo3682n(EnumC1657a2.ERROR, e, "Failed to load Sentry configuration from classpath resource: %s", new Object[]{"sentry.properties"});
    L132:
        String r04 = r9.getDsn();
        if (r9.isEnabled() == false) goto L143;
        if (r04 != null) goto L136;
    L138:
        if (r04 == null) goto L142;
        r9.retrieveParsedDsn();
        return true;
    L142:
        throw new IllegalArgumentException("DSN is required. Use empty string or set enabled to false in SentryOptions to disable SDK.");
    L136:
        if (r04.isEmpty() == false) goto L138;
    L143:
        m4232a();
        return false;
    }
}
