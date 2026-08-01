.class public final Lb5;
.super Ljava/lang/Object;
.source "r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6"

# interfaces
.implements Lxd0;


# static fields
.field public static final b:Lb5;

.field public static final c:Lb5;

.field public static final d:Lb5;

.field public static final e:Lpn;

.field public static final f:Lb5;

.field public static final g:Lb5;


# instance fields
.field public final synthetic a:I


# direct methods
.method static synthetic constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Lb5;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, v1}, Lb5;-><init>(I)V

    .line 5
    .line 6
    .line 7
    sput-object v0, Lb5;->b:Lb5;

    .line 8
    .line 9
    new-instance v0, Lb5;

    .line 10
    .line 11
    const/4 v1, 0x1

    .line 12
    invoke-direct {v0, v1}, Lb5;-><init>(I)V

    .line 13
    .line 14
    .line 15
    sput-object v0, Lb5;->c:Lb5;

    .line 16
    .line 17
    new-instance v0, Lb5;

    .line 18
    .line 19
    const/4 v1, 0x2

    .line 20
    invoke-direct {v0, v1}, Lb5;-><init>(I)V

    .line 21
    .line 22
    .line 23
    sput-object v0, Lb5;->d:Lb5;

    .line 24
    .line 25
    new-instance v0, Lpn;

    .line 26
    .line 27
    const/16 v1, 0x19

    .line 28
    .line 29
    invoke-direct {v0, v1}, Lpn;-><init>(I)V

    .line 30
    .line 31
    .line 32
    sput-object v0, Lb5;->e:Lpn;

    .line 33
    .line 34
    new-instance v0, Lb5;

    .line 35
    .line 36
    const/4 v1, 0x3

    .line 37
    invoke-direct {v0, v1}, Lb5;-><init>(I)V

    .line 38
    .line 39
    .line 40
    sput-object v0, Lb5;->f:Lb5;

    .line 41
    .line 42
    new-instance v0, Lb5;

    .line 43
    .line 44
    const/4 v1, 0x4

    .line 45
    invoke-direct {v0, v1}, Lb5;-><init>(I)V

    .line 46
    .line 47
    .line 48
    sput-object v0, Lb5;->g:Lb5;

    .line 49
    .line 50
    return-void
.end method

