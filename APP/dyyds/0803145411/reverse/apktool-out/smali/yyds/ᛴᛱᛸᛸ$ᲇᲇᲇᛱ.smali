.class final Lyyds/ᛴᛱᛸᛸ$ᲇᲇᲇᛱ;
.super Ljava/lang/Object;
.source "r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lyyds/ᛴᛱᛸᛸ;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "\u1c87\u1c87\u1c87\u16f1"
.end annotation


# instance fields
.field private final ᛲᲈᲁ:[B

.field private final ᛵᛸᛸᛷ:[B

.field private final ᲀᛲᛳᲀ:Ljava/util/concurrent/atomic/AtomicLong;


# direct methods
.method public constructor <init>([B[B)V
    .locals 2

    .line 1
    const-wide v0, -0x1edcce68a836eL

    .line 2
    .line 3
    .line 4
    .line 5
    .line 6
    invoke-static {v0, v1}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 7
    .line 8
    .line 9
    const-wide v0, -0x1eddae68a836eL

    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    invoke-static {v0, v1}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 15
    .line 16
    .line 17
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 18
    .line 19
    .line 20
    iput-object p1, p0, Lyyds/ᛴᛱᛸᛸ$ᲇᲇᲇᛱ;->ᛲᲈᲁ:[B

    .line 21
    .line 22
    iput-object p2, p0, Lyyds/ᛴᛱᛸᛸ$ᲇᲇᲇᛱ;->ᛵᛸᛸᛷ:[B

    .line 23
    .line 24
    new-instance p1, Ljava/util/concurrent/atomic/AtomicLong;

    .line 25
    .line 26
    const-wide/16 v0, 0x1

    .line 27
    .line 28
    invoke-direct {p1, v0, v1}, Ljava/util/concurrent/atomic/AtomicLong;-><init>(J)V

    .line 29
    .line 30
    .line 31
    iput-object p1, p0, Lyyds/ᛴᛱᛸᛸ$ᲇᲇᲇᛱ;->ᲀᛲᛳᲀ:Ljava/util/concurrent/atomic/AtomicLong;

    .line 32
    .line 33
    return-void
.end method


# virtual methods
.method public final ᛲᲈᲁ()Ljava/util/concurrent/atomic/AtomicLong;
    .locals 0

    .line 1
    iget-object p0, p0, Lyyds/ᛴᛱᛸᛸ$ᲇᲇᲇᛱ;->ᲀᛲᛳᲀ:Ljava/util/concurrent/atomic/AtomicLong;

    .line 2
    .line 3
    return-object p0
.end method

.method public final ᛵᛸᛸᛷ()[B
    .locals 0

    .line 1
    iget-object p0, p0, Lyyds/ᛴᛱᛸᛸ$ᲇᲇᲇᛱ;->ᛵᛸᛸᛷ:[B

    .line 2
    .line 3
    return-object p0
.end method

.method public final ᲀᛲᛳᲀ()[B
    .locals 0

    .line 1
    iget-object p0, p0, Lyyds/ᛴᛱᛸᛸ$ᲇᲇᲇᛱ;->ᛲᲈᲁ:[B

    .line 2
    .line 3
    return-object p0
.end method
