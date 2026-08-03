.class public final Lio/sentry/F1;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lio/sentry/b0;


# instance fields
.field public a:Z

.field public final b:Lio/sentry/v2;

.field public final c:Lio/sentry/transport/g;

.field public final d:Lio/sentry/E1;

.field public final e:Lio/sentry/logger/a;


# direct methods
.method public constructor <init>(Lio/sentry/v2;)V
    .locals 7

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Lio/sentry/E1;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    iput-object v0, p0, Lio/sentry/F1;->d:Lio/sentry/E1;

    iput-object p1, p0, Lio/sentry/F1;->b:Lio/sentry/v2;

    const/4 v0, 0x1

    iput-boolean v0, p0, Lio/sentry/F1;->a:Z

    invoke-virtual {p1}, Lio/sentry/v2;->getTransportFactory()Lio/sentry/k0;

    move-result-object v0

    instance-of v1, v0, Lio/sentry/X0;

    if-eqz v1, :cond_0

    new-instance v0, Lio/sentry/K0;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    invoke-virtual {p1, v0}, Lio/sentry/v2;->setTransportFactory(Lio/sentry/k0;)V

    :cond_0
    invoke-virtual {p1}, Lio/sentry/v2;->retrieveParsedDsn()Lio/sentry/z;

    move-result-object v1

    invoke-virtual {p1}, Lio/sentry/v2;->getSentryClientName()Ljava/lang/String;

    move-result-object v2

    iget-object v3, v1, Lio/sentry/z;->c:Ljava/net/URI;

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v3}, Ljava/net/URI;->getPath()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v5, "/envelope/"

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/net/URI;->resolve(Ljava/lang/String;)Ljava/net/URI;

    move-result-object v3

    invoke-virtual {v3}, Ljava/net/URI;->toString()Ljava/lang/String;

    move-result-object v3

    iget-object v4, v1, Lio/sentry/z;->b:Ljava/lang/String;

    iget-object v1, v1, Lio/sentry/z;->a:Ljava/lang/String;

    new-instance v5, Ljava/lang/StringBuilder;

    const-string v6, "Sentry sentry_version=7,sentry_client="

    invoke-direct {v5, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v5, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v6, ",sentry_key="

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    if-eqz v1, :cond_1

    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result v4

    if-lez v4, :cond_1

    const-string v4, ",sentry_secret="

    invoke-virtual {v4, v1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    goto :goto_0

    :cond_1
    const-string v1, ""

    :goto_0
    invoke-virtual {v5, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    new-instance v4, Ljava/util/HashMap;

    invoke-direct {v4}, Ljava/util/HashMap;-><init>()V

    const-string v5, "User-Agent"

    invoke-virtual {v4, v5, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v2, "X-Sentry-Auth"

    invoke-virtual {v4, v2, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v1, Lio/sentry/internal/debugmeta/c;

    invoke-direct {v1, v3, v4}, Lio/sentry/internal/debugmeta/c;-><init>(Ljava/lang/String;Ljava/util/HashMap;)V

    invoke-interface {v0, p1, v1}, Lio/sentry/k0;->k(Lio/sentry/v2;Lio/sentry/internal/debugmeta/c;)Lio/sentry/transport/g;

    move-result-object v0

    iput-object v0, p0, Lio/sentry/F1;->c:Lio/sentry/transport/g;

    invoke-virtual {p1}, Lio/sentry/v2;->getLogs()Lio/sentry/p2;

    move-result-object v0

    iget-boolean v0, v0, Lio/sentry/p2;->a:Z

    if-eqz v0, :cond_2

    new-instance v0, Lio/sentry/logger/b;

    invoke-direct {v0, p1, p0}, Lio/sentry/logger/b;-><init>(Lio/sentry/v2;Lio/sentry/F1;)V

    iput-object v0, p0, Lio/sentry/F1;->e:Lio/sentry/logger/a;

    return-void

    :cond_2
    sget-object p1, Lio/sentry/logger/c;->a:Lio/sentry/logger/c;

    iput-object p1, p0, Lio/sentry/F1;->e:Lio/sentry/logger/a;

    return-void
.end method

.method public static o(Lio/sentry/H;)Ljava/util/ArrayList;
    .locals 2

    new-instance v0, Ljava/util/ArrayList;

    iget-object v1, p0, Lio/sentry/H;->b:Ljava/util/ArrayList;

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    iget-object v1, p0, Lio/sentry/H;->d:Lio/sentry/a;

    if-eqz v1, :cond_0

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_0
    iget-object v1, p0, Lio/sentry/H;->e:Lio/sentry/a;

    if-eqz v1, :cond_1

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_1
    iget-object p0, p0, Lio/sentry/H;->f:Lio/sentry/a;

    if-eqz p0, :cond_2

    invoke-virtual {v0, p0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_2
    return-object v0
.end method


# virtual methods
.method public final a(Z)V
    .locals 7

    iget-object v0, p0, Lio/sentry/F1;->b:Lio/sentry/v2;

    invoke-virtual {v0}, Lio/sentry/v2;->getLogger()Lio/sentry/ILogger;

    move-result-object v1

    sget-object v2, Lio/sentry/a2;->INFO:Lio/sentry/a2;

    const/4 v3, 0x0

    new-array v4, v3, [Ljava/lang/Object;

    const-string v5, "Closing SentryClient."

    invoke-interface {v1, v2, v5, v4}, Lio/sentry/ILogger;->e(Lio/sentry/a2;Ljava/lang/String;[Ljava/lang/Object;)V

    if-eqz p1, :cond_0

    const-wide/16 v1, 0x0

    goto :goto_0

    :cond_0
    :try_start_0
    invoke-virtual {v0}, Lio/sentry/v2;->getShutdownTimeoutMillis()J

    move-result-wide v1

    :goto_0
    invoke-virtual {p0, v1, v2}, Lio/sentry/F1;->b(J)V

    iget-object v1, p0, Lio/sentry/F1;->e:Lio/sentry/logger/a;

    invoke-interface {v1, p1}, Lio/sentry/logger/a;->a(Z)V

    iget-object v1, p0, Lio/sentry/F1;->c:Lio/sentry/transport/g;

    invoke-interface {v1, p1}, Lio/sentry/transport/g;->a(Z)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_1

    :catch_0
    move-exception p1

    invoke-virtual {v0}, Lio/sentry/v2;->getLogger()Lio/sentry/ILogger;

    move-result-object v1

    sget-object v2, Lio/sentry/a2;->WARNING:Lio/sentry/a2;

    const-string v4, "Failed to close the connection to the Sentry Server."

    invoke-interface {v1, v2, v4, p1}, Lio/sentry/ILogger;->r(Lio/sentry/a2;Ljava/lang/String;Ljava/lang/Throwable;)V

    :goto_1
    invoke-virtual {v0}, Lio/sentry/v2;->getEventProcessors()Ljava/util/List;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_1
    :goto_2
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lio/sentry/C;

    instance-of v2, v1, Ljava/io/Closeable;

    if-eqz v2, :cond_1

    :try_start_1
    move-object v2, v1

    check-cast v2, Ljava/io/Closeable;

    invoke-interface {v2}, Ljava/io/Closeable;->close()V
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_1

    goto :goto_2

    :catch_1
    move-exception v2

    invoke-virtual {v0}, Lio/sentry/v2;->getLogger()Lio/sentry/ILogger;

    move-result-object v4

    sget-object v5, Lio/sentry/a2;->WARNING:Lio/sentry/a2;

    const-string v6, "Failed to close the event processor {}."

    filled-new-array {v1, v2}, [Ljava/lang/Object;

    move-result-object v1

    invoke-interface {v4, v5, v6, v1}, Lio/sentry/ILogger;->e(Lio/sentry/a2;Ljava/lang/String;[Ljava/lang/Object;)V

    goto :goto_2

    :cond_2
    iput-boolean v3, p0, Lio/sentry/F1;->a:Z

    return-void
.end method

.method public final b(J)V
    .locals 1

    iget-object v0, p0, Lio/sentry/F1;->e:Lio/sentry/logger/a;

    invoke-interface {v0, p1, p2}, Lio/sentry/logger/a;->b(J)V

    iget-object v0, p0, Lio/sentry/F1;->c:Lio/sentry/transport/g;

    invoke-interface {v0, p1, p2}, Lio/sentry/transport/g;->b(J)V

    return-void
.end method

.method public final c()Lio/sentry/transport/p;
    .locals 1

    iget-object v0, p0, Lio/sentry/F1;->c:Lio/sentry/transport/g;

    invoke-interface {v0}, Lio/sentry/transport/g;->c()Lio/sentry/transport/p;

    move-result-object v0

    return-object v0
.end method

.method public final d(Lio/sentry/F2;Lio/sentry/H;)V
    .locals 4

    const-string v0, "Session is required."

    invoke-static {v0, p1}, Lio/sentry/config/a;->D(Ljava/lang/String;Ljava/lang/Object;)V

    iget-object v0, p1, Lio/sentry/F2;->m:Ljava/lang/String;

    iget-object v1, p0, Lio/sentry/F1;->b:Lio/sentry/v2;

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Ljava/lang/String;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    :try_start_0
    invoke-virtual {v1}, Lio/sentry/v2;->getSerializer()Lio/sentry/e0;

    move-result-object v0

    invoke-virtual {v1}, Lio/sentry/v2;->getSdkVersion()Lio/sentry/protocol/r;

    move-result-object v2

    const-string v3, "Serializer is required."

    invoke-static {v3, v0}, Lio/sentry/config/a;->D(Ljava/lang/String;Ljava/lang/Object;)V

    new-instance v3, Lio/sentry/internal/debugmeta/c;

    invoke-static {v0, p1}, Lio/sentry/P1;->d(Lio/sentry/e0;Lio/sentry/F2;)Lio/sentry/P1;

    move-result-object p1

    const/4 v0, 0x0

    invoke-direct {v3, v0, v2, p1}, Lio/sentry/internal/debugmeta/c;-><init>(Lio/sentry/protocol/t;Lio/sentry/protocol/r;Lio/sentry/P1;)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    invoke-virtual {p0, v3, p2}, Lio/sentry/F1;->g(Lio/sentry/internal/debugmeta/c;Lio/sentry/H;)Lio/sentry/protocol/t;

    return-void

    :catch_0
    move-exception p1

    invoke-virtual {v1}, Lio/sentry/v2;->getLogger()Lio/sentry/ILogger;

    move-result-object p2

    sget-object v0, Lio/sentry/a2;->ERROR:Lio/sentry/a2;

    const-string v1, "Failed to capture session."

    invoke-interface {p2, v0, v1, p1}, Lio/sentry/ILogger;->r(Lio/sentry/a2;Ljava/lang/String;Ljava/lang/Throwable;)V

    return-void

    :cond_1
    :goto_0
    invoke-virtual {v1}, Lio/sentry/v2;->getLogger()Lio/sentry/ILogger;

    move-result-object p1

    sget-object p2, Lio/sentry/a2;->WARNING:Lio/sentry/a2;

    const/4 v0, 0x0

    new-array v0, v0, [Ljava/lang/Object;

    const-string v1, "Sessions can\'t be captured without setting a release."

    invoke-interface {p1, p2, v1, v0}, Lio/sentry/ILogger;->e(Lio/sentry/a2;Ljava/lang/String;[Ljava/lang/Object;)V

    return-void
.end method

.method public final e()Z
    .locals 1

    iget-object v0, p0, Lio/sentry/F1;->c:Lio/sentry/transport/g;

    invoke-interface {v0}, Lio/sentry/transport/g;->e()Z

    move-result v0

    return v0
.end method

.method public final f(Lio/sentry/x2;Lio/sentry/X;Lio/sentry/H;)Lio/sentry/protocol/t;
    .locals 9

    invoke-virtual {p0, p1, p3}, Lio/sentry/F1;->t(Lio/sentry/C1;Lio/sentry/H;)Z

    move-result v0

    if-eqz v0, :cond_8

    iget-object v0, p1, Lio/sentry/C1;->d:Lio/sentry/protocol/n;

    iget-object v1, p1, Lio/sentry/C1;->b:Lio/sentry/protocol/c;

    if-nez v0, :cond_0

    invoke-interface {p2}, Lio/sentry/X;->a()Lio/sentry/protocol/n;

    move-result-object v0

    iput-object v0, p1, Lio/sentry/C1;->d:Lio/sentry/protocol/n;

    :cond_0
    iget-object v0, p1, Lio/sentry/C1;->i:Lio/sentry/protocol/E;

    if-nez v0, :cond_1

    invoke-interface {p2}, Lio/sentry/X;->A()Lio/sentry/protocol/E;

    move-result-object v0

    iput-object v0, p1, Lio/sentry/C1;->i:Lio/sentry/protocol/E;

    :cond_1
    iget-object v0, p1, Lio/sentry/C1;->e:Ljava/util/AbstractMap;

    if-nez v0, :cond_2

    new-instance v0, Ljava/util/HashMap;

    invoke-interface {p2}, Lio/sentry/X;->K()Ljava/util/Map;

    move-result-object v2

    invoke-direct {v0, v2}, Ljava/util/HashMap;-><init>(Ljava/util/Map;)V

    new-instance v2, Ljava/util/HashMap;

    invoke-direct {v2, v0}, Ljava/util/HashMap;-><init>(Ljava/util/Map;)V

    iput-object v2, p1, Lio/sentry/C1;->e:Ljava/util/AbstractMap;

    goto :goto_1

    :cond_2
    invoke-interface {p2}, Lio/sentry/X;->K()Ljava/util/Map;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_3
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_4

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/util/Map$Entry;

    iget-object v3, p1, Lio/sentry/C1;->e:Ljava/util/AbstractMap;

    invoke-interface {v2}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v4

    invoke-interface {v3, v4}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_3

    iget-object v3, p1, Lio/sentry/C1;->e:Ljava/util/AbstractMap;

    invoke-interface {v2}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/String;

    invoke-interface {v2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    invoke-interface {v3, v4, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    :cond_4
    :goto_1
    new-instance v0, Lio/sentry/protocol/c;

    invoke-interface {p2}, Lio/sentry/X;->q()Lio/sentry/protocol/c;

    move-result-object v2

    invoke-direct {v0, v2}, Lio/sentry/protocol/c;-><init>(Lio/sentry/protocol/c;)V

    iget-object v0, v0, Lio/sentry/protocol/c;->a:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-virtual {v0}, Ljava/util/concurrent/ConcurrentHashMap;->entrySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_5
    :goto_2
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_6

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/util/Map$Entry;

    invoke-interface {v2}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v3

    invoke-virtual {v1, v3}, Lio/sentry/protocol/c;->a(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_5

    invoke-interface {v2}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    invoke-interface {v2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v2

    invoke-virtual {v1, v3, v2}, Lio/sentry/protocol/c;->j(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_2

    :cond_6
    invoke-interface {p2}, Lio/sentry/X;->t()Lio/sentry/g0;

    move-result-object v0

    invoke-virtual {v1}, Lio/sentry/protocol/c;->h()Lio/sentry/H2;

    move-result-object v2

    if-nez v2, :cond_8

    if-nez v0, :cond_7

    invoke-interface {p2}, Lio/sentry/X;->E()Lio/sentry/l;

    move-result-object v0

    invoke-static {v0}, Lio/sentry/P2;->b(Lio/sentry/l;)Lio/sentry/P2;

    move-result-object v0

    invoke-virtual {v1, v0}, Lio/sentry/protocol/c;->t(Lio/sentry/H2;)V

    goto :goto_3

    :cond_7
    invoke-interface {v0}, Lio/sentry/g0;->m()Lio/sentry/H2;

    move-result-object v0

    invoke-virtual {v1, v0}, Lio/sentry/protocol/c;->t(Lio/sentry/H2;)V

    :cond_8
    :goto_3
    iget-object v0, p0, Lio/sentry/F1;->b:Lio/sentry/v2;

    invoke-virtual {v0}, Lio/sentry/v2;->getLogger()Lio/sentry/ILogger;

    move-result-object v1

    sget-object v2, Lio/sentry/a2;->DEBUG:Lio/sentry/a2;

    iget-object v3, p1, Lio/sentry/C1;->a:Lio/sentry/protocol/t;

    filled-new-array {v3}, [Ljava/lang/Object;

    move-result-object v3

    const-string v4, "Capturing session replay: %s"

    invoke-interface {v1, v2, v4, v3}, Lio/sentry/ILogger;->e(Lio/sentry/a2;Ljava/lang/String;[Ljava/lang/Object;)V

    sget-object v1, Lio/sentry/protocol/t;->b:Lio/sentry/protocol/t;

    iget-object v2, p1, Lio/sentry/C1;->a:Lio/sentry/protocol/t;

    if-eqz v2, :cond_9

    move-object v1, v2

    :cond_9
    invoke-virtual {v0}, Lio/sentry/v2;->getEventProcessors()Ljava/util/List;

    move-result-object v2

    invoke-interface {v2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_a
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_b

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lio/sentry/C;

    :try_start_0
    invoke-interface {v3, p1, p3}, Lio/sentry/C;->d(Lio/sentry/x2;Lio/sentry/H;)Lio/sentry/x2;

    move-result-object p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_4

    :catchall_0
    move-exception v4

    invoke-virtual {v0}, Lio/sentry/v2;->getLogger()Lio/sentry/ILogger;

    move-result-object v5

    sget-object v6, Lio/sentry/a2;->ERROR:Lio/sentry/a2;

    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v7

    invoke-virtual {v7}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v7

    filled-new-array {v7}, [Ljava/lang/Object;

    move-result-object v7

    const-string v8, "An exception occurred while processing replay event by processor: %s"

    invoke-interface {v5, v6, v4, v8, v7}, Lio/sentry/ILogger;->n(Lio/sentry/a2;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V

    :goto_4
    if-nez p1, :cond_a

    invoke-virtual {v0}, Lio/sentry/v2;->getLogger()Lio/sentry/ILogger;

    move-result-object v2

    sget-object v4, Lio/sentry/a2;->DEBUG:Lio/sentry/a2;

    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v3

    filled-new-array {v3}, [Ljava/lang/Object;

    move-result-object v3

    const-string v5, "Replay event was dropped by a processor: %s"

    invoke-interface {v2, v4, v5, v3}, Lio/sentry/ILogger;->e(Lio/sentry/a2;Ljava/lang/String;[Ljava/lang/Object;)V

    invoke-virtual {v0}, Lio/sentry/v2;->getClientReportRecorder()Lio/sentry/clientreport/f;

    move-result-object v2

    sget-object v3, Lio/sentry/clientreport/d;->EVENT_PROCESSOR:Lio/sentry/clientreport/d;

    sget-object v4, Lio/sentry/n;->Replay:Lio/sentry/n;

    invoke-interface {v2, v3, v4}, Lio/sentry/clientreport/f;->b(Lio/sentry/clientreport/d;Lio/sentry/n;)V

    :cond_b
    if-eqz p1, :cond_c

    invoke-virtual {v0}, Lio/sentry/v2;->getBeforeSendReplay()Lio/sentry/m2;

    :cond_c
    if-nez p1, :cond_d

    sget-object p1, Lio/sentry/protocol/t;->b:Lio/sentry/protocol/t;

    return-object p1

    :cond_d
    const/4 v2, 0x0

    :try_start_1
    invoke-virtual {p0, p2, p3, p1, v2}, Lio/sentry/F1;->p(Lio/sentry/X;Lio/sentry/H;Lio/sentry/C1;Ljava/lang/String;)Lio/sentry/N2;

    move-result-object p2

    const-class v2, Lio/sentry/hints/b;

    invoke-static {p3}, Lio/sentry/config/a;->s(Lio/sentry/H;)Ljava/lang/Object;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/Class;->isInstance(Ljava/lang/Object;)Z

    move-result v2

    iget-object v3, p3, Lio/sentry/H;->g:Lio/sentry/m1;

    invoke-virtual {p0, p1, v3, p2, v2}, Lio/sentry/F1;->n(Lio/sentry/x2;Lio/sentry/m1;Lio/sentry/N2;Z)Lio/sentry/internal/debugmeta/c;

    move-result-object p1

    invoke-virtual {p3}, Lio/sentry/H;->a()V

    iget-object p2, p0, Lio/sentry/F1;->c:Lio/sentry/transport/g;

    invoke-interface {p2, p1, p3}, Lio/sentry/transport/g;->j(Lio/sentry/internal/debugmeta/c;Lio/sentry/H;)V
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_0

    goto :goto_5

    :catch_0
    move-exception p1

    invoke-virtual {v0}, Lio/sentry/v2;->getLogger()Lio/sentry/ILogger;

    move-result-object p2

    sget-object p3, Lio/sentry/a2;->WARNING:Lio/sentry/a2;

    const-string v0, "Capturing event %s failed."

    filled-new-array {v1}, [Ljava/lang/Object;

    move-result-object v1

    invoke-interface {p2, p3, p1, v0, v1}, Lio/sentry/ILogger;->n(Lio/sentry/a2;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V

    sget-object v1, Lio/sentry/protocol/t;->b:Lio/sentry/protocol/t;

    :goto_5
    return-object v1
.end method

.method public final g(Lio/sentry/internal/debugmeta/c;Lio/sentry/H;)Lio/sentry/protocol/t;
    .locals 2

    :try_start_0
    invoke-virtual {p2}, Lio/sentry/H;->a()V

    invoke-virtual {p0, p1, p2}, Lio/sentry/F1;->s(Lio/sentry/internal/debugmeta/c;Lio/sentry/H;)Lio/sentry/protocol/t;

    move-result-object p1
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    return-object p1

    :catch_0
    move-exception p1

    iget-object p2, p0, Lio/sentry/F1;->b:Lio/sentry/v2;

    invoke-virtual {p2}, Lio/sentry/v2;->getLogger()Lio/sentry/ILogger;

    move-result-object p2

    sget-object v0, Lio/sentry/a2;->ERROR:Lio/sentry/a2;

    const-string v1, "Failed to capture envelope."

    invoke-interface {p2, v0, v1, p1}, Lio/sentry/ILogger;->r(Lio/sentry/a2;Ljava/lang/String;Ljava/lang/Throwable;)V

    sget-object p1, Lio/sentry/protocol/t;->b:Lio/sentry/protocol/t;

    return-object p1
.end method

.method public final h(Lio/sentry/e1;)Lio/sentry/protocol/t;
    .locals 6

    const-string v0, "profileChunk is required."

    invoke-static {v0, p1}, Lio/sentry/config/a;->D(Ljava/lang/String;Ljava/lang/Object;)V

    iget-object v0, p0, Lio/sentry/F1;->b:Lio/sentry/v2;

    invoke-virtual {v0}, Lio/sentry/v2;->getLogger()Lio/sentry/ILogger;

    move-result-object v1

    sget-object v2, Lio/sentry/a2;->DEBUG:Lio/sentry/a2;

    iget-object v3, p1, Lio/sentry/e1;->c:Lio/sentry/protocol/t;

    filled-new-array {v3}, [Ljava/lang/Object;

    move-result-object v3

    const-string v4, "Capturing profile chunk: %s"

    invoke-interface {v1, v2, v4, v3}, Lio/sentry/ILogger;->e(Lio/sentry/a2;Ljava/lang/String;[Ljava/lang/Object;)V

    iget-object v1, p1, Lio/sentry/e1;->c:Lio/sentry/protocol/t;

    iget-object v2, p1, Lio/sentry/e1;->a:Lio/sentry/protocol/d;

    invoke-static {v2, v0}, Lio/sentry/protocol/d;->a(Lio/sentry/protocol/d;Lio/sentry/v2;)Lio/sentry/protocol/d;

    move-result-object v2

    if-eqz v2, :cond_0

    iput-object v2, p1, Lio/sentry/e1;->a:Lio/sentry/protocol/d;

    :cond_0
    :try_start_0
    new-instance v2, Lio/sentry/internal/debugmeta/c;

    new-instance v3, Lio/sentry/J1;

    invoke-virtual {v0}, Lio/sentry/v2;->getSdkVersion()Lio/sentry/protocol/r;

    move-result-object v4

    const/4 v5, 0x0

    invoke-direct {v3, v1, v4, v5}, Lio/sentry/J1;-><init>(Lio/sentry/protocol/t;Lio/sentry/protocol/r;Lio/sentry/N2;)V

    invoke-virtual {v0}, Lio/sentry/v2;->getSerializer()Lio/sentry/e0;

    move-result-object v4

    invoke-static {p1, v4}, Lio/sentry/P1;->c(Lio/sentry/e1;Lio/sentry/e0;)Lio/sentry/P1;

    move-result-object p1

    invoke-static {p1}, Ljava/util/Collections;->singletonList(Ljava/lang/Object;)Ljava/util/List;

    move-result-object p1

    invoke-direct {v2, v3, p1}, Lio/sentry/internal/debugmeta/c;-><init>(Lio/sentry/J1;Ljava/util/List;)V

    invoke-virtual {p0, v2, v5}, Lio/sentry/F1;->s(Lio/sentry/internal/debugmeta/c;Lio/sentry/H;)Lio/sentry/protocol/t;

    move-result-object p1
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Lio/sentry/exception/b; {:try_start_0 .. :try_end_0} :catch_0

    return-object p1

    :catch_0
    move-exception p1

    goto :goto_0

    :catch_1
    move-exception p1

    :goto_0
    invoke-virtual {v0}, Lio/sentry/v2;->getLogger()Lio/sentry/ILogger;

    move-result-object v0

    sget-object v2, Lio/sentry/a2;->WARNING:Lio/sentry/a2;

    const-string v3, "Capturing profile chunk %s failed."

    filled-new-array {v1}, [Ljava/lang/Object;

    move-result-object v1

    invoke-interface {v0, v2, p1, v3, v1}, Lio/sentry/ILogger;->n(Lio/sentry/a2;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V

    sget-object p1, Lio/sentry/protocol/t;->b:Lio/sentry/protocol/t;

    return-object p1
.end method

.method public final i(Lio/sentry/protocol/A;Lio/sentry/N2;Lio/sentry/X;Lio/sentry/H;Lio/sentry/h1;)Lio/sentry/protocol/t;
    .locals 10

    if-nez p4, :cond_0

    new-instance p4, Lio/sentry/H;

    invoke-direct {p4}, Lio/sentry/H;-><init>()V

    :cond_0
    invoke-virtual {p0, p1, p4}, Lio/sentry/F1;->t(Lio/sentry/C1;Lio/sentry/H;)Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {p3}, Lio/sentry/X;->n()Ljava/util/List;

    move-result-object v0

    iget-object v1, p4, Lio/sentry/H;->b:Ljava/util/ArrayList;

    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    :cond_1
    iget-object v1, p0, Lio/sentry/F1;->b:Lio/sentry/v2;

    invoke-virtual {v1}, Lio/sentry/v2;->getLogger()Lio/sentry/ILogger;

    move-result-object v0

    sget-object v2, Lio/sentry/a2;->DEBUG:Lio/sentry/a2;

    iget-object v3, p1, Lio/sentry/C1;->a:Lio/sentry/protocol/t;

    filled-new-array {v3}, [Ljava/lang/Object;

    move-result-object v3

    const-string v4, "Capturing transaction: %s"

    invoke-interface {v0, v2, v4, v3}, Lio/sentry/ILogger;->e(Lio/sentry/a2;Ljava/lang/String;[Ljava/lang/Object;)V

    invoke-virtual {v1}, Lio/sentry/v2;->getIgnoredTransactions()Ljava/util/List;

    move-result-object v0

    iget-object v2, p1, Lio/sentry/protocol/A;->p:Ljava/lang/String;

    const/4 v3, 0x0

    if-nez v2, :cond_2

    goto/16 :goto_2

    :cond_2
    if-eqz v0, :cond_8

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v4

    if-eqz v4, :cond_3

    goto :goto_2

    :cond_3
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :cond_4
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_5

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lio/sentry/F;

    iget-object v5, v5, Lio/sentry/F;->a:Ljava/lang/String;

    invoke-virtual {v5, v2}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v5

    if-eqz v5, :cond_4

    goto :goto_1

    :cond_5
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :catchall_0
    :cond_6
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_8

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lio/sentry/F;

    :try_start_0
    iget-object v4, v4, Lio/sentry/F;->b:Ljava/util/regex/Pattern;

    if-nez v4, :cond_7

    move v4, v3

    goto :goto_0

    :cond_7
    invoke-virtual {v4, v2}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    move-result-object v4

    invoke-virtual {v4}, Ljava/util/regex/Matcher;->matches()Z

    move-result v4
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :goto_0
    if-eqz v4, :cond_6

    :goto_1
    invoke-virtual {v1}, Lio/sentry/v2;->getLogger()Lio/sentry/ILogger;

    move-result-object p2

    sget-object p3, Lio/sentry/a2;->DEBUG:Lio/sentry/a2;

    iget-object p4, p1, Lio/sentry/protocol/A;->p:Ljava/lang/String;

    filled-new-array {p4}, [Ljava/lang/Object;

    move-result-object p4

    const-string p5, "Transaction was dropped as transaction name %s is ignored"

    invoke-interface {p2, p3, p5, p4}, Lio/sentry/ILogger;->e(Lio/sentry/a2;Ljava/lang/String;[Ljava/lang/Object;)V

    invoke-virtual {v1}, Lio/sentry/v2;->getClientReportRecorder()Lio/sentry/clientreport/f;

    move-result-object p2

    sget-object p3, Lio/sentry/clientreport/d;->EVENT_PROCESSOR:Lio/sentry/clientreport/d;

    sget-object p4, Lio/sentry/n;->Transaction:Lio/sentry/n;

    invoke-interface {p2, p3, p4}, Lio/sentry/clientreport/f;->b(Lio/sentry/clientreport/d;Lio/sentry/n;)V

    invoke-virtual {v1}, Lio/sentry/v2;->getClientReportRecorder()Lio/sentry/clientreport/f;

    move-result-object p2

    sget-object p4, Lio/sentry/n;->Span:Lio/sentry/n;

    iget-object p1, p1, Lio/sentry/protocol/A;->s:Ljava/util/ArrayList;

    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    move-result p1

    add-int/lit8 p1, p1, 0x1

    int-to-long v0, p1

    invoke-interface {p2, p3, p4, v0, v1}, Lio/sentry/clientreport/f;->c(Lio/sentry/clientreport/d;Lio/sentry/n;J)V

    sget-object p1, Lio/sentry/protocol/t;->b:Lio/sentry/protocol/t;

    return-object p1

    :cond_8
    :goto_2
    sget-object v0, Lio/sentry/protocol/t;->b:Lio/sentry/protocol/t;

    iget-object v2, p1, Lio/sentry/C1;->a:Lio/sentry/protocol/t;

    if-eqz v2, :cond_9

    goto :goto_3

    :cond_9
    move-object v2, v0

    :goto_3
    invoke-virtual {p0, p1, p4}, Lio/sentry/F1;->t(Lio/sentry/C1;Lio/sentry/H;)Z

    move-result v4

    if-eqz v4, :cond_a

    invoke-virtual {p0, p1, p3}, Lio/sentry/F1;->k(Lio/sentry/C1;Lio/sentry/X;)V

    invoke-interface {p3}, Lio/sentry/X;->G()Ljava/util/List;

    move-result-object p3

    invoke-virtual {p0, p1, p4, p3}, Lio/sentry/F1;->r(Lio/sentry/protocol/A;Lio/sentry/H;Ljava/util/List;)Lio/sentry/protocol/A;

    move-result-object p1

    if-nez p1, :cond_a

    invoke-virtual {v1}, Lio/sentry/v2;->getLogger()Lio/sentry/ILogger;

    move-result-object p3

    sget-object v4, Lio/sentry/a2;->DEBUG:Lio/sentry/a2;

    const-string v5, "Transaction was dropped by applyScope"

    new-array v6, v3, [Ljava/lang/Object;

    invoke-interface {p3, v4, v5, v6}, Lio/sentry/ILogger;->e(Lio/sentry/a2;Ljava/lang/String;[Ljava/lang/Object;)V

    :cond_a
    if-eqz p1, :cond_b

    invoke-virtual {v1}, Lio/sentry/v2;->getEventProcessors()Ljava/util/List;

    move-result-object p3

    invoke-virtual {p0, p1, p4, p3}, Lio/sentry/F1;->r(Lio/sentry/protocol/A;Lio/sentry/H;Ljava/util/List;)Lio/sentry/protocol/A;

    move-result-object p1

    :cond_b
    move-object v5, p1

    if-nez v5, :cond_c

    invoke-virtual {v1}, Lio/sentry/v2;->getLogger()Lio/sentry/ILogger;

    move-result-object p1

    sget-object p2, Lio/sentry/a2;->DEBUG:Lio/sentry/a2;

    const-string p3, "Transaction was dropped by Event processors."

    new-array p4, v3, [Ljava/lang/Object;

    invoke-interface {p1, p2, p3, p4}, Lio/sentry/ILogger;->e(Lio/sentry/a2;Ljava/lang/String;[Ljava/lang/Object;)V

    return-object v0

    :cond_c
    iget-object p1, v5, Lio/sentry/protocol/A;->s:Ljava/util/ArrayList;

    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    move-result p3

    invoke-virtual {v1}, Lio/sentry/v2;->getBeforeSendTransaction()Lio/sentry/n2;

    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    move-result p1

    if-ge p1, p3, :cond_d

    sub-int/2addr p3, p1

    invoke-virtual {v1}, Lio/sentry/v2;->getLogger()Lio/sentry/ILogger;

    move-result-object p1

    sget-object v0, Lio/sentry/a2;->DEBUG:Lio/sentry/a2;

    invoke-static {p3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    filled-new-array {v3}, [Ljava/lang/Object;

    move-result-object v3

    const-string v4, "%d spans were dropped by beforeSendTransaction."

    invoke-interface {p1, v0, v4, v3}, Lio/sentry/ILogger;->e(Lio/sentry/a2;Ljava/lang/String;[Ljava/lang/Object;)V

    invoke-virtual {v1}, Lio/sentry/v2;->getClientReportRecorder()Lio/sentry/clientreport/f;

    move-result-object p1

    sget-object v0, Lio/sentry/clientreport/d;->BEFORE_SEND:Lio/sentry/clientreport/d;

    sget-object v3, Lio/sentry/n;->Span:Lio/sentry/n;

    int-to-long v6, p3

    invoke-interface {p1, v0, v3, v6, v7}, Lio/sentry/clientreport/f;->c(Lio/sentry/clientreport/d;Lio/sentry/n;J)V

    :cond_d
    :try_start_1
    invoke-static {p4}, Lio/sentry/F1;->o(Lio/sentry/H;)Ljava/util/ArrayList;

    move-result-object p1

    new-instance v6, Ljava/util/ArrayList;

    invoke-direct {v6}, Ljava/util/ArrayList;-><init>()V

    invoke-virtual {p1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object p1
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_7
    .catch Lio/sentry/exception/b; {:try_start_1 .. :try_end_1} :catch_6

    :goto_4
    :try_start_2
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result p3
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_5
    .catch Lio/sentry/exception/b; {:try_start_2 .. :try_end_2} :catch_4

    if-eqz p3, :cond_e

    :try_start_3
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p3

    check-cast p3, Lio/sentry/a;

    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;
    :try_end_3
    .catch Ljava/io/IOException; {:try_start_3 .. :try_end_3} :catch_1
    .catch Lio/sentry/exception/b; {:try_start_3 .. :try_end_3} :catch_0

    goto :goto_4

    :catch_0
    move-exception v0

    goto :goto_7

    :goto_5
    move-object v4, p0

    goto :goto_9

    :catch_1
    move-exception v0

    goto :goto_7

    :cond_e
    const/4 v7, 0x0

    move-object v4, p0

    move-object v8, p2

    move-object v9, p5

    :try_start_4
    invoke-virtual/range {v4 .. v9}, Lio/sentry/F1;->l(Lio/sentry/C1;Ljava/util/ArrayList;Lio/sentry/F2;Lio/sentry/N2;Lio/sentry/h1;)Lio/sentry/internal/debugmeta/c;

    move-result-object p1

    invoke-virtual {p4}, Lio/sentry/H;->a()V

    if-eqz p1, :cond_f

    invoke-virtual {p0, p1, p4}, Lio/sentry/F1;->s(Lio/sentry/internal/debugmeta/c;Lio/sentry/H;)Lio/sentry/protocol/t;

    move-result-object v2
    :try_end_4
    .catch Ljava/io/IOException; {:try_start_4 .. :try_end_4} :catch_3
    .catch Lio/sentry/exception/b; {:try_start_4 .. :try_end_4} :catch_2

    goto :goto_a

    :catch_2
    move-exception v0

    :goto_6
    move-object p1, v0

    goto :goto_9

    :catch_3
    move-exception v0

    goto :goto_6

    :catch_4
    move-exception v0

    :goto_7
    move-object p1, v0

    goto :goto_5

    :catch_5
    move-exception v0

    goto :goto_7

    :catch_6
    move-exception v0

    :goto_8
    move-object v4, p0

    goto :goto_6

    :catch_7
    move-exception v0

    goto :goto_8

    :goto_9
    invoke-virtual {v1}, Lio/sentry/v2;->getLogger()Lio/sentry/ILogger;

    move-result-object p2

    sget-object p3, Lio/sentry/a2;->WARNING:Lio/sentry/a2;

    const-string p4, "Capturing transaction %s failed."

    filled-new-array {v2}, [Ljava/lang/Object;

    move-result-object p5

    invoke-interface {p2, p3, p1, p4, p5}, Lio/sentry/ILogger;->n(Lio/sentry/a2;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V

    sget-object v2, Lio/sentry/protocol/t;->b:Lio/sentry/protocol/t;

    :cond_f
    :goto_a
    return-object v2
.end method

.method public final isEnabled()Z
    .locals 1

    iget-boolean v0, p0, Lio/sentry/F1;->a:Z

    return v0
.end method

.method public final j(Lio/sentry/R1;Lio/sentry/X;Lio/sentry/H;)Lio/sentry/protocol/t;
    .locals 12

    invoke-virtual {p0, p1, p3}, Lio/sentry/F1;->t(Lio/sentry/C1;Lio/sentry/H;)Z

    move-result v0

    if-eqz v0, :cond_0

    if-eqz p2, :cond_0

    invoke-interface {p2}, Lio/sentry/X;->n()Ljava/util/List;

    move-result-object v0

    iget-object v1, p3, Lio/sentry/H;->b:Ljava/util/ArrayList;

    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    :cond_0
    iget-object v1, p0, Lio/sentry/F1;->b:Lio/sentry/v2;

    invoke-virtual {v1}, Lio/sentry/v2;->getLogger()Lio/sentry/ILogger;

    move-result-object v0

    sget-object v2, Lio/sentry/a2;->DEBUG:Lio/sentry/a2;

    iget-object v3, p1, Lio/sentry/C1;->a:Lio/sentry/protocol/t;

    filled-new-array {v3}, [Ljava/lang/Object;

    move-result-object v3

    const-string v4, "Capturing event: %s"

    invoke-interface {v0, v2, v4, v3}, Lio/sentry/ILogger;->e(Lio/sentry/a2;Ljava/lang/String;[Ljava/lang/Object;)V

    invoke-virtual {p1}, Lio/sentry/C1;->a()Ljava/lang/Throwable;

    move-result-object v0

    if-eqz v0, :cond_1

    invoke-virtual {v1}, Lio/sentry/v2;->getIgnoredExceptionsForType()Ljava/util/Set;

    move-result-object v3

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v4

    invoke-interface {v3, v4}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_1

    invoke-virtual {v1}, Lio/sentry/v2;->getLogger()Lio/sentry/ILogger;

    move-result-object p1

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object p2

    filled-new-array {p2}, [Ljava/lang/Object;

    move-result-object p2

    const-string p3, "Event was dropped as the exception %s is ignored"

    invoke-interface {p1, v2, p3, p2}, Lio/sentry/ILogger;->e(Lio/sentry/a2;Ljava/lang/String;[Ljava/lang/Object;)V

    invoke-virtual {v1}, Lio/sentry/v2;->getClientReportRecorder()Lio/sentry/clientreport/f;

    move-result-object p1

    sget-object p2, Lio/sentry/clientreport/d;->EVENT_PROCESSOR:Lio/sentry/clientreport/d;

    sget-object p3, Lio/sentry/n;->Error:Lio/sentry/n;

    invoke-interface {p1, p2, p3}, Lio/sentry/clientreport/f;->b(Lio/sentry/clientreport/d;Lio/sentry/n;)V

    sget-object p1, Lio/sentry/protocol/t;->b:Lio/sentry/protocol/t;

    return-object p1

    :cond_1
    invoke-virtual {v1}, Lio/sentry/v2;->getIgnoredErrors()Ljava/util/List;

    move-result-object v0

    const/4 v2, 0x0

    if-eqz v0, :cond_b

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v3

    if-eqz v3, :cond_2

    goto/16 :goto_2

    :cond_2
    new-instance v3, Ljava/util/HashSet;

    invoke-direct {v3}, Ljava/util/HashSet;-><init>()V

    iget-object v4, p1, Lio/sentry/R1;->q:Lio/sentry/protocol/l;

    if-eqz v4, :cond_4

    iget-object v5, v4, Lio/sentry/protocol/l;->b:Ljava/lang/String;

    if-eqz v5, :cond_3

    invoke-virtual {v3, v5}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    :cond_3
    iget-object v4, v4, Lio/sentry/protocol/l;->a:Ljava/lang/String;

    if-eqz v4, :cond_4

    invoke-virtual {v3, v4}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    :cond_4
    invoke-virtual {p1}, Lio/sentry/C1;->a()Ljava/lang/Throwable;

    move-result-object v4

    if-eqz v4, :cond_5

    invoke-virtual {v4}, Ljava/lang/Throwable;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    :cond_5
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :cond_6
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_7

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lio/sentry/F;

    iget-object v5, v5, Lio/sentry/F;->a:Ljava/lang/String;

    invoke-virtual {v3, v5}, Ljava/util/HashSet;->contains(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_6

    goto :goto_1

    :cond_7
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_8
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_b

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lio/sentry/F;

    invoke-virtual {v3}, Ljava/util/HashSet;->iterator()Ljava/util/Iterator;

    move-result-object v5

    :cond_9
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    if-eqz v6, :cond_8

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ljava/lang/String;

    iget-object v7, v4, Lio/sentry/F;->b:Ljava/util/regex/Pattern;

    if-nez v7, :cond_a

    move v6, v2

    goto :goto_0

    :cond_a
    invoke-virtual {v7, v6}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    move-result-object v6

    invoke-virtual {v6}, Ljava/util/regex/Matcher;->matches()Z

    move-result v6

    :goto_0
    if-eqz v6, :cond_9

    :goto_1
    invoke-virtual {v1}, Lio/sentry/v2;->getLogger()Lio/sentry/ILogger;

    move-result-object p2

    sget-object p3, Lio/sentry/a2;->DEBUG:Lio/sentry/a2;

    iget-object p1, p1, Lio/sentry/R1;->q:Lio/sentry/protocol/l;

    filled-new-array {p1}, [Ljava/lang/Object;

    move-result-object p1

    const-string v0, "Event was dropped as it matched a string/pattern in ignoredErrors"

    invoke-interface {p2, p3, v0, p1}, Lio/sentry/ILogger;->e(Lio/sentry/a2;Ljava/lang/String;[Ljava/lang/Object;)V

    invoke-virtual {v1}, Lio/sentry/v2;->getClientReportRecorder()Lio/sentry/clientreport/f;

    move-result-object p1

    sget-object p2, Lio/sentry/clientreport/d;->EVENT_PROCESSOR:Lio/sentry/clientreport/d;

    sget-object p3, Lio/sentry/n;->Error:Lio/sentry/n;

    invoke-interface {p1, p2, p3}, Lio/sentry/clientreport/f;->b(Lio/sentry/clientreport/d;Lio/sentry/n;)V

    sget-object p1, Lio/sentry/protocol/t;->b:Lio/sentry/protocol/t;

    return-object p1

    :cond_b
    :goto_2
    invoke-virtual {p0, p1, p3}, Lio/sentry/F1;->t(Lio/sentry/C1;Lio/sentry/H;)Z

    move-result v0

    const/4 v3, 0x0

    if-eqz v0, :cond_13

    if-eqz p2, :cond_12

    invoke-virtual {p0, p1, p2}, Lio/sentry/F1;->k(Lio/sentry/C1;Lio/sentry/X;)V

    iget-object v0, p1, Lio/sentry/R1;->v:Ljava/lang/String;

    iget-object v4, p1, Lio/sentry/C1;->b:Lio/sentry/protocol/c;

    if-nez v0, :cond_c

    invoke-interface {p2}, Lio/sentry/X;->I()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p1, Lio/sentry/R1;->v:Ljava/lang/String;

    :cond_c
    iget-object v0, p1, Lio/sentry/R1;->w:Ljava/util/List;

    if-nez v0, :cond_e

    invoke-interface {p2}, Lio/sentry/X;->x()Ljava/util/List;

    move-result-object v0

    if-eqz v0, :cond_d

    new-instance v5, Ljava/util/ArrayList;

    invoke-direct {v5, v0}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    goto :goto_3

    :cond_d
    move-object v5, v3

    :goto_3
    iput-object v5, p1, Lio/sentry/R1;->w:Ljava/util/List;

    :cond_e
    invoke-interface {p2}, Lio/sentry/X;->C()Lio/sentry/a2;

    move-result-object v0

    if-eqz v0, :cond_f

    invoke-interface {p2}, Lio/sentry/X;->C()Lio/sentry/a2;

    move-result-object v0

    iput-object v0, p1, Lio/sentry/R1;->u:Lio/sentry/a2;

    :cond_f
    invoke-interface {p2}, Lio/sentry/X;->t()Lio/sentry/g0;

    move-result-object v0

    invoke-virtual {v4}, Lio/sentry/protocol/c;->h()Lio/sentry/H2;

    move-result-object v5

    if-nez v5, :cond_11

    if-nez v0, :cond_10

    invoke-interface {p2}, Lio/sentry/X;->E()Lio/sentry/l;

    move-result-object v0

    invoke-static {v0}, Lio/sentry/P2;->b(Lio/sentry/l;)Lio/sentry/P2;

    move-result-object v0

    invoke-virtual {v4, v0}, Lio/sentry/protocol/c;->t(Lio/sentry/H2;)V

    goto :goto_4

    :cond_10
    invoke-interface {v0}, Lio/sentry/g0;->m()Lio/sentry/H2;

    move-result-object v0

    invoke-virtual {v4, v0}, Lio/sentry/protocol/c;->t(Lio/sentry/H2;)V

    :cond_11
    :goto_4
    invoke-interface {p2}, Lio/sentry/X;->G()Ljava/util/List;

    move-result-object v0

    invoke-virtual {p0, p1, p3, v0}, Lio/sentry/F1;->q(Lio/sentry/R1;Lio/sentry/H;Ljava/util/List;)Lio/sentry/R1;

    move-result-object p1

    :cond_12
    if-nez p1, :cond_13

    invoke-virtual {v1}, Lio/sentry/v2;->getLogger()Lio/sentry/ILogger;

    move-result-object p1

    sget-object p2, Lio/sentry/a2;->DEBUG:Lio/sentry/a2;

    const-string p3, "Event was dropped by applyScope"

    new-array v0, v2, [Ljava/lang/Object;

    invoke-interface {p1, p2, p3, v0}, Lio/sentry/ILogger;->e(Lio/sentry/a2;Ljava/lang/String;[Ljava/lang/Object;)V

    sget-object p1, Lio/sentry/protocol/t;->b:Lio/sentry/protocol/t;

    return-object p1

    :cond_13
    invoke-virtual {v1}, Lio/sentry/v2;->getEventProcessors()Ljava/util/List;

    move-result-object v0

    invoke-virtual {p0, p1, p3, v0}, Lio/sentry/F1;->q(Lio/sentry/R1;Lio/sentry/H;Ljava/util/List;)Lio/sentry/R1;

    move-result-object p1

    if-eqz p1, :cond_14

    invoke-virtual {v1}, Lio/sentry/v2;->getBeforeSend()Lio/sentry/l2;

    :cond_14
    if-nez p1, :cond_15

    sget-object p1, Lio/sentry/protocol/t;->b:Lio/sentry/protocol/t;

    return-object p1

    :cond_15
    if-eqz p2, :cond_16

    new-instance v0, Lr1;

    const/16 v4, 0x14

    invoke-direct {v0, v4}, Lr1;-><init>(I)V

    invoke-interface {p2, v0}, Lio/sentry/X;->F(Lio/sentry/o1;)Lio/sentry/F2;

    move-result-object v0

    goto :goto_5

    :cond_16
    move-object v0, v3

    :goto_5
    const/4 v4, 0x1

    if-eqz v0, :cond_19

    iget-object v5, v0, Lio/sentry/F2;->g:Lio/sentry/E2;

    sget-object v6, Lio/sentry/E2;->Ok:Lio/sentry/E2;

    if-eq v5, v6, :cond_17

    move v5, v4

    goto :goto_6

    :cond_17
    move v5, v2

    :goto_6
    if-nez v5, :cond_18

    goto :goto_7

    :cond_18
    move-object v9, v3

    goto :goto_9

    :cond_19
    :goto_7
    invoke-static {p3}, Lio/sentry/config/a;->F(Lio/sentry/H;)Z

    move-result v5

    if-eqz v5, :cond_1b

    if-eqz p2, :cond_1a

    new-instance v5, Lio/sentry/D1;

    invoke-direct {v5, p0, p1, p3}, Lio/sentry/D1;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-interface {p2, v5}, Lio/sentry/X;->F(Lio/sentry/o1;)Lio/sentry/F2;

    move-result-object v5

    goto :goto_8

    :cond_1a
    invoke-virtual {v1}, Lio/sentry/v2;->getLogger()Lio/sentry/ILogger;

    move-result-object v5

    sget-object v6, Lio/sentry/a2;->INFO:Lio/sentry/a2;

    const-string v7, "Scope is null on client.captureEvent"

    new-array v8, v2, [Ljava/lang/Object;

    invoke-interface {v5, v6, v7, v8}, Lio/sentry/ILogger;->e(Lio/sentry/a2;Ljava/lang/String;[Ljava/lang/Object;)V

    :cond_1b
    move-object v5, v3

    :goto_8
    move-object v9, v5

    :goto_9
    invoke-virtual {v1}, Lio/sentry/v2;->getSampleRate()Ljava/lang/Double;

    move-result-object v5

    if-nez v5, :cond_1c

    move-object v5, v3

    goto :goto_a

    :cond_1c
    invoke-static {}, Lio/sentry/util/h;->a()Lio/sentry/util/g;

    move-result-object v5

    :goto_a
    invoke-virtual {v1}, Lio/sentry/v2;->getSampleRate()Ljava/lang/Double;

    move-result-object v6

    if-eqz v6, :cond_1e

    if-eqz v5, :cond_1e

    invoke-virtual {v1}, Lio/sentry/v2;->getSampleRate()Ljava/lang/Double;

    move-result-object v6

    invoke-virtual {v6}, Ljava/lang/Double;->doubleValue()D

    move-result-wide v6

    invoke-virtual {v5}, Lio/sentry/util/g;->c()D

    move-result-wide v10

    cmpg-double v5, v6, v10

    if-ltz v5, :cond_1d

    goto :goto_b

    :cond_1d
    invoke-virtual {v1}, Lio/sentry/v2;->getLogger()Lio/sentry/ILogger;

    move-result-object v5

    sget-object v6, Lio/sentry/a2;->DEBUG:Lio/sentry/a2;

    iget-object p1, p1, Lio/sentry/C1;->a:Lio/sentry/protocol/t;

    filled-new-array {p1}, [Ljava/lang/Object;

    move-result-object p1

    const-string v7, "Event %s was dropped due to sampling decision."

    invoke-interface {v5, v6, v7, p1}, Lio/sentry/ILogger;->e(Lio/sentry/a2;Ljava/lang/String;[Ljava/lang/Object;)V

    invoke-virtual {v1}, Lio/sentry/v2;->getClientReportRecorder()Lio/sentry/clientreport/f;

    move-result-object p1

    sget-object v5, Lio/sentry/clientreport/d;->SAMPLE_RATE:Lio/sentry/clientreport/d;

    sget-object v6, Lio/sentry/n;->Error:Lio/sentry/n;

    invoke-interface {p1, v5, v6}, Lio/sentry/clientreport/f;->b(Lio/sentry/clientreport/d;Lio/sentry/n;)V

    move-object v7, v3

    goto :goto_c

    :cond_1e
    :goto_b
    move-object v7, p1

    :goto_c
    if-nez v9, :cond_20

    :cond_1f
    move p1, v2

    goto :goto_e

    :cond_20
    if-nez v0, :cond_21

    :goto_d
    move p1, v4

    goto :goto_e

    :cond_21
    iget-object p1, v9, Lio/sentry/F2;->g:Lio/sentry/E2;

    sget-object v5, Lio/sentry/E2;->Crashed:Lio/sentry/E2;

    if-ne p1, v5, :cond_22

    iget-object p1, v0, Lio/sentry/F2;->g:Lio/sentry/E2;

    if-eq p1, v5, :cond_22

    goto :goto_d

    :cond_22
    iget-object p1, v9, Lio/sentry/F2;->c:Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-virtual {p1}, Ljava/util/concurrent/atomic/AtomicInteger;->get()I

    move-result p1

    if-lez p1, :cond_1f

    iget-object p1, v0, Lio/sentry/F2;->c:Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-virtual {p1}, Ljava/util/concurrent/atomic/AtomicInteger;->get()I

    move-result p1

    if-gtz p1, :cond_1f

    goto :goto_d

    :goto_e
    if-nez v7, :cond_23

    if-nez p1, :cond_23

    invoke-virtual {v1}, Lio/sentry/v2;->getLogger()Lio/sentry/ILogger;

    move-result-object p1

    sget-object p2, Lio/sentry/a2;->DEBUG:Lio/sentry/a2;

    const-string p3, "Not sending session update for dropped event as it did not cause the session health to change."

    new-array v0, v2, [Ljava/lang/Object;

    invoke-interface {p1, p2, p3, v0}, Lio/sentry/ILogger;->e(Lio/sentry/a2;Ljava/lang/String;[Ljava/lang/Object;)V

    sget-object p1, Lio/sentry/protocol/t;->b:Lio/sentry/protocol/t;

    return-object p1

    :cond_23
    sget-object p1, Lio/sentry/protocol/t;->b:Lio/sentry/protocol/t;

    if-eqz v7, :cond_24

    iget-object v0, v7, Lio/sentry/C1;->a:Lio/sentry/protocol/t;

    if-eqz v0, :cond_24

    move-object p1, v0

    :cond_24
    const-class v0, Lio/sentry/hints/b;

    invoke-static {p3}, Lio/sentry/config/a;->s(Lio/sentry/H;)Ljava/lang/Object;

    move-result-object v5

    invoke-virtual {v0, v5}, Ljava/lang/Class;->isInstance(Ljava/lang/Object;)Z

    move-result v0

    const-class v5, Lio/sentry/hints/d;

    invoke-static {p3}, Lio/sentry/config/a;->s(Lio/sentry/H;)Ljava/lang/Object;

    move-result-object v6

    invoke-virtual {v5, v6}, Ljava/lang/Class;->isInstance(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_25

    const-class v5, Lio/sentry/android/core/O;

    invoke-static {p3}, Lio/sentry/config/a;->s(Lio/sentry/H;)Ljava/lang/Object;

    move-result-object v6

    invoke-virtual {v5, v6}, Ljava/lang/Class;->isInstance(Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_25

    move v5, v4

    goto :goto_f

    :cond_25
    move v5, v2

    :goto_f
    if-eqz v7, :cond_29

    if-nez v0, :cond_29

    if-nez v5, :cond_29

    invoke-virtual {v7}, Lio/sentry/R1;->d()Z

    move-result v0

    if-nez v0, :cond_27

    invoke-virtual {v7}, Lio/sentry/R1;->c()Lio/sentry/protocol/s;

    move-result-object v0

    if-eqz v0, :cond_26

    move v0, v4

    goto :goto_10

    :cond_26
    move v0, v2

    :goto_10
    if-eqz v0, :cond_29

    :cond_27
    invoke-virtual {v1}, Lio/sentry/v2;->getReplayController()Lio/sentry/k1;

    move-result-object v0

    invoke-virtual {v7}, Lio/sentry/R1;->c()Lio/sentry/protocol/s;

    move-result-object v5

    if-eqz v5, :cond_28

    goto :goto_11

    :cond_28
    move v4, v2

    :goto_11
    invoke-static {v4}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v4

    invoke-interface {v0, v4}, Lio/sentry/k1;->f(Ljava/lang/Boolean;)V

    :cond_29
    if-eqz v7, :cond_2a

    :try_start_0
    iget-object v0, v7, Lio/sentry/R1;->v:Ljava/lang/String;

    goto :goto_12

    :cond_2a
    move-object v0, v3

    :goto_12
    invoke-virtual {p0, p2, p3, v7, v0}, Lio/sentry/F1;->p(Lio/sentry/X;Lio/sentry/H;Lio/sentry/C1;Ljava/lang/String;)Lio/sentry/N2;

    move-result-object v10

    if-eqz v7, :cond_2b

    invoke-static {p3}, Lio/sentry/F1;->o(Lio/sentry/H;)Ljava/util/ArrayList;

    move-result-object v0
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Lio/sentry/exception/b; {:try_start_0 .. :try_end_0} :catch_0

    move-object v8, v0

    goto :goto_14

    :catch_0
    move-exception v0

    :goto_13
    move-object v6, p0

    goto :goto_15

    :catch_1
    move-exception v0

    goto :goto_13

    :cond_2b
    move-object v8, v3

    :goto_14
    const/4 v11, 0x0

    move-object v6, p0

    :try_start_1
    invoke-virtual/range {v6 .. v11}, Lio/sentry/F1;->l(Lio/sentry/C1;Ljava/util/ArrayList;Lio/sentry/F2;Lio/sentry/N2;Lio/sentry/h1;)Lio/sentry/internal/debugmeta/c;

    move-result-object v0

    invoke-virtual {p3}, Lio/sentry/H;->a()V

    if-eqz v0, :cond_2c

    invoke-virtual {p0, v0, p3}, Lio/sentry/F1;->s(Lio/sentry/internal/debugmeta/c;Lio/sentry/H;)Lio/sentry/protocol/t;

    move-result-object p1
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_3
    .catch Lio/sentry/exception/b; {:try_start_1 .. :try_end_1} :catch_2

    goto :goto_16

    :catch_2
    move-exception v0

    goto :goto_15

    :catch_3
    move-exception v0

    :goto_15
    invoke-virtual {v1}, Lio/sentry/v2;->getLogger()Lio/sentry/ILogger;

    move-result-object v1

    sget-object v4, Lio/sentry/a2;->WARNING:Lio/sentry/a2;

    const-string v5, "Capturing event %s failed."

    filled-new-array {p1}, [Ljava/lang/Object;

    move-result-object p1

    invoke-interface {v1, v4, v0, v5, p1}, Lio/sentry/ILogger;->n(Lio/sentry/a2;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V

    sget-object p1, Lio/sentry/protocol/t;->b:Lio/sentry/protocol/t;

    :cond_2c
    :goto_16
    if-eqz p2, :cond_2e

    invoke-interface {p2}, Lio/sentry/X;->d()Lio/sentry/i0;

    move-result-object p2

    if-eqz p2, :cond_2e

    const-class v0, Lio/sentry/hints/k;

    invoke-static {p3}, Lio/sentry/config/a;->s(Lio/sentry/H;)Ljava/lang/Object;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/Class;->isInstance(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2e

    invoke-static {p3}, Lio/sentry/config/a;->s(Lio/sentry/H;)Ljava/lang/Object;

    move-result-object v0

    instance-of v1, v0, Lio/sentry/hints/c;

    if-eqz v1, :cond_2d

    check-cast v0, Lio/sentry/hints/c;

    invoke-interface {p2}, Lio/sentry/i0;->g()Lio/sentry/protocol/t;

    move-result-object v1

    invoke-virtual {v0, v1}, Lio/sentry/hints/c;->g(Lio/sentry/protocol/t;)V

    sget-object v0, Lio/sentry/L2;->ABORTED:Lio/sentry/L2;

    invoke-interface {p2, v0, v2, p3}, Lio/sentry/i0;->h(Lio/sentry/L2;ZLio/sentry/H;)V

    goto :goto_17

    :cond_2d
    sget-object p3, Lio/sentry/L2;->ABORTED:Lio/sentry/L2;

    invoke-interface {p2, p3, v2, v3}, Lio/sentry/i0;->h(Lio/sentry/L2;ZLio/sentry/H;)V

    :cond_2e
    :goto_17
    return-object p1
.end method

.method public final k(Lio/sentry/C1;Lio/sentry/X;)V
    .locals 4

    if-eqz p2, :cond_b

    iget-object v0, p1, Lio/sentry/C1;->d:Lio/sentry/protocol/n;

    if-nez v0, :cond_0

    invoke-interface {p2}, Lio/sentry/X;->a()Lio/sentry/protocol/n;

    move-result-object v0

    iput-object v0, p1, Lio/sentry/C1;->d:Lio/sentry/protocol/n;

    :cond_0
    iget-object v0, p1, Lio/sentry/C1;->i:Lio/sentry/protocol/E;

    if-nez v0, :cond_1

    invoke-interface {p2}, Lio/sentry/X;->A()Lio/sentry/protocol/E;

    move-result-object v0

    iput-object v0, p1, Lio/sentry/C1;->i:Lio/sentry/protocol/E;

    :cond_1
    iget-object v0, p1, Lio/sentry/C1;->e:Ljava/util/AbstractMap;

    if-nez v0, :cond_2

    new-instance v0, Ljava/util/HashMap;

    invoke-interface {p2}, Lio/sentry/X;->K()Ljava/util/Map;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/util/HashMap;-><init>(Ljava/util/Map;)V

    new-instance v1, Ljava/util/HashMap;

    invoke-direct {v1, v0}, Ljava/util/HashMap;-><init>(Ljava/util/Map;)V

    iput-object v1, p1, Lio/sentry/C1;->e:Ljava/util/AbstractMap;

    goto :goto_1

    :cond_2
    invoke-interface {p2}, Lio/sentry/X;->K()Ljava/util/Map;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_3
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_4

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/Map$Entry;

    iget-object v2, p1, Lio/sentry/C1;->e:Ljava/util/AbstractMap;

    invoke-interface {v1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v3

    invoke-interface {v2, v3}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_3

    iget-object v2, p1, Lio/sentry/C1;->e:Ljava/util/AbstractMap;

    invoke-interface {v1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    invoke-interface {v1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    invoke-interface {v2, v3, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    :cond_4
    :goto_1
    iget-object v0, p1, Lio/sentry/C1;->m:Ljava/util/List;

    if-nez v0, :cond_5

    new-instance v0, Ljava/util/ArrayList;

    invoke-interface {p2}, Lio/sentry/X;->z()Ljava/util/Queue;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1, v0}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    iput-object v1, p1, Lio/sentry/C1;->m:Ljava/util/List;

    goto :goto_2

    :cond_5
    invoke-interface {p2}, Lio/sentry/X;->z()Ljava/util/Queue;

    move-result-object v0

    iget-object v1, p1, Lio/sentry/C1;->m:Ljava/util/List;

    if-eqz v1, :cond_6

    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    move-result v2

    if-nez v2, :cond_6

    invoke-interface {v1, v0}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    iget-object v0, p0, Lio/sentry/F1;->d:Lio/sentry/E1;

    invoke-static {v1, v0}, Ljava/util/Collections;->sort(Ljava/util/List;Ljava/util/Comparator;)V

    :cond_6
    :goto_2
    iget-object v0, p1, Lio/sentry/C1;->o:Ljava/util/AbstractMap;

    if-nez v0, :cond_7

    new-instance v0, Ljava/util/HashMap;

    invoke-interface {p2}, Lio/sentry/X;->getExtras()Ljava/util/Map;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/util/HashMap;-><init>(Ljava/util/Map;)V

    new-instance v1, Ljava/util/HashMap;

    invoke-direct {v1, v0}, Ljava/util/HashMap;-><init>(Ljava/util/Map;)V

    iput-object v1, p1, Lio/sentry/C1;->o:Ljava/util/AbstractMap;

    goto :goto_4

    :cond_7
    invoke-interface {p2}, Lio/sentry/X;->getExtras()Ljava/util/Map;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_8
    :goto_3
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_9

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/Map$Entry;

    iget-object v2, p1, Lio/sentry/C1;->o:Ljava/util/AbstractMap;

    invoke-interface {v1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v3

    invoke-interface {v2, v3}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_8

    iget-object v2, p1, Lio/sentry/C1;->o:Ljava/util/AbstractMap;

    invoke-interface {v1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    invoke-interface {v1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v1

    invoke-interface {v2, v3, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_3

    :cond_9
    :goto_4
    iget-object p1, p1, Lio/sentry/C1;->b:Lio/sentry/protocol/c;

    new-instance v0, Lio/sentry/protocol/c;

    invoke-interface {p2}, Lio/sentry/X;->q()Lio/sentry/protocol/c;

    move-result-object p2

    invoke-direct {v0, p2}, Lio/sentry/protocol/c;-><init>(Lio/sentry/protocol/c;)V

    iget-object p2, v0, Lio/sentry/protocol/c;->a:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-virtual {p2}, Ljava/util/concurrent/ConcurrentHashMap;->entrySet()Ljava/util/Set;

    move-result-object p2

    invoke-interface {p2}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object p2

    :cond_a
    :goto_5
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_b

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Map$Entry;

    invoke-interface {v0}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v1

    invoke-virtual {p1, v1}, Lio/sentry/protocol/c;->a(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_a

    invoke-interface {v0}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    invoke-interface {v0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v0

    invoke-virtual {p1, v1, v0}, Lio/sentry/protocol/c;->j(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_5

    :cond_b
    return-void
.end method

.method public final l(Lio/sentry/C1;Ljava/util/ArrayList;Lio/sentry/F2;Lio/sentry/N2;Lio/sentry/h1;)Lio/sentry/internal/debugmeta/c;
    .locals 20

    move-object/from16 v0, p1

    move-object/from16 v1, p3

    move-object/from16 v4, p5

    new-instance v6, Ljava/util/ArrayList;

    invoke-direct {v6}, Ljava/util/ArrayList;-><init>()V

    const/4 v7, 0x1

    move-object/from16 v8, p0

    iget-object v9, v8, Lio/sentry/F1;->b:Lio/sentry/v2;

    const/4 v10, 0x0

    if-eqz v0, :cond_0

    invoke-virtual {v9}, Lio/sentry/v2;->getSerializer()Lio/sentry/e0;

    move-result-object v2

    sget-object v3, Lio/sentry/P1;->d:Ljava/nio/charset/Charset;

    const-string v3, "ISerializer is required."

    invoke-static {v3, v2}, Lio/sentry/config/a;->D(Ljava/lang/String;Ljava/lang/Object;)V

    new-instance v3, Lio/sentry/internal/debugmeta/c;

    new-instance v5, Lio/sentry/K1;

    invoke-direct {v5, v7, v2, v0}, Lio/sentry/K1;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    invoke-direct {v3, v5}, Lio/sentry/internal/debugmeta/c;-><init>(Ljava/util/concurrent/Callable;)V

    new-instance v11, Lio/sentry/Q1;

    invoke-static {v0}, Lio/sentry/Z1;->resolve(Ljava/lang/Object;)Lio/sentry/Z1;

    move-result-object v12

    new-instance v13, Lio/sentry/L1;

    const/4 v2, 0x2

    invoke-direct {v13, v2, v3}, Lio/sentry/L1;-><init>(ILjava/lang/Object;)V

    const/4 v15, 0x0

    const/16 v16, 0x0

    const-string v14, "application/json"

    invoke-direct/range {v11 .. v16}, Lio/sentry/Q1;-><init>(Lio/sentry/Z1;Ljava/util/concurrent/Callable;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    new-instance v2, Lio/sentry/P1;

    new-instance v5, Lio/sentry/L1;

    const/4 v12, 0x3

    invoke-direct {v5, v12, v3}, Lio/sentry/L1;-><init>(ILjava/lang/Object;)V

    invoke-direct {v2, v11, v5}, Lio/sentry/P1;-><init>(Lio/sentry/Q1;Ljava/util/concurrent/Callable;)V

    invoke-virtual {v6, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    iget-object v0, v0, Lio/sentry/C1;->a:Lio/sentry/protocol/t;

    move-object v11, v0

    goto :goto_0

    :cond_0
    move-object v11, v10

    :goto_0
    if-eqz v1, :cond_1

    invoke-virtual {v9}, Lio/sentry/v2;->getSerializer()Lio/sentry/e0;

    move-result-object v0

    invoke-static {v0, v1}, Lio/sentry/P1;->d(Lio/sentry/e0;Lio/sentry/F2;)Lio/sentry/P1;

    move-result-object v0

    invoke-virtual {v6, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_1
    if-eqz v4, :cond_2

    invoke-virtual {v9}, Lio/sentry/v2;->getMaxTraceFileSize()J

    move-result-wide v2

    invoke-virtual {v9}, Lio/sentry/v2;->getSerializer()Lio/sentry/e0;

    move-result-object v5

    sget-object v0, Lio/sentry/P1;->d:Ljava/nio/charset/Charset;

    iget-object v1, v4, Lio/sentry/h1;->a:Ljava/io/File;

    new-instance v12, Lio/sentry/internal/debugmeta/c;

    new-instance v0, Lio/sentry/O1;

    invoke-direct/range {v0 .. v5}, Lio/sentry/O1;-><init>(Ljava/io/File;JLio/sentry/h1;Lio/sentry/e0;)V

    invoke-direct {v12, v0}, Lio/sentry/internal/debugmeta/c;-><init>(Ljava/util/concurrent/Callable;)V

    new-instance v13, Lio/sentry/Q1;

    sget-object v14, Lio/sentry/Z1;->Profile:Lio/sentry/Z1;

    new-instance v15, Lio/sentry/L1;

    const/4 v0, 0x0

    invoke-direct {v15, v0, v12}, Lio/sentry/L1;-><init>(ILjava/lang/Object;)V

    invoke-virtual {v1}, Ljava/io/File;->getName()Ljava/lang/String;

    move-result-object v17

    const/16 v18, 0x0

    const-string v16, "application-json"

    invoke-direct/range {v13 .. v18}, Lio/sentry/Q1;-><init>(Lio/sentry/Z1;Ljava/util/concurrent/Callable;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    new-instance v0, Lio/sentry/P1;

    new-instance v1, Lio/sentry/L1;

    invoke-direct {v1, v7, v12}, Lio/sentry/L1;-><init>(ILjava/lang/Object;)V

    invoke-direct {v0, v13, v1}, Lio/sentry/P1;-><init>(Lio/sentry/Q1;Ljava/util/concurrent/Callable;)V

    invoke-virtual {v6, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    if-nez v11, :cond_2

    new-instance v11, Lio/sentry/protocol/t;

    iget-object v0, v4, Lio/sentry/h1;->w:Ljava/lang/String;

    invoke-direct {v11, v0}, Lio/sentry/protocol/t;-><init>(Ljava/lang/String;)V

    :cond_2
    if-eqz p2, :cond_3

    invoke-interface/range {p2 .. p2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_3

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    move-object v13, v1

    check-cast v13, Lio/sentry/a;

    invoke-virtual {v9}, Lio/sentry/v2;->getSerializer()Lio/sentry/e0;

    move-result-object v16

    invoke-virtual {v9}, Lio/sentry/v2;->getLogger()Lio/sentry/ILogger;

    move-result-object v17

    invoke-virtual {v9}, Lio/sentry/v2;->getMaxAttachmentSize()J

    move-result-wide v14

    sget-object v1, Lio/sentry/P1;->d:Ljava/nio/charset/Charset;

    new-instance v1, Lio/sentry/internal/debugmeta/c;

    new-instance v12, Lio/sentry/O1;

    invoke-direct/range {v12 .. v17}, Lio/sentry/O1;-><init>(Lio/sentry/a;JLio/sentry/e0;Lio/sentry/ILogger;)V

    invoke-direct {v1, v12}, Lio/sentry/internal/debugmeta/c;-><init>(Ljava/util/concurrent/Callable;)V

    new-instance v14, Lio/sentry/Q1;

    sget-object v15, Lio/sentry/Z1;->Attachment:Lio/sentry/Z1;

    new-instance v2, Lio/sentry/L1;

    const/16 v3, 0xe

    invoke-direct {v2, v3, v1}, Lio/sentry/L1;-><init>(ILjava/lang/Object;)V

    iget-object v3, v13, Lio/sentry/a;->e:Ljava/lang/String;

    iget-object v4, v13, Lio/sentry/a;->d:Ljava/lang/String;

    iget-object v5, v13, Lio/sentry/a;->f:Ljava/lang/String;

    move-object/from16 v16, v2

    move-object/from16 v17, v3

    move-object/from16 v18, v4

    move-object/from16 v19, v5

    invoke-direct/range {v14 .. v19}, Lio/sentry/Q1;-><init>(Lio/sentry/Z1;Ljava/util/concurrent/Callable;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    new-instance v2, Lio/sentry/P1;

    new-instance v3, Lio/sentry/L1;

    const/16 v4, 0xf

    invoke-direct {v3, v4, v1}, Lio/sentry/L1;-><init>(ILjava/lang/Object;)V

    invoke-direct {v2, v14, v3}, Lio/sentry/P1;-><init>(Lio/sentry/Q1;Ljava/util/concurrent/Callable;)V

    invoke-virtual {v6, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_1

    :cond_3
    invoke-virtual {v6}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_4

    new-instance v0, Lio/sentry/J1;

    invoke-virtual {v9}, Lio/sentry/v2;->getSdkVersion()Lio/sentry/protocol/r;

    move-result-object v1

    move-object/from16 v2, p4

    invoke-direct {v0, v11, v1, v2}, Lio/sentry/J1;-><init>(Lio/sentry/protocol/t;Lio/sentry/protocol/r;Lio/sentry/N2;)V

    new-instance v1, Lio/sentry/internal/debugmeta/c;

    invoke-direct {v1, v0, v6}, Lio/sentry/internal/debugmeta/c;-><init>(Lio/sentry/J1;Ljava/util/List;)V

    return-object v1

    :cond_4
    return-object v10
.end method

.method public final m(Lio/sentry/d2;)Lio/sentry/internal/debugmeta/c;
    .locals 14

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iget-object v1, p0, Lio/sentry/F1;->b:Lio/sentry/v2;

    invoke-virtual {v1}, Lio/sentry/v2;->getSerializer()Lio/sentry/e0;

    move-result-object v2

    sget-object v3, Lio/sentry/P1;->d:Ljava/nio/charset/Charset;

    const-string v3, "ISerializer is required."

    invoke-static {v3, v2}, Lio/sentry/config/a;->D(Ljava/lang/String;Ljava/lang/Object;)V

    new-instance v3, Lio/sentry/internal/debugmeta/c;

    new-instance v4, Lio/sentry/K1;

    const/4 v5, 0x3

    invoke-direct {v4, v5, v2, p1}, Lio/sentry/K1;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    invoke-direct {v3, v4}, Lio/sentry/internal/debugmeta/c;-><init>(Ljava/util/concurrent/Callable;)V

    new-instance v6, Lio/sentry/Q1;

    sget-object v7, Lio/sentry/Z1;->Log:Lio/sentry/Z1;

    new-instance v8, Lio/sentry/L1;

    const/4 v2, 0x6

    invoke-direct {v8, v2, v3}, Lio/sentry/L1;-><init>(ILjava/lang/Object;)V

    iget-object p1, p1, Lio/sentry/d2;->b:Ljava/lang/Object;

    check-cast p1, Ljava/util/List;

    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result p1

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v13

    const-string v9, "application/vnd.sentry.items.log+json"

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    invoke-direct/range {v6 .. v13}, Lio/sentry/Q1;-><init>(Lio/sentry/Z1;Ljava/util/concurrent/Callable;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;)V

    new-instance p1, Lio/sentry/P1;

    new-instance v2, Lio/sentry/L1;

    const/16 v4, 0x8

    invoke-direct {v2, v4, v3}, Lio/sentry/L1;-><init>(ILjava/lang/Object;)V

    invoke-direct {p1, v6, v2}, Lio/sentry/P1;-><init>(Lio/sentry/Q1;Ljava/util/concurrent/Callable;)V

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    new-instance p1, Lio/sentry/J1;

    const/4 v2, 0x0

    invoke-virtual {v1}, Lio/sentry/v2;->getSdkVersion()Lio/sentry/protocol/r;

    move-result-object v1

    invoke-direct {p1, v2, v1, v2}, Lio/sentry/J1;-><init>(Lio/sentry/protocol/t;Lio/sentry/protocol/r;Lio/sentry/N2;)V

    new-instance v1, Lio/sentry/internal/debugmeta/c;

    invoke-direct {v1, p1, v0}, Lio/sentry/internal/debugmeta/c;-><init>(Lio/sentry/J1;Ljava/util/List;)V

    return-object v1
.end method

.method public final n(Lio/sentry/x2;Lio/sentry/m1;Lio/sentry/N2;Z)Lio/sentry/internal/debugmeta/c;
    .locals 17

    move-object/from16 v2, p1

    new-instance v7, Ljava/util/ArrayList;

    invoke-direct {v7}, Ljava/util/ArrayList;-><init>()V

    move-object/from16 v8, p0

    iget-object v9, v8, Lio/sentry/F1;->b:Lio/sentry/v2;

    invoke-virtual {v9}, Lio/sentry/v2;->getSerializer()Lio/sentry/e0;

    move-result-object v1

    invoke-virtual {v9}, Lio/sentry/v2;->getLogger()Lio/sentry/ILogger;

    move-result-object v5

    sget-object v0, Lio/sentry/P1;->d:Ljava/nio/charset/Charset;

    iget-object v4, v2, Lio/sentry/x2;->p:Ljava/io/File;

    new-instance v10, Lio/sentry/internal/debugmeta/c;

    new-instance v0, Lio/sentry/M1;

    move-object/from16 v3, p2

    move/from16 v6, p4

    invoke-direct/range {v0 .. v6}, Lio/sentry/M1;-><init>(Lio/sentry/e0;Lio/sentry/x2;Lio/sentry/m1;Ljava/io/File;Lio/sentry/ILogger;Z)V

    invoke-direct {v10, v0}, Lio/sentry/internal/debugmeta/c;-><init>(Ljava/util/concurrent/Callable;)V

    new-instance v11, Lio/sentry/Q1;

    sget-object v12, Lio/sentry/Z1;->ReplayVideo:Lio/sentry/Z1;

    new-instance v13, Lio/sentry/L1;

    const/16 v0, 0x9

    invoke-direct {v13, v0, v10}, Lio/sentry/L1;-><init>(ILjava/lang/Object;)V

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/4 v14, 0x0

    invoke-direct/range {v11 .. v16}, Lio/sentry/Q1;-><init>(Lio/sentry/Z1;Ljava/util/concurrent/Callable;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    new-instance v0, Lio/sentry/P1;

    new-instance v1, Lio/sentry/L1;

    const/16 v3, 0xa

    invoke-direct {v1, v3, v10}, Lio/sentry/L1;-><init>(ILjava/lang/Object;)V

    invoke-direct {v0, v11, v1}, Lio/sentry/P1;-><init>(Lio/sentry/Q1;Ljava/util/concurrent/Callable;)V

    invoke-virtual {v7, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    iget-object v0, v2, Lio/sentry/C1;->a:Lio/sentry/protocol/t;

    new-instance v1, Lio/sentry/J1;

    invoke-virtual {v9}, Lio/sentry/v2;->getSessionReplay()Lio/sentry/z2;

    move-result-object v2

    iget-object v2, v2, Lio/sentry/z2;->k:Lio/sentry/protocol/r;

    move-object/from16 v3, p3

    invoke-direct {v1, v0, v2, v3}, Lio/sentry/J1;-><init>(Lio/sentry/protocol/t;Lio/sentry/protocol/r;Lio/sentry/N2;)V

    new-instance v0, Lio/sentry/internal/debugmeta/c;

    invoke-direct {v0, v1, v7}, Lio/sentry/internal/debugmeta/c;-><init>(Lio/sentry/J1;Ljava/util/List;)V

    return-object v0
.end method

.method public final p(Lio/sentry/X;Lio/sentry/H;Lio/sentry/C1;Ljava/lang/String;)Lio/sentry/N2;
    .locals 4

    const-class v0, Lio/sentry/hints/b;

    invoke-static {p2}, Lio/sentry/config/a;->s(Lio/sentry/H;)Ljava/lang/Object;

    move-result-object p2

    invoke-virtual {v0, p2}, Ljava/lang/Class;->isInstance(Ljava/lang/Object;)Z

    move-result p2

    iget-object v0, p0, Lio/sentry/F1;->b:Lio/sentry/v2;

    const/4 v1, 0x0

    if-eqz p2, :cond_4

    if-eqz p3, :cond_6

    new-instance p1, Lio/sentry/c;

    invoke-virtual {v0}, Lio/sentry/v2;->getLogger()Lio/sentry/ILogger;

    invoke-direct {p1}, Lio/sentry/c;-><init>()V

    iget-object p2, p3, Lio/sentry/C1;->b:Lio/sentry/protocol/c;

    invoke-virtual {p2}, Lio/sentry/protocol/c;->h()Lio/sentry/H2;

    move-result-object v2

    if-eqz v2, :cond_0

    iget-object v2, v2, Lio/sentry/H2;->a:Lio/sentry/protocol/t;

    invoke-virtual {v2}, Lio/sentry/protocol/t;->toString()Ljava/lang/String;

    move-result-object v2

    goto :goto_0

    :cond_0
    move-object v2, v1

    :goto_0
    const-string v3, "sentry-trace_id"

    invoke-virtual {p1, v3, v2}, Lio/sentry/c;->b(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v0}, Lio/sentry/v2;->retrieveParsedDsn()Lio/sentry/z;

    move-result-object v0

    iget-object v0, v0, Lio/sentry/z;->b:Ljava/lang/String;

    const-string v2, "sentry-public_key"

    invoke-virtual {p1, v2, v0}, Lio/sentry/c;->b(Ljava/lang/String;Ljava/lang/String;)V

    iget-object v0, p3, Lio/sentry/C1;->f:Ljava/lang/String;

    const-string v2, "sentry-release"

    invoke-virtual {p1, v2, v0}, Lio/sentry/c;->b(Ljava/lang/String;Ljava/lang/String;)V

    iget-object p3, p3, Lio/sentry/C1;->g:Ljava/lang/String;

    const-string v0, "sentry-environment"

    invoke-virtual {p1, v0, p3}, Lio/sentry/c;->b(Ljava/lang/String;Ljava/lang/String;)V

    const-string p3, "sentry-transaction"

    invoke-virtual {p1, p3, p4}, Lio/sentry/c;->b(Ljava/lang/String;Ljava/lang/String;)V

    iget-boolean p3, p1, Lio/sentry/c;->e:Z

    if-eqz p3, :cond_1

    iput-object v1, p1, Lio/sentry/c;->c:Ljava/lang/Double;

    :cond_1
    const-string p3, "sentry-sampled"

    invoke-virtual {p1, p3, v1}, Lio/sentry/c;->b(Ljava/lang/String;Ljava/lang/String;)V

    iget-boolean p3, p1, Lio/sentry/c;->e:Z

    if-eqz p3, :cond_2

    iput-object v1, p1, Lio/sentry/c;->d:Ljava/lang/Double;

    :cond_2
    const-string p3, "replay_id"

    invoke-virtual {p2, p3}, Lio/sentry/protocol/c;->c(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p4

    if-eqz p4, :cond_3

    invoke-virtual {p4}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    sget-object v1, Lio/sentry/protocol/t;->b:Lio/sentry/protocol/t;

    invoke-virtual {v1}, Lio/sentry/protocol/t;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_3

    invoke-virtual {p4}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p4

    const-string v0, "sentry-replay_id"

    invoke-virtual {p1, v0, p4}, Lio/sentry/c;->b(Ljava/lang/String;Ljava/lang/String;)V

    iget-object p2, p2, Lio/sentry/protocol/c;->a:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-virtual {p2, p3}, Ljava/util/concurrent/ConcurrentHashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    :cond_3
    const/4 p2, 0x0

    iput-boolean p2, p1, Lio/sentry/c;->e:Z

    invoke-virtual {p1}, Lio/sentry/c;->d()Lio/sentry/N2;

    move-result-object p1

    return-object p1

    :cond_4
    if-eqz p1, :cond_6

    invoke-interface {p1}, Lio/sentry/X;->d()Lio/sentry/i0;

    move-result-object p2

    if-eqz p2, :cond_5

    invoke-interface {p2}, Lio/sentry/g0;->b()Lio/sentry/N2;

    move-result-object p1

    return-object p1

    :cond_5
    new-instance p2, LQ9;

    const/16 p3, 0xc

    invoke-direct {p2, p3, p1, v0}, LQ9;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    invoke-interface {p1, p2}, Lio/sentry/X;->r(Lio/sentry/n1;)Lio/sentry/l;

    move-result-object p1

    iget-object p1, p1, Lio/sentry/l;->d:Ljava/lang/Object;

    check-cast p1, Lio/sentry/c;

    invoke-virtual {p1}, Lio/sentry/c;->d()Lio/sentry/N2;

    move-result-object p1

    return-object p1

    :cond_6
    return-object v1
.end method

.method public final q(Lio/sentry/R1;Lio/sentry/H;Ljava/util/List;)Lio/sentry/R1;
    .locals 7

    iget-object v0, p0, Lio/sentry/F1;->b:Lio/sentry/v2;

    invoke-interface {p3}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p3

    :cond_0
    invoke-interface {p3}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_3

    invoke-interface {p3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lio/sentry/C;

    :try_start_0
    instance-of v2, v1, Lio/sentry/android/core/u;

    const-class v3, Lio/sentry/hints/b;

    invoke-static {p2}, Lio/sentry/config/a;->s(Lio/sentry/H;)Ljava/lang/Object;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/lang/Class;->isInstance(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_1

    if-eqz v2, :cond_1

    move-object v2, v1

    check-cast v2, Lio/sentry/android/core/u;

    invoke-virtual {v2, p1, p2}, Lio/sentry/android/core/u;->i(Lio/sentry/R1;Lio/sentry/H;)Lio/sentry/R1;

    goto :goto_0

    :cond_1
    if-nez v3, :cond_2

    if-nez v2, :cond_2

    invoke-interface {v1, p1, p2}, Lio/sentry/C;->i(Lio/sentry/R1;Lio/sentry/H;)Lio/sentry/R1;

    move-result-object p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception v2

    invoke-virtual {v0}, Lio/sentry/v2;->getLogger()Lio/sentry/ILogger;

    move-result-object v3

    sget-object v4, Lio/sentry/a2;->ERROR:Lio/sentry/a2;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v5

    invoke-virtual {v5}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v5

    filled-new-array {v5}, [Ljava/lang/Object;

    move-result-object v5

    const-string v6, "An exception occurred while processing event by processor: %s"

    invoke-interface {v3, v4, v2, v6, v5}, Lio/sentry/ILogger;->n(Lio/sentry/a2;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V

    :cond_2
    :goto_0
    if-nez p1, :cond_0

    invoke-virtual {v0}, Lio/sentry/v2;->getLogger()Lio/sentry/ILogger;

    move-result-object p2

    sget-object p3, Lio/sentry/a2;->DEBUG:Lio/sentry/a2;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v1

    filled-new-array {v1}, [Ljava/lang/Object;

    move-result-object v1

    const-string v2, "Event was dropped by a processor: %s"

    invoke-interface {p2, p3, v2, v1}, Lio/sentry/ILogger;->e(Lio/sentry/a2;Ljava/lang/String;[Ljava/lang/Object;)V

    invoke-virtual {v0}, Lio/sentry/v2;->getClientReportRecorder()Lio/sentry/clientreport/f;

    move-result-object p2

    sget-object p3, Lio/sentry/clientreport/d;->EVENT_PROCESSOR:Lio/sentry/clientreport/d;

    sget-object v0, Lio/sentry/n;->Error:Lio/sentry/n;

    invoke-interface {p2, p3, v0}, Lio/sentry/clientreport/f;->b(Lio/sentry/clientreport/d;Lio/sentry/n;)V

    :cond_3
    return-object p1
.end method

.method public final r(Lio/sentry/protocol/A;Lio/sentry/H;Ljava/util/List;)Lio/sentry/protocol/A;
    .locals 8

    iget-object v0, p0, Lio/sentry/F1;->b:Lio/sentry/v2;

    invoke-interface {p3}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p3

    :cond_0
    :goto_0
    invoke-interface {p3}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_3

    invoke-interface {p3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lio/sentry/C;

    iget-object v2, p1, Lio/sentry/protocol/A;->s:Ljava/util/ArrayList;

    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    move-result v2

    :try_start_0
    invoke-interface {v1, p1, p2}, Lio/sentry/C;->f(Lio/sentry/protocol/A;Lio/sentry/H;)Lio/sentry/protocol/A;

    move-result-object p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_1

    :catchall_0
    move-exception v3

    invoke-virtual {v0}, Lio/sentry/v2;->getLogger()Lio/sentry/ILogger;

    move-result-object v4

    sget-object v5, Lio/sentry/a2;->ERROR:Lio/sentry/a2;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v6

    invoke-virtual {v6}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v6

    filled-new-array {v6}, [Ljava/lang/Object;

    move-result-object v6

    const-string v7, "An exception occurred while processing transaction by processor: %s"

    invoke-interface {v4, v5, v3, v7, v6}, Lio/sentry/ILogger;->n(Lio/sentry/a2;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V

    :goto_1
    if-nez p1, :cond_1

    const/4 v3, 0x0

    goto :goto_2

    :cond_1
    iget-object v3, p1, Lio/sentry/protocol/A;->s:Ljava/util/ArrayList;

    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    move-result v3

    :goto_2
    if-nez p1, :cond_2

    invoke-virtual {v0}, Lio/sentry/v2;->getLogger()Lio/sentry/ILogger;

    move-result-object p2

    sget-object p3, Lio/sentry/a2;->DEBUG:Lio/sentry/a2;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v1

    filled-new-array {v1}, [Ljava/lang/Object;

    move-result-object v1

    const-string v3, "Transaction was dropped by a processor: %s"

    invoke-interface {p2, p3, v3, v1}, Lio/sentry/ILogger;->e(Lio/sentry/a2;Ljava/lang/String;[Ljava/lang/Object;)V

    invoke-virtual {v0}, Lio/sentry/v2;->getClientReportRecorder()Lio/sentry/clientreport/f;

    move-result-object p2

    sget-object p3, Lio/sentry/clientreport/d;->EVENT_PROCESSOR:Lio/sentry/clientreport/d;

    sget-object v1, Lio/sentry/n;->Transaction:Lio/sentry/n;

    invoke-interface {p2, p3, v1}, Lio/sentry/clientreport/f;->b(Lio/sentry/clientreport/d;Lio/sentry/n;)V

    invoke-virtual {v0}, Lio/sentry/v2;->getClientReportRecorder()Lio/sentry/clientreport/f;

    move-result-object p2

    sget-object v0, Lio/sentry/n;->Span:Lio/sentry/n;

    add-int/lit8 v2, v2, 0x1

    int-to-long v1, v2

    invoke-interface {p2, p3, v0, v1, v2}, Lio/sentry/clientreport/f;->c(Lio/sentry/clientreport/d;Lio/sentry/n;J)V

    goto :goto_3

    :cond_2
    if-ge v3, v2, :cond_0

    sub-int/2addr v2, v3

    invoke-virtual {v0}, Lio/sentry/v2;->getLogger()Lio/sentry/ILogger;

    move-result-object v3

    sget-object v4, Lio/sentry/a2;->DEBUG:Lio/sentry/a2;

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v1

    filled-new-array {v5, v1}, [Ljava/lang/Object;

    move-result-object v1

    const-string v5, "%d spans were dropped by a processor: %s"

    invoke-interface {v3, v4, v5, v1}, Lio/sentry/ILogger;->e(Lio/sentry/a2;Ljava/lang/String;[Ljava/lang/Object;)V

    invoke-virtual {v0}, Lio/sentry/v2;->getClientReportRecorder()Lio/sentry/clientreport/f;

    move-result-object v1

    sget-object v3, Lio/sentry/clientreport/d;->EVENT_PROCESSOR:Lio/sentry/clientreport/d;

    sget-object v4, Lio/sentry/n;->Span:Lio/sentry/n;

    int-to-long v5, v2

    invoke-interface {v1, v3, v4, v5, v6}, Lio/sentry/clientreport/f;->c(Lio/sentry/clientreport/d;Lio/sentry/n;J)V

    goto/16 :goto_0

    :cond_3
    :goto_3
    return-object p1
.end method

.method public final s(Lio/sentry/internal/debugmeta/c;Lio/sentry/H;)Lio/sentry/protocol/t;
    .locals 5

    iget-object v0, p0, Lio/sentry/F1;->b:Lio/sentry/v2;

    invoke-virtual {v0}, Lio/sentry/v2;->getBeforeEnvelopeCallback()Lio/sentry/k2;

    move-result-object v1

    if-eqz v1, :cond_0

    :try_start_0
    check-cast v1, Lio/sentry/SpotlightIntegration;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :try_start_1
    iget-object v2, v1, Lio/sentry/SpotlightIntegration;->c:Lio/sentry/c0;

    new-instance v3, Ln3;

    const/16 v4, 0x15

    invoke-direct {v3, v4, v1, p1}, Ln3;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    invoke-interface {v2, v3}, Lio/sentry/c0;->submit(Ljava/lang/Runnable;)Ljava/util/concurrent/Future;
    :try_end_1
    .catch Ljava/util/concurrent/RejectedExecutionException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_0

    :catch_0
    move-exception v2

    :try_start_2
    iget-object v1, v1, Lio/sentry/SpotlightIntegration;->b:Lio/sentry/ILogger;

    sget-object v3, Lio/sentry/a2;->WARNING:Lio/sentry/a2;

    const-string v4, "Spotlight envelope submission rejected."

    invoke-interface {v1, v3, v4, v2}, Lio/sentry/ILogger;->r(Lio/sentry/a2;Ljava/lang/String;Ljava/lang/Throwable;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception v1

    invoke-virtual {v0}, Lio/sentry/v2;->getLogger()Lio/sentry/ILogger;

    move-result-object v2

    sget-object v3, Lio/sentry/a2;->ERROR:Lio/sentry/a2;

    const-string v4, "The BeforeEnvelope callback threw an exception."

    invoke-interface {v2, v3, v4, v1}, Lio/sentry/ILogger;->r(Lio/sentry/a2;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_0
    :goto_0
    invoke-static {}, Lio/sentry/Y1;->d()Lio/sentry/Y1;

    move-result-object v1

    invoke-virtual {v0}, Lio/sentry/v2;->getLogger()Lio/sentry/ILogger;

    move-result-object v0

    invoke-virtual {v1, v0}, Lio/sentry/Y1;->c(Lio/sentry/ILogger;)Z

    iget-object v0, p0, Lio/sentry/F1;->c:Lio/sentry/transport/g;

    if-nez p2, :cond_1

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    new-instance p2, Lio/sentry/H;

    invoke-direct {p2}, Lio/sentry/H;-><init>()V

    invoke-interface {v0, p1, p2}, Lio/sentry/transport/g;->j(Lio/sentry/internal/debugmeta/c;Lio/sentry/H;)V

    goto :goto_1

    :cond_1
    invoke-interface {v0, p1, p2}, Lio/sentry/transport/g;->j(Lio/sentry/internal/debugmeta/c;Lio/sentry/H;)V

    :goto_1
    iget-object p1, p1, Lio/sentry/internal/debugmeta/c;->b:Ljava/lang/Object;

    check-cast p1, Lio/sentry/J1;

    iget-object p1, p1, Lio/sentry/J1;->a:Lio/sentry/protocol/t;

    if-eqz p1, :cond_2

    goto :goto_2

    :cond_2
    sget-object p1, Lio/sentry/protocol/t;->b:Lio/sentry/protocol/t;

    :goto_2
    return-object p1
.end method

.method public final t(Lio/sentry/C1;Lio/sentry/H;)Z
    .locals 2

    invoke-static {p2}, Lio/sentry/config/a;->F(Lio/sentry/H;)Z

    move-result p2

    if-eqz p2, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    iget-object p2, p0, Lio/sentry/F1;->b:Lio/sentry/v2;

    invoke-virtual {p2}, Lio/sentry/v2;->getLogger()Lio/sentry/ILogger;

    move-result-object p2

    sget-object v0, Lio/sentry/a2;->DEBUG:Lio/sentry/a2;

    iget-object p1, p1, Lio/sentry/C1;->a:Lio/sentry/protocol/t;

    filled-new-array {p1}, [Ljava/lang/Object;

    move-result-object p1

    const-string v1, "Event was cached so not applying scope: %s"

    invoke-interface {p2, v0, v1, p1}, Lio/sentry/ILogger;->e(Lio/sentry/a2;Ljava/lang/String;[Ljava/lang/Object;)V

    const/4 p1, 0x0

    return p1
.end method
