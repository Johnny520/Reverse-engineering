.class public final Lxhss/ᛸᲇᲇᛶ;
.super Ljava/lang/Object;
.source "r8-map-id-684deb5fba33a691397d1324861b0a91cfdff049bb058f400176b68a1f4afccc"

# interfaces
.implements Ljava/lang/Cloneable;


# instance fields
.field public final ᛱᛱᛲᲇ:Lxhss/ᛵᛸᛷᛲ;

.field public final ᛳᛶᛷᲀ:Ljava/util/concurrent/CopyOnWriteArrayList;

.field public final ᛳᲁᲇᛸ:Lxhss/ᛴᛴᛴᛵ;

.field public ᛳᲈᲈᛲ:Z

.field public volatile ᛴᲈᛱᛴ:Lxhss/ᲇᛸᛵᛴ;

.field public ᛶᲇᲈᛸ:Z

.field public volatile ᛷᛴᛷᛱ:Lxhss/ᲀᲀᛱᲇ;

.field public ᛷᲁᲁ:Lxhss/ᲇᛸᛵᛴ;

.field public volatile ᛸᛲᛷᛱ:Z

.field public ᛸᛲᲀᛵ:Lxhss/ᛵᲇᛷᲀ;

.field public ᛸᛴᛶᛳ:Landroid/util/CloseGuard;

.field public ᛸᛶᛴᲈ:Z

.field public ᛸᛶᲈᛶ:Z

.field public ᛸᛷᲈᲈ:Lxhss/ᲈᲁᛲᲇ;

.field public final ᲀᲇᛳᲁ:Ljava/util/concurrent/atomic/AtomicBoolean;

.field public final ᲇᛴᲇᛵ:Lxhss/ᲈᛲᲀᛵ;

.field public final ᲇᛶᛴᲀ:Lxhss/ᲈᲁᛶᛱ;

.field public ᲇᛸᛳᲁ:Z

.field public ᲈᛳᲀ:Z


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 1
    const-class v0, Lxhss/ᲀᲀᛱᲇ;

    .line 2
    .line 3
    const-string v1, "\u16f7\u16f4\u16f7\u16f1"

    .line 4
    .line 5
    const-class v2, Lxhss/ᛸᲇᲇᛶ;

    .line 6
    .line 7
    invoke-static {v2, v0, v1}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->newUpdater(Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/String;)Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    .line 8
    .line 9
    .line 10
    return-void
.end method

.method public constructor <init>(Lxhss/ᛵᛸᛷᛲ;Lxhss/ᛴᛴᛴᛵ;)V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lxhss/ᛸᲇᲇᛶ;->ᛱᛱᛲᲇ:Lxhss/ᛵᛸᛷᛲ;

    .line 5
    .line 6
    iput-object p2, p0, Lxhss/ᛸᲇᲇᛶ;->ᛳᲁᲇᛸ:Lxhss/ᛴᛴᛴᛵ;

    .line 7
    .line 8
    iget-object v0, p1, Lxhss/ᛵᛸᛷᛲ;->ᛲᛴᲇᛲ:Lxhss/ᲇᛵᛲᲁ;

    .line 9
    .line 10
    iget-object v0, v0, Lxhss/ᲇᛵᛲᲁ;->ᛳᲁᲇᛸ:Ljava/lang/Object;

    .line 11
    .line 12
    check-cast v0, Lxhss/ᲈᛲᲀᛵ;

    .line 13
    .line 14
    iput-object v0, p0, Lxhss/ᛸᲇᲇᛶ;->ᲇᛴᲇᛵ:Lxhss/ᲈᛲᲀᛵ;

    .line 15
    .line 16
    iget-object p1, p1, Lxhss/ᛵᛸᛷᛲ;->ᲇᛴᲇᛵ:Lxhss/ᛴᛳᲀᛷ;

    .line 17
    .line 18
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 19
    .line 20
    .line 21
    sget-object p1, Lxhss/ᲀᲀᛱᲇ;->ᛷᛵᛵᲈ:Lxhss/ᛴᛸᛳᛱ;

    .line 22
    .line 23
    iput-object p1, p0, Lxhss/ᛸᲇᲇᛶ;->ᛷᛴᛷᛱ:Lxhss/ᲀᲀᛱᲇ;

    .line 24
    .line 25
    new-instance p1, Lxhss/ᲈᲁᛶᛱ;

    .line 26
    .line 27
    invoke-direct {p1, p0}, Lxhss/ᲈᲁᛶᛱ;-><init>(Lxhss/ᛸᲇᲇᛶ;)V

    .line 28
    .line 29
    .line 30
    const-wide/16 v0, 0x0

    .line 31
    .line 32
    invoke-virtual {p1, v0, v1}, Lxhss/ᛲᲁᲈᛲ;->ᲀᲇᛳᲁ(J)Lxhss/ᛲᲁᲈᛲ;

    .line 33
    .line 34
    .line 35
    iput-object p1, p0, Lxhss/ᛸᲇᲇᛶ;->ᲇᛶᛴᲀ:Lxhss/ᲈᲁᛶᛱ;

    .line 36
    .line 37
    new-instance p1, Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 38
    .line 39
    invoke-direct {p1}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>()V

    .line 40
    .line 41
    .line 42
    iput-object p1, p0, Lxhss/ᛸᲇᲇᛶ;->ᲀᲇᛳᲁ:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 43
    .line 44
    const/4 p1, 0x1

    .line 45
    iput-boolean p1, p0, Lxhss/ᛸᲇᲇᛶ;->ᛸᛶᛴᲈ:Z

    .line 46
    .line 47
    new-instance p1, Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 48
    .line 49
    invoke-direct {p1}, Ljava/util/concurrent/CopyOnWriteArrayList;-><init>()V

    .line 50
    .line 51
    .line 52
    iput-object p1, p0, Lxhss/ᛸᲇᲇᛶ;->ᛳᛶᛷᲀ:Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 53
    .line 54
    new-instance p0, Ljava/util/concurrent/atomic/AtomicReference;

    .line 55
    .line 56
    iget-object p1, p2, Lxhss/ᛴᛴᛴᛵ;->ᛷᛴᛷᛱ:Ljava/lang/Object;

    .line 57
    .line 58
    check-cast p1, Lxhss/ᛳᛴᲀᲁ;

    .line 59
    .line 60
    invoke-direct {p0, p1}, Ljava/util/concurrent/atomic/AtomicReference;-><init>(Ljava/lang/Object;)V

    .line 61
    .line 62
    .line 63
    return-void
