.class public final Lo5/f;
.super Lo5/t;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"


# instance fields
.field public j:I

.field public k:I

.field public final synthetic l:I

.field public final synthetic m:[Ls5/a;

.field public final synthetic n:Lo5/h;


# direct methods
.method public constructor <init>(Lo5/h;Landroidx/lifecycle/x;III[Ls5/a;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lo5/f;->n:Lo5/h;

    .line 2
    .line 3
    iput p5, p0, Lo5/f;->l:I

    .line 4
    .line 5
    iput-object p6, p0, Lo5/f;->m:[Ls5/a;

    .line 6
    .line 7
    invoke-direct {p0, p2, p3}, Lo5/t;-><init>(Landroidx/lifecycle/x;I)V

    .line 8
    .line 9
    .line 10
    const/4 p1, 0x0

    .line 11
    iput p1, p0, Lo5/f;->j:I

    .line 12
    .line 13
    iput p4, p0, Lo5/f;->k:I

    .line 14
    .line 15
    return-void
.end method


# virtual methods
.method public final a(La5/a;)Ljava/lang/Object;
    .locals 17

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    iget-object v2, v0, Lo5/f;->n:Lo5/h;

    .line 6
    .line 7
    iget-object v2, v2, Lo5/h;->g:Lk5/u;

    .line 8
    .line 9
    :goto_0
    iget v3, v0, Lo5/f;->j:I

    .line 10
    .line 11
    iget v4, v0, Lo5/f;->l:I

    .line 12
    .line 13
    const/4 v5, 0x0

    .line 14
    const/4 v6, 0x3

    .line 15
    if-gt v3, v4, :cond_8

    .line 16
    .line 17
    invoke-virtual {v1}, La5/a;->n()I

    .line 18
    .line 19
    .line 20
    move-result v3

    .line 21
    sget-object v7, Lo5/h;->j:Ll3/w;

    .line 22
    .line 23
    iget-object v8, v0, Lo5/f;->m:[Ls5/a;

    .line 24
    .line 25
    const/4 v9, 0x1

    .line 26
    const/4 v10, 0x0

    .line 27
    packed-switch v3, :pswitch_data_0

    .line 28
    .line 29
    .line 30
    add-int/lit8 v3, v3, -0xa

    .line 31
    .line 32
    iget v1, v0, Lo5/f;->j:I

    .line 33
    .line 34
    div-int/lit8 v2, v3, 0xf

    .line 35
    .line 36
    add-int/2addr v2, v1

    .line 37
    iput v2, v0, Lo5/f;->j:I

    .line 38
    .line 39
    iget v1, v0, Lo5/f;->k:I

    .line 40
    .line 41
    rem-int/lit8 v3, v3, 0xf

    .line 42
    .line 43
    add-int/lit8 v3, v3, -0x4

    .line 44
    .line 45
    add-int/2addr v3, v1

    .line 46
    iput v3, v0, Lo5/f;->k:I

    .line 47
    .line 48
    if-le v2, v4, :cond_0

    .line 49
    .line 50
    iput v6, v0, Lo5/t;->g:I

    .line 51
    .line 52
    return-object v5

    .line 53
    :cond_0
    new-instance v1, Lx5/d;

    .line 54
    .line 55
    invoke-direct {v1, v2, v3}, Lx5/d;-><init>(II)V

    .line 56
    .line 57
    .line 58
    return-object v1

    .line 59
    :pswitch_0
    iget-object v2, v2, Lk5/u;->r:Lk5/s;

    .line 60
    .line 61
    invoke-virtual {v1, v10}, La5/a;->o(Z)I

    .line 62
    .line 63
    .line 64
    move-result v1

    .line 65
    sub-int/2addr v1, v9

    .line 66
    invoke-virtual {v2, v1}, Lk5/s;->d(I)Ljava/lang/String;

    .line 67
    .line 68
    .line 69
    move-result-object v1

    .line 70
    new-instance v2, Lx5/f;

    .line 71
    .line 72
    iget v3, v0, Lo5/f;->j:I

    .line 73
    .line 74
    invoke-direct {v2, v3, v1}, Lx5/f;-><init>(ILjava/lang/String;)V

    .line 75
    .line 76
    .line 77
    return-object v2

    .line 78
    :pswitch_1
    new-instance v1, Lx5/c;

    .line 79
    .line 80
    iget v2, v0, Lo5/f;->j:I

    .line 81
    .line 82
    const/4 v3, 0x0

    .line 83
    invoke-direct {v1, v2, v3}, Lx5/c;-><init>(II)V

    .line 84
    .line 85
    .line 86
    return-object v1

    .line 87
    :pswitch_2
    new-instance v1, Lx5/c;

    .line 88
    .line 89
    iget v2, v0, Lo5/f;->j:I

    .line 90
    .line 91
    const/4 v3, 0x1

    .line 92
    invoke-direct {v1, v2, v3}, Lx5/c;-><init>(II)V

    .line 93
    .line 94
    .line 95
    return-object v1

    .line 96
    :pswitch_3
    invoke-virtual {v1, v10}, La5/a;->o(Z)I

    .line 97
    .line 98
    .line 99
    move-result v11

    .line 100
    if-ltz v11, :cond_1

    .line 101
    .line 102
    array-length v1, v8

    .line 103
    if-ge v11, v1, :cond_1

    .line 104
    .line 105
    aget-object v7, v8, v11

    .line 106
    .line 107
    :cond_1
    new-instance v9, Lx5/e;

    .line 108
    .line 109
    iget v10, v0, Lo5/f;->j:I

    .line 110
    .line 111
    invoke-interface {v7}, Ls5/a;->getName()Ljava/lang/String;

    .line 112
    .line 113
    .line 114
    move-result-object v12

    .line 115
    invoke-interface {v7}, Ls5/a;->getType()Ljava/lang/String;

    .line 116
    .line 117
    .line 118
    move-result-object v13

    .line 119
    invoke-interface {v7}, Ls5/a;->e()Ljava/lang/String;

    .line 120
    .line 121
    .line 122
    move-result-object v14

    .line 123
    invoke-direct/range {v9 .. v14}, Lx5/e;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 124
    .line 125
    .line 126
    if-ltz v11, :cond_2

    .line 127
    .line 128
    array-length v1, v8

    .line 129
    if-ge v11, v1, :cond_2

    .line 130
    .line 131
    aput-object v9, v8, v11

    .line 132
    .line 133
    :cond_2
    return-object v9

    .line 134
    :pswitch_4
    invoke-virtual {v1, v10}, La5/a;->o(Z)I

    .line 135
    .line 136
    .line 137
    move-result v4

    .line 138
    if-ltz v4, :cond_3

    .line 139
    .line 140
    array-length v1, v8

    .line 141
    if-ge v4, v1, :cond_3

    .line 142
    .line 143
    aget-object v1, v8, v4

    .line 144
    .line 145
    goto :goto_1

    .line 146
    :cond_3
    move-object v1, v7

    .line 147
    move v9, v10

    .line 148
    :goto_1
    instance-of v2, v1, Lx5/b;

    .line 149
    .line 150
    if-eqz v2, :cond_4

    .line 151
    .line 152
    goto :goto_2

    .line 153
    :cond_4
    move-object v7, v1

    .line 154
    move v10, v9

    .line 155
    :goto_2
    new-instance v2, Lx5/b;

    .line 156
    .line 157
    iget v3, v0, Lo5/f;->j:I

    .line 158
    .line 159
    invoke-interface {v7}, Ls5/a;->getName()Ljava/lang/String;

    .line 160
    .line 161
    .line 162
    move-result-object v5

    .line 163
    invoke-interface {v7}, Ls5/a;->getType()Ljava/lang/String;

    .line 164
    .line 165
    .line 166
    move-result-object v6

    .line 167
    invoke-interface {v7}, Ls5/a;->e()Ljava/lang/String;

    .line 168
    .line 169
    .line 170
    move-result-object v7

    .line 171
    invoke-direct/range {v2 .. v7}, Lx5/b;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 172
    .line 173
    .line 174
    if-eqz v10, :cond_5

    .line 175
    .line 176
    aput-object v2, v8, v4

    .line 177
    .line 178
    :cond_5
    return-object v2

    .line 179
    :pswitch_5
    invoke-virtual {v1, v10}, La5/a;->o(Z)I

    .line 180
    .line 181
    .line 182
    move-result v13

    .line 183
    iget-object v3, v2, Lk5/u;->r:Lk5/s;

    .line 184
    .line 185
    invoke-virtual {v1, v10}, La5/a;->o(Z)I

    .line 186
    .line 187
    .line 188
    move-result v4

    .line 189
    sub-int/2addr v4, v9

    .line 190
    invoke-virtual {v3, v4}, Lk5/s;->d(I)Ljava/lang/String;

    .line 191
    .line 192
    .line 193
    move-result-object v14

    .line 194
    iget-object v3, v2, Lk5/u;->s:Lk5/s;

    .line 195
    .line 196
    invoke-virtual {v1, v10}, La5/a;->o(Z)I

    .line 197
    .line 198
    .line 199
    move-result v4

    .line 200
    sub-int/2addr v4, v9

    .line 201
    invoke-virtual {v3, v4}, Lk5/s;->d(I)Ljava/lang/String;

    .line 202
    .line 203
    .line 204
    move-result-object v15

    .line 205
    iget-object v2, v2, Lk5/u;->r:Lk5/s;

    .line 206
    .line 207
    invoke-virtual {v1, v10}, La5/a;->o(Z)I

    .line 208
    .line 209
    .line 210
    move-result v1

    .line 211
    sub-int/2addr v1, v9

    .line 212
    invoke-virtual {v2, v1}, Lk5/s;->d(I)Ljava/lang/String;

    .line 213
    .line 214
    .line 215
    move-result-object v16

    .line 216
    new-instance v11, Lx5/g;

    .line 217
    .line 218
    iget v12, v0, Lo5/f;->j:I

    .line 219
    .line 220
    invoke-direct/range {v11 .. v16}, Lx5/g;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 221
    .line 222
    .line 223
    if-ltz v13, :cond_6

    .line 224
    .line 225
    array-length v1, v8

    .line 226
    if-ge v13, v1, :cond_6

    .line 227
    .line 228
    aput-object v11, v8, v13

    .line 229
    .line 230
    :cond_6
    return-object v11

    .line 231
    :pswitch_6
    invoke-virtual {v1, v10}, La5/a;->o(Z)I

    .line 232
    .line 233
    .line 234
    move-result v4

    .line 235
    iget-object v3, v2, Lk5/u;->r:Lk5/s;

    .line 236
    .line 237
    invoke-virtual {v1, v10}, La5/a;->o(Z)I

    .line 238
    .line 239
    .line 240
    move-result v5

    .line 241
    sub-int/2addr v5, v9

    .line 242
    invoke-virtual {v3, v5}, Lk5/s;->d(I)Ljava/lang/String;

    .line 243
    .line 244
    .line 245
    move-result-object v5

    .line 246
    iget-object v2, v2, Lk5/u;->s:Lk5/s;

    .line 247
    .line 248
    invoke-virtual {v1, v10}, La5/a;->o(Z)I

    .line 249
    .line 250
    .line 251
    move-result v1

    .line 252
    sub-int/2addr v1, v9

    .line 253
    invoke-virtual {v2, v1}, Lk5/s;->d(I)Ljava/lang/String;

    .line 254
    .line 255
    .line 256
    move-result-object v6

    .line 257
    new-instance v2, Lx5/g;

    .line 258
    .line 259
    iget v3, v0, Lo5/f;->j:I

    .line 260
    .line 261
    const/4 v7, 0x0

    .line 262
    invoke-direct/range {v2 .. v7}, Lx5/g;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 263
    .line 264
    .line 265
    if-ltz v4, :cond_7

    .line 266
    .line 267
    array-length v1, v8

    .line 268
    if-ge v4, v1, :cond_7

    .line 269
    .line 270
    aput-object v2, v8, v4

    .line 271
    .line 272
    :cond_7
    return-object v2

    .line 273
    :pswitch_7
    invoke-virtual {v1}, La5/a;->m()I

    .line 274
    .line 275
    .line 276
    move-result v3

    .line 277
    iget v4, v0, Lo5/f;->k:I

    .line 278
    .line 279
    add-int/2addr v4, v3

    .line 280
    iput v4, v0, Lo5/f;->k:I

    .line 281
    .line 282
    goto/16 :goto_0

    .line 283
    .line 284
    :pswitch_8
    invoke-virtual {v1, v10}, La5/a;->o(Z)I

    .line 285
    .line 286
    .line 287
    move-result v3

    .line 288
    iget v4, v0, Lo5/f;->j:I

    .line 289
    .line 290
    add-int/2addr v4, v3

    .line 291
    iput v4, v0, Lo5/f;->j:I

    .line 292
    .line 293
    goto/16 :goto_0

    .line 294
    .line 295
    :pswitch_9
    iput v6, v0, Lo5/t;->g:I

    .line 296
    .line 297
    return-object v5

    .line 298
    :cond_8
    iput v6, v0, Lo5/t;->g:I

    .line 299
    .line 300
    return-object v5

    .line 301
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
