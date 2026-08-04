.class public final Lyyds/ᛵᛶᲇᛳ;
.super Ljava/lang/Object;
.source "r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic ᲀᛲᛳᲀ:I


# direct methods
.method public synthetic constructor <init>(I)V
    .locals 0

    .line 8
    iput p1, p0, Lyyds/ᛵᛶᲇᛳ;->ᲀᛲᛳᲀ:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public constructor <init>(Lyyds/ᲀᛵᲁᛴ;I)V
    .locals 0

    .line 1
    const/4 p1, 0x0

    .line 2
    iput p1, p0, Lyyds/ᛵᛶᲇᛳ;->ᲀᛲᛳᲀ:I

    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    return-void
.end method

.method private final ᛲᲈᲁ()V
    .locals 0

    .line 1
    return-void
.end method


# virtual methods
.method public final run()V
    .locals 24

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget v0, v0, Lyyds/ᛵᛶᲇᛳ;->ᲀᛲᛳᲀ:I

    .line 4
    .line 5
    const/4 v1, 0x0

    .line 6
    const-wide/16 v2, 0x5dc

    .line 7
    .line 8
    const-wide/32 v4, 0xafc8

    .line 9
    .line 10
    .line 11
    const/4 v6, 0x0

    .line 12
    const-wide/16 v7, 0x0

    .line 13
    .line 14
    const/4 v9, 0x1

    .line 15
    packed-switch v0, :pswitch_data_0

    .line 16
    .line 17
    .line 18
    sget-object v0, Lyyds/ᛷᲇᛷᛴ;->ᲇᲇᲇᛱ:Lyyds/ᛷᲇᛷᛴ;

    .line 19
    .line 20
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 21
    .line 22
    .line 23
    sget-boolean v0, Lyyds/ᛷᲇᛷᛴ;->ᛲᛳᛴᛸ:Z

    .line 24
    .line 25
    if-nez v0, :cond_0

    .line 26
    .line 27
    goto/16 :goto_1

    .line 28
    .line 29
    :cond_0
    sget-object v0, Lyyds/ᛷᲇᛷᛴ;->ᲁᛶᛴᛸ:Ljava/lang/ref/WeakReference;

    .line 30
    .line 31
    invoke-virtual {v0}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    move-result-object v0

    .line 35
    if-nez v0, :cond_1

    .line 36
    .line 37
    const-wide v0, -0x3008de68a836eL

    .line 38
    .line 39
    .line 40
    .line 41
    .line 42
    invoke-static {v0, v1}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 43
    .line 44
    .line 45
    move-result-object v0

    .line 46
    invoke-static {v0}, Lyyds/ᛷᲇᛷᛴ;->ᛲᛱᲁᛳ(Ljava/lang/String;)V

    .line 47
    .line 48
    .line 49
    goto/16 :goto_1

    .line 50
    .line 51
    :cond_1
    invoke-static {v0, v9}, Lyyds/ᛷᲇᛷᛴ;->ᛲᲀᛵᛷ(Ljava/lang/Object;Z)Lyyds/ᲁᛵᛵ;

    .line 52
    .line 53
    .line 54
    move-result-object v1

    .line 55
    if-nez v1, :cond_2

    .line 56
    .line 57
    const-wide v0, -0x30093e68a836eL

    .line 58
    .line 59
    .line 60
    .line 61
    .line 62
    invoke-static {v0, v1}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 63
    .line 64
    .line 65
    move-result-object v0

    .line 66
    invoke-static {v0}, Lyyds/ᛷᲇᛷᛴ;->ᛲᛱᲁᛳ(Ljava/lang/String;)V

    .line 67
    .line 68
    .line 69
    goto/16 :goto_1

    .line 70
    .line 71
    :cond_2
    iget-object v9, v1, Lyyds/ᲁᛵᛵ;->ᛲᲈᲁ:Ljava/util/List;

    .line 72
    .line 73
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    .line 74
    .line 75
    .line 76
    move-result-wide v10

    .line 77
    invoke-interface {v9}, Ljava/util/List;->size()I

    .line 78
    .line 79
    .line 80
    move-result v12

    .line 81
    sget v13, Lyyds/ᛷᲇᛷᛴ;->ᛷᛸᲇᛶ:I

    .line 82
    .line 83
    if-le v12, v13, :cond_3

    .line 84
    .line 85
    invoke-interface {v9}, Ljava/util/List;->size()I

    .line 86
    .line 87
    .line 88
    move-result v12

    .line 89
    sput v12, Lyyds/ᛷᲇᛷᛴ;->ᛷᛸᲇᛶ:I

    .line 90
    .line 91
    sput-wide v10, Lyyds/ᛷᲇᛷᛴ;->ᛱᛳᛶᛳ:J

    .line 92
    .line 93
    sput-wide v7, Lyyds/ᛷᲇᛷᛴ;->ᛸᛸᛷᛱ:J

    .line 94
    .line 95
    :cond_3
    invoke-static {v1}, Lyyds/ᛷᲇᛷᛴ;->ᛸᛸᛷᛱ(Lyyds/ᲁᛵᛵ;)V

    .line 96
    .line 97
    .line 98
    iget-boolean v12, v1, Lyyds/ᲁᛵᛵ;->ᛵᛸᛸᛷ:Z

    .line 99
    .line 100
    if-nez v12, :cond_4

    .line 101
    .line 102
    invoke-static {v6}, Lyyds/ᛷᲇᛷᛴ;->ᛲᛱᲁᛳ(Ljava/lang/String;)V

    .line 103
    .line 104
    .line 105
    goto/16 :goto_1

    .line 106
    .line 107
    :cond_4
    sget-wide v12, Lyyds/ᛷᲇᛷᛴ;->ᛱᛳᛶᛳ:J

    .line 108
    .line 109
    sub-long v12, v10, v12

    .line 110
    .line 111
    cmp-long v4, v12, v4

    .line 112
    .line 113
    if-ltz v4, :cond_5

    .line 114
    .line 115
    new-instance v0, Ljava/lang/StringBuilder;

    .line 116
    .line 117
    const-wide v1, -0x3009ce68a836eL

    .line 118
    .line 119
    .line 120
    .line 121
    .line 122
    invoke-static {v1, v2}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 123
    .line 124
    .line 125
    move-result-object v1

    .line 126
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 127
    .line 128
    .line 129
    invoke-interface {v9}, Ljava/util/List;->size()I

    .line 130
    .line 131
    .line 132
    move-result v1

    .line 133
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 134
    .line 135
    .line 136
    const-wide v1, -0x300a8e68a836eL

    .line 137
    .line 138
    .line 139
    .line 140
    .line 141
    invoke-static {v1, v2}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 142
    .line 143
    .line 144
    move-result-object v1

    .line 145
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 146
    .line 147
    .line 148
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 149
    .line 150
    .line 151
    move-result-object v0

    .line 152
    invoke-static {v0}, Lyyds/ᛷᲇᛷᛴ;->ᛲᛱᲁᛳ(Ljava/lang/String;)V

    .line 153
    .line 154
    .line 155
    goto :goto_1

    .line 156
    :cond_5
    iget-boolean v1, v1, Lyyds/ᲁᛵᛵ;->ᲀᛲᛳᲀ:Z

    .line 157
    .line 158
    const-wide/16 v4, 0x1c2

    .line 159
    .line 160
    if-eqz v1, :cond_6

    .line 161
    .line 162
    sget-object v0, Lyyds/ᛷᲇᛷᛴ;->ᛶᛷᛲᲁ:Landroid/os/Handler;

    .line 163
    .line 164
    sget-object v1, Lyyds/ᛷᲇᛷᛴ;->ᲈᛳᛵᛴ:Lyyds/ᛵᛶᲇᛳ;

    .line 165
    .line 166
    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    .line 167
    .line 168
    .line 169
    invoke-virtual {v0, v1, v4, v5}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 170
    .line 171
    .line 172
    goto :goto_1

    .line 173
    :cond_6
    sget-wide v12, Lyyds/ᛷᲇᛷᛴ;->ᛸᛸᛷᛱ:J

    .line 174
    .line 175
    cmp-long v1, v12, v7

    .line 176
    .line 177
    if-eqz v1, :cond_7

    .line 178
    .line 179
    sub-long v7, v10, v12

    .line 180
    .line 181
    cmp-long v1, v7, v2

    .line 182
    .line 183
    if-ltz v1, :cond_9

    .line 184
    .line 185
    :cond_7
    sput-wide v10, Lyyds/ᛷᲇᛷᛴ;->ᛸᛸᛷᛱ:J

    .line 186
    .line 187
    :try_start_0
    sget-object v1, Lyyds/ᛷᲇᛷᛴ;->ᛷᛴᛴᲁ:Ljava/lang/reflect/Method;

    .line 188
    .line 189
    if-eqz v1, :cond_8

    .line 190
    .line 191
    invoke-virtual {v1, v0, v6}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 192
    .line 193
    .line 194
    move-result-object v6
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 195
    goto :goto_0

    .line 196
    :catchall_0
    move-exception v0

    .line 197
    new-instance v6, Lyyds/ᲈᛵᛵᛴ;

    .line 198
    .line 199
    invoke-direct {v6, v0}, Lyyds/ᲈᛵᛵᛴ;-><init>(Ljava/lang/Throwable;)V

    .line 200
    .line 201
    .line 202
    :cond_8
    :goto_0
    invoke-static {v6}, Lyyds/ᲁᛶᛱᛵ;->ᛲᲈᲁ(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 203
    .line 204
    .line 205
    move-result-object v0

    .line 206
    if-eqz v0, :cond_9

    .line 207
    .line 208
    sget-object v1, Lyyds/ᲁᲁᲁᛳ;->ᛲᲈᲁ:Lyyds/ᲁᲁᲁᛳ;

    .line 209
    .line 210
    const-wide v2, -0x300ade68a836eL

    .line 211
    .line 212
    .line 213
    .line 214
    .line 215
    invoke-static {v2, v3}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 216
    .line 217
    .line 218
    move-result-object v2

    .line 219
    invoke-virtual {v1, v2, v0}, Lyyds/ᲁᲁᲁᛳ;->ᛵᛸᛸᛷ(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 220
    .line 221
    .line 222
    sget-object v0, Lyyds/ᛷᲇᛷᛴ;->ᲇᲇᲇᛱ:Lyyds/ᛷᲇᛷᛴ;

    .line 223
    .line 224
    const-wide v1, -0x300bde68a836eL

    .line 225
    .line 226
    .line 227
    .line 228
    .line 229
    invoke-static {v1, v2}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 230
    .line 231
    .line 232
    move-result-object v1

    .line 233
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 234
    .line 235
    .line 236
    invoke-static {v1}, Lyyds/ᛷᲇᛷᛴ;->ᛲᛱᲁᛳ(Ljava/lang/String;)V

    .line 237
    .line 238
    .line 239
    goto :goto_1

    .line 240
    :cond_9
    sget-object v0, Lyyds/ᛷᲇᛷᛴ;->ᛶᛷᛲᲁ:Landroid/os/Handler;

    .line 241
    .line 242
    sget-object v1, Lyyds/ᛷᲇᛷᛴ;->ᲈᛳᛵᛴ:Lyyds/ᛵᛶᲇᛳ;

    .line 243
    .line 244
    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    .line 245
    .line 246
    .line 247
    invoke-virtual {v0, v1, v4, v5}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 248
    .line 249
    .line 250
    :goto_1
    return-void

    .line 251
    :pswitch_0
    sget-object v10, Lyyds/ᛷᲇᛷᛴ;->ᲇᲇᲇᛱ:Lyyds/ᛷᲇᛷᛴ;

    .line 252
    .line 253
    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 254
    .line 255
    .line 256
    sget-boolean v0, Lyyds/ᛷᲇᛷᛴ;->ᛵᛶᛲᲀ:Z

    .line 257
    .line 258
    if-nez v0, :cond_a

    .line 259
    .line 260
    goto/16 :goto_27

    .line 261
    .line 262
    :cond_a
    sget-object v0, Lyyds/ᛷᲇᛷᛴ;->ᛲᛲᲈᲈ:Ljava/lang/ref/WeakReference;

    .line 263
    .line 264
    invoke-virtual {v0}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 265
    .line 266
    .line 267
    move-result-object v11

    .line 268
    sget-object v0, Lyyds/ᛷᲇᛷᛴ;->ᛱᛳᲇ:Ljava/lang/ref/WeakReference;

    .line 269
    .line 270
    invoke-virtual {v0}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 271
    .line 272
    .line 273
    move-result-object v0

    .line 274
    move-object v12, v0

    .line 275
    check-cast v12, Landroid/view/ViewGroup;

    .line 276
    .line 277
    const/4 v13, 0x2

    .line 278
    if-eqz v11, :cond_b

    .line 279
    .line 280
    if-eqz v12, :cond_b

    .line 281
    .line 282
    invoke-virtual {v12}, Landroid/view/View;->isAttachedToWindow()Z

    .line 283
    .line 284
    .line 285
    move-result v0

    .line 286
    if-eqz v0, :cond_b

    .line 287
    .line 288
    invoke-virtual {v12}, Landroid/view/View;->isShown()Z

    .line 289
    .line 290
    .line 291
    move-result v0

    .line 292
    if-nez v0, :cond_c

    .line 293
    .line 294
    :cond_b
    move-object v1, v6

    .line 295
    goto/16 :goto_26

    .line 296
    .line 297
    :cond_c
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    .line 298
    .line 299
    .line 300
    move-result-wide v14

    .line 301
    const-wide v16, -0x3031be68a836eL

    .line 302
    .line 303
    .line 304
    .line 305
    .line 306
    invoke-static/range {v16 .. v17}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 307
    .line 308
    .line 309
    move-result-object v0

    .line 310
    move-wide/from16 v16, v2

    .line 311
    .line 312
    new-array v2, v1, [Ljava/lang/Object;

    .line 313
    .line 314
    invoke-static {v12, v0, v2}, Lyyds/ᛱᛶᛶᲇ;->ᲈᲀᛲᲀ(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 315
    .line 316
    .line 317
    move-result-object v0

    .line 318
    if-nez v0, :cond_d

    .line 319
    .line 320
    move v2, v1

    .line 321
    move-wide/from16 v18, v4

    .line 322
    .line 323
    const-wide v20, -0x3193de68a836eL

    .line 324
    .line 325
    .line 326
    .line 327
    .line 328
    goto :goto_6

    .line 329
    :cond_d
    const-wide v18, -0x30326e68a836eL

    .line 330
    .line 331
    .line 332
    .line 333
    .line 334
    const-wide v20, -0x3193de68a836eL

    .line 335
    .line 336
    .line 337
    .line 338
    .line 339
    invoke-static/range {v18 .. v19}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 340
    .line 341
    .line 342
    move-result-object v2

    .line 343
    new-array v3, v1, [Ljava/lang/Object;

    .line 344
    .line 345
    :try_start_1
    sget v18, Lyyds/ᲁᛸᛵᲁ;->ᛲᲈᲁ:I

    .line 346
    .line 347
    invoke-static {v0}, Lyyds/ᛲᲇᲁᛳ;->ᛷᛵᲇᲀ(Ljava/lang/Object;)Lyyds/ᲀᛵᲁᛴ;

    .line 348
    .line 349
    .line 350
    move-result-object v0
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    .line 351
    move-wide/from16 v18, v4

    .line 352
    .line 353
    :try_start_2
    iget-object v4, v0, Lyyds/ᲀᛵᲁᛴ;->ᲇᲈᛵᛷ:Ljava/lang/Object;

    .line 354
    .line 355
    check-cast v4, Lyyds/ᛴᛸᛲᛳ;

    .line 356
    .line 357
    iput v13, v4, Lyyds/ᛴᛸᛲᛳ;->ᲇᲈᛵᛷ:I

    .line 358
    .line 359
    invoke-virtual {v0}, Lyyds/ᲀᛵᲁᛴ;->ᛶᲈᛴᲈ()Lyyds/ᛵᲀᲀᛶ;

    .line 360
    .line 361
    .line 362
    move-result-object v0

    .line 363
    invoke-virtual {v0}, Lyyds/ᲇᛴᲇᛶ;->ᲇᲈᛵᛷ()V

    .line 364
    .line 365
    .line 366
    iput-object v2, v0, Lyyds/ᲇᛴᲇᛶ;->ᛵᛸᛸᛷ:Ljava/lang/String;

    .line 367
    .line 368
    invoke-static/range {v20 .. v21}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 369
    .line 370
    .line 371
    invoke-virtual {v0}, Lyyds/ᛵᲀᲀᛶ;->ᛲᲈᲁ()Ljava/util/List;

    .line 372
    .line 373
    .line 374
    move-result-object v0

    .line 375
    invoke-static {v0}, Lyyds/ᛷᛷᛶᲇ;->ᲀᛲᛱᛱ(Ljava/util/List;)Ljava/lang/Object;

    .line 376
    .line 377
    .line 378
    move-result-object v0

    .line 379
    check-cast v0, Lyyds/ᛳᛲᛶᛴ;

    .line 380
    .line 381
    if-eqz v0, :cond_e

    .line 382
    .line 383
    invoke-static {v3, v1}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 384
    .line 385
    .line 386
    move-result-object v2

    .line 387
    invoke-virtual {v0, v2}, Lyyds/ᛳᛲᛶᛴ;->ᛱᛳᛶᛳ([Ljava/lang/Object;)Ljava/lang/Object;

    .line 388
    .line 389
    .line 390
    move-result-object v0

    .line 391
    goto :goto_2

    .line 392
    :catch_0
    move-exception v0

    .line 393
    goto :goto_3

    .line 394
    :cond_e
    move-object v0, v6

    .line 395
    :goto_2
    instance-of v2, v0, Ljava/lang/Integer;

    .line 396
    .line 397
    if-nez v2, :cond_f

    .line 398
    .line 399
    move-object v0, v6

    .line 400
    :cond_f
    check-cast v0, Ljava/lang/Integer;
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_0

    .line 401
    .line 402
    goto :goto_4

    .line 403
    :catch_1
    move-exception v0

    .line 404
    move-wide/from16 v18, v4

    .line 405
    .line 406
    :goto_3
    sget-object v2, Lyyds/ᲁᲁᲁᛳ;->ᛲᲈᲁ:Lyyds/ᲁᲁᲁᛳ;

    .line 407
    .line 408
    const-wide v3, -0x30333e68a836eL

    .line 409
    .line 410
    .line 411
    .line 412
    .line 413
    invoke-static {v3, v4}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 414
    .line 415
    .line 416
    move-result-object v3

    .line 417
    invoke-virtual {v2, v3, v0}, Lyyds/ᲁᲁᲁᛳ;->ᛵᛸᛸᛷ(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 418
    .line 419
    .line 420
    move-object v0, v6

    .line 421
    :goto_4
    if-eqz v0, :cond_10

    .line 422
    .line 423
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 424
    .line 425
    .line 426
    move-result v0

    .line 427
    goto :goto_5

    .line 428
    :cond_10
    move v0, v1

    .line 429
    :goto_5
    move v2, v0

    .line 430
    :goto_6
    invoke-static {v12}, Lyyds/ᛷᲇᛷᛴ;->ᛲᲀᛲᛲ(Landroid/view/ViewGroup;)Lyyds/ᛱᛵᛷᲈ;

    .line 431
    .line 432
    .line 433
    move-result-object v0

    .line 434
    if-eqz v0, :cond_11

    .line 435
    .line 436
    sget-object v3, Lyyds/ᛷᲇᛷᛴ;->ᛲᛶᛱᲈ:Lyyds/ᛱᛵᛷᲈ;

    .line 437
    .line 438
    if-nez v3, :cond_12

    .line 439
    .line 440
    sput-object v0, Lyyds/ᛷᲇᛷᛴ;->ᛲᛶᛱᲈ:Lyyds/ᛱᛵᛷᲈ;

    .line 441
    .line 442
    :cond_11
    move-wide/from16 v22, v7

    .line 443
    .line 444
    goto :goto_7

    .line 445
    :cond_12
    iget v4, v0, Lyyds/ᛱᛵᛷᲈ;->ᛲᲈᲁ:I

    .line 446
    .line 447
    iget v5, v3, Lyyds/ᛱᛵᛷᲈ;->ᛲᲈᲁ:I

    .line 448
    .line 449
    move-wide/from16 v22, v7

    .line 450
    .line 451
    if-gt v4, v5, :cond_14

    .line 452
    .line 453
    iget v7, v0, Lyyds/ᛱᛵᛷᲈ;->ᛵᛸᛸᛷ:I

    .line 454
    .line 455
    iget v8, v3, Lyyds/ᛱᛵᛷᲈ;->ᛵᛸᛸᛷ:I

    .line 456
    .line 457
    if-gt v7, v8, :cond_14

    .line 458
    .line 459
    if-ne v4, v5, :cond_13

    .line 460
    .line 461
    iget v4, v0, Lyyds/ᛱᛵᛷᲈ;->ᲀᛲᛳᲀ:I

    .line 462
    .line 463
    iget v5, v3, Lyyds/ᛱᛵᛷᲈ;->ᲀᛲᛳᲀ:I

    .line 464
    .line 465
    if-lt v4, v5, :cond_14

    .line 466
    .line 467
    :cond_13
    iget v3, v3, Lyyds/ᛱᛵᛷᲈ;->ᛲᛴᛳᛲ:I

    .line 468
    .line 469
    const/high16 v4, -0x80000000

    .line 470
    .line 471
    if-eq v3, v4, :cond_15

    .line 472
    .line 473
    iget v4, v0, Lyyds/ᛱᛵᛷᲈ;->ᛲᛴᛳᛲ:I

    .line 474
    .line 475
    if-le v4, v3, :cond_15

    .line 476
    .line 477
    :cond_14
    sput-object v0, Lyyds/ᛷᲇᛷᛴ;->ᛲᛶᛱᲈ:Lyyds/ᛱᛵᛷᲈ;

    .line 478
    .line 479
    sput-wide v22, Lyyds/ᛷᲇᛷᛴ;->ᲈᲀᛲᲀ:J

    .line 480
    .line 481
    sput v1, Lyyds/ᛷᲇᛷᛴ;->ᛵᲀᛵᛸ:I

    .line 482
    .line 483
    sput-wide v14, Lyyds/ᛷᲇᛷᛴ;->ᛳᛸᛴᛶ:J

    .line 484
    .line 485
    :cond_15
    :goto_7
    invoke-static {v11}, Lyyds/ᛷᲇᛷᛴ;->ᛷᛴᛴᲁ(Ljava/lang/Object;)Lyyds/ᛴᛸᛸᲁ;

    .line 486
    .line 487
    .line 488
    move-result-object v3

    .line 489
    if-nez v3, :cond_16

    .line 490
    .line 491
    const-wide v0, -0x3010ae68a836eL

    .line 492
    .line 493
    .line 494
    .line 495
    .line 496
    invoke-static {v0, v1}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 497
    .line 498
    .line 499
    move-result-object v0

    .line 500
    invoke-static {v0}, Lyyds/ᛷᲇᛷᛴ;->ᲀᛲᛱᛱ(Ljava/lang/String;)V

    .line 501
    .line 502
    .line 503
    goto/16 :goto_27

    .line 504
    .line 505
    :cond_16
    iget-object v4, v3, Lyyds/ᛴᛸᛸᲁ;->ᲀᛲᛳᲀ:Lyyds/ᛴᲈᛴᛶ;

    .line 506
    .line 507
    sget-object v0, Lyyds/ᛷᲇᛷᛴ;->ᛶᛸᲀᲁ:Lyyds/ᛴᲈᛴᛶ;

    .line 508
    .line 509
    if-nez v0, :cond_17

    .line 510
    .line 511
    sput-object v4, Lyyds/ᛷᲇᛷᛴ;->ᛶᛸᲀᲁ:Lyyds/ᛴᲈᛴᛶ;

    .line 512
    .line 513
    goto :goto_8

    .line 514
    :cond_17
    invoke-virtual {v4, v0}, Lyyds/ᛴᲈᛴᛶ;->equals(Ljava/lang/Object;)Z

    .line 515
    .line 516
    .line 517
    move-result v0

    .line 518
    if-nez v0, :cond_18

    .line 519
    .line 520
    sput-object v4, Lyyds/ᛷᲇᛷᛴ;->ᛶᛸᲀᲁ:Lyyds/ᛴᲈᛴᛶ;

    .line 521
    .line 522
    sput-object v6, Lyyds/ᛷᲇᛷᛴ;->ᛵᲀᲈᛴ:Lyyds/ᛴᲈᛴᛶ;

    .line 523
    .line 524
    sput-wide v22, Lyyds/ᛷᲇᛷᛴ;->ᛶᲈᛴᲈ:J

    .line 525
    .line 526
    sput-wide v22, Lyyds/ᛷᲇᛷᛴ;->ᲈᲀᛲᲀ:J

    .line 527
    .line 528
    sput v1, Lyyds/ᛷᲇᛷᛴ;->ᛵᲀᛵᛸ:I

    .line 529
    .line 530
    sput-wide v14, Lyyds/ᛷᲇᛷᛴ;->ᛳᛸᛴᛶ:J

    .line 531
    .line 532
    :cond_18
    :goto_8
    sget-wide v7, Lyyds/ᛷᲇᛷᛴ;->ᛳᛸᛴᛶ:J

    .line 533
    .line 534
    sub-long v7, v14, v7

    .line 535
    .line 536
    cmp-long v0, v7, v18

    .line 537
    .line 538
    if-ltz v0, :cond_19

    .line 539
    .line 540
    sget-object v0, Lyyds/ᲁᲁᲁᛳ;->ᛲᲈᲁ:Lyyds/ᲁᲁᲁᛳ;

    .line 541
    .line 542
    new-instance v1, Ljava/lang/StringBuilder;

    .line 543
    .line 544
    const-wide v3, -0x30115e68a836eL

    .line 545
    .line 546
    .line 547
    .line 548
    .line 549
    invoke-static {v3, v4}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 550
    .line 551
    .line 552
    move-result-object v3

    .line 553
    invoke-direct {v1, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 554
    .line 555
    .line 556
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 557
    .line 558
    .line 559
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 560
    .line 561
    .line 562
    move-result-object v1

    .line 563
    invoke-virtual {v0, v1}, Lyyds/ᲁᲁᲁᛳ;->ᛲᲈᲁ(Ljava/lang/String;)V

    .line 564
    .line 565
    .line 566
    const-wide v0, -0x3012ce68a836eL

    .line 567
    .line 568
    .line 569
    .line 570
    .line 571
    invoke-static {v0, v1}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 572
    .line 573
    .line 574
    move-result-object v0

    .line 575
    invoke-static {v0}, Lyyds/ᛷᲇᛷᛴ;->ᲀᛲᛱᛱ(Ljava/lang/String;)V

    .line 576
    .line 577
    .line 578
    goto/16 :goto_27

    .line 579
    .line 580
    :cond_19
    sget-object v5, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    .line 581
    .line 582
    if-lez v2, :cond_1d

    .line 583
    .line 584
    sget v0, Lyyds/ᛷᲇᛷᛴ;->ᲀᛲᛲᲇ:I

    .line 585
    .line 586
    if-ne v2, v0, :cond_1a

    .line 587
    .line 588
    goto :goto_a

    .line 589
    :cond_1a
    :try_start_3
    invoke-virtual {v12}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 590
    .line 591
    .line 592
    move-result-object v0

    .line 593
    const-wide v7, -0x30344e68a836eL

    .line 594
    .line 595
    .line 596
    .line 597
    .line 598
    invoke-static {v7, v8}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 599
    .line 600
    .line 601
    move-result-object v7

    .line 602
    filled-new-array {v5}, [Ljava/lang/Class;

    .line 603
    .line 604
    .line 605
    move-result-object v8

    .line 606
    invoke-virtual {v0, v7, v8}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 607
    .line 608
    .line 609
    move-result-object v0

    .line 610
    add-int/lit8 v7, v2, -0x1

    .line 611
    .line 612
    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 613
    .line 614
    .line 615
    move-result-object v7

    .line 616
    filled-new-array {v7}, [Ljava/lang/Object;

    .line 617
    .line 618
    .line 619
    move-result-object v7

    .line 620
    invoke-virtual {v0, v12, v7}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 621
    .line 622
    .line 623
    sput v2, Lyyds/ᛷᲇᛷᛴ;->ᲀᛲᛲᲇ:I

    .line 624
    .line 625
    sget-object v0, Lyyds/ᛱᛴᛵᲀ;->ᲇᲈᛵᛷ:Lyyds/ᛱᛴᛵᲀ;
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 626
    .line 627
    goto :goto_9

    .line 628
    :catchall_1
    move-exception v0

    .line 629
    new-instance v7, Lyyds/ᲈᛵᛵᛴ;

    .line 630
    .line 631
    invoke-direct {v7, v0}, Lyyds/ᲈᛵᛵᛴ;-><init>(Ljava/lang/Throwable;)V

    .line 632
    .line 633
    .line 634
    move-object v0, v7

    .line 635
    :goto_9
    invoke-static {v0}, Lyyds/ᲁᛶᛱᛵ;->ᛲᲈᲁ(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 636
    .line 637
    .line 638
    move-result-object v7

    .line 639
    if-eqz v7, :cond_1b

    .line 640
    .line 641
    sget-object v8, Lyyds/ᲁᲁᲁᛳ;->ᛲᲈᲁ:Lyyds/ᲁᲁᲁᛳ;

    .line 642
    .line 643
    const-wide v18, -0x3035be68a836eL

    .line 644
    .line 645
    .line 646
    .line 647
    .line 648
    invoke-static/range {v18 .. v19}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 649
    .line 650
    .line 651
    move-result-object v6

    .line 652
    invoke-virtual {v8, v6, v7}, Lyyds/ᲁᲁᲁᛳ;->ᛵᛸᛸᛷ(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 653
    .line 654
    .line 655
    :cond_1b
    sget-object v6, Lyyds/ᛱᛴᛵᲀ;->ᛲᛴᛳᛲ:Lyyds/ᛱᛴᛵᲀ;

    .line 656
    .line 657
    instance-of v7, v0, Lyyds/ᲈᛵᛵᛴ;

    .line 658
    .line 659
    if-eqz v7, :cond_1c

    .line 660
    .line 661
    move-object v0, v6

    .line 662
    :cond_1c
    check-cast v0, Lyyds/ᛱᛴᛵᲀ;

    .line 663
    .line 664
    goto :goto_b

    .line 665
    :cond_1d
    :goto_a
    sget-object v0, Lyyds/ᛱᛴᛵᲀ;->ᲀᛲᛳᲀ:Lyyds/ᛱᛴᛵᲀ;

    .line 666
    .line 667
    :goto_b
    sget-object v6, Lyyds/ᛱᛴᛵᲀ;->ᛲᛴᛳᛲ:Lyyds/ᛱᛴᛵᲀ;

    .line 668
    .line 669
    if-ne v0, v6, :cond_1e

    .line 670
    .line 671
    const-wide v0, -0x30137e68a836eL

    .line 672
    .line 673
    .line 674
    .line 675
    .line 676
    invoke-static {v0, v1}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 677
    .line 678
    .line 679
    move-result-object v0

    .line 680
    invoke-static {v0}, Lyyds/ᛷᲇᛷᛴ;->ᲀᛲᛱᛱ(Ljava/lang/String;)V

    .line 681
    .line 682
    .line 683
    goto/16 :goto_27

    .line 684
    .line 685
    :cond_1e
    sget-object v6, Lyyds/ᛱᛴᛵᲀ;->ᲇᲈᛵᛷ:Lyyds/ᛱᛴᛵᲀ;

    .line 686
    .line 687
    if-ne v0, v6, :cond_1f

    .line 688
    .line 689
    move v0, v9

    .line 690
    goto :goto_c

    .line 691
    :cond_1f
    move v0, v1

    .line 692
    :goto_c
    iget-boolean v6, v3, Lyyds/ᛴᛸᛸᲁ;->ᛵᛸᛸᛷ:Z

    .line 693
    .line 694
    if-eqz v6, :cond_20

    .line 695
    .line 696
    sget-object v0, Lyyds/ᛳᲀᛵᛷ;->ᛲᛴᛳᛲ:Lyyds/ᛳᲀᛵᛷ;

    .line 697
    .line 698
    invoke-static {v0}, Lyyds/ᛷᲇᛷᛴ;->ᛴᛸᛴᛸ(Lyyds/ᛳᲀᛵᛷ;)V

    .line 699
    .line 700
    .line 701
    invoke-static {}, Lyyds/ᛷᲇᛷᛴ;->ᛳᛷᛶᛲ()V

    .line 702
    .line 703
    .line 704
    goto/16 :goto_27

    .line 705
    .line 706
    :cond_20
    iget-boolean v3, v3, Lyyds/ᛴᛸᛸᲁ;->ᛲᲈᲁ:Z

    .line 707
    .line 708
    if-nez v3, :cond_37

    .line 709
    .line 710
    sget-object v3, Lyyds/ᛳᲀᛵᛷ;->ᲇᲈᛵᛷ:Lyyds/ᛳᲀᛵᛷ;

    .line 711
    .line 712
    invoke-static {v3}, Lyyds/ᛷᲇᛷᛴ;->ᛴᛸᛴᛸ(Lyyds/ᛳᲀᛵᛷ;)V

    .line 713
    .line 714
    .line 715
    if-nez v0, :cond_36

    .line 716
    .line 717
    invoke-static {v12}, Lyyds/ᛷᲇᛷᛴ;->ᛶᲀᲈᲇ(Landroid/view/ViewGroup;)Z

    .line 718
    .line 719
    .line 720
    move-result v0

    .line 721
    if-nez v0, :cond_21

    .line 722
    .line 723
    goto/16 :goto_15

    .line 724
    .line 725
    :cond_21
    sget-wide v3, Lyyds/ᛷᲇᛷᛴ;->ᲈᲀᛲᲀ:J

    .line 726
    .line 727
    cmp-long v0, v3, v22

    .line 728
    .line 729
    if-nez v0, :cond_22

    .line 730
    .line 731
    sput-wide v14, Lyyds/ᛷᲇᛷᛴ;->ᲈᲀᛲᲀ:J

    .line 732
    .line 733
    sput v1, Lyyds/ᛷᲇᛷᛴ;->ᛵᲀᛵᛸ:I

    .line 734
    .line 735
    move-wide v3, v14

    .line 736
    :cond_22
    sub-long v3, v14, v3

    .line 737
    .line 738
    const-wide/16 v6, 0xfa0

    .line 739
    .line 740
    cmp-long v0, v3, v6

    .line 741
    .line 742
    if-ltz v0, :cond_23

    .line 743
    .line 744
    sget-wide v3, Lyyds/ᛷᲇᛷᛴ;->ᛳᛸᛴᛶ:J

    .line 745
    .line 746
    sub-long/2addr v14, v3

    .line 747
    cmp-long v0, v14, v6

    .line 748
    .line 749
    if-ltz v0, :cond_23

    .line 750
    .line 751
    const-wide v0, -0x30140e68a836eL

    .line 752
    .line 753
    .line 754
    .line 755
    .line 756
    invoke-static {v0, v1}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 757
    .line 758
    .line 759
    move-result-object v0

    .line 760
    invoke-static {v0}, Lyyds/ᛷᲇᛷᛴ;->ᲀᛲᛱᛱ(Ljava/lang/String;)V

    .line 761
    .line 762
    .line 763
    goto/16 :goto_27

    .line 764
    .line 765
    :cond_23
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 766
    .line 767
    .line 768
    move-result-object v3

    .line 769
    invoke-virtual {v12}, Landroid/view/View;->getHeight()I

    .line 770
    .line 771
    .line 772
    move-result v0

    .line 773
    mul-int/lit8 v0, v0, 0x3

    .line 774
    .line 775
    const/4 v4, 0x4

    .line 776
    div-int/2addr v0, v4

    .line 777
    if-ge v0, v9, :cond_24

    .line 778
    .line 779
    move v6, v9

    .line 780
    goto :goto_d

    .line 781
    :cond_24
    move v6, v0

    .line 782
    :goto_d
    invoke-static {v12}, Lyyds/ᛷᲇᛷᛴ;->ᛷᲇᛲᛱ(Landroid/view/ViewGroup;)Landroid/view/ViewParent;

    .line 783
    .line 784
    .line 785
    move-result-object v7

    .line 786
    if-nez v7, :cond_25

    .line 787
    .line 788
    goto :goto_11

    .line 789
    :cond_25
    :try_start_4
    sget-object v0, Lyyds/ᛷᲇᛷᛴ;->ᛳᛴᲇᛶ:Ljava/lang/reflect/Method;

    .line 790
    .line 791
    if-eqz v0, :cond_26

    .line 792
    .line 793
    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 794
    .line 795
    .line 796
    move-result-object v8

    .line 797
    filled-new-array {v3, v8}, [Ljava/lang/Object;

    .line 798
    .line 799
    .line 800
    move-result-object v8

    .line 801
    invoke-virtual {v0, v7, v8}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 802
    .line 803
    .line 804
    move-result-object v0

    .line 805
    goto :goto_e

    .line 806
    :catchall_2
    move-exception v0

    .line 807
    goto :goto_f

    .line 808
    :cond_26
    const/4 v0, 0x0

    .line 809
    :goto_e
    instance-of v8, v0, Ljava/lang/Integer;

    .line 810
    .line 811
    if-eqz v8, :cond_27

    .line 812
    .line 813
    check-cast v0, Ljava/lang/Integer;
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_2

    .line 814
    .line 815
    goto :goto_10

    .line 816
    :cond_27
    const/4 v0, 0x0

    .line 817
    goto :goto_10

    .line 818
    :goto_f
    new-instance v8, Lyyds/ᲈᛵᛵᛴ;

    .line 819
    .line 820
    invoke-direct {v8, v0}, Lyyds/ᲈᛵᛵᛴ;-><init>(Ljava/lang/Throwable;)V

    .line 821
    .line 822
    .line 823
    move-object v0, v8

    .line 824
    :goto_10
    invoke-static {v0}, Lyyds/ᲁᛶᛱᛵ;->ᛲᲈᲁ(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 825
    .line 826
    .line 827
    move-result-object v8

    .line 828
    if-eqz v8, :cond_28

    .line 829
    .line 830
    sget-object v11, Lyyds/ᲁᲁᲁᛳ;->ᛲᲈᲁ:Lyyds/ᲁᲁᲁᛳ;

    .line 831
    .line 832
    const-wide v14, -0x30381e68a836eL

    .line 833
    .line 834
    .line 835
    .line 836
    .line 837
    invoke-static {v14, v15}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 838
    .line 839
    .line 840
    move-result-object v14

    .line 841
    invoke-virtual {v11, v14, v8}, Lyyds/ᲁᲁᲁᛳ;->ᛵᛸᛸᛷ(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 842
    .line 843
    .line 844
    :cond_28
    invoke-static {v0}, Lyyds/ᲁᛶᛱᛵ;->ᛲᲈᲁ(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 845
    .line 846
    .line 847
    move-result-object v8

    .line 848
    if-nez v8, :cond_31

    .line 849
    .line 850
    check-cast v0, Ljava/lang/Integer;

    .line 851
    .line 852
    if-eqz v0, :cond_30

    .line 853
    .line 854
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 855
    .line 856
    .line 857
    move-result v0

    .line 858
    invoke-static {v0, v1, v6}, Lyyds/ᛳᛵᲀ;->ᲀᛲᛳᲀ(III)I

    .line 859
    .line 860
    .line 861
    move-result v1

    .line 862
    :goto_11
    if-eqz v7, :cond_2c

    .line 863
    .line 864
    if-lez v1, :cond_2c

    .line 865
    .line 866
    sget-object v0, Lyyds/ᛷᲇᛷᛴ;->ᲇᲇᲈᲀ:Ljava/lang/reflect/Method;

    .line 867
    .line 868
    if-nez v0, :cond_29

    .line 869
    .line 870
    sget-object v0, Lyyds/ᛱᛴᛵᲀ;->ᛲᛴᛳᛲ:Lyyds/ᛱᛴᛵᲀ;

    .line 871
    .line 872
    goto/16 :goto_14

    .line 873
    .line 874
    :cond_29
    :try_start_5
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 875
    .line 876
    .line 877
    move-result-object v1

    .line 878
    filled-new-array {v3, v1}, [Ljava/lang/Object;

    .line 879
    .line 880
    .line 881
    move-result-object v1

    .line 882
    invoke-virtual {v0, v7, v1}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 883
    .line 884
    .line 885
    sget-object v0, Lyyds/ᛱᛴᛵᲀ;->ᲇᲈᛵᛷ:Lyyds/ᛱᛴᛵᲀ;
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_3

    .line 886
    .line 887
    goto :goto_12

    .line 888
    :catchall_3
    move-exception v0

    .line 889
    new-instance v1, Lyyds/ᲈᛵᛵᛴ;

    .line 890
    .line 891
    invoke-direct {v1, v0}, Lyyds/ᲈᛵᛵᛴ;-><init>(Ljava/lang/Throwable;)V

    .line 892
    .line 893
    .line 894
    move-object v0, v1

    .line 895
    :goto_12
    invoke-static {v0}, Lyyds/ᲁᛶᛱᛵ;->ᛲᲈᲁ(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 896
    .line 897
    .line 898
    move-result-object v1

    .line 899
    if-eqz v1, :cond_2a

    .line 900
    .line 901
    sget-object v3, Lyyds/ᲁᲁᲁᛳ;->ᛲᲈᲁ:Lyyds/ᲁᲁᲁᛳ;

    .line 902
    .line 903
    const-wide v5, -0x30396e68a836eL

    .line 904
    .line 905
    .line 906
    .line 907
    .line 908
    invoke-static {v5, v6}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 909
    .line 910
    .line 911
    move-result-object v5

    .line 912
    invoke-virtual {v3, v5, v1}, Lyyds/ᲁᲁᲁᛳ;->ᛵᛸᛸᛷ(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 913
    .line 914
    .line 915
    :cond_2a
    sget-object v1, Lyyds/ᛱᛴᛵᲀ;->ᛲᛴᛳᛲ:Lyyds/ᛱᛴᛵᲀ;

    .line 916
    .line 917
    instance-of v3, v0, Lyyds/ᲈᛵᛵᛴ;

    .line 918
    .line 919
    if-eqz v3, :cond_2b

    .line 920
    .line 921
    move-object v0, v1

    .line 922
    :cond_2b
    check-cast v0, Lyyds/ᛱᛴᛵᲀ;

    .line 923
    .line 924
    goto :goto_14

    .line 925
    :cond_2c
    invoke-virtual {v12, v9}, Landroid/view/View;->canScrollVertically(I)Z

    .line 926
    .line 927
    .line 928
    move-result v0

    .line 929
    if-nez v0, :cond_2d

    .line 930
    .line 931
    sget-object v0, Lyyds/ᛱᛴᛵᲀ;->ᲀᛲᛳᲀ:Lyyds/ᛱᛴᛵᲀ;

    .line 932
    .line 933
    goto :goto_14

    .line 934
    :cond_2d
    :try_start_6
    invoke-virtual {v12}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 935
    .line 936
    .line 937
    move-result-object v0

    .line 938
    const-wide v7, -0x303a7e68a836eL

    .line 939
    .line 940
    .line 941
    .line 942
    .line 943
    invoke-static {v7, v8}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 944
    .line 945
    .line 946
    move-result-object v1

    .line 947
    filled-new-array {v5, v5}, [Ljava/lang/Class;

    .line 948
    .line 949
    .line 950
    move-result-object v5

    .line 951
    invoke-virtual {v0, v1, v5}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 952
    .line 953
    .line 954
    move-result-object v0

    .line 955
    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 956
    .line 957
    .line 958
    move-result-object v1

    .line 959
    filled-new-array {v3, v1}, [Ljava/lang/Object;

    .line 960
    .line 961
    .line 962
    move-result-object v1

    .line 963
    invoke-virtual {v0, v12, v1}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 964
    .line 965
    .line 966
    sget-object v0, Lyyds/ᛱᛴᛵᲀ;->ᲇᲈᛵᛷ:Lyyds/ᛱᛴᛵᲀ;
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_4

    .line 967
    .line 968
    goto :goto_13

    .line 969
    :catchall_4
    move-exception v0

    .line 970
    new-instance v1, Lyyds/ᲈᛵᛵᛴ;

    .line 971
    .line 972
    invoke-direct {v1, v0}, Lyyds/ᲈᛵᛵᛴ;-><init>(Ljava/lang/Throwable;)V

    .line 973
    .line 974
    .line 975
    move-object v0, v1

    .line 976
    :goto_13
    invoke-static {v0}, Lyyds/ᲁᛶᛱᛵ;->ᛲᲈᲁ(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 977
    .line 978
    .line 979
    move-result-object v1

    .line 980
    if-eqz v1, :cond_2e

    .line 981
    .line 982
    sget-object v3, Lyyds/ᲁᲁᲁᛳ;->ᛲᲈᲁ:Lyyds/ᲁᲁᲁᛳ;

    .line 983
    .line 984
    const-wide v5, -0x303b6e68a836eL

    .line 985
    .line 986
    .line 987
    .line 988
    .line 989
    invoke-static {v5, v6}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 990
    .line 991
    .line 992
    move-result-object v5

    .line 993
    invoke-virtual {v3, v5, v1}, Lyyds/ᲁᲁᲁᛳ;->ᛵᛸᛸᛷ(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 994
    .line 995
    .line 996
    :cond_2e
    sget-object v1, Lyyds/ᛱᛴᛵᲀ;->ᛲᛴᛳᛲ:Lyyds/ᛱᛴᛵᲀ;

    .line 997
    .line 998
    instance-of v3, v0, Lyyds/ᲈᛵᛵᛴ;

    .line 999
    .line 1000
    if-eqz v3, :cond_2f

    .line 1001
    .line 1002
    move-object v0, v1

    .line 1003
    :cond_2f
    check-cast v0, Lyyds/ᛱᛴᛵᲀ;

    .line 1004
    .line 1005
    goto :goto_14

    .line 1006
    :cond_30
    sget-object v0, Lyyds/ᛱᛴᛵᲀ;->ᛲᛴᛳᛲ:Lyyds/ᛱᛴᛵᲀ;

    .line 1007
    .line 1008
    goto :goto_14

    .line 1009
    :cond_31
    sget-object v0, Lyyds/ᛱᛴᛵᲀ;->ᛲᛴᛳᛲ:Lyyds/ᛱᛴᛵᲀ;

    .line 1010
    .line 1011
    :goto_14
    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    .line 1012
    .line 1013
    .line 1014
    move-result v0

    .line 1015
    if-eqz v0, :cond_35

    .line 1016
    .line 1017
    if-eq v0, v9, :cond_33

    .line 1018
    .line 1019
    if-ne v0, v13, :cond_32

    .line 1020
    .line 1021
    const-wide v0, -0x30156e68a836eL

    .line 1022
    .line 1023
    .line 1024
    .line 1025
    .line 1026
    invoke-static {v0, v1}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 1027
    .line 1028
    .line 1029
    move-result-object v0

    .line 1030
    invoke-static {v0}, Lyyds/ᛷᲇᛷᛴ;->ᲀᛲᛱᛱ(Ljava/lang/String;)V

    .line 1031
    .line 1032
    .line 1033
    goto/16 :goto_27

    .line 1034
    .line 1035
    :cond_32
    invoke-static {}, Lyyds/ᛱᛸᛶᛲ;->ᛷᲈᲈᲁ()V

    .line 1036
    .line 1037
    .line 1038
    goto/16 :goto_27

    .line 1039
    .line 1040
    :cond_33
    sget v0, Lyyds/ᛷᲇᛷᛴ;->ᛵᲀᛵᛸ:I

    .line 1041
    .line 1042
    add-int/2addr v0, v9

    .line 1043
    sput v0, Lyyds/ᛷᲇᛷᛴ;->ᛵᲀᛵᛸ:I

    .line 1044
    .line 1045
    const/16 v1, 0x8

    .line 1046
    .line 1047
    if-le v0, v1, :cond_34

    .line 1048
    .line 1049
    const-wide v0, -0x3014be68a836eL

    .line 1050
    .line 1051
    .line 1052
    .line 1053
    .line 1054
    invoke-static {v0, v1}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 1055
    .line 1056
    .line 1057
    move-result-object v0

    .line 1058
    invoke-static {v0}, Lyyds/ᛷᲇᛷᛴ;->ᲀᛲᛱᛱ(Ljava/lang/String;)V

    .line 1059
    .line 1060
    .line 1061
    goto/16 :goto_27

    .line 1062
    .line 1063
    :cond_34
    invoke-static {}, Lyyds/ᛷᲇᛷᛴ;->ᛳᛷᛶᛲ()V

    .line 1064
    .line 1065
    .line 1066
    goto/16 :goto_27

    .line 1067
    .line 1068
    :cond_35
    sget-object v0, Lyyds/ᲁᲁᲁᛳ;->ᛲᲈᲁ:Lyyds/ᲁᲁᲁᛳ;

    .line 1069
    .line 1070
    new-instance v1, Ljava/lang/StringBuilder;

    .line 1071
    .line 1072
    const-wide v5, -0x3015fe68a836eL

    .line 1073
    .line 1074
    .line 1075
    .line 1076
    .line 1077
    invoke-static {v5, v6}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 1078
    .line 1079
    .line 1080
    move-result-object v3

    .line 1081
    invoke-direct {v1, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 1082
    .line 1083
    .line 1084
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 1085
    .line 1086
    .line 1087
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 1088
    .line 1089
    .line 1090
    move-result-object v1

    .line 1091
    invoke-virtual {v0, v1}, Lyyds/ᲁᲁᲁᛳ;->ᛲᲈᲁ(Ljava/lang/String;)V

    .line 1092
    .line 1093
    .line 1094
    invoke-virtual {v12, v4}, Landroid/view/View;->performHapticFeedback(I)Z

    .line 1095
    .line 1096
    .line 1097
    sget-object v0, Lyyds/ᛳᲀᛵᛷ;->ᲇᲇᲇᛱ:Lyyds/ᛳᲀᛵᛷ;

    .line 1098
    .line 1099
    invoke-static {v10, v0, v9}, Lyyds/ᛷᲇᛷᛴ;->ᛳᛴᲇᛶ(Lyyds/ᛷᲇᛷᛴ;Lyyds/ᛳᲀᛵᛷ;I)V

    .line 1100
    .line 1101
    .line 1102
    goto/16 :goto_27

    .line 1103
    .line 1104
    :cond_36
    :goto_15
    invoke-static {}, Lyyds/ᛷᲇᛷᛴ;->ᛳᛷᛶᛲ()V

    .line 1105
    .line 1106
    .line 1107
    goto/16 :goto_27

    .line 1108
    .line 1109
    :cond_37
    sput-wide v22, Lyyds/ᛷᲇᛷᛴ;->ᲈᲀᛲᲀ:J

    .line 1110
    .line 1111
    sput v1, Lyyds/ᛷᲇᛷᛴ;->ᛵᲀᛵᛸ:I

    .line 1112
    .line 1113
    if-nez v0, :cond_39

    .line 1114
    .line 1115
    invoke-static {v12}, Lyyds/ᛷᲇᛷᛴ;->ᛶᲀᲈᲇ(Landroid/view/ViewGroup;)Z

    .line 1116
    .line 1117
    .line 1118
    move-result v0

    .line 1119
    if-nez v0, :cond_38

    .line 1120
    .line 1121
    goto :goto_16

    .line 1122
    :cond_38
    move v3, v1

    .line 1123
    goto :goto_17

    .line 1124
    :cond_39
    :goto_16
    move v3, v9

    .line 1125
    :goto_17
    if-gtz v2, :cond_3a

    .line 1126
    .line 1127
    goto/16 :goto_1e

    .line 1128
    .line 1129
    :cond_3a
    sget-object v0, Lyyds/ᛷᲇᛷᛴ;->ᛲᛶᛱᲈ:Lyyds/ᛱᛵᛷᲈ;

    .line 1130
    .line 1131
    if-eqz v0, :cond_3c

    .line 1132
    .line 1133
    iget v0, v0, Lyyds/ᛱᛵᛷᲈ;->ᛵᛸᛸᛷ:I

    .line 1134
    .line 1135
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 1136
    .line 1137
    .line 1138
    move-result-object v5

    .line 1139
    if-ltz v0, :cond_3b

    .line 1140
    .line 1141
    goto :goto_18

    .line 1142
    :cond_3b
    const/4 v5, 0x0

    .line 1143
    :goto_18
    if-eqz v5, :cond_3c

    .line 1144
    .line 1145
    invoke-virtual {v5}, Ljava/lang/Integer;->intValue()I

    .line 1146
    .line 1147
    .line 1148
    move-result v0

    .line 1149
    goto :goto_1c

    .line 1150
    :cond_3c
    const-wide v5, -0x30286e68a836eL

    .line 1151
    .line 1152
    .line 1153
    .line 1154
    .line 1155
    invoke-static {v5, v6}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 1156
    .line 1157
    .line 1158
    move-result-object v0

    .line 1159
    new-array v5, v1, [Ljava/lang/Object;

    .line 1160
    .line 1161
    invoke-static {v12, v0, v5}, Lyyds/ᛱᛶᛶᲇ;->ᲈᲀᛲᲀ(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 1162
    .line 1163
    .line 1164
    move-result-object v0

    .line 1165
    if-eqz v0, :cond_3f

    .line 1166
    .line 1167
    const-wide v5, -0x30297e68a836eL

    .line 1168
    .line 1169
    .line 1170
    .line 1171
    .line 1172
    invoke-static {v5, v6}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 1173
    .line 1174
    .line 1175
    move-result-object v5

    .line 1176
    new-array v6, v1, [Ljava/lang/Object;

    .line 1177
    .line 1178
    :try_start_7
    sget v7, Lyyds/ᲁᛸᛵᲁ;->ᛲᲈᲁ:I

    .line 1179
    .line 1180
    invoke-static {v0}, Lyyds/ᛲᲇᲁᛳ;->ᛷᛵᲇᲀ(Ljava/lang/Object;)Lyyds/ᲀᛵᲁᛴ;

    .line 1181
    .line 1182
    .line 1183
    move-result-object v0

    .line 1184
    iget-object v7, v0, Lyyds/ᲀᛵᲁᛴ;->ᲇᲈᛵᛷ:Ljava/lang/Object;

    .line 1185
    .line 1186
    check-cast v7, Lyyds/ᛴᛸᛲᛳ;

    .line 1187
    .line 1188
    iput v13, v7, Lyyds/ᛴᛸᛲᛳ;->ᲇᲈᛵᛷ:I

    .line 1189
    .line 1190
    invoke-virtual {v0}, Lyyds/ᲀᛵᲁᛴ;->ᛶᲈᛴᲈ()Lyyds/ᛵᲀᲀᛶ;

    .line 1191
    .line 1192
    .line 1193
    move-result-object v0

    .line 1194
    invoke-virtual {v0}, Lyyds/ᲇᛴᲇᛶ;->ᲇᲈᛵᛷ()V

    .line 1195
    .line 1196
    .line 1197
    iput-object v5, v0, Lyyds/ᲇᛴᲇᛶ;->ᛵᛸᛸᛷ:Ljava/lang/String;

    .line 1198
    .line 1199
    invoke-static/range {v20 .. v21}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 1200
    .line 1201
    .line 1202
    invoke-virtual {v0}, Lyyds/ᛵᲀᲀᛶ;->ᛲᲈᲁ()Ljava/util/List;

    .line 1203
    .line 1204
    .line 1205
    move-result-object v0

    .line 1206
    invoke-static {v0}, Lyyds/ᛷᛷᛶᲇ;->ᲀᛲᛱᛱ(Ljava/util/List;)Ljava/lang/Object;

    .line 1207
    .line 1208
    .line 1209
    move-result-object v0

    .line 1210
    check-cast v0, Lyyds/ᛳᛲᛶᛴ;

    .line 1211
    .line 1212
    if-eqz v0, :cond_3d

    .line 1213
    .line 1214
    invoke-static {v6, v1}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 1215
    .line 1216
    .line 1217
    move-result-object v5

    .line 1218
    invoke-virtual {v0, v5}, Lyyds/ᛳᛲᛶᛴ;->ᛱᛳᛶᛳ([Ljava/lang/Object;)Ljava/lang/Object;

    .line 1219
    .line 1220
    .line 1221
    move-result-object v0

    .line 1222
    goto :goto_19

    .line 1223
    :catch_2
    move-exception v0

    .line 1224
    goto :goto_1a

    .line 1225
    :cond_3d
    const/4 v0, 0x0

    .line 1226
    :goto_19
    instance-of v5, v0, Ljava/lang/Integer;

    .line 1227
    .line 1228
    if-nez v5, :cond_3e

    .line 1229
    .line 1230
    const/4 v0, 0x0

    .line 1231
    :cond_3e
    check-cast v0, Ljava/lang/Integer;
    :try_end_7
    .catch Ljava/lang/Exception; {:try_start_7 .. :try_end_7} :catch_2

    .line 1232
    .line 1233
    goto :goto_1b

    .line 1234
    :goto_1a
    sget-object v5, Lyyds/ᲁᲁᲁᛳ;->ᛲᲈᲁ:Lyyds/ᲁᲁᲁᛳ;

    .line 1235
    .line 1236
    const-wide v6, -0x302b3e68a836eL

    .line 1237
    .line 1238
    .line 1239
    .line 1240
    .line 1241
    invoke-static {v6, v7}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 1242
    .line 1243
    .line 1244
    move-result-object v6

    .line 1245
    invoke-virtual {v5, v6, v0}, Lyyds/ᲁᲁᲁᛳ;->ᛵᛸᛸᛷ(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 1246
    .line 1247
    .line 1248
    :cond_3f
    const/4 v0, 0x0

    .line 1249
    :goto_1b
    if-eqz v0, :cond_41

    .line 1250
    .line 1251
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 1252
    .line 1253
    .line 1254
    move-result v0

    .line 1255
    :goto_1c
    add-int/lit8 v2, v2, -0x9

    .line 1256
    .line 1257
    if-gez v2, :cond_40

    .line 1258
    .line 1259
    goto :goto_1d

    .line 1260
    :cond_40
    move v1, v2

    .line 1261
    :goto_1d
    if-lt v0, v1, :cond_41

    .line 1262
    .line 1263
    goto :goto_1f

    .line 1264
    :cond_41
    :goto_1e
    if-nez v3, :cond_4b

    .line 1265
    .line 1266
    :goto_1f
    sget-object v0, Lyyds/ᛷᲇᛷᛴ;->ᛵᲀᲈᛴ:Lyyds/ᛴᲈᛴᛶ;

    .line 1267
    .line 1268
    invoke-static {v0, v4}, Lyyds/ᛷᛴᲇᛲ;->ᛲᲈᲁ(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 1269
    .line 1270
    .line 1271
    move-result v0

    .line 1272
    if-eqz v0, :cond_42

    .line 1273
    .line 1274
    sget-object v0, Lyyds/ᛱᲇᛱᲇ;->ᲀᛲᛳᲀ:Lyyds/ᛱᲇᛱᲇ;

    .line 1275
    .line 1276
    goto/16 :goto_22

    .line 1277
    .line 1278
    :cond_42
    sget-wide v0, Lyyds/ᛷᲇᛷᛴ;->ᛶᲈᛴᲈ:J

    .line 1279
    .line 1280
    cmp-long v2, v0, v22

    .line 1281
    .line 1282
    if-eqz v2, :cond_43

    .line 1283
    .line 1284
    sub-long v0, v14, v0

    .line 1285
    .line 1286
    cmp-long v0, v0, v16

    .line 1287
    .line 1288
    if-gez v0, :cond_43

    .line 1289
    .line 1290
    sget-object v0, Lyyds/ᛱᲇᛱᲇ;->ᲀᛲᛳᲀ:Lyyds/ᛱᲇᛱᲇ;

    .line 1291
    .line 1292
    goto :goto_22

    .line 1293
    :cond_43
    sput-wide v14, Lyyds/ᛷᲇᛷᛴ;->ᛶᲈᛴᲈ:J

    .line 1294
    .line 1295
    sput-object v4, Lyyds/ᛷᲇᛷᛴ;->ᛵᲀᲈᛴ:Lyyds/ᛴᲈᛴᛶ;

    .line 1296
    .line 1297
    sget-object v0, Lyyds/ᲁᲁᲁᛳ;->ᛲᲈᲁ:Lyyds/ᲁᲁᲁᛳ;

    .line 1298
    .line 1299
    new-instance v1, Ljava/lang/StringBuilder;

    .line 1300
    .line 1301
    const-wide v5, -0x302c4e68a836eL

    .line 1302
    .line 1303
    .line 1304
    .line 1305
    .line 1306
    invoke-static {v5, v6}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 1307
    .line 1308
    .line 1309
    move-result-object v2

    .line 1310
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 1311
    .line 1312
    .line 1313
    iget v2, v4, Lyyds/ᛴᲈᛴᛶ;->ᛲᲈᲁ:I

    .line 1314
    .line 1315
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 1316
    .line 1317
    .line 1318
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 1319
    .line 1320
    .line 1321
    move-result-object v1

    .line 1322
    invoke-virtual {v0, v1}, Lyyds/ᲁᲁᲁᛳ;->ᛲᲈᲁ(Ljava/lang/String;)V

    .line 1323
    .line 1324
    .line 1325
    :try_start_8
    sget-object v0, Lyyds/ᛷᲇᛷᛴ;->ᛷᛴᛴᲁ:Ljava/lang/reflect/Method;

    .line 1326
    .line 1327
    if-eqz v0, :cond_44

    .line 1328
    .line 1329
    const/4 v1, 0x0

    .line 1330
    invoke-virtual {v0, v11, v1}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 1331
    .line 1332
    .line 1333
    move-result-object v0

    .line 1334
    goto :goto_21

    .line 1335
    :catchall_5
    move-exception v0

    .line 1336
    goto :goto_20

    .line 1337
    :cond_44
    const-wide v0, -0x302eae68a836eL

    .line 1338
    .line 1339
    .line 1340
    .line 1341
    .line 1342
    invoke-static {v0, v1}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 1343
    .line 1344
    .line 1345
    move-result-object v0

    .line 1346
    new-instance v1, Ljava/lang/IllegalArgumentException;

    .line 1347
    .line 1348
    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 1349
    .line 1350
    .line 1351
    move-result-object v0

    .line 1352
    invoke-direct {v1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 1353
    .line 1354
    .line 1355
    throw v1
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_5

    .line 1356
    :goto_20
    new-instance v1, Lyyds/ᲈᛵᛵᛴ;

    .line 1357
    .line 1358
    invoke-direct {v1, v0}, Lyyds/ᲈᛵᛵᛴ;-><init>(Ljava/lang/Throwable;)V

    .line 1359
    .line 1360
    .line 1361
    move-object v0, v1

    .line 1362
    :goto_21
    invoke-static {v0}, Lyyds/ᲁᛶᛱᛵ;->ᛲᲈᲁ(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 1363
    .line 1364
    .line 1365
    move-result-object v0

    .line 1366
    if-nez v0, :cond_45

    .line 1367
    .line 1368
    sget-object v0, Lyyds/ᛱᲇᛱᲇ;->ᲇᲈᛵᛷ:Lyyds/ᛱᲇᛱᲇ;

    .line 1369
    .line 1370
    goto :goto_22

    .line 1371
    :cond_45
    sget-object v1, Lyyds/ᲁᲁᲁᛳ;->ᛲᲈᲁ:Lyyds/ᲁᲁᲁᛳ;

    .line 1372
    .line 1373
    const-wide v4, -0x30303e68a836eL

    .line 1374
    .line 1375
    .line 1376
    .line 1377
    .line 1378
    invoke-static {v4, v5}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 1379
    .line 1380
    .line 1381
    move-result-object v2

    .line 1382
    invoke-virtual {v1, v2, v0}, Lyyds/ᲁᲁᲁᛳ;->ᛵᛸᛸᛷ(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 1383
    .line 1384
    .line 1385
    sget-object v0, Lyyds/ᛷᲇᛷᛴ;->ᲇᲇᲇᛱ:Lyyds/ᛷᲇᛷᛴ;

    .line 1386
    .line 1387
    const-wide v1, -0x30313e68a836eL

    .line 1388
    .line 1389
    .line 1390
    .line 1391
    .line 1392
    invoke-static {v1, v2}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 1393
    .line 1394
    .line 1395
    move-result-object v1

    .line 1396
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1397
    .line 1398
    .line 1399
    invoke-static {v1}, Lyyds/ᛷᲇᛷᛴ;->ᲀᛲᛱᛱ(Ljava/lang/String;)V

    .line 1400
    .line 1401
    .line 1402
    sget-object v0, Lyyds/ᛱᲇᛱᲇ;->ᛲᛴᛳᛲ:Lyyds/ᛱᲇᛱᲇ;

    .line 1403
    .line 1404
    :goto_22
    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    .line 1405
    .line 1406
    .line 1407
    move-result v0

    .line 1408
    if-eqz v0, :cond_49

    .line 1409
    .line 1410
    if-eq v0, v9, :cond_47

    .line 1411
    .line 1412
    if-ne v0, v13, :cond_46

    .line 1413
    .line 1414
    goto :goto_27

    .line 1415
    :cond_46
    invoke-static {}, Lyyds/ᛱᛸᛶᛲ;->ᛷᲈᲈᲁ()V

    .line 1416
    .line 1417
    .line 1418
    goto :goto_27

    .line 1419
    :cond_47
    if-eqz v3, :cond_48

    .line 1420
    .line 1421
    sget-object v0, Lyyds/ᛳᲀᛵᛷ;->ᲇᲈᛵᛷ:Lyyds/ᛳᲀᛵᛷ;

    .line 1422
    .line 1423
    goto :goto_23

    .line 1424
    :cond_48
    sget-object v0, Lyyds/ᛳᲀᛵᛷ;->ᛲᛴᛳᛲ:Lyyds/ᛳᲀᛵᛷ;

    .line 1425
    .line 1426
    :goto_23
    invoke-static {v0}, Lyyds/ᛷᲇᛷᛴ;->ᛴᛸᛴᛸ(Lyyds/ᛳᲀᛵᛷ;)V

    .line 1427
    .line 1428
    .line 1429
    goto :goto_25

    .line 1430
    :cond_49
    if-eqz v3, :cond_4a

    .line 1431
    .line 1432
    sget-object v0, Lyyds/ᛳᲀᛵᛷ;->ᲇᲈᛵᛷ:Lyyds/ᛳᲀᛵᛷ;

    .line 1433
    .line 1434
    goto :goto_24

    .line 1435
    :cond_4a
    sget-object v0, Lyyds/ᛳᲀᛵᛷ;->ᛲᛴᛳᛲ:Lyyds/ᛳᲀᛵᛷ;

    .line 1436
    .line 1437
    :goto_24
    invoke-static {v0}, Lyyds/ᛷᲇᛷᛴ;->ᛴᛸᛴᛸ(Lyyds/ᛳᲀᛵᛷ;)V

    .line 1438
    .line 1439
    .line 1440
    :goto_25
    invoke-static {}, Lyyds/ᛷᲇᛷᛴ;->ᛳᛷᛶᛲ()V

    .line 1441
    .line 1442
    .line 1443
    goto :goto_27

    .line 1444
    :cond_4b
    sget-object v0, Lyyds/ᛳᲀᛵᛷ;->ᲇᲈᛵᛷ:Lyyds/ᛳᲀᛵᛷ;

    .line 1445
    .line 1446
    invoke-static {v0}, Lyyds/ᛷᲇᛷᛴ;->ᛴᛸᛴᛸ(Lyyds/ᛳᲀᛵᛷ;)V

    .line 1447
    .line 1448
    .line 1449
    invoke-static {}, Lyyds/ᛷᲇᛷᛴ;->ᛳᛷᛶᛲ()V

    .line 1450
    .line 1451
    .line 1452
    goto :goto_27

    .line 1453
    :goto_26
    invoke-static {v10, v1, v13}, Lyyds/ᛷᲇᛷᛴ;->ᛳᛴᲇᛶ(Lyyds/ᛷᲇᛷᛴ;Lyyds/ᛳᲀᛵᛷ;I)V

    .line 1454
    .line 1455
    .line 1456
    :goto_27
    return-void

    .line 1457
    :pswitch_1
    :try_start_9
    const-string v0, "EmojiCompat.EmojiCompatInitializer.run"

    .line 1458
    .line 1459
    invoke-static {v0}, Landroid/os/Trace;->beginSection(Ljava/lang/String;)V

    .line 1460
    .line 1461
    .line 1462
    sget-object v0, Lyyds/ᛲᛴᛶᛸ;->ᛷᲈᲈᲁ:Lyyds/ᛲᛴᛶᛸ;

    .line 1463
    .line 1464
    if-eqz v0, :cond_4c

    .line 1465
    .line 1466
    move v1, v9

    .line 1467
    :cond_4c
    if-eqz v1, :cond_4d

    .line 1468
    .line 1469
    invoke-static {}, Lyyds/ᛲᛴᛶᛸ;->ᛲᲈᲁ()Lyyds/ᛲᛴᛶᛸ;

    .line 1470
    .line 1471
    .line 1472
    move-result-object v0

    .line 1473
    invoke-virtual {v0}, Lyyds/ᛲᛴᛶᛸ;->ᲀᛲᛳᲀ()V
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_6

    .line 1474
    .line 1475
    .line 1476
    :cond_4d
    invoke-static {}, Landroid/os/Trace;->endSection()V

    .line 1477
    .line 1478
    .line 1479
    return-void

    .line 1480
    :catchall_6
    move-exception v0

    .line 1481
    invoke-static {}, Landroid/os/Trace;->endSection()V

    .line 1482
    .line 1483
    .line 1484
    throw v0

    .line 1485
    :pswitch_2
    return-void

    .line 1486
    nop

    .line 1487
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
