.class public final Lorg/apache/commons/compress/compressors/deflate64/飘花落叶言子楪世哲兰苏;
.super Lkotlin/reflect/jvm/internal/types/飘花落叶言子楪世兰苏哲;
.source "r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776"


# instance fields
.field public 飘花落叶言子楪世兰哲苏:J

.field public final 飘花落叶言子楪世兰苏哲:J

.field public final synthetic 飘花落叶言子楪苏世哲兰:Lorg/apache/commons/compress/compressors/deflate64/飘花落叶言子楪世兰苏哲;


# direct methods
.method public constructor <init>(Lorg/apache/commons/compress/compressors/deflate64/飘花落叶言子楪世兰苏哲;J)V
    .locals 1

    .line 1
    const/16 v0, 0x8

    .line 2
    .line 3
    invoke-direct {p0, v0}, Lkotlin/reflect/jvm/internal/types/飘花落叶言子楪世兰苏哲;-><init>(I)V

    .line 4
    .line 5
    .line 6
    iput-object p1, p0, Lorg/apache/commons/compress/compressors/deflate64/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪苏世哲兰:Lorg/apache/commons/compress/compressors/deflate64/飘花落叶言子楪世兰苏哲;

    .line 7
    .line 8
    iput-wide p2, p0, Lorg/apache/commons/compress/compressors/deflate64/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪世兰苏哲:J

    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public final 飘花落叶言子世哲兰苏楪()Lorg/apache/commons/compress/compressors/deflate64/HuffmanState;
    .locals 4

    .line 1
    iget-wide v0, p0, Lorg/apache/commons/compress/compressors/deflate64/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪世兰哲苏:J

    .line 2
    .line 3
    iget-wide v2, p0, Lorg/apache/commons/compress/compressors/deflate64/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪世兰苏哲:J

    .line 4
    .line 5
    cmp-long p0, v0, v2

    .line 6
    .line 7
    if-gez p0, :cond_0

    .line 8
    .line 9
    sget-object p0, Lorg/apache/commons/compress/compressors/deflate64/HuffmanState;->STORED:Lorg/apache/commons/compress/compressors/deflate64/HuffmanState;

    .line 10
    .line 11
    return-object p0

    .line 12
    :cond_0
    sget-object p0, Lorg/apache/commons/compress/compressors/deflate64/HuffmanState;->INITIAL:Lorg/apache/commons/compress/compressors/deflate64/HuffmanState;

    .line 13
    .line 14
    return-object p0
.end method

