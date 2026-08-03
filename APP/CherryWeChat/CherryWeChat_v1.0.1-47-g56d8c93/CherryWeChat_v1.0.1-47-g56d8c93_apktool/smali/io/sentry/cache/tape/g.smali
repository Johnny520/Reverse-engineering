.class public final Lio/sentry/cache/tape/g;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/util/Iterator;


# instance fields
.field public a:I

.field public b:J

.field public c:I

.field public final synthetic d:Lio/sentry/cache/tape/h;


# direct methods
.method public constructor <init>(Lio/sentry/cache/tape/h;)V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lio/sentry/cache/tape/g;->d:Lio/sentry/cache/tape/h;

    const/4 v0, 0x0

    iput v0, p0, Lio/sentry/cache/tape/g;->a:I

    iget-object v0, p1, Lio/sentry/cache/tape/h;->e:Lio/sentry/cache/tape/f;

    iget-wide v0, v0, Lio/sentry/cache/tape/f;->a:J

    iput-wide v0, p0, Lio/sentry/cache/tape/g;->b:J

    iget p1, p1, Lio/sentry/cache/tape/h;->h:I

    iput p1, p0, Lio/sentry/cache/tape/g;->c:I

    return-void
.end method


# virtual methods
.method public final hasNext()Z
    .locals 3

    iget-object v0, p0, Lio/sentry/cache/tape/g;->d:Lio/sentry/cache/tape/h;

    iget-boolean v1, v0, Lio/sentry/cache/tape/h;->j:Z

    if-nez v1, :cond_2

    iget v1, v0, Lio/sentry/cache/tape/h;->h:I

    iget v2, p0, Lio/sentry/cache/tape/g;->c:I

    if-ne v1, v2, :cond_1

    iget v1, p0, Lio/sentry/cache/tape/g;->a:I

    iget v0, v0, Lio/sentry/cache/tape/h;->d:I

    if-eq v1, v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0

    :cond_1
    new-instance v0, Ljava/util/ConcurrentModificationException;

    invoke-direct {v0}, Ljava/util/ConcurrentModificationException;-><init>()V

    throw v0

    :cond_2
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "closed"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final next()Ljava/lang/Object;
    .locals 8

    sget-object v0, Lio/sentry/cache/tape/h;->k:[B

    iget-object v1, p0, Lio/sentry/cache/tape/g;->d:Lio/sentry/cache/tape/h;

    iget-boolean v2, v1, Lio/sentry/cache/tape/h;->j:Z

    if-nez v2, :cond_4

    iget v2, v1, Lio/sentry/cache/tape/h;->h:I

    iget v3, p0, Lio/sentry/cache/tape/g;->c:I

    if-ne v2, v3, :cond_3

    iget v2, v1, Lio/sentry/cache/tape/h;->d:I

    if-eqz v2, :cond_2

    iget v3, p0, Lio/sentry/cache/tape/g;->a:I

    if-ge v3, v2, :cond_1

    :try_start_0
    iget-wide v2, p0, Lio/sentry/cache/tape/g;->b:J

    invoke-virtual {v1, v2, v3}, Lio/sentry/cache/tape/h;->r(J)Lio/sentry/cache/tape/f;

    move-result-object v2

    iget v3, v2, Lio/sentry/cache/tape/f;->b:I

    iget-wide v4, v2, Lio/sentry/cache/tape/f;->a:J

    new-array v2, v3, [B

    const-wide/16 v6, 0x4

    add-long/2addr v4, v6

    invoke-virtual {v1, v4, v5}, Lio/sentry/cache/tape/h;->y(J)J

    move-result-wide v6

    iput-wide v6, p0, Lio/sentry/cache/tape/g;->b:J

    invoke-virtual {v1, v3, v6, v7, v2}, Lio/sentry/cache/tape/h;->w(IJ[B)Z

    move-result v6

    if-nez v6, :cond_0

    iget v2, v1, Lio/sentry/cache/tape/h;->d:I

    iput v2, p0, Lio/sentry/cache/tape/g;->a:I

    return-object v0

    :catch_0
    move-exception v0

    goto :goto_0

    :cond_0
    int-to-long v6, v3

    add-long/2addr v4, v6

    invoke-virtual {v1, v4, v5}, Lio/sentry/cache/tape/h;->y(J)J

    move-result-wide v3

    iput-wide v3, p0, Lio/sentry/cache/tape/g;->b:J

    iget v3, p0, Lio/sentry/cache/tape/g;->a:I

    add-int/lit8 v3, v3, 0x1

    iput v3, p0, Lio/sentry/cache/tape/g;->a:I
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/OutOfMemoryError; {:try_start_0 .. :try_end_0} :catch_1

    return-object v2

    :catch_1
    invoke-virtual {v1}, Lio/sentry/cache/tape/h;->v()V

    iget v1, v1, Lio/sentry/cache/tape/h;->d:I

    iput v1, p0, Lio/sentry/cache/tape/g;->a:I

    return-object v0

    :goto_0
    throw v0

    :cond_1
    new-instance v0, Ljava/util/NoSuchElementException;

    invoke-direct {v0}, Ljava/util/NoSuchElementException;-><init>()V

    throw v0

    :cond_2
    new-instance v0, Ljava/util/NoSuchElementException;

    invoke-direct {v0}, Ljava/util/NoSuchElementException;-><init>()V

    throw v0

    :cond_3
    new-instance v0, Ljava/util/ConcurrentModificationException;

    invoke-direct {v0}, Ljava/util/ConcurrentModificationException;-><init>()V

    throw v0

    :cond_4
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "closed"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final remove()V
    .locals 3

    iget-object v0, p0, Lio/sentry/cache/tape/g;->d:Lio/sentry/cache/tape/h;

    iget v1, v0, Lio/sentry/cache/tape/h;->h:I

    iget v2, p0, Lio/sentry/cache/tape/g;->c:I

    if-ne v1, v2, :cond_2

    iget v1, v0, Lio/sentry/cache/tape/h;->d:I

    if-eqz v1, :cond_1

    iget v1, p0, Lio/sentry/cache/tape/g;->a:I

    const/4 v2, 0x1

    if-ne v1, v2, :cond_0

    invoke-virtual {v0, v2}, Lio/sentry/cache/tape/h;->remove(I)V

    iget v0, v0, Lio/sentry/cache/tape/h;->h:I

    iput v0, p0, Lio/sentry/cache/tape/g;->c:I

    iget v0, p0, Lio/sentry/cache/tape/g;->a:I

    sub-int/2addr v0, v2

    iput v0, p0, Lio/sentry/cache/tape/g;->a:I

    return-void

    :cond_0
    new-instance v0, Ljava/lang/UnsupportedOperationException;

    const-string v1, "Removal is only permitted from the head."

    invoke-direct {v0, v1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1
    new-instance v0, Ljava/util/NoSuchElementException;

    invoke-direct {v0}, Ljava/util/NoSuchElementException;-><init>()V

    throw v0

    :cond_2
    new-instance v0, Ljava/util/ConcurrentModificationException;

    invoke-direct {v0}, Ljava/util/ConcurrentModificationException;-><init>()V

    throw v0
.end method
