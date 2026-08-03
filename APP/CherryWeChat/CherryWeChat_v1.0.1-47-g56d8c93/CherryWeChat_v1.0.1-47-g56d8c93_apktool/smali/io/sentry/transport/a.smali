.class public final synthetic Lio/sentry/transport/a;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/util/concurrent/RejectedExecutionHandler;


# instance fields
.field public final synthetic a:Lio/sentry/cache/d;

.field public final synthetic b:Lio/sentry/ILogger;


# direct methods
.method public synthetic constructor <init>(Lio/sentry/cache/d;Lio/sentry/ILogger;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lio/sentry/transport/a;->a:Lio/sentry/cache/d;

    iput-object p2, p0, Lio/sentry/transport/a;->b:Lio/sentry/ILogger;

    return-void
.end method


# virtual methods
.method public final rejectedExecution(Ljava/lang/Runnable;Ljava/util/concurrent/ThreadPoolExecutor;)V
    .locals 2

    instance-of p2, p1, Lio/sentry/transport/b;

    if-eqz p2, :cond_3

    check-cast p1, Lio/sentry/transport/b;

    iget-object p2, p1, Lio/sentry/transport/b;->b:Lio/sentry/H;

    const-class v0, Lio/sentry/hints/d;

    invoke-static {p2, v0}, Lio/sentry/config/a;->v(Lio/sentry/H;Ljava/lang/Class;)Z

    move-result v0

    if-nez v0, :cond_0

    iget-object p1, p1, Lio/sentry/transport/b;->a:Lio/sentry/internal/debugmeta/c;

    iget-object v0, p0, Lio/sentry/transport/a;->a:Lio/sentry/cache/d;

    invoke-interface {v0, p1, p2}, Lio/sentry/cache/d;->i(Lio/sentry/internal/debugmeta/c;Lio/sentry/H;)Z

    :cond_0
    invoke-static {p2}, Lio/sentry/config/a;->s(Lio/sentry/H;)Ljava/lang/Object;

    move-result-object p1

    invoke-static {p2}, Lio/sentry/config/a;->s(Lio/sentry/H;)Ljava/lang/Object;

    move-result-object v0

    const-class v1, Lio/sentry/hints/j;

    invoke-virtual {v1, v0}, Ljava/lang/Class;->isInstance(Ljava/lang/Object;)Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_1

    if-eqz p1, :cond_1

    check-cast p1, Lio/sentry/hints/j;

    invoke-interface {p1, v1}, Lio/sentry/hints/j;->b(Z)V

    :cond_1
    invoke-static {p2}, Lio/sentry/config/a;->s(Lio/sentry/H;)Ljava/lang/Object;

    move-result-object p1

    invoke-static {p2}, Lio/sentry/config/a;->s(Lio/sentry/H;)Ljava/lang/Object;

    move-result-object p2

    const-class v0, Lio/sentry/hints/g;

    invoke-virtual {v0, p2}, Ljava/lang/Class;->isInstance(Ljava/lang/Object;)Z

    move-result p2

    if-eqz p2, :cond_2

    if-eqz p1, :cond_2

    check-cast p1, Lio/sentry/hints/g;

    const/4 p2, 0x1

    invoke-interface {p1, p2}, Lio/sentry/hints/g;->e(Z)V

    :cond_2
    sget-object p1, Lio/sentry/a2;->WARNING:Lio/sentry/a2;

    const-string p2, "Envelope rejected"

    new-array v0, v1, [Ljava/lang/Object;

    iget-object v1, p0, Lio/sentry/transport/a;->b:Lio/sentry/ILogger;

    invoke-interface {v1, p1, p2, v0}, Lio/sentry/ILogger;->e(Lio/sentry/a2;Ljava/lang/String;[Ljava/lang/Object;)V

    :cond_3
    return-void
.end method
