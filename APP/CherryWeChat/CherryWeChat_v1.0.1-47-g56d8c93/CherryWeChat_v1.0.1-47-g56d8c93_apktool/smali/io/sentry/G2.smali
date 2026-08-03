.class public final Lio/sentry/G2;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lio/sentry/g0;


# instance fields
.field public final a:Lio/sentry/H1;

.field public b:Lio/sentry/H1;

.field public final c:Lio/sentry/H2;

.field public final d:Lio/sentry/D2;

.field public final e:Lio/sentry/Z;

.field public f:Z

.field public final g:Ljava/util/concurrent/atomic/AtomicBoolean;

.field public final h:LZd;

.field public i:Lio/sentry/I2;

.field public final j:Ljava/util/concurrent/ConcurrentHashMap;

.field public final k:Ljava/util/concurrent/ConcurrentHashMap;


# direct methods
.method public constructor <init>(Lio/sentry/D2;Lio/sentry/v1;Lio/sentry/H2;LZd;Lrl;)V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    .line 2
    iput-boolean v0, p0, Lio/sentry/G2;->f:Z

    .line 3
    new-instance v1, Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-direct {v1, v0}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>(Z)V

    iput-object v1, p0, Lio/sentry/G2;->g:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 4
    new-instance v0, Ljava/util/concurrent/ConcurrentHashMap;

    invoke-direct {v0}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    iput-object v0, p0, Lio/sentry/G2;->j:Ljava/util/concurrent/ConcurrentHashMap;

    .line 5
    new-instance v0, Ljava/util/concurrent/ConcurrentHashMap;

    invoke-direct {v0}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    iput-object v0, p0, Lio/sentry/G2;->k:Ljava/util/concurrent/ConcurrentHashMap;

    .line 6
    new-instance v0, Ljava/util/concurrent/ConcurrentHashMap;

    invoke-direct {v0}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    .line 7
    new-instance v0, Lio/sentry/util/a;

    .line 8
    invoke-direct {v0}, Ljava/util/concurrent/locks/ReentrantLock;-><init>()V

    .line 9
    iput-object p3, p0, Lio/sentry/G2;->c:Lio/sentry/H2;

    .line 10
    iget-object v0, p4, LZd;->d:Ljava/lang/Object;

    check-cast v0, Ljava/lang/String;

    .line 11
    iput-object v0, p3, Lio/sentry/H2;->i:Ljava/lang/String;

    .line 12
    const-string p3, "transaction is required"

    invoke-static {p3, p1}, Lio/sentry/config/a;->D(Ljava/lang/String;Ljava/lang/Object;)V

    iput-object p1, p0, Lio/sentry/G2;->d:Lio/sentry/D2;

    .line 13
    const-string p1, "Scopes are required"

    invoke-static {p1, p2}, Lio/sentry/config/a;->D(Ljava/lang/String;Ljava/lang/Object;)V

    iput-object p2, p0, Lio/sentry/G2;->e:Lio/sentry/Z;

    .line 14
    iput-object p4, p0, Lio/sentry/G2;->h:LZd;

    .line 15
    iput-object p5, p0, Lio/sentry/G2;->i:Lio/sentry/I2;

    .line 16
    iget-object p1, p4, LZd;->b:Ljava/lang/Object;

    check-cast p1, Lio/sentry/H1;

    if-eqz p1, :cond_0

    .line 17
    iput-object p1, p0, Lio/sentry/G2;->a:Lio/sentry/H1;

    return-void

    .line 18
    :cond_0
    invoke-virtual {p2}, Lio/sentry/v1;->l()Lio/sentry/v2;

    move-result-object p1

    invoke-virtual {p1}, Lio/sentry/v2;->getDateProvider()Lio/sentry/I1;

    move-result-object p1

    invoke-interface {p1}, Lio/sentry/I1;->a()Lio/sentry/H1;

    move-result-object p1

    iput-object p1, p0, Lio/sentry/G2;->a:Lio/sentry/H1;

    return-void
.end method

