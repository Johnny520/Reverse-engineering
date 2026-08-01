.class public final Lkotlin/reflect/jvm/internal/impl/types/飘花落叶言子世哲楪苏兰;
.super Ljava/lang/Object;
.source "r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776"


# instance fields
.field public final 飘花落叶言子楪世苏兰哲:Ljava/util/concurrent/ConcurrentHashMap;

.field public final 飘花落叶言子楪世苏哲兰:Ljava/util/concurrent/atomic/AtomicInteger;


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Ljava/util/concurrent/ConcurrentHashMap;

    .line 5
    .line 6
    invoke-direct {v0}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object v0, p0, Lkotlin/reflect/jvm/internal/impl/types/飘花落叶言子世哲楪苏兰;->飘花落叶言子楪世苏兰哲:Ljava/util/concurrent/ConcurrentHashMap;

    .line 10
    .line 11
    new-instance v0, Ljava/util/concurrent/atomic/AtomicInteger;

    .line 12
    .line 13
    const/4 v1, 0x0

    .line 14
    invoke-direct {v0, v1}, Ljava/util/concurrent/atomic/AtomicInteger;-><init>(I)V

    .line 15
    .line 16
    .line 17
    iput-object v0, p0, Lkotlin/reflect/jvm/internal/impl/types/飘花落叶言子世哲楪苏兰;->飘花落叶言子楪世苏哲兰:Ljava/util/concurrent/atomic/AtomicInteger;

    .line 18
    .line 19
    return-void
.end method

.method public constructor <init>(I)V
    .locals 1

    .line 20
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 21
    new-instance v0, Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-direct {v0, p1}, Ljava/util/concurrent/atomic/AtomicInteger;-><init>(I)V

    iput-object v0, p0, Lkotlin/reflect/jvm/internal/impl/types/飘花落叶言子世哲楪苏兰;->飘花落叶言子楪世苏哲兰:Ljava/util/concurrent/atomic/AtomicInteger;

    .line 22
    new-instance p1, Ljava/util/concurrent/ConcurrentHashMap;

    invoke-direct {p1}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    iput-object p1, p0, Lkotlin/reflect/jvm/internal/impl/types/飘花落叶言子世哲楪苏兰;->飘花落叶言子楪世苏兰哲:Ljava/util/concurrent/ConcurrentHashMap;

    return-void
.end method

.method public static 飘花落叶言子楪世苏哲兰(Ljava/util/List;)Lkotlin/reflect/jvm/internal/impl/types/飘花落叶言子世哲楪兰苏;
    .locals 1

    .line 1
    invoke-interface {p0}, Ljava/util/List;->isEmpty()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    sget-object p0, Lkotlin/reflect/jvm/internal/impl/types/飘花落叶言子世哲楪兰苏;->飘花落叶言子楪哲兰苏世:Lkotlin/reflect/jvm/internal/impl/types/飘花落叶言子世哲楪兰苏;

    .line 8
    .line 9
    return-object p0

    .line 10
    :cond_0
    new-instance v0, Lkotlin/reflect/jvm/internal/impl/types/飘花落叶言子世哲楪兰苏;

    .line 11
    .line 12
    invoke-direct {v0, p0}, Lkotlin/reflect/jvm/internal/impl/types/飘花落叶言子世哲楪兰苏;-><init>(Ljava/util/List;)V

    .line 13
    .line 14
    .line 15
    return-object v0
.end method


# virtual methods
.method public 飘花落叶言子楪世哲苏兰(Ljava/lang/String;Ljava/lang/String;)V
    .locals 4

    .line 1
    const-wide v0, -0x36a55080051405a7L    # -2.3804302983708783E45

    .line 2
    .line 3
    .line 4
    .line 5
    .line 6
    const-wide v2, -0x36a5fb90051405a7L    # -2.3208237167220713E45

    .line 7
    .line 8
    .line 9
    .line 10
    .line 11
    invoke-static {v0, v1, v2, v3, p1}, L飘花落叶言世兰子哲楪苏/飘花落叶言子楪兰苏世哲;->飘花落叶言子楪兰苏世哲(JJLjava/lang/String;)V

    .line 12
    .line 13
    .line 14
    iget-object v0, p0, Lkotlin/reflect/jvm/internal/impl/types/飘花落叶言子世哲楪苏兰;->飘花落叶言子楪世苏兰哲:Ljava/util/concurrent/ConcurrentHashMap;

    .line 15
    .line 16
    invoke-virtual {v0, p1, p2}, Ljava/util/concurrent/ConcurrentHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    iget-object p0, p0, Lkotlin/reflect/jvm/internal/impl/types/飘花落叶言子世哲楪苏兰;->飘花落叶言子楪世苏哲兰:Ljava/util/concurrent/atomic/AtomicInteger;

    .line 20
    .line 21
    invoke-virtual {p0}, Ljava/util/concurrent/atomic/AtomicInteger;->decrementAndGet()I

    .line 22
    .line 23
    .line 24
    return-void
.end method

.method public 飘花落叶言子楪世苏兰哲(Ljava/lang/String;)I
    .locals 2

    .line 1
    iget-object v0, p0, Lkotlin/reflect/jvm/internal/impl/types/飘花落叶言子世哲楪苏兰;->飘花落叶言子楪世苏兰哲:Ljava/util/concurrent/ConcurrentHashMap;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    invoke-virtual {v0, p1}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 7
    .line 8
    .line 9
    move-result-object v1

    .line 10
    check-cast v1, Ljava/lang/Integer;

    .line 11
    .line 12
    if-eqz v1, :cond_0

    .line 13
    .line 14
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    .line 15
    .line 16
    .line 17
    move-result p0

    .line 18
    return p0

    .line 19
    :cond_0
    monitor-enter v0

    .line 20
    :try_start_0
    invoke-virtual {v0, p1}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 21
    .line 22
    .line 23
    move-result-object v1

    .line 24
    check-cast v1, Ljava/lang/Integer;

    .line 25
    .line 26
    if-eqz v1, :cond_1

    .line 27
    .line 28
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    .line 29
    .line 30
    .line 31
    move-result p0

    .line 32
    goto :goto_0

    .line 33
    :catchall_0
    move-exception p0

    .line 34
    goto :goto_1

    .line 35
    :cond_1
    iget-object p0, p0, Lkotlin/reflect/jvm/internal/impl/types/飘花落叶言子世哲楪苏兰;->飘花落叶言子楪世苏哲兰:Ljava/util/concurrent/atomic/AtomicInteger;

    .line 36
    .line 37
    invoke-virtual {p0}, Ljava/util/concurrent/atomic/AtomicInteger;->getAndIncrement()I

    .line 38
    .line 39
    .line 40
    move-result p0

    .line 41
    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 42
    .line 43
    .line 44
    move-result-object v1

    .line 45
    invoke-virtual {v0, p1, v1}, Ljava/util/concurrent/ConcurrentHashMap;->putIfAbsent(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 46
    .line 47
    .line 48
    :goto_0
    monitor-exit v0

    .line 49
    return p0

    .line 50
    :goto_1
    monitor-exit v0

    .line 51
    throw p0
.end method
