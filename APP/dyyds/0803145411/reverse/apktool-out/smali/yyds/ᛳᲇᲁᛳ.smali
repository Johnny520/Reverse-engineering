.class public abstract Lyyds/ᛳᲇᲁᛳ;
.super Lyyds/ᛶᲇᛴᲈ;
.source "r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9"


# direct methods
.method public static ᛵᛶᛲᲀ(Ljava/lang/String;)Ljava/lang/Long;
    .locals 19

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    const/16 v1, 0xa

    .line 4
    .line 5
    invoke-static {v1}, Lyyds/ᛸᛳᛷᛳ;->ᲀᛲᛳᲀ(I)V

    .line 6
    .line 7
    .line 8
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    .line 9
    .line 10
    .line 11
    move-result v2

    .line 12
    if-nez v2, :cond_0

    .line 13
    .line 14
    goto :goto_2

    .line 15
    :cond_0
    const/4 v3, 0x0

    .line 16
    invoke-virtual {v0, v3}, Ljava/lang/String;->charAt(I)C

    .line 17
    .line 18
    .line 19
    move-result v4

    .line 20
    const/16 v5, 0x30

    .line 21
    .line 22
    invoke-static {v4, v5}, Lyyds/ᛷᛴᲇᛲ;->ᲀᛲᛳᲀ(II)I

    .line 23
    .line 24
    .line 25
    move-result v5

    .line 26
    const-wide v6, -0x7fffffffffffffffL    # -4.9E-324

    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    if-gez v5, :cond_4

    .line 32
    .line 33
    const/4 v5, 0x1

    .line 34
    if-ne v2, v5, :cond_1

    .line 35
    .line 36
    goto :goto_2

    .line 37
    :cond_1
    const/16 v8, 0x2b

    .line 38
    .line 39
    if-eq v4, v8, :cond_3

    .line 40
    .line 41
    const/16 v3, 0x2d

    .line 42
    .line 43
    if-eq v4, v3, :cond_2

    .line 44
    .line 45
    goto :goto_2

    .line 46
    :cond_2
    const-wide/high16 v6, -0x8000000000000000L

    .line 47
    .line 48
    move v3, v5

    .line 49
    goto :goto_0

    .line 50
    :cond_3
    move/from16 v18, v5

    .line 51
    .line 52
    move v5, v3

    .line 53
    move/from16 v3, v18

    .line 54
    .line 55
    goto :goto_0

    .line 56
    :cond_4
    move v5, v3

    .line 57
    :goto_0
    const-wide v8, -0x38e38e38e38e38eL    # -2.772000429909333E291

    .line 58
    .line 59
    .line 60
    .line 61
    .line 62
    const-wide/16 v10, 0x0

    .line 63
    .line 64
    move-wide v12, v8

    .line 65
    :goto_1
    if-ge v3, v2, :cond_9

    .line 66
    .line 67
    invoke-virtual {v0, v3}, Ljava/lang/String;->charAt(I)C

    .line 68
    .line 69
    .line 70
    move-result v4

    .line 71
    invoke-static {v4, v1}, Ljava/lang/Character;->digit(II)I

    .line 72
    .line 73
    .line 74
    move-result v4

    .line 75
    if-gez v4, :cond_5

    .line 76
    .line 77
    goto :goto_2

    .line 78
    :cond_5
    cmp-long v14, v10, v12

    .line 79
    .line 80
    const-wide/16 v15, 0xa

    .line 81
    .line 82
    if-gez v14, :cond_6

    .line 83
    .line 84
    cmp-long v12, v12, v8

    .line 85
    .line 86
    if-nez v12, :cond_7

    .line 87
    .line 88
    div-long v12, v6, v15

    .line 89
    .line 90
    cmp-long v14, v10, v12

    .line 91
    .line 92
    if-gez v14, :cond_6

    .line 93
    .line 94
    goto :goto_2

    .line 95
    :cond_6
    mul-long/2addr v10, v15

    .line 96
    int-to-long v14, v4

    .line 97
    add-long v16, v6, v14

    .line 98
    .line 99
    cmp-long v4, v10, v16

    .line 100
    .line 101
    if-gez v4, :cond_8

    .line 102
    .line 103
    :cond_7
    :goto_2
    const/4 v0, 0x0

    .line 104
    return-object v0

    .line 105
    :cond_8
    sub-long/2addr v10, v14

    .line 106
    add-int/lit8 v3, v3, 0x1

    .line 107
    .line 108
    goto :goto_1

    .line 109
    :cond_9
    if-eqz v5, :cond_a

    .line 110
    .line 111
    invoke-static {v10, v11}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 112
    .line 113
    .line 114
    move-result-object v0

    .line 115
    return-object v0

    .line 116
    :cond_a
    neg-long v0, v10

    .line 117
    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 118
    .line 119
    .line 120
    move-result-object v0

    .line 121
    return-object v0
