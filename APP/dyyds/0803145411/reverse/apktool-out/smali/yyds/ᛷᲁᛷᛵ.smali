.class public final Lyyds/ᛷᲁᛷᛵ;
.super Ljava/lang/Object;
.source "r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9"


# instance fields
.field public final synthetic ᛲᲈᲁ:I

.field public ᛵᛸᛸᛷ:J

.field public ᲀᛲᛳᲀ:Ljava/lang/Object;


# direct methods
.method public constructor <init>()V
    .locals 2

    const/4 v0, 0x0

    iput v0, p0, Lyyds/ᛷᲁᛷᛵ;->ᛲᲈᲁ:I

    .line 26
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-wide/16 v0, 0x0

    .line 27
    iput-wide v0, p0, Lyyds/ᛷᲁᛷᛵ;->ᛵᛸᛸᛷ:J

    return-void
.end method

.method public constructor <init>(JLjava/lang/String;)V
    .locals 2

    const/4 v0, 0x1

    iput v0, p0, Lyyds/ᛷᲁᛷᛵ;->ᛲᲈᲁ:I

    const-wide v0, -0x201f8e68a836eL

    invoke-static {v0, v1}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 23
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 24
    iput-wide p1, p0, Lyyds/ᛷᲁᛷᛵ;->ᛵᛸᛸᛷ:J

    .line 25
    iput-object p3, p0, Lyyds/ᛷᲁᛷᛵ;->ᲀᛲᛳᲀ:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(JLjava/util/List;)V
    .locals 2

    .line 1
    const/4 v0, 0x3

    .line 2
    iput v0, p0, Lyyds/ᛷᲁᛷᛵ;->ᛲᲈᲁ:I

    .line 3
    .line 4
    const-wide v0, -0x15cabe68a836eL

    .line 5
    .line 6
    .line 7
    .line 8
    .line 9
    invoke-static {v0, v1}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 10
    .line 11
    .line 12
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 13
    .line 14
    .line 15
    iput-wide p1, p0, Lyyds/ᛷᲁᛷᛵ;->ᛵᛸᛸᛷ:J

    .line 16
    .line 17
    iput-object p3, p0, Lyyds/ᛷᲁᛷᛵ;->ᲀᛲᛳᲀ:Ljava/lang/Object;

    .line 18
    .line 19
    return-void
.end method

.method public constructor <init>(Lyyds/ᲀᲀᛵᲈ;)V
    .locals 2

    const/4 v0, 0x2

    iput v0, p0, Lyyds/ᛷᲁᛷᛵ;->ᛲᲈᲁ:I

    .line 20
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 21
    iput-object p1, p0, Lyyds/ᛷᲁᛷᛵ;->ᲀᛲᛳᲀ:Ljava/lang/Object;

    const-wide/32 v0, 0x40000

    .line 22
    iput-wide v0, p0, Lyyds/ᛷᲁᛷᛵ;->ᛵᛸᛸᛷ:J

    return-void
.end method


