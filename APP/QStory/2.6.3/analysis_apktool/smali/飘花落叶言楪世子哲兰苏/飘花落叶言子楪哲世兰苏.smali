.class public final L飘花落叶言楪世子哲兰苏/飘花落叶言子楪哲世兰苏;
.super Lcom/alibaba/fastjson2/飘花落叶言子楪苏世兰哲;
.source "r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4"


# virtual methods
.method public final 飘花落叶言子楪世哲苏兰(Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 0

    .line 1
    check-cast p1, L飘花落叶言楪世子哲兰苏/飘花落叶言子楪哲苏世兰;

    .line 2
    .line 3
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    sget-object p0, L飘花落叶言楪世子哲兰苏/飘花落叶言子楪哲苏世兰;->飘花落叶言子楪世苏兰哲:Ljava/util/ArrayDeque;

    .line 7
    .line 8
    monitor-enter p0

    .line 9
    :try_start_0
    invoke-virtual {p0, p1}, Ljava/util/ArrayDeque;->offer(Ljava/lang/Object;)Z

    .line 10
    .line 11
    .line 12
    monitor-exit p0

    .line 13
    return-void

    .line 14
    :catchall_0
    move-exception p1

    .line 15
    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 16
    throw p1
.end method
