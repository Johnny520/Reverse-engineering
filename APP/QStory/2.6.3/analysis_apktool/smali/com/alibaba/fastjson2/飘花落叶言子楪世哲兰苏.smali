.class public interface abstract Lcom/alibaba/fastjson2/飘花落叶言子楪世哲兰苏;
.super Ljava/lang/Object;
.source "r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4"


# direct methods
.method public static 飘花落叶言子楪世兰哲苏([BI[B)I
    .locals 3

    .line 1
    array-length v0, p2

    .line 2
    const/16 v1, 0x2f

    .line 3
    .line 4
    if-gt v0, v1, :cond_0

    .line 5
    .line 6
    add-int/lit8 v1, p1, 0x1

    .line 7
    .line 8
    add-int/lit8 v2, v0, 0x49

    .line 9
    .line 10
    int-to-byte v2, v2

    .line 11
    aput-byte v2, p0, p1

    .line 12
    .line 13
    goto :goto_1

    .line 14
    :cond_0
    const/16 v1, 0x7ff

    .line 15
    .line 16
    if-gt v0, v1, :cond_1

    .line 17
    .line 18
    const/16 v1, 0x79

    .line 19
    .line 20
    aput-byte v1, p0, p1

    .line 21
    .line 22
    add-int/lit8 v1, p1, 0x1

    .line 23
    .line 24
    add-int/lit16 v2, v0, 0x3800

    .line 25
    .line 26
    int-to-short v2, v2

    .line 27
    invoke-static {p0, v1, v2}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰世哲苏;->飘花落叶言子苏哲楪世兰([BIS)V

    .line 28
    .line 29
    .line 30
    add-int/lit8 v1, p1, 0x3

    .line 31
    .line 32
    goto :goto_1

    .line 33
    :cond_1
    const v1, 0x3ffff

    .line 34
    .line 35
    .line 36
    if-gt v0, v1, :cond_2

    .line 37
    .line 38
    const/high16 v1, 0x79440000

    .line 39
    .line 40
    add-int/2addr v1, v0

    .line 41
    invoke-static {p1, p0, v1}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰世哲苏;->飘花落叶言子苏楪世兰哲(I[BI)V

    .line 42
    .line 43
    .line 44
    add-int/lit8 p1, p1, 0x4

    .line 45
    .line 46
    :goto_0
    move v1, p1

    .line 47
    goto :goto_1

    .line 48
    :cond_2
    const/16 v1, 0x7948

    .line 49
    .line 50
    invoke-static {p0, p1, v1}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰世哲苏;->飘花落叶言子苏哲楪世兰([BIS)V

    .line 51
    .line 52
    .line 53
    add-int/lit8 v1, p1, 0x2

    .line 54
    .line 55
    invoke-static {v1, p0, v0}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰世哲苏;->飘花落叶言子苏楪世兰哲(I[BI)V

    .line 56
    .line 57
    .line 58
    add-int/lit8 p1, p1, 0x6

    .line 59
    .line 60
    goto :goto_0

    .line 61
    :goto_1
    const/4 p1, 0x0

    .line 62
    array-length v2, p2

    .line 63
    invoke-static {p2, p1, p0, v1, v2}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 64
    .line 65
    .line 66
    add-int/2addr v1, v0

    .line 67
    return v1
.end method

.method public static 飘花落叶言子楪世兰苏哲(I[BI)I
    .locals 3

    .line 1
    const/16 v0, 0xf

    .line 2
    .line 3
    if-gt p2, v0, :cond_0

    .line 4
    .line 5
    const/4 v0, 0x1

    .line 6
    goto :goto_0

    .line 7
    :cond_0
    const/4 v0, 0x0

    .line 8
    :goto_0
    add-int/lit8 v1, p0, 0x1

    .line 9
    .line 10
    if-eqz v0, :cond_1

    .line 11
    .line 12
    add-int/lit8 v2, p2, -0x6c

    .line 13
    .line 14
    int-to-byte v2, v2

    .line 15
    goto :goto_1

    .line 16
    :cond_1
    const/16 v2, -0x5c

    .line 17
    .line 18
    :goto_1
    aput-byte v2, p1, p0

    .line 19
    .line 20
    if-nez v0, :cond_2

    .line 21
    .line 22
    invoke-static {v1, p1, p2}, Lcom/alibaba/fastjson2/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪世苏兰哲(I[BI)I

    .line 23
    .line 24
    .line 25
    move-result p0

    .line 26
    return p0

    .line 27
    :cond_2
    return v1
.end method

.method public static 飘花落叶言子楪世哲兰苏([BIF)I
    .locals 3

    .line 1
    float-to-int v0, p2

    .line 2
    int-to-float v1, v0

    .line 3
    cmpl-float v1, v1, p2

    .line 4
    .line 5
    if-nez v1, :cond_0

    .line 6
    .line 7
    const/high16 v1, 0x40000

    .line 8
    .line 9
    add-int/2addr v1, v0

    .line 10
    const/high16 v2, -0x80000

    .line 11
    .line 12
    and-int/2addr v1, v2

    .line 13
    if-nez v1, :cond_0

    .line 14
    .line 15
    const/16 p2, -0x4a

    .line 16
    .line 17
    aput-byte p2, p0, p1

    .line 18
    .line 19
    add-int/lit8 p1, p1, 0x1

    .line 20
    .line 21
    invoke-static {p1, p0, v0}, Lcom/alibaba/fastjson2/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪世苏兰哲(I[BI)I

    .line 22
    .line 23
    .line 24
    move-result p0

    .line 25
    return p0

    .line 26
    :cond_0
    const/16 v0, -0x49

    .line 27
    .line 28
    aput-byte v0, p0, p1

    .line 29
    .line 30
    add-int/lit8 v0, p1, 0x1

    .line 31
    .line 32
    invoke-static {p2}, Ljava/lang/Float;->floatToIntBits(F)I

    .line 33
    .line 34
    .line 35
    move-result p2

    .line 36
    invoke-static {v0, p0, p2}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰世哲苏;->飘花落叶言子苏楪世兰哲(I[BI)V

    .line 37
    .line 38
    .line 39
    add-int/lit8 p1, p1, 0x5

    .line 40
    .line 41
    return p1
.end method

.method public static 飘花落叶言子楪世哲苏兰([BID)I
    .locals 4

    .line 1
    const-wide/16 v0, 0x0

    .line 2
    .line 3
    cmpl-double v0, p2, v0

    .line 4
    .line 5
    if-eqz v0, :cond_2

    .line 6
    .line 7
    const-wide/high16 v1, 0x3ff0000000000000L    # 1.0

    .line 8
    .line 9
    cmpl-double v1, p2, v1

    .line 10
    .line 11
    if-nez v1, :cond_0

    .line 12
    .line 13
    goto :goto_0

    .line 14
    :cond_0
    const-wide/high16 v0, -0x3e20000000000000L    # -2.147483648E9

    .line 15
    .line 16
    cmpl-double v0, p2, v0

    .line 17
    .line 18
    if-ltz v0, :cond_1

    .line 19
    .line 20
    const-wide v0, 0x41dfffffffc00000L    # 2.147483647E9

    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    cmpg-double v0, p2, v0

    .line 26
    .line 27
    if-gtz v0, :cond_1

    .line 28
    .line 29
    double-to-long v0, p2

    .line 30
    long-to-double v2, v0

    .line 31
    cmpl-double v2, v2, p2

    .line 32
    .line 33
    if-nez v2, :cond_1

    .line 34
    .line 35
    const/16 p2, -0x4c

    .line 36
    .line 37
    aput-byte p2, p0, p1

    .line 38
    .line 39
    add-int/lit8 p1, p1, 0x1

    .line 40
    .line 41
    invoke-static {v0, v1, p0, p1}, Lcom/alibaba/fastjson2/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪世苏哲兰(J[BI)I

    .line 42
    .line 43
    .line 44
    move-result p0

    .line 45
    return p0

    .line 46
    :cond_1
    const/16 v0, -0x4b

    .line 47
    .line 48
    aput-byte v0, p0, p1

    .line 49
    .line 50
    add-int/lit8 v0, p1, 0x1

    .line 51
    .line 52
    invoke-static {p2, p3}, Ljava/lang/Double;->doubleToLongBits(D)J

    .line 53
    .line 54
    .line 55
    move-result-wide p2

    .line 56
    invoke-static {p2, p3, p0, v0}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰世哲苏;->飘花落叶言子苏世楪哲兰(J[BI)V

    .line 57
    .line 58
    .line 59
    add-int/lit8 p1, p1, 0x9

    .line 60
    .line 61
    return p1

    .line 62
    :cond_2
    :goto_0
    if-nez v0, :cond_3

    .line 63
    .line 64
    const/16 p2, -0x4e

    .line 65
    .line 66
    goto :goto_1

    .line 67
    :cond_3
    const/16 p2, -0x4d

    .line 68
    .line 69
    :goto_1
    aput-byte p2, p0, p1

    .line 70
    .line 71
    add-int/lit8 p1, p1, 0x1

    .line 72
    .line 73
    return p1
.end method

.method public static 飘花落叶言子楪世苏兰哲(I[BI)I
    .locals 2

    .line 1
    add-int/lit8 v0, p2, 0x10

    .line 2
    .line 3
    and-int/lit8 v0, v0, -0x40

    .line 4
    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    add-int/lit8 v0, p0, 0x1

    .line 8
    .line 9
    int-to-byte p2, p2

    .line 10
    aput-byte p2, p1, p0

    .line 11
    .line 12
    return v0

    .line 13
    :cond_0
    add-int/lit16 v0, p2, 0x800

    .line 14
    .line 15
    and-int/lit16 v0, v0, -0x1000

    .line 16
    .line 17
    if-nez v0, :cond_1

    .line 18
    .line 19
    add-int/lit16 p2, p2, 0x3800

    .line 20
    .line 21
    int-to-short p2, p2

    .line 22
    invoke-static {p1, p0, p2}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰世哲苏;->飘花落叶言子苏哲楪世兰([BIS)V

    .line 23
    .line 24
    .line 25
    add-int/lit8 p0, p0, 0x2

    .line 26
    .line 27
    return p0

    .line 28
    :cond_1
    const/high16 v0, 0x40000

    .line 29
    .line 30
    add-int/2addr v0, p2

    .line 31
    const/high16 v1, -0x80000

    .line 32
    .line 33
    and-int/2addr v0, v1

    .line 34
    if-nez v0, :cond_2

    .line 35
    .line 36
    shr-int/lit8 v0, p2, 0x10

    .line 37
    .line 38
    add-int/lit8 v0, v0, 0x44

    .line 39
    .line 40
    int-to-byte v0, v0

    .line 41
    aput-byte v0, p1, p0

    .line 42
    .line 43
    add-int/lit8 v0, p0, 0x1

    .line 44
    .line 45
    int-to-short p2, p2

    .line 46
    invoke-static {p1, v0, p2}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰世哲苏;->飘花落叶言子苏哲楪世兰([BIS)V

    .line 47
    .line 48
    .line 49
    add-int/lit8 p0, p0, 0x3

    .line 50
    .line 51
    return p0

    .line 52
    :cond_2
    const/16 v0, 0x48

    .line 53
    .line 54
    aput-byte v0, p1, p0

    .line 55
    .line 56
    add-int/lit8 v0, p0, 0x1

    .line 57
    .line 58
    invoke-static {v0, p1, p2}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰世哲苏;->飘花落叶言子苏楪世兰哲(I[BI)V

    .line 59
    .line 60
    .line 61
    add-int/lit8 p0, p0, 0x5

    .line 62
    .line 63
    return p0
.end method

.method public static 飘花落叶言子楪世苏哲兰(J[BI)I
    .locals 6

    .line 1
    const-wide/16 v0, -0x8

    .line 2
    .line 3
    cmp-long v0, p0, v0

    .line 4
    .line 5
    if-ltz v0, :cond_0

    .line 6
    .line 7
    const-wide/16 v0, 0xf

    .line 8
    .line 9
    cmp-long v0, p0, v0

    .line 10
    .line 11
    if-gtz v0, :cond_0

    .line 12
    .line 13
    add-int/lit8 v0, p3, 0x1

    .line 14
    .line 15
    const-wide/16 v1, 0x20

    .line 16
    .line 17
    sub-long/2addr p0, v1

    .line 18
    long-to-int p0, p0

    .line 19
    int-to-byte p0, p0

    .line 20
    aput-byte p0, p2, p3

    .line 21
    .line 22
    return v0

    .line 23
    :cond_0
    const-wide/16 v0, 0x800

    .line 24
    .line 25
    add-long/2addr v0, p0

    .line 26
    const-wide/16 v2, -0x1000

    .line 27
    .line 28
    and-long/2addr v0, v2

    .line 29
    const-wide/16 v2, 0x0

    .line 30
    .line 31
    cmp-long v0, v0, v2

    .line 32
    .line 33
    if-nez v0, :cond_1

    .line 34
    .line 35
    const-wide/16 v0, -0x3000

    .line 36
    .line 37
    add-long/2addr p0, v0

    .line 38
    long-to-int p0, p0

    .line 39
    int-to-short p0, p0

    .line 40
    invoke-static {p2, p3, p0}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰世哲苏;->飘花落叶言子苏哲楪世兰([BIS)V

    .line 41
    .line 42
    .line 43
    add-int/lit8 p3, p3, 0x2

    .line 44
    .line 45
    return p3

    .line 46
    :cond_1
    const-wide/32 v0, 0x40000

    .line 47
    .line 48
    .line 49
    add-long/2addr v0, p0

    .line 50
    const-wide/32 v4, -0x80000

    .line 51
    .line 52
    .line 53
    and-long/2addr v0, v4

    .line 54
    cmp-long v0, v0, v2

    .line 55
    .line 56
    if-nez v0, :cond_2

    .line 57
    .line 58
    const/16 v0, 0x10

    .line 59
    .line 60
    shr-long v0, p0, v0

    .line 61
    .line 62
    const-wide/16 v2, -0x3c

    .line 63
    .line 64
    add-long/2addr v0, v2

    .line 65
    long-to-int v0, v0

    .line 66
    int-to-byte v0, v0

    .line 67
    aput-byte v0, p2, p3

    .line 68
    .line 69
    add-int/lit8 v0, p3, 0x1

    .line 70
    .line 71
    long-to-int p0, p0

    .line 72
    int-to-short p0, p0

    .line 73
    invoke-static {p2, v0, p0}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰世哲苏;->飘花落叶言子苏哲楪世兰([BIS)V

    .line 74
    .line 75
    .line 76
    add-int/lit8 p3, p3, 0x3

    .line 77
    .line 78
    return p3

    .line 79
    :cond_2
    const-wide v0, 0x80000000L

    .line 80
    .line 81
    .line 82
    .line 83
    .line 84
    add-long/2addr v0, p0

    .line 85
    const-wide v4, -0x100000000L

    .line 86
    .line 87
    .line 88
    .line 89
    .line 90
    and-long/2addr v0, v4

    .line 91
    cmp-long v0, v0, v2

    .line 92
    .line 93
    if-nez v0, :cond_3

    .line 94
    .line 95
    const/16 v0, -0x41

    .line 96
    .line 97
    aput-byte v0, p2, p3

    .line 98
    .line 99
    add-int/lit8 v0, p3, 0x1

    .line 100
    .line 101
    long-to-int p0, p0

    .line 102
    invoke-static {v0, p2, p0}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰世哲苏;->飘花落叶言子苏楪世兰哲(I[BI)V

    .line 103
    .line 104
    .line 105
    add-int/lit8 p3, p3, 0x5

    .line 106
    .line 107
    return p3

    .line 108
    :cond_3
    const/16 v0, -0x42

    .line 109
    .line 110
    aput-byte v0, p2, p3

    .line 111
    .line 112
    add-int/lit8 v0, p3, 0x1

    .line 113
    .line 114
    invoke-static {p0, p1, p2, v0}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰世哲苏;->飘花落叶言子苏世楪哲兰(J[BI)V

    .line 115
    .line 116
    .line 117
    add-int/lit8 p3, p3, 0x9

    .line 118
    .line 119
    return p3
.end method