# virtual methods
.method public toString()Ljava/lang/String;
    .locals 3

    .line 1
    iget v0, p0, Lyyds/ᛷᲁᛷᛵ;->ᛲᲈᲁ:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    invoke-super {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    return-object p0

    .line 11
    :pswitch_0
    iget-object v0, p0, Lyyds/ᛷᲁᛷᛵ;->ᲀᛲᛳᲀ:Ljava/lang/Object;

    .line 12
    .line 13
    check-cast v0, Lyyds/ᛷᲁᛷᛵ;

    .line 14
    .line 15
    if-nez v0, :cond_0

    .line 16
    .line 17
    iget-wide v0, p0, Lyyds/ᛷᲁᛷᛵ;->ᛵᛸᛸᛷ:J

    .line 18
    .line 19
    invoke-static {v0, v1}, Ljava/lang/Long;->toBinaryString(J)Ljava/lang/String;

    .line 20
    .line 21
    .line 22
    move-result-object p0

    .line 23
    goto :goto_0

    .line 24
    :cond_0
    new-instance v0, Ljava/lang/StringBuilder;

    .line 25
    .line 26
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 27
    .line 28
    .line 29
    iget-object v1, p0, Lyyds/ᛷᲁᛷᛵ;->ᲀᛲᛳᲀ:Ljava/lang/Object;

    .line 30
    .line 31
    check-cast v1, Lyyds/ᛷᲁᛷᛵ;

    .line 32
    .line 33
    invoke-virtual {v1}, Lyyds/ᛷᲁᛷᛵ;->toString()Ljava/lang/String;

    .line 34
    .line 35
    .line 36
    move-result-object v1

    .line 37
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 38
    .line 39
    .line 40
    const-string v1, "xx"

    .line 41
    .line 42
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 43
    .line 44
    .line 45
    iget-wide v1, p0, Lyyds/ᛷᲁᛷᛵ;->ᛵᛸᛸᛷ:J

    .line 46
    .line 47
    invoke-static {v1, v2}, Ljava/lang/Long;->toBinaryString(J)Ljava/lang/String;

    .line 48
    .line 49
    .line 50
    move-result-object p0

    .line 51
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 52
    .line 53
    .line 54
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 55
    .line 56
    .line 57
    move-result-object p0

    .line 58
    :goto_0
    return-object p0

    .line 59
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public ᛱᲈᲁ()V
    .locals 2

    .line 1
    const-wide/16 v0, 0x0

    .line 2
    .line 3
    iput-wide v0, p0, Lyyds/ᛷᲁᛷᛵ;->ᛵᛸᛸᛷ:J

    .line 4
    .line 5
    iget-object p0, p0, Lyyds/ᛷᲁᛷᛵ;->ᲀᛲᛳᲀ:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast p0, Lyyds/ᛷᲁᛷᛵ;

    .line 8
    .line 9
    if-eqz p0, :cond_0

    .line 10
    .line 11
    invoke-virtual {p0}, Lyyds/ᛷᲁᛷᛵ;->ᛱᲈᲁ()V

    .line 12
    .line 13
    .line 14
    :cond_0
    return-void
.end method

.method public ᛲᛳᛶᲁ(I)V
    .locals 4

    .line 1
    const/16 v0, 0x40

    .line 2
    .line 3
    if-lt p1, v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {p0}, Lyyds/ᛷᲁᛷᛵ;->ᲀᛲᛳᲀ()V

    .line 6
    .line 7
    .line 8
    iget-object p0, p0, Lyyds/ᛷᲁᛷᛵ;->ᲀᛲᛳᲀ:Ljava/lang/Object;

    .line 9
    .line 10
    check-cast p0, Lyyds/ᛷᲁᛷᛵ;

    .line 11
    .line 12
    sub-int/2addr p1, v0

    .line 13
    invoke-virtual {p0, p1}, Lyyds/ᛷᲁᛷᛵ;->ᛲᛳᛶᲁ(I)V

    .line 14
    .line 15
    .line 16
    return-void

    .line 17
    :cond_0
    iget-wide v0, p0, Lyyds/ᛷᲁᛷᛵ;->ᛵᛸᛸᛷ:J

    .line 18
    .line 19
    const-wide/16 v2, 0x1

    .line 20
    .line 21
    shl-long/2addr v2, p1

    .line 22
    or-long/2addr v0, v2

    .line 23
    iput-wide v0, p0, Lyyds/ᛷᲁᛷᛵ;->ᛵᛸᛸᛷ:J

    .line 24
    .line 25
    return-void
.end method

.method public ᛲᛴᛳᛲ(IZ)V
    .locals 9

    .line 1
    const/16 v0, 0x40

    .line 2
    .line 3
    if-lt p1, v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {p0}, Lyyds/ᛷᲁᛷᛵ;->ᲀᛲᛳᲀ()V

    .line 6
    .line 7
    .line 8
    iget-object p0, p0, Lyyds/ᛷᲁᛷᛵ;->ᲀᛲᛳᲀ:Ljava/lang/Object;

    .line 9
    .line 10
    check-cast p0, Lyyds/ᛷᲁᛷᛵ;

    .line 11
    .line 12
    sub-int/2addr p1, v0

    .line 13
    invoke-virtual {p0, p1, p2}, Lyyds/ᛷᲁᛷᛵ;->ᛲᛴᛳᛲ(IZ)V

    .line 14
    .line 15
    .line 16
    return-void

    .line 17
    :cond_0
    iget-wide v0, p0, Lyyds/ᛷᲁᛷᛵ;->ᛵᛸᛸᛷ:J

    .line 18
    .line 19
    const-wide/high16 v2, -0x8000000000000000L

    .line 20
    .line 21
    and-long/2addr v2, v0

    .line 22
    const-wide/16 v4, 0x0

    .line 23
    .line 24
    cmp-long v2, v2, v4

    .line 25
    .line 26
    const/4 v3, 0x0

    .line 27
    const/4 v4, 0x1

    .line 28
    if-eqz v2, :cond_1

    .line 29
    .line 30
    move v2, v4

    .line 31
    goto :goto_0

    .line 32
    :cond_1
    move v2, v3

    .line 33
    :goto_0
    const-wide/16 v5, 0x1

    .line 34
    .line 35
    shl-long v7, v5, p1

    .line 36
    .line 37
    sub-long/2addr v7, v5

    .line 38
    and-long v5, v0, v7

    .line 39
    .line 40
    not-long v7, v7

    .line 41
    and-long/2addr v0, v7

    .line 42
    shl-long/2addr v0, v4

    .line 43
    or-long/2addr v0, v5

    .line 44
    iput-wide v0, p0, Lyyds/ᛷᲁᛷᛵ;->ᛵᛸᛸᛷ:J

    .line 45
    .line 46
    if-eqz p2, :cond_2

    .line 47
    .line 48
    invoke-virtual {p0, p1}, Lyyds/ᛷᲁᛷᛵ;->ᛲᛳᛶᲁ(I)V

    .line 49
    .line 50
    .line 51
    goto :goto_1

    .line 52
    :cond_2
    invoke-virtual {p0, p1}, Lyyds/ᛷᲁᛷᛵ;->ᛲᲈᲁ(I)V

    .line 53
    .line 54
    .line 55
    :goto_1
    if-nez v2, :cond_4

    .line 56
    .line 57
    iget-object p1, p0, Lyyds/ᛷᲁᛷᛵ;->ᲀᛲᛳᲀ:Ljava/lang/Object;

    .line 58
    .line 59
    check-cast p1, Lyyds/ᛷᲁᛷᛵ;

    .line 60
    .line 61
    if-eqz p1, :cond_3

    .line 62
    .line 63
    goto :goto_2

    .line 64
    :cond_3
    return-void

    .line 65
    :cond_4
    :goto_2
    invoke-virtual {p0}, Lyyds/ᛷᲁᛷᛵ;->ᲀᛲᛳᲀ()V

    .line 66
    .line 67
    .line 68
    iget-object p0, p0, Lyyds/ᛷᲁᛷᛵ;->ᲀᛲᛳᲀ:Ljava/lang/Object;

    .line 69
    .line 70
    check-cast p0, Lyyds/ᛷᲁᛷᛵ;

    .line 71
    .line 72
    invoke-virtual {p0, v3, v2}, Lyyds/ᛷᲁᛷᛵ;->ᛲᛴᛳᛲ(IZ)V

    .line 73
    .line 74
    .line 75
    return-void
.end method

.method public ᛲᲈᲁ(I)V
    .locals 4

    .line 1
    const/16 v0, 0x40

    .line 2
    .line 3
    if-lt p1, v0, :cond_1

    .line 4
    .line 5
    iget-object p0, p0, Lyyds/ᛷᲁᛷᛵ;->ᲀᛲᛳᲀ:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast p0, Lyyds/ᛷᲁᛷᛵ;

    .line 8
    .line 9
    if-eqz p0, :cond_0

    .line 10
    .line 11
    sub-int/2addr p1, v0

    .line 12
    invoke-virtual {p0, p1}, Lyyds/ᛷᲁᛷᛵ;->ᛲᲈᲁ(I)V

    .line 13
    .line 14
    .line 15
    :cond_0
    return-void

    .line 16
    :cond_1
    iget-wide v0, p0, Lyyds/ᛷᲁᛷᛵ;->ᛵᛸᛸᛷ:J

    .line 17
    .line 18
    const-wide/16 v2, 0x1

    .line 19
    .line 20
    shl-long/2addr v2, p1

    .line 21
    not-long v2, v2

    .line 22
    and-long/2addr v0, v2

    .line 23
    iput-wide v0, p0, Lyyds/ᛷᲁᛷᛵ;->ᛵᛸᛸᛷ:J

    .line 24
    .line 25
    return-void
.end method

.method public ᛵᛸᛸᛷ(I)I
    .locals 6

    .line 1
    iget-object v0, p0, Lyyds/ᛷᲁᛷᛵ;->ᲀᛲᛳᲀ:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lyyds/ᛷᲁᛷᛵ;

    .line 4
    .line 5
    const/16 v1, 0x40

    .line 6
    .line 7
    const-wide/16 v2, 0x1

    .line 8
    .line 9
    if-nez v0, :cond_1

    .line 10
    .line 11
    iget-wide v4, p0, Lyyds/ᛷᲁᛷᛵ;->ᛵᛸᛸᛷ:J

    .line 12
    .line 13
    if-lt p1, v1, :cond_0

    .line 14
    .line 15
    invoke-static {v4, v5}, Ljava/lang/Long;->bitCount(J)I

    .line 16
    .line 17
    .line 18
    move-result p0

    .line 19
    return p0

    .line 20
    :cond_0
    shl-long p0, v2, p1

    .line 21
    .line 22
    sub-long/2addr p0, v2

    .line 23
    and-long/2addr p0, v4

    .line 24
    invoke-static {p0, p1}, Ljava/lang/Long;->bitCount(J)I

    .line 25
    .line 26
    .line 27
    move-result p0

    .line 28
    return p0

    .line 29
    :cond_1
    if-ge p1, v1, :cond_2

    .line 30
    .line 31
    iget-wide v0, p0, Lyyds/ᛷᲁᛷᛵ;->ᛵᛸᛸᛷ:J

    .line 32
    .line 33
    shl-long p0, v2, p1

    .line 34
    .line 35
    sub-long/2addr p0, v2

    .line 36
    and-long/2addr p0, v0

    .line 37
    invoke-static {p0, p1}, Ljava/lang/Long;->bitCount(J)I

    .line 38
    .line 39
    .line 40
    move-result p0

    .line 41
    return p0

    .line 42
    :cond_2
    sub-int/2addr p1, v1

    .line 43
    invoke-virtual {v0, p1}, Lyyds/ᛷᲁᛷᛵ;->ᛵᛸᛸᛷ(I)I

    .line 44
    .line 45
    .line 46
    move-result p1

    .line 47
    iget-wide v0, p0, Lyyds/ᛷᲁᛷᛵ;->ᛵᛸᛸᛷ:J

    .line 48
    .line 49
    invoke-static {v0, v1}, Ljava/lang/Long;->bitCount(J)I

    .line 50
    .line 51
    .line 52
    move-result p0

    .line 53
    add-int/2addr p0, p1

    .line 54
    return p0
.end method

.method public ᛶᛷᛲᲁ(I)Z
    .locals 10

    .line 1
    const/16 v0, 0x40

    .line 2
    .line 3
    if-lt p1, v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {p0}, Lyyds/ᛷᲁᛷᛵ;->ᲀᛲᛳᲀ()V

    .line 6
    .line 7
    .line 8
    iget-object p0, p0, Lyyds/ᛷᲁᛷᛵ;->ᲀᛲᛳᲀ:Ljava/lang/Object;

    .line 9
    .line 10
    check-cast p0, Lyyds/ᛷᲁᛷᛵ;

    .line 11
    .line 12
    sub-int/2addr p1, v0

    .line 13
    invoke-virtual {p0, p1}, Lyyds/ᛷᲁᛷᛵ;->ᛶᛷᛲᲁ(I)Z

    .line 14
    .line 15
    .line 16
    move-result p0

    .line 17
    return p0

    .line 18
    :cond_0
    const-wide/16 v0, 0x1

    .line 19
    .line 20
    shl-long v2, v0, p1

    .line 21
    .line 22
    iget-wide v4, p0, Lyyds/ᛷᲁᛷᛵ;->ᛵᛸᛸᛷ:J

    .line 23
    .line 24
    and-long v6, v4, v2

    .line 25
    .line 26
    const-wide/16 v8, 0x0

    .line 27
    .line 28
    cmp-long p1, v6, v8

    .line 29
    .line 30
    const/4 v6, 0x1

    .line 31
    const/4 v7, 0x0

    .line 32
    if-eqz p1, :cond_1

    .line 33
    .line 34
    move p1, v6

    .line 35
    goto :goto_0

    .line 36
    :cond_1
    move p1, v7

    .line 37
    :goto_0
    not-long v8, v2

    .line 38
    and-long/2addr v4, v8

    .line 39
    iput-wide v4, p0, Lyyds/ᛷᲁᛷᛵ;->ᛵᛸᛸᛷ:J

    .line 40
    .line 41
    sub-long/2addr v2, v0

    .line 42
    and-long v0, v4, v2

    .line 43
    .line 44
    not-long v2, v2

    .line 45
    and-long/2addr v2, v4

    .line 46
    invoke-static {v2, v3, v6}, Ljava/lang/Long;->rotateRight(JI)J

    .line 47
    .line 48
    .line 49
    move-result-wide v2

    .line 50
    or-long/2addr v0, v2

    .line 51
    iput-wide v0, p0, Lyyds/ᛷᲁᛷᛵ;->ᛵᛸᛸᛷ:J

    .line 52
    .line 53
    iget-object v0, p0, Lyyds/ᛷᲁᛷᛵ;->ᲀᛲᛳᲀ:Ljava/lang/Object;

    .line 54
    .line 55
    check-cast v0, Lyyds/ᛷᲁᛷᛵ;

    .line 56
    .line 57
    if-eqz v0, :cond_3

    .line 58
    .line 59
    invoke-virtual {v0, v7}, Lyyds/ᛷᲁᛷᛵ;->ᲇᲈᛵᛷ(I)Z

    .line 60
    .line 61
    .line 62
    move-result v0

    .line 63
    if-eqz v0, :cond_2

    .line 64
    .line 65
    const/16 v0, 0x3f

    .line 66
    .line 67
    invoke-virtual {p0, v0}, Lyyds/ᛷᲁᛷᛵ;->ᛲᛳᛶᲁ(I)V

    .line 68
    .line 69
    .line 70
    :cond_2
    iget-object p0, p0, Lyyds/ᛷᲁᛷᛵ;->ᲀᛲᛳᲀ:Ljava/lang/Object;

    .line 71
    .line 72
    check-cast p0, Lyyds/ᛷᲁᛷᛵ;

    .line 73
    .line 74
    invoke-virtual {p0, v7}, Lyyds/ᛷᲁᛷᛵ;->ᛶᛷᛲᲁ(I)Z

    .line 75
    .line 76
    .line 77
    :cond_3
    return p1
.end method

.method public ᲀᛲᛳᲀ()V
    .locals 1

    .line 1
    iget-object v0, p0, Lyyds/ᛷᲁᛷᛵ;->ᲀᛲᛳᲀ:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lyyds/ᛷᲁᛷᛵ;

    .line 4
    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    new-instance v0, Lyyds/ᛷᲁᛷᛵ;

    .line 8
    .line 9
    invoke-direct {v0}, Lyyds/ᛷᲁᛷᛵ;-><init>()V

    .line 10
    .line 11
    .line 12
    iput-object v0, p0, Lyyds/ᛷᲁᛷᛵ;->ᲀᛲᛳᲀ:Ljava/lang/Object;

    .line 13
    .line 14
    :cond_0
    return-void
.end method

.method public ᲇᲇᲇᛱ()Lyyds/ᛷᛸᛱᛴ;
    .locals 7

    .line 1
    new-instance v0, Ljava/util/ArrayList;

    .line 2
    .line 3
    const/16 v1, 0x14

    .line 4
    .line 5
    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    .line 6
    .line 7
    .line 8
    :goto_0
    iget-object v1, p0, Lyyds/ᛷᲁᛷᛵ;->ᲀᛲᛳᲀ:Ljava/lang/Object;

    .line 9
    .line 10
    check-cast v1, Lyyds/ᲀᲀᛵᲈ;

    .line 11
    .line 12
    iget-wide v2, p0, Lyyds/ᛷᲁᛷᛵ;->ᛵᛸᛸᛷ:J

    .line 13
    .line 14
    invoke-virtual {v1, v2, v3}, Lyyds/ᲀᲀᛵᲈ;->ᛳᛸᛴᛶ(J)Ljava/lang/String;

    .line 15
    .line 16
    .line 17
    move-result-object v1

    .line 18
    iget-wide v2, p0, Lyyds/ᛷᲁᛷᛵ;->ᛵᛸᛸᛷ:J

    .line 19
    .line 20
    invoke-virtual {v1}, Ljava/lang/String;->length()I

    .line 21
    .line 22
    .line 23
    move-result v4

    .line 24
    int-to-long v4, v4

    .line 25
    sub-long/2addr v2, v4

    .line 26
    iput-wide v2, p0, Lyyds/ᛷᲁᛷᛵ;->ᛵᛸᛸᛷ:J

    .line 27
    .line 28
    invoke-virtual {v1}, Ljava/lang/String;->length()I

    .line 29
    .line 30
    .line 31
    move-result v2

    .line 32
    const/4 v3, 0x0

    .line 33
    if-nez v2, :cond_0

    .line 34
    .line 35
    new-instance p0, Lyyds/ᛷᛸᛱᛴ;

    .line 36
    .line 37
    new-array v1, v3, [Ljava/lang/String;

    .line 38
    .line 39
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    .line 40
    .line 41
    .line 42
    move-result-object v0

    .line 43
    check-cast v0, [Ljava/lang/String;

    .line 44
    .line 45
    invoke-direct {p0, v0}, Lyyds/ᛷᛸᛱᛴ;-><init>([Ljava/lang/String;)V

    .line 46
    .line 47
    .line 48
    return-object p0

    .line 49
    :cond_0
    const/4 v2, 0x4

    .line 50
    const/16 v4, 0x3a

    .line 51
    .line 52
    const/4 v5, 0x1

    .line 53
    invoke-static {v1, v4, v5, v2}, Lyyds/ᛲᲇᛸᲇ;->ᛱᛳᛶᛳ(Ljava/lang/CharSequence;CII)I

    .line 54
    .line 55
    .line 56
    move-result v2

    .line 57
    const/4 v6, -0x1

    .line 58
    if-eq v2, v6, :cond_1

    .line 59
    .line 60
    invoke-virtual {v1, v3, v2}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 61
    .line 62
    .line 63
    move-result-object v3

    .line 64
    add-int/lit8 v2, v2, 0x1

    .line 65
    .line 66
    invoke-virtual {v1, v2}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    .line 67
    .line 68
    .line 69
    move-result-object v1

    .line 70
    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 71
    .line 72
    .line 73
    invoke-static {v1}, Lyyds/ᛲᲇᛸᲇ;->ᲁᛵᲁᲁ(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 74
    .line 75
    .line 76
    move-result-object v1

    .line 77
    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 78
    .line 79
    .line 80
    move-result-object v1

    .line 81
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 82
    .line 83
    .line 84
    goto :goto_0

    .line 85
    :cond_1
    invoke-virtual {v1, v3}, Ljava/lang/String;->charAt(I)C

    .line 86
    .line 87
    .line 88
    move-result v2

    .line 89
    const-string v3, ""

    .line 90
    .line 91
    if-ne v2, v4, :cond_2

    .line 92
    .line 93
    invoke-virtual {v1, v5}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    .line 94
    .line 95
    .line 96
    move-result-object v1

    .line 97
    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 98
    .line 99
    .line 100
    invoke-static {v1}, Lyyds/ᛲᲇᛸᲇ;->ᲁᛵᲁᲁ(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 101
    .line 102
    .line 103
    move-result-object v1

    .line 104
    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 105
    .line 106
    .line 107
    move-result-object v1

    .line 108
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 109
    .line 110
    .line 111
    goto :goto_0

    .line 112
    :cond_2
    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 113
    .line 114
    .line 115
    invoke-static {v1}, Lyyds/ᛲᲇᛸᲇ;->ᲁᛵᲁᲁ(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 116
    .line 117
    .line 118
    move-result-object v1

    .line 119
    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 120
    .line 121
    .line 122
    move-result-object v1

    .line 123
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 124
    .line 125
    .line 126
    goto :goto_0
.end method

.method public ᲇᲈᛵᛷ(I)Z
    .locals 4

    .line 1
    const/16 v0, 0x40

    .line 2
    .line 3
    if-lt p1, v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {p0}, Lyyds/ᛷᲁᛷᛵ;->ᲀᛲᛳᲀ()V

    .line 6
    .line 7
    .line 8
    iget-object p0, p0, Lyyds/ᛷᲁᛷᛵ;->ᲀᛲᛳᲀ:Ljava/lang/Object;

    .line 9
    .line 10
    check-cast p0, Lyyds/ᛷᲁᛷᛵ;

    .line 11
    .line 12
    sub-int/2addr p1, v0

    .line 13
    invoke-virtual {p0, p1}, Lyyds/ᛷᲁᛷᛵ;->ᲇᲈᛵᛷ(I)Z

    .line 14
    .line 15
    .line 16
    move-result p0

    .line 17
    return p0

    .line 18
    :cond_0
    iget-wide v0, p0, Lyyds/ᛷᲁᛷᛵ;->ᛵᛸᛸᛷ:J

    .line 19
    .line 20
    const-wide/16 v2, 0x1

    .line 21
    .line 22
    shl-long p0, v2, p1

    .line 23
    .line 24
    and-long/2addr p0, v0

    .line 25
    const-wide/16 v0, 0x0

    .line 26
    .line 27
    cmp-long p0, p0, v0

    .line 28
    .line 29
    if-eqz p0, :cond_1

    .line 30
    .line 31
    const/4 p0, 0x1

    .line 32
    return p0

    .line 33
    :cond_1
    const/4 p0, 0x0

    .line 34
    return p0
.end method
