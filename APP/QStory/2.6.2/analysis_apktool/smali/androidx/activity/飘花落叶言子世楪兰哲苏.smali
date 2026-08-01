.class public final Landroidx/activity/飘花落叶言子世楪兰哲苏;
.super Ljava/lang/Object;
.source "r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776"


# instance fields
.field public 飘花落叶言子楪世兰哲苏:Z

.field public 飘花落叶言子楪世兰苏哲:Z

.field public 飘花落叶言子楪世哲兰苏:I

.field public final 飘花落叶言子楪世哲苏兰:Ljava/lang/Object;

.field public final 飘花落叶言子楪世苏兰哲:Landroidx/activity/飘花落叶言子楪世兰哲苏;

.field public final 飘花落叶言子楪世苏哲兰:Ljava/util/concurrent/Executor;

.field public final 飘花落叶言子楪苏世兰哲:Landroidx/activity/飘花落叶言子楪哲世苏兰;

.field public final 飘花落叶言子楪苏世哲兰:Ljava/util/ArrayList;


# direct methods
.method public constructor <init>(Ljava/util/concurrent/Executor;Landroidx/activity/飘花落叶言子楪世兰哲苏;)V
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    iput-object p1, p0, Landroidx/activity/飘花落叶言子世楪兰哲苏;->飘花落叶言子楪世苏哲兰:Ljava/util/concurrent/Executor;

    .line 8
    .line 9
    iput-object p2, p0, Landroidx/activity/飘花落叶言子世楪兰哲苏;->飘花落叶言子楪世苏兰哲:Landroidx/activity/飘花落叶言子楪世兰哲苏;

    .line 10
    .line 11
    new-instance p1, Ljava/lang/Object;

    .line 12
    .line 13
    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    .line 14
    .line 15
    .line 16
    iput-object p1, p0, Landroidx/activity/飘花落叶言子世楪兰哲苏;->飘花落叶言子楪世哲苏兰:Ljava/lang/Object;

    .line 17
    .line 18
    new-instance p1, Ljava/util/ArrayList;

    .line 19
    .line 20
    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    .line 21
    .line 22
    .line 23
    iput-object p1, p0, Landroidx/activity/飘花落叶言子世楪兰哲苏;->飘花落叶言子楪苏世哲兰:Ljava/util/ArrayList;

    .line 24
    .line 25
    new-instance p1, Landroidx/activity/飘花落叶言子楪哲世苏兰;

    .line 26
    .line 27
    const/4 p2, 0x2

    .line 28
    invoke-direct {p1, p0, p2}, Landroidx/activity/飘花落叶言子楪哲世苏兰;-><init>(Ljava/lang/Object;I)V

    .line 29
    .line 30
    .line 31
    iput-object p1, p0, Landroidx/activity/飘花落叶言子世楪兰哲苏;->飘花落叶言子楪苏世兰哲:Landroidx/activity/飘花落叶言子楪哲世苏兰;

    .line 32
    .line 33
    return-void
.end method


# virtual methods
.method public final 飘花落叶言子楪世苏兰哲()V
    .locals 3

    .line 1
    iget-object v0, p0, Landroidx/activity/飘花落叶言子世楪兰哲苏;->飘花落叶言子楪世哲苏兰:Ljava/lang/Object;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    iget-boolean v1, p0, Landroidx/activity/飘花落叶言子世楪兰哲苏;->飘花落叶言子楪世兰哲苏:Z

    .line 5
    .line 6
    if-nez v1, :cond_0

    .line 7
    .line 8
    iget v1, p0, Landroidx/activity/飘花落叶言子世楪兰哲苏;->飘花落叶言子楪世哲兰苏:I

    .line 9
    .line 10
    if-lez v1, :cond_0

    .line 11
    .line 12
    add-int/lit8 v1, v1, -0x1

    .line 13
    .line 14
    iput v1, p0, Landroidx/activity/飘花落叶言子世楪兰哲苏;->飘花落叶言子楪世哲兰苏:I

    .line 15
    .line 16
    iget-boolean v2, p0, Landroidx/activity/飘花落叶言子世楪兰哲苏;->飘花落叶言子楪世兰苏哲:Z

    .line 17
    .line 18
    if-nez v2, :cond_0

    .line 19
    .line 20
    if-nez v1, :cond_0

    .line 21
    .line 22
    const/4 v1, 0x1

    .line 23
    iput-boolean v1, p0, Landroidx/activity/飘花落叶言子世楪兰哲苏;->飘花落叶言子楪世兰苏哲:Z

    .line 24
    .line 25
    iget-object v1, p0, Landroidx/activity/飘花落叶言子世楪兰哲苏;->飘花落叶言子楪世苏哲兰:Ljava/util/concurrent/Executor;

    .line 26
    .line 27
    iget-object p0, p0, Landroidx/activity/飘花落叶言子世楪兰哲苏;->飘花落叶言子楪苏世兰哲:Landroidx/activity/飘花落叶言子楪哲世苏兰;

    .line 28
    .line 29
    invoke-interface {v1, p0}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 30
    .line 31
    .line 32
    goto :goto_0

    .line 33
    :catchall_0
    move-exception p0

    .line 34
    goto :goto_1

    .line 35
    :cond_0
    :goto_0
    monitor-exit v0

    .line 36
    return-void

    .line 37
    :goto_1
    monitor-exit v0

    .line 38
    throw p0
.end method

.method public final 飘花落叶言子楪世苏哲兰()V
    .locals 3

    .line 1
    iget-object v0, p0, Landroidx/activity/飘花落叶言子世楪兰哲苏;->飘花落叶言子楪世哲苏兰:Ljava/lang/Object;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    const/4 v1, 0x1

    .line 5
    :try_start_0
    iput-boolean v1, p0, Landroidx/activity/飘花落叶言子世楪兰哲苏;->飘花落叶言子楪世兰哲苏:Z

    .line 6
    .line 7
    iget-object v1, p0, Landroidx/activity/飘花落叶言子世楪兰哲苏;->飘花落叶言子楪苏世哲兰:Ljava/util/ArrayList;

    .line 8
    .line 9
    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 14
    .line 15
    .line 16
    move-result v2

    .line 17
    if-eqz v2, :cond_0

    .line 18
    .line 19
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 20
    .line 21
    .line 22
    move-result-object v2

    .line 23
    check-cast v2, L飘花落叶言世子哲楪兰苏/飘花落叶言子楪世苏哲兰;

    .line 24
    .line 25
    invoke-interface {v2}, L飘花落叶言世子哲楪兰苏/飘花落叶言子楪世苏哲兰;->invoke()Ljava/lang/Object;

    .line 26
    .line 27
    .line 28
    goto :goto_0

    .line 29
    :catchall_0
    move-exception p0

    .line 30
    goto :goto_1

    .line 31
    :cond_0
    iget-object p0, p0, Landroidx/activity/飘花落叶言子世楪兰哲苏;->飘花落叶言子楪苏世哲兰:Ljava/util/ArrayList;

    .line 32
    .line 33
    invoke-virtual {p0}, Ljava/util/ArrayList;->clear()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 34
    .line 35
    .line 36
    monitor-exit v0

    .line 37
    return-void

    .line 38
    :goto_1
    monitor-exit v0

    .line 39
    throw p0
.end method
