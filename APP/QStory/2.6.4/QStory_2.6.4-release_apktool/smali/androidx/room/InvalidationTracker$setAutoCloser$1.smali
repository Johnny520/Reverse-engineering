.class final synthetic Landroidx/room/InvalidationTracker$setAutoCloser$1;
.super Lkotlin/jvm/internal/FunctionReferenceImpl;
.source "r8-map-id-70bf64ddac3f904dcf61383bec717e6f4283f4f555a9f70f5d9ea129839b05ef"

# interfaces
.implements L飘花落叶言世子哲兰苏楪/飘花落叶言子楪世苏哲兰;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/FunctionReferenceImpl;",
        "L\u98d8\u82b1\u843d\u53f6\u8a00\u4e16\u5b50\u54f2\u5170\u82cf\u696a/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u696a\u4e16\u82cf\u54f2\u5170;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    k = 0x3
    mv = {
        0x2,
        0x1,
        0x0
    }
    xi = 0x30
.end annotation


# direct methods
.method public constructor <init>(Ljava/lang/Object;)V
    .locals 7

    .line 1
    const-string v5, "onAutoCloseCallback()V"

    .line 2
    .line 3
    const/4 v6, 0x0

    .line 4
    const/4 v1, 0x0

    .line 5
    const-class v3, Landroidx/room/飘花落叶言子楪苏哲世兰;

    .line 6
    .line 7
    const-string v4, "onAutoCloseCallback"

    .line 8
    .line 9
    move-object v0, p0

    .line 10
    move-object v2, p1

    .line 11
    invoke-direct/range {v0 .. v6}, Lkotlin/jvm/internal/FunctionReferenceImpl;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    .line 12
    .line 13
    .line 14
    return-void
.end method


# virtual methods
.method public bridge synthetic invoke()Ljava/lang/Object;
    .locals 0

    .line 40
    invoke-virtual {p0}, Landroidx/room/InvalidationTracker$setAutoCloser$1;->invoke()V

    sget-object p0, Lkotlin/飘花落叶言子楪兰苏哲世;->飘花落叶言子楪世苏哲兰:Lkotlin/飘花落叶言子楪兰苏哲世;

    return-object p0
.end method

.method public final invoke()V
    .locals 5

    .line 1
    iget-object p0, p0, Lkotlin/jvm/internal/CallableReference;->receiver:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p0, Landroidx/room/飘花落叶言子楪苏哲世兰;

    .line 4
    .line 5
    iget-object v0, p0, Landroidx/room/飘花落叶言子楪苏哲世兰;->飘花落叶言子楪苏世哲兰:Ljava/lang/Object;

    .line 6
    .line 7
    monitor-enter v0

    .line 8
    :try_start_0
    iget-object p0, p0, Landroidx/room/飘花落叶言子楪苏哲世兰;->飘花落叶言子楪世苏兰哲:Landroidx/room/飘花落叶言子世苏兰楪哲;

    .line 9
    .line 10
    iget-object p0, p0, Landroidx/room/飘花落叶言子世苏兰楪哲;->飘花落叶言子楪苏世兰哲:Landroidx/room/飘花落叶言子楪哲苏世兰;

    .line 11
    .line 12
    iget-object v1, p0, Landroidx/room/飘花落叶言子楪哲苏世兰;->飘花落叶言子楪世苏哲兰:Ljava/util/concurrent/locks/ReentrantLock;

    .line 13
    .line 14
    invoke-virtual {v1}, Ljava/util/concurrent/locks/ReentrantLock;->lock()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 15
    .line 16
    .line 17
    :try_start_1
    iget-object v2, p0, Landroidx/room/飘花落叶言子楪哲苏世兰;->飘花落叶言子楪世哲苏兰:[Z

    .line 18
    .line 19
    array-length v3, v2

    .line 20
    const/4 v4, 0x0

    .line 21
    invoke-static {v2, v4, v3, v4}, Ljava/util/Arrays;->fill([ZIIZ)V

    .line 22
    .line 23
    .line 24
    const/4 v2, 0x1

    .line 25
    iput-boolean v2, p0, Landroidx/room/飘花落叶言子楪哲苏世兰;->飘花落叶言子楪世哲兰苏:Z
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 26
    .line 27
    :try_start_2
    invoke-virtual {v1}, Ljava/util/concurrent/locks/ReentrantLock;->unlock()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 28
    .line 29
    .line 30
    monitor-exit v0

    .line 31
    return-void

    .line 32
    :catchall_0
    move-exception p0

    .line 33
    :try_start_3
    invoke-virtual {v1}, Ljava/util/concurrent/locks/ReentrantLock;->unlock()V

    .line 34
    .line 35
    .line 36
    throw p0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 37
    :catchall_1
    move-exception p0

    .line 38
    monitor-exit v0

    .line 39
    throw p0
.end method
