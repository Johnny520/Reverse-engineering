.class public abstract Lxa1;
.super Ljava/lang/Object;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"


# static fields
.field public static final α:Ljava/util/concurrent/atomic/AtomicBoolean;

.field public static final β:Ljava/util/concurrent/atomic/AtomicReference;

.field public static final γ:Ljava/util/concurrent/atomic/AtomicReference;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>(Z)V

    .line 5
    .line 6
    .line 7
    sput-object v0, Lxa1;->α:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 8
    .line 9
    new-instance v0, Ljava/util/concurrent/atomic/AtomicReference;

    .line 10
    .line 11
    const-string v1, ""

    .line 12
    .line 13
    invoke-direct {v0, v1}, Ljava/util/concurrent/atomic/AtomicReference;-><init>(Ljava/lang/Object;)V

    .line 14
    .line 15
    .line 16
    sput-object v0, Lxa1;->β:Ljava/util/concurrent/atomic/AtomicReference;

    .line 17
    .line 18
    new-instance v0, Ljava/util/concurrent/atomic/AtomicReference;

    .line 19
    .line 20
    const/4 v1, 0x0

    .line 21
    invoke-direct {v0, v1}, Ljava/util/concurrent/atomic/AtomicReference;-><init>(Ljava/lang/Object;)V

    .line 22
    .line 23
    .line 24
    sput-object v0, Lxa1;->γ:Ljava/util/concurrent/atomic/AtomicReference;

    .line 25
    .line 26
    return-void
.end method

.method public static α(II)V
    .locals 0

    .line 1
    if-ge p0, p1, :cond_0

    .line 2
    .line 3
    const-wide/16 p0, 0x12c

    .line 4
    .line 5
    :try_start_0
    invoke-static {p0, p1}, Ljava/lang/Thread;->sleep(J)V
    :try_end_0
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_0

    .line 6
    .line 7
    .line 8
    return-void

    .line 9
    :catch_0
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    .line 10
    .line 11
    .line 12
    move-result-object p0

    .line 13
    invoke-virtual {p0}, Ljava/lang/Thread;->interrupt()V

    .line 14
    .line 15
    .line 16
    :cond_0
    return-void
.end method

