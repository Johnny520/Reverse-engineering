.class public final Lsh/y;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"


# virtual methods
.method public final a(Lu2/k;Lu2/k;Lu2/m;JLu2/k;Lsh/g0;)J
    .locals 16

    .line 1
    move-object/from16 v0, p1

    .line 2
    .line 3
    move-object/from16 v1, p2

    .line 4
    .line 5
    move-object/from16 v2, p6

    .line 6
    .line 7
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 11
    .line 12
    .line 13
    iget v3, v1, Lu2/k;->b:I

    .line 14
    .line 15
    iget v4, v1, Lu2/k;->d:I

    .line 16
    .line 17
    invoke-virtual/range {p3 .. p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 18
    .line 19
    .line 20
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 21
    .line 22
    .line 23
    iget v5, v2, Lu2/k;->b:I

    .line 24
    .line 25
    iget v6, v2, Lu2/k;->d:I

    .line 26
    .line 27
    iget v7, v2, Lu2/k;->c:I

    .line 28
    .line 29
    move-object/from16 v8, p3

    .line 30
    .line 31
    move-object/from16 v9, p7

    .line 32
    .line 33
    invoke-static {v9, v8}, Lsh/s;->s(Lsh/g0;Lu2/m;)Lsh/g0;

    .line 34
    .line 35
    .line 36
    move-result-object v8

    .line 37
    sget-object v9, Lsh/g0;->h:Lsh/g0;

    .line 38
    .line 39
    const/16 v10, 0x20

    .line 40
    .line 41
    if-ne v8, v9, :cond_0

    .line 42
    .line 43
    iget v2, v0, Lu2/k;->c:I

    .line 44
    .line 45
    shr-long v8, p4, v10

    .line 46
    .line 47
    long-to-int v8, v8

    .line 48
    sub-int/2addr v2, v8

    .line 49
    sub-int/2addr v2, v7

    .line 50
    goto :goto_0

    .line 51
    :cond_0
    iget v8, v0, Lu2/k;->a:I

    .line 52
    .line 53
    iget v2, v2, Lu2/k;->a:I

    .line 54
    .line 55
    add-int/2addr v2, v8

    .line 56
    :goto_0
    iget v8, v0, Lu2/k;->d:I

    .line 57
    .line 58
    sub-int v9, v4, v8

    .line 59
    .line 60
    const-wide v11, 0xffffffffL

    .line 61
    .line 62
    .line 63
    .line 64
    .line 65
    and-long v13, p4, v11

    .line 66
    .line 67
    long-to-int v13, v13

    .line 68
    if-le v9, v13, :cond_1

    .line 69
    .line 70
    add-int/2addr v8, v6

    .line 71
    goto :goto_1

    .line 72
    :cond_1
    iget v8, v0, Lu2/k;->b:I

    .line 73
    .line 74
    sub-int v9, v8, v3

    .line 75
    .line 76
    if-le v9, v13, :cond_2

    .line 77
    .line 78
    sub-int/2addr v8, v13

    .line 79
    sub-int/2addr v8, v5

    .line 80
    goto :goto_1

    .line 81
    :cond_2
    invoke-virtual {v0}, Lu2/k;->a()I

    .line 82
    .line 83
    .line 84
    move-result v0

    .line 85
    div-int/lit8 v0, v0, 0x2

    .line 86
    .line 87
    add-int/2addr v0, v8

    .line 88
    div-int/lit8 v8, v13, 0x2

    .line 89
    .line 90
    sub-int v8, v0, v8

    .line 91
    .line 92
    :goto_1
    iget v0, v1, Lu2/k;->a:I

    .line 93
    .line 94
    iget v1, v1, Lu2/k;->c:I

    .line 95
    .line 96
    shr-long v14, p4, v10

    .line 97
    .line 98
    long-to-int v9, v14

    .line 99
    sub-int/2addr v1, v9

    .line 100
    sub-int/2addr v1, v7

    .line 101
    if-ge v1, v0, :cond_3

    .line 102
    .line 103
    move v1, v0

    .line 104
    :cond_3
    invoke-static {v2, v0, v1}, Lr9/e0;->r(III)I

    .line 105
    .line 106
    .line 107
    move-result v0

    .line 108
    add-int/2addr v3, v5

    .line 109
    sub-int/2addr v4, v13

    .line 110
    sub-int/2addr v4, v6

    .line 111
    if-le v3, v4, :cond_4

    .line 112
    .line 113
    move v3, v4

    .line 114
    :cond_4
    invoke-static {v8, v3, v4}, Lr9/e0;->r(III)I

    .line 115
    .line 116
    .line 117
    move-result v1

    .line 118
    int-to-long v2, v0

    .line 119
    shl-long/2addr v2, v10

    .line 120
    int-to-long v0, v1

    .line 121
    and-long/2addr v0, v11

    .line 122
    or-long/2addr v0, v2

    .line 123
    return-wide v0
.end method

.method public final b()Lp/z0;
    .locals 3

    .line 1
    const/4 v0, 0x0

    .line 2
    int-to-float v0, v0

    .line 3
    const/16 v1, 0x8

    .line 4
    .line 5
    int-to-float v1, v1

    .line 6
    new-instance v2, Lp/z0;

    .line 7
    .line 8
    invoke-direct {v2, v0, v1, v0, v1}, Lp/z0;-><init>(FFFF)V

    .line 9
    .line 10
    .line 11
    return-object v2
.end method
