.class public final synthetic Lp8/n;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic g:I

.field public final synthetic h:Lgg/u;

.field public final synthetic i:Lp8/o;


# direct methods
.method public synthetic constructor <init>(Lgg/u;Lp8/o;I)V
    .locals 0

    .line 1
    iput p3, p0, Lp8/n;->g:I

    .line 2
    .line 3
    iput-object p1, p0, Lp8/n;->h:Lgg/u;

    .line 4
    .line 5
    iput-object p2, p0, Lp8/n;->i:Lp8/o;

    .line 6
    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 8
    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public final run()V
    .locals 29

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget v1, v0, Lp8/n;->g:I

    .line 4
    .line 5
    packed-switch v1, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    iget-object v1, v0, Lp8/n;->i:Lp8/o;

    .line 9
    .line 10
    iget-object v3, v1, Lp8/o;->a:Lr8/g;

    .line 11
    .line 12
    iget-object v7, v1, Lp8/o;->b:Lfg/p;

    .line 13
    .line 14
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 15
    .line 16
    .line 17
    new-instance v8, Lp8/u;

    .line 18
    .line 19
    const-string v1, "getSnsDownManager"

    .line 20
    .line 21
    const-string v9, "com.tencent.mm.plugin.sns.model.SnsCore"

    .line 22
    .line 23
    filled-new-array {v1, v9}, [Ljava/lang/String;

    .line 24
    .line 25
    .line 26
    move-result-object v1

    .line 27
    invoke-static {v1}, La/a;->y0([Ljava/lang/Object;)Ljava/util/List;

    .line 28
    .line 29
    .line 30
    move-result-object v5

    .line 31
    new-instance v6, Lp8/p;

    .line 32
    .line 33
    const-class v1, Lp8/t;

    .line 34
    .line 35
    invoke-static {v1}, Leh/a;->i(Ljava/lang/Class;)Ljava/lang/Class;

    .line 36
    .line 37
    .line 38
    move-result-object v13

    .line 39
    const/16 v17, 0x0

    .line 40
    .line 41
    const/16 v18, 0x3

    .line 42
    .line 43
    const/4 v11, 0x1

    .line 44
    sget-object v2, Lp8/t;->a:Lp8/t;

    .line 45
    .line 46
    const-string v14, "isManagerGetter"

    .line 47
    .line 48
    const-string v15, "isManagerGetter(Ljava/lang/reflect/Method;)Z"

    .line 49
    .line 50
    const/16 v16, 0x0

    .line 51
    .line 52
    move-object v12, v2

    .line 53
    move-object v10, v6

    .line 54
    invoke-direct/range {v10 .. v18}, Lp8/p;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;III)V

    .line 55
    .line 56
    .line 57
    const-string v4, "image_manager_v1"

    .line 58
    .line 59
    invoke-virtual/range {v2 .. v7}, Lp8/t;->c(Lr8/g;Ljava/lang/String;Ljava/util/List;Lfg/l;Lfg/p;)Ljava/lang/reflect/Method;

    .line 60
    .line 61
    .line 62
    move-result-object v10

    .line 63
    const-string v4, "addDownLoadSns"

    .line 64
    .line 65
    const-string v5, "com.tencent.mm.plugin.sns.model.DownloadManager"

    .line 66
    .line 67
    filled-new-array {v4, v5}, [Ljava/lang/String;

    .line 68
    .line 69
    .line 70
    move-result-object v4

    .line 71
    invoke-static {v4}, La/a;->y0([Ljava/lang/Object;)Ljava/util/List;

    .line 72
    .line 73
    .line 74
    move-result-object v5

    .line 75
    new-instance v19, Lp8/p;

    .line 76
    .line 77
    invoke-static {v1}, Leh/a;->i(Ljava/lang/Class;)Ljava/lang/Class;

    .line 78
    .line 79
    .line 80
    move-result-object v22

    .line 81
    const/16 v26, 0x0

    .line 82
    .line 83
    const/16 v27, 0x4

    .line 84
    .line 85
    const/16 v20, 0x1

    .line 86
    .line 87
    const-string v23, "isImageDownload"

    .line 88
    .line 89
    const-string v24, "isImageDownload(Ljava/lang/reflect/Method;)Z"

    .line 90
    .line 91
    const/16 v25, 0x0

    .line 92
    .line 93
    move-object/from16 v21, v2

    .line 94
    .line 95
    invoke-direct/range {v19 .. v27}, Lp8/p;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;III)V

    .line 96
    .line 97
    .line 98
    const-string v4, "image_download_v1"

    .line 99
    .line 100
    move-object/from16 v6, v19

    .line 101
    .line 102
    invoke-virtual/range {v2 .. v7}, Lp8/t;->c(Lr8/g;Ljava/lang/String;Ljava/util/List;Lfg/l;Lfg/p;)Ljava/lang/reflect/Method;

    .line 103
    .line 104
    .line 105
    move-result-object v11

    .line 106
    const-string v4, "getSnsVideoService"

    .line 107
    .line 108
    filled-new-array {v4, v9}, [Ljava/lang/String;

    .line 109
    .line 110
    .line 111
    move-result-object v4

    .line 112
    invoke-static {v4}, La/a;->y0([Ljava/lang/Object;)Ljava/util/List;

    .line 113
    .line 114
    .line 115
    move-result-object v5

    .line 116
    new-instance v19, Lp8/p;

    .line 117
    .line 118
    invoke-static {v1}, Leh/a;->i(Ljava/lang/Class;)Ljava/lang/Class;

    .line 119
    .line 120
    .line 121
    move-result-object v22

    .line 122
    const/16 v27, 0x5

    .line 123
    .line 124
    const-string v23, "isManagerGetter"

    .line 125
    .line 126
    const-string v24, "isManagerGetter(Ljava/lang/reflect/Method;)Z"

    .line 127
    .line 128
    invoke-direct/range {v19 .. v27}, Lp8/p;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;III)V

    .line 129
    .line 130
    .line 131
    const-string v4, "video_service_v1"

    .line 132
    .line 133
    move-object/from16 v6, v19

    .line 134
    .line 135
    invoke-virtual/range {v2 .. v7}, Lp8/t;->c(Lr8/g;Ljava/lang/String;Ljava/util/List;Lfg/l;Lfg/p;)Ljava/lang/reflect/Method;

    .line 136
    .line 137
    .line 138
    move-result-object v9

    .line 139
    const-string v4, "addSnsVideoTask"

    .line 140
    .line 141
    const-string v5, "com.tencent.mm.plugin.sns.model.SnsVideoService"

    .line 142
    .line 143
    filled-new-array {v4, v5}, [Ljava/lang/String;

    .line 144
    .line 145
    .line 146
    move-result-object v4

    .line 147
    invoke-static {v4}, La/a;->y0([Ljava/lang/Object;)Ljava/util/List;

    .line 148
    .line 149
    .line 150
    move-result-object v5

    .line 151
    new-instance v19, Lp8/p;

    .line 152
    .line 153
    invoke-static {v1}, Leh/a;->i(Ljava/lang/Class;)Ljava/lang/Class;

    .line 154
    .line 155
    .line 156
    move-result-object v22

    .line 157
    const/16 v27, 0x6

    .line 158
    .line 159
    const-string v23, "isVideoDownload"

    .line 160
    .line 161
    const-string v24, "isVideoDownload(Ljava/lang/reflect/Method;)Z"

    .line 162
    .line 163
    invoke-direct/range {v19 .. v27}, Lp8/p;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;III)V

    .line 164
    .line 165
    .line 166
    const-string v4, "video_download_v1"

    .line 167
    .line 168
    move-object/from16 v6, v19

    .line 169
    .line 170
    invoke-virtual/range {v2 .. v7}, Lp8/t;->c(Lr8/g;Ljava/lang/String;Ljava/util/List;Lfg/l;Lfg/p;)Ljava/lang/reflect/Method;

    .line 171
    .line 172
    .line 173
    move-result-object v12

    .line 174
    const-string v4, "getSnsVideoFullPath"

    .line 175
    .line 176
    const-string v5, "getSnsVideoFullPath have flag %s, %s >>"

    .line 177
    .line 178
    filled-new-array {v4, v5}, [Ljava/lang/String;

    .line 179
    .line 180
    .line 181
    move-result-object v4

    .line 182
    invoke-static {v4}, La/a;->y0([Ljava/lang/Object;)Ljava/util/List;

    .line 183
    .line 184
    .line 185
    move-result-object v5

    .line 186
    new-instance v19, Lp8/p;

    .line 187
    .line 188
    invoke-static {v1}, Leh/a;->i(Ljava/lang/Class;)Ljava/lang/Class;

    .line 189
    .line 190
    .line 191
    move-result-object v22

    .line 192
    const/16 v27, 0x7

    .line 193
    .line 194
    const-string v23, "isVideoStatusPath"

    .line 195
    .line 196
    const-string v24, "isVideoStatusPath(Ljava/lang/reflect/Method;)Z"

    .line 197
    .line 198
    invoke-direct/range {v19 .. v27}, Lp8/p;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;III)V

    .line 199
    .line 200
    .line 201
    const-string v4, "video_full_path_v1"

    .line 202
    .line 203
    move-object/from16 v6, v19

    .line 204
    .line 205
    invoke-virtual/range {v2 .. v7}, Lp8/t;->c(Lr8/g;Ljava/lang/String;Ljava/util/List;Lfg/l;Lfg/p;)Ljava/lang/reflect/Method;

    .line 206
    .line 207
    .line 208
    move-result-object v13

    .line 209
    const-string v4, "isDownloadFinish"

    .line 210
    .line 211
    const-string v5, "it don\'t download video[%s] finish. file[%b], return null."

    .line 212
    .line 213
    filled-new-array {v4, v5}, [Ljava/lang/String;

    .line 214
    .line 215
    .line 216
    move-result-object v4

    .line 217
    invoke-static {v4}, La/a;->y0([Ljava/lang/Object;)Ljava/util/List;

    .line 218
    .line 219
    .line 220
    move-result-object v5

    .line 221
    new-instance v19, Lp8/p;

    .line 222
    .line 223
    invoke-static {v1}, Leh/a;->i(Ljava/lang/Class;)Ljava/lang/Class;

    .line 224
    .line 225
    .line 226
    move-result-object v22

    .line 227
    const/16 v27, 0x8

    .line 228
    .line 229
    const-string v23, "isVideoStatusPath"

    .line 230
    .line 231
    const-string v24, "isVideoStatusPath(Ljava/lang/reflect/Method;)Z"

    .line 232
    .line 233
    invoke-direct/range {v19 .. v27}, Lp8/p;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;III)V

    .line 234
    .line 235
    .line 236
    const-string v4, "video_finished_path_v1"

    .line 237
    .line 238
    move-object/from16 v6, v19

    .line 239
    .line 240
    invoke-virtual/range {v2 .. v7}, Lp8/t;->c(Lr8/g;Ljava/lang/String;Ljava/util/List;Lfg/l;Lfg/p;)Ljava/lang/reflect/Method;

    .line 241
    .line 242
    .line 243
    move-result-object v14

    .line 244
    const-string v4, "getSnsVideoThumbImagePath"

    .line 245
    .line 246
    invoke-static {v4}, La/a;->x0(Ljava/lang/Object;)Ljava/util/List;

    .line 247
    .line 248
    .line 249
    move-result-object v5

    .line 250
    new-instance v19, Lp8/p;

    .line 251
    .line 252
    invoke-static {v1}, Leh/a;->i(Ljava/lang/Class;)Ljava/lang/Class;

    .line 253
    .line 254
    .line 255
    move-result-object v22

    .line 256
    const/16 v27, 0x9

    .line 257
    .line 258
    const-string v23, "isVideoMediaPath"

    .line 259
    .line 260
    const-string v24, "isVideoMediaPath(Ljava/lang/reflect/Method;)Z"

    .line 261
    .line 262
    invoke-direct/range {v19 .. v27}, Lp8/p;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;III)V

    .line 263
    .line 264
    .line 265
    const-string v4, "video_thumb_path_v1"

    .line 266
    .line 267
    move-object/from16 v6, v19

    .line 268
    .line 269
    invoke-virtual/range {v2 .. v7}, Lp8/t;->c(Lr8/g;Ljava/lang/String;Ljava/util/List;Lfg/l;Lfg/p;)Ljava/lang/reflect/Method;

    .line 270
    .line 271
    .line 272
    move-result-object v15

    .line 273
    move-object/from16 v28, v11

    .line 274
    .line 275
    move-object v11, v9

    .line 276
    move-object v9, v10

    .line 277
    move-object/from16 v10, v28

    .line 278
    .line 279
    invoke-direct/range {v8 .. v15}, Lp8/u;-><init>(Ljava/lang/reflect/Method;Ljava/lang/reflect/Method;Ljava/lang/reflect/Method;Ljava/lang/reflect/Method;Ljava/lang/reflect/Method;Ljava/lang/reflect/Method;Ljava/lang/reflect/Method;)V

    .line 280
    .line 281
    .line 282
    iget-object v1, v0, Lp8/n;->h:Lgg/u;

    .line 283
    .line 284
    iput-object v8, v1, Lgg/u;->g:Ljava/lang/Object;

    .line 285
    .line 286
    return-void

    .line 287
    :pswitch_0
    iget-object v1, v0, Lp8/n;->i:Lp8/o;

    .line 288
    .line 289
    iget-object v3, v1, Lp8/o;->a:Lr8/g;

    .line 290
    .line 291
    iget-object v7, v1, Lp8/o;->b:Lfg/p;

    .line 292
    .line 293
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 294
    .line 295
    .line 296
    new-instance v1, Lp8/r;

    .line 297
    .line 298
    const-string v2, "getAccSnsPath"

    .line 299
    .line 300
    const-string v4, "com.tencent.mm.plugin.sns.model.SnsCore"

    .line 301
    .line 302
    filled-new-array {v2, v4}, [Ljava/lang/String;

    .line 303
    .line 304
    .line 305
    move-result-object v2

    .line 306
    invoke-static {v2}, La/a;->y0([Ljava/lang/Object;)Ljava/util/List;

    .line 307
    .line 308
    .line 309
    move-result-object v5

    .line 310
    new-instance v6, Lc0/f;

    .line 311
    .line 312
    const-class v17, Lp8/q;

    .line 313
    .line 314
    invoke-static/range {v17 .. v17}, Leh/a;->i(Ljava/lang/Class;)Ljava/lang/Class;

    .line 315
    .line 316
    .line 317
    move-result-object v11

    .line 318
    const/4 v15, 0x0

    .line 319
    const/16 v16, 0x1d

    .line 320
    .line 321
    const/4 v9, 0x1

    .line 322
    sget-object v2, Lp8/q;->a:Lp8/q;

    .line 323
    .line 324
    const-string v12, "isSnsRootMethod"

    .line 325
    .line 326
    const-string v13, "isSnsRootMethod(Ljava/lang/reflect/Method;)Z"

    .line 327
    .line 328
    const/4 v14, 0x0

    .line 329
    move-object v10, v2

    .line 330
    move-object v8, v6

    .line 331
    invoke-direct/range {v8 .. v16}, Lc0/f;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;III)V

    .line 332
    .line 333
    .line 334
    const-string v4, "sns_root_v1"

    .line 335
    .line 336
    invoke-virtual/range {v2 .. v7}, Lp8/q;->b(Lr8/g;Ljava/lang/String;Ljava/util/List;Lfg/l;Lfg/p;)Ljava/lang/reflect/Method;

    .line 337
    .line 338
    .line 339
    move-result-object v8

    .line 340
    const-string v4, "getMediaFilePath"

    .line 341
    .line 342
    const-string v5, "com.tencent.mm.plugin.sns.model.SnsPathHelper"

    .line 343
    .line 344
    filled-new-array {v4, v5}, [Ljava/lang/String;

    .line 345
    .line 346
    .line 347
    move-result-object v4

    .line 348
    invoke-static {v4}, La/a;->y0([Ljava/lang/Object;)Ljava/util/List;

    .line 349
    .line 350
    .line 351
    move-result-object v5

    .line 352
    new-instance v18, Lp8/p;

    .line 353
    .line 354
    invoke-static/range {v17 .. v17}, Leh/a;->i(Ljava/lang/Class;)Ljava/lang/Class;

    .line 355
    .line 356
    .line 357
    move-result-object v21

    .line 358
    const/16 v25, 0x0

    .line 359
    .line 360
    const/16 v26, 0x0

    .line 361
    .line 362
    const/16 v19, 0x1

    .line 363
    .line 364
    const-string v22, "isMediaDirectoryMethod"

    .line 365
    .line 366
    const-string v23, "isMediaDirectoryMethod(Ljava/lang/reflect/Method;)Z"

    .line 367
    .line 368
    const/16 v24, 0x0

    .line 369
    .line 370
    move-object/from16 v20, v2

    .line 371
    .line 372
    invoke-direct/range {v18 .. v26}, Lp8/p;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;III)V

    .line 373
    .line 374
    .line 375
    const-string v4, "media_directory_v1"

    .line 376
    .line 377
    move-object/from16 v6, v18

    .line 378
    .line 379
    invoke-virtual/range {v2 .. v7}, Lp8/q;->b(Lr8/g;Ljava/lang/String;Ljava/util/List;Lfg/l;Lfg/p;)Ljava/lang/reflect/Method;

    .line 380
    .line 381
    .line 382
    move-result-object v9

    .line 383
    const-string v4, "getSnsBigName"

    .line 384
    .line 385
    const-string v5, "snsb_"

    .line 386
    .line 387
    filled-new-array {v4, v5}, [Ljava/lang/String;

    .line 388
    .line 389
    .line 390
    move-result-object v4

    .line 391
    invoke-static {v4}, La/a;->y0([Ljava/lang/Object;)Ljava/util/List;

    .line 392
    .line 393
    .line 394
    move-result-object v5

    .line 395
    new-instance v18, Lp8/p;

    .line 396
    .line 397
    invoke-static/range {v17 .. v17}, Leh/a;->i(Ljava/lang/Class;)Ljava/lang/Class;

    .line 398
    .line 399
    .line 400
    move-result-object v21

    .line 401
    const/16 v26, 0x1

    .line 402
    .line 403
    const-string v22, "isBigImageNameMethod"

    .line 404
    .line 405
    const-string v23, "isBigImageNameMethod(Ljava/lang/reflect/Method;)Z"

    .line 406
    .line 407
    invoke-direct/range {v18 .. v26}, Lp8/p;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;III)V

    .line 408
    .line 409
    .line 410
    const-string v4, "big_image_name_v1"

    .line 411
    .line 412
    move-object/from16 v6, v18

    .line 413
    .line 414
    invoke-virtual/range {v2 .. v7}, Lp8/q;->b(Lr8/g;Ljava/lang/String;Ljava/util/List;Lfg/l;Lfg/p;)Ljava/lang/reflect/Method;

    .line 415
    .line 416
    .line 417
    move-result-object v10

    .line 418
    const-string v4, "getSnsVideoPath"

    .line 419
    .line 420
    const-string v5, "com.tencent.mm.plugin.sns.model.SnsVideoLogic"

    .line 421
    .line 422
    const-string v6, "MicroMsg.SnsVideoLogic"

    .line 423
    .line 424
    filled-new-array {v6, v4, v5}, [Ljava/lang/String;

    .line 425
    .line 426
    .line 427
    move-result-object v4

    .line 428
    invoke-static {v4}, La/a;->y0([Ljava/lang/Object;)Ljava/util/List;

    .line 429
    .line 430
    .line 431
    move-result-object v5

    .line 432
    new-instance v18, Lp8/p;

    .line 433
    .line 434
    invoke-static/range {v17 .. v17}, Leh/a;->i(Ljava/lang/Class;)Ljava/lang/Class;

    .line 435
    .line 436
    .line 437
    move-result-object v21

    .line 438
    const/16 v26, 0x2

    .line 439
    .line 440
    const-string v22, "isVideoPathMethod"

    .line 441
    .line 442
    const-string v23, "isVideoPathMethod(Ljava/lang/reflect/Method;)Z"

    .line 443
    .line 444
    invoke-direct/range {v18 .. v26}, Lp8/p;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;III)V

    .line 445
    .line 446
    .line 447
    const-string v4, "video_path_v1"

    .line 448
    .line 449
    move-object/from16 v6, v18

    .line 450
    .line 451
    invoke-virtual/range {v2 .. v7}, Lp8/q;->b(Lr8/g;Ljava/lang/String;Ljava/util/List;Lfg/l;Lfg/p;)Ljava/lang/reflect/Method;

    .line 452
    .line 453
    .line 454
    move-result-object v2

    .line 455
    invoke-direct {v1, v8, v9, v10, v2}, Lp8/r;-><init>(Ljava/lang/reflect/Method;Ljava/lang/reflect/Method;Ljava/lang/reflect/Method;Ljava/lang/reflect/Method;)V

    .line 456
    .line 457
    .line 458
    iget-object v2, v0, Lp8/n;->h:Lgg/u;

    .line 459
    .line 460
    iput-object v1, v2, Lgg/u;->g:Ljava/lang/Object;

    .line 461
    .line 462
    return-void

    .line 463
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
