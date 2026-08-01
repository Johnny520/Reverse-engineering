.class public Landroidx/window/layout/adapter/extensions/飘花落叶言子楪世苏兰哲;
.super Landroidx/window/layout/adapter/extensions/飘花落叶言子楪世苏哲兰;
.source "r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776"


# instance fields
.field public final 飘花落叶言子楪世兰哲苏:Ljava/util/LinkedHashMap;

.field public final 飘花落叶言子楪世兰苏哲:Ljava/util/LinkedHashMap;

.field public final 飘花落叶言子楪世哲兰苏:Ljava/util/LinkedHashMap;

.field public final 飘花落叶言子楪世哲苏兰:Ljava/util/concurrent/locks/ReentrantLock;

.field public final 飘花落叶言子楪世苏兰哲:L飘花落叶言世楪子哲兰苏/飘花落叶言子楪世苏兰哲;

.field public final 飘花落叶言子楪世苏哲兰:Landroidx/window/extensions/layout/WindowLayoutComponent;


# direct methods
.method public constructor <init>(Landroidx/window/extensions/layout/WindowLayoutComponent;L飘花落叶言世楪子哲兰苏/飘花落叶言子楪世苏兰哲;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Landroidx/window/layout/adapter/extensions/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏哲兰:Landroidx/window/extensions/layout/WindowLayoutComponent;

    .line 5
    .line 6
    iput-object p2, p0, Landroidx/window/layout/adapter/extensions/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲:L飘花落叶言世楪子哲兰苏/飘花落叶言子楪世苏兰哲;

    .line 7
    .line 8
    new-instance p1, Ljava/util/concurrent/locks/ReentrantLock;

    .line 9
    .line 10
    invoke-direct {p1}, Ljava/util/concurrent/locks/ReentrantLock;-><init>()V

    .line 11
    .line 12
    .line 13
    iput-object p1, p0, Landroidx/window/layout/adapter/extensions/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世哲苏兰:Ljava/util/concurrent/locks/ReentrantLock;

    .line 14
    .line 15
    new-instance p1, Ljava/util/LinkedHashMap;

    .line 16
    .line 17
    invoke-direct {p1}, Ljava/util/LinkedHashMap;-><init>()V

    .line 18
    .line 19
    .line 20
    iput-object p1, p0, Landroidx/window/layout/adapter/extensions/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世哲兰苏:Ljava/util/LinkedHashMap;

    .line 21
    .line 22
    new-instance p1, Ljava/util/LinkedHashMap;

    .line 23
    .line 24
    invoke-direct {p1}, Ljava/util/LinkedHashMap;-><init>()V

    .line 25
    .line 26
    .line 27
    iput-object p1, p0, Landroidx/window/layout/adapter/extensions/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世兰苏哲:Ljava/util/LinkedHashMap;

    .line 28
    .line 29
    new-instance p1, Ljava/util/LinkedHashMap;

    .line 30
    .line 31
    invoke-direct {p1}, Ljava/util/LinkedHashMap;-><init>()V

    .line 32
    .line 33
    .line 34
    iput-object p1, p0, Landroidx/window/layout/adapter/extensions/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世兰哲苏:Ljava/util/LinkedHashMap;

    .line 35
    .line 36
    return-void
.end method


# virtual methods
.method public 飘花落叶言子楪世苏兰哲(Landroid/content/Context;Ljava/util/concurrent/Executor;Landroidx/core/util/飘花落叶言子楪世苏哲兰;)V
    .locals 4

    .line 1
    iget-object p2, p0, Landroidx/window/layout/adapter/extensions/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世哲兰苏:Ljava/util/LinkedHashMap;

    .line 2
    .line 3
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Landroidx/window/layout/adapter/extensions/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世哲苏兰:Ljava/util/concurrent/locks/ReentrantLock;

    .line 7
    .line 8
    invoke-virtual {v0}, Ljava/util/concurrent/locks/ReentrantLock;->lock()V

    .line 9
    .line 10
    .line 11
    :try_start_0
    invoke-virtual {p2, p1}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object v1

    .line 15
    check-cast v1, Landroidx/window/layout/adapter/extensions/MulticastConsumer;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 16
    .line 17
    iget-object v2, p0, Landroidx/window/layout/adapter/extensions/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世兰苏哲:Ljava/util/LinkedHashMap;

    .line 18
    .line 19
    if-eqz v1, :cond_0

    .line 20
    .line 21
    :try_start_1
    invoke-virtual {v1, p3}, Landroidx/window/layout/adapter/extensions/MulticastConsumer;->飘花落叶言子楪世苏哲兰(Landroidx/core/util/飘花落叶言子楪世苏哲兰;)V

    .line 22
    .line 23
    .line 24
    invoke-interface {v2, p3, p1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 25
    .line 26
    .line 27
    goto :goto_0

    .line 28
    :catchall_0
    move-exception p0

    .line 29
    goto :goto_1

    .line 30
    :cond_0
    new-instance v1, Landroidx/window/layout/adapter/extensions/MulticastConsumer;

    .line 31
    .line 32
    invoke-direct {v1, p1}, Landroidx/window/layout/adapter/extensions/MulticastConsumer;-><init>(Landroid/content/Context;)V

    .line 33
    .line 34
    .line 35
    invoke-interface {p2, p1, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 36
    .line 37
    .line 38
    invoke-interface {v2, p3, p1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 39
    .line 40
    .line 41
    invoke-virtual {v1, p3}, Landroidx/window/layout/adapter/extensions/MulticastConsumer;->飘花落叶言子楪世苏哲兰(Landroidx/core/util/飘花落叶言子楪世苏哲兰;)V

    .line 42
    .line 43
    .line 44
    instance-of p2, p1, Landroid/app/Activity;

    .line 45
    .line 46
    if-eqz p2, :cond_1

    .line 47
    .line 48
    iget-object p2, p0, Landroidx/window/layout/adapter/extensions/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲:L飘花落叶言世楪子哲兰苏/飘花落叶言子楪世苏兰哲;

    .line 49
    .line 50
    iget-object p3, p0, Landroidx/window/layout/adapter/extensions/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏哲兰:Landroidx/window/extensions/layout/WindowLayoutComponent;

    .line 51
    .line 52
    const-class v2, Landroidx/window/extensions/layout/WindowLayoutInfo;

    .line 53
    .line 54
    sget-object v3, Lkotlin/jvm/internal/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世苏哲兰:Lkotlin/jvm/internal/飘花落叶言子楪苏兰哲世;

    .line 55
    .line 56
    invoke-virtual {v3, v2}, Lkotlin/jvm/internal/飘花落叶言子楪苏兰哲世;->飘花落叶言子楪世苏兰哲(Ljava/lang/Class;)Lkotlin/reflect/飘花落叶言子楪世哲兰苏;

    .line 57
    .line 58
    .line 59
    move-result-object v2

    .line 60
    check-cast p1, Landroid/app/Activity;

    .line 61
    .line 62
    new-instance v3, Landroidx/window/layout/adapter/extensions/ExtensionWindowBackendApi1$registerLayoutChangeCallback$1$2$disposableToken$1;

    .line 63
    .line 64
    invoke-direct {v3, v1}, Landroidx/window/layout/adapter/extensions/ExtensionWindowBackendApi1$registerLayoutChangeCallback$1$2$disposableToken$1;-><init>(Ljava/lang/Object;)V

    .line 65
    .line 66
    .line 67
    invoke-virtual {p2, p3, v2, p1, v3}, L飘花落叶言世楪子哲兰苏/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏哲兰(Ljava/lang/Object;Lkotlin/reflect/飘花落叶言子楪世哲兰苏;Landroid/app/Activity;L飘花落叶言世子哲楪兰苏/飘花落叶言子楪苏兰哲世;)L飘花落叶言子兰苏哲世楪/飘花落叶言子楪世兰苏哲;

    .line 68
    .line 69
    .line 70
    move-result-object p1

    .line 71
    iget-object p0, p0, Landroidx/window/layout/adapter/extensions/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世兰哲苏:Ljava/util/LinkedHashMap;

    .line 72
    .line 73
    invoke-interface {p0, v1, p1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 74
    .line 75
    .line 76
    :goto_0
    invoke-virtual {v0}, Ljava/util/concurrent/locks/ReentrantLock;->unlock()V

    .line 77
    .line 78
    .line 79
    return-void

    .line 80
    :cond_1
    :try_start_2
    new-instance p0, Landroidx/window/extensions/layout/WindowLayoutInfo;

    .line 81
    .line 82
    sget-object p1, Lkotlin/collections/EmptyList;->INSTANCE:Lkotlin/collections/EmptyList;

    .line 83
    .line 84
    invoke-direct {p0, p1}, Landroidx/window/extensions/layout/WindowLayoutInfo;-><init>(Ljava/util/List;)V

    .line 85
    .line 86
    .line 87
    invoke-virtual {v1, p0}, Landroidx/window/layout/adapter/extensions/MulticastConsumer;->accept(Landroidx/window/extensions/layout/WindowLayoutInfo;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 88
    .line 89
    .line 90
    invoke-virtual {v0}, Ljava/util/concurrent/locks/ReentrantLock;->unlock()V

    .line 91
    .line 92
    .line 93
    return-void

    .line 94
    :goto_1
    invoke-virtual {v0}, Ljava/util/concurrent/locks/ReentrantLock;->unlock()V

    .line 95
    .line 96
    .line 97
    throw p0
.end method

.method public 飘花落叶言子楪世苏哲兰(Landroidx/core/util/飘花落叶言子楪世苏哲兰;)V
    .locals 7

    .line 1
    iget-object v0, p0, Landroidx/window/layout/adapter/extensions/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世哲兰苏:Ljava/util/LinkedHashMap;

    .line 2
    .line 3
    iget-object v1, p0, Landroidx/window/layout/adapter/extensions/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世兰苏哲:Ljava/util/LinkedHashMap;

    .line 4
    .line 5
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 6
    .line 7
    .line 8
    iget-object v2, p0, Landroidx/window/layout/adapter/extensions/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世哲苏兰:Ljava/util/concurrent/locks/ReentrantLock;

    .line 9
    .line 10
    invoke-virtual {v2}, Ljava/util/concurrent/locks/ReentrantLock;->lock()V

    .line 11
    .line 12
    .line 13
    :try_start_0
    invoke-virtual {v1, p1}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object v3

    .line 17
    check-cast v3, Landroid/content/Context;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 18
    .line 19
    if-nez v3, :cond_0

    .line 20
    .line 21
    invoke-virtual {v2}, Ljava/util/concurrent/locks/ReentrantLock;->unlock()V

    .line 22
    .line 23
    .line 24
    return-void

    .line 25
    :cond_0
    :try_start_1
    invoke-virtual {v0, v3}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 26
    .line 27
    .line 28
    move-result-object v4

    .line 29
    check-cast v4, Landroidx/window/layout/adapter/extensions/MulticastConsumer;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 30
    .line 31
    if-nez v4, :cond_1

    .line 32
    .line 33
    invoke-virtual {v2}, Ljava/util/concurrent/locks/ReentrantLock;->unlock()V

    .line 34
    .line 35
    .line 36
    return-void

    .line 37
    :cond_1
    :try_start_2
    iget-object v5, v4, Landroidx/window/layout/adapter/extensions/MulticastConsumer;->飘花落叶言子楪兰世苏哲:Ljava/util/LinkedHashSet;

    .line 38
    .line 39
    iget-object v6, v4, Landroidx/window/layout/adapter/extensions/MulticastConsumer;->飘花落叶言子楪哲兰世苏:Ljava/util/concurrent/locks/ReentrantLock;

    .line 40
    .line 41
    invoke-virtual {v6}, Ljava/util/concurrent/locks/ReentrantLock;->lock()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 42
    .line 43
    .line 44
    :try_start_3
    invoke-interface {v5, p1}, Ljava/util/Set;->remove(Ljava/lang/Object;)Z
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 45
    .line 46
    .line 47
    :try_start_4
    invoke-virtual {v6}, Ljava/util/concurrent/locks/ReentrantLock;->unlock()V

    .line 48
    .line 49
    .line 50
    invoke-interface {v1, p1}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 51
    .line 52
    .line 53
    invoke-interface {v5}, Ljava/util/Set;->isEmpty()Z

    .line 54
    .line 55
    .line 56
    move-result p1

    .line 57
    if-eqz p1, :cond_2

    .line 58
    .line 59
    invoke-interface {v0, v3}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 60
    .line 61
    .line 62
    iget-object p0, p0, Landroidx/window/layout/adapter/extensions/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世兰哲苏:Ljava/util/LinkedHashMap;

    .line 63
    .line 64
    invoke-interface {p0, v4}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 65
    .line 66
    .line 67
    move-result-object p0

    .line 68
    check-cast p0, L飘花落叶言子兰苏哲世楪/飘花落叶言子楪世兰苏哲;

    .line 69
    .line 70
    if-eqz p0, :cond_2

    .line 71
    .line 72
    iget-object p1, p0, L飘花落叶言子兰苏哲世楪/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪世苏哲兰:Ljava/lang/reflect/Method;

    .line 73
    .line 74
    iget-object v0, p0, L飘花落叶言子兰苏哲世楪/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪世苏兰哲:Ljava/lang/Object;

    .line 75
    .line 76
    iget-object p0, p0, L飘花落叶言子兰苏哲世楪/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪世哲苏兰:Ljava/lang/Object;

    .line 77
    .line 78
    filled-new-array {p0}, [Ljava/lang/Object;

    .line 79
    .line 80
    .line 81
    move-result-object p0

    .line 82
    invoke-virtual {p1, v0, p0}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 83
    .line 84
    .line 85
    goto :goto_0

    .line 86
    :catchall_0
    move-exception p0

    .line 87
    goto :goto_1

    .line 88
    :cond_2
    :goto_0
    invoke-virtual {v2}, Ljava/util/concurrent/locks/ReentrantLock;->unlock()V

    .line 89
    .line 90
    .line 91
    return-void

    .line 92
    :catchall_1
    move-exception p0

    .line 93
    :try_start_5
    invoke-virtual {v6}, Ljava/util/concurrent/locks/ReentrantLock;->unlock()V

    .line 94
    .line 95
    .line 96
    throw p0
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    .line 97
    :goto_1
    invoke-virtual {v2}, Ljava/util/concurrent/locks/ReentrantLock;->unlock()V

    .line 98
    .line 99
    .line 100
    throw p0
.end method
