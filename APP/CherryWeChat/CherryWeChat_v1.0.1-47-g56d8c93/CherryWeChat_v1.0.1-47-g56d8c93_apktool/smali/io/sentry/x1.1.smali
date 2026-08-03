.class public final Lio/sentry/x1;
.super Ljava/lang/Object;
.source ""


# instance fields
.field public final synthetic a:I

.field public final b:Lio/sentry/android/core/l;


# direct methods
.method public synthetic constructor <init>(Lio/sentry/android/core/l;I)V
    .locals 0

    iput p2, p0, Lio/sentry/x1;->a:I

    iput-object p1, p0, Lio/sentry/x1;->b:Lio/sentry/android/core/l;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static b(Ljava/lang/String;Lio/sentry/ILogger;)Z
    .locals 3

    if-eqz p0, :cond_1

    invoke-virtual {p0}, Ljava/lang/String;->isEmpty()Z

    move-result p0

    if-eqz p0, :cond_0

    goto :goto_0

    :cond_0
    const/4 p0, 0x1

    return p0

    :cond_1
    :goto_0
    sget-object p0, Lio/sentry/a2;->INFO:Lio/sentry/a2;

    const-string v0, "No cached dir path is defined in options."

    const/4 v1, 0x0

    new-array v2, v1, [Ljava/lang/Object;

    invoke-interface {p1, p0, v0, v2}, Lio/sentry/ILogger;->e(Lio/sentry/a2;Ljava/lang/String;[Ljava/lang/Object;)V

    return v1
.end method


# virtual methods
.method public final a(Lio/sentry/Z;Lio/sentry/v2;)Lid;
    .locals 10

    iget v0, p0, Lio/sentry/x1;->a:I

    packed-switch v0, :pswitch_data_0

    const-string v0, "Scopes are required"

    invoke-static {v0, p1}, Lio/sentry/config/a;->D(Ljava/lang/String;Ljava/lang/Object;)V

    const-string v0, "SentryOptions is required"

    invoke-static {v0, p2}, Lio/sentry/config/a;->D(Ljava/lang/String;Ljava/lang/Object;)V

    iget-object v0, p0, Lio/sentry/x1;->b:Lio/sentry/android/core/l;

    iget-object v0, v0, Lio/sentry/android/core/l;->a:Lio/sentry/android/core/SentryAndroidOptions;

    invoke-virtual {v0}, Lio/sentry/v2;->getOutboxPath()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_1

    invoke-virtual {p2}, Lio/sentry/v2;->getLogger()Lio/sentry/ILogger;

    move-result-object v1

    invoke-static {v0, v1}, Lio/sentry/x1;->b(Ljava/lang/String;Lio/sentry/ILogger;)Z

    move-result v1

    if-nez v1, :cond_0

    goto :goto_0

    :cond_0
    new-instance v2, Lio/sentry/a1;

    invoke-virtual {p2}, Lio/sentry/v2;->getEnvelopeReader()Lio/sentry/Q;

    move-result-object v4

    invoke-virtual {p2}, Lio/sentry/v2;->getSerializer()Lio/sentry/e0;

    move-result-object v5

    invoke-virtual {p2}, Lio/sentry/v2;->getLogger()Lio/sentry/ILogger;

    move-result-object v6

    invoke-virtual {p2}, Lio/sentry/v2;->getFlushTimeoutMillis()J

    move-result-wide v7

    invoke-virtual {p2}, Lio/sentry/v2;->getMaxQueueSize()I

    move-result v9

    move-object v3, p1

    invoke-direct/range {v2 .. v9}, Lio/sentry/a1;-><init>(Lio/sentry/Z;Lio/sentry/Q;Lio/sentry/e0;Lio/sentry/ILogger;JI)V

    invoke-virtual {p2}, Lio/sentry/v2;->getLogger()Lio/sentry/ILogger;

    move-result-object p1

    new-instance p2, Ljava/io/File;

    invoke-direct {p2, v0}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    new-instance v1, Lid;

    invoke-direct {v1, p1, v0, v2, p2}, Lid;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    goto :goto_1

    :cond_1
    :goto_0
    invoke-virtual {p2}, Lio/sentry/v2;->getLogger()Lio/sentry/ILogger;

    move-result-object p1

    sget-object p2, Lio/sentry/a2;->ERROR:Lio/sentry/a2;

    const/4 v0, 0x0

    new-array v0, v0, [Ljava/lang/Object;

    const-string v1, "No outbox dir path is defined in options."

    invoke-interface {p1, p2, v1, v0}, Lio/sentry/ILogger;->e(Lio/sentry/a2;Ljava/lang/String;[Ljava/lang/Object;)V

    const/4 v1, 0x0

    :goto_1
    return-object v1

    :pswitch_0
    move-object v3, p1

    const-string p1, "Scopes are required"

    invoke-static {p1, v3}, Lio/sentry/config/a;->D(Ljava/lang/String;Ljava/lang/Object;)V

    const-string p1, "SentryOptions is required"

    invoke-static {p1, p2}, Lio/sentry/config/a;->D(Ljava/lang/String;Ljava/lang/Object;)V

    iget-object p1, p0, Lio/sentry/x1;->b:Lio/sentry/android/core/l;

    iget-object p1, p1, Lio/sentry/android/core/l;->a:Lio/sentry/android/core/SentryAndroidOptions;

    invoke-virtual {p1}, Lio/sentry/v2;->getCacheDirPath()Ljava/lang/String;

    move-result-object p1

    if-eqz p1, :cond_3

    invoke-virtual {p2}, Lio/sentry/v2;->getLogger()Lio/sentry/ILogger;

    move-result-object v0

    invoke-static {p1, v0}, Lio/sentry/x1;->b(Ljava/lang/String;Lio/sentry/ILogger;)Z

    move-result v0

    if-nez v0, :cond_2

    goto :goto_2

    :cond_2
    new-instance v2, Lio/sentry/B;

    invoke-virtual {p2}, Lio/sentry/v2;->getSerializer()Lio/sentry/e0;

    move-result-object v4

    invoke-virtual {p2}, Lio/sentry/v2;->getLogger()Lio/sentry/ILogger;

    move-result-object v5

    invoke-virtual {p2}, Lio/sentry/v2;->getFlushTimeoutMillis()J

    move-result-wide v6

    invoke-virtual {p2}, Lio/sentry/v2;->getMaxQueueSize()I

    move-result v8

    invoke-direct/range {v2 .. v8}, Lio/sentry/B;-><init>(Lio/sentry/Z;Lio/sentry/e0;Lio/sentry/ILogger;JI)V

    invoke-virtual {p2}, Lio/sentry/v2;->getLogger()Lio/sentry/ILogger;

    move-result-object p2

    new-instance v0, Ljava/io/File;

    invoke-direct {v0, p1}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    new-instance v1, Lid;

    invoke-direct {v1, p2, p1, v2, v0}, Lid;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    goto :goto_3

    :cond_3
    :goto_2
    invoke-virtual {p2}, Lio/sentry/v2;->getLogger()Lio/sentry/ILogger;

    move-result-object p1

    sget-object p2, Lio/sentry/a2;->ERROR:Lio/sentry/a2;

    const/4 v0, 0x0

    new-array v0, v0, [Ljava/lang/Object;

    const-string v1, "No cache dir path is defined in options."

    invoke-interface {p1, p2, v1, v0}, Lio/sentry/ILogger;->e(Lio/sentry/a2;Ljava/lang/String;[Ljava/lang/Object;)V

    const/4 v1, 0x0

    :goto_3
    return-object v1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
