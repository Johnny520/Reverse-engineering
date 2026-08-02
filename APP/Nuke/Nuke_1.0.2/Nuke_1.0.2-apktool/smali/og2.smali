.class public final Log2;
.super Ltw2;
.source "r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4"

# interfaces
.implements Lmn0;


# instance fields
.field public final synthetic l:I

.field public m:I

.field public final synthetic n:Lhg2;

.field public final synthetic o:Ldq1;


# direct methods
.method public synthetic constructor <init>(Lt00;Lhg2;Ldq1;I)V
    .locals 0

    .line 1
    iput p4, p0, Log2;->l:I

    .line 2
    .line 3
    iput-object p2, p0, Log2;->n:Lhg2;

    .line 4
    .line 5
    iput-object p3, p0, Log2;->o:Ldq1;

    .line 6
    .line 7
    const/4 p2, 0x2

    .line 8
    invoke-direct {p0, p2, p1}, Ltw2;-><init>(ILt00;)V

    .line 9
    .line 10
    .line 11
    return-void
.end method


# virtual methods
.method public final g(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    .line 1
    iget v0, p0, Log2;->l:I

    .line 2
    .line 3
    sget-object v1, La83;->a:La83;

    .line 4
    .line 5
    check-cast p1, Lj20;

    .line 6
    .line 7
    check-cast p2, Lt00;

    .line 8
    .line 9
    packed-switch v0, :pswitch_data_0

    .line 10
    .line 11
    .line 12
    invoke-virtual {p0, p2, p1}, Log2;->p(Lt00;Ljava/lang/Object;)Lt00;

    .line 13
    .line 14
    .line 15
    move-result-object p0

    .line 16
    check-cast p0, Log2;

    .line 17
    .line 18
    invoke-virtual {p0, v1}, Log2;->r(Ljava/lang/Object;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    return-object p0

    .line 23
    :pswitch_0
    invoke-virtual {p0, p2, p1}, Log2;->p(Lt00;Ljava/lang/Object;)Lt00;

    .line 24
    .line 25
    .line 26
    move-result-object p0

    .line 27
    check-cast p0, Log2;

    .line 28
    .line 29
    invoke-virtual {p0, v1}, Log2;->r(Ljava/lang/Object;)Ljava/lang/Object;

    .line 30
    .line 31
    .line 32
    move-result-object p0

    .line 33
    return-object p0

    .line 34
    :pswitch_1
    invoke-virtual {p0, p2, p1}, Log2;->p(Lt00;Ljava/lang/Object;)Lt00;

    .line 35
    .line 36
    .line 37
    move-result-object p0

    .line 38
    check-cast p0, Log2;

    .line 39
    .line 40
    invoke-virtual {p0, v1}, Log2;->r(Ljava/lang/Object;)Ljava/lang/Object;

    .line 41
    .line 42
    .line 43
    move-result-object p0

    .line 44
    return-object p0

    .line 45
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final p(Lt00;Ljava/lang/Object;)Lt00;
    .locals 2

    .line 1
    iget p2, p0, Log2;->l:I

    .line 2
    .line 3
    iget-object v0, p0, Log2;->o:Ldq1;

    .line 4
    .line 5
    iget-object p0, p0, Log2;->n:Lhg2;

    .line 6
    .line 7
    packed-switch p2, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    new-instance p2, Log2;

    .line 11
    .line 12
    const/4 v1, 0x2

    .line 13
    invoke-direct {p2, p1, p0, v0, v1}, Log2;-><init>(Lt00;Lhg2;Ldq1;I)V

    .line 14
    .line 15
    .line 16
    return-object p2

    .line 17
    :pswitch_0
    new-instance p2, Log2;

    .line 18
    .line 19
    const/4 v1, 0x1

    .line 20
    invoke-direct {p2, p1, p0, v0, v1}, Log2;-><init>(Lt00;Lhg2;Ldq1;I)V

    .line 21
    .line 22
    .line 23
    return-object p2

    .line 24
    :pswitch_1
    new-instance p2, Log2;

    .line 25
    .line 26
    const/4 v1, 0x0

    .line 27
    invoke-direct {p2, p1, p0, v0, v1}, Log2;-><init>(Lt00;Lhg2;Ldq1;I)V

    .line 28
    .line 29
    .line 30
    return-object p2

    .line 31
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final r(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 10

    .line 1
    iget v0, p0, Log2;->l:I

    .line 2
    .line 3
    const/4 v1, 0x3

    .line 4
    const/4 v2, 0x2

    .line 5
    const-string v3, "call to \'resume\' before \'invoke\' with coroutine"

    .line 6
    .line 7
    sget-object v4, Lk20;->h:Lk20;

    .line 8
    .line 9
    const/4 v5, 0x1

    .line 10
    iget-object v6, p0, Log2;->n:Lhg2;

    .line 11
    .line 12
    iget-object v7, p0, Log2;->o:Ldq1;

    .line 13
    .line 14
    const/4 v8, 0x0

    .line 15
    packed-switch v0, :pswitch_data_0

    .line 16
    .line 17
    .line 18
    iget v0, p0, Log2;->m:I

    .line 19
    .line 20
    if-eqz v0, :cond_1

    .line 21
    .line 22
    if-ne v0, v5, :cond_0

    .line 23
    .line 24
    invoke-static {p1}, Lfg1;->T(Ljava/lang/Object;)V

    .line 25
    .line 26
    .line 27
    goto :goto_2

    .line 28
    :cond_0
    invoke-static {v3}, Ls;->l(Ljava/lang/String;)V

    .line 29
    .line 30
    .line 31
    :goto_0
    move-object p1, v8

    .line 32
    goto :goto_2

    .line 33
    :cond_1
    invoke-static {p1}, Lfg1;->T(Ljava/lang/Object;)V

    .line 34
    .line 35
    .line 36
    iget-object p1, v6, Lhg2;->a:Lfg2;

    .line 37
    .line 38
    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    .line 39
    .line 40
    .line 41
    move-result p1

    .line 42
    if-eqz p1, :cond_4

    .line 43
    .line 44
    if-eq p1, v5, :cond_3

    .line 45
    .line 46
    if-eq p1, v2, :cond_3

    .line 47
    .line 48
    if-ne p1, v1, :cond_2

    .line 49
    .line 50
    goto :goto_1

    .line 51
    :cond_2
    invoke-static {}, Lc80;->s()V

    .line 52
    .line 53
    .line 54
    goto :goto_0

    .line 55
    :cond_3
    :goto_1
    invoke-virtual {v7, v6}, Ldq1;->T(Lhg2;)Ljava/io/File;

    .line 56
    .line 57
    .line 58
    move-result-object p0

    .line 59
    invoke-virtual {v7, v6, p0}, Ldq1;->W(Lhg2;Ljava/io/File;)Lgg2;

    .line 60
    .line 61
    .line 62
    move-result-object p1

    .line 63
    goto :goto_2

    .line 64
    :cond_4
    iput v5, p0, Log2;->m:I

    .line 65
    .line 66
    invoke-virtual {v7, v6, p0}, Ldq1;->K(Lhg2;Lu00;)Ljava/lang/Object;

    .line 67
    .line 68
    .line 69
    move-result-object p1

    .line 70
    if-ne p1, v4, :cond_5

    .line 71
    .line 72
    move-object p1, v4

    .line 73
    :cond_5
    :goto_2
    return-object p1

    .line 74
    :pswitch_0
    iget-object v0, v7, Ldq1;->i:Ljava/lang/Object;

    .line 75
    .line 76
    check-cast v0, Lvn1;

    .line 77
    .line 78
    iget v9, p0, Log2;->m:I

    .line 79
    .line 80
    if-eqz v9, :cond_7

    .line 81
    .line 82
    if-ne v9, v5, :cond_6

    .line 83
    .line 84
    invoke-static {p1}, Lfg1;->T(Ljava/lang/Object;)V

    .line 85
    .line 86
    .line 87
    goto/16 :goto_6

    .line 88
    .line 89
    :cond_6
    invoke-static {v3}, Ls;->l(Ljava/lang/String;)V

    .line 90
    .line 91
    .line 92
    :goto_3
    move-object p1, v8

    .line 93
    goto/16 :goto_6

    .line 94
    .line 95
    :cond_7
    invoke-static {p1}, Lfg1;->T(Ljava/lang/Object;)V

    .line 96
    .line 97
    .line 98
    iget-object p1, v6, Lhg2;->a:Lfg2;

    .line 99
    .line 100
    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    .line 101
    .line 102
    .line 103
    move-result p1

    .line 104
    if-eqz p1, :cond_f

    .line 105
    .line 106
    if-eq p1, v5, :cond_9

    .line 107
    .line 108
    if-eq p1, v2, :cond_9

    .line 109
    .line 110
    if-ne p1, v1, :cond_8

    .line 111
    .line 112
    goto :goto_4

    .line 113
    :cond_8
    invoke-static {}, Lc80;->s()V

    .line 114
    .line 115
    .line 116
    goto :goto_3

    .line 117
    :cond_9
    :goto_4
    invoke-virtual {v7, v6}, Ldq1;->T(Lhg2;)Ljava/io/File;

    .line 118
    .line 119
    .line 120
    move-result-object p0

    .line 121
    invoke-virtual {p0}, Ljava/io/File;->isFile()Z

    .line 122
    .line 123
    .line 124
    move-result p1

    .line 125
    if-eqz p1, :cond_e

    .line 126
    .line 127
    invoke-virtual {p0}, Ljava/io/File;->length()J

    .line 128
    .line 129
    .line 130
    move-result-wide v1

    .line 131
    iget-object p1, v0, Lvn1;->d:Ljava/lang/Object;

    .line 132
    .line 133
    check-cast p1, Ldf2;

    .line 134
    .line 135
    iget-object p1, p1, Ldf2;->a:Lbf2;

    .line 136
    .line 137
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 138
    .line 139
    .line 140
    const-wide/32 v3, 0x1000000

    .line 141
    .line 142
    .line 143
    cmp-long p1, v1, v3

    .line 144
    .line 145
    if-gtz p1, :cond_d

    .line 146
    .line 147
    new-instance p1, Ljava/io/FileInputStream;

    .line 148
    .line 149
    invoke-direct {p1, p0}, Ljava/io/FileInputStream;-><init>(Ljava/io/File;)V

    .line 150
    .line 151
    .line 152
    const/16 p0, 0x2000

    .line 153
    .line 154
    new-instance v1, Ljava/io/BufferedInputStream;

    .line 155
    .line 156
    invoke-direct {v1, p1, p0}, Ljava/io/BufferedInputStream;-><init>(Ljava/io/InputStream;I)V

    .line 157
    .line 158
    .line 159
    :try_start_0
    iget-object p1, v0, Lvn1;->d:Ljava/lang/Object;

    .line 160
    .line 161
    check-cast p1, Ldf2;

    .line 162
    .line 163
    iget-object p1, p1, Ldf2;->a:Lbf2;

    .line 164
    .line 165
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 166
    .line 167
    .line 168
    new-array p0, p0, [B

    .line 169
    .line 170
    new-instance p1, Ljava/io/ByteArrayOutputStream;

    .line 171
    .line 172
    const-wide/16 v5, 0x2000

    .line 173
    .line 174
    invoke-static {v3, v4, v5, v6}, Ljava/lang/Math;->min(JJ)J

    .line 175
    .line 176
    .line 177
    move-result-wide v5

    .line 178
    long-to-int v0, v5

    .line 179
    invoke-direct {p1, v0}, Ljava/io/ByteArrayOutputStream;-><init>(I)V

    .line 180
    .line 181
    .line 182
    const-wide/16 v5, 0x0

    .line 183
    .line 184
    :goto_5
    invoke-virtual {v1, p0}, Ljava/io/InputStream;->read([B)I

    .line 185
    .line 186
    .line 187
    move-result v0

    .line 188
    if-gez v0, :cond_a

    .line 189
    .line 190
    invoke-virtual {p1}, Ljava/io/ByteArrayOutputStream;->toByteArray()[B

    .line 191
    .line 192
    .line 193
    move-result-object p1

    .line 194
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 195
    .line 196
    .line 197
    invoke-interface {v1}, Ljava/io/Closeable;->close()V

    .line 198
    .line 199
    .line 200
    goto :goto_6

    .line 201
    :cond_a
    if-nez v0, :cond_b

    .line 202
    .line 203
    goto :goto_5

    .line 204
    :cond_b
    int-to-long v7, v0

    .line 205
    add-long/2addr v5, v7

    .line 206
    cmp-long v2, v5, v3

    .line 207
    .line 208
    if-gtz v2, :cond_c

    .line 209
    .line 210
    const/4 v2, 0x0

    .line 211
    :try_start_1
    invoke-virtual {p1, p0, v2, v0}, Ljava/io/ByteArrayOutputStream;->write([BII)V

    .line 212
    .line 213
    .line 214
    goto :goto_5

    .line 215
    :cond_c
    new-instance v2, Lsd2;

    .line 216
    .line 217
    const-string v3, "QUOTA_EXCEEDED"

    .line 218
    .line 219
    const-string v4, "File exceeds the read limit."

    .line 220
    .line 221
    const/4 v7, 0x0

    .line 222
    const/16 v8, 0x1c

    .line 223
    .line 224
    const/4 v5, 0x0

    .line 225
    const/4 v6, 0x0

    .line 226
    invoke-direct/range {v2 .. v8}, Lsd2;-><init>(Ljava/lang/String;Ljava/lang/String;ZLjava/util/Map;Ljava/lang/Throwable;I)V

    .line 227
    .line 228
    .line 229
    throw v2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 230
    :catchall_0
    move-exception v0

    .line 231
    move-object p0, v0

    .line 232
    :try_start_2
    throw p0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 233
    :catchall_1
    move-exception v0

    .line 234
    move-object p1, v0

    .line 235
    invoke-static {v1, p0}, Lpp0;->n(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    .line 236
    .line 237
    .line 238
    throw p1

    .line 239
    :cond_d
    const/4 v6, 0x0

    .line 240
    const/16 v7, 0x1c

    .line 241
    .line 242
    const-string v2, "QUOTA_EXCEEDED"

    .line 243
    .line 244
    const-string v3, "File exceeds the read limit."

    .line 245
    .line 246
    const/4 v4, 0x0

    .line 247
    const/4 v5, 0x0

    .line 248
    invoke-static/range {v2 .. v7}, Lc80;->p(Ljava/lang/String;Ljava/lang/String;ILjava/util/Map;Ljava/lang/Throwable;I)V

    .line 249
    .line 250
    .line 251
    goto/16 :goto_3

    .line 252
    .line 253
    :cond_e
    new-instance p0, Ljava/io/FileNotFoundException;

    .line 254
    .line 255
    iget-object p1, v6, Lhg2;->b:Ljava/lang/String;

    .line 256
    .line 257
    const-string v0, "File does not exist: "

    .line 258
    .line 259
    invoke-virtual {v0, p1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 260
    .line 261
    .line 262
    move-result-object p1

    .line 263
    invoke-direct {p0, p1}, Ljava/io/FileNotFoundException;-><init>(Ljava/lang/String;)V

    .line 264
    .line 265
    .line 266
    throw p0

    .line 267
    :cond_f
    iput v5, p0, Log2;->m:I

    .line 268
    .line 269
    invoke-virtual {v7, v6, p0}, Ldq1;->O(Lhg2;Lu00;)Ljava/lang/Object;

    .line 270
    .line 271
    .line 272
    move-result-object p1

    .line 273
    if-ne p1, v4, :cond_10

    .line 274
    .line 275
    move-object p1, v4

    .line 276
    :cond_10
    :goto_6
    return-object p1

    .line 277
    :pswitch_1
    iget v0, p0, Log2;->m:I

    .line 278
    .line 279
    if-eqz v0, :cond_12

    .line 280
    .line 281
    if-ne v0, v5, :cond_11

    .line 282
    .line 283
    invoke-static {p1}, Lfg1;->T(Ljava/lang/Object;)V

    .line 284
    .line 285
    .line 286
    goto/16 :goto_b

    .line 287
    .line 288
    :cond_11
    invoke-static {v3}, Ls;->l(Ljava/lang/String;)V

    .line 289
    .line 290
    .line 291
    :goto_7
    move-object p1, v8

    .line 292
    goto/16 :goto_b

    .line 293
    .line 294
    :cond_12
    invoke-static {p1}, Lfg1;->T(Ljava/lang/Object;)V

    .line 295
    .line 296
    .line 297
    iget-object p1, v6, Lhg2;->a:Lfg2;

    .line 298
    .line 299
    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    .line 300
    .line 301
    .line 302
    move-result p1

    .line 303
    if-eqz p1, :cond_1a

    .line 304
    .line 305
    if-eq p1, v5, :cond_14

    .line 306
    .line 307
    if-eq p1, v2, :cond_14

    .line 308
    .line 309
    if-ne p1, v1, :cond_13

    .line 310
    .line 311
    goto :goto_8

    .line 312
    :cond_13
    invoke-static {}, Lc80;->s()V

    .line 313
    .line 314
    .line 315
    goto :goto_7

    .line 316
    :cond_14
    :goto_8
    invoke-virtual {v7, v6}, Ldq1;->T(Lhg2;)Ljava/io/File;

    .line 317
    .line 318
    .line 319
    move-result-object p0

    .line 320
    iget-object p1, v6, Lhg2;->a:Lfg2;

    .line 321
    .line 322
    iget-object v0, v6, Lhg2;->b:Ljava/lang/String;

    .line 323
    .line 324
    invoke-virtual {p0}, Ljava/io/File;->isDirectory()Z

    .line 325
    .line 326
    .line 327
    move-result v1

    .line 328
    if-eqz v1, :cond_19

    .line 329
    .line 330
    invoke-virtual {v7, p1}, Ldq1;->U(Lfg2;)Ljava/io/File;

    .line 331
    .line 332
    .line 333
    move-result-object v1

    .line 334
    invoke-static {v1, p0, v5}, Ldq1;->C(Ljava/io/File;Ljava/io/File;Z)V

    .line 335
    .line 336
    .line 337
    invoke-virtual {p0}, Ljava/io/File;->listFiles()[Ljava/io/File;

    .line 338
    .line 339
    .line 340
    move-result-object p0

    .line 341
    if-eqz p0, :cond_18

    .line 342
    .line 343
    new-instance v1, Lsl0;

    .line 344
    .line 345
    const/16 v2, 0x14

    .line 346
    .line 347
    invoke-direct {v1, v2}, Lsl0;-><init>(I)V

    .line 348
    .line 349
    .line 350
    invoke-static {p0, v1}, Lmg;->r0([Ljava/lang/Object;Ljava/util/Comparator;)Ljava/util/List;

    .line 351
    .line 352
    .line 353
    move-result-object p0

    .line 354
    new-instance v1, Ljava/util/ArrayList;

    .line 355
    .line 356
    const/16 v2, 0xa

    .line 357
    .line 358
    invoke-static {p0, v2}, Leu;->B(Ljava/lang/Iterable;I)I

    .line 359
    .line 360
    .line 361
    move-result v2

    .line 362
    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(I)V

    .line 363
    .line 364
    .line 365
    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 366
    .line 367
    .line 368
    move-result-object p0

    .line 369
    :goto_9
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 370
    .line 371
    .line 372
    move-result v2

    .line 373
    if-eqz v2, :cond_17

    .line 374
    .line 375
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 376
    .line 377
    .line 378
    move-result-object v2

    .line 379
    check-cast v2, Ljava/io/File;

    .line 380
    .line 381
    invoke-virtual {v2}, Ljava/io/File;->toPath()Ljava/nio/file/Path;

    .line 382
    .line 383
    .line 384
    move-result-object v3

    .line 385
    invoke-static {v3}, Ljava/nio/file/Files;->isSymbolicLink(Ljava/nio/file/Path;)Z

    .line 386
    .line 387
    .line 388
    move-result v3

    .line 389
    if-nez v3, :cond_16

    .line 390
    .line 391
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    .line 392
    .line 393
    .line 394
    move-result v3

    .line 395
    if-nez v3, :cond_15

    .line 396
    .line 397
    invoke-virtual {v2}, Ljava/io/File;->getName()Ljava/lang/String;

    .line 398
    .line 399
    .line 400
    move-result-object v3

    .line 401
    goto :goto_a

    .line 402
    :cond_15
    invoke-virtual {v2}, Ljava/io/File;->getName()Ljava/lang/String;

    .line 403
    .line 404
    .line 405
    move-result-object v3

    .line 406
    new-instance v4, Ljava/lang/StringBuilder;

    .line 407
    .line 408
    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    .line 409
    .line 410
    .line 411
    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 412
    .line 413
    .line 414
    const-string v5, "/"

    .line 415
    .line 416
    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 417
    .line 418
    .line 419
    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 420
    .line 421
    .line 422
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 423
    .line 424
    .line 425
    move-result-object v3

    .line 426
    :goto_a
    new-instance v4, Lhg2;

    .line 427
    .line 428
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 429
    .line 430
    .line 431
    invoke-direct {v4, p1, v3}, Lhg2;-><init>(Lfg2;Ljava/lang/String;)V

    .line 432
    .line 433
    .line 434
    invoke-virtual {v7, v4, v2}, Ldq1;->W(Lhg2;Ljava/io/File;)Lgg2;

    .line 435
    .line 436
    .line 437
    move-result-object v2

    .line 438
    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 439
    .line 440
    .line 441
    goto :goto_9

    .line 442
    :cond_16
    const-string p0, "Symbolic links are not supported in script storage."

    .line 443
    .line 444
    invoke-static {p0}, Lc80;->v(Ljava/lang/String;)V

    .line 445
    .line 446
    .line 447
    goto/16 :goto_7

    .line 448
    .line 449
    :cond_17
    move-object p1, v1

    .line 450
    goto :goto_b

    .line 451
    :cond_18
    const-string p0, "Unable to list directory."

    .line 452
    .line 453
    invoke-static {p0}, Lc80;->v(Ljava/lang/String;)V

    .line 454
    .line 455
    .line 456
    goto/16 :goto_7

    .line 457
    .line 458
    :cond_19
    new-instance p0, Ljava/io/FileNotFoundException;

    .line 459
    .line 460
    const-string p1, "Directory does not exist: "

    .line 461
    .line 462
    invoke-virtual {p1, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 463
    .line 464
    .line 465
    move-result-object p1

    .line 466
    invoke-direct {p0, p1}, Ljava/io/FileNotFoundException;-><init>(Ljava/lang/String;)V

    .line 467
    .line 468
    .line 469
    throw p0

    .line 470
    :cond_1a
    iput v5, p0, Log2;->m:I

    .line 471
    .line 472
    invoke-static {v7, v6, p0}, Ldq1;->o(Ldq1;Lhg2;Lu00;)Ljava/lang/Object;

    .line 473
    .line 474
    .line 475
    move-result-object p1

    .line 476
    if-ne p1, v4, :cond_1b

    .line 477
    .line 478
    move-object p1, v4

    .line 479
    :cond_1b
    :goto_b
    return-object p1

    .line 480
    nop

    .line 481
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
