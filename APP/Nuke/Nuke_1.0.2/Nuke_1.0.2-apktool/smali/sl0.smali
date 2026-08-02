.class public final Lsl0;
.super Ljava/lang/Object;
.source "r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4"

# interfaces
.implements Ljava/util/Comparator;


# static fields
.field public static final b:Lsl0;

.field public static final c:Lsl0;

.field public static final d:Lsl0;

.field public static final e:Lsl0;

.field public static final f:Lsl0;


# instance fields
.field public final synthetic a:I


# direct methods
.method static synthetic constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Lsl0;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, v1}, Lsl0;-><init>(I)V

    .line 5
    .line 6
    .line 7
    sput-object v0, Lsl0;->b:Lsl0;

    .line 8
    .line 9
    new-instance v0, Lsl0;

    .line 10
    .line 11
    const/4 v1, 0x1

    .line 12
    invoke-direct {v0, v1}, Lsl0;-><init>(I)V

    .line 13
    .line 14
    .line 15
    sput-object v0, Lsl0;->c:Lsl0;

    .line 16
    .line 17
    new-instance v0, Lsl0;

    .line 18
    .line 19
    const/4 v1, 0x2

    .line 20
    invoke-direct {v0, v1}, Lsl0;-><init>(I)V

    .line 21
    .line 22
    .line 23
    sput-object v0, Lsl0;->d:Lsl0;

    .line 24
    .line 25
    new-instance v0, Lsl0;

    .line 26
    .line 27
    const/4 v1, 0x3

    .line 28
    invoke-direct {v0, v1}, Lsl0;-><init>(I)V

    .line 29
    .line 30
    .line 31
    sput-object v0, Lsl0;->e:Lsl0;

    .line 32
    .line 33
    new-instance v0, Lsl0;

    .line 34
    .line 35
    const/4 v1, 0x4

    .line 36
    invoke-direct {v0, v1}, Lsl0;-><init>(I)V

    .line 37
    .line 38
    .line 39
    sput-object v0, Lsl0;->f:Lsl0;

    .line 40
    .line 41
    return-void
.end method

