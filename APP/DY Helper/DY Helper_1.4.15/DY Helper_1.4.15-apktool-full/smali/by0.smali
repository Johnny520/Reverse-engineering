.class public final synthetic Lby0;
.super Ljava/lang/Object;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"

# interfaces
.implements Lp70;


# instance fields
.field public final synthetic ε:I

.field public final synthetic ζ:Ljava/lang/String;

.field public final synthetic η:Ljava/lang/String;

.field public final synthetic θ:I

.field public final synthetic ι:Landroid/app/Activity;

.field public final synthetic κ:Z

.field public final synthetic λ:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Lf8;Landroid/app/Activity;ILjava/lang/String;ZLjava/lang/String;)V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    iput v0, p0, Lby0;->ε:I

    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    iput-object p1, p0, Lby0;->λ:Ljava/lang/Object;

    .line 8
    .line 9
    iput-object p2, p0, Lby0;->ι:Landroid/app/Activity;

    .line 10
    .line 11
    iput p3, p0, Lby0;->θ:I

    .line 12
    .line 13
    iput-object p4, p0, Lby0;->ζ:Ljava/lang/String;

    .line 14
    .line 15
    iput-boolean p5, p0, Lby0;->κ:Z

    .line 16
    .line 17
    iput-object p6, p0, Lby0;->η:Ljava/lang/String;

    .line 18
    .line 19
    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILandroid/app/Activity;Z)V
    .locals 1

    .line 20
    const/4 v0, 0x1

    iput v0, p0, Lby0;->ε:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lby0;->ζ:Ljava/lang/String;

    iput-object p2, p0, Lby0;->η:Ljava/lang/String;

    iput-object p3, p0, Lby0;->λ:Ljava/lang/Object;

    iput p4, p0, Lby0;->θ:I

    iput-object p5, p0, Lby0;->ι:Landroid/app/Activity;

    iput-boolean p6, p0, Lby0;->κ:Z

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 22

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget v1, v0, Lby0;->ε:I

    .line 4
    .line 5
    sget-object v2, Ls62;->α:Ls62;

    .line 6
    .line 7
    iget-object v3, v0, Lby0;->λ:Ljava/lang/Object;

    .line 8
    .line 9
    packed-switch v1, :pswitch_data_0

    .line 10
    .line 11
    .line 12
    check-cast v3, Ljava/lang/String;

    .line 13
    .line 14
    sget-object v1, Lcom/example/dyhelper/ui/а;->α:Landroid/os/Handler;

    .line 15
    .line 16
    sget-object v1, Lcom/example/dyhelper/ui/а;->ε:Ljava/util/LinkedHashMap;

    .line 17
    .line 18
    iget-object v4, v0, Lby0;->ζ:Ljava/lang/String;

    .line 19
    .line 20
    invoke-virtual {v1, v4}, Ljava/util/AbstractMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 21
    .line 22
    .line 23
    move-result-object v1

    .line 24
    check-cast v1, Ljava/lang/Runnable;

    .line 25
    .line 26
    if-eqz v1, :cond_0

    .line 27
    .line 28
    sget-object v5, Lcom/example/dyhelper/ui/а;->α:Landroid/os/Handler;

    .line 29
    .line 30
    invoke-virtual {v5, v1}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    .line 31
    .line 32
    .line 33
    :cond_0
    sget-object v1, Lf52;->ε:Lf52;

    .line 34
    .line 35
    iget-object v5, v0, Lby0;->η:Ljava/lang/String;

    .line 36
    .line 37
    iget v6, v0, Lby0;->θ:I

    .line 38
    .line 39
    invoke-static {v4, v5, v3, v6, v1}, Lcom/example/dyhelper/ui/а;->ξ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILf52;)V

    .line 40
    .line 41
    .line 42
    iget-object v1, v0, Lby0;->ι:Landroid/app/Activity;

    .line 43
    .line 44
    iget-boolean v0, v0, Lby0;->κ:Z

    .line 45
    .line 46
    invoke-static {v1, v0}, Lcom/example/dyhelper/ui/а;->ι(Landroid/app/Activity;Z)V

    .line 47
    .line 48
    .line 49
    return-object v2

    .line 50
    :pswitch_0
    check-cast v3, Lf8;

    .line 51
    .line 52
    iget-object v4, v0, Lby0;->ι:Landroid/app/Activity;

    .line 53
    .line 54
    iget v7, v0, Lby0;->θ:I

    .line 55
    .line 56
    iget-object v8, v0, Lby0;->ζ:Ljava/lang/String;

    .line 57
    .line 58
    iget-boolean v9, v0, Lby0;->κ:Z

    .line 59
    .line 60
    iget-object v1, v0, Lby0;->η:Ljava/lang/String;

    .line 61
    .line 62
    const-string v13, "\u4e0b\u8f7d\u89c6\u9891"

    .line 63
    .line 64
    const-string v14, "/"

    .line 65
    .line 66
    sget-object v15, Lqy0;->α:Lqy0;

    .line 67
    .line 68
    :try_start_0
    new-instance v5, Ljava/util/LinkedHashSet;

    .line 69
    .line 70
    invoke-direct {v5}, Ljava/util/LinkedHashSet;-><init>()V

    .line 71
    .line 72
    .line 73
    invoke-virtual {v3}, Lf8;->η()Ljava/lang/String;

    .line 74
    .line 75
    .line 76
    move-result-object v0

    .line 77
    invoke-static {v5, v0}, Lqy0;->Υ(Ljava/util/LinkedHashSet;Ljava/lang/String;)V

    .line 78
    .line 79
    .line 80
    iget-object v0, v3, Lf8;->γ:Ljava/util/List;

    .line 81
    .line 82
    if-nez v0, :cond_1

    .line 83
    .line 84
    sget-object v0, Ljz;->ε:Ljz;

    .line 85
    .line 86
    goto :goto_0

    .line 87
    :catchall_0
    move-exception v0

    .line 88
    move-object/from16 v20, v2

    .line 89
    .line 90
    goto/16 :goto_8

    .line 91
    .line 92
    :cond_1
    :goto_0
    new-instance v6, Luh0;

    .line 93
    .line 94
    const/16 v10, 0x13

    .line 95
    .line 96
    invoke-direct {v6, v10}, Luh0;-><init>(I)V

    .line 97
    .line 98
    .line 99
    invoke-static {v0, v6}, Lxh;->Я(Ljava/lang/Iterable;Ljava/util/Comparator;)Ljava/util/List;

    .line 100
    .line 101
    .line 102
    move-result-object v0

    .line 103
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 104
    .line 105
    .line 106
    move-result-object v0

    .line 107
    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 108
    .line 109
    .line 110
    move-result v6

    .line 111
    if-eqz v6, :cond_2

    .line 112
    .line 113
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 114
    .line 115
    .line 116
    move-result-object v6

    .line 117
    check-cast v6, Ljava/lang/String;

    .line 118
    .line 119
    invoke-static {v5, v6}, Lqy0;->Υ(Ljava/util/LinkedHashSet;Ljava/lang/String;)V

    .line 120
    .line 121
    .line 122
    goto :goto_1

    .line 123
    :cond_2
    invoke-virtual {v5}, Ljava/util/AbstractCollection;->isEmpty()Z

    .line 124
    .line 125
    .line 126
    move-result v0

    .line 127
    if-nez v0, :cond_5

    .line 128
    .line 129
    invoke-interface {v5}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 130
    .line 131
    .line 132
    move-result-object v16

    .line 133
    const/16 v17, 0x0

    .line 134
    .line 135
    move-object/from16 v10, v17

    .line 136
    .line 137
    const/4 v0, 0x0

    .line 138
    :goto_2
    invoke-interface/range {v16 .. v16}, Ljava/util/Iterator;->hasNext()Z

    .line 139
    .line 140
    .line 141
    move-result v11

    .line 142
    if-eqz v11, :cond_3

    .line 143
    .line 144
    add-int/lit8 v10, v0, 0x1

    .line 145
    .line 146
    invoke-interface/range {v16 .. v16}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 147
    .line 148
    .line 149
    move-result-object v0

    .line 150
    check-cast v0, Ljava/lang/String;

    .line 151
    .line 152
    const-string v11, "dyhelper_video_"

    .line 153
    .line 154
    const-string v12, ".mp4"

    .line 155
    .line 156
    invoke-virtual {v4}, Landroid/content/Context;->getCacheDir()Ljava/io/File;

    .line 157
    .line 158
    .line 159
    move-result-object v6

    .line 160
    invoke-static {v11, v12, v6}, Ljava/io/File;->createTempFile(Ljava/lang/String;Ljava/lang/String;Ljava/io/File;)Ljava/io/File;

    .line 161
    .line 162
    .line 163
    move-result-object v6
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 164
    :try_start_1
    iget-object v11, v3, Lf8;->θ:Ljava/lang/String;

    .line 165
    .line 166
    invoke-virtual {v5}, Ljava/util/AbstractCollection;->size()I

    .line 167
    .line 168
    .line 169
    move-result v12
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_9

    .line 170
    move-object/from16 v18, v1

    .line 171
    .line 172
    :try_start_2
    invoke-static {v15, v0}, Lqy0;->ю(Lqy0;Ljava/lang/String;)Ljava/lang/String;

    .line 173
    .line 174
    .line 175
    move-result-object v1

    .line 176
    move-object/from16 v19, v0

    .line 177
    .line 178
    new-instance v0, Ljava/lang/StringBuilder;

    .line 179
    .line 180
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_8

    .line 181
    .line 182
    .line 183
    move-object/from16 v20, v2

    .line 184
    .line 185
    :try_start_3
    const-string v2, "DYHelper: [VIDEO-DL] awemeId="

    .line 186
    .line 187
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 188
    .line 189
    .line 190
    invoke-virtual {v0, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 191
    .line 192
    .line 193
    const-string v2, ", candidate="

    .line 194
    .line 195
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 196
    .line 197
    .line 198
    invoke-virtual {v0, v10}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 199
    .line 200
    .line 201
    invoke-virtual {v0, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 202
    .line 203
    .line 204
    invoke-virtual {v0, v12}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 205
    .line 206
    .line 207
    const-string v2, ", url="

    .line 208
    .line 209
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 210
    .line 211
    .line 212
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 213
    .line 214
    .line 215
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 216
    .line 217
    .line 218
    move-result-object v0

    .line 219
    invoke-static {v0}, Lux;->ζ(Ljava/lang/String;)V

    .line 220
    .line 221
    .line 222
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_7

    .line 223
    .line 224
    .line 225
    move v1, v10

    .line 226
    :try_start_4
    const-string v10, "\u4e0b\u8f7d\u89c6\u9891"

    .line 227
    .line 228
    new-instance v11, Lig;

    .line 229
    .line 230
    const/16 v0, 0x1d

    .line 231
    .line 232
    invoke-direct {v11, v0}, Lig;-><init>(I)V

    .line 233
    .line 234
    .line 235
    new-instance v12, Lgy0;
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_6

    .line 236
    .line 237
    const/4 v2, 0x0

    .line 238
    :try_start_5
    invoke-direct {v12, v2}, Lgy0;-><init>(I)V
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_5

    .line 239
    .line 240
    .line 241
    move-object/from16 v21, v19

    .line 242
    .line 243
    move/from16 v19, v2

    .line 244
    .line 245
    move-object v2, v5

    .line 246
    move-object/from16 v5, v21

    .line 247
    .line 248
    :try_start_6
    invoke-static/range {v4 .. v12}, Lqy0;->Σ(Landroid/content/Context;Ljava/lang/String;Ljava/io/File;ILjava/lang/String;ZLjava/lang/String;Le80;Le80;)V
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_4

    .line 249
    .line 250
    .line 251
    move v10, v7

    .line 252
    move v11, v9

    .line 253
    :try_start_7
    sget-object v9, Landroid/os/Environment;->DIRECTORY_MOVIES:Ljava/lang/String;

    .line 254
    .line 255
    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_3

    .line 256
    .line 257
    .line 258
    move-object v5, v4

    .line 259
    move-object v4, v15

    .line 260
    move-object/from16 v7, v18

    .line 261
    .line 262
    :try_start_8
    invoke-virtual/range {v4 .. v9}, Lqy0;->п(Landroid/content/Context;Ljava/io/File;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_2

    .line 263
    .line 264
    .line 265
    move-object v4, v5

    .line 266
    :try_start_9
    invoke-virtual {v6}, Ljava/io/File;->delete()Z

    .line 267
    .line 268
    .line 269
    const-string v0, "\u4e0b\u8f7d\u5b8c\u6210"

    .line 270
    .line 271
    const-string v1, "\u89c6\u9891\u5df2\u4fdd\u5b58"

    .line 272
    .line 273
    invoke-static {v4, v0, v1, v13}, Lqy0;->Е(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 274
    .line 275
    .line 276
    new-instance v0, Lxx0;

    .line 277
    .line 278
    const/4 v1, 0x5

    .line 279
    invoke-direct {v0, v4, v8, v1}, Lxx0;-><init>(Landroid/app/Activity;Ljava/lang/String;I)V

    .line 280
    .line 281
    .line 282
    invoke-virtual {v4, v0}, Landroid/app/Activity;->runOnUiThread(Ljava/lang/Runnable;)V
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_1

    .line 283
    .line 284
    .line 285
    goto/16 :goto_9

    .line 286
    .line 287
    :catchall_1
    move-exception v0

    .line 288
    goto/16 :goto_8

    .line 289
    .line 290
    :catchall_2
    move-exception v0

    .line 291
    move-object/from16 v18, v5

    .line 292
    .line 293
    move-object v5, v4

    .line 294
    move-object/from16 v4, v18

    .line 295
    .line 296
    move-object/from16 v18, v7

    .line 297
    .line 298
    goto :goto_7

    .line 299
    :catchall_3
    move-exception v0

    .line 300
    :goto_3
    move-object v5, v15

    .line 301
    goto :goto_7

    .line 302
    :catchall_4
    move-exception v0

    .line 303
    :goto_4
    move v10, v7

    .line 304
    move v11, v9

    .line 305
    goto :goto_3

    .line 306
    :catchall_5
    move-exception v0

    .line 307
    move/from16 v19, v2

    .line 308
    .line 309
    move-object v2, v5

    .line 310
    goto :goto_4

    .line 311
    :catchall_6
    move-exception v0

    .line 312
    move-object v2, v5

    .line 313
    move v10, v7

    .line 314
    move v11, v9

    .line 315
    move-object v5, v15

    .line 316
    const/16 v19, 0x0

    .line 317
    .line 318
    goto :goto_7

    .line 319
    :catchall_7
    move-exception v0

    .line 320
    :goto_5
    move-object v2, v5

    .line 321
    move v11, v9

    .line 322
    move v1, v10

    .line 323
    move-object v5, v15

    .line 324
    const/16 v19, 0x0

    .line 325
    .line 326
    move v10, v7

    .line 327
    goto :goto_7

    .line 328
    :catchall_8
    move-exception v0

    .line 329
    :goto_6
    move-object/from16 v20, v2

    .line 330
    .line 331
    goto :goto_5

    .line 332
    :catchall_9
    move-exception v0

    .line 333
    move-object/from16 v18, v1

    .line 334
    .line 335
    goto :goto_6

    .line 336
    :goto_7
    :try_start_a
    invoke-virtual {v2}, Ljava/util/AbstractCollection;->size()I

    .line 337
    .line 338
    .line 339
    move-result v7

    .line 340
    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 341
    .line 342
    .line 343
    move-result-object v9

    .line 344
    new-instance v12, Ljava/lang/StringBuilder;

    .line 345
    .line 346
    invoke-direct {v12}, Ljava/lang/StringBuilder;-><init>()V

    .line 347
    .line 348
    .line 349
    const-string v15, "DYHelper: [VIDEO-DL-RETRY] \u5019\u9009 "

    .line 350
    .line 351
    invoke-virtual {v12, v15}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 352
    .line 353
    .line 354
    invoke-virtual {v12, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 355
    .line 356
    .line 357
    invoke-virtual {v12, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 358
    .line 359
    .line 360
    invoke-virtual {v12, v7}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 361
    .line 362
    .line 363
    const-string v7, " \u5931\u8d25: "

    .line 364
    .line 365
    invoke-virtual {v12, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 366
    .line 367
    .line 368
    invoke-virtual {v12, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 369
    .line 370
    .line 371
    invoke-virtual {v12}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 372
    .line 373
    .line 374
    move-result-object v7

    .line 375
    invoke-static {v7}, Lux;->ζ(Ljava/lang/String;)V
    :try_end_a
    .catchall {:try_start_a .. :try_end_a} :catchall_a

    .line 376
    .line 377
    .line 378
    :try_start_b
    invoke-virtual {v6}, Ljava/io/File;->delete()Z

    .line 379
    .line 380
    .line 381
    move-object v15, v5

    .line 382
    move v7, v10

    .line 383
    move v9, v11

    .line 384
    move-object v10, v0

    .line 385
    move v0, v1

    .line 386
    move-object v5, v2

    .line 387
    move-object/from16 v1, v18

    .line 388
    .line 389
    move-object/from16 v2, v20

    .line 390
    .line 391
    goto/16 :goto_2

    .line 392
    .line 393
    :catchall_a
    move-exception v0

    .line 394
    invoke-virtual {v6}, Ljava/io/File;->delete()Z

    .line 395
    .line 396
    .line 397
    throw v0

    .line 398
    :cond_3
    move-object/from16 v20, v2

    .line 399
    .line 400
    new-instance v0, Ljava/lang/Exception;

    .line 401
    .line 402
    if-eqz v10, :cond_4

    .line 403
    .line 404
    invoke-virtual {v10}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 405
    .line 406
    .line 407
    move-result-object v17

    .line 408
    :cond_4
    move-object/from16 v1, v17

    .line 409
    .line 410
    new-instance v2, Ljava/lang/StringBuilder;

    .line 411
    .line 412
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 413
    .line 414
    .line 415
    const-string v3, "\u89c6\u9891\u5168\u90e8\u5019\u9009\u4e0b\u8f7d\u5931\u8d25: "

    .line 416
    .line 417
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 418
    .line 419
    .line 420
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 421
    .line 422
    .line 423
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 424
    .line 425
    .line 426
    move-result-object v1

    .line 427
    invoke-direct {v0, v1}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    .line 428
    .line 429
    .line 430
    throw v0

    .line 431
    :cond_5
    move-object/from16 v20, v2

    .line 432
    .line 433
    new-instance v0, Ljava/lang/Exception;

    .line 434
    .line 435
    const-string v1, "\u672a\u627e\u5230\u53ef\u4e0b\u8f7d\u7684\u89c6\u9891\u5019\u9009\u5730\u5740"

    .line 436
    .line 437
    invoke-direct {v0, v1}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    .line 438
    .line 439
    .line 440
    throw v0
    :try_end_b
    .catchall {:try_start_b .. :try_end_b} :catchall_1

    .line 441
    :goto_8
    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 442
    .line 443
    .line 444
    move-result-object v1

    .line 445
    invoke-static {v4, v1, v13}, Lqy0;->Ж(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)V

    .line 446
    .line 447
    .line 448
    new-instance v1, Ltx0;

    .line 449
    .line 450
    const/4 v2, 0x3

    .line 451
    invoke-direct {v1, v4, v0, v2}, Ltx0;-><init>(Landroid/app/Activity;Ljava/lang/Throwable;I)V

    .line 452
    .line 453
    .line 454
    invoke-virtual {v4, v1}, Landroid/app/Activity;->runOnUiThread(Ljava/lang/Runnable;)V

    .line 455
    .line 456
    .line 457
    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 458
    .line 459
    .line 460
    move-result-object v0

    .line 461
    new-instance v1, Ljava/lang/StringBuilder;

    .line 462
    .line 463
    const-string v2, "DYHelper: \u4e0b\u8f7d\u5931\u8d25: "

    .line 464
    .line 465
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 466
    .line 467
    .line 468
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 469
    .line 470
    .line 471
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 472
    .line 473
    .line 474
    move-result-object v0

    .line 475
    invoke-static {v0}, Lux;->ζ(Ljava/lang/String;)V

    .line 476
    .line 477
    .line 478
    :goto_9
    return-object v20

    .line 479
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
