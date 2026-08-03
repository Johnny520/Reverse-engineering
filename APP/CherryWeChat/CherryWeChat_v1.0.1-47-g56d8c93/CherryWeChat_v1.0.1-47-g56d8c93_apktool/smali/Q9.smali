.class public final synthetic LQ9;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements LUz;
.implements LN6;
.implements Lio/sentry/t0;
.implements Lio/sentry/p1;
.implements Lio/sentry/s1;
.implements Lio/sentry/n1;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Ljava/lang/Object;

.field public final synthetic c:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(ILjava/lang/Object;Ljava/lang/Object;)V
    .locals 0

    .line 1
    iput p1, p0, LQ9;->a:I

    iput-object p2, p0, LQ9;->b:Ljava/lang/Object;

    iput-object p3, p0, LQ9;->c:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lio/sentry/android/core/q;Landroid/content/Context;Lio/sentry/android/core/T;)V
    .locals 0

    .line 2
    const/16 p3, 0x8

    iput p3, p0, LQ9;->a:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LQ9;->b:Ljava/lang/Object;

    iput-object p2, p0, LQ9;->c:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public a()V
    .locals 7

    iget v0, p0, LQ9;->a:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, LQ9;->b:Ljava/lang/Object;

    check-cast v0, Lha;

    iget-object v1, p0, LQ9;->c:Ljava/lang/Object;

    check-cast v1, Landroid/app/Activity;

    const/4 v2, 0x1

    invoke-virtual {v0, v1, v2}, Lha;->f(Landroid/app/Activity;Z)V

    return-void

    :pswitch_0
    iget-object v0, p0, LQ9;->b:Ljava/lang/Object;

    check-cast v0, Lha;

    iget-object v1, p0, LQ9;->c:Ljava/lang/Object;

    check-cast v1, Landroid/app/Activity;

    sget-object v2, LY4;->a:LY4;

    new-instance v3, LR9;

    const/4 v4, 0x0

    const/4 v5, 0x1

    invoke-direct {v3, v0, v5, v1, v4}, LR9;-><init>(Lha;ZLandroid/app/Activity;I)V

    new-instance v4, LR9;

    const/4 v6, 0x1

    invoke-direct {v4, v0, v5, v1, v6}, LR9;-><init>(Lha;ZLandroid/app/Activity;I)V

    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {v1, v3, v4, v5}, LY4;->a(Landroid/content/Context;Lfj;Lfj;Z)V

    return-void

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public b(Lio/sentry/X;)V
    .locals 3

    iget v0, p0, LQ9;->a:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, LQ9;->b:Ljava/lang/Object;

    check-cast v0, Lio/sentry/android/core/internal/gestures/f;

    iget-object v1, p0, LQ9;->c:Ljava/lang/Object;

    check-cast v1, Lio/sentry/i0;

    new-instance v2, Lio/sentry/D1;

    invoke-direct {v2, v0, p1, v1}, Lio/sentry/D1;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-interface {p1, v2}, Lio/sentry/X;->u(Lio/sentry/p1;)V

    return-void

    :pswitch_0
    iget-object v0, p0, LQ9;->b:Ljava/lang/Object;

    check-cast v0, Lio/sentry/android/core/ActivityLifecycleIntegration;

    iget-object v1, p0, LQ9;->c:Ljava/lang/Object;

    check-cast v1, Lio/sentry/i0;

    new-instance v2, Lio/sentry/android/core/e;

    invoke-direct {v2, v0, p1, v1}, Lio/sentry/android/core/e;-><init>(Lio/sentry/android/core/ActivityLifecycleIntegration;Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-interface {p1, v2}, Lio/sentry/X;->u(Lio/sentry/p1;)V

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x6
        :pswitch_0
    .end packed-switch
.end method

.method public c(Lio/sentry/i0;)V
    .locals 2

    iget v0, p0, LQ9;->a:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, LQ9;->b:Ljava/lang/Object;

    check-cast v0, Lio/sentry/android/core/internal/gestures/f;

    iget-object v1, p0, LQ9;->c:Ljava/lang/Object;

    check-cast v1, Lio/sentry/X;

    iget-object v0, v0, Lio/sentry/android/core/internal/gestures/f;->e:Lio/sentry/i0;

    if-ne p1, v0, :cond_0

    invoke-interface {v1}, Lio/sentry/X;->o()V

    :cond_0
    return-void

    :pswitch_0
    iget-object v0, p0, LQ9;->b:Ljava/lang/Object;

    check-cast v0, Lio/sentry/i0;

    iget-object v1, p0, LQ9;->c:Ljava/lang/Object;

    check-cast v1, Lio/sentry/X;

    if-ne p1, v0, :cond_1

    invoke-interface {v1}, Lio/sentry/X;->o()V

    :cond_1
    return-void

    :pswitch_1
    iget-object v0, p0, LQ9;->b:Ljava/lang/Object;

    check-cast v0, Lio/sentry/D2;

    iget-object v1, p0, LQ9;->c:Ljava/lang/Object;

    check-cast v1, Lio/sentry/X;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    if-ne p1, v0, :cond_2

    invoke-interface {v1}, Lio/sentry/X;->o()V

    :cond_2
    return-void

    :pswitch_data_0
    .packed-switch 0x4
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public d()Ljava/lang/Object;
    .locals 4

    iget-object v0, p0, LQ9;->b:Ljava/lang/Object;

    check-cast v0, Lio/sentry/z0;

    iget-object v1, p0, LQ9;->c:Ljava/lang/Object;

    check-cast v1, Lio/sentry/A0;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    :try_start_0
    iget-object v0, v1, Lio/sentry/A0;->b:Ljava/lang/Object;

    check-cast v0, Lio/sentry/vendor/gson/stream/a;

    invoke-virtual {v0}, Lio/sentry/vendor/gson/stream/a;->u()I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-object v0

    :catch_0
    :try_start_1
    iget-object v0, v1, Lio/sentry/A0;->b:Ljava/lang/Object;

    check-cast v0, Lio/sentry/vendor/gson/stream/a;

    invoke-virtual {v0}, Lio/sentry/vendor/gson/stream/a;->t()D

    move-result-wide v2

    invoke-static {v2, v3}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v0
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    goto :goto_0

    :catch_1
    iget-object v0, v1, Lio/sentry/A0;->b:Ljava/lang/Object;

    check-cast v0, Lio/sentry/vendor/gson/stream/a;

    invoke-virtual {v0}, Lio/sentry/vendor/gson/stream/a;->v()J

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    :goto_0
    return-object v0
.end method

.method public e(Lio/sentry/l;)V
    .locals 4

    iget-object v0, p0, LQ9;->b:Ljava/lang/Object;

    check-cast v0, Lio/sentry/X;

    iget-object v1, p0, LQ9;->c:Ljava/lang/Object;

    check-cast v1, Lio/sentry/v2;

    iget-object p1, p1, Lio/sentry/l;->d:Ljava/lang/Object;

    check-cast p1, Lio/sentry/c;

    iget-boolean v2, p1, Lio/sentry/c;->e:Z

    if-eqz v2, :cond_2

    invoke-interface {v0}, Lio/sentry/X;->E()Lio/sentry/l;

    move-result-object v2

    invoke-interface {v0}, Lio/sentry/X;->D()Lio/sentry/protocol/t;

    move-result-object v0

    iget-object v2, v2, Lio/sentry/l;->b:Ljava/lang/Object;

    check-cast v2, Lio/sentry/protocol/t;

    invoke-virtual {v2}, Lio/sentry/protocol/t;->toString()Ljava/lang/String;

    move-result-object v2

    const-string v3, "sentry-trace_id"

    invoke-virtual {p1, v3, v2}, Lio/sentry/c;->b(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v1}, Lio/sentry/v2;->retrieveParsedDsn()Lio/sentry/z;

    move-result-object v2

    iget-object v2, v2, Lio/sentry/z;->b:Ljava/lang/String;

    const-string v3, "sentry-public_key"

    invoke-virtual {p1, v3, v2}, Lio/sentry/c;->b(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v1}, Lio/sentry/v2;->getRelease()Ljava/lang/String;

    move-result-object v2

    const-string v3, "sentry-release"

    invoke-virtual {p1, v3, v2}, Lio/sentry/c;->b(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v1}, Lio/sentry/v2;->getEnvironment()Ljava/lang/String;

    move-result-object v1

    const-string v2, "sentry-environment"

    invoke-virtual {p1, v2, v1}, Lio/sentry/c;->b(Ljava/lang/String;Ljava/lang/String;)V

    sget-object v1, Lio/sentry/protocol/t;->b:Lio/sentry/protocol/t;

    invoke-virtual {v1, v0}, Lio/sentry/protocol/t;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_0

    invoke-virtual {v0}, Lio/sentry/protocol/t;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "sentry-replay_id"

    invoke-virtual {p1, v1, v0}, Lio/sentry/c;->b(Ljava/lang/String;Ljava/lang/String;)V

    :cond_0
    const-string v0, "sentry-transaction"

    const/4 v1, 0x0

    invoke-virtual {p1, v0, v1}, Lio/sentry/c;->b(Ljava/lang/String;Ljava/lang/String;)V

    iget-boolean v0, p1, Lio/sentry/c;->e:Z

    if-eqz v0, :cond_1

    iput-object v1, p1, Lio/sentry/c;->c:Ljava/lang/Double;

    :cond_1
    const-string v0, "sentry-sampled"

    invoke-virtual {p1, v0, v1}, Lio/sentry/c;->b(Ljava/lang/String;Ljava/lang/String;)V

    const/4 v0, 0x0

    iput-boolean v0, p1, Lio/sentry/c;->e:Z

    :cond_2
    return-void
.end method

.method public f(Lio/sentry/v2;)V
    .locals 22

    move-object/from16 v1, p0

    iget-object v0, v1, LQ9;->b:Ljava/lang/Object;

    check-cast v0, Lio/sentry/android/core/q;

    iget-object v2, v1, LQ9;->c:Ljava/lang/Object;

    move-object v3, v2

    check-cast v3, Landroid/content/Context;

    move-object/from16 v4, p1

    check-cast v4, Lio/sentry/android/core/SentryAndroidOptions;

    const-string v2, "timber.log.Timber"

    invoke-static {v4, v2}, Lio/sentry/hints/i;->d(Lio/sentry/v2;Ljava/lang/String;)Z

    move-result v2

    const-string v5, "androidx.fragment.app.FragmentManager$FragmentLifecycleCallbacks"

    invoke-static {v4, v5}, Lio/sentry/hints/i;->d(Lio/sentry/v2;Ljava/lang/String;)Z

    move-result v5

    if-eqz v5, :cond_0

    const-string v5, "io.sentry.android.fragment.FragmentLifecycleIntegration"

    invoke-static {v4, v5}, Lio/sentry/hints/i;->d(Lio/sentry/v2;Ljava/lang/String;)Z

    move-result v5

    if-eqz v5, :cond_0

    const/4 v8, 0x1

    goto :goto_0

    :cond_0
    const/4 v8, 0x0

    :goto_0
    if-eqz v2, :cond_1

    const-string v2, "io.sentry.android.timber.SentryTimberIntegration"

    invoke-static {v4, v2}, Lio/sentry/hints/i;->d(Lio/sentry/v2;Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_1

    const/4 v9, 0x1

    goto :goto_1

    :cond_1
    const/4 v9, 0x0

    :goto_1
    const-string v2, "io.sentry.android.replay.ReplayIntegration"

    invoke-static {v4, v2}, Lio/sentry/hints/i;->d(Lio/sentry/v2;Ljava/lang/String;)Z

    move-result v10

    new-instance v5, Lio/sentry/android/core/I;

    invoke-direct {v5, v0}, Lio/sentry/android/core/I;-><init>(Lio/sentry/ILogger;)V

    new-instance v2, Lio/sentry/hints/i;

    invoke-direct {v2}, Ljava/lang/Object;-><init>()V

    new-instance v11, LFu;

    invoke-direct {v11, v4}, LFu;-><init>(Lio/sentry/android/core/SentryAndroidOptions;)V

    invoke-virtual {v3}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v12

    if-eqz v12, :cond_2

    goto :goto_2

    :cond_2
    move-object v12, v3

    :goto_2
    invoke-virtual {v4, v0}, Lio/sentry/v2;->setLogger(Lio/sentry/ILogger;)V

    new-instance v13, Lio/sentry/android/core/q;

    const/4 v14, 0x2

    invoke-direct {v13, v14}, Lio/sentry/android/core/q;-><init>(I)V

    invoke-virtual {v4, v13}, Lio/sentry/v2;->setFatalLogger(Lio/sentry/ILogger;)V

    sget-object v13, Lio/sentry/u1;->CURRENT:Lio/sentry/u1;

    invoke-virtual {v4, v13}, Lio/sentry/v2;->setDefaultScopeType(Lio/sentry/u1;)V

    sget-object v13, Lio/sentry/h2;->OFF:Lio/sentry/h2;

    invoke-virtual {v4, v13}, Lio/sentry/v2;->setOpenTelemetryMode(Lio/sentry/h2;)V

    new-instance v13, Lio/sentry/android/core/c0;

    invoke-direct {v13}, Lio/sentry/android/core/c0;-><init>()V

    invoke-virtual {v4, v13}, Lio/sentry/v2;->setDateProvider(Lio/sentry/I1;)V

    const-wide/16 v13, 0xfa0

    invoke-virtual {v4, v13, v14}, Lio/sentry/v2;->setFlushTimeoutMillis(J)V

    new-instance v13, Lio/sentry/android/core/internal/util/o;

    invoke-direct {v13, v12, v0, v5}, Lio/sentry/android/core/internal/util/o;-><init>(Landroid/content/Context;Lio/sentry/android/core/q;Lio/sentry/android/core/I;)V

    invoke-virtual {v4, v13}, Lio/sentry/android/core/SentryAndroidOptions;->setFrameMetricsCollector(Lio/sentry/android/core/internal/util/o;)V

    const-string v0, ""

    const-string v13, "io.sentry.traces.trace-propagation-targets"

    :try_start_0
    invoke-virtual {v4}, Lio/sentry/v2;->getLogger()Lio/sentry/ILogger;

    sget v14, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v15, 0x21

    if-lt v14, v15, :cond_3

    sget-object v14, Lio/sentry/android/core/H;->d:LBb;

    invoke-virtual {v14, v12}, LBb;->b(Landroid/content/Context;)Ljava/lang/Object;

    move-result-object v14

    check-cast v14, Landroid/content/pm/ApplicationInfo;

    goto :goto_3

    :cond_3
    sget-object v14, Lio/sentry/android/core/H;->e:LBb;

    invoke-virtual {v14, v12}, LBb;->b(Landroid/content/Context;)Ljava/lang/Object;

    move-result-object v14

    check-cast v14, Landroid/content/pm/ApplicationInfo;

    :goto_3
    if-eqz v14, :cond_4

    iget-object v14, v14, Landroid/content/pm/ApplicationInfo;->metaData:Landroid/os/Bundle;

    goto :goto_4

    :cond_4
    const/4 v14, 0x0

    :goto_4
    invoke-virtual {v4}, Lio/sentry/v2;->getLogger()Lio/sentry/ILogger;

    move-result-object v15

    if-eqz v14, :cond_1c

    const-string v7, "io.sentry.debug"

    invoke-virtual {v4}, Lio/sentry/v2;->isDebug()Z

    move-result v6

    invoke-static {v14, v15, v7, v6}, Lio/sentry/android/core/H;->e(Landroid/os/Bundle;Lio/sentry/ILogger;Ljava/lang/String;Z)Z

    move-result v6

    invoke-virtual {v4, v6}, Lio/sentry/v2;->setDebug(Z)V

    invoke-virtual {v4}, Lio/sentry/v2;->isDebug()Z

    move-result v6

    if-eqz v6, :cond_5

    const-string v6, "io.sentry.debug.level"

    invoke-virtual {v4}, Lio/sentry/v2;->getDiagnosticLevel()Lio/sentry/a2;

    move-result-object v7

    invoke-virtual {v7}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object v7

    sget-object v1, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    invoke-virtual {v7, v1}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v7

    invoke-static {v14, v15, v6, v7}, Lio/sentry/android/core/H;->i(Landroid/os/Bundle;Lio/sentry/ILogger;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    if-eqz v6, :cond_5

    invoke-virtual {v6, v1}, Ljava/lang/String;->toUpperCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lio/sentry/a2;->valueOf(Ljava/lang/String;)Lio/sentry/a2;

    move-result-object v1

    invoke-virtual {v4, v1}, Lio/sentry/v2;->setDiagnosticLevel(Lio/sentry/a2;)V

    goto :goto_7

    :catchall_0
    move-exception v0

    move-object/from16 v18, v2

    :goto_5
    move-object/from16 v19, v3

    :goto_6
    move/from16 v20, v8

    move/from16 v21, v9

    goto/16 :goto_13

    :cond_5
    :goto_7
    const-string v1, "io.sentry.anr.enable"

    invoke-virtual {v4}, Lio/sentry/android/core/SentryAndroidOptions;->isAnrEnabled()Z

    move-result v6

    invoke-static {v14, v15, v1, v6}, Lio/sentry/android/core/H;->e(Landroid/os/Bundle;Lio/sentry/ILogger;Ljava/lang/String;Z)Z

    move-result v1

    invoke-virtual {v4, v1}, Lio/sentry/android/core/SentryAndroidOptions;->setAnrEnabled(Z)V

    const-string v1, "io.sentry.auto-session-tracking.enable"

    invoke-virtual {v4}, Lio/sentry/v2;->isEnableAutoSessionTracking()Z

    move-result v6

    invoke-static {v14, v15, v1, v6}, Lio/sentry/android/core/H;->e(Landroid/os/Bundle;Lio/sentry/ILogger;Ljava/lang/String;Z)Z

    move-result v1

    invoke-virtual {v4, v1}, Lio/sentry/v2;->setEnableAutoSessionTracking(Z)V

    invoke-virtual {v4}, Lio/sentry/v2;->getSampleRate()Ljava/lang/Double;

    move-result-object v1

    const-wide/high16 v6, -0x4010000000000000L    # -1.0

    if-nez v1, :cond_6

    const-string v1, "io.sentry.sample-rate"

    invoke-static {v14, v15, v1}, Lio/sentry/android/core/H;->f(Landroid/os/Bundle;Lio/sentry/ILogger;Ljava/lang/String;)D

    move-result-wide v16

    cmpl-double v1, v16, v6

    if-eqz v1, :cond_6

    invoke-static/range {v16 .. v17}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v1

    invoke-virtual {v4, v1}, Lio/sentry/v2;->setSampleRate(Ljava/lang/Double;)V

    :cond_6
    const-string v1, "io.sentry.anr.report-debug"

    move-wide/from16 v16, v6

    invoke-virtual {v4}, Lio/sentry/android/core/SentryAndroidOptions;->isAnrReportInDebug()Z

    move-result v6

    invoke-static {v14, v15, v1, v6}, Lio/sentry/android/core/H;->e(Landroid/os/Bundle;Lio/sentry/ILogger;Ljava/lang/String;Z)Z

    move-result v1

    invoke-virtual {v4, v1}, Lio/sentry/android/core/SentryAndroidOptions;->setAnrReportInDebug(Z)V

    const-string v1, "io.sentry.anr.timeout-interval-millis"

    invoke-virtual {v4}, Lio/sentry/android/core/SentryAndroidOptions;->getAnrTimeoutIntervalMillis()J

    move-result-wide v6

    invoke-static {v14, v15, v1, v6, v7}, Lio/sentry/android/core/H;->h(Landroid/os/Bundle;Lio/sentry/ILogger;Ljava/lang/String;J)J

    move-result-wide v6

    invoke-virtual {v4, v6, v7}, Lio/sentry/android/core/SentryAndroidOptions;->setAnrTimeoutIntervalMillis(J)V

    const-string v1, "io.sentry.anr.attach-thread-dumps"

    invoke-virtual {v4}, Lio/sentry/android/core/SentryAndroidOptions;->isAttachAnrThreadDump()Z

    move-result v6

    invoke-static {v14, v15, v1, v6}, Lio/sentry/android/core/H;->e(Landroid/os/Bundle;Lio/sentry/ILogger;Ljava/lang/String;Z)Z

    move-result v1

    invoke-virtual {v4, v1}, Lio/sentry/android/core/SentryAndroidOptions;->setAttachAnrThreadDump(Z)V

    const-string v1, "io.sentry.dsn"

    invoke-virtual {v4}, Lio/sentry/v2;->getDsn()Ljava/lang/String;

    move-result-object v6

    invoke-static {v14, v15, v1, v6}, Lio/sentry/android/core/H;->i(Landroid/os/Bundle;Lio/sentry/ILogger;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    const-string v6, "io.sentry.enabled"

    invoke-virtual {v4}, Lio/sentry/v2;->isEnabled()Z

    move-result v7

    invoke-static {v14, v15, v6, v7}, Lio/sentry/android/core/H;->e(Landroid/os/Bundle;Lio/sentry/ILogger;Ljava/lang/String;Z)Z

    move-result v6

    if-eqz v6, :cond_7

    if-eqz v1, :cond_8

    invoke-virtual {v1}, Ljava/lang/String;->isEmpty()Z

    move-result v7

    if-eqz v7, :cond_8

    :cond_7
    move-object/from16 v18, v2

    move-object/from16 v19, v3

    move/from16 v20, v8

    move/from16 v21, v9

    goto :goto_8

    :cond_8
    if-nez v1, :cond_9

    invoke-virtual {v4}, Lio/sentry/v2;->getLogger()Lio/sentry/ILogger;

    move-result-object v7
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-object/from16 v18, v2

    :try_start_1
    sget-object v2, Lio/sentry/a2;->FATAL:Lio/sentry/a2;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_3

    move-object/from16 v19, v3

    :try_start_2
    const-string v3, "DSN is required. Use empty string to disable SDK."
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    move/from16 v20, v8

    move/from16 v21, v9

    const/4 v8, 0x0

    :try_start_3
    new-array v9, v8, [Ljava/lang/Object;

    invoke-interface {v7, v2, v3, v9}, Lio/sentry/ILogger;->e(Lio/sentry/a2;Ljava/lang/String;[Ljava/lang/Object;)V

    goto :goto_9

    :catchall_1
    move-exception v0

    goto/16 :goto_13

    :catchall_2
    move-exception v0

    goto/16 :goto_6

    :catchall_3
    move-exception v0

    goto/16 :goto_5

    :cond_9
    move-object/from16 v18, v2

    move-object/from16 v19, v3

    move/from16 v20, v8

    move/from16 v21, v9

    goto :goto_9

    :goto_8
    invoke-virtual {v4}, Lio/sentry/v2;->getLogger()Lio/sentry/ILogger;

    move-result-object v2

    sget-object v3, Lio/sentry/a2;->DEBUG:Lio/sentry/a2;

    const-string v7, "Sentry enabled flag set to false or DSN is empty: disabling sentry-android"

    const/4 v8, 0x0

    new-array v9, v8, [Ljava/lang/Object;

    invoke-interface {v2, v3, v7, v9}, Lio/sentry/ILogger;->e(Lio/sentry/a2;Ljava/lang/String;[Ljava/lang/Object;)V

    :goto_9
    invoke-virtual {v4, v6}, Lio/sentry/v2;->setEnabled(Z)V

    invoke-virtual {v4, v1}, Lio/sentry/v2;->setDsn(Ljava/lang/String;)V

    const-string v1, "io.sentry.ndk.enable"

    invoke-virtual {v4}, Lio/sentry/android/core/SentryAndroidOptions;->isEnableNdk()Z

    move-result v2

    invoke-static {v14, v15, v1, v2}, Lio/sentry/android/core/H;->e(Landroid/os/Bundle;Lio/sentry/ILogger;Ljava/lang/String;Z)Z

    move-result v1

    invoke-virtual {v4, v1}, Lio/sentry/android/core/SentryAndroidOptions;->setEnableNdk(Z)V

    const-string v1, "io.sentry.ndk.scope-sync.enable"

    invoke-virtual {v4}, Lio/sentry/android/core/SentryAndroidOptions;->isEnableScopeSync()Z

    move-result v2

    invoke-static {v14, v15, v1, v2}, Lio/sentry/android/core/H;->e(Landroid/os/Bundle;Lio/sentry/ILogger;Ljava/lang/String;Z)Z

    move-result v1

    invoke-virtual {v4, v1}, Lio/sentry/android/core/SentryAndroidOptions;->setEnableScopeSync(Z)V

    const-string v1, "io.sentry.release"

    invoke-virtual {v4}, Lio/sentry/v2;->getRelease()Ljava/lang/String;

    move-result-object v2

    invoke-static {v14, v15, v1, v2}, Lio/sentry/android/core/H;->i(Landroid/os/Bundle;Lio/sentry/ILogger;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v4, v1}, Lio/sentry/v2;->setRelease(Ljava/lang/String;)V

    const-string v1, "io.sentry.environment"

    invoke-virtual {v4}, Lio/sentry/v2;->getEnvironment()Ljava/lang/String;

    move-result-object v2

    invoke-static {v14, v15, v1, v2}, Lio/sentry/android/core/H;->i(Landroid/os/Bundle;Lio/sentry/ILogger;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v4, v1}, Lio/sentry/v2;->setEnvironment(Ljava/lang/String;)V

    const-string v1, "io.sentry.session-tracking.timeout-interval-millis"

    invoke-virtual {v4}, Lio/sentry/v2;->getSessionTrackingIntervalMillis()J

    move-result-wide v2

    invoke-static {v14, v15, v1, v2, v3}, Lio/sentry/android/core/H;->h(Landroid/os/Bundle;Lio/sentry/ILogger;Ljava/lang/String;J)J

    move-result-wide v1

    invoke-virtual {v4, v1, v2}, Lio/sentry/v2;->setSessionTrackingIntervalMillis(J)V

    const-string v1, "io.sentry.max-breadcrumbs"

    invoke-virtual {v4}, Lio/sentry/v2;->getMaxBreadcrumbs()I

    move-result v2

    int-to-long v2, v2

    invoke-static {v14, v15, v1, v2, v3}, Lio/sentry/android/core/H;->h(Landroid/os/Bundle;Lio/sentry/ILogger;Ljava/lang/String;J)J

    move-result-wide v1

    long-to-int v1, v1

    invoke-virtual {v4, v1}, Lio/sentry/v2;->setMaxBreadcrumbs(I)V

    const-string v1, "io.sentry.breadcrumbs.activity-lifecycle"

    invoke-virtual {v4}, Lio/sentry/android/core/SentryAndroidOptions;->isEnableActivityLifecycleBreadcrumbs()Z

    move-result v2

    invoke-static {v14, v15, v1, v2}, Lio/sentry/android/core/H;->e(Landroid/os/Bundle;Lio/sentry/ILogger;Ljava/lang/String;Z)Z

    move-result v1

    invoke-virtual {v4, v1}, Lio/sentry/android/core/SentryAndroidOptions;->setEnableActivityLifecycleBreadcrumbs(Z)V

    const-string v1, "io.sentry.breadcrumbs.app-lifecycle"

    invoke-virtual {v4}, Lio/sentry/android/core/SentryAndroidOptions;->isEnableAppLifecycleBreadcrumbs()Z

    move-result v2

    invoke-static {v14, v15, v1, v2}, Lio/sentry/android/core/H;->e(Landroid/os/Bundle;Lio/sentry/ILogger;Ljava/lang/String;Z)Z

    move-result v1

    invoke-virtual {v4, v1}, Lio/sentry/android/core/SentryAndroidOptions;->setEnableAppLifecycleBreadcrumbs(Z)V

    const-string v1, "io.sentry.breadcrumbs.system-events"

    invoke-virtual {v4}, Lio/sentry/android/core/SentryAndroidOptions;->isEnableSystemEventBreadcrumbs()Z

    move-result v2

    invoke-static {v14, v15, v1, v2}, Lio/sentry/android/core/H;->e(Landroid/os/Bundle;Lio/sentry/ILogger;Ljava/lang/String;Z)Z

    move-result v1

    invoke-virtual {v4, v1}, Lio/sentry/android/core/SentryAndroidOptions;->setEnableSystemEventBreadcrumbs(Z)V

    const-string v1, "io.sentry.breadcrumbs.app-components"

    invoke-virtual {v4}, Lio/sentry/android/core/SentryAndroidOptions;->isEnableAppComponentBreadcrumbs()Z

    move-result v2

    invoke-static {v14, v15, v1, v2}, Lio/sentry/android/core/H;->e(Landroid/os/Bundle;Lio/sentry/ILogger;Ljava/lang/String;Z)Z

    move-result v1

    invoke-virtual {v4, v1}, Lio/sentry/android/core/SentryAndroidOptions;->setEnableAppComponentBreadcrumbs(Z)V

    const-string v1, "io.sentry.breadcrumbs.user-interaction"

    invoke-virtual {v4}, Lio/sentry/v2;->isEnableUserInteractionBreadcrumbs()Z

    move-result v2

    invoke-static {v14, v15, v1, v2}, Lio/sentry/android/core/H;->e(Landroid/os/Bundle;Lio/sentry/ILogger;Ljava/lang/String;Z)Z

    move-result v1

    invoke-virtual {v4, v1}, Lio/sentry/v2;->setEnableUserInteractionBreadcrumbs(Z)V

    const-string v1, "io.sentry.breadcrumbs.network-events"

    invoke-virtual {v4}, Lio/sentry/android/core/SentryAndroidOptions;->isEnableNetworkEventBreadcrumbs()Z

    move-result v2

    invoke-static {v14, v15, v1, v2}, Lio/sentry/android/core/H;->e(Landroid/os/Bundle;Lio/sentry/ILogger;Ljava/lang/String;Z)Z

    move-result v1

    invoke-virtual {v4, v1}, Lio/sentry/android/core/SentryAndroidOptions;->setEnableNetworkEventBreadcrumbs(Z)V

    const-string v1, "io.sentry.uncaught-exception-handler.enable"

    invoke-virtual {v4}, Lio/sentry/v2;->isEnableUncaughtExceptionHandler()Z

    move-result v2

    invoke-static {v14, v15, v1, v2}, Lio/sentry/android/core/H;->e(Landroid/os/Bundle;Lio/sentry/ILogger;Ljava/lang/String;Z)Z

    move-result v1

    invoke-virtual {v4, v1}, Lio/sentry/v2;->setEnableUncaughtExceptionHandler(Z)V

    const-string v1, "io.sentry.attach-threads"

    invoke-virtual {v4}, Lio/sentry/v2;->isAttachThreads()Z

    move-result v2

    invoke-static {v14, v15, v1, v2}, Lio/sentry/android/core/H;->e(Landroid/os/Bundle;Lio/sentry/ILogger;Ljava/lang/String;Z)Z

    move-result v1

    invoke-virtual {v4, v1}, Lio/sentry/v2;->setAttachThreads(Z)V

    const-string v1, "io.sentry.attach-screenshot"

    invoke-virtual {v4}, Lio/sentry/android/core/SentryAndroidOptions;->isAttachScreenshot()Z

    move-result v2

    invoke-static {v14, v15, v1, v2}, Lio/sentry/android/core/H;->e(Landroid/os/Bundle;Lio/sentry/ILogger;Ljava/lang/String;Z)Z

    move-result v1

    invoke-virtual {v4, v1}, Lio/sentry/android/core/SentryAndroidOptions;->setAttachScreenshot(Z)V

    const-string v1, "io.sentry.attach-view-hierarchy"

    invoke-virtual {v4}, Lio/sentry/android/core/SentryAndroidOptions;->isAttachViewHierarchy()Z

    move-result v2

    invoke-static {v14, v15, v1, v2}, Lio/sentry/android/core/H;->e(Landroid/os/Bundle;Lio/sentry/ILogger;Ljava/lang/String;Z)Z

    move-result v1

    invoke-virtual {v4, v1}, Lio/sentry/android/core/SentryAndroidOptions;->setAttachViewHierarchy(Z)V

    const-string v1, "io.sentry.send-client-reports"

    invoke-virtual {v4}, Lio/sentry/v2;->isSendClientReports()Z

    move-result v2

    invoke-static {v14, v15, v1, v2}, Lio/sentry/android/core/H;->e(Landroid/os/Bundle;Lio/sentry/ILogger;Ljava/lang/String;Z)Z

    move-result v1

    invoke-virtual {v4, v1}, Lio/sentry/v2;->setSendClientReports(Z)V

    const-string v1, "io.sentry.auto-init"

    const/4 v2, 0x1

    invoke-static {v14, v15, v1, v2}, Lio/sentry/android/core/H;->e(Landroid/os/Bundle;Lio/sentry/ILogger;Ljava/lang/String;Z)Z

    move-result v1

    if-eqz v1, :cond_a

    sget-object v1, Lio/sentry/m0;->LOW:Lio/sentry/m0;

    invoke-virtual {v4, v1}, Lio/sentry/v2;->setInitPriority(Lio/sentry/m0;)V

    :cond_a
    const-string v1, "io.sentry.force-init"

    invoke-virtual {v4}, Lio/sentry/v2;->isForceInit()Z

    move-result v2

    invoke-static {v14, v15, v1, v2}, Lio/sentry/android/core/H;->e(Landroid/os/Bundle;Lio/sentry/ILogger;Ljava/lang/String;Z)Z

    move-result v1

    invoke-virtual {v4, v1}, Lio/sentry/v2;->setForceInit(Z)V

    const-string v1, "io.sentry.additional-context"

    invoke-virtual {v4}, Lio/sentry/android/core/SentryAndroidOptions;->isCollectAdditionalContext()Z

    move-result v2

    invoke-static {v14, v15, v1, v2}, Lio/sentry/android/core/H;->e(Landroid/os/Bundle;Lio/sentry/ILogger;Ljava/lang/String;Z)Z

    move-result v1

    invoke-virtual {v4, v1}, Lio/sentry/android/core/SentryAndroidOptions;->setCollectAdditionalContext(Z)V

    invoke-virtual {v4}, Lio/sentry/v2;->getTracesSampleRate()Ljava/lang/Double;

    move-result-object v1

    if-nez v1, :cond_b

    const-string v1, "io.sentry.traces.sample-rate"

    invoke-static {v14, v15, v1}, Lio/sentry/android/core/H;->f(Landroid/os/Bundle;Lio/sentry/ILogger;Ljava/lang/String;)D

    move-result-wide v1

    cmpl-double v3, v1, v16

    if-eqz v3, :cond_b

    invoke-static {v1, v2}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v1

    invoke-virtual {v4, v1}, Lio/sentry/v2;->setTracesSampleRate(Ljava/lang/Double;)V

    :cond_b
    const-string v1, "io.sentry.traces.trace-sampling"

    invoke-virtual {v4}, Lio/sentry/v2;->isTraceSampling()Z

    move-result v2

    invoke-static {v14, v15, v1, v2}, Lio/sentry/android/core/H;->e(Landroid/os/Bundle;Lio/sentry/ILogger;Ljava/lang/String;Z)Z

    move-result v1

    invoke-virtual {v4, v1}, Lio/sentry/v2;->setTraceSampling(Z)V

    const-string v1, "io.sentry.traces.activity.enable"

    invoke-virtual {v4}, Lio/sentry/android/core/SentryAndroidOptions;->isEnableAutoActivityLifecycleTracing()Z

    move-result v2

    invoke-static {v14, v15, v1, v2}, Lio/sentry/android/core/H;->e(Landroid/os/Bundle;Lio/sentry/ILogger;Ljava/lang/String;Z)Z

    move-result v1

    invoke-virtual {v4, v1}, Lio/sentry/android/core/SentryAndroidOptions;->setEnableAutoActivityLifecycleTracing(Z)V

    const-string v1, "io.sentry.traces.activity.auto-finish.enable"

    invoke-virtual {v4}, Lio/sentry/android/core/SentryAndroidOptions;->isEnableActivityLifecycleTracingAutoFinish()Z

    move-result v2

    invoke-static {v14, v15, v1, v2}, Lio/sentry/android/core/H;->e(Landroid/os/Bundle;Lio/sentry/ILogger;Ljava/lang/String;Z)Z

    move-result v1

    invoke-virtual {v4, v1}, Lio/sentry/android/core/SentryAndroidOptions;->setEnableActivityLifecycleTracingAutoFinish(Z)V

    invoke-virtual {v4}, Lio/sentry/v2;->getProfilesSampleRate()Ljava/lang/Double;

    move-result-object v1

    if-nez v1, :cond_c

    const-string v1, "io.sentry.traces.profiling.sample-rate"

    invoke-static {v14, v15, v1}, Lio/sentry/android/core/H;->f(Landroid/os/Bundle;Lio/sentry/ILogger;Ljava/lang/String;)D

    move-result-wide v1

    cmpl-double v3, v1, v16

    if-eqz v3, :cond_c

    invoke-static {v1, v2}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v1

    invoke-virtual {v4, v1}, Lio/sentry/v2;->setProfilesSampleRate(Ljava/lang/Double;)V

    :cond_c
    invoke-virtual {v4}, Lio/sentry/v2;->getProfileSessionSampleRate()Ljava/lang/Double;

    move-result-object v1

    if-nez v1, :cond_d

    const-string v1, "io.sentry.traces.profiling.session-sample-rate"

    invoke-static {v14, v15, v1}, Lio/sentry/android/core/H;->f(Landroid/os/Bundle;Lio/sentry/ILogger;Ljava/lang/String;)D

    move-result-wide v1

    cmpl-double v3, v1, v16

    if-eqz v3, :cond_d

    invoke-static {v1, v2}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v1

    invoke-virtual {v4, v1}, Lio/sentry/v2;->setProfileSessionSampleRate(Ljava/lang/Double;)V

    :cond_d
    const-string v1, "io.sentry.traces.profiling.lifecycle"

    invoke-virtual {v4}, Lio/sentry/v2;->getProfileLifecycle()Lio/sentry/g1;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object v2

    sget-object v3, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    invoke-virtual {v2, v3}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v2

    invoke-static {v14, v15, v1, v2}, Lio/sentry/android/core/H;->i(Landroid/os/Bundle;Lio/sentry/ILogger;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    if-eqz v1, :cond_e

    invoke-virtual {v1, v3}, Ljava/lang/String;->toUpperCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lio/sentry/g1;->valueOf(Ljava/lang/String;)Lio/sentry/g1;

    move-result-object v1

    invoke-virtual {v4, v1}, Lio/sentry/v2;->setProfileLifecycle(Lio/sentry/g1;)V

    :cond_e
    const-string v1, "io.sentry.traces.profiling.start-on-app-start"

    invoke-virtual {v4}, Lio/sentry/v2;->isStartProfilerOnAppStart()Z

    move-result v2

    invoke-static {v14, v15, v1, v2}, Lio/sentry/android/core/H;->e(Landroid/os/Bundle;Lio/sentry/ILogger;Ljava/lang/String;Z)Z

    move-result v1

    invoke-virtual {v4, v1}, Lio/sentry/v2;->setStartProfilerOnAppStart(Z)V

    const-string v1, "io.sentry.traces.user-interaction.enable"

    invoke-virtual {v4}, Lio/sentry/v2;->isEnableUserInteractionTracing()Z

    move-result v2

    invoke-static {v14, v15, v1, v2}, Lio/sentry/android/core/H;->e(Landroid/os/Bundle;Lio/sentry/ILogger;Ljava/lang/String;Z)Z

    move-result v1

    invoke-virtual {v4, v1}, Lio/sentry/v2;->setEnableUserInteractionTracing(Z)V

    const-string v1, "io.sentry.traces.time-to-full-display.enable"

    invoke-virtual {v4}, Lio/sentry/v2;->isEnableTimeToFullDisplayTracing()Z

    move-result v2

    invoke-static {v14, v15, v1, v2}, Lio/sentry/android/core/H;->e(Landroid/os/Bundle;Lio/sentry/ILogger;Ljava/lang/String;Z)Z

    move-result v1

    invoke-virtual {v4, v1}, Lio/sentry/v2;->setEnableTimeToFullDisplayTracing(Z)V

    const-string v1, "io.sentry.traces.idle-timeout"

    const-wide/16 v2, -0x1

    invoke-static {v14, v15, v1, v2, v3}, Lio/sentry/android/core/H;->h(Landroid/os/Bundle;Lio/sentry/ILogger;Ljava/lang/String;J)J

    move-result-wide v6

    cmp-long v1, v6, v2

    if-eqz v1, :cond_f

    invoke-static {v6, v7}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    invoke-virtual {v4, v1}, Lio/sentry/v2;->setIdleTimeout(Ljava/lang/Long;)V

    :cond_f
    invoke-static {v14, v15, v13}, Lio/sentry/android/core/H;->g(Landroid/os/Bundle;Lio/sentry/ILogger;Ljava/lang/String;)Ljava/util/List;

    move-result-object v1

    invoke-virtual {v14, v13}, Landroid/os/BaseBundle;->containsKey(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_10

    if-nez v1, :cond_10

    sget-object v1, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    invoke-virtual {v4, v1}, Lio/sentry/v2;->setTracePropagationTargets(Ljava/util/List;)V

    goto :goto_a

    :cond_10
    if-eqz v1, :cond_11

    invoke-virtual {v4, v1}, Lio/sentry/v2;->setTracePropagationTargets(Ljava/util/List;)V

    :cond_11
    :goto_a
    const-string v1, "io.sentry.traces.frames-tracking"

    const/4 v2, 0x1

    invoke-static {v14, v15, v1, v2}, Lio/sentry/android/core/H;->e(Landroid/os/Bundle;Lio/sentry/ILogger;Ljava/lang/String;Z)Z

    move-result v1

    invoke-virtual {v4, v1}, Lio/sentry/android/core/SentryAndroidOptions;->setEnableFramesTracking(Z)V

    const-string v1, "io.sentry.proguard-uuid"

    invoke-virtual {v4}, Lio/sentry/v2;->getProguardUuid()Ljava/lang/String;

    move-result-object v2

    invoke-static {v14, v15, v1, v2}, Lio/sentry/android/core/H;->i(Landroid/os/Bundle;Lio/sentry/ILogger;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v4, v1}, Lio/sentry/v2;->setProguardUuid(Ljava/lang/String;)V

    invoke-virtual {v4}, Lio/sentry/v2;->getSdkVersion()Lio/sentry/protocol/r;

    move-result-object v1

    if-nez v1, :cond_12

    new-instance v1, Lio/sentry/protocol/r;

    invoke-direct {v1, v0, v0}, Lio/sentry/protocol/r;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    :cond_12
    const-string v0, "io.sentry.sdk.name"

    iget-object v2, v1, Lio/sentry/protocol/r;->a:Ljava/lang/String;

    invoke-static {v14, v15, v0, v2}, Lio/sentry/android/core/H;->j(Landroid/os/Bundle;Lio/sentry/ILogger;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    const-string v2, "name is required."

    invoke-static {v2, v0}, Lio/sentry/config/a;->D(Ljava/lang/String;Ljava/lang/Object;)V

    iput-object v0, v1, Lio/sentry/protocol/r;->a:Ljava/lang/String;

    const-string v0, "io.sentry.sdk.version"

    iget-object v2, v1, Lio/sentry/protocol/r;->b:Ljava/lang/String;

    invoke-static {v14, v15, v0, v2}, Lio/sentry/android/core/H;->j(Landroid/os/Bundle;Lio/sentry/ILogger;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    const-string v2, "version is required."

    invoke-static {v2, v0}, Lio/sentry/config/a;->D(Ljava/lang/String;Ljava/lang/Object;)V

    iput-object v0, v1, Lio/sentry/protocol/r;->b:Ljava/lang/String;

    invoke-virtual {v4, v1}, Lio/sentry/v2;->setSdkVersion(Lio/sentry/protocol/r;)V

    const-string v0, "io.sentry.send-default-pii"

    invoke-virtual {v4}, Lio/sentry/v2;->isSendDefaultPii()Z

    move-result v1

    invoke-static {v14, v15, v0, v1}, Lio/sentry/android/core/H;->e(Landroid/os/Bundle;Lio/sentry/ILogger;Ljava/lang/String;Z)Z

    move-result v0

    invoke-virtual {v4, v0}, Lio/sentry/v2;->setSendDefaultPii(Z)V

    const-string v0, "io.sentry.gradle-plugin-integrations"

    invoke-static {v14, v15, v0}, Lio/sentry/android/core/H;->g(Landroid/os/Bundle;Lio/sentry/ILogger;Ljava/lang/String;)Ljava/util/List;

    move-result-object v0

    if-eqz v0, :cond_13

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_b
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_13

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    invoke-static {}, Lio/sentry/Y1;->d()Lio/sentry/Y1;

    move-result-object v2

    invoke-virtual {v2, v1}, Lio/sentry/Y1;->a(Ljava/lang/String;)V

    goto :goto_b

    :cond_13
    const-string v0, "io.sentry.enable-root-check"

    invoke-virtual {v4}, Lio/sentry/android/core/SentryAndroidOptions;->isEnableRootCheck()Z

    move-result v1

    invoke-static {v14, v15, v0, v1}, Lio/sentry/android/core/H;->e(Landroid/os/Bundle;Lio/sentry/ILogger;Ljava/lang/String;Z)Z

    move-result v0

    invoke-virtual {v4, v0}, Lio/sentry/android/core/SentryAndroidOptions;->setEnableRootCheck(Z)V

    const-string v0, "io.sentry.send-modules"

    invoke-virtual {v4}, Lio/sentry/v2;->isSendModules()Z

    move-result v1

    invoke-static {v14, v15, v0, v1}, Lio/sentry/android/core/H;->e(Landroid/os/Bundle;Lio/sentry/ILogger;Ljava/lang/String;Z)Z

    move-result v0

    invoke-virtual {v4, v0}, Lio/sentry/v2;->setSendModules(Z)V

    const-string v0, "io.sentry.performance-v2.enable"

    invoke-virtual {v4}, Lio/sentry/android/core/SentryAndroidOptions;->isEnablePerformanceV2()Z

    move-result v1

    invoke-static {v14, v15, v0, v1}, Lio/sentry/android/core/H;->e(Landroid/os/Bundle;Lio/sentry/ILogger;Ljava/lang/String;Z)Z

    move-result v0

    invoke-virtual {v4, v0}, Lio/sentry/android/core/SentryAndroidOptions;->setEnablePerformanceV2(Z)V

    const-string v0, "io.sentry.profiling.enable-app-start"

    invoke-virtual {v4}, Lio/sentry/v2;->isEnableAppStartProfiling()Z

    move-result v1

    invoke-static {v14, v15, v0, v1}, Lio/sentry/android/core/H;->e(Landroid/os/Bundle;Lio/sentry/ILogger;Ljava/lang/String;Z)Z

    move-result v0

    invoke-virtual {v4, v0}, Lio/sentry/v2;->setEnableAppStartProfiling(Z)V

    const-string v0, "io.sentry.enable-scope-persistence"

    invoke-virtual {v4}, Lio/sentry/v2;->isEnableScopePersistence()Z

    move-result v1

    invoke-static {v14, v15, v0, v1}, Lio/sentry/android/core/H;->e(Landroid/os/Bundle;Lio/sentry/ILogger;Ljava/lang/String;Z)Z

    move-result v0

    invoke-virtual {v4, v0}, Lio/sentry/v2;->setEnableScopePersistence(Z)V

    const-string v0, "io.sentry.traces.enable-auto-id-generation"

    invoke-virtual {v4}, Lio/sentry/android/core/SentryAndroidOptions;->isEnableAutoTraceIdGeneration()Z

    move-result v1

    invoke-static {v14, v15, v0, v1}, Lio/sentry/android/core/H;->e(Landroid/os/Bundle;Lio/sentry/ILogger;Ljava/lang/String;Z)Z

    move-result v0

    invoke-virtual {v4, v0}, Lio/sentry/android/core/SentryAndroidOptions;->setEnableAutoTraceIdGeneration(Z)V

    const-string v0, "io.sentry.traces.deadline-timeout"

    invoke-virtual {v4}, Lio/sentry/v2;->getDeadlineTimeout()J

    move-result-wide v1

    invoke-static {v14, v15, v0, v1, v2}, Lio/sentry/android/core/H;->h(Landroid/os/Bundle;Lio/sentry/ILogger;Ljava/lang/String;J)J

    move-result-wide v0

    invoke-virtual {v4, v0, v1}, Lio/sentry/v2;->setDeadlineTimeout(J)V

    invoke-virtual {v4}, Lio/sentry/v2;->getSessionReplay()Lio/sentry/z2;

    move-result-object v0

    iget-object v0, v0, Lio/sentry/z2;->a:Ljava/lang/Double;
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    const-string v1, " is not valid. Use null to disable or values >= 0.0 and <= 1.0."

    const-string v2, "The value "

    if-nez v0, :cond_15

    :try_start_4
    const-string v0, "io.sentry.session-replay.session-sample-rate"

    invoke-static {v14, v15, v0}, Lio/sentry/android/core/H;->f(Landroid/os/Bundle;Lio/sentry/ILogger;Ljava/lang/String;)D

    move-result-wide v6

    cmpl-double v0, v6, v16

    if-eqz v0, :cond_15

    invoke-virtual {v4}, Lio/sentry/v2;->getSessionReplay()Lio/sentry/z2;

    move-result-object v0

    invoke-static {v6, v7}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v3

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 v6, 0x1

    invoke-static {v3, v6}, Lio/sentry/config/a;->y(Ljava/lang/Double;Z)Z

    move-result v7

    if-eqz v7, :cond_14

    iput-object v3, v0, Lio/sentry/z2;->a:Ljava/lang/Double;

    goto :goto_c

    :cond_14
    new-instance v0, Ljava/lang/IllegalArgumentException;

    new-instance v6, Ljava/lang/StringBuilder;

    invoke-direct {v6, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v6, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_15
    :goto_c
    invoke-virtual {v4}, Lio/sentry/v2;->getSessionReplay()Lio/sentry/z2;

    move-result-object v0

    iget-object v0, v0, Lio/sentry/z2;->b:Ljava/lang/Double;

    if-nez v0, :cond_17

    const-string v0, "io.sentry.session-replay.on-error-sample-rate"

    invoke-static {v14, v15, v0}, Lio/sentry/android/core/H;->f(Landroid/os/Bundle;Lio/sentry/ILogger;Ljava/lang/String;)D

    move-result-wide v6

    cmpl-double v0, v6, v16

    if-eqz v0, :cond_17

    invoke-virtual {v4}, Lio/sentry/v2;->getSessionReplay()Lio/sentry/z2;

    move-result-object v0

    invoke-static {v6, v7}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v3

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 v6, 0x1

    invoke-static {v3, v6}, Lio/sentry/config/a;->y(Ljava/lang/Double;Z)Z

    move-result v7

    if-eqz v7, :cond_16

    iput-object v3, v0, Lio/sentry/z2;->b:Ljava/lang/Double;

    goto :goto_d

    :cond_16
    new-instance v0, Ljava/lang/IllegalArgumentException;

    new-instance v6, Ljava/lang/StringBuilder;

    invoke-direct {v6, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v6, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_17
    :goto_d
    invoke-virtual {v4}, Lio/sentry/v2;->getSessionReplay()Lio/sentry/z2;

    move-result-object v0

    const-string v1, "io.sentry.session-replay.mask-all-text"

    const/4 v2, 0x1

    invoke-static {v14, v15, v1, v2}, Lio/sentry/android/core/H;->e(Landroid/os/Bundle;Lio/sentry/ILogger;Ljava/lang/String;Z)Z

    move-result v1

    iget-object v2, v0, Lio/sentry/z2;->d:Ljava/util/concurrent/CopyOnWriteArraySet;

    iget-object v0, v0, Lio/sentry/z2;->c:Ljava/util/concurrent/CopyOnWriteArraySet;

    const-string v3, "android.widget.TextView"

    if-eqz v1, :cond_18

    invoke-virtual {v0, v3}, Ljava/util/concurrent/CopyOnWriteArraySet;->add(Ljava/lang/Object;)Z

    invoke-virtual {v2, v3}, Ljava/util/concurrent/CopyOnWriteArraySet;->remove(Ljava/lang/Object;)Z

    goto :goto_e

    :cond_18
    invoke-virtual {v2, v3}, Ljava/util/concurrent/CopyOnWriteArraySet;->add(Ljava/lang/Object;)Z

    invoke-virtual {v0, v3}, Ljava/util/concurrent/CopyOnWriteArraySet;->remove(Ljava/lang/Object;)Z

    :goto_e
    invoke-virtual {v4}, Lio/sentry/v2;->getSessionReplay()Lio/sentry/z2;

    move-result-object v0

    const-string v1, "io.sentry.session-replay.mask-all-images"

    const/4 v2, 0x1

    invoke-static {v14, v15, v1, v2}, Lio/sentry/android/core/H;->e(Landroid/os/Bundle;Lio/sentry/ILogger;Ljava/lang/String;Z)Z

    move-result v1

    iget-object v2, v0, Lio/sentry/z2;->d:Ljava/util/concurrent/CopyOnWriteArraySet;

    iget-object v0, v0, Lio/sentry/z2;->c:Ljava/util/concurrent/CopyOnWriteArraySet;

    const-string v3, "android.widget.ImageView"

    if-eqz v1, :cond_19

    invoke-virtual {v0, v3}, Ljava/util/concurrent/CopyOnWriteArraySet;->add(Ljava/lang/Object;)Z

    invoke-virtual {v2, v3}, Ljava/util/concurrent/CopyOnWriteArraySet;->remove(Ljava/lang/Object;)Z

    goto :goto_f

    :cond_19
    invoke-virtual {v2, v3}, Ljava/util/concurrent/CopyOnWriteArraySet;->add(Ljava/lang/Object;)Z

    invoke-virtual {v0, v3}, Ljava/util/concurrent/CopyOnWriteArraySet;->remove(Ljava/lang/Object;)Z

    :goto_f
    invoke-virtual {v4}, Lio/sentry/v2;->getSessionReplay()Lio/sentry/z2;

    move-result-object v0

    const-string v1, "io.sentry.session-replay.debug"

    const/4 v8, 0x0

    invoke-static {v14, v15, v1, v8}, Lio/sentry/android/core/H;->e(Landroid/os/Bundle;Lio/sentry/ILogger;Ljava/lang/String;Z)Z

    move-result v1

    iput-boolean v1, v0, Lio/sentry/z2;->l:Z

    const-string v0, "io.sentry.ignored-errors"

    invoke-static {v14, v15, v0}, Lio/sentry/android/core/H;->g(Landroid/os/Bundle;Lio/sentry/ILogger;Ljava/lang/String;)Ljava/util/List;

    move-result-object v0

    invoke-virtual {v4, v0}, Lio/sentry/v2;->setIgnoredErrors(Ljava/util/List;)V

    const-string v0, "io.sentry.in-app-includes"

    invoke-static {v14, v15, v0}, Lio/sentry/android/core/H;->g(Landroid/os/Bundle;Lio/sentry/ILogger;Ljava/lang/String;)Ljava/util/List;

    move-result-object v0

    if-eqz v0, :cond_1a

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v1

    if-nez v1, :cond_1a

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_10
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1a

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    invoke-virtual {v4, v1}, Lio/sentry/v2;->addInAppInclude(Ljava/lang/String;)V

    goto :goto_10

    :cond_1a
    const-string v0, "io.sentry.in-app-excludes"

    invoke-static {v14, v15, v0}, Lio/sentry/android/core/H;->g(Landroid/os/Bundle;Lio/sentry/ILogger;Ljava/lang/String;)Ljava/util/List;

    move-result-object v0

    if-eqz v0, :cond_1b

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v1

    if-nez v1, :cond_1b

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_11
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1b

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    invoke-virtual {v4, v1}, Lio/sentry/v2;->addInAppExclude(Ljava/lang/String;)V

    goto :goto_11

    :cond_1b
    invoke-virtual {v4}, Lio/sentry/v2;->getLogs()Lio/sentry/p2;

    move-result-object v0

    const-string v1, "io.sentry.logs.enabled"

    invoke-virtual {v4}, Lio/sentry/v2;->getLogs()Lio/sentry/p2;

    move-result-object v2

    iget-boolean v2, v2, Lio/sentry/p2;->a:Z

    invoke-static {v14, v15, v1, v2}, Lio/sentry/android/core/H;->e(Landroid/os/Bundle;Lio/sentry/ILogger;Ljava/lang/String;Z)Z

    move-result v1

    iput-boolean v1, v0, Lio/sentry/p2;->a:Z

    invoke-virtual {v4}, Lio/sentry/v2;->getFeedbackOptions()Lio/sentry/V1;

    move-result-object v0

    const-string v1, "io.sentry.feedback.is-name-required"

    iget-boolean v2, v0, Lio/sentry/V1;->a:Z

    invoke-static {v14, v15, v1, v2}, Lio/sentry/android/core/H;->e(Landroid/os/Bundle;Lio/sentry/ILogger;Ljava/lang/String;Z)Z

    move-result v1

    iput-boolean v1, v0, Lio/sentry/V1;->a:Z

    const-string v1, "io.sentry.feedback.show-name"

    iget-boolean v2, v0, Lio/sentry/V1;->b:Z

    invoke-static {v14, v15, v1, v2}, Lio/sentry/android/core/H;->e(Landroid/os/Bundle;Lio/sentry/ILogger;Ljava/lang/String;Z)Z

    move-result v1

    iput-boolean v1, v0, Lio/sentry/V1;->b:Z

    const-string v1, "io.sentry.feedback.is-email-required"

    iget-boolean v2, v0, Lio/sentry/V1;->c:Z

    invoke-static {v14, v15, v1, v2}, Lio/sentry/android/core/H;->e(Landroid/os/Bundle;Lio/sentry/ILogger;Ljava/lang/String;Z)Z

    move-result v1

    iput-boolean v1, v0, Lio/sentry/V1;->c:Z

    const-string v1, "io.sentry.feedback.show-email"

    iget-boolean v2, v0, Lio/sentry/V1;->d:Z

    invoke-static {v14, v15, v1, v2}, Lio/sentry/android/core/H;->e(Landroid/os/Bundle;Lio/sentry/ILogger;Ljava/lang/String;Z)Z

    move-result v1

    iput-boolean v1, v0, Lio/sentry/V1;->d:Z

    const-string v1, "io.sentry.feedback.use-sentry-user"

    iget-boolean v2, v0, Lio/sentry/V1;->e:Z

    invoke-static {v14, v15, v1, v2}, Lio/sentry/android/core/H;->e(Landroid/os/Bundle;Lio/sentry/ILogger;Ljava/lang/String;Z)Z

    move-result v1

    iput-boolean v1, v0, Lio/sentry/V1;->e:Z

    const-string v1, "io.sentry.feedback.show-branding"

    iget-boolean v2, v0, Lio/sentry/V1;->f:Z

    invoke-static {v14, v15, v1, v2}, Lio/sentry/android/core/H;->e(Landroid/os/Bundle;Lio/sentry/ILogger;Ljava/lang/String;Z)Z

    move-result v1

    iput-boolean v1, v0, Lio/sentry/V1;->f:Z

    goto :goto_12

    :cond_1c
    move-object/from16 v18, v2

    move-object/from16 v19, v3

    move/from16 v20, v8

    move/from16 v21, v9

    :goto_12
    invoke-virtual {v4}, Lio/sentry/v2;->getLogger()Lio/sentry/ILogger;

    move-result-object v0

    sget-object v1, Lio/sentry/a2;->INFO:Lio/sentry/a2;

    const-string v2, "Retrieving configuration from AndroidManifest.xml"

    const/4 v8, 0x0

    new-array v3, v8, [Ljava/lang/Object;

    invoke-interface {v0, v1, v2, v3}, Lio/sentry/ILogger;->e(Lio/sentry/a2;Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    goto :goto_14

    :goto_13
    invoke-virtual {v4}, Lio/sentry/v2;->getLogger()Lio/sentry/ILogger;

    move-result-object v1

    sget-object v2, Lio/sentry/a2;->ERROR:Lio/sentry/a2;

    const-string v3, "Failed to read configuration from android manifest metadata."

    invoke-interface {v1, v2, v3, v0}, Lio/sentry/ILogger;->r(Lio/sentry/a2;Ljava/lang/String;Ljava/lang/Throwable;)V

    :goto_14
    new-instance v0, Ljava/io/File;

    invoke-virtual {v12}, Landroid/content/Context;->getCacheDir()Ljava/io/File;

    move-result-object v1

    const-string v2, "sentry"

    invoke-direct {v0, v1, v2}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    invoke-virtual {v0}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v4, v0}, Lio/sentry/v2;->setCacheDirPath(Ljava/lang/String;)V

    invoke-static {v12, v5}, Lio/sentry/android/core/H;->c(Landroid/content/Context;Lio/sentry/android/core/I;)Landroid/content/pm/PackageInfo;

    move-result-object v0

    if-eqz v0, :cond_1e

    invoke-virtual {v4}, Lio/sentry/v2;->getRelease()Ljava/lang/String;

    move-result-object v1

    if-nez v1, :cond_1d

    invoke-virtual {v0}, Landroid/content/pm/PackageInfo;->getLongVersionCode()J

    move-result-wide v1

    invoke-static {v1, v2}, Ljava/lang/Long;->toString(J)Ljava/lang/String;

    move-result-object v1

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v3, v0, Landroid/content/pm/PackageInfo;->packageName:Ljava/lang/String;

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v3, "@"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v3, v0, Landroid/content/pm/PackageInfo;->versionName:Ljava/lang/String;

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v3, "+"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v4, v1}, Lio/sentry/v2;->setRelease(Ljava/lang/String;)V

    :cond_1d
    iget-object v0, v0, Landroid/content/pm/PackageInfo;->packageName:Ljava/lang/String;

    if-eqz v0, :cond_1e

    const-string v1, "android."

    invoke-virtual {v0, v1}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v1

    if-nez v1, :cond_1e

    invoke-virtual {v4, v0}, Lio/sentry/v2;->addInAppInclude(Ljava/lang/String;)V

    :cond_1e
    invoke-virtual {v4}, Lio/sentry/v2;->getDistinctId()Ljava/lang/String;

    move-result-object v0

    if-nez v0, :cond_1f

    :try_start_5
    invoke-static {v12}, Lio/sentry/android/core/S;->a(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v4, v0}, Lio/sentry/v2;->setDistinctId(Ljava/lang/String;)V
    :try_end_5
    .catch Ljava/lang/RuntimeException; {:try_start_5 .. :try_end_5} :catch_0

    goto :goto_15

    :catch_0
    move-exception v0

    invoke-virtual {v4}, Lio/sentry/v2;->getLogger()Lio/sentry/ILogger;

    move-result-object v1

    sget-object v2, Lio/sentry/a2;->ERROR:Lio/sentry/a2;

    const-string v3, "Could not generate distinct Id."

    invoke-interface {v1, v2, v3, v0}, Lio/sentry/ILogger;->r(Lio/sentry/a2;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_1f
    :goto_15
    sget-object v0, Lio/sentry/android/core/E;->e:Lio/sentry/android/core/E;

    iget-object v1, v0, Lio/sentry/android/core/E;->b:Lio/sentry/android/core/D;

    if-eqz v1, :cond_20

    :goto_16
    move-object v7, v11

    move-object/from16 v6, v18

    move-object/from16 v3, v19

    move/from16 v8, v20

    move/from16 v9, v21

    goto :goto_17

    :cond_20
    iget-object v1, v0, Lio/sentry/android/core/E;->a:Lio/sentry/util/a;

    invoke-virtual {v1}, Lio/sentry/util/a;->a()Lio/sentry/r;

    move-result-object v1

    :try_start_6
    invoke-virtual {v4}, Lio/sentry/v2;->getLogger()Lio/sentry/ILogger;

    move-result-object v2

    invoke-virtual {v0, v2}, Lio/sentry/android/core/E;->i(Lio/sentry/ILogger;)V
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_5

    invoke-virtual {v1}, Lio/sentry/r;->close()V

    goto :goto_16

    :goto_17
    invoke-static/range {v3 .. v10}, Lio/sentry/android/core/m;->b(Landroid/content/Context;Lio/sentry/android/core/SentryAndroidOptions;Lio/sentry/android/core/I;Lio/sentry/hints/i;LFu;ZZZ)V

    :try_start_7
    sget-object v0, Lio/sentry/android/core/b0;->b:Lio/sentry/util/a;
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_4

    goto :goto_18

    :catchall_4
    move-exception v0

    invoke-virtual {v4}, Lio/sentry/v2;->getLogger()Lio/sentry/ILogger;

    move-result-object v1

    sget-object v2, Lio/sentry/a2;->ERROR:Lio/sentry/a2;

    const-string v10, "Error in the \'OptionsConfiguration.configure\' callback."

    invoke-interface {v1, v2, v10, v0}, Lio/sentry/ILogger;->r(Lio/sentry/a2;Ljava/lang/String;Ljava/lang/Throwable;)V

    :goto_18
    invoke-static {}, Lio/sentry/android/core/performance/f;->b()Lio/sentry/android/core/performance/f;

    move-result-object v0

    invoke-virtual {v4}, Lio/sentry/android/core/SentryAndroidOptions;->isEnablePerformanceV2()Z

    move-result v1

    const-wide/16 v10, 0x0

    if-eqz v1, :cond_21

    iget-object v1, v0, Lio/sentry/android/core/performance/f;->c:Lio/sentry/android/core/performance/g;

    iget-wide v12, v1, Lio/sentry/android/core/performance/g;->c:J

    cmp-long v2, v12, v10

    if-nez v2, :cond_21

    invoke-static {}, Landroid/os/Process;->getStartUptimeMillis()J

    move-result-wide v12

    invoke-virtual {v1, v12, v13}, Lio/sentry/android/core/performance/g;->c(J)V

    :cond_21
    invoke-virtual {v3}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v1

    instance-of v1, v1, Landroid/app/Application;

    if-eqz v1, :cond_22

    invoke-virtual {v3}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v1

    check-cast v1, Landroid/app/Application;

    invoke-virtual {v0, v1}, Lio/sentry/android/core/performance/f;->d(Landroid/app/Application;)V

    :cond_22
    iget-object v0, v0, Lio/sentry/android/core/performance/f;->d:Lio/sentry/android/core/performance/g;

    iget-wide v1, v0, Lio/sentry/android/core/performance/g;->c:J

    cmp-long v1, v1, v10

    if-nez v1, :cond_23

    sget-wide v1, Lio/sentry/android/core/b0;->a:J

    invoke-virtual {v0, v1, v2}, Lio/sentry/android/core/performance/g;->c(J)V

    :cond_23
    invoke-static {v4, v3, v5, v6, v7}, Lio/sentry/android/core/m;->a(Lio/sentry/android/core/SentryAndroidOptions;Landroid/content/Context;Lio/sentry/android/core/I;Lio/sentry/hints/i;LFu;)V

    invoke-static {v4, v8, v9}, Lio/sentry/android/core/b0;->a(Lio/sentry/v2;ZZ)V

    return-void

    :catchall_5
    move-exception v0

    move-object v2, v0

    :try_start_8
    invoke-virtual {v1}, Lio/sentry/r;->close()V
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_6

    goto :goto_19

    :catchall_6
    move-exception v0

    invoke-virtual {v2, v0}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_19
    throw v2
.end method

.method public onCancel()V
    .locals 2

    iget-object v0, p0, LQ9;->b:Ljava/lang/Object;

    check-cast v0, Landroid/animation/Animator;

    iget-object v1, p0, LQ9;->c:Ljava/lang/Object;

    check-cast v1, LMy;

    invoke-virtual {v0}, Landroid/animation/Animator;->end()V

    const/4 v0, 0x2

    invoke-static {v0}, Lzi;->G(I)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {v1}, LMy;->toString()Ljava/lang/String;

    :cond_0
    return-void
.end method
