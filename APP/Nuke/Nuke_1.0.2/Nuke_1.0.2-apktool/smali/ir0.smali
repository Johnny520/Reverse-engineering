.class public final Lir0;
.super Ljava/lang/Object;
.source "r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4"


# static fields
.field public static final h:Lrm0;

.field public static final i:I

.field public static final j:I

.field public static final k:I


# instance fields
.field public final a:Ljava/lang/ThreadLocal;

.field public final b:Ljava/util/concurrent/ConcurrentHashMap;

.field public final c:Lsz0;

.field public final d:Lx21;

.field public final e:Ljava/util/List;

.field public final f:Z

.field public final g:Lrm0;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    sget-object v0, Lrm0;->d:Lrm0;

    .line 2
    .line 3
    sput-object v0, Lir0;->h:Lrm0;

    .line 4
    .line 5
    const/4 v0, 0x1

    .line 6
    sput v0, Lir0;->i:I

    .line 7
    .line 8
    sput v0, Lir0;->j:I

    .line 9
    .line 10
    const/4 v0, 0x2

    .line 11
    sput v0, Lir0;->k:I

    .line 12
    .line 13
    return-void
.end method

.method public constructor <init>()V
    .locals 10

    .line 382
    sget-object v1, Lah0;->j:Lah0;

    .line 383
    sget-object v3, Ljava/util/Collections;->EMPTY_MAP:Ljava/util/Map;

    .line 384
    sget-object v6, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    .line 385
    sget v7, Lir0;->j:I

    sget v8, Lir0;->k:I

    .line 386
    sget v2, Lir0;->i:I

    const/4 v4, 0x1

    sget-object v5, Lir0;->h:Lrm0;

    move-object v9, v6

    move-object v0, p0

    invoke-direct/range {v0 .. v9}, Lir0;-><init>(Lah0;ILjava/util/Map;ZLrm0;Ljava/util/List;IILjava/util/List;)V

    return-void
.end method

