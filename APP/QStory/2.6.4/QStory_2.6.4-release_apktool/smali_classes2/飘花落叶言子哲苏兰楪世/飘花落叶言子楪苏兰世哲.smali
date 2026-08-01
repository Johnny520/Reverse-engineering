.class public final L飘花落叶言子哲苏兰楪世/飘花落叶言子楪苏兰世哲;
.super L飘花落叶言楪兰世子哲苏/飘花落叶言子楪哲世兰苏;
.source "r8-map-id-70bf64ddac3f904dcf61383bec717e6f4283f4f555a9f70f5d9ea129839b05ef"


# instance fields
.field public final synthetic 飘花落叶言子楪哲兰世苏:L飘花落叶言楪兰世子哲苏/飘花落叶言子楪哲世兰苏;

.field public final synthetic 飘花落叶言子楪哲兰苏世:Ljava/util/concurrent/ThreadPoolExecutor;


# direct methods
.method public constructor <init>(L飘花落叶言楪兰世子哲苏/飘花落叶言子楪哲世兰苏;Ljava/util/concurrent/ThreadPoolExecutor;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, L飘花落叶言子哲苏兰楪世/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪哲兰世苏:L飘花落叶言楪兰世子哲苏/飘花落叶言子楪哲世兰苏;

    .line 5
    .line 6
    iput-object p2, p0, L飘花落叶言子哲苏兰楪世/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪哲兰苏世:Ljava/util/concurrent/ThreadPoolExecutor;

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final 飘花落叶言子世哲苏楪兰(Landroidx/compose/animation/core/飘花落叶言子哲楪苏世兰;)V
    .locals 1

    .line 1
    iget-object v0, p0, L飘花落叶言子哲苏兰楪世/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪哲兰苏世:Ljava/util/concurrent/ThreadPoolExecutor;

    .line 2
    .line 3
    :try_start_0
    iget-object p0, p0, L飘花落叶言子哲苏兰楪世/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪哲兰世苏:L飘花落叶言楪兰世子哲苏/飘花落叶言子楪哲世兰苏;

    .line 4
    .line 5
    invoke-virtual {p0, p1}, L飘花落叶言楪兰世子哲苏/飘花落叶言子楪哲世兰苏;->飘花落叶言子世哲苏楪兰(Landroidx/compose/animation/core/飘花落叶言子哲楪苏世兰;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 6
    .line 7
    .line 8
    invoke-virtual {v0}, Ljava/util/concurrent/ThreadPoolExecutor;->shutdown()V

    .line 9
    .line 10
    .line 11
    return-void

    .line 12
    :catchall_0
    move-exception p0

    .line 13
    invoke-virtual {v0}, Ljava/util/concurrent/ThreadPoolExecutor;->shutdown()V

    .line 14
    .line 15
    .line 16
    throw p0
.end method

.method public final 飘花落叶言子世苏兰楪哲(Ljava/lang/Throwable;)V
    .locals 1

    .line 1
    iget-object v0, p0, L飘花落叶言子哲苏兰楪世/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪哲兰苏世:Ljava/util/concurrent/ThreadPoolExecutor;

    .line 2
    .line 3
    :try_start_0
    iget-object p0, p0, L飘花落叶言子哲苏兰楪世/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪哲兰世苏:L飘花落叶言楪兰世子哲苏/飘花落叶言子楪哲世兰苏;

    .line 4
    .line 5
    invoke-virtual {p0, p1}, L飘花落叶言楪兰世子哲苏/飘花落叶言子楪哲世兰苏;->飘花落叶言子世苏兰楪哲(Ljava/lang/Throwable;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 6
    .line 7
    .line 8
    invoke-virtual {v0}, Ljava/util/concurrent/ThreadPoolExecutor;->shutdown()V

    .line 9
    .line 10
    .line 11
    return-void

    .line 12
    :catchall_0
    move-exception p0

    .line 13
    invoke-virtual {v0}, Ljava/util/concurrent/ThreadPoolExecutor;->shutdown()V

    .line 14
    .line 15
    .line 16
    throw p0
.end method
