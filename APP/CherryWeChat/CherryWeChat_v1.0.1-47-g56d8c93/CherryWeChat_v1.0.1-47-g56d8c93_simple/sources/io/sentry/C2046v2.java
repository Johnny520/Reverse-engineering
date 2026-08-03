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
import io.sentry.util.thread.C2041b;
import io.sentry.util.thread.InterfaceC2040a;
import java.io.File;
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
    static final EnumC1657a2 DEFAULT_DIAGNOSTIC_LEVEL = null;
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
    private final Set<String> bundleIds;
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
    private final List<InterfaceC1566C> eventProcessors;
    private InterfaceC1833c0 executorService;
    private final C1570D experimental;
    private ILogger fatalLogger;
    private C1641V1 feedbackOptions;
    private long flushTimeoutMillis;
    private boolean forceInit;
    private C1582G fullyDisplayedReporter;
    private final List<C1702a> gestureTargetLocators;
    private Boolean globalHubMode;
    private Long idleTimeout;
    private List<C1578F> ignoredCheckIns;
    private List<C1578F> ignoredErrors;
    private final Set<Class<? extends Throwable>> ignoredExceptionsForType;
    private List<C1578F> ignoredSpanOrigins;
    private List<C1578F> ignoredTransactions;
    private final List<String> inAppExcludes;
    private final List<String> inAppIncludes;
    private EnumC1926m0 initPriority;
    private EnumC1930n0 instrumenter;
    private final List<InterfaceC1935o0> integrations;
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
    private long sessionFlushTimeoutMillis;
    private C2067z2 sessionReplay;
    private long sessionTrackingIntervalMillis;
    private long shutdownTimeoutMillis;
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

    static {
        DEFAULT_DIAGNOSTIC_LEVEL = EnumC1657a2.DEBUG;
    }

    public C2046v2(boolean r13) {
        this.eventProcessors = new CopyOnWriteArrayList();
        this.ignoredExceptionsForType = new CopyOnWriteArraySet();
        this.ignoredErrors = null;
        this.integrations = new CopyOnWriteArrayList();
        this.bundleIds = new CopyOnWriteArraySet();
        final int r3 = 0;
        this.parsedDsn = new C2032d(new C1897i2(this, r3));
        this.shutdownTimeoutMillis = 2000;
        this.flushTimeoutMillis = 15000;
        this.sessionFlushTimeoutMillis = 15000;
        C1611N0 r1 = C1611N0.f5797a;
        this.logger = r1;
        this.fatalLogger = r1;
        this.diagnosticLevel = DEFAULT_DIAGNOSTIC_LEVEL;
        final int r4 = 1;
        this.serializer = new C2032d(new C1897i2(this, r4));
        final int r42 = 2;
        this.envelopeReader = new C2032d(new C1897i2(this, r42));
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
        this.sessionTrackingIntervalMillis = 30000;
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
        this.maxAttachmentSize = 20971520;
        this.enableDeduplication = true;
        this.maxSpans = 1000;
        this.enableShutdownHook = true;
        this.maxRequestBodySize = EnumC2005t2.NONE;
        this.traceSampling = true;
        this.maxTraceFileSize = 5242880;
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
        this.deadlineTimeout = 30000;
        C1941p2 r6 = new C1941p2();
        r6.f6831a = false;
        this.logs = r6;
        this.socketTagger = C1634T0.f5869a;
        C1968r r62 = new C1968r("sentry.java", "8.21.1");
        r62.f7000b = "8.21.1";
        this.experimental = new C1570D();
        C2067z2 r7 = new C2067z2();
        CopyOnWriteArraySet r9 = new CopyOnWriteArraySet();
        r7.f7307c = r9;
        CopyOnWriteArraySet r10 = new CopyOnWriteArraySet();
        r7.f7308d = r10;
        r7.f7309e = EnumC2063y2.MEDIUM;
        r7.f7310f = 1;
        r7.f7311g = 30000;
        r7.f7312h = 5000;
        r7.f7313i = 3600000;
        r7.f7314j = true;
        r7.f7316l = false;
        if (r13 == true) goto L5;
        r9.add("android.widget.TextView");
        r10.remove("android.widget.TextView");
        r9.add("android.widget.ImageView");
        r10.remove("android.widget.ImageView");
        r9.add("android.webkit.WebView");
        r9.add("android.widget.VideoView");
        r9.add("androidx.media3.ui.PlayerView");
        r9.add("com.google.android.exoplayer2.ui.PlayerView");
        r9.add("com.google.android.exoplayer2.ui.StyledPlayerView");
        r7.f7315k = r62;
    L5:
        this.sessionReplay = r7;
        C1641V1 r32 = new C1641V1();
        r32.f5882a = false;
        r32.f5883b = true;
        r32.f5884c = false;
        r32.f5885d = true;
        r32.f5886e = true;
        r32.f5887f = true;
        this.feedbackOptions = r32;
        if (r13 == false) goto L8;
        return;
    L8:
        if (AbstractC2034f.f7219a == false) goto L10;
    L19:
        InterfaceC1880h0 r132 = new C1640V0(1);
    L20:
        setSpanFactory(r132);
        C1638U1 r133 = new C1638U1(this);
        this.executorService = r133;
        r133.mo3700m();
        this.integrations.add(new UncaughtExceptionHandlerIntegration());
        this.integrations.add(new ShutdownHookIntegration());
        this.integrations.add(new SpotlightIntegration());
        this.eventProcessors.add(new C1575E0(this));
        this.eventProcessors.add(new C1934o(this));
        if (AbstractC2034f.f7219a == true) goto L23;
        this.eventProcessors.add(new C1561A2());
    L23:
        setSentryClientName("sentry.java/8.21.1");
        setSdkVersion(r62);
        C1650Y1.m3790d().m3792b("maven:io.sentry:sentry", "8.21.1");
        return;
    L10:
        if (C1891i.m4095e("io.sentry.opentelemetry.OtelSpanFactory", r1) == false) goto L19;
        Class r134 = C1891i.m4096h("io.sentry.opentelemetry.OtelSpanFactory", r1);
        if (r134 == null) goto L19;
        Object r135 = r134.getDeclaredConstructor(null).newInstance(null);     // Catch: Throwable -> L25
        if (r135 == null) goto L19;
        if ((r135 instanceof InterfaceC1880h0) == false) goto L19;
        r132 = (InterfaceC1880h0) r135;     // Catch: Throwable -> L25
        goto L20
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ C2064z m4185a(C2046v2 r1) {
        return new C2064z(r1.dsn);
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ C1558A m4186b(C2046v2 r1) {
        return new C1558A((InterfaceC1866e0) r1.serializer.m4175a());
    }

    public static C2046v2 empty() {
        return new C2046v2(true);
    }

    public void addBundleId(String r2) {
        if (r2 == null) goto L7;
        String r22 = r2.trim();
        if (r22.isEmpty() == true) goto L8;
        this.bundleIds.add(r22);
        return;
    L8:
        return;
    }

    public void addContextTag(String r2) {
        this.contextTags.add(r2);
    }

    public void addEventProcessor(InterfaceC1566C r2) {
        this.eventProcessors.add(r2);
    }

    public void addIgnoredCheckIn(String r3) {
        if (this.ignoredCheckIns != null) goto L5;
        this.ignoredCheckIns = new ArrayList();
    L5:
        this.ignoredCheckIns.add(new C1578F(r3));
    }

    public void addIgnoredError(String r3) {
        if (this.ignoredErrors != null) goto L5;
        this.ignoredErrors = new ArrayList();
    L5:
        this.ignoredErrors.add(new C1578F(r3));
    }

    public void addIgnoredExceptionForType(Class<? extends Throwable> r2) {
        this.ignoredExceptionsForType.add(r2);
    }

    public void addIgnoredSpanOrigin(String r3) {
        if (this.ignoredSpanOrigins != null) goto L5;
        this.ignoredSpanOrigins = new ArrayList();
    L5:
        this.ignoredSpanOrigins.add(new C1578F(r3));
    }

    public void addIgnoredTransaction(String r3) {
        if (this.ignoredTransactions != null) goto L5;
        this.ignoredTransactions = new ArrayList();
    L5:
        this.ignoredTransactions.add(new C1578F(r3));
    }

    public void addInAppExclude(String r2) {
        this.inAppExcludes.add(r2);
    }

    public void addInAppInclude(String r2) {
        this.inAppIncludes.add(r2);
    }

    public void addIntegration(InterfaceC1935o0 r2) {
        this.integrations.add(r2);
    }

    public void addOptionsObserver(InterfaceC1633T r2) {
        this.optionsObservers.add(r2);
    }

    public void addPerformanceCollector(InterfaceC1636U r2) {
        this.performanceCollectors.add(r2);
    }

    public void addScopeObserver(InterfaceC1648Y r2) {
        this.observers.add(r2);
    }

    public boolean containsIgnoredExceptionForType(Throwable r2) {
        return this.ignoredExceptionsForType.contains(r2.getClass());
    }

    public C1841f findPersistingScopeObserver() {
        Iterator<InterfaceC1648Y> r0 = this.observers.iterator();
    L4:
        if (r0.hasNext() == false) goto L9;
        InterfaceC1648Y r1 = r0.next();
        if ((r1 instanceof C1841f) == false) goto L4;
        return (C1841f) r1;
    L9:
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
        String r0 = this.cacheDirPath;
        if (r0 != null) goto L5;
        return null;
    L5:
        if (r0.isEmpty() == false) goto L8;
        return null;
    L8:
        if (this.dsnHash == null) goto L12;
        return new File(this.cacheDirPath, this.dsnHash).getAbsolutePath();
    L12:
        return this.cacheDirPath;
    }

    public String getCacheDirPathWithoutDsn() {
        String r0 = this.cacheDirPath;
        if (r0 != null) goto L5;
        return null;
    L5:
        if (r0.isEmpty() == false) goto L8;
        return null;
    L8:
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
        String r0 = this.environment;
        if (r0 == null) goto L5;
        return r0;
    L5:
        return DEFAULT_ENVIRONMENT;
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
        if (this.internalTracesSampler != null) goto L18;
        C1981r r0 = this.lock.m4173a();
    L9:
        th = move-exception;
        r0.close();     // Catch: Throwable -> L14
    L16:
        throw th;
    L14:
        th = move-exception;
        th.addSuppressed(th);
        goto L16
    L6:
        if (this.internalTracesSampler != null) goto L11;
        this.internalTracesSampler = new C1617O2(this);     // Catch: Throwable -> L9
    L11:
        r0.close();
    L18:
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
        String r0 = getCacheDirPath();
        if (r0 != null) goto L7;
        return null;
    L7:
        return new File(r0, "outbox").getAbsolutePath();
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
        String r0 = getCacheDirPath();
        if (r0 != null) goto L7;
        return null;
    L7:
        return new File(r0, "profiling_traces").getAbsolutePath();
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
        List<String> r0 = this.tracePropagationTargets;
        if (r0 == null) goto L5;
        return r0;
    L5:
        return this.defaultTracePropagationTargets;
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
        if (this.profilesSampleRate != null) goto L10;
        Double r0 = this.profileSessionSampleRate;
        if (r0 != null) goto L7;
        return false;
    L7:
        if (r0.doubleValue() <= 0.0d) goto L13;
        return true;
    L13:
        return false;
    L10:
        return false;
    }

    public boolean isDebug() {
        return this.debug;
    }

    public boolean isEnableAppStartProfiling() {
        if (isProfilingEnabled() == true) goto L7;
        if (isContinuousProfilingEnabled() == true) goto L7;
        return false;
    L7:
        if (this.enableAppStartProfiling == false) goto L12;
        return true;
    L12:
        return false;
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
        Double r0 = this.profilesSampleRate;
        if (r0 != null) goto L5;
        return false;
    L5:
        if (r0.doubleValue() <= 0.0d) goto L11;
        return true;
    L11:
        return false;
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
        if (getTracesSampleRate() != null) goto L6;
        getTracesSampler();
        return false;
    L6:
        return true;
    }

    public void loadLazyFields() {
        getSerializer();
        retrieveParsedDsn();
        getEnvelopeReader();
        getDateProvider();
    }

    public void merge(C1574E r5) {
        String r0 = r5.f5658a;
        if (r0 == null) goto L5;
        setDsn(r0);
    L5:
        String r02 = r5.f5659b;
        if (r02 == null) goto L8;
        setEnvironment(r02);
    L8:
        String r03 = r5.f5660c;
        if (r03 == null) goto L11;
        setRelease(r03);
    L11:
        String r04 = r5.f5661d;
        if (r04 == null) goto L14;
        setDist(r04);
    L14:
        String r05 = r5.f5662e;
        if (r05 == null) goto L17;
        setServerName(r05);
    L17:
        C2001s2 r06 = r5.f5670m;
        if (r06 == null) goto L20;
        setProxy(r06);
    L20:
        Boolean r07 = r5.f5663f;
        if (r07 == null) goto L23;
        setEnableUncaughtExceptionHandler(r07.booleanValue());
    L23:
        Boolean r08 = r5.f5679v;
        if (r08 == null) goto L26;
        setPrintUncaughtStackTrace(r08.booleanValue());
    L26:
        Double r09 = r5.f5666i;
        if (r09 == null) goto L29;
        setTracesSampleRate(r09);
    L29:
        Double r010 = r5.f5667j;
        if (r010 == null) goto L32;
        setProfilesSampleRate(r010);
    L32:
        Boolean r011 = r5.f5664g;
        if (r011 == null) goto L35;
        setDebug(r011.booleanValue());
    L35:
        Boolean r012 = r5.f5665h;
        if (r012 == null) goto L38;
        setEnableDeduplication(r012.booleanValue());
    L38:
        Boolean r013 = r5.f5680w;
        if (r013 == null) goto L41;
        setSendClientReports(r013.booleanValue());
    L41:
        Boolean r014 = r5.f5655J;
        if (r014 == null) goto L44;
        setForceInit(r014.booleanValue());
    L44:
        Iterator r015 = new HashMap(r5.f5669l).entrySet().iterator();
    L46:
        if (r015.hasNext() == false) goto L48;
        Map.Entry r1 = (Map.Entry) r015.next();
        this.tags.put((String) r1.getKey(), (String) r1.getValue());
        goto L46
    L48:
        Iterator r016 = new ArrayList(r5.f5672o).iterator();
    L50:
        if (r016.hasNext() == false) goto L52;
        addInAppInclude((String) r016.next());
        goto L50
    L52:
        Iterator r017 = new ArrayList(r5.f5671n).iterator();
    L54:
        if (r017.hasNext() == false) goto L56;
        addInAppExclude((String) r017.next());
        goto L54
    L56:
        Iterator r018 = new HashSet(r5.f5677t).iterator();
    L58:
        if (r018.hasNext() == false) goto L61;
        addIgnoredExceptionForType((Class) r018.next());
        goto L58
    L61:
        if (r5.f5673p == null) goto L63;
        setTracePropagationTargets(new ArrayList(r5.f5673p));
    L63:
        Iterator r019 = new ArrayList(r5.f5674q).iterator();
    L65:
        if (r019.hasNext() == false) goto L67;
        addContextTag((String) r019.next());
        goto L65
    L67:
        String r020 = r5.f5675r;
        if (r020 == null) goto L70;
        setProguardUuid(r020);
    L70:
        Long r021 = r5.f5676s;
        if (r021 == null) goto L73;
        setIdleTimeout(r021);
    L73:
        Iterator r022 = r5.f5681x.iterator();
    L75:
        if (r022.hasNext() == false) goto L77;
        addBundleId((String) r022.next());
        goto L75
    L77:
        Boolean r023 = r5.f5682y;
        if (r023 == null) goto L80;
        setEnabled(r023.booleanValue());
    L80:
        Boolean r024 = r5.f5683z;
        if (r024 == null) goto L83;
        setEnablePrettySerializationOutput(r024.booleanValue());
    L83:
        Boolean r025 = r5.f5651F;
        if (r025 == null) goto L87;
        setSendModules(r025.booleanValue());
    L87:
        if (r5.f5649D == null) goto L90;
        setIgnoredCheckIns(new ArrayList(r5.f5649D));
    L90:
        if (r5.f5650E == null) goto L93;
        setIgnoredTransactions(new ArrayList(r5.f5650E));
    L93:
        if (r5.f5678u == null) goto L95;
        setIgnoredErrors(new ArrayList(r5.f5678u));
    L95:
        Boolean r026 = r5.f5653H;
        if (r026 == null) goto L98;
        setEnableBackpressureHandling(r026.booleanValue());
    L98:
        EnumC2005t2 r027 = r5.f5668k;
        if (r027 == null) goto L101;
        setMaxRequestBodySize(r027);
    L101:
        Boolean r028 = r5.f5652G;
        if (r028 == null) goto L104;
        setSendDefaultPii(r028.booleanValue());
    L104:
        Boolean r029 = r5.f5656K;
        if (r029 == null) goto L107;
        setCaptureOpenTelemetryEvents(r029.booleanValue());
    L107:
        Boolean r030 = r5.f5646A;
        if (r030 == null) goto L110;
        setEnableSpotlight(r030.booleanValue());
    L110:
        String r031 = r5.f5648C;
        if (r031 == null) goto L113;
        setSpotlightConnectionUrl(r031);
    L113:
        Boolean r032 = r5.f5654I;
        if (r032 == null) goto L117;
        setGlobalHubMode(r032);
    L117:
        if (r5.f5657L == null) goto L137;
        if (getCron() != null) goto L122;
        setCron(r5.f5657L);
        goto L137
    L122:
        if (r5.f5657L.f6823a == null) goto L125;
        C1937o2 r033 = getCron();
        r033.f6823a = r5.f5657L.f6823a;
    L125:
        if (r5.f5657L.f6824b == null) goto L128;
        C1937o2 r034 = getCron();
        r034.f6824b = r5.f5657L.f6824b;
    L128:
        if (r5.f5657L.f6825c == null) goto L131;
        C1937o2 r035 = getCron();
        r035.f6825c = r5.f5657L.f6825c;
    L131:
        if (r5.f5657L.f6826d == null) goto L134;
        C1937o2 r036 = getCron();
        r036.f6826d = r5.f5657L.f6826d;
    L134:
        if (r5.f5657L.f6827e == null) goto L137;
        C1937o2 r037 = getCron();
        r037.f6827e = r5.f5657L.f6827e;
    L137:
        if (r5.f5647B == null) goto L146;
        C1941p2 r038 = getLogs();
        r038.f6831a = r5.f5647B.booleanValue();
        return;
    }

    public C2064z retrieveParsedDsn() {
        return (C2064z) this.parsedDsn.m4175a();
    }

    public void setAttachServerName(boolean r1) {
        this.attachServerName = r1;
    }

    public void setAttachStacktrace(boolean r1) {
        this.attachStacktrace = r1;
    }

    public void setAttachThreads(boolean r1) {
        this.attachThreads = r1;
    }

    public void setBackpressureMonitor(InterfaceC1830b r1) {
        this.backpressureMonitor = r1;
    }

    public void setBeforeBreadcrumb(InterfaceC1913j2 r1) {
    }

    public void setBeforeEnvelopeCallback(InterfaceC1917k2 r1) {
        this.beforeEnvelopeCallback = r1;
    }

    public void setBeforeSend(InterfaceC1921l2 r1) {
    }

    public void setBeforeSendFeedback(InterfaceC1921l2 r1) {
    }

    public void setBeforeSendReplay(InterfaceC1928m2 r1) {
    }

    public void setBeforeSendTransaction(InterfaceC1932n2 r1) {
    }

    public void setCacheDirPath(String r1) {
        this.cacheDirPath = r1;
    }

    public void setCaptureOpenTelemetryEvents(boolean r1) {
        this.captureOpenTelemetryEvents = r1;
    }

    public void setCompositePerformanceCollector(InterfaceC1925m r1) {
        this.compositePerformanceCollector = r1;
    }

    public void setConnectionStatusProvider(InterfaceC1614O r1) {
        this.connectionStatusProvider = r1;
    }

    public void setConnectionTimeoutMillis(int r1) {
        this.connectionTimeoutMillis = r1;
    }

    public void setContinuousProfiler(InterfaceC1618P r3) {
        if (this.continuousProfiler != C1599K0.f5772a) goto L7;
        if (r3 == null) goto L8;
        this.continuousProfiler = r3;
        return;
    L8:
        return;
    }

    public void setCron(C1937o2 r1) {
        this.cron = r1;
    }

    public void setDateProvider(InterfaceC1592I1 r2) {
        this.dateProvider.m4176b(r2);
    }

    public void setDeadlineTimeout(long r1) {
        this.deadlineTimeout = r1;
    }

    public void setDebug(boolean r1) {
        this.debug = r1;
    }

    public void setDebugMetaLoader(InterfaceC1899a r1) {
        if (r1 != null) goto L5;
        r1 = C1900b.f6779a;
    L5:
        this.debugMetaLoader = r1;
    }

    public void setDefaultScopeType(EnumC2027u1 r1) {
        this.defaultScopeType = r1;
    }

    public void setDiagnosticLevel(EnumC1657a2 r1) {
        if (r1 != null) goto L5;
        r1 = DEFAULT_DIAGNOSTIC_LEVEL;
    L5:
        this.diagnosticLevel = r1;
    }

    public void setDist(String r1) {
        this.dist = r1;
    }

    public void setDistinctId(String r1) {
        this.distinctId = r1;
    }

    public void setDsn(String r6) {
        this.dsn = r6;
        C2032d r62 = this.parsedDsn;
        C1981r r0 = r62.f7218c.m4173a();
        String r1 = null;
        r62.f7216a = null;     // Catch: Throwable -> L19
        r0.close();
        String r63 = this.dsn;
        ILogger r02 = this.logger;
        Charset r2 = AbstractC2038j.f7226a;
        if (r63 != null) goto L7;
    L17:
        this.dsnHash = r1;
        return;
    L7:
        if (r63.isEmpty() == true) goto L17;
        r1 = new StringBuilder(new BigInteger(1, MessageDigest.getInstance("SHA-1").digest(r63.getBytes(AbstractC2038j.f7226a))).toString(16)).toString();     // Catch: Throwable -> L11 NoSuchAlgorithmException -> L13
    L13:
        e = move-exception;
        r02.mo3683r(EnumC1657a2.INFO, "SHA-1 isn't available to calculate the hash.", e);
    L11:
        th = move-exception;
        r02.mo3680e(EnumC1657a2.INFO, "string: %s could not calculate its hash", new Object[]{th, r63});
    L19:
        th = move-exception;
        r0.close();     // Catch: Throwable -> L22
    L24:
        throw th;
    L22:
        th = move-exception;
        th.addSuppressed(th);
        goto L24
    }

    public void setEnableAppStartProfiling(boolean r1) {
        this.enableAppStartProfiling = r1;
    }

    public void setEnableAutoSessionTracking(boolean r1) {
        this.enableAutoSessionTracking = r1;
    }

    public void setEnableBackpressureHandling(boolean r1) {
        this.enableBackpressureHandling = r1;
    }

    public void setEnableDeduplication(boolean r1) {
        this.enableDeduplication = r1;
    }

    public void setEnableExternalConfiguration(boolean r1) {
        this.enableExternalConfiguration = r1;
    }

    public void setEnablePrettySerializationOutput(boolean r1) {
        this.enablePrettySerializationOutput = r1;
    }

    public void setEnableScopePersistence(boolean r1) {
        this.enableScopePersistence = r1;
    }

    public void setEnableScreenTracking(boolean r1) {
        this.enableScreenTracking = r1;
    }

    public void setEnableShutdownHook(boolean r1) {
        this.enableShutdownHook = r1;
    }

    public void setEnableSpotlight(boolean r1) {
        this.enableSpotlight = r1;
    }

    public void setEnableTimeToFullDisplayTracing(boolean r1) {
        this.enableTimeToFullDisplayTracing = r1;
    }

    public void setEnableUncaughtExceptionHandler(boolean r1) {
        this.enableUncaughtExceptionHandler = r1;
    }

    public void setEnableUserInteractionBreadcrumbs(boolean r1) {
        this.enableUserInteractionBreadcrumbs = r1;
    }

    public void setEnableUserInteractionTracing(boolean r1) {
        this.enableUserInteractionTracing = r1;
    }

    public void setEnabled(boolean r1) {
        this.enabled = r1;
    }

    public void setEnvelopeDiskCache(InterfaceC1839d r1) {
        if (r1 != null) goto L5;
        r1 = C2014i.f7194a;
    L5:
        this.envelopeDiskCache = r1;
    }

    public void setEnvelopeReader(InterfaceC1622Q r2) {
        C2032d r0 = this.envelopeReader;
        if (r2 != null) goto L6;
        r2 = C1603L0.f5783a;
    L6:
        r0.m4176b(r2);
    }

    public void setEnvironment(String r1) {
        this.environment = r1;
    }

    public void setExecutorService(InterfaceC1833c0 r1) {
        if (r1 == null) goto L5;
        this.executorService = r1;
        return;
    }

    public void setFatalLogger(ILogger r1) {
        if (r1 != null) goto L4;
        r1 = C1611N0.f5797a;
    L4:
        this.fatalLogger = r1;
    }

    public void setFeedbackOptions(C1641V1 r1) {
        this.feedbackOptions = r1;
    }

    public void setFlushTimeoutMillis(long r1) {
        this.flushTimeoutMillis = r1;
    }

    public void setForceInit(boolean r1) {
        this.forceInit = r1;
    }

    public void setFullyDisplayedReporter(C1582G r1) {
        this.fullyDisplayedReporter = r1;
    }

    public void setGestureTargetLocators(List<C1702a> r2) {
        this.gestureTargetLocators.clear();
        this.gestureTargetLocators.addAll(r2);
    }

    public void setGlobalHubMode(Boolean r1) {
        this.globalHubMode = r1;
    }

    public void setIdleTimeout(Long r1) {
        this.idleTimeout = r1;
    }

    public void setIgnoredCheckIns(List<String> r4) {
        if (r4 != null) goto L5;
        this.ignoredCheckIns = null;
        return;
    L5:
        ArrayList r0 = new ArrayList();
        Iterator<String> r42 = r4.iterator();
    L7:
        if (r42.hasNext() == false) goto L11;
        String r1 = r42.next();
        if (r1.isEmpty() == true) goto L7;
        r0.add(new C1578F(r1));
        goto L7
    L11:
        this.ignoredCheckIns = r0;
    }

    public void setIgnoredErrors(List<String> r4) {
        if (r4 != null) goto L5;
        this.ignoredErrors = null;
        return;
    L5:
        ArrayList r0 = new ArrayList();
        Iterator<String> r42 = r4.iterator();
    L7:
        if (r42.hasNext() == false) goto L13;
        String r1 = r42.next();
        if (r1 == null) goto L7;
        if (r1.isEmpty() == true) goto L7;
        r0.add(new C1578F(r1));
        goto L7
    L13:
        this.ignoredErrors = r0;
    }

    public void setIgnoredSpanOrigins(List<String> r4) {
        if (r4 != null) goto L5;
        this.ignoredSpanOrigins = null;
        return;
    L5:
        ArrayList r0 = new ArrayList();
        Iterator<String> r42 = r4.iterator();
    L7:
        if (r42.hasNext() == false) goto L13;
        String r1 = r42.next();
        if (r1 == null) goto L7;
        if (r1.isEmpty() == true) goto L7;
        r0.add(new C1578F(r1));
        goto L7
    L13:
        this.ignoredSpanOrigins = r0;
    }

    public void setIgnoredTransactions(List<String> r4) {
        if (r4 != null) goto L5;
        this.ignoredTransactions = null;
        return;
    L5:
        ArrayList r0 = new ArrayList();
        Iterator<String> r42 = r4.iterator();
    L7:
        if (r42.hasNext() == false) goto L13;
        String r1 = r42.next();
        if (r1 == null) goto L7;
        if (r1.isEmpty() == true) goto L7;
        r0.add(new C1578F(r1));
        goto L7
    L13:
        this.ignoredTransactions = r0;
    }

    public void setInitPriority(EnumC1926m0 r1) {
        this.initPriority = r1;
    }

    @Deprecated
    public void setInstrumenter(EnumC1930n0 r1) {
        this.instrumenter = r1;
    }

    public void setLogger(ILogger r3) {
        if (r3 != null) goto L4;
        ILogger r32 = C1611N0.f5797a;
    L5:
        this.logger = r32;
        return;
    L4:
        r32 = new C1901c(1, this, r3);
        goto L5
    }

    public void setLogs(C1941p2 r1) {
        this.logs = r1;
    }

    public void setMaxAttachmentSize(long r1) {
        this.maxAttachmentSize = r1;
    }

    public void setMaxBreadcrumbs(int r1) {
        this.maxBreadcrumbs = r1;
    }

    public void setMaxCacheItems(int r1) {
        this.maxCacheItems = r1;
    }

    public void setMaxDepth(int r1) {
        this.maxDepth = r1;
    }

    public void setMaxQueueSize(int r1) {
        if (r1 <= 0) goto L5;
        this.maxQueueSize = r1;
        return;
    }

    public void setMaxRequestBodySize(EnumC2005t2 r1) {
        this.maxRequestBodySize = r1;
    }

    public void setMaxSpans(int r1) {
        this.maxSpans = r1;
    }

    public void setMaxTraceFileSize(long r1) {
        this.maxTraceFileSize = r1;
    }

    public void setModulesLoader(InterfaceC1904a r1) {
        if (r1 != null) goto L5;
        r1 = C1908e.f6796a;
    L5:
        this.modulesLoader = r1;
    }

    public void setOnDiscard(InterfaceC1980q2 r1) {
    }

    public void setOpenTelemetryMode(EnumC1882h2 r1) {
        this.openTelemetryMode = r1;
    }

    public void setPrintUncaughtStackTrace(boolean r1) {
        this.printUncaughtStackTrace = r1;
    }

    public void setProfileLifecycle(EnumC1877g1 r4) {
        this.profileLifecycle = r4;
        if (r4 == EnumC1877g1.TRACE) goto L5;
        return;
    L5:
        if (isTracingEnabled() == true) goto L9;
        this.logger.mo3680e(EnumC1657a2.WARNING, "Profiling lifecycle is set to TRACE but tracing is disabled. Profiling will not be started automatically.", new Object[0]);
        return;
    }

    public void setProfileSessionSampleRate(Double r4) {
        if (AbstractC1856a.m4077y(r4, true) == false) goto L7;
        this.profileSessionSampleRate = r4;
        return;
    L7:
        throw new IllegalArgumentException("The value " + r4 + " is not valid. Use values between 0.0 and 1.0.");
    }

    public void setProfilesSampleRate(Double r4) {
        if (AbstractC1856a.m4077y(r4, true) == false) goto L7;
        this.profilesSampleRate = r4;
        return;
    L7:
        throw new IllegalArgumentException("The value " + r4 + " is not valid. Use null to disable or values between 0.0 and 1.0.");
    }

    public void setProfilesSampler(InterfaceC1984r2 r1) {
    }

    public void setProfilingTracesHz(int r1) {
        this.profilingTracesHz = r1;
    }

    public void setProguardUuid(String r1) {
        this.proguardUuid = r1;
    }

    public void setProxy(C2001s2 r1) {
        this.proxy = r1;
    }

    public void setReadTimeoutMillis(int r1) {
        this.readTimeoutMillis = r1;
    }

    public void setRelease(String r1) {
        this.release = r1;
    }

    public void setReplayController(InterfaceC1916k1 r1) {
        if (r1 != null) goto L5;
        r1 = C1599K0.f5774c;
    L5:
        this.replayController = r1;
    }

    public void setSampleRate(Double r4) {
        if (AbstractC1856a.m4077y(r4, true) == false) goto L7;
        this.sampleRate = r4;
        return;
    L7:
        throw new IllegalArgumentException("The value " + r4 + " is not valid. Use null to disable or values >= 0.0 and <= 1.0.");
    }

    public void setSdkVersion(C1968r r3) {
        C1968r r0 = getSessionReplay().f7315k;
        C1968r r1 = this.sdkVersion;
        if (r1 == null) goto L8;
        if (r0 == null) goto L8;
        if (r1.equals(r0) == false) goto L8;
        getSessionReplay().f7315k = r3;
    L8:
        this.sdkVersion = r3;
    }

    public void setSendClientReports(boolean r1) {
        this.sendClientReports = r1;
        if (r1 == false) goto L6;
        this.clientReportRecorder = new C1901c(this);
        return;
    L6:
        this.clientReportRecorder = new C1891i();
    }

    public void setSendDefaultPii(boolean r1) {
        this.sendDefaultPii = r1;
    }

    public void setSendModules(boolean r1) {
        this.sendModules = r1;
    }

    public void setSentryClientName(String r1) {
        this.sentryClientName = r1;
    }

    public void setSerializer(InterfaceC1866e0 r2) {
        C2032d r0 = this.serializer;
        if (r2 != null) goto L6;
        r2 = C1630S0.f5856a;
    L6:
        r0.m4176b(r2);
    }

    public void setServerName(String r1) {
        this.serverName = r1;
    }

    public void setSessionFlushTimeoutMillis(long r1) {
        this.sessionFlushTimeoutMillis = r1;
    }

    public void setSessionReplay(C2067z2 r1) {
        this.sessionReplay = r1;
    }

    public void setSessionTrackingIntervalMillis(long r1) {
        this.sessionTrackingIntervalMillis = r1;
    }

    public void setShutdownTimeoutMillis(long r1) {
        this.shutdownTimeoutMillis = r1;
    }

    public void setSocketTagger(InterfaceC1872f0 r1) {
        if (r1 != null) goto L5;
        r1 = C1634T0.f5869a;
    L5:
        this.socketTagger = r1;
    }

    public void setSpanFactory(InterfaceC1880h0 r1) {
        this.spanFactory = r1;
    }

    public void setSpotlightConnectionUrl(String r1) {
        this.spotlightConnectionUrl = r1;
    }

    public void setSslSocketFactory(SSLSocketFactory r1) {
        this.sslSocketFactory = r1;
    }

    public void setStartProfilerOnAppStart(boolean r1) {
        this.startProfilerOnAppStart = r1;
    }

    public void setTag(String r2, String r3) {
        if (r2 != null) goto L4;
        return;
    L4:
        if (r3 != null) goto L7;
        this.tags.remove(r2);
        return;
    L7:
        this.tags.put(r2, r3);
    }

    public void setThreadChecker(InterfaceC2040a r1) {
        this.threadChecker = r1;
    }

    public void setTraceOptionsRequests(boolean r1) {
        this.traceOptionsRequests = r1;
    }

    public void setTracePropagationTargets(List<String> r4) {
        if (r4 != null) goto L5;
        this.tracePropagationTargets = null;
        return;
    L5:
        ArrayList r0 = new ArrayList();
        Iterator<String> r42 = r4.iterator();
    L7:
        if (r42.hasNext() == false) goto L11;
        String r1 = r42.next();
        if (r1.isEmpty() == true) goto L7;
        r0.add(r1);
        goto L7
    L11:
        this.tracePropagationTargets = r0;
    }

    @Deprecated
    public void setTraceSampling(boolean r1) {
        this.traceSampling = r1;
    }

    public void setTracesSampleRate(Double r4) {
        if (AbstractC1856a.m4077y(r4, true) == false) goto L7;
        this.tracesSampleRate = r4;
        return;
    L7:
        throw new IllegalArgumentException("The value " + r4 + " is not valid. Use null to disable or values between 0.0 and 1.0.");
    }

    public void setTracesSampler(InterfaceC2028u2 r1) {
    }

    public void setTransactionProfiler(InterfaceC1911j0 r3) {
        if (this.transactionProfiler != C1599K0.f5776e) goto L7;
        if (r3 == null) goto L8;
        this.transactionProfiler = r3;
        return;
    L8:
        return;
    }

    public void setTransportFactory(InterfaceC1915k0 r1) {
        if (r1 != null) goto L5;
        r1 = C1646X0.f5890a;
    L5:
        this.transportFactory = r1;
    }

    public void setTransportGate(InterfaceC2013h r1) {
        if (r1 != null) goto L5;
        r1 = C2016k.f7196a;
    L5:
        this.transportGate = r1;
    }

    public void setVersionDetector(InterfaceC1919l0 r1) {
        this.versionDetector = r1;
    }

    public void setViewHierarchyExporters(List<Object> r2) {
        this.viewHierarchyExporters.clear();
        this.viewHierarchyExporters.addAll(r2);
    }
}
