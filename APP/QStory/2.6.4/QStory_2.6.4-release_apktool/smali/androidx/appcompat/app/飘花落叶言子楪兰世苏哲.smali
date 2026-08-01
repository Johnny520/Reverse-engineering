.class public final Landroidx/appcompat/app/飘花落叶言子楪兰世苏哲;
.super Ljava/lang/Object;
.source "r8-map-id-70bf64ddac3f904dcf61383bec717e6f4283f4f555a9f70f5d9ea129839b05ef"

# interfaces
.implements Ljava/util/concurrent/Executor;


# instance fields
.field public final 飘花落叶言子楪兰世哲苏:Ljava/util/concurrent/Executor;

.field public final 飘花落叶言子楪兰世苏哲:Ljava/lang/Object;

.field public final 飘花落叶言子楪哲兰世苏:Ljava/util/ArrayDeque;

.field public 飘花落叶言子楪哲兰苏世:Ljava/lang/Runnable;

.field public final synthetic 飘花落叶言子楪哲苏兰世:I


# direct methods
.method public constructor <init>(Landroidx/appcompat/app/飘花落叶言子楪兰世哲苏;)V
    .locals 1

    const/4 v0, 0x0

    iput v0, p0, Landroidx/appcompat/app/飘花落叶言子楪兰世苏哲;->飘花落叶言子楪哲苏兰世:I

    .line 27
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 28
    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    iput-object v0, p0, Landroidx/appcompat/app/飘花落叶言子楪兰世苏哲;->飘花落叶言子楪兰世苏哲:Ljava/lang/Object;

    .line 29
    new-instance v0, Ljava/util/ArrayDeque;

    invoke-direct {v0}, Ljava/util/ArrayDeque;-><init>()V

    iput-object v0, p0, Landroidx/appcompat/app/飘花落叶言子楪兰世苏哲;->飘花落叶言子楪哲兰世苏:Ljava/util/ArrayDeque;

    .line 30
    iput-object p1, p0, Landroidx/appcompat/app/飘花落叶言子楪兰世苏哲;->飘花落叶言子楪兰世哲苏:Ljava/util/concurrent/Executor;

    return-void
.end method

.method public constructor <init>(Ljava/util/concurrent/Executor;)V
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    iput v0, p0, Landroidx/appcompat/app/飘花落叶言子楪兰世苏哲;->飘花落叶言子楪哲苏兰世:I

    .line 3
    .line 4
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 8
    .line 9
    .line 10
    iput-object p1, p0, Landroidx/appcompat/app/飘花落叶言子楪兰世苏哲;->飘花落叶言子楪兰世哲苏:Ljava/util/concurrent/Executor;

    .line 11
    .line 12
    new-instance p1, Ljava/util/ArrayDeque;

    .line 13
    .line 14
    invoke-direct {p1}, Ljava/util/ArrayDeque;-><init>()V

    .line 15
    .line 16
    .line 17
    iput-object p1, p0, Landroidx/appcompat/app/飘花落叶言子楪兰世苏哲;->飘花落叶言子楪哲兰世苏:Ljava/util/ArrayDeque;

    .line 18
    .line 19
    new-instance p1, Ljava/lang/Object;

    .line 20
    .line 21
    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    .line 22
    .line 23
    .line 24
    iput-object p1, p0, Landroidx/appcompat/app/飘花落叶言子楪兰世苏哲;->飘花落叶言子楪兰世苏哲:Ljava/lang/Object;

    .line 25
    .line 26
    return-void
.end method


