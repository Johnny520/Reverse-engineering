.class public final Lio/sentry/android/ndk/b;
.super Lio/sentry/t1;
.source ""


# instance fields
.field public final a:Lio/sentry/v2;

.field public final b:Lio/sentry/ndk/NativeScope;


# direct methods
.method public constructor <init>(Lio/sentry/android/core/SentryAndroidOptions;)V
    .locals 2

    new-instance v0, Lio/sentry/ndk/NativeScope;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-string v1, "The SentryOptions object is required."

    invoke-static {v1, p1}, Lio/sentry/config/a;->D(Ljava/lang/String;Ljava/lang/Object;)V

    iput-object p1, p0, Lio/sentry/android/ndk/b;->a:Lio/sentry/v2;

    iput-object v0, p0, Lio/sentry/android/ndk/b;->b:Lio/sentry/ndk/NativeScope;

    return-void
.end method


# virtual methods
.method public final c(Lio/sentry/f;)V
    .locals 4

    iget-object v0, p0, Lio/sentry/android/ndk/b;->a:Lio/sentry/v2;

    :try_start_0
    invoke-virtual {v0}, Lio/sentry/v2;->getExecutorService()Lio/sentry/c0;

    move-result-object v1

    new-instance v2, Ln3;

    const/16 v3, 0x1a

    invoke-direct {v2, v3, p0, p1}, Ln3;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    invoke-interface {v1, v2}, Lio/sentry/c0;->submit(Ljava/lang/Runnable;)Ljava/util/concurrent/Future;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return-void

    :catchall_0
    move-exception p1

    invoke-virtual {v0}, Lio/sentry/v2;->getLogger()Lio/sentry/ILogger;

    move-result-object v0

    sget-object v1, Lio/sentry/a2;->ERROR:Lio/sentry/a2;

    const/4 v2, 0x0

    new-array v2, v2, [Ljava/lang/Object;

    const-string v3, "Scope sync addBreadcrumb has an error."

    invoke-interface {v0, v1, p1, v3, v2}, Lio/sentry/ILogger;->n(Lio/sentry/a2;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V

    return-void
.end method

.method public final d(Lio/sentry/H2;Lio/sentry/q1;)V
    .locals 3

    iget-object p2, p0, Lio/sentry/android/ndk/b;->a:Lio/sentry/v2;

    if-nez p1, :cond_0

    return-void

    :cond_0
    :try_start_0
    invoke-virtual {p2}, Lio/sentry/v2;->getExecutorService()Lio/sentry/c0;

    move-result-object v0

    new-instance v1, Ln3;

    const/16 v2, 0x1b

    invoke-direct {v1, v2, p0, p1}, Ln3;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    invoke-interface {v0, v1}, Lio/sentry/c0;->submit(Ljava/lang/Runnable;)Ljava/util/concurrent/Future;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return-void

    :catchall_0
    move-exception p1

    invoke-virtual {p2}, Lio/sentry/v2;->getLogger()Lio/sentry/ILogger;

    move-result-object p2

    sget-object v0, Lio/sentry/a2;->ERROR:Lio/sentry/a2;

    const/4 v1, 0x0

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "Scope sync setTrace failed."

    invoke-interface {p2, v0, p1, v2, v1}, Lio/sentry/ILogger;->n(Lio/sentry/a2;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V

    return-void
.end method
