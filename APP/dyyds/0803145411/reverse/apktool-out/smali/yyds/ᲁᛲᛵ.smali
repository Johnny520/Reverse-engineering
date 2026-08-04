.class public final Lyyds/ᲁᛲᛵ;
.super Lyyds/ᛲᲇᲁᛳ;
.source "r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9"


# instance fields
.field public final synthetic ᲀᛲᛳᲀ:Lyyds/ᛲᲇᲁᛳ;

.field public final synthetic ᲇᲈᛵᛷ:Ljava/util/concurrent/ThreadPoolExecutor;


# direct methods
.method public constructor <init>(Lyyds/ᛲᲇᲁᛳ;Ljava/util/concurrent/ThreadPoolExecutor;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lyyds/ᲁᛲᛵ;->ᲀᛲᛳᲀ:Lyyds/ᛲᲇᲁᛳ;

    .line 5
    .line 6
    iput-object p2, p0, Lyyds/ᲁᛲᛵ;->ᲇᲈᛵᛷ:Ljava/util/concurrent/ThreadPoolExecutor;

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final ᛱᲈᲁ(Ljava/lang/Throwable;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lyyds/ᲁᛲᛵ;->ᲇᲈᛵᛷ:Ljava/util/concurrent/ThreadPoolExecutor;

    .line 2
    .line 3
    :try_start_0
    iget-object p0, p0, Lyyds/ᲁᛲᛵ;->ᲀᛲᛳᲀ:Lyyds/ᛲᲇᲁᛳ;

    .line 4
    .line 5
    invoke-virtual {p0, p1}, Lyyds/ᛲᲇᲁᛳ;->ᛱᲈᲁ(Ljava/lang/Throwable;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 6
    .line 7
    .line 8
    invoke-virtual {v0}, Ljava/util/concurrent/ThreadPoolExecutor;->shutdown()V

    .line 9
    .line 10
    .line 11
    return-void

    .line 12
    :catchall_0
    move-exception p0

    .line 13
    invoke-virtual {v0}, Ljava/util/concurrent/ThreadPoolExecutor;->shutdown()V

    .line 14
    .line 15
    .line 16
    throw p0
.end method

.method public final ᛲᛳᛶᲁ(Lyyds/ᛲᛲᲇᲈ;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lyyds/ᲁᛲᛵ;->ᲇᲈᛵᛷ:Ljava/util/concurrent/ThreadPoolExecutor;

    .line 2
    .line 3
    :try_start_0
    iget-object p0, p0, Lyyds/ᲁᛲᛵ;->ᲀᛲᛳᲀ:Lyyds/ᛲᲇᲁᛳ;

    .line 4
    .line 5
    invoke-virtual {p0, p1}, Lyyds/ᛲᲇᲁᛳ;->ᛲᛳᛶᲁ(Lyyds/ᛲᛲᲇᲈ;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 6
    .line 7
    .line 8
    invoke-virtual {v0}, Ljava/util/concurrent/ThreadPoolExecutor;->shutdown()V

    .line 9
    .line 10
    .line 11
    return-void

    .line 12
    :catchall_0
    move-exception p0

    .line 13
    invoke-virtual {v0}, Ljava/util/concurrent/ThreadPoolExecutor;->shutdown()V

    .line 14
    .line 15
    .line 16
    throw p0
.end method