.method public final 飘花落叶言子世哲楪兰苏([BII)I
    .locals 11

    .line 1
    iget-object v0, p0, Lorg/apache/commons/compress/compressors/deflate64/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪苏世哲兰:Lorg/apache/commons/compress/compressors/deflate64/飘花落叶言子楪世兰苏哲;

    .line 2
    .line 3
    iget-object v1, v0, Lorg/apache/commons/compress/compressors/deflate64/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪兰世哲苏:Landroidx/appcompat/widget/飘花落叶言子楪世苏哲兰;

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    if-nez p3, :cond_0

    .line 7
    .line 8
    return v2

    .line 9
    :cond_0
    iget-wide v3, p0, Lorg/apache/commons/compress/compressors/deflate64/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪世兰苏哲:J

    .line 10
    .line 11
    iget-wide v5, p0, Lorg/apache/commons/compress/compressors/deflate64/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪世兰哲苏:J

    .line 12
    .line 13
    sub-long/2addr v3, v5

    .line 14
    int-to-long v5, p3

    .line 15
    invoke-static {v3, v4, v5, v6}, Ljava/lang/Math;->min(JJ)J

    .line 16
    .line 17
    .line 18
    move-result-wide v3

    .line 19
    long-to-int p3, v3

    .line 20
    :goto_0
    if-ge v2, p3, :cond_6

    .line 21
    .line 22
    iget-object v3, v0, Lorg/apache/commons/compress/compressors/deflate64/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪哲兰苏世:L飘花落叶言苏子楪兰世哲/飘花落叶言子楪世苏哲兰;

    .line 23
    .line 24
    iget v4, v3, L飘花落叶言苏子楪兰世哲/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪兰世苏哲:I

    .line 25
    .line 26
    const v5, 0xffff

    .line 27
    .line 28
    .line 29
    const/4 v6, 0x1

    .line 30
    if-lez v4, :cond_2

    .line 31
    .line 32
    const/16 v4, 0x8

    .line 33
    .line 34
    invoke-static {v3, v4}, Lorg/apache/commons/compress/compressors/deflate64/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪苏世哲兰(L飘花落叶言苏子楪兰世哲/飘花落叶言子楪世苏哲兰;I)J

    .line 35
    .line 36
    .line 37
    move-result-wide v3

    .line 38
    long-to-int v3, v3

    .line 39
    int-to-byte v3, v3

    .line 40
    add-int v4, p2, v2

    .line 41
    .line 42
    iget-object v7, v1, Landroidx/appcompat/widget/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世哲苏兰:Ljava/lang/Object;

    .line 43
    .line 44
    check-cast v7, [B

    .line 45
    .line 46
    iget v8, v1, Landroidx/appcompat/widget/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世苏哲兰:I

    .line 47
    .line 48
    aput-byte v3, v7, v8

    .line 49
    .line 50
    add-int/lit8 v7, v8, 0x1

    .line 51
    .line 52
    and-int/2addr v5, v7

    .line 53
    iget-boolean v7, v1, Landroidx/appcompat/widget/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世苏兰哲:Z

    .line 54
    .line 55
    if-nez v7, :cond_1

    .line 56
    .line 57
    if-ge v5, v8, :cond_1

    .line 58
    .line 59
    iput-boolean v6, v1, Landroidx/appcompat/widget/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世苏兰哲:Z

    .line 60
    .line 61
    :cond_1
    iput v5, v1, Landroidx/appcompat/widget/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世苏哲兰:I

    .line 62
    .line 63
    aput-byte v3, p1, v4

    .line 64
    .line 65
    goto :goto_2

    .line 66
    :cond_2
    iget-object v3, v0, Lorg/apache/commons/compress/compressors/deflate64/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪兰世苏哲:Ljava/io/InputStream;

    .line 67
    .line 68
    add-int v4, p2, v2

    .line 69
    .line 70
    sub-int v7, p3, v2

    .line 71
    .line 72
    invoke-virtual {v3, p1, v4, v7}, Ljava/io/InputStream;->read([BII)I

    .line 73
    .line 74
    .line 75
    move-result v3

    .line 76
    const/4 v7, -0x1

    .line 77
    if-eq v3, v7, :cond_5

    .line 78
    .line 79
    move v7, v4

    .line 80
    :goto_1
    add-int v8, v4, v3

    .line 81
    .line 82
    if-ge v7, v8, :cond_4

    .line 83
    .line 84
    aget-byte v8, p1, v7

    .line 85
    .line 86
    iget-object v9, v1, Landroidx/appcompat/widget/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世哲苏兰:Ljava/lang/Object;

    .line 87
    .line 88
    check-cast v9, [B

    .line 89
    .line 90
    iget v10, v1, Landroidx/appcompat/widget/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世苏哲兰:I

    .line 91
    .line 92
    aput-byte v8, v9, v10

    .line 93
    .line 94
    add-int/lit8 v8, v10, 0x1

    .line 95
    .line 96
    and-int/2addr v8, v5

    .line 97
    iget-boolean v9, v1, Landroidx/appcompat/widget/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世苏兰哲:Z

    .line 98
    .line 99
    if-nez v9, :cond_3

    .line 100
    .line 101
    if-ge v8, v10, :cond_3

    .line 102
    .line 103
    iput-boolean v6, v1, Landroidx/appcompat/widget/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世苏兰哲:Z

    .line 104
    .line 105
    :cond_3
    iput v8, v1, Landroidx/appcompat/widget/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世苏哲兰:I

    .line 106
    .line 107
    add-int/lit8 v7, v7, 0x1

    .line 108
    .line 109
    goto :goto_1

    .line 110
    :cond_4
    move v6, v3

    .line 111
    :goto_2
    iget-wide v3, p0, Lorg/apache/commons/compress/compressors/deflate64/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪世兰哲苏:J

    .line 112
    .line 113
    int-to-long v7, v6

    .line 114
    add-long/2addr v3, v7

    .line 115
    iput-wide v3, p0, Lorg/apache/commons/compress/compressors/deflate64/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪世兰哲苏:J

    .line 116
    .line 117
    add-int/2addr v2, v6

    .line 118
    goto :goto_0

    .line 119
    :cond_5
    new-instance p0, Ljava/io/EOFException;

    .line 120
    .line 121
    const-string p1, "Truncated Deflate64 Stream"

    .line 122
    .line 123
    invoke-direct {p0, p1}, Ljava/io/EOFException;-><init>(Ljava/lang/String;)V

    .line 124
    .line 125
    .line 126
    throw p0

    .line 127
    :cond_6
    return p3
.end method

.method public final 飘花落叶言子世楪哲苏兰()Z
    .locals 4

    .line 1
    iget-wide v0, p0, Lorg/apache/commons/compress/compressors/deflate64/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪世兰哲苏:J

    .line 2
    .line 3
    iget-wide v2, p0, Lorg/apache/commons/compress/compressors/deflate64/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪世兰苏哲:J

    .line 4
    .line 5
    cmp-long p0, v0, v2

    .line 6
    .line 7
    if-gez p0, :cond_0

    .line 8
    .line 9
    const/4 p0, 0x1

    .line 10
    return p0

    .line 11
    :cond_0
    const/4 p0, 0x0

    .line 12
    return p0
.end method

.method public final 飘花落叶言子楪苏世哲兰()I
    .locals 8

    .line 1
    iget-wide v0, p0, Lorg/apache/commons/compress/compressors/deflate64/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪世兰苏哲:J

    .line 2
    .line 3
    iget-wide v2, p0, Lorg/apache/commons/compress/compressors/deflate64/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪世兰哲苏:J

    .line 4
    .line 5
    sub-long/2addr v0, v2

    .line 6
    iget-object p0, p0, Lorg/apache/commons/compress/compressors/deflate64/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪苏世哲兰:Lorg/apache/commons/compress/compressors/deflate64/飘花落叶言子楪世兰苏哲;

    .line 7
    .line 8
    iget-object p0, p0, Lorg/apache/commons/compress/compressors/deflate64/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪哲兰苏世:L飘花落叶言苏子楪兰世哲/飘花落叶言子楪世苏哲兰;

    .line 9
    .line 10
    iget v2, p0, L飘花落叶言苏子楪兰世哲/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪兰世苏哲:I

    .line 11
    .line 12
    int-to-long v2, v2

    .line 13
    iget-object p0, p0, L飘花落叶言苏子楪兰世哲/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪哲苏兰世:L飘花落叶言苏子世兰哲楪/飘花落叶言子楪世苏兰哲;

    .line 14
    .line 15
    invoke-virtual {p0}, L飘花落叶言苏子世兰哲楪/飘花落叶言子楪世苏兰哲;->available()I

    .line 16
    .line 17
    .line 18
    move-result p0

    .line 19
    int-to-long v4, p0

    .line 20
    const-wide/16 v6, 0x8

    .line 21
    .line 22
    mul-long/2addr v4, v6

    .line 23
    add-long/2addr v4, v2

    .line 24
    div-long/2addr v4, v6

    .line 25
    invoke-static {v0, v1, v4, v5}, Ljava/lang/Math;->min(JJ)J

    .line 26
    .line 27
    .line 28
    move-result-wide v0

    .line 29
    long-to-int p0, v0

    .line 30
    return p0
.end method