.end method


# virtual methods
.method public final clone()Ljava/lang/Object;
    .locals 2

    .line 1
    new-instance v0, Lxhss/ᛸᲇᲇᛶ;

    .line 2
    .line 3
    iget-object v1, p0, Lxhss/ᛸᲇᲇᛶ;->ᛱᛱᛲᲇ:Lxhss/ᛵᛸᛷᛲ;

    .line 4
    .line 5
    iget-object p0, p0, Lxhss/ᛸᲇᲇᛶ;->ᛳᲁᲇᛸ:Lxhss/ᛴᛴᛴᛵ;

    .line 6
    .line 7
    invoke-direct {v0, v1, p0}, Lxhss/ᛸᲇᲇᛶ;-><init>(Lxhss/ᛵᛸᛷᛲ;Lxhss/ᛴᛴᛴᛵ;)V

    .line 8
    .line 9
    .line 10
    return-object v0
.end method

.method public final ᛱᛱᛲᲇ(Ljava/io/IOException;)Ljava/io/IOException;
    .locals 2

    .line 1
    sget-object v0, Lxhss/ᛶᛴᲀᛲ;->ᛷᛵᛵᲈ:Ljava/util/TimeZone;

    .line 2
    .line 3
    iget-object v0, p0, Lxhss/ᛸᲇᲇᛶ;->ᛸᛷᲈᲈ:Lxhss/ᲈᲁᛲᲇ;

    .line 4
    .line 5
    if-eqz v0, :cond_3

    .line 6
    .line 7
    monitor-enter v0

    .line 8
    :try_start_0
    invoke-virtual {p0}, Lxhss/ᛸᲇᲇᛶ;->ᛸᛴᛶᛳ()Ljava/net/Socket;

    .line 9
    .line 10
    .line 11
    move-result-object v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 12
    monitor-exit v0

    .line 13
    iget-object v0, p0, Lxhss/ᛸᲇᲇᛶ;->ᛸᛷᲈᲈ:Lxhss/ᲈᲁᛲᲇ;

    .line 14
    .line 15
    if-nez v0, :cond_1

    .line 16
    .line 17
    if-eqz v1, :cond_0

    .line 18
    .line 19
    invoke-static {v1}, Lxhss/ᛶᛴᲀᛲ;->ᛳᲁᲇᛸ(Ljava/net/Socket;)V

    .line 20
    .line 21
    .line 22
    :cond_0
    iget-object v0, p0, Lxhss/ᛸᲇᲇᛶ;->ᛷᛴᛷᛱ:Lxhss/ᲀᲀᛱᲇ;

    .line 23
    .line 24
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 25
    .line 26
    .line 27
    goto :goto_0

    .line 28
    :cond_1
    if-nez v1, :cond_2

    .line 29
    .line 30
    goto :goto_0

    .line 31
    :cond_2
    const-string p0, "Check failed."

    .line 32
    .line 33
    invoke-static {p0}, Lxhss/ᛵᲈᲁᲈ;->ᛶᲇᲈᛸ(Ljava/lang/String;)V

    .line 34
    .line 35
    .line 36
    const/4 p0, 0x0

    .line 37
    return-object p0

    .line 38
    :catchall_0
    move-exception p0

    .line 39
    monitor-exit v0

    .line 40
    throw p0

    .line 41
    :cond_3
    :goto_0
    iget-boolean v0, p0, Lxhss/ᛸᲇᲇᛶ;->ᲈᛳᲀ:Z

    .line 42
    .line 43
    if-eqz v0, :cond_4

    .line 44
    .line 45
    goto :goto_1

    .line 46
    :cond_4
    iget-object v0, p0, Lxhss/ᛸᲇᲇᛶ;->ᲇᛶᛴᲀ:Lxhss/ᲈᲁᛶᛱ;

    .line 47
    .line 48
    invoke-virtual {v0}, Lxhss/ᲈᲀᲇᛶ;->ᛸᛲᲀᛵ()Z

    .line 49
    .line 50
    .line 51
    move-result v0

    .line 52
    if-nez v0, :cond_5

    .line 53
    .line 54
    :goto_1
    move-object v0, p1

    .line 55
    goto :goto_2

    .line 56
    :cond_5
    new-instance v0, Ljava/io/InterruptedIOException;

    .line 57
    .line 58
    const-string v1, "timeout"

    .line 59
    .line 60
    invoke-direct {v0, v1}, Ljava/io/InterruptedIOException;-><init>(Ljava/lang/String;)V

    .line 61
    .line 62
    .line 63
    if-eqz p1, :cond_6

    .line 64
    .line 65
    invoke-virtual {v0, p1}, Ljava/lang/Throwable;->initCause(Ljava/lang/Throwable;)Ljava/lang/Throwable;

    .line 66
    .line 67
    .line 68
    :cond_6
    :goto_2
    iget-object p0, p0, Lxhss/ᛸᲇᲇᛶ;->ᛷᛴᛷᛱ:Lxhss/ᲀᲀᛱᲇ;

    .line 69
    .line 70
    if-eqz p1, :cond_7

    .line 71
    .line 72
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 73
    .line 74
    .line 75
    return-object v0

    .line 76
    :cond_7
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 77
    .line 78
    .line 79
    return-object v0
.end method

