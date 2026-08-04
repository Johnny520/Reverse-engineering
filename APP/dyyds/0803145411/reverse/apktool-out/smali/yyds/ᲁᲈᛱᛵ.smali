.class public final Lyyds/ᲁᲈᛱᛵ;
.super Ljava/lang/Object;
.source "r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9"

# interfaces
.implements Lyyds/ᲁᛲᛱᛱ;


# instance fields
.field public final ᛲᛴᛳᛲ:Ljava/util/concurrent/LinkedBlockingQueue;

.field public volatile ᲀᛲᛳᲀ:Z

.field public final ᲇᲈᛵᛷ:Ljava/util/concurrent/ConcurrentHashMap;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x0

    .line 5
    iput-boolean v0, p0, Lyyds/ᲁᲈᛱᛵ;->ᲀᛲᛳᲀ:Z

    .line 6
    .line 7
    new-instance v0, Ljava/util/concurrent/ConcurrentHashMap;

    .line 8
    .line 9
    invoke-direct {v0}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    .line 10
    .line 11
    .line 12
    iput-object v0, p0, Lyyds/ᲁᲈᛱᛵ;->ᲇᲈᛵᛷ:Ljava/util/concurrent/ConcurrentHashMap;

    .line 13
    .line 14
    new-instance v0, Ljava/util/concurrent/LinkedBlockingQueue;

    .line 15
    .line 16
    invoke-direct {v0}, Ljava/util/concurrent/LinkedBlockingQueue;-><init>()V

    .line 17
    .line 18
    .line 19
    iput-object v0, p0, Lyyds/ᲁᲈᛱᛵ;->ᛲᛴᛳᛲ:Ljava/util/concurrent/LinkedBlockingQueue;

    .line 20
    .line 21
    return-void
.end method


# virtual methods
.method public final declared-synchronized ᛵᛸᛸᛷ(Ljava/lang/String;)Lyyds/ᛳᲇᲀᲀ;
    .locals 3

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    iget-object v0, p0, Lyyds/ᲁᲈᛱᛵ;->ᲇᲈᛵᛷ:Ljava/util/concurrent/ConcurrentHashMap;

    .line 3
    .line 4
    invoke-virtual {v0, p1}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    check-cast v0, Lyyds/ᛵᛴᛳᛱ;

    .line 9
    .line 10
    if-nez v0, :cond_0

    .line 11
    .line 12
    new-instance v0, Lyyds/ᛵᛴᛳᛱ;

    .line 13
    .line 14
    iget-object v1, p0, Lyyds/ᲁᲈᛱᛵ;->ᛲᛴᛳᛲ:Ljava/util/concurrent/LinkedBlockingQueue;

    .line 15
    .line 16
    iget-boolean v2, p0, Lyyds/ᲁᲈᛱᛵ;->ᲀᛲᛳᲀ:Z

    .line 17
    .line 18
    invoke-direct {v0, p1, v1, v2}, Lyyds/ᛵᛴᛳᛱ;-><init>(Ljava/lang/String;Ljava/util/concurrent/LinkedBlockingQueue;Z)V

    .line 19
    .line 20
    .line 21
    iget-object v1, p0, Lyyds/ᲁᲈᛱᛵ;->ᲇᲈᛵᛷ:Ljava/util/concurrent/ConcurrentHashMap;

    .line 22
    .line 23
    invoke-virtual {v1, p1, v0}, Ljava/util/concurrent/ConcurrentHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 24
    .line 25
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
    return-object v0

    .line 31
    :goto_1
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 32
    throw p1
.end method
