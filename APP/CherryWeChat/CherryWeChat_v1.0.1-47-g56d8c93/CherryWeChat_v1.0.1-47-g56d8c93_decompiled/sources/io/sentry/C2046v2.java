package io.sentry;

import io.sentry.android.core.internal.gestures.C1702a;
import io.sentry.backpressure.C1831c;
import io.sentry.backpressure.InterfaceC1830b;
import io.sentry.cache.C1841f;
import io.sentry.cache.InterfaceC1839d;
import io.sentry.clientreport.InterfaceC1855f;
import io.sentry.config.AbstractC1856a;
import io.sentry.hints.C1891i;
import io.sentry.internal.debugmeta.C1900b;
import io.sentry.internal.debugmeta.C1901c;
import io.sentry.internal.debugmeta.InterfaceC1899a;
import io.sentry.internal.modules.C1908e;
import io.sentry.internal.modules.InterfaceC1904a;
import io.sentry.protocol.C1968r;
import io.sentry.transport.C2014i;
import io.sentry.transport.C2016k;
import io.sentry.transport.InterfaceC2013h;
import io.sentry.util.AbstractC2034f;
import io.sentry.util.AbstractC2038j;
import io.sentry.util.C2029a;
import io.sentry.util.C2032d;
import io.sentry.util.InterfaceC2031c;
import io.sentry.util.thread.C2041b;
import io.sentry.util.thread.InterfaceC2040a;
import java.io.File;
import java.lang.reflect.InvocationTargetException;
import java.math.BigInteger;
import java.nio.charset.Charset;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.CopyOnWriteArraySet;
import javax.net.ssl.SSLSocketFactory;
import p000.C2438r1;

/* JADX INFO: renamed from: io.sentry.v2 */
/* JADX INFO: loaded from: classes.dex */
public class C2046v2 {
    static final EnumC1657a2 DEFAULT_DIAGNOSTIC_LEVEL = EnumC1657a2.DEBUG;
    private static final String DEFAULT_ENVIRONMENT = "production";
    public static final String DEFAULT_PROPAGATION_TARGETS = ".*";
    private boolean attachServerName;
    private boolean attachStacktrace;
    private boolean attachThreads;
    private InterfaceC1830b backpressureMonitor;
    private InterfaceC1913j2 beforeBreadcrumb;
    private InterfaceC1917k2 beforeEnvelopeCallback;
    private InterfaceC1921l2 beforeSend;
    private InterfaceC1921l2 beforeSendFeedback;
    private InterfaceC1928m2 beforeSendReplay;
    private InterfaceC1932n2 beforeSendTransaction;
    private String cacheDirPath;
    private boolean captureOpenTelemetryEvents;
    InterfaceC1855f clientReportRecorder;
    private InterfaceC1925m compositePerformanceCollector;
    private InterfaceC1614O connectionStatusProvider;
    private int connectionTimeoutMillis;
    private final List<String> contextTags;
    private InterfaceC1618P continuousProfiler;
    private C1937o2 cron;
    private final C2032d dateProvider;
    private long deadlineTimeout;
    private boolean debug;
    private InterfaceC1899a debugMetaLoader;
    private EnumC2027u1 defaultScopeType;
    private final List<String> defaultTracePropagationTargets;
    private EnumC1657a2 diagnosticLevel;
    private String dist;
    private String distinctId;
    private String dsn;
    private String dsnHash;
    private boolean enableAppStartProfiling;
    private boolean enableAutoSessionTracking;
    private boolean enableBackpressureHandling;
    private boolean enableDeduplication;
    private boolean enableExternalConfiguration;
    private boolean enablePrettySerializationOutput;
    private boolean enableScopePersistence;
    private boolean enableScreenTracking;
    private boolean enableShutdownHook;
    private boolean enableSpotlight;
    private boolean enableTimeToFullDisplayTracing;
    private boolean enableUncaughtExceptionHandler;
    private boolean enableUserInteractionBreadcrumbs;
    private boolean enableUserInteractionTracing;
    private boolean enabled;
    private InterfaceC1839d envelopeDiskCache;
    private final C2032d envelopeReader;
    private String environment;
    private InterfaceC1833c0 executorService;
    private final C1570D experimental;
    private ILogger fatalLogger;
    private C1641V1 feedbackOptions;
    private boolean forceInit;
    private C1582G fullyDisplayedReporter;
    private final List<C1702a> gestureTargetLocators;
    private Boolean globalHubMode;
    private Long idleTimeout;
    private List<C1578F> ignoredCheckIns;
    private List<C1578F> ignoredSpanOrigins;
    private List<C1578F> ignoredTransactions;
    private final List<String> inAppExcludes;
    private final List<String> inAppIncludes;
    private EnumC1926m0 initPriority;
    private EnumC1930n0 instrumenter;
    private volatile C1617O2 internalTracesSampler;
    protected final C2029a lock;
    private ILogger logger;
    private C1941p2 logs;
    private long maxAttachmentSize;
    private int maxBreadcrumbs;
    private int maxCacheItems;
    private int maxDepth;
    private int maxQueueSize;
    private EnumC2005t2 maxRequestBodySize;
    private int maxSpans;
    private long maxTraceFileSize;
    private InterfaceC1904a modulesLoader;
    private final List<InterfaceC1648Y> observers;
    private InterfaceC1980q2 onDiscard;
    private EnumC1882h2 openTelemetryMode;
    private final List<InterfaceC1633T> optionsObservers;
    private final C2032d parsedDsn;
    private final List<InterfaceC1636U> performanceCollectors;
    private boolean printUncaughtStackTrace;
    private EnumC1877g1 profileLifecycle;
    private Double profileSessionSampleRate;
    private Double profilesSampleRate;
    private InterfaceC1984r2 profilesSampler;
    private int profilingTracesHz;
    private String proguardUuid;
    private C2001s2 proxy;
    private int readTimeoutMillis;
    private String release;
    private InterfaceC1916k1 replayController;
    private Double sampleRate;
    private C1968r sdkVersion;
    private boolean sendClientReports;
    private boolean sendDefaultPii;
    private boolean sendModules;
    private String sentryClientName;
    private final C2032d serializer;
    private String serverName;
    private C2067z2 sessionReplay;
    private long sessionTrackingIntervalMillis;
    private InterfaceC1872f0 socketTagger;
    private InterfaceC1880h0 spanFactory;
    private String spotlightConnectionUrl;
    private SSLSocketFactory sslSocketFactory;
    private boolean startProfilerOnAppStart;
    private final Map<String, String> tags;
    private InterfaceC2040a threadChecker;
    private boolean traceOptionsRequests;
    private List<String> tracePropagationTargets;
    private boolean traceSampling;
    private Double tracesSampleRate;
    private InterfaceC2028u2 tracesSampler;
    private InterfaceC1911j0 transactionProfiler;
    private InterfaceC1915k0 transportFactory;
    private InterfaceC2013h transportGate;
    private InterfaceC1919l0 versionDetector;
    private final List<Object> viewHierarchyExporters;
    private final List<InterfaceC1566C> eventProcessors = new CopyOnWriteArrayList();
    private final Set<Class<? extends Throwable>> ignoredExceptionsForType = new CopyOnWriteArraySet();
    private List<C1578F> ignoredErrors = null;
    private final List<InterfaceC1935o0> integrations = new CopyOnWriteArrayList();
    private final Set<String> bundleIds = new CopyOnWriteArraySet();
    private long shutdownTimeoutMillis = 2000;
    private long flushTimeoutMillis = 15000;
    private long sessionFlushTimeoutMillis = 15000;