.method public constructor <init>(Lio/sentry/P2;Lio/sentry/D2;Lio/sentry/v1;Lio/sentry/Q2;)V
    .locals 2

    .line 19
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    .line 20
    iput-boolean v0, p0, Lio/sentry/G2;->f:Z

    .line 21
    new-instance v1, Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-direct {v1, v0}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>(Z)V

    iput-object v1, p0, Lio/sentry/G2;->g:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 22
    new-instance v0, Ljava/util/concurrent/ConcurrentHashMap;

    invoke-direct {v0}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    iput-object v0, p0, Lio/sentry/G2;->j:Ljava/util/concurrent/ConcurrentHashMap;

    .line 23
    new-instance v0, Ljava/util/concurrent/ConcurrentHashMap;

    invoke-direct {v0}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    iput-object v0, p0, Lio/sentry/G2;->k:Ljava/util/concurrent/ConcurrentHashMap;

    .line 24
    new-instance v0, Ljava/util/concurrent/ConcurrentHashMap;

    invoke-direct {v0}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    .line 25
    new-instance v0, Lio/sentry/util/a;

    .line 26
    invoke-direct {v0}, Ljava/util/concurrent/locks/ReentrantLock;-><init>()V

    .line 27
    iput-object p1, p0, Lio/sentry/G2;->c:Lio/sentry/H2;

    .line 28
    iget-object v0, p4, LZd;->d:Ljava/lang/Object;

    check-cast v0, Ljava/lang/String;

    .line 29
    iput-object v0, p1, Lio/sentry/H2;->i:Ljava/lang/String;

    .line 30
    iput-object p2, p0, Lio/sentry/G2;->d:Lio/sentry/D2;

    .line 31
    iput-object p3, p0, Lio/sentry/G2;->e:Lio/sentry/Z;

    const/4 p1, 0x0

    .line 32
    iput-object p1, p0, Lio/sentry/G2;->i:Lio/sentry/I2;

    .line 33
    iget-object p1, p4, LZd;->b:Ljava/lang/Object;

    check-cast p1, Lio/sentry/H1;

    if-eqz p1, :cond_0

    .line 34
    iput-object p1, p0, Lio/sentry/G2;->a:Lio/sentry/H1;

    goto :goto_0

    .line 35
    :cond_0
    invoke-virtual {p3}, Lio/sentry/v1;->l()Lio/sentry/v2;

    move-result-object p1

    invoke-virtual {p1}, Lio/sentry/v2;->getDateProvider()Lio/sentry/I1;

    move-result-object p1

    invoke-interface {p1}, Lio/sentry/I1;->a()Lio/sentry/H1;

    move-result-object p1

    iput-object p1, p0, Lio/sentry/G2;->a:Lio/sentry/H1;

    .line 36
    :goto_0
    iput-object p4, p0, Lio/sentry/G2;->h:LZd;

    return-void
.end method


# virtual methods
.method public final c(Ljava/lang/String;)V
    .locals 1

    iget-object v0, p0, Lio/sentry/G2;->c:Lio/sentry/H2;

    iput-object p1, v0, Lio/sentry/H2;->f:Ljava/lang/String;

    return-void
.end method

.method public final d(Ljava/lang/String;Ljava/lang/Object;)V
    .locals 1

    iget-object v0, p0, Lio/sentry/G2;->j:Ljava/util/concurrent/ConcurrentHashMap;

    if-nez p2, :cond_0

    invoke-virtual {v0, p1}, Ljava/util/concurrent/ConcurrentHashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    return-void

    :cond_0
    invoke-virtual {v0, p1, p2}, Ljava/util/concurrent/ConcurrentHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public final e(Ljava/lang/String;Lio/sentry/H1;Lio/sentry/n0;)Lio/sentry/g0;
    .locals 6

    new-instance v5, LZd;

    invoke-direct {v5}, LZd;-><init>()V

    const-string v1, "activity.load"

    move-object v0, p0

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    invoke-virtual/range {v0 .. v5}, Lio/sentry/G2;->s(Ljava/lang/String;Ljava/lang/String;Lio/sentry/H1;Lio/sentry/n0;LZd;)Lio/sentry/g0;

    move-result-object p1

    return-object p1
.end method

.method public final f()Z
    .locals 1

    iget-boolean v0, p0, Lio/sentry/G2;->f:Z

    return v0
.end method

.method public final i()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/sentry/G2;->c:Lio/sentry/H2;

    iget-object v0, v0, Lio/sentry/H2;->f:Ljava/lang/String;

    return-object v0
.end method

