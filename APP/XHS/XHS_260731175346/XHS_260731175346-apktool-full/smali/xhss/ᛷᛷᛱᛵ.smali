.class public final Lxhss/ᛷᛷᛱᛵ;
.super Lxhss/ᛳᛶᲈᲈ;
.source "r8-map-id-684deb5fba33a691397d1324861b0a91cfdff049bb058f400176b68a1f4afccc"


# instance fields
.field public final transient ᲀᲇᛳᲁ:[I

.field public final transient ᲇᛶᛴᲀ:[[B


# direct methods
.method public constructor <init>([[B[I)V
    .locals 1

    .line 1
    sget-object v0, Lxhss/ᛳᛶᲈᲈ;->ᛷᛴᛷᛱ:Lxhss/ᛳᛶᲈᲈ;

    .line 2
    .line 3
    iget-object v0, v0, Lxhss/ᛳᛶᲈᲈ;->ᛱᛱᛲᲇ:[B

    .line 4
    .line 5
    invoke-direct {p0, v0}, Lxhss/ᛳᛶᲈᲈ;-><init>([B)V

    .line 6
    .line 7
    .line 8
    iput-object p1, p0, Lxhss/ᛷᛷᛱᛵ;->ᲇᛶᛴᲀ:[[B

    .line 9
    .line 10
    iput-object p2, p0, Lxhss/ᛷᛷᛱᛵ;->ᲀᲇᛳᲁ:[I

    .line 11
    .line 12
    return-void
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 2

    .line 1
    if-ne p1, p0, :cond_0

    .line 2
    .line 3
    goto :goto_0

    .line 4
    :cond_0
    instance-of v0, p1, Lxhss/ᛳᛶᲈᲈ;

    .line 5
    .line 6
    if-eqz v0, :cond_1

    .line 7
    .line 8
    check-cast p1, Lxhss/ᛳᛶᲈᲈ;

    .line 9
    .line 10
    invoke-virtual {p1}, Lxhss/ᛳᛶᲈᲈ;->ᛷᛵᛵᲈ()I

    .line 11
    .line 12
    .line 13
    move-result v0

    .line 14
    invoke-virtual {p0}, Lxhss/ᛷᛷᛱᛵ;->ᛷᛵᛵᲈ()I

    .line 15
    .line 16
    .line 17
    move-result v1

    .line 18
    if-ne v0, v1, :cond_1

    .line 19
    .line 20
    invoke-virtual {p0}, Lxhss/ᛷᛷᛱᛵ;->ᛷᛵᛵᲈ()I

    .line 21
    .line 22
    .line 23
    move-result v0

    .line 24
    invoke-virtual {p0, p1, v0}, Lxhss/ᛷᛷᛱᛵ;->ᲇᛶᛴᲀ(Lxhss/ᛳᛶᲈᲈ;I)Z

    .line 25
    .line 26
    .line 27
    move-result p0

    .line 28
    if-eqz p0, :cond_1

    .line 29
    .line 30
    :goto_0
    const/4 p0, 0x1

    .line 31
    return p0

    .line 32
    :cond_1
    const/4 p0, 0x0

    .line 33
    return p0
.end method

.method public final hashCode()I
    .locals 9

    .line 1
    iget v0, p0, Lxhss/ᛳᛶᲈᲈ;->ᛳᲁᲇᛸ:I

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    return v0

    .line 6
    :cond_0
    iget-object v0, p0, Lxhss/ᛷᛷᛱᛵ;->ᲇᛶᛴᲀ:[[B

    .line 7
    .line 8
    array-length v1, v0

    .line 9
    const/4 v2, 0x0

    .line 10
    const/4 v3, 0x1

    .line 11
    move v4, v3

    .line 12
    move v3, v2

    .line 13
    :goto_0
    if-ge v2, v1, :cond_2

    .line 14
    .line 15
    add-int v5, v1, v2

    .line 16
    .line 17
    iget-object v6, p0, Lxhss/ᛷᛷᛱᛵ;->ᲀᲇᛳᲁ:[I

    .line 18
    .line 19
    aget v5, v6, v5

    .line 20
    .line 21
    aget v6, v6, v2

    .line 22
    .line 23
    aget-object v7, v0, v2

    .line 24
    .line 25
    sub-int v3, v6, v3

    .line 26
    .line 27
    add-int/2addr v3, v5

    .line 28
    :goto_1
    if-ge v5, v3, :cond_1

    .line 29
    .line 30
    mul-int/lit8 v4, v4, 0x1f

    .line 31
    .line 32
    aget-byte v8, v7, v5

    .line 33
    .line 34
    add-int/2addr v4, v8

    .line 35
    add-int/lit8 v5, v5, 0x1

    .line 36
    .line 37
    goto :goto_1

    .line 38
    :cond_1
    add-int/lit8 v2, v2, 0x1

    .line 39
    .line 40
    move v3, v6

    .line 41
    goto :goto_0

    .line 42
    :cond_2
    iput v4, p0, Lxhss/ᛳᛶᲈᲈ;->ᛳᲁᲇᛸ:I

    .line 43
    .line 44
    return v4
.end method

.method public final toString()Ljava/lang/String;
    .locals 1

    .line 1
    new-instance v0, Lxhss/ᛳᛶᲈᲈ;

    .line 2
    .line 3
    invoke-virtual {p0}, Lxhss/ᛷᛷᛱᛵ;->ᛷᲁᲁ()[B

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    invoke-direct {v0, p0}, Lxhss/ᛳᛶᲈᲈ;-><init>([B)V

    .line 8
    .line 9
    .line 10
    invoke-virtual {v0}, Lxhss/ᛳᛶᲈᲈ;->toString()Ljava/lang/String;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    return-object p0
.end method

.method public final ᛱᛱᛲᲇ()Ljava/lang/String;
    .locals 8

    .line 1
    invoke-virtual {p0}, Lxhss/ᛷᛷᛱᛵ;->ᛷᲁᲁ()[B

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    array-length v0, p0

    .line 6
    mul-int/lit8 v0, v0, 0x2

    .line 7
    .line 8
    new-array v0, v0, [C

    .line 9
    .line 10
    array-length v1, p0

    .line 11
    const/4 v2, 0x0

    .line 12
    move v3, v2

    .line 13
    :goto_0
    if-ge v2, v1, :cond_0

    .line 14
    .line 15
    aget-byte v4, p0, v2

    .line 16
    .line 17
    add-int/lit8 v5, v3, 0x1

    .line 18
    .line 19
    sget-object v6, Lxhss/ᛷᛸᲀᲀ;->ᛱᛱᛲᲇ:[C

    .line 20
    .line 21
    shr-int/lit8 v7, v4, 0x4

    .line 22
    .line 23
    and-int/lit8 v7, v7, 0xf

    .line 24
    .line 25
    aget-char v7, v6, v7

    .line 26
    .line 27
    aput-char v7, v0, v3

    .line 28
    .line 29
    add-int/lit8 v3, v3, 0x2

    .line 30
    .line 31
    and-int/lit8 v4, v4, 0xf

    .line 32
    .line 33
    aget-char v4, v6, v4

    .line 34
    .line 35
    aput-char v4, v0, v5

    .line 36
    .line 37
    add-int/lit8 v2, v2, 0x1

    .line 38
    .line 39
    goto :goto_0

    .line 40
    :cond_0
    new-instance p0, Ljava/lang/String;

    .line 41
    .line 42
    invoke-direct {p0, v0}, Ljava/lang/String;-><init>([C)V

    .line 43
    .line 44
    .line 45
    return-object p0
.end method

.method public final ᛳᲁᲇᛸ()[B
    .locals 0

    .line 1
    invoke-virtual {p0}, Lxhss/ᛷᛷᛱᛵ;->ᛷᲁᲁ()[B

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public final ᛷᛴᛷᛱ(I[BII)Z
    .locals 8

    .line 1
    const/4 v0, 0x0

    .line 2
    if-ltz p1, :cond_5

    .line 3
    .line 4
    invoke-virtual {p0}, Lxhss/ᛷᛷᛱᛵ;->ᛷᛵᛵᲈ()I

    .line 5
    .line 6
    .line 7
    move-result v1

    .line 8
    sub-int/2addr v1, p4

    .line 9
    if-gt p1, v1, :cond_5

    .line 10
    .line 11
    if-ltz p3, :cond_5

    .line 12
    .line 13
    array-length v1, p2

    .line 14
    sub-int/2addr v1, p4

    .line 15
    if-le p3, v1, :cond_0

    .line 16
    .line 17
    goto :goto_3

    .line 18
    :cond_0
    add-int/2addr p4, p1

    .line 19
    invoke-static {p0, p1}, Lxhss/ᛵᛶᲀᲇ;->ᛸᛴᛶᛳ(Lxhss/ᛷᛷᛱᛵ;I)I

    .line 20
    .line 21
    .line 22
    move-result v1

    .line 23
    :goto_0
    if-ge p1, p4, :cond_4

    .line 24
    .line 25
    iget-object v2, p0, Lxhss/ᛷᛷᛱᛵ;->ᲀᲇᛳᲁ:[I

    .line 26
    .line 27
    if-nez v1, :cond_1

    .line 28
    .line 29
    move v3, v0

    .line 30
    goto :goto_1

    .line 31
    :cond_1
    add-int/lit8 v3, v1, -0x1

    .line 32
    .line 33
    aget v3, v2, v3

    .line 34
    .line 35
    :goto_1
    aget v4, v2, v1

    .line 36
    .line 37
    sub-int/2addr v4, v3

    .line 38
    iget-object v5, p0, Lxhss/ᛷᛷᛱᛵ;->ᲇᛶᛴᲀ:[[B

    .line 39
    .line 40
    array-length v6, v5

    .line 41
    add-int/2addr v6, v1

    .line 42
    aget v2, v2, v6

    .line 43
    .line 44
    add-int/2addr v4, v3

    .line 45
    invoke-static {p4, v4}, Ljava/lang/Math;->min(II)I

    .line 46
    .line 47
    .line 48
    move-result v4

    .line 49
    sub-int/2addr v4, p1

    .line 50
    sub-int v3, p1, v3

    .line 51
    .line 52
    add-int/2addr v3, v2

    .line 53
    aget-object v2, v5, v1

    .line 54
    .line 55
    move v5, v0

    .line 56
    :goto_2
    if-ge v5, v4, :cond_3

    .line 57
    .line 58
    add-int v6, v5, v3

    .line 59
    .line 60
    aget-byte v6, v2, v6

    .line 61
    .line 62
    add-int v7, v5, p3

    .line 63
    .line 64
    aget-byte v7, p2, v7

    .line 65
    .line 66
    if-eq v6, v7, :cond_2

    .line 67
    .line 68
    goto :goto_3

    .line 69
    :cond_2
    add-int/lit8 v5, v5, 0x1

    .line 70
    .line 71
    goto :goto_2

    .line 72
    :cond_3
    add-int/2addr p3, v4

    .line 73
    add-int/2addr p1, v4

    .line 74
    add-int/lit8 v1, v1, 0x1

    .line 75
    .line 76
    goto :goto_0

    .line 77
    :cond_4
    const/4 p0, 0x1

    .line 78
    return p0

    .line 79
    :cond_5
    :goto_3
    return v0
.end method

.method public final ᛷᛵᛵᲈ()I
    .locals 1

    .line 1
    iget-object v0, p0, Lxhss/ᛷᛷᛱᛵ;->ᲇᛶᛴᲀ:[[B

    .line 2
    .line 3
    array-length v0, v0

    .line 4
    add-int/lit8 v0, v0, -0x1

    .line 5
    .line 6
    iget-object p0, p0, Lxhss/ᛷᛷᛱᛵ;->ᲀᲇᛳᲁ:[I

    .line 7
    .line 8
    aget p0, p0, v0

    .line 9
    .line 10
    return p0
.end method

.method public final ᛷᲁᲁ()[B
    .locals 10

    .line 1
    invoke-virtual {p0}, Lxhss/ᛷᛷᛱᛵ;->ᛷᛵᛵᲈ()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    new-array v0, v0, [B

    .line 6
    .line 7
    iget-object v1, p0, Lxhss/ᛷᛷᛱᛵ;->ᲇᛶᛴᲀ:[[B

    .line 8
    .line 9
    array-length v2, v1

    .line 10
    const/4 v3, 0x0

    .line 11
    move v4, v3

    .line 12
    move v5, v4

    .line 13
    :goto_0
    if-ge v3, v2, :cond_0

    .line 14
    .line 15
    add-int v6, v2, v3

    .line 16
    .line 17
    iget-object v7, p0, Lxhss/ᛷᛷᛱᛵ;->ᲀᲇᛳᲁ:[I

    .line 18
    .line 19
    aget v6, v7, v6

    .line 20
    .line 21
    aget v7, v7, v3

    .line 22
    .line 23
    aget-object v8, v1, v3

    .line 24
    .line 25
    sub-int v4, v7, v4

    .line 26
    .line 27
    add-int v9, v6, v4

    .line 28
    .line 29
    sub-int/2addr v9, v6

    .line 30
    invoke-static {v8, v6, v0, v5, v9}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 31
    .line 32
    .line 33
    add-int/2addr v5, v4

    .line 34
    add-int/lit8 v3, v3, 0x1

    .line 35
    .line 36
    move v4, v7

    .line 37
    goto :goto_0

    .line 38
    :cond_0
    return-object v0
.end method

.method public final ᛸᛲᲀᛵ()Lxhss/ᛳᛶᲈᲈ;
    .locals 1

    .line 1
    new-instance v0, Lxhss/ᛳᛶᲈᲈ;

    .line 2
    .line 3
    invoke-virtual {p0}, Lxhss/ᛷᛷᛱᛵ;->ᛷᲁᲁ()[B

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    invoke-direct {v0, p0}, Lxhss/ᛳᛶᲈᲈ;-><init>([B)V

    .line 8
    .line 9
    .line 10
    invoke-virtual {v0}, Lxhss/ᛳᛶᲈᲈ;->ᛸᛲᲀᛵ()Lxhss/ᛳᛶᲈᲈ;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    return-object p0
.end method

.method public final ᛸᛴᛶᛳ(II)Lxhss/ᛳᛶᲈᲈ;
    .locals 10

    .line 1
    const/4 v0, 0x0

    .line 2
    if-ltz p1, :cond_6

    .line 3
    .line 4
    invoke-virtual {p0}, Lxhss/ᛷᛷᛱᛵ;->ᛷᛵᛵᲈ()I

    .line 5
    .line 6
    .line 7
    move-result v1

    .line 8
    const-string v2, "endIndex="

    .line 9
    .line 10
    if-gt p2, v1, :cond_5

    .line 11
    .line 12
    sub-int v1, p2, p1

    .line 13
    .line 14
    if-ltz v1, :cond_4

    .line 15
    .line 16
    if-nez p1, :cond_0

    .line 17
    .line 18
    invoke-virtual {p0}, Lxhss/ᛷᛷᛱᛵ;->ᛷᛵᛵᲈ()I

    .line 19
    .line 20
    .line 21
    move-result v0

    .line 22
    if-ne p2, v0, :cond_0

    .line 23
    .line 24
    return-object p0

    .line 25
    :cond_0
    if-ne p1, p2, :cond_1

    .line 26
    .line 27
    sget-object p0, Lxhss/ᛳᛶᲈᲈ;->ᛷᛴᛷᛱ:Lxhss/ᛳᛶᲈᲈ;

    .line 28
    .line 29
    return-object p0

    .line 30
    :cond_1
    invoke-static {p0, p1}, Lxhss/ᛵᛶᲀᲇ;->ᛸᛴᛶᛳ(Lxhss/ᛷᛷᛱᛵ;I)I

    .line 31
    .line 32
    .line 33
    move-result v0

    .line 34
    add-int/lit8 p2, p2, -0x1

    .line 35
    .line 36
    invoke-static {p0, p2}, Lxhss/ᛵᛶᲀᲇ;->ᛸᛴᛶᛳ(Lxhss/ᛷᛷᛱᛵ;I)I

    .line 37
    .line 38
    .line 39
    move-result p2

    .line 40
    add-int/lit8 v2, p2, 0x1

    .line 41
    .line 42
    iget-object v3, p0, Lxhss/ᛷᛷᛱᛵ;->ᲇᛶᛴᲀ:[[B

    .line 43
    .line 44
    array-length v4, v3

    .line 45
    invoke-static {v2, v4}, Lxhss/ᛵᛶᲀᲇ;->ᛱᛱᛲᲇ(II)V

    .line 46
    .line 47
    .line 48
    invoke-static {v3, v0, v2}, Ljava/util/Arrays;->copyOfRange([Ljava/lang/Object;II)[Ljava/lang/Object;

    .line 49
    .line 50
    .line 51
    move-result-object v2

    .line 52
    check-cast v2, [[B

    .line 53
    .line 54
    array-length v4, v2

    .line 55
    mul-int/lit8 v4, v4, 0x2

    .line 56
    .line 57
    new-array v4, v4, [I

    .line 58
    .line 59
    const/4 v5, 0x0

    .line 60
    iget-object p0, p0, Lxhss/ᛷᛷᛱᛵ;->ᲀᲇᛳᲁ:[I

    .line 61
    .line 62
    if-gt v0, p2, :cond_2

    .line 63
    .line 64
    move v7, v0

    .line 65
    move v6, v5

    .line 66
    :goto_0
    aget v8, p0, v7

    .line 67
    .line 68
    sub-int/2addr v8, p1

    .line 69
    invoke-static {v8, v1}, Ljava/lang/Math;->min(II)I

    .line 70
    .line 71
    .line 72
    move-result v8

    .line 73
    aput v8, v4, v6

    .line 74
    .line 75
    add-int/lit8 v8, v6, 0x1

    .line 76
    .line 77
    array-length v9, v2

    .line 78
    add-int/2addr v6, v9

    .line 79
    array-length v9, v3

    .line 80
    add-int/2addr v9, v7

    .line 81
    aget v9, p0, v9

    .line 82
    .line 83
    aput v9, v4, v6

    .line 84
    .line 85
    if-eq v7, p2, :cond_2

    .line 86
    .line 87
    add-int/lit8 v7, v7, 0x1

    .line 88
    .line 89
    move v6, v8

    .line 90
    goto :goto_0

    .line 91
    :cond_2
    if-nez v0, :cond_3

    .line 92
    .line 93
    goto :goto_1

    .line 94
    :cond_3
    add-int/lit8 v0, v0, -0x1

    .line 95
    .line 96
    aget v5, p0, v0

    .line 97
    .line 98
    :goto_1
    array-length p0, v2

    .line 99
    aget p2, v4, p0

    .line 100
    .line 101
    sub-int/2addr p1, v5

    .line 102
    add-int/2addr p1, p2

    .line 103
    aput p1, v4, p0

    .line 104
    .line 105
    new-instance p0, Lxhss/ᛷᛷᛱᛵ;

    .line 106
    .line 107
    invoke-direct {p0, v2, v4}, Lxhss/ᛷᛷᛱᛵ;-><init>([[B[I)V

    .line 108
    .line 109
    .line 110
    return-object p0

    .line 111
    :cond_4
    const-string p0, " < beginIndex="

    .line 112
    .line 113
    invoke-static {p2, p1, v2, p0}, Lxhss/ᛴᛸᛲᛳ;->ᛸᛶᲈᛶ(IILjava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 114
    .line 115
    .line 116
    move-result-object p0

    .line 117
    invoke-static {p0}, Lxhss/ᛵᲈᲁᲈ;->ᛱᛱᛲᲇ(Ljava/lang/Object;)V

    .line 118
    .line 119
    .line 120
    return-object v0

    .line 121
    :cond_5
    invoke-virtual {p0}, Lxhss/ᛷᛷᛱᛵ;->ᛷᛵᛵᲈ()I

    .line 122
    .line 123
    .line 124
    move-result p0

    .line 125
    new-instance p1, Ljava/lang/StringBuilder;

    .line 126
    .line 127
    invoke-direct {p1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 128
    .line 129
    .line 130
    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 131
    .line 132
    .line 133
    const-string p2, " > length("

    .line 134
    .line 135
    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 136
    .line 137
    .line 138
    invoke-virtual {p1, p0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 139
    .line 140
    .line 141
    const/16 p0, 0x29

    .line 142
    .line 143
    invoke-virtual {p1, p0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 144
    .line 145
    .line 146
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 147
    .line 148
    .line 149
    move-result-object p0

    .line 150
    new-instance p1, Ljava/lang/IllegalArgumentException;

    .line 151
    .line 152
    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 153
    .line 154
    .line 155
    move-result-object p0

    .line 156
    invoke-direct {p1, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 157
    .line 158
    .line 159
    throw p1

    .line 160
    :cond_6
    const-string p0, "beginIndex="

    .line 161
    .line 162
    const-string p2, " < 0"

    .line 163
    .line 164
    invoke-static {p0, p1, p2}, Lxhss/ᛵᲈᲁᲈ;->ᛸᛷᲈᲈ(Ljava/lang/String;ILjava/lang/Object;)V

    .line 165
    .line 166
    .line 167
    return-object v0
.end method

.method public final ᲀᲇᛳᲁ(Ljava/nio/charset/Charset;)Ljava/lang/String;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lxhss/ᛷᛷᛱᛵ;->ᛷᲁᲁ()[B

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    new-instance v0, Ljava/lang/String;

    .line 6
    .line 7
    invoke-direct {v0, p0, p1}, Ljava/lang/String;-><init>([BLjava/nio/charset/Charset;)V

    .line 8
    .line 9
    .line 10
    return-object v0
.end method

.method public final ᲇᛴᲇᛵ(I)B
    .locals 9

    .line 1
    iget-object v0, p0, Lxhss/ᛷᛷᛱᛵ;->ᲇᛶᛴᲀ:[[B

    .line 2
    .line 3
    array-length v1, v0

    .line 4
    add-int/lit8 v1, v1, -0x1

    .line 5
    .line 6
    iget-object v2, p0, Lxhss/ᛷᛷᛱᛵ;->ᲀᲇᛳᲁ:[I

    .line 7
    .line 8
    aget v1, v2, v1

    .line 9
    .line 10
    int-to-long v3, v1

    .line 11
    int-to-long v5, p1

    .line 12
    const-wide/16 v7, 0x1

    .line 13
    .line 14
    invoke-static/range {v3 .. v8}, Lxhss/ᛷᛸᲀᲀ;->ᛸᛷᲈᲈ(JJJ)V

    .line 15
    .line 16
    .line 17
    invoke-static {p0, p1}, Lxhss/ᛵᛶᲀᲇ;->ᛸᛴᛶᛳ(Lxhss/ᛷᛷᛱᛵ;I)I

    .line 18
    .line 19
    .line 20
    move-result p0

    .line 21
    if-nez p0, :cond_0

    .line 22
    .line 23
    const/4 v1, 0x0

    .line 24
    goto :goto_0

    .line 25
    :cond_0
    add-int/lit8 v1, p0, -0x1

    .line 26
    .line 27
    aget v1, v2, v1

    .line 28
    .line 29
    :goto_0
    array-length v3, v0

    .line 30
    add-int/2addr v3, p0

    .line 31
    aget v2, v2, v3

    .line 32
    .line 33
    aget-object p0, v0, p0

    .line 34
    .line 35
    sub-int/2addr p1, v1

    .line 36
    add-int/2addr p1, v2

    .line 37
    aget-byte p0, p0, p1

    .line 38
    .line 39
    return p0
.end method

.method public final ᲇᛶᛴᲀ(Lxhss/ᛳᛶᲈᲈ;I)Z
    .locals 9

    .line 1
    invoke-virtual {p0}, Lxhss/ᛷᛷᛱᛵ;->ᛷᛵᛵᲈ()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    sub-int/2addr v0, p2

    .line 6
    const/4 v1, 0x0

    .line 7
    if-gez v0, :cond_0

    .line 8
    .line 9
    goto :goto_2

    .line 10
    :cond_0
    invoke-static {p0, v1}, Lxhss/ᛵᛶᲀᲇ;->ᛸᛴᛶᛳ(Lxhss/ᛷᛷᛱᛵ;I)I

    .line 11
    .line 12
    .line 13
    move-result v0

    .line 14
    move v2, v1

    .line 15
    move v3, v2

    .line 16
    :goto_0
    if-ge v2, p2, :cond_3

    .line 17
    .line 18
    iget-object v4, p0, Lxhss/ᛷᛷᛱᛵ;->ᲀᲇᛳᲁ:[I

    .line 19
    .line 20
    if-nez v0, :cond_1

    .line 21
    .line 22
    move v5, v1

    .line 23
    goto :goto_1

    .line 24
    :cond_1
    add-int/lit8 v5, v0, -0x1

    .line 25
    .line 26
    aget v5, v4, v5

    .line 27
    .line 28
    :goto_1
    aget v6, v4, v0

    .line 29
    .line 30
    sub-int/2addr v6, v5

    .line 31
    iget-object v7, p0, Lxhss/ᛷᛷᛱᛵ;->ᲇᛶᛴᲀ:[[B

    .line 32
    .line 33
    array-length v8, v7

    .line 34
    add-int/2addr v8, v0

    .line 35
    aget v4, v4, v8

    .line 36
    .line 37
    add-int/2addr v6, v5

    .line 38
    invoke-static {p2, v6}, Ljava/lang/Math;->min(II)I

    .line 39
    .line 40
    .line 41
    move-result v6

    .line 42
    sub-int/2addr v6, v2

    .line 43
    sub-int v5, v2, v5

    .line 44
    .line 45
    add-int/2addr v5, v4

    .line 46
    aget-object v4, v7, v0

    .line 47
    .line 48
    invoke-virtual {p1, v3, v4, v5, v6}, Lxhss/ᛳᛶᲈᲈ;->ᛷᛴᛷᛱ(I[BII)Z

    .line 49
    .line 50
    .line 51
    move-result v4

    .line 52
    if-nez v4, :cond_2

    .line 53
    .line 54
    :goto_2
    return v1

    .line 55
    :cond_2
    add-int/2addr v3, v6

    .line 56
    add-int/2addr v2, v6

    .line 57
    add-int/lit8 v0, v0, 0x1

    .line 58
    .line 59
    goto :goto_0

    .line 60
    :cond_3
    const/4 p0, 0x1

    .line 61
    return p0
.end method

.method public final ᲈᛳᲀ(Lxhss/ᛴᛲᛴᛶ;I)V
    .locals 9

    .line 1
    const/4 v0, 0x0

    .line 2
    invoke-static {p0, v0}, Lxhss/ᛵᛶᲀᲇ;->ᛸᛴᛶᛳ(Lxhss/ᛷᛷᛱᛵ;I)I

    .line 3
    .line 4
    .line 5
    move-result v1

    .line 6
    move v2, v0

    .line 7
    :goto_0
    if-ge v2, p2, :cond_2

    .line 8
    .line 9
    iget-object v3, p0, Lxhss/ᛷᛷᛱᛵ;->ᲀᲇᛳᲁ:[I

    .line 10
    .line 11
    if-nez v1, :cond_0

    .line 12
    .line 13
    move v4, v0

    .line 14
    goto :goto_1

    .line 15
    :cond_0
    add-int/lit8 v4, v1, -0x1

    .line 16
    .line 17
    aget v4, v3, v4

    .line 18
    .line 19
    :goto_1
    aget v5, v3, v1

    .line 20
    .line 21
    sub-int/2addr v5, v4

    .line 22
    iget-object v6, p0, Lxhss/ᛷᛷᛱᛵ;->ᲇᛶᛴᲀ:[[B

    .line 23
    .line 24
    array-length v7, v6

    .line 25
    add-int/2addr v7, v1

    .line 26
    aget v3, v3, v7

    .line 27
    .line 28
    add-int/2addr v5, v4

    .line 29
    invoke-static {p2, v5}, Ljava/lang/Math;->min(II)I

    .line 30
    .line 31
    .line 32
    move-result v5

    .line 33
    sub-int/2addr v5, v2

    .line 34
    sub-int v4, v2, v4

    .line 35
    .line 36
    add-int/2addr v4, v3

    .line 37
    aget-object v3, v6, v1

    .line 38
    .line 39
    new-instance v6, Lxhss/ᛲᛳᲁᛳ;

    .line 40
    .line 41
    add-int v7, v4, v5

    .line 42
    .line 43
    const/4 v8, 0x1

    .line 44
    invoke-direct {v6, v3, v4, v7, v8}, Lxhss/ᛲᛳᲁᛳ;-><init>([BIIZ)V

    .line 45
    .line 46
    .line 47
    iget-object v3, p1, Lxhss/ᛴᛲᛴᛶ;->ᛱᛱᛲᲇ:Lxhss/ᛲᛳᲁᛳ;

    .line 48
    .line 49
    if-nez v3, :cond_1

    .line 50
    .line 51
    iput-object v6, v6, Lxhss/ᛲᛳᲁᛳ;->ᲀᲇᛳᲁ:Lxhss/ᛲᛳᲁᛳ;

    .line 52
    .line 53
    iput-object v6, v6, Lxhss/ᛲᛳᲁᛳ;->ᲇᛶᛴᲀ:Lxhss/ᛲᛳᲁᛳ;

    .line 54
    .line 55
    iput-object v6, p1, Lxhss/ᛴᛲᛴᛶ;->ᛱᛱᛲᲇ:Lxhss/ᛲᛳᲁᛳ;

    .line 56
    .line 57
    goto :goto_2

    .line 58
    :cond_1
    iget-object v3, v3, Lxhss/ᛲᛳᲁᛳ;->ᲀᲇᛳᲁ:Lxhss/ᛲᛳᲁᛳ;

    .line 59
    .line 60
    invoke-virtual {v3, v6}, Lxhss/ᛲᛳᲁᛳ;->ᛱᛱᛲᲇ(Lxhss/ᛲᛳᲁᛳ;)V

    .line 61
    .line 62
    .line 63
    :goto_2
    add-int/2addr v2, v5

    .line 64
    add-int/lit8 v1, v1, 0x1

    .line 65
    .line 66
    goto :goto_0

    .line 67
    :cond_2
    iget-wide v0, p1, Lxhss/ᛴᛲᛴᛶ;->ᛳᲁᲇᛸ:J

    .line 68
    .line 69
    int-to-long v2, p2

    .line 70
    add-long/2addr v0, v2

    .line 71
    iput-wide v0, p1, Lxhss/ᛴᛲᛴᛶ;->ᛳᲁᲇᛸ:J

    .line 72
    .line 73
    return-void
.end method
