.class public abstract LU0/p;
.super LU0/o;
.source "SourceFile"


# direct methods
.method public static Z(Ljava/lang/String;)Ljava/lang/Integer;
    .locals 10

    .line 1
    const-string v0, "<this>"

    .line 2
    .line 3
    invoke-static {p0, v0}, LN0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const/16 v0, 0xa

    .line 7
    .line 8
    invoke-static {v0}, LD/h;->e(I)V

    .line 9
    .line 10
    .line 11
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    .line 12
    .line 13
    .line 14
    move-result v1

    .line 15
    if-nez v1, :cond_0

    .line 16
    .line 17
    goto :goto_3

    .line 18
    :cond_0
    const/4 v2, 0x0

    .line 19
    invoke-virtual {p0, v2}, Ljava/lang/String;->charAt(I)C

    .line 20
    .line 21
    .line 22
    move-result v3

    .line 23
    const/4 v4, 0x1

    .line 24
    const/16 v5, 0x30

    .line 25
    .line 26
    if-ge v3, v5, :cond_1

    .line 27
    .line 28
    const/4 v5, -0x1

    .line 29
    goto :goto_0

    .line 30
    :cond_1
    if-ne v3, v5, :cond_2

    .line 31
    .line 32
    move v5, v2

    .line 33
    goto :goto_0

    .line 34
    :cond_2
    move v5, v4

    .line 35
    :goto_0
    const v6, -0x7fffffff

    .line 36
    .line 37
    .line 38
    if-gez v5, :cond_5

    .line 39
    .line 40
    if-ne v1, v4, :cond_3

    .line 41
    .line 42
    goto :goto_3

    .line 43
    :cond_3
    const/16 v5, 0x2d

    .line 44
    .line 45
    if-ne v3, v5, :cond_4

    .line 46
    .line 47
    const/high16 v6, -0x80000000

    .line 48
    .line 49
    move v3, v4

    .line 50
    goto :goto_1

    .line 51
    :cond_4
    const/16 v5, 0x2b

    .line 52
    .line 53
    if-ne v3, v5, :cond_8

    .line 54
    .line 55
    move v3, v2

    .line 56
    goto :goto_1

    .line 57
    :cond_5
    move v3, v2

    .line 58
    move v4, v3

    .line 59
    :goto_1
    const v5, -0x38e38e3

    .line 60
    .line 61
    .line 62
    move v7, v5

    .line 63
    :goto_2
    if-ge v4, v1, :cond_a

    .line 64
    .line 65
    invoke-virtual {p0, v4}, Ljava/lang/String;->charAt(I)C

    .line 66
    .line 67
    .line 68
    move-result v8

    .line 69
    invoke-static {v8, v0}, Ljava/lang/Character;->digit(II)I

    .line 70
    .line 71
    .line 72
    move-result v8

    .line 73
    if-gez v8, :cond_6

    .line 74
    .line 75
    goto :goto_3

    .line 76
    :cond_6
    if-ge v2, v7, :cond_7

    .line 77
    .line 78
    if-ne v7, v5, :cond_8

    .line 79
    .line 80
    div-int/lit8 v7, v6, 0xa

    .line 81
    .line 82
    if-ge v2, v7, :cond_7

    .line 83
    .line 84
    goto :goto_3

    .line 85
    :cond_7
    mul-int/lit8 v2, v2, 0xa

    .line 86
    .line 87
    add-int v9, v6, v8

    .line 88
    .line 89
    if-ge v2, v9, :cond_9

    .line 90
    .line 91
    :cond_8
    :goto_3
    const/4 p0, 0x0

    .line 92
    return-object p0

    .line 93
    :cond_9
    sub-int/2addr v2, v8

    .line 94
    add-int/lit8 v4, v4, 0x1

    .line 95
    .line 96
    goto :goto_2

    .line 97
    :cond_a
    if-eqz v3, :cond_b

    .line 98
    .line 99
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 100
    .line 101
    .line 102
    move-result-object p0

    .line 103
    return-object p0

    .line 104
    :cond_b
    neg-int p0, v2

    .line 105
    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 106
    .line 107
    .line 108
    move-result-object p0

    .line 109
    return-object p0
.end method

