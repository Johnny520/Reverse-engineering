.class public Lio/sentry/v2;
.super Ljava/lang/Object;
.source ""


# static fields
.field static final DEFAULT_DIAGNOSTIC_LEVEL:Lio/sentry/a2;

.field private static final DEFAULT_ENVIRONMENT:Ljava/lang/String; = "production"

.field public static final DEFAULT_PROPAGATION_TARGETS:Ljava/lang/String; = ".*"


# instance fields
.field private attachServerName:Z

.field private attachStacktrace:Z

.field private attachThreads:Z

.field private backpressureMonitor:Lio/sentry/backpressure/b;

.field private beforeBreadcrumb:Lio/sentry/j2;

.field private beforeEnvelopeCallback:Lio/sentry/k2;

.field private beforeSend:Lio/sentry/l2;

.field private beforeSendFeedback:Lio/sentry/l2;

.field private beforeSendReplay:Lio/sentry/m2;

.field private beforeSendTransaction:Lio/sentry/n2;

.field private final bundleIds:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private cacheDirPath:Ljava/lang/String;

.field private captureOpenTelemetryEvents:Z

.field clientReportRecorder:Lio/sentry/clientreport/f;

.field private compositePerformanceCollector:Lio/sentry/m;

.field private connectionStatusProvider:Lio/sentry/O;

.field private connectionTimeoutMillis:I

.field private final contextTags:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private continuousProfiler:Lio/sentry/P;

.field private cron:Lio/sentry/o2;

.field private final dateProvider:Lio/sentry/util/d;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lio/sentry/util/d;"
        }
    .end annotation
.end field

.field private deadlineTimeout:J

.field private debug:Z

.field private debugMetaLoader:Lio/sentry/internal/debugmeta/a;

.field private defaultScopeType:Lio/sentry/u1;

.field private final defaultTracePropagationTargets:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private diagnosticLevel:Lio/sentry/a2;

.field private dist:Ljava/lang/String;

.field private distinctId:Ljava/lang/String;

.field private dsn:Ljava/lang/String;

.field private dsnHash:Ljava/lang/String;

.field private enableAppStartProfiling:Z

.field private enableAutoSessionTracking:Z

.field private enableBackpressureHandling:Z

.field private enableDeduplication:Z

.field private enableExternalConfiguration:Z

.field private enablePrettySerializationOutput:Z

.field private enableScopePersistence:Z

.field private enableScreenTracking:Z

.field private enableShutdownHook:Z

.field private enableSpotlight:Z

.field private enableTimeToFullDisplayTracing:Z

.field private enableUncaughtExceptionHandler:Z

.field private enableUserInteractionBreadcrumbs:Z

.field private enableUserInteractionTracing:Z

.field private enabled:Z

.field private envelopeDiskCache:Lio/sentry/cache/d;

.field private final envelopeReader:Lio/sentry/util/d;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lio/sentry/util/d;"
        }
    .end annotation
.end field

.field private environment:Ljava/lang/String;

.field private final eventProcessors:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lio/sentry/C;",
            ">;"
        }
    .end annotation
.end field

.field private executorService:Lio/sentry/c0;

.field private final experimental:Lio/sentry/D;

.field private fatalLogger:Lio/sentry/ILogger;

.field private feedbackOptions:Lio/sentry/V1;

.field private flushTimeoutMillis:J

.field private forceInit:Z

.field private fullyDisplayedReporter:Lio/sentry/G;

.field private final gestureTargetLocators:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lio/sentry/android/core/internal/gestures/a;",
            ">;"
        }
    .end annotation
.end field

.field private globalHubMode:Ljava/lang/Boolean;

.field private idleTimeout:Ljava/lang/Long;

.field private ignoredCheckIns:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lio/sentry/F;",
            ">;"
        }
    .end annotation
.end field

.field private ignoredErrors:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lio/sentry/F;",
            ">;"
        }
    .end annotation
.end field

.field private final ignoredExceptionsForType:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set<",
            "Ljava/lang/Class<",
            "+",
            "Ljava/lang/Throwable;",
            ">;>;"
        }
    .end annotation
.end field

.field private ignoredSpanOrigins:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lio/sentry/F;",
            ">;"
        }
    .end annotation
.end field

.field private ignoredTransactions:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lio/sentry/F;",
            ">;"
        }
    .end annotation
.end field

.field private final inAppExcludes:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private final inAppIncludes:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private initPriority:Lio/sentry/m0;

.field private instrumenter:Lio/sentry/n0;

.field private final integrations:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lio/sentry/o0;",
            ">;"
        }
    .end annotation
.end field

.field private volatile internalTracesSampler:Lio/sentry/O2;

.field protected final lock:Lio/sentry/util/a;

.field private logger:Lio/sentry/ILogger;

.field private logs:Lio/sentry/p2;

.field private maxAttachmentSize:J

.field private maxBreadcrumbs:I

.field private maxCacheItems:I

.field private maxDepth:I

.field private maxQueueSize:I

.field private maxRequestBodySize:Lio/sentry/t2;

.field private maxSpans:I

.field private maxTraceFileSize:J

.field private modulesLoader:Lio/sentry/internal/modules/a;

.field private final observers:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lio/sentry/Y;",
            ">;"
        }
    .end annotation
.end field

.field private onDiscard:Lio/sentry/q2;

.field private openTelemetryMode:Lio/sentry/h2;

.field private final optionsObservers:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lio/sentry/T;",
            ">;"
        }
    .end annotation
.end field

.field private final parsedDsn:Lio/sentry/util/d;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lio/sentry/util/d;"
        }
    .end annotation
.end field

.field private final performanceCollectors:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lio/sentry/U;",
            ">;"
        }
    .end annotation
.end field

.field private printUncaughtStackTrace:Z

.field private profileLifecycle:Lio/sentry/g1;

.field private profileSessionSampleRate:Ljava/lang/Double;

.field private profilesSampleRate:Ljava/lang/Double;

.field private profilesSampler:Lio/sentry/r2;

.field private profilingTracesHz:I

.field private proguardUuid:Ljava/lang/String;

.field private proxy:Lio/sentry/s2;

.field private readTimeoutMillis:I

.field private release:Ljava/lang/String;

.field private replayController:Lio/sentry/k1;

.field private sampleRate:Ljava/lang/Double;

.field private sdkVersion:Lio/sentry/protocol/r;

.field private sendClientReports:Z

.field private sendDefaultPii:Z

.field private sendModules:Z

.field private sentryClientName:Ljava/lang/String;

.field private final serializer:Lio/sentry/util/d;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lio/sentry/util/d;"
        }
    .end annotation
.end field

.field private serverName:Ljava/lang/String;

.field private sessionFlushTimeoutMillis:J

.field private sessionReplay:Lio/sentry/z2;

.field private sessionTrackingIntervalMillis:J

.field private shutdownTimeoutMillis:J

.field private socketTagger:Lio/sentry/f0;

.field private spanFactory:Lio/sentry/h0;

.field private spotlightConnectionUrl:Ljava/lang/String;

.field private sslSocketFactory:Ljavax/net/ssl/SSLSocketFactory;

.field private startProfilerOnAppStart:Z

.field private final tags:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private threadChecker:Lio/sentry/util/thread/a;

.field private traceOptionsRequests:Z

.field private tracePropagationTargets:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private traceSampling:Z

.field private tracesSampleRate:Ljava/lang/Double;

.field private tracesSampler:Lio/sentry/u2;

.field private transactionProfiler:Lio/sentry/j0;

.field private transportFactory:Lio/sentry/k0;

.field private transportGate:Lio/sentry/transport/h;

.field private versionDetector:Lio/sentry/l0;

.field private final viewHierarchyExporters:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 1

    sget-object v0, Lio/sentry/a2;->DEBUG:Lio/sentry/a2;

    sput-object v0, Lio/sentry/v2;->DEFAULT_DIAGNOSTIC_LEVEL:Lio/sentry/a2;

    return-void
.end method

