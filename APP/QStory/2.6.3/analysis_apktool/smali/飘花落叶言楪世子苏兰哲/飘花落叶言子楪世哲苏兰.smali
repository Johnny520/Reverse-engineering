.class public final L飘花落叶言楪世子苏兰哲/飘花落叶言子楪世哲苏兰;
.super Ljava/lang/Object;
.source "r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4"


# instance fields
.field public final 飘花落叶言子楪世苏哲兰:Ljava/util/ArrayDeque;


# direct methods
.method public constructor <init>(I)V
    .locals 1

    .line 1
    packed-switch p1, :pswitch_data_0

    .line 2
    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    new-instance p1, Ljava/util/ArrayDeque;

    .line 8
    .line 9
    invoke-direct {p1}, Ljava/util/ArrayDeque;-><init>()V

    .line 10
    .line 11
    .line 12
    iput-object p1, p0, L飘花落叶言楪世子苏兰哲/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世苏哲兰:Ljava/util/ArrayDeque;

    .line 13
    .line 14
    return-void

    .line 15
    :pswitch_0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 16
    .line 17
    .line 18
    new-instance p1, Ljava/util/ArrayDeque;

    .line 19
    .line 20
    const/4 v0, 0x0

    .line 21
    invoke-direct {p1, v0}, Ljava/util/ArrayDeque;-><init>(I)V

    .line 22
    .line 23
    .line 24
    iput-object p1, p0, L飘花落叶言楪世子苏兰哲/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世苏哲兰:Ljava/util/ArrayDeque;

    .line 25
    .line 26
    return-void

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
    .end packed-switch
.end method


# virtual methods
.method public declared-synchronized 飘花落叶言子楪世苏哲兰(L飘花落叶言楪子兰哲世苏/飘花落叶言子楪世哲苏兰;)V
    .locals 1

    .line 1
    monitor-enter p0

    .line 2
    const/4 v0, 0x0

    .line 3
    :try_start_0
    iput-object v0, p1, L飘花落叶言楪子兰哲世苏/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世苏兰哲:Ljava/nio/ByteBuffer;

    .line 4
    .line 5
    iput-object v0, p1, L飘花落叶言楪子兰哲世苏/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世哲苏兰:L飘花落叶言楪子兰哲世苏/飘花落叶言子楪世苏兰哲;

    .line 6
    .line 7
    iget-object v0, p0, L飘花落叶言楪世子苏兰哲/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世苏哲兰:Ljava/util/ArrayDeque;

    .line 8
    .line 9
    invoke-virtual {v0, p1}, Ljava/util/ArrayDeque;->offer(Ljava/lang/Object;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

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
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 16
    throw p1
.end method
