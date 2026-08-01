.class public final synthetic Lxhss/ᛲᛶᛴᛳ;
.super Ljava/lang/Object;
.source "r8-map-id-684deb5fba33a691397d1324861b0a91cfdff049bb058f400176b68a1f4afccc"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic ᛱᛱᛲᲇ:Lxhss/ᲇᛵᛲᲁ;

.field public final synthetic ᛳᲁᲇᛸ:Lxhss/ᛱᛱᛷᛸ;

.field public final synthetic ᲇᛴᲇᛵ:Ljava/util/concurrent/ThreadPoolExecutor;


# direct methods
.method public synthetic constructor <init>(Lxhss/ᲇᛵᛲᲁ;Lxhss/ᛱᛱᛷᛸ;Ljava/util/concurrent/ThreadPoolExecutor;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lxhss/ᛲᛶᛴᛳ;->ᛱᛱᛲᲇ:Lxhss/ᲇᛵᛲᲁ;

    .line 5
    .line 6
    iput-object p2, p0, Lxhss/ᛲᛶᛴᛳ;->ᛳᲁᲇᛸ:Lxhss/ᛱᛱᛷᛸ;

    .line 7
    .line 8
    iput-object p3, p0, Lxhss/ᛲᛶᛴᛳ;->ᲇᛴᲇᛵ:Ljava/util/concurrent/ThreadPoolExecutor;

    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public final run()V
    .locals 4

    .line 1
    iget-object v0, p0, Lxhss/ᛲᛶᛴᛳ;->ᛱᛱᛲᲇ:Lxhss/ᲇᛵᛲᲁ;

    .line 2
    .line 3
    iget-object v1, p0, Lxhss/ᛲᛶᛴᛳ;->ᛳᲁᲇᛸ:Lxhss/ᛱᛱᛷᛸ;

    .line 4
    .line 5
    iget-object p0, p0, Lxhss/ᛲᛶᛴᛳ;->ᲇᛴᲇᛵ:Ljava/util/concurrent/ThreadPoolExecutor;

    .line 6
    .line 7
    :try_start_0
    iget-object v0, v0, Lxhss/ᲇᛵᛲᲁ;->ᛳᲁᲇᛸ:Ljava/lang/Object;

    .line 8
    .line 9
    check-cast v0, Landroid/content/Context;

    .line 10
    .line 11
    invoke-static {v0}, Lxhss/ᛵᛵᛲᲈ;->ᛸᛷᲈᲈ(Landroid/content/Context;)Lxhss/ᛸᛶᛱᲀ;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    if-eqz v0, :cond_0

    .line 16
    .line 17
    iget-object v2, v0, Lxhss/ᛸᛶᛱᲀ;->ᛷᛵᛵᲈ:Lxhss/ᛳᛶᛸᛷ;

    .line 18
    .line 19
    check-cast v2, Lxhss/ᛲᛳᛲᛲ;

    .line 20
    .line 21
    iget-object v3, v2, Lxhss/ᛲᛳᛲᛲ;->ᲇᛴᲇᛵ:Ljava/lang/Object;

    .line 22
    .line 23
    monitor-enter v3
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 24
    :try_start_1
    iput-object p0, v2, Lxhss/ᛲᛳᛲᛲ;->ᲇᛶᛴᲀ:Ljava/util/concurrent/ThreadPoolExecutor;

    .line 25
    .line 26
    monitor-exit v3
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 27
    :try_start_2
    iget-object v0, v0, Lxhss/ᛸᛶᛱᲀ;->ᛷᛵᛵᲈ:Lxhss/ᛳᛶᛸᛷ;

    .line 28
    .line 29
    new-instance v2, Lxhss/ᛸᲁᛷᛱ;

    .line 30
    .line 31
    invoke-direct {v2, v1, p0}, Lxhss/ᛸᲁᛷᛱ;-><init>(Lxhss/ᛱᛱᛷᛸ;Ljava/util/concurrent/ThreadPoolExecutor;)V

    .line 32
    .line 33
    .line 34
    invoke-interface {v0, v2}, Lxhss/ᛳᛶᛸᛷ;->ᛸᛴᛶᛳ(Lxhss/ᛱᛱᛷᛸ;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 35
    .line 36
    .line 37
    return-void

    .line 38
    :catchall_0
    move-exception v0

    .line 39
    goto :goto_0

    .line 40
    :catchall_1
    move-exception v0

    .line 41
    :try_start_3
    monitor-exit v3
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 42
    :try_start_4
    throw v0

    .line 43
    :cond_0
    new-instance v0, Ljava/lang/RuntimeException;

    .line 44
    .line 45
    const-string v2, "EmojiCompat font provider not available on this device."

    .line 46
    .line 47
    invoke-direct {v0, v2}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    .line 48
    .line 49
    .line 50
    throw v0
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 51
    :goto_0
    invoke-virtual {v1, v0}, Lxhss/ᛱᛱᛷᛸ;->ᛸᛴᛶᛳ(Ljava/lang/Throwable;)V

    .line 52
    .line 53
    .line 54
    invoke-virtual {p0}, Ljava/util/concurrent/ThreadPoolExecutor;->shutdown()V

    .line 55
    .line 56
    .line 57
    return-void
.end method
