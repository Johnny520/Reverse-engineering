.class public abstract Lio/sentry/android/core/m;
.super Ljava/lang/Object;
.source ""


# direct methods
.method public static a(Lio/sentry/android/core/SentryAndroidOptions;Landroid/content/Context;Lio/sentry/android/core/I;Lio/sentry/hints/i;LFu;)V
    .locals 12

    invoke-virtual {p0}, Lio/sentry/v2;->getCacheDirPath()Ljava/lang/String;

    move-result-object v1

    if-eqz v1, :cond_0

    invoke-virtual {p0}, Lio/sentry/v2;->getEnvelopeDiskCache()Lio/sentry/cache/d;

    move-result-object v1

    instance-of v1, v1, Lio/sentry/transport/i;

    if-eqz v1, :cond_0

    new-instance v1, Lio/sentry/android/core/cache/a;

    invoke-direct {v1, p0}, Lio/sentry/android/core/cache/a;-><init>(Lio/sentry/android/core/SentryAndroidOptions;)V

    invoke-virtual {p0, v1}, Lio/sentry/v2;->setEnvelopeDiskCache(Lio/sentry/cache/d;)V

    :cond_0
    invoke-virtual {p0}, Lio/sentry/v2;->getConnectionStatusProvider()Lio/sentry/O;

    move-result-object v1

    instance-of v1, v1, Lio/sentry/J0;

    if-eqz v1, :cond_1

    new-instance v1, Lio/sentry/android/core/internal/util/b;

    invoke-direct {v1, p1, p2, p0}, Lio/sentry/android/core/internal/util/b;-><init>(Landroid/content/Context;Lio/sentry/android/core/I;Lio/sentry/android/core/SentryAndroidOptions;)V

    invoke-virtual {p0, v1}, Lio/sentry/v2;->setConnectionStatusProvider(Lio/sentry/O;)V

    :cond_1
    invoke-virtual {p0}, Lio/sentry/v2;->getCacheDirPath()Ljava/lang/String;

    move-result-object v1

    if-eqz v1, :cond_2

    new-instance v1, Lio/sentry/cache/f;

    invoke-direct {v1, p0}, Lio/sentry/cache/f;-><init>(Lio/sentry/android/core/SentryAndroidOptions;)V

    invoke-virtual {p0, v1}, Lio/sentry/v2;->addScopeObserver(Lio/sentry/Y;)V

    new-instance v1, Lio/sentry/cache/e;

    invoke-direct {v1, p0}, Lio/sentry/cache/e;-><init>(Lio/sentry/android/core/SentryAndroidOptions;)V

    invoke-virtual {p0, v1}, Lio/sentry/v2;->addOptionsObserver(Lio/sentry/T;)V

    :cond_2
    new-instance v1, Lio/sentry/o;

    invoke-direct {v1, p0}, Lio/sentry/o;-><init>(Lio/sentry/android/core/SentryAndroidOptions;)V

    invoke-virtual {p0, v1}, Lio/sentry/v2;->addEventProcessor(Lio/sentry/C;)V

    new-instance v1, Lio/sentry/android/core/J;

    invoke-direct {v1, p1, p2, p0}, Lio/sentry/android/core/J;-><init>(Landroid/content/Context;Lio/sentry/android/core/I;Lio/sentry/android/core/SentryAndroidOptions;)V

    invoke-virtual {p0, v1}, Lio/sentry/v2;->addEventProcessor(Lio/sentry/C;)V

    new-instance v1, Lio/sentry/android/core/Z;

    move-object/from16 v4, p4

    invoke-direct {v1, p0, v4}, Lio/sentry/android/core/Z;-><init>(Lio/sentry/android/core/SentryAndroidOptions;LFu;)V

    invoke-virtual {p0, v1}, Lio/sentry/v2;->addEventProcessor(Lio/sentry/C;)V

    new-instance v1, Lio/sentry/android/core/ScreenshotEventProcessor;

    invoke-direct {v1, p0, p2}, Lio/sentry/android/core/ScreenshotEventProcessor;-><init>(Lio/sentry/android/core/SentryAndroidOptions;Lio/sentry/android/core/I;)V

    invoke-virtual {p0, v1}, Lio/sentry/v2;->addEventProcessor(Lio/sentry/C;)V

    new-instance v1, Lio/sentry/android/core/ViewHierarchyEventProcessor;

    invoke-direct {v1, p0}, Lio/sentry/android/core/ViewHierarchyEventProcessor;-><init>(Lio/sentry/android/core/SentryAndroidOptions;)V

    invoke-virtual {p0, v1}, Lio/sentry/v2;->addEventProcessor(Lio/sentry/C;)V

    new-instance v1, Lio/sentry/android/core/u;

    invoke-direct {v1, p1, p2, p0}, Lio/sentry/android/core/u;-><init>(Landroid/content/Context;Lio/sentry/android/core/I;Lio/sentry/android/core/SentryAndroidOptions;)V

    invoke-virtual {p0, v1}, Lio/sentry/v2;->addEventProcessor(Lio/sentry/C;)V

    invoke-virtual {p0}, Lio/sentry/v2;->getTransportGate()Lio/sentry/transport/h;

    move-result-object v1

    instance-of v1, v1, Lio/sentry/transport/k;

    if-eqz v1, :cond_3

    new-instance v1, Lio/sentry/android/core/I;

    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    iput-object p0, v1, Lio/sentry/android/core/I;->a:Ljava/lang/Object;

    invoke-virtual {p0, v1}, Lio/sentry/v2;->setTransportGate(Lio/sentry/transport/h;)V

    :cond_3
    invoke-static {}, Lio/sentry/android/core/performance/f;->b()Lio/sentry/android/core/performance/f;

    move-result-object v1

    sget-object v4, Lio/sentry/android/core/performance/f;->q:Lio/sentry/util/a;

    invoke-virtual {v4}, Lio/sentry/util/a;->a()Lio/sentry/r;

    move-result-object v4

    :try_start_0
    iget-object v5, v1, Lio/sentry/android/core/performance/f;->h:Lio/sentry/android/core/r;

    iget-object v6, v1, Lio/sentry/android/core/performance/f;->i:Lio/sentry/android/core/g;

    const/4 v7, 0x0

    iput-object v7, v1, Lio/sentry/android/core/performance/f;->h:Lio/sentry/android/core/r;

    iput-object v7, v1, Lio/sentry/android/core/performance/f;->i:Lio/sentry/android/core/g;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-virtual {v4}, Lio/sentry/r;->close()V

    invoke-virtual {p0}, Lio/sentry/v2;->isProfilingEnabled()Z

    move-result v1

    const/4 v10, 0x1

    const-string v11, "options.getFrameMetricsCollector is required"

    if-nez v1, :cond_7

    invoke-virtual {p0}, Lio/sentry/v2;->getProfilesSampleRate()Ljava/lang/Double;

    move-result-object v1

    if-eqz v1, :cond_4

    goto :goto_0

    :cond_4
    sget-object v1, Lio/sentry/K0;->e:Lio/sentry/K0;

    invoke-virtual {p0, v1}, Lio/sentry/v2;->setTransactionProfiler(Lio/sentry/j0;)V

    if-eqz v5, :cond_5

    invoke-virtual {v5}, Lio/sentry/android/core/r;->close()V

    :cond_5
    if-eqz v6, :cond_6

    invoke-virtual {p0, v6}, Lio/sentry/v2;->setContinuousProfiler(Lio/sentry/P;)V

    goto :goto_1

    :cond_6
    new-instance v3, Lio/sentry/android/core/g;

    invoke-virtual {p0}, Lio/sentry/android/core/SentryAndroidOptions;->getFrameMetricsCollector()Lio/sentry/android/core/internal/util/o;

    move-result-object v5

    invoke-static {v11, v5}, Lio/sentry/config/a;->D(Ljava/lang/String;Ljava/lang/Object;)V

    invoke-virtual {p0}, Lio/sentry/v2;->getLogger()Lio/sentry/ILogger;

    move-result-object v6

    invoke-virtual {p0}, Lio/sentry/v2;->getProfilingTracesDirPath()Ljava/lang/String;

    move-result-object v7

    invoke-virtual {p0}, Lio/sentry/v2;->getProfilingTracesHz()I

    move-result v8

    invoke-virtual {p0}, Lio/sentry/v2;->getExecutorService()Lio/sentry/c0;

    move-result-object v9

    move-object v4, p2

    invoke-direct/range {v3 .. v9}, Lio/sentry/android/core/g;-><init>(Lio/sentry/android/core/I;Lio/sentry/android/core/internal/util/o;Lio/sentry/ILogger;Ljava/lang/String;ILio/sentry/c0;)V

    invoke-virtual {p0, v3}, Lio/sentry/v2;->setContinuousProfiler(Lio/sentry/P;)V

    goto :goto_1

    :cond_7
    :goto_0
    sget-object v1, Lio/sentry/K0;->a:Lio/sentry/K0;

    invoke-virtual {p0, v1}, Lio/sentry/v2;->setContinuousProfiler(Lio/sentry/P;)V

    if-eqz v6, :cond_8

    invoke-virtual {v6, v10}, Lio/sentry/android/core/g;->a(Z)V

    :cond_8
    if-eqz v5, :cond_9

    invoke-virtual {p0, v5}, Lio/sentry/v2;->setTransactionProfiler(Lio/sentry/j0;)V

    goto :goto_1

    :cond_9
    new-instance v1, Lio/sentry/android/core/r;

    invoke-virtual {p0}, Lio/sentry/android/core/SentryAndroidOptions;->getFrameMetricsCollector()Lio/sentry/android/core/internal/util/o;

    move-result-object v4

    invoke-static {v11, v4}, Lio/sentry/config/a;->D(Ljava/lang/String;Ljava/lang/Object;)V

    invoke-virtual {p0}, Lio/sentry/v2;->getLogger()Lio/sentry/ILogger;

    move-result-object v5

    invoke-virtual {p0}, Lio/sentry/v2;->getProfilingTracesDirPath()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {p0}, Lio/sentry/v2;->isProfilingEnabled()Z

    move-result v7

    invoke-virtual {p0}, Lio/sentry/v2;->getProfilingTracesHz()I

    move-result v8

    invoke-virtual {p0}, Lio/sentry/v2;->getExecutorService()Lio/sentry/c0;

    move-result-object v9

    move-object v2, p1

    move-object v3, p2

    invoke-direct/range {v1 .. v9}, Lio/sentry/android/core/r;-><init>(Landroid/content/Context;Lio/sentry/android/core/I;Lio/sentry/android/core/internal/util/o;Lio/sentry/ILogger;Ljava/lang/String;ZILio/sentry/c0;)V

    invoke-virtual {p0, v1}, Lio/sentry/v2;->setTransactionProfiler(Lio/sentry/j0;)V

    :goto_1
    invoke-virtual {p0}, Lio/sentry/v2;->getModulesLoader()Lio/sentry/internal/modules/a;

    move-result-object v1

    instance-of v1, v1, Lio/sentry/internal/modules/e;

    if-eqz v1, :cond_a

    new-instance v1, Lio/sentry/internal/modules/f;

    invoke-virtual {p0}, Lio/sentry/v2;->getLogger()Lio/sentry/ILogger;

    move-result-object v3

    invoke-direct {v1, p1, v3}, Lio/sentry/internal/modules/f;-><init>(Landroid/content/Context;Lio/sentry/ILogger;)V

    invoke-virtual {p0, v1}, Lio/sentry/v2;->setModulesLoader(Lio/sentry/internal/modules/a;)V

    :cond_a
    invoke-virtual {p0}, Lio/sentry/v2;->getDebugMetaLoader()Lio/sentry/internal/debugmeta/a;

    move-result-object v1

    instance-of v1, v1, Lio/sentry/internal/debugmeta/b;

    if-eqz v1, :cond_b

    new-instance v1, Lio/sentry/internal/debugmeta/c;

    invoke-virtual {p0}, Lio/sentry/v2;->getLogger()Lio/sentry/ILogger;

    move-result-object v3

    invoke-direct {v1, p1, v3}, Lio/sentry/internal/debugmeta/c;-><init>(Landroid/content/Context;Lio/sentry/ILogger;)V

    invoke-virtual {p0, v1}, Lio/sentry/v2;->setDebugMetaLoader(Lio/sentry/internal/debugmeta/a;)V

    :cond_b
    invoke-virtual {p0}, Lio/sentry/v2;->getVersionDetector()Lio/sentry/l0;

    move-result-object v1

    instance-of v1, v1, Lio/sentry/Y0;

    if-eqz v1, :cond_c

    new-instance v1, Lio/sentry/t;

    const/4 v2, 0x0

    invoke-direct {v1, p0, v2}, Lio/sentry/t;-><init>(Lio/sentry/v2;I)V

    invoke-virtual {p0, v1}, Lio/sentry/v2;->setVersionDetector(Lio/sentry/l0;)V

    :cond_c
    const-string v1, "androidx.core.view.ScrollingView"

    invoke-static {p0, v1}, Lio/sentry/hints/i;->d(Lio/sentry/v2;Ljava/lang/String;)Z

    move-result v1

    const-string v2, "androidx.compose.ui.node.Owner"

    invoke-static {p0, v2}, Lio/sentry/hints/i;->d(Lio/sentry/v2;Ljava/lang/String;)Z

    move-result v2

    invoke-virtual {p0}, Lio/sentry/v2;->getGestureTargetLocators()Ljava/util/List;

    move-result-object v3

    invoke-interface {v3}, Ljava/util/List;->isEmpty()Z

    move-result v3

    if-eqz v3, :cond_e

    new-instance v3, Ljava/util/ArrayList;

    const/4 v4, 0x2

    invoke-direct {v3, v4}, Ljava/util/ArrayList;-><init>(I)V

    new-instance v4, Lio/sentry/android/core/internal/gestures/a;

    invoke-direct {v4, v1}, Lio/sentry/android/core/internal/gestures/a;-><init>(Z)V

    invoke-virtual {v3, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    if-eqz v2, :cond_d

    const-string v1, "io.sentry.compose.gestures.ComposeGestureTargetLocator"

    invoke-static {p0, v1}, Lio/sentry/hints/i;->d(Lio/sentry/v2;Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_d

    new-instance v1, Lio/sentry/compose/gestures/ComposeGestureTargetLocator;

    invoke-virtual {p0}, Lio/sentry/v2;->getLogger()Lio/sentry/ILogger;

    move-result-object v4

    invoke-direct {v1, v4}, Lio/sentry/compose/gestures/ComposeGestureTargetLocator;-><init>(Lio/sentry/ILogger;)V

    invoke-virtual {v3, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_d
    invoke-virtual {p0, v3}, Lio/sentry/v2;->setGestureTargetLocators(Ljava/util/List;)V

    :cond_e
    invoke-virtual {p0}, Lio/sentry/v2;->getViewHierarchyExporters()Ljava/util/List;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/List;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_f

    if-eqz v2, :cond_f

    const-string v1, "io.sentry.compose.viewhierarchy.ComposeViewHierarchyExporter"

    invoke-static {p0, v1}, Lio/sentry/hints/i;->d(Lio/sentry/v2;Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_f

    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1, v10}, Ljava/util/ArrayList;-><init>(I)V

    new-instance v2, Lio/sentry/compose/viewhierarchy/ComposeViewHierarchyExporter;

    invoke-virtual {p0}, Lio/sentry/v2;->getLogger()Lio/sentry/ILogger;

    move-result-object v3

    invoke-direct {v2, v3}, Lio/sentry/compose/viewhierarchy/ComposeViewHierarchyExporter;-><init>(Lio/sentry/ILogger;)V

    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    invoke-virtual {p0, v1}, Lio/sentry/v2;->setViewHierarchyExporters(Ljava/util/List;)V

    :cond_f
    invoke-virtual {p0}, Lio/sentry/v2;->getThreadChecker()Lio/sentry/util/thread/a;

    move-result-object v1

    instance-of v1, v1, Lio/sentry/util/thread/b;

    if-eqz v1, :cond_10

    sget-object v1, Lio/sentry/android/core/internal/util/d;->a:Lio/sentry/android/core/internal/util/d;

    invoke-virtual {p0, v1}, Lio/sentry/v2;->setThreadChecker(Lio/sentry/util/thread/a;)V

    :cond_10
    invoke-virtual {p0}, Lio/sentry/v2;->getSocketTagger()Lio/sentry/f0;

    move-result-object v1

    instance-of v1, v1, Lio/sentry/T0;

    if-eqz v1, :cond_11

    sget-object v1, Lio/sentry/android/core/q;->b:Lio/sentry/android/core/q;

    invoke-virtual {p0, v1}, Lio/sentry/v2;->setSocketTagger(Lio/sentry/f0;)V

    :cond_11
    invoke-virtual {p0}, Lio/sentry/v2;->getPerformanceCollectors()Ljava/util/List;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/List;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_12

    new-instance v1, Lio/sentry/android/core/k;

    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    invoke-virtual {p0, v1}, Lio/sentry/v2;->addPerformanceCollector(Lio/sentry/U;)V

    new-instance v1, Lio/sentry/android/core/h;

    invoke-virtual {p0}, Lio/sentry/v2;->getLogger()Lio/sentry/ILogger;

    move-result-object v2

    invoke-direct {v1, v2}, Lio/sentry/android/core/h;-><init>(Lio/sentry/ILogger;)V

    invoke-virtual {p0, v1}, Lio/sentry/v2;->addPerformanceCollector(Lio/sentry/U;)V

    invoke-virtual {p0}, Lio/sentry/android/core/SentryAndroidOptions;->isEnablePerformanceV2()Z

    move-result v1

    if-eqz v1, :cond_12

    new-instance v1, Lio/sentry/android/core/f0;

    invoke-virtual {p0}, Lio/sentry/android/core/SentryAndroidOptions;->getFrameMetricsCollector()Lio/sentry/android/core/internal/util/o;

    move-result-object v2

    invoke-static {v11, v2}, Lio/sentry/config/a;->D(Ljava/lang/String;Ljava/lang/Object;)V

    invoke-direct {v1, p0, v2}, Lio/sentry/android/core/f0;-><init>(Lio/sentry/android/core/SentryAndroidOptions;Lio/sentry/android/core/internal/util/o;)V

    invoke-virtual {p0, v1}, Lio/sentry/v2;->addPerformanceCollector(Lio/sentry/U;)V

    :cond_12
    invoke-virtual {p0}, Lio/sentry/v2;->getCompositePerformanceCollector()Lio/sentry/m;

    move-result-object v1

    instance-of v1, v1, Lio/sentry/I0;

    if-eqz v1, :cond_13

    new-instance v1, Lio/sentry/q;

    invoke-direct {v1, p0}, Lio/sentry/q;-><init>(Lio/sentry/android/core/SentryAndroidOptions;)V

    invoke-virtual {p0, v1}, Lio/sentry/v2;->setCompositePerformanceCollector(Lio/sentry/m;)V

    :cond_13
    return-void

    :catchall_0
    move-exception v0

    move-object v1, v0

    :try_start_1
    invoke-virtual {v4}, Lio/sentry/r;->close()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    goto :goto_2

    :catchall_1
    move-exception v0

    invoke-virtual {v1, v0}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_2
    throw v1
.end method

.method public static b(Landroid/content/Context;Lio/sentry/android/core/SentryAndroidOptions;Lio/sentry/android/core/I;Lio/sentry/hints/i;LFu;ZZZ)V
    .locals 6

    new-instance v0, Lio/sentry/util/d;

    new-instance v1, Lio/sentry/android/core/l;

    invoke-direct {v1, p1}, Lio/sentry/android/core/l;-><init>(Lio/sentry/android/core/SentryAndroidOptions;)V

    invoke-direct {v0, v1}, Lio/sentry/util/d;-><init>(Lio/sentry/util/c;)V

    new-instance v1, Lio/sentry/android/core/SendCachedEnvelopeIntegration;

    new-instance v2, Lio/sentry/x1;

    new-instance v3, Lio/sentry/android/core/l;

    invoke-direct {v3, p1}, Lio/sentry/android/core/l;-><init>(Lio/sentry/android/core/SentryAndroidOptions;)V

    const/4 v4, 0x0

    invoke-direct {v2, v3, v4}, Lio/sentry/x1;-><init>(Lio/sentry/android/core/l;I)V

    invoke-direct {v1, v2, v0}, Lio/sentry/android/core/SendCachedEnvelopeIntegration;-><init>(Lio/sentry/x1;Lio/sentry/util/d;)V

    invoke-virtual {p1, v1}, Lio/sentry/v2;->addIntegration(Lio/sentry/o0;)V

    const-string v1, "io.sentry.android.ndk.SentryNdk"

    invoke-virtual {p1}, Lio/sentry/v2;->getLogger()Lio/sentry/ILogger;

    move-result-object v2

    invoke-static {v1, v2}, Lio/sentry/hints/i;->h(Ljava/lang/String;Lio/sentry/ILogger;)Ljava/lang/Class;

    move-result-object v1

    new-instance v2, Lio/sentry/android/core/NdkIntegration;

    invoke-direct {v2, v1}, Lio/sentry/android/core/NdkIntegration;-><init>(Ljava/lang/Class;)V

    invoke-virtual {p1, v2}, Lio/sentry/v2;->addIntegration(Lio/sentry/o0;)V

    new-instance v1, Lio/sentry/android/core/EnvelopeFileObserverIntegration$OutboxEnvelopeFileObserverIntegration;

    const/4 v2, 0x0

    invoke-direct {v1, v2}, Lio/sentry/android/core/EnvelopeFileObserverIntegration$OutboxEnvelopeFileObserverIntegration;-><init>(I)V

    invoke-virtual {p1, v1}, Lio/sentry/v2;->addIntegration(Lio/sentry/o0;)V

    new-instance v1, Lio/sentry/android/core/SendCachedEnvelopeIntegration;

    new-instance v3, Lio/sentry/x1;

    new-instance v4, Lio/sentry/android/core/l;

    invoke-direct {v4, p1}, Lio/sentry/android/core/l;-><init>(Lio/sentry/android/core/SentryAndroidOptions;)V

    const/4 v5, 0x1

    invoke-direct {v3, v4, v5}, Lio/sentry/x1;-><init>(Lio/sentry/android/core/l;I)V

    invoke-direct {v1, v3, v0}, Lio/sentry/android/core/SendCachedEnvelopeIntegration;-><init>(Lio/sentry/x1;Lio/sentry/util/d;)V

    invoke-virtual {p1, v1}, Lio/sentry/v2;->addIntegration(Lio/sentry/o0;)V

    new-instance v0, Lio/sentry/android/core/AppLifecycleIntegration;

    invoke-direct {v0}, Lio/sentry/android/core/AppLifecycleIntegration;-><init>()V

    invoke-virtual {p1, v0}, Lio/sentry/v2;->addIntegration(Lio/sentry/o0;)V

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x1e

    if-lt v0, v1, :cond_0

    new-instance v0, Lio/sentry/android/core/AnrV2Integration;

    invoke-direct {v0, p0}, Lio/sentry/android/core/AnrV2Integration;-><init>(Landroid/content/Context;)V

    goto :goto_0

    :cond_0
    new-instance v0, Lio/sentry/android/core/AnrIntegration;

    invoke-direct {v0, p0}, Lio/sentry/android/core/AnrIntegration;-><init>(Landroid/content/Context;)V

    :goto_0
    invoke-virtual {p1, v0}, Lio/sentry/v2;->addIntegration(Lio/sentry/o0;)V

    instance-of v0, p0, Landroid/app/Application;

    if-eqz v0, :cond_1

    new-instance v0, Lio/sentry/android/core/ActivityLifecycleIntegration;

    move-object v1, p0

    check-cast v1, Landroid/app/Application;

    invoke-direct {v0, v1, p2, p4}, Lio/sentry/android/core/ActivityLifecycleIntegration;-><init>(Landroid/app/Application;Lio/sentry/android/core/I;LFu;)V

    invoke-virtual {p1, v0}, Lio/sentry/v2;->addIntegration(Lio/sentry/o0;)V

    new-instance p4, Lio/sentry/android/core/ActivityBreadcrumbsIntegration;

    invoke-direct {p4, v1}, Lio/sentry/android/core/ActivityBreadcrumbsIntegration;-><init>(Landroid/app/Application;)V

    invoke-virtual {p1, p4}, Lio/sentry/v2;->addIntegration(Lio/sentry/o0;)V

    new-instance p4, Lio/sentry/android/core/UserInteractionIntegration;

    invoke-direct {p4, v1, p3}, Lio/sentry/android/core/UserInteractionIntegration;-><init>(Landroid/app/Application;Lio/sentry/hints/i;)V

    invoke-virtual {p1, p4}, Lio/sentry/v2;->addIntegration(Lio/sentry/o0;)V

    if-eqz p5, :cond_2

    new-instance p3, Lio/sentry/android/fragment/FragmentLifecycleIntegration;

    const/4 p4, 0x1

    invoke-direct {p3, v1, p4, p4}, Lio/sentry/android/fragment/FragmentLifecycleIntegration;-><init>(Landroid/app/Application;ZZ)V

    invoke-virtual {p1, p3}, Lio/sentry/v2;->addIntegration(Lio/sentry/o0;)V

    goto :goto_1

    :cond_1
    invoke-virtual {p1}, Lio/sentry/v2;->getLogger()Lio/sentry/ILogger;

    move-result-object p3

    sget-object p4, Lio/sentry/a2;->WARNING:Lio/sentry/a2;

    const-string p5, "ActivityLifecycle, FragmentLifecycle and UserInteraction Integrations need an Application class to be installed."

    new-array v0, v2, [Ljava/lang/Object;

    invoke-interface {p3, p4, p5, v0}, Lio/sentry/ILogger;->e(Lio/sentry/a2;Ljava/lang/String;[Ljava/lang/Object;)V

    :cond_2
    :goto_1
    if-eqz p6, :cond_3

    new-instance p3, Lio/sentry/android/timber/SentryTimberIntegration;

    invoke-direct {p3}, Lio/sentry/android/timber/SentryTimberIntegration;-><init>()V

    invoke-virtual {p1, p3}, Lio/sentry/v2;->addIntegration(Lio/sentry/o0;)V

    :cond_3
    new-instance p3, Lio/sentry/android/core/AppComponentsBreadcrumbsIntegration;

    invoke-direct {p3, p0}, Lio/sentry/android/core/AppComponentsBreadcrumbsIntegration;-><init>(Landroid/content/Context;)V

    invoke-virtual {p1, p3}, Lio/sentry/v2;->addIntegration(Lio/sentry/o0;)V

    new-instance p3, Lio/sentry/android/core/SystemEventsBreadcrumbsIntegration;

    invoke-direct {p3, p0}, Lio/sentry/android/core/SystemEventsBreadcrumbsIntegration;-><init>(Landroid/content/Context;)V

    invoke-virtual {p1, p3}, Lio/sentry/v2;->addIntegration(Lio/sentry/o0;)V

    new-instance p3, Lio/sentry/android/core/NetworkBreadcrumbsIntegration;

    invoke-direct {p3, p0, p2}, Lio/sentry/android/core/NetworkBreadcrumbsIntegration;-><init>(Landroid/content/Context;Lio/sentry/android/core/I;)V

    invoke-virtual {p1, p3}, Lio/sentry/v2;->addIntegration(Lio/sentry/o0;)V

    if-eqz p7, :cond_4

    new-instance p2, Lio/sentry/android/replay/ReplayIntegration;

    invoke-direct {p2, p0}, Lio/sentry/android/replay/ReplayIntegration;-><init>(Landroid/content/Context;)V

    new-instance p0, Lio/sentry/android/replay/b;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p0, p2, Lio/sentry/android/replay/ReplayIntegration;->m:Lio/sentry/j1;

    invoke-virtual {p1, p2}, Lio/sentry/v2;->addIntegration(Lio/sentry/o0;)V

    invoke-virtual {p1, p2}, Lio/sentry/v2;->setReplayController(Lio/sentry/k1;)V

    :cond_4
    invoke-virtual {p1}, Lio/sentry/v2;->getFeedbackOptions()Lio/sentry/V1;

    move-result-object p0

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    return-void
.end method
