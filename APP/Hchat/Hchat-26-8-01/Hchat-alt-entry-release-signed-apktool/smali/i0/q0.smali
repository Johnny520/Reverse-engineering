.class public final Li0/q0;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Lfg/l;


# instance fields
.field public final synthetic g:I

.field public final synthetic h:Ljava/lang/Object;

.field public final synthetic i:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;ILjava/lang/Object;)V
    .locals 0

    .line 1
    iput p2, p0, Li0/q0;->g:I

    .line 2
    .line 3
    iput-object p1, p0, Li0/q0;->h:Ljava/lang/Object;

    .line 4
    .line 5
    iput-object p3, p0, Li0/q0;->i:Ljava/lang/Object;

    .line 6
    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 8
    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 6

    .line 1
    iget v0, p0, Li0/q0;->g:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    check-cast p1, Ljava/lang/Class;

    .line 7
    .line 8
    iget-object v0, p0, Li0/q0;->h:Ljava/lang/Object;

    .line 9
    .line 10
    move-object v1, v0

    .line 11
    check-cast v1, Lq6/b;

    .line 12
    .line 13
    iget-object v0, p0, Li0/q0;->i:Ljava/lang/Object;

    .line 14
    .line 15
    move-object v2, v0

    .line 16
    check-cast v2, Lr6/c;

    .line 17
    .line 18
    const-class v3, Ljava/lang/reflect/Field;

    .line 19
    .line 20
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 21
    .line 22
    .line 23
    :try_start_0
    invoke-virtual {p1}, Ljava/lang/Class;->getDeclaredFields()[Ljava/lang/reflect/Field;

    .line 24
    .line 25
    .line 26
    move-result-object p1

    .line 27
    invoke-static {p1}, Ltf/l;->L0([Ljava/lang/Object;)Ljava/util/List;

    .line 28
    .line 29
    .line 30
    move-result-object p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 31
    goto :goto_0

    .line 32
    :catchall_0
    move-exception v0

    .line 33
    move-object p1, v0

    .line 34
    new-instance v0, Lsf/f;

    .line 35
    .line 36
    invoke-direct {v0, p1}, Lsf/f;-><init>(Ljava/lang/Throwable;)V

    .line 37
    .line 38
    .line 39
    move-object p1, v0

    .line 40
    :goto_0
    invoke-static {p1}, Lsf/g;->b(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 41
    .line 42
    .line 43
    move-result-object v0

    .line 44
    if-eqz v0, :cond_0

    .line 45
    .line 46
    sget-object v0, Ly6/b;->a:Ly6/a;

    .line 47
    .line 48
    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    .line 49
    .line 50
    .line 51
    :cond_0
    instance-of v0, p1, Lsf/f;

    .line 52
    .line 53
    const/4 v4, 0x0

    .line 54
    if-eqz v0, :cond_1

    .line 55
    .line 56
    move-object p1, v4

    .line 57
    :cond_1
    check-cast p1, Ljava/util/List;

    .line 58
    .line 59
    if-nez p1, :cond_2

    .line 60
    .line 61
    sget-object p1, Ltf/t;->g:Ltf/t;

    .line 62
    .line 63
    :cond_2
    new-instance v0, Ldg/n;

    .line 64
    .line 65
    const/4 v5, 0x6

    .line 66
    invoke-direct {v0, p1, v5}, Ldg/n;-><init>(Ljava/lang/Object;I)V

    .line 67
    .line 68
    .line 69
    invoke-static {v0, v1, v2}, Lx6/g;->b(Ldg/n;Lr6/d;Lr6/c;)Lng/i;

    .line 70
    .line 71
    .line 72
    move-result-object p1

    .line 73
    sget-object v0, Lx6/f;->i:Lx6/f;

    .line 74
    .line 75
    invoke-static {p1, v0}, Lng/m;->W(Lng/j;Lfg/l;)Lng/t;

    .line 76
    .line 77
    .line 78
    move-result-object p1

    .line 79
    const-string v0, "isEnumConstant"

    .line 80
    .line 81
    new-instance v1, Lwb/m0;

    .line 82
    .line 83
    const/16 v5, 0xc

    .line 84
    .line 85
    invoke-direct {v1, v5}, Lwb/m0;-><init>(I)V

    .line 86
    .line 87
    .line 88
    invoke-static {p1, v2, v0, v4, v1}, Lx6/g;->h(Lng/j;Lr6/c;Ljava/lang/String;Ljava/lang/Object;Lfg/p;)Lng/i;

    .line 89
    .line 90
    .line 91
    move-result-object p1

    .line 92
    const-string v0, "isEnumConstantNot"

    .line 93
    .line 94
    new-instance v1, Lwb/m0;

    .line 95
    .line 96
    const/16 v5, 0xd

    .line 97
    .line 98
    invoke-direct {v1, v5}, Lwb/m0;-><init>(I)V

    .line 99
    .line 100
    .line 101
    invoke-static {p1, v2, v0, v4, v1}, Lx6/g;->h(Lng/j;Lr6/c;Ljava/lang/String;Ljava/lang/Object;Lfg/p;)Lng/i;

    .line 102
    .line 103
    .line 104
    move-result-object p1

    .line 105
    const-string v0, "type"

    .line 106
    .line 107
    new-instance v1, Lx6/a;

    .line 108
    .line 109
    const/4 v5, 0x0

    .line 110
    invoke-direct {v1, v2, v5}, Lx6/a;-><init>(Lr6/c;I)V

    .line 111
    .line 112
    .line 113
    invoke-static {p1, v2, v0, v4, v1}, Lx6/g;->h(Lng/j;Lr6/c;Ljava/lang/String;Ljava/lang/Object;Lfg/p;)Lng/i;

    .line 114
    .line 115
    .line 116
    move-result-object p1

    .line 117
    const-string v0, "typeCondition"

    .line 118
    .line 119
    new-instance v1, Lwb/m0;

    .line 120
    .line 121
    const/16 v5, 0xe

    .line 122
    .line 123
    invoke-direct {v1, v5}, Lwb/m0;-><init>(I)V

    .line 124
    .line 125
    .line 126
    invoke-static {p1, v2, v0, v4, v1}, Lx6/g;->h(Lng/j;Lr6/c;Ljava/lang/String;Ljava/lang/Object;Lfg/p;)Lng/i;

    .line 127
    .line 128
    .line 129
    move-result-object p1

    .line 130
    const-string v0, "genericType"

    .line 131
    .line 132
    new-instance v1, Lwb/m0;

    .line 133
    .line 134
    const/16 v5, 0xf

    .line 135
    .line 136
    invoke-direct {v1, v5}, Lwb/m0;-><init>(I)V

    .line 137
    .line 138
    .line 139
    invoke-static {p1, v2, v0, v4, v1}, Lx6/g;->h(Lng/j;Lr6/c;Ljava/lang/String;Ljava/lang/Object;Lfg/p;)Lng/i;

    .line 140
    .line 141
    .line 142
    move-result-object p1

    .line 143
    const-string v0, "genericTypeCondition"

    .line 144
    .line 145
    new-instance v1, Lwb/m0;

    .line 146
    .line 147
    const/16 v5, 0x10

    .line 148
    .line 149
    invoke-direct {v1, v5}, Lwb/m0;-><init>(I)V

    .line 150
    .line 151
    .line 152
    invoke-static {p1, v2, v0, v4, v1}, Lx6/g;->h(Lng/j;Lr6/c;Ljava/lang/String;Ljava/lang/Object;Lfg/p;)Lng/i;

    .line 153
    .line 154
    .line 155
    move-result-object p1

    .line 156
    new-instance v0, Lwb/sr;

    .line 157
    .line 158
    const/16 v1, 0x11

    .line 159
    .line 160
    invoke-direct {v0, v1}, Lwb/sr;-><init>(I)V

    .line 161
    .line 162
    .line 163
    invoke-static {p1, v0}, Lng/m;->W(Lng/j;Lfg/l;)Lng/t;

    .line 164
    .line 165
    .line 166
    move-result-object p1

    .line 167
    invoke-static {v3}, Lgg/v;->a(Ljava/lang/Class;)Lgg/f;

    .line 168
    .line 169
    .line 170
    move-result-object v0

    .line 171
    const-class v1, Ljava/lang/reflect/Method;

    .line 172
    .line 173
    invoke-static {v1}, Lgg/v;->a(Ljava/lang/Class;)Lgg/f;

    .line 174
    .line 175
    .line 176
    move-result-object v1

    .line 177
    invoke-virtual {v0, v1}, Lgg/f;->equals(Ljava/lang/Object;)Z

    .line 178
    .line 179
    .line 180
    move-result v1

    .line 181
    if-eqz v1, :cond_3

    .line 182
    .line 183
    new-instance v0, Lx6/e;

    .line 184
    .line 185
    const/4 v1, 0x3

    .line 186
    invoke-direct {v0, v2, v1}, Lx6/e;-><init>(Lr6/c;I)V

    .line 187
    .line 188
    .line 189
    invoke-static {p1, v0}, Lng/m;->W(Lng/j;Lfg/l;)Lng/t;

    .line 190
    .line 191
    .line 192
    move-result-object p1

    .line 193
    goto :goto_1

    .line 194
    :cond_3
    const-class v1, Ljava/lang/reflect/Constructor;

    .line 195
    .line 196
    invoke-static {v1}, Lgg/v;->a(Ljava/lang/Class;)Lgg/f;

    .line 197
    .line 198
    .line 199
    move-result-object v1

    .line 200
    invoke-virtual {v0, v1}, Lgg/f;->equals(Ljava/lang/Object;)Z

    .line 201
    .line 202
    .line 203
    move-result v1

    .line 204
    if-eqz v1, :cond_4

    .line 205
    .line 206
    new-instance v0, Lx6/e;

    .line 207
    .line 208
    const/4 v1, 0x4

    .line 209
    invoke-direct {v0, v2, v1}, Lx6/e;-><init>(Lr6/c;I)V

    .line 210
    .line 211
    .line 212
    invoke-static {p1, v0}, Lng/m;->W(Lng/j;Lfg/l;)Lng/t;

    .line 213
    .line 214
    .line 215
    move-result-object p1

    .line 216
    goto :goto_1

    .line 217
    :cond_4
    invoke-static {v3}, Lgg/v;->a(Ljava/lang/Class;)Lgg/f;

    .line 218
    .line 219
    .line 220
    move-result-object v1

    .line 221
    invoke-virtual {v0, v1}, Lgg/f;->equals(Ljava/lang/Object;)Z

    .line 222
    .line 223
    .line 224
    move-result v0

    .line 225
    if-eqz v0, :cond_5

    .line 226
    .line 227
    new-instance v0, Lx6/e;

    .line 228
    .line 229
    const/4 v1, 0x5

    .line 230
    invoke-direct {v0, v2, v1}, Lx6/e;-><init>(Lr6/c;I)V

    .line 231
    .line 232
    .line 233
    invoke-static {p1, v0}, Lng/m;->W(Lng/j;Lfg/l;)Lng/t;

    .line 234
    .line 235
    .line 236
    move-result-object p1

    .line 237
    :goto_1
    invoke-static {p1}, Lng/m;->b0(Lng/j;)Ljava/util/List;

    .line 238
    .line 239
    .line 240
    move-result-object p1

    .line 241
    goto :goto_2

    .line 242
    :cond_5
    const-string v0, "Unsupported member type: "

    .line 243
    .line 244
    invoke-static {p1, v0}, Lokio/a;->p(Ljava/lang/Object;Ljava/lang/String;)V

    .line 245
    .line 246
    .line 247
    const/4 p1, 0x0

    .line 248
    :goto_2
    return-object p1

    .line 249
    :pswitch_0
    check-cast p1, Ljava/lang/Class;

    .line 250
    .line 251
    iget-object v0, p0, Li0/q0;->h:Ljava/lang/Object;

    .line 252
    .line 253
    check-cast v0, Lr6/d;

    .line 254
    .line 255
    move-object v1, v0

    .line 256
    check-cast v1, Lq6/c;

    .line 257
    .line 258
    iget-object v0, p0, Li0/q0;->i:Ljava/lang/Object;

    .line 259
    .line 260
    move-object v2, v0

    .line 261
    check-cast v2, Lr6/c;

    .line 262
    .line 263
    const-class v3, Ljava/lang/reflect/Method;

    .line 264
    .line 265
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 266
    .line 267
    .line 268
    :try_start_1
    invoke-virtual {p1}, Ljava/lang/Class;->getDeclaredMethods()[Ljava/lang/reflect/Method;

    .line 269
    .line 270
    .line 271
    move-result-object p1

    .line 272
    invoke-static {p1}, Ltf/l;->L0([Ljava/lang/Object;)Ljava/util/List;

    .line 273
    .line 274
    .line 275
    move-result-object p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 276
    goto :goto_3

    .line 277
    :catchall_1
    move-exception v0

    .line 278
    move-object p1, v0

    .line 279
    new-instance v0, Lsf/f;

    .line 280
    .line 281
    invoke-direct {v0, p1}, Lsf/f;-><init>(Ljava/lang/Throwable;)V

    .line 282
    .line 283
    .line 284
    move-object p1, v0

    .line 285
    :goto_3
    invoke-static {p1}, Lsf/g;->b(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 286
    .line 287
    .line 288
    move-result-object v0

    .line 289
    if-eqz v0, :cond_6

    .line 290
    .line 291
    sget-object v0, Ly6/b;->a:Ly6/a;

    .line 292
    .line 293
    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    .line 294
    .line 295
    .line 296
    :cond_6
    instance-of v0, p1, Lsf/f;

    .line 297
    .line 298
    const/4 v4, 0x0

    .line 299
    if-eqz v0, :cond_7

    .line 300
    .line 301
    move-object p1, v4

    .line 302
    :cond_7
    check-cast p1, Ljava/util/List;

    .line 303
    .line 304
    if-nez p1, :cond_8

    .line 305
    .line 306
    sget-object p1, Ltf/t;->g:Ltf/t;

    .line 307
    .line 308
    :cond_8
    new-instance v0, Ldg/n;

    .line 309
    .line 310
    const/4 v5, 0x6

    .line 311
    invoke-direct {v0, p1, v5}, Ldg/n;-><init>(Ljava/lang/Object;I)V

    .line 312
    .line 313
    .line 314
    invoke-static {v0, v1, v2}, Lx6/g;->b(Ldg/n;Lr6/d;Lr6/c;)Lng/i;

    .line 315
    .line 316
    .line 317
    move-result-object p1

    .line 318
    invoke-static {p1, v1, v2}, Lx6/g;->g(Lng/i;Lr6/a;Lr6/c;)Lng/i;

    .line 319
    .line 320
    .line 321
    move-result-object p1

    .line 322
    sget-object v0, Lx6/f;->j:Lx6/f;

    .line 323
    .line 324
    invoke-static {p1, v0}, Lng/m;->W(Lng/j;Lfg/l;)Lng/t;

    .line 325
    .line 326
    .line 327
    move-result-object p1

    .line 328
    const-string v0, "returnType"

    .line 329
    .line 330
    new-instance v1, Lx6/a;

    .line 331
    .line 332
    const/4 v5, 0x2

    .line 333
    invoke-direct {v1, v2, v5}, Lx6/a;-><init>(Lr6/c;I)V

    .line 334
    .line 335
    .line 336
    invoke-static {p1, v2, v0, v4, v1}, Lx6/g;->h(Lng/j;Lr6/c;Ljava/lang/String;Ljava/lang/Object;Lfg/p;)Lng/i;

    .line 337
    .line 338
    .line 339
    move-result-object p1

    .line 340
    const-string v0, "returnTypeCondition"

    .line 341
    .line 342
    new-instance v1, Lwb/m0;

    .line 343
    .line 344
    const/16 v5, 0x16

    .line 345
    .line 346
    invoke-direct {v1, v5}, Lwb/m0;-><init>(I)V

    .line 347
    .line 348
    .line 349
    invoke-static {p1, v2, v0, v4, v1}, Lx6/g;->h(Lng/j;Lr6/c;Ljava/lang/String;Ljava/lang/Object;Lfg/p;)Lng/i;

    .line 350
    .line 351
    .line 352
    move-result-object p1

    .line 353
    const-string v0, "genericReturnType"

    .line 354
    .line 355
    new-instance v1, Lwb/m0;

    .line 356
    .line 357
    const/16 v5, 0x1c

    .line 358
    .line 359
    invoke-direct {v1, v5}, Lwb/m0;-><init>(I)V

    .line 360
    .line 361
    .line 362
    invoke-static {p1, v2, v0, v4, v1}, Lx6/g;->h(Lng/j;Lr6/c;Ljava/lang/String;Ljava/lang/Object;Lfg/p;)Lng/i;

    .line 363
    .line 364
    .line 365
    move-result-object p1

    .line 366
    const-string v0, "genericReturnTypeCondition"

    .line 367
    .line 368
    new-instance v1, Lx6/c;

    .line 369
    .line 370
    const/4 v5, 0x5

    .line 371
    invoke-direct {v1, v5}, Lx6/c;-><init>(I)V

    .line 372
    .line 373
    .line 374
    invoke-static {p1, v2, v0, v4, v1}, Lx6/g;->h(Lng/j;Lr6/c;Ljava/lang/String;Ljava/lang/Object;Lfg/p;)Lng/i;

    .line 375
    .line 376
    .line 377
    move-result-object p1

    .line 378
    const-string v0, "isBridge"

    .line 379
    .line 380
    new-instance v1, Lx6/c;

    .line 381
    .line 382
    const/16 v5, 0x9

    .line 383
    .line 384
    invoke-direct {v1, v5}, Lx6/c;-><init>(I)V

    .line 385
    .line 386
    .line 387
    invoke-static {p1, v2, v0, v4, v1}, Lx6/g;->h(Lng/j;Lr6/c;Ljava/lang/String;Ljava/lang/Object;Lfg/p;)Lng/i;

    .line 388
    .line 389
    .line 390
    move-result-object p1

    .line 391
    const-string v0, "isBridgeNot"

    .line 392
    .line 393
    new-instance v1, Lx6/c;

    .line 394
    .line 395
    const/16 v5, 0xa

    .line 396
    .line 397
    invoke-direct {v1, v5}, Lx6/c;-><init>(I)V

    .line 398
    .line 399
    .line 400
    invoke-static {p1, v2, v0, v4, v1}, Lx6/g;->h(Lng/j;Lr6/c;Ljava/lang/String;Ljava/lang/Object;Lfg/p;)Lng/i;

    .line 401
    .line 402
    .line 403
    move-result-object p1

    .line 404
    const-string v0, "isDefault"

    .line 405
    .line 406
    new-instance v1, Lx6/c;

    .line 407
    .line 408
    const/16 v5, 0xb

    .line 409
    .line 410
    invoke-direct {v1, v5}, Lx6/c;-><init>(I)V

    .line 411
    .line 412
    .line 413
    invoke-static {p1, v2, v0, v4, v1}, Lx6/g;->h(Lng/j;Lr6/c;Ljava/lang/String;Ljava/lang/Object;Lfg/p;)Lng/i;

    .line 414
    .line 415
    .line 416
    move-result-object p1

    .line 417
    const-string v0, "isDefaultNot"

    .line 418
    .line 419
    new-instance v1, Lx6/c;

    .line 420
    .line 421
    const/16 v5, 0xc

    .line 422
    .line 423
    invoke-direct {v1, v5}, Lx6/c;-><init>(I)V

    .line 424
    .line 425
    .line 426
    invoke-static {p1, v2, v0, v4, v1}, Lx6/g;->h(Lng/j;Lr6/c;Ljava/lang/String;Ljava/lang/Object;Lfg/p;)Lng/i;

    .line 427
    .line 428
    .line 429
    move-result-object p1

    .line 430
    const-string v0, "defaultValue"

    .line 431
    .line 432
    new-instance v1, Lx6/c;

    .line 433
    .line 434
    const/16 v5, 0xd

    .line 435
    .line 436
    invoke-direct {v1, v5}, Lx6/c;-><init>(I)V

    .line 437
    .line 438
    .line 439
    invoke-static {p1, v2, v0, v4, v1}, Lx6/g;->h(Lng/j;Lr6/c;Ljava/lang/String;Ljava/lang/Object;Lfg/p;)Lng/i;

    .line 440
    .line 441
    .line 442
    move-result-object p1

    .line 443
    const-string v0, "defaultValueCondition"

    .line 444
    .line 445
    new-instance v1, Lwb/m0;

    .line 446
    .line 447
    const/16 v5, 0xb

    .line 448
    .line 449
    invoke-direct {v1, v5}, Lwb/m0;-><init>(I)V

    .line 450
    .line 451
    .line 452
    invoke-static {p1, v2, v0, v4, v1}, Lx6/g;->h(Lng/j;Lr6/c;Ljava/lang/String;Ljava/lang/Object;Lfg/p;)Lng/i;

    .line 453
    .line 454
    .line 455
    move-result-object p1

    .line 456
    new-instance v0, Lwb/sr;

    .line 457
    .line 458
    const/16 v1, 0x11

    .line 459
    .line 460
    invoke-direct {v0, v1}, Lwb/sr;-><init>(I)V

    .line 461
    .line 462
    .line 463
    invoke-static {p1, v0}, Lng/m;->W(Lng/j;Lfg/l;)Lng/t;

    .line 464
    .line 465
    .line 466
    move-result-object p1

    .line 467
    invoke-static {v3}, Lgg/v;->a(Ljava/lang/Class;)Lgg/f;

    .line 468
    .line 469
    .line 470
    move-result-object v0

    .line 471
    invoke-static {v3}, Lgg/v;->a(Ljava/lang/Class;)Lgg/f;

    .line 472
    .line 473
    .line 474
    move-result-object v1

    .line 475
    invoke-virtual {v0, v1}, Lgg/f;->equals(Ljava/lang/Object;)Z

    .line 476
    .line 477
    .line 478
    move-result v1

    .line 479
    if-eqz v1, :cond_9

    .line 480
    .line 481
    new-instance v0, Lx6/e;

    .line 482
    .line 483
    const/4 v1, 0x6

    .line 484
    invoke-direct {v0, v2, v1}, Lx6/e;-><init>(Lr6/c;I)V

    .line 485
    .line 486
    .line 487
    invoke-static {p1, v0}, Lng/m;->W(Lng/j;Lfg/l;)Lng/t;

    .line 488
    .line 489
    .line 490
    move-result-object p1

    .line 491
    goto :goto_4

    .line 492
    :cond_9
    const-class v1, Ljava/lang/reflect/Constructor;

    .line 493
    .line 494
    invoke-static {v1}, Lgg/v;->a(Ljava/lang/Class;)Lgg/f;

    .line 495
    .line 496
    .line 497
    move-result-object v1

    .line 498
    invoke-virtual {v0, v1}, Lgg/f;->equals(Ljava/lang/Object;)Z

    .line 499
    .line 500
    .line 501
    move-result v1

    .line 502
    if-eqz v1, :cond_a

    .line 503
    .line 504
    new-instance v0, Lx6/e;

    .line 505
    .line 506
    const/4 v1, 0x7

    .line 507
    invoke-direct {v0, v2, v1}, Lx6/e;-><init>(Lr6/c;I)V

    .line 508
    .line 509
    .line 510
    invoke-static {p1, v0}, Lng/m;->W(Lng/j;Lfg/l;)Lng/t;

    .line 511
    .line 512
    .line 513
    move-result-object p1

    .line 514
    goto :goto_4

    .line 515
    :cond_a
    const-class v1, Ljava/lang/reflect/Field;

    .line 516
    .line 517
    invoke-static {v1}, Lgg/v;->a(Ljava/lang/Class;)Lgg/f;

    .line 518
    .line 519
    .line 520
    move-result-object v1

    .line 521
    invoke-virtual {v0, v1}, Lgg/f;->equals(Ljava/lang/Object;)Z

    .line 522
    .line 523
    .line 524
    move-result v0

    .line 525
    if-eqz v0, :cond_b

    .line 526
    .line 527
    new-instance v0, Lx6/e;

    .line 528
    .line 529
    const/16 v1, 0x8

    .line 530
    .line 531
    invoke-direct {v0, v2, v1}, Lx6/e;-><init>(Lr6/c;I)V

    .line 532
    .line 533
    .line 534
    invoke-static {p1, v0}, Lng/m;->W(Lng/j;Lfg/l;)Lng/t;

    .line 535
    .line 536
    .line 537
    move-result-object p1

    .line 538
    :goto_4
    invoke-static {p1}, Lng/m;->b0(Lng/j;)Ljava/util/List;

    .line 539
    .line 540
    .line 541
    move-result-object p1

    .line 542
    goto :goto_5

    .line 543
    :cond_b
    const-string v0, "Unsupported member type: "

    .line 544
    .line 545
    invoke-static {p1, v0}, Lokio/a;->p(Ljava/lang/Object;Ljava/lang/String;)V

    .line 546
    .line 547
    .line 548
    const/4 p1, 0x0

    .line 549
    :goto_5
    return-object p1

    .line 550
    :pswitch_1
    check-cast p1, Ljava/lang/Number;

    .line 551
    .line 552
    invoke-virtual {p1}, Ljava/lang/Number;->intValue()I

    .line 553
    .line 554
    .line 555
    move-result p1

    .line 556
    iget-object v0, p0, Li0/q0;->h:Ljava/lang/Object;

    .line 557
    .line 558
    check-cast v0, Lwb/sr;

    .line 559
    .line 560
    iget-object v1, p0, Li0/q0;->i:Ljava/lang/Object;

    .line 561
    .line 562
    check-cast v1, Ljava/util/ArrayList;

    .line 563
    .line 564
    invoke-virtual {v1, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 565
    .line 566
    .line 567
    move-result-object p1

    .line 568
    invoke-virtual {v0, p1}, Lwb/sr;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 569
    .line 570
    .line 571
    move-result-object p1

    .line 572
    return-object p1

    .line 573
    :pswitch_2
    move-object v3, p1

    .line 574
    check-cast v3, Lw0/j;

    .line 575
    .line 576
    sget-object p1, Lw0/m;->c:Ljava/lang/Object;

    .line 577
    .line 578
    monitor-enter p1

    .line 579
    :try_start_2
    sget-wide v1, Lw0/m;->e:J

    .line 580
    .line 581
    const/4 v0, 0x1

    .line 582
    int-to-long v4, v0

    .line 583
    add-long/2addr v4, v1

    .line 584
    sput-wide v4, Lw0/m;->e:J
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    .line 585
    .line 586
    monitor-exit p1

    .line 587
    iget-object p1, p0, Li0/q0;->h:Ljava/lang/Object;

    .line 588
    .line 589
    move-object v4, p1

    .line 590
    check-cast v4, Lfg/l;

    .line 591
    .line 592
    iget-object p1, p0, Li0/q0;->i:Ljava/lang/Object;

    .line 593
    .line 594
    move-object v5, p1

    .line 595
    check-cast v5, Lfg/l;

    .line 596
    .line 597
    new-instance v0, Lw0/b;

    .line 598
    .line 599
    invoke-direct/range {v0 .. v5}, Lw0/b;-><init>(JLw0/j;Lfg/l;Lfg/l;)V

    .line 600
    .line 601
    .line 602
    return-object v0

    .line 603
    :catchall_2
    move-exception v0

    .line 604
    monitor-exit p1

    .line 605
    throw v0

    .line 606
    :pswitch_3
    check-cast p1, Lq1/b;

    .line 607
    .line 608
    iget-object p1, p1, Lq1/b;->a:Landroid/view/KeyEvent;

    .line 609
    .line 610
    iget-object v0, p0, Li0/q0;->h:Ljava/lang/Object;

    .line 611
    .line 612
    check-cast v0, Ld1/l;

    .line 613
    .line 614
    invoke-virtual {p1}, Landroid/view/InputEvent;->getDevice()Landroid/view/InputDevice;

    .line 615
    .line 616
    .line 617
    move-result-object v1

    .line 618
    const/4 v2, 0x0

    .line 619
    if-nez v1, :cond_c

    .line 620
    .line 621
    goto/16 :goto_6

    .line 622
    .line 623
    :cond_c
    const/16 v3, 0x201

    .line 624
    .line 625
    invoke-virtual {v1, v3}, Landroid/view/InputDevice;->supportsSource(I)Z

    .line 626
    .line 627
    .line 628
    move-result v3

    .line 629
    if-nez v3, :cond_d

    .line 630
    .line 631
    goto/16 :goto_6

    .line 632
    .line 633
    :cond_d
    invoke-virtual {v1}, Landroid/view/InputDevice;->isVirtual()Z

    .line 634
    .line 635
    .line 636
    move-result v1

    .line 637
    if-eqz v1, :cond_e

    .line 638
    .line 639
    invoke-virtual {p1}, Landroid/view/KeyEvent;->getSource()I

    .line 640
    .line 641
    .line 642
    move-result v1

    .line 643
    const v3, 0x2000001

    .line 644
    .line 645
    .line 646
    if-eq v1, v3, :cond_e

    .line 647
    .line 648
    goto :goto_6

    .line 649
    :cond_e
    invoke-static {p1}, Lq1/d;->c(Landroid/view/KeyEvent;)I

    .line 650
    .line 651
    .line 652
    move-result v1

    .line 653
    const/4 v3, 0x2

    .line 654
    if-ne v1, v3, :cond_15

    .line 655
    .line 656
    invoke-virtual {p1}, Landroid/view/KeyEvent;->getSource()I

    .line 657
    .line 658
    .line 659
    move-result v1

    .line 660
    const/16 v3, 0x101

    .line 661
    .line 662
    if-ne v1, v3, :cond_f

    .line 663
    .line 664
    goto :goto_6

    .line 665
    :cond_f
    const/16 v1, 0x13

    .line 666
    .line 667
    invoke-static {v1, p1}, Lw/s;->l(ILandroid/view/KeyEvent;)Z

    .line 668
    .line 669
    .line 670
    move-result v1

    .line 671
    const/4 v3, 0x1

    .line 672
    if-eqz v1, :cond_10

    .line 673
    .line 674
    const/4 p1, 0x5

    .line 675
    check-cast v0, Ld1/p;

    .line 676
    .line 677
    invoke-virtual {v0, p1, v3}, Ld1/p;->g(IZ)Z

    .line 678
    .line 679
    .line 680
    move-result v2

    .line 681
    goto :goto_6

    .line 682
    :cond_10
    const/16 v1, 0x14

    .line 683
    .line 684
    invoke-static {v1, p1}, Lw/s;->l(ILandroid/view/KeyEvent;)Z

    .line 685
    .line 686
    .line 687
    move-result v1

    .line 688
    if-eqz v1, :cond_11

    .line 689
    .line 690
    const/4 p1, 0x6

    .line 691
    check-cast v0, Ld1/p;

    .line 692
    .line 693
    invoke-virtual {v0, p1, v3}, Ld1/p;->g(IZ)Z

    .line 694
    .line 695
    .line 696
    move-result v2

    .line 697
    goto :goto_6

    .line 698
    :cond_11
    const/16 v1, 0x15

    .line 699
    .line 700
    invoke-static {v1, p1}, Lw/s;->l(ILandroid/view/KeyEvent;)Z

    .line 701
    .line 702
    .line 703
    move-result v1

    .line 704
    if-eqz v1, :cond_12

    .line 705
    .line 706
    const/4 p1, 0x3

    .line 707
    check-cast v0, Ld1/p;

    .line 708
    .line 709
    invoke-virtual {v0, p1, v3}, Ld1/p;->g(IZ)Z

    .line 710
    .line 711
    .line 712
    move-result v2

    .line 713
    goto :goto_6

    .line 714
    :cond_12
    const/16 v1, 0x16

    .line 715
    .line 716
    invoke-static {v1, p1}, Lw/s;->l(ILandroid/view/KeyEvent;)Z

    .line 717
    .line 718
    .line 719
    move-result v1

    .line 720
    if-eqz v1, :cond_13

    .line 721
    .line 722
    const/4 p1, 0x4

    .line 723
    check-cast v0, Ld1/p;

    .line 724
    .line 725
    invoke-virtual {v0, p1, v3}, Ld1/p;->g(IZ)Z

    .line 726
    .line 727
    .line 728
    move-result v2

    .line 729
    goto :goto_6

    .line 730
    :cond_13
    const/16 v0, 0x17

    .line 731
    .line 732
    invoke-static {v0, p1}, Lw/s;->l(ILandroid/view/KeyEvent;)Z

    .line 733
    .line 734
    .line 735
    move-result p1

    .line 736
    if-eqz p1, :cond_15

    .line 737
    .line 738
    iget-object p1, p0, Li0/q0;->i:Ljava/lang/Object;

    .line 739
    .line 740
    check-cast p1, Lw/q0;

    .line 741
    .line 742
    iget-object p1, p1, Lw/q0;->c:Ly1/g2;

    .line 743
    .line 744
    if-eqz p1, :cond_14

    .line 745
    .line 746
    check-cast p1, Ly1/i1;

    .line 747
    .line 748
    invoke-virtual {p1}, Ly1/i1;->b()V

    .line 749
    .line 750
    .line 751
    :cond_14
    move v2, v3

    .line 752
    :cond_15
    :goto_6
    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 753
    .line 754
    .line 755
    move-result-object p1

    .line 756
    return-object p1

    .line 757
    :pswitch_4
    check-cast p1, Lq1/b;

    .line 758
    .line 759
    iget-object p1, p1, Lq1/b;->a:Landroid/view/KeyEvent;

    .line 760
    .line 761
    iget-object v0, p0, Li0/q0;->h:Ljava/lang/Object;

    .line 762
    .line 763
    check-cast v0, Lw/q0;

    .line 764
    .line 765
    invoke-virtual {v0}, Lw/q0;->a()Lw/h0;

    .line 766
    .line 767
    .line 768
    move-result-object v0

    .line 769
    sget-object v1, Lw/h0;->h:Lw/h0;

    .line 770
    .line 771
    if-ne v0, v1, :cond_16

    .line 772
    .line 773
    invoke-virtual {p1}, Landroid/view/KeyEvent;->getKeyCode()I

    .line 774
    .line 775
    .line 776
    move-result v0

    .line 777
    const/4 v1, 0x4

    .line 778
    if-ne v0, v1, :cond_16

    .line 779
    .line 780
    invoke-static {p1}, Lq1/d;->c(Landroid/view/KeyEvent;)I

    .line 781
    .line 782
    .line 783
    move-result p1

    .line 784
    const/4 v0, 0x1

    .line 785
    if-ne p1, v0, :cond_16

    .line 786
    .line 787
    iget-object p1, p0, Li0/q0;->i:Ljava/lang/Object;

    .line 788
    .line 789
    check-cast p1, Lh0/d1;

    .line 790
    .line 791
    const/4 v1, 0x0

    .line 792
    invoke-virtual {p1, v1}, Lh0/d1;->g(Le1/b;)V

    .line 793
    .line 794
    .line 795
    goto :goto_7

    .line 796
    :cond_16
    const/4 v0, 0x0

    .line 797
    :goto_7
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 798
    .line 799
    .line 800
    move-result-object p1

    .line 801
    return-object p1

    .line 802
    :pswitch_5
    check-cast p1, Lh1/d;

    .line 803
    .line 804
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 805
    .line 806
    .line 807
    invoke-interface {p1}, Lh1/d;->z0()Lb5/c;

    .line 808
    .line 809
    .line 810
    move-result-object v0

    .line 811
    invoke-virtual {v0}, Lb5/c;->s()Lu2/c;

    .line 812
    .line 813
    .line 814
    move-result-object v1

    .line 815
    invoke-interface {p1}, Lh1/d;->z0()Lb5/c;

    .line 816
    .line 817
    .line 818
    move-result-object v0

    .line 819
    iget-object v2, p0, Li0/q0;->h:Ljava/lang/Object;

    .line 820
    .line 821
    check-cast v2, Lu2/c;

    .line 822
    .line 823
    invoke-virtual {v0, v2}, Lb5/c;->R(Lu2/c;)V

    .line 824
    .line 825
    .line 826
    :try_start_3
    iget-object v0, p0, Li0/q0;->i:Ljava/lang/Object;

    .line 827
    .line 828
    check-cast v0, Lth/i;

    .line 829
    .line 830
    iget-object v2, v0, Lth/i;->E:Lth/e;

    .line 831
    .line 832
    invoke-virtual {v0, p1, v2}, Lth/i;->p1(Lh1/d;Lth/e;)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_3

    .line 833
    .line 834
    .line 835
    invoke-interface {p1}, Lh1/d;->z0()Lb5/c;

    .line 836
    .line 837
    .line 838
    move-result-object p1

    .line 839
    invoke-virtual {p1, v1}, Lb5/c;->R(Lu2/c;)V

    .line 840
    .line 841
    .line 842
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 843
    .line 844
    return-object p1

    .line 845
    :catchall_3
    move-exception v0

    .line 846
    invoke-interface {p1}, Lh1/d;->z0()Lb5/c;

    .line 847
    .line 848
    .line 849
    move-result-object p1

    .line 850
    invoke-virtual {p1, v1}, Lb5/c;->R(Lu2/c;)V

    .line 851
    .line 852
    .line 853
    throw v0

    .line 854
    :pswitch_6
    check-cast p1, Ljava/lang/Throwable;

    .line 855
    .line 856
    iget-object p1, p0, Li0/q0;->h:Ljava/lang/Object;

    .line 857
    .line 858
    check-cast p1, Lj8/f;

    .line 859
    .line 860
    iget-object v1, p1, Lj8/f;->b:Ljava/lang/Object;

    .line 861
    .line 862
    iget-object v0, p0, Li0/q0;->i:Ljava/lang/Object;

    .line 863
    .line 864
    check-cast v0, Lqg/g;

    .line 865
    .line 866
    monitor-enter v1

    .line 867
    :try_start_4
    iget-object p1, p1, Lj8/f;->c:Ljava/lang/Object;

    .line 868
    .line 869
    check-cast p1, Ljava/util/ArrayList;

    .line 870
    .line 871
    invoke-virtual {p1, v0}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_4

    .line 872
    .line 873
    .line 874
    monitor-exit v1

    .line 875
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 876
    .line 877
    return-object p1

    .line 878
    :catchall_4
    move-exception v0

    .line 879
    move-object p1, v0

    .line 880
    monitor-exit v1

    .line 881
    throw p1

    .line 882
    nop

    .line 883
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
