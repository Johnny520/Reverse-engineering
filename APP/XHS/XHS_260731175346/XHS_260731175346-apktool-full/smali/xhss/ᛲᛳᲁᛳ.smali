.class public final Lxhss/ᛲᛳᲁᛳ;
.super Ljava/lang/Object;
.source "r8-map-id-684deb5fba33a691397d1324861b0a91cfdff049bb058f400176b68a1f4afccc"


# instance fields
.field public ᛱᛱᛲᲇ:I

.field public ᛳᲁᲇᛸ:I

.field public final ᛷᛴᛷᛱ:Z

.field public final ᛷᛵᛵᲈ:[B

.field public ᲀᲇᛳᲁ:Lxhss/ᛲᛳᲁᛳ;

.field public ᲇᛴᲇᛵ:Z

.field public ᲇᛶᛴᲀ:Lxhss/ᛲᛳᲁᛳ;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    const/16 v0, 0x2000

    .line 5
    .line 6
    new-array v0, v0, [B

    .line 7
    .line 8
    iput-object v0, p0, Lxhss/ᛲᛳᲁᛳ;->ᛷᛵᛵᲈ:[B

    .line 9
    .line 10
    const/4 v0, 0x1

    .line 11
    iput-boolean v0, p0, Lxhss/ᛲᛳᲁᛳ;->ᛷᛴᛷᛱ:Z

    .line 12
    .line 13
    const/4 v0, 0x0

    .line 14
    iput-boolean v0, p0, Lxhss/ᛲᛳᲁᛳ;->ᲇᛴᲇᛵ:Z

    .line 15
    .line 16
    return-void
.end method

.method public constructor <init>([BIIZ)V
    .locals 0

    .line 17
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 18
    iput-object p1, p0, Lxhss/ᛲᛳᲁᛳ;->ᛷᛵᛵᲈ:[B

    .line 19
    iput p2, p0, Lxhss/ᛲᛳᲁᛳ;->ᛱᛱᛲᲇ:I

    .line 20
    iput p3, p0, Lxhss/ᛲᛳᲁᛳ;->ᛳᲁᲇᛸ:I

    .line 21
    iput-boolean p4, p0, Lxhss/ᛲᛳᲁᛳ;->ᲇᛴᲇᛵ:Z

    const/4 p1, 0x0

    .line 22
    iput-boolean p1, p0, Lxhss/ᛲᛳᲁᛳ;->ᛷᛴᛷᛱ:Z

    return-void
.end method


# virtual methods
.method public final ᛱᛱᛲᲇ(Lxhss/ᛲᛳᲁᛳ;)V
    .locals 1

    .line 1
    iput-object p0, p1, Lxhss/ᛲᛳᲁᛳ;->ᲀᲇᛳᲁ:Lxhss/ᛲᛳᲁᛳ;

    .line 2
    .line 3
    iget-object v0, p0, Lxhss/ᛲᛳᲁᛳ;->ᲇᛶᛴᲀ:Lxhss/ᛲᛳᲁᛳ;

    .line 4
    .line 5
    iput-object v0, p1, Lxhss/ᛲᛳᲁᛳ;->ᲇᛶᛴᲀ:Lxhss/ᛲᛳᲁᛳ;

    .line 6
    .line 7
    iget-object v0, p0, Lxhss/ᛲᛳᲁᛳ;->ᲇᛶᛴᲀ:Lxhss/ᛲᛳᲁᛳ;

    .line 8
    .line 9
    iput-object p1, v0, Lxhss/ᛲᛳᲁᛳ;->ᲀᲇᛳᲁ:Lxhss/ᛲᛳᲁᛳ;

    .line 10
    .line 11
    iput-object p1, p0, Lxhss/ᛲᛳᲁᛳ;->ᲇᛶᛴᲀ:Lxhss/ᛲᛳᲁᛳ;

    .line 12
    .line 13
    return-void
.end method

.method public final ᛳᲁᲇᛸ()Lxhss/ᛲᛳᲁᛳ;
    .locals 4

    .line 1
    const/4 v0, 0x1

    .line 2
    iput-boolean v0, p0, Lxhss/ᛲᛳᲁᛳ;->ᲇᛴᲇᛵ:Z

    .line 3
    .line 4
    new-instance v1, Lxhss/ᛲᛳᲁᛳ;

    .line 5
    .line 6
    iget v2, p0, Lxhss/ᛲᛳᲁᛳ;->ᛱᛱᛲᲇ:I

    .line 7
    .line 8
    iget v3, p0, Lxhss/ᛲᛳᲁᛳ;->ᛳᲁᲇᛸ:I

    .line 9
    .line 10
    iget-object p0, p0, Lxhss/ᛲᛳᲁᛳ;->ᛷᛵᛵᲈ:[B

    .line 11
    .line 12
    invoke-direct {v1, p0, v2, v3, v0}, Lxhss/ᛲᛳᲁᛳ;-><init>([BIIZ)V

    .line 13
    .line 14
    .line 15
    return-object v1
.end method

.method public final ᛷᛵᛵᲈ()Lxhss/ᛲᛳᲁᛳ;
    .locals 4

    .line 1
    iget-object v0, p0, Lxhss/ᛲᛳᲁᛳ;->ᲇᛶᛴᲀ:Lxhss/ᛲᛳᲁᛳ;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-eq v0, p0, :cond_0

    .line 5
    .line 6
    move-object v2, v0

    .line 7
    goto :goto_0

    .line 8
    :cond_0
    move-object v2, v1

    .line 9
    :goto_0
    iget-object v3, p0, Lxhss/ᛲᛳᲁᛳ;->ᲀᲇᛳᲁ:Lxhss/ᛲᛳᲁᛳ;

    .line 10
    .line 11
    iput-object v0, v3, Lxhss/ᛲᛳᲁᛳ;->ᲇᛶᛴᲀ:Lxhss/ᛲᛳᲁᛳ;

    .line 12
    .line 13
    iget-object v0, p0, Lxhss/ᛲᛳᲁᛳ;->ᲇᛶᛴᲀ:Lxhss/ᛲᛳᲁᛳ;

    .line 14
    .line 15
    iput-object v3, v0, Lxhss/ᛲᛳᲁᛳ;->ᲀᲇᛳᲁ:Lxhss/ᛲᛳᲁᛳ;

    .line 16
    .line 17
    iput-object v1, p0, Lxhss/ᛲᛳᲁᛳ;->ᲇᛶᛴᲀ:Lxhss/ᛲᛳᲁᛳ;

    .line 18
    .line 19
    iput-object v1, p0, Lxhss/ᛲᛳᲁᛳ;->ᲀᲇᛳᲁ:Lxhss/ᛲᛳᲁᛳ;

    .line 20
    .line 21
    return-object v2
.end method

.method public final ᲇᛴᲇᛵ(Lxhss/ᛲᛳᲁᛳ;I)V
    .locals 5

    .line 1
    iget-object v0, p1, Lxhss/ᛲᛳᲁᛳ;->ᛷᛵᛵᲈ:[B

    .line 2
    .line 3
    iget-boolean v1, p1, Lxhss/ᛲᛳᲁᛳ;->ᛷᛴᛷᛱ:Z

    .line 4
    .line 5
    if-eqz v1, :cond_3

    .line 6
    .line 7
    iget v1, p1, Lxhss/ᛲᛳᲁᛳ;->ᛳᲁᲇᛸ:I

    .line 8
    .line 9
    add-int v2, v1, p2

    .line 10
    .line 11
    const/16 v3, 0x2000

    .line 12
    .line 13
    if-le v2, v3, :cond_2

    .line 14
    .line 15
    iget-boolean v4, p1, Lxhss/ᛲᛳᲁᛳ;->ᲇᛴᲇᛵ:Z

    .line 16
    .line 17
    if-nez v4, :cond_1

    .line 18
    .line 19
    iget v4, p1, Lxhss/ᛲᛳᲁᛳ;->ᛱᛱᛲᲇ:I

    .line 20
    .line 21
    sub-int/2addr v2, v4

    .line 22
    if-gt v2, v3, :cond_0

    .line 23
    .line 24
    invoke-static {v0, v0, v4, v1}, Lxhss/ᛲᛷᲁᲁ;->ᛸᛶᛴᲈ([B[BII)V

    .line 25
    .line 26
    .line 27
    iget v1, p1, Lxhss/ᛲᛳᲁᛳ;->ᛳᲁᲇᛸ:I

    .line 28
    .line 29
    iget v2, p1, Lxhss/ᛲᛳᲁᛳ;->ᛱᛱᛲᲇ:I

    .line 30
    .line 31
    sub-int/2addr v1, v2

    .line 32
    iput v1, p1, Lxhss/ᛲᛳᲁᛳ;->ᛳᲁᲇᛸ:I

    .line 33
    .line 34
    const/4 v2, 0x0

    .line 35
    iput v2, p1, Lxhss/ᛲᛳᲁᛳ;->ᛱᛱᛲᲇ:I

    .line 36
    .line 37
    goto :goto_0

    .line 38
    :cond_0
    new-instance p0, Ljava/lang/IllegalArgumentException;

    .line 39
    .line 40
    invoke-direct {p0}, Ljava/lang/IllegalArgumentException;-><init>()V

    .line 41
    .line 42
    .line 43
    throw p0

    .line 44
    :cond_1
    new-instance p0, Ljava/lang/IllegalArgumentException;

    .line 45
    .line 46
    invoke-direct {p0}, Ljava/lang/IllegalArgumentException;-><init>()V

    .line 47
    .line 48
    .line 49
    throw p0

    .line 50
    :cond_2
    :goto_0
    iget v2, p0, Lxhss/ᛲᛳᲁᛳ;->ᛱᛱᛲᲇ:I

    .line 51
    .line 52
    add-int v3, v2, p2

    .line 53
    .line 54
    sub-int/2addr v3, v2

    .line 55
    iget-object v4, p0, Lxhss/ᛲᛳᲁᛳ;->ᛷᛵᛵᲈ:[B

    .line 56
    .line 57
    invoke-static {v4, v2, v0, v1, v3}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 58
    .line 59
    .line 60
    iget v0, p1, Lxhss/ᛲᛳᲁᛳ;->ᛳᲁᲇᛸ:I

    .line 61
    .line 62
    add-int/2addr v0, p2

    .line 63
    iput v0, p1, Lxhss/ᛲᛳᲁᛳ;->ᛳᲁᲇᛸ:I

    .line 64
    .line 65
    iget p1, p0, Lxhss/ᛲᛳᲁᛳ;->ᛱᛱᛲᲇ:I

    .line 66
    .line 67
    add-int/2addr p1, p2

    .line 68
    iput p1, p0, Lxhss/ᛲᛳᲁᛳ;->ᛱᛱᛲᲇ:I

    .line 69
    .line 70
    return-void

    .line 71
    :cond_3
    const-string p0, "only owner can write"

    .line 72
    .line 73
    invoke-static {p0}, Lxhss/ᛵᲈᲁᲈ;->ᛶᲇᲈᛸ(Ljava/lang/String;)V

    .line 74
    .line 75
    .line 76
    return-void
.end method