.method public final ᛳᲁᲇᛸ()Lxhss/ᲀᛶᛷᲁ;
    .locals 3

    .line 1
    iget-object v0, p0, Lxhss/ᛸᲇᲇᛶ;->ᲀᲇᛳᲁ:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const/4 v2, 0x1

    .line 5
    invoke-virtual {v0, v1, v2}, Ljava/util/concurrent/atomic/AtomicBoolean;->compareAndSet(ZZ)Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    iget-object v0, p0, Lxhss/ᛸᲇᲇᛶ;->ᲇᛶᛴᲀ:Lxhss/ᲈᲁᛶᛱ;

    .line 12
    .line 13
    invoke-virtual {v0}, Lxhss/ᲈᲀᲇᛶ;->ᛸᛴᛶᛳ()V

    .line 14
    .line 15
    .line 16
    sget-object v0, Lxhss/ᲀᛱᛷᛸ;->ᛷᛵᛵᲈ:Lxhss/ᛵᛳᛸᲇ;

    .line 17
    .line 18
    sget-object v0, Lxhss/ᲀᛱᛷᛸ;->ᛷᛵᛵᲈ:Lxhss/ᛵᛳᛸᲇ;

    .line 19
    .line 20
    const-string v1, "response.body().close()"

    .line 21
    .line 22
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 23
    .line 24
    .line 25
    new-instance v0, Landroid/util/CloseGuard;

    .line 26
    .line 27
    invoke-direct {v0}, Landroid/util/CloseGuard;-><init>()V

    .line 28
    .line 29
    .line 30
    invoke-virtual {v0, v1}, Landroid/util/CloseGuard;->open(Ljava/lang/String;)V

    .line 31
    .line 32
    .line 33
    iput-object v0, p0, Lxhss/ᛸᲇᲇᛶ;->ᛸᛴᛶᛳ:Landroid/util/CloseGuard;

    .line 34
    .line 35
    iget-object v0, p0, Lxhss/ᛸᲇᲇᛶ;->ᛷᛴᛷᛱ:Lxhss/ᲀᲀᛱᲇ;

    .line 36
    .line 37
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 38
    .line 39
    .line 40
    :try_start_0
    iget-object v0, p0, Lxhss/ᛸᲇᲇᛶ;->ᛱᛱᛲᲇ:Lxhss/ᛵᛸᛷᛲ;

    .line 41
    .line 42
    iget-object v0, v0, Lxhss/ᛵᛸᛷᛲ;->ᛷᛵᛵᲈ:Lxhss/ᲇᛸᛶ;

    .line 43
    .line 44
    monitor-enter v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 45
    :try_start_1
    iget-object v1, v0, Lxhss/ᲇᛸᛶ;->ᲇᛶᛴᲀ:Ljava/lang/Object;

    .line 46
    .line 47
    check-cast v1, Ljava/util/ArrayDeque;

    .line 48
    .line 49
    invoke-virtual {v1, p0}, Ljava/util/ArrayDeque;->add(Ljava/lang/Object;)Z
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 50
    .line 51
    .line 52
    :try_start_2
    monitor-exit v0

    .line 53
    invoke-virtual {p0}, Lxhss/ᛸᲇᲇᛶ;->ᛷᛴᛷᛱ()Lxhss/ᲀᛶᛷᲁ;

    .line 54
    .line 55
    .line 56
    move-result-object v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 57
    iget-object v1, p0, Lxhss/ᛸᲇᲇᛶ;->ᛱᛱᛲᲇ:Lxhss/ᛵᛸᛷᛲ;

    .line 58
    .line 59
    iget-object v1, v1, Lxhss/ᛵᛸᛷᛲ;->ᛷᛵᛵᲈ:Lxhss/ᲇᛸᛶ;

    .line 60
    .line 61
    invoke-virtual {v1, p0}, Lxhss/ᲇᛸᛶ;->ᛳᲁᲇᛸ(Lxhss/ᛸᲇᲇᛶ;)V

    .line 62
    .line 63
    .line 64
    return-object v0

    .line 65
    :catchall_0
    move-exception v0

    .line 66
    goto :goto_0

    .line 67
    :catchall_1
    move-exception v1

    .line 68
    :try_start_3
    monitor-exit v0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 69
    :try_start_4
    throw v1
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 70
    :goto_0
    iget-object v1, p0, Lxhss/ᛸᲇᲇᛶ;->ᛱᛱᛲᲇ:Lxhss/ᛵᛸᛷᛲ;

    .line 71
    .line 72
    iget-object v1, v1, Lxhss/ᛵᛸᛷᛲ;->ᛷᛵᛵᲈ:Lxhss/ᲇᛸᛶ;

    .line 73
    .line 74
    invoke-virtual {v1, p0}, Lxhss/ᲇᛸᛶ;->ᛳᲁᲇᛸ(Lxhss/ᛸᲇᲇᛶ;)V

    .line 75
    .line 76
    .line 77
    throw v0

    .line 78
    :cond_0
    const-string p0, "Already Executed"

    .line 79
    .line 80
    invoke-static {p0}, Lxhss/ᛵᲈᲁᲈ;->ᛶᲇᲈᛸ(Ljava/lang/String;)V

    .line 81
    .line 82
    .line 83
    const/4 p0, 0x0

    .line 84
    return-object p0
.end method

