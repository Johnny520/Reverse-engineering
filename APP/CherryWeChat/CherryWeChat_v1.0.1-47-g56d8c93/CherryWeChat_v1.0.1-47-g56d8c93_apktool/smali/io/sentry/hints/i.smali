.class public final Lio/sentry/hints/i;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lio/sentry/clientreport/f;
.implements Lio/sentry/hints/h;


# direct methods
.method public static d(Lio/sentry/v2;Ljava/lang/String;)Z
    .locals 0

    if-eqz p0, :cond_0

    invoke-virtual {p0}, Lio/sentry/v2;->getLogger()Lio/sentry/ILogger;

    move-result-object p0

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    invoke-static {p1, p0}, Lio/sentry/hints/i;->e(Ljava/lang/String;Lio/sentry/ILogger;)Z

    move-result p0

    return p0
.end method

.method public static e(Ljava/lang/String;Lio/sentry/ILogger;)Z
    .locals 0

    invoke-static {p0, p1}, Lio/sentry/hints/i;->h(Ljava/lang/String;Lio/sentry/ILogger;)Ljava/lang/Class;

    move-result-object p0

    if-eqz p0, :cond_0

    const/4 p0, 0x1

    return p0

    :cond_0
    const/4 p0, 0x0

    return p0
.end method

.method public static h(Ljava/lang/String;Lio/sentry/ILogger;)Ljava/lang/Class;
    .locals 3

    :try_start_0
    invoke-static {p0}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object p0
    :try_end_0
    .catch Ljava/lang/ClassNotFoundException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/UnsatisfiedLinkError; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return-object p0

    :catchall_0
    move-exception v0

    if-eqz p1, :cond_0

    sget-object v1, Lio/sentry/a2;->ERROR:Lio/sentry/a2;

    const-string v2, "Failed to initialize "

    invoke-virtual {v2, p0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    invoke-interface {p1, v1, p0, v0}, Lio/sentry/ILogger;->r(Lio/sentry/a2;Ljava/lang/String;Ljava/lang/Throwable;)V

    goto :goto_0

    :catch_0
    move-exception v0

    if-eqz p1, :cond_0

    sget-object v1, Lio/sentry/a2;->ERROR:Lio/sentry/a2;

    const-string v2, "Failed to load (UnsatisfiedLinkError) "

    invoke-virtual {v2, p0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    invoke-interface {p1, v1, p0, v0}, Lio/sentry/ILogger;->r(Lio/sentry/a2;Ljava/lang/String;Ljava/lang/Throwable;)V

    goto :goto_0

    :catch_1
    if-eqz p1, :cond_0

    sget-object v0, Lio/sentry/a2;->INFO:Lio/sentry/a2;

    const-string v1, "Class not available: "

    invoke-virtual {v1, p0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    const/4 v1, 0x0

    new-array v1, v1, [Ljava/lang/Object;

    invoke-interface {p1, v0, p0, v1}, Lio/sentry/ILogger;->e(Lio/sentry/a2;Ljava/lang/String;[Ljava/lang/Object;)V

    :cond_0
    :goto_0
    const/4 p0, 0x0

    return-object p0
.end method


# virtual methods
.method public a(Lio/sentry/clientreport/d;Lio/sentry/internal/debugmeta/c;)V
    .locals 0

    return-void
.end method

.method public b(Lio/sentry/clientreport/d;Lio/sentry/n;)V
    .locals 0

    return-void
.end method

.method public c(Lio/sentry/clientreport/d;Lio/sentry/n;J)V
    .locals 0

    return-void
.end method

.method public f(Lio/sentry/clientreport/d;Lio/sentry/P1;)V
    .locals 0

    return-void
.end method

.method public g(Lio/sentry/internal/debugmeta/c;)Lio/sentry/internal/debugmeta/c;
    .locals 0

    return-object p1
.end method
