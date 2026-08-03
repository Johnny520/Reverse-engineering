.class Lbsh/BSHPrimarySuffix;
.super Lbsh/SimpleNode;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"


# static fields
.field public static final CLASS:I = 0x6

.field public static final INDEX:I = 0x1

.field public static final METHODREF:I = 0x5

.field public static final NAME:I = 0x2

.field public static final NEW:I = 0x4

.field public static final PROPERTY:I = 0x3

.field private static final serialVersionUID:J = 0x1L


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
    .locals 6

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
    invoke-static {p1}, Lbsh/Types;->isPropertyTypeMap(Ljava/lang/Object;)Z

    .line 9
    .line 10
    .line 11
    move-result v0

    .line 12
    if-eqz v0, :cond_1

    .line 13
    .line 14
    invoke-virtual {p0, v1}, Lbsh/SimpleNode;->jjtGetChild(I)Lbsh/Node;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    invoke-interface {v0, p3, p4}, Lbsh/Node;->eval(Lbsh/CallStack;Lbsh/Interpreter;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object p3

    .line 22
    if-eqz p2, :cond_0

    .line 23
    .line 24
    new-instance p2, Lbsh/LHS;

    .line 25
    .line 26
    invoke-direct {p2, p1, p3}, Lbsh/LHS;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 27
    .line 28
    .line 29
    return-object p2

    .line 30
    :cond_0
    invoke-static {p1, p3}, Lbsh/Reflect;->getObjectProperty(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 31
    .line 32
    .line 33
    move-result-object p1

    .line 34
    return-object p1

    .line 35
    :cond_1
    invoke-static {p1}, Lbsh/Types;->isPropertyTypeEntry(Ljava/lang/Object;)Z

    .line 36
    .line 37
    .line 38
    move-result v0

    .line 39
    if-eqz v0, :cond_4

    .line 40
    .line 41
    invoke-virtual {p0, v1}, Lbsh/SimpleNode;->jjtGetChild(I)Lbsh/Node;

    .line 42
    .line 43
    .line 44
    move-result-object v0

    .line 45
    invoke-interface {v0, p3, p4}, Lbsh/Node;->eval(Lbsh/CallStack;Lbsh/Interpreter;)Ljava/lang/Object;

    .line 46
    .line 47
    .line 48
    move-result-object p4

    .line 49
    if-eqz p2, :cond_3

    .line 50
    .line 51
    move-object p2, p1

    .line 52
    check-cast p2, Ljava/util/Map$Entry;

    .line 53
    .line 54
    invoke-interface {p2}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 55
    .line 56
    .line 57
    move-result-object p2

    .line 58
    invoke-virtual {p4, p2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 59
    .line 60
    .line 61
    move-result p2

    .line 62
    if-eqz p2, :cond_2

    .line 63
    .line 64
    new-instance p2, Lbsh/LHS;

    .line 65
    .line 66
    invoke-direct {p2, p1}, Lbsh/LHS;-><init>(Ljava/lang/Object;)V

    .line 67
    .line 68
    .line 69
    return-object p2

    .line 70
    :cond_2
    new-instance p1, Lbsh/EvalError;

    .line 71
    .line 72
    new-instance p2, Ljava/lang/StringBuilder;

    .line 73
    .line 74
    const-string v0, "No such property: "

    .line 75
    .line 76
    invoke-direct {p2, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 77
    .line 78
    .line 79
    invoke-virtual {p2, p4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 80
    .line 81
    .line 82
    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 83
    .line 84
    .line 85
    move-result-object p2

    .line 86
    invoke-direct {p1, p2, p0, p3}, Lbsh/EvalError;-><init>(Ljava/lang/String;Lbsh/Node;Lbsh/CallStack;)V

    .line 87
    .line 88
    .line 89
    throw p1

    .line 90
    :cond_3
    invoke-static {p1, p4}, Lbsh/Reflect;->getObjectProperty(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 91
    .line 92
    .line 93
    move-result-object p1

    .line 94
    return-object p1

    .line 95
    :cond_4
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 96
    .line 97
    .line 98
    move-result-object v0

    .line 99
    invoke-virtual {p4}, Lbsh/Interpreter;->getStrictJava()Z

    .line 100
    .line 101
    .line 102
    move-result v2

    .line 103
    if-nez v2, :cond_5

    .line 104
    .line 105
    instance-of v2, p1, Ljava/util/List;

    .line 106
    .line 107
    if-nez v2, :cond_6

    .line 108
    .line 109
    :cond_5
    invoke-virtual {v0}, Ljava/lang/Class;->isArray()Z

    .line 110
    .line 111
    .line 112
    move-result v2

    .line 113
    if-eqz v2, :cond_1e

    .line 114
    .line 115
    :cond_6
    instance-of v2, p1, Ljava/util/List;

    .line 116
    .line 117
    if-eqz v2, :cond_7

    .line 118
    .line 119
    move-object v2, p1

    .line 120
    check-cast v2, Ljava/util/List;

    .line 121
    .line 122
    invoke-interface {v2}, Ljava/util/List;->size()I

    .line 123
    .line 124
    .line 125
    move-result v2

    .line 126
    goto :goto_0

    .line 127
    :cond_7
    invoke-static {p1}, Ljava/lang/reflect/Array;->getLength(Ljava/lang/Object;)I

    .line 128
    .line 129
    .line 130
    move-result v2

    .line 131
    :goto_0
    add-int/lit8 v3, v2, 0x1

    .line 132
    .line 133
    invoke-virtual {p4}, Lbsh/Interpreter;->getStrictJava()Z

    .line 134
    .line 135
    .line 136
    move-result v4

    .line 137
    if-nez v4, :cond_c

    .line 138
    .line 139
    invoke-static {v0}, Lbsh/Types;->isPropertyTypeEntryList(Ljava/lang/Class;)Z

    .line 140
    .line 141
    .line 142
    move-result v0

    .line 143
    if-eqz v0, :cond_c

    .line 144
    .line 145
    invoke-virtual {p0, v1}, Lbsh/SimpleNode;->jjtGetChild(I)Lbsh/Node;

    .line 146
    .line 147
    .line 148
    move-result-object v0

    .line 149
    invoke-interface {v0, p3, p4}, Lbsh/Node;->eval(Lbsh/CallStack;Lbsh/Interpreter;)Ljava/lang/Object;

    .line 150
    .line 151
    .line 152
    move-result-object v0

    .line 153
    instance-of v3, v0, Lbsh/Primitive;

    .line 154
    .line 155
    if-eqz v3, :cond_8

    .line 156
    .line 157
    move-object v3, v0

    .line 158
    check-cast v3, Lbsh/Primitive;

    .line 159
    .line 160
    invoke-virtual {v3}, Lbsh/Primitive;->isNumber()Z

    .line 161
    .line 162
    .line 163
    move-result v3

    .line 164
    if-nez v3, :cond_9

    .line 165
    .line 166
    :cond_8
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 167
    .line 168
    .line 169
    move-result-object v3

    .line 170
    invoke-static {v3}, Lbsh/Primitive;->isWrapperType(Ljava/lang/Class;)Z

    .line 171
    .line 172
    .line 173
    move-result v3

    .line 174
    if-eqz v3, :cond_a

    .line 175
    .line 176
    :cond_9
    sget-object v3, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    .line 177
    .line 178
    invoke-static {v3, v0}, Lbsh/Primitive;->castWrapper(Ljava/lang/Class;Ljava/lang/Object;)Ljava/lang/Object;

    .line 179
    .line 180
    .line 181
    move-result-object v3

    .line 182
    check-cast v3, Ljava/lang/Integer;

    .line 183
    .line 184
    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    .line 185
    .line 186
    .line 187
    move-result v3

    .line 188
    if-le v2, v3, :cond_a

    .line 189
    .line 190
    neg-int v4, v2

    .line 191
    if-ge v4, v3, :cond_a

    .line 192
    .line 193
    goto :goto_1

    .line 194
    :cond_a
    if-eqz p2, :cond_b

    .line 195
    .line 196
    new-instance p2, Lbsh/LHS;

    .line 197
    .line 198
    check-cast p1, [Ljava/util/Map$Entry;

    .line 199
    .line 200
    invoke-static {v0, p1}, Lbsh/Reflect;->getEntryForKey(Ljava/lang/Object;[Ljava/util/Map$Entry;)Ljava/util/Map$Entry;

    .line 201
    .line 202
    .line 203
    move-result-object p1

    .line 204
    invoke-direct {p2, p1}, Lbsh/LHS;-><init>(Ljava/lang/Object;)V

    .line 205
    .line 206
    .line 207
    return-object p2

    .line 208
    :cond_b
    invoke-static {p1, v0}, Lbsh/Reflect;->getObjectProperty(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 209
    .line 210
    .line 211
    move-result-object p1

    .line 212
    return-object p1

    .line 213
    :cond_c
    if-le v3, v2, :cond_d

    .line 214
    .line 215
    invoke-static {p1, v1, p3, p4, p0}, Lbsh/BSHPrimarySuffix;->getIndexAux(Ljava/lang/Object;ILbsh/CallStack;Lbsh/Interpreter;Lbsh/Node;)I

    .line 216
    .line 217
    .line 218
    move-result v3

    .line 219
    :cond_d
    :goto_1
    invoke-virtual {p4}, Lbsh/Interpreter;->getStrictJava()Z

    .line 220
    .line 221
    .line 222
    move-result v0

    .line 223
    if-nez v0, :cond_1a

    .line 224
    .line 225
    if-gez v3, :cond_e

    .line 226
    .line 227
    add-int/2addr v3, v2

    .line 228
    :cond_e
    iget-boolean v0, p0, Lbsh/BSHPrimarySuffix;->slice:Z

    .line 229
    .line 230
    if-eqz v0, :cond_1b

    .line 231
    .line 232
    if-nez p2, :cond_19

    .line 233
    .line 234
    iget-boolean p2, p0, Lbsh/BSHPrimarySuffix;->step:Z

    .line 235
    .line 236
    const/4 v0, 0x1

    .line 237
    if-eqz p2, :cond_14

    .line 238
    .line 239
    iget-boolean p2, p0, Lbsh/BSHPrimarySuffix;->hasLeftIndex:Z

    .line 240
    .line 241
    const/4 v4, 0x2

    .line 242
    if-eqz p2, :cond_f

    .line 243
    .line 244
    iget-boolean p2, p0, Lbsh/BSHPrimarySuffix;->hasRightIndex:Z

    .line 245
    .line 246
    if-eqz p2, :cond_f

    .line 247
    .line 248
    invoke-virtual {p0}, Lbsh/SimpleNode;->jjtGetNumChildren()I

    .line 249
    .line 250
    .line 251
    move-result p2

    .line 252
    const/4 v5, 0x3

    .line 253
    if-ne p2, v5, :cond_f

    .line 254
    .line 255
    invoke-static {p1, v4, p3, p4, p0}, Lbsh/BSHPrimarySuffix;->getIndexAux(Ljava/lang/Object;ILbsh/CallStack;Lbsh/Interpreter;Lbsh/Node;)I

    .line 256
    .line 257
    .line 258
    move-result p2

    .line 259
    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 260
    .line 261
    .line 262
    move-result-object p2

    .line 263
    goto :goto_2

    .line 264
    :cond_f
    iget-boolean p2, p0, Lbsh/BSHPrimarySuffix;->hasLeftIndex:Z

    .line 265
    .line 266
    if-eqz p2, :cond_10

    .line 267
    .line 268
    iget-boolean p2, p0, Lbsh/BSHPrimarySuffix;->hasRightIndex:Z

    .line 269
    .line 270
    if-nez p2, :cond_11

    .line 271
    .line 272
    :cond_10
    invoke-virtual {p0}, Lbsh/SimpleNode;->jjtGetNumChildren()I

    .line 273
    .line 274
    .line 275
    move-result p2

    .line 276
    if-ne p2, v4, :cond_11

    .line 277
    .line 278
    invoke-static {p1, v0, p3, p4, p0}, Lbsh/BSHPrimarySuffix;->getIndexAux(Ljava/lang/Object;ILbsh/CallStack;Lbsh/Interpreter;Lbsh/Node;)I

    .line 279
    .line 280
    .line 281
    move-result p2

    .line 282
    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 283
    .line 284
    .line 285
    move-result-object p2

    .line 286
    goto :goto_2

    .line 287
    :cond_11
    iget-boolean p2, p0, Lbsh/BSHPrimarySuffix;->hasLeftIndex:Z

    .line 288
    .line 289
    if-nez p2, :cond_12

    .line 290
    .line 291
    iget-boolean p2, p0, Lbsh/BSHPrimarySuffix;->hasRightIndex:Z

    .line 292
    .line 293
    if-nez p2, :cond_12

    .line 294
    .line 295
    invoke-static {p1, v1, p3, p4, p0}, Lbsh/BSHPrimarySuffix;->getIndexAux(Ljava/lang/Object;ILbsh/CallStack;Lbsh/Interpreter;Lbsh/Node;)I

    .line 296
    .line 297
    .line 298
    move-result p2

    .line 299
    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 300
    .line 301
    .line 302
    move-result-object p2

    .line 303
    move v3, v1

    .line 304
    goto :goto_2

    .line 305
    :cond_12
    const/4 p2, 0x0

    .line 306
    :goto_2
    if-eqz p2, :cond_14

    .line 307
    .line 308
    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    .line 309
    .line 310
    .line 311
    move-result v4

    .line 312
    if-eqz v4, :cond_13

    .line 313
    .line 314
    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    .line 315
    .line 316
    .line 317
    move-result p2

    .line 318
    goto :goto_3

    .line 319
    :cond_13
    new-instance p1, Lbsh/EvalError;

    .line 320
    .line 321
    const-string p2, "array slice step cannot be zero"

    .line 322
    .line 323
    invoke-direct {p1, p2, p0, p3}, Lbsh/EvalError;-><init>(Ljava/lang/String;Lbsh/Node;Lbsh/CallStack;)V

    .line 324
    .line 325
    .line 326
    throw p1

    .line 327
    :cond_14
    move p2, v1

    .line 328
    :goto_3
    iget-boolean v4, p0, Lbsh/BSHPrimarySuffix;->hasLeftIndex:Z

    .line 329
    .line 330
    if-eqz v4, :cond_15

    .line 331
    .line 332
    iget-boolean v4, p0, Lbsh/BSHPrimarySuffix;->hasRightIndex:Z

    .line 333
    .line 334
    if-eqz v4, :cond_15

    .line 335
    .line 336
    invoke-static {p1, v0, p3, p4, p0}, Lbsh/BSHPrimarySuffix;->getIndexAux(Ljava/lang/Object;ILbsh/CallStack;Lbsh/Interpreter;Lbsh/Node;)I

    .line 337
    .line 338
    .line 339
    move-result p3

    .line 340
    move v1, v3

    .line 341
    move v3, p3

    .line 342
    goto :goto_4

    .line 343
    :cond_15
    iget-boolean p3, p0, Lbsh/BSHPrimarySuffix;->hasRightIndex:Z

    .line 344
    .line 345
    if-nez p3, :cond_16

    .line 346
    .line 347
    move v1, v3

    .line 348
    move v3, v2

    .line 349
    :cond_16
    :goto_4
    if-gez v3, :cond_17

    .line 350
    .line 351
    add-int/2addr v3, v2

    .line 352
    :cond_17
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 353
    .line 354
    .line 355
    move-result-object p3

    .line 356
    invoke-virtual {p3}, Ljava/lang/Class;->isArray()Z

    .line 357
    .line 358
    .line 359
    move-result p3

    .line 360
    if-eqz p3, :cond_18

    .line 361
    .line 362
    invoke-static {p1, v1, v3, p2}, Lbsh/BshArray;->slice(Ljava/lang/Object;III)Ljava/lang/Object;

    .line 363
    .line 364
    .line 365
    move-result-object p1

    .line 366
    return-object p1

    .line 367
    :cond_18
    check-cast p1, Ljava/util/List;

    .line 368
    .line 369
    invoke-static {p1, v1, v3, p2}, Lbsh/BshArray;->slice(Ljava/util/List;III)Ljava/lang/Object;

    .line 370
    .line 371
    .line 372
    move-result-object p1

    .line 373
    return-object p1

    .line 374
    :cond_19
    new-instance p1, Lbsh/EvalError;

    .line 375
    .line 376
    const-string p2, "cannot assign to array slice"

    .line 377
    .line 378
    invoke-direct {p1, p2, p0, p3}, Lbsh/EvalError;-><init>(Ljava/lang/String;Lbsh/Node;Lbsh/CallStack;)V

    .line 379
    .line 380
    .line 381
    throw p1

    .line 382
    :cond_1a
    iget-boolean p4, p0, Lbsh/BSHPrimarySuffix;->slice:Z

    .line 383
    .line 384
    if-nez p4, :cond_1d

    .line 385
    .line 386
    :cond_1b
    if-eqz p2, :cond_1c

    .line 387
    .line 388
    new-instance p2, Lbsh/LHS;

    .line 389
    .line 390
    invoke-direct {p2, p1, v3}, Lbsh/LHS;-><init>(Ljava/lang/Object;I)V

    .line 391
    .line 392
    .line 393
    return-object p2

    .line 394
    :cond_1c
    :try_start_0
    invoke-static {p1, v3}, Lbsh/BshArray;->getIndex(Ljava/lang/Object;I)Ljava/lang/Object;

    .line 395
    .line 396
    .line 397
    move-result-object p1
    :try_end_0
    .catch Lbsh/UtilEvalError; {:try_start_0 .. :try_end_0} :catch_0

    .line 398
    return-object p1

    .line 399
    :catch_0
    move-exception p1

    .line 400
    const-string p2, "Error array get index"

    .line 401
    .line 402
    invoke-virtual {p1, p2, p0, p3}, Lbsh/UtilEvalError;->toEvalError(Ljava/lang/String;Lbsh/Node;Lbsh/CallStack;)Lbsh/EvalError;

    .line 403
    .line 404
    .line 405
    move-result-object p1

    .line 406
    throw p1

    .line 407
    :cond_1d
    new-instance p1, Lbsh/EvalError;

    .line 408
    .line 409
    const-string p2, "expected \']\' but found \':\'"

    .line 410
    .line 411
    invoke-direct {p1, p2, p0, p3}, Lbsh/EvalError;-><init>(Ljava/lang/String;Lbsh/Node;Lbsh/CallStack;)V

    .line 412
    .line 413
    .line 414
    throw p1

    .line 415
    :cond_1e
    new-instance p1, Lbsh/EvalError;

    .line 416
    .line 417
    const-string p2, "Not an array or List type"

    .line 418
    .line 419
    invoke-direct {p1, p2, p0, p3}, Lbsh/EvalError;-><init>(Ljava/lang/String;Lbsh/Node;Lbsh/CallStack;)V

    .line 420
    .line 421
    .line 422
    throw p1
.end method

.method private doMethodRef(Ljava/lang/Object;)Lbsh/BshLambda;
    .locals 1

    .line 1
    iget-object v0, p0, Lbsh/BSHPrimarySuffix;->field:Ljava/lang/String;

    .line 2
    .line 3
    invoke-static {p0, p1, v0}, Lbsh/BshLambda;->fromMethodReference(Lbsh/Node;Ljava/lang/Object;Ljava/lang/String;)Lbsh/BshLambda;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    return-object p1
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
    sget-object p4, Lbsh/Interpreter;->mainSecurityGuard:Lbsh/security/MainSecurityGuard;

    .line 42
    .line 43
    iget-object v0, p0, Lbsh/BSHPrimarySuffix;->field:Ljava/lang/String;

    .line 44
    .line 45
    invoke-virtual {p4, p1, v0}, Lbsh/security/MainSecurityGuard;->canGetField(Ljava/lang/Object;Ljava/lang/String;)V

    .line 46
    .line 47
    .line 48
    if-nez p2, :cond_2

    .line 49
    .line 50
    new-instance p2, Lbsh/Primitive;

    .line 51
    .line 52
    invoke-static {p1}, Ljava/lang/reflect/Array;->getLength(Ljava/lang/Object;)I

    .line 53
    .line 54
    .line 55
    move-result p1

    .line 56
    invoke-direct {p2, p1}, Lbsh/Primitive;-><init>(I)V

    .line 57
    .line 58
    .line 59
    return-object p2

    .line 60
    :cond_2
    new-instance p1, Lbsh/EvalError;

    .line 61
    .line 62
    const-string p2, "Can\'t assign array length"

    .line 63
    .line 64
    invoke-direct {p1, p2, p0, p3}, Lbsh/EvalError;-><init>(Ljava/lang/String;Lbsh/Node;Lbsh/CallStack;)V

    .line 65
    .line 66
    .line 67
    throw p1
    :try_end_3
    .catch Lbsh/UtilEvalError; {:try_start_3 .. :try_end_3} :catch_0

    .line 68
    :cond_3
    :try_start_4
    invoke-virtual {p0}, Lbsh/SimpleNode;->jjtGetNumChildren()I

    .line 69
    .line 70
    .line 71
    move-result v0
    :try_end_4
    .catch Lbsh/UtilEvalError; {:try_start_4 .. :try_end_4} :catch_2

    .line 72
    if-nez v0, :cond_5

    .line 73
    .line 74
    :try_start_5
    sget-object p4, Lbsh/Interpreter;->mainSecurityGuard:Lbsh/security/MainSecurityGuard;

    .line 75
    .line 76
    iget-object v0, p0, Lbsh/BSHPrimarySuffix;->field:Ljava/lang/String;

    .line 77
    .line 78
    invoke-virtual {p4, p1, v0}, Lbsh/security/MainSecurityGuard;->canGetField(Ljava/lang/Object;Ljava/lang/String;)V
    :try_end_5
    .catch Lbsh/UtilEvalError; {:try_start_5 .. :try_end_5} :catch_0

    .line 79
    .line 80
    .line 81
    iget-object p4, p0, Lbsh/BSHPrimarySuffix;->field:Ljava/lang/String;

    .line 82
    .line 83
    if-eqz p2, :cond_4

    .line 84
    .line 85
    :try_start_6
    invoke-static {p1, p4}, Lbsh/Reflect;->getLHSObjectField(Ljava/lang/Object;Ljava/lang/String;)Lbsh/LHS;

    .line 86
    .line 87
    .line 88
    move-result-object p1
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_0

    .line 89
    return-object p1

    .line 90
    :catchall_0
    :try_start_7
    new-instance p2, Lbsh/LHS;

    .line 91
    .line 92
    iget-object p4, p0, Lbsh/BSHPrimarySuffix;->field:Ljava/lang/String;

    .line 93
    .line 94
    invoke-direct {p2, p1, p4}, Lbsh/LHS;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V
    :try_end_7
    .catch Lbsh/UtilEvalError; {:try_start_7 .. :try_end_7} :catch_0

    .line 95
    .line 96
    .line 97
    return-object p2

    .line 98
    :cond_4
    :try_start_8
    invoke-static {p1, p4}, Lbsh/Reflect;->getObjectFieldValue(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 99
    .line 100
    .line 101
    move-result-object p1
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_1

    .line 102
    return-object p1

    .line 103
    :catchall_1
    :try_start_9
    iget-object p2, p0, Lbsh/BSHPrimarySuffix;->field:Ljava/lang/String;

    .line 104
    .line 105
    invoke-static {p1, p2}, Lbsh/Reflect;->getObjectProperty(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 106
    .line 107
    .line 108
    move-result-object p1
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_2

    .line 109
    return-object p1

    .line 110
    :catchall_2
    :try_start_a
    sget-object p1, Lbsh/Primitive;->VOID:Lbsh/Primitive;
    :try_end_a
    .catch Lbsh/UtilEvalError; {:try_start_a .. :try_end_a} :catch_0

    .line 111
    .line 112
    return-object p1

    .line 113
    :cond_5
    const/4 p2, 0x0

    .line 114
    :try_start_b
    invoke-virtual {p0, p2}, Lbsh/SimpleNode;->jjtGetChild(I)Lbsh/Node;

    .line 115
    .line 116
    .line 117
    move-result-object p2

    .line 118
    check-cast p2, Lbsh/BSHArguments;

    .line 119
    .line 120
    invoke-virtual {p2, p3, p4}, Lbsh/BSHArguments;->getArguments(Lbsh/CallStack;Lbsh/Interpreter;)[Ljava/lang/Object;

    .line 121
    .line 122
    .line 123
    move-result-object v2

    .line 124
    sget-object p2, Lbsh/Interpreter;->mainSecurityGuard:Lbsh/security/MainSecurityGuard;

    .line 125
    .line 126
    iget-object v0, p0, Lbsh/BSHPrimarySuffix;->field:Ljava/lang/String;

    .line 127
    .line 128
    invoke-virtual {p2, p1, v0, v2}, Lbsh/security/MainSecurityGuard;->canInvokeMethod(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 129
    .line 130
    .line 131
    iget-object v1, p0, Lbsh/BSHPrimarySuffix;->field:Ljava/lang/String;
    :try_end_b
    .catch Lbsh/UtilEvalError; {:try_start_b .. :try_end_b} :catch_2

    .line 132
    .line 133
    move-object v5, p0

    .line 134
    move-object v0, p1

    .line 135
    move-object v4, p3

    .line 136
    move-object v3, p4

    .line 137
    :try_start_c
    invoke-static/range {v0 .. v5}, Lbsh/Reflect;->invokeObjectMethod(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;Lbsh/Interpreter;Lbsh/CallStack;Lbsh/Node;)Ljava/lang/Object;

    .line 138
    .line 139
    .line 140
    move-result-object p1
    :try_end_c
    .catch Lbsh/UtilEvalError; {:try_start_c .. :try_end_c} :catch_1

    .line 141
    return-object p1

    .line 142
    :catch_1
    move-exception v0

    .line 143
    :goto_1
    move-object p1, v0

    .line 144
    goto :goto_2

    .line 145
    :catch_2
    move-exception v0

    .line 146
    move-object v5, p0

    .line 147
    move-object v4, p3

    .line 148
    goto :goto_1

    .line 149
    :goto_2
    invoke-virtual {p1, p0, v4}, Lbsh/UtilEvalError;->toEvalError(Lbsh/Node;Lbsh/CallStack;)Lbsh/EvalError;

    .line 150
    .line 151
    .line 152
    move-result-object p1

    .line 153
    throw p1
.end method

.method private doNewInner(Ljava/lang/Object;ZLbsh/CallStack;Lbsh/Interpreter;)Ljava/lang/Object;
    .locals 1

    .line 1
    const/4 p2, 0x0

    .line 2
    invoke-virtual {p0, p2}, Lbsh/SimpleNode;->jjtGetChild(I)Lbsh/Node;

    .line 3
    .line 4
    .line 5
    move-result-object p2

    .line 6
    check-cast p2, Lbsh/BSHAllocationExpression;

    .line 7
    .line 8
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    invoke-static {v0}, Lbsh/Reflect;->isGeneratedClass(Ljava/lang/Class;)Z

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    if-eqz v0, :cond_0

    .line 17
    .line 18
    invoke-virtual {p3}, Lbsh/CallStack;->pop()Lbsh/NameSpace;

    .line 19
    .line 20
    .line 21
    invoke-static {p1}, Lbsh/Reflect;->getThisNS(Ljava/lang/Object;)Lbsh/NameSpace;

    .line 22
    .line 23
    .line 24
    move-result-object p1

    .line 25
    invoke-virtual {p3, p1}, Lbsh/CallStack;->push(Lbsh/NameSpace;)V

    .line 26
    .line 27
    .line 28
    invoke-virtual {p2, p3, p4}, Lbsh/BSHAllocationExpression;->eval(Lbsh/CallStack;Lbsh/Interpreter;)Ljava/lang/Object;

    .line 29
    .line 30
    .line 31
    move-result-object p1

    .line 32
    return-object p1

    .line 33
    :cond_0
    invoke-virtual {p2, p1, p3, p4}, Lbsh/BSHAllocationExpression;->constructFromEnclosingInstance(Ljava/lang/Object;Lbsh/CallStack;Lbsh/Interpreter;)Ljava/lang/Object;

    .line 34
    .line 35
    .line 36
    move-result-object p1

    .line 37
    return-object p1
.end method

.method private doProperty(ZLjava/lang/Object;Lbsh/CallStack;Lbsh/Interpreter;)Ljava/lang/Object;
    .locals 2

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
    invoke-virtual {p0, v0}, Lbsh/SimpleNode;->jjtGetChild(I)Lbsh/Node;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    invoke-interface {v0, p3, p4}, Lbsh/Node;->eval(Lbsh/CallStack;Lbsh/Interpreter;)Ljava/lang/Object;

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
    new-instance p1, Lbsh/LHS;

    .line 25
    .line 26
    check-cast p4, Ljava/lang/String;

    .line 27
    .line 28
    invoke-direct {p1, p2, p4}, Lbsh/LHS;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 29
    .line 30
    .line 31
    return-object p1

    .line 32
    :cond_0
    :try_start_0
    move-object p1, p4

    .line 33
    check-cast p1, Ljava/lang/String;

    .line 34
    .line 35
    invoke-static {p2, p1}, Lbsh/Reflect;->getObjectProperty(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 36
    .line 37
    .line 38
    move-result-object p1

    .line 39
    if-nez p1, :cond_1

    .line 40
    .line 41
    sget-object p1, Lbsh/Primitive;->NULL:Lbsh/Primitive;

    .line 42
    .line 43
    return-object p1

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
    move-result-object p1
    :try_end_0
    .catch Lbsh/ReflectError; {:try_start_0 .. :try_end_0} :catch_0

    .line 50
    return-object p1

    .line 51
    :goto_0
    new-instance p2, Lbsh/EvalError;

    .line 52
    .line 53
    new-instance v0, Ljava/lang/StringBuilder;

    .line 54
    .line 55
    const-string v1, "No such property: "

    .line 56
    .line 57
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 58
    .line 59
    .line 60
    invoke-virtual {v0, p4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 61
    .line 62
    .line 63
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 64
    .line 65
    .line 66
    move-result-object p4

    .line 67
    invoke-direct {p2, p4, p0, p3, p1}, Lbsh/EvalError;-><init>(Ljava/lang/String;Lbsh/Node;Lbsh/CallStack;Ljava/lang/Throwable;)V

    .line 68
    .line 69
    .line 70
    throw p2

    .line 71
    :cond_2
    new-instance p1, Lbsh/EvalError;

    .line 72
    .line 73
    const-string p2, "Property expression must be a String or identifier."

    .line 74
    .line 75
    invoke-direct {p1, p2, p0, p3}, Lbsh/EvalError;-><init>(Ljava/lang/String;Lbsh/Node;Lbsh/CallStack;)V

    .line 76
    .line 77
    .line 78
    throw p1

    .line 79
    :cond_3
    new-instance p1, Lbsh/EvalError;

    .line 80
    .line 81
    const-string p2, "Attempt to access property on a primitive"

    .line 82
    .line 83
    invoke-direct {p1, p2, p0, p3}, Lbsh/EvalError;-><init>(Ljava/lang/String;Lbsh/Node;Lbsh/CallStack;)V

    .line 84
    .line 85
    .line 86
    throw p1

    .line 87
    :cond_4
    new-instance p1, Lbsh/EvalError;

    .line 88
    .line 89
    const-string p2, "Attempt to access property on undefined variable or class name"

    .line 90
    .line 91
    invoke-direct {p1, p2, p0, p3}, Lbsh/EvalError;-><init>(Ljava/lang/String;Lbsh/Node;Lbsh/CallStack;)V

    .line 92
    .line 93
    .line 94
    throw p1
.end method

.method public static getIndexAux(Ljava/lang/Object;ILbsh/CallStack;Lbsh/Interpreter;Lbsh/Node;)I
    .locals 0

    .line 1
    :try_start_0
    invoke-interface {p4, p1}, Lbsh/Node;->jjtGetChild(I)Lbsh/Node;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    invoke-interface {p0, p2, p3}, Lbsh/Node;->eval(Lbsh/CallStack;Lbsh/Interpreter;)Ljava/lang/Object;

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
    invoke-static {p0, p3, p1}, Lbsh/Types;->castObject(Ljava/lang/Object;Ljava/lang/Class;I)Ljava/lang/Object;

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
    invoke-direct {p1, p3, p4, p2, p0}, Lbsh/EvalError;-><init>(Ljava/lang/String;Lbsh/Node;Lbsh/CallStack;Ljava/lang/Throwable;)V

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
    move-result-object p1

    .line 18
    return-object p1

    .line 19
    :cond_0
    new-instance p1, Lbsh/EvalException;

    .line 20
    .line 21
    const-string p2, "Can\'t assign .class"

    .line 22
    .line 23
    invoke-direct {p1, p2, p0, p3}, Lbsh/EvalException;-><init>(Ljava/lang/String;Lbsh/Node;Lbsh/CallStack;)V

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
    invoke-direct {p1, p2, p0, p3}, Lbsh/EvalException;-><init>(Ljava/lang/String;Lbsh/Node;Lbsh/CallStack;)V

    .line 32
    .line 33
    .line 34
    throw p1

    .line 35
    :cond_2
    instance-of v0, p1, Lbsh/Node;

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
    check-cast p1, Lbsh/Node;

    .line 51
    .line 52
    invoke-interface {p1, p3, p4}, Lbsh/Node;->eval(Lbsh/CallStack;Lbsh/Interpreter;)Ljava/lang/Object;

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
    invoke-virtual {p1, p0, p3}, Lbsh/UtilEvalError;->toEvalError(Lbsh/Node;Lbsh/CallStack;)Lbsh/EvalError;

    .line 70
    .line 71
    .line 72
    move-result-object p1

    .line 73
    throw p1

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
    invoke-direct {p0, p1}, Lbsh/BSHPrimarySuffix;->doMethodRef(Ljava/lang/Object;)Lbsh/BshLambda;

    .line 92
    .line 93
    .line 94
    move-result-object p1

    .line 95
    return-object p1

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
    move-result-object p1

    .line 110
    return-object p1

    .line 111
    :cond_8
    invoke-direct {p0, p2, p1, p3, p4}, Lbsh/BSHPrimarySuffix;->doProperty(ZLjava/lang/Object;Lbsh/CallStack;Lbsh/Interpreter;)Ljava/lang/Object;

    .line 112
    .line 113
    .line 114
    move-result-object p1

    .line 115
    return-object p1

    .line 116
    :cond_9
    invoke-direct {p0, p1, p2, p3, p4}, Lbsh/BSHPrimarySuffix;->doName(Ljava/lang/Object;ZLbsh/CallStack;Lbsh/Interpreter;)Ljava/lang/Object;

    .line 117
    .line 118
    .line 119
    move-result-object p1

    .line 120
    return-object p1

    .line 121
    :cond_a
    invoke-direct {p0, p1, p2, p3, p4}, Lbsh/BSHPrimarySuffix;->doIndex(Ljava/lang/Object;ZLbsh/CallStack;Lbsh/Interpreter;)Ljava/lang/Object;

    .line 122
    .line 123
    .line 124
    move-result-object p1
    :try_end_1
    .catch Lbsh/ReflectError; {:try_start_1 .. :try_end_1} :catch_1

    .line 125
    return-object p1

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
    invoke-direct {p2, p4, p0, p3, p1}, Lbsh/EvalError;-><init>(Ljava/lang/String;Lbsh/Node;Lbsh/CallStack;Ljava/lang/Throwable;)V

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
    iget-boolean v1, p0, Lbsh/BSHPrimarySuffix;->step:Z

    .line 52
    .line 53
    const-string v2, "]"

    .line 54
    .line 55
    invoke-static {v2, v0, v1}, Lp/a;->m(Ljava/lang/String;Ljava/lang/StringBuilder;Z)Ljava/lang/String;

    .line 56
    .line 57
    .line 58
    move-result-object v0

    .line 59
    return-object v0

    .line 60
    :cond_0
    const/4 v1, 0x2

    .line 61
    if-ne v0, v1, :cond_1

    .line 62
    .line 63
    new-instance v0, Ljava/lang/StringBuilder;

    .line 64
    .line 65
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 66
    .line 67
    .line 68
    invoke-super {p0}, Lbsh/SimpleNode;->toString()Ljava/lang/String;

    .line 69
    .line 70
    .line 71
    move-result-object v1

    .line 72
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 73
    .line 74
    .line 75
    const-string v1, ":NAME "

    .line 76
    .line 77
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 78
    .line 79
    .line 80
    iget-object v1, p0, Lbsh/BSHPrimarySuffix;->field:Ljava/lang/String;

    .line 81
    .line 82
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 83
    .line 84
    .line 85
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 86
    .line 87
    .line 88
    move-result-object v0

    .line 89
    return-object v0

    .line 90
    :cond_1
    const/4 v1, 0x3

    .line 91
    if-ne v0, v1, :cond_2

    .line 92
    .line 93
    new-instance v0, Ljava/lang/StringBuilder;

    .line 94
    .line 95
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 96
    .line 97
    .line 98
    invoke-super {p0}, Lbsh/SimpleNode;->toString()Ljava/lang/String;

    .line 99
    .line 100
    .line 101
    move-result-object v1

    .line 102
    const-string v2, ":PROPERTY {}"

    .line 103
    .line 104
    invoke-static {v0, v1, v2}, Leh/a;->r(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 105
    .line 106
    .line 107
    move-result-object v0

    .line 108
    return-object v0

    .line 109
    :cond_2
    const/4 v1, 0x4

    .line 110
    if-ne v0, v1, :cond_3

    .line 111
    .line 112
    new-instance v0, Ljava/lang/StringBuilder;

    .line 113
    .line 114
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 115
    .line 116
    .line 117
    invoke-super {p0}, Lbsh/SimpleNode;->toString()Ljava/lang/String;

    .line 118
    .line 119
    .line 120
    move-result-object v1

    .line 121
    const-string v2, ":NEW new"

    .line 122
    .line 123
    invoke-static {v0, v1, v2}, Leh/a;->r(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 124
    .line 125
    .line 126
    move-result-object v0

    .line 127
    return-object v0

    .line 128
    :cond_3
    const/4 v1, 0x6

    .line 129
    if-ne v0, v1, :cond_4

    .line 130
    .line 131
    new-instance v0, Ljava/lang/StringBuilder;

    .line 132
    .line 133
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 134
    .line 135
    .line 136
    invoke-super {p0}, Lbsh/SimpleNode;->toString()Ljava/lang/String;

    .line 137
    .line 138
    .line 139
    move-result-object v1

    .line 140
    const-string v2, ":CLASS class"

    .line 141
    .line 142
    invoke-static {v0, v1, v2}, Leh/a;->r(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 143
    .line 144
    .line 145
    move-result-object v0

    .line 146
    return-object v0

    .line 147
    :cond_4
    new-instance v0, Ljava/lang/StringBuilder;

    .line 148
    .line 149
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 150
    .line 151
    .line 152
    invoke-super {p0}, Lbsh/SimpleNode;->toString()Ljava/lang/String;

    .line 153
    .line 154
    .line 155
    move-result-object v1

    .line 156
    const-string v2, ":NO OPERATION"

    .line 157
    .line 158
    invoke-static {v0, v1, v2}, Leh/a;->r(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 159
    .line 160
    .line 161
    move-result-object v0

    .line 162
    return-object v0
.end method
