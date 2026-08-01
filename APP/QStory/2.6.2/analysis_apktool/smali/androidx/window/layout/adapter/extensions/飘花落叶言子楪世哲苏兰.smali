.class public Landroidx/window/layout/adapter/extensions/飘花落叶言子楪世哲苏兰;
.super Landroidx/window/layout/adapter/extensions/飘花落叶言子楪世苏兰哲;
.source "r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776"


# instance fields
.field public final 飘花落叶言子楪苏世兰哲:Ljava/util/LinkedHashMap;

.field public final 飘花落叶言子楪苏世哲兰:Ljava/util/concurrent/locks/ReentrantLock;

.field public final 飘花落叶言子楪苏哲世兰:Ljava/util/LinkedHashMap;


# direct methods
.method public constructor <init>(Landroidx/window/extensions/layout/WindowLayoutComponent;L飘花落叶言世楪子哲兰苏/飘花落叶言子楪世苏兰哲;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, Landroidx/window/layout/adapter/extensions/飘花落叶言子楪世苏兰哲;-><init>(Landroidx/window/extensions/layout/WindowLayoutComponent;L飘花落叶言世楪子哲兰苏/飘花落叶言子楪世苏兰哲;)V

    .line 2
    .line 3
    .line 4
    new-instance p1, Ljava/util/concurrent/locks/ReentrantLock;

    .line 5
    .line 6
    invoke-direct {p1}, Ljava/util/concurrent/locks/ReentrantLock;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object p1, p0, Landroidx/window/layout/adapter/extensions/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪苏世哲兰:Ljava/util/concurrent/locks/ReentrantLock;

    .line 10
    .line 11
    new-instance p1, Ljava/util/LinkedHashMap;

    .line 12
    .line 13
    invoke-direct {p1}, Ljava/util/LinkedHashMap;-><init>()V

    .line 14
    .line 15
    .line 16
    iput-object p1, p0, Landroidx/window/layout/adapter/extensions/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪苏世兰哲:Ljava/util/LinkedHashMap;

    .line 17
    .line 18
    new-instance p1, Ljava/util/LinkedHashMap;

    .line 19
    .line 20
    invoke-direct {p1}, Ljava/util/LinkedHashMap;-><init>()V

    .line 21
    .line 22
    .line 23
    iput-object p1, p0, Landroidx/window/layout/adapter/extensions/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪苏哲世兰:Ljava/util/LinkedHashMap;

    .line 24
    .line 25
    return-void
.end method


# virtual methods
.method public final 飘花落叶言子楪世苏兰哲(Landroid/content/Context;Ljava/util/concurrent/Executor;Landroidx/core/util/飘花落叶言子楪世苏哲兰;)V
    .locals 3

    .line 1
    iget-object p2, p0, Landroidx/window/layout/adapter/extensions/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪苏世兰哲:Ljava/util/LinkedHashMap;

    .line 2
    .line 3
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Landroidx/window/layout/adapter/extensions/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪苏世哲兰:Ljava/util/concurrent/locks/ReentrantLock;

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
    check-cast v1, Landroidx/window/layout/adapter/extensions/飘花落叶言子楪苏世哲兰;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 16
    .line 17
    iget-object v2, p0, Landroidx/window/layout/adapter/extensions/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪苏哲世兰:Ljava/util/LinkedHashMap;

    .line 18
    .line 19
    if-eqz v1, :cond_0

    .line 20
    .line 21
    :try_start_1
    invoke-virtual {v1, p3}, Landroidx/window/layout/adapter/extensions/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪世苏哲兰(Landroidx/core/util/飘花落叶言子楪世苏哲兰;)V

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
    new-instance v1, Landroidx/window/layout/adapter/extensions/飘花落叶言子楪苏世哲兰;

    .line 31
    .line 32
    invoke-direct {v1, p1}, Landroidx/window/layout/adapter/extensions/飘花落叶言子楪苏世哲兰;-><init>(Landroid/content/Context;)V

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
    invoke-virtual {v1, p3}, Landroidx/window/layout/adapter/extensions/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪世苏哲兰(Landroidx/core/util/飘花落叶言子楪世苏哲兰;)V

    .line 42
    .line 43
    .line 44
    iget-object p0, p0, Landroidx/window/layout/adapter/extensions/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏哲兰:Landroidx/window/extensions/layout/WindowLayoutComponent;

    .line 45
    .line 46
    check-cast v1, Landroidx/window/extensions/core/util/function/Consumer;

    .line 47
    .line 48
    invoke-interface {p0, p1, v1}, Landroidx/window/extensions/layout/WindowLayoutComponent;->addWindowLayoutInfoListener(Landroid/content/Context;Landroidx/window/extensions/core/util/function/Consumer;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 49
    .line 50
    .line 51
    :goto_0
    invoke-virtual {v0}, Ljava/util/concurrent/locks/ReentrantLock;->unlock()V

    .line 52
    .line 53
    .line 54
    return-void

    .line 55
    :goto_1
    invoke-virtual {v0}, Ljava/util/concurrent/locks/ReentrantLock;->unlock()V

    .line 56
    .line 57
    .line 58
    throw p0
.end method

.method public final 飘花落叶言子楪世苏哲兰(Landroidx/core/util/飘花落叶言子楪世苏哲兰;)V
    .locals 7

    .line 1
    iget-object v0, p0, Landroidx/window/layout/adapter/extensions/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪苏世兰哲:Ljava/util/LinkedHashMap;

    .line 2
    .line 3
    iget-object v1, p0, Landroidx/window/layout/adapter/extensions/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪苏哲世兰:Ljava/util/LinkedHashMap;

    .line 4
    .line 5
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 6
    .line 7
    .line 8
    iget-object v2, p0, Landroidx/window/layout/adapter/extensions/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪苏世哲兰:Ljava/util/concurrent/locks/ReentrantLock;

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
    check-cast v4, Landroidx/window/layout/adapter/extensions/飘花落叶言子楪苏世哲兰;
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
    iget-object v5, v4, Landroidx/window/layout/adapter/extensions/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪哲兰世苏:Ljava/util/concurrent/locks/ReentrantLock;

    .line 38
    .line 39
    invoke-virtual {v5}, Ljava/util/concurrent/locks/ReentrantLock;->lock()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 40
    .line 41
    .line 42
    :try_start_3
    iget-object v6, v4, Landroidx/window/layout/adapter/extensions/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪兰世苏哲:Ljava/util/LinkedHashSet;

    .line 43
    .line 44
    invoke-interface {v6, p1}, Ljava/util/Set;->remove(Ljava/lang/Object;)Z
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 45
    .line 46
    .line 47
    :try_start_4
    invoke-virtual {v5}, Ljava/util/concurrent/locks/ReentrantLock;->unlock()V

    .line 48
    .line 49
    .line 50
    invoke-interface {v1, p1}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 51
    .line 52
    .line 53
    iget-object p1, v4, Landroidx/window/layout/adapter/extensions/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪兰世苏哲:Ljava/util/LinkedHashSet;

    .line 54
    .line 55
    invoke-interface {p1}, Ljava/util/Set;->isEmpty()Z

    .line 56
    .line 57
    .line 58
    move-result p1

    .line 59
    if-eqz p1, :cond_2

    .line 60
    .line 61
    invoke-interface {v0, v3}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 62
    .line 63
    .line 64
    iget-object p0, p0, Landroidx/window/layout/adapter/extensions/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏哲兰:Landroidx/window/extensions/layout/WindowLayoutComponent;

    .line 65
    .line 66
    check-cast v4, Landroidx/window/extensions/core/util/function/Consumer;

    .line 67
    .line 68
    invoke-interface {p0, v4}, Landroidx/window/extensions/layout/WindowLayoutComponent;->removeWindowLayoutInfoListener(Landroidx/window/extensions/core/util/function/Consumer;)V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 69
    .line 70
    .line 71
    goto :goto_0

    .line 72
    :catchall_0
    move-exception p0

    .line 73
    goto :goto_1

    .line 74
    :cond_2
    :goto_0
    invoke-virtual {v2}, Ljava/util/concurrent/locks/ReentrantLock;->unlock()V

    .line 75
    .line 76
    .line 77
    return-void

    .line 78
    :catchall_1
    move-exception p0

    .line 79
    :try_start_5
    invoke-virtual {v5}, Ljava/util/concurrent/locks/ReentrantLock;->unlock()V

    .line 80
    .line 81
    .line 82
    throw p0
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    .line 83
    :goto_1
    invoke-virtual {v2}, Ljava/util/concurrent/locks/ReentrantLock;->unlock()V

    .line 84
    .line 85
    .line 86
    throw p0
.end method
