.class public final Lyyds/ᛴᛱᛸᛸ$ᛲᛴᛳᛲ;
.super Ljava/lang/Object;
.source "r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lyyds/ᛴᛱᛸᛸ;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "\u16f2\u16f4\u16f3\u16f2"
.end annotation


# instance fields
.field private final ᛲᲈᲁ:Lyyds/ᛴᛱᛸᛸ$ᛲᲈᲁ;

.field private final ᛵᛸᛸᛷ:[B

.field private final ᲀᛲᛳᲀ:[B

.field private final ᲇᲈᛵᛷ:Ljava/util/concurrent/atomic/AtomicBoolean;


# direct methods
.method public constructor <init>(Lyyds/ᛴᛱᛸᛸ$ᛲᲈᲁ;[B[B)V
    .locals 2

    .line 1
    const-wide v0, -0x216f3e68a836eL

    .line 2
    .line 3
    .line 4
    .line 5
    .line 6
    invoke-static {v0, v1}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 7
    .line 8
    .line 9
    const-wide v0, -0x216fbe68a836eL

    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    invoke-static {v0, v1}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 15
    .line 16
    .line 17
    const-wide v0, -0x21705e68a836eL

    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    invoke-static {v0, v1}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 23
    .line 24
    .line 25
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 26
    .line 27
    .line 28
    iput-object p1, p0, Lyyds/ᛴᛱᛸᛸ$ᛲᛴᛳᛲ;->ᛲᲈᲁ:Lyyds/ᛴᛱᛸᛸ$ᛲᲈᲁ;

    .line 29
    .line 30
    iput-object p2, p0, Lyyds/ᛴᛱᛸᛸ$ᛲᛴᛳᛲ;->ᛵᛸᛸᛷ:[B

    .line 31
    .line 32
    iput-object p3, p0, Lyyds/ᛴᛱᛸᛸ$ᛲᛴᛳᛲ;->ᲀᛲᛳᲀ:[B

    .line 33
    .line 34
    new-instance p1, Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 35
    .line 36
    const/4 p2, 0x0

    .line 37
    invoke-direct {p1, p2}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>(Z)V

    .line 38
    .line 39
    .line 40
    iput-object p1, p0, Lyyds/ᛴᛱᛸᛸ$ᛲᛴᛳᛲ;->ᲇᲈᛵᛷ:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 41
    .line 42
    return-void
.end method


# virtual methods
.method public final ᛲᲈᲁ()V
    .locals 2

    .line 1
    iget-object p0, p0, Lyyds/ᛴᛱᛸᛸ$ᛲᛴᛳᛲ;->ᲇᲈᛵᛷ:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 2
    .line 3
    const/4 v0, 0x0

    .line 4
    const/4 v1, 0x1

    .line 5
    invoke-virtual {p0, v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;->compareAndSet(ZZ)Z

    .line 6
    .line 7
    .line 8
    move-result p0

    .line 9
    if-eqz p0, :cond_0

    .line 10
    .line 11
    return-void

    .line 12
    :cond_0
    sget-object p0, Lyyds/ᛴᛱᛸᛸ;->ᛲᲈᲁ:Lyyds/ᛴᛱᛸᛸ;

    .line 13
    .line 14
    invoke-static {p0}, Lyyds/ᛴᛱᛸᛸ;->ᛲᲈᲁ(Lyyds/ᛴᛱᛸᛸ;)Ljava/lang/SecurityException;

    .line 15
    .line 16
    .line 17
    move-result-object p0

    .line 18
    throw p0
.end method

.method public final ᛵᛸᛸᛷ()Lyyds/ᛴᛱᛸᛸ$ᛲᲈᲁ;
    .locals 0

    .line 1
    iget-object p0, p0, Lyyds/ᛴᛱᛸᛸ$ᛲᛴᛳᛲ;->ᛲᲈᲁ:Lyyds/ᛴᛱᛸᛸ$ᛲᲈᲁ;

    .line 2
    .line 3
    return-object p0
.end method

.method public final ᲀᛲᛳᲀ()[B
    .locals 0

    .line 1
    iget-object p0, p0, Lyyds/ᛴᛱᛸᛸ$ᛲᛴᛳᛲ;->ᲀᛲᛳᲀ:[B

    .line 2
    .line 3
    return-object p0
.end method

.method public final ᲇᲈᛵᛷ()[B
    .locals 0

    .line 1
    iget-object p0, p0, Lyyds/ᛴᛱᛸᛸ$ᛲᛴᛳᛲ;->ᛵᛸᛸᛷ:[B

    .line 2
    .line 3
    return-object p0
.end method