.method public constructor <init>(Lah0;ILjava/util/Map;ZLrm0;Ljava/util/List;IILjava/util/List;)V
    .locals 4

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
    iput-object v0, p0, Lir0;->a:Ljava/lang/ThreadLocal;

    .line 10
    .line 11
    new-instance v0, Ljava/util/concurrent/ConcurrentHashMap;

    .line 12
    .line 13
    invoke-direct {v0}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    .line 14
    .line 15
    .line 16
    iput-object v0, p0, Lir0;->b:Ljava/util/concurrent/ConcurrentHashMap;

    .line 17
    .line 18
    move-object v0, p3

    .line 19
    move p3, p2

    .line 20
    new-instance p2, Lsz0;

    .line 21
    .line 22
    const/4 v1, 0x5

    .line 23
    invoke-direct {p2, v1, v0, p9}, Lsz0;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 24
    .line 25
    .line 26
    iput-object p2, p0, Lir0;->c:Lsz0;

    .line 27
    .line 28
    iput-boolean p4, p0, Lir0;->f:Z

    .line 29
    .line 30
    iput-object p5, p0, Lir0;->g:Lrm0;

    .line 31
    .line 32
    new-instance v0, Ljava/util/ArrayList;

    .line 33
    .line 34
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 35
    .line 36
    .line 37
    sget-object p4, Lv53;->A:Ll53;

    .line 38
    .line 39
    invoke-virtual {v0, p4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 40
    .line 41
    .line 42
    const/4 p4, 0x1

    .line 43
    if-ne p7, p4, :cond_0

    .line 44
    .line 45
    sget-object p5, Lns1;->c:Lms1;

    .line 46
    .line 47
    goto :goto_0

    .line 48
    :cond_0
    new-instance p5, Lms1;

    .line 49
    .line 50
    invoke-direct {p5, p7}, Lms1;-><init>(I)V

    .line 51
    .line 52
    .line 53
    :goto_0
    invoke-virtual {v0, p5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 54
    .line 55
    .line 56
    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 57
    .line 58
    .line 59
    invoke-virtual {v0, p6}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 60
    .line 61
    .line 62
    sget-object p5, Lv53;->p:Ll53;

    .line 63
    .line 64
    invoke-virtual {v0, p5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 65
    .line 66
    .line 67
    sget-object p5, Lv53;->g:Ln53;

    .line 68
    .line 69
    invoke-virtual {v0, p5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 70
    .line 71
    .line 72
    sget-object p5, Lv53;->d:Ln53;

    .line 73
    .line 74
    invoke-virtual {v0, p5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 75
    .line 76
    .line 77
    sget-object p5, Lv53;->e:Ln53;

    .line 78
    .line 79
    invoke-virtual {v0, p5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 80
    .line 81
    .line 82
    sget-object p5, Lv53;->f:Ln53;

    .line 83
    .line 84
    invoke-virtual {v0, p5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 85
    .line 86
    .line 87
    sget-object p5, Lv53;->k:Lt43;

    .line 88
    .line 89
    new-instance p6, Ln53;

    .line 90
    .line 91
    sget-object p7, Ljava/lang/Long;->TYPE:Ljava/lang/Class;

    .line 92
    .line 93
    const-class v1, Ljava/lang/Long;

    .line 94
    .line 95
    invoke-direct {p6, p7, v1, p5}, Ln53;-><init>(Ljava/lang/Class;Ljava/lang/Class;Lq43;)V

    .line 96
    .line 97
    .line 98
    invoke-virtual {v0, p6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 99
    .line 100
    .line 101
    new-instance p6, Lfr0;

    .line 102
    .line 103
    const/4 p7, 0x0

    .line 104
    invoke-direct {p6, p7}, Lfr0;-><init>(I)V

    .line 105
    .line 106
    .line 107
    new-instance v1, Ln53;

    .line 108
    .line 109
    sget-object v2, Ljava/lang/Double;->TYPE:Ljava/lang/Class;

    .line 110
    .line 111
    const-class v3, Ljava/lang/Double;

    .line 112
    .line 113
    invoke-direct {v1, v2, v3, p6}, Ln53;-><init>(Ljava/lang/Class;Ljava/lang/Class;Lq43;)V

    .line 114
    .line 115
    .line 116
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 117
    .line 118
    .line 119
    new-instance p6, Lfr0;

    .line 120
    .line 121
    invoke-direct {p6, p4}, Lfr0;-><init>(I)V

    .line 122
    .line 123
    .line 124
    new-instance v1, Ln53;

    .line 125
    .line 126
    sget-object v2, Ljava/lang/Float;->TYPE:Ljava/lang/Class;

    .line 127
    .line 128
    const-class v3, Ljava/lang/Float;

    .line 129
    .line 130
    invoke-direct {v1, v2, v3, p6}, Ln53;-><init>(Ljava/lang/Class;Ljava/lang/Class;Lq43;)V

    .line 131
    .line 132
    .line 133
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 134
    .line 135
    .line 136
    const/4 p6, 0x2

    .line 137
    if-ne p8, p6, :cond_1

    .line 138
    .line 139
    sget-object p6, Lcs1;->b:Lbs1;

    .line 140
    .line 141
    goto :goto_1

    .line 142
    :cond_1
    new-instance p6, Lcs1;

    .line 143
    .line 144
    invoke-direct {p6, p8}, Lcs1;-><init>(I)V

    .line 145
    .line 146
    .line 147
    new-instance p8, Lbs1;

    .line 148
    .line 149
    invoke-direct {p8, p6, p7}, Lbs1;-><init>(Lq43;I)V

    .line 150
    .line 151
    .line 152
    move-object p6, p8

    .line 153
    :goto_1
    invoke-virtual {v0, p6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 154
    .line 155
    .line 156
    sget-object p6, Lv53;->h:Ll53;

    .line 157
    .line 158
    invoke-virtual {v0, p6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 159
    .line 160
    .line 161
    sget-object p6, Lv53;->i:Ll53;

    .line 162
    .line 163
    invoke-virtual {v0, p6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 164
    .line 165
    .line 166
    new-instance p6, Lgr0;

    .line 167
    .line 168
    invoke-direct {p6, p5, p7}, Lgr0;-><init>(Lq43;I)V

    .line 169
    .line 170
    .line 171
    invoke-virtual {p6}, Lq43;->a()Lp43;

    .line 172
    .line 173
    .line 174
    move-result-object p6

    .line 175
    new-instance p8, Ll53;

    .line 176
    .line 177
    const-class v1, Ljava/util/concurrent/atomic/AtomicLong;

    .line 178
    .line 179
    invoke-direct {p8, v1, p6, p7}, Ll53;-><init>(Ljava/lang/Class;Lq43;I)V

    .line 180
    .line 181
    .line 182
    invoke-virtual {v0, p8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 183
    .line 184
    .line 185
    new-instance p6, Lgr0;

    .line 186
    .line 187
    invoke-direct {p6, p5, p4}, Lgr0;-><init>(Lq43;I)V

    .line 188
    .line 189
    .line 190
    invoke-virtual {p6}, Lq43;->a()Lp43;

    .line 191
    .line 192
    .line 193
    move-result-object p5

    .line 194
    new-instance p6, Ll53;

    .line 195
    .line 196
    const-class p8, Ljava/util/concurrent/atomic/AtomicLongArray;

    .line 197
    .line 198
    invoke-direct {p6, p8, p5, p7}, Ll53;-><init>(Ljava/lang/Class;Lq43;I)V

    .line 199
    .line 200
    .line 201
    invoke-virtual {v0, p6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 202
    .line 203
    .line 204
    sget-object p5, Lv53;->j:Ll53;

    .line 205
    .line 206
    invoke-virtual {v0, p5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 207
    .line 208
    .line 209
    sget-object p5, Lv53;->l:Ln53;

    .line 210
    .line 211
    invoke-virtual {v0, p5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 212
    .line 213
    .line 214
    sget-object p5, Lv53;->q:Ll53;

    .line 215
    .line 216
    invoke-virtual {v0, p5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 217
    .line 218
    .line 219
    sget-object p5, Lv53;->r:Ll53;

    .line 220
    .line 221
    invoke-virtual {v0, p5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 222
    .line 223
    .line 224
    sget-object p5, Lv53;->m:Ly43;

    .line 225
    .line 226
    new-instance p6, Ll53;

    .line 227
    .line 228
    const-class p8, Ljava/math/BigDecimal;

    .line 229
    .line 230
    invoke-direct {p6, p8, p5, p7}, Ll53;-><init>(Ljava/lang/Class;Lq43;I)V

    .line 231
    .line 232
    .line 233
    invoke-virtual {v0, p6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 234
    .line 235
    .line 236
    sget-object p5, Lv53;->n:Lz43;

    .line 237
    .line 238
    new-instance p6, Ll53;

    .line 239
    .line 240
    const-class p8, Ljava/math/BigInteger;

    .line 241
    .line 242
    invoke-direct {p6, p8, p5, p7}, Ll53;-><init>(Ljava/lang/Class;Lq43;I)V

    .line 243
    .line 244
    .line 245
    invoke-virtual {v0, p6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 246
    .line 247
    .line 248
    sget-object p5, Lv53;->o:La53;

    .line 249
    .line 250
    new-instance p6, Ll53;

    .line 251
    .line 252
    const-class p8, Li71;

    .line 253
    .line 254
    invoke-direct {p6, p8, p5, p7}, Ll53;-><init>(Ljava/lang/Class;Lq43;I)V

    .line 255
    .line 256
    .line 257
    invoke-virtual {v0, p6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 258
    .line 259
    .line 260
    sget-object p5, Lv53;->s:Ll53;

    .line 261
    .line 262
    invoke-virtual {v0, p5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 263
    .line 264
    .line 265
    sget-object p5, Lv53;->t:Ll53;

    .line 266
    .line 267
    invoke-virtual {v0, p5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 268
    .line 269
    .line 270
    sget-object p5, Lv53;->v:Ll53;

    .line 271
    .line 272
    invoke-virtual {v0, p5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 273
    .line 274
    .line 275
    sget-object p5, Lv53;->w:Ll53;

    .line 276
    .line 277
    invoke-virtual {v0, p5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 278
    .line 279
    .line 280
    sget-object p5, Lv53;->y:Ll53;

    .line 281
    .line 282
    invoke-virtual {v0, p5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 283
    .line 284
    .line 285
    sget-object p5, Lv53;->u:Ll53;

    .line 286
    .line 287
    invoke-virtual {v0, p5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 288
    .line 289
    .line 290
    sget-object p5, Lv53;->b:Ll53;

    .line 291
    .line 292
    invoke-virtual {v0, p5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 293
    .line 294
    .line 295
    sget-object p5, Lg50;->c:Ld50;

    .line 296
    .line 297
    invoke-virtual {v0, p5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 298
    .line 299
    .line 300
    sget-object p5, Lv53;->x:Lbs1;

    .line 301
    .line 302
    invoke-virtual {v0, p5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 303
    .line 304
    .line 305
    sget-boolean p5, Lwt2;->a:Z

    .line 306
    .line 307
    if-eqz p5, :cond_2

    .line 308
    .line 309
    sget-object p5, Lwt2;->c:Lst2$a;

    .line 310
    .line 311
    invoke-virtual {v0, p5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 312
    .line 313
    .line 314
    sget-object p5, Lwt2;->b:Lrt2$a;

    .line 315
    .line 316
    invoke-virtual {v0, p5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 317
    .line 318
    .line 319
    sget-object p5, Lwt2;->d:Ltt2;

    .line 320
    .line 321
    invoke-virtual {v0, p5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 322
    .line 323
    .line 324
    :cond_2
    sget-object p5, Llg;->c:Lkg;

    .line 325
    .line 326
    invoke-virtual {v0, p5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 327
    .line 328
    .line 329
    sget-object p5, Lv53;->a:Ll53;

    .line 330
    .line 331
    invoke-virtual {v0, p5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 332
    .line 333
    .line 334
    new-instance p5, Lcu;

    .line 335
    .line 336
    invoke-direct {p5, p2, p7}, Lcu;-><init>(Lsz0;I)V

    .line 337
    .line 338
    .line 339
    invoke-virtual {v0, p5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 340
    .line 341
    .line 342
    new-instance p5, Lcu;

    .line 343
    .line 344
    invoke-direct {p5, p2, p4}, Lcu;-><init>(Lsz0;I)V

    .line 345
    .line 346
    .line 347
    invoke-virtual {v0, p5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 348
    .line 349
    .line 350
    new-instance p5, Lx21;

    .line 351
    .line 352
    invoke-direct {p5, p2}, Lx21;-><init>(Lsz0;)V

    .line 353
    .line 354
    .line 355
    iput-object p5, p0, Lir0;->d:Lx21;

    .line 356
    .line 357
    invoke-virtual {v0, p5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 358
    .line 359
    .line 360
    sget-object p4, Lv53;->B:Lag0;

    .line 361
    .line 362
    invoke-virtual {v0, p4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 363
    .line 364
    .line 365
    move-object p4, p1

    .line 366
    new-instance p1, Ln72;

    .line 367
    .line 368
    move-object p6, p9

    .line 369
    invoke-direct/range {p1 .. p6}, Ln72;-><init>(Lsz0;ILah0;Lx21;Ljava/util/List;)V

    .line 370
    .line 371
    .line 372
    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 373
    .line 374
    .line 375
    invoke-static {v0}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    .line 376
    .line 377
    .line 378
    move-result-object p1

    .line 379
    iput-object p1, p0, Lir0;->e:Ljava/util/List;

    .line 380
    .line 381
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
.method public final b(Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;
    .locals 8

    .line 1
    new-instance v0, Lj63;

    .line 2
    .line 3
    invoke-direct {v0, p2}, Lj63;-><init>(Ljava/lang/reflect/Type;)V

    .line 4
    .line 5
    .line 6
    const/4 p2, 0x0

    .line 7
    if-nez p1, :cond_0

    .line 8
    .line 9
    return-object p2

    .line 10
    :cond_0
    new-instance v1, Ljava/io/StringReader;

    .line 11
    .line 12
    invoke-direct {v1, p1}, Ljava/io/StringReader;-><init>(Ljava/lang/String;)V

    .line 13
    .line 14
    .line 15
    new-instance p1, Ll41;

    .line 16
    .line 17
    invoke-direct {p1, v1}, Ll41;-><init>(Ljava/io/Reader;)V

    .line 18
    .line 19
    .line 20
    const/4 v1, 0x2

    .line 21
    invoke-virtual {p1, v1}, Ll41;->L(I)V

    .line 22
    .line 23
    .line 24
    const-string v2, "AssertionError (GSON 2.13.1): "

    .line 25
    .line 26
    const-string v3, "Type adapter \'"

    .line 27
    .line 28
    iget v4, p1, Ll41;->v:I

    .line 29
    .line 30
    const/4 v5, 0x1

    .line 31
    if-ne v4, v1, :cond_1

    .line 32
    .line 33
    iput v5, p1, Ll41;->v:I

    .line 34
    .line 35
    :cond_1
    :try_start_0
    invoke-virtual {p1}, Ll41;->I()I

    .line 36
    .line 37
    .line 38
    const/4 v5, 0x0

    .line 39
    invoke-virtual {p0, v0}, Lir0;->c(Lj63;)Lq43;

    .line 40
    .line 41
    .line 42
    move-result-object p0

    .line 43
    iget-object v0, v0, Lj63;->a:Ljava/lang/Class;

    .line 44
    .line 45
    invoke-virtual {p0, p1}, Lq43;->b(Ll41;)Ljava/lang/Object;

    .line 46
    .line 47
    .line 48
    move-result-object v1

    .line 49
    invoke-static {v0}, Lp7;->T(Ljava/lang/Class;)Ljava/lang/Class;

    .line 50
    .line 51
    .line 52
    move-result-object v6

    .line 53
    if-eqz v1, :cond_3

    .line 54
    .line 55
    invoke-virtual {v6, v1}, Ljava/lang/Class;->isInstance(Ljava/lang/Object;)Z

    .line 56
    .line 57
    .line 58
    move-result v6

    .line 59
    if-eqz v6, :cond_2

    .line 60
    .line 61
    goto :goto_0

    .line 62
    :cond_2
    new-instance v6, Ljava/lang/ClassCastException;

    .line 63
    .line 64
    new-instance v7, Ljava/lang/StringBuilder;

    .line 65
    .line 66
    invoke-direct {v7, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 67
    .line 68
    .line 69
    invoke-virtual {v7, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 70
    .line 71
    .line 72
    const-string p0, "\' returned wrong type; requested "

    .line 73
    .line 74
    invoke-virtual {v7, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 75
    .line 76
    .line 77
    invoke-virtual {v7, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 78
    .line 79
    .line 80
    const-string p0, " but got instance of "

    .line 81
    .line 82
    invoke-virtual {v7, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 83
    .line 84
    .line 85
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 86
    .line 87
    .line 88
    move-result-object p0

    .line 89
    invoke-virtual {v7, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 90
    .line 91
    .line 92
    const-string p0, "\nVerify that the adapter was registered for the correct type."

    .line 93
    .line 94
    invoke-virtual {v7, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 95
    .line 96
    .line 97
    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 98
    .line 99
    .line 100
    move-result-object p0

    .line 101
    invoke-direct {v6, p0}, Ljava/lang/ClassCastException;-><init>(Ljava/lang/String;)V

    .line 102
    .line 103
    .line 104
    throw v6
    :try_end_0
    .catch Ljava/io/EOFException; {:try_start_0 .. :try_end_0} :catch_3
    .catch Ljava/lang/IllegalStateException; {:try_start_0 .. :try_end_0} :catch_2
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/AssertionError; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 105
    :catchall_0
    move-exception p0

    .line 106
    goto :goto_7

    .line 107
    :catch_0
    move-exception p0

    .line 108
    goto :goto_1

    .line 109
    :catch_1
    move-exception p0

    .line 110
    goto :goto_2

    .line 111
    :catch_2
    move-exception p0

    .line 112
    goto :goto_3

    .line 113
    :catch_3
    move-exception p0

    .line 114
    goto :goto_4

    .line 115
    :cond_3
    :goto_0
    invoke-virtual {p1, v4}, Ll41;->L(I)V

    .line 116
    .line 117
    .line 118
    move-object p2, v1

    .line 119
    goto :goto_5

    .line 120
    :goto_1
    :try_start_1
    new-instance p2, Ljava/lang/AssertionError;

    .line 121
    .line 122
    new-instance v0, Ljava/lang/StringBuilder;

    .line 123
    .line 124
    invoke-direct {v0, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 125
    .line 126
    .line 127
    invoke-virtual {p0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 128
    .line 129
    .line 130
    move-result-object v1

    .line 131
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 132
    .line 133
    .line 134
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 135
    .line 136
    .line 137
    move-result-object v0

    .line 138
    invoke-direct {p2, v0, p0}, Ljava/lang/AssertionError;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 139
    .line 140
    .line 141
    throw p2

    .line 142
    :goto_2
    new-instance p2, Lt31;

    .line 143
    .line 144
    invoke-direct {p2, p0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    .line 145
    .line 146
    .line 147
    throw p2

    .line 148
    :goto_3
    new-instance p2, Lt31;

    .line 149
    .line 150
    invoke-direct {p2, p0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    .line 151
    .line 152
    .line 153
    throw p2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 154
    :goto_4
    if-eqz v5, :cond_6

    .line 155
    .line 156
    invoke-virtual {p1, v4}, Ll41;->L(I)V

    .line 157
    .line 158
    .line 159
    :goto_5
    if-eqz p2, :cond_5

    .line 160
    .line 161
    :try_start_2
    invoke-virtual {p1}, Ll41;->I()I

    .line 162
    .line 163
    .line 164
    move-result p0

    .line 165
    const/16 p1, 0xa

    .line 166
    .line 167
    if-ne p0, p1, :cond_4

    .line 168
    .line 169
    goto :goto_6

    .line 170
    :cond_4
    new-instance p0, Lt31;

    .line 171
    .line 172
    const-string p1, "JSON document was not fully consumed."

    .line 173
    .line 174
    invoke-direct {p0, p1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    .line 175
    .line 176
    .line 177
    throw p0
    :try_end_2
    .catch Lke1; {:try_start_2 .. :try_end_2} :catch_5
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_4

    .line 178
    :catch_4
    move-exception p0

    .line 179
    new-instance p1, Lt31;

    .line 180
    .line 181
    invoke-direct {p1, p0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    .line 182
    .line 183
    .line 184
    throw p1

    .line 185
    :catch_5
    move-exception p0

    .line 186
    new-instance p1, Lt31;

    .line 187
    .line 188
    invoke-direct {p1, p0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    .line 189
    .line 190
    .line 191
    throw p1

    .line 192
    :cond_5
    :goto_6
    return-object p2

    .line 193
    :cond_6
    :try_start_3
    new-instance p2, Lt31;

    .line 194
    .line 195
    invoke-direct {p2, p0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    .line 196
    .line 197
    .line 198
    throw p2
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 199
    :goto_7
    invoke-virtual {p1, v4}, Ll41;->L(I)V

    .line 200
    .line 201
    .line 202
    throw p0
.end method

.method public final c(Lj63;)Lq43;
    .locals 9

    .line 1
    iget-object v0, p0, Lir0;->b:Ljava/util/concurrent/ConcurrentHashMap;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    check-cast v1, Lq43;

    .line 8
    .line 9
    if-eqz v1, :cond_0

    .line 10
    .line 11
    return-object v1

    .line 12
    :cond_0
    iget-object v1, p0, Lir0;->a:Ljava/lang/ThreadLocal;

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
    check-cast v3, Lq43;

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
    new-instance v4, Lhr0;

    .line 43
    .line 44
    invoke-direct {v4}, Lhr0;-><init>()V

    .line 45
    .line 46
    .line 47
    invoke-interface {v2, p1, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 48
    .line 49
    .line 50
    iget-object v5, p0, Lir0;->e:Ljava/util/List;

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
    move-object v7, v6

    .line 58
    :cond_3
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    .line 59
    .line 60
    .line 61
    move-result v8

    .line 62
    if-eqz v8, :cond_5

    .line 63
    .line 64
    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 65
    .line 66
    .line 67
    move-result-object v7

    .line 68
    check-cast v7, Lr43;

    .line 69
    .line 70
    invoke-interface {v7, p0, p1}, Lr43;->a(Lir0;Lj63;)Lq43;

    .line 71
    .line 72
    .line 73
    move-result-object v7

    .line 74
    if-eqz v7, :cond_3

    .line 75
    .line 76
    iget-object p0, v4, Lhr0;->a:Lq43;

    .line 77
    .line 78
    if-nez p0, :cond_4

    .line 79
    .line 80
    iput-object v7, v4, Lhr0;->a:Lq43;

    .line 81
    .line 82
    invoke-interface {v2, p1, v7}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 83
    .line 84
    .line 85
    goto :goto_1

    .line 86
    :catchall_0
    move-exception p0

    .line 87
    goto :goto_2

    .line 88
    :cond_4
    new-instance p0, Ljava/lang/AssertionError;

    .line 89
    .line 90
    const-string p1, "Delegate is already set"

    .line 91
    .line 92
    invoke-direct {p0, p1}, Ljava/lang/AssertionError;-><init>(Ljava/lang/Object;)V

    .line 93
    .line 94
    .line 95
    throw p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 96
    :cond_5
    :goto_1
    if-eqz v3, :cond_6

    .line 97
    .line 98
    invoke-virtual {v1}, Ljava/lang/ThreadLocal;->remove()V

    .line 99
    .line 100
    .line 101
    :cond_6
    if-eqz v7, :cond_8

    .line 102
    .line 103
    if-eqz v3, :cond_7

    .line 104
    .line 105
    invoke-virtual {v0, v2}, Ljava/util/concurrent/ConcurrentHashMap;->putAll(Ljava/util/Map;)V

    .line 106
    .line 107
    .line 108
    :cond_7
    return-object v7

    .line 109
    :cond_8
    const-string p0, "GSON (2.13.1) cannot handle "

    .line 110
    .line 111
    invoke-static {p0, p1}, Ls;->g(Ljava/lang/String;Ljava/lang/Object;)V

    .line 112
    .line 113
    .line 114
    return-object v6

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
    throw p0
.end method

.method public final d(Ljava/io/Writer;)Lo41;
    .locals 1

    .line 1
    new-instance v0, Lo41;

    .line 2
    .line 3
    invoke-direct {v0, p1}, Lo41;-><init>(Ljava/io/Writer;)V

    .line 4
    .line 5
    .line 6
    iget-object p1, p0, Lir0;->g:Lrm0;

    .line 7
    .line 8
    invoke-virtual {v0, p1}, Lo41;->r(Lrm0;)V

    .line 9
    .line 10
    .line 11
    iget-boolean p0, p0, Lir0;->f:Z

    .line 12
    .line 13
    iput-boolean p0, v0, Lo41;->p:Z

    .line 14
    .line 15
    const/4 p0, 0x2

    .line 16
    invoke-virtual {v0, p0}, Lo41;->t(I)V

    .line 17
    .line 18
    .line 19
    const/4 p0, 0x0

    .line 20
    iput-boolean p0, v0, Lo41;->r:Z

    .line 21
    .line 22
    return-object v0
.end method

.method public final e(Ljava/lang/Object;)Ljava/lang/String;
    .locals 3

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    new-instance v1, Ljava/io/StringWriter;

    .line 6
    .line 7
    invoke-direct {v1}, Ljava/io/StringWriter;-><init>()V

    .line 8
    .line 9
    .line 10
    :try_start_0
    invoke-virtual {p0, v1}, Lir0;->d(Ljava/io/Writer;)Lo41;

    .line 11
    .line 12
    .line 13
    move-result-object v2

    .line 14
    invoke-virtual {p0, p1, v0, v2}, Lir0;->f(Ljava/lang/Object;Ljava/lang/Class;Lo41;)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 15
    .line 16
    .line 17
    invoke-virtual {v1}, Ljava/io/StringWriter;->toString()Ljava/lang/String;

    .line 18
    .line 19
    .line 20
    move-result-object p0

    .line 21
    return-object p0

    .line 22
    :catch_0
    move-exception p0

    .line 23
    new-instance p1, Lt31;

    .line 24
    .line 25
    invoke-direct {p1, p0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    .line 26
    .line 27
    .line 28
    throw p1
.end method

.method public final f(Ljava/lang/Object;Ljava/lang/Class;Lo41;)V
    .locals 4

    .line 1
    const-string v0, "AssertionError (GSON 2.13.1): "

    .line 2
    .line 3
    new-instance v1, Lj63;

    .line 4
    .line 5
    invoke-direct {v1, p2}, Lj63;-><init>(Ljava/lang/reflect/Type;)V

    .line 6
    .line 7
    .line 8
    invoke-virtual {p0, v1}, Lir0;->c(Lj63;)Lq43;

    .line 9
    .line 10
    .line 11
    move-result-object p2

    .line 12
    iget v1, p3, Lo41;->o:I

    .line 13
    .line 14
    const/4 v2, 0x2

    .line 15
    if-ne v1, v2, :cond_0

    .line 16
    .line 17
    const/4 v2, 0x1

    .line 18
    iput v2, p3, Lo41;->o:I

    .line 19
    .line 20
    :cond_0
    iget-boolean v2, p3, Lo41;->p:Z

    .line 21
    .line 22
    iget-boolean v3, p3, Lo41;->r:Z

    .line 23
    .line 24
    iget-boolean p0, p0, Lir0;->f:Z

    .line 25
    .line 26
    iput-boolean p0, p3, Lo41;->p:Z

    .line 27
    .line 28
    const/4 p0, 0x0

    .line 29
    iput-boolean p0, p3, Lo41;->r:Z

    .line 30
    .line 31
    :try_start_0
    invoke-virtual {p2, p3, p1}, Lq43;->c(Lo41;Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/AssertionError; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 32
    .line 33
    .line 34
    invoke-virtual {p3, v1}, Lo41;->t(I)V

    .line 35
    .line 36
    .line 37
    iput-boolean v2, p3, Lo41;->p:Z

    .line 38
    .line 39
    iput-boolean v3, p3, Lo41;->r:Z

    .line 40
    .line 41
    return-void

    .line 42
    :catchall_0
    move-exception p0

    .line 43
    goto :goto_0

    .line 44
    :catch_0
    move-exception p0

    .line 45
    :try_start_1
    new-instance p1, Ljava/lang/AssertionError;

    .line 46
    .line 47
    new-instance p2, Ljava/lang/StringBuilder;

    .line 48
    .line 49
    invoke-direct {p2, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 50
    .line 51
    .line 52
    invoke-virtual {p0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 53
    .line 54
    .line 55
    move-result-object v0

    .line 56
    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 57
    .line 58
    .line 59
    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 60
    .line 61
    .line 62
    move-result-object p2

    .line 63
    invoke-direct {p1, p2, p0}, Ljava/lang/AssertionError;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 64
    .line 65
    .line 66
    throw p1

    .line 67
    :catch_1
    move-exception p0

    .line 68
    new-instance p1, Lt31;

    .line 69
    .line 70
    invoke-direct {p1, p0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    .line 71
    .line 72
    .line 73
    throw p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 74
    :goto_0
    invoke-virtual {p3, v1}, Lo41;->t(I)V

    .line 75
    .line 76
    .line 77
    iput-boolean v2, p3, Lo41;->p:Z

    .line 78
    .line 79
    iput-boolean v3, p3, Lo41;->r:Z

    .line 80
    .line 81
    throw p0
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
    iget-object v1, p0, Lir0;->e:Ljava/util/List;

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
    iget-object p0, p0, Lir0;->c:Lsz0;

    .line 19
    .line 20
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 21
    .line 22
    .line 23
    const-string p0, "}"

    .line 24
    .line 25
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 26
    .line 27
    .line 28
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 29
    .line 30
    .line 31
    move-result-object p0

    .line 32
    return-object p0
.end method
