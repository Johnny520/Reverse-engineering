.class public final Lyyds/ᛷᲈᲈᛸ;
.super Lyyds/ᛲᲇᲁᛳ;
.source "r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9"


# instance fields
.field public final synthetic ᲀᛲᛳᲀ:Lyyds/ᲇᛸᲀᛳ;


# direct methods
.method public constructor <init>(Lyyds/ᲇᛸᲀᛳ;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lyyds/ᛷᲈᲈᛸ;->ᲀᛲᛳᲀ:Lyyds/ᲇᛸᲀᛳ;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final ᛱᲈᲁ(Ljava/lang/Throwable;)V
    .locals 0

    .line 1
    iget-object p0, p0, Lyyds/ᛷᲈᲈᛸ;->ᲀᛲᛳᲀ:Lyyds/ᲇᛸᲀᛳ;

    .line 2
    .line 3
    iget-object p0, p0, Lyyds/ᲇᛸᲀᛳ;->ᛲᲈᲁ:Ljava/lang/Object;

    .line 4
    .line 5
    check-cast p0, Lyyds/ᛲᛴᛶᛸ;

    .line 6
    .line 7
    invoke-virtual {p0, p1}, Lyyds/ᛲᛴᛶᛸ;->ᲇᲈᛵᛷ(Ljava/lang/Throwable;)V

    .line 8
    .line 9
    .line 10
    return-void
.end method

.method public final ᛲᛳᛶᲁ(Lyyds/ᛲᛲᲇᲈ;)V
    .locals 3

    .line 1
    iget-object p0, p0, Lyyds/ᛷᲈᲈᛸ;->ᲀᛲᛳᲀ:Lyyds/ᲇᛸᲀᛳ;

    .line 2
    .line 3
    iput-object p1, p0, Lyyds/ᲇᛸᲀᛳ;->ᲀᛲᛳᲀ:Ljava/lang/Object;

    .line 4
    .line 5
    new-instance p1, Lyyds/ᲀᲈᛶᲈ;

    .line 6
    .line 7
    iget-object v0, p0, Lyyds/ᲇᛸᲀᛳ;->ᲀᛲᛳᲀ:Ljava/lang/Object;

    .line 8
    .line 9
    check-cast v0, Lyyds/ᛲᛲᲇᲈ;

    .line 10
    .line 11
    new-instance v1, Lyyds/ᲀᛴᛱᛷ;

    .line 12
    .line 13
    const/16 v2, 0xd

    .line 14
    .line 15
    invoke-direct {v1, v2}, Lyyds/ᲀᛴᛱᛷ;-><init>(I)V

    .line 16
    .line 17
    .line 18
    iget-object v2, p0, Lyyds/ᲇᛸᲀᛳ;->ᛲᲈᲁ:Ljava/lang/Object;

    .line 19
    .line 20
    check-cast v2, Lyyds/ᛲᛴᛶᛸ;

    .line 21
    .line 22
    iget-object v2, v2, Lyyds/ᛲᛴᛶᛸ;->ᛱᲈᲁ:Lyyds/ᲇᛳᛱᲀ;

    .line 23
    .line 24
    invoke-direct {p1, v0, v1, v2}, Lyyds/ᲀᲈᛶᲈ;-><init>(Lyyds/ᛲᛲᲇᲈ;Lyyds/ᲀᛴᛱᛷ;Lyyds/ᲇᛳᛱᲀ;)V

    .line 25
    .line 26
    .line 27
    iput-object p1, p0, Lyyds/ᲇᛸᲀᛳ;->ᛵᛸᛸᛷ:Ljava/lang/Object;

    .line 28
    .line 29
    iget-object p0, p0, Lyyds/ᲇᛸᲀᛳ;->ᛲᲈᲁ:Ljava/lang/Object;

    .line 30
    .line 31
    check-cast p0, Lyyds/ᛲᛴᛶᛸ;

    .line 32
    .line 33
    new-instance p1, Ljava/util/ArrayList;

    .line 34
    .line 35
    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    .line 36
    .line 37
    .line 38
    iget-object v0, p0, Lyyds/ᛲᛴᛶᛸ;->ᛲᲈᲁ:Ljava/util/concurrent/locks/ReentrantReadWriteLock;

    .line 39
    .line 40
    invoke-virtual {v0}, Ljava/util/concurrent/locks/ReentrantReadWriteLock;->writeLock()Ljava/util/concurrent/locks/Lock;

    .line 41
    .line 42
    .line 43
    move-result-object v0

    .line 44
    invoke-interface {v0}, Ljava/util/concurrent/locks/Lock;->lock()V

    .line 45
    .line 46
    .line 47
    const/4 v0, 0x1

    .line 48
    :try_start_0
    iput v0, p0, Lyyds/ᛲᛴᛶᛸ;->ᲀᛲᛳᲀ:I

    .line 49
    .line 50
    iget-object v0, p0, Lyyds/ᛲᛴᛶᛸ;->ᛵᛸᛸᛷ:Lyyds/ᲀᛳᛸᛴ;

    .line 51
    .line 52
    invoke-virtual {p1, v0}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 53
    .line 54
    .line 55
    iget-object v0, p0, Lyyds/ᛲᛴᛶᛸ;->ᛵᛸᛸᛷ:Lyyds/ᲀᛳᛸᛴ;

    .line 56
    .line 57
    invoke-virtual {v0}, Lyyds/ᲀᛳᛸᛴ;->clear()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 58
    .line 59
    .line 60
    iget-object v0, p0, Lyyds/ᛲᛴᛶᛸ;->ᛲᲈᲁ:Ljava/util/concurrent/locks/ReentrantReadWriteLock;

    .line 61
    .line 62
    invoke-virtual {v0}, Ljava/util/concurrent/locks/ReentrantReadWriteLock;->writeLock()Ljava/util/concurrent/locks/Lock;

    .line 63
    .line 64
    .line 65
    move-result-object v0

    .line 66
    invoke-interface {v0}, Ljava/util/concurrent/locks/Lock;->unlock()V

    .line 67
    .line 68
    .line 69
    iget-object v0, p0, Lyyds/ᛲᛴᛶᛸ;->ᲇᲈᛵᛷ:Landroid/os/Handler;

    .line 70
    .line 71
    new-instance v1, Lyyds/ᛶᲁᛲᛳ;

    .line 72
    .line 73
    iget p0, p0, Lyyds/ᛲᛴᛶᛸ;->ᲀᛲᛳᲀ:I

    .line 74
    .line 75
    const/4 v2, 0x0

    .line 76
    invoke-direct {v1, p1, p0, v2}, Lyyds/ᛶᲁᛲᛳ;-><init>(Ljava/util/List;ILjava/lang/Throwable;)V

    .line 77
    .line 78
    .line 79
    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 80
    .line 81
    .line 82
    return-void

    .line 83
    :catchall_0
    move-exception p1

    .line 84
    iget-object p0, p0, Lyyds/ᛲᛴᛶᛸ;->ᛲᲈᲁ:Ljava/util/concurrent/locks/ReentrantReadWriteLock;

    .line 85
    .line 86
    invoke-virtual {p0}, Ljava/util/concurrent/locks/ReentrantReadWriteLock;->writeLock()Ljava/util/concurrent/locks/Lock;

    .line 87
    .line 88
    .line 89
    move-result-object p0

    .line 90
    invoke-interface {p0}, Ljava/util/concurrent/locks/Lock;->unlock()V

    .line 91
    .line 92
    .line 93
    throw p1
.end method
