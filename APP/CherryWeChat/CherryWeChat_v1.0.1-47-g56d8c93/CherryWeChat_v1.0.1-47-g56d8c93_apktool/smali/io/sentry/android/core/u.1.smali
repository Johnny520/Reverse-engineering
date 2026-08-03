.class public final Lio/sentry/android/core/u;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lio/sentry/C;


# instance fields
.field public final a:Landroid/content/Context;

.field public final b:Lio/sentry/android/core/SentryAndroidOptions;

.field public final c:Lio/sentry/android/core/I;

.field public final d:Lio/sentry/B0;

.field public final e:Lio/sentry/cache/f;


# direct methods
.method public constructor <init>(Landroid/content/Context;Lio/sentry/android/core/I;Lio/sentry/android/core/SentryAndroidOptions;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    if-eqz v0, :cond_0

    move-object p1, v0

    :cond_0
    iput-object p1, p0, Lio/sentry/android/core/u;->a:Landroid/content/Context;

    iput-object p3, p0, Lio/sentry/android/core/u;->b:Lio/sentry/android/core/SentryAndroidOptions;

    iput-object p2, p0, Lio/sentry/android/core/u;->c:Lio/sentry/android/core/I;

    invoke-virtual {p3}, Lio/sentry/v2;->findPersistingScopeObserver()Lio/sentry/cache/f;

    move-result-object p1

    iput-object p1, p0, Lio/sentry/android/core/u;->e:Lio/sentry/cache/f;

    new-instance p1, Lio/sentry/t;

    const/4 p2, 0x2

    invoke-direct {p1, p3, p2}, Lio/sentry/t;-><init>(Lio/sentry/v2;I)V

    new-instance p2, Lio/sentry/B0;

    invoke-direct {p2, p1}, Lio/sentry/B0;-><init>(Ljava/lang/Object;)V

    iput-object p2, p0, Lio/sentry/android/core/u;->d:Lio/sentry/B0;

    return-void
.end method

.method public static a(Lio/sentry/hints/b;)Z
    .locals 1

    instance-of v0, p0, Lio/sentry/hints/a;

    if-eqz v0, :cond_0

    check-cast p0, Lio/sentry/hints/a;

    invoke-interface {p0}, Lio/sentry/hints/a;->e()Ljava/lang/String;

    move-result-object p0

    const-string v0, "anr_background"

    invoke-virtual {v0, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    return p0

    :cond_0
    const/4 p0, 0x0

    return p0
.end method


# virtual methods
.method public final b(Lio/sentry/v2;Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lio/sentry/android/core/u;->e:Lio/sentry/cache/f;

    if-nez v0, :cond_0

    const/4 p1, 0x0

    return-object p1

    :cond_0
    invoke-virtual {v0, p1, p2, p3}, Lio/sentry/cache/f;->g(Lio/sentry/v2;Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final f(Lio/sentry/protocol/A;Lio/sentry/H;)Lio/sentry/protocol/A;
    .locals 0

    return-object p1
.end method

.method public final i(Lio/sentry/R1;Lio/sentry/H;)Lio/sentry/R1;
    .locals 25

    move-object/from16 v1, p0

    move-object/from16 v2, p1

    invoke-static/range {p2 .. p2}, Lio/sentry/config/a;->s(Lio/sentry/H;)Ljava/lang/Object;

    move-result-object v0

    instance-of v3, v0, Lio/sentry/hints/b;

    const/4 v4, 0x0

    iget-object v5, v1, Lio/sentry/android/core/u;->b:Lio/sentry/android/core/SentryAndroidOptions;

    if-nez v3, :cond_0

    invoke-virtual {v5}, Lio/sentry/v2;->getLogger()Lio/sentry/ILogger;

    move-result-object v0

    sget-object v3, Lio/sentry/a2;->WARNING:Lio/sentry/a2;

    const-string v5, "The event is not Backfillable, but has been passed to BackfillingEventProcessor, skipping."

    new-array v4, v4, [Ljava/lang/Object;

    invoke-interface {v0, v3, v5, v4}, Lio/sentry/ILogger;->e(Lio/sentry/a2;Ljava/lang/String;[Ljava/lang/Object;)V

    return-object v2

    :cond_0
    new-instance v3, Lio/sentry/protocol/k;

    invoke-direct {v3}, Ljava/lang/Object;-><init>()V

    move-object v6, v0

    check-cast v6, Lio/sentry/hints/b;

    invoke-interface {v6}, Lio/sentry/hints/b;->a()Z

    move-result v0

    if-nez v0, :cond_1

    const-string v0, "HistoricalAppExitInfo"

    iput-object v0, v3, Lio/sentry/protocol/k;->a:Ljava/lang/String;

    goto :goto_0

    :cond_1
    const-string v0, "AppExitInfo"

    iput-object v0, v3, Lio/sentry/protocol/k;->a:Ljava/lang/String;

    :goto_0
    invoke-static {v6}, Lio/sentry/android/core/u;->a(Lio/sentry/hints/b;)Z

    move-result v0

    if-eqz v0, :cond_2

    const-string v0, "Background ANR"

    goto :goto_1

    :cond_2
    const-string v0, "ANR"

    :goto_1
    new-instance v7, Lio/sentry/android/core/ApplicationNotResponding;

    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object v8

    invoke-direct {v7, v0, v8}, Lio/sentry/android/core/ApplicationNotResponding;-><init>(Ljava/lang/String;Ljava/lang/Thread;)V

    iget-object v0, v2, Lio/sentry/R1;->s:Lio/sentry/z0;

    if-eqz v0, :cond_3

    iget-object v0, v0, Lio/sentry/z0;->a:Ljava/util/ArrayList;

    goto :goto_2

    :cond_3
    const/4 v0, 0x0

    :goto_2
    iget-object v9, v2, Lio/sentry/C1;->b:Lio/sentry/protocol/c;

    if-eqz v0, :cond_5

    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_4
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v10

    if-eqz v10, :cond_5

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v10

    check-cast v10, Lio/sentry/protocol/z;

    iget-object v11, v10, Lio/sentry/protocol/z;->c:Ljava/lang/String;

    if-eqz v11, :cond_4

    const-string v12, "main"

    invoke-virtual {v11, v12}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v11

    if-eqz v11, :cond_4

    goto :goto_3

    :cond_5
    const/4 v10, 0x0

    :goto_3
    if-nez v10, :cond_6

    new-instance v10, Lio/sentry/protocol/z;

    invoke-direct {v10}, Ljava/lang/Object;-><init>()V

    new-instance v0, Lio/sentry/protocol/y;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    iput-object v0, v10, Lio/sentry/protocol/z;->i:Lio/sentry/protocol/y;

    :cond_6
    iget-object v0, v1, Lio/sentry/android/core/u;->d:Lio/sentry/B0;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-object v0, v10, Lio/sentry/protocol/z;->i:Lio/sentry/protocol/y;

    const/4 v11, 0x1

    if-nez v0, :cond_7

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0, v4}, Ljava/util/ArrayList;-><init>(I)V

    goto :goto_4

    :cond_7
    new-instance v12, Ljava/util/ArrayList;

    invoke-direct {v12, v11}, Ljava/util/ArrayList;-><init>(I)V

    iget-object v10, v10, Lio/sentry/protocol/z;->a:Ljava/lang/Long;

    iget-object v0, v0, Lio/sentry/protocol/y;->a:Ljava/util/List;

    invoke-static {v7, v3, v10, v0, v11}, Lio/sentry/B0;->k(Ljava/lang/Throwable;Lio/sentry/protocol/k;Ljava/lang/Long;Ljava/util/List;Z)Lio/sentry/protocol/s;

    move-result-object v0

    invoke-virtual {v12, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    move-object v0, v12

    :goto_4
    new-instance v3, Lio/sentry/z0;

    invoke-direct {v3, v0}, Lio/sentry/z0;-><init>(Ljava/util/List;)V

    iput-object v3, v2, Lio/sentry/R1;->t:Lio/sentry/z0;

    iget-object v0, v2, Lio/sentry/C1;->h:Ljava/lang/String;

    if-nez v0, :cond_8

    const-string v0, "java"

    iput-object v0, v2, Lio/sentry/C1;->h:Ljava/lang/String;

    :cond_8
    invoke-virtual {v9}, Lio/sentry/protocol/c;->f()Lio/sentry/protocol/m;

    move-result-object v0

    iget-object v3, v1, Lio/sentry/android/core/u;->a:Landroid/content/Context;

    invoke-static {v3, v5}, Lio/sentry/android/core/M;->c(Landroid/content/Context;Lio/sentry/android/core/SentryAndroidOptions;)Lio/sentry/android/core/M;

    move-result-object v7

    iget-object v7, v7, Lio/sentry/android/core/M;->g:Lio/sentry/protocol/m;

    invoke-virtual {v9, v7}, Lio/sentry/protocol/c;->p(Lio/sentry/protocol/m;)V

    if-eqz v0, :cond_a

    iget-object v7, v0, Lio/sentry/protocol/m;->a:Ljava/lang/String;

    if-eqz v7, :cond_9

    invoke-virtual {v7}, Ljava/lang/String;->isEmpty()Z

    move-result v10

    if-nez v10, :cond_9

    new-instance v10, Ljava/lang/StringBuilder;

    const-string v12, "os_"

    invoke-direct {v10, v12}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v7}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v7

    sget-object v12, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    invoke-virtual {v7, v12}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v10, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v10}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v7

    goto :goto_5

    :cond_9
    const-string v7, "os_1"

    :goto_5
    invoke-virtual {v9, v7, v0}, Lio/sentry/protocol/c;->j(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_a
    invoke-virtual {v9}, Lio/sentry/protocol/c;->e()Lio/sentry/protocol/f;

    move-result-object v0

    const-string v7, "Error getting installationId."

    iget-object v10, v1, Lio/sentry/android/core/u;->c:Lio/sentry/android/core/I;

    if-nez v0, :cond_f

    new-instance v12, Lio/sentry/protocol/f;

    invoke-direct {v12}, Ljava/lang/Object;-><init>()V

    sget-object v0, Landroid/os/Build;->MANUFACTURER:Ljava/lang/String;

    iput-object v0, v12, Lio/sentry/protocol/f;->b:Ljava/lang/String;

    sget-object v0, Landroid/os/Build;->BRAND:Ljava/lang/String;

    iput-object v0, v12, Lio/sentry/protocol/f;->c:Ljava/lang/String;

    invoke-virtual {v5}, Lio/sentry/v2;->getLogger()Lio/sentry/ILogger;

    move-result-object v0

    invoke-static {v0}, Lio/sentry/android/core/H;->a(Lio/sentry/ILogger;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, v12, Lio/sentry/protocol/f;->d:Ljava/lang/String;

    sget-object v0, Landroid/os/Build;->MODEL:Ljava/lang/String;

    iput-object v0, v12, Lio/sentry/protocol/f;->e:Ljava/lang/String;

    sget-object v0, Landroid/os/Build;->ID:Ljava/lang/String;

    iput-object v0, v12, Lio/sentry/protocol/f;->f:Ljava/lang/String;

    sget-object v0, Landroid/os/Build;->SUPPORTED_ABIS:[Ljava/lang/String;

    iput-object v0, v12, Lio/sentry/protocol/f;->g:[Ljava/lang/String;

    invoke-virtual {v5}, Lio/sentry/v2;->getLogger()Lio/sentry/ILogger;

    move-result-object v0

    invoke-static {v3, v0}, Lio/sentry/android/core/H;->b(Landroid/content/Context;Lio/sentry/ILogger;)Landroid/app/ActivityManager$MemoryInfo;

    move-result-object v0

    if-eqz v0, :cond_b

    iget-wide v13, v0, Landroid/app/ActivityManager$MemoryInfo;->totalMem:J

    invoke-static {v13, v14}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    iput-object v0, v12, Lio/sentry/protocol/f;->m:Ljava/lang/Long;

    :cond_b
    invoke-virtual {v10}, Lio/sentry/android/core/I;->b()Ljava/lang/Boolean;

    move-result-object v0

    iput-object v0, v12, Lio/sentry/protocol/f;->l:Ljava/lang/Boolean;

    invoke-virtual {v5}, Lio/sentry/v2;->getLogger()Lio/sentry/ILogger;

    move-result-object v13

    :try_start_0
    invoke-virtual {v3}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_6

    :catchall_0
    move-exception v0

    sget-object v14, Lio/sentry/a2;->ERROR:Lio/sentry/a2;

    const-string v15, "Error getting DisplayMetrics."

    invoke-interface {v13, v14, v15, v0}, Lio/sentry/ILogger;->r(Lio/sentry/a2;Ljava/lang/String;Ljava/lang/Throwable;)V

    const/4 v0, 0x0

    :goto_6
    if-eqz v0, :cond_c

    iget v13, v0, Landroid/util/DisplayMetrics;->widthPixels:I

    invoke-static {v13}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v13

    iput-object v13, v12, Lio/sentry/protocol/f;->u:Ljava/lang/Integer;

    iget v13, v0, Landroid/util/DisplayMetrics;->heightPixels:I

    invoke-static {v13}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v13

    iput-object v13, v12, Lio/sentry/protocol/f;->v:Ljava/lang/Integer;

    iget v13, v0, Landroid/util/DisplayMetrics;->density:F

    invoke-static {v13}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v13

    iput-object v13, v12, Lio/sentry/protocol/f;->w:Ljava/lang/Float;

    iget v0, v0, Landroid/util/DisplayMetrics;->densityDpi:I

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    iput-object v0, v12, Lio/sentry/protocol/f;->x:Ljava/lang/Integer;

    :cond_c
    iget-object v0, v12, Lio/sentry/protocol/f;->A:Ljava/lang/String;

    if-nez v0, :cond_d

    :try_start_1
    invoke-static {v3}, Lio/sentry/android/core/S;->a(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    goto :goto_7

    :catchall_1
    move-exception v0

    invoke-virtual {v5}, Lio/sentry/v2;->getLogger()Lio/sentry/ILogger;

    move-result-object v13

    sget-object v14, Lio/sentry/a2;->ERROR:Lio/sentry/a2;

    invoke-interface {v13, v14, v7, v0}, Lio/sentry/ILogger;->r(Lio/sentry/a2;Ljava/lang/String;Ljava/lang/Throwable;)V

    const/4 v0, 0x0

    :goto_7
    iput-object v0, v12, Lio/sentry/protocol/f;->A:Ljava/lang/String;

    :cond_d
    sget-object v0, Lio/sentry/android/core/internal/util/e;->c:Lio/sentry/android/core/internal/util/e;

    invoke-virtual {v0}, Lio/sentry/android/core/internal/util/e;->a()Ljava/util/ArrayList;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v13

    if-nez v13, :cond_e

    invoke-static {v0}, Ljava/util/Collections;->max(Ljava/util/Collection;)Ljava/lang/Object;

    move-result-object v13

    check-cast v13, Ljava/lang/Integer;

    invoke-virtual {v13}, Ljava/lang/Integer;->doubleValue()D

    move-result-wide v13

    invoke-static {v13, v14}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v13

    iput-object v13, v12, Lio/sentry/protocol/f;->F:Ljava/lang/Double;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    iput-object v0, v12, Lio/sentry/protocol/f;->E:Ljava/lang/Integer;

    :cond_e
    invoke-virtual {v9, v12}, Lio/sentry/protocol/c;->n(Lio/sentry/protocol/f;)V

    :cond_f
    invoke-interface {v6}, Lio/sentry/hints/b;->a()Z

    move-result v0

    if-nez v0, :cond_10

    invoke-virtual {v5}, Lio/sentry/v2;->getLogger()Lio/sentry/ILogger;

    move-result-object v0

    sget-object v3, Lio/sentry/a2;->DEBUG:Lio/sentry/a2;

    const-string v5, "The event is Backfillable, but should not be enriched, skipping."

    new-array v4, v4, [Ljava/lang/Object;

    invoke-interface {v0, v3, v5, v4}, Lio/sentry/ILogger;->e(Lio/sentry/a2;Ljava/lang/String;[Ljava/lang/Object;)V

    return-object v2

    :cond_10
    iget-object v0, v2, Lio/sentry/C1;->d:Lio/sentry/protocol/n;

    if-nez v0, :cond_11

    const-string v0, "request.json"

    const-class v12, Lio/sentry/protocol/n;

    invoke-virtual {v1, v5, v0, v12}, Lio/sentry/android/core/u;->b(Lio/sentry/v2;Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lio/sentry/protocol/n;

    iput-object v0, v2, Lio/sentry/C1;->d:Lio/sentry/protocol/n;

    :cond_11
    iget-object v0, v2, Lio/sentry/C1;->i:Lio/sentry/protocol/E;

    if-nez v0, :cond_12

    const-string v0, "user.json"

    const-class v12, Lio/sentry/protocol/E;

    invoke-virtual {v1, v5, v0, v12}, Lio/sentry/android/core/u;->b(Lio/sentry/v2;Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lio/sentry/protocol/E;

    iput-object v0, v2, Lio/sentry/C1;->i:Lio/sentry/protocol/E;

    :cond_12
    const-string v12, "tags.json"

    const-class v13, Ljava/util/Map;

    invoke-virtual {v1, v5, v12, v13}, Lio/sentry/android/core/u;->b(Lio/sentry/v2;Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Map;

    if-nez v0, :cond_13

    goto :goto_9

    :cond_13
    iget-object v14, v2, Lio/sentry/C1;->e:Ljava/util/AbstractMap;

    if-nez v14, :cond_14

    new-instance v14, Ljava/util/HashMap;

    invoke-direct {v14, v0}, Ljava/util/HashMap;-><init>(Ljava/util/Map;)V

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0, v14}, Ljava/util/HashMap;-><init>(Ljava/util/Map;)V

    iput-object v0, v2, Lio/sentry/C1;->e:Ljava/util/AbstractMap;

    goto :goto_9

    :cond_14
    invoke-interface {v0}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_8
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v14

    if-eqz v14, :cond_16

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v14

    check-cast v14, Ljava/util/Map$Entry;

    iget-object v15, v2, Lio/sentry/C1;->e:Ljava/util/AbstractMap;

    invoke-interface {v14}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v4

    invoke-interface {v15, v4}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_15

    invoke-interface {v14}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/String;

    invoke-interface {v14}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v14

    check-cast v14, Ljava/lang/String;

    invoke-virtual {v2, v4, v14}, Lio/sentry/C1;->b(Ljava/lang/String;Ljava/lang/String;)V

    :cond_15
    const/4 v4, 0x0

    goto :goto_8

    :cond_16
    :goto_9
    const-string v0, "breadcrumbs.json"

    const-class v4, Ljava/util/List;

    invoke-virtual {v1, v5, v0, v4}, Lio/sentry/android/core/u;->b(Lio/sentry/v2;Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/List;

    if-nez v0, :cond_17

    goto :goto_a

    :cond_17
    iget-object v14, v2, Lio/sentry/C1;->m:Ljava/util/List;

    if-nez v14, :cond_18

    new-instance v14, Ljava/util/ArrayList;

    invoke-direct {v14, v0}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    iput-object v14, v2, Lio/sentry/C1;->m:Ljava/util/List;

    goto :goto_a

    :cond_18
    invoke-interface {v14, v0}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    :goto_a
    const-string v0, "extras.json"

    invoke-virtual {v1, v5, v0, v13}, Lio/sentry/android/core/u;->b(Lio/sentry/v2;Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Map;

    if-nez v0, :cond_19

    goto :goto_c

    :cond_19
    iget-object v14, v2, Lio/sentry/C1;->o:Ljava/util/AbstractMap;

    if-nez v14, :cond_1a

    new-instance v14, Ljava/util/HashMap;

    invoke-direct {v14, v0}, Ljava/util/HashMap;-><init>(Ljava/util/Map;)V

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0, v14}, Ljava/util/HashMap;-><init>(Ljava/util/Map;)V

    iput-object v0, v2, Lio/sentry/C1;->o:Ljava/util/AbstractMap;

    goto :goto_c

    :cond_1a
    invoke-interface {v0}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_1b
    :goto_b
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v14

    if-eqz v14, :cond_1c

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v14

    check-cast v14, Ljava/util/Map$Entry;

    iget-object v15, v2, Lio/sentry/C1;->o:Ljava/util/AbstractMap;

    invoke-interface {v14}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v8

    invoke-interface {v15, v8}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v8

    if-nez v8, :cond_1b

    iget-object v8, v2, Lio/sentry/C1;->o:Ljava/util/AbstractMap;

    invoke-interface {v14}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v15

    check-cast v15, Ljava/lang/String;

    invoke-interface {v14}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v14

    invoke-interface {v8, v15, v14}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_b

    :cond_1c
    :goto_c
    const-string v0, "contexts.json"

    const-class v8, Lio/sentry/protocol/c;

    invoke-virtual {v1, v5, v0, v8}, Lio/sentry/android/core/u;->b(Lio/sentry/v2;Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lio/sentry/protocol/c;

    if-nez v0, :cond_1e

    :cond_1d
    move/from16 v16, v11

    goto :goto_f

    :cond_1e
    new-instance v8, Lio/sentry/protocol/c;

    invoke-direct {v8, v0}, Lio/sentry/protocol/c;-><init>(Lio/sentry/protocol/c;)V

    iget-object v0, v8, Lio/sentry/protocol/c;->a:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-virtual {v0}, Ljava/util/concurrent/ConcurrentHashMap;->entrySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_d
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v8

    if-eqz v8, :cond_1d

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Ljava/util/Map$Entry;

    invoke-interface {v8}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v14

    const-string v15, "trace"

    move/from16 v16, v11

    invoke-interface {v8}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v11

    invoke-virtual {v15, v11}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v11

    if-eqz v11, :cond_20

    instance-of v11, v14, Lio/sentry/H2;

    if-eqz v11, :cond_20

    :cond_1f
    :goto_e
    move/from16 v11, v16

    goto :goto_d

    :cond_20
    invoke-interface {v8}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v11

    invoke-virtual {v9, v11}, Lio/sentry/protocol/c;->a(Ljava/lang/Object;)Z

    move-result v11

    if-nez v11, :cond_1f

    invoke-interface {v8}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Ljava/lang/String;

    invoke-virtual {v9, v8, v14}, Lio/sentry/protocol/c;->j(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_e

    :goto_f
    const-string v0, "transaction.json"

    const-class v8, Ljava/lang/String;

    invoke-virtual {v1, v5, v0, v8}, Lio/sentry/android/core/u;->b(Lio/sentry/v2;Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    iget-object v11, v2, Lio/sentry/R1;->v:Ljava/lang/String;

    if-nez v11, :cond_21

    iput-object v0, v2, Lio/sentry/R1;->v:Ljava/lang/String;

    :cond_21
    const-string v0, "fingerprint.json"

    invoke-virtual {v1, v5, v0, v4}, Lio/sentry/android/core/u;->b(Lio/sentry/v2;Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/List;

    iget-object v4, v2, Lio/sentry/R1;->w:Ljava/util/List;

    if-nez v4, :cond_23

    if-eqz v0, :cond_22

    new-instance v4, Ljava/util/ArrayList;

    invoke-direct {v4, v0}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    goto :goto_10

    :cond_22
    const/4 v4, 0x0

    :goto_10
    iput-object v4, v2, Lio/sentry/R1;->w:Ljava/util/List;

    :cond_23
    invoke-static {v6}, Lio/sentry/android/core/u;->a(Lio/sentry/hints/b;)Z

    move-result v0

    iget-object v4, v2, Lio/sentry/R1;->w:Ljava/util/List;

    if-nez v4, :cond_26

    if-eqz v0, :cond_24

    const-string v0, "background-anr"

    goto :goto_11

    :cond_24
    const-string v0, "foreground-anr"

    :goto_11
    const-string v4, "{{ default }}"

    filled-new-array {v4, v0}, [Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    if-eqz v0, :cond_25

    new-instance v4, Ljava/util/ArrayList;

    invoke-direct {v4, v0}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    goto :goto_12

    :cond_25
    const/4 v4, 0x0

    :goto_12
    iput-object v4, v2, Lio/sentry/R1;->w:Ljava/util/List;

    :cond_26
    const-string v0, "level.json"

    const-class v4, Lio/sentry/a2;

    invoke-virtual {v1, v5, v0, v4}, Lio/sentry/android/core/u;->b(Lio/sentry/v2;Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lio/sentry/a2;

    iget-object v4, v2, Lio/sentry/R1;->u:Lio/sentry/a2;

    if-nez v4, :cond_27

    iput-object v0, v2, Lio/sentry/R1;->u:Lio/sentry/a2;

    :cond_27
    const-string v0, "trace.json"

    const-class v4, Lio/sentry/H2;

    invoke-virtual {v1, v5, v0, v4}, Lio/sentry/android/core/u;->b(Lio/sentry/v2;Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lio/sentry/H2;

    invoke-virtual {v9}, Lio/sentry/protocol/c;->h()Lio/sentry/H2;

    move-result-object v4

    if-nez v4, :cond_28

    if-eqz v0, :cond_28

    iget-object v4, v0, Lio/sentry/H2;->b:Lio/sentry/K2;

    if-eqz v4, :cond_28

    iget-object v4, v0, Lio/sentry/H2;->a:Lio/sentry/protocol/t;

    if-eqz v4, :cond_28

    invoke-virtual {v9, v0}, Lio/sentry/protocol/c;->t(Lio/sentry/H2;)V

    :cond_28
    const-string v0, "replay.json"

    invoke-virtual {v1, v5, v0, v8}, Lio/sentry/android/core/u;->b(Lio/sentry/v2;Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/String;

    new-instance v11, Ljava/io/File;

    invoke-virtual {v5}, Lio/sentry/v2;->getCacheDirPath()Ljava/lang/String;

    move-result-object v14

    const-string v15, "replay_"

    invoke-static {v15, v4}, LEy;->r(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-direct {v11, v14, v1}, Ljava/io/File;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v11}, Ljava/io/File;->exists()Z

    move-result v1

    const-string v11, ".options-cache"

    if-nez v1, :cond_2e

    const-string v1, "replay-error-sample-rate.json"

    invoke-static {v5, v11, v1, v8}, Lio/sentry/cache/a;->c(Lio/sentry/v2;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    if-nez v1, :cond_29

    goto/16 :goto_17

    :cond_29
    :try_start_2
    invoke-static {v1}, Ljava/lang/Double;->parseDouble(Ljava/lang/String;)D

    move-result-wide v17

    invoke-static {}, Lio/sentry/util/h;->a()Lio/sentry/util/g;

    move-result-object v1

    invoke-virtual {v1}, Lio/sentry/util/g;->c()D

    move-result-wide v19

    cmpg-double v1, v17, v19

    if-gez v1, :cond_2a

    invoke-virtual {v5}, Lio/sentry/v2;->getLogger()Lio/sentry/ILogger;

    move-result-object v0

    sget-object v1, Lio/sentry/a2;->DEBUG:Lio/sentry/a2;

    const-string v4, "Not capturing replay for ANR %s due to not being sampled."

    iget-object v14, v2, Lio/sentry/C1;->a:Lio/sentry/protocol/t;

    filled-new-array {v14}, [Ljava/lang/Object;

    move-result-object v14

    invoke-interface {v0, v1, v4, v14}, Lio/sentry/ILogger;->e(Lio/sentry/a2;Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    goto/16 :goto_17

    :catchall_2
    move-exception v0

    goto/16 :goto_15

    :cond_2a
    new-instance v1, Ljava/io/File;

    invoke-virtual {v5}, Lio/sentry/v2;->getCacheDirPath()Ljava/lang/String;

    move-result-object v4

    invoke-direct {v1, v4}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1}, Ljava/io/File;->listFiles()[Ljava/io/File;

    move-result-object v1

    if-eqz v1, :cond_2d

    array-length v4, v1

    const-wide/high16 v17, -0x8000000000000000L

    move-wide/from16 v18, v17

    const/4 v14, 0x0

    const/16 v17, 0x0

    :goto_13
    if-ge v14, v4, :cond_2c

    aget-object v20, v1, v14

    invoke-virtual/range {v20 .. v20}, Ljava/io/File;->isDirectory()Z

    move-result v21

    move-object/from16 p2, v1

    if-eqz v21, :cond_2b

    invoke-virtual/range {v20 .. v20}, Ljava/io/File;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1, v15}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_2b

    invoke-virtual/range {v20 .. v20}, Ljava/io/File;->lastModified()J

    move-result-wide v21

    cmp-long v1, v21, v18

    if-lez v1, :cond_2b

    invoke-virtual/range {v20 .. v20}, Ljava/io/File;->lastModified()J

    move-result-wide v21

    iget-object v1, v2, Lio/sentry/R1;->p:Ljava/util/Date;

    invoke-virtual {v1}, Ljava/util/Date;->clone()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/Date;

    invoke-virtual {v1}, Ljava/util/Date;->getTime()J

    move-result-wide v23

    cmp-long v1, v21, v23

    if-gtz v1, :cond_2b

    invoke-virtual/range {v20 .. v20}, Ljava/io/File;->lastModified()J

    move-result-wide v17

    invoke-virtual/range {v20 .. v20}, Ljava/io/File;->getName()Ljava/lang/String;

    move-result-object v1

    move/from16 v20, v4

    const/4 v4, 0x7

    invoke-virtual {v1, v4}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v1

    move-wide/from16 v18, v17

    move-object/from16 v17, v1

    goto :goto_14

    :cond_2b
    move/from16 v20, v4

    :goto_14
    add-int/lit8 v14, v14, 0x1

    move-object/from16 v1, p2

    move/from16 v4, v20

    goto :goto_13

    :cond_2c
    move-object/from16 v4, v17

    goto :goto_16

    :cond_2d
    const/4 v4, 0x0

    goto :goto_16

    :goto_15
    invoke-virtual {v5}, Lio/sentry/v2;->getLogger()Lio/sentry/ILogger;

    move-result-object v1

    sget-object v4, Lio/sentry/a2;->ERROR:Lio/sentry/a2;

    const-string v14, "Error parsing replay sample rate."

    invoke-interface {v1, v4, v14, v0}, Lio/sentry/ILogger;->r(Lio/sentry/a2;Ljava/lang/String;Ljava/lang/Throwable;)V

    goto :goto_17

    :cond_2e
    :goto_16
    if-nez v4, :cond_2f

    goto :goto_17

    :cond_2f
    sget-object v1, Lio/sentry/cache/f;->c:Ljava/nio/charset/Charset;

    const-string v1, ".scope-cache"

    invoke-static {v5, v4, v1, v0}, Lio/sentry/cache/a;->d(Lio/sentry/v2;Ljava/lang/Object;Ljava/lang/String;Ljava/lang/String;)V

    const-string v0, "replay_id"

    invoke-virtual {v9, v0, v4}, Lio/sentry/protocol/c;->j(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/Object;

    :goto_17
    iget-object v0, v2, Lio/sentry/C1;->f:Ljava/lang/String;

    const-string v1, "release.json"

    if-nez v0, :cond_30

    invoke-static {v5, v11, v1, v8}, Lio/sentry/cache/a;->c(Lio/sentry/v2;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    iput-object v0, v2, Lio/sentry/C1;->f:Ljava/lang/String;

    :cond_30
    iget-object v0, v2, Lio/sentry/C1;->g:Ljava/lang/String;

    if-nez v0, :cond_32

    const-string v0, "environment.json"

    invoke-static {v5, v11, v0, v8}, Lio/sentry/cache/a;->c(Lio/sentry/v2;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    if-eqz v0, :cond_31

    goto :goto_18

    :cond_31
    invoke-virtual {v5}, Lio/sentry/v2;->getEnvironment()Ljava/lang/String;

    move-result-object v0

    :goto_18
    iput-object v0, v2, Lio/sentry/C1;->g:Ljava/lang/String;

    :cond_32
    iget-object v0, v2, Lio/sentry/C1;->l:Ljava/lang/String;

    if-nez v0, :cond_33

    const-string v0, "dist.json"

    invoke-static {v5, v11, v0, v8}, Lio/sentry/cache/a;->c(Lio/sentry/v2;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    iput-object v0, v2, Lio/sentry/C1;->l:Ljava/lang/String;

    :cond_33
    iget-object v0, v2, Lio/sentry/C1;->l:Ljava/lang/String;

    const-string v4, "Failed to parse release from scope cache: %s"

    const/16 v14, 0x2b

    if-nez v0, :cond_34

    invoke-static {v5, v11, v1, v8}, Lio/sentry/cache/a;->c(Lio/sentry/v2;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    if-eqz v0, :cond_34

    :try_start_3
    invoke-virtual {v0, v14}, Ljava/lang/String;->indexOf(I)I

    move-result v15

    add-int/lit8 v15, v15, 0x1

    invoke-virtual {v0, v15}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v15

    iput-object v15, v2, Lio/sentry/C1;->l:Ljava/lang/String;
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_3

    goto :goto_19

    :catchall_3
    invoke-virtual {v5}, Lio/sentry/v2;->getLogger()Lio/sentry/ILogger;

    move-result-object v15

    sget-object v14, Lio/sentry/a2;->WARNING:Lio/sentry/a2;

    filled-new-array {v0}, [Ljava/lang/Object;

    move-result-object v0

    invoke-interface {v15, v14, v4, v0}, Lio/sentry/ILogger;->e(Lio/sentry/a2;Ljava/lang/String;[Ljava/lang/Object;)V

    :cond_34
    :goto_19
    iget-object v0, v2, Lio/sentry/C1;->n:Lio/sentry/protocol/d;

    if-nez v0, :cond_35

    new-instance v0, Lio/sentry/protocol/d;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    :cond_35
    iget-object v14, v0, Lio/sentry/protocol/d;->b:Ljava/util/List;

    if-nez v14, :cond_36

    new-instance v14, Ljava/util/ArrayList;

    invoke-direct {v14}, Ljava/util/ArrayList;-><init>()V

    new-instance v15, Ljava/util/ArrayList;

    invoke-direct {v15, v14}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    iput-object v15, v0, Lio/sentry/protocol/d;->b:Ljava/util/List;

    :cond_36
    iget-object v14, v0, Lio/sentry/protocol/d;->b:Ljava/util/List;

    if-eqz v14, :cond_38

    const-string v15, "proguard-uuid.json"

    invoke-static {v5, v11, v15, v8}, Lio/sentry/cache/a;->c(Lio/sentry/v2;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v15

    check-cast v15, Ljava/lang/String;

    move-object/from16 v17, v6

    if-eqz v15, :cond_37

    new-instance v6, Lio/sentry/protocol/DebugImage;

    invoke-direct {v6}, Lio/sentry/protocol/DebugImage;-><init>()V

    move-object/from16 v18, v7

    const-string v7, "proguard"

    invoke-virtual {v6, v7}, Lio/sentry/protocol/DebugImage;->setType(Ljava/lang/String;)V

    invoke-virtual {v6, v15}, Lio/sentry/protocol/DebugImage;->setUuid(Ljava/lang/String;)V

    invoke-interface {v14, v6}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_1a

    :cond_37
    move-object/from16 v18, v7

    :goto_1a
    iput-object v0, v2, Lio/sentry/C1;->n:Lio/sentry/protocol/d;

    goto :goto_1b

    :cond_38
    move-object/from16 v17, v6

    move-object/from16 v18, v7

    :goto_1b
    iget-object v0, v2, Lio/sentry/C1;->c:Lio/sentry/protocol/r;

    if-nez v0, :cond_39

    const-string v0, "sdk-version.json"

    const-class v6, Lio/sentry/protocol/r;

    invoke-static {v5, v11, v0, v6}, Lio/sentry/cache/a;->c(Lio/sentry/v2;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lio/sentry/protocol/r;

    iput-object v0, v2, Lio/sentry/C1;->c:Lio/sentry/protocol/r;

    :cond_39
    invoke-virtual {v9}, Lio/sentry/protocol/c;->d()Lio/sentry/protocol/a;

    move-result-object v0

    if-nez v0, :cond_3a

    new-instance v0, Lio/sentry/protocol/a;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    :cond_3a
    move-object v6, v0

    sget-object v0, Lio/sentry/android/core/H;->c:LBb;

    invoke-virtual {v0, v3}, LBb;->b(Landroid/content/Context;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    iput-object v0, v6, Lio/sentry/protocol/a;->e:Ljava/lang/String;

    invoke-static/range {v17 .. v17}, Lio/sentry/android/core/u;->a(Lio/sentry/hints/b;)Z

    move-result v0

    xor-int/lit8 v0, v0, 0x1

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    iput-object v0, v6, Lio/sentry/protocol/a;->k:Ljava/lang/Boolean;

    invoke-static {v3, v10}, Lio/sentry/android/core/H;->c(Landroid/content/Context;Lio/sentry/android/core/I;)Landroid/content/pm/PackageInfo;

    move-result-object v0

    if-eqz v0, :cond_3b

    iget-object v0, v0, Landroid/content/pm/PackageInfo;->packageName:Ljava/lang/String;

    iput-object v0, v6, Lio/sentry/protocol/a;->a:Ljava/lang/String;

    :cond_3b
    iget-object v0, v2, Lio/sentry/C1;->f:Ljava/lang/String;

    if-eqz v0, :cond_3c

    goto :goto_1c

    :cond_3c
    invoke-static {v5, v11, v1, v8}, Lio/sentry/cache/a;->c(Lio/sentry/v2;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    :goto_1c
    if-eqz v0, :cond_3d

    const/16 v1, 0x40

    :try_start_4
    invoke-virtual {v0, v1}, Ljava/lang/String;->indexOf(I)I

    move-result v1

    add-int/lit8 v1, v1, 0x1

    const/16 v7, 0x2b

    invoke-virtual {v0, v7}, Ljava/lang/String;->indexOf(I)I

    move-result v8

    invoke-virtual {v0, v1, v8}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v7}, Ljava/lang/String;->indexOf(I)I

    move-result v7

    add-int/lit8 v7, v7, 0x1

    invoke-virtual {v0, v7}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v7

    iput-object v1, v6, Lio/sentry/protocol/a;->f:Ljava/lang/String;

    iput-object v7, v6, Lio/sentry/protocol/a;->g:Ljava/lang/String;
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_4

    goto :goto_1d

    :catchall_4
    invoke-virtual {v5}, Lio/sentry/v2;->getLogger()Lio/sentry/ILogger;

    move-result-object v1

    sget-object v7, Lio/sentry/a2;->WARNING:Lio/sentry/a2;

    filled-new-array {v0}, [Ljava/lang/Object;

    move-result-object v0

    invoke-interface {v1, v7, v4, v0}, Lio/sentry/ILogger;->e(Lio/sentry/a2;Ljava/lang/String;[Ljava/lang/Object;)V

    :cond_3d
    :goto_1d
    :try_start_5
    invoke-static {v3, v5}, Lio/sentry/android/core/M;->c(Landroid/content/Context;Lio/sentry/android/core/SentryAndroidOptions;)Lio/sentry/android/core/M;

    move-result-object v0

    iget-object v0, v0, Lio/sentry/android/core/M;->f:LY5;

    if-eqz v0, :cond_3e

    iget-boolean v1, v0, LY5;->a:Z

    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    iput-object v1, v6, Lio/sentry/protocol/a;->l:Ljava/lang/Boolean;

    iget-object v0, v0, LY5;->b:Ljava/lang/Object;

    check-cast v0, [Ljava/lang/String;

    if-eqz v0, :cond_3e

    invoke-static {v0}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    iput-object v0, v6, Lio/sentry/protocol/a;->m:Ljava/util/List;
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_5

    goto :goto_1e

    :catchall_5
    move-exception v0

    invoke-virtual {v5}, Lio/sentry/v2;->getLogger()Lio/sentry/ILogger;

    move-result-object v1

    sget-object v4, Lio/sentry/a2;->ERROR:Lio/sentry/a2;

    const-string v7, "Error getting split apks info."

    invoke-interface {v1, v4, v7, v0}, Lio/sentry/ILogger;->r(Lio/sentry/a2;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_3e
    :goto_1e
    invoke-virtual {v9, v6}, Lio/sentry/protocol/c;->l(Lio/sentry/protocol/a;)V

    invoke-static {v5, v11, v12, v13}, Lio/sentry/cache/a;->c(Lio/sentry/v2;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Map;

    if-nez v0, :cond_3f

    goto :goto_20

    :cond_3f
    iget-object v1, v2, Lio/sentry/C1;->e:Ljava/util/AbstractMap;

    if-nez v1, :cond_40

    new-instance v1, Ljava/util/HashMap;

    invoke-direct {v1, v0}, Ljava/util/HashMap;-><init>(Ljava/util/Map;)V

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0, v1}, Ljava/util/HashMap;-><init>(Ljava/util/Map;)V

    iput-object v0, v2, Lio/sentry/C1;->e:Ljava/util/AbstractMap;

    goto :goto_20

    :cond_40
    invoke-interface {v0}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_41
    :goto_1f
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_42

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/Map$Entry;

    iget-object v4, v2, Lio/sentry/C1;->e:Ljava/util/AbstractMap;

    invoke-interface {v1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v6

    invoke-interface {v4, v6}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_41

    invoke-interface {v1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/String;

    invoke-interface {v1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    invoke-virtual {v2, v4, v1}, Lio/sentry/C1;->b(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_1f

    :cond_42
    :goto_20
    iget-object v0, v2, Lio/sentry/C1;->i:Lio/sentry/protocol/E;

    if-nez v0, :cond_43

    new-instance v0, Lio/sentry/protocol/E;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    iput-object v0, v2, Lio/sentry/C1;->i:Lio/sentry/protocol/E;

    :cond_43
    move-object v1, v0

    iget-object v0, v1, Lio/sentry/protocol/E;->b:Ljava/lang/String;

    if-nez v0, :cond_44

    :try_start_6
    invoke-static {v3}, Lio/sentry/android/core/S;->a(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v8
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_6

    goto :goto_21

    :catchall_6
    move-exception v0

    invoke-virtual {v5}, Lio/sentry/v2;->getLogger()Lio/sentry/ILogger;

    move-result-object v4

    sget-object v6, Lio/sentry/a2;->ERROR:Lio/sentry/a2;

    move-object/from16 v7, v18

    invoke-interface {v4, v6, v7, v0}, Lio/sentry/ILogger;->r(Lio/sentry/a2;Ljava/lang/String;Ljava/lang/Throwable;)V

    const/4 v8, 0x0

    :goto_21
    iput-object v8, v1, Lio/sentry/protocol/E;->b:Ljava/lang/String;

    :cond_44
    iget-object v0, v1, Lio/sentry/protocol/E;->d:Ljava/lang/String;

    if-nez v0, :cond_45

    invoke-virtual {v5}, Lio/sentry/v2;->isSendDefaultPii()Z

    move-result v0

    if-eqz v0, :cond_45

    const-string v0, "{{auto}}"

    iput-object v0, v1, Lio/sentry/protocol/E;->d:Ljava/lang/String;

    :cond_45
    :try_start_7
    invoke-static {v3, v5}, Lio/sentry/android/core/M;->c(Landroid/content/Context;Lio/sentry/android/core/SentryAndroidOptions;)Lio/sentry/android/core/M;

    move-result-object v0

    iget-object v0, v0, Lio/sentry/android/core/M;->e:LY5;

    if-eqz v0, :cond_47

    new-instance v1, Ljava/util/HashMap;

    invoke-direct {v1}, Ljava/util/HashMap;-><init>()V

    const-string v3, "isSideLoaded"

    iget-boolean v4, v0, LY5;->a:Z

    invoke-static {v4}, Ljava/lang/String;->valueOf(Z)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v1, v3, v4}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v0, v0, LY5;->b:Ljava/lang/Object;

    check-cast v0, Ljava/lang/String;

    if-eqz v0, :cond_46

    const-string v3, "installerStore"

    invoke-virtual {v1, v3, v0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_46
    invoke-virtual {v1}, Ljava/util/HashMap;->entrySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_22
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_47

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/Map$Entry;

    invoke-interface {v1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    invoke-interface {v1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    invoke-virtual {v2, v3, v1}, Lio/sentry/C1;->b(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_7

    goto :goto_22

    :catchall_7
    move-exception v0

    invoke-virtual {v5}, Lio/sentry/v2;->getLogger()Lio/sentry/ILogger;

    move-result-object v1

    sget-object v3, Lio/sentry/a2;->ERROR:Lio/sentry/a2;

    const-string v4, "Error getting side loaded info."

    invoke-interface {v1, v3, v4, v0}, Lio/sentry/ILogger;->r(Lio/sentry/a2;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_47
    return-object v2
.end method
