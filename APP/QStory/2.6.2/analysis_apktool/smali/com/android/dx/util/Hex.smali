.class public final Lcom/android/dx/util/Hex;
.super Ljava/lang/Object;
.source "r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776"


# direct methods
.method private constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static dump([BIIIII)Ljava/lang/String;
    .locals 6

    .line 1
    move v0, p5

    .line 2
    add-int p5, p1, p2

    .line 3
    .line 4
    or-int v1, p1, p2

    .line 5
    .line 6
    or-int/2addr v1, p5

    .line 7
    const/4 v2, 0x0

    .line 8
    if-ltz v1, :cond_a

    .line 9
    .line 10
    array-length v1, p0

    .line 11
    if-gt p5, v1, :cond_a

    .line 12
    .line 13
    if-ltz p3, :cond_9

    .line 14
    .line 15
    if-nez p2, :cond_0

    .line 16
    .line 17
    const-string p0, ""

    .line 18
    .line 19
    return-object p0

    .line 20
    :cond_0
    new-instance p5, Ljava/lang/StringBuilder;

    .line 21
    .line 22
    mul-int/lit8 v1, p2, 0x4

    .line 23
    .line 24
    const/4 v2, 0x6

    .line 25
    add-int/2addr v1, v2

    .line 26
    invoke-direct {p5, v1}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 27
    .line 28
    .line 29
    const/4 v1, 0x0

    .line 30
    move v3, v1

    .line 31
    :goto_0
    const/16 v4, 0xa

    .line 32
    .line 33
    if-lez p2, :cond_7

    .line 34
    .line 35
    if-nez v3, :cond_4

    .line 36
    .line 37
    const/4 v5, 0x2

    .line 38
    if-eq v0, v5, :cond_3

    .line 39
    .line 40
    const/4 v5, 0x4

    .line 41
    if-eq v0, v5, :cond_2

    .line 42
    .line 43
    if-eq v0, v2, :cond_1

    .line 44
    .line 45
    invoke-static {p3}, Lcom/android/dx/util/Hex;->u4(I)Ljava/lang/String;

    .line 46
    .line 47
    .line 48
    move-result-object v5

    .line 49
    goto :goto_1

    .line 50
    :cond_1
    invoke-static {p3}, Lcom/android/dx/util/Hex;->u3(I)Ljava/lang/String;

    .line 51
    .line 52
    .line 53
    move-result-object v5

    .line 54
    goto :goto_1

    .line 55
    :cond_2
    invoke-static {p3}, Lcom/android/dx/util/Hex;->u2(I)Ljava/lang/String;

    .line 56
    .line 57
    .line 58
    move-result-object v5

    .line 59
    goto :goto_1

    .line 60
    :cond_3
    invoke-static {p3}, Lcom/android/dx/util/Hex;->u1(I)Ljava/lang/String;

    .line 61
    .line 62
    .line 63
    move-result-object v5

    .line 64
    :goto_1
    invoke-virtual {p5, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 65
    .line 66
    .line 67
    const-string v5, ": "

    .line 68
    .line 69
    invoke-virtual {p5, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 70
    .line 71
    .line 72
    goto :goto_2

    .line 73
    :cond_4
    and-int/lit8 v5, v3, 0x1

    .line 74
    .line 75
    if-nez v5, :cond_5

    .line 76
    .line 77
    const/16 v5, 0x20

    .line 78
    .line 79
    invoke-virtual {p5, v5}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 80
    .line 81
    .line 82
    :cond_5
    :goto_2
    aget-byte v5, p0, p1

    .line 83
    .line 84
    invoke-static {v5}, Lcom/android/dx/util/Hex;->u1(I)Ljava/lang/String;

    .line 85
    .line 86
    .line 87
    move-result-object v5

    .line 88
    invoke-virtual {p5, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 89
    .line 90
    .line 91
    add-int/lit8 p3, p3, 0x1

    .line 92
    .line 93
    add-int/lit8 p1, p1, 0x1

    .line 94
    .line 95
    add-int/lit8 v3, v3, 0x1

    .line 96
    .line 97
    if-ne v3, p4, :cond_6

    .line 98
    .line 99
    invoke-virtual {p5, v4}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 100
    .line 101
    .line 102
    move v3, v1

    .line 103
    :cond_6
    add-int/lit8 p2, p2, -0x1

    .line 104
    .line 105
    goto :goto_0

    .line 106
    :cond_7
    if-eqz v3, :cond_8

    .line 107
    .line 108
    invoke-virtual {p5, v4}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 109
    .line 110
    .line 111
    :cond_8
    invoke-virtual {p5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 112
    .line 113
    .line 114
    move-result-object p0

    .line 115
    return-object p0

    .line 116
    :cond_9
    const-string p0, "outOffset < 0"

    .line 117
    .line 118
    invoke-static {p0}, Ltop/suzhelan/qstory/hook/item/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪苏世哲兰(Ljava/lang/String;)V

    .line 119
    .line 120
    .line 121
    return-object v2

    .line 122
    :cond_a
    array-length p0, p0

    .line 123
    const-string p2, "; "

    .line 124
    .line 125
    const-string p4, "..!"

    .line 126
    .line 127
    move p3, p1

    .line 128
    move p1, p0

    .line 129
    const-string p0, "arr.length "

    .line 130
    .line 131
    invoke-static/range {p0 .. p5}, Lcom/alibaba/fastjson2/飘花落叶言子苏兰世楪哲;->飘花落叶言子楪苏兰哲世(Ljava/lang/String;ILjava/lang/Object;ILjava/lang/Object;I)V

    .line 132
    .line 133
    .line 134
    return-object v2
.end method

.method public static s1(I)Ljava/lang/String;
    .locals 5

    .line 1
    const/4 v0, 0x3

    .line 2
    new-array v0, v0, [C

    .line 3
    .line 4
    const/4 v1, 0x0

    .line 5
    if-gez p0, :cond_0

    .line 6
    .line 7
    const/16 v2, 0x2d

    .line 8
    .line 9
    aput-char v2, v0, v1

    .line 10
    .line 11
    neg-int p0, p0

    .line 12
    goto :goto_0

    .line 13
    :cond_0
    const/16 v2, 0x2b

    .line 14
    .line 15
    aput-char v2, v0, v1

    .line 16
    .line 17
    :goto_0
    const/4 v2, 0x2

    .line 18
    if-ge v1, v2, :cond_1

    .line 19
    .line 20
    rsub-int/lit8 v2, v1, 0x2

    .line 21
    .line 22
    and-int/lit8 v3, p0, 0xf

    .line 23
    .line 24
    const/16 v4, 0x10

    .line 25
    .line 26
    invoke-static {v3, v4}, Ljava/lang/Character;->forDigit(II)C

    .line 27
    .line 28
    .line 29
    move-result v3

    .line 30
    aput-char v3, v0, v2

    .line 31
    .line 32
    shr-int/lit8 p0, p0, 0x4

    .line 33
    .line 34
    add-int/lit8 v1, v1, 0x1

    .line 35
    .line 36
    goto :goto_0

    .line 37
    :cond_1
    new-instance p0, Ljava/lang/String;

    .line 38
    .line 39
    invoke-direct {p0, v0}, Ljava/lang/String;-><init>([C)V

    .line 40
    .line 41
    .line 42
    return-object p0
.end method

.method public static s2(I)Ljava/lang/String;
    .locals 6

    .line 1
    const/4 v0, 0x5

    .line 2
    new-array v0, v0, [C

    .line 3
    .line 4
    const/4 v1, 0x0

    .line 5
    if-gez p0, :cond_0

    .line 6
    .line 7
    const/16 v2, 0x2d

    .line 8
    .line 9
    aput-char v2, v0, v1

    .line 10
    .line 11
    neg-int p0, p0

    .line 12
    goto :goto_0

    .line 13
    :cond_0
    const/16 v2, 0x2b

    .line 14
    .line 15
    aput-char v2, v0, v1

    .line 16
    .line 17
    :goto_0
    const/4 v2, 0x4

    .line 18
    if-ge v1, v2, :cond_1

    .line 19
    .line 20
    rsub-int/lit8 v3, v1, 0x4

    .line 21
    .line 22
    and-int/lit8 v4, p0, 0xf

    .line 23
    .line 24
    const/16 v5, 0x10

    .line 25
    .line 26
    invoke-static {v4, v5}, Ljava/lang/Character;->forDigit(II)C

    .line 27
    .line 28
    .line 29
    move-result v4

    .line 30
    aput-char v4, v0, v3

    .line 31
    .line 32
    shr-int/2addr p0, v2

    .line 33
    add-int/lit8 v1, v1, 0x1

    .line 34
    .line 35
    goto :goto_0

    .line 36
    :cond_1
    new-instance p0, Ljava/lang/String;

    .line 37
    .line 38
    invoke-direct {p0, v0}, Ljava/lang/String;-><init>([C)V

    .line 39
    .line 40
    .line 41
    return-object p0
.end method

.method public static s4(I)Ljava/lang/String;
    .locals 5

    .line 1
    const/16 v0, 0x9

    .line 2
    .line 3
    new-array v0, v0, [C

    .line 4
    .line 5
    const/4 v1, 0x0

    .line 6
    if-gez p0, :cond_0

    .line 7
    .line 8
    const/16 v2, 0x2d

    .line 9
    .line 10
    aput-char v2, v0, v1

    .line 11
    .line 12
    neg-int p0, p0

    .line 13
    goto :goto_0

    .line 14
    :cond_0
    const/16 v2, 0x2b

    .line 15
    .line 16
    aput-char v2, v0, v1

    .line 17
    .line 18
    :goto_0
    const/16 v2, 0x8

    .line 19
    .line 20
    if-ge v1, v2, :cond_1

    .line 21
    .line 22
    rsub-int/lit8 v2, v1, 0x8

    .line 23
    .line 24
    and-int/lit8 v3, p0, 0xf

    .line 25
    .line 26
    const/16 v4, 0x10

    .line 27
    .line 28
    invoke-static {v3, v4}, Ljava/lang/Character;->forDigit(II)C

    .line 29
    .line 30
    .line 31
    move-result v3

    .line 32
    aput-char v3, v0, v2

    .line 33
    .line 34
    shr-int/lit8 p0, p0, 0x4

    .line 35
    .line 36
    add-int/lit8 v1, v1, 0x1

    .line 37
    .line 38
    goto :goto_0

    .line 39
    :cond_1
    new-instance p0, Ljava/lang/String;

    .line 40
    .line 41
    invoke-direct {p0, v0}, Ljava/lang/String;-><init>([C)V

    .line 42
    .line 43
    .line 44
    return-object p0
.end method

.method public static s8(J)Ljava/lang/String;
    .locals 5

    .line 1
    const/16 v0, 0x11

    .line 2
    .line 3
    new-array v0, v0, [C

    .line 4
    .line 5
    const-wide/16 v1, 0x0

    .line 6
    .line 7
    cmp-long v1, p0, v1

    .line 8
    .line 9
    const/4 v2, 0x0

    .line 10
    if-gez v1, :cond_0

    .line 11
    .line 12
    const/16 v1, 0x2d

    .line 13
    .line 14
    aput-char v1, v0, v2

    .line 15
    .line 16
    neg-long p0, p0

    .line 17
    goto :goto_0

    .line 18
    :cond_0
    const/16 v1, 0x2b

    .line 19
    .line 20
    aput-char v1, v0, v2

    .line 21
    .line 22
    :goto_0
    const/16 v1, 0x10

    .line 23
    .line 24
    if-ge v2, v1, :cond_1

    .line 25
    .line 26
    rsub-int/lit8 v3, v2, 0x10

    .line 27
    .line 28
    long-to-int v4, p0

    .line 29
    and-int/lit8 v4, v4, 0xf

    .line 30
    .line 31
    invoke-static {v4, v1}, Ljava/lang/Character;->forDigit(II)C

    .line 32
    .line 33
    .line 34
    move-result v1

    .line 35
    aput-char v1, v0, v3

    .line 36
    .line 37
    const/4 v1, 0x4

    .line 38
    shr-long/2addr p0, v1

    .line 39
    add-int/lit8 v2, v2, 0x1

    .line 40
    .line 41
    goto :goto_0

    .line 42
    :cond_1
    new-instance p0, Ljava/lang/String;

    .line 43
    .line 44
    invoke-direct {p0, v0}, Ljava/lang/String;-><init>([C)V

    .line 45
    .line 46
    .line 47
    return-object p0
.end method

.method public static u1(I)Ljava/lang/String;
    .locals 6

    .line 1
    const/4 v0, 0x2

    .line 2
    new-array v1, v0, [C

    .line 3
    .line 4
    const/4 v2, 0x0

    .line 5
    :goto_0
    if-ge v2, v0, :cond_0

    .line 6
    .line 7
    rsub-int/lit8 v3, v2, 0x1

    .line 8
    .line 9
    and-int/lit8 v4, p0, 0xf

    .line 10
    .line 11
    const/16 v5, 0x10

    .line 12
    .line 13
    invoke-static {v4, v5}, Ljava/lang/Character;->forDigit(II)C

    .line 14
    .line 15
    .line 16
    move-result v4

    .line 17
    aput-char v4, v1, v3

    .line 18
    .line 19
    shr-int/lit8 p0, p0, 0x4

    .line 20
    .line 21
    add-int/lit8 v2, v2, 0x1

    .line 22
    .line 23
    goto :goto_0

    .line 24
    :cond_0
    new-instance p0, Ljava/lang/String;

    .line 25
    .line 26
    invoke-direct {p0, v1}, Ljava/lang/String;-><init>([C)V

    .line 27
    .line 28
    .line 29
    return-object p0
.end method

.method public static u2(I)Ljava/lang/String;
    .locals 6

    .line 1
    const/4 v0, 0x4

    .line 2
    new-array v1, v0, [C

    .line 3
    .line 4
    const/4 v2, 0x0

    .line 5
    :goto_0
    if-ge v2, v0, :cond_0

    .line 6
    .line 7
    rsub-int/lit8 v3, v2, 0x3

    .line 8
    .line 9
    and-int/lit8 v4, p0, 0xf

    .line 10
    .line 11
    const/16 v5, 0x10

    .line 12
    .line 13
    invoke-static {v4, v5}, Ljava/lang/Character;->forDigit(II)C

    .line 14
    .line 15
    .line 16
    move-result v4

    .line 17
    aput-char v4, v1, v3

    .line 18
    .line 19
    shr-int/2addr p0, v0

    .line 20
    add-int/lit8 v2, v2, 0x1

    .line 21
    .line 22
    goto :goto_0

    .line 23
    :cond_0
    new-instance p0, Ljava/lang/String;

    .line 24
    .line 25
    invoke-direct {p0, v1}, Ljava/lang/String;-><init>([C)V

    .line 26
    .line 27
    .line 28
    return-object p0
.end method

.method public static u2or4(I)Ljava/lang/String;
    .locals 1

    .line 1
    int-to-char v0, p0

    .line 2
    if-ne p0, v0, :cond_0

    .line 3
    .line 4
    invoke-static {p0}, Lcom/android/dx/util/Hex;->u2(I)Ljava/lang/String;

    .line 5
    .line 6
    .line 7
    move-result-object p0

    .line 8
    return-object p0

    .line 9
    :cond_0
    invoke-static {p0}, Lcom/android/dx/util/Hex;->u4(I)Ljava/lang/String;

    .line 10
    .line 11
    .line 12
    move-result-object p0

    .line 13
    return-object p0
.end method

.method public static u3(I)Ljava/lang/String;
    .locals 6

    .line 1
    const/4 v0, 0x6

    .line 2
    new-array v1, v0, [C

    .line 3
    .line 4
    const/4 v2, 0x0

    .line 5
    :goto_0
    if-ge v2, v0, :cond_0

    .line 6
    .line 7
    rsub-int/lit8 v3, v2, 0x5

    .line 8
    .line 9
    and-int/lit8 v4, p0, 0xf

    .line 10
    .line 11
    const/16 v5, 0x10

    .line 12
    .line 13
    invoke-static {v4, v5}, Ljava/lang/Character;->forDigit(II)C

    .line 14
    .line 15
    .line 16
    move-result v4

    .line 17
    aput-char v4, v1, v3

    .line 18
    .line 19
    shr-int/lit8 p0, p0, 0x4

    .line 20
    .line 21
    add-int/lit8 v2, v2, 0x1

    .line 22
    .line 23
    goto :goto_0

    .line 24
    :cond_0
    new-instance p0, Ljava/lang/String;

    .line 25
    .line 26
    invoke-direct {p0, v1}, Ljava/lang/String;-><init>([C)V

    .line 27
    .line 28
    .line 29
    return-object p0
.end method

.method public static u4(I)Ljava/lang/String;
    .locals 6

    .line 1
    const/16 v0, 0x8

    .line 2
    .line 3
    new-array v1, v0, [C

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    :goto_0
    if-ge v2, v0, :cond_0

    .line 7
    .line 8
    rsub-int/lit8 v3, v2, 0x7

    .line 9
    .line 10
    and-int/lit8 v4, p0, 0xf

    .line 11
    .line 12
    const/16 v5, 0x10

    .line 13
    .line 14
    invoke-static {v4, v5}, Ljava/lang/Character;->forDigit(II)C

    .line 15
    .line 16
    .line 17
    move-result v4

    .line 18
    aput-char v4, v1, v3

    .line 19
    .line 20
    shr-int/lit8 p0, p0, 0x4

    .line 21
    .line 22
    add-int/lit8 v2, v2, 0x1

    .line 23
    .line 24
    goto :goto_0

    .line 25
    :cond_0
    new-instance p0, Ljava/lang/String;

    .line 26
    .line 27
    invoke-direct {p0, v1}, Ljava/lang/String;-><init>([C)V

    .line 28
    .line 29
    .line 30
    return-object p0
.end method

.method public static u8(J)Ljava/lang/String;
    .locals 5

    .line 1
    const/16 v0, 0x10

    .line 2
    .line 3
    new-array v1, v0, [C

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    :goto_0
    if-ge v2, v0, :cond_0

    .line 7
    .line 8
    rsub-int/lit8 v3, v2, 0xf

    .line 9
    .line 10
    long-to-int v4, p0

    .line 11
    and-int/lit8 v4, v4, 0xf

    .line 12
    .line 13
    invoke-static {v4, v0}, Ljava/lang/Character;->forDigit(II)C

    .line 14
    .line 15
    .line 16
    move-result v4

    .line 17
    aput-char v4, v1, v3

    .line 18
    .line 19
    const/4 v3, 0x4

    .line 20
    shr-long/2addr p0, v3

    .line 21
    add-int/lit8 v2, v2, 0x1

    .line 22
    .line 23
    goto :goto_0

    .line 24
    :cond_0
    new-instance p0, Ljava/lang/String;

    .line 25
    .line 26
    invoke-direct {p0, v1}, Ljava/lang/String;-><init>([C)V

    .line 27
    .line 28
    .line 29
    return-object p0
.end method

.method public static uNibble(I)Ljava/lang/String;
    .locals 2

    .line 1
    and-int/lit8 p0, p0, 0xf

    .line 2
    .line 3
    const/16 v0, 0x10

    .line 4
    .line 5
    invoke-static {p0, v0}, Ljava/lang/Character;->forDigit(II)C

    .line 6
    .line 7
    .line 8
    move-result p0

    .line 9
    const/4 v0, 0x1

    .line 10
    new-array v0, v0, [C

    .line 11
    .line 12
    const/4 v1, 0x0

    .line 13
    aput-char p0, v0, v1

    .line 14
    .line 15
    new-instance p0, Ljava/lang/String;

    .line 16
    .line 17
    invoke-direct {p0, v0}, Ljava/lang/String;-><init>([C)V

    .line 18
    .line 19
    .line 20
    return-object p0
.end method
