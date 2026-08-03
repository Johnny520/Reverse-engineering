.class public final Lio/sentry/android/core/P;
.super Landroid/os/FileObserver;
.source ""


# instance fields
.field public final a:Ljava/lang/String;

.field public final b:Lio/sentry/a1;

.field public final c:Lio/sentry/ILogger;

.field public final d:J


# direct methods
.method public constructor <init>(Ljava/lang/String;Lio/sentry/a1;Lio/sentry/ILogger;J)V
    .locals 0

    invoke-direct {p0, p1}, Landroid/os/FileObserver;-><init>(Ljava/lang/String;)V

    iput-object p1, p0, Lio/sentry/android/core/P;->a:Ljava/lang/String;

    iput-object p2, p0, Lio/sentry/android/core/P;->b:Lio/sentry/a1;

    const-string p1, "Logger is required."

    invoke-static {p1, p3}, Lio/sentry/config/a;->D(Ljava/lang/String;Ljava/lang/Object;)V

    iput-object p3, p0, Lio/sentry/android/core/P;->c:Lio/sentry/ILogger;

    iput-wide p4, p0, Lio/sentry/android/core/P;->d:J

    return-void
.end method


# virtual methods
.method public final onEvent(ILjava/lang/String;)V
    .locals 5

    if-eqz p2, :cond_1

    const/16 v0, 0x8

    if-eq p1, v0, :cond_0

    goto :goto_0

    :cond_0
    sget-object v0, Lio/sentry/a2;->DEBUG:Lio/sentry/a2;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    iget-object v1, p0, Lio/sentry/android/core/P;->a:Ljava/lang/String;

    filled-new-array {p1, v1, p2}, [Ljava/lang/Object;

    move-result-object p1

    iget-object v2, p0, Lio/sentry/android/core/P;->c:Lio/sentry/ILogger;

    const-string v3, "onEvent fired for EnvelopeFileObserver with event type %d on path: %s for file %s."

    invoke-interface {v2, v0, v3, p1}, Lio/sentry/ILogger;->e(Lio/sentry/a2;Ljava/lang/String;[Ljava/lang/Object;)V

    new-instance p1, Lio/sentry/android/core/O;

    iget-wide v3, p0, Lio/sentry/android/core/P;->d:J

    invoke-direct {p1, v3, v4, v2}, Lio/sentry/android/core/O;-><init>(JLio/sentry/ILogger;)V

    invoke-static {p1}, Lio/sentry/config/a;->e(Ljava/lang/Object;)Lio/sentry/H;

    move-result-object p1

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    sget-object v1, Ljava/io/File;->separator:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    iget-object v0, p0, Lio/sentry/android/core/P;->b:Lio/sentry/a1;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const-string v1, "Path is required."

    invoke-static {v1, p2}, Lio/sentry/config/a;->D(Ljava/lang/String;Ljava/lang/Object;)V

    new-instance v1, Ljava/io/File;

    invoke-direct {v1, p2}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, v1, p1}, Lio/sentry/a1;->b(Ljava/io/File;Lio/sentry/H;)V

    :cond_1
    :goto_0
    return-void
.end method
