.class public final Lo5/h;
.super Lo5/j;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"


# static fields
.field public static final j:Ll3/w;


# instance fields
.field public final g:Lk5/u;

.field public final h:I

.field public final i:Lac/k;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Ll3/w;

    .line 2
    .line 3
    const/16 v1, 0xa

    .line 4
    .line 5
    invoke-direct {v0, v1}, Ll3/w;-><init>(I)V

    .line 6
    .line 7
    .line 8
    sput-object v0, Lo5/h;->j:Ll3/w;

    .line 9
    .line 10
    return-void
.end method

.method public constructor <init>(Lk5/u;ILac/k;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lo5/h;->g:Lk5/u;

    .line 5
    .line 6
    iput p2, p0, Lo5/h;->h:I

    .line 7
    .line 8
    iput-object p3, p0, Lo5/h;->i:Lac/k;

    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public final bridge synthetic a()Ljava/util/Iterator;
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    invoke-virtual {p0, v0}, Lo5/h;->b(La5/a;)Lo5/g;

    .line 3
    .line 4
    .line 5
    move-result-object v0

    .line 6
    return-object v0
.end method

.method public final b(La5/a;)Lo5/g;
    .locals 3

    .line 1
    if-nez p1, :cond_0

    .line 2
    .line 3
    iget-object p1, p0, Lo5/h;->g:Lk5/u;

    .line 4
    .line 5
    iget-object p1, p1, Lk5/u;->b:Landroidx/lifecycle/x;

    .line 6
    .line 7
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    new-instance v0, La5/a;

    .line 11
    .line 12
    const/4 v1, 0x5

    .line 13
    iget v2, p0, Lo5/h;->h:I

    .line 14
    .line 15
    invoke-direct {v0, v2, v1, p1}, La5/a;-><init>(IILjava/lang/Object;)V

    .line 16
    .line 17
    .line 18
    invoke-virtual {v0}, La5/a;->q()V

    .line 19
    .line 20
    .line 21
    move-object p1, v0

    .line 22
    :cond_0
    const/4 v0, 0x0

    .line 23
    invoke-virtual {p1, v0}, La5/a;->o(Z)I

    .line 24
    .line 25
    .line 26
    move-result v0

    .line 27
    new-instance v1, Lo5/g;

    .line 28
    .line 29
    invoke-direct {v1, p0, p1, v0}, Lo5/g;-><init>(Lo5/h;La5/a;I)V

    .line 30
    .line 31
    .line 32
    return-object v1
.end method

.method public final iterator()Ljava/util/Iterator;
    .locals 18

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    iget-object v0, v1, Lo5/h;->i:Lac/k;

    .line 4
    .line 5
    iget-object v2, v0, Lac/k;->j:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast v2, Lk5/z;

    .line 8
    .line 9
    iget-object v3, v1, Lo5/h;->g:Lk5/u;

    .line 10
    .line 11
    iget-object v4, v3, Lk5/u;->b:Landroidx/lifecycle/x;

    .line 12
    .line 13
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 14
    .line 15
    .line 16
    new-instance v5, La5/a;

    .line 17
    .line 18
    const/4 v6, 0x5

    .line 19
    iget v7, v1, Lo5/h;->h:I

    .line 20
    .line 21
    invoke-direct {v5, v7, v6, v4}, La5/a;-><init>(IILjava/lang/Object;)V

    .line 22
    .line 23
    .line 24
    iget-object v4, v4, Landroidx/lifecycle/x;->h:Ljava/lang/Object;

    .line 25
    .line 26
    check-cast v4, [B

    .line 27
    .line 28
    add-int/lit8 v6, v7, 0x1

    .line 29
    .line 30
    aget-byte v8, v4, v7

    .line 31
    .line 32
    and-int/lit16 v9, v8, 0xff

    .line 33
    .line 34
    const/4 v10, 0x0

    .line 35
    const/16 v11, 0x7f

    .line 36
    .line 37
    if-le v9, v11, :cond_1

    .line 38
    .line 39
    add-int/lit8 v9, v7, 0x2

    .line 40
    .line 41
    aget-byte v6, v4, v6

    .line 42
    .line 43
    and-int/lit16 v12, v6, 0xff

    .line 44
    .line 45
    and-int/2addr v8, v11

    .line 46
    and-int/2addr v6, v11

    .line 47
    shl-int/lit8 v6, v6, 0x7

    .line 48
    .line 49
    or-int/2addr v6, v8

    .line 50
    if-le v12, v11, :cond_3

    .line 51
    .line 52
    add-int/lit8 v8, v7, 0x3

    .line 53
    .line 54
    aget-byte v9, v4, v9

    .line 55
    .line 56
    and-int/lit16 v12, v9, 0xff

    .line 57
    .line 58
    and-int/2addr v9, v11

    .line 59
    shl-int/lit8 v9, v9, 0xe

    .line 60
    .line 61
    or-int/2addr v9, v6

    .line 62
    if-le v12, v11, :cond_0

    .line 63
    .line 64
    add-int/lit8 v6, v7, 0x4

    .line 65
    .line 66
    aget-byte v8, v4, v8

    .line 67
    .line 68
    and-int/lit16 v12, v8, 0xff

    .line 69
    .line 70
    and-int/2addr v8, v11

    .line 71
    shl-int/lit8 v8, v8, 0x15

    .line 72
    .line 73
    or-int/2addr v9, v8

    .line 74
    if-le v12, v11, :cond_1

    .line 75
    .line 76
    add-int/lit8 v8, v7, 0x5

    .line 77
    .line 78
    aget-byte v4, v4, v6

    .line 79
    .line 80
    if-ltz v4, :cond_2

    .line 81
    .line 82
    shl-int/lit8 v4, v4, 0x1c

    .line 83
    .line 84
    or-int/2addr v9, v4

    .line 85
    :cond_0
    move v6, v8

    .line 86
    :cond_1
    move v4, v9

    .line 87
    goto :goto_0

    .line 88
    :cond_2
    new-instance v0, Ld6/f;

    .line 89
    .line 90
    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 91
    .line 92
    .line 93
    move-result-object v2

    .line 94
    filled-new-array {v2}, [Ljava/lang/Object;

    .line 95
    .line 96
    .line 97
    move-result-object v2

    .line 98
    const-string v3, "Invalid uleb128 integer encountered at offset 0x%x"

    .line 99
    .line 100
    invoke-direct {v0, v10, v3, v2}, Ld6/f;-><init>(Ljava/lang/Exception;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 101
    .line 102
    .line 103
    throw v0

    .line 104
    :cond_3
    move v4, v6

    .line 105
    move v6, v9

    .line 106
    :goto_0
    iput v6, v5, La5/a;->h:I

    .line 107
    .line 108
    invoke-virtual {v0}, Lac/k;->t()I

    .line 109
    .line 110
    .line 111
    move-result v6

    .line 112
    iget-object v7, v0, Lac/k;->i:Ljava/lang/Object;

    .line 113
    .line 114
    check-cast v7, Lk5/u;

    .line 115
    .line 116
    iget-object v7, v7, Lk5/u;->b:Landroidx/lifecycle/x;

    .line 117
    .line 118
    iget v8, v0, Lac/k;->h:I

    .line 119
    .line 120
    add-int/lit8 v8, v8, 0xc

    .line 121
    .line 122
    invoke-virtual {v7, v8}, Landroidx/lifecycle/x;->N(I)I

    .line 123
    .line 124
    .line 125
    move-result v7

    .line 126
    invoke-virtual {v0}, Lac/k;->p()Lk5/b0;

    .line 127
    .line 128
    .line 129
    move-result-object v0

    .line 130
    invoke-virtual {v0}, Lk5/b0;->iterator()Ljava/util/Iterator;

    .line 131
    .line 132
    .line 133
    move-result-object v0

    .line 134
    :goto_1
    move-object v8, v0

    .line 135
    check-cast v8, Lo5/t;

    .line 136
    .line 137
    invoke-virtual {v8}, Lo5/t;->next()Ljava/lang/Object;

    .line 138
    .line 139
    .line 140
    move-result-object v9

    .line 141
    invoke-virtual {v8}, Lo5/t;->hasNext()Z

    .line 142
    .line 143
    .line 144
    move-result v8

    .line 145
    if-nez v8, :cond_c

    .line 146
    .line 147
    check-cast v9, Lt5/d;

    .line 148
    .line 149
    invoke-interface {v9}, Lt5/d;->c()I

    .line 150
    .line 151
    .line 152
    move-result v0

    .line 153
    sub-int/2addr v7, v0

    .line 154
    new-array v0, v6, [Ls5/a;

    .line 155
    .line 156
    sget-object v8, Lo5/h;->j:Ll3/w;

    .line 157
    .line 158
    invoke-static {v0, v8}, Ljava/util/Arrays;->fill([Ljava/lang/Object;Ljava/lang/Object;)V

    .line 159
    .line 160
    .line 161
    invoke-virtual {v2}, Lk5/z;->g1()Ljava/util/List;

    .line 162
    .line 163
    .line 164
    move-result-object v9

    .line 165
    iget-object v11, v2, Lk5/z;->j:Lk5/u;

    .line 166
    .line 167
    iget v12, v2, Lk5/z;->n:I

    .line 168
    .line 169
    if-lez v12, :cond_4

    .line 170
    .line 171
    iget-object v13, v11, Lk5/u;->b:Landroidx/lifecycle/x;

    .line 172
    .line 173
    invoke-virtual {v13, v12}, Landroidx/lifecycle/x;->N(I)I

    .line 174
    .line 175
    .line 176
    move-result v13

    .line 177
    new-instance v14, Lk5/y;

    .line 178
    .line 179
    const/4 v15, 0x3

    .line 180
    invoke-direct {v14, v11, v12, v13, v15}, Lk5/y;-><init>(Ljava/lang/Object;III)V

    .line 181
    .line 182
    .line 183
    goto :goto_2

    .line 184
    :cond_4
    sget-object v14, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    .line 185
    .line 186
    :goto_2
    invoke-virtual {v1, v5}, Lo5/h;->b(La5/a;)Lo5/g;

    .line 187
    .line 188
    .line 189
    move-result-object v11

    .line 190
    invoke-interface {v9}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 191
    .line 192
    .line 193
    move-result-object v9

    .line 194
    invoke-interface {v14}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 195
    .line 196
    .line 197
    move-result-object v12

    .line 198
    sget-object v13, Lf5/a;->l:Lf5/a;

    .line 199
    .line 200
    iget v2, v2, Lk5/z;->l:I

    .line 201
    .line 202
    invoke-virtual {v13, v2}, Lf5/a;->a(I)Z

    .line 203
    .line 204
    .line 205
    move-result v2

    .line 206
    const/4 v14, 0x0

    .line 207
    if-nez v2, :cond_5

    .line 208
    .line 209
    new-instance v2, Lm/a;

    .line 210
    .line 211
    const/16 v15, 0x8

    .line 212
    .line 213
    invoke-direct {v2, v1, v15}, Lm/a;-><init>(Ljava/lang/Object;I)V

    .line 214
    .line 215
    .line 216
    aput-object v2, v0, v14

    .line 217
    .line 218
    const/4 v14, 0x1

    .line 219
    :cond_5
    :goto_3
    invoke-interface {v9}, Ljava/util/Iterator;->hasNext()Z

    .line 220
    .line 221
    .line 222
    move-result v2

    .line 223
    if-eqz v2, :cond_8

    .line 224
    .line 225
    add-int/lit8 v2, v14, 0x1

    .line 226
    .line 227
    invoke-interface {v9}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 228
    .line 229
    .line 230
    move-result-object v15

    .line 231
    check-cast v15, Ljava/lang/CharSequence;

    .line 232
    .line 233
    invoke-interface {v15}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    .line 234
    .line 235
    .line 236
    move-result-object v15

    .line 237
    invoke-interface {v12}, Ljava/util/Iterator;->hasNext()Z

    .line 238
    .line 239
    .line 240
    move-result v16

    .line 241
    if-eqz v16, :cond_6

    .line 242
    .line 243
    invoke-interface {v12}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 244
    .line 245
    .line 246
    move-result-object v16

    .line 247
    check-cast v16, Ljava/util/Set;

    .line 248
    .line 249
    :goto_4
    move-object/from16 v10, v16

    .line 250
    .line 251
    goto :goto_5

    .line 252
    :cond_6
    sget-object v16, Ljava/util/Collections;->EMPTY_SET:Ljava/util/Set;

    .line 253
    .line 254
    goto :goto_4

    .line 255
    :goto_5
    invoke-interface {v11}, Ljava/util/Iterator;->hasNext()Z

    .line 256
    .line 257
    .line 258
    move-result v16

    .line 259
    if-eqz v16, :cond_7

    .line 260
    .line 261
    invoke-interface {v11}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 262
    .line 263
    .line 264
    move-result-object v16

    .line 265
    check-cast v16, Ljava/lang/String;

    .line 266
    .line 267
    move-object/from16 v13, v16

    .line 268
    .line 269
    :goto_6
    move-object/from16 v17, v0

    .line 270
    .line 271
    const/16 v16, 0x1

    .line 272
    .line 273
    goto :goto_7

    .line 274
    :cond_7
    const/4 v13, 0x0

    .line 275
    goto :goto_6

    .line 276
    :goto_7
    new-instance v0, Lo5/p;

    .line 277
    .line 278
    invoke-direct {v0, v13, v15, v10}, Lo5/p;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/util/Set;)V

    .line 279
    .line 280
    .line 281
    aput-object v0, v17, v14

    .line 282
    .line 283
    move v14, v2

    .line 284
    move-object/from16 v0, v17

    .line 285
    .line 286
    const/4 v10, 0x0

    .line 287
    goto :goto_3

    .line 288
    :cond_8
    move-object/from16 v17, v0

    .line 289
    .line 290
    const/16 v16, 0x1

    .line 291
    .line 292
    if-ge v14, v6, :cond_b

    .line 293
    .line 294
    add-int/lit8 v6, v6, -0x1

    .line 295
    .line 296
    :goto_8
    const/4 v0, -0x1

    .line 297
    add-int/2addr v14, v0

    .line 298
    if-le v14, v0, :cond_b

    .line 299
    .line 300
    aget-object v2, v17, v14

    .line 301
    .line 302
    invoke-interface {v2}, Ls5/a;->getType()Ljava/lang/String;

    .line 303
    .line 304
    .line 305
    move-result-object v9

    .line 306
    if-eqz v9, :cond_a

    .line 307
    .line 308
    const-string v10, "J"

    .line 309
    .line 310
    invoke-virtual {v9, v10}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 311
    .line 312
    .line 313
    move-result v10

    .line 314
    if-nez v10, :cond_9

    .line 315
    .line 316
    const-string v10, "D"

    .line 317
    .line 318
    invoke-virtual {v9, v10}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 319
    .line 320
    .line 321
    move-result v9

    .line 322
    if-eqz v9, :cond_a

    .line 323
    .line 324
    :cond_9
    add-int/lit8 v6, v6, -0x1

    .line 325
    .line 326
    if-ne v6, v14, :cond_a

    .line 327
    .line 328
    goto :goto_9

    .line 329
    :cond_a
    aput-object v2, v17, v6

    .line 330
    .line 331
    aput-object v8, v17, v14

    .line 332
    .line 333
    add-int/2addr v6, v0

    .line 334
    goto :goto_8

    .line 335
    :cond_b
    :goto_9
    new-instance v0, Lo5/f;

    .line 336
    .line 337
    iget-object v2, v3, Lk5/u;->b:Landroidx/lifecycle/x;

    .line 338
    .line 339
    iget v3, v5, La5/a;->h:I

    .line 340
    .line 341
    move v5, v7

    .line 342
    move-object/from16 v6, v17

    .line 343
    .line 344
    invoke-direct/range {v0 .. v6}, Lo5/f;-><init>(Lo5/h;Landroidx/lifecycle/x;III[Ls5/a;)V

    .line 345
    .line 346
    .line 347
    return-object v0

    .line 348
    :cond_c
    move-object/from16 v1, p0

    .line 349
    .line 350
    goto/16 :goto_1
.end method
