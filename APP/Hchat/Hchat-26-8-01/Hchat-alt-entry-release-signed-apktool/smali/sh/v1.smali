.class public final synthetic Lsh/v1;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Lfg/a;


# instance fields
.field public final synthetic g:I

.field public final synthetic h:Ljava/lang/Object;

.field public final synthetic i:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;ILjava/lang/Object;)V
    .locals 0

    .line 12
    iput p2, p0, Lsh/v1;->g:I

    iput-object p1, p0, Lsh/v1;->h:Ljava/lang/Object;

    iput-object p3, p0, Lsh/v1;->i:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lw/n1;Li2/e;Ly1/p0;)V
    .locals 0

    .line 1
    const/4 p1, 0x4

    .line 2
    iput p1, p0, Lsh/v1;->g:I

    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    iput-object p2, p0, Lsh/v1;->h:Ljava/lang/Object;

    .line 8
    .line 9
    iput-object p3, p0, Lsh/v1;->i:Ljava/lang/Object;

    .line 10
    .line 11
    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 14

    .line 1
    iget v0, p0, Lsh/v1;->g:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lsh/v1;->h:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast v0, Landroid/content/Context;

    .line 9
    .line 10
    iget-object v1, p0, Lsh/v1;->i:Ljava/lang/Object;

    .line 11
    .line 12
    check-cast v1, Ljava/lang/String;

    .line 13
    .line 14
    invoke-static {v0, v1}, Lwb/ho;->v6(Landroid/content/Context;Ljava/lang/String;)V

    .line 15
    .line 16
    .line 17
    :goto_0
    sget-object v0, Lsf/n;->a:Lsf/n;

    .line 18
    .line 19
    return-object v0

    .line 20
    :pswitch_0
    iget-object v0, p0, Lsh/v1;->h:Ljava/lang/Object;

    .line 21
    .line 22
    check-cast v0, Lwb/l4;

    .line 23
    .line 24
    iget-object v1, p0, Lsh/v1;->i:Ljava/lang/Object;

    .line 25
    .line 26
    check-cast v1, Li0/a1;

    .line 27
    .line 28
    check-cast v0, Lwb/i4;

    .line 29
    .line 30
    iget-boolean v0, v0, Lwb/i4;->b:Z

    .line 31
    .line 32
    if-eqz v0, :cond_0

    .line 33
    .line 34
    sget-object v0, Lwb/h4;->c:Lwb/h4;

    .line 35
    .line 36
    goto :goto_1

    .line 37
    :cond_0
    sget-object v0, Lwb/h4;->b:Lwb/h4;

    .line 38
    .line 39
    :goto_1
    invoke-interface {v1, v0}, Li0/a1;->setValue(Ljava/lang/Object;)V

    .line 40
    .line 41
    .line 42
    goto :goto_0

    .line 43
    :pswitch_1
    iget-object v0, p0, Lsh/v1;->h:Ljava/lang/Object;

    .line 44
    .line 45
    check-cast v0, Lx8/b;

    .line 46
    .line 47
    iget-object v1, p0, Lsh/v1;->i:Ljava/lang/Object;

    .line 48
    .line 49
    check-cast v1, Li0/a1;

    .line 50
    .line 51
    invoke-interface {v1}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 52
    .line 53
    .line 54
    move-result-object v2

    .line 55
    check-cast v2, Ljava/util/Set;

    .line 56
    .line 57
    iget-object v0, v0, Lx8/b;->a:Ljava/lang/String;

    .line 58
    .line 59
    invoke-interface {v2, v0}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 60
    .line 61
    .line 62
    move-result v2

    .line 63
    if-eqz v2, :cond_1

    .line 64
    .line 65
    invoke-interface {v1}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 66
    .line 67
    .line 68
    move-result-object v2

    .line 69
    check-cast v2, Ljava/util/Set;

    .line 70
    .line 71
    invoke-static {v2, v0}, Ltf/d0;->S(Ljava/util/Set;Ljava/lang/Object;)Ljava/util/LinkedHashSet;

    .line 72
    .line 73
    .line 74
    move-result-object v0

    .line 75
    goto :goto_2

    .line 76
    :cond_1
    invoke-interface {v1}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 77
    .line 78
    .line 79
    move-result-object v2

    .line 80
    check-cast v2, Ljava/util/Set;

    .line 81
    .line 82
    invoke-static {v2, v0}, Ltf/d0;->V(Ljava/util/Set;Ljava/lang/Object;)Ljava/util/LinkedHashSet;

    .line 83
    .line 84
    .line 85
    move-result-object v0

    .line 86
    :goto_2
    invoke-interface {v1, v0}, Li0/a1;->setValue(Ljava/lang/Object;)V

    .line 87
    .line 88
    .line 89
    goto :goto_0

    .line 90
    :pswitch_2
    iget-object v0, p0, Lsh/v1;->h:Ljava/lang/Object;

    .line 91
    .line 92
    check-cast v0, Lfg/l;

    .line 93
    .line 94
    iget-object v1, p0, Lsh/v1;->i:Ljava/lang/Object;

    .line 95
    .line 96
    check-cast v1, Lwb/fu;

    .line 97
    .line 98
    iget-object v1, v1, Lwb/fu;->a:Ljava/lang/String;

    .line 99
    .line 100
    invoke-interface {v0, v1}, Lfg/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 101
    .line 102
    .line 103
    goto :goto_0

    .line 104
    :pswitch_3
    iget-object v0, p0, Lsh/v1;->h:Ljava/lang/Object;

    .line 105
    .line 106
    check-cast v0, Lv8/a;

    .line 107
    .line 108
    iget-object v1, p0, Lsh/v1;->i:Ljava/lang/Object;

    .line 109
    .line 110
    check-cast v1, Li0/a1;

    .line 111
    .line 112
    invoke-interface {v1}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 113
    .line 114
    .line 115
    move-result-object v2

    .line 116
    check-cast v2, Ljava/util/Set;

    .line 117
    .line 118
    iget-object v0, v0, Lv8/a;->a:Ljava/lang/String;

    .line 119
    .line 120
    invoke-interface {v2, v0}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 121
    .line 122
    .line 123
    move-result v2

    .line 124
    if-eqz v2, :cond_2

    .line 125
    .line 126
    invoke-interface {v1}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 127
    .line 128
    .line 129
    move-result-object v2

    .line 130
    check-cast v2, Ljava/util/Set;

    .line 131
    .line 132
    invoke-static {v2, v0}, Ltf/d0;->S(Ljava/util/Set;Ljava/lang/Object;)Ljava/util/LinkedHashSet;

    .line 133
    .line 134
    .line 135
    move-result-object v0

    .line 136
    goto :goto_3

    .line 137
    :cond_2
    invoke-interface {v1}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 138
    .line 139
    .line 140
    move-result-object v2

    .line 141
    check-cast v2, Ljava/util/Set;

    .line 142
    .line 143
    invoke-static {v2, v0}, Ltf/d0;->V(Ljava/util/Set;Ljava/lang/Object;)Ljava/util/LinkedHashSet;

    .line 144
    .line 145
    .line 146
    move-result-object v0

    .line 147
    :goto_3
    invoke-interface {v1, v0}, Li0/a1;->setValue(Ljava/lang/Object;)V

    .line 148
    .line 149
    .line 150
    goto/16 :goto_0

    .line 151
    .line 152
    :pswitch_4
    iget-object v0, p0, Lsh/v1;->h:Ljava/lang/Object;

    .line 153
    .line 154
    check-cast v0, Lfg/l;

    .line 155
    .line 156
    iget-object v1, p0, Lsh/v1;->i:Ljava/lang/Object;

    .line 157
    .line 158
    check-cast v1, Lx9/f;

    .line 159
    .line 160
    invoke-interface {v0, v1}, Lfg/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 161
    .line 162
    .line 163
    goto/16 :goto_0

    .line 164
    .line 165
    :pswitch_5
    iget-object v0, p0, Lsh/v1;->h:Ljava/lang/Object;

    .line 166
    .line 167
    check-cast v0, Lua/h;

    .line 168
    .line 169
    iget-object v1, p0, Lsh/v1;->i:Ljava/lang/Object;

    .line 170
    .line 171
    check-cast v1, Li0/a1;

    .line 172
    .line 173
    invoke-interface {v1}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 174
    .line 175
    .line 176
    move-result-object v2

    .line 177
    check-cast v2, Ljava/util/Set;

    .line 178
    .line 179
    iget-object v0, v0, Lua/h;->a:Ljava/lang/String;

    .line 180
    .line 181
    invoke-interface {v2, v0}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 182
    .line 183
    .line 184
    move-result v2

    .line 185
    if-eqz v2, :cond_3

    .line 186
    .line 187
    invoke-interface {v1}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 188
    .line 189
    .line 190
    move-result-object v2

    .line 191
    check-cast v2, Ljava/util/Set;

    .line 192
    .line 193
    invoke-static {v2, v0}, Ltf/d0;->S(Ljava/util/Set;Ljava/lang/Object;)Ljava/util/LinkedHashSet;

    .line 194
    .line 195
    .line 196
    move-result-object v0

    .line 197
    goto :goto_4

    .line 198
    :cond_3
    invoke-interface {v1}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 199
    .line 200
    .line 201
    move-result-object v2

    .line 202
    check-cast v2, Ljava/util/Set;

    .line 203
    .line 204
    invoke-static {v2, v0}, Ltf/d0;->V(Ljava/util/Set;Ljava/lang/Object;)Ljava/util/LinkedHashSet;

    .line 205
    .line 206
    .line 207
    move-result-object v0

    .line 208
    :goto_4
    invoke-interface {v1, v0}, Li0/a1;->setValue(Ljava/lang/Object;)V

    .line 209
    .line 210
    .line 211
    goto/16 :goto_0

    .line 212
    .line 213
    :pswitch_6
    iget-object v0, p0, Lsh/v1;->h:Ljava/lang/Object;

    .line 214
    .line 215
    check-cast v0, Lua/i;

    .line 216
    .line 217
    iget-object v1, p0, Lsh/v1;->i:Ljava/lang/Object;

    .line 218
    .line 219
    check-cast v1, Li0/a1;

    .line 220
    .line 221
    iget-object v0, v0, Lua/i;->a:Ljava/lang/String;

    .line 222
    .line 223
    invoke-interface {v1, v0}, Li0/a1;->setValue(Ljava/lang/Object;)V

    .line 224
    .line 225
    .line 226
    goto/16 :goto_0

    .line 227
    .line 228
    :pswitch_7
    iget-object v0, p0, Lsh/v1;->h:Ljava/lang/Object;

    .line 229
    .line 230
    check-cast v0, Laa/a;

    .line 231
    .line 232
    iget-object v1, p0, Lsh/v1;->i:Ljava/lang/Object;

    .line 233
    .line 234
    check-cast v1, Li0/a1;

    .line 235
    .line 236
    invoke-interface {v1}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 237
    .line 238
    .line 239
    move-result-object v2

    .line 240
    check-cast v2, Ljava/util/Set;

    .line 241
    .line 242
    iget-object v0, v0, Laa/a;->a:Ljava/lang/String;

    .line 243
    .line 244
    invoke-interface {v2, v0}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 245
    .line 246
    .line 247
    move-result v2

    .line 248
    if-eqz v2, :cond_4

    .line 249
    .line 250
    invoke-interface {v1}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 251
    .line 252
    .line 253
    move-result-object v2

    .line 254
    check-cast v2, Ljava/util/Set;

    .line 255
    .line 256
    invoke-static {v2, v0}, Ltf/d0;->S(Ljava/util/Set;Ljava/lang/Object;)Ljava/util/LinkedHashSet;

    .line 257
    .line 258
    .line 259
    move-result-object v0

    .line 260
    goto :goto_5

    .line 261
    :cond_4
    invoke-interface {v1}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 262
    .line 263
    .line 264
    move-result-object v2

    .line 265
    check-cast v2, Ljava/util/Set;

    .line 266
    .line 267
    invoke-static {v2, v0}, Ltf/d0;->V(Ljava/util/Set;Ljava/lang/Object;)Ljava/util/LinkedHashSet;

    .line 268
    .line 269
    .line 270
    move-result-object v0

    .line 271
    :goto_5
    invoke-interface {v1, v0}, Li0/a1;->setValue(Ljava/lang/Object;)V

    .line 272
    .line 273
    .line 274
    goto/16 :goto_0

    .line 275
    .line 276
    :pswitch_8
    iget-object v0, p0, Lsh/v1;->h:Ljava/lang/Object;

    .line 277
    .line 278
    check-cast v0, Lfg/l;

    .line 279
    .line 280
    iget-object v1, p0, Lsh/v1;->i:Ljava/lang/Object;

    .line 281
    .line 282
    check-cast v1, Le9/c;

    .line 283
    .line 284
    iget-object v1, v1, Le9/c;->b:Ljava/lang/String;

    .line 285
    .line 286
    invoke-interface {v0, v1}, Lfg/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 287
    .line 288
    .line 289
    goto/16 :goto_0

    .line 290
    .line 291
    :pswitch_9
    iget-object v0, p0, Lsh/v1;->h:Ljava/lang/Object;

    .line 292
    .line 293
    check-cast v0, Le9/c;

    .line 294
    .line 295
    iget-object v1, p0, Lsh/v1;->i:Ljava/lang/Object;

    .line 296
    .line 297
    check-cast v1, Li0/a1;

    .line 298
    .line 299
    invoke-interface {v1}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 300
    .line 301
    .line 302
    move-result-object v2

    .line 303
    check-cast v2, Ljava/util/Set;

    .line 304
    .line 305
    iget-object v0, v0, Le9/c;->b:Ljava/lang/String;

    .line 306
    .line 307
    invoke-interface {v2, v0}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 308
    .line 309
    .line 310
    move-result v2

    .line 311
    if-eqz v2, :cond_5

    .line 312
    .line 313
    invoke-interface {v1}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 314
    .line 315
    .line 316
    move-result-object v2

    .line 317
    check-cast v2, Ljava/util/Set;

    .line 318
    .line 319
    invoke-static {v2, v0}, Ltf/d0;->S(Ljava/util/Set;Ljava/lang/Object;)Ljava/util/LinkedHashSet;

    .line 320
    .line 321
    .line 322
    move-result-object v0

    .line 323
    goto :goto_6

    .line 324
    :cond_5
    invoke-interface {v1}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 325
    .line 326
    .line 327
    move-result-object v2

    .line 328
    check-cast v2, Ljava/util/Set;

    .line 329
    .line 330
    invoke-static {v2, v0}, Ltf/d0;->V(Ljava/util/Set;Ljava/lang/Object;)Ljava/util/LinkedHashSet;

    .line 331
    .line 332
    .line 333
    move-result-object v0

    .line 334
    :goto_6
    invoke-interface {v1, v0}, Li0/a1;->setValue(Ljava/lang/Object;)V

    .line 335
    .line 336
    .line 337
    goto/16 :goto_0

    .line 338
    .line 339
    :pswitch_a
    iget-object v0, p0, Lsh/v1;->h:Ljava/lang/Object;

    .line 340
    .line 341
    check-cast v0, Lna/i;

    .line 342
    .line 343
    iget-object v1, p0, Lsh/v1;->i:Ljava/lang/Object;

    .line 344
    .line 345
    check-cast v1, Li0/a1;

    .line 346
    .line 347
    invoke-interface {v1}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 348
    .line 349
    .line 350
    move-result-object v2

    .line 351
    check-cast v2, Ljava/util/Set;

    .line 352
    .line 353
    iget-object v0, v0, Lna/i;->a:Ljava/lang/String;

    .line 354
    .line 355
    invoke-interface {v2, v0}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 356
    .line 357
    .line 358
    move-result v2

    .line 359
    if-eqz v2, :cond_6

    .line 360
    .line 361
    invoke-interface {v1}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 362
    .line 363
    .line 364
    move-result-object v2

    .line 365
    check-cast v2, Ljava/util/Set;

    .line 366
    .line 367
    invoke-static {v2, v0}, Ltf/d0;->S(Ljava/util/Set;Ljava/lang/Object;)Ljava/util/LinkedHashSet;

    .line 368
    .line 369
    .line 370
    move-result-object v0

    .line 371
    goto :goto_7

    .line 372
    :cond_6
    invoke-interface {v1}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 373
    .line 374
    .line 375
    move-result-object v2

    .line 376
    check-cast v2, Ljava/util/Set;

    .line 377
    .line 378
    invoke-static {v2, v0}, Ltf/d0;->V(Ljava/util/Set;Ljava/lang/Object;)Ljava/util/LinkedHashSet;

    .line 379
    .line 380
    .line 381
    move-result-object v0

    .line 382
    :goto_7
    invoke-interface {v1, v0}, Li0/a1;->setValue(Ljava/lang/Object;)V

    .line 383
    .line 384
    .line 385
    goto/16 :goto_0

    .line 386
    .line 387
    :pswitch_b
    iget-object v0, p0, Lsh/v1;->h:Ljava/lang/Object;

    .line 388
    .line 389
    check-cast v0, Lna/j;

    .line 390
    .line 391
    iget-object v1, p0, Lsh/v1;->i:Ljava/lang/Object;

    .line 392
    .line 393
    check-cast v1, Li0/a1;

    .line 394
    .line 395
    iget-object v0, v0, Lna/j;->a:Ljava/lang/String;

    .line 396
    .line 397
    invoke-interface {v1, v0}, Li0/a1;->setValue(Ljava/lang/Object;)V

    .line 398
    .line 399
    .line 400
    goto/16 :goto_0

    .line 401
    .line 402
    :pswitch_c
    iget-object v0, p0, Lsh/v1;->h:Ljava/lang/Object;

    .line 403
    .line 404
    check-cast v0, Lfg/l;

    .line 405
    .line 406
    iget-object v1, p0, Lsh/v1;->i:Ljava/lang/Object;

    .line 407
    .line 408
    check-cast v1, Lua/i;

    .line 409
    .line 410
    iget-object v1, v1, Lua/i;->a:Ljava/lang/String;

    .line 411
    .line 412
    invoke-interface {v0, v1}, Lfg/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 413
    .line 414
    .line 415
    goto/16 :goto_0

    .line 416
    .line 417
    :pswitch_d
    iget-object v0, p0, Lsh/v1;->h:Ljava/lang/Object;

    .line 418
    .line 419
    check-cast v0, Lk9/j;

    .line 420
    .line 421
    iget-object v1, p0, Lsh/v1;->i:Ljava/lang/Object;

    .line 422
    .line 423
    check-cast v1, Li0/a1;

    .line 424
    .line 425
    new-instance v2, Lwb/q3;

    .line 426
    .line 427
    invoke-direct {v2, v0, v0}, Lwb/q3;-><init>(Lk9/j;Lk9/j;)V

    .line 428
    .line 429
    .line 430
    invoke-interface {v1, v2}, Li0/a1;->setValue(Ljava/lang/Object;)V

    .line 431
    .line 432
    .line 433
    goto/16 :goto_0

    .line 434
    .line 435
    :pswitch_e
    iget-object v0, p0, Lsh/v1;->h:Ljava/lang/Object;

    .line 436
    .line 437
    check-cast v0, Lfg/l;

    .line 438
    .line 439
    iget-object v1, p0, Lsh/v1;->i:Ljava/lang/Object;

    .line 440
    .line 441
    check-cast v1, Lwb/c3;

    .line 442
    .line 443
    invoke-interface {v0, v1}, Lfg/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 444
    .line 445
    .line 446
    goto/16 :goto_0

    .line 447
    .line 448
    :pswitch_f
    iget-object v0, p0, Lsh/v1;->h:Ljava/lang/Object;

    .line 449
    .line 450
    check-cast v0, Leb/c0;

    .line 451
    .line 452
    iget-object v1, p0, Lsh/v1;->i:Ljava/lang/Object;

    .line 453
    .line 454
    check-cast v1, Landroid/content/Context;

    .line 455
    .line 456
    sget-object v2, Lh/Hchat/hooks/items/script/ScriptPluginRuntime;->INSTANCE:Lh/Hchat/hooks/items/script/ScriptPluginRuntime;

    .line 457
    .line 458
    iget-object v0, v0, Leb/c0;->a:Ljava/lang/String;

    .line 459
    .line 460
    invoke-virtual {v2, v0}, Lh/Hchat/hooks/items/script/ScriptPluginRuntime;->callOpenSettings-IoAF18A(Ljava/lang/String;)Ljava/lang/Object;

    .line 461
    .line 462
    .line 463
    move-result-object v0

    .line 464
    instance-of v2, v0, Lsf/f;

    .line 465
    .line 466
    if-eqz v2, :cond_8

    .line 467
    .line 468
    invoke-static {v0}, Lsf/g;->b(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 469
    .line 470
    .line 471
    move-result-object v0

    .line 472
    if-eqz v0, :cond_7

    .line 473
    .line 474
    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 475
    .line 476
    .line 477
    move-result-object v0

    .line 478
    if-eqz v0, :cond_7

    .line 479
    .line 480
    goto :goto_8

    .line 481
    :cond_7
    const-string v0, "\u6253\u5f00\u8bbe\u7f6e\u5931\u8d25"

    .line 482
    .line 483
    :goto_8
    const/4 v2, 0x0

    .line 484
    invoke-static {v1, v0, v2}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    .line 485
    .line 486
    .line 487
    move-result-object v0

    .line 488
    invoke-virtual {v0}, Landroid/widget/Toast;->show()V

    .line 489
    .line 490
    .line 491
    :cond_8
    sget-object v0, Lsf/n;->a:Lsf/n;

    .line 492
    .line 493
    return-object v0

    .line 494
    :pswitch_10
    iget-object v0, p0, Lsh/v1;->h:Ljava/lang/Object;

    .line 495
    .line 496
    check-cast v0, Landroid/app/Activity;

    .line 497
    .line 498
    iget-object v1, p0, Lsh/v1;->i:Ljava/lang/Object;

    .line 499
    .line 500
    check-cast v1, Landroid/content/Context;

    .line 501
    .line 502
    const/4 v2, 0x0

    .line 503
    if-nez v0, :cond_9

    .line 504
    .line 505
    const-string v0, "\u5f53\u524d\u9875\u9762\u65e0\u6cd5\u6253\u5f00\u6587\u4ef6\u7ba1\u7406\u5668"

    .line 506
    .line 507
    invoke-static {v1, v0, v2}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    .line 508
    .line 509
    .line 510
    move-result-object v0

    .line 511
    invoke-virtual {v0}, Landroid/widget/Toast;->show()V

    .line 512
    .line 513
    .line 514
    goto :goto_a

    .line 515
    :cond_9
    sget-object v1, Lwb/r0;->a:Lwb/r0;

    .line 516
    .line 517
    const-string v3, "Hchat_config_"

    .line 518
    .line 519
    monitor-enter v1

    .line 520
    :try_start_0
    sput-object v0, Lwb/r0;->d:Landroid/app/Activity;

    .line 521
    .line 522
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 523
    .line 524
    .line 525
    move-result-object v4

    .line 526
    invoke-virtual {v1, v4}, Lwb/r0;->a(Ljava/lang/Class;)V

    .line 527
    .line 528
    .line 529
    const-class v4, Landroid/app/Activity;

    .line 530
    .line 531
    invoke-virtual {v1, v4}, Lwb/r0;->a(Ljava/lang/Class;)V

    .line 532
    .line 533
    .line 534
    new-instance v4, Ljava/text/SimpleDateFormat;

    .line 535
    .line 536
    const-string v5, "yyyyMMdd_HHmmss"

    .line 537
    .line 538
    sget-object v6, Ljava/util/Locale;->US:Ljava/util/Locale;

    .line 539
    .line 540
    invoke-direct {v4, v5, v6}, Ljava/text/SimpleDateFormat;-><init>(Ljava/lang/String;Ljava/util/Locale;)V

    .line 541
    .line 542
    .line 543
    new-instance v5, Ljava/util/Date;

    .line 544
    .line 545
    invoke-direct {v5}, Ljava/util/Date;-><init>()V

    .line 546
    .line 547
    .line 548
    invoke-virtual {v4, v5}, Ljava/text/DateFormat;->format(Ljava/util/Date;)Ljava/lang/String;

    .line 549
    .line 550
    .line 551
    move-result-object v4

    .line 552
    new-instance v5, Ljava/lang/StringBuilder;

    .line 553
    .line 554
    invoke-direct {v5, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 555
    .line 556
    .line 557
    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 558
    .line 559
    .line 560
    const-string v3, ".json"

    .line 561
    .line 562
    invoke-virtual {v5, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 563
    .line 564
    .line 565
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 566
    .line 567
    .line 568
    move-result-object v3

    .line 569
    new-instance v4, Landroid/content/Intent;

    .line 570
    .line 571
    const-string v5, "android.intent.action.CREATE_DOCUMENT"

    .line 572
    .line 573
    invoke-direct {v4, v5}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    .line 574
    .line 575
    .line 576
    const-string v5, "android.intent.category.OPENABLE"

    .line 577
    .line 578
    invoke-virtual {v4, v5}, Landroid/content/Intent;->addCategory(Ljava/lang/String;)Landroid/content/Intent;

    .line 579
    .line 580
    .line 581
    const-string v5, "application/json"

    .line 582
    .line 583
    invoke-virtual {v4, v5}, Landroid/content/Intent;->setType(Ljava/lang/String;)Landroid/content/Intent;

    .line 584
    .line 585
    .line 586
    const-string v5, "android.intent.extra.TITLE"

    .line 587
    .line 588
    invoke-virtual {v4, v5, v3}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 589
    .line 590
    .line 591
    const/4 v3, 0x2

    .line 592
    invoke-virtual {v4, v3}, Landroid/content/Intent;->addFlags(I)Landroid/content/Intent;

    .line 593
    .line 594
    .line 595
    invoke-static {v0, v4}, Lwb/ho;->B4(Landroid/content/Context;Landroid/content/Intent;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 596
    .line 597
    .line 598
    const v3, 0x48435258    # 200009.38f

    .line 599
    .line 600
    .line 601
    :try_start_1
    invoke-virtual {v0, v4, v3}, Landroid/app/Activity;->startActivityForResult(Landroid/content/Intent;I)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 602
    .line 603
    .line 604
    goto :goto_9

    .line 605
    :catchall_0
    :try_start_2
    const-string v3, "\u5f53\u524d\u7cfb\u7edf\u4e0d\u652f\u6301\u521b\u5efa\u914d\u7f6e\u6587\u4ef6"

    .line 606
    .line 607
    invoke-static {v0, v3, v2}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    .line 608
    .line 609
    .line 610
    move-result-object v0

    .line 611
    invoke-virtual {v0}, Landroid/widget/Toast;->show()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 612
    .line 613
    .line 614
    :goto_9
    monitor-exit v1

    .line 615
    :goto_a
    sget-object v0, Lsf/n;->a:Lsf/n;

    .line 616
    .line 617
    return-object v0

    .line 618
    :catchall_1
    move-exception v0

    .line 619
    :try_start_3
    monitor-exit v1
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 620
    throw v0

    .line 621
    :pswitch_11
    iget-object v0, p0, Lsh/v1;->h:Ljava/lang/Object;

    .line 622
    .line 623
    check-cast v0, Lfg/l;

    .line 624
    .line 625
    iget-object v1, p0, Lsh/v1;->i:Ljava/lang/Object;

    .line 626
    .line 627
    check-cast v1, Lvb/a;

    .line 628
    .line 629
    invoke-interface {v0, v1}, Lfg/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 630
    .line 631
    .line 632
    goto/16 :goto_0

    .line 633
    .line 634
    :pswitch_12
    iget-object v0, p0, Lsh/v1;->h:Ljava/lang/Object;

    .line 635
    .line 636
    check-cast v0, Lfg/p;

    .line 637
    .line 638
    iget-object v1, p0, Lsh/v1;->i:Ljava/lang/Object;

    .line 639
    .line 640
    check-cast v1, Lwb/d3;

    .line 641
    .line 642
    iget-object v2, v1, Lwb/d3;->a:Lvb/a;

    .line 643
    .line 644
    iget-object v1, v1, Lwb/d3;->b:Lwb/c3;

    .line 645
    .line 646
    invoke-interface {v0, v2, v1}, Lfg/p;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 647
    .line 648
    .line 649
    goto/16 :goto_0

    .line 650
    .line 651
    :pswitch_13
    iget-object v0, p0, Lsh/v1;->h:Ljava/lang/Object;

    .line 652
    .line 653
    check-cast v0, Ljava/util/List;

    .line 654
    .line 655
    iget-object v1, p0, Lsh/v1;->i:Ljava/lang/Object;

    .line 656
    .line 657
    check-cast v1, Li0/a1;

    .line 658
    .line 659
    invoke-interface {v1}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 660
    .line 661
    .line 662
    move-result-object v2

    .line 663
    check-cast v2, Ljava/util/Set;

    .line 664
    .line 665
    invoke-interface {v2}, Ljava/util/Set;->size()I

    .line 666
    .line 667
    .line 668
    move-result v2

    .line 669
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 670
    .line 671
    .line 672
    move-result v3

    .line 673
    if-ne v2, v3, :cond_a

    .line 674
    .line 675
    sget-object v0, Ltf/v;->g:Ltf/v;

    .line 676
    .line 677
    goto :goto_c

    .line 678
    :cond_a
    new-instance v2, Ljava/util/LinkedHashSet;

    .line 679
    .line 680
    invoke-direct {v2}, Ljava/util/LinkedHashSet;-><init>()V

    .line 681
    .line 682
    .line 683
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 684
    .line 685
    .line 686
    move-result-object v0

    .line 687
    :goto_b
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 688
    .line 689
    .line 690
    move-result v3

    .line 691
    if-eqz v3, :cond_b

    .line 692
    .line 693
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 694
    .line 695
    .line 696
    move-result-object v3

    .line 697
    check-cast v3, Lsf/j;

    .line 698
    .line 699
    iget-object v3, v3, Lsf/j;->g:Ljava/lang/Object;

    .line 700
    .line 701
    check-cast v3, Ljava/lang/String;

    .line 702
    .line 703
    invoke-interface {v2, v3}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 704
    .line 705
    .line 706
    goto :goto_b

    .line 707
    :cond_b
    move-object v0, v2

    .line 708
    :goto_c
    invoke-interface {v1, v0}, Li0/a1;->setValue(Ljava/lang/Object;)V

    .line 709
    .line 710
    .line 711
    goto/16 :goto_0

    .line 712
    .line 713
    :pswitch_14
    iget-object v0, p0, Lsh/v1;->h:Ljava/lang/Object;

    .line 714
    .line 715
    check-cast v0, Li0/j1;

    .line 716
    .line 717
    iget-object v1, p0, Lsh/v1;->i:Ljava/lang/Object;

    .line 718
    .line 719
    check-cast v1, Landroid/app/Activity;

    .line 720
    .line 721
    sget-object v2, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 722
    .line 723
    invoke-virtual {v0, v2}, Li0/j1;->setValue(Ljava/lang/Object;)V

    .line 724
    .line 725
    .line 726
    const-string v0, "\u5df2\u540c\u610f\u534f\u8bae\uff0c\u91cd\u542f\u5fae\u4fe1\u540e\u5b8c\u6574\u542f\u7528\u6a21\u5757\u529f\u80fd"

    .line 727
    .line 728
    const/4 v2, 0x1

    .line 729
    invoke-static {v1, v0, v2}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    .line 730
    .line 731
    .line 732
    move-result-object v0

    .line 733
    invoke-virtual {v0}, Landroid/widget/Toast;->show()V

    .line 734
    .line 735
    .line 736
    goto/16 :goto_0

    .line 737
    .line 738
    :pswitch_15
    iget-object v0, p0, Lsh/v1;->h:Ljava/lang/Object;

    .line 739
    .line 740
    check-cast v0, Lwb/xi;

    .line 741
    .line 742
    iget-object v1, p0, Lsh/v1;->i:Ljava/lang/Object;

    .line 743
    .line 744
    check-cast v1, Lc9/r0;

    .line 745
    .line 746
    invoke-virtual {v0}, Lwb/xi;->invoke()Ljava/lang/Object;

    .line 747
    .line 748
    .line 749
    invoke-virtual {v1}, Lc9/r0;->invoke()Ljava/lang/Object;

    .line 750
    .line 751
    .line 752
    goto/16 :goto_0

    .line 753
    .line 754
    :pswitch_16
    iget-object v0, p0, Lsh/v1;->h:Ljava/lang/Object;

    .line 755
    .line 756
    check-cast v0, Lc9/n0;

    .line 757
    .line 758
    iget-object v1, p0, Lsh/v1;->i:Ljava/lang/Object;

    .line 759
    .line 760
    check-cast v1, Lfg/a;

    .line 761
    .line 762
    invoke-virtual {v0}, Lc9/n0;->invoke()Ljava/lang/Object;

    .line 763
    .line 764
    .line 765
    move-result-object v0

    .line 766
    check-cast v0, Ljava/lang/Boolean;

    .line 767
    .line 768
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 769
    .line 770
    .line 771
    move-result v0

    .line 772
    if-eqz v0, :cond_c

    .line 773
    .line 774
    invoke-interface {v1}, Lfg/a;->invoke()Ljava/lang/Object;

    .line 775
    .line 776
    .line 777
    :cond_c
    sget-object v0, Lsf/n;->a:Lsf/n;

    .line 778
    .line 779
    return-object v0

    .line 780
    :pswitch_17
    iget-object v0, p0, Lsh/v1;->h:Ljava/lang/Object;

    .line 781
    .line 782
    check-cast v0, Lr8/g;

    .line 783
    .line 784
    iget-object v1, p0, Lsh/v1;->i:Ljava/lang/Object;

    .line 785
    .line 786
    check-cast v1, Lc9/g;

    .line 787
    .line 788
    :try_start_4
    iget-object v2, v0, Lr8/g;->a:Landroid/content/Context;

    .line 789
    .line 790
    const-string v3, "Hchat_protobuf_packet_config"

    .line 791
    .line 792
    invoke-static {v2, v3}, Lub/b;->c(Landroid/content/Context;Ljava/lang/String;)Landroid/content/SharedPreferences;

    .line 793
    .line 794
    .line 795
    move-result-object v7

    .line 796
    new-instance v4, Lwa/g;

    .line 797
    .line 798
    iget-object v5, v0, Lr8/g;->c:Ljava/lang/ClassLoader;

    .line 799
    .line 800
    iget-object v6, v0, Lr8/g;->e:Lh/Hchat/dexkit/DexFinder;

    .line 801
    .line 802
    new-instance v8, Lb5/c;

    .line 803
    .line 804
    iget-object v0, v0, Lr8/g;->a:Landroid/content/Context;

    .line 805
    .line 806
    const/16 v2, 0x1c

    .line 807
    .line 808
    invoke-direct {v8, v0, v2}, Lb5/c;-><init>(Landroid/content/Context;I)V

    .line 809
    .line 810
    .line 811
    new-instance v9, Lokio/a;

    .line 812
    .line 813
    const/16 v0, 0x17

    .line 814
    .line 815
    invoke-direct {v9, v0}, Lokio/a;-><init>(I)V

    .line 816
    .line 817
    .line 818
    invoke-direct/range {v4 .. v9}, Lwa/g;-><init>(Ljava/lang/ClassLoader;Lh/Hchat/dexkit/DexFinder;Landroid/content/SharedPreferences;Lb5/c;Lokio/a;)V

    .line 819
    .line 820
    .line 821
    invoke-virtual {v4}, Lwa/g;->m()Z

    .line 822
    .line 823
    .line 824
    move-result v0

    .line 825
    if-eqz v0, :cond_d

    .line 826
    .line 827
    sput-object v4, Lwa/j;->a:Lwa/g;
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_2

    .line 828
    .line 829
    goto :goto_d

    .line 830
    :catchall_2
    move-exception v0

    .line 831
    const-string v2, "Protobuf \u5b89\u88c5\u5931\u8d25"

    .line 832
    .line 833
    invoke-virtual {v1, v2, v0}, Lr8/a;->e(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 834
    .line 835
    .line 836
    const/4 v0, 0x0

    .line 837
    :cond_d
    :goto_d
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 838
    .line 839
    .line 840
    move-result-object v0

    .line 841
    return-object v0

    .line 842
    :pswitch_18
    iget-object v0, p0, Lsh/v1;->h:Ljava/lang/Object;

    .line 843
    .line 844
    check-cast v0, Li2/e;

    .line 845
    .line 846
    iget-object v1, p0, Lsh/v1;->i:Ljava/lang/Object;

    .line 847
    .line 848
    check-cast v1, Ly1/p0;

    .line 849
    .line 850
    iget-object v0, v0, Li2/e;->a:Ljava/lang/Object;

    .line 851
    .line 852
    check-cast v0, Li2/m;

    .line 853
    .line 854
    instance-of v2, v0, Li2/l;

    .line 855
    .line 856
    if-eqz v2, :cond_e

    .line 857
    .line 858
    :try_start_5
    check-cast v0, Li2/l;

    .line 859
    .line 860
    iget-object v0, v0, Li2/l;->a:Ljava/lang/String;

    .line 861
    .line 862
    invoke-virtual {v1, v0}, Ly1/p0;->a(Ljava/lang/String;)V
    :try_end_5
    .catch Ljava/lang/IllegalArgumentException; {:try_start_5 .. :try_end_5} :catch_0

    .line 863
    .line 864
    .line 865
    :catch_0
    :cond_e
    sget-object v0, Lsf/n;->a:Lsf/n;

    .line 866
    .line 867
    return-object v0

    .line 868
    :pswitch_19
    iget-object v0, p0, Lsh/v1;->h:Ljava/lang/Object;

    .line 869
    .line 870
    check-cast v0, Lw/n1;

    .line 871
    .line 872
    iget-object v1, p0, Lsh/v1;->i:Ljava/lang/Object;

    .line 873
    .line 874
    check-cast v1, Li2/g;

    .line 875
    .line 876
    if-eqz v0, :cond_12

    .line 877
    .line 878
    iget-object v2, v0, Lw/n1;->c:Lw0/p;

    .line 879
    .line 880
    invoke-virtual {v2}, Lw0/p;->isEmpty()Z

    .line 881
    .line 882
    .line 883
    move-result v3

    .line 884
    iget-object v4, v0, Lw/n1;->b:Li2/g;

    .line 885
    .line 886
    if-eqz v3, :cond_f

    .line 887
    .line 888
    goto :goto_f

    .line 889
    :cond_f
    new-instance v3, Lw/v0;

    .line 890
    .line 891
    invoke-direct {v3, v4}, Lw/v0;-><init>(Li2/g;)V

    .line 892
    .line 893
    .line 894
    invoke-virtual {v2}, Lw0/p;->size()I

    .line 895
    .line 896
    .line 897
    move-result v4

    .line 898
    const/4 v5, 0x0

    .line 899
    :goto_e
    if-ge v5, v4, :cond_10

    .line 900
    .line 901
    invoke-virtual {v2, v5}, Lw0/p;->get(I)Ljava/lang/Object;

    .line 902
    .line 903
    .line 904
    move-result-object v6

    .line 905
    check-cast v6, Lfg/l;

    .line 906
    .line 907
    invoke-interface {v6, v3}, Lfg/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 908
    .line 909
    .line 910
    add-int/lit8 v5, v5, 0x1

    .line 911
    .line 912
    goto :goto_e

    .line 913
    :cond_10
    iget-object v4, v3, Lw/v0;->b:Li2/g;

    .line 914
    .line 915
    :goto_f
    iput-object v4, v0, Lw/n1;->b:Li2/g;

    .line 916
    .line 917
    if-nez v4, :cond_11

    .line 918
    .line 919
    goto :goto_10

    .line 920
    :cond_11
    move-object v1, v4

    .line 921
    :cond_12
    :goto_10
    return-object v1

    .line 922
    :pswitch_1a
    iget-object v0, p0, Lsh/v1;->h:Ljava/lang/Object;

    .line 923
    .line 924
    check-cast v0, Ln2/s;

    .line 925
    .line 926
    iget-object v1, p0, Lsh/v1;->i:Ljava/lang/Object;

    .line 927
    .line 928
    check-cast v1, Li0/a1;

    .line 929
    .line 930
    iget-wide v2, v0, Ln2/s;->b:J

    .line 931
    .line 932
    invoke-interface {v1}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 933
    .line 934
    .line 935
    move-result-object v4

    .line 936
    check-cast v4, Ln2/s;

    .line 937
    .line 938
    iget-wide v4, v4, Ln2/s;->b:J

    .line 939
    .line 940
    invoke-static {v2, v3, v4, v5}, Li2/m0;->b(JJ)Z

    .line 941
    .line 942
    .line 943
    move-result v2

    .line 944
    if-eqz v2, :cond_13

    .line 945
    .line 946
    iget-object v2, v0, Ln2/s;->c:Li2/m0;

    .line 947
    .line 948
    invoke-interface {v1}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 949
    .line 950
    .line 951
    move-result-object v3

    .line 952
    check-cast v3, Ln2/s;

    .line 953
    .line 954
    iget-object v3, v3, Ln2/s;->c:Li2/m0;

    .line 955
    .line 956
    invoke-static {v2, v3}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 957
    .line 958
    .line 959
    move-result v2

    .line 960
    if-nez v2, :cond_14

    .line 961
    .line 962
    :cond_13
    invoke-interface {v1, v0}, Li0/a1;->setValue(Ljava/lang/Object;)V

    .line 963
    .line 964
    .line 965
    :cond_14
    sget-object v0, Lsf/n;->a:Lsf/n;

    .line 966
    .line 967
    return-object v0

    .line 968
    :pswitch_1b
    iget-object v0, p0, Lsh/v1;->h:Ljava/lang/Object;

    .line 969
    .line 970
    check-cast v0, Lr8/g;

    .line 971
    .line 972
    iget-object v1, p0, Lsh/v1;->i:Ljava/lang/Object;

    .line 973
    .line 974
    move-object v4, v1

    .line 975
    check-cast v4, Lua/b;

    .line 976
    .line 977
    const-class v1, Lua/b;

    .line 978
    .line 979
    const/4 v11, 0x0

    .line 980
    :try_start_6
    sget-object v12, Lua/g;->a:Lua/g;

    .line 981
    .line 982
    new-instance v2, Lia/t;

    .line 983
    .line 984
    invoke-static {v1}, Lgg/v;->a(Ljava/lang/Class;)Lgg/f;

    .line 985
    .line 986
    .line 987
    move-result-object v3

    .line 988
    invoke-interface {v3}, Lgg/e;->a()Ljava/lang/Class;

    .line 989
    .line 990
    .line 991
    move-result-object v5

    .line 992
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 993
    .line 994
    .line 995
    const-string v6, "logError"

    .line 996
    .line 997
    const-string v7, "logError(Ljava/lang/String;Ljava/lang/Throwable;)V"

    .line 998
    .line 999
    const/4 v9, 0x0

    .line 1000
    const/16 v10, 0x19

    .line 1001
    .line 1002
    const/4 v3, 0x2

    .line 1003
    const/4 v8, 0x0

    .line 1004
    invoke-direct/range {v2 .. v10}, Lia/t;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;III)V

    .line 1005
    .line 1006
    .line 1007
    invoke-virtual {v12, v0, v2}, Lua/g;->e(Lr8/g;Lia/t;)V

    .line 1008
    .line 1009
    .line 1010
    iget-object v2, v4, Lua/b;->h:Lua/k;

    .line 1011
    .line 1012
    if-nez v2, :cond_15

    .line 1013
    .line 1014
    new-instance v12, Lua/k;

    .line 1015
    .line 1016
    iget-object v13, v0, Lr8/g;->a:Landroid/content/Context;

    .line 1017
    .line 1018
    new-instance v2, Lia/t;

    .line 1019
    .line 1020
    invoke-static {v1}, Lgg/v;->a(Ljava/lang/Class;)Lgg/f;

    .line 1021
    .line 1022
    .line 1023
    move-result-object v1

    .line 1024
    invoke-interface {v1}, Lgg/e;->a()Ljava/lang/Class;

    .line 1025
    .line 1026
    .line 1027
    move-result-object v5

    .line 1028
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1029
    .line 1030
    .line 1031
    const-string v6, "logError"

    .line 1032
    .line 1033
    const-string v7, "logError(Ljava/lang/String;Ljava/lang/Throwable;)V"

    .line 1034
    .line 1035
    const/4 v9, 0x0

    .line 1036
    const/16 v10, 0x1a

    .line 1037
    .line 1038
    const/4 v3, 0x2

    .line 1039
    const/4 v8, 0x0

    .line 1040
    invoke-direct/range {v2 .. v10}, Lia/t;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;III)V

    .line 1041
    .line 1042
    .line 1043
    invoke-direct {v12, v13, v2}, Lua/k;-><init>(Landroid/content/Context;Lia/t;)V

    .line 1044
    .line 1045
    .line 1046
    iput-object v12, v4, Lua/b;->h:Lua/k;

    .line 1047
    .line 1048
    goto :goto_11

    .line 1049
    :catchall_3
    move-exception v0

    .line 1050
    goto :goto_14

    .line 1051
    :cond_15
    :goto_11
    iget-boolean v1, v4, Lua/b;->g:Z

    .line 1052
    .line 1053
    const/4 v2, 0x1

    .line 1054
    if-eqz v1, :cond_16

    .line 1055
    .line 1056
    :goto_12
    move v11, v2

    .line 1057
    goto :goto_15

    .line 1058
    :cond_16
    invoke-static {}, Lh/Hchat/hooks/api/core/WeChatApis;->message()Li8/c;

    .line 1059
    .line 1060
    .line 1061
    move-result-object v1

    .line 1062
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1063
    .line 1064
    .line 1065
    invoke-static {}, Lh/Hchat/hooks/api/core/WeChatApis;->l()Lk8/p;

    .line 1066
    .line 1067
    .line 1068
    move-result-object v1

    .line 1069
    if-eqz v1, :cond_18

    .line 1070
    .line 1071
    invoke-virtual {v1}, Lk8/p;->c()Z

    .line 1072
    .line 1073
    .line 1074
    move-result v3

    .line 1075
    if-nez v3, :cond_17

    .line 1076
    .line 1077
    goto :goto_13

    .line 1078
    :cond_17
    new-instance v3, Lua/a;

    .line 1079
    .line 1080
    invoke-direct {v3, v4, v0}, Lua/a;-><init>(Lua/b;Lr8/g;)V

    .line 1081
    .line 1082
    .line 1083
    invoke-virtual {v1, v3}, Lk8/p;->e(Lk8/n;)La2/a;

    .line 1084
    .line 1085
    .line 1086
    move-result-object v0

    .line 1087
    invoke-virtual {v4, v0}, Lr8/a;->j(Ljava/lang/Object;)V

    .line 1088
    .line 1089
    .line 1090
    iput-boolean v2, v4, Lua/b;->g:Z

    .line 1091
    .line 1092
    goto :goto_12

    .line 1093
    :cond_18
    :goto_13
    const-string v0, "\u6d88\u606f\u89c2\u5bdf\u4e0d\u53ef\u7528\uff0c\u81ea\u52a8\u6536\u6b3e\u672a\u5b89\u88c5"

    .line 1094
    .line 1095
    const/4 v1, 0x0

    .line 1096
    invoke-virtual {v4, v0, v1}, Lr8/a;->e(Ljava/lang/String;Ljava/lang/Throwable;)V
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_3

    .line 1097
    .line 1098
    .line 1099
    goto :goto_15

    .line 1100
    :goto_14
    const-string v1, "\u81ea\u52a8\u6536\u6b3e\u5b89\u88c5\u5931\u8d25"

    .line 1101
    .line 1102
    invoke-virtual {v4, v1, v0}, Lr8/a;->e(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 1103
    .line 1104
    .line 1105
    :goto_15
    invoke-static {v11}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 1106
    .line 1107
    .line 1108
    move-result-object v0

    .line 1109
    return-object v0

    .line 1110
    :pswitch_1c
    iget-object v0, p0, Lsh/v1;->h:Ljava/lang/Object;

    .line 1111
    .line 1112
    check-cast v0, Lsh/x;

    .line 1113
    .line 1114
    iget-object v1, p0, Lsh/v1;->i:Ljava/lang/Object;

    .line 1115
    .line 1116
    check-cast v1, Li0/l2;

    .line 1117
    .line 1118
    if-eqz v0, :cond_19

    .line 1119
    .line 1120
    iget-object v2, v0, Lsh/x;->a:Lsh/e2;

    .line 1121
    .line 1122
    if-eqz v2, :cond_19

    .line 1123
    .line 1124
    iget v2, v2, Lsh/e2;->a:F

    .line 1125
    .line 1126
    invoke-static {v2}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 1127
    .line 1128
    .line 1129
    move-result-object v2

    .line 1130
    goto :goto_16

    .line 1131
    :cond_19
    const/4 v2, 0x0

    .line 1132
    :goto_16
    invoke-interface {v1}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 1133
    .line 1134
    .line 1135
    move-result-object v3

    .line 1136
    check-cast v3, Ljava/lang/Number;

    .line 1137
    .line 1138
    invoke-virtual {v3}, Ljava/lang/Number;->floatValue()F

    .line 1139
    .line 1140
    .line 1141
    move-result v3

    .line 1142
    neg-float v3, v3

    .line 1143
    if-eqz v2, :cond_1a

    .line 1144
    .line 1145
    invoke-virtual {v2}, Ljava/lang/Float;->floatValue()F

    .line 1146
    .line 1147
    .line 1148
    move-result v2

    .line 1149
    cmpl-float v2, v2, v3

    .line 1150
    .line 1151
    if-nez v2, :cond_1a

    .line 1152
    .line 1153
    goto :goto_17

    .line 1154
    :cond_1a
    if-eqz v0, :cond_1b

    .line 1155
    .line 1156
    iget-object v0, v0, Lsh/x;->a:Lsh/e2;

    .line 1157
    .line 1158
    if-eqz v0, :cond_1b

    .line 1159
    .line 1160
    invoke-interface {v1}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 1161
    .line 1162
    .line 1163
    move-result-object v1

    .line 1164
    check-cast v1, Ljava/lang/Number;

    .line 1165
    .line 1166
    invoke-virtual {v1}, Ljava/lang/Number;->floatValue()F

    .line 1167
    .line 1168
    .line 1169
    move-result v1

    .line 1170
    neg-float v1, v1

    .line 1171
    iput v1, v0, Lsh/e2;->a:F

    .line 1172
    .line 1173
    :cond_1b
    :goto_17
    sget-object v0, Lsf/n;->a:Lsf/n;

    .line 1174
    .line 1175
    return-object v0

    .line 1176
    nop

    .line 1177
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