.method public final j(Ljava/lang/Number;Ljava/lang/String;)V
    .locals 2

    iget-boolean v0, p0, Lio/sentry/G2;->f:Z

    if-eqz v0, :cond_0

    iget-object p1, p0, Lio/sentry/G2;->e:Lio/sentry/Z;

    invoke-interface {p1}, Lio/sentry/Z;->l()Lio/sentry/v2;

    move-result-object p1

    invoke-virtual {p1}, Lio/sentry/v2;->getLogger()Lio/sentry/ILogger;

    move-result-object p1

    sget-object v0, Lio/sentry/a2;->DEBUG:Lio/sentry/a2;

    const-string v1, "The span is already finished. Measurement %s cannot be set"

    filled-new-array {p2}, [Ljava/lang/Object;

    move-result-object p2

    invoke-interface {p1, v0, v1, p2}, Lio/sentry/ILogger;->e(Lio/sentry/a2;Ljava/lang/String;[Ljava/lang/Object;)V

    return-void

    :cond_0
    new-instance v0, Lio/sentry/protocol/j;

    const/4 v1, 0x0

    invoke-direct {v0, p1, v1}, Lio/sentry/protocol/j;-><init>(Ljava/lang/Number;Ljava/lang/String;)V

    iget-object v1, p0, Lio/sentry/G2;->k:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-virtual {v1, p2, v0}, Ljava/util/concurrent/ConcurrentHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v0, p0, Lio/sentry/G2;->d:Lio/sentry/D2;

    iget-object v1, v0, Lio/sentry/D2;->b:Lio/sentry/G2;

    if-eq v1, p0, :cond_1

    iget-object v1, v1, Lio/sentry/G2;->k:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-virtual {v1, p2}, Ljava/util/concurrent/ConcurrentHashMap;->containsKey(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_1

    invoke-virtual {v0, p1, p2}, Lio/sentry/D2;->j(Ljava/lang/Number;Ljava/lang/String;)V

    :cond_1
    return-void
.end method

.method public final l(Ljava/lang/String;Ljava/lang/Long;Lio/sentry/G0;)V
    .locals 2

    iget-boolean v0, p0, Lio/sentry/G2;->f:Z

    if-eqz v0, :cond_0

    iget-object p2, p0, Lio/sentry/G2;->e:Lio/sentry/Z;

    invoke-interface {p2}, Lio/sentry/Z;->l()Lio/sentry/v2;

    move-result-object p2

    invoke-virtual {p2}, Lio/sentry/v2;->getLogger()Lio/sentry/ILogger;

    move-result-object p2

    sget-object p3, Lio/sentry/a2;->DEBUG:Lio/sentry/a2;

    const-string v0, "The span is already finished. Measurement %s cannot be set"

    filled-new-array {p1}, [Ljava/lang/Object;

    move-result-object p1

    invoke-interface {p2, p3, v0, p1}, Lio/sentry/ILogger;->e(Lio/sentry/a2;Ljava/lang/String;[Ljava/lang/Object;)V

    return-void

    :cond_0
    new-instance v0, Lio/sentry/protocol/j;

    invoke-interface {p3}, Lio/sentry/G0;->apiName()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, p2, v1}, Lio/sentry/protocol/j;-><init>(Ljava/lang/Number;Ljava/lang/String;)V

    iget-object v1, p0, Lio/sentry/G2;->k:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-virtual {v1, p1, v0}, Ljava/util/concurrent/ConcurrentHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v0, p0, Lio/sentry/G2;->d:Lio/sentry/D2;

    iget-object v1, v0, Lio/sentry/D2;->b:Lio/sentry/G2;

    if-eq v1, p0, :cond_1

    iget-object v1, v1, Lio/sentry/G2;->k:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-virtual {v1, p1}, Ljava/util/concurrent/ConcurrentHashMap;->containsKey(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_1

    invoke-virtual {v0, p1, p2, p3}, Lio/sentry/D2;->l(Ljava/lang/String;Ljava/lang/Long;Lio/sentry/G0;)V

    :cond_1
    return-void
.end method

.method public final m()Lio/sentry/H2;
    .locals 1

    iget-object v0, p0, Lio/sentry/G2;->c:Lio/sentry/H2;

    return-object v0
.end method

.method public final n(Lio/sentry/L2;)V
    .locals 1

    iget-object v0, p0, Lio/sentry/G2;->e:Lio/sentry/Z;

    invoke-interface {v0}, Lio/sentry/Z;->l()Lio/sentry/v2;

    move-result-object v0

    invoke-virtual {v0}, Lio/sentry/v2;->getDateProvider()Lio/sentry/I1;

    move-result-object v0

    invoke-interface {v0}, Lio/sentry/I1;->a()Lio/sentry/H1;

    move-result-object v0

    invoke-virtual {p0, p1, v0}, Lio/sentry/G2;->q(Lio/sentry/L2;Lio/sentry/H1;)V

    return-void
.end method

.method public final o()Lio/sentry/L2;
    .locals 1

    iget-object v0, p0, Lio/sentry/G2;->c:Lio/sentry/H2;

    iget-object v0, v0, Lio/sentry/H2;->g:Lio/sentry/L2;

    return-object v0
.end method

.method public final p()Lio/sentry/H1;
    .locals 1

    iget-object v0, p0, Lio/sentry/G2;->b:Lio/sentry/H1;

    return-object v0
.end method

.method public final q(Lio/sentry/L2;Lio/sentry/H1;)V
    .locals 8

    iget-boolean v0, p0, Lio/sentry/G2;->f:Z

    if-nez v0, :cond_d

    iget-object v0, p0, Lio/sentry/G2;->g:Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 v1, 0x0

    const/4 v2, 0x1

    invoke-virtual {v0, v1, v2}, Ljava/util/concurrent/atomic/AtomicBoolean;->compareAndSet(ZZ)Z

    move-result v0

    if-nez v0, :cond_0

    goto/16 :goto_3

    :cond_0
    iget-object v0, p0, Lio/sentry/G2;->c:Lio/sentry/H2;

    iput-object p1, v0, Lio/sentry/H2;->g:Lio/sentry/L2;

    iget-object p1, v0, Lio/sentry/H2;->b:Lio/sentry/K2;

    if-nez p2, :cond_1

    iget-object p2, p0, Lio/sentry/G2;->e:Lio/sentry/Z;

    invoke-interface {p2}, Lio/sentry/Z;->l()Lio/sentry/v2;

    move-result-object p2

    invoke-virtual {p2}, Lio/sentry/v2;->getDateProvider()Lio/sentry/I1;

    move-result-object p2

    invoke-interface {p2}, Lio/sentry/I1;->a()Lio/sentry/H1;

    move-result-object p2

    :cond_1
    iput-object p2, p0, Lio/sentry/G2;->b:Lio/sentry/H1;

    iget-object p2, p0, Lio/sentry/G2;->h:LZd;

    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-boolean v0, p2, LZd;->a:Z

    if-eqz v0, :cond_b

    iget-object v0, p0, Lio/sentry/G2;->d:Lio/sentry/D2;

    iget-object v1, v0, Lio/sentry/D2;->b:Lio/sentry/G2;

    iget-object v0, v0, Lio/sentry/D2;->c:Ljava/util/concurrent/CopyOnWriteArrayList;

    iget-object v1, v1, Lio/sentry/G2;->c:Lio/sentry/H2;

    iget-object v1, v1, Lio/sentry/H2;->b:Lio/sentry/K2;

    invoke-virtual {v1, p1}, Lio/sentry/K2;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_2

    goto :goto_1

    :cond_2
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    invoke-virtual {v0}, Ljava/util/concurrent/CopyOnWriteArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_3
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_4

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lio/sentry/G2;

    iget-object v4, v3, Lio/sentry/G2;->c:Lio/sentry/H2;

    iget-object v4, v4, Lio/sentry/H2;->c:Lio/sentry/K2;

    if-eqz v4, :cond_3

    invoke-virtual {v4, p1}, Lio/sentry/K2;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_3

    invoke-virtual {v1, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_4
    move-object v0, v1

    :goto_1
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    const/4 v0, 0x0

    move-object v1, v0

    :cond_5
    :goto_2
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    const-wide/16 v4, 0x0

    if-eqz v3, :cond_9

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lio/sentry/G2;

    if-eqz v0, :cond_6

    iget-object v6, v3, Lio/sentry/G2;->a:Lio/sentry/H1;

    invoke-virtual {v6, v0}, Lio/sentry/H1;->b(Lio/sentry/H1;)J

    move-result-wide v6

    cmp-long v6, v6, v4

    if-gez v6, :cond_7

    :cond_6
    iget-object v0, v3, Lio/sentry/G2;->a:Lio/sentry/H1;

    :cond_7
    if-eqz v1, :cond_8

    iget-object v6, v3, Lio/sentry/G2;->b:Lio/sentry/H1;

    if-eqz v6, :cond_5

    invoke-virtual {v6, v1}, Lio/sentry/H1;->b(Lio/sentry/H1;)J

    move-result-wide v6

    cmp-long v4, v6, v4

    if-lez v4, :cond_5

    :cond_8
    iget-object v1, v3, Lio/sentry/G2;->b:Lio/sentry/H1;

    goto :goto_2

    :cond_9
    iget-boolean p1, p2, LZd;->a:Z

    if-eqz p1, :cond_b

    if-eqz v1, :cond_b

    iget-object p1, p0, Lio/sentry/G2;->b:Lio/sentry/H1;

    if-eqz p1, :cond_a

    invoke-virtual {p1, v1}, Lio/sentry/H1;->b(Lio/sentry/H1;)J

    move-result-wide p1

    cmp-long p1, p1, v4

    if-lez p1, :cond_b

    :cond_a
    iget-object p1, p0, Lio/sentry/G2;->b:Lio/sentry/H1;

    if-eqz p1, :cond_b

    iput-object v1, p0, Lio/sentry/G2;->b:Lio/sentry/H1;

    :cond_b
    iget-object p1, p0, Lio/sentry/G2;->i:Lio/sentry/I2;

    if-eqz p1, :cond_c

    invoke-interface {p1, p0}, Lio/sentry/I2;->d(Lio/sentry/G2;)V

    :cond_c
    iput-boolean v2, p0, Lio/sentry/G2;->f:Z

    :cond_d
    :goto_3
    return-void
.end method

.method public final r()V
    .locals 1

    iget-object v0, p0, Lio/sentry/G2;->c:Lio/sentry/H2;

    iget-object v0, v0, Lio/sentry/H2;->g:Lio/sentry/L2;

    invoke-virtual {p0, v0}, Lio/sentry/G2;->n(Lio/sentry/L2;)V

    return-void
.end method

.method public final s(Ljava/lang/String;Ljava/lang/String;Lio/sentry/H1;Lio/sentry/n0;LZd;)Lio/sentry/g0;
    .locals 14

    move-object/from16 v0, p4

    move-object/from16 v4, p5

    iget-boolean v1, p0, Lio/sentry/G2;->f:Z

    sget-object v2, Lio/sentry/U0;->a:Lio/sentry/U0;

    if-eqz v1, :cond_0

    goto :goto_0

    :cond_0
    iget-object v1, p0, Lio/sentry/G2;->c:Lio/sentry/H2;

    iget-object v8, v1, Lio/sentry/H2;->b:Lio/sentry/K2;

    iget-object v1, p0, Lio/sentry/G2;->d:Lio/sentry/D2;

    iget-object v3, v1, Lio/sentry/D2;->b:Lio/sentry/G2;

    iget-object v5, v3, Lio/sentry/G2;->c:Lio/sentry/H2;

    new-instance v6, Lio/sentry/H2;

    move-object v7, v6

    iget-object v6, v5, Lio/sentry/H2;->a:Lio/sentry/protocol/t;

    move-object v9, v7

    new-instance v7, Lio/sentry/K2;

    invoke-direct {v7}, Lio/sentry/K2;-><init>()V

    iget-object v11, v5, Lio/sentry/H2;->d:Lvx;

    const/4 v12, 0x0

    const-string v13, "manual"

    const/4 v10, 0x0

    move-object v5, v9

    move-object v9, p1

    invoke-direct/range {v5 .. v13}, Lio/sentry/H2;-><init>(Lio/sentry/protocol/t;Lio/sentry/K2;Lio/sentry/K2;Ljava/lang/String;Ljava/lang/String;Lvx;Lio/sentry/L2;Ljava/lang/String;)V

    move-object/from16 p1, p2

    iput-object p1, v5, Lio/sentry/H2;->f:Ljava/lang/String;

    iput-object v0, v5, Lio/sentry/H2;->l:Lio/sentry/n0;

    move-object/from16 p1, p3

    iput-object p1, v4, LZd;->b:Ljava/lang/Object;

    iget-object p1, v1, Lio/sentry/D2;->c:Ljava/util/concurrent/CopyOnWriteArrayList;

    iget-object v6, v1, Lio/sentry/D2;->d:Lio/sentry/v1;

    iget-boolean v3, v3, Lio/sentry/G2;->f:Z

    if-eqz v3, :cond_1

    goto :goto_0

    :cond_1
    iget-object v3, v1, Lio/sentry/D2;->o:Lio/sentry/n0;

    invoke-virtual {v3, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_2

    goto :goto_0

    :cond_2
    invoke-virtual {v6}, Lio/sentry/v1;->l()Lio/sentry/v2;

    move-result-object v0

    invoke-virtual {v0}, Lio/sentry/v2;->getIgnoredSpanOrigins()Ljava/util/List;

    move-result-object v0

    iget-object v3, v4, LZd;->d:Ljava/lang/Object;

    check-cast v3, Ljava/lang/String;

    invoke-static {v3, v0}, Lio/sentry/util/i;->a(Ljava/lang/String;Ljava/util/List;)Z

    move-result v0

    if-eqz v0, :cond_3

    :goto_0
    return-object v2

    :cond_3
    iget-object v0, v5, Lio/sentry/H2;->f:Ljava/lang/String;

    invoke-virtual {p1}, Ljava/util/concurrent/CopyOnWriteArrayList;->size()I

    move-result v3

    invoke-virtual {v6}, Lio/sentry/v1;->l()Lio/sentry/v2;

    move-result-object v7

    invoke-virtual {v7}, Lio/sentry/v2;->getMaxSpans()I

    move-result v7

    iget-object v8, v5, Lio/sentry/H2;->e:Ljava/lang/String;

    if-ge v3, v7, :cond_5

    const-string v0, "parentSpanId is required"

    iget-object v2, v5, Lio/sentry/H2;->c:Lio/sentry/K2;

    invoke-static {v0, v2}, Lio/sentry/config/a;->D(Ljava/lang/String;Ljava/lang/Object;)V

    const-string v0, "operation is required"

    invoke-static {v0, v8}, Lio/sentry/config/a;->D(Ljava/lang/String;Ljava/lang/Object;)V

    invoke-virtual {v1}, Lio/sentry/D2;->w()V

    new-instance v0, Lio/sentry/G2;

    iget-object v2, v1, Lio/sentry/D2;->d:Lio/sentry/v1;

    move-object v3, v5

    new-instance v5, Lrl;

    const/4 v6, 0x6

    invoke-direct {v5, v6, v1}, Lrl;-><init>(ILjava/lang/Object;)V

    invoke-direct/range {v0 .. v5}, Lio/sentry/G2;-><init>(Lio/sentry/D2;Lio/sentry/v1;Lio/sentry/H2;LZd;Lrl;)V

    invoke-virtual {v1, v0}, Lio/sentry/D2;->y(Lio/sentry/G2;)V

    invoke-virtual {p1, v0}, Ljava/util/concurrent/CopyOnWriteArrayList;->add(Ljava/lang/Object;)Z

    iget-object p1, v1, Lio/sentry/D2;->q:Lio/sentry/m;

    if-eqz p1, :cond_4

    invoke-interface {p1, v0}, Lio/sentry/m;->a(Lio/sentry/G2;)V

    :cond_4
    return-object v0

    :cond_5
    invoke-virtual {v6}, Lio/sentry/v1;->l()Lio/sentry/v2;

    move-result-object p1

    invoke-virtual {p1}, Lio/sentry/v2;->getLogger()Lio/sentry/ILogger;

    move-result-object p1

    sget-object v1, Lio/sentry/a2;->WARNING:Lio/sentry/a2;

    const-string v3, "Span operation: %s, description: %s dropped due to limit reached. Returning NoOpSpan."

    filled-new-array {v8, v0}, [Ljava/lang/Object;

    move-result-object v0

    invoke-interface {p1, v1, v3, v0}, Lio/sentry/ILogger;->e(Lio/sentry/a2;Ljava/lang/String;[Ljava/lang/Object;)V

    return-object v2
.end method

.method public final u()Lio/sentry/H1;
    .locals 1

    iget-object v0, p0, Lio/sentry/G2;->a:Lio/sentry/H1;

    return-object v0
.end method

.method public final v()Ljava/lang/Boolean;
    .locals 1

    iget-object v0, p0, Lio/sentry/G2;->c:Lio/sentry/H2;

    iget-object v0, v0, Lio/sentry/H2;->d:Lvx;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    return-object v0

    :cond_0
    iget-object v0, v0, Lvx;->a:Ljava/lang/Object;

    check-cast v0, Ljava/lang/Boolean;

    return-object v0
.end method
