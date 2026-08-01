.class public final Lxhss/ᛱᲇᛴᲇ;
.super Ljava/lang/Object;
.source "r8-map-id-684deb5fba33a691397d1324861b0a91cfdff049bb058f400176b68a1f4afccc"


# instance fields
.field public ᛱᛱᛲᲇ:I

.field public ᛳᲁᲇᛸ:Ljava/lang/Object;

.field public final synthetic ᛷᛵᛵᲈ:I


# direct methods
.method public constructor <init>(I)V
    .locals 0

    .line 1
    iput p1, p0, Lxhss/ᛱᲇᛴᲇ;->ᛷᛵᛵᲈ:I

    .line 2
    .line 3
    packed-switch p1, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 7
    .line 8
    .line 9
    const/4 p1, 0x1

    .line 10
    iput p1, p0, Lxhss/ᛱᲇᛴᲇ;->ᛱᛱᛲᲇ:I

    .line 11
    .line 12
    const/4 p1, 0x0

    .line 13
    invoke-static {p1}, Ljava/util/Collections;->singletonList(Ljava/lang/Object;)Ljava/util/List;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    iput-object p1, p0, Lxhss/ᛱᲇᛴᲇ;->ᛳᲁᲇᛸ:Ljava/lang/Object;

    .line 18
    .line 19
    return-void

    .line 20
    :pswitch_0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 21
    .line 22
    .line 23
    const/4 p1, 0x1

    .line 24
    iput p1, p0, Lxhss/ᛱᲇᛴᲇ;->ᛱᛱᛲᲇ:I

    .line 25
    .line 26
    const/4 p1, 0x0

    .line 27
    iput-object p1, p0, Lxhss/ᛱᲇᛴᲇ;->ᛳᲁᲇᛸ:Ljava/lang/Object;

    .line 28
    .line 29
    return-void

    .line 30
    nop

    .line 31
    :pswitch_data_0
    .packed-switch 0x4
        :pswitch_0
    .end packed-switch
.end method

.method public constructor <init>(ILjava/util/ArrayList;)V
    .locals 0

    iput p1, p0, Lxhss/ᛱᲇᛴᲇ;->ᛷᛵᛵᲈ:I

    packed-switch p1, :pswitch_data_0

    .line 32
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 p1, 0x0

    .line 33
    iput p1, p0, Lxhss/ᛱᲇᛴᲇ;->ᛱᛱᛲᲇ:I

    .line 34
    iput-object p2, p0, Lxhss/ᛱᲇᛴᲇ;->ᛳᲁᲇᛸ:Ljava/lang/Object;

    return-void

    .line 35
    :pswitch_0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 36
    iput-object p2, p0, Lxhss/ᛱᲇᛴᲇ;->ᛳᲁᲇᛸ:Ljava/lang/Object;

    return-void

    :pswitch_data_0
    .packed-switch 0x6
        :pswitch_0
    .end packed-switch
.end method

