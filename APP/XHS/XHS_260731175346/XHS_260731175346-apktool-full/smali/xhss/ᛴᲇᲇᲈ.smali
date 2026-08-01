.class public final Lxhss/ᛴᲇᲇᲈ;
.super Lxhss/ᛸᛶᛳᛷ;
.source "r8-map-id-684deb5fba33a691397d1324861b0a91cfdff049bb058f400176b68a1f4afccc"


# static fields
.field public static volatile ᛱᛱᛲᲇ:Lxhss/ᛴᲇᲇᲈ;


# direct methods
.method public static ᛴᲈᛱᛴ()Lxhss/ᛴᲇᲇᲈ;
    .locals 4

    .line 1
    sget-object v0, Lxhss/ᛴᲇᲇᲈ;->ᛱᛱᛲᲇ:Lxhss/ᛴᲇᲇᲈ;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    sget-object v0, Lxhss/ᛴᲇᲇᲈ;->ᛱᛱᛲᲇ:Lxhss/ᛴᲇᲇᲈ;

    .line 6
    .line 7
    return-object v0

    .line 8
    :cond_0
    const-class v0, Lxhss/ᛴᲇᲇᲈ;

    .line 9
    .line 10
    monitor-enter v0

    .line 11
    :try_start_0
    sget-object v1, Lxhss/ᛴᲇᲇᲈ;->ᛱᛱᛲᲇ:Lxhss/ᛴᲇᲇᲈ;

    .line 12
    .line 13
    if-nez v1, :cond_1

    .line 14
    .line 15
    new-instance v1, Lxhss/ᛴᲇᲇᲈ;

    .line 16
    .line 17
    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    .line 18
    .line 19
    .line 20
    new-instance v2, Lxhss/ᛷᛶᲈᲈ;

    .line 21
    .line 22
    invoke-direct {v2}, Lxhss/ᛷᛶᲈᲈ;-><init>()V

    .line 23
    .line 24
    .line 25
    const/4 v3, 0x4

    .line 26
    invoke-static {v3, v2}, Ljava/util/concurrent/Executors;->newFixedThreadPool(ILjava/util/concurrent/ThreadFactory;)Ljava/util/concurrent/ExecutorService;

    .line 27
    .line 28
    .line 29
    sput-object v1, Lxhss/ᛴᲇᲇᲈ;->ᛱᛱᛲᲇ:Lxhss/ᛴᲇᲇᲈ;

    .line 30
    .line 31
    goto :goto_0

    .line 32
    :catchall_0
    move-exception v1

    .line 33
    goto :goto_1

    .line 34
    :cond_1
    :goto_0
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 35
    sget-object v0, Lxhss/ᛴᲇᲇᲈ;->ᛱᛱᛲᲇ:Lxhss/ᛴᲇᲇᲈ;

    .line 36
    .line 37
    return-object v0

    .line 38
    :goto_1
    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 39
    throw v1
.end method
