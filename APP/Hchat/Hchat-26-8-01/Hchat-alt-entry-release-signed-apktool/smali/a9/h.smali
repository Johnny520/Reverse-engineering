.class public final La9/h;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Ljava/util/Comparator;


# instance fields
.field public final synthetic g:I


# direct methods
.method public synthetic constructor <init>(I)V
    .locals 0

    .line 1
    iput p1, p0, La9/h;->g:I

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
    .locals 2

    .line 1
    iget v0, p0, La9/h;->g:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    check-cast p1, Lr4/a;

    .line 7
    .line 8
    check-cast p2, Lr4/a;

    .line 9
    .line 10
    iget-object p1, p1, Lr4/a;->l:Lr4/s0;

    .line 11
    .line 12
    invoke-virtual {p1}, Lr4/z;->e()I

    .line 13
    .line 14
    .line 15
    move-result p1

    .line 16
    iget-object p2, p2, Lr4/a;->l:Lr4/s0;

    .line 17
    .line 18
    invoke-virtual {p2}, Lr4/z;->e()I

    .line 19
    .line 20
    .line 21
    move-result p2

    .line 22
    if-ge p1, p2, :cond_0

    .line 23
    .line 24
    const/4 p1, -0x1

    .line 25
    goto :goto_0

    .line 26
    :cond_0
    if-le p1, p2, :cond_1

    .line 27
    .line 28
    const/4 p1, 0x1

    .line 29
    goto :goto_0

    .line 30
    :cond_1
    const/4 p1, 0x0

    .line 31
    :goto_0
    return p1

    .line 32
    :pswitch_0
    check-cast p2, Lsf/j;

    .line 33
    .line 34
    iget-object p2, p2, Lsf/j;->i:Ljava/lang/Object;

    .line 35
    .line 36
    check-cast p2, Ljava/lang/Integer;

    .line 37
    .line 38
    check-cast p1, Lsf/j;

    .line 39
    .line 40
    iget-object p1, p1, Lsf/j;->i:Ljava/lang/Object;

    .line 41
    .line 42
    check-cast p1, Ljava/lang/Integer;

    .line 43
    .line 44
    invoke-static {p2, p1}, La7/a;->m(Ljava/lang/Comparable;Ljava/lang/Comparable;)I

    .line 45
    .line 46
    .line 47
    move-result p1

    .line 48
    return p1

    .line 49
    :pswitch_1
    check-cast p2, Ljava/lang/String;

    .line 50
    .line 51
    invoke-virtual {p2}, Ljava/lang/String;->length()I

    .line 52
    .line 53
    .line 54
    move-result p2

    .line 55
    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 56
    .line 57
    .line 58
    move-result-object p2

    .line 59
    check-cast p1, Ljava/lang/String;

    .line 60
    .line 61
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    .line 62
    .line 63
    .line 64
    move-result p1

    .line 65
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 66
    .line 67
    .line 68
    move-result-object p1

    .line 69
    invoke-interface {p2, p1}, Ljava/lang/Comparable;->compareTo(Ljava/lang/Object;)I

    .line 70
    .line 71
    .line 72
    move-result p1

    .line 73
    return p1

    .line 74
    :pswitch_2
    check-cast p2, Lh/Hchat/hooks/api/model/WeChatSnsPost;

    .line 75
    .line 76
    invoke-virtual {p2}, Lh/Hchat/hooks/api/model/WeChatSnsPost;->getCreateTimeSeconds()J

    .line 77
    .line 78
    .line 79
    move-result-wide v0

    .line 80
    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 81
    .line 82
    .line 83
    move-result-object p2

    .line 84
    check-cast p1, Lh/Hchat/hooks/api/model/WeChatSnsPost;

    .line 85
    .line 86
    invoke-virtual {p1}, Lh/Hchat/hooks/api/model/WeChatSnsPost;->getCreateTimeSeconds()J

    .line 87
    .line 88
    .line 89
    move-result-wide v0

    .line 90
    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 91
    .line 92
    .line 93
    move-result-object p1

    .line 94
    invoke-interface {p2, p1}, Ljava/lang/Comparable;->compareTo(Ljava/lang/Object;)I

    .line 95
    .line 96
    .line 97
    move-result p1

    .line 98
    return p1

    .line 99
    :pswitch_3
    check-cast p2, Lh/Hchat/hooks/api/model/WeChatSnsPost;

    .line 100
    .line 101
    invoke-virtual {p2}, Lh/Hchat/hooks/api/model/WeChatSnsPost;->getCreateTimeSeconds()J

    .line 102
    .line 103
    .line 104
    move-result-wide v0

    .line 105
    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 106
    .line 107
    .line 108
    move-result-object p2

    .line 109
    check-cast p1, Lh/Hchat/hooks/api/model/WeChatSnsPost;

    .line 110
    .line 111
    invoke-virtual {p1}, Lh/Hchat/hooks/api/model/WeChatSnsPost;->getCreateTimeSeconds()J

    .line 112
    .line 113
    .line 114
    move-result-wide v0

    .line 115
    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 116
    .line 117
    .line 118
    move-result-object p1

    .line 119
    invoke-interface {p2, p1}, Ljava/lang/Comparable;->compareTo(Ljava/lang/Object;)I

    .line 120
    .line 121
    .line 122
    move-result p1

    .line 123
    return p1

    .line 124
    :pswitch_4
    check-cast p1, Lp8/i;

    .line 125
    .line 126
    iget p1, p1, Lp8/i;->d:I

    .line 127
    .line 128
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 129
    .line 130
    .line 131
    move-result-object p1

    .line 132
    check-cast p2, Lp8/i;

    .line 133
    .line 134
    iget p2, p2, Lp8/i;->d:I

    .line 135
    .line 136
    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 137
    .line 138
    .line 139
    move-result-object p2

    .line 140
    invoke-virtual {p1, p2}, Ljava/lang/Integer;->compareTo(Ljava/lang/Object;)I

    .line 141
    .line 142
    .line 143
    move-result p1

    .line 144
    return p1

    .line 145
    :pswitch_5
    check-cast p2, Ljava/lang/reflect/Constructor;

    .line 146
    .line 147
    invoke-virtual {p2}, Ljava/lang/reflect/Constructor;->getParameterTypes()[Ljava/lang/Class;

    .line 148
    .line 149
    .line 150
    move-result-object p2

    .line 151
    array-length p2, p2

    .line 152
    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 153
    .line 154
    .line 155
    move-result-object p2

    .line 156
    check-cast p1, Ljava/lang/reflect/Constructor;

    .line 157
    .line 158
    invoke-virtual {p1}, Ljava/lang/reflect/Constructor;->getParameterTypes()[Ljava/lang/Class;

    .line 159
    .line 160
    .line 161
    move-result-object p1

    .line 162
    array-length p1, p1

    .line 163
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 164
    .line 165
    .line 166
    move-result-object p1

    .line 167
    invoke-interface {p2, p1}, Ljava/lang/Comparable;->compareTo(Ljava/lang/Object;)I

    .line 168
    .line 169
    .line 170
    move-result p1

    .line 171
    return p1

    .line 172
    :pswitch_6
    check-cast p2, Lsf/j;

    .line 173
    .line 174
    iget-object p2, p2, Lsf/j;->i:Ljava/lang/Object;

    .line 175
    .line 176
    check-cast p2, Ljava/lang/Integer;

    .line 177
    .line 178
    check-cast p1, Lsf/j;

    .line 179
    .line 180
    iget-object p1, p1, Lsf/j;->i:Ljava/lang/Object;

    .line 181
    .line 182
    check-cast p1, Ljava/lang/Integer;

    .line 183
    .line 184
    invoke-static {p2, p1}, La7/a;->m(Ljava/lang/Comparable;Ljava/lang/Comparable;)I

    .line 185
    .line 186
    .line 187
    move-result p1

    .line 188
    return p1

    .line 189
    :pswitch_7
    check-cast p1, Ljava/lang/Comparable;

    .line 190
    .line 191
    check-cast p2, Ljava/lang/Comparable;

    .line 192
    .line 193
    invoke-interface {p1, p2}, Ljava/lang/Comparable;->compareTo(Ljava/lang/Object;)I

    .line 194
    .line 195
    .line 196
    move-result p1

    .line 197
    return p1

    .line 198
    :pswitch_8
    check-cast p1, Lwb/jv;

    .line 199
    .line 200
    iget-object p1, p1, Lwb/jv;->b:Ljava/lang/String;

    .line 201
    .line 202
    sget-object v0, Ljava/util/Locale;->CHINA:Ljava/util/Locale;

    .line 203
    .line 204
    invoke-static {v0, p1, v0}, Lj8/b;->l(Ljava/util/Locale;Ljava/lang/String;Ljava/util/Locale;)Ljava/lang/String;

    .line 205
    .line 206
    .line 207
    move-result-object p1

    .line 208
    check-cast p2, Lwb/jv;

    .line 209
    .line 210
    iget-object p2, p2, Lwb/jv;->b:Ljava/lang/String;

    .line 211
    .line 212
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 213
    .line 214
    .line 215
    invoke-virtual {p2, v0}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    .line 216
    .line 217
    .line 218
    move-result-object p2

    .line 219
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 220
    .line 221
    .line 222
    invoke-interface {p1, p2}, Ljava/lang/Comparable;->compareTo(Ljava/lang/Object;)I

    .line 223
    .line 224
    .line 225
    move-result p1

    .line 226
    return p1

    .line 227
    :pswitch_9
    check-cast p1, Lhb/t;

    .line 228
    .line 229
    iget-wide v0, p1, Lhb/t;->f:J

    .line 230
    .line 231
    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 232
    .line 233
    .line 234
    move-result-object p1

    .line 235
    check-cast p2, Lhb/t;

    .line 236
    .line 237
    iget-wide v0, p2, Lhb/t;->f:J

    .line 238
    .line 239
    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 240
    .line 241
    .line 242
    move-result-object p2

    .line 243
    invoke-interface {p1, p2}, Ljava/lang/Comparable;->compareTo(Ljava/lang/Object;)I

    .line 244
    .line 245
    .line 246
    move-result p1

    .line 247
    return p1

    .line 248
    :pswitch_a
    check-cast p2, Ljava/lang/reflect/Constructor;

    .line 249
    .line 250
    invoke-virtual {p2}, Ljava/lang/reflect/Constructor;->getParameterTypes()[Ljava/lang/Class;

    .line 251
    .line 252
    .line 253
    move-result-object p2

    .line 254
    array-length p2, p2

    .line 255
    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 256
    .line 257
    .line 258
    move-result-object p2

    .line 259
    check-cast p1, Ljava/lang/reflect/Constructor;

    .line 260
    .line 261
    invoke-virtual {p1}, Ljava/lang/reflect/Constructor;->getParameterTypes()[Ljava/lang/Class;

    .line 262
    .line 263
    .line 264
    move-result-object p1

    .line 265
    array-length p1, p1

    .line 266
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 267
    .line 268
    .line 269
    move-result-object p1

    .line 270
    invoke-interface {p2, p1}, Ljava/lang/Comparable;->compareTo(Ljava/lang/Object;)I

    .line 271
    .line 272
    .line 273
    move-result p1

    .line 274
    return p1

    .line 275
    :pswitch_b
    check-cast p1, Leb/c0;

    .line 276
    .line 277
    iget-object p1, p1, Leb/c0;->a:Ljava/lang/String;

    .line 278
    .line 279
    sget-object v0, Ljava/util/Locale;->US:Ljava/util/Locale;

    .line 280
    .line 281
    invoke-static {v0, p1, v0}, Lj8/b;->l(Ljava/util/Locale;Ljava/lang/String;Ljava/util/Locale;)Ljava/lang/String;

    .line 282
    .line 283
    .line 284
    move-result-object p1

    .line 285
    check-cast p2, Leb/c0;

    .line 286
    .line 287
    iget-object p2, p2, Leb/c0;->a:Ljava/lang/String;

    .line 288
    .line 289
    invoke-virtual {p2, v0}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    .line 290
    .line 291
    .line 292
    move-result-object p2

    .line 293
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 294
    .line 295
    .line 296
    invoke-virtual {p1, p2}, Ljava/lang/String;->compareTo(Ljava/lang/Object;)I

    .line 297
    .line 298
    .line 299
    move-result p1

    .line 300
    return p1

    .line 301
    :pswitch_c
    check-cast p1, Leb/a0;

    .line 302
    .line 303
    iget-object p1, p1, Leb/a0;->a:Leb/c0;

    .line 304
    .line 305
    iget-object p1, p1, Leb/c0;->a:Ljava/lang/String;

    .line 306
    .line 307
    sget-object v0, Ljava/util/Locale;->US:Ljava/util/Locale;

    .line 308
    .line 309
    invoke-static {v0, p1, v0}, Lj8/b;->l(Ljava/util/Locale;Ljava/lang/String;Ljava/util/Locale;)Ljava/lang/String;

    .line 310
    .line 311
    .line 312
    move-result-object p1

    .line 313
    check-cast p2, Leb/a0;

    .line 314
    .line 315
    iget-object p2, p2, Leb/a0;->a:Leb/c0;

    .line 316
    .line 317
    iget-object p2, p2, Leb/c0;->a:Ljava/lang/String;

    .line 318
    .line 319
    invoke-virtual {p2, v0}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    .line 320
    .line 321
    .line 322
    move-result-object p2

    .line 323
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 324
    .line 325
    .line 326
    invoke-virtual {p1, p2}, Ljava/lang/String;->compareTo(Ljava/lang/Object;)I

    .line 327
    .line 328
    .line 329
    move-result p1

    .line 330
    return p1

    .line 331
    :pswitch_d
    check-cast p1, Leb/a0;

    .line 332
    .line 333
    iget-object p1, p1, Leb/a0;->a:Leb/c0;

    .line 334
    .line 335
    iget-object p1, p1, Leb/c0;->a:Ljava/lang/String;

    .line 336
    .line 337
    sget-object v0, Ljava/util/Locale;->US:Ljava/util/Locale;

    .line 338
    .line 339
    invoke-static {v0, p1, v0}, Lj8/b;->l(Ljava/util/Locale;Ljava/lang/String;Ljava/util/Locale;)Ljava/lang/String;

    .line 340
    .line 341
    .line 342
    move-result-object p1

    .line 343
    check-cast p2, Leb/a0;

    .line 344
    .line 345
    iget-object p2, p2, Leb/a0;->a:Leb/c0;

    .line 346
    .line 347
    iget-object p2, p2, Leb/c0;->a:Ljava/lang/String;

    .line 348
    .line 349
    invoke-virtual {p2, v0}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    .line 350
    .line 351
    .line 352
    move-result-object p2

    .line 353
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 354
    .line 355
    .line 356
    invoke-virtual {p1, p2}, Ljava/lang/String;->compareTo(Ljava/lang/Object;)I

    .line 357
    .line 358
    .line 359
    move-result p1

    .line 360
    return p1

    .line 361
    :pswitch_e
    check-cast p1, Leb/a0;

    .line 362
    .line 363
    iget-object p1, p1, Leb/a0;->a:Leb/c0;

    .line 364
    .line 365
    iget-object p1, p1, Leb/c0;->a:Ljava/lang/String;

    .line 366
    .line 367
    sget-object v0, Ljava/util/Locale;->US:Ljava/util/Locale;

    .line 368
    .line 369
    invoke-static {v0, p1, v0}, Lj8/b;->l(Ljava/util/Locale;Ljava/lang/String;Ljava/util/Locale;)Ljava/lang/String;

    .line 370
    .line 371
    .line 372
    move-result-object p1

    .line 373
    check-cast p2, Leb/a0;

    .line 374
    .line 375
    iget-object p2, p2, Leb/a0;->a:Leb/c0;

    .line 376
    .line 377
    iget-object p2, p2, Leb/c0;->a:Ljava/lang/String;

    .line 378
    .line 379
    invoke-virtual {p2, v0}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    .line 380
    .line 381
    .line 382
    move-result-object p2

    .line 383
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 384
    .line 385
    .line 386
    invoke-virtual {p1, p2}, Ljava/lang/String;->compareTo(Ljava/lang/Object;)I

    .line 387
    .line 388
    .line 389
    move-result p1

    .line 390
    return p1

    .line 391
    :pswitch_f
    check-cast p1, Leb/a0;

    .line 392
    .line 393
    iget-object p1, p1, Leb/a0;->a:Leb/c0;

    .line 394
    .line 395
    iget-object p1, p1, Leb/c0;->a:Ljava/lang/String;

    .line 396
    .line 397
    sget-object v0, Ljava/util/Locale;->US:Ljava/util/Locale;

    .line 398
    .line 399
    invoke-static {v0, p1, v0}, Lj8/b;->l(Ljava/util/Locale;Ljava/lang/String;Ljava/util/Locale;)Ljava/lang/String;

    .line 400
    .line 401
    .line 402
    move-result-object p1

    .line 403
    check-cast p2, Leb/a0;

    .line 404
    .line 405
    iget-object p2, p2, Leb/a0;->a:Leb/c0;

    .line 406
    .line 407
    iget-object p2, p2, Leb/c0;->a:Ljava/lang/String;

    .line 408
    .line 409
    invoke-virtual {p2, v0}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    .line 410
    .line 411
    .line 412
    move-result-object p2

    .line 413
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 414
    .line 415
    .line 416
    invoke-virtual {p1, p2}, Ljava/lang/String;->compareTo(Ljava/lang/Object;)I

    .line 417
    .line 418
    .line 419
    move-result p1

    .line 420
    return p1

    .line 421
    :pswitch_10
    check-cast p1, Leb/a0;

    .line 422
    .line 423
    iget-object p1, p1, Leb/a0;->a:Leb/c0;

    .line 424
    .line 425
    iget-object p1, p1, Leb/c0;->a:Ljava/lang/String;

    .line 426
    .line 427
    sget-object v0, Ljava/util/Locale;->US:Ljava/util/Locale;

    .line 428
    .line 429
    invoke-static {v0, p1, v0}, Lj8/b;->l(Ljava/util/Locale;Ljava/lang/String;Ljava/util/Locale;)Ljava/lang/String;

    .line 430
    .line 431
    .line 432
    move-result-object p1

    .line 433
    check-cast p2, Leb/a0;

    .line 434
    .line 435
    iget-object p2, p2, Leb/a0;->a:Leb/c0;

    .line 436
    .line 437
    iget-object p2, p2, Leb/c0;->a:Ljava/lang/String;

    .line 438
    .line 439
    invoke-virtual {p2, v0}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    .line 440
    .line 441
    .line 442
    move-result-object p2

    .line 443
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 444
    .line 445
    .line 446
    invoke-virtual {p1, p2}, Ljava/lang/String;->compareTo(Ljava/lang/Object;)I

    .line 447
    .line 448
    .line 449
    move-result p1

    .line 450
    return p1

    .line 451
    :pswitch_11
    check-cast p1, Leb/a0;

    .line 452
    .line 453
    iget-object p1, p1, Leb/a0;->a:Leb/c0;

    .line 454
    .line 455
    iget-object p1, p1, Leb/c0;->a:Ljava/lang/String;

    .line 456
    .line 457
    sget-object v0, Ljava/util/Locale;->US:Ljava/util/Locale;

    .line 458
    .line 459
    invoke-static {v0, p1, v0}, Lj8/b;->l(Ljava/util/Locale;Ljava/lang/String;Ljava/util/Locale;)Ljava/lang/String;

    .line 460
    .line 461
    .line 462
    move-result-object p1

    .line 463
    check-cast p2, Leb/a0;

    .line 464
    .line 465
    iget-object p2, p2, Leb/a0;->a:Leb/c0;

    .line 466
    .line 467
    iget-object p2, p2, Leb/c0;->a:Ljava/lang/String;

    .line 468
    .line 469
    invoke-virtual {p2, v0}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    .line 470
    .line 471
    .line 472
    move-result-object p2

    .line 473
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 474
    .line 475
    .line 476
    invoke-virtual {p1, p2}, Ljava/lang/String;->compareTo(Ljava/lang/Object;)I

    .line 477
    .line 478
    .line 479
    move-result p1

    .line 480
    return p1

    .line 481
    :pswitch_12
    check-cast p1, Ldb/c;

    .line 482
    .line 483
    iget-wide v0, p1, Ldb/c;->g:J

    .line 484
    .line 485
    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 486
    .line 487
    .line 488
    move-result-object p1

    .line 489
    check-cast p2, Ldb/c;

    .line 490
    .line 491
    iget-wide v0, p2, Ldb/c;->g:J

    .line 492
    .line 493
    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 494
    .line 495
    .line 496
    move-result-object p2

    .line 497
    invoke-interface {p1, p2}, Ljava/lang/Comparable;->compareTo(Ljava/lang/Object;)I

    .line 498
    .line 499
    .line 500
    move-result p1

    .line 501
    return p1

    .line 502
    :pswitch_13
    check-cast p1, Ldb/c;

    .line 503
    .line 504
    iget-wide v0, p1, Ldb/c;->g:J

    .line 505
    .line 506
    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 507
    .line 508
    .line 509
    move-result-object p1

    .line 510
    check-cast p2, Ldb/c;

    .line 511
    .line 512
    iget-wide v0, p2, Ldb/c;->g:J

    .line 513
    .line 514
    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 515
    .line 516
    .line 517
    move-result-object p2

    .line 518
    invoke-interface {p1, p2}, Ljava/lang/Comparable;->compareTo(Ljava/lang/Object;)I

    .line 519
    .line 520
    .line 521
    move-result p1

    .line 522
    return p1

    .line 523
    :pswitch_14
    check-cast p1, Ljava/util/Map$Entry;

    .line 524
    .line 525
    invoke-interface {p1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 526
    .line 527
    .line 528
    move-result-object p1

    .line 529
    check-cast p1, Ljava/lang/Comparable;

    .line 530
    .line 531
    check-cast p2, Ljava/util/Map$Entry;

    .line 532
    .line 533
    invoke-interface {p2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 534
    .line 535
    .line 536
    move-result-object p2

    .line 537
    check-cast p2, Ljava/lang/Comparable;

    .line 538
    .line 539
    invoke-static {p1, p2}, La7/a;->m(Ljava/lang/Comparable;Ljava/lang/Comparable;)I

    .line 540
    .line 541
    .line 542
    move-result p1

    .line 543
    return p1

    .line 544
    :pswitch_15
    check-cast p1, Lda/e;

    .line 545
    .line 546
    iget-object p1, p1, Lda/e;->b:Lda/d;

    .line 547
    .line 548
    iget p1, p1, Lda/d;->b:I

    .line 549
    .line 550
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 551
    .line 552
    .line 553
    move-result-object p1

    .line 554
    check-cast p2, Lda/e;

    .line 555
    .line 556
    iget-object p2, p2, Lda/e;->b:Lda/d;

    .line 557
    .line 558
    iget p2, p2, Lda/d;->b:I

    .line 559
    .line 560
    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 561
    .line 562
    .line 563
    move-result-object p2

    .line 564
    invoke-virtual {p1, p2}, Ljava/lang/Integer;->compareTo(Ljava/lang/Object;)I

    .line 565
    .line 566
    .line 567
    move-result p1

    .line 568
    return p1

    .line 569
    :pswitch_16
    check-cast p1, Lhb/t;

    .line 570
    .line 571
    iget-wide v0, p1, Lhb/t;->f:J

    .line 572
    .line 573
    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 574
    .line 575
    .line 576
    move-result-object p1

    .line 577
    check-cast p2, Lhb/t;

    .line 578
    .line 579
    iget-wide v0, p2, Lhb/t;->f:J

    .line 580
    .line 581
    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 582
    .line 583
    .line 584
    move-result-object p2

    .line 585
    invoke-interface {p1, p2}, Ljava/lang/Comparable;->compareTo(Ljava/lang/Object;)I

    .line 586
    .line 587
    .line 588
    move-result p1

    .line 589
    return p1

    .line 590
    :pswitch_17
    check-cast p1, Lhh/o;

    .line 591
    .line 592
    iget-object p1, p1, Lhh/o;->j:Ljava/lang/String;

    .line 593
    .line 594
    check-cast p2, Lhh/o;

    .line 595
    .line 596
    iget-object p2, p2, Lhh/o;->j:Ljava/lang/String;

    .line 597
    .line 598
    invoke-static {p1, p2}, La7/a;->m(Ljava/lang/Comparable;Ljava/lang/Comparable;)I

    .line 599
    .line 600
    .line 601
    move-result p1

    .line 602
    return p1

    .line 603
    :pswitch_18
    check-cast p1, Lhh/l;

    .line 604
    .line 605
    iget-object p1, p1, Lhh/l;->j:Ljava/lang/String;

    .line 606
    .line 607
    check-cast p2, Lhh/l;

    .line 608
    .line 609
    iget-object p2, p2, Lhh/l;->j:Ljava/lang/String;

    .line 610
    .line 611
    invoke-static {p1, p2}, La7/a;->m(Ljava/lang/Comparable;Ljava/lang/Comparable;)I

    .line 612
    .line 613
    .line 614
    move-result p1

    .line 615
    return p1

    .line 616
    :pswitch_19
    check-cast p1, Lhh/i;

    .line 617
    .line 618
    iget-object p1, p1, Lhh/i;->j:Ljava/lang/String;

    .line 619
    .line 620
    check-cast p2, Lhh/i;

    .line 621
    .line 622
    iget-object p2, p2, Lhh/i;->j:Ljava/lang/String;

    .line 623
    .line 624
    invoke-static {p1, p2}, La7/a;->m(Ljava/lang/Comparable;Ljava/lang/Comparable;)I

    .line 625
    .line 626
    .line 627
    move-result p1

    .line 628
    return p1

    .line 629
    :pswitch_1a
    check-cast p1, Lhh/o;

    .line 630
    .line 631
    iget-object p1, p1, Lhh/o;->j:Ljava/lang/String;

    .line 632
    .line 633
    check-cast p2, Lhh/o;

    .line 634
    .line 635
    iget-object p2, p2, Lhh/o;->j:Ljava/lang/String;

    .line 636
    .line 637
    invoke-static {p1, p2}, La7/a;->m(Ljava/lang/Comparable;Ljava/lang/Comparable;)I

    .line 638
    .line 639
    .line 640
    move-result p1

    .line 641
    return p1

    .line 642
    :pswitch_1b
    check-cast p1, Lhh/i;

    .line 643
    .line 644
    iget-object p1, p1, Lhh/i;->j:Ljava/lang/String;

    .line 645
    .line 646
    check-cast p2, Lhh/i;

    .line 647
    .line 648
    iget-object p2, p2, Lhh/i;->j:Ljava/lang/String;

    .line 649
    .line 650
    invoke-static {p1, p2}, La7/a;->m(Ljava/lang/Comparable;Ljava/lang/Comparable;)I

    .line 651
    .line 652
    .line 653
    move-result p1

    .line 654
    return p1

    .line 655
    :pswitch_1c
    check-cast p2, Lsf/e;

    .line 656
    .line 657
    iget-object p2, p2, Lsf/e;->g:Ljava/lang/Object;

    .line 658
    .line 659
    check-cast p2, Ljava/lang/Integer;

    .line 660
    .line 661
    check-cast p1, Lsf/e;

    .line 662
    .line 663
    iget-object p1, p1, Lsf/e;->g:Ljava/lang/Object;

    .line 664
    .line 665
    check-cast p1, Ljava/lang/Integer;

    .line 666
    .line 667
    invoke-static {p2, p1}, La7/a;->m(Ljava/lang/Comparable;Ljava/lang/Comparable;)I

    .line 668
    .line 669
    .line 670
    move-result p1

    .line 671
    return p1

    .line 672
    nop

    .line 673
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
