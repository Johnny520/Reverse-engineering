.class public final Landroidx/appcompat/app/飘花落叶言子楪兰世苏哲;
.super Ljava/lang/Object;
.source "r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776"

# interfaces
.implements Ljava/util/concurrent/Executor;


# instance fields
.field public 飘花落叶言子楪兰世苏哲:Ljava/lang/Runnable;

.field public final 飘花落叶言子楪哲兰世苏:Ljava/util/ArrayDeque;

.field public final 飘花落叶言子楪哲兰苏世:Landroidx/appcompat/app/飘花落叶言子楪兰世哲苏;

.field public final 飘花落叶言子楪哲苏兰世:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Landroidx/appcompat/app/飘花落叶言子楪兰世哲苏;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Ljava/lang/Object;

    .line 5
    .line 6
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object v0, p0, Landroidx/appcompat/app/飘花落叶言子楪兰世苏哲;->飘花落叶言子楪哲苏兰世:Ljava/lang/Object;

    .line 10
    .line 11
    new-instance v0, Ljava/util/ArrayDeque;

    .line 12
    .line 13
    invoke-direct {v0}, Ljava/util/ArrayDeque;-><init>()V

    .line 14
    .line 15
    .line 16
    iput-object v0, p0, Landroidx/appcompat/app/飘花落叶言子楪兰世苏哲;->飘花落叶言子楪哲兰世苏:Ljava/util/ArrayDeque;

    .line 17
    .line 18
    iput-object p1, p0, Landroidx/appcompat/app/飘花落叶言子楪兰世苏哲;->飘花落叶言子楪哲兰苏世:Landroidx/appcompat/app/飘花落叶言子楪兰世哲苏;

    .line 19
    .line 20
    return-void
.end method


# virtual methods
.method public final execute(Ljava/lang/Runnable;)V
    .locals 4

    .line 1
    iget-object v0, p0, Landroidx/appcompat/app/飘花落叶言子楪兰世苏哲;->飘花落叶言子楪哲苏兰世:Ljava/lang/Object;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    iget-object v1, p0, Landroidx/appcompat/app/飘花落叶言子楪兰世苏哲;->飘花落叶言子楪哲兰世苏:Ljava/util/ArrayDeque;

    .line 5
    .line 6
    new-instance v2, Landroidx/appcompat/app/飘花落叶言子楪哲兰苏世;

    .line 7
    .line 8
    const/4 v3, 0x0

    .line 9
    invoke-direct {v2, p0, v3, p1}, Landroidx/appcompat/app/飘花落叶言子楪哲兰苏世;-><init>(Ljava/lang/Object;ILjava/lang/Object;)V

    .line 10
    .line 11
    .line 12
    invoke-virtual {v1, v2}, Ljava/util/ArrayDeque;->add(Ljava/lang/Object;)Z

    .line 13
    .line 14
    .line 15
    iget-object p1, p0, Landroidx/appcompat/app/飘花落叶言子楪兰世苏哲;->飘花落叶言子楪兰世苏哲:Ljava/lang/Runnable;

    .line 16
    .line 17
    if-nez p1, :cond_0

    .line 18
    .line 19
    invoke-virtual {p0}, Landroidx/appcompat/app/飘花落叶言子楪兰世苏哲;->飘花落叶言子楪世苏哲兰()V

    .line 20
    .line 21
    .line 22
    goto :goto_0

    .line 23
    :catchall_0
    move-exception p0

    .line 24
    goto :goto_1

    .line 25
    :cond_0
    :goto_0
    monitor-exit v0

    .line 26
    return-void

    .line 27
    :goto_1
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 28
    throw p0
.end method

.method public final 飘花落叶言子楪世苏哲兰()V
    .locals 2

    .line 1
    iget-object v0, p0, Landroidx/appcompat/app/飘花落叶言子楪兰世苏哲;->飘花落叶言子楪哲苏兰世:Ljava/lang/Object;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    iget-object v1, p0, Landroidx/appcompat/app/飘花落叶言子楪兰世苏哲;->飘花落叶言子楪哲兰世苏:Ljava/util/ArrayDeque;

    .line 5
    .line 6
    invoke-virtual {v1}, Ljava/util/ArrayDeque;->poll()Ljava/lang/Object;

    .line 7
    .line 8
    .line 9
    move-result-object v1

    .line 10
    check-cast v1, Ljava/lang/Runnable;

    .line 11
    .line 12
    iput-object v1, p0, Landroidx/appcompat/app/飘花落叶言子楪兰世苏哲;->飘花落叶言子楪兰世苏哲:Ljava/lang/Runnable;

    .line 13
    .line 14
    if-eqz v1, :cond_0

    .line 15
    .line 16
    iget-object p0, p0, Landroidx/appcompat/app/飘花落叶言子楪兰世苏哲;->飘花落叶言子楪哲兰苏世:Landroidx/appcompat/app/飘花落叶言子楪兰世哲苏;

    .line 17
    .line 18
    invoke-virtual {p0, v1}, Landroidx/appcompat/app/飘花落叶言子楪兰世哲苏;->execute(Ljava/lang/Runnable;)V

    .line 19
    .line 20
    .line 21
    goto :goto_0

    .line 22
    :catchall_0
    move-exception p0

    .line 23
    goto :goto_1

    .line 24
    :cond_0
    :goto_0
    monitor-exit v0

    .line 25
    return-void

    .line 26
    :goto_1
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 27
    throw p0
.end method
