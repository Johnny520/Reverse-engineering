.class public final Lxhss/ᛸᲁᛷᛱ;
.super Lxhss/ᛱᛱᛷᛸ;
.source "r8-map-id-684deb5fba33a691397d1324861b0a91cfdff049bb058f400176b68a1f4afccc"


# instance fields
.field public final synthetic ᛳᲁᲇᛸ:Lxhss/ᛱᛱᛷᛸ;

.field public final synthetic ᲇᛴᲇᛵ:Ljava/util/concurrent/ThreadPoolExecutor;


# direct methods
.method public constructor <init>(Lxhss/ᛱᛱᛷᛸ;Ljava/util/concurrent/ThreadPoolExecutor;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lxhss/ᛸᲁᛷᛱ;->ᛳᲁᲇᛸ:Lxhss/ᛱᛱᛷᛸ;

    .line 5
    .line 6
    iput-object p2, p0, Lxhss/ᛸᲁᛷᛱ;->ᲇᛴᲇᛵ:Ljava/util/concurrent/ThreadPoolExecutor;

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final ᛸᛲᲀᛵ(Lxhss/ᲇᛸᛶ;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lxhss/ᛸᲁᛷᛱ;->ᲇᛴᲇᛵ:Ljava/util/concurrent/ThreadPoolExecutor;

    .line 2
    .line 3
    :try_start_0
    iget-object p0, p0, Lxhss/ᛸᲁᛷᛱ;->ᛳᲁᲇᛸ:Lxhss/ᛱᛱᛷᛸ;

    .line 4
    .line 5
    invoke-virtual {p0, p1}, Lxhss/ᛱᛱᛷᛸ;->ᛸᛲᲀᛵ(Lxhss/ᲇᛸᛶ;)V
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

.method public final ᛸᛴᛶᛳ(Ljava/lang/Throwable;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lxhss/ᛸᲁᛷᛱ;->ᲇᛴᲇᛵ:Ljava/util/concurrent/ThreadPoolExecutor;

    .line 2
    .line 3
    :try_start_0
    iget-object p0, p0, Lxhss/ᛸᲁᛷᛱ;->ᛳᲁᲇᛸ:Lxhss/ᛱᛱᛷᛸ;

    .line 4
    .line 5
    invoke-virtual {p0, p1}, Lxhss/ᛱᛱᛷᛸ;->ᛸᛴᛶᛳ(Ljava/lang/Throwable;)V
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
