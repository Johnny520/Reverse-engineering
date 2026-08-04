.class public final Lyyds/ᲁᛶᛱᲈ;
.super Ljava/lang/Object;
.source "r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9"

# interfaces
.implements Ljava/util/concurrent/Executor;


# instance fields
.field public ᛲᛴᛳᛲ:Ljava/lang/Runnable;

.field public final ᛶᛷᛲᲁ:Ljava/util/concurrent/Executor;

.field public final synthetic ᲀᛲᛳᲀ:I

.field public final ᲇᲇᲇᛱ:Ljava/lang/Object;

.field public final ᲇᲈᛵᛷ:Ljava/util/ArrayDeque;


# direct methods
.method public constructor <init>(Ljava/util/concurrent/Executor;)V
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    iput v0, p0, Lyyds/ᲁᛶᛱᲈ;->ᲀᛲᛳᲀ:I

    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    iput-object p1, p0, Lyyds/ᲁᛶᛱᲈ;->ᛶᛷᛲᲁ:Ljava/util/concurrent/Executor;

    .line 8
    .line 9
    new-instance p1, Ljava/util/ArrayDeque;

    .line 10
    .line 11
    invoke-direct {p1}, Ljava/util/ArrayDeque;-><init>()V

    .line 12
    .line 13
    .line 14
    iput-object p1, p0, Lyyds/ᲁᛶᛱᲈ;->ᲇᲈᛵᛷ:Ljava/util/ArrayDeque;

    .line 15
    .line 16
    new-instance p1, Ljava/lang/Object;

    .line 17
    .line 18
    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    .line 19
    .line 20
    .line 21
    iput-object p1, p0, Lyyds/ᲁᛶᛱᲈ;->ᲇᲇᲇᛱ:Ljava/lang/Object;

    .line 22
    .line 23
    return-void
.end method

.method public constructor <init>(Lyyds/ᛶᛱᛷᛱ;)V
    .locals 1

    const/4 v0, 0x0

    iput v0, p0, Lyyds/ᲁᛶᛱᲈ;->ᲀᛲᛳᲀ:I

    .line 24
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 25
    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    iput-object v0, p0, Lyyds/ᲁᛶᛱᲈ;->ᲇᲇᲇᛱ:Ljava/lang/Object;

    .line 26
    new-instance v0, Ljava/util/ArrayDeque;

    invoke-direct {v0}, Ljava/util/ArrayDeque;-><init>()V

    iput-object v0, p0, Lyyds/ᲁᛶᛱᲈ;->ᲇᲈᛵᛷ:Ljava/util/ArrayDeque;

    .line 27
    iput-object p1, p0, Lyyds/ᲁᛶᛱᲈ;->ᛶᛷᛲᲁ:Ljava/util/concurrent/Executor;

    return-void
.end method


