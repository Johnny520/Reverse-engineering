.class public abstract Lyyds/ᛵᛸᛸᛷ;
.super Ljava/lang/Object;
.source "r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9"


# static fields
.field public static final ᛲᲈᲁ:[B

.field public static final ᛵᛸᛸᛷ:[J


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    const-string v0, "0123456789abcdef"

    .line 2
    .line 3
    sget-object v1, Lyyds/ᛲᛵᛴᛴ;->ᛲᲈᲁ:Ljava/nio/charset/Charset;

    .line 4
    .line 5
    invoke-virtual {v0, v1}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    sput-object v0, Lyyds/ᛵᛸᛸᛷ;->ᛲᲈᲁ:[B

    .line 10
    .line 11
    const/16 v0, 0x14

    .line 12
    .line 13
    new-array v0, v0, [J

    .line 14
    .line 15
    fill-array-data v0, :array_0

    .line 16
    .line 17
    .line 18
    sput-object v0, Lyyds/ᛵᛸᛸᛷ;->ᛵᛸᛸᛷ:[J

    .line 19
    .line 20
    return-void

    .line 21
    :array_0
    .array-data 8
        -0x1
        0x9
        0x63
        0x3e7
        0x270f
        0x1869f
        0xf423f
        0x98967f
        0x5f5e0ff
        0x3b9ac9ff
        0x2540be3ffL
        0x174876e7ffL
        0xe8d4a50fffL
        0x9184e729fffL
        0x5af3107a3fffL
        0x38d7ea4c67fffL
        0x2386f26fc0ffffL
        0x16345785d89ffffL
        0xde0b6b3a763ffffL
        0x7fffffffffffffffL
    .end array-data
.end method

.method public static final ᛲᲈᲁ(JLyyds/ᛷᛲᲈᛲ;)Ljava/lang/String;
    .locals 6

    .line 1
    const-wide/16 v0, 0x0

    .line 2
    .line 3
    cmp-long v0, p0, v0

    .line 4
    .line 5
    const-wide/16 v1, 0x1

    .line 6
    .line 7
    if-lez v0, :cond_0

    .line 8
    .line 9
    sub-long v3, p0, v1

    .line 10
    .line 11
    invoke-virtual {p2, v3, v4}, Lyyds/ᛷᛲᲈᛲ;->ᲇᲇᲇᛱ(J)B

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    const/16 v5, 0xd

    .line 16
    .line 17
    if-ne v0, v5, :cond_0

    .line 18
    .line 19
    sget-object p0, Lyyds/ᛲᛵᛴᛴ;->ᛲᲈᲁ:Ljava/nio/charset/Charset;

    .line 20
    .line 21
    invoke-virtual {p2, v3, v4, p0}, Lyyds/ᛷᛲᲈᛲ;->ᛷᛸᲇᛶ(JLjava/nio/charset/Charset;)Ljava/lang/String;

    .line 22
    .line 23
    .line 24
    move-result-object p0

    .line 25
    const-wide/16 v0, 0x2

    .line 26
    .line 27
    invoke-virtual {p2, v0, v1}, Lyyds/ᛷᛲᲈᛲ;->ᛷᛶᛷᲀ(J)V

    .line 28
    .line 29
    .line 30
    return-object p0

    .line 31
    :cond_0
    sget-object v0, Lyyds/ᛲᛵᛴᛴ;->ᛲᲈᲁ:Ljava/nio/charset/Charset;

    .line 32
    .line 33
    invoke-virtual {p2, p0, p1, v0}, Lyyds/ᛷᛲᲈᛲ;->ᛷᛸᲇᛶ(JLjava/nio/charset/Charset;)Ljava/lang/String;

    .line 34
    .line 35
    .line 36
    move-result-object p0

    .line 37
    invoke-virtual {p2, v1, v2}, Lyyds/ᛷᛲᲈᛲ;->ᛷᛶᛷᲀ(J)V

    .line 38
    .line 39
    .line 40
    return-object p0
.end method

.method public static final ᛵᛸᛸᛷ(Lyyds/ᛷᛲᲈᛲ;Lyyds/ᛷᲇᛶᛷ;Z)I
    .locals 16

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-object v0, v0, Lyyds/ᛷᛲᲈᛲ;->ᲀᛲᛳᲀ:Lyyds/ᛲᲈᲈᛶ;

    .line 4
    .line 5
    const/4 v1, -0x1

    .line 6
    if-nez v0, :cond_1

    .line 7
    .line 8
    if-eqz p2, :cond_0

    .line 9
    .line 10
    goto :goto_4

    .line 11
    :cond_0
    return v1

    .line 12
    :cond_1
    iget-object v2, v0, Lyyds/ᛲᲈᲈᛶ;->ᛲᲈᲁ:[B

    .line 13
    .line 14
    iget v3, v0, Lyyds/ᛲᲈᲈᛶ;->ᛵᛸᛸᛷ:I

    .line 15
    .line 16
    iget v4, v0, Lyyds/ᛲᲈᲈᛶ;->ᲀᛲᛳᲀ:I

    .line 17
    .line 18
    move-object/from16 v5, p1

    .line 19
    .line 20
    iget-object v5, v5, Lyyds/ᛷᲇᛶᛷ;->ᲇᲈᛵᛷ:[I

    .line 21
    .line 22
    const/4 v6, 0x0

    .line 23
    move-object v8, v0

    .line 24
    move v9, v1

    .line 25
    move v7, v6

    .line 26
    :goto_0
    add-int/lit8 v10, v7, 0x1

    .line 27
    .line 28
    aget v11, v5, v7

    .line 29
    .line 30
    add-int/lit8 v7, v7, 0x2

    .line 31
    .line 32
    aget v10, v5, v10

    .line 33
    .line 34
    if-eq v10, v1, :cond_2

    .line 35
    .line 36
    move v9, v10

    .line 37
    :cond_2
    if-nez v8, :cond_3

    .line 38
    .line 39
    goto :goto_3

    .line 40
    :cond_3
    const/4 v10, 0x0

    .line 41
    if-gez v11, :cond_a

    .line 42
    .line 43
    mul-int/lit8 v11, v11, -0x1

    .line 44
    .line 45
    add-int v12, v11, v7

    .line 46
    .line 47
    :goto_1
    add-int/lit8 v11, v3, 0x1

    .line 48
    .line 49
    aget-byte v3, v2, v3

    .line 50
    .line 51
    and-int/lit16 v3, v3, 0xff

    .line 52
    .line 53
    add-int/lit8 v13, v7, 0x1

    .line 54
    .line 55
    aget v7, v5, v7

    .line 56
    .line 57
    if-eq v3, v7, :cond_4

    .line 58
    .line 59
    goto :goto_7

    .line 60
    :cond_4
    if-ne v13, v12, :cond_5

    .line 61
    .line 62
    const/4 v3, 0x1

    .line 63
    goto :goto_2

    .line 64
    :cond_5
    move v3, v6

    .line 65
    :goto_2
    if-ne v11, v4, :cond_8

    .line 66
    .line 67
    iget-object v2, v8, Lyyds/ᛲᲈᲈᛶ;->ᲇᲇᲇᛱ:Lyyds/ᛲᲈᲈᛶ;

    .line 68
    .line 69
    iget v4, v2, Lyyds/ᛲᲈᲈᛶ;->ᛵᛸᛸᛷ:I

    .line 70
    .line 71
    iget-object v7, v2, Lyyds/ᛲᲈᲈᛶ;->ᛲᲈᲁ:[B

    .line 72
    .line 73
    iget v8, v2, Lyyds/ᛲᲈᲈᛶ;->ᲀᛲᛳᲀ:I

    .line 74
    .line 75
    if-ne v2, v0, :cond_7

    .line 76
    .line 77
    if-eqz v3, :cond_6

    .line 78
    .line 79
    move-object v2, v7

    .line 80
    move-object v7, v10

    .line 81
    goto :goto_5

    .line 82
    :cond_6
    :goto_3
    if-eqz p2, :cond_b

    .line 83
    .line 84
    :goto_4
    const/4 v0, -0x2

    .line 85
    return v0

    .line 86
    :cond_7
    move-object v15, v7

    .line 87
    move-object v7, v2

    .line 88
    move-object v2, v15

    .line 89
    goto :goto_5

    .line 90
    :cond_8
    move-object v7, v8

    .line 91
    move v8, v4

    .line 92
    move v4, v11

    .line 93
    :goto_5
    if-eqz v3, :cond_9

    .line 94
    .line 95
    aget v3, v5, v13

    .line 96
    .line 97
    move v15, v8

    .line 98
    move-object v8, v7

    .line 99
    move v7, v15

    .line 100
    goto :goto_8

    .line 101
    :cond_9
    move v3, v4

    .line 102
    move v4, v8

    .line 103
    move-object v8, v7

    .line 104
    move v7, v13

    .line 105
    goto :goto_1

    .line 106
    :cond_a
    add-int/lit8 v12, v3, 0x1

    .line 107
    .line 108
    aget-byte v3, v2, v3

    .line 109
    .line 110
    and-int/lit16 v3, v3, 0xff

    .line 111
    .line 112
    add-int v13, v7, v11

    .line 113
    .line 114
    :goto_6
    if-ne v7, v13, :cond_c

    .line 115
    .line 116
    :cond_b
    :goto_7
    return v9

    .line 117
    :cond_c
    aget v14, v5, v7

    .line 118
    .line 119
    if-ne v3, v14, :cond_10

    .line 120
    .line 121
    add-int/2addr v7, v11

    .line 122
    aget v3, v5, v7

    .line 123
    .line 124
    if-ne v12, v4, :cond_e

    .line 125
    .line 126
    iget-object v8, v8, Lyyds/ᛲᲈᲈᛶ;->ᲇᲇᲇᛱ:Lyyds/ᛲᲈᲈᛶ;

    .line 127
    .line 128
    iget v2, v8, Lyyds/ᛲᲈᲈᛶ;->ᛵᛸᛸᛷ:I

    .line 129
    .line 130
    iget-object v4, v8, Lyyds/ᛲᲈᲈᛶ;->ᛲᲈᲁ:[B

    .line 131
    .line 132
    iget v7, v8, Lyyds/ᛲᲈᲈᛶ;->ᲀᛲᛳᲀ:I

    .line 133
    .line 134
    if-ne v8, v0, :cond_d

    .line 135
    .line 136
    move-object v8, v4

    .line 137
    move v4, v2

    .line 138
    move-object v2, v8

    .line 139
    move-object v8, v10

    .line 140
    goto :goto_8

    .line 141
    :cond_d
    move-object v15, v4

    .line 142
    move v4, v2

    .line 143
    move-object v2, v15

    .line 144
    goto :goto_8

    .line 145
    :cond_e
    move v7, v4

    .line 146
    move v4, v12

    .line 147
    :goto_8
    if-ltz v3, :cond_f

    .line 148
    .line 149
    return v3

    .line 150
    :cond_f
    neg-int v3, v3

    .line 151
    move v15, v7

    .line 152
    move v7, v3

    .line 153
    move v3, v4

    .line 154
    move v4, v15

    .line 155
    goto/16 :goto_0

    .line 156
    .line 157
    :cond_10
    add-int/lit8 v7, v7, 0x1

    .line 158
    .line 159
    goto :goto_6
.end method
