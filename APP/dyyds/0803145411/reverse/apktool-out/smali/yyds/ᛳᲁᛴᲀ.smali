.class public final Lyyds/ᛳᲁᛴᲀ;
.super Lyyds/ᛱᛸᲁᲇ;
.source "r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9"


# instance fields
.field public final ᛶᛷᛲᲁ:Lyyds/ᛲᲁᲀᛱ;

.field public final ᲇᲇᲇᛱ:Ljava/lang/Thread;


# direct methods
.method public constructor <init>(Lyyds/ᲁᛴᛲ;Ljava/lang/Thread;Lyyds/ᛲᲁᲀᛱ;)V
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    invoke-direct {p0, p1, v0}, Lyyds/ᛱᛸᲁᲇ;-><init>(Lyyds/ᲁᛴᛲ;Z)V

    .line 3
    .line 4
    .line 5
    iput-object p2, p0, Lyyds/ᛳᲁᛴᲀ;->ᲇᲇᲇᛱ:Ljava/lang/Thread;

    .line 6
    .line 7
    iput-object p3, p0, Lyyds/ᛳᲁᛴᲀ;->ᛶᛷᛲᲁ:Lyyds/ᛲᲁᲀᛱ;

    .line 8
    .line 9
    return-void
.end method


# virtual methods
.method public final ᛲᛳᛶᲁ(Ljava/lang/Object;)V
    .locals 0

    .line 1
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    iget-object p0, p0, Lyyds/ᛳᲁᛴᲀ;->ᲇᲇᲇᛱ:Ljava/lang/Thread;

    .line 6
    .line 7
    invoke-static {p1, p0}, Lyyds/ᛷᛴᲇᛲ;->ᛲᲈᲁ(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 8
    .line 9
    .line 10
    move-result p1

    .line 11
    if-nez p1, :cond_0

    .line 12
    .line 13
    invoke-static {p0}, Ljava/util/concurrent/locks/LockSupport;->unpark(Ljava/lang/Thread;)V

    .line 14
    .line 15
    .line 16
    :cond_0
    return-void
.end method
