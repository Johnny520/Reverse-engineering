.class Lbsh/BSHPrimarySuffix;
.super Lbsh/SimpleNode;
.source "r8-map-id-70bf64ddac3f904dcf61383bec717e6f4283f4f555a9f70f5d9ea129839b05ef"


# static fields
.field public static final CLASS:I = 0x6

.field public static final INDEX:I = 0x1

.field public static final METHODREF:I = 0x5

.field public static final NAME:I = 0x2

.field public static final NEW:I = 0x4

.field public static final PROPERTY:I = 0x3


# instance fields
.field public field:Ljava/lang/String;

.field public hasLeftIndex:Z

.field public hasRightIndex:Z

.field index:Ljava/lang/Object;

.field public operation:I

.field public safeNavigate:Z

.field public slice:Z

.field public step:Z


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
    iput-boolean p1, p0, Lbsh/BSHPrimarySuffix;->slice:Z

    .line 6
    .line 7
    iput-boolean p1, p0, Lbsh/BSHPrimarySuffix;->step:Z

    .line 8
    .line 9
    iput-boolean p1, p0, Lbsh/BSHPrimarySuffix;->hasLeftIndex:Z

    .line 10
    .line 11
    iput-boolean p1, p0, Lbsh/BSHPrimarySuffix;->hasRightIndex:Z

    .line 12
    .line 13
    iput-boolean p1, p0, Lbsh/BSHPrimarySuffix;->safeNavigate:Z

    .line 14
    .line 15
    return-void
.end method

