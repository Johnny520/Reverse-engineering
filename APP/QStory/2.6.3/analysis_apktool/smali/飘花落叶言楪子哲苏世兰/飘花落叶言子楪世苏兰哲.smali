.class public final L飘花落叶言楪子哲苏世兰/飘花落叶言子楪世苏兰哲;
.super Ljava/lang/Object;
.source "r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4"

# interfaces
.implements Ljava/util/function/Function;


# instance fields
.field public final 飘花落叶言子楪哲兰世苏:Ljava/lang/Object;

.field public final synthetic 飘花落叶言子楪哲苏兰世:I


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;I)V
    .locals 0

    .line 1
    iput p2, p0, L飘花落叶言楪子哲苏世兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪哲苏兰世:I

    .line 2
    .line 3
    iput-object p1, p0, L飘花落叶言楪子哲苏世兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪哲兰世苏:Ljava/lang/Object;

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 7

    .line 1
    iget v0, p0, L飘花落叶言楪子哲苏世兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪哲苏兰世:I

    .line 2
    .line 3
    const-string v1, "can not cast to Byte "

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    const/4 v3, 0x0

    .line 7
    iget-object v4, p0, L飘花落叶言楪子哲苏世兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪哲兰世苏:Ljava/lang/Object;

    .line 8
    .line 9
    packed-switch v0, :pswitch_data_0

    .line 10
    .line 11
    .line 12
    if-nez p1, :cond_0

    .line 13
    .line 14
    move-object v3, v4

    .line 15
    check-cast v3, Ljava/lang/Short;

    .line 16
    .line 17
    goto :goto_0

    .line 18
    :cond_0
    instance-of p0, p1, Ljava/lang/Boolean;

    .line 19
    .line 20
    if-eqz p0, :cond_1

    .line 21
    .line 22
    check-cast p1, Ljava/lang/Boolean;

    .line 23
    .line 24
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 25
    .line 26
    .line 27
    move-result p0

    .line 28
    invoke-static {p0}, Ljava/lang/Short;->valueOf(S)Ljava/lang/Short;

    .line 29
    .line 30
    .line 31
    move-result-object v3

    .line 32
    goto :goto_0

    .line 33
    :cond_1
    instance-of p0, p1, Ljava/lang/Number;

    .line 34
    .line 35
    if-eqz p0, :cond_2

    .line 36
    .line 37
    check-cast p1, Ljava/lang/Number;

    .line 38
    .line 39
    invoke-virtual {p1}, Ljava/lang/Number;->shortValue()S

    .line 40
    .line 41
    .line 42
    move-result p0

    .line 43
    invoke-static {p0}, Ljava/lang/Short;->valueOf(S)Ljava/lang/Short;

    .line 44
    .line 45
    .line 46
    move-result-object v3

    .line 47
    goto :goto_0

    .line 48
    :cond_2
    new-instance p0, Ljava/lang/StringBuilder;

    .line 49
    .line 50
    const-string v0, "can not cast to Short "

    .line 51
    .line 52
    invoke-direct {p0, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 53
    .line 54
    .line 55
    invoke-static {p1, p0}, Landroidx/profileinstaller/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪哲兰苏世(Ljava/lang/Object;Ljava/lang/StringBuilder;)Ljava/lang/String;

    .line 56
    .line 57
    .line 58
    move-result-object p0

    .line 59
    invoke-static {p0}, Landroidx/collection/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪苏哲兰世(Ljava/lang/String;)V

    .line 60
    .line 61
    .line 62
    :goto_0
    return-object v3

    .line 63
    :pswitch_0
    if-nez p1, :cond_3

    .line 64
    .line 65
    move-object v3, v4

    .line 66
    check-cast v3, Ljava/lang/Long;

    .line 67
    .line 68
    goto :goto_2

    .line 69
    :cond_3
    instance-of p0, p1, Ljava/lang/Boolean;

    .line 70
    .line 71
    if-eqz p0, :cond_5

    .line 72
    .line 73
    check-cast p1, Ljava/lang/Boolean;

    .line 74
    .line 75
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 76
    .line 77
    .line 78
    move-result p0

    .line 79
    if-eqz p0, :cond_4

    .line 80
    .line 81
    const-wide/16 p0, 0x1

    .line 82
    .line 83
    goto :goto_1

    .line 84
    :cond_4
    const-wide/16 p0, 0x0

    .line 85
    .line 86
    :goto_1
    invoke-static {p0, p1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 87
    .line 88
    .line 89
    move-result-object v3

    .line 90
    goto :goto_2

    .line 91
    :cond_5
    instance-of p0, p1, Ljava/lang/Number;

    .line 92
    .line 93
    if-eqz p0, :cond_6

    .line 94
    .line 95
    check-cast p1, Ljava/lang/Number;

    .line 96
    .line 97
    invoke-virtual {p1}, Ljava/lang/Number;->longValue()J

    .line 98
    .line 99
    .line 100
    move-result-wide p0

    .line 101
    invoke-static {p0, p1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 102
    .line 103
    .line 104
    move-result-object v3

    .line 105
    goto :goto_2

    .line 106
    :cond_6
    new-instance p0, Ljava/lang/StringBuilder;

    .line 107
    .line 108
    const-string v0, "can not cast to Long "

    .line 109
    .line 110
    invoke-direct {p0, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 111
    .line 112
    .line 113
    invoke-static {p1, p0}, Landroidx/profileinstaller/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪哲兰苏世(Ljava/lang/Object;Ljava/lang/StringBuilder;)Ljava/lang/String;

    .line 114
    .line 115
    .line 116
    move-result-object p0

    .line 117
    invoke-static {p0}, Landroidx/collection/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪苏哲兰世(Ljava/lang/String;)V

    .line 118
    .line 119
    .line 120
    :goto_2
    return-object v3

    .line 121
    :pswitch_1
    if-nez p1, :cond_7

    .line 122
    .line 123
    move-object v3, v4

    .line 124
    check-cast v3, Ljava/lang/Integer;

    .line 125
    .line 126
    goto :goto_3

    .line 127
    :cond_7
    instance-of p0, p1, Ljava/lang/Boolean;

    .line 128
    .line 129
    if-eqz p0, :cond_8

    .line 130
    .line 131
    check-cast p1, Ljava/lang/Boolean;

    .line 132
    .line 133
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 134
    .line 135
    .line 136
    move-result p0

    .line 137
    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 138
    .line 139
    .line 140
    move-result-object v3

    .line 141
    goto :goto_3

    .line 142
    :cond_8
    instance-of p0, p1, Ljava/lang/Number;

    .line 143
    .line 144
    if-eqz p0, :cond_9

    .line 145
    .line 146
    check-cast p1, Ljava/lang/Number;

    .line 147
    .line 148
    invoke-virtual {p1}, Ljava/lang/Number;->intValue()I

    .line 149
    .line 150
    .line 151
    move-result p0

    .line 152
    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 153
    .line 154
    .line 155
    move-result-object v3

    .line 156
    goto :goto_3

    .line 157
    :cond_9
    new-instance p0, Ljava/lang/StringBuilder;

    .line 158
    .line 159
    const-string v0, "can not cast to Integer "

    .line 160
    .line 161
    invoke-direct {p0, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 162
    .line 163
    .line 164
    invoke-static {p1, p0}, Landroidx/profileinstaller/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪哲兰苏世(Ljava/lang/Object;Ljava/lang/StringBuilder;)Ljava/lang/String;

    .line 165
    .line 166
    .line 167
    move-result-object p0

    .line 168
    invoke-static {p0}, Landroidx/collection/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪苏哲兰世(Ljava/lang/String;)V

    .line 169
    .line 170
    .line 171
    :goto_3
    return-object v3

    .line 172
    :pswitch_2
    if-nez p1, :cond_a

    .line 173
    .line 174
    move-object v3, v4

    .line 175
    check-cast v3, Ljava/lang/Float;

    .line 176
    .line 177
    goto :goto_5

    .line 178
    :cond_a
    instance-of p0, p1, Ljava/lang/Boolean;

    .line 179
    .line 180
    if-eqz p0, :cond_c

    .line 181
    .line 182
    check-cast p1, Ljava/lang/Boolean;

    .line 183
    .line 184
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 185
    .line 186
    .line 187
    move-result p0

    .line 188
    if-eqz p0, :cond_b

    .line 189
    .line 190
    const/high16 p0, 0x3f800000    # 1.0f

    .line 191
    .line 192
    goto :goto_4

    .line 193
    :cond_b
    const/4 p0, 0x0

    .line 194
    :goto_4
    invoke-static {p0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 195
    .line 196
    .line 197
    move-result-object v3

    .line 198
    goto :goto_5

    .line 199
    :cond_c
    instance-of p0, p1, Ljava/lang/Number;

    .line 200
    .line 201
    if-eqz p0, :cond_d

    .line 202
    .line 203
    check-cast p1, Ljava/lang/Number;

    .line 204
    .line 205
    invoke-virtual {p1}, Ljava/lang/Number;->floatValue()F

    .line 206
    .line 207
    .line 208
    move-result p0

    .line 209
    invoke-static {p0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 210
    .line 211
    .line 212
    move-result-object v3

    .line 213
    goto :goto_5

    .line 214
    :cond_d
    new-instance p0, Ljava/lang/StringBuilder;

    .line 215
    .line 216
    const-string v0, "can not cast to Float "

    .line 217
    .line 218
    invoke-direct {p0, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 219
    .line 220
    .line 221
    invoke-static {p1, p0}, Landroidx/profileinstaller/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪哲兰苏世(Ljava/lang/Object;Ljava/lang/StringBuilder;)Ljava/lang/String;

    .line 222
    .line 223
    .line 224
    move-result-object p0

    .line 225
    invoke-static {p0}, Landroidx/collection/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪苏哲兰世(Ljava/lang/String;)V

    .line 226
    .line 227
    .line 228
    :goto_5
    return-object v3

    .line 229
    :pswitch_3
    check-cast v4, Ljava/lang/Double;

    .line 230
    .line 231
    if-nez p1, :cond_e

    .line 232
    .line 233
    :goto_6
    move-object v3, v4

    .line 234
    goto/16 :goto_9

    .line 235
    .line 236
    :cond_e
    instance-of v0, p1, Ljava/lang/Boolean;

    .line 237
    .line 238
    if-eqz v0, :cond_10

    .line 239
    .line 240
    check-cast p1, Ljava/lang/Boolean;

    .line 241
    .line 242
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 243
    .line 244
    .line 245
    move-result p0

    .line 246
    if-eqz p0, :cond_f

    .line 247
    .line 248
    const-wide/high16 p0, 0x3ff0000000000000L    # 1.0

    .line 249
    .line 250
    goto :goto_7

    .line 251
    :cond_f
    const-wide/16 p0, 0x0

    .line 252
    .line 253
    :goto_7
    invoke-static {p0, p1}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    .line 254
    .line 255
    .line 256
    move-result-object v3

    .line 257
    goto :goto_9

    .line 258
    :cond_10
    instance-of v0, p1, Ljava/lang/Number;

    .line 259
    .line 260
    if-eqz v0, :cond_11

    .line 261
    .line 262
    check-cast p1, Ljava/lang/Number;

    .line 263
    .line 264
    invoke-virtual {p1}, Ljava/lang/Number;->doubleValue()D

    .line 265
    .line 266
    .line 267
    move-result-wide p0

    .line 268
    invoke-static {p0, p1}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    .line 269
    .line 270
    .line 271
    move-result-object v3

    .line 272
    goto :goto_9

    .line 273
    :cond_11
    instance-of v0, p1, Ljava/lang/String;

    .line 274
    .line 275
    if-eqz v0, :cond_13

    .line 276
    .line 277
    check-cast p1, Ljava/lang/String;

    .line 278
    .line 279
    invoke-virtual {p1}, Ljava/lang/String;->isEmpty()Z

    .line 280
    .line 281
    .line 282
    move-result p0

    .line 283
    if-eqz p0, :cond_12

    .line 284
    .line 285
    goto :goto_6

    .line 286
    :cond_12
    invoke-static {p1}, Ljava/lang/Double;->parseDouble(Ljava/lang/String;)D

    .line 287
    .line 288
    .line 289
    move-result-wide p0

    .line 290
    invoke-static {p0, p1}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    .line 291
    .line 292
    .line 293
    move-result-object v3

    .line 294
    goto :goto_9

    .line 295
    :cond_13
    instance-of v0, p1, Ljava/util/List;

    .line 296
    .line 297
    if-eqz v0, :cond_14

    .line 298
    .line 299
    check-cast p1, Ljava/util/List;

    .line 300
    .line 301
    new-instance v3, Lcom/alibaba/fastjson2/JSONArray;

    .line 302
    .line 303
    invoke-interface {p1}, Ljava/util/List;->size()I

    .line 304
    .line 305
    .line 306
    move-result v0

    .line 307
    invoke-direct {v3, v0}, Lcom/alibaba/fastjson2/JSONArray;-><init>(I)V

    .line 308
    .line 309
    .line 310
    :goto_8
    invoke-interface {p1}, Ljava/util/List;->size()I

    .line 311
    .line 312
    .line 313
    move-result v0

    .line 314
    if-ge v2, v0, :cond_15

    .line 315
    .line 316
    invoke-interface {p1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 317
    .line 318
    .line 319
    move-result-object v0

    .line 320
    invoke-virtual {p0, v0}, L飘花落叶言楪子哲苏世兰/飘花落叶言子楪世苏兰哲;->apply(Ljava/lang/Object;)Ljava/lang/Object;

    .line 321
    .line 322
    .line 323
    move-result-object v0

    .line 324
    invoke-virtual {v3, v0}, Ljava/util/AbstractCollection;->add(Ljava/lang/Object;)Z

    .line 325
    .line 326
    .line 327
    add-int/lit8 v2, v2, 0x1

    .line 328
    .line 329
    goto :goto_8

    .line 330
    :cond_14
    new-instance p0, Ljava/lang/StringBuilder;

    .line 331
    .line 332
    const-string v0, "can not cast to Double "

    .line 333
    .line 334
    invoke-direct {p0, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 335
    .line 336
    .line 337
    invoke-static {p1, p0}, Landroidx/profileinstaller/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪哲兰苏世(Ljava/lang/Object;Ljava/lang/StringBuilder;)Ljava/lang/String;

    .line 338
    .line 339
    .line 340
    move-result-object p0

    .line 341
    invoke-static {p0}, Landroidx/collection/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪苏哲兰世(Ljava/lang/String;)V

    .line 342
    .line 343
    .line 344
    :cond_15
    :goto_9
    return-object v3

    .line 345
    :pswitch_4
    if-nez p1, :cond_16

    .line 346
    .line 347
    move-object v3, v4

    .line 348
    check-cast v3, Ljava/lang/Byte;

    .line 349
    .line 350
    goto :goto_a

    .line 351
    :cond_16
    instance-of p0, p1, Ljava/lang/Boolean;

    .line 352
    .line 353
    if-eqz p0, :cond_17

    .line 354
    .line 355
    check-cast p1, Ljava/lang/Boolean;

    .line 356
    .line 357
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 358
    .line 359
    .line 360
    move-result p0

    .line 361
    invoke-static {p0}, Ljava/lang/Byte;->valueOf(B)Ljava/lang/Byte;

    .line 362
    .line 363
    .line 364
    move-result-object v3

    .line 365
    goto :goto_a

    .line 366
    :cond_17
    instance-of p0, p1, Ljava/lang/Number;

    .line 367
    .line 368
    if-eqz p0, :cond_18

    .line 369
    .line 370
    check-cast p1, Ljava/lang/Number;

    .line 371
    .line 372
    invoke-virtual {p1}, Ljava/lang/Number;->byteValue()B

    .line 373
    .line 374
    .line 375
    move-result p0

    .line 376
    invoke-static {p0}, Ljava/lang/Byte;->valueOf(B)Ljava/lang/Byte;

    .line 377
    .line 378
    .line 379
    move-result-object v3

    .line 380
    goto :goto_a

    .line 381
    :cond_18
    new-instance p0, Ljava/lang/StringBuilder;

    .line 382
    .line 383
    invoke-direct {p0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 384
    .line 385
    .line 386
    invoke-static {p1, p0}, Landroidx/profileinstaller/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪哲兰苏世(Ljava/lang/Object;Ljava/lang/StringBuilder;)Ljava/lang/String;

    .line 387
    .line 388
    .line 389
    move-result-object p0

    .line 390
    invoke-static {p0}, Landroidx/collection/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪苏哲兰世(Ljava/lang/String;)V

    .line 391
    .line 392
    .line 393
    :goto_a
    return-object v3

    .line 394
    :pswitch_5
    check-cast v4, Ljava/lang/Boolean;

    .line 395
    .line 396
    if-nez p1, :cond_19

    .line 397
    .line 398
    :pswitch_6
    move-object p1, v4

    .line 399
    goto/16 :goto_e

    .line 400
    .line 401
    :cond_19
    instance-of p0, p1, Ljava/lang/Boolean;

    .line 402
    .line 403
    if-eqz p0, :cond_1a

    .line 404
    .line 405
    goto/16 :goto_e

    .line 406
    .line 407
    :cond_1a
    instance-of p0, p1, Ljava/lang/Number;

    .line 408
    .line 409
    const/4 v0, 0x1

    .line 410
    if-eqz p0, :cond_1c

    .line 411
    .line 412
    check-cast p1, Ljava/lang/Number;

    .line 413
    .line 414
    invoke-virtual {p1}, Ljava/lang/Number;->intValue()I

    .line 415
    .line 416
    .line 417
    move-result p0

    .line 418
    if-ne p0, v0, :cond_1b

    .line 419
    .line 420
    move v2, v0

    .line 421
    :cond_1b
    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 422
    .line 423
    .line 424
    move-result-object p1

    .line 425
    goto/16 :goto_e

    .line 426
    .line 427
    :cond_1c
    instance-of p0, p1, Ljava/lang/String;

    .line 428
    .line 429
    if-eqz p0, :cond_2e

    .line 430
    .line 431
    move-object p0, p1

    .line 432
    check-cast p0, Ljava/lang/String;

    .line 433
    .line 434
    invoke-virtual {p0}, Ljava/lang/String;->hashCode()I

    .line 435
    .line 436
    .line 437
    move-result v5

    .line 438
    const/4 v6, -0x1

    .line 439
    sparse-switch v5, :sswitch_data_0

    .line 440
    .line 441
    .line 442
    :goto_b
    move v2, v6

    .line 443
    goto/16 :goto_c

    .line 444
    .line 445
    :sswitch_0
    const-string v0, "false"

    .line 446
    .line 447
    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 448
    .line 449
    .line 450
    move-result p0

    .line 451
    if-nez p0, :cond_1d

    .line 452
    .line 453
    goto :goto_b

    .line 454
    :cond_1d
    const/16 v2, 0x10

    .line 455
    .line 456
    goto/16 :goto_c

    .line 457
    .line 458
    :sswitch_1
    const-string v0, "False"

    .line 459
    .line 460
    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 461
    .line 462
    .line 463
    move-result p0

    .line 464
    if-nez p0, :cond_1e

    .line 465
    .line 466
    goto :goto_b

    .line 467
    :cond_1e
    const/16 v2, 0xf

    .line 468
    .line 469
    goto/16 :goto_c

    .line 470
    .line 471
    :sswitch_2
    const-string v0, "FALSE"

    .line 472
    .line 473
    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 474
    .line 475
    .line 476
    move-result p0

    .line 477
    if-nez p0, :cond_1f

    .line 478
    .line 479
    goto :goto_b

    .line 480
    :cond_1f
    const/16 v2, 0xe

    .line 481
    .line 482
    goto/16 :goto_c

    .line 483
    .line 484
    :sswitch_3
    const-string v0, "true"

    .line 485
    .line 486
    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 487
    .line 488
    .line 489
    move-result p0

    .line 490
    if-nez p0, :cond_20

    .line 491
    .line 492
    goto :goto_b

    .line 493
    :cond_20
    const/16 v2, 0xd

    .line 494
    .line 495
    goto/16 :goto_c

    .line 496
    .line 497
    :sswitch_4
    const-string v0, "null"

    .line 498
    .line 499
    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 500
    .line 501
    .line 502
    move-result p0

    .line 503
    if-nez p0, :cond_21

    .line 504
    .line 505
    goto :goto_b

    .line 506
    :cond_21
    const/16 v2, 0xc

    .line 507
    .line 508
    goto/16 :goto_c

    .line 509
    .line 510
    :sswitch_5
    const-string v0, "True"

    .line 511
    .line 512
    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 513
    .line 514
    .line 515
    move-result p0

    .line 516
    if-nez p0, :cond_22

    .line 517
    .line 518
    goto :goto_b

    .line 519
    :cond_22
    const/16 v2, 0xb

    .line 520
    .line 521
    goto/16 :goto_c

    .line 522
    .line 523
    :sswitch_6
    const-string v0, "TRUE"

    .line 524
    .line 525
    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 526
    .line 527
    .line 528
    move-result p0

    .line 529
    if-nez p0, :cond_23

    .line 530
    .line 531
    goto :goto_b

    .line 532
    :cond_23
    const/16 v2, 0xa

    .line 533
    .line 534
    goto/16 :goto_c

    .line 535
    .line 536
    :sswitch_7
    const-string v0, "yes"

    .line 537
    .line 538
    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 539
    .line 540
    .line 541
    move-result p0

    .line 542
    if-nez p0, :cond_24

    .line 543
    .line 544
    goto :goto_b

    .line 545
    :cond_24
    const/16 v2, 0x9

    .line 546
    .line 547
    goto/16 :goto_c

    .line 548
    .line 549
    :sswitch_8
    const-string v0, "Yes"

    .line 550
    .line 551
    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 552
    .line 553
    .line 554
    move-result p0

    .line 555
    if-nez p0, :cond_25

    .line 556
    .line 557
    goto :goto_b

    .line 558
    :cond_25
    const/16 v2, 0x8

    .line 559
    .line 560
    goto/16 :goto_c

    .line 561
    .line 562
    :sswitch_9
    const-string v0, "YES"

    .line 563
    .line 564
    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 565
    .line 566
    .line 567
    move-result p0

    .line 568
    if-nez p0, :cond_26

    .line 569
    .line 570
    goto/16 :goto_b

    .line 571
    .line 572
    :cond_26
    const/4 v2, 0x7

    .line 573
    goto :goto_c

    .line 574
    :sswitch_a
    const-string v0, "no"

    .line 575
    .line 576
    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 577
    .line 578
    .line 579
    move-result p0

    .line 580
    if-nez p0, :cond_27

    .line 581
    .line 582
    goto/16 :goto_b

    .line 583
    .line 584
    :cond_27
    const/4 v2, 0x6

    .line 585
    goto :goto_c

    .line 586
    :sswitch_b
    const-string v0, "No"

    .line 587
    .line 588
    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 589
    .line 590
    .line 591
    move-result p0

    .line 592
    if-nez p0, :cond_28

    .line 593
    .line 594
    goto/16 :goto_b

    .line 595
    .line 596
    :cond_28
    const/4 v2, 0x5

    .line 597
    goto :goto_c

    .line 598
    :sswitch_c
    const-string v0, "NO"

    .line 599
    .line 600
    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 601
    .line 602
    .line 603
    move-result p0

    .line 604
    if-nez p0, :cond_29

    .line 605
    .line 606
    goto/16 :goto_b

    .line 607
    .line 608
    :cond_29
    const/4 v2, 0x4

    .line 609
    goto :goto_c

    .line 610
    :sswitch_d
    const-string v0, "Y"

    .line 611
    .line 612
    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 613
    .line 614
    .line 615
    move-result p0

    .line 616
    if-nez p0, :cond_2a

    .line 617
    .line 618
    goto/16 :goto_b

    .line 619
    .line 620
    :cond_2a
    const/4 v2, 0x3

    .line 621
    goto :goto_c

    .line 622
    :sswitch_e
    const-string v0, "T"

    .line 623
    .line 624
    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 625
    .line 626
    .line 627
    move-result p0

    .line 628
    if-nez p0, :cond_2b

    .line 629
    .line 630
    goto/16 :goto_b

    .line 631
    .line 632
    :cond_2b
    const/4 v2, 0x2

    .line 633
    goto :goto_c

    .line 634
    :sswitch_f
    const-string v2, "N"

    .line 635
    .line 636
    invoke-virtual {p0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 637
    .line 638
    .line 639
    move-result p0

    .line 640
    if-nez p0, :cond_2c

    .line 641
    .line 642
    goto/16 :goto_b

    .line 643
    .line 644
    :cond_2c
    move v2, v0

    .line 645
    goto :goto_c

    .line 646
    :sswitch_10
    const-string v0, "F"

    .line 647
    .line 648
    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 649
    .line 650
    .line 651
    move-result p0

    .line 652
    if-nez p0, :cond_2d

    .line 653
    .line 654
    goto/16 :goto_b

    .line 655
    .line 656
    :cond_2d
    :goto_c
    packed-switch v2, :pswitch_data_1

    .line 657
    .line 658
    .line 659
    goto :goto_d

    .line 660
    :pswitch_7
    sget-object p1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 661
    .line 662
    goto :goto_e

    .line 663
    :pswitch_8
    sget-object p1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 664
    .line 665
    goto :goto_e

    .line 666
    :cond_2e
    :goto_d
    new-instance p0, Ljava/lang/StringBuilder;

    .line 667
    .line 668
    invoke-direct {p0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 669
    .line 670
    .line 671
    invoke-static {p1, p0}, Landroidx/profileinstaller/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪哲兰苏世(Ljava/lang/Object;Ljava/lang/StringBuilder;)Ljava/lang/String;

    .line 672
    .line 673
    .line 674
    move-result-object p0

    .line 675
    invoke-static {p0}, Landroidx/collection/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪苏哲兰世(Ljava/lang/String;)V

    .line 676
    .line 677
    .line 678
    move-object p1, v3

    .line 679
    :goto_e
    return-object p1

    .line 680
    :pswitch_9
    :try_start_0
    check-cast v4, Ljava/lang/reflect/Constructor;

    .line 681
    .line 682
    filled-new-array {p1}, [Ljava/lang/Object;

    .line 683
    .line 684
    .line 685
    move-result-object p0

    .line 686
    invoke-virtual {v4, p0}, Ljava/lang/reflect/Constructor;->newInstance([Ljava/lang/Object;)Ljava/lang/Object;

    .line 687
    .line 688
    .line 689
    move-result-object v3
    :try_end_0
    .catch Ljava/lang/IllegalAccessException; {:try_start_0 .. :try_end_0} :catch_2
    .catch Ljava/lang/reflect/InvocationTargetException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/InstantiationException; {:try_start_0 .. :try_end_0} :catch_0

    .line 690
    goto :goto_10

    .line 691
    :catch_0
    move-exception p0

    .line 692
    goto :goto_f

    .line 693
    :catch_1
    move-exception p0

    .line 694
    goto :goto_f

    .line 695
    :catch_2
    move-exception p0

    .line 696
    :goto_f
    const-string p1, "invoke error"

    .line 697
    .line 698
    invoke-static {p1, p0}, Landroidx/collection/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪哲苏世兰(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 699
    .line 700
    .line 701
    :goto_10
    return-object v3

    .line 702
    nop

    .line 703
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_9
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch

    .line 704
    .line 705
    .line 706
    .line 707
    .line 708
    .line 709
    .line 710
    .line 711
    .line 712
    .line 713
    .line 714
    .line 715
    .line 716
    .line 717
    .line 718
    .line 719
    .line 720
    .line 721
    :sswitch_data_0
    .sparse-switch
        0x46 -> :sswitch_10
        0x4e -> :sswitch_f
        0x54 -> :sswitch_e
        0x59 -> :sswitch_d
        0x9c1 -> :sswitch_c
        0x9e1 -> :sswitch_b
        0xdc1 -> :sswitch_a
        0x156c7 -> :sswitch_9
        0x15ac7 -> :sswitch_8
        0x1d2e7 -> :sswitch_7
        0x276d8e -> :sswitch_6
        0x27e9ae -> :sswitch_5
        0x33c587 -> :sswitch_4
        0x36758e -> :sswitch_3
        0x3f92103 -> :sswitch_2
        0x4082903 -> :sswitch_1
        0x5cb1923 -> :sswitch_0
    .end sparse-switch

    .line 722
    .line 723
    .line 724
    .line 725
    .line 726
    .line 727
    .line 728
    .line 729
    .line 730
    .line 731
    .line 732
    .line 733
    .line 734
    .line 735
    .line 736
    .line 737
    .line 738
    .line 739
    .line 740
    .line 741
    .line 742
    .line 743
    .line 744
    .line 745
    .line 746
    .line 747
    .line 748
    .line 749
    .line 750
    .line 751
    .line 752
    .line 753
    .line 754
    .line 755
    .line 756
    .line 757
    .line 758
    .line 759
    .line 760
    .line 761
    .line 762
    .line 763
    .line 764
    .line 765
    .line 766
    .line 767
    .line 768
    .line 769
    .line 770
    .line 771
    .line 772
    .line 773
    .line 774
    .line 775
    .line 776
    .line 777
    .line 778
    .line 779
    .line 780
    .line 781
    .line 782
    .line 783
    .line 784
    .line 785
    .line 786
    .line 787
    .line 788
    .line 789
    .line 790
    .line 791
    :pswitch_data_1
    .packed-switch 0x0
        :pswitch_8
        :pswitch_8
        :pswitch_7
        :pswitch_7
        :pswitch_8
        :pswitch_8
        :pswitch_8
        :pswitch_7
        :pswitch_7
        :pswitch_7
        :pswitch_7
        :pswitch_7
        :pswitch_6
        :pswitch_7
        :pswitch_8
        :pswitch_8
        :pswitch_8
    .end packed-switch
.end method
