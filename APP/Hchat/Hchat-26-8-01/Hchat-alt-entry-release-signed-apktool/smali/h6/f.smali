.class public final Lh6/f;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"


# static fields
.field public static final i:Lh6/a;

.field public static final j:I

.field public static final k:I


# instance fields
.field public final a:Ljava/lang/ThreadLocal;

.field public final b:Ljava/util/concurrent/ConcurrentHashMap;

.field public final c:Lh0/q0;

.field public final d:Lk6/l;

.field public final e:Ljava/util/List;

.field public final f:Z

.field public final g:Lh6/a;

.field public final h:I


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    sget-object v0, Lh6/a;->d:Lh6/a;

    .line 2
    .line 3
    sput-object v0, Lh6/f;->i:Lh6/a;

    .line 4
    .line 5
    const/4 v0, 0x1

    .line 6
    sput v0, Lh6/f;->j:I

    .line 7
    .line 8
    const/4 v0, 0x2

    .line 9
    sput v0, Lh6/f;->k:I

    .line 10
    .line 11
    return-void
.end method

.method public constructor <init>(Lj6/d;ILjava/util/HashMap;ZLh6/a;IZILjava/util/ArrayList;IILjava/util/ArrayList;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Ljava/lang/ThreadLocal;

    .line 5
    .line 6
    invoke-direct {v0}, Ljava/lang/ThreadLocal;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object v0, p0, Lh6/f;->a:Ljava/lang/ThreadLocal;

    .line 10
    .line 11
    new-instance v0, Ljava/util/concurrent/ConcurrentHashMap;

    .line 12
    .line 13
    invoke-direct {v0}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    .line 14
    .line 15
    .line 16
    iput-object v0, p0, Lh6/f;->b:Ljava/util/concurrent/ConcurrentHashMap;

    .line 17
    .line 18
    move-object v0, p3

    .line 19
    move p3, p2

    .line 20
    new-instance p2, Lh0/q0;

    .line 21
    .line 22
    invoke-direct {p2, v0, p7, p12}, Lh0/q0;-><init>(Ljava/util/HashMap;ZLjava/util/ArrayList;)V

    .line 23
    .line 24
    .line 25
    iput-object p2, p0, Lh6/f;->c:Lh0/q0;

    .line 26
    .line 27
    iput-boolean p4, p0, Lh6/f;->f:Z

    .line 28
    .line 29
    iput-object p5, p0, Lh6/f;->g:Lh6/a;

    .line 30
    .line 31
    iput p6, p0, Lh6/f;->h:I

    .line 32
    .line 33
    new-instance p7, Ljava/util/ArrayList;

    .line 34
    .line 35
    invoke-direct {p7}, Ljava/util/ArrayList;-><init>()V

    .line 36
    .line 37
    .line 38
    sget-object p4, Lk6/c1;->z:Lk6/s0;

    .line 39
    .line 40
    invoke-virtual {p7, p4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 41
    .line 42
    .line 43
    const/4 p4, 0x1

    .line 44
    if-ne p10, p4, :cond_0

    .line 45
    .line 46
    sget-object p5, Lk6/q;->b:Lk6/p;

    .line 47
    .line 48
    goto :goto_0

    .line 49
    :cond_0
    new-instance p5, Lk6/p;

    .line 50
    .line 51
    invoke-direct {p5, p10}, Lk6/p;-><init>(I)V

    .line 52
    .line 53
    .line 54
    :goto_0
    invoke-virtual {p7, p5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 55
    .line 56
    .line 57
    invoke-virtual {p7, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 58
    .line 59
    .line 60
    invoke-virtual {p7, p9}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 61
    .line 62
    .line 63
    sget-object p5, Lk6/c1;->p:Lk6/s0;

    .line 64
    .line 65
    invoke-virtual {p7, p5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 66
    .line 67
    .line 68
    sget-object p5, Lk6/c1;->g:Lk6/u0;

    .line 69
    .line 70
    invoke-virtual {p7, p5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 71
    .line 72
    .line 73
    sget-object p5, Lk6/c1;->d:Lk6/u0;

    .line 74
    .line 75
    invoke-virtual {p7, p5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 76
    .line 77
    .line 78
    sget-object p5, Lk6/c1;->e:Lk6/u0;

    .line 79
    .line 80
    invoke-virtual {p7, p5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 81
    .line 82
    .line 83
    sget-object p5, Lk6/c1;->f:Lk6/u0;

    .line 84
    .line 85
    invoke-virtual {p7, p5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 86
    .line 87
    .line 88
    if-ne p8, p4, :cond_1

    .line 89
    .line 90
    sget-object p4, Lk6/c1;->k:Lk6/a0;

    .line 91
    .line 92
    goto :goto_1

    .line 93
    :cond_1
    new-instance p4, Lh6/c;

    .line 94
    .line 95
    invoke-direct {p4}, Lh6/c;-><init>()V

    .line 96
    .line 97
    .line 98
    :goto_1
    new-instance p5, Lk6/u0;

    .line 99
    .line 100
    sget-object p6, Ljava/lang/Long;->TYPE:Ljava/lang/Class;

    .line 101
    .line 102
    const-class p8, Ljava/lang/Long;

    .line 103
    .line 104
    invoke-direct {p5, p6, p8, p4}, Lk6/u0;-><init>(Ljava/lang/Class;Ljava/lang/Class;Lh6/n;)V

    .line 105
    .line 106
    .line 107
    invoke-virtual {p7, p5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 108
    .line 109
    .line 110
    new-instance p5, Lh6/b;

    .line 111
    .line 112
    const/4 p6, 0x0

    .line 113
    invoke-direct {p5, p6}, Lh6/b;-><init>(I)V

    .line 114
    .line 115
    .line 116
    new-instance p6, Lk6/u0;

    .line 117
    .line 118
    sget-object p8, Ljava/lang/Double;->TYPE:Ljava/lang/Class;

    .line 119
    .line 120
    const-class p9, Ljava/lang/Double;

    .line 121
    .line 122
    invoke-direct {p6, p8, p9, p5}, Lk6/u0;-><init>(Ljava/lang/Class;Ljava/lang/Class;Lh6/n;)V

    .line 123
    .line 124
    .line 125
    invoke-virtual {p7, p6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 126
    .line 127
    .line 128
    new-instance p5, Lh6/b;

    .line 129
    .line 130
    const/4 p6, 0x1

    .line 131
    invoke-direct {p5, p6}, Lh6/b;-><init>(I)V

    .line 132
    .line 133
    .line 134
    new-instance p6, Lk6/u0;

    .line 135
    .line 136
    sget-object p8, Ljava/lang/Float;->TYPE:Ljava/lang/Class;

    .line 137
    .line 138
    const-class p9, Ljava/lang/Float;

    .line 139
    .line 140
    invoke-direct {p6, p8, p9, p5}, Lk6/u0;-><init>(Ljava/lang/Class;Ljava/lang/Class;Lh6/n;)V

    .line 141
    .line 142
    .line 143
    invoke-virtual {p7, p6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 144
    .line 145
    .line 146
    const/4 p5, 0x2

    .line 147
    if-ne p11, p5, :cond_2

    .line 148
    .line 149
    sget-object p5, Lk6/o;->b:Lk6/n;

    .line 150
    .line 151
    goto :goto_2

    .line 152
    :cond_2
    new-instance p5, Lk6/o;

    .line 153
    .line 154
    const/4 p6, 0x0

    .line 155
    invoke-direct {p5, p6}, Lk6/o;-><init>(I)V

    .line 156
    .line 157
    .line 158
    new-instance p6, Lk6/n;

    .line 159
    .line 160
    const/4 p8, 0x0

    .line 161
    invoke-direct {p6, p5, p8}, Lk6/n;-><init>(Lh6/n;I)V

    .line 162
    .line 163
    .line 164
    move-object p5, p6

    .line 165
    :goto_2
    invoke-virtual {p7, p5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 166
    .line 167
    .line 168
    sget-object p5, Lk6/c1;->h:Lk6/s0;

    .line 169
    .line 170
    invoke-virtual {p7, p5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 171
    .line 172
    .line 173
    sget-object p5, Lk6/c1;->i:Lk6/s0;

    .line 174
    .line 175
    invoke-virtual {p7, p5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 176
    .line 177
    .line 178
    new-instance p5, Lh6/d;

    .line 179
    .line 180
    const/4 p6, 0x0

    .line 181
    invoke-direct {p5, p4, p6}, Lh6/d;-><init>(Ljava/lang/Object;I)V

    .line 182
    .line 183
    .line 184
    invoke-virtual {p5}, Lh6/n;->a()Lh6/m;

    .line 185
    .line 186
    .line 187
    move-result-object p5

    .line 188
    new-instance p6, Lk6/s0;

    .line 189
    .line 190
    const/4 p8, 0x0

    .line 191
    const-class p9, Ljava/util/concurrent/atomic/AtomicLong;

    .line 192
    .line 193
    invoke-direct {p6, p9, p5, p8}, Lk6/s0;-><init>(Ljava/lang/Class;Lh6/n;I)V

    .line 194
    .line 195
    .line 196
    invoke-virtual {p7, p6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 197
    .line 198
    .line 199
    new-instance p5, Lh6/d;

    .line 200
    .line 201
    const/4 p6, 0x1

    .line 202
    invoke-direct {p5, p4, p6}, Lh6/d;-><init>(Ljava/lang/Object;I)V

    .line 203
    .line 204
    .line 205
    invoke-virtual {p5}, Lh6/n;->a()Lh6/m;

    .line 206
    .line 207
    .line 208
    move-result-object p4

    .line 209
    new-instance p5, Lk6/s0;

    .line 210
    .line 211
    const/4 p6, 0x0

    .line 212
    const-class p8, Ljava/util/concurrent/atomic/AtomicLongArray;

    .line 213
    .line 214
    invoke-direct {p5, p8, p4, p6}, Lk6/s0;-><init>(Ljava/lang/Class;Lh6/n;I)V

    .line 215
    .line 216
    .line 217
    invoke-virtual {p7, p5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 218
    .line 219
    .line 220
    sget-object p4, Lk6/c1;->j:Lk6/s0;

    .line 221
    .line 222
    invoke-virtual {p7, p4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 223
    .line 224
    .line 225
    sget-object p4, Lk6/c1;->l:Lk6/u0;

    .line 226
    .line 227
    invoke-virtual {p7, p4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 228
    .line 229
    .line 230
    sget-object p4, Lk6/c1;->q:Lk6/s0;

    .line 231
    .line 232
    invoke-virtual {p7, p4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 233
    .line 234
    .line 235
    sget-object p4, Lk6/c1;->r:Lk6/s0;

    .line 236
    .line 237
    invoke-virtual {p7, p4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 238
    .line 239
    .line 240
    sget-object p4, Lk6/c1;->m:Lk6/f0;

    .line 241
    .line 242
    new-instance p5, Lk6/s0;

    .line 243
    .line 244
    const-class p8, Ljava/math/BigDecimal;

    .line 245
    .line 246
    invoke-direct {p5, p8, p4, p6}, Lk6/s0;-><init>(Ljava/lang/Class;Lh6/n;I)V

    .line 247
    .line 248
    .line 249
    invoke-virtual {p7, p5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 250
    .line 251
    .line 252
    sget-object p4, Lk6/c1;->n:Lk6/g0;

    .line 253
    .line 254
    new-instance p5, Lk6/s0;

    .line 255
    .line 256
    const-class p8, Ljava/math/BigInteger;

    .line 257
    .line 258
    invoke-direct {p5, p8, p4, p6}, Lk6/s0;-><init>(Ljava/lang/Class;Lh6/n;I)V

    .line 259
    .line 260
    .line 261
    invoke-virtual {p7, p5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 262
    .line 263
    .line 264
    sget-object p4, Lk6/c1;->o:Lk6/h0;

    .line 265
    .line 266
    new-instance p5, Lk6/s0;

    .line 267
    .line 268
    const-class p8, Lj6/j;

    .line 269
    .line 270
    invoke-direct {p5, p8, p4, p6}, Lk6/s0;-><init>(Ljava/lang/Class;Lh6/n;I)V

    .line 271
    .line 272
    .line 273
    invoke-virtual {p7, p5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 274
    .line 275
    .line 276
    sget-object p4, Lk6/c1;->s:Lk6/s0;

    .line 277
    .line 278
    invoke-virtual {p7, p4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 279
    .line 280
    .line 281
    sget-object p4, Lk6/c1;->t:Lk6/s0;

    .line 282
    .line 283
    invoke-virtual {p7, p4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 284
    .line 285
    .line 286
    sget-object p4, Lk6/c1;->v:Lk6/s0;

    .line 287
    .line 288
    invoke-virtual {p7, p4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 289
    .line 290
    .line 291
    sget-object p4, Lk6/c1;->w:Lk6/s0;

    .line 292
    .line 293
    invoke-virtual {p7, p4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 294
    .line 295
    .line 296
    sget-object p4, Lk6/c1;->y:Lk6/s0;

    .line 297
    .line 298
    invoke-virtual {p7, p4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 299
    .line 300
    .line 301
    sget-object p4, Lk6/c1;->u:Lk6/s0;

    .line 302
    .line 303
    invoke-virtual {p7, p4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 304
    .line 305
    .line 306
    sget-object p4, Lk6/c1;->b:Lk6/s0;

    .line 307
    .line 308
    invoke-virtual {p7, p4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 309
    .line 310
    .line 311
    sget-object p4, Lk6/h;->b:Lk6/e;

    .line 312
    .line 313
    invoke-virtual {p7, p4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 314
    .line 315
    .line 316
    sget-object p4, Lk6/c1;->x:Lk6/n;

    .line 317
    .line 318
    invoke-virtual {p7, p4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 319
    .line 320
    .line 321
    sget-boolean p4, Lm6/f;->a:Z

    .line 322
    .line 323
    if-eqz p4, :cond_3

    .line 324
    .line 325
    sget-object p4, Lm6/f;->e:Lm6/b$a;

    .line 326
    .line 327
    invoke-virtual {p7, p4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 328
    .line 329
    .line 330
    sget-object p4, Lm6/f;->d:Lm6/a$a;

    .line 331
    .line 332
    invoke-virtual {p7, p4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 333
    .line 334
    .line 335
    sget-object p4, Lm6/f;->f:Lm6/c;

    .line 336
    .line 337
    invoke-virtual {p7, p4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 338
    .line 339
    .line 340
    :cond_3
    sget-object p4, Lk6/b;->b:Lk6/a;

    .line 341
    .line 342
    invoke-virtual {p7, p4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 343
    .line 344
    .line 345
    sget-object p4, Lk6/c1;->a:Lk6/s0;

    .line 346
    .line 347
    invoke-virtual {p7, p4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 348
    .line 349
    .line 350
    new-instance p4, Lk6/d;

    .line 351
    .line 352
    const/4 p5, 0x0

    .line 353
    invoke-direct {p4, p2, p5}, Lk6/d;-><init>(Lh0/q0;I)V

    .line 354
    .line 355
    .line 356
    invoke-virtual {p7, p4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 357
    .line 358
    .line 359
    new-instance p4, Lk6/d;

    .line 360
    .line 361
    const/4 p5, 0x1

    .line 362
    invoke-direct {p4, p2, p5}, Lk6/d;-><init>(Lh0/q0;I)V

    .line 363
    .line 364
    .line 365
    invoke-virtual {p7, p4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 366
    .line 367
    .line 368
    new-instance p5, Lk6/l;

    .line 369
    .line 370
    invoke-direct {p5, p2}, Lk6/l;-><init>(Lh0/q0;)V

    .line 371
    .line 372
    .line 373
    iput-object p5, p0, Lh6/f;->d:Lk6/l;

    .line 374
    .line 375
    invoke-virtual {p7, p5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 376
    .line 377
    .line 378
    sget-object p4, Lk6/c1;->A:Lk6/i;

    .line 379
    .line 380
    invoke-virtual {p7, p4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 381
    .line 382
    .line 383
    move-object p4, p1

    .line 384
    new-instance p1, Lk6/w;

    .line 385
    .line 386
    move-object p6, p12

    .line 387
    invoke-direct/range {p1 .. p6}, Lk6/w;-><init>(Lh0/q0;ILj6/d;Lk6/l;Ljava/util/ArrayList;)V

    .line 388
    .line 389
    .line 390
    invoke-virtual {p7, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 391
    .line 392
    .line 393
    invoke-static {p7}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    .line 394
    .line 395
    .line 396
    move-result-object p1

    .line 397
    iput-object p1, p0, Lh6/f;->e:Ljava/util/List;

    .line 398
    .line 399
    return-void
.end method

.method public static a(D)V
    .locals 2

    .line 1
    invoke-static {p0, p1}, Ljava/lang/Double;->isNaN(D)Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    invoke-static {p0, p1}, Ljava/lang/Double;->isInfinite(D)Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    if-nez v0, :cond_0

    .line 12
    .line 13
    return-void

    .line 14
    :cond_0
    new-instance v0, Ljava/lang/IllegalArgumentException;

    .line 15
    .line 16
    new-instance v1, Ljava/lang/StringBuilder;

    .line 17
    .line 18
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 19
    .line 20
    .line 21
    invoke-virtual {v1, p0, p1}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    .line 22
    .line 23
    .line 24
    const-string p0, " is not a valid double value as per JSON specification. To override this behavior, use GsonBuilder.serializeSpecialFloatingPointValues() method."

    .line 25
    .line 26
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 27
    .line 28
    .line 29
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 30
    .line 31
    .line 32
    move-result-object p0

    .line 33
    invoke-direct {v0, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 34
    .line 35
    .line 36
    throw v0
.end method


# virtual methods
.method public final b(Ln6/a;)Lh6/n;
    .locals 8

    .line 1
    iget-object v0, p0, Lh6/f;->b:Ljava/util/concurrent/ConcurrentHashMap;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    check-cast v1, Lh6/n;

    .line 8
    .line 9
    if-eqz v1, :cond_0

    .line 10
    .line 11
    return-object v1

    .line 12
    :cond_0
    iget-object v1, p0, Lh6/f;->a:Ljava/lang/ThreadLocal;

    .line 13
    .line 14
    invoke-virtual {v1}, Ljava/lang/ThreadLocal;->get()Ljava/lang/Object;

    .line 15
    .line 16
    .line 17
    move-result-object v2

    .line 18
    check-cast v2, Ljava/util/Map;

    .line 19
    .line 20
    if-nez v2, :cond_1

    .line 21
    .line 22
    new-instance v2, Ljava/util/HashMap;

    .line 23
    .line 24
    invoke-direct {v2}, Ljava/util/HashMap;-><init>()V

    .line 25
    .line 26
    .line 27
    invoke-virtual {v1, v2}, Ljava/lang/ThreadLocal;->set(Ljava/lang/Object;)V

    .line 28
    .line 29
    .line 30
    const/4 v3, 0x1

    .line 31
    goto :goto_0

    .line 32
    :cond_1
    invoke-interface {v2, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 33
    .line 34
    .line 35
    move-result-object v3

    .line 36
    check-cast v3, Lh6/n;

    .line 37
    .line 38
    if-eqz v3, :cond_2

    .line 39
    .line 40
    return-object v3

    .line 41
    :cond_2
    const/4 v3, 0x0

    .line 42
    :goto_0
    :try_start_0
    new-instance v4, Lh6/e;

    .line 43
    .line 44
    invoke-direct {v4}, Lh6/e;-><init>()V

    .line 45
    .line 46
    .line 47
    invoke-interface {v2, p1, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 48
    .line 49
    .line 50
    iget-object v5, p0, Lh6/f;->e:Ljava/util/List;

    .line 51
    .line 52
    invoke-interface {v5}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 53
    .line 54
    .line 55
    move-result-object v5

    .line 56
    const/4 v6, 0x0

    .line 57
    :cond_3
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    .line 58
    .line 59
    .line 60
    move-result v7

    .line 61
    if-eqz v7, :cond_5

    .line 62
    .line 63
    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 64
    .line 65
    .line 66
    move-result-object v6

    .line 67
    check-cast v6, Lh6/o;

    .line 68
    .line 69
    invoke-interface {v6, p0, p1}, Lh6/o;->a(Lh6/f;Ln6/a;)Lh6/n;

    .line 70
    .line 71
    .line 72
    move-result-object v6

    .line 73
    if-eqz v6, :cond_3

    .line 74
    .line 75
    iget-object v5, v4, Lh6/e;->a:Lh6/n;

    .line 76
    .line 77
    if-nez v5, :cond_4

    .line 78
    .line 79
    iput-object v6, v4, Lh6/e;->a:Lh6/n;

    .line 80
    .line 81
    invoke-interface {v2, p1, v6}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 82
    .line 83
    .line 84
    goto :goto_1

    .line 85
    :catchall_0
    move-exception p1

    .line 86
    goto :goto_2

    .line 87
    :cond_4
    new-instance p1, Ljava/lang/AssertionError;

    .line 88
    .line 89
    const-string v0, "Delegate is already set"

    .line 90
    .line 91
    invoke-direct {p1, v0}, Ljava/lang/AssertionError;-><init>(Ljava/lang/Object;)V

    .line 92
    .line 93
    .line 94
    throw p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 95
    :cond_5
    :goto_1
    if-eqz v3, :cond_6

    .line 96
    .line 97
    invoke-virtual {v1}, Ljava/lang/ThreadLocal;->remove()V

    .line 98
    .line 99
    .line 100
    :cond_6
    if-eqz v6, :cond_8

    .line 101
    .line 102
    if-eqz v3, :cond_7

    .line 103
    .line 104
    invoke-virtual {v0, v2}, Ljava/util/concurrent/ConcurrentHashMap;->putAll(Ljava/util/Map;)V

    .line 105
    .line 106
    .line 107
    :cond_7
    return-object v6

    .line 108
    :cond_8
    const-string v0, "GSON (2.13.2) cannot handle "

    .line 109
    .line 110
    invoke-static {p1, v0}, Lg1/d;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 111
    .line 112
    .line 113
    const/4 p1, 0x0

    .line 114
    return-object p1

    .line 115
    :goto_2
    if-eqz v3, :cond_9

    .line 116
    .line 117
    invoke-virtual {v1}, Ljava/lang/ThreadLocal;->remove()V

    .line 118
    .line 119
    .line 120
    :cond_9
    throw p1
.end method

.method public final c(Ljava/io/Writer;)Lo6/a;
    .locals 1

    .line 1
    new-instance v0, Lo6/a;

    .line 2
    .line 3
    invoke-direct {v0, p1}, Lo6/a;-><init>(Ljava/io/Writer;)V

    .line 4
    .line 5
    .line 6
    iget-object p1, p0, Lh6/f;->g:Lh6/a;

    .line 7
    .line 8
    invoke-virtual {v0, p1}, Lo6/a;->o(Lh6/a;)V

    .line 9
    .line 10
    .line 11
    iget-boolean p1, p0, Lh6/f;->f:Z

    .line 12
    .line 13
    iput-boolean p1, v0, Lo6/a;->o:Z

    .line 14
    .line 15
    iget p1, p0, Lh6/f;->h:I

    .line 16
    .line 17
    if-nez p1, :cond_0

    .line 18
    .line 19
    const/4 p1, 0x2

    .line 20
    :cond_0
    invoke-virtual {v0, p1}, Lo6/a;->q(I)V

    .line 21
    .line 22
    .line 23
    const/4 p1, 0x0

    .line 24
    iput-boolean p1, v0, Lo6/a;->q:Z

    .line 25
    .line 26
    return-object v0
.end method

.method public final d(Ljava/lang/Object;Ljava/lang/Class;Lo6/a;)V
    .locals 5

    .line 1
    const-string v0, "AssertionError (GSON 2.13.2): "

    .line 2
    .line 3
    new-instance v1, Ln6/a;

    .line 4
    .line 5
    invoke-direct {v1, p2}, Ln6/a;-><init>(Ljava/lang/reflect/Type;)V

    .line 6
    .line 7
    .line 8
    invoke-virtual {p0, v1}, Lh6/f;->b(Ln6/a;)Lh6/n;

    .line 9
    .line 10
    .line 11
    move-result-object p2

    .line 12
    iget v1, p3, Lo6/a;->n:I

    .line 13
    .line 14
    iget v2, p0, Lh6/f;->h:I

    .line 15
    .line 16
    if-eqz v2, :cond_0

    .line 17
    .line 18
    invoke-virtual {p3, v2}, Lo6/a;->q(I)V

    .line 19
    .line 20
    .line 21
    goto :goto_0

    .line 22
    :cond_0
    const/4 v2, 0x2

    .line 23
    if-ne v1, v2, :cond_1

    .line 24
    .line 25
    const/4 v2, 0x1

    .line 26
    iput v2, p3, Lo6/a;->n:I

    .line 27
    .line 28
    :cond_1
    :goto_0
    iget-boolean v2, p3, Lo6/a;->o:Z

    .line 29
    .line 30
    iget-boolean v3, p3, Lo6/a;->q:Z

    .line 31
    .line 32
    iget-boolean v4, p0, Lh6/f;->f:Z

    .line 33
    .line 34
    iput-boolean v4, p3, Lo6/a;->o:Z

    .line 35
    .line 36
    const/4 v4, 0x0

    .line 37
    iput-boolean v4, p3, Lo6/a;->q:Z

    .line 38
    .line 39
    :try_start_0
    invoke-virtual {p2, p3, p1}, Lh6/n;->b(Lo6/a;Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/AssertionError; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 40
    .line 41
    .line 42
    invoke-virtual {p3, v1}, Lo6/a;->q(I)V

    .line 43
    .line 44
    .line 45
    iput-boolean v2, p3, Lo6/a;->o:Z

    .line 46
    .line 47
    iput-boolean v3, p3, Lo6/a;->q:Z

    .line 48
    .line 49
    return-void

    .line 50
    :catchall_0
    move-exception p1

    .line 51
    goto :goto_1

    .line 52
    :catch_0
    move-exception p1

    .line 53
    :try_start_1
    new-instance p2, Ljava/lang/AssertionError;

    .line 54
    .line 55
    new-instance v4, Ljava/lang/StringBuilder;

    .line 56
    .line 57
    invoke-direct {v4, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 58
    .line 59
    .line 60
    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 61
    .line 62
    .line 63
    move-result-object v0

    .line 64
    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 65
    .line 66
    .line 67
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 68
    .line 69
    .line 70
    move-result-object v0

    .line 71
    invoke-direct {p2, v0, p1}, Ljava/lang/AssertionError;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 72
    .line 73
    .line 74
    throw p2

    .line 75
    :catch_1
    move-exception p1

    .line 76
    new-instance p2, Laf/d;

    .line 77
    .line 78
    invoke-direct {p2, p1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    .line 79
    .line 80
    .line 81
    throw p2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 82
    :goto_1
    invoke-virtual {p3, v1}, Lo6/a;->q(I)V

    .line 83
    .line 84
    .line 85
    iput-boolean v2, p3, Lo6/a;->o:Z

    .line 86
    .line 87
    iput-boolean v3, p3, Lo6/a;->q:Z

    .line 88
    .line 89
    throw p1
.end method

.method public final toString()Ljava/lang/String;
    .locals 2

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    const-string v1, "{serializeNulls:false,factories:"

    .line 4
    .line 5
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    iget-object v1, p0, Lh6/f;->e:Ljava/util/List;

    .line 9
    .line 10
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 11
    .line 12
    .line 13
    const-string v1, ",instanceCreators:"

    .line 14
    .line 15
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 16
    .line 17
    .line 18
    iget-object v1, p0, Lh6/f;->c:Lh0/q0;

    .line 19
    .line 20
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 21
    .line 22
    .line 23
    const-string v1, "}"

    .line 24
    .line 25
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 26
    .line 27
    .line 28
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 29
    .line 30
    .line 31
    move-result-object v0

    .line 32
    return-object v0
.end method