.method public synthetic constructor <init>(IZ)V
    .locals 0

    .line 31
    iput p1, p0, Lxhss/ᛱᲇᛴᲇ;->ᛷᛵᛵᲈ:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public toString()Ljava/lang/String;
    .locals 3

    .line 1
    iget v0, p0, Lxhss/ᛱᲇᛴᲇ;->ᛷᛵᛵᲈ:I

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
    new-instance v0, Ljava/lang/String;

    .line 12
    .line 13
    iget-object v1, p0, Lxhss/ᛱᲇᛴᲇ;->ᛳᲁᲇᛸ:Ljava/lang/Object;

    .line 14
    .line 15
    check-cast v1, [C

    .line 16
    .line 17
    iget p0, p0, Lxhss/ᛱᲇᛴᲇ;->ᛱᛱᛲᲇ:I

    .line 18
    .line 19
    add-int/lit8 p0, p0, 0x1

    .line 20
    .line 21
    const/4 v2, 0x0

    .line 22
    invoke-direct {v0, v1, v2, p0}, Ljava/lang/String;-><init>([CII)V

    .line 23
    .line 24
    .line 25
    return-object v0

    .line 26
    nop

    .line 27
    :pswitch_data_0
    .packed-switch 0x3
        :pswitch_0
    .end packed-switch
.end method

.method public ᛱᛱᛲᲇ(C)V
    .locals 4

    .line 1
    iget v0, p0, Lxhss/ᛱᲇᛴᲇ;->ᛱᛱᛲᲇ:I

    .line 2
    .line 3
    add-int/lit8 v0, v0, 0x1

    .line 4
    .line 5
    iput v0, p0, Lxhss/ᛱᲇᛴᲇ;->ᛱᛱᛲᲇ:I

    .line 6
    .line 7
    iget-object v1, p0, Lxhss/ᛱᲇᛴᲇ;->ᛳᲁᲇᛸ:Ljava/lang/Object;

    .line 8
    .line 9
    check-cast v1, [C

    .line 10
    .line 11
    array-length v2, v1

    .line 12
    if-gt v2, v0, :cond_0

    .line 13
    .line 14
    array-length v0, v1

    .line 15
    mul-int/lit8 v0, v0, 0x2

    .line 16
    .line 17
    add-int/lit8 v0, v0, 0x1

    .line 18
    .line 19
    new-array v0, v0, [C

    .line 20
    .line 21
    array-length v2, v1

    .line 22
    const/4 v3, 0x0

    .line 23
    invoke-static {v1, v3, v0, v3, v2}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 24
    .line 25
    .line 26
    iput-object v0, p0, Lxhss/ᛱᲇᛴᲇ;->ᛳᲁᲇᛸ:Ljava/lang/Object;

    .line 27
    .line 28
    move-object v1, v0

    .line 29
    :cond_0
    iget p0, p0, Lxhss/ᛱᲇᛴᲇ;->ᛱᛱᛲᲇ:I

    .line 30
    .line 31
    aput-char p1, v1, p0

    .line 32
    .line 33
    return-void
.end method

.method public ᛳᲁᲇᛸ(ILxhss/ᲈᲀᲇᛶ;)V
    .locals 7

    .line 1
    :goto_0
    shr-int/lit8 v0, p1, 0x1

    .line 2
    .line 3
    if-eqz v0, :cond_2

    .line 4
    .line 5
    iget-object v1, p0, Lxhss/ᛱᲇᛴᲇ;->ᛳᲁᲇᛸ:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast v1, [Lxhss/ᲈᲀᲇᛶ;

    .line 8
    .line 9
    aget-object v2, v1, v0

    .line 10
    .line 11
    iget-wide v3, v2, Lxhss/ᲈᲀᲇᛶ;->ᲀᲇᛳᲁ:J

    .line 12
    .line 13
    iget-wide v5, p2, Lxhss/ᲈᲀᲇᛶ;->ᲀᲇᛳᲁ:J

    .line 14
    .line 15
    sub-long/2addr v5, v3

    .line 16
    const-wide/16 v3, 0x0

    .line 17
    .line 18
    cmp-long v3, v3, v5

    .line 19
    .line 20
    if-gez v3, :cond_0

    .line 21
    .line 22
    goto :goto_1

    .line 23
    :cond_0
    if-nez v3, :cond_1

    .line 24
    .line 25
    goto :goto_1

    .line 26
    :cond_1
    iput p1, v2, Lxhss/ᲈᲀᲇᛶ;->ᲇᛶᛴᲀ:I

    .line 27
    .line 28
    aput-object v2, v1, p1

    .line 29
    .line 30
    move p1, v0

    .line 31
    goto :goto_0

    .line 32
    :cond_2
    :goto_1
    iget-object p0, p0, Lxhss/ᛱᲇᛴᲇ;->ᛳᲁᲇᛸ:Ljava/lang/Object;

    .line 33
    .line 34
    check-cast p0, [Lxhss/ᲈᲀᲇᛶ;

    .line 35
    .line 36
    aput-object p2, p0, p1

    .line 37
    .line 38
    iput p1, p2, Lxhss/ᲈᲀᲇᛶ;->ᲇᛶᛴᲀ:I

    .line 39
    .line 40
    return-void
.end method

.method public ᛷᛵᛵᲈ(Lxhss/ᛷᛱᛳᲁ;)V
    .locals 4

    .line 1
    :goto_0
    if-eqz p1, :cond_3

    .line 2
    .line 3
    const/4 v0, 0x0

    .line 4
    move v1, v0

    .line 5
    :goto_1
    iget v2, p0, Lxhss/ᛱᲇᛴᲇ;->ᛱᛱᛲᲇ:I

    .line 6
    .line 7
    iget-object v3, p0, Lxhss/ᛱᲇᛴᲇ;->ᛳᲁᲇᛸ:Ljava/lang/Object;

    .line 8
    .line 9
    check-cast v3, [Lxhss/ᛷᛱᛳᲁ;

    .line 10
    .line 11
    if-ge v1, v2, :cond_1

    .line 12
    .line 13
    aget-object v2, v3, v1

    .line 14
    .line 15
    iget-object v2, v2, Lxhss/ᛷᛱᛳᲁ;->ᛳᲁᲇᛸ:Ljava/lang/Object;

    .line 16
    .line 17
    check-cast v2, Ljava/lang/String;

    .line 18
    .line 19
    iget-object v3, p1, Lxhss/ᛷᛱᛳᲁ;->ᛳᲁᲇᛸ:Ljava/lang/Object;

    .line 20
    .line 21
    check-cast v3, Ljava/lang/String;

    .line 22
    .line 23
    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 24
    .line 25
    .line 26
    move-result v2

    .line 27
    if-eqz v2, :cond_0

    .line 28
    .line 29
    goto :goto_2

    .line 30
    :cond_0
    add-int/lit8 v1, v1, 0x1

    .line 31
    .line 32
    goto :goto_1

    .line 33
    :cond_1
    array-length v1, v3

    .line 34
    if-lt v2, v1, :cond_2

    .line 35
    .line 36
    array-length v1, v3

    .line 37
    add-int/lit8 v1, v1, 0x6

    .line 38
    .line 39
    new-array v1, v1, [Lxhss/ᛷᛱᛳᲁ;

    .line 40
    .line 41
    invoke-static {v3, v0, v1, v0, v2}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 42
    .line 43
    .line 44
    iput-object v1, p0, Lxhss/ᛱᲇᛴᲇ;->ᛳᲁᲇᛸ:Ljava/lang/Object;

    .line 45
    .line 46
    move-object v3, v1

    .line 47
    :cond_2
    iget v0, p0, Lxhss/ᛱᲇᛴᲇ;->ᛱᛱᛲᲇ:I

    .line 48
    .line 49
    add-int/lit8 v1, v0, 0x1

    .line 50
    .line 51
    iput v1, p0, Lxhss/ᛱᲇᛴᲇ;->ᛱᛱᛲᲇ:I

    .line 52
    .line 53
    aput-object p1, v3, v0

    .line 54
    .line 55
    :goto_2
    iget-object p1, p1, Lxhss/ᛷᛱᛳᲁ;->ᛷᛴᛷᛱ:Ljava/lang/Object;

    .line 56
    .line 57
    check-cast p1, Lxhss/ᛷᛱᛳᲁ;

    .line 58
    .line 59
    goto :goto_0

    .line 60
    :cond_3
    return-void
.end method

.method public ᲇᛴᲇᛵ(Lxhss/ᲈᲀᲇᛶ;)V
    .locals 12

    .line 1
    iget v0, p1, Lxhss/ᲈᲀᲇᛶ;->ᲇᛶᛴᲀ:I

    .line 2
    .line 3
    const/4 v1, -0x1

    .line 4
    if-eq v0, v1, :cond_a

    .line 5
    .line 6
    iget v2, p0, Lxhss/ᛱᲇᛴᲇ;->ᛱᛱᛲᲇ:I

    .line 7
    .line 8
    iget-object v3, p0, Lxhss/ᛱᲇᛴᲇ;->ᛳᲁᲇᛸ:Ljava/lang/Object;

    .line 9
    .line 10
    check-cast v3, [Lxhss/ᲈᲀᲇᛶ;

    .line 11
    .line 12
    aget-object v4, v3, v2

    .line 13
    .line 14
    iput v1, p1, Lxhss/ᲈᲀᲇᛶ;->ᲇᛶᛴᲀ:I

    .line 15
    .line 16
    const/4 v5, 0x0

    .line 17
    aput-object v5, v3, v2

    .line 18
    .line 19
    const/4 v5, 0x1

    .line 20
    sub-int/2addr v2, v5

    .line 21
    iput v2, p0, Lxhss/ᛱᲇᛴᲇ;->ᛱᛱᛲᲇ:I

    .line 22
    .line 23
    if-ne p1, v4, :cond_0

    .line 24
    .line 25
    return-void

    .line 26
    :cond_0
    iget-wide v6, p1, Lxhss/ᲈᲀᲇᛶ;->ᲀᲇᛳᲁ:J

    .line 27
    .line 28
    iget-wide v8, v4, Lxhss/ᲈᲀᲇᛶ;->ᲀᲇᛳᲁ:J

    .line 29
    .line 30
    sub-long/2addr v8, v6

    .line 31
    const-wide/16 v6, 0x0

    .line 32
    .line 33
    cmp-long p1, v6, v8

    .line 34
    .line 35
    if-gez p1, :cond_1

    .line 36
    .line 37
    goto :goto_0

    .line 38
    :cond_1
    if-nez p1, :cond_2

    .line 39
    .line 40
    const/4 v1, 0x0

    .line 41
    goto :goto_0

    .line 42
    :cond_2
    move v1, v5

    .line 43
    :goto_0
    if-nez v1, :cond_3

    .line 44
    .line 45
    aput-object v4, v3, v0

    .line 46
    .line 47
    iput v0, v4, Lxhss/ᲈᲀᲇᛶ;->ᲇᛶᛴᲀ:I

    .line 48
    .line 49
    return-void

    .line 50
    :cond_3
    if-gez v1, :cond_9

    .line 51
    .line 52
    :goto_1
    shl-int/lit8 p1, v0, 0x1

    .line 53
    .line 54
    add-int/lit8 v1, p1, 0x1

    .line 55
    .line 56
    iget v2, p0, Lxhss/ᛱᲇᛴᲇ;->ᛱᛱᛲᲇ:I

    .line 57
    .line 58
    if-gt v1, v2, :cond_5

    .line 59
    .line 60
    iget-object v2, p0, Lxhss/ᛱᲇᛴᲇ;->ᛳᲁᲇᛸ:Ljava/lang/Object;

    .line 61
    .line 62
    check-cast v2, [Lxhss/ᲈᲀᲇᛶ;

    .line 63
    .line 64
    aget-object p1, v2, p1

    .line 65
    .line 66
    aget-object v1, v2, v1

    .line 67
    .line 68
    iget-wide v8, p1, Lxhss/ᲈᲀᲇᛶ;->ᲀᲇᛳᲁ:J

    .line 69
    .line 70
    iget-wide v10, v1, Lxhss/ᲈᲀᲇᛶ;->ᲀᲇᛳᲁ:J

    .line 71
    .line 72
    sub-long/2addr v10, v8

    .line 73
    cmp-long v3, v6, v10

    .line 74
    .line 75
    if-gez v3, :cond_4

    .line 76
    .line 77
    goto :goto_2

    .line 78
    :cond_4
    move-object p1, v1

    .line 79
    goto :goto_2

    .line 80
    :cond_5
    if-gt p1, v2, :cond_8

    .line 81
    .line 82
    iget-object v1, p0, Lxhss/ᛱᲇᛴᲇ;->ᛳᲁᲇᛸ:Ljava/lang/Object;

    .line 83
    .line 84
    move-object v2, v1

    .line 85
    check-cast v2, [Lxhss/ᲈᲀᲇᛶ;

    .line 86
    .line 87
    aget-object p1, v2, p1

    .line 88
    .line 89
    :goto_2
    iget-wide v8, v4, Lxhss/ᲈᲀᲇᛶ;->ᲀᲇᛳᲁ:J

    .line 90
    .line 91
    iget-wide v10, p1, Lxhss/ᲈᲀᲇᛶ;->ᲀᲇᛳᲁ:J

    .line 92
    .line 93
    sub-long/2addr v10, v8

    .line 94
    cmp-long v1, v6, v10

    .line 95
    .line 96
    if-gez v1, :cond_6

    .line 97
    .line 98
    goto :goto_3

    .line 99
    :cond_6
    if-nez v1, :cond_7

    .line 100
    .line 101
    goto :goto_3

    .line 102
    :cond_7
    iget v1, p1, Lxhss/ᲈᲀᲇᛶ;->ᲇᛶᛴᲀ:I

    .line 103
    .line 104
    iput v0, p1, Lxhss/ᲈᲀᲇᛶ;->ᲇᛶᛴᲀ:I

    .line 105
    .line 106
    aput-object p1, v2, v0

    .line 107
    .line 108
    move v0, v1

    .line 109
    goto :goto_1

    .line 110
    :cond_8
    :goto_3
    iget-object p0, p0, Lxhss/ᛱᲇᛴᲇ;->ᛳᲁᲇᛸ:Ljava/lang/Object;

    .line 111
    .line 112
    check-cast p0, [Lxhss/ᲈᲀᲇᛶ;

    .line 113
    .line 114
    aput-object v4, p0, v0

    .line 115
    .line 116
    iput v0, v4, Lxhss/ᲈᲀᲇᛶ;->ᲇᛶᛴᲀ:I

    .line 117
    .line 118
    return-void

    .line 119
    :cond_9
    invoke-virtual {p0, v0, v4}, Lxhss/ᛱᲇᛴᲇ;->ᛳᲁᲇᛸ(ILxhss/ᲈᲀᲇᛶ;)V

    .line 120
    .line 121
    .line 122
    return-void

    .line 123
    :cond_a
    const-string p0, "Failed requirement."

    .line 124
    .line 125
    invoke-static {p0}, Lxhss/ᛵᲈᲁᲈ;->ᲀᲇᛳᲁ(Ljava/lang/String;)V

    .line 126
    .line 127
    .line 128
    return-void
.end method
