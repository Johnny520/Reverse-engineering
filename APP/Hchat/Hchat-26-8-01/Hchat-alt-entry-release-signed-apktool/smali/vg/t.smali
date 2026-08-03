.class public final synthetic Lvg/t;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Lfg/p;


# instance fields
.field public final synthetic g:I


# direct methods
.method public synthetic constructor <init>(I)V
    .locals 0

    .line 1
    iput p1, p0, Lvg/t;->g:I

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 25

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget v1, v0, Lvg/t;->g:I

    .line 4
    .line 5
    packed-switch v1, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    move-object/from16 v1, p1

    .line 9
    .line 10
    check-cast v1, Li0/h0;

    .line 11
    .line 12
    move-object/from16 v2, p2

    .line 13
    .line 14
    check-cast v2, Ljava/lang/Integer;

    .line 15
    .line 16
    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    .line 17
    .line 18
    .line 19
    move-result v2

    .line 20
    and-int/lit8 v3, v2, 0x3

    .line 21
    .line 22
    const/4 v4, 0x2

    .line 23
    const/4 v5, 0x1

    .line 24
    if-eq v3, v4, :cond_0

    .line 25
    .line 26
    move v3, v5

    .line 27
    goto :goto_0

    .line 28
    :cond_0
    const/4 v3, 0x0

    .line 29
    :goto_0
    and-int/2addr v2, v5

    .line 30
    invoke-virtual {v1, v2, v3}, Li0/h0;->S(IZ)Z

    .line 31
    .line 32
    .line 33
    move-result v2

    .line 34
    if-eqz v2, :cond_1

    .line 35
    .line 36
    const-string v2, "\u6682\u65e0\u89c4\u5219"

    .line 37
    .line 38
    const/4 v3, 0x6

    .line 39
    invoke-static {v2, v1, v3}, Lwb/ho;->s0(Ljava/lang/String;Li0/h0;I)V

    .line 40
    .line 41
    .line 42
    goto :goto_1

    .line 43
    :cond_1
    invoke-virtual {v1}, Li0/h0;->V()V

    .line 44
    .line 45
    .line 46
    :goto_1
    sget-object v1, Lsf/n;->a:Lsf/n;

    .line 47
    .line 48
    return-object v1

    .line 49
    :pswitch_0
    move-object/from16 v1, p1

    .line 50
    .line 51
    check-cast v1, Li0/h0;

    .line 52
    .line 53
    move-object/from16 v2, p2

    .line 54
    .line 55
    check-cast v2, Ljava/lang/Integer;

    .line 56
    .line 57
    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    .line 58
    .line 59
    .line 60
    move-result v2

    .line 61
    and-int/lit8 v3, v2, 0x3

    .line 62
    .line 63
    const/4 v4, 0x2

    .line 64
    const/4 v5, 0x1

    .line 65
    if-eq v3, v4, :cond_2

    .line 66
    .line 67
    move v3, v5

    .line 68
    goto :goto_2

    .line 69
    :cond_2
    const/4 v3, 0x0

    .line 70
    :goto_2
    and-int/2addr v2, v5

    .line 71
    invoke-virtual {v1, v2, v3}, Li0/h0;->S(IZ)Z

    .line 72
    .line 73
    .line 74
    move-result v2

    .line 75
    if-eqz v2, :cond_3

    .line 76
    .line 77
    const-string v2, "\u6682\u65e0\u89c4\u5219"

    .line 78
    .line 79
    const/4 v3, 0x6

    .line 80
    invoke-static {v2, v1, v3}, Lwb/ho;->s0(Ljava/lang/String;Li0/h0;I)V

    .line 81
    .line 82
    .line 83
    goto :goto_3

    .line 84
    :cond_3
    invoke-virtual {v1}, Li0/h0;->V()V

    .line 85
    .line 86
    .line 87
    :goto_3
    sget-object v1, Lsf/n;->a:Lsf/n;

    .line 88
    .line 89
    return-object v1

    .line 90
    :pswitch_1
    move-object/from16 v1, p1

    .line 91
    .line 92
    check-cast v1, Li0/h0;

    .line 93
    .line 94
    move-object/from16 v2, p2

    .line 95
    .line 96
    check-cast v2, Ljava/lang/Integer;

    .line 97
    .line 98
    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    .line 99
    .line 100
    .line 101
    move-result v2

    .line 102
    and-int/lit8 v3, v2, 0x3

    .line 103
    .line 104
    const/4 v4, 0x2

    .line 105
    const/4 v5, 0x1

    .line 106
    if-eq v3, v4, :cond_4

    .line 107
    .line 108
    move v3, v5

    .line 109
    goto :goto_4

    .line 110
    :cond_4
    const/4 v3, 0x0

    .line 111
    :goto_4
    and-int/2addr v2, v5

    .line 112
    invoke-virtual {v1, v2, v3}, Li0/h0;->S(IZ)Z

    .line 113
    .line 114
    .line 115
    move-result v2

    .line 116
    if-eqz v2, :cond_5

    .line 117
    .line 118
    const-string v2, "\u53ea\u4f1a\u4fee\u6539\u5df2\u52fe\u9009\u201c\u5e94\u7528\u201d\u7684\u9879\u76ee\uff0c\u672a\u52fe\u9009\u7684\u8bbe\u7f6e\u4fdd\u6301\u539f\u6837\u3002\u7fa4\u804a\u4e13\u5c5e\u7684 @ \u89c4\u5219\u53ea\u5f71\u54cd\u7fa4\u804a\u89c4\u5219\u3002"

    .line 119
    .line 120
    const/4 v3, 0x6

    .line 121
    invoke-static {v2, v1, v3}, Lwb/ho;->s0(Ljava/lang/String;Li0/h0;I)V

    .line 122
    .line 123
    .line 124
    goto :goto_5

    .line 125
    :cond_5
    invoke-virtual {v1}, Li0/h0;->V()V

    .line 126
    .line 127
    .line 128
    :goto_5
    sget-object v1, Lsf/n;->a:Lsf/n;

    .line 129
    .line 130
    return-object v1

    .line 131
    :pswitch_2
    move-object/from16 v1, p1

    .line 132
    .line 133
    check-cast v1, Li0/h0;

    .line 134
    .line 135
    move-object/from16 v2, p2

    .line 136
    .line 137
    check-cast v2, Ljava/lang/Integer;

    .line 138
    .line 139
    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    .line 140
    .line 141
    .line 142
    move-result v2

    .line 143
    and-int/lit8 v3, v2, 0x3

    .line 144
    .line 145
    const/4 v4, 0x2

    .line 146
    const/4 v5, 0x1

    .line 147
    if-eq v3, v4, :cond_6

    .line 148
    .line 149
    move v3, v5

    .line 150
    goto :goto_6

    .line 151
    :cond_6
    const/4 v3, 0x0

    .line 152
    :goto_6
    and-int/2addr v2, v5

    .line 153
    invoke-virtual {v1, v2, v3}, Li0/h0;->S(IZ)Z

    .line 154
    .line 155
    .line 156
    move-result v2

    .line 157
    if-eqz v2, :cond_7

    .line 158
    .line 159
    const-string v2, "\u6ca1\u6709\u5339\u914d\u7ed3\u679c"

    .line 160
    .line 161
    const/4 v3, 0x6

    .line 162
    invoke-static {v2, v1, v3}, Lwb/ho;->s0(Ljava/lang/String;Li0/h0;I)V

    .line 163
    .line 164
    .line 165
    goto :goto_7

    .line 166
    :cond_7
    invoke-virtual {v1}, Li0/h0;->V()V

    .line 167
    .line 168
    .line 169
    :goto_7
    sget-object v1, Lsf/n;->a:Lsf/n;

    .line 170
    .line 171
    return-object v1

    .line 172
    :pswitch_3
    move-object/from16 v1, p1

    .line 173
    .line 174
    check-cast v1, Li0/h0;

    .line 175
    .line 176
    move-object/from16 v2, p2

    .line 177
    .line 178
    check-cast v2, Ljava/lang/Integer;

    .line 179
    .line 180
    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    .line 181
    .line 182
    .line 183
    move-result v2

    .line 184
    and-int/lit8 v3, v2, 0x3

    .line 185
    .line 186
    const/4 v4, 0x2

    .line 187
    const/4 v5, 0x1

    .line 188
    if-eq v3, v4, :cond_8

    .line 189
    .line 190
    move v3, v5

    .line 191
    goto :goto_8

    .line 192
    :cond_8
    const/4 v3, 0x0

    .line 193
    :goto_8
    and-int/2addr v2, v5

    .line 194
    invoke-virtual {v1, v2, v3}, Li0/h0;->S(IZ)Z

    .line 195
    .line 196
    .line 197
    move-result v2

    .line 198
    if-eqz v2, :cond_9

    .line 199
    .line 200
    const-string v2, "\u6682\u65e0\u56de\u590d\u6b65\u9aa4\u3002\u6dfb\u52a0\u540e\u4f1a\u6309\u5217\u8868\u987a\u5e8f\u4f9d\u6b21\u53d1\u9001\u3002"

    .line 201
    .line 202
    const/4 v3, 0x6

    .line 203
    invoke-static {v2, v1, v3}, Lwb/ho;->s0(Ljava/lang/String;Li0/h0;I)V

    .line 204
    .line 205
    .line 206
    goto :goto_9

    .line 207
    :cond_9
    invoke-virtual {v1}, Li0/h0;->V()V

    .line 208
    .line 209
    .line 210
    :goto_9
    sget-object v1, Lsf/n;->a:Lsf/n;

    .line 211
    .line 212
    return-object v1

    .line 213
    :pswitch_4
    move-object/from16 v1, p1

    .line 214
    .line 215
    check-cast v1, Li0/h0;

    .line 216
    .line 217
    move-object/from16 v2, p2

    .line 218
    .line 219
    check-cast v2, Ljava/lang/Integer;

    .line 220
    .line 221
    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    .line 222
    .line 223
    .line 224
    move-result v2

    .line 225
    and-int/lit8 v3, v2, 0x3

    .line 226
    .line 227
    const/4 v4, 0x2

    .line 228
    const/4 v5, 0x1

    .line 229
    if-eq v3, v4, :cond_a

    .line 230
    .line 231
    move v3, v5

    .line 232
    goto :goto_a

    .line 233
    :cond_a
    const/4 v3, 0x0

    .line 234
    :goto_a
    and-int/2addr v2, v5

    .line 235
    invoke-virtual {v1, v2, v3}, Li0/h0;->S(IZ)Z

    .line 236
    .line 237
    .line 238
    move-result v2

    .line 239
    if-eqz v2, :cond_b

    .line 240
    .line 241
    goto :goto_b

    .line 242
    :cond_b
    invoke-virtual {v1}, Li0/h0;->V()V

    .line 243
    .line 244
    .line 245
    :goto_b
    sget-object v1, Lsf/n;->a:Lsf/n;

    .line 246
    .line 247
    return-object v1

    .line 248
    :pswitch_5
    move-object/from16 v1, p1

    .line 249
    .line 250
    check-cast v1, Li0/h0;

    .line 251
    .line 252
    move-object/from16 v2, p2

    .line 253
    .line 254
    check-cast v2, Ljava/lang/Integer;

    .line 255
    .line 256
    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    .line 257
    .line 258
    .line 259
    move-result v2

    .line 260
    and-int/lit8 v3, v2, 0x3

    .line 261
    .line 262
    const/4 v4, 0x2

    .line 263
    const/4 v5, 0x1

    .line 264
    if-eq v3, v4, :cond_c

    .line 265
    .line 266
    move v3, v5

    .line 267
    goto :goto_c

    .line 268
    :cond_c
    const/4 v3, 0x0

    .line 269
    :goto_c
    and-int/2addr v2, v5

    .line 270
    invoke-virtual {v1, v2, v3}, Li0/h0;->S(IZ)Z

    .line 271
    .line 272
    .line 273
    move-result v2

    .line 274
    if-eqz v2, :cond_d

    .line 275
    .line 276
    const-string v2, "\u8fd9\u4e2a\u6a21\u5757\u6682\u65f6\u6ca1\u6709\u53ef\u914d\u7f6e\u9879"

    .line 277
    .line 278
    const/4 v3, 0x6

    .line 279
    invoke-static {v2, v1, v3}, Lwb/ho;->s0(Ljava/lang/String;Li0/h0;I)V

    .line 280
    .line 281
    .line 282
    goto :goto_d

    .line 283
    :cond_d
    invoke-virtual {v1}, Li0/h0;->V()V

    .line 284
    .line 285
    .line 286
    :goto_d
    sget-object v1, Lsf/n;->a:Lsf/n;

    .line 287
    .line 288
    return-object v1

    .line 289
    :pswitch_6
    move-object/from16 v1, p1

    .line 290
    .line 291
    check-cast v1, Li0/h0;

    .line 292
    .line 293
    move-object/from16 v2, p2

    .line 294
    .line 295
    check-cast v2, Ljava/lang/Integer;

    .line 296
    .line 297
    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    .line 298
    .line 299
    .line 300
    move-result v2

    .line 301
    and-int/lit8 v3, v2, 0x3

    .line 302
    .line 303
    const/4 v4, 0x2

    .line 304
    const/4 v5, 0x1

    .line 305
    if-eq v3, v4, :cond_e

    .line 306
    .line 307
    move v3, v5

    .line 308
    goto :goto_e

    .line 309
    :cond_e
    const/4 v3, 0x0

    .line 310
    :goto_e
    and-int/2addr v2, v5

    .line 311
    invoke-virtual {v1, v2, v3}, Li0/h0;->S(IZ)Z

    .line 312
    .line 313
    .line 314
    move-result v2

    .line 315
    if-eqz v2, :cond_f

    .line 316
    .line 317
    const-string v2, "\u6ca1\u6709\u5339\u914d\u7ed3\u679c"

    .line 318
    .line 319
    const/4 v3, 0x6

    .line 320
    invoke-static {v2, v1, v3}, Lwb/ho;->s0(Ljava/lang/String;Li0/h0;I)V

    .line 321
    .line 322
    .line 323
    goto :goto_f

    .line 324
    :cond_f
    invoke-virtual {v1}, Li0/h0;->V()V

    .line 325
    .line 326
    .line 327
    :goto_f
    sget-object v1, Lsf/n;->a:Lsf/n;

    .line 328
    .line 329
    return-object v1

    .line 330
    :pswitch_7
    move-object/from16 v1, p1

    .line 331
    .line 332
    check-cast v1, Li0/h0;

    .line 333
    .line 334
    move-object/from16 v2, p2

    .line 335
    .line 336
    check-cast v2, Ljava/lang/Integer;

    .line 337
    .line 338
    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    .line 339
    .line 340
    .line 341
    move-result v2

    .line 342
    and-int/lit8 v3, v2, 0x3

    .line 343
    .line 344
    const/4 v4, 0x2

    .line 345
    const/4 v5, 0x1

    .line 346
    if-eq v3, v4, :cond_10

    .line 347
    .line 348
    move v3, v5

    .line 349
    goto :goto_10

    .line 350
    :cond_10
    const/4 v3, 0x0

    .line 351
    :goto_10
    and-int/2addr v2, v5

    .line 352
    invoke-virtual {v1, v2, v3}, Li0/h0;->S(IZ)Z

    .line 353
    .line 354
    .line 355
    move-result v2

    .line 356
    if-eqz v2, :cond_11

    .line 357
    .line 358
    const-string v2, "\u6682\u65e0\u4f1a\u8bdd\u89c4\u5219\uff0c\u70b9\u51fb\u5e95\u90e8\u201c\u6dfb\u52a0\u4f1a\u8bdd\u201d\u3002"

    .line 359
    .line 360
    const/4 v3, 0x6

    .line 361
    invoke-static {v2, v1, v3}, Lwb/ho;->s0(Ljava/lang/String;Li0/h0;I)V

    .line 362
    .line 363
    .line 364
    goto :goto_11

    .line 365
    :cond_11
    invoke-virtual {v1}, Li0/h0;->V()V

    .line 366
    .line 367
    .line 368
    :goto_11
    sget-object v1, Lsf/n;->a:Lsf/n;

    .line 369
    .line 370
    return-object v1

    .line 371
    :pswitch_8
    move-object/from16 v1, p1

    .line 372
    .line 373
    check-cast v1, Li0/h0;

    .line 374
    .line 375
    move-object/from16 v2, p2

    .line 376
    .line 377
    check-cast v2, Ljava/lang/Integer;

    .line 378
    .line 379
    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    .line 380
    .line 381
    .line 382
    move-result v2

    .line 383
    and-int/lit8 v3, v2, 0x3

    .line 384
    .line 385
    const/4 v4, 0x2

    .line 386
    const/4 v5, 0x1

    .line 387
    if-eq v3, v4, :cond_12

    .line 388
    .line 389
    move v3, v5

    .line 390
    goto :goto_12

    .line 391
    :cond_12
    const/4 v3, 0x0

    .line 392
    :goto_12
    and-int/2addr v2, v5

    .line 393
    invoke-virtual {v1, v2, v3}, Li0/h0;->S(IZ)Z

    .line 394
    .line 395
    .line 396
    move-result v2

    .line 397
    if-eqz v2, :cond_13

    .line 398
    .line 399
    const-string v2, "\u6b63\u5728\u8f7d\u5165\u7fa4\u6210\u5458..."

    .line 400
    .line 401
    const/4 v3, 0x6

    .line 402
    invoke-static {v2, v1, v3}, Lwb/ho;->s0(Ljava/lang/String;Li0/h0;I)V

    .line 403
    .line 404
    .line 405
    goto :goto_13

    .line 406
    :cond_13
    invoke-virtual {v1}, Li0/h0;->V()V

    .line 407
    .line 408
    .line 409
    :goto_13
    sget-object v1, Lsf/n;->a:Lsf/n;

    .line 410
    .line 411
    return-object v1

    .line 412
    :pswitch_9
    move-object/from16 v1, p1

    .line 413
    .line 414
    check-cast v1, Li0/h0;

    .line 415
    .line 416
    move-object/from16 v2, p2

    .line 417
    .line 418
    check-cast v2, Ljava/lang/Integer;

    .line 419
    .line 420
    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    .line 421
    .line 422
    .line 423
    move-result v2

    .line 424
    and-int/lit8 v3, v2, 0x3

    .line 425
    .line 426
    const/4 v4, 0x2

    .line 427
    const/4 v5, 0x1

    .line 428
    if-eq v3, v4, :cond_14

    .line 429
    .line 430
    move v3, v5

    .line 431
    goto :goto_14

    .line 432
    :cond_14
    const/4 v3, 0x0

    .line 433
    :goto_14
    and-int/2addr v2, v5

    .line 434
    invoke-virtual {v1, v2, v3}, Li0/h0;->S(IZ)Z

    .line 435
    .line 436
    .line 437
    move-result v2

    .line 438
    if-eqz v2, :cond_15

    .line 439
    .line 440
    const-string v2, "\u6b63\u5728\u8f7d\u5165\u7fa4\u804a..."

    .line 441
    .line 442
    const/4 v3, 0x6

    .line 443
    invoke-static {v2, v1, v3}, Lwb/ho;->s0(Ljava/lang/String;Li0/h0;I)V

    .line 444
    .line 445
    .line 446
    goto :goto_15

    .line 447
    :cond_15
    invoke-virtual {v1}, Li0/h0;->V()V

    .line 448
    .line 449
    .line 450
    :goto_15
    sget-object v1, Lsf/n;->a:Lsf/n;

    .line 451
    .line 452
    return-object v1

    .line 453
    :pswitch_a
    move-object/from16 v1, p1

    .line 454
    .line 455
    check-cast v1, Li0/h0;

    .line 456
    .line 457
    move-object/from16 v2, p2

    .line 458
    .line 459
    check-cast v2, Ljava/lang/Integer;

    .line 460
    .line 461
    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    .line 462
    .line 463
    .line 464
    move-result v2

    .line 465
    and-int/lit8 v3, v2, 0x3

    .line 466
    .line 467
    const/4 v4, 0x2

    .line 468
    const/4 v5, 0x1

    .line 469
    if-eq v3, v4, :cond_16

    .line 470
    .line 471
    move v3, v5

    .line 472
    goto :goto_16

    .line 473
    :cond_16
    const/4 v3, 0x0

    .line 474
    :goto_16
    and-int/2addr v2, v5

    .line 475
    invoke-virtual {v1, v2, v3}, Li0/h0;->S(IZ)Z

    .line 476
    .line 477
    .line 478
    move-result v2

    .line 479
    if-eqz v2, :cond_17

    .line 480
    .line 481
    const-string v2, "\u6b63\u5728\u540e\u53f0\u52a0\u8f7d\u66f4\u591a\u6536\u85cf..."

    .line 482
    .line 483
    const/4 v3, 0x6

    .line 484
    invoke-static {v2, v1, v3}, Lwb/ho;->s0(Ljava/lang/String;Li0/h0;I)V

    .line 485
    .line 486
    .line 487
    goto :goto_17

    .line 488
    :cond_17
    invoke-virtual {v1}, Li0/h0;->V()V

    .line 489
    .line 490
    .line 491
    :goto_17
    sget-object v1, Lsf/n;->a:Lsf/n;

    .line 492
    .line 493
    return-object v1

    .line 494
    :pswitch_b
    move-object/from16 v1, p1

    .line 495
    .line 496
    check-cast v1, Li0/h0;

    .line 497
    .line 498
    move-object/from16 v2, p2

    .line 499
    .line 500
    check-cast v2, Ljava/lang/Integer;

    .line 501
    .line 502
    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    .line 503
    .line 504
    .line 505
    move-result v2

    .line 506
    and-int/lit8 v3, v2, 0x3

    .line 507
    .line 508
    const/4 v4, 0x2

    .line 509
    const/4 v5, 0x1

    .line 510
    if-eq v3, v4, :cond_18

    .line 511
    .line 512
    move v3, v5

    .line 513
    goto :goto_18

    .line 514
    :cond_18
    const/4 v3, 0x0

    .line 515
    :goto_18
    and-int/2addr v2, v5

    .line 516
    invoke-virtual {v1, v2, v3}, Li0/h0;->S(IZ)Z

    .line 517
    .line 518
    .line 519
    move-result v2

    .line 520
    if-eqz v2, :cond_19

    .line 521
    .line 522
    const-string v2, "\u6b63\u5728\u540e\u53f0\u67e5\u627e\u6536\u85cf..."

    .line 523
    .line 524
    const/4 v3, 0x6

    .line 525
    invoke-static {v2, v1, v3}, Lwb/ho;->s0(Ljava/lang/String;Li0/h0;I)V

    .line 526
    .line 527
    .line 528
    goto :goto_19

    .line 529
    :cond_19
    invoke-virtual {v1}, Li0/h0;->V()V

    .line 530
    .line 531
    .line 532
    :goto_19
    sget-object v1, Lsf/n;->a:Lsf/n;

    .line 533
    .line 534
    return-object v1

    .line 535
    :pswitch_c
    move-object/from16 v1, p1

    .line 536
    .line 537
    check-cast v1, Li0/h0;

    .line 538
    .line 539
    move-object/from16 v2, p2

    .line 540
    .line 541
    check-cast v2, Ljava/lang/Integer;

    .line 542
    .line 543
    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    .line 544
    .line 545
    .line 546
    move-result v2

    .line 547
    and-int/lit8 v3, v2, 0x3

    .line 548
    .line 549
    const/4 v4, 0x2

    .line 550
    const/4 v5, 0x1

    .line 551
    if-eq v3, v4, :cond_1a

    .line 552
    .line 553
    move v3, v5

    .line 554
    goto :goto_1a

    .line 555
    :cond_1a
    const/4 v3, 0x0

    .line 556
    :goto_1a
    and-int/2addr v2, v5

    .line 557
    invoke-virtual {v1, v2, v3}, Li0/h0;->S(IZ)Z

    .line 558
    .line 559
    .line 560
    move-result v2

    .line 561
    if-eqz v2, :cond_1b

    .line 562
    .line 563
    const-string v2, "\u6b63\u5728\u8f7d\u5165\u6536\u85cf..."

    .line 564
    .line 565
    const/4 v3, 0x6

    .line 566
    invoke-static {v2, v1, v3}, Lwb/ho;->s0(Ljava/lang/String;Li0/h0;I)V

    .line 567
    .line 568
    .line 569
    goto :goto_1b

    .line 570
    :cond_1b
    invoke-virtual {v1}, Li0/h0;->V()V

    .line 571
    .line 572
    .line 573
    :goto_1b
    sget-object v1, Lsf/n;->a:Lsf/n;

    .line 574
    .line 575
    return-object v1

    .line 576
    :pswitch_d
    move-object/from16 v1, p1

    .line 577
    .line 578
    check-cast v1, Li0/h0;

    .line 579
    .line 580
    move-object/from16 v2, p2

    .line 581
    .line 582
    check-cast v2, Ljava/lang/Integer;

    .line 583
    .line 584
    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    .line 585
    .line 586
    .line 587
    move-result v2

    .line 588
    and-int/lit8 v3, v2, 0x3

    .line 589
    .line 590
    const/4 v4, 0x2

    .line 591
    const/4 v5, 0x1

    .line 592
    if-eq v3, v4, :cond_1c

    .line 593
    .line 594
    move v3, v5

    .line 595
    goto :goto_1c

    .line 596
    :cond_1c
    const/4 v3, 0x0

    .line 597
    :goto_1c
    and-int/2addr v2, v5

    .line 598
    invoke-virtual {v1, v2, v3}, Li0/h0;->S(IZ)Z

    .line 599
    .line 600
    .line 601
    move-result v2

    .line 602
    if-eqz v2, :cond_1d

    .line 603
    .line 604
    const-string v2, "\u6ca1\u6709\u5339\u914d\u7ed3\u679c"

    .line 605
    .line 606
    const/4 v3, 0x6

    .line 607
    invoke-static {v2, v1, v3}, Lwb/ho;->s0(Ljava/lang/String;Li0/h0;I)V

    .line 608
    .line 609
    .line 610
    goto :goto_1d

    .line 611
    :cond_1d
    invoke-virtual {v1}, Li0/h0;->V()V

    .line 612
    .line 613
    .line 614
    :goto_1d
    sget-object v1, Lsf/n;->a:Lsf/n;

    .line 615
    .line 616
    return-object v1

    .line 617
    :pswitch_e
    move-object/from16 v1, p1

    .line 618
    .line 619
    check-cast v1, Li0/h0;

    .line 620
    .line 621
    move-object/from16 v2, p2

    .line 622
    .line 623
    check-cast v2, Ljava/lang/Integer;

    .line 624
    .line 625
    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    .line 626
    .line 627
    .line 628
    move-result v2

    .line 629
    and-int/lit8 v3, v2, 0x3

    .line 630
    .line 631
    const/4 v4, 0x2

    .line 632
    const/4 v5, 0x1

    .line 633
    if-eq v3, v4, :cond_1e

    .line 634
    .line 635
    move v3, v5

    .line 636
    goto :goto_1e

    .line 637
    :cond_1e
    const/4 v3, 0x0

    .line 638
    :goto_1e
    and-int/2addr v2, v5

    .line 639
    invoke-virtual {v1, v2, v3}, Li0/h0;->S(IZ)Z

    .line 640
    .line 641
    .line 642
    move-result v2

    .line 643
    if-eqz v2, :cond_1f

    .line 644
    .line 645
    const-string v2, "\u6b63\u5728\u8f7d\u5165\u5217\u8868..."

    .line 646
    .line 647
    const/4 v3, 0x6

    .line 648
    invoke-static {v2, v1, v3}, Lwb/ho;->s0(Ljava/lang/String;Li0/h0;I)V

    .line 649
    .line 650
    .line 651
    goto :goto_1f

    .line 652
    :cond_1f
    invoke-virtual {v1}, Li0/h0;->V()V

    .line 653
    .line 654
    .line 655
    :goto_1f
    sget-object v1, Lsf/n;->a:Lsf/n;

    .line 656
    .line 657
    return-object v1

    .line 658
    :pswitch_f
    move-object/from16 v1, p1

    .line 659
    .line 660
    check-cast v1, Li0/h0;

    .line 661
    .line 662
    move-object/from16 v2, p2

    .line 663
    .line 664
    check-cast v2, Ljava/lang/Integer;

    .line 665
    .line 666
    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    .line 667
    .line 668
    .line 669
    move-result v2

    .line 670
    and-int/lit8 v3, v2, 0x3

    .line 671
    .line 672
    const/4 v4, 0x2

    .line 673
    const/4 v5, 0x1

    .line 674
    if-eq v3, v4, :cond_20

    .line 675
    .line 676
    move v3, v5

    .line 677
    goto :goto_20

    .line 678
    :cond_20
    const/4 v3, 0x0

    .line 679
    :goto_20
    and-int/2addr v2, v5

    .line 680
    invoke-virtual {v1, v2, v3}, Li0/h0;->S(IZ)Z

    .line 681
    .line 682
    .line 683
    move-result v2

    .line 684
    if-eqz v2, :cond_21

    .line 685
    .line 686
    const-string v2, "\u6ca1\u6709\u5339\u914d\u7ed3\u679c"

    .line 687
    .line 688
    const/4 v3, 0x6

    .line 689
    invoke-static {v2, v1, v3}, Lwb/ho;->s0(Ljava/lang/String;Li0/h0;I)V

    .line 690
    .line 691
    .line 692
    goto :goto_21

    .line 693
    :cond_21
    invoke-virtual {v1}, Li0/h0;->V()V

    .line 694
    .line 695
    .line 696
    :goto_21
    sget-object v1, Lsf/n;->a:Lsf/n;

    .line 697
    .line 698
    return-object v1

    .line 699
    :pswitch_10
    move-object/from16 v1, p1

    .line 700
    .line 701
    check-cast v1, Li0/h0;

    .line 702
    .line 703
    move-object/from16 v2, p2

    .line 704
    .line 705
    check-cast v2, Ljava/lang/Integer;

    .line 706
    .line 707
    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    .line 708
    .line 709
    .line 710
    move-result v2

    .line 711
    and-int/lit8 v3, v2, 0x3

    .line 712
    .line 713
    const/4 v4, 0x2

    .line 714
    const/4 v5, 0x1

    .line 715
    if-eq v3, v4, :cond_22

    .line 716
    .line 717
    move v3, v5

    .line 718
    goto :goto_22

    .line 719
    :cond_22
    const/4 v3, 0x0

    .line 720
    :goto_22
    and-int/2addr v2, v5

    .line 721
    invoke-virtual {v1, v2, v3}, Li0/h0;->S(IZ)Z

    .line 722
    .line 723
    .line 724
    move-result v2

    .line 725
    if-eqz v2, :cond_23

    .line 726
    .line 727
    const-string v2, "\u6ca1\u6709\u5339\u914d\u6807\u7b7e"

    .line 728
    .line 729
    const/4 v3, 0x6

    .line 730
    invoke-static {v2, v1, v3}, Lwb/ho;->s0(Ljava/lang/String;Li0/h0;I)V

    .line 731
    .line 732
    .line 733
    goto :goto_23

    .line 734
    :cond_23
    invoke-virtual {v1}, Li0/h0;->V()V

    .line 735
    .line 736
    .line 737
    :goto_23
    sget-object v1, Lsf/n;->a:Lsf/n;

    .line 738
    .line 739
    return-object v1

    .line 740
    :pswitch_11
    move-object/from16 v1, p1

    .line 741
    .line 742
    check-cast v1, Li0/h0;

    .line 743
    .line 744
    move-object/from16 v2, p2

    .line 745
    .line 746
    check-cast v2, Ljava/lang/Integer;

    .line 747
    .line 748
    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    .line 749
    .line 750
    .line 751
    move-result v2

    .line 752
    and-int/lit8 v3, v2, 0x3

    .line 753
    .line 754
    const/4 v4, 0x2

    .line 755
    const/4 v5, 0x1

    .line 756
    if-eq v3, v4, :cond_24

    .line 757
    .line 758
    move v3, v5

    .line 759
    goto :goto_24

    .line 760
    :cond_24
    const/4 v3, 0x0

    .line 761
    :goto_24
    and-int/2addr v2, v5

    .line 762
    invoke-virtual {v1, v2, v3}, Li0/h0;->S(IZ)Z

    .line 763
    .line 764
    .line 765
    move-result v2

    .line 766
    if-eqz v2, :cond_25

    .line 767
    .line 768
    const-string v2, "\u6b63\u5728\u8f7d\u5165\u5217\u8868..."

    .line 769
    .line 770
    const/4 v3, 0x6

    .line 771
    invoke-static {v2, v1, v3}, Lwb/ho;->s0(Ljava/lang/String;Li0/h0;I)V

    .line 772
    .line 773
    .line 774
    goto :goto_25

    .line 775
    :cond_25
    invoke-virtual {v1}, Li0/h0;->V()V

    .line 776
    .line 777
    .line 778
    :goto_25
    sget-object v1, Lsf/n;->a:Lsf/n;

    .line 779
    .line 780
    return-object v1

    .line 781
    :pswitch_12
    move-object/from16 v1, p1

    .line 782
    .line 783
    check-cast v1, Li0/h0;

    .line 784
    .line 785
    move-object/from16 v2, p2

    .line 786
    .line 787
    check-cast v2, Ljava/lang/Integer;

    .line 788
    .line 789
    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    .line 790
    .line 791
    .line 792
    move-result v2

    .line 793
    and-int/lit8 v3, v2, 0x3

    .line 794
    .line 795
    const/4 v4, 0x2

    .line 796
    const/4 v5, 0x1

    .line 797
    if-eq v3, v4, :cond_26

    .line 798
    .line 799
    move v3, v5

    .line 800
    goto :goto_26

    .line 801
    :cond_26
    const/4 v3, 0x0

    .line 802
    :goto_26
    and-int/2addr v2, v5

    .line 803
    invoke-virtual {v1, v2, v3}, Li0/h0;->S(IZ)Z

    .line 804
    .line 805
    .line 806
    move-result v2

    .line 807
    if-eqz v2, :cond_27

    .line 808
    .line 809
    const-string v2, "\u6682\u65e0\u6a21\u578b\u5217\u8868\uff0c\u5148\u70b9\u51fb\u201c\u62c9\u53d6\u6a21\u578b\u5217\u8868\u201d\u3002"

    .line 810
    .line 811
    const/4 v3, 0x6

    .line 812
    invoke-static {v2, v1, v3}, Lwb/ho;->s0(Ljava/lang/String;Li0/h0;I)V

    .line 813
    .line 814
    .line 815
    goto :goto_27

    .line 816
    :cond_27
    invoke-virtual {v1}, Li0/h0;->V()V

    .line 817
    .line 818
    .line 819
    :goto_27
    sget-object v1, Lsf/n;->a:Lsf/n;

    .line 820
    .line 821
    return-object v1

    .line 822
    :pswitch_13
    move-object/from16 v1, p1

    .line 823
    .line 824
    check-cast v1, Li0/h0;

    .line 825
    .line 826
    move-object/from16 v2, p2

    .line 827
    .line 828
    check-cast v2, Ljava/lang/Integer;

    .line 829
    .line 830
    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    .line 831
    .line 832
    .line 833
    move-result v2

    .line 834
    and-int/lit8 v3, v2, 0x3

    .line 835
    .line 836
    const/4 v4, 0x2

    .line 837
    const/4 v5, 0x1

    .line 838
    if-eq v3, v4, :cond_28

    .line 839
    .line 840
    move v3, v5

    .line 841
    goto :goto_28

    .line 842
    :cond_28
    const/4 v3, 0x0

    .line 843
    :goto_28
    and-int/2addr v2, v5

    .line 844
    invoke-virtual {v1, v2, v3}, Li0/h0;->S(IZ)Z

    .line 845
    .line 846
    .line 847
    move-result v2

    .line 848
    if-eqz v2, :cond_29

    .line 849
    .line 850
    const-string v2, "\u6b63\u5728\u52a0\u8f7d\u5728\u7ebf\u63d2\u4ef6..."

    .line 851
    .line 852
    const/4 v3, 0x6

    .line 853
    invoke-static {v2, v1, v3}, Lwb/ho;->s0(Ljava/lang/String;Li0/h0;I)V

    .line 854
    .line 855
    .line 856
    goto :goto_29

    .line 857
    :cond_29
    invoke-virtual {v1}, Li0/h0;->V()V

    .line 858
    .line 859
    .line 860
    :goto_29
    sget-object v1, Lsf/n;->a:Lsf/n;

    .line 861
    .line 862
    return-object v1

    .line 863
    :pswitch_14
    move-object/from16 v1, p1

    .line 864
    .line 865
    check-cast v1, Li0/h0;

    .line 866
    .line 867
    move-object/from16 v2, p2

    .line 868
    .line 869
    check-cast v2, Ljava/lang/Integer;

    .line 870
    .line 871
    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    .line 872
    .line 873
    .line 874
    move-result v2

    .line 875
    and-int/lit8 v3, v2, 0x3

    .line 876
    .line 877
    const/4 v4, 0x2

    .line 878
    const/4 v5, 0x1

    .line 879
    if-eq v3, v4, :cond_2a

    .line 880
    .line 881
    move v3, v5

    .line 882
    goto :goto_2a

    .line 883
    :cond_2a
    const/4 v3, 0x0

    .line 884
    :goto_2a
    and-int/2addr v2, v5

    .line 885
    invoke-virtual {v1, v2, v3}, Li0/h0;->S(IZ)Z

    .line 886
    .line 887
    .line 888
    move-result v2

    .line 889
    if-eqz v2, :cond_2b

    .line 890
    .line 891
    sget-object v2, Lbi/d;->a:Li0/m2;

    .line 892
    .line 893
    invoke-virtual {v1, v2}, Li0/h0;->j(Li0/p1;)Ljava/lang/Object;

    .line 894
    .line 895
    .line 896
    move-result-object v2

    .line 897
    check-cast v2, Lbi/b;

    .line 898
    .line 899
    invoke-virtual {v2}, Lbi/b;->h()J

    .line 900
    .line 901
    .line 902
    move-result-wide v4

    .line 903
    const/16 v2, 0xd

    .line 904
    .line 905
    invoke-static {v2}, Lx6/d;->D(I)J

    .line 906
    .line 907
    .line 908
    move-result-wide v6

    .line 909
    sget-object v2, Ly0/l;->a:Ly0/l;

    .line 910
    .line 911
    const/high16 v3, 0x3f800000    # 1.0f

    .line 912
    .line 913
    invoke-static {v2, v3}, Lp/h1;->d(Ly0/o;F)Ly0/o;

    .line 914
    .line 915
    .line 916
    move-result-object v2

    .line 917
    const/16 v3, 0x10

    .line 918
    .line 919
    int-to-float v3, v3

    .line 920
    const/16 v8, 0xe

    .line 921
    .line 922
    int-to-float v8, v8

    .line 923
    invoke-static {v2, v3, v8}, Lp/d;->m(Ly0/o;FF)Ly0/o;

    .line 924
    .line 925
    .line 926
    move-result-object v3

    .line 927
    const/16 v23, 0x0

    .line 928
    .line 929
    const v24, 0x3ffe8

    .line 930
    .line 931
    .line 932
    const-string v2, "\u793e\u533a\u63d2\u4ef6\u7531\u7528\u6237\u4e0a\u4f20\uff0c\u5b89\u88c5\u524d\u8bf7\u6838\u5bf9\u4f5c\u8005\u3001\u8bf4\u660e\u548c\u6587\u4ef6\u5185\u5bb9\u3002\u4e0b\u8f7d\u540e\u7684\u63d2\u4ef6\u9ed8\u8ba4\u7981\u7528\u3002"

    .line 933
    .line 934
    const/4 v8, 0x0

    .line 935
    const/4 v9, 0x0

    .line 936
    const-wide/16 v10, 0x0

    .line 937
    .line 938
    const/4 v12, 0x0

    .line 939
    const-wide/16 v13, 0x0

    .line 940
    .line 941
    const/4 v15, 0x0

    .line 942
    const/16 v16, 0x0

    .line 943
    .line 944
    const/16 v17, 0x0

    .line 945
    .line 946
    const/16 v18, 0x0

    .line 947
    .line 948
    const/16 v19, 0x0

    .line 949
    .line 950
    const/16 v20, 0x0

    .line 951
    .line 952
    const/16 v22, 0x6036

    .line 953
    .line 954
    move-object/from16 v21, v1

    .line 955
    .line 956
    invoke-static/range {v2 .. v24}, Lsh/s;->n(Ljava/lang/String;Ly0/o;JJLm2/k;Lm2/p;JLt2/k;JIZIILfg/l;Li2/n0;Li0/h0;III)V

    .line 957
    .line 958
    .line 959
    goto :goto_2b

    .line 960
    :cond_2b
    move-object/from16 v21, v1

    .line 961
    .line 962
    invoke-virtual/range {v21 .. v21}, Li0/h0;->V()V

    .line 963
    .line 964
    .line 965
    :goto_2b
    sget-object v1, Lsf/n;->a:Lsf/n;

    .line 966
    .line 967
    return-object v1

    .line 968
    :pswitch_15
    move-object/from16 v1, p1

    .line 969
    .line 970
    check-cast v1, Li0/h0;

    .line 971
    .line 972
    move-object/from16 v2, p2

    .line 973
    .line 974
    check-cast v2, Ljava/lang/Integer;

    .line 975
    .line 976
    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    .line 977
    .line 978
    .line 979
    move-result v2

    .line 980
    and-int/lit8 v3, v2, 0x3

    .line 981
    .line 982
    const/4 v4, 0x2

    .line 983
    const/4 v5, 0x1

    .line 984
    if-eq v3, v4, :cond_2c

    .line 985
    .line 986
    move v3, v5

    .line 987
    goto :goto_2c

    .line 988
    :cond_2c
    const/4 v3, 0x0

    .line 989
    :goto_2c
    and-int/2addr v2, v5

    .line 990
    invoke-virtual {v1, v2, v3}, Li0/h0;->S(IZ)Z

    .line 991
    .line 992
    .line 993
    move-result v2

    .line 994
    if-eqz v2, :cond_2d

    .line 995
    .line 996
    const-string v2, "\u8fd8\u6ca1\u6709\u5b9a\u65f6\u4efb\u52a1\uff0c\u70b9\u51fb\u5e95\u90e8\u201c\u65b0\u589e\u4efb\u52a1\u201d\u3002"

    .line 997
    .line 998
    const/4 v3, 0x6

    .line 999
    invoke-static {v2, v1, v3}, Lwb/ho;->s0(Ljava/lang/String;Li0/h0;I)V

    .line 1000
    .line 1001
    .line 1002
    goto :goto_2d

    .line 1003
    :cond_2d
    invoke-virtual {v1}, Li0/h0;->V()V

    .line 1004
    .line 1005
    .line 1006
    :goto_2d
    sget-object v1, Lsf/n;->a:Lsf/n;

    .line 1007
    .line 1008
    return-object v1

    .line 1009
    :pswitch_16
    move-object/from16 v1, p1

    .line 1010
    .line 1011
    check-cast v1, Li0/h0;

    .line 1012
    .line 1013
    move-object/from16 v2, p2

    .line 1014
    .line 1015
    check-cast v2, Ljava/lang/Integer;

    .line 1016
    .line 1017
    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    .line 1018
    .line 1019
    .line 1020
    move-result v2

    .line 1021
    and-int/lit8 v3, v2, 0x3

    .line 1022
    .line 1023
    const/4 v4, 0x2

    .line 1024
    const/4 v5, 0x1

    .line 1025
    if-eq v3, v4, :cond_2e

    .line 1026
    .line 1027
    move v3, v5

    .line 1028
    goto :goto_2e

    .line 1029
    :cond_2e
    const/4 v3, 0x0

    .line 1030
    :goto_2e
    and-int/2addr v2, v5

    .line 1031
    invoke-virtual {v1, v2, v3}, Li0/h0;->S(IZ)Z

    .line 1032
    .line 1033
    .line 1034
    move-result v2

    .line 1035
    if-eqz v2, :cond_2f

    .line 1036
    .line 1037
    const-string v2, "\u6ca1\u6709\u5339\u914d\u7ed3\u679c"

    .line 1038
    .line 1039
    const/4 v3, 0x6

    .line 1040
    invoke-static {v2, v1, v3}, Lwb/ho;->s0(Ljava/lang/String;Li0/h0;I)V

    .line 1041
    .line 1042
    .line 1043
    goto :goto_2f

    .line 1044
    :cond_2f
    invoke-virtual {v1}, Li0/h0;->V()V

    .line 1045
    .line 1046
    .line 1047
    :goto_2f
    sget-object v1, Lsf/n;->a:Lsf/n;

    .line 1048
    .line 1049
    return-object v1

    .line 1050
    :pswitch_17
    move-object/from16 v1, p1

    .line 1051
    .line 1052
    check-cast v1, Li0/h0;

    .line 1053
    .line 1054
    move-object/from16 v2, p2

    .line 1055
    .line 1056
    check-cast v2, Ljava/lang/Integer;

    .line 1057
    .line 1058
    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    .line 1059
    .line 1060
    .line 1061
    move-result v2

    .line 1062
    and-int/lit8 v3, v2, 0x3

    .line 1063
    .line 1064
    const/4 v4, 0x2

    .line 1065
    const/4 v5, 0x1

    .line 1066
    if-eq v3, v4, :cond_30

    .line 1067
    .line 1068
    move v3, v5

    .line 1069
    goto :goto_30

    .line 1070
    :cond_30
    const/4 v3, 0x0

    .line 1071
    :goto_30
    and-int/2addr v2, v5

    .line 1072
    invoke-virtual {v1, v2, v3}, Li0/h0;->S(IZ)Z

    .line 1073
    .line 1074
    .line 1075
    move-result v2

    .line 1076
    if-eqz v2, :cond_31

    .line 1077
    .line 1078
    const-string v2, "\u6b63\u5728\u8f7d\u5165\u76d1\u542c\u7fa4..."

    .line 1079
    .line 1080
    const/4 v3, 0x6

    .line 1081
    invoke-static {v2, v1, v3}, Lwb/ho;->s0(Ljava/lang/String;Li0/h0;I)V

    .line 1082
    .line 1083
    .line 1084
    goto :goto_31

    .line 1085
    :cond_31
    invoke-virtual {v1}, Li0/h0;->V()V

    .line 1086
    .line 1087
    .line 1088
    :goto_31
    sget-object v1, Lsf/n;->a:Lsf/n;

    .line 1089
    .line 1090
    return-object v1

    .line 1091
    :pswitch_18
    move-object/from16 v1, p1

    .line 1092
    .line 1093
    check-cast v1, Li0/h0;

    .line 1094
    .line 1095
    move-object/from16 v2, p2

    .line 1096
    .line 1097
    check-cast v2, Ljava/lang/Integer;

    .line 1098
    .line 1099
    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    .line 1100
    .line 1101
    .line 1102
    move-result v2

    .line 1103
    and-int/lit8 v3, v2, 0x3

    .line 1104
    .line 1105
    const/4 v4, 0x2

    .line 1106
    const/4 v5, 0x1

    .line 1107
    if-eq v3, v4, :cond_32

    .line 1108
    .line 1109
    move v3, v5

    .line 1110
    goto :goto_32

    .line 1111
    :cond_32
    const/4 v3, 0x0

    .line 1112
    :goto_32
    and-int/2addr v2, v5

    .line 1113
    invoke-virtual {v1, v2, v3}, Li0/h0;->S(IZ)Z

    .line 1114
    .line 1115
    .line 1116
    move-result v2

    .line 1117
    if-eqz v2, :cond_33

    .line 1118
    .line 1119
    const-string v2, "\u6ca1\u6709\u5339\u914d\u7684\u4f1a\u8bdd"

    .line 1120
    .line 1121
    const/4 v3, 0x6

    .line 1122
    invoke-static {v2, v1, v3}, Lwb/ho;->s0(Ljava/lang/String;Li0/h0;I)V

    .line 1123
    .line 1124
    .line 1125
    goto :goto_33

    .line 1126
    :cond_33
    invoke-virtual {v1}, Li0/h0;->V()V

    .line 1127
    .line 1128
    .line 1129
    :goto_33
    sget-object v1, Lsf/n;->a:Lsf/n;

    .line 1130
    .line 1131
    return-object v1

    .line 1132
    :pswitch_19
    move-object/from16 v1, p1

    .line 1133
    .line 1134
    check-cast v1, Li0/h0;

    .line 1135
    .line 1136
    move-object/from16 v2, p2

    .line 1137
    .line 1138
    check-cast v2, Ljava/lang/Integer;

    .line 1139
    .line 1140
    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    .line 1141
    .line 1142
    .line 1143
    move-result v2

    .line 1144
    and-int/lit8 v3, v2, 0x3

    .line 1145
    .line 1146
    const/4 v4, 0x2

    .line 1147
    const/4 v5, 0x1

    .line 1148
    if-eq v3, v4, :cond_34

    .line 1149
    .line 1150
    move v3, v5

    .line 1151
    goto :goto_34

    .line 1152
    :cond_34
    const/4 v3, 0x0

    .line 1153
    :goto_34
    and-int/2addr v2, v5

    .line 1154
    invoke-virtual {v1, v2, v3}, Li0/h0;->S(IZ)Z

    .line 1155
    .line 1156
    .line 1157
    move-result v2

    .line 1158
    if-eqz v2, :cond_35

    .line 1159
    .line 1160
    const-string v2, "\u6b63\u5728\u8f7d\u5165\u4f1a\u8bdd..."

    .line 1161
    .line 1162
    const/4 v3, 0x6

    .line 1163
    invoke-static {v2, v1, v3}, Lwb/ho;->s0(Ljava/lang/String;Li0/h0;I)V

    .line 1164
    .line 1165
    .line 1166
    goto :goto_35

    .line 1167
    :cond_35
    invoke-virtual {v1}, Li0/h0;->V()V

    .line 1168
    .line 1169
    .line 1170
    :goto_35
    sget-object v1, Lsf/n;->a:Lsf/n;

    .line 1171
    .line 1172
    return-object v1

    .line 1173
    :pswitch_1a
    move-object/from16 v1, p1

    .line 1174
    .line 1175
    check-cast v1, Lv0/b;

    .line 1176
    .line 1177
    move-object/from16 v1, p2

    .line 1178
    .line 1179
    check-cast v1, Lw/j1;

    .line 1180
    .line 1181
    iget-object v2, v1, Lw/j1;->a:Li0/f1;

    .line 1182
    .line 1183
    invoke-virtual {v2}, Li0/f1;->g()F

    .line 1184
    .line 1185
    .line 1186
    move-result v2

    .line 1187
    invoke-static {v2}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 1188
    .line 1189
    .line 1190
    move-result-object v2

    .line 1191
    iget-object v1, v1, Lw/j1;->f:Li0/j1;

    .line 1192
    .line 1193
    invoke-virtual {v1}, Li0/j1;->getValue()Ljava/lang/Object;

    .line 1194
    .line 1195
    .line 1196
    move-result-object v1

    .line 1197
    check-cast v1, Lm/p1;

    .line 1198
    .line 1199
    sget-object v3, Lm/p1;->g:Lm/p1;

    .line 1200
    .line 1201
    if-ne v1, v3, :cond_36

    .line 1202
    .line 1203
    const/4 v1, 0x1

    .line 1204
    goto :goto_36

    .line 1205
    :cond_36
    const/4 v1, 0x0

    .line 1206
    :goto_36
    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 1207
    .line 1208
    .line 1209
    move-result-object v1

    .line 1210
    filled-new-array {v2, v1}, [Ljava/lang/Object;

    .line 1211
    .line 1212
    .line 1213
    move-result-object v1

    .line 1214
    invoke-static {v1}, La/a;->y0([Ljava/lang/Object;)Ljava/util/List;

    .line 1215
    .line 1216
    .line 1217
    move-result-object v1

    .line 1218
    return-object v1

    .line 1219
    :pswitch_1b
    move-object/from16 v1, p1

    .line 1220
    .line 1221
    check-cast v1, Lvg/v;

    .line 1222
    .line 1223
    move-object/from16 v2, p2

    .line 1224
    .line 1225
    check-cast v2, Lwf/e;

    .line 1226
    .line 1227
    instance-of v3, v2, Li0/o2;

    .line 1228
    .line 1229
    if-eqz v3, :cond_37

    .line 1230
    .line 1231
    check-cast v2, Li0/o2;

    .line 1232
    .line 1233
    iget-object v3, v1, Lvg/v;->a:Lwf/g;

    .line 1234
    .line 1235
    const/4 v3, 0x0

    .line 1236
    invoke-static {v3}, Landroid/os/Trace;->beginSection(Ljava/lang/String;)V

    .line 1237
    .line 1238
    .line 1239
    iget-object v3, v1, Lvg/v;->b:[Ljava/lang/Object;

    .line 1240
    .line 1241
    iget v4, v1, Lvg/v;->d:I

    .line 1242
    .line 1243
    sget-object v5, Lsf/n;->a:Lsf/n;

    .line 1244
    .line 1245
    aput-object v5, v3, v4

    .line 1246
    .line 1247
    iget-object v3, v1, Lvg/v;->c:[Li0/o2;

    .line 1248
    .line 1249
    add-int/lit8 v5, v4, 0x1

    .line 1250
    .line 1251
    iput v5, v1, Lvg/v;->d:I

    .line 1252
    .line 1253
    aput-object v2, v3, v4

    .line 1254
    .line 1255
    :cond_37
    return-object v1

    .line 1256
    :pswitch_1c
    move-object/from16 v1, p1

    .line 1257
    .line 1258
    check-cast v1, Li0/o2;

    .line 1259
    .line 1260
    move-object/from16 v1, p2

    .line 1261
    .line 1262
    check-cast v1, Lwf/e;

    .line 1263
    .line 1264
    instance-of v2, v1, Li0/o2;

    .line 1265
    .line 1266
    if-eqz v2, :cond_38

    .line 1267
    .line 1268
    check-cast v1, Li0/o2;

    .line 1269
    .line 1270
    goto :goto_37

    .line 1271
    :cond_38
    const/4 v1, 0x0

    .line 1272
    :goto_37
    return-object v1

    .line 1273
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1c
        :pswitch_1b
        :pswitch_1a
        :pswitch_19
        :pswitch_18
        :pswitch_17
        :pswitch_16
        :pswitch_15
        :pswitch_14
        :pswitch_13
        :pswitch_12
        :pswitch_11
        :pswitch_10
        :pswitch_f
        :pswitch_e
        :pswitch_d
        :pswitch_c
        :pswitch_b
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
