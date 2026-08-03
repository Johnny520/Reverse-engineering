.class public final Lio/sentry/protocol/A;
.super Lio/sentry/C1;
.source ""

# interfaces
.implements Lio/sentry/C0;


# instance fields
.field public p:Ljava/lang/String;

.field public q:Ljava/lang/Double;

.field public r:Ljava/lang/Double;

.field public final s:Ljava/util/ArrayList;

.field public final t:Ljava/util/HashMap;

.field public u:Lio/sentry/d2;

.field public v:Ljava/util/concurrent/ConcurrentHashMap;


# direct methods
.method public constructor <init>(Lio/sentry/D2;)V
    .locals 12

    .line 14
    iget-object v0, p1, Lio/sentry/D2;->a:Lio/sentry/protocol/t;

    .line 15
    invoke-direct {p0, v0}, Lio/sentry/C1;-><init>(Lio/sentry/protocol/t;)V

    .line 16
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lio/sentry/protocol/A;->s:Ljava/util/ArrayList;

    .line 17
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lio/sentry/protocol/A;->t:Ljava/util/HashMap;

    .line 18
    iget-object v0, p1, Lio/sentry/D2;->b:Lio/sentry/G2;

    .line 19
    iget-object v1, v0, Lio/sentry/G2;->a:Lio/sentry/H1;

    .line 20
    invoke-virtual {v1}, Lio/sentry/H1;->d()J

    move-result-wide v1

    long-to-double v1, v1

    const-wide v3, 0x41cdcd6500000000L    # 1.0E9

    div-double/2addr v1, v3

    invoke-static {v1, v2}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v1

    iput-object v1, p0, Lio/sentry/protocol/A;->q:Ljava/lang/Double;

    .line 21
    iget-object v1, v0, Lio/sentry/G2;->a:Lio/sentry/H1;

    .line 22
    iget-object v2, v0, Lio/sentry/G2;->b:Lio/sentry/H1;

    .line 23
    invoke-virtual {v1, v2}, Lio/sentry/H1;->c(Lio/sentry/H1;)J

    move-result-wide v1

    long-to-double v1, v1

    div-double/2addr v1, v3

    .line 24
    invoke-static {v1, v2}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v1

    iput-object v1, p0, Lio/sentry/protocol/A;->r:Ljava/lang/Double;

    .line 25
    iget-object v1, p1, Lio/sentry/D2;->e:Ljava/lang/String;

    .line 26
    iput-object v1, p0, Lio/sentry/protocol/A;->p:Ljava/lang/String;

    .line 27
    iget-object v1, p1, Lio/sentry/D2;->c:Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 28
    invoke-virtual {v1}, Ljava/util/concurrent/CopyOnWriteArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_0
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lio/sentry/G2;

    .line 29
    sget-object v3, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-virtual {v2}, Lio/sentry/G2;->v()Ljava/lang/Boolean;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/lang/Boolean;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_0

    .line 30
    iget-object v3, p0, Lio/sentry/protocol/A;->s:Ljava/util/ArrayList;

    new-instance v4, Lio/sentry/protocol/w;

    invoke-direct {v4, v2}, Lio/sentry/protocol/w;-><init>(Lio/sentry/G2;)V

    invoke-virtual {v3, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 31
    :cond_1
    iget-object v1, p0, Lio/sentry/C1;->b:Lio/sentry/protocol/c;

    .line 32
    iget-object v2, p1, Lio/sentry/D2;->p:Lio/sentry/protocol/c;

    .line 33
    invoke-virtual {v1, v2}, Lio/sentry/protocol/c;->k(Lio/sentry/protocol/c;)V

    .line 34
    iget-object v2, v0, Lio/sentry/G2;->c:Lio/sentry/H2;

    .line 35
    iget-object v0, v0, Lio/sentry/G2;->j:Ljava/util/concurrent/ConcurrentHashMap;

    .line 36
    new-instance v3, Lio/sentry/H2;

    .line 37
    iget-object v4, v2, Lio/sentry/H2;->a:Lio/sentry/protocol/t;

    .line 38
    iget-object v5, v2, Lio/sentry/H2;->b:Lio/sentry/K2;

    .line 39
    iget-object v6, v2, Lio/sentry/H2;->c:Lio/sentry/K2;

    .line 40
    iget-object v7, v2, Lio/sentry/H2;->e:Ljava/lang/String;

    .line 41
    iget-object v8, v2, Lio/sentry/H2;->f:Ljava/lang/String;

    .line 42
    iget-object v9, v2, Lio/sentry/H2;->d:Lvx;

    .line 43
    iget-object v10, v2, Lio/sentry/H2;->g:Lio/sentry/L2;

    .line 44
    iget-object v11, v2, Lio/sentry/H2;->i:Ljava/lang/String;

    .line 45
    invoke-direct/range {v3 .. v11}, Lio/sentry/H2;-><init>(Lio/sentry/protocol/t;Lio/sentry/K2;Lio/sentry/K2;Ljava/lang/String;Ljava/lang/String;Lvx;Lio/sentry/L2;Ljava/lang/String;)V

    .line 46
    iget-object v2, v2, Lio/sentry/H2;->h:Ljava/util/concurrent/ConcurrentHashMap;

    .line 47
    invoke-interface {v2}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v2

    invoke-interface {v2}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_1
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_2

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/util/Map$Entry;

    .line 48
    invoke-interface {v4}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/lang/String;

    invoke-interface {v4}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/String;

    invoke-virtual {p0, v5, v4}, Lio/sentry/C1;->b(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_1

    :cond_2
    if-eqz v0, :cond_5

    .line 49
    invoke-virtual {v0}, Ljava/util/concurrent/ConcurrentHashMap;->entrySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_2
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_5

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/util/Map$Entry;

    .line 50
    invoke-interface {v2}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/String;

    invoke-interface {v2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v2

    if-nez v4, :cond_3

    goto :goto_2

    :cond_3
    if-nez v2, :cond_4

    .line 51
    iget-object v2, v3, Lio/sentry/H2;->j:Ljava/util/Map;

    invoke-interface {v2, v4}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_2

    .line 52
    :cond_4
    iget-object v5, v3, Lio/sentry/H2;->j:Ljava/util/Map;

    invoke-interface {v5, v4, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_2

    .line 53
    :cond_5
    invoke-virtual {v1, v3}, Lio/sentry/protocol/c;->t(Lio/sentry/H2;)V

    .line 54
    new-instance v0, Lio/sentry/d2;

    .line 55
    iget-object p1, p1, Lio/sentry/D2;->n:Lio/sentry/protocol/C;

    .line 56
    invoke-virtual {p1}, Lio/sentry/protocol/C;->apiName()Ljava/lang/String;

    move-result-object p1

    const/4 v1, 0x1

    invoke-direct {v0, v1, p1}, Lio/sentry/d2;-><init>(ILjava/lang/Object;)V

    iput-object v0, p0, Lio/sentry/protocol/A;->u:Lio/sentry/d2;

    return-void
.end method

.method public constructor <init>(Ljava/util/ArrayList;Ljava/util/HashMap;Lio/sentry/d2;)V
    .locals 4

    const-wide/16 v0, 0x0

    invoke-static {v0, v1}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v0

    .line 1
    invoke-direct {p0}, Lio/sentry/C1;-><init>()V

    .line 2
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    iput-object v1, p0, Lio/sentry/protocol/A;->s:Ljava/util/ArrayList;

    .line 3
    new-instance v2, Ljava/util/HashMap;

    invoke-direct {v2}, Ljava/util/HashMap;-><init>()V

    iput-object v2, p0, Lio/sentry/protocol/A;->t:Ljava/util/HashMap;

    .line 4
    const-string v3, ""

    iput-object v3, p0, Lio/sentry/protocol/A;->p:Ljava/lang/String;

    .line 5
    iput-object v0, p0, Lio/sentry/protocol/A;->q:Ljava/lang/Double;

    const/4 v0, 0x0

    .line 6
    iput-object v0, p0, Lio/sentry/protocol/A;->r:Ljava/lang/Double;

    .line 7
    invoke-virtual {v1, p1}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 8
    invoke-virtual {v2, p2}, Ljava/util/HashMap;->putAll(Ljava/util/Map;)V

    .line 9
    invoke-virtual {p1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result p2

    if-eqz p2, :cond_0

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lio/sentry/protocol/w;

    .line 10
    iget-object v0, p0, Lio/sentry/protocol/A;->t:Ljava/util/HashMap;

    .line 11
    iget-object p2, p2, Lio/sentry/protocol/w;->l:Ljava/util/Map;

    .line 12
    invoke-virtual {v0, p2}, Ljava/util/HashMap;->putAll(Ljava/util/Map;)V

    goto :goto_0

    .line 13
    :cond_0
    iput-object p3, p0, Lio/sentry/protocol/A;->u:Lio/sentry/d2;

    return-void
.end method


# virtual methods
.method public final serialize(Lio/sentry/Z0;Lio/sentry/ILogger;)V
    .locals 6

    check-cast p1, Lio/sentry/internal/debugmeta/c;

    invoke-virtual {p1}, Lio/sentry/internal/debugmeta/c;->h()Lio/sentry/internal/debugmeta/c;

    iget-object v0, p0, Lio/sentry/protocol/A;->p:Ljava/lang/String;

    const-string v1, "transaction"

    if-eqz v0, :cond_0

    invoke-virtual {p1, v1}, Lio/sentry/internal/debugmeta/c;->p(Ljava/lang/String;)Lio/sentry/internal/debugmeta/c;

    iget-object v0, p0, Lio/sentry/protocol/A;->p:Ljava/lang/String;

    invoke-virtual {p1, v0}, Lio/sentry/internal/debugmeta/c;->z(Ljava/lang/String;)Lio/sentry/internal/debugmeta/c;

    :cond_0
    const-string v0, "start_timestamp"

    invoke-virtual {p1, v0}, Lio/sentry/internal/debugmeta/c;->p(Ljava/lang/String;)Lio/sentry/internal/debugmeta/c;

    iget-object v0, p0, Lio/sentry/protocol/A;->q:Ljava/lang/Double;

    invoke-virtual {v0}, Ljava/lang/Double;->doubleValue()D

    move-result-wide v2

    invoke-static {v2, v3}, Ljava/math/BigDecimal;->valueOf(D)Ljava/math/BigDecimal;

    move-result-object v0

    sget-object v2, Ljava/math/RoundingMode;->DOWN:Ljava/math/RoundingMode;

    const/4 v3, 0x6

    invoke-virtual {v0, v3, v2}, Ljava/math/BigDecimal;->setScale(ILjava/math/RoundingMode;)Ljava/math/BigDecimal;

    move-result-object v0

    invoke-virtual {p1, p2, v0}, Lio/sentry/internal/debugmeta/c;->w(Lio/sentry/ILogger;Ljava/lang/Object;)Lio/sentry/internal/debugmeta/c;

    iget-object v0, p0, Lio/sentry/protocol/A;->r:Ljava/lang/Double;

    if-eqz v0, :cond_1

    const-string v0, "timestamp"

    invoke-virtual {p1, v0}, Lio/sentry/internal/debugmeta/c;->p(Ljava/lang/String;)Lio/sentry/internal/debugmeta/c;

    iget-object v0, p0, Lio/sentry/protocol/A;->r:Ljava/lang/Double;

    invoke-virtual {v0}, Ljava/lang/Double;->doubleValue()D

    move-result-wide v4

    invoke-static {v4, v5}, Ljava/math/BigDecimal;->valueOf(D)Ljava/math/BigDecimal;

    move-result-object v0

    invoke-virtual {v0, v3, v2}, Ljava/math/BigDecimal;->setScale(ILjava/math/RoundingMode;)Ljava/math/BigDecimal;

    move-result-object v0

    invoke-virtual {p1, p2, v0}, Lio/sentry/internal/debugmeta/c;->w(Lio/sentry/ILogger;Ljava/lang/Object;)Lio/sentry/internal/debugmeta/c;

    :cond_1
    iget-object v0, p0, Lio/sentry/protocol/A;->s:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v2

    if-nez v2, :cond_2

    const-string v2, "spans"

    invoke-virtual {p1, v2}, Lio/sentry/internal/debugmeta/c;->p(Ljava/lang/String;)Lio/sentry/internal/debugmeta/c;

    invoke-virtual {p1, p2, v0}, Lio/sentry/internal/debugmeta/c;->w(Lio/sentry/ILogger;Ljava/lang/Object;)Lio/sentry/internal/debugmeta/c;

    :cond_2
    const-string v0, "type"

    invoke-virtual {p1, v0}, Lio/sentry/internal/debugmeta/c;->p(Ljava/lang/String;)Lio/sentry/internal/debugmeta/c;

    invoke-virtual {p1, v1}, Lio/sentry/internal/debugmeta/c;->z(Ljava/lang/String;)Lio/sentry/internal/debugmeta/c;

    iget-object v0, p0, Lio/sentry/protocol/A;->t:Ljava/util/HashMap;

    invoke-virtual {v0}, Ljava/util/HashMap;->isEmpty()Z

    move-result v1

    if-nez v1, :cond_3

    const-string v1, "measurements"

    invoke-virtual {p1, v1}, Lio/sentry/internal/debugmeta/c;->p(Ljava/lang/String;)Lio/sentry/internal/debugmeta/c;

    invoke-virtual {p1, p2, v0}, Lio/sentry/internal/debugmeta/c;->w(Lio/sentry/ILogger;Ljava/lang/Object;)Lio/sentry/internal/debugmeta/c;

    :cond_3
    const-string v0, "transaction_info"

    invoke-virtual {p1, v0}, Lio/sentry/internal/debugmeta/c;->p(Ljava/lang/String;)Lio/sentry/internal/debugmeta/c;

    iget-object v0, p0, Lio/sentry/protocol/A;->u:Lio/sentry/d2;

    invoke-virtual {p1, p2, v0}, Lio/sentry/internal/debugmeta/c;->w(Lio/sentry/ILogger;Ljava/lang/Object;)Lio/sentry/internal/debugmeta/c;

    invoke-static {p0, p1, p2}, Lio/sentry/config/a;->E(Lio/sentry/C1;Lio/sentry/internal/debugmeta/c;Lio/sentry/ILogger;)V

    iget-object v0, p0, Lio/sentry/protocol/A;->v:Ljava/util/concurrent/ConcurrentHashMap;

    if-eqz v0, :cond_4

    invoke-interface {v0}, Ljava/util/Map;->keySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_4

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    iget-object v2, p0, Lio/sentry/protocol/A;->v:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-static {v2, v1, p1, v1, p2}, Lio/sentry/d;->b(Ljava/util/concurrent/ConcurrentHashMap;Ljava/lang/String;Lio/sentry/internal/debugmeta/c;Ljava/lang/String;Lio/sentry/ILogger;)V

    goto :goto_0

    :cond_4
    invoke-virtual {p1}, Lio/sentry/internal/debugmeta/c;->k()Lio/sentry/internal/debugmeta/c;

    return-void
.end method
