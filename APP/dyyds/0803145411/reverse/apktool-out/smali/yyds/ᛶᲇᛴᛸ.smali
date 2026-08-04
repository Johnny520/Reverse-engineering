.class public final Lyyds/ᛶᲇᛴᛸ;
.super Lyyds/ᛷᛸ;
.source "r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9"


# instance fields
.field public final ᛷᛲᲈᛱ:Ljava/util/concurrent/ExecutorService;

.field public final ᛷᲈᲈᲁ:Ljava/lang/Object;


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Lyyds/ᛷᛱᛳᛳ;

    .line 5
    .line 6
    invoke-direct {v0}, Lyyds/ᛷᛱᛳᛳ;-><init>()V

    .line 7
    .line 8
    .line 9
    const/4 v1, 0x4

    .line 10
    invoke-static {v1, v0}, Ljava/util/concurrent/Executors;->newFixedThreadPool(ILjava/util/concurrent/ThreadFactory;)Ljava/util/concurrent/ExecutorService;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    iput-object v0, p0, Lyyds/ᛶᲇᛴᛸ;->ᛷᛲᲈᛱ:Ljava/util/concurrent/ExecutorService;

    .line 15
    .line 16
    return-void
.end method
