.class public final synthetic Lvd2;
.super Ljava/lang/Object;
.source "r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4"

# interfaces
.implements Lxn0;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Lvn1;


# direct methods
.method public synthetic constructor <init>(Lvn1;I)V
    .locals 0

    .line 1
    iput p2, p0, Lvd2;->a:I

    .line 2
    .line 3
    iput-object p1, p0, Lvd2;->b:Lvn1;

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final b([Ljava/lang/Object;)Ljava/lang/Object;
    .locals 13

    .line 1
    iget v0, p0, Lvd2;->a:I

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const/4 v2, 0x1

    .line 5
    const/4 v3, 0x0

    .line 6
    iget-object p0, p0, Lvd2;->b:Lvn1;

    .line 7
    .line 8
    packed-switch v0, :pswitch_data_0

    .line 9
    .line 10
    .line 11
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 12
    .line 13
    .line 14
    :try_start_0
    invoke-static {v2, p1}, Lsp0;->a0(I[Ljava/lang/Object;)V

    .line 15
    .line 16
    .line 17
    aget-object p1, p1, v3

    .line 18
    .line 19
    const-string v0, "name"

    .line 20
    .line 21
    invoke-static {v0, p1}, Lsp0;->g0(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/String;

    .line 22
    .line 23
    .line 24
    move-result-object p1

    .line 25
    invoke-static {p1}, Lrp0;->Q(Ljava/lang/String;)V

    .line 26
    .line 27
    .line 28
    invoke-virtual {p0, p1}, Lvn1;->w(Ljava/lang/String;)Ljava/lang/Class;

    .line 29
    .line 30
    .line 31
    const-string p0, "className"

    .line 32
    .line 33
    invoke-static {p0, p1}, Ljava/util/Collections;->singletonMap(Ljava/lang/Object;Ljava/lang/Object;)Ljava/util/Map;

    .line 34
    .line 35
    .line 36
    move-result-object p0

    .line 37
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 38
    .line 39
    .line 40
    new-instance p1, Lcom/dokar/quickjs/binding/JsObject;

    .line 41
    .line 42
    invoke-direct {p1, p0}, Lcom/dokar/quickjs/binding/JsObject;-><init>(Ljava/util/Map;)V

    .line 43
    .line 44
    .line 45
    invoke-static {p1}, Leu;->v(Ljava/lang/Object;)Lcom/dokar/quickjs/binding/JsObject;

    .line 46
    .line 47
    .line 48
    move-result-object p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 49
    goto :goto_0

    .line 50
    :catchall_0
    move-exception v0

    .line 51
    move-object p0, v0

    .line 52
    invoke-static {p0}, Leu;->u(Ljava/lang/Throwable;)Lcom/dokar/quickjs/binding/JsObject;

    .line 53
    .line 54
    .line 55
    move-result-object p0

    .line 56
    :goto_0
    return-object p0

    .line 57
    :pswitch_0
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 58
    .line 59
    .line 60
    sget-object v0, Laf2;->a:Laf2;

    .line 61
    .line 62
    sget-object v1, Lph2;->k:Lph2;

    .line 63
    .line 64
    invoke-virtual {v0, p0, v1, p1}, Laf2;->e(Lvn1;Lph2;[Ljava/lang/Object;)V

    .line 65
    .line 66
    .line 67
    sget-object p0, La83;->a:La83;

    .line 68
    .line 69
    return-object p0

    .line 70
    :pswitch_1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 71
    .line 72
    .line 73
    sget-object v0, Laf2;->a:Laf2;

    .line 74
    .line 75
    sget-object v1, Lph2;->j:Lph2;

    .line 76
    .line 77
    invoke-virtual {v0, p0, v1, p1}, Laf2;->e(Lvn1;Lph2;[Ljava/lang/Object;)V

    .line 78
    .line 79
    .line 80
    sget-object p0, La83;->a:La83;

    .line 81
    .line 82
    return-object p0

    .line 83
    :pswitch_2
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 84
    .line 85
    .line 86
    sget-object v0, Laf2;->a:Laf2;

    .line 87
    .line 88
    sget-object v1, Lph2;->i:Lph2;

    .line 89
    .line 90
    invoke-virtual {v0, p0, v1, p1}, Laf2;->e(Lvn1;Lph2;[Ljava/lang/Object;)V

    .line 91
    .line 92
    .line 93
    sget-object p0, La83;->a:La83;

    .line 94
    .line 95
    return-object p0

    .line 96
    :pswitch_3
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 97
    .line 98
    .line 99
    sget-object v0, Laf2;->a:Laf2;

    .line 100
    .line 101
    sget-object v1, Lph2;->i:Lph2;

    .line 102
    .line 103
    invoke-virtual {v0, p0, v1, p1}, Laf2;->e(Lvn1;Lph2;[Ljava/lang/Object;)V

    .line 104
    .line 105
    .line 106
    sget-object p0, La83;->a:La83;

    .line 107
    .line 108
    return-object p0

    .line 109
    :pswitch_4
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 110
    .line 111
    .line 112
    sget-object v0, Laf2;->a:Laf2;

    .line 113
    .line 114
    sget-object v1, Lph2;->h:Lph2;

    .line 115
    .line 116
    invoke-virtual {v0, p0, v1, p1}, Laf2;->e(Lvn1;Lph2;[Ljava/lang/Object;)V

    .line 117
    .line 118
    .line 119
    sget-object p0, La83;->a:La83;

    .line 120
    .line 121
    return-object p0

    .line 122
    :pswitch_5
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 123
    .line 124
    .line 125
    :try_start_1
    invoke-static {v3, p1}, Lsp0;->a0(I[Ljava/lang/Object;)V

    .line 126
    .line 127
    .line 128
    invoke-virtual {p0}, Lvn1;->p()Ljava/lang/Object;

    .line 129
    .line 130
    .line 131
    move-result-object p0

    .line 132
    invoke-static {p0}, Leu;->v(Ljava/lang/Object;)Lcom/dokar/quickjs/binding/JsObject;

    .line 133
    .line 134
    .line 135
    move-result-object p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 136
    goto :goto_1

    .line 137
    :catchall_1
    move-exception v0

    .line 138
    move-object p0, v0

    .line 139
    invoke-static {p0}, Leu;->u(Ljava/lang/Throwable;)Lcom/dokar/quickjs/binding/JsObject;

    .line 140
    .line 141
    .line 142
    move-result-object p0

    .line 143
    :goto_1
    return-object p0

    .line 144
    :pswitch_6
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 145
    .line 146
    .line 147
    :try_start_2
    invoke-static {v3, p1}, Lsp0;->a0(I[Ljava/lang/Object;)V

    .line 148
    .line 149
    .line 150
    invoke-virtual {p0}, Lvn1;->y()Lcom/dokar/quickjs/binding/JsObject;

    .line 151
    .line 152
    .line 153
    move-result-object p0

    .line 154
    invoke-static {p0}, Leu;->v(Ljava/lang/Object;)Lcom/dokar/quickjs/binding/JsObject;

    .line 155
    .line 156
    .line 157
    move-result-object p0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    .line 158
    goto :goto_2

    .line 159
    :catchall_2
    move-exception v0

    .line 160
    move-object p0, v0

    .line 161
    invoke-static {p0}, Leu;->u(Ljava/lang/Throwable;)Lcom/dokar/quickjs/binding/JsObject;

    .line 162
    .line 163
    .line 164
    move-result-object p0

    .line 165
    :goto_2
    return-object p0

    .line 166
    :pswitch_7
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 167
    .line 168
    .line 169
    :try_start_3
    invoke-static {v3, p1}, Lsp0;->a0(I[Ljava/lang/Object;)V

    .line 170
    .line 171
    .line 172
    invoke-virtual {p0}, Lvn1;->r()Ljava/lang/Object;

    .line 173
    .line 174
    .line 175
    move-result-object p0

    .line 176
    invoke-static {p0}, Leu;->v(Ljava/lang/Object;)Lcom/dokar/quickjs/binding/JsObject;

    .line 177
    .line 178
    .line 179
    move-result-object p0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_3

    .line 180
    goto :goto_3

    .line 181
    :catchall_3
    move-exception v0

    .line 182
    move-object p0, v0

    .line 183
    invoke-static {p0}, Leu;->u(Ljava/lang/Throwable;)Lcom/dokar/quickjs/binding/JsObject;

    .line 184
    .line 185
    .line 186
    move-result-object p0

    .line 187
    :goto_3
    return-object p0

    .line 188
    :pswitch_8
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 189
    .line 190
    .line 191
    :try_start_4
    invoke-static {v2, p1}, Lsp0;->a0(I[Ljava/lang/Object;)V

    .line 192
    .line 193
    .line 194
    aget-object p1, p1, v3

    .line 195
    .line 196
    const-string v0, "referenceId"

    .line 197
    .line 198
    invoke-static {v0, p1}, Lsp0;->g0(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/String;

    .line 199
    .line 200
    .line 201
    move-result-object p1

    .line 202
    iget-object p0, p0, Lvn1;->i:Ljava/lang/Object;

    .line 203
    .line 204
    check-cast p0, Ljh2;

    .line 205
    .line 206
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 207
    .line 208
    .line 209
    iget-object v1, p0, Ljh2;->a:Ljava/lang/Object;

    .line 210
    .line 211
    monitor-enter v1
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_5

    .line 212
    :try_start_5
    iget-object p0, p0, Ljh2;->b:Ljava/util/LinkedHashMap;

    .line 213
    .line 214
    invoke-virtual {p0, p1}, Ljava/util/AbstractMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 215
    .line 216
    .line 217
    move-result-object p0
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_4

    .line 218
    if-eqz p0, :cond_0

    .line 219
    .line 220
    goto :goto_4

    .line 221
    :cond_0
    move v2, v3

    .line 222
    :goto_4
    :try_start_6
    monitor-exit v1

    .line 223
    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 224
    .line 225
    .line 226
    move-result-object p0

    .line 227
    invoke-static {p0}, Leu;->v(Ljava/lang/Object;)Lcom/dokar/quickjs/binding/JsObject;

    .line 228
    .line 229
    .line 230
    move-result-object p0

    .line 231
    goto :goto_5

    .line 232
    :catchall_4
    move-exception v0

    .line 233
    move-object p0, v0

    .line 234
    monitor-exit v1

    .line 235
    throw p0
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_5

    .line 236
    :catchall_5
    move-exception v0

    .line 237
    move-object p0, v0

    .line 238
    invoke-static {p0}, Leu;->u(Ljava/lang/Throwable;)Lcom/dokar/quickjs/binding/JsObject;

    .line 239
    .line 240
    .line 241
    move-result-object p0

    .line 242
    :goto_5
    return-object p0

    .line 243
    :pswitch_9
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 244
    .line 245
    .line 246
    :try_start_7
    invoke-static {v3, p1}, Lsp0;->a0(I[Ljava/lang/Object;)V

    .line 247
    .line 248
    .line 249
    iget-object p1, p0, Lvn1;->j:Ljava/lang/Object;

    .line 250
    .line 251
    monitor-enter p1
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_7

    .line 252
    :try_start_8
    iget-object v0, p0, Lvn1;->k:Ljava/lang/Object;

    .line 253
    .line 254
    check-cast v0, Lci2;

    .line 255
    .line 256
    if-nez v0, :cond_1

    .line 257
    .line 258
    goto :goto_6

    .line 259
    :cond_1
    iput-object v1, p0, Lvn1;->k:Ljava/lang/Object;

    .line 260
    .line 261
    iget-object p0, p0, Lvn1;->i:Ljava/lang/Object;

    .line 262
    .line 263
    check-cast p0, Ljh2;

    .line 264
    .line 265
    invoke-static {v0, p0}, Lgf1;->X(Lci2;Ljh2;)Lcom/dokar/quickjs/binding/JsObject;

    .line 266
    .line 267
    .line 268
    move-result-object v1
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_6

    .line 269
    :goto_6
    :try_start_9
    monitor-exit p1

    .line 270
    invoke-static {v1}, Leu;->v(Ljava/lang/Object;)Lcom/dokar/quickjs/binding/JsObject;

    .line 271
    .line 272
    .line 273
    move-result-object p0

    .line 274
    goto :goto_7

    .line 275
    :catchall_6
    move-exception v0

    .line 276
    move-object p0, v0

    .line 277
    monitor-exit p1

    .line 278
    throw p0
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_7

    .line 279
    :catchall_7
    move-exception v0

    .line 280
    move-object p0, v0

    .line 281
    invoke-static {p0}, Leu;->u(Ljava/lang/Throwable;)Lcom/dokar/quickjs/binding/JsObject;

    .line 282
    .line 283
    .line 284
    move-result-object p0

    .line 285
    :goto_7
    return-object p0

    .line 286
    :pswitch_a
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 287
    .line 288
    .line 289
    invoke-static {v3, p1}, Lsp0;->a0(I[Ljava/lang/Object;)V

    .line 290
    .line 291
    .line 292
    iget-object p0, p0, Lvn1;->d:Ljava/lang/Object;

    .line 293
    .line 294
    check-cast p0, Ldf2;

    .line 295
    .line 296
    iget-object p0, p0, Ldf2;->a:Lbf2;

    .line 297
    .line 298
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 299
    .line 300
    .line 301
    const/16 p0, 0x80

    .line 302
    .line 303
    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 304
    .line 305
    .line 306
    move-result-object p0

    .line 307
    return-object p0

    .line 308
    :pswitch_b
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 309
    .line 310
    .line 311
    invoke-static {v3, p1}, Lsp0;->a0(I[Ljava/lang/Object;)V

    .line 312
    .line 313
    .line 314
    iget-object p0, p0, Lvn1;->d:Ljava/lang/Object;

    .line 315
    .line 316
    check-cast p0, Ldf2;

    .line 317
    .line 318
    iget-object p0, p0, Ldf2;->a:Lbf2;

    .line 319
    .line 320
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 321
    .line 322
    .line 323
    const-wide/16 p0, 0xa

    .line 324
    .line 325
    invoke-static {p0, p1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 326
    .line 327
    .line 328
    move-result-object p0

    .line 329
    return-object p0

    .line 330
    :pswitch_c
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 331
    .line 332
    .line 333
    const/4 v0, 0x2

    .line 334
    :try_start_a
    invoke-static {v0, p1}, Lsp0;->a0(I[Ljava/lang/Object;)V

    .line 335
    .line 336
    .line 337
    sget-object v6, Laf2;->a:Laf2;

    .line 338
    .line 339
    aget-object v0, p1, v3

    .line 340
    .line 341
    const-string v3, "level"

    .line 342
    .line 343
    invoke-static {v3, v0}, Lsp0;->g0(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/String;

    .line 344
    .line 345
    .line 346
    move-result-object v0
    :try_end_a
    .catchall {:try_start_a .. :try_end_a} :catchall_8

    .line 347
    :try_start_b
    invoke-static {v0}, Lph2;->valueOf(Ljava/lang/String;)Lph2;

    .line 348
    .line 349
    .line 350
    move-result-object v0
    :try_end_b
    .catch Ljava/lang/IllegalArgumentException; {:try_start_b .. :try_end_b} :catch_0
    .catchall {:try_start_b .. :try_end_b} :catchall_8

    .line 351
    :try_start_c
    aget-object p1, p1, v2

    .line 352
    .line 353
    instance-of v2, p1, Ljava/util/List;

    .line 354
    .line 355
    if-eqz v2, :cond_2

    .line 356
    .line 357
    move-object v1, p1

    .line 358
    check-cast v1, Ljava/util/List;

    .line 359
    .line 360
    :cond_2
    if-eqz v1, :cond_3

    .line 361
    .line 362
    const-string v2, " "

    .line 363
    .line 364
    new-instance v4, Le2;

    .line 365
    .line 366
    const-class v7, Laf2;

    .line 367
    .line 368
    const-string v8, "formatLogValue"

    .line 369
    .line 370
    const-string v9, "formatLogValue(Ljava/lang/Object;)Ljava/lang/String;"

    .line 371
    .line 372
    const/4 v11, 0x0

    .line 373
    const/4 v12, 0x4

    .line 374
    const/4 v5, 0x1

    .line 375
    const/4 v10, 0x0

    .line 376
    invoke-direct/range {v4 .. v12}, Le2;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;III)V

    .line 377
    .line 378
    .line 379
    const/16 v6, 0x1e

    .line 380
    .line 381
    const/4 v3, 0x0

    .line 382
    move-object v5, v4

    .line 383
    const/4 v4, 0x0

    .line 384
    invoke-static/range {v1 .. v6}, Ldu;->u0(Ljava/lang/Iterable;Ljava/lang/CharSequence;Ljava/lang/String;Ljava/lang/String;Lin0;I)Ljava/lang/String;

    .line 385
    .line 386
    .line 387
    move-result-object p1

    .line 388
    invoke-virtual {p0, v0, p1}, Lvn1;->t(Lph2;Ljava/lang/String;)V

    .line 389
    .line 390
    .line 391
    sget-object p0, La83;->a:La83;

    .line 392
    .line 393
    invoke-static {p0}, Leu;->v(Ljava/lang/Object;)Lcom/dokar/quickjs/binding/JsObject;

    .line 394
    .line 395
    .line 396
    move-result-object p0

    .line 397
    goto :goto_8

    .line 398
    :cond_3
    new-instance v0, Lsd2;

    .line 399
    .line 400
    const-string v1, "INVALID_ARGUMENT"

    .line 401
    .line 402
    const-string v2, "values must be an array."

    .line 403
    .line 404
    const/4 v5, 0x0

    .line 405
    const/16 v6, 0x1c

    .line 406
    .line 407
    const/4 v3, 0x0

    .line 408
    const/4 v4, 0x0

    .line 409
    invoke-direct/range {v0 .. v6}, Lsd2;-><init>(Ljava/lang/String;Ljava/lang/String;ZLjava/util/Map;Ljava/lang/Throwable;I)V

    .line 410
    .line 411
    .line 412
    throw v0

    .line 413
    :catch_0
    move-exception v0

    .line 414
    move-object v5, v0

    .line 415
    new-instance v0, Lsd2;

    .line 416
    .line 417
    const-string v1, "INVALID_ARGUMENT"

    .line 418
    .line 419
    const-string v2, "Unknown log level."

    .line 420
    .line 421
    const/4 v4, 0x0

    .line 422
    const/16 v6, 0xc

    .line 423
    .line 424
    const/4 v3, 0x0

    .line 425
    invoke-direct/range {v0 .. v6}, Lsd2;-><init>(Ljava/lang/String;Ljava/lang/String;ZLjava/util/Map;Ljava/lang/Throwable;I)V

    .line 426
    .line 427
    .line 428
    throw v0
    :try_end_c
    .catchall {:try_start_c .. :try_end_c} :catchall_8

    .line 429
    :catchall_8
    move-exception v0

    .line 430
    move-object p0, v0

    .line 431
    invoke-static {p0}, Leu;->u(Ljava/lang/Throwable;)Lcom/dokar/quickjs/binding/JsObject;

    .line 432
    .line 433
    .line 434
    move-result-object p0

    .line 435
    :goto_8
    return-object p0

    .line 436
    :pswitch_d
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 437
    .line 438
    .line 439
    :try_start_d
    invoke-static {v3, p1}, Lsp0;->a0(I[Ljava/lang/Object;)V

    .line 440
    .line 441
    .line 442
    invoke-virtual {p0}, Lvn1;->g()Lcom/dokar/quickjs/binding/JsObject;

    .line 443
    .line 444
    .line 445
    move-result-object p0

    .line 446
    invoke-static {p0}, Leu;->v(Ljava/lang/Object;)Lcom/dokar/quickjs/binding/JsObject;

    .line 447
    .line 448
    .line 449
    move-result-object p0
    :try_end_d
    .catchall {:try_start_d .. :try_end_d} :catchall_9

    .line 450
    goto :goto_9

    .line 451
    :catchall_9
    move-exception v0

    .line 452
    move-object p0, v0

    .line 453
    invoke-static {p0}, Leu;->u(Ljava/lang/Throwable;)Lcom/dokar/quickjs/binding/JsObject;

    .line 454
    .line 455
    .line 456
    move-result-object p0

    .line 457
    :goto_9
    return-object p0

    .line 458
    :pswitch_e
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 459
    .line 460
    .line 461
    :try_start_e
    invoke-static {v2, p1}, Lsp0;->a0(I[Ljava/lang/Object;)V

    .line 462
    .line 463
    .line 464
    aget-object p1, p1, v3

    .line 465
    .line 466
    const-string v0, "permission"

    .line 467
    .line 468
    invoke-static {v0, p1}, Lsp0;->g0(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/String;

    .line 469
    .line 470
    .line 471
    move-result-object p1

    .line 472
    invoke-virtual {p0, p1}, Lvn1;->n(Ljava/lang/String;)Z

    .line 473
    .line 474
    .line 475
    move-result p0

    .line 476
    invoke-static {p0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 477
    .line 478
    .line 479
    move-result-object p0

    .line 480
    invoke-static {p0}, Leu;->v(Ljava/lang/Object;)Lcom/dokar/quickjs/binding/JsObject;

    .line 481
    .line 482
    .line 483
    move-result-object p0
    :try_end_e
    .catchall {:try_start_e .. :try_end_e} :catchall_a

    .line 484
    goto :goto_a

    .line 485
    :catchall_a
    move-exception v0

    .line 486
    move-object p0, v0

    .line 487
    invoke-static {p0}, Leu;->u(Ljava/lang/Throwable;)Lcom/dokar/quickjs/binding/JsObject;

    .line 488
    .line 489
    .line 490
    move-result-object p0

    .line 491
    :goto_a
    return-object p0

    .line 492
    nop

    .line 493
    :pswitch_data_0
    .packed-switch 0x0
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
