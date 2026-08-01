.class public final Lgh0;
.super Ljava/lang/Object;
.source "r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6"

# interfaces
.implements Lt40;
.implements Ljava/util/Set;
.implements Lp40;


# instance fields
.field public final d:Leh0;

.field public final e:Leh0;


# direct methods
.method public constructor <init>(Leh0;)V
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    iput-object p1, p0, Lgh0;->d:Leh0;

    .line 8
    .line 9
    iput-object p1, p0, Lgh0;->e:Leh0;

    .line 10
    .line 11
    return-void
.end method


# virtual methods
.method public final add(Ljava/lang/Object;)Z
    .locals 0

    .line 1
    iget-object p0, p0, Lgh0;->e:Leh0;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Leh0;->a(Ljava/lang/Object;)Z

    .line 4
    .line 5
    .line 6
    move-result p0

    .line 7
    return p0
.end method

.method public final addAll(Ljava/util/Collection;)Z
    .locals 12

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    check-cast p1, Ljava/lang/Iterable;

    .line 5
    .line 6
    iget-object p0, p0, Lgh0;->e:Leh0;

    .line 7
    .line 8
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 9
    .line 10
    .line 11
    iget v0, p0, Leh0;->g:I

    .line 12
    .line 13
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    :cond_0
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 18
    .line 19
    .line 20
    move-result v1

    .line 21
    if-eqz v1, :cond_2

    .line 22
    .line 23
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 24
    .line 25
    .line 26
    move-result-object v1

    .line 27
    invoke-virtual {p0, v1}, Leh0;->d(Ljava/lang/Object;)I

    .line 28
    .line 29
    .line 30
    move-result v2

    .line 31
    iget-object v3, p0, Leh0;->b:[Ljava/lang/Object;

    .line 32
    .line 33
    aput-object v1, v3, v2

    .line 34
    .line 35
    iget-object v1, p0, Leh0;->c:[J

    .line 36
    .line 37
    iget v3, p0, Leh0;->d:I

    .line 38
    .line 39
    int-to-long v4, v3

    .line 40
    const-wide/32 v6, 0x7fffffff

    .line 41
    .line 42
    .line 43
    and-long/2addr v4, v6

    .line 44
    const-wide v8, 0x3fffffff80000000L    # 1.9999995231628418

    .line 45
    .line 46
    .line 47
    .line 48
    .line 49
    or-long/2addr v4, v8

    .line 50
    aput-wide v4, v1, v2

    .line 51
    .line 52
    const v4, 0x7fffffff

    .line 53
    .line 54
    .line 55
    if-eq v3, v4, :cond_1

    .line 56
    .line 57
    aget-wide v8, v1, v3

    .line 58
    .line 59
    const-wide v10, -0x3fffffff80000001L    # -2.000000953674316

    .line 60
    .line 61
    .line 62
    .line 63
    .line 64
    and-long/2addr v8, v10

    .line 65
    int-to-long v10, v2

    .line 66
    and-long v5, v10, v6

    .line 67
    .line 68
    const/16 v7, 0x1f

    .line 69
    .line 70
    shl-long/2addr v5, v7

    .line 71
    or-long/2addr v5, v8

    .line 72
    aput-wide v5, v1, v3

    .line 73
    .line 74
    :cond_1
    iput v2, p0, Leh0;->d:I

    .line 75
    .line 76
    iget v1, p0, Leh0;->e:I

    .line 77
    .line 78
    if-ne v1, v4, :cond_0

    .line 79
    .line 80
    iput v2, p0, Leh0;->e:I

    .line 81
    .line 82
    goto :goto_0

    .line 83
    :cond_2
    iget p0, p0, Leh0;->g:I

    .line 84
    .line 85
    if-eq v0, p0, :cond_3

    .line 86
    .line 87
    const/4 p0, 0x1

    .line 88
    return p0

    .line 89
    :cond_3
    const/4 p0, 0x0

    .line 90
    return p0
.end method

.method public final clear()V
    .locals 0

    .line 1
    iget-object p0, p0, Lgh0;->e:Leh0;

    .line 2
    .line 3
    invoke-virtual {p0}, Leh0;->b()V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final contains(Ljava/lang/Object;)Z
    .locals 0

    .line 1
    iget-object p0, p0, Lgh0;->d:Leh0;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Leh0;->c(Ljava/lang/Object;)Z

    .line 4
    .line 5
    .line 6
    move-result p0

    .line 7
    return p0
.end method

.method public final containsAll(Ljava/util/Collection;)Z
    .locals 2

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    check-cast p1, Ljava/lang/Iterable;

    .line 5
    .line 6
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 7
    .line 8
    .line 9
    move-result-object p1

    .line 10
    :cond_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 11
    .line 12
    .line 13
    move-result v0

    .line 14
    if-eqz v0, :cond_1

    .line 15
    .line 16
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    iget-object v1, p0, Lgh0;->d:Leh0;

    .line 21
    .line 22
    invoke-virtual {v1, v0}, Leh0;->c(Ljava/lang/Object;)Z

    .line 23
    .line 24
    .line 25
    move-result v0

    .line 26
    if-nez v0, :cond_0

    .line 27
    .line 28
    const/4 p0, 0x0

    .line 29
    return p0

    .line 30
    :cond_1
    const/4 p0, 0x1

    .line 31
    return p0
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 2

    .line 1
    if-ne p0, p1, :cond_0

    .line 2
    .line 3
    const/4 p0, 0x1

    .line 4
    return p0

    .line 5
    :cond_0
    if-eqz p1, :cond_2

    .line 6
    .line 7
    const-class v0, Lgh0;

    .line 8
    .line 9
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    if-eq v0, v1, :cond_1

    .line 14
    .line 15
    goto :goto_0

    .line 16
    :cond_1
    check-cast p1, Lgh0;

    .line 17
    .line 18
    iget-object p0, p0, Lgh0;->d:Leh0;

    .line 19
    .line 20
    iget-object p1, p1, Lgh0;->d:Leh0;

    .line 21
    .line 22
    invoke-static {p0, p1}, Lp30;->l(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 23
    .line 24
    .line 25
    move-result p0

    .line 26
    return p0

    .line 27
    :cond_2
    :goto_0
    const/4 p0, 0x0

    .line 28
    return p0
.end method

.method public final hashCode()I
    .locals 0

    .line 1
    iget-object p0, p0, Lgh0;->d:Leh0;

    .line 2
    .line 3
    invoke-virtual {p0}, Leh0;->hashCode()I

    .line 4
    .line 5
    .line 6
    move-result p0

    .line 7
    return p0
.end method

.method public final isEmpty()Z
    .locals 0

    .line 1
    iget-object p0, p0, Lgh0;->d:Leh0;

    .line 2
    .line 3
    iget p0, p0, Leh0;->g:I

    .line 4
    .line 5
    if-nez p0, :cond_0

    .line 6
    .line 7
    const/4 p0, 0x1

    .line 8
    return p0

    .line 9
    :cond_0
    const/4 p0, 0x0

    .line 10
    return p0
.end method

.method public final iterator()Ljava/util/Iterator;
    .locals 1

    .line 1
    new-instance v0, Lkx;

    .line 2
    .line 3
    invoke-direct {v0, p0}, Lkx;-><init>(Lgh0;)V

    .line 4
    .line 5
    .line 6
    return-object v0
.end method

.method public final remove(Ljava/lang/Object;)Z
    .locals 0

    .line 1
    iget-object p0, p0, Lgh0;->e:Leh0;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Leh0;->g(Ljava/lang/Object;)Z

    .line 4
    .line 5
    .line 6
    move-result p0

    .line 7
    return p0
.end method

.method public final removeAll(Ljava/util/Collection;)Z
    .locals 18

    .line 1
    invoke-virtual/range {p1 .. p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    move-object/from16 v0, p1

    .line 5
    .line 6
    check-cast v0, Ljava/lang/Iterable;

    .line 7
    .line 8
    move-object/from16 v1, p0

    .line 9
    .line 10
    iget-object v1, v1, Lgh0;->e:Leh0;

    .line 11
    .line 12
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 13
    .line 14
    .line 15
    iget v2, v1, Leh0;->g:I

    .line 16
    .line 17
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    :cond_0
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 22
    .line 23
    .line 24
    move-result v3

    .line 25
    const/4 v4, 0x1

    .line 26
    const/4 v5, 0x0

    .line 27
    if-eqz v3, :cond_5

    .line 28
    .line 29
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 30
    .line 31
    .line 32
    move-result-object v3

    .line 33
    if-eqz v3, :cond_1

    .line 34
    .line 35
    invoke-virtual {v3}, Ljava/lang/Object;->hashCode()I

    .line 36
    .line 37
    .line 38
    move-result v6

    .line 39
    goto :goto_1

    .line 40
    :cond_1
    move v6, v5

    .line 41
    :goto_1
    const v7, -0x3361d2af    # -8.293031E7f

    .line 42
    .line 43
    .line 44
    mul-int/2addr v6, v7

    .line 45
    shl-int/lit8 v7, v6, 0x10

    .line 46
    .line 47
    xor-int/2addr v6, v7

    .line 48
    and-int/lit8 v7, v6, 0x7f

    .line 49
    .line 50
    iget v8, v1, Leh0;->f:I

    .line 51
    .line 52
    ushr-int/lit8 v6, v6, 0x7

    .line 53
    .line 54
    and-int/2addr v6, v8

    .line 55
    :goto_2
    iget-object v9, v1, Leh0;->a:[J

    .line 56
    .line 57
    shr-int/lit8 v10, v6, 0x3

    .line 58
    .line 59
    and-int/lit8 v11, v6, 0x7

    .line 60
    .line 61
    shl-int/lit8 v11, v11, 0x3

    .line 62
    .line 63
    aget-wide v12, v9, v10

    .line 64
    .line 65
    ushr-long/2addr v12, v11

    .line 66
    add-int/2addr v10, v4

    .line 67
    aget-wide v9, v9, v10

    .line 68
    .line 69
    rsub-int/lit8 v14, v11, 0x40

    .line 70
    .line 71
    shl-long/2addr v9, v14

    .line 72
    int-to-long v14, v11

    .line 73
    neg-long v14, v14

    .line 74
    const/16 v11, 0x3f

    .line 75
    .line 76
    shr-long/2addr v14, v11

    .line 77
    and-long/2addr v9, v14

    .line 78
    or-long/2addr v9, v12

    .line 79
    int-to-long v11, v7

    .line 80
    const-wide v13, 0x101010101010101L

    .line 81
    .line 82
    .line 83
    .line 84
    .line 85
    mul-long/2addr v11, v13

    .line 86
    xor-long/2addr v11, v9

    .line 87
    sub-long v13, v11, v13

    .line 88
    .line 89
    not-long v11, v11

    .line 90
    and-long/2addr v11, v13

    .line 91
    const-wide v13, -0x7f7f7f7f7f7f7f80L    # -2.937446524422997E-306

    .line 92
    .line 93
    .line 94
    .line 95
    .line 96
    and-long/2addr v11, v13

    .line 97
    :goto_3
    const-wide/16 v15, 0x0

    .line 98
    .line 99
    cmp-long v17, v11, v15

    .line 100
    .line 101
    if-eqz v17, :cond_3

    .line 102
    .line 103
    invoke-static {v11, v12}, Ljava/lang/Long;->numberOfTrailingZeros(J)I

    .line 104
    .line 105
    .line 106
    move-result v15

    .line 107
    shr-int/lit8 v15, v15, 0x3

    .line 108
    .line 109
    add-int/2addr v15, v6

    .line 110
    and-int/2addr v15, v8

    .line 111
    move/from16 p0, v4

    .line 112
    .line 113
    iget-object v4, v1, Leh0;->b:[Ljava/lang/Object;

    .line 114
    .line 115
    aget-object v4, v4, v15

    .line 116
    .line 117
    invoke-static {v4, v3}, Lp30;->l(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 118
    .line 119
    .line 120
    move-result v4

    .line 121
    if-eqz v4, :cond_2

    .line 122
    .line 123
    goto :goto_4

    .line 124
    :cond_2
    const-wide/16 v15, 0x1

    .line 125
    .line 126
    sub-long v15, v11, v15

    .line 127
    .line 128
    and-long/2addr v11, v15

    .line 129
    move/from16 v4, p0

    .line 130
    .line 131
    goto :goto_3

    .line 132
    :cond_3
    move/from16 p0, v4

    .line 133
    .line 134
    not-long v11, v9

    .line 135
    const/4 v4, 0x6

    .line 136
    shl-long/2addr v11, v4

    .line 137
    and-long/2addr v9, v11

    .line 138
    and-long/2addr v9, v13

    .line 139
    cmp-long v4, v9, v15

    .line 140
    .line 141
    if-eqz v4, :cond_4

    .line 142
    .line 143
    const/4 v15, -0x1

    .line 144
    :goto_4
    if-ltz v15, :cond_0

    .line 145
    .line 146
    invoke-virtual {v1, v15}, Leh0;->h(I)V

    .line 147
    .line 148
    .line 149
    goto/16 :goto_0

    .line 150
    .line 151
    :cond_4
    add-int/lit8 v5, v5, 0x8

    .line 152
    .line 153
    add-int/2addr v6, v5

    .line 154
    and-int/2addr v6, v8

    .line 155
    move/from16 v4, p0

    .line 156
    .line 157
    goto :goto_2

    .line 158
    :cond_5
    move/from16 p0, v4

    .line 159
    .line 160
    iget v0, v1, Leh0;->g:I

    .line 161
    .line 162
    if-eq v2, v0, :cond_6

    .line 163
    .line 164
    return p0

    .line 165
    :cond_6
    return v5
.end method

.method public final retainAll(Ljava/util/Collection;)Z
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iget-object p0, p0, Lgh0;->e:Leh0;

    .line 5
    .line 6
    invoke-virtual {p0, p1}, Leh0;->i(Ljava/util/Collection;)Z

    .line 7
    .line 8
    .line 9
    move-result p0

    .line 10
    return p0
.end method

.method public final size()I
    .locals 0

    .line 1
    iget-object p0, p0, Lgh0;->d:Leh0;

    .line 2
    .line 3
    iget p0, p0, Leh0;->g:I

    .line 4
    .line 5
    return p0
.end method

.method public final toArray()[Ljava/lang/Object;
    .locals 0

    .line 9
    invoke-static {p0}, Ls91;->R(Ljava/util/Collection;)[Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public final toArray([Ljava/lang/Object;)[Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-static {p0, p1}, Ls91;->S(Ljava/util/Collection;[Ljava/lang/Object;)[Ljava/lang/Object;

    .line 5
    .line 6
    .line 7
    move-result-object p0

    .line 8
    return-object p0
.end method

.method public final toString()Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Lgh0;->d:Leh0;

    .line 2
    .line 3
    invoke-virtual {p0}, Leh0;->toString()Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    return-object p0
.end method
