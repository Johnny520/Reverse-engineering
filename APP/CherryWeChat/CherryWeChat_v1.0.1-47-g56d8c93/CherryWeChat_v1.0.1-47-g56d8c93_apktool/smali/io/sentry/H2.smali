.class public Lio/sentry/H2;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lio/sentry/C0;


# instance fields
.field public final a:Lio/sentry/protocol/t;

.field public final b:Lio/sentry/K2;

.field public final c:Lio/sentry/K2;

.field public transient d:Lvx;

.field public final e:Ljava/lang/String;

.field public f:Ljava/lang/String;

.field public g:Lio/sentry/L2;

.field public h:Ljava/util/concurrent/ConcurrentHashMap;

.field public i:Ljava/lang/String;

.field public j:Ljava/util/Map;

.field public k:Ljava/util/concurrent/ConcurrentHashMap;

.field public l:Lio/sentry/n0;

.field public m:Lio/sentry/c;


# direct methods
.method public constructor <init>(Lio/sentry/H2;)V
    .locals 1

    .line 21
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 22
    new-instance v0, Ljava/util/concurrent/ConcurrentHashMap;

    invoke-direct {v0}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    iput-object v0, p0, Lio/sentry/H2;->h:Ljava/util/concurrent/ConcurrentHashMap;

    .line 23
    const-string v0, "manual"

    iput-object v0, p0, Lio/sentry/H2;->i:Ljava/lang/String;

    .line 24
    new-instance v0, Ljava/util/concurrent/ConcurrentHashMap;

    invoke-direct {v0}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    iput-object v0, p0, Lio/sentry/H2;->j:Ljava/util/Map;

    .line 25
    sget-object v0, Lio/sentry/n0;->SENTRY:Lio/sentry/n0;

    iput-object v0, p0, Lio/sentry/H2;->l:Lio/sentry/n0;

    .line 26
    iget-object v0, p1, Lio/sentry/H2;->a:Lio/sentry/protocol/t;

    iput-object v0, p0, Lio/sentry/H2;->a:Lio/sentry/protocol/t;

    .line 27
    iget-object v0, p1, Lio/sentry/H2;->b:Lio/sentry/K2;

    iput-object v0, p0, Lio/sentry/H2;->b:Lio/sentry/K2;

    .line 28
    iget-object v0, p1, Lio/sentry/H2;->c:Lio/sentry/K2;

    iput-object v0, p0, Lio/sentry/H2;->c:Lio/sentry/K2;

    .line 29
    iget-object v0, p1, Lio/sentry/H2;->d:Lvx;

    invoke-virtual {p0, v0}, Lio/sentry/H2;->a(Lvx;)V

    .line 30
    iget-object v0, p1, Lio/sentry/H2;->e:Ljava/lang/String;

    iput-object v0, p0, Lio/sentry/H2;->e:Ljava/lang/String;

    .line 31
    iget-object v0, p1, Lio/sentry/H2;->f:Ljava/lang/String;

    iput-object v0, p0, Lio/sentry/H2;->f:Ljava/lang/String;

    .line 32
    iget-object v0, p1, Lio/sentry/H2;->g:Lio/sentry/L2;

    iput-object v0, p0, Lio/sentry/H2;->g:Lio/sentry/L2;

    .line 33
    iget-object v0, p1, Lio/sentry/H2;->h:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-static {v0}, Lio/sentry/config/a;->A(Ljava/util/Map;)Ljava/util/concurrent/ConcurrentHashMap;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 34
    iput-object v0, p0, Lio/sentry/H2;->h:Ljava/util/concurrent/ConcurrentHashMap;

    .line 35
    :cond_0
    iget-object v0, p1, Lio/sentry/H2;->k:Ljava/util/concurrent/ConcurrentHashMap;

    .line 36
    invoke-static {v0}, Lio/sentry/config/a;->A(Ljava/util/Map;)Ljava/util/concurrent/ConcurrentHashMap;

    move-result-object v0

    if-eqz v0, :cond_1

    .line 37
    iput-object v0, p0, Lio/sentry/H2;->k:Ljava/util/concurrent/ConcurrentHashMap;

    .line 38
    :cond_1
    iget-object v0, p1, Lio/sentry/H2;->m:Lio/sentry/c;

    iput-object v0, p0, Lio/sentry/H2;->m:Lio/sentry/c;

    .line 39
    iget-object p1, p1, Lio/sentry/H2;->j:Ljava/util/Map;

    invoke-static {p1}, Lio/sentry/config/a;->A(Ljava/util/Map;)Ljava/util/concurrent/ConcurrentHashMap;

    move-result-object p1

    if-eqz p1, :cond_2

    .line 40
    iput-object p1, p0, Lio/sentry/H2;->j:Ljava/util/Map;

    :cond_2
    return-void
