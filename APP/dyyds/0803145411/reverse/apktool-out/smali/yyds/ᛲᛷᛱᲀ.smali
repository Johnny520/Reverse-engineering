.class public abstract Lyyds/ᛲᛷᛱᲀ;
.super Lyyds/ᛲᛵᲇᛳ;
.source "r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9"


# instance fields
.field public final ᛵᛸᛸᛷ:Lyyds/ᛲᛷᛷᲇ;


# direct methods
.method public constructor <init>(Lyyds/ᲈᲈᲈᛴ;)V
    .locals 6

    .line 1
    invoke-direct {p0}, Lyyds/ᛲᛵᲇᛳ;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Lyyds/ᲈᲈᲀᛴ;

    .line 5
    .line 6
    invoke-direct {v0, p0}, Lyyds/ᲈᲈᲀᛴ;-><init>(Lyyds/ᛲᛷᛱᲀ;)V

    .line 7
    .line 8
    .line 9
    new-instance v1, Lyyds/ᛲᛷᛷᲇ;

    .line 10
    .line 11
    new-instance v2, Lyyds/ᛱᛱᛴ;

    .line 12
    .line 13
    const/4 v3, 0x4

    .line 14
    invoke-direct {v2, v3, p0}, Lyyds/ᛱᛱᛴ;-><init>(ILjava/lang/Object;)V

    .line 15
    .line 16
    .line 17
    sget-object v3, Lyyds/ᲈᲈᲈᛴ;->ᛵᛸᛸᛷ:Ljava/lang/Object;

    .line 18
    .line 19
    monitor-enter v3

    .line 20
    :try_start_0
    sget-object v4, Lyyds/ᲈᲈᲈᛴ;->ᲀᛲᛳᲀ:Ljava/util/concurrent/ExecutorService;

    .line 21
    .line 22
    if-nez v4, :cond_0

    .line 23
    .line 24
    const/4 v4, 0x2

    .line 25
    invoke-static {v4}, Ljava/util/concurrent/Executors;->newFixedThreadPool(I)Ljava/util/concurrent/ExecutorService;

    .line 26
    .line 27
    .line 28
    move-result-object v4

    .line 29
    sput-object v4, Lyyds/ᲈᲈᲈᛴ;->ᲀᛲᛳᲀ:Ljava/util/concurrent/ExecutorService;

    .line 30
    .line 31
    goto :goto_0

    .line 32
    :catchall_0
    move-exception p0

    .line 33
    goto :goto_1

    .line 34
    :cond_0
    :goto_0
    monitor-exit v3
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 35
    new-instance v3, Lyyds/ᲀᲈᛶᲈ;

    .line 36
    .line 37
    const/4 v5, 0x7

    .line 38
    invoke-direct {v3, v4, v5, p1}, Lyyds/ᲀᲈᛶᲈ;-><init>(Ljava/lang/Object;ILjava/lang/Object;)V

    .line 39
    .line 40
    .line 41
    invoke-direct {v1, v2, v3}, Lyyds/ᛲᛷᛷᲇ;-><init>(Lyyds/ᛱᛱᛴ;Lyyds/ᲀᲈᛶᲈ;)V

    .line 42
    .line 43
    .line 44
    iput-object v1, p0, Lyyds/ᛲᛷᛱᲀ;->ᛵᛸᛸᛷ:Lyyds/ᛲᛷᛷᲇ;

    .line 45
    .line 46
    iget-object p0, v1, Lyyds/ᛲᛷᛷᲇ;->ᲇᲈᛵᛷ:Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 47
    .line 48
    invoke-virtual {p0, v0}, Ljava/util/concurrent/CopyOnWriteArrayList;->add(Ljava/lang/Object;)Z

    .line 49
    .line 50
    .line 51
    return-void

    .line 52
    :goto_1
    :try_start_1
    monitor-exit v3
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 53
    throw p0
.end method


# virtual methods
.method public final ᛲᲈᲁ()I
    .locals 0

    .line 1
    iget-object p0, p0, Lyyds/ᛲᛷᛱᲀ;->ᛵᛸᛸᛷ:Lyyds/ᛲᛷᛷᲇ;

    .line 2
    .line 3
    iget-object p0, p0, Lyyds/ᛲᛷᛷᲇ;->ᲇᲇᲇᛱ:Ljava/util/List;

    .line 4
    .line 5
    invoke-interface {p0}, Ljava/util/List;->size()I

    .line 6
    .line 7
    .line 8
    move-result p0

    .line 9
    return p0
.end method