.method public synthetic constructor <init>(I)V
    .locals 0

    .line 1
    iput p1, p0, Lb5;->a:I

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public static final a(Ljava/util/ArrayList;Lxt0;Lzd0;Ljava/util/ArrayList;Ljava/util/ArrayList;Lxt0;Ljava/util/ArrayList;Lxt0;Lxt0;)V
    .locals 2

    .line 1
    invoke-virtual {p0}, Ljava/util/ArrayList;->isEmpty()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    iget v0, p1, Lxt0;->d:I

    .line 8
    .line 9
    const/high16 v1, 0x41400000    # 12.0f

    .line 10
    .line 11
    invoke-interface {p2, v1}, Lym;->F(F)I

    .line 12
    .line 13
    .line 14
    move-result p2

    .line 15
    add-int/2addr p2, v0

    .line 16
    iput p2, p1, Lxt0;->d:I

    .line 17
    .line 18
    :cond_0
    invoke-static {p3}, Lye;->W(Ljava/lang/Iterable;)Ljava/util/List;

    .line 19
    .line 20
    .line 21
    move-result-object p2

    .line 22
    const/4 v0, 0x0

    .line 23
    invoke-virtual {p0, v0, p2}, Ljava/util/ArrayList;->add(ILjava/lang/Object;)V

    .line 24
    .line 25
    .line 26
    iget p0, p5, Lxt0;->d:I

    .line 27
    .line 28
    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 29
    .line 30
    .line 31
    move-result-object p0

    .line 32
    invoke-virtual {p4, p0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 33
    .line 34
    .line 35
    iget p0, p1, Lxt0;->d:I

    .line 36
    .line 37
    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 38
    .line 39
    .line 40
    move-result-object p0

    .line 41
    invoke-virtual {p6, p0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 42
    .line 43
    .line 44
    iget p0, p1, Lxt0;->d:I

    .line 45
    .line 46
    iget p2, p5, Lxt0;->d:I

    .line 47
    .line 48
    add-int/2addr p0, p2

    .line 49
    iput p0, p1, Lxt0;->d:I

    .line 50
    .line 51
    iget p0, p7, Lxt0;->d:I

    .line 52
    .line 53
    iget p1, p8, Lxt0;->d:I

    .line 54
    .line 55
    invoke-static {p0, p1}, Ljava/lang/Math;->max(II)I

    .line 56
    .line 57
    .line 58
    move-result p0

    .line 59
    iput p0, p7, Lxt0;->d:I

    .line 60
    .line 61
    invoke-virtual {p3}, Ljava/util/ArrayList;->clear()V

    .line 62
    .line 63
    .line 64
    iput v0, p8, Lxt0;->d:I

    .line 65
    .line 66
    iput v0, p5, Lxt0;->d:I

    .line 67
    .line 68
    return-void
.end method


# virtual methods
.method public final g(Lzd0;Ljava/util/List;J)Lyd0;
    .locals 18

    .line 1
    move-object/from16 v2, p1

    .line 2
    .line 3
    move-object/from16 v9, p2

    .line 4
    .line 5
    move-object/from16 v0, p0

    .line 6
    .line 7
    move-wide/from16 v10, p3

    .line 8
    .line 9
    iget v0, v0, Lb5;->a:I

    .line 10
    .line 11
    const/16 v1, 0x19

    .line 12
    .line 13
    const/4 v3, 0x0

    .line 14
    sget-object v12, Lis;->d:Lis;

    .line 15
    .line 16
    packed-switch v0, :pswitch_data_0

    .line 17
    .line 18
    .line 19
    new-instance v0, Ljava/util/ArrayList;

    .line 20
    .line 21
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 22
    .line 23
    .line 24
    new-instance v4, Ljava/util/ArrayList;

    .line 25
    .line 26
    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    .line 27
    .line 28
    .line 29
    new-instance v6, Ljava/util/ArrayList;

    .line 30
    .line 31
    invoke-direct {v6}, Ljava/util/ArrayList;-><init>()V

    .line 32
    .line 33
    .line 34
    new-instance v7, Lxt0;

    .line 35
    .line 36
    invoke-direct {v7}, Ljava/lang/Object;-><init>()V

    .line 37
    .line 38
    .line 39
    new-instance v1, Lxt0;

    .line 40
    .line 41
    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    .line 42
    .line 43
    .line 44
    move v5, v3

    .line 45
    new-instance v3, Ljava/util/ArrayList;

    .line 46
    .line 47
    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    .line 48
    .line 49
    .line 50
    new-instance v8, Lxt0;

    .line 51
    .line 52
    invoke-direct {v8}, Ljava/lang/Object;-><init>()V

    .line 53
    .line 54
    .line 55
    move v13, v5

    .line 56
    new-instance v5, Lxt0;

    .line 57
    .line 58
    invoke-direct {v5}, Ljava/lang/Object;-><init>()V

    .line 59
    .line 60
    .line 61
    invoke-interface {v9}, Ljava/util/Collection;->size()I

    .line 62
    .line 63
    .line 64
    move-result v14

    .line 65
    :goto_0
    if-ge v13, v14, :cond_3

    .line 66
    .line 67
    invoke-interface {v9, v13}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 68
    .line 69
    .line 70
    move-result-object v15

    .line 71
    check-cast v15, Lsd0;

    .line 72
    .line 73
    invoke-interface {v15, v10, v11}, Lsd0;->e(J)Lxq0;

    .line 74
    .line 75
    .line 76
    move-result-object v15

    .line 77
    invoke-virtual {v3}, Ljava/util/ArrayList;->isEmpty()Z

    .line 78
    .line 79
    .line 80
    move-result v16

    .line 81
    move/from16 p0, v13

    .line 82
    .line 83
    const/high16 v13, 0x41000000    # 8.0f

    .line 84
    .line 85
    if-nez v16, :cond_1

    .line 86
    .line 87
    move-object/from16 v16, v0

    .line 88
    .line 89
    iget v0, v8, Lxt0;->d:I

    .line 90
    .line 91
    invoke-interface {v2, v13}, Lym;->F(F)I

    .line 92
    .line 93
    .line 94
    move-result v17

    .line 95
    add-int v17, v17, v0

    .line 96
    .line 97
    iget v0, v15, Lxq0;->d:I

    .line 98
    .line 99
    add-int v0, v17, v0

    .line 100
    .line 101
    invoke-static {v10, v11}, Lpj;->h(J)I

    .line 102
    .line 103
    .line 104
    move-result v13

    .line 105
    if-gt v0, v13, :cond_0

    .line 106
    .line 107
    move-object/from16 v0, v16

    .line 108
    .line 109
    goto :goto_1

    .line 110
    :cond_0
    move-object/from16 v0, v16

    .line 111
    .line 112
    invoke-static/range {v0 .. v8}, Lb5;->a(Ljava/util/ArrayList;Lxt0;Lzd0;Ljava/util/ArrayList;Ljava/util/ArrayList;Lxt0;Ljava/util/ArrayList;Lxt0;Lxt0;)V

    .line 113
    .line 114
    .line 115
    :cond_1
    :goto_1
    invoke-virtual {v3}, Ljava/util/ArrayList;->isEmpty()Z

    .line 116
    .line 117
    .line 118
    move-result v13

    .line 119
    if-nez v13, :cond_2

    .line 120
    .line 121
    iget v13, v8, Lxt0;->d:I

    .line 122
    .line 123
    move-object/from16 v16, v0

    .line 124
    .line 125
    const/high16 v0, 0x41000000    # 8.0f

    .line 126
    .line 127
    invoke-interface {v2, v0}, Lym;->F(F)I

    .line 128
    .line 129
    .line 130
    move-result v0

    .line 131
    add-int/2addr v0, v13

    .line 132
    iput v0, v8, Lxt0;->d:I

    .line 133
    .line 134
    goto :goto_2

    .line 135
    :cond_2
    move-object/from16 v16, v0

    .line 136
    .line 137
    :goto_2
    invoke-virtual {v3, v15}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 138
    .line 139
    .line 140
    iget v0, v8, Lxt0;->d:I

    .line 141
    .line 142
    iget v13, v15, Lxq0;->d:I

    .line 143
    .line 144
    add-int/2addr v0, v13

    .line 145
    iput v0, v8, Lxt0;->d:I

    .line 146
    .line 147
    iget v0, v5, Lxt0;->d:I

    .line 148
    .line 149
    iget v13, v15, Lxq0;->e:I

    .line 150
    .line 151
    invoke-static {v0, v13}, Ljava/lang/Math;->max(II)I

    .line 152
    .line 153
    .line 154
    move-result v0

    .line 155
    iput v0, v5, Lxt0;->d:I

    .line 156
    .line 157
    add-int/lit8 v13, p0, 0x1

    .line 158
    .line 159
    move-object/from16 v0, v16

    .line 160
    .line 161
    goto :goto_0

    .line 162
    :cond_3
    move-object/from16 v16, v0

    .line 163
    .line 164
    invoke-virtual {v3}, Ljava/util/ArrayList;->isEmpty()Z

    .line 165
    .line 166
    .line 167
    move-result v0

    .line 168
    if-nez v0, :cond_4

    .line 169
    .line 170
    move-object/from16 v0, v16

    .line 171
    .line 172
    invoke-static/range {v0 .. v8}, Lb5;->a(Ljava/util/ArrayList;Lxt0;Lzd0;Ljava/util/ArrayList;Ljava/util/ArrayList;Lxt0;Ljava/util/ArrayList;Lxt0;Lxt0;)V

    .line 173
    .line 174
    .line 175
    goto :goto_3

    .line 176
    :cond_4
    move-object/from16 v0, v16

    .line 177
    .line 178
    :goto_3
    iget v3, v7, Lxt0;->d:I

    .line 179
    .line 180
    invoke-static {v10, v11}, Lpj;->j(J)I

    .line 181
    .line 182
    .line 183
    move-result v4

    .line 184
    invoke-static {v3, v4}, Ljava/lang/Math;->max(II)I

    .line 185
    .line 186
    .line 187
    move-result v3

    .line 188
    iget v1, v1, Lxt0;->d:I

    .line 189
    .line 190
    invoke-static {v10, v11}, Lpj;->i(J)I

    .line 191
    .line 192
    .line 193
    move-result v4

    .line 194
    invoke-static {v1, v4}, Ljava/lang/Math;->max(II)I

    .line 195
    .line 196
    .line 197
    move-result v1

    .line 198
    new-instance v4, Lj2;

    .line 199
    .line 200
    invoke-direct {v4, v0, v2, v3, v6}, Lj2;-><init>(Ljava/util/ArrayList;Lzd0;ILjava/util/ArrayList;)V

    .line 201
    .line 202
    .line 203
    invoke-interface {v2, v3, v1, v12, v4}, Lzd0;->Q(IILjava/util/Map;Lsw;)Lyd0;

    .line 204
    .line 205
    .line 206
    move-result-object v0

    .line 207
    return-object v0

    .line 208
    :pswitch_0
    move v13, v3

    .line 209
    invoke-static {v10, v11}, Lpj;->f(J)Z

    .line 210
    .line 211
    .line 212
    move-result v0

    .line 213
    if-eqz v0, :cond_5

    .line 214
    .line 215
    invoke-static {v10, v11}, Lpj;->h(J)I

    .line 216
    .line 217
    .line 218
    move-result v0

    .line 219
    goto :goto_4

    .line 220
    :cond_5
    move v0, v13

    .line 221
    :goto_4
    invoke-static {v10, v11}, Lpj;->e(J)Z

    .line 222
    .line 223
    .line 224
    move-result v3

    .line 225
    if-eqz v3, :cond_6

    .line 226
    .line 227
    invoke-static {v10, v11}, Lpj;->g(J)I

    .line 228
    .line 229
    .line 230
    move-result v3

    .line 231
    goto :goto_5

    .line 232
    :cond_6
    move v3, v13

    .line 233
    :goto_5
    new-instance v4, Lpn;

    .line 234
    .line 235
    invoke-direct {v4, v1}, Lpn;-><init>(I)V

    .line 236
    .line 237
    .line 238
    invoke-interface {v2, v0, v3, v12, v4}, Lzd0;->Q(IILjava/util/Map;Lsw;)Lyd0;

    .line 239
    .line 240
    .line 241
    move-result-object v0

    .line 242
    return-object v0

    .line 243
    :pswitch_1
    invoke-static {v10, v11}, Lpj;->j(J)I

    .line 244
    .line 245
    .line 246
    move-result v0

    .line 247
    invoke-static {v10, v11}, Lpj;->i(J)I

    .line 248
    .line 249
    .line 250
    move-result v3

    .line 251
    new-instance v4, Lpn;

    .line 252
    .line 253
    invoke-direct {v4, v1}, Lpn;-><init>(I)V

    .line 254
    .line 255
    .line 256
    invoke-interface {v2, v0, v3, v12, v4}, Lzd0;->Q(IILjava/util/Map;Lsw;)Lyd0;

    .line 257
    .line 258
    .line 259
    move-result-object v0

    .line 260
    return-object v0

    .line 261
    :pswitch_2
    invoke-static {v10, v11}, Lpj;->h(J)I

    .line 262
    .line 263
    .line 264
    move-result v0

    .line 265
    invoke-static {v10, v11}, Lpj;->g(J)I

    .line 266
    .line 267
    .line 268
    move-result v1

    .line 269
    sget-object v3, Lb5;->e:Lpn;

    .line 270
    .line 271
    invoke-interface {v2, v0, v1, v12, v3}, Lzd0;->Q(IILjava/util/Map;Lsw;)Lyd0;

    .line 272
    .line 273
    .line 274
    move-result-object v0

    .line 275
    return-object v0

    .line 276
    :pswitch_3
    invoke-static {v10, v11}, Lpj;->j(J)I

    .line 277
    .line 278
    .line 279
    move-result v0

    .line 280
    invoke-static {v10, v11}, Lpj;->i(J)I

    .line 281
    .line 282
    .line 283
    move-result v3

    .line 284
    new-instance v4, Lpn;

    .line 285
    .line 286
    invoke-direct {v4, v1}, Lpn;-><init>(I)V

    .line 287
    .line 288
    .line 289
    invoke-interface {v2, v0, v3, v12, v4}, Lzd0;->Q(IILjava/util/Map;Lsw;)Lyd0;

    .line 290
    .line 291
    .line 292
    move-result-object v0

    .line 293
    return-object v0

    .line 294
    :pswitch_4
    move v13, v3

    .line 295
    new-instance v0, Ljava/util/ArrayList;

    .line 296
    .line 297
    invoke-interface {v9}, Ljava/util/List;->size()I

    .line 298
    .line 299
    .line 300
    move-result v1

    .line 301
    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    .line 302
    .line 303
    .line 304
    invoke-interface {v9}, Ljava/util/Collection;->size()I

    .line 305
    .line 306
    .line 307
    move-result v1

    .line 308
    move v4, v3

    .line 309
    move v5, v4

    .line 310
    :goto_6
    if-ge v3, v1, :cond_7

    .line 311
    .line 312
    invoke-interface {v9, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 313
    .line 314
    .line 315
    move-result-object v6

    .line 316
    check-cast v6, Lsd0;

    .line 317
    .line 318
    invoke-interface {v6, v10, v11}, Lsd0;->e(J)Lxq0;

    .line 319
    .line 320
    .line 321
    move-result-object v6

    .line 322
    iget v7, v6, Lxq0;->d:I

    .line 323
    .line 324
    invoke-static {v4, v7}, Ljava/lang/Math;->max(II)I

    .line 325
    .line 326
    .line 327
    move-result v4

    .line 328
    iget v7, v6, Lxq0;->e:I

    .line 329
    .line 330
    invoke-static {v5, v7}, Ljava/lang/Math;->max(II)I

    .line 331
    .line 332
    .line 333
    move-result v5

    .line 334
    invoke-virtual {v0, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 335
    .line 336
    .line 337
    add-int/lit8 v3, v3, 0x1

    .line 338
    .line 339
    goto :goto_6

    .line 340
    :cond_7
    invoke-interface {v9}, Ljava/util/List;->isEmpty()Z

    .line 341
    .line 342
    .line 343
    move-result v1

    .line 344
    if-eqz v1, :cond_8

    .line 345
    .line 346
    invoke-static {v10, v11}, Lpj;->j(J)I

    .line 347
    .line 348
    .line 349
    move-result v4

    .line 350
    invoke-static {v10, v11}, Lpj;->i(J)I

    .line 351
    .line 352
    .line 353
    move-result v5

    .line 354
    :cond_8
    new-instance v1, La5;

    .line 355
    .line 356
    invoke-direct {v1, v13, v0}, La5;-><init>(ILjava/util/ArrayList;)V

    .line 357
    .line 358
    .line 359
    invoke-interface {v2, v4, v5, v12, v1}, Lzd0;->Q(IILjava/util/Map;Lsw;)Lyd0;

    .line 360
    .line 361
    .line 362
    move-result-object v0

    .line 363
    return-object v0

    .line 364
    nop

    .line 365
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