.method public static a0(Ljava/lang/String;)Ljava/lang/Long;
    .locals 18

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    const/16 v1, 0xa

    .line 4
    .line 5
    invoke-static {v1}, LD/h;->e(I)V

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
    goto/16 :goto_3

    .line 15
    .line 16
    :cond_0
    const/4 v3, 0x0

    .line 17
    invoke-virtual {v0, v3}, Ljava/lang/String;->charAt(I)C

    .line 18
    .line 19
    .line 20
    move-result v4

    .line 21
    const/4 v5, 0x1

    .line 22
    const/16 v6, 0x30

    .line 23
    .line 24
    if-ge v4, v6, :cond_1

    .line 25
    .line 26
    const/4 v6, -0x1

    .line 27
    goto :goto_0

    .line 28
    :cond_1
    if-ne v4, v6, :cond_2

    .line 29
    .line 30
    move v6, v3

    .line 31
    goto :goto_0

    .line 32
    :cond_2
    move v6, v5

    .line 33
    :goto_0
    const-wide v7, -0x7fffffffffffffffL    # -4.9E-324

    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
    if-gez v6, :cond_5

    .line 39
    .line 40
    if-ne v2, v5, :cond_3

    .line 41
    .line 42
    goto :goto_3

    .line 43
    :cond_3
    const/16 v6, 0x2d

    .line 44
    .line 45
    if-ne v4, v6, :cond_4

    .line 46
    .line 47
    const-wide/high16 v7, -0x8000000000000000L

    .line 48
    .line 49
    move v3, v5

    .line 50
    goto :goto_1

    .line 51
    :cond_4
    const/16 v6, 0x2b

    .line 52
    .line 53
    if-ne v4, v6, :cond_8

    .line 54
    .line 55
    move/from16 v17, v5

    .line 56
    .line 57
    move v5, v3

    .line 58
    move/from16 v3, v17

    .line 59
    .line 60
    goto :goto_1

    .line 61
    :cond_5
    move v5, v3

    .line 62
    :goto_1
    const-wide v9, -0x38e38e38e38e38eL    # -2.772000429909333E291

    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    const-wide/16 v11, 0x0

    .line 68
    .line 69
    move-wide v13, v9

    .line 70
    :goto_2
    if-ge v3, v2, :cond_a

    .line 71
    .line 72
    invoke-virtual {v0, v3}, Ljava/lang/String;->charAt(I)C

    .line 73
    .line 74
    .line 75
    move-result v4

    .line 76
    invoke-static {v4, v1}, Ljava/lang/Character;->digit(II)I

    .line 77
    .line 78
    .line 79
    move-result v4

    .line 80
    if-gez v4, :cond_6

    .line 81
    .line 82
    goto :goto_3

    .line 83
    :cond_6
    cmp-long v6, v11, v13

    .line 84
    .line 85
    if-gez v6, :cond_7

    .line 86
    .line 87
    cmp-long v6, v13, v9

    .line 88
    .line 89
    if-nez v6, :cond_8

    .line 90
    .line 91
    int-to-long v13, v1

    .line 92
    div-long v13, v7, v13

    .line 93
    .line 94
    cmp-long v6, v11, v13

    .line 95
    .line 96
    if-gez v6, :cond_7

    .line 97
    .line 98
    goto :goto_3

    .line 99
    :cond_7
    int-to-long v9, v1

    .line 100
    mul-long/2addr v11, v9

    .line 101
    int-to-long v9, v4

    .line 102
    add-long v15, v7, v9

    .line 103
    .line 104
    cmp-long v4, v11, v15

    .line 105
    .line 106
    if-gez v4, :cond_9

    .line 107
    .line 108
    :cond_8
    :goto_3
    const/4 v0, 0x0

    .line 109
    return-object v0

    .line 110
    :cond_9
    sub-long/2addr v11, v9

    .line 111
    add-int/lit8 v3, v3, 0x1

    .line 112
    .line 113
    const-wide v9, -0x38e38e38e38e38eL    # -2.772000429909333E291

    .line 114
    .line 115
    .line 116
    .line 117
    .line 118
    goto :goto_2

    .line 119
    :cond_a
    if-eqz v5, :cond_b

    .line 120
    .line 121
    invoke-static {v11, v12}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 122
    .line 123
    .line 124
    move-result-object v0

    .line 125
    return-object v0

    .line 126
    :cond_b
    neg-long v0, v11

    .line 127
    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 128
    .line 129
    .line 130
    move-result-object v0

    .line 131
    return-object v0
.end method