.method public constructor <init>(Z)V
    .locals 12

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-direct {v0}, Ljava/util/concurrent/CopyOnWriteArrayList;-><init>()V

    iput-object v0, p0, Lio/sentry/v2;->eventProcessors:Ljava/util/List;

    new-instance v0, Ljava/util/concurrent/CopyOnWriteArraySet;

    invoke-direct {v0}, Ljava/util/concurrent/CopyOnWriteArraySet;-><init>()V

    iput-object v0, p0, Lio/sentry/v2;->ignoredExceptionsForType:Ljava/util/Set;

    const/4 v0, 0x0

    iput-object v0, p0, Lio/sentry/v2;->ignoredErrors:Ljava/util/List;

    new-instance v1, Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-direct {v1}, Ljava/util/concurrent/CopyOnWriteArrayList;-><init>()V

    iput-object v1, p0, Lio/sentry/v2;->integrations:Ljava/util/List;

    new-instance v1, Ljava/util/concurrent/CopyOnWriteArraySet;

    invoke-direct {v1}, Ljava/util/concurrent/CopyOnWriteArraySet;-><init>()V

    iput-object v1, p0, Lio/sentry/v2;->bundleIds:Ljava/util/Set;

    new-instance v1, Lio/sentry/util/d;

    new-instance v2, Lio/sentry/i2;

    const/4 v3, 0x0

    invoke-direct {v2, p0, v3}, Lio/sentry/i2;-><init>(Lio/sentry/v2;I)V

    invoke-direct {v1, v2}, Lio/sentry/util/d;-><init>(Lio/sentry/util/c;)V

    iput-object v1, p0, Lio/sentry/v2;->parsedDsn:Lio/sentry/util/d;

    const-wide/16 v1, 0x7d0

    iput-wide v1, p0, Lio/sentry/v2;->shutdownTimeoutMillis:J

    const-wide/16 v1, 0x3a98

    iput-wide v1, p0, Lio/sentry/v2;->flushTimeoutMillis:J

    iput-wide v1, p0, Lio/sentry/v2;->sessionFlushTimeoutMillis:J

    sget-object v1, Lio/sentry/N0;->a:Lio/sentry/N0;

    iput-object v1, p0, Lio/sentry/v2;->logger:Lio/sentry/ILogger;

    iput-object v1, p0, Lio/sentry/v2;->fatalLogger:Lio/sentry/ILogger;

    sget-object v2, Lio/sentry/v2;->DEFAULT_DIAGNOSTIC_LEVEL:Lio/sentry/a2;

    iput-object v2, p0, Lio/sentry/v2;->diagnosticLevel:Lio/sentry/a2;

    new-instance v2, Lio/sentry/util/d;

    new-instance v3, Lio/sentry/i2;

    const/4 v4, 0x1

    invoke-direct {v3, p0, v4}, Lio/sentry/i2;-><init>(Lio/sentry/v2;I)V

    invoke-direct {v2, v3}, Lio/sentry/util/d;-><init>(Lio/sentry/util/c;)V

    iput-object v2, p0, Lio/sentry/v2;->serializer:Lio/sentry/util/d;

    new-instance v2, Lio/sentry/util/d;

    new-instance v3, Lio/sentry/i2;

    const/4 v4, 0x2

    invoke-direct {v3, p0, v4}, Lio/sentry/i2;-><init>(Lio/sentry/v2;I)V

    invoke-direct {v2, v3}, Lio/sentry/util/d;-><init>(Lio/sentry/util/c;)V

    iput-object v2, p0, Lio/sentry/v2;->envelopeReader:Lio/sentry/util/d;

    const/16 v2, 0x64

    iput v2, p0, Lio/sentry/v2;->maxDepth:I

    const/16 v3, 0x1e

    iput v3, p0, Lio/sentry/v2;->maxCacheItems:I

    iput v3, p0, Lio/sentry/v2;->maxQueueSize:I

    iput v2, p0, Lio/sentry/v2;->maxBreadcrumbs:I

    new-instance v2, Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-direct {v2}, Ljava/util/concurrent/CopyOnWriteArrayList;-><init>()V

    iput-object v2, p0, Lio/sentry/v2;->inAppExcludes:Ljava/util/List;

    new-instance v2, Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-direct {v2}, Ljava/util/concurrent/CopyOnWriteArrayList;-><init>()V

    iput-object v2, p0, Lio/sentry/v2;->inAppIncludes:Ljava/util/List;

    sget-object v2, Lio/sentry/X0;->a:Lio/sentry/X0;

    iput-object v2, p0, Lio/sentry/v2;->transportFactory:Lio/sentry/k0;

    sget-object v2, Lio/sentry/transport/k;->a:Lio/sentry/transport/k;

    iput-object v2, p0, Lio/sentry/v2;->transportGate:Lio/sentry/transport/h;

    const/4 v2, 0x1

    iput-boolean v2, p0, Lio/sentry/v2;->attachStacktrace:Z

    iput-boolean v2, p0, Lio/sentry/v2;->enableAutoSessionTracking:Z

    const-wide/16 v3, 0x7530

    iput-wide v3, p0, Lio/sentry/v2;->sessionTrackingIntervalMillis:J

    iput-boolean v2, p0, Lio/sentry/v2;->attachServerName:Z

    iput-boolean v2, p0, Lio/sentry/v2;->enableUncaughtExceptionHandler:Z

    const/4 v5, 0x0

    iput-boolean v5, p0, Lio/sentry/v2;->printUncaughtStackTrace:Z

    sget-object v6, Lio/sentry/K0;->d:Lio/sentry/K0;

    iput-object v6, p0, Lio/sentry/v2;->executorService:Lio/sentry/c0;

    const/16 v6, 0x7530

    iput v6, p0, Lio/sentry/v2;->connectionTimeoutMillis:I

    iput v6, p0, Lio/sentry/v2;->readTimeoutMillis:I

    sget-object v6, Lio/sentry/transport/i;->a:Lio/sentry/transport/i;

    iput-object v6, p0, Lio/sentry/v2;->envelopeDiskCache:Lio/sentry/cache/d;

    iput-boolean v5, p0, Lio/sentry/v2;->sendDefaultPii:Z

    new-instance v6, Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-direct {v6}, Ljava/util/concurrent/CopyOnWriteArrayList;-><init>()V

    iput-object v6, p0, Lio/sentry/v2;->observers:Ljava/util/List;

    new-instance v6, Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-direct {v6}, Ljava/util/concurrent/CopyOnWriteArrayList;-><init>()V

    iput-object v6, p0, Lio/sentry/v2;->optionsObservers:Ljava/util/List;

    new-instance v6, Ljava/util/concurrent/ConcurrentHashMap;

    invoke-direct {v6}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    iput-object v6, p0, Lio/sentry/v2;->tags:Ljava/util/Map;

    const-wide/32 v6, 0x1400000

    iput-wide v6, p0, Lio/sentry/v2;->maxAttachmentSize:J

    iput-boolean v2, p0, Lio/sentry/v2;->enableDeduplication:Z

    const/16 v6, 0x3e8

    iput v6, p0, Lio/sentry/v2;->maxSpans:I

    iput-boolean v2, p0, Lio/sentry/v2;->enableShutdownHook:Z

    sget-object v6, Lio/sentry/t2;->NONE:Lio/sentry/t2;

    iput-object v6, p0, Lio/sentry/v2;->maxRequestBodySize:Lio/sentry/t2;

    iput-boolean v2, p0, Lio/sentry/v2;->traceSampling:Z

    const-wide/32 v6, 0x500000

    iput-wide v6, p0, Lio/sentry/v2;->maxTraceFileSize:J

    sget-object v6, Lio/sentry/K0;->e:Lio/sentry/K0;

    iput-object v6, p0, Lio/sentry/v2;->transactionProfiler:Lio/sentry/j0;

    sget-object v6, Lio/sentry/K0;->a:Lio/sentry/K0;

    iput-object v6, p0, Lio/sentry/v2;->continuousProfiler:Lio/sentry/P;

    iput-object v0, p0, Lio/sentry/v2;->tracePropagationTargets:Ljava/util/List;

    const-string v6, ".*"

    invoke-static {v6}, Ljava/util/Collections;->singletonList(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v6

    iput-object v6, p0, Lio/sentry/v2;->defaultTracePropagationTargets:Ljava/util/List;

    const-wide/16 v6, 0xbb8

    invoke-static {v6, v7}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v6

    iput-object v6, p0, Lio/sentry/v2;->idleTimeout:Ljava/lang/Long;

    new-instance v6, Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-direct {v6}, Ljava/util/concurrent/CopyOnWriteArrayList;-><init>()V

    iput-object v6, p0, Lio/sentry/v2;->contextTags:Ljava/util/List;

    iput-boolean v2, p0, Lio/sentry/v2;->sendClientReports:Z

    new-instance v6, Lio/sentry/internal/debugmeta/c;

    invoke-direct {v6, p0}, Lio/sentry/internal/debugmeta/c;-><init>(Lio/sentry/v2;)V

    iput-object v6, p0, Lio/sentry/v2;->clientReportRecorder:Lio/sentry/clientreport/f;

    sget-object v6, Lio/sentry/internal/modules/e;->a:Lio/sentry/internal/modules/e;

    iput-object v6, p0, Lio/sentry/v2;->modulesLoader:Lio/sentry/internal/modules/a;

    sget-object v6, Lio/sentry/internal/debugmeta/b;->a:Lio/sentry/internal/debugmeta/b;

    iput-object v6, p0, Lio/sentry/v2;->debugMetaLoader:Lio/sentry/internal/debugmeta/a;

    iput-boolean v5, p0, Lio/sentry/v2;->enableUserInteractionTracing:Z

    iput-boolean v2, p0, Lio/sentry/v2;->enableUserInteractionBreadcrumbs:Z

    sget-object v6, Lio/sentry/n0;->SENTRY:Lio/sentry/n0;

    iput-object v6, p0, Lio/sentry/v2;->instrumenter:Lio/sentry/n0;

    new-instance v6, Ljava/util/ArrayList;

    invoke-direct {v6}, Ljava/util/ArrayList;-><init>()V

    iput-object v6, p0, Lio/sentry/v2;->gestureTargetLocators:Ljava/util/List;

    new-instance v6, Ljava/util/ArrayList;

    invoke-direct {v6}, Ljava/util/ArrayList;-><init>()V

    iput-object v6, p0, Lio/sentry/v2;->viewHierarchyExporters:Ljava/util/List;

    sget-object v6, Lio/sentry/util/thread/b;->a:Lio/sentry/util/thread/b;

    iput-object v6, p0, Lio/sentry/v2;->threadChecker:Lio/sentry/util/thread/a;

    iput-boolean v2, p0, Lio/sentry/v2;->traceOptionsRequests:Z

    new-instance v6, Lio/sentry/util/d;

    new-instance v7, Lr1;

    const/16 v8, 0x15

    invoke-direct {v7, v8}, Lr1;-><init>(I)V

    invoke-direct {v6, v7}, Lio/sentry/util/d;-><init>(Lio/sentry/util/c;)V

    iput-object v6, p0, Lio/sentry/v2;->dateProvider:Lio/sentry/util/d;

    new-instance v6, Ljava/util/ArrayList;

    invoke-direct {v6}, Ljava/util/ArrayList;-><init>()V

    iput-object v6, p0, Lio/sentry/v2;->performanceCollectors:Ljava/util/List;

    sget-object v6, Lio/sentry/I0;->a:Lio/sentry/I0;

    iput-object v6, p0, Lio/sentry/v2;->compositePerformanceCollector:Lio/sentry/m;

    iput-boolean v5, p0, Lio/sentry/v2;->enableTimeToFullDisplayTracing:Z

    sget-object v6, Lio/sentry/G;->b:Lio/sentry/G;

    iput-object v6, p0, Lio/sentry/v2;->fullyDisplayedReporter:Lio/sentry/G;

    new-instance v6, Lio/sentry/J0;

    invoke-direct {v6}, Ljava/lang/Object;-><init>()V

    iput-object v6, p0, Lio/sentry/v2;->connectionStatusProvider:Lio/sentry/O;

    iput-boolean v2, p0, Lio/sentry/v2;->enabled:Z

    iput-boolean v2, p0, Lio/sentry/v2;->enablePrettySerializationOutput:Z

    iput-boolean v2, p0, Lio/sentry/v2;->sendModules:Z

    iput-boolean v5, p0, Lio/sentry/v2;->enableSpotlight:Z

    iput-boolean v2, p0, Lio/sentry/v2;->enableScopePersistence:Z

    iput-object v0, p0, Lio/sentry/v2;->ignoredCheckIns:Ljava/util/List;

    iput-object v0, p0, Lio/sentry/v2;->ignoredSpanOrigins:Ljava/util/List;

    iput-object v0, p0, Lio/sentry/v2;->ignoredTransactions:Ljava/util/List;

    sget-object v6, Lio/sentry/backpressure/c;->a:Lio/sentry/backpressure/c;

    iput-object v6, p0, Lio/sentry/v2;->backpressureMonitor:Lio/sentry/backpressure/b;

    iput-boolean v2, p0, Lio/sentry/v2;->enableBackpressureHandling:Z

    iput-boolean v5, p0, Lio/sentry/v2;->enableAppStartProfiling:Z

    sget-object v6, Lio/sentry/V0;->b:Lio/sentry/V0;

    iput-object v6, p0, Lio/sentry/v2;->spanFactory:Lio/sentry/h0;

    const/16 v6, 0x65

    iput v6, p0, Lio/sentry/v2;->profilingTracesHz:I

    iput-object v0, p0, Lio/sentry/v2;->cron:Lio/sentry/o2;

    sget-object v6, Lio/sentry/K0;->c:Lio/sentry/K0;

    iput-object v6, p0, Lio/sentry/v2;->replayController:Lio/sentry/k1;

    iput-boolean v2, p0, Lio/sentry/v2;->enableScreenTracking:Z

    sget-object v6, Lio/sentry/u1;->ISOLATION:Lio/sentry/u1;

    iput-object v6, p0, Lio/sentry/v2;->defaultScopeType:Lio/sentry/u1;

    sget-object v6, Lio/sentry/m0;->MEDIUM:Lio/sentry/m0;

    iput-object v6, p0, Lio/sentry/v2;->initPriority:Lio/sentry/m0;

    iput-boolean v5, p0, Lio/sentry/v2;->forceInit:Z

    iput-object v0, p0, Lio/sentry/v2;->globalHubMode:Ljava/lang/Boolean;

    new-instance v6, Lio/sentry/util/a;

    invoke-direct {v6}, Ljava/util/concurrent/locks/ReentrantLock;-><init>()V

    iput-object v6, p0, Lio/sentry/v2;->lock:Lio/sentry/util/a;

    sget-object v6, Lio/sentry/h2;->AUTO:Lio/sentry/h2;

    iput-object v6, p0, Lio/sentry/v2;->openTelemetryMode:Lio/sentry/h2;

    iput-boolean v5, p0, Lio/sentry/v2;->captureOpenTelemetryEvents:Z

    sget-object v6, Lio/sentry/Y0;->a:Lio/sentry/Y0;

    iput-object v6, p0, Lio/sentry/v2;->versionDetector:Lio/sentry/l0;

    sget-object v6, Lio/sentry/g1;->MANUAL:Lio/sentry/g1;

    iput-object v6, p0, Lio/sentry/v2;->profileLifecycle:Lio/sentry/g1;

    iput-boolean v5, p0, Lio/sentry/v2;->startProfilerOnAppStart:Z

    iput-wide v3, p0, Lio/sentry/v2;->deadlineTimeout:J

    new-instance v6, Lio/sentry/p2;

    invoke-direct {v6}, Ljava/lang/Object;-><init>()V

    iput-boolean v5, v6, Lio/sentry/p2;->a:Z

    iput-object v6, p0, Lio/sentry/v2;->logs:Lio/sentry/p2;

    sget-object v6, Lio/sentry/T0;->a:Lio/sentry/T0;

    iput-object v6, p0, Lio/sentry/v2;->socketTagger:Lio/sentry/f0;

    new-instance v6, Lio/sentry/protocol/r;

    const-string v7, "sentry.java"

    const-string v8, "8.21.1"

    invoke-direct {v6, v7, v8}, Lio/sentry/protocol/r;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    iput-object v8, v6, Lio/sentry/protocol/r;->b:Ljava/lang/String;

    new-instance v7, Lio/sentry/D;

    invoke-direct {v7}, Ljava/lang/Object;-><init>()V

    iput-object v7, p0, Lio/sentry/v2;->experimental:Lio/sentry/D;

    new-instance v7, Lio/sentry/z2;

    invoke-direct {v7}, Ljava/lang/Object;-><init>()V

    new-instance v9, Ljava/util/concurrent/CopyOnWriteArraySet;

    invoke-direct {v9}, Ljava/util/concurrent/CopyOnWriteArraySet;-><init>()V

    iput-object v9, v7, Lio/sentry/z2;->c:Ljava/util/concurrent/CopyOnWriteArraySet;

    new-instance v10, Ljava/util/concurrent/CopyOnWriteArraySet;

    invoke-direct {v10}, Ljava/util/concurrent/CopyOnWriteArraySet;-><init>()V

    iput-object v10, v7, Lio/sentry/z2;->d:Ljava/util/concurrent/CopyOnWriteArraySet;

    sget-object v11, Lio/sentry/y2;->MEDIUM:Lio/sentry/y2;

    iput-object v11, v7, Lio/sentry/z2;->e:Lio/sentry/y2;

    iput v2, v7, Lio/sentry/z2;->f:I

    iput-wide v3, v7, Lio/sentry/z2;->g:J

    const-wide/16 v3, 0x1388

    iput-wide v3, v7, Lio/sentry/z2;->h:J

    const-wide/32 v3, 0x36ee80

    iput-wide v3, v7, Lio/sentry/z2;->i:J

    iput-boolean v2, v7, Lio/sentry/z2;->j:Z

    iput-boolean v5, v7, Lio/sentry/z2;->l:Z

    if-nez p1, :cond_0

    const-string v3, "android.widget.TextView"

    invoke-virtual {v9, v3}, Ljava/util/concurrent/CopyOnWriteArraySet;->add(Ljava/lang/Object;)Z

    invoke-virtual {v10, v3}, Ljava/util/concurrent/CopyOnWriteArraySet;->remove(Ljava/lang/Object;)Z

    const-string v3, "android.widget.ImageView"

    invoke-virtual {v9, v3}, Ljava/util/concurrent/CopyOnWriteArraySet;->add(Ljava/lang/Object;)Z

    invoke-virtual {v10, v3}, Ljava/util/concurrent/CopyOnWriteArraySet;->remove(Ljava/lang/Object;)Z

    const-string v3, "android.webkit.WebView"

    invoke-virtual {v9, v3}, Ljava/util/concurrent/CopyOnWriteArraySet;->add(Ljava/lang/Object;)Z

    const-string v3, "android.widget.VideoView"

    invoke-virtual {v9, v3}, Ljava/util/concurrent/CopyOnWriteArraySet;->add(Ljava/lang/Object;)Z

    const-string v3, "androidx.media3.ui.PlayerView"

    invoke-virtual {v9, v3}, Ljava/util/concurrent/CopyOnWriteArraySet;->add(Ljava/lang/Object;)Z

    const-string v3, "com.google.android.exoplayer2.ui.PlayerView"

    invoke-virtual {v9, v3}, Ljava/util/concurrent/CopyOnWriteArraySet;->add(Ljava/lang/Object;)Z

    const-string v3, "com.google.android.exoplayer2.ui.StyledPlayerView"

    invoke-virtual {v9, v3}, Ljava/util/concurrent/CopyOnWriteArraySet;->add(Ljava/lang/Object;)Z

    iput-object v6, v7, Lio/sentry/z2;->k:Lio/sentry/protocol/r;

    :cond_0
    iput-object v7, p0, Lio/sentry/v2;->sessionReplay:Lio/sentry/z2;

    new-instance v3, Lio/sentry/V1;

    invoke-direct {v3}, Ljava/lang/Object;-><init>()V

    iput-boolean v5, v3, Lio/sentry/V1;->a:Z

    iput-boolean v2, v3, Lio/sentry/V1;->b:Z

    iput-boolean v5, v3, Lio/sentry/V1;->c:Z

    iput-boolean v2, v3, Lio/sentry/V1;->d:Z

    iput-boolean v2, v3, Lio/sentry/V1;->e:Z

    iput-boolean v2, v3, Lio/sentry/V1;->f:Z

    iput-object v3, p0, Lio/sentry/v2;->feedbackOptions:Lio/sentry/V1;

    if-nez p1, :cond_3

    sget-boolean p1, Lio/sentry/util/f;->a:Z

    if-nez p1, :cond_1

    const-string p1, "io.sentry.opentelemetry.OtelSpanFactory"

    invoke-static {p1, v1}, Lio/sentry/hints/i;->e(Ljava/lang/String;Lio/sentry/ILogger;)Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-static {p1, v1}, Lio/sentry/hints/i;->h(Ljava/lang/String;Lio/sentry/ILogger;)Ljava/lang/Class;

    move-result-object p1

    if-eqz p1, :cond_1

    :try_start_0
    invoke-virtual {p1, v0}, Ljava/lang/Class;->getDeclaredConstructor([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;

    move-result-object p1

    invoke-virtual {p1, v0}, Ljava/lang/reflect/Constructor;->newInstance([Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    if-eqz p1, :cond_1

    instance-of v0, p1, Lio/sentry/h0;

    if-eqz v0, :cond_1

    check-cast p1, Lio/sentry/h0;
    :try_end_0
    .catch Ljava/lang/InstantiationException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/IllegalAccessException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/reflect/InvocationTargetException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/NoSuchMethodException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    :cond_1
    new-instance p1, Lio/sentry/V0;

    const/4 v0, 0x1

    invoke-direct {p1, v0}, Lio/sentry/V0;-><init>(I)V

    :goto_0
    invoke-virtual {p0, p1}, Lio/sentry/v2;->setSpanFactory(Lio/sentry/h0;)V

    new-instance p1, Lio/sentry/U1;

    invoke-direct {p1, p0}, Lio/sentry/U1;-><init>(Lio/sentry/v2;)V

    iput-object p1, p0, Lio/sentry/v2;->executorService:Lio/sentry/c0;

    invoke-virtual {p1}, Lio/sentry/U1;->m()V

    iget-object p1, p0, Lio/sentry/v2;->integrations:Ljava/util/List;

    new-instance v0, Lio/sentry/UncaughtExceptionHandlerIntegration;

    invoke-direct {v0}, Lio/sentry/UncaughtExceptionHandlerIntegration;-><init>()V

    invoke-interface {p1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iget-object p1, p0, Lio/sentry/v2;->integrations:Ljava/util/List;

    new-instance v0, Lio/sentry/ShutdownHookIntegration;

    invoke-direct {v0}, Lio/sentry/ShutdownHookIntegration;-><init>()V

    invoke-interface {p1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iget-object p1, p0, Lio/sentry/v2;->integrations:Ljava/util/List;

    new-instance v0, Lio/sentry/SpotlightIntegration;

    invoke-direct {v0}, Lio/sentry/SpotlightIntegration;-><init>()V

    invoke-interface {p1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iget-object p1, p0, Lio/sentry/v2;->eventProcessors:Ljava/util/List;

    new-instance v0, Lio/sentry/E0;

    invoke-direct {v0, p0}, Lio/sentry/E0;-><init>(Lio/sentry/v2;)V

    invoke-interface {p1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iget-object p1, p0, Lio/sentry/v2;->eventProcessors:Ljava/util/List;

    new-instance v0, Lio/sentry/o;

    invoke-direct {v0, p0}, Lio/sentry/o;-><init>(Lio/sentry/v2;)V

    invoke-interface {p1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    sget-boolean p1, Lio/sentry/util/f;->a:Z

    if-nez p1, :cond_2

    iget-object p1, p0, Lio/sentry/v2;->eventProcessors:Ljava/util/List;

    new-instance v0, Lio/sentry/A2;

    invoke-direct {v0}, Lio/sentry/A2;-><init>()V

    invoke-interface {p1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_2
    const-string p1, "sentry.java/8.21.1"

    invoke-virtual {p0, p1}, Lio/sentry/v2;->setSentryClientName(Ljava/lang/String;)V

    invoke-virtual {p0, v6}, Lio/sentry/v2;->setSdkVersion(Lio/sentry/protocol/r;)V

    invoke-static {}, Lio/sentry/Y1;->d()Lio/sentry/Y1;

    move-result-object p1

    const-string v0, "maven:io.sentry:sentry"

    invoke-virtual {p1, v0, v8}, Lio/sentry/Y1;->b(Ljava/lang/String;Ljava/lang/String;)V

    :cond_3
    return-void
.end method

.method public static synthetic a(Lio/sentry/v2;)Lio/sentry/z;
    .locals 1

    new-instance v0, Lio/sentry/z;

    iget-object p0, p0, Lio/sentry/v2;->dsn:Ljava/lang/String;

    invoke-direct {v0, p0}, Lio/sentry/z;-><init>(Ljava/lang/String;)V

    return-object v0
.end method

.method public static synthetic b(Lio/sentry/v2;)Lio/sentry/A;
    .locals 1

    new-instance v0, Lio/sentry/A;

    iget-object p0, p0, Lio/sentry/v2;->serializer:Lio/sentry/util/d;

    invoke-virtual {p0}, Lio/sentry/util/d;->a()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lio/sentry/e0;

    invoke-direct {v0, p0}, Lio/sentry/A;-><init>(Lio/sentry/e0;)V

    return-object v0
.end method

.method public static empty()Lio/sentry/v2;
    .locals 2

    new-instance v0, Lio/sentry/v2;

    const/4 v1, 0x1

    invoke-direct {v0, v1}, Lio/sentry/v2;-><init>(Z)V

    return-object v0
.end method


# virtual methods
.method public addBundleId(Ljava/lang/String;)V
    .locals 1

    if-eqz p1, :cond_0

    invoke-virtual {p1}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/String;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lio/sentry/v2;->bundleIds:Ljava/util/Set;

    invoke-interface {v0, p1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    :cond_0
    return-void
.end method

.method public addContextTag(Ljava/lang/String;)V
    .locals 1

    iget-object v0, p0, Lio/sentry/v2;->contextTags:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method public addEventProcessor(Lio/sentry/C;)V
    .locals 1

    iget-object v0, p0, Lio/sentry/v2;->eventProcessors:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method public addIgnoredCheckIn(Ljava/lang/String;)V
    .locals 2

    iget-object v0, p0, Lio/sentry/v2;->ignoredCheckIns:Ljava/util/List;

    if-nez v0, :cond_0

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lio/sentry/v2;->ignoredCheckIns:Ljava/util/List;

    :cond_0
    iget-object v0, p0, Lio/sentry/v2;->ignoredCheckIns:Ljava/util/List;

    new-instance v1, Lio/sentry/F;

    invoke-direct {v1, p1}, Lio/sentry/F;-><init>(Ljava/lang/String;)V

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method public addIgnoredError(Ljava/lang/String;)V
    .locals 2

    iget-object v0, p0, Lio/sentry/v2;->ignoredErrors:Ljava/util/List;

    if-nez v0, :cond_0

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lio/sentry/v2;->ignoredErrors:Ljava/util/List;

    :cond_0
    iget-object v0, p0, Lio/sentry/v2;->ignoredErrors:Ljava/util/List;

    new-instance v1, Lio/sentry/F;

    invoke-direct {v1, p1}, Lio/sentry/F;-><init>(Ljava/lang/String;)V

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method public addIgnoredExceptionForType(Ljava/lang/Class;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Class<",
            "+",
            "Ljava/lang/Throwable;",
            ">;)V"
        }
    .end annotation

    iget-object v0, p0, Lio/sentry/v2;->ignoredExceptionsForType:Ljava/util/Set;

    invoke-interface {v0, p1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method public addIgnoredSpanOrigin(Ljava/lang/String;)V
    .locals 2

    iget-object v0, p0, Lio/sentry/v2;->ignoredSpanOrigins:Ljava/util/List;

    if-nez v0, :cond_0

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lio/sentry/v2;->ignoredSpanOrigins:Ljava/util/List;

    :cond_0
    iget-object v0, p0, Lio/sentry/v2;->ignoredSpanOrigins:Ljava/util/List;

    new-instance v1, Lio/sentry/F;

    invoke-direct {v1, p1}, Lio/sentry/F;-><init>(Ljava/lang/String;)V

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method public addIgnoredTransaction(Ljava/lang/String;)V
    .locals 2

    iget-object v0, p0, Lio/sentry/v2;->ignoredTransactions:Ljava/util/List;

    if-nez v0, :cond_0

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lio/sentry/v2;->ignoredTransactions:Ljava/util/List;

    :cond_0
    iget-object v0, p0, Lio/sentry/v2;->ignoredTransactions:Ljava/util/List;

    new-instance v1, Lio/sentry/F;

    invoke-direct {v1, p1}, Lio/sentry/F;-><init>(Ljava/lang/String;)V

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method public addInAppExclude(Ljava/lang/String;)V
    .locals 1

    iget-object v0, p0, Lio/sentry/v2;->inAppExcludes:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method public addInAppInclude(Ljava/lang/String;)V
    .locals 1

    iget-object v0, p0, Lio/sentry/v2;->inAppIncludes:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method public addIntegration(Lio/sentry/o0;)V
    .locals 1

    iget-object v0, p0, Lio/sentry/v2;->integrations:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method public addOptionsObserver(Lio/sentry/T;)V
    .locals 1

    iget-object v0, p0, Lio/sentry/v2;->optionsObservers:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method public addPerformanceCollector(Lio/sentry/U;)V
    .locals 1

    iget-object v0, p0, Lio/sentry/v2;->performanceCollectors:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method public addScopeObserver(Lio/sentry/Y;)V
    .locals 1

    iget-object v0, p0, Lio/sentry/v2;->observers:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method public containsIgnoredExceptionForType(Ljava/lang/Throwable;)Z
    .locals 1

    iget-object v0, p0, Lio/sentry/v2;->ignoredExceptionsForType:Ljava/util/Set;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object p1

    invoke-interface {v0, p1}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method

.method public findPersistingScopeObserver()Lio/sentry/cache/f;
    .locals 3

    iget-object v0, p0, Lio/sentry/v2;->observers:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lio/sentry/Y;

    instance-of v2, v1, Lio/sentry/cache/f;

    if-eqz v2, :cond_0

    check-cast v1, Lio/sentry/cache/f;

    return-object v1

    :cond_1
    const/4 v0, 0x0

    return-object v0
.end method

.method public getBackpressureMonitor()Lio/sentry/backpressure/b;
    .locals 1

    iget-object v0, p0, Lio/sentry/v2;->backpressureMonitor:Lio/sentry/backpressure/b;

    return-object v0
.end method

.method public getBeforeBreadcrumb()Lio/sentry/j2;
    .locals 1

    const/4 v0, 0x0

    return-object v0
.end method

.method public getBeforeEnvelopeCallback()Lio/sentry/k2;
    .locals 1

    iget-object v0, p0, Lio/sentry/v2;->beforeEnvelopeCallback:Lio/sentry/k2;

    return-object v0
.end method

.method public getBeforeSend()Lio/sentry/l2;
    .locals 1

    const/4 v0, 0x0

    return-object v0
.end method

.method public getBeforeSendFeedback()Lio/sentry/l2;
    .locals 1

    const/4 v0, 0x0

    return-object v0
.end method

.method public getBeforeSendReplay()Lio/sentry/m2;
    .locals 1

    const/4 v0, 0x0

    return-object v0
.end method

.method public getBeforeSendTransaction()Lio/sentry/n2;
    .locals 1

    const/4 v0, 0x0

    return-object v0
.end method

.method public getBundleIds()Ljava/util/Set;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Set<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lio/sentry/v2;->bundleIds:Ljava/util/Set;

    return-object v0
.end method

.method public getCacheDirPath()Ljava/lang/String;
    .locals 3

    iget-object v0, p0, Lio/sentry/v2;->cacheDirPath:Ljava/lang/String;

    if-eqz v0, :cond_2

    invoke-virtual {v0}, Ljava/lang/String;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lio/sentry/v2;->dsnHash:Ljava/lang/String;

    if-eqz v0, :cond_1

    new-instance v0, Ljava/io/File;

    iget-object v1, p0, Lio/sentry/v2;->cacheDirPath:Ljava/lang/String;

    iget-object v2, p0, Lio/sentry/v2;->dsnHash:Ljava/lang/String;

    invoke-direct {v0, v1, v2}, Ljava/io/File;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v0}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v0

    return-object v0

    :cond_1
    iget-object v0, p0, Lio/sentry/v2;->cacheDirPath:Ljava/lang/String;

    return-object v0

    :cond_2
    :goto_0
    const/4 v0, 0x0

    return-object v0
.end method

.method public getCacheDirPathWithoutDsn()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/sentry/v2;->cacheDirPath:Ljava/lang/String;

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Ljava/lang/String;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lio/sentry/v2;->cacheDirPath:Ljava/lang/String;

    return-object v0

    :cond_1
    :goto_0
    const/4 v0, 0x0

    return-object v0
.end method

.method public getClientReportRecorder()Lio/sentry/clientreport/f;
    .locals 1

    iget-object v0, p0, Lio/sentry/v2;->clientReportRecorder:Lio/sentry/clientreport/f;

    return-object v0
.end method

.method public getCompositePerformanceCollector()Lio/sentry/m;
    .locals 1

    iget-object v0, p0, Lio/sentry/v2;->compositePerformanceCollector:Lio/sentry/m;

    return-object v0
.end method

.method public getConnectionStatusProvider()Lio/sentry/O;
    .locals 1

    iget-object v0, p0, Lio/sentry/v2;->connectionStatusProvider:Lio/sentry/O;

    return-object v0
.end method

.method public getConnectionTimeoutMillis()I
    .locals 1

    iget v0, p0, Lio/sentry/v2;->connectionTimeoutMillis:I

    return v0
.end method

.method public getContextTags()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lio/sentry/v2;->contextTags:Ljava/util/List;

    return-object v0
.end method

.method public getContinuousProfiler()Lio/sentry/P;
    .locals 1

    iget-object v0, p0, Lio/sentry/v2;->continuousProfiler:Lio/sentry/P;

    return-object v0
.end method

.method public getCron()Lio/sentry/o2;
    .locals 1

    iget-object v0, p0, Lio/sentry/v2;->cron:Lio/sentry/o2;

    return-object v0
.end method

.method public getDateProvider()Lio/sentry/I1;
    .locals 1

    iget-object v0, p0, Lio/sentry/v2;->dateProvider:Lio/sentry/util/d;

    invoke-virtual {v0}, Lio/sentry/util/d;->a()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lio/sentry/I1;

    return-object v0
.end method

.method public getDeadlineTimeout()J
    .locals 2

    iget-wide v0, p0, Lio/sentry/v2;->deadlineTimeout:J

    return-wide v0
.end method

.method public getDebugMetaLoader()Lio/sentry/internal/debugmeta/a;
    .locals 1

    iget-object v0, p0, Lio/sentry/v2;->debugMetaLoader:Lio/sentry/internal/debugmeta/a;

    return-object v0
.end method

.method public getDefaultScopeType()Lio/sentry/u1;
    .locals 1

    iget-object v0, p0, Lio/sentry/v2;->defaultScopeType:Lio/sentry/u1;

    return-object v0
.end method

.method public getDiagnosticLevel()Lio/sentry/a2;
    .locals 1

    iget-object v0, p0, Lio/sentry/v2;->diagnosticLevel:Lio/sentry/a2;

    return-object v0
.end method

.method public getDist()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/sentry/v2;->dist:Ljava/lang/String;

    return-object v0
.end method

.method public getDistinctId()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/sentry/v2;->distinctId:Ljava/lang/String;

    return-object v0
.end method

.method public getDsn()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/sentry/v2;->dsn:Ljava/lang/String;

    return-object v0
.end method

.method public getEnvelopeDiskCache()Lio/sentry/cache/d;
    .locals 1

    iget-object v0, p0, Lio/sentry/v2;->envelopeDiskCache:Lio/sentry/cache/d;

    return-object v0
.end method

.method public getEnvelopeReader()Lio/sentry/Q;
    .locals 1

    iget-object v0, p0, Lio/sentry/v2;->envelopeReader:Lio/sentry/util/d;

    invoke-virtual {v0}, Lio/sentry/util/d;->a()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lio/sentry/Q;

    return-object v0
.end method

.method public getEnvironment()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/sentry/v2;->environment:Ljava/lang/String;

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    const-string v0, "production"

    return-object v0
.end method

.method public getEventProcessors()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lio/sentry/C;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lio/sentry/v2;->eventProcessors:Ljava/util/List;

    return-object v0
.end method

.method public getExecutorService()Lio/sentry/c0;
    .locals 1

    iget-object v0, p0, Lio/sentry/v2;->executorService:Lio/sentry/c0;

    return-object v0
.end method

.method public getExperimental()Lio/sentry/D;
    .locals 1

    iget-object v0, p0, Lio/sentry/v2;->experimental:Lio/sentry/D;

    return-object v0
.end method

.method public getFatalLogger()Lio/sentry/ILogger;
    .locals 1

    iget-object v0, p0, Lio/sentry/v2;->fatalLogger:Lio/sentry/ILogger;

    return-object v0
.end method

.method public getFeedbackOptions()Lio/sentry/V1;
    .locals 1

    iget-object v0, p0, Lio/sentry/v2;->feedbackOptions:Lio/sentry/V1;

    return-object v0
.end method

.method public getFlushTimeoutMillis()J
    .locals 2

    iget-wide v0, p0, Lio/sentry/v2;->flushTimeoutMillis:J

    return-wide v0
.end method

.method public getFullyDisplayedReporter()Lio/sentry/G;
    .locals 1

    iget-object v0, p0, Lio/sentry/v2;->fullyDisplayedReporter:Lio/sentry/G;

    return-object v0
.end method

.method public getGestureTargetLocators()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lio/sentry/android/core/internal/gestures/a;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lio/sentry/v2;->gestureTargetLocators:Ljava/util/List;

    return-object v0
.end method

.method public getIdleTimeout()Ljava/lang/Long;
    .locals 1

    iget-object v0, p0, Lio/sentry/v2;->idleTimeout:Ljava/lang/Long;

    return-object v0
.end method

.method public getIgnoredCheckIns()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lio/sentry/F;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lio/sentry/v2;->ignoredCheckIns:Ljava/util/List;

    return-object v0
.end method

.method public getIgnoredErrors()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lio/sentry/F;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lio/sentry/v2;->ignoredErrors:Ljava/util/List;

    return-object v0
.end method

.method public getIgnoredExceptionsForType()Ljava/util/Set;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Set<",
            "Ljava/lang/Class<",
            "+",
            "Ljava/lang/Throwable;",
            ">;>;"
        }
    .end annotation

    iget-object v0, p0, Lio/sentry/v2;->ignoredExceptionsForType:Ljava/util/Set;

    return-object v0
.end method

.method public getIgnoredSpanOrigins()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lio/sentry/F;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lio/sentry/v2;->ignoredSpanOrigins:Ljava/util/List;

    return-object v0
.end method

.method public getIgnoredTransactions()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lio/sentry/F;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lio/sentry/v2;->ignoredTransactions:Ljava/util/List;

    return-object v0
.end method

.method public getInAppExcludes()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lio/sentry/v2;->inAppExcludes:Ljava/util/List;

    return-object v0
.end method

.method public getInAppIncludes()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lio/sentry/v2;->inAppIncludes:Ljava/util/List;

    return-object v0
.end method

.method public getInitPriority()Lio/sentry/m0;
    .locals 1

    iget-object v0, p0, Lio/sentry/v2;->initPriority:Lio/sentry/m0;

    return-object v0
.end method

.method public getInstrumenter()Lio/sentry/n0;
    .locals 1

    iget-object v0, p0, Lio/sentry/v2;->instrumenter:Lio/sentry/n0;

    return-object v0
.end method

.method public getIntegrations()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lio/sentry/o0;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lio/sentry/v2;->integrations:Ljava/util/List;

    return-object v0
.end method

.method public getInternalTracesSampler()Lio/sentry/O2;
    .locals 2

    iget-object v0, p0, Lio/sentry/v2;->internalTracesSampler:Lio/sentry/O2;

    if-nez v0, :cond_1

    iget-object v0, p0, Lio/sentry/v2;->lock:Lio/sentry/util/a;

    invoke-virtual {v0}, Lio/sentry/util/a;->a()Lio/sentry/r;

    move-result-object v0

    :try_start_0
    iget-object v1, p0, Lio/sentry/v2;->internalTracesSampler:Lio/sentry/O2;

    if-nez v1, :cond_0

    new-instance v1, Lio/sentry/O2;

    invoke-direct {v1, p0}, Lio/sentry/O2;-><init>(Lio/sentry/v2;)V

    iput-object v1, p0, Lio/sentry/v2;->internalTracesSampler:Lio/sentry/O2;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception v1

    goto :goto_1

    :cond_0
    :goto_0
    invoke-virtual {v0}, Lio/sentry/r;->close()V

    goto :goto_3

    :goto_1
    :try_start_1
    invoke-virtual {v0}, Lio/sentry/r;->close()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    goto :goto_2

    :catchall_1
    move-exception v0

    invoke-virtual {v1, v0}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_2
    throw v1

    :cond_1
    :goto_3
    iget-object v0, p0, Lio/sentry/v2;->internalTracesSampler:Lio/sentry/O2;

    return-object v0
.end method

.method public getLogger()Lio/sentry/ILogger;
    .locals 1

    iget-object v0, p0, Lio/sentry/v2;->logger:Lio/sentry/ILogger;

    return-object v0
.end method

.method public getLogs()Lio/sentry/p2;
    .locals 1

    iget-object v0, p0, Lio/sentry/v2;->logs:Lio/sentry/p2;

    return-object v0
.end method

.method public getMaxAttachmentSize()J
    .locals 2

    iget-wide v0, p0, Lio/sentry/v2;->maxAttachmentSize:J

    return-wide v0
.end method

.method public getMaxBreadcrumbs()I
    .locals 1

    iget v0, p0, Lio/sentry/v2;->maxBreadcrumbs:I

    return v0
.end method

.method public getMaxCacheItems()I
    .locals 1

    iget v0, p0, Lio/sentry/v2;->maxCacheItems:I

    return v0
.end method

.method public getMaxDepth()I
    .locals 1

    iget v0, p0, Lio/sentry/v2;->maxDepth:I

    return v0
.end method

.method public getMaxQueueSize()I
    .locals 1

    iget v0, p0, Lio/sentry/v2;->maxQueueSize:I

    return v0
.end method

.method public getMaxRequestBodySize()Lio/sentry/t2;
    .locals 1

    iget-object v0, p0, Lio/sentry/v2;->maxRequestBodySize:Lio/sentry/t2;

    return-object v0
.end method

.method public getMaxSpans()I
    .locals 1

    iget v0, p0, Lio/sentry/v2;->maxSpans:I

    return v0
.end method

.method public getMaxTraceFileSize()J
    .locals 2

    iget-wide v0, p0, Lio/sentry/v2;->maxTraceFileSize:J

    return-wide v0
.end method

.method public getModulesLoader()Lio/sentry/internal/modules/a;
    .locals 1

    iget-object v0, p0, Lio/sentry/v2;->modulesLoader:Lio/sentry/internal/modules/a;

    return-object v0
.end method

.method public getOnDiscard()Lio/sentry/q2;
    .locals 1

    const/4 v0, 0x0

    return-object v0
.end method

.method public getOpenTelemetryMode()Lio/sentry/h2;
    .locals 1

    iget-object v0, p0, Lio/sentry/v2;->openTelemetryMode:Lio/sentry/h2;

    return-object v0
.end method

.method public getOptionsObservers()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lio/sentry/T;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lio/sentry/v2;->optionsObservers:Ljava/util/List;

    return-object v0
.end method

.method public getOutboxPath()Ljava/lang/String;
    .locals 3

    invoke-virtual {p0}, Lio/sentry/v2;->getCacheDirPath()Ljava/lang/String;

    move-result-object v0

    if-nez v0, :cond_0

    const/4 v0, 0x0

    return-object v0

    :cond_0
    new-instance v1, Ljava/io/File;

    const-string v2, "outbox"

    invoke-direct {v1, v0, v2}, Ljava/io/File;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v1}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public getPerformanceCollectors()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lio/sentry/U;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lio/sentry/v2;->performanceCollectors:Ljava/util/List;

    return-object v0
.end method

.method public getProfileLifecycle()Lio/sentry/g1;
    .locals 1

    iget-object v0, p0, Lio/sentry/v2;->profileLifecycle:Lio/sentry/g1;

    return-object v0
.end method

.method public getProfileSessionSampleRate()Ljava/lang/Double;
    .locals 1

    iget-object v0, p0, Lio/sentry/v2;->profileSessionSampleRate:Ljava/lang/Double;

    return-object v0
.end method

.method public getProfilesSampleRate()Ljava/lang/Double;
    .locals 1

    iget-object v0, p0, Lio/sentry/v2;->profilesSampleRate:Ljava/lang/Double;

    return-object v0
.end method

.method public getProfilesSampler()Lio/sentry/r2;
    .locals 1

    const/4 v0, 0x0

    return-object v0
.end method

.method public getProfilingTracesDirPath()Ljava/lang/String;
    .locals 3

    invoke-virtual {p0}, Lio/sentry/v2;->getCacheDirPath()Ljava/lang/String;

    move-result-object v0

    if-nez v0, :cond_0

    const/4 v0, 0x0

    return-object v0

    :cond_0
    new-instance v1, Ljava/io/File;

    const-string v2, "profiling_traces"

    invoke-direct {v1, v0, v2}, Ljava/io/File;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v1}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public getProfilingTracesHz()I
    .locals 1

    iget v0, p0, Lio/sentry/v2;->profilingTracesHz:I

    return v0
.end method

.method public getProguardUuid()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/sentry/v2;->proguardUuid:Ljava/lang/String;

    return-object v0
.end method

.method public getProxy()Lio/sentry/s2;
    .locals 1

    iget-object v0, p0, Lio/sentry/v2;->proxy:Lio/sentry/s2;

    return-object v0
.end method

.method public getReadTimeoutMillis()I
    .locals 1

    iget v0, p0, Lio/sentry/v2;->readTimeoutMillis:I

    return v0
.end method

.method public getRelease()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/sentry/v2;->release:Ljava/lang/String;

    return-object v0
.end method

.method public getReplayController()Lio/sentry/k1;
    .locals 1

    iget-object v0, p0, Lio/sentry/v2;->replayController:Lio/sentry/k1;

    return-object v0
.end method

.method public getSampleRate()Ljava/lang/Double;
    .locals 1

    iget-object v0, p0, Lio/sentry/v2;->sampleRate:Ljava/lang/Double;

    return-object v0
.end method

.method public getScopeObservers()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lio/sentry/Y;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lio/sentry/v2;->observers:Ljava/util/List;

    return-object v0
.end method

.method public getSdkVersion()Lio/sentry/protocol/r;
    .locals 1

    iget-object v0, p0, Lio/sentry/v2;->sdkVersion:Lio/sentry/protocol/r;

    return-object v0
.end method

.method public getSentryClientName()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/sentry/v2;->sentryClientName:Ljava/lang/String;

    return-object v0
.end method

.method public getSerializer()Lio/sentry/e0;
    .locals 1

    iget-object v0, p0, Lio/sentry/v2;->serializer:Lio/sentry/util/d;

    invoke-virtual {v0}, Lio/sentry/util/d;->a()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lio/sentry/e0;

    return-object v0
.end method

.method public getServerName()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/sentry/v2;->serverName:Ljava/lang/String;

    return-object v0
.end method

.method public getSessionFlushTimeoutMillis()J
    .locals 2

    iget-wide v0, p0, Lio/sentry/v2;->sessionFlushTimeoutMillis:J

    return-wide v0
.end method

.method public getSessionReplay()Lio/sentry/z2;
    .locals 1

    iget-object v0, p0, Lio/sentry/v2;->sessionReplay:Lio/sentry/z2;

    return-object v0
.end method

.method public getSessionTrackingIntervalMillis()J
    .locals 2

    iget-wide v0, p0, Lio/sentry/v2;->sessionTrackingIntervalMillis:J

    return-wide v0
.end method

.method public getShutdownTimeoutMillis()J
    .locals 2

    iget-wide v0, p0, Lio/sentry/v2;->shutdownTimeoutMillis:J

    return-wide v0
.end method

.method public getSocketTagger()Lio/sentry/f0;
    .locals 1

    iget-object v0, p0, Lio/sentry/v2;->socketTagger:Lio/sentry/f0;

    return-object v0
.end method

.method public getSpanFactory()Lio/sentry/h0;
    .locals 1

    iget-object v0, p0, Lio/sentry/v2;->spanFactory:Lio/sentry/h0;

    return-object v0
.end method

.method public getSpotlightConnectionUrl()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/sentry/v2;->spotlightConnectionUrl:Ljava/lang/String;

    return-object v0
.end method

.method public getSslSocketFactory()Ljavax/net/ssl/SSLSocketFactory;
    .locals 1

    iget-object v0, p0, Lio/sentry/v2;->sslSocketFactory:Ljavax/net/ssl/SSLSocketFactory;

    return-object v0
.end method

.method public getTags()Ljava/util/Map;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lio/sentry/v2;->tags:Ljava/util/Map;

    return-object v0
.end method

.method public getThreadChecker()Lio/sentry/util/thread/a;
    .locals 1

    iget-object v0, p0, Lio/sentry/v2;->threadChecker:Lio/sentry/util/thread/a;

    return-object v0
.end method

.method public getTracePropagationTargets()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lio/sentry/v2;->tracePropagationTargets:Ljava/util/List;

    if-nez v0, :cond_0

    iget-object v0, p0, Lio/sentry/v2;->defaultTracePropagationTargets:Ljava/util/List;

    :cond_0
    return-object v0
.end method

.method public getTracesSampleRate()Ljava/lang/Double;
    .locals 1

    iget-object v0, p0, Lio/sentry/v2;->tracesSampleRate:Ljava/lang/Double;

    return-object v0
.end method

.method public getTracesSampler()Lio/sentry/u2;
    .locals 1

    const/4 v0, 0x0

    return-object v0
.end method

.method public getTransactionProfiler()Lio/sentry/j0;
    .locals 1

    iget-object v0, p0, Lio/sentry/v2;->transactionProfiler:Lio/sentry/j0;

    return-object v0
.end method

.method public getTransportFactory()Lio/sentry/k0;
    .locals 1

    iget-object v0, p0, Lio/sentry/v2;->transportFactory:Lio/sentry/k0;

    return-object v0
.end method

.method public getTransportGate()Lio/sentry/transport/h;
    .locals 1

    iget-object v0, p0, Lio/sentry/v2;->transportGate:Lio/sentry/transport/h;

    return-object v0
.end method

.method public getVersionDetector()Lio/sentry/l0;
    .locals 1

    iget-object v0, p0, Lio/sentry/v2;->versionDetector:Lio/sentry/l0;

    return-object v0
.end method

.method public final getViewHierarchyExporters()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lio/sentry/v2;->viewHierarchyExporters:Ljava/util/List;

    return-object v0
.end method

.method public isAttachServerName()Z
    .locals 1

    iget-boolean v0, p0, Lio/sentry/v2;->attachServerName:Z

    return v0
.end method

.method public isAttachStacktrace()Z
    .locals 1

    iget-boolean v0, p0, Lio/sentry/v2;->attachStacktrace:Z

    return v0
.end method

.method public isAttachThreads()Z
    .locals 1

    iget-boolean v0, p0, Lio/sentry/v2;->attachThreads:Z

    return v0
.end method

.method public isCaptureOpenTelemetryEvents()Z
    .locals 1

    iget-boolean v0, p0, Lio/sentry/v2;->captureOpenTelemetryEvents:Z

    return v0
.end method

.method public isContinuousProfilingEnabled()Z
    .locals 4

    iget-object v0, p0, Lio/sentry/v2;->profilesSampleRate:Ljava/lang/Double;

    if-nez v0, :cond_0

    iget-object v0, p0, Lio/sentry/v2;->profileSessionSampleRate:Ljava/lang/Double;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Ljava/lang/Double;->doubleValue()D

    move-result-wide v0

    const-wide/16 v2, 0x0

    cmpl-double v0, v0, v2

    if-lez v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public isDebug()Z
    .locals 1

    iget-boolean v0, p0, Lio/sentry/v2;->debug:Z

    return v0
.end method

.method public isEnableAppStartProfiling()Z
    .locals 1

    invoke-virtual {p0}, Lio/sentry/v2;->isProfilingEnabled()Z

    move-result v0

    if-nez v0, :cond_0

    invoke-virtual {p0}, Lio/sentry/v2;->isContinuousProfilingEnabled()Z

    move-result v0

    if-eqz v0, :cond_1

    :cond_0
    iget-boolean v0, p0, Lio/sentry/v2;->enableAppStartProfiling:Z

    if-eqz v0, :cond_1

    const/4 v0, 0x1

    return v0

    :cond_1
    const/4 v0, 0x0

    return v0
.end method

.method public isEnableAutoSessionTracking()Z
    .locals 1

    iget-boolean v0, p0, Lio/sentry/v2;->enableAutoSessionTracking:Z

    return v0
.end method

.method public isEnableBackpressureHandling()Z
    .locals 1

    iget-boolean v0, p0, Lio/sentry/v2;->enableBackpressureHandling:Z

    return v0
.end method

.method public isEnableDeduplication()Z
    .locals 1

    iget-boolean v0, p0, Lio/sentry/v2;->enableDeduplication:Z

    return v0
.end method

.method public isEnableExternalConfiguration()Z
    .locals 1

    iget-boolean v0, p0, Lio/sentry/v2;->enableExternalConfiguration:Z

    return v0
.end method

.method public isEnablePrettySerializationOutput()Z
    .locals 1

    iget-boolean v0, p0, Lio/sentry/v2;->enablePrettySerializationOutput:Z

    return v0
.end method

.method public isEnableScopePersistence()Z
    .locals 1

    iget-boolean v0, p0, Lio/sentry/v2;->enableScopePersistence:Z

    return v0
.end method

.method public isEnableScreenTracking()Z
    .locals 1

    iget-boolean v0, p0, Lio/sentry/v2;->enableScreenTracking:Z

    return v0
.end method

.method public isEnableShutdownHook()Z
    .locals 1

    iget-boolean v0, p0, Lio/sentry/v2;->enableShutdownHook:Z

    return v0
.end method

.method public isEnableSpotlight()Z
    .locals 1

    iget-boolean v0, p0, Lio/sentry/v2;->enableSpotlight:Z

    return v0
.end method

.method public isEnableTimeToFullDisplayTracing()Z
    .locals 1

    iget-boolean v0, p0, Lio/sentry/v2;->enableTimeToFullDisplayTracing:Z

    return v0
.end method

.method public isEnableUncaughtExceptionHandler()Z
    .locals 1

    iget-boolean v0, p0, Lio/sentry/v2;->enableUncaughtExceptionHandler:Z

    return v0
.end method

.method public isEnableUserInteractionBreadcrumbs()Z
    .locals 1

    iget-boolean v0, p0, Lio/sentry/v2;->enableUserInteractionBreadcrumbs:Z

    return v0
.end method

.method public isEnableUserInteractionTracing()Z
    .locals 1

    iget-boolean v0, p0, Lio/sentry/v2;->enableUserInteractionTracing:Z

    return v0
.end method

.method public isEnabled()Z
    .locals 1

    iget-boolean v0, p0, Lio/sentry/v2;->enabled:Z

    return v0
.end method

.method public isForceInit()Z
    .locals 1

    iget-boolean v0, p0, Lio/sentry/v2;->forceInit:Z

    return v0
.end method

.method public isGlobalHubMode()Ljava/lang/Boolean;
    .locals 1

    iget-object v0, p0, Lio/sentry/v2;->globalHubMode:Ljava/lang/Boolean;

    return-object v0
.end method

.method public isPrintUncaughtStackTrace()Z
    .locals 1

    iget-boolean v0, p0, Lio/sentry/v2;->printUncaughtStackTrace:Z

    return v0
.end method

.method public isProfilingEnabled()Z
    .locals 4

    iget-object v0, p0, Lio/sentry/v2;->profilesSampleRate:Ljava/lang/Double;

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Ljava/lang/Double;->doubleValue()D

    move-result-wide v0

    const-wide/16 v2, 0x0

    cmpl-double v0, v0, v2

    if-gtz v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x1

    return v0

    :cond_1
    :goto_0
    const/4 v0, 0x0

    return v0
.end method

.method public isSendClientReports()Z
    .locals 1

    iget-boolean v0, p0, Lio/sentry/v2;->sendClientReports:Z

    return v0
.end method

.method public isSendDefaultPii()Z
    .locals 1

    iget-boolean v0, p0, Lio/sentry/v2;->sendDefaultPii:Z

    return v0
.end method

.method public isSendModules()Z
    .locals 1

    iget-boolean v0, p0, Lio/sentry/v2;->sendModules:Z

    return v0
.end method

.method public isStartProfilerOnAppStart()Z
    .locals 1

    iget-boolean v0, p0, Lio/sentry/v2;->startProfilerOnAppStart:Z

    return v0
.end method

.method public isTraceOptionsRequests()Z
    .locals 1

    iget-boolean v0, p0, Lio/sentry/v2;->traceOptionsRequests:Z

    return v0
.end method

.method public isTraceSampling()Z
    .locals 1

    iget-boolean v0, p0, Lio/sentry/v2;->traceSampling:Z

    return v0
.end method

.method public isTracingEnabled()Z
    .locals 1

    invoke-virtual {p0}, Lio/sentry/v2;->getTracesSampleRate()Ljava/lang/Double;

    move-result-object v0

    if-nez v0, :cond_0

    invoke-virtual {p0}, Lio/sentry/v2;->getTracesSampler()Lio/sentry/u2;

    const/4 v0, 0x0

    return v0

    :cond_0
    const/4 v0, 0x1

    return v0
.end method

.method public loadLazyFields()V
    .locals 0

    invoke-virtual {p0}, Lio/sentry/v2;->getSerializer()Lio/sentry/e0;

    invoke-virtual {p0}, Lio/sentry/v2;->retrieveParsedDsn()Lio/sentry/z;

    invoke-virtual {p0}, Lio/sentry/v2;->getEnvelopeReader()Lio/sentry/Q;

    invoke-virtual {p0}, Lio/sentry/v2;->getDateProvider()Lio/sentry/I1;

    return-void
.end method

.method public merge(Lio/sentry/E;)V
    .locals 4

    iget-object v0, p1, Lio/sentry/E;->a:Ljava/lang/String;

    if-eqz v0, :cond_0

    invoke-virtual {p0, v0}, Lio/sentry/v2;->setDsn(Ljava/lang/String;)V

    :cond_0
    iget-object v0, p1, Lio/sentry/E;->b:Ljava/lang/String;

    if-eqz v0, :cond_1

    invoke-virtual {p0, v0}, Lio/sentry/v2;->setEnvironment(Ljava/lang/String;)V

    :cond_1
    iget-object v0, p1, Lio/sentry/E;->c:Ljava/lang/String;

    if-eqz v0, :cond_2

    invoke-virtual {p0, v0}, Lio/sentry/v2;->setRelease(Ljava/lang/String;)V

    :cond_2
    iget-object v0, p1, Lio/sentry/E;->d:Ljava/lang/String;

    if-eqz v0, :cond_3

    invoke-virtual {p0, v0}, Lio/sentry/v2;->setDist(Ljava/lang/String;)V

    :cond_3
    iget-object v0, p1, Lio/sentry/E;->e:Ljava/lang/String;

    if-eqz v0, :cond_4

    invoke-virtual {p0, v0}, Lio/sentry/v2;->setServerName(Ljava/lang/String;)V

    :cond_4
    iget-object v0, p1, Lio/sentry/E;->m:Lio/sentry/s2;

    if-eqz v0, :cond_5

    invoke-virtual {p0, v0}, Lio/sentry/v2;->setProxy(Lio/sentry/s2;)V

    :cond_5
    iget-object v0, p1, Lio/sentry/E;->f:Ljava/lang/Boolean;

    if-eqz v0, :cond_6

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    invoke-virtual {p0, v0}, Lio/sentry/v2;->setEnableUncaughtExceptionHandler(Z)V

    :cond_6
    iget-object v0, p1, Lio/sentry/E;->v:Ljava/lang/Boolean;

    if-eqz v0, :cond_7

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    invoke-virtual {p0, v0}, Lio/sentry/v2;->setPrintUncaughtStackTrace(Z)V

    :cond_7
    iget-object v0, p1, Lio/sentry/E;->i:Ljava/lang/Double;

    if-eqz v0, :cond_8

    invoke-virtual {p0, v0}, Lio/sentry/v2;->setTracesSampleRate(Ljava/lang/Double;)V

    :cond_8
    iget-object v0, p1, Lio/sentry/E;->j:Ljava/lang/Double;

    if-eqz v0, :cond_9

    invoke-virtual {p0, v0}, Lio/sentry/v2;->setProfilesSampleRate(Ljava/lang/Double;)V

    :cond_9
    iget-object v0, p1, Lio/sentry/E;->g:Ljava/lang/Boolean;

    if-eqz v0, :cond_a

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    invoke-virtual {p0, v0}, Lio/sentry/v2;->setDebug(Z)V

    :cond_a
    iget-object v0, p1, Lio/sentry/E;->h:Ljava/lang/Boolean;

    if-eqz v0, :cond_b

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    invoke-virtual {p0, v0}, Lio/sentry/v2;->setEnableDeduplication(Z)V

    :cond_b
    iget-object v0, p1, Lio/sentry/E;->w:Ljava/lang/Boolean;

    if-eqz v0, :cond_c

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    invoke-virtual {p0, v0}, Lio/sentry/v2;->setSendClientReports(Z)V

    :cond_c
    iget-object v0, p1, Lio/sentry/E;->J:Ljava/lang/Boolean;

    if-eqz v0, :cond_d

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    invoke-virtual {p0, v0}, Lio/sentry/v2;->setForceInit(Z)V

    :cond_d
    new-instance v0, Ljava/util/HashMap;

    iget-object v1, p1, Lio/sentry/E;->l:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-direct {v0, v1}, Ljava/util/HashMap;-><init>(Ljava/util/Map;)V

    invoke-virtual {v0}, Ljava/util/HashMap;->entrySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_e

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/Map$Entry;

    iget-object v2, p0, Lio/sentry/v2;->tags:Ljava/util/Map;

    invoke-interface {v1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    invoke-interface {v1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    invoke-interface {v2, v3, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    :cond_e
    new-instance v0, Ljava/util/ArrayList;

    iget-object v1, p1, Lio/sentry/E;->o:Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_f

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    invoke-virtual {p0, v1}, Lio/sentry/v2;->addInAppInclude(Ljava/lang/String;)V

    goto :goto_1

    :cond_f
    new-instance v0, Ljava/util/ArrayList;

    iget-object v1, p1, Lio/sentry/E;->n:Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_2
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_10

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    invoke-virtual {p0, v1}, Lio/sentry/v2;->addInAppExclude(Ljava/lang/String;)V

    goto :goto_2

    :cond_10
    new-instance v0, Ljava/util/HashSet;

    iget-object v1, p1, Lio/sentry/E;->t:Ljava/util/concurrent/CopyOnWriteArraySet;

    invoke-direct {v0, v1}, Ljava/util/HashSet;-><init>(Ljava/util/Collection;)V

    invoke-virtual {v0}, Ljava/util/HashSet;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_3
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_11

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Class;

    invoke-virtual {p0, v1}, Lio/sentry/v2;->addIgnoredExceptionForType(Ljava/lang/Class;)V

    goto :goto_3

    :cond_11
    iget-object v0, p1, Lio/sentry/E;->p:Ljava/util/concurrent/CopyOnWriteArrayList;

    if-eqz v0, :cond_12

    new-instance v0, Ljava/util/ArrayList;

    iget-object v1, p1, Lio/sentry/E;->p:Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    invoke-virtual {p0, v0}, Lio/sentry/v2;->setTracePropagationTargets(Ljava/util/List;)V

    :cond_12
    new-instance v0, Ljava/util/ArrayList;

    iget-object v1, p1, Lio/sentry/E;->q:Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_4
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_13

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    invoke-virtual {p0, v1}, Lio/sentry/v2;->addContextTag(Ljava/lang/String;)V

    goto :goto_4

    :cond_13
    iget-object v0, p1, Lio/sentry/E;->r:Ljava/lang/String;

    if-eqz v0, :cond_14

    invoke-virtual {p0, v0}, Lio/sentry/v2;->setProguardUuid(Ljava/lang/String;)V

    :cond_14
    iget-object v0, p1, Lio/sentry/E;->s:Ljava/lang/Long;

    if-eqz v0, :cond_15

    invoke-virtual {p0, v0}, Lio/sentry/v2;->setIdleTimeout(Ljava/lang/Long;)V

    :cond_15
    iget-object v0, p1, Lio/sentry/E;->x:Ljava/util/concurrent/CopyOnWriteArraySet;

    invoke-virtual {v0}, Ljava/util/concurrent/CopyOnWriteArraySet;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_5
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_16

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    invoke-virtual {p0, v1}, Lio/sentry/v2;->addBundleId(Ljava/lang/String;)V

    goto :goto_5

    :cond_16
    iget-object v0, p1, Lio/sentry/E;->y:Ljava/lang/Boolean;

    if-eqz v0, :cond_17

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    invoke-virtual {p0, v0}, Lio/sentry/v2;->setEnabled(Z)V

    :cond_17
    iget-object v0, p1, Lio/sentry/E;->z:Ljava/lang/Boolean;

    if-eqz v0, :cond_18

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    invoke-virtual {p0, v0}, Lio/sentry/v2;->setEnablePrettySerializationOutput(Z)V

    :cond_18
    iget-object v0, p1, Lio/sentry/E;->F:Ljava/lang/Boolean;

    if-eqz v0, :cond_19

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    invoke-virtual {p0, v0}, Lio/sentry/v2;->setSendModules(Z)V

    :cond_19
    iget-object v0, p1, Lio/sentry/E;->D:Ljava/util/List;

    if-eqz v0, :cond_1a

    new-instance v0, Ljava/util/ArrayList;

    iget-object v1, p1, Lio/sentry/E;->D:Ljava/util/List;

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    invoke-virtual {p0, v0}, Lio/sentry/v2;->setIgnoredCheckIns(Ljava/util/List;)V

    :cond_1a
    iget-object v0, p1, Lio/sentry/E;->E:Ljava/util/List;

    if-eqz v0, :cond_1b

    new-instance v0, Ljava/util/ArrayList;

    iget-object v1, p1, Lio/sentry/E;->E:Ljava/util/List;

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    invoke-virtual {p0, v0}, Lio/sentry/v2;->setIgnoredTransactions(Ljava/util/List;)V

    :cond_1b
    iget-object v0, p1, Lio/sentry/E;->u:Ljava/util/List;

    if-eqz v0, :cond_1c

    new-instance v0, Ljava/util/ArrayList;

    iget-object v1, p1, Lio/sentry/E;->u:Ljava/util/List;

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    invoke-virtual {p0, v0}, Lio/sentry/v2;->setIgnoredErrors(Ljava/util/List;)V

    :cond_1c
    iget-object v0, p1, Lio/sentry/E;->H:Ljava/lang/Boolean;

    if-eqz v0, :cond_1d

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    invoke-virtual {p0, v0}, Lio/sentry/v2;->setEnableBackpressureHandling(Z)V

    :cond_1d
    iget-object v0, p1, Lio/sentry/E;->k:Lio/sentry/t2;

    if-eqz v0, :cond_1e

    invoke-virtual {p0, v0}, Lio/sentry/v2;->setMaxRequestBodySize(Lio/sentry/t2;)V

    :cond_1e
    iget-object v0, p1, Lio/sentry/E;->G:Ljava/lang/Boolean;

    if-eqz v0, :cond_1f

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    invoke-virtual {p0, v0}, Lio/sentry/v2;->setSendDefaultPii(Z)V

    :cond_1f
    iget-object v0, p1, Lio/sentry/E;->K:Ljava/lang/Boolean;

    if-eqz v0, :cond_20

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    invoke-virtual {p0, v0}, Lio/sentry/v2;->setCaptureOpenTelemetryEvents(Z)V

    :cond_20
    iget-object v0, p1, Lio/sentry/E;->A:Ljava/lang/Boolean;

    if-eqz v0, :cond_21

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    invoke-virtual {p0, v0}, Lio/sentry/v2;->setEnableSpotlight(Z)V

    :cond_21
    iget-object v0, p1, Lio/sentry/E;->C:Ljava/lang/String;

    if-eqz v0, :cond_22

    invoke-virtual {p0, v0}, Lio/sentry/v2;->setSpotlightConnectionUrl(Ljava/lang/String;)V

    :cond_22
    iget-object v0, p1, Lio/sentry/E;->I:Ljava/lang/Boolean;

    if-eqz v0, :cond_23

    invoke-virtual {p0, v0}, Lio/sentry/v2;->setGlobalHubMode(Ljava/lang/Boolean;)V

    :cond_23
    iget-object v0, p1, Lio/sentry/E;->L:Lio/sentry/o2;

    if-eqz v0, :cond_29

    invoke-virtual {p0}, Lio/sentry/v2;->getCron()Lio/sentry/o2;

    move-result-object v0

    if-nez v0, :cond_24

    iget-object v0, p1, Lio/sentry/E;->L:Lio/sentry/o2;

    invoke-virtual {p0, v0}, Lio/sentry/v2;->setCron(Lio/sentry/o2;)V

    goto :goto_6

    :cond_24
    iget-object v0, p1, Lio/sentry/E;->L:Lio/sentry/o2;

    iget-object v0, v0, Lio/sentry/o2;->a:Ljava/lang/Long;

    if-eqz v0, :cond_25

    invoke-virtual {p0}, Lio/sentry/v2;->getCron()Lio/sentry/o2;

    move-result-object v0

    iget-object v1, p1, Lio/sentry/E;->L:Lio/sentry/o2;

    iget-object v1, v1, Lio/sentry/o2;->a:Ljava/lang/Long;

    iput-object v1, v0, Lio/sentry/o2;->a:Ljava/lang/Long;

    :cond_25
    iget-object v0, p1, Lio/sentry/E;->L:Lio/sentry/o2;

    iget-object v0, v0, Lio/sentry/o2;->b:Ljava/lang/Long;

    if-eqz v0, :cond_26

    invoke-virtual {p0}, Lio/sentry/v2;->getCron()Lio/sentry/o2;

    move-result-object v0

    iget-object v1, p1, Lio/sentry/E;->L:Lio/sentry/o2;

    iget-object v1, v1, Lio/sentry/o2;->b:Ljava/lang/Long;

    iput-object v1, v0, Lio/sentry/o2;->b:Ljava/lang/Long;

    :cond_26
    iget-object v0, p1, Lio/sentry/E;->L:Lio/sentry/o2;

    iget-object v0, v0, Lio/sentry/o2;->c:Ljava/lang/String;

    if-eqz v0, :cond_27

    invoke-virtual {p0}, Lio/sentry/v2;->getCron()Lio/sentry/o2;

    move-result-object v0

    iget-object v1, p1, Lio/sentry/E;->L:Lio/sentry/o2;

    iget-object v1, v1, Lio/sentry/o2;->c:Ljava/lang/String;

    iput-object v1, v0, Lio/sentry/o2;->c:Ljava/lang/String;

    :cond_27
    iget-object v0, p1, Lio/sentry/E;->L:Lio/sentry/o2;

    iget-object v0, v0, Lio/sentry/o2;->d:Ljava/lang/Long;

    if-eqz v0, :cond_28

    invoke-virtual {p0}, Lio/sentry/v2;->getCron()Lio/sentry/o2;

    move-result-object v0

    iget-object v1, p1, Lio/sentry/E;->L:Lio/sentry/o2;

    iget-object v1, v1, Lio/sentry/o2;->d:Ljava/lang/Long;

    iput-object v1, v0, Lio/sentry/o2;->d:Ljava/lang/Long;

    :cond_28
    iget-object v0, p1, Lio/sentry/E;->L:Lio/sentry/o2;

    iget-object v0, v0, Lio/sentry/o2;->e:Ljava/lang/Long;

    if-eqz v0, :cond_29

    invoke-virtual {p0}, Lio/sentry/v2;->getCron()Lio/sentry/o2;

    move-result-object v0

    iget-object v1, p1, Lio/sentry/E;->L:Lio/sentry/o2;

    iget-object v1, v1, Lio/sentry/o2;->e:Ljava/lang/Long;

    iput-object v1, v0, Lio/sentry/o2;->e:Ljava/lang/Long;

    :cond_29
    :goto_6
    iget-object v0, p1, Lio/sentry/E;->B:Ljava/lang/Boolean;

    if-eqz v0, :cond_2a

    invoke-virtual {p0}, Lio/sentry/v2;->getLogs()Lio/sentry/p2;

    move-result-object v0

    iget-object p1, p1, Lio/sentry/E;->B:Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    iput-boolean p1, v0, Lio/sentry/p2;->a:Z

    :cond_2a
    return-void
.end method

.method public retrieveParsedDsn()Lio/sentry/z;
    .locals 1

    iget-object v0, p0, Lio/sentry/v2;->parsedDsn:Lio/sentry/util/d;

    invoke-virtual {v0}, Lio/sentry/util/d;->a()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lio/sentry/z;

    return-object v0
.end method

.method public setAttachServerName(Z)V
    .locals 0

    iput-boolean p1, p0, Lio/sentry/v2;->attachServerName:Z

    return-void
.end method

.method public setAttachStacktrace(Z)V
    .locals 0

    iput-boolean p1, p0, Lio/sentry/v2;->attachStacktrace:Z

    return-void
.end method

.method public setAttachThreads(Z)V
    .locals 0

    iput-boolean p1, p0, Lio/sentry/v2;->attachThreads:Z

    return-void
.end method

.method public setBackpressureMonitor(Lio/sentry/backpressure/b;)V
    .locals 0

    iput-object p1, p0, Lio/sentry/v2;->backpressureMonitor:Lio/sentry/backpressure/b;

    return-void
.end method

.method public setBeforeBreadcrumb(Lio/sentry/j2;)V
    .locals 0

    return-void
.end method

.method public setBeforeEnvelopeCallback(Lio/sentry/k2;)V
    .locals 0

    iput-object p1, p0, Lio/sentry/v2;->beforeEnvelopeCallback:Lio/sentry/k2;

    return-void
.end method

.method public setBeforeSend(Lio/sentry/l2;)V
    .locals 0

    return-void
.end method

.method public setBeforeSendFeedback(Lio/sentry/l2;)V
    .locals 0

    return-void
.end method

.method public setBeforeSendReplay(Lio/sentry/m2;)V
    .locals 0

    return-void
.end method

.method public setBeforeSendTransaction(Lio/sentry/n2;)V
    .locals 0

    return-void
.end method

.method public setCacheDirPath(Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lio/sentry/v2;->cacheDirPath:Ljava/lang/String;

    return-void
.end method

.method public setCaptureOpenTelemetryEvents(Z)V
    .locals 0

    iput-boolean p1, p0, Lio/sentry/v2;->captureOpenTelemetryEvents:Z

    return-void
.end method

.method public setCompositePerformanceCollector(Lio/sentry/m;)V
    .locals 0

    iput-object p1, p0, Lio/sentry/v2;->compositePerformanceCollector:Lio/sentry/m;

    return-void
.end method

.method public setConnectionStatusProvider(Lio/sentry/O;)V
    .locals 0

    iput-object p1, p0, Lio/sentry/v2;->connectionStatusProvider:Lio/sentry/O;

    return-void
.end method

.method public setConnectionTimeoutMillis(I)V
    .locals 0

    iput p1, p0, Lio/sentry/v2;->connectionTimeoutMillis:I

    return-void
.end method

.method public setContinuousProfiler(Lio/sentry/P;)V
    .locals 2

    iget-object v0, p0, Lio/sentry/v2;->continuousProfiler:Lio/sentry/P;

    sget-object v1, Lio/sentry/K0;->a:Lio/sentry/K0;

    if-ne v0, v1, :cond_0

    if-eqz p1, :cond_0

    iput-object p1, p0, Lio/sentry/v2;->continuousProfiler:Lio/sentry/P;

    :cond_0
    return-void
.end method

.method public setCron(Lio/sentry/o2;)V
    .locals 0

    iput-object p1, p0, Lio/sentry/v2;->cron:Lio/sentry/o2;

    return-void
.end method

.method public setDateProvider(Lio/sentry/I1;)V
    .locals 1

    iget-object v0, p0, Lio/sentry/v2;->dateProvider:Lio/sentry/util/d;

    invoke-virtual {v0, p1}, Lio/sentry/util/d;->b(Ljava/lang/Object;)V

    return-void
.end method

.method public setDeadlineTimeout(J)V
    .locals 0

    iput-wide p1, p0, Lio/sentry/v2;->deadlineTimeout:J

    return-void
.end method

.method public setDebug(Z)V
    .locals 0

    iput-boolean p1, p0, Lio/sentry/v2;->debug:Z

    return-void
.end method

.method public setDebugMetaLoader(Lio/sentry/internal/debugmeta/a;)V
    .locals 0

    if-eqz p1, :cond_0

    goto :goto_0

    :cond_0
    sget-object p1, Lio/sentry/internal/debugmeta/b;->a:Lio/sentry/internal/debugmeta/b;

    :goto_0
    iput-object p1, p0, Lio/sentry/v2;->debugMetaLoader:Lio/sentry/internal/debugmeta/a;

    return-void
.end method

.method public setDefaultScopeType(Lio/sentry/u1;)V
    .locals 0

    iput-object p1, p0, Lio/sentry/v2;->defaultScopeType:Lio/sentry/u1;

    return-void
.end method

.method public setDiagnosticLevel(Lio/sentry/a2;)V
    .locals 0

    if-eqz p1, :cond_0

    goto :goto_0

    :cond_0
    sget-object p1, Lio/sentry/v2;->DEFAULT_DIAGNOSTIC_LEVEL:Lio/sentry/a2;

    :goto_0
    iput-object p1, p0, Lio/sentry/v2;->diagnosticLevel:Lio/sentry/a2;

    return-void
.end method

.method public setDist(Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lio/sentry/v2;->dist:Ljava/lang/String;

    return-void
.end method

.method public setDistinctId(Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lio/sentry/v2;->distinctId:Ljava/lang/String;

    return-void
.end method

.method public setDsn(Ljava/lang/String;)V
    .locals 5

    iput-object p1, p0, Lio/sentry/v2;->dsn:Ljava/lang/String;

    iget-object p1, p0, Lio/sentry/v2;->parsedDsn:Lio/sentry/util/d;

    iget-object v0, p1, Lio/sentry/util/d;->c:Lio/sentry/util/a;

    invoke-virtual {v0}, Lio/sentry/util/a;->a()Lio/sentry/r;

    move-result-object v0

    const/4 v1, 0x0

    :try_start_0
    iput-object v1, p1, Lio/sentry/util/d;->a:Ljava/lang/Object;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    invoke-virtual {v0}, Lio/sentry/r;->close()V

    iget-object p1, p0, Lio/sentry/v2;->dsn:Ljava/lang/String;

    iget-object v0, p0, Lio/sentry/v2;->logger:Lio/sentry/ILogger;

    sget-object v2, Lio/sentry/util/j;->a:Ljava/nio/charset/Charset;

    if-eqz p1, :cond_1

    invoke-virtual {p1}, Ljava/lang/String;->isEmpty()Z

    move-result v2

    if-eqz v2, :cond_0

    goto :goto_2

    :cond_0
    :try_start_1
    const-string v2, "SHA-1"

    invoke-static {v2}, Ljava/security/MessageDigest;->getInstance(Ljava/lang/String;)Ljava/security/MessageDigest;

    move-result-object v2

    sget-object v3, Lio/sentry/util/j;->a:Ljava/nio/charset/Charset;

    invoke-virtual {p1, v3}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/security/MessageDigest;->digest([B)[B

    move-result-object v2

    new-instance v3, Ljava/math/BigInteger;

    const/4 v4, 0x1

    invoke-direct {v3, v4, v2}, Ljava/math/BigInteger;-><init>(I[B)V

    new-instance v2, Ljava/lang/StringBuilder;

    const/16 v4, 0x10

    invoke-virtual {v3, v4}, Ljava/math/BigInteger;->toString(I)Ljava/lang/String;

    move-result-object v3

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1
    :try_end_1
    .catch Ljava/security/NoSuchAlgorithmException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_2

    :catchall_0
    move-exception v2

    goto :goto_0

    :catch_0
    move-exception p1

    goto :goto_1

    :goto_0
    sget-object v3, Lio/sentry/a2;->INFO:Lio/sentry/a2;

    const-string v4, "string: %s could not calculate its hash"

    filled-new-array {v2, p1}, [Ljava/lang/Object;

    move-result-object p1

    invoke-interface {v0, v3, v4, p1}, Lio/sentry/ILogger;->e(Lio/sentry/a2;Ljava/lang/String;[Ljava/lang/Object;)V

    goto :goto_2

    :goto_1
    sget-object v2, Lio/sentry/a2;->INFO:Lio/sentry/a2;

    const-string v3, "SHA-1 isn\'t available to calculate the hash."

    invoke-interface {v0, v2, v3, p1}, Lio/sentry/ILogger;->r(Lio/sentry/a2;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_1
    :goto_2
    iput-object v1, p0, Lio/sentry/v2;->dsnHash:Ljava/lang/String;

    return-void

    :catchall_1
    move-exception p1

    :try_start_2
    invoke-virtual {v0}, Lio/sentry/r;->close()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    goto :goto_3

    :catchall_2
    move-exception v0

    invoke-virtual {p1, v0}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_3
    throw p1
.end method

.method public setEnableAppStartProfiling(Z)V
    .locals 0

    iput-boolean p1, p0, Lio/sentry/v2;->enableAppStartProfiling:Z

    return-void
.end method

.method public setEnableAutoSessionTracking(Z)V
    .locals 0

    iput-boolean p1, p0, Lio/sentry/v2;->enableAutoSessionTracking:Z

    return-void
.end method

.method public setEnableBackpressureHandling(Z)V
    .locals 0

    iput-boolean p1, p0, Lio/sentry/v2;->enableBackpressureHandling:Z

    return-void
.end method

.method public setEnableDeduplication(Z)V
    .locals 0

    iput-boolean p1, p0, Lio/sentry/v2;->enableDeduplication:Z

    return-void
.end method

.method public setEnableExternalConfiguration(Z)V
    .locals 0

    iput-boolean p1, p0, Lio/sentry/v2;->enableExternalConfiguration:Z

    return-void
.end method

.method public setEnablePrettySerializationOutput(Z)V
    .locals 0

    iput-boolean p1, p0, Lio/sentry/v2;->enablePrettySerializationOutput:Z

    return-void
.end method

.method public setEnableScopePersistence(Z)V
    .locals 0

    iput-boolean p1, p0, Lio/sentry/v2;->enableScopePersistence:Z

    return-void
.end method

.method public setEnableScreenTracking(Z)V
    .locals 0

    iput-boolean p1, p0, Lio/sentry/v2;->enableScreenTracking:Z

    return-void
.end method

.method public setEnableShutdownHook(Z)V
    .locals 0

    iput-boolean p1, p0, Lio/sentry/v2;->enableShutdownHook:Z

    return-void
.end method

.method public setEnableSpotlight(Z)V
    .locals 0

    iput-boolean p1, p0, Lio/sentry/v2;->enableSpotlight:Z

    return-void
.end method

.method public setEnableTimeToFullDisplayTracing(Z)V
    .locals 0

    iput-boolean p1, p0, Lio/sentry/v2;->enableTimeToFullDisplayTracing:Z

    return-void
.end method

.method public setEnableUncaughtExceptionHandler(Z)V
    .locals 0

    iput-boolean p1, p0, Lio/sentry/v2;->enableUncaughtExceptionHandler:Z

    return-void
.end method

.method public setEnableUserInteractionBreadcrumbs(Z)V
    .locals 0

    iput-boolean p1, p0, Lio/sentry/v2;->enableUserInteractionBreadcrumbs:Z

    return-void
.end method

.method public setEnableUserInteractionTracing(Z)V
    .locals 0

    iput-boolean p1, p0, Lio/sentry/v2;->enableUserInteractionTracing:Z

    return-void
.end method

.method public setEnabled(Z)V
    .locals 0

    iput-boolean p1, p0, Lio/sentry/v2;->enabled:Z

    return-void
.end method

.method public setEnvelopeDiskCache(Lio/sentry/cache/d;)V
    .locals 0

    if-eqz p1, :cond_0

    goto :goto_0

    :cond_0
    sget-object p1, Lio/sentry/transport/i;->a:Lio/sentry/transport/i;

    :goto_0
    iput-object p1, p0, Lio/sentry/v2;->envelopeDiskCache:Lio/sentry/cache/d;

    return-void
.end method

.method public setEnvelopeReader(Lio/sentry/Q;)V
    .locals 1

    iget-object v0, p0, Lio/sentry/v2;->envelopeReader:Lio/sentry/util/d;

    if-eqz p1, :cond_0

    goto :goto_0

    :cond_0
    sget-object p1, Lio/sentry/L0;->a:Lio/sentry/L0;

    :goto_0
    invoke-virtual {v0, p1}, Lio/sentry/util/d;->b(Ljava/lang/Object;)V

    return-void
.end method

.method public setEnvironment(Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lio/sentry/v2;->environment:Ljava/lang/String;

    return-void
.end method

.method public setExecutorService(Lio/sentry/c0;)V
    .locals 0

    if-eqz p1, :cond_0

    iput-object p1, p0, Lio/sentry/v2;->executorService:Lio/sentry/c0;

    :cond_0
    return-void
.end method

.method public setFatalLogger(Lio/sentry/ILogger;)V
    .locals 0

    if-nez p1, :cond_0

    sget-object p1, Lio/sentry/N0;->a:Lio/sentry/N0;

    :cond_0
    iput-object p1, p0, Lio/sentry/v2;->fatalLogger:Lio/sentry/ILogger;

    return-void
.end method

.method public setFeedbackOptions(Lio/sentry/V1;)V
    .locals 0

    iput-object p1, p0, Lio/sentry/v2;->feedbackOptions:Lio/sentry/V1;

    return-void
.end method

.method public setFlushTimeoutMillis(J)V
    .locals 0

    iput-wide p1, p0, Lio/sentry/v2;->flushTimeoutMillis:J

    return-void
.end method

.method public setForceInit(Z)V
    .locals 0

    iput-boolean p1, p0, Lio/sentry/v2;->forceInit:Z

    return-void
.end method

.method public setFullyDisplayedReporter(Lio/sentry/G;)V
    .locals 0

    iput-object p1, p0, Lio/sentry/v2;->fullyDisplayedReporter:Lio/sentry/G;

    return-void
.end method

.method public setGestureTargetLocators(Ljava/util/List;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lio/sentry/android/core/internal/gestures/a;",
            ">;)V"
        }
    .end annotation

    iget-object v0, p0, Lio/sentry/v2;->gestureTargetLocators:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->clear()V

    iget-object v0, p0, Lio/sentry/v2;->gestureTargetLocators:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    return-void
.end method

.method public setGlobalHubMode(Ljava/lang/Boolean;)V
    .locals 0

    iput-object p1, p0, Lio/sentry/v2;->globalHubMode:Ljava/lang/Boolean;

    return-void
.end method

.method public setIdleTimeout(Ljava/lang/Long;)V
    .locals 0

    iput-object p1, p0, Lio/sentry/v2;->idleTimeout:Ljava/lang/Long;

    return-void
.end method

.method public setIgnoredCheckIns(Ljava/util/List;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    if-nez p1, :cond_0

    const/4 p1, 0x0

    iput-object p1, p0, Lio/sentry/v2;->ignoredCheckIns:Ljava/util/List;

    return-void

    :cond_0
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_1
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    invoke-virtual {v1}, Ljava/lang/String;->isEmpty()Z

    move-result v2

    if-nez v2, :cond_1

    new-instance v2, Lio/sentry/F;

    invoke-direct {v2, v1}, Lio/sentry/F;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_2
    iput-object v0, p0, Lio/sentry/v2;->ignoredCheckIns:Ljava/util/List;

    return-void
.end method

.method public setIgnoredErrors(Ljava/util/List;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    if-nez p1, :cond_0

    const/4 p1, 0x0

    iput-object p1, p0, Lio/sentry/v2;->ignoredErrors:Ljava/util/List;

    return-void

    :cond_0
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_1
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    if-eqz v1, :cond_1

    invoke-virtual {v1}, Ljava/lang/String;->isEmpty()Z

    move-result v2

    if-nez v2, :cond_1

    new-instance v2, Lio/sentry/F;

    invoke-direct {v2, v1}, Lio/sentry/F;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_2
    iput-object v0, p0, Lio/sentry/v2;->ignoredErrors:Ljava/util/List;

    return-void
.end method

.method public setIgnoredSpanOrigins(Ljava/util/List;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    if-nez p1, :cond_0

    const/4 p1, 0x0

    iput-object p1, p0, Lio/sentry/v2;->ignoredSpanOrigins:Ljava/util/List;

    return-void

    :cond_0
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_1
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    if-eqz v1, :cond_1

    invoke-virtual {v1}, Ljava/lang/String;->isEmpty()Z

    move-result v2

    if-nez v2, :cond_1

    new-instance v2, Lio/sentry/F;

    invoke-direct {v2, v1}, Lio/sentry/F;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_2
    iput-object v0, p0, Lio/sentry/v2;->ignoredSpanOrigins:Ljava/util/List;

    return-void
.end method

.method public setIgnoredTransactions(Ljava/util/List;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    if-nez p1, :cond_0

    const/4 p1, 0x0

    iput-object p1, p0, Lio/sentry/v2;->ignoredTransactions:Ljava/util/List;

    return-void

    :cond_0
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_1
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    if-eqz v1, :cond_1

    invoke-virtual {v1}, Ljava/lang/String;->isEmpty()Z

    move-result v2

    if-nez v2, :cond_1

    new-instance v2, Lio/sentry/F;

    invoke-direct {v2, v1}, Lio/sentry/F;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_2
    iput-object v0, p0, Lio/sentry/v2;->ignoredTransactions:Ljava/util/List;

    return-void
.end method

.method public setInitPriority(Lio/sentry/m0;)V
    .locals 0

    iput-object p1, p0, Lio/sentry/v2;->initPriority:Lio/sentry/m0;

    return-void
.end method

.method public setInstrumenter(Lio/sentry/n0;)V
    .locals 0
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    iput-object p1, p0, Lio/sentry/v2;->instrumenter:Lio/sentry/n0;

    return-void
.end method

.method public setLogger(Lio/sentry/ILogger;)V
    .locals 2

    if-nez p1, :cond_0

    sget-object p1, Lio/sentry/N0;->a:Lio/sentry/N0;

    goto :goto_0

    :cond_0
    new-instance v0, Lio/sentry/internal/debugmeta/c;

    const/4 v1, 0x1

    invoke-direct {v0, v1, p0, p1}, Lio/sentry/internal/debugmeta/c;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    move-object p1, v0

    :goto_0
    iput-object p1, p0, Lio/sentry/v2;->logger:Lio/sentry/ILogger;

    return-void
.end method

.method public setLogs(Lio/sentry/p2;)V
    .locals 0

    iput-object p1, p0, Lio/sentry/v2;->logs:Lio/sentry/p2;

    return-void
.end method

.method public setMaxAttachmentSize(J)V
    .locals 0

    iput-wide p1, p0, Lio/sentry/v2;->maxAttachmentSize:J

    return-void
.end method

.method public setMaxBreadcrumbs(I)V
    .locals 0

    iput p1, p0, Lio/sentry/v2;->maxBreadcrumbs:I

    return-void
.end method

.method public setMaxCacheItems(I)V
    .locals 0

    iput p1, p0, Lio/sentry/v2;->maxCacheItems:I

    return-void
.end method

.method public setMaxDepth(I)V
    .locals 0

    iput p1, p0, Lio/sentry/v2;->maxDepth:I

    return-void
.end method

.method public setMaxQueueSize(I)V
    .locals 0

    if-lez p1, :cond_0

    iput p1, p0, Lio/sentry/v2;->maxQueueSize:I

    :cond_0
    return-void
.end method

.method public setMaxRequestBodySize(Lio/sentry/t2;)V
    .locals 0

    iput-object p1, p0, Lio/sentry/v2;->maxRequestBodySize:Lio/sentry/t2;

    return-void
.end method

.method public setMaxSpans(I)V
    .locals 0

    iput p1, p0, Lio/sentry/v2;->maxSpans:I

    return-void
.end method

.method public setMaxTraceFileSize(J)V
    .locals 0

    iput-wide p1, p0, Lio/sentry/v2;->maxTraceFileSize:J

    return-void
.end method

.method public setModulesLoader(Lio/sentry/internal/modules/a;)V
    .locals 0

    if-eqz p1, :cond_0

    goto :goto_0

    :cond_0
    sget-object p1, Lio/sentry/internal/modules/e;->a:Lio/sentry/internal/modules/e;

    :goto_0
    iput-object p1, p0, Lio/sentry/v2;->modulesLoader:Lio/sentry/internal/modules/a;

    return-void
.end method

.method public setOnDiscard(Lio/sentry/q2;)V
    .locals 0

    return-void
.end method

.method public setOpenTelemetryMode(Lio/sentry/h2;)V
    .locals 0

    iput-object p1, p0, Lio/sentry/v2;->openTelemetryMode:Lio/sentry/h2;

    return-void
.end method

.method public setPrintUncaughtStackTrace(Z)V
    .locals 0

    iput-boolean p1, p0, Lio/sentry/v2;->printUncaughtStackTrace:Z

    return-void
.end method

.method public setProfileLifecycle(Lio/sentry/g1;)V
    .locals 3

    iput-object p1, p0, Lio/sentry/v2;->profileLifecycle:Lio/sentry/g1;

    sget-object v0, Lio/sentry/g1;->TRACE:Lio/sentry/g1;

    if-ne p1, v0, :cond_0

    invoke-virtual {p0}, Lio/sentry/v2;->isTracingEnabled()Z

    move-result p1

    if-nez p1, :cond_0

    iget-object p1, p0, Lio/sentry/v2;->logger:Lio/sentry/ILogger;

    sget-object v0, Lio/sentry/a2;->WARNING:Lio/sentry/a2;

    const/4 v1, 0x0

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "Profiling lifecycle is set to TRACE but tracing is disabled. Profiling will not be started automatically."

    invoke-interface {p1, v0, v2, v1}, Lio/sentry/ILogger;->e(Lio/sentry/a2;Ljava/lang/String;[Ljava/lang/Object;)V

    :cond_0
    return-void
.end method

.method public setProfileSessionSampleRate(Ljava/lang/Double;)V
    .locals 3

    const/4 v0, 0x1

    invoke-static {p1, v0}, Lio/sentry/config/a;->y(Ljava/lang/Double;Z)Z

    move-result v0

    if-eqz v0, :cond_0

    iput-object p1, p0, Lio/sentry/v2;->profileSessionSampleRate:Ljava/lang/Double;

    return-void

    :cond_0
    new-instance v0, Ljava/lang/IllegalArgumentException;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "The value "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p1, " is not valid. Use values between 0.0 and 1.0."

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public setProfilesSampleRate(Ljava/lang/Double;)V
    .locals 3

    const/4 v0, 0x1

    invoke-static {p1, v0}, Lio/sentry/config/a;->y(Ljava/lang/Double;Z)Z

    move-result v0

    if-eqz v0, :cond_0

    iput-object p1, p0, Lio/sentry/v2;->profilesSampleRate:Ljava/lang/Double;

    return-void

    :cond_0
    new-instance v0, Ljava/lang/IllegalArgumentException;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "The value "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p1, " is not valid. Use null to disable or values between 0.0 and 1.0."

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public setProfilesSampler(Lio/sentry/r2;)V
    .locals 0

    return-void
.end method

.method public setProfilingTracesHz(I)V
    .locals 0

    iput p1, p0, Lio/sentry/v2;->profilingTracesHz:I

    return-void
.end method

.method public setProguardUuid(Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lio/sentry/v2;->proguardUuid:Ljava/lang/String;

    return-void
.end method

.method public setProxy(Lio/sentry/s2;)V
    .locals 0

    iput-object p1, p0, Lio/sentry/v2;->proxy:Lio/sentry/s2;

    return-void
.end method

.method public setReadTimeoutMillis(I)V
    .locals 0

    iput p1, p0, Lio/sentry/v2;->readTimeoutMillis:I

    return-void
.end method

.method public setRelease(Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lio/sentry/v2;->release:Ljava/lang/String;

    return-void
.end method

.method public setReplayController(Lio/sentry/k1;)V
    .locals 0

    if-eqz p1, :cond_0

    goto :goto_0

    :cond_0
    sget-object p1, Lio/sentry/K0;->c:Lio/sentry/K0;

    :goto_0
    iput-object p1, p0, Lio/sentry/v2;->replayController:Lio/sentry/k1;

    return-void
.end method

.method public setSampleRate(Ljava/lang/Double;)V
    .locals 3

    const/4 v0, 0x1

    invoke-static {p1, v0}, Lio/sentry/config/a;->y(Ljava/lang/Double;Z)Z

    move-result v0

    if-eqz v0, :cond_0

    iput-object p1, p0, Lio/sentry/v2;->sampleRate:Ljava/lang/Double;

    return-void

    :cond_0
    new-instance v0, Ljava/lang/IllegalArgumentException;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "The value "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p1, " is not valid. Use null to disable or values >= 0.0 and <= 1.0."

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public setSdkVersion(Lio/sentry/protocol/r;)V
    .locals 2

    invoke-virtual {p0}, Lio/sentry/v2;->getSessionReplay()Lio/sentry/z2;

    move-result-object v0

    iget-object v0, v0, Lio/sentry/z2;->k:Lio/sentry/protocol/r;

    iget-object v1, p0, Lio/sentry/v2;->sdkVersion:Lio/sentry/protocol/r;

    if-eqz v1, :cond_0

    if-eqz v0, :cond_0

    invoke-virtual {v1, v0}, Lio/sentry/protocol/r;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Lio/sentry/v2;->getSessionReplay()Lio/sentry/z2;

    move-result-object v0

    iput-object p1, v0, Lio/sentry/z2;->k:Lio/sentry/protocol/r;

    :cond_0
    iput-object p1, p0, Lio/sentry/v2;->sdkVersion:Lio/sentry/protocol/r;

    return-void
.end method

.method public setSendClientReports(Z)V
    .locals 0

    iput-boolean p1, p0, Lio/sentry/v2;->sendClientReports:Z

    if-eqz p1, :cond_0

    new-instance p1, Lio/sentry/internal/debugmeta/c;

    invoke-direct {p1, p0}, Lio/sentry/internal/debugmeta/c;-><init>(Lio/sentry/v2;)V

    iput-object p1, p0, Lio/sentry/v2;->clientReportRecorder:Lio/sentry/clientreport/f;

    return-void

    :cond_0
    new-instance p1, Lio/sentry/hints/i;

    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lio/sentry/v2;->clientReportRecorder:Lio/sentry/clientreport/f;

    return-void
.end method

.method public setSendDefaultPii(Z)V
    .locals 0

    iput-boolean p1, p0, Lio/sentry/v2;->sendDefaultPii:Z

    return-void
.end method

.method public setSendModules(Z)V
    .locals 0

    iput-boolean p1, p0, Lio/sentry/v2;->sendModules:Z

    return-void
.end method

.method public setSentryClientName(Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lio/sentry/v2;->sentryClientName:Ljava/lang/String;

    return-void
.end method

.method public setSerializer(Lio/sentry/e0;)V
    .locals 1

    iget-object v0, p0, Lio/sentry/v2;->serializer:Lio/sentry/util/d;

    if-eqz p1, :cond_0

    goto :goto_0

    :cond_0
    sget-object p1, Lio/sentry/S0;->a:Lio/sentry/S0;

    :goto_0
    invoke-virtual {v0, p1}, Lio/sentry/util/d;->b(Ljava/lang/Object;)V

    return-void
.end method

.method public setServerName(Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lio/sentry/v2;->serverName:Ljava/lang/String;

    return-void
.end method

.method public setSessionFlushTimeoutMillis(J)V
    .locals 0

    iput-wide p1, p0, Lio/sentry/v2;->sessionFlushTimeoutMillis:J

    return-void
.end method

.method public setSessionReplay(Lio/sentry/z2;)V
    .locals 0

    iput-object p1, p0, Lio/sentry/v2;->sessionReplay:Lio/sentry/z2;

    return-void
.end method

.method public setSessionTrackingIntervalMillis(J)V
    .locals 0

    iput-wide p1, p0, Lio/sentry/v2;->sessionTrackingIntervalMillis:J

    return-void
.end method

.method public setShutdownTimeoutMillis(J)V
    .locals 0

    iput-wide p1, p0, Lio/sentry/v2;->shutdownTimeoutMillis:J

    return-void
.end method

.method public setSocketTagger(Lio/sentry/f0;)V
    .locals 0

    if-eqz p1, :cond_0

    goto :goto_0

    :cond_0
    sget-object p1, Lio/sentry/T0;->a:Lio/sentry/T0;

    :goto_0
    iput-object p1, p0, Lio/sentry/v2;->socketTagger:Lio/sentry/f0;

    return-void
.end method

.method public setSpanFactory(Lio/sentry/h0;)V
    .locals 0

    iput-object p1, p0, Lio/sentry/v2;->spanFactory:Lio/sentry/h0;

    return-void
.end method

.method public setSpotlightConnectionUrl(Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lio/sentry/v2;->spotlightConnectionUrl:Ljava/lang/String;

    return-void
.end method

.method public setSslSocketFactory(Ljavax/net/ssl/SSLSocketFactory;)V
    .locals 0

    iput-object p1, p0, Lio/sentry/v2;->sslSocketFactory:Ljavax/net/ssl/SSLSocketFactory;

    return-void
.end method

.method public setStartProfilerOnAppStart(Z)V
    .locals 0

    iput-boolean p1, p0, Lio/sentry/v2;->startProfilerOnAppStart:Z

    return-void
.end method

.method public setTag(Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    if-nez p1, :cond_0

    return-void

    :cond_0
    if-nez p2, :cond_1

    iget-object p2, p0, Lio/sentry/v2;->tags:Ljava/util/Map;

    invoke-interface {p2, p1}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    return-void

    :cond_1
    iget-object v0, p0, Lio/sentry/v2;->tags:Ljava/util/Map;

    invoke-interface {v0, p1, p2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public setThreadChecker(Lio/sentry/util/thread/a;)V
    .locals 0

    iput-object p1, p0, Lio/sentry/v2;->threadChecker:Lio/sentry/util/thread/a;

    return-void
.end method

.method public setTraceOptionsRequests(Z)V
    .locals 0

    iput-boolean p1, p0, Lio/sentry/v2;->traceOptionsRequests:Z

    return-void
.end method

.method public setTracePropagationTargets(Ljava/util/List;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    if-nez p1, :cond_0

    const/4 p1, 0x0

    iput-object p1, p0, Lio/sentry/v2;->tracePropagationTargets:Ljava/util/List;

    return-void

    :cond_0
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_1
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    invoke-virtual {v1}, Ljava/lang/String;->isEmpty()Z

    move-result v2

    if-nez v2, :cond_1

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_2
    iput-object v0, p0, Lio/sentry/v2;->tracePropagationTargets:Ljava/util/List;

    return-void
.end method

.method public setTraceSampling(Z)V
    .locals 0
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    iput-boolean p1, p0, Lio/sentry/v2;->traceSampling:Z

    return-void
.end method

.method public setTracesSampleRate(Ljava/lang/Double;)V
    .locals 3

    const/4 v0, 0x1

    invoke-static {p1, v0}, Lio/sentry/config/a;->y(Ljava/lang/Double;Z)Z

    move-result v0

    if-eqz v0, :cond_0

    iput-object p1, p0, Lio/sentry/v2;->tracesSampleRate:Ljava/lang/Double;

    return-void

    :cond_0
    new-instance v0, Ljava/lang/IllegalArgumentException;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "The value "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p1, " is not valid. Use null to disable or values between 0.0 and 1.0."

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public setTracesSampler(Lio/sentry/u2;)V
    .locals 0

    return-void
.end method

.method public setTransactionProfiler(Lio/sentry/j0;)V
    .locals 2

    iget-object v0, p0, Lio/sentry/v2;->transactionProfiler:Lio/sentry/j0;

    sget-object v1, Lio/sentry/K0;->e:Lio/sentry/K0;

    if-ne v0, v1, :cond_0

    if-eqz p1, :cond_0

    iput-object p1, p0, Lio/sentry/v2;->transactionProfiler:Lio/sentry/j0;

    :cond_0
    return-void
.end method

.method public setTransportFactory(Lio/sentry/k0;)V
    .locals 0

    if-eqz p1, :cond_0

    goto :goto_0

    :cond_0
    sget-object p1, Lio/sentry/X0;->a:Lio/sentry/X0;

    :goto_0
    iput-object p1, p0, Lio/sentry/v2;->transportFactory:Lio/sentry/k0;

    return-void
.end method

.method public setTransportGate(Lio/sentry/transport/h;)V
    .locals 0

    if-eqz p1, :cond_0

    goto :goto_0

    :cond_0
    sget-object p1, Lio/sentry/transport/k;->a:Lio/sentry/transport/k;

    :goto_0
    iput-object p1, p0, Lio/sentry/v2;->transportGate:Lio/sentry/transport/h;

    return-void
.end method

.method public setVersionDetector(Lio/sentry/l0;)V
    .locals 0

    iput-object p1, p0, Lio/sentry/v2;->versionDetector:Lio/sentry/l0;

    return-void
.end method

.method public setViewHierarchyExporters(Ljava/util/List;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ljava/lang/Object;",
            ">;)V"
        }
    .end annotation

    iget-object v0, p0, Lio/sentry/v2;->viewHierarchyExporters:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->clear()V

    iget-object v0, p0, Lio/sentry/v2;->viewHierarchyExporters:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    return-void
.end method