# virtual methods
.method public final execute(Ljava/lang/Runnable;)V
    .locals 4

    .line 1
    iget v0, p0, Landroidx/appcompat/app/飘花落叶言子楪兰世苏哲;->飘花落叶言子楪哲苏兰世:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 7
    .line 8
    .line 9
    iget-object v0, p0, Landroidx/appcompat/app/飘花落叶言子楪兰世苏哲;->飘花落叶言子楪兰世苏哲:Ljava/lang/Object;

    .line 10
    .line 11
    monitor-enter v0

    .line 12
    :try_start_0
    iget-object v1, p0, Landroidx/appcompat/app/飘花落叶言子楪兰世苏哲;->飘花落叶言子楪哲兰世苏:Ljava/util/ArrayDeque;

    .line 13
    .line 14
    new-instance v2, Landroidx/appcompat/app/飘花落叶言子楪哲兰苏世;

    .line 15
    .line 16
    invoke-direct {v2, p1, p0}, Landroidx/appcompat/app/飘花落叶言子楪哲兰苏世;-><init>(Ljava/lang/Runnable;Landroidx/appcompat/app/飘花落叶言子楪兰世苏哲;)V

    .line 17
    .line 18
    .line 19
    invoke-virtual {v1, v2}, Ljava/util/ArrayDeque;->offer(Ljava/lang/Object;)Z

    .line 20
    .line 21
    .line 22
    iget-object p1, p0, Landroidx/appcompat/app/飘花落叶言子楪兰世苏哲;->飘花落叶言子楪哲兰苏世:Ljava/lang/Runnable;

    .line 23
    .line 24
    if-nez p1, :cond_0

    .line 25
    .line 26
    invoke-virtual {p0}, Landroidx/appcompat/app/飘花落叶言子楪兰世苏哲;->飘花落叶言子楪世苏哲兰()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 27
    .line 28
    .line 29
    goto :goto_0

    .line 30
    :catchall_0
    move-exception p0

    .line 31
    goto :goto_1

    .line 32
    :cond_0
    :goto_0
    monitor-exit v0

    .line 33
    return-void

    .line 34
    :goto_1
    monitor-exit v0

    .line 35
    throw p0

    .line 36
    :pswitch_0
    iget-object v0, p0, Landroidx/appcompat/app/飘花落叶言子楪兰世苏哲;->飘花落叶言子楪兰世苏哲:Ljava/lang/Object;

    .line 37
    .line 38
    monitor-enter v0

    .line 39
    :try_start_1
    iget-object v1, p0, Landroidx/appcompat/app/飘花落叶言子楪兰世苏哲;->飘花落叶言子楪哲兰世苏:Ljava/util/ArrayDeque;

    .line 40
    .line 41
    new-instance v2, Landroidx/appcompat/app/飘花落叶言子楪哲兰苏世;

    .line 42
    .line 43
    const/4 v3, 0x0

    .line 44
    invoke-direct {v2, p0, v3, p1}, Landroidx/appcompat/app/飘花落叶言子楪哲兰苏世;-><init>(Ljava/lang/Object;ILjava/lang/Object;)V

    .line 45
    .line 46
    .line 47
    invoke-virtual {v1, v2}, Ljava/util/ArrayDeque;->add(Ljava/lang/Object;)Z

    .line 48
    .line 49
    .line 50
    iget-object p1, p0, Landroidx/appcompat/app/飘花落叶言子楪兰世苏哲;->飘花落叶言子楪哲兰苏世:Ljava/lang/Runnable;

    .line 51
    .line 52
    if-nez p1, :cond_1

    .line 53
    .line 54
    invoke-virtual {p0}, Landroidx/appcompat/app/飘花落叶言子楪兰世苏哲;->飘花落叶言子楪世苏哲兰()V

    .line 55
    .line 56
    .line 57
    goto :goto_2

    .line 58
    :catchall_1
    move-exception p0

    .line 59
    goto :goto_3

    .line 60
    :cond_1
    :goto_2
    monitor-exit v0

    .line 61
    return-void

    .line 62
    :goto_3
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 63
    throw p0

    .line 64
    nop

    .line 65
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final 飘花落叶言子楪世苏哲兰()V
    .locals 3

    .line 1
    iget v0, p0, Landroidx/appcompat/app/飘花落叶言子楪兰世苏哲;->飘花落叶言子楪哲苏兰世:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Landroidx/appcompat/app/飘花落叶言子楪兰世苏哲;->飘花落叶言子楪兰世苏哲:Ljava/lang/Object;

    .line 7
    .line 8
    monitor-enter v0

    .line 9
    :try_start_0
    iget-object v1, p0, Landroidx/appcompat/app/飘花落叶言子楪兰世苏哲;->飘花落叶言子楪哲兰世苏:Ljava/util/ArrayDeque;

    .line 10
    .line 11
    invoke-virtual {v1}, Ljava/util/ArrayDeque;->poll()Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object v1

    .line 15
    move-object v2, v1

    .line 16
    check-cast v2, Ljava/lang/Runnable;

    .line 17
    .line 18
    iput-object v2, p0, Landroidx/appcompat/app/飘花落叶言子楪兰世苏哲;->飘花落叶言子楪哲兰苏世:Ljava/lang/Runnable;

    .line 19
    .line 20
    if-eqz v1, :cond_0

    .line 21
    .line 22
    iget-object p0, p0, Landroidx/appcompat/app/飘花落叶言子楪兰世苏哲;->飘花落叶言子楪兰世哲苏:Ljava/util/concurrent/Executor;

    .line 23
    .line 24
    invoke-interface {p0, v2}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

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
    :goto_0
    monitor-exit v0

    .line 31
    return-void

    .line 32
    :goto_1
    monitor-exit v0

    .line 33
    throw p0

    .line 34
    :pswitch_0
    iget-object v0, p0, Landroidx/appcompat/app/飘花落叶言子楪兰世苏哲;->飘花落叶言子楪兰世苏哲:Ljava/lang/Object;

    .line 35
    .line 36
    monitor-enter v0

    .line 37
    :try_start_1
    iget-object v1, p0, Landroidx/appcompat/app/飘花落叶言子楪兰世苏哲;->飘花落叶言子楪哲兰世苏:Ljava/util/ArrayDeque;

    .line 38
    .line 39
    invoke-virtual {v1}, Ljava/util/ArrayDeque;->poll()Ljava/lang/Object;

    .line 40
    .line 41
    .line 42
    move-result-object v1

    .line 43
    check-cast v1, Ljava/lang/Runnable;

    .line 44
    .line 45
    iput-object v1, p0, Landroidx/appcompat/app/飘花落叶言子楪兰世苏哲;->飘花落叶言子楪哲兰苏世:Ljava/lang/Runnable;

    .line 46
    .line 47
    if-eqz v1, :cond_1

    .line 48
    .line 49
    iget-object p0, p0, Landroidx/appcompat/app/飘花落叶言子楪兰世苏哲;->飘花落叶言子楪兰世哲苏:Ljava/util/concurrent/Executor;

    .line 50
    .line 51
    check-cast p0, Landroidx/appcompat/app/飘花落叶言子楪兰世哲苏;

    .line 52
    .line 53
    invoke-virtual {p0, v1}, Landroidx/appcompat/app/飘花落叶言子楪兰世哲苏;->execute(Ljava/lang/Runnable;)V

    .line 54
    .line 55
    .line 56
    goto :goto_2

    .line 57
    :catchall_1
    move-exception p0

    .line 58
    goto :goto_3

    .line 59
    :cond_1
    :goto_2
    monitor-exit v0

    .line 60
    return-void

    .line 61
    :goto_3
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 62
    throw p0

    .line 63
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
