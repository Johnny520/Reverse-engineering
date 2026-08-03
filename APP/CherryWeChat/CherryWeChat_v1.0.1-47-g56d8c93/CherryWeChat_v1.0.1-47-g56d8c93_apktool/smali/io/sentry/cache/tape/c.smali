.class public final Lio/sentry/cache/tape/c;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/util/Iterator;


# instance fields
.field public final a:Lio/sentry/cache/tape/g;

.field public final synthetic b:Lio/sentry/cache/tape/d;


# direct methods
.method public constructor <init>(Lio/sentry/cache/tape/d;Lio/sentry/cache/tape/g;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lio/sentry/cache/tape/c;->b:Lio/sentry/cache/tape/d;

    iput-object p2, p0, Lio/sentry/cache/tape/c;->a:Lio/sentry/cache/tape/g;

    return-void
.end method


# virtual methods
.method public final hasNext()Z
    .locals 1

    iget-object v0, p0, Lio/sentry/cache/tape/c;->a:Lio/sentry/cache/tape/g;

    invoke-virtual {v0}, Lio/sentry/cache/tape/g;->hasNext()Z

    move-result v0

    return v0
.end method

.method public final next()Ljava/lang/Object;
    .locals 5

    iget-object v0, p0, Lio/sentry/cache/tape/c;->a:Lio/sentry/cache/tape/g;

    invoke-virtual {v0}, Lio/sentry/cache/tape/g;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [B

    iget-object v1, p0, Lio/sentry/cache/tape/c;->b:Lio/sentry/cache/tape/d;

    iget-object v1, v1, Lio/sentry/cache/tape/d;->c:Lio/sentry/B0;

    iget-object v1, v1, Lio/sentry/B0;->a:Ljava/lang/Object;

    check-cast v1, Lio/sentry/cache/f;

    iget-object v1, v1, Lio/sentry/cache/f;->a:Lio/sentry/v2;

    :try_start_0
    new-instance v2, Ljava/io/BufferedReader;

    new-instance v3, Ljava/io/InputStreamReader;

    new-instance v4, Ljava/io/ByteArrayInputStream;

    invoke-direct {v4, v0}, Ljava/io/ByteArrayInputStream;-><init>([B)V

    sget-object v0, Lio/sentry/cache/f;->c:Ljava/nio/charset/Charset;

    invoke-direct {v3, v4, v0}, Ljava/io/InputStreamReader;-><init>(Ljava/io/InputStream;Ljava/nio/charset/Charset;)V

    invoke-direct {v2, v3}, Ljava/io/BufferedReader;-><init>(Ljava/io/Reader;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :try_start_1
    invoke-virtual {v1}, Lio/sentry/v2;->getSerializer()Lio/sentry/e0;

    move-result-object v0

    const-class v3, Lio/sentry/f;

    invoke-interface {v0, v2, v3}, Lio/sentry/e0;->a(Ljava/io/Reader;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lio/sentry/f;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    :try_start_2
    invoke-virtual {v2}, Ljava/io/Reader;->close()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    return-object v0

    :catchall_0
    move-exception v0

    goto :goto_1

    :catchall_1
    move-exception v0

    :try_start_3
    invoke-virtual {v2}, Ljava/io/Reader;->close()V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    goto :goto_0

    :catchall_2
    move-exception v2

    :try_start_4
    invoke-virtual {v0, v2}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_0
    throw v0
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    :goto_1
    invoke-virtual {v1}, Lio/sentry/v2;->getLogger()Lio/sentry/ILogger;

    move-result-object v1

    sget-object v2, Lio/sentry/a2;->ERROR:Lio/sentry/a2;

    const/4 v3, 0x0

    new-array v3, v3, [Ljava/lang/Object;

    const-string v4, "Error reading entity from scope cache"

    invoke-interface {v1, v2, v0, v4, v3}, Lio/sentry/ILogger;->n(Lio/sentry/a2;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V

    const/4 v0, 0x0

    return-object v0
.end method

.method public final remove()V
    .locals 1

    iget-object v0, p0, Lio/sentry/cache/tape/c;->a:Lio/sentry/cache/tape/g;

    invoke-virtual {v0}, Lio/sentry/cache/tape/g;->remove()V

    return-void
.end method
