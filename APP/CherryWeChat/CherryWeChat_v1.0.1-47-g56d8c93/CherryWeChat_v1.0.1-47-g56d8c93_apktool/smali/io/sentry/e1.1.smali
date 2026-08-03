.class public final Lio/sentry/e1;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lio/sentry/C0;


# instance fields
.field public a:Lio/sentry/protocol/d;

.field public b:Lio/sentry/protocol/t;

.field public c:Lio/sentry/protocol/t;

.field public d:Lio/sentry/protocol/r;

.field public final e:Ljava/util/Map;

.field public f:Ljava/lang/String;

.field public g:Ljava/lang/String;

.field public h:Ljava/lang/String;

.field public i:Ljava/lang/String;

.field public j:D

.field public final k:Ljava/io/File;

.field public l:Ljava/lang/String;

.field public m:Ljava/util/concurrent/ConcurrentHashMap;


# direct methods
.method public constructor <init>(Lio/sentry/protocol/t;Lio/sentry/protocol/t;Ljava/io/File;Ljava/util/Map;Ljava/lang/Double;Lio/sentry/v2;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    iput-object v0, p0, Lio/sentry/e1;->l:Ljava/lang/String;

    iput-object p1, p0, Lio/sentry/e1;->b:Lio/sentry/protocol/t;

    iput-object p2, p0, Lio/sentry/e1;->c:Lio/sentry/protocol/t;

    iput-object p3, p0, Lio/sentry/e1;->k:Ljava/io/File;

    iput-object p4, p0, Lio/sentry/e1;->e:Ljava/util/Map;

    iput-object v0, p0, Lio/sentry/e1;->a:Lio/sentry/protocol/d;

    invoke-virtual {p6}, Lio/sentry/v2;->getSdkVersion()Lio/sentry/protocol/r;

    move-result-object p1

    iput-object p1, p0, Lio/sentry/e1;->d:Lio/sentry/protocol/r;

    invoke-virtual {p6}, Lio/sentry/v2;->getRelease()Ljava/lang/String;

    move-result-object p1

    if-eqz p1, :cond_0

    invoke-virtual {p6}, Lio/sentry/v2;->getRelease()Ljava/lang/String;

    move-result-object p1

    goto :goto_0

    :cond_0
    const-string p1, ""

    :goto_0
    iput-object p1, p0, Lio/sentry/e1;->g:Ljava/lang/String;

    invoke-virtual {p6}, Lio/sentry/v2;->getEnvironment()Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lio/sentry/e1;->h:Ljava/lang/String;

    const-string p1, "android"

    iput-object p1, p0, Lio/sentry/e1;->f:Ljava/lang/String;

    const-string p1, "2"

    iput-object p1, p0, Lio/sentry/e1;->i:Ljava/lang/String;

    invoke-virtual {p5}, Ljava/lang/Double;->doubleValue()D

    move-result-wide p1

    iput-wide p1, p0, Lio/sentry/e1;->j:D

    return-void
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 2

    if-ne p0, p1, :cond_0

    goto/16 :goto_0

    :cond_0
    instance-of v0, p1, Lio/sentry/e1;

    if-nez v0, :cond_1

    goto/16 :goto_1

    :cond_1
    check-cast p1, Lio/sentry/e1;

    iget-object v0, p0, Lio/sentry/e1;->a:Lio/sentry/protocol/d;

    iget-object v1, p1, Lio/sentry/e1;->a:Lio/sentry/protocol/d;

    invoke-static {v0, v1}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    iget-object v0, p0, Lio/sentry/e1;->b:Lio/sentry/protocol/t;

    iget-object v1, p1, Lio/sentry/e1;->b:Lio/sentry/protocol/t;

    invoke-static {v0, v1}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    iget-object v0, p0, Lio/sentry/e1;->c:Lio/sentry/protocol/t;

    iget-object v1, p1, Lio/sentry/e1;->c:Lio/sentry/protocol/t;

    invoke-static {v0, v1}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    iget-object v0, p0, Lio/sentry/e1;->d:Lio/sentry/protocol/r;

    iget-object v1, p1, Lio/sentry/e1;->d:Lio/sentry/protocol/r;

    invoke-static {v0, v1}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    iget-object v0, p0, Lio/sentry/e1;->e:Ljava/util/Map;

    iget-object v1, p1, Lio/sentry/e1;->e:Ljava/util/Map;

    invoke-static {v0, v1}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    iget-object v0, p0, Lio/sentry/e1;->f:Ljava/lang/String;

    iget-object v1, p1, Lio/sentry/e1;->f:Ljava/lang/String;

    invoke-static {v0, v1}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    iget-object v0, p0, Lio/sentry/e1;->g:Ljava/lang/String;

    iget-object v1, p1, Lio/sentry/e1;->g:Ljava/lang/String;

    invoke-static {v0, v1}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    iget-object v0, p0, Lio/sentry/e1;->h:Ljava/lang/String;

    iget-object v1, p1, Lio/sentry/e1;->h:Ljava/lang/String;

    invoke-static {v0, v1}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    iget-object v0, p0, Lio/sentry/e1;->i:Ljava/lang/String;

    iget-object v1, p1, Lio/sentry/e1;->i:Ljava/lang/String;

    invoke-static {v0, v1}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    iget-object v0, p0, Lio/sentry/e1;->l:Ljava/lang/String;

    iget-object v1, p1, Lio/sentry/e1;->l:Ljava/lang/String;

    invoke-static {v0, v1}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    iget-object v0, p0, Lio/sentry/e1;->m:Ljava/util/concurrent/ConcurrentHashMap;

    iget-object p1, p1, Lio/sentry/e1;->m:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-static {v0, p1}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_2

    :goto_0
    const/4 p1, 0x1

    return p1

    :cond_2
    :goto_1
    const/4 p1, 0x0

    return p1
.end method

.method public final hashCode()I
    .locals 11

    iget-object v0, p0, Lio/sentry/e1;->a:Lio/sentry/protocol/d;

    iget-object v1, p0, Lio/sentry/e1;->b:Lio/sentry/protocol/t;

    iget-object v2, p0, Lio/sentry/e1;->c:Lio/sentry/protocol/t;

    iget-object v3, p0, Lio/sentry/e1;->d:Lio/sentry/protocol/r;

    iget-object v5, p0, Lio/sentry/e1;->f:Ljava/lang/String;

    iget-object v6, p0, Lio/sentry/e1;->g:Ljava/lang/String;

    iget-object v7, p0, Lio/sentry/e1;->h:Ljava/lang/String;

    iget-object v8, p0, Lio/sentry/e1;->i:Ljava/lang/String;

    iget-object v9, p0, Lio/sentry/e1;->l:Ljava/lang/String;

    iget-object v10, p0, Lio/sentry/e1;->m:Ljava/util/concurrent/ConcurrentHashMap;

    iget-object v4, p0, Lio/sentry/e1;->e:Ljava/util/Map;

    filled-new-array/range {v0 .. v10}, [Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Ljava/util/Objects;->hash([Ljava/lang/Object;)I

    move-result v0

    return v0
.end method

.method public final serialize(Lio/sentry/Z0;Lio/sentry/ILogger;)V
    .locals 3

    check-cast p1, Lio/sentry/internal/debugmeta/c;

    invoke-virtual {p1}, Lio/sentry/internal/debugmeta/c;->h()Lio/sentry/internal/debugmeta/c;

    iget-object v0, p0, Lio/sentry/e1;->a:Lio/sentry/protocol/d;

    if-eqz v0, :cond_0

    const-string v0, "debug_meta"

    invoke-virtual {p1, v0}, Lio/sentry/internal/debugmeta/c;->p(Ljava/lang/String;)Lio/sentry/internal/debugmeta/c;

    iget-object v0, p0, Lio/sentry/e1;->a:Lio/sentry/protocol/d;

    invoke-virtual {p1, p2, v0}, Lio/sentry/internal/debugmeta/c;->w(Lio/sentry/ILogger;Ljava/lang/Object;)Lio/sentry/internal/debugmeta/c;

    :cond_0
    const-string v0, "profiler_id"

    invoke-virtual {p1, v0}, Lio/sentry/internal/debugmeta/c;->p(Ljava/lang/String;)Lio/sentry/internal/debugmeta/c;

    iget-object v0, p0, Lio/sentry/e1;->b:Lio/sentry/protocol/t;

    invoke-virtual {p1, p2, v0}, Lio/sentry/internal/debugmeta/c;->w(Lio/sentry/ILogger;Ljava/lang/Object;)Lio/sentry/internal/debugmeta/c;

    const-string v0, "chunk_id"

    invoke-virtual {p1, v0}, Lio/sentry/internal/debugmeta/c;->p(Ljava/lang/String;)Lio/sentry/internal/debugmeta/c;

    iget-object v0, p0, Lio/sentry/e1;->c:Lio/sentry/protocol/t;

    invoke-virtual {p1, p2, v0}, Lio/sentry/internal/debugmeta/c;->w(Lio/sentry/ILogger;Ljava/lang/Object;)Lio/sentry/internal/debugmeta/c;

    iget-object v0, p0, Lio/sentry/e1;->d:Lio/sentry/protocol/r;

    if-eqz v0, :cond_1

    const-string v0, "client_sdk"

    invoke-virtual {p1, v0}, Lio/sentry/internal/debugmeta/c;->p(Ljava/lang/String;)Lio/sentry/internal/debugmeta/c;

    iget-object v0, p0, Lio/sentry/e1;->d:Lio/sentry/protocol/r;

    invoke-virtual {p1, p2, v0}, Lio/sentry/internal/debugmeta/c;->w(Lio/sentry/ILogger;Ljava/lang/Object;)Lio/sentry/internal/debugmeta/c;

    :cond_1
    iget-object v0, p0, Lio/sentry/e1;->e:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->isEmpty()Z

    move-result v1

    if-nez v1, :cond_2

    iget-object v1, p1, Lio/sentry/internal/debugmeta/c;->b:Ljava/lang/Object;

    check-cast v1, Lio/sentry/vendor/gson/stream/c;

    iget-object v1, v1, Lio/sentry/vendor/gson/stream/c;->d:Ljava/lang/String;

    const-string v2, ""

    invoke-virtual {p1, v2}, Lio/sentry/internal/debugmeta/c;->t(Ljava/lang/String;)V

    const-string v2, "measurements"

    invoke-virtual {p1, v2}, Lio/sentry/internal/debugmeta/c;->p(Ljava/lang/String;)Lio/sentry/internal/debugmeta/c;

    invoke-virtual {p1, p2, v0}, Lio/sentry/internal/debugmeta/c;->w(Lio/sentry/ILogger;Ljava/lang/Object;)Lio/sentry/internal/debugmeta/c;

    invoke-virtual {p1, v1}, Lio/sentry/internal/debugmeta/c;->t(Ljava/lang/String;)V

    :cond_2
    const-string v0, "platform"

    invoke-virtual {p1, v0}, Lio/sentry/internal/debugmeta/c;->p(Ljava/lang/String;)Lio/sentry/internal/debugmeta/c;

    iget-object v0, p0, Lio/sentry/e1;->f:Ljava/lang/String;

    invoke-virtual {p1, p2, v0}, Lio/sentry/internal/debugmeta/c;->w(Lio/sentry/ILogger;Ljava/lang/Object;)Lio/sentry/internal/debugmeta/c;

    const-string v0, "release"

    invoke-virtual {p1, v0}, Lio/sentry/internal/debugmeta/c;->p(Ljava/lang/String;)Lio/sentry/internal/debugmeta/c;

    iget-object v0, p0, Lio/sentry/e1;->g:Ljava/lang/String;

    invoke-virtual {p1, p2, v0}, Lio/sentry/internal/debugmeta/c;->w(Lio/sentry/ILogger;Ljava/lang/Object;)Lio/sentry/internal/debugmeta/c;

    iget-object v0, p0, Lio/sentry/e1;->h:Ljava/lang/String;

    if-eqz v0, :cond_3

    const-string v0, "environment"

    invoke-virtual {p1, v0}, Lio/sentry/internal/debugmeta/c;->p(Ljava/lang/String;)Lio/sentry/internal/debugmeta/c;

    iget-object v0, p0, Lio/sentry/e1;->h:Ljava/lang/String;

    invoke-virtual {p1, p2, v0}, Lio/sentry/internal/debugmeta/c;->w(Lio/sentry/ILogger;Ljava/lang/Object;)Lio/sentry/internal/debugmeta/c;

    :cond_3
    const-string v0, "version"

    invoke-virtual {p1, v0}, Lio/sentry/internal/debugmeta/c;->p(Ljava/lang/String;)Lio/sentry/internal/debugmeta/c;

    iget-object v0, p0, Lio/sentry/e1;->i:Ljava/lang/String;

    invoke-virtual {p1, p2, v0}, Lio/sentry/internal/debugmeta/c;->w(Lio/sentry/ILogger;Ljava/lang/Object;)Lio/sentry/internal/debugmeta/c;

    iget-object v0, p0, Lio/sentry/e1;->l:Ljava/lang/String;

    if-eqz v0, :cond_4

    const-string v0, "sampled_profile"

    invoke-virtual {p1, v0}, Lio/sentry/internal/debugmeta/c;->p(Ljava/lang/String;)Lio/sentry/internal/debugmeta/c;

    iget-object v0, p0, Lio/sentry/e1;->l:Ljava/lang/String;

    invoke-virtual {p1, p2, v0}, Lio/sentry/internal/debugmeta/c;->w(Lio/sentry/ILogger;Ljava/lang/Object;)Lio/sentry/internal/debugmeta/c;

    :cond_4
    const-string v0, "timestamp"

    invoke-virtual {p1, v0}, Lio/sentry/internal/debugmeta/c;->p(Ljava/lang/String;)Lio/sentry/internal/debugmeta/c;

    iget-wide v0, p0, Lio/sentry/e1;->j:D

    invoke-static {v0, v1}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v0

    invoke-virtual {p1, p2, v0}, Lio/sentry/internal/debugmeta/c;->w(Lio/sentry/ILogger;Ljava/lang/Object;)Lio/sentry/internal/debugmeta/c;

    iget-object v0, p0, Lio/sentry/e1;->m:Ljava/util/concurrent/ConcurrentHashMap;

    if-eqz v0, :cond_5

    invoke-interface {v0}, Ljava/util/Map;->keySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_5

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    iget-object v2, p0, Lio/sentry/e1;->m:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-static {v2, v1, p1, v1, p2}, Lio/sentry/d;->b(Ljava/util/concurrent/ConcurrentHashMap;Ljava/lang/String;Lio/sentry/internal/debugmeta/c;Ljava/lang/String;Lio/sentry/ILogger;)V

    goto :goto_0

    :cond_5
    invoke-virtual {p1}, Lio/sentry/internal/debugmeta/c;->k()Lio/sentry/internal/debugmeta/c;

    return-void
.end method
