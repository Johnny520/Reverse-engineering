.class public final L飘花落叶言子哲苏兰楪世/飘花落叶言子楪苏兰世哲;
.super L飘花落叶言楪兰子苏哲世/飘花落叶言子楪哲世兰苏;
.source "r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776"


# instance fields
.field public final synthetic 飘花落叶言子楪世哲兰苏:Ljava/util/concurrent/ThreadPoolExecutor;

.field public final synthetic 飘花落叶言子楪世哲苏兰:L飘花落叶言楪兰子苏哲世/飘花落叶言子楪哲世兰苏;


# direct methods
.method public constructor <init>(L飘花落叶言楪兰子苏哲世/飘花落叶言子楪哲世兰苏;Ljava/util/concurrent/ThreadPoolExecutor;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, L飘花落叶言子哲苏兰楪世/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世哲苏兰:L飘花落叶言楪兰子苏哲世/飘花落叶言子楪哲世兰苏;

    .line 5
    .line 6
    iput-object p2, p0, L飘花落叶言子哲苏兰楪世/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世哲兰苏:Ljava/util/concurrent/ThreadPoolExecutor;

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final 飘花落叶言子世楪苏兰哲(Landroidx/compose/animation/core/飘花落叶言子哲楪苏世兰;)V
    .locals 1

    .line 1
    iget-object v0, p0, L飘花落叶言子哲苏兰楪世/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世哲兰苏:Ljava/util/concurrent/ThreadPoolExecutor;

    .line 2
    .line 3
    :try_start_0
    iget-object p0, p0, L飘花落叶言子哲苏兰楪世/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世哲苏兰:L飘花落叶言楪兰子苏哲世/飘花落叶言子楪哲世兰苏;

    .line 4
    .line 5
    invoke-virtual {p0, p1}, L飘花落叶言楪兰子苏哲世/飘花落叶言子楪哲世兰苏;->飘花落叶言子世楪苏兰哲(Landroidx/compose/animation/core/飘花落叶言子哲楪苏世兰;)V
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

.method public final 飘花落叶言子世楪苏哲兰(Ljava/lang/Throwable;)V
    .locals 1

    .line 1
    iget-object v0, p0, L飘花落叶言子哲苏兰楪世/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世哲兰苏:Ljava/util/concurrent/ThreadPoolExecutor;

    .line 2
    .line 3
    :try_start_0
    iget-object p0, p0, L飘花落叶言子哲苏兰楪世/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世哲苏兰:L飘花落叶言楪兰子苏哲世/飘花落叶言子楪哲世兰苏;

    .line 4
    .line 5
    invoke-virtual {p0, p1}, L飘花落叶言楪兰子苏哲世/飘花落叶言子楪哲世兰苏;->飘花落叶言子世楪苏哲兰(Ljava/lang/Throwable;)V
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
