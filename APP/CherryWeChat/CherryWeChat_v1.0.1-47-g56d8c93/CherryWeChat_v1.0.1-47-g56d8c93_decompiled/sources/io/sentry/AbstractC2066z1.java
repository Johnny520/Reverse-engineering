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
import java.lang.reflect.InvocationTargetException;
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
    public static volatile InterfaceC1655a0 f7298a = C1623Q0.f5829a;

    /* JADX INFO: renamed from: b */
    public static volatile InterfaceC1651Z f7299b = C1615O0.f5812b;

    /* JADX INFO: renamed from: c */
    public static final C1979q1 f7300c = new C1979q1(C2046v2.empty());

    /* JADX INFO: renamed from: d */
    public static volatile boolean f7301d = false;

    /* JADX INFO: renamed from: e */
    public static final Charset f7302e = Charset.forName("UTF-8");

    /* JADX INFO: renamed from: f */
    public static final long f7303f = System.currentTimeMillis();

    /* JADX INFO: renamed from: g */
    public static final C2029a f7304g = new C2029a();

    /* JADX INFO: renamed from: a */
    public static void m4232a() {
        C1981r c1981rM4173a = f7304g.m4173a();
        try {
            InterfaceC1651Z interfaceC1651ZM4233b = m4233b();
            f7299b = C1615O0.f5812b;
            f7298a.close();
            interfaceC1651ZM4233b.mo3707a(false);
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

    /* JADX INFO: renamed from: b */
    public static InterfaceC1651Z m4233b() {
        if (f7301d) {
            return f7299b;
        }
        InterfaceC1651Z interfaceC1651Z = f7298a.get();
        if (interfaceC1651Z != null && !interfaceC1651Z.mo3724n()) {
            return interfaceC1651Z;
        }
        InterfaceC1651Z interfaceC1651ZMo3722q = f7299b.mo3722q("getCurrentScopes");
        f7298a.mo3736a(interfaceC1651ZMo3722q);
        return interfaceC1651ZMo3722q;
    }

    /* JADX WARN: Type inference failed for: r3v8, types: [java.lang.Object, java.util.Collection] */
    /* JADX INFO: renamed from: c */
    public static void m4234c(C1599K0 c1599k0, C0698Q9 c0698q9) {
        C2046v2 c2046v2 = (C2046v2) SentryAndroidOptions.class.getDeclaredConstructor(null).newInstance(null);
        try {
            c0698q9.m1428f(c2046v2);
        } catch (Throwable th) {
            c2046v2.getLogger().mo3683r(EnumC1657a2.ERROR, "Error in the 'OptionsConfiguration.configure' callback.", th);
        }
        C1981r c1981rM4173a = f7304g.m4173a();
        try {
            if (!c2046v2.getClass().getName().equals("io.sentry.android.core.SentryAndroidOptions") && AbstractC2034f.f7219a) {
                throw new IllegalArgumentException("You are running Android. Please, use SentryAndroid.init. ".concat(c2046v2.getClass().getName()));
            }
            if (m4237f(c2046v2)) {
                Boolean boolIsGlobalHubMode = c2046v2.isGlobalHubMode();
                int i = 1;
                boolean zBooleanValue = boolIsGlobalHubMode != null ? boolIsGlobalHubMode.booleanValue() : true;
                c2046v2.getLogger().mo3680e(EnumC1657a2.INFO, "GlobalHubMode: '%s'", String.valueOf(zBooleanValue));
                f7301d = zBooleanValue;
                if (c2046v2.getFatalLogger() instanceof C1611N0) {
                    c2046v2.setFatalLogger(new C1599K0());
                }
                C1979q1 c1979q1 = f7300c;
                int i2 = 0;
                if (AbstractC1856a.m4051G(c1979q1.f7089k, c2046v2, m4233b().isEnabled())) {
                    if (m4233b().isEnabled()) {
                        c2046v2.getLogger().mo3680e(EnumC1657a2.WARNING, "Sentry has been already initialized. Previous configuration will be overwritten.", new Object[0]);
                    }
                    m4233b().mo3707a(true);
                    c1979q1.f7089k = c2046v2;
                    ?? r3 = c1979q1.f7085g;
                    c1979q1.f7085g = C1979q1.m4154b(c2046v2.getMaxBreadcrumbs());
                    Iterator it = r3.iterator();
                    while (it.hasNext()) {
                        c1979q1.mo3764f((C1871f) it.next(), null);
                    }
                    f7299b = new C2045v1(new C1979q1(c2046v2), new C1979q1(c2046v2), c1979q1);
                    if (c2046v2.isDebug() && (c2046v2.getLogger() instanceof C1611N0)) {
                        c2046v2.setLogger(new C1599K0());
                    }
                    m4236e(c2046v2);
                    f7298a.mo3736a(f7299b);
                    m4235d(c2046v2);
                    c1979q1.f7098t = new C1580F1(c2046v2);
                    if (c2046v2.getExecutorService().isClosed()) {
                        c2046v2.setExecutorService(new C1638U1(c2046v2));
                        c2046v2.getExecutorService().mo3700m();
                    }
                    try {
                        c2046v2.getExecutorService().submit(new RunnableC2062y1(c2046v2, i2));
                    } catch (RejectedExecutionException e) {
                        c2046v2.getLogger().mo3683r(EnumC1657a2.DEBUG, "Failed to call the executor. Lazy fields will not be loaded. Did you call Sentry.close()?", e);
                    }
                    try {
                        c2046v2.getExecutorService().submit(new RunnableC1587H0(i2, c2046v2));
                    } catch (Throwable th2) {
                        c2046v2.getLogger().mo3683r(EnumC1657a2.DEBUG, "Failed to move previous session.", th2);
                    }
                    for (InterfaceC1935o0 interfaceC1935o0 : c2046v2.getIntegrations()) {
                        try {
                            interfaceC1935o0.mo3742p(c2046v2);
                        } catch (Throwable th3) {
                            c2046v2.getLogger().mo3683r(EnumC1657a2.WARNING, "Failed to register the integration " + interfaceC1935o0.getClass().getName(), th3);
                        }
                    }
                    try {
                        c2046v2.getExecutorService().submit(new RunnableC2062y1(c2046v2, 2));
                    } catch (Throwable th4) {
                        c2046v2.getLogger().mo3683r(EnumC1657a2.DEBUG, "Failed to notify options observers.", th4);
                    }
                    try {
                        c2046v2.getExecutorService().submit(new RunnableC1834c1(c2046v2));
                    } catch (Throwable th5) {
                        c2046v2.getLogger().mo3683r(EnumC1657a2.DEBUG, "Failed to finalize previous session.", th5);
                    }
                    try {
                        c2046v2.getExecutorService().submit(new RunnableC2062y1(c2046v2, i));
                    } catch (Throwable th6) {
                        c2046v2.getLogger().mo3683r(EnumC1657a2.ERROR, "Failed to call the executor. App start profiling config will not be changed. Did you call Sentry.close()?", th6);
                    }
                    ILogger logger = c2046v2.getLogger();
                    EnumC1657a2 enumC1657a2 = EnumC1657a2.DEBUG;
                    logger.mo3680e(enumC1657a2, "Using openTelemetryMode %s", c2046v2.getOpenTelemetryMode());
                    c2046v2.getLogger().mo3680e(enumC1657a2, "Using span factory %s", c2046v2.getSpanFactory().getClass().getName());
                    c2046v2.getLogger().mo3680e(enumC1657a2, "Using scopes storage %s", f7298a.getClass().getName());
                } else {
                    c2046v2.getLogger().mo3680e(EnumC1657a2.WARNING, "This init call has been ignored due to priority being too low.", new Object[0]);
                }
            }
            c1981rM4173a.close();
        } catch (Throwable th7) {
            try {
                c1981rM4173a.close();
            } catch (Throwable th8) {
                th7.addSuppressed(th8);
            }
            throw th7;
        }
    }

    /* JADX INFO: renamed from: d */
    public static void m4235d(C2046v2 c2046v2) {
        InterfaceC1839d c1838c;
        ILogger logger = c2046v2.getLogger();
        EnumC1657a2 enumC1657a2 = EnumC1657a2.INFO;
        logger.mo3680e(enumC1657a2, "Initializing SDK with DSN: '%s'", c2046v2.getDsn());
        String outboxPath = c2046v2.getOutboxPath();
        if (outboxPath != null) {
            new File(outboxPath).mkdirs();
        } else {
            logger.mo3680e(enumC1657a2, "No outbox dir path is defined in options.", new Object[0]);
        }
        String cacheDirPath = c2046v2.getCacheDirPath();
        if (cacheDirPath != null) {
            new File(cacheDirPath).mkdirs();
            if (c2046v2.getEnvelopeDiskCache() instanceof C2014i) {
                Charset charset = C1838c.f6633i;
                String cacheDirPath2 = c2046v2.getCacheDirPath();
                int maxCacheItems = c2046v2.getMaxCacheItems();
                if (cacheDirPath2 == null) {
                    c2046v2.getLogger().mo3680e(EnumC1657a2.WARNING, "cacheDirPath is null, returning NoOpEnvelopeCache", new Object[0]);
                    c1838c = C2014i.f7194a;
                } else {
                    c1838c = new C1838c(c2046v2, cacheDirPath2, maxCacheItems);
                }
                c2046v2.setEnvelopeDiskCache(c1838c);
            }
        }
        String profilingTracesDirPath = c2046v2.getProfilingTracesDirPath();
        if ((c2046v2.isProfilingEnabled() || c2046v2.isContinuousProfilingEnabled()) && profilingTracesDirPath != null) {
            File file = new File(profilingTracesDirPath);
            file.mkdirs();
            try {
                c2046v2.getExecutorService().submit(new RunnableC0562N2(29, file));
            } catch (RejectedExecutionException e) {
                c2046v2.getLogger().mo3683r(EnumC1657a2.ERROR, "Failed to call the executor. Old profiles will not be deleted. Did you call Sentry.close()?", e);
            }
        }
        InterfaceC1904a modulesLoader = c2046v2.getModulesLoader();
        if (!c2046v2.isSendModules()) {
            c2046v2.setModulesLoader(C1908e.f6796a);
        } else if (modulesLoader instanceof C1908e) {
            c2046v2.setModulesLoader(new C1909f(Arrays.asList(new C1906c(c2046v2.getLogger()), new C1909f(c2046v2.getLogger())), c2046v2.getLogger()));
        }
        if (c2046v2.getDebugMetaLoader() instanceof C1900b) {
            c2046v2.setDebugMetaLoader(new C1901c(c2046v2.getLogger()));
        }
        List listMo4098d = c2046v2.getDebugMetaLoader().mo4098d();
        if (listMo4098d != null) {
            if (c2046v2.getBundleIds().isEmpty()) {
                Iterator it = listMo4098d.iterator();
                while (it.hasNext()) {
                    String property = ((Properties) it.next()).getProperty("io.sentry.bundle-ids");
                    c2046v2.getLogger().mo3680e(EnumC1657a2.DEBUG, "Bundle IDs found: %s", property);
                    if (property != null) {
                        for (String str : property.split(",", -1)) {
                            c2046v2.addBundleId(str);
                        }
                    }
                }
            }
            if (c2046v2.getProguardUuid() == null) {
                Iterator it2 = listMo4098d.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        break;
                    }
                    String property2 = ((Properties) it2.next()).getProperty("io.sentry.ProguardUuids");
                    if (property2 != null) {
                        c2046v2.getLogger().mo3680e(EnumC1657a2.DEBUG, "Proguard UUID found: %s", property2);
                        c2046v2.setProguardUuid(property2);
                        break;
                    }
                }
            }
            Iterator it3 = listMo4098d.iterator();
            while (true) {
                if (!it3.hasNext()) {
                    break;
                }
                Properties properties = (Properties) it3.next();
                String property3 = properties.getProperty("io.sentry.build-tool");
                if (property3 != null) {
                    String property4 = properties.getProperty("io.sentry.build-tool-version");
                    if (property4 == null) {
                        property4 = "unknown";
                    }
                    c2046v2.getLogger().mo3680e(EnumC1657a2.DEBUG, "Build tool found: %s, version %s", property3, property4);
                    C1650Y1.m3790d().m3792b(property3, property4);
                }
            }
        }
        if (c2046v2.getThreadChecker() instanceof C2041b) {
            c2046v2.setThreadChecker(C2042c.f7231b);
        }
        if (c2046v2.getPerformanceCollectors().isEmpty()) {
            c2046v2.addPerformanceCollector(new C1939p0());
        }
        if (!c2046v2.isEnableBackpressureHandling() || AbstractC2034f.f7219a) {
            return;
        }
        if (c2046v2.getBackpressureMonitor() instanceof C1831c) {
            c2046v2.setBackpressureMonitor(new RunnableC1829a(c2046v2));
        }
        c2046v2.getBackpressureMonitor().start();
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x00aa  */
    /* JADX INFO: renamed from: e */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void m4236e(C2046v2 c2046v2) {
        InterfaceC1655a0 c1998s;
        Class clsM4096h;
        List list;
        C1611N0 c1611n0 = C1611N0.f5797a;
        boolean z = AbstractC2034f.f7219a;
        if (!z) {
            if (EnumC1882h2.AUTO.equals(c2046v2.getOpenTelemetryMode())) {
                if (C1891i.m4095e("io.sentry.opentelemetry.agent.AgentMarker", c1611n0)) {
                    c2046v2.getLogger().mo3680e(EnumC1657a2.DEBUG, "openTelemetryMode has been inferred from AUTO to AGENT", new Object[0]);
                    c2046v2.setOpenTelemetryMode(EnumC1882h2.AGENT);
                } else if (C1891i.m4095e("io.sentry.opentelemetry.agent.AgentlessMarker", c1611n0)) {
                    c2046v2.getLogger().mo3680e(EnumC1657a2.DEBUG, "openTelemetryMode has been inferred from AUTO to AGENTLESS", new Object[0]);
                    c2046v2.setOpenTelemetryMode(EnumC1882h2.AGENTLESS);
                } else if (C1891i.m4095e("io.sentry.opentelemetry.agent.AgentlessSpringMarker", c1611n0)) {
                    c2046v2.getLogger().mo3680e(EnumC1657a2.DEBUG, "openTelemetryMode has been inferred from AUTO to AGENTLESS_SPRING", new Object[0]);
                    c2046v2.setOpenTelemetryMode(EnumC1882h2.AGENTLESS_SPRING);
                }
            }
        }
        EnumC1882h2 enumC1882h2 = EnumC1882h2.OFF;
        if (enumC1882h2 == c2046v2.getOpenTelemetryMode()) {
            c2046v2.setSpanFactory(new C1640V0(1));
        }
        f7298a.close();
        if (enumC1882h2 == c2046v2.getOpenTelemetryMode()) {
            f7298a = new C1998s();
        } else if (z || !C1891i.m4095e("io.sentry.opentelemetry.OtelContextScopesStorage", c1611n0) || (clsM4096h = C1891i.m4096h("io.sentry.opentelemetry.OtelContextScopesStorage", c1611n0)) == null) {
            c1998s = new C1998s();
            f7298a = c1998s;
        } else {
            try {
                Object objNewInstance = clsM4096h.getDeclaredConstructor(null).newInstance(null);
                if (objNewInstance != null && (objNewInstance instanceof InterfaceC1655a0)) {
                    c1998s = (InterfaceC1655a0) objNewInstance;
                }
            } catch (IllegalAccessException | InstantiationException | NoSuchMethodException | InvocationTargetException unused) {
            }
            f7298a = c1998s;
        }
        if (AbstractC2034f.f7219a) {
            return;
        }
        EnumC1882h2 openTelemetryMode = c2046v2.getOpenTelemetryMode();
        if (EnumC1882h2.OFF.equals(openTelemetryMode)) {
            list = Collections.EMPTY_LIST;
        } else {
            ConcurrentHashMap concurrentHashMap = AbstractC2037i.f7225a;
            ArrayList arrayList = new ArrayList();
            EnumC1882h2 enumC1882h22 = EnumC1882h2.AGENT;
            if (enumC1882h22 == openTelemetryMode || EnumC1882h2.AGENTLESS_SPRING == openTelemetryMode) {
                arrayList.add("auto.http.spring_jakarta.webmvc");
                arrayList.add("auto.http.spring.webmvc");
                arrayList.add("auto.http.spring7.webmvc");
                arrayList.add("auto.spring_jakarta.webflux");
                arrayList.add("auto.spring.webflux");
                arrayList.add("auto.spring7.webflux");
                arrayList.add("auto.db.jdbc");
                arrayList.add("auto.http.spring_jakarta.webclient");
                arrayList.add("auto.http.spring.webclient");
                arrayList.add("auto.http.spring7.webclient");
                arrayList.add("auto.http.spring_jakarta.restclient");
                arrayList.add("auto.http.spring.restclient");
                arrayList.add("auto.http.spring7.restclient");
                arrayList.add("auto.http.spring_jakarta.resttemplate");
                arrayList.add("auto.http.spring.resttemplate");
                arrayList.add("auto.http.spring7.resttemplate");
                arrayList.add("auto.http.openfeign");
                arrayList.add("auto.http.ktor-client");
            }
            if (enumC1882h22 == openTelemetryMode) {
                arrayList.add("auto.graphql.graphql");
                arrayList.add("auto.graphql.graphql22");
            }
            list = arrayList;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            c2046v2.addIgnoredSpanOrigin((String) it.next());
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x0278 A[LOOP:5: B:100:0x0272->B:102:0x0278, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0296  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x029f  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x02ca  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x02d3  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x02de  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0318  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x0370  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x0131 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:150:0x0121 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0126  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0136  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0161  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0181 A[LOOP:0: B:60:0x017b->B:62:0x0181, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:66:0x01b4  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x01b8  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x01d7 A[LOOP:1: B:70:0x01d1->B:72:0x01d7, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:76:0x01f3 A[LOOP:2: B:74:0x01ed->B:76:0x01f3, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0207  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x020c  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x021d  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0254 A[LOOP:4: B:96:0x024e->B:98:0x0254, LOOP_END] */
    /* JADX INFO: renamed from: f */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static boolean m4237f(C2046v2 c2046v2) {
        Properties properties;
        Properties propertiesM4105o;
        String property;
        Double dValueOf;
        String property2;
        Double dValueOf2;
        String property3;
        String property4;
        String property5;
        Iterator it;
        Iterator it2;
        List<String> listM4085d;
        Iterator it3;
        Iterator it4;
        Long lM4084c;
        Long lM4084c2;
        String property6;
        Long lM4084c3;
        Long lM4084c4;
        InputStream resourceAsStream;
        Properties propertiesM4105o2;
        Properties propertiesM4105o3;
        if (c2046v2.isEnableExternalConfiguration()) {
            String str = "sentry.properties";
            C1599K0 c1599k0 = new C1599K0();
            ArrayList arrayList = new ArrayList();
            arrayList.add(new C1860e("sentry.", System.getProperties()));
            arrayList.add(new C1858c());
            String property7 = System.getProperty("sentry.properties.file");
            if (property7 != null && (propertiesM4105o3 = new C1901c(property7, c1599k0, 10, false).m4105o()) != null) {
                arrayList.add(new C1860e(propertiesM4105o3));
            }
            String str2 = System.getenv("SENTRY_PROPERTIES_FILE");
            if (str2 != null && (propertiesM4105o2 = new C1901c(str2, c1599k0, 10, false).m4105o()) != null) {
                arrayList.add(new C1860e(propertiesM4105o2));
            }
            try {
                resourceAsStream = AbstractC1856a.m4058d(AbstractC1856a.class.getClassLoader()).getResourceAsStream("sentry.properties");
            } catch (IOException e) {
                c1599k0.mo3682n(EnumC1657a2.ERROR, e, "Failed to load Sentry configuration from classpath resource: %s", "sentry.properties");
            }
            if (resourceAsStream != null) {
                try {
                    BufferedInputStream bufferedInputStream = new BufferedInputStream(resourceAsStream);
                    try {
                        properties = new Properties();
                        properties.load(bufferedInputStream);
                        bufferedInputStream.close();
                        resourceAsStream.close();
                        if (properties != null) {
                            arrayList.add(new C1860e(properties));
                        }
                        propertiesM4105o = new C1901c(str, c1599k0, 10, false).m4105o();
                        if (propertiesM4105o != null) {
                            arrayList.add(new C1860e(propertiesM4105o));
                        }
                        C1857b c1857b = new C1857b(arrayList);
                        ILogger logger = c2046v2.getLogger();
                        C1574E c1574e = new C1574E();
                        c1574e.f5658a = c1857b.getProperty("dsn");
                        c1574e.f5659b = c1857b.getProperty("environment");
                        c1574e.f5660c = c1857b.getProperty(BuildConfig.BUILD_TYPE);
                        c1574e.f5661d = c1857b.getProperty("dist");
                        c1574e.f5662e = c1857b.getProperty("servername");
                        c1574e.f5663f = c1857b.m4083b("uncaught.handler.enabled");
                        c1574e.f5679v = c1857b.m4083b("uncaught.handler.print-stacktrace");
                        property = c1857b.getProperty("traces-sample-rate");
                        if (property == null) {
                            try {
                                dValueOf = Double.valueOf(property);
                            } catch (NumberFormatException unused) {
                                dValueOf = null;
                            }
                            c1574e.f5666i = dValueOf;
                            property2 = c1857b.getProperty("profiles-sample-rate");
                            if (property2 == null) {
                                try {
                                    dValueOf2 = Double.valueOf(property2);
                                } catch (NumberFormatException unused2) {
                                    dValueOf2 = null;
                                }
                                c1574e.f5667j = dValueOf2;
                                c1574e.f5664g = c1857b.m4083b("debug");
                                c1574e.f5665h = c1857b.m4083b("enable-deduplication");
                                c1574e.f5680w = c1857b.m4083b("send-client-reports");
                                c1574e.f5655J = c1857b.m4083b("force-init");
                                property3 = c1857b.getProperty("max-request-body-size");
                                if (property3 != null) {
                                    c1574e.f5668k = EnumC2005t2.valueOf(property3.toUpperCase(Locale.ROOT));
                                }
                                for (Map.Entry entry : ((ConcurrentHashMap) c1857b.mo4081a()).entrySet()) {
                                    c1574e.f5669l.put((String) entry.getKey(), (String) entry.getValue());
                                }
                                property4 = c1857b.getProperty("proxy.host");
                                String property8 = c1857b.getProperty("proxy.user");
                                String property9 = c1857b.getProperty("proxy.pass");
                                property5 = c1857b.getProperty("proxy.port");
                                if (property5 == null) {
                                    property5 = "80";
                                }
                                if (property4 != null) {
                                    C2001s2 c2001s2 = new C2001s2();
                                    c2001s2.f7168a = property4;
                                    c2001s2.f7169b = property5;
                                    c2001s2.f7170c = property8;
                                    c2001s2.f7171d = property9;
                                    c1574e.f5670m = c2001s2;
                                }
                                it = c1857b.m4085d("in-app-includes").iterator();
                                while (it.hasNext()) {
                                    c1574e.f5672o.add((String) it.next());
                                }
                                it2 = c1857b.m4085d("in-app-excludes").iterator();
                                while (it2.hasNext()) {
                                    c1574e.f5671n.add((String) it2.next());
                                }
                                listM4085d = c1857b.getProperty("trace-propagation-targets") == null ? c1857b.m4085d("trace-propagation-targets") : null;
                                if (listM4085d == null && c1857b.getProperty("tracing-origins") != null) {
                                    listM4085d = c1857b.m4085d("tracing-origins");
                                }
                                if (listM4085d != null) {
                                    for (String str3 : listM4085d) {
                                        if (c1574e.f5673p == null) {
                                            c1574e.f5673p = new CopyOnWriteArrayList();
                                        }
                                        if (!str3.isEmpty()) {
                                            c1574e.f5673p.add(str3);
                                        }
                                    }
                                }
                                it3 = c1857b.m4085d("context-tags").iterator();
                                while (it3.hasNext()) {
                                    c1574e.f5674q.add((String) it3.next());
                                }
                                c1574e.f5675r = c1857b.getProperty("proguard-uuid");
                                it4 = c1857b.m4085d("bundle-ids").iterator();
                                while (it4.hasNext()) {
                                    c1574e.f5681x.add((String) it4.next());
                                }
                                c1574e.f5676s = c1857b.m4084c("idle-timeout");
                                String property10 = c1857b.getProperty("ignored-errors");
                                c1574e.f5678u = property10 == null ? Arrays.asList(property10.split(",")) : null;
                                c1574e.f5682y = c1857b.m4083b("enabled");
                                c1574e.f5683z = c1857b.m4083b("enable-pretty-serialization-output");
                                c1574e.f5651F = c1857b.m4083b("send-modules");
                                c1574e.f5652G = c1857b.m4083b("send-default-pii");
                                String property11 = c1857b.getProperty("ignored-checkins");
                                c1574e.f5649D = property11 == null ? Arrays.asList(property11.split(",")) : null;
                                String property12 = c1857b.getProperty("ignored-transactions");
                                c1574e.f5650E = property12 != null ? Arrays.asList(property12.split(",")) : null;
                                c1574e.f5653H = c1857b.m4083b("enable-backpressure-handling");
                                c1574e.f5654I = c1857b.m4083b("global-hub-mode");
                                c1574e.f5656K = c1857b.m4083b("capture-open-telemetry-events");
                                c1574e.f5647B = c1857b.m4083b("logs.enabled");
                                for (String str4 : c1857b.m4085d("ignored-exceptions-for-type")) {
                                    try {
                                        Class<?> cls = Class.forName(str4);
                                        if (Throwable.class.isAssignableFrom(cls)) {
                                            c1574e.f5677t.add(cls);
                                        } else {
                                            logger.mo3680e(EnumC1657a2.WARNING, "Skipping setting %s as ignored-exception-for-type. Reason: %s does not extend Throwable", str4, str4);
                                        }
                                    } catch (ClassNotFoundException unused3) {
                                        logger.mo3680e(EnumC1657a2.WARNING, "Skipping setting %s as ignored-exception-for-type. Reason: %s class is not found", str4, str4);
                                    }
                                }
                                lM4084c = c1857b.m4084c("cron.default-checkin-margin");
                                lM4084c2 = c1857b.m4084c("cron.default-max-runtime");
                                property6 = c1857b.getProperty("cron.default-timezone");
                                lM4084c3 = c1857b.m4084c("cron.default-failure-issue-threshold");
                                lM4084c4 = c1857b.m4084c("cron.default-recovery-threshold");
                                if (lM4084c == null || lM4084c2 != null || property6 != null || lM4084c3 != null || lM4084c4 != null) {
                                    C1937o2 c1937o2 = new C1937o2();
                                    c1937o2.f6823a = lM4084c;
                                    c1937o2.f6824b = lM4084c2;
                                    c1937o2.f6825c = property6;
                                    c1937o2.f6826d = lM4084c3;
                                    c1937o2.f6827e = lM4084c4;
                                    c1574e.f5657L = c1937o2;
                                }
                                c1574e.f5646A = c1857b.m4083b("enable-spotlight");
                                c1574e.f5648C = c1857b.getProperty("spotlight-connection-url");
                                c2046v2.merge(c1574e);
                            } else {
                                dValueOf2 = null;
                                c1574e.f5667j = dValueOf2;
                                c1574e.f5664g = c1857b.m4083b("debug");
                                c1574e.f5665h = c1857b.m4083b("enable-deduplication");
                                c1574e.f5680w = c1857b.m4083b("send-client-reports");
                                c1574e.f5655J = c1857b.m4083b("force-init");
                                property3 = c1857b.getProperty("max-request-body-size");
                                if (property3 != null) {
                                }
                                while (r3.hasNext()) {
                                }
                                property4 = c1857b.getProperty("proxy.host");
                                String property82 = c1857b.getProperty("proxy.user");
                                String property92 = c1857b.getProperty("proxy.pass");
                                property5 = c1857b.getProperty("proxy.port");
                                if (property5 == null) {
                                }
                                if (property4 != null) {
                                }
                                it = c1857b.m4085d("in-app-includes").iterator();
                                while (it.hasNext()) {
                                }
                                it2 = c1857b.m4085d("in-app-excludes").iterator();
                                while (it2.hasNext()) {
                                }
                                if (c1857b.getProperty("trace-propagation-targets") == null) {
                                }
                                if (listM4085d == null) {
                                    listM4085d = c1857b.m4085d("tracing-origins");
                                }
                                if (listM4085d != null) {
                                }
                                it3 = c1857b.m4085d("context-tags").iterator();
                                while (it3.hasNext()) {
                                }
                                c1574e.f5675r = c1857b.getProperty("proguard-uuid");
                                it4 = c1857b.m4085d("bundle-ids").iterator();
                                while (it4.hasNext()) {
                                }
                                c1574e.f5676s = c1857b.m4084c("idle-timeout");
                                String property102 = c1857b.getProperty("ignored-errors");
                                c1574e.f5678u = property102 == null ? Arrays.asList(property102.split(",")) : null;
                                c1574e.f5682y = c1857b.m4083b("enabled");
                                c1574e.f5683z = c1857b.m4083b("enable-pretty-serialization-output");
                                c1574e.f5651F = c1857b.m4083b("send-modules");
                                c1574e.f5652G = c1857b.m4083b("send-default-pii");
                                String property112 = c1857b.getProperty("ignored-checkins");
                                c1574e.f5649D = property112 == null ? Arrays.asList(property112.split(",")) : null;
                                String property122 = c1857b.getProperty("ignored-transactions");
                                c1574e.f5650E = property122 != null ? Arrays.asList(property122.split(",")) : null;
                                c1574e.f5653H = c1857b.m4083b("enable-backpressure-handling");
                                c1574e.f5654I = c1857b.m4083b("global-hub-mode");
                                c1574e.f5656K = c1857b.m4083b("capture-open-telemetry-events");
                                c1574e.f5647B = c1857b.m4083b("logs.enabled");
                                while (r3.hasNext()) {
                                }
                                lM4084c = c1857b.m4084c("cron.default-checkin-margin");
                                lM4084c2 = c1857b.m4084c("cron.default-max-runtime");
                                property6 = c1857b.getProperty("cron.default-timezone");
                                lM4084c3 = c1857b.m4084c("cron.default-failure-issue-threshold");
                                lM4084c4 = c1857b.m4084c("cron.default-recovery-threshold");
                                if (lM4084c == null) {
                                    C1937o2 c1937o22 = new C1937o2();
                                    c1937o22.f6823a = lM4084c;
                                    c1937o22.f6824b = lM4084c2;
                                    c1937o22.f6825c = property6;
                                    c1937o22.f6826d = lM4084c3;
                                    c1937o22.f6827e = lM4084c4;
                                    c1574e.f5657L = c1937o22;
                                    c1574e.f5646A = c1857b.m4083b("enable-spotlight");
                                    c1574e.f5648C = c1857b.getProperty("spotlight-connection-url");
                                    c2046v2.merge(c1574e);
                                }
                            }
                        } else {
                            dValueOf = null;
                            c1574e.f5666i = dValueOf;
                            property2 = c1857b.getProperty("profiles-sample-rate");
                            if (property2 == null) {
                            }
                        }
                    } finally {
                    }
                } finally {
                }
            } else if (resourceAsStream != null) {
                resourceAsStream.close();
            }
            properties = null;
            if (properties != null) {
            }
            propertiesM4105o = new C1901c(str, c1599k0, 10, false).m4105o();
            if (propertiesM4105o != null) {
            }
            C1857b c1857b2 = new C1857b(arrayList);
            ILogger logger2 = c2046v2.getLogger();
            C1574E c1574e2 = new C1574E();
            c1574e2.f5658a = c1857b2.getProperty("dsn");
            c1574e2.f5659b = c1857b2.getProperty("environment");
            c1574e2.f5660c = c1857b2.getProperty(BuildConfig.BUILD_TYPE);
            c1574e2.f5661d = c1857b2.getProperty("dist");
            c1574e2.f5662e = c1857b2.getProperty("servername");
            c1574e2.f5663f = c1857b2.m4083b("uncaught.handler.enabled");
            c1574e2.f5679v = c1857b2.m4083b("uncaught.handler.print-stacktrace");
            property = c1857b2.getProperty("traces-sample-rate");
            if (property == null) {
            }
        }
        String dsn = c2046v2.getDsn();
        if (!c2046v2.isEnabled() || (dsn != null && dsn.isEmpty())) {
            m4232a();
            return false;
        }
        if (dsn == null) {
            throw new IllegalArgumentException("DSN is required. Use empty string or set enabled to false in SentryOptions to disable SDK.");
        }
        c2046v2.retrieveParsedDsn();
        return true;
    }
}
