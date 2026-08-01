.class public final Lxhss/ᲇᛶᲁᛶ;
.super Ljava/lang/Object;
.source "r8-map-id-684deb5fba33a691397d1324861b0a91cfdff049bb058f400176b68a1f4afccc"


# instance fields
.field public ᛱᛱᛲᲇ:[B

.field public ᛳᲁᲇᛸ:I

.field public final synthetic ᛷᛵᛵᲈ:I


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    iput v0, p0, Lxhss/ᲇᛶᲁᛶ;->ᛷᛵᛵᲈ:I

    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    const/16 v0, 0x40

    .line 8
    .line 9
    new-array v0, v0, [B

    .line 10
    .line 11
    iput-object v0, p0, Lxhss/ᲇᛶᲁᛶ;->ᛱᛱᛲᲇ:[B

    .line 12
    .line 13
    return-void
.end method

.method public synthetic constructor <init>(Z)V
    .locals 0

    .line 14
    const/4 p1, 0x0

    iput p1, p0, Lxhss/ᲇᛶᲁᛶ;->ᛷᛵᛵᲈ:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public constructor <init>([BI)V
    .locals 1

    const/4 v0, 0x1

    iput v0, p0, Lxhss/ᲇᛶᲁᛶ;->ᛷᛵᛵᲈ:I

    .line 15
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 16
    iput-object p1, p0, Lxhss/ᲇᛶᲁᛶ;->ᛱᛱᛲᲇ:[B

    .line 17
    iput p2, p0, Lxhss/ᲇᛶᲁᛶ;->ᛳᲁᲇᛸ:I

    return-void
.end method


# virtual methods
.method public toString()Ljava/lang/String;
    .locals 8

    .line 1
    iget v0, p0, Lxhss/ᲇᛶᲁᛶ;->ᛷᛵᛵᲈ:I

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
    iget-object v0, p0, Lxhss/ᲇᛶᲁᛶ;->ᛱᛱᛲᲇ:[B

    .line 12
    .line 13
    iget p0, p0, Lxhss/ᲇᛶᲁᛶ;->ᛳᲁᲇᛸ:I

    .line 14
    .line 15
    aget-byte v1, v0, p0

    .line 16
    .line 17
    new-instance v2, Ljava/lang/StringBuilder;

    .line 18
    .line 19
    mul-int/lit8 v3, v1, 0x2

    .line 20
    .line 21
    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 22
    .line 23
    .line 24
    const/4 v3, 0x0

    .line 25
    :goto_0
    if-ge v3, v1, :cond_4

    .line 26
    .line 27
    mul-int/lit8 v4, v3, 0x2

    .line 28
    .line 29
    add-int v5, v4, p0

    .line 30
    .line 31
    const/4 v6, 0x1

    .line 32
    add-int/2addr v5, v6

    .line 33
    aget-byte v5, v0, v5

    .line 34
    .line 35
    if-eqz v5, :cond_3

    .line 36
    .line 37
    if-eq v5, v6, :cond_2

    .line 38
    .line 39
    const/4 v6, 0x2

    .line 40
    if-eq v5, v6, :cond_1

    .line 41
    .line 42
    const/4 v7, 0x3

    .line 43
    if-ne v5, v7, :cond_0

    .line 44
    .line 45
    add-int/2addr v4, p0

    .line 46
    add-int/2addr v4, v6

    .line 47
    aget-byte v4, v0, v4

    .line 48
    .line 49
    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 50
    .line 51
    .line 52
    const/16 v4, 0x3b

    .line 53
    .line 54
    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 55
    .line 56
    .line 57
    goto :goto_1

    .line 58
    :cond_0
    new-instance p0, Ljava/lang/AssertionError;

    .line 59
    .line 60
    invoke-direct {p0}, Ljava/lang/AssertionError;-><init>()V

    .line 61
    .line 62
    .line 63
    throw p0

    .line 64
    :cond_1
    const/16 v4, 0x2a

    .line 65
    .line 66
    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 67
    .line 68
    .line 69
    goto :goto_1

    .line 70
    :cond_2
    const/16 v4, 0x2e

    .line 71
    .line 72
    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 73
    .line 74
    .line 75
    goto :goto_1

    .line 76
    :cond_3
    const/16 v4, 0x5b

    .line 77
    .line 78
    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 79
    .line 80
    .line 81
    :goto_1
    add-int/lit8 v3, v3, 0x1

    .line 82
    .line 83
    goto :goto_0

    .line 84
    :cond_4
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 85
    .line 86
    .line 87
    move-result-object p0

    .line 88
    return-object p0

    .line 89
    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
    .end packed-switch
.end method

.method public ᛱᛱᛲᲇ(I)V
    .locals 3

    .line 1
    iget v0, p0, Lxhss/ᲇᛶᲁᛶ;->ᛳᲁᲇᛸ:I

    .line 2
    .line 3
    iget-object v1, p0, Lxhss/ᲇᛶᲁᛶ;->ᛱᛱᛲᲇ:[B

    .line 4
    .line 5
    array-length v2, v1

    .line 6
    if-gt v0, v2, :cond_1

    .line 7
    .line 8
    array-length v2, v1

    .line 9
    mul-int/lit8 v2, v2, 0x2

    .line 10
    .line 11
    add-int/2addr p1, v0

    .line 12
    if-le v2, p1, :cond_0

    .line 13
    .line 14
    goto :goto_0

    .line 15
    :cond_0
    move v2, p1

    .line 16
    :goto_0
    new-array p1, v2, [B

    .line 17
    .line 18
    const/4 v2, 0x0

    .line 19
    invoke-static {v1, v2, p1, v2, v0}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 20
    .line 21
    .line 22
    iput-object p1, p0, Lxhss/ᲇᛶᲁᛶ;->ᛱᛱᛲᲇ:[B

    .line 23
    .line 24
    return-void

    .line 25
    :cond_1
    new-instance p0, Ljava/lang/AssertionError;

    .line 26
    .line 27
    const-string p1, "Internal error"

    .line 28
    .line 29
    invoke-direct {p0, p1}, Ljava/lang/AssertionError;-><init>(Ljava/lang/Object;)V

    .line 30
    .line 31
    .line 32
    throw p0
.end method

.method public ᛳᲁᲇᛸ(II)V
    .locals 4

    .line 1
    iget v0, p0, Lxhss/ᲇᛶᲁᛶ;->ᛳᲁᲇᛸ:I

    .line 2
    .line 3
    add-int/lit8 v1, v0, 0x2

    .line 4
    .line 5
    iget-object v2, p0, Lxhss/ᲇᛶᲁᛶ;->ᛱᛱᛲᲇ:[B

    .line 6
    .line 7
    array-length v2, v2

    .line 8
    if-le v1, v2, :cond_0

    .line 9
    .line 10
    const/4 v2, 0x2

    .line 11
    invoke-virtual {p0, v2}, Lxhss/ᲇᛶᲁᛶ;->ᛱᛱᛲᲇ(I)V

    .line 12
    .line 13
    .line 14
    :cond_0
    iget-object v2, p0, Lxhss/ᲇᛶᲁᛶ;->ᛱᛱᛲᲇ:[B

    .line 15
    .line 16
    add-int/lit8 v3, v0, 0x1

    .line 17
    .line 18
    int-to-byte p1, p1

    .line 19
    aput-byte p1, v2, v0

    .line 20
    .line 21
    int-to-byte p1, p2

    .line 22
    aput-byte p1, v2, v3

    .line 23
    .line 24
    iput v1, p0, Lxhss/ᲇᛶᲁᛶ;->ᛳᲁᲇᛸ:I

    .line 25
    .line 26
    return-void
.end method

.method public ᛷᛴᛷᛱ(II)V
    .locals 4

    .line 1
    iget v0, p0, Lxhss/ᲇᛶᲁᛶ;->ᛳᲁᲇᛸ:I

    .line 2
    .line 3
    add-int/lit8 v1, v0, 0x3

    .line 4
    .line 5
    iget-object v2, p0, Lxhss/ᲇᛶᲁᛶ;->ᛱᛱᛲᲇ:[B

    .line 6
    .line 7
    array-length v2, v2

    .line 8
    if-le v1, v2, :cond_0

    .line 9
    .line 10
    const/4 v2, 0x3

    .line 11
    invoke-virtual {p0, v2}, Lxhss/ᲇᛶᲁᛶ;->ᛱᛱᛲᲇ(I)V

    .line 12
    .line 13
    .line 14
    :cond_0
    iget-object v2, p0, Lxhss/ᲇᛶᲁᛶ;->ᛱᛱᛲᲇ:[B

    .line 15
    .line 16
    add-int/lit8 v3, v0, 0x1

    .line 17
    .line 18
    int-to-byte p1, p1

    .line 19
    aput-byte p1, v2, v0

    .line 20
    .line 21
    add-int/lit8 v0, v0, 0x2

    .line 22
    .line 23
    ushr-int/lit8 p1, p2, 0x8

    .line 24
    .line 25
    int-to-byte p1, p1

    .line 26
    aput-byte p1, v2, v3

    .line 27
    .line 28
    int-to-byte p1, p2

    .line 29
    aput-byte p1, v2, v0

    .line 30
    .line 31
    iput v1, p0, Lxhss/ᲇᛶᲁᛶ;->ᛳᲁᲇᛸ:I

    .line 32
    .line 33
    return-void
.end method

.method public ᛷᛵᛵᲈ(Ljava/lang/String;II)V
    .locals 9

    .line 1
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    move v1, p2

    .line 6
    move v2, v1

    .line 7
    :goto_0
    const/16 v3, 0x7ff

    .line 8
    .line 9
    const/16 v4, 0x7f

    .line 10
    .line 11
    const/4 v5, 0x1

    .line 12
    if-ge v1, v0, :cond_2

    .line 13
    .line 14
    invoke-virtual {p1, v1}, Ljava/lang/String;->charAt(I)C

    .line 15
    .line 16
    .line 17
    move-result v6

    .line 18
    if-lt v6, v5, :cond_0

    .line 19
    .line 20
    if-gt v6, v4, :cond_0

    .line 21
    .line 22
    add-int/lit8 v2, v2, 0x1

    .line 23
    .line 24
    goto :goto_1

    .line 25
    :cond_0
    if-gt v6, v3, :cond_1

    .line 26
    .line 27
    add-int/lit8 v2, v2, 0x2

    .line 28
    .line 29
    goto :goto_1

    .line 30
    :cond_1
    add-int/lit8 v2, v2, 0x3

    .line 31
    .line 32
    :goto_1
    add-int/lit8 v1, v1, 0x1

    .line 33
    .line 34
    goto :goto_0

    .line 35
    :cond_2
    if-gt v2, p3, :cond_8

    .line 36
    .line 37
    iget p3, p0, Lxhss/ᲇᛶᲁᛶ;->ᛳᲁᲇᛸ:I

    .line 38
    .line 39
    sub-int v1, p3, p2

    .line 40
    .line 41
    add-int/lit8 v6, v1, -0x2

    .line 42
    .line 43
    if-ltz v6, :cond_3

    .line 44
    .line 45
    iget-object v7, p0, Lxhss/ᲇᛶᲁᛶ;->ᛱᛱᛲᲇ:[B

    .line 46
    .line 47
    ushr-int/lit8 v8, v2, 0x8

    .line 48
    .line 49
    int-to-byte v8, v8

    .line 50
    aput-byte v8, v7, v6

    .line 51
    .line 52
    sub-int/2addr v1, v5

    .line 53
    int-to-byte v6, v2

    .line 54
    aput-byte v6, v7, v1

    .line 55
    .line 56
    :cond_3
    add-int/2addr p3, v2

    .line 57
    sub-int/2addr p3, p2

    .line 58
    iget-object v1, p0, Lxhss/ᲇᛶᲁᛶ;->ᛱᛱᛲᲇ:[B

    .line 59
    .line 60
    array-length v1, v1

    .line 61
    if-le p3, v1, :cond_4

    .line 62
    .line 63
    sub-int/2addr v2, p2

    .line 64
    invoke-virtual {p0, v2}, Lxhss/ᲇᛶᲁᛶ;->ᛱᛱᛲᲇ(I)V

    .line 65
    .line 66
    .line 67
    :cond_4
    iget p3, p0, Lxhss/ᲇᛶᲁᛶ;->ᛳᲁᲇᛸ:I

    .line 68
    .line 69
    :goto_2
    if-ge p2, v0, :cond_7

    .line 70
    .line 71
    invoke-virtual {p1, p2}, Ljava/lang/String;->charAt(I)C

    .line 72
    .line 73
    .line 74
    move-result v1

    .line 75
    if-lt v1, v5, :cond_5

    .line 76
    .line 77
    if-gt v1, v4, :cond_5

    .line 78
    .line 79
    iget-object v2, p0, Lxhss/ᲇᛶᲁᛶ;->ᛱᛱᛲᲇ:[B

    .line 80
    .line 81
    add-int/lit8 v6, p3, 0x1

    .line 82
    .line 83
    int-to-byte v1, v1

    .line 84
    aput-byte v1, v2, p3

    .line 85
    .line 86
    move p3, v6

    .line 87
    goto :goto_3

    .line 88
    :cond_5
    iget-object v2, p0, Lxhss/ᲇᛶᲁᛶ;->ᛱᛱᛲᲇ:[B

    .line 89
    .line 90
    if-gt v1, v3, :cond_6

    .line 91
    .line 92
    add-int/lit8 v6, p3, 0x1

    .line 93
    .line 94
    shr-int/lit8 v7, v1, 0x6

    .line 95
    .line 96
    and-int/lit8 v7, v7, 0x1f

    .line 97
    .line 98
    or-int/lit16 v7, v7, 0xc0

    .line 99
    .line 100
    int-to-byte v7, v7

    .line 101
    aput-byte v7, v2, p3

    .line 102
    .line 103
    add-int/lit8 p3, p3, 0x2

    .line 104
    .line 105
    and-int/lit8 v1, v1, 0x3f

    .line 106
    .line 107
    or-int/lit16 v1, v1, 0x80

    .line 108
    .line 109
    int-to-byte v1, v1

    .line 110
    aput-byte v1, v2, v6

    .line 111
    .line 112
    goto :goto_3

    .line 113
    :cond_6
    add-int/lit8 v6, p3, 0x1

    .line 114
    .line 115
    shr-int/lit8 v7, v1, 0xc

    .line 116
    .line 117
    and-int/lit8 v7, v7, 0xf

    .line 118
    .line 119
    or-int/lit16 v7, v7, 0xe0

    .line 120
    .line 121
    int-to-byte v7, v7

    .line 122
    aput-byte v7, v2, p3

    .line 123
    .line 124
    add-int/lit8 v7, p3, 0x2

    .line 125
    .line 126
    shr-int/lit8 v8, v1, 0x6

    .line 127
    .line 128
    and-int/lit8 v8, v8, 0x3f

    .line 129
    .line 130
    or-int/lit16 v8, v8, 0x80

    .line 131
    .line 132
    int-to-byte v8, v8

    .line 133
    aput-byte v8, v2, v6

    .line 134
    .line 135
    add-int/lit8 p3, p3, 0x3

    .line 136
    .line 137
    and-int/lit8 v1, v1, 0x3f

    .line 138
    .line 139
    or-int/lit16 v1, v1, 0x80

    .line 140
    .line 141
    int-to-byte v1, v1

    .line 142
    aput-byte v1, v2, v7

    .line 143
    .line 144
    :goto_3
    add-int/lit8 p2, p2, 0x1

    .line 145
    .line 146
    goto :goto_2

    .line 147
    :cond_7
    iput p3, p0, Lxhss/ᲇᛶᲁᛶ;->ᛳᲁᲇᛸ:I

    .line 148
    .line 149
    return-void

    .line 150
    :cond_8
    const-string p0, "UTF8 string too large"

    .line 151
    .line 152
    invoke-static {p0}, Lxhss/ᛵᲈᲁᲈ;->ᲀᲇᛳᲁ(Ljava/lang/String;)V

    .line 153
    .line 154
    .line 155
    return-void
.end method

.method public ᛸᛲᲀᛵ(I)V
    .locals 6

    .line 1
    iget v0, p0, Lxhss/ᲇᛶᲁᛶ;->ᛳᲁᲇᛸ:I

    .line 2
    .line 3
    add-int/lit8 v1, v0, 0x4

    .line 4
    .line 5
    iget-object v2, p0, Lxhss/ᲇᛶᲁᛶ;->ᛱᛱᛲᲇ:[B

    .line 6
    .line 7
    array-length v2, v2

    .line 8
    if-le v1, v2, :cond_0

    .line 9
    .line 10
    const/4 v2, 0x4

    .line 11
    invoke-virtual {p0, v2}, Lxhss/ᲇᛶᲁᛶ;->ᛱᛱᛲᲇ(I)V

    .line 12
    .line 13
    .line 14
    :cond_0
    iget-object v2, p0, Lxhss/ᲇᛶᲁᛶ;->ᛱᛱᛲᲇ:[B

    .line 15
    .line 16
    add-int/lit8 v3, v0, 0x1

    .line 17
    .line 18
    ushr-int/lit8 v4, p1, 0x18

    .line 19
    .line 20
    int-to-byte v4, v4

    .line 21
    aput-byte v4, v2, v0

    .line 22
    .line 23
    add-int/lit8 v4, v0, 0x2

    .line 24
    .line 25
    ushr-int/lit8 v5, p1, 0x10

    .line 26
    .line 27
    int-to-byte v5, v5

    .line 28
    aput-byte v5, v2, v3

    .line 29
    .line 30
    add-int/lit8 v0, v0, 0x3

    .line 31
    .line 32
    ushr-int/lit8 v3, p1, 0x8

    .line 33
    .line 34
    int-to-byte v3, v3

    .line 35
    aput-byte v3, v2, v4

    .line 36
    .line 37
    int-to-byte p1, p1

    .line 38
    aput-byte p1, v2, v0

    .line 39
    .line 40
    iput v1, p0, Lxhss/ᲇᛶᲁᛶ;->ᛳᲁᲇᛸ:I

    .line 41
    .line 42
    return-void
.end method

.method public ᛸᛴᛶᛳ([BII)V
    .locals 2

    .line 1
    iget v0, p0, Lxhss/ᲇᛶᲁᛶ;->ᛳᲁᲇᛸ:I

    .line 2
    .line 3
    add-int/2addr v0, p3

    .line 4
    iget-object v1, p0, Lxhss/ᲇᛶᲁᛶ;->ᛱᛱᛲᲇ:[B

    .line 5
    .line 6
    array-length v1, v1

    .line 7
    if-le v0, v1, :cond_0

    .line 8
    .line 9
    invoke-virtual {p0, p3}, Lxhss/ᲇᛶᲁᛶ;->ᛱᛱᛲᲇ(I)V

    .line 10
    .line 11
    .line 12
    :cond_0
    if-eqz p1, :cond_1

    .line 13
    .line 14
    iget-object v0, p0, Lxhss/ᲇᛶᲁᛶ;->ᛱᛱᛲᲇ:[B

    .line 15
    .line 16
    iget v1, p0, Lxhss/ᲇᛶᲁᛶ;->ᛳᲁᲇᛸ:I

    .line 17
    .line 18
    invoke-static {p1, p2, v0, v1, p3}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 19
    .line 20
    .line 21
    :cond_1
    iget p1, p0, Lxhss/ᲇᛶᲁᛶ;->ᛳᲁᲇᛸ:I

    .line 22
    .line 23
    add-int/2addr p1, p3

    .line 24
    iput p1, p0, Lxhss/ᲇᛶᲁᛶ;->ᛳᲁᲇᛸ:I

    .line 25
    .line 26
    return-void
.end method

.method public ᛸᛷᲈᲈ(I)V
    .locals 5

    .line 1
    iget v0, p0, Lxhss/ᲇᛶᲁᛶ;->ᛳᲁᲇᛸ:I

    .line 2
    .line 3
    add-int/lit8 v1, v0, 0x2

    .line 4
    .line 5
    iget-object v2, p0, Lxhss/ᲇᛶᲁᛶ;->ᛱᛱᛲᲇ:[B

    .line 6
    .line 7
    array-length v2, v2

    .line 8
    if-le v1, v2, :cond_0

    .line 9
    .line 10
    const/4 v2, 0x2

    .line 11
    invoke-virtual {p0, v2}, Lxhss/ᲇᛶᲁᛶ;->ᛱᛱᛲᲇ(I)V

    .line 12
    .line 13
    .line 14
    :cond_0
    iget-object v2, p0, Lxhss/ᲇᛶᲁᛶ;->ᛱᛱᛲᲇ:[B

    .line 15
    .line 16
    add-int/lit8 v3, v0, 0x1

    .line 17
    .line 18
    ushr-int/lit8 v4, p1, 0x8

    .line 19
    .line 20
    int-to-byte v4, v4

    .line 21
    aput-byte v4, v2, v0

    .line 22
    .line 23
    int-to-byte p1, p1

    .line 24
    aput-byte p1, v2, v3

    .line 25
    .line 26
    iput v1, p0, Lxhss/ᲇᛶᲁᛶ;->ᛳᲁᲇᛸ:I

    .line 27
    .line 28
    return-void
.end method

.method public ᲀᲇᛳᲁ(I)V
    .locals 3

    .line 1
    iget v0, p0, Lxhss/ᲇᛶᲁᛶ;->ᛳᲁᲇᛸ:I

    .line 2
    .line 3
    add-int/lit8 v1, v0, 0x1

    .line 4
    .line 5
    iget-object v2, p0, Lxhss/ᲇᛶᲁᛶ;->ᛱᛱᛲᲇ:[B

    .line 6
    .line 7
    array-length v2, v2

    .line 8
    if-le v1, v2, :cond_0

    .line 9
    .line 10
    const/4 v2, 0x1

    .line 11
    invoke-virtual {p0, v2}, Lxhss/ᲇᛶᲁᛶ;->ᛱᛱᛲᲇ(I)V

    .line 12
    .line 13
    .line 14
    :cond_0
    iget-object v2, p0, Lxhss/ᲇᛶᲁᛶ;->ᛱᛱᛲᲇ:[B

    .line 15
    .line 16
    int-to-byte p1, p1

    .line 17
    aput-byte p1, v2, v0

    .line 18
    .line 19
    iput v1, p0, Lxhss/ᲇᛶᲁᛶ;->ᛳᲁᲇᛸ:I

    .line 20
    .line 21
    return-void
.end method

.method public ᲇᛴᲇᛵ(II)V
    .locals 5

    .line 1
    iget v0, p0, Lxhss/ᲇᛶᲁᛶ;->ᛳᲁᲇᛸ:I

    .line 2
    .line 3
    add-int/lit8 v1, v0, 0x4

    .line 4
    .line 5
    iget-object v2, p0, Lxhss/ᲇᛶᲁᛶ;->ᛱᛱᛲᲇ:[B

    .line 6
    .line 7
    array-length v2, v2

    .line 8
    if-le v1, v2, :cond_0

    .line 9
    .line 10
    const/4 v2, 0x4

    .line 11
    invoke-virtual {p0, v2}, Lxhss/ᲇᛶᲁᛶ;->ᛱᛱᛲᲇ(I)V

    .line 12
    .line 13
    .line 14
    :cond_0
    iget-object v2, p0, Lxhss/ᲇᛶᲁᛶ;->ᛱᛱᛲᲇ:[B

    .line 15
    .line 16
    add-int/lit8 v3, v0, 0x1

    .line 17
    .line 18
    const/16 v4, 0xf

    .line 19
    .line 20
    aput-byte v4, v2, v0

    .line 21
    .line 22
    add-int/lit8 v4, v0, 0x2

    .line 23
    .line 24
    int-to-byte p1, p1

    .line 25
    aput-byte p1, v2, v3

    .line 26
    .line 27
    add-int/lit8 v0, v0, 0x3

    .line 28
    .line 29
    ushr-int/lit8 p1, p2, 0x8

    .line 30
    .line 31
    int-to-byte p1, p1

    .line 32
    aput-byte p1, v2, v4

    .line 33
    .line 34
    int-to-byte p1, p2

    .line 35
    aput-byte p1, v2, v0

    .line 36
    .line 37
    iput v1, p0, Lxhss/ᲇᛶᲁᛶ;->ᛳᲁᲇᛸ:I

    .line 38
    .line 39
    return-void
.end method

.method public ᲇᛶᛴᲀ(III)V
    .locals 5

    .line 1
    iget v0, p0, Lxhss/ᲇᛶᲁᛶ;->ᛳᲁᲇᛸ:I

    .line 2
    .line 3
    add-int/lit8 v1, v0, 0x5

    .line 4
    .line 5
    iget-object v2, p0, Lxhss/ᲇᛶᲁᛶ;->ᛱᛱᛲᲇ:[B

    .line 6
    .line 7
    array-length v2, v2

    .line 8
    if-le v1, v2, :cond_0

    .line 9
    .line 10
    const/4 v2, 0x5

    .line 11
    invoke-virtual {p0, v2}, Lxhss/ᲇᛶᲁᛶ;->ᛱᛱᛲᲇ(I)V

    .line 12
    .line 13
    .line 14
    :cond_0
    iget-object v2, p0, Lxhss/ᲇᛶᲁᛶ;->ᛱᛱᛲᲇ:[B

    .line 15
    .line 16
    add-int/lit8 v3, v0, 0x1

    .line 17
    .line 18
    int-to-byte p1, p1

    .line 19
    aput-byte p1, v2, v0

    .line 20
    .line 21
    add-int/lit8 p1, v0, 0x2

    .line 22
    .line 23
    ushr-int/lit8 v4, p2, 0x8

    .line 24
    .line 25
    int-to-byte v4, v4

    .line 26
    aput-byte v4, v2, v3

    .line 27
    .line 28
    add-int/lit8 v3, v0, 0x3

    .line 29
    .line 30
    int-to-byte p2, p2

    .line 31
    aput-byte p2, v2, p1

    .line 32
    .line 33
    add-int/lit8 v0, v0, 0x4

    .line 34
    .line 35
    ushr-int/lit8 p1, p3, 0x8

    .line 36
    .line 37
    int-to-byte p1, p1

    .line 38
    aput-byte p1, v2, v3

    .line 39
    .line 40
    int-to-byte p1, p3

    .line 41
    aput-byte p1, v2, v0

    .line 42
    .line 43
    iput v1, p0, Lxhss/ᲇᛶᲁᛶ;->ᛳᲁᲇᛸ:I

    .line 44
    .line 45
    return-void
.end method
