.class Lbsh/BSHUnaryExpression;
.super Lbsh/SimpleNode;
.source "r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4"

# interfaces
.implements Lbsh/飘花落叶言子世兰哲苏楪;


# instance fields
.field public kind:I

.field public postfix:Z


# direct methods
.method public constructor <init>(I)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lbsh/SimpleNode;-><init>(I)V

    .line 2
    .line 3
    .line 4
    const/4 p1, 0x0

    .line 5
    iput-boolean p1, p0, Lbsh/BSHUnaryExpression;->postfix:Z

    .line 6
    .line 7
    return-void
.end method

.method private lhsUnaryOperation(Lbsh/LHS;Z)Ljava/lang/Object;
    .locals 2

    .line 1
    const-string v0, "lhsUnaryOperation"

    .line 2
    .line 3
    filled-new-array {v0}, [Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-static {v0}, Lbsh/Interpreter;->debug([Ljava/lang/Object;)V

    .line 8
    .line 9
    .line 10
    invoke-virtual {p1}, Lbsh/LHS;->getValue()Ljava/lang/Object;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    iget v1, p0, Lbsh/BSHUnaryExpression;->kind:I

    .line 15
    .line 16
    invoke-direct {p0, v0, v1}, Lbsh/BSHUnaryExpression;->unaryOperation(Ljava/lang/Object;I)Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    move-result-object v1

    .line 20
    iget-boolean p0, p0, Lbsh/BSHUnaryExpression;->postfix:Z

    .line 21
    .line 22
    if-eqz p0, :cond_0

    .line 23
    .line 24
    goto :goto_0

    .line 25
    :cond_0
    move-object v0, v1

    .line 26
    :goto_0
    invoke-virtual {p1, v1, p2}, Lbsh/LHS;->assign(Ljava/lang/Object;Z)Ljava/lang/Object;

    .line 27
    .line 28
    .line 29
    return-object v0
.end method

.method private unaryOperation(Ljava/lang/Object;I)Ljava/lang/Object;
    .locals 7

    .line 1
    instance-of p0, p1, Ljava/lang/Boolean;

    .line 2
    .line 3
    if-eqz p0, :cond_1

    .line 4
    .line 5
    check-cast p1, Ljava/lang/Boolean;

    .line 6
    .line 7
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 8
    .line 9
    .line 10
    move-result p0

    .line 11
    if-eqz p0, :cond_0

    .line 12
    .line 13
    sget-object p0, Lbsh/Primitive;->TRUE:Lbsh/Primitive;

    .line 14
    .line 15
    :goto_0
    move-object p1, p0

    .line 16
    goto :goto_1

    .line 17
    :cond_0
    sget-object p0, Lbsh/Primitive;->FALSE:Lbsh/Primitive;

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_1
    :goto_1
    instance-of p0, p1, Lbsh/Primitive;

    .line 21
    .line 22
    if-eqz p0, :cond_16

    .line 23
    .line 24
    check-cast p1, Lbsh/Primitive;

    .line 25
    .line 26
    sget-object p0, Lbsh/飘花落叶言子世兰苏哲楪;->飘花落叶言子楪哲苏兰世:Ljava/util/List;

    .line 27
    .line 28
    sget-object p0, Lbsh/Primitive;->NULL:Lbsh/Primitive;

    .line 29
    .line 30
    if-eq p1, p0, :cond_15

    .line 31
    .line 32
    sget-object p0, Lbsh/Primitive;->VOID:Lbsh/Primitive;

    .line 33
    .line 34
    if-eq p1, p0, :cond_14

    .line 35
    .line 36
    invoke-virtual {p1}, Lbsh/Primitive;->getType()Ljava/lang/Class;

    .line 37
    .line 38
    .line 39
    move-result-object p0

    .line 40
    sget-object v0, Ljava/lang/Boolean;->TYPE:Ljava/lang/Class;

    .line 41
    .line 42
    if-ne p0, v0, :cond_4

    .line 43
    .line 44
    invoke-virtual {p1}, Lbsh/Primitive;->getValue()Ljava/lang/Object;

    .line 45
    .line 46
    .line 47
    move-result-object p0

    .line 48
    check-cast p0, Ljava/lang/Boolean;

    .line 49
    .line 50
    invoke-virtual {p0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 51
    .line 52
    .line 53
    move-result p0

    .line 54
    const/16 p1, 0x5a

    .line 55
    .line 56
    if-ne p2, p1, :cond_3

    .line 57
    .line 58
    if-nez p0, :cond_2

    .line 59
    .line 60
    sget-object p0, Lbsh/Primitive;->TRUE:Lbsh/Primitive;

    .line 61
    .line 62
    return-object p0

    .line 63
    :cond_2
    sget-object p0, Lbsh/Primitive;->FALSE:Lbsh/Primitive;

    .line 64
    .line 65
    return-object p0

    .line 66
    :cond_3
    new-instance p0, Lbsh/UtilEvalError;

    .line 67
    .line 68
    const-string p1, "Operator inappropriate for boolean"

    .line 69
    .line 70
    invoke-direct {p0, p1}, Lbsh/UtilEvalError;-><init>(Ljava/lang/String;)V

    .line 71
    .line 72
    .line 73
    throw p0

    .line 74
    :cond_4
    invoke-virtual {p1}, Lbsh/Primitive;->getValue()Ljava/lang/Object;

    .line 75
    .line 76
    .line 77
    move-result-object p1

    .line 78
    invoke-static {p1}, Lbsh/飘花落叶言子世兰苏哲楪;->飘花落叶言子楪世兰哲苏(Ljava/lang/Object;)Ljava/lang/Number;

    .line 79
    .line 80
    .line 81
    move-result-object p1

    .line 82
    instance-of v0, p1, Ljava/lang/Integer;

    .line 83
    .line 84
    const/4 v1, 0x0

    .line 85
    const/16 v2, 0x5b

    .line 86
    .line 87
    if-eqz v0, :cond_a

    .line 88
    .line 89
    check-cast p1, Ljava/lang/Integer;

    .line 90
    .line 91
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    .line 92
    .line 93
    .line 94
    move-result p1

    .line 95
    if-eq p2, v2, :cond_5

    .line 96
    .line 97
    packed-switch p2, :pswitch_data_0

    .line 98
    .line 99
    .line 100
    const-string p0, "bad integer unaryOperation"

    .line 101
    .line 102
    invoke-static {p0}, Lbsh/飘花落叶言子世苏兰楪哲;->飘花落叶言子楪苏世兰哲(Ljava/lang/String;)V

    .line 103
    .line 104
    .line 105
    return-object v1

    .line 106
    :pswitch_0
    neg-int p1, p1

    .line 107
    goto :goto_2

    .line 108
    :pswitch_1
    add-int/lit8 p1, p1, -0x1

    .line 109
    .line 110
    goto :goto_2

    .line 111
    :pswitch_2
    add-int/lit8 p1, p1, 0x1

    .line 112
    .line 113
    goto :goto_2

    .line 114
    :cond_5
    not-int p1, p1

    .line 115
    :goto_2
    :pswitch_3
    const/16 v0, 0x66

    .line 116
    .line 117
    if-eq p2, v0, :cond_6

    .line 118
    .line 119
    const/16 v0, 0x67

    .line 120
    .line 121
    if-ne p2, v0, :cond_9

    .line 122
    .line 123
    :cond_6
    sget-object p2, Ljava/lang/Byte;->TYPE:Ljava/lang/Class;

    .line 124
    .line 125
    if-ne p0, p2, :cond_7

    .line 126
    .line 127
    new-instance p0, Lbsh/Primitive;

    .line 128
    .line 129
    int-to-byte p1, p1

    .line 130
    invoke-direct {p0, p1}, Lbsh/Primitive;-><init>(B)V

    .line 131
    .line 132
    .line 133
    return-object p0

    .line 134
    :cond_7
    sget-object p2, Ljava/lang/Short;->TYPE:Ljava/lang/Class;

    .line 135
    .line 136
    if-ne p0, p2, :cond_8

    .line 137
    .line 138
    new-instance p0, Lbsh/Primitive;

    .line 139
    .line 140
    int-to-short p1, p1

    .line 141
    invoke-direct {p0, p1}, Lbsh/Primitive;-><init>(S)V

    .line 142
    .line 143
    .line 144
    return-object p0

    .line 145
    :cond_8
    sget-object p2, Ljava/lang/Character;->TYPE:Ljava/lang/Class;

    .line 146
    .line 147
    if-ne p0, p2, :cond_9

    .line 148
    .line 149
    new-instance p0, Lbsh/Primitive;

    .line 150
    .line 151
    int-to-char p1, p1

    .line 152
    invoke-direct {p0, p1}, Lbsh/Primitive;-><init>(C)V

    .line 153
    .line 154
    .line 155
    return-object p0

    .line 156
    :cond_9
    new-instance p0, Lbsh/Primitive;

    .line 157
    .line 158
    invoke-direct {p0, p1}, Lbsh/Primitive;-><init>(I)V

    .line 159
    .line 160
    .line 161
    return-object p0

    .line 162
    :cond_a
    instance-of p0, p1, Ljava/lang/Long;

    .line 163
    .line 164
    if-eqz p0, :cond_c

    .line 165
    .line 166
    new-instance p0, Lbsh/Primitive;

    .line 167
    .line 168
    invoke-virtual {p1}, Ljava/lang/Number;->longValue()J

    .line 169
    .line 170
    .line 171
    move-result-wide v3

    .line 172
    if-eq p2, v2, :cond_b

    .line 173
    .line 174
    const-wide/16 v5, 0x1

    .line 175
    .line 176
    packed-switch p2, :pswitch_data_1

    .line 177
    .line 178
    .line 179
    const-string p0, "bad long unaryOperation"

    .line 180
    .line 181
    invoke-static {p0}, Lbsh/飘花落叶言子世苏兰楪哲;->飘花落叶言子楪苏世兰哲(Ljava/lang/String;)V

    .line 182
    .line 183
    .line 184
    return-object v1

    .line 185
    :pswitch_4
    neg-long v3, v3

    .line 186
    goto :goto_3

    .line 187
    :pswitch_5
    sub-long/2addr v3, v5

    .line 188
    goto :goto_3

    .line 189
    :pswitch_6
    add-long/2addr v3, v5

    .line 190
    goto :goto_3

    .line 191
    :cond_b
    not-long v3, v3

    .line 192
    :goto_3
    :pswitch_7
    invoke-direct {p0, v3, v4}, Lbsh/Primitive;-><init>(J)V

    .line 193
    .line 194
    .line 195
    return-object p0

    .line 196
    :cond_c
    instance-of p0, p1, Ljava/lang/Float;

    .line 197
    .line 198
    if-eqz p0, :cond_d

    .line 199
    .line 200
    new-instance p0, Lbsh/Primitive;

    .line 201
    .line 202
    invoke-virtual {p1}, Ljava/lang/Number;->floatValue()F

    .line 203
    .line 204
    .line 205
    move-result p1

    .line 206
    const/high16 v0, 0x3f800000    # 1.0f

    .line 207
    .line 208
    packed-switch p2, :pswitch_data_2

    .line 209
    .line 210
    .line 211
    const-string p0, "bad float unaryOperation"

    .line 212
    .line 213
    invoke-static {p0}, Lbsh/飘花落叶言子世苏兰楪哲;->飘花落叶言子楪苏世兰哲(Ljava/lang/String;)V

    .line 214
    .line 215
    .line 216
    return-object v1

    .line 217
    :pswitch_8
    neg-float p1, p1

    .line 218
    goto :goto_4

    .line 219
    :pswitch_9
    sub-float/2addr p1, v0

    .line 220
    goto :goto_4

    .line 221
    :pswitch_a
    add-float/2addr p1, v0

    .line 222
    :goto_4
    :pswitch_b
    invoke-direct {p0, p1}, Lbsh/Primitive;-><init>(F)V

    .line 223
    .line 224
    .line 225
    return-object p0

    .line 226
    :cond_d
    instance-of p0, p1, Ljava/lang/Double;

    .line 227
    .line 228
    if-eqz p0, :cond_e

    .line 229
    .line 230
    new-instance p0, Lbsh/Primitive;

    .line 231
    .line 232
    invoke-virtual {p1}, Ljava/lang/Number;->doubleValue()D

    .line 233
    .line 234
    .line 235
    move-result-wide v2

    .line 236
    const-wide/high16 v4, 0x3ff0000000000000L    # 1.0

    .line 237
    .line 238
    packed-switch p2, :pswitch_data_3

    .line 239
    .line 240
    .line 241
    const-string p0, "bad double unaryOperation"

    .line 242
    .line 243
    invoke-static {p0}, Lbsh/飘花落叶言子世苏兰楪哲;->飘花落叶言子楪苏世兰哲(Ljava/lang/String;)V

    .line 244
    .line 245
    .line 246
    return-object v1

    .line 247
    :pswitch_c
    neg-double v2, v2

    .line 248
    goto :goto_5

    .line 249
    :pswitch_d
    sub-double/2addr v2, v4

    .line 250
    goto :goto_5

    .line 251
    :pswitch_e
    add-double/2addr v2, v4

    .line 252
    :goto_5
    :pswitch_f
    invoke-direct {p0, v2, v3}, Lbsh/Primitive;-><init>(D)V

    .line 253
    .line 254
    .line 255
    return-object p0

    .line 256
    :cond_e
    instance-of p0, p1, Ljava/math/BigInteger;

    .line 257
    .line 258
    if-eqz p0, :cond_10

    .line 259
    .line 260
    new-instance p0, Lbsh/Primitive;

    .line 261
    .line 262
    check-cast p1, Ljava/math/BigInteger;

    .line 263
    .line 264
    if-eq p2, v2, :cond_f

    .line 265
    .line 266
    packed-switch p2, :pswitch_data_4

    .line 267
    .line 268
    .line 269
    const-string p0, "bad big integer unaryOperation"

    .line 270
    .line 271
    invoke-static {p0}, Lbsh/飘花落叶言子世苏兰楪哲;->飘花落叶言子楪苏世兰哲(Ljava/lang/String;)V

    .line 272
    .line 273
    .line 274
    return-object v1

    .line 275
    :pswitch_10
    invoke-virtual {p1}, Ljava/math/BigInteger;->negate()Ljava/math/BigInteger;

    .line 276
    .line 277
    .line 278
    move-result-object p1

    .line 279
    goto :goto_6

    .line 280
    :pswitch_11
    sget-object p2, Ljava/math/BigInteger;->ONE:Ljava/math/BigInteger;

    .line 281
    .line 282
    invoke-virtual {p1, p2}, Ljava/math/BigInteger;->subtract(Ljava/math/BigInteger;)Ljava/math/BigInteger;

    .line 283
    .line 284
    .line 285
    move-result-object p1

    .line 286
    goto :goto_6

    .line 287
    :pswitch_12
    sget-object p2, Ljava/math/BigInteger;->ONE:Ljava/math/BigInteger;

    .line 288
    .line 289
    invoke-virtual {p1, p2}, Ljava/math/BigInteger;->add(Ljava/math/BigInteger;)Ljava/math/BigInteger;

    .line 290
    .line 291
    .line 292
    move-result-object p1

    .line 293
    goto :goto_6

    .line 294
    :cond_f
    invoke-virtual {p1}, Ljava/math/BigInteger;->not()Ljava/math/BigInteger;

    .line 295
    .line 296
    .line 297
    move-result-object p1

    .line 298
    :goto_6
    :pswitch_13
    invoke-direct {p0, p1}, Lbsh/Primitive;-><init>(Ljava/math/BigInteger;)V

    .line 299
    .line 300
    .line 301
    return-object p0

    .line 302
    :cond_10
    instance-of p0, p1, Ljava/math/BigDecimal;

    .line 303
    .line 304
    if-eqz p0, :cond_13

    .line 305
    .line 306
    new-instance p0, Lbsh/Primitive;

    .line 307
    .line 308
    check-cast p1, Ljava/math/BigDecimal;

    .line 309
    .line 310
    if-eq p2, v2, :cond_11

    .line 311
    .line 312
    packed-switch p2, :pswitch_data_5

    .line 313
    .line 314
    .line 315
    const-string p0, "bad big decimal unaryOperation"

    .line 316
    .line 317
    invoke-static {p0}, Lbsh/飘花落叶言子世苏兰楪哲;->飘花落叶言子楪苏世兰哲(Ljava/lang/String;)V

    .line 318
    .line 319
    .line 320
    return-object v1

    .line 321
    :pswitch_14
    invoke-virtual {p1}, Ljava/math/BigDecimal;->negate()Ljava/math/BigDecimal;

    .line 322
    .line 323
    .line 324
    move-result-object p1

    .line 325
    goto :goto_7

    .line 326
    :pswitch_15
    sget-object p2, Ljava/math/BigDecimal;->ONE:Ljava/math/BigDecimal;

    .line 327
    .line 328
    invoke-virtual {p1, p2}, Ljava/math/BigDecimal;->subtract(Ljava/math/BigDecimal;)Ljava/math/BigDecimal;

    .line 329
    .line 330
    .line 331
    move-result-object p1

    .line 332
    goto :goto_7

    .line 333
    :pswitch_16
    sget-object p2, Ljava/math/BigDecimal;->ONE:Ljava/math/BigDecimal;

    .line 334
    .line 335
    invoke-virtual {p1, p2}, Ljava/math/BigDecimal;->add(Ljava/math/BigDecimal;)Ljava/math/BigDecimal;

    .line 336
    .line 337
    .line 338
    move-result-object p1

    .line 339
    goto :goto_7

    .line 340
    :cond_11
    invoke-virtual {p1}, Ljava/math/BigDecimal;->signum()I

    .line 341
    .line 342
    .line 343
    move-result p2

    .line 344
    const/4 v0, 0x1

    .line 345
    if-ne p2, v0, :cond_12

    .line 346
    .line 347
    invoke-virtual {p1}, Ljava/math/BigDecimal;->negate()Ljava/math/BigDecimal;

    .line 348
    .line 349
    .line 350
    move-result-object p1

    .line 351
    :cond_12
    :goto_7
    :pswitch_17
    invoke-direct {p0, p1}, Lbsh/Primitive;-><init>(Ljava/math/BigDecimal;)V

    .line 352
    .line 353
    .line 354
    return-object p0

    .line 355
    :cond_13
    const-string p0, "An error occurred.  Please call technical support."

    .line 356
    .line 357
    invoke-static {p0}, Lbsh/飘花落叶言子世苏兰楪哲;->飘花落叶言子楪苏世兰哲(Ljava/lang/String;)V

    .line 358
    .line 359
    .line 360
    return-object v1

    .line 361
    :cond_14
    new-instance p0, Lbsh/UtilEvalError;

    .line 362
    .line 363
    const-string p1, "illegal use of undefined object or \'void\' literal"

    .line 364
    .line 365
    invoke-direct {p0, p1}, Lbsh/UtilEvalError;-><init>(Ljava/lang/String;)V

    .line 366
    .line 367
    .line 368
    throw p0

    .line 369
    :cond_15
    new-instance p0, Lbsh/UtilEvalError;

    .line 370
    .line 371
    const-string p1, "illegal use of null object or \'null\' literal"

    .line 372
    .line 373
    invoke-direct {p0, p1}, Lbsh/UtilEvalError;-><init>(Ljava/lang/String;)V

    .line 374
    .line 375
    .line 376
    throw p0

    .line 377
    :cond_16
    new-instance p0, Lbsh/UtilEvalError;

    .line 378
    .line 379
    new-instance p1, Ljava/lang/StringBuilder;

    .line 380
    .line 381
    const-string v0, "Unary operation "

    .line 382
    .line 383
    invoke-direct {p1, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 384
    .line 385
    .line 386
    sget-object v0, Lbsh/飘花落叶言子世兰哲苏楪;->飘花落叶言子楪世哲兰苏:[Ljava/lang/String;

    .line 387
    .line 388
    aget-object p2, v0, p2

    .line 389
    .line 390
    const-string v0, " inappropriate for object"

    .line 391
    .line 392
    invoke-static {p1, p2, v0}, Landroidx/activity/飘花落叶言子楪哲苏兰世;->飘花落叶言子楪兰苏世哲(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 393
    .line 394
    .line 395
    move-result-object p1

    .line 396
    invoke-direct {p0, p1}, Lbsh/UtilEvalError;-><init>(Ljava/lang/String;)V

    .line 397
    .line 398
    .line 399
    throw p0

    .line 400
    nop

    .line 401
    :pswitch_data_0
    .packed-switch 0x66
        :pswitch_2
        :pswitch_1
        :pswitch_3
        :pswitch_0
    .end packed-switch

    .line 402
    .line 403
    .line 404
    .line 405
    .line 406
    .line 407
    .line 408
    .line 409
    .line 410
    .line 411
    .line 412
    .line 413
    :pswitch_data_1
    .packed-switch 0x66
        :pswitch_6
        :pswitch_5
        :pswitch_7
        :pswitch_4
    .end packed-switch

    .line 414
    .line 415
    .line 416
    .line 417
    .line 418
    .line 419
    .line 420
    .line 421
    .line 422
    .line 423
    .line 424
    .line 425
    :pswitch_data_2
    .packed-switch 0x66
        :pswitch_a
        :pswitch_9
        :pswitch_b
        :pswitch_8
    .end packed-switch

    .line 426
    .line 427
    .line 428
    .line 429
    .line 430
    .line 431
    .line 432
    .line 433
    .line 434
    .line 435
    .line 436
    .line 437
    :pswitch_data_3
    .packed-switch 0x66
        :pswitch_e
        :pswitch_d
        :pswitch_f
        :pswitch_c
    .end packed-switch

    .line 438
    .line 439
    .line 440
    .line 441
    .line 442
    .line 443
    .line 444
    .line 445
    .line 446
    .line 447
    .line 448
    .line 449
    :pswitch_data_4
    .packed-switch 0x66
        :pswitch_12
        :pswitch_11
        :pswitch_13
        :pswitch_10
    .end packed-switch

    .line 450
    .line 451
    .line 452
    .line 453
    .line 454
    .line 455
    .line 456
    .line 457
    .line 458
    .line 459
    .line 460
    .line 461
    :pswitch_data_5
    .packed-switch 0x66
        :pswitch_16
        :pswitch_15
        :pswitch_17
        :pswitch_14
    .end packed-switch
.end method


# virtual methods
.method public eval(Lbsh/CallStack;Lbsh/Interpreter;)Ljava/lang/Object;
    .locals 3

    .line 1
    const/4 v0, 0x0

    .line 2
    invoke-virtual {p0, v0}, Lbsh/SimpleNode;->jjtGetChild(I)Lbsh/飘花落叶言子世兰苏楪哲;

    .line 3
    .line 4
    .line 5
    move-result-object v0

    .line 6
    :try_start_0
    iget v1, p0, Lbsh/BSHUnaryExpression;->kind:I

    .line 7
    .line 8
    const/16 v2, 0x66

    .line 9
    .line 10
    if-eq v1, v2, :cond_1

    .line 11
    .line 12
    const/16 v2, 0x67

    .line 13
    .line 14
    if-ne v1, v2, :cond_0

    .line 15
    .line 16
    goto :goto_0

    .line 17
    :cond_0
    invoke-interface {v0, p1, p2}, Lbsh/飘花落叶言子世兰苏楪哲;->eval(Lbsh/CallStack;Lbsh/Interpreter;)Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    move-result-object p2

    .line 21
    iget v0, p0, Lbsh/BSHUnaryExpression;->kind:I

    .line 22
    .line 23
    invoke-direct {p0, p2, v0}, Lbsh/BSHUnaryExpression;->unaryOperation(Ljava/lang/Object;I)Ljava/lang/Object;

    .line 24
    .line 25
    .line 26
    move-result-object p0

    .line 27
    return-object p0

    .line 28
    :catch_0
    move-exception p2

    .line 29
    goto :goto_1

    .line 30
    :cond_1
    :goto_0
    check-cast v0, Lbsh/BSHPrimaryExpression;

    .line 31
    .line 32
    invoke-virtual {v0, p1, p2}, Lbsh/BSHPrimaryExpression;->toLHS(Lbsh/CallStack;Lbsh/Interpreter;)Lbsh/LHS;

    .line 33
    .line 34
    .line 35
    move-result-object v0

    .line 36
    invoke-virtual {p2}, Lbsh/Interpreter;->getStrictJava()Z

    .line 37
    .line 38
    .line 39
    move-result p2

    .line 40
    invoke-direct {p0, v0, p2}, Lbsh/BSHUnaryExpression;->lhsUnaryOperation(Lbsh/LHS;Z)Ljava/lang/Object;

    .line 41
    .line 42
    .line 43
    move-result-object p0
    :try_end_0
    .catch Lbsh/UtilEvalError; {:try_start_0 .. :try_end_0} :catch_0

    .line 44
    return-object p0

    .line 45
    :goto_1
    invoke-virtual {p2, p0, p1}, Lbsh/UtilEvalError;->toEvalError(Lbsh/飘花落叶言子世兰苏楪哲;Lbsh/CallStack;)Lbsh/EvalError;

    .line 46
    .line 47
    .line 48
    move-result-object p0

    .line 49
    throw p0
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 4
    .line 5
    .line 6
    invoke-super {p0}, Lbsh/SimpleNode;->toString()Ljava/lang/String;

    .line 7
    .line 8
    .line 9
    move-result-object v1

    .line 10
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 11
    .line 12
    .line 13
    const-string v1, ": "

    .line 14
    .line 15
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 16
    .line 17
    .line 18
    sget-object v1, Lbsh/飘花落叶言子世兰哲苏楪;->飘花落叶言子楪世哲兰苏:[Ljava/lang/String;

    .line 19
    .line 20
    iget p0, p0, Lbsh/BSHUnaryExpression;->kind:I

    .line 21
    .line 22
    aget-object p0, v1, p0

    .line 23
    .line 24
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 25
    .line 26
    .line 27
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 28
    .line 29
    .line 30
    move-result-object p0

    .line 31
    return-object p0
.end method
