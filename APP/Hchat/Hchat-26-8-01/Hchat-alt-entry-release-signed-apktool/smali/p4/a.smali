.class public final Lp4/a;
.super Lp4/l;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"


# instance fields
.field public final f:Lp4/f;

.field public final g:Ljava/util/ArrayList;

.field public final h:Lv4/a;

.field public final i:I

.field public final j:I


# direct methods
.method public constructor <init>(Lu4/t;Lp4/f;Ljava/util/ArrayList;Lv4/a;)V
    .locals 1

    .line 1
    sget-object v0, Lu4/p;->i:Lu4/p;

    .line 2
    .line 3
    invoke-direct {p0, p1, v0}, Lp4/l;-><init>(Lu4/t;Lu4/p;)V

    .line 4
    .line 5
    .line 6
    if-eqz p2, :cond_a

    .line 7
    .line 8
    if-eqz p3, :cond_9

    .line 9
    .line 10
    invoke-virtual {p3}, Ljava/util/ArrayList;->size()I

    .line 11
    .line 12
    .line 13
    move-result p1

    .line 14
    if-lez p1, :cond_8

    .line 15
    .line 16
    iput-object p4, p0, Lp4/a;->h:Lv4/a;

    .line 17
    .line 18
    sget-object p1, Lv4/d0;->u:Lv4/d0;

    .line 19
    .line 20
    if-eq p4, p1, :cond_7

    .line 21
    .line 22
    sget-object p1, Lv4/d0;->t:Lv4/d0;

    .line 23
    .line 24
    if-ne p4, p1, :cond_0

    .line 25
    .line 26
    goto :goto_3

    .line 27
    :cond_0
    sget-object p1, Lv4/d0;->A:Lv4/d0;

    .line 28
    .line 29
    if-eq p4, p1, :cond_6

    .line 30
    .line 31
    sget-object p1, Lv4/d0;->v:Lv4/d0;

    .line 32
    .line 33
    if-ne p4, p1, :cond_1

    .line 34
    .line 35
    goto :goto_2

    .line 36
    :cond_1
    sget-object p1, Lv4/d0;->z:Lv4/d0;

    .line 37
    .line 38
    if-eq p4, p1, :cond_5

    .line 39
    .line 40
    sget-object p1, Lv4/d0;->x:Lv4/d0;

    .line 41
    .line 42
    if-ne p4, p1, :cond_2

    .line 43
    .line 44
    goto :goto_1

    .line 45
    :cond_2
    sget-object p1, Lv4/d0;->y:Lv4/d0;

    .line 46
    .line 47
    if-eq p4, p1, :cond_4

    .line 48
    .line 49
    sget-object p1, Lv4/d0;->w:Lv4/d0;

    .line 50
    .line 51
    if-ne p4, p1, :cond_3

    .line 52
    .line 53
    goto :goto_0

    .line 54
    :cond_3
    const-string p1, "Unexpected constant type"

    .line 55
    .line 56
    invoke-static {p1}, Lj8/o;->t(Ljava/lang/String;)V

    .line 57
    .line 58
    .line 59
    const/4 p1, 0x0

    .line 60
    throw p1

    .line 61
    :cond_4
    :goto_0
    const/16 p1, 0x8

    .line 62
    .line 63
    iput p1, p0, Lp4/a;->i:I

    .line 64
    .line 65
    goto :goto_4

    .line 66
    :cond_5
    :goto_1
    const/4 p1, 0x4

    .line 67
    iput p1, p0, Lp4/a;->i:I

    .line 68
    .line 69
    goto :goto_4

    .line 70
    :cond_6
    :goto_2
    const/4 p1, 0x2

    .line 71
    iput p1, p0, Lp4/a;->i:I

    .line 72
    .line 73
    goto :goto_4

    .line 74
    :cond_7
    :goto_3
    const/4 p1, 0x1

    .line 75
    iput p1, p0, Lp4/a;->i:I

    .line 76
    .line 77
    :goto_4
    iput-object p2, p0, Lp4/a;->f:Lp4/f;

    .line 78
    .line 79
    iput-object p3, p0, Lp4/a;->g:Ljava/util/ArrayList;

    .line 80
    .line 81
    invoke-virtual {p3}, Ljava/util/ArrayList;->size()I

    .line 82
    .line 83
    .line 84
    move-result p1

    .line 85
    iput p1, p0, Lp4/a;->j:I

    .line 86
    .line 87
    return-void

    .line 88
    :cond_8
    const-string p1, "Illegal number of init values"

    .line 89
    .line 90
    invoke-static {p1}, Lj8/o;->t(Ljava/lang/String;)V

    .line 91
    .line 92
    .line 93
    const/4 p1, 0x0

    .line 94
    throw p1

    .line 95
    :cond_9
    const-string p1, "values == null"

    .line 96
    .line 97
    invoke-static {p1}, Lbsh/j;->c(Ljava/lang/String;)V

    .line 98
    .line 99
    .line 100
    const/4 p1, 0x0

    .line 101
    throw p1

    .line 102
    :cond_a
    const-string p1, "user == null"

    .line 103
    .line 104
    invoke-static {p1}, Lbsh/j;->c(Ljava/lang/String;)V

    .line 105
    .line 106
    .line 107
    const/4 p1, 0x0

    .line 108
    throw p1
