.class public final Lr8/e;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"


# static fields
.field public static final a:Landroid/os/Handler;

.field public static final b:Ljava/util/concurrent/ConcurrentHashMap;

.field public static final c:Ljava/util/concurrent/atomic/AtomicInteger;

.field public static final d:Ljava/lang/Object;

.field public static final e:Ljava/util/concurrent/ExecutorService;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Landroid/os/Handler;

    .line 2
    .line 3
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    invoke-direct {v0, v1}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    .line 8
    .line 9
    .line 10
    sput-object v0, Lr8/e;->a:Landroid/os/Handler;

    .line 11
    .line 12
    new-instance v0, Ljava/util/concurrent/ConcurrentHashMap;

    .line 13
    .line 14
    invoke-direct {v0}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    .line 15
    .line 16
    .line 17
    sput-object v0, Lr8/e;->b:Ljava/util/concurrent/ConcurrentHashMap;

    .line 18
    .line 19
    new-instance v0, Ljava/util/concurrent/atomic/AtomicInteger;

    .line 20
    .line 21
    const/4 v1, 0x0

    .line 22
    invoke-direct {v0, v1}, Ljava/util/concurrent/atomic/AtomicInteger;-><init>(I)V

    .line 23
    .line 24
    .line 25
    sput-object v0, Lr8/e;->c:Ljava/util/concurrent/atomic/AtomicInteger;

    .line 26
    .line 27
    new-instance v0, Ljava/lang/Object;

    .line 28
    .line 29
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 30
    .line 31
    .line 32
    sput-object v0, Lr8/e;->d:Ljava/lang/Object;

    .line 33
    .line 34
    new-instance v0, Lc9/q;

    .line 35
    .line 36
    const/16 v1, 0x17

    .line 37
    .line 38
    invoke-direct {v0, v1}, Lc9/q;-><init>(I)V

    .line 39
    .line 40
    .line 41
    invoke-static {v0}, Ljava/util/concurrent/Executors;->newSingleThreadExecutor(Ljava/util/concurrent/ThreadFactory;)Ljava/util/concurrent/ExecutorService;

    .line 42
    .line 43
    .line 44
    move-result-object v0

    .line 45
    sput-object v0, Lr8/e;->e:Ljava/util/concurrent/ExecutorService;

    .line 46
    .line 47
    return-void
.end method

