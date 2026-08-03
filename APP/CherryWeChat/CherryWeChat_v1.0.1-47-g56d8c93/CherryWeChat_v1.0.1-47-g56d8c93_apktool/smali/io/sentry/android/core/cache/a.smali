.class public final Lio/sentry/android/core/cache/a;
.super Lio/sentry/cache/c;
.source ""


# static fields
.field public static final synthetic k:I


# instance fields
.field public final j:Lio/sentry/android/core/internal/util/c;


# direct methods
.method public constructor <init>(Lio/sentry/android/core/SentryAndroidOptions;)V
    .locals 2

    invoke-virtual {p1}, Lio/sentry/v2;->getCacheDirPath()Ljava/lang/String;

    move-result-object v0

    const-string v1, "cacheDirPath must not be null"

    invoke-static {v1, v0}, Lio/sentry/config/a;->D(Ljava/lang/String;Ljava/lang/Object;)V

    invoke-virtual {p1}, Lio/sentry/v2;->getMaxCacheItems()I

    move-result v1

    invoke-direct {p0, p1, v0, v1}, Lio/sentry/cache/c;-><init>(Lio/sentry/v2;Ljava/lang/String;I)V

    sget-object p1, Lio/sentry/android/core/internal/util/c;->a:Lio/sentry/android/core/internal/util/c;

    iput-object p1, p0, Lio/sentry/android/core/cache/a;->j:Lio/sentry/android/core/internal/util/c;

    return-void
.end method


