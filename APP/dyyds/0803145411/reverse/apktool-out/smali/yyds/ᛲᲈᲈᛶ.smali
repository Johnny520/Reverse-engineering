.class public final Lyyds/ᛲᲈᲈᛶ;
.super Ljava/lang/Object;
.source "r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9"


# instance fields
.field public final ᛲᛴᛳᛲ:Z

.field public final ᛲᲈᲁ:[B

.field public ᛵᛸᛸᛷ:I

.field public ᛶᛷᛲᲁ:Lyyds/ᛲᲈᲈᛶ;

.field public ᲀᛲᛳᲀ:I

.field public ᲇᲇᲇᛱ:Lyyds/ᛲᲈᲈᛶ;

.field public ᲇᲈᛵᛷ:Z


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
    iput-object v0, p0, Lyyds/ᛲᲈᲈᛶ;->ᛲᲈᲁ:[B

    .line 9
    .line 10
    const/4 v0, 0x1

    .line 11
    iput-boolean v0, p0, Lyyds/ᛲᲈᲈᛶ;->ᛲᛴᛳᛲ:Z

    .line 12
    .line 13
    const/4 v0, 0x0

    .line 14
    iput-boolean v0, p0, Lyyds/ᛲᲈᲈᛶ;->ᲇᲈᛵᛷ:Z

    .line 15
    .line 16
    return-void
.end method

.method public constructor <init>([BIIZ)V
    .locals 0

    .line 17
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 18
    iput-object p1, p0, Lyyds/ᛲᲈᲈᛶ;->ᛲᲈᲁ:[B

    .line 19
    iput p2, p0, Lyyds/ᛲᲈᲈᛶ;->ᛵᛸᛸᛷ:I

    .line 20
    iput p3, p0, Lyyds/ᛲᲈᲈᛶ;->ᲀᛲᛳᲀ:I

    .line 21
    iput-boolean p4, p0, Lyyds/ᛲᲈᲈᛶ;->ᲇᲈᛵᛷ:Z

    const/4 p1, 0x0

    .line 22
    iput-boolean p1, p0, Lyyds/ᛲᲈᲈᛶ;->ᛲᛴᛳᛲ:Z

    return-void
.end method


# virtual methods
.method public final ᛲᲈᲁ()Lyyds/ᛲᲈᲈᛶ;
    .locals 4

    .line 1
    iget-object v0, p0, Lyyds/ᛲᲈᲈᛶ;->ᲇᲇᲇᛱ:Lyyds/ᛲᲈᲈᛶ;

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
    iget-object v3, p0, Lyyds/ᛲᲈᲈᛶ;->ᛶᛷᛲᲁ:Lyyds/ᛲᲈᲈᛶ;

    .line 10
    .line 11
    iput-object v0, v3, Lyyds/ᛲᲈᲈᛶ;->ᲇᲇᲇᛱ:Lyyds/ᛲᲈᲈᛶ;

    .line 12
    .line 13
    iget-object v0, p0, Lyyds/ᛲᲈᲈᛶ;->ᲇᲇᲇᛱ:Lyyds/ᛲᲈᲈᛶ;

    .line 14
    .line 15
    iput-object v3, v0, Lyyds/ᛲᲈᲈᛶ;->ᛶᛷᛲᲁ:Lyyds/ᛲᲈᲈᛶ;

    .line 16
    .line 17
    iput-object v1, p0, Lyyds/ᛲᲈᲈᛶ;->ᲇᲇᲇᛱ:Lyyds/ᛲᲈᲈᛶ;

    .line 18
    .line 19
    iput-object v1, p0, Lyyds/ᛲᲈᲈᛶ;->ᛶᛷᛲᲁ:Lyyds/ᛲᲈᲈᛶ;

    .line 20
    .line 21
    return-object v2
.end method

.method public final ᛵᛸᛸᛷ(Lyyds/ᛲᲈᲈᛶ;)V
    .locals 1

    .line 1
    iput-object p0, p1, Lyyds/ᛲᲈᲈᛶ;->ᛶᛷᛲᲁ:Lyyds/ᛲᲈᲈᛶ;

    .line 2
    .line 3
    iget-object v0, p0, Lyyds/ᛲᲈᲈᛶ;->ᲇᲇᲇᛱ:Lyyds/ᛲᲈᲈᛶ;

    .line 4
    .line 5
    iput-object v0, p1, Lyyds/ᛲᲈᲈᛶ;->ᲇᲇᲇᛱ:Lyyds/ᛲᲈᲈᛶ;

    .line 6
    .line 7
    iget-object v0, p0, Lyyds/ᛲᲈᲈᛶ;->ᲇᲇᲇᛱ:Lyyds/ᛲᲈᲈᛶ;

    .line 8
    .line 9
    iput-object p1, v0, Lyyds/ᛲᲈᲈᛶ;->ᛶᛷᛲᲁ:Lyyds/ᛲᲈᲈᛶ;

    .line 10
    .line 11
    iput-object p1, p0, Lyyds/ᛲᲈᲈᛶ;->ᲇᲇᲇᛱ:Lyyds/ᛲᲈᲈᛶ;

    .line 12
    .line 13
    return-void
.end method

.method public final ᲀᛲᛳᲀ()Lyyds/ᛲᲈᲈᛶ;
    .locals 4

    .line 1
    const/4 v0, 0x1

    .line 2
    iput-boolean v0, p0, Lyyds/ᛲᲈᲈᛶ;->ᲇᲈᛵᛷ:Z

    .line 3
    .line 4
    new-instance v1, Lyyds/ᛲᲈᲈᛶ;

    .line 5
    .line 6
    iget v2, p0, Lyyds/ᛲᲈᲈᛶ;->ᛵᛸᛸᛷ:I

    .line 7
    .line 8
    iget v3, p0, Lyyds/ᛲᲈᲈᛶ;->ᲀᛲᛳᲀ:I

    .line 9
    .line 10
    iget-object p0, p0, Lyyds/ᛲᲈᲈᛶ;->ᛲᲈᲁ:[B

    .line 11
    .line 12
    invoke-direct {v1, p0, v2, v3, v0}, Lyyds/ᛲᲈᲈᛶ;-><init>([BIIZ)V

    .line 13
    .line 14
    .line 15
    return-object v1
.end method

.method public final ᲇᲈᛵᛷ(Lyyds/ᛲᲈᲈᛶ;I)V
    .locals 7

    .line 1
    iget-boolean v0, p1, Lyyds/ᛲᲈᲈᛶ;->ᛲᛴᛳᛲ:Z

    .line 2
    .line 3
    if-eqz v0, :cond_3

    .line 4
    .line 5
    iget v5, p1, Lyyds/ᛲᲈᲈᛶ;->ᲀᛲᛳᲀ:I

    .line 6
    .line 7
    add-int v0, v5, p2

    .line 8
    .line 9
    const/16 v1, 0x2000

    .line 10
    .line 11
    if-le v0, v1, :cond_2

    .line 12
    .line 13
    iget-boolean v2, p1, Lyyds/ᛲᲈᲈᛶ;->ᲇᲈᛵᛷ:Z

    .line 14
    .line 15
    if-nez v2, :cond_1

    .line 16
    .line 17
    iget v4, p1, Lyyds/ᛲᲈᲈᛶ;->ᛵᛸᛸᛷ:I

    .line 18
    .line 19
    sub-int/2addr v0, v4

    .line 20
    if-gt v0, v1, :cond_0

    .line 21
    .line 22
    iget-object v1, p1, Lyyds/ᛲᲈᲈᛶ;->ᛲᲈᲁ:[B

    .line 23
    .line 24
    const/4 v3, 0x0

    .line 25
    const/4 v6, 0x2

    .line 26
    move-object v2, v1

    .line 27
    invoke-static/range {v1 .. v6}, Lyyds/ᲀᲀᛷᛸ;->ᛲᛶᛱᲈ([B[BIIII)V

    .line 28
    .line 29
    .line 30
    iget v0, p1, Lyyds/ᛲᲈᲈᛶ;->ᲀᛲᛳᲀ:I

    .line 31
    .line 32
    iget v1, p1, Lyyds/ᛲᲈᲈᛶ;->ᛵᛸᛸᛷ:I

    .line 33
    .line 34
    sub-int v5, v0, v1

    .line 35
    .line 36
    iput v5, p1, Lyyds/ᛲᲈᲈᛶ;->ᲀᛲᛳᲀ:I

    .line 37
    .line 38
    const/4 v0, 0x0

    .line 39
    iput v0, p1, Lyyds/ᛲᲈᲈᛶ;->ᛵᛸᛸᛷ:I

    .line 40
    .line 41
    goto :goto_0

    .line 42
    :cond_0
    invoke-static {}, Lyyds/ᛷᲈᲈᛶ;->ᛲᲈᲁ()V

    .line 43
    .line 44
    .line 45
    return-void

    .line 46
    :cond_1
    invoke-static {}, Lyyds/ᛷᲈᲈᛶ;->ᛲᲈᲁ()V

    .line 47
    .line 48
    .line 49
    return-void

    .line 50
    :cond_2
    :goto_0
    iget-object v0, p1, Lyyds/ᛲᲈᲈᛶ;->ᛲᲈᲁ:[B

    .line 51
    .line 52
    iget v1, p0, Lyyds/ᛲᲈᲈᛶ;->ᛵᛸᛸᛷ:I

    .line 53
    .line 54
    add-int v2, v1, p2

    .line 55
    .line 56
    iget-object v3, p0, Lyyds/ᛲᲈᲈᛶ;->ᛲᲈᲁ:[B

    .line 57
    .line 58
    invoke-static {v3, v0, v5, v1, v2}, Lyyds/ᲀᲀᛷᛸ;->ᛶᛸᲀᲁ([B[BIII)V

    .line 59
    .line 60
    .line 61
    iget v0, p1, Lyyds/ᛲᲈᲈᛶ;->ᲀᛲᛳᲀ:I

    .line 62
    .line 63
    add-int/2addr v0, p2

    .line 64
    iput v0, p1, Lyyds/ᛲᲈᲈᛶ;->ᲀᛲᛳᲀ:I

    .line 65
    .line 66
    iget p1, p0, Lyyds/ᛲᲈᲈᛶ;->ᛵᛸᛸᛷ:I

    .line 67
    .line 68
    add-int/2addr p1, p2

    .line 69
    iput p1, p0, Lyyds/ᛲᲈᲈᛶ;->ᛵᛸᛸᛷ:I

    .line 70
    .line 71
    return-void

    .line 72
    :cond_3
    const-string p0, "only owner can write"

    .line 73
    .line 74
    invoke-static {p0}, Lyyds/ᛱᛸᛶᛲ;->ᛷᛵᲇᲀ(Ljava/lang/String;)V

    .line 75
    .line 76
    .line 77
    return-void
.end method
