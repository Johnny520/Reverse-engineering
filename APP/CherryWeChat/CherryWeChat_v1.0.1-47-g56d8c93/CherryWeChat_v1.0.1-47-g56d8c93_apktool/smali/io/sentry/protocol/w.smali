.class public final Lio/sentry/protocol/w;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lio/sentry/C0;


# instance fields
.field public final a:Ljava/lang/Double;

.field public final b:Ljava/lang/Double;

.field public final c:Lio/sentry/protocol/t;

.field public final d:Lio/sentry/K2;

.field public final e:Lio/sentry/K2;

.field public final f:Ljava/lang/String;

.field public final g:Ljava/lang/String;

.field public final h:Lio/sentry/L2;

.field public final i:Ljava/lang/String;

.field public final j:Ljava/util/Map;

.field public k:Ljava/util/Map;

.field public final l:Ljava/util/Map;

.field public m:Ljava/util/concurrent/ConcurrentHashMap;


# direct methods
.method public constructor <init>(Lio/sentry/G2;)V
    .locals 6

    .line 14
    iget-object v0, p1, Lio/sentry/G2;->j:Ljava/util/concurrent/ConcurrentHashMap;

    .line 15
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 16
    iget-object v1, p1, Lio/sentry/G2;->c:Lio/sentry/H2;

    .line 17
    iget-object v2, v1, Lio/sentry/H2;->f:Ljava/lang/String;

    .line 18
    iput-object v2, p0, Lio/sentry/protocol/w;->g:Ljava/lang/String;

    .line 19
    iget-object v2, v1, Lio/sentry/H2;->e:Ljava/lang/String;

    .line 20
    iput-object v2, p0, Lio/sentry/protocol/w;->f:Ljava/lang/String;

    .line 21
    iget-object v2, v1, Lio/sentry/H2;->b:Lio/sentry/K2;

    .line 22
    iput-object v2, p0, Lio/sentry/protocol/w;->d:Lio/sentry/K2;

    .line 23
    iget-object v2, v1, Lio/sentry/H2;->c:Lio/sentry/K2;

    .line 24
    iput-object v2, p0, Lio/sentry/protocol/w;->e:Lio/sentry/K2;

    .line 25
    iget-object v2, v1, Lio/sentry/H2;->a:Lio/sentry/protocol/t;

    .line 26
    iput-object v2, p0, Lio/sentry/protocol/w;->c:Lio/sentry/protocol/t;

    .line 27
    iget-object v2, v1, Lio/sentry/H2;->g:Lio/sentry/L2;

    .line 28
    iput-object v2, p0, Lio/sentry/protocol/w;->h:Lio/sentry/L2;

    .line 29
    iget-object v2, v1, Lio/sentry/H2;->i:Ljava/lang/String;

    .line 30
    iput-object v2, p0, Lio/sentry/protocol/w;->i:Ljava/lang/String;

    .line 31
    iget-object v1, v1, Lio/sentry/H2;->h:Ljava/util/concurrent/ConcurrentHashMap;

    .line 32
    invoke-static {v1}, Lio/sentry/config/a;->A(Ljava/util/Map;)Ljava/util/concurrent/ConcurrentHashMap;

    move-result-object v1

    if-eqz v1, :cond_0

    goto :goto_0

    .line 33
    :cond_0
    new-instance v1, Ljava/util/concurrent/ConcurrentHashMap;

    invoke-direct {v1}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    :goto_0
    iput-object v1, p0, Lio/sentry/protocol/w;->j:Ljava/util/Map;

    .line 34
    iget-object v1, p1, Lio/sentry/G2;->k:Ljava/util/concurrent/ConcurrentHashMap;

    .line 35
    invoke-static {v1}, Lio/sentry/config/a;->A(Ljava/util/Map;)Ljava/util/concurrent/ConcurrentHashMap;

    move-result-object v1

    if-eqz v1, :cond_1

    goto :goto_1

    .line 36
    :cond_1
    new-instance v1, Ljava/util/concurrent/ConcurrentHashMap;

    invoke-direct {v1}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    :goto_1
    iput-object v1, p0, Lio/sentry/protocol/w;->l:Ljava/util/Map;

    .line 37
    iget-object v1, p1, Lio/sentry/G2;->b:Lio/sentry/H1;

    const-wide v2, 0x41cdcd6500000000L    # 1.0E9

    if-nez v1, :cond_2

    const/4 v1, 0x0

    goto :goto_2

    .line 38
    :cond_2
    iget-object v4, p1, Lio/sentry/G2;->a:Lio/sentry/H1;

    .line 39
    invoke-virtual {v4, v1}, Lio/sentry/H1;->c(Lio/sentry/H1;)J

    move-result-wide v4

    long-to-double v4, v4

    div-double/2addr v4, v2

    .line 40
    invoke-static {v4, v5}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v1

    :goto_2
    iput-object v1, p0, Lio/sentry/protocol/w;->b:Ljava/lang/Double;

    .line 41
    iget-object p1, p1, Lio/sentry/G2;->a:Lio/sentry/H1;

    .line 42
    invoke-virtual {p1}, Lio/sentry/H1;->d()J

    move-result-wide v4

    long-to-double v4, v4

    div-double/2addr v4, v2

    invoke-static {v4, v5}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object p1

    iput-object p1, p0, Lio/sentry/protocol/w;->a:Ljava/lang/Double;

    .line 43
    iput-object v0, p0, Lio/sentry/protocol/w;->k:Ljava/util/Map;

    return-void