.end method

.method public constructor <init>(Lio/sentry/protocol/t;Lio/sentry/K2;Lio/sentry/K2;Ljava/lang/String;Ljava/lang/String;Lvx;Lio/sentry/L2;Ljava/lang/String;)V
    .locals 1

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    new-instance v0, Ljava/util/concurrent/ConcurrentHashMap;

    invoke-direct {v0}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    iput-object v0, p0, Lio/sentry/H2;->h:Ljava/util/concurrent/ConcurrentHashMap;

    .line 4
    const-string v0, "manual"

    iput-object v0, p0, Lio/sentry/H2;->i:Ljava/lang/String;

    .line 5
    new-instance v0, Ljava/util/concurrent/ConcurrentHashMap;

    invoke-direct {v0}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    iput-object v0, p0, Lio/sentry/H2;->j:Ljava/util/Map;

    .line 6
    sget-object v0, Lio/sentry/n0;->SENTRY:Lio/sentry/n0;

    iput-object v0, p0, Lio/sentry/H2;->l:Lio/sentry/n0;

    .line 7
    const-string v0, "traceId is required"

    invoke-static {v0, p1}, Lio/sentry/config/a;->D(Ljava/lang/String;Ljava/lang/Object;)V

    iput-object p1, p0, Lio/sentry/H2;->a:Lio/sentry/protocol/t;

    .line 8
    const-string p1, "spanId is required"

    invoke-static {p1, p2}, Lio/sentry/config/a;->D(Ljava/lang/String;Ljava/lang/Object;)V

    iput-object p2, p0, Lio/sentry/H2;->b:Lio/sentry/K2;

    .line 9
    const-string p1, "operation is required"

    invoke-static {p1, p4}, Lio/sentry/config/a;->D(Ljava/lang/String;Ljava/lang/Object;)V

    iput-object p4, p0, Lio/sentry/H2;->e:Ljava/lang/String;

    .line 10
    iput-object p3, p0, Lio/sentry/H2;->c:Lio/sentry/K2;

    .line 11
    iput-object p5, p0, Lio/sentry/H2;->f:Ljava/lang/String;

    .line 12
    iput-object p7, p0, Lio/sentry/H2;->g:Lio/sentry/L2;

    .line 13
    iput-object p8, p0, Lio/sentry/H2;->i:Ljava/lang/String;

    .line 14
    invoke-virtual {p0, p6}, Lio/sentry/H2;->a(Lvx;)V

    .line 15
    invoke-static {}, Lio/sentry/z1;->b()Lio/sentry/Z;

    move-result-object p1

    invoke-interface {p1}, Lio/sentry/Z;->l()Lio/sentry/v2;

    move-result-object p1

    .line 16
    invoke-virtual {p1}, Lio/sentry/v2;->getThreadChecker()Lio/sentry/util/thread/a;

    move-result-object p1

    .line 17
    iget-object p2, p0, Lio/sentry/H2;->j:Ljava/util/Map;

    .line 18
    invoke-interface {p1}, Lio/sentry/util/thread/a;->b()J

    move-result-wide p3

    invoke-static {p3, p4}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object p3

    .line 19
    const-string p4, "thread.id"

    invoke-interface {p2, p4, p3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 20
    iget-object p2, p0, Lio/sentry/H2;->j:Ljava/util/Map;

    const-string p3, "thread.name"

    invoke-interface {p1}, Lio/sentry/util/thread/a;->a()Ljava/lang/String;

    move-result-object p1

    invoke-interface {p2, p3, p1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Lio/sentry/protocol/t;Lio/sentry/K2;Ljava/lang/String;Lio/sentry/K2;)V
    .locals 9

    const/4 v7, 0x0

    .line 1
    const-string v8, "manual"

    const/4 v5, 0x0

    const/4 v6, 0x0

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-object v4, p3

    move-object v3, p4

    invoke-direct/range {v0 .. v8}, Lio/sentry/H2;-><init>(Lio/sentry/protocol/t;Lio/sentry/K2;Lio/sentry/K2;Ljava/lang/String;Ljava/lang/String;Lvx;Lio/sentry/L2;Ljava/lang/String;)V

    return-void
.end method


# virtual methods
.method public final a(Lvx;)V
    .locals 3

    iput-object p1, p0, Lio/sentry/H2;->d:Lvx;

    iget-object v0, p0, Lio/sentry/H2;->m:Lio/sentry/c;

    if-eqz v0, :cond_3

    if-nez p1, :cond_0

    goto :goto_1

    :cond_0
    iget-object v1, p1, Lvx;->a:Ljava/lang/Object;

    check-cast v1, Ljava/lang/Boolean;

    sget-object v2, Lio/sentry/util/j;->a:Ljava/nio/charset/Charset;

    if-nez v1, :cond_1

    const/4 v1, 0x0

    goto :goto_0

    :cond_1
    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    :goto_0
    const-string v2, "sentry-sampled"

    invoke-virtual {v0, v2, v1}, Lio/sentry/c;->b(Ljava/lang/String;Ljava/lang/String;)V

    iget-object v1, p1, Lvx;->c:Ljava/lang/Object;

    check-cast v1, Ljava/lang/Double;

    if-eqz v1, :cond_2

    iget-boolean v2, v0, Lio/sentry/c;->e:Z

    if-eqz v2, :cond_2

    iput-object v1, v0, Lio/sentry/c;->d:Ljava/lang/Double;

    :cond_2
    iget-object p1, p1, Lvx;->b:Ljava/io/Serializable;

    check-cast p1, Ljava/lang/Double;

    if-eqz p1, :cond_3

    iput-object p1, v0, Lio/sentry/c;->c:Ljava/lang/Double;

    :cond_3
    :goto_1
    return-void
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lio/sentry/H2;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lio/sentry/H2;

    iget-object v1, p0, Lio/sentry/H2;->a:Lio/sentry/protocol/t;

    iget-object v3, p1, Lio/sentry/H2;->a:Lio/sentry/protocol/t;

    invoke-virtual {v1, v3}, Lio/sentry/protocol/t;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_2

    iget-object v1, p0, Lio/sentry/H2;->b:Lio/sentry/K2;

    iget-object v3, p1, Lio/sentry/H2;->b:Lio/sentry/K2;

    invoke-virtual {v1, v3}, Lio/sentry/K2;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_2

    iget-object v1, p0, Lio/sentry/H2;->c:Lio/sentry/K2;

    iget-object v3, p1, Lio/sentry/H2;->c:Lio/sentry/K2;

    invoke-static {v1, v3}, Lio/sentry/config/a;->i(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_2

    iget-object v1, p0, Lio/sentry/H2;->e:Ljava/lang/String;

    iget-object v3, p1, Lio/sentry/H2;->e:Ljava/lang/String;

    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_2

    iget-object v1, p0, Lio/sentry/H2;->f:Ljava/lang/String;

    iget-object v3, p1, Lio/sentry/H2;->f:Ljava/lang/String;

    invoke-static {v1, v3}, Lio/sentry/config/a;->i(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_2

    iget-object v1, p0, Lio/sentry/H2;->g:Lio/sentry/L2;

    iget-object p1, p1, Lio/sentry/H2;->g:Lio/sentry/L2;

    if-ne v1, p1, :cond_2

    return v0

    :cond_2
    return v2
.end method

.method public final hashCode()I
    .locals 6

    iget-object v4, p0, Lio/sentry/H2;->f:Ljava/lang/String;

    iget-object v5, p0, Lio/sentry/H2;->g:Lio/sentry/L2;

    iget-object v0, p0, Lio/sentry/H2;->a:Lio/sentry/protocol/t;

    iget-object v1, p0, Lio/sentry/H2;->b:Lio/sentry/K2;

    iget-object v2, p0, Lio/sentry/H2;->c:Lio/sentry/K2;

    iget-object v3, p0, Lio/sentry/H2;->e:Ljava/lang/String;

    filled-new-array/range {v0 .. v5}, [Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Ljava/util/Arrays;->hashCode([Ljava/lang/Object;)I

    move-result v0

    return v0
.end method

.method public final serialize(Lio/sentry/Z0;Lio/sentry/ILogger;)V
    .locals 3

    check-cast p1, Lio/sentry/internal/debugmeta/c;

    invoke-virtual {p1}, Lio/sentry/internal/debugmeta/c;->h()Lio/sentry/internal/debugmeta/c;

    const-string v0, "trace_id"

    invoke-virtual {p1, v0}, Lio/sentry/internal/debugmeta/c;->p(Ljava/lang/String;)Lio/sentry/internal/debugmeta/c;

    iget-object v0, p0, Lio/sentry/H2;->a:Lio/sentry/protocol/t;

    invoke-virtual {v0, p1, p2}, Lio/sentry/protocol/t;->serialize(Lio/sentry/Z0;Lio/sentry/ILogger;)V

    const-string v0, "span_id"

    invoke-virtual {p1, v0}, Lio/sentry/internal/debugmeta/c;->p(Ljava/lang/String;)Lio/sentry/internal/debugmeta/c;

    iget-object v0, p0, Lio/sentry/H2;->b:Lio/sentry/K2;

    invoke-virtual {v0, p1, p2}, Lio/sentry/K2;->serialize(Lio/sentry/Z0;Lio/sentry/ILogger;)V

    iget-object v0, p0, Lio/sentry/H2;->c:Lio/sentry/K2;

    if-eqz v0, :cond_0

    const-string v1, "parent_span_id"

    invoke-virtual {p1, v1}, Lio/sentry/internal/debugmeta/c;->p(Ljava/lang/String;)Lio/sentry/internal/debugmeta/c;

    invoke-virtual {v0, p1, p2}, Lio/sentry/K2;->serialize(Lio/sentry/Z0;Lio/sentry/ILogger;)V

    :cond_0
    const-string v0, "op"

    invoke-virtual {p1, v0}, Lio/sentry/internal/debugmeta/c;->p(Ljava/lang/String;)Lio/sentry/internal/debugmeta/c;

    iget-object v0, p0, Lio/sentry/H2;->e:Ljava/lang/String;

    invoke-virtual {p1, v0}, Lio/sentry/internal/debugmeta/c;->z(Ljava/lang/String;)Lio/sentry/internal/debugmeta/c;

    iget-object v0, p0, Lio/sentry/H2;->f:Ljava/lang/String;

    if-eqz v0, :cond_1

    const-string v0, "description"

    invoke-virtual {p1, v0}, Lio/sentry/internal/debugmeta/c;->p(Ljava/lang/String;)Lio/sentry/internal/debugmeta/c;

    iget-object v0, p0, Lio/sentry/H2;->f:Ljava/lang/String;

    invoke-virtual {p1, v0}, Lio/sentry/internal/debugmeta/c;->z(Ljava/lang/String;)Lio/sentry/internal/debugmeta/c;

    :cond_1
    iget-object v0, p0, Lio/sentry/H2;->g:Lio/sentry/L2;

    if-eqz v0, :cond_2

    const-string v0, "status"

    invoke-virtual {p1, v0}, Lio/sentry/internal/debugmeta/c;->p(Ljava/lang/String;)Lio/sentry/internal/debugmeta/c;

    iget-object v0, p0, Lio/sentry/H2;->g:Lio/sentry/L2;

    invoke-virtual {p1, p2, v0}, Lio/sentry/internal/debugmeta/c;->w(Lio/sentry/ILogger;Ljava/lang/Object;)Lio/sentry/internal/debugmeta/c;

    :cond_2
    iget-object v0, p0, Lio/sentry/H2;->i:Ljava/lang/String;

    if-eqz v0, :cond_3

    const-string v0, "origin"

    invoke-virtual {p1, v0}, Lio/sentry/internal/debugmeta/c;->p(Ljava/lang/String;)Lio/sentry/internal/debugmeta/c;

    iget-object v0, p0, Lio/sentry/H2;->i:Ljava/lang/String;

    invoke-virtual {p1, p2, v0}, Lio/sentry/internal/debugmeta/c;->w(Lio/sentry/ILogger;Ljava/lang/Object;)Lio/sentry/internal/debugmeta/c;

    :cond_3
    iget-object v0, p0, Lio/sentry/H2;->h:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-interface {v0}, Ljava/util/Map;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_4

    const-string v0, "tags"

    invoke-virtual {p1, v0}, Lio/sentry/internal/debugmeta/c;->p(Ljava/lang/String;)Lio/sentry/internal/debugmeta/c;

    iget-object v0, p0, Lio/sentry/H2;->h:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-virtual {p1, p2, v0}, Lio/sentry/internal/debugmeta/c;->w(Lio/sentry/ILogger;Ljava/lang/Object;)Lio/sentry/internal/debugmeta/c;

    :cond_4
    iget-object v0, p0, Lio/sentry/H2;->j:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_5

    const-string v0, "data"

    invoke-virtual {p1, v0}, Lio/sentry/internal/debugmeta/c;->p(Ljava/lang/String;)Lio/sentry/internal/debugmeta/c;

    iget-object v0, p0, Lio/sentry/H2;->j:Ljava/util/Map;

    invoke-virtual {p1, p2, v0}, Lio/sentry/internal/debugmeta/c;->w(Lio/sentry/ILogger;Ljava/lang/Object;)Lio/sentry/internal/debugmeta/c;

    :cond_5
    iget-object v0, p0, Lio/sentry/H2;->k:Ljava/util/concurrent/ConcurrentHashMap;

    if-eqz v0, :cond_6

    invoke-interface {v0}, Ljava/util/Map;->keySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_6

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    iget-object v2, p0, Lio/sentry/H2;->k:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-static {v2, v1, p1, v1, p2}, Lio/sentry/d;->b(Ljava/util/concurrent/ConcurrentHashMap;Ljava/lang/String;Lio/sentry/internal/debugmeta/c;Ljava/lang/String;Lio/sentry/ILogger;)V

    goto :goto_0

    :cond_6
    invoke-virtual {p1}, Lio/sentry/internal/debugmeta/c;->k()Lio/sentry/internal/debugmeta/c;

    return-void
.end method
