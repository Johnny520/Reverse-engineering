.class public final Lai;
.super Lgf;


# instance fields
.field public final synthetic y:Lbi;


# direct methods
.method public constructor <init>(Lbi;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lai;->y:Lbi;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final J(Ljava/lang/Throwable;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lai;->y:Lbi;

    .line 2
    .line 3
    iget-object v0, v0, Lbi;->a:Lgi;

    .line 4
    .line 5
    invoke-virtual {v0, p1}, Lgi;->d(Ljava/lang/Throwable;)V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public final M(Lk8;)V
    .locals 4

    .line 1
    iget-object v0, p0, Lai;->y:Lbi;

    .line 2
    .line 3
    iput-object p1, v0, Lbi;->c:Lk8;

    .line 4
    .line 5
    new-instance p1, Ld4;

    .line 6
    .line 7
    iget-object v1, v0, Lbi;->c:Lk8;

    .line 8
    .line 9
    new-instance v2, Lxh;

    .line 10
    .line 11
    const/16 v3, 0x13

    .line 12
    .line 13
    invoke-direct {v2, v3}, Lxh;-><init>(I)V

    .line 14
    .line 15
    .line 16
    iget-object v3, v0, Lbi;->a:Lgi;

    .line 17
    .line 18
    iget-object v3, v3, Lgi;->h:Lnf;

    .line 19
    .line 20
    invoke-direct {p1, v1, v2, v3}, Ld4;-><init>(Lk8;Lxh;Lnf;)V

    .line 21
    .line 22
    .line 23
    iput-object p1, v0, Lbi;->b:Ld4;

    .line 24
    .line 25
    iget-object p1, v0, Lbi;->a:Lgi;

    .line 26
    .line 27
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 28
    .line 29
    .line 30
    new-instance v0, Ljava/util/ArrayList;

    .line 31
    .line 32
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 33
    .line 34
    .line 35
    iget-object v1, p1, Lgi;->a:Ljava/util/concurrent/locks/ReentrantReadWriteLock;

    .line 36
    .line 37
    invoke-virtual {v1}, Ljava/util/concurrent/locks/ReentrantReadWriteLock;->writeLock()Ljava/util/concurrent/locks/Lock;

    .line 38
    .line 39
    .line 40
    move-result-object v1

    .line 41
    invoke-interface {v1}, Ljava/util/concurrent/locks/Lock;->lock()V

    .line 42
    .line 43
    .line 44
    const/4 v1, 0x1

    .line 45
    :try_start_0
    iput v1, p1, Lgi;->c:I

    .line 46
    .line 47
    iget-object v1, p1, Lgi;->b:Lq6;

    .line 48
    .line 49
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 50
    .line 51
    .line 52
    iget-object v1, p1, Lgi;->b:Lq6;

    .line 53
    .line 54
    invoke-virtual {v1}, Lq6;->clear()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 55
    .line 56
    .line 57
    iget-object v1, p1, Lgi;->a:Ljava/util/concurrent/locks/ReentrantReadWriteLock;

    .line 58
    .line 59
    invoke-virtual {v1}, Ljava/util/concurrent/locks/ReentrantReadWriteLock;->writeLock()Ljava/util/concurrent/locks/Lock;

    .line 60
    .line 61
    .line 62
    move-result-object v1

    .line 63
    invoke-interface {v1}, Ljava/util/concurrent/locks/Lock;->unlock()V

    .line 64
    .line 65
    .line 66
    iget-object v1, p1, Lgi;->d:Landroid/os/Handler;

    .line 67
    .line 68
    new-instance v2, Lo8;

    .line 69
    .line 70
    iget p1, p1, Lgi;->c:I

    .line 71
    .line 72
    const/4 v3, 0x0

    .line 73
    invoke-direct {v2, v0, p1, v3}, Lo8;-><init>(Ljava/util/List;ILjava/lang/Throwable;)V

    .line 74
    .line 75
    .line 76
    invoke-virtual {v1, v2}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 77
    .line 78
    .line 79
    return-void

    .line 80
    :catchall_0
    move-exception v0

    .line 81
    iget-object p1, p1, Lgi;->a:Ljava/util/concurrent/locks/ReentrantReadWriteLock;

    .line 82
    .line 83
    invoke-virtual {p1}, Ljava/util/concurrent/locks/ReentrantReadWriteLock;->writeLock()Ljava/util/concurrent/locks/Lock;

    .line 84
    .line 85
    .line 86
    move-result-object p1

    .line 87
    invoke-interface {p1}, Ljava/util/concurrent/locks/Lock;->unlock()V

    .line 88
    .line 89
    .line 90
    throw v0
.end method
