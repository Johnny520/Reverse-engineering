.class public final L飘花落叶言楪世苏子哲兰/飘花落叶言子楪世苏哲兰;
.super Ljava/lang/Thread;
.source "r8-map-id-70bf64ddac3f904dcf61383bec717e6f4283f4f555a9f70f5d9ea129839b05ef"


# instance fields
.field public final synthetic 飘花落叶言子楪哲苏兰世:I


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Runnable;)V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    iput v0, p0, L飘花落叶言楪世苏子哲兰/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪哲苏兰世:I

    .line 3
    .line 4
    invoke-direct {p0, p1}, Ljava/lang/Thread;-><init>(Ljava/lang/Runnable;)V

    .line 5
    .line 6
    .line 7
    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/String;)V
    .locals 1

    .line 8
    const/4 v0, 0x1

    iput v0, p0, L飘花落叶言楪世苏子哲兰/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪哲苏兰世:I

    invoke-direct {p0, p1}, Ljava/lang/Thread;-><init>(Ljava/lang/String;)V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    .line 1
    iget v0, p0, L飘花落叶言楪世苏子哲兰/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪哲苏兰世:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    :catch_0
    :cond_0
    :goto_0
    :try_start_0
    sget-object p0, L飘花落叶言苏子楪哲兰世/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪苏世兰哲:Landroidx/appcompat/app/飘花落叶言子楪苏哲兰世;

    .line 7
    .line 8
    sget-object p0, L飘花落叶言苏子楪哲兰世/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪苏哲兰世:Ljava/util/concurrent/locks/ReentrantLock;

    .line 9
    .line 10
    invoke-virtual {p0}, Ljava/util/concurrent/locks/ReentrantLock;->lock()V
    :try_end_0
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_0

    .line 11
    .line 12
    .line 13
    :try_start_1
    invoke-static {}, L飘花落叶言世子楪哲苏兰/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪苏哲世兰()L飘花落叶言苏子楪哲兰世/飘花落叶言子楪世苏兰哲;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    sget-object v1, L飘花落叶言苏子楪哲兰世/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪苏哲世兰:L飘花落叶言苏子楪哲兰世/飘花落叶言子楪世苏兰哲;

    .line 18
    .line 19
    if-ne v0, v1, :cond_1

    .line 20
    .line 21
    const/4 v0, 0x0

    .line 22
    sput-object v0, L飘花落叶言苏子楪哲兰世/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪苏哲世兰:L飘花落叶言苏子楪哲兰世/飘花落叶言子楪世苏兰哲;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 23
    .line 24
    :try_start_2
    invoke-virtual {p0}, Ljava/util/concurrent/locks/ReentrantLock;->unlock()V

    .line 25
    .line 26
    .line 27
    return-void

    .line 28
    :catchall_0
    move-exception v0

    .line 29
    goto :goto_1

    .line 30
    :cond_1
    invoke-virtual {p0}, Ljava/util/concurrent/locks/ReentrantLock;->unlock()V

    .line 31
    .line 32
    .line 33
    if-eqz v0, :cond_0

    .line 34
    .line 35
    invoke-virtual {v0}, L飘花落叶言苏子楪哲兰世/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪苏兰世哲()V

    .line 36
    .line 37
    .line 38
    goto :goto_0

    .line 39
    :goto_1
    invoke-virtual {p0}, Ljava/util/concurrent/locks/ReentrantLock;->unlock()V

    .line 40
    .line 41
    .line 42
    throw v0
    :try_end_2
    .catch Ljava/lang/InterruptedException; {:try_start_2 .. :try_end_2} :catch_0

    .line 43
    :pswitch_0
    const/16 v0, 0x9

    .line 44
    .line 45
    invoke-static {v0}, Landroid/os/Process;->setThreadPriority(I)V

    .line 46
    .line 47
    .line 48
    invoke-super {p0}, Ljava/lang/Thread;->run()V

    .line 49
    .line 50
    .line 51
    return-void

    .line 52
    nop

    .line 53
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
