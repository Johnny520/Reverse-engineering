.class public final L飘花落叶言世兰楪哲子苏/飘花落叶言子楪苏哲世兰;
.super L飘花落叶言世兰楪苏哲子/飘花落叶言子楪世苏哲兰;
.source "r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4"


# instance fields
.field public final synthetic 飘花落叶言子楪世兰哲苏:L飘花落叶言世兰楪哲子苏/飘花落叶言子楪苏哲兰世;

.field public final synthetic 飘花落叶言子楪世兰苏哲:L飘花落叶言世兰楪哲子苏/飘花落叶言子楪兰苏世哲;


# direct methods
.method public constructor <init>(Ljava/lang/String;L飘花落叶言世兰楪哲子苏/飘花落叶言子楪兰苏世哲;L飘花落叶言世兰楪哲子苏/飘花落叶言子楪苏哲兰世;)V
    .locals 0

    .line 1
    iput-object p2, p0, L飘花落叶言世兰楪哲子苏/飘花落叶言子楪苏哲世兰;->飘花落叶言子楪世兰苏哲:L飘花落叶言世兰楪哲子苏/飘花落叶言子楪兰苏世哲;

    .line 2
    .line 3
    iput-object p3, p0, L飘花落叶言世兰楪哲子苏/飘花落叶言子楪苏哲世兰;->飘花落叶言子楪世兰哲苏:L飘花落叶言世兰楪哲子苏/飘花落叶言子楪苏哲兰世;

    .line 4
    .line 5
    invoke-direct {p0, p1}, L飘花落叶言世兰楪苏哲子/飘花落叶言子楪世苏哲兰;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final 飘花落叶言子楪世苏哲兰()J
    .locals 4

    .line 1
    iget-object v0, p0, L飘花落叶言世兰楪哲子苏/飘花落叶言子楪苏哲世兰;->飘花落叶言子楪世兰苏哲:L飘花落叶言世兰楪哲子苏/飘花落叶言子楪兰苏世哲;

    .line 2
    .line 3
    :try_start_0
    invoke-interface {v0}, L飘花落叶言世兰楪哲子苏/飘花落叶言子楪兰苏世哲;->飘花落叶言子楪世哲苏兰()L飘花落叶言世兰楪哲子苏/飘花落叶言子楪兰世哲苏;

    .line 4
    .line 5
    .line 6
    move-result-object v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 7
    goto :goto_0

    .line 8
    :catchall_0
    move-exception v1

    .line 9
    new-instance v2, L飘花落叶言世兰楪哲子苏/飘花落叶言子楪兰世哲苏;

    .line 10
    .line 11
    const/4 v3, 0x2

    .line 12
    invoke-direct {v2, v0, v1, v3}, L飘花落叶言世兰楪哲子苏/飘花落叶言子楪兰世哲苏;-><init>(L飘花落叶言世兰楪哲子苏/飘花落叶言子楪兰苏世哲;Ljava/lang/Throwable;I)V

    .line 13
    .line 14
    .line 15
    move-object v1, v2

    .line 16
    :goto_0
    iget-object p0, p0, L飘花落叶言世兰楪哲子苏/飘花落叶言子楪苏哲世兰;->飘花落叶言子楪世兰哲苏:L飘花落叶言世兰楪哲子苏/飘花落叶言子楪苏哲兰世;

    .line 17
    .line 18
    iget-object v2, p0, L飘花落叶言世兰楪哲子苏/飘花落叶言子楪苏哲兰世;->飘花落叶言子楪兰世苏哲:Ljava/lang/Object;

    .line 19
    .line 20
    check-cast v2, Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 21
    .line 22
    invoke-virtual {v2, v0}, Ljava/util/concurrent/CopyOnWriteArrayList;->contains(Ljava/lang/Object;)Z

    .line 23
    .line 24
    .line 25
    move-result v0

    .line 26
    if-eqz v0, :cond_0

    .line 27
    .line 28
    iget-object p0, p0, L飘花落叶言世兰楪哲子苏/飘花落叶言子楪苏哲兰世;->飘花落叶言子楪兰世哲苏:Ljava/lang/Object;

    .line 29
    .line 30
    check-cast p0, Ljava/util/concurrent/LinkedBlockingDeque;

    .line 31
    .line 32
    invoke-virtual {p0, v1}, Ljava/util/concurrent/LinkedBlockingDeque;->put(Ljava/lang/Object;)V

    .line 33
    .line 34
    .line 35
    :cond_0
    const-wide/16 v0, -0x1

    .line 36
    .line 37
    return-wide v0
.end method
