.class public final Lio/sentry/transport/b;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final a:Lio/sentry/internal/debugmeta/c;

.field public final b:Lio/sentry/H;

.field public final c:Lio/sentry/cache/d;

.field public final d:Lio/sentry/transport/r;

.field public final synthetic e:Lio/sentry/transport/c;


# direct methods
.method public constructor <init>(Lio/sentry/transport/c;Lio/sentry/internal/debugmeta/c;Lio/sentry/H;Lio/sentry/cache/d;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lio/sentry/transport/b;->e:Lio/sentry/transport/c;

    new-instance p1, Lio/sentry/transport/r;

    const/4 v0, -0x1

    invoke-direct {p1, v0}, Lio/sentry/transport/r;-><init>(I)V

    iput-object p1, p0, Lio/sentry/transport/b;->d:Lio/sentry/transport/r;

    const-string p1, "Envelope is required."

    invoke-static {p1, p2}, Lio/sentry/config/a;->D(Ljava/lang/String;Ljava/lang/Object;)V

    iput-object p2, p0, Lio/sentry/transport/b;->a:Lio/sentry/internal/debugmeta/c;

    iput-object p3, p0, Lio/sentry/transport/b;->b:Lio/sentry/H;

    const-string p1, "EnvelopeCache is required."

    invoke-static {p1, p4}, Lio/sentry/config/a;->D(Ljava/lang/String;Ljava/lang/Object;)V

    iput-object p4, p0, Lio/sentry/transport/b;->c:Lio/sentry/cache/d;

    return-void
.end method

.method public static synthetic a(Lio/sentry/transport/b;Lio/sentry/config/a;Lio/sentry/hints/j;)V
    .locals 3

    iget-object p0, p0, Lio/sentry/transport/b;->e:Lio/sentry/transport/c;

    iget-object p0, p0, Lio/sentry/transport/c;->c:Lio/sentry/v2;

    invoke-virtual {p0}, Lio/sentry/v2;->getLogger()Lio/sentry/ILogger;

    move-result-object p0

    sget-object v0, Lio/sentry/a2;->DEBUG:Lio/sentry/a2;

    invoke-virtual {p1}, Lio/sentry/config/a;->x()Z

    move-result v1

    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    filled-new-array {v1}, [Ljava/lang/Object;

    move-result-object v1

    const-string v2, "Marking envelope submission result: %s"

    invoke-interface {p0, v0, v2, v1}, Lio/sentry/ILogger;->e(Lio/sentry/a2;Ljava/lang/String;[Ljava/lang/Object;)V

    invoke-virtual {p1}, Lio/sentry/config/a;->x()Z

    move-result p0

    invoke-interface {p2, p0}, Lio/sentry/hints/j;->b(Z)V

    return-void
.end method


# virtual methods
.method public final b()Lio/sentry/config/a;
    .locals 18

    move-object/from16 v1, p0

    const-string v0, "The transport failed to send the envelope with response code "

    iget-object v2, v1, Lio/sentry/transport/b;->a:Lio/sentry/internal/debugmeta/c;

    iget-object v3, v2, Lio/sentry/internal/debugmeta/c;->b:Ljava/lang/Object;

    check-cast v3, Lio/sentry/J1;

    const/4 v4, 0x0

    iput-object v4, v3, Lio/sentry/J1;->d:Ljava/util/Date;

    iget-object v3, v1, Lio/sentry/transport/b;->c:Lio/sentry/cache/d;

    iget-object v4, v1, Lio/sentry/transport/b;->b:Lio/sentry/H;

    invoke-interface {v3, v2, v4}, Lio/sentry/cache/d;->i(Lio/sentry/internal/debugmeta/c;Lio/sentry/H;)Z

    move-result v5

    invoke-static {v4}, Lio/sentry/config/a;->s(Lio/sentry/H;)Ljava/lang/Object;

    move-result-object v6

    invoke-static {v4}, Lio/sentry/config/a;->s(Lio/sentry/H;)Ljava/lang/Object;

    move-result-object v7

    const-class v8, Lio/sentry/hints/c;

    invoke-virtual {v8, v7}, Ljava/lang/Class;->isInstance(Ljava/lang/Object;)Z

    move-result v7

    iget-object v8, v1, Lio/sentry/transport/b;->e:Lio/sentry/transport/c;

    const/4 v9, 0x0

    if-eqz v7, :cond_1

    if-eqz v6, :cond_1

    check-cast v6, Lio/sentry/hints/c;

    iget-object v7, v8, Lio/sentry/transport/c;->c:Lio/sentry/v2;

    iget-object v10, v2, Lio/sentry/internal/debugmeta/c;->b:Ljava/lang/Object;

    check-cast v10, Lio/sentry/J1;

    iget-object v10, v10, Lio/sentry/J1;->a:Lio/sentry/protocol/t;

    invoke-virtual {v6, v10}, Lio/sentry/hints/c;->f(Lio/sentry/protocol/t;)Z

    move-result v10

    if-eqz v10, :cond_0

    iget-object v6, v6, Lio/sentry/hints/c;->a:Ljava/util/concurrent/CountDownLatch;

    invoke-virtual {v6}, Ljava/util/concurrent/CountDownLatch;->countDown()V

    invoke-virtual {v7}, Lio/sentry/v2;->getLogger()Lio/sentry/ILogger;

    move-result-object v6

    sget-object v7, Lio/sentry/a2;->DEBUG:Lio/sentry/a2;

    const-string v10, "Disk flush envelope fired"

    new-array v11, v9, [Ljava/lang/Object;

    invoke-interface {v6, v7, v10, v11}, Lio/sentry/ILogger;->e(Lio/sentry/a2;Ljava/lang/String;[Ljava/lang/Object;)V

    goto :goto_0

    :cond_0
    invoke-virtual {v7}, Lio/sentry/v2;->getLogger()Lio/sentry/ILogger;

    move-result-object v6

    sget-object v7, Lio/sentry/a2;->DEBUG:Lio/sentry/a2;

    const-string v10, "Not firing envelope flush as there\'s an ongoing transaction"

    new-array v11, v9, [Ljava/lang/Object;

    invoke-interface {v6, v7, v10, v11}, Lio/sentry/ILogger;->e(Lio/sentry/a2;Ljava/lang/String;[Ljava/lang/Object;)V

    :cond_1
    :goto_0
    iget-object v6, v8, Lio/sentry/transport/c;->c:Lio/sentry/v2;

    iget-object v7, v8, Lio/sentry/transport/c;->e:Lio/sentry/transport/h;

    invoke-interface {v7}, Lio/sentry/transport/h;->a()Z

    move-result v7

    const/4 v10, 0x1

    const-class v11, Lio/sentry/hints/g;

    if-eqz v7, :cond_8

    invoke-virtual {v6}, Lio/sentry/v2;->getClientReportRecorder()Lio/sentry/clientreport/f;

    move-result-object v7

    invoke-interface {v7, v2}, Lio/sentry/clientreport/f;->g(Lio/sentry/internal/debugmeta/c;)Lio/sentry/internal/debugmeta/c;

    move-result-object v7

    :try_start_0
    invoke-virtual {v6}, Lio/sentry/v2;->getDateProvider()Lio/sentry/I1;

    move-result-object v12

    invoke-interface {v12}, Lio/sentry/I1;->a()Lio/sentry/H1;

    move-result-object v12

    iget-object v13, v7, Lio/sentry/internal/debugmeta/c;->b:Ljava/lang/Object;

    check-cast v13, Lio/sentry/J1;

    invoke-virtual {v12}, Lio/sentry/H1;->d()J

    move-result-wide v14

    long-to-double v14, v14

    const-wide v16, 0x412e848000000000L    # 1000000.0

    div-double v14, v14, v16

    invoke-static {v14, v15}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v12

    invoke-virtual {v12}, Ljava/lang/Double;->longValue()J

    move-result-wide v14

    invoke-static {v14, v15}, Lio/sentry/config/a;->n(J)Ljava/util/Date;

    move-result-object v12

    iput-object v12, v13, Lio/sentry/J1;->d:Ljava/util/Date;

    iget-object v8, v8, Lio/sentry/transport/c;->f:Lio/sentry/transport/e;

    invoke-virtual {v8, v7}, Lio/sentry/transport/e;->d(Lio/sentry/internal/debugmeta/c;)Lio/sentry/config/a;

    move-result-object v8

    invoke-virtual {v8}, Lio/sentry/config/a;->x()Z

    move-result v12

    if-eqz v12, :cond_2

    invoke-interface {v3, v2}, Lio/sentry/cache/d;->p(Lio/sentry/internal/debugmeta/c;)V

    return-object v8

    :catch_0
    move-exception v0

    goto :goto_2

    :cond_2
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v8}, Lio/sentry/config/a;->r()I

    move-result v0

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v6}, Lio/sentry/v2;->getLogger()Lio/sentry/ILogger;

    move-result-object v2

    sget-object v3, Lio/sentry/a2;->ERROR:Lio/sentry/a2;

    new-array v9, v9, [Ljava/lang/Object;

    invoke-interface {v2, v3, v0, v9}, Lio/sentry/ILogger;->e(Lio/sentry/a2;Ljava/lang/String;[Ljava/lang/Object;)V

    invoke-virtual {v8}, Lio/sentry/config/a;->r()I

    move-result v2

    const/16 v3, 0x190

    if-lt v2, v3, :cond_4

    invoke-virtual {v8}, Lio/sentry/config/a;->r()I

    move-result v2

    const/16 v3, 0x1ad

    if-eq v2, v3, :cond_4

    if-nez v5, :cond_4

    invoke-static {v4}, Lio/sentry/config/a;->s(Lio/sentry/H;)Ljava/lang/Object;

    move-result-object v2

    invoke-static {v4}, Lio/sentry/config/a;->s(Lio/sentry/H;)Ljava/lang/Object;

    move-result-object v3

    invoke-virtual {v11, v3}, Ljava/lang/Class;->isInstance(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_3

    if-eqz v2, :cond_3

    goto :goto_1

    :cond_3
    invoke-virtual {v6}, Lio/sentry/v2;->getClientReportRecorder()Lio/sentry/clientreport/f;

    move-result-object v2

    sget-object v3, Lio/sentry/clientreport/d;->NETWORK_ERROR:Lio/sentry/clientreport/d;

    invoke-interface {v2, v3, v7}, Lio/sentry/clientreport/f;->a(Lio/sentry/clientreport/d;Lio/sentry/internal/debugmeta/c;)V

    :cond_4
    :goto_1
    new-instance v2, Ljava/lang/IllegalStateException;

    invoke-direct {v2, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v2
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    :goto_2
    invoke-static {v4}, Lio/sentry/config/a;->s(Lio/sentry/H;)Ljava/lang/Object;

    move-result-object v2

    invoke-static {v4}, Lio/sentry/config/a;->s(Lio/sentry/H;)Ljava/lang/Object;

    move-result-object v3

    invoke-virtual {v11, v3}, Ljava/lang/Class;->isInstance(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_6

    if-nez v2, :cond_5

    goto :goto_3

    :cond_5
    check-cast v2, Lio/sentry/hints/g;

    invoke-interface {v2, v10}, Lio/sentry/hints/g;->e(Z)V

    goto :goto_4

    :cond_6
    :goto_3
    if-nez v5, :cond_7

    invoke-virtual {v6}, Lio/sentry/v2;->getLogger()Lio/sentry/ILogger;

    move-result-object v3

    invoke-static {v11, v2, v3}, Lio/sentry/config/a;->z(Ljava/lang/Class;Ljava/lang/Object;Lio/sentry/ILogger;)V

    invoke-virtual {v6}, Lio/sentry/v2;->getClientReportRecorder()Lio/sentry/clientreport/f;

    move-result-object v2

    sget-object v3, Lio/sentry/clientreport/d;->NETWORK_ERROR:Lio/sentry/clientreport/d;

    invoke-interface {v2, v3, v7}, Lio/sentry/clientreport/f;->a(Lio/sentry/clientreport/d;Lio/sentry/internal/debugmeta/c;)V

    :cond_7
    :goto_4
    new-instance v2, Ljava/lang/IllegalStateException;

    const-string v3, "Sending the event failed."

    invoke-direct {v2, v3, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v2

    :cond_8
    invoke-static {v4}, Lio/sentry/config/a;->s(Lio/sentry/H;)Ljava/lang/Object;

    move-result-object v0

    invoke-static {v4}, Lio/sentry/config/a;->s(Lio/sentry/H;)Ljava/lang/Object;

    move-result-object v3

    invoke-virtual {v11, v3}, Ljava/lang/Class;->isInstance(Ljava/lang/Object;)Z

    move-result v3

    iget-object v4, v1, Lio/sentry/transport/b;->d:Lio/sentry/transport/r;

    if-eqz v3, :cond_9

    if-eqz v0, :cond_9

    check-cast v0, Lio/sentry/hints/g;

    invoke-interface {v0, v10}, Lio/sentry/hints/g;->e(Z)V

    return-object v4

    :cond_9
    if-nez v5, :cond_a

    invoke-virtual {v6}, Lio/sentry/v2;->getLogger()Lio/sentry/ILogger;

    move-result-object v3

    invoke-static {v11, v0, v3}, Lio/sentry/config/a;->z(Ljava/lang/Class;Ljava/lang/Object;Lio/sentry/ILogger;)V

    invoke-virtual {v6}, Lio/sentry/v2;->getClientReportRecorder()Lio/sentry/clientreport/f;

    move-result-object v0

    sget-object v3, Lio/sentry/clientreport/d;->NETWORK_ERROR:Lio/sentry/clientreport/d;

    invoke-interface {v0, v3, v2}, Lio/sentry/clientreport/f;->a(Lio/sentry/clientreport/d;Lio/sentry/internal/debugmeta/c;)V

    :cond_a
    return-object v4
.end method

.method public final run()V
    .locals 8

    const-class v0, Lio/sentry/hints/j;

    iget-object v1, p0, Lio/sentry/transport/b;->e:Lio/sentry/transport/c;

    iput-object p0, v1, Lio/sentry/transport/c;->g:Lio/sentry/transport/b;

    iget-object v1, p0, Lio/sentry/transport/b;->d:Lio/sentry/transport/r;

    const/4 v2, 0x0

    const/4 v3, 0x0

    :try_start_0
    invoke-virtual {p0}, Lio/sentry/transport/b;->b()Lio/sentry/config/a;

    move-result-object v1

    iget-object v4, p0, Lio/sentry/transport/b;->e:Lio/sentry/transport/c;

    iget-object v4, v4, Lio/sentry/transport/c;->c:Lio/sentry/v2;

    invoke-virtual {v4}, Lio/sentry/v2;->getLogger()Lio/sentry/ILogger;

    move-result-object v4

    sget-object v5, Lio/sentry/a2;->DEBUG:Lio/sentry/a2;

    const-string v6, "Envelope flushed"

    new-array v7, v3, [Ljava/lang/Object;

    invoke-interface {v4, v5, v6, v7}, Lio/sentry/ILogger;->e(Lio/sentry/a2;Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    iget-object v3, p0, Lio/sentry/transport/b;->b:Lio/sentry/H;

    invoke-static {v3}, Lio/sentry/config/a;->s(Lio/sentry/H;)Ljava/lang/Object;

    move-result-object v4

    invoke-static {v3}, Lio/sentry/config/a;->s(Lio/sentry/H;)Ljava/lang/Object;

    move-result-object v3

    invoke-virtual {v0, v3}, Ljava/lang/Class;->isInstance(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    if-eqz v4, :cond_0

    check-cast v4, Lio/sentry/hints/j;

    invoke-static {p0, v1, v4}, Lio/sentry/transport/b;->a(Lio/sentry/transport/b;Lio/sentry/config/a;Lio/sentry/hints/j;)V

    :cond_0
    iget-object v0, p0, Lio/sentry/transport/b;->e:Lio/sentry/transport/c;

    iput-object v2, v0, Lio/sentry/transport/c;->g:Lio/sentry/transport/b;

    return-void

    :catchall_0
    move-exception v4

    :try_start_1
    iget-object v5, p0, Lio/sentry/transport/b;->e:Lio/sentry/transport/c;

    iget-object v5, v5, Lio/sentry/transport/c;->c:Lio/sentry/v2;

    invoke-virtual {v5}, Lio/sentry/v2;->getLogger()Lio/sentry/ILogger;

    move-result-object v5

    sget-object v6, Lio/sentry/a2;->ERROR:Lio/sentry/a2;

    const-string v7, "Envelope submission failed"

    new-array v3, v3, [Ljava/lang/Object;

    invoke-interface {v5, v6, v4, v7, v3}, Lio/sentry/ILogger;->n(Lio/sentry/a2;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V

    throw v4
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    :catchall_1
    move-exception v3

    iget-object v4, p0, Lio/sentry/transport/b;->b:Lio/sentry/H;

    invoke-static {v4}, Lio/sentry/config/a;->s(Lio/sentry/H;)Ljava/lang/Object;

    move-result-object v5

    invoke-static {v4}, Lio/sentry/config/a;->s(Lio/sentry/H;)Ljava/lang/Object;

    move-result-object v4

    invoke-virtual {v0, v4}, Ljava/lang/Class;->isInstance(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    if-eqz v5, :cond_1

    check-cast v5, Lio/sentry/hints/j;

    invoke-static {p0, v1, v5}, Lio/sentry/transport/b;->a(Lio/sentry/transport/b;Lio/sentry/config/a;Lio/sentry/hints/j;)V

    :cond_1
    iget-object v0, p0, Lio/sentry/transport/b;->e:Lio/sentry/transport/c;

    iput-object v2, v0, Lio/sentry/transport/c;->g:Lio/sentry/transport/b;

    throw v3
.end method
