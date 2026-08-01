.class public final synthetic Ltop/suzhelan/qstory/hook/item/chat/飘花落叶言子楪苏哲世兰;
.super Ljava/lang/Object;
.source "r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776"

# interfaces
.implements L飘花落叶言世哲兰苏楪子/飘花落叶言子楪世兰苏哲;


# instance fields
.field public final synthetic 飘花落叶言子楪哲苏兰世:I


# direct methods
.method public synthetic constructor <init>(I)V
    .locals 0

    .line 1
    iput p1, p0, Ltop/suzhelan/qstory/hook/item/chat/飘花落叶言子楪苏哲世兰;->飘花落叶言子楪哲苏兰世:I

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public synthetic constructor <init>(L飘花落叶言世哲兰苏楪子/飘花落叶言子楪世兰哲苏;I)V
    .locals 0

    .line 7
    iput p2, p0, Ltop/suzhelan/qstory/hook/item/chat/飘花落叶言子楪苏哲世兰;->飘花落叶言子楪哲苏兰世:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final 飘花落叶言子楪世苏哲兰(Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;)V
    .locals 20

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    iget v0, v0, Ltop/suzhelan/qstory/hook/item/chat/飘花落叶言子楪苏哲世兰;->飘花落叶言子楪哲苏兰世:I

    .line 6
    .line 7
    const-wide v2, -0x36a5b26b051405a7L    # -2.3463108660044496E45

    .line 8
    .line 9
    .line 10
    .line 11
    .line 12
    const-wide v4, -0x36a5d637051405a7L    # -2.3338374755625957E45

    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    const/4 v6, 0x0

    .line 18
    const/4 v7, 0x0

    .line 19
    const/4 v8, 0x2

    .line 20
    packed-switch v0, :pswitch_data_0

    .line 21
    .line 22
    .line 23
    invoke-virtual {v1, v7}, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->setResult(Ljava/lang/Object;)V

    .line 24
    .line 25
    .line 26
    return-void

    .line 27
    :pswitch_0
    iget-object v0, v1, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->args:[Ljava/lang/Object;

    .line 28
    .line 29
    aget-object v0, v0, v8

    .line 30
    .line 31
    const-wide v1, -0x36a5de87051405a7L    # -2.3309409920553647E45

    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    invoke-static {v1, v2}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 37
    .line 38
    .line 39
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 40
    .line 41
    .line 42
    check-cast v0, Ljava/util/ArrayList;

    .line 43
    .line 44
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 45
    .line 46
    .line 47
    move-result-object v0

    .line 48
    const-wide v1, -0x36a57fc1051405a7L    # -2.363964715200308E45

    .line 49
    .line 50
    .line 51
    .line 52
    .line 53
    invoke-static {v1, v2}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 54
    .line 55
    .line 56
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 57
    .line 58
    .line 59
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 60
    .line 61
    .line 62
    move-result v1

    .line 63
    if-eqz v1, :cond_11

    .line 64
    .line 65
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 66
    .line 67
    .line 68
    move-result-object v1

    .line 69
    const-wide v2, -0x36a50919051405a7L    # -2.4053103839106696E45

    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    invoke-static {v2, v3}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 75
    .line 76
    .line 77
    move-result-object v2

    .line 78
    sget-object v3, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    .line 79
    .line 80
    invoke-static {v3, v2, v1}, L飘花落叶言苏楪哲兰子世/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪苏世兰哲(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/Object;

    .line 81
    .line 82
    .line 83
    move-result-object v2

    .line 84
    const-wide v4, -0x36a59e9e051405a7L    # -2.3532104312761386E45

    .line 85
    .line 86
    .line 87
    .line 88
    .line 89
    invoke-static {v4, v5}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 90
    .line 91
    .line 92
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 93
    .line 94
    .line 95
    check-cast v2, Ljava/lang/Number;

    .line 96
    .line 97
    invoke-virtual {v2}, Ljava/lang/Number;->intValue()I

    .line 98
    .line 99
    .line 100
    move-result v2

    .line 101
    const/4 v4, 0x1

    .line 102
    if-eq v2, v4, :cond_0

    .line 103
    .line 104
    goto :goto_0

    .line 105
    :cond_0
    sget v2, L飘花落叶言苏楪哲兰子世/飘花落叶言子楪苏哲世兰;->飘花落叶言子楪苏兰哲世:I

    .line 106
    .line 107
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 108
    .line 109
    .line 110
    move-result-object v2

    .line 111
    invoke-static {v2}, L飘花落叶言苏楪哲兰子世/飘花落叶言子楪苏哲世兰;->飘花落叶言子楪苏世哲兰(Ljava/lang/Class;)L飘花落叶言苏楪哲兰子世/飘花落叶言子楪苏哲世兰;

    .line 112
    .line 113
    .line 114
    move-result-object v2

    .line 115
    const-wide v9, -0x36a5090d051405a7L    # -2.4053267174642818E45

    .line 116
    .line 117
    .line 118
    .line 119
    .line 120
    invoke-static {v9, v10}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 121
    .line 122
    .line 123
    move-result-object v5

    .line 124
    iput-object v5, v2, L飘花落叶言苏楪哲兰子世/飘花落叶言子楪苏哲世兰;->飘花落叶言子楪苏世兰哲:Ljava/lang/String;

    .line 125
    .line 126
    new-array v5, v6, [Ljava/lang/Object;

    .line 127
    .line 128
    invoke-virtual {v2, v1, v5}, L飘花落叶言苏楪哲兰子世/飘花落叶言子楪苏哲世兰;->飘花落叶言子楪世兰哲苏(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 129
    .line 130
    .line 131
    move-result-object v1

    .line 132
    const-wide v9, -0x36a50b25051405a7L    # -2.4045971520696033E45

    .line 133
    .line 134
    .line 135
    .line 136
    .line 137
    invoke-static {v9, v10}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 138
    .line 139
    .line 140
    move-result-object v2

    .line 141
    invoke-static {v3, v2, v1}, L飘花落叶言苏楪哲兰子世/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪苏世兰哲(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/Object;

    .line 142
    .line 143
    .line 144
    move-result-object v2

    .line 145
    check-cast v2, Ljava/lang/Integer;

    .line 146
    .line 147
    if-nez v2, :cond_1

    .line 148
    .line 149
    goto :goto_1

    .line 150
    :cond_1
    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    .line 151
    .line 152
    .line 153
    move-result v2

    .line 154
    if-ne v2, v8, :cond_2

    .line 155
    .line 156
    goto :goto_0

    .line 157
    :cond_2
    :goto_1
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 158
    .line 159
    .line 160
    move-result-object v2

    .line 161
    invoke-static {v2}, L飘花落叶言苏楪哲兰子世/飘花落叶言子楪苏哲世兰;->飘花落叶言子楪苏世哲兰(Ljava/lang/Class;)L飘花落叶言苏楪哲兰子世/飘花落叶言子楪苏哲世兰;

    .line 162
    .line 163
    .line 164
    move-result-object v2

    .line 165
    const-wide v9, -0x36a508fc051405a7L    # -2.4053498566652324E45

    .line 166
    .line 167
    .line 168
    .line 169
    .line 170
    invoke-static {v9, v10}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 171
    .line 172
    .line 173
    move-result-object v3

    .line 174
    iput-object v3, v2, L飘花落叶言苏楪哲兰子世/飘花落叶言子楪苏哲世兰;->飘花落叶言子楪苏世兰哲:Ljava/lang/String;

    .line 175
    .line 176
    const-class v3, Ljava/lang/String;

    .line 177
    .line 178
    iput-object v3, v2, L飘花落叶言苏楪哲兰子世/飘花落叶言子楪苏哲世兰;->飘花落叶言子楪苏哲世兰:Ljava/lang/Class;

    .line 179
    .line 180
    new-array v3, v6, [Ljava/lang/Object;

    .line 181
    .line 182
    invoke-virtual {v2, v1, v3}, L飘花落叶言苏楪哲兰子世/飘花落叶言子楪苏哲世兰;->飘花落叶言子楪世兰哲苏(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 183
    .line 184
    .line 185
    move-result-object v2

    .line 186
    check-cast v2, Ljava/lang/String;

    .line 187
    .line 188
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 189
    .line 190
    .line 191
    move-result-object v3

    .line 192
    invoke-static {v3}, L飘花落叶言苏楪哲兰子世/飘花落叶言子楪苏哲世兰;->飘花落叶言子楪苏世哲兰(Ljava/lang/Class;)L飘花落叶言苏楪哲兰子世/飘花落叶言子楪苏哲世兰;

    .line 193
    .line 194
    .line 195
    move-result-object v3

    .line 196
    const-wide v9, -0x36a52321051405a7L    # -2.396239817138025E45

    .line 197
    .line 198
    .line 199
    .line 200
    .line 201
    invoke-static {v9, v10}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 202
    .line 203
    .line 204
    move-result-object v5

    .line 205
    iput-object v5, v3, L飘花落叶言苏楪哲兰子世/飘花落叶言子楪苏哲世兰;->飘花落叶言子楪苏世兰哲:Ljava/lang/String;

    .line 206
    .line 207
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 208
    .line 209
    .line 210
    invoke-virtual {v2}, Ljava/lang/String;->length()I

    .line 211
    .line 212
    .line 213
    move-result v5

    .line 214
    if-nez v5, :cond_3

    .line 215
    .line 216
    goto/16 :goto_9

    .line 217
    .line 218
    :cond_3
    new-instance v5, Ljava/lang/StringBuilder;

    .line 219
    .line 220
    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    .line 221
    .line 222
    .line 223
    invoke-virtual {v2}, Ljava/lang/String;->toCharArray()[C

    .line 224
    .line 225
    .line 226
    move-result-object v2

    .line 227
    const-wide v9, -0x36a5dec4051405a7L    # -2.330857963157836E45

    .line 228
    .line 229
    .line 230
    .line 231
    .line 232
    invoke-static {v9, v10}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 233
    .line 234
    .line 235
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 236
    .line 237
    .line 238
    aget-char v7, v2, v6

    .line 239
    .line 240
    invoke-static {v7}, Ltop/suzhelan/qstory/hook/item/chat/飘花落叶言子世哲楪兰苏;->飘花落叶言子楪苏兰世哲(C)Z

    .line 241
    .line 242
    .line 243
    move-result v7

    .line 244
    if-nez v7, :cond_5

    .line 245
    .line 246
    aget-char v7, v2, v6

    .line 247
    .line 248
    invoke-static {v7}, Ltop/suzhelan/qstory/hook/item/chat/飘花落叶言子世哲楪兰苏;->飘花落叶言子楪苏哲兰世(C)Z

    .line 249
    .line 250
    .line 251
    move-result v7

    .line 252
    if-eqz v7, :cond_4

    .line 253
    .line 254
    goto :goto_2

    .line 255
    :cond_4
    move v7, v6

    .line 256
    goto :goto_3

    .line 257
    :cond_5
    :goto_2
    move v7, v4

    .line 258
    :goto_3
    aget-char v9, v2, v6

    .line 259
    .line 260
    invoke-static {v9}, Ltop/suzhelan/qstory/hook/item/chat/飘花落叶言子世哲楪兰苏;->飘花落叶言子楪苏哲兰世(C)Z

    .line 261
    .line 262
    .line 263
    move-result v9

    .line 264
    const v10, 0xfff0

    .line 265
    .line 266
    .line 267
    const v11, 0xff00

    .line 268
    .line 269
    .line 270
    const/16 v12, 0x3040

    .line 271
    .line 272
    const/16 v13, 0x3000

    .line 273
    .line 274
    if-nez v9, :cond_8

    .line 275
    .line 276
    aget-char v9, v2, v6

    .line 277
    .line 278
    if-gt v13, v9, :cond_6

    .line 279
    .line 280
    if-ge v9, v12, :cond_6

    .line 281
    .line 282
    goto :goto_4

    .line 283
    :cond_6
    if-gt v11, v9, :cond_7

    .line 284
    .line 285
    if-ge v9, v10, :cond_7

    .line 286
    .line 287
    goto :goto_4

    .line 288
    :cond_7
    move v9, v6

    .line 289
    goto :goto_5

    .line 290
    :cond_8
    :goto_4
    move v9, v4

    .line 291
    :goto_5
    array-length v14, v2

    .line 292
    move v15, v6

    .line 293
    :goto_6
    const-wide v16, -0x36a556b5051405a7L    # -2.3782674636467288E45

    .line 294
    .line 295
    .line 296
    .line 297
    .line 298
    if-ge v15, v14, :cond_10

    .line 299
    .line 300
    aget-char v4, v2, v15

    .line 301
    .line 302
    invoke-static {v4}, Ltop/suzhelan/qstory/hook/item/chat/飘花落叶言子世哲楪兰苏;->飘花落叶言子楪苏兰世哲(C)Z

    .line 303
    .line 304
    .line 305
    move-result v18

    .line 306
    if-nez v18, :cond_9

    .line 307
    .line 308
    invoke-static {v4}, Ltop/suzhelan/qstory/hook/item/chat/飘花落叶言子世哲楪兰苏;->飘花落叶言子楪苏哲兰世(C)Z

    .line 309
    .line 310
    .line 311
    move-result v18

    .line 312
    if-eqz v18, :cond_a

    .line 313
    .line 314
    :cond_9
    const/4 v6, 0x1

    .line 315
    :cond_a
    invoke-static {v4}, Ltop/suzhelan/qstory/hook/item/chat/飘花落叶言子世哲楪兰苏;->飘花落叶言子楪苏哲兰世(C)Z

    .line 316
    .line 317
    .line 318
    move-result v19

    .line 319
    if-nez v19, :cond_d

    .line 320
    .line 321
    if-gt v13, v4, :cond_b

    .line 322
    .line 323
    if-ge v4, v12, :cond_b

    .line 324
    .line 325
    goto :goto_7

    .line 326
    :cond_b
    if-gt v11, v4, :cond_c

    .line 327
    .line 328
    if-ge v4, v10, :cond_c

    .line 329
    .line 330
    goto :goto_7

    .line 331
    :cond_c
    const/16 v19, 0x0

    .line 332
    .line 333
    goto :goto_8

    .line 334
    :cond_d
    :goto_7
    const/16 v19, 0x1

    .line 335
    .line 336
    :goto_8
    if-eq v6, v7, :cond_f

    .line 337
    .line 338
    if-eqz v9, :cond_e

    .line 339
    .line 340
    if-nez v19, :cond_f

    .line 341
    .line 342
    :cond_e
    invoke-static/range {v16 .. v17}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 343
    .line 344
    .line 345
    move-result-object v7

    .line 346
    invoke-virtual {v5, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 347
    .line 348
    .line 349
    :cond_f
    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 350
    .line 351
    .line 352
    add-int/lit8 v15, v15, 0x1

    .line 353
    .line 354
    move v7, v6

    .line 355
    move/from16 v9, v19

    .line 356
    .line 357
    const/4 v4, 0x1

    .line 358
    const/4 v6, 0x0

    .line 359
    goto :goto_6

    .line 360
    :cond_10
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 361
    .line 362
    .line 363
    move-result-object v2

    .line 364
    const-wide v4, -0x36a57c83051405a7L    # -2.3650944526584854E45

    .line 365
    .line 366
    .line 367
    .line 368
    .line 369
    invoke-static {v4, v5}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 370
    .line 371
    .line 372
    new-instance v4, Lkotlin/text/Regex;

    .line 373
    .line 374
    const-wide v5, -0x36a5deb5051405a7L    # -2.3308783800998512E45

    .line 375
    .line 376
    .line 377
    .line 378
    .line 379
    invoke-static {v5, v6}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 380
    .line 381
    .line 382
    move-result-object v5

    .line 383
    invoke-direct {v4, v5}, Lkotlin/text/Regex;-><init>(Ljava/lang/String;)V

    .line 384
    .line 385
    .line 386
    invoke-static/range {v16 .. v17}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 387
    .line 388
    .line 389
    move-result-object v5

    .line 390
    invoke-virtual {v4, v2, v5}, Lkotlin/text/Regex;->replace(Ljava/lang/CharSequence;Ljava/lang/String;)Ljava/lang/String;

    .line 391
    .line 392
    .line 393
    move-result-object v2

    .line 394
    new-instance v4, Lkotlin/text/Regex;

    .line 395
    .line 396
    const-wide v5, -0x36a5debe051405a7L    # -2.330866129934642E45

    .line 397
    .line 398
    .line 399
    .line 400
    .line 401
    invoke-static {v5, v6}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 402
    .line 403
    .line 404
    move-result-object v5

    .line 405
    invoke-direct {v4, v5}, Lkotlin/text/Regex;-><init>(Ljava/lang/String;)V

    .line 406
    .line 407
    .line 408
    const-wide v5, -0x36a507c2051405a7L    # -2.405777251318085E45

    .line 409
    .line 410
    .line 411
    .line 412
    .line 413
    invoke-static {v5, v6}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 414
    .line 415
    .line 416
    move-result-object v5

    .line 417
    invoke-virtual {v4, v2, v5}, Lkotlin/text/Regex;->replace(Ljava/lang/CharSequence;Ljava/lang/String;)Ljava/lang/String;

    .line 418
    .line 419
    .line 420
    move-result-object v2

    .line 421
    invoke-static {v2}, Lkotlin/text/飘花落叶言子楪哲苏世兰;->飘花落叶言子哲苏楪兰世(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 422
    .line 423
    .line 424
    move-result-object v2

    .line 425
    invoke-virtual {v2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 426
    .line 427
    .line 428
    move-result-object v2

    .line 429
    :goto_9
    filled-new-array {v2}, [Ljava/lang/Object;

    .line 430
    .line 431
    .line 432
    move-result-object v2

    .line 433
    invoke-virtual {v3, v1, v2}, L飘花落叶言苏楪哲兰子世/飘花落叶言子楪苏哲世兰;->飘花落叶言子楪世兰哲苏(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 434
    .line 435
    .line 436
    const/4 v6, 0x0

    .line 437
    goto/16 :goto_0

    .line 438
    .line 439
    :cond_11
    return-void

    .line 440
    :pswitch_1
    invoke-virtual {v1, v7}, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->setResult(Ljava/lang/Object;)V

    .line 441
    .line 442
    .line 443
    return-void

    .line 444
    :pswitch_2
    iget-object v0, v1, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->thisObject:Ljava/lang/Object;

    .line 445
    .line 446
    invoke-static {v2, v3}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 447
    .line 448
    .line 449
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 450
    .line 451
    .line 452
    invoke-static {v0}, Ltop/suzhelan/qstory/hook/item/chat/飘花落叶言子世楪兰苏哲;->飘花落叶言子楪苏兰世哲(Ljava/lang/Object;)V

    .line 453
    .line 454
    .line 455
    return-void

    .line 456
    :pswitch_3
    iget-object v0, v1, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->thisObject:Ljava/lang/Object;

    .line 457
    .line 458
    invoke-static {v2, v3}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 459
    .line 460
    .line 461
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 462
    .line 463
    .line 464
    invoke-static {v0}, Ltop/suzhelan/qstory/hook/item/chat/飘花落叶言子世楪兰苏哲;->飘花落叶言子楪苏兰世哲(Ljava/lang/Object;)V

    .line 465
    .line 466
    .line 467
    return-void

    .line 468
    :pswitch_4
    iget-object v0, v1, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->thisObject:Ljava/lang/Object;

    .line 469
    .line 470
    const-wide v1, -0x36a53166051405a7L    # -2.3912676111925763E45

    .line 471
    .line 472
    .line 473
    .line 474
    .line 475
    invoke-static {v1, v2}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 476
    .line 477
    .line 478
    move-result-object v1

    .line 479
    new-instance v2, Ltop/suzhelan/qstory/hook/item/chat/FakeMap;

    .line 480
    .line 481
    invoke-direct {v2}, Ltop/suzhelan/qstory/hook/item/chat/FakeMap;-><init>()V

    .line 482
    .line 483
    .line 484
    invoke-static {v0, v1, v2}, Lde/robv/android/xposed/XposedHelpers;->setObjectField(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;)V

    .line 485
    .line 486
    .line 487
    return-void

    .line 488
    :pswitch_5
    iget-object v0, v1, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->args:[Ljava/lang/Object;

    .line 489
    .line 490
    const v1, 0x7fffffff

    .line 491
    .line 492
    .line 493
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 494
    .line 495
    .line 496
    move-result-object v1

    .line 497
    aput-object v1, v0, v8

    .line 498
    .line 499
    return-void

    .line 500
    :pswitch_6
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 501
    .line 502
    .line 503
    iget-object v0, v1, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->thisObject:Ljava/lang/Object;

    .line 504
    .line 505
    invoke-static {v4, v5}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 506
    .line 507
    .line 508
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 509
    .line 510
    .line 511
    check-cast v0, Landroid/widget/LinearLayout;

    .line 512
    .line 513
    invoke-virtual {v0}, Landroid/view/ViewGroup;->getChildCount()I

    .line 514
    .line 515
    .line 516
    move-result v1

    .line 517
    const/4 v6, 0x0

    .line 518
    :goto_a
    if-ge v6, v1, :cond_14

    .line 519
    .line 520
    invoke-virtual {v0, v6}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    .line 521
    .line 522
    .line 523
    move-result-object v2

    .line 524
    invoke-virtual {v2}, Landroid/view/View;->getContentDescription()Ljava/lang/CharSequence;

    .line 525
    .line 526
    .line 527
    move-result-object v2

    .line 528
    if-eqz v2, :cond_13

    .line 529
    .line 530
    const-wide v3, -0x36a5d19b051405a7L    # -2.3354436083344625E45

    .line 531
    .line 532
    .line 533
    .line 534
    .line 535
    invoke-static {v3, v4}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 536
    .line 537
    .line 538
    move-result-object v3

    .line 539
    invoke-virtual {v2, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 540
    .line 541
    .line 542
    move-result v3

    .line 543
    if-nez v3, :cond_12

    .line 544
    .line 545
    const-wide v3, -0x36a5d180051405a7L    # -2.33548035883009E45

    .line 546
    .line 547
    .line 548
    .line 549
    .line 550
    invoke-static {v3, v4}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 551
    .line 552
    .line 553
    move-result-object v3

    .line 554
    invoke-virtual {v2, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 555
    .line 556
    .line 557
    move-result v2

    .line 558
    if-eqz v2, :cond_13

    .line 559
    .line 560
    :cond_12
    invoke-virtual {v0, v6}, Landroid/view/ViewGroup;->removeViewAt(I)V

    .line 561
    .line 562
    .line 563
    goto :goto_b

    .line 564
    :cond_13
    add-int/lit8 v6, v6, 0x1

    .line 565
    .line 566
    goto :goto_a

    .line 567
    :cond_14
    :goto_b
    return-void

    .line 568
    :pswitch_7
    sget-object v0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 569
    .line 570
    invoke-virtual {v1, v0}, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->setResult(Ljava/lang/Object;)V

    .line 571
    .line 572
    .line 573
    return-void

    .line 574
    :pswitch_8
    invoke-virtual {v1}, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->getResult()Ljava/lang/Object;

    .line 575
    .line 576
    .line 577
    move-result-object v0

    .line 578
    invoke-static {v0}, Lkotlin/jvm/internal/飘花落叶言子楪哲世兰苏;->飘花落叶言子楪苏世兰哲(Ljava/lang/Object;)Z

    .line 579
    .line 580
    .line 581
    move-result v1

    .line 582
    if-eqz v1, :cond_15

    .line 583
    .line 584
    move-object v7, v0

    .line 585
    check-cast v7, Ljava/util/List;

    .line 586
    .line 587
    :cond_15
    if-nez v7, :cond_16

    .line 588
    .line 589
    goto :goto_c

    .line 590
    :cond_16
    new-instance v0, Ltop/suzhelan/qstory/hook/item/chat/飘花落叶言子楪哲苏世兰;

    .line 591
    .line 592
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 593
    .line 594
    .line 595
    new-instance v1, Lbsh/飘花落叶言子楪兰世哲苏;

    .line 596
    .line 597
    invoke-direct {v1, v0, v8}, Lbsh/飘花落叶言子楪兰世哲苏;-><init>(Ljava/lang/Object;I)V

    .line 598
    .line 599
    .line 600
    invoke-interface {v7, v1}, Ljava/util/Collection;->removeIf(Ljava/util/function/Predicate;)Z

    .line 601
    .line 602
    .line 603
    :goto_c
    return-void

    .line 604
    :pswitch_9
    iget-object v0, v1, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->thisObject:Ljava/lang/Object;

    .line 605
    .line 606
    invoke-static {v4, v5}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 607
    .line 608
    .line 609
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 610
    .line 611
    .line 612
    check-cast v0, Landroid/widget/LinearLayout;

    .line 613
    .line 614
    invoke-virtual {v0}, Landroid/view/ViewGroup;->getChildCount()I

    .line 615
    .line 616
    .line 617
    move-result v1

    .line 618
    const/4 v2, 0x4

    .line 619
    if-lt v1, v2, :cond_17

    .line 620
    .line 621
    invoke-virtual {v0, v8}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    .line 622
    .line 623
    .line 624
    move-result-object v1

    .line 625
    if-eqz v1, :cond_18

    .line 626
    .line 627
    new-instance v2, Ltop/suzhelan/qstory/hook/item/chat/飘花落叶言子楪苏哲兰世;

    .line 628
    .line 629
    invoke-direct {v2, v0, v1}, Ltop/suzhelan/qstory/hook/item/chat/飘花落叶言子楪苏哲兰世;-><init>(Landroid/widget/LinearLayout;Landroid/view/View;)V

    .line 630
    .line 631
    .line 632
    invoke-virtual {v0, v2}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z

    .line 633
    .line 634
    .line 635
    goto :goto_d

    .line 636
    :cond_17
    invoke-virtual {v0}, Landroid/view/ViewGroup;->getChildCount()I

    .line 637
    .line 638
    .line 639
    move-result v1

    .line 640
    if-lt v1, v8, :cond_18

    .line 641
    .line 642
    new-instance v1, Landroidx/compose/material/ripple/飘花落叶言子楪苏世兰哲;

    .line 643
    .line 644
    const/16 v2, 0xc

    .line 645
    .line 646
    invoke-direct {v1, v0, v2}, Landroidx/compose/material/ripple/飘花落叶言子楪苏世兰哲;-><init>(Ljava/lang/Object;I)V

    .line 647
    .line 648
    .line 649
    invoke-virtual {v0, v1}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z

    .line 650
    .line 651
    .line 652
    :cond_18
    :goto_d
    return-void

    .line 653
    :pswitch_a
    iget-object v0, v1, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->thisObject:Ljava/lang/Object;

    .line 654
    .line 655
    invoke-static {v4, v5}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 656
    .line 657
    .line 658
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 659
    .line 660
    .line 661
    check-cast v0, Landroid/widget/LinearLayout;

    .line 662
    .line 663
    invoke-virtual {v0}, Landroid/view/ViewGroup;->getChildCount()I

    .line 664
    .line 665
    .line 666
    move-result v1

    .line 667
    const/4 v6, 0x0

    .line 668
    :goto_e
    if-ge v6, v1, :cond_1a

    .line 669
    .line 670
    invoke-virtual {v0, v6}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    .line 671
    .line 672
    .line 673
    move-result-object v2

    .line 674
    invoke-virtual {v2}, Landroid/view/View;->getContentDescription()Ljava/lang/CharSequence;

    .line 675
    .line 676
    .line 677
    move-result-object v2

    .line 678
    if-eqz v2, :cond_19

    .line 679
    .line 680
    const-wide v3, -0x36a5d5f0051405a7L    # -2.3339341157548012E45

    .line 681
    .line 682
    .line 683
    .line 684
    .line 685
    invoke-static {v3, v4}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 686
    .line 687
    .line 688
    move-result-object v3

    .line 689
    invoke-virtual {v2, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 690
    .line 691
    .line 692
    move-result v2

    .line 693
    if-eqz v2, :cond_19

    .line 694
    .line 695
    invoke-virtual {v0, v6}, Landroid/view/ViewGroup;->removeViewAt(I)V

    .line 696
    .line 697
    .line 698
    goto :goto_f

    .line 699
    :cond_19
    add-int/lit8 v6, v6, 0x1

    .line 700
    .line 701
    goto :goto_e

    .line 702
    :cond_1a
    :goto_f
    return-void

    .line 703
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_a
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
