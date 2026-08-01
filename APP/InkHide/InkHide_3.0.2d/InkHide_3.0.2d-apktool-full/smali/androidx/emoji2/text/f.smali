.class public final Landroidx/emoji2/text/f;
.super LD/h;
.source "SourceFile"


# instance fields
.field public final synthetic d:Landroidx/emoji2/text/g;


# direct methods
.method public constructor <init>(Landroidx/emoji2/text/g;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Landroidx/emoji2/text/f;->d:Landroidx/emoji2/text/g;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final F(Ljava/lang/Throwable;)V
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/emoji2/text/f;->d:Landroidx/emoji2/text/g;

    .line 2
    .line 3
    iget-object v0, v0, Landroidx/emoji2/text/g;->a:Landroidx/emoji2/text/k;

    .line 4
    .line 5
    invoke-virtual {v0, p1}, Landroidx/emoji2/text/k;->d(Ljava/lang/Throwable;)V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public final I(Landroidx/emoji2/text/s;)V
    .locals 4

    .line 1
    iget-object v0, p0, Landroidx/emoji2/text/f;->d:Landroidx/emoji2/text/g;

    .line 2
    .line 3
    iput-object p1, v0, Landroidx/emoji2/text/g;->c:Landroidx/emoji2/text/s;

    .line 4
    .line 5
    new-instance p1, LH/a;

    .line 6
    .line 7
    iget-object v1, v0, Landroidx/emoji2/text/g;->c:Landroidx/emoji2/text/s;

    .line 8
    .line 9
    new-instance v2, LG/d;

    .line 10
    .line 11
    const/16 v3, 0x12

    .line 12
    .line 13
    invoke-direct {v2, v3}, LG/d;-><init>(I)V

    .line 14
    .line 15
    .line 16
    iget-object v2, v0, Landroidx/emoji2/text/g;->a:Landroidx/emoji2/text/k;

    .line 17
    .line 18
    iget-object v2, v2, Landroidx/emoji2/text/k;->h:Landroidx/emoji2/text/e;

    .line 19
    .line 20
    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    .line 21
    .line 22
    .line 23
    iput-object v1, p1, LH/a;->b:Ljava/lang/Object;

    .line 24
    .line 25
    iput-object v2, p1, LH/a;->c:Ljava/lang/Object;

    .line 26
    .line 27
    iput-object p1, v0, Landroidx/emoji2/text/g;->b:LH/a;

    .line 28
    .line 29
    iget-object p1, v0, Landroidx/emoji2/text/g;->a:Landroidx/emoji2/text/k;

    .line 30
    .line 31
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 32
    .line 33
    .line 34
    new-instance v0, Ljava/util/ArrayList;

    .line 35
    .line 36
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 37
    .line 38
    .line 39
    iget-object v1, p1, Landroidx/emoji2/text/k;->a:Ljava/util/concurrent/locks/ReentrantReadWriteLock;

    .line 40
    .line 41
    invoke-virtual {v1}, Ljava/util/concurrent/locks/ReentrantReadWriteLock;->writeLock()Ljava/util/concurrent/locks/Lock;

    .line 42
    .line 43
    .line 44
    move-result-object v1

    .line 45
    invoke-interface {v1}, Ljava/util/concurrent/locks/Lock;->lock()V

    .line 46
    .line 47
    .line 48
    const/4 v1, 0x1

    .line 49
    :try_start_0
    iput v1, p1, Landroidx/emoji2/text/k;->c:I

    .line 50
    .line 51
    iget-object v1, p1, Landroidx/emoji2/text/k;->b:Ll/c;

    .line 52
    .line 53
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 54
    .line 55
    .line 56
    iget-object v1, p1, Landroidx/emoji2/text/k;->b:Ll/c;

    .line 57
    .line 58
    invoke-virtual {v1}, Ll/c;->clear()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 59
    .line 60
    .line 61
    iget-object v1, p1, Landroidx/emoji2/text/k;->a:Ljava/util/concurrent/locks/ReentrantReadWriteLock;

    .line 62
    .line 63
    invoke-virtual {v1}, Ljava/util/concurrent/locks/ReentrantReadWriteLock;->writeLock()Ljava/util/concurrent/locks/Lock;

    .line 64
    .line 65
    .line 66
    move-result-object v1

    .line 67
    invoke-interface {v1}, Ljava/util/concurrent/locks/Lock;->unlock()V

    .line 68
    .line 69
    .line 70
    iget-object v1, p1, Landroidx/emoji2/text/k;->d:Landroid/os/Handler;

    .line 71
    .line 72
    new-instance v2, Landroidx/emoji2/text/i;

    .line 73
    .line 74
    iget p1, p1, Landroidx/emoji2/text/k;->c:I

    .line 75
    .line 76
    const/4 v3, 0x0

    .line 77
    invoke-direct {v2, v0, p1, v3}, Landroidx/emoji2/text/i;-><init>(Ljava/util/List;ILjava/lang/Throwable;)V

    .line 78
    .line 79
    .line 80
    invoke-virtual {v1, v2}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 81
    .line 82
    .line 83
    return-void

    .line 84
    :catchall_0
    move-exception v0

    .line 85
    iget-object p1, p1, Landroidx/emoji2/text/k;->a:Ljava/util/concurrent/locks/ReentrantReadWriteLock;

    .line 86
    .line 87
    invoke-virtual {p1}, Ljava/util/concurrent/locks/ReentrantReadWriteLock;->writeLock()Ljava/util/concurrent/locks/Lock;

    .line 88
    .line 89
    .line 90
    move-result-object p1

    .line 91
    invoke-interface {p1}, Ljava/util/concurrent/locks/Lock;->unlock()V

    .line 92
    .line 93
    .line 94
    throw v0
.end method
