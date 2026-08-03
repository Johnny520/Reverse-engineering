.class public final Lio/sentry/util/a;
.super Ljava/util/concurrent/locks/ReentrantLock;
.source ""


# virtual methods
.method public final a()Lio/sentry/r;
    .locals 2

    invoke-virtual {p0}, Ljava/util/concurrent/locks/ReentrantLock;->lock()V

    new-instance v0, Lio/sentry/r;

    const/4 v1, 0x1

    invoke-direct {v0, v1, p0}, Lio/sentry/r;-><init>(ILjava/lang/Object;)V

    return-object v0
.end method