.end method

.method public constructor <init>(Ljava/lang/Double;Ljava/lang/Double;Lio/sentry/protocol/t;Lio/sentry/K2;Lio/sentry/K2;Ljava/lang/String;Ljava/lang/String;Lio/sentry/L2;Ljava/lang/String;Ljava/util/Map;Ljava/util/Map;Ljava/util/Map;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Lio/sentry/protocol/w;->a:Ljava/lang/Double;

    .line 3
    iput-object p2, p0, Lio/sentry/protocol/w;->b:Ljava/lang/Double;

    .line 4
    iput-object p3, p0, Lio/sentry/protocol/w;->c:Lio/sentry/protocol/t;

    .line 5
    iput-object p4, p0, Lio/sentry/protocol/w;->d:Lio/sentry/K2;

    .line 6
    iput-object p5, p0, Lio/sentry/protocol/w;->e:Lio/sentry/K2;

    .line 7
    iput-object p6, p0, Lio/sentry/protocol/w;->f:Ljava/lang/String;

    .line 8
    iput-object p7, p0, Lio/sentry/protocol/w;->g:Ljava/lang/String;

    .line 9
    iput-object p8, p0, Lio/sentry/protocol/w;->h:Lio/sentry/L2;

    .line 10
    iput-object p9, p0, Lio/sentry/protocol/w;->i:Ljava/lang/String;

    .line 11
    iput-object p10, p0, Lio/sentry/protocol/w;->j:Ljava/util/Map;

    .line 12
    iput-object p11, p0, Lio/sentry/protocol/w;->l:Ljava/util/Map;

    .line 13
    iput-object p12, p0, Lio/sentry/protocol/w;->k:Ljava/util/Map;

    return-void
.end method


# virtual methods
.method public final serialize(Lio/sentry/Z0;Lio/sentry/ILogger;)V
    .locals 5

    check-cast p1, Lio/sentry/internal/debugmeta/c;

    invoke-virtual {p1}, Lio/sentry/internal/debugmeta/c;->h()Lio/sentry/internal/debugmeta/c;

    const-string v0, "start_timestamp"

    invoke-virtual {p1, v0}, Lio/sentry/internal/debugmeta/c;->p(Ljava/lang/String;)Lio/sentry/internal/debugmeta/c;

    iget-object v0, p0, Lio/sentry/protocol/w;->a:Ljava/lang/Double;

    invoke-virtual {v0}, Ljava/lang/Double;->doubleValue()D

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/math/BigDecimal;->valueOf(D)Ljava/math/BigDecimal;

    move-result-object v0

    sget-object v1, Ljava/math/RoundingMode;->DOWN:Ljava/math/RoundingMode;

    const/4 v2, 0x6

    invoke-virtual {v0, v2, v1}, Ljava/math/BigDecimal;->setScale(ILjava/math/RoundingMode;)Ljava/math/BigDecimal;

    move-result-object v0

    invoke-virtual {p1, p2, v0}, Lio/sentry/internal/debugmeta/c;->w(Lio/sentry/ILogger;Ljava/lang/Object;)Lio/sentry/internal/debugmeta/c;

    iget-object v0, p0, Lio/sentry/protocol/w;->b:Ljava/lang/Double;

    if-eqz v0, :cond_0

    const-string v3, "timestamp"

    invoke-virtual {p1, v3}, Lio/sentry/internal/debugmeta/c;->p(Ljava/lang/String;)Lio/sentry/internal/debugmeta/c;

    invoke-virtual {v0}, Ljava/lang/Double;->doubleValue()D

    move-result-wide v3

    invoke-static {v3, v4}, Ljava/math/BigDecimal;->valueOf(D)Ljava/math/BigDecimal;

    move-result-object v0

    invoke-virtual {v0, v2, v1}, Ljava/math/BigDecimal;->setScale(ILjava/math/RoundingMode;)Ljava/math/BigDecimal;

    move-result-object v0

    invoke-virtual {p1, p2, v0}, Lio/sentry/internal/debugmeta/c;->w(Lio/sentry/ILogger;Ljava/lang/Object;)Lio/sentry/internal/debugmeta/c;

    :cond_0
    const-string v0, "trace_id"

    invoke-virtual {p1, v0}, Lio/sentry/internal/debugmeta/c;->p(Ljava/lang/String;)Lio/sentry/internal/debugmeta/c;

    iget-object v0, p0, Lio/sentry/protocol/w;->c:Lio/sentry/protocol/t;

    invoke-virtual {p1, p2, v0}, Lio/sentry/internal/debugmeta/c;->w(Lio/sentry/ILogger;Ljava/lang/Object;)Lio/sentry/internal/debugmeta/c;

    const-string v0, "span_id"

    invoke-virtual {p1, v0}, Lio/sentry/internal/debugmeta/c;->p(Ljava/lang/String;)Lio/sentry/internal/debugmeta/c;

    iget-object v0, p0, Lio/sentry/protocol/w;->d:Lio/sentry/K2;

    invoke-virtual {p1, p2, v0}, Lio/sentry/internal/debugmeta/c;->w(Lio/sentry/ILogger;Ljava/lang/Object;)Lio/sentry/internal/debugmeta/c;

    iget-object v0, p0, Lio/sentry/protocol/w;->e:Lio/sentry/K2;

    if-eqz v0, :cond_1

    const-string v1, "parent_span_id"

    invoke-virtual {p1, v1}, Lio/sentry/internal/debugmeta/c;->p(Ljava/lang/String;)Lio/sentry/internal/debugmeta/c;

    invoke-virtual {p1, p2, v0}, Lio/sentry/internal/debugmeta/c;->w(Lio/sentry/ILogger;Ljava/lang/Object;)Lio/sentry/internal/debugmeta/c;

    :cond_1
    const-string v0, "op"

    invoke-virtual {p1, v0}, Lio/sentry/internal/debugmeta/c;->p(Ljava/lang/String;)Lio/sentry/internal/debugmeta/c;

    iget-object v0, p0, Lio/sentry/protocol/w;->f:Ljava/lang/String;

    invoke-virtual {p1, v0}, Lio/sentry/internal/debugmeta/c;->z(Ljava/lang/String;)Lio/sentry/internal/debugmeta/c;

    iget-object v0, p0, Lio/sentry/protocol/w;->g:Ljava/lang/String;

    if-eqz v0, :cond_2

    const-string v1, "description"

    invoke-virtual {p1, v1}, Lio/sentry/internal/debugmeta/c;->p(Ljava/lang/String;)Lio/sentry/internal/debugmeta/c;

    invoke-virtual {p1, v0}, Lio/sentry/internal/debugmeta/c;->z(Ljava/lang/String;)Lio/sentry/internal/debugmeta/c;

    :cond_2
    iget-object v0, p0, Lio/sentry/protocol/w;->h:Lio/sentry/L2;

    if-eqz v0, :cond_3

    const-string v1, "status"

    invoke-virtual {p1, v1}, Lio/sentry/internal/debugmeta/c;->p(Ljava/lang/String;)Lio/sentry/internal/debugmeta/c;

    invoke-virtual {p1, p2, v0}, Lio/sentry/internal/debugmeta/c;->w(Lio/sentry/ILogger;Ljava/lang/Object;)Lio/sentry/internal/debugmeta/c;

    :cond_3
    iget-object v0, p0, Lio/sentry/protocol/w;->i:Ljava/lang/String;

    if-eqz v0, :cond_4

    const-string v1, "origin"

    invoke-virtual {p1, v1}, Lio/sentry/internal/debugmeta/c;->p(Ljava/lang/String;)Lio/sentry/internal/debugmeta/c;

    invoke-virtual {p1, p2, v0}, Lio/sentry/internal/debugmeta/c;->w(Lio/sentry/ILogger;Ljava/lang/Object;)Lio/sentry/internal/debugmeta/c;

    :cond_4
    iget-object v0, p0, Lio/sentry/protocol/w;->j:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->isEmpty()Z

    move-result v1

    if-nez v1, :cond_5

    const-string v1, "tags"

    invoke-virtual {p1, v1}, Lio/sentry/internal/debugmeta/c;->p(Ljava/lang/String;)Lio/sentry/internal/debugmeta/c;

    invoke-virtual {p1, p2, v0}, Lio/sentry/internal/debugmeta/c;->w(Lio/sentry/ILogger;Ljava/lang/Object;)Lio/sentry/internal/debugmeta/c;

    :cond_5
    iget-object v0, p0, Lio/sentry/protocol/w;->k:Ljava/util/Map;

    if-eqz v0, :cond_6

    const-string v0, "data"

    invoke-virtual {p1, v0}, Lio/sentry/internal/debugmeta/c;->p(Ljava/lang/String;)Lio/sentry/internal/debugmeta/c;

    iget-object v0, p0, Lio/sentry/protocol/w;->k:Ljava/util/Map;

    invoke-virtual {p1, p2, v0}, Lio/sentry/internal/debugmeta/c;->w(Lio/sentry/ILogger;Ljava/lang/Object;)Lio/sentry/internal/debugmeta/c;

    :cond_6
    iget-object v0, p0, Lio/sentry/protocol/w;->l:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->isEmpty()Z

    move-result v1

    if-nez v1, :cond_7

    const-string v1, "measurements"

    invoke-virtual {p1, v1}, Lio/sentry/internal/debugmeta/c;->p(Ljava/lang/String;)Lio/sentry/internal/debugmeta/c;

    invoke-virtual {p1, p2, v0}, Lio/sentry/internal/debugmeta/c;->w(Lio/sentry/ILogger;Ljava/lang/Object;)Lio/sentry/internal/debugmeta/c;

    :cond_7
    iget-object v0, p0, Lio/sentry/protocol/w;->m:Ljava/util/concurrent/ConcurrentHashMap;

    if-eqz v0, :cond_8

    invoke-interface {v0}, Ljava/util/Map;->keySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_8

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    iget-object v2, p0, Lio/sentry/protocol/w;->m:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-static {v2, v1, p1, v1, p2}, Lio/sentry/d;->b(Ljava/util/concurrent/ConcurrentHashMap;Ljava/lang/String;Lio/sentry/internal/debugmeta/c;Ljava/lang/String;Lio/sentry/ILogger;)V

    goto :goto_0

    :cond_8
    invoke-virtual {p1}, Lio/sentry/internal/debugmeta/c;->k()Lio/sentry/internal/debugmeta/c;

    return-void
.end method
