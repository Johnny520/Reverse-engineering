.class public abstract Lio/sentry/cache/tape/e;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Iterable;
.implements Ljava/io/Closeable;


# virtual methods
.method public clear()V
    .locals 1

    invoke-virtual {p0}, Lio/sentry/cache/tape/e;->size()I

    move-result v0

    invoke-virtual {p0, v0}, Lio/sentry/cache/tape/e;->remove(I)V

    return-void
.end method

.method public abstract q(Ljava/lang/Object;)V
.end method

.method public abstract remove(I)V
.end method

.method public abstract size()I
.end method