.end method


# virtual methods
.method public final a()Ljava/lang/String;
    .locals 5

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    const/16 v1, 0x64

    .line 4
    .line 5
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 6
    .line 7
    .line 8
    iget-object v1, p0, Lp4/a;->g:Ljava/util/ArrayList;

    .line 9
    .line 10
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    .line 11
    .line 12
    .line 13
    move-result v2

    .line 14
    const/4 v3, 0x0

    .line 15
    :goto_0
    if-ge v3, v2, :cond_0

    .line 16
    .line 17
    const-string v4, "\n    "

    .line 18
    .line 19
    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 20
    .line 21
    .line 22
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 23
    .line 24
    .line 25
    const-string v4, ": "

    .line 26
    .line 27
    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 28
    .line 29
    .line 30
    invoke-virtual {v1, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 31
    .line 32
    .line 33
    move-result-object v4

    .line 34
    check-cast v4, Lv4/a;

    .line 35
    .line 36
    invoke-interface {v4}, Lz4/k;->a()Ljava/lang/String;

    .line 37
    .line 38
    .line 39
    move-result-object v4

    .line 40
    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 41
    .line 42
    .line 43
    add-int/lit8 v3, v3, 0x1

    .line 44
    .line 45
    goto :goto_0

    .line 46
    :cond_0
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 47
    .line 48
    .line 49
    move-result-object v0

    .line 50
    return-object v0
.end method

.method public final b()I
    .locals 2

    .line 1
    iget v0, p0, Lp4/a;->i:I

    .line 2
    .line 3
    iget v1, p0, Lp4/a;->j:I

    .line 4
    .line 5
    mul-int/2addr v1, v0

    .line 6
    add-int/lit8 v1, v1, 0x1

    .line 7
    .line 8
    div-int/lit8 v1, v1, 0x2

    .line 9
    .line 10
    add-int/lit8 v1, v1, 0x4

    .line 11
    .line 12
    return v1
.end method

.method public final g()Ljava/lang/String;
    .locals 5

    .line 1
    iget-object v0, p0, Lp4/a;->f:Lp4/f;

    .line 2
    .line 3
    invoke-virtual {v0}, Lp4/h;->e()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    new-instance v1, Ljava/lang/StringBuilder;

    .line 8
    .line 9
    const/16 v2, 0x64

    .line 10
    .line 11
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 12
    .line 13
    .line 14
    iget-object v2, p0, Lp4/a;->g:Ljava/util/ArrayList;

    .line 15
    .line 16
    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    .line 17
    .line 18
    .line 19
    move-result v3

    .line 20
    const-string v4, "fill-array-data-payload // for fill-array-data @ "

    .line 21
    .line 22
    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 23
    .line 24
    .line 25
    invoke-static {v0}, La/a;->X0(I)Ljava/lang/String;

    .line 26
    .line 27
    .line 28
    move-result-object v0

    .line 29
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 30
    .line 31
    .line 32
    const/4 v0, 0x0

    .line 33
    :goto_0
    if-ge v0, v3, :cond_0

    .line 34
    .line 35
    const-string v4, "\n  "

    .line 36
    .line 37
    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 38
    .line 39
    .line 40
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 41
    .line 42
    .line 43
    const-string v4, ": "

    .line 44
    .line 45
    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 46
    .line 47
    .line 48
    invoke-virtual {v2, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 49
    .line 50
    .line 51
    move-result-object v4

    .line 52
    check-cast v4, Lv4/a;

    .line 53
    .line 54
    invoke-interface {v4}, Lz4/k;->a()Ljava/lang/String;

    .line 55
    .line 56
    .line 57
    move-result-object v4

    .line 58
    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 59
    .line 60
    .line 61
    add-int/lit8 v0, v0, 0x1

    .line 62
    .line 63
    goto :goto_0

    .line 64
    :cond_0
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 65
    .line 66
    .line 67
    move-result-object v0

    .line 68
    return-object v0
.end method

.method public final k(Lu4/p;)Lp4/h;
    .locals 4

    .line 1
    new-instance p1, Lp4/a;

    .line 2
    .line 3
    iget-object v0, p0, Lp4/a;->g:Ljava/util/ArrayList;

    .line 4
    .line 5
    iget-object v1, p0, Lp4/a;->h:Lv4/a;

    .line 6
    .line 7
    iget-object v2, p0, Lp4/h;->c:Lu4/t;

    .line 8
    .line 9
    iget-object v3, p0, Lp4/a;->f:Lp4/f;

    .line 10
    .line 11
    invoke-direct {p1, v2, v3, v0, v1}, Lp4/a;-><init>(Lu4/t;Lp4/f;Ljava/util/ArrayList;Lv4/a;)V

    .line 12
    .line 13
    .line 14
    return-object p1
.end method

.method public final l(Lz4/d;)V
    .locals 17

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    iget-object v2, v0, Lp4/a;->g:Ljava/util/ArrayList;

    .line 6
    .line 7
    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    .line 8
    .line 9
    .line 10
    move-result v3

    .line 11
    const/16 v4, 0x300

    .line 12
    .line 13
    invoke-virtual {v1, v4}, Lz4/d;->l(I)V

    .line 14
    .line 15
    .line 16
    iget v4, v0, Lp4/a;->i:I

    .line 17
    .line 18
    invoke-virtual {v1, v4}, Lz4/d;->l(I)V

    .line 19
    .line 20
    .line 21
    iget v5, v0, Lp4/a;->j:I

    .line 22
    .line 23
    invoke-virtual {v1, v5}, Lz4/d;->k(I)V

    .line 24
    .line 25
    .line 26
    const/4 v5, 0x2

    .line 27
    const/4 v6, 0x0

    .line 28
    const/4 v7, 0x1

    .line 29
    if-eq v4, v7, :cond_6

    .line 30
    .line 31
    if-eq v4, v5, :cond_5

    .line 32
    .line 33
    const/4 v8, 0x4

    .line 34
    if-eq v4, v8, :cond_4

    .line 35
    .line 36
    const/16 v8, 0x8

    .line 37
    .line 38
    if-eq v4, v8, :cond_1

    .line 39
    .line 40
    :cond_0
    move/from16 v16, v5

    .line 41
    .line 42
    goto/16 :goto_5

    .line 43
    .line 44
    :cond_1
    move v8, v6

    .line 45
    :goto_0
    if-ge v8, v3, :cond_0

    .line 46
    .line 47
    invoke-virtual {v2, v8}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 48
    .line 49
    .line 50
    move-result-object v9

    .line 51
    check-cast v9, Lv4/a;

    .line 52
    .line 53
    check-cast v9, Lv4/t;

    .line 54
    .line 55
    iget-wide v9, v9, Lv4/t;->g:J

    .line 56
    .line 57
    iget v11, v1, Lz4/d;->c:I

    .line 58
    .line 59
    add-int/lit8 v12, v11, 0x8

    .line 60
    .line 61
    iget-boolean v13, v1, Lz4/d;->a:Z

    .line 62
    .line 63
    if-eqz v13, :cond_2

    .line 64
    .line 65
    invoke-virtual {v1, v12}, Lz4/d;->f(I)V

    .line 66
    .line 67
    .line 68
    goto :goto_1

    .line 69
    :cond_2
    iget-object v13, v1, Lz4/d;->b:[B

    .line 70
    .line 71
    array-length v13, v13

    .line 72
    if-gt v12, v13, :cond_3

    .line 73
    .line 74
    :goto_1
    long-to-int v13, v9

    .line 75
    iget-object v14, v1, Lz4/d;->b:[B

    .line 76
    .line 77
    int-to-byte v15, v13

    .line 78
    aput-byte v15, v14, v11

    .line 79
    .line 80
    add-int/lit8 v15, v11, 0x1

    .line 81
    .line 82
    move/from16 v16, v5

    .line 83
    .line 84
    shr-int/lit8 v5, v13, 0x8

    .line 85
    .line 86
    int-to-byte v5, v5

    .line 87
    aput-byte v5, v14, v15

    .line 88
    .line 89
    add-int/lit8 v5, v11, 0x2

    .line 90
    .line 91
    shr-int/lit8 v15, v13, 0x10

    .line 92
    .line 93
    int-to-byte v15, v15

    .line 94
    aput-byte v15, v14, v5

    .line 95
    .line 96
    add-int/lit8 v5, v11, 0x3

    .line 97
    .line 98
    shr-int/lit8 v13, v13, 0x18

    .line 99
    .line 100
    int-to-byte v13, v13

    .line 101
    aput-byte v13, v14, v5

    .line 102
    .line 103
    const/16 v5, 0x20

    .line 104
    .line 105
    shr-long/2addr v9, v5

    .line 106
    long-to-int v5, v9

    .line 107
    add-int/lit8 v9, v11, 0x4

    .line 108
    .line 109
    int-to-byte v10, v5

    .line 110
    aput-byte v10, v14, v9

    .line 111
    .line 112
    add-int/lit8 v9, v11, 0x5

    .line 113
    .line 114
    shr-int/lit8 v10, v5, 0x8

    .line 115
    .line 116
    int-to-byte v10, v10

    .line 117
    aput-byte v10, v14, v9

    .line 118
    .line 119
    add-int/lit8 v9, v11, 0x6

    .line 120
    .line 121
    shr-int/lit8 v10, v5, 0x10

    .line 122
    .line 123
    int-to-byte v10, v10

    .line 124
    aput-byte v10, v14, v9

    .line 125
    .line 126
    add-int/lit8 v11, v11, 0x7

    .line 127
    .line 128
    shr-int/lit8 v5, v5, 0x18

    .line 129
    .line 130
    int-to-byte v5, v5

    .line 131
    aput-byte v5, v14, v11

    .line 132
    .line 133
    iput v12, v1, Lz4/d;->c:I

    .line 134
    .line 135
    add-int/lit8 v8, v8, 0x1

    .line 136
    .line 137
    move/from16 v5, v16

    .line 138
    .line 139
    goto :goto_0

    .line 140
    :cond_3
    invoke-static {}, Lz4/d;->g()V

    .line 141
    .line 142
    .line 143
    const/4 v1, 0x0

    .line 144
    throw v1

    .line 145
    :cond_4
    move/from16 v16, v5

    .line 146
    .line 147
    move v5, v6

    .line 148
    :goto_2
    if-ge v5, v3, :cond_7

    .line 149
    .line 150
    invoke-virtual {v2, v5}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 151
    .line 152
    .line 153
    move-result-object v8

    .line 154
    check-cast v8, Lv4/a;

    .line 155
    .line 156
    check-cast v8, Lv4/s;

    .line 157
    .line 158
    iget v8, v8, Lv4/s;->g:I

    .line 159
    .line 160
    invoke-virtual {v1, v8}, Lz4/d;->k(I)V

    .line 161
    .line 162
    .line 163
    add-int/lit8 v5, v5, 0x1

    .line 164
    .line 165
    goto :goto_2

    .line 166
    :cond_5
    move/from16 v16, v5

    .line 167
    .line 168
    move v5, v6

    .line 169
    :goto_3
    if-ge v5, v3, :cond_7

    .line 170
    .line 171
    invoke-virtual {v2, v5}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 172
    .line 173
    .line 174
    move-result-object v8

    .line 175
    check-cast v8, Lv4/a;

    .line 176
    .line 177
    check-cast v8, Lv4/s;

    .line 178
    .line 179
    iget v8, v8, Lv4/s;->g:I

    .line 180
    .line 181
    int-to-short v8, v8

    .line 182
    invoke-virtual {v1, v8}, Lz4/d;->l(I)V

    .line 183
    .line 184
    .line 185
    add-int/lit8 v5, v5, 0x1

    .line 186
    .line 187
    goto :goto_3

    .line 188
    :cond_6
    move/from16 v16, v5

    .line 189
    .line 190
    move v5, v6

    .line 191
    :goto_4
    if-ge v5, v3, :cond_7

    .line 192
    .line 193
    invoke-virtual {v2, v5}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 194
    .line 195
    .line 196
    move-result-object v8

    .line 197
    check-cast v8, Lv4/a;

    .line 198
    .line 199
    check-cast v8, Lv4/s;

    .line 200
    .line 201
    iget v8, v8, Lv4/s;->g:I

    .line 202
    .line 203
    int-to-byte v8, v8

    .line 204
    invoke-virtual {v1, v8}, Lz4/d;->j(I)V

    .line 205
    .line 206
    .line 207
    add-int/lit8 v5, v5, 0x1

    .line 208
    .line 209
    goto :goto_4

    .line 210
    :cond_7
    :goto_5
    if-ne v4, v7, :cond_8

    .line 211
    .line 212
    rem-int/lit8 v3, v3, 0x2

    .line 213
    .line 214
    if-eqz v3, :cond_8

    .line 215
    .line 216
    invoke-virtual {v1, v6}, Lz4/d;->j(I)V

    .line 217
    .line 218
    .line 219
    :cond_8
    return-void
.end method