.method public final ᛷᛴᛷᛱ()Lxhss/ᲀᛶᛷᲁ;
    .locals 22

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    new-instance v2, Ljava/util/ArrayList;

    .line 4
    .line 5
    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 6
    .line 7
    .line 8
    iget-object v0, v1, Lxhss/ᛸᲇᲇᛶ;->ᛱᛱᛲᲇ:Lxhss/ᛵᛸᛷᛲ;

    .line 9
    .line 10
    iget-object v0, v0, Lxhss/ᛵᛸᛷᛲ;->ᛱᛱᛲᲇ:Ljava/util/List;

    .line 11
    .line 12
    invoke-static {v2, v0}, Lxhss/ᛷᛴᛴ;->ᛵᛲᲁᛶ(Ljava/util/ArrayList;Ljava/lang/Iterable;)V

    .line 13
    .line 14
    .line 15
    new-instance v0, Lxhss/ᲇᲀᛵᲀ;

    .line 16
    .line 17
    const/4 v3, 0x4

    .line 18
    invoke-direct {v0, v3}, Lxhss/ᲇᲀᛵᲀ;-><init>(I)V

    .line 19
    .line 20
    .line 21
    invoke-virtual {v2, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 22
    .line 23
    .line 24
    new-instance v0, Lxhss/ᲇᲀᛵᲀ;

    .line 25
    .line 26
    const/4 v3, 0x2

    .line 27
    invoke-direct {v0, v3}, Lxhss/ᲇᲀᛵᲀ;-><init>(I)V

    .line 28
    .line 29
    .line 30
    invoke-virtual {v2, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 31
    .line 32
    .line 33
    new-instance v0, Lxhss/ᲇᲀᛵᲀ;

    .line 34
    .line 35
    const/4 v3, 0x3

    .line 36
    invoke-direct {v0, v3}, Lxhss/ᲇᲀᛵᲀ;-><init>(I)V

    .line 37
    .line 38
    .line 39
    invoke-virtual {v2, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 40
    .line 41
    .line 42
    sget-object v0, Lxhss/ᲇᲀᛵᲀ;->ᛳᲁᲇᛸ:Lxhss/ᲇᲀᛵᲀ;

    .line 43
    .line 44
    invoke-virtual {v2, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 45
    .line 46
    .line 47
    iget-object v0, v1, Lxhss/ᛸᲇᲇᛶ;->ᛱᛱᛲᲇ:Lxhss/ᛵᛸᛷᛲ;

    .line 48
    .line 49
    iget-object v0, v0, Lxhss/ᛵᛸᛷᛲ;->ᛳᲁᲇᛸ:Ljava/util/List;

    .line 50
    .line 51
    invoke-static {v2, v0}, Lxhss/ᛷᛴᛴ;->ᛵᛲᲁᛶ(Ljava/util/ArrayList;Ljava/lang/Iterable;)V

    .line 52
    .line 53
    .line 54
    sget-object v0, Lxhss/ᲇᲀᛵᲀ;->ᛱᛱᛲᲇ:Lxhss/ᲇᲀᛵᲀ;

    .line 55
    .line 56
    invoke-virtual {v2, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 57
    .line 58
    .line 59
    new-instance v0, Lxhss/ᲁᲈᲀᲈ;

    .line 60
    .line 61
    iget-object v5, v1, Lxhss/ᛸᲇᲇᛶ;->ᛳᲁᲇᛸ:Lxhss/ᛴᛴᛴᛵ;

    .line 62
    .line 63
    iget-object v3, v1, Lxhss/ᛸᲇᲇᛶ;->ᛱᛱᛲᲇ:Lxhss/ᛵᛸᛷᛲ;

    .line 64
    .line 65
    iget v6, v3, Lxhss/ᛵᛸᛷᛲ;->ᲈᛲᛵᲁ:I

    .line 66
    .line 67
    iget v7, v3, Lxhss/ᛵᛸᛷᛲ;->ᲁᛴᲇᛲ:I

    .line 68
    .line 69
    iget v8, v3, Lxhss/ᛵᛸᛷᛲ;->ᲀᛷᲁᲀ:I

    .line 70
    .line 71
    iget-object v9, v3, Lxhss/ᛵᛸᛷᛲ;->ᲀᲇᛳᲁ:Lxhss/ᛳᛴᲀᲁ;

    .line 72
    .line 73
    iget-object v10, v3, Lxhss/ᛵᛸᛷᛲ;->ᛳᛶᛷᲀ:Lxhss/ᛲᛷᲀᲇ;

    .line 74
    .line 75
    iget-object v11, v3, Lxhss/ᛵᛸᛷᛲ;->ᛲᛴᲇᛲ:Lxhss/ᲇᛵᛲᲁ;

    .line 76
    .line 77
    iget-object v12, v3, Lxhss/ᛵᛸᛷᛲ;->ᛸᛷᲈᲈ:Lxhss/ᛳᛴᲀᲁ;

    .line 78
    .line 79
    iget-object v13, v3, Lxhss/ᛵᛸᛷᛲ;->ᲈᛳᲀ:Lxhss/ᛳᛴᲀᲁ;

    .line 80
    .line 81
    iget-object v14, v3, Lxhss/ᛵᛸᛷᛲ;->ᛴᲈᛱᛴ:Lxhss/ᲈᛷᛴ;

    .line 82
    .line 83
    iget-object v15, v3, Lxhss/ᛵᛸᛷᛲ;->ᛸᛶᲈᛶ:Lxhss/ᛳᛴᲀᲁ;

    .line 84
    .line 85
    iget-object v4, v3, Lxhss/ᛵᛸᛷᛲ;->ᛷᲁᲁ:Ljava/net/ProxySelector;

    .line 86
    .line 87
    move-object/from16 v16, v0

    .line 88
    .line 89
    iget-boolean v0, v3, Lxhss/ᛵᛸᛷᛲ;->ᛷᛴᛷᛱ:Z

    .line 90
    .line 91
    move/from16 v17, v0

    .line 92
    .line 93
    iget-object v0, v3, Lxhss/ᛵᛸᛷᛲ;->ᲇᛸᛳᲁ:Ljavax/net/SocketFactory;

    .line 94
    .line 95
    move-object/from16 v18, v0

    .line 96
    .line 97
    iget-object v0, v3, Lxhss/ᛵᛸᛷᛲ;->ᛳᲈᲈᛲ:Ljavax/net/ssl/SSLSocketFactory;

    .line 98
    .line 99
    move-object/from16 v19, v0

    .line 100
    .line 101
    iget-object v0, v3, Lxhss/ᛵᛸᛷᛲ;->ᛶᲇᲈᛸ:Ljavax/net/ssl/X509TrustManager;

    .line 102
    .line 103
    iget-object v3, v3, Lxhss/ᛵᛸᛷᛲ;->ᲁᛲᛴᛴ:Lxhss/ᛵᛶᲀᲇ;

    .line 104
    .line 105
    move-object/from16 v21, v3

    .line 106
    .line 107
    const/4 v3, 0x0

    .line 108
    move-object/from16 v20, v0

    .line 109
    .line 110
    move-object/from16 v0, v16

    .line 111
    .line 112
    move-object/from16 v16, v4

    .line 113
    .line 114
    const/4 v4, 0x0

    .line 115
    invoke-direct/range {v0 .. v21}, Lxhss/ᲁᲈᲀᲈ;-><init>(Lxhss/ᛸᲇᲇᛶ;Ljava/util/ArrayList;ILxhss/ᲇᛸᛵᛴ;Lxhss/ᛴᛴᛴᛵ;IIILxhss/ᛳᛴᲀᲁ;Lxhss/ᛲᛷᲀᲇ;Lxhss/ᲇᛵᛲᲁ;Lxhss/ᛳᛴᲀᲁ;Lxhss/ᛳᛴᲀᲁ;Ljavax/net/ssl/HostnameVerifier;Lxhss/ᛳᛴᲀᲁ;Ljava/net/ProxySelector;ZLjavax/net/SocketFactory;Ljavax/net/ssl/SSLSocketFactory;Ljavax/net/ssl/X509TrustManager;Lxhss/ᛵᛶᲀᲇ;)V

    .line 116
    .line 117
    .line 118
    const/4 v2, 0x0

    .line 119
    const/4 v3, 0x0

    .line 120
    :try_start_0
    invoke-virtual {v0, v5}, Lxhss/ᲁᲈᲀᲈ;->ᛱᛱᛲᲇ(Lxhss/ᛴᛴᛴᛵ;)Lxhss/ᲀᛶᛷᲁ;

    .line 121
    .line 122
    .line 123
    move-result-object v0

    .line 124
    iget-boolean v4, v1, Lxhss/ᛸᲇᲇᛶ;->ᛸᛲᛷᛱ:Z
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 125
    .line 126
    if-nez v4, :cond_0

    .line 127
    .line 128
    invoke-virtual {v1, v2}, Lxhss/ᛸᲇᲇᛶ;->ᲀᲇᛳᲁ(Ljava/io/IOException;)Ljava/io/IOException;

    .line 129
    .line 130
    .line 131
    return-object v0

    .line 132
    :cond_0
    :try_start_1
    invoke-static {v0}, Lxhss/ᛶᛸᛲ;->ᛷᛵᛵᲈ(Ljava/io/Closeable;)V

    .line 133
    .line 134
    .line 135
    new-instance v0, Ljava/io/IOException;

    .line 136
    .line 137
    const-string v4, "Canceled"

    .line 138
    .line 139
    invoke-direct {v0, v4}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 140
    .line 141
    .line 142
    throw v0
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 143
    :catchall_0
    move-exception v0

    .line 144
    goto :goto_0

    .line 145
    :catch_0
    move-exception v0

    .line 146
    const/4 v3, 0x1

    .line 147
    :try_start_2
    invoke-virtual {v1, v0}, Lxhss/ᛸᲇᲇᛶ;->ᲀᲇᛳᲁ(Ljava/io/IOException;)Ljava/io/IOException;

    .line 148
    .line 149
    .line 150
    move-result-object v0

    .line 151
    throw v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 152
    :goto_0
    if-nez v3, :cond_1

    .line 153
    .line 154
    invoke-virtual {v1, v2}, Lxhss/ᛸᲇᲇᛶ;->ᲀᲇᛳᲁ(Ljava/io/IOException;)Ljava/io/IOException;

    .line 155
    .line 156
    .line 157
    :cond_1
    throw v0
.end method

.method public final ᛷᛵᛵᲈ(Lxhss/ᲈᲁᛲᲇ;)V
    .locals 2

    .line 1
    sget-object v0, Lxhss/ᛶᛴᲀᛲ;->ᛷᛵᛵᲈ:Ljava/util/TimeZone;

    .line 2
    .line 3
    iget-object v0, p0, Lxhss/ᛸᲇᲇᛶ;->ᛸᛷᲈᲈ:Lxhss/ᲈᲁᛲᲇ;

    .line 4
    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    iput-object p1, p0, Lxhss/ᛸᲇᲇᛶ;->ᛸᛷᲈᲈ:Lxhss/ᲈᲁᛲᲇ;

    .line 8
    .line 9
    iget-object p1, p1, Lxhss/ᲈᲁᛲᲇ;->ᛶᲇᲈᛸ:Ljava/util/ArrayList;

    .line 10
    .line 11
    new-instance v0, Lxhss/ᛱᛵᲁᲇ;

    .line 12
    .line 13
    iget-object v1, p0, Lxhss/ᛸᲇᲇᛶ;->ᛸᛴᛶᛳ:Landroid/util/CloseGuard;

    .line 14
    .line 15
    invoke-direct {v0, p0, v1}, Lxhss/ᛱᛵᲁᲇ;-><init>(Lxhss/ᛸᲇᲇᛶ;Landroid/util/CloseGuard;)V

    .line 16
    .line 17
    .line 18
    invoke-virtual {p1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 19
    .line 20
    .line 21
    return-void

    .line 22
    :cond_0
    const-string p0, "Check failed."

    .line 23
    .line 24
    invoke-static {p0}, Lxhss/ᛵᲈᲁᲈ;->ᛶᲇᲈᛸ(Ljava/lang/String;)V

    .line 25
    .line 26
    .line 27
    return-void
.end method

.method public final ᛸᛴᛶᛳ()Ljava/net/Socket;
    .locals 6

    .line 1
    iget-object v0, p0, Lxhss/ᛸᲇᲇᛶ;->ᛸᛷᲈᲈ:Lxhss/ᲈᲁᛲᲇ;

    .line 2
    .line 3
    sget-object v1, Lxhss/ᛶᛴᲀᛲ;->ᛷᛵᛵᲈ:Ljava/util/TimeZone;

    .line 4
    .line 5
    iget-object v1, v0, Lxhss/ᲈᲁᛲᲇ;->ᛶᲇᲈᛸ:Ljava/util/ArrayList;

    .line 6
    .line 7
    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 8
    .line 9
    .line 10
    move-result-object v2

    .line 11
    const/4 v3, 0x0

    .line 12
    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 13
    .line 14
    .line 15
    move-result v4

    .line 16
    const/4 v5, -0x1

    .line 17
    if-eqz v4, :cond_1

    .line 18
    .line 19
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 20
    .line 21
    .line 22
    move-result-object v4

    .line 23
    check-cast v4, Ljava/lang/ref/Reference;

    .line 24
    .line 25
    invoke-virtual {v4}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 26
    .line 27
    .line 28
    move-result-object v4

    .line 29
    invoke-static {v4, p0}, Lxhss/ᛱᛱᛷᛸ;->ᛷᛵᛵᲈ(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 30
    .line 31
    .line 32
    move-result v4

    .line 33
    if-eqz v4, :cond_0

    .line 34
    .line 35
    goto :goto_1

    .line 36
    :cond_0
    add-int/lit8 v3, v3, 0x1

    .line 37
    .line 38
    goto :goto_0

    .line 39
    :cond_1
    move v3, v5

    .line 40
    :goto_1
    const/4 v2, 0x0

    .line 41
    if-eq v3, v5, :cond_6

    .line 42
    .line 43
    invoke-virtual {v1, v3}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    .line 44
    .line 45
    .line 46
    iput-object v2, p0, Lxhss/ᛸᲇᲇᛶ;->ᛸᛷᲈᲈ:Lxhss/ᲈᲁᛲᲇ;

    .line 47
    .line 48
    invoke-virtual {v1}, Ljava/util/ArrayList;->isEmpty()Z

    .line 49
    .line 50
    .line 51
    move-result v1

    .line 52
    if-eqz v1, :cond_5

    .line 53
    .line 54
    invoke-static {}, Ljava/lang/System;->nanoTime()J

    .line 55
    .line 56
    .line 57
    move-result-wide v3

    .line 58
    iput-wide v3, v0, Lxhss/ᲈᲁᛲᲇ;->ᛸᛶᛴᲈ:J

    .line 59
    .line 60
    iget-object p0, p0, Lxhss/ᛸᲇᲇᛶ;->ᲇᛴᲇᛵ:Lxhss/ᲈᛲᲀᛵ;

    .line 61
    .line 62
    iget-object v1, p0, Lxhss/ᲈᛲᲀᛵ;->ᲇᛴᲇᛵ:Ljava/util/concurrent/ConcurrentLinkedQueue;

    .line 63
    .line 64
    sget-object v3, Lxhss/ᛶᛴᲀᛲ;->ᛷᛵᛵᲈ:Ljava/util/TimeZone;

    .line 65
    .line 66
    iget-boolean v3, v0, Lxhss/ᲈᲁᛲᲇ;->ᛸᛷᲈᲈ:Z

    .line 67
    .line 68
    if-nez v3, :cond_2

    .line 69
    .line 70
    iget-object v0, p0, Lxhss/ᲈᛲᲀᛵ;->ᛱᛱᛲᲇ:Lxhss/ᲇᲀᲀᛷ;

    .line 71
    .line 72
    iget-object p0, p0, Lxhss/ᲈᛲᲀᛵ;->ᛳᲁᲇᛸ:Lxhss/ᛷᲀᲁᲇ;

    .line 73
    .line 74
    const-wide/16 v3, 0x0

    .line 75
    .line 76
    invoke-virtual {v0, p0, v3, v4}, Lxhss/ᲇᲀᲀᛷ;->ᛳᲁᲇᛸ(Lxhss/ᛵᛳᲀᛲ;J)V

    .line 77
    .line 78
    .line 79
    return-object v2

    .line 80
    :cond_2
    const/4 v2, 0x1

    .line 81
    iput-boolean v2, v0, Lxhss/ᲈᲁᛲᲇ;->ᛸᛷᲈᲈ:Z

    .line 82
    .line 83
    invoke-virtual {v1, v0}, Ljava/util/concurrent/ConcurrentLinkedQueue;->remove(Ljava/lang/Object;)Z

    .line 84
    .line 85
    .line 86
    invoke-virtual {v1}, Ljava/util/concurrent/ConcurrentLinkedQueue;->isEmpty()Z

    .line 87
    .line 88
    .line 89
    move-result v1

    .line 90
    if-eqz v1, :cond_4

    .line 91
    .line 92
    iget-object p0, p0, Lxhss/ᲈᛲᲀᛵ;->ᛱᛱᛲᲇ:Lxhss/ᲇᲀᲀᛷ;

    .line 93
    .line 94
    iget-object v1, p0, Lxhss/ᲇᲀᲀᛷ;->ᛷᛵᛵᲈ:Lxhss/ᛸᛱᛴᛳ;

    .line 95
    .line 96
    monitor-enter v1

    .line 97
    :try_start_0
    invoke-virtual {p0}, Lxhss/ᲇᲀᲀᛷ;->ᛷᛵᛵᲈ()Z

    .line 98
    .line 99
    .line 100
    move-result v2

    .line 101
    if-eqz v2, :cond_3

    .line 102
    .line 103
    iget-object v2, p0, Lxhss/ᲇᲀᲀᛷ;->ᛷᛵᛵᲈ:Lxhss/ᛸᛱᛴᛳ;

    .line 104
    .line 105
    invoke-virtual {v2, p0}, Lxhss/ᛸᛱᛴᛳ;->ᛳᲁᲇᛸ(Lxhss/ᲇᲀᲀᛷ;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 106
    .line 107
    .line 108
    goto :goto_2

    .line 109
    :catchall_0
    move-exception p0

    .line 110
    goto :goto_3

    .line 111
    :cond_3
    :goto_2
    monitor-exit v1

    .line 112
    goto :goto_4

    .line 113
    :goto_3
    monitor-exit v1

    .line 114
    throw p0

    .line 115
    :cond_4
    :goto_4
    iget-object p0, v0, Lxhss/ᲈᲁᛲᲇ;->ᛷᛴᛷᛱ:Ljava/net/Socket;

    .line 116
    .line 117
    return-object p0

    .line 118
    :cond_5
    return-object v2

    .line 119
    :cond_6
    const-string p0, "Check failed."

    .line 120
    .line 121
    invoke-static {p0}, Lxhss/ᛵᲈᲁᲈ;->ᛶᲇᲈᛸ(Ljava/lang/String;)V

    .line 122
    .line 123
    .line 124
    return-object v2
.end method

.method public final ᲀᲇᛳᲁ(Ljava/io/IOException;)Ljava/io/IOException;
    .locals 2

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    iget-boolean v0, p0, Lxhss/ᛸᲇᲇᛶ;->ᛸᛶᛴᲈ:Z

    .line 3
    .line 4
    const/4 v1, 0x0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    iput-boolean v1, p0, Lxhss/ᛸᲇᲇᛶ;->ᛸᛶᛴᲈ:Z

    .line 8
    .line 9
    iget-boolean v0, p0, Lxhss/ᛸᲇᲇᛶ;->ᛸᛶᲈᛶ:Z

    .line 10
    .line 11
    if-nez v0, :cond_0

    .line 12
    .line 13
    iget-boolean v0, p0, Lxhss/ᛸᲇᲇᛶ;->ᲇᛸᛳᲁ:Z

    .line 14
    .line 15
    if-nez v0, :cond_0

    .line 16
    .line 17
    iget-boolean v0, p0, Lxhss/ᛸᲇᲇᛶ;->ᛳᲈᲈᛲ:Z

    .line 18
    .line 19
    if-nez v0, :cond_0

    .line 20
    .line 21
    iget-boolean v0, p0, Lxhss/ᛸᲇᲇᛶ;->ᛶᲇᲈᛸ:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 22
    .line 23
    if-nez v0, :cond_0

    .line 24
    .line 25
    const/4 v1, 0x1

    .line 26
    goto :goto_0

    .line 27
    :catchall_0
    move-exception p1

    .line 28
    goto :goto_1

    .line 29
    :cond_0
    :goto_0
    monitor-exit p0

    .line 30
    if-eqz v1, :cond_1

    .line 31
    .line 32
    invoke-virtual {p0, p1}, Lxhss/ᛸᲇᲇᛶ;->ᛱᛱᛲᲇ(Ljava/io/IOException;)Ljava/io/IOException;

    .line 33
    .line 34
    .line 35
    move-result-object p0

    .line 36
    return-object p0

    .line 37
    :cond_1
    return-object p1

    .line 38
    :goto_1
    monitor-exit p0

    .line 39
    throw p1
.end method

.method public final ᲇᛴᲇᛵ(Z)V
    .locals 8

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    iget-boolean v0, p0, Lxhss/ᛸᲇᲇᛶ;->ᛸᛶᛴᲈ:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 3
    .line 4
    if-eqz v0, :cond_1

    .line 5
    .line 6
    monitor-exit p0

    .line 7
    if-eqz p1, :cond_0

    .line 8
    .line 9
    iget-object v2, p0, Lxhss/ᛸᲇᲇᛶ;->ᛴᲈᛱᛴ:Lxhss/ᲇᛸᛵᛴ;

    .line 10
    .line 11
    if-eqz v2, :cond_0

    .line 12
    .line 13
    iget-object p1, v2, Lxhss/ᲇᛸᛵᛴ;->ᛳᲁᲇᛸ:Lxhss/ᛷᛶᛷᛲ;

    .line 14
    .line 15
    invoke-interface {p1}, Lxhss/ᛷᛶᛷᛲ;->cancel()V

    .line 16
    .line 17
    .line 18
    iget-object v1, v2, Lxhss/ᲇᛸᛵᛴ;->ᛷᛵᛵᲈ:Lxhss/ᛸᲇᲇᛶ;

    .line 19
    .line 20
    const/4 v6, 0x1

    .line 21
    const/4 v7, 0x0

    .line 22
    const/4 v3, 0x1

    .line 23
    const/4 v4, 0x1

    .line 24
    const/4 v5, 0x1

    .line 25
    invoke-virtual/range {v1 .. v7}, Lxhss/ᛸᲇᲇᛶ;->ᲇᛶᛴᲀ(Lxhss/ᲇᛸᛵᛴ;ZZZZLjava/io/IOException;)Ljava/io/IOException;

    .line 26
    .line 27
    .line 28
    :cond_0
    const/4 p1, 0x0

    .line 29
    iput-object p1, p0, Lxhss/ᛸᲇᲇᛶ;->ᛷᲁᲁ:Lxhss/ᲇᛸᛵᛴ;

    .line 30
    .line 31
    return-void

    .line 32
    :cond_1
    :try_start_1
    const-string p1, "released"

    .line 33
    .line 34
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 35
    .line 36
    invoke-direct {v0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 37
    .line 38
    .line 39
    throw v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 40
    :catchall_0
    move-exception v0

    .line 41
    move-object p1, v0

    .line 42
    monitor-exit p0

    .line 43
    throw p1
.end method

.method public final ᲇᛶᛴᲀ(Lxhss/ᲇᛸᛵᛴ;ZZZZLjava/io/IOException;)Ljava/io/IOException;
    .locals 3

    .line 1
    iget-object v0, p0, Lxhss/ᛸᲇᲇᛶ;->ᛴᲈᛱᛴ:Lxhss/ᲇᛸᛵᛴ;

    .line 2
    .line 3
    invoke-virtual {p1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 4
    .line 5
    .line 6
    move-result p1

    .line 7
    if-nez p1, :cond_0

    .line 8
    .line 9
    goto/16 :goto_5

    .line 10
    .line 11
    :cond_0
    monitor-enter p0

    .line 12
    const/4 p1, 0x1

    .line 13
    const/4 v0, 0x0

    .line 14
    if-eqz p2, :cond_1

    .line 15
    .line 16
    :try_start_0
    iget-boolean v1, p0, Lxhss/ᛸᲇᲇᛶ;->ᛸᛶᲈᛶ:Z

    .line 17
    .line 18
    if-nez v1, :cond_4

    .line 19
    .line 20
    goto :goto_0

    .line 21
    :catchall_0
    move-exception p1

    .line 22
    goto :goto_2

    .line 23
    :cond_1
    :goto_0
    if-eqz p3, :cond_2

    .line 24
    .line 25
    iget-boolean v1, p0, Lxhss/ᛸᲇᲇᛶ;->ᲇᛸᛳᲁ:Z

    .line 26
    .line 27
    if-nez v1, :cond_4

    .line 28
    .line 29
    :cond_2
    if-eqz p5, :cond_3

    .line 30
    .line 31
    iget-boolean v1, p0, Lxhss/ᛸᲇᲇᛶ;->ᛳᲈᲈᛲ:Z

    .line 32
    .line 33
    if-nez v1, :cond_4

    .line 34
    .line 35
    :cond_3
    if-eqz p4, :cond_b

    .line 36
    .line 37
    iget-boolean v1, p0, Lxhss/ᛸᲇᲇᛶ;->ᛶᲇᲈᛸ:Z

    .line 38
    .line 39
    if-eqz v1, :cond_b

    .line 40
    .line 41
    :cond_4
    if-eqz p2, :cond_5

    .line 42
    .line 43
    iput-boolean v0, p0, Lxhss/ᛸᲇᲇᛶ;->ᛸᛶᲈᛶ:Z

    .line 44
    .line 45
    :cond_5
    if-eqz p3, :cond_6

    .line 46
    .line 47
    iput-boolean v0, p0, Lxhss/ᛸᲇᲇᛶ;->ᲇᛸᛳᲁ:Z

    .line 48
    .line 49
    :cond_6
    if-eqz p5, :cond_7

    .line 50
    .line 51
    iput-boolean v0, p0, Lxhss/ᛸᲇᲇᛶ;->ᛳᲈᲈᛲ:Z

    .line 52
    .line 53
    :cond_7
    if-eqz p4, :cond_8

    .line 54
    .line 55
    iput-boolean v0, p0, Lxhss/ᛸᲇᲇᛶ;->ᛶᲇᲈᛸ:Z

    .line 56
    .line 57
    :cond_8
    iget-boolean p2, p0, Lxhss/ᛸᲇᲇᛶ;->ᛸᛶᲈᛶ:Z

    .line 58
    .line 59
    if-nez p2, :cond_9

    .line 60
    .line 61
    iget-boolean p2, p0, Lxhss/ᛸᲇᲇᛶ;->ᲇᛸᛳᲁ:Z

    .line 62
    .line 63
    if-nez p2, :cond_9

    .line 64
    .line 65
    iget-boolean p2, p0, Lxhss/ᛸᲇᲇᛶ;->ᛳᲈᲈᛲ:Z

    .line 66
    .line 67
    if-nez p2, :cond_9

    .line 68
    .line 69
    iget-boolean p2, p0, Lxhss/ᛸᲇᲇᛶ;->ᛶᲇᲈᛸ:Z

    .line 70
    .line 71
    if-nez p2, :cond_9

    .line 72
    .line 73
    move p2, p1

    .line 74
    goto :goto_1

    .line 75
    :cond_9
    move p2, v0

    .line 76
    :goto_1
    if-eqz p2, :cond_a

    .line 77
    .line 78
    iget-boolean p3, p0, Lxhss/ᛸᲇᲇᛶ;->ᛸᛶᛴᲈ:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 79
    .line 80
    if-nez p3, :cond_a

    .line 81
    .line 82
    move v0, p1

    .line 83
    :cond_a
    move v2, v0

    .line 84
    move v0, p2

    .line 85
    move p2, v2

    .line 86
    goto :goto_3

    .line 87
    :goto_2
    monitor-exit p0

    .line 88
    throw p1

    .line 89
    :cond_b
    move p2, v0

    .line 90
    :goto_3
    monitor-exit p0

    .line 91
    if-eqz v0, :cond_c

    .line 92
    .line 93
    const/4 p3, 0x0

    .line 94
    iput-object p3, p0, Lxhss/ᛸᲇᲇᛶ;->ᛴᲈᛱᛴ:Lxhss/ᲇᛸᛵᛴ;

    .line 95
    .line 96
    iget-object p3, p0, Lxhss/ᛸᲇᲇᛶ;->ᛸᛷᲈᲈ:Lxhss/ᲈᲁᛲᲇ;

    .line 97
    .line 98
    if-eqz p3, :cond_c

    .line 99
    .line 100
    monitor-enter p3

    .line 101
    :try_start_1
    iget p4, p3, Lxhss/ᲈᲁᛲᲇ;->ᛸᛶᲈᛶ:I

    .line 102
    .line 103
    add-int/2addr p4, p1

    .line 104
    iput p4, p3, Lxhss/ᲈᲁᛲᲇ;->ᛸᛶᲈᛶ:I
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 105
    .line 106
    monitor-exit p3

    .line 107
    goto :goto_4

    .line 108
    :catchall_1
    move-exception p0

    .line 109
    monitor-exit p3

    .line 110
    throw p0

    .line 111
    :cond_c
    :goto_4
    if-eqz p2, :cond_d

    .line 112
    .line 113
    invoke-virtual {p0, p6}, Lxhss/ᛸᲇᲇᛶ;->ᛱᛱᛲᲇ(Ljava/io/IOException;)Ljava/io/IOException;

    .line 114
    .line 115
    .line 116
    move-result-object p0

    .line 117
    return-object p0

    .line 118
    :cond_d
    :goto_5
    return-object p6
.end method