# virtual methods
.method public final execute(Ljava/lang/Runnable;)V
    .locals 4

    .line 1
    iget v0, p0, Lyyds/ᲁᛶᛱᲈ;->ᲀᛲᛳᲀ:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lyyds/ᲁᛶᛱᲈ;->ᲇᲇᲇᛱ:Ljava/lang/Object;

    .line 7
    .line 8
    monitor-enter v0

    .line 9
    :try_start_0
    iget-object v1, p0, Lyyds/ᲁᛶᛱᲈ;->ᲇᲈᛵᛷ:Ljava/util/ArrayDeque;

    .line 10
    .line 11
    new-instance v2, Lyyds/ᲈᛷᛲᛸ;

    .line 12
    .line 13
    invoke-direct {v2, p1, p0}, Lyyds/ᲈᛷᛲᛸ;-><init>(Ljava/lang/Runnable;Lyyds/ᲁᛶᛱᲈ;)V

    .line 14
    .line 15
    .line 16
    invoke-virtual {v1, v2}, Ljava/util/ArrayDeque;->offer(Ljava/lang/Object;)Z

    .line 17
    .line 18
    .line 19
    iget-object p1, p0, Lyyds/ᲁᛶᛱᲈ;->ᛲᛴᛳᛲ:Ljava/lang/Runnable;

    .line 20
    .line 21
    if-nez p1, :cond_0

    .line 22
    .line 23
    invoke-virtual {p0}, Lyyds/ᲁᛶᛱᲈ;->ᛲᲈᲁ()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 24
    .line 25
    .line 26
    goto :goto_0

    .line 27
    :catchall_0
    move-exception p0

    .line 28
    goto :goto_1

    .line 29
    :cond_0
    :goto_0
    monitor-exit v0

    .line 30
    return-void

    .line 31
    :goto_1
    monitor-exit v0

    .line 32
    throw p0

    .line 33
    :pswitch_0
    iget-object v0, p0, Lyyds/ᲁᛶᛱᲈ;->ᲇᲇᲇᛱ:Ljava/lang/Object;

    .line 34
    .line 35
    monitor-enter v0

    .line 36
    :try_start_1
    iget-object v1, p0, Lyyds/ᲁᛶᛱᲈ;->ᲇᲈᛵᛷ:Ljava/util/ArrayDeque;

    .line 37
    .line 38
    new-instance v2, Lyyds/ᲈᛷᛲᛸ;

    .line 39
    .line 40
    const/4 v3, 0x0

    .line 41
    invoke-direct {v2, p0, v3, p1}, Lyyds/ᲈᛷᛲᛸ;-><init>(Ljava/lang/Object;ILjava/lang/Object;)V

    .line 42
    .line 43
    .line 44
    invoke-virtual {v1, v2}, Ljava/util/ArrayDeque;->add(Ljava/lang/Object;)Z

    .line 45
    .line 46
    .line 47
    iget-object p1, p0, Lyyds/ᲁᛶᛱᲈ;->ᛲᛴᛳᛲ:Ljava/lang/Runnable;

    .line 48
    .line 49
    if-nez p1, :cond_1

    .line 50
    .line 51
    invoke-virtual {p0}, Lyyds/ᲁᛶᛱᲈ;->ᛲᲈᲁ()V

    .line 52
    .line 53
    .line 54
    goto :goto_2

    .line 55
    :catchall_1
    move-exception p0

    .line 56
    goto :goto_3

    .line 57
    :cond_1
    :goto_2
    monitor-exit v0

    .line 58
    return-void

    .line 59
    :goto_3
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 60
    throw p0

    .line 61
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final ᛲᲈᲁ()V
    .locals 3

    .line 1
    iget v0, p0, Lyyds/ᲁᛶᛱᲈ;->ᲀᛲᛳᲀ:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lyyds/ᲁᛶᛱᲈ;->ᲇᲇᲇᛱ:Ljava/lang/Object;

    .line 7
    .line 8
    monitor-enter v0

    .line 9
    :try_start_0
    iget-object v1, p0, Lyyds/ᲁᛶᛱᲈ;->ᲇᲈᛵᛷ:Ljava/util/ArrayDeque;

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
    iput-object v2, p0, Lyyds/ᲁᛶᛱᲈ;->ᛲᛴᛳᛲ:Ljava/lang/Runnable;

    .line 19
    .line 20
    if-eqz v1, :cond_0

    .line 21
    .line 22
    iget-object p0, p0, Lyyds/ᲁᛶᛱᲈ;->ᛶᛷᛲᲁ:Ljava/util/concurrent/Executor;

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
    iget-object v0, p0, Lyyds/ᲁᛶᛱᲈ;->ᲇᲇᲇᛱ:Ljava/lang/Object;

    .line 35
    .line 36
    monitor-enter v0

    .line 37
    :try_start_1
    iget-object v1, p0, Lyyds/ᲁᛶᛱᲈ;->ᲇᲈᛵᛷ:Ljava/util/ArrayDeque;

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
    iput-object v1, p0, Lyyds/ᲁᛶᛱᲈ;->ᛲᛴᛳᛲ:Ljava/lang/Runnable;

    .line 46
    .line 47
    if-eqz v1, :cond_1

    .line 48
    .line 49
    iget-object p0, p0, Lyyds/ᲁᛶᛱᲈ;->ᛶᛷᛲᲁ:Ljava/util/concurrent/Executor;

    .line 50
    .line 51
    check-cast p0, Lyyds/ᛶᛱᛷᛱ;

    .line 52
    .line 53
    invoke-virtual {p0, v1}, Lyyds/ᛶᛱᛷᛱ;->execute(Ljava/lang/Runnable;)V

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