.end method

.method public static ᛶᛳᛶᛵ(Ljava/lang/String;)Ljava/lang/Integer;
    .locals 10

    .line 1
    const/16 v0, 0xa

    .line 2
    .line 3
    invoke-static {v0}, Lyyds/ᛸᛳᛷᛳ;->ᲀᛲᛳᲀ(I)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    .line 7
    .line 8
    .line 9
    move-result v1

    .line 10
    if-nez v1, :cond_0

    .line 11
    .line 12
    goto :goto_2

    .line 13
    :cond_0
    const/4 v2, 0x0

    .line 14
    invoke-virtual {p0, v2}, Ljava/lang/String;->charAt(I)C

    .line 15
    .line 16
    .line 17
    move-result v3

    .line 18
    const/16 v4, 0x30

    .line 19
    .line 20
    invoke-static {v3, v4}, Lyyds/ᛷᛴᲇᛲ;->ᲀᛲᛳᲀ(II)I

    .line 21
    .line 22
    .line 23
    move-result v4

    .line 24
    const v5, -0x7fffffff

    .line 25
    .line 26
    .line 27
    if-gez v4, :cond_4

    .line 28
    .line 29
    const/4 v4, 0x1

    .line 30
    if-ne v1, v4, :cond_1

    .line 31
    .line 32
    goto :goto_2

    .line 33
    :cond_1
    const/16 v6, 0x2b

    .line 34
    .line 35
    if-eq v3, v6, :cond_3

    .line 36
    .line 37
    const/16 v5, 0x2d

    .line 38
    .line 39
    if-eq v3, v5, :cond_2

    .line 40
    .line 41
    goto :goto_2

    .line 42
    :cond_2
    const/high16 v5, -0x80000000

    .line 43
    .line 44
    move v3, v4

    .line 45
    goto :goto_0

    .line 46
    :cond_3
    move v3, v2

    .line 47
    goto :goto_0

    .line 48
    :cond_4
    move v3, v2

    .line 49
    move v4, v3

    .line 50
    :goto_0
    const v6, -0x38e38e3

    .line 51
    .line 52
    .line 53
    move v7, v6

    .line 54
    :goto_1
    if-ge v4, v1, :cond_9

    .line 55
    .line 56
    invoke-virtual {p0, v4}, Ljava/lang/String;->charAt(I)C

    .line 57
    .line 58
    .line 59
    move-result v8

    .line 60
    invoke-static {v8, v0}, Ljava/lang/Character;->digit(II)I

    .line 61
    .line 62
    .line 63
    move-result v8

    .line 64
    if-gez v8, :cond_5

    .line 65
    .line 66
    goto :goto_2

    .line 67
    :cond_5
    if-ge v2, v7, :cond_6

    .line 68
    .line 69
    if-ne v7, v6, :cond_7

    .line 70
    .line 71
    div-int/lit8 v7, v5, 0xa

    .line 72
    .line 73
    if-ge v2, v7, :cond_6

    .line 74
    .line 75
    goto :goto_2

    .line 76
    :cond_6
    mul-int/lit8 v2, v2, 0xa

    .line 77
    .line 78
    add-int v9, v5, v8

    .line 79
    .line 80
    if-ge v2, v9, :cond_8

    .line 81
    .line 82
    :cond_7
    :goto_2
    const/4 p0, 0x0

    .line 83
    return-object p0

    .line 84
    :cond_8
    sub-int/2addr v2, v8

    .line 85
    add-int/lit8 v4, v4, 0x1

    .line 86
    .line 87
    goto :goto_1

    .line 88
    :cond_9
    if-eqz v3, :cond_a

    .line 89
    .line 90
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 91
    .line 92
    .line 93
    move-result-object p0

    .line 94
    return-object p0

    .line 95
    :cond_a
    neg-int p0, v2

    .line 96
    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 97
    .line 98
    .line 99
    move-result-object p0

    .line 100
    return-object p0
.end method