.method private doIndex(Ljava/lang/Object;ZLbsh/CallStack;Lbsh/Interpreter;)Ljava/lang/Object;
    .locals 9

    .line 1
    invoke-virtual {p4}, Lbsh/Interpreter;->getStrictJava()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x0

    .line 6
    if-nez v0, :cond_4

    .line 7
    .line 8
    sget-object v0, Lbsh/飘花落叶言子苏世哲楪兰;->飘花落叶言子楪世苏哲兰:Ljava/util/Map;

    .line 9
    .line 10
    instance-of v0, p1, Ljava/util/Map;

    .line 11
    .line 12
    if-eqz v0, :cond_1

    .line 13
    .line 14
    invoke-virtual {p0, v1}, Lbsh/SimpleNode;->jjtGetChild(I)Lbsh/飘花落叶言子世兰苏楪哲;

    .line 15
    .line 16
    .line 17
    move-result-object p0

    .line 18
    invoke-interface {p0, p3, p4}, Lbsh/飘花落叶言子世兰苏楪哲;->eval(Lbsh/CallStack;Lbsh/Interpreter;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    if-eqz p2, :cond_0

    .line 23
    .line 24
    new-instance p2, Lbsh/LHS;

    .line 25
    .line 26
    invoke-direct {p2, p1, p0}, Lbsh/LHS;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 27
    .line 28
    .line 29
    return-object p2

    .line 30
    :cond_0
    invoke-static {p1, p0}, Lbsh/飘花落叶言子苏楪兰世哲;->飘花落叶言子楪哲兰世苏(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 31
    .line 32
    .line 33
    move-result-object p0

    .line 34
    return-object p0

    .line 35
    :cond_1
    instance-of v0, p1, Ljava/util/Map$Entry;

    .line 36
    .line 37
    if-eqz v0, :cond_4

    .line 38
    .line 39
    invoke-virtual {p0, v1}, Lbsh/SimpleNode;->jjtGetChild(I)Lbsh/飘花落叶言子世兰苏楪哲;

    .line 40
    .line 41
    .line 42
    move-result-object v0

    .line 43
    invoke-interface {v0, p3, p4}, Lbsh/飘花落叶言子世兰苏楪哲;->eval(Lbsh/CallStack;Lbsh/Interpreter;)Ljava/lang/Object;

    .line 44
    .line 45
    .line 46
    move-result-object p4

    .line 47
    if-eqz p2, :cond_3

    .line 48
    .line 49
    move-object p2, p1

    .line 50
    check-cast p2, Ljava/util/Map$Entry;

    .line 51
    .line 52
    invoke-interface {p2}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 53
    .line 54
    .line 55
    move-result-object p2

    .line 56
    invoke-virtual {p4, p2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 57
    .line 58
    .line 59
    move-result p2

    .line 60
    if-eqz p2, :cond_2

    .line 61
    .line 62
    new-instance p0, Lbsh/LHS;

    .line 63
    .line 64
    invoke-direct {p0, p1}, Lbsh/LHS;-><init>(Ljava/lang/Object;)V

    .line 65
    .line 66
    .line 67
    return-object p0

    .line 68
    :cond_2
    new-instance p1, Lbsh/EvalError;

    .line 69
    .line 70
    const-string p2, "No such property: "

    .line 71
    .line 72
    invoke-static {p4, p2}, Landroidx/activity/飘花落叶言子楪哲苏兰世;->飘花落叶言子楪哲世兰苏(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/String;

    .line 73
    .line 74
    .line 75
    move-result-object p2

    .line 76
    invoke-direct {p1, p2, p0, p3}, Lbsh/EvalError;-><init>(Ljava/lang/String;Lbsh/飘花落叶言子世兰苏楪哲;Lbsh/CallStack;)V

    .line 77
    .line 78
    .line 79
    throw p1

    .line 80
    :cond_3
    invoke-static {p1, p4}, Lbsh/飘花落叶言子苏楪兰世哲;->飘花落叶言子楪哲兰世苏(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 81
    .line 82
    .line 83
    move-result-object p0

    .line 84
    return-object p0

    .line 85
    :cond_4
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 86
    .line 87
    .line 88
    move-result-object v0

    .line 89
    invoke-virtual {p4}, Lbsh/Interpreter;->getStrictJava()Z

    .line 90
    .line 91
    .line 92
    move-result v2

    .line 93
    if-nez v2, :cond_5

    .line 94
    .line 95
    instance-of v2, p1, Ljava/util/List;

    .line 96
    .line 97
    if-nez v2, :cond_6

    .line 98
    .line 99
    :cond_5
    invoke-virtual {v0}, Ljava/lang/Class;->isArray()Z

    .line 100
    .line 101
    .line 102
    move-result v2

    .line 103
    if-eqz v2, :cond_2e

    .line 104
    .line 105
    :cond_6
    instance-of v2, p1, Ljava/util/List;

    .line 106
    .line 107
    if-eqz v2, :cond_7

    .line 108
    .line 109
    move-object v2, p1

    .line 110
    check-cast v2, Ljava/util/List;

    .line 111
    .line 112
    invoke-interface {v2}, Ljava/util/List;->size()I

    .line 113
    .line 114
    .line 115
    move-result v2

    .line 116
    goto :goto_0

    .line 117
    :cond_7
    invoke-static {p1}, Ljava/lang/reflect/Array;->getLength(Ljava/lang/Object;)I

    .line 118
    .line 119
    .line 120
    move-result v2

    .line 121
    :goto_0
    add-int/lit8 v3, v2, 0x1

    .line 122
    .line 123
    invoke-virtual {p4}, Lbsh/Interpreter;->getStrictJava()Z

    .line 124
    .line 125
    .line 126
    move-result v4

    .line 127
    if-nez v4, :cond_c

    .line 128
    .line 129
    invoke-static {v0}, Lbsh/飘花落叶言子苏世哲楪兰;->飘花落叶言子楪兰苏哲世(Ljava/lang/Class;)Z

    .line 130
    .line 131
    .line 132
    move-result v0

    .line 133
    if-eqz v0, :cond_c

    .line 134
    .line 135
    invoke-virtual {p0, v1}, Lbsh/SimpleNode;->jjtGetChild(I)Lbsh/飘花落叶言子世兰苏楪哲;

    .line 136
    .line 137
    .line 138
    move-result-object v0

    .line 139
    invoke-interface {v0, p3, p4}, Lbsh/飘花落叶言子世兰苏楪哲;->eval(Lbsh/CallStack;Lbsh/Interpreter;)Ljava/lang/Object;

    .line 140
    .line 141
    .line 142
    move-result-object v0

    .line 143
    instance-of v3, v0, Lbsh/Primitive;

    .line 144
    .line 145
    if-eqz v3, :cond_8

    .line 146
    .line 147
    move-object v3, v0

    .line 148
    check-cast v3, Lbsh/Primitive;

    .line 149
    .line 150
    invoke-virtual {v3}, Lbsh/Primitive;->isNumber()Z

    .line 151
    .line 152
    .line 153
    move-result v3

    .line 154
    if-nez v3, :cond_9

    .line 155
    .line 156
    :cond_8
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 157
    .line 158
    .line 159
    move-result-object v3

    .line 160
    invoke-static {v3}, Lbsh/Primitive;->isWrapperType(Ljava/lang/Class;)Z

    .line 161
    .line 162
    .line 163
    move-result v3

    .line 164
    if-eqz v3, :cond_a

    .line 165
    .line 166
    :cond_9
    sget-object v3, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    .line 167
    .line 168
    invoke-static {v3, v0}, Lbsh/Primitive;->castWrapper(Ljava/lang/Class;Ljava/lang/Object;)Ljava/lang/Object;

    .line 169
    .line 170
    .line 171
    move-result-object v3

    .line 172
    check-cast v3, Ljava/lang/Integer;

    .line 173
    .line 174
    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    .line 175
    .line 176
    .line 177
    move-result v3

    .line 178
    if-le v2, v3, :cond_a

    .line 179
    .line 180
    neg-int v4, v2

    .line 181
    if-ge v4, v3, :cond_a

    .line 182
    .line 183
    goto :goto_1

    .line 184
    :cond_a
    if-eqz p2, :cond_b

    .line 185
    .line 186
    new-instance p0, Lbsh/LHS;

    .line 187
    .line 188
    check-cast p1, [Ljava/util/Map$Entry;

    .line 189
    .line 190
    invoke-static {v0, p1}, Lbsh/飘花落叶言子苏楪兰世哲;->飘花落叶言子楪苏哲兰世(Ljava/lang/Object;[Ljava/util/Map$Entry;)Ljava/util/Map$Entry;

    .line 191
    .line 192
    .line 193
    move-result-object p1

    .line 194
    invoke-direct {p0, p1}, Lbsh/LHS;-><init>(Ljava/lang/Object;)V

    .line 195
    .line 196
    .line 197
    return-object p0

    .line 198
    :cond_b
    invoke-static {p1, v0}, Lbsh/飘花落叶言子苏楪兰世哲;->飘花落叶言子楪哲兰世苏(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 199
    .line 200
    .line 201
    move-result-object p0

    .line 202
    return-object p0

    .line 203
    :cond_c
    if-le v3, v2, :cond_d

    .line 204
    .line 205
    invoke-static {p1, v1, p3, p4, p0}, Lbsh/BSHPrimarySuffix;->getIndexAux(Ljava/lang/Object;ILbsh/CallStack;Lbsh/Interpreter;Lbsh/飘花落叶言子世兰苏楪哲;)I

    .line 206
    .line 207
    .line 208
    move-result v3

    .line 209
    :cond_d
    :goto_1
    invoke-virtual {p4}, Lbsh/Interpreter;->getStrictJava()Z

    .line 210
    .line 211
    .line 212
    move-result v0

    .line 213
    if-nez v0, :cond_2a

    .line 214
    .line 215
    if-gez v3, :cond_e

    .line 216
    .line 217
    add-int/2addr v3, v2

    .line 218
    :cond_e
    iget-boolean v0, p0, Lbsh/BSHPrimarySuffix;->slice:Z

    .line 219
    .line 220
    if-eqz v0, :cond_2b

    .line 221
    .line 222
    if-nez p2, :cond_29

    .line 223
    .line 224
    iget-boolean p2, p0, Lbsh/BSHPrimarySuffix;->step:Z

    .line 225
    .line 226
    const/4 v0, 0x1

    .line 227
    if-eqz p2, :cond_14

    .line 228
    .line 229
    iget-boolean p2, p0, Lbsh/BSHPrimarySuffix;->hasLeftIndex:Z

    .line 230
    .line 231
    const/4 v4, 0x2

    .line 232
    if-eqz p2, :cond_f

    .line 233
    .line 234
    iget-boolean p2, p0, Lbsh/BSHPrimarySuffix;->hasRightIndex:Z

    .line 235
    .line 236
    if-eqz p2, :cond_f

    .line 237
    .line 238
    invoke-virtual {p0}, Lbsh/SimpleNode;->jjtGetNumChildren()I

    .line 239
    .line 240
    .line 241
    move-result p2

    .line 242
    const/4 v5, 0x3

    .line 243
    if-ne p2, v5, :cond_f

    .line 244
    .line 245
    invoke-static {p1, v4, p3, p4, p0}, Lbsh/BSHPrimarySuffix;->getIndexAux(Ljava/lang/Object;ILbsh/CallStack;Lbsh/Interpreter;Lbsh/飘花落叶言子世兰苏楪哲;)I

    .line 246
    .line 247
    .line 248
    move-result p2

    .line 249
    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 250
    .line 251
    .line 252
    move-result-object p2

    .line 253
    goto :goto_2

    .line 254
    :cond_f
    iget-boolean p2, p0, Lbsh/BSHPrimarySuffix;->hasLeftIndex:Z

    .line 255
    .line 256
    if-eqz p2, :cond_10

    .line 257
    .line 258
    iget-boolean p2, p0, Lbsh/BSHPrimarySuffix;->hasRightIndex:Z

    .line 259
    .line 260
    if-nez p2, :cond_11

    .line 261
    .line 262
    :cond_10
    invoke-virtual {p0}, Lbsh/SimpleNode;->jjtGetNumChildren()I

    .line 263
    .line 264
    .line 265
    move-result p2

    .line 266
    if-ne p2, v4, :cond_11

    .line 267
    .line 268
    invoke-static {p1, v0, p3, p4, p0}, Lbsh/BSHPrimarySuffix;->getIndexAux(Ljava/lang/Object;ILbsh/CallStack;Lbsh/Interpreter;Lbsh/飘花落叶言子世兰苏楪哲;)I

    .line 269
    .line 270
    .line 271
    move-result p2

    .line 272
    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 273
    .line 274
    .line 275
    move-result-object p2

    .line 276
    goto :goto_2

    .line 277
    :cond_11
    iget-boolean p2, p0, Lbsh/BSHPrimarySuffix;->hasLeftIndex:Z

    .line 278
    .line 279
    if-nez p2, :cond_12

    .line 280
    .line 281
    iget-boolean p2, p0, Lbsh/BSHPrimarySuffix;->hasRightIndex:Z

    .line 282
    .line 283
    if-nez p2, :cond_12

    .line 284
    .line 285
    invoke-static {p1, v1, p3, p4, p0}, Lbsh/BSHPrimarySuffix;->getIndexAux(Ljava/lang/Object;ILbsh/CallStack;Lbsh/Interpreter;Lbsh/飘花落叶言子世兰苏楪哲;)I

    .line 286
    .line 287
    .line 288
    move-result p2

    .line 289
    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 290
    .line 291
    .line 292
    move-result-object p2

    .line 293
    move v3, v1

    .line 294
    goto :goto_2

    .line 295
    :cond_12
    const/4 p2, 0x0

    .line 296
    :goto_2
    if-eqz p2, :cond_14

    .line 297
    .line 298
    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    .line 299
    .line 300
    .line 301
    move-result v4

    .line 302
    if-eqz v4, :cond_13

    .line 303
    .line 304
    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    .line 305
    .line 306
    .line 307
    move-result p2

    .line 308
    goto :goto_3

    .line 309
    :cond_13
    new-instance p1, Lbsh/EvalError;

    .line 310
    .line 311
    const-string p2, "array slice step cannot be zero"

    .line 312
    .line 313
    invoke-direct {p1, p2, p0, p3}, Lbsh/EvalError;-><init>(Ljava/lang/String;Lbsh/飘花落叶言子世兰苏楪哲;Lbsh/CallStack;)V

    .line 314
    .line 315
    .line 316
    throw p1

    .line 317
    :cond_14
    move p2, v1

    .line 318
    :goto_3
    iget-boolean v4, p0, Lbsh/BSHPrimarySuffix;->hasLeftIndex:Z

    .line 319
    .line 320
    if-eqz v4, :cond_15

    .line 321
    .line 322
    iget-boolean v4, p0, Lbsh/BSHPrimarySuffix;->hasRightIndex:Z

    .line 323
    .line 324
    if-eqz v4, :cond_15

    .line 325
    .line 326
    invoke-static {p1, v0, p3, p4, p0}, Lbsh/BSHPrimarySuffix;->getIndexAux(Ljava/lang/Object;ILbsh/CallStack;Lbsh/Interpreter;Lbsh/飘花落叶言子世兰苏楪哲;)I

    .line 327
    .line 328
    .line 329
    move-result p0

    .line 330
    move v8, v3

    .line 331
    move v3, p0

    .line 332
    move p0, v8

    .line 333
    goto :goto_4

    .line 334
    :cond_15
    iget-boolean p0, p0, Lbsh/BSHPrimarySuffix;->hasRightIndex:Z

    .line 335
    .line 336
    if-nez p0, :cond_16

    .line 337
    .line 338
    move p0, v3

    .line 339
    move v3, v2

    .line 340
    goto :goto_4

    .line 341
    :cond_16
    move p0, v1

    .line 342
    :goto_4
    if-gez v3, :cond_17

    .line 343
    .line 344
    add-int/2addr v3, v2

    .line 345
    :cond_17
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 346
    .line 347
    .line 348
    move-result-object p3

    .line 349
    invoke-virtual {p3}, Ljava/lang/Class;->isArray()Z

    .line 350
    .line 351
    .line 352
    move-result p3

    .line 353
    if-eqz p3, :cond_20

    .line 354
    .line 355
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 356
    .line 357
    .line 358
    move-result-object p3

    .line 359
    invoke-static {p3}, Lbsh/飘花落叶言子苏世哲楪兰;->飘花落叶言子楪世哲苏兰(Ljava/lang/Class;)Ljava/lang/Class;

    .line 360
    .line 361
    .line 362
    move-result-object p3

    .line 363
    invoke-static {p1}, Ljava/lang/reflect/Array;->getLength(Ljava/lang/Object;)I

    .line 364
    .line 365
    .line 366
    move-result p4

    .line 367
    if-le v3, p4, :cond_18

    .line 368
    .line 369
    move v3, p4

    .line 370
    :cond_18
    if-gez p0, :cond_19

    .line 371
    .line 372
    move p0, v1

    .line 373
    :cond_19
    sub-int/2addr v3, p0

    .line 374
    if-gtz v3, :cond_1a

    .line 375
    .line 376
    invoke-static {p3, v1}, Ljava/lang/reflect/Array;->newInstance(Ljava/lang/Class;I)Ljava/lang/Object;

    .line 377
    .line 378
    .line 379
    move-result-object p0

    .line 380
    return-object p0

    .line 381
    :cond_1a
    if-eqz p2, :cond_1f

    .line 382
    .line 383
    if-ne p2, v0, :cond_1b

    .line 384
    .line 385
    goto :goto_7

    .line 386
    :cond_1b
    const-wide/16 v4, 0x0

    .line 387
    .line 388
    int-to-double v6, v3

    .line 389
    add-double/2addr v6, v4

    .line 390
    invoke-static {p2}, Ljava/lang/Math;->abs(I)I

    .line 391
    .line 392
    .line 393
    move-result p4

    .line 394
    int-to-double v4, p4

    .line 395
    div-double/2addr v6, v4

    .line 396
    invoke-static {v6, v7}, Ljava/lang/Math;->ceil(D)D

    .line 397
    .line 398
    .line 399
    move-result-wide v4

    .line 400
    double-to-int p4, v4

    .line 401
    new-array v0, p4, [Ljava/lang/Object;

    .line 402
    .line 403
    move v2, v1

    .line 404
    :goto_5
    if-ge v1, v3, :cond_1e

    .line 405
    .line 406
    rem-int v4, v1, p2

    .line 407
    .line 408
    if-nez v4, :cond_1d

    .line 409
    .line 410
    add-int/lit8 v4, v2, 0x1

    .line 411
    .line 412
    if-gez p2, :cond_1c

    .line 413
    .line 414
    add-int/lit8 v5, v3, -0x1

    .line 415
    .line 416
    sub-int/2addr v5, v1

    .line 417
    goto :goto_6

    .line 418
    :cond_1c
    add-int v5, v1, p0

    .line 419
    .line 420
    :goto_6
    invoke-static {p1, v5}, Ljava/lang/reflect/Array;->get(Ljava/lang/Object;I)Ljava/lang/Object;

    .line 421
    .line 422
    .line 423
    move-result-object v5

    .line 424
    aput-object v5, v0, v2

    .line 425
    .line 426
    move v2, v4

    .line 427
    :cond_1d
    add-int/lit8 v1, v1, 0x1

    .line 428
    .line 429
    goto :goto_5

    .line 430
    :cond_1e
    invoke-static {p3, p4}, Ljava/lang/reflect/Array;->newInstance(Ljava/lang/Class;I)Ljava/lang/Object;

    .line 431
    .line 432
    .line 433
    move-result-object p0

    .line 434
    filled-new-array {v0}, [Ljava/lang/Object;

    .line 435
    .line 436
    .line 437
    move-result-object p1

    .line 438
    invoke-static {p3, p0, p1}, Lbsh/飘花落叶言子世楪哲苏兰;->飘花落叶言子楪世苏兰哲(Ljava/lang/Class;Ljava/lang/Object;[Ljava/lang/Object;)V

    .line 439
    .line 440
    .line 441
    return-object p0

    .line 442
    :cond_1f
    :goto_7
    invoke-static {p3, v3}, Ljava/lang/reflect/Array;->newInstance(Ljava/lang/Class;I)Ljava/lang/Object;

    .line 443
    .line 444
    .line 445
    move-result-object p2

    .line 446
    invoke-static {p1, p0, p2, v1, v3}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 447
    .line 448
    .line 449
    return-object p2

    .line 450
    :cond_20
    check-cast p1, Ljava/util/List;

    .line 451
    .line 452
    invoke-interface {p1}, Ljava/util/List;->size()I

    .line 453
    .line 454
    .line 455
    move-result p3

    .line 456
    if-le v3, p3, :cond_21

    .line 457
    .line 458
    move v3, p3

    .line 459
    :cond_21
    if-gez p0, :cond_22

    .line 460
    .line 461
    move p0, v1

    .line 462
    :cond_22
    sub-int p3, v3, p0

    .line 463
    .line 464
    if-gtz p3, :cond_23

    .line 465
    .line 466
    invoke-interface {p1, v1, v1}, Ljava/util/List;->subList(II)Ljava/util/List;

    .line 467
    .line 468
    .line 469
    move-result-object p0

    .line 470
    return-object p0

    .line 471
    :cond_23
    if-eqz p2, :cond_28

    .line 472
    .line 473
    if-ne p2, v0, :cond_24

    .line 474
    .line 475
    goto :goto_a

    .line 476
    :cond_24
    new-instance p4, Ljava/util/ArrayList;

    .line 477
    .line 478
    invoke-direct {p4}, Ljava/util/ArrayList;-><init>()V

    .line 479
    .line 480
    .line 481
    :goto_8
    if-ge v1, p3, :cond_27

    .line 482
    .line 483
    rem-int v0, v1, p2

    .line 484
    .line 485
    if-nez v0, :cond_26

    .line 486
    .line 487
    if-gez p2, :cond_25

    .line 488
    .line 489
    add-int/lit8 v0, p3, -0x1

    .line 490
    .line 491
    sub-int/2addr v0, v1

    .line 492
    goto :goto_9

    .line 493
    :cond_25
    add-int v0, v1, p0

    .line 494
    .line 495
    :goto_9
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 496
    .line 497
    .line 498
    move-result-object v0

    .line 499
    invoke-virtual {p4, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 500
    .line 501
    .line 502
    :cond_26
    add-int/lit8 v1, v1, 0x1

    .line 503
    .line 504
    goto :goto_8

    .line 505
    :cond_27
    new-instance p0, Lbsh/飘花落叶言子楪世兰哲苏;

    .line 506
    .line 507
    invoke-direct {p0, p1, p4}, Lbsh/飘花落叶言子楪世兰哲苏;-><init>(Ljava/util/List;Ljava/util/List;)V

    .line 508
    .line 509
    .line 510
    return-object p0

    .line 511
    :cond_28
    :goto_a
    invoke-interface {p1, p0, v3}, Ljava/util/List;->subList(II)Ljava/util/List;

    .line 512
    .line 513
    .line 514
    move-result-object p0

    .line 515
    return-object p0

    .line 516
    :cond_29
    new-instance p1, Lbsh/EvalError;

    .line 517
    .line 518
    const-string p2, "cannot assign to array slice"

    .line 519
    .line 520
    invoke-direct {p1, p2, p0, p3}, Lbsh/EvalError;-><init>(Ljava/lang/String;Lbsh/飘花落叶言子世兰苏楪哲;Lbsh/CallStack;)V

    .line 521
    .line 522
    .line 523
    throw p1

    .line 524
    :cond_2a
    iget-boolean p4, p0, Lbsh/BSHPrimarySuffix;->slice:Z

    .line 525
    .line 526
    if-nez p4, :cond_2d

    .line 527
    .line 528
    :cond_2b
    if-eqz p2, :cond_2c

    .line 529
    .line 530
    new-instance p0, Lbsh/LHS;

    .line 531
    .line 532
    invoke-direct {p0, p1, v3}, Lbsh/LHS;-><init>(Ljava/lang/Object;I)V

    .line 533
    .line 534
    .line 535
    return-object p0

    .line 536
    :cond_2c
    :try_start_0
    invoke-static {v3, p1}, Lbsh/飘花落叶言子世楪哲苏兰;->飘花落叶言子楪世兰苏哲(ILjava/lang/Object;)Ljava/lang/Object;

    .line 537
    .line 538
    .line 539
    move-result-object p0
    :try_end_0
    .catch Lbsh/UtilEvalError; {:try_start_0 .. :try_end_0} :catch_0

    .line 540
    return-object p0

    .line 541
    :catch_0
    move-exception p1

    .line 542
    const-string p2, "Error array get index"

    .line 543
    .line 544
    invoke-virtual {p1, p2, p0, p3}, Lbsh/UtilEvalError;->toEvalError(Ljava/lang/String;Lbsh/飘花落叶言子世兰苏楪哲;Lbsh/CallStack;)Lbsh/EvalError;

    .line 545
    .line 546
    .line 547
    move-result-object p0

    .line 548
    throw p0

    .line 549
    :cond_2d
    new-instance p1, Lbsh/EvalError;

    .line 550
    .line 551
    const-string p2, "expected \']\' but found \':\'"

    .line 552
    .line 553
    invoke-direct {p1, p2, p0, p3}, Lbsh/EvalError;-><init>(Ljava/lang/String;Lbsh/飘花落叶言子世兰苏楪哲;Lbsh/CallStack;)V

    .line 554
    .line 555
    .line 556
    throw p1

    .line 557
    :cond_2e
    new-instance p1, Lbsh/EvalError;

    .line 558
    .line 559
    const-string p2, "Not an array or List type"

    .line 560
    .line 561
    invoke-direct {p1, p2, p0, p3}, Lbsh/EvalError;-><init>(Ljava/lang/String;Lbsh/飘花落叶言子世兰苏楪哲;Lbsh/CallStack;)V

    .line 562
    .line 563
    .line 564
    throw p1
.end method

.method private doMethodRef(Ljava/lang/Object;)Lbsh/飘花落叶言子楪哲世苏兰;
    .locals 2

    .line 1
    iget-object v0, p0, Lbsh/BSHPrimarySuffix;->field:Ljava/lang/String;

    .line 2
    .line 3
    sget-object v1, Lbsh/飘花落叶言子楪哲世苏兰;->飘花落叶言子楪世哲苏兰:Lcom/kongzue/dialogx/util/飘花落叶言子楪世兰哲苏;

    .line 4
    .line 5
    new-instance v1, Lbsh/飘花落叶言子楪苏兰哲世;

    .line 6
    .line 7
    invoke-direct {v1, p0, p1, v0}, Lbsh/飘花落叶言子楪苏兰哲世;-><init>(Lbsh/飘花落叶言子世兰苏楪哲;Ljava/lang/Object;Ljava/lang/String;)V

    .line 8
    .line 9
    .line 10
    return-object v1
.end method

.method private doName(Ljava/lang/Object;ZLbsh/CallStack;Lbsh/Interpreter;)Ljava/lang/Object;
    .locals 6

    .line 1
    :try_start_0
    iget-boolean v0, p0, Lbsh/BSHPrimarySuffix;->safeNavigate:Z
    :try_end_0
    .catch Lbsh/UtilEvalError; {:try_start_0 .. :try_end_0} :catch_2

    .line 2
    .line 3
    if-eqz v0, :cond_1

    .line 4
    .line 5
    :try_start_1
    sget-object v0, Lbsh/Primitive;->NULL:Lbsh/Primitive;

    .line 6
    .line 7
    if-eq v0, p1, :cond_0

    .line 8
    .line 9
    goto :goto_0

    .line 10
    :cond_0
    invoke-static {}, Lbsh/SafeNavigate;->doAbort()Lbsh/SafeNavigate;

    .line 11
    .line 12
    .line 13
    move-result-object p1

    .line 14
    throw p1
    :try_end_1
    .catch Lbsh/UtilEvalError; {:try_start_1 .. :try_end_1} :catch_0

    .line 15
    :catch_0
    move-exception v0

    .line 16
    move-object p1, v0

    .line 17
    move-object v5, p0

    .line 18
    move-object v4, p3

    .line 19
    goto/16 :goto_2

    .line 20
    .line 21
    :cond_1
    :goto_0
    :try_start_2
    iget-object v0, p0, Lbsh/BSHPrimarySuffix;->field:Ljava/lang/String;

    .line 22
    .line 23
    const-string v1, "length"

    .line 24
    .line 25
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 26
    .line 27
    .line 28
    move-result v0
    :try_end_2
    .catch Lbsh/UtilEvalError; {:try_start_2 .. :try_end_2} :catch_2

    .line 29
    if-eqz v0, :cond_3

    .line 30
    .line 31
    :try_start_3
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 32
    .line 33
    .line 34
    move-result-object v0

    .line 35
    invoke-virtual {v0}, Ljava/lang/Class;->isArray()Z

    .line 36
    .line 37
    .line 38
    move-result v0

    .line 39
    if-eqz v0, :cond_3

    .line 40
    .line 41
    sget-object p4, Lbsh/Interpreter;->mainSecurityGuard:L飘花落叶言楪子苏世哲兰/飘花落叶言子楪世苏兰哲;

    .line 42
    .line 43
    invoke-virtual {p4}, L飘花落叶言楪子苏世哲兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲()V

    .line 44
    .line 45
    .line 46
    if-nez p2, :cond_2

    .line 47
    .line 48
    new-instance p2, Lbsh/Primitive;

    .line 49
    .line 50
    invoke-static {p1}, Ljava/lang/reflect/Array;->getLength(Ljava/lang/Object;)I

    .line 51
    .line 52
    .line 53
    move-result p1

    .line 54
    invoke-direct {p2, p1}, Lbsh/Primitive;-><init>(I)V

    .line 55
    .line 56
    .line 57
    return-object p2

    .line 58
    :cond_2
    new-instance p1, Lbsh/EvalError;

    .line 59
    .line 60
    const-string p2, "Can\'t assign array length"

    .line 61
    .line 62
    invoke-direct {p1, p2, p0, p3}, Lbsh/EvalError;-><init>(Ljava/lang/String;Lbsh/飘花落叶言子世兰苏楪哲;Lbsh/CallStack;)V

    .line 63
    .line 64
    .line 65
    throw p1
    :try_end_3
    .catch Lbsh/UtilEvalError; {:try_start_3 .. :try_end_3} :catch_0

    .line 66
    :cond_3
    :try_start_4
    invoke-virtual {p0}, Lbsh/SimpleNode;->jjtGetNumChildren()I

    .line 67
    .line 68
    .line 69
    move-result v0
    :try_end_4
    .catch Lbsh/UtilEvalError; {:try_start_4 .. :try_end_4} :catch_2

    .line 70
    if-nez v0, :cond_5

    .line 71
    .line 72
    :try_start_5
    sget-object p4, Lbsh/Interpreter;->mainSecurityGuard:L飘花落叶言楪子苏世哲兰/飘花落叶言子楪世苏兰哲;

    .line 73
    .line 74
    invoke-virtual {p4}, L飘花落叶言楪子苏世哲兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲()V
    :try_end_5
    .catch Lbsh/UtilEvalError; {:try_start_5 .. :try_end_5} :catch_0

    .line 75
    .line 76
    .line 77
    iget-object p4, p0, Lbsh/BSHPrimarySuffix;->field:Ljava/lang/String;

    .line 78
    .line 79
    if-eqz p2, :cond_4

    .line 80
    .line 81
    :try_start_6
    invoke-static {p1, p4}, Lbsh/飘花落叶言子苏楪兰世哲;->飘花落叶言子楪苏兰哲世(Ljava/lang/Object;Ljava/lang/String;)Lbsh/LHS;

    .line 82
    .line 83
    .line 84
    move-result-object p0
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_0

    .line 85
    return-object p0

    .line 86
    :catchall_0
    :try_start_7
    new-instance p2, Lbsh/LHS;

    .line 87
    .line 88
    iget-object p4, p0, Lbsh/BSHPrimarySuffix;->field:Ljava/lang/String;

    .line 89
    .line 90
    invoke-direct {p2, p1, p4}, Lbsh/LHS;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V
    :try_end_7
    .catch Lbsh/UtilEvalError; {:try_start_7 .. :try_end_7} :catch_0

    .line 91
    .line 92
    .line 93
    return-object p2

    .line 94
    :cond_4
    :try_start_8
    invoke-static {p1, p4}, Lbsh/飘花落叶言子苏楪兰世哲;->飘花落叶言子楪哲苏兰世(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 95
    .line 96
    .line 97
    move-result-object p0
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_1

    .line 98
    return-object p0

    .line 99
    :catchall_1
    :try_start_9
    iget-object p2, p0, Lbsh/BSHPrimarySuffix;->field:Ljava/lang/String;

    .line 100
    .line 101
    invoke-static {p1, p2}, Lbsh/飘花落叶言子苏楪兰世哲;->飘花落叶言子楪哲兰苏世(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 102
    .line 103
    .line 104
    move-result-object p0
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_2

    .line 105
    return-object p0

    .line 106
    :catchall_2
    :try_start_a
    sget-object p0, Lbsh/Primitive;->VOID:Lbsh/Primitive;
    :try_end_a
    .catch Lbsh/UtilEvalError; {:try_start_a .. :try_end_a} :catch_0

    .line 107
    .line 108
    return-object p0

    .line 109
    :cond_5
    const/4 p2, 0x0

    .line 110
    :try_start_b
    invoke-virtual {p0, p2}, Lbsh/SimpleNode;->jjtGetChild(I)Lbsh/飘花落叶言子世兰苏楪哲;

    .line 111
    .line 112
    .line 113
    move-result-object p2

    .line 114
    check-cast p2, Lbsh/BSHArguments;

    .line 115
    .line 116
    invoke-virtual {p2, p3, p4}, Lbsh/BSHArguments;->getArguments(Lbsh/CallStack;Lbsh/Interpreter;)[Ljava/lang/Object;

    .line 117
    .line 118
    .line 119
    move-result-object v2

    .line 120
    sget-object p2, Lbsh/Interpreter;->mainSecurityGuard:L飘花落叶言楪子苏世哲兰/飘花落叶言子楪世苏兰哲;

    .line 121
    .line 122
    iget-object v0, p0, Lbsh/BSHPrimarySuffix;->field:Ljava/lang/String;

    .line 123
    .line 124
    invoke-virtual {p2, p1, v0, v2}, L飘花落叶言楪子苏世哲兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世哲兰苏(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 125
    .line 126
    .line 127
    iget-object v1, p0, Lbsh/BSHPrimarySuffix;->field:Ljava/lang/String;
    :try_end_b
    .catch Lbsh/UtilEvalError; {:try_start_b .. :try_end_b} :catch_2

    .line 128
    .line 129
    move-object v5, p0

    .line 130
    move-object v0, p1

    .line 131
    move-object v4, p3

    .line 132
    move-object v3, p4

    .line 133
    :try_start_c
    invoke-static/range {v0 .. v5}, Lbsh/飘花落叶言子苏楪兰世哲;->飘花落叶言子楪兰哲苏世(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;Lbsh/Interpreter;Lbsh/CallStack;Lbsh/飘花落叶言子世兰苏楪哲;)Ljava/lang/Object;

    .line 134
    .line 135
    .line 136
    move-result-object p0
    :try_end_c
    .catch Lbsh/UtilEvalError; {:try_start_c .. :try_end_c} :catch_1

    .line 137
    return-object p0

    .line 138
    :catch_1
    move-exception v0

    .line 139
    :goto_1
    move-object p1, v0

    .line 140
    goto :goto_2

    .line 141
    :catch_2
    move-exception v0

    .line 142
    move-object v5, p0

    .line 143
    move-object v4, p3

    .line 144
    goto :goto_1

    .line 145
    :goto_2
    invoke-virtual {p1, v5, v4}, Lbsh/UtilEvalError;->toEvalError(Lbsh/飘花落叶言子世兰苏楪哲;Lbsh/CallStack;)Lbsh/EvalError;

    .line 146
    .line 147
    .line 148
    move-result-object p0

    .line 149
    throw p0
.end method

.method private doNewInner(Ljava/lang/Object;ZLbsh/CallStack;Lbsh/Interpreter;)Ljava/lang/Object;
    .locals 0

    .line 1
    const/4 p2, 0x0

    .line 2
    invoke-virtual {p0, p2}, Lbsh/SimpleNode;->jjtGetChild(I)Lbsh/飘花落叶言子世兰苏楪哲;

    .line 3
    .line 4
    .line 5
    move-result-object p0

    .line 6
    check-cast p0, Lbsh/BSHAllocationExpression;

    .line 7
    .line 8
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 9
    .line 10
    .line 11
    move-result-object p2

    .line 12
    invoke-static {p2}, Lbsh/飘花落叶言子苏楪兰世哲;->飘花落叶言子世楪苏兰哲(Ljava/lang/Class;)Z

    .line 13
    .line 14
    .line 15
    move-result p2

    .line 16
    if-eqz p2, :cond_0

    .line 17
    .line 18
    invoke-virtual {p3}, Lbsh/CallStack;->pop()Lbsh/NameSpace;

    .line 19
    .line 20
    .line 21
    invoke-static {p1}, Lbsh/飘花落叶言子苏楪兰世哲;->飘花落叶言子楪兰世哲苏(Ljava/lang/Object;)Lbsh/NameSpace;

    .line 22
    .line 23
    .line 24
    move-result-object p1

    .line 25
    invoke-virtual {p3, p1}, Lbsh/CallStack;->push(Lbsh/NameSpace;)V

    .line 26
    .line 27
    .line 28
    invoke-virtual {p0, p3, p4}, Lbsh/BSHAllocationExpression;->eval(Lbsh/CallStack;Lbsh/Interpreter;)Ljava/lang/Object;

    .line 29
    .line 30
    .line 31
    move-result-object p0

    .line 32
    return-object p0

    .line 33
    :cond_0
    invoke-virtual {p0, p1, p3, p4}, Lbsh/BSHAllocationExpression;->constructFromEnclosingInstance(Ljava/lang/Object;Lbsh/CallStack;Lbsh/Interpreter;)Ljava/lang/Object;

    .line 34
    .line 35
    .line 36
    move-result-object p0

    .line 37
    return-object p0
.end method

.method private doProperty(ZLjava/lang/Object;Lbsh/CallStack;Lbsh/Interpreter;)Ljava/lang/Object;
    .locals 1

    .line 1
    sget-object v0, Lbsh/Primitive;->VOID:Lbsh/Primitive;

    .line 2
    .line 3
    if-eq p2, v0, :cond_4

    .line 4
    .line 5
    instance-of v0, p2, Lbsh/Primitive;

    .line 6
    .line 7
    if-nez v0, :cond_3

    .line 8
    .line 9
    const/4 v0, 0x0

    .line 10
    invoke-virtual {p0, v0}, Lbsh/SimpleNode;->jjtGetChild(I)Lbsh/飘花落叶言子世兰苏楪哲;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    invoke-interface {v0, p3, p4}, Lbsh/飘花落叶言子世兰苏楪哲;->eval(Lbsh/CallStack;Lbsh/Interpreter;)Ljava/lang/Object;

    .line 15
    .line 16
    .line 17
    move-result-object p4

    .line 18
    instance-of v0, p4, Ljava/lang/String;

    .line 19
    .line 20
    if-eqz v0, :cond_2

    .line 21
    .line 22
    if-eqz p1, :cond_0

    .line 23
    .line 24
    new-instance p0, Lbsh/LHS;

    .line 25
    .line 26
    check-cast p4, Ljava/lang/String;

    .line 27
    .line 28
    invoke-direct {p0, p2, p4}, Lbsh/LHS;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 29
    .line 30
    .line 31
    return-object p0

    .line 32
    :cond_0
    :try_start_0
    move-object p1, p4

    .line 33
    check-cast p1, Ljava/lang/String;

    .line 34
    .line 35
    invoke-static {p2, p1}, Lbsh/飘花落叶言子苏楪兰世哲;->飘花落叶言子楪哲兰苏世(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 36
    .line 37
    .line 38
    move-result-object p1

    .line 39
    if-nez p1, :cond_1

    .line 40
    .line 41
    sget-object p0, Lbsh/Primitive;->NULL:Lbsh/Primitive;

    .line 42
    .line 43
    return-object p0

    .line 44
    :catch_0
    move-exception p1

    .line 45
    goto :goto_0

    .line 46
    :cond_1
    invoke-static {p1}, Lbsh/Primitive;->unwrap(Ljava/lang/Object;)Ljava/lang/Object;

    .line 47
    .line 48
    .line 49
    move-result-object p0
    :try_end_0
    .catch Lbsh/ReflectError; {:try_start_0 .. :try_end_0} :catch_0

    .line 50
    return-object p0

    .line 51
    :goto_0
    new-instance p2, Lbsh/EvalError;

    .line 52
    .line 53
    const-string v0, "No such property: "

    .line 54
    .line 55
    invoke-static {p4, v0}, Landroidx/activity/飘花落叶言子楪哲苏兰世;->飘花落叶言子楪哲世兰苏(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/String;

    .line 56
    .line 57
    .line 58
    move-result-object p4

    .line 59
    invoke-direct {p2, p4, p0, p3, p1}, Lbsh/EvalError;-><init>(Ljava/lang/String;Lbsh/飘花落叶言子世兰苏楪哲;Lbsh/CallStack;Ljava/lang/Throwable;)V

    .line 60
    .line 61
    .line 62
    throw p2

    .line 63
    :cond_2
    new-instance p1, Lbsh/EvalError;

    .line 64
    .line 65
    const-string p2, "Property expression must be a String or identifier."

    .line 66
    .line 67
    invoke-direct {p1, p2, p0, p3}, Lbsh/EvalError;-><init>(Ljava/lang/String;Lbsh/飘花落叶言子世兰苏楪哲;Lbsh/CallStack;)V

    .line 68
    .line 69
    .line 70
    throw p1

    .line 71
    :cond_3
    new-instance p1, Lbsh/EvalError;

    .line 72
    .line 73
    const-string p2, "Attempt to access property on a primitive"

    .line 74
    .line 75
    invoke-direct {p1, p2, p0, p3}, Lbsh/EvalError;-><init>(Ljava/lang/String;Lbsh/飘花落叶言子世兰苏楪哲;Lbsh/CallStack;)V

    .line 76
    .line 77
    .line 78
    throw p1

    .line 79
    :cond_4
    new-instance p1, Lbsh/EvalError;

    .line 80
    .line 81
    const-string p2, "Attempt to access property on undefined variable or class name"

    .line 82
    .line 83
    invoke-direct {p1, p2, p0, p3}, Lbsh/EvalError;-><init>(Ljava/lang/String;Lbsh/飘花落叶言子世兰苏楪哲;Lbsh/CallStack;)V

    .line 84
    .line 85
    .line 86
    throw p1
.end method

.method public static getIndexAux(Ljava/lang/Object;ILbsh/CallStack;Lbsh/Interpreter;Lbsh/飘花落叶言子世兰苏楪哲;)I
    .locals 0

    .line 1
    :try_start_0
    invoke-interface {p4, p1}, Lbsh/飘花落叶言子世兰苏楪哲;->jjtGetChild(I)Lbsh/飘花落叶言子世兰苏楪哲;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    invoke-interface {p0, p2, p3}, Lbsh/飘花落叶言子世兰苏楪哲;->eval(Lbsh/CallStack;Lbsh/Interpreter;)Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    instance-of p1, p0, Lbsh/Primitive;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 10
    .line 11
    sget-object p3, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    .line 12
    .line 13
    if-nez p1, :cond_0

    .line 14
    .line 15
    const/4 p1, 0x1

    .line 16
    :try_start_1
    invoke-static {p0, p3, p1}, Lbsh/飘花落叶言子苏世哲楪兰;->飘花落叶言子楪世兰哲苏(Ljava/lang/Object;Ljava/lang/Class;I)Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    move-result-object p0

    .line 20
    goto :goto_0

    .line 21
    :catch_0
    move-exception p0

    .line 22
    goto :goto_1

    .line 23
    :cond_0
    :goto_0
    invoke-static {p3, p0}, Lbsh/Primitive;->castWrapper(Ljava/lang/Class;Ljava/lang/Object;)Ljava/lang/Object;

    .line 24
    .line 25
    .line 26
    move-result-object p0

    .line 27
    check-cast p0, Ljava/lang/Integer;

    .line 28
    .line 29
    invoke-virtual {p0}, Ljava/lang/Integer;->intValue()I

    .line 30
    .line 31
    .line 32
    move-result p0
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    .line 33
    return p0

    .line 34
    :goto_1
    new-instance p1, Ljava/lang/StringBuilder;

    .line 35
    .line 36
    const-string p3, "doIndex: "

    .line 37
    .line 38
    invoke-direct {p1, p3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 39
    .line 40
    .line 41
    invoke-virtual {p1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 42
    .line 43
    .line 44
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 45
    .line 46
    .line 47
    move-result-object p1

    .line 48
    filled-new-array {p1}, [Ljava/lang/Object;

    .line 49
    .line 50
    .line 51
    move-result-object p1

    .line 52
    invoke-static {p1}, Lbsh/Interpreter;->debug([Ljava/lang/Object;)V

    .line 53
    .line 54
    .line 55
    new-instance p1, Lbsh/EvalError;

    .line 56
    .line 57
    const-string p3, "Array index does not evaluate to an integer."

    .line 58
    .line 59
    invoke-direct {p1, p3, p4, p2, p0}, Lbsh/EvalError;-><init>(Ljava/lang/String;Lbsh/飘花落叶言子世兰苏楪哲;Lbsh/CallStack;Ljava/lang/Throwable;)V

    .line 60
    .line 61
    .line 62
    throw p1
.end method


# virtual methods
.method public doSuffix(Ljava/lang/Object;ZLbsh/CallStack;Lbsh/Interpreter;)Ljava/lang/Object;
    .locals 2

    .line 1
    iget v0, p0, Lbsh/BSHPrimarySuffix;->operation:I

    .line 2
    .line 3
    const/4 v1, 0x6

    .line 4
    if-ne v0, v1, :cond_2

    .line 5
    .line 6
    instance-of v0, p1, Lbsh/BSHType;

    .line 7
    .line 8
    if-eqz v0, :cond_1

    .line 9
    .line 10
    if-nez p2, :cond_0

    .line 11
    .line 12
    check-cast p1, Lbsh/BSHType;

    .line 13
    .line 14
    invoke-virtual {p1, p3, p4}, Lbsh/BSHType;->getType(Lbsh/CallStack;Lbsh/Interpreter;)Ljava/lang/Class;

    .line 15
    .line 16
    .line 17
    move-result-object p0

    .line 18
    return-object p0

    .line 19
    :cond_0
    new-instance p1, Lbsh/EvalException;

    .line 20
    .line 21
    const-string p2, "Can\'t assign .class"

    .line 22
    .line 23
    invoke-direct {p1, p2, p0, p3}, Lbsh/EvalException;-><init>(Ljava/lang/String;Lbsh/飘花落叶言子世兰苏楪哲;Lbsh/CallStack;)V

    .line 24
    .line 25
    .line 26
    throw p1

    .line 27
    :cond_1
    new-instance p1, Lbsh/EvalException;

    .line 28
    .line 29
    const-string p2, "Attempt to use .class suffix on non class."

    .line 30
    .line 31
    invoke-direct {p1, p2, p0, p3}, Lbsh/EvalException;-><init>(Ljava/lang/String;Lbsh/飘花落叶言子世兰苏楪哲;Lbsh/CallStack;)V

    .line 32
    .line 33
    .line 34
    throw p1

    .line 35
    :cond_2
    instance-of v0, p1, Lbsh/飘花落叶言子世兰苏楪哲;

    .line 36
    .line 37
    if-eqz v0, :cond_4

    .line 38
    .line 39
    instance-of v0, p1, Lbsh/BSHAmbiguousName;

    .line 40
    .line 41
    if-eqz v0, :cond_3

    .line 42
    .line 43
    check-cast p1, Lbsh/BSHAmbiguousName;

    .line 44
    .line 45
    invoke-virtual {p1, p3, p4}, Lbsh/BSHAmbiguousName;->toObject(Lbsh/CallStack;Lbsh/Interpreter;)Ljava/lang/Object;

    .line 46
    .line 47
    .line 48
    move-result-object p1

    .line 49
    goto :goto_0

    .line 50
    :cond_3
    check-cast p1, Lbsh/飘花落叶言子世兰苏楪哲;

    .line 51
    .line 52
    invoke-interface {p1, p3, p4}, Lbsh/飘花落叶言子世兰苏楪哲;->eval(Lbsh/CallStack;Lbsh/Interpreter;)Ljava/lang/Object;

    .line 53
    .line 54
    .line 55
    move-result-object p1

    .line 56
    goto :goto_0

    .line 57
    :cond_4
    instance-of v0, p1, Lbsh/LHS;

    .line 58
    .line 59
    if-eqz v0, :cond_5

    .line 60
    .line 61
    :try_start_0
    check-cast p1, Lbsh/LHS;

    .line 62
    .line 63
    invoke-virtual {p1}, Lbsh/LHS;->getValue()Ljava/lang/Object;

    .line 64
    .line 65
    .line 66
    move-result-object p1
    :try_end_0
    .catch Lbsh/UtilEvalError; {:try_start_0 .. :try_end_0} :catch_0

    .line 67
    goto :goto_0

    .line 68
    :catch_0
    move-exception p1

    .line 69
    invoke-virtual {p1, p0, p3}, Lbsh/UtilEvalError;->toEvalError(Lbsh/飘花落叶言子世兰苏楪哲;Lbsh/CallStack;)Lbsh/EvalError;

    .line 70
    .line 71
    .line 72
    move-result-object p0

    .line 73
    throw p0

    .line 74
    :cond_5
    :goto_0
    :try_start_1
    iget v0, p0, Lbsh/BSHPrimarySuffix;->operation:I

    .line 75
    .line 76
    const/4 v1, 0x1

    .line 77
    if-eq v0, v1, :cond_a

    .line 78
    .line 79
    const/4 v1, 0x2

    .line 80
    if-eq v0, v1, :cond_9

    .line 81
    .line 82
    const/4 v1, 0x3

    .line 83
    if-eq v0, v1, :cond_8

    .line 84
    .line 85
    const/4 v1, 0x4

    .line 86
    if-eq v0, v1, :cond_7

    .line 87
    .line 88
    const/4 p2, 0x5

    .line 89
    if-ne v0, p2, :cond_6

    .line 90
    .line 91
    invoke-direct {p0, p1}, Lbsh/BSHPrimarySuffix;->doMethodRef(Ljava/lang/Object;)Lbsh/飘花落叶言子楪哲世苏兰;

    .line 92
    .line 93
    .line 94
    move-result-object p0

    .line 95
    return-object p0

    .line 96
    :catch_1
    move-exception p1

    .line 97
    goto :goto_1

    .line 98
    :cond_6
    new-instance p1, Lbsh/InterpreterError;

    .line 99
    .line 100
    const-string p2, "Unknown suffix type"

    .line 101
    .line 102
    invoke-direct {p1, p2}, Lbsh/InterpreterError;-><init>(Ljava/lang/String;)V

    .line 103
    .line 104
    .line 105
    throw p1

    .line 106
    :cond_7
    invoke-direct {p0, p1, p2, p3, p4}, Lbsh/BSHPrimarySuffix;->doNewInner(Ljava/lang/Object;ZLbsh/CallStack;Lbsh/Interpreter;)Ljava/lang/Object;

    .line 107
    .line 108
    .line 109
    move-result-object p0

    .line 110
    return-object p0

    .line 111
    :cond_8
    invoke-direct {p0, p2, p1, p3, p4}, Lbsh/BSHPrimarySuffix;->doProperty(ZLjava/lang/Object;Lbsh/CallStack;Lbsh/Interpreter;)Ljava/lang/Object;

    .line 112
    .line 113
    .line 114
    move-result-object p0

    .line 115
    return-object p0

    .line 116
    :cond_9
    invoke-direct {p0, p1, p2, p3, p4}, Lbsh/BSHPrimarySuffix;->doName(Ljava/lang/Object;ZLbsh/CallStack;Lbsh/Interpreter;)Ljava/lang/Object;

    .line 117
    .line 118
    .line 119
    move-result-object p0

    .line 120
    return-object p0

    .line 121
    :cond_a
    invoke-direct {p0, p1, p2, p3, p4}, Lbsh/BSHPrimarySuffix;->doIndex(Ljava/lang/Object;ZLbsh/CallStack;Lbsh/Interpreter;)Ljava/lang/Object;

    .line 122
    .line 123
    .line 124
    move-result-object p0
    :try_end_1
    .catch Lbsh/ReflectError; {:try_start_1 .. :try_end_1} :catch_1

    .line 125
    return-object p0

    .line 126
    :goto_1
    new-instance p2, Lbsh/EvalError;

    .line 127
    .line 128
    new-instance p4, Ljava/lang/StringBuilder;

    .line 129
    .line 130
    const-string v0, "reflection error: "

    .line 131
    .line 132
    invoke-direct {p4, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 133
    .line 134
    .line 135
    invoke-virtual {p4, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 136
    .line 137
    .line 138
    invoke-virtual {p4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 139
    .line 140
    .line 141
    move-result-object p4

    .line 142
    invoke-direct {p2, p4, p0, p3, p1}, Lbsh/EvalError;-><init>(Ljava/lang/String;Lbsh/飘花落叶言子世兰苏楪哲;Lbsh/CallStack;Ljava/lang/Throwable;)V

    .line 143
    .line 144
    .line 145
    throw p2
.end method

.method public toString()Ljava/lang/String;
    .locals 3

    .line 1
    iget v0, p0, Lbsh/BSHPrimarySuffix;->operation:I

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    if-ne v0, v1, :cond_0

    .line 5
    .line 6
    new-instance v0, Ljava/lang/StringBuilder;

    .line 7
    .line 8
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 9
    .line 10
    .line 11
    invoke-super {p0}, Lbsh/SimpleNode;->toString()Ljava/lang/String;

    .line 12
    .line 13
    .line 14
    move-result-object v1

    .line 15
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 16
    .line 17
    .line 18
    const-string v1, ":INDEX ["

    .line 19
    .line 20
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 21
    .line 22
    .line 23
    iget-boolean v1, p0, Lbsh/BSHPrimarySuffix;->hasLeftIndex:Z

    .line 24
    .line 25
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 26
    .line 27
    .line 28
    const-string v1, ":"

    .line 29
    .line 30
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 31
    .line 32
    .line 33
    iget-boolean v2, p0, Lbsh/BSHPrimarySuffix;->slice:Z

    .line 34
    .line 35
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 36
    .line 37
    .line 38
    const-string v2, " "

    .line 39
    .line 40
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 41
    .line 42
    .line 43
    iget-boolean v2, p0, Lbsh/BSHPrimarySuffix;->hasRightIndex:Z

    .line 44
    .line 45
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 46
    .line 47
    .line 48
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 49
    .line 50
    .line 51
    iget-boolean p0, p0, Lbsh/BSHPrimarySuffix;->step:Z

    .line 52
    .line 53
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 54
    .line 55
    .line 56
    const-string p0, "]"

    .line 57
    .line 58
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 59
    .line 60
    .line 61
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 62
    .line 63
    .line 64
    move-result-object p0

    .line 65
    return-object p0

    .line 66
    :cond_0
    const/4 v1, 0x2

    .line 67
    if-ne v0, v1, :cond_1

    .line 68
    .line 69
    new-instance v0, Ljava/lang/StringBuilder;

    .line 70
    .line 71
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 72
    .line 73
    .line 74
    invoke-super {p0}, Lbsh/SimpleNode;->toString()Ljava/lang/String;

    .line 75
    .line 76
    .line 77
    move-result-object v1

    .line 78
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 79
    .line 80
    .line 81
    const-string v1, ":NAME "

    .line 82
    .line 83
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 84
    .line 85
    .line 86
    iget-object p0, p0, Lbsh/BSHPrimarySuffix;->field:Ljava/lang/String;

    .line 87
    .line 88
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 89
    .line 90
    .line 91
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 92
    .line 93
    .line 94
    move-result-object p0

    .line 95
    return-object p0

    .line 96
    :cond_1
    const/4 v1, 0x3

    .line 97
    if-ne v0, v1, :cond_2

    .line 98
    .line 99
    new-instance v0, Ljava/lang/StringBuilder;

    .line 100
    .line 101
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 102
    .line 103
    .line 104
    invoke-super {p0}, Lbsh/SimpleNode;->toString()Ljava/lang/String;

    .line 105
    .line 106
    .line 107
    move-result-object p0

    .line 108
    const-string v1, ":PROPERTY {}"

    .line 109
    .line 110
    invoke-static {v0, p0, v1}, Landroidx/activity/飘花落叶言子楪哲苏兰世;->飘花落叶言子楪兰苏世哲(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 111
    .line 112
    .line 113
    move-result-object p0

    .line 114
    return-object p0

    .line 115
    :cond_2
    const/4 v1, 0x4

    .line 116
    if-ne v0, v1, :cond_3

    .line 117
    .line 118
    new-instance v0, Ljava/lang/StringBuilder;

    .line 119
    .line 120
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 121
    .line 122
    .line 123
    invoke-super {p0}, Lbsh/SimpleNode;->toString()Ljava/lang/String;

    .line 124
    .line 125
    .line 126
    move-result-object p0

    .line 127
    const-string v1, ":NEW new"

    .line 128
    .line 129
    invoke-static {v0, p0, v1}, Landroidx/activity/飘花落叶言子楪哲苏兰世;->飘花落叶言子楪兰苏世哲(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 130
    .line 131
    .line 132
    move-result-object p0

    .line 133
    return-object p0

    .line 134
    :cond_3
    const/4 v1, 0x6

    .line 135
    if-ne v0, v1, :cond_4

    .line 136
    .line 137
    new-instance v0, Ljava/lang/StringBuilder;

    .line 138
    .line 139
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 140
    .line 141
    .line 142
    invoke-super {p0}, Lbsh/SimpleNode;->toString()Ljava/lang/String;

    .line 143
    .line 144
    .line 145
    move-result-object p0

    .line 146
    const-string v1, ":CLASS class"

    .line 147
    .line 148
    invoke-static {v0, p0, v1}, Landroidx/activity/飘花落叶言子楪哲苏兰世;->飘花落叶言子楪兰苏世哲(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 149
    .line 150
    .line 151
    move-result-object p0

    .line 152
    return-object p0

    .line 153
    :cond_4
    new-instance v0, Ljava/lang/StringBuilder;

    .line 154
    .line 155
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 156
    .line 157
    .line 158
    invoke-super {p0}, Lbsh/SimpleNode;->toString()Ljava/lang/String;

    .line 159
    .line 160
    .line 161
    move-result-object p0

    .line 162
    const-string v1, ":NO OPERATION"

    .line 163
    .line 164
    invoke-static {v0, p0, v1}, Landroidx/activity/飘花落叶言子楪哲苏兰世;->飘花落叶言子楪兰苏世哲(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 165
    .line 166
    .line 167
    move-result-object p0

    .line 168
    return-object p0
.end method