.method public static β()Ljava/lang/String;
    .locals 2

    .line 1
    invoke-static {}, Lui1;->κ()Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-static {v0}, Lq02;->Б(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    invoke-static {v0}, Lq02;->ж(Ljava/lang/CharSequence;)Z

    .line 14
    .line 15
    .line 16
    move-result v1

    .line 17
    if-eqz v1, :cond_0

    .line 18
    .line 19
    sget-object v0, Lx9;->α:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 20
    .line 21
    sget-object v0, Lx9;->θ:Ljava/lang/String;

    .line 22
    .line 23
    invoke-static {v0}, Lq02;->Б(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 28
    .line 29
    .line 30
    move-result-object v0

    .line 31
    :cond_0
    return-object v0
.end method

.method public static γ(Ljava/lang/ClassLoader;Ljava/lang/String;)Lva1;
    .locals 35

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    invoke-static {}, Lxa1;->κ()Ljava/util/List;

    .line 6
    .line 7
    .line 8
    move-result-object v2

    .line 9
    invoke-interface {v2}, Ljava/util/List;->isEmpty()Z

    .line 10
    .line 11
    .line 12
    move-result v3

    .line 13
    if-eqz v3, :cond_0

    .line 14
    .line 15
    new-instance v4, Lva1;

    .line 16
    .line 17
    const/4 v11, 0x0

    .line 18
    const/4 v12, 0x0

    .line 19
    const/4 v5, 0x0

    .line 20
    const/4 v6, 0x0

    .line 21
    const/4 v7, 0x0

    .line 22
    const/4 v8, 0x0

    .line 23
    const/4 v9, 0x0

    .line 24
    const/4 v10, 0x0

    .line 25
    const-string v13, "\u81ea\u52a8\u6295\u5582\u8df3\u8fc7 reason=no_conversation"

    .line 26
    .line 27
    invoke-direct/range {v4 .. v13}, Lva1;-><init>(IIIIIIIILjava/lang/String;)V

    .line 28
    .line 29
    .line 30
    return-object v4

    .line 31
    :cond_0
    const-string v3, "pet_elf_auto_feed_default_food_id"

    .line 32
    .line 33
    const-string v4, "204"

    .line 34
    .line 35
    invoke-static {v3, v4}, Lui1;->ν(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 36
    .line 37
    .line 38
    move-result-object v3

    .line 39
    const-string v5, "pet_elf_auto_feed_max_price"

    .line 40
    .line 41
    const/4 v6, 0x0

    .line 42
    :try_start_0
    invoke-static {}, Lui1;->μ()Landroid/content/SharedPreferences;

    .line 43
    .line 44
    .line 45
    move-result-object v7

    .line 46
    invoke-interface {v7, v5, v6}, Landroid/content/SharedPreferences;->getInt(Ljava/lang/String;I)I

    .line 47
    .line 48
    .line 49
    move-result v5
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 50
    goto :goto_0

    .line 51
    :catchall_0
    move v5, v6

    .line 52
    :goto_0
    const/16 v7, 0x64

    .line 53
    .line 54
    invoke-static {v5, v6, v7}, Lj81;->μ(III)I

    .line 55
    .line 56
    .line 57
    move-result v5

    .line 58
    new-instance v7, Ljava/util/ArrayList;

    .line 59
    .line 60
    invoke-direct {v7}, Ljava/util/ArrayList;-><init>()V

    .line 61
    .line 62
    .line 63
    invoke-interface {v2}, Ljava/util/List;->size()I

    .line 64
    .line 65
    .line 66
    move-result v8

    .line 67
    const-string v9, " defaultFoodId="

    .line 68
    .line 69
    const-string v10, " maxPrice="

    .line 70
    .line 71
    const-string v11, "\u5f00\u59cb\u81ea\u52a8\u6295\u5582 \u4f1a\u8bdd="

    .line 72
    .line 73
    invoke-static {v8, v11, v9, v3, v10}, La12;->η(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 74
    .line 75
    .line 76
    move-result-object v8

    .line 77
    invoke-virtual {v8, v5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 78
    .line 79
    .line 80
    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 81
    .line 82
    .line 83
    move-result-object v8

    .line 84
    const-string v9, "r87045d6703eaa6c4"

    .line 85
    .line 86
    const/4 v10, 0x0

    .line 87
    const/4 v11, 0x4

    .line 88
    invoke-static {v9, v8, v10, v11, v10}, Lux;->ω(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ILjava/lang/Object;)V

    .line 89
    .line 90
    .line 91
    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 92
    .line 93
    .line 94
    move-result-object v8

    .line 95
    move v12, v6

    .line 96
    move v13, v12

    .line 97
    move v14, v13

    .line 98
    move v15, v14

    .line 99
    move/from16 v23, v15

    .line 100
    .line 101
    move/from16 v24, v23

    .line 102
    .line 103
    move/from16 v25, v24

    .line 104
    .line 105
    :goto_1
    invoke-interface {v8}, Ljava/util/Iterator;->hasNext()Z

    .line 106
    .line 107
    .line 108
    move-result v17

    .line 109
    if-eqz v17, :cond_1

    .line 110
    .line 111
    add-int/lit8 v17, v12, 0x1

    .line 112
    .line 113
    invoke-interface {v8}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 114
    .line 115
    .line 116
    move-result-object v19

    .line 117
    const/16 v20, 0x1

    .line 118
    .line 119
    move-object/from16 v10, v19

    .line 120
    .line 121
    check-cast v10, Lky1;

    .line 122
    .line 123
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    .line 124
    .line 125
    .line 126
    move-result-object v19

    .line 127
    invoke-virtual/range {v19 .. v19}, Ljava/lang/Thread;->isInterrupted()Z

    .line 128
    .line 129
    .line 130
    move-result v19

    .line 131
    if-nez v19, :cond_1

    .line 132
    .line 133
    invoke-static {}, Lxa1;->ε()Z

    .line 134
    .line 135
    .line 136
    move-result v19

    .line 137
    if-nez v19, :cond_2

    .line 138
    .line 139
    const-string v3, "\u81ea\u52a8\u6295\u5582\u505c\u6b62 reason=setting_disabled"

    .line 140
    .line 141
    const/4 v4, 0x0

    .line 142
    invoke-static {v9, v3, v4, v11, v4}, Lux;->ω(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ILjava/lang/Object;)V

    .line 143
    .line 144
    .line 145
    :cond_1
    move-object/from16 v19, v2

    .line 146
    .line 147
    :goto_2
    move/from16 v31, v6

    .line 148
    .line 149
    move/from16 v32, v13

    .line 150
    .line 151
    move/from16 v33, v14

    .line 152
    .line 153
    move/from16 v22, v15

    .line 154
    .line 155
    move/from16 v6, v23

    .line 156
    .line 157
    move/from16 v29, v25

    .line 158
    .line 159
    move/from16 v25, v24

    .line 160
    .line 161
    goto/16 :goto_1b

    .line 162
    .line 163
    :cond_2
    move-object/from16 v19, v2

    .line 164
    .line 165
    invoke-static {}, Lxa1;->β()Ljava/lang/String;

    .line 166
    .line 167
    .line 168
    move-result-object v2

    .line 169
    invoke-static {v2, v1}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 170
    .line 171
    .line 172
    move-result v2

    .line 173
    if-nez v2, :cond_3

    .line 174
    .line 175
    const-string v2, "\u81ea\u52a8\u6295\u5582\u505c\u6b62 reason=account_changed"

    .line 176
    .line 177
    const/4 v4, 0x0

    .line 178
    invoke-static {v9, v2, v4, v11, v4}, Lux;->ω(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ILjava/lang/Object;)V

    .line 179
    .line 180
    .line 181
    goto :goto_2

    .line 182
    :cond_3
    sget-object v2, Lry1;->α:Lry1;

    .line 183
    .line 184
    invoke-static {v10}, Lry1;->Π(Lky1;)Ljava/lang/String;

    .line 185
    .line 186
    .line 187
    move-result-object v2

    .line 188
    move/from16 v22, v12

    .line 189
    .line 190
    iget-wide v11, v10, Lky1;->β:J

    .line 191
    .line 192
    move-object/from16 v26, v3

    .line 193
    .line 194
    const/16 v3, 0x28

    .line 195
    .line 196
    invoke-static {v2, v3}, Lxa1;->ι(Ljava/lang/String;I)Ljava/lang/String;

    .line 197
    .line 198
    .line 199
    move-result-object v2

    .line 200
    invoke-static {v10}, Lry1;->Ψ(Lky1;)Lmy1;

    .line 201
    .line 202
    .line 203
    move-result-object v3

    .line 204
    move-object/from16 v27, v4

    .line 205
    .line 206
    invoke-static {v10}, Lry1;->Τ(Lky1;)Lly1;

    .line 207
    .line 208
    .line 209
    move-result-object v4

    .line 210
    if-eqz v4, :cond_4

    .line 211
    .line 212
    iget-object v4, v4, Lly1;->γ:Lmy1;

    .line 213
    .line 214
    :goto_3
    move-object/from16 v28, v8

    .line 215
    .line 216
    goto :goto_4

    .line 217
    :cond_4
    const/4 v4, 0x0

    .line 218
    goto :goto_3

    .line 219
    :goto_4
    iget-object v8, v3, Lmy1;->η:Ljava/lang/Boolean;

    .line 220
    .line 221
    if-eqz v8, :cond_5

    .line 222
    .line 223
    :goto_5
    invoke-virtual {v8}, Ljava/lang/Boolean;->booleanValue()Z

    .line 224
    .line 225
    .line 226
    move-result v8

    .line 227
    goto :goto_7

    .line 228
    :cond_5
    if-eqz v4, :cond_6

    .line 229
    .line 230
    iget-object v8, v4, Lmy1;->η:Ljava/lang/Boolean;

    .line 231
    .line 232
    goto :goto_6

    .line 233
    :cond_6
    const/4 v8, 0x0

    .line 234
    :goto_6
    if-eqz v8, :cond_7

    .line 235
    .line 236
    goto :goto_5

    .line 237
    :cond_7
    move/from16 v8, v20

    .line 238
    .line 239
    :goto_7
    iget-object v3, v3, Lmy1;->θ:Ljava/lang/String;

    .line 240
    .line 241
    invoke-static {v3}, Lq02;->ж(Ljava/lang/CharSequence;)Z

    .line 242
    .line 243
    .line 244
    move-result v29

    .line 245
    const-string v30, ""

    .line 246
    .line 247
    if-eqz v29, :cond_a

    .line 248
    .line 249
    if-eqz v4, :cond_8

    .line 250
    .line 251
    iget-object v3, v4, Lmy1;->θ:Ljava/lang/String;

    .line 252
    .line 253
    goto :goto_8

    .line 254
    :cond_8
    const/4 v3, 0x0

    .line 255
    :goto_8
    if-nez v3, :cond_9

    .line 256
    .line 257
    move-object/from16 v3, v30

    .line 258
    .line 259
    :cond_9
    invoke-static {v3}, Lq02;->ж(Ljava/lang/CharSequence;)Z

    .line 260
    .line 261
    .line 262
    move-result v4

    .line 263
    if-eqz v4, :cond_a

    .line 264
    .line 265
    invoke-static/range {v26 .. v26}, Lry1;->В(Ljava/lang/String;)Ljava/lang/String;

    .line 266
    .line 267
    .line 268
    move-result-object v3

    .line 269
    invoke-static {v3}, Lq02;->ж(Ljava/lang/CharSequence;)Z

    .line 270
    .line 271
    .line 272
    move-result v4

    .line 273
    if-eqz v4, :cond_a

    .line 274
    .line 275
    move-object/from16 v3, v27

    .line 276
    .line 277
    :cond_a
    if-nez v8, :cond_b

    .line 278
    .line 279
    add-int/lit8 v15, v15, 0x1

    .line 280
    .line 281
    add-int/lit8 v13, v13, 0x1

    .line 282
    .line 283
    const-string v3, "person_disabled"

    .line 284
    .line 285
    const-string v4, "\u4eba\u5458\u8bbe\u7f6e\u4e3a\u5173\u95ed"

    .line 286
    .line 287
    invoke-static {v2, v3, v4}, Lxa1;->η(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 288
    .line 289
    .line 290
    invoke-interface/range {v19 .. v19}, Ljava/util/List;->size()I

    .line 291
    .line 292
    .line 293
    move-result v2

    .line 294
    add-int/lit8 v2, v2, -0x1

    .line 295
    .line 296
    move/from16 v4, v22

    .line 297
    .line 298
    invoke-static {v4, v2}, Lxa1;->α(II)V

    .line 299
    .line 300
    .line 301
    move/from16 v12, v17

    .line 302
    .line 303
    move-object/from16 v2, v19

    .line 304
    .line 305
    :goto_9
    move-object/from16 v3, v26

    .line 306
    .line 307
    move-object/from16 v4, v27

    .line 308
    .line 309
    move-object/from16 v8, v28

    .line 310
    .line 311
    :goto_a
    const/4 v10, 0x0

    .line 312
    const/4 v11, 0x4

    .line 313
    goto/16 :goto_1

    .line 314
    .line 315
    :cond_b
    move/from16 v4, v22

    .line 316
    .line 317
    invoke-static {v0, v11, v12}, Lp91;->κ(Ljava/lang/ClassLoader;J)Ljava/lang/Object;

    .line 318
    .line 319
    .line 320
    move-result-object v8

    .line 321
    move/from16 v22, v15

    .line 322
    .line 323
    instance-of v15, v8, Leo1;

    .line 324
    .line 325
    if-eqz v15, :cond_d

    .line 326
    .line 327
    move/from16 v15, v25

    .line 328
    .line 329
    add-int/lit8 v25, v15, 0x1

    .line 330
    .line 331
    invoke-static {v8}, Lfo1;->α(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 332
    .line 333
    .line 334
    move-result-object v3

    .line 335
    if-eqz v3, :cond_c

    .line 336
    .line 337
    invoke-virtual {v3}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 338
    .line 339
    .line 340
    move-result-object v8

    .line 341
    goto :goto_b

    .line 342
    :cond_c
    const/4 v8, 0x0

    .line 343
    :goto_b
    const-string v10, "catalog_request_failed"

    .line 344
    .line 345
    invoke-static {v2, v10, v8}, Lxa1;->ζ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 346
    .line 347
    .line 348
    const-string v8, "\u81ea\u52a8\u6295\u5582\u76ee\u5f55\u8bfb\u53d6\u5931\u8d25 name="

    .line 349
    .line 350
    invoke-virtual {v8, v2}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 351
    .line 352
    .line 353
    move-result-object v2

    .line 354
    invoke-static {v9, v2, v3}, Lux;->ι(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 355
    .line 356
    .line 357
    invoke-interface/range {v19 .. v19}, Ljava/util/List;->size()I

    .line 358
    .line 359
    .line 360
    move-result v2

    .line 361
    add-int/lit8 v2, v2, -0x1

    .line 362
    .line 363
    invoke-static {v4, v2}, Lxa1;->α(II)V

    .line 364
    .line 365
    .line 366
    move/from16 v12, v17

    .line 367
    .line 368
    move-object/from16 v2, v19

    .line 369
    .line 370
    move/from16 v15, v22

    .line 371
    .line 372
    goto :goto_9

    .line 373
    :cond_d
    move/from16 v15, v25

    .line 374
    .line 375
    invoke-static {v8}, Li81;->Β(Ljava/lang/Object;)V

    .line 376
    .line 377
    .line 378
    check-cast v8, Lxe1;

    .line 379
    .line 380
    invoke-virtual {v8}, Lxe1;->α()Z

    .line 381
    .line 382
    .line 383
    move-result v25

    .line 384
    move/from16 v29, v15

    .line 385
    .line 386
    const-string v15, " "

    .line 387
    .line 388
    move/from16 v31, v6

    .line 389
    .line 390
    const-string v6, "pet_not_exist"

    .line 391
    .line 392
    move/from16 v32, v13

    .line 393
    .line 394
    const-string v13, "code="

    .line 395
    .line 396
    if-nez v25, :cond_10

    .line 397
    .line 398
    iget v3, v8, Lxe1;->γ:I

    .line 399
    .line 400
    const v10, 0xf2ad8

    .line 401
    .line 402
    .line 403
    if-ne v3, v10, :cond_e

    .line 404
    .line 405
    add-int/lit8 v15, v22, 0x1

    .line 406
    .line 407
    add-int/lit8 v24, v24, 0x1

    .line 408
    .line 409
    const-string v3, "\u5f53\u524d\u4f1a\u8bdd\u6ca1\u6709\u53ef\u5582\u517b\u5c0f\u706b\u4eba"

    .line 410
    .line 411
    invoke-static {v2, v6, v3}, Lxa1;->η(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 412
    .line 413
    .line 414
    move/from16 v25, v29

    .line 415
    .line 416
    goto :goto_c

    .line 417
    :cond_e
    add-int/lit8 v25, v29, 0x1

    .line 418
    .line 419
    iget-object v6, v8, Lxe1;->δ:Ljava/lang/String;

    .line 420
    .line 421
    if-nez v6, :cond_f

    .line 422
    .line 423
    move-object/from16 v6, v30

    .line 424
    .line 425
    :cond_f
    new-instance v8, Ljava/lang/StringBuilder;

    .line 426
    .line 427
    invoke-direct {v8, v13}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 428
    .line 429
    .line 430
    invoke-virtual {v8, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 431
    .line 432
    .line 433
    invoke-virtual {v8, v15}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 434
    .line 435
    .line 436
    invoke-virtual {v8, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 437
    .line 438
    .line 439
    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 440
    .line 441
    .line 442
    move-result-object v3

    .line 443
    const-string v6, "catalog_business_error"

    .line 444
    .line 445
    invoke-static {v2, v6, v3}, Lxa1;->ζ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 446
    .line 447
    .line 448
    move/from16 v15, v22

    .line 449
    .line 450
    :goto_c
    invoke-interface/range {v19 .. v19}, Ljava/util/List;->size()I

    .line 451
    .line 452
    .line 453
    move-result v2

    .line 454
    add-int/lit8 v2, v2, -0x1

    .line 455
    .line 456
    invoke-static {v4, v2}, Lxa1;->α(II)V

    .line 457
    .line 458
    .line 459
    move/from16 v12, v17

    .line 460
    .line 461
    move-object/from16 v2, v19

    .line 462
    .line 463
    move-object/from16 v3, v26

    .line 464
    .line 465
    move-object/from16 v4, v27

    .line 466
    .line 467
    move-object/from16 v8, v28

    .line 468
    .line 469
    move/from16 v6, v31

    .line 470
    .line 471
    move/from16 v13, v32

    .line 472
    .line 473
    goto/16 :goto_a

    .line 474
    .line 475
    :cond_10
    move/from16 v33, v14

    .line 476
    .line 477
    move/from16 v14, v24

    .line 478
    .line 479
    add-int/lit8 v22, v22, 0x1

    .line 480
    .line 481
    iget-object v8, v8, Lxe1;->ζ:Ljava/util/List;

    .line 482
    .line 483
    invoke-static {v5, v3, v8}, Lg81;->ζ(ILjava/lang/String;Ljava/util/List;)Lta1;

    .line 484
    .line 485
    .line 486
    move-result-object v3

    .line 487
    iget-object v8, v3, Lta1;->β:Lua1;

    .line 488
    .line 489
    move/from16 v24, v5

    .line 490
    .line 491
    iget-object v5, v3, Lta1;->α:Lze1;

    .line 492
    .line 493
    move/from16 v25, v14

    .line 494
    .line 495
    if-eqz v5, :cond_1e

    .line 496
    .line 497
    if-nez v8, :cond_1e

    .line 498
    .line 499
    if-eqz v5, :cond_1d

    .line 500
    .line 501
    iget-object v3, v5, Lze1;->α:Ljava/lang/String;

    .line 502
    .line 503
    const/16 v8, 0xa

    .line 504
    .line 505
    invoke-static {v3, v8}, Lx02;->Ρ(Ljava/lang/String;I)Ljava/lang/Integer;

    .line 506
    .line 507
    .line 508
    move-result-object v8

    .line 509
    const/16 v34, -0x1

    .line 510
    .line 511
    iget-object v14, v5, Lze1;->γ:Ljava/lang/Integer;

    .line 512
    .line 513
    if-eqz v8, :cond_1c

    .line 514
    .line 515
    if-nez v14, :cond_11

    .line 516
    .line 517
    goto/16 :goto_12

    .line 518
    .line 519
    :cond_11
    invoke-virtual {v8}, Ljava/lang/Integer;->intValue()I

    .line 520
    .line 521
    .line 522
    move-result v3

    .line 523
    invoke-virtual {v14}, Ljava/lang/Integer;->intValue()I

    .line 524
    .line 525
    .line 526
    move-result v1

    .line 527
    invoke-static {v0, v11, v12, v3, v1}, Lp91;->ι(Ljava/lang/ClassLoader;JII)Ljava/lang/Object;

    .line 528
    .line 529
    .line 530
    move-result-object v1

    .line 531
    instance-of v3, v1, Leo1;

    .line 532
    .line 533
    if-eqz v3, :cond_13

    .line 534
    .line 535
    add-int/lit8 v3, v29, 0x1

    .line 536
    .line 537
    invoke-static {v1}, Lfo1;->α(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 538
    .line 539
    .line 540
    move-result-object v1

    .line 541
    if-eqz v1, :cond_12

    .line 542
    .line 543
    invoke-virtual {v1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 544
    .line 545
    .line 546
    move-result-object v5

    .line 547
    goto :goto_d

    .line 548
    :cond_12
    const/4 v5, 0x0

    .line 549
    :goto_d
    const-string v6, "feed_request_failed"

    .line 550
    .line 551
    invoke-static {v2, v6, v5}, Lxa1;->ζ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 552
    .line 553
    .line 554
    const-string v5, "\u81ea\u52a8\u6295\u5582\u8bf7\u6c42\u5931\u8d25 name="

    .line 555
    .line 556
    invoke-virtual {v5, v2}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 557
    .line 558
    .line 559
    move-result-object v2

    .line 560
    invoke-static {v9, v2, v1}, Lux;->ι(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 561
    .line 562
    .line 563
    invoke-interface/range {v19 .. v19}, Ljava/util/List;->size()I

    .line 564
    .line 565
    .line 566
    move-result v1

    .line 567
    add-int/lit8 v1, v1, -0x1

    .line 568
    .line 569
    invoke-static {v4, v1}, Lxa1;->α(II)V

    .line 570
    .line 571
    .line 572
    move-object/from16 v1, p1

    .line 573
    .line 574
    move/from16 v12, v17

    .line 575
    .line 576
    move-object/from16 v2, v19

    .line 577
    .line 578
    move/from16 v15, v22

    .line 579
    .line 580
    move/from16 v5, v24

    .line 581
    .line 582
    move/from16 v24, v25

    .line 583
    .line 584
    move-object/from16 v4, v27

    .line 585
    .line 586
    move-object/from16 v8, v28

    .line 587
    .line 588
    move/from16 v6, v31

    .line 589
    .line 590
    move/from16 v13, v32

    .line 591
    .line 592
    move/from16 v14, v33

    .line 593
    .line 594
    const/4 v10, 0x0

    .line 595
    const/4 v11, 0x4

    .line 596
    move/from16 v25, v3

    .line 597
    .line 598
    move-object/from16 v3, v26

    .line 599
    .line 600
    goto/16 :goto_1

    .line 601
    .line 602
    :cond_13
    invoke-static {v1}, Li81;->Β(Ljava/lang/Object;)V

    .line 603
    .line 604
    .line 605
    check-cast v1, Lwe1;

    .line 606
    .line 607
    invoke-virtual {v1}, Lwe1;->α()Z

    .line 608
    .line 609
    .line 610
    move-result v3

    .line 611
    if-eqz v3, :cond_16

    .line 612
    .line 613
    add-int/lit8 v3, v33, 0x1

    .line 614
    .line 615
    invoke-virtual {v7, v10}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 616
    .line 617
    .line 618
    iget-object v6, v5, Lze1;->β:Ljava/lang/String;

    .line 619
    .line 620
    const/16 v10, 0x30

    .line 621
    .line 622
    invoke-static {v6, v10}, Lxa1;->ι(Ljava/lang/String;I)Ljava/lang/String;

    .line 623
    .line 624
    .line 625
    move-result-object v6

    .line 626
    iget-object v10, v1, Lwe1;->θ:Ljava/lang/Long;

    .line 627
    .line 628
    if-nez v10, :cond_14

    .line 629
    .line 630
    iget-object v10, v5, Lze1;->ε:Ljava/lang/Integer;

    .line 631
    .line 632
    if-nez v10, :cond_14

    .line 633
    .line 634
    invoke-static/range {v34 .. v34}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 635
    .line 636
    .line 637
    move-result-object v10

    .line 638
    :cond_14
    iget-object v1, v1, Lwe1;->η:Ljava/lang/Long;

    .line 639
    .line 640
    if-eqz v1, :cond_15

    .line 641
    .line 642
    invoke-virtual {v1}, Ljava/lang/Long;->longValue()J

    .line 643
    .line 644
    .line 645
    move-result-wide v11

    .line 646
    goto :goto_e

    .line 647
    :cond_15
    const-wide/16 v11, -0x1

    .line 648
    .line 649
    :goto_e
    new-instance v1, Ljava/lang/StringBuilder;

    .line 650
    .line 651
    const-string v5, "\u81ea\u52a8\u6295\u5582\u6210\u529f name="

    .line 652
    .line 653
    invoke-direct {v1, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 654
    .line 655
    .line 656
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 657
    .line 658
    .line 659
    const-string v2, " foodId="

    .line 660
    .line 661
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 662
    .line 663
    .line 664
    invoke-virtual {v1, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 665
    .line 666
    .line 667
    const-string v2, " foodName="

    .line 668
    .line 669
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 670
    .line 671
    .line 672
    invoke-virtual {v1, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 673
    .line 674
    .line 675
    const-string v2, " price="

    .line 676
    .line 677
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 678
    .line 679
    .line 680
    invoke-virtual {v1, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 681
    .line 682
    .line 683
    const-string v2, " closeness="

    .line 684
    .line 685
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 686
    .line 687
    .line 688
    invoke-virtual {v1, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 689
    .line 690
    .line 691
    const-string v2, " balanceSpark="

    .line 692
    .line 693
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 694
    .line 695
    .line 696
    invoke-virtual {v1, v11, v12}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 697
    .line 698
    .line 699
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 700
    .line 701
    .line 702
    move-result-object v1

    .line 703
    const/4 v2, 0x4

    .line 704
    const/4 v5, 0x0

    .line 705
    invoke-static {v9, v1, v5, v2, v5}, Lux;->ω(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ILjava/lang/Object;)V

    .line 706
    .line 707
    .line 708
    move v14, v3

    .line 709
    move/from16 v1, v25

    .line 710
    .line 711
    move/from16 v25, v29

    .line 712
    .line 713
    goto/16 :goto_11

    .line 714
    .line 715
    :cond_16
    iget v3, v1, Lwe1;->γ:I

    .line 716
    .line 717
    const v5, 0x493e1

    .line 718
    .line 719
    .line 720
    if-ne v3, v5, :cond_17

    .line 721
    .line 722
    add-int/lit8 v1, v25, 0x1

    .line 723
    .line 724
    new-instance v5, Ljava/lang/StringBuilder;

    .line 725
    .line 726
    invoke-direct {v5, v13}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 727
    .line 728
    .line 729
    invoke-virtual {v5, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 730
    .line 731
    .line 732
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 733
    .line 734
    .line 735
    move-result-object v3

    .line 736
    const-string v5, "already_feeding"

    .line 737
    .line 738
    invoke-static {v2, v5, v3}, Lxa1;->η(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 739
    .line 740
    .line 741
    :goto_f
    move/from16 v25, v29

    .line 742
    .line 743
    :goto_10
    move/from16 v14, v33

    .line 744
    .line 745
    goto/16 :goto_11

    .line 746
    .line 747
    :cond_17
    const v5, 0x493e2

    .line 748
    .line 749
    .line 750
    if-ne v3, v5, :cond_18

    .line 751
    .line 752
    add-int/lit8 v1, v25, 0x1

    .line 753
    .line 754
    new-instance v5, Ljava/lang/StringBuilder;

    .line 755
    .line 756
    invoke-direct {v5, v13}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 757
    .line 758
    .line 759
    invoke-virtual {v5, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 760
    .line 761
    .line 762
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 763
    .line 764
    .line 765
    move-result-object v3

    .line 766
    const-string v5, "food_not_in_activity"

    .line 767
    .line 768
    invoke-static {v2, v5, v3}, Lxa1;->η(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 769
    .line 770
    .line 771
    goto :goto_f

    .line 772
    :cond_18
    const v10, 0xf2ad8

    .line 773
    .line 774
    .line 775
    if-ne v3, v10, :cond_19

    .line 776
    .line 777
    add-int/lit8 v1, v25, 0x1

    .line 778
    .line 779
    new-instance v5, Ljava/lang/StringBuilder;

    .line 780
    .line 781
    invoke-direct {v5, v13}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 782
    .line 783
    .line 784
    invoke-virtual {v5, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 785
    .line 786
    .line 787
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 788
    .line 789
    .line 790
    move-result-object v3

    .line 791
    invoke-static {v2, v6, v3}, Lxa1;->η(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 792
    .line 793
    .line 794
    goto :goto_f

    .line 795
    :cond_19
    const v5, 0x493e3

    .line 796
    .line 797
    .line 798
    if-ne v3, v5, :cond_1a

    .line 799
    .line 800
    add-int/lit8 v1, v29, 0x1

    .line 801
    .line 802
    new-instance v5, Ljava/lang/StringBuilder;

    .line 803
    .line 804
    invoke-direct {v5, v13}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 805
    .line 806
    .line 807
    invoke-virtual {v5, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 808
    .line 809
    .line 810
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 811
    .line 812
    .line 813
    move-result-object v3

    .line 814
    const-string v5, "price_changed_no_retry"

    .line 815
    .line 816
    invoke-static {v2, v5, v3}, Lxa1;->ζ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 817
    .line 818
    .line 819
    move/from16 v14, v25

    .line 820
    .line 821
    move/from16 v25, v1

    .line 822
    .line 823
    move v1, v14

    .line 824
    goto :goto_10

    .line 825
    :cond_1a
    add-int/lit8 v5, v29, 0x1

    .line 826
    .line 827
    iget-object v1, v1, Lwe1;->δ:Ljava/lang/String;

    .line 828
    .line 829
    if-nez v1, :cond_1b

    .line 830
    .line 831
    move-object/from16 v1, v30

    .line 832
    .line 833
    :cond_1b
    new-instance v6, Ljava/lang/StringBuilder;

    .line 834
    .line 835
    invoke-direct {v6, v13}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 836
    .line 837
    .line 838
    invoke-virtual {v6, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 839
    .line 840
    .line 841
    invoke-virtual {v6, v15}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 842
    .line 843
    .line 844
    invoke-virtual {v6, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 845
    .line 846
    .line 847
    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 848
    .line 849
    .line 850
    move-result-object v1

    .line 851
    const-string v3, "feed_business_error"

    .line 852
    .line 853
    invoke-static {v2, v3, v1}, Lxa1;->ζ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 854
    .line 855
    .line 856
    move/from16 v1, v25

    .line 857
    .line 858
    move/from16 v14, v33

    .line 859
    .line 860
    move/from16 v25, v5

    .line 861
    .line 862
    :goto_11
    invoke-interface/range {v19 .. v19}, Ljava/util/List;->size()I

    .line 863
    .line 864
    .line 865
    move-result v2

    .line 866
    add-int/lit8 v2, v2, -0x1

    .line 867
    .line 868
    invoke-static {v4, v2}, Lxa1;->α(II)V

    .line 869
    .line 870
    .line 871
    move/from16 v12, v17

    .line 872
    .line 873
    move-object/from16 v2, v19

    .line 874
    .line 875
    move/from16 v15, v22

    .line 876
    .line 877
    move/from16 v5, v24

    .line 878
    .line 879
    move-object/from16 v3, v26

    .line 880
    .line 881
    move-object/from16 v4, v27

    .line 882
    .line 883
    move-object/from16 v8, v28

    .line 884
    .line 885
    move/from16 v6, v31

    .line 886
    .line 887
    move/from16 v13, v32

    .line 888
    .line 889
    const/4 v10, 0x0

    .line 890
    const/4 v11, 0x4

    .line 891
    move/from16 v24, v1

    .line 892
    .line 893
    move-object/from16 v1, p1

    .line 894
    .line 895
    goto/16 :goto_1

    .line 896
    .line 897
    :cond_1c
    :goto_12
    add-int/lit8 v6, v31, 0x1

    .line 898
    .line 899
    const-string v1, "foodId="

    .line 900
    .line 901
    invoke-virtual {v1, v3}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 902
    .line 903
    .line 904
    move-result-object v1

    .line 905
    const-string v3, "invalid_catalog_item"

    .line 906
    .line 907
    invoke-static {v2, v3, v1}, Lxa1;->η(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 908
    .line 909
    .line 910
    invoke-interface/range {v19 .. v19}, Ljava/util/List;->size()I

    .line 911
    .line 912
    .line 913
    move-result v1

    .line 914
    add-int/lit8 v1, v1, -0x1

    .line 915
    .line 916
    invoke-static {v4, v1}, Lxa1;->α(II)V

    .line 917
    .line 918
    .line 919
    :goto_13
    move-object/from16 v1, p1

    .line 920
    .line 921
    move/from16 v12, v17

    .line 922
    .line 923
    move-object/from16 v2, v19

    .line 924
    .line 925
    move/from16 v15, v22

    .line 926
    .line 927
    move/from16 v5, v24

    .line 928
    .line 929
    move/from16 v24, v25

    .line 930
    .line 931
    move-object/from16 v3, v26

    .line 932
    .line 933
    move-object/from16 v4, v27

    .line 934
    .line 935
    move-object/from16 v8, v28

    .line 936
    .line 937
    move/from16 v25, v29

    .line 938
    .line 939
    move/from16 v13, v32

    .line 940
    .line 941
    move/from16 v14, v33

    .line 942
    .line 943
    goto/16 :goto_a

    .line 944
    .line 945
    :cond_1d
    const-string v0, "Required value was null."

    .line 946
    .line 947
    invoke-static {v0}, Lγ;->ρ(Ljava/lang/String;)V

    .line 948
    .line 949
    .line 950
    :goto_14
    const/16 v18, 0x0

    .line 951
    .line 952
    return-object v18

    .line 953
    :cond_1e
    const/16 v34, -0x1

    .line 954
    .line 955
    if-nez v8, :cond_1f

    .line 956
    .line 957
    move/from16 v1, v34

    .line 958
    .line 959
    :goto_15
    move/from16 v5, v20

    .line 960
    .line 961
    goto :goto_16

    .line 962
    :cond_1f
    sget-object v1, Lwa1;->α:[I

    .line 963
    .line 964
    invoke-virtual {v8}, Ljava/lang/Enum;->ordinal()I

    .line 965
    .line 966
    .line 967
    move-result v5

    .line 968
    aget v1, v1, v5

    .line 969
    .line 970
    goto :goto_15

    .line 971
    :goto_16
    if-ne v1, v5, :cond_20

    .line 972
    .line 973
    move/from16 v6, v23

    .line 974
    .line 975
    add-int/lit8 v23, v6, 0x1

    .line 976
    .line 977
    move/from16 v6, v31

    .line 978
    .line 979
    goto :goto_17

    .line 980
    :cond_20
    move/from16 v6, v23

    .line 981
    .line 982
    add-int/lit8 v1, v31, 0x1

    .line 983
    .line 984
    move v6, v1

    .line 985
    :goto_17
    if-eqz v8, :cond_21

    .line 986
    .line 987
    iget-object v1, v8, Lua1;->ε:Ljava/lang/String;

    .line 988
    .line 989
    goto :goto_18

    .line 990
    :cond_21
    const-string v1, "policy_rejected"

    .line 991
    .line 992
    :goto_18
    if-nez v8, :cond_22

    .line 993
    .line 994
    move/from16 v5, v34

    .line 995
    .line 996
    move v8, v5

    .line 997
    goto :goto_19

    .line 998
    :cond_22
    sget-object v5, Lwa1;->α:[I

    .line 999
    .line 1000
    invoke-virtual {v8}, Ljava/lang/Enum;->ordinal()I

    .line 1001
    .line 1002
    .line 1003
    move-result v8

    .line 1004
    aget v5, v5, v8

    .line 1005
    .line 1006
    move/from16 v8, v34

    .line 1007
    .line 1008
    :goto_19
    if-eq v5, v8, :cond_28

    .line 1009
    .line 1010
    const/4 v8, 0x1

    .line 1011
    if-eq v5, v8, :cond_27

    .line 1012
    .line 1013
    const/4 v8, 0x2

    .line 1014
    if-eq v5, v8, :cond_26

    .line 1015
    .line 1016
    const/4 v8, 0x3

    .line 1017
    if-eq v5, v8, :cond_25

    .line 1018
    .line 1019
    const/4 v8, 0x4

    .line 1020
    if-eq v5, v8, :cond_24

    .line 1021
    .line 1022
    const/4 v8, 0x5

    .line 1023
    if-ne v5, v8, :cond_23

    .line 1024
    .line 1025
    const-string v5, "\u670d\u52a1\u7aef\u6ca1\u6709\u4e0b\u53d1\u6709\u6548\u4eb2\u5bc6\u5ea6"

    .line 1026
    .line 1027
    goto :goto_1a

    .line 1028
    :cond_23
    invoke-static {}, Lγ;->κ()V

    .line 1029
    .line 1030
    .line 1031
    goto :goto_14

    .line 1032
    :cond_24
    const-string v5, "\u670d\u52a1\u7aef\u6ca1\u6709\u4e0b\u53d1\u5b9e\u65f6\u4ef7\u683c"

    .line 1033
    .line 1034
    goto :goto_1a

    .line 1035
    :cond_25
    const-string v5, "\u5f53\u524d\u4f1a\u8bdd\u76ee\u5f55\u6ca1\u6709\u6240\u9009\u98df\u7269"

    .line 1036
    .line 1037
    goto :goto_1a

    .line 1038
    :cond_26
    const-string v5, "\u98df\u7269\u914d\u7f6e\u65e0\u6548"

    .line 1039
    .line 1040
    goto :goto_1a

    .line 1041
    :cond_27
    const-string v5, "\u5b9e\u65f6\u4ef7\u683c\u8d85\u8fc7\u7528\u6237\u8bbe\u7f6e\u4e0a\u9650"

    .line 1042
    .line 1043
    goto :goto_1a

    .line 1044
    :cond_28
    const-string v5, "\u5b89\u5168\u7b56\u7565\u62d2\u7edd\u6295\u5582"

    .line 1045
    .line 1046
    :goto_1a
    iget-object v3, v3, Lta1;->γ:Ljava/lang/String;

    .line 1047
    .line 1048
    new-instance v8, Ljava/lang/StringBuilder;

    .line 1049
    .line 1050
    invoke-direct {v8}, Ljava/lang/StringBuilder;-><init>()V

    .line 1051
    .line 1052
    .line 1053
    invoke-virtual {v8, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1054
    .line 1055
    .line 1056
    const-string v5, "\uff1b"

    .line 1057
    .line 1058
    invoke-virtual {v8, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1059
    .line 1060
    .line 1061
    invoke-virtual {v8, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1062
    .line 1063
    .line 1064
    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 1065
    .line 1066
    .line 1067
    move-result-object v3

    .line 1068
    invoke-static {v2, v1, v3}, Lxa1;->η(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 1069
    .line 1070
    .line 1071
    invoke-interface/range {v19 .. v19}, Ljava/util/List;->size()I

    .line 1072
    .line 1073
    .line 1074
    move-result v1

    .line 1075
    const/16 v20, 0x1

    .line 1076
    .line 1077
    add-int/lit8 v1, v1, -0x1

    .line 1078
    .line 1079
    invoke-static {v4, v1}, Lxa1;->α(II)V

    .line 1080
    .line 1081
    .line 1082
    goto/16 :goto_13

    .line 1083
    .line 1084
    :goto_1b
    invoke-virtual {v7}, Ljava/util/ArrayList;->isEmpty()Z

    .line 1085
    .line 1086
    .line 1087
    move-result v1

    .line 1088
    if-nez v1, :cond_30

    .line 1089
    .line 1090
    invoke-static {}, Lxa1;->β()Ljava/lang/String;

    .line 1091
    .line 1092
    .line 1093
    move-result-object v1

    .line 1094
    move-object/from16 v2, p1

    .line 1095
    .line 1096
    invoke-static {v1, v2}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 1097
    .line 1098
    .line 1099
    move-result v1

    .line 1100
    if-eqz v1, :cond_30

    .line 1101
    .line 1102
    sget-object v1, Lse1;->α:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 1103
    .line 1104
    invoke-static {}, Lse1;->γ()Z

    .line 1105
    .line 1106
    .line 1107
    move-result v1

    .line 1108
    if-eqz v1, :cond_30

    .line 1109
    .line 1110
    const-wide/16 v3, 0x7d0

    .line 1111
    .line 1112
    :try_start_1
    invoke-static {v3, v4}, Ljava/lang/Thread;->sleep(J)V
    :try_end_1
    .catch Ljava/lang/InterruptedException; {:try_start_1 .. :try_end_1} :catch_0

    .line 1113
    .line 1114
    .line 1115
    goto :goto_1c

    .line 1116
    :catch_0
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    .line 1117
    .line 1118
    .line 1119
    move-result-object v1

    .line 1120
    invoke-virtual {v1}, Ljava/lang/Thread;->interrupt()V

    .line 1121
    .line 1122
    .line 1123
    :goto_1c
    sget-object v1, Lse1;->α:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 1124
    .line 1125
    const-string v3, "\u6295\u5582\u540e"

    .line 1126
    .line 1127
    const-string v4, "\u6295\u5582\u540e\u7b49\u5f852\u79d2\u5b8c\u6210\uff0c\u5f00\u59cb\u5b9a\u5411\u9886\u53d6\u4eb2\u5bc6\u5ea6 \u4f1a\u8bdd="

    .line 1128
    .line 1129
    invoke-static {}, Lse1;->γ()Z

    .line 1130
    .line 1131
    .line 1132
    move-result v5

    .line 1133
    if-eqz v5, :cond_30

    .line 1134
    .line 1135
    invoke-static {}, Lse1;->α()Ljava/lang/String;

    .line 1136
    .line 1137
    .line 1138
    move-result-object v5

    .line 1139
    invoke-static {v5, v2}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 1140
    .line 1141
    .line 1142
    move-result v5

    .line 1143
    if-nez v5, :cond_29

    .line 1144
    .line 1145
    goto/16 :goto_1f

    .line 1146
    .line 1147
    :cond_29
    new-instance v5, Lf7;

    .line 1148
    .line 1149
    const/4 v8, 0x1

    .line 1150
    invoke-direct {v5, v8, v7}, Lf7;-><init>(ILjava/lang/Object;)V

    .line 1151
    .line 1152
    .line 1153
    new-instance v7, Lf71;

    .line 1154
    .line 1155
    const/16 v10, 0x1b

    .line 1156
    .line 1157
    invoke-direct {v7, v10}, Lf71;-><init>(I)V

    .line 1158
    .line 1159
    .line 1160
    new-instance v10, Ly30;

    .line 1161
    .line 1162
    invoke-direct {v10, v5, v8, v7}, Ly30;-><init>(Lss1;ZLa80;)V

    .line 1163
    .line 1164
    .line 1165
    sget-object v5, Lre1;->ζ:Lre1;

    .line 1166
    .line 1167
    new-instance v7, Lbu;

    .line 1168
    .line 1169
    invoke-interface {v10}, Lss1;->iterator()Ljava/util/Iterator;

    .line 1170
    .line 1171
    .line 1172
    move-result-object v8

    .line 1173
    invoke-direct {v7, v8, v5}, Lbu;-><init>(Ljava/util/Iterator;La80;)V

    .line 1174
    .line 1175
    .line 1176
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    .line 1177
    .line 1178
    .line 1179
    move-result v5

    .line 1180
    if-nez v5, :cond_2a

    .line 1181
    .line 1182
    sget-object v5, Ljz;->ε:Ljz;

    .line 1183
    .line 1184
    goto :goto_1e

    .line 1185
    :cond_2a
    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1186
    .line 1187
    .line 1188
    move-result-object v5

    .line 1189
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    .line 1190
    .line 1191
    .line 1192
    move-result v8

    .line 1193
    if-nez v8, :cond_2b

    .line 1194
    .line 1195
    invoke-static {v5}, Lyh;->а(Ljava/lang/Object;)Ljava/util/List;

    .line 1196
    .line 1197
    .line 1198
    move-result-object v5

    .line 1199
    goto :goto_1e

    .line 1200
    :cond_2b
    invoke-static {v5}, Llz1;->φ(Ljava/lang/Object;)Ljava/util/ArrayList;

    .line 1201
    .line 1202
    .line 1203
    move-result-object v5

    .line 1204
    :goto_1d
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    .line 1205
    .line 1206
    .line 1207
    move-result v8

    .line 1208
    if-eqz v8, :cond_2c

    .line 1209
    .line 1210
    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1211
    .line 1212
    .line 1213
    move-result-object v8

    .line 1214
    invoke-virtual {v5, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1215
    .line 1216
    .line 1217
    goto :goto_1d

    .line 1218
    :cond_2c
    :goto_1e
    invoke-interface {v5}, Ljava/util/List;->isEmpty()Z

    .line 1219
    .line 1220
    .line 1221
    move-result v7

    .line 1222
    if-eqz v7, :cond_2d

    .line 1223
    .line 1224
    goto :goto_1f

    .line 1225
    :cond_2d
    new-instance v7, Lkt0;

    .line 1226
    .line 1227
    const/16 v8, 0xe

    .line 1228
    .line 1229
    invoke-direct {v7, v8}, Lkt0;-><init>(I)V

    .line 1230
    .line 1231
    .line 1232
    const/16 v8, 0x2d

    .line 1233
    .line 1234
    invoke-static {v8, v7}, Lse1;->η(ILp70;)Z

    .line 1235
    .line 1236
    .line 1237
    move-result v7

    .line 1238
    const-string v8, "rb4e434d444870f0e"

    .line 1239
    .line 1240
    if-nez v7, :cond_2e

    .line 1241
    .line 1242
    const-string v0, "\u6295\u5582\u540e\u4eb2\u5bc6\u5ea6\u9886\u53d6\u8df3\u8fc7 reason=execution_busy_timeout"

    .line 1243
    .line 1244
    const/4 v2, 0x4

    .line 1245
    const/4 v4, 0x0

    .line 1246
    invoke-static {v8, v0, v4, v2, v4}, Lux;->ω(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ILjava/lang/Object;)V

    .line 1247
    .line 1248
    .line 1249
    goto :goto_1f

    .line 1250
    :cond_2e
    const/4 v7, 0x0

    .line 1251
    const/4 v10, 0x1

    .line 1252
    invoke-virtual {v1, v7, v10}, Ljava/util/concurrent/atomic/AtomicBoolean;->compareAndSet(ZZ)Z

    .line 1253
    .line 1254
    .line 1255
    move-result v11

    .line 1256
    if-nez v11, :cond_2f

    .line 1257
    .line 1258
    goto :goto_1f

    .line 1259
    :cond_2f
    :try_start_2
    invoke-interface {v5}, Ljava/util/List;->size()I

    .line 1260
    .line 1261
    .line 1262
    move-result v7

    .line 1263
    new-instance v10, Ljava/lang/StringBuilder;

    .line 1264
    .line 1265
    invoke-direct {v10, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 1266
    .line 1267
    .line 1268
    invoke-virtual {v10, v7}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 1269
    .line 1270
    .line 1271
    invoke-virtual {v10}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 1272
    .line 1273
    .line 1274
    move-result-object v4

    .line 1275
    const/4 v7, 0x4

    .line 1276
    const/4 v10, 0x0

    .line 1277
    invoke-static {v8, v4, v10, v7, v10}, Lux;->ω(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ILjava/lang/Object;)V

    .line 1278
    .line 1279
    .line 1280
    const/4 v10, 0x1

    .line 1281
    invoke-static {v0, v10, v2, v5}, Lse1;->β(Ljava/lang/ClassLoader;ZLjava/lang/String;Ljava/util/List;)Lqe1;

    .line 1282
    .line 1283
    .line 1284
    move-result-object v0

    .line 1285
    iget-object v0, v0, Lqe1;->ζ:Ljava/lang/String;

    .line 1286
    .line 1287
    new-instance v2, Ljava/lang/StringBuilder;

    .line 1288
    .line 1289
    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 1290
    .line 1291
    .line 1292
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1293
    .line 1294
    .line 1295
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 1296
    .line 1297
    .line 1298
    move-result-object v0

    .line 1299
    const/4 v2, 0x4

    .line 1300
    const/4 v4, 0x0

    .line 1301
    invoke-static {v8, v0, v4, v2, v4}, Lux;->ω(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ILjava/lang/Object;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 1302
    .line 1303
    .line 1304
    const/4 v7, 0x0

    .line 1305
    invoke-virtual {v1, v7}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    .line 1306
    .line 1307
    .line 1308
    goto :goto_1f

    .line 1309
    :catchall_1
    move-exception v0

    .line 1310
    const/4 v7, 0x0

    .line 1311
    invoke-virtual {v1, v7}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    .line 1312
    .line 1313
    .line 1314
    throw v0

    .line 1315
    :cond_30
    :goto_1f
    invoke-interface/range {v19 .. v19}, Ljava/util/List;->size()I

    .line 1316
    .line 1317
    .line 1318
    move-result v0

    .line 1319
    const-string v1, ", \u6210\u529f "

    .line 1320
    .line 1321
    const-string v2, ", \u4eba\u5458\u5173\u95ed "

    .line 1322
    .line 1323
    const-string v3, "\u81ea\u52a8\u6295\u5582\u5b8c\u6210: \u4f1a\u8bdd "

    .line 1324
    .line 1325
    move/from16 v14, v33

    .line 1326
    .line 1327
    invoke-static {v3, v0, v1, v14, v2}, Lnx;->ο(Ljava/lang/String;ILjava/lang/String;ILjava/lang/String;)Ljava/lang/StringBuilder;

    .line 1328
    .line 1329
    .line 1330
    move-result-object v0

    .line 1331
    const-string v1, ", \u76ee\u5f55\u4e0d\u53ef\u7528 "

    .line 1332
    .line 1333
    const-string v2, ", \u4ef7\u683c\u62e6\u622a "

    .line 1334
    .line 1335
    move/from16 v3, v31

    .line 1336
    .line 1337
    move/from16 v13, v32

    .line 1338
    .line 1339
    invoke-static {v0, v13, v1, v3, v2}, Lnx;->Α(Ljava/lang/StringBuilder;ILjava/lang/String;ILjava/lang/String;)V

    .line 1340
    .line 1341
    .line 1342
    const-string v1, ", \u8df3\u8fc7 "

    .line 1343
    .line 1344
    const-string v2, ", \u5931\u8d25 "

    .line 1345
    .line 1346
    move/from16 v4, v25

    .line 1347
    .line 1348
    invoke-static {v0, v6, v1, v4, v2}, Lnx;->Α(Ljava/lang/StringBuilder;ILjava/lang/String;ILjava/lang/String;)V

    .line 1349
    .line 1350
    .line 1351
    move/from16 v15, v29

    .line 1352
    .line 1353
    invoke-virtual {v0, v15}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 1354
    .line 1355
    .line 1356
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 1357
    .line 1358
    .line 1359
    move-result-object v0

    .line 1360
    const/4 v2, 0x4

    .line 1361
    const/4 v5, 0x0

    .line 1362
    invoke-static {v9, v0, v5, v2, v5}, Lux;->ω(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ILjava/lang/Object;)V

    .line 1363
    .line 1364
    .line 1365
    new-instance v13, Lva1;

    .line 1366
    .line 1367
    invoke-interface/range {v19 .. v19}, Ljava/util/List;->size()I

    .line 1368
    .line 1369
    .line 1370
    move-result v1

    .line 1371
    move/from16 v18, v3

    .line 1372
    .line 1373
    move/from16 v20, v4

    .line 1374
    .line 1375
    move/from16 v19, v6

    .line 1376
    .line 1377
    move/from16 v16, v14

    .line 1378
    .line 1379
    move/from16 v21, v15

    .line 1380
    .line 1381
    move/from16 v15, v22

    .line 1382
    .line 1383
    move/from16 v17, v32

    .line 1384
    .line 1385
    move-object/from16 v22, v0

    .line 1386
    .line 1387
    move v14, v1

    .line 1388
    invoke-direct/range {v13 .. v22}, Lva1;-><init>(IIIIIIIILjava/lang/String;)V

    .line 1389
    .line 1390
    .line 1391
    return-object v13
.end method

.method public static δ()V
    .locals 2

    .line 1
    sget-object v0, Lxa1;->β:Ljava/util/concurrent/atomic/AtomicReference;

    .line 2
    .line 3
    const-string v1, ""

    .line 4
    .line 5
    invoke-virtual {v0, v1}, Ljava/util/concurrent/atomic/AtomicReference;->set(Ljava/lang/Object;)V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public static ε()Z
    .locals 2

    .line 1
    invoke-static {}, Lx9;->η()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x0

    .line 6
    if-eqz v0, :cond_1

    .line 7
    .line 8
    invoke-static {}, Lui1;->Α()Z

    .line 9
    .line 10
    .line 11
    move-result v0

    .line 12
    if-nez v0, :cond_0

    .line 13
    .line 14
    goto :goto_0

    .line 15
    :cond_0
    const-string v0, "pet_elf_auto_feed_enabled"

    .line 16
    .line 17
    invoke-static {v0, v1}, Lui1;->η(Ljava/lang/String;Z)Z

    .line 18
    .line 19
    .line 20
    move-result v0

    .line 21
    return v0

    .line 22
    :cond_1
    :goto_0
    return v1
.end method

.method public static ζ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 3

    .line 1
    if-nez p2, :cond_0

    .line 2
    .line 3
    const-string p2, ""

    .line 4
    .line 5
    :cond_0
    const/16 v0, 0xa0

    .line 6
    .line 7
    invoke-static {p2, v0}, Lxa1;->ι(Ljava/lang/String;I)Ljava/lang/String;

    .line 8
    .line 9
    .line 10
    move-result-object p2

    .line 11
    const-string v0, " reason="

    .line 12
    .line 13
    const-string v1, " detail="

    .line 14
    .line 15
    const-string v2, "\u81ea\u52a8\u6295\u5582\u5931\u8d25 name="

    .line 16
    .line 17
    invoke-static {v2, p0, v0, p1, v1}, Llz1;->υ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 18
    .line 19
    .line 20
    move-result-object p0

    .line 21
    invoke-virtual {p0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 22
    .line 23
    .line 24
    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 25
    .line 26
    .line 27
    move-result-object p0

    .line 28
    const/4 p1, 0x4

    .line 29
    const-string p2, "r87045d6703eaa6c4"

    .line 30
    .line 31
    const/4 v0, 0x0

    .line 32
    invoke-static {p2, p0, v0, p1, v0}, Lux;->ω(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ILjava/lang/Object;)V

    .line 33
    .line 34
    .line 35
    return-void
.end method

.method public static η(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 3

    .line 1
    const/16 v0, 0xa0

    .line 2
    .line 3
    invoke-static {p2, v0}, Lxa1;->ι(Ljava/lang/String;I)Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object p2

    .line 7
    const-string v0, " reason="

    .line 8
    .line 9
    const-string v1, " detail="

    .line 10
    .line 11
    const-string v2, "\u81ea\u52a8\u6295\u5582\u8df3\u8fc7 name="

    .line 12
    .line 13
    invoke-static {v2, p0, v0, p1, v1}, Llz1;->υ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    invoke-virtual {p0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 18
    .line 19
    .line 20
    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 21
    .line 22
    .line 23
    move-result-object p0

    .line 24
    const/4 p1, 0x0

    .line 25
    const/4 p2, 0x4

    .line 26
    const-string v0, "r87045d6703eaa6c4"

    .line 27
    .line 28
    invoke-static {v0, p0, p1, p2, p1}, Lux;->ω(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ILjava/lang/Object;)V

    .line 29
    .line 30
    .line 31
    return-void
.end method

.method public static θ(Landroid/app/Activity;)V
    .locals 3

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    new-instance v0, Ljava/lang/ref/WeakReference;

    .line 5
    .line 6
    invoke-direct {v0, p0}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    .line 7
    .line 8
    .line 9
    sget-object p0, Lxa1;->γ:Ljava/util/concurrent/atomic/AtomicReference;

    .line 10
    .line 11
    invoke-virtual {p0, v0}, Ljava/util/concurrent/atomic/AtomicReference;->set(Ljava/lang/Object;)V

    .line 12
    .line 13
    .line 14
    invoke-static {}, Lxa1;->ε()Z

    .line 15
    .line 16
    .line 17
    move-result p0

    .line 18
    if-nez p0, :cond_0

    .line 19
    .line 20
    goto :goto_0

    .line 21
    :cond_0
    invoke-static {}, Lxa1;->β()Ljava/lang/String;

    .line 22
    .line 23
    .line 24
    move-result-object p0

    .line 25
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    .line 26
    .line 27
    .line 28
    move-result v0

    .line 29
    if-lez v0, :cond_1

    .line 30
    .line 31
    sget-object v0, Lxa1;->β:Ljava/util/concurrent/atomic/AtomicReference;

    .line 32
    .line 33
    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    .line 34
    .line 35
    .line 36
    move-result-object v0

    .line 37
    invoke-static {v0, p0}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 38
    .line 39
    .line 40
    move-result p0

    .line 41
    if-eqz p0, :cond_1

    .line 42
    .line 43
    goto :goto_0

    .line 44
    :cond_1
    sget-object p0, Lxa1;->α:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 45
    .line 46
    const/4 v0, 0x0

    .line 47
    const/4 v1, 0x1

    .line 48
    invoke-virtual {p0, v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;->compareAndSet(ZZ)Z

    .line 49
    .line 50
    .line 51
    move-result p0

    .line 52
    if-nez p0, :cond_2

    .line 53
    .line 54
    :goto_0
    return-void

    .line 55
    :cond_2
    new-instance p0, Ljava/lang/Thread;

    .line 56
    .line 57
    new-instance v0, Lfb0;

    .line 58
    .line 59
    const/16 v2, 0xc

    .line 60
    .line 61
    invoke-direct {v0, v2}, Lfb0;-><init>(I)V

    .line 62
    .line 63
    .line 64
    const-string v2, "r26540c2252536895"

    .line 65
    .line 66
    invoke-direct {p0, v0, v2}, Ljava/lang/Thread;-><init>(Ljava/lang/Runnable;Ljava/lang/String;)V

    .line 67
    .line 68
    .line 69
    invoke-virtual {p0, v1}, Ljava/lang/Thread;->setDaemon(Z)V

    .line 70
    .line 71
    .line 72
    invoke-virtual {p0}, Ljava/lang/Thread;->start()V

    .line 73
    .line 74
    .line 75
    return-void
.end method

.method public static ι(Ljava/lang/String;I)Ljava/lang/String;
    .locals 2

    .line 1
    const/16 v0, 0xd

    .line 2
    .line 3
    const/16 v1, 0x20

    .line 4
    .line 5
    invoke-static {p0, v0, v1}, Lx02;->Μ(Ljava/lang/String;CC)Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    const/16 v0, 0xa

    .line 10
    .line 11
    invoke-virtual {p0, v0, v1}, Ljava/lang/String;->replace(CC)Ljava/lang/String;

    .line 12
    .line 13
    .line 14
    move-result-object p0

    .line 15
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 16
    .line 17
    .line 18
    invoke-static {p0}, Lq02;->Б(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 23
    .line 24
    .line 25
    move-result-object p0

    .line 26
    invoke-static {p0, p1}, Lq02;->я(Ljava/lang/String;I)Ljava/lang/String;

    .line 27
    .line 28
    .line 29
    move-result-object p0

    .line 30
    return-object p0
.end method

.method public static κ()Ljava/util/List;
    .locals 4

    .line 1
    sget-object v0, Lry1;->τ:Ljava/util/concurrent/ConcurrentHashMap;

    .line 2
    .line 3
    invoke-static {v0}, Lex0;->Ο(Ljava/util/Map;)Ljava/util/Map;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-interface {v0}, Ljava/util/Map;->values()Ljava/util/Collection;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    check-cast v0, Ljava/lang/Iterable;

    .line 12
    .line 13
    invoke-static {v0}, Lxh;->я(Ljava/lang/Iterable;)Lf7;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    new-instance v1, Lf71;

    .line 18
    .line 19
    const/4 v2, 0x7

    .line 20
    invoke-direct {v1, v2}, Lf71;-><init>(I)V

    .line 21
    .line 22
    .line 23
    new-instance v2, Ly30;

    .line 24
    .line 25
    const/4 v3, 0x1

    .line 26
    invoke-direct {v2, v0, v3, v1}, Ly30;-><init>(Lss1;ZLa80;)V

    .line 27
    .line 28
    .line 29
    new-instance v0, Luh0;

    .line 30
    .line 31
    const/16 v1, 0x1a

    .line 32
    .line 33
    invoke-direct {v0, v1}, Luh0;-><init>(I)V

    .line 34
    .line 35
    .line 36
    invoke-static {v2}, Lus1;->Η(Lss1;)Ljava/util/List;

    .line 37
    .line 38
    .line 39
    move-result-object v1

    .line 40
    invoke-static {v1, v0}, Lai;->щ(Ljava/util/List;Ljava/util/Comparator;)V

    .line 41
    .line 42
    .line 43
    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 44
    .line 45
    .line 46
    move-result-object v0

    .line 47
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 48
    .line 49
    .line 50
    move-result v1

    .line 51
    if-nez v1, :cond_0

    .line 52
    .line 53
    sget-object v0, Ljz;->ε:Ljz;

    .line 54
    .line 55
    goto :goto_1

    .line 56
    :cond_0
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 57
    .line 58
    .line 59
    move-result-object v1

    .line 60
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 61
    .line 62
    .line 63
    move-result v2

    .line 64
    if-nez v2, :cond_1

    .line 65
    .line 66
    invoke-static {v1}, Lyh;->а(Ljava/lang/Object;)Ljava/util/List;

    .line 67
    .line 68
    .line 69
    move-result-object v0

    .line 70
    goto :goto_1

    .line 71
    :cond_1
    invoke-static {v1}, Llz1;->φ(Ljava/lang/Object;)Ljava/util/ArrayList;

    .line 72
    .line 73
    .line 74
    move-result-object v1

    .line 75
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 76
    .line 77
    .line 78
    move-result v2

    .line 79
    if-eqz v2, :cond_2

    .line 80
    .line 81
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 82
    .line 83
    .line 84
    move-result-object v2

    .line 85
    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 86
    .line 87
    .line 88
    goto :goto_0

    .line 89
    :cond_2
    move-object v0, v1

    .line 90
    :goto_1
    return-object v0
.end method

.method public static λ(ILp70;)Z
    .locals 6

    .line 1
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 2
    .line 3
    .line 4
    move-result-wide v0

    .line 5
    int-to-long v2, p0

    .line 6
    const-wide/16 v4, 0x3e8

    .line 7
    .line 8
    mul-long/2addr v2, v4

    .line 9
    add-long/2addr v2, v0

    .line 10
    :goto_0
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 11
    .line 12
    .line 13
    move-result-wide v0

    .line 14
    cmp-long p0, v0, v2

    .line 15
    .line 16
    if-gez p0, :cond_2

    .line 17
    .line 18
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    invoke-virtual {p0}, Ljava/lang/Thread;->isInterrupted()Z

    .line 23
    .line 24
    .line 25
    move-result p0

    .line 26
    if-eqz p0, :cond_0

    .line 27
    .line 28
    const/4 p0, 0x0

    .line 29
    return p0

    .line 30
    :cond_0
    invoke-interface {p1}, Lp70;->invoke()Ljava/lang/Object;

    .line 31
    .line 32
    .line 33
    move-result-object p0

    .line 34
    check-cast p0, Ljava/lang/Boolean;

    .line 35
    .line 36
    invoke-virtual {p0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 37
    .line 38
    .line 39
    move-result p0

    .line 40
    if-eqz p0, :cond_1

    .line 41
    .line 42
    const/4 p0, 0x1

    .line 43
    return p0

    .line 44
    :cond_1
    const-wide/16 v0, 0x1f4

    .line 45
    .line 46
    :try_start_0
    invoke-static {v0, v1}, Ljava/lang/Thread;->sleep(J)V
    :try_end_0
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_0

    .line 47
    .line 48
    .line 49
    goto :goto_0

    .line 50
    :catch_0
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    .line 51
    .line 52
    .line 53
    move-result-object p0

    .line 54
    invoke-virtual {p0}, Ljava/lang/Thread;->interrupt()V

    .line 55
    .line 56
    .line 57
    goto :goto_0

    .line 58
    :cond_2
    invoke-interface {p1}, Lp70;->invoke()Ljava/lang/Object;

    .line 59
    .line 60
    .line 61
    move-result-object p0

    .line 62
    check-cast p0, Ljava/lang/Boolean;

    .line 63
    .line 64
    invoke-virtual {p0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 65
    .line 66
    .line 67
    move-result p0

    .line 68
    return p0
.end method