.method public synthetic constructor <init>(I)V
    .locals 0

    .line 1
    iput p1, p0, Lsl0;->a:I

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final compare(Ljava/lang/Object;Ljava/lang/Object;)I
    .locals 7

    .line 1
    iget p0, p0, Lsl0;->a:I

    .line 2
    .line 3
    const/4 v0, 0x1

    .line 4
    const/4 v1, -0x1

    .line 5
    const/4 v2, 0x0

    .line 6
    packed-switch p0, :pswitch_data_0

    .line 7
    .line 8
    .line 9
    check-cast p1, Ljc3;

    .line 10
    .line 11
    iget-object p0, p1, Ljc3;->d:Lsc3;

    .line 12
    .line 13
    invoke-virtual {p0}, Ljava/lang/Enum;->ordinal()I

    .line 14
    .line 15
    .line 16
    move-result p0

    .line 17
    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 18
    .line 19
    .line 20
    move-result-object p0

    .line 21
    check-cast p2, Ljc3;

    .line 22
    .line 23
    iget-object p1, p2, Ljc3;->d:Lsc3;

    .line 24
    .line 25
    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    .line 26
    .line 27
    .line 28
    move-result p1

    .line 29
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 30
    .line 31
    .line 32
    move-result-object p1

    .line 33
    invoke-virtual {p0, p1}, Ljava/lang/Integer;->compareTo(Ljava/lang/Object;)I

    .line 34
    .line 35
    .line 36
    move-result p0

    .line 37
    return p0

    .line 38
    :pswitch_0
    check-cast p1, Ltk2;

    .line 39
    .line 40
    iget-object p0, p1, Ltk2;->a:Ljava/lang/String;

    .line 41
    .line 42
    check-cast p2, Ltk2;

    .line 43
    .line 44
    iget-object p1, p2, Ltk2;->a:Ljava/lang/String;

    .line 45
    .line 46
    invoke-static {p0, p1}, Lgf1;->o(Ljava/lang/Comparable;Ljava/lang/Comparable;)I

    .line 47
    .line 48
    .line 49
    move-result p0

    .line 50
    return p0

    .line 51
    :pswitch_1
    check-cast p1, Lme1;

    .line 52
    .line 53
    iget-object p0, p1, Lme1;->a:Ljava/lang/String;

    .line 54
    .line 55
    check-cast p2, Lme1;

    .line 56
    .line 57
    iget-object p1, p2, Lme1;->a:Ljava/lang/String;

    .line 58
    .line 59
    invoke-static {p0, p1}, Lgf1;->o(Ljava/lang/Comparable;Ljava/lang/Comparable;)I

    .line 60
    .line 61
    .line 62
    move-result p0

    .line 63
    return p0

    .line 64
    :pswitch_2
    check-cast p1, Lzf2;

    .line 65
    .line 66
    iget-object p0, p1, Lzf2;->a:Ljava/io/File;

    .line 67
    .line 68
    invoke-virtual {p0}, Ljava/io/File;->getName()Ljava/lang/String;

    .line 69
    .line 70
    .line 71
    move-result-object p0

    .line 72
    check-cast p2, Lzf2;

    .line 73
    .line 74
    iget-object p1, p2, Lzf2;->a:Ljava/io/File;

    .line 75
    .line 76
    invoke-virtual {p1}, Ljava/io/File;->getName()Ljava/lang/String;

    .line 77
    .line 78
    .line 79
    move-result-object p1

    .line 80
    invoke-static {p0, p1}, Lgf1;->o(Ljava/lang/Comparable;Ljava/lang/Comparable;)I

    .line 81
    .line 82
    .line 83
    move-result p0

    .line 84
    return p0

    .line 85
    :pswitch_3
    check-cast p1, Ljava/io/File;

    .line 86
    .line 87
    invoke-virtual {p1}, Ljava/io/File;->getName()Ljava/lang/String;

    .line 88
    .line 89
    .line 90
    move-result-object p0

    .line 91
    check-cast p2, Ljava/io/File;

    .line 92
    .line 93
    invoke-virtual {p2}, Ljava/io/File;->getName()Ljava/lang/String;

    .line 94
    .line 95
    .line 96
    move-result-object p1

    .line 97
    invoke-static {p0, p1}, Lgf1;->o(Ljava/lang/Comparable;Ljava/lang/Comparable;)I

    .line 98
    .line 99
    .line 100
    move-result p0

    .line 101
    return p0

    .line 102
    :pswitch_4
    check-cast p1, Lz80;

    .line 103
    .line 104
    iget-object p0, p1, Lz80;->b:Lth2;

    .line 105
    .line 106
    iget-object p0, p0, Lth2;->c:Ljava/lang/String;

    .line 107
    .line 108
    check-cast p2, Lz80;

    .line 109
    .line 110
    iget-object p1, p2, Lz80;->b:Lth2;

    .line 111
    .line 112
    iget-object p1, p1, Lth2;->c:Ljava/lang/String;

    .line 113
    .line 114
    invoke-static {p0, p1}, Lgf1;->o(Ljava/lang/Comparable;Ljava/lang/Comparable;)I

    .line 115
    .line 116
    .line 117
    move-result p0

    .line 118
    return p0

    .line 119
    :pswitch_5
    check-cast p1, Ljava/io/File;

    .line 120
    .line 121
    invoke-virtual {p1}, Ljava/io/File;->getName()Ljava/lang/String;

    .line 122
    .line 123
    .line 124
    move-result-object p0

    .line 125
    check-cast p2, Ljava/io/File;

    .line 126
    .line 127
    invoke-virtual {p2}, Ljava/io/File;->getName()Ljava/lang/String;

    .line 128
    .line 129
    .line 130
    move-result-object p1

    .line 131
    invoke-static {p0, p1}, Lgf1;->o(Ljava/lang/Comparable;Ljava/lang/Comparable;)I

    .line 132
    .line 133
    .line 134
    move-result p0

    .line 135
    return p0

    .line 136
    :pswitch_6
    check-cast p1, Ljava/util/Map$Entry;

    .line 137
    .line 138
    invoke-interface {p1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 139
    .line 140
    .line 141
    move-result-object p0

    .line 142
    check-cast p0, Ljava/lang/String;

    .line 143
    .line 144
    check-cast p2, Ljava/util/Map$Entry;

    .line 145
    .line 146
    invoke-interface {p2}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 147
    .line 148
    .line 149
    move-result-object p1

    .line 150
    check-cast p1, Ljava/lang/String;

    .line 151
    .line 152
    invoke-static {p0, p1}, Lgf1;->o(Ljava/lang/Comparable;Ljava/lang/Comparable;)I

    .line 153
    .line 154
    .line 155
    move-result p0

    .line 156
    return p0

    .line 157
    :pswitch_7
    check-cast p1, Ljava/util/Map$Entry;

    .line 158
    .line 159
    invoke-interface {p1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 160
    .line 161
    .line 162
    move-result-object p0

    .line 163
    check-cast p0, Ljava/lang/Number;

    .line 164
    .line 165
    invoke-virtual {p0}, Ljava/lang/Number;->longValue()J

    .line 166
    .line 167
    .line 168
    move-result-wide p0

    .line 169
    invoke-static {p0, p1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 170
    .line 171
    .line 172
    move-result-object p0

    .line 173
    check-cast p2, Ljava/util/Map$Entry;

    .line 174
    .line 175
    invoke-interface {p2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 176
    .line 177
    .line 178
    move-result-object p1

    .line 179
    check-cast p1, Ljava/lang/Number;

    .line 180
    .line 181
    invoke-virtual {p1}, Ljava/lang/Number;->longValue()J

    .line 182
    .line 183
    .line 184
    move-result-wide p1

    .line 185
    invoke-static {p1, p2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 186
    .line 187
    .line 188
    move-result-object p1

    .line 189
    invoke-interface {p0, p1}, Ljava/lang/Comparable;->compareTo(Ljava/lang/Object;)I

    .line 190
    .line 191
    .line 192
    move-result p0

    .line 193
    return p0

    .line 194
    :pswitch_8
    check-cast p1, Ljava/lang/reflect/Method;

    .line 195
    .line 196
    check-cast p2, Ljava/lang/reflect/Method;

    .line 197
    .line 198
    new-instance p0, Ljava/lang/StringBuilder;

    .line 199
    .line 200
    invoke-direct {p0}, Ljava/lang/StringBuilder;-><init>()V

    .line 201
    .line 202
    .line 203
    invoke-virtual {p1}, Ljava/lang/reflect/Method;->getDeclaringClass()Ljava/lang/Class;

    .line 204
    .line 205
    .line 206
    move-result-object v0

    .line 207
    invoke-virtual {p0, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 208
    .line 209
    .line 210
    invoke-virtual {p1}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    .line 211
    .line 212
    .line 213
    move-result-object v0

    .line 214
    invoke-virtual {p0, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 215
    .line 216
    .line 217
    invoke-virtual {p1}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 218
    .line 219
    .line 220
    move-result-object v0

    .line 221
    invoke-static {v0}, Ljava/util/Arrays;->toString([Ljava/lang/Object;)Ljava/lang/String;

    .line 222
    .line 223
    .line 224
    move-result-object v0

    .line 225
    invoke-virtual {p0, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 226
    .line 227
    .line 228
    invoke-virtual {p1}, Ljava/lang/reflect/Method;->getReturnType()Ljava/lang/Class;

    .line 229
    .line 230
    .line 231
    move-result-object p1

    .line 232
    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 233
    .line 234
    .line 235
    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 236
    .line 237
    .line 238
    move-result-object p0

    .line 239
    new-instance p1, Ljava/lang/StringBuilder;

    .line 240
    .line 241
    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    .line 242
    .line 243
    .line 244
    invoke-virtual {p2}, Ljava/lang/reflect/Method;->getDeclaringClass()Ljava/lang/Class;

    .line 245
    .line 246
    .line 247
    move-result-object v0

    .line 248
    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 249
    .line 250
    .line 251
    invoke-virtual {p2}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    .line 252
    .line 253
    .line 254
    move-result-object v0

    .line 255
    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 256
    .line 257
    .line 258
    invoke-virtual {p2}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 259
    .line 260
    .line 261
    move-result-object v0

    .line 262
    invoke-static {v0}, Ljava/util/Arrays;->toString([Ljava/lang/Object;)Ljava/lang/String;

    .line 263
    .line 264
    .line 265
    move-result-object v0

    .line 266
    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 267
    .line 268
    .line 269
    invoke-virtual {p2}, Ljava/lang/reflect/Method;->getReturnType()Ljava/lang/Class;

    .line 270
    .line 271
    .line 272
    move-result-object p2

    .line 273
    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 274
    .line 275
    .line 276
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 277
    .line 278
    .line 279
    move-result-object p1

    .line 280
    invoke-virtual {p0, p1}, Ljava/lang/String;->compareTo(Ljava/lang/String;)I

    .line 281
    .line 282
    .line 283
    move-result p0

    .line 284
    return p0

    .line 285
    :pswitch_9
    check-cast p1, Lnuke/module/wechat/ai/AIModelInfo;

    .line 286
    .line 287
    invoke-virtual {p1}, Lnuke/module/wechat/ai/AIModelInfo;->getId()Ljava/lang/String;

    .line 288
    .line 289
    .line 290
    move-result-object p0

    .line 291
    sget-object p1, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    .line 292
    .line 293
    invoke-virtual {p0, p1}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    .line 294
    .line 295
    .line 296
    move-result-object p0

    .line 297
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 298
    .line 299
    .line 300
    check-cast p2, Lnuke/module/wechat/ai/AIModelInfo;

    .line 301
    .line 302
    invoke-virtual {p2}, Lnuke/module/wechat/ai/AIModelInfo;->getId()Ljava/lang/String;

    .line 303
    .line 304
    .line 305
    move-result-object p2

    .line 306
    invoke-virtual {p2, p1}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    .line 307
    .line 308
    .line 309
    move-result-object p1

    .line 310
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 311
    .line 312
    .line 313
    invoke-interface {p0, p1}, Ljava/lang/Comparable;->compareTo(Ljava/lang/Object;)I

    .line 314
    .line 315
    .line 316
    move-result p0

    .line 317
    return p0

    .line 318
    :pswitch_a
    check-cast p1, Lxs1;

    .line 319
    .line 320
    check-cast p2, Lxs1;

    .line 321
    .line 322
    invoke-virtual {p1}, Lf21;->b()Lg21;

    .line 323
    .line 324
    .line 325
    move-result-object p0

    .line 326
    invoke-virtual {p2}, Lf21;->b()Lg21;

    .line 327
    .line 328
    .line 329
    move-result-object p1

    .line 330
    invoke-virtual {p0, p1}, Ljava/lang/Enum;->compareTo(Ljava/lang/Enum;)I

    .line 331
    .line 332
    .line 333
    move-result p0

    .line 334
    return p0

    .line 335
    :pswitch_b
    check-cast p1, Ljava/lang/Comparable;

    .line 336
    .line 337
    check-cast p2, Ljava/lang/Comparable;

    .line 338
    .line 339
    invoke-interface {p1, p2}, Ljava/lang/Comparable;->compareTo(Ljava/lang/Object;)I

    .line 340
    .line 341
    .line 342
    move-result p0

    .line 343
    return p0

    .line 344
    :pswitch_c
    check-cast p1, Ljava/io/File;

    .line 345
    .line 346
    invoke-virtual {p1}, Ljava/io/File;->getName()Ljava/lang/String;

    .line 347
    .line 348
    .line 349
    move-result-object p0

    .line 350
    check-cast p2, Ljava/io/File;

    .line 351
    .line 352
    invoke-virtual {p2}, Ljava/io/File;->getName()Ljava/lang/String;

    .line 353
    .line 354
    .line 355
    move-result-object p1

    .line 356
    invoke-static {p0, p1}, Lgf1;->o(Ljava/lang/Comparable;Ljava/lang/Comparable;)I

    .line 357
    .line 358
    .line 359
    move-result p0

    .line 360
    return p0

    .line 361
    :pswitch_d
    check-cast p1, Lug1;

    .line 362
    .line 363
    iget-object p0, p1, Lug1;->k:Ljava/lang/String;

    .line 364
    .line 365
    check-cast p2, Lug1;

    .line 366
    .line 367
    iget-object p1, p2, Lug1;->k:Ljava/lang/String;

    .line 368
    .line 369
    invoke-static {p0, p1}, Lgf1;->o(Ljava/lang/Comparable;Ljava/lang/Comparable;)I

    .line 370
    .line 371
    .line 372
    move-result p0

    .line 373
    return p0

    .line 374
    :pswitch_e
    check-cast p1, Lus;

    .line 375
    .line 376
    iget-object p0, p1, Lus;->j:Ljava/lang/String;

    .line 377
    .line 378
    check-cast p2, Lus;

    .line 379
    .line 380
    iget-object p1, p2, Lus;->j:Ljava/lang/String;

    .line 381
    .line 382
    invoke-static {p0, p1}, Lgf1;->o(Ljava/lang/Comparable;Ljava/lang/Comparable;)I

    .line 383
    .line 384
    .line 385
    move-result p0

    .line 386
    return p0

    .line 387
    :pswitch_f
    check-cast p1, Lr61;

    .line 388
    .line 389
    check-cast p2, Lr61;

    .line 390
    .line 391
    iget p0, p1, Lr61;->w:I

    .line 392
    .line 393
    iget v0, p2, Lr61;->w:I

    .line 394
    .line 395
    invoke-static {p0, v0}, Lt11;->o(II)I

    .line 396
    .line 397
    .line 398
    move-result p0

    .line 399
    if-eqz p0, :cond_0

    .line 400
    .line 401
    goto :goto_0

    .line 402
    :cond_0
    invoke-virtual {p1}, Ljava/lang/Object;->hashCode()I

    .line 403
    .line 404
    .line 405
    move-result p0

    .line 406
    invoke-virtual {p2}, Ljava/lang/Object;->hashCode()I

    .line 407
    .line 408
    .line 409
    move-result p1

    .line 410
    invoke-static {p0, p1}, Lt11;->o(II)I

    .line 411
    .line 412
    .line 413
    move-result p0

    .line 414
    :goto_0
    return p0

    .line 415
    :pswitch_10
    check-cast p1, Ljava/lang/String;

    .line 416
    .line 417
    check-cast p2, Ljava/lang/String;

    .line 418
    .line 419
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 420
    .line 421
    .line 422
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 423
    .line 424
    .line 425
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    .line 426
    .line 427
    .line 428
    move-result p0

    .line 429
    invoke-virtual {p2}, Ljava/lang/String;->length()I

    .line 430
    .line 431
    .line 432
    move-result v3

    .line 433
    invoke-static {p0, v3}, Ljava/lang/Math;->min(II)I

    .line 434
    .line 435
    .line 436
    move-result p0

    .line 437
    const/4 v3, 0x4

    .line 438
    :goto_1
    if-ge v3, p0, :cond_2

    .line 439
    .line 440
    invoke-virtual {p1, v3}, Ljava/lang/String;->charAt(I)C

    .line 441
    .line 442
    .line 443
    move-result v4

    .line 444
    invoke-virtual {p2, v3}, Ljava/lang/String;->charAt(I)C

    .line 445
    .line 446
    .line 447
    move-result v5

    .line 448
    if-eq v4, v5, :cond_1

    .line 449
    .line 450
    invoke-static {v4, v5}, Lt11;->o(II)I

    .line 451
    .line 452
    .line 453
    move-result p0

    .line 454
    if-gez p0, :cond_4

    .line 455
    .line 456
    goto :goto_2

    .line 457
    :cond_1
    add-int/lit8 v3, v3, 0x1

    .line 458
    .line 459
    goto :goto_1

    .line 460
    :cond_2
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    .line 461
    .line 462
    .line 463
    move-result p0

    .line 464
    invoke-virtual {p2}, Ljava/lang/String;->length()I

    .line 465
    .line 466
    .line 467
    move-result p1

    .line 468
    if-eq p0, p1, :cond_3

    .line 469
    .line 470
    if-ge p0, p1, :cond_4

    .line 471
    .line 472
    :goto_2
    move v0, v1

    .line 473
    goto :goto_3

    .line 474
    :cond_3
    move v0, v2

    .line 475
    :cond_4
    :goto_3
    return v0

    .line 476
    :pswitch_11
    check-cast p1, Lg33;

    .line 477
    .line 478
    iget-boolean p0, p1, Lg33;->d:Z

    .line 479
    .line 480
    invoke-static {p0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 481
    .line 482
    .line 483
    move-result-object p0

    .line 484
    check-cast p2, Lg33;

    .line 485
    .line 486
    iget-boolean p1, p2, Lg33;->d:Z

    .line 487
    .line 488
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 489
    .line 490
    .line 491
    move-result-object p1

    .line 492
    invoke-virtual {p0, p1}, Ljava/lang/Boolean;->compareTo(Ljava/lang/Object;)I

    .line 493
    .line 494
    .line 495
    move-result p0

    .line 496
    return p0

    .line 497
    :pswitch_12
    check-cast p1, Ls62;

    .line 498
    .line 499
    iget-boolean p0, p1, Ls62;->d:Z

    .line 500
    .line 501
    invoke-static {p0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 502
    .line 503
    .line 504
    move-result-object p0

    .line 505
    check-cast p2, Ls62;

    .line 506
    .line 507
    iget-boolean p1, p2, Ls62;->d:Z

    .line 508
    .line 509
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 510
    .line 511
    .line 512
    move-result-object p1

    .line 513
    invoke-virtual {p0, p1}, Ljava/lang/Boolean;->compareTo(Ljava/lang/Object;)I

    .line 514
    .line 515
    .line 516
    move-result p0

    .line 517
    return p0

    .line 518
    :pswitch_13
    check-cast p1, Lrd;

    .line 519
    .line 520
    iget p0, p1, Lrd;->b:I

    .line 521
    .line 522
    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 523
    .line 524
    .line 525
    move-result-object p0

    .line 526
    check-cast p2, Lrd;

    .line 527
    .line 528
    iget p1, p2, Lrd;->b:I

    .line 529
    .line 530
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 531
    .line 532
    .line 533
    move-result-object p1

    .line 534
    invoke-interface {p0, p1}, Ljava/lang/Comparable;->compareTo(Ljava/lang/Object;)I

    .line 535
    .line 536
    .line 537
    move-result p0

    .line 538
    return p0

    .line 539
    :pswitch_14
    check-cast p1, Lrd;

    .line 540
    .line 541
    iget p0, p1, Lrd;->b:I

    .line 542
    .line 543
    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 544
    .line 545
    .line 546
    move-result-object p0

    .line 547
    check-cast p2, Lrd;

    .line 548
    .line 549
    iget p1, p2, Lrd;->b:I

    .line 550
    .line 551
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 552
    .line 553
    .line 554
    move-result-object p1

    .line 555
    invoke-interface {p0, p1}, Ljava/lang/Comparable;->compareTo(Ljava/lang/Object;)I

    .line 556
    .line 557
    .line 558
    move-result p0

    .line 559
    return p0

    .line 560
    :pswitch_15
    check-cast p1, Low1;

    .line 561
    .line 562
    check-cast p2, Low1;

    .line 563
    .line 564
    iget-object p0, p1, Low1;->h:Ljava/lang/Object;

    .line 565
    .line 566
    check-cast p0, Lo62;

    .line 567
    .line 568
    iget p0, p0, Lo62;->b:F

    .line 569
    .line 570
    iget-object v0, p2, Low1;->h:Ljava/lang/Object;

    .line 571
    .line 572
    check-cast v0, Lo62;

    .line 573
    .line 574
    iget v0, v0, Lo62;->b:F

    .line 575
    .line 576
    invoke-static {p0, v0}, Ljava/lang/Float;->compare(FF)I

    .line 577
    .line 578
    .line 579
    move-result p0

    .line 580
    if-eqz p0, :cond_5

    .line 581
    .line 582
    goto :goto_4

    .line 583
    :cond_5
    iget-object p0, p1, Low1;->h:Ljava/lang/Object;

    .line 584
    .line 585
    check-cast p0, Lo62;

    .line 586
    .line 587
    iget p0, p0, Lo62;->d:F

    .line 588
    .line 589
    iget-object p1, p2, Low1;->h:Ljava/lang/Object;

    .line 590
    .line 591
    check-cast p1, Lo62;

    .line 592
    .line 593
    iget p1, p1, Lo62;->d:F

    .line 594
    .line 595
    invoke-static {p0, p1}, Ljava/lang/Float;->compare(FF)I

    .line 596
    .line 597
    .line 598
    move-result p0

    .line 599
    :goto_4
    return p0

    .line 600
    :pswitch_16
    check-cast p1, Lqn2;

    .line 601
    .line 602
    check-cast p2, Lqn2;

    .line 603
    .line 604
    invoke-virtual {p1}, Lqn2;->h()Lo62;

    .line 605
    .line 606
    .line 607
    move-result-object p0

    .line 608
    invoke-virtual {p2}, Lqn2;->h()Lo62;

    .line 609
    .line 610
    .line 611
    move-result-object p1

    .line 612
    iget p2, p1, Lo62;->c:F

    .line 613
    .line 614
    iget v0, p0, Lo62;->c:F

    .line 615
    .line 616
    invoke-static {p2, v0}, Ljava/lang/Float;->compare(FF)I

    .line 617
    .line 618
    .line 619
    move-result p2

    .line 620
    if-eqz p2, :cond_6

    .line 621
    .line 622
    goto :goto_5

    .line 623
    :cond_6
    iget p2, p0, Lo62;->b:F

    .line 624
    .line 625
    iget v0, p1, Lo62;->b:F

    .line 626
    .line 627
    invoke-static {p2, v0}, Ljava/lang/Float;->compare(FF)I

    .line 628
    .line 629
    .line 630
    move-result p2

    .line 631
    if-eqz p2, :cond_7

    .line 632
    .line 633
    goto :goto_5

    .line 634
    :cond_7
    iget p2, p0, Lo62;->d:F

    .line 635
    .line 636
    iget v0, p1, Lo62;->d:F

    .line 637
    .line 638
    invoke-static {p2, v0}, Ljava/lang/Float;->compare(FF)I

    .line 639
    .line 640
    .line 641
    move-result p2

    .line 642
    if-eqz p2, :cond_8

    .line 643
    .line 644
    goto :goto_5

    .line 645
    :cond_8
    iget p1, p1, Lo62;->a:F

    .line 646
    .line 647
    iget p0, p0, Lo62;->a:F

    .line 648
    .line 649
    invoke-static {p1, p0}, Ljava/lang/Float;->compare(FF)I

    .line 650
    .line 651
    .line 652
    move-result p2

    .line 653
    :goto_5
    return p2

    .line 654
    :pswitch_17
    check-cast p1, Lr61;

    .line 655
    .line 656
    check-cast p2, Lr61;

    .line 657
    .line 658
    iget p0, p2, Lr61;->w:I

    .line 659
    .line 660
    iget v0, p1, Lr61;->w:I

    .line 661
    .line 662
    invoke-static {p0, v0}, Lt11;->o(II)I

    .line 663
    .line 664
    .line 665
    move-result p0

    .line 666
    if-eqz p0, :cond_9

    .line 667
    .line 668
    goto :goto_6

    .line 669
    :cond_9
    invoke-virtual {p1}, Ljava/lang/Object;->hashCode()I

    .line 670
    .line 671
    .line 672
    move-result p0

    .line 673
    invoke-virtual {p2}, Ljava/lang/Object;->hashCode()I

    .line 674
    .line 675
    .line 676
    move-result p1

    .line 677
    invoke-static {p0, p1}, Lt11;->o(II)I

    .line 678
    .line 679
    .line 680
    move-result p0

    .line 681
    :goto_6
    return p0

    .line 682
    :pswitch_18
    check-cast p1, Lqn2;

    .line 683
    .line 684
    check-cast p2, Lqn2;

    .line 685
    .line 686
    invoke-virtual {p1}, Lqn2;->h()Lo62;

    .line 687
    .line 688
    .line 689
    move-result-object p0

    .line 690
    invoke-virtual {p2}, Lqn2;->h()Lo62;

    .line 691
    .line 692
    .line 693
    move-result-object p1

    .line 694
    iget p2, p0, Lo62;->a:F

    .line 695
    .line 696
    iget v0, p1, Lo62;->a:F

    .line 697
    .line 698
    invoke-static {p2, v0}, Ljava/lang/Float;->compare(FF)I

    .line 699
    .line 700
    .line 701
    move-result p2

    .line 702
    if-eqz p2, :cond_a

    .line 703
    .line 704
    goto :goto_7

    .line 705
    :cond_a
    iget p2, p0, Lo62;->b:F

    .line 706
    .line 707
    iget v0, p1, Lo62;->b:F

    .line 708
    .line 709
    invoke-static {p2, v0}, Ljava/lang/Float;->compare(FF)I

    .line 710
    .line 711
    .line 712
    move-result p2

    .line 713
    if-eqz p2, :cond_b

    .line 714
    .line 715
    goto :goto_7

    .line 716
    :cond_b
    iget p2, p0, Lo62;->d:F

    .line 717
    .line 718
    iget v0, p1, Lo62;->d:F

    .line 719
    .line 720
    invoke-static {p2, v0}, Ljava/lang/Float;->compare(FF)I

    .line 721
    .line 722
    .line 723
    move-result p2

    .line 724
    if-eqz p2, :cond_c

    .line 725
    .line 726
    goto :goto_7

    .line 727
    :cond_c
    iget p0, p0, Lo62;->c:F

    .line 728
    .line 729
    iget p1, p1, Lo62;->c:F

    .line 730
    .line 731
    invoke-static {p0, p1}, Ljava/lang/Float;->compare(FF)I

    .line 732
    .line 733
    .line 734
    move-result p2

    .line 735
    :goto_7
    return p2

    .line 736
    :pswitch_19
    check-cast p1, Lpl0;

    .line 737
    .line 738
    check-cast p2, Lpl0;

    .line 739
    .line 740
    invoke-static {p1}, Lrp0;->h0(Lpl0;)Z

    .line 741
    .line 742
    .line 743
    move-result p0

    .line 744
    if-eqz p0, :cond_18

    .line 745
    .line 746
    invoke-static {p2}, Lrp0;->h0(Lpl0;)Z

    .line 747
    .line 748
    .line 749
    move-result p0

    .line 750
    if-nez p0, :cond_d

    .line 751
    .line 752
    goto/16 :goto_c

    .line 753
    .line 754
    :cond_d
    invoke-static {p1}, Lsp0;->c0(Lt60;)Lr61;

    .line 755
    .line 756
    .line 757
    move-result-object p0

    .line 758
    invoke-static {p2}, Lsp0;->c0(Lt60;)Lr61;

    .line 759
    .line 760
    .line 761
    move-result-object p1

    .line 762
    invoke-static {p0, p1}, Lt11;->l(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 763
    .line 764
    .line 765
    move-result p2

    .line 766
    if-eqz p2, :cond_e

    .line 767
    .line 768
    goto/16 :goto_b

    .line 769
    .line 770
    :cond_e
    const/16 p2, 0x10

    .line 771
    .line 772
    new-array v1, p2, [Lr61;

    .line 773
    .line 774
    move v3, v2

    .line 775
    :goto_8
    if-eqz p0, :cond_11

    .line 776
    .line 777
    add-int/lit8 v4, v3, 0x1

    .line 778
    .line 779
    array-length v5, v1

    .line 780
    if-ge v5, v4, :cond_f

    .line 781
    .line 782
    array-length v5, v1

    .line 783
    mul-int/lit8 v6, v5, 0x2

    .line 784
    .line 785
    invoke-static {v4, v6}, Ljava/lang/Math;->max(II)I

    .line 786
    .line 787
    .line 788
    move-result v4

    .line 789
    new-array v4, v4, [Ljava/lang/Object;

    .line 790
    .line 791
    invoke-static {v1, v2, v4, v2, v5}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 792
    .line 793
    .line 794
    move-object v1, v4

    .line 795
    :cond_f
    if-eqz v3, :cond_10

    .line 796
    .line 797
    const/4 v4, 0x0

    .line 798
    add-int/2addr v4, v0

    .line 799
    add-int/lit8 v5, v3, 0x0

    .line 800
    .line 801
    invoke-static {v1, v2, v1, v4, v5}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 802
    .line 803
    .line 804
    :cond_10
    aput-object p0, v1, v2

    .line 805
    .line 806
    add-int/lit8 v3, v3, 0x1

    .line 807
    .line 808
    invoke-virtual {p0}, Lr61;->u()Lr61;

    .line 809
    .line 810
    .line 811
    move-result-object p0

    .line 812
    goto :goto_8

    .line 813
    :cond_11
    new-array p0, p2, [Lr61;

    .line 814
    .line 815
    move p2, v2

    .line 816
    :goto_9
    if-eqz p1, :cond_14

    .line 817
    .line 818
    add-int/lit8 v4, p2, 0x1

    .line 819
    .line 820
    array-length v5, p0

    .line 821
    if-ge v5, v4, :cond_12

    .line 822
    .line 823
    array-length v5, p0

    .line 824
    mul-int/lit8 v6, v5, 0x2

    .line 825
    .line 826
    invoke-static {v4, v6}, Ljava/lang/Math;->max(II)I

    .line 827
    .line 828
    .line 829
    move-result v4

    .line 830
    new-array v4, v4, [Ljava/lang/Object;

    .line 831
    .line 832
    invoke-static {p0, v2, v4, v2, v5}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 833
    .line 834
    .line 835
    move-object p0, v4

    .line 836
    :cond_12
    if-eqz p2, :cond_13

    .line 837
    .line 838
    const/4 v4, 0x0

    .line 839
    add-int/2addr v4, v0

    .line 840
    add-int/lit8 v5, p2, 0x0

    .line 841
    .line 842
    invoke-static {p0, v2, p0, v4, v5}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 843
    .line 844
    .line 845
    :cond_13
    aput-object p1, p0, v2

    .line 846
    .line 847
    add-int/lit8 p2, p2, 0x1

    .line 848
    .line 849
    invoke-virtual {p1}, Lr61;->u()Lr61;

    .line 850
    .line 851
    .line 852
    move-result-object p1

    .line 853
    goto :goto_9

    .line 854
    :cond_14
    sub-int/2addr v3, v0

    .line 855
    sub-int/2addr p2, v0

    .line 856
    invoke-static {v3, p2}, Ljava/lang/Math;->min(II)I

    .line 857
    .line 858
    .line 859
    move-result p1

    .line 860
    if-ltz p1, :cond_16

    .line 861
    .line 862
    move p2, v2

    .line 863
    :goto_a
    aget-object v0, v1, p2

    .line 864
    .line 865
    aget-object v3, p0, p2

    .line 866
    .line 867
    invoke-static {v0, v3}, Lt11;->l(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 868
    .line 869
    .line 870
    move-result v0

    .line 871
    if-nez v0, :cond_15

    .line 872
    .line 873
    aget-object p1, v1, p2

    .line 874
    .line 875
    check-cast p1, Lr61;

    .line 876
    .line 877
    invoke-virtual {p1}, Lr61;->v()I

    .line 878
    .line 879
    .line 880
    move-result p1

    .line 881
    aget-object p0, p0, p2

    .line 882
    .line 883
    check-cast p0, Lr61;

    .line 884
    .line 885
    invoke-virtual {p0}, Lr61;->v()I

    .line 886
    .line 887
    .line 888
    move-result p0

    .line 889
    invoke-static {p1, p0}, Lt11;->o(II)I

    .line 890
    .line 891
    .line 892
    move-result v0

    .line 893
    goto :goto_d

    .line 894
    :cond_15
    if-eq p2, p1, :cond_16

    .line 895
    .line 896
    add-int/lit8 p2, p2, 0x1

    .line 897
    .line 898
    goto :goto_a

    .line 899
    :cond_16
    const-string p0, "Could not find a common ancestor between the two FocusModifiers."

    .line 900
    .line 901
    invoke-static {p0}, Ls;->l(Ljava/lang/String;)V

    .line 902
    .line 903
    .line 904
    :cond_17
    :goto_b
    move v0, v2

    .line 905
    goto :goto_d

    .line 906
    :cond_18
    :goto_c
    invoke-static {p1}, Lrp0;->h0(Lpl0;)Z

    .line 907
    .line 908
    .line 909
    move-result p0

    .line 910
    if-eqz p0, :cond_19

    .line 911
    .line 912
    move v0, v1

    .line 913
    goto :goto_d

    .line 914
    :cond_19
    invoke-static {p2}, Lrp0;->h0(Lpl0;)Z

    .line 915
    .line 916
    .line 917
    move-result p0

    .line 918
    if-eqz p0, :cond_17

    .line 919
    .line 920
    :goto_d
    return v0

    .line 921
    :pswitch_data_0
    .packed-switch 0x0
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
