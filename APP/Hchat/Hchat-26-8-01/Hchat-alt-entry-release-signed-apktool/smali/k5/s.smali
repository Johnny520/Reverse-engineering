.class public final Lk5/s;
.super Lk5/t;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"


# instance fields
.field public final synthetic g:I

.field public final synthetic h:Lk5/u;


# direct methods
.method public synthetic constructor <init>(Lk5/u;I)V
    .locals 0

    .line 1
    iput p2, p0, Lk5/s;->g:I

    .line 2
    .line 3
    iput-object p1, p0, Lk5/s;->h:Lk5/u;

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/util/AbstractList;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final b(I)Ljava/lang/String;
    .locals 17

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget v1, v0, Lk5/s;->g:I

    .line 4
    .line 5
    packed-switch v1, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    invoke-virtual/range {p0 .. p1}, Lk5/s;->c(I)I

    .line 9
    .line 10
    .line 11
    move-result v1

    .line 12
    iget-object v2, v0, Lk5/s;->h:Lk5/u;

    .line 13
    .line 14
    iget-object v3, v2, Lk5/u;->a:Landroidx/lifecycle/x;

    .line 15
    .line 16
    invoke-virtual {v3, v1}, Landroidx/lifecycle/x;->N(I)I

    .line 17
    .line 18
    .line 19
    move-result v1

    .line 20
    iget-object v2, v2, Lk5/u;->r:Lk5/s;

    .line 21
    .line 22
    invoke-virtual {v2, v1}, Lk5/s;->b(I)Ljava/lang/String;

    .line 23
    .line 24
    .line 25
    move-result-object v1

    .line 26
    return-object v1

    .line 27
    :pswitch_0
    invoke-virtual/range {p0 .. p1}, Lk5/s;->c(I)I

    .line 28
    .line 29
    .line 30
    move-result v1

    .line 31
    iget-object v2, v0, Lk5/s;->h:Lk5/u;

    .line 32
    .line 33
    iget-object v3, v2, Lk5/u;->a:Landroidx/lifecycle/x;

    .line 34
    .line 35
    invoke-virtual {v3, v1}, Landroidx/lifecycle/x;->N(I)I

    .line 36
    .line 37
    .line 38
    move-result v1

    .line 39
    iget-object v2, v2, Lk5/u;->b:Landroidx/lifecycle/x;

    .line 40
    .line 41
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 42
    .line 43
    .line 44
    new-instance v3, La5/a;

    .line 45
    .line 46
    const/4 v4, 0x5

    .line 47
    invoke-direct {v3, v1, v4, v2}, La5/a;-><init>(IILjava/lang/Object;)V

    .line 48
    .line 49
    .line 50
    const/4 v1, 0x0

    .line 51
    invoke-virtual {v3, v1}, La5/a;->o(Z)I

    .line 52
    .line 53
    .line 54
    move-result v4

    .line 55
    const/4 v5, 0x1

    .line 56
    new-array v5, v5, [I

    .line 57
    .line 58
    iget-object v2, v2, Landroidx/lifecycle/x;->h:Ljava/lang/Object;

    .line 59
    .line 60
    check-cast v2, [B

    .line 61
    .line 62
    iget v6, v3, La5/a;->h:I

    .line 63
    .line 64
    sget-object v7, Ld6/n;->a:Ld6/m;

    .line 65
    .line 66
    invoke-virtual {v7}, Ljava/lang/ThreadLocal;->get()Ljava/lang/Object;

    .line 67
    .line 68
    .line 69
    move-result-object v8

    .line 70
    check-cast v8, [C

    .line 71
    .line 72
    if-eqz v8, :cond_0

    .line 73
    .line 74
    array-length v9, v8

    .line 75
    if-ge v9, v4, :cond_1

    .line 76
    .line 77
    :cond_0
    new-array v8, v4, [C

    .line 78
    .line 79
    invoke-virtual {v7, v8}, Ljava/lang/ThreadLocal;->set(Ljava/lang/Object;)V

    .line 80
    .line 81
    .line 82
    :cond_1
    move v9, v1

    .line 83
    move v7, v6

    .line 84
    :goto_0
    if-lez v4, :cond_9

    .line 85
    .line 86
    aget-byte v10, v2, v7

    .line 87
    .line 88
    and-int/lit16 v11, v10, 0xff

    .line 89
    .line 90
    shr-int/lit8 v12, v11, 0x4

    .line 91
    .line 92
    const/4 v13, 0x0

    .line 93
    const/16 v14, 0x80

    .line 94
    .line 95
    packed-switch v12, :pswitch_data_1

    .line 96
    .line 97
    .line 98
    :pswitch_1
    invoke-static {v11, v7}, Ld6/n;->a(II)V

    .line 99
    .line 100
    .line 101
    throw v13

    .line 102
    :pswitch_2
    add-int/lit8 v11, v7, 0x1

    .line 103
    .line 104
    aget-byte v12, v2, v11

    .line 105
    .line 106
    and-int/lit16 v15, v12, 0xff

    .line 107
    .line 108
    move-object/from16 p1, v13

    .line 109
    .line 110
    and-int/lit16 v13, v12, 0xc0

    .line 111
    .line 112
    if-ne v13, v14, :cond_4

    .line 113
    .line 114
    add-int/lit8 v11, v7, 0x2

    .line 115
    .line 116
    aget-byte v13, v2, v11

    .line 117
    .line 118
    and-int/lit16 v15, v13, 0xff

    .line 119
    .line 120
    move/from16 v16, v1

    .line 121
    .line 122
    and-int/lit16 v1, v13, 0xc0

    .line 123
    .line 124
    if-ne v1, v14, :cond_3

    .line 125
    .line 126
    and-int/lit8 v1, v10, 0xf

    .line 127
    .line 128
    shl-int/lit8 v1, v1, 0xc

    .line 129
    .line 130
    and-int/lit8 v10, v12, 0x3f

    .line 131
    .line 132
    shl-int/lit8 v10, v10, 0x6

    .line 133
    .line 134
    or-int/2addr v1, v10

    .line 135
    and-int/lit8 v10, v13, 0x3f

    .line 136
    .line 137
    or-int/2addr v1, v10

    .line 138
    const/16 v10, 0x800

    .line 139
    .line 140
    if-lt v1, v10, :cond_2

    .line 141
    .line 142
    int-to-char v1, v1

    .line 143
    add-int/lit8 v7, v7, 0x3

    .line 144
    .line 145
    goto :goto_2

    .line 146
    :cond_2
    invoke-static {v15, v11}, Ld6/n;->a(II)V

    .line 147
    .line 148
    .line 149
    throw p1

    .line 150
    :cond_3
    invoke-static {v15, v11}, Ld6/n;->a(II)V

    .line 151
    .line 152
    .line 153
    throw p1

    .line 154
    :cond_4
    invoke-static {v15, v11}, Ld6/n;->a(II)V

    .line 155
    .line 156
    .line 157
    throw p1

    .line 158
    :pswitch_3
    move/from16 v16, v1

    .line 159
    .line 160
    move-object/from16 p1, v13

    .line 161
    .line 162
    add-int/lit8 v1, v7, 0x1

    .line 163
    .line 164
    aget-byte v11, v2, v1

    .line 165
    .line 166
    and-int/lit16 v12, v11, 0xff

    .line 167
    .line 168
    and-int/lit16 v13, v11, 0xc0

    .line 169
    .line 170
    if-ne v13, v14, :cond_7

    .line 171
    .line 172
    and-int/lit8 v10, v10, 0x1f

    .line 173
    .line 174
    shl-int/lit8 v10, v10, 0x6

    .line 175
    .line 176
    and-int/lit8 v11, v11, 0x3f

    .line 177
    .line 178
    or-int/2addr v10, v11

    .line 179
    if-eqz v10, :cond_6

    .line 180
    .line 181
    if-lt v10, v14, :cond_5

    .line 182
    .line 183
    goto :goto_1

    .line 184
    :cond_5
    invoke-static {v12, v1}, Ld6/n;->a(II)V

    .line 185
    .line 186
    .line 187
    throw p1

    .line 188
    :cond_6
    :goto_1
    int-to-char v1, v10

    .line 189
    add-int/lit8 v7, v7, 0x2

    .line 190
    .line 191
    goto :goto_2

    .line 192
    :cond_7
    invoke-static {v12, v1}, Ld6/n;->a(II)V

    .line 193
    .line 194
    .line 195
    throw p1

    .line 196
    :pswitch_4
    move/from16 v16, v1

    .line 197
    .line 198
    move-object/from16 p1, v13

    .line 199
    .line 200
    if-eqz v11, :cond_8

    .line 201
    .line 202
    int-to-char v1, v11

    .line 203
    add-int/lit8 v7, v7, 0x1

    .line 204
    .line 205
    :goto_2
    aput-char v1, v8, v9

    .line 206
    .line 207
    add-int/lit8 v9, v9, 0x1

    .line 208
    .line 209
    add-int/lit8 v4, v4, -0x1

    .line 210
    .line 211
    move/from16 v1, v16

    .line 212
    .line 213
    goto/16 :goto_0

    .line 214
    .line 215
    :cond_8
    invoke-static {v11, v7}, Ld6/n;->a(II)V

    .line 216
    .line 217
    .line 218
    throw p1

    .line 219
    :cond_9
    move/from16 v16, v1

    .line 220
    .line 221
    sub-int/2addr v7, v6

    .line 222
    aput v7, v5, v16

    .line 223
    .line 224
    aput v7, v5, v16

    .line 225
    .line 226
    new-instance v1, Ljava/lang/String;

    .line 227
    .line 228
    move/from16 v2, v16

    .line 229
    .line 230
    invoke-direct {v1, v8, v2, v9}, Ljava/lang/String;-><init>([CII)V

    .line 231
    .line 232
    .line 233
    iget v4, v3, La5/a;->h:I

    .line 234
    .line 235
    aget v2, v5, v2

    .line 236
    .line 237
    add-int/2addr v4, v2

    .line 238
    iput v4, v3, La5/a;->h:I

    .line 239
    .line 240
    return-object v1

    .line 241
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch

    .line 242
    .line 243
    .line 244
    .line 245
    .line 246
    .line 247
    :pswitch_data_1
    .packed-switch 0x0
        :pswitch_4
        :pswitch_4
        :pswitch_4
        :pswitch_4
        :pswitch_4
        :pswitch_4
        :pswitch_4
        :pswitch_4
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_3
        :pswitch_3
        :pswitch_2
    .end packed-switch
.end method

.method public final c(I)I
    .locals 2

    .line 1
    iget v0, p0, Lk5/s;->g:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lk5/s;->h:Lk5/u;

    .line 7
    .line 8
    iget v1, v0, Lk5/u;->f:I

    .line 9
    .line 10
    if-ltz p1, :cond_0

    .line 11
    .line 12
    if-ge p1, v1, :cond_0

    .line 13
    .line 14
    iget v0, v0, Lk5/u;->g:I

    .line 15
    .line 16
    :goto_0
    mul-int/lit8 p1, p1, 0x4

    .line 17
    .line 18
    add-int/2addr p1, v0

    .line 19
    return p1

    .line 20
    :cond_0
    new-instance v0, Ljava/lang/IndexOutOfBoundsException;

    .line 21
    .line 22
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 23
    .line 24
    .line 25
    move-result-object p1

    .line 26
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 27
    .line 28
    .line 29
    move-result-object v1

    .line 30
    filled-new-array {p1, v1}, [Ljava/lang/Object;

    .line 31
    .line 32
    .line 33
    move-result-object p1

    .line 34
    const-string v1, "Invalid type index %d, not in [0, %d)"

    .line 35
    .line 36
    invoke-static {v1, p1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 37
    .line 38
    .line 39
    move-result-object p1

    .line 40
    invoke-direct {v0, p1}, Ljava/lang/IndexOutOfBoundsException;-><init>(Ljava/lang/String;)V

    .line 41
    .line 42
    .line 43
    throw v0

    .line 44
    :pswitch_0
    iget-object v0, p0, Lk5/s;->h:Lk5/u;

    .line 45
    .line 46
    iget v1, v0, Lk5/u;->d:I

    .line 47
    .line 48
    if-ltz p1, :cond_1

    .line 49
    .line 50
    if-ge p1, v1, :cond_1

    .line 51
    .line 52
    iget v0, v0, Lk5/u;->e:I

    .line 53
    .line 54
    goto :goto_0

    .line 55
    :cond_1
    new-instance v0, Ljava/lang/IndexOutOfBoundsException;

    .line 56
    .line 57
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 58
    .line 59
    .line 60
    move-result-object p1

    .line 61
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 62
    .line 63
    .line 64
    move-result-object v1

    .line 65
    filled-new-array {p1, v1}, [Ljava/lang/Object;

    .line 66
    .line 67
    .line 68
    move-result-object p1

    .line 69
    const-string v1, "Invalid string index %d, not in [0, %d)"

    .line 70
    .line 71
    invoke-static {v1, p1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 72
    .line 73
    .line 74
    move-result-object p1

    .line 75
    invoke-direct {v0, p1}, Ljava/lang/IndexOutOfBoundsException;-><init>(Ljava/lang/String;)V

    .line 76
    .line 77
    .line 78
    throw v0

    .line 79
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final d(I)Ljava/lang/String;
    .locals 1

    .line 1
    iget v0, p0, Lk5/s;->g:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    const/4 v0, -0x1

    .line 7
    if-ne p1, v0, :cond_0

    .line 8
    .line 9
    const/4 p1, 0x0

    .line 10
    goto :goto_0

    .line 11
    :cond_0
    invoke-virtual {p0, p1}, Lk5/s;->b(I)Ljava/lang/String;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    :goto_0
    return-object p1

    .line 16
    :pswitch_0
    const/4 v0, -0x1

    .line 17
    if-ne p1, v0, :cond_1

    .line 18
    .line 19
    const/4 p1, 0x0

    .line 20
    goto :goto_1

    .line 21
    :cond_1
    invoke-virtual {p0, p1}, Lk5/s;->b(I)Ljava/lang/String;

    .line 22
    .line 23
    .line 24
    move-result-object p1

    .line 25
    :goto_1
    return-object p1

    .line 26
    nop

    .line 27
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final bridge synthetic get(I)Ljava/lang/Object;
    .locals 1

    .line 1
    iget v0, p0, Lk5/s;->g:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0, p1}, Lk5/s;->b(I)Ljava/lang/String;

    .line 7
    .line 8
    .line 9
    move-result-object p1

    .line 10
    return-object p1

    .line 11
    :pswitch_0
    invoke-virtual {p0, p1}, Lk5/s;->b(I)Ljava/lang/String;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    return-object p1

    .line 16
    nop

    .line 17
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final size()I
    .locals 1

    .line 1
    iget v0, p0, Lk5/s;->g:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lk5/s;->h:Lk5/u;

    .line 7
    .line 8
    iget v0, v0, Lk5/u;->f:I

    .line 9
    .line 10
    return v0

    .line 11
    :pswitch_0
    iget-object v0, p0, Lk5/s;->h:Lk5/u;

    .line 12
    .line 13
    iget v0, v0, Lk5/u;->d:I

    .line 14
    .line 15
    return v0

    .line 16
    nop

    .line 17
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