    /* JADX WARN: Removed duplicated region for block: B:19:0x023b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public C2046v2(boolean z) {
        InterfaceC1880h0 c1640v0;
        Class clsM4096h;
        final int i = 0;
        this.parsedDsn = new C2032d(new InterfaceC2031c(this) { // from class: io.sentry.i2

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ C2046v2 f6774b;

            {
                this.f6774b = this;
            }

            @Override // io.sentry.util.InterfaceC2031c
            /* JADX INFO: renamed from: c */
            public final Object mo3688c() {
                switch (i) {
                    case 0:
                        return C2046v2.m4185a(this.f6774b);
                    case 1:
                        C2046v2 c2046v2 = this.f6774b;
                        c2046v2.getClass();
                        return new C1571D0(c2046v2);
                    default:
                        return C2046v2.m4186b(this.f6774b);
                }
            }
        });
        C1611N0 c1611n0 = C1611N0.f5797a;
        this.logger = c1611n0;
        this.fatalLogger = c1611n0;
        this.diagnosticLevel = DEFAULT_DIAGNOSTIC_LEVEL;
        final int i2 = 1;
        this.serializer = new C2032d(new InterfaceC2031c(this) { // from class: io.sentry.i2

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ C2046v2 f6774b;

            {
                this.f6774b = this;
            }

            @Override // io.sentry.util.InterfaceC2031c
            /* JADX INFO: renamed from: c */
            public final Object mo3688c() {
                switch (i2) {
                    case 0:
                        return C2046v2.m4185a(this.f6774b);
                    case 1:
                        C2046v2 c2046v2 = this.f6774b;
                        c2046v2.getClass();
                        return new C1571D0(c2046v2);
                    default:
                        return C2046v2.m4186b(this.f6774b);
                }
            }
        });
        final int i3 = 2;
        this.envelopeReader = new C2032d(new InterfaceC2031c(this) { // from class: io.sentry.i2

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ C2046v2 f6774b;

            {
                this.f6774b = this;
            }

            @Override // io.sentry.util.InterfaceC2031c
            /* JADX INFO: renamed from: c */
            public final Object mo3688c() {
                switch (i3) {
                    case 0:
                        return C2046v2.m4185a(this.f6774b);
                    case 1:
                        C2046v2 c2046v2 = this.f6774b;
                        c2046v2.getClass();
                        return new C1571D0(c2046v2);
                    default:
                        return C2046v2.m4186b(this.f6774b);
                }
            }
        });
        this.maxDepth = 100;
        this.maxCacheItems = 30;
        this.maxQueueSize = 30;
        this.maxBreadcrumbs = 100;
        this.inAppExcludes = new CopyOnWriteArrayList();
        this.inAppIncludes = new CopyOnWriteArrayList();
        this.transportFactory = C1646X0.f5890a;
        this.transportGate = C2016k.f7196a;
        this.attachStacktrace = true;
        this.enableAutoSessionTracking = true;
        this.sessionTrackingIntervalMillis = 30000L;
        this.attachServerName = true;
        this.enableUncaughtExceptionHandler = true;
        this.printUncaughtStackTrace = false;
        this.executorService = C1599K0.f5775d;
        this.connectionTimeoutMillis = 30000;
        this.readTimeoutMillis = 30000;
        this.envelopeDiskCache = C2014i.f7194a;
        this.sendDefaultPii = false;
        this.observers = new CopyOnWriteArrayList();
        this.optionsObservers = new CopyOnWriteArrayList();
        this.tags = new ConcurrentHashMap();
        this.maxAttachmentSize = 20971520L;
        this.enableDeduplication = true;
        this.maxSpans = 1000;
        this.enableShutdownHook = true;
        this.maxRequestBodySize = EnumC2005t2.NONE;
        this.traceSampling = true;
        this.maxTraceFileSize = 5242880L;
        this.transactionProfiler = C1599K0.f5776e;
        this.continuousProfiler = C1599K0.f5772a;
        this.tracePropagationTargets = null;
        this.defaultTracePropagationTargets = Collections.singletonList(DEFAULT_PROPAGATION_TARGETS);
        this.idleTimeout = 3000L;
        this.contextTags = new CopyOnWriteArrayList();
        this.sendClientReports = true;
        this.clientReportRecorder = new C1901c(this);
        this.modulesLoader = C1908e.f6796a;
        this.debugMetaLoader = C1900b.f6779a;
        this.enableUserInteractionTracing = false;
        this.enableUserInteractionBreadcrumbs = true;
        this.instrumenter = EnumC1930n0.SENTRY;
        this.gestureTargetLocators = new ArrayList();
        this.viewHierarchyExporters = new ArrayList();
        this.threadChecker = C2041b.f7229a;
        this.traceOptionsRequests = true;
        this.dateProvider = new C2032d(new C2438r1(21));
        this.performanceCollectors = new ArrayList();
        this.compositePerformanceCollector = C1591I0.f5752a;
        this.enableTimeToFullDisplayTracing = false;
        this.fullyDisplayedReporter = C1582G.f5712b;
        this.connectionStatusProvider = new C1595J0();
        this.enabled = true;
        this.enablePrettySerializationOutput = true;
        this.sendModules = true;
        this.enableSpotlight = false;
        this.enableScopePersistence = true;
        this.ignoredCheckIns = null;
        this.ignoredSpanOrigins = null;
        this.ignoredTransactions = null;
        this.backpressureMonitor = C1831c.f6616a;
        this.enableBackpressureHandling = true;
        this.enableAppStartProfiling = false;
        this.spanFactory = C1640V0.f5880b;
        this.profilingTracesHz = 101;
        this.cron = null;
        this.replayController = C1599K0.f5774c;
        this.enableScreenTracking = true;
        this.defaultScopeType = EnumC2027u1.ISOLATION;
        this.initPriority = EnumC1926m0.MEDIUM;
        this.forceInit = false;
        this.globalHubMode = null;
        this.lock = new C2029a();
        this.openTelemetryMode = EnumC1882h2.AUTO;
        this.captureOpenTelemetryEvents = false;
        this.versionDetector = C1649Y0.f5892a;
        this.profileLifecycle = EnumC1877g1.MANUAL;
        this.startProfilerOnAppStart = false;
        this.deadlineTimeout = 30000L;
        C1941p2 c1941p2 = new C1941p2();
        c1941p2.f6831a = false;
        this.logs = c1941p2;
        this.socketTagger = C1634T0.f5869a;
        C1968r c1968r = new C1968r("sentry.java", "8.21.1");
        c1968r.f7000b = "8.21.1";
        this.experimental = new C1570D();
        C2067z2 c2067z2 = new C2067z2();
        CopyOnWriteArraySet copyOnWriteArraySet = new CopyOnWriteArraySet();
        c2067z2.f7307c = copyOnWriteArraySet;
        CopyOnWriteArraySet copyOnWriteArraySet2 = new CopyOnWriteArraySet();
        c2067z2.f7308d = copyOnWriteArraySet2;
        c2067z2.f7309e = EnumC2063y2.MEDIUM;
        c2067z2.f7310f = 1;
        c2067z2.f7311g = 30000L;
        c2067z2.f7312h = 5000L;
        c2067z2.f7313i = 3600000L;
        c2067z2.f7314j = true;
        c2067z2.f7316l = false;
        if (!z) {
            copyOnWriteArraySet.add("android.widget.TextView");
            copyOnWriteArraySet2.remove("android.widget.TextView");
            copyOnWriteArraySet.add("android.widget.ImageView");
            copyOnWriteArraySet2.remove("android.widget.ImageView");
            copyOnWriteArraySet.add("android.webkit.WebView");
            copyOnWriteArraySet.add("android.widget.VideoView");
            copyOnWriteArraySet.add("androidx.media3.ui.PlayerView");
            copyOnWriteArraySet.add("com.google.android.exoplayer2.ui.PlayerView");
            copyOnWriteArraySet.add("com.google.android.exoplayer2.ui.StyledPlayerView");
            c2067z2.f7315k = c1968r;
        }
        this.sessionReplay = c2067z2;
        C1641V1 c1641v1 = new C1641V1();
        c1641v1.f5882a = false;
        c1641v1.f5883b = true;
        c1641v1.f5884c = false;
        c1641v1.f5885d = true;
        c1641v1.f5886e = true;
        c1641v1.f5887f = true;
        this.feedbackOptions = c1641v1;
        if (z) {
            return;
        }
        if (AbstractC2034f.f7219a || !C1891i.m4095e("io.sentry.opentelemetry.OtelSpanFactory", c1611n0) || (clsM4096h = C1891i.m4096h("io.sentry.opentelemetry.OtelSpanFactory", c1611n0)) == null) {
            c1640v0 = new C1640V0(1);
        } else {
            try {
                Object objNewInstance = clsM4096h.getDeclaredConstructor(null).newInstance(null);
                if (objNewInstance != null && (objNewInstance instanceof InterfaceC1880h0)) {
                    c1640v0 = (InterfaceC1880h0) objNewInstance;
                }
            } catch (IllegalAccessException | InstantiationException | NoSuchMethodException | InvocationTargetException unused) {
            }
        }
        setSpanFactory(c1640v0);
        C1638U1 c1638u1 = new C1638U1(this);
        this.executorService = c1638u1;
        c1638u1.mo3700m();
        this.integrations.add(new UncaughtExceptionHandlerIntegration());
        this.integrations.add(new ShutdownHookIntegration());
        this.integrations.add(new SpotlightIntegration());
        this.eventProcessors.add(new C1575E0(this));
        this.eventProcessors.add(new C1934o(this));
        if (!AbstractC2034f.f7219a) {
            this.eventProcessors.add(new C1561A2());
        }
        setSentryClientName("sentry.java/8.21.1");
        setSdkVersion(c1968r);
        C1650Y1.m3790d().m3792b("maven:io.sentry:sentry", "8.21.1");
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ C2064z m4185a(C2046v2 c2046v2) {
        return new C2064z(c2046v2.dsn);
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ C1558A m4186b(C2046v2 c2046v2) {
        return new C1558A((InterfaceC1866e0) c2046v2.serializer.m4175a());
    }

    public static C2046v2 empty() {
        return new C2046v2(true);
    }

    public void addBundleId(String str) {
        if (str != null) {
            String strTrim = str.trim();
            if (strTrim.isEmpty()) {
                return;
            }
            this.bundleIds.add(strTrim);
        }
    }

    public void addContextTag(String str) {
        this.contextTags.add(str);
    }

    public void addEventProcessor(InterfaceC1566C interfaceC1566C) {
        this.eventProcessors.add(interfaceC1566C);
    }

    public void addIgnoredCheckIn(String str) {
        if (this.ignoredCheckIns == null) {
            this.ignoredCheckIns = new ArrayList();
        }
        this.ignoredCheckIns.add(new C1578F(str));
    }

    public void addIgnoredError(String str) {
        if (this.ignoredErrors == null) {
            this.ignoredErrors = new ArrayList();
        }
        this.ignoredErrors.add(new C1578F(str));
    }

    public void addIgnoredExceptionForType(Class<? extends Throwable> cls) {
        this.ignoredExceptionsForType.add(cls);
    }

    public void addIgnoredSpanOrigin(String str) {
        if (this.ignoredSpanOrigins == null) {
            this.ignoredSpanOrigins = new ArrayList();
        }
        this.ignoredSpanOrigins.add(new C1578F(str));
    }

    public void addIgnoredTransaction(String str) {
        if (this.ignoredTransactions == null) {
            this.ignoredTransactions = new ArrayList();
        }
        this.ignoredTransactions.add(new C1578F(str));
    }

    public void addInAppExclude(String str) {
        this.inAppExcludes.add(str);
    }

    public void addInAppInclude(String str) {
        this.inAppIncludes.add(str);
    }

    public void addIntegration(InterfaceC1935o0 interfaceC1935o0) {
        this.integrations.add(interfaceC1935o0);
    }

    public void addOptionsObserver(InterfaceC1633T interfaceC1633T) {
        this.optionsObservers.add(interfaceC1633T);
    }

    public void addPerformanceCollector(InterfaceC1636U interfaceC1636U) {
        this.performanceCollectors.add(interfaceC1636U);
    }

    public void addScopeObserver(InterfaceC1648Y interfaceC1648Y) {
        this.observers.add(interfaceC1648Y);
    }

    public boolean containsIgnoredExceptionForType(Throwable th) {
        return this.ignoredExceptionsForType.contains(th.getClass());
    }

    public C1841f findPersistingScopeObserver() {
        for (InterfaceC1648Y interfaceC1648Y : this.observers) {
            if (interfaceC1648Y instanceof C1841f) {
                return (C1841f) interfaceC1648Y;
            }
        }
        return null;
    }

    public InterfaceC1830b getBackpressureMonitor() {
        return this.backpressureMonitor;
    }

    public InterfaceC1913j2 getBeforeBreadcrumb() {
        return null;
    }

    public InterfaceC1917k2 getBeforeEnvelopeCallback() {
        return this.beforeEnvelopeCallback;
    }

    public InterfaceC1921l2 getBeforeSend() {
        return null;
    }

    public InterfaceC1921l2 getBeforeSendFeedback() {
        return null;
    }

    public InterfaceC1928m2 getBeforeSendReplay() {
        return null;
    }

    public InterfaceC1932n2 getBeforeSendTransaction() {
        return null;
    }

    public Set<String> getBundleIds() {
        return this.bundleIds;
    }

    public String getCacheDirPath() {
        String str = this.cacheDirPath;
        if (str == null || str.isEmpty()) {
            return null;
        }
        return this.dsnHash != null ? new File(this.cacheDirPath, this.dsnHash).getAbsolutePath() : this.cacheDirPath;
    }

    public String getCacheDirPathWithoutDsn() {
        String str = this.cacheDirPath;
        if (str == null || str.isEmpty()) {
            return null;
        }
        return this.cacheDirPath;
    }

    public InterfaceC1855f getClientReportRecorder() {
        return this.clientReportRecorder;
    }

    public InterfaceC1925m getCompositePerformanceCollector() {
        return this.compositePerformanceCollector;
    }

    public InterfaceC1614O getConnectionStatusProvider() {
        return this.connectionStatusProvider;
    }

    public int getConnectionTimeoutMillis() {
        return this.connectionTimeoutMillis;
    }

    public List<String> getContextTags() {
        return this.contextTags;
    }

    public InterfaceC1618P getContinuousProfiler() {
        return this.continuousProfiler;
    }

    public C1937o2 getCron() {
        return this.cron;
    }

    public InterfaceC1592I1 getDateProvider() {
        return (InterfaceC1592I1) this.dateProvider.m4175a();
    }

    public long getDeadlineTimeout() {
        return this.deadlineTimeout;
    }

    public InterfaceC1899a getDebugMetaLoader() {
        return this.debugMetaLoader;
    }

    public EnumC2027u1 getDefaultScopeType() {
        return this.defaultScopeType;
    }

    public EnumC1657a2 getDiagnosticLevel() {
        return this.diagnosticLevel;
    }

    public String getDist() {
        return this.dist;
    }

    public String getDistinctId() {
        return this.distinctId;
    }

    public String getDsn() {
        return this.dsn;
    }

    public InterfaceC1839d getEnvelopeDiskCache() {
        return this.envelopeDiskCache;
    }

    public InterfaceC1622Q getEnvelopeReader() {
        return (InterfaceC1622Q) this.envelopeReader.m4175a();
    }

    public String getEnvironment() {
        String str = this.environment;
        return str != null ? str : DEFAULT_ENVIRONMENT;
    }

    public List<InterfaceC1566C> getEventProcessors() {
        return this.eventProcessors;
    }

    public InterfaceC1833c0 getExecutorService() {
        return this.executorService;
    }

    public C1570D getExperimental() {
        return this.experimental;
    }

    public ILogger getFatalLogger() {
        return this.fatalLogger;
    }

    public C1641V1 getFeedbackOptions() {
        return this.feedbackOptions;
    }

    public long getFlushTimeoutMillis() {
        return this.flushTimeoutMillis;
    }

    public C1582G getFullyDisplayedReporter() {
        return this.fullyDisplayedReporter;
    }

    public List<C1702a> getGestureTargetLocators() {
        return this.gestureTargetLocators;
    }

    public Long getIdleTimeout() {
        return this.idleTimeout;
    }

    public List<C1578F> getIgnoredCheckIns() {
        return this.ignoredCheckIns;
    }

    public List<C1578F> getIgnoredErrors() {
        return this.ignoredErrors;
    }

    public Set<Class<? extends Throwable>> getIgnoredExceptionsForType() {
        return this.ignoredExceptionsForType;
    }

    public List<C1578F> getIgnoredSpanOrigins() {
        return this.ignoredSpanOrigins;
    }

    public List<C1578F> getIgnoredTransactions() {
        return this.ignoredTransactions;
    }

    public List<String> getInAppExcludes() {
        return this.inAppExcludes;
    }

    public List<String> getInAppIncludes() {
        return this.inAppIncludes;
    }

    public EnumC1926m0 getInitPriority() {
        return this.initPriority;
    }

    public EnumC1930n0 getInstrumenter() {
        return this.instrumenter;
    }

    public List<InterfaceC1935o0> getIntegrations() {
        return this.integrations;
    }

    public C1617O2 getInternalTracesSampler() {
        if (this.internalTracesSampler == null) {
            C1981r c1981rM4173a = this.lock.m4173a();
            try {
                if (this.internalTracesSampler == null) {
                    this.internalTracesSampler = new C1617O2(this);
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
        return this.internalTracesSampler;
    }

    public ILogger getLogger() {
        return this.logger;
    }

    public C1941p2 getLogs() {
        return this.logs;
    }

    public long getMaxAttachmentSize() {
        return this.maxAttachmentSize;
    }

    public int getMaxBreadcrumbs() {
        return this.maxBreadcrumbs;
    }

    public int getMaxCacheItems() {
        return this.maxCacheItems;
    }

    public int getMaxDepth() {
        return this.maxDepth;
    }

    public int getMaxQueueSize() {
        return this.maxQueueSize;
    }

    public EnumC2005t2 getMaxRequestBodySize() {
        return this.maxRequestBodySize;
    }

    public int getMaxSpans() {
        return this.maxSpans;
    }

    public long getMaxTraceFileSize() {
        return this.maxTraceFileSize;
    }

    public InterfaceC1904a getModulesLoader() {
        return this.modulesLoader;
    }

    public InterfaceC1980q2 getOnDiscard() {
        return null;
    }

    public EnumC1882h2 getOpenTelemetryMode() {
        return this.openTelemetryMode;
    }

    public List<InterfaceC1633T> getOptionsObservers() {
        return this.optionsObservers;
    }

    public String getOutboxPath() {
        String cacheDirPath = getCacheDirPath();
        if (cacheDirPath == null) {
            return null;
        }
        return new File(cacheDirPath, "outbox").getAbsolutePath();
    }

    public List<InterfaceC1636U> getPerformanceCollectors() {
        return this.performanceCollectors;
    }

    public EnumC1877g1 getProfileLifecycle() {
        return this.profileLifecycle;
    }

    public Double getProfileSessionSampleRate() {
        return this.profileSessionSampleRate;
    }

    public Double getProfilesSampleRate() {
        return this.profilesSampleRate;
    }

    public InterfaceC1984r2 getProfilesSampler() {
        return null;
    }

    public String getProfilingTracesDirPath() {
        String cacheDirPath = getCacheDirPath();
        if (cacheDirPath == null) {
            return null;
        }
        return new File(cacheDirPath, "profiling_traces").getAbsolutePath();
    }

    public int getProfilingTracesHz() {
        return this.profilingTracesHz;
    }

    public String getProguardUuid() {
        return this.proguardUuid;
    }

    public C2001s2 getProxy() {
        return this.proxy;
    }

    public int getReadTimeoutMillis() {
        return this.readTimeoutMillis;
    }

    public String getRelease() {
        return this.release;
    }

    public InterfaceC1916k1 getReplayController() {
        return this.replayController;
    }

    public Double getSampleRate() {
        return this.sampleRate;
    }

    public List<InterfaceC1648Y> getScopeObservers() {
        return this.observers;
    }

    public C1968r getSdkVersion() {
        return this.sdkVersion;
    }

    public String getSentryClientName() {
        return this.sentryClientName;
    }

    public InterfaceC1866e0 getSerializer() {
        return (InterfaceC1866e0) this.serializer.m4175a();
    }

    public String getServerName() {
        return this.serverName;
    }

    public long getSessionFlushTimeoutMillis() {
        return this.sessionFlushTimeoutMillis;
    }

    public C2067z2 getSessionReplay() {
        return this.sessionReplay;
    }

    public long getSessionTrackingIntervalMillis() {
        return this.sessionTrackingIntervalMillis;
    }

    public long getShutdownTimeoutMillis() {
        return this.shutdownTimeoutMillis;
    }

    public InterfaceC1872f0 getSocketTagger() {
        return this.socketTagger;
    }

    public InterfaceC1880h0 getSpanFactory() {
        return this.spanFactory;
    }

    public String getSpotlightConnectionUrl() {
        return this.spotlightConnectionUrl;
    }

    public SSLSocketFactory getSslSocketFactory() {
        return this.sslSocketFactory;
    }

    public Map<String, String> getTags() {
        return this.tags;
    }

    public InterfaceC2040a getThreadChecker() {
        return this.threadChecker;
    }

    public List<String> getTracePropagationTargets() {
        List<String> list = this.tracePropagationTargets;
        return list == null ? this.defaultTracePropagationTargets : list;
    }

    public Double getTracesSampleRate() {
        return this.tracesSampleRate;
    }

    public InterfaceC2028u2 getTracesSampler() {
        return null;
    }

    public InterfaceC1911j0 getTransactionProfiler() {
        return this.transactionProfiler;
    }

    public InterfaceC1915k0 getTransportFactory() {
        return this.transportFactory;
    }

    public InterfaceC2013h getTransportGate() {
        return this.transportGate;
    }

    public InterfaceC1919l0 getVersionDetector() {
        return this.versionDetector;
    }

    public final List<Object> getViewHierarchyExporters() {
        return this.viewHierarchyExporters;
    }

    public boolean isAttachServerName() {
        return this.attachServerName;
    }

    public boolean isAttachStacktrace() {
        return this.attachStacktrace;
    }

    public boolean isAttachThreads() {
        return this.attachThreads;
    }

    public boolean isCaptureOpenTelemetryEvents() {
        return this.captureOpenTelemetryEvents;
    }

    public boolean isContinuousProfilingEnabled() {
        Double d;
        return this.profilesSampleRate == null && (d = this.profileSessionSampleRate) != null && d.doubleValue() > 0.0d;
    }

    public boolean isDebug() {
        return this.debug;
    }

    public boolean isEnableAppStartProfiling() {
        return (isProfilingEnabled() || isContinuousProfilingEnabled()) && this.enableAppStartProfiling;
    }

    public boolean isEnableAutoSessionTracking() {
        return this.enableAutoSessionTracking;
    }

    public boolean isEnableBackpressureHandling() {
        return this.enableBackpressureHandling;
    }

    public boolean isEnableDeduplication() {
        return this.enableDeduplication;
    }

    public boolean isEnableExternalConfiguration() {
        return this.enableExternalConfiguration;
    }

    public boolean isEnablePrettySerializationOutput() {
        return this.enablePrettySerializationOutput;
    }

    public boolean isEnableScopePersistence() {
        return this.enableScopePersistence;
    }

    public boolean isEnableScreenTracking() {
        return this.enableScreenTracking;
    }

    public boolean isEnableShutdownHook() {
        return this.enableShutdownHook;
    }

    public boolean isEnableSpotlight() {
        return this.enableSpotlight;
    }

    public boolean isEnableTimeToFullDisplayTracing() {
        return this.enableTimeToFullDisplayTracing;
    }

    public boolean isEnableUncaughtExceptionHandler() {
        return this.enableUncaughtExceptionHandler;
    }

    public boolean isEnableUserInteractionBreadcrumbs() {
        return this.enableUserInteractionBreadcrumbs;
    }

    public boolean isEnableUserInteractionTracing() {
        return this.enableUserInteractionTracing;
    }

    public boolean isEnabled() {
        return this.enabled;
    }

    public boolean isForceInit() {
        return this.forceInit;
    }

    public Boolean isGlobalHubMode() {
        return this.globalHubMode;
    }

    public boolean isPrintUncaughtStackTrace() {
        return this.printUncaughtStackTrace;
    }

    public boolean isProfilingEnabled() {
        Double d = this.profilesSampleRate;
        return d != null && d.doubleValue() > 0.0d;
    }

    public boolean isSendClientReports() {
        return this.sendClientReports;
    }

    public boolean isSendDefaultPii() {
        return this.sendDefaultPii;
    }

    public boolean isSendModules() {
        return this.sendModules;
    }

    public boolean isStartProfilerOnAppStart() {
        return this.startProfilerOnAppStart;
    }

    public boolean isTraceOptionsRequests() {
        return this.traceOptionsRequests;
    }

    public boolean isTraceSampling() {
        return this.traceSampling;
    }

    public boolean isTracingEnabled() {
        if (getTracesSampleRate() != null) {
            return true;
        }
        getTracesSampler();
        return false;
    }

    public void loadLazyFields() {
        getSerializer();
        retrieveParsedDsn();
        getEnvelopeReader();
        getDateProvider();
    }

    public void merge(C1574E c1574e) {
        String str = c1574e.f5658a;
        if (str != null) {
            setDsn(str);
        }
        String str2 = c1574e.f5659b;
        if (str2 != null) {
            setEnvironment(str2);
        }
        String str3 = c1574e.f5660c;
        if (str3 != null) {
            setRelease(str3);
        }
        String str4 = c1574e.f5661d;
        if (str4 != null) {
            setDist(str4);
        }
        String str5 = c1574e.f5662e;
        if (str5 != null) {
            setServerName(str5);
        }
        C2001s2 c2001s2 = c1574e.f5670m;
        if (c2001s2 != null) {
            setProxy(c2001s2);
        }
        Boolean bool = c1574e.f5663f;
        if (bool != null) {
            setEnableUncaughtExceptionHandler(bool.booleanValue());
        }
        Boolean bool2 = c1574e.f5679v;
        if (bool2 != null) {
            setPrintUncaughtStackTrace(bool2.booleanValue());
        }
        Double d = c1574e.f5666i;
        if (d != null) {
            setTracesSampleRate(d);
        }
        Double d2 = c1574e.f5667j;
        if (d2 != null) {
            setProfilesSampleRate(d2);
        }
        Boolean bool3 = c1574e.f5664g;
        if (bool3 != null) {
            setDebug(bool3.booleanValue());
        }
        Boolean bool4 = c1574e.f5665h;
        if (bool4 != null) {
            setEnableDeduplication(bool4.booleanValue());
        }
        Boolean bool5 = c1574e.f5680w;
        if (bool5 != null) {
            setSendClientReports(bool5.booleanValue());
        }
        Boolean bool6 = c1574e.f5655J;
        if (bool6 != null) {
            setForceInit(bool6.booleanValue());
        }
        for (Map.Entry entry : new HashMap(c1574e.f5669l).entrySet()) {
            this.tags.put((String) entry.getKey(), (String) entry.getValue());
        }
        Iterator it = new ArrayList(c1574e.f5672o).iterator();
        while (it.hasNext()) {
            addInAppInclude((String) it.next());
        }
        Iterator it2 = new ArrayList(c1574e.f5671n).iterator();
        while (it2.hasNext()) {
            addInAppExclude((String) it2.next());
        }
        Iterator it3 = new HashSet(c1574e.f5677t).iterator();
        while (it3.hasNext()) {
            addIgnoredExceptionForType((Class) it3.next());
        }
        if (c1574e.f5673p != null) {
            setTracePropagationTargets(new ArrayList(c1574e.f5673p));
        }
        Iterator it4 = new ArrayList(c1574e.f5674q).iterator();
        while (it4.hasNext()) {
            addContextTag((String) it4.next());
        }
        String str6 = c1574e.f5675r;
        if (str6 != null) {
            setProguardUuid(str6);
        }
        Long l = c1574e.f5676s;
        if (l != null) {
            setIdleTimeout(l);
        }
        Iterator it5 = c1574e.f5681x.iterator();
        while (it5.hasNext()) {
            addBundleId((String) it5.next());
        }
        Boolean bool7 = c1574e.f5682y;
        if (bool7 != null) {
            setEnabled(bool7.booleanValue());
        }
        Boolean bool8 = c1574e.f5683z;
        if (bool8 != null) {
            setEnablePrettySerializationOutput(bool8.booleanValue());
        }
        Boolean bool9 = c1574e.f5651F;
        if (bool9 != null) {
            setSendModules(bool9.booleanValue());
        }
        if (c1574e.f5649D != null) {
            setIgnoredCheckIns(new ArrayList(c1574e.f5649D));
        }
        if (c1574e.f5650E != null) {
            setIgnoredTransactions(new ArrayList(c1574e.f5650E));
        }
        if (c1574e.f5678u != null) {
            setIgnoredErrors(new ArrayList(c1574e.f5678u));
        }
        Boolean bool10 = c1574e.f5653H;
        if (bool10 != null) {
            setEnableBackpressureHandling(bool10.booleanValue());
        }
        EnumC2005t2 enumC2005t2 = c1574e.f5668k;
        if (enumC2005t2 != null) {
            setMaxRequestBodySize(enumC2005t2);
        }
        Boolean bool11 = c1574e.f5652G;
        if (bool11 != null) {
            setSendDefaultPii(bool11.booleanValue());
        }
        Boolean bool12 = c1574e.f5656K;
        if (bool12 != null) {
            setCaptureOpenTelemetryEvents(bool12.booleanValue());
        }
        Boolean bool13 = c1574e.f5646A;
        if (bool13 != null) {
            setEnableSpotlight(bool13.booleanValue());
        }
        String str7 = c1574e.f5648C;
        if (str7 != null) {
            setSpotlightConnectionUrl(str7);
        }
        Boolean bool14 = c1574e.f5654I;
        if (bool14 != null) {
            setGlobalHubMode(bool14);
        }
        if (c1574e.f5657L != null) {
            if (getCron() == null) {
                setCron(c1574e.f5657L);
            } else {
                if (c1574e.f5657L.f6823a != null) {
                    getCron().f6823a = c1574e.f5657L.f6823a;
                }
                if (c1574e.f5657L.f6824b != null) {
                    getCron().f6824b = c1574e.f5657L.f6824b;
                }
                if (c1574e.f5657L.f6825c != null) {
                    getCron().f6825c = c1574e.f5657L.f6825c;
                }
                if (c1574e.f5657L.f6826d != null) {
                    getCron().f6826d = c1574e.f5657L.f6826d;
                }
                if (c1574e.f5657L.f6827e != null) {
                    getCron().f6827e = c1574e.f5657L.f6827e;
                }
            }
        }
        if (c1574e.f5647B != null) {
            getLogs().f6831a = c1574e.f5647B.booleanValue();
        }
    }

    public C2064z retrieveParsedDsn() {
        return (C2064z) this.parsedDsn.m4175a();
    }

    public void setAttachServerName(boolean z) {
        this.attachServerName = z;
    }

    public void setAttachStacktrace(boolean z) {
        this.attachStacktrace = z;
    }

    public void setAttachThreads(boolean z) {
        this.attachThreads = z;
    }

    public void setBackpressureMonitor(InterfaceC1830b interfaceC1830b) {
        this.backpressureMonitor = interfaceC1830b;
    }

    public void setBeforeBreadcrumb(InterfaceC1913j2 interfaceC1913j2) {
    }

    public void setBeforeEnvelopeCallback(InterfaceC1917k2 interfaceC1917k2) {
        this.beforeEnvelopeCallback = interfaceC1917k2;
    }

    public void setBeforeSend(InterfaceC1921l2 interfaceC1921l2) {
    }

    public void setBeforeSendFeedback(InterfaceC1921l2 interfaceC1921l2) {
    }

    public void setBeforeSendReplay(InterfaceC1928m2 interfaceC1928m2) {
    }

    public void setBeforeSendTransaction(InterfaceC1932n2 interfaceC1932n2) {
    }

    public void setCacheDirPath(String str) {
        this.cacheDirPath = str;
    }

    public void setCaptureOpenTelemetryEvents(boolean z) {
        this.captureOpenTelemetryEvents = z;
    }

    public void setCompositePerformanceCollector(InterfaceC1925m interfaceC1925m) {
        this.compositePerformanceCollector = interfaceC1925m;
    }

    public void setConnectionStatusProvider(InterfaceC1614O interfaceC1614O) {
        this.connectionStatusProvider = interfaceC1614O;
    }

    public void setConnectionTimeoutMillis(int i) {
        this.connectionTimeoutMillis = i;
    }

    public void setContinuousProfiler(InterfaceC1618P interfaceC1618P) {
        if (this.continuousProfiler != C1599K0.f5772a || interfaceC1618P == null) {
            return;
        }
        this.continuousProfiler = interfaceC1618P;
    }

    public void setCron(C1937o2 c1937o2) {
        this.cron = c1937o2;
    }

    public void setDateProvider(InterfaceC1592I1 interfaceC1592I1) {
        this.dateProvider.m4176b(interfaceC1592I1);
    }

    public void setDeadlineTimeout(long j) {
        this.deadlineTimeout = j;
    }

    public void setDebug(boolean z) {
        this.debug = z;
    }

    public void setDebugMetaLoader(InterfaceC1899a interfaceC1899a) {
        if (interfaceC1899a == null) {
            interfaceC1899a = C1900b.f6779a;
        }
        this.debugMetaLoader = interfaceC1899a;
    }

    public void setDefaultScopeType(EnumC2027u1 enumC2027u1) {
        this.defaultScopeType = enumC2027u1;
    }

    public void setDiagnosticLevel(EnumC1657a2 enumC1657a2) {
        if (enumC1657a2 == null) {
            enumC1657a2 = DEFAULT_DIAGNOSTIC_LEVEL;
        }
        this.diagnosticLevel = enumC1657a2;
    }

    public void setDist(String str) {
        this.dist = str;
    }

    public void setDistinctId(String str) {
        this.distinctId = str;
    }

    public void setDsn(String str) {
        this.dsn = str;
        C2032d c2032d = this.parsedDsn;
        C1981r c1981rM4173a = c2032d.f7218c.m4173a();
        String string = null;
        try {
            c2032d.f7216a = null;
            c1981rM4173a.close();
            String str2 = this.dsn;
            ILogger iLogger = this.logger;
            Charset charset = AbstractC2038j.f7226a;
            if (str2 != null && !str2.isEmpty()) {
                try {
                    string = new StringBuilder(new BigInteger(1, MessageDigest.getInstance("SHA-1").digest(str2.getBytes(AbstractC2038j.f7226a))).toString(16)).toString();
                } catch (NoSuchAlgorithmException e) {
                    iLogger.mo3683r(EnumC1657a2.INFO, "SHA-1 isn't available to calculate the hash.", e);
                } catch (Throwable th) {
                    iLogger.mo3680e(EnumC1657a2.INFO, "string: %s could not calculate its hash", th, str2);
                }
            }
            this.dsnHash = string;
        } catch (Throwable th2) {
            try {
                c1981rM4173a.close();
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
            }
            throw th2;
        }
    }

    public void setEnableAppStartProfiling(boolean z) {
        this.enableAppStartProfiling = z;
    }

    public void setEnableAutoSessionTracking(boolean z) {
        this.enableAutoSessionTracking = z;
    }

    public void setEnableBackpressureHandling(boolean z) {
        this.enableBackpressureHandling = z;
    }

    public void setEnableDeduplication(boolean z) {
        this.enableDeduplication = z;
    }

    public void setEnableExternalConfiguration(boolean z) {
        this.enableExternalConfiguration = z;
    }

    public void setEnablePrettySerializationOutput(boolean z) {
        this.enablePrettySerializationOutput = z;
    }

    public void setEnableScopePersistence(boolean z) {
        this.enableScopePersistence = z;
    }

    public void setEnableScreenTracking(boolean z) {
        this.enableScreenTracking = z;
    }

    public void setEnableShutdownHook(boolean z) {
        this.enableShutdownHook = z;
    }

    public void setEnableSpotlight(boolean z) {
        this.enableSpotlight = z;
    }

    public void setEnableTimeToFullDisplayTracing(boolean z) {
        this.enableTimeToFullDisplayTracing = z;
    }

    public void setEnableUncaughtExceptionHandler(boolean z) {
        this.enableUncaughtExceptionHandler = z;
    }

    public void setEnableUserInteractionBreadcrumbs(boolean z) {
        this.enableUserInteractionBreadcrumbs = z;
    }

    public void setEnableUserInteractionTracing(boolean z) {
        this.enableUserInteractionTracing = z;
    }

    public void setEnabled(boolean z) {
        this.enabled = z;
    }

    public void setEnvelopeDiskCache(InterfaceC1839d interfaceC1839d) {
        if (interfaceC1839d == null) {
            interfaceC1839d = C2014i.f7194a;
        }
        this.envelopeDiskCache = interfaceC1839d;
    }

    public void setEnvelopeReader(InterfaceC1622Q interfaceC1622Q) {
        C2032d c2032d = this.envelopeReader;
        if (interfaceC1622Q == null) {
            interfaceC1622Q = C1603L0.f5783a;
        }
        c2032d.m4176b(interfaceC1622Q);
    }

    public void setEnvironment(String str) {
        this.environment = str;
    }

    public void setExecutorService(InterfaceC1833c0 interfaceC1833c0) {
        if (interfaceC1833c0 != null) {
            this.executorService = interfaceC1833c0;
        }
    }

    public void setFatalLogger(ILogger iLogger) {
        if (iLogger == null) {
            iLogger = C1611N0.f5797a;
        }
        this.fatalLogger = iLogger;
    }

    public void setFeedbackOptions(C1641V1 c1641v1) {
        this.feedbackOptions = c1641v1;
    }

    public void setFlushTimeoutMillis(long j) {
        this.flushTimeoutMillis = j;
    }

    public void setForceInit(boolean z) {
        this.forceInit = z;
    }

    public void setFullyDisplayedReporter(C1582G c1582g) {
        this.fullyDisplayedReporter = c1582g;
    }

    public void setGestureTargetLocators(List<C1702a> list) {
        this.gestureTargetLocators.clear();
        this.gestureTargetLocators.addAll(list);
    }

    public void setGlobalHubMode(Boolean bool) {
        this.globalHubMode = bool;
    }

    public void setIdleTimeout(Long l) {
        this.idleTimeout = l;
    }

    public void setIgnoredCheckIns(List<String> list) {
        if (list == null) {
            this.ignoredCheckIns = null;
            return;
        }
        ArrayList arrayList = new ArrayList();
        for (String str : list) {
            if (!str.isEmpty()) {
                arrayList.add(new C1578F(str));
            }
        }
        this.ignoredCheckIns = arrayList;
    }

    public void setIgnoredErrors(List<String> list) {
        if (list == null) {
            this.ignoredErrors = null;
            return;
        }
        ArrayList arrayList = new ArrayList();
        for (String str : list) {
            if (str != null && !str.isEmpty()) {
                arrayList.add(new C1578F(str));
            }
        }
        this.ignoredErrors = arrayList;
    }

    public void setIgnoredSpanOrigins(List<String> list) {
        if (list == null) {
            this.ignoredSpanOrigins = null;
            return;
        }
        ArrayList arrayList = new ArrayList();
        for (String str : list) {
            if (str != null && !str.isEmpty()) {
                arrayList.add(new C1578F(str));
            }
        }
        this.ignoredSpanOrigins = arrayList;
    }

    public void setIgnoredTransactions(List<String> list) {
        if (list == null) {
            this.ignoredTransactions = null;
            return;
        }
        ArrayList arrayList = new ArrayList();
        for (String str : list) {
            if (str != null && !str.isEmpty()) {
                arrayList.add(new C1578F(str));
            }
        }
        this.ignoredTransactions = arrayList;
    }

    public void setInitPriority(EnumC1926m0 enumC1926m0) {
        this.initPriority = enumC1926m0;
    }

    @Deprecated
    public void setInstrumenter(EnumC1930n0 enumC1930n0) {
        this.instrumenter = enumC1930n0;
    }

    public void setLogger(ILogger iLogger) {
        this.logger = iLogger == null ? C1611N0.f5797a : new C1901c(1, this, iLogger);
    }

    public void setLogs(C1941p2 c1941p2) {
        this.logs = c1941p2;
    }

    public void setMaxAttachmentSize(long j) {
        this.maxAttachmentSize = j;
    }

    public void setMaxBreadcrumbs(int i) {
        this.maxBreadcrumbs = i;
    }

    public void setMaxCacheItems(int i) {
        this.maxCacheItems = i;
    }

    public void setMaxDepth(int i) {
        this.maxDepth = i;
    }

    public void setMaxQueueSize(int i) {
        if (i > 0) {
            this.maxQueueSize = i;
        }
    }

    public void setMaxRequestBodySize(EnumC2005t2 enumC2005t2) {
        this.maxRequestBodySize = enumC2005t2;
    }

    public void setMaxSpans(int i) {
        this.maxSpans = i;
    }

    public void setMaxTraceFileSize(long j) {
        this.maxTraceFileSize = j;
    }

    public void setModulesLoader(InterfaceC1904a interfaceC1904a) {
        if (interfaceC1904a == null) {
            interfaceC1904a = C1908e.f6796a;
        }
        this.modulesLoader = interfaceC1904a;
    }

    public void setOnDiscard(InterfaceC1980q2 interfaceC1980q2) {
    }

    public void setOpenTelemetryMode(EnumC1882h2 enumC1882h2) {
        this.openTelemetryMode = enumC1882h2;
    }

    public void setPrintUncaughtStackTrace(boolean z) {
        this.printUncaughtStackTrace = z;
    }

    public void setProfileLifecycle(EnumC1877g1 enumC1877g1) {
        this.profileLifecycle = enumC1877g1;
        if (enumC1877g1 != EnumC1877g1.TRACE || isTracingEnabled()) {
            return;
        }
        this.logger.mo3680e(EnumC1657a2.WARNING, "Profiling lifecycle is set to TRACE but tracing is disabled. Profiling will not be started automatically.", new Object[0]);
    }

    public void setProfileSessionSampleRate(Double d) {
        if (AbstractC1856a.m4077y(d, true)) {
            this.profileSessionSampleRate = d;
            return;
        }
        throw new IllegalArgumentException("The value " + d + " is not valid. Use values between 0.0 and 1.0.");
    }

    public void setProfilesSampleRate(Double d) {
        if (AbstractC1856a.m4077y(d, true)) {
            this.profilesSampleRate = d;
            return;
        }
        throw new IllegalArgumentException("The value " + d + " is not valid. Use null to disable or values between 0.0 and 1.0.");
    }

    public void setProfilesSampler(InterfaceC1984r2 interfaceC1984r2) {
    }

    public void setProfilingTracesHz(int i) {
        this.profilingTracesHz = i;
    }

    public void setProguardUuid(String str) {
        this.proguardUuid = str;
    }

    public void setProxy(C2001s2 c2001s2) {
        this.proxy = c2001s2;
    }

    public void setReadTimeoutMillis(int i) {
        this.readTimeoutMillis = i;
    }

    public void setRelease(String str) {
        this.release = str;
    }

    public void setReplayController(InterfaceC1916k1 interfaceC1916k1) {
        if (interfaceC1916k1 == null) {
            interfaceC1916k1 = C1599K0.f5774c;
        }
        this.replayController = interfaceC1916k1;
    }

    public void setSampleRate(Double d) {
        if (AbstractC1856a.m4077y(d, true)) {
            this.sampleRate = d;
            return;
        }
        throw new IllegalArgumentException("The value " + d + " is not valid. Use null to disable or values >= 0.0 and <= 1.0.");
    }

    public void setSdkVersion(C1968r c1968r) {
        C1968r c1968r2 = getSessionReplay().f7315k;
        C1968r c1968r3 = this.sdkVersion;
        if (c1968r3 != null && c1968r2 != null && c1968r3.equals(c1968r2)) {
            getSessionReplay().f7315k = c1968r;
        }
        this.sdkVersion = c1968r;
    }

    public void setSendClientReports(boolean z) {
        this.sendClientReports = z;
        if (z) {
            this.clientReportRecorder = new C1901c(this);
        } else {
            this.clientReportRecorder = new C1891i();
        }
    }

    public void setSendDefaultPii(boolean z) {
        this.sendDefaultPii = z;
    }

    public void setSendModules(boolean z) {
        this.sendModules = z;
    }

    public void setSentryClientName(String str) {
        this.sentryClientName = str;
    }

    public void setSerializer(InterfaceC1866e0 interfaceC1866e0) {
        C2032d c2032d = this.serializer;
        if (interfaceC1866e0 == null) {
            interfaceC1866e0 = C1630S0.f5856a;
        }
        c2032d.m4176b(interfaceC1866e0);
    }

    public void setServerName(String str) {
        this.serverName = str;
    }

    public void setSessionFlushTimeoutMillis(long j) {
        this.sessionFlushTimeoutMillis = j;
    }

    public void setSessionReplay(C2067z2 c2067z2) {
        this.sessionReplay = c2067z2;
    }

    public void setSessionTrackingIntervalMillis(long j) {
        this.sessionTrackingIntervalMillis = j;
    }

    public void setShutdownTimeoutMillis(long j) {
        this.shutdownTimeoutMillis = j;
    }

    public void setSocketTagger(InterfaceC1872f0 interfaceC1872f0) {
        if (interfaceC1872f0 == null) {
            interfaceC1872f0 = C1634T0.f5869a;
        }
        this.socketTagger = interfaceC1872f0;
    }

    public void setSpanFactory(InterfaceC1880h0 interfaceC1880h0) {
        this.spanFactory = interfaceC1880h0;
    }

    public void setSpotlightConnectionUrl(String str) {
        this.spotlightConnectionUrl = str;
    }

    public void setSslSocketFactory(SSLSocketFactory sSLSocketFactory) {
        this.sslSocketFactory = sSLSocketFactory;
    }

    public void setStartProfilerOnAppStart(boolean z) {
        this.startProfilerOnAppStart = z;
    }

    public void setTag(String str, String str2) {
        if (str == null) {
            return;
        }
        if (str2 == null) {
            this.tags.remove(str);
        } else {
            this.tags.put(str, str2);
        }
    }

    public void setThreadChecker(InterfaceC2040a interfaceC2040a) {
        this.threadChecker = interfaceC2040a;
    }

    public void setTraceOptionsRequests(boolean z) {
        this.traceOptionsRequests = z;
    }

    public void setTracePropagationTargets(List<String> list) {
        if (list == null) {
            this.tracePropagationTargets = null;
            return;
        }
        ArrayList arrayList = new ArrayList();
        for (String str : list) {
            if (!str.isEmpty()) {
                arrayList.add(str);
            }
        }
        this.tracePropagationTargets = arrayList;
    }

    @Deprecated
    public void setTraceSampling(boolean z) {
        this.traceSampling = z;
    }

    public void setTracesSampleRate(Double d) {
        if (AbstractC1856a.m4077y(d, true)) {
            this.tracesSampleRate = d;
            return;
        }
        throw new IllegalArgumentException("The value " + d + " is not valid. Use null to disable or values between 0.0 and 1.0.");
    }

    public void setTracesSampler(InterfaceC2028u2 interfaceC2028u2) {
    }

    public void setTransactionProfiler(InterfaceC1911j0 interfaceC1911j0) {
        if (this.transactionProfiler != C1599K0.f5776e || interfaceC1911j0 == null) {
            return;
        }
        this.transactionProfiler = interfaceC1911j0;
    }

    public void setTransportFactory(InterfaceC1915k0 interfaceC1915k0) {
        if (interfaceC1915k0 == null) {
            interfaceC1915k0 = C1646X0.f5890a;
        }
        this.transportFactory = interfaceC1915k0;
    }

    public void setTransportGate(InterfaceC2013h interfaceC2013h) {
        if (interfaceC2013h == null) {
            interfaceC2013h = C2016k.f7196a;
        }
        this.transportGate = interfaceC2013h;
    }

    public void setVersionDetector(InterfaceC1919l0 interfaceC1919l0) {
        this.versionDetector = interfaceC1919l0;
    }

    public void setViewHierarchyExporters(List<Object> list) {
        this.viewHierarchyExporters.clear();
        this.viewHierarchyExporters.addAll(list);
    }
}