# virtual methods
.method public final i(Lio/sentry/internal/debugmeta/c;Lio/sentry/H;)Z
    .locals 7

    invoke-super {p0, p1, p2}, Lio/sentry/cache/c;->i(Lio/sentry/internal/debugmeta/c;Lio/sentry/H;)Z

    move-result p1

    iget-object v0, p0, Lio/sentry/cache/c;->a:Lio/sentry/v2;

    move-object v1, v0

    check-cast v1, Lio/sentry/android/core/SentryAndroidOptions;

    invoke-static {}, Lio/sentry/android/core/performance/f;->b()Lio/sentry/android/core/performance/f;

    move-result-object v2

    iget-object v2, v2, Lio/sentry/android/core/performance/f;->d:Lio/sentry/android/core/performance/g;

    const-class v3, Lio/sentry/R2;

    invoke-static {p2}, Lio/sentry/config/a;->s(Lio/sentry/H;)Ljava/lang/Object;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/lang/Class;->isInstance(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_1

    invoke-virtual {v2}, Lio/sentry/android/core/performance/g;->b()Z

    move-result v3

    if-eqz v3, :cond_1

    iget-object v3, p0, Lio/sentry/android/core/cache/a;->j:Lio/sentry/android/core/internal/util/c;

    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {}, Landroid/os/SystemClock;->uptimeMillis()J

    move-result-wide v3

    iget-wide v5, v2, Lio/sentry/android/core/performance/g;->c:J

    sub-long/2addr v3, v5

    invoke-virtual {v1}, Lio/sentry/android/core/SentryAndroidOptions;->getStartupCrashDurationThresholdMillis()J

    move-result-wide v5

    cmp-long v2, v3, v5

    if-gtz v2, :cond_1

    invoke-virtual {v1}, Lio/sentry/v2;->getLogger()Lio/sentry/ILogger;

    move-result-object v2

    sget-object v5, Lio/sentry/a2;->DEBUG:Lio/sentry/a2;

    invoke-static {v3, v4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v3

    filled-new-array {v3}, [Ljava/lang/Object;

    move-result-object v3

    const-string v4, "Startup Crash detected %d milliseconds after SDK init. Writing a startup crash marker file to disk."

    invoke-interface {v2, v5, v4, v3}, Lio/sentry/ILogger;->e(Lio/sentry/a2;Ljava/lang/String;[Ljava/lang/Object;)V

    invoke-virtual {v0}, Lio/sentry/v2;->getOutboxPath()Ljava/lang/String;

    move-result-object v2

    if-nez v2, :cond_0

    invoke-virtual {v0}, Lio/sentry/v2;->getLogger()Lio/sentry/ILogger;

    move-result-object v0

    const/4 v2, 0x0

    new-array v2, v2, [Ljava/lang/Object;

    const-string v3, "Outbox path is null, the startup crash marker file will not be written"

    invoke-interface {v0, v5, v3, v2}, Lio/sentry/ILogger;->e(Lio/sentry/a2;Ljava/lang/String;[Ljava/lang/Object;)V

    goto :goto_0

    :cond_0
    new-instance v3, Ljava/io/File;

    const-string v4, "startup_crash"

    invoke-direct {v3, v2, v4}, Ljava/io/File;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    :try_start_0
    invoke-virtual {v3}, Ljava/io/File;->createNewFile()Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception v2

    invoke-virtual {v0}, Lio/sentry/v2;->getLogger()Lio/sentry/ILogger;

    move-result-object v0

    sget-object v3, Lio/sentry/a2;->ERROR:Lio/sentry/a2;

    const-string v4, "Error writing the startup crash marker file to the disk"

    invoke-interface {v0, v3, v4, v2}, Lio/sentry/ILogger;->r(Lio/sentry/a2;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_1
    :goto_0
    new-instance v0, LQ9;

    const/16 v2, 0x9

    invoke-direct {v0, v2, p0, v1}, LQ9;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    invoke-static {p2}, Lio/sentry/config/a;->s(Lio/sentry/H;)Ljava/lang/Object;

    move-result-object v1

    invoke-static {p2}, Lio/sentry/config/a;->s(Lio/sentry/H;)Ljava/lang/Object;

    move-result-object p2

    const-class v2, Lio/sentry/android/core/x;

    invoke-virtual {v2, p2}, Ljava/lang/Class;->isInstance(Ljava/lang/Object;)Z

    move-result p2

    if-eqz p2, :cond_3

    if-eqz v1, :cond_3

    iget-object p2, v0, LQ9;->b:Ljava/lang/Object;

    check-cast p2, Lio/sentry/android/core/cache/a;

    iget-object v0, v0, LQ9;->c:Ljava/lang/Object;

    check-cast v0, Lio/sentry/android/core/SentryAndroidOptions;

    check-cast v1, Lio/sentry/android/core/x;

    iget-wide v1, v1, Lio/sentry/android/core/x;->d:J

    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    invoke-virtual {v0}, Lio/sentry/v2;->getLogger()Lio/sentry/ILogger;

    move-result-object v0

    sget-object v2, Lio/sentry/a2;->DEBUG:Lio/sentry/a2;

    const-string v3, "Writing last reported ANR marker with timestamp %d"

    filled-new-array {v1}, [Ljava/lang/Object;

    move-result-object v4

    invoke-interface {v0, v2, v3, v4}, Lio/sentry/ILogger;->e(Lio/sentry/a2;Ljava/lang/String;[Ljava/lang/Object;)V

    iget-object p2, p2, Lio/sentry/cache/c;->a:Lio/sentry/v2;

    invoke-virtual {p2}, Lio/sentry/v2;->getCacheDirPath()Ljava/lang/String;

    move-result-object v0

    if-nez v0, :cond_2

    invoke-virtual {p2}, Lio/sentry/v2;->getLogger()Lio/sentry/ILogger;

    move-result-object p2

    const/4 v0, 0x0

    new-array v0, v0, [Ljava/lang/Object;

    const-string v1, "Cache dir path is null, the ANR marker will not be written"

    invoke-interface {p2, v2, v1, v0}, Lio/sentry/ILogger;->e(Lio/sentry/a2;Ljava/lang/String;[Ljava/lang/Object;)V

    goto :goto_3

    :cond_2
    new-instance v2, Ljava/io/File;

    const-string v3, "last_anr_report"

    invoke-direct {v2, v0, v3}, Ljava/io/File;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    :try_start_1
    new-instance v0, Ljava/io/FileOutputStream;

    invoke-direct {v0, v2}, Ljava/io/FileOutputStream;-><init>(Ljava/io/File;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    :try_start_2
    invoke-static {v1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    sget-object v2, Lio/sentry/cache/c;->i:Ljava/nio/charset/Charset;

    invoke-virtual {v1, v2}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/io/OutputStream;->write([B)V

    invoke-virtual {v0}, Ljava/io/OutputStream;->flush()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    :try_start_3
    invoke-virtual {v0}, Ljava/io/OutputStream;->close()V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    goto :goto_3

    :catchall_1
    move-exception v0

    goto :goto_2

    :catchall_2
    move-exception v1

    :try_start_4
    invoke-virtual {v0}, Ljava/io/OutputStream;->close()V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_3

    goto :goto_1

    :catchall_3
    move-exception v0

    :try_start_5
    invoke-virtual {v1, v0}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_1
    throw v1
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_1

    :goto_2
    invoke-virtual {p2}, Lio/sentry/v2;->getLogger()Lio/sentry/ILogger;

    move-result-object p2

    sget-object v1, Lio/sentry/a2;->ERROR:Lio/sentry/a2;

    const-string v2, "Error writing the ANR marker to the disk"

    invoke-interface {p2, v1, v2, v0}, Lio/sentry/ILogger;->r(Lio/sentry/a2;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_3
    :goto_3
    return p1
.end method