.method public static a(Lr8/c;)V
    .locals 3

    .line 1
    :cond_0
    sget-object v0, Lr8/e;->c:Ljava/util/concurrent/atomic/AtomicInteger;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicInteger;->get()I

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    iget v2, p0, Lr8/c;->g:I

    .line 8
    .line 9
    if-lt v1, v2, :cond_1

    .line 10
    .line 11
    goto :goto_0

    .line 12
    :cond_1
    invoke-virtual {v0, v1, v2}, Ljava/util/concurrent/atomic/AtomicInteger;->compareAndSet(II)Z

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    if-eqz v0, :cond_0

    .line 17
    .line 18
    :goto_0
    sget-object p0, Lr8/e;->b:Ljava/util/concurrent/ConcurrentHashMap;

    .line 19
    .line 20
    invoke-virtual {p0}, Ljava/util/concurrent/ConcurrentHashMap;->entrySet()Ljava/util/Set;

    .line 21
    .line 22
    .line 23
    move-result-object p0

    .line 24
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 25
    .line 26
    .line 27
    check-cast p0, Ljava/lang/Iterable;

    .line 28
    .line 29
    new-instance v0, Ldg/n;

    .line 30
    .line 31
    const/4 v1, 0x6

    .line 32
    invoke-direct {v0, p0, v1}, Ldg/n;-><init>(Ljava/lang/Object;I)V

    .line 33
    .line 34
    .line 35
    new-instance p0, Lo9/e;

    .line 36
    .line 37
    const/16 v1, 0x1d

    .line 38
    .line 39
    invoke-direct {p0, v1}, Lo9/e;-><init>(I)V

    .line 40
    .line 41
    .line 42
    new-instance v1, Lng/i;

    .line 43
    .line 44
    const/4 v2, 0x1

    .line 45
    invoke-direct {v1, v0, v2, p0}, Lng/i;-><init>(Lng/j;ZLfg/l;)V

    .line 46
    .line 47
    .line 48
    new-instance p0, Lr4/m;

    .line 49
    .line 50
    const/4 v0, 0x3

    .line 51
    invoke-direct {p0, v0}, Lr4/m;-><init>(I)V

    .line 52
    .line 53
    .line 54
    new-instance v0, Lc9/a0;

    .line 55
    .line 56
    const/16 v2, 0x1a

    .line 57
    .line 58
    invoke-direct {v0, p0, v2}, Lc9/a0;-><init>(Ljava/lang/Object;I)V

    .line 59
    .line 60
    .line 61
    new-instance p0, Lc9/a0;

    .line 62
    .line 63
    const/16 v2, 0x1b

    .line 64
    .line 65
    invoke-direct {p0, v0, v2}, Lc9/a0;-><init>(Ljava/lang/Object;I)V

    .line 66
    .line 67
    .line 68
    new-instance v0, Ljava/util/ArrayList;

    .line 69
    .line 70
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 71
    .line 72
    .line 73
    invoke-static {v1, v0}, Lng/m;->a0(Lng/j;Ljava/util/AbstractCollection;)V

    .line 74
    .line 75
    .line 76
    invoke-static {v0, p0}, Ltf/q;->g1(Ljava/util/List;Ljava/util/Comparator;)V

    .line 77
    .line 78
    .line 79
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 80
    .line 81
    .line 82
    move-result-object p0

    .line 83
    :goto_1
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 84
    .line 85
    .line 86
    move-result v0

    .line 87
    if-eqz v0, :cond_2

    .line 88
    .line 89
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 90
    .line 91
    .line 92
    move-result-object v0

    .line 93
    check-cast v0, Ljava/util/Map$Entry;

    .line 94
    .line 95
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 96
    .line 97
    .line 98
    invoke-interface {v0}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 99
    .line 100
    .line 101
    move-result-object v1

    .line 102
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 103
    .line 104
    .line 105
    check-cast v1, Ljava/lang/String;

    .line 106
    .line 107
    invoke-interface {v0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 108
    .line 109
    .line 110
    move-result-object v0

    .line 111
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 112
    .line 113
    .line 114
    check-cast v0, Lr8/d;

    .line 115
    .line 116
    invoke-static {v1, v0}, Lr8/e;->d(Ljava/lang/String;Lr8/d;)V

    .line 117
    .line 118
    .line 119
    goto :goto_1

    .line 120
    :cond_2
    return-void
.end method

.method public static b(Lr8/c;)Z
    .locals 1

    .line 1
    sget-object v0, Lr8/e;->c:Ljava/util/concurrent/atomic/AtomicInteger;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicInteger;->get()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    iget p0, p0, Lr8/c;->g:I

    .line 8
    .line 9
    if-lt v0, p0, :cond_0

    .line 10
    .line 11
    const/4 p0, 0x1

    .line 12
    return p0

    .line 13
    :cond_0
    const/4 p0, 0x0

    .line 14
    return p0
.end method

.method public static final c(Ljava/lang/Runnable;)V
    .locals 1

    .line 1
    sget-object v0, Lr8/e;->d:Ljava/lang/Object;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    invoke-interface {p0}, Ljava/lang/Runnable;->run()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 5
    .line 6
    .line 7
    monitor-exit v0

    .line 8
    return-void

    .line 9
    :catchall_0
    move-exception p0

    .line 10
    monitor-exit v0

    .line 11
    throw p0
.end method

.method public static d(Ljava/lang/String;Lr8/d;)V
    .locals 4

    .line 1
    iget-object v0, p1, Lr8/d;->b:Lr8/c;

    .line 2
    .line 3
    invoke-static {v0}, Lr8/e;->b(Lr8/c;)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    goto :goto_0

    .line 10
    :cond_0
    iget-object v0, p1, Lr8/d;->e:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 11
    .line 12
    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    if-eqz v0, :cond_1

    .line 17
    .line 18
    goto :goto_0

    .line 19
    :cond_1
    iget-object v0, p1, Lr8/d;->d:Lfg/a;

    .line 20
    .line 21
    if-eqz v0, :cond_3

    .line 22
    .line 23
    iget-object v1, p1, Lr8/d;->f:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 24
    .line 25
    const/4 v2, 0x0

    .line 26
    const/4 v3, 0x1

    .line 27
    invoke-virtual {v1, v2, v3}, Ljava/util/concurrent/atomic/AtomicBoolean;->compareAndSet(ZZ)Z

    .line 28
    .line 29
    .line 30
    move-result v1

    .line 31
    if-nez v1, :cond_2

    .line 32
    .line 33
    goto :goto_0

    .line 34
    :cond_2
    sget-object v1, Lr8/e;->e:Ljava/util/concurrent/ExecutorService;

    .line 35
    .line 36
    new-instance v2, Lr8/b;

    .line 37
    .line 38
    const/4 v3, 0x0

    .line 39
    invoke-direct {v2, p1, p0, v0, v3}, Lr8/b;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 40
    .line 41
    .line 42
    invoke-interface {v1, v2}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    .line 43
    .line 44
    .line 45
    :cond_3
    :goto_0
    return-void
.end method

.method public static e(ILfg/a;Ljava/lang/String;Ljava/lang/String;Lr8/c;)V
    .locals 4

    .line 1
    invoke-virtual {p4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-static {p2}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 5
    .line 6
    .line 7
    move-result v0

    .line 8
    if-eqz v0, :cond_0

    .line 9
    .line 10
    goto :goto_0

    .line 11
    :cond_0
    sget-object v0, Lr8/e;->b:Ljava/util/concurrent/ConcurrentHashMap;

    .line 12
    .line 13
    new-instance v1, Lca/s;

    .line 14
    .line 15
    const/16 v2, 0x10

    .line 16
    .line 17
    invoke-direct {v1, p3, v2}, Lca/s;-><init>(Ljava/lang/String;I)V

    .line 18
    .line 19
    .line 20
    new-instance v2, Lbc/j;

    .line 21
    .line 22
    const/16 v3, 0xc

    .line 23
    .line 24
    invoke-direct {v2, v1, v3}, Lbc/j;-><init>(Ljava/lang/Object;I)V

    .line 25
    .line 26
    .line 27
    invoke-virtual {v0, p2, v2}, Ljava/util/concurrent/ConcurrentHashMap;->computeIfAbsent(Ljava/lang/Object;Ljava/util/function/Function;)Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    move-result-object v0

    .line 31
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 32
    .line 33
    .line 34
    check-cast v0, Lr8/d;

    .line 35
    .line 36
    iput-object p3, v0, Lr8/d;->a:Ljava/lang/String;

    .line 37
    .line 38
    iput-object p4, v0, Lr8/d;->b:Lr8/c;

    .line 39
    .line 40
    iput p0, v0, Lr8/d;->c:I

    .line 41
    .line 42
    iput-object p1, v0, Lr8/d;->d:Lfg/a;

    .line 43
    .line 44
    invoke-static {p4}, Lr8/e;->b(Lr8/c;)Z

    .line 45
    .line 46
    .line 47
    move-result p0

    .line 48
    if-nez p0, :cond_1

    .line 49
    .line 50
    :goto_0
    return-void

    .line 51
    :cond_1
    iget-object p0, v0, Lr8/d;->e:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 52
    .line 53
    invoke-virtual {p0}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    .line 54
    .line 55
    .line 56
    move-result p0

    .line 57
    if-nez p0, :cond_2

    .line 58
    .line 59
    iget-object p0, v0, Lr8/d;->f:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 60
    .line 61
    invoke-virtual {p0}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    .line 62
    .line 63
    .line 64
    move-result p0

    .line 65
    if-nez p0, :cond_2

    .line 66
    .line 67
    iget-object p0, v0, Lr8/d;->g:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 68
    .line 69
    invoke-virtual {p0}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    .line 70
    .line 71
    .line 72
    move-result p0

    .line 73
    if-nez p0, :cond_2

    .line 74
    .line 75
    iget-object p0, v0, Lr8/d;->h:Ljava/util/concurrent/atomic/AtomicInteger;

    .line 76
    .line 77
    invoke-virtual {p0}, Ljava/util/concurrent/atomic/AtomicInteger;->get()I

    .line 78
    .line 79
    .line 80
    move-result p0

    .line 81
    const/4 p1, 0x6

    .line 82
    if-lt p0, p1, :cond_2

    .line 83
    .line 84
    iget-object p0, v0, Lr8/d;->h:Ljava/util/concurrent/atomic/AtomicInteger;

    .line 85
    .line 86
    const/4 p1, 0x0

    .line 87
    invoke-virtual {p0, p1}, Ljava/util/concurrent/atomic/AtomicInteger;->set(I)V

    .line 88
    .line 89
    .line 90
    :cond_2
    invoke-static {p2, v0}, Lr8/e;->d(Ljava/lang/String;Lr8/d;)V

    .line 91
    .line 92
    .line 93
    return-void
.end method

.method public static synthetic f(ILfg/a;Ljava/lang/String;Ljava/lang/String;Lr8/c;)V
    .locals 1

    .line 1
    and-int/lit8 v0, p0, 0x4

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    sget-object p4, Lr8/c;->i:Lr8/c;

    .line 6
    .line 7
    :cond_0
    and-int/lit8 p0, p0, 0x8

    .line 8
    .line 9
    if-eqz p0, :cond_1

    .line 10
    .line 11
    const/4 p0, 0x0

    .line 12
    goto :goto_0

    .line 13
    :cond_1
    const/16 p0, -0x64

    .line 14
    .line 15
    :goto_0
    invoke-static {p0, p1, p2, p3, p4}, Lr8/e;->e(ILfg/a;Ljava/lang/String;Ljava/lang/String;Lr8/c;)V

    .line 16
    .line 17
    .line 18
    return-void
.end method
