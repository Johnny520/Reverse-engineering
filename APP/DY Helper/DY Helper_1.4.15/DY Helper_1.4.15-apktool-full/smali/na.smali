.class public abstract Lna;
.super Ljava/lang/Object;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"


# static fields
.field public static final α:[[Ljava/lang/String;

.field public static final β:[[Ljava/lang/String;

.field public static final γ:[F

.field public static final δ:[F


# direct methods
.method static constructor <clinit>()V
    .locals 11

    .line 1
    const/16 v0, 0x8

    .line 2
    .line 3
    new-array v1, v0, [[Ljava/lang/String;

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    move v3, v2

    .line 7
    :goto_0
    const-string v4, "LMGauss"

    .line 8
    .line 9
    const/4 v5, 0x5

    .line 10
    const/4 v6, 0x1

    .line 11
    if-ge v3, v0, :cond_1

    .line 12
    .line 13
    new-array v7, v5, [Ljava/lang/String;

    .line 14
    .line 15
    move v8, v2

    .line 16
    :goto_1
    if-ge v8, v5, :cond_0

    .line 17
    .line 18
    shl-int v9, v6, v8

    .line 19
    .line 20
    const-string v10, "_H_d"

    .line 21
    .line 22
    invoke-static {v3, v9, v4, v10}, Lnx;->δ(IILjava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 23
    .line 24
    .line 25
    move-result-object v9

    .line 26
    aput-object v9, v7, v8

    .line 27
    .line 28
    add-int/lit8 v8, v8, 0x1

    .line 29
    .line 30
    goto :goto_1

    .line 31
    :cond_0
    aput-object v7, v1, v3

    .line 32
    .line 33
    add-int/lit8 v3, v3, 0x1

    .line 34
    .line 35
    goto :goto_0

    .line 36
    :cond_1
    sput-object v1, Lna;->α:[[Ljava/lang/String;

    .line 37
    .line 38
    new-array v1, v0, [[Ljava/lang/String;

    .line 39
    .line 40
    move v3, v2

    .line 41
    :goto_2
    if-ge v3, v0, :cond_3

    .line 42
    .line 43
    new-array v7, v5, [Ljava/lang/String;

    .line 44
    .line 45
    move v8, v2

    .line 46
    :goto_3
    if-ge v8, v5, :cond_2

    .line 47
    .line 48
    shl-int v9, v6, v8

    .line 49
    .line 50
    const-string v10, "_V_d"

    .line 51
    .line 52
    invoke-static {v3, v9, v4, v10}, Lnx;->δ(IILjava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 53
    .line 54
    .line 55
    move-result-object v9

    .line 56
    aput-object v9, v7, v8

    .line 57
    .line 58
    add-int/lit8 v8, v8, 0x1

    .line 59
    .line 60
    goto :goto_3

    .line 61
    :cond_2
    aput-object v7, v1, v3

    .line 62
    .line 63
    add-int/lit8 v3, v3, 0x1

    .line 64
    .line 65
    goto :goto_2

    .line 66
    :cond_3
    sput-object v1, Lna;->β:[[Ljava/lang/String;

    .line 67
    .line 68
    new-array v0, v5, [F

    .line 69
    .line 70
    fill-array-data v0, :array_0

    .line 71
    .line 72
    .line 73
    sput-object v0, Lna;->γ:[F

    .line 74
    .line 75
    const/4 v0, 0x4

    .line 76
    new-array v0, v0, [F

    .line 77
    .line 78
    fill-array-data v0, :array_1

    .line 79
    .line 80
    .line 81
    sput-object v0, Lna;->δ:[F

    .line 82
    .line 83
    return-void

    .line 84
    nop

    .line 85
    :array_0
    .array-data 4
        0x0
        0x4041b22d    # 3.0265f
        0x40f20000    # 7.5625f
        0x41100000    # 9.0f
        0x434ab22d    # 202.696f
    .end array-data

    .line 86
    .line 87
    .line 88
    .line 89
    .line 90
    .line 91
    .line 92
    .line 93
    .line 94
    .line 95
    .line 96
    .line 97
    .line 98
    .line 99
    :array_1
    .array-data 4
        0x40632d6e
        0x41180000    # 9.5f
        0x41a00000    # 20.0f
        0x4230689a
    .end array-data
.end method

.method public static final α(F[D[F[F)I
    .locals 13

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    invoke-virtual/range {p3 .. p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    const/high16 v0, 0x3e800000    # 0.25f

    .line 11
    .line 12
    cmpg-float v0, p0, v0

    .line 13
    .line 14
    const/4 v1, 0x0

    .line 15
    if-gtz v0, :cond_0

    .line 16
    .line 17
    return v1

    .line 18
    :cond_0
    float-to-double v2, p0

    .line 19
    move p0, v1

    .line 20
    :goto_0
    const/16 v0, 0xe

    .line 21
    .line 22
    if-ge p0, v0, :cond_1

    .line 23
    .line 24
    int-to-double v4, p0

    .line 25
    const-wide/high16 v6, -0x4020000000000000L    # -0.5

    .line 26
    .line 27
    mul-double/2addr v6, v4

    .line 28
    mul-double/2addr v6, v4

    .line 29
    div-double/2addr v6, v2

    .line 30
    invoke-static {v6, v7}, Ljava/lang/Math;->exp(D)D

    .line 31
    .line 32
    .line 33
    move-result-wide v4

    .line 34
    aput-wide v4, p1, p0

    .line 35
    .line 36
    add-int/lit8 p0, p0, 0x1

    .line 37
    .line 38
    goto :goto_0

    .line 39
    :cond_1
    aget-wide v2, p1, v1

    .line 40
    .line 41
    const/4 p0, 0x1

    .line 42
    move v4, p0

    .line 43
    :goto_1
    if-ge v4, v0, :cond_2

    .line 44
    .line 45
    aget-wide v5, p1, v4

    .line 46
    .line 47
    const-wide/high16 v7, 0x4000000000000000L    # 2.0

    .line 48
    .line 49
    mul-double/2addr v5, v7

    .line 50
    add-double/2addr v2, v5

    .line 51
    add-int/lit8 v4, v4, 0x1

    .line 52
    .line 53
    goto :goto_1

    .line 54
    :cond_2
    move v4, v1

    .line 55
    :goto_2
    if-ge v4, v0, :cond_3

    .line 56
    .line 57
    aget-wide v5, p1, v4

    .line 58
    .line 59
    div-double/2addr v5, v2

    .line 60
    aput-wide v5, p1, v4

    .line 61
    .line 62
    add-int/lit8 v4, v4, 0x1

    .line 63
    .line 64
    goto :goto_2

    .line 65
    :cond_3
    aget-wide v2, p1, v1

    .line 66
    .line 67
    const-wide/high16 v4, 0x3fe0000000000000L    # 0.5

    .line 68
    .line 69
    mul-double/2addr v2, v4

    .line 70
    aget-wide v4, p1, p0

    .line 71
    .line 72
    add-double/2addr v2, v4

    .line 73
    const-wide v6, 0x3eb0c6f7a0b5ed8dL    # 1.0E-6

    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
    cmpl-double v6, v2, v6

    .line 79
    .line 80
    if-lez v6, :cond_4

    .line 81
    .line 82
    div-double/2addr v4, v2

    .line 83
    double-to-float v2, v4

    .line 84
    aput v2, p2, v1

    .line 85
    .line 86
    move v2, p0

    .line 87
    goto :goto_3

    .line 88
    :cond_4
    move v2, v1

    .line 89
    :goto_3
    const/4 v3, 0x2

    .line 90
    :goto_4
    if-ge v3, v0, :cond_6

    .line 91
    .line 92
    const/4 v4, 0x7

    .line 93
    if-ge v2, v4, :cond_6

    .line 94
    .line 95
    aget-wide v4, p1, v3

    .line 96
    .line 97
    add-int/lit8 v6, v3, 0x1

    .line 98
    .line 99
    if-ge v6, v0, :cond_5

    .line 100
    .line 101
    aget-wide v7, p1, v6

    .line 102
    .line 103
    goto :goto_5

    .line 104
    :cond_5
    const-wide/16 v7, 0x0

    .line 105
    .line 106
    :goto_5
    add-double v9, v4, v7

    .line 107
    .line 108
    const-wide v11, 0x3f60624dd2f1a9fcL    # 0.002

    .line 109
    .line 110
    .line 111
    .line 112
    .line 113
    cmpg-double v11, v9, v11

    .line 114
    .line 115
    if-ltz v11, :cond_6

    .line 116
    .line 117
    int-to-double v11, v3

    .line 118
    mul-double/2addr v4, v11

    .line 119
    int-to-double v11, v6

    .line 120
    mul-double/2addr v7, v11

    .line 121
    add-double/2addr v7, v4

    .line 122
    div-double/2addr v7, v9

    .line 123
    double-to-float v4, v7

    .line 124
    aput v4, p2, v2

    .line 125
    .line 126
    double-to-float v4, v9

    .line 127
    aput v4, p3, v2

    .line 128
    .line 129
    add-int/lit8 v2, v2, 0x1

    .line 130
    .line 131
    add-int/lit8 v3, v3, 0x2

    .line 132
    .line 133
    goto :goto_4

    .line 134
    :cond_6
    const/4 p1, 0x0

    .line 135
    move v0, p1

    .line 136
    :goto_6
    if-ge p0, v2, :cond_7

    .line 137
    .line 138
    aget v3, p3, p0

    .line 139
    .line 140
    add-float/2addr v0, v3

    .line 141
    add-int/lit8 p0, p0, 0x1

    .line 142
    .line 143
    goto :goto_6

    .line 144
    :cond_7
    const/high16 p0, 0x3f000000    # 0.5f

    .line 145
    .line 146
    sub-float/2addr p0, v0

    .line 147
    cmpg-float v0, p0, p1

    .line 148
    .line 149
    if-gez v0, :cond_8

    .line 150
    .line 151
    move p0, p1

    .line 152
    :cond_8
    aput p0, p3, v1

    .line 153
    .line 154
    :goto_7
    if-ge v1, v2, :cond_b

    .line 155
    .line 156
    aget p0, p3, v1

    .line 157
    .line 158
    cmpg-float v0, p0, p1

    .line 159
    .line 160
    if-lez v0, :cond_9

    .line 161
    .line 162
    const/high16 v0, 0x3f800000    # 1.0f

    .line 163
    .line 164
    cmpl-float p0, p0, v0

    .line 165
    .line 166
    if-ltz p0, :cond_a

    .line 167
    .line 168
    :cond_9
    aput p1, p3, v1

    .line 169
    .line 170
    :cond_a
    add-int/lit8 v1, v1, 0x1

    .line 171
    .line 172
    goto :goto_7

    .line 173
    :cond_b
    return v2
.end method
